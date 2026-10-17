/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mirel
 */
public class Usuario {
    protected int id;
    protected String username;
    protected String rol;

    //GET-SET Importante tener cada atributo por separado para el generador de codigo
    public int getId() {        return id;    }
    public void setId(int id) {        this.id = id;    }
    public String getUsername() {        return username;    }
    public void setUsername(String username) {        this.username = username;    }
    public String getRol() {        return rol;    }
    public void setRol(String rol) {        this.rol = rol;    }
    
    //CONSTRUCTOR
    public Usuario(int id, String username, String rol) {
        this.id = id;
        this.username = username;
        this.rol = rol;
    }
}
