package DSA;

public class SolidRhombus {

	public static void main(String[] args) {

		int n=7,m=11;
		
		for(int i=1;i<=n;i++) {
				
				for(int k=1;k<=n-i;k++) {
					System.out.print("     ");
				}
				
				for(int k=1;k<=n;k++) {
					System.out.print("*");
				}
				
			System.out.println();
		}

	}

}
