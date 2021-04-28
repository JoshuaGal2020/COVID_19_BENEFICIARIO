package ayuda.joshua.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ayuda.joshua.DAO.ClsBeneficiario;
import ayuda.joshua.consultas.ClsConsultaDui;
import ayuda.joshua.entidades.persona;

/**
 * Servlet implementation class ControllerBeneficiario
 */
public class ControllerBeneficiario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerBeneficiario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		HttpSession session = request.getSession(true);
		String soyBenef = request.getParameter("SIbeneficiario");
		String noBenef = request.getParameter("NObeneficiario");

		String fullname = "";

		if (soyBenef != null || noBenef != null) {
			response.sendRedirect("index.jsp");
			session.invalidate();
		} else {
			String dui = request.getParameter("dui");
			persona person = new persona();
			person.setDui(dui);
			ClsConsultaDui consultaDUI = new ClsConsultaDui();
			ClsBeneficiario clsBeneficiario = new ClsBeneficiario();

			fullname = clsBeneficiario.MostrarBeneficiario(person);

			int soybeneficiario = consultaDUI.EsBeneficiario(person);

			if (soybeneficiario == 0) {
				response.sendRedirect("NOBeneficiario.jsp");
				session.setAttribute("NOBeneficiario", soybeneficiario);

			} else if (soybeneficiario == 1) {

				response.sendRedirect("SIBeneficiario.jsp");
				session.setAttribute("beneficiario", soybeneficiario);
				session.setAttribute("fullname", fullname);
				System.out.println("Nombre : " + fullname);
			}
		}
	}

}
