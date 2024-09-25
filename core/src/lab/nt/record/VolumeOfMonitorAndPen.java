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

class Volume{
	
	  int volumep(int r,int h) {
		  
		   final float pi=(float) 3.14; 
		  return (int) (pi*r*r*h);
	  }
	  
	  int volumem(int l,int b,int h) {
		  return l*b*h;
	  }
}

public class VolumeOfMonitorAndPen {

	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  Volume b=new Volume();
		  
		  System.out.println("Enter radius and height of pen :");
		 int r=sc.nextInt();
		  int h=sc.nextInt();
		  System.out.println("Enter length, bredth and height of the monitor:");
		  int ln=sc.nextInt();
		  int br=sc.nextInt();
		  int ht=sc.nextInt();		  
		   
		  	int  volp=b.volumep(r,h);
		  	int volm=b.volumem(ln,br,ht);
		     
		    System.out.println("volume of pen is  :\n"+volp);
		    System.out.println("volume of monitor is  :\n"+volm);
		    sc.close();    
		    }
		 }

