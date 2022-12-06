#include <string.h>
#include <jni.h>



JNIEXPORT jstring JNICALL
Java_com_cricketscoreprediction_app_Datalink_BaseURl(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "https://apiv2.cricket.com/cricket");
}
JNIEXPORT jstring JNICALL
Java_com_cricketscoreprediction_app_Datalink_EndpointURL(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "http://188.166.157.163:3000");
}
JNIEXPORT jstring JNICALL
Java_com_cricketscoreprediction_app_Datalink_flagemptyURL(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "https://www.cricket.com/svgs/images/flag_empty.png");
}
JNIEXPORT jstring JNICALL
Java_com_cricketscoreprediction_app_Datalink_FlagStartURL(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "https://images.cricket.com/teams/");
}
JNIEXPORT jstring JNICALL
Java_com_cricketscoreprediction_app_Datalink_stadiumstartURL(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "https://images.cricket.com/stadiums/");
}
JNIEXPORT jstring JNICALL
Java_com_cricketscoreprediction_app_Datalink_teamsstartURL(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "https://images.cricket.com/teams/");
}
JNIEXPORT jstring JNICALL
Java_com_cricketscoreprediction_app_Datalink_PlayerstartURL(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "https://images.cricket.com/players/");
}

