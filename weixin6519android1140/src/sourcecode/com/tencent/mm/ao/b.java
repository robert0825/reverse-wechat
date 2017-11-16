package com.tencent.mm.ao;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.cache.e.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class b
{
  private HashMap<String, c> gGC;
  
  public b()
  {
    GMTrace.i(3539321487360L, 26370);
    this.gGC = new HashMap();
    GMTrace.o(3539321487360L, 26370);
  }
  
  public static void f(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(3539589922816L, 26372);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.CdnImageService", "push fail, key is null");
      GMTrace.o(3539589922816L, 26372);
      return;
    }
    e.a.a("local_cdn_img_cache", paramString, paramBitmap);
    GMTrace.o(3539589922816L, 26372);
  }
  
  public static Bitmap hC(String paramString)
  {
    GMTrace.i(3539724140544L, 26373);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.CdnImageService", "get fail, key is null");
      GMTrace.o(3539724140544L, 26373);
      return null;
    }
    paramString = (Bitmap)e.a.x("local_cdn_img_cache", paramString);
    GMTrace.o(3539724140544L, 26373);
    return paramString;
  }
  
  public final void a(String paramString, c paramc)
  {
    GMTrace.i(3539992576000L, 26375);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.CdnImageService", "do load fail, url is empty");
      GMTrace.o(3539992576000L, 26375);
      return;
    }
    Bitmap localBitmap = hC(paramString);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      w.i("MicroMsg.CdnImageService", "do load ok, url[%s], bitmap exists", new Object[] { paramString });
      if (paramc != null) {
        paramc.n(localBitmap);
      }
      GMTrace.o(3539992576000L, 26375);
      return;
    }
    if (localBitmap == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.w("MicroMsg.CdnImageService", "try to download: url[%s], src bitmap is null[%B]", new Object[] { paramString, Boolean.valueOf(bool) });
      if (!this.gGC.containsKey(paramString)) {
        break;
      }
      w.w("MicroMsg.CdnImageService", "contains url[%s]", new Object[] { paramString });
      GMTrace.o(3539992576000L, 26375);
      return;
    }
    this.gGC.put(paramString, paramc);
    e.post(new b(paramString, this.gGC), "CdnImageService_download");
    GMTrace.o(3539992576000L, 26375);
  }
  
  protected final void finalize()
  {
    GMTrace.i(3539455705088L, 26371);
    super.finalize();
    GMTrace.o(3539455705088L, 26371);
  }
  
  public final void jX(String paramString)
  {
    GMTrace.i(3539858358272L, 26374);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.CdnImageService", "stop load fail, url is empty");
      GMTrace.o(3539858358272L, 26374);
      return;
    }
    this.gGC.remove(paramString);
    GMTrace.o(3539858358272L, 26374);
  }
  
  static final class a
    implements Runnable
  {
    private HashMap<String, b.c> gGC;
    private Bitmap gGD;
    private String url;
    
    public a(String paramString, Bitmap paramBitmap, HashMap<String, b.c> paramHashMap)
    {
      GMTrace.i(3504559095808L, 26111);
      this.url = paramString;
      this.gGD = paramBitmap;
      this.gGC = paramHashMap;
      GMTrace.o(3504559095808L, 26111);
    }
    
    public final void run()
    {
      GMTrace.i(3504693313536L, 26112);
      n.IY();
      b.f(this.url, this.gGD);
      if (this.gGC != null)
      {
        localObject = (b.c)this.gGC.remove(this.url);
        if (localObject != null) {
          ((b.c)localObject).n(this.gGD);
        }
      }
      if (this.url == null) {}
      for (Object localObject = "null";; localObject = this.url)
      {
        w.i("MicroMsg.CdnImageService", "finish download post job, url[%s]", new Object[] { localObject });
        GMTrace.o(3504693313536L, 26112);
        return;
      }
    }
  }
  
  static final class b
    implements Runnable
  {
    private HashMap<String, b.c> gGC;
    private String url;
    
    b(String paramString, HashMap<String, b.c> paramHashMap)
    {
      GMTrace.i(3542274277376L, 26392);
      this.url = paramString;
      this.gGC = paramHashMap;
      GMTrace.o(3542274277376L, 26392);
    }
    
    public final void run()
    {
      GMTrace.i(3542408495104L, 26393);
      Object localObject1 = bg.SC(this.url);
      if (localObject1 == null)
      {
        w.w("MicroMsg.CdnImageService", "download fail: url[%s] data is null", new Object[] { this.url });
        GMTrace.o(3542408495104L, 26393);
        return;
      }
      try
      {
        localObject1 = d.bg((byte[])localObject1);
        w.i("MicroMsg.CdnImageService", "download finish, url[%s], do post job", new Object[] { this.url });
        af.t(new b.a(this.url, (Bitmap)localObject1, this.gGC));
        GMTrace.o(3542408495104L, 26393);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.w("MicroMsg.CdnImageService", "download fail: url[%s] decode bitmap error[%s]", new Object[] { this.url, localException.getLocalizedMessage() });
          Object localObject2 = null;
        }
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract void n(Bitmap paramBitmap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */