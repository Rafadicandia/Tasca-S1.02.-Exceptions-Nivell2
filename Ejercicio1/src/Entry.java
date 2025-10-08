import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {

    static Scanner sc = new Scanner(System.in);

    public static byte readByte(String mensaje) {
        boolean error = false;
        byte byteUsuario = 0;

        while (!error) {
            System.out.println(mensaje);
            try {
                byteUsuario = sc.nextByte();
                error = true;

            } catch (InputMismatchException e) {
                System.out.println("Format error");
                sc.nextLine();
            }
        }
        return byteUsuario;


    }

    public static int readInt(String mensaje) {
        boolean error = false;
        int intUsuario = 0;

        while (!error) {
            System.out.println(mensaje);
            try {
                intUsuario = sc.nextInt();
                error = true;

            } catch (InputMismatchException e) {
                System.out.println("Format error");
                sc.nextLine();
            }
        }
        return intUsuario;
    }

    public static float readFloat(String mensaje) {
        boolean error = false;
        float floatUsuario = 0;

        while (!error) {
            System.out.println(mensaje);
            try {
                floatUsuario = sc.nextFloat();
                error = true;


            } catch (InputMismatchException e) {
                System.out.println("Format error");
                sc.nextLine();
            }
        }
        return floatUsuario;
    }

    public static double readDouble(String mensaje) {
        boolean error = false;
        double doubleUsuario = 0;

        while (!error) {
            System.out.println(mensaje);
            try {
                doubleUsuario = sc.nextDouble();
                error = true;


            } catch (InputMismatchException e) {
                System.out.println("Format error");
                sc.nextLine();
            }
        }
        return doubleUsuario;
    }

    public static char readChar(String mensaje) {

        while (true) {
            System.out.println(mensaje);
            try {
                String charUsuario = sc.next();

                if (charUsuario.length() > 1) {
                    throw new PersonalizedException("You must type one character");
                }
                return charUsuario.charAt(0);
            } catch (PersonalizedException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static String readString(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                String stringUsuario = sc.nextLine();

                if (stringUsuario.isBlank()) {
                    throw new PersonalizedException("You can't type in blank");
                }

                return stringUsuario;
            } catch (PersonalizedException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static boolean readYesNo(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                String charUsuario = sc.nextLine();
                String normalizado = charUsuario.toUpperCase().trim();
                

                if (!normalizado.equals("S") && !normalizado.equals("N")) {
                    throw new PersonalizedException("You must type in S/N");
                }

                switch (normalizado) {
                    case "S" -> {
                        return true;
                    }
                    case "N" -> {
                        return false;
                    }
                }
            } catch (PersonalizedException e) {
                System.out.println(e.getMessage());

            }
        }

    }


}
