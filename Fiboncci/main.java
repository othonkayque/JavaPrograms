import java.util.Scanner;

public class main{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String palavra = scanner.next();
		String reverso = "";
			
		for (int i = palavra.length() - 1; i >= 0; i--) {
            reverso += palavra.charAt(i);
        }
		
		System.out.print(reverso);
		
		
		scanner.close();
    }
}
