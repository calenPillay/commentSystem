package domain;

import java.io.Serializable;

/**
 * Created by 210218673 on 5/2/2017.
 */
public class User implements Serializable, Comparable<User> {

    public String email;
    public String screenName;
    public String password;
    public String status;


    public User()
    {

    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public int compareTo(User user) {
        return email.compareTo(user.email);
    }
}
