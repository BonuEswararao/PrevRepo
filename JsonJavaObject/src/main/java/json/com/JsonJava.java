package json.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.lang3.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonJava {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, JsonGenerationException, JsonMappingException, IOException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		ArrayList<CustomerDetails> list = new ArrayList<CustomerDetails>();
		//For Converting the Java Object to Json String
		Gson gson = new Gson();
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		Connection connection = null;
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "Tesla@2025");
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from CustomerInfo where purchasedDate=CURRENT_DATE();");
		while(resultSet.next()){
			CustomerDetails customerDetails = new CustomerDetails();
			customerDetails.setCourseName(resultSet.getString("CourseName"));
			customerDetails.setPurchasedDate(resultSet.getString("PurchasedDate"));
			customerDetails.setAmount(resultSet.getInt("Amount"));
			customerDetails.setLocation(resultSet.getString("Location"));
			list.add(customerDetails);
		}
		
		for(int i=0; i<list.size();i++) {
			ObjectMapper oj = new ObjectMapper();
			oj.writeValue(new File("C:\\Users\\eswara pottira\\Documents\\workspace-sts-3.9.12.RELEASE\\JsonJavaObject\\customerInfo"+i+".json"), list.get(i));
			String gsonString = gson.toJson(list.get(i));
			jsonArray.add(gsonString);
		}
		
		jsonObject.put("data", jsonArray);
		System.out.println(jsonObject.toJSONString());
		String unEscapeString = StringEscapeUtils.unescapeJava(jsonObject.toJSONString());
		System.out.println(unEscapeString);
		String start = unEscapeString.replace("\"{", "{");
		String finalString = start.replace("}\"", "}");
		System.out.println(finalString);
		FileWriter writer = new FileWriter("C:\\Users\\eswara pottira\\Documents\\workspace-sts-3.9.12.RELEASE\\JsonJavaObject\\singleJon.json");
		writer.write(finalString);
		connection.close();
	}

}
