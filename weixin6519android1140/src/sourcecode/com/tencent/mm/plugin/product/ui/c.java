package com.tencent.mm.plugin.product.ui;

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

public final class c
  implements i
{
  private static final String jzw;
  private String url;
  
  static
  {
    GMTrace.i(6012551561216L, 44797);
    jzw = e.ghz + "wallet";
    GMTrace.o(6012551561216L, 44797);
  }
  
  public c(String paramString)
  {
    GMTrace.i(6010672513024L, 44783);
    this.url = paramString;
    GMTrace.o(6010672513024L, 44783);
  }
  
  public static String EH(String paramString)
  {
    GMTrace.i(6012417343488L, 44796);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.WalletGetPicStrategy", "getStoragePath: but url is null");
      GMTrace.o(6012417343488L, 44796);
      return null;
    }
    paramString = String.format("%s/%s", new Object[] { jzw, g.n(paramString.getBytes()) });
    GMTrace.o(6012417343488L, 44796);
    return paramString;
  }
  
  public final void I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6012148908032L, 44794);
    GMTrace.o(6012148908032L, 44794);
  }
  
  public final i.b Pl()
  {
    GMTrace.i(6010806730752L, 44784);
    GMTrace.o(6010806730752L, 44784);
    return null;
  }
  
  public final String Pm()
  {
    GMTrace.i(6010940948480L, 44785);
    String str = EH(this.url);
    GMTrace.o(6010940948480L, 44785);
    return str;
  }
  
  public final String Pn()
  {
    GMTrace.i(6011075166208L, 44786);
    String str = this.url;
    GMTrace.o(6011075166208L, 44786);
    return str;
  }
  
  public final String Po()
  {
    GMTrace.i(6011209383936L, 44787);
    String str = this.url;
    GMTrace.o(6011209383936L, 44787);
    return str;
  }
  
  public final String Pp()
  {
    GMTrace.i(6011343601664L, 44788);
    String str = this.url;
    GMTrace.o(6011343601664L, 44788);
    return str;
  }
  
  public final boolean Pq()
  {
    GMTrace.i(6011477819392L, 44789);
    GMTrace.o(6011477819392L, 44789);
    return true;
  }
  
  public final boolean Pr()
  {
    GMTrace.i(6011612037120L, 44790);
    GMTrace.o(6011612037120L, 44790);
    return false;
  }
  
  public final Bitmap Ps()
  {
    GMTrace.i(6011746254848L, 44791);
    GMTrace.o(6011746254848L, 44791);
    return null;
  }
  
  public final void Pt()
  {
    GMTrace.i(6012014690304L, 44793);
    GMTrace.o(6012014690304L, 44793);
  }
  
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    GMTrace.i(6011880472576L, 44792);
    if (i.a.hiU == parama) {}
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, EH(this.url), false);
      w.d("MicroMsg.WalletGetPicStrategy", "get bitmap, from %s", new Object[] { parama.toString() });
      GMTrace.o(6011880472576L, 44792);
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
          d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, EH(this.url), false);
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
    GMTrace.i(6012283125760L, 44795);
    GMTrace.o(6012283125760L, 44795);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */