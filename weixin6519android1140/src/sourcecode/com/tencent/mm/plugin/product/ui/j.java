package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.m;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.g;
import java.util.LinkedList;

public final class j
  extends BaseAdapter
{
  private Context mContext;
  m nKs;
  String nKt;
  
  public j(Context paramContext)
  {
    GMTrace.i(6016443875328L, 44826);
    this.mContext = paramContext;
    GMTrace.o(6016443875328L, 44826);
  }
  
  private h sy(int paramInt)
  {
    GMTrace.i(6016712310784L, 44828);
    h localh = (h)this.nKs.nIQ.get(paramInt);
    GMTrace.o(6016712310784L, 44828);
    return localh;
  }
  
  public final int getCount()
  {
    GMTrace.i(6016578093056L, 44827);
    if (this.nKs.nIQ != null)
    {
      int i = this.nKs.nIQ.size();
      GMTrace.o(6016578093056L, 44827);
      return i;
    }
    GMTrace.o(6016578093056L, 44827);
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(6016846528512L, 44829);
    long l = paramInt;
    GMTrace.o(6016846528512L, 44829);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6017114963968L, 44831);
    paramViewGroup = sy(paramInt);
    if ((paramView == null) || (paramView.getTag() == null)) {
      paramView = View.inflate(this.mContext, a.g.sNZ, null);
    }
    for (;;)
    {
      CheckBox localCheckBox = (CheckBox)paramView;
      localCheckBox.setText(paramViewGroup.name);
      localCheckBox.setEnabled(paramViewGroup.nII);
      localCheckBox.setChecked(paramViewGroup.id.equals(this.nKt));
      if (!paramViewGroup.nII) {
        paramView.setBackgroundResource(a.e.soO);
      }
      for (;;)
      {
        paramView.setTag(new Pair(this.nKs.nIO, paramViewGroup.id));
        GMTrace.o(6017114963968L, 44831);
        return paramView;
        if (paramViewGroup.id.equals(this.nKt)) {
          paramView.setBackgroundResource(a.e.soQ);
        } else {
          paramView.setBackgroundResource(a.e.soP);
        }
      }
    }
  }
  
  public final boolean isEnabled(int paramInt)
  {
    GMTrace.i(6016980746240L, 44830);
    boolean bool = sy(paramInt).nII;
    GMTrace.o(6016980746240L, 44830);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */