<%@page import="com.RentManagementSystem.entities.Rentees"%>
<%@page import="com.RentManagementSystem.model.RentyModel"%>
<!--keep the table head name same as of database here-->
<%
Rentees r=new Rentees();
r.setRenteeName(request.getParameter("rentee_name"));
r.setParmanentAddress(request.getParameter("parmanent_address"));
r.setPhoneNo((request.getParameter("phone_no")));
r.setEmail(request.getParameter("email"));
r.setRentDate(request.getParameter("rent_date"));
r.setStatus(Boolean.getBoolean(request.getParameter("status")));//check once might be mistake
r.setRenteeImmidateContactName(request.getParameter("rentee_immidate_contact_name"));
r.setRenteeImmidateContactPhno((request.getParameter("rentee_immidate_contact_phno")));
r.setRenteeInformation(request.getParameter("rentee_information"));
RentyModel re=new RentyModel();
//re.Insert(r);

if (request.getParameter("id")!= "") {
        re.Insert(r);
    } else {
        int id = Integer.parseInt(request.getParameter("rentee_id"));
        r.setRenteeId(id);
        re.Update(r);
    }

response.sendRedirect("index.jsp");
%>