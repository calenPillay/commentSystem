package factory;

import domain.User;

/**
 * Created by 210218673 on 5/2/2017.
 */
public class UserFactory {

    public static User getUser()
    {
        return new User();
    }
}
