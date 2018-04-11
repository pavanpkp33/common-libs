package com.sdsu.edu.cms.common.utils;

public class EmailTemplate {
    private String userName;
    private String activationLink;
    private String conferenceName;
    private String template;
    private String email;
    private String password;
    private String userTemplate;
    private String submissionTemplate;
    public EmailTemplate(String userName, String activationLink) {
        this.userName = userName;
        this.activationLink = activationLink;
        template = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                "    <meta name=\"format-detection\" content=\"telephone=no\" /> <!-- disable auto telephone linking in iOS -->\n" +
                "    <title>ECOS 2017</title>\n" +
                "    <style type=\"text/css\">\n" +
                "        /* RESET STYLES */\n" +
                "        html { background-color:#E1E1E1; margin:0; padding:0; }\n" +
                "        body, #bodyTable, #bodyCell, #bodyCell{height:100% !important; margin:0; padding:0; width:100% !important;font-family:Helvetica, Arial, \"Lucida Grande\", sans-serif;}\n" +
                "        table{border-collapse:collapse;}\n" +
                "        table[id=bodyTable] {width:100%!important;margin:auto;max-width:500px!important;color:#7A7A7A;font-weight:normal;}\n" +
                "        img, a img{border:0; outline:none; text-decoration:none;height:auto; line-height:100%;}\n" +
                "        a {text-decoration:none !important;border-bottom: 1px solid;}\n" +
                "        h1, h2, h3, h4, h5, h6{color:#5F5F5F; font-weight:normal; font-family:Helvetica; font-size:20px; line-height:125%; text-align:Left; letter-spacing:normal;margin-top:0;margin-right:0;margin-bottom:10px;margin-left:0;padding-top:0;padding-bottom:0;padding-left:0;padding-right:0;}\n" +
                "        /* CLIENT-SPECIFIC STYLES */\n" +
                "        .ReadMsgBody{width:100%;} .ExternalClass{width:100%;} /* Force Hotmail/Outlook.com to display emails at full width. */\n" +
                "        .ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div{line-height:100%;} /* Force Hotmail/Outlook.com to display line heights normally. */\n" +
                "        table, td{mso-table-lspace:0pt; mso-table-rspace:0pt;} /* Remove spacing between tables in Outlook 2007 and up. */\n" +
                "        #outlook a{padding:0;} /* Force Outlook 2007 and up to provide a \"view in browser\" message. */\n" +
                "        img{-ms-interpolation-mode: bicubic;display:block;outline:none; text-decoration:none;} /* Force IE to smoothly render resized images. */\n" +
                "        body, table, td, p, a, li, blockquote{-ms-text-size-adjust:100%; -webkit-text-size-adjust:100%; font-weight:normal!important;} /* Prevent Windows- and Webkit-based mobile platforms from changing declared text sizes. */\n" +
                "        .ExternalClass td[class=\"ecxflexibleContainerBox\"] h3 {padding-top: 10px !important;} /* Force hotmail to push 2-grid sub headers down */\n" +
                "        /* /\\/\\/\\/\\/\\/\\/\\/\\/ TEMPLATE STYLES /\\/\\/\\/\\/\\/\\/\\/\\/ */\n" +
                "        /* ========== Page Styles ========== */\n" +
                "        h1{display:block;font-size:26px;font-style:normal;font-weight:normal;line-height:100%;}\n" +
                "        h2{display:block;font-size:20px;font-style:normal;font-weight:normal;line-height:120%;}\n" +
                "        h3{display:block;font-size:17px;font-style:normal;font-weight:normal;line-height:110%;}\n" +
                "        h4{display:block;font-size:18px;font-style:italic;font-weight:normal;line-height:100%;}\n" +
                "        .flexibleImage{height:auto;}\n" +
                "        .linkRemoveBorder{border-bottom:0 !important;}\n" +
                "        table[class=flexibleContainerCellDivider] {padding-bottom:0 !important;padding-top:0 !important;}\n" +
                "        body, #bodyTable{background-color:#E1E1E1;}\n" +
                "        #emailHeader{background-color:#E1E1E1;}\n" +
                "        #emailBody{background-color:#FFFFFF;}\n" +
                "        #emailFooter{background-color:#E1E1E1;}\n" +
                "        .nestedContainer{background-color:#F8F8F8; border:1px solid #CCCCCC;}\n" +
                "        .emailButton{background-color:#cc0033; border-collapse:separate;}\n" +
                "        .buttonContent{color:#FFFFFF; font-family:Helvetica; font-size:18px; font-weight:bold; line-height:100%; padding:15px; text-align:center;}\n" +
                "        .buttonContent a{color:#FFFFFF; display:block; text-decoration:none!important; border:0!important;}\n" +
                "        .emailCalendar{background-color:#FFFFFF; border:1px solid #CCCCCC;}\n" +
                "        .emailCalendarMonth{background-color:#cc0033; color:#FFFFFF; font-family:Helvetica, Arial, sans-serif; font-size:16px; font-weight:bold; padding-top:10px; padding-bottom:10px; text-align:center;}\n" +
                "        .emailCalendarDay{color:#cc0033; font-family:Helvetica, Arial, sans-serif; font-size:60px; font-weight:bold; line-height:100%; padding-top:20px; padding-bottom:20px; text-align:center;}\n" +
                "        .imageContentText {margin-top: 10px;line-height:0;}\n" +
                "        .imageContentText a {line-height:0;}\n" +
                "        #invisibleIntroduction {display:none !important;} /* Removing the introduction text from the view */\n" +
                "        /*FRAMEWORK HACKS & OVERRIDES */\n" +
                "        span[class=ios-color-hack] a {color:#275100!important;text-decoration:none!important;} /* Remove all link colors in IOS (below are duplicates based on the color preference) */\n" +
                "        span[class=ios-color-hack2] a {color:#cc0033!important;text-decoration:none!important;}\n" +
                "        span[class=ios-color-hack3] a {color:#8B8B8B!important;text-decoration:none!important;}\n" +
                "        /* A nice and clean way to target phone numbers you want clickable and avoid a mobile phone from linking other numbers that look like, but are not phone numbers.  Use these two blocks of code to \"unstyle\" any numbers that may be linked.  The second block gives you a class to apply with a span tag to the numbers you would like linked and styled.\n" +
                "        Inspired by Campaign Monitors article on using phone numbers in email: http://www.campaignmonitor.com/blog/post/3571/using-phone-numbers-in-html-email/.\n" +
                "        */\n" +
                "        .a[href^=\"tel\"], a[href^=\"sms\"] {text-decoration:none!important;color:#606060!important;pointer-events:none!important;cursor:default!important;}\n" +
                "        .mobile_link a[href^=\"tel\"], .mobile_link a[href^=\"sms\"] {text-decoration:none!important;color:#606060!important;pointer-events:auto!important;cursor:default!important;}\n" +
                "        /* MOBILE STYLES */\n" +
                "        @media only screen and (max-width: 480px){\n" +
                "            /*////// CLIENT-SPECIFIC STYLES //////*/\n" +
                "            body{width:100% !important; min-width:100% !important;} /* Force iOS Mail to render the email at full width. */\n" +
                "            /* FRAMEWORK STYLES */\n" +
                "            /*\n" +
                "            CSS selectors are written in attribute\n" +
                "            selector format to prevent Yahoo Mail\n" +
                "            from rendering media query styles on\n" +
                "            desktop.\n" +
                "            */\n" +
                "            /*td[class=\"textContent\"], td[class=\"flexibleContainerCell\"] { width: 100%; padding-left: 10px !important; padding-right: 10px !important; }*/\n" +
                "            table[id=\"emailHeader\"],\n" +
                "            table[id=\"emailBody\"],\n" +
                "            table[id=\"emailFooter\"],\n" +
                "            table[class=\"flexibleContainer\"],\n" +
                "            td[class=\"flexibleContainerCell\"] {width:100% !important;}\n" +
                "            td[class=\"flexibleContainerBox\"], td[class=\"flexibleContainerBox\"] table {display: block;width: 100%;text-align: left;}\n" +
                "            /*\n" +
                "            The following style rule makes any\n" +
                "            image classed with flexibleImage\n" +
                "            fluid when the query activates.\n" +
                "            Make sure you add an inline max-width\n" +
                "            to those images to prevent them\n" +
                "            from blowing out.\n" +
                "            */\n" +
                "            td[class=\"imageContent\"] img {height:auto !important; width:100% !important; max-width:100% !important; }\n" +
                "            img[class=\"flexibleImage\"]{height:auto !important; width:100% !important;max-width:100% !important;}\n" +
                "            img[class=\"flexibleImageSmall\"]{height:auto !important; width:auto !important;}\n" +
                "            /*\n" +
                "            Create top space for every second element in a block\n" +
                "            */\n" +
                "            table[class=\"flexibleContainerBoxNext\"]{padding-top: 10px !important;}\n" +
                "            /*\n" +
                "            Make buttons in the email span the\n" +
                "            full width of their container, allowing\n" +
                "            for left- or right-handed ease of use.\n" +
                "            */\n" +
                "            table[class=\"emailButton\"]{width:100% !important;}\n" +
                "            td[class=\"buttonContent\"]{padding:0 !important;}\n" +
                "            td[class=\"buttonContent\"] a{padding:15px !important;}\n" +
                "        }\n" +
                "        /*  CONDITIONS FOR ANDROID DEVICES ONLY\n" +
                "        *   http://developer.android.com/guide/webapps/targeting.html\n" +
                "        *   http://pugetworks.com/2011/04/css-media-queries-for-targeting-different-mobile-devices/ ;\n" +
                "        =====================================================*/\n" +
                "        @media only screen and (-webkit-device-pixel-ratio:.75){\n" +
                "            /* Put CSS for low density (ldpi) Android layouts in here */\n" +
                "        }\n" +
                "        @media only screen and (-webkit-device-pixel-ratio:1){\n" +
                "            /* Put CSS for medium density (mdpi) Android layouts in here */\n" +
                "        }\n" +
                "        @media only screen and (-webkit-device-pixel-ratio:1.5){\n" +
                "            /* Put CSS for high density (hdpi) Android layouts in here */\n" +
                "        }\n" +
                "        /* end Android targeting */\n" +
                "        /* CONDITIONS FOR IOS DEVICES ONLY\n" +
                "        =====================================================*/\n" +
                "        @media only screen and (min-device-width : 320px) and (max-device-width:568px) {\n" +
                "        }\n" +
                "        /* end IOS targeting */\n" +
                "    </style>\n" +
                "\n" +
                "    <!--[if mso 12]>\n" +
                "    <style type=\"text/css\">\n" +
                "        .flexibleContainer{display:block !important; width:100% !important;}\n" +
                "    </style>\n" +
                "    <![endif]-->\n" +
                "    <!--[if mso 14]>\n" +
                "    <style type=\"text/css\">\n" +
                "        .flexibleContainer{display:block !important; width:100% !important;}\n" +
                "    </style>\n" +
                "    <![endif]-->\n" +
                "</head>\n" +
                "<body bgcolor=\"#E1E1E1\" leftmargin=\"0\" marginwidth=\"0\" topmargin=\"0\" marginheight=\"0\" offset=\"0\">\n" +
                "\n" +
                "<center style=\"background-color:#E1E1E1;\">\n" +
                "    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" id=\"bodyTable\" style=\"table-layout: fixed;max-width:100% !important;width: 100% !important;min-width: 100% !important;\">\n" +
                "        <tr>\n" +
                "            <td align=\"center\" valign=\"top\" id=\"bodyCell\">\n" +
                "\n" +
                "\n" +
                "                <table bgcolor=\"#E1E1E1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailHeader\">\n" +
                "\n" +
                "                    <!-- HEADER ROW // -->\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"10\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "\n" +
                "                                                            <td align=\"left\" valign=\"middle\" id=\"invisibleIntroduction\" class=\"flexibleContainerBox\" style=\"display:none !important; mso-hide:all;\">\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "                                                                                Welcome to SDSU Conference Management portal. Your account details are here.\n" +
                "                                                                            </div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                            <td align=\"right\" valign=\"middle\" class=\"flexibleContainerBox\">\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <!-- CONTENT // -->\n" +
                "                                                                            <div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "                                                                                "+
                "                                                                            </div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // END -->\n" +
                "\n" +
                "                </table>\n" +
                "\n" +
                "                <table bgcolor=\"#FFFFFF\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailBody\">\n" +
                "\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"color:#FFFFFF;\" bgcolor=\"#cc0033\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "\n" +
                "                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"center\" valign=\"top\" class=\"textContent\">\n" +
                "                                                                <h1 style=\"color:#FFFFFF;line-height:100%;font-family:Helvetica,Arial,sans-serif;font-size:35px;font-weight:normal;margin-bottom:5px;text-align:center;\">Activation required!</h1>\n" +
                "                                                                <h2 style=\"text-align:center;font-weight:normal;font-family:Helvetica,Arial,sans-serif;font-size:23px;margin-bottom:10px;color:#fff;line-height:135%;\">Welcome to the Conference Management Portal, "+this.userName+".</h2>\n" +
                "                                                                <div style=\"text-align:center;font-family:Helvetica,Arial,sans-serif;font-size:15px;margin-bottom:0;color:#FFFFFF;line-height:135%;\">Thank you for registering. You can now submit your papers, update account information, check status of your submission, and pay the conference fee using this account.<br><span style=\"color:white;\">Click on the button below to activate your account first.</span></div>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr mc:hideable>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"left\" valign=\"top\" class=\"flexibleContainerBox\">\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                            <td align=\"right\" valign=\"middle\" class=\"flexibleContainerBox\">\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // MODULE ROW -->\n" +
                "\n" +
                "\n" +
                "                    <!-- MODULE ROW // -->\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr style=\"padding-top:0;\">\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td style=\"padding-top:0;\" align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"50%\" class=\"emailButton\" style=\"background-color: #cc0033;\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"center\" valign=\"middle\" class=\"buttonContent\" style=\"padding-top:15px;padding-bottom:15px;padding-right:15px;padding-left:15px;\">\n" +
                "                                                                <a style=\"color:#FFFFFF;text-decoration:none;font-family:Helvetica,Arial,sans-serif;font-size:20px;line-height:135%;\" href=\""+this.activationLink+"\" target=\"_blank\">Activate Account</a>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    \n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"color:#FFFFFF;\" bgcolor=\"#cc0033\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"left\" valign=\"top\" class=\"flexibleContainerBox\">\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"270\" style=\"max-width: 100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <h3 style=\"color:#FFFFFF;line-height:125%;font-family:Helvetica,Arial,sans-serif;font-size:16px;font-weight:normal;margin-top:0;margin-bottom:3px;text-align:left;\">San Diego State University</h3>\n" +
                "                                                                            <div style=\"text-align:left;font-family:Helvetica,Arial,sans-serif;font-size:12px;margin-bottom:0;color:#FFFFFF;line-height:135%;\">Department of Mechanical Engineering <br>5500 Campanile Drive <br> San Diego<br> CA 92182</div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                            <td align=\"right\" valign=\"middle\" class=\"flexibleContainerBox\">\n" +
                "                                                                <table class=\"flexibleContainerBoxNext\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"210\" style=\"max-width: 100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <h3 style=\"color:#FFFFFF;line-height:125%;font-family:Helvetica,Arial,sans-serif;font-size:14px;font-weight:normal;margin-top:0;margin-bottom:3px;text-align:left;\">Contact</h3>\n" +
                "                                                                            <div style=\"text-align:left;font-family:Helvetica,Arial,sans-serif;font-size:12px;margin-bottom:0;color:#FFFFFF;line-height:135%;\">E-mail : contact@ecosconference.org</div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // MODULE ROW -->\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                    <!-- MODULE DIVIDER // -->\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "                                                    <table class=\"flexibleContainerCellDivider\" border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"center\" valign=\"top\" style=\"padding-top:0px;padding-bottom:0px;\">\n" +
                "\n" +
                "                                                                <!-- CONTENT TABLE // -->\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"center\" valign=\"top\" style=\"border-top:1px solid #C8C8C8;\"></td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                                <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // END -->\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                </table>\n" +
                "               \n" +
                "                <table bgcolor=\"#E1E1E1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailFooter\">\n" +
                "\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "                                                    <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td valign=\"top\" bgcolor=\"#E1E1E1\">\n" +
                "\n" +
                "                                                                <div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "                                                                    <div>Copyright &#169; 2016 - 2017 <a href=\"www.sdsu.edu\" target=\"_blank\" style=\"text-decoration:none;color:#828282;\"><span style=\"color:#828282;\">San Diego State University</span></a>. All&nbsp;rights&nbsp;reserved.</div>\n" +
                "\n" +
                "                                                                </div>\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                </table>\n" +
                "                <!-- // END -->\n" +
                "\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "    </table>\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>";
    }

