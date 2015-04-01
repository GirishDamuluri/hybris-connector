
Hybris Mule Cloud Connector
=======
Mule connector for Hybris Ecommerce Platform Web Services

Usage
=====
You must be Hybris Customer or Partner to have access to a Hybris Installation and access the [Hybris Wiki](https://wiki.hybris.com/display/release5/WebService+API+-+Reference).

A demo application integrating Hybris and Salesforce is available here: https://github.com/ryandcarter/hybris-connector/tree/master/demo

And a Video Screencast here: http://youtu.be/MB13CZKVRd4


Manually Building the Connector
===============================

* Retrieve the source

```
git clone https://github.com/ryandcarter/hybris-connector
```

* Build, test and install the application in the local Maven repo:

```
cd hybris-connector
mvn install
```

Testing
=======
This project contains test classes with test methods for each of the operations supported by the connector. It uses [WireMock](http://wiremock.org/) to simulate the Hybris APIs for testing.
