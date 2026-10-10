
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}
	//Challenge 1
	double GPAcalc(double GPA){
		if(GPA<90)
			return GPA*1.1;
		else
			return GPA;
  }
  	//Challenge 2
	boolean isGraduating(int gradelevel,int credits){
		if(gradelevel == 12 && credits >= 44){
		return true;
		}else{
		return false;
		}
	}

	//Challenge 3
	String BMI(int pounds,int inches){
		double BMI = (weight/Math.pow(height,2))*703;
		if(BMI <= 18.4){
			return "Underweight";
		}else if(BMI >= 18.5 && BMI <=24.9){
			return "Normal";
		}else if(BMI >= 25.0 && BMI <=39.9){
			return "Overweight";
		}else{
			return "Obese";
		}
	}

	//Challenge 4
	double shippingCost(double weight){
		if(weight<=10){
			return 0.00;
		}
		else if(weight>10&&weight<=15){
			return 5.00;
		}
		else if(weight>15&&weight<=25){
			return 10.00;
		}
		else{
			return 10.00 + (weight-25) * 0.02;
		}
	}

		//Challenge 5
		boolean blueOrViolet(double THz){
			if(THz >= 600 && THz <= 670){
				return true;
			}
			else if(THz >= 700 && THz <= 750){
				return true;
			}
			else{
				return false;
			}
		}
	}


	void init(){
		System.out.println("GPA: " + GPAcalc(85));
        System.out.println("Graduating: " + isGraduating(12, 45));
        System.out.println("BMI Category: " + BMI(150, 70));
        System.out.println("Shipping: $" + shippingCost(28));
        System.out.println("Blue/Violet: " + blueOrViolet(630));
  }
}