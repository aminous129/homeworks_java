package java_code_january_24th_2023;

public class for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5-i;j++) {
				System.out.print("");
			}
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
			for (int i=4;i>=1;i--) {
				for (int j=1; j<=5-i;j++) {
					System.out.print("");
				}
				for (int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
	}

}
