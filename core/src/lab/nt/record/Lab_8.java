package lab.nt.record;

public class Lab_8 {

	public static void main(String[] args) {

		int n,m;
		String temp;
		for(int i=0;i< args.length; i++) {
			
			for(int j=i+1; j<args.length; j++) {	
				n=Integer.parseInt(args[i]);
				m=Integer.parseInt(args[j]);	
				if(n<m) {			  
					temp=args[i];
					args[i]=args[j];
					args[j]=temp;
				}
			}
		}
		int diff=Integer.parseInt(args[2])-Integer.parseInt(args[8]);
		System.out.println("Difference between third largest and 2nd smallest is :"+diff);
	}

}
