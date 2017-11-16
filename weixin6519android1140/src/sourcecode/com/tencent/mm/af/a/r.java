package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.hx;
import com.tencent.mm.protocal.c.xm;
import com.tencent.mm.protocal.c.xn;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class r
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  Object data;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  Map<String, String> gyP;
  
  public r(LinkedList<hx> paramLinkedList, Object paramObject)
  {
    GMTrace.i(4578166702080L, 34110);
    this.gyP = new HashMap();
    Object localObject1 = paramLinkedList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (hx)((Iterator)localObject1).next();
      Object localObject3 = ((hx)localObject2).tWU;
      localObject2 = ((hx)localObject2).tVU;
      if ((localObject2 != null) && (localObject3 != null) && (((LinkedList)localObject3).size() > 0))
      {
        localObject3 = ((LinkedList)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          String str = (String)((Iterator)localObject3).next();
          this.gyP.put(str, localObject2);
        }
      }
    }
    localObject1 = new b.a();
    ((b.a)localObject1).gtF = new xm();
    ((b.a)localObject1).gtG = new xn();
    ((b.a)localObject1).uri = "/cgi-bin/mmocbiz-bin/getbizchatuserinfolist";
    ((b.a)localObject1).gtE = 1353;
    ((b.a)localObject1).gtH = 0;
    ((b.a)localObject1).gtI = 0;
    this.fUa = ((b.a)localObject1).DA();
    ((xm)this.fUa.gtC.gtK).upe = paramLinkedList;
    this.data = paramObject;
    GMTrace.o(4578166702080L, 34110);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4578569355264L, 34113);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneGetBizChatUserInfoList", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4578569355264L, 34113);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4578300919808L, 34111);
    w.d("MicroMsg.brandservice.NetSceneGetBizChatUserInfoList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4578300919808L, 34111);
  }
  
  public final int getType()
  {
    GMTrace.i(4578435137536L, 34112);
    GMTrace.o(4578435137536L, 34112);
    return 1353;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */