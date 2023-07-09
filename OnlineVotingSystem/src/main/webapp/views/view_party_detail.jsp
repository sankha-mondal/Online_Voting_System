<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Single Party Details</title>
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
                    <h1> Party Details</h1>
                    <div class="card-body">

                        <div>
                            <h4> Party Id:${party_details.party_id} </h4>                       
                            <h4> Party Name:${party_details.party_name} </h4>                       
                            <h4> Party Name:${party_details.founded} </h4>                       
                            <h4> Party Name:${party_details.party_leader} </h4>                       
                            <h4> Party Type:${party_details.type} </h4>                       
                        </div>

                    </div>

                </div>
            </div>
        </div>
    </body>
</html>










