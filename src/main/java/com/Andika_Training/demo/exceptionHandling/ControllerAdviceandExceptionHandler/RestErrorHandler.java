package com.Andika_Training.demo.exceptionHandling.ControllerAdviceandExceptionHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;

public class RestErrorHandler {
    Logger logger = LogManager.getLogger(this);

    @ExceptionHandler(ResponseStatusException.class)
    ResponseEntity<?> handleStatusException(ResponseStatusException ex, WebRequest request) {
        logger.error(ex.getReason(), ex);
        return RestResponse.builder()
                .exception(ex)
                .path(request.getDescription(false).substring(4))
                .entity();
    }

//    @ExceptionHandler(GeneralErrorException.class)
//    ResponseEntity<?> handleStatusException(GeneralErrorException ex, WebRequest request) {
//        logger.error(ex.getMessage(), ex);
//        ResponseStatusException responseStatusException= new ResponseStatusException(NOT_FOUND, String.format("No resource found for id (%s)", request));
//
//        return RestResponse.builder()
//                .exception(responseStatusException)
//                .path(request.getDescription(false).substring(4))
//                .entity();
//    }
}
