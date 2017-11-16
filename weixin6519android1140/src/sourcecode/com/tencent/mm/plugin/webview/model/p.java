package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aim;
import com.tencent.mm.protocal.c.ake;
import com.tencent.mm.protocal.c.akf;
import com.tencent.mm.protocal.c.akr;
import com.tencent.mm.protocal.c.aks;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public p(List<aks> paramList)
  {
    GMTrace.i(12000675495936L, 89412);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ake();
    ((b.a)localObject).gtG = new akf();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/jslog";
    ((b.a)localObject).gtE = 1803;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ake)this.fUa.gtC.gtK;
    akr localakr = new akr();
    localakr.tWD = d.tJw;
    localakr.tWE = d.tJv;
    localakr.tWF = d.tJy;
    localakr.tWG = d.tJz;
    localakr.tWH = v.bPK();
    localakr.uzT = ((int)(System.currentTimeMillis() / 1000L));
    ((ake)localObject).tPA = localakr;
    ((ake)localObject).tPB.addAll(paramList);
    GMTrace.o(12000675495936L, 89412);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12001078149120L, 89415);
    this.fUd = parame1;
    w.d("MicroMsg.NetSceneJsLog", "doScene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(12001078149120L, 89415);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12000809713664L, 89413);
    w.i("MicroMsg.NetSceneJsLog", "onGYNetEnd, netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (akf)((b)paramq).gtD.gtK;
      w.i("MicroMsg.NetSceneJsLog", "received InvalidLogList: ");
      paramArrayOfByte = new StringBuilder("{ ");
      if (!bg.cc(paramq.uzF)) {
        break label172;
      }
      paramArrayOfByte.append("{  }");
    }
    for (;;)
    {
      paramArrayOfByte.append(" }");
      w.i("MicroMsg.NetSceneJsLog", paramArrayOfByte.toString());
      paramArrayOfByte = e.a.rEh;
      e.bS(paramq.uzF);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12000809713664L, 89413);
      return;
      label172:
      Iterator localIterator = paramq.uzF.iterator();
      while (localIterator.hasNext())
      {
        aim localaim = (aim)localIterator.next();
        paramArrayOfByte.append(String.format(" { logId(%d), interval(%d) },", new Object[] { Integer.valueOf(localaim.uxP), Integer.valueOf(localaim.uxQ) }));
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(12000943931392L, 89414);
    GMTrace.o(12000943931392L, 89414);
    return 1803;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */