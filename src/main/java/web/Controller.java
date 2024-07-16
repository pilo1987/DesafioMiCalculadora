package web;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int numero1 = Integer.parseInt(request.getParameter("numero1"));
		int numero2 = Integer.parseInt(request.getParameter("numero2"));
		String seleccion = request.getParameter("seleccion");
		String resultado = "";

		switch (seleccion) {
		case "suma":
			resultado = String.valueOf(numero1 + numero2);
			break;

		case "resta":
			resultado = String.valueOf(numero1 - numero2);
			break;

		case "multiplicacion":
			resultado = String.valueOf(numero1 * numero2);
			break;

		case "division":
			if (numero2 != 0) {
				resultado = String.valueOf(numero1 / numero2);
			} else {
				System.out.println("No se puede dividir por cero");
			}
			break;

		case "ordenar":
			int[] numerosOrdenados = { numero1, numero2 };
			if (numero1 == numero2) {
				resultado = "Ambos números son iguales ";
			} else {
				Arrays.sort(numerosOrdenados);
				resultado = numerosOrdenados[0] + ", " + numerosOrdenados[1];
			}
			break;

		case "parImpar":
			String parImparNumero1 = (numero1 % 2 == 0) ? "Par" : "Impar";
			String parImparNumero2 = (numero2 % 2 == 0) ? "Par" : "Impar";
			resultado = "Número 1 es " + parImparNumero1 + " y Número 2 es " + parImparNumero2;
			break;
		}
		request.setAttribute("resultadoOperacion", resultado);
		request.getRequestDispatcher("/ejecucion.jsp").forward(request, response);
	}

}
