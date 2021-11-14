package adapter;

import facebook.FacebookUser;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class MyFacebookUser implements User {
    private FacebookUser user;

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public Date getDate() {
        return user.getLastActiveTime();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }
}
