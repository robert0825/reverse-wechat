package com.tencent.smtt.sdk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.View;
import android.webkit.WebChromeClient.FileChooserParams;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.utils.TbsLog;

public class WebChromeClient
{
  public Bitmap getDefaultVideoPoster()
  {
    return null;
  }
  
  public View getVideoLoadingProgressView()
  {
    return null;
  }
  
  public void getVisitedHistory(x<String[]> paramx) {}
  
  public void onCloseWindow(WebView paramWebView) {}
  
  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    return false;
  }
  
  public boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    return false;
  }
  
  public void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, z.a parama)
  {
    parama.updateQuota(paramLong2);
  }
  
  public void onGeolocationPermissionsHidePrompt() {}
  
  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissionsCallback paramGeolocationPermissionsCallback)
  {
    paramGeolocationPermissionsCallback.invoke(paramString, true, true);
  }
  
  public void onHideCustomView() {}
  
  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return false;
  }
  
  public boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return false;
  }
  
  public boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return false;
  }
  
  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return false;
  }
  
  public boolean onJsTimeout()
  {
    return true;
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt) {}
  
  public void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, z.a parama)
  {
    parama.updateQuota(paramLong2);
  }
  
  public void onReceivedIcon(WebView paramWebView, Bitmap paramBitmap) {}
  
  public void onReceivedTitle(WebView paramWebView, String paramString) {}
  
  public void onReceivedTouchIconUrl(WebView paramWebView, String paramString, boolean paramBoolean) {}
  
  public void onRequestFocus(WebView paramWebView) {}
  
  public void onShowCustomView(View paramView, int paramInt, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback) {}
  
  public void onShowCustomView(View paramView, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback) {}
  
  public boolean onShowFileChooser(WebView paramWebView, x<Uri[]> paramx, a parama)
  {
    return false;
  }
  
  public void openFileChooser(x<Uri> paramx, String paramString1, String paramString2)
  {
    paramx.onReceiveValue(null);
  }
  
  public static abstract class a
  {
    public static final int MODE_OPEN = 0;
    public static final int MODE_OPEN_FOLDER = 2;
    public static final int MODE_OPEN_MULTIPLE = 1;
    public static final int MODE_SAVE = 3;
    
    public static Uri[] parseResult(int paramInt, Intent paramIntent)
    {
      for (;;)
      {
        try
        {
          ab localab = ab.coW();
          if ((localab != null) && (localab.coX()))
          {
            paramIntent = localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "parseFileChooserResult", new Class[] { Integer.TYPE, Intent.class }, new Object[] { Integer.valueOf(paramInt), paramIntent });
            if (paramIntent == null) {
              return null;
            }
            return (Uri[])paramIntent;
          }
          if (Build.VERSION.SDK_INT >= 21)
          {
            paramIntent = WebChromeClient.FileChooserParams.parseResult(paramInt, paramIntent);
            return paramIntent;
          }
        }
        catch (Exception paramIntent)
        {
          TbsLog.i("WebChromeClient", "parseResult:" + paramIntent.toString());
          return null;
        }
        paramIntent = null;
      }
    }
    
    public abstract Intent createIntent();
    
    public abstract String[] getAcceptTypes();
    
    public abstract String getFilenameHint();
    
    public abstract int getMode();
    
    public abstract CharSequence getTitle();
    
    public abstract boolean isCaptureEnabled();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\WebChromeClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */