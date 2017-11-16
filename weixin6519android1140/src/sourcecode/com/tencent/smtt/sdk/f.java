package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceError;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.export.external.proxy.X5ProxyWebViewClient;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.m;

final class f
  extends X5ProxyWebViewClient
{
  private static String xUw = null;
  public WebView xTx;
  private WebViewClient xUv;
  
  public f(IX5WebViewClient paramIX5WebViewClient, WebView paramWebView, WebViewClient paramWebViewClient)
  {
    super(paramIX5WebViewClient);
    this.xTx = paramWebView;
    this.xUv = paramWebViewClient;
    this.xUv.xXB = this;
  }
  
  public final void countPVContentCacheCallBack(String paramString)
  {
    paramString = this.xTx;
    paramString.xXi += 1;
  }
  
  public final void doUpdateVisitedHistory(IX5WebViewBase paramIX5WebViewBase, String paramString, boolean paramBoolean)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.doUpdateVisitedHistory(this.xTx, paramString, paramBoolean);
  }
  
  public final void onDetectedBlankScreen(IX5WebViewBase paramIX5WebViewBase, String paramString, int paramInt)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onDetectedBlankScreen(paramString, paramInt);
  }
  
  public final void onFormResubmission(IX5WebViewBase paramIX5WebViewBase, Message paramMessage1, Message paramMessage2)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onFormResubmission(this.xTx, paramMessage1, paramMessage2);
  }
  
  public final void onLoadResource(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onLoadResource(this.xTx, paramString);
  }
  
  public final void onPageFinished(IX5WebViewBase paramIX5WebViewBase, int paramInt1, int paramInt2, String paramString)
  {
    if (xUw == null)
    {
      localObject = com.tencent.smtt.utils.r.cpu();
      if (localObject != null)
      {
        ((com.tencent.smtt.utils.r)localObject).na(false);
        xUw = Boolean.toString(false);
      }
    }
    this.xTx.xXf = paramIX5WebViewBase;
    Object localObject = this.xTx;
    ((WebView)localObject).xXi += 1;
    this.xUv.onPageFinished(this.xTx, paramString);
    if ("com.qzone".equals(paramIX5WebViewBase.getView().getContext().getApplicationInfo().packageName)) {
      WebView.he(paramIX5WebViewBase.getView().getContext());
    }
    TbsLog.app_extra("SmttWebViewClient", paramIX5WebViewBase.getView().getContext());
    try
    {
      super.onPageFinished(paramIX5WebViewBase, paramInt1, paramInt2, paramString);
      WebView.coR();
      if ((!t.xWE) && (this.xTx.getContext() != null) && (t.gU(this.xTx.getContext())))
      {
        t.xWE = true;
        new Thread(new Runnable()
        {
          public final void run()
          {
            f.this.xTx.getContext();
            if (l.gm(f.this.xTx.getContext())) {
              l.gn(f.this.xTx.getContext());
            }
          }
        }).start();
      }
      if ((this.xTx.getContext() != null) && (!r.gR(this.xTx.getContext()).xVY))
      {
        r.gR(this.xTx.getContext()).xVY = true;
        r.gR(this.xTx.getContext()).coz();
      }
      return;
    }
    catch (Exception paramIX5WebViewBase)
    {
      for (;;) {}
    }
  }
  
  public final void onPageFinished(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    onPageFinished(paramIX5WebViewBase, 0, 0, paramString);
  }
  
  public final void onPageStarted(IX5WebViewBase paramIX5WebViewBase, int paramInt1, int paramInt2, String paramString, Bitmap paramBitmap)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onPageStarted(this.xTx, paramString, paramBitmap);
  }
  
  public final void onPageStarted(IX5WebViewBase paramIX5WebViewBase, String paramString, Bitmap paramBitmap)
  {
    onPageStarted(paramIX5WebViewBase, 0, 0, paramString, paramBitmap);
  }
  
  public final void onReceivedClientCertRequest(IX5WebViewBase paramIX5WebViewBase, ClientCertRequest paramClientCertRequest)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onReceivedClientCertRequest(this.xTx, paramClientCertRequest);
  }
  
  public final void onReceivedError(IX5WebViewBase paramIX5WebViewBase, int paramInt, String paramString1, String paramString2)
  {
    int i = paramInt;
    if (paramInt < -15)
    {
      if (paramInt == -17) {
        i = -1;
      }
    }
    else
    {
      this.xTx.xXf = paramIX5WebViewBase;
      this.xUv.onReceivedError(this.xTx, i, paramString1, paramString2);
    }
  }
  
  public final void onReceivedError(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onReceivedError(this.xTx, paramWebResourceRequest, paramWebResourceError);
  }
  
  public final void onReceivedHttpAuthRequest(IX5WebViewBase paramIX5WebViewBase, HttpAuthHandler paramHttpAuthHandler, String paramString1, String paramString2)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onReceivedHttpAuthRequest(this.xTx, paramHttpAuthHandler, paramString1, paramString2);
  }
  
  public final void onReceivedHttpError(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest, WebResourceResponse paramWebResourceResponse)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onReceivedHttpError(this.xTx, paramWebResourceRequest, paramWebResourceResponse);
  }
  
  public final void onReceivedLoginRequest(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, String paramString3)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onReceivedLoginRequest(this.xTx, paramString1, paramString2, paramString3);
  }
  
  public final void onReceivedSslError(IX5WebViewBase paramIX5WebViewBase, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onReceivedSslError(this.xTx, paramSslErrorHandler, paramSslError);
  }
  
  public final void onScaleChanged(IX5WebViewBase paramIX5WebViewBase, float paramFloat1, float paramFloat2)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onScaleChanged(this.xTx, paramFloat1, paramFloat2);
  }
  
  public final void onTooManyRedirects(IX5WebViewBase paramIX5WebViewBase, Message paramMessage1, Message paramMessage2)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onTooManyRedirects(this.xTx, paramMessage1, paramMessage2);
  }
  
  public final void onUnhandledKeyEvent(IX5WebViewBase paramIX5WebViewBase, KeyEvent paramKeyEvent)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    this.xUv.onUnhandledKeyEvent(this.xTx, paramKeyEvent);
  }
  
  public final WebResourceResponse shouldInterceptRequest(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    return this.xUv.shouldInterceptRequest(this.xTx, paramWebResourceRequest);
  }
  
  public final WebResourceResponse shouldInterceptRequest(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest, Bundle paramBundle)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    return this.xUv.shouldInterceptRequest(this.xTx, paramWebResourceRequest, paramBundle);
  }
  
  public final WebResourceResponse shouldInterceptRequest(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    return this.xUv.shouldInterceptRequest(this.xTx, paramString);
  }
  
  public final boolean shouldOverrideKeyEvent(IX5WebViewBase paramIX5WebViewBase, KeyEvent paramKeyEvent)
  {
    this.xTx.xXf = paramIX5WebViewBase;
    return this.xUv.shouldOverrideKeyEvent(this.xTx, paramKeyEvent);
  }
  
  public final boolean shouldOverrideUrlLoading(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    if ((paramString == null) || (this.xTx.showDebugView(paramString))) {}
    boolean bool;
    for (;;)
    {
      return true;
      this.xTx.xXf = paramIX5WebViewBase;
      if (!m.cpo().bI(this.xTx.getContext().getApplicationContext(), paramString))
      {
        bool = this.xUv.shouldOverrideUrlLoading(this.xTx, paramString);
        if (!bool)
        {
          if (paramString.startsWith("wtai://wp/mc;"))
          {
            paramIX5WebViewBase = new Intent("android.intent.action.VIEW", Uri.parse("tel:" + paramString.substring(13)));
            this.xTx.getContext().startActivity(paramIX5WebViewBase);
            return true;
          }
          if (paramString.startsWith("tel:"))
          {
            paramIX5WebViewBase = new Intent("android.intent.action.DIAL", Uri.parse(paramString));
            paramIX5WebViewBase.addFlags(268435456);
            try
            {
              if (this.xTx.getContext() != null)
              {
                this.xTx.getContext().startActivity(paramIX5WebViewBase);
                return true;
              }
            }
            catch (Exception paramIX5WebViewBase)
            {
              return true;
            }
          }
        }
      }
    }
    return bool;
  }
  
  public final void v(String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(this.xTx.xXf, 0, 0, paramString, paramBitmap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */