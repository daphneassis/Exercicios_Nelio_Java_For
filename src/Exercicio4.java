import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int N= sc.nextInt();
		double divisao;
		for(int i=0;i<N;i++) {
			int A=sc.nextInt();
			int B= sc.nextInt();
			divisao= (double)A/B;
			if(B==0) {
					System.out.println("divisão impossível");
			}else {
				System.out.printf("%.1f", divisao);
			}
		}
		sc.close();					
	}

}
