/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo_autonomo1app;

/**
 *
 * @author ALEX BELTRAN
 */
class Vehiculo_Autonomo1 {
    
//Atributos
    private String estaciones;
    private int num_estaciones;
    
    //Constructor
  
public Vehiculo_Autonomo1(String estaciones, int num_estaciones){
 this.estaciones=estaciones;
 
 this.num_estaciones=num_estaciones;

}

//Metodos
public void setEstaciones(String estaciones){
    this.estaciones=estaciones;
}
public String getEstaciones(){
    return estaciones;
}
public void setNum_estaciones(int num_estaciones){
    this.num_estaciones=num_estaciones;
}
public int getNum_estaciones(){
    return num_estaciones;
}

@Override
public String toString(){
    return "El vehículo se detendra en las "+num_estaciones+" estaciones de "+estaciones+".";
}
//clase ejecutable
}

class Vehiculo_Autonomo1App{
    public static void main(String[] args){
         //creamos los objetos
         
         Vehiculo_Autonomo1 Trayectoria1=new Vehiculo_Autonomo1("carga", 2);
         Vehiculo_Autonomo1 Trayectoria2=new Vehiculo_Autonomo1("descarga", 2);

         //mostramos su estado
         System.out.println(Trayectoria1);
         System.out.println(Trayectoria2);
         
    }
}
