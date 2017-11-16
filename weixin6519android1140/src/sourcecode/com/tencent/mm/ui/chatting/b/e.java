package com.tencent.mm.ui.chatting.b;

import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ms;
import com.tencent.mm.g.a.r;
import com.tencent.mm.g.a.r.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.k.b;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.chatting.cv;
import com.tencent.mm.ui.chatting.dd;
import com.tencent.mm.ui.chatting.ed;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public final class e
{
  public com.tencent.mm.sdk.b.c wIp;
  public com.tencent.mm.sdk.b.c wIq;
  public h wtd;
  
  public e(h paramh)
  {
    GMTrace.i(19207093747712L, 143104);
    this.wIp = new com.tencent.mm.sdk.b.c() {};
    this.wIq = new com.tencent.mm.sdk.b.c() {};
    this.wtd = paramh;
    GMTrace.o(19207093747712L, 143104);
  }
  
  public final boolean a(String paramString1, String paramString2, ArrayList<String> paramArrayList, int paramInt1, int paramInt2)
  {
    GMTrace.i(19207227965440L, 143105);
    boolean bool = o.RH(paramString2);
    long l = com.tencent.mm.a.e.aY(paramString2);
    int i;
    if ((bool) && (this.wtd.cdq() != null) && (this.wtd.cdq().ttb != null) && ((this.wtd.cdq().ttb instanceof dd)))
    {
      i = 0;
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      com.tencent.mm.sdk.platformtools.d.decodeFile(paramString2, localOptions);
      if ((localOptions.outHeight > b.ua()) || (localOptions.outWidth > b.ua())) {
        i = 1;
      }
      if (x.eU(paramString1))
      {
        w.i("MicroMsg.ChattingUI.EmojImpl", "tummy, add gif msg filePath");
        paramArrayList.add(paramString2);
        GMTrace.o(19207227965440L, 143105);
        return true;
      }
      if ((l <= paramInt1) && (i == 0))
      {
        paramString1 = com.tencent.mm.a.g.bg(paramString2);
        paramString1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramString1);
        if (paramString1 != null) {
          break label532;
        }
        paramString1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr();
        paramArrayList = this.wtd.cdg().vKB.vKW;
        paramString1 = paramString1.vQ(paramString2);
        paramString1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramString1);
      }
    }
    label532:
    for (;;)
    {
      if (paramString1 != null)
      {
        ((dd)this.wtd.cdq().ttb).l(paramString1);
        com.tencent.mm.plugin.report.service.g.ork.i(13459, new Object[] { Long.valueOf(l), Integer.valueOf(0), paramString1.GS(), Integer.valueOf(0) });
      }
      for (;;)
      {
        w.i("MicroMsg.ChattingUI.EmojImpl", "cpan send custom emoji.");
        GMTrace.o(19207227965440L, 143105);
        return true;
        w.w("MicroMsg.ChattingUI.EmojImpl", "emoji is null");
      }
      if ((l <= paramInt2) && (i == 0))
      {
        paramString1 = new WXMediaMessage(new WXEmojiObject(paramString2));
        paramString1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(this.wtd.cdg().vKB.vKW, paramString1, null);
        if (paramString1 != null) {
          ((dd)this.wtd.cdq().ttb).m(((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramString1));
        }
        com.tencent.mm.plugin.report.service.g.ork.i(13459, new Object[] { Long.valueOf(l), Integer.valueOf(0), paramString1, Integer.valueOf(0) });
        w.i("MicroMsg.ChattingUI.EmojImpl", "cpan send app emoji msg.");
        GMTrace.o(19207227965440L, 143105);
        return true;
      }
      w.i("MicroMsg.ChattingUI.EmojImpl", "cpan emoji is too large, ignore.filePath:%s", new Object[] { paramString2 });
      GMTrace.o(19207227965440L, 143105);
      return false;
    }
  }
  
  public final boolean aO(au paramau)
  {
    GMTrace.i(19207362183168L, 143106);
    if (paramau.bTI())
    {
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable()) {
        com.tencent.mm.ui.base.u.fo(this.wtd.cdg().vKB.vKW);
      }
      for (;;)
      {
        GMTrace.o(19207362183168L, 143106);
        return true;
        w.d("MicroMsg.ChattingUI.EmojImpl", "resendEmoji");
        if (!this.wtd.ccY().field_username.equals("medianote"))
        {
          at.AR();
          com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.e(paramau.field_talker, paramau.field_msgSvrId));
        }
        ed.aI(paramau);
      }
    }
    if (paramau.bTJ())
    {
      w.d("MicroMsg.ChattingUI.EmojImpl", "resendAppMsgEmoji");
      if (!this.wtd.ccY().field_username.equals("medianote"))
      {
        at.AR();
        com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.e(paramau.field_talker, paramau.field_msgSvrId));
      }
      ed.aJ(paramau);
      this.wtd.me(true);
      GMTrace.o(19207362183168L, 143106);
      return true;
    }
    GMTrace.o(19207362183168L, 143106);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */