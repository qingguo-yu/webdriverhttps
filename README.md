webdriverhttps
==============

The code is used to demo an issue of webdriver retrieving web page through HTTPS.
1) To reproduce the issue, please commit the following code and run the code as a java application. The error will be printed in the console.
//client.getOptions().setSSLInsecureProtocol("TLSv1");
2) To fix the issue, uncomment the above code and rerun the application.
