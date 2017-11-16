package com.tencent.mm.storage;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.a.b;
import com.tencent.mm.af.a.j;
import com.tencent.mm.af.a.k;
import com.tencent.mm.af.f;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.biz.b.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.c;
import com.tencent.mm.plugin.messenger.foundation.a.e;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.be;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Iterator;

public final class p
  implements com.tencent.mm.plugin.messenger.foundation.a.d, e
{
  private as vpp;
  
  public p(as paramas)
  {
    GMTrace.i(1566186668032L, 11669);
    com.tencent.mm.af.x.FS();
    this.vpp = paramas;
    this.vpp.a(this);
    this.vpp.a(this);
    GMTrace.o(1566186668032L, 11669);
  }
  
  private void a(String paramString, ae paramae, int paramInt1, int paramInt2, c.c paramc)
  {
    GMTrace.i(1566723538944L, 11673);
    au localau;
    com.tencent.mm.af.a.a locala;
    com.tencent.mm.af.a.c localc;
    Object localObject1;
    Object localObject2;
    label393:
    Object localObject3;
    if ((paramae != null) && (paramc != null) && (paramc.juT != -1L) && (paramae.eH(8388608)))
    {
      localau = ((com.tencent.mm.af.o)com.tencent.mm.kernel.h.h(com.tencent.mm.af.o.class)).yN().af(paramString, paramc.juT);
      locala = com.tencent.mm.af.x.FJ().ab(paramc.juT);
      localc = com.tencent.mm.af.x.FI().t(paramc.juT);
      if (localc.field_bizChatServId == null)
      {
        w.w("MicroMsg.BizConversationStorage", "willen updateBizChatConversation bizChatInfo == null");
        GMTrace.o(1566723538944L, 11673);
        return;
      }
      if ((localau == null) || (localau.field_msgId == 0L))
      {
        w.i("MicroMsg.BizConversationStorage", "update null BizChatConversation with talker " + paramString);
        locala.field_status = 0;
        locala.field_isSend = 0;
        locala.field_content = "";
        locala.field_msgType = "0";
        locala.field_unReadCount = 0;
        locala.field_digest = "";
        locala.field_digestUser = "";
        com.tencent.mm.af.x.FJ();
        b.a(locala, paramInt2, paramInt1);
        com.tencent.mm.af.x.FJ().b(locala);
        GMTrace.o(1566723538944L, 11673);
        return;
      }
      boolean bool = localc.FU();
      locala.field_brandUserName = paramString;
      if (localau.bTB())
      {
        locala.field_content = localau.bTY();
        localObject1 = new PString();
        this.vpp.pC().a(localau, (PString)localObject1, new PString(), new PInt(), false);
        localObject1 = ((PString)localObject1).value;
        localObject2 = com.tencent.mm.af.x.FK().bl(localau.field_bizChatUserId);
        if (!bool) {
          break label938;
        }
        if ((localau.field_isSend != 1) || (localObject2 == null)) {
          break label866;
        }
        locala.field_digest = (ab.getContext().getString(b.b.cTv) + ":" + (String)localObject1);
        ((j)localObject2).field_userName = ab.getContext().getString(b.b.cTv);
        localObject1 = null;
        localObject2 = this.vpp.aG(localau.field_type, localau.field_content);
        localObject3 = bg.nl(locala.field_digest);
        if (!bg.nm((String)localObject2)) {
          break label951;
        }
        localObject2 = "";
        label436:
        locala.field_digest = ((String)localObject3).concat((String)localObject2);
        locala.field_digestUser = "";
        locala.field_chatType = localc.field_chatType;
        locala.field_lastMsgID = localau.field_msgId;
        if (!localau.bTH()) {
          break label977;
        }
      }
    }
    label490:
    label686:
    label771:
    label866:
    label938:
    label951:
    label977:
    label994:
    label1116:
    label1119:
    for (;;)
    {
      long l = localau.field_createTime;
      locala.field_lastMsgTime = l;
      locala.field_status = localau.field_status;
      locala.field_isSend = localau.field_isSend;
      locala.field_msgType = Integer.toString(localau.field_type);
      locala.field_flag = b.a(locala, 1, localau.field_createTime);
      int j = 0;
      int i;
      if ((!paramc.mUZ.equals("insert")) || (paramc.mVb <= 0))
      {
        i = j;
        if (paramc.mUZ.equals("update"))
        {
          i = j;
          if (locala.field_unReadCount + paramc.mVb < 0) {}
        }
      }
      else
      {
        locala.field_unReadCount += paramc.mVb;
        locala.field_newUnReadCount += paramc.mVb;
        i = j;
        if (paramc.mVb > 0)
        {
          i = j;
          if (localc.fN(1))
          {
            i = paramae.field_unReadCount - paramc.mVb;
            if (i > 0) {
              break label994;
            }
            paramae.dz(0);
            paramae.dG(paramae.field_unReadMuteCount + paramc.mVb);
            i = 1;
          }
        }
      }
      j = i;
      if (paramc.mUZ.equals("insert"))
      {
        j = i;
        if (paramc.mVa.size() > 0)
        {
          j = i;
          if (localc.FU())
          {
            localObject2 = com.tencent.mm.af.x.FK().bm(localau.field_talker);
            paramc = paramc.mVa.iterator();
            if (paramc.hasNext())
            {
              localObject3 = (au)paramc.next();
              if ((localObject2 == null) || (((ce)localObject3).field_isSend == 1) || (!((au)localObject3).bTF()) || (!((au)localObject3).Ug((String)localObject2))) {
                break label1116;
              }
              locala.field_atCount += 1;
              paramae.dF(paramae.field_atCount + 1);
              i = 1;
            }
          }
        }
      }
      for (;;)
      {
        break label771;
        locala.field_content = localau.field_content;
        break;
        if ((localObject2 != null) && (!bg.nm(((j)localObject2).field_userName)))
        {
          locala.field_digest = (((j)localObject2).field_userName + ":" + (String)localObject1);
          localObject1 = ((j)localObject2).field_userName;
          break label393;
        }
        locala.field_digest = ((String)localObject1);
        localObject1 = null;
        break label393;
        locala.field_digest = ((String)localObject1);
        localObject1 = null;
        break label393;
        localObject2 = " " + bg.nl((String)localObject2);
        break label436;
        if (localau.field_status != 1) {
          break label1119;
        }
        l = Long.MAX_VALUE;
        break label490;
        paramae.dz(i);
        break label686;
        j = i;
        com.tencent.mm.af.x.FJ();
        b.a(locala, paramInt2, paramInt1);
        paramc = (c.c)localObject1;
        if (bg.nm((String)localObject1)) {
          paramc = localc.fs(localau.field_bizChatUserId);
        }
        w.i("MicroMsg.BizConversationStorage", "updateBizChatConversation brandUserName:%s, bizChatId:%s, userId:%s, displayName:%s", new Object[] { paramString, localc.field_bizChatServId, localau.field_bizChatUserId, paramc });
        com.tencent.mm.af.x.FJ().b(locala);
        if (j != 0) {
          this.vpp.a(paramae, paramString);
        }
        GMTrace.o(1566723538944L, 11673);
        return;
      }
    }
  }
  
  public final void Tj(String paramString)
  {
    GMTrace.i(1566857756672L, 11674);
    if ((paramString == null) || (!s.fD(paramString)) || (!f.iP(paramString)))
    {
      GMTrace.o(1566857756672L, 11674);
      return;
    }
    ae localae = this.vpp.TO(paramString);
    if (localae == null)
    {
      GMTrace.o(1566857756672L, 11674);
      return;
    }
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TZ(paramString);
    localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ca((String)localObject);
    if ((localObject != null) && (((ce)localObject).field_msgId > 0L))
    {
      localae.ab((au)localObject);
      localae.setContent(((ce)localObject).field_talker + ":" + ((ce)localObject).field_content);
      localae.cN(Integer.toString(((ce)localObject).field_type));
      as.b localb = this.vpp.pC();
      if (localb == null) {
        break label289;
      }
      PString localPString1 = new PString();
      PString localPString2 = new PString();
      PInt localPInt = new PInt();
      ((au)localObject).db(paramString);
      ((au)localObject).setContent(localae.field_content);
      localb.a((au)localObject, localPString1, localPString2, localPInt, true);
      localae.cO(localPString1.value);
      localae.cP(localPString2.value);
      localae.dD(localPInt.value);
    }
    for (;;)
    {
      this.vpp.a(localae, localae.field_username);
      GMTrace.o(1566857756672L, 11674);
      return;
      label289:
      localae.bSW();
    }
  }
  
  public final void a(au paramau, ae paramae)
  {
    Object localObject = null;
    GMTrace.i(1566320885760L, 11670);
    if ((paramae != null) && (paramau != null) && (paramau.field_bizChatId != -1L) && (paramae.eH(8388608)))
    {
      com.tencent.mm.af.a.c localc = com.tencent.mm.af.x.FI().t(paramau.field_bizChatId);
      String str2 = paramae.field_digest;
      if (!bg.nm(paramau.field_bizChatUserId))
      {
        j localj = com.tencent.mm.af.x.FK().bl(paramau.field_bizChatUserId);
        String str1;
        boolean bool;
        if (localj != null)
        {
          str1 = localj.field_userName;
          bool = paramau.field_bizChatUserId.equals(com.tencent.mm.af.x.FK().bm(paramau.field_talker));
          if ((localj == null) || (!bool)) {
            break label225;
          }
          paramae.cO(ab.getContext().getString(b.b.cTv) + ":" + str2);
        }
        for (;;)
        {
          if (!localc.FU())
          {
            if ((!bool) && (str1 != null) && (str1.length() > 0) && (!str1.equals(localc.field_chatName)))
            {
              localc.field_chatName = str1;
              com.tencent.mm.af.x.FI().b(localc);
              GMTrace.o(1566320885760L, 11670);
              return;
              str1 = null;
              break;
              label225:
              if ((localj == null) || (bg.nm(localj.field_userName))) {
                continue;
              }
              paramae.cO(localj.field_userName + ":" + str2);
              continue;
            }
            paramae = com.tencent.mm.af.x.FK().bl(localc.field_bizChatServId);
            paramau = (au)localObject;
            if (paramae != null) {
              paramau = paramae.field_userName;
            }
            if ((paramau != null) && (paramau.length() > 0) && (!paramau.equals(localc.field_chatName)))
            {
              localc.field_chatName = paramau;
              com.tencent.mm.af.x.FI().b(localc);
            }
          }
        }
        GMTrace.o(1566320885760L, 11670);
        return;
      }
      w.w("MicroMsg.BizConversationStorage", "BizChatUserId is null:%s %s", new Object[] { localc.field_bizChatServId, localc.field_chatName });
    }
    GMTrace.o(1566320885760L, 11670);
  }
  
  public final void a(au paramau, ae paramae, boolean paramBoolean, c.c paramc)
  {
    GMTrace.i(1566455103488L, 11671);
    if (paramc == null)
    {
      w.e("MicroMsg.BizConversationStorage", "compose notifyInfo is null");
      GMTrace.o(1566455103488L, 11671);
      return;
    }
    String str = paramc.eDs;
    if (paramBoolean)
    {
      if ((paramau != null) && (paramau.field_isSend != 1) && ((be.k(paramau) & 0x1) != 0))
      {
        w.i("MicroMsg.BizConversationStorage", "create a temp session conversation.");
        paramae.eG(4194304);
      }
      if ((paramau != null) && (f.dL(str)))
      {
        w.i("MicroMsg.BizConversationStorage", "create a bitChat conversation.");
        paramae.eG(8388608);
      }
    }
    for (;;)
    {
      if ((paramc != null) && (!paramc.mVa.isEmpty()) && (paramc.mVa.get(0) != null))
      {
        paramae.dC(((au)paramc.mVa.get(0)).field_isSend);
        if (paramc.mUZ.equals("insert")) {
          paramae.vAo = ((au)paramc.mVa.get(paramc.mVa.size() - 1));
        }
      }
      GMTrace.o(1566455103488L, 11671);
      return;
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(str);
      if ((localx != null) && (localx.bSA()) && (!com.tencent.mm.l.a.eE(localx.field_type)) && (paramau != null) && (paramau.field_isSend != 1) && (!paramae.eH(4194304)) && ((paramae.field_conversationTime < com.tencent.mm.af.x.FS()) || ((be.k(paramau) & 0x1) != 0)))
      {
        paramae.eG(4194304);
        w.i("MicroMsg.BizConversationStorage", "onNotifyChange is old temp session, %s", new Object[] { str });
      }
      if ((paramau != null) && (f.dL(str)))
      {
        w.i("MicroMsg.BizConversationStorage", "onNotifyChange a bitChat conversation, %s", new Object[] { str });
        paramae.eG(8388608);
      }
    }
  }
  
  public final void b(au paramau, ae paramae, boolean paramBoolean, c.c paramc)
  {
    GMTrace.i(1566589321216L, 11672);
    as localas = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP();
    if (paramc == null)
    {
      paramau = null;
      if ((paramc == null) || (!paramc.mUZ.equals("delete")) || (paramc.mVd <= 0)) {
        break label896;
      }
    }
    label242:
    label491:
    label523:
    label620:
    label636:
    label662:
    label670:
    label896:
    for (int i = paramc.mVd;; i = 0)
    {
      if ((paramc != null) && (paramc.mUZ.equals("insert")) && (paramc.mVc > 0)) {}
      for (int j = paramc.mVc;; j = 0)
      {
        ae localae;
        Object localObject1;
        String str;
        if (!bg.nm(paramae.field_parentRef))
        {
          localae = localas.TO(paramae.field_parentRef);
          if ((localae == null) || (!localae.eH(2097152))) {
            break label670;
          }
          if (j > 0)
          {
            if (((paramc.mUZ.equals("insert")) && (paramc.mVb > 0)) || ((paramc.mUZ.equals("update")) && (localae.field_unReadCount + paramc.mVb >= 0)))
            {
              localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramau);
              if ((localObject1 == null) || (!((x)localObject1).vc())) {
                break label620;
              }
              localae.dG(localae.field_unReadMuteCount + j);
            }
            localas.a(paramae, i, j);
          }
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TZ(paramae.field_parentRef);
          Object localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ca((String)localObject1);
          if ((localObject2 == null) || (((ce)localObject2).field_msgId <= 0L)) {
            break label662;
          }
          localae.ab((au)localObject2);
          localae.setContent(((ce)localObject2).field_talker + ":" + ((ce)localObject2).field_content);
          localae.cN(Integer.toString(((ce)localObject2).field_type));
          if (localas.pC() != null)
          {
            localObject1 = new PString();
            PString localPString = new PString();
            PInt localPInt = new PInt();
            ((au)localObject2).db(paramae.field_parentRef);
            ((au)localObject2).setContent(localae.field_content);
            localas.pC().a((au)localObject2, (PString)localObject1, localPString, localPInt, true);
            str = localas.aG(((ce)localObject2).field_type, ((ce)localObject2).field_content);
            localObject2 = bg.nl(((PString)localObject1).value);
            if (!bg.nm(str)) {
              break label636;
            }
            localObject1 = "";
            localae.cO(((String)localObject2).concat((String)localObject1));
            localae.cP(localPString.value);
            localae.dD(localPInt.value);
          }
          if (localas.a(localae, paramae.field_parentRef) > 0)
          {
            w.d("MicroMsg.BizConversationStorage", "hakon update parent conversation's unread %s, %d", new Object[] { paramae.field_parentRef, Integer.valueOf(localae.field_unReadCount + j) });
            localas.b(3, (m)localas, paramae.field_parentRef);
          }
        }
        for (;;)
        {
          a(paramau, paramae, j, i, paramc);
          GMTrace.o(1566589321216L, 11672);
          return;
          paramau = paramc.eDs;
          break;
          localae.dz(localae.field_unReadCount + j);
          break label242;
          localObject1 = " " + bg.nl(str);
          break label491;
          localae.bSW();
          break label523;
          if ((localae != null) && ("officialaccounts".equals(localae.field_username)))
          {
            if ((j > 0) && (((paramc.mUZ.equals("insert")) && (paramc.mVb > 0)) || ((paramc.mUZ.equals("update")) && (localae.field_unReadCount + paramc.mVb >= 0))))
            {
              localae.dz(localae.field_unReadCount + j);
              localas.a(localae, paramae.field_parentRef);
            }
          }
          else if ((localae != null) && ("appbrandcustomerservicemsg".equals(localae.field_username)) && (j > 0))
          {
            if (((paramc.mUZ.equals("insert")) && (paramc.mVb > 0)) || ((paramc.mUZ.equals("update")) && (localae.field_unReadCount + paramc.mVb >= 0))) {
              localae.dz(localae.field_unReadCount + j);
            }
            localas.a(paramae, i, j);
            localas.a(localae, paramae.field_parentRef);
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */