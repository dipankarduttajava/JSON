<%@include file="../taglib.jsp"%>
<!doctype html>
<html lang=''>
<head>
<meta charset='utf-8'>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/css/styles.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="/resources/css/bootstrap/bootstrap-theme.min.css">
<link rel="stylesheet" href="/resources/css/bootstrap/jquery.dataTables.min.css">
<link rel="stylesheet" href="/resources/css/bootstrap/datepicker.min.css" />
<link rel="stylesheet" href="/resources/css/bootstrap/datepicker3.min.css" />
<link rel="stylesheet" href="/resources/css/bootstrap/formValidation.min.css">
<script src="/resources/js/bootstrap/jquery-latest.min.js" type="text/javascript"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="/resources/js/bootstrap/bootstrap.min.js"></script>
<script src="/resources/js/bootstrap/jquery.dataTables.min.js"></script>
<script src="/resources/js/bootstrap/bootstrap-datepicker.min.js"></script>
<script src="/resources/js/bootstrap/formValidation.min.js"></script>
<script src="/resources/js/bootstrap/framework/bootstrap.min.js"></script>
<script src="/resources/js/script.js"></script>
<title>
<tiles:getAsString name="title" />
</title>
</head>
<body>
<tilesx:useAttribute name="current" />
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="body" />
<br />
<br />
<tiles:insertAttribute name="footer" />
</body>
</html>