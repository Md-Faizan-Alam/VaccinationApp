<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Search by District</title>
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
            width: 40vw;
            margin: 60px auto;
            color: white;
            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
            border-radius: 50px;
        }
        #inner{
            background-color: inherit;
            line-height: 40px;
            top: 20px;
            margin: auto;
            position: relative;
            width: 30vw;
            text-align: center;
            font-size: 40px;
        }
        .link{
            text-decoration: none;
            background-color: inherit;
            color: white;
            font-size: 20px;
            padding: 5px 20px;
            margin: 10px;
            border: 2px solid white;
            border-radius: 10px;
        }
        #form{
            background-color: inherit;
            font-size: 25px;
            position: absolute;
            top: 70px;
            left:-10px;
        }
        .fill{
            background-color: white;
            border: none;
            border-radius: 10px;
            padding: 6px;
        }
    </style>
</head>

<body>
    <header>Vaccination Drive</header>
    <div id="advert">
        <div id="inner">District Search
            <form id="form" action="/distList" method="post">
                Enter District Name: <input class="fill" type="text" name="district"><br>
                <input class="link" type="submit" value="Search">
            </form>
        </div>
    </div>
</body>

</html>