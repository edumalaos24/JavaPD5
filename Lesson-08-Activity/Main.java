class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void print(String text) {
    System.out.println(text);
}

double FtoC(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

double sphereVolume(double radius) {
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
}

double coneVolume(double radius, double height) {
    return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
}

double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
}

  void init(){
	    print("Test");

    double celsius = FtoC(100);
    System.out.println(celsius);

    double sphere = sphereVolume(5);
    System.out.println(sphere);

    double cone = coneVolume(5, 10);
    System.out.println(cone);

    double dist = distance(1, 2, 4, 6);
    System.out.println(dist);
  }
}