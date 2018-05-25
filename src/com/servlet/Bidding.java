package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.user.Cars;

/**
 * Servlet implementation class Bidding
 */
@WebServlet("/Bidding")
public class Bidding extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bidding() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		
		String offerTemp =  request.getParameter("offer");
		int offer = Integer.parseInt(offerTemp);
		Cars car = (Cars) session.getAttribute("car");
		
		
		if(offer < car.getPrice()-(car.getPrice()*.1)) {
			RequestDispatcher rs = request.getRequestDispatcher("Details.jsp");
			rs.forward(request, response);
		}
		else {
			session.setAttribute("offer",offer);
			RequestDispatcher rs = request.getRequestDispatcher("Confirm.jsp");
			rs.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
