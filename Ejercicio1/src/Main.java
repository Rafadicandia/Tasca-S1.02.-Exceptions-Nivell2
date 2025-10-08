public class Main {
    public static void main(String[] args) {


        Entry.readByte("Introduce tu edad");
        Entry.readInt("Introduce tu año de nacimiento");
        Entry.readFloat("Introduce un número con coma");
        Entry.readDouble("Introduce un número con coma");
        Entry.readChar("Introduce un único carácter");
        Entry.readString("Introduce una palabra");
        if (Entry.readYesNo("Te gusta los parsteles? Responde s: sí o n: no")) System.out.println("ok te mola");


    }
}
