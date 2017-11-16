package com.tencent.mm.plugin.card.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;

public final class m
  implements i
{
  public static final String jzw;
  public static final String jzx;
  private final String TAG;
  private String mPicUrl;
  
  static
  {
    GMTrace.i(4925119528960L, 36695);
    jzw = e.ghz + "card";
    jzx = jzw + File.separator + "video";
    GMTrace.o(4925119528960L, 36695);
  }
  
  public m(String paramString)
  {
    GMTrace.i(4923240480768L, 36681);
    this.TAG = "MicroMsg.CardSimpleGetPicStrategy";
    this.mPicUrl = null;
    this.mPicUrl = paramString;
    GMTrace.o(4923240480768L, 36681);
  }
  
  public static String tZ(String paramString)
  {
    GMTrace.i(4923643133952L, 36684);
    paramString = String.format("%s/%s", new Object[] { jzw, g.n(paramString.getBytes()) });
    GMTrace.o(4923643133952L, 36684);
    return paramString;
  }
  
  public final void I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(4924851093504L, 36693);
    GMTrace.o(4924851093504L, 36693);
  }
  
  public final i.b Pl()
  {
    GMTrace.i(4923374698496L, 36682);
    GMTrace.o(4923374698496L, 36682);
    return null;
  }
  
  public final String Pm()
  {
    GMTrace.i(4923508916224L, 36683);
    String str = String.format("%s/%s", new Object[] { jzw, g.n(this.mPicUrl.getBytes()) });
    GMTrace.o(4923508916224L, 36683);
    return str;
  }
  
  public final String Pn()
  {
    GMTrace.i(4923777351680L, 36685);
    String str = this.mPicUrl;
    GMTrace.o(4923777351680L, 36685);
    return str;
  }
  
  public final String Po()
  {
    GMTrace.i(4923911569408L, 36686);
    String str = this.mPicUrl;
    GMTrace.o(4923911569408L, 36686);
    return str;
  }
  
  public final String Pp()
  {
    GMTrace.i(4924045787136L, 36687);
    String str = this.mPicUrl;
    GMTrace.o(4924045787136L, 36687);
    return str;
  }
  
  public final boolean Pq()
  {
    GMTrace.i(4924180004864L, 36688);
    GMTrace.o(4924180004864L, 36688);
    return true;
  }
  
  public final boolean Pr()
  {
    GMTrace.i(4924314222592L, 36689);
    GMTrace.o(4924314222592L, 36689);
    return false;
  }
  
  public final Bitmap Ps()
  {
    GMTrace.i(4924448440320L, 36690);
    w.d("MicroMsg.CardSimpleGetPicStrategy", "no sd card!");
    GMTrace.o(4924448440320L, 36690);
    return null;
  }
  
  public final void Pt()
  {
    GMTrace.i(4924716875776L, 36692);
    GMTrace.o(4924716875776L, 36692);
  }
  
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    GMTrace.i(4924582658048L, 36691);
    if (i.a.hiU == parama) {}
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
      w.d("MicroMsg.CardSimpleGetPicStrategy", "get bitmap, from %s", new Object[] { parama.toString() });
      GMTrace.o(4924582658048L, 36691);
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        try
        {
          paramString = new File(Pm());
          if (!paramString.exists()) {
            paramString.mkdirs();
          }
          w.w("MicroMsg.CardSimpleGetPicStrategy", " retry saving bitmap");
          d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
        }
        catch (IOException paramString)
        {
          w.printErrStackTrace("MicroMsg.CardSimpleGetPicStrategy", paramString, "", new Object[0]);
          w.w("MicroMsg.CardSimpleGetPicStrategy", "save bitmap fail");
        }
      }
    }
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(4924985311232L, 36694);
    GMTrace.o(4924985311232L, 36694);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\card\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */