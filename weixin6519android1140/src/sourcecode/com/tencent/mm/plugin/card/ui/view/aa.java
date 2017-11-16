package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.b.j;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.ui.l.a;
import com.tencent.mm.plugin.card.widget.CardTagTextView;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.pb.common.c.h;
import java.util.LinkedList;

public final class aa
  implements com.tencent.mm.plugin.card.base.c
{
  private BaseAdapter jDh;
  private int jDl;
  protected LinkedList<CardTagTextView> jDp;
  private int jJn;
  int jJo;
  int jJp;
  private Context mContext;
  
  public aa(Context paramContext, BaseAdapter paramBaseAdapter)
  {
    GMTrace.i(20571282735104L, 153268);
    this.jDp = new LinkedList();
    this.mContext = paramContext;
    this.jDh = paramBaseAdapter;
    this.jJn = this.mContext.getResources().getDimensionPixelSize(R.f.aQQ);
    this.jDl = this.mContext.getResources().getDimensionPixelSize(R.f.aQw);
    this.jJo = this.mContext.getResources().getDimensionPixelOffset(R.f.aRj);
    this.jJp = this.mContext.getResources().getDimensionPixelOffset(R.f.aRk);
    GMTrace.o(20571282735104L, 153268);
  }
  
  public final View a(int paramInt, View paramView, b paramb)
  {
    GMTrace.i(20571551170560L, 153270);
    Object localObject1;
    label113:
    Object localObject2;
    if (paramView == null) {
      switch (this.jDh.getItemViewType(paramInt))
      {
      default: 
        paramView = View.inflate(this.mContext, R.i.crf, null);
        localObject1 = new a();
        if ((paramb.ajz().equals("PRIVATE_TICKET_TITLE")) || (paramb.ajz().equals("PRIVATE_INVOICE_TITLE")))
        {
          ((a)localObject1).jKW = ((TextView)paramView.findViewById(R.h.bkF));
          paramView.setTag(localObject1);
          localObject2 = paramView;
          label122:
          if (((a)localObject1).jDw != null)
          {
            float f = this.mContext.getResources().getDimension(R.f.aPB);
            ((a)localObject1).jDw.setTextSize(0, f);
          }
          if (!paramb.ajh()) {
            break label2030;
          }
          if (!paramb.ajz().equals("PRIVATE_TICKET_TITLE")) {
            break label824;
          }
          ((a)localObject1).jKW.setText(this.mContext.getString(R.l.deh));
        }
        break;
      }
    }
    int i;
    label324:
    label824:
    Object localObject3;
    Object localObject4;
    for (;;)
    {
      if ((!paramb.ajz().equals("PRIVATE_TICKET_TITLE")) && (!paramb.ajz().equals("PRIVATE_INVOICE_TITLE")) && (!paramb.ajg()))
      {
        i = paramb.ajv().jxG;
        if ((paramInt != this.jDh.getCount() - 1) || (((a)localObject1).jDt == null)) {
          break label2170;
        }
        paramView = (LinearLayout.LayoutParams)((a)localObject1).jDt.getLayoutParams();
        if (paramView.bottomMargin != this.mContext.getResources().getDimensionPixelOffset(R.f.aQu))
        {
          paramView.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aQu);
          ((a)localObject1).jDt.setLayoutParams(paramView);
        }
      }
      GMTrace.o(20571551170560L, 153270);
      return (View)localObject2;
      localObject1 = View.inflate(this.mContext, R.i.crh, null);
      if (paramb.ajz().equals("PRIVATE_TICKET_TITLE"))
      {
        localObject2 = (TextView)((View)localObject1).findViewById(R.h.bkF);
        paramView = (View)localObject1;
        if (localObject2 == null) {
          break;
        }
        ((TextView)localObject2).setText(this.mContext.getString(R.l.deh));
        paramView = (View)localObject1;
        break;
      }
      paramView = (View)localObject1;
      if (!paramb.ajz().equals("PRIVATE_INVOICE_TITLE")) {
        break;
      }
      localObject2 = (TextView)((View)localObject1).findViewById(R.h.bkF);
      paramView = (View)localObject1;
      if (localObject2 == null) {
        break;
      }
      ((TextView)localObject2).setText(this.mContext.getString(R.l.dcP));
      paramView = (View)localObject1;
      break;
      paramView = View.inflate(this.mContext, R.i.crf, null);
      break;
      paramView = View.inflate(this.mContext, R.i.crk, null);
      break;
      if (paramb.ajg())
      {
        ((a)localObject1).jKX = ((TextView)paramView.findViewById(R.h.bkK));
        ((a)localObject1).jKY = ((TextView)paramView.findViewById(R.h.bkH));
        ((a)localObject1).jKZ = ((TextView)paramView.findViewById(R.h.bkI));
        ((a)localObject1).jLa = ((TextView)paramView.findViewById(R.h.bkJ));
        break label113;
      }
      ((a)localObject1).jDt = ((RelativeLayout)paramView.findViewById(R.h.bjI));
      ((a)localObject1).jDu = ((ImageView)paramView.findViewById(R.h.bkx));
      ((a)localObject1).jIz = paramView.findViewById(R.h.blQ);
      ((a)localObject1).jIA = ((ImageView)paramView.findViewById(R.h.blP));
      ((a)localObject1).jDv = ((TextView)paramView.findViewById(R.h.bjo));
      ((a)localObject1).jDw = ((TextView)paramView.findViewById(R.h.bkW));
      ((a)localObject1).jDz = ((TextView)paramView.findViewById(R.h.bkX));
      ((a)localObject1).jJq = ((ImageView)paramView.findViewById(R.h.bjc));
      ((a)localObject1).jJs = ((ImageView)paramView.findViewById(R.h.bjj));
      ((a)localObject1).jJt = ((ImageView)paramView.findViewById(R.h.bjl));
      ((a)localObject1).jJu = ((ImageView)paramView.findViewById(R.h.bjk));
      ((a)localObject1).jJr = ((LinearLayout)paramView.findViewById(R.h.blp));
      break label113;
      localObject1 = (a)paramView.getTag();
      if (((a)localObject1).jKW != null)
      {
        if (paramb.ajz().equals("PRIVATE_TICKET_TITLE"))
        {
          ((a)localObject1).jKW.setText(this.mContext.getString(R.l.deh));
          localObject2 = paramView;
          break label122;
        }
        ((a)localObject1).jKW.setText(this.mContext.getString(R.l.dcP));
      }
      localObject2 = paramView;
      break label122;
      if (paramb.ajz().equals("PRIVATE_INVOICE_TITLE"))
      {
        ((a)localObject1).jKW.setText(this.mContext.getString(R.l.dcP));
      }
      else if (paramb.ajg())
      {
        paramView = paramb.ajv().tZI;
        ((a)localObject1).jKX.setText(((np)paramView.get(0)).jxI);
        ((a)localObject1).jKZ.setText(paramb.ajv().title);
        paramView = paramb.ajw().tZg;
        localObject3 = String.format(this.mContext.getString(R.l.bkJ), new Object[] { ((np)paramView.get(0)).jxI });
        ((a)localObject1).jLa.setText((CharSequence)localObject3);
        if (paramView.size() >= 2) {
          ((a)localObject1).jKY.setText(((np)paramView.get(1)).jxI);
        }
      }
      else
      {
        if ((this.jDh.getItem(paramInt) instanceof CardInfo))
        {
          localObject4 = (CardInfo)this.jDh.getItem(paramInt);
          if ((!((CardInfo)localObject4).field_card_id.equals("PRIVATE_TICKET_TITLE")) && (!((CardInfo)localObject4).field_card_id.equals("PRIVATE_INVOICE_TITLE"))) {
            break label1354;
          }
        }
        label1050:
        ((a)localObject1).jDt.setVisibility(0);
        ((a)localObject1).jDu.setVisibility(0);
        ((a)localObject1).jDw.setVisibility(0);
        ((a)localObject1).jDz.setVisibility(8);
        ((a)localObject1).jDv.setVisibility(0);
        ((a)localObject1).jDv.setText(paramb.ajv().jyT);
        ((a)localObject1).jDw.setText(paramb.ajv().title);
        if (!paramb.aje()) {
          break label1713;
        }
        ((a)localObject1).jIz.setVisibility(0);
        ((a)localObject1).jDu.setVisibility(4);
        paramView = ((a)localObject1).jIA;
        if (TextUtils.isEmpty(paramb.ajv().tZQ)) {
          break label1691;
        }
        i = this.mContext.getResources().getDimensionPixelSize(R.f.aRn);
        com.tencent.mm.plugin.card.b.m.a(this.mContext, paramView, paramb.ajv().tZQ, i, R.g.aUZ, l.uD(paramb.ajv().gjg));
        label1227:
        if (!paramb.ajc()) {
          break label1934;
        }
        if (!bg.nm(paramb.ajw().tZq)) {
          break label1773;
        }
        paramView = l.bN(l.uD(paramb.ajv().gjg), this.jJo);
        ((a)localObject1).jDt.setBackgroundDrawable(paramView);
        ((a)localObject1).jJs.setVisibility(8);
        ((a)localObject1).jJt.setVisibility(8);
        ((a)localObject1).jJu.setVisibility(0);
        label1309:
        ((a)localObject1).jDv.setTextColor(this.mContext.getResources().getColor(R.e.white));
        ((a)localObject1).jDw.setTextColor(this.mContext.getResources().getColor(R.e.white));
      }
    }
    label1354:
    if (((CardInfo)localObject4).field_stickyIndex % 10 != 0)
    {
      if (((CardInfo)localObject4).field_stickyIndex <= 0) {
        break label2206;
      }
      paramView = j.a(this.mContext, ((CardInfo)localObject4).field_stickyIndex, (CardInfo)localObject4);
      i = 1;
    }
    for (;;)
    {
      if (i != 0)
      {
        i = 0;
        for (;;)
        {
          if (i < ((a)localObject1).jJr.getChildCount())
          {
            localObject3 = (CardTagTextView)((a)localObject1).jJr.getChildAt(i);
            this.jDp.add(localObject3);
            i += 1;
            continue;
            if (h.yp(((CardInfo)localObject4).field_label_wording)) {
              break label2206;
            }
            paramView = ((CardInfo)localObject4).field_label_wording;
            i = 1;
            break;
          }
        }
        ((a)localObject1).jJr.removeAllViews();
        ((a)localObject1).jJr.setVisibility(0);
        if (this.jDp.size() == 0)
        {
          localObject3 = new CardTagTextView(this.mContext);
          label1509:
          ((CardTagTextView)localObject3).setPadding(this.jDl, this.jJn, this.jDl, this.jJn);
          ((CardTagTextView)localObject3).setGravity(17);
          ((CardTagTextView)localObject3).setMinWidth(this.mContext.getResources().getDimensionPixelSize(R.f.aRm));
          ((CardTagTextView)localObject3).setMinHeight(this.mContext.getResources().getDimensionPixelSize(R.f.aRl));
          if (!((CardInfo)localObject4).ajc()) {
            break label1654;
          }
          ((CardTagTextView)localObject3).setTextColor(com.tencent.mm.br.a.c(this.mContext, R.e.white));
        }
        for (((CardTagTextView)localObject3).fillColor = com.tencent.mm.br.a.c(this.mContext, R.e.aNk);; ((CardTagTextView)localObject3).fillColor = 0)
        {
          ((CardTagTextView)localObject3).setText(paramView);
          ((CardTagTextView)localObject3).setTextSize(1, 10.0F);
          ((a)localObject1).jJr.addView((View)localObject3);
          break;
          localObject3 = (CardTagTextView)this.jDp.removeFirst();
          break label1509;
          label1654:
          ((CardTagTextView)localObject3).setTextColor(com.tencent.mm.br.a.c(this.mContext, R.e.aOm));
        }
      }
      ((a)localObject1).jJr.setVisibility(8);
      break label1050;
      label1691:
      com.tencent.mm.plugin.card.b.m.a(paramView, R.g.aUZ, l.uD(paramb.ajv().gjg));
      break label1227;
      label1713:
      ((a)localObject1).jIz.setVisibility(8);
      ((a)localObject1).jDu.setVisibility(0);
      i = this.mContext.getResources().getDimensionPixelSize(R.f.aRn);
      com.tencent.mm.plugin.card.b.m.a(((a)localObject1).jDu, paramb.ajv().jxH, i, R.g.aYg, true);
      break label1227;
      label1773:
      ((a)localObject1).jDt.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.g.aUU));
      ((a)localObject1).jJs.setVisibility(0);
      ((a)localObject1).jJt.setVisibility(0);
      paramView = ((a)localObject1).jJs;
      localObject3 = paramb.ajw().tZq;
      localObject4 = new c.a();
      ((c.a)localObject4).gKF = e.ghz;
      n.Je();
      ((c.a)localObject4).gKX = null;
      ((c.a)localObject4).gKE = com.tencent.mm.plugin.card.model.m.tZ((String)localObject3);
      ((c.a)localObject4).gKC = true;
      ((c.a)localObject4).gLb = true;
      ((c.a)localObject4).gKA = true;
      ((c.a)localObject4).gKR = R.g.aUU;
      localObject4 = ((c.a)localObject4).Jn();
      n.Jd().a((String)localObject3, paramView, (com.tencent.mm.ao.a.a.c)localObject4);
      paramView.setImageMatrix(new Matrix());
      ((a)localObject1).jJu.setVisibility(8);
      break label1309;
      label1934:
      ((a)localObject1).jJu.setVisibility(8);
      ((a)localObject1).jJs.setVisibility(8);
      ((a)localObject1).jJt.setVisibility(8);
      ((a)localObject1).jDt.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.g.aUU));
      ((a)localObject1).jDw.setTextColor(this.mContext.getResources().getColor(R.e.aNe));
      ((a)localObject1).jDv.setTextColor(this.mContext.getResources().getColor(R.e.aNe));
      break;
      label2030:
      if ((paramb.ajz().equals("PRIVATE_TICKET_TITLE")) || (paramb.ajz().equals("PRIVATE_INVOICE_TITLE")) || (paramb.ajg())) {
        break;
      }
      ((a)localObject1).jDu.setVisibility(8);
      ((a)localObject1).jDw.setVisibility(8);
      ((a)localObject1).jDv.setVisibility(8);
      ((a)localObject1).jJr.setVisibility(8);
      ((a)localObject1).jDz.setVisibility(0);
      paramView = l.bN(this.mContext.getResources().getColor(R.e.aNj), this.jJo);
      ((a)localObject1).jDt.setBackgroundDrawable(paramView);
      ((a)localObject1).jDz.setText(this.mContext.getResources().getString(R.l.ddo));
      break;
      label2170:
      paramView = (LinearLayout.LayoutParams)((a)localObject1).jDt.getLayoutParams();
      if (paramView.bottomMargin == 0) {
        break label324;
      }
      paramView.bottomMargin = 0;
      ((a)localObject1).jDt.setLayoutParams(paramView);
      break label324;
      label2206:
      paramView = null;
      i = 0;
    }
  }
  
  public final void a(View paramView, int paramInt, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(20571953823744L, 153273);
    CardInfo localCardInfo = (CardInfo)this.jDh.getItem(paramInt);
    if ((localCardInfo.field_card_id.equals("PRIVATE_TICKET_TITLE")) || (localCardInfo.field_card_id.equals("PRIVATE_INVOICE_TITLE")))
    {
      GMTrace.o(20571953823744L, 153273);
      return;
    }
    paramView = (a)paramView.getTag();
    paramView.jJq.setTag(Integer.valueOf(paramInt));
    paramView.jJq.setOnClickListener(paramOnClickListener);
    GMTrace.o(20571953823744L, 153273);
  }
  
  public final void release()
  {
    GMTrace.i(20571416952832L, 153269);
    this.mContext = null;
    this.jDh = null;
    if (this.jDp != null) {
      this.jDp.clear();
    }
    GMTrace.o(20571416952832L, 153269);
  }
  
  public final void u(View paramView, int paramInt)
  {
    GMTrace.i(20571685388288L, 153271);
    ((l.a)paramView.getTag()).jJq.setImageResource(paramInt);
    GMTrace.o(20571685388288L, 153271);
  }
  
  public final void v(View paramView, int paramInt)
  {
    GMTrace.i(20571819606016L, 153272);
    ((l.a)paramView.getTag()).jJq.setVisibility(paramInt);
    GMTrace.o(20571819606016L, 153272);
  }
  
  public final class a
  {
    public RelativeLayout jDt;
    public ImageView jDu;
    public TextView jDv;
    public TextView jDw;
    public TextView jDz;
    public ImageView jIA;
    public View jIz;
    public ImageView jJq;
    public LinearLayout jJr;
    public ImageView jJs;
    public ImageView jJt;
    public ImageView jJu;
    public TextView jKW;
    public TextView jKX;
    public TextView jKY;
    public TextView jKZ;
    public TextView jLa;
    
    public a()
    {
      GMTrace.i(20572088041472L, 153274);
      GMTrace.o(20572088041472L, 153274);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */