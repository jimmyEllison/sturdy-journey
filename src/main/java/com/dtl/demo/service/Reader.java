package com.dtl.demo.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonArray;

public class Reader {

    public static JsonArray getPersons() {
        final String PATH = String.format("./../../../../../../src/resources/persons.json");
        try {
            InputStream inputStream = new FileInputStream(PATH);
            return Json.createReader(inputStream).readArray();
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            return null;
        }
    }

}
