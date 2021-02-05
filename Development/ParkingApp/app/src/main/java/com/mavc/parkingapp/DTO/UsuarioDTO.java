package com.mavc.parkingapp.DTO;

import androidx.annotation.NonNull;

public class UsuarioDTO {
    private Integer id_usuario;
    private String nick;
    private String nombre;
    private String email;
    private String contrasena;
    private String estado;

    public  UsuarioDTO() {
    }

    public UsuarioDTO(Integer id_usuario, String nick, String nombre, String email, String contrasena, String estado) {
        this.id_usuario = id_usuario;
        this.nick = nick;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @NonNull
    @Override
    public String toString() {
        return id_usuario + " - " + nick+ " - " + nombre+ " - " + email+ " - " + contrasena+ " - " + estado;
    }
}
