package com.tencent.mm.plugin.recharge.b;

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

public final class a
  implements i
{
  private static final String jzw;
  private String url;
  
  static
  {
    GMTrace.i(7908913840128L, 58926);
    jzw = e.ghz + "wallet";
    GMTrace.o(7908913840128L, 58926);
  }
  
  public a(String paramString)
  {
    GMTrace.i(7907169009664L, 58913);
    this.url = paramString;
    GMTrace.o(7907169009664L, 58913);
  }
  
  public final void I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(7908511186944L, 58923);
    GMTrace.o(7908511186944L, 58923);
  }
  
  public final i.b Pl()
  {
    GMTrace.i(7908779622400L, 58925);
    GMTrace.o(7908779622400L, 58925);
    return null;
  }
  
  public final String Pm()
  {
    GMTrace.i(7907303227392L, 58914);
    String str = this.url;
    if (bg.nm(str))
    {
      w.w("MicroMsg.WalletGetPicStrategy", "getStoragePath: but url is null");
      GMTrace.o(7907303227392L, 58914);
      return null;
    }
    str = String.format("%s/%s", new Object[] { jzw, g.n(str.getBytes()) });
    GMTrace.o(7907303227392L, 58914);
    return str;
  }
  
  public final String Pn()
  {
    GMTrace.i(7907437445120L, 58915);
    String str = this.url;
    GMTrace.o(7907437445120L, 58915);
    return str;
  }
  
  public final String Po()
  {
    GMTrace.i(7907571662848L, 58916);
    String str = this.url;
    GMTrace.o(7907571662848L, 58916);
    return str;
  }
  
  public final String Pp()
  {
    GMTrace.i(7907705880576L, 58917);
    String str = this.url;
    GMTrace.o(7907705880576L, 58917);
    return str;
  }
  
  public final boolean Pq()
  {
    GMTrace.i(7907840098304L, 58918);
    GMTrace.o(7907840098304L, 58918);
    return true;
  }
  
  public final boolean Pr()
  {
    GMTrace.i(7907974316032L, 58919);
    GMTrace.o(7907974316032L, 58919);
    return false;
  }
  
  public final Bitmap Ps()
  {
    GMTrace.i(7908108533760L, 58920);
    GMTrace.o(7908108533760L, 58920);
    return null;
  }
  
  public final void Pt()
  {
    GMTrace.i(7908376969216L, 58922);
    GMTrace.o(7908376969216L, 58922);
  }
  
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    GMTrace.i(7908242751488L, 58921);
    if (i.a.hiU == parama) {}
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
      w.d("MicroMsg.WalletGetPicStrategy", "get bitmap, from %s", new Object[] { parama.toString() });
      GMTrace.o(7908242751488L, 58921);
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
    GMTrace.i(7908645404672L, 58924);
    GMTrace.o(7908645404672L, 58924);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */