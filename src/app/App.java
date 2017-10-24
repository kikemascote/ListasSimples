package app;

import linkedList.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String>  names 		= new LinkedList<String>();
		LinkedList<String>  lastnames 	= new LinkedList<String>();
		LinkedList<Integer> ages 		= new LinkedList<Integer>(19);
		names.addLast("Pedro");
		names.addBefore("kike");
		names.addLast2("Xavi");
		names.addBefore("ricardos");
		names.addBefore("ana");
		names.addLast("Juan");
		
		names.pronter();
		System.out.println("no hay error! no hay error!, el dinero es dinero!");
	}

}
