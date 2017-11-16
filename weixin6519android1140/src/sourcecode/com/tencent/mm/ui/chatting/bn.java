package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
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

final class bn
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public bn()
  {
    super(15);
    GMTrace.i(2298881245184L, 17128);
    GMTrace.o(2298881245184L, 17128);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2299015462912L, 17129);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csW);
      ((View)localObject).setTag(new dm(this.jHw).r((View)localObject, false));
    }
    GMTrace.o(2299015462912L, 17129);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2299149680640L, 17130);
    this.wvE = parama1;
    paramString = (dm)parama;
    EmojiInfo localEmojiInfo = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramau.field_imgPath);
    ImageView localImageView;
    if (localEmojiInfo != null)
    {
      parama = aj.Uf(paramau.field_content);
      paramString.wrT.a(localEmojiInfo, paramau.field_msgId, parama);
      if (paramString.wCf != null)
      {
        if (!parama.vAI) {
          break label622;
        }
        paramString.wCf.setVisibility(0);
        TextView localTextView = (TextView)paramString.lFh.findViewById(R.h.bon).findViewById(R.h.bnt);
        localTextView.setText(Html.fromHtml(parama1.getString(R.l.dnM)));
        localImageView = (ImageView)paramString.lFh.findViewById(R.h.bon).findViewById(R.h.bns);
        localTextView.setTag(new dr(paramau, false, paramInt, parama1.wvd.gtf, 8, false, "", "", "", "", localEmojiInfo.field_groupId, "", true, false));
        localTextView.setOnClickListener(parama1.wvd.wyW);
        if (!((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().aqz()) {
          break label612;
        }
        localImageView.setVisibility(0);
        localImageView.setTag(new dr(paramau, parama1.wqK, paramInt, parama1.wvd.gtf, 11, (byte)0));
        localImageView.setOnClickListener(parama1.wvd.wyW);
      }
      if ((localEmojiInfo.bJs()) && (!parama.hco))
      {
        parama.hco = true;
        paramau.setContent(parama.bTl());
        at.AR();
        paramau.dB(com.tencent.mm.y.c.yM().cM(paramau.field_msgId).field_status);
        at.AR();
        com.tencent.mm.y.c.yM().R(paramau);
      }
      if (!ccs()) {
        break label656;
      }
      paramString.nWt.setVisibility(8);
      if ((paramau == null) || (paramau.field_status != 2) || (!a(parama1.wvd, paramau.field_msgId))) {
        break label635;
      }
      if (paramString.wrV != null) {
        paramString.wrV.setVisibility(0);
      }
    }
    label412:
    parama = "";
    if ((localEmojiInfo != null) && (localEmojiInfo.bJs())) {
      if (localEmojiInfo.field_name.startsWith("jsb_j")) {
        parama = this.wvE.vKB.vKW.getString(R.l.dod);
      }
    }
    for (;;)
    {
      paramString.wrT.setContentDescription(this.wvE.vKB.vKW.getString(R.l.dpj) + parama);
      paramString.wrT.setTag(new dr(paramau, parama1.wqK, paramInt, parama1.wvd.gtf, 0, (byte)0));
      paramString.wrT.setOnClickListener(parama1.wvd.wyW);
      paramString.wrT.setOnLongClickListener(parama1.wvd.wyY);
      paramString.wrT.setOnTouchListener(parama1.wvd.wza);
      a(paramInt, paramString, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
      GMTrace.o(2299149680640L, 17130);
      return;
      label612:
      localImageView.setVisibility(8);
      break;
      label622:
      paramString.wCf.setVisibility(8);
      break;
      label635:
      if (paramString.wrV == null) {
        break label412;
      }
      paramString.wrV.setVisibility(8);
      break label412;
      label656:
      if (paramString.wrV != null) {
        paramString.wrV.setVisibility(8);
      }
      if (paramString.nWt == null) {
        break label412;
      }
      paramString.nWt.setVisibility(0);
      if (paramau.field_status < 2) {
        break label412;
      }
      paramString.nWt.setVisibility(8);
      break label412;
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
    GMTrace.i(2299283898368L, 17131);
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
            w.w("MicroMsg.emoji.ChattingItemEmojiTo", "emoji is null. md5:%s", new Object[] { paramContextMenu });
            GMTrace.o(2299283898368L, 17131);
            return true;
          }
        }
        boolean bool = localEmojiInfo.bUN();
        if ((localEmojiInfo.field_catalog != EmojiInfo.vCu) && (!localEmojiInfo.bUP()) && (!localEmojiInfo.bUQ()))
        {
          if (!bool) {
            break label524;
          }
          paramContextMenu.add(i, 104, 0, paramView.getContext().getString(R.l.dgm));
        }
        if ((localEmojiInfo.field_catalog == EmojiInfo.vCu) || (bg.nm(localEmojiInfo.field_groupId)) || ((!bg.nm(localEmojiInfo.field_groupId)) && (((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vS(localEmojiInfo.field_groupId))))
        {
          if (!bool) {
            break label536;
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
      if ((!paramau.bTs()) && (paramau.bTI()) && ((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(R.l.dgl));
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgb));
      }
      if (paramau.field_status == 5) {
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(R.l.dhc));
      }
      g.ork.i(12789, new Object[] { Integer.valueOf(0), localEmojiInfo.GS(), Integer.valueOf(0), localEmojiInfo.field_designerID, localEmojiInfo.field_groupId, "", "", "", "", "", localEmojiInfo.field_activityid });
      GMTrace.o(2299283898368L, 17131);
      return true;
      label524:
      w.i("MicroMsg.emoji.ChattingItemEmojiTo", "emoji file no exist. cannot save or resend.");
      break;
      label536:
      w.i("MicroMsg.emoji.ChattingItemEmojiTo", "emoji file no exist. cannot save or resend.");
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2299418116096L, 17132);
    GMTrace.o(2299418116096L, 17132);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2299552333824L, 17133);
    GMTrace.o(2299552333824L, 17133);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */