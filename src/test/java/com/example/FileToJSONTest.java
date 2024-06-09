package com.example;

import com.example.task2.FileToJSON;

import java.io.File;

public class FileToJSONTest {
    public static void main(String[] args) {
        File filePath = new File("src/main/resources/com/example/task2/input/file.txt");
        FileToJSON fileToJSON = new FileToJSON(filePath);
        System.out.println(fileToJSON.getResult());
         /*Result:

            [
              {
                "name": "alice",
                "age": 21
              },
              {
                "name": "ryan",
                "age": 30
              },
              {
                "name": "oleg",
                "age": 19
              },
              {
                "name": "nikita",
                "age": 23
              },
              {
                "name": "kate",
                "age": 54
              },
              {
                "name": "ivan",
                "age": 43
              },
              {
                "name": "jonne",
                "age": 33
              },
              {
                "name": "maria",
                "age": 25
              },
              {
                "name": "alex",
                "age": 27
              }
            ]

          */
    }
}
