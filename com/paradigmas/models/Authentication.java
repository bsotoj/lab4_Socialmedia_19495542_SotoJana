package com.paradigmas.models;



public interface Authentication {
    boolean register(String nombreUsuario, String contrasegna);
    void login (String nombreUsuario, String constrasegna);
    void logout();
}
