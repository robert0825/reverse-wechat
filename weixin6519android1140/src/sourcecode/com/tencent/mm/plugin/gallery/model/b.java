package com.tencent.mm.plugin.gallery.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.a.f.a;
import com.tencent.mm.a.f.b;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.Vector;

public final class b
{
  k<b, String> gsv;
  public Vector<b> gsw;
  f<String, a> lAZ;
  d lBa;
  private final b lBb;
  
  public b()
  {
    GMTrace.i(11908065263616L, 88722);
    this.gsv = new k() {};
    this.gsw = new Vector();
    this.lBb = new b()
    {
      public final void zd(String paramAnonymousString)
      {
        GMTrace.i(11895314579456L, 88627);
        w.i("MicroMsg.GalleryCache", "now listener size : " + b.this.gsw.size());
        int i = b.this.gsw.size() - 1;
        for (;;)
        {
          if (i >= 0) {
            try
            {
              b.b localb = (b.b)b.this.gsw.get(i);
              if (localb == null)
              {
                w.d("MicroMsg.GalleryCache", "get listener is null");
                i -= 1;
              }
            }
            catch (Exception localException)
            {
              for (;;)
              {
                w.e("MicroMsg.GalleryCache", "get wathcer failed:[%s]", new Object[] { localException.toString() });
                Object localObject = null;
                continue;
                ((b.b)localObject).zd(paramAnonymousString);
              }
            }
          }
        }
        GMTrace.o(11895314579456L, 88627);
      }
    };
    this.lAZ = new f(100, new f.b() {});
    d locald = new d(new File(e.ghz + "/diskcache"));
    locald.lBt = ab.getContext().getSharedPreferences(ab.bPU(), 0).getInt("com.tencent.mm.gallery.cache.suffix", 0);
    locald.aCT();
    locald.of(-1);
    this.lBa = locald;
    this.gsv.a(this.lBb, null);
    GMTrace.o(11908065263616L, 88722);
  }
  
  public final Bitmap getBitmap(String paramString)
  {
    GMTrace.i(11908199481344L, 88723);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.GalleryCache", "null filepath");
      GMTrace.o(11908199481344L, 88723);
      return null;
    }
    if (this.lAZ == null)
    {
      w.w("MicroMsg.GalleryCache", "want to get bitmap, but gallery cache is null");
      GMTrace.o(11908199481344L, 88723);
      return null;
    }
    if (this.lAZ.ba(paramString))
    {
      Object localObject = (a)this.lAZ.get(paramString);
      if (localObject == null)
      {
        w.d("MicroMsg.GalleryCache", "weakreference is null");
        this.lAZ.remove(paramString);
        GMTrace.o(11908199481344L, 88723);
        return null;
      }
      localObject = ((a)localObject).bitmap;
      if (localObject != null)
      {
        if (((Bitmap)localObject).isRecycled())
        {
          w.i("MicroMsg.GalleryCache", "cahce bitmap has recycled");
          this.lAZ.remove(paramString);
          GMTrace.o(11908199481344L, 88723);
          return null;
        }
        w.i("MicroMsg.GalleryCache", "get cached bitmap:" + paramString);
        GMTrace.o(11908199481344L, 88723);
        return (Bitmap)localObject;
      }
      this.lAZ.remove(paramString);
      w.i("MicroMsg.GalleryCache", "get bitmap is null");
    }
    GMTrace.o(11908199481344L, 88723);
    return null;
  }
  
  private final class a
  {
    Bitmap bitmap;
    private int type;
    
    public a(Bitmap paramBitmap, int paramInt)
    {
      GMTrace.i(11916655198208L, 88786);
      this.bitmap = paramBitmap;
      this.type = paramInt;
      GMTrace.o(11916655198208L, 88786);
    }
  }
  
  public static abstract interface b
  {
    public abstract void zd(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */