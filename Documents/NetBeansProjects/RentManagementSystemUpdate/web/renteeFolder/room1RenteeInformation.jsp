<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.RentManagementSystem.entities.Rentees" %>
<%@page import="com.RentManagementSystem.model.RentyModel"%>

<h2>Rentee's information</h2>
        <div class="pull-right">
            <p><a href="#" onclick="addRecordRentee()" class="btn btn-primary">Add Records</a></p>
        </div>
        
   <table  class="table table-bordered">
        <%
        try {
            for (Rentees r : RentyModel.getAll()) {
        %>
           <tr>
               <th>Name</th>
               <td><%=r.getRenteeName() %></td>
           </tr>
            <tr>
                <th>PhoneNO</th>
                <td><%=r.getPhoneNo()%></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><%=r.getEmail()%></td>
            </tr>
            <tr><th>Parmanent Address</th><td><%=r.getParmanentAddress() %></td></tr>
            <tr><th>Rent date</th><td><%=r.getRentDate() %></td></tr>
            <tr><th>Status</th><td><%=r.isStatus()%></td></tr>
            <tr><th>Immidate Contact Name</th><td><%=r.getRenteeImmidateContactName()%></td></tr>
            <tr><th>Immidate contact phno</th><td><%=r.getRenteeImmidateContactPhno()%></td></tr>
            <tr><th>Rentee Short Information</th><td><%=r.getRenteeInformation()%></td></tr>
            <tr>
                <th>
                <a href="EditRenteeInformation.jsp?id=<%=r.getRenteeId()%>" class="btn btn-success">Edit</a>
                <a href="DeleteRentee.jsp?id=<%=r.getRenteeId()%>"class="btn btn-danger" onclick="return confirm('Are you sure to Delete?')">Delete</a>
                </th>
            </tr>
        <% 
            }
        }catch(Exception e)
                {
                out.println(e.getMessage());
                }
        %>
    </table>
   
            
    

