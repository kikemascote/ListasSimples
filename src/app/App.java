package app;

import linkedList.LinkedList;
import node.Node;

public class App {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();

		names.addLast("Pedro");
		names.addBefore("kike");
		names.addLast2("Xavi");
		names.addBefore("ricardos");
		names.addBefore("ana");
		names.addLast("Juan");

		System.out.println();
		names.pronter();//Imprimiendo valor
		
		names.addBefore("ana", "Jose");// agregamos a jose antes que a ana
		names.addAfter("kike", "Oscar");//Agregamos a oscar despues de kike
		
		System.out.println();
		names.pronter();
		
		names.replace("Pedro", "pepe");//Remplazamos a Pedro por pepe
		names.remove("ana");//eliminamos a ana
		names.addFirst("Milton");// Agregamos a milton al final de la lista
		
		
		//Buscando valor que si esta en la lista
		Node<String> name= names.serch("kike");
		if (name!=null) {
			System.out.println("Valor buscado: "+name.getValue()+"\n");
			System.out.println("Valor encontrado! \n");
		}else {
			System.out.println("Valor no encontrado");
		}
		//Buscando valor que no esta en la lista
		Node<String> name2= names.serch("luis");
		if (name2!=null) {
			System.out.println("Valor encontrado :" +name2.getValue()+"\n");
		}else {
			//System.out.println("Valor buscado: "+name2.getValue()+"\n");
			System.out.println("\nValor no encontrado\n");
		}
		//names.pronter();//Imorimiendo valor

		System.out.println("\nEl primer Valor es de la lista es: " +names.getFirst());
		System.out.println("El ultimo valor de la lista es:" + names.getLast());
		
		//Removemos a Ana
		names.removeBefore("ricardos");
		System.out.println();
		names.pronter();
		
		//Removemos a Juan
		names.removeAfter("Xavi");
		System.out.println();
		names.pronter(); 
		
		//Imprimomos con el metodo list
		System.out.println();
		names.list(); 
		
		//Eliminamos el primero y el ultimo de la lista
		names.removeFirst();
		names.revomeLast();
		
		// Imprimomos con el metodo list
		System.out.println();
		names.list();
		
		//Buscamos el indice
		System.out.println("\nEl indice de oscar es: " +names.indexOf("Oscar"));
		
		//Agregamos al inicio
		names.addFirst("ana");
		
		// Imprimomos con el metodo list
		System.out.println();
		names.list();
		
		names.clear();//Limpiamos la Lista
		
		//Verificamos si esta vacia
		if (names.isEmpty()) { 
			System.out.println("\nEsta vacía"); 
		}else {
			System.out.println("\nTiene datos"); 
		}
		//Imprimimos la lista
		System.out.println();
		names.pronter();
		
		

		System.out.println("no hay error! no hay error!, el dinero es dinero!");
	}

}