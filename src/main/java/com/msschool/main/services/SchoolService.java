package com.msschool.main.services;

import com.msschool.main.dao.SchoolDao;
import com.msschool.main.model.domain.SchoolDomain;
import com.msschool.main.model.dto.SchoolDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolDao schoolDao;


    public String create(SchoolDto data)  {
        SchoolDomain saveData = this.schoolDao.convertDtoToDomain(data);
        String id = this.schoolDao.create(saveData);
        return id;
    }


    public SchoolDto read(String id) {
        SchoolDomain dataDomain = this.schoolDao.read(id);
        SchoolDto dataDto = this.schoolDao.convertDomainToDto(dataDomain);
        return dataDto;
    }

    public List<SchoolDomain> read() {
        List<SchoolDomain> dataDomain = this.schoolDao.read();
        return dataDomain;
    }


    public String update(SchoolDto data) {
        SchoolDomain updateData = this.schoolDao.convertDtoToDomain(data);
        String id = this.schoolDao.update(updateData);
        return id;
    }


    public void delete(String id) {
        this.schoolDao.delete(id);
    }
}
