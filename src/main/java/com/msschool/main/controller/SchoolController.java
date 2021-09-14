package com.msschool.main.controller;

import com.msschool.main.model.domain.SchoolDomain;
import com.msschool.main.model.dto.SchoolDto;
import com.msschool.main.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/school/v1")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @PostMapping("/")
    public String createSchool(@RequestBody  SchoolDto requestData) {
       return this.schoolService.create(requestData) ;
    }

    @GetMapping("/{id}")
    public SchoolDto createSchool(@PathVariable(name = "id") String id) {
        return this.schoolService.read(id) ;
    }

    @GetMapping("/")
    public List<SchoolDomain> getSchool() {
        return this.schoolService.read() ;
    }


    @PutMapping("/{id}")
    public String updateSchool(@PathVariable(name = "id") String id, @RequestBody SchoolDto data) {
        return this.schoolService.update(data) ;
    }

    @DeleteMapping("/{id}")
    public void deleteSchool(@PathVariable(name = "id") String id) {
        this.schoolService.delete(id); ;
    }

}
