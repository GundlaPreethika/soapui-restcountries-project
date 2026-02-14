# SOAP UI RestCountries API Automation

##  Project Description
This project automates the RestCountries API using SOAP UI.

The automation performs:
- REST GET request
- Data-driven testing using Excel (CSV)
- Dynamic endpoint execution using Groovy Script
- Response validation using Assertions
- Status code verification (200 OK)

---

##  API Used
https://restcountries.com/v3.1/subregion/{subregion}

Example:
https://restcountries.com/v3.1/subregion/Northern%20Europe

---

##  Technologies Used
- SOAP UI 5.7.0
- Groovy Script
- REST API
- Excel (CSV format)

---

##  Project Files
- RestCountries-soapui-project.xml
- readSubregion.groovy
- subregion.csv

---

##  How to Execute
1. Import the XML project into SOAP UI.
2. Update file path in Groovy script if needed.
3. Run the TestCase.
4. Verify 200 OK status and green assertions.

---
