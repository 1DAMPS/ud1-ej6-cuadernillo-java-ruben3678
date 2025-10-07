import java.util.Scanner;
public class ej13 {
    public static void main(String[] args) {
        System.out.println("¿Cuanto cobras al año?");
        Scanner sc = new Scanner(System.in);
        int sueldo = sc.nextInt();
        double IRPF = 0.15;
        double sueldoNeto= sueldo * IRPF;
        System.out.println("Este es tu sueldo al mes " +sueldoNeto );
}
}