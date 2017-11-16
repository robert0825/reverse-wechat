package com.tencent.mm.plugin.card.ui;

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
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.widget.CardTagTextView;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.pb.common.c.h;
import java.util.LinkedList;

public final class l
  implements com.tencent.mm.plugin.card.base.c
{
  private BaseAdapter jDh;
  private int jDl;
  protected LinkedList<CardTagTextView> jDp;
  private int jJn;
  int jJo;
  int jJp;
  private Context mContext;
  
  public l(Context paramContext, BaseAdapter paramBaseAdapter)
  {
    GMTrace.i(5030883098624L, 37483);
    this.jDp = new LinkedList();
    this.mContext = paramContext;
    this.jDh = paramBaseAdapter;
    this.jJn = this.mContext.getResources().getDimensionPixelSize(R.f.aQQ);
    this.jDl = this.mContext.getResources().getDimensionPixelSize(R.f.aQw);
    this.jJo = this.mContext.getResources().getDimensionPixelOffset(R.f.aRj);
    this.jJp = this.mContext.getResources().getDimensionPixelOffset(R.f.aRk);
    GMTrace.o(5030883098624L, 37483);
  }
  
  public final View a(int paramInt, View paramView, b paramb)
  {
    GMTrace.i(5031151534080L, 37485);
    Object localObject1;
    Object localObject2;
    label274:
    Object localObject4;
    int i;
    if (paramView == null) {
      if (paramb.ajz().equals("PRIVATE_TICKET_TITLE"))
      {
        localObject1 = View.inflate(this.mContext, R.i.crh, null);
        localObject2 = (TextView)((View)localObject1).findViewById(R.h.bkF);
        paramView = (View)localObject1;
        if (localObject2 != null)
        {
          ((TextView)localObject2).setText(this.mContext.getString(R.l.deh));
          paramView = (View)localObject1;
        }
        localObject1 = new a();
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
        paramView.setTag(localObject1);
        localObject2 = paramView;
        if (((a)localObject1).jDw != null)
        {
          float f = this.mContext.getResources().getDimension(R.f.aPB);
          ((a)localObject1).jDw.setTextSize(0, f);
        }
        if (!(this.jDh.getItem(paramInt) instanceof CardInfo)) {
          break label717;
        }
        localObject4 = (CardInfo)this.jDh.getItem(paramInt);
        if (((CardInfo)localObject4).field_stickyIndex % 10 == 0) {
          break label527;
        }
        if (((CardInfo)localObject4).field_stickyIndex <= 0) {
          break label1649;
        }
        paramView = j.a(this.mContext, ((CardInfo)localObject4).field_stickyIndex, (CardInfo)localObject4);
        i = 1;
      }
    }
    for (;;)
    {
      label372:
      Object localObject3;
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
            if (paramb.ajz().equals("PRIVATE_INVOICE_TITLE"))
            {
              localObject1 = View.inflate(this.mContext, R.i.crh, null);
              localObject2 = (TextView)((View)localObject1).findViewById(R.h.bkF);
              paramView = (View)localObject1;
              if (localObject2 == null) {
                break;
              }
              ((TextView)localObject2).setText(this.mContext.getString(R.l.dcP));
              paramView = (View)localObject1;
              break;
            }
            paramView = View.inflate(this.mContext, R.i.crf, null);
            break;
            localObject1 = (a)paramView.getTag();
            localObject2 = paramView;
            break label274;
            label527:
            if (h.yp(((CardInfo)localObject4).field_label_wording)) {
              break label1649;
            }
            paramView = ((CardInfo)localObject4).field_label_wording;
            i = 1;
            break label372;
          }
        }
        ((a)localObject1).jJr.removeAllViews();
        ((a)localObject1).jJr.setVisibility(0);
        if (this.jDp.size() == 0)
        {
          localObject3 = new CardTagTextView(this.mContext);
          ((CardTagTextView)localObject3).setPadding(this.jDl, this.jJn, this.jDl, this.jJn);
          ((CardTagTextView)localObject3).setGravity(17);
          ((CardTagTextView)localObject3).setMinWidth(this.mContext.getResources().getDimensionPixelSize(R.f.aRm));
          ((CardTagTextView)localObject3).setMinHeight(this.mContext.getResources().getDimensionPixelSize(R.f.aRl));
          if (!((CardInfo)localObject4).ajc()) {
            break label1134;
          }
          ((CardTagTextView)localObject3).setTextColor(com.tencent.mm.br.a.c(this.mContext, R.e.white));
          ((CardTagTextView)localObject3).fillColor = com.tencent.mm.br.a.c(this.mContext, R.e.aNk);
          label692:
          ((CardTagTextView)localObject3).setText(paramView);
          ((CardTagTextView)localObject3).setTextSize(1, 10.0F);
          ((a)localObject1).jJr.addView((View)localObject3);
          label717:
          if (!paramb.ajh()) {
            break label1510;
          }
          ((a)localObject1).jDu.setVisibility(0);
          ((a)localObject1).jDw.setVisibility(0);
          ((a)localObject1).jDz.setVisibility(8);
          ((a)localObject1).jDv.setVisibility(0);
          ((a)localObject1).jDv.setText(paramb.ajv().jyT);
          ((a)localObject1).jDw.setText(paramb.ajv().title);
          if (!paramb.aje()) {
            break label1193;
          }
          ((a)localObject1).jIz.setVisibility(0);
          ((a)localObject1).jDu.setVisibility(4);
          paramView = ((a)localObject1).jIA;
          if (TextUtils.isEmpty(paramb.ajv().tZQ)) {
            break label1171;
          }
          i = this.mContext.getResources().getDimensionPixelSize(R.f.aRn);
          com.tencent.mm.plugin.card.b.m.a(this.mContext, paramView, paramb.ajv().tZQ, i, R.g.aUZ, com.tencent.mm.plugin.card.b.l.uD(paramb.ajv().gjg));
          label894:
          if (!paramb.ajc()) {
            break label1414;
          }
          if (!bg.nm(paramb.ajw().tZq)) {
            break label1253;
          }
          paramView = com.tencent.mm.plugin.card.b.l.bN(com.tencent.mm.plugin.card.b.l.uD(paramb.ajv().gjg), this.jJo);
          ((a)localObject1).jDt.setBackgroundDrawable(paramView);
          ((a)localObject1).jJs.setVisibility(8);
          ((a)localObject1).jJt.setVisibility(8);
          ((a)localObject1).jJu.setVisibility(0);
          label976:
          ((a)localObject1).jDv.setTextColor(this.mContext.getResources().getColor(R.e.white));
          ((a)localObject1).jDw.setTextColor(this.mContext.getResources().getColor(R.e.white));
          label1018:
          i = paramb.ajv().jxG;
          if ((paramInt != this.jDh.getCount() - 1) || (((a)localObject1).jDt == null)) {
            break label1613;
          }
          paramView = (LinearLayout.LayoutParams)((a)localObject1).jDt.getLayoutParams();
          if (paramView.bottomMargin != this.mContext.getResources().getDimensionPixelOffset(R.f.aQu))
          {
            paramView.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aQu);
            ((a)localObject1).jDt.setLayoutParams(paramView);
          }
        }
      }
      for (;;)
      {
        GMTrace.o(5031151534080L, 37485);
        return (View)localObject2;
        localObject3 = (CardTagTextView)this.jDp.removeFirst();
        break;
        label1134:
        ((CardTagTextView)localObject3).setTextColor(com.tencent.mm.br.a.c(this.mContext, R.e.aOm));
        ((CardTagTextView)localObject3).fillColor = 0;
        break label692;
        ((a)localObject1).jJr.setVisibility(8);
        break label717;
        label1171:
        com.tencent.mm.plugin.card.b.m.a(paramView, R.g.aUZ, com.tencent.mm.plugin.card.b.l.uD(paramb.ajv().gjg));
        break label894;
        label1193:
        ((a)localObject1).jIz.setVisibility(8);
        ((a)localObject1).jDu.setVisibility(0);
        i = this.mContext.getResources().getDimensionPixelSize(R.f.aRn);
        com.tencent.mm.plugin.card.b.m.a(((a)localObject1).jDu, paramb.ajv().jxH, i, R.g.aYg, true);
        break label894;
        label1253:
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
        break label976;
        label1414:
        ((a)localObject1).jJu.setVisibility(8);
        ((a)localObject1).jJs.setVisibility(8);
        ((a)localObject1).jJt.setVisibility(8);
        ((a)localObject1).jDt.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.g.aUU));
        ((a)localObject1).jDw.setTextColor(this.mContext.getResources().getColor(R.e.aNe));
        ((a)localObject1).jDv.setTextColor(this.mContext.getResources().getColor(R.e.aNe));
        break label1018;
        label1510:
        ((a)localObject1).jDu.setVisibility(8);
        ((a)localObject1).jDw.setVisibility(8);
        ((a)localObject1).jDv.setVisibility(8);
        ((a)localObject1).jJr.setVisibility(8);
        ((a)localObject1).jDz.setVisibility(0);
        paramView = com.tencent.mm.plugin.card.b.l.bN(this.mContext.getResources().getColor(R.e.aNj), this.jJo);
        ((a)localObject1).jDt.setBackgroundDrawable(paramView);
        ((a)localObject1).jDz.setText(this.mContext.getResources().getString(R.l.ddo));
        break label1018;
        label1613:
        paramView = (LinearLayout.LayoutParams)((a)localObject1).jDt.getLayoutParams();
        if (paramView.bottomMargin != 0)
        {
          paramView.bottomMargin = 0;
          ((a)localObject1).jDt.setLayoutParams(paramView);
        }
      }
      label1649:
      paramView = null;
      i = 0;
    }
  }
  
  public final void a(View paramView, int paramInt, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(5031554187264L, 37488);
    paramView = (a)paramView.getTag();
    paramView.jJq.setTag(Integer.valueOf(paramInt));
    paramView.jJq.setOnClickListener(paramOnClickListener);
    GMTrace.o(5031554187264L, 37488);
  }
  
  public final void release()
  {
    GMTrace.i(5031017316352L, 37484);
    this.mContext = null;
    this.jDh = null;
    if (this.jDp != null) {
      this.jDp.clear();
    }
    GMTrace.o(5031017316352L, 37484);
  }
  
  public final void u(View paramView, int paramInt)
  {
    GMTrace.i(5031285751808L, 37486);
    ((a)paramView.getTag()).jJq.setImageResource(paramInt);
    GMTrace.o(5031285751808L, 37486);
  }
  
  public final void v(View paramView, int paramInt)
  {
    GMTrace.i(5031419969536L, 37487);
    ((a)paramView.getTag()).jJq.setVisibility(paramInt);
    GMTrace.o(5031419969536L, 37487);
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
    
    public a()
    {
      GMTrace.i(4959076614144L, 36948);
      GMTrace.o(4959076614144L, 36948);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */