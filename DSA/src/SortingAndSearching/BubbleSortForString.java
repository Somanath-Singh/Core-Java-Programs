package SortingAndSearching;

public class BubbleSortForString {

	public static void main(String[] args) {
		
		String[] a= {"somanath","deepak","banty","gudi","amit"};
		
		String temp="";
		
		for(int i=0;i<a.length;i++) {
			
			int flag=0;
			
			for(int j=0;j<a.length-1-i;j++) {
				
				if(a[j].compareTo(a[j+1])>0) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
					
				}//if
			}//inner for
			
			if(flag==0) {
				break;
			}
			
		}//outer for
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"  ");
		}

	}

}
