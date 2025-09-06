import java.util.Scanner;

public class PuntoMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del punto A:");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Ingrese las coordenadas del punto B:");
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        System.out.println("Ingrese las coordenadas del punto C:");
        System.out.print("x3: ");
        double x3 = sc.nextDouble();
        System.out.print("y3: ");
        double y3 = sc.nextDouble();

        double ladoAB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double ladoBC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double ladoCA = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        System.out.printf("Lado AB = %.2f\n", ladoAB);
        System.out.printf("Lado BC = %.2f\n", ladoBC);
        System.out.printf("Lado CA = %.2f\n", ladoCA);

        final double EPSILON = 1e-2;
        boolean ab_bc = Math.abs(ladoAB - ladoBC) < EPSILON;
        boolean bc_ca = Math.abs(ladoBC - ladoCA) < EPSILON;
        boolean ca_ab = Math.abs(ladoCA - ladoAB) < EPSILON;

        if (ab_bc && bc_ca) {
            System.out.println("El triángulo es EQUILÁTERO");
        } else if (ab_bc || bc_ca || ca_ab) {
            System.out.println("El triángulo es ISÓSCELES");
        } else {
            System.out.println("El triángulo es ESCALENO");
        }

        sc.close();
    }
}