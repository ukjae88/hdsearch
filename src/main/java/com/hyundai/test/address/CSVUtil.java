package com.hyundai.test.address;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVUtil {

    public List<String> readCSV(String csvFile) throws IOException {
        List<String> lines = new ArrayList<>();
        InputStreamReader in = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(csvFile), "UTF-8");
        BufferedReader br = new BufferedReader(in);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

}
