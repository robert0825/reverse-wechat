package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.avt;
import com.tencent.mm.protocal.c.zr;
import com.tencent.mm.protocal.c.zs;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class ae
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public avt jzX;
  
  public ae(LinkedList<String> paramLinkedList, int paramInt)
  {
    GMTrace.i(18909533044736L, 140887);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new zr();
    ((b.a)localObject).gtG = new zs();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getdynamiccardcode";
    ((b.a)localObject).gtE = 1382;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (zr)this.fUa.gtC.gtK;
    ((zr)localObject).uqw = paramLinkedList;
    ((zr)localObject).scene = paramInt;
    GMTrace.o(18909533044736L, 140887);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18909935697920L, 140890);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18909935697920L, 140890);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18909667262464L, 140888);
    w.i("MicroMsg.NetSceneGetDynamicCardCode", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.jzX = ((zs)this.fUa.gtD.gtK).uqx;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18909667262464L, 140888);
  }
  
  public final int getType()
  {
    GMTrace.i(18909801480192L, 140889);
    GMTrace.o(18909801480192L, 140889);
    return 1382;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */