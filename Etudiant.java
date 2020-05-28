public class Etudiant extends Personne{

private String tuteur;
public static int etudiant;
 public Etudiant(String prenom,String nom,String tuteur){
    super( nom, prenom) ;
    etudiant++;
    id=etudiant;

    this.tuteur=tuteur;

 }
 public Etudiant(){
    etudiant++;
    id=etudiant;
}

public String getTuteur(){

    return tuteur;
}

public String setTuteur(String tuteur){
   
    this.tuteur=tuteur;
}

@Override
public String affiche(){
    return super.affiche() +"Tuteur: "+tuteur;
}

}

