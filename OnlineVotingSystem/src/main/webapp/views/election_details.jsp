<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Election List</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container"> 
            <div class="row"> 
                <br> 
                <h1 style="text-align:center"> Election List</h1>
             
            </div> 
            
            <table class="table table-striped table-bordered" >
                   <thead class="table-dark">
               <tr>
                   
                   <th> Election Id</th>
                   <th> Description </th>
                   <th> Start Date</th>
                   <th> End Date</th>
                   <th>City</th>
                   <th> State</th>
                   <th> Action </th>
               </tr>
                  </thead>
                  <tbody>
                      <c:forEach var="election" items="${election_details}">
                          <tr>
                              
                          <td > ${election.election_id} </td>                    
                          <td > ${election.description} </td>                    
                          <td > ${election.start_date} </td>                 
                          <td > ${election.end_date} </td>  
                          <td > ${election.city} </td>                    
                          <td > ${election.state} </td>                    
                                                                                       
                          <td>
                              
                            <a href="/election/view_election_result/${election.election_id}"
                                  class="btn btn-primary" > View Result</a>
                                  
                            <a href="/election/edit_election_details/${election.election_id}"
                                  class="btn btn-primary" > Edit Details</a>
                                  
                            <a href="/election/delete_election_details/${election.election_id}"
                                  class="btn btn-primary" > Delete</a>
                                     
                                  
                              
                              
                          </td>          
                         </tr>
                      </c:forEach>
                  </tbody> 
                  </table>
        </div>
    </body>
</html>










