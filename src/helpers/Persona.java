/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author pc
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    

 public Persona(){

}

//metodos

public void establecerNombre(String _nombre){
this.nombre=_nombre;
}


public void establecerApellido(String _apellido){
this.apellido=_apellido;

}

public void establecerEdad(int _edad){
this.edad=_edad;
}

public String obtenerNombre(){
return nombre;
}

public String obtenerApellido(){
return apellido;
}

public int obtenerEdad(){
return edad;
}

public void imprimirInfor(){
  System.out.println("Nombre Completo: "+nombre+" "+apellido);
  System.out.println("Edad: "+edad);
}

abstract String getProfesion();
abstract int getExperiencia();
}
