# Getting started

The Releans SDK enables developers to use Releans Services in their code. You can get started in minutes.

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

## How to Use

The following section explains how to use the ReleansAPI library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *ReleansAPILib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

Clicking the ``` Add ``` button will open a dialog where you need to specify ReleansAPI in ``` Group Id ``` and ReleansAPILib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Releans%20API-Java&workspaceName=ReleansAPI&projectName=ReleansAPILib&rootNamespace=com.releans.platform)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *ReleansAPILib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| oAuthAccessToken | OAuth 2.0 Access Token |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String oAuthAccessToken = "oAuthAccessToken"; // OAuth 2.0 Access Token

ReleansAPIClient client = new ReleansAPIClient(oAuthAccessToken);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [MessageController](#message_controller)
* [SenderController](#sender_controller)
* [BalanceController](#balance_controller)

## <a name="message_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.releans.platform.controllers.MessageController") MessageController

### Get singleton instance

The singleton instance of the ``` MessageController ``` class can be accessed from the API Client.

```java
MessageController message = client.getMessage();
```

### <a name="get_all_messages_async"></a>![Method: ](https://apidocs.io/img/method.png "com.releans.platform.controllers.MessageController.getAllMessagesAsync") getAllMessagesAsync

> List all messages sent by the account.


```java
void getAllMessagesAsync(
        final String accept,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accept |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String accept = "*/*";
// Invoking the API call with sample inputs
message.getAllMessagesAsync(accept, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_view_message_async"></a>![Method: ](https://apidocs.io/img/method.png "com.releans.platform.controllers.MessageController.getViewMessageAsync") getViewMessageAsync

> Return the details of the message.


```java
void getViewMessageAsync(
        final String id,
        final String accept,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | TODO: Add a parameter description |
| accept |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String id = "id";
String accept = "*/*";
// Invoking the API call with sample inputs
message.getViewMessageAsync(id, accept, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_send_sms_message_async"></a>![Method: ](https://apidocs.io/img/method.png "com.releans.platform.controllers.MessageController.createSendSMSMessageAsync") createSendSMSMessageAsync

> Send a single message.


```java
void createSendSMSMessageAsync(
        final String accept,
        final String senderId,
        final String mobileNumber,
        final String message,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accept |  ``` Required ```  | TODO: Add a parameter description |
| senderId |  ``` Required ```  | Sender id to send the message from. |
| mobileNumber |  ``` Required ```  | The mobile number supposed to receive the message. |
| message |  ``` Required ```  | Message text. |


#### Example Usage

```java
String accept = "Accept";
String senderId = "senderId";
String mobileNumber = "mobileNumber";
String message = "message";
// Invoking the API call with sample inputs
message.createSendSMSMessageAsync(accept, senderId, mobileNumber, message, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="sender_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.releans.platform.controllers.SenderController") SenderController

### Get singleton instance

The singleton instance of the ``` SenderController ``` class can be accessed from the API Client.

```java
SenderController sender = client.getSender();
```

### <a name="get_sender_name_details_async"></a>![Method: ](https://apidocs.io/img/method.png "com.releans.platform.controllers.SenderController.getSenderNameDetailsAsync") getSenderNameDetailsAsync

> Return the details of the sender name.


```java
void getSenderNameDetailsAsync(
        final String id,
        final String accept,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | TODO: Add a parameter description |
| accept |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String id = "sender-id";
String accept = "*/*";
// Invoking the API call with sample inputs
sender.getSenderNameDetailsAsync(id, accept, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_sender_name_async"></a>![Method: ](https://apidocs.io/img/method.png "com.releans.platform.controllers.SenderController.createSenderNameAsync") createSenderNameAsync

> Create a new sender id to send messages using it


```java
void createSenderNameAsync(
        final String accept,
        final String contentType,
        final String body,
        final APICallBack<Response200> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accept |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String accept = "text/plain";
String contentType = "text/plain";
String body = "Your sender name";
// Invoking the API call with sample inputs
sender.createSenderNameAsync(accept, contentType, body, new APICallBack<Response200>() {
    public void onSuccess(HttpContext context, Response200 response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_all_senders_async"></a>![Method: ](https://apidocs.io/img/method.png "com.releans.platform.controllers.SenderController.getAllSendersAsync") getAllSendersAsync

> List all senders names associated with the account


```java
void getAllSendersAsync(
        final String accept,
        final APICallBack<List<Response2001>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accept |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String accept = "*/*";
// Invoking the API call with sample inputs
sender.getAllSendersAsync(accept, new APICallBack<List<Response2001>>() {
    public void onSuccess(HttpContext context, List<Response2001> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="balance_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.releans.platform.controllers.BalanceController") BalanceController

### Get singleton instance

The singleton instance of the ``` BalanceController ``` class can be accessed from the API Client.

```java
BalanceController balance = client.getBalance();
```

### <a name="get_balance_async"></a>![Method: ](https://apidocs.io/img/method.png "com.releans.platform.controllers.BalanceController.getBalanceAsync") getBalanceAsync

> Get your available balance


```java
void getBalanceAsync(
        final String accept,
        final APICallBack<Response2002> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accept |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String accept = "text/plain";
// Invoking the API call with sample inputs
balance.getBalanceAsync(accept, new APICallBack<Response2002>() {
    public void onSuccess(HttpContext context, Response2002 response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