    public EmailTemplate() {
    }

    public String getUserTemplate() {
        return userTemplate;
    }

    public void setUserTemplate(String email, String password) {
        this.email = email;
        this.password = password;
        this.userTemplate = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                "    <meta name=\"format-detection\" content=\"telephone=no\" /> <!-- disable auto telephone linking in iOS -->\n" +
                "    <title>ECOS 2017</title>\n" +
                "    <style type=\"text/css\">\n" +
                "        /* RESET STYLES */\n" +
                "        html { background-color:#E1E1E1; margin:0; padding:0; }\n" +
                "        body, #bodyTable, #bodyCell, #bodyCell{height:100% !important; margin:0; padding:0; width:100% !important;font-family:Helvetica, Arial, \"Lucida Grande\", sans-serif;}\n" +
                "        table{border-collapse:collapse;}\n" +
                "        table[id=bodyTable] {width:100%!important;margin:auto;max-width:500px!important;color:#7A7A7A;font-weight:normal;}\n" +
                "        img, a img{border:0; outline:none; text-decoration:none;height:auto; line-height:100%;}\n" +
                "        a {text-decoration:none !important;border-bottom: 1px solid;}\n" +
                "        h1, h2, h3, h4, h5, h6{color:#5F5F5F; font-weight:normal; font-family:Helvetica; font-size:20px; line-height:125%; text-align:Left; letter-spacing:normal;margin-top:0;margin-right:0;margin-bottom:10px;margin-left:0;padding-top:0;padding-bottom:0;padding-left:0;padding-right:0;}\n" +
                "        /* CLIENT-SPECIFIC STYLES */\n" +
                "        .ReadMsgBody{width:100%;} .ExternalClass{width:100%;} /* Force Hotmail/Outlook.com to display emails at full width. */\n" +
                "        .ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div{line-height:100%;} /* Force Hotmail/Outlook.com to display line heights normally. */\n" +
                "        table, td{mso-table-lspace:0pt; mso-table-rspace:0pt;} /* Remove spacing between tables in Outlook 2007 and up. */\n" +
                "        #outlook a{padding:0;} /* Force Outlook 2007 and up to provide a \"view in browser\" message. */\n" +
                "        img{-ms-interpolation-mode: bicubic;display:block;outline:none; text-decoration:none;} /* Force IE to smoothly render resized images. */\n" +
                "        body, table, td, p, a, li, blockquote{-ms-text-size-adjust:100%; -webkit-text-size-adjust:100%; font-weight:normal!important;} /* Prevent Windows- and Webkit-based mobile platforms from changing declared text sizes. */\n" +
                "        .ExternalClass td[class=\"ecxflexibleContainerBox\"] h3 {padding-top: 10px !important;} /* Force hotmail to push 2-grid sub headers down */\n" +
                "        /* /\\/\\/\\/\\/\\/\\/\\/\\/ TEMPLATE STYLES /\\/\\/\\/\\/\\/\\/\\/\\/ */\n" +
                "        /* ========== Page Styles ========== */\n" +
                "        h1{display:block;font-size:26px;font-style:normal;font-weight:normal;line-height:100%;}\n" +
                "        h2{display:block;font-size:20px;font-style:normal;font-weight:normal;line-height:120%;}\n" +
                "        h3{display:block;font-size:17px;font-style:normal;font-weight:normal;line-height:110%;}\n" +
                "        h4{display:block;font-size:18px;font-style:italic;font-weight:normal;line-height:100%;}\n" +
                "        .flexibleImage{height:auto;}\n" +
                "        .linkRemoveBorder{border-bottom:0 !important;}\n" +
                "        table[class=flexibleContainerCellDivider] {padding-bottom:0 !important;padding-top:0 !important;}\n" +
                "        body, #bodyTable{background-color:#E1E1E1;}\n" +
                "        #emailHeader{background-color:#E1E1E1;}\n" +
                "        #emailBody{background-color:#FFFFFF;}\n" +
                "        #emailFooter{background-color:#E1E1E1;}\n" +
                "        .nestedContainer{background-color:#F8F8F8; border:1px solid #CCCCCC;}\n" +
                "        .emailButton{background-color:#cc0033; border-collapse:separate;}\n" +
                "        .buttonContent{color:#FFFFFF; font-family:Helvetica; font-size:18px; font-weight:bold; line-height:100%; padding:15px; text-align:center;}\n" +
                "        .buttonContent a{color:#FFFFFF; display:block; text-decoration:none!important; border:0!important;}\n" +
                "        .emailCalendar{background-color:#FFFFFF; border:1px solid #CCCCCC;}\n" +
                "        .emailCalendarMonth{background-color:#cc0033; color:#FFFFFF; font-family:Helvetica, Arial, sans-serif; font-size:16px; font-weight:bold; padding-top:10px; padding-bottom:10px; text-align:center;}\n" +
                "        .emailCalendarDay{color:#cc0033; font-family:Helvetica, Arial, sans-serif; font-size:60px; font-weight:bold; line-height:100%; padding-top:20px; padding-bottom:20px; text-align:center;}\n" +
                "        .imageContentText {margin-top: 10px;line-height:0;}\n" +
                "        .imageContentText a {line-height:0;}\n" +
                "        #invisibleIntroduction {display:none !important;} /* Removing the introduction text from the view */\n" +
                "        /*FRAMEWORK HACKS & OVERRIDES */\n" +
                "        span[class=ios-color-hack] a {color:#275100!important;text-decoration:none!important;} /* Remove all link colors in IOS (below are duplicates based on the color preference) */\n" +
                "        span[class=ios-color-hack2] a {color:#cc0033!important;text-decoration:none!important;}\n" +
                "        span[class=ios-color-hack3] a {color:#8B8B8B!important;text-decoration:none!important;}\n" +
                "        /* A nice and clean way to target phone numbers you want clickable and avoid a mobile phone from linking other numbers that look like, but are not phone numbers.  Use these two blocks of code to \"unstyle\" any numbers that may be linked.  The second block gives you a class to apply with a span tag to the numbers you would like linked and styled.\n" +
                "        Inspired by Campaign Monitors article on using phone numbers in email: http://www.campaignmonitor.com/blog/post/3571/using-phone-numbers-in-html-email/.\n" +
                "        */\n" +
                "        .a[href^=\"tel\"], a[href^=\"sms\"] {text-decoration:none!important;color:#606060!important;pointer-events:none!important;cursor:default!important;}\n" +
                "        .mobile_link a[href^=\"tel\"], .mobile_link a[href^=\"sms\"] {text-decoration:none!important;color:#606060!important;pointer-events:auto!important;cursor:default!important;}\n" +
                "        /* MOBILE STYLES */\n" +
                "        @media only screen and (max-width: 480px){\n" +
                "            /*////// CLIENT-SPECIFIC STYLES //////*/\n" +
                "            body{width:100% !important; min-width:100% !important;} /* Force iOS Mail to render the email at full width. */\n" +
                "            /* FRAMEWORK STYLES */\n" +
                "            /*\n" +
                "            CSS selectors are written in attribute\n" +
                "            selector format to prevent Yahoo Mail\n" +
                "            from rendering media query styles on\n" +
                "            desktop.\n" +
                "            */\n" +
                "            /*td[class=\"textContent\"], td[class=\"flexibleContainerCell\"] { width: 100%; padding-left: 10px !important; padding-right: 10px !important; }*/\n" +
                "            table[id=\"emailHeader\"],\n" +
                "            table[id=\"emailBody\"],\n" +
                "            table[id=\"emailFooter\"],\n" +
                "            table[class=\"flexibleContainer\"],\n" +
                "            td[class=\"flexibleContainerCell\"] {width:100% !important;}\n" +
                "            td[class=\"flexibleContainerBox\"], td[class=\"flexibleContainerBox\"] table {display: block;width: 100%;text-align: left;}\n" +
                "            /*\n" +
                "            The following style rule makes any\n" +
                "            image classed with flexibleImage\n" +
                "            fluid when the query activates.\n" +
                "            Make sure you add an inline max-width\n" +
                "            to those images to prevent them\n" +
                "            from blowing out.\n" +
                "            */\n" +
                "            td[class=\"imageContent\"] img {height:auto !important; width:100% !important; max-width:100% !important; }\n" +
                "            img[class=\"flexibleImage\"]{height:auto !important; width:100% !important;max-width:100% !important;}\n" +
                "            img[class=\"flexibleImageSmall\"]{height:auto !important; width:auto !important;}\n" +
                "            /*\n" +
                "            Create top space for every second element in a block\n" +
                "            */\n" +
                "            table[class=\"flexibleContainerBoxNext\"]{padding-top: 10px !important;}\n" +
                "            /*\n" +
                "            Make buttons in the email span the\n" +
                "            full width of their container, allowing\n" +
                "            for left- or right-handed ease of use.\n" +
                "            */\n" +
                "            table[class=\"emailButton\"]{width:100% !important;}\n" +
                "            td[class=\"buttonContent\"]{padding:0 !important;}\n" +
                "            td[class=\"buttonContent\"] a{padding:15px !important;}\n" +
                "        }\n" +
                "        /*  CONDITIONS FOR ANDROID DEVICES ONLY\n" +
                "        *   http://developer.android.com/guide/webapps/targeting.html\n" +
                "        *   http://pugetworks.com/2011/04/css-media-queries-for-targeting-different-mobile-devices/ ;\n" +
                "        =====================================================*/\n" +
                "        @media only screen and (-webkit-device-pixel-ratio:.75){\n" +
                "            /* Put CSS for low density (ldpi) Android layouts in here */\n" +
                "        }\n" +
                "        @media only screen and (-webkit-device-pixel-ratio:1){\n" +
                "            /* Put CSS for medium density (mdpi) Android layouts in here */\n" +
                "        }\n" +
                "        @media only screen and (-webkit-device-pixel-ratio:1.5){\n" +
                "            /* Put CSS for high density (hdpi) Android layouts in here */\n" +
                "        }\n" +
                "        /* end Android targeting */\n" +
                "        /* CONDITIONS FOR IOS DEVICES ONLY\n" +
                "        =====================================================*/\n" +
                "        @media only screen and (min-device-width : 320px) and (max-device-width:568px) {\n" +
                "        }\n" +
                "        /* end IOS targeting */\n" +
                "    </style>\n" +
                "\n" +
                "    <!--[if mso 12]>\n" +
                "    <style type=\"text/css\">\n" +
                "        .flexibleContainer{display:block !important; width:100% !important;}\n" +
                "    </style>\n" +
                "    <![endif]-->\n" +
                "    <!--[if mso 14]>\n" +
                "    <style type=\"text/css\">\n" +
                "        .flexibleContainer{display:block !important; width:100% !important;}\n" +
                "    </style>\n" +
                "    <![endif]-->\n" +
                "</head>\n" +
                "<body bgcolor=\"#E1E1E1\" leftmargin=\"0\" marginwidth=\"0\" topmargin=\"0\" marginheight=\"0\" offset=\"0\">\n" +
                "\n" +
                "<center style=\"background-color:#E1E1E1;\">\n" +
                "    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" id=\"bodyTable\" style=\"table-layout: fixed;max-width:100% !important;width: 100% !important;min-width: 100% !important;\">\n" +
                "        <tr>\n" +
                "            <td align=\"center\" valign=\"top\" id=\"bodyCell\">\n" +
                "\n" +
                "\n" +
                "                <table bgcolor=\"#E1E1E1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailHeader\">\n" +
                "\n" +
                "                    <!-- HEADER ROW // -->\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"10\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "\n" +
                "                                                            <td align=\"left\" valign=\"middle\" id=\"invisibleIntroduction\" class=\"flexibleContainerBox\" style=\"display:none !important; mso-hide:all;\">\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "                                                                                Welcome to SDSU Conference Management portal. Your account details are here.\n" +
                "                                                                            </div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                            <td align=\"right\" valign=\"middle\" class=\"flexibleContainerBox\">\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <!-- CONTENT // -->\n" +
                "                                                                            <div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "                                                                                "+
                "                                                                            </div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // END -->\n" +
                "\n" +
                "                </table>\n" +
                "\n" +
                "                <table bgcolor=\"#FFFFFF\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailBody\">\n" +
                "\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"color:#FFFFFF;\" bgcolor=\"#cc0033\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "\n" +
                "                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"center\" valign=\"top\" class=\"textContent\">\n" +
                "                                                                <h1 style=\"color:#FFFFFF;line-height:100%;font-family:Helvetica,Arial,sans-serif;font-size:35px;font-weight:normal;margin-bottom:5px;text-align:center;\">User Credentials</h1>\n" +
                "                                                                <h2 style=\"text-align:center;font-weight:normal;font-family:Helvetica,Arial,sans-serif;font-size:23px;margin-bottom:10px;color:#fff;line-height:135%;\">Welcome to the Conference Management Portal.</h2>\n" +
                "                                                                <div style=\"text-align:center;font-family:Helvetica,Arial,sans-serif;font-size:15px;margin-bottom:0;color:#FFFFFF;line-height:135%;\"> You have been added as an author to one of the papers submitted at Conference Management portal.<br><span style=\"color:white;\">Here is your temporary User name and password. Make sure you change your password once you login.</span></div>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr mc:hideable>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"left\" valign=\"top\" class=\"flexibleContainerBox\">\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                            <td align=\"right\" valign=\"middle\" class=\"flexibleContainerBox\">\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // MODULE ROW -->\n" +
                "\n" +
                "\n" +
                "                    <!-- MODULE ROW // -->\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr style=\"padding-top:0;\">\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td style=\"padding-top:0;\" align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"50%\" class=\"emailButton\" style=\"background-color: #cc0033;\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"center\" valign=\"middle\" class=\"buttonContent\" style=\"padding-top:15px;padding-bottom:15px;padding-right:15px;padding-left:15px;\">\n" +
                "                                                               <p>User Name : "+ this.email+"</p>" +
                "                                                               <p>Password : "+this.password+"</p>"+
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    \n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"color:#FFFFFF;\" bgcolor=\"#cc0033\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"left\" valign=\"top\" class=\"flexibleContainerBox\">\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"270\" style=\"max-width: 100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <h3 style=\"color:#FFFFFF;line-height:125%;font-family:Helvetica,Arial,sans-serif;font-size:16px;font-weight:normal;margin-top:0;margin-bottom:3px;text-align:left;\">San Diego State University</h3>\n" +
                "                                                                            <div style=\"text-align:left;font-family:Helvetica,Arial,sans-serif;font-size:12px;margin-bottom:0;color:#FFFFFF;line-height:135%;\">Department of Mechanical Engineering <br>5500 Campanile Drive <br> San Diego<br> CA 92182</div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                            <td align=\"right\" valign=\"middle\" class=\"flexibleContainerBox\">\n" +
                "                                                                <table class=\"flexibleContainerBoxNext\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"210\" style=\"max-width: 100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <h3 style=\"color:#FFFFFF;line-height:125%;font-family:Helvetica,Arial,sans-serif;font-size:14px;font-weight:normal;margin-top:0;margin-bottom:3px;text-align:left;\">Contact</h3>\n" +
                "                                                                            <div style=\"text-align:left;font-family:Helvetica,Arial,sans-serif;font-size:12px;margin-bottom:0;color:#FFFFFF;line-height:135%;\">E-mail : contact@ecosconference.org</div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // MODULE ROW -->\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                    <!-- MODULE DIVIDER // -->\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "                                                    <table class=\"flexibleContainerCellDivider\" border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"center\" valign=\"top\" style=\"padding-top:0px;padding-bottom:0px;\">\n" +
                "\n" +
                "                                                                <!-- CONTENT TABLE // -->\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"center\" valign=\"top\" style=\"border-top:1px solid #C8C8C8;\"></td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                                <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // END -->\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                </table>\n" +
                "               \n" +
                "                <table bgcolor=\"#E1E1E1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailFooter\">\n" +
                "\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "                                                    <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td valign=\"top\" bgcolor=\"#E1E1E1\">\n" +
                "\n" +
                "                                                                <div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "                                                                    <div>Copyright &#169; 2016 - 2017 <a href=\"www.sdsu.edu\" target=\"_blank\" style=\"text-decoration:none;color:#828282;\"><span style=\"color:#828282;\">San Diego State University</span></a>. All&nbsp;rights&nbsp;reserved.</div>\n" +
                "\n" +
                "                                                                </div>\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                </table>\n" +
                "                <!-- // END -->\n" +
                "\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "    </table>\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>";
    }

