import java.util.Scanner;
public class Main{
        
        public static void main(String args[]){
        Scanner clavier=new Scanner(System.in);
        Service service=new Service();
        String choix;
        //int choix

        do{
            System.out.println("Faites votre choix");
            System.out.println("1-Ajouter classe");
            System.out.println("2-lister classe");
            System.out.println("3-Inscrire Etudiant");
            System.out.println("4-Lister Etudiant par classe");
            System.out.println("5-affecter professeur a une classe");
            System.out.println("6-Lister Professeur ");
            System.out.println("7-Quitter");
            choix=clavier.nextLine();
            //choix=Integer.parseInt(clavier.nextLine())
            //mettre les entiers
            
            switch(choix){
                case "1":
                System.out.println("Ajouter une classe");
                System.out.println("Entrer le libelle d'une classe");
                String libelle=clavier.nextLine();
                Classe cl=new Classe();
                cl.setLibelle(libelle);
                service.ajouterClasse(cl);
                break;
                case "2":
                System.out.println("==================******************===========");
                System.out.println("Lister les classes");
                service.listerClasse();
                break;
                case "3":
                System.out.println("==================******************===========");
                System.out.println("Inscrire Etudiant");
                System.out.println("Nouvel etudiant :");
                System.out.println("Prenom="); String prenom=clavier.nextLine();
                System.out.println("Nom="); String nom=clavier.nextLine();
                System.out.println("Tuteur="); String tuteur=clavier.nextLine();
                Etudiant et=new Etudiant();
                et.setPrenom(prenom);
                et.setNom(nom);
                et.setTuteur(tuteur);
                break;
                case "4":
                System.out.println("==================******************===========");
                System.out.println("Lister Etudiant par Classe");
                service.listerEtudiant();
                break;
                case "5":
                System.out.println("==================******************===========");
                System.out.println("Affecter Professeur à une classe");
                service.affectProf();
                break;
                case "6":
                System.out.println("==================******************===========");
                System.out.println("Lister Professeur");
                service.listerProf();
                break;
                
                
            }
        }while(choix!="7");
    } 
}