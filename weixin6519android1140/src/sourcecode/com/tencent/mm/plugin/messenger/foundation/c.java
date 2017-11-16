package com.tencent.mm.plugin.messenger.foundation;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.ap.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.ox;
import com.tencent.mm.protocal.c.pd;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import java.util.List;

public final class c
  implements p
{
  public c()
  {
    GMTrace.i(13236954988544L, 98623);
    GMTrace.o(13236954988544L, 98623);
  }
  
  public static void a(d.a parama, com.tencent.mm.plugin.messenger.foundation.a.r paramr)
  {
    GMTrace.i(13237223424000L, 98625);
    bu localbu = parama.gtM;
    if ((10008 == com.tencent.mm.platformtools.r.hkj) && (com.tencent.mm.platformtools.r.hkk != 0))
    {
      w.i("MicroMsg.MessageSyncExtension", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(localbu.tQd), Integer.valueOf(com.tencent.mm.platformtools.r.hkk) });
      localbu.tQd = Long.valueOf(com.tencent.mm.platformtools.r.hkk).longValue();
      com.tencent.mm.platformtools.r.hkk = 0;
    }
    if (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cO(localbu.tQd))
    {
      w.i("MicroMsg.MessageSyncExtension", "ignore, because reSync the deleted msg perhaps the IDC has change has swtiched");
      GMTrace.o(13237223424000L, 98625);
      return;
    }
    String str1 = n.a(localbu.tPW);
    Object localObject2 = n.a(localbu.tPX);
    if ((str1.equals(q.zE())) && (((String)localObject2).equals("newsapp")) && (localbu.lQc != 51))
    {
      w.w("MicroMsg.MessageSyncExtension", "msgid:%d type:%d this fucking msg from mac weixin ,someone send msg to newsapp at mac weixin ,givp up.", new Object[] { Long.valueOf(localbu.tQd), Integer.valueOf(localbu.lQc) });
      GMTrace.o(13237223424000L, 98625);
      return;
    }
    long l1 = localbu.tQd;
    int i = localbu.tPV;
    int j = localbu.tQe;
    int k = localbu.jhA;
    int m = localbu.lQc;
    int n = localbu.nFd;
    String str2 = bg.eK(localbu.nFd);
    long l2 = bg.Pu();
    long l3 = localbu.nFd;
    int i1 = localbu.tPZ;
    int i2 = n.a(localbu.tQa, new byte[0]).length;
    int i3 = bg.nl(localbu.tQb).length();
    int i4 = bg.nl(localbu.tQc).length();
    azq localazq = localbu.tPY;
    Object localObject1 = "";
    if (localazq == null)
    {
      w.i("MicroMsg.MessageSyncExtension", "dkAddMsg from:%s to:%s id:[%d,%d,%d] status:%d type:%d time:[%d %s] diff:%d imgstatus:%d imgbuf:%d src:%d push:%d content:%s", new Object[] { str1, localObject2, Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), str2, Long.valueOf(l2 - l3), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), bg.SJ((String)localObject1) });
      w.i("MicroMsg.MessageSyncExtension", "parseMsgSource  has been Deprecated  by dk. at 20151218 [%s] %s ", new Object[] { localbu.tQb, "" });
      com.tencent.mm.plugin.messenger.foundation.a.s.d(localbu);
      if (str1.equals("readerapp"))
      {
        localbu.tPW = n.ni("newsapp");
        localbu.lQc = 12399999;
      }
      if (((str1.equals("blogapp")) || (str1.equals("newsapp"))) && (localbu.lQc != 10002)) {
        localbu.lQc = 12399999;
      }
      if (localbu.lQc == 52) {
        localbu.lQc = 1000052;
      }
      if (localbu.lQc == 53) {
        localbu.lQc = 1000053;
      }
      if ((parama != null) && (parama.gtM != null)) {
        break label948;
      }
      label613:
      i = 0;
      localObject2 = d.c.aF(Integer.valueOf(localbu.lQc));
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = d.c.aF(str1);
      }
      if (localObject1 != null)
      {
        localObject2 = ((d)localObject1).b(parama);
        if (localObject2 != null) {
          break label1165;
        }
        localObject1 = null;
      }
    }
    for (;;)
    {
      if (localObject1 == null)
      {
        w.w("MicroMsg.MessageSyncExtension", "summerbadcr extension declared but skipped msg, type=%d, svrId=%d, MsgSeq=%d, createTime=%d, addMsgInfo=%s", new Object[] { Integer.valueOf(localbu.lQc), Long.valueOf(localbu.tQd), Integer.valueOf(localbu.tQe), Integer.valueOf(localbu.nFd), parama });
        if ((parama.gtN) && (parama.gtO))
        {
          parama = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().M(str1, localbu.tQe);
          if ((parama != null) && (parama.field_msgId != 0L))
          {
            i = parama.field_flag;
            w.i("MicroMsg.MessageSyncExtension", "summerbadcr extension declared but skipped msg and must revised fault id[%d], flag[%d], svrId[%d], msgseq[%d], createtime[%d], type[%d]", new Object[] { Long.valueOf(parama.field_msgId), Integer.valueOf(parama.field_flag), Long.valueOf(parama.field_msgSvrId), Long.valueOf(parama.field_msgSeq), Long.valueOf(parama.field_createTime), Integer.valueOf(parama.field_type) });
            parama.dL(i | 0x2 | 0x1);
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(parama.field_msgId, parama);
          }
        }
        else
        {
          i = 1;
          com.tencent.mm.plugin.messenger.foundation.a.s.a(5, localbu);
          if (i == 0) {
            w.f("MicroMsg.MessageSyncExtension", "unknown add msg request, type=%d. drop now !!!", new Object[] { Integer.valueOf(localbu.lQc) });
          }
          GMTrace.o(13237223424000L, 98625);
          return;
          localObject1 = localazq.uNR;
          break;
          label948:
          localObject1 = parama.gtM;
          localObject2 = n.a(((bu)localObject1).tPW);
          localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().B((String)localObject2, ((bu)localObject1).tQd);
          if ((((ce)localObject2).field_msgId == 0L) || ((((ce)localObject2).field_isSend != 0) && (((bu)localObject1).tQe == 0))) {
            break label613;
          }
          i = ((ce)localObject2).field_flag;
          if (parama.gtN)
          {
            i |= 0x2;
            label1034:
            if (!parama.gtO) {
              break label1149;
            }
            i |= 0x1;
            label1045:
            if (!parama.gtP) {
              break label1157;
            }
            i |= 0x4;
          }
          for (;;)
          {
            if (i == ((ce)localObject2).field_flag) {
              break label1163;
            }
            w.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr updateMsgFlagByAddMsgInfo msgType[%d], flag new[%d], old[%d]", new Object[] { Integer.valueOf(((bu)localObject1).lQc), Integer.valueOf(i), Integer.valueOf(((ce)localObject2).field_flag) });
            ((au)localObject2).dL(i);
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().b(((ce)localObject2).field_msgSvrId, (au)localObject2);
            break;
            i &= 0xFFFFFFFD;
            break label1034;
            label1149:
            i &= 0xFFFFFFFE;
            break label1045;
            label1157:
            i &= 0xFFFFFFFB;
          }
          label1163:
          break label613;
          label1165:
          localObject1 = ((d.b)localObject2).eAH;
          continue;
        }
        if (parama != null) {}
        for (l1 = parama.field_msgId;; l1 = -1L)
        {
          w.i("MicroMsg.MessageSyncExtension", "summerbadcr extension declared but skipped msg and must revised fault id failed[%d]", new Object[] { Long.valueOf(l1) });
          break;
        }
      }
    }
    if ((com.tencent.mm.y.s.fH(str1)) && (!b.Jw())) {}
    for (i = 1;; i = 0)
    {
      if (i == 0)
      {
        w.d("MicroMsg.MessageSyncExtension", " msg , id =" + ((ce)localObject1).field_msgId + "  " + paramr);
        if ((((ce)localObject1).field_msgId > 0L) && (paramr != null) && (((d.b)localObject2).gtQ)) {
          paramr.a((au)localObject1, localbu);
        }
      }
      i = 1;
      break;
    }
  }
  
  public final void a(nk paramnk, byte[] paramArrayOfByte, boolean paramBoolean, com.tencent.mm.plugin.messenger.foundation.a.r paramr)
  {
    GMTrace.i(13237089206272L, 98624);
    switch (paramnk.uei)
    {
    }
    for (;;)
    {
      GMTrace.o(13237089206272L, 98624);
      return;
      paramnk = (bu)new bu().aD(paramArrayOfByte);
      if (paramnk != null) {
        a(new d.a(paramnk, false, false, false), paramr);
      }
      GMTrace.o(13237089206272L, 98624);
      return;
      paramArrayOfByte = (ox)new ox().aD(paramArrayOfByte);
      paramnk = n.a(paramArrayOfByte.ufy);
      int i = paramArrayOfByte.ufC;
      paramArrayOfByte = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().bo(paramnk, i);
      if (paramArrayOfByte.moveToFirst()) {
        while (!paramArrayOfByte.isAfterLast())
        {
          paramr = new au();
          paramr.b(paramArrayOfByte);
          bc.j(paramr);
          paramArrayOfByte.moveToNext();
        }
      }
      paramArrayOfByte.close();
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().bn(paramnk, i);
      GMTrace.o(13237089206272L, 98624);
      return;
      paramnk = (pd)new pd().aD(paramArrayOfByte);
      paramArrayOfByte = paramnk.ufF;
      i = 0;
      while (i < paramArrayOfByte.size())
      {
        bc.l(n.a(paramnk.ufy), ((Integer)paramArrayOfByte.get(i)).intValue());
        i += 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\messenger\foundation\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */