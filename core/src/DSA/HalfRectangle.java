package DSA;

public class HalfRectangle {

	public static void main(String[] args) {
	
		int n=4,m=4;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				
				if(i<=n && j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//or
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
					System.out.print("*");
					
			}
			System.out.println();
		}

	}

}
