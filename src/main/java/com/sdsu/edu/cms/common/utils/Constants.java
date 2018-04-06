package com.sdsu.edu.cms.common.utils;

public  class Constants {

    public static final String SCHEME_EMAIL = "email";
    public static final String SCHEME_INAPP = "app";
    public static final String SCHEME_REST = "rest";

    public static final String SERVER_ID = "SDSU-CMS-1";
    public static final String SERVER_NAME = "SDSU-CMS ADMIN";
    public static final String SERVER_CONFERENCE = "SDSU-CMS";

    public static final String INTERNAL_SERVER_ERROR = "internal_server_error";
    public static final String BAD_REQUEST = "bad_request";

    public static final String ACTIVATION_EMAIL_TITLE = "User action required - Activate account";
    public static final String ACTIVATION_EMAIL_BODY = "Hi,\nTo activate your account at SDSU Conference management portal, click on the activation link below.\n" +
            "Activation code: ";
    public enum NotifyMethod { ANNOUNCEMENT, UPDATE, MESSAGE, ACTIVATION};


    public static final String INTERNAL_TOKEN = "X-Token-Internal";
    public static final String INTERNAL_TOKEN_VALUE = "internal-call";


}
