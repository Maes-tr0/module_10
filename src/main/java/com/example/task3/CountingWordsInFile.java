package com.example.task3;

import java.io.*;
import java.util.*;

public class CountingWordsInFile {
    private final LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

    public CountingWordsInFile(File file) {
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().replaceAll("\\s+", " ").split(" ");
                for (String word : words) {
                    if(result.containsKey(word)) {
                        result.put(word, result.get(word) + 1);
                    } else {
                        result.put(word, 1);
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public LinkedHashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : result.keySet()) {
            sb.append(word).append(": ").append(result.get(word)).append("\n");
        }
        return sb.toString();
    }
}
