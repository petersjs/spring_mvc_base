<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<head>
    <title>Goals Report</title>
</head>
<body>

<table>
    <tr>
        <th>Goal Minutes</th>
        <th>Exercise Minutes</th>
        <th>Activity</th>
    </tr>

    <c:forEach items="${goalReports}" var="goal">
        <tr>
            <td>${goal.goalMinutes}</td>
            <td>${goal.exerciseMinutes}</td>
            <td>${goal.exerciseActivity}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
