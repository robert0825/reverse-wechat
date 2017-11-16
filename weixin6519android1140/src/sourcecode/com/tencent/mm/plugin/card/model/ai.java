package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.wm;
import com.tencent.mm.protocal.c.wn;
import com.tencent.mm.sdk.platformtools.w;

public final class ai
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public com.tencent.mm.bm.b jAf;
  public boolean jAg;
  public String jzG;
  
  public ai(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, String paramString5, String paramString6, com.tencent.mm.bm.b paramb)
  {
    GMTrace.i(4914382110720L, 36615);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new wm();
    ((b.a)localObject).gtG = new wn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getavailablecard";
    ((b.a)localObject).gtE = 664;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (wm)this.fUa.gtC.gtK;
    ((wm)localObject).jxL = paramString1;
    ((wm)localObject).jHO = paramInt1;
    ((wm)localObject).jHP = paramString2;
    ((wm)localObject).jHQ = paramString3;
    ((wm)localObject).time_stamp = paramInt2;
    ((wm)localObject).jHR = paramString4;
    ((wm)localObject).jxF = paramString5;
    ((wm)localObject).jHS = paramString6;
    ((wm)localObject).jAf = paramb;
    if ("INVOICE".equalsIgnoreCase(paramString6))
    {
      ((wm)localObject).uoH = 1;
      GMTrace.o(4914382110720L, 36615);
      return;
    }
    ((wm)localObject).uoH = 0;
    GMTrace.o(4914382110720L, 36615);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4914650546176L, 36617);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4914650546176L, 36617);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4914784763904L, 36618);
    w.i("MicroMsg.NetsceneGetAvailableCard", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (wn)this.fUa.gtD.gtK;
      this.jzG = paramq.jzG;
      this.jAf = paramq.jAf;
      if (paramq.uoI == 0) {
        break label119;
      }
    }
    label119:
    for (boolean bool = true;; bool = false)
    {
      this.jAg = bool;
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4914784763904L, 36618);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4914516328448L, 36616);
    GMTrace.o(4914516328448L, 36616);
    return 664;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\card\model\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */