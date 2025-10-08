public class Main {
    public static void main(String[] args) {


        Entry.leerByte("Introduce tu edad");
        Entry.leerInt("Introduce tu año de nacimiento");
        Entry.leerFloat("Introduce un número con coma");
        Entry.leerDouble("Introduce un número con coma");
        Entry.leerChar("Introduce un único carácter");
        Entry.leerString("Introduce una palabra");
        if (Entry.leerSiNo("Te gusta los parsteles? Responde s: sí o n: no")) System.out.println("ok te mola");


    }
}
