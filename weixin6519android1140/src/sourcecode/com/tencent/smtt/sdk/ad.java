package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.DexLoader;
import java.nio.ByteBuffer;

public final class ad
{
  public static boolean xXG = false;
  public static boolean xXH = false;
  private static boolean xXI = false;
  private static boolean xXJ = false;
  public WebView xTx = null;
  public Object xXK = null;
  
  public ad(Context paramContext)
  {
    boolean bool = hi(paramContext);
    xXG = bool;
    if (bool)
    {
      this.xXK = hj(paramContext);
      if (this.xXK == null) {
        xXG = false;
      }
    }
    if (!xXG)
    {
      this.xTx = new WebView(paramContext);
      this.xTx.getSettings().setJavaScriptEnabled(true);
    }
  }
  
  public static boolean hi(Context paramContext)
  {
    if (xXI) {
      return xXG;
    }
    xXI = true;
    try
    {
      ab localab = ab.coW();
      if ((localab != null) && (localab.coX()))
      {
        paramContext = localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "canUseX5JsCore", new Class[] { Context.class }, new Object[] { paramContext });
        if ((paramContext != null) && ((paramContext instanceof Boolean))) {
          xXG = ((Boolean)paramContext).booleanValue();
        }
      }
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return xXG;
  }
  
  private static Object hj(Context paramContext)
  {
    try
    {
      ab localab = ab.coW();
      if ((localab != null) && (localab.coX()))
      {
        paramContext = localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createX5JavaBridge", new Class[] { Context.class }, new Object[] { paramContext });
        return paramContext;
      }
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public final int Yg()
  {
    int j = -1;
    int i = j;
    if (xXG)
    {
      i = j;
      if (!xXH) {}
    }
    try
    {
      Object localObject1 = ab.coW();
      i = j;
      if (localObject1 != null)
      {
        i = j;
        if (((ab)localObject1).coX())
        {
          localObject1 = ((ab)localObject1).coY().xWV;
          Object localObject2 = this.xXK;
          localObject1 = ((DexLoader)localObject1).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getNativeBufferId", new Class[] { Object.class }, new Object[] { localObject2 });
          i = j;
          if (localObject1 == null) {}
        }
      }
      return -1;
    }
    catch (Exception localException)
    {
      try
      {
        i = Integer.parseInt(localObject1.toString());
        return i;
      }
      catch (NumberFormatException localNumberFormatException) {}
      localException = localException;
      return -1;
    }
  }
  
  public final ByteBuffer iT(int paramInt)
  {
    if ((xXG) && (xXH)) {
      try
      {
        Object localObject1 = ab.coW();
        if ((localObject1 != null) && (((ab)localObject1).coX()))
        {
          localObject1 = ((ab)localObject1).coY().xWV;
          Class localClass = Integer.TYPE;
          Object localObject2 = this.xXK;
          localObject1 = ((DexLoader)localObject1).invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getNativeBuffer", new Class[] { Object.class, localClass }, new Object[] { localObject2, Integer.valueOf(paramInt) });
          if (localObject1 != null)
          {
            localObject1 = (ByteBuffer)localObject1;
            return (ByteBuffer)localObject1;
          }
        }
      }
      catch (Exception localException) {}
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\smtt\sdk\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */