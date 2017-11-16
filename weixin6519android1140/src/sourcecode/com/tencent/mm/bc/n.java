package com.tencent.mm.bc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.g.a.io;
import com.tencent.mm.g.a.lz;
import com.tencent.mm.g.b.af;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;

public final class n
  implements d
{
  public n()
  {
    GMTrace.i(1412910022656L, 10527);
    GMTrace.o(1412910022656L, 10527);
  }
  
  public final d.b b(final d.a parama)
  {
    GMTrace.i(1413044240384L, 10528);
    Object localObject2 = parama.gtM;
    String str = com.tencent.mm.platformtools.n.a(((bu)localObject2).tPW);
    if ((!"fmessage".equals(str)) && (((bu)localObject2).lQc != 37))
    {
      GMTrace.o(1413044240384L, 10528);
      return null;
    }
    Object localObject1 = com.tencent.mm.platformtools.n.a(((bu)localObject2).tPY);
    parama = au.d.Uk((String)localObject1);
    Object localObject3 = q.zE();
    if ((parama.rAP != null) && (parama.rAP.equals(localObject3)))
    {
      w.d("MicroMsg.VerifyMessageExtension", "onPreAddMessage, verify scene:%d, content:%s", new Object[] { Integer.valueOf(parama.scene), localObject1 });
      w.e("MicroMsg.VerifyMessageExtension", "fromUserName is self, simply drop this msg");
      GMTrace.o(1413044240384L, 10528);
      return null;
    }
    localObject3 = new h();
    ((h)localObject3).username = parama.rAP;
    ((h)localObject3).fiZ = 3;
    ((h)localObject3).bi(true);
    ((h)localObject3).eQl = -1;
    ((h)localObject3).gsU = parama.vBu;
    ((h)localObject3).gsT = parama.vBv;
    w.d("MicroMsg.VerifyMessageExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { parama.rAP, ((h)localObject3).Do(), ((h)localObject3).Dp() });
    com.tencent.mm.ac.n.Di().a((h)localObject3);
    if (!bg.nm(parama.rAP))
    {
      if (parama.scene == 18)
      {
        l.MM().a((bu)localObject2, parama);
        at.AR();
        com.tencent.mm.y.c.xh().set(73729, Integer.valueOf(1));
        at.AR();
        localObject1 = com.tencent.mm.y.c.yK().TE(parama.vBE);
        if ((localObject1 == null) || ((int)((com.tencent.mm.l.a)localObject1).fTq <= 0)) {
          ak.a.gmX.a(parama.vBE, null, new ak.b.a()
          {
            public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
            {
              GMTrace.i(1416265465856L, 10552);
              at.AR();
              w.d("MicroMsg.VerifyMessageExtension", String.valueOf(com.tencent.mm.y.c.yK().TE(parama.vBE)));
              paramAnonymousString = new io();
              paramAnonymousString.eLZ.eMa = parama.vBE;
              paramAnonymousString.eLZ.type = 1;
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousString);
              GMTrace.o(1416265465856L, 10552);
            }
          });
        }
        for (;;)
        {
          GMTrace.o(1413044240384L, 10528);
          return null;
          localObject2 = ((af)localObject1).field_username;
          if ((localObject2 != null) && (!s.fB((String)localObject2)))
          {
            ((x)localObject1).setUsername(parama.vBE);
            ((x)localObject1).cr(null);
            at.AR();
            com.tencent.mm.y.c.yK().a((String)localObject2, (x)localObject1);
          }
          localObject1 = new io();
          ((io)localObject1).eLZ.eMa = parama.vBE;
          ((io)localObject1).eLZ.type = 1;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        }
      }
      if (bc.fv(parama.scene))
      {
        l.MN().a((bu)localObject2, parama);
        at.AR();
        com.tencent.mm.y.c.xh().set(73730, Integer.valueOf(1));
        GMTrace.o(1413044240384L, 10528);
        return null;
      }
      if (parama.scene == 48)
      {
        localObject3 = new lz();
        ((lz)localObject3).eQF.eQH = ((String)localObject1);
        ((lz)localObject3).eQF.eDs = parama.rAP;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
      }
    }
    localObject1 = new f();
    ((f)localObject1).field_createTime = e.k(str, ((bu)localObject2).nFd);
    int i;
    if (((bu)localObject2).jhA == 4)
    {
      i = 2;
      ((f)localObject1).field_isSend = (i + 0);
      ((f)localObject1).field_msgContent = com.tencent.mm.platformtools.n.a(((bu)localObject2).tPY);
      ((f)localObject1).field_svrId = ((bu)localObject2).tQd;
      ((f)localObject1).field_talker = parama.rAP;
      at.AR();
      localObject2 = com.tencent.mm.y.c.yK().TE(parama.chatroomName);
      if ((localObject2 != null) && ((int)((com.tencent.mm.l.a)localObject2).fTq != -1)) {
        ((f)localObject1).field_chatroomName = parama.chatroomName;
      }
      switch (parama.eHJ)
      {
      case 3: 
      case 4: 
      default: 
        ((f)localObject1).field_type = 1;
        label677:
        if (!bg.nm(parama.vBE))
        {
          ((f)localObject1).field_encryptTalker = parama.vBE;
          if (l.ML().lL(parama.vBE) != null)
          {
            parama = l.MK();
            localObject2 = ((f)localObject1).field_encryptTalker;
            str = ((f)localObject1).field_talker;
            localObject2 = "update fmessage_msginfo set talker = '" + bg.nk(str) + "'  where talker = '" + bg.nk((String)localObject2) + "'";
            parama.fTZ.eZ("fmessage_msginfo", (String)localObject2);
            l.ML().d(0L, ((f)localObject1).field_encryptTalker);
          }
          l.MK().a((f)localObject1);
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(1413044240384L, 10528);
      return null;
      i = 0;
      break;
      ((f)localObject1).field_type = 1;
      break label677;
      ((f)localObject1).field_type = 2;
      break label677;
      ((f)localObject1).field_type = 3;
      break label677;
      w.e("MicroMsg.VerifyMessageExtension", "it should not go in here");
      parama = l.ML().lM(((f)localObject1).field_talker);
      if (parama != null)
      {
        ((f)localObject1).field_encryptTalker = parama.field_talker;
        ((f)localObject1).field_talker = parama.field_talker;
      }
      l.MK().a((f)localObject1);
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(1413178458112L, 10529);
    GMTrace.o(1413178458112L, 10529);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */