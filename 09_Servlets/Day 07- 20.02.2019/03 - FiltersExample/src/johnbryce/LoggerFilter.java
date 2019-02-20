package johnbryce;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/LoggerFilter")
public class LoggerFilter implements Filter {

	// The main filter function: 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String now = simpleDateFormat.format(date);
		
		String ip = request.getRemoteAddr();
		
		String msg = "Time: " + now + ", IP: " + ip + "\r\n";
		
		try(FileWriter writer = new FileWriter("C:\\Logger\\log.txt", true)) { // true = Append
			writer.write(msg);
		}		
		
		System.out.println("LoggerFilter, before the servlet...");
		chain.doFilter(request, response);
		System.out.println("LoggerFilter, after the servlet...");
	}

	public void init(FilterConfig fConfig) throws ServletException { }
	public void destroy() { }
}













