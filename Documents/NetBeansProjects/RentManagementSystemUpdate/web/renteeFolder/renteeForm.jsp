
<h2>Add Record of Rentee</h2>
<form role="form" action="SaveRentee.jsp" method="post"> 
    <label>Name:</label>
    <input type="text" class="form-control" name="rentee_name" placeholder="Enter Name of the Rentee">            
    <label>Parmanent Adress:</label>
    <input type="text" class="form-control" name="parmanent_address" placeholder="Enter parmanent address">
    <label>Phone No:</label>
    <input type="text" class="form-control" name="phone_no" placeholder="Enter phoneNo">
     <label>Email:</label>
   <input type="text" class="form-control" name="email" placeholder="Enter Email Address">
     <label>Rent Date:</label>
     <input type="date" class="form-control" name="rent_date" placeholder="Enter the initial rent date">
     <label>status:</label>
     <input type="checkbox" class="form-control" name="status" >
     <label>Immidate contact name:</label>
    <input type="text" class="form-control" name="immidate_contact_name" placeholder="Enter immidate contact person">
     <label>Immidate contact phno:</label>
    <input type="text" class="form-control" name="immidate_contact_phno" placeholder="Enter immidate contact person's phno">
     <label>Rentee Information</label>
    <input type="text" class="form-control" name="rentee_information" placeholder="Enter rentee brief information">
    <br>
    <button type="submit" class="btn btn-default">Submit</button>
</form>  