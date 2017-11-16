package com.tencent.mm.plugin.emoji.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.a;
import com.tencent.mm.y.bt.a;
import java.util.Map;

public final class e
  implements bt.a
{
  public e()
  {
    GMTrace.i(11302877528064L, 84213);
    GMTrace.o(11302877528064L, 84213);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(11303011745792L, 84214);
    parama = parama.gtM;
    if (parama.lQc == 10002)
    {
      parama = n.a(parama.tPY);
      if (bg.nm(parama))
      {
        w.w("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "msg content is null");
        GMTrace.o(11303011745792L, 84214);
        return;
      }
      Object localObject = bh.q(parama, "sysmsg");
      if ((localObject != null) && (((Map)localObject).size() > 0))
      {
        localObject = (String)((Map)localObject).get(".sysmsg.$type");
        if ((!bg.nm((String)localObject)) && (((String)localObject).equalsIgnoreCase("NewRecommendEmotion")))
        {
          parama = d.wo(parama);
          localObject = h.arl().kjz;
          String str = EmojiGroupInfo.vCi;
          ((a)localObject).fTZ.delete("EmojiGroupInfo", "recommand=? and type!=? and status!=?", new String[] { "1", str, "7" });
          localObject = h.arl().kjz;
          w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[insertRecommendEmojiGroupInfo]");
          ((a)localObject).cu(parama);
          GMTrace.o(11303011745792L, 84214);
          return;
        }
        w.e("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not emoji message type :" + (String)localObject);
      }
      GMTrace.o(11303011745792L, 84214);
      return;
    }
    w.i("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(parama.lQc) });
    GMTrace.o(11303011745792L, 84214);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\g\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */