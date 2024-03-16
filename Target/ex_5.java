import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite: ");
        String entrada = scanner.nextLine();

        String resultado = inverterString(entrada);
        System.out.println("Invertido: " + resultado);

        scanner.close();
    }

    public static String inverterString(String str) {
       
        char[] caracteres = str.toCharArray();

        StringBuilder invertido = new StringBuilder();
   
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertido.append(caracteres[i]);
        }
        return invertido.toString();
    }
    
}
