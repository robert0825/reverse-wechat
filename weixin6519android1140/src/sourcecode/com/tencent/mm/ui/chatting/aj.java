package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.util.Map;

final class aj
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  private final int wvF;
  
  public aj()
  {
    super(63);
    GMTrace.i(2514569134080L, 18735);
    this.wvF = 1;
    GMTrace.o(2514569134080L, 18735);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2514703351808L, 18736);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof f)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csi);
      ((View)localObject).setTag(new f(this.jHw).dk((View)localObject));
    }
    GMTrace.o(2514703351808L, 18736);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2514837569536L, 18737);
    this.wvE = parama1;
    paramString = paramau.field_content;
    if (paramString != null) {}
    for (paramString = f.a.C(paramString, paramau.field_reserved);; paramString = null)
    {
      f localf = (f)parama;
      if (paramString != null) {
        if (paramau.field_isSend != 1) {
          break label156;
        }
      }
      label156:
      for (paramString = paramString.gjW;; paramString = paramString.gjX)
      {
        localf.wrL.setText(paramString);
        parama.wvA.setOnClickListener(parama1.wvd.wyW);
        parama.wvA.setOnLongClickListener(parama1.wvd.wyY);
        parama.wvA.setOnTouchListener(parama1.wvd.wza);
        parama1 = new dr(paramau, this.wvE.wqK, paramInt, null, 0, (byte)0);
        parama.wvA.setTag(parama1);
        GMTrace.o(2514837569536L, 18737);
        return;
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2514971787264L, 18738);
    paramContextMenu.add(((dr)paramView.getTag()).position, 100, 0, this.wvE.getString(R.l.dgd));
    GMTrace.o(2514971787264L, 18738);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2515106004992L, 18739);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2515106004992L, 18739);
      return false;
    }
    bc.S(paramau.field_msgId);
    GMTrace.o(2515106004992L, 18739);
    return true;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2515240222720L, 18740);
    paramView = paramau.field_content;
    if (paramView != null)
    {
      paramView = f.a.C(paramView, paramau.field_reserved);
      if (!bg.nm(paramView.gkb))
      {
        if (paramView.gkc == 1)
        {
          w.d("MicroMsg.ChattingItemAppMsgC2CNewYearFrom", "onItemClick hasplay, skip");
          paramau = new Intent();
          paramau.putExtra("key_native_url", paramView.gkb);
          paramau.putExtra("key_username", parama.cci());
          paramau.putExtra("key_image_id", paramView.gke);
          paramau.putExtra("key_image_aes_key", paramView.gkf);
          paramau.putExtra("key_image_length", paramView.gkg);
          d.b(parama.vKB.vKW, "luckymoney", ".ui.LuckyMoneyNewYearReceiveUI", paramau);
          GMTrace.o(2515240222720L, 18740);
          return true;
        }
        w.d("MicroMsg.ChattingItemAppMsgC2CNewYearFrom", "onItemClick play egg emoj");
        Intent localIntent = new Intent();
        localIntent.putExtra("key_native_url", paramView.gkb);
        localIntent.putExtra("key_username", parama.cci());
        localIntent.putExtra("key_image_id", paramView.gke);
        localIntent.putExtra("key_image_aes_key", paramView.gkf);
        localIntent.putExtra("key_image_length", paramView.gkg);
        d.b(parama.vKB.vKW, "luckymoney", ".ui.LuckyMoneyNewYearReceiveUI", localIntent);
        paramView.gkc = 1;
        paramau.setContent(f.a.a(paramView, null, null));
        if ((paramau != null) && (paramau.aCp())) {
          break label292;
        }
      }
    }
    for (;;)
    {
      at.AR();
      com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
      GMTrace.o(2515240222720L, 18740);
      return true;
      try
      {
        label292:
        parama = paramau.field_content;
        int i = parama.indexOf("<msg>");
        paramView = parama;
        if (i > 0)
        {
          paramView = parama;
          if (i < parama.length()) {
            paramView = parama.substring(i).trim();
          }
        }
        paramView = bh.q(paramView, "msg");
        if ((paramView != null) && (paramView.size() > 0)) {
          paramau.dd(aw.ah(paramView));
        }
      }
      catch (Exception paramView)
      {
        w.e("MicroMsg.ChattingItemAppMsgC2CNewYearFrom", paramView.getMessage());
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */