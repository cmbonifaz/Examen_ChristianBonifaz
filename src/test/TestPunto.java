package test;

import dominio.Punto;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class TestPunto {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cuantos movientos desea realizar?: ");
        int n = 0;
        while (n < 1) {
            n = datos.nextInt();
        }
        Punto[] punto = new Punto[n];
        llenaMovimientos(punto);

    }

    public static void llenaMovimientos(Punto pnt[]) {
        int dirX = 0;
        int dirY = 0;
        double distancia;
        int numMovimiento;
        pnt[0] = new Punto(dirX, dirY);
        System.out.println("Coordenada Inicial");
        System.out.println(pnt[0]);

        for (int i = 0; i < pnt.length; i++) {
            datos.nextLine();
            System.out.println("");
            System.out.println("Ingrese la distancia del movimiento No " + (i + 1));
            numMovimiento = datos.nextInt();
            int valorEntero = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
            switch (valorEntero) {
                case 1:
                    dirX = dirX - numMovimiento;
                    System.out.println("Movimiento hacia la Izquierda");
                    break;
                case 2:
                    dirY = dirY + numMovimiento;
                    System.out.println("Movimiento hacia Arriba");
                    break;
                case 3:
                    dirY = dirY - numMovimiento;
                    System.out.println("Movimiento hacia Abajo");
                    break;
                case 4:
                    dirX = dirX + numMovimiento;
                    System.out.println("Movimiento hacia la Derecha");
                default:
                    break;
            }
            System.out.println("Estas en la coordenada:");
            pnt[i] = new Punto(dirX, dirY);
            System.out.println(pnt[i]);
        }
        distancia = sqrt(pow((dirX), 2) + pow((dirY), 2));
        System.out.printf("La distancia total recorrida es de: %.2f\n", distancia);
    }

}
