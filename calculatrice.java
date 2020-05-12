public class calculatrice {
public static void main(String [] argument) {
double a,b;
System.out.print("Entrer la première valeur : ") ;
a = Lire.d() ;
System.out.print("Entrer la deuxième  valeur : ") ;
b = Lire.d() ;
somme=a+b;
difference=a-b;
produit=a*b;
quotient=a/b; 

System.out.print("Valeur1 : " + a) ;
System.out.print("Valeur2 : " + b) ;
System.out.print(“a+b = “);
System.out.println(somme);
System.out.print(“a-b = “);
System.out.println(difference);
System.out.print(“a*b = “);
System.out.println(produit);
if(b > 0)
    System.out.print(“a/b = “);
    System.out.println(quotient);  
    else 
         System.out.println("Valeur2 doit être supérieur à 0");
}
}