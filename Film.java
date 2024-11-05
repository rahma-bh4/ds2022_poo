package ds2022;
import java.util.Scanner;
public class Film {
protected String titre;
protected String real;
protected String pays;
protected int d;
protected  int nbPlace;
public Film(String titre,String r,String pays,int d) {
	this.titre=titre;
	this.real=r;
	this.pays=pays;
	this.d=d;
}
public int getNbPlace() {
	return nbPlace;
}
public void setNbPlace(int nbPlace) {
	this.nbPlace = nbPlace;
}
@Override
public String toString() {
	return " titre=" + titre + ", real=" + real + ", pays=" + pays + ", d=" + d + ", nbPlace=" + nbPlace ;
}
public float totalVenteBillets()
{
	Scanner s=new Scanner(System.in);
	int n;
	do {
		System.out.println("donner le nombre d'etudiant");
	     n=s.nextInt();
		
	}while(n>this.nbPlace);
	int t=2*n+3*(nbPlace-n);
	s.close();
	return t;
}

}
