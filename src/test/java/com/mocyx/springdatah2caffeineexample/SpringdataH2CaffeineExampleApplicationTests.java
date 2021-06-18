package com.mocyx.springdatah2caffeineexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {SpringdataH2CaffeineExampleApplication.class})
class SpringdataH2CaffeineExampleApplicationTests {


    @Autowired
    StudentService studentService;


    @Test
    void testGetAll() {
        Object res=studentService.getAll();
        System.currentTimeMillis();
    }

    @Test
    void testGetOne() {
        Object res=studentService.findById(1L);
        System.currentTimeMillis();
    }

	@Test
	void contextLoads() {
		System.currentTimeMillis();
	}

}
