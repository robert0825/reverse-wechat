package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.plugin.card.sharecard.model.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public final class f
{
  private MMActivity iPC;
  View jBw;
  private b jCy;
  private int jHa;
  private View jHb;
  private TextView jHc;
  private TextView jHd;
  private ImageView jHe;
  private ImageView[] jHf;
  private ImageView jHg;
  
  public f(MMActivity paramMMActivity, View paramView, int paramInt, b paramb)
  {
    GMTrace.i(4956794912768L, 36931);
    this.jHf = new ImageView[3];
    this.iPC = paramMMActivity;
    this.jBw = paramView;
    this.jHa = paramInt;
    this.jCy = paramb;
    this.jHb = this.jBw.findViewById(R.h.bks);
    this.jHc = ((TextView)this.jBw.findViewById(R.h.bku));
    this.jHd = ((TextView)this.jBw.findViewById(R.h.bkt));
    this.jHe = ((ImageView)this.jBw.findViewById(R.h.bkv));
    this.jHf[0] = ((ImageView)this.jBw.findViewById(R.h.bkp));
    this.jHf[1] = ((ImageView)this.jBw.findViewById(R.h.bkq));
    this.jHf[2] = ((ImageView)this.jBw.findViewById(R.h.bkr));
    this.jHg = ((ImageView)this.jBw.findViewById(R.h.bln));
    if (this.jHa == 1)
    {
      this.jHc.setText(this.iPC.getString(R.l.ddb, new Object[] { Integer.valueOf(0) }));
      this.jHe.setImageResource(R.k.cKY);
      GMTrace.o(4956794912768L, 36931);
      return;
    }
    if (this.jHa == 2)
    {
      this.jHc.setText(R.l.ddK);
      this.jHe.setImageResource(R.k.cKX);
      GMTrace.o(4956794912768L, 36931);
      return;
    }
    if (this.jHa == 3)
    {
      this.jHc.setText(R.l.dei);
      this.jHe.setImageResource(R.k.cKZ);
    }
    GMTrace.o(4956794912768L, 36931);
  }
  
  public final void ar()
  {
    GMTrace.i(4957063348224L, 36933);
    Object localObject;
    if (this.jHa == 2)
    {
      localObject = (l)al.aks().getValue("key_share_card_layout_data");
      if (localObject == null)
      {
        w.w("MicroMsg.CardHomePageItemController", "updateShareCardView data is null");
        GMTrace.o(4957063348224L, 36933);
        return;
      }
      if (bg.nm(((l)localObject).jBl)) {
        this.jHd.setVisibility(8);
      }
      while (bg.cc(((l)localObject).jBk))
      {
        i = 0;
        while (i < 3)
        {
          this.jHf[i].setVisibility(8);
          i += 1;
        }
        this.jHd.setVisibility(0);
        this.jHd.setText(((l)localObject).jBl);
      }
      int i = 0;
      if (i < 3)
      {
        if (i < ((l)localObject).jBk.size())
        {
          this.jHf[i].setVisibility(0);
          int j = this.iPC.getResources().getDimensionPixelSize(R.f.aQr);
          m.a(this.jHf[i], (String)((l)localObject).jBk.get(i), j, R.g.aYg, false);
        }
        for (;;)
        {
          i += 1;
          break;
          this.jHf[i].setVisibility(8);
        }
      }
      if ((!bg.cc(((l)localObject).jBk)) && (((l)localObject).jBk.size() == 1) && (((l)localObject).eTS) && (!((l)localObject).eTT))
      {
        this.jHg.setVisibility(0);
        GMTrace.o(4957063348224L, 36933);
        return;
      }
      this.jHg.setVisibility(8);
      GMTrace.o(4957063348224L, 36933);
      return;
    }
    if (this.jHa == 3)
    {
      this.jHc.setText(R.l.dei);
      this.jBw.findViewById(R.h.bko).setVisibility(8);
      localObject = (String)al.aks().getValue("key_card_entrance_tips");
      if (!bg.nm((String)localObject))
      {
        this.jHd.setText((CharSequence)localObject);
        this.jHd.setVisibility(0);
        GMTrace.o(4957063348224L, 36933);
        return;
      }
      this.jHd.setVisibility(8);
    }
    GMTrace.o(4957063348224L, 36933);
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(4956929130496L, 36932);
    this.jHb.setOnClickListener(paramOnClickListener);
    GMTrace.o(4956929130496L, 36932);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */