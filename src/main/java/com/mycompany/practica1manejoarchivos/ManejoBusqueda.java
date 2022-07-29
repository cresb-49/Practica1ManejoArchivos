package com.mycompany.practica1manejoarchivos;

import java.io.FileNotFoundException;

public class ManejoBusqueda {
    public ManejoBusqueda(){
        
    }
    
    public Contacto BusquedaNombre(String texto,String path) throws FileNotFoundException{
        var reader = new ReaderText();
        var contactos = reader.getContacts(path);
        for (Contacto contacto : contactos) {
            if(contacto.nombre.equals(texto)){
                return contacto;
            }
        }
        return null;
    }
    
    public Contacto BusquedaNumero(String texto,String path) throws FileNotFoundException{
        var reader = new ReaderText();
        var contactos = reader.getContacts(path);
        for (Contacto contacto : contactos) {
            if(contacto.numero.equals(texto)){
                return contacto;
            }
        }
        return null;
    }
    
    public Contacto BusquedaRed(String texto,String path) throws FileNotFoundException{
        var reader = new ReaderText();
        var contactos = reader.getContacts(path);
        for (Contacto contacto : contactos) {
            if(contacto.red1.equals(texto)){
                return contacto;
            }else if(contacto.red2.equals(texto)){
                return contacto;
            }
        }
        return null;
    }
}
