/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatan
 */
class calculadora {
        
        
         int sumar(int num1, int num2){
        return num1 + num2;
    } 
         int restar(int num1 , int num2){
             return num1-num2;
         }
         int multiplicar(int num1 , int num2){
             return num1*num2;
         }
         int dividir(int num1 , int num2){
             return num1/num2;
         }
         void mostrar(){
             System.out.println(dividir(1,1));
             System.out.println(sumar(1,2));
             System.out.println(restar(1,5));
             System.out.println(dividir(1,7));
         }
}
