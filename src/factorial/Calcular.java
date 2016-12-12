/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Ara
 */
public class Calcular {
    public void calculo(){
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
