import java.util.Scanner;
public class MainSuma {
    public static void main(String[]args){
        Scanner opc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int a= opc.nextInt();
        System.out.println("Ingresa otro numero");
        int b= opc.nextInt();
        int r= a+b;
        System.out.println("El resultado de la suma es:"+r);
    }
}
