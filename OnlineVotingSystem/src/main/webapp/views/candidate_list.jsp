<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Candidate List</title>
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
                        <form action="/candidate/view_candidate_details"  >
                            <div class="form-group">

                                <label for="user_id">Candidate Id:</label>
                                <input
                                    type="text"
                                    name="candidate_id"
                                    class="form-control" 
                                    required
                                    />
                            </div>   

                            <div class="box-footer">
                                <button type="submit" class="btn btn-primary">
                                    submit
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
                <h1 style="text-align:center"> Candidate List</h1>

            </div> 

            <table class="table table-striped table-bordered" >
                <thead class="table-dark">
                    <tr>

                        <th> Candidate Id</th>
                        <th>Election Id</th>
                        
                        <th> Name </th>
                        <th>Addhar Id</th>
                        <th>Mobile no</th>
                        <th>Age</th>
                        <th>City</th>
                        <th>State</th>
                        <th>Party Name</th>
                        <th> Logo </th>
                        <th> Action </th>

                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="detail" items="${candidate_details}">
                        <tr>

                        <td> ${detail.candidate_id} </td>                   
                        <td> ${detail.election_id} </td>                       

                        <td> ${detail.sname}</td>     
                        <td> ${detail.addhar_id} </td>                      
                        <td> ${detail.mobile_no} </td>                    
                        <td> ${detail.age} </td>                     
                        <td> ${detail.city} </td>                       
                        <td> ${detail.state} </td>
                        <td> ${detail.party_name} </td>                     
                          <td>  <h4><img width="100" height="100" src="/images/${detail.party_name}.png"></h4>   </td>                       
                         
                        
                          <td>
                              
                              <a href="/candidate/edit_candidate_details/${detail.candidate_id}"
                                  class="btn btn-primary" > Edit Details </a>
                                  
                                  <a href='/candidate/delete_candidate_details/${detail.candidate_id}'
                                  class="btn btn-primary"> Delete </a>
                               
                              
                              
                          </td>
                          
                        
                        
                        </tr>
                    </c:forEach>
                </tbody> 
            </table>
        </div>
    </body>
</html>










