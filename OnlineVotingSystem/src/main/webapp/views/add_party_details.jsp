<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Add Party Details</title>
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
                    <h1>Add Party Details</h1>
                    <div class="card-body">


                        <form action="/party/save_party_details" method="post" >
                            <div class="form-group">

                                <label>Party Id:</label>
                                <input 
                                    type="text"
                                    name="party_id" 
                                    class="form-control" required 
                                    />
                            </div>   

                            <div class="form-group">

                                <label> Party Name: </label>
                                <input
                                    type="text"
                                    name="party_name"
                                    class="form-control" required 
                                    />
                            </div>  
                            
                               <div class="form-group">

                                <label for="mobile_no"> Founded In: </label>
                                <input
                                    type="text"
                                    name="founded"
                                    class="form-control" required          
                                    />
                            </div>   

                               <div class="form-group">

                                <label for="mobile_no"> Party Leader: </label>
                                <input
                                    type="text"
                                    name="party_leader"
                                    class="form-control" required                                 
                                    />
                            </div>   
                                   
                            <div class="form-group">

                                <label for="mobile_no"> Type: </label>
                                <input
                                    type="text"
                                    name="type"
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










