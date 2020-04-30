package ch.bitz.designpatterns.creational.builder;

import ch.bitz.designpatterns.creational.builder.Person.PersonBuilder;
import ch.bitz.designpatterns.creational.builder.StockDepot.StockDepotBuilder;

public class Main {
public static void main(String[] args) {
	PersonBuilder builder = new PersonBuilder("hans", "peter", 18);
	Person person = builder.setPostcode("12345").build();
	System.out.println(person);
	
	StockDepotBuilder stockDepotBuilder = new StockDepotBuilder("Thierry", "Bitz", "Oberdorfstrasse", "Brugg", "5222");
	StockDepot thierryDepot = stockDepotBuilder.setEuro(100).setIbm(10).build();
	
	stockDepotBuilder = new StockDepotBuilder("Charlie", "Sheen", "Manhattenstreet", "NY", "12121");
	StockDepot charlieDepot = stockDepotBuilder.setGold(2000).setOil(10).setAccenture(100).setMicrosoft(1000).build();
	
	stockDepotBuilder = new StockDepotBuilder("Chuck", "Norris", "Roundhousekickstreet", "Galaxis", "1");
	StockDepot chuckDepot = stockDepotBuilder.setEuro(200).setGold(200).setOil(20).setAccenture(10).setMicrosoft(10).setIbm(10).build();
	
	System.out.println(thierryDepot);
	System.out.println();
	System.out.println(charlieDepot);
	System.out.println();
	System.out.println(chuckDepot);	
	
	
}
}
