package com.tencent.mm.plugin.voip_cs.b;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.brandservice.a.j;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.h;
import com.tencent.mm.plugin.voip_cs.b.c.f;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bbb;
import com.tencent.mm.protocal.c.boe;
import com.tencent.mm.protocal.c.bof;
import com.tencent.mm.protocal.c.boj;
import com.tencent.mm.protocal.c.bol;
import com.tencent.mm.protocal.c.bop;
import com.tencent.mm.protocal.c.bos;
import com.tencent.mm.protocal.c.bov;
import com.tencent.mm.protocal.c.box;
import com.tencent.mm.protocal.c.bpo;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements com.tencent.mm.ad.e
{
  public int mjP;
  public int qFB;
  public a qRU;
  public int qRV;
  public int qRW;
  public int qRX;
  public byte[] qRY;
  public int qRZ;
  public int qRr;
  public int qSa;
  public int qSb;
  public String qSc;
  public int qSd;
  public int qSe;
  public aj qSf;
  public aj qSg;
  
  public d()
  {
    GMTrace.i(11253351186432L, 83844);
    this.qRV = 0;
    this.qRr = 0;
    this.qRW = 0;
    this.qRX = 0;
    this.qRY = null;
    this.mjP = 0;
    this.qRZ = 0;
    this.qSa = 0;
    this.qSb = 0;
    this.qSc = "";
    this.qFB = 0;
    this.qSd = 0;
    this.qSe = 999;
    this.qSf = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11272544321536L, 83987);
        w.v("MicroMsg.voipcs.VoipCSService", "voipcs repeat sync");
        d.this.bwu();
        GMTrace.o(11272544321536L, 83987);
        return true;
      }
    }, true);
    this.qSg = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11271336361984L, 83978);
        w.v("MicroMsg.voipcs.VoipCSService", "voipcs heart beat");
        Object localObject = d.this;
        at.wS().a(795, (com.tencent.mm.ad.e)localObject);
        localObject = new com.tencent.mm.plugin.voip_cs.b.c.b(b.bwo().mkO.qJq, b.bwo().mkO.mjG);
        at.wS().a((k)localObject, 0);
        GMTrace.o(11271336361984L, 83978);
        return true;
      }
    }, true);
    GMTrace.o(11253351186432L, 83844);
  }
  
  private static void b(int paramInt1, int paramInt2, k paramk)
  {
    GMTrace.i(11253619621888L, 83846);
    w.i("MicroMsg.voipcs.VoipCSService", "Redirect response:" + paramInt1 + " errCode:" + paramInt2);
    if (paramInt2 != 0)
    {
      w.i("MicroMsg.voipcs.VoipCSService", " redirect response with error code:" + paramInt2);
      GMTrace.o(11253619621888L, 83846);
      return;
    }
    paramk = (bos)((com.tencent.mm.plugin.voip_cs.b.c.d)paramk).fUa.gtD.gtK;
    w.i("MicroMsg.voipcs.VoipCSService", "roomid " + paramk.uYy + " key " + paramk.uhV + "relay addr cnt " + paramk.tSO.size());
    paramk = paramk.tSO;
    bof localbof = new bof();
    Iterator localIterator = paramk.iterator();
    while (localIterator.hasNext())
    {
      boj localboj = (boj)localIterator.next();
      boe localboe = new boe();
      b.bwo();
      localboe.uTR = com.tencent.mm.plugin.voip_cs.b.b.a.JX(localboj.uBe);
      localboe.uKd = localboj.uKd;
      localbof.uYe.add(localboe);
    }
    localbof.uYd = paramk.size();
    b.bwo().mkO.a(localbof, localbof, null, 0, 0);
    GMTrace.o(11253619621888L, 83846);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11253888057344L, 83848);
    w.i("MicroMsg.voipcs.VoipCSService", "onSceneEnd :netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      Object localObject1;
      if (paramk.getType() == 823)
      {
        paramk = (bop)((com.tencent.mm.plugin.voip_cs.b.c.c)paramk).fUa.gtD.gtK;
        long l1 = paramk.uYy;
        long l2 = paramk.uhV;
        Object localObject2 = paramk.tSO;
        localObject1 = paramk.uYH;
        this.mjP = paramk.uYD;
        this.qSe = paramk.uYG;
        w.i("MicroMsg.voipcs.VoipCSService", "tcpStartCnt : " + this.qSe);
        b.bwo().mkO.qJx = paramk.mjW;
        this.qRZ = paramk.mjQ;
        b.bwo().mkO.qKm = paramk.mkb;
        b.bwo().mkO.qKn = paramk.uKu.toByteArray();
        b.bwo().mkO.qJw = paramk.mjX;
        paramString = new bof();
        Iterator localIterator = ((List)localObject2).iterator();
        boj localboj;
        boe localboe;
        while (localIterator.hasNext())
        {
          localboj = (boj)localIterator.next();
          localboe = new boe();
          b.bwo();
          localboe.uTR = com.tencent.mm.plugin.voip_cs.b.b.a.JX(localboj.uBe);
          localboe.uKd = localboj.uKd;
          paramString.uYe.add(localboe);
        }
        paramString.uYd = ((List)localObject2).size();
        localObject2 = new bof();
        localIterator = ((List)localObject1).iterator();
        while (localIterator.hasNext())
        {
          localboj = (boj)localIterator.next();
          localboe = new boe();
          b.bwo();
          localboe.uTR = com.tencent.mm.plugin.voip_cs.b.b.a.JX(localboj.uBe);
          localboe.uKd = localboj.uKd;
          ((bof)localObject2).uYe.add(localboe);
        }
        ((bof)localObject2).uYd = ((List)localObject1).size();
        b.bwo().mkO.qJq = l1;
        b.bwo().mkO.mjG = l2;
        w.i("MicroMsg.voipcs.VoipCSService", "recv invite resp csRoomId : " + l1 + ",roomKey:" + l2);
        b.bwo().mkO.qKw = paramk.uYE;
        b.bwo().mkO.qKx = paramk.uYF;
        paramk = new bpo();
        paramk.uZI = 0;
        paramk.uZJ = 0;
        paramk.uZK = 0;
        paramk.userName = "";
        paramk.lnX = "";
        if (b.bwo().mkO.a(paramString, paramString, paramString, paramk) != 0) {
          w.i("MicroMsg.voipcs.VoipCSService", "setIp fail!");
        }
        paramString = b.bwq();
        paramk = this.qSc;
        w.d("MicroMsg.VoipCSReportHelper", "setVoipCSBaseInfo");
        paramString.qRp = l1;
        paramString.mjG = l2;
        paramString.qRq = paramk;
        if (this.qSf.bQn())
        {
          if (this.mjP <= 0) {
            break label695;
          }
          paramString = this.qSf;
          l1 = this.mjP * 1000;
          paramString.z(l1, l1);
        }
        for (;;)
        {
          paramString = b.bwq();
          w.d("MicroMsg.VoipCSReportHelper", "markRecvInvite");
          if (paramString.qRO != 0) {
            paramString.qRP = ((int)(System.currentTimeMillis() / 1000L));
          }
          GMTrace.o(11253888057344L, 83848);
          return;
          label695:
          this.qSf.z(4000L, 4000L);
        }
      }
      if (paramk.getType() == 818)
      {
        paramString = (box)((f)paramk).fUa.gtD.gtK;
        w.i("MicroMsg.voipcs.VoipCSService", "sync status = " + paramString.uYK + ",notifySeq = " + paramString.uYI);
        a(paramString);
        GMTrace.o(11253888057344L, 83848);
        return;
      }
      if (paramk.getType() == 880)
      {
        paramString = (bol)((com.tencent.mm.plugin.voip_cs.b.c.a)paramk).fUa.gtD.gtK;
        if ((b.bwo().mkO.qJq == paramString.uYy) && (b.bwo().mkO.mjG == paramString.uhV)) {
          w.i("MicroMsg.voipcs.VoipCSService", "hangup success!");
        }
        at.wS().b(880, this);
        b.bwq().wH(com.tencent.mm.plugin.voip_cs.b.a.a.bww().qIy.bwd());
        GMTrace.o(11253888057344L, 83848);
        return;
      }
      if (paramk.getType() == 455)
      {
        localObject1 = (j)paramk;
        paramk = "";
        paramString = "";
        if ((((j)localObject1).jtj != null) && (((j)localObject1).jtj.size() > 0))
        {
          paramString = (bbb)((j)localObject1).jtj.get(0);
          paramk = paramString.ubV;
          paramString = paramString.uxT.uNR;
        }
        for (;;)
        {
          this.qRU.dY(paramk, paramString);
          GMTrace.o(11253888057344L, 83848);
          return;
          w.i("MicroMsg.voipcs.VoipCSService", "search Or Recommend items is null or empty !");
        }
      }
      if (paramk.getType() == 285)
      {
        b(paramInt1, paramInt2, paramk);
        GMTrace.o(11253888057344L, 83848);
        return;
      }
      if (paramk.getType() == 312)
      {
        paramString = (bov)((com.tencent.mm.plugin.voip_cs.b.c.e)paramk).fUa.gtD.gtK;
        if ((paramString.uYy == b.bwo().mkO.qJq) && (paramString.uhV == b.bwo().mkO.mjG)) {
          w.i("MicroMsg.voipcs.VoipCSService", "report data success!");
        }
        GMTrace.o(11253888057344L, 83848);
      }
    }
    else
    {
      w.i("MicroMsg.voipcs.VoipCSService", "onSceneEnd  resp error!:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 != 0) && (paramInt1 != 4))
      {
        this.qSd = -1;
        this.qRU.onError(10);
        GMTrace.o(11253888057344L, 83848);
        return;
      }
      if (paramk.getType() == 823)
      {
        if (paramInt2 == 406)
        {
          w.i("MicroMsg.voipcs.VoipCSService", "CS_INVITE_RESP_REPEAT_INVTIE 503..");
          GMTrace.o(11253888057344L, 83848);
          return;
        }
        b.bwq().aGU = 1;
        this.qSd = 823;
        this.qRU.onError(paramInt2);
        GMTrace.o(11253888057344L, 83848);
        return;
      }
      if ((paramk.getType() != 880) && (paramk.getType() != 818) && (paramk.getType() == 455)) {
        this.qRU.dY("", "");
      }
    }
    GMTrace.o(11253888057344L, 83848);
  }
  
  public final void a(box parambox)
  {
    GMTrace.i(11253753839616L, 83847);
    if ((parambox.uYI <= this.qRV) || (b.bwp().qSb == 3))
    {
      GMTrace.o(11253753839616L, 83847);
      return;
    }
    w.i("MicroMsg.voipcs.VoipCSService", "get callee sync resp,notifySeq:" + parambox.uYI + ",calleeMemberId:" + parambox.uYJ + ",calleeStatus:" + parambox.uYK + ",calleeSubStatus:" + parambox.uYL + ",recv roomId:" + parambox.uYy + ",recv roomKey:" + parambox.uhV);
    if ((b.bwo().mkO.qJq != 0L) && (b.bwo().mkO.qJq != parambox.uYy))
    {
      w.i("MicroMsg.voipcs.VoipCSService", "csRoomId:" + b.bwo().mkO.qJq + ",recv roomId:" + parambox.uYy + ",current and recv not equal!!");
      GMTrace.o(11253753839616L, 83847);
      return;
    }
    this.qRV = parambox.uYI;
    this.qRr = parambox.uYJ;
    this.qRW = parambox.uYK;
    this.qRX = parambox.uYL;
    b.bwq().qRr = this.qRr;
    if (this.qRW == 2)
    {
      w.i("MicroMsg.voipcs.VoipCSService", "callee accept!");
      this.qSf.stopTimer();
      bwu();
      b.bwo().mkO.mjG = parambox.uhV;
      w.i("MicroMsg.voipcs.VoipCSService", "csroomId:" + parambox.uYy + ",roomkey:" + parambox.uhV);
      if (parambox.uYM != null) {}
      for (parambox = parambox.uYM.toByteArray();; parambox = null)
      {
        this.qRY = parambox;
        if (b.bwo().mkO.field_capInfo != null) {
          break;
        }
        GMTrace.o(11253753839616L, 83847);
        return;
      }
      if (this.qRY == null)
      {
        GMTrace.o(11253753839616L, 83847);
        return;
      }
      parambox = b.bwq();
      w.d("MicroMsg.VoipCSReportHelper", "markUserAccept");
      if (parambox.qRE == 0L)
      {
        parambox.qRQ = ((int)(System.currentTimeMillis() / 1000L));
        parambox.qRE = (parambox.qRQ - parambox.qRO);
      }
      b.bwo().mkO.qJs = this.qRY;
      w.i("MicroMsg.voipcs.VoipCSService", "calleeCapDump is " + Arrays.toString(b.bwo().mkO.qJs));
      w.i("MicroMsg.voipcs.VoipCSService", "calleeCap length:" + this.qRY.length);
      if ((b.bwo().mkO.qJs != null) && (b.bwo().mkO.exchangeCabInfo(b.bwo().mkO.qJs, b.bwo().mkO.qJs.length) < 0)) {
        w.i("MicroMsg.voipcs.VoipCSService", "exchangeCabInfo fail!");
      }
      if (b.bwo().mkO.qJv == null) {}
      for (int i = 0;; i = b.bwo().mkO.qJv.length)
      {
        if (b.bwo().mkO.setConfigConnect(b.bwo().mkO.qJp, b.bwo().mkO.qJq, b.bwo().mkO.mjN, b.bwo().mkO.mjG, b.bwo().mkO.field_peerId, 1, b.bwo().mkO.qJw, b.bwo().mkO.qJx, b.bwo().mkO.qJu, i, b.bwo().mkO.qJv, this.qSe, 1, b.bwo().mkO.netType, b.bwo().mkO.qKm, b.bwo().mkO.qKn, 255, 0) != 0) {
          w.e("MicroMsg.voipcs.VoipCSService", "setConfig fail..");
        }
        if (this.qSg.bQn()) {
          this.qSg.z(50000L, 50000L);
        }
        b.bwq().qRx = 1;
        GMTrace.o(11253753839616L, 83847);
        return;
      }
    }
    if ((this.qRW != 0) && (this.qRW != 1) && (this.qRW == 3))
    {
      w.i("MicroMsg.voipcs.VoipCSService", "callee hangup!");
      b.bwq().aGU = 5;
      b.bwq().bwr();
      b.bwq().qRB = 2;
      if (this.qRX != 1) {
        break label876;
      }
      b.bwq().qRt = 12;
    }
    for (;;)
    {
      if (this.qRU != null) {
        this.qRU.wG(1);
      }
      GMTrace.o(11253753839616L, 83847);
      return;
      label876:
      if (this.qRX == 3) {
        b.bwq().qRt = 99;
      }
    }
  }
  
  public final void bwu()
  {
    GMTrace.i(11253485404160L, 83845);
    at.wS().a(818, this);
    f localf = new f(b.bwo().mkO.qJq, b.bwo().mkO.mjG, this.qRV);
    at.wS().a(localf, 0);
    GMTrace.o(11253485404160L, 83845);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */