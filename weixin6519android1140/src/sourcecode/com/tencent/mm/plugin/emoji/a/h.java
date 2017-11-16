package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.emoji.a.a.c;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class h
  extends com.tencent.mm.plugin.emoji.a.a.a
{
  public int kgN;
  private int kgS;
  private int kgT;
  private int kgU;
  private int kgV;
  private int kgW;
  private boolean kgX;
  public a kgY;
  private HashMap<String, b> kgZ;
  private Context mContext;
  private int mNumColumns;
  
  public h(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(11336431960064L, 84463);
    this.mNumColumns = 3;
    this.kgN = 0;
    this.mContext = paramContext;
    this.kgX = false;
    this.kgS = this.mContext.getResources().getDimensionPixelSize(R.f.aQE);
    this.kgT = this.mContext.getResources().getDimensionPixelSize(R.f.aPy);
    this.kgU = this.mContext.getResources().getDimensionPixelSize(R.f.aRR);
    this.kgV = com.tencent.mm.br.a.ef(this.mContext);
    this.kgW = ((int)((this.kgV - this.mNumColumns * this.kgU) / (this.mNumColumns + 1.0F)));
    GMTrace.o(11336431960064L, 84463);
  }
  
  private void a(b paramb, int paramInt)
  {
    GMTrace.i(11336968830976L, 84467);
    switch (paramInt)
    {
    default: 
      paramb.jHc.setTextColor(this.mContext.getResources().getColor(R.e.aOE));
      paramb.jHc.setCompoundDrawables(null, null, null, null);
      w.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "unknow product status:%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(11336968830976L, 84467);
      return;
    }
    paramb.jHc.setTextColor(this.mContext.getResources().getColor(R.e.aNW));
    Drawable localDrawable = this.mContext.getResources().getDrawable(R.k.cMb);
    localDrawable.setBounds(0, 0, localDrawable.getMinimumWidth(), localDrawable.getMinimumHeight());
    paramb.jHc.setCompoundDrawables(null, null, localDrawable, null);
    GMTrace.o(11336968830976L, 84467);
  }
  
  public final void aN(String paramString, int paramInt)
  {
    GMTrace.i(11338176790528L, 84476);
    if (this.kgZ == null)
    {
      w.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "updateStatus mCacheHolder is nulll.");
      GMTrace.o(11338176790528L, 84476);
      return;
    }
    b localb = (b)this.kgZ.get(paramString);
    com.tencent.mm.plugin.emoji.a.a.f localf = this.kho.vH(paramString);
    if (localf != null) {
      a(localf, paramString, paramInt);
    }
    if ((localf != null) && (this.kho != null) && (localf.mStatus == -1))
    {
      w.i("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "force refresh status");
      localf.a(this.kho.khx, this.kho.vL(paramString), this.kho.vJ(paramString));
    }
    if (localb == null)
    {
      w.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "updateStatus viewHolder is nulll.");
      GMTrace.o(11338176790528L, 84476);
      return;
    }
    a(localb, paramInt);
    GMTrace.o(11338176790528L, 84476);
  }
  
  public final int aqj()
  {
    GMTrace.i(11337237266432L, 84469);
    int i = this.kgN;
    GMTrace.o(11337237266432L, 84469);
    return i;
  }
  
  public final int aqk()
  {
    GMTrace.i(11337505701888L, 84471);
    GMTrace.o(11337505701888L, 84471);
    return 0;
  }
  
  public final int aql()
  {
    GMTrace.i(11337774137344L, 84473);
    GMTrace.o(11337774137344L, 84473);
    return 0;
  }
  
  public final int aqn()
  {
    GMTrace.i(11336566177792L, 84464);
    if (this.kgX)
    {
      if (this.kgN == 0)
      {
        GMTrace.o(11336566177792L, 84464);
        return 0;
      }
      if ((this.kgN > 0) && (super.getCount() > this.kgN))
      {
        i = this.kgN;
        GMTrace.o(11336566177792L, 84464);
        return i;
      }
      i = super.getCount();
      GMTrace.o(11336566177792L, 84464);
      return i;
    }
    int i = super.getCount();
    GMTrace.o(11336566177792L, 84464);
    return i;
  }
  
  public final View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11338042572800L, 84475);
    GMTrace.o(11338042572800L, 84475);
    return null;
  }
  
  protected final a c(Context paramContext, View paramView)
  {
    GMTrace.i(11337103048704L, 84468);
    GMTrace.o(11337103048704L, 84468);
    return null;
  }
  
  public final int getCount()
  {
    int i = 0;
    GMTrace.i(11336700395520L, 84465);
    if (this.kgX)
    {
      if (this.kgN == 0)
      {
        GMTrace.o(11336700395520L, 84465);
        return 0;
      }
      if ((this.kgN > 0) && (aqn() > this.kgN))
      {
        i = (int)Math.ceil(this.kgN / this.mNumColumns);
        GMTrace.o(11336700395520L, 84465);
        return i;
      }
      i = (int)Math.ceil(aqn() / this.mNumColumns);
      GMTrace.o(11336700395520L, 84465);
      return i;
    }
    int j = aqn();
    if (j <= this.kgN) {}
    for (;;)
    {
      GMTrace.o(11336700395520L, 84465);
      return i;
      i = (int)Math.ceil((j - this.kgN) / this.mNumColumns);
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11336834613248L, 84466);
    final Object localObject1;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject1 = (b)paramView.getTag();
      paramViewGroup = paramView;
      paramView = (View)localObject1;
    }
    for (;;)
    {
      int i = 0;
      if (i < this.mNumColumns)
      {
        final int j;
        label61:
        Object localObject2;
        if (this.kgX)
        {
          j = this.mNumColumns * paramInt;
          j += i;
          localObject1 = new b(this.mContext, paramView.khc.getChildAt(i));
          ((b)localObject1).kgo.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(11335358218240L, 84455);
              if (h.a(h.this) != null) {
                h.a(h.this).kt(j);
              }
              GMTrace.o(11335358218240L, 84455);
            }
          });
          localObject2 = mC(j);
          if ((j > aqn() - 1) || (localObject2 == null)) {
            break label466;
          }
          if (this.kgZ == null) {
            this.kgZ = new HashMap();
          }
          if (this.kgZ.containsValue(localObject1)) {
            this.kgZ.remove(((b)localObject1).kgw);
          }
          ((b)localObject1).kgw = a((com.tencent.mm.plugin.emoji.a.a.f)localObject2);
          this.kgZ.put(a((com.tencent.mm.plugin.emoji.a.a.f)localObject2), localObject1);
          ((b)localObject1).kgo.setVisibility(0);
          ((b)localObject1).jHc.setText(((com.tencent.mm.plugin.emoji.a.a.f)localObject2).khA.uhe);
          n.Jd().a(((com.tencent.mm.plugin.emoji.a.a.f)localObject2).khA.lRV, ((b)localObject1).kgx, com.tencent.mm.plugin.emoji.e.f.bQ(((com.tencent.mm.plugin.emoji.a.a.f)localObject2).khA.tRS, ((com.tencent.mm.plugin.emoji.a.a.f)localObject2).khA.lRV));
          ((b)localObject1).kgy.setBackgroundResource(R.g.aWj);
          ((b)localObject1).kgo.setClickable(true);
          a((b)localObject1, ((com.tencent.mm.plugin.emoji.a.a.f)localObject2).mStatus);
        }
        for (;;)
        {
          i += 1;
          break;
          paramViewGroup = new LinearLayout(this.mContext);
          paramView = new AbsListView.LayoutParams(-1, -2);
          paramViewGroup.setBackgroundResource(R.g.bbj);
          paramViewGroup.setOrientation(0);
          paramViewGroup.setLayoutParams(paramView);
          paramViewGroup.setPadding(0, 0, 0, this.kgT);
          paramView = new b();
          paramView.khc = paramViewGroup;
          paramViewGroup.setTag(paramView);
          i = 0;
          while (i < this.mNumColumns)
          {
            localObject1 = new LinearLayout.LayoutParams(-2, -2);
            ((LinearLayout.LayoutParams)localObject1).leftMargin = this.kgW;
            localObject2 = new b(this.mContext, R.i.cuS);
            paramView.khc.addView(((b)localObject2).kgo, i, (ViewGroup.LayoutParams)localObject1);
            i += 1;
          }
          j = this.mNumColumns * paramInt + this.kgN;
          break label61;
          label466:
          ((b)localObject1).kgo.setClickable(false);
          ((b)localObject1).kgo.setVisibility(8);
          ((b)localObject1).kgy.setBackgroundDrawable(null);
        }
      }
      GMTrace.o(11336834613248L, 84466);
      return paramViewGroup;
    }
  }
  
  public final void mA(int paramInt)
  {
    GMTrace.i(11337639919616L, 84472);
    GMTrace.o(11337639919616L, 84472);
  }
  
  public final void mB(int paramInt)
  {
    GMTrace.i(11337908355072L, 84474);
    GMTrace.o(11337908355072L, 84474);
  }
  
  public final void mz(int paramInt)
  {
    GMTrace.i(11337371484160L, 84470);
    this.kgN = paramInt;
    GMTrace.o(11337371484160L, 84470);
  }
  
  public static abstract interface a
  {
    public abstract void kt(int paramInt);
  }
  
  final class b
  {
    LinearLayout khc;
    
    b()
    {
      GMTrace.i(11331868557312L, 84429);
      GMTrace.o(11331868557312L, 84429);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */