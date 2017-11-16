package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.arr;
import com.tencent.mm.protocal.c.ayn;
import com.tencent.mm.protocal.c.ayo;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class ah
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public ah(LinkedList<arr> paramLinkedList)
  {
    GMTrace.i(18908056649728L, 140876);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ayn();
    ((b.a)localObject).gtG = new ayo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportdynamiccardcodeaction";
    ((b.a)localObject).gtE = 1275;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    ((ayn)this.fUa.gtC.gtK).uMR = paramLinkedList;
    if (paramLinkedList != null)
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        localObject = (arr)paramLinkedList.next();
        w.d("MicroMsg.NetSceneReportDynamicCardCodeAction", "ReportDynamicCardCodeActionReq operate card_id=%s,code_id=%s,operate_timestamp=%d,operate_type=%d", new Object[] { ((arr)localObject).eTJ, ((arr)localObject).jzv, Integer.valueOf(((arr)localObject).uHL), Integer.valueOf(((arr)localObject).uHM) });
      }
    }
    GMTrace.o(18908056649728L, 140876);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18908459302912L, 140879);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18908459302912L, 140879);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18908190867456L, 140877);
    w.i("MicroMsg.NetSceneReportDynamicCardCodeAction", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18908190867456L, 140877);
  }
  
  public final int getType()
  {
    GMTrace.i(18908325085184L, 140878);
    GMTrace.o(18908325085184L, 140878);
    return 1275;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */