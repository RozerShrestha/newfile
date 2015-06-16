<%@page import="com.RentManagementSystem.model.RentyModel"%>

<%
    RentyModel.Delete(Integer.parseInt(request.getParameter("id")));
    response.sendRedirect("index.jsp");
    %>