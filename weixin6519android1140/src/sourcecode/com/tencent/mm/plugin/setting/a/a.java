package com.tencent.mm.plugin.setting.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bjy;
import com.tencent.mm.protocal.c.bw;
import com.tencent.mm.protocal.c.bx;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private List<String> kNo;
  
  public a(List<String> paramList)
  {
    GMTrace.i(4591051603968L, 34206);
    this.kNo = paramList;
    GMTrace.o(4591051603968L, 34206);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4591454257152L, 34209);
    this.fUd = parame1;
    parame1 = new b.a();
    bw localbw = new bw();
    ArrayList localArrayList = new ArrayList();
    if (this.kNo != null)
    {
      i = 0;
      while (i < this.kNo.size())
      {
        bjy localbjy = new bjy();
        localbjy.jhi = ((String)this.kNo.get(i));
        localArrayList.add(localbjy);
        i += 1;
      }
    }
    localbw.tQj.addAll(localArrayList);
    parame1.gtF = localbw;
    parame1.gtG = new bx();
    parame1.uri = "/cgi-bin/micromsg-bin/addtrustedfriends";
    parame1.gtE = 583;
    parame1.gtH = 0;
    parame1.gtH = 0;
    int i = a(parame, parame1.DA(), this);
    GMTrace.o(4591454257152L, 34209);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4591185821696L, 34207);
    this.gtY = paramInt1;
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      w.e("MicroMsg.NetSceneGetTrustedFriends", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4591185821696L, 34207);
  }
  
  public final int getType()
  {
    GMTrace.i(4591320039424L, 34208);
    GMTrace.o(4591320039424L, 34208);
    return 583;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */