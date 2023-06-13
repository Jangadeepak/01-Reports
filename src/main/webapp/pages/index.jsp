<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" 
    rel="stylesheet" 
    integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" 
    crossorigin="anonymous">
  </head>
  <body>
  
  <div class="container">
  
    <h1 class="pt-3 pb-3">Report Application</h1>
    
    <form:form action="search" modelAttribute="search" method="Post">
    
    <table>
    
    <tr>
    <td>PlanName:</td>
    <td>
    <form:select path="PlanName">
    <form:option value="">-select</form:option>
    <form:options items="${names}"/>
    
    </form:select>
    </td>
    
    <td>PlanStatus:</td>
    <td>
    <form:select path="PlanStatus">
    <form:option value="">-select</form:option>
    <form:options items="${status}"/>
    
    
    </form:select>
    </td>
    
    <td>Gender:</td>
    <td>
    <form:select path="gender">
    <form:option value="">-select</form:option>
    <form:option value="Male">Male</form:option>
    <form:option value="Fe-Male">Female</form:option>
    
    
    </form:select>
    
    </td>
    </tr>
    <tr>
    <td>Start Date:</td>
    <td>
    <form:input type="date" path="startDate"/>
    </td>
    <td>End Date:</td>
    <td>
    <form:input type="date" path="endDate"/>
    </td>
    </tr>
    <tr>
    <td>
    <a href="/" class="btn btn-secondary">Reset</a>
    <input type="submit" value="Search" class="btn btn-primary"/>
    </td>
    </tr>
    
    
    
    </table>
    
    
    
    
    </form:form>
    
    
    <table class="table table=striped table-hover">
    <thead>
    <tr>
    <th>Sno</th>
    <th>Holder Name</th>
    <th>Gender</th>
    <th>Plan Name</th>
    <th>Plan Status</th>
    <th>Start Date</th>
    <th>End Date</th>
     <th>Benefit Amt</th>
    </tr>
    </thead>
    
    <tbody>
    <c:forEach items="${plan}" var="plan" varStatus="index">
    
    <tr>
    <td>${plan.citizenId}</td>
    <td>${plan.citizenName}</td>
    <td>${plan.gender}</td>
    <td>${plan.planName}</td>
    <td>${plan.planStatus}</td>
    <td>${plan.planStartDate}</td>
    <td>${plan.planEndDate}</td>
    <td>${plan. benefitAmt}</td>
    
    </tr>
    </c:forEach>
    
    <tr>
    <c:if test="${empty plan}">
    <td colspan="8" style="text-align: center">No Records Found</td>
    </c:if>
    </tr>
    
    
    </tbody>
    
    
    </table>
    
    <hr/>
    <hr/>
    Export :<a href="excel">Excel</a> <a href="pdf">Pdf</a>
    
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" 
    crossorigin="anonymous"></script>
  </body>
</html>