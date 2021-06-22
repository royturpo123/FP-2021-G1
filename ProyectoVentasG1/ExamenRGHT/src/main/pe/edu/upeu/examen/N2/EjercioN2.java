package main.pe.edu.upeu.examen.N2;


  import static java.lang.System.out;
  import java.util.Scanner;
  import java.io.*;
  class EjerciN2 {
  
    private static final PrintStream OUT2 = out;

  public static void main(String args []) throws IOException {
    Scanner captura = new Scanner(System.in);
    int n;
    char respuesta;
    do {

     int i=1;
     OUT2.print("Ingrese el numero de la tabla: ");
     n = captura.nextInt();
     while (i<=10) {
     OUT2.println(n + "*" + i + " = " + (n*i));
     i++;
    }

    OUT2.println("Desea ver otra tabla?:PRESIONE (S/N):");
    respuesta = (char)System.in.read();}
    while (respuesta == 's' | respuesta == 'S');
    OUT2.println("exelente");

}
}