package com.example.dangvannam.dangvannam_1706020107_11thcapplication.Model;

public class loginModel {
    private String UserName;
    private int Age;
    private String PhoneNumber;

    public loginModel(String userName, int age, String phoneNumber) {
        UserName = userName;
        Age = age;
        PhoneNumber = phoneNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    @Override
    @Override
    public String toString() {
        return this.getUserName() + " - " + this.Age + " - " + this.PhoneNumber;
    }
}