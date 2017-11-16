package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.luckymoney.b.h;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.wallet_core.ui.e;

public final class c
  extends d
{
  private Context mContext;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(9878022127616L, 73597);
    this.mContext = paramContext;
    GMTrace.o(9878022127616L, 73597);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(9878156345344L, 73598);
    h localh;
    if (paramView == null)
    {
      paramView = this.CJ.inflate(a.g.sMV, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.mOE = ((TextView)paramView.findViewById(a.f.szk));
      paramViewGroup.mOF = ((TextView)paramView.findViewById(a.f.szl));
      paramViewGroup.mNb = ((TextView)paramView.findViewById(a.f.szg));
      paramViewGroup.mNU = ((ImageView)paramView.findViewById(a.f.szi));
      paramView.setTag(paramViewGroup);
      localh = qe(paramInt);
      n.a(this.mContext, paramViewGroup.mOE, localh.mII);
      paramViewGroup.mOF.setText(localh.mIK);
      paramViewGroup.mNb.setText(this.mContext.getString(a.i.sAf, new Object[] { e.r(localh.mIJ / 100.0D) }));
      if (localh.mIb != 1) {
        break label215;
      }
      paramViewGroup.mNU.setImageResource(a.e.son);
      paramViewGroup.mNU.setVisibility(0);
    }
    for (;;)
    {
      GMTrace.o(9878156345344L, 73598);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label215:
      if (localh.mIb == 2)
      {
        paramViewGroup.mNU.setImageResource(a.e.sol);
        paramViewGroup.mNU.setVisibility(0);
      }
      else
      {
        paramViewGroup.mNU.setVisibility(8);
      }
    }
  }
  
  final class a
  {
    ImageView mNU;
    TextView mNb;
    TextView mOE;
    TextView mOF;
    
    a()
    {
      GMTrace.i(9830643269632L, 73244);
      GMTrace.o(9830643269632L, 73244);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */