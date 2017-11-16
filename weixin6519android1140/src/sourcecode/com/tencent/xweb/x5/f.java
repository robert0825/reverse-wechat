package com.tencent.xweb.x5;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.ab;
import com.tencent.smtt.sdk.ac;
import com.tencent.smtt.sdk.ad;
import com.tencent.xweb.a.d;
import java.nio.ByteBuffer;

public final class f
  implements d
{
  private Context mContext;
  private ad yox;
  
  public f(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public final int Yg()
  {
    return this.yox.Yg();
  }
  
  public final void a(int paramInt, ByteBuffer paramByteBuffer)
  {
    Object localObject1 = this.yox;
    if ((ad.xXG) && (ad.xXH)) {}
    try
    {
      Object localObject2 = ab.coW();
      if ((localObject2 != null) && (((ab)localObject2).coX()))
      {
        localObject2 = ((ab)localObject2).coY().xWV;
        Class localClass = Integer.TYPE;
        localObject1 = ((ad)localObject1).xXK;
        ((DexLoader)localObject2).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "setNativeBuffer", new Class[] { Object.class, localClass, ByteBuffer.class }, new Object[] { localObject1, Integer.valueOf(paramInt), paramByteBuffer });
      }
      return;
    }
    catch (Exception paramByteBuffer) {}
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    Object localObject1 = this.yox;
    if ((paramObject == null) || (ad.xXG)) {}
    do
    {
      try
      {
        Object localObject2 = ab.coW();
        if ((localObject2 != null) && (((ab)localObject2).coX()))
        {
          localObject2 = ((ab)localObject2).coY().xWV;
          localObject1 = ((ad)localObject1).xXK;
          ((DexLoader)localObject2).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "addJavascriptInterface", new Class[] { Object.class, String.class, Object.class }, new Object[] { paramObject, paramString, localObject1 });
        }
        return;
      }
      catch (Exception paramObject) {}
    } while (((ad)localObject1).xTx == null);
    ((ad)localObject1).xTx.addJavascriptInterface(paramObject, paramString);
    ((ad)localObject1).xTx.loadUrl("about:blank");
    return;
  }
  
  public final void cleanup()
  {
    Object localObject1 = this.yox;
    if (ad.xXG) {}
    do
    {
      try
      {
        Object localObject2 = ab.coW();
        if ((localObject2 != null) && (((ab)localObject2).coX()))
        {
          localObject2 = ((ab)localObject2).coY().xWV;
          localObject1 = ((ad)localObject1).xXK;
          ((DexLoader)localObject2).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "destroyX5JsCore", new Class[] { Object.class }, new Object[] { localObject1 });
        }
        return;
      }
      catch (Exception localException) {}
    } while (((ad)localObject1).xTx == null);
    ((ad)localObject1).xTx.clearHistory();
    ((ad)localObject1).xTx.clearCache(true);
    ((ad)localObject1).xTx.loadUrl("about:blank");
    ((ad)localObject1).xTx.freeMemory();
    ((ad)localObject1).xTx.pauseTimers();
    ((ad)localObject1).xTx.destroy();
    ((ad)localObject1).xTx = null;
    return;
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    Object localObject1 = this.yox;
    paramValueCallback = new a.d(paramValueCallback);
    if (ad.xXG) {}
    do
    {
      try
      {
        Object localObject2 = ab.coW();
        if ((localObject2 != null) && (((ab)localObject2).coX()))
        {
          localObject2 = ((ab)localObject2).coY().xWV;
          localObject1 = ((ad)localObject1).xXK;
          ((DexLoader)localObject2).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "evaluateJavascript", new Class[] { String.class, ValueCallback.class, Object.class }, new Object[] { paramString, paramValueCallback, localObject1 });
        }
        return;
      }
      catch (Exception paramString) {}
    } while (((ad)localObject1).xTx == null);
    ((ad)localObject1).xTx.evaluateJavascript(paramString, paramValueCallback);
    return;
  }
  
  public final ByteBuffer iT(int paramInt)
  {
    return this.yox.iT(paramInt);
  }
  
  public final void init(int paramInt)
  {
    this.yox = new ad(this.mContext);
  }
  
  public final void pause()
  {
    Object localObject1 = this.yox;
    if (ad.xXG) {}
    try
    {
      Object localObject2 = ab.coW();
      if ((localObject2 != null) && (((ab)localObject2).coX()))
      {
        localObject2 = ((ab)localObject2).coY().xWV;
        localObject1 = ((ad)localObject1).xXK;
        ((DexLoader)localObject2).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "pause", new Class[] { Object.class }, new Object[] { localObject1 });
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void resume()
  {
    Object localObject1 = this.yox;
    if (ad.xXG) {}
    try
    {
      Object localObject2 = ab.coW();
      if ((localObject2 != null) && (((ab)localObject2).coX()))
      {
        localObject2 = ((ab)localObject2).coY().xWV;
        localObject1 = ((ad)localObject1).xXK;
        ((DexLoader)localObject2).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "resume", new Class[] { Object.class }, new Object[] { localObject1 });
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public final boolean wp()
  {
    return (ad.hi(this.mContext)) && (QbSdk.getTbsVersion(this.mContext) >= 43600);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */