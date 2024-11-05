package ds2022;

public class Documentaire extends Film {
 private String sujet;
 private static final float tarif=2;
 public Documentaire(String titre,String r,String pays,int d,String sujet)
 {
	 super(titre,r,pays,d);
	 this.sujet=sujet;
	 
 }
@Override
public String toString() {
	return super.toString()+"sujet=" + sujet ;
}
public void setNbPlace(int nb)
{
	super.setNbPlace(nb);
}
 public float totalVenteBillets()
 {
	 return super.nbPlace*tarif;
 }
 
}
