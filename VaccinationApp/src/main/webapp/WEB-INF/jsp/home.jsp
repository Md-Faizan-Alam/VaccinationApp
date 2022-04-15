<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Home</title>
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
           height: 300px;
           width: 60vw;
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
           text-align: center;
           text-decoration: none;
           background-color: inherit;
           color: white;
           font-size: 25px;
           padding: 5px 20px;
           margin: 10px auto;
           width: 250px;
           border: 2px solid white;
           border-radius: 10px;
           position: relative;
           top: 50px;
           display: block;
       }
   </style>
</head>

<body>
    <header>Vaccination Drive</header>
    <div id="advert">
        <div id="inner">
            Find your nearest Vaccination Centre
        </div>
        <a  class="link" href="/allCenters">View All</a>
        <a class="link" href="/findByDistrict">Find by District</a>
        <a  class="link" href="/findByPincode">Find by Pincode</a>
    </div>
</body>

</html>