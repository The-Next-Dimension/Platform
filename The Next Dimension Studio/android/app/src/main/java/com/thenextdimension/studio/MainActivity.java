package com.thenextdimension.studio;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;

public class MainActivity extends Activity {
  private WebView webView;
  @Override public void onCreate(Bundle state) { super.onCreate(state); webView = new WebView(this); setContentView(webView); WebSettings settings=webView.getSettings(); settings.setJavaScriptEnabled(true); settings.setDomStorageEnabled(true); settings.setAllowFileAccess(true); settings.setAllowContentAccess(true); settings.setMediaPlaybackRequiresUserGesture(true); webView.setWebViewClient(new WebViewClient()); webView.setWebChromeClient(new WebChromeClient()); webView.loadUrl("file:///android_asset/www/index.html"); }
  @Override public void onBackPressed() { if(webView!=null && webView.canGoBack()) webView.goBack(); else super.onBackPressed(); }
}
