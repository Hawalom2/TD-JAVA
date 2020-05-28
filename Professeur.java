public class Professeur extends Personne{


private String grade;
public static int nbProf;
public Classe[] classe;

    public Professeur(){
        nbProf++;
        id=nbProf;
    }
    public Professeur(String prenom,String nom,String grade){
        super( nom, prenom) ;
        nbProf++;
        id=nbProf;
        this.grade=grade;

    }

    public String getGrade(){
    
        return grade;
    }
    
    public void setGrade(String grade){
    
        this.grade=grade;
    }
    @Override
    public String affiche(){
    return super.affiche() +"Grade: "+grade;
    }
}






