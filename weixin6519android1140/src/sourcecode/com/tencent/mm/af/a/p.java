package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.gz;
import com.tencent.mm.protocal.c.xg;
import com.tencent.mm.protocal.c.xh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class p
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  Map<String, String> gyO;
  
  public p(LinkedList<gz> paramLinkedList)
  {
    GMTrace.i(4570784727040L, 34055);
    this.gyO = new HashMap();
    Object localObject1 = paramLinkedList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (gz)((Iterator)localObject1).next();
      String str = ((gz)localObject2).tVO;
      localObject2 = ((gz)localObject2).tVU;
      if ((localObject2 != null) && (str != null)) {
        this.gyO.put(str, localObject2);
      }
    }
    localObject1 = new b.a();
    ((b.a)localObject1).gtF = new xg();
    ((b.a)localObject1).gtG = new xh();
    ((b.a)localObject1).uri = "/cgi-bin/mmocbiz-bin/getbizchatinfolist";
    ((b.a)localObject1).gtE = 1365;
    ((b.a)localObject1).gtH = 0;
    ((b.a)localObject1).gtI = 0;
    this.fUa = ((b.a)localObject1).DA();
    ((xg)this.fUa.gtC.gtK).upc = paramLinkedList;
    GMTrace.o(4570784727040L, 34055);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4571187380224L, 34058);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneGetBizChatInfoList", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4571187380224L, 34058);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4570918944768L, 34056);
    w.d("MicroMsg.brandservice.NetSceneGetBizChatInfoList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4570918944768L, 34056);
  }
  
  public final int getType()
  {
    GMTrace.i(4571053162496L, 34057);
    GMTrace.o(4571053162496L, 34057);
    return 1365;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */