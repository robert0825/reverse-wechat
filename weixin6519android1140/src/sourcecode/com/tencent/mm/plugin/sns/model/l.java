package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.protocal.c.bem;
import com.tencent.mm.protocal.c.ben;
import com.tencent.mm.protocal.c.beo;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static List<Long> psa;
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  private String hai;
  private long poZ;
  
  static
  {
    GMTrace.i(8105811247104L, 60393);
    psa = Collections.synchronizedList(new LinkedList());
    GMTrace.o(8105811247104L, 60393);
  }
  
  public l(long paramLong, int paramInt)
  {
    GMTrace.i(8105274376192L, 60389);
    this.poZ = paramLong;
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new ben();
    ((b.a)localObject1).gtG = new beo();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnsadobjectdetail";
    ((b.a)localObject1).gtE = 683;
    Object localObject2 = new StringBuilder();
    h.xz();
    this.hai = (h.xy().cachePath + "ad_detail_session");
    localObject2 = FileOp.c(this.hai, 0, -1);
    this.fUa = ((b.a)localObject1).DA();
    ((ben)this.fUa.gtC.gtK).tXT = paramLong;
    ((ben)this.fUa.gtC.gtK).uQg = n.H((byte[])localObject2);
    ((ben)this.fUa.gtC.gtK).tOG = paramInt;
    localObject1 = new StringBuilder("req snsId ").append(paramLong).append(" ").append(i.dt(paramLong)).append(" scene ").append(paramInt).append(" buf is null? ");
    if (localObject2 == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.NetSceneSnsAdObjectDetial", bool);
      GMTrace.o(8105274376192L, 60389);
      return;
    }
  }
  
  public static boolean dy(long paramLong)
  {
    GMTrace.i(8105005940736L, 60387);
    if (psa.contains(Long.valueOf(paramLong)))
    {
      GMTrace.o(8105005940736L, 60387);
      return false;
    }
    psa.add(Long.valueOf(paramLong));
    GMTrace.o(8105005940736L, 60387);
    return true;
  }
  
  private static boolean dz(long paramLong)
  {
    GMTrace.i(8105140158464L, 60388);
    psa.remove(Long.valueOf(paramLong));
    GMTrace.o(8105140158464L, 60388);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8105408593920L, 60390);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8105408593920L, 60390);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8105677029376L, 60392);
    w.i("MicroMsg.NetSceneSnsAdObjectDetial", "errType " + paramInt2 + " errCode " + paramInt3);
    int i = 0;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      paramInt1 = 1;
    }
    while (paramInt1 == 0)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      dz(this.poZ);
      GMTrace.o(8105677029376L, 60392);
      return;
      paramInt1 = i;
      if (paramInt2 == 4)
      {
        paramInt1 = i;
        if (paramInt3 == 1)
        {
          paramq = n.a(((beo)this.fUa.gtD.gtK).uQg);
          if (paramq != null)
          {
            FileOp.deleteFile(this.hai);
            FileOp.b(this.hai, paramq, paramq.length);
          }
          paramInt1 = 0;
        }
      }
    }
    paramq = n.a(((beo)this.fUa.gtD.gtK).uQg);
    FileOp.deleteFile(this.hai);
    FileOp.b(this.hai, paramq, paramq.length);
    paramq = ((beo)this.fUa.gtD.gtK).uQh;
    if (paramq != null)
    {
      w.i("MicroMsg.NetSceneSnsAdObjectDetial", "snsdetail xml " + n.b(paramq.uQe.uQM));
      w.i("MicroMsg.NetSceneSnsAdObjectDetial", "adxml " + paramq.uQf);
    }
    if ((paramq != null) && (paramq.uQe != null) && (paramq.uQe.uED > 0))
    {
      w.i("MicroMsg.NetSceneSnsAdObjectDetial", paramq.uQe.tXT + " will remove by get detail ");
      dz(this.poZ);
      ae.bjg().delete(paramq.uQe.tXT);
      ae.bji().dP(paramq.uQe.tXT);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8105677029376L, 60392);
      return;
    }
    if ((paramq != null) && (paramq.uQe != null)) {
      w.i("MicroMsg.NetSceneSnsAdObjectDetial", "detail comment:" + paramq.uQe.uQT.size() + " like: " + paramq.uQe.uQQ.size());
    }
    a.a(paramq);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    dz(this.poZ);
    GMTrace.o(8105677029376L, 60392);
  }
  
  public final int getType()
  {
    GMTrace.i(8105542811648L, 60391);
    GMTrace.o(8105542811648L, 60391);
    return 683;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */