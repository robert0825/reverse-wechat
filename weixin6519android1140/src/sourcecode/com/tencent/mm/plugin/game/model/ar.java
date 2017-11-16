package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.plugin.game.c.an;
import com.tencent.mm.plugin.game.c.ao;
import com.tencent.mm.plugin.game.c.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class ar
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b kzP;
  
  public ar(String paramString, LinkedList<String> paramLinkedList, q paramq1, q paramq2, q paramq3, boolean paramBoolean)
  {
    GMTrace.i(12609889763328L, 93951);
    w.i("MicroMsg.NetSceneGetGameIndex2", "lang = " + paramString + ", installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext()) {
      w.i("MicroMsg.NetSceneGetGameIndex2", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    }
    localObject = new b.a();
    ((b.a)localObject).gtF = new an();
    ((b.a)localObject).gtG = new ao();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgameindex2";
    ((b.a)localObject).gtE = 1238;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (an)this.kzP.gtC.gtK;
    ((an)localObject).lQJ = paramString;
    ((an)localObject).lRf = paramLinkedList;
    paramLinkedList = e.cA(ab.getContext());
    paramString = paramLinkedList;
    if (bg.nm(paramLinkedList)) {
      paramString = bg.bQT();
    }
    if (!bg.nm(k.countryCode)) {
      paramString = k.countryCode;
    }
    ((an)localObject).gCG = paramString;
    if (paramq1 != null) {}
    for (;;)
    {
      ((an)localObject).lRg = new m();
      if (paramq1 != null)
      {
        ((an)localObject).lRg.lPZ = paramq1.lMO.lND;
        ((an)localObject).lRg.lQa = paramq1.field_appId;
        ((an)localObject).lRg.lPf = paramq1.lNw;
        if (paramq1.field_msgType == 100) {
          ((an)localObject).lRg.lQc = paramq1.lNv;
        }
      }
      else
      {
        label303:
        if (paramq2 != null)
        {
          paramLinkedList = ((an)localObject).lRg;
          paramLinkedList.lQb |= 0x1;
        }
        if (paramq3 != null)
        {
          paramLinkedList = ((an)localObject).lRg;
          paramLinkedList.lQb |= 0x2;
        }
        ((an)localObject).lRh = SubCoreGameCenter.aGf().aFC();
        ((an)localObject).lRi = paramBoolean;
        if (!bg.bRb()) {
          break label440;
        }
      }
      label440:
      for (int i = 1;; i = 0)
      {
        ((an)localObject).lQK = i;
        w.i("MicroMsg.NetSceneGetGameIndex2", "Country Code: %s", new Object[] { paramString });
        GMTrace.o(12609889763328L, 93951);
        return;
        if (paramq2 != null)
        {
          paramq1 = paramq2;
          break;
        }
        if (paramq3 == null) {
          break label446;
        }
        paramq1 = paramq3;
        break;
        ((an)localObject).lRg.lQc = paramq1.field_msgType;
        break label303;
      }
      label446:
      paramq1 = null;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12610023981056L, 93952);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12610023981056L, 93952);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12610158198784L, 93953);
    w.i("MicroMsg.NetSceneGetGameIndex2", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12610158198784L, 93953);
  }
  
  public final int getType()
  {
    GMTrace.i(15645492117504L, 116568);
    GMTrace.o(15645492117504L, 116568);
    return 1238;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */