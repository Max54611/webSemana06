package controlador;
import modelo.Cliente;//Importando al modelo
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SProceso extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request,response); //iniciando nuevo método en modo GET
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response); //iniciando nuevo método en modo POST
	}
	
	//Nuevo método
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//codigo
		String codigo = request.getParameter("txtCodigo");
		Cliente cli=Cliente.busqueda(codigo);
		String vista;
		if(cli==null) {
			vista="error.jsp";
		}else {
			vista="resultados.jsp";
			request.setAttribute("info", cli);
		}
		RequestDispatcher rd=request.getRequestDispatcher(vista);//reconoce a la variable vista como archivo
		rd.forward(request, response);
	}
	
}
