package com.tencent.mm.plugin.bbom;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bc.h;
import com.tencent.mm.bc.i;
import com.tencent.mm.bc.l;
import com.tencent.mm.g.a.io;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;
import com.tencent.mm.y.s;
import java.util.Stack;

public final class b
  implements com.tencent.mm.plugin.messenger.foundation.a.a
{
  public b()
  {
    GMTrace.i(8020180336640L, 59755);
    GMTrace.o(8020180336640L, 59755);
  }
  
  public static void a(bu parambu, bc.b paramb, x paramx)
  {
    GMTrace.i(8020448772096L, 59757);
    String str1 = com.tencent.mm.platformtools.n.a(parambu.tPW);
    at.AR();
    com.tencent.mm.y.c.xh().set(73729, Integer.valueOf(1));
    String str2 = paramx.field_nickname;
    h localh = new h();
    localh.field_content = com.tencent.mm.platformtools.n.a(parambu.tPY);
    localh.field_createtime = bg.Pu();
    localh.field_imgpath = "";
    if (parambu.lQc == 3)
    {
      paramx = ab.getContext().getString(R.l.dLb);
      localh.field_sayhicontent = paramx;
      localh.field_sayhiuser = str1;
      localh.field_scene = 18;
      if (parambu.jhA <= 3) {
        break label233;
      }
    }
    label233:
    for (int i = parambu.jhA;; i = 3)
    {
      localh.field_status = i;
      localh.field_svrid = parambu.tQd;
      localh.field_talker = str2;
      localh.field_type = parambu.lQc;
      localh.field_isSend = 0;
      localh.field_sayhiencryptuser = str1;
      localh.field_ticket = paramb.gnU;
      l.MM().a(localh);
      parambu = new io();
      parambu.eLZ.eMa = str1;
      com.tencent.mm.sdk.b.a.vgX.m(parambu);
      GMTrace.o(8020448772096L, 59757);
      return;
      paramx = com.tencent.mm.platformtools.n.a(parambu.tPY);
      break;
    }
  }
  
  public final void a(final d.a parama, au arg2, final String paramString1, final String paramString2, boolean paramBoolean)
  {
    GMTrace.i(8020314554368L, 59756);
    parama = parama.gtM;
    paramString2 = bc.gT(parama.tQb);
    x localx;
    if (paramString2 != null)
    {
      ???.di(paramString2.gnT);
      ???.df(paramString2.gnS);
      w.i("MicroMsg.BaseMsgCallbackImpl", "bizClientMsgId = %s", new Object[] { paramString2.gnS });
      if ((paramString2.gnU != null) && (paramString2.scene == 1) && (parama.lQc != 10000))
      {
        at.AR();
        localx = com.tencent.mm.y.c.yK().TE(paramString1);
        if ((localx != null) && ((int)localx.fTq > 0)) {
          break label292;
        }
        ak.a.gmX.a(paramString1, null, new ak.b.a()
        {
          public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(8020046118912L, 59754);
            at.AR();
            paramAnonymousString = com.tencent.mm.y.c.yK().TE(paramString1);
            b.a(parama, paramString2, paramAnonymousString);
            GMTrace.o(8020046118912L, 59754);
          }
        });
      }
    }
    for (;;)
    {
      int i;
      label159:
      int j;
      long l;
      if ((s.fC(paramString1)) && (s.gr(paramString1)))
      {
        i = 1;
        if ((!s.eb(paramString1)) || (s.gq(paramString1))) {
          break label309;
        }
        j = 1;
        if ((!paramBoolean) && (???.bTC()) && (i == 0) && (j == 0))
        {
          com.tencent.mm.modelcontrol.c.Gs();
          if (com.tencent.mm.modelcontrol.c.l(???))
          {
            parama = com.tencent.mm.ao.n.Jb();
            l = ???.field_msgId;
            com.tencent.mm.modelcontrol.c.Gs();
            if (!com.tencent.mm.modelcontrol.c.Gt()) {}
          }
        }
      }
      synchronized (parama.gGm)
      {
        if (parama.gGm.size() >= 100) {
          parama.gGm.remove(0);
        }
        parama.gGm.push(Long.valueOf(l));
        parama.gGq = System.currentTimeMillis();
        parama.start();
        GMTrace.o(8020314554368L, 59756);
        return;
        label292:
        a(parama, paramString2, localx);
        continue;
        i = 0;
        break label159;
        label309:
        j = 0;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\bbom\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */