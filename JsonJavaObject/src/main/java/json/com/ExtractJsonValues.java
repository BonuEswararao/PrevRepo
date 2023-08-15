package json.com;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtractJsonValues {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		//Conversion of Json to Java Object 
		ObjectMapper oj = new ObjectMapper();
		CustomerDetails cd = oj.readValue(new File("C:\\Users\\eswara pottira\\Documents\\workspace-sts-3.9.12.RELEASE\\JsonJavaObject\\customerInfo1.json"), CustomerDetails.class);
		System.out.println(cd.getCourseName());
	}

}
