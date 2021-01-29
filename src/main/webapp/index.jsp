<%--
  Created by IntelliJ IDEA.
  User: pzs
  Date: 2021/1/27
  Time: 10:32
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // 转发到根页面,转发的根目录是contextPath
    request.getRequestDispatcher("/index/index").forward(request, response);
%>
