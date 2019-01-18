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

public class MessageController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static MessageController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the MessageController class 
     */
    public static MessageController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new MessageController();
                }
            }
        }
        return instance;
    }

    /**
     * List all messages sent by the account.
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse getAllMessages(
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        getAllMessagesAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * List all messages sent by the account.
     * @return    Returns the void response from the API call 
     */
    public void getAllMessagesAsync(
                final APICallBack<DynamicResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/message");

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
     * Return cost of sending a message to the number.
     * @param    mobileNumber    Required parameter: Mobile number you want to know the price of sending a message.
     * @return    Returns the String response from the API call 
     */
    public String getPriceOfMessage(
                final String mobileNumber
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getPriceOfMessageAsync(mobileNumber, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Return cost of sending a message to the number.
     * @param    mobileNumber    Required parameter: Mobile number you want to know the price of sending a message.
     * @return    Returns the void response from the API call 
     */
    public void getPriceOfMessageAsync(
                final String mobileNumber,
                final APICallBack<String> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //validating required parameters
                if (null == mobileNumber) {
                    callBack.onFailure(null, new NullPointerException("The parameter \"mobileNumber\" is a required parameter and cannot be null."));
                    return;
                }

                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/message/price");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("mobileNumber", mobileNumber);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();

                _headers.put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
                _headers.put("user-agent", BaseController.userAgent);


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
     * Return the details of the message.
     * @param    id    Required parameter: Id of the message you need to return its details.
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse getViewMessage(
                final String id
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        getViewMessageAsync(id, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Return the details of the message.
     * @param    id    Required parameter: Id of the message you need to return its details.
     * @return    Returns the void response from the API call 
     */
    public void getViewMessageAsync(
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
                StringBuilder _queryBuilder = new StringBuilder("/message/view");

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
     * Send a single message.
     * @param    senderId    Required parameter: Sender id to send the message from.
     * @param    mobileNumber    Required parameter: The mobile number supposed to receive the message.
     * @param    message    Required parameter: Message text.
     * @return    Returns the String response from the API call 
     */
    public String createSendSMSMessage(
                final String senderId,
                final String mobileNumber,
                final String message
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createSendSMSMessageAsync(senderId, mobileNumber, message, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Send a single message.
     * @param    senderId    Required parameter: Sender id to send the message from.
     * @param    mobileNumber    Required parameter: The mobile number supposed to receive the message.
     * @param    message    Required parameter: Message text.
     * @return    Returns the void response from the API call 
     */
    public void createSendSMSMessageAsync(
                final String senderId,
                final String mobileNumber,
                final String message,
                final APICallBack<String> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //validating required parameters
                if (null == senderId) {
                    callBack.onFailure(null, new NullPointerException("The parameter \"senderId\" is a required parameter and cannot be null."));
                    return;
                }

                if (null == mobileNumber) {
                    callBack.onFailure(null, new NullPointerException("The parameter \"mobileNumber\" is a required parameter and cannot be null."));
                    return;
                }

                if (null == message) {
                    callBack.onFailure(null, new NullPointerException("The parameter \"message\" is a required parameter and cannot be null."));
                    return;
                }

                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/message/send");

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();

                _headers.put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
                _headers.put("user-agent", BaseController.userAgent);


                //load all fields for the outgoing API request
                Map<String, Object> _parameters = new HashMap<String, Object>();
                _parameters.put("senderId", senderId);
                _parameters.put("mobileNumber", mobileNumber);
                _parameters.put("message", message);

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

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

}