package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;

public final class j
  extends com.tencent.mm.sdk.e.i<i>
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(18910338351104L, 140893);
    fTX = new String[] { com.tencent.mm.sdk.e.i.a(i.fTp, "CardQrCodeConfi") };
    GMTrace.o(18910338351104L, 140893);
  }
  
  public j(e parame)
  {
    super(parame, i.fTp, "CardQrCodeConfi", null);
    GMTrace.i(18910069915648L, 140891);
    this.fTZ = parame;
    GMTrace.o(18910069915648L, 140891);
  }
  
  public final i tV(String paramString)
  {
    GMTrace.i(18910204133376L, 140892);
    i locali = new i();
    locali.field_card_id = paramString;
    if (b(locali, new String[0]))
    {
      GMTrace.o(18910204133376L, 140892);
      return locali;
    }
    GMTrace.o(18910204133376L, 140892);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */