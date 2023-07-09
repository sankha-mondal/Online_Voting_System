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
                    <h1> Edit Election Details</h1>
                    <div class="card-body">


                        <form action="/election/save_election_details/${details.election_id}" >
                            <div class="form-group">


                        
                                <h4> Election Id:${details.election_id} </h4>


                                <div class="form-group">

                                    <label>  Description: </label>
                                    <input
                                        type="text"
                                        name="description"
                                        value="${details.description}"
                                        class="form-control"
                                        required
                                        />
                                </div>   


                                <div class="form-group">

                                    <label>  Start Date:</label>
                                    <input
                                        type="text"
                                        name="start_date"     
                                        class="form-control"
                                        required
                                        />
                                </div>   
                                        
                                        
                                 <div class="form-group">

                                    <label>  End Date:</label>
                                    <input
                                        type="text"
                                        name="end_date"  
                                        class="form-control"
                                        required
                                        />
                                </div>          


                                <div class="form-group">

                                    <label> City: </label>
                                    <input
                                        type="text"
                                        name="city"
                                        value="${details.city}"
                                        class="form-control"
                                        required
                                        />
                                </div>   


                                <div class="form-group">

                                    <label> State: </label>
                                    <input
                                        type="text"
                                        name="state"
                                        value="${details.state}"
                                        class="form-control"
                                        required
                                        />
                                </div>   


                                <div class="form-group">

                                    <label> Result: </label>
                                    <input
                                        type="text"
                                        name="result"
                                        value="${details.result}"
                                        class="form-control"
                                        required
                                        />
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










