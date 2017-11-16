package com.tencent.mm.ao.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.c.e;
import com.tencent.mm.ao.a.c.h;
import com.tencent.mm.ao.a.c.i;
import com.tencent.mm.ao.a.c.j;
import com.tencent.mm.ao.a.c.l;
import com.tencent.mm.ao.a.c.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class a
{
  private static a gJW;
  public b gJT;
  private com.tencent.mm.ao.a.a.b gJU;
  private final i gJV;
  
  static
  {
    GMTrace.i(15695421112320L, 116940);
    gJW = null;
    GMTrace.o(15695421112320L, 116940);
  }
  
  public a(Context paramContext)
  {
    GMTrace.i(13723628470272L, 102249);
    this.gJV = new com.tencent.mm.ao.a.b.g();
    a(com.tencent.mm.ao.a.a.b.bf(paramContext));
    GMTrace.o(13723628470272L, 102249);
  }
  
  public a(com.tencent.mm.ao.a.a.b paramb)
  {
    GMTrace.i(13723762688000L, 102250);
    this.gJV = new com.tencent.mm.ao.a.b.g();
    a(paramb);
    GMTrace.o(13723762688000L, 102250);
  }
  
  public static a Jk()
  {
    try
    {
      GMTrace.i(15695286894592L, 116939);
      if (gJW == null) {
        gJW = new a(ab.getContext());
      }
      a locala = gJW;
      GMTrace.o(15695286894592L, 116939);
      return locala;
    }
    finally {}
  }
  
  private void a(ImageView paramImageView, com.tencent.mm.ao.a.a.c paramc)
  {
    GMTrace.i(13725641736192L, 102264);
    if ((paramImageView == null) || (paramc == null))
    {
      w.w("MicroMsg.imageloader.ImageLoader", "[cpan] should show default image view or options is null.");
      GMTrace.o(13725641736192L, 102264);
      return;
    }
    int i;
    Object localObject;
    if ((paramc.gKV > 0) || (paramc.gKW != null))
    {
      i = 1;
      if (i == 0) {
        break label184;
      }
      if (paramc.gKV != 0) {
        break label173;
      }
      localObject = this.gJU.gKm;
      if (paramc.gKV == 0) {
        break label164;
      }
      localObject = ((Resources)localObject).getDrawable(paramc.gKV);
      label86:
      paramImageView.setBackgroundDrawable((Drawable)localObject);
      label92:
      if ((paramc.gKR <= 0) && (paramc.gKS == null)) {
        break label192;
      }
      i = 1;
      label108:
      if (i == 0) {
        break label222;
      }
      if (paramc.gKR != 0) {
        break label205;
      }
      localObject = this.gJU.gKm;
      if (paramc.gKR == 0) {
        break label197;
      }
    }
    label164:
    label173:
    label184:
    label192:
    label197:
    for (paramc = ((Resources)localObject).getDrawable(paramc.gKR);; paramc = paramc.gKS)
    {
      paramImageView.setImageDrawable(paramc);
      GMTrace.o(13725641736192L, 102264);
      return;
      i = 0;
      break;
      localObject = paramc.gKW;
      break label86;
      paramImageView.setBackgroundResource(paramc.gKV);
      break label92;
      paramImageView.setBackgroundDrawable(null);
      break label92;
      i = 0;
      break label108;
    }
    label205:
    paramImageView.setImageResource(paramc.gKR);
    GMTrace.o(13725641736192L, 102264);
    return;
    label222:
    if (paramc.gKY) {
      paramImageView.setImageDrawable(null);
    }
    GMTrace.o(13725641736192L, 102264);
  }
  
  private void a(com.tencent.mm.ao.a.a.b paramb)
  {
    try
    {
      GMTrace.i(13723896905728L, 102251);
      if (paramb == null) {
        throw new IllegalArgumentException("[cpan] image loader configuration is null.");
      }
    }
    finally {}
    if (this.gJU == null)
    {
      this.gJT = new b(paramb);
      this.gJU = paramb;
      GMTrace.o(13723896905728L, 102251);
    }
    for (;;)
    {
      return;
      w.w("MicroMsg.imageloader.ImageLoader", "[cpan] image loader had init.");
      GMTrace.o(13723896905728L, 102251);
    }
  }
  
  public final void a(String paramString, ImageView paramImageView)
  {
    GMTrace.i(13724031123456L, 102252);
    a(paramString, paramImageView, null, null, null, null, null, null, null);
    GMTrace.o(13724031123456L, 102252);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ao.a.a.c paramc)
  {
    GMTrace.i(13724567994368L, 102256);
    a(paramString, paramImageView, paramc, null, null, null, null, null, null);
    GMTrace.o(13724567994368L, 102256);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ao.a.a.c paramc, e parame, com.tencent.mm.ao.a.c.d paramd, l paraml)
  {
    GMTrace.i(20313853132800L, 151350);
    a(paramString, paramImageView, paramc, null, null, null, parame, paramd, paraml);
    GMTrace.o(20313853132800L, 151350);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ao.a.a.c paramc, com.tencent.mm.ao.a.c.g paramg)
  {
    GMTrace.i(13724299558912L, 102254);
    a(paramString, paramImageView, paramc, null, null, paramg, null, null, null);
    GMTrace.o(13724299558912L, 102254);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ao.a.a.c paramc, i parami)
  {
    GMTrace.i(13724836429824L, 102258);
    a(paramString, paramImageView, paramc, parami, null, null, null, null, null);
    GMTrace.o(13724836429824L, 102258);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ao.a.a.c paramc, i parami, j paramj, com.tencent.mm.ao.a.c.g paramg, e parame, com.tencent.mm.ao.a.c.d paramd, l paraml)
  {
    GMTrace.i(20313987350528L, 151351);
    if (paramc == null) {
      paramc = this.gJU.gKp;
    }
    for (;;)
    {
      if (parami == null) {
        parami = this.gJV;
      }
      for (;;)
      {
        c localc = new c(paramImageView, paramString);
        if (bg.nm(paramString))
        {
          w.w("MicroMsg.imageloader.ImageLoader", "[cpan load image url is null.]");
          a(paramImageView, paramc);
          this.gJT.a(localc);
          parami.a(paramString, null, paramc.gLe);
          GMTrace.o(20313987350528L, 151351);
          return;
        }
        ae localae = paramc.handler;
        if ((localae == null) || (Looper.myLooper() == Looper.getMainLooper())) {
          localae = new ae();
        }
        parame = new com.tencent.mm.ao.a.f.b(paramString, localc, localae, paramc, parami, paramj, this.gJT, paramg, parame, paramd, paraml);
        parami = parame.kw(paramString);
        paramj = this.gJT.kr(parami);
        if ((paramImageView != null) && (paramj != null) && (!paramj.isRecycled()))
        {
          w.d("MicroMsg.imageloader.ImageLoader", "[cpan] load from cache. not need to load:%s", new Object[] { parami });
          parami = paramj;
          if (paramc.gKM) {
            parami = com.tencent.mm.sdk.platformtools.d.c(paramj, paramc.gKN);
          }
          paramImageView.setImageBitmap(parami);
          parame.av(0L);
          if (paramg != null) {
            paramg.a(paramString, paramImageView, new com.tencent.mm.ao.a.d.b(parami));
          }
          this.gJT.a(localc);
          GMTrace.o(20313987350528L, 151351);
          return;
        }
        if (paramImageView != null) {
          a(paramImageView, paramc);
        }
        if ((parame.gKp.gKD) || (!this.gJT.gJY.isPause()))
        {
          paramImageView = this.gJT;
          if (bg.nm(paramString)) {
            break label613;
          }
          parami = (String)paramImageView.gKa.get(Integer.valueOf(localc.Jl()));
          if ((!bg.nm(parami)) && (paramString.equals(parami))) {
            break label613;
          }
          paramImageView.gKa.put(Integer.valueOf(localc.Jl()), paramString);
        }
        label613:
        for (int i = 1;; i = 0)
        {
          if (i != 0)
          {
            paramString = this.gJT;
            if ((paramString.gKb != null) && (parame.gLl != null))
            {
              paramImageView = (com.tencent.mm.ao.a.f.b)paramString.gKb.get(Integer.valueOf(parame.gLl.Jl()));
              if ((paramImageView != null) && (paramImageView.gLl != null) && (parame.gLl.Jl() == paramImageView.gLl.Jl()))
              {
                paramString.gJY.remove(paramImageView);
                w.d("MicroMsg.imageloader.ImageLoaderManager", "remove taks url:%s", new Object[] { paramImageView.url });
              }
              paramString.gKb.put(Integer.valueOf(parame.gLl.Jl()), parame);
            }
            paramString = this.gJT;
            boolean bool = paramc.gKB;
            if (((ExecutorService)paramString.gJX.gKx).isShutdown()) {
              paramString.gJY = com.tencent.mm.ao.a.a.a.aO(paramString.gJX.gKn, paramString.gJX.gKo);
            }
            paramString.gJY.execute(parame);
            if ((bool) && (com.tencent.mm.ao.a.g.b.Jq())) {
              paramString.gJZ.execute(new com.tencent.mm.ao.a.f.d());
            }
          }
          GMTrace.o(20313987350528L, 151351);
          return;
        }
      }
    }
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ao.a.c.g paramg)
  {
    GMTrace.i(13724165341184L, 102253);
    a(paramString, paramImageView, null, null, null, paramg, null, null, null);
    GMTrace.o(13724165341184L, 102253);
  }
  
  public final void a(String paramString, com.tencent.mm.ao.a.a.c paramc, com.tencent.mm.ao.a.c.c paramc1)
  {
    GMTrace.i(13725775953920L, 102265);
    paramString = new com.tencent.mm.ao.a.f.a(paramString, paramc, this.gJT, paramc1);
    this.gJT.gJY.execute(paramString);
    GMTrace.o(13725775953920L, 102265);
  }
  
  public final void b(String paramString, ImageView paramImageView, com.tencent.mm.ao.a.a.c paramc, com.tencent.mm.ao.a.c.g paramg)
  {
    GMTrace.i(13724433776640L, 102255);
    a(paramString, paramImageView, paramc, null, null, paramg, null, null, null);
    GMTrace.o(13724433776640L, 102255);
  }
  
  public final void bi(int paramInt)
  {
    GMTrace.i(13725104865280L, 102260);
    w.d("MicroMsg.imageloader.ImageLoader", "[cpan] on scroll state changed :%d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == 0) || (paramInt == 1))
    {
      w.d("MicroMsg.imageloader.ImageLoader", "[cpan] resume");
      this.gJT.gJY.resume();
      GMTrace.o(13725104865280L, 102260);
      return;
    }
    w.d("MicroMsg.imageloader.ImageLoader", "[cpan] pause");
    this.gJT.gJY.pause();
    GMTrace.o(13725104865280L, 102260);
  }
  
  public final void detach()
  {
    GMTrace.i(13725239083008L, 102261);
    if (this.gJT != null)
    {
      b localb = this.gJT;
      if (localb.gJX != null)
      {
        localb.gJX.gKq.clear();
        localb.gJX.gKr.Jo();
      }
    }
    GMTrace.o(13725239083008L, 102261);
  }
  
  public final void h(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(13725507518464L, 102263);
    if (this.gJT != null)
    {
      b localb = this.gJT;
      if (localb.gJX != null) {
        localb.gJX.gKq.b(paramString, paramBitmap);
      }
    }
    GMTrace.o(13725507518464L, 102263);
  }
  
  public final Bitmap kr(String paramString)
  {
    GMTrace.i(13725373300736L, 102262);
    if (this.gJT != null)
    {
      paramString = this.gJT.kr(paramString);
      GMTrace.o(13725373300736L, 102262);
      return paramString;
    }
    GMTrace.o(13725373300736L, 102262);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */