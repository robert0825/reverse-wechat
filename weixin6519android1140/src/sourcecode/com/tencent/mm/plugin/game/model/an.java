package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ux;
import com.tencent.mm.protocal.c.uy;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class an
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String eBj;
  private com.tencent.mm.ad.e fUd;
  public final b kzP;
  
  public an(String paramString1, String paramString2, LinkedList<String> paramLinkedList)
  {
    GMTrace.i(12624922148864L, 94063);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ux();
    ((b.a)localObject).gtG = new uy();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamecentersearchrecommend";
    ((b.a)localObject).gtE = 1329;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    if (paramString2 == null) {}
    for (this.eBj = "";; this.eBj = paramString2.trim())
    {
      this.kzP = ((b.a)localObject).DA();
      localObject = (ux)this.kzP.gtC.gtK;
      ((ux)localObject).lQJ = paramString1;
      ((ux)localObject).unf = paramString2;
      ((ux)localObject).ung = paramLinkedList;
      GMTrace.o(12624922148864L, 94063);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12625056366592L, 94064);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12625056366592L, 94064);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12625190584320L, 94065);
    w.i("MicroMsg.NetSceneGameSearchRecmd", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12625190584320L, 94065);
  }
  
  public final int getType()
  {
    GMTrace.i(15646163206144L, 116573);
    GMTrace.o(15646163206144L, 116573);
    return 1329;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */