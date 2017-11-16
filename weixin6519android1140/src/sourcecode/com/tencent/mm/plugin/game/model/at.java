package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.c.ar;
import com.tencent.mm.plugin.game.c.as;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class at
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b kzP;
  
  public at(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(12626666979328L, 94076);
    w.i("MicroMsg.NetSceneGetMoreGameList", "offset: %d, limit: %d, type: %d, cat: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(15), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ar();
    ((b.a)localObject).gtG = new as();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newgetmoregamelist";
    ((b.a)localObject).gtE = 1220;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (ar)this.kzP.gtC.gtK;
    ((ar)localObject).lRx = paramInt1;
    ((ar)localObject).lRy = 15;
    ((ar)localObject).lQJ = v.bPK();
    ((ar)localObject).lRF = paramInt2;
    ((ar)localObject).lRG = paramInt3;
    GMTrace.o(12626666979328L, 94076);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12626801197056L, 94077);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12626801197056L, 94077);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12626935414784L, 94078);
    w.i("MicroMsg.NetSceneGetMoreGameList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12626935414784L, 94078);
  }
  
  public final int getType()
  {
    GMTrace.i(15646431641600L, 116575);
    GMTrace.o(15646431641600L, 116575);
    return 1220;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */