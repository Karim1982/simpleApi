package com.Student.student.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
@Entity
@Table(name = "students")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",length = 25 )
    private String fullName;
    private String phone;
    private Gender gender;
    private String age;
    private String adress;
    private Data datecreate;
    private Data dateupdate;
}
