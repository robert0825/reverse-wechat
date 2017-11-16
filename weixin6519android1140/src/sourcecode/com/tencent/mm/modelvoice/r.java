package com.tencent.mm.modelvoice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class r
  implements d
{
  private static Set<c> hev;
  
  static
  {
    GMTrace.i(572572827648L, 4266);
    hev = new HashSet();
    GMTrace.o(572572827648L, 4266);
  }
  
  public r()
  {
    GMTrace.i(571901739008L, 4261);
    GMTrace.o(571901739008L, 4261);
  }
  
  public static void b(c paramc)
  {
    GMTrace.i(572170174464L, 4263);
    hev.remove(paramc);
    GMTrace.o(572170174464L, 4263);
  }
  
  public static void c(c paramc)
  {
    GMTrace.i(572035956736L, 4262);
    if (!hev.contains(paramc)) {
      hev.add(paramc);
    }
    GMTrace.o(572035956736L, 4262);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(572304392192L, 4264);
    bu localbu = parama.gtM;
    if (localbu == null)
    {
      w.e("MicroMsg.VoiceMsgExtension", "onPreAddMessage cmdAM is null , give up.");
      GMTrace.o(572304392192L, 4264);
      return null;
    }
    w.i("MicroMsg.VoiceMsgExtension", "summerbadcr parseVoiceMsg srvId:" + localbu.tQd);
    Object localObject2 = n.a(localbu.tPW);
    if (((String)localObject2).equals(com.tencent.mm.y.q.zE())) {}
    for (Object localObject1 = n.a(localbu.tPX);; localObject1 = localObject2)
    {
      Object localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().B((String)localObject1, localbu.tQd);
      if ((((ce)localObject3).field_msgId != 0L) && (((ce)localObject3).field_createTime + 604800000L < bc.k((String)localObject1, localbu.nFd)))
      {
        w.w("MicroMsg.VoiceMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d", new Object[] { Long.valueOf(localbu.tQd) });
        bc.l((String)localObject1, localbu.tQd);
        localObject3 = m.NK().aE(localbu.tQd);
        if ((localObject3 != null) && (!bg.nm(((p)localObject3).euR))) {
          q.mQ(((p)localObject3).euR);
        }
      }
      final p localp = new p();
      localp.eQu = ((String)localObject1);
      localp.hcs = localbu.nFd;
      localp.eSf = localbu.tQd;
      localp.fwv = localbu.tQb;
      w.d("MicroMsg.VoiceMsgExtension", "voiceMsgExtension, onPreAddMessage.(MsgSource : %s)", new Object[] { localbu.tQb });
      localObject3 = n.a(localbu.tPY);
      if (s.eb((String)localObject2))
      {
        localObject2 = bc.gQ((String)localObject3);
        w.i("MicroMsg.VoiceMsgExtension", "chatroom voicemsg, new content=" + (String)localObject2);
      }
      for (;;)
      {
        localObject3 = bh.q((String)localObject2, "msg");
        if (localObject3 == null)
        {
          g.ork.a(111L, 227L, 1L, false);
          GMTrace.o(572304392192L, 4264);
          return null;
        }
        try
        {
          localp.hbc = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$length")).intValue();
          localp.clientId = ((String)((Map)localObject3).get(".msg.voicemsg.$clientmsgid"));
          i = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$endflag")).intValue();
          int j = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$cancelflag")).intValue();
          localp.hes = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$voicelength")).intValue();
          localp.hcn = ((String)((Map)localObject3).get(".msg.voicemsg.$fromusername"));
          localObject2 = (String)((Map)localObject3).get(".msg.commenturl");
          localp.hdr = Integer.valueOf(bg.aq((String)((Map)localObject3).get(".msg.voicemsg.$forwardflag"), "0")).intValue();
          localp.hdk = ((String)((Map)localObject3).get(".msg.voicemsg.$voiceformat"));
          localp.het = bg.getLong((String)((Map)localObject3).get(".msg.voicemsg.$bufid"), 0L);
          if (j == 1)
          {
            w.v("MicroMsg.VoiceMsgExtension", "cancelFlag = 1 srvId:" + localbu.tQd);
            parama = m.NK().aE(localp.eSf);
            if (parama != null) {
              q.mO(parama.euR);
            }
            GMTrace.o(572304392192L, 4264);
            return null;
          }
        }
        catch (Exception parama)
        {
          g.ork.a(111L, 227L, 1L, false);
          w.e("MicroMsg.VoiceMsgExtension", "parsing voice msg xml failed");
          w.e("MicroMsg.VoiceMsgExtension", "exception:%s", new Object[] { bg.f(parama) });
          GMTrace.o(572304392192L, 4264);
          return null;
        }
        if (i == 1)
        {
          w.v("MicroMsg.VoiceMsgExtension", "endFlag = 1 srvId:" + localbu.tQd);
          localp.gsL = localp.hbc;
        }
        localp.eQl = 284334;
        localObject3 = n.a(localbu.tQa);
        if (localObject3 != null) {
          w.d("MicroMsg.VoiceMsgExtension", "Voice Buf Len:" + localObject3.length + " srvId:" + localbu.tQd);
        }
        int i = q.a(localp, (byte[])localObject3, localbu.jhA, (String)localObject2, localbu.tQb, parama);
        if (i > 0)
        {
          w.i("MicroMsg.VoiceMsgExtension", "summerbadcr parseVoiceMsg setRecvSync[%d], svrId[%d], msgseq[%d]", new Object[] { Integer.valueOf(i), Long.valueOf(localbu.tQd), Integer.valueOf(localbu.tQe) });
          g.ork.a(111L, 228L, 1L, false);
          localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().B(localp.eQu, localp.eSf);
          ((au)localObject2).Aw(0);
          localObject3 = hev.iterator();
          for (;;)
          {
            parama = (d.a)localObject2;
            if (!((Iterator)localObject3).hasNext()) {
              break;
            }
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(564653981696L, 4207);
                this.hdp.z(((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().B(localp.eQu, localp.eSf));
                GMTrace.o(564653981696L, 4207);
              }
            });
          }
        }
        w.i("MicroMsg.VoiceMsgExtension", "summerbadcr parseVoiceMsg setRecvSync[%d], svrId[%d], msgseq[%d], stack[%s]", new Object[] { Integer.valueOf(i), Long.valueOf(localbu.tQd), Integer.valueOf(localbu.tQe), bg.bQW() });
        parama = null;
        if (parama != null)
        {
          localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO((String)localObject1);
          if (localObject2 != null)
          {
            ((ae)localObject2).vo();
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().a((ae)localObject2, (String)localObject1);
          }
        }
        if ((parama != null) && (parama.field_msgId > 0L)) {}
        for (boolean bool = true;; bool = false)
        {
          parama = new d.b(parama, bool);
          GMTrace.o(572304392192L, 4264);
          return parama;
        }
        localObject2 = localObject3;
      }
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(572438609920L, 4265);
    w.d("MicroMsg.VoiceMsgExtension", "onPreDelMessage " + paramau.field_imgPath + " " + paramau.field_talker);
    if (!s.fY(paramau.field_talker)) {
      q.mQ(paramau.field_imgPath);
    }
    GMTrace.o(572438609920L, 4265);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */