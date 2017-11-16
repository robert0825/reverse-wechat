package com.tencent.mm.ao.a;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.c.a;
import com.tencent.mm.ao.a.c.h;
import com.tencent.mm.ao.a.c.m;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class b
{
  public com.tencent.mm.ao.a.a.b gJX;
  h gJY;
  Executor gJZ;
  public final Map<Integer, String> gKa;
  public HashMap<Integer, com.tencent.mm.ao.a.f.b> gKb;
  
  public b(com.tencent.mm.ao.a.a.b paramb)
  {
    GMTrace.i(13733829017600L, 102325);
    this.gKa = Collections.synchronizedMap(new HashMap());
    this.gKb = new HashMap();
    this.gJX = paramb;
    this.gJY = paramb.gKx;
    this.gJZ = paramb.gKy;
    this.gJX.gKr.a(this.gJX.gKt);
    GMTrace.o(13733829017600L, 102325);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(13734097453056L, 102327);
    this.gKa.remove(Integer.valueOf(paramc.Jl()));
    w.d("MicroMsg.imageloader.ImageLoaderManager", "[cpan] remove image weak holder size:%d viewcode:%s", new Object[] { Integer.valueOf(this.gKa.size()), Integer.valueOf(paramc.Jl()) });
    GMTrace.o(13734097453056L, 102327);
  }
  
  public final Bitmap kr(String paramString)
  {
    GMTrace.i(13733963235328L, 102326);
    if (this.gJX != null)
    {
      paramString = this.gJX.gKq.hC(paramString);
      GMTrace.o(13733963235328L, 102326);
      return paramString;
    }
    GMTrace.o(13733963235328L, 102326);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */