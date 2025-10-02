import java.io.PrintStream;
import java.util.Scanner;

public class TestShape {

    static Scanner keyboard = new Scanner(System.in);
    static PrintStream screen = System.out;

    public static void main(String[] args) {

        int a = 0, n = 1, k = 0, id;
        float xCoordinate, yCoordinate;
        float side1, side2, side3;
        double radio1, radio2;
        ShapeList shapelist = new ShapeList();

        while (a == 0) {
            try {
                screen.println("----------Escoja la accion a realizar----------\n");
                screen.println(
                        "1- Crear una nueva figura\n2- Consultar las figuras creadas\n3- Consultar una figura especifica");
                screen.println("4- Consultar el area y perimetro de todas las figuras\n5- Salir del programa");
                int action = keyboard.nextInt();

                switch (action) {
                    case 1 -> {
                        screen.println("-----Escoja la figura a crear-----\n");
                        screen.println("1- Cuadrado\n2- Rectangulo\n3- Triangulo\n4- Circulo\n5- Ovalo");
                        int shape = keyboard.nextInt();
                        screen.println("Ingrese el Id de la figura");
                        id = keyboard.nextInt();
                        screen.println("Ingrese la coordenada x");
                        xCoordinate = keyboard.nextFloat();
                        screen.println("Ingrese la coordenada y");
                        yCoordinate = keyboard.nextFloat();
                        k++;
                        switch (shape) {
                            case 1 -> {
                                screen.print("Ingrese las dimensiones del cuadrado\nLado: ");
                                side1 = keyboard.nextFloat();
                                while (side1 <= 0) {
                                    screen.println("Las dimensiones ingresadas no son validas");
                                    side1 = keyboard.nextFloat();
                                }
                                Square square = new Square(id, xCoordinate, yCoordinate, side1);
                                screen.println("El cuadrado ha sido creado");
                                shapelist.addShape(square);
                            }
                            case 2 -> {
                                screen.print("Ingrese las dimensiones del rectangulo\nBase: ");
                                side1 = keyboard.nextFloat();
                                while (side1 <= 0) {
                                    screen.println("Las dimensiones ingresadas no son validas");
                                    side1 = keyboard.nextFloat();
                                }
                                screen.print("Altura: ");
                                side2 = keyboard.nextFloat();
                                while (side2 <= 0) {
                                    screen.println("Las dimensiones ingresadas no son validas");
                                    side2 = keyboard.nextFloat();
                                }
                                Rectangle rectangle = new Rectangle(id, xCoordinate, yCoordinate, side1, side2);
                                screen.println("El rectangulo ha sido creado");
                                shapelist.addShape(rectangle);
                            }
                            case 3 -> {
                                screen.print("Ingrese las dimensiones del Triangulo\nLado 1: ");
                                side1 = keyboard.nextFloat();
                                while (side1 <= 0) {
                                    screen.println("Las dimensiones ingresadas no son validas");
                                    side1 = keyboard.nextFloat();
                                }
                                screen.print("Lado 2: ");
                                side2 = keyboard.nextFloat();
                                while (side2 <= 0) {
                                    screen.println("Las dimensiones ingresadas no son validas");
                                    side2 = keyboard.nextFloat();
                                }
                                screen.print("Lado 3: ");
                                side3 = keyboard.nextFloat();
                                while (side3 <= 0) {
                                    screen.println("Las dimensiones ingresadas no son validas");
                                    side3 = keyboard.nextFloat();
                                }
                                Triangle triangle = new Triangle(id, xCoordinate, yCoordinate, side1, side2, side3);
                                screen.println("El triangulo ha sido creado");
                                shapelist.addShape(triangle);
                            }
                            case 4 -> {
                                screen.print("Ingrese las dimensiones del circulo\nRadio: ");
                                radio1 = keyboard.nextDouble();
                                while (radio1 <= 0) {
                                    screen.println("Las dimensiones ingresadas no son validas");
                                    radio1 = keyboard.nextDouble();
                                }
                                Circle circle = new Circle(id, xCoordinate, yCoordinate, radio1);
                                screen.println("El circulo ha sido creado");
                                shapelist.addShape(circle);
                            }
                            case 5 -> {
                                screen.print("Ingrese las dimensiones del ovalo\nRadio mayor: ");
                                radio1 = keyboard.nextDouble();
                                while (radio1 <= 0) {
                                    screen.println("Las dimensiones ingresadas no son validas");
                                    radio1 = keyboard.nextDouble();
                                }
                                screen.print("Radio menor: ");
                                radio2 = keyboard.nextDouble();
                                while (radio2 <= 0) {
                                    screen.println("Las dimensiones ingresadas no son validas");
                                    radio2 = keyboard.nextDouble();
                                }
                                Oval oval = new Oval(id, xCoordinate, yCoordinate, radio1, radio2);
                                screen.println("El ovalo ha sido creado");
                                shapelist.addShape(oval);
                            }
                            default -> {
                                screen.println("No es una opcion valida, vuelva a escojer");
                            }
                        }
                    }
                    case 2 -> {
                        if (k == 0) {
                            System.out.println("Aun no hay figuras creadas");
                        } else {
                            screen.println("-----Informacion de las figuras creadas-----");
                            for (Shape shape : shapelist.getShapeList()) {
                                screen.println("Figura " + n);
                                screen.println("Tipo de figura: " + shape.getShapeType());
                                screen.println("Id: " + shape.getId() + "\nCoordenadas: (" + shape.getX() + "," + shape.getY() + ")");
                                screen.println("Dimensiones: " + shape.getDimensions());
                                screen.println("Area: " + shape.getArea() + "\nPerimetro: " + shape.getPerimeter()
                                        + "\n-----------------");
                                n++;
                            }
                        }
                    }
                    case 3 -> {
                        if (k == 0) {
                            System.out.println("Aun no hay figuras creadas");
                        } else {
                            screen.println("-----Ingrese el Id de la figura-----");
                            int num = keyboard.nextInt();
                            if (shapelist.findById(num) != null) {
                                Shape shape = shapelist.findById(num);
                                screen.println("-----Informacion-----");
                                screen.println("Figura: " + shape.getShapeType());
                                screen.println("Id: " + shape.getId() + "\nCoordenadas: (" + shape.getX() + "," + shape.getY() + ")");
                                screen.println("Dimensiones: " + shape.getDimensions());
                                screen.println("Area: " + shape.getArea() + "\nPerimetro: " + shape.getPerimeter());

                            } else {
                                screen.println("No existe figura con esa Id");
                            }
                        }

                    }
                    case 4 -> {
                        if (k == 0) {
                            System.out.println("Aun no hay figuras creadas");
                        } else {
                            screen.println("-----Area y perimetro total-----");
                            screen.println("Area total de la figura/s: " + shapelist.getAreaShapes());
                            screen.println("Perimetro total de las figura/s: " + shapelist.getPerimeterShapes());
                        }

                    }
                    case 5 -> {
                        screen.println("Ha decidido salir del programa, vuelva pronto");
                        a = 1;
                    }
                    default -> {
                        screen.println("No es una opcion valida, vuelva a escojer");
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: ingrese un número válido.");
                keyboard.nextLine();
            }
        }
    }
}