    public String getTemplate() {
        return template;
    }

    public String getSubmissionTemplate() {
        return submissionTemplate;
    }

    public void setSubmissionTemplate(String submissionLink, String submissionId) {
        this.submissionTemplate = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                "    <meta name=\"format-detection\" content=\"telephone=no\" /> <!-- disable auto telephone linking in iOS -->\n" +
                "    <title>ECOS 2017</title>\n" +
                "    <style type=\"text/css\">\n" +
                "        /* RESET STYLES */\n" +
                "        html { background-color:#E1E1E1; margin:0; padding:0; }\n" +
                "        body, #bodyTable, #bodyCell, #bodyCell{height:100% !important; margin:0; padding:0; width:100% !important;font-family:Helvetica, Arial, \"Lucida Grande\", sans-serif;}\n" +
                "        table{border-collapse:collapse;}\n" +
                "        table[id=bodyTable] {width:100%!important;margin:auto;max-width:500px!important;color:#7A7A7A;font-weight:normal;}\n" +
                "        img, a img{border:0; outline:none; text-decoration:none;height:auto; line-height:100%;}\n" +
                "        a {text-decoration:none !important;border-bottom: 1px solid;}\n" +
                "        h1, h2, h3, h4, h5, h6{color:#5F5F5F; font-weight:normal; font-family:Helvetica; font-size:20px; line-height:125%; text-align:Left; letter-spacing:normal;margin-top:0;margin-right:0;margin-bottom:10px;margin-left:0;padding-top:0;padding-bottom:0;padding-left:0;padding-right:0;}\n" +
                "        /* CLIENT-SPECIFIC STYLES */\n" +
                "        .ReadMsgBody{width:100%;} .ExternalClass{width:100%;} /* Force Hotmail/Outlook.com to display emails at full width. */\n" +
                "        .ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div{line-height:100%;} /* Force Hotmail/Outlook.com to display line heights normally. */\n" +
                "        table, td{mso-table-lspace:0pt; mso-table-rspace:0pt;} /* Remove spacing between tables in Outlook 2007 and up. */\n" +
                "        #outlook a{padding:0;} /* Force Outlook 2007 and up to provide a \"view in browser\" message. */\n" +
                "        img{-ms-interpolation-mode: bicubic;display:block;outline:none; text-decoration:none;} /* Force IE to smoothly render resized images. */\n" +
                "        body, table, td, p, a, li, blockquote{-ms-text-size-adjust:100%; -webkit-text-size-adjust:100%; font-weight:normal!important;} /* Prevent Windows- and Webkit-based mobile platforms from changing declared text sizes. */\n" +
                "        .ExternalClass td[class=\"ecxflexibleContainerBox\"] h3 {padding-top: 10px !important;} /* Force hotmail to push 2-grid sub headers down */\n" +
                "        /* /\\/\\/\\/\\/\\/\\/\\/\\/ TEMPLATE STYLES /\\/\\/\\/\\/\\/\\/\\/\\/ */\n" +
                "        /* ========== Page Styles ========== */\n" +
                "        h1{display:block;font-size:26px;font-style:normal;font-weight:normal;line-height:100%;}\n" +
                "        h2{display:block;font-size:20px;font-style:normal;font-weight:normal;line-height:120%;}\n" +
                "        h3{display:block;font-size:17px;font-style:normal;font-weight:normal;line-height:110%;}\n" +
                "        h4{display:block;font-size:18px;font-style:italic;font-weight:normal;line-height:100%;}\n" +
                "        .flexibleImage{height:auto;}\n" +
                "        .linkRemoveBorder{border-bottom:0 !important;}\n" +
                "        table[class=flexibleContainerCellDivider] {padding-bottom:0 !important;padding-top:0 !important;}\n" +
                "        body, #bodyTable{background-color:#E1E1E1;}\n" +
                "        #emailHeader{background-color:#E1E1E1;}\n" +
                "        #emailBody{background-color:#FFFFFF;}\n" +
                "        #emailFooter{background-color:#E1E1E1;}\n" +
                "        .nestedContainer{background-color:#F8F8F8; border:1px solid #CCCCCC;}\n" +
                "        .emailButton{background-color:#cc0033; border-collapse:separate;}\n" +
                "        .buttonContent{color:#FFFFFF; font-family:Helvetica; font-size:18px; font-weight:bold; line-height:100%; padding:15px; text-align:center;}\n" +
                "        .buttonContent a{color:#FFFFFF; display:block; text-decoration:none!important; border:0!important;}\n" +
                "        .emailCalendar{background-color:#FFFFFF; border:1px solid #CCCCCC;}\n" +
                "        .emailCalendarMonth{background-color:#cc0033; color:#FFFFFF; font-family:Helvetica, Arial, sans-serif; font-size:16px; font-weight:bold; padding-top:10px; padding-bottom:10px; text-align:center;}\n" +
                "        .emailCalendarDay{color:#cc0033; font-family:Helvetica, Arial, sans-serif; font-size:60px; font-weight:bold; line-height:100%; padding-top:20px; padding-bottom:20px; text-align:center;}\n" +
                "        .imageContentText {margin-top: 10px;line-height:0;}\n" +
                "        .imageContentText a {line-height:0;}\n" +
                "        #invisibleIntroduction {display:none !important;} /* Removing the introduction text from the view */\n" +
                "        /*FRAMEWORK HACKS & OVERRIDES */\n" +
                "        span[class=ios-color-hack] a {color:#275100!important;text-decoration:none!important;} /* Remove all link colors in IOS (below are duplicates based on the color preference) */\n" +
                "        span[class=ios-color-hack2] a {color:#cc0033!important;text-decoration:none!important;}\n" +
                "        span[class=ios-color-hack3] a {color:#8B8B8B!important;text-decoration:none!important;}\n" +
                "        /* A nice and clean way to target phone numbers you want clickable and avoid a mobile phone from linking other numbers that look like, but are not phone numbers.  Use these two blocks of code to \"unstyle\" any numbers that may be linked.  The second block gives you a class to apply with a span tag to the numbers you would like linked and styled.\n" +
                "        Inspired by Campaign Monitors article on using phone numbers in email: http://www.campaignmonitor.com/blog/post/3571/using-phone-numbers-in-html-email/.\n" +
                "        */\n" +
                "        .a[href^=\"tel\"], a[href^=\"sms\"] {text-decoration:none!important;color:#606060!important;pointer-events:none!important;cursor:default!important;}\n" +
                "        .mobile_link a[href^=\"tel\"], .mobile_link a[href^=\"sms\"] {text-decoration:none!important;color:#606060!important;pointer-events:auto!important;cursor:default!important;}\n" +
                "        /* MOBILE STYLES */\n" +
                "        @media only screen and (max-width: 480px){\n" +
                "            /*////// CLIENT-SPECIFIC STYLES //////*/\n" +
                "            body{width:100% !important; min-width:100% !important;} /* Force iOS Mail to render the email at full width. */\n" +
                "            /* FRAMEWORK STYLES */\n" +
                "            /*\n" +
                "            CSS selectors are written in attribute\n" +
                "            selector format to prevent Yahoo Mail\n" +
                "            from rendering media query styles on\n" +
                "            desktop.\n" +
                "            */\n" +
                "            /*td[class=\"textContent\"], td[class=\"flexibleContainerCell\"] { width: 100%; padding-left: 10px !important; padding-right: 10px !important; }*/\n" +
                "            table[id=\"emailHeader\"],\n" +
                "            table[id=\"emailBody\"],\n" +
                "            table[id=\"emailFooter\"],\n" +
                "            table[class=\"flexibleContainer\"],\n" +
                "            td[class=\"flexibleContainerCell\"] {width:100% !important;}\n" +
                "            td[class=\"flexibleContainerBox\"], td[class=\"flexibleContainerBox\"] table {display: block;width: 100%;text-align: left;}\n" +
                "            /*\n" +
                "            The following style rule makes any\n" +
                "            image classed with flexibleImage\n" +
                "            fluid when the query activates.\n" +
                "            Make sure you add an inline max-width\n" +
                "            to those images to prevent them\n" +
                "            from blowing out.\n" +
                "            */\n" +
                "            td[class=\"imageContent\"] img {height:auto !important; width:100% !important; max-width:100% !important; }\n" +
                "            img[class=\"flexibleImage\"]{height:auto !important; width:100% !important;max-width:100% !important;}\n" +
                "            img[class=\"flexibleImageSmall\"]{height:auto !important; width:auto !important;}\n" +
                "            /*\n" +
                "            Create top space for every second element in a block\n" +
                "            */\n" +
                "            table[class=\"flexibleContainerBoxNext\"]{padding-top: 10px !important;}\n" +
                "            /*\n" +
                "            Make buttons in the email span the\n" +
                "            full width of their container, allowing\n" +
                "            for left- or right-handed ease of use.\n" +
                "            */\n" +
                "            table[class=\"emailButton\"]{width:100% !important;}\n" +
                "            td[class=\"buttonContent\"]{padding:0 !important;}\n" +
                "            td[class=\"buttonContent\"] a{padding:15px !important;}\n" +
                "        }\n" +
                "        /*  CONDITIONS FOR ANDROID DEVICES ONLY\n" +
                "        *   http://developer.android.com/guide/webapps/targeting.html\n" +
                "        *   http://pugetworks.com/2011/04/css-media-queries-for-targeting-different-mobile-devices/ ;\n" +
                "        =====================================================*/\n" +
                "        @media only screen and (-webkit-device-pixel-ratio:.75){\n" +
                "            /* Put CSS for low density (ldpi) Android layouts in here */\n" +
                "        }\n" +
                "        @media only screen and (-webkit-device-pixel-ratio:1){\n" +
                "            /* Put CSS for medium density (mdpi) Android layouts in here */\n" +
                "        }\n" +
                "        @media only screen and (-webkit-device-pixel-ratio:1.5){\n" +
                "            /* Put CSS for high density (hdpi) Android layouts in here */\n" +
                "        }\n" +
                "        /* end Android targeting */\n" +
                "        /* CONDITIONS FOR IOS DEVICES ONLY\n" +
                "        =====================================================*/\n" +
                "        @media only screen and (min-device-width : 320px) and (max-device-width:568px) {\n" +
                "        }\n" +
                "        /* end IOS targeting */\n" +
                "    </style>\n" +
                "\n" +
                "    <!--[if mso 12]>\n" +
                "    <style type=\"text/css\">\n" +
                "        .flexibleContainer{display:block !important; width:100% !important;}\n" +
                "    </style>\n" +
                "    <![endif]-->\n" +
                "    <!--[if mso 14]>\n" +
                "    <style type=\"text/css\">\n" +
                "        .flexibleContainer{display:block !important; width:100% !important;}\n" +
                "    </style>\n" +
                "    <![endif]-->\n" +
                "</head>\n" +
                "<body bgcolor=\"#E1E1E1\" leftmargin=\"0\" marginwidth=\"0\" topmargin=\"0\" marginheight=\"0\" offset=\"0\">\n" +
                "\n" +
                "<center style=\"background-color:#E1E1E1;\">\n" +
                "    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" id=\"bodyTable\" style=\"table-layout: fixed;max-width:100% !important;width: 100% !important;min-width: 100% !important;\">\n" +
                "        <tr>\n" +
                "            <td align=\"center\" valign=\"top\" id=\"bodyCell\">\n" +
                "\n" +
                "\n" +
                "                <table bgcolor=\"#E1E1E1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailHeader\">\n" +
                "\n" +
                "                    <!-- HEADER ROW // -->\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"10\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "\n" +
                "                                                            <td align=\"left\" valign=\"middle\" id=\"invisibleIntroduction\" class=\"flexibleContainerBox\" style=\"display:none !important; mso-hide:all;\">\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "                                                                                SDSU Conference Management portal. Your submission details are here.\n" +
                "                                                                            </div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                            <td align=\"right\" valign=\"middle\" class=\"flexibleContainerBox\">\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <!-- CONTENT // -->\n" +
                "                                                                            <div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "                                                                                "+
                "                                                                            </div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // END -->\n" +
                "\n" +
                "                </table>\n" +
                "\n" +
                "                <table bgcolor=\"#FFFFFF\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailBody\">\n" +
                "\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"color:#FFFFFF;\" bgcolor=\"#cc0033\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "\n" +
                "                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"center\" valign=\"top\" class=\"textContent\">\n" +
                "                                                                <h1 style=\"color:#FFFFFF;line-height:100%;font-family:Helvetica,Arial,sans-serif;font-size:35px;font-weight:normal;margin-bottom:5px;text-align:center;\">Submission Details</h1>\n" +
                "                                                                <h2 style=\"text-align:center;font-weight:normal;font-family:Helvetica,Arial,sans-serif;font-size:23px;margin-bottom:10px;color:#fff;line-height:135%;\">Welcome to the Conference Management Portal.</h2>\n" +
                "                                                                <div style=\"text-align:center;font-family:Helvetica,Arial,sans-serif;font-size:15px;margin-bottom:0;color:#FFFFFF;line-height:135%;\"> Your submission has been accepted. Please see the details below.</div>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr mc:hideable>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"left\" valign=\"top\" class=\"flexibleContainerBox\">\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                            <td align=\"right\" valign=\"middle\" class=\"flexibleContainerBox\">\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // MODULE ROW -->\n" +
                "\n" +
                "\n" +
                "                    <!-- MODULE ROW // -->\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr style=\"padding-top:0;\">\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td style=\"padding-top:0;\" align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"50%\" class=\"emailButton\" style=\"background-color: #cc0033;\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"center\" valign=\"middle\" class=\"buttonContent\" style=\"padding-top:15px;padding-bottom:15px;padding-right:15px;padding-left:15px;\">\n" +
                "                                                               <p>Submission ID : "+ submissionId+"</p>" +
                "                                                               <p>Access your submission at : "+submissionLink+"</p>"+
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    \n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"color:#FFFFFF;\" bgcolor=\"#cc0033\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "                                                    <!-- CONTENT TABLE // -->\n" +
                "                                                    <table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"left\" valign=\"top\" class=\"flexibleContainerBox\">\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"270\" style=\"max-width: 100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <h3 style=\"color:#FFFFFF;line-height:125%;font-family:Helvetica,Arial,sans-serif;font-size:16px;font-weight:normal;margin-top:0;margin-bottom:3px;text-align:left;\">San Diego State University</h3>\n" +
                "                                                                            <div style=\"text-align:left;font-family:Helvetica,Arial,sans-serif;font-size:12px;margin-bottom:0;color:#FFFFFF;line-height:135%;\">Department of Mechanical Engineering <br>5500 Campanile Drive <br> San Diego<br> CA 92182</div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                            <td align=\"right\" valign=\"middle\" class=\"flexibleContainerBox\">\n" +
                "                                                                <table class=\"flexibleContainerBoxNext\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"210\" style=\"max-width: 100%;\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"left\" class=\"textContent\">\n" +
                "                                                                            <h3 style=\"color:#FFFFFF;line-height:125%;font-family:Helvetica,Arial,sans-serif;font-size:14px;font-weight:normal;margin-top:0;margin-bottom:3px;text-align:left;\">Contact</h3>\n" +
                "                                                                            <div style=\"text-align:left;font-family:Helvetica,Arial,sans-serif;font-size:12px;margin-bottom:0;color:#FFFFFF;line-height:135%;\">E-mail : contact@ecosconference.org</div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                    <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // MODULE ROW -->\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                    <!-- MODULE DIVIDER // -->\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "                                                    <table class=\"flexibleContainerCellDivider\" border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td align=\"center\" valign=\"top\" style=\"padding-top:0px;padding-bottom:0px;\">\n" +
                "\n" +
                "                                                                <!-- CONTENT TABLE // -->\n" +
                "                                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td align=\"center\" valign=\"top\" style=\"border-top:1px solid #C8C8C8;\"></td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </table>\n" +
                "                                                                <!-- // CONTENT TABLE -->\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <!-- // END -->\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                </table>\n" +
                "               \n" +
                "                <table bgcolor=\"#E1E1E1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailFooter\">\n" +
                "\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" valign=\"top\">\n" +
                "                            <!-- CENTERING TABLE // -->\n" +
                "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" valign=\"top\">\n" +
                "                                        <!-- FLEXIBLE CONTAINER // -->\n" +
                "                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "                                            <tr>\n" +
                "                                                <td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "                                                    <table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "                                                        <tr>\n" +
                "                                                            <td valign=\"top\" bgcolor=\"#E1E1E1\">\n" +
                "\n" +
                "                                                                <div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "                                                                    <div>Copyright &#169; 2016 - 2017 <a href=\"www.sdsu.edu\" target=\"_blank\" style=\"text-decoration:none;color:#828282;\"><span style=\"color:#828282;\">San Diego State University</span></a>. All&nbsp;rights&nbsp;reserved.</div>\n" +
                "\n" +
                "                                                                </div>\n" +
                "\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </table>\n" +
                "                                        <!-- // FLEXIBLE CONTAINER -->\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </table>\n" +
                "                            <!-- // CENTERING TABLE -->\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                </table>\n" +
                "                <!-- // END -->\n" +
                "\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "    </table>\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>";
    }
}
