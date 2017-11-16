package com.tencent.mm.plugin.secinforeport;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.secinforeport.a.b;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.nf;
import com.tencent.mm.protocal.c.ng;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.charset.Charset;
import java.util.LinkedList;

public enum a
  implements b
{
  static
  {
    GMTrace.i(19115020386304L, 142418);
    oEN = new a("INSTANCE");
    oEO = new a[] { oEN };
    GMTrace.o(19115020386304L, 142418);
  }
  
  private a()
  {
    GMTrace.i(19114751950848L, 142416);
    GMTrace.o(19114751950848L, 142416);
  }
  
  public final void a(int paramInt1, String paramString, int paramInt2, byte[] paramArrayOfByte)
  {
    GMTrace.i(20846831730688L, 155321);
    if (paramString == null)
    {
      w.w("MicroMsg.ClipBordReportImpl", "operationInfo isNullOrNil");
      GMTrace.o(20846831730688L, 155321);
      return;
    }
    nf localnf = new nf();
    localnf.uea = paramInt1;
    localnf.uec = paramInt2;
    paramString = paramString.getBytes(Charset.forName("UTF-8"));
    localnf.ueb = new azp().be(paramString);
    if (!bg.bq(paramArrayOfByte)) {
      localnf.ued = new azp().be(paramArrayOfByte);
    }
    paramString = new ng();
    paramString.uef.add(localnf);
    paramString.uee = paramString.uef.size();
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new e.a(211, paramString));
    GMTrace.o(20846831730688L, 155321);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\secinforeport\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */