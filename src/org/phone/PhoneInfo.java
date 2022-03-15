package org.phone;

public class PhoneInfo {
    public void phoneName() {
         System.out.println("Nokia");
	}
    public void phoneImei() {
   System.out.println("Imei number is 123456");
	}
    public void camera() {
    	System.out.println(" Camera is 12Mp");
	}
    public void os() {
System.out.println("10");
	}
    public static void main(String[] args) {
		PhoneInfo mobile= new PhoneInfo();
		mobile.phoneImei();
		mobile.camera();
		mobile.os();
	}
}

