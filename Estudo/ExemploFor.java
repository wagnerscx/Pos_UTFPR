public class ExemploFor{
 
 public static void main(String[] args)
{
   {
    int[] pontos ={10,20,25,35,45,210,566,58,75,550};
    int min_pontos = minimo(pontos);
    System.out.println("A menor pontuacao e.."+min_pontos);  

     
   }
 
}

 
public static int minimo(int[] numeros)
 {
  
 int pontMin = numeros[0];
 for (int num : numeros)
   {
     if (num < pontMin)
      {
        pontMin = num;
       }
     }
 	return pontMin;
 }
}