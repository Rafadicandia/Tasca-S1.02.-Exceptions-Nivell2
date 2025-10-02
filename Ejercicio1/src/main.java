/*
        public static byte leerByte(String mensaje);
        public static int leerInt(String mensaje);
        public static float leerFloat(String mensaje);
        public static double leerDouble(String mensaje);
        public static char leerChar(String mensaje);
        public static String leerString(String mensaje);
        public static boolean leerSiNo(String mensaje), si el usuario introduce “s”, devuelve “true”, si el usuario introduce “n”, devuelve “false”.
*/

public class main {
    public static void main(String[] args) {

        Entry entrada1 = new Entry();

       //entrada1.leerByte("Introduce tu edad");
       //entrada1.leerInt("Introduce tu año de nacimiento");
       //entrada1.leerFloat("Introduce un número con coma");
      // entrada1.leerDouble("Introduce un número con coma");
       //entrada1.leerChar("Introduce un único carácter");
       //entrada1.leerString("Introduce una palabra");
       if (entrada1.leerSiNo("Te gusta los parsteles? Responde s: sí o n: no")) System.out.println("ok te mola");






    }
}
