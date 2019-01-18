/*
 * Releans
 *
 * This file was automatically generated for Releans by APIMATIC v2.0 ( https://apimatic.io ).
 */
package Releans.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import Releans.*;
import Releans.models.*;
import Releans.exceptions.*;
import Releans.http.client.HttpClient;
import Releans.http.client.HttpContext;
import Releans.http.request.HttpRequest;
import Releans.http.response.HttpResponse;
import Releans.http.response.HttpStringResponse;
import Releans.http.client.APICallBack;
import Releans.controllers.syncwrapper.APICallBackCatcher;

public class SenderController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static SenderController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SenderController class 
     */
    public static SenderController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new SenderController();
                }
            }
        }
        return instance;
    }

    /**
     * Return the details of the sender name.
     * @param    id    Required parameter: The sender id you want its details
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse getSenderNameDetails(
                final String id
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        getSenderNameDetailsAsync(id, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Return the details of the sender name.
     * @param    id    Required parameter: The sender id you want its details
     * @return    Returns the void response from the API call 
     */
    public void getSenderNameDetailsAsync(
                final String id,
                final APICallBack<DynamicResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //validating required parameters
                if (null == id) {
                    callBack.onFailure(null, new NullPointerException("The parameter \"id\" is a required parameter and cannot be null."));
                    return;
                }

                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/sender/view/");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("id", id);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();

                _headers.put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
                _headers.put("user-agent", BaseController.userAgent);
                _headers.put("accept", "application/json");


                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();

                            //return null on 404
                            if (_responseCode == 404)
                                callBack.onSuccess(_context, null);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Create a new sender id to send messages using it
     * @param    senderName    Required parameter: Name you want to register as Sender Name
     * @return    Returns the String response from the API call 
     */
    public String createSenderName(
                final String senderName
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createSenderNameAsync(senderName, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Create a new sender id to send messages using it
     * @param    senderName    Required parameter: Name you want to register as Sender Name
     * @return    Returns the void response from the API call 
     */
    public void createSenderNameAsync(
                final String senderName,
                final APICallBack<String> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //validating required parameters
                if (null == senderName) {
                    callBack.onFailure(null, new NullPointerException("The parameter \"senderName\" is a required parameter and cannot be null."));
                    return;
                }

                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/sender/create");

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();

                _headers.put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
                _headers.put("user-agent", BaseController.userAgent);
                _headers.put("content-type", "text/plain; charset=utf-8");


                //prepare and invoke the API call request to fetch the response
                String _bodyJson;
                _bodyJson = senderName;
                final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, _bodyJson);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();

                            //return null on 404
                            if (_responseCode == 404)
                                callBack.onSuccess(_context, null);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * List all senders names associated with the account
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse getAllSenders(
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        getAllSendersAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * List all senders names associated with the account
     * @return    Returns the void response from the API call 
     */
    public void getAllSendersAsync(
                final APICallBack<DynamicResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/sender");

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();

                _headers.put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
                _headers.put("user-agent", BaseController.userAgent);
                _headers.put("accept", "application/json");


                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();

                            //return null on 404
                            if (_responseCode == 404)
                                callBack.onSuccess(_context, null);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}