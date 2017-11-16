package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.wq;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private final String id;
  public byte[] jgo;
  
  public d(String paramString)
  {
    GMTrace.i(14740059324416L, 109822);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new wq();
    ((b.a)localObject).gtG = new wr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getbakchatkey";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    ((b.a)localObject).gtE = 596;
    this.fUa = ((b.a)localObject).DA();
    localObject = (wq)this.fUa.gtC.gtK;
    ((wq)localObject).ID = paramString;
    ((wq)localObject).uoK = ac.bOq().ver;
    this.id = paramString;
    w.i("MicroMsg.NetSceneGetBakchatkey", "init id:%s, ver:0x%x", new Object[] { ((wq)localObject).ID, Integer.valueOf(((wq)localObject).uoK) });
    GMTrace.o(14740059324416L, 109822);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(14740461977600L, 109825);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(14740461977600L, 109825);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(14740596195328L, 109826);
    w.i("MicroMsg.NetSceneGetBakchatkey", "errType %d,  errCode %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.jgo = ((wr)this.fUa.gtD.gtK).tSB.uNP.tJp;
      paramq = this.id;
      if (this.jgo == null) {}
      for (paramInt1 = 0;; paramInt1 = this.jgo.length)
      {
        w.i("MicroMsg.NetSceneGetBakchatkey", "id:%s,  key len:%d", new Object[] { paramq, Integer.valueOf(paramInt1) });
        if (this.jgo == null) {
          break label199;
        }
        paramArrayOfByte = this.jgo;
        paramq = "";
        paramInt1 = 0;
        while (paramInt1 < paramArrayOfByte.length)
        {
          paramq = paramq + Integer.toHexString(paramArrayOfByte[paramInt1] & 0xFF) + " ";
          paramInt1 += 1;
        }
      }
      w.i("MicroMsg.NetSceneGetBakchatkey", "dump bakchat: %s", new Object[] { paramq });
    }
    label199:
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(14740596195328L, 109826);
  }
  
  public final void cancel()
  {
    GMTrace.i(14740193542144L, 109823);
    super.cancel();
    GMTrace.o(14740193542144L, 109823);
  }
  
  public final int getType()
  {
    GMTrace.i(14740327759872L, 109824);
    GMTrace.o(14740327759872L, 109824);
    return 596;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */