package com.tencent.mm.plugin.emoji.g;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.s.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt.a;
import java.util.Map;

public final class c
  implements bt.a
{
  public c()
  {
    GMTrace.i(11303280181248L, 84216);
    GMTrace.o(11303280181248L, 84216);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(11303548616704L, 84218);
    if (parama == null)
    {
      w.w("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "xml is null.");
      GMTrace.o(11303548616704L, 84218);
      return;
    }
    if (parama.klY > 0)
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(208899, Boolean.valueOf(true));
      com.tencent.mm.s.c.vK().k(262147, true);
    }
    if (parama.klZ > 0)
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(208913, Boolean.valueOf(true));
      com.tencent.mm.s.c.vK().k(262149, true);
    }
    if (!bg.nm(parama.thumburl))
    {
      w.d("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "Thumb URL %s", new Object[] { parama.thumburl });
      at.AR();
      com.tencent.mm.y.c.xh().set(229633, parama.thumburl);
      at.AR();
      com.tencent.mm.y.c.xh().set(229634, System.currentTimeMillis());
      GMTrace.o(11303548616704L, 84218);
      return;
    }
    at.AR();
    com.tencent.mm.y.c.xh().set(229633, "");
    at.AR();
    com.tencent.mm.y.c.xh().set(229634, "");
    GMTrace.o(11303548616704L, 84218);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(11303414398976L, 84217);
    parama = parama.gtM;
    Object localObject1;
    if (parama.lQc == 10002)
    {
      parama = com.tencent.mm.platformtools.n.a(parama.tPY);
      if (bg.nm(parama))
      {
        w.w("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "msg content is null");
        GMTrace.o(11303414398976L, 84217);
        return;
      }
      parama = bh.q(parama, "sysmsg");
      if ((parama != null) && (parama.size() > 0))
      {
        localObject1 = (String)parama.get(".sysmsg.$type");
        if ((bg.nm((String)localObject1)) || (!((String)localObject1).equalsIgnoreCase("emotionstore"))) {}
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = (String)parama.get(".sysmsg.emotionstore.productid");
        Object localObject2 = (String)parama.get(".sysmsg.emotionstore.newcount");
        String str1 = (String)parama.get(".sysmsg.emotionstore.freecount");
        String str2 = (String)parama.get(".sysmsg.emotionstore.thumburl");
        if (bg.nm((String)localObject2)) {
          break label461;
        }
        i = Integer.valueOf((String)localObject2).intValue();
        if (TextUtils.isEmpty(str1)) {
          break label456;
        }
        j = Integer.valueOf(str1).intValue();
        localObject2 = new a(i, j, str2, (String)localObject1);
        if (!bg.nm((String)localObject1))
        {
          w.i("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "new xml productid is %s. now try to get download flag", new Object[] { localObject1 });
          localObject1 = new com.tencent.mm.plugin.emoji.f.k((String)localObject1, (a)localObject2);
          at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
          localObject1 = (String)parama.get(".sysmsg.personalemotion.newcount");
          if ((!bg.nm((String)localObject1)) && (Integer.valueOf((String)localObject1).intValue() > 0))
          {
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vqf, Boolean.valueOf(true));
          }
          parama = (String)parama.get(".sysmsg.personalemoji.emojicount");
          if ((!bg.nm(parama)) && (Integer.valueOf(parama).intValue() > 0))
          {
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vqi, Boolean.valueOf(true));
          }
          GMTrace.o(11303414398976L, 84217);
          return;
        }
        a((a)localObject2);
        continue;
        w.e("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "not emoji message type :" + (String)localObject1);
      }
      catch (Exception parama)
      {
        w.e("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "onRecieveMsg:%s", new Object[] { bg.f(parama) });
        GMTrace.o(11303414398976L, 84217);
        return;
      }
      GMTrace.o(11303414398976L, 84217);
      return;
      w.i("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(parama.lQc) });
      GMTrace.o(11303414398976L, 84217);
      return;
      label456:
      int j = 0;
      continue;
      label461:
      int i = 0;
    }
  }
  
  public final class a
  {
    private String eCb;
    public int klY;
    public int klZ;
    public String thumburl;
    
    public a(int paramInt1, int paramInt2, String paramString1, String paramString2)
    {
      GMTrace.i(11303682834432L, 84219);
      this.klY = paramInt1;
      this.klZ = paramInt2;
      this.thumburl = paramString1;
      this.eCb = paramString2;
      GMTrace.o(11303682834432L, 84219);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\g\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */