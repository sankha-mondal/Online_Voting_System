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
                    <h1 style="text-align:center">  Admin Login </h1>
                    <h1> Enter the information </h1>
                    <div class="card-body">
                        <form action="/user/check_user" method="post" >
                            <div class="form-group">

                                <label for="user_id">user Id:</label>
                                <input
                                    type="text"
                                    name="user_id"
                                    class="form-control"
                                    />
                            </div>   

                           
                            <div class="form-group">

                                <label for="password">Password:</label>
                                <input
                                    type="text"
                                    name="password"

                                    class="form-control"
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









