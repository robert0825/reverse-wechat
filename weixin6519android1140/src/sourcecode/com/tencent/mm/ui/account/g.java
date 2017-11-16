package com.tencent.mm.ui.account;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.HorizontalListView;
import com.tencent.mm.ui.base.q;

public final class g
{
  public static q a(Context paramContext, View paramView, String[] paramArrayOfString, AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    GMTrace.i(2714150895616L, 20222);
    View localView = View.inflate(paramContext, R.i.cDu, null);
    HorizontalListView localHorizontalListView = (HorizontalListView)localView.findViewById(R.h.cgd);
    paramArrayOfString = new a(paramContext, paramArrayOfString);
    localHorizontalListView.setAdapter(paramArrayOfString);
    localHorizontalListView.setOnItemClickListener(paramOnItemClickListener);
    localHorizontalListView.setBackgroundResource(R.g.bav);
    paramOnItemClickListener = new q(localView);
    paramOnItemClickListener.setHeight(com.tencent.mm.br.a.fromDPToPix(paramContext, 120));
    int i = 0;
    int j = 0;
    while (i < paramArrayOfString.getCount())
    {
      localView = paramArrayOfString.getView(i, null, localHorizontalListView);
      localView.measure(0, 0);
      j += localView.getMeasuredWidth();
      i += 1;
    }
    paramOnItemClickListener.setWidth(com.tencent.mm.br.a.fromDPToPix(paramContext, 20) + j);
    paramOnItemClickListener.showAsDropDown(paramView, (paramView.getWidth() - (com.tencent.mm.br.a.fromDPToPix(paramContext, 20) + j)) / 2, 0);
    GMTrace.o(2714150895616L, 20222);
    return paramOnItemClickListener;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */