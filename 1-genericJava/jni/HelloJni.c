#include<jni.h>
#include <stdio.h>
#include "com_example_HelloJni.h"

JNIEXPORT void JNICALL Java_com_example_HelloJni_sayHello(JNIEnv *env, jobject thisObj) {
   printf("Hello World!\n");
   return;
}
