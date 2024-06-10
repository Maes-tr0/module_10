package com.example.task2;

import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.*;

public class FileToJSON {
    private final LinkedList<Human> humans = new LinkedList<>();

    public FileToJSON(File file) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(" ");
                humans.add(new Human(tokens[0], Integer.parseInt(tokens[1])));
                line = bufferedReader.readLine();
            }
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/com/example/task2/output/user.json"))) {
                bufferedWriter.write(getResult());
            } catch (IOException ex){
                ex.printStackTrace();
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public String getResult(){
       return new GsonBuilder().setPrettyPrinting().create().toJson(humans);
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(";\n ", "{", "}");
        for (Human h : humans) {
            sj.add(h.toString());
        }
        return sj.toString();
    }
}
