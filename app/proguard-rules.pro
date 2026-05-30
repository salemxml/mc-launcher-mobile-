-keep class com.salemxml.** { *; }
-keep interface com.salemxml.** { *; }
-keep enum com.salemxml.** { *; }
-dontwarn com.salemxml.**

-keep class com.google.gson.** { *; }
-keepclassmembers class ** {
    @com.google.gson.annotations.SerializedName <fields>;
}

-dontwarn retrofit2.**
-keep class retrofit2.** { *; }
-keepclasseswithmembers class * {
    @retrofit2.http.* <methods>;
}

-keep class okhttp3.** { *; }
-dontwarn okhttp3.**
