package com.tencent.mm.view.d;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.c.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements m
{
  private com.tencent.mm.ao.a.d.a<String, Bitmap> gLg;
  
  public a()
  {
    GMTrace.i(20120579604480L, 149910);
    this.gLg = new com.tencent.mm.ao.a.d.a(150);
    GMTrace.o(20120579604480L, 149910);
  }
  
  public final void b(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(20120848039936L, 149912);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed. key is null.");
      GMTrace.o(20120848039936L, 149912);
      return;
    }
    if (paramBitmap == null)
    {
      w.w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed.value is null.");
      GMTrace.o(20120848039936L, 149912);
      return;
    }
    this.gLg.put(paramString, paramBitmap);
    GMTrace.o(20120848039936L, 149912);
  }
  
  public final void clear()
  {
    GMTrace.i(20120982257664L, 149913);
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
            Bitmap localBitmap = (Bitmap)((Map.Entry)((Iterator)localObject1).next()).getValue();
            if ((localBitmap != null) && (!localBitmap.isRecycled())) {
              w.i("MicroMsg.emoji.EmojiLoaderMemoryCache", "recycle bitmap:%s, not need", new Object[] { localBitmap.toString() });
            }
          }
        }
        this.gLg.clear();
      }
    }
    finally {}
    GMTrace.o(20120982257664L, 149913);
  }
  
  public final Bitmap hC(String paramString)
  {
    GMTrace.i(20120713822208L, 149911);
    if (!bg.nm(paramString))
    {
      paramString = (Bitmap)this.gLg.get(paramString);
      GMTrace.o(20120713822208L, 149911);
      return paramString;
    }
    GMTrace.o(20120713822208L, 149911);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */