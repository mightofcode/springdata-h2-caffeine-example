package com.mocyx.springdatah2caffeineexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    @Cacheable(cacheNames="caffeineCache",cacheManager = "cacheManager")
    public List<Student> getAll() {
        List<Student> res=new ArrayList<>();
        Iterable<Student> students=studentRepository.findAll();
        students.forEach(res::add);
        System.out.printf("getAll %d\n",res.size());
        return res;
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.fetchById(id);
    }
}
