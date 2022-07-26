package com.mycompany.practica1manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class WriterText {

    public WriterText(){
        
    }
    
    public void write(String path,Contacto contacto) throws FileNotFoundException, IOException{
        ReaderText readerText = new ReaderText();
        var contactos = readerText.getContacts(path);
        System.out.println(contactos.toString());
    }
}
