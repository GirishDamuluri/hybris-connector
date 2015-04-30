# Hybris To Salesforce Demo

### Requirements:
Install the hybris-connector first using:
	mvn clean install

### Configuration:

Replace the follwoing properties in src/main/resources/hybris.properties with your SFDC and Hybris configuration properties:

hybris.user=
hybris.password=
sfdc.user=
sfdc.password=
sfdc.securityToken=

### Running:

Run the application as normal and the application will automatically start polling Hybris and start inserting records into Salesforce.