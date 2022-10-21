package com.gsbusiness.livecricketscoreprediction.webservice;

public interface WebResponseListener {
    void onError(String str);

    void onResponse(Object obj, WebCallType webCallType);
}
