/*package DSA;

public class FullPyramidOfNumber {

	public static void main(String[] args) {
		
		int n=5,m=9,k=5;
		
		for(int i=1;i<=n;i++) {
			
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
					}
				
				for(int j=n-i+1;j<=k;j++) {
					
					if((i+j)%2==0) {
						System.out.print(i);
					}
					else {
						System.out.print("  ");		
					}
					
				}	
				
				k=k+1;
				System.out.println();
			}
		}
	}
	*/

package DSA;

public class FullPyramidOfNumber {

	public static void main(String[] args) {
		
		int n=5;;
		
		for(int i=1;i<=n;i++) {
			
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
					}
				
				for(int j=1;j<=i;j++) {
					System.out.print(i+"  ");
				}	
				System.out.println();
			}
		}
	}





