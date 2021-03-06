<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
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
        
        <li ><a href="User.jsp"> Online Registation</a></li>
        <li class="active"><a href="EmployeeMS.jsp"> Employee Management system</a></li>
        <li><a href="WarehouseMS.jsp"> Warehouses Management system</a></li>
        <li><a href="ShipMS.jsp"> Ships Management system</a></li>
        <li class="last"><a href="Join with us.jsp">Join with us</a></li>
      </ul>
    </div>
  </div>
  <!-- Web Body -->
  <div class="wrapper col4">
  <div id="container">
  		<ul>
        <li><a href="Employee.jsp" >Enter Employee Details</a></li>
        <li><a href="Emp_view.jsp" >View Employee Details</a></li>
        <li><a href="Emp_M.jsp" >Modify Employee Details</a></li>
        <li><a href="Emp_Del.jsp" >Delete Employee Details</a></li>
        </ul>
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