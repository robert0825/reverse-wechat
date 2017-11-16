package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.va;
import com.tencent.mm.protocal.c.vb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class am
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b kzP;
  
  public am(String paramString, LinkedList<String> paramLinkedList1, LinkedList<String> paramLinkedList2, int paramInt)
  {
    GMTrace.i(18029198966784L, 134328);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new va();
    ((b.a)localObject).gtG = new vb();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamecentersearch";
    ((b.a)localObject).gtE = 1328;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (va)this.kzP.gtC.gtK;
    ((va)localObject).lQJ = paramString;
    ((va)localObject).unn = paramLinkedList1;
    ((va)localObject).ung = paramLinkedList2;
    ((va)localObject).uno = paramInt;
    GMTrace.o(18029198966784L, 134328);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12619687657472L, 94024);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12619687657472L, 94024);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12619821875200L, 94025);
    w.i("MicroMsg.NetSceneGameCenterSearch", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12619821875200L, 94025);
  }
  
  public final int getType()
  {
    GMTrace.i(15646028988416L, 116572);
    GMTrace.o(15646028988416L, 116572);
    return 1328;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */