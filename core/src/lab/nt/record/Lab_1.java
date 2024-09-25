package lab.nt.record;

public class Lab_1 {

	public static void main(String[] args) {
	
		int n1,n2,n3;
		n1=Integer.parseInt(args[0]);
		n2=Integer.parseInt(args[1]);
		n3=Integer.parseInt(args[2]);
		
		int lar=((n1>n2)&&(n1>n3))?n1:(n2>n3)?n2:n3;
		
		System.out.println("Largest no is "+lar);

	}

}
