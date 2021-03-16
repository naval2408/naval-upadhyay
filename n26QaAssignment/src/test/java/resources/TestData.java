package resources;

import pojo.User;

public class TestData {
    public User addUserPayload(int id, String userName, String firstName,
                               String lastName, String email, String password,
                               String phoneNumber, int userStatus)
    {
        return new User(id, userName, firstName,
            lastName,email,password,phoneNumber,userStatus);
    }
}
