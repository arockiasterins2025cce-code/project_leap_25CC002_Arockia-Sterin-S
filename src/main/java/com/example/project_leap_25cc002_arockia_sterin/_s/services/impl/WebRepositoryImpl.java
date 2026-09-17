package com.example.project_leap_25cc002_arockia_sterin._s.services.impl;

import com.example.project_leap_25cc002_arockia_sterin._s.repository.WebRepository;
import org.springframework.stereotype.Repository;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Repository
public class WebRepositoryImpl implements WebRepository {
    @Override
    public String writeData(String data) {

            try {
                FileWriter writer = new FileWriter("data.txt");

                writer.write(data);

                writer.close();

                System.out.println("Data written successfully!");
            }
            catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
            return data;

    }

    @Override
    public String readData() {
        try{
            return Files.readString(Paths.get("data.txt"));
        }catch(IOException e)
        {
            return "Error occured in the system"+e.getLocalizedMessage();
        }

    }
}


