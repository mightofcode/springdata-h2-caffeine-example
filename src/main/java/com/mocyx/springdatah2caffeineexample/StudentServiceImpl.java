package com.mocyx.springdatah2caffeineexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        List<Student> res=new ArrayList<>();
        Iterable<Student> students=studentRepository.findAll();
        students.forEach(res::add);
        return res;
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.fetchById(id);
    }
}
