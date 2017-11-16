package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bap;
import com.tencent.mm.protocal.c.baq;
import com.tencent.mm.sdk.platformtools.w;

public final class aw
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  final b kzP;
  
  public aw(int paramInt1, int paramInt2)
  {
    GMTrace.i(12618882351104L, 94018);
    w.i("MicroMsg.NetSceneSearchGameList", "offset: %d, limit: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bap();
    ((b.a)localObject).gtG = new baq();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/searchgamelist";
    ((b.a)localObject).gtE = 1215;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (bap)this.kzP.gtC.gtK;
    ((bap)localObject).lRx = paramInt1;
    ((bap)localObject).lRy = paramInt2;
    GMTrace.o(12618882351104L, 94018);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12619016568832L, 94019);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12619016568832L, 94019);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12619150786560L, 94020);
    w.i("MicroMsg.NetSceneSearchGameList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12619150786560L, 94020);
  }
  
  public final int getType()
  {
    GMTrace.i(15645894770688L, 116571);
    GMTrace.o(15645894770688L, 116571);
    return 1215;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */