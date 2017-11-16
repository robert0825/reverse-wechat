package com.tencent.mm.plugin.qmessage.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;

final class c
  extends o<ae>
  implements m.b
{
  private final MMActivity ezR;
  protected MMSlideDelView.f jpQ;
  protected MMSlideDelView.c jpR;
  protected MMSlideDelView.e jpS;
  protected MMSlideDelView.d jpT;
  
  public c(Context paramContext, o.a parama)
  {
    super(paramContext, new ae());
    GMTrace.i(8953798852608L, 66711);
    this.jpT = MMSlideDelView.cah();
    this.vKu = parama;
    this.ezR = ((MMActivity)paramContext);
    GMTrace.o(8953798852608L, 66711);
  }
  
  private static int tE(String paramString)
  {
    int j = 1;
    GMTrace.i(8954872594432L, 66719);
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (paramString.length() <= 0) {}
    }
    try
    {
      i = Integer.valueOf(paramString).intValue();
      GMTrace.o(8954872594432L, 66719);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        i = j;
      }
    }
  }
  
  public final void QF()
  {
    GMTrace.i(8953933070336L, 66712);
    at.AR();
    setCursor(com.tencent.mm.y.c.yP().TW(s.gmy));
    if (this.vKu != null) {
      this.vKu.QC();
    }
    super.notifyDataSetChanged();
    GMTrace.o(8953933070336L, 66712);
  }
  
  protected final void QG()
  {
    GMTrace.i(8955141029888L, 66721);
    QF();
    GMTrace.o(8955141029888L, 66721);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(8954604158976L, 66717);
    this.jpR = paramc;
    GMTrace.o(8954604158976L, 66717);
  }
  
  public final void a(MMSlideDelView.e parame)
  {
    GMTrace.i(8954469941248L, 66716);
    this.jpS = parame;
    GMTrace.o(8954469941248L, 66716);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(8954335723520L, 66715);
    this.jpQ = paramf;
    GMTrace.o(8954335723520L, 66715);
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(8954201505792L, 66714);
    GMTrace.o(8954201505792L, 66714);
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8954738376704L, 66718);
    ae localae = (ae)getItem(paramInt);
    View localView;
    Object localObject;
    if (paramView == null)
    {
      paramViewGroup = new a();
      localView = View.inflate(this.ezR, R.i.cGZ, null);
      paramViewGroup.hqG = ((ImageView)localView.findViewById(R.h.bfq));
      paramViewGroup.jpV = ((TextView)localView.findViewById(R.h.bQX));
      paramViewGroup.jpW = ((TextView)localView.findViewById(R.h.cjq));
      paramViewGroup.jpX = ((TextView)localView.findViewById(R.h.bJH));
      paramViewGroup.jpY = ((ImageView)localView.findViewById(R.h.cfH));
      paramViewGroup.jpZ = ((TextView)localView.findViewById(R.h.chA));
      localView.setTag(paramViewGroup);
      paramViewGroup.jpV.setText(r.fs(localae.field_username));
      localObject = paramViewGroup.jpW;
      if (localae.field_status != 1) {
        break label471;
      }
      paramView = this.ezR.getString(R.l.dIe);
      label180:
      ((TextView)localObject).setText(paramView);
      a.b.a(paramViewGroup.hqG, localae.field_username);
      at.AR();
      localObject = com.tencent.mm.y.c.yP().pC();
      if (bg.nm(localae.field_digest)) {
        break label528;
      }
      if (bg.nm(localae.field_digestUser)) {
        break label518;
      }
      if ((localae.field_isSend != 0) || (!s.eb(localae.field_username))) {
        break label506;
      }
      paramView = r.F(localae.field_digestUser, localae.field_username);
    }
    for (;;)
    {
      label471:
      label506:
      label518:
      try
      {
        paramView = String.format(localae.field_digest, new Object[] { paramView });
        paramViewGroup.jpX.setText(h.b(this.ezR, paramView, paramViewGroup.jpX.getTextSize()));
        switch (localae.field_status)
        {
        case 3: 
        case 4: 
        default: 
          paramInt = -1;
          if (paramInt == -1) {
            break label590;
          }
          paramViewGroup.jpY.setBackgroundResource(paramInt);
          paramViewGroup.jpY.setVisibility(0);
          paramInt = localView.getPaddingBottom();
          int i = localView.getPaddingTop();
          int j = localView.getPaddingRight();
          int k = localView.getPaddingLeft();
          if (localae.field_unReadCount <= 100) {
            break label602;
          }
          paramViewGroup.jpZ.setText("...");
          paramViewGroup.jpZ.setVisibility(0);
          localView.setBackgroundResource(R.g.aXU);
          localView.setPadding(k, i, j, paramInt);
          GMTrace.o(8954738376704L, 66718);
          return localView;
        }
      }
      catch (Exception paramView) {}
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
      break;
      if (localae.field_conversationTime == Long.MAX_VALUE)
      {
        paramView = "";
        break label180;
      }
      paramView = n.c(this.ezR, localae.field_conversationTime, true);
      break label180;
      paramView = r.fs(localae.field_digestUser);
      continue;
      paramView = localae.field_digest;
      continue;
      label528:
      paramView = ((as.b)localObject).a(localae.field_isSend, localae.field_username, localae.field_content, tE(localae.field_msgType), this.ezR);
      continue;
      paramInt = -1;
      continue;
      paramInt = R.k.cNc;
      continue;
      paramInt = -1;
      continue;
      paramInt = R.k.cNb;
      continue;
      label590:
      paramViewGroup.jpY.setVisibility(8);
      continue;
      label602:
      if (localae.field_unReadCount > 0)
      {
        paramViewGroup.jpZ.setText(localae.field_unReadCount);
        paramViewGroup.jpZ.setVisibility(0);
      }
      else
      {
        paramViewGroup.jpZ.setVisibility(4);
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(8954067288064L, 66713);
    GMTrace.o(8954067288064L, 66713);
    return 1;
  }
  
  public final void onPause()
  {
    GMTrace.i(8955006812160L, 66720);
    if (this.jpT != null) {
      this.jpT.aJp();
    }
    GMTrace.o(8955006812160L, 66720);
  }
  
  public static final class a
  {
    public ImageView hqG;
    public TextView jpV;
    public TextView jpW;
    public TextView jpX;
    public ImageView jpY;
    public TextView jpZ;
    
    public a()
    {
      GMTrace.i(8944135176192L, 66639);
      GMTrace.o(8944135176192L, 66639);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\qmessage\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */