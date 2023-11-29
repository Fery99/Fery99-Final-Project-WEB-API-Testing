package helper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;


public class Models {
    private static RequestSpecification request;

    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "655555eae2307219a343efb8");
    }

    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response getTagUsers(String endpoint){
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response postCreateUsers(String endpoint) {
        String title = "mr";
        String firstName = "haha";
        String lastName = "hihi";
        String picture = "www.google.com";
        String email = generateRandomEmail();
        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("picture", picture);
        payload.put("email", email);


//        System.out.println("Title: " + title);
//        System.out.println("firstName: " + firstName);
//        System.out.println("lastName: " + lastName);
//        System.out.println("Picture: " + picture);
//        System.out.println("email: " + email);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }

    public static Response deleteUser(String endpoint, String user_id) {
        setupHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
//        System.out.println("endpoint delete:"+finalEndpoint);
        return request.when().delete(finalEndpoint);
    }

    public static Response putEditUsers(String endpoint, String user_id) {
        String title = "ms";
        String firstName = "hoho";
        String lastName = "hehe";
        String picture = "www.java.com";
        String email = generateRandomEmail();
        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("picture", picture);
        payload.put("email", email);

        setupHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
//        System.out.println("endpoint:"+finalEndpoint);
        return request.body(payload.toString()).when().put(finalEndpoint);

    }
}
