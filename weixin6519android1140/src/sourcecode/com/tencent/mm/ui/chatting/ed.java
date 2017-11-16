package com.tencent.mm.ui.chatting;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.nn;
import com.tencent.mm.g.a.no;
import com.tencent.mm.g.a.ok;
import com.tencent.mm.g.a.om;
import com.tencent.mm.g.a.sa;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelmulti.j;
import com.tencent.mm.pluginsdk.model.app.am.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;

public final class ed
{
  public static void Z(au paramau)
  {
    GMTrace.i(2382364672000L, 17750);
    w.i("MicroMsg.ResendMsgLogic", "resendAppMsg, msgId:%d", new Object[] { Long.valueOf(paramau.field_msgId) });
    long l2 = bc.gR(paramau.field_talker);
    long l1 = l2;
    if (l2 == paramau.field_createTime) {
      l1 = l2 + 1L;
    }
    paramau.E(l1);
    at.AR();
    com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
    String str = paramau.field_content;
    int j = paramau.field_isSend;
    Object localObject = paramau.field_talker;
    int i;
    if ((s.fy((String)localObject)) || (m.fc((String)localObject)))
    {
      i = 1;
      localObject = str;
      if (i != 0)
      {
        localObject = str;
        if (str != null)
        {
          localObject = str;
          if (j == 0) {
            localObject = bc.gQ(str);
          }
        }
      }
      localObject = f.a.eS((String)localObject);
      if (((localObject == null) || (19 != ((f.a)localObject).type)) && ((localObject == null) || (24 != ((f.a)localObject).type))) {
        break label254;
      }
      localObject = new mn();
      ((mn)localObject).eRu.type = 4;
      ((mn)localObject).eRu.eRz = paramau;
      ((mn)localObject).eRu.toUser = paramau.field_talker;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    }
    for (;;)
    {
      bc.S(paramau.field_msgId);
      GMTrace.o(2382364672000L, 17750);
      return;
      i = 0;
      break;
      label254:
      l.Z(paramau);
    }
  }
  
  public static void aD(au paramau)
  {
    GMTrace.i(2382498889728L, 17751);
    w.i("MicroMsg.ResendMsgLogic", "resendTextMsg, msgId:%d", new Object[] { Long.valueOf(paramau.field_msgId) });
    aM(paramau);
    GMTrace.o(2382498889728L, 17751);
  }
  
  public static void aG(au paramau)
  {
    GMTrace.i(2381827801088L, 17746);
    w.i("MicroMsg.ResendMsgLogic", "resendVoiceMsg, msgId:%d", new Object[] { Long.valueOf(paramau.field_msgId) });
    if (s.fY(paramau.field_talker))
    {
      localObject = new no();
      ((no)localObject).eSE.eAH = paramau;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(2381827801088L, 17746);
      return;
    }
    Object localObject = new nn();
    ((nn)localObject).eSD.eAH = paramau;
    a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    GMTrace.o(2381827801088L, 17746);
  }
  
  public static void aH(au paramau)
  {
    GMTrace.i(2381962018816L, 17747);
    ok localok = new ok();
    long l2 = bc.gR(paramau.field_talker);
    w.i("MicroMsg.ResendMsgLogic", "resendMsgImage, msgId:%d, time[%d - > %d]", new Object[] { Long.valueOf(paramau.field_msgId), Long.valueOf(paramau.field_createTime), Long.valueOf(l2) });
    long l1 = l2;
    if (l2 == paramau.field_createTime) {
      l1 = l2 + 1L;
    }
    paramau.E(l1);
    at.AR();
    com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
    localok.eTw.eAH = paramau;
    a.vgX.m(localok);
    GMTrace.o(2381962018816L, 17747);
  }
  
  public static void aI(au paramau)
  {
    GMTrace.i(2382096236544L, 17748);
    w.i("MicroMsg.ResendMsgLogic", "resendEmoji, msgId:%d", new Object[] { Long.valueOf(paramau.field_msgId) });
    sa localsa = new sa();
    localsa.eWR.eAH = paramau;
    a.vgX.m(localsa);
    GMTrace.o(2382096236544L, 17748);
  }
  
  public static void aJ(au paramau)
  {
    GMTrace.i(2382230454272L, 17749);
    w.i("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, msgId:%d", new Object[] { Long.valueOf(paramau.field_msgId) });
    long l2 = bc.gR(paramau.field_talker);
    long l1 = l2;
    if (l2 == paramau.field_createTime) {
      l1 = l2 + 1L;
    }
    paramau.E(l1);
    at.AR();
    com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
    com.tencent.mm.pluginsdk.model.app.b localb = an.afP().eq(paramau.field_msgId);
    if ((localb != null) && (localb.field_msgInfoId == paramau.field_msgId))
    {
      w.d("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, upload app attach first");
      localb.field_status = 101L;
      localb.field_offset = 0L;
      localb.field_lastModifyTime = (System.currentTimeMillis() / 1000L);
      an.afP().c(localb, new String[0]);
      an.bJK().run();
      GMTrace.o(2382230454272L, 17749);
      return;
    }
    w.d("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, directly send app mag");
    an.bJK();
    am.a.ev(paramau.field_msgId);
    GMTrace.o(2382230454272L, 17749);
  }
  
  public static void aK(au paramau)
  {
    GMTrace.i(2382633107456L, 17752);
    w.i("MicroMsg.ResendMsgLogic", "resendLocation, msgId:%d", new Object[] { Long.valueOf(paramau.field_msgId) });
    aM(paramau);
    GMTrace.o(2382633107456L, 17752);
  }
  
  public static void aL(au paramau)
  {
    GMTrace.i(2382767325184L, 17753);
    w.i("MicroMsg.ResendMsgLogic", "resendCardMsg, msgId:%d", new Object[] { Long.valueOf(paramau.field_msgId) });
    aM(paramau);
    GMTrace.o(2382767325184L, 17753);
  }
  
  private static void aM(au paramau)
  {
    GMTrace.i(2382901542912L, 17754);
    long l = paramau.field_msgId;
    if (l == -1L)
    {
      w.e("MicroMsg.ResendMsgLogic", "sendMsgInternal failed msgId " + l);
      GMTrace.o(2382901542912L, 17754);
      return;
    }
    if ((paramau.field_talker.equals("medianote")) && ((q.zI() & 0x4000) == 0))
    {
      GMTrace.o(2382901542912L, 17754);
      return;
    }
    w.d("MicroMsg.ResendMsgLogic", "sendMsgInternal, start send msgId: %d", new Object[] { Long.valueOf(l) });
    Object localObject = new j(l);
    if (!at.wS().a((k)localObject, 0))
    {
      w.e("MicroMsg.ResendMsgLogic", "sendMsgInternal, doScene return false, directly mark msg to failed");
      paramau.dB(5);
      at.AR();
      com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
      localObject = new om();
      ((om)localObject).eTz.eAH = paramau;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    }
    GMTrace.o(2382901542912L, 17754);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */