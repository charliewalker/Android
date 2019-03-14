package com.example.dangvannam.dangvannam_1706020107_11thcapplication.Model;

import java.io.Serializable;

public class ContactModel {
    public class ContactModel implements Serializable {
        public ContactModel(int mId,String mName, String mPhone, String mAddress){
            this.Name = mName;
            this.PhoneNumber = mPhone;
            this.Address = mAddress;
            this.Id = mId;
        }
        private int Id;
        private String Name;
        private String PhoneNumber;
        private String Address;

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }
        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getPhoneNumber() {
            return PhoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }
    }
