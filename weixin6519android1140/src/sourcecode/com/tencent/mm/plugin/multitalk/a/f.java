package com.tencent.mm.plugin.multitalk.a;

import android.content.Context;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.as.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.multitalk.b.a;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.bb;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.d;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class f
{
  private Map<String, Long> nmL;
  
  public f()
  {
    GMTrace.i(4770769141760L, 35545);
    this.nmL = new ConcurrentHashMap();
    GMTrace.o(4770769141760L, 35545);
  }
  
  final void a(String paramString, d.a parama)
  {
    GMTrace.i(4770903359488L, 35546);
    String str = n.a(parama.gtM.tPY);
    paramString = Base64.decode(paramString.getBytes(), 0);
    w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive banner msg:" + str + " buffer len " + paramString.length);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    a.av[] arrayOfav;
    int m;
    int i;
    int j;
    label343:
    int k;
    int n;
    for (;;)
    {
      try
      {
        localObject1 = (a.bb)com.google.a.a.e.a(new a.bb(), paramString, paramString.length);
        if (localObject1 == null)
        {
          w.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parse  bannerinfo  is null! xml:" + str);
          GMTrace.o(4770903359488L, 35546);
          return;
        }
        if ((this.nmL.get(((a.bb)localObject1).groupId) == null) || (((Long)this.nmL.get(((a.bb)localObject1).groupId)).longValue() < ((a.bb)localObject1).xOl))
        {
          this.nmL.put(((a.bb)localObject1).groupId, Long.valueOf(((a.bb)localObject1).xOl));
          parama = parama.gtM;
          paramString = n.a(parama.tPW);
          parama = n.a(parama.tPX);
          at.AR();
          localObject2 = (String)com.tencent.mm.y.c.xh().get(2, null);
          if (localObject2 == null)
          {
            w.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "userName is null");
            GMTrace.o(4770903359488L, 35546);
          }
        }
        else
        {
          w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "msg for this groupId : " + ((a.bb)localObject1).groupId + " is early than last msg, so we do not process,now return.");
          GMTrace.o(4770903359488L, 35546);
          return;
        }
        if (!((String)localObject2).equals(paramString)) {
          break label1562;
        }
        paramString = parama;
        localObject3 = ((a.bb)localObject1).xOj;
        if (((a.bb)localObject1).xOi != 1) {
          break;
        }
        w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get WxVoiceBannerBegin,show bar!");
        localObject4 = ((a.bb)localObject1).xOk;
        arrayOfav = ((a.bb)localObject1).xMu;
        m = arrayOfav.length;
        i = 0;
        parama = "";
        j = 0;
        if (j < m)
        {
          a.av localav = arrayOfav[j];
          parama = parama + localav.xMH + ",";
          k = i;
          if (localav.xMH == null) {
            break label1550;
          }
          k = i;
          if (!localav.xMH.equals(localObject2)) {
            break label1550;
          }
          w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "in voiceGroupMem!");
          k = 1;
          break label1550;
        }
        w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "memberUserNames :" + parama);
        m = 0;
        n = localObject4.length;
        j = 0;
        k = m;
        if (j < n)
        {
          parama = localObject4[j];
          if ((parama != null) && (parama.equals(localObject2)))
          {
            w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "isInvitedNotFriend true! In invitelist and with talk creator is not friend!");
            k = 1;
          }
        }
        else
        {
          if (i != 0) {
            break label638;
          }
          o.aRT().Db(paramString);
          o.aRT().aRD().remove(paramString);
          if (!((String)localObject2).equals(localObject3)) {
            break label670;
          }
          o.aRR().b(paramString, (String)localObject3, false, false);
          o.aRT().a(paramString, (a.bb)localObject1);
          o.aRQ().nlX.aQ(bg.e((Integer)at.AP().get(1)), q.zE());
          GMTrace.o(4770903359488L, 35546);
          return;
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parse  bannerinfo  failure! xml:" + str, new Object[] { paramString.getMessage() });
        GMTrace.o(4770903359488L, 35546);
        return;
      }
      j += 1;
      continue;
      label638:
      if ((!o.aRT().aRD().contains(paramString)) && (k != 0))
      {
        o.aRT().aRD().add(paramString);
        continue;
        label670:
        if ((i != 0) && (k == 0)) {
          o.aRR().b(paramString, (String)localObject3, false, false);
        } else if ((i != 0) && (k != 0)) {
          o.aRR().b(paramString, (String)localObject3, true, true);
        } else {
          o.aRR().b(paramString, (String)localObject3, true, false);
        }
      }
    }
    if (((a.bb)localObject1).xOi == 2)
    {
      w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "WxVoiceBannerMemChange!2,member size : " + ((a.bb)localObject1).xMu.length);
      localObject3 = ((a.bb)localObject1).xOk;
      localObject4 = ((a.bb)localObject1).xMu;
      m = localObject4.length;
      i = 0;
      parama = "";
      j = 0;
      label793:
      if (j < m)
      {
        arrayOfav = localObject4[j];
        parama = parama + arrayOfav.xMH + ",";
        k = i;
        if (arrayOfav.xMH != null)
        {
          k = i;
          if (arrayOfav.xMH.equals(localObject2))
          {
            w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "in voiceGroupMem!");
            k = 1;
          }
        }
      }
      else
      {
        w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "memberUserNames :" + parama);
        m = 0;
        n = localObject3.length;
        j = 0;
        label907:
        k = m;
        if (j < n)
        {
          parama = localObject3[j];
          if ((parama == null) || (!parama.equals(localObject2))) {
            break label1577;
          }
          w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "isInvitedNotFriend true! In invitelist and with talk creator is not friend!");
          k = 1;
        }
        if (i == 0)
        {
          if ((!o.aRT().Dc(paramString)) && (o.aRT().aRD().contains(paramString)) && (o.aRT().cX(paramString, (String)localObject2)))
          {
            o.aRR();
            e.CP(paramString);
          }
          o.aRT().Db(paramString);
          o.aRT().aRD().remove(paramString);
        }
        for (;;)
        {
          parama = o.aRT();
          w.i("MicroMsg.MultiTalkRoomListMsg", "updateBanner  wxGroupId = %s", new Object[] { paramString });
          localObject2 = o.aRN().De(paramString);
          if (localObject2 == null) {
            break label1183;
          }
          if (((b)localObject2).field_roomId == ((a.bb)localObject1).qGO) {
            break;
          }
          w.i("MicroMsg.MultiTalkRoomListMsg", "roomid has changed! now return!multiTalkInfo.field_roomId:" + ((b)localObject2).field_roomId + "bannerinfo.roomid:" + ((a.bb)localObject1).qGO);
          GMTrace.o(4770903359488L, 35546);
          return;
          if ((!o.aRT().aRD().contains(paramString)) && (k != 0)) {
            o.aRT().aRD().add(paramString);
          }
        }
        if (!g.c(paramString, (a.bb)localObject1))
        {
          w.e("MicroMsg.MultiTalkRoomListMsg", "update multiTalkMember failure!");
          GMTrace.o(4770903359488L, 35546);
          return;
        }
        parama.Dd(paramString);
        GMTrace.o(4770903359488L, 35546);
        return;
        label1183:
        w.i("MicroMsg.MultiTalkRoomListMsg", "change,still show banner.");
        parama.a(paramString, (a.bb)localObject1);
        GMTrace.o(4770903359488L, 35546);
      }
    }
    else
    {
      if (((a.bb)localObject1).xOi == 0)
      {
        w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get WxVoiceBannerEnd,dismiss bar!");
        if ((!o.aRT().Dc(paramString)) && (o.aRT().aRD().contains(paramString)) && (o.aRT().cX(paramString, (String)localObject2)))
        {
          o.aRR();
          e.CP(paramString);
        }
        parama = o.aRR();
        localObject1 = new au();
        ((au)localObject1).setType(64);
        ((au)localObject1).E(System.currentTimeMillis());
        ((au)localObject1).dB(6);
        ((au)localObject1).setContent(ab.getContext().getString(R.l.dKj));
        if (m.fc(paramString))
        {
          ((au)localObject1).db(paramString);
          ((au)localObject1).setContent(((ce)localObject1).field_content);
          at.AR();
          com.tencent.mm.y.c.yM().P((au)localObject1);
        }
        if ((parama.nmA != null) && (paramString.equals(parama.nmA.xOz)) && (!parama.nmC.bQn()))
        {
          w.i("MicroMsg.MT.MultiTalkManager", "multiTalkGroupTmp wxGroupId equals this wxGroupId.");
          parama.nmA = null;
          parama.nmB = 0L;
          parama.nmC.stopTimer();
        }
        o.aRT().Da(paramString);
        o.aRT().Db(paramString);
        o.aRT().aRD().remove(paramString);
        GMTrace.o(4770903359488L, 35546);
        return;
      }
      if (((a.bb)localObject1).xOi == 3)
      {
        paramString = ((a.bb)localObject1).xMu;
        j = paramString.length;
        i = 0;
      }
    }
    for (;;)
    {
      if (i < j)
      {
        parama = paramString[i];
        if ((parama.xMH != null) && (parama.xMH.equals(localObject2))) {
          w.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "wxVoiceBannerWaitTimeOut in voiceGroupMem!");
        }
      }
      else
      {
        GMTrace.o(4770903359488L, 35546);
        return;
        w.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get bannerinfo voicestatus is invalidate!: voicestatus:" + ((a.bb)localObject1).xOi);
        GMTrace.o(4770903359488L, 35546);
        return;
        label1550:
        j += 1;
        i = k;
        break label343;
        label1562:
        break;
        j += 1;
        i = k;
        break label793;
        label1577:
        j += 1;
        break label907;
      }
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */