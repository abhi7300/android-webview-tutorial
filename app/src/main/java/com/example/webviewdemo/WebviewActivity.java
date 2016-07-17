package com.example.webviewdemo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.dto.PersonalAccidentDTO;


import org.apache.http.util.EncodingUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class WebviewActivity extends AppCompatActivity {



    private WebView customWebView ;
    PersonalAccidentDTO personalAccidentDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        customWebView = (WebView)findViewById(R.id.custom_webview);
        WebSettings webSettings = customWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        customWebView.setWebViewClient(new MyWebViewClient());

        personalAccidentDTO = populatePADTO();

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = null;
        try {
            json = ow.writeValueAsString(personalAccidentDTO);
        }catch(IOException ioe){

        }
        String payload = "jsonAsString="+json;
        customWebView.postUrl("http://223.31.56.193:8080/OICLWebServiceProvider/PAPaymentServlet", EncodingUtils.getBytes(payload, "utf-8"));

    }

    private PersonalAccidentDTO populatePADTO() {
        String jSON = "{\n  \"errorCode\": \"0\",\n  \"isOiclPolicy\": null,\n  \"isRenewRecord\": null,\n  \"oiclBranchDTO\": {\n    \"errorCode\": null,\n    \"oiclBranchId\": \"271901\",\n    \"description\": \"BO ROHINI\"\n  },\n  \"isEntireFamilyInsured\": null,\n  \"isSpouseInsured\": \"1\",\n  \"isChildrenInsured\": null,\n  \"isParentsInsured\": \"1\",\n  \"startDate\": \"19/04/2016\",\n  \"endDate\": \"18/04/2017\",\n  \"personalAccidentDetails\": {\n    \"errorCode\": null,\n    \"name\": \"Sourav Ganguly\",\n    \"dateOfBirth\": \"18/01/1985\",\n    \"genderDTO\": {\n      \"errorCode\": null,\n      \"genderId\": \"M\",\n      \"description\": \"Male\"\n    },\n    \"riskClassDTO\": {\n      \"errorCode\": null,\n      \"code\": \"CLASS_2\",\n      \"description\": \"Normal Risk\"\n    },\n    \"monthlyIncome\": \"50000\",\n    \"assigneeRelationshipDTO\": {\n      \"errorCode\": null,\n      \"relationshipId\": \"AS_REL_04\",\n      \"description\": \"Brother\"\n    },\n    \"medicalHistory\": \"\",\n    \"assigneeName\": \"Mr. X\",\n    \"tableOfCoverDTO\": {\n      \"errorCode\": null,\n      \"code\": \"MIST-CVR-216\",\n      \"description\": \"TABLE OF BENEFITS I\"\n    },\n    \"sumInsuredDTO\": {\n      \"errorCode\": null,\n      \"sumInsuredId\": \"13\",\n      \"description\": \"5 Lakh\"\n    },\n    \"medicalExtensionsDTO\": {\n      \"errorCode\": null,\n      \"medicalExtensionCode\": \"MIST_MEXT_03\",\n      \"description\": \"No\"\n    },\n    \"isEmployed\": \"\",\n    \"cumBonus\": \"\"\n  },\n  \"personalAccidentDetailsForSpouse\": {\n    \"errorCode\": null,\n    \"name\": \"Dona Ganguly\",\n    \"dateOfBirth\": \"18/01/1988\",\n    \"genderDTO\": {\n      \"errorCode\": null,\n      \"genderId\": \"F\",\n      \"description\": \"Female\"\n    },\n    \"riskClassDTO\": {\n      \"errorCode\": null,\n      \"code\": \"CLASS_2\",\n      \"description\": \"Normal Risk\"\n    },\n    \"monthlyIncome\": \"50000\",\n    \"assigneeRelationshipDTO\": {\n      \"errorCode\": null,\n      \"relationshipId\": \"AS_REL_04\",\n      \"description\": \"Brother\"\n    },\n    \"medicalHistory\": \"\",\n    \"assigneeName\": \"Mr. X\",\n    \"tableOfCoverDTO\": {\n      \"errorCode\": null,\n      \"code\": \"MIST-CVR-216\",\n      \"description\": \"TABLE OF BENEFITS I\"\n    },\n    \"sumInsuredDTO\": {\n      \"errorCode\": null,\n      \"sumInsuredId\": \"13\",\n      \"description\": \"5 Lakh\"\n    },\n    \"medicalExtensionsDTO\": {\n      \"errorCode\": null,\n      \"medicalExtensionCode\": \"MIST_MEXT_03\",\n      \"description\": \"No\"\n    },\n    \"isEmployed\": \"\",\n    \"cumBonus\": \"\"\n  },\n  \"personalAccidentDetailsForFather\": {\n    \"errorCode\": null,\n    \"name\": \"Father Ganguly\",\n    \"dateOfBirth\": \"18/01/1952\",\n    \"genderDTO\": {\n      \"errorCode\": null,\n      \"genderId\": \"M\",\n      \"description\": \"Male\"\n    },\n    \"riskClassDTO\": {\n      \"errorCode\": null,\n      \"code\": \"CLASS_2\",\n      \"description\": \"Normal Risk\"\n    },\n    \"monthlyIncome\": \"50000\",\n    \"assigneeRelationshipDTO\": {\n      \"errorCode\": null,\n      \"relationshipId\": \"AS_REL_04\",\n      \"description\": \"Brother\"\n    },\n    \"medicalHistory\": \"\",\n    \"assigneeName\": \"Mr. Y\",\n    \"tableOfCoverDTO\": {\n      \"errorCode\": null,\n      \"code\": \"MIST-CVR-216\",\n      \"description\": \"TABLE OF BENEFITS I\"\n    },\n    \"sumInsuredDTO\": {\n      \"errorCode\": null,\n      \"sumInsuredId\": \"13\",\n      \"description\": \"5 Lakh\"\n    },\n    \"medicalExtensionsDTO\": {\n      \"errorCode\": null,\n      \"medicalExtensionCode\": \"MIST_MEXT_03\",\n      \"description\": \"No\"\n    },\n    \"isEmployed\": \"\",\n    \"cumBonus\": \"\"\n  },\n  \"personalAccidentDetailsForMother\": {\n    \"errorCode\": null,\n    \"name\": \"Mother Ganguly\",\n    \"dateOfBirth\": \"18/01/1955\",\n    \"genderDTO\": {\n      \"errorCode\": null,\n      \"genderId\": \"F\",\n      \"description\": \"Female\"\n    },\n    \"riskClassDTO\": {\n      \"errorCode\": null,\n      \"code\": \"CLASS_2\",\n      \"description\": \"Normal Risk\"\n    },\n    \"monthlyIncome\": \"50000\",\n    \"assigneeRelationshipDTO\": {\n      \"errorCode\": null,\n      \"relationshipId\": \"AS_REL_04\",\n      \"description\": \"Brother\"\n    },\n    \"medicalHistory\": \"\",\n    \"assigneeName\": \"Mr. Y\",\n    \"tableOfCoverDTO\": {\n      \"errorCode\": null,\n      \"code\": \"MIST-CVR-216\",\n      \"description\": \"TABLE OF BENEFITS I\"\n    },\n    \"sumInsuredDTO\": {\n      \"errorCode\": null,\n      \"sumInsuredId\": \"13\",\n      \"description\": \"5 Lakh\"\n    },\n    \"medicalExtensionsDTO\": {\n      \"errorCode\": null,\n      \"medicalExtensionCode\": \"MIST_MEXT_03\",\n      \"description\": \"No\"\n    },\n    \"isEmployed\": \"\",\n    \"cumBonus\": \"\"\n  },\n  \"personalAccidentDetailsForFatherInLaw\": {\n    \"errorCode\": null,\n    \"name\": \"Father InLaw Ganguly\",\n    \"dateOfBirth\": \"18/01/1952\",\n    \"genderDTO\": {\n      \"errorCode\": null,\n      \"genderId\": \"M\",\n      \"description\": \"Male\"\n    },\n    \"riskClassDTO\": {\n      \"errorCode\": null,\n      \"code\": \"CLASS_2\",\n      \"description\": \"Normal Risk\"\n    },\n    \"monthlyIncome\": \"50000\",\n    \"assigneeRelationshipDTO\": {\n      \"errorCode\": null,\n      \"relationshipId\": \"AS_REL_04\",\n      \"description\": \"Brother\"\n    },\n    \"medicalHistory\": \"\",\n    \"assigneeName\": \"Mr. Y\",\n    \"tableOfCoverDTO\": {\n      \"errorCode\": null,\n      \"code\": \"MIST-CVR-216\",\n      \"description\": \"TABLE OF BENEFITS I\"\n    },\n    \"sumInsuredDTO\": {\n      \"errorCode\": null,\n      \"sumInsuredId\": \"13\",\n      \"description\": \"5 Lakh\"\n    },\n    \"medicalExtensionsDTO\": {\n      \"errorCode\": null,\n      \"medicalExtensionCode\": \"MIST_MEXT_03\",\n      \"description\": \"No\"\n    },\n    \"isEmployed\": \"\",\n    \"cumBonus\": \"\"\n  },\n  \"personalAccidentDetailsForMotherInLaw\": {\n    \"errorCode\": null,\n    \"name\": \"Mother InLaw Ganguly\",\n    \"dateOfBirth\": \"18/01/1955\",\n    \"genderDTO\": {\n      \"errorCode\": null,\n      \"genderId\": \"F\",\n      \"description\": \"Female\"\n    },\n    \"riskClassDTO\": {\n      \"errorCode\": null,\n      \"code\": \"CLASS_2\",\n      \"description\": \"Normal Risk\"\n    },\n    \"monthlyIncome\": \"50000\",\n    \"assigneeRelationshipDTO\": {\n      \"errorCode\": null,\n      \"relationshipId\": \"AS_REL_04\",\n      \"description\": \"Brother\"\n    },\n    \"medicalHistory\": \"\",\n    \"assigneeName\": \"Mr. Y\",\n    \"tableOfCoverDTO\": {\n      \"errorCode\": null,\n      \"code\": \"MIST-CVR-216\",\n      \"description\": \"TABLE OF BENEFITS I\"\n    },\n    \"sumInsuredDTO\": {\n      \"errorCode\": null,\n      \"sumInsuredId\": \"13\",\n      \"description\": \"5 Lakh\"\n    },\n    \"medicalExtensionsDTO\": {\n      \"errorCode\": null,\n      \"medicalExtensionCode\": \"MIST_MEXT_03\",\n      \"description\": \"No\"\n    },\n    \"isEmployed\": \"\",\n    \"cumBonus\": \"\"\n  },\n  \"personalAccidentDetailsForChildrenList\": [\n    {\n      \"errorCode\": null,\n      \"name\": \"First Child Ganguly\",\n      \"dateOfBirth\": \"18/01/1995\",\n      \"genderDTO\": {\n        \"errorCode\": null,\n        \"genderId\": \"F\",\n        \"description\": \"Female\"\n      },\n      \"riskClassDTO\": {\n        \"errorCode\": null,\n        \"code\": \"CLASS_2\",\n        \"description\": \"Normal Risk\"\n      },\n      \"monthlyIncome\": \"50000\",\n      \"assigneeRelationshipDTO\": {\n        \"errorCode\": null,\n        \"relationshipId\": \"AS_REL_04\",\n        \"description\": \"Brother\"\n      },\n      \"medicalHistory\": \"\",\n      \"assigneeName\": \"Mr. Y\",\n      \"tableOfCoverDTO\": {\n        \"errorCode\": null,\n        \"code\": \"MIST-CVR-216\",\n        \"description\": \"TABLE OF BENEFITS I\"\n      },\n      \"sumInsuredDTO\": {\n        \"errorCode\": null,\n        \"sumInsuredId\": \"13\",\n        \"description\": \"5 Lakh\"\n      },\n      \"medicalExtensionsDTO\": {\n        \"errorCode\": null,\n        \"medicalExtensionCode\": \"MIST_MEXT_03\",\n        \"description\": \"No\"\n      },\n      \"isEmployed\": \"\",\n      \"cumBonus\": \"\"\n    },\n    {\n      \"errorCode\": null,\n      \"name\": \"Second Child Ganguly\",\n      \"dateOfBirth\": \"18/01/1997\",\n      \"genderDTO\": {\n        \"errorCode\": null,\n        \"genderId\": \"F\",\n        \"description\": \"Female\"\n      },\n      \"riskClassDTO\": {\n        \"errorCode\": null,\n        \"code\": \"CLASS_2\",\n        \"description\": \"Normal Risk\"\n      },\n      \"monthlyIncome\": \"50000\",\n      \"assigneeRelationshipDTO\": {\n        \"errorCode\": null,\n        \"relationshipId\": \"AS_REL_04\",\n        \"description\": \"Brother\"\n      },\n      \"medicalHistory\": \"\",\n      \"assigneeName\": \"Mr. Y\",\n      \"tableOfCoverDTO\": {\n        \"errorCode\": null,\n        \"code\": \"MIST-CVR-216\",\n        \"description\": \"TABLE OF BENEFITS I\"\n      },\n      \"sumInsuredDTO\": {\n        \"errorCode\": null,\n        \"sumInsuredId\": \"13\",\n        \"description\": \"5 Lakh\"\n      },\n      \"medicalExtensionsDTO\": {\n        \"errorCode\": null,\n        \"medicalExtensionCode\": \"MIST_MEXT_03\",\n        \"description\": \"No\"\n      },\n      \"isEmployed\": \"\",\n      \"cumBonus\": \"\"\n    }\n  ],\n  \"annualPremium\": \"1863\",\n  \"inliasProposalNoOut\": \"R/271901/48/2017/731223/1\",\n  \"inliasPolicySysId\": \"243133706\",\n  \"paymentType\": \"OT\",\n  \"personalDetailsUserDTO\": {\n    \"errorCode\": null,\n    \"userId\": \"abhishek.m.mukherjee@gmail.com\",\n    \"userTypeDTO\": {\n      \"errorCode\": null,\n      \"description\": \"Cash Customer\",\n      \"oiclIdentificationId\": \"005\"\n    },\n    \"firstName\": \"Abhishek\",\n    \"middleName\": null,\n    \"lastName\": \"Mukherjee\",\n    \"email\": \"abhishek.m.mukherjee@gmail.com\",\n    \"mobile\": \"8420297300\",\n    \"landline\": null,\n    \"dob\": null,\n    \"occupationDTO\": null,\n    \"customerDTO\": null,\n    \"agentDTO\": null,\n    \"brokerDTO\": null,\n    \"guestUser\": false\n  },\n  \"createdByUserDTO\": {\n    \"errorCode\": null,\n    \"userId\": \"abhishek.m.mukherjee@gmail.com\",\n    \"userTypeDTO\": {\n      \"errorCode\": null,\n      \"description\": \"Cash Customer\",\n      \"oiclIdentificationId\": \"005\"\n    },\n    \"firstName\": \"Abhishek\",\n    \"middleName\": null,\n    \"lastName\": \"Mukherjee\",\n    \"email\": \"abhishek.m.mukherjee@gmail.com\",\n    \"mobile\": \"8420297300\",\n    \"landline\": null,\n    \"dob\": null,\n    \"occupationDTO\": null,\n    \"customerDTO\": null,\n    \"agentDTO\": null,\n    \"brokerDTO\": null,\n    \"guestUser\": false\n  },\n  \"updatedByUserDTO\": {\n    \"errorCode\": null,\n    \"userId\": \"abhishek.m.mukherjee@gmail.com\",\n    \"userTypeDTO\": {\n      \"errorCode\": null,\n      \"description\": \"Cash Customer\",\n      \"oiclIdentificationId\": \"005\"\n    },\n    \"firstName\": \"Abhishek\",\n    \"middleName\": null,\n    \"lastName\": \"Mukherjee\",\n    \"email\": \"abhishek.m.mukherjee@gmail.com\",\n    \"mobile\": \"8420297300\",\n    \"landline\": null,\n    \"dob\": null,\n    \"occupationDTO\": null,\n    \"customerDTO\": null,\n    \"agentDTO\": null,\n    \"brokerDTO\": null,\n    \"guestUser\": false\n  },\n  \"userloggedIn\": true\n}";
        try {
            JSONObject jsonObject = new JSONObject(jSON);
            ObjectMapper mapper = new ObjectMapper();
            personalAccidentDTO = mapper.readValue(jsonObject.toString(), PersonalAccidentDTO.class);

        }catch(JSONException jsonEx){

        }catch (IOException ioe){

        }
        return personalAccidentDTO;
    }


    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            //return super.shouldOverrideUrlLoading(view, url);
            if(Uri.parse(url).getHost().equalsIgnoreCase("uat.billdesk.com")){
                return false;
            }
            if(Uri.parse(url).getHost().equalsIgnoreCase("www.orientalinsurance.org.in")){
                return false;
            }
            if(Uri.parse(url).getHost().equalsIgnoreCase("223.31.56.193")){
                return false;
            }

            return false;
        }
    }
}
