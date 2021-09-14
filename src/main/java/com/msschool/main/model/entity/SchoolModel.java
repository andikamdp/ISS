package com.msschool.main.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(schema = "MS_SCHOOL", name = "TB_SCHOOL_TM", indexes = {@Index(columnList = "name")})
@Entity
@Data
public class SchoolModel {

    @Id
    @Column(name = "ID")
    String id;

    @Column(name = "NAME")
    String name;

    @Column(name = "ADDRESS")
    String address;

    @Column(name = "ESTABLISHED_DATE")
    Date establishedDate;

    @Column(name = "ACCREDITATION")
    String accreditation;

}
