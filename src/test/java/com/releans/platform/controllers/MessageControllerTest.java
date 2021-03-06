/*
 * ReleansAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.releans.platform.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.releans.platform.models.*;
import com.releans.platform.exceptions.*;
import com.releans.platform.APIHelper;
import com.releans.platform.Configuration;
import com.releans.platform.testing.TestHelper;
import com.releans.platform.controllers.MessageController;

import com.fasterxml.jackson.core.type.TypeReference;

public class MessageControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static MessageController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getMessage();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * List all messages sent by the account.
     * @throws Throwable
     */
    @Test
    public void testGetAllMessages() throws Throwable {
        // Parameters for the API call
        String accept = "*/*";

        // Set callback and perform API call
        DynamicResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getAllMessages(accept);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Return the details of the message.
     * @throws Throwable
     */
    @Test
    public void testViewMessage() throws Throwable {
        // Parameters for the API call
        String id = "id";
        String accept = "*/*";

        // Set callback and perform API call
        DynamicResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getViewMessage(id, accept);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}
