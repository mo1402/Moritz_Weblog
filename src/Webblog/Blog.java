package Webblog;

import java.util.ArrayList;
import java.util.Scanner;

public class Blog {

	ArrayList <Beitrag> content = new ArrayList<Beitrag>();	


	void schreibeBeitrag () {

		Beitrag neuerBeitrag = new Beitrag ();

		neuerBeitrag.write();

		content.add(0,neuerBeitrag);	


	} 
	void kommentieren () {
		
		Scanner scnew = new Scanner (System.in);
		System.out.println("Welchen Beitrag möchten Sie kommentieren?");
		int nrBeitrag = scnew.nextInt();
		content.get(nrBeitrag).schreibeKommentar();
	}

	void auflisten () {

		for (int i = 0; i < this.content.size();i++) {
			System.out.println(i+" " + content.get(i).getText());
			
		}
	}
	
	void getBeitrag(int i) {
		this.content.get(i);
	}

class Comments extends Blog {
	void auflisten () {
		for (Beitrag beitrag : this.content) {
    		System.out.println("   * " + beitrag.getText());
		}	
	}
}

	public static void main(String[] args) {


		int auswahl;

		Blog myblog = new Blog();

		Scanner sc = new Scanner (System.in);


		do {


			System.out.println("[1] für neuen Beitrag ");
			System.out.println("[2] Beiträge auflisten ");
			System.out.println("[3] Kommentieren");

			auswahl=sc.nextInt();


			switch (auswahl){
			case 1 : myblog.schreibeBeitrag(); break;
			case 2: myblog.auflisten(); break;
			case 3: myblog.kommentieren();break;

			}



			} while(true);


	}
}
		

