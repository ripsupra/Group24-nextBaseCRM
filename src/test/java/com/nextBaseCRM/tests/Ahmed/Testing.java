package com.nextBaseCRM.tests.Ahmed;

public class Testing {
    private static String loginHr1, loginHr2, loginHelpDesk1, loginHelpDesk2, loginMark1, loginMark2;
    static {
        loginHelpDesk1 = "helpdesk47@cybertekschool.com";
        loginHelpDesk2 = "helpdesk48@cybertekschool.com";
        loginMark1 = "marketing47@cybertekschool.com";
        loginMark2 = "marketing47@cybertekschool.com";
        loginHr1 = "hr47@cybertekschool.com";
        loginHr2 = "hr48@cybertekschool.com";
    }

    public static void main(String[] args) throws InterruptedException {
        //Test Case #1 Sending a message with all users
        MessagingFeature.sendMessage(loginHr1, "selenium Test HR-47");
        MessagingFeature.sendMessage(loginHr2, "selenium Test HR-48");
        MessagingFeature.sendMessage(loginHelpDesk1, "selenium Test Helpdesk 47");
        MessagingFeature.sendMessage(loginHelpDesk2, "selenium Test Helpdesk 48");
        MessagingFeature.sendMessage(loginMark1, "selenium Test Marketing 47");
        MessagingFeature.sendMessage(loginMark2, "selenium Test Marketing 48");
        //Test Case #2 Cancel message with all users
        MessagingFeature.cancelMessage(loginHr1, "Testing cancel HR-47");
        MessagingFeature.cancelMessage(loginHr2, "Testing cancel HR-48");
        MessagingFeature.cancelMessage(loginHelpDesk1, "Testing cancel Helpdesk 47");
        MessagingFeature.cancelMessage(loginHelpDesk2, "Testing cancel Helpdesk 48");
        MessagingFeature.cancelMessage(loginMark1, "Testing cancel Marketing 47");
        MessagingFeature.cancelMessage(loginMark2, "Testing cancel Marketing 48");
        //Test Case #3 Attach a link for all users of group2400
        MessagingFeature.attachLink(loginHr1, "https://www.HelloWorld.com", "just a simple Link HR-47");
        MessagingFeature.attachLink(loginHr2, "https://www.HelloWorld.com", "just a simple Link HR-48");
        MessagingFeature.attachLink(loginHelpDesk1, "https://www.HelloWorld.com", "just a simple Link Helpdesk 47");
        MessagingFeature.attachLink(loginHelpDesk2, "https://www.HelloWorld.com", "just a simple Link Helpdesk 48");
        MessagingFeature.attachLink(loginMark1, "https://www.HelloWorld.com", "just a simple Link Marketing 47");
        MessagingFeature.attachLink(loginMark2, "https://www.HelloWorld.com", "just a simple Link Marketing 48");



    }
}

/*
helpdesk47@cybertekschool.com
helpdesk48@cybertekschool.com
---
marketing47@cybertekschool.com
marketing48@cybertekschool.com
---
hr47@cybertekschool.com
hr48@cybertekschool.com
 */