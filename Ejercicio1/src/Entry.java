import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {

    static Scanner sc = new Scanner(System.in);

    public static byte leerByte(String mensaje) {
        boolean error = false;
        byte byteUsuario = 0;

        while (!error) {
            System.out.println(mensaje);
            try {
                byteUsuario = sc.nextByte();
                error = true;
                System.out.println("Has introducido: " + byteUsuario);

            } catch (InputMismatchException e) {
                System.out.println("Error de formato");
                sc.nextLine();
            }
        }
        return byteUsuario;


    }

    public static int leerInt(String mensaje) {
        boolean error = false;
        int intUsuario = 0;

        while (!error) {
            System.out.println(mensaje);
            try {
                intUsuario = sc.nextInt();
                error = true;
                System.out.println("Has introducido: " + intUsuario);

            } catch (InputMismatchException e) {
                System.out.println("Error de formato");
                sc.nextLine();
            }
        }
        return intUsuario;
    }

    public static float leerFloat(String mensaje) {
        boolean error = false;
        float floatUsuario = 0;

        while (!error) {
            System.out.println(mensaje);
            try {
                floatUsuario = sc.nextFloat();
                error = true;
                System.out.println("Has introducido: " + floatUsuario);

            } catch (InputMismatchException e) {
                System.out.println("Error de formato");
                sc.nextLine();
            }
        }
        return floatUsuario;
    }

    public static double leerDouble(String mensaje) {
        boolean error = false;
        double doubleUsuario = 0;

        while (!error) {
            System.out.println(mensaje);
            try {
                doubleUsuario = sc.nextDouble();
                error = true;
                System.out.println("Has introducido: " + doubleUsuario);

            } catch (InputMismatchException e) {
                System.out.println("Error de formato");
                sc.nextLine();
            }
        }
        return doubleUsuario;
    }

    public static char leerChar(String mensaje) {

        while (true) {
            System.out.println(mensaje);
            try {
                String charUsuario = sc.next();
                System.out.println("Has introducido: " + charUsuario);
                if (charUsuario.length() > 1) {
                    throw new personalizedException("Debes introducir un solo carácter");
                }
                return charUsuario.charAt(0);
            } catch (personalizedException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static String leerString(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                String stringUsuario = sc.nextLine();
                System.out.println("Has introducido: " + stringUsuario);
                if (stringUsuario.isBlank()) {
                    throw new personalizedException("debes introducir una linea de texto que no esté vacía");
                }

                return stringUsuario;
            } catch (personalizedException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static boolean leerSiNo(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                String charUsuario = sc.nextLine();
                String normalizado = charUsuario.toUpperCase();
                System.out.println("Has introducido: " + charUsuario);

                if (!normalizado.equals("S") && !normalizado.equals("N")) {
                    throw new personalizedException("Debes introducir un solo carácter: S/N");
                }

                switch (normalizado) {
                    case "S" -> {
                        return true;
                    }
                    case "N" -> {
                        return false;
                    }
                }
            } catch (personalizedException e) {
                System.out.println(e.getMessage());

            }
        }

    }


}
