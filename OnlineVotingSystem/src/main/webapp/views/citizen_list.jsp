<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Citizen List</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>

         <div class="container">
            <div class="row">
                <div class="justify-content-center card">
              
                    <div class="card-body">
                        
                        <form action="/citizen/view_citizen_details"  >
                            <div class="form-group">

                                <label for="user_id">Citizen Voter Id:</label>
                                <input
                                    type="text"
                                    name="voter_id"
                                    class="form-control">
                                <br>
                                <button type="submit" class="btn btn-primary">
                                    Search
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
         </div>
        
        
        
        <div class="container"> 
            <div class="row"> 
                <br> 
                <h1 style="text-align:center">Citizen Details List</h1>
             
            </div> 
            
            <table class="table table-striped table-bordered" >
                <thead class="table-dark">
                    <tr>
                        <th> Voter Id</th>
                        <th> Citizen Name </th>
                        <th> Mobile No </th>
                        <th> DOB </th>
                        <th> Age</th>
                        <th> Genden</th>
                        <th> City</th>
                        <th> State</th>
                        <th> Status</th>
                        <th> Photo</th>
                        <th> Action</th> 
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="detail" items="${citizen_list}">
                        <tr>
                            
                            <td> ${detail.voter_id} </td>                    
                            <td> ${detail.sname} </td>                    
                            <td> ${detail.mobile_no} </td>                    
                            <td> ${detail.dob} </td>                    
                            <td> ${detail.age} </td>  
                            <td> ${detail.gender}</td>
                            <td> ${detail.city}</td>
                            <td> ${detail.state}</td>
                            <td> ${detail.status}</td>
                            <td>  <h4><img width="100" height="100" src="/images/${detail.voter_id}.png"></h4>   </td>   

                            <td>
                                <a href="/citizen/edit_citizen_details/${detail.voter_id}"
                                class="btn btn-success" > Edit Details </a>
                                
                                <a href='/citizen/delete_citizen_details/${detail.voter_id}'
                            class="btn btn-danger"> Delete </a>
                            </td>
                        
                        </tr>
                    </c:forEach>
                </tbody> 
            </table>


        </div>
    </body>
</html>










