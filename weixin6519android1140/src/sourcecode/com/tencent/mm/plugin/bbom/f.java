package com.tencent.mm.plugin.bbom;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.k;
import com.tencent.mm.protocal.c.aod;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.be;

public final class f
  implements k
{
  private String jjP;
  
  public f(String paramString)
  {
    GMTrace.i(8026085916672L, 59799);
    this.jjP = null;
    this.jjP = paramString;
    GMTrace.o(8026085916672L, 59799);
  }
  
  public final void a(aod paramaod, au paramau)
  {
    GMTrace.i(8026220134400L, 59800);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<msgsource>");
    localStringBuilder.append("<strangerantispamticket ticket=\"" + this.jjP + "\"></strangerantispamticket>");
    localStringBuilder.append(bg.nl(be.Bq()));
    if ((bg.nm(paramaod.tQb)) || (!paramaod.tQb.startsWith("<msgsource>"))) {}
    for (paramau = "<msgsource></msgsource>";; paramau = paramaod.tQb)
    {
      paramaod.tQb = paramau;
      paramaod.tQb = paramaod.tQb.replace("<msgsource>", localStringBuilder.toString());
      GMTrace.o(8026220134400L, 59800);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\bbom\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */