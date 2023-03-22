package com.example.demo.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
@Slf4j
public class APIExceptionHandler {
    // Logger can be used within this class
/*
    private final static Logger LOGGER = LoggerFactory.getLogger(APIExceptionHandler.class);
*/

    @ExceptionHandler(value = APIRequestException.class)
    public ResponseEntity<Object> handleAPIRequestException(APIRequestException exception) {

        APIException apiException = new APIException(
                exception.getMessage(),
                exception,
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now()

        );
        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<Object> handleAPIRequestException(NotFoundException exception) {

        APIException apiException = new APIException(
                exception.getMessage(),
                exception,
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now()

        );
        return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
    }


}
