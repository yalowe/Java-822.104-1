package johnbryce;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/BlackListFilter")
public class BlackListFilter implements Filter {

	private ArrayList<String> blackList = new ArrayList<>();

	public void init(FilterConfig fConfig) throws ServletException { 
		blackList.add("180.23.54.89");
		blackList.add("250.98.164.52");
		blackList.add("174.25.36.85");
		// blackList.add("0:0:0:0:0:0:0:1");
	}

	// The main filter function: 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		String currentIP = request.getRemoteAddr();	

		for (String blackIP : blackList) {
			if(currentIP.equals(blackIP)) {
				((HttpServletResponse)response).sendRedirect("https://www.google.com/?q=bob");
			}
		}
		
		System.out.println("BlackListFilter, before the servlet...");
		chain.doFilter(request, response);
		System.out.println("BlackListFilter, after the servlet...");
	}

	public void destroy() { }
}
