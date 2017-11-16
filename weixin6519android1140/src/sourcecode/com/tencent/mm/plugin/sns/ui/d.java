package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.b;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.a.b;
import com.tencent.mm.plugin.sns.storage.a.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import java.util.List;

public final class d
  extends BaseAdapter
{
  private final Context mContext;
  private String mwK;
  public b pNP;
  
  public d(Context paramContext, b paramb)
  {
    GMTrace.i(20059644755968L, 149456);
    this.pNP = null;
    this.mwK = null;
    this.mContext = paramContext;
    this.pNP = paramb;
    this.mwK = v.eq(ab.getContext());
    GMTrace.o(20059644755968L, 149456);
  }
  
  public final int getCount()
  {
    GMTrace.i(20059778973696L, 149457);
    int i = this.pNP.poY.qjG.pCu.bjZ().size();
    GMTrace.o(20059778973696L, 149457);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(20060181626880L, 149460);
    Object localObject = this.pNP.poY.qjG.pCu.bjZ().get(paramInt);
    GMTrace.o(20060181626880L, 149460);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(20060047409152L, 149459);
    long l = paramInt;
    GMTrace.o(20060047409152L, 149459);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20059913191424L, 149458);
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = View.inflate(this.mContext, i.g.peL, null);
    }
    paramViewGroup.setTag(this.pNP);
    paramView = (a.b.a)getItem(paramInt);
    if ("zh_CN".equals(this.mwK))
    {
      paramView = paramView.pCB;
      ((TextView)paramViewGroup.findViewById(i.f.oYV)).setText(paramView);
      paramView = paramViewGroup.findViewById(i.f.oYU);
      if (paramInt != getCount() - 1) {
        break label150;
      }
    }
    label150:
    for (paramInt = 8;; paramInt = 0)
    {
      paramView.setVisibility(paramInt);
      GMTrace.o(20059913191424L, 149458);
      return paramViewGroup;
      if (("zh_TW".equals(this.mwK)) || ("zh_HK".equals(this.mwK)))
      {
        paramView = paramView.pCC;
        break;
      }
      paramView = paramView.pCD;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */