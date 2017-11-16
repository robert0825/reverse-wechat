package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.c;
import com.tencent.mm.plugin.card.widget.CardTagTextView;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.bik;
import com.tencent.mm.protocal.c.bmp;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
  implements c
{
  private BaseAdapter jDh;
  private long jDi;
  private long jDj;
  private int jDk;
  private int jDl;
  private ArrayList<Integer> jDm;
  private ArrayList<String> jDn;
  private ArrayList<String> jDo;
  protected LinkedList<CardTagTextView> jDp;
  private Context mContext;
  
  public j(Context paramContext, BaseAdapter paramBaseAdapter)
  {
    GMTrace.i(5077859303424L, 37833);
    this.jDi = 0L;
    this.jDj = 0L;
    this.jDm = new ArrayList();
    this.jDn = new ArrayList();
    this.jDo = new ArrayList();
    this.jDp = new LinkedList();
    this.mContext = paramContext;
    this.jDh = paramBaseAdapter;
    this.jDk = this.mContext.getResources().getDimensionPixelSize(R.f.aQG);
    this.jDl = this.mContext.getResources().getDimensionPixelSize(R.f.aQw);
    this.jDm.clear();
    this.jDn.clear();
    this.jDo.clear();
    GMTrace.o(5077859303424L, 37833);
  }
  
  private CardTagTextView alc()
  {
    GMTrace.i(5078664609792L, 37839);
    if (this.jDp.size() == 0)
    {
      localCardTagTextView = new CardTagTextView(this.mContext);
      GMTrace.o(5078664609792L, 37839);
      return localCardTagTextView;
    }
    CardTagTextView localCardTagTextView = (CardTagTextView)this.jDp.removeFirst();
    GMTrace.o(5078664609792L, 37839);
    return localCardTagTextView;
  }
  
  public final View a(int paramInt, View paramView, com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5078127738880L, 37835);
    long l = System.currentTimeMillis();
    a locala;
    Object localObject1;
    int j;
    int i;
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, R.i.bly, null);
      locala = new a();
      locala.jDq = ((LinearLayout)paramView.findViewById(R.h.blG));
      locala.jDr = ((TextView)paramView.findViewById(R.h.bkB));
      locala.jDs = ((TextView)paramView.findViewById(R.h.bkC));
      locala.jDt = ((RelativeLayout)paramView.findViewById(R.h.bjI));
      locala.jDu = ((ImageView)paramView.findViewById(R.h.bkx));
      locala.jDv = ((TextView)paramView.findViewById(R.h.bjo));
      locala.jDw = ((TextView)paramView.findViewById(R.h.bkW));
      locala.jDA = paramView.findViewById(R.h.bkD);
      locala.jDx = ((TextView)paramView.findViewById(R.h.subtitle));
      locala.jDy = ((TextView)paramView.findViewById(R.h.bje));
      locala.jDz = ((TextView)paramView.findViewById(R.h.bkX));
      locala.jDB = ((TextView)paramView.findViewById(R.h.bjK));
      locala.jDx.setEllipsize(TextUtils.TruncateAt.MIDDLE);
      paramView.setTag(locala);
      localObject1 = (com.tencent.mm.plugin.card.base.b)this.jDh.getItem(paramInt);
      j = ((com.tencent.mm.plugin.card.base.b)localObject1).ajE();
      if (!com.tencent.mm.plugin.card.sharecard.a.b.lI(((com.tencent.mm.plugin.card.base.b)localObject1).ajE())) {
        break label1820;
      }
      if (paramInt != 0) {
        break label853;
      }
      if (TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject1).lC(j))) {
        break label1820;
      }
      i = 1;
    }
    for (;;)
    {
      label290:
      if (i != 0)
      {
        locala.jDr.setVisibility(0);
        locala.jDr.setText(((com.tencent.mm.plugin.card.base.b)localObject1).lC(j));
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject1).ajD()))
        {
          locala.jDs.setVisibility(0);
          locala.jDs.setText(((com.tencent.mm.plugin.card.base.b)localObject1).ajD());
          label358:
          if (!paramb.ajh()) {
            break label1659;
          }
          locala.jDu.setVisibility(0);
          locala.jDv.setVisibility(0);
          locala.jDq.setVisibility(0);
          locala.jDw.setVisibility(0);
          locala.jDB.setVisibility(0);
          locala.jDA.setVisibility(0);
          locala.jDx.setVisibility(0);
          locala.jDy.setVisibility(0);
          locala.jDz.setVisibility(8);
          locala.jDv.setText(paramb.ajv().jyT);
          if (!paramb.aje()) {
            break label1041;
          }
          if ((paramb.ajv().tZI == null) || (paramb.ajv().tZI.size() != 1)) {
            break label929;
          }
          locala.jDw.setText(((np)paramb.ajv().tZI.get(0)).title);
          label530:
          i = this.mContext.getResources().getDimensionPixelSize(R.f.aRn);
          m.a(locala.jDu, paramb.ajv().jxH, i, R.g.aYg, true);
          locala.jDv.setTextColor(this.mContext.getResources().getColor(R.e.aNe));
          localObject1 = com.tencent.mm.plugin.card.sharecard.a.b.ub(paramb.ajA());
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            break label1061;
          }
          locala.jDy.setText((CharSequence)localObject1);
          label618:
          localObject1 = com.tencent.mm.plugin.card.sharecard.a.b.jg(paramb.ajA());
          boolean bool = com.tencent.mm.plugin.card.sharecard.a.b.lI(paramb.ajE());
          if ((TextUtils.isEmpty((CharSequence)localObject1)) || (!bool)) {
            break label1075;
          }
          locala.jDx.setText(h.c(this.mContext, (CharSequence)localObject1, this.mContext.getResources().getDimensionPixelOffset(R.f.aQP)));
          label683:
          i = com.tencent.mm.plugin.card.sharecard.a.b.uc(paramb.ajA());
          if ((i <= 1) || (!bool)) {
            break label1191;
          }
          locala.jDB.setText("X" + i);
          locala.jDB.setVisibility(0);
        }
      }
      label740:
      label853:
      label929:
      label1041:
      label1061:
      label1075:
      label1191:
      Object localObject2;
      for (;;)
      {
        if (((paramb.ajv().uab != null) && (!bg.cc(paramb.ajv().uab.uWz))) || (com.tencent.mm.plugin.card.sharecard.a.b.ue(paramb.ajA())))
        {
          locala.jDq.setVisibility(0);
          i = 0;
          for (;;)
          {
            if (i < locala.jDq.getChildCount())
            {
              localObject1 = (CardTagTextView)locala.jDq.getChildAt(i);
              this.jDp.add(localObject1);
              i += 1;
              continue;
              locala = (a)paramView.getTag();
              break;
              if (j == ((com.tencent.mm.plugin.card.base.b)this.jDh.getItem(paramInt - 1)).ajE()) {
                break label1820;
              }
              i = 1;
              break label290;
              locala.jDs.setVisibility(8);
              break label358;
              locala.jDr.setVisibility(8);
              locala.jDs.setVisibility(8);
              locala.jDr.setText("");
              break label358;
              if ((paramb.ajv().tZI == null) || (paramb.ajv().tZI.size() != 2)) {
                break label530;
              }
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append(((np)paramb.ajv().tZI.get(0)).title);
              ((StringBuilder)localObject1).append("-");
              ((StringBuilder)localObject1).append(((np)paramb.ajv().tZI.get(1)).title);
              locala.jDw.setText(((StringBuilder)localObject1).toString());
              break label530;
              locala.jDw.setText(paramb.ajv().title);
              break label530;
              locala.jDy.setText("");
              break label618;
              if (!TextUtils.isEmpty(paramb.ajB()))
              {
                localObject1 = l.uG(paramb.ajB());
                if (!TextUtils.isEmpty((CharSequence)localObject1))
                {
                  localObject1 = this.mContext.getResources().getString(R.l.ddD, new Object[] { localObject1 });
                  locala.jDx.setText(h.c(this.mContext, (CharSequence)localObject1, this.mContext.getResources().getDimensionPixelOffset(R.f.aQP)));
                  break label683;
                }
                locala.jDx.setText("");
                break label683;
              }
              locala.jDx.setText("");
              break label683;
              locala.jDB.setVisibility(8);
              break label740;
            }
          }
          locala.jDq.removeAllViews();
          if (com.tencent.mm.plugin.card.sharecard.a.b.ue(paramb.ajA()))
          {
            localObject1 = alc();
            ((CardTagTextView)localObject1).setPadding(this.jDl, this.jDk, this.jDl, this.jDk);
            ((CardTagTextView)localObject1).setTextColor(this.mContext.getResources().getColor(R.e.aOL));
            ((CardTagTextView)localObject1).setText(this.mContext.getString(R.l.ddL));
            ((CardTagTextView)localObject1).setTextSize(12.0F);
            localObject2 = new LinearLayout.LayoutParams(-2, -2);
            ((LinearLayout.LayoutParams)localObject2).rightMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aQu);
            locala.jDq.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
          }
          if ((paramb.ajv().uab == null) || (bg.cc(paramb.ajv().uab.uWz))) {
            break label1485;
          }
          localObject1 = paramb.ajv().uab.uWz.iterator();
        }
      }
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (bik)((Iterator)localObject1).next();
        CardTagTextView localCardTagTextView = alc();
        localCardTagTextView.setPadding(this.jDl, this.jDk, this.jDl, this.jDk);
        localCardTagTextView.setTextColor(l.uD(((bik)localObject2).gjg));
        localCardTagTextView.setText(((bik)localObject2).tag);
        localCardTagTextView.setTextSize(12.0F);
        locala.jDq.addView(localCardTagTextView);
        continue;
        locala.jDq.setVisibility(8);
      }
      label1485:
      if ((paramInt == this.jDh.getCount() - 1) && (locala.jDt != null))
      {
        localObject1 = (LinearLayout.LayoutParams)locala.jDt.getLayoutParams();
        if (((LinearLayout.LayoutParams)localObject1).bottomMargin != this.mContext.getResources().getDimensionPixelOffset(R.f.aQu))
        {
          ((LinearLayout.LayoutParams)localObject1).bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aQu);
          locala.jDt.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
      }
      for (;;)
      {
        this.jDi = (System.currentTimeMillis() - l + this.jDi);
        this.jDj += 1L;
        if (!this.jDn.contains(paramb.ajz()))
        {
          this.jDn.add(paramb.ajz());
          this.jDo.add(paramb.ajA());
          this.jDm.add(Integer.valueOf(paramInt));
        }
        GMTrace.o(5078127738880L, 37835);
        return paramView;
        label1659:
        locala.jDu.setVisibility(8);
        locala.jDv.setVisibility(8);
        locala.jDq.setVisibility(8);
        locala.jDw.setVisibility(8);
        locala.jDB.setVisibility(8);
        locala.jDA.setVisibility(8);
        locala.jDx.setVisibility(8);
        locala.jDy.setVisibility(8);
        locala.jDz.setVisibility(0);
        locala.jDz.setText(this.mContext.getResources().getString(R.l.ddo));
        break;
        if (locala.jDt != null)
        {
          localObject1 = (LinearLayout.LayoutParams)locala.jDt.getLayoutParams();
          if (((LinearLayout.LayoutParams)localObject1).bottomMargin != 0)
          {
            ((LinearLayout.LayoutParams)localObject1).bottomMargin = 0;
            locala.jDt.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
      }
      label1820:
      i = 0;
    }
  }
  
  public final void a(View paramView, int paramInt, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(5078530392064L, 37838);
    GMTrace.o(5078530392064L, 37838);
  }
  
  public final void release()
  {
    GMTrace.i(5077993521152L, 37834);
    this.mContext = null;
    this.jDh = null;
    if (this.jDj > 0L)
    {
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(5);
      localIDKey1.SetValue(1L);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(6);
      localIDKey2.SetValue((int)(this.jDi / this.jDj));
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      g.ork.b(localArrayList, true);
    }
    if ((this.jDm.size() == this.jDn.size()) && (this.jDn.size() == this.jDo.size()) && (this.jDm.size() > 0))
    {
      long l = System.currentTimeMillis();
      int i = 0;
      while (i < this.jDm.size())
      {
        g.ork.i(13220, new Object[] { this.jDo.get(i), this.jDn.get(i), this.jDm.get(i), Long.valueOf(l) });
        i += 1;
      }
    }
    this.jDm.clear();
    this.jDn.clear();
    this.jDo.clear();
    if (this.jDp != null) {
      this.jDp.clear();
    }
    GMTrace.o(5077993521152L, 37834);
  }
  
  public final void u(View paramView, int paramInt)
  {
    GMTrace.i(5078261956608L, 37836);
    GMTrace.o(5078261956608L, 37836);
  }
  
  public final void v(View paramView, int paramInt)
  {
    GMTrace.i(5078396174336L, 37837);
    GMTrace.o(5078396174336L, 37837);
  }
  
  public final class a
  {
    public View jDA;
    public TextView jDB;
    public LinearLayout jDq;
    public TextView jDr;
    public TextView jDs;
    public RelativeLayout jDt;
    public ImageView jDu;
    public TextView jDv;
    public TextView jDw;
    public TextView jDx;
    public TextView jDy;
    public TextView jDz;
    
    public a()
    {
      GMTrace.i(5078798827520L, 37840);
      GMTrace.o(5078798827520L, 37840);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */