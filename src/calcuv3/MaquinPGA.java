/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcuv3;

import java.util.Scanner;

/**
 *
 * @author CORE 7
 */
public class MaquinPGA {
    
    float promedio [];
    int horas[];
    int horasA;
    int asignaturas;
    float peso[];
    
    Scanner leer = new Scanner(System.in);
    Float leerDatos(){
    return leer.nextFloat();
}
    public int CArreglo(){//cantidad de asignaturas inscritas
        this.asignaturas=-1;
            while (this.asignaturas <0 || this.asignaturas>7){
            System.out.println("ingrese cantidad de asignaturas");
                
                this.asignaturas=leer.nextInt();
            }
            this.promedio = new float[this.asignaturas];
            return asignaturas;
}
    public void ArregloH(){//llenado de matriz
        
       for (int i = 0; i < asignaturas; i++) {
                while (promedio[i] < 1 || promedio[i]> 7 ){
                System.out.println("ingrese promedio de la asignatura "+(i+1));
                this.promedio[i]= leerDatos();
                }
            }
   }
    public void CHoras(){//arreglo de horas del estudiante
        
        this.horas = new int[this.asignaturas];
        
        this.horasA=0;
        for (int i = 0; i < asignaturas; i++) {
            
           while (this.horas[i]>=0 || this.horas[i]<168){
            System.out.println("ingrese horas semanales de la asignatura "+(i+1));
            this.horas[i]=leer.nextInt();
           }
            
            this.horasA= horas[i]+this.horasA;
        }
        
    }
    
    public void CalculaPeso(){
        
       Calculadora MiCalcu = new Calculadora();
        this.peso= new float [this.asignaturas];
        for (int i = 0; i < asignaturas; i++) {
            
            this.peso[i]=MiCalcu.dividir(horas[i],this.horasA);
            
            
        }
        
            
        }
        
    public void CalcularPGA(){
        float PGA =0;
        for (int i = 0; i < asignaturas; i++) {
             PGA = peso[i]* promedio[i] + PGA; 
        }
        System.out.println("tu PGA es de "+PGA);
}
    }    
    
    


