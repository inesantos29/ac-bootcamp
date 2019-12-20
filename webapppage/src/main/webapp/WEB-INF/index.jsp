
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Hello Spring MVC</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>

<div class="wrapper">
    <div class="row">
        <div class="column">
            <div class="photo">

            </div>
        </div>
        <div class="column">
            <div class="info">
                <div class="text">
                    <h4>Master Coder</h4>
                    <p><i class="fa fa-home"></i>
                        ${customer.name}
                    </p>
                    <p>
                        <i class="fa fa-phone"></i>
                        +351 93 382 3478
                    </p>
                    <p>
                        <i class="fa fa-envelope"></i>
                        ${customer.email}
                    </p>
                </div>
                <div class="social">
                    <a class="button button4 "href="https://www.linkedin.com/">
                        <button class="button button4">
                            <i class="fa fa-linkedin"></i>
                            Linkedin
                        </button>
                    </a>
                    <a class="button button4 "href="https://www.linkedin.com/">
                        <button class="button button4">
                            <i class="fa fa-github"></i>
                            GitHub
                        </button>
                    </a>
                    <a class="button button4 "href="https://www.linkedin.com/">
                        <button class="button button4">
                            <i class="fa fa-twitter"></i>
                            Twitter
                        </button>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>