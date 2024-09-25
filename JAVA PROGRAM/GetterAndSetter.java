class Main
{
    private String name;
    public void setName(String name)
      {
       this.name=name;
      }
     public void getName()
      {
        System.out.println(" Name="+name);
      }
}
 class GetterAndSetter
{
 
    public static void main(String args[])
     {
      Main m1=new Main();
       m1.setName("Somanath singh");
       m1.getName();
     }
}