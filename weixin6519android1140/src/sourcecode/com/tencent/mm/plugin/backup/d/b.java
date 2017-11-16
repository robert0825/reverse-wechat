package com.tencent.mm.plugin.backup.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.eh;
import com.tencent.mm.protocal.c.ej;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.b fUa;
  protected com.tencent.mm.ad.e fUd;
  
  public b(LinkedList<nu> paramLinkedList, String paramString)
  {
    GMTrace.i(9574690062336L, 71337);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new eh();
    ((b.a)localObject).gtG = new ej();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bakchatcreateqrcode";
    ((b.a)localObject).gtE = 704;
    this.fUa = ((b.a)localObject).DA();
    localObject = (eh)this.fUa.gtC.gtK;
    ((eh)localObject).tSN = paramLinkedList.size();
    ((eh)localObject).tSO = paramLinkedList;
    ((eh)localObject).tSQ = com.tencent.mm.y.q.zE();
    ((eh)localObject).tSP = p.getDeviceID(ab.getContext());
    ((eh)localObject).tSR = paramString;
    ((eh)localObject).jhw = 0L;
    ((eh)localObject).tOG = 2;
    GMTrace.o(9574690062336L, 71337);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9574824280064L, 71338);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9574824280064L, 71338);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9574958497792L, 71339);
    w.i("MicroMsg.BackupCreateQRCodeScene", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9574958497792L, 71339);
      return;
    }
    paramq = (ej)this.fUa.gtD.gtK;
    w.i("MicroMsg.BackupCreateQRCodeScene", "onGYNetEnd QRCodeUrl:%s", new Object[] { paramq.tSV });
    com.tencent.mm.plugin.backup.a.e.P(paramq.tSB.uNP.tJp);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9574958497792L, 71339);
  }
  
  public final int getType()
  {
    GMTrace.i(9575092715520L, 71340);
    GMTrace.o(9575092715520L, 71340);
    return 704;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */