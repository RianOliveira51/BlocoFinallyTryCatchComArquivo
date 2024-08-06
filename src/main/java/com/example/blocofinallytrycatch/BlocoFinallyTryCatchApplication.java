package com.example.blocofinallytrycatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SpringBootApplication
public class BlocoFinallyTryCatchApplication {

    public static void main(String[] args) {
        //definindo um arquivo
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            //percorrendo as linhas do arquivos
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            //mostrando mensagem de erro ao ususario
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if(sc != null){
                sc.close();
                System.out.println("Finally block executed");
            }
        }
    }

}
