package org.william.setup.login;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.william.setup.baseRequest.BaseAPI;
import org.william.setup.data.factory.LoginCredentialsFactory;

import static io.restassured.RestAssured.given;
import static org.william.setup.data.suite.TestTags.LOGIN;

@Tag(LOGIN)
public class LoginTest extends BaseAPI {

    LoginCredentialsFactory loginCredentialsFactory = new LoginCredentialsFactory();

    @Test
    @DisplayName("Login successfully with valid credentials - expected code 200")
    void createUserSuccessfully(){

        given()
                .headers(this.headers)
                .body(loginCredentialsFactory.validLoginCredentials())
                .when()
                .post(this.props.loginUrl())
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
