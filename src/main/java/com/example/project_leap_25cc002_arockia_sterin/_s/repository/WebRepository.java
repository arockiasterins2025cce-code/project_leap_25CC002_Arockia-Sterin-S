package com.example.project_leap_25cc002_arockia_sterin._s.repository;

import com.example.project_leap_25cc002_arockia_sterin._s.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository extends JpaRepository<Student,Long>{


}
