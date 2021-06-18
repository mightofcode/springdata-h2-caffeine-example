package com.mocyx.springdatah2caffeineexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public interface StudentService {
    public List<Student> getAll();
    public Student findById(Long id);
}
