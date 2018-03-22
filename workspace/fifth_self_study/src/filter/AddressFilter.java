package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AddressFilter implements Filter {
	private FilterConfig filterConfig = null;
	private String addressProhibited = null;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		this.filterConfig = null;
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//获取客户端IP地址
		String address = ((HttpServletRequest)request).getRemoteAddr();
		
		if(address.equals(addressProhibited)){
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>这个地址禁止访问</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 align=center>这个地址禁止访问</h1>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			
			return;	//结束当前方法，不调用后续的过滤器链或web资源
			
		}
		//调用后续的过滤器链（如果没有后续的过滤器就访问web资源）
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;
		
		//读取配置文件中的参数
		addressProhibited = filterConfig.getInitParameter("addressProhibited");
	}
}
