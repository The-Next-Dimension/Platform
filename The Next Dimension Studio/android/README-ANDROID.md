# Android app project — The Next Dimension 2.0

This is a native Android Studio wrapper around the bundled web studio. The bundled app works offline in demo mode and stores drafts on-device using WebView local storage.

## Build an APK
1. Install Android Studio (current stable) and Android SDK Platform 35.
2. Open this `android` folder in Android Studio.
3. Allow Gradle sync and install any prompted SDK components.
4. Select **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
5. Android Studio places the debug APK under `app/build/outputs/apk/debug/app-debug.apk`.

The project includes Android source, not a precompiled APK. An APK must be built with Android SDK/Gradle on a configured machine.

## AI connection
The native app starts in offline demo mode. To use AI generation, deploy the FastAPI backend over HTTPS, open Studio Guide > Optional AI server, and enter the server base URL. Keep the provider API key on the server.
