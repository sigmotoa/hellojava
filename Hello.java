import java.util.Scanner;
class Hello {

public static void main(String[] args) {

Scanner leer = new Scanner(System.in);
System.out.println ("Hello desde Block notas");
String name;
System.out.println("Type your name:");
name = leer.next();
System.out.println(name+" type a number");
int number1 = leer.nextInt();
System.out.println("Type another number");
int number2 = leer.nextInt();
int suma = number1+number2;
int resta = number1-number2;
int multi = number1*number2;
System.out.println(suma+" "+resta+" "+multi);
}
}
