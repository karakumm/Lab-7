package facebook;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String userMail;
    private String country;
    private Date lastActiveTime;
}

