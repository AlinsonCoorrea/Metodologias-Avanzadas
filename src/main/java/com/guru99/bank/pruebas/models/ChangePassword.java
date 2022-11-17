package com.guru99.bank.pruebas.models;

public class ChangePassword {
    String oldpassword,newpassword,confirmpassword;

    public ChangePassword(String oldpassword, String newpassword, String confirmpassword) {
        this.oldpassword = oldpassword;
        this.newpassword = newpassword;
        this.confirmpassword = confirmpassword;
    }

    public String getOldpassword() {
        return oldpassword;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }
}
