package string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listastring {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>(); // importa a control chifite O

	    list.add("maria");
	    list.add("anna");
	    list.add("alex");   // adicionar elemntos na lista
	    list.add("joao");
	    list.add(2, "pedro"); // adionar elemento na lista na posiçao 2
	  
	    
	    System.out.println(list.size()); // size serve para mostra o tamanho da lista 
	   
	      for(String x : list) {
		  System.out.println(x);
	      }
		    
		   System.out.println("------------------------");
		  //list.remove(2); // remover item da lista , de acordo com a posiçao ou nome 
          list.removeIf(x -> x.charAt(0) == 'm'); //remover da lista so os nomes com a letra M
	    
          for(String x : list) {
    		  System.out.println(x);
    	      }
		
		  System.out.println("------------------------");

		  System.out.println("Index of joao: " + list.indexOf("joao")); // indexof serve para encontrar nome e posiçao na lista 
		  
		  
		  System.out.println("------------------------");
		
		   List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
	
		   for(String x : result) {
	    		  System.out.println(x);
	    	      }
	
		   System.out.println("------------------------");
		   
		   String name = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
		   System.out.println(name);

	
	
	}

}
