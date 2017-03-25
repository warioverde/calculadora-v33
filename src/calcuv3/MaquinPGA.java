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
    
    int promedio [];
    int horas[];
    int asignaturas;
    int peso[];
    
    Scanner leer = new Scanner(System.in);
    int leerDatos(){
    return leer.nextInt();
}
    public int CArreglo(){//cantidad de asignaturas inscritas
            System.out.println("ingrese cantidad de asignaturas");
            this.asignaturas=leerDatos();
            this.promedio = new int[this.asignaturas];
            return asignaturas;
}
    public void ArregloH(){//llenado de matriz
        
       for (int i = 0; i < asignaturas; i++) {
                System.out.println("ingrese promedio de la asignatura "+(i+1));
                this.promedio[i]= leerDatos();
            }
   }
    public int CHoras(){//arreglo de horas del estudiante
        this.horas = new int[this.asignaturas];
        int Acumulador=0;
        for (int i = 0; i < asignaturas; i++) {
            System.out.println("ingrese horas semanales de la asignatura "+i+1);
            this.horas[i]=leerDatos();
            
            Acumulador= horas[i]+Acumulador;
        }
        return Acumulador;
    }
    
    public void CalculaPeso(){
        
       Calculadora MiCalcu = new Calculadora();
        this.peso= new int [this.asignaturas];
        for (int i = 0; i < asignaturas; i++) {
            this.peso[i]=MiCalcu.dividir(horas[i],CHoras());
            
            
        }
        
            
        }
        
    public float CalcularPGA(){
        float PGA =0;
        for (int i = 0; i < asignaturas; i++) {
             PGA = peso[i]* promedio[i] + PGA; 
        }
    return PGA ;
}
    }    
    
    


