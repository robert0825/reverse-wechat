package com.tencent.mm.plugin.card.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.plugin.card.base.c;
import com.tencent.mm.plugin.card.model.CardInfo;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"UseValueOf"})
public final class g
  extends BaseAdapter
{
  private View.OnClickListener hwh;
  List<CardInfo> jCF;
  c jCu;
  List<Boolean> jHA;
  a jHB;
  private boolean jHz;
  private boolean jyP;
  Context mContext;
  
  public g(Context paramContext)
  {
    GMTrace.i(4961358315520L, 36965);
    this.jCF = new ArrayList();
    this.jHz = false;
    this.jHA = new ArrayList();
    this.jyP = true;
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4938138648576L, 36792);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        paramAnonymousView = g.this;
        if (((Boolean)paramAnonymousView.jHA.get(i)).booleanValue()) {
          paramAnonymousView.jHA.set(i, Boolean.valueOf(false));
        }
        for (;;)
        {
          paramAnonymousView.notifyDataSetChanged();
          GMTrace.o(4938138648576L, 36792);
          return;
          paramAnonymousView.jHA.set(i, Boolean.valueOf(true));
        }
      }
    };
    this.jCu = new l(paramContext, this);
    this.mContext = paramContext;
    GMTrace.o(4961358315520L, 36965);
  }
  
  public final int getCount()
  {
    GMTrace.i(4961492533248L, 36966);
    int i = this.jCF.size();
    GMTrace.o(4961492533248L, 36966);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(4961760968704L, 36968);
    long l = paramInt;
    GMTrace.o(4961760968704L, 36968);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(4961895186432L, 36969);
    paramViewGroup = lN(paramInt);
    paramViewGroup.jyP = this.jyP;
    paramView = this.jCu.a(paramInt, paramView, paramViewGroup);
    if ((this.jHz) && (paramViewGroup.ajh()))
    {
      this.jCu.v(paramView, 0);
      if (((Boolean)this.jHA.get(paramInt)).booleanValue())
      {
        this.jCu.u(paramView, R.g.aUP);
        this.jCu.a(paramView, paramInt, this.hwh);
      }
    }
    for (;;)
    {
      GMTrace.o(4961895186432L, 36969);
      return paramView;
      this.jCu.u(paramView, R.g.aUQ);
      break;
      this.jCu.v(paramView, 8);
    }
  }
  
  public final CardInfo lN(int paramInt)
  {
    GMTrace.i(4961626750976L, 36967);
    CardInfo localCardInfo = (CardInfo)this.jCF.get(paramInt);
    GMTrace.o(4961626750976L, 36967);
    return localCardInfo;
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */