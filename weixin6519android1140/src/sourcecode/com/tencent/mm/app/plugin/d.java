package com.tencent.mm.app.plugin;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.applet.k;
import com.tencent.mm.pluginsdk.ui.d.b;
import com.tencent.mm.pluginsdk.ui.d.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

public final class d
  implements b
{
  private static d eui;
  URISpanHandlerSet euj;
  ArrayList<URISpanHandlerSet.BaseUriSpanHandler> euk;
  ArrayList<URISpanHandlerSet.BaseUriSpanHandler> eul;
  ArrayList<URISpanHandlerSet.BaseUriSpanHandler> eum;
  Context mContext;
  
  static
  {
    GMTrace.i(13011603423232L, 96944);
    eui = null;
    GMTrace.o(13011603423232L, 96944);
  }
  
  private d()
  {
    GMTrace.i(13011066552320L, 96940);
    this.mContext = null;
    this.euk = new ArrayList();
    this.eul = new ArrayList();
    this.eum = new ArrayList();
    long l = bg.Pv();
    w.d("MicroMsg.URISpanHandler", "init URISpanHandler");
    this.mContext = ab.getContext();
    this.euj = new URISpanHandlerSet(this.mContext);
    Class[] arrayOfClass = URISpanHandlerSet.class.getDeclaredClasses();
    int j = arrayOfClass.length;
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        Class localClass = arrayOfClass[i];
        if ((localClass != null) && (localClass.getSuperclass() != null) && (localClass.isAnnotationPresent(URISpanHandlerSet.a.class)) && (localClass.getSuperclass().getName().equals(URISpanHandlerSet.BaseUriSpanHandler.class.getName())))
        {
          for (;;)
          {
            Object localObject2;
            try
            {
              Object localObject1 = (URISpanHandlerSet.a)localClass.getAnnotation(URISpanHandlerSet.a.class);
              localObject2 = localClass.getDeclaredConstructor(new Class[] { URISpanHandlerSet.class });
              if (localObject2 == null) {
                break;
              }
              localObject2 = (URISpanHandlerSet.BaseUriSpanHandler)URISpanHandlerSet.BaseUriSpanHandler.class.cast(((Constructor)localObject2).newInstance(new Object[] { this.euj }));
              localObject1 = ((URISpanHandlerSet.a)localObject1).pK();
              if (localObject1 == URISpanHandlerSet.PRIORITY.LOW)
              {
                this.eum.add(localObject2);
                w.d("MicroMsg.URISpanHandler", "successfully add: %s", new Object[] { localClass.getName() });
                break label408;
              }
              if (localObject1 == URISpanHandlerSet.PRIORITY.NORMAL)
              {
                this.eul.add(localObject2);
                continue;
              }
              if (localException != URISpanHandlerSet.PRIORITY.HIGH) {
                continue;
              }
            }
            catch (Exception localException)
            {
              w.printErrStackTrace("MicroMsg.URISpanHandler", localException, "", new Object[0]);
              w.d("MicroMsg.URISpanHandler", "add %s error: %s, errorType:%s", new Object[] { localClass.getName(), localException.getMessage(), localException.getClass().getName() });
            }
            this.euk.add(localObject2);
          }
          w.d("MicroMsg.URISpanHandler", "failed to add %s, constructor is null!!", new Object[] { localClass.getName() });
        }
      }
      else
      {
        w.d("MicroMsg.URISpanHandler", "init URISpanHandler used :%d ms", new Object[] { Long.valueOf(bg.Pv() - l) });
        GMTrace.o(13011066552320L, 96940);
        return;
      }
      label408:
      i += 1;
    }
  }
  
  private static boolean b(int[] paramArrayOfInt, int paramInt)
  {
    GMTrace.i(13011469205504L, 96943);
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (paramArrayOfInt[i] == paramInt)
      {
        GMTrace.o(13011469205504L, 96943);
        return true;
      }
      i += 1;
    }
    GMTrace.o(13011469205504L, 96943);
    return false;
  }
  
  public static d pI()
  {
    GMTrace.i(13010932334592L, 96939);
    if (eui == null) {
      eui = new d();
    }
    d locald = eui;
    GMTrace.o(13010932334592L, 96939);
    return locald;
  }
  
  public final boolean a(Context paramContext, k paramk, e parame)
  {
    GMTrace.i(13011334987776L, 96942);
    if (paramk == null)
    {
      w.d("MicroMsg.URISpanHandler", "handleSpanClick, hrefInfo is null");
      GMTrace.o(13011334987776L, 96942);
      return false;
    }
    int i = paramk.type;
    if (parame == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.URISpanHandler", "handleSpanClick, hrefInfo.getType:%d, callback==null:%b, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size:%d, mLowPriorityHandlerList.size:%d", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool), Integer.valueOf(this.euk.size()), Integer.valueOf(this.eul.size()), Integer.valueOf(this.eum.size()) });
      if (paramContext != null) {
        break;
      }
      w.e("MicroMsg.URISpanHandler", "handleSpanClick, context is null!");
      this.euj.mContext = null;
      GMTrace.o(13011334987776L, 96942);
      return false;
    }
    this.mContext = paramContext;
    this.euj.mContext = this.mContext;
    paramContext = this.euk.iterator();
    URISpanHandlerSet.BaseUriSpanHandler localBaseUriSpanHandler;
    while (paramContext.hasNext())
    {
      localBaseUriSpanHandler = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
      if ((b(localBaseUriSpanHandler.pJ(), paramk.type)) && (localBaseUriSpanHandler.a(paramk, parame)))
      {
        w.d("MicroMsg.URISpanHandler", "handleSpanClick, %s handle", new Object[] { localBaseUriSpanHandler.getClass().getName() });
        this.mContext = null;
        this.euj.mContext = null;
        GMTrace.o(13011334987776L, 96942);
        return true;
      }
    }
    paramContext = this.eul.iterator();
    while (paramContext.hasNext())
    {
      localBaseUriSpanHandler = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
      if ((b(localBaseUriSpanHandler.pJ(), paramk.type)) && (localBaseUriSpanHandler.a(paramk, parame)))
      {
        w.d("MicroMsg.URISpanHandler", "handleSpanClick, %s handle", new Object[] { localBaseUriSpanHandler.getClass().getName() });
        this.mContext = null;
        this.euj.mContext = null;
        GMTrace.o(13011334987776L, 96942);
        return true;
      }
    }
    paramContext = this.eum.iterator();
    while (paramContext.hasNext())
    {
      localBaseUriSpanHandler = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
      if ((b(localBaseUriSpanHandler.pJ(), paramk.type)) && (localBaseUriSpanHandler.a(paramk, parame)))
      {
        w.d("MicroMsg.URISpanHandler", "handleSpanClick, %s handle", new Object[] { localBaseUriSpanHandler.getClass().getName() });
        this.mContext = null;
        this.euj.mContext = null;
        GMTrace.o(13011334987776L, 96942);
        return true;
      }
    }
    this.mContext = null;
    this.euj.mContext = null;
    w.d("MicroMsg.URISpanHandler", "handleSpanClick, nothing handle");
    GMTrace.o(13011334987776L, 96942);
    return false;
  }
  
  public final k q(Context paramContext, String paramString)
  {
    GMTrace.i(13011200770048L, 96941);
    w.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, url:%s, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size:%d, mLowPriorityHandlerList.size：%d", new Object[] { paramString, Integer.valueOf(this.euk.size()), Integer.valueOf(this.eul.size()), Integer.valueOf(this.eum.size()) });
    if (paramContext == null)
    {
      w.e("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl error, context is null!");
      this.euj.mContext = null;
      GMTrace.o(13011200770048L, 96941);
      return null;
    }
    this.mContext = paramContext;
    this.euj.mContext = this.mContext;
    if (bg.nm(paramString))
    {
      w.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, url is null");
      this.mContext = null;
      this.euj.mContext = null;
      GMTrace.o(13011200770048L, 96941);
      return null;
    }
    paramContext = this.euk.iterator();
    k localk;
    while (paramContext.hasNext())
    {
      localk = ((URISpanHandlerSet.BaseUriSpanHandler)paramContext.next()).bQ(paramString);
      if (localk != null)
      {
        w.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, result.type:%d", new Object[] { Integer.valueOf(localk.type) });
        this.mContext = null;
        this.euj.mContext = null;
        GMTrace.o(13011200770048L, 96941);
        return localk;
      }
    }
    paramContext = this.eul.iterator();
    while (paramContext.hasNext())
    {
      localk = ((URISpanHandlerSet.BaseUriSpanHandler)paramContext.next()).bQ(paramString);
      if (localk != null)
      {
        w.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, result.type:%d", new Object[] { Integer.valueOf(localk.type) });
        this.mContext = null;
        this.euj.mContext = null;
        GMTrace.o(13011200770048L, 96941);
        return localk;
      }
    }
    paramContext = this.eum.iterator();
    while (paramContext.hasNext())
    {
      localk = ((URISpanHandlerSet.BaseUriSpanHandler)paramContext.next()).bQ(paramString);
      if (localk != null)
      {
        w.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, result.type:%d", new Object[] { Integer.valueOf(localk.type) });
        this.mContext = null;
        this.euj.mContext = null;
        GMTrace.o(13011200770048L, 96941);
        return localk;
      }
    }
    this.mContext = null;
    this.euj.mContext = null;
    w.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, nothing match");
    GMTrace.o(13011200770048L, 96941);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\plugin\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */