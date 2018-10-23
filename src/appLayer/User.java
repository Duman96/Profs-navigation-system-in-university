package appLayer;

import DataBaseLayer.Database_User;

public class User {

    public boolean isValidUserCredentials(String sUserName, String sUserPassword){

        Database_User dbuser = new Database_User();

        return dbuser.isValidUser(sUserName, sUserPassword);

    }

}
