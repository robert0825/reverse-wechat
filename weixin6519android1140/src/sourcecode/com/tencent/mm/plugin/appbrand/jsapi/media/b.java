package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.w;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 120;
  private static final String NAME = "getImageInfo";
  public static final Collection<b> ihU;
  
  static
  {
    GMTrace.i(19788256509952L, 147434);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(new a());
    localLinkedList.add(new d());
    ihU = Collections.unmodifiableCollection(localLinkedList);
    GMTrace.o(19788256509952L, 147434);
  }
  
  public b()
  {
    GMTrace.i(19787988074496L, 147432);
    GMTrace.o(19787988074496L, 147432);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19788122292224L, 147433);
    paramJSONObject = paramJSONObject.optString("src");
    if (bg.nm(paramJSONObject))
    {
      paramj.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(19788122292224L, 147433);
      return;
    }
    com.tencent.mm.sdk.f.e.b(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19777116438528L, 147351);
        Iterator localIterator = b.ihU.iterator();
        Object localObject1 = null;
        Object localObject2;
        while (localIterator.hasNext())
        {
          localObject2 = ((b.b)localIterator.next()).f(paramj.hzM, paramJSONObject);
          localObject1 = localObject2;
          if (localObject2 != null) {
            localObject1 = localObject2;
          }
        }
        if ((this.ihV.get() != null) && (((j)this.ihV.get()).mRunning))
        {
          if (localObject1 != null)
          {
            switch (b.2.ihX[((b.e)localObject1.get(0)).ordinal()])
            {
            default: 
              localObject1 = b.this.d("fail", null);
            }
            for (;;)
            {
              ((j)this.ihV.get()).v(paramInt, (String)localObject1);
              GMTrace.o(19777116438528L, 147351);
              return;
              localObject1 = b.this.d("fail:file not found", null);
              continue;
              localObject2 = new HashMap(2);
              ((Map)localObject2).put("width", Integer.valueOf(((b.c)((com.tencent.mm.vending.j.a)localObject1).get(1)).width));
              ((Map)localObject2).put("height", Integer.valueOf(((b.c)((com.tencent.mm.vending.j.a)localObject1).get(1)).height));
              localObject1 = b.this.d("ok", (Map)localObject2);
            }
          }
          ((j)this.ihV.get()).v(paramInt, b.this.d("fail:src not support", null));
        }
        GMTrace.o(19777116438528L, 147351);
      }
    }, String.format(Locale.US, "AppBrandJsApiGetImageInfo[%s]", new Object[] { paramJSONObject }), 10);
    GMTrace.o(19788122292224L, 147433);
  }
  
  private static final class a
    implements b.b
  {
    public a()
    {
      GMTrace.i(19793491001344L, 147473);
      GMTrace.o(19793491001344L, 147473);
    }
    
    public final com.tencent.mm.vending.j.a f(com.tencent.mm.plugin.appbrand.e parame, String paramString)
    {
      GMTrace.i(19793625219072L, 147474);
      if (paramString.startsWith("wxfile://"))
      {
        paramString = c.aJ(parame.hyD, paramString);
        if ((paramString == null) || (bg.nm(paramString.gpy)) || (!com.tencent.mm.a.e.aZ(paramString.gpy)))
        {
          parame = com.tencent.mm.vending.j.a.ca(b.e.ihY);
          GMTrace.o(19793625219072L, 147474);
          return parame;
        }
        parame = new BitmapFactory.Options();
        parame.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(paramString.gpy, parame);
        paramString = new b.c();
        paramString.width = parame.outWidth;
        paramString.height = parame.outHeight;
        parame = com.tencent.mm.vending.j.a.w(b.e.iia, paramString);
        GMTrace.o(19793625219072L, 147474);
        return parame;
      }
      GMTrace.o(19793625219072L, 147474);
      return null;
    }
  }
  
  private static abstract interface b
  {
    public abstract com.tencent.mm.vending.j.a f(com.tencent.mm.plugin.appbrand.e parame, String paramString);
  }
  
  private static final class c
  {
    public int height;
    public int width;
    
    public c()
    {
      GMTrace.i(19794162089984L, 147478);
      GMTrace.o(19794162089984L, 147478);
    }
  }
  
  private static final class d
    implements b.b
  {
    public d()
    {
      GMTrace.i(19778861268992L, 147364);
      GMTrace.o(19778861268992L, 147364);
    }
    
    public final com.tencent.mm.vending.j.a f(com.tencent.mm.plugin.appbrand.e parame, String paramString)
    {
      GMTrace.i(19778995486720L, 147365);
      paramString = w.d(parame, paramString);
      if (paramString != null)
      {
        parame = new BitmapFactory.Options();
        parame.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(paramString, new Rect(), parame);
        bg.g(paramString);
        paramString = new b.c();
        paramString.width = parame.outWidth;
        paramString.height = parame.outHeight;
        parame = com.tencent.mm.vending.j.a.w(b.e.iia, paramString);
        GMTrace.o(19778995486720L, 147365);
        return parame;
      }
      parame = com.tencent.mm.vending.j.a.ca(b.e.ihY);
      GMTrace.o(19778995486720L, 147365);
      return parame;
    }
  }
  
  private static enum e
  {
    static
    {
      GMTrace.i(19776848003072L, 147349);
      ihY = new e("FILE_NOT_FOUND", 0);
      ihZ = new e("UNKNOWN_FAIL", 1);
      iia = new e("RESOLVED", 2);
      iib = new e[] { ihY, ihZ, iia };
      GMTrace.o(19776848003072L, 147349);
    }
    
    private e()
    {
      GMTrace.i(19776713785344L, 147348);
      GMTrace.o(19776713785344L, 147348);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\media\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */