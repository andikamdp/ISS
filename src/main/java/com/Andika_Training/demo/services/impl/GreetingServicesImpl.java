package com.Andika_Training.demo.services.impl;

import com.Andika_Training.demo.exceptionHandling.custom.GeneralErrorException;
import com.Andika_Training.demo.services.IGreetingServices;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GreetingServicesImpl implements IGreetingServices {
    @Override
    public void getResponseStatusException() throws ResponseStatusException {

    }

    @Override
    public void getGeneralErrorException() throws GeneralErrorException {

    }
}
