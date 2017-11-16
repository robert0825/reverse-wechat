package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.plugin.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.f;

public final class s
  implements i
{
  private boolean eIf;
  private long haS;
  private long haT;
  private String nVI;
  private boolean tnp;
  private int type;
  private String url;
  
  public s(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(754974720000L, 5625);
    this.haS = 0L;
    this.haT = 0L;
    this.url = paramString1;
    this.type = paramInt;
    this.nVI = paramString2;
    this.eIf = paramBoolean;
    GMTrace.o(754974720000L, 5625);
  }
  
  public static String s(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(755108937728L, 5626);
    if (h.xw().wL())
    {
      paramString1 = String.format("%s/ReaderApp_%d%s_%s", new Object[] { b.yU(), Integer.valueOf(paramInt), paramString2, com.tencent.mm.a.g.n(paramString1.getBytes()) });
      GMTrace.o(755108937728L, 5626);
      return paramString1;
    }
    GMTrace.o(755108937728L, 5626);
    return "";
  }
  
  public final void I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(756316897280L, 5635);
    this.haT = bg.Pv();
    int j = 0;
    int i = j;
    if (p.Jh())
    {
      i = j;
      if (!bg.nm(paramString))
      {
        i = j;
        if (p.kp(Pn()))
        {
          i = j;
          if (paramString.equals("image/webp")) {
            i = 1;
          }
        }
      }
    }
    if (this.tnp) {
      if (!paramBoolean)
      {
        w.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz image failed");
        com.tencent.mm.plugin.report.service.g.ork.a(86L, 2L, 1L, false);
        if (i != 0)
        {
          w.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz webp image failed");
          com.tencent.mm.plugin.report.service.g.ork.a(86L, 15L, 1L, false);
          GMTrace.o(756316897280L, 5635);
        }
      }
      else
      {
        long l = this.haT - this.haS;
        w.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz image success, used %d", new Object[] { Long.valueOf(l) });
        com.tencent.mm.plugin.report.service.g.ork.a(86L, 4L, l, false);
        if (i != 0)
        {
          w.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz webp image success");
          com.tencent.mm.plugin.report.service.g.ork.a(86L, 17L, l, false);
          com.tencent.mm.plugin.report.service.g.ork.a(86L, 13L, 1L, false);
        }
      }
    }
    GMTrace.o(756316897280L, 5635);
  }
  
  public final i.b Pl()
  {
    GMTrace.i(756719550464L, 5638);
    GMTrace.o(756719550464L, 5638);
    return null;
  }
  
  public final String Pm()
  {
    GMTrace.i(755243155456L, 5627);
    String str = s(this.url, this.type, this.nVI);
    GMTrace.o(755243155456L, 5627);
    return str;
  }
  
  public final String Pn()
  {
    GMTrace.i(755377373184L, 5628);
    if (p.Jh()) {}
    for (String str = p.ko(this.url);; str = this.url)
    {
      GMTrace.o(755377373184L, 5628);
      return str;
    }
  }
  
  public final String Po()
  {
    GMTrace.i(755511590912L, 5629);
    String str = this.url;
    GMTrace.o(755511590912L, 5629);
    return str;
  }
  
  public final String Pp()
  {
    GMTrace.i(755645808640L, 5630);
    String str = this.url + this.nVI;
    GMTrace.o(755645808640L, 5630);
    return str;
  }
  
  public final boolean Pq()
  {
    GMTrace.i(755780026368L, 5631);
    GMTrace.o(755780026368L, 5631);
    return false;
  }
  
  public final boolean Pr()
  {
    GMTrace.i(755914244096L, 5632);
    boolean bool = this.eIf;
    GMTrace.o(755914244096L, 5632);
    return bool;
  }
  
  public final Bitmap Ps()
  {
    GMTrace.i(756585332736L, 5637);
    Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), a.f.aYv);
    GMTrace.o(756585332736L, 5637);
    return localBitmap;
  }
  
  public final void Pt()
  {
    GMTrace.i(756182679552L, 5634);
    this.haS = bg.Pv();
    if (this.tnp)
    {
      w.d("MicroMsg.ReaaderAppGetPicStrategy", "beforeGetPicFromNet, from biz msg");
      com.tencent.mm.plugin.report.service.g.ork.a(86L, 0L, 1L, false);
    }
    GMTrace.o(756182679552L, 5634);
  }
  
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    int i = 100;
    GMTrace.i(756048461824L, 5633);
    a locala;
    if (i.a.hiU == parama)
    {
      paramString = this.nVI;
      locala = new a();
      parama = ab.getContext();
      if (parama == null) {
        break label276;
      }
      parama = parama.getResources();
      if (parama == null) {
        break label276;
      }
    }
    label276:
    for (parama = parama.getDisplayMetrics();; parama = null)
    {
      int j;
      if (parama != null) {
        if ("@T".equals(paramString))
        {
          j = (int)(parama.widthPixels - 60.0F * parama.density);
          i = (int)(167.0F * parama.density);
        }
      }
      for (;;)
      {
        locala.w = j;
        locala.h = i;
        w.d("MicroMsg.ReaaderAppGetPicStrategy", locala.toString());
        paramBitmap = d.a(paramBitmap, locala.w, locala.h, true);
        try
        {
          w.d("MicroMsg.ReaaderAppGetPicStrategy", "handlerBitmap, path:%s", new Object[] { Pm() });
          d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
          GMTrace.o(756048461824L, 5633);
          return paramBitmap;
          i = (int)(50.0F * parama.density);
          j = i;
          continue;
          if ("@T".equals(paramString))
          {
            j = Integer.MAX_VALUE;
            i = 334;
          }
          else
          {
            j = 100;
          }
        }
        catch (Exception parama)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.ReaaderAppGetPicStrategy", parama, "", new Object[0]);
            w.e("MicroMsg.ReaaderAppGetPicStrategy", "save image %s fail", new Object[] { this.url });
          }
        }
      }
      GMTrace.o(756048461824L, 5633);
      return paramBitmap;
    }
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(756451115008L, 5636);
    if ((parama == i.a.hiU) && (this.tnp) && (p.Jh()) && (!bg.nm(paramString)) && (p.kp(Pn())) && (paramString.equals("image/webp")))
    {
      w.d("MicroMsg.ReaaderAppGetPicStrategy", "decode download webp picture failed");
      com.tencent.mm.plugin.report.service.g.ork.a(86L, 14L, 1L, false);
    }
    GMTrace.o(756451115008L, 5636);
  }
  
  public static final class a
  {
    public int h;
    public int w;
    public int x;
    public int y;
    
    public a()
    {
      GMTrace.i(773899419648L, 5766);
      GMTrace.o(773899419648L, 5766);
    }
    
    public final String toString()
    {
      GMTrace.i(774033637376L, 5767);
      String str = String.format("crop area[x=%d,y=%d,h=%d,w=%d]", new Object[] { Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.h), Integer.valueOf(this.w) });
      GMTrace.o(774033637376L, 5767);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */