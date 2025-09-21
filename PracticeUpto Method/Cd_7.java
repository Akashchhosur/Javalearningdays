package com;

class Cd_7 {
	public static void main(String[] args) {
		float income=5f;
		if(income>=2.5f && income<5.5f) {
			double tax=income*(5f/100f);
			System.out.println("Your Total TAX :"+tax);
		}else if(income>=5.5f && income<10f){
			double tax=income*0.2;
			System.out.println("Your Total TAXXXX :"+tax);
		}
	}

}
