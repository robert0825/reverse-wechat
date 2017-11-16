package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.base.c;
import java.util.List;

public final class g
  extends BaseAdapter
{
  List<b> jCF;
  c jCu;
  Context mContext;
  
  public final int getCount()
  {
    GMTrace.i(5089536245760L, 37920);
    int i = this.jCF.size();
    GMTrace.o(5089536245760L, 37920);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(5089804681216L, 37922);
    long l = paramInt;
    GMTrace.o(5089804681216L, 37922);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5089938898944L, 37923);
    paramViewGroup = lB(paramInt);
    paramView = this.jCu.a(paramInt, paramView, paramViewGroup);
    GMTrace.o(5089938898944L, 37923);
    return paramView;
  }
  
  public final b lB(int paramInt)
  {
    GMTrace.i(5089670463488L, 37921);
    b localb = (b)this.jCF.get(paramInt);
    GMTrace.o(5089670463488L, 37921);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */