<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container"> 
            <div class="row"> 
                <h1> ${msg}</h1>
                <br> 
                <h1 style="text-align:center"> Voter List</h1>
             
            </div> 
            
            <table class="table table-striped table-bordered" >
              <thead class="table-dark">
               <tr>
                                      <thead class="table-dark">
                   <th> Voter Id</th>
                   <th> Name </th>
                   <th>Age</th>
                   <th>DOB</th>
                   <th> Mobile number </th>
                   <th> City </th>
                   <th> State </th>
                   <th> Action </th>
               </tr>
                  </thead>
                  <tbody>
                      <c:forEach var="voter" items="${voters_list}">
                          <tr>
                              
                          <td > ${voter.voter_id} </td>                    
                          <td > ${voter.sname} </td>                    
                          <td > ${voter.age} </td>                    
                          <td > ${voter.dob} </td>                    
                          <td > ${voter.mobile_no} </td>                    
                          <td > ${voter.city} </td>                    
                          <td > ${voter.state} </td>                    
                          <td>
                              
                              <a href="/user/get_approval/${voter.voter_id}/${voter.sname}/${voter.age}"
                                  class="btn btn-primary" > Send for Approval</a>
                                  
                                  
                              
                              
                          </td>          
                         </tr>
                      </c:forEach>
                  </tbody> 
                  </table>
        </div>
    </body>
</html>










