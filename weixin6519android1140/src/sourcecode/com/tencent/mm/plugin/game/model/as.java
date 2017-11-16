package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.c.ap;
import com.tencent.mm.plugin.game.c.aq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class as
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b kzP;
  
  public as(int paramInt1, LinkedList<String> paramLinkedList, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(12615392690176L, 93992);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ap();
    ((b.a)localObject).gtG = new aq();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newgetlibgamelist";
    ((b.a)localObject).gtE = 1218;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (ap)this.kzP.gtC.gtK;
    ((ap)localObject).lRx = paramInt1;
    ((ap)localObject).lRy = 15;
    ((ap)localObject).lQJ = v.bPK();
    ((ap)localObject).gCG = bg.bQT();
    ((ap)localObject).lRz = paramInt2;
    ((ap)localObject).lRf = paramLinkedList;
    ((ap)localObject).lRA = paramBoolean;
    GMTrace.o(12615392690176L, 93992);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12615526907904L, 93993);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12615526907904L, 93993);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12615661125632L, 93994);
    w.i("MicroMsg.NetSceneGetLibGameList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12615661125632L, 93994);
  }
  
  public final int getType()
  {
    GMTrace.i(15645760552960L, 116570);
    GMTrace.o(15645760552960L, 116570);
    return 1218;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */