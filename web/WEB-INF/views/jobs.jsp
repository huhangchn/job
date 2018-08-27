<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/27 0027
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%pageContext.setAttribute("WEB_PATH", request.getContextPath()); %>
<html>
<head>
    <title>工作职位</title>
    <script type="text/javascript" src="${WEB_PATH }/static/js/jquery-1.12.4.min.js"></script>
    <script src="${WEB_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <link href="${WEB_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <table class="table table-hover">
        <div class="row">
            <div class="col-md-12">
                <h1>职位列表</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover">
                    <tr>
                        <th>jobId</th>
                        <th>companyId</th>
                        <th>jobName</th>
                        <th>pubTime</th>
                        <th>location</th>
                        <th>salary</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${pageInfo.list }" var="job">
                        <tr>
                            <td>${job.jobId }</td>
                            <td>${job.companyId}</td>
                            <td>${job.jobName }</td>
                            <td>
                                <fmt:formatDate value="${job.pubTime }" pattern="yyyy-MM-dd HH:mm:ss" />
                            </td>
                            <td>${job.location }</td>
                            <td>${job.salary}</td>
                            <td>
                                <button class="btn btn-primary">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                    查看
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </table>
</div>
</body>
</html>
