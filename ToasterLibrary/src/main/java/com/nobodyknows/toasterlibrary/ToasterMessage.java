package com.nobodyknows.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ToasterMessage(Context context) {
        this.context = context;
    }

    public void showMessageForLong(String message) {
        Toast.makeText(getContext(),message,Toast.LENGTH_LONG).show();
    }

    public void showMessageForShort(String message) {
        Toast.makeText(getContext(),message,Toast.LENGTH_SHORT).show();
    }
}
