package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.protocal.c.bhb;
import com.tencent.mm.protocal.c.fb;
import com.tencent.mm.protocal.c.fc;
import com.tencent.mm.protocal.c.jv;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class t
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public LinkedList<CardInfo> jzN;
  
  public t(LinkedList<jv> paramLinkedList, bhb parambhb, int paramInt)
  {
    GMTrace.i(4893846798336L, 36462);
    this.jzN = new LinkedList();
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new fb();
    ((b.a)localObject).gtG = new fc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchgetcarditembytpinfo";
    ((b.a)localObject).gtE = 699;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (fb)this.fUa.gtC.gtK;
    ((fb)localObject).glr = paramLinkedList;
    ((fb)localObject).tNL = parambhb;
    ((fb)localObject).eTL = paramInt;
    GMTrace.o(4893846798336L, 36462);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4894115233792L, 36464);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4894115233792L, 36464);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4894249451520L, 36465);
    w.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4894249451520L, 36465);
      return;
    }
    paramq = ((fc)this.fUa.gtD.gtK).jzG;
    if (TextUtils.isEmpty(paramq))
    {
      w.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
      this.fUd.a(4, -1, null, this);
      GMTrace.o(4894249451520L, 36465);
      return;
    }
    paramq = f.uw(paramq);
    if (paramq != null)
    {
      l.amU();
      this.jzN.addAll(paramq);
    }
    this.fUd.a(0, 0, paramString, this);
    GMTrace.o(4894249451520L, 36465);
  }
  
  public final int getType()
  {
    GMTrace.i(4893981016064L, 36463);
    GMTrace.o(4893981016064L, 36463);
    return 699;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */