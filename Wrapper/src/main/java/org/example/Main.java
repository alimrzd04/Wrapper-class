package org.example;

class Email {
    private String value;

    public Email(String value) {
        if (value.contains("@")) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Emaili dogru yazin");
        }

        if (value.contains("gmail.com")) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("'gmail.com' provayderinden istifade edilmelidir! ");
        }

        int valueIndex = value.indexOf("@");
        if (valueIndex == 0) {
            throw new IllegalArgumentException("Email-i duzgun yazin. Provayderden evvelki hisse bos ola bilmez! ");
        }

//        for (int i = 0; i < value.length();i++) {
//            char c = value.charAt(i);
//
//            if (!(c == '_' || c == '!' || c == '?')) {
//                throw new IllegalArgumentException("Email-i duzgun yazin.Yalniz '_' , '?', '!' - bu isarelerden istifade ede bilersiniz! ");
//
//            }
//        }
//        this.value = value;
    }
}

class Age {

    private int age;

    public Age(int age) {
        if (age < 0 || age == 0) {
            throw new IllegalArgumentException("Yas 0-a beraber ve 0-dan kicik ola bilmez!");
        }
        this.age = age;
    }

}

class Number {
    private String number;

    public Number(String number) {
        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Nomre bos qebul edilmir.");
        }
        this.number = number;


        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);

            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Nomre yalniz reqemlerden ibaret olmalidir.");

            }
        }
        if (number.length() > 10) {
            throw new IllegalArgumentException("Nomre duzgun deyil.Reqemlerin sayi standartlardan kenara cixir.");
        }

    }


}
