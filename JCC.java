package ds2022;

public class JCC {
private Film comp[];
private int annee;
private static final int NBFMAX=30;
private int nbf;
public JCC(int annee)
{
  comp=new Film[NBFMAX];
  this.annee=annee;
  
}
public void ajout_film(Film F)
{
	if(nbf==NBFMAX)
	{
		System.out.println("la competition est complet");
	}
	else {
		comp[nbf]=F;
		nbf++;
	}
	
}
public float totalventeBilletsJCC() {
	float s=0;
	for(int i=0;i<nbf;i++)
	{
		s=s+comp[i].totalVenteBillets();
	}
	return s;
}
public void listeFilmJCC()
{
	for(int i=0;i<nbf;i++)
	{
		System.out.println(comp[i]);
		
	}
	

}
public static void main(String[] args)
{
	JCC J=new JCC(2021);
	Film F1=new Documentaire("Le dernier refuge","Ousman","Mali",86,"La guerre civile");
	F1.setNbPlace(30);
	Film F2=new Film("Insurrection","Jilani Saadi","Tunisie",105);
	F2.setNbPlace(45);
	J.ajout_film(F1);
	J.ajout_film(F2);
	J.listeFilmJCC();
	System.out.println("le total de vente est "+J.totalventeBilletsJCC());
	










}

}
