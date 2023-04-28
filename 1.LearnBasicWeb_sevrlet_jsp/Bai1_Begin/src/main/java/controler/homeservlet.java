package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class homeservlet
 */
@WebServlet("/homeservlet")
public class homeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public homeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Mình chạy từ servlet này -> thường thì mk phải chạy từ index trước chứ nhỉ tại vì đã có j mà
		// sử lý -> để chuyển hướng về trang jsp thì ta làm như vầy thôi!
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/index.jsp");
		String name = request.getParameter("name");
		
		String message = "Chào: " + name;
		
		request.setAttribute("message", message);
		
		rd.forward(request, response);
		
		
	}



}
