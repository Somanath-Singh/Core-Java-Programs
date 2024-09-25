package lab.nt.record;

public class Lab_7 {

	public static void main(String[] args) {

//		int a=Integer.parseInt(args[0]);
//		int b=Integer.parseInt(args[1]);
//		int c=Integer.parseInt(args[2]);
//		int d=Integer.parseInt(args[3]);
//		int e=Integer.parseInt(args[4]);
//		int f=Integer.parseInt(args[5]);
//		int g=Integer.parseInt(args[6]);
//		int h=Integer.parseInt(args[7]);
//		int i=Integer.parseInt(args[8]);
//		int j=Integer.parseInt(args[9]);
		
//		int n=a,sum=0,r;
//		//palindrom
//		while(a!=0) {
//			r=a%10;
//			sum=sum*10+r;
//			a=a/10;
//		}
//		System.out.println(sum);
//		if(sum==n) {
//			System.out.println(n+" is palindrom.");
//		}
//		else {
//			System.out.println(n+" is not palindrom.");
//		}
//		//prime
//		int temp=0;
//		for(int k=1; k<=n; k++) {
//			if(n%i==0) {
//				temp++;
//			}
//		}
//		if(temp==2) {
//			System.out.println(n+" is prime");
//		}
//		else {
//			System.out.println(n+" is not prime");
//		}
		
//		int sum=0,r;
//		
//		for(int i=0;i<= args.length; i++) {
//			arr[i]=Integer.parseInt(args[i]);
//			
//			a[i]=arr[i];
//			//palindrom
//			while(arr[i]!=0) {
//				r=arr[i]%10;
//				sum=sum*10+r;
//				arr[i]=arr[i]/10;
//			}
//			
//			if(sum==a[i]) {
//				System.out.println(a[i]+" is palindrom.");
//			}
//			else {
//				System.out.println(a[i]+" is not palindrom.");
//			}
//			//prime
//			int temp=0;
//			for(int k=1; k<=a[i]; k++) {
//				if(a[i]%k==0) {
//					temp++;
//				}
//			}
//			if(temp==2) {
//				System.out.println(a[i]+" is prime");
//			}
//			else {
//				System.out.println(a[i]+" is not prime");
//			}
//		}
//		//reinitialize
//		sum=0;
//	}
	
		
        int sum=0,r,n,m;
		
		for(int i=0;i< args.length; i++) {
			n=Integer.parseInt(args[i]);
			m=n;
			//palindrom
			while(n!=0) {
				r=n%10;
				sum=sum*10+r;
				n=n/10;
			}
			
			if(sum==m) {
				System.out.println(m+" is palindrom.");
			}
			else {
				System.out.println(m+" is not palindrom.");
			}
			//prime
			int temp=0;
			for(int k=1; k<=m; k++) {
				if(m%k==0) {
					temp++;
				}
			}
			if(temp==2) {
				System.out.println(m+" is prime");
			}
			else {
				System.out.println(m+" is not prime");
			}
		}
		//reinitialize
		sum=0;
	}
	}


