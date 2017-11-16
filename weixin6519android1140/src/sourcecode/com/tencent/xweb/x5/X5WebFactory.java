package com.tencent.xweb.x5;

import android.content.Context;
import android.widget.TextView;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.QbSdk.a;
import com.tencent.smtt.sdk.ad;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.t;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.a.a.a;
import com.tencent.xweb.a.a.b;
import com.tencent.xweb.a.g.a;
import com.tencent.xweb.f.a;
import com.tencent.xweb.x5.sdk.g;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtensionListener;

public class X5WebFactory
  implements g.a
{
  static X5WebFactory sInstance;
  
  public static X5WebFactory getInstance()
  {
    if (sInstance == null) {
      sInstance = new X5WebFactory();
    }
    return sInstance;
  }
  
  public com.tencent.xweb.a.e createWebView(WebView paramWebView)
  {
    return new i(paramWebView);
  }
  
  public Object excute(String paramString, Object[] paramArrayOfObject)
  {
    if ((paramString == null) || (paramString.isEmpty())) {}
    do
    {
      return null;
      if (paramString.equals("STR_CMD_GET_TBS_QBSDK_IMP")) {
        return new com.tencent.xweb.x5.sdk.e();
      }
    } while (!paramString.equals("STR_CMD_GET_TBS_DOWNLOADER_IMP"));
    return new g();
  }
  
  public a.a getCookieManager()
  {
    return new d();
  }
  
  public a.b getCookieSyncManager()
  {
    return new e();
  }
  
  public com.tencent.xweb.a.d getJsCore(f.a parama, Context paramContext)
  {
    switch (1.ynb[parama.ordinal()])
    {
    }
    do
    {
      return null;
    } while (!ad.hi(paramContext));
    parama = new f(paramContext);
    parama.init(0);
    return parama;
  }
  
  public boolean hasInited()
  {
    return b.hasInited();
  }
  
  public boolean hasInitedCallback()
  {
    return true;
  }
  
  public void initCallback(WebViewExtensionListener paramWebViewExtensionListener) {}
  
  public void initEnviroment(Context paramContext)
  {
    TbsLog.setTbsLogClient(new a(paramContext));
  }
  
  public void initInterface()
  {
    com.tencent.xweb.x5.sdk.d.a(new com.tencent.xweb.x5.sdk.e());
    com.tencent.xweb.x5.sdk.f.a(new g());
    WebView.setX5Interface(new com.tencent.xweb.x5.sdk.i());
  }
  
  public boolean initWebviewCore(Context paramContext, WebView.b paramb)
  {
    b.a(paramContext, paramb);
    return true;
  }
  
  public boolean isCoreReady()
  {
    return b.isCoreReady();
  }
  
  final class a
    extends t
  {
    public a(Context paramContext)
    {
      super();
    }
    
    public final void Yq(String paramString)
    {
      super.Yq(paramString);
    }
    
    public final void aN(String paramString)
    {
      super.aN(paramString);
    }
    
    public final void setLogView(TextView paramTextView)
    {
      super.setLogView(paramTextView);
    }
    
    public final void writeLogToDisk()
    {
      super.writeLogToDisk();
    }
  }
  
  static final class b
  {
    private static boolean kIx = false;
    public static boolean yoI = false;
    
    public static void a(Context paramContext, WebView.b paramb)
    {
      if (kIx) {
        return;
      }
      Log.i("X5WebFactory.preIniter", "preInit");
      kIx = true;
      QbSdk.preInit(paramContext, new QbSdk.a()
      {
        private boolean yoJ = false;
        private boolean yoK = false;
        
        public final void jV(boolean paramAnonymousBoolean)
        {
          this.yoK = true;
          if ((this.yoJ) && (this.yoK) && (this.yoL != null))
          {
            this.yoL.oR();
            X5WebFactory.b.yoI = true;
          }
        }
        
        public final void oR()
        {
          this.yoJ = true;
          if ((this.yoJ) && (this.yoK) && (this.yoL != null))
          {
            this.yoL.oR();
            X5WebFactory.b.yoI = true;
          }
        }
      });
    }
    
    public static boolean hasInited()
    {
      return kIx;
    }
    
    public static boolean isCoreReady()
    {
      return yoI;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\X5WebFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */