<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
  <meta name="description" content="">
  <meta name="author" content="Chao Li">
    <script src="./js/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="./js/ie10-viewport-bug-workaround.js"></script>

  <title>Papaya | A URL Shortener</title>

  <!-- Bootstrap core CSS -->
  <!-- Latest compiled and minified CSS -->
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

  <!-- Custom styles for this template -->
  <link href="./css/cover.css" rel="stylesheet">

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>

<body>
<div class="site-wrapper">
  <div class="site-wrapper-inner">
    <div class="cover-container">
      <div class="masthead clearfix">
        <div class="inner">
          <img name="icon" src="img/papaya.png" width="100" height="42"/>
        </div>
      </div>
      <div class="inner cover">
        <h1 class="cover-heading">Make the World Simpler.</h1>
        <div class="col-lg-6">
            <form action="/shorten" method="post">
                <div class="input-group input-group-lg">
                    <input type="text" class="form-control" placeholder="Paste a link to shorten it" name="url" />
                    <span class="input-group-btn">
                        <button class="btn btn-lg btn-success" type="submit">Shorten</button>
                    </span>
                </div>
            </form>
        </div>
      </div>
      <div class="mastfoot">        <div class="inner">
          <p>Created by Chao Li</p>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>
