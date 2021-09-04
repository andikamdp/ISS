package com.Andika_Training.demo.services;

import com.Andika_Training.demo.exceptionHandling.custom.GeneralErrorException;
import org.springframework.web.server.ResponseStatusException;

public interface IGreetingServices {

    void getResponseStatusException() throws ResponseStatusException;
    void getGeneralErrorException() throws GeneralErrorException;
}
