package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ev;
import com.tencent.mm.protocal.c.ew;
import com.tencent.mm.protocal.c.oy;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ab
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private LinkedList<Integer> lch;
  private int lci;
  
  public ab(LinkedList<Integer> paramLinkedList)
  {
    GMTrace.i(6263136059392L, 46664);
    this.fUd = null;
    this.lci = 0;
    b.a locala = new b.a();
    locala.gtF = new ev();
    locala.gtG = new ew();
    locala.uri = "/cgi-bin/micromsg-bin/batchdelfavitem";
    locala.gtE = 403;
    locala.gtH = 194;
    locala.gtI = 1000000194;
    this.fUa = locala.DA();
    this.lch = paramLinkedList;
    GMTrace.o(6263136059392L, 46664);
  }
  
  private boolean ayn()
  {
    GMTrace.i(6263270277120L, 46665);
    if ((this.lch != null) && (this.lci < this.lch.size())) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NetSceneBatchDelFavItem", "check need continue, indexOK %B", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(6263270277120L, 46665);
      return bool;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6263404494848L, 46666);
    if ((this.lch == null) || (this.lch.isEmpty()) || (this.lci >= this.lch.size()))
    {
      w.e("MicroMsg.NetSceneBatchDelFavItem", "klem doScene idList null, begIndex %d", new Object[] { Integer.valueOf(this.lci) });
      GMTrace.o(6263404494848L, 46666);
      return -1;
    }
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene size %d, begIndex %d, total %s", new Object[] { Integer.valueOf(this.lch.size()), Integer.valueOf(this.lci), this.lch });
    parame1 = (ev)this.fUa.gtC.gtK;
    parame1.tTH.clear();
    int j = this.lci;
    int i = 0;
    if (j < this.lch.size())
    {
      int k = ((Integer)this.lch.get(j)).intValue();
      if (k <= 0) {
        break label279;
      }
      parame1.tTH.add(Integer.valueOf(k));
      i += 1;
    }
    label279:
    for (;;)
    {
      if (i < 20)
      {
        j += 1;
        break;
      }
      this.lci = (j + 1);
      parame1.jhc = parame1.tTH.size();
      w.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene checkd size %d, %s", new Object[] { Integer.valueOf(parame1.jhc), parame1.tTH });
      i = a(parame, this.fUa, this);
      GMTrace.o(6263404494848L, 46666);
      return i;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(6263672930304L, 46668);
    int i = k.b.gum;
    GMTrace.o(6263672930304L, 46668);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6263538712576L, 46667);
    w.i("MicroMsg.NetSceneBatchDelFavItem", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.lci), Integer.valueOf(this.lch.size()), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (ayn())
      {
        a(this.gtW, this.fUd);
        GMTrace.o(6263538712576L, 46667);
        return;
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6263538712576L, 46667);
      return;
    }
    paramq = ((ew)((b)paramq).gtD.gtK).jhd;
    if ((paramq == null) || (paramq.size() == 0))
    {
      w.e("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet resp list null");
      if (ayn())
      {
        a(this.gtW, this.fUd);
        GMTrace.o(6263538712576L, 46667);
        return;
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6263538712576L, 46667);
      return;
    }
    paramArrayOfByte = new ArrayList();
    w.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet respList size:%d", new Object[] { Integer.valueOf(paramq.size()) });
    paramInt1 = 0;
    if (paramInt1 < paramq.size())
    {
      oy localoy = (oy)paramq.get(paramInt1);
      if (localoy.tST < 0) {
        w.w("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d, delete failed", new Object[] { Integer.valueOf(localoy.tPL) });
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        paramArrayOfByte.add(Integer.valueOf(localoy.tPL));
        w.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d deleted", new Object[] { Integer.valueOf(localoy.tPL) });
      }
    }
    x.aA(paramArrayOfByte);
    if (ayn())
    {
      a(this.gtW, this.fUd);
      GMTrace.o(6263538712576L, 46667);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6263538712576L, 46667);
  }
  
  public final int getType()
  {
    GMTrace.i(6263941365760L, 46670);
    GMTrace.o(6263941365760L, 46670);
    return 403;
  }
  
  protected final int vB()
  {
    GMTrace.i(6263807148032L, 46669);
    GMTrace.o(6263807148032L, 46669);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */