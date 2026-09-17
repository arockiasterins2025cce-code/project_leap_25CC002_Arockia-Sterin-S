package com.example.project_leap_25cc002_arockia_sterin._s.services.impl;

import com.example.project_leap_25cc002_arockia_sterin._s.repository.WebRepository;
import com.example.project_leap_25cc002_arockia_sterin._s.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebServiceImpl implements WebService {
    @Autowired
    WebRepository webRepository;

    @Override
    public String writeData(String text) {

        return webRepository.writeData(text);
    }

    @Override
    public String readData() {

        return  webRepository.readData();
    }
}

