package com.ranjith.SPRINGRESTCRUDWITHDB.controlleradvice;

import com.ranjith.SPRINGRESTCRUDWITHDB.EmployeeException.EmployeeException;
import com.ranjith.SPRINGRESTCRUDWITHDB.EmployeeException.EmployeeExceptionImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeControllerAdvice {
    @ExceptionHandler
    public ResponseEntity<EmployeeException> handleException(EmployeeExceptionImpl exception){

//
// createaStudentErrorResponse,
        EmployeeException error=new EmployeeException();
        error.setStatusCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

    }
    @ExceptionHandler
    public ResponseEntity<EmployeeException> handleException(Exception exception){

//
// createaStudentErrorResponse,
        EmployeeException error=new EmployeeException();
        error.setStatusCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

//returnresposneEntit
    }
}
