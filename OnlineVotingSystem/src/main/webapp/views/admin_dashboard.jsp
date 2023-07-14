
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Election Commission of India </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Services</a>
                    </li>

                </ul>
                 <a href="/user/update_password" class="btn btn-outline-success my-2 my-sm-0">Update Password</a>

                <a href="/user/login" class="btn btn-outline-success my-2 my-sm-0">Sign out</a>

             

            </div>>

        </nav>

        <br> <br> <br><br> <br><br> <br>
      
        <div class="d-flex flex-row justify-content-center mt-2">

            <div class="card" style="width: 20%; ">
                <img class="card-img-top" src="/images/interview_list.png" alt="Card image cap">
                <div class="card-body" >

                    <a href="http://localhost:5082/user/add_election" class="btn btn-primary">Add election</a>
                </div>
            </div>

        <br>



            <div class="card" style="width: 20%; ">
                <img class="card-img-top" src="/images/interview_list.png" alt="Card image cap">
                <div class="card-body" >

                    <a href="http://localhost:5082/user/add_party_details" class="btn btn-primary">Add Party</a>
                </div>
            </div>
        </div>

   

           <div class="d-flex flex-row justify-content-center mt-2">
     

            <div class="card" style="width: 20%; ">
                <img class="card-img-top" src="/images/interview_list.png" alt="Card image cap">
                <div class="card-body" >

                    <a href=" http://localhost:5082/user/add_candidate_details" class="btn btn-primary">Add Candidate</a>
                </div>
            </div>


 <div class="card" style="width: 20%; ">
                <img class="card-img-top" src="/images/interview_list.png" alt="Card image cap">
                <div class="card-body" >

                    <a href=" http://localhost:5082/user/voter_approval" class="btn btn-primary">Approval List</a>
                </div>
            </div>

     


     
           </div>
         <div class="d-flex flex-row justify-content-center mt-2">
    

            <div class="card" style="width: 20%; ">
                <img class="card-img-top" src="/images/interview_list.png" alt="Card image cap">
                <div class="card-body" >

                    <a href=" http://localhost:5082/user/new_voter_list" class="btn btn-primary">Voter List</a>
                </div>
            </div>

      
      

            <div class="card" style="width: 20%; ">
                <img class="card-img-top" src="/images/interview_list.png" alt="Card image cap">
                <div class="card-body" >

                    <a href="  http://localhost:5082/user/view_election_list" class="btn btn-primary">View  Election List</a>
                </div>
            </div>

    

         </div>
        
        
         <div class="d-flex flex-row justify-content-center mt-2">
        

            <div class="card" style="width: 20%; ">
                <img class="card-img-top" src="/images/interview_list.png" alt="Card image cap">
                <div class="card-body" >

                    <a href=" http://localhost:5082/user/party_list" class="btn btn-primary">Party Details</a>
                </div>
            </div>

      
        
        
        
            <div class="card" style="width: 20%; ">
                <img class="card-img-top" src="/images/interview_list.png" alt="Card image cap">
                <div class="card-body" >

                    <a href="http://localhost:5082/user/view_candidate_list" class="btn btn-primary">Candidate Details</a>
                </div>
            </div>

        
    </div>
        







    </body>
</html>


