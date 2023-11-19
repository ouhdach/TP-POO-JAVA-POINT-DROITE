package Exercice2;

public class Point { //Attributs
	
private String nom; private double abscisse; private double ordonnee;

//Constructeurs
public Point() { 
		abscisse=0;
		ordonnee=0;
		nom="O"; }
	
	public Point(double abscisse,double ordonnee, String nom) { this.abscisse=abscisse;
		this.ordonnee=ordonnee;
		this.nom=nom; }
	//Setters et getteres
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom; }
	
	public double getAbscisse() { 
		return abscisse;
	}
	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse; }
	public double getOrdonnee() {
		return ordonnee;
	}
	public void setOrdonnee(double ordonnee) {
		this.ordonnee = ordonnee; }
	public void setPoint(double abscisse,double ordonnee) { 
		this.abscisse=abscisse;
		this.ordonnee=ordonnee; }
	//Méthodes
	public void deplacerX(int longueur) { 
		this.abscisse += longueur;
	}
	public void deplacerY(int longueur) {
			this.ordonnee += longueur; }
	public double distance(Point p) {
		
	return Math.sqrt(Math.pow(this.abscisse - p.abscisse, 2)
	+ Math.pow(this.ordonnee - p.ordonnee, 2));
	
	}
	
	public String toString() {
	return nom + "(" + abscisse + "," + ordonnee + ")";
	}
}
