package Webblog;

import java.util.Scanner;
public class Beitrag {
	
	private String text;
	private String date;
	private int number;
	private String name;
	private Blog comments = new Blog();
	
	public Beitrag () {
		
		
	}
	
	public void write() {
	
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Wie ist Ihr Name?");
	name=sc.next();
	
	System.out.println("Bitte schreiben Sie einen neuen Beitrag");
	text=sc.next();
		
	}
	
	public void ausgabe () {
		
		
	}
	
	public String getText() {
		this.comments.auflisten();
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void schreibeKommentar() {
		
		this.comments.schreibeBeitrag();
	}

}