package com.reckercode;

public class Main {

    public static void main(String[] args) {
	    ITelephone reckersPhone;
		reckersPhone = new DeskPhone(123123123);
		reckersPhone.powerOn();
		reckersPhone.callPhone(123123123);
	    reckersPhone.answer();

		reckersPhone = new MobilePhone(456456456);
		reckersPhone.powerOn();
		reckersPhone.callPhone(456456456);
		reckersPhone.answer();
	}
}
