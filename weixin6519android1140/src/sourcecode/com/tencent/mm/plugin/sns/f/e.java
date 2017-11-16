package com.tencent.mm.plugin.sns.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;

public final class e
{
  public static void HX(String paramString)
  {
    GMTrace.i(8770860089344L, 65348);
    w.i("MicroMsg.SnsABTestStrategy", "dump id " + paramString);
    paramString = com.tencent.mm.y.c.c.Ct().er(paramString);
    if (!paramString.isValid()) {
      w.i("MicroMsg.SnsABTestStrategy", "abtest is invalid");
    }
    if (paramString.bSg() != null) {
      w.i("MicroMsg.SnsABTestStrategy", "dump feed abtest " + paramString.field_rawXML);
    }
    GMTrace.o(8770860089344L, 65348);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */