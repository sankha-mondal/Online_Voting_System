<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Add Candidate Details</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="justify-content-center card">
                    <h1 style="text-align:center"> Election Comission of India</h1>
                    <h1> Candidate Details</h1>
                    <div class="card-body">


                        <form action="/candidate/save_candidate_details" method="post" >
                            <div class="form-group">


                                <div class="form-group">

                                    <label> Election Id: </label>
                                    <input
                                        type="text"
                                        name="election_id"
                                        class="form-control"
                                        required
                                        />
                                </div>   



                                <div class="form-group">

                                    <label>  Name: </label>
                                    <input
                                        type="text"
                                        name="candidate_name"
                                        class="form-control"
                                        required
                                        />
                                </div>   


                                <div class="form-group">

                                    <label>  Mobile no: </label>
                                    <input
                                        type="text"
                                        name="mobile_no"
                                        class="form-control"
                                        required
                                        />
                                </div>   


                                <div class="form-group">

                                    <label>  Addhar Id: </label>
                                    <input
                                        type="text"
                                        name="addhar_id"
                                        class="form-control"
                                        required
                                        />
                                </div>   

                                <div class="form-group">

                                    <label> Age: </label>
                                    <input
                                        type="text"
                                        name="age"
                                        class="form-control"
                                        required
                                        />
                                </div>   

                                <div class="form-group">

                                    <label> City: </label>
                                    <input
                                        type="text"
                                        name="city"
                                        class="form-control"
                                        required
                                        />
                                </div>   


                                <div class="form-group">

                                    <label for="employee_name"> State: </label>
                                    <input
                                        type="text"
                                        name="state"
                                        class="form-control"
                                        required
                                        />
                                </div>   


                                <div class="form-group">
                                <label for="party_name"> Party Name: </label>
                                    <select name="party_name">
                                    <c:forEach var="detail" items="${party_details}">
                                        <option><c:out value="${detail}"/></option>
                                    </c:forEach>
                                </select>
                                    
                                </div>   


                                <div class="box-footer">
                                    <button type="submit" class="btn btn-primary">
                                        submit
                                    </button>
                                </div>                                        
                            </div>

                        </form>


                    </div>
                </div>
            </div>
    </body>
</html>










