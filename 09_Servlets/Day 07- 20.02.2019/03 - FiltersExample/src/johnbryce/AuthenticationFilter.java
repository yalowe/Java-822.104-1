package johnbryce;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {

	// The main filter function: 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpSession session = ((HttpServletRequest)request).getSession();
		
		boolean isLoggedIn = false;
		if(session.getAttribute("isLoggedIn") != null) {
			isLoggedIn = (boolean)session.getAttribute("isLoggedIn");
		}
		
		if(!isLoggedIn) {
			((HttpServletResponse)response).setStatus(HttpServletResponse.SC_FORBIDDEN);
			response.getWriter().write("{\"error\": \"Not Logged In\"}");
			return;
		}

		System.out.println("AuthenticationFilter, before the servlet...");
		chain.doFilter(request, response);
		System.out.println("AuthenticationFilter, after the servlet...");
	}

	public void init(FilterConfig fConfig) throws ServletException { }
	public void destroy() { }
}
