/*
 * Releans
 *
 * This file was automatically generated for Releans by APIMATIC v2.0 ( https://apimatic.io ).
 */
package Releans;

import Releans.controllers.*;
import Releans.http.client.HttpClient;

public class ReleansClient {
    /**
     * Singleton access to Message controller
     * @return	Returns the MessageController instance 
     */
    public MessageController getMessage() {
        return MessageController.getInstance();
    }

    /**
     * Singleton access to Sender controller
     * @return	Returns the SenderController instance 
     */
    public SenderController getSender() {
        return SenderController.getInstance();
    }

    /**
     * Singleton access to Balance controller
     * @return	Returns the BalanceController instance 
     */
    public BalanceController getBalance() {
        return BalanceController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public ReleansClient() {
    }

    /**
     * Client initialization constructor 
     */     
    public ReleansClient(String oAuthAccessToken) {
        this();
        Configuration.oAuthAccessToken = oAuthAccessToken;
    }
}