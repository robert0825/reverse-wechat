package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bdm;
import com.tencent.mm.protocal.c.bdn;
import com.tencent.mm.protocal.c.bdo;
import com.tencent.mm.protocal.c.bdw;
import com.tencent.mm.protocal.c.bhb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jzG;
  public int jzH;
  public String jzI;
  
  public g(int paramInt1, LinkedList<bdo> paramLinkedList, String paramString1, String paramString2, bdw parambdw, int paramInt2, bhb parambhb)
  {
    GMTrace.i(5070477328384L, 37778);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bdm();
    ((b.a)localObject).gtG = new bdn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sharecarditem";
    ((b.a)localObject).gtE = 902;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bdm)this.fUa.gtC.gtK;
    ((bdm)localObject).uPB = paramInt1;
    ((bdm)localObject).glr = paramLinkedList;
    ((bdm)localObject).uPC = paramString1;
    ((bdm)localObject).upt = paramString2;
    w.i("MicroMsg.NetSceneShareCardItem", "list length is " + paramLinkedList.size());
    ((bdm)localObject).uPD = parambdw;
    ((bdm)localObject).eTL = paramInt2;
    ((bdm)localObject).tNL = parambhb;
    GMTrace.o(5070477328384L, 37778);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5070879981568L, 37781);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5070879981568L, 37781);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5070611546112L, 37779);
    w.i("MicroMsg.NetSceneShareCardItem", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(902), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      w.i("MicroMsg.NetSceneShareCardItem", "do ShareCardItem netscene success!");
      paramq = (bdn)this.fUa.gtD.gtK;
      if (paramq != null)
      {
        this.jzG = paramq.jzG;
        this.jzH = paramq.jzH;
        this.jzI = paramq.jzI;
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5070611546112L, 37779);
      return;
      paramq = (bdn)this.fUa.gtD.gtK;
      if (paramq != null)
      {
        this.jzG = paramq.jzG;
        this.jzH = paramq.jzH;
        this.jzI = paramq.jzI;
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(15361353187328L, 114451);
    GMTrace.o(15361353187328L, 114451);
    return 902;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */