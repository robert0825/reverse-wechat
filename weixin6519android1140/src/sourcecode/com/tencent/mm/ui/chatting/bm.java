package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;

final class bm
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  
  public bm()
  {
    super(14);
    GMTrace.i(2494973345792L, 18589);
    GMTrace.o(2494973345792L, 18589);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2495107563520L, 18590);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csr);
      ((View)localObject).setTag(new dm(this.jHw).r((View)localObject, true));
    }
    GMTrace.o(2495107563520L, 18590);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2495241781248L, 18591);
    this.wvE = parama1;
    EmojiInfo localEmojiInfo = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramau.field_imgPath);
    dm localdm = (dm)parama;
    if (localEmojiInfo != null)
    {
      parama = aj.Uf(paramau.field_content);
      localdm.wrT.a(localEmojiInfo, paramau.field_msgId, parama);
      if ((localEmojiInfo.bJs()) && (!parama.hco))
      {
        parama.hco = true;
        paramau.setContent(parama.bTl());
        at.AR();
        com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
      }
    }
    parama = "";
    if ((localEmojiInfo != null) && (localEmojiInfo.bJs())) {
      if (localEmojiInfo.field_name.startsWith("jsb_j")) {
        parama = this.wvE.vKB.vKW.getString(R.l.dod);
      }
    }
    for (;;)
    {
      localdm.wrT.setContentDescription(this.wvE.vKB.vKW.getString(R.l.dpj) + parama);
      localdm.wrT.setTag(new dr(paramau, parama1.wqK, paramInt, paramString, 0, (byte)0));
      localdm.wrT.setOnClickListener(parama1.wvd.wyW);
      localdm.wrT.setOnLongClickListener(parama1.wvd.wyY);
      localdm.wrT.setOnTouchListener(parama1.wvd.wza);
      GMTrace.o(2495241781248L, 18591);
      return;
      if (localEmojiInfo.field_name.startsWith("jsb_s"))
      {
        parama = this.wvE.vKB.vKW.getString(R.l.doe);
      }
      else if (localEmojiInfo.field_name.startsWith("jsb_b"))
      {
        parama = this.wvE.vKB.vKW.getString(R.l.doc);
      }
      else if (localEmojiInfo.field_name.startsWith("dice"))
      {
        parama = localEmojiInfo.field_name.replace("dice_", "").replace(".png", "");
        continue;
        if (localEmojiInfo != null) {
          parama = bg.aq(((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vM(localEmojiInfo.GS()), "");
        }
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2495510216704L, 18593);
    int i;
    EmojiInfo localEmojiInfo;
    if (paramau.bTI())
    {
      at.AR();
      if (com.tencent.mm.y.c.isSDCardAvailable())
      {
        i = ((dr)paramView.getTag()).position;
        localEmojiInfo = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramau.field_imgPath);
        if (localEmojiInfo == null)
        {
          if (paramau == null) {}
          for (paramContextMenu = "";; paramContextMenu = paramau.field_imgPath)
          {
            w.w("MicroMsg.emoji.ChattingItemEmojiFrom", "emoji is null. md5:%s", new Object[] { paramContextMenu });
            GMTrace.o(2495510216704L, 18593);
            return true;
          }
        }
        boolean bool = localEmojiInfo.bUN();
        if ((localEmojiInfo.field_catalog != EmojiInfo.vCu) && (!localEmojiInfo.bUP()) && (!localEmojiInfo.bUQ()))
        {
          if (!bool) {
            break label419;
          }
          paramContextMenu.add(i, 104, 0, paramView.getContext().getString(R.l.dgm));
        }
        if ((localEmojiInfo.field_catalog == EmojiInfo.vCu) || (bg.nm(localEmojiInfo.field_groupId)) || ((!bg.nm(localEmojiInfo.field_groupId)) && (((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vS(localEmojiInfo.field_groupId))))
        {
          if (!bool) {
            break label431;
          }
          paramContextMenu.add(i, 113, 0, R.l.dSi);
        }
      }
    }
    for (;;)
    {
      if ((!bg.nm(localEmojiInfo.field_groupId)) && (!localEmojiInfo.bJs()) && (!localEmojiInfo.bUQ())) {
        paramContextMenu.add(i, 127, 0, R.l.dgo);
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgb));
      }
      g.ork.i(12789, new Object[] { Integer.valueOf(0), localEmojiInfo.GS(), Integer.valueOf(0), localEmojiInfo.field_designerID, localEmojiInfo.field_groupId, "", "", "", "", localEmojiInfo.field_activityid });
      GMTrace.o(2495510216704L, 18593);
      return true;
      label419:
      w.i("MicroMsg.emoji.ChattingItemEmojiFrom", "file do no exist. cant do add or resend.");
      break;
      label431:
      w.i("MicroMsg.emoji.ChattingItemEmojiFrom", "file do no exist. cant do add or resend.");
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2495644434432L, 18594);
    GMTrace.o(2495644434432L, 18594);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2495778652160L, 18595);
    GMTrace.o(2495778652160L, 18595);
    return false;
  }
  
  protected final boolean a(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2495375998976L, 18592);
    boolean bool = parama.wqK;
    GMTrace.o(2495375998976L, 18592);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */