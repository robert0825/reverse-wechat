package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class d
  extends a
{
  private View jLV;
  private TextView jLW;
  private TextView jLX;
  private View jLY;
  private TextView jLZ;
  private TextView jMa;
  private View jMb;
  private View jMc;
  private View jMd;
  
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4883377815552L, 36384);
    GMTrace.o(4883377815552L, 36384);
  }
  
  protected final void ane()
  {
    GMTrace.i(4883512033280L, 36385);
    this.jLV = this.jLI.findViewById(R.h.bSX);
    this.jLW = ((TextView)this.jLI.findViewById(R.h.bSZ));
    this.jLX = ((TextView)this.jLI.findViewById(R.h.bSY));
    this.jLY = this.jLI.findViewById(R.h.bgB);
    this.jLZ = ((TextView)this.jLI.findViewById(R.h.bgD));
    this.jMa = ((TextView)this.jLI.findViewById(R.h.bgC));
    this.jMc = this.jLI.findViewById(R.h.blU);
    this.jMd = this.jLI.findViewById(R.h.bjn);
    GMTrace.o(4883512033280L, 36385);
  }
  
  protected final void anf()
  {
    GMTrace.i(4883646251008L, 36386);
    Object localObject3;
    Object localObject2;
    Object localObject1;
    if ((this.jwZ.ajv().tZI != null) && (this.jwZ.ajv().tZI.size() > 0))
    {
      localObject3 = this.jwZ.ajv().tZI;
      localObject2 = null;
      if (((LinkedList)localObject3).size() == 1)
      {
        localObject1 = (np)((LinkedList)localObject3).get(0);
        if (localObject1 != null)
        {
          this.jLV.setVisibility(0);
          this.jLW.setText(((np)localObject1).title);
          this.jLX.setText(((np)localObject1).jxI);
          if (!TextUtils.isEmpty(((np)localObject1).uaK)) {
            this.jLW.setTextColor(l.uD(((np)localObject1).uaK));
          }
          if (!TextUtils.isEmpty(((np)localObject1).uaL)) {
            this.jLX.setTextColor(l.uD(((np)localObject1).uaL));
          }
        }
        if (localObject2 != null)
        {
          this.jLY.setVisibility(0);
          this.jLZ.setText(((np)localObject2).title);
          this.jMa.setText(((np)localObject2).jxI);
          if (!TextUtils.isEmpty(((np)localObject2).uaK)) {
            this.jLZ.setTextColor(l.uD(((np)localObject2).uaK));
          }
          if (!TextUtils.isEmpty(((np)localObject2).uaL)) {
            this.jMa.setTextColor(l.uD(((np)localObject2).uaL));
          }
        }
        label237:
        if ((!this.jwZ.aja()) || (this.jwZ.ajg())) {
          break label364;
        }
        w.i("MicroMsg.CardWidgetInvoice", "is not invoice, don't updateCardSecondaryFieldListView");
        label268:
        if (!this.jwZ.ajr()) {
          break label892;
        }
        this.jMc.setVisibility(8);
      }
    }
    for (;;)
    {
      if ((this.jwZ.ajw().tZp != null) || (!this.jwZ.ajr())) {
        break label970;
      }
      this.jMd.setVisibility(0);
      GMTrace.o(4883646251008L, 36386);
      return;
      localObject1 = (np)((LinkedList)localObject3).get(0);
      localObject2 = (np)((LinkedList)localObject3).get(1);
      break;
      w.i("MicroMsg.CardWidgetInvoice", "primary_fields is null");
      break label237;
      label364:
      if ((this.jwZ.ajw().tZg != null) && (this.jwZ.ajw().tZg.size() > 0))
      {
        if (this.jMb == null) {
          this.jMb = ((ViewStub)this.jLI.findViewById(R.h.blq)).inflate();
        }
        this.jLI.findViewById(R.h.bjn).setVisibility(8);
        localObject1 = this.jMb;
        localObject3 = this.jwZ;
        localObject2 = this.hwh;
        localObject3 = ((b)localObject3).ajw().tZg;
        if (((LinkedList)localObject3).size() == 1)
        {
          ((View)localObject1).findViewById(R.h.blu).setVisibility(0);
          localObject3 = (np)((LinkedList)localObject3).get(0);
          ((TextView)((View)localObject1).findViewById(R.h.caY)).setText(((np)localObject3).title);
          ((TextView)((View)localObject1).findViewById(R.h.caV)).setText(((np)localObject3).jxI);
          ((View)localObject1).findViewById(R.h.blu).setOnClickListener((View.OnClickListener)localObject2);
          if (!TextUtils.isEmpty(((np)localObject3).uaK)) {
            ((TextView)((View)localObject1).findViewById(R.h.caY)).setTextColor(l.uD(((np)localObject3).uaK));
          }
          if (!TextUtils.isEmpty(((np)localObject3).uaL)) {
            ((TextView)((View)localObject1).findViewById(R.h.caV)).setTextColor(l.uD(((np)localObject3).uaL));
          }
          ((View)localObject1).findViewById(R.h.blv).setVisibility(8);
          break label268;
        }
        if (((LinkedList)localObject3).size() < 2) {
          break label268;
        }
        np localnp = (np)((LinkedList)localObject3).get(0);
        ((TextView)((View)localObject1).findViewById(R.h.caY)).setText(localnp.title);
        ((TextView)((View)localObject1).findViewById(R.h.caV)).setText(localnp.jxI);
        if (!TextUtils.isEmpty(localnp.uaK)) {
          ((TextView)((View)localObject1).findViewById(R.h.caY)).setTextColor(l.uD(localnp.uaK));
        }
        if (!TextUtils.isEmpty(localnp.uaL)) {
          ((TextView)((View)localObject1).findViewById(R.h.caV)).setTextColor(l.uD(localnp.uaL));
        }
        localObject3 = (np)((LinkedList)localObject3).get(1);
        ((TextView)((View)localObject1).findViewById(R.h.caZ)).setText(((np)localObject3).title);
        ((TextView)((View)localObject1).findViewById(R.h.caW)).setText(((np)localObject3).jxI);
        if (!TextUtils.isEmpty(((np)localObject3).uaK)) {
          ((TextView)((View)localObject1).findViewById(R.h.caZ)).setTextColor(l.uD(((np)localObject3).uaK));
        }
        if (!TextUtils.isEmpty(((np)localObject3).uaL)) {
          ((TextView)((View)localObject1).findViewById(R.h.caW)).setTextColor(l.uD(((np)localObject3).uaL));
        }
        ((View)localObject1).findViewById(R.h.blu).setOnClickListener((View.OnClickListener)localObject2);
        ((View)localObject1).findViewById(R.h.blv).setOnClickListener((View.OnClickListener)localObject2);
        break label268;
      }
      if (this.jMb != null) {
        this.jMb.setVisibility(8);
      }
      this.jLI.findViewById(R.h.bjn).setVisibility(8);
      break label268;
      label892:
      this.jMc.setVisibility(0);
      localObject1 = (TextView)this.jMc.findViewById(R.h.blD);
      if (!TextUtils.isEmpty(this.jwZ.ajv().uag)) {
        ((TextView)localObject1).setText(this.jwZ.ajv().uag);
      } else {
        m.b((TextView)localObject1, this.jwZ.ajw().status);
      }
    }
    label970:
    this.jMd.setVisibility(8);
    GMTrace.o(4883646251008L, 36386);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */