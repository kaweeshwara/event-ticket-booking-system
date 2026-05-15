package com.eventbooking.model;

public class AdminUser extends User {

    // AdminUser's OWN extra field
    private String adminLevel; // SUPER or REGULAR

    public AdminUser(String userId, String name, String email, String password, String phone, String adminLevel) {
        super(userId, name, email, password, phone);
        this.adminLevel = adminLevel;
    }

    @Override
    public String getRole() {
        return "ADMIN";
    }

    public String getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + adminLevel;
    }
}