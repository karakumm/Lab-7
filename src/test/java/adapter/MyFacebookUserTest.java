package adapter;

import facebook.FacebookUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    private FacebookUser fbUser;
    private MyFacebookUser fbAdapted;
    private Date date;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        date = new Date();
        fbUser = new FacebookUser("oleno4ka@gmail.com", "Guadeloupe", date);
        fbAdapted = new MyFacebookUser(fbUser);
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(fbUser.getUserMail(), fbAdapted.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getDate() {
        assertEquals(fbUser.getLastActiveTime(), fbAdapted.getDate());
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(fbUser.getCountry(), fbAdapted.getCountry());
    }
}