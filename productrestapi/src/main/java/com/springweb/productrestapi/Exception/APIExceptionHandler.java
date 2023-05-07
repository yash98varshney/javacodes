package com.springweb.productrestapi.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class APIExceptionHandler {
    

    @ExceptionHandler(value = {APIRequestException.class})
    public ResponseEntity<Object> handleApiRequstException(APIRequestException e){

        //Create payload containing exception details

        APIException apiex=new APIException(e.getMessage(), HttpStatus.BAD_REQUEST);

        //return ResponseEntity
        return new ResponseEntity<Object>(apiex, HttpStatus.BAD_REQUEST);

    }
}
