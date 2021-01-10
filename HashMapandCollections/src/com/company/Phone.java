package com.company;

public class Phone {
       private int price;
       private   String brand;
       private   int year;
       private String oSType;

        public Phone(int price, String brand, int year, String oSType) {
            this.price = price;
            this.brand = brand;
            this.year = year;
            this.oSType = oSType;
        }

        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getoSType() {
            return oSType;
        }

        public void setoSType(String oSType) {
            this.oSType = oSType;
        }

}
