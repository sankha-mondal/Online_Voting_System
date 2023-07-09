<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Single Election Details</title>
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
                    <h1> Election Details</h1>
                    <div class="card-body">


                        <form>

                            <div class="form-group">

                                <label>Election ID:</label>
                                <input 
                                    type="text"
                                    name="emp_id" 
                                    class="form-control"
                                    value=${election.election_id}  
                                    readonly
                                    />
                            </div>
                            <div class="form-group">

                                <label>Description:</label>
                                <input 
                                    type="text"
                                    name="emp_id" 
                                    class="form-control"
                                    value=${election.description}  
                                    readonly
                                    />
                            </div>   

                            <div>

                                <label for="id">Start Date:</label>
                                <input 
                                    type="text"
                                    name="emp_id" 
                                    class="form-control"
                                    value=${election.start_date}  
                                    readonly
                                    />
                            </div>   

                                    <div class="form-group">

                                <label>End Date:</label>
                                <input 
                                    type="text"
                                    name="emp_id" 
                                    class="form-control"
                                    value=${election.end_date}  
                                    readonly
                                    />
                            </div>   
                                    
                                    
                                    
                             <div class="form-group">

                                <label>City:</label>
                                <input 
                                    type="text"
                                    name="emp_id" 
                                    class="form-control"
                                    value=${election.city}  
                                    readonly
                                    />
                                
                            </div> 
                                    
                            <div class="form-group">

                                <label>State:</label>
                                <input 
                                    type="text"
                                    name="emp_id" 
                                    class="form-control"
                                    value=${election.state}  
                                    readonly
                                    />
                            </div>   
                            
                                   <div class="form-group">

                                <label for="id">Result:${election.result}</label>
                               
                            </div>   
         





                                                               

                        </form>

                    </div>

                </div>
            </div>
        </div>
    </body>
</html>










