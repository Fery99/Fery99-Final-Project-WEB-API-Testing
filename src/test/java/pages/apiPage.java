package pages;

import helper.Endpoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;

import static helper.Models.*;
import static org.assertj.core.api.Assertions.assertThat;

public class apiPage {
    String global_user_id, id_put;
    String setURL;
    Response res;

    public void prepareUrlFor(String url) {
        switch (url) {
            case "GET_LIST_USER":
                setURL = Endpoint.GET_LIST_USER;
                break;
            case "CREATE_NEW_USER":
                setURL = Endpoint.CREATE_NEW_USER;
                break;
            case "PUT_USER":
                setURL = Endpoint.PUT_USER;
                break;
            case "DELETE_USER":
                setURL = Endpoint.DELETE_USER;
                break;
            case "TAG_USER":
                setURL = Endpoint.TAG_USER;
                break;
            default:
                System.out.println("input right url");
        }
        System.out.println("endpoint siap pakai adalahhh: " + setURL);
    }

    public void hitApiGetListUsers(){

        res = getListUsers(setURL);
//        System.out.println(res.getBody().asString());
    }

    public void validationStatusCodeIsEquals(int status_code){
        assertThat(res.statusCode()).isEqualTo(status_code);
    }

    public void validationResponseBodyGetListUsers(){
        String id = res.jsonPath().getString("data[0].id");
        String title = res.jsonPath().getString("data[0].title");
        String firstName = res.jsonPath().getString("data[0].firstName");
        String lastName = res.jsonPath().getString("data[0].lastName");
        String pictureUrl = res.jsonPath().getString("data[0].picture");

        // Print the ID and Title
//        System.out.println("ID at index 0: " + id);
//        System.out.println("Title at index 0: " + title);
//        System.out.println("firstName at index 0: " + firstName);
//        System.out.println("lastName at index 0: " + lastName);
//        System.out.println("Picture at index 0: " + pictureUrl);


        assertThat(id).isNotNull();
        assertThat(title).isIn("ms", "miss", "mr", "mrs");
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(pictureUrl).isNotNull();
    }

    public void validationResponseJsonWithJSONSchema(String filename){
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void hitApiPostCreateNewUsers(){
        res = postCreateUsers(setURL);
//        System.out.println(res.getBody().asString());
    }


    public void validationResponseBodyPostCreateNewUser(){
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.getString("id");
        String title = jsonPathEvaluator.getString("title");
        String firstName = jsonPathEvaluator.getString("firstName");
        String lastName = jsonPathEvaluator.getString("lastName");
        String picture = jsonPathEvaluator.getString("picture");
        String email = jsonPathEvaluator.getString("email");
        String registerDate =jsonPathEvaluator.getString("registerDate");
        String updatedDate = jsonPathEvaluator.getString("updatedDate");

        // Print the extracted data
//        System.out.println("ID: " + id);
//        System.out.println("Title: " + title);
//        System.out.println("First Name: " + firstName);
//        System.out.println("Last Name: " + lastName);
//        System.out.println("Picture: " + picture);
//        System.out.println("Email: " + email);
//        System.out.println("Register Date: " + registerDate);
//        System.out.println("Updated Date: " + updatedDate);



        assertThat(id).isNotNull();
        assertThat(title).isIn("ms", "miss", "mr", "mrs");
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(picture).isNotNull();
        assertThat(email).isNotNull();
        assertThat(registerDate).isNotNull();
        assertThat(updatedDate).isNotNull();

        global_user_id= id;
//        System.out.println("id nya adalah:" + global_user_id);
    }

    public void hitApiDeleteNew(){
        res = deleteUser(setURL,global_user_id);
    }


    public void validationResponseBodyPutEditUser(){
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.getString("id");
        String title = jsonPathEvaluator.getString("title");
        String firstName = jsonPathEvaluator.getString("firstName");
        String lastName = jsonPathEvaluator.getString("lastName");
        String picture = jsonPathEvaluator.getString("picture");
        String email = jsonPathEvaluator.getString("email");
        String registerDate =jsonPathEvaluator.getString("registerDate");
        String updatedDate = jsonPathEvaluator.getString("updatedDate");

        assertThat(id).isNotNull();
        assertThat(title).isIn("ms", "miss", "mr", "mrs");
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(picture).isNotNull();
        assertThat(email).isNotNull();
        assertThat(registerDate).isNotNull();
        assertThat(updatedDate).isNotNull();

        global_user_id= id;
        System.out.println("id nya adalh:" + global_user_id);
    }

    public void hitApiPut(){
        res = putEditUsers(setURL, global_user_id);
//        System.out.println(res.getBody().asString());
    }


    public void hitApiGetTagUsers(){
        res = getTagUsers(setURL);
//        System.out.println(res.getBody().asString());
    }

}
