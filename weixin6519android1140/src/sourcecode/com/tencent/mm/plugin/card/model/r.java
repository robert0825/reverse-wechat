package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.et;
import com.tencent.mm.protocal.c.eu;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class r
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private int jzK;
  
  public r(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(4921361432576L, 36667);
    this.jzK = 0;
    b.a locala = new b.a();
    locala.gtF = new et();
    locala.gtG = new eu();
    locala.uri = "/cgi-bin/micromsg-bin/batchdelcarditem";
    locala.gtE = 560;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((et)this.fUa.gtC.gtK).tTF = paramLinkedList;
    GMTrace.o(4921361432576L, 36667);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4921629868032L, 36669);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4921629868032L, 36669);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4921764085760L, 36670);
    w.i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = ((eu)this.fUa.gtD.gtK).tTG;
      if (paramq != null) {
        break label127;
      }
      paramInt1 = 0;
      w.i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, resp list count = %d", new Object[] { Integer.valueOf(paramInt1) });
      if ((paramq != null) && (paramq.size() != 0)) {
        break label136;
      }
      w.e("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd fail, resp list is null");
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4921764085760L, 36670);
      return;
      label127:
      paramInt1 = paramq.size();
      break;
      label136:
      this.jzK = 0;
      paramq = paramq.iterator();
      label256:
      while (paramq.hasNext())
      {
        paramArrayOfByte = (String)paramq.next();
        boolean bool;
        if (TextUtils.isEmpty(paramArrayOfByte))
        {
          w.e("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem fail, id is null");
          bool = false;
        }
        for (;;)
        {
          if (bool) {
            break label256;
          }
          this.jzK += 1;
          break;
          CardInfo localCardInfo = new CardInfo();
          localCardInfo.field_card_id = paramArrayOfByte;
          bool = al.akn().a(localCardInfo, new String[0]);
          w.i("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem, delRet = %b", new Object[] { Boolean.valueOf(bool) });
        }
      }
      w.d("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, %d fail items", new Object[] { Integer.valueOf(this.jzK) });
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4921495650304L, 36668);
    GMTrace.o(4921495650304L, 36668);
    return 560;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */