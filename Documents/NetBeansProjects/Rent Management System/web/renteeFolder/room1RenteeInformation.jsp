<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.RentManagementSystem.entities.Rentees" %>
<%@page import="com.RentManagementSystem.model.RentyModel"%>

<h2>Rentee's information</h2>
        <div class="pull-right">
            <p><a href="#" onclick="addRecordRentee()" class="btn btn-primary">Add Records</a></p>
        </div>
        
    <table  class="table table-bordered table-striped">
        <tr>
            <th>Name</th>
            <th>PhoneNO</th>
            <th>Email</th>
            <th>Parmanent Address</th>
            <th>Rent date</th>
            <th>Status</th>
            <th>Immidate Contact Name</th>
            <th>Immidate contact phno</th>
            <th>Rentee Short Information</th>
        </tr>
        <%
        try {
            for (Rentees r : RentyModel.getAll()) {
        %>
        <tr>
            <td><%=r.getRenteeName() %></td>
              <td><%=r.getPhoneNo()%></td>
              <td><%=r.getEmail()%></td>
            <td><%=r.getParmanentAddress() %></td>
            <td><%=r.getRentDate() %></td>
            <td><%=r.isStatus()%></td>
            <td><%=r.getRenteeImmidateContactName()%></td>
            <td><%=r.getRenteeImmidateContactPhno()%></td>
            <td><%=r.getRenteeInformation()%></td>
            <td>
                <a href="EditRenteeInformation.jsp?id=<%=r.getRenteeId()%>" class="btn btn-success">Edit</a>
                 <a href="deleteRecords.jsp?id=<%=r.getRenteeId()%>"class="btn btn-danger" onclick="return confirm('Are you sure to Delete?')">Delete</a>
            </td>
        </tr>
        <% 
            }
        }catch(Exception e)
                {
                out.println(e.getMessage());
                }
        %>
    </table>
            
    

