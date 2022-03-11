
package helpers;

public class Deportista extends Persona{
    public String disciplina;

public Deportista(){
  establecerNombre("Carlos");
  establecerApellido("Guevara");
  establecerEdad(30);
}

public void establecerDisciplina(String _disciplina){
   this.disciplina=_disciplina;
}
public String obtenerDisciplina(){
return disciplina;
}

    public String getProfesion(){
    return "Deportista";
}
