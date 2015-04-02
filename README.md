
Hybris Mule Cloud Connector
=======
Mule connector for Hybris Ecommerce Platform Web Services

Requirements
============
* Minimum Mule version 3.6
* Minimum Devkit version 3.6

This conenctor makes use of 3.6 only features such as the new Connection Management/Strategies.

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

Installing the Connector in Studio
==================================
* First generate the Update site for the connector:
```
cd hybris-connector
mvn clean package -Ddevkit.studio.package.skip=false
```
* Click Help → Install New Software on the Mule menu bar.
* After the Install window opens, click Add, which is located to the right of the “Work
with” field.
* Enter a unique name of your choice for the update site in the Name field (for example,
“Google Maps Connector”).
* In the Location field, enter the full path to your connector, prefixed by file:/, and
click OK.
* A table will appear displaying the available connectors under “community” and
“standard,” the newest version, and the connector. Click the available version, then
click Next, and finally click Finish. The connector will now be available to import
into your project.

After following the onscreen instructions, you will be asked to restart your IDE. After
you complete the procedure, the connector will be available to all your Mule
applications.

Testing
=======
This project contains test classes with test methods for each of the operations supported by the connector. It uses [WireMock](http://wiremock.org/) to simulate the Hybris APIs for testing.
