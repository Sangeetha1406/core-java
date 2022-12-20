package com.xworkz;

import java.util.Collection;
import java.util.TreeSet;

public class Cupons {
	public static void main(String[] args) {
		String cupon1="Discount Coupon Lady";
		String cupon2="Awesome Offers";
		String cupon3="All Plus Coupon";
		String cupon4="Ice Coupon Book";
		String cupon5="Auctionscoupon";
		String cupon6="AllPlus Coupons";
		String cupon7="CardSave Inc";
		String cupon8="RetailCurvet";
		String cupon9="Take Them Back";
		String cupon10="Mystery Deal";
		String cupon11="SaverThings";
		String cupon12="RedCoupon";
		
		Collection<String>collection=new TreeSet();
		collection.add(cupon1);
		collection.add(cupon2);
		collection.add(cupon3);
		collection.add(cupon4);
		collection.add(cupon5);
		collection.add(cupon6);
		collection.add(cupon7);
		collection.add(cupon8);
		collection.add(cupon9);
		collection.add(cupon10);
		collection.add(cupon11);
		collection.add(cupon12);
		
		System.out.println(collection.size());
		
		collection.clear();
		System.out.println("after claer.......");
		System.out.println(collection.size());
		
		

		
		
	}
}
