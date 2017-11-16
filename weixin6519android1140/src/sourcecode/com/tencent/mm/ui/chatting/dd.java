package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.io.FileInputStream;

public final class dd
  implements j
{
  private Context context;
  private x iBi;
  private boolean wBv;
  private boolean wBw;
  private String wvg;
  
  public dd(Context paramContext, x paramx, String paramString)
  {
    GMTrace.i(2115808264192L, 15764);
    this.wBv = true;
    this.wBw = true;
    this.context = paramContext;
    this.iBi = paramx;
    this.wvg = paramString;
    if (x.fw(this.wvg)) {
      this.wBw = false;
    }
    if (x.Tq(this.wvg)) {
      this.wBv = false;
    }
    if (x.To(this.wvg)) {
      this.wBv = false;
    }
    if ((this.iBi != null) && (x.fw(this.iBi.field_username))) {
      paramContext = this.wvg;
    }
    for (;;)
    {
      if (s.fy(paramContext)) {
        this.wBw = false;
      }
      GMTrace.o(2115808264192L, 15764);
      return;
      if (this.iBi == null) {
        paramContext = null;
      } else {
        paramContext = this.iBi.field_username;
      }
    }
  }
  
  public final boolean aOa()
  {
    GMTrace.i(2116210917376L, 15767);
    boolean bool = this.wBw;
    GMTrace.o(2116210917376L, 15767);
    return bool;
  }
  
  public final boolean aOb()
  {
    GMTrace.i(2116345135104L, 15768);
    boolean bool = this.wBv;
    GMTrace.o(2116345135104L, 15768);
    return bool;
  }
  
  public final void aOc()
  {
    GMTrace.i(2116479352832L, 15769);
    GMTrace.o(2116479352832L, 15769);
  }
  
  public final void l(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(2115942481920L, 15765);
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      u.fo(this.context);
      GMTrace.o(2115942481920L, 15765);
      return;
    }
    if (paramEmojiInfo == null)
    {
      GMTrace.o(2115942481920L, 15765);
      return;
    }
    if ((this.iBi.field_username.equals("medianote")) && ((q.zI() & 0x4000) == 0)) {}
    for (int i = 1; i != 0; i = 0)
    {
      paramEmojiInfo.field_start = 0;
      paramEmojiInfo.field_state = EmojiInfo.vCC;
      ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().d(paramEmojiInfo);
      localObject = new au();
      ((au)localObject).setType(47);
      ((au)localObject).db("medianote");
      ((au)localObject).dC(1);
      if (paramEmojiInfo.bJs()) {
        ((au)localObject).setContent(aj.a(q.zE(), 0L, false, paramEmojiInfo.GS(), false, ""));
      }
      ((au)localObject).dc(paramEmojiInfo.GS());
      ((au)localObject).E(bc.gR(((ce)localObject).field_talker));
      ((au)localObject).dB(2);
      at.AR();
      com.tencent.mm.y.c.yM().P((au)localObject);
      GMTrace.o(2115942481920L, 15765);
      return;
    }
    d locald = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr();
    if (bg.nm(this.wvg)) {}
    for (Object localObject = this.iBi.field_username;; localObject = this.wvg)
    {
      locald.a((String)localObject, paramEmojiInfo, null);
      GMTrace.o(2115942481920L, 15765);
      return;
    }
  }
  
  public final void m(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(2116076699648L, 15766);
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      u.fo(this.context);
      GMTrace.o(2116076699648L, 15766);
      return;
    }
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.zb() + paramEmojiInfo.GS();
    if (e.aZ((String)localObject + "_thumb"))
    {
      int i = e.aY((String)localObject + "_thumb");
      localWXMediaMessage.thumbData = e.c((String)localObject + "_thumb", 0, i);
    }
    for (;;)
    {
      localWXMediaMessage.mediaObject = new WXEmojiObject((String)localObject);
      l.a(localWXMediaMessage, paramEmojiInfo.field_app_id, null, this.wvg, 1, paramEmojiInfo.GS());
      GMTrace.o(2116076699648L, 15766);
      return;
      try
      {
        FileInputStream localFileInputStream = new FileInputStream((String)localObject);
        localWXMediaMessage.setThumbImage(BackwardSupportUtil.b.a(localFileInputStream, 1.0F));
        localFileInputStream.close();
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.ChattingSmileyPanelImpl", localException, "", new Object[0]);
        w.e("MicroMsg.ChattingSmileyPanelImpl", "sendAppMsgEmoji Fail cause there is no thumb");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */