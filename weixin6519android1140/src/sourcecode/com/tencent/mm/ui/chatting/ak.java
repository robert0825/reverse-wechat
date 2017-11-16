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
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;

final class ak
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public ak()
  {
    super(64);
    GMTrace.i(2183051345920L, 16265);
    GMTrace.o(2183051345920L, 16265);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2183185563648L, 16266);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof f)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csN);
      ((View)localObject).setTag(new f(this.jHw).dk((View)localObject));
    }
    GMTrace.o(2183185563648L, 16266);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2183319781376L, 16267);
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
        GMTrace.o(2183319781376L, 16267);
        return;
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2183453999104L, 16268);
    paramContextMenu.add(((dr)paramView.getTag()).position, 100, 0, this.wvE.getString(R.l.dgd));
    GMTrace.o(2183453999104L, 16268);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2183588216832L, 16269);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2183588216832L, 16269);
      return false;
    }
    bc.S(paramau.field_msgId);
    GMTrace.o(2183588216832L, 16269);
    return true;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2183722434560L, 16270);
    paramView = paramau.field_content;
    if (paramView != null)
    {
      paramView = f.a.C(paramView, paramau.field_reserved);
      if (!bg.nm(paramView.gkb))
      {
        paramau = new Intent();
        paramau.putExtra("key_native_url", paramView.gkb);
        paramau.putExtra("key_image_id", paramView.gke);
        paramau.putExtra("key_image_aes_key", paramView.gkf);
        paramau.putExtra("key_image_length", paramView.gkg);
        paramau.putExtra("key_username", parama.cci());
        d.b(parama.vKB.vKW, "luckymoney", ".ui.LuckyMoneyNewYearReceiveUI", paramau);
      }
    }
    GMTrace.o(2183722434560L, 16270);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */