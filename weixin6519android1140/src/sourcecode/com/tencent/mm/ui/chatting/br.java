package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;

public final class br
  extends ah
{
  public br()
  {
    super(58);
    GMTrace.i(2498731442176L, 18617);
    GMTrace.o(2498731442176L, 18617);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2498865659904L, 18618);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof a)))
    {
      localObject = paramView;
      if (((a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csE);
      ((View)localObject).setTag(new a(this.jHw).du((View)localObject));
    }
    GMTrace.o(2498865659904L, 18618);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2498999877632L, 18619);
    a locala = (a)parama;
    f localf = an.bJI().er(paramau.field_msgId);
    String str = paramau.field_content;
    if ((localf != null) && (str != null))
    {
      paramString = f.a.C(str, paramau.field_reserved);
      paramau = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
      if ((paramString != null) && ((paramString.showType == 3) || (paramString.gjp == 3)))
      {
        locala.gDc.setImageResource(R.g.aXd);
        locala.wxv.setText(paramString.gju);
      }
      parama.wvA.setOnLongClickListener(parama1.wvd.wyY);
      parama.wvA.setOnTouchListener(parama1.wvd.wza);
      parama.wvA.setTag(paramau);
      parama.wvA.setOnClickListener(parama1.wvd.wyW);
      GMTrace.o(2498999877632L, 18619);
      return;
    }
    if (localf == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.e("MicroMsg.ChattingItemHardDeviceMsgPush", "amessage:%b, %s, %d, %s", new Object[] { Boolean.valueOf(bool), str, Long.valueOf(paramau.field_msgId), paramString });
      paramString = null;
      break;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2499134095360L, 18620);
    paramContextMenu.add(((dr)paramView.getTag()).position, 100, 0, paramView.getContext().getString(R.l.dgd));
    GMTrace.o(2499134095360L, 18620);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2499268313088L, 18621);
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      GMTrace.o(2499268313088L, 18621);
      return false;
      parama = paramau.field_content;
      paramMenuItem = null;
      if (parama != null) {
        paramMenuItem = f.a.eS(parama);
      }
      if (paramMenuItem != null) {
        l.es(paramau.field_msgId);
      }
      bc.S(paramau.field_msgId);
    }
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2499402530816L, 18622);
    GMTrace.o(2499402530816L, 18622);
    return false;
  }
  
  final class a
    extends ah.a
  {
    protected ImageView gDc;
    protected TextView wxv;
    
    public a(int paramInt)
    {
      super();
      GMTrace.i(2266400555008L, 16886);
      GMTrace.o(2266400555008L, 16886);
    }
    
    public final a du(View paramView)
    {
      GMTrace.i(2266534772736L, 16887);
      super.dq(paramView);
      this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
      this.gDc = ((ImageView)paramView.findViewById(R.h.bUF));
      this.wxv = ((TextView)paramView.findViewById(R.h.chw));
      GMTrace.o(2266534772736L, 16887);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */