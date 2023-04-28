package sd2223.aula8.mastodon;


import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;

public class CreatePost {

    private static final String apiKey = "";
    private static final String apiSecret = "";
    private static final String accessTokenStr = "";
    private static final String PROTECTED_RESOURCE_URL="https://mastodon.social/api/v1/statuses";
    
    private static final int HTTP_SUCCESS = 200;
    private static final String CONTENT_TYPE_HDR = "Content-Type";
    private static final String JSON_CONTENT_TYPE = "application/json; charset=utf-8";
    		
 	
    public static void main(String[] args) throws Exception {
	    
	final OAuth2AccessToken accessToken = new OAuth2AccessToken(accessTokenStr);            
	final OAuth20Service service = new ServiceBuilder(apiKey).apiSecret(apiSecret).build(MostodonApi.instance());
	    
	final OAuthRequest request = new OAuthRequest(Verb.POST, PROTECTED_RESOURCE_URL);
	request.addBodyParameter("status","ola");
	request.addBodyParameter("media_ids","[]");
	request.addBodyParameter("poll","null");
	// pode trocar para public
	//request.addBodyParameter("visibility","private");
	
	
	service.signRequest(accessToken, request);
	
	try (Response response = service.execute(request)) {
	    System.out.println("Got it!");
	    System.out.println();
	    System.out.println(response.getCode());
	    System.out.println(response.getBody());
	}

	System.out.println();
	System.out.println("Thats it!");
    }

}
