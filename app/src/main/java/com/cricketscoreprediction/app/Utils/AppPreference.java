package com.cricketscoreprediction.app.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;

public class AppPreference {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;

    public void clear() {
        this.sharedPreferencesEditor.clear();
        this.sharedPreferencesEditor.commit();
    }

    public AppPreference(Context context) {
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("AppPreferences", 0);
        this.sharedPreferences = sharedPreferences2;
        this.sharedPreferencesEditor = sharedPreferences2.edit();
    }

    public void setString(String str, String str2) {
        this.sharedPreferencesEditor.putString(str, str2);
        this.sharedPreferencesEditor.commit();
    }

    public String getString(String str) {
        return this.sharedPreferences.getString(str, "");
    }

    public void setJsonArray(String str, JSONArray jSONArray) {
        this.sharedPreferencesEditor.putString(str, jSONArray.toString());
        this.sharedPreferencesEditor.commit();
    }

    public JSONArray getJsonArray(String str) {
        this.sharedPreferences.getString(str, "");
        try {
            return new JSONArray(this.sharedPreferences.getString(str, ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setInt(String str, int i) {
        this.sharedPreferencesEditor.putInt(str, i);
        this.sharedPreferencesEditor.commit();
    }

    public Integer getInt(String str) {
        return Integer.valueOf(this.sharedPreferences.getInt(str, 0));
    }

    public void setBoolean(String str, Boolean bool) {
        this.sharedPreferencesEditor.putBoolean(str, bool.booleanValue());
        this.sharedPreferencesEditor.commit();
    }

    public Boolean getBoolean(String str) {
        return Boolean.valueOf(this.sharedPreferences.getBoolean(str, false));
    }
}
