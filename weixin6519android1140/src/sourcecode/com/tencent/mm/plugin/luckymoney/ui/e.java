package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.luckymoney.b.h;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;

public final class e
  extends d
{
  private Context mContext;
  
  public e(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(9882048659456L, 73627);
    this.mContext = null;
    this.mContext = paramContext;
    GMTrace.o(9882048659456L, 73627);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(9882182877184L, 73628);
    if (paramView == null)
    {
      paramView = this.CJ.inflate(a.g.sMX, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.izE = ((TextView)paramView.findViewById(a.f.szp));
      paramViewGroup.jXT = ((TextView)paramView.findViewById(a.f.szn));
      paramViewGroup.mOF = ((TextView)paramView.findViewById(a.f.szo));
      paramViewGroup.mNb = ((TextView)paramView.findViewById(a.f.szm));
      paramViewGroup.vq = paramInt;
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      h localh = qe(paramInt);
      paramViewGroup.izE.setText(localh.mIL);
      paramViewGroup.mOF.setText(localh.mIM);
      paramViewGroup.mNb.setText(this.mContext.getString(a.i.sUb, new Object[] { com.tencent.mm.wallet_core.ui.e.r(localh.mIm / 100.0D) }));
      String str2 = this.mContext.getString(a.i.sVi, new Object[] { Long.valueOf(localh.mIk), Long.valueOf(localh.mIN) });
      String str1 = str2;
      if (localh.status == 5) {
        str1 = this.mContext.getString(a.i.sVj) + " " + str2;
      }
      paramViewGroup.jXT.setText(str1);
      GMTrace.o(9882182877184L, 73628);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  final class a
  {
    TextView izE;
    TextView jXT;
    TextView mNb;
    TextView mOF;
    int vq;
    
    a()
    {
      GMTrace.i(9873861378048L, 73566);
      GMTrace.o(9873861378048L, 73566);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */