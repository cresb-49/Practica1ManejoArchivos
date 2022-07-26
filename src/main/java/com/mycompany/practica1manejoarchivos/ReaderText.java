/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class ReaderText {
    
    public ReaderText(){
    }
    
    public ArrayList<String> read(String path) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File(path));
        ArrayList<String> array = new ArrayList<>();
        while (scanner.hasNextLine()) {            
            array.add(scanner.nextLine());
        }
        scanner.close();
        return array;
    }
    
    public ArrayList<Contacto> getContacts(String path) throws FileNotFoundException{
        ArrayList<String> result = this.read(path);
        ArrayList<Contacto> contactos = new ArrayList<>();
        for (String string : result) {
            String results[] = string.split("\\|");
            contactos.add(new Contacto(results[0], results[1], results[2], results[3]));
        }
        return contactos;
    }
    
}
