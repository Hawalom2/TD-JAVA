abstract public class Personne{

	protected String fullname;

	public String getFullName(){

		return fullname;
	}

	public void setFullName(String fullname){

		this.fullname=fullname;
}

	public void affiche(){

	System.out.println("Le nom complet est :"+getFullName());
}


}