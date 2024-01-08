$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/CreateAcc.feature");
formatter.feature({
  "name": "To validate the account creation of facebook functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To create new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Skaning"
    }
  ]
});
formatter.step({
  "name": "TO launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateNewAccFb.to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "CreateNewAccFb.to_launch_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the create new account button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccFb.to_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the first name in the name feild",
  "rows": [
    {
      "cells": [
        "firstname1",
        "subithra"
      ]
    },
    {
      "cells": [
        "firstname2",
        "pavithra"
      ]
    },
    {
      "cells": [
        "firstname3",
        "swarnashri"
      ]
    },
    {
      "cells": [
        "firstname4",
        "tamil"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccFb.to_pass_the_first_name_in_the_name_feild(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the sur name in the name feild",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccFb.to_pass_the_sur_name_in_the_name_feild()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the emaild id in the email feild",
  "rows": [
    {
      "cells": [
        "password1",
        "password2",
        "password3"
      ]
    },
    {
      "cells": [
        "223555",
        "gdsng",
        "441454745"
      ]
    },
    {
      "cells": [
        "55124542",
        "rehaghb",
        "tnsgby"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccFb.to_pass_the_emaild_id_in_the_email_feild(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To paas the password in the password feild",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccFb.to_paas_the_password_in_the_password_feild()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewAccFb.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});