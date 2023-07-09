<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
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
                <div class="justify-content-center card">
                    <h1 style="text-align:center"> Election Comission of India</h1>
                    <h1> Election Details</h1>
                    <div class="card-body">


                        <form action="/election/add_election_details" method="post" >
                            <div class="form-group">

                                <label>Desciption</label>
                                <input 
                                    type="text"
                                    name="description" 
                                    class="form-control"
                                    required
                                    />
                            </div>   

                            <div class="form-group">

                                <label> Start Date: </label>
                                <input
                                    type="date"
                                    name="start_date"
                                    class="form-control"
                                    required
                                    />
                            </div>   
                            
                            
                            
                            <div class="form-group">

                                <label> End Date: </label>
                                <input
                                    type="date"
                                    name="end_date"
                                    class="form-control"
                                    required
                                    />
                            </div>   


                            <div class="form-group">

                                <label> City </label>
                                <input
                                    type="text"
                                    name="city"
                                    class="form-control"
                                    required
                                    />
                            </div>   

                            <div class="form-group">

                                <label> State</label>
                                <input
                                    type="text"
                                    name="state"
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
    </body>
</html>










