package DSA;

public class HoloRectangle {

	public static void main(String[] args) {

		int n=4,m=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				
				if(i==1 && j<=m) {
					System.out.print("*");
				}
				else if(i==2 && j==1||j==5|| i==3 && j==1||j==5) {
					System.out.print("*");
				}
				else if(i==4 && j<=m) {
					System.out.print("*");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		//or
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				
				if(i==1  ||  j==1  ||  i==n  ||  j==m) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
