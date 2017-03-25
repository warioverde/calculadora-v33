
public class Calculadora {
        
        
        public int sumar(int num1, int num2){
        return num1 + num2;
         } 
        public int restar(int num1 , int num2){
             return num1-num2;
         }
        public  int multiplicar(int num1 , int num2){
             return num1*num2;
         }
        public  int dividir(int num1 , int num2){
             return num1/num2;
         }
        public void mostrar(){
             System.out.println(dividir(1,1));
             System.out.println(sumar(1,2));
             System.out.println(restar(1,5));
             System.out.println(dividir(1,7));
         }
}
