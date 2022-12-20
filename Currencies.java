package com.xworkz;

import java.util.Collection;
import java.util.LinkedList;

public class Currencies {
	public static void main(String[] args) {
	String currency1="indian rupee";
	String currency2="afghani";
	String currency3="lek";
	String currency4="dream";
	String currency5="kwanza";
	String currency6="argentine peso";
	String currency7="guilder";
	String currency8="manat";
	String currency9="taka";
	String currency10="boliviano";
	String currency11="bahamian dollar";
	String currency12="pula";
	String currency13="swiss franc";
	String currency14="cook dollar";
	String currency15="colon";
	String currency16="cuban peso";
	String currency17="czech krone";
	String currency18="algerian dinar";
	String currency19="nakfa";
	String currency20="birr";
	String currency21="faroese karona";
	String currency22="ghana cedi";
	String currency23="dalasi";
	String currency24="quetzal";
	String currency25="kuna";
	String currency26="arabic dirham";
	
	Collection<String>collection=new LinkedList();
	collection.add(currency1);
	collection.add(currency2);
	collection.add(currency3);
	collection.add(currency4);
	collection.add(currency5);
	collection.add(currency6);
	collection.add(currency7);
	collection.add(currency8);
	collection.add(currency9);
	collection.add(currency10);
	collection.add(currency11);
	collection.add(currency12);
	collection.add(currency13);
	collection.add(currency14);
	collection.add(currency15);
	collection.add(currency16);
	collection.add(currency17);
	collection.add(currency18);
	collection.add(currency19);
	collection.add(currency20);
	collection.add(currency21);
	collection.add(currency22);
	collection.add(currency23);
	collection.add(currency24);
	collection.add(currency25);
	collection.add(currency26);
	
	System.out.println(collection.size());
	
	collection.clear();
	System.out.println("after claer.......");
	System.out.println(collection.size());
	}
}
