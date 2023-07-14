<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Single Candidate Details</title>
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
                    <h1>Single Candidate Details</h1>
                    <div class="card-body">


                        <h4> Candidate Id:${candidate_detail.candidate_id} </h4>                       
                        <h4> Name:${candidate_detail.sname} </h4>     
                        <h4> Addhar Id:${candidate_detail.addhar_id} </h4>                       
                        <h4> Mobile no:${candidate_detail.mobile_no} </h4>                       

                        <h4> Age:${candidate_detail.age} </h4>                       
                        <h4> City:${candidate_detail.city} </h4>                       
                        <h4> State:${candidate_detail.state} </h4>                       
                        <h4> Party Name:${candidate_detail.party_name} </h4>                       
                        <h4> Election Id:${candidate_detail.election_id} </h4>             

                    </div>
                        <h4><img width="100" height="100" src="/images/${candidate_detail.party_name}.png"></h4> 

                </div>
            </div>
        </div>
    </body>
</html>










