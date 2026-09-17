package com.example.project_leap_25cc002_arockia_sterin._s.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository {
    String writeData(String data);
    String readData();
}
