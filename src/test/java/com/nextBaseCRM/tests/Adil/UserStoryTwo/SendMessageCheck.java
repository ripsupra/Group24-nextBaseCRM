package com.nextBaseCRM.tests.Adil.UserStoryTwo;

public class SendMessageCheck extends UserStoryTwoMethod {
    public static void main(String[] args) throws InterruptedException {
        SendMessageCheck check = new SendMessageCheck();
        System.out.println("=========================Help Desk User Check=========================");
        check.sendMessage("helpdesk47@cybertekschool.com", "UserUser", "IM IN HELL");
        check.cancelMessage("helpdesk47@cybertekschool.com", "UserUser");
        check.attachLink("helpdesk47@cybertekschool.com", "UserUser", "spotify link", "www.spotify.com");
        check.sendMessage("helpdesk48@cybertekschool.com", "UserUser", "IM IN HELL");
        check.cancelMessage("helpdesk48@cybertekschool.com", "UserUser");
        check.attachLink("helpdesk48@cybertekschool.com", "UserUser", "spotify link", "www.spotify.com");
        System.out.println("=========================Marketing User Check=========================");
        check.sendMessage("marketing47@cybertekschool.com", "UserUser", "IM IN HELL");
        check.cancelMessage("marketing47@cybertekschool.com", "UserUser");
        check.attachLink("marketing47@cybertekschool.com", "UserUser", "spotify link", "www.spotify.com");
        check.sendMessage("marketing48@cybertekschool.com", "UserUser", "IM IN HELL");
        check.cancelMessage("marketing48@cybertekschool.com", "UserUser");
        check.attachLink("marketing48@cybertekschool.com", "UserUser", "spotify link", "www.spotify.com");
        System.out.println("=========================HR check=========================");
        check.sendMessage("hr47@cybertekschool.com", "UserUser", "IM IN HELL");
        check.cancelMessage("hr47@cybertekSchool.com", "UserUser");
        check.attachLink("hr47@cybertekSchool.com", "UserUser", "spotify link", "www.spotify.com");
        check.sendMessage("hr48@cybertekSchool.com", "UserUser", "IM IN HELL");
        check.cancelMessage("hr48@cybertekSchool.com", "UserUser");
        check.attachLink("hr48@cybertekSchool.com", "UserUser", "spotify link", "www.spotify.com");

    }
}
