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

  <!-- Page Heading -->
  <div class="d-sm-flex align-items-center justify-content-between mb-4">
    <h1 class="h1 mb-0 text-gray-800">UsersCrud</h1>
    <a href="http://localhost:8080/user/add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
            class="fas fa-download fa-sm text-white-50"></i>Add user</a>
  </div>
    <!-- DataTales Example -->
    <div class="card shadow mb-4">
      <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">User list</h6>
      </div>
      <div class="card-body">
        <div class="table-responsive">
          <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
            <thead>
            <tr>
              <th>Id</th>
              <th>User name</th>
              <th>User email</th>
              <th>Action</th>
            </tr>
            <c:forEach items="${users}" var="user">
              <tr>
                <td>${user.getId()}</td>
                <td>${user.getUserName()}</td>
                <td>${user.getEmail()}</td>
                <td><a href="http://localhost:8080/user/delete?id=${user.getId()}">Delete</a> <a href="http://localhost:8080/user/edit?id=${user.getId()}">Edit</a>
                <a href="http://localhost:8080/user/show?id=${user.getId()}">Show</a>
                </td>
              </tr>
            </c:forEach>
            </thead>
            </tbody>
          </table>
  <%@include file="/jsp/footer.jsp"%>

</body>

</html>
