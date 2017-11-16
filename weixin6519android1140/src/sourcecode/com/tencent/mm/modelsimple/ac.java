package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bbj;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.z.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import junit.framework.Assert;

public final class ac
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private final com.tencent.mm.network.q guL;
  
  public ac(int paramInt, String paramString)
  {
    this(paramInt, paramString, "");
    GMTrace.i(1346740682752L, 10034);
    GMTrace.o(1346740682752L, 10034);
  }
  
  public ac(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(1346874900480L, 10035);
    this.guL = new e();
    z.a locala = (z.a)this.guL.DC();
    locala.tKX.jhi = com.tencent.mm.y.q.zE();
    bbj localbbj = locala.tKX;
    Object localObject = new StringBuilder();
    int i = paramInt;
    if (paramInt == 0) {
      i = 64;
    }
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append(i).append(";");
    localObject = paramString1;
    if (paramString1 == null) {
      localObject = "";
    }
    localbbj.nIp = ((String)localObject);
    w.d("MicroMsg.NetSceneSendCard", "content:" + locala.tKX.nIp);
    Assert.assertTrue("empty sendcard", true);
    locala.tKX.uGq = 64;
    if ((paramString2 != null) && (paramString2.length() > 0)) {
      locala.tKX.uOJ = paramString2;
    }
    GMTrace.o(1346874900480L, 10035);
  }
  
  public ac(String paramString)
  {
    GMTrace.i(1347009118208L, 10036);
    this.guL = new e();
    z.a locala = (z.a)this.guL.DC();
    locala.tKX.jhi = com.tencent.mm.y.q.zE();
    locala.tKX.nIp = paramString;
    w.d("MicroMsg.NetSceneSendCard", "content:" + paramString);
    paramString = locala.tKX;
    at.AR();
    paramString.usX = bg.e((Integer)c.xh().get(66561, null));
    Assert.assertTrue("empty sendcard", true);
    locala.tKX.uGq = 128;
    GMTrace.o(1347009118208L, 10036);
  }
  
  public ac(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1347143335936L, 10037);
    this.guL = new e();
    z.a locala = (z.a)this.guL.DC();
    locala.tKX.jhi = com.tencent.mm.y.q.zE();
    locala.tKX.nIp = paramString;
    w.d("MicroMsg.NetSceneSendCard", "content:" + paramString);
    paramString = locala.tKX;
    at.AR();
    paramString.usX = bg.e((Integer)c.xh().get(66561, null));
    int i;
    if (paramBoolean1)
    {
      i = 1;
      if (!paramBoolean2) {
        break label164;
      }
    }
    label164:
    for (int j = 4;; j = 0)
    {
      Assert.assertTrue("empty sendcard", true);
      locala.tKX.uGq = (j | i | 0x0 | 0x0 | 0x8);
      GMTrace.o(1347143335936L, 10037);
      return;
      i = 0;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1347277553664L, 10038);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(1347277553664L, 10038);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1347545989120L, 10040);
    this.fUd.a(paramInt2, paramInt3, paramq.AZ().tKu, this);
    GMTrace.o(1347545989120L, 10040);
  }
  
  public final int getType()
  {
    GMTrace.i(1347411771392L, 10039);
    GMTrace.o(1347411771392L, 10039);
    return 26;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */