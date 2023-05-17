import java.util.Locale;
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o 1° parâmetro");
		int parametro1 = sc.nextInt();
		System.out.println("Informe o 2° parâmetro");
		int parametro2 = sc.nextInt();
		
		try {
			contar(parametro1, parametro2);
			
		}catch(ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		sc.close();
	}
	static void contar (int parametroUm,int parametroDois)throws ParametrosInvalidosException {
		if(parametroDois <= parametroUm) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe o 1° parâmetro");
			int parametro1 = sc.nextInt();
			System.out.println("Informe o 2° parâmetro");
			int parametro2 = sc.nextInt();
			
			
		contar(parametro1, parametro2);
		sc.close();
		}
		
			for(int i = parametroUm; i < parametroDois;i++) {
				System.out.println(i + 1);
			}
		}


}
