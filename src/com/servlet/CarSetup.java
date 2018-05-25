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
 * Servlet implementation class CarSetup
 */
@WebServlet("/CarSetup")
public class CarSetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarSetup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//car set up make,model,year,price, daysidle, imgpath
		ArrayList<Cars> cars;
		HttpSession session = request.getSession(true);
		cars = (ArrayList<Cars>) session.getAttribute("cars");
		if(cars == null) {
		cars = new ArrayList<Cars>();
		Cars car1 = new Cars("Polaris","Slingshot",2018,19999,false,"photos/Slingshot01.jpg",1);
		Cars car2 = new Cars("Mercedes-Benz","F-015",2030,10000000,false,"photos/Mercedes-Benz-F-015.jpg",2);
		Cars car3 = new Cars("Dodge","Challenger SRT", 2018,95000,false,"photos/2018-Dodge-Challenger-SRT-Demon.jpg",3);
		Cars car4 = new Cars("Ferrari","LaFerrari",2018,1400000,false,"photos/Laferrari.jpg",4);
		Cars car5 = new Cars("Aston-Martin","One-77",2018,140000,false,"photos/aston-martin_One-77.jpg",5);
		Cars car6 = new Cars("Linclon","Futura a.k.a Batmobile",1966,250000,false,"photos/The_Batmobile.png",6);
		Cars car7 = new Cars("Peterbilt","379",1992,150000000,false,"photos/optimus.jpg",7);
		Cars car8 = new Cars("Geo","Metro",1993,1800,true,"photos/Geo.jpg",8);
		Cars car9 = new Cars("Ford","Pinto",1978,8900,true,"photos/ford-pinto.jpg",9);
		Cars car10 = new Cars("Lexus","RX-350",2014,39000,true,"photos/Lexus.jpg",10);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		cars.add(car8);
		cars.add(car9);
		cars.add(car10);
		}
		session.setAttribute("cars", cars);
		RequestDispatcher rs = request.getRequestDispatcher("Inventory.jsp");
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
