import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(urlPatterns="/test")

public class FifthServletClass extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		doProcess(request,response);
	}
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		doProcess(request,response);
	}
	public void doProcess(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		System.out.println("Request methos is of type:"+request.getMethod());
		System.out.println("uername:"+request.getParameter("username"));
	}
	
}
