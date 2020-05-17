package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppEx {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public AppEx(){
    }
    public void start() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the edge A of the triangle:");
            edgeA = scanner.nextDouble();
            if(edgeA <= 0) throw new IllegalTriangleException();

            System.out.println("Enter the edge B of the triangle:");
            edgeB = scanner.nextDouble();
            if(edgeB <= 0) throw new IllegalTriangleException();

            System.out.println("Enter the edge C of the triangle:");
            edgeC = scanner.nextDouble();
            if(edgeC <= 0) throw new IllegalTriangleException();

            if (
                    edgeA+edgeB <= edgeC ||
                    edgeA+edgeC <= edgeB ||
                    edgeB+edgeC <= edgeA
            )
                throw new IllegalTriangleException();

        }catch(InputMismatchException e){
            throw new IllegalTriangleException();
        }
    }
}
