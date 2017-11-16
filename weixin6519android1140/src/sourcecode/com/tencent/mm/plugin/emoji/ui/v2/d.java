package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.qp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.List;

public final class d
  extends BaseAdapter
{
  List<qp> kgE;
  private int kgU;
  private int kgV;
  private int kgW;
  private boolean kvh;
  private LinearLayout.LayoutParams kvi;
  private LinearLayout.LayoutParams kvj;
  a kvk;
  private Context mContext;
  private int mNumColumns;
  
  public d(Context paramContext)
  {
    GMTrace.i(11467428462592L, 85439);
    this.mNumColumns = 3;
    this.kvh = true;
    this.mNumColumns = 3;
    this.mContext = paramContext;
    this.kgV = com.tencent.mm.br.a.ef(this.mContext);
    this.kgU = this.mContext.getResources().getDimensionPixelSize(R.f.aRR);
    this.kgW = ((int)((this.kgV - this.mNumColumns * this.kgU) / (this.mNumColumns + 1.0F)));
    GMTrace.o(11467428462592L, 85439);
  }
  
  private int asx()
  {
    GMTrace.i(11467696898048L, 85441);
    if (this.kgE == null)
    {
      GMTrace.o(11467696898048L, 85441);
      return 0;
    }
    int i = this.kgE.size();
    GMTrace.o(11467696898048L, 85441);
    return i;
  }
  
  public final void at(List<qp> paramList)
  {
    GMTrace.i(11467562680320L, 85440);
    if (this.kgE == null) {
      this.kgE = new ArrayList();
    }
    for (;;)
    {
      this.kgE = paramList;
      notifyDataSetChanged();
      GMTrace.o(11467562680320L, 85440);
      return;
      this.kgE.clear();
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(11467831115776L, 85442);
    if (this.kgE == null)
    {
      GMTrace.o(11467831115776L, 85442);
      return 0;
    }
    int i = (int)Math.ceil(this.kgE.size() / this.mNumColumns);
    GMTrace.o(11467831115776L, 85442);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(11468099551232L, 85444);
    long l = paramInt;
    GMTrace.o(11468099551232L, 85444);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11468233768960L, 85445);
    final Object localObject1;
    Object localObject2;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      localObject1 = v.fb(this.mContext).inflate(R.i.cuZ, null);
      localObject2 = new b();
      ((b)localObject2).khc = ((LinearLayout)((View)localObject1).findViewById(R.h.bIE));
      ((b)localObject2).khc.setPadding(0, this.kgW, 0, 0);
      ((View)localObject1).setTag(localObject2);
      i = 0;
      for (;;)
      {
        paramViewGroup = (ViewGroup)localObject2;
        paramView = (View)localObject1;
        if (i >= this.mNumColumns) {
          break;
        }
        this.kvj = new LinearLayout.LayoutParams(-2, -2);
        this.kvj.leftMargin = this.kgW;
        this.kvi = new LinearLayout.LayoutParams(this.kgU, this.kgU);
        paramView = new PaddingImageView(this.mContext);
        paramViewGroup = this.kvi;
        paramView.addView(paramView.kve, paramViewGroup);
        paramView.addView(paramView.kvf, paramViewGroup);
        ((b)localObject2).khc.addView(paramView, i, this.kvj);
        i += 1;
      }
    }
    paramViewGroup = (b)paramView.getTag();
    int i = 0;
    if (i < this.mNumColumns)
    {
      final int j = this.mNumColumns * paramInt + i;
      localObject1 = (PaddingImageView)paramViewGroup.khc.getChildAt(i);
      Object localObject3;
      com.tencent.mm.ao.a.a locala;
      String str;
      ImageView localImageView;
      if (j <= asx() - 1)
      {
        localObject2 = mV(j);
        if (localObject2 != null) {
          if (!bg.nm(((qp)localObject2).nFH))
          {
            localObject3 = new StringBuilder();
            at.AR();
            localObject3 = EmojiLogic.G(c.zb(), "", ((qp)localObject2).ugy) + "_cover";
            locala = n.Jd();
            str = ((qp)localObject2).nFH;
            localImageView = ((PaddingImageView)localObject1).kve;
            localObject2 = ((qp)localObject2).nFH;
            locala.a(str, localImageView, f.a((String)localObject3, this.kgU, new Object[0]));
            label376:
            ((PaddingImageView)localObject1).setClickable(true);
            ((PaddingImageView)localObject1).kvf.setBackgroundResource(R.g.aWm);
            ((PaddingImageView)localObject1).setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(11496553709568L, 85656);
                if (d.a(d.this) != null) {
                  d.a(d.this).kt(j);
                }
                GMTrace.o(11496553709568L, 85656);
              }
            });
          }
        }
      }
      for (;;)
      {
        i += 1;
        break;
        if (!bg.nm(((qp)localObject2).lPM))
        {
          at.AR();
          localObject3 = EmojiLogic.G(c.zb(), "", ((qp)localObject2).ugy);
          locala = h.aqJ();
          str = ((qp)localObject2).lPM;
          localImageView = ((PaddingImageView)localObject1).kve;
          localObject2 = ((qp)localObject2).lPM;
          locala.a(str, localImageView, f.a((String)localObject3, this.kgU, new Object[0]));
          break label376;
        }
        w.w("MicroMsg.emoji.PreViewListGridAdapter", "this emoji has no thumb url and url. download faild");
        break label376;
        ((PaddingImageView)localObject1).kvf.setBackgroundDrawable(null);
        n.Jd().a("", ((PaddingImageView)localObject1).kve);
        w.w("MicroMsg.emoji.PreViewListGridAdapter", "item is null");
        ((PaddingImageView)localObject1).setClickable(false);
        ((PaddingImageView)localObject1).setOnClickListener(null);
        continue;
        ((PaddingImageView)localObject1).kvf.setBackgroundDrawable(null);
        n.Jd().a("", ((PaddingImageView)localObject1).kve);
        ((PaddingImageView)localObject1).setClickable(false);
        ((PaddingImageView)localObject1).setOnClickListener(null);
      }
    }
    GMTrace.o(11468233768960L, 85445);
    return paramView;
  }
  
  public final qp mV(int paramInt)
  {
    GMTrace.i(11467965333504L, 85443);
    if ((paramInt < 0) || (paramInt >= asx()))
    {
      GMTrace.o(11467965333504L, 85443);
      return null;
    }
    if (this.kgE == null)
    {
      GMTrace.o(11467965333504L, 85443);
      return null;
    }
    qp localqp = (qp)this.kgE.get(paramInt);
    GMTrace.o(11467965333504L, 85443);
    return localqp;
  }
  
  static abstract interface a
  {
    public abstract void kt(int paramInt);
  }
  
  final class b
  {
    LinearLayout khc;
    
    b()
    {
      GMTrace.i(11511049224192L, 85764);
      GMTrace.o(11511049224192L, 85764);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */