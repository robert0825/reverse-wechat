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
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.b.q;
import com.tencent.mm.x.f.a;
import java.lang.ref.WeakReference;
import java.util.Map;

final class aq
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  
  public aq()
  {
    super(22);
    GMTrace.i(2385317462016L, 17772);
    GMTrace.o(2385317462016L, 17772);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2385451679744L, 17773);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csj);
      ((View)localObject).setTag(new h(this.jHw).r((View)localObject, true));
    }
    GMTrace.o(2385451679744L, 17773);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2385585897472L, 17774);
    this.wvE = parama1;
    parama1.wCp.aT(paramau);
    h localh = (h)parama;
    parama = null;
    Object localObject1 = paramau.field_content;
    if (localObject1 != null) {}
    for (localObject1 = f.a.C((String)localObject1, paramau.field_reserved);; localObject1 = null)
    {
      Object localObject2 = parama;
      if (localObject1 != null)
      {
        localObject2 = parama;
        if (((f.a)localObject1).gix != null) {
          localObject2 = ((c)com.tencent.mm.kernel.h.j(c.class)).getEmojiMgr().vP(((f.a)localObject1).gix);
        }
      }
      long l;
      if ((localObject2 == null) || (!((EmojiInfo)localObject2).bUN()))
      {
        String str = n.IZ().x(paramau.field_imgPath, true);
        Bitmap localBitmap = n.Jd().kr(str);
        if (localBitmap != null)
        {
          parama = localBitmap;
          if (!localBitmap.isRecycled()) {}
        }
        else
        {
          parama = com.tencent.mm.sdk.platformtools.d.decodeFile(str, null);
          n.Jd().h(str, parama);
        }
        if (localObject2 == null)
        {
          localh.wrX.setVisibility(0);
          localh.wrW.setVisibility(8);
          localObject2 = localh.wrY;
          if (localObject1 == null)
          {
            l = 0L;
            ((TextView)localObject2).setText(t.aF(l));
            localh.wrY.setVisibility(0);
            localh.wrX.setImageResource(R.g.aWg);
            label237:
            if ((localObject1 != null) && (!bg.nm(((f.a)localObject1).gix))) {
              h.wrZ.put(((f.a)localObject1).gix, new WeakReference(localh));
            }
            if ((parama != null) && (!parama.isRecycled())) {
              break label610;
            }
            parama = com.tencent.mm.sdk.platformtools.d.t(this.wvE.getResources().getDrawable(R.g.aTN));
          }
        }
      }
      label610:
      for (;;)
      {
        localh.wrT.setImageBitmap(parama);
        for (;;)
        {
          localh.wrT.setTag(new dr(paramau, parama1.wqK, paramInt, paramString, 0, (byte)0));
          localh.wrT.setOnClickListener(parama1.wvd.wyW);
          localh.wrT.setOnLongClickListener(parama1.wvd.wyY);
          localh.wrT.setOnTouchListener(parama1.wvd.wza);
          localh.wrX.setOnClickListener(parama1.wvd.wyW);
          localh.wrX.setOnClickListener(parama1.wvd.wyW);
          localh.wrX.setOnLongClickListener(parama1.wvd.wyY);
          localh.wrX.setTag(localh.wrT.getTag());
          GMTrace.o(2385585897472L, 17774);
          return;
          l = ((f.a)localObject1).giv;
          break;
          localh.wrW.setVisibility(0);
          localh.wrY.setVisibility(8);
          localh.wrX.setVisibility(8);
          localh.wrW.setProgress(0);
          localh.wrY.setVisibility(8);
          break label237;
          localh.wrT.a((EmojiInfo)localObject2, paramau.field_msgId);
          localh.wrX.setVisibility(8);
          localh.wrW.setVisibility(8);
          localh.wrY.setVisibility(8);
          localh.wrX.setVisibility(8);
          if ((localObject1 != null) && (!bg.nm(((f.a)localObject1).gix))) {
            h.wrZ.remove(((f.a)localObject1).gix);
          }
          r((EmojiInfo)localObject2);
        }
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2385854332928L, 17776);
    int i = ((dr)paramView.getTag()).position;
    aj localaj = aj.Uf(paramau.field_content);
    paramau = f.a.C(paramau.field_content, paramau.field_reserved);
    if (paramau == null)
    {
      paramau = new f.a();
      paramau.gix = localaj.eDW;
    }
    for (;;)
    {
      if ((!t.nm(paramau.gix)) && (!paramau.gix.equals("-1")))
      {
        paramau = ((c)com.tencent.mm.kernel.h.j(c.class)).getEmojiMgr().vP(paramau.gix);
        if (paramau != null)
        {
          if ((paramau.field_catalog != EmojiInfo.vCu) && (!paramau.bUP())) {
            paramContextMenu.add(i, 104, 0, paramView.getContext().getString(R.l.dgm));
          }
          if (paramau != null) {
            g.ork.i(12789, new Object[] { Integer.valueOf(0), paramau.GS(), Integer.valueOf(0), paramau.field_designerID, paramau.field_groupId, "", "", "", "", paramau.field_activityid });
          }
          boolean bool = paramau.bUN();
          if ((paramau.field_catalog == EmojiInfo.vCu) || (bg.nm(paramau.field_groupId)) || ((!bg.nm(paramau.field_groupId)) && (((c)com.tencent.mm.kernel.h.j(c.class)).getEmojiMgr().vS(paramau.field_groupId))))
          {
            if (!bool) {
              break label364;
            }
            paramContextMenu.add(i, 113, 0, R.l.dSi);
          }
        }
      }
      for (;;)
      {
        if (!this.wvE.ceh()) {
          paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgb));
        }
        GMTrace.o(2385854332928L, 17776);
        return true;
        label364:
        w.i("MicroMsg.ChattingItemAppMsgEmojiFrom", "emoji file no exist. cannot save or resend.");
      }
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2385988550656L, 17777);
    GMTrace.o(2385988550656L, 17777);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2386122768384L, 17778);
    GMTrace.o(2386122768384L, 17778);
    return false;
  }
  
  protected final boolean a(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2385720115200L, 17775);
    boolean bool = parama.wqK;
    GMTrace.o(2385720115200L, 17775);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */