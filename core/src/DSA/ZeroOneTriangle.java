/*
 * package DSA;
 * 
 * public class ZeroOneTriangle {
 * 
 * public static void main(String[] args) {
 * 
 * int n=5,num=1; boolean val=true;
 * 
 * for(int i=1;i<=n;i++) {
 * 
 * for(int j=1;j<=i;j++) {
 * 
 * if(val) {
 * 
 * System.out.print(num +"   "); num=0; val=false;
 * 
 * } else {
 * 
 * System.out.print(num +"   "); num=1; val=true;
 * 
 * }
 * 
 * }
 * 
 * if(val) { val=false; } else { val=true; }
 * 
 * System.out.println(); }
 * 
 * }
 * 
 * }
 */
package DSA;

public class ZeroOneTriangle {

	public static void main(String[] args) {

		int n=5,num=1;
		boolean val=true;

		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
			
				if((i+j)%2==0) {
					System.out.print(1+"  ");
				}
				else {
					System.out.print(0+"  ");
				}
				
			}
			System.out.println();
			
		}

	}

}
