<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="layout/styles/layout.css" type="text/css" />
<title></title>
</head>
<body>
 <!-- Web header -->
  <div class="wrapper col1">
    <div id="header">
      <div id="logo">
        <h1 align="center">RS3 Cargo Shipping Company</h1>
        <p align="center">Online Cargo Shipping Management System</p>
      </div>
      <div class="fl_right">
        <ul>
          <li class="last"><a href="#">Search</a></li>
          <li><a href="#">Online Support</a></li>
        </ul>
        <p>Tel: +94 11 0123123| Mail: info@RS3shipping.com</p>
        <input type="text" placeholder="Search..">
        <input type="submit" name="news_go" id="news_go" value="GO" />
      </div>
      <br class="clear" />
    </div>
  </div>
  <!-- Web bar -->
  <div class="wrapper col2">
    <div id="topnav">
      <ul>
        <li ><a href="index.jsp">Home</a></li>
        <li><a href="OurServices.jsp">Our Services</a></li>
        
        <li><a href="User.jsp"> Online Registration</a></li>
        <li><a href="EmployeeMS.jsp"> Employee Management system</a></li>
        <li><a href="WarehouseMS.jsp"> Warehouses Management system</a></li>
        <li><a href="ShipMS.jsp"> Ships Management system</a></li>
        <li class="last" class="active"><a href="Join with us.jsp">Join with us</a></li>
      </ul>
    </div>
  </div>
  <!-- Web Body -->
<div class="wrapper col4">
  <div id="container">
  <h4>The following job vacancy is available within COMPANY. Qualified and eligible individuals interested in applying for this position may submit an application to Human Resources throught online by or before 01-06-2018.</h4>
  <ul>
      <li>Logistics Specialist.</li>
      <li>Warehouse Manager</li>
      <li>Senior Superviser</li>
    </ul>
  <h2>Employment Application</h2>
 
  <table border="0" cellpadding="5" cellspacing="0">
  <tr>
  <td style="width:50%">
  <b>First name *</b><br />
  <input name="First_Name" type="text" maxlength="50" style="width:260px" />
  </td>
  <td style="width:50%">
  <b>Last name *</b><br />
  <input name="Last_Name" type="text" maxlength="50" style="width:260px" />
  </td>
  </tr>
  <tr>
  <td colspan="2">
  <b>Email *</b><br />
  <input name="Email_Address" type="text" maxlength="100" style="width:535px" />
  </td>
  </tr>
  <tr>
  <td colspan="2">
  <b>Position you are applying for *</b><br />
  <input name="Position" type="text" maxlength="100" style="width:535px" />
  </td>
  </tr>
  <tr>
  <td style="width:50%">
  <b>Salary requirements</b><br />
  <input name="Salary" type="text" maxlength="50" style="width:260px" />
  </td>
  <td style="width:50%">
  <b>When can you start?</b><br />
  <input name="StartDate" type="text" maxlength="50" style="width:260px" />
  </td>
  </tr>
  <tr>
  <td style="width:50%">
  <b>Phone *</b><br />
  <input name="Phone" type="text" maxlength="50" style="width:260px" />
  </td>
  <td style="width:50%">
  <b>Fax</b><br />
  <input name="Fax" type="text" maxlength="50" style="width:260px" />
  </td>
  </tr>
  <tr>
  <td colspan="2">
  <b>Are you willing to relocate?</b><br />
  <input name="Relocate" type="radio" value="Yes" checked="checked" /> Yes &nbsp; &nbsp; &nbsp;
  <input name="Relocate" type="radio" value="No" /> No &nbsp; &nbsp; &nbsp;
  <input name="Relocate" type="radio" value="NotSure" /> Not sure
  </td>
  </tr>
  <tr>
  <td colspan="2">
  <b>Last company you worked for</b><br />
  <input name="Organization" type="text" maxlength="100" style="width:535px" />
  </td>
  </tr>
  <tr>
  <td colspan="2">
  <b>Reference / Comments / Questions</b><br />
  <textarea name="Reference" rows="7" cols="40" style="width:535px"></textarea>
  </td>
  </tr>
  </table>
  <br />
  <div style="text-align:center;">
  <input name="skip_Submit" type="submit" value="Send Application" />
  </div>
  </form>
  
  
  
  </div>
  </div>
  <!-- Web footer -->
  <div class="wrapper col5">
    <div id="footer">
      <div id="newsletter">
        <h2>Stay In The Know !</h2>
        <p>Please enter your email to join our mailing list</p>
        <form action="#" method="post">
          <fieldset>
            <legend>News Letter</legend>
            <input type="text" value="Enter Email Here&hellip;"  onfocus="this.value=(this.value=='Enter Email Here&hellip;')? '' : this.value ;" />
            <input type="submit" name="news_go" id="news_go" value="GO" />
          </fieldset>
        </form>
      </div>
      <div class="footbox">
        <h2>Contact Us</h2>
        <ul>
          <li><a href="#">Facebook </a></li>
          <li><a href="#">Twitter</a></li>
          <li class="last"><a href="#">Whatsapp</a></li>
        </ul>
      </div>
      <br class="clear" />
    </div>
  </div>
  <!-- Web bottem -->
  <div class="wrapper col6">
    <div id="copyright">
      <p class="fl_left">Copyright &copy; 2018 - All Rights Reserved</p>
    </div>
  </div>
</body>
</html>