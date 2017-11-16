package com.tencent.mm.plugin.order.c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;

public final class b
  implements i
{
  private static final String jzw;
  private String url;
  
  static
  {
    GMTrace.i(6662836453376L, 49642);
    jzw = e.ghz + "wallet";
    GMTrace.o(6662836453376L, 49642);
  }
  
  public b(String paramString)
  {
    GMTrace.i(6661091622912L, 49629);
    this.url = paramString;
    GMTrace.o(6661091622912L, 49629);
  }
  
  public final void I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6662433800192L, 49639);
    GMTrace.o(6662433800192L, 49639);
  }
  
  public final i.b Pl()
  {
    GMTrace.i(6662702235648L, 49641);
    GMTrace.o(6662702235648L, 49641);
    return null;
  }
  
  public final String Pm()
  {
    GMTrace.i(6661225840640L, 49630);
    String str = this.url;
    if (bg.nm(str))
    {
      w.w("MicroMsg.WalletGetPicStrategy", "getStoragePath: but url is null");
      GMTrace.o(6661225840640L, 49630);
      return null;
    }
    str = String.format("%s/%s", new Object[] { jzw, g.n(str.getBytes()) });
    GMTrace.o(6661225840640L, 49630);
    return str;
  }
  
  public final String Pn()
  {
    GMTrace.i(6661360058368L, 49631);
    String str = this.url;
    GMTrace.o(6661360058368L, 49631);
    return str;
  }
  
  public final String Po()
  {
    GMTrace.i(6661494276096L, 49632);
    String str = this.url;
    GMTrace.o(6661494276096L, 49632);
    return str;
  }
  
  public final String Pp()
  {
    GMTrace.i(6661628493824L, 49633);
    String str = this.url;
    GMTrace.o(6661628493824L, 49633);
    return str;
  }
  
  public final boolean Pq()
  {
    GMTrace.i(6661762711552L, 49634);
    GMTrace.o(6661762711552L, 49634);
    return true;
  }
  
  public final boolean Pr()
  {
    GMTrace.i(6661896929280L, 49635);
    GMTrace.o(6661896929280L, 49635);
    return false;
  }
  
  public final Bitmap Ps()
  {
    GMTrace.i(6662031147008L, 49636);
    GMTrace.o(6662031147008L, 49636);
    return null;
  }
  
  public final void Pt()
  {
    GMTrace.i(6662299582464L, 49638);
    GMTrace.o(6662299582464L, 49638);
  }
  
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    GMTrace.i(6662165364736L, 49637);
    if (i.a.hiU == parama) {}
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
      w.d("MicroMsg.WalletGetPicStrategy", "get bitmap, from %s", new Object[] { parama.toString() });
      GMTrace.o(6662165364736L, 49637);
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        try
        {
          paramString = new File(jzw);
          if (!paramString.exists()) {
            paramString.mkdir();
          }
          w.w("MicroMsg.WalletGetPicStrategy", " retry saving bitmap");
          d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
        }
        catch (IOException paramString)
        {
          w.printErrStackTrace("MicroMsg.WalletGetPicStrategy", paramString, "", new Object[0]);
          w.w("MicroMsg.WalletGetPicStrategy", "save bitmap fail");
        }
      }
    }
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(6662568017920L, 49640);
    GMTrace.o(6662568017920L, 49640);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */