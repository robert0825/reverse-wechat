package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;

public final class ak
  implements i
{
  protected String mPicUrl;
  
  public ak(String paramString)
  {
    GMTrace.i(12620358746112L, 94029);
    this.mPicUrl = paramString;
    paramString = new File(e.fSb);
    if (!paramString.exists()) {
      paramString.mkdir();
    }
    GMTrace.o(12620358746112L, 94029);
  }
  
  public final void I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(12621835141120L, 94040);
    GMTrace.o(12621835141120L, 94040);
  }
  
  public final i.b Pl()
  {
    GMTrace.i(12620492963840L, 94030);
    GMTrace.o(12620492963840L, 94030);
    return null;
  }
  
  public final String Pm()
  {
    GMTrace.i(12620627181568L, 94031);
    String str = e.fSb + g.n(this.mPicUrl.getBytes());
    GMTrace.o(12620627181568L, 94031);
    return str;
  }
  
  public final String Pn()
  {
    GMTrace.i(12620761399296L, 94032);
    String str = this.mPicUrl;
    GMTrace.o(12620761399296L, 94032);
    return str;
  }
  
  public final String Po()
  {
    GMTrace.i(12620895617024L, 94033);
    String str = this.mPicUrl.hashCode();
    GMTrace.o(12620895617024L, 94033);
    return str;
  }
  
  public final String Pp()
  {
    GMTrace.i(12621029834752L, 94034);
    String str = this.mPicUrl.hashCode();
    GMTrace.o(12621029834752L, 94034);
    return str;
  }
  
  public final boolean Pq()
  {
    GMTrace.i(12621164052480L, 94035);
    GMTrace.o(12621164052480L, 94035);
    return true;
  }
  
  public final boolean Pr()
  {
    GMTrace.i(12621298270208L, 94036);
    GMTrace.o(12621298270208L, 94036);
    return false;
  }
  
  public final Bitmap Ps()
  {
    GMTrace.i(12621432487936L, 94037);
    Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYv);
    GMTrace.o(12621432487936L, 94037);
    return localBitmap;
  }
  
  public final void Pt()
  {
    GMTrace.i(12621700923392L, 94039);
    GMTrace.o(12621700923392L, 94039);
  }
  
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    GMTrace.i(12621566705664L, 94038);
    if (i.a.hiV == parama)
    {
      GMTrace.o(12621566705664L, 94038);
      return paramBitmap;
    }
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
      GMTrace.o(12621566705664L, 94038);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.GetGamePicStrategy", parama, "", new Object[0]);
      }
    }
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(12621969358848L, 94041);
    GMTrace.o(12621969358848L, 94041);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */