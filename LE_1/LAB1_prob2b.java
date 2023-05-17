public class Main
{
   public static void main(String[] args)
   {
      int i, j, row=4, space;
      
      for(i=0; i<row; i++)
      {
         for(space=0; space<i; space++)
            System.out.print(" ");
         for(j=i; j<row; j++)
            System.out.print("* ");
         System.out.print("\n");
      }
   }
}