package com.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Cars;

/**
 * Servlet implementation class CheckoutServlet
 */
@WebServlet("/CheckoutServlet")
public class CheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<Cars> cars = (ArrayList<Cars>) session.getAttribute("cars");
		ArrayList<Cars> bought = (ArrayList<Cars>) session.getAttribute("boughtCars");
		Date sellDate = new Date();
		SimpleDateFormat ft = 
			      new SimpleDateFormat ("E yyyy.MM.dd");
		
		int carId = (int) session.getAttribute("carId");
		if(bought == null) {
			bought = new ArrayList<Cars>();
		}
		for(int i = 0; i < cars.size();i++) {
			if(cars.get(i).getCarId() == carId) {
				bought.add(cars.get(i));
				cars.remove(i);
				
			}
		}
		session.setAttribute("cars", cars);
		session.setAttribute("boughtCars", bought);
		session.setAttribute("sellDate", ft.format(sellDate));
		RequestDispatcher rs = request.getRequestDispatcher("TransactionHistory.jsp");
		rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
