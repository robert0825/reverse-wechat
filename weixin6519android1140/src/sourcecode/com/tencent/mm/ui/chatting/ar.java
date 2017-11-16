package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView;
import com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.b.q;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.Map;

final class ar
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public ar()
  {
    super(23);
    GMTrace.i(2179159031808L, 16236);
    GMTrace.o(2179159031808L, 16236);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2179293249536L, 16237);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csO);
      ((View)localObject).setTag(new h(this.jHw).r((View)localObject, false));
    }
    GMTrace.o(2179293249536L, 16237);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2179427467264L, 16238);
    this.wvE = parama1;
    parama1.wCp.aT(paramau);
    h localh = (h)parama;
    Object localObject;
    if (paramau != null)
    {
      parama = paramau.field_content;
      localObject = aj.Uf(paramau.field_content);
      if (((aj)localObject).hco) {
        break label673;
      }
      if (parama == null) {
        break label667;
      }
      paramString = f.a.C(parama, paramau.field_reserved);
      if (paramString == null) {
        break label662;
      }
      parama = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramString.gix);
    }
    for (;;)
    {
      if ((((aj)localObject).eDW != null) && (!((aj)localObject).eDW.equals("-1")) && (parama == null)) {
        parama = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(((aj)localObject).eDW);
      }
      for (;;)
      {
        int i;
        if ((parama != null) && (parama.bUN()))
        {
          localh.wrT.a(parama, paramau.field_msgId);
          paramString = localh.wrT;
          if (paramString.tCl != null) {
            paramString.tCl.resume();
          }
          if (paramau.field_status != 1)
          {
            i = 1;
            paramString = localh.nWt;
            if (i == 0) {
              break label407;
            }
            i = 4;
            label226:
            paramString.setVisibility(i);
            r(parama);
            if (ccs())
            {
              if ((paramau == null) || (paramau.field_status != 2) || (!a(parama1.wvd, paramau.field_msgId))) {
                break label638;
              }
              if (localh.wrV != null) {
                localh.wrV.setVisibility(0);
              }
            }
          }
        }
        for (;;)
        {
          localh.wrT.setTag(new dr(paramau, parama1.wqK, paramInt, parama1.wvd.gtf, 0, (byte)0));
          localh.wrT.setOnClickListener(parama1.wvd.wyW);
          localh.wrT.setOnLongClickListener(parama1.wvd.wyY);
          localh.wrT.setOnTouchListener(parama1.wvd.wza);
          a(paramInt, localh, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
          GMTrace.o(2179427467264L, 16238);
          return;
          i = 0;
          break;
          label407:
          i = 0;
          break label226;
          String str = n.IZ().x(paramau.field_imgPath, true);
          localObject = n.Jd().kr(str);
          if (localObject != null)
          {
            parama = (ah.a)localObject;
            if (!((Bitmap)localObject).isRecycled()) {}
          }
          else
          {
            parama = com.tencent.mm.sdk.platformtools.d.decodeFile(str, null);
            n.Jd().h(str, parama);
          }
          localh.nWt.setVisibility(8);
          localh.wrX.setVisibility(0);
          localh.wrW.setVisibility(8);
          localObject = localh.wrY;
          if (paramString == null) {}
          for (long l = 0L;; l = paramString.giv)
          {
            ((TextView)localObject).setText(t.aF(l));
            localh.wrY.setVisibility(0);
            localh.wrX.setImageResource(R.g.aWg);
            if (parama != null)
            {
              localObject = parama;
              if (!parama.isRecycled()) {}
            }
            else
            {
              localObject = com.tencent.mm.sdk.platformtools.d.t(this.wvE.getResources().getDrawable(R.g.aTN));
            }
            localh.wrT.setImageBitmap((Bitmap)localObject);
            if ((paramString == null) || (bg.nm(paramString.gix))) {
              break;
            }
            h.wrZ.put(paramString.gix, new WeakReference(localh));
            break;
          }
          label638:
          if (localh.wrV != null) {
            localh.wrV.setVisibility(8);
          }
        }
      }
      label662:
      parama = null;
      continue;
      label667:
      paramString = null;
      break;
      label673:
      parama = null;
      paramString = null;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2179561684992L, 16239);
    at.AR();
    int i;
    Object localObject;
    f.a locala;
    if (com.tencent.mm.y.c.isSDCardAvailable())
    {
      i = ((dr)paramView.getTag()).position;
      localObject = aj.Uf(paramau.field_content);
      locala = f.a.C(paramau.field_content, paramau.field_reserved);
      if (locala != null) {
        break label524;
      }
      locala = new f.a();
      locala.gix = ((aj)localObject).eDW;
    }
    label488:
    label500:
    label524:
    for (;;)
    {
      if ((!t.nm(locala.gix)) && (!locala.gix.equals("-1")))
      {
        localObject = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(locala.gix);
        if (localObject == null) {
          break label500;
        }
        if ((((EmojiInfo)localObject).field_catalog != EmojiInfo.vCu) && (!((EmojiInfo)localObject).bUP())) {
          paramContextMenu.add(i, 104, 0, paramView.getContext().getString(R.l.dgm));
        }
        g.ork.i(12789, new Object[] { Integer.valueOf(0), ((EmojiInfo)localObject).GS(), Integer.valueOf(0), ((EmojiInfo)localObject).field_designerID, ((EmojiInfo)localObject).field_groupId, "", "", "", "", ((EmojiInfo)localObject).field_activityid });
        boolean bool = ((EmojiInfo)localObject).bUN();
        if ((((EmojiInfo)localObject).field_catalog == EmojiInfo.vCu) || (bg.nm(((EmojiInfo)localObject).field_groupId)) || ((!bg.nm(((EmojiInfo)localObject).field_groupId)) && (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vS(((EmojiInfo)localObject).field_groupId))))
        {
          if (!bool) {
            break label488;
          }
          paramContextMenu.add(i, 113, 0, R.l.dSi);
        }
      }
      for (;;)
      {
        if (paramau.field_status == 5) {
          paramContextMenu.add(i, 103, 0, paramView.getContext().getString(R.l.dhc));
        }
        if ((!paramau.bTs()) && (paramau.bTJ()) && ((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
          paramContextMenu.add(i, 123, 0, paramView.getContext().getString(R.l.dgl));
        }
        if (!this.wvE.ceh()) {
          paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgb));
        }
        GMTrace.o(2179561684992L, 16239);
        return true;
        w.i("MicroMsg.ChattingItemAppMsgEmojiTo", "emoji file no exist. cannot save or resend.");
        continue;
        w.i("MicroMsg.ChattingItemAppMsgEmojiTo", "emoji is null. app content md5 is :%s", new Object[] { locala.gix });
      }
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2179695902720L, 16240);
    GMTrace.o(2179695902720L, 16240);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2179830120448L, 16241);
    GMTrace.o(2179830120448L, 16241);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */