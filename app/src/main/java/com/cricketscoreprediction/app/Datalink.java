package com.cricketscoreprediction.app;

public class Datalink {
    static {
        System.loadLibrary("hello-jni");
    }

    public static native String BaseURl();
    public static final String BaseURl = BaseURl();

    public static native String EndpointURL();
    public static final String EndpointURL = EndpointURL();

    public static native String flagemptyURL();
    public static final String flagemptyURL = flagemptyURL();

    public static native String FlagStartURL();
    public static final String FlagStartURL = FlagStartURL();

    public static native String stadiumstartURL();
    public static final String stadiumstartURL = stadiumstartURL();

    public static native String teamsstartURL();
    public static final String teamsstartURL = teamsstartURL();

    public static native String PlayerstartURL();
    public static final String PlayerstartURL = PlayerstartURL();





}

