import java.util.Scanner;

public class main{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        String palavra = scanner.next();
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("String original: " + palavra);
        System.out.println("String invertida: " + palavraInvertida );
		
		scanner.close();
    }
}
