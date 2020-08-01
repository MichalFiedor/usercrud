<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin 2 - Dashboard</title>

  <!-- Custom fonts for this template-->
  <link href="../src/main/webapp/them/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="<c:url value="/theme/css/sb-admin-2.css"/>" rel="stylesheet">
</head>

<body id="page-top">

  <%@include file="/jsp/header.jsp"%>


  <form method="post">
    <div class="form-group">
      <label for="name">Nazwa</label>
      <input type="text" class="form-control" id="name" name="name" placeholder="Nazwa użytkownika">
    </div>
    <div class="form-group">
      <label for="email">Email</label>
      <input type="text" class="form-control" id="email" name="email" placeholder="Email użytkownika">
    </div>
    <div class="form-group">
      <label for="password">Hasło</label>
      <input type="password" class="form-control" id="password" name="password" placeholder="Hasło użytkownika">
    </div>
    <button type="submit" class="btn btn-primary">Zapisz</button>
  </form>

  <%@include file="/jsp/footer.jsp"%>

</body>

</html>