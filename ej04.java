import java.util.Scanner;
public class ej04 {
    public static void main(String[] args) {
        System.out.println("Que numeros quieres sumar");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println( + numero + " +");
        int numeros2 = sc.nextInt();
        int resultado = numero + numeros2;
        System.out.println("El resultado es= "+resultado);
    }
}