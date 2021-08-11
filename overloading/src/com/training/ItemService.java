package com.training;

public class ItemService {

	public double calculateDiscount(Item item) {
		
		double discountAmount = item.getRatePerUnit() *0.05;
		
		return discountAmount;
	}
	// Method overloaded with item and discount percentage
	
//     public double calculateDiscount(Item item,double dispercent) {
//		
//		double discountAmount = item.getRatePerUnit() *dispercent;
//		
//		return discountAmount;
//	}
//    
     
	
//	// Its overloaded but different modifier
//     
//      double calculateDiscount(Item item,double dispercent) {
// 		
// 		double discountAmount = item.getRatePerUnit() *dispercent;
// 		
// 		return discountAmount;
// 	}
     
   // Its overloaded but return type is different
      
      float calculateDiscount(Item item,double dispercent) {
 		
 		return (float)(item.getRatePerUnit() *dispercent);
 		
 	}
      
      
}
