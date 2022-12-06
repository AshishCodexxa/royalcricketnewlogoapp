package com.cricketscoreprediction.app.webservice;

public interface WebResponseListener {
    void onError(String str);

    void onResponse(Object obj, WebCallType webCallType);
}
