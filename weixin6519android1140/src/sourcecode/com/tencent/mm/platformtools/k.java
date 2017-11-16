package com.tencent.mm.platformtools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  implements Runnable
{
  String eRB;
  String gma;
  String hjl;
  
  public k(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(14608794386432L, 108844);
    this.eRB = paramString1;
    this.gma = paramString2;
    this.hjl = paramString3;
    GMTrace.o(14608794386432L, 108844);
  }
  
  public final void run()
  {
    GMTrace.i(14608928604160L, 108845);
    if ((bg.nm(this.eRB)) || (bg.nm(this.gma)))
    {
      GMTrace.o(14608928604160L, 108845);
      return;
    }
    w.d("MicroMsg.MoveDataFiles", "MoveDataFiles %s :" + this.eRB + " to :" + this.gma, new Object[] { this.hjl });
    if (!f.ty())
    {
      GMTrace.o(14608928604160L, 108845);
      return;
    }
    if (!this.gma.substring(0, e.ghz.length()).equals(e.ghz))
    {
      GMTrace.o(14608928604160L, 108845);
      return;
    }
    j.r(this.eRB + "/" + this.hjl, this.gma + "/" + this.hjl, true);
    GMTrace.o(14608928604160L, 108845);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */