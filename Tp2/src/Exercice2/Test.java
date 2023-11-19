package Exercice2;


public class Test {

	public static void main(String[] args) { Point p1 = new Point();
	
		Point p2 = new Point(3,3, "A"); Point p3 = new Point(2,5,"B");
		
		System.out.println("Affichage des points : "); System.out.println(p1); System.out.println(p2); System.out.println(p3);
		
		
		System.out.println("Distances : ");
		System.out.println("----Distance(" + p1 + " , " + p2 + ") = " + p1.distance(p2));
		
		Droite d1 = new Droite(); //y=x 
		Droite d2 = new Droite(2,1);//y=2x+1
		
		System.out.println(); System.out.println("Affichage des droites : "); System.out.println(d1); System.out.println(d2);
		System.out.println();
		
		Point p4 = d1.pointIntersect(d2);
		
		System.out.println("Point d'intersection de: "+ d1 + " et " + d2 + " est: " + p4);
		System.out.println();
		
		boolean b1=d1.estAppartient(p3); 
		if(b1) {System.out.println(p3 + " appartient à: "+d1);}
		else { System.out.println(p3 + " n'appartient pas à: "+d1);}
		
		System.out.println(); System.out.println("Déplacement : "); System.out.println("Avant: "+p3); p3.deplacerX(2); System.out.println("Après: "+p3);
		System.out.println("using list");
		
			
			
	}
	
	}