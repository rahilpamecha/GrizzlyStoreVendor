<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login Admin</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
 <style>
       #login_store_logo{
    width: 40rem;
}
#login_input{
    border:0;
    width:15rem;
    border-radius:4rem;
}
.round {
    position: relative;
  }
  
  .round label {
    background-color: #fff;
    border: 2px solid rgb(129, 129, 129);
    border-radius: 50%;
    cursor: pointer;
    height: 20px;
    left: 0;
    position: absolute;
    top: 0;
    width: 20px;
  }
  
  .round label:after {
    border: 2px solid #fff;
    border-top: none;
    border-right: none;
    content: "";
    height: 6px;
    left: 2px;
    opacity: 0;
    position: absolute;
    top: 3px;
    transform: rotate(-45deg);
    width: 12px;
  }
  
  .round input[type="checkbox"] {
    visibility: hidden;
  }
  
  .round input[type="checkbox"]:checked + label {
    background-color: #000000;
    border-color: #000000;
  }
  
  .round input[type="checkbox"]:checked + label:after {
    opacity: 1;
  }
   </style>
</head>

<body>
    <div class="container text-center">
        <img src="images/grizzly-store.jpg" alt="Grizzly Store" id="login_store_logo" class="mt-5">
        <hr>
         <form method="get" action="loginvendor">
        <input type="text" class="bg-light form-control mx-auto" placeholder="Username" name="vendor" id="login_input">
         <input type="text" class="bg-light form-control mx-auto" placeholder="Password" name="password" id="login_input">
        <button class="btn btn-secondary my-3" style="border-radius:4rem;width:6rem;" type="submit">Login</button>
        </form>
        ${status}
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
        integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
        integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
        crossorigin="anonymous"></script>
</body>

</html>