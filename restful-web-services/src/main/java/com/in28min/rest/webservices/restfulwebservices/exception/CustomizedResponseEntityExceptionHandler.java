package com.in28min.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.in28min.rest.webservices.restfulwebservices.user.UserNotFoundException;


//custom error details structure
//creating our own handle to handle MVC exception 

@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetails> handleAllException(Exception ex, WebRequest request) throws Exception{
		ErrorDetails errordetails =new ErrorDetails(LocalDate.now(),
														ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(errordetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<ErrorDetails> handleUserNotFoundException(Exception ex,WebRequest request) throws Exception{
		ErrorDetails errordetails =new ErrorDetails(LocalDate.now(),
				ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(errordetails,HttpStatus.NOT_FOUND);
	}
	
	
	//For Validation we have override this method this will tell what exception we are getting
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request){
		ErrorDetails errordetails =new ErrorDetails(LocalDate.now(),
				ex.getFieldError().getDefaultMessage(),request.getDescription(false));
		
		
		
		return new ResponseEntity(errordetails,HttpStatus.BAD_REQUEST);
	}
}
