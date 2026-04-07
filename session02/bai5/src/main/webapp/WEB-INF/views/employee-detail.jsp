<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 class="text-center">Chi tiết nhân viên</h1>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Thông tin</th>
            <th>Giá trị</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Mã nhân viên</td>
            <td><c:out value="${employee.id}"/></td>
        </tr>
        <tr>
            <td>Họ tên</td>
            <td><c:out value="${employee.fullName}"/></td>
        </tr>
        <tr>
            <td>Phòng ban</td>
            <td><c:out value="${employee.department}"/></td>
        </tr>
        <tr>
            <td>Lương</td>
            <td><fmt:formatNumber type="currency" currencyCode="VND" value="${employee.salary}"/></td>
        </tr>
        <tr>
            <td>Ngày vào làm</td>
            <td><fmt:formatDate value="${employee.date}" pattern="dd/MM/yyyy"/></td>
        </tr>
        <tr>
            <td>Trạng thái</td>
            <td><c:out value="${employee.status}"/></td>
        </tr>
        </tbody>
    </table>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
