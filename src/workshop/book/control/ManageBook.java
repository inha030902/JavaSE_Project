package workshop.book.control;

import workshop.book.entity.Magazine;
import workshop.book.entity.Publication;

public class ManageBook {

	public static void main(String[] args) {
		Magazine pub1 = new Magazine(); 
		//Publication method
		pub1.getPage();
		pub1.getPrice();
		pub1.getPublishingDate();
		pub1.getTitle();
		//Magazine method
		pub1.getPublishingPeriod();
		
		//Poly(다양한) + morphism(변형)		
		Publication pub = new Magazine();
		//Publication method
		pub.getPage();
		pub.getPrice();
		pub.getPublishingDate();
		pub.getTitle();
		
//		Magazine mag = (Magazine)pub;
//		mag.getPublishingPeriod();
		((Magazine)pub).getPublishingPeriod();

	}

}
