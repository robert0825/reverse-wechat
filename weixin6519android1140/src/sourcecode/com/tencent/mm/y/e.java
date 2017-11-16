package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.bz.a.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;

public class e
  implements d
{
  private static final a gmf;
  
  static
  {
    GMTrace.i(13291447386112L, 99029);
    gmf = new a();
    GMTrace.o(13291447386112L, 99029);
  }
  
  public e()
  {
    GMTrace.i(13290776297472L, 99024);
    GMTrace.o(13290776297472L, 99024);
  }
  
  public static void a(com.tencent.mm.plugin.messenger.foundation.a.a parama)
  {
    GMTrace.i(13290910515200L, 99025);
    gmf.bT(parama);
    GMTrace.o(13290910515200L, 99025);
  }
  
  public au a(bu parambu, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(13291178950656L, 99027);
    if (paramString3.equals(paramString1)) {}
    for (paramString3 = paramString2;; paramString3 = paramString1)
    {
      au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().B(paramString3, parambu.tQd);
      w.i("MicroMsg.BaseMsgExtension", "summerbadcr dkmsgid prepareMsgInfo svrid:%d localid:%d  from:%s to:%s talker:%s", new Object[] { Long.valueOf(parambu.tQd), Long.valueOf(localau.field_msgId), paramString1, paramString2, paramString3 });
      if ((localau.field_msgId != 0L) && (localau.field_createTime + 604800000L < bc.k(paramString3, parambu.nFd)))
      {
        w.w("MicroMsg.BaseMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(parambu.tQd), Long.valueOf(localau.field_msgId) });
        bc.S(localau.field_msgId);
        localau.C(0L);
      }
      paramString1 = localau;
      if (localau.field_msgId == 0L)
      {
        paramString1 = new au();
        paramString1.D(parambu.tQd);
        paramString1.E(bc.k(paramString3, parambu.nFd));
        paramString1.setType(parambu.lQc);
        paramString1.setContent(bg.SO(bg.nl(n.a(parambu.tPY))));
      }
      GMTrace.o(13291178950656L, 99027);
      return paramString1;
    }
  }
  
  public d.b b(d.a parama)
  {
    GMTrace.i(13291044732928L, 99026);
    Object localObject1 = parama.gtM;
    Object localObject3 = (String)com.tencent.mm.kernel.h.xy().xh().get(2, "");
    if (((String)localObject3).length() <= 0)
    {
      GMTrace.o(13291044732928L, 99026);
      return null;
    }
    Object localObject2 = n.a(((bu)localObject1).tPW);
    String str = n.a(((bu)localObject1).tPX);
    if ((bg.nl((String)localObject2).length() <= 0) || (bg.nl(str).length() <= 0))
    {
      w.e("MicroMsg.BaseMsgExtension", "neither from-user nor to-user can be empty");
      GMTrace.o(13291044732928L, 99026);
      return null;
    }
    au localau = a((bu)localObject1, (String)localObject2, str, (String)localObject3);
    if (localau == null)
    {
      GMTrace.o(13291044732928L, 99026);
      return null;
    }
    boolean bool;
    int i;
    if ((((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yS().has((String)localObject2)) || (((String)localObject3).equals(localObject2)))
    {
      bool = true;
      if (!bool) {
        break label410;
      }
      localau.dC(1);
      localau.db(str);
      i = ((bu)localObject1).jhA;
      label195:
      localau.dB(i);
      if (((bu)localObject1).lQc == 10000) {
        localau.dB(4);
      }
      localau.dh(((bu)localObject1).tQb);
      if (localau.Ug(q.zE()))
      {
        localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(localau.field_talker);
        if (localObject3 != null)
        {
          ((ae)localObject3).vo();
          ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().a((ae)localObject3, localau.field_talker);
        }
      }
      gmf.a(parama, localau, (String)localObject2, str, bool);
      if (localau.field_msgId != 0L) {
        break label446;
      }
      bc.a(localau, parama);
      localau.C(bc.i(localau));
      localObject2 = new d.b(localau, true);
      localObject1 = localObject2;
      if (!parama.gtN) {
        bd.d(localau.field_talker, parama.gtM.tQd, parama.gtM.nFd * 1000L);
      }
    }
    for (localObject1 = localObject2;; localObject1 = new d.b(localau, false))
    {
      GMTrace.o(13291044732928L, 99026);
      return (d.b)localObject1;
      bool = false;
      break;
      label410:
      localau.dC(0);
      localau.db((String)localObject2);
      if (((bu)localObject1).jhA > 3)
      {
        i = ((bu)localObject1).jhA;
        break label195;
      }
      i = 3;
      break label195;
      label446:
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().b(((bu)localObject1).tQd, localau);
    }
  }
  
  public void h(au paramau)
  {
    GMTrace.i(13291313168384L, 99028);
    GMTrace.o(13291313168384L, 99028);
  }
  
  private static final class a
    extends com.tencent.mm.bz.a<com.tencent.mm.plugin.messenger.foundation.a.a>
    implements com.tencent.mm.plugin.messenger.foundation.a.a
  {
    public a()
    {
      GMTrace.i(13290373644288L, 99021);
      GMTrace.o(13290373644288L, 99021);
    }
    
    public final void a(final d.a parama, final au paramau, final String paramString1, final String paramString2, final boolean paramBoolean)
    {
      GMTrace.i(13290507862016L, 99022);
      a(new a.a() {});
      GMTrace.o(13290507862016L, 99022);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */