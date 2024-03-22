package com.enterpriseja.calculatora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String[] args) {
        try {
            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            Person person = new Person();
            Person person2 = new Person(25,"Jose",1.90F);

            System.out.println("Hola por favor danos los siguientes datos");

            System.out.println("Name:");
            String name = reader.readLine();
            person.setName(name);

            System.out.println("Edad:");
            int edad = Integer.parseInt(reader.readLine());
            person.setAge(edad);

            System.out.println("Altura:");
            float altura = Float.parseFloat(reader.readLine());
            person.setHeight(altura);

            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.getHeight());

            System.out.println("Los datos de la segunda persona son estos:");
            System.out.println(person2.getName());
            System.out.println(person2.getAge());
            System.out.println(person2.getHeight());


            Article art = new Article(2.50F);
            art.setPrice(-1);

        }catch(IOException e){
            System.out.println("Ocurrió un error inesperado leyendo data");
        }catch (PriceException e){
            System.out.println("Ocurrió un error debido a precio debajo de cero");
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }

}
