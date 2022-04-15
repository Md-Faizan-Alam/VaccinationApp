<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Centers</title>
<style type="text/css">
        * {
            margin: 0px;
            box-sizing: border-box;
            padding: none;
            background-color: white;
        }

        header {
            background-color: rgb(0, 224, 131);
            height: 80px;
            font-size: 45px;
            text-align: center;
            padding: 10px;
            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
            color: rgb(245, 245, 245);
        }

        #advert {
            background-color: rgb(0, 224, 131);
            width: 60vw;
            padding: 20px;
            margin: 60px auto;
            color: white;
            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
            border-radius: 50px;
        }
        #inner{
            background-color: inherit;
            line-height: 40px;
            top: 20px;
            position: relative;
            width: 40vw;
            text-align: center;
            font-size: 40px;
            margin: auto;
        }
        .link{
            text-decoration: none;
            background-color: rgb(0, 224, 131);
            color: white;
            font-size: 25px;
            padding: 5px 30px;
            border: 2px solid white;
            border-radius: 10px;
            position: relative;
            left: 250px;
        }
        .info{
            background-color: #05d181;
            width: 50vw;
            border: 1px solid white;
            border-radius: 20px;
            font-size: 24px;
            margin: 20px auto;
            padding: 20px;
            line-height: 50px;
        }
    </style>
</head>

<body>
	<header>Vaccination Drive</header>
	<div id="advert">
        <div id="inner">Centers Available</div><br><br><hr>
        <c:forEach items="${centerList}" var="center">
        <div class="info">
            Name : ${center.getName()}<br>
            Address : ${center.getAddress()}<br>
            District : ${center.getDistrict()}<br>
            State : ${center.getState()}<br>
            Pin-code : ${center.getPincode()}<br>
            <a class="link">Register</a>
        </div>
        </c:forEach>
    </div>
</body>
</html>