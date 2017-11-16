package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.b.t;
import com.tencent.mm.protocal.c.jp;
import com.tencent.mm.protocal.c.jq;
import com.tencent.mm.protocal.c.jr;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class v
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jzO;
  public ArrayList<jp> jzP;
  
  public v(String paramString1, float paramFloat1, float paramFloat2, String paramString2)
  {
    GMTrace.i(4905657958400L, 36550);
    this.jzO = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new jq();
    ((b.a)localObject).gtG = new jr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cardshoplbs";
    ((b.a)localObject).gtE = 563;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (jq)this.fUa.gtC.gtK;
    ((jq)localObject).jxF = paramString1;
    ((jq)localObject).eNR = paramFloat1;
    ((jq)localObject).eMl = paramFloat2;
    ((jq)localObject).eTJ = paramString2;
    w.d("MicroMsg.NetSceneCardShopLBS", "<init>, cardId = %s, longtitude = %f, latitude = %f, card_id = %s", new Object[] { paramString1, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), paramString2 });
    GMTrace.o(4905657958400L, 36550);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4905926393856L, 36552);
    if (bg.nm(((jq)this.fUa.gtC.gtK).jxF))
    {
      w.e("MicroMsg.NetSceneCardShopLBS", "doScene fail, cardId is null");
      GMTrace.o(4905926393856L, 36552);
      return -1;
    }
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4905926393856L, 36552);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4906060611584L, 36553);
    w.i("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = ((jr)this.fUa.gtD.gtK).jzG;
      if (TextUtils.isEmpty(paramq)) {
        w.e("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd fail, json_ret is empty");
      }
      this.jzP = t.uQ(paramq);
      if (this.jzP != null) {
        w.d("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, respList size = %d", new Object[] { Integer.valueOf(this.jzP.size()) });
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4906060611584L, 36553);
  }
  
  public final int getType()
  {
    GMTrace.i(4905792176128L, 36551);
    GMTrace.o(4905792176128L, 36551);
    return 563;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */