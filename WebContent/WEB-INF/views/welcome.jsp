<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
</head>
<body>
  ${requestScope.user.userName}登录成功！  <br><br>
  
  <a href="${pageContext.request.contextPath}/user/userlist">
      查看用户列表</a> <br>
 
</body>
</html>