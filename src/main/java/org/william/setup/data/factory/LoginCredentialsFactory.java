package org.william.setup.data.factory;

import org.apache.commons.lang3.StringUtils;
import org.william.setup.config.ConfigurationManager;
import org.william.setup.model.LoginCredentials;

public class LoginCredentialsFactory {

    public LoginCredentials validLoginCredentials(){
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setEmail(ConfigurationManager.getConfiguration().userEmailCredential());
        loginCredentials.setPassword(ConfigurationManager.getConfiguration().userPasswordCredential());
        return loginCredentials;
    }
}
