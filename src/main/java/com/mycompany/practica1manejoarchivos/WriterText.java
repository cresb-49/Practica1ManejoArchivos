package com.mycompany.practica1manejoarchivos;

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
    
    public void write(String path,Contacto contacto) throws IOException, Exception{
        ReaderText readerText = new ReaderText();
        ArrayList<Contacto> contactos = readerText.getContacts(path);
        for (Contacto contacto1 : contactos) {
            if(contacto1.equals(contacto)){
                throw new Exception("Ya existe este nombre de contato en la agenda");
            }
        }
        contactos.add(contacto);
        //Verificacion de la modificacion del archivo
        //System.out.println(contactos.toString());
        //Conversion a texto plano
        StringBuilder sb = new StringBuilder();
        for (Contacto contacto2 : contactos) {
            sb.append(contacto2.toString()+"\n");
        }
        //System.out.println(sb.toString());
        //Escritura del archivo
        FileWriter fw = new FileWriter(path, false);
        fw.write(sb.toString());
        fw.close();
    }
}
