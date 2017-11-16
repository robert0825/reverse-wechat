package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.a.om;
import com.tencent.mm.g.a.oo;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsimple.aj;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.protocal.c.aod;
import com.tencent.mm.protocal.c.aoe;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bbr;
import com.tencent.mm.protocal.c.bbs;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.an;
import com.tencent.mm.y.bc;
import com.tencent.wcdb.database.SQLiteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static final List<an> gMA;
  public long eDr;
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  private final List<au> gMB;
  public int gMC;
  public boolean gMD;
  public final List<au> gME;
  private au gMF;
  public com.tencent.mm.plugin.messenger.foundation.a.k gMG;
  
  static
  {
    GMTrace.i(13249034584064L, 98713);
    gMA = new ArrayList();
    GMTrace.o(13249034584064L, 98713);
  }
  
  public j()
  {
    GMTrace.i(13245813358592L, 98689);
    this.gMB = new LinkedList();
    this.gMC = 3;
    this.gMD = false;
    this.gME = new ArrayList();
    this.gMF = null;
    this.gMG = null;
    w.d("MicroMsg.NetSceneSendMsg", "dktext :%s", new Object[] { bg.bQW() });
    w.i("MicroMsg.NetSceneSendMsg", "empty msg sender created");
    GMTrace.o(13245813358592L, 98689);
  }
  
  public j(long paramLong)
  {
    GMTrace.i(13245679140864L, 98688);
    this.gMB = new LinkedList();
    this.gMC = 3;
    this.gMD = false;
    this.gME = new ArrayList();
    this.gMF = null;
    this.gMG = null;
    w.i("MicroMsg.NetSceneSendMsg", "resend msg , local id = " + paramLong);
    this.eDr = paramLong;
    this.gMF = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramLong);
    if (this.gMF == null) {
      w.e("MicroMsg.NetSceneSendMsg", "resend msg , msg is null localid:%d", new Object[] { Long.valueOf(paramLong) });
    }
    GMTrace.o(13245679140864L, 98688);
  }
  
  public j(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(13245544923136L, 98687);
    this.gMB = new LinkedList();
    this.gMC = 3;
    this.gMD = false;
    this.gME = new ArrayList();
    this.gMF = null;
    this.gMG = null;
    w.d("MicroMsg.NetSceneSendMsg", "dktext :%s", new Object[] { bg.bQW() });
    au localau;
    if (!bg.nm(paramString1))
    {
      localau = new au();
      localau.dB(1);
      localau.db(paramString1);
      localau.E(bc.gR(paramString1));
      localau.dC(1);
      localau.setContent(paramString2);
      localau.setType(paramInt);
      paramString1 = ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.o.class)).s(localau);
      if (!bg.nm(paramString1))
      {
        localau.dh(paramString1);
        w.d("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", new Object[] { localau.fwv });
      }
    }
    for (;;)
    {
      try
      {
        this.eDr = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().c(localau, true);
        if (this.eDr == -1L) {
          d.oqe.a(111L, 255L, 1L, false);
        }
        if (this.eDr != -1L)
        {
          bool = true;
          Assert.assertTrue(bool);
          w.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.eDr);
          GMTrace.o(13245544923136L, 98687);
          return;
        }
      }
      catch (SQLiteException paramString1)
      {
        d.oqe.a(111L, 255L, 1L, false);
        throw paramString1;
      }
      boolean bool = false;
    }
  }
  
  public j(String paramString1, String paramString2, int paramInt1, int paramInt2, Object paramObject)
  {
    GMTrace.i(14607452209152L, 108834);
    this.gMB = new LinkedList();
    this.gMC = 3;
    this.gMD = false;
    this.gME = new ArrayList();
    this.gMF = null;
    this.gMG = null;
    w.d("MicroMsg.NetSceneSendMsg", "dktext :%s", new Object[] { bg.bQW() });
    au localau;
    if (!bg.nm(paramString1))
    {
      localau = new au();
      localau.dB(1);
      localau.db(paramString1);
      localau.E(bc.gR(paramString1));
      localau.dC(1);
      localau.setContent(paramString2);
      localau.setType(paramInt1);
      paramString1 = a(((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.o.class)).s(localau), paramObject, paramInt2);
      if (!bg.nm(paramString1))
      {
        localau.dh(paramString1);
        w.d("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", new Object[] { localau.fwv });
      }
    }
    for (;;)
    {
      try
      {
        this.eDr = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().c(localau, true);
        if (this.eDr == -1L) {
          d.oqe.a(111L, 255L, 1L, false);
        }
        if (this.eDr != -1L)
        {
          bool = true;
          Assert.assertTrue(bool);
          w.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.eDr);
          GMTrace.o(14607452209152L, 108834);
          return;
        }
      }
      catch (SQLiteException paramString1)
      {
        d.oqe.a(111L, 255L, 1L, false);
        throw paramString1;
      }
      boolean bool = false;
    }
  }
  
  private void Jz()
  {
    GMTrace.i(13247423971328L, 98701);
    int i = 0;
    while (i < this.gMB.size())
    {
      gD(i);
      i += 1;
    }
    GMTrace.o(13247423971328L, 98701);
  }
  
  private static String a(String paramString, Object paramObject, int paramInt)
  {
    GMTrace.i(14607586426880L, 108835);
    if (paramObject == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] rawSource:%s args is null:%s flag:%s", new Object[] { paramString, Boolean.valueOf(bool), Integer.valueOf(paramInt) });
      if ((bg.nm(paramString)) || (paramString.startsWith("<msgsource>"))) {
        break;
      }
      w.w("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] WTF the msgsource is right? %s", new Object[] { paramString });
      GMTrace.o(14607586426880L, 108835);
      return paramString;
    }
    if ((paramInt == 291) && ((paramObject instanceof HashMap)))
    {
      StringBuffer localStringBuffer = new StringBuffer();
      if (bg.nm(paramString)) {
        localStringBuffer.append("<msgsource>");
      }
      paramObject = ((HashMap)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext())
      {
        Object localObject = (Map.Entry)((Iterator)paramObject).next();
        String str = (String)((Map.Entry)localObject).getValue();
        localObject = (String)((Map.Entry)localObject).getKey();
        if ((bg.nm(str)) || (bg.nm((String)localObject)))
        {
          w.w("MicroMsg.NetSceneSendMsg", "%s %s", new Object[] { localObject, str });
        }
        else
        {
          localStringBuffer.append("<").append((String)localObject).append(">");
          localStringBuffer.append(str);
          localStringBuffer.append("</").append((String)localObject).append(">");
        }
      }
      if (bg.nm(paramString))
      {
        localStringBuffer.append("</msgsource>");
        paramString = localStringBuffer.toString();
        GMTrace.o(14607586426880L, 108835);
        return paramString;
      }
      paramString = paramString.replace("<msgsource>", "<msgsource>" + localStringBuffer.toString());
      GMTrace.o(14607586426880L, 108835);
      return paramString;
    }
    GMTrace.o(14607586426880L, 108835);
    return paramString;
  }
  
  public static void a(an paraman)
  {
    GMTrace.i(13247289753600L, 98700);
    gMA.remove(paraman);
    GMTrace.o(13247289753600L, 98700);
  }
  
  private void gC(int paramInt)
  {
    GMTrace.i(13246752882688L, 98696);
    if (this.gMB == null)
    {
      w.e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, sendingList is null");
      GMTrace.o(13246752882688L, 98696);
      return;
    }
    if ((paramInt >= this.gMB.size()) || (paramInt < 0))
    {
      w.e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, index:%d, sendingList.size:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.gMB.size()) });
      GMTrace.o(13246752882688L, 98696);
      return;
    }
    q((au)this.gMB.get(paramInt));
    GMTrace.o(13246752882688L, 98696);
  }
  
  private void gD(int paramInt)
  {
    GMTrace.i(13247558189056L, 98702);
    au localau = (au)this.gMB.get(paramInt);
    w.d("MicroMsg.NetSceneSendMsg", "markMsgFailed for id:%d", new Object[] { Long.valueOf(localau.field_msgId) });
    r(localau);
    GMTrace.o(13247558189056L, 98702);
  }
  
  static void q(au paramau)
  {
    GMTrace.i(13246887100416L, 98697);
    om localom = new om();
    localom.eTz.eAH = paramau;
    a.vgX.m(localom);
    w.d("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent for msgId:%d", new Object[] { Long.valueOf(paramau.field_msgId) });
    GMTrace.o(13246887100416L, 98697);
  }
  
  static void r(au paramau)
  {
    GMTrace.i(13247692406784L, 98703);
    paramau.dB(5);
    d.oqe.a(111L, 30L, 1L, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramau.field_msgId, paramau);
    Iterator localIterator = gMA.iterator();
    while (localIterator.hasNext())
    {
      an localan = (an)localIterator.next();
      String str1 = paramau.field_talker;
      String str2 = paramau.field_content;
      localan.gL(str1);
    }
    GMTrace.o(13247692406784L, 98703);
  }
  
  public final boolean DE()
  {
    GMTrace.i(13245947576320L, 98690);
    GMTrace.o(13245947576320L, 98690);
    return true;
  }
  
  public final boolean DF()
  {
    GMTrace.i(13246216011776L, 98692);
    boolean bool = super.DF();
    if (bool) {
      d.oqe.a(111L, 254L, 1L, false);
    }
    GMTrace.o(13246216011776L, 98692);
    return bool;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13246484447232L, 98694);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new bbr();
    parame1.gtG = new bbs();
    parame1.uri = "/cgi-bin/micromsg-bin/newsendmsg";
    parame1.gtE = 522;
    parame1.gtH = 237;
    parame1.gtI = 1000000237;
    this.fUa = parame1.DA();
    bbr localbbr = (bbr)this.fUa.gtC.gtK;
    if (this.gMF == null) {
      parame1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().aOn();
    }
    while (parame1.size() == 0)
    {
      w.w("MicroMsg.NetSceneSendMsg", "no sending message");
      GMTrace.o(13246484447232L, 98694);
      return -2;
      if (this.gMF.field_status != 5) {
        w.w("MicroMsg.NetSceneSendMsg", "msg:%d status:%d should not be resend !", new Object[] { Long.valueOf(this.gMF.field_msgId), Integer.valueOf(this.gMF.field_status) });
      }
      this.gMF.dB(1);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this.eDr, this.gMF);
      parame1 = new ArrayList();
      parame1.add(this.gMF);
      this.gMF = null;
    }
    this.gMB.clear();
    int i = 0;
    while (i < parame1.size())
    {
      au localau = (au)parame1.get(i);
      if (localau.field_isSend == 1)
      {
        aod localaod = new aod();
        localaod.tPX = new azq().Rq(localau.field_talker);
        localaod.nFd = ((int)(localau.field_createTime / 1000L));
        localaod.jib = localau.field_type;
        localaod.nIp = localau.field_content;
        localaod.uEe = com.tencent.mm.y.o.h(com.tencent.mm.y.q.zE(), localau.field_createTime).hashCode();
        if (this.gMG == null) {
          this.gMG = ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.o.class)).JD();
        }
        w.i("MicroMsg.NetSceneSendMsg", "using message source assembler %s", new Object[] { this.gMG });
        this.gMG.a(localaod, localau);
        w.i("MicroMsg.NetSceneSendMsg", "reqCmd.MsgSource:%s", new Object[] { localaod.tQb });
        localbbr.jhd.add(localaod);
        localbbr.jhc = localbbr.jhd.size();
        this.gMB.add(localau);
      }
      i += 1;
    }
    i = a(parame, this.fUa, this);
    if (i < 0)
    {
      w.i("MicroMsg.NetSceneSendMsg", "mark all failed. do scene %d", new Object[] { Integer.valueOf(i) });
      Jz();
    }
    GMTrace.o(13246484447232L, 98694);
    return i;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(13246350229504L, 98693);
    if (this.gMB.size() > 0)
    {
      i = k.b.gum;
      GMTrace.o(13246350229504L, 98693);
      return i;
    }
    int i = k.b.gun;
    GMTrace.o(13246350229504L, 98693);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, final String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13247021318144L, 98698);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      d.oqe.a(111L, paramInt2 + 40, 1L, true);
      d.oqe.a(111L, 253L, 1L, false);
      w.i("MicroMsg.NetSceneSendMsg", "mark all failed. onGYNetEnd. errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      Jz();
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      paramInt1 = 0;
      while (paramInt1 < this.gMB.size())
      {
        gC(paramInt1);
        paramInt1 += 1;
      }
      w.d("MicroMsg.NetSceneSendMsg", "send fail, continue send SENDING msg");
      kA(paramString);
      GMTrace.o(13247021318144L, 98698);
      return;
    }
    paramq = ((bbs)this.fUa.gtD.gtK).jhd;
    paramArrayOfByte = new ArrayList();
    if (this.gMB.size() == paramq.size())
    {
      paramInt1 = 0;
      if (paramInt1 < paramq.size())
      {
        Object localObject = (aoe)paramq.get(paramInt1);
        if ((((aoe)localObject).tST != 0) || (r.hkQ))
        {
          d.oqe.a(111L, 252L, 1L, false);
          if ((((aoe)localObject).tST == -49) || (r.hkQ))
          {
            w.i("MicroMsg.NetSceneSendMsg", "summerdktext send msg failed: item ret code[%d], index[%d], testVerifyPsw[%b], retryVerifyCount[%d]", new Object[] { Integer.valueOf(((aoe)localObject).tST), Integer.valueOf(paramInt1), Boolean.valueOf(r.hkQ), Integer.valueOf(this.gMC) });
            if (this.gMD)
            {
              localObject = (au)this.gMB.get(paramInt1);
              this.gME.add(localObject);
            }
            for (;;)
            {
              paramInt1 += 1;
              break;
              if (this.gMC < 0)
              {
                gD(paramInt1);
                this.fUd.a(4, ((aoe)localObject).tST, paramString, this);
                gC(paramInt1);
                GMTrace.o(13247021318144L, 98698);
                return;
              }
              this.gMD = true;
              this.gMC -= 1;
              localObject = (au)this.gMB.get(paramInt1);
              this.gME.add(localObject);
              com.tencent.mm.kernel.h.xB().A(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(13245410705408L, 98686);
                  new aj(5, "", "", "", "", false, 1, false).a(j.a(j.this), new com.tencent.mm.ad.e()
                  {
                    public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
                    {
                      GMTrace.i(13245142269952L, 98684);
                      paramAnonymous2k.guc = true;
                      w.i("MicroMsg.NetSceneSendMsg", "summerdktext verifypsw onSceneEnd[%d, %d] needVerifyPswList size[%d] errMsg[%s] verifyingPsw[%b], retryVerifyCount[%d]", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(j.this.gME.size()), paramAnonymous2String, Boolean.valueOf(j.this.gMD), Integer.valueOf(j.this.gMC) });
                      if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
                      {
                        j.this.gME.clear();
                        j.this.kA(paramAnonymous2String);
                      }
                      for (;;)
                      {
                        j.this.gMD = false;
                        r.hkQ = false;
                        GMTrace.o(13245142269952L, 98684);
                        return;
                        paramAnonymous2String = j.this.gME;
                        paramAnonymous2Int1 = 0;
                        while (paramAnonymous2Int1 < paramAnonymous2String.size())
                        {
                          j.r((au)paramAnonymous2String.get(paramAnonymous2Int1));
                          paramAnonymous2Int1 += 1;
                        }
                        j.this.fUd.a(4, -49, j.1.this.gMH, j.this);
                        paramAnonymous2String = j.this.gME;
                        paramAnonymous2Int1 = 0;
                        while (paramAnonymous2Int1 < paramAnonymous2String.size())
                        {
                          j.q((au)paramAnonymous2String.get(paramAnonymous2Int1));
                          paramAnonymous2Int1 += 1;
                        }
                        j.this.gME.clear();
                      }
                    }
                  });
                  GMTrace.o(13245410705408L, 98686);
                }
              });
            }
          }
          gD(paramInt1);
          this.fUd.a(4, ((aoe)localObject).tST, paramString, this);
          gC(paramInt1);
          GMTrace.o(13247021318144L, 98698);
          return;
        }
        long l = ((au)this.gMB.get(paramInt1)).field_msgId;
        w.i("MicroMsg.NetSceneSendMsg", "msg local id = " + l + ", SvrId = " + ((aoe)localObject).tQd + " sent successfully!");
        au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(l);
        localau.D(((aoe)localObject).tQd);
        w.d("MicroMsg.NetSceneSendMsg", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(((aoe)localObject).tQd), Integer.valueOf(r.hkk) });
        if ((10007 == r.hkj) && (r.hkk != 0))
        {
          localau.D(r.hkk);
          r.hkk = 0;
        }
        localau.dB(2);
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(l, localau);
        if (this.gMB == null) {
          w.e("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent, sendingList is null");
        }
        for (;;)
        {
          paramArrayOfByte.add(Integer.valueOf(paramInt1));
          if (1 != ((aoe)localObject).jib) {
            break;
          }
          d.oqe.a(11942, true, false, new Object[] { Long.valueOf(((aoe)localObject).tQd) });
          d.oqe.a(11945, false, true, new Object[] { Long.valueOf(((aoe)localObject).tQd) });
          d.oqe.a(11946, false, false, new Object[] { Long.valueOf(((aoe)localObject).tQd) });
          d.oqe.a(90L, 0L, 1L, false);
          d.oqe.a(90L, 1L, 1L, true);
          break;
          if ((paramInt1 >= this.gMB.size()) || (paramInt1 < 0))
          {
            w.e("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent, index:%d, sendingList.size:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(this.gMB.size()) });
          }
          else
          {
            l = ((au)this.gMB.get(paramInt1)).field_msgId;
            w.d("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent for msgId:%d", new Object[] { Long.valueOf(l) });
            localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(l);
            oo localoo = new oo();
            localoo.eTB.eAH = localau;
            a.vgX.m(localoo);
          }
        }
      }
      w.i("MicroMsg.NetSceneSendMsg", "summerdktext total  [%d]msgs sent successfully, [%d]msgs need verifypsw", new Object[] { Integer.valueOf(paramInt1 - this.gME.size()), Integer.valueOf(this.gME.size()) });
    }
    w.d("MicroMsg.NetSceneSendMsg", "summerdktext send finish, continue send SENDING msg verifyingPsw[%b]", new Object[] { Boolean.valueOf(this.gMD) });
    if (this.gMD)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(13247021318144L, 98698);
      return;
    }
    kA(paramString);
    GMTrace.o(13247021318144L, 98698);
  }
  
  public final int getType()
  {
    GMTrace.i(13246618664960L, 98695);
    GMTrace.o(13246618664960L, 98695);
    return 522;
  }
  
  public final void kA(String paramString)
  {
    GMTrace.i(13247155535872L, 98699);
    w.d("MicroMsg.NetSceneSendMsg", "continue send msg in list");
    int i = a(this.gtW, this.fUd);
    if (i == -2)
    {
      this.fUd.a(0, 0, paramString, this);
      GMTrace.o(13247155535872L, 98699);
      return;
    }
    if (i < 0) {
      this.fUd.a(3, -1, paramString, this);
    }
    GMTrace.o(13247155535872L, 98699);
  }
  
  protected final int vB()
  {
    GMTrace.i(13246081794048L, 98691);
    GMTrace.o(13246081794048L, 98691);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */