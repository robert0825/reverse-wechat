package com.tencent.mm.plugin.address.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.axd;
import com.tencent.mm.protocal.c.axe;
import com.tencent.mm.protocal.c.axf;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public int status;
  
  public d(String paramString1, String paramString2, o paramo)
  {
    GMTrace.i(12787325599744L, 95273);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new axd();
    ((b.a)localObject).gtG = new axe();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoimport";
    ((b.a)localObject).gtE = 582;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    StringBuilder localStringBuilder = new StringBuilder("a2key is ");
    if (!bg.nm(paramString1))
    {
      bool1 = true;
      localStringBuilder = localStringBuilder.append(bool1).append(", newa2key is ");
      if (bg.nm(paramString2)) {
        break label222;
      }
    }
    label222:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      w.d("MicroMsg.NetSceneRcptInfoImportYiXun", bool1);
      this.fUa = ((b.a)localObject).DA();
      localObject = (axd)this.fUa.gtC.gtK;
      ((axd)localObject).tSj = new azp().be(bg.St(paramString1));
      ((axd)localObject).uLX = new azp().be(bg.St(paramString2));
      ((axd)localObject).bUH = paramo.intValue();
      GMTrace.o(12787325599744L, 95273);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12787728252928L, 95276);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12787728252928L, 95276);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12787459817472L, 95274);
    w.d("MicroMsg.NetSceneRcptInfoImportYiXun", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (axe)((b)paramq).gtD.gtK;
      this.status = paramq.uLY;
      w.d("MicroMsg.NetSceneRcptInfoImportYiXun", "status : " + this.status);
      if ((paramq.uLW.uLZ != null) && (this.status == 0))
      {
        w.d("MicroMsg.NetSceneRcptInfoImportYiXun", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.uLW.uLZ.size());
        a.QM();
        a.QO().q(paramq.uLW.uLZ);
        a.QM();
        a.QO().QQ();
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12787459817472L, 95274);
  }
  
  public final int getType()
  {
    GMTrace.i(12787594035200L, 95275);
    GMTrace.o(12787594035200L, 95275);
    return 582;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */