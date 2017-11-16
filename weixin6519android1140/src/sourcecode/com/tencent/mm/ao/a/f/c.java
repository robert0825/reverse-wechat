package com.tencent.mm.ao.a.f;

import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class c
  implements Runnable
{
  private String amf;
  private Bitmap bitmap;
  private b gLj;
  private com.tencent.mm.ao.a.c gLl;
  private String url;
  
  public c(String paramString1, com.tencent.mm.ao.a.c paramc, Bitmap paramBitmap, b paramb, String paramString2)
  {
    GMTrace.i(13732352622592L, 102314);
    this.url = paramString1;
    this.gLl = paramc;
    this.bitmap = paramBitmap;
    this.gLj = paramb;
    this.amf = paramString2;
    GMTrace.o(13732352622592L, 102314);
  }
  
  public final void run()
  {
    GMTrace.i(13732486840320L, 102315);
    if ((!bg.nm(this.url)) && (this.gLl != null) && (this.bitmap != null) && (!this.bitmap.isRecycled()) && (this.gLj != null))
    {
      Object localObject1 = this.gLj;
      Object localObject2 = this.gLl;
      localObject1 = (String)((b)localObject1).gKa.get(Integer.valueOf(((com.tencent.mm.ao.a.c)localObject2).Jl()));
      if (this.url.equals(localObject1))
      {
        localObject2 = this.gLl;
        localObject1 = this.bitmap;
        if ((Looper.myLooper() == Looper.getMainLooper()) && (((com.tencent.mm.ao.a.c)localObject2).gKc != null))
        {
          localObject2 = (ImageView)((com.tencent.mm.ao.a.c)localObject2).gKc.get();
          if (localObject2 != null) {
            ((ImageView)localObject2).setImageBitmap((Bitmap)localObject1);
          }
        }
        this.gLj.a(this.gLl);
        GMTrace.o(13732486840320L, 102315);
        return;
      }
      w.w("MicroMsg.imageloader.ImageShowTask", "[cpan] url is not equals view url.");
      GMTrace.o(13732486840320L, 102315);
      return;
    }
    w.w("MicroMsg.imageloader.ImageShowTask", "[cpan] run something is null.");
    GMTrace.o(13732486840320L, 102315);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */