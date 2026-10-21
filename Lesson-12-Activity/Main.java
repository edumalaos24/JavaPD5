class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String creditCardType(String card) {
    if (card.substring(0, 1).equals("4")) {
        return "Visa";
    } else if (card.substring(0, 2).equals("34") ||
               card.substring(0, 2).equals("37")) {
        return "American Express";
    } else if (card.substring(0, 2).equals("36")) {
        return "Diner Club";
    } else if (card.substring(0, 2).equals("51") ||
               card.substring(0, 2).equals("55")) {
        return "Mastercard";
    } else if (card.substring(0, 4).equals("6011") ||
               card.substring(0, 2).equals("65")) {
        return "Discover";
    } else {
        return "Unknown";
    }
}

String pigLatin(String word) {
    return word.substring(1) + word.substring(0, 1) + "ay";
}

String nycLocate(String zip) {
    String prefix = zip.substring(0, 3);

    if (prefix.equals("100") ||
        prefix.equals("101") ||
        prefix.equals("102")) {
        return "Manhattan";
    } else if (prefix.equals("103")) {
        return "Staten Island";
    } else if (prefix.equals("104")) {
        return "Bronx";
    } else if (prefix.equals("112")) {
        return "Brooklyn";
    } else if (prefix.equals("113") ||
               prefix.equals("114") ||
               prefix.equals("111")) {
        return "Queens";
    } else {
        return "Unknown";
    }
}

public static String getMonth(String date) {
    String month = date.substring(0, 2);

    if (month.equals("01")) {
        return "January";
    } else if (month.equals("02")) {
        return "February";
    } else if (month.equals("03")) {
        return "March";
    } else if (month.equals("04")) {
        return "April";
    } else if (month.equals("05")) {
        return "May";
    } else if (month.equals("06")) {
        return "June";
    } else if (month.equals("07")) {
        return "July";
    } else if (month.equals("08")) {
        return "August";
    } else if (month.equals("09")) {
        return "September";
    } else if (month.equals("10")) {
        return "October";
    } else if (month.equals("11")) {
        return "November";
    } else if (month.equals("12")) {
        return "December";
    } else {
        return "Invalid month";
    }
}

public static boolean validatePswd(String password) {
    if (password.length() < 5 || password.length() > 8) {
        return false;
    }

    if (password.indexOf("^") != -1 ||
        password.indexOf("*") != -1 ||
        password.indexOf("(") != -1 ||
        password.indexOf(")") != -1) {
        return false;
    }

    return true;
}

  void init(){
   
  }

  
  
}