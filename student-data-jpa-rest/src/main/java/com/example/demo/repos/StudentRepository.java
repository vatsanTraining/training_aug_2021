package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
import java.util.*;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	


	@Query(value = "select * from student where studentName=:studName",nativeQuery = true)
	public List<Student> findByStudentName(@Param("studName") String srchName);
}
