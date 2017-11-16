package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.protocal.c.aox;
import com.tencent.mm.protocal.c.aoy;
import com.tencent.mm.protocal.c.aoz;
import com.tencent.mm.protocal.c.apa;
import com.tencent.mm.protocal.c.tl;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class ah
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public int lcA;
  public g lcB;
  private LinkedList<apa> lcC;
  private LinkedList<aox> lcD;
  public String lcE;
  public int type;
  
  public ah(int paramInt, g paramg)
  {
    this(paramInt, paramg.field_modItem.lcD, paramg.field_modItem.ull, 1);
    GMTrace.i(6298703757312L, 46929);
    this.lcB = paramg;
    GMTrace.o(6298703757312L, 46929);
  }
  
  public ah(int paramInt, LinkedList<aox> paramLinkedList, LinkedList<apa> paramLinkedList1)
  {
    this(paramInt, paramLinkedList, paramLinkedList1, 0);
    GMTrace.i(6298569539584L, 46928);
    GMTrace.o(6298569539584L, 46928);
  }
  
  private ah(int paramInt1, LinkedList<aox> paramLinkedList, LinkedList<apa> paramLinkedList1, int paramInt2)
  {
    GMTrace.i(6298435321856L, 46927);
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new aoy();
    locala.gtG = new aoz();
    locala.uri = "/cgi-bin/micromsg-bin/modfavitem";
    locala.gtE = 426;
    locala.gtH = 216;
    locala.gtI = 1000000216;
    this.fUa = locala.DA();
    this.lcC = paramLinkedList1;
    this.lcD = paramLinkedList;
    this.lcA = paramInt1;
    this.type = paramInt2;
    GMTrace.o(6298435321856L, 46927);
  }
  
  public ah(int paramInt, LinkedList<aox> paramLinkedList, LinkedList<apa> paramLinkedList1, String paramString)
  {
    this(paramInt, paramLinkedList, paramLinkedList1, 0);
    GMTrace.i(6298837975040L, 46930);
    this.lcE = paramString;
    GMTrace.o(6298837975040L, 46930);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6298972192768L, 46931);
    if ((this.lcD == null) || (this.lcD.size() == 0))
    {
      GMTrace.o(6298972192768L, 46931);
      return -1;
    }
    aoy localaoy = (aoy)this.fUa.gtC.gtK;
    localaoy.uEN = this.lcD.size();
    if (this.lcC != null) {
      localaoy.uEP = this.lcC.size();
    }
    for (localaoy.tTQ = this.lcC;; localaoy.tTQ = new LinkedList())
    {
      if (!bg.nm(this.lcE)) {
        localaoy.uEQ = this.lcE;
      }
      localaoy.uEN = this.lcD.size();
      localaoy.uEO = this.lcD;
      localaoy.tPL = this.lcA;
      this.fUd = parame1;
      int i = a(parame, this.fUa, this);
      GMTrace.o(6298972192768L, 46931);
      return i;
      localaoy.uEP = 0;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6299374845952L, 46934);
    w.d("MicroMsg.NetSceneModFavItem", "favId: " + this.lcA + ", netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    x.x(h.axB().cg(this.lcA));
    GMTrace.o(6299374845952L, 46934);
  }
  
  public final long ays()
  {
    GMTrace.i(6299106410496L, 46932);
    if (this.lcB == null)
    {
      GMTrace.o(6299106410496L, 46932);
      return -1L;
    }
    long l = this.lcB.field_localId;
    GMTrace.o(6299106410496L, 46932);
    return l;
  }
  
  public final int ayt()
  {
    GMTrace.i(6299240628224L, 46933);
    if (this.lcB == null)
    {
      GMTrace.o(6299240628224L, 46933);
      return -1;
    }
    int i = this.lcB.field_type;
    GMTrace.o(6299240628224L, 46933);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(6299509063680L, 46935);
    GMTrace.o(6299509063680L, 46935);
    return 426;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */