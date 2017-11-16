package com.tencent.mm.plugin.scanner.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.plugin.scanner.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class o
  implements i
{
  private String mPicUrl;
  
  public o(String paramString)
  {
    GMTrace.i(6174820794368L, 46006);
    this.mPicUrl = null;
    this.mPicUrl = paramString;
    GMTrace.o(6174820794368L, 46006);
  }
  
  public final void I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6176028753920L, 46015);
    GMTrace.o(6176028753920L, 46015);
  }
  
  public final i.b Pl()
  {
    GMTrace.i(6176431407104L, 46018);
    GMTrace.o(6176431407104L, 46018);
    return null;
  }
  
  public final String Pm()
  {
    GMTrace.i(6174955012096L, 46007);
    String str = c.bcm().dv(this.mPicUrl, "@S");
    GMTrace.o(6174955012096L, 46007);
    return str;
  }
  
  public final String Pn()
  {
    GMTrace.i(6175089229824L, 46008);
    String str = this.mPicUrl;
    GMTrace.o(6175089229824L, 46008);
    return str;
  }
  
  public final String Po()
  {
    GMTrace.i(6175223447552L, 46009);
    String str = this.mPicUrl;
    GMTrace.o(6175223447552L, 46009);
    return str;
  }
  
  public final String Pp()
  {
    GMTrace.i(6175357665280L, 46010);
    String str = this.mPicUrl;
    GMTrace.o(6175357665280L, 46010);
    return str;
  }
  
  public final boolean Pq()
  {
    GMTrace.i(6175491883008L, 46011);
    GMTrace.o(6175491883008L, 46011);
    return false;
  }
  
  public final boolean Pr()
  {
    GMTrace.i(6175626100736L, 46012);
    GMTrace.o(6175626100736L, 46012);
    return false;
  }
  
  public final Bitmap Ps()
  {
    GMTrace.i(6176297189376L, 46017);
    if (ab.getContext() == null)
    {
      GMTrace.o(6176297189376L, 46017);
      return null;
    }
    Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYv);
    GMTrace.o(6176297189376L, 46017);
    return localBitmap;
  }
  
  public final void Pt()
  {
    GMTrace.i(6175894536192L, 46014);
    GMTrace.o(6175894536192L, 46014);
  }
  
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    GMTrace.i(6175760318464L, 46013);
    if (i.a.hiU == parama) {}
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
      GMTrace.o(6175760318464L, 46013);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ScannerGetPicStrategy", parama, "", new Object[0]);
      }
    }
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(6176162971648L, 46016);
    GMTrace.o(6176162971648L, 46016);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */