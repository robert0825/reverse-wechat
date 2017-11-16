package com.tencent.mm.ao.a.b;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.c.m;
import com.tencent.mm.ao.a.d.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class f
  implements m
{
  private a<String, Bitmap> gLg;
  private a<String, Bitmap> gLh;
  
  public f()
  {
    GMTrace.i(13718662414336L, 102212);
    this.gLg = new a(50);
    this.gLh = new a(10);
    GMTrace.o(13718662414336L, 102212);
  }
  
  public final void b(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(13718930849792L, 102214);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed. key is null.");
      GMTrace.o(13718930849792L, 102214);
      return;
    }
    if (paramBitmap == null)
    {
      w.w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed.value is null.");
      GMTrace.o(13718930849792L, 102214);
      return;
    }
    Bitmap localBitmap;
    long l;
    if ((paramBitmap != null) && ((paramBitmap instanceof Bitmap)))
    {
      localBitmap = (Bitmap)paramBitmap;
      if (Build.VERSION.SDK_INT >= 12) {
        l = localBitmap.getByteCount();
      }
    }
    for (;;)
    {
      w.d("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put key:%s,bitmap size:%d B newsize:%s", new Object[] { paramString, Long.valueOf(l), bg.aF(l) });
      if (l <= 524288L) {
        break;
      }
      this.gLh.put(paramString, paramBitmap);
      GMTrace.o(13718930849792L, 102214);
      return;
      int i = localBitmap.getRowBytes();
      l = localBitmap.getHeight() * i;
      continue;
      l = 0L;
    }
    this.gLg.put(paramString, paramBitmap);
    GMTrace.o(13718930849792L, 102214);
  }
  
  public final void clear()
  {
    GMTrace.i(13719065067520L, 102215);
    Bitmap localBitmap;
    try
    {
      if (this.gLg != null)
      {
        Object localObject1 = this.gLg.snapshot();
        if ((!((Map)localObject1).isEmpty()) && (((Map)localObject1).size() > 0))
        {
          localObject1 = ((Map)localObject1).entrySet().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localBitmap = (Bitmap)((Map.Entry)((Iterator)localObject1).next()).getValue();
            if ((localBitmap != null) && (!localBitmap.isRecycled())) {
              w.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s, not need", new Object[] { localBitmap.toString() });
            }
          }
        }
        this.gLg.clear();
      }
    }
    finally {}
    if (this.gLh != null)
    {
      Object localObject3 = this.gLh.snapshot();
      if ((!((Map)localObject3).isEmpty()) && (((Map)localObject3).size() > 0))
      {
        localObject3 = ((Map)localObject3).entrySet().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localBitmap = (Bitmap)((Map.Entry)((Iterator)localObject3).next()).getValue();
          if ((localBitmap != null) && (!localBitmap.isRecycled())) {
            w.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s. not need", new Object[] { localBitmap.toString() });
          }
        }
      }
      this.gLh.clear();
    }
    GMTrace.o(13719065067520L, 102215);
  }
  
  public final Bitmap hC(String paramString)
  {
    GMTrace.i(13718796632064L, 102213);
    if (!bg.nm(paramString))
    {
      if (this.gLg.get(paramString) == null)
      {
        paramString = (Bitmap)this.gLh.get(paramString);
        GMTrace.o(13718796632064L, 102213);
        return paramString;
      }
      paramString = (Bitmap)this.gLg.get(paramString);
      GMTrace.o(13718796632064L, 102213);
      return paramString;
    }
    GMTrace.o(13718796632064L, 102213);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */