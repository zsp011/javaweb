package firstWeb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

import javax.activation.MailcapCommandMap;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;
import com.sun.javafx.collections.MappingChange.Map;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class loginServlet  implements Servlet{
	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("����...");
		System.out.println(req);
		//System.out.println(res);
		String user = req.getParameter("user");
		String password = req.getParameter("password");
		System.out.println(user +"," + password);
		
		//String interesting = req.getParameter("interesting");
		//System.out.println(interesting);
		String [] interesting = req.getParameterValues("interesting");
		for(String interest: interesting) {
			System.out.println(interest);
		}
		
		Enumeration<String> names = req.getParameterNames();
		while (names.hasMoreElements()) {
			String name =  names.nextElement();
			String val = req.getParameter(name);
			System.out.println("^^"+name +":"+ val);

		}
		java.util.Map<String, String[]> map =  req.getParameterMap();
		for (java.util.Map.Entry<String, String[]> entry: ((java.util.Map<String, String[]>) map).entrySet()) {
			System.out.println("**"+entry.getKey() +":"+ Arrays.asList(entry.getValue()));
		}
		
		//��ȡ������ص���Ϣ����Ҫʲô��ʲô
		HttpServletRequest httpServletRequest = (HttpServletRequest) req;
		String reqURI = httpServletRequest.getRequestURI();//��ȡ�����URI
		System.out.println(reqURI);
		String method = httpServletRequest.getMethod();
		System.out.println(method);
		//HttpServletRequest��ServletRequest���ӽӿڣ���ȡ����ĸ�����Ϣ
		//get��post����
		
		//ServletResponse��װ����Ӧ��Ϣ,���ڿ��Կ�����Ӧ��
		req.setCharacterEncoding("utf-8");
		//setHeader��HttpServletResponse�еģ�������ServletResponse��
		//HttpServletResponse httpServletResponse = (HttpServletResponse) res;
		((HttpServletResponse) res).setHeader("Content-type", "text/html;charset=UTF-8"); 
		res.setCharacterEncoding("utf-8");
		
		//res.setContentType("application/msword");
		
		//getWriter,����PrintWriter���󣬵��øö����print��������������ӡ�����������ʾ
	    PrintWriter out = res.getWriter();
	    out.println("hello, ����    ��");
	    
	    
	    
		
		
		
		
		}
	
 
}
