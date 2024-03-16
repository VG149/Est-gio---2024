
import java.util.Scanner;
import java.lang.Math;

public class ex_3{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("1) Soma \n2) Multiplicação \n3)Sequencia numeros naturais \n4)Sequencia numeros pares \n5)Fibbonaci");
  int opc = sc.nextInt();

  int n1 = 0;
  int n2 = 0;
  int res;
  switch(opc){
    case 1:
      System.out.println("insira numero: ");
      n1 = sc.nextInt();
      System.out.println("insira quantidade de repeticoes: ");
      n2 = sc.nextInt();
      System.out.println("Sequencia: ");
      for(int i = 0; i < n2;i++){
        res = n1 + n1;
        System.out.println(res);
      }
      break;
      case 2:
      System.out.println("insira numero: ");
      n1 = sc.nextInt();
      System.out.println("insira numero de multiplicação: ");
      int n3 = sc.nextInt();
      System.out.println("insira quantidade de repeticoes: ");
      n2 = sc.nextInt();
      System.out.println("Sequencia: ");
      for(int i = 0; i < n2;i++){
        res = n1 * n3;
        System.out.println(res);
        n1 = res;
      }
      break;
      case 3:

      System.out.println("insira numero expoente: ");
      double nd2 = sc.nextDouble();
      System.out.println("insira quantidade de repeticoes: ");
      n2 = sc.nextInt();
      double nd1 = 0;
      System.out.println("Sequencia: ");
      for(int i = 0; i < n2;i++){
        
        double resd = Math.pow(nd1, nd2);
        System.out.println(resd);
        nd1 = nd1 + 1;
      }
      break;
      case 4:
      
      nd1 = 2;
      System.out.println("insira numero expoente: ");
      nd2 = sc.nextDouble();
      System.out.println("insira quantidade de repeticoes: ");
      n2 = sc.nextInt();
      System.out.println("Sequencia: ");
      for(int i = 0; i < n2;i++){
        
        double resd = Math.pow(nd1, nd2);
        System.out.println(resd);
        nd1 = nd1 + 2;
      }
      break;
      case 5:
      
      System.out.println("insira quantidade de repeticoes: ");
      n2 = sc.nextInt();
      System.out.println("Sequencia: ");
      for(int i = 0; i < n2;i++){
        
        res = fibonacci(i);
        System.out.println(res + " ");
        
      }
      break;

      
  }
  }


public static int fibonacci(int n) {
  if (n <= 1) {
      return n;
  } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
}
