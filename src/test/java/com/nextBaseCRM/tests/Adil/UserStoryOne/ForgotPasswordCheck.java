package com.nextBaseCRM.tests.Adil.UserStoryOne;

public class ForgotPasswordCheck extends UserStoryOneMethod {
    public static void main(String[] args) {

        ForgotPasswordCheck check = new ForgotPasswordCheck();

        check.forgotPassword("helpdesk47@cybertekschool.com");
        check.forgotPassword("helpdesk48@cybertekschool.com");
        check.forgotPassword("marketing47@cybertekschool.com");
        check.forgotPassword("marketing48@cybertekschool.com");
        check.forgotPassword("hr47@cybertekschool.com");
        check.forgotPassword("hr48@cybertekschool.com");

    }
}
