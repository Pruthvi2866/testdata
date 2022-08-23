import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification b1 = RestAssured.given();//abstarction
	
	
	//json pbject
JSONObject obj=new JSONObject();
	obj.put("name","morphus");
	obj.put("job", "automation engg");
	
	b1.contentType(ContentType.JSON);
	b1.body(obj.toJSONString());
	
	//response
	Response res=b1.request(Method.POST,"/api/users");
	System.out.println(res.asString());
	System.out.println(res.prettyPrint());
}
}
