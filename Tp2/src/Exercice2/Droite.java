package Exercice2;

public class Droite {
	
	//Attributs
	private double pente;
	private double ordonneeOrig;
	
	//Constructeurs
	
	public Droite() {
			// D: y = x;
		pente =1.0; //pente=1;
		ordonneeOrig=0; 
		}
	
	public Droite(double pente, double ordonneeOrig) {
		this.pente=pente;
		this.ordonneeOrig=ordonneeOrig; 
		}
	
	//Setters et getters
	public double getPente() { return pente;
	}
	
	public void setPente(double pente) {
		this.pente = pente; }
	
	public double getOrdonneeOrig() { 
		return ordonneeOrig;
	}
	
	public void setOrdonneeOrig(int ordonneeOrig) {
		this.ordonneeOrig = ordonneeOrig;
		}
	//toString
	public String toString() {//y=ax+b
		
		if (pente != 1) {
			
		if (pente == 0 ) return "y = " + ordonneeOrig;
	
	else if (ordonneeOrig == 0 ) return "y = " + pente + "x"; else return "y = " + pente + "x + "+ ordonneeOrig;
	
		} else {
	return "y = x + "+ ordonneeOrig;
	}
	}
	
	//Les autres méthodes
	public boolean estAppartient(Point p) {
		
		double y = pente * p.getAbscisse() + ordonneeOrig; 
		if (p.getOrdonnee()==y) return true;
		else return false;
	}
	
	public Point pointIntersect(Droite d) {
		double x = (this.ordonneeOrig - d.ordonneeOrig)/(d.pente - this.pente); 
		double y = this.pente * x + this.ordonneeOrig;
		Point p = new Point(x,y,"I");
		return p; }

}
