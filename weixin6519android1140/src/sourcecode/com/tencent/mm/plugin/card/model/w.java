package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.card.a.l;
import com.tencent.mm.protocal.c.alh;
import com.tencent.mm.protocal.c.js;
import com.tencent.mm.protocal.c.jt;
import com.tencent.mm.protocal.c.jw;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.List;

public final class w
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private byte[] gMx;
  private int jzQ;
  
  public w(int paramInt)
  {
    GMTrace.i(4922435174400L, 36675);
    this.jzQ = 0;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneCardSync", "<init>, selector = %d", new Object[] { Integer.valueOf(1) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new js();
    ((b.a)localObject).gtG = new jt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cardsync";
    ((b.a)localObject).gtE = 558;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = new alh();
    at.AR();
    ((alh)localObject).jAY = ((String)com.tencent.mm.y.c.xh().get(w.a.vqZ, null));
    ((alh)localObject).latitude = al.akt().fJn;
    ((alh)localObject).longitude = al.akt().fJo;
    js localjs = (js)this.fUa.gtC.gtK;
    localjs.tZz = 1;
    localjs.tZB = ((alh)localObject);
    localjs.tZC = paramInt;
    this.jzQ = paramInt;
    GMTrace.o(4922435174400L, 36675);
  }
  
  private static boolean a(nk paramnk)
  {
    GMTrace.i(4922972045312L, 36679);
    if (paramnk == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, null cmd");
      GMTrace.o(4922972045312L, 36679);
      return false;
    }
    ??? = n.a(paramnk.uej);
    if ((??? == null) || (???.length == 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, null buf");
      GMTrace.o(4922972045312L, 36679);
      return false;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneCardSync", "processCmdItem, buf length = %d, cmdId = %d", new Object[] { Integer.valueOf(???.length), Integer.valueOf(paramnk.uei) });
    try
    {
      switch (paramnk.uei)
      {
      case 1: 
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.NetSceneCardSync", "processCmdItem, unknown cmdId = %d", new Object[] { Integer.valueOf(paramnk.uei) });
        GMTrace.o(4922972045312L, 36679);
        return false;
      }
    }
    catch (Exception paramnk)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, ex = %s", new Object[] { paramnk.getMessage() });
      GMTrace.o(4922972045312L, 36679);
      return false;
    }
    ??? = (jw)new jw().aD((byte[])???);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "processCmdIem, card user item, Status = %d", new Object[] { Integer.valueOf(((jw)???).jhA) });
    switch (((jw)???).jhA)
    {
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "processCmdIem, card user item, unknown StateFlag = %d", new Object[] { Integer.valueOf(((jw)???).uat) });
      GMTrace.o(4922972045312L, 36679);
      return false;
      paramnk = al.akm();
      if (??? == null) {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BatchGetCardMgr", "push fail, CardUserItem is null");
      }
      for (;;)
      {
        GMTrace.o(4922972045312L, 36679);
        return true;
        Object localObject2 = al.akn().tU(((jw)???).uar);
        String str = ((jw)???).uar;
        if (localObject2 == null) {}
        for (long l = 0L;; l = ((CardInfo)localObject2).field_updateSeq)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, cardUserId = %s, localSeq = %d, svrSeq = %d", new Object[] { str, Long.valueOf(l), Long.valueOf(((jw)???).uas) });
          if ((localObject2 == null) || (((CardInfo)localObject2).field_updateSeq != ((jw)???).uas)) {
            break label427;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BatchGetCardMgr", "push CardUserItem fail, card.field_updateSeq == item.UpdateSequence");
          break;
        }
        label427:
        localObject2 = aj.a((jw)???);
        synchronized (paramnk.gCf)
        {
          if (!paramnk.jwH.contains(localObject2)) {}
        }
        if (paramnk.jwI.contains(localObject2)) {}
        paramnk.jwH.add(localObject2);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, insertRet = %b", new Object[] { Boolean.valueOf(al.ako().b((com.tencent.mm.sdk.e.c)localObject2)) });
      }
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4922703609856L, 36677);
    this.fUd = parame1;
    parame1 = (js)this.fUa.gtC.gtK;
    at.AR();
    this.gMx = bg.St(bg.nl((String)com.tencent.mm.y.c.xh().get(282880, null)));
    if ((this.gMx == null) || (this.gMx.length == 0)) {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "doScene, keyBuf is null, init card sync~~~");
    }
    parame1.tZA = n.H(this.gMx);
    if (this.gMx == null) {}
    for (int i = 0;; i = this.gMx.length)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "doScene, keyBuf.length = %d", new Object[] { Integer.valueOf(i) });
      i = a(parame, this.fUa, this);
      GMTrace.o(4922703609856L, 36677);
      return i;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q arg5, byte[] paramArrayOfByte)
  {
    GMTrace.i(4922837827584L, 36678);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneCardSync", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "onGYNetEnd, card sync fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4922837827584L, 36678);
      return;
    }
    paramArrayOfByte = (jt)this.fUa.gtD.gtK;
    if (paramArrayOfByte.tZE == 1) {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "need do getCardsLayoutScene");
    }
    this.gMx = n.a(paramArrayOfByte.tZA, new byte[0]);
    if (paramArrayOfByte.tZD == null)
    {
      ??? = null;
      if (??? != null) {
        break label276;
      }
      paramInt1 = 0;
      label158:
      if (this.gMx != null) {
        break label287;
      }
      paramInt2 = 0;
      label167:
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "onGYNetEnd, cmd list size = %d, synckey length = %d, continueFlag = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramArrayOfByte.tXv) });
      if ((??? == null) || (???.size() <= 0)) {
        break label432;
      }
      paramInt1 = 0;
      ??? = ???.iterator();
      label230:
      if (!???.hasNext()) {
        break label296;
      }
      if (a((nk)???.next())) {
        break label543;
      }
      paramInt1 += 1;
    }
    label276:
    label287:
    label296:
    label432:
    label543:
    for (;;)
    {
      break label230;
      ??? = paramArrayOfByte.tZD.jhd;
      break;
      paramInt1 = ???.size();
      break label158;
      paramInt2 = this.gMx.length;
      break label167;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "onGYNetEnd, %d fail cmds", new Object[] { Integer.valueOf(paramInt1) });
      al.akm().ajI();
      for (;;)
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(282880, bg.bs(this.gMx));
        if (paramArrayOfByte.tXv > 0)
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneCardSync", "onGYNetEnd, should continue, continueFlag = %d", new Object[] { Integer.valueOf(paramArrayOfByte.tXv) });
          paramInt1 = a(this.gtW, this.fUd);
          if (paramInt1 <= 0)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "onGYNetEnd, doScene again fail, ret = %d", new Object[] { Integer.valueOf(paramInt1) });
            this.fUd.a(3, -1, paramString, this);
          }
          GMTrace.o(4922837827584L, 36678);
          return;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "cmdList == null or size is 0");
          com.tencent.mm.plugin.card.a.b localb = al.akm();
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "retryAll, getNow = %b", new Object[] { Boolean.valueOf(true) });
          synchronized (localb.gCf)
          {
            localb.jwH.addAll(localb.jwI);
            localb.jwI.clear();
            localb.ajI();
          }
        }
      }
      this.fUd.a(0, 0, paramString, this);
      GMTrace.o(4922837827584L, 36678);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4922569392128L, 36676);
    GMTrace.o(4922569392128L, 36676);
    return 558;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */