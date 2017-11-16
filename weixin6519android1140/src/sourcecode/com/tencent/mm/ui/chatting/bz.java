package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ag.a;
import com.tencent.mm.ag.a.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.widget.MMCellTextView;

final class bz
  extends cd
{
  private En_5b8fbb1e.a wvE;
  
  public bz()
  {
    super(37);
    GMTrace.i(2254992048128L, 16801);
    GMTrace.o(2254992048128L, 16801);
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2255126265856L, 16802);
    this.wvE = parama1;
    parama = (ek)parama;
    paramString = a.a.jq(paramau.field_content);
    if (paramau.field_status >= 2) {
      parama.nWt.setVisibility(8);
    }
    for (;;)
    {
      h.a(parama.wHg.getContext(), a.a(paramString), (int)parama.wHg.getTextSize(), null, "");
      parama.wHg.setTag(new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0));
      parama.wHg.setOnClickListener(parama1.wvd.wyW);
      parama.wHg.setOnLongClickListener(parama1.wvd.wyY);
      a(paramInt, parama, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
      GMTrace.o(2255126265856L, 16802);
      return;
      parama.nWt.setVisibility(0);
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2255260483584L, 16803);
    if (paramau.bTM())
    {
      int i = ((dr)paramView.getTag()).position;
      if (paramau.field_status == 5) {
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(R.l.dhc));
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgd));
      }
    }
    GMTrace.o(2255260483584L, 16803);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */