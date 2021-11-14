package adapter;

import lombok.AllArgsConstructor;
import twitter.TwitterUser;

import java.util.Date;

@AllArgsConstructor
public class MyTwitterUser implements User {
    private TwitterUser user;

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
