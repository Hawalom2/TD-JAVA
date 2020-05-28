public class Service{
    //Taille Réservation
    private final int TAILLE=10;
    //Taille Réelle ou Position d'insertion dans le tableau
    private int nbreDeClasse=0;
    private final Classe[] tabClasses;
    private int nbreDePersonne=0;
    private final Personne[] tabPersonnes;
    
    public Service(){
        tabClasses= new Classe[TAILLE];
        tabPersonnes= new Personne[TAILLE];
    }
    
    public void ajouterClasse(Classe classe){
            tabClasses[nbreDeClasse]=classe;
            nbreDeClasse++;
    }
    public void listerClasse(){
            
            for(int i=0;i<nbreDeClasse;++i){
                System.out.print(tabClasses[i].affiche());
            }
    }
    public void inscrireEtudiant(Etudiant etudiant){
        tabPersonnes[nbreDePersonne]= etudiant;
        nbreDePersonne++;
    }
    public void listerEtudiant(){
        for(int i=0;i<nbreDePersonne;++i){
            if(tabPersonnes[nbreDePersonne]=etudiant){
                System.out.print(tabPersonnes[i].affiche());
            }
                
            }    
    }
    public void affectProf(){
        
    }
    public void listerProf(){
     
    }
    
    
}