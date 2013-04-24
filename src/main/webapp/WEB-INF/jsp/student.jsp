<%-- 
    Document   : studentList
    Created on : Oct 4, 2012, 2:22:09 PM
    Author     : gvargas
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <hr />
            Handling time : ${handlingTime} ms
        <br />
        
        
        <form action="delete" method="post">
        <h3>*********************************** </h3>            
            <h3>Delete Student </h3>
           Give me the Student Id
        <input type="text" name="studentId" value="${studentId}" />
        <input type="submit" value="delete" />
        
        </form>
        
        <form action="add" method="post">
        <h3>*********************************** </h3>
            <h3>Add  Student </h3>
            Student Id:   <input type="text" name="studentId"   value="${studentId}" /><br/>
            First Name:   <input type="text" name="firstName"   value="${firstName}" /><br/>
            Last Name:    <input type="text" name="lastName"    value="${lastName}" /><br/>
            Phone Home:   <input type="text" name="phoneHome"   value="${phoneHome}" /><br/>
            Phone Mobile: <input type="text" name="phoneMobile" value="${phoneMobile}" /><br/>
            <input type="submit" value="add" />
        </form>
            
       
        
            <table border="1">
                <tr>
                    <th>Student Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Phone Home</th>
                    <th>Phone Mobile</th>
                </tr>
                <c:forEach items="${studentList}" var="student">
                <tr>
                    <td>${student.studentId}</td>
                    <td>${student.firstName}</td>
                    <td>${student.lastName}</td>
                    <td>${student.phoneHome}</td>
                    <td>${student.phoneMobile}</td>
                                  
                </tr>
                </c:forEach>
            </table>

        
    </body>
</html>
