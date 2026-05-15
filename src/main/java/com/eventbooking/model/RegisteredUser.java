package com.eventbooking.model;

public class RegisteredUser extends User {

    // RegisteredUser's OWN extra field
    private String membershipType; // STANDARD or PREMIUM

    public RegisteredUser(String userId, String name, String email, String password, String phone, String membershipType) {
        super(userId, name, email, password, phone);
        this.membershipType = membershipType;
    }

    @Override
    public String getRole() {
        return "USER";
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + membershipType;
    }
}