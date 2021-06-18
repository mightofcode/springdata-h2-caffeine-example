package com.mocyx.springdatah2caffeineexample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query("SELECT f FROM Student f WHERE f.id = (:id)")
    Student fetchById(@Param("id") Long id);
}
