package com.tencent.xweb.x5.sdk;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.QbSdk.a;
import com.tencent.smtt.sdk.q;
import com.tencent.xweb.x5.a.d;
import java.util.HashMap;
import java.util.Map;

public final class e
  implements a
{
  public final void a(Context paramContext, d.a parama)
  {
    QbSdk.preInit(paramContext, new b(parama));
  }
  
  public final void a(Context paramContext, String paramString, ValueCallback<Boolean> paramValueCallback)
  {
    QbSdk.canOpenFile(paramContext, paramString, new a.d(paramValueCallback));
  }
  
  public final void a(h paramh)
  {
    QbSdk.setTbsListener(new a(paramh));
  }
  
  public final boolean a(Context paramContext, String paramString, HashMap<String, String> paramHashMap, ValueCallback<String> paramValueCallback)
  {
    return QbSdk.startQbOrMiniQBToLoadUrl(paramContext, paramString, paramHashMap, new a.d(paramValueCallback));
  }
  
  public final boolean canOpenWebPlus(Context paramContext)
  {
    return QbSdk.canOpenWebPlus(paramContext);
  }
  
  public final void clearAllWebViewCache(Context paramContext, boolean paramBoolean)
  {
    QbSdk.clearAllWebViewCache(paramContext, paramBoolean);
  }
  
  public final void closeFileReader(Context paramContext)
  {
    QbSdk.closeFileReader(paramContext);
  }
  
  public final void forceSysWebView() {}
  
  public final String getMiniQBVersion(Context paramContext)
  {
    return QbSdk.getMiniQBVersion(paramContext);
  }
  
  public final boolean getTBSInstalling()
  {
    return QbSdk.getTBSInstalling();
  }
  
  public final int getTbsVersion(Context paramContext)
  {
    return QbSdk.getTbsVersion(paramContext);
  }
  
  public final void initTbsSettings(Map<String, Object> paramMap)
  {
    QbSdk.initTbsSettings(paramMap);
  }
  
  public final boolean isTbsCoreInited()
  {
    return QbSdk.isTbsCoreInited();
  }
  
  public final void reset(Context paramContext)
  {
    QbSdk.reset(paramContext);
  }
  
  public final int startMiniQBToLoadUrl(Context paramContext, String paramString, HashMap<String, String> paramHashMap, ValueCallback<String> paramValueCallback)
  {
    return QbSdk.startMiniQBToLoadUrl(paramContext, paramString, paramHashMap, paramValueCallback);
  }
  
  private static final class a
    implements q
  {
    h yoU;
    
    public a(h paramh)
    {
      this.yoU = paramh;
    }
    
    public final void jA(int paramInt)
    {
      if (this.yoU != null) {
        this.yoU.jA(paramInt);
      }
    }
    
    public final void jB(int paramInt)
    {
      if (this.yoU != null) {
        this.yoU.jB(paramInt);
      }
    }
    
    public final void jC(int paramInt)
    {
      if (this.yoU != null) {
        this.yoU.jC(paramInt);
      }
    }
  }
  
  private static final class b
    implements QbSdk.a
  {
    d.a yoV;
    
    public b(d.a parama)
    {
      this.yoV = parama;
    }
    
    public final void jV(boolean paramBoolean)
    {
      if (this.yoV != null) {
        this.yoV.jV(paramBoolean);
      }
    }
    
    public final void oR() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\sdk\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */