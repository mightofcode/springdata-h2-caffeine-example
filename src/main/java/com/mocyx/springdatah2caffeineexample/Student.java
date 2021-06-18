package com.mocyx.springdatah2caffeineexample;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="firstName")
    private String firstName;
    private String lastName;
    private Integer score;
}
