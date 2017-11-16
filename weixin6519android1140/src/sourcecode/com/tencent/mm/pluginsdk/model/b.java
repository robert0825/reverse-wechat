package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.bc.i;
import com.tencent.mm.bc.l;
import com.tencent.mm.g.a.io;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;

public final class b
  implements com.tencent.mm.ad.d
{
  public b()
  {
    GMTrace.i(761417170944L, 5673);
    GMTrace.o(761417170944L, 5673);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(761551388672L, 5674);
    bu localbu = parama.gtM;
    if ((localbu == null) || (localbu.lQc != 47))
    {
      w.f("MicroMsg.EmojiExtension", "parseEmojiMsg failed, invalid cmdAM");
      GMTrace.o(761551388672L, 5674);
      return null;
    }
    Object localObject1 = n.a(localbu.tPW);
    Object localObject2 = n.a(localbu.tPX);
    at.AR();
    if (((String)com.tencent.mm.y.c.xh().get(2, null)).equals(localObject1))
    {
      localObject1 = localObject2;
      localObject2 = n.a(localbu.tPY);
      ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a((String)localObject1, (String)localObject2, localbu.tQd, localbu.tQb, parama);
      localObject1 = bc.gT(localbu.tQb);
      if (localObject1 != null)
      {
        w.i("MicroMsg.EmojiExtension", "bizClientMsgId = %s", new Object[] { ((bc.b)localObject1).gnS });
        if ((((bc.b)localObject1).gnU != null) && (((bc.b)localObject1).scene == 1))
        {
          parama = n.a(localbu.tPW);
          at.AR();
          com.tencent.mm.y.c.xh().set(73729, Integer.valueOf(1));
          localObject2 = new com.tencent.mm.bc.h();
          ((com.tencent.mm.bc.h)localObject2).field_content = ab.getContext().getString(R.l.dLa);
          ((com.tencent.mm.bc.h)localObject2).field_createtime = bg.Pu();
          ((com.tencent.mm.bc.h)localObject2).field_imgpath = "";
          ((com.tencent.mm.bc.h)localObject2).field_sayhicontent = ((com.tencent.mm.bc.h)localObject2).field_content;
          ((com.tencent.mm.bc.h)localObject2).field_sayhiuser = parama;
          ((com.tencent.mm.bc.h)localObject2).field_scene = 18;
          if (localbu.jhA <= 3) {
            break label382;
          }
        }
      }
    }
    label382:
    for (int i = localbu.jhA;; i = 3)
    {
      ((com.tencent.mm.bc.h)localObject2).field_status = i;
      ((com.tencent.mm.bc.h)localObject2).field_svrid = localbu.tQd;
      ((com.tencent.mm.bc.h)localObject2).field_talker = parama;
      ((com.tencent.mm.bc.h)localObject2).field_type = localbu.lQc;
      ((com.tencent.mm.bc.h)localObject2).field_isSend = 0;
      ((com.tencent.mm.bc.h)localObject2).field_sayhiencryptuser = parama;
      ((com.tencent.mm.bc.h)localObject2).field_ticket = ((bc.b)localObject1).gnU;
      l.MM().a((com.tencent.mm.bc.h)localObject2);
      localObject1 = new io();
      ((io)localObject1).eLZ.eMa = parama;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      GMTrace.o(761551388672L, 5674);
      return null;
      break;
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(761685606400L, 5675);
    GMTrace.o(761685606400L, 5675);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */