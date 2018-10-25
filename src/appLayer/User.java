package appLayer;

import DataBaseLayer.Database_User;

public class User {

    public boolean isValidUserCredentials(String sUserName, String sUserPassword){

        Database_User dbuser = new Database_User();

        return dbuser.isValidUser(sUserName, sUserPassword);

    }

    public boolean isValidAdminCredentials(String sUserName, String sUserPassword){

        Database_User dbadmin = new Database_User();

        return dbadmin.isValidAdmin(sUserName, sUserPassword);

    }

    public boolean isAdmin (String username, String userpwd){

        boolean isValid = false;

        if (username.equals("admin") && userpwd.equals("admin")){

            isValid = true;
        }

        return isValid;
    }
}
