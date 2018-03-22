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
		//��ȡ�ͻ���IP��ַ
		String address = ((HttpServletRequest)request).getRemoteAddr();
		
		if(address.equals(addressProhibited)){
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>�����ַ��ֹ����</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 align=center>�����ַ��ֹ����</h1>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			
			return;	//������ǰ�����������ú����Ĺ���������web��Դ
			
		}
		//���ú����Ĺ������������û�к����Ĺ������ͷ���web��Դ��
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;
		
		//��ȡ�����ļ��еĲ���
		addressProhibited = filterConfig.getInitParameter("addressProhibited");
	}
}
