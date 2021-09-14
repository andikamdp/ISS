package com.msschool.main.dao.repository;


import com.msschool.main.model.entity.SchoolModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepo extends JpaRepository<SchoolModel,String> {
}
