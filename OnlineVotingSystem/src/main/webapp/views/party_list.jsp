<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Party List</title>
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
                        
                        <form action="/party/view_party_details"  >
                            <div class="form-group">

                                <label for="user_id">Party Id:</label>
                                <input
                                    type="text"
                                    name="party_id"
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
                <h1 style="text-align:center">Party Details List</h1>
             
            </div> 
            
            <table class="table table-striped table-bordered" >
                <thead class="table-dark">
                    <tr>
                        
                        <th> Party Id</th>
                        <th> Name </th>
                        <th> Founded In </th>
                        <th> Party Leader </th>
                        <th>Type</th>
                        <th>Logo</th>
                        <th>Action</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="detail" items="${party_details}">
                        <tr>
                              
                            <td > ${detail.party_id} </td>                    
                            <td > ${detail.party_name} </td>                    
                            <td > ${detail.founded} </td>                    
                            <td > ${detail.party_leader} </td>                    
                            <td > ${detail.type} </td>  
                            <td>  <h4><img width="100" height="100" src="/images/${detail.party_name}.png"></h4> </td>
                            <td>
                                <a href="/party/edit_party_details/${detail.party_id}"
                                class="btn btn-success" > Edit Details </a>
                                
                                <a href='/party/delete_party_details/${detail.party_id}'
                                class="btn btn-danger"> Delete </a>
                            </td>   
                            
                        </tr>
                    </c:forEach>
                  </tbody> 
            </table>

        </div>
    </body>
</html>










