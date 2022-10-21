package com.gsbusiness.livecricketscoreprediction.webservice;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.Window;
import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import com.gsbusiness.livecricketscoreprediction.R;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class WebRequest {
    private Context mContext;
    private ProgressDialog processDialog;

    public WebRequest(Context context) {
        this.mContext = context;
        this.processDialog = new ProgressDialog(context);
    }

    private void showProcess() {
        ProgressDialog progressDialog = this.processDialog;
        if (progressDialog != null) {
            progressDialog.show();
            this.processDialog.setCancelable(false);
            Window window = this.processDialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            this.processDialog.setContentView(R.layout.process_dialog);
        }
    }

    private void cancelProcess() {
        ProgressDialog progressDialog = this.processDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public void GET_METHOD(String str, final WebResponseListener webResponseListener, String str2, final WebCallType webCallType, boolean z) {
        if (this.mContext != null) {
            StringRequest stringRequest = new StringRequest(0, str, new Response.Listener<String>() {

                public void onResponse(String str) {
                    webResponseListener.onResponse(str, webCallType);
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    webResponseListener.onError(volleyError.getMessage());
                }
            });
            stringRequest.setTag(this.mContext);
            MySingleton.getInstance(this.mContext).addToRequestQueue(stringRequest);
            return;
        }
        Log.d("WebRequest", "Something went wrong!");
    }

    public void POST_METHOD(String str, JSONObject jSONObject, final Map<String, String> map, final WebResponseListener webResponseListener, final WebCallType webCallType, String str2, boolean z) {
        if (this.mContext != null) {
            if (z) {
                showProcess();
            }
            if (map != null) {
                StringRequest r9 = new StringRequest(1, str, new Response.Listener<String>() {

                    public void onResponse(String str) {
                        WebRequest.this.cancelProcess();
                        webResponseListener.onResponse(str, webCallType);
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        WebRequest.this.cancelProcess();
                        webResponseListener.onError(volleyError.toString());
                    }
                }) {

                    @Override
                    public Map<String, String> getHeaders() throws AuthFailureError {
                        HashMap hashMap = new HashMap();
                        hashMap.put("Content-Type", "application/json");
                        return hashMap;
                    }

                    @Override
                    public Map<String, String> getParams() throws AuthFailureError {
                        return map;
                    }
                };
                r9.setTag(this.mContext);
                MySingleton.getInstance(this.mContext).addToRequestQueue(r9);
                return;
            }
            JsonObjectRequest r10 = new JsonObjectRequest(1, str, jSONObject, new Response.Listener<JSONObject>() {


                public void onResponse(JSONObject jSONObject) {
                    WebRequest.this.cancelProcess();
                    webResponseListener.onResponse(jSONObject, webCallType);
                }
            }, new Response.ErrorListener() {


                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    WebRequest.this.cancelProcess();
                    webResponseListener.onError(volleyError.toString());
                }
            }) {

                @Override
                public Map<String, String> getHeaders() throws AuthFailureError {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Content-Type", "application/json");
                    hashMap.put("cache-control", "no-cache");
                    return hashMap;
                }
            };
            r10.setTag(this.mContext);
            MySingleton.getInstance(this.mContext).addToRequestQueue(r10);
            r10.setRetryPolicy(new DefaultRetryPolicy(60000, 1, 1.0f));
            return;
        }
        Log.d("WebRequest", "Something went wrong!");
    }

    public void POST_MULTIPART(String str, final Map<String, String> map, final Map<String, DataPart> map2, final WebResponseListener webResponseListener, final WebCallType webCallType, boolean z) {
        if (this.mContext != null) {
            if (z) {
                showProcess();
            }
            VolleyMultipartRequest r15 = new VolleyMultipartRequest(1, str, new Response.Listener<NetworkResponse>() {

                public void onResponse(NetworkResponse networkResponse) {
                    WebRequest.this.cancelProcess();
                    webResponseListener.onResponse(new String(networkResponse.data), webCallType);
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    WebRequest.this.cancelProcess();
                    webResponseListener.onError(volleyError.toString());
                }
            }) {
                @Override
                public Map<String, String> getParams() throws AuthFailureError {
                    return map;
                }

                @Override
                public Map<String, DataPart> getByteData() {
                    return map2;
                }
            };
            r15.setTag(this.mContext);
            MySingleton.getInstance(this.mContext).addToRequestQueue(r15);
            r15.setRetryPolicy(new DefaultRetryPolicy(60000, 1, 1.0f));
            return;
        }
        Log.d("WebRequest", "Something went wrong!");
    }

    public void CancelRequest() {
        RequestQueue requestQueue;
        Context context = this.mContext;
        if (context != null && (requestQueue = MySingleton.getInstance(context).getRequestQueue()) != null) {
            requestQueue.cancelAll(this.mContext);
        }
    }

    public void GROUP_GET_METHOD(String str, final WebResponseListener webResponseListener, final Map<String, String> map, JSONObject jSONObject, final WebCallType webCallType, boolean z) {
        if (z) {
            showProcess();
        }
        if (this.mContext != null) {
            if (z) {
                showProcess();
            }
            if (map != null) {
                StringRequest r12 = new StringRequest(1, str, new Response.Listener<String>() {

                    public void onResponse(String str) {
                        WebRequest.this.cancelProcess();
                        webResponseListener.onResponse(str, webCallType);
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        WebRequest.this.cancelProcess();
                        webResponseListener.onError(volleyError.toString());
                    }
                }) {

                    @Override
                    public Map<String, String> getParams() throws AuthFailureError {
                        return map;
                    }
                };
                r12.setTag(this.mContext);
                MySingleton.getInstance(this.mContext).addToRequestQueue(r12);
                return;
            }
            JsonObjectRequest r11 = new JsonObjectRequest(1, str, jSONObject, new Response.Listener<JSONObject>() {

                public void onResponse(JSONObject jSONObject) {
                    WebRequest.this.cancelProcess();
                    webResponseListener.onResponse(jSONObject, webCallType);
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    WebRequest.this.cancelProcess();
                    webResponseListener.onError(volleyError.toString());
                }
            }) {

                @Override
                public Map<String, String> getHeaders() throws AuthFailureError {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Content-Type", "application/json");
                    return hashMap;
                }
            };
            r11.setTag(this.mContext);
            MySingleton.getInstance(this.mContext).addToRequestQueue(r11);
            r11.setRetryPolicy(new DefaultRetryPolicy(60000, 1, 1.0f));
            return;
        }
        Log.d("WebRequest", "Something went wrong!");
    }

    public void PUT_METHOD(String str, JSONObject jSONObject, String str2, final Map<String, String> map, final WebResponseListener webResponseListener, final WebCallType webCallType, boolean z) {
        if (this.mContext != null) {
            if (z) {
                showProcess();
            }
            if (map != null) {
                StringRequest r9 = new StringRequest(2, str, new Response.Listener<String>() {

                    public void onResponse(String str) {
                        WebRequest.this.cancelProcess();
                        webResponseListener.onResponse(str, webCallType);
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        WebRequest.this.cancelProcess();
                        webResponseListener.onError(volleyError.toString());
                    }
                }) {

                    @Override
                    public Map<String, String> getParams() throws AuthFailureError {
                        return map;
                    }
                };
                r9.setTag(this.mContext);
                MySingleton.getInstance(this.mContext).addToRequestQueue(r9);
                return;
            }
            JsonObjectRequest r10 = new JsonObjectRequest(2, str, jSONObject, new Response.Listener<JSONObject>() {

                public void onResponse(JSONObject jSONObject) {
                    WebRequest.this.cancelProcess();
                    webResponseListener.onResponse(jSONObject, webCallType);
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    WebRequest.this.cancelProcess();
                    webResponseListener.onError(volleyError.toString());
                }
            }) {

                @Override
                public Map<String, String> getHeaders() throws AuthFailureError {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Content-Type", "application/json");
                    hashMap.put("Authorization", "Bearer ");
                    return hashMap;
                }
            };
            r10.setTag(this.mContext);
            MySingleton.getInstance(this.mContext).addToRequestQueue(r10);
            r10.setRetryPolicy(new DefaultRetryPolicy(60000, 1, 1.0f));
            return;
        }
        Log.d("WebRequest", "Something went wrong!");
    }
}
