import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse.PushPromiseHandler;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;


class GEU {
	public static void main(String[] args) throws Exception {
		getReq();
	}

	public static void getReq() throws URISyntaxException, IOException, InterruptedException {
		//	setup a client
		HttpClient client = HttpClient.newHttpClient();
		//	build a GET request
		HttpRequest request = HttpRequest.newBuilder().version(HttpClient.Version.HTTP_2).uri(URI.create("https://student.geu.ac.in/")).header("Accept-Encoding", "gzip deflate").build();
		//	send the request & get response
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		//	take body from response 
		String responseBody = response.body();
		//	take status code from response
		int responseStatusCode = response.statusCode();

		System.out.println("\n\t\tHTTP GET Request\n");

		System.out.println("HttpGetRequest: " + responseBody);
		System.out.println("HttpGetRequest Status Code: " + responseStatusCode);
	}

	public static void badReq() throws URISyntaxException, IOException, InterruptedException {

		String cookie = "ASP.NET_SessionId=oncbnmryg1arrozosbksgn1n; __RequestVerificationToken=5FcvIj_7B_IPx4Ff0Y85ypkR3FJ8UoRr_7UW5lfcd5jmavtOh8Rq9RGPGB3RBf_eECa8-eQBAhXRtPYSGJbxN_gyIKRH7mwO6232eZAviYtcGo4TY5G32U7Gatw8fwil6UgKNOVzDgk5jj9R_tT9PQ2; myCookie=uid=47279&UserID=19151081&Password=EDBDHJJI";

		//	setup a client
		HttpClient client = HttpClient.newHttpClient();
		//	build a POST request
		HttpRequest request = HttpRequest.newBuilder(new URI("https://student.geu.ac.in/Account/GetStudentDetail")).version(HttpClient.Version.HTTP_2).POST(BodyPublishers.ofString("sample post request")).header("Accept-Encoding", "gzip deflate").header("cookie", cookie).header("Accept", "*/*").header("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8").header("Referer", "https://student.geu.ac.in/").build();
		//	send request & capture response
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

		//	take body from response 
		String responseBody = response.body();
		//	take status code from response
		int responseStatusCode = response.statusCode();

		System.out.println("\n\t\tHTTP Request\n");

		System.out.println("Request: " + responseBody);
		System.out.println("Status Code: " + responseStatusCode);
	}
}