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


class HttpClientRequestsExample {
	public static void main(String[] args) throws Exception {
		httpGetRequest();
		httpPostRequest();

		asyncGetRequest();
	}

	/*	make a siple get request */
	public static void httpGetRequest() throws URISyntaxException, IOException, InterruptedException {
		//	setup a client
		HttpClient client = HttpClient.newHttpClient();
		//	build a GET request
		HttpRequest request = HttpRequest.newBuilder().version(HttpClient.Version.HTTP_2).uri(URI.create("http://jsonplaceholder.typicode.com/posts/1")).header("Accept-Encoding", "gzip deflate").build();
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

	public static void httpPostRequest() throws URISyntaxException, IOException, InterruptedException {
		//	setup a client
		HttpClient client = HttpClient.newHttpClient();
		//	build a POST request
		HttpRequest request = HttpRequest.newBuilder(new URI("http://jsonplaceholder.typicode.com/posts")).version(HttpClient.Version.HTTP_2).POST(BodyPublishers.ofString("sample post request")).build();
		//	send request & capture response
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		//	extract body from response
		String responseBody = response.body();
		//	take status code from response
		int responseStatusCode = response.statusCode();

		System.out.println("\n\t\tHTTP POST Request\n");

		System.out.println("HttpPostRequest: " + responseBody);
		System.out.println("HttpPostRequest Status Code: " + responseStatusCode);
	}



	//	i'm not able to understand this async request!

	public static void asyncGetRequest() throws URISyntaxException {
		//	client
		HttpClient client = HttpClient.newHttpClient();
		//	Http URI
		URI httpURI = new URI("http://jsonplaceholder.typicode.com/posts/1");
		//	build request
		HttpRequest request = HttpRequest.newBuilder(httpURI).version(HttpClient.Version.HTTP_2).build();
		//	send request
		CompletableFuture<Void> futureResponse = client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenAccept(resp -> {
			System.out.println("Get pushed response " + resp.uri());
			System.out.println("response statuscode: " + resp.statusCode());
			System.out.println("response Body: " + resp.body());
		});
		System.out.println("futureResponse " + futureResponse);
	}


}