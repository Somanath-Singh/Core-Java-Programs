package lab.nt.record;

public class Lab_9 {

	public static void main(String[] args) {

		int gpoint,mark,sum_gpoint,cp;
		double cgpa;
		gpoint=0;
		sum_gpoint=0;
		cp=3;
		char grade;
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                                          IGIT Sarang                                   ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Sem 3rd                         Stream MCA                      Session  2023-24");	
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Sno                      Sub                      Grade  ");
		System.out.println("--------------------------------------------------------------------------");
		
		for(int i=0 ; i<args.length ; i++) {
			
			mark=Integer.parseInt(args[i]);
			
			if(mark>=90&&mark<=99) {
				grade='O';
				gpoint=9;
			 }
		     else if(mark>=80&&mark<=89) {
		    	 grade='E';
		    	 gpoint=8;
		     }
		   else if(mark>=70&&mark<=79) {
			   grade='A';
			   gpoint=7;
			  }
			else if(mark>=60&&mark<=69) {
				grade='B';
				gpoint=6;
			  }
			else if(mark>=50&&mark<=59) {
				grade='C';
				gpoint=5;
			  }
			else if(mark>=40&&mark<=49) {
				grade='D';
				gpoint=4;
			  }
			else {
				grade='F';
				gpoint=2;
			 }
			sum_gpoint=sum_gpoint+gpoint*cp;
			
			System.out.println((i+1)+"                          " +"Sub"+(i+1)+"                        "+grade );
		}
		cgpa=(double)(sum_gpoint/12);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\t\t\t\t CGPA  "+cgpa);

	}

}
