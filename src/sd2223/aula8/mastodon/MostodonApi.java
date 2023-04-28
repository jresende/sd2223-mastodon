package sd2223.aula8.mastodon;

import com.github.scribejava.core.builder.api.DefaultApi20;                                                               

public class MostodonApi extends DefaultApi20 {                                                                           
    private static final String AUTHORIZE_URL = "https://mostodon.social/oauth/authorize";                        
    private static final String ACCESS_TOKEN_RESOURCE = "https://mostodon.social/api/v1/oauth/token";                        
                                                                                                                           
    protected MostodonApi() {                                                                                              
    }                                                                                                                      
                                                                                                                           
    private static class InstanceHolder {                                                                                  
        private static final MostodonApi INSTANCE = new MostodonApi();                                                        }                                                                                                                      
                                                                                                                           
    public static MostodonApi instance() {                                                                                 
        return InstanceHolder.INSTANCE;                                                                                    
    }                                                                                                                      
                                                                                                                           
    @Override                                                                                                              
    public String getAccessTokenEndpoint(){                                                                                
        return ACCESS_TOKEN_RESOURCE;                                                               
    }                                                                                                                      
                                                                                                                           
 
                                                                                                                           
    @Override                                                                                                              
    public String getAuthorizationBaseUrl() {                                                   
	return AUTHORIZE_URL;
    }                                                                                                                      
}          
