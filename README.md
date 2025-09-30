<br>

## 📄Descripció - Enunciat de l'exercici

### Exercici 1

Crea una classe anomenada "Entrada". Aquesta classe ha de servir per controlar les diferents excepcions que poden aparèixer en Java a l’hora d’introduir dades per teclat utilitzant la classe Scanner.

El primer que s’ha de fer és instanciar un objecte de la classe Scanner i a partir d’aquí, crear mètodes estàtics per llegir els diferents tipus de dades des del teclat.

Important

És important que si en algun mètode salta una excepció, la tractem i tornem a demanar la dada a l’usuari/ària fins que aquesta estigui ben introduïda. Per exemple: Si introdueix un float amb un punt en lloc d'una coma, ha de mostrar “Error de format”. Fins que l’usuari/ària no introdueix un float ben format ha de seguir demanant la dada.

Tots els mètodes reben un String amb el missatge que es vol mostrar a l’usuari/ària, per exemple: “Introdueix la teva edat”, i retornen la dada oportuna introduïda per l’usuari/ària en cada mètode, per exemple: un byte amb l’edat de l’usuari/ària.

Mètodes a implantar capturant l’excepció de la classe "InputMismatchException":

public static byte llegirByte(String missatge);

public static int llegirInt(String missatge);

public static float llegirFloat(String missatge);

public static double llegirDouble(String missatge);

Mètodes a implantar capturant una excepció personalitzada de la classe Exception:

public static char llegirChar(String missatge);

public static String llegirString(String missatge);

public static boolean llegirSiNo(String missatge), si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari/ària introdueix “n”, retorna “false”.

## 💻Tecnologies Utilitzades

**Java**: 24 (OpenJDK)

## 📋Requisits

- Sistema Operativo: Windows/macOS/Linux.

- **Java Development Kit (JDK):** Versió 24.0.1 (o superior). Es recomana utilitzar una distribució d'**OpenJDK**.

- Ejemplo: JDK 21 o superior.

- Entorno de Desarrollo Integrado (IDE): IntelliJ IDEA.


## 🛠️Instal·lació

- Clonar el Repositorio:

git clone https://github.com/Rafadicandia/Tasca-S1.02.-Exceptions-Nivell2.git

- Configuración del IDE:

Abrir el fichero como un proyecto de Java.


## ▶️Execució

- Ejecutar desde el IDE
    - Abrir el archivo principal (el que contiene el método main).

    - Hacer clic derecho y seleccionar "Run 'Main'".


## 🌐Desplegament

Instruccions per al desplegament del projecte en un entorn de producció o servidor.


## 🤝Contribucions

### Las contribuciones son bienvenidas. Por favor, reporta cualquier error abriendo un issue o sugiere mejoras mediante un Pull Request claro y conciso.
