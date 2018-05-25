package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Cars;

/**
 * Servlet implementation class CarDetails
 */
@WebServlet("/CarDetails")
public class CarDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(true);
		ArrayList<Cars> cars = (ArrayList<Cars>) session.getAttribute("cars");
		String iD = request.getParameter("carId");
		int carId = Integer.parseInt(iD);
		Cars carDetails;
		for(Cars car: cars) {
			if(car.getCarId()==carId) {
				carDetails= car;
				session.setAttribute("car",carDetails);
			}
		}
		

		session.setAttribute("carId", carId);
		RequestDispatcher rs = request.getRequestDispatcher("Details.jsp");
		rs.forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
