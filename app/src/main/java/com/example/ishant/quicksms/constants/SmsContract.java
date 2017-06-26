package com.example.ishant.quicksms.constants;

import android.net.Uri;

public class SmsContract {

    public static final Uri ALL_SMS_URI = Uri.parse("content://sms/inbox");
    public static final String SMS_SELECTION = "address = ? ";
    public static final String SMS_SELECTION_ID = "_id = ? ";
    public static final String COLUMN_ID = "_id";
    public static final String SMS_SELECTION_SEARCH = "address LIKE ? OR body LIKE ?";
    public static final String SORT_DESC = "date DESC";

}
