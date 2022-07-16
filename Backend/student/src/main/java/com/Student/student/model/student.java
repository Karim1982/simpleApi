package com.Student.student.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

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
    @CreationTimestamp
    @Column(name = "date_Creation")
    private Date dateCreate;
    @UpdateTimestamp
    @Column(name = "Date_miseAjour")
    private Date dateUpdate;
}
