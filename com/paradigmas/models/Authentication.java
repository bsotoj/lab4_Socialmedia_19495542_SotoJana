package com.paradigmas.models;



public interface Authentication {
    boolean register(String nombreUsuario, String contrasegna);
    boolean login (String nombreUsuario, String constrasegna);
    void logout();
}
