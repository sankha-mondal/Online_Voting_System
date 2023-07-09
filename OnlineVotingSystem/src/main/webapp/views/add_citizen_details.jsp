<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Add Citizen Details</title>
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
                    <h1> Citizen Details</h1>
                    <div class="card-body">


                        <form action="/citizen/save_citizen_details" method="post" >
                            <div class="form-group">

                                <label>Voter Id:</label>
                                <input 
                                    type="text"
                                    name="voter_id" 
                                    class="form-control" required 
                                    />
                            </div>   

                            <div class="form-group">

                                <label> Citizer Name: </label>
                                <input
                                    type="text"
                                    name="sname"
                                    class="form-control" required 
                                    />
                            </div>  
                            
                            <div class="form-group">

                                <label> Mobile No: </label>
                                <input
                                    type="text"
                                    name="mobile_no"
                                    class="form-control" required          
                                    />
                            </div>   

                            <div class="form-group">

                                <label> DOB: </label>
                                <input
                                    type="date"
                                    name="dob"
                                    class="form-control" required                                 
                                    />
                            </div>   
                                   
                            <div class="form-group">

                                <label> Age: </label>
                                <input
                                    type="number"
                                    name="age"
                                    class="form-control" required 
                                    />
                            </div>   

                            <div class="form-group">

                                <label> Gender: </label>
                                <input
                                    type="text"
                                    name="gender"
                                    class="form-control" required                                 
                                    />
                            </div>

                            <div class="form-group">

                                <label> City: </label>
                                <input
                                    type="text"
                                    name="city"
                                    class="form-control" required                                 
                                    />
                            </div>

                            <div class="form-group">

                                <label> State: </label>
                                <input
                                    type="text"
                                    name="state"
                                    class="form-control" required                                 
                                    />
                            </div>

                            <div class="form-group">

                                <label> Status: </label>
                                <input
                                    type="text"
                                    name="status"
                                    class="form-control" required                                 
                                    />
                            </div>
                            
                            <div class="box-footer">
                                <button type="submit" class="btn btn-primary">
                                    Submit
                                </button>
                            </div>                                        

                        </form>

                    </div>

                </div>
            </div>
        </div>
    </body>
</html>










