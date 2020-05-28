abstract public class Personne implements IInscription{

protected int id;
protected String prenom;
protected String nom;
private static int nbreDePersonne;

    public Personne(){
        nbreDePersonne++;
        id=nbreDePersonne;
    }
    public Personne(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }
    public int getId(){
    
        return id;
    }
    public String getPrenom(){
    
        return prenom;
    }
    public String getNom(){
    
        return nom;
    }
    public void setId(int id){
    
        this.id=id;
    }
    public void setPrenom(String prenom){
    
        this.prenom=prenom;
    }
    public void setNom(String nom){
    
        this.nom=nom;
    }
     @Override
        public String affiche(){
            return "ID: "+id+"Prenom: "+prenom+"Nom: "+nom ;
                
            }



}

