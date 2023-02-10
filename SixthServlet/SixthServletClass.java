import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(urlPatterns="/register")

public class SixthServletClass extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		System.out.println("request type is:"+request.getMethod());
		String userName = request.getParameter("username");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String[] courses=request.getParameterValues("course");
		
		PrintWriter out= response.getWriter();
		out.println("<html><head><title>output</title></head>");
		out.println("<body>");
		out.println("<center>");
		out.println("Student registration details...");
		out.println("<table border='1'>");
		out.println("<tr><th>Name</th><td>"+userName+"</td></tr>");
		out.println("<tr><th>age</th><td>"+age+"</td></tr>");
		out.println("<tr><th>email</th><td>"+email+"</td></tr>");
		out.println("<tr><th>courses</th>");
		String data="";
		for(String co :courses)
			data+=co;
		
		out.println("<td>"+data+"</td></tr>");
		out.println("/table");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
	}
	
	
}
