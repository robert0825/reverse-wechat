package com.tencent.mm.plugin.sns.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.akr;
import com.tencent.mm.protocal.c.aks;
import com.tencent.mm.protocal.c.bg;
import com.tencent.mm.protocal.c.bh;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  public List<aks> pnj;
  
  public e(List<aks> paramList)
  {
    GMTrace.i(8165001265152L, 60834);
    Object localObject = new b.a();
    this.pnj = paramList;
    ((b.a)localObject).gtF = new bg();
    ((b.a)localObject).gtG = new bh();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adlog";
    ((b.a)localObject).gtE = 1802;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bg)this.fUa.gtC.gtK;
    akr localakr = new akr();
    localakr.tWD = d.tJw;
    localakr.tWE = d.tJv;
    localakr.tWF = d.tJy;
    localakr.tWG = d.tJz;
    localakr.tWH = v.bPK();
    localakr.uzT = ((int)(System.currentTimeMillis() / 1000L));
    ((bg)localObject).tPA = localakr;
    while (i < paramList.size())
    {
      ((bg)localObject).tPB.add(paramList.get(i));
      i += 1;
    }
    w.i("MicroMsg.NetSceneAdLog", "report count: " + ((bg)localObject).tPB.size());
    GMTrace.o(8165001265152L, 60834);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8165135482880L, 60835);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8165135482880L, 60835);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8165403918336L, 60837);
    w.d("MicroMsg.NetSceneAdLog", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramInt1 = ((bh)((b)paramq).gtD.gtK).tPC;
      h.xz();
      h.xy().xh().a(w.a.vrP, Integer.valueOf(paramInt1));
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8165403918336L, 60837);
  }
  
  public final int getType()
  {
    GMTrace.i(8165269700608L, 60836);
    GMTrace.o(8165269700608L, 60836);
    return 1802;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */