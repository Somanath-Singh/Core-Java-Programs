package lab.nt.record;

import java.util.Scanner;

/*
  CLASS BOX{
	  INT LN,BR,HT;
}

CLASS BOX{
	  INT LN,BR,HT;
	  INT VOLUME(INT L, INT B, INT H) {
		  LN=L;
		  BR=B;
		  HT=H;
		  RETURN 2*(LN+BR+HT);
	  }
}
PUBLIC CLASS AREAANDPERIMETEROFDUSTER {

	PUBLIC STATIC VOID MAIN(STRING[] ARGS) {
		
		  FLOAT  AREA,PERIMETER;
		  SCANNER SC=NEW SCANNER(SYSTEM.IN);
		  BOX B=NEW BOX();
		  SYSTEM.OUT.PRINTLN("ENTER LENGTH OF THE DUSTER:");
		  B.LN=SC.NEXTINT();
		  SYSTEM.OUT.PRINTLN("ENTER BREADTH OF THE DUSTER:");
		  B.BR=SC.NEXTINT();
		  SYSTEM.OUT.PRINTLN("ENTER HEIGHT OF THE DUSTER:");
		  B.HT=SC.NEXTINT();
 		   
		     AREA=B.LN*B.BR;
		     PERIMETER=2*(B.LN+B.BR+B.HT);
		     PERIMETER=B.VOLUME(B.LN,B.BR,B.HT);
		     
		    SYSTEM.OUT.PRINTLN("AREA IS\N"+AREA);
		    SYSTEM.OUT.PRINTLN("PERIMETERIS\N"+PERIMETER);
		    SC.CLOSE();
		    }
		 }

*/

class Box{
	  int volume(int l, int b, int h) {
		  return 2*(l+b+h);
	  }
	  int area(int l, int b) {
		  return l*b;
	  }
}
public class AreaAndPerimeterOfDuster {

	public static void main(String[] args) {
		
		  float  area,perimeter;
		  Scanner sc=new Scanner(System.in);
		  Box b=new Box();
		  System.out.println("Enter length of the duster:");
		 int p=sc.nextInt();
		  System.out.println("Enter breadth of the duster:");
		  int q=sc.nextInt();
		  System.out.println("Enter height of the duster:");
		  int r=sc.nextInt();
		   
//		     perimeter=2*(b.ln+b.br+b.ht);
		     perimeter=b.volume(p,q,r);
		     area=b.area(p, q);
		     
		    System.out.println("area is\n"+area);
		    System.out.println("perimeteris\n"+perimeter);
		    sc.close();
		    }
		 }

