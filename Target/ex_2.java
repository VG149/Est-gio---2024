import java.util.Scanner;

public class ex_2{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("insira numero: ");
  int numero = sc.nextInt();
  
  if (fibbonacci(numero)){
    System.out.println("Pertence a sequencia Fibbonaci");
  }else{
    System.out.println("Não pertence a sequencia Fibbonaci");
  }
  }
  

public static boolean fibbonacci(int n){
  if (n == 0 || n == 1) {
    return true;
}

int n1 = 0;
int n2 = 1;
int n3;

while (true) {
    n3 = n1 + n2;
    if (n3 == n) {
        return true;
    } else if (n3 > n) {
        return false;
    }
    n1 = n2;
    n2 = n3;
}
}
}

