package com.cricketlivescore.predictiontips.Ads;

import android.util.Base64;
import android.util.Log;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.codec.digest.MessageDigestAlgorithms;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESUtils {
    private static final String ENCRYPTION_IV = "5183666c72eec9e4";
    private static final String ENCRYPTION_KEY = "RwcmlVpg";

    public static String encrypt(String str) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, makeKey(), makeIv());
            return new String(Base64.encode(instance.doFinal(str.getBytes()), 0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String decrypt(String str) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, makeKey(), makeIv());
            return new String(instance.doFinal(Base64.decode(str, 2)), StandardCharsets.UTF_8);
        } catch (Exception e) {
            Log.v("AES Exception", String.valueOf(e));
            throw new RuntimeException(e);
        }
    }

    static AlgorithmParameterSpec makeIv() {
        try {
            return new IvParameterSpec(ENCRYPTION_IV.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    static Key makeKey() {
        try {
            return new SecretKeySpec(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(ENCRYPTION_KEY.getBytes(StandardCharsets.UTF_8)), "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
