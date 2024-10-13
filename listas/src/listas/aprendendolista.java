package listas;

import java.util.ArrayList;
import java.util.List;

public class aprendendolista {

	public static void main(String[] args) {
		  
		List<Integer> list = new ArrayList<>(); // importa a control chifite O

	    list.add(12);
	    list.add(58);
	    list.add(32);   // adicionar elemntos na lista
	    list.add(70);
	    list.add(2, 52); // adionar elemento na lista na posiçao 2
	  
	    
	    System.out.println(list.size()); // size serve para mostra o tamanho da lista 
	   
	      for(Integer x : list) {
		  System.out.println(x);
	      }
		    
		   System.out.println("------------------------");
		  //list.remove(2); // remover item da lista , de acordo com a posiçao ou nome 
          list.removeIf(x -> x.compareTo(0) == 2);
	    
          for(Integer x : list) {
    		  System.out.println(x);
    	      }
	}

}
