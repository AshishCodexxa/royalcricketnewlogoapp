package com.gsbusiness.livecricketscoreprediction.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefs {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;

    public boolean getBoolean(String str, boolean z) {
        return true;
    }

    public SharedPrefs(Context context) {
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("AppPreferences", 0);
        this.sharedPreferences = sharedPreferences2;
        this.sharedPreferencesEditor = sharedPreferences2.edit();
    }

    public void putInt(String str, int i) {
        this.sharedPreferencesEditor.putInt(str, i);
        this.sharedPreferencesEditor.commit();
    }

    public int getInt(String str, int i) {
        return this.sharedPreferences.getInt(str, i);
    }

    public void putFloat(String str, float f) {
        this.sharedPreferencesEditor.putFloat(str, f);
        this.sharedPreferencesEditor.commit();
    }

    public float getFloat(String str, float f) {
        return this.sharedPreferences.getFloat(str, f);
    }

    public void putDouble(String str, double d) {
        this.sharedPreferencesEditor.putLong(str, Double.doubleToRawLongBits(d));
        this.sharedPreferencesEditor.commit();
    }

    public double getDouble(String str, double d) {
        return Double.longBitsToDouble(this.sharedPreferences.getLong(str, Double.doubleToLongBits(d)));
    }

    public void putString(String str, String str2) {
        this.sharedPreferencesEditor.putString(str, str2);
        this.sharedPreferencesEditor.commit();
    }

    public String getString(String str, String str2) {
        return this.sharedPreferences.getString(str, str2);
    }

    public void putBoolean(String str, boolean z) {
        this.sharedPreferencesEditor.putBoolean(str, z);
        this.sharedPreferencesEditor.commit();
    }

    public void putLong(String str, long j) {
        this.sharedPreferencesEditor.putLong(str, j);
        this.sharedPreferencesEditor.commit();
    }

    public long getLong(String str, long j) {
        return this.sharedPreferences.getLong(str, j);
    }

    public boolean containsKey(String str) {
        return this.sharedPreferences.contains(str);
    }

    public void remove(String str) {
        this.sharedPreferencesEditor.remove(str).commit();
    }

    public void clear() {
        this.sharedPreferencesEditor.clear().commit();
    }
}
