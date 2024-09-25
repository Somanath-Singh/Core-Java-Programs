package demo;
class A
{
public static String findDay(int month, int day, int year)
     {
         String s=" ";   
        if(year>2000&&year<3000)
        {
            int y=year-2000;
            int calc=day+(int)(month/4)+y+(int)(47/4);
            switch(calc)
            {
                 case 1:
                     s="MONDAY";
                     System.out.println(s);
                    break;
                 case 2:
                    s="TUESDAY";
  System.out.println(s);
                    break;
                case 3:
                   s="WEDNESDAY";
  System.out.println(s);
                   break;
                case 4:
                   s="THURSDAY";
  System.out.println(s);
                   break;
                case 5:
                   s="FRIDAY";
  System.out.println(s);
                   break;
                 case 6:
                   s="SATURDAY";
  System.out.println(s);
                   break;
                 case 7:
                   s="SUNDAY";
  System.out.println(s);
                   break;
            }
        }
        return s;
    }

}
class B
{
public static void main(String[] args)
{
A obj=new A();
obj.findDay(8,5,2015);
}
}
