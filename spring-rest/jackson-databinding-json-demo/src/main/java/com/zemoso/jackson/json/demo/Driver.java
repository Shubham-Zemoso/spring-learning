package com.zemoso.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try{
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON  file and map/convert to Java POJO:
            // data/sample-lite.json

            Student theStudent = mapper.readValue(
                    new File("data/sample-full.json"), Student.class);

            // print first name and last name
            System.out.println("First name = " + theStudent.getFirstName());
            System.out.println("Last name = " + theStudent.getLastName());

            // print out address: street and city
            Address tempAddress = theStudent.getAddress();
            System.out.println("street: " + tempAddress.getStreet());
            System.out.println("city: " + tempAddress.getCity());

            //print out languages
            for(String lang: theStudent.getLanguages()) {
                System.out.println(lang);
            }

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
