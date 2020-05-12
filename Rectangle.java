public class Rectangle {
  private double longueur, largeur ;
  public Rectangle ( double lo , double la ) {
      longueur = lo ;
      largeur  = la ; 
  }

  public double demiPerimetre() {
    return longueur + largeur;
  }
  public double perimetre() {
    return 2 * ( demiPerimetre );
  }

  public double surface() {
    return  longueur * largeur ;
  }
  public double diagonale() {
    return  Math.sqrt(Math.pow(longueur,2)+Math.pow(largeur,2) ;
  }
  
  
   public  void  afficher ( String nom ) {
       System.out.println("Informations du rectangle " + nom + " : ") ;
	   System.out.println("  - longueur  : " + longueur) ;
	   System.out.println("  - largeur   : " + largeur) ;
	   System.out.println("  - demiPerimetre : " + demiPerimetre()) ;
	   System.out.println("  - perimetre : " + perimetre()) ;
	   System.out.println("  - surface   : " + surface());
	   System.out.println("  - diagonale   : " + diagonale());
    }


}