package com.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddPlayerServlet")
public class AddPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	   out.println("<html>");
       out.println("<head>");
       out.println("<title>Add Match Details</title>");
       out.println("<style>");
       out.println("body {");
       out.println("    font-family: Arial, sans-serif;");
       out.println("    background-color: #f0f0f0;");
       out.println("    margin: 0;");
       out.println("    padding: 0;");
       out.println("    display: flex;");
       out.println("    justify-content: center;");
       out.println("    align-items: center;");
       out.println("    height: 100vh;");
       out.println("}");
       out.println(".container {");
       out.println("    background-color: #fff;");
       out.println("    padding: 20px;");
       out.println("    border-radius: 8px;");
       out.println("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);");
       out.println("    max-width: 500px;");
       out.println("    width: 100%;");
       out.println("}");
       out.println("h2 {");
       out.println("    text-align: center;");
       out.println("    color: #333;");
       out.println("}");
       out.println("ul {");
       out.println("    background-color: #ffdddd;");
       out.println("    border: 1px solid #ff8888;");
       out.println("    color: #d8000c;");
       out.println("    padding: 10px;");
       out.println("    list-style-type: none;");
       out.println("    border-radius: 4px;");
       out.println("}");
       out.println("li {");
       out.println("    margin: 5px 0;");
       out.println("}");
       out.println("label {");
       out.println("    display: block;");
       out.println("    margin-bottom: 8px;");
       out.println("    color: #333;");
       out.println("}");
       out.println("input[type='text'], input[type='datetime-local'] {");
       out.println("    width: 100%;");
       out.println("    padding: 10px;");
       out.println("    margin: 8px 0 16px;");
       out.println("    display: inline-block;");
       out.println("    border: 1px solid #ccc;");
       out.println("    border-radius: 4px;");
       out.println("    box-sizing: border-box;");
       out.println("}");
       out.println("input[type='submit'] {");
       out.println("    width: 100%;");
       out.println("    background-color: #4CAF50;");
       out.println("    color: white;");
       out.println("    padding: 14px 20px;");
       out.println("    margin: 8px 0;");
       out.println("    border: none;");
       out.println("    border-radius: 4px;");
       out.println("    cursor: pointer;");
       out.println("}");
       out.println("input[type='submit']:hover {");
       out.println("    background-color: #45a049;");
       out.println("}");
       out.println("</style>");
       out.println("</head>");
       out.println("<body>");
       out.println("<div class='container'>");
	
	out.println("<html> <body>");
	out.println("<center>");
	out.println("<form action='AddPlayerController' method='post' enctype='multipart/form-data'>");
	out.println("Player Name<input type='text' name='name'/> <br>");
	out.println("Age<input type='text' name='age'/> <br>");
	out.println("Profile <input type='file' name='profile'>");
	out.println("<input type='submit'value='Submit'>");
	out.println("</form>");
	out.println("</center>");
	out.println("</body> </html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
