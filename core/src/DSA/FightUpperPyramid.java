package DSA;

public class FightUpperPyramid {

	public static void main(String[] args) {
		
		int n=4,m=4;
		
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");
			}
			
			for(int j=n-i+1;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//or
		
for(int i=1;i<=n;i++) {
			//space
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");
			}
			//star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	//number pyramid

for(int i=1;i<=n+1;i++) {
	
	for(int k=1;k<=i;k++) {
		
		System.out.print(k+" ");
		
	}
	System.out.println();
}

System.out.println();


//number upper pyramid

for(int i=5;i>=1;i--) {
	
	for(int k=1;k<=i;k++) {
		
		System.out.print(k+" ");
		
	}
	System.out.println();
}

//or
System.out.println();

n=5;

for(int i=1;i<=n;i++) {
	
	for(int k=1;k<=n-i+1;k++) {
		
		System.out.print(k+" ");
		
	}
	System.out.println();
}


	}

}
