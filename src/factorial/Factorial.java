
package factorial;


public class Factorial {
    //*Cambio nombre a las variables*//


    public static void main(String[] args) {


    int numFactor;
    int factorial;

  
   numFactor= 8;    
   

    
   int i;
   if (numFactor == 0)
factorial= 1;
   else
   {
factorial = 1;
for (i = numFactor; i >= 1; i--)
{
    factorial = factorial * i;
}
   }    
  
 

System.out.println(factorial); 


    }
    
}
