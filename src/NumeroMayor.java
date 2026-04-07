import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n1, n2, n3, mayor;

        System.out.println("Ingresa n1: ");
        n1 = teclado.nextInt();
        
        System.out.println("Ingresa n2: ");
        n2 = teclado.nextInt();
        
        System.out.println("Ingresa n3: ");
        n3 = teclado.nextInt();
        
        
        if( n1 > n2 && n1 > n3){
            mayor = n1;
        }else{
            if(n2 > n3){
                mayor = n2;
            }else{
                mayor = n3;
            }            
        }
        System.out.println("El mayor es: "+ mayor);
        
    }
}
