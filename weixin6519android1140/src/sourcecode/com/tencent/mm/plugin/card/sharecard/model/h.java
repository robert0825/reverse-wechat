package com.tencent.mm.plugin.card.sharecard.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.plugin.card.sharecard.a.a.2;
import com.tencent.mm.protocal.c.bdp;
import com.tencent.mm.protocal.c.bdq;
import com.tencent.mm.protocal.c.bdr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.List;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public h()
  {
    GMTrace.i(5069806239744L, 37773);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bdq();
    ((b.a)localObject).gtG = new bdr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sharecardsync";
    ((b.a)localObject).gtE = 906;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bdq)this.fUa.gtC.gtK;
    at.AR();
    ((bdq)localObject).uPG = ((Long)com.tencent.mm.y.c.xh().get(w.a.vrj, Long.valueOf(0L))).longValue();
    GMTrace.o(5069806239744L, 37773);
  }
  
  private static boolean a(bdp parambdp)
  {
    GMTrace.i(5070343110656L, 37777);
    if (parambdp == null)
    {
      w.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem fail, null cmd");
      GMTrace.o(5070343110656L, 37777);
      return false;
    }
    w.i("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, item card_id = %s, seq = %d", new Object[] { parambdp.eTJ, Long.valueOf(parambdp.uPF) });
    for (;;)
    {
      boolean bool;
      try
      {
        w.i("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, card user item, Status = %d", new Object[] { Integer.valueOf(parambdp.jAW) });
        switch (parambdp.jAW)
        {
        case 0: 
          w.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, card user item, unknown StateFlag = %d", new Object[] { Integer.valueOf(parambdp.jAW) });
          GMTrace.o(5070343110656L, 37777);
          return false;
        }
      }
      catch (Exception parambdp)
      {
        w.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem fail, ex = %s", new Object[] { parambdp.getMessage() });
        GMTrace.o(5070343110656L, 37777);
        return false;
      }
      Object localObject1 = al.aku();
      if (parambdp == null)
      {
        w.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr push fail, ShareCardSyncItem is null");
        if ((parambdp.jAW != 0) && (parambdp.jAW != 5))
        {
          at.AR();
          localObject1 = (String)com.tencent.mm.y.c.xh().get(w.a.vrr, "");
          at.AR();
          bool = ((Boolean)com.tencent.mm.y.c.xh().get(w.a.vrs, Boolean.valueOf(false))).booleanValue();
          if ((bool) && (!TextUtils.isEmpty((CharSequence)localObject1)) && (((String)localObject1).equals(parambdp.eTJ)))
          {
            w.i("MicroMsg.NetSceneShareCardSync", "need check is true, do clearRedDotAndWording()");
            com.tencent.mm.plugin.card.a.k.akb();
          }
        }
        else
        {
          GMTrace.o(5070343110656L, 37777);
          return true;
        }
      }
      else
      {
        ??? = al.akv().uk(parambdp.eTJ);
        Object localObject3 = parambdp.eTJ;
        long l;
        if (??? == null)
        {
          l = 0L;
          w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr pushShareCardSyncItem, card_id = %s, localSeq = %d, svrSeq = %d", new Object[] { localObject3, Long.valueOf(l), Long.valueOf(parambdp.uPF) });
          if ((??? != null) && (((ShareCardInfo)???).field_updateSeq == parambdp.uPF)) {
            w.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr push ShareCardSyncItem fail, card.field_updateSeq == item.seq");
          }
        }
        else
        {
          l = ((ShareCardInfo)???).field_updateSeq;
          continue;
        }
        localObject3 = n.b(parambdp);
        synchronized (((a)localObject1).gCf)
        {
          if (!((a)localObject1).jwH.contains(localObject3)) {}
        }
        if (((a)localObject1).jwI.contains(localObject3)) {
          continue;
        }
        ((a)localObject1).jwH.add(localObject3);
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr pushShareCardSyncItem, insertRet = %b", new Object[] { Boolean.valueOf(al.akw().b((com.tencent.mm.sdk.e.c)localObject3)) });
        continue;
        localObject1 = al.aku();
        if (parambdp == null)
        {
          w.e("MicroMsg.ShareCardBatchGetCardMgr", "delete item is  null");
          continue;
        }
        ??? = al.akv().uk(parambdp.eTJ);
        al.akv().uj(parambdp.eTJ);
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "delete share card for id " + parambdp.eTJ);
        if (??? != null) {
          com.tencent.mm.plugin.card.sharecard.a.b.a(ab.getContext(), (com.tencent.mm.plugin.card.base.b)???);
        }
        for (;;)
        {
          ((a)localObject1).aic();
          break;
          w.e("MicroMsg.ShareCardBatchGetCardMgr", "info is null");
        }
      }
      if (bool) {
        w.i("MicroMsg.NetSceneShareCardSync", "need check is true, but card id is diff!");
      } else {
        w.i("MicroMsg.NetSceneShareCardSync", "need check is false");
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5070074675200L, 37775);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5070074675200L, 37775);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q arg5, byte[] paramArrayOfByte)
  {
    GMTrace.i(5070208892928L, 37776);
    w.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(906), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, share card sync fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5070208892928L, 37776);
      return;
    }
    paramArrayOfByte = (bdr)this.fUa.gtD.gtK;
    if (paramArrayOfByte.glr == null)
    {
      ??? = null;
      if (??? != null) {
        break label245;
      }
      paramInt1 = 0;
      label135:
      w.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, share card cmd list size = %d, continueFlag = %d, req = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramArrayOfByte.uPH), Long.valueOf(paramArrayOfByte.uPF) });
      if ((??? == null) || (???.size() <= 0)) {
        break label391;
      }
      paramInt1 = 0;
      ??? = ???.iterator();
      label202:
      if (!???.hasNext()) {
        break label256;
      }
      if (a((bdp)???.next())) {
        break label478;
      }
      paramInt1 += 1;
    }
    label245:
    label256:
    label391:
    label478:
    for (;;)
    {
      break label202;
      ??? = paramArrayOfByte.glr;
      break;
      paramInt1 = ???.size();
      break label135;
      w.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, %d fail share cmds", new Object[] { Integer.valueOf(paramInt1) });
      al.aku().ajI();
      for (;;)
      {
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vrj, Long.valueOf(paramArrayOfByte.uPF));
        al.aku().jAO = paramArrayOfByte.jAO;
        if (paramArrayOfByte.uPH > 0)
        {
          w.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, should continue, continueFlag = %d", new Object[] { Integer.valueOf(paramArrayOfByte.uPH) });
          ??? = al.aku();
          ???.mHandler.post(new a.2(???));
        }
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(5070208892928L, 37776);
        return;
        w.i("MicroMsg.NetSceneShareCardSync", "share cmdList == null or size is 0");
        a locala = al.aku();
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr sharecardsync retryAll, getNow = %b", new Object[] { Boolean.valueOf(true) });
        synchronized (locala.gCf)
        {
          locala.jwH.addAll(locala.jwI);
          locala.jwI.clear();
          locala.ajI();
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(5069940457472L, 37774);
    GMTrace.o(5069940457472L, 37774);
    return 906;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */