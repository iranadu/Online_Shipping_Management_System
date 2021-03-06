<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main page</title>
<link rel="stylesheet" href="layout/styles/layout.css" type="text/css" />
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
        <div class="topbox last">
          <h2>Login Here</h2>
          <form action="login" method="post">
            <fieldset>
              <legend>Login Form</legend>
              <label for="username">User name:
                <input type="text" name="username" id="username" value="" />
              </label><br>
              <label for="userpass">Password:
                <input type="password" name="userpass" id="userpass" value="" />
              </label><br>
              <label for="userRemember">
                <input class="checkbox" type="checkbox" name="userRemember" id="userRemember" checked="checked" />
                Remember me</label>
              <p>
                <input type="submit" name="userlogin" id="userlogin" value="Login" />
                &nbsp;
                <input type="reset" name="userReset" id="userReset" value="Reset" />
              </p>
            </fieldset>
          </form>
        </div>
      </div>
      <br class="clear" />
    </div>
  </div>
  <!-- Web bar -->
  <div class="wrapper col2">
    <div id="topnav">
      <ul>
        <li class="active"><a href="index.jsp">Home</a></li>
        <li><a href="OurServices.jsp">Our Services</a></li>
        <li><a href="User.jsp"> Online Registation</a></li>
        <li><a href="EmployeeMS.jsp"> Employee Management system</a></li>
        <li><a href="WarehouseMS.jsp"> Warehouses Management system</a></li>
        <li><a href="ShipMS.jsp"> Ships Management system</a></li>
        <li class="last"><a href="Join with us.jsp">Join with us</a></li>
      </ul>
    </div>
  </div>
  <!-- Web Body -->
  <div class="wrapper col3">
    <div id="featured_slide">
      <div id="featured_wrap">
        <ul id="featured_tabs">
          <li><a href="#fc1">Custom Clearance <br />
            </a></li>
          <li><a href="#fc2">Sea Fright <br />
            </a></li>
          <li><a href="#fc3">Warehouseing<br />
            </a></li>
          <li class="last"><a href="#fc4">Door to Door Service<br />
            </a></li>
        </ul>
        <div id="featured_content">
          <div class="featured_box" id="fc1"><img src="images/Image0.jpg" width="940" height="290" />
            <div class="floater"><a href="#">Continue Reading &raquo;</a></div>
          </div>
          <div class="featured_box" id="fc2"><img src="images/Image1.jpg" width="940" height="290" />
            <div class="floater"><a href="#">Continue Reading &raquo;</a></div>
          </div>
          <div class="featured_box" id="fc3"><img src="images/Image2.jpg" width="940" height="290" />
            <div class="floater"><a href="#">Continue Reading &raquo;</a></div>
          </div>
          <div class="featured_box" id="fc4"><img src="images/Image3.jpg" width="940" height="290" />
            <div class="floater"><a href="#">Continue Reading &raquo;</a></div>
          </div>
        </div>
      </div>
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
          <li><a href="#">FaceBook </a></li>
          <li><a href="#">Twitter</a></li>
          <li class="last"><a href="#">WhatsApp</a></li>
        </ul>
      </div>
      <br class="clear" />
    </div>
  </div>
  <!-- Web bottom -->
  <div class="wrapper col6">
    <div id="copyright">
      <p class="fl_left">Copyright &copy; 2018 - All Rights Reserved</p>
    </div>
  </div>
  </body>
</html>