package com.example.thedeliverer;

public class User {
    private   String id;
    private   String fname;
    private   String lname;
    private   String email;
    private   String contactNo;
    private   String password;


    public User(String id, String fname, String lname, String email, String contactNo,String password) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.contactNo = contactNo;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
