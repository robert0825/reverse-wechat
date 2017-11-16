package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.protocal.c.yc;
import com.tencent.mm.protocal.c.yd;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class y
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public y()
  {
    GMTrace.i(4915321634816L, 36622);
    b.a locala = new b.a();
    locala.gtF = new yc();
    locala.gtG = new yd();
    locala.uri = "/cgi-bin/micromsg-bin/getcardcount";
    locala.gtE = 663;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(4915321634816L, 36622);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4915590070272L, 36624);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4915590070272L, 36624);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4915724288000L, 36625);
    w.i("MicroMsg.NetSceneGetCardCount", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (yd)this.fUa.gtD.gtK;
      w.i("MicroMsg.NetSceneGetCardCount", "has_card_item:" + paramq.upr + " has_share_card:" + paramq.ups);
      if (paramq.upr > 0)
      {
        l.amU();
        at.AR();
        if (TextUtils.isEmpty((String)c.xh().get(w.a.vqZ, null)))
        {
          al.akm();
          com.tencent.mm.plugin.card.a.b.lD(1);
        }
      }
      if (paramq.ups > 0)
      {
        l.amW();
        at.AR();
        paramq = (Long)c.xh().get(w.a.vrj, Long.valueOf(0L));
        if ((paramq != null) && (paramq.longValue() == 0L)) {
          al.aku().akE();
        }
      }
    }
    at.AR();
    c.xh().set(282882, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4915724288000L, 36625);
  }
  
  public final int getType()
  {
    GMTrace.i(4915455852544L, 36623);
    GMTrace.o(4915455852544L, 36623);
    return 663;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */