package com.Andika_Training.demo.controller;

import com.Andika_Training.demo.dto.GreetingDto;
import com.Andika_Training.demo.exceptionHandling.ResponseStatus.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping("/rest/v1")
public class RestFullSample {

    private static final HttpStatus NOT_FOUND =HttpStatus.NOT_FOUND ;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public GreetingDto restGet(){
        GreetingDto result=new GreetingDto();

        return result;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public GreetingDto restGetId(@PathVariable(name = "id", value = "") String id){
        GreetingDto result=new GreetingDto(Long.valueOf(id),"restGetId");

        return result;
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public GreetingDto error(){
        GreetingDto result=new GreetingDto();
        if (true) {
            Throwable throwable = new Throwable();

            throw new StudentNotFoundException(throwable);

//            throw new ResponseStatusException(NOT_FOUND, String.format("No resource found for id (%s)", result));
        }
        return result;
    }


    @RequestMapping(value = "", method = RequestMethod.POST)
    public GreetingDto restPost(@Valid @RequestBody GreetingDto greetingDto){
        GreetingDto result=greetingDto;

        return result;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public GreetingDto restPut(@PathVariable(name = "id", value = "") String id,@RequestBody GreetingDto greetingDto){
        GreetingDto result=greetingDto;

        return result;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public GreetingDto restDelete(@PathVariable(name = "id", value = "") String id,@RequestBody GreetingDto greetingDto){
        GreetingDto result=greetingDto;

        return result;
    }


    @GetMapping("/manual")
    void manual(HttpServletResponse response) throws IOException {
        response.setHeader("Custom-Header", "foo");
//        response.setStatus(200);
        response.getWriter().println("Hello World!");
        response.setStatus(490, "hahaha");
    }
}
