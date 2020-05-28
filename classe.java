    public class Classe implements IInscription{
        //Proprietes Classe
            //Genere automatiquement
            private int id;
            private String libelle;
            private static int nbreClasse;
            public Personne[] personnes;
            
            //Constructeur
                //Par default 
            public Classe(){
                nbreClasse++;
                id=nbreClasse;
            }
            public Classe(String libelle){
                nbreClasse++;
                id=nbreClasse;
                this.libelle=libelle;
            }
            public String getLibelle(){
                return this.libelle;
            }
            public void setLibelle(String libelle){
                this.libelle=libelle;
            }
            public int getId(){
                return this.id;
            }
            public void setId(int id){
                this.id=id;
            }
            
            @Override
            public String affiche(){
                return "ID: "+id+"Libelle: "+libelle;
                
            }
    }