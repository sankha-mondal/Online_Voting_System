<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Single Citizen Details</title>
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

                        <div>
                            <h4> Voter Id: ${citizen_details.voter_id} </h4>                       
                            <h4> Citizen Name: ${citizen_details.sname} </h4>                       
                            <h4> Mobile No: ${citizen_details.mobile_no} </h4>                       
                            <h4> DOB: ${citizen_details.dob} </h4>                       
                            <h4> Age: ${citizen_details.age} </h4>
                            <h4> Genden: ${citizen_details.gender} </h4>  
                            <h4> City: ${citizen_details.city} </h4>  
                            <h4> State: ${citizen_details.state} </h4>  
                            <h4> Status: ${citizen_details.status} </h4>                         
                        </div>

                    </div>

                </div>
            </div>
        </div>
    </body>
</html>










