package com.gsbusiness.livecricketscoreprediction.webservice;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class VolleyMultipartRequest extends Request<NetworkResponse> {
    private final String boundary = ("apiclient-" + System.currentTimeMillis());
    private final String lineEnd = IOUtils.LINE_SEPARATOR_WINDOWS;
    private Response.ErrorListener mErrorListener;
    private Map<String, String> mHeaders;
    private Response.Listener<NetworkResponse> mListener;
    private final String twoHyphens = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;

    
    public Map<String, DataPart> getByteData() throws AuthFailureError {
        return null;
    }

    public VolleyMultipartRequest(int i, String str, Response.Listener<NetworkResponse> listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.mListener = listener;
        this.mErrorListener = errorListener;
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> map = this.mHeaders;
        return map != null ? map : super.getHeaders();
    }

    @Override
    public String getBodyContentType() {
        return "multipart/form-data;boundary=" + this.boundary;
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            Map<String, String> params = getParams();
            if (params != null && params.size() > 0) {
                textParse(dataOutputStream, params, getParamsEncoding());
            }
            Map<String, DataPart> byteData = getByteData();
            if (byteData != null && byteData.size() > 0) {
                dataParse(dataOutputStream, byteData);
            }
            dataOutputStream.writeBytes(HelpFormatter.DEFAULT_LONG_OPT_PREFIX + this.boundary + HelpFormatter.DEFAULT_LONG_OPT_PREFIX + IOUtils.LINE_SEPARATOR_WINDOWS);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    
    @Override
    public Response<NetworkResponse> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success(networkResponse, HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (Exception e) {
            return Response.error(new ParseError(e));
        }
    }

    
    public void deliverResponse(NetworkResponse networkResponse) {
        this.mListener.onResponse(networkResponse);
    }

    @Override
    public void deliverError(VolleyError volleyError) {
        Response.ErrorListener errorListener = this.mErrorListener;
        if (errorListener != null && volleyError != null) {
            errorListener.onErrorResponse(volleyError);
        }
    }

    private void textParse(DataOutputStream dataOutputStream, Map<String, String> map, String str) throws IOException {
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                buildTextPart(dataOutputStream, entry.getKey(), entry.getValue());
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    private void dataParse(DataOutputStream dataOutputStream, Map<String, DataPart> map) throws IOException {
        for (Map.Entry<String, DataPart> entry : map.entrySet()) {
            buildDataPart(dataOutputStream, entry.getValue(), entry.getKey());
        }
    }

    private void buildTextPart(DataOutputStream dataOutputStream, String str, String str2) throws IOException {
        dataOutputStream.writeBytes(HelpFormatter.DEFAULT_LONG_OPT_PREFIX + this.boundary + IOUtils.LINE_SEPARATOR_WINDOWS);
        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str + "\"" + IOUtils.LINE_SEPARATOR_WINDOWS);
        dataOutputStream.writeBytes(IOUtils.LINE_SEPARATOR_WINDOWS);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        dataOutputStream.writeBytes(sb.toString());
    }

    private void buildDataPart(DataOutputStream dataOutputStream, DataPart dataPart, String str) throws IOException {
        dataOutputStream.writeBytes(HelpFormatter.DEFAULT_LONG_OPT_PREFIX + this.boundary + IOUtils.LINE_SEPARATOR_WINDOWS);
        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + dataPart.getFileName() + "\"" + IOUtils.LINE_SEPARATOR_WINDOWS);
        if (dataPart.getType() != null && !dataPart.getType().trim().isEmpty()) {
            dataOutputStream.writeBytes("Content-Type: " + dataPart.getType() + IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        dataOutputStream.writeBytes(IOUtils.LINE_SEPARATOR_WINDOWS);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(dataPart.getContent());
        int min = Math.min(byteArrayInputStream.available(), 1048576);
        byte[] bArr = new byte[min];
        int read = byteArrayInputStream.read(bArr, 0, min);
        while (read > 0) {
            dataOutputStream.write(bArr, 0, min);
            min = Math.min(byteArrayInputStream.available(), 1048576);
            read = byteArrayInputStream.read(bArr, 0, min);
        }
        dataOutputStream.writeBytes(IOUtils.LINE_SEPARATOR_WINDOWS);
    }
}
