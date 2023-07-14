<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Edit Party Details</title>
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
                    <h1> Edit Party Details</h1>
                    <div class="card-body">


                        <form action="/party/update_details/${details.party_id}" >
                            <div class="form-group">

                                <div class="form-group">
                                    <h4> Party Id:${details.party_id} </h4>
                                </div>

                                <div class="form-group">
                                    <label> Party Name: </label>
                                    <input
                                        type="text"
                                        name="party_name"
                                        value="${details.party_name}"
                                        class="form-control"
                                        required
                                        />
                                </div>   

                                <div class="form-group">
                                    <label> Founded no: </label>
                                    <input
                                        type="text"
                                        name="founded"
                                        value="${details.founded}"
                                        class="form-control"
                                        required
                                        />
                                </div>   
                                
                                <div class="form-group">
                                    <label> Party Leader: </label>
                                    <input
                                        type="text"
                                        name="party_leader"
                                        value="${details.party_leader}"
                                        class="form-control"
                                        required
                                        />
                                </div>

                                <div class="form-group">
                                    <label> Type: </label>
                                    <input
                                        type="text"
                                        name="type"
                                        value="${details.type}"
                                        class="form-control"
                                        required
                                        />
                                </div>

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










