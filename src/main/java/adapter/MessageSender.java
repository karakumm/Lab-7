package adapter;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (user.getCountry().equals(country)) {
            return true;
        }
        else {
            return false;
        }
    }

}
