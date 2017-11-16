package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.HelpCenter;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;
import java.util.List;

public final class j
  extends Preference
{
  View.OnClickListener mOnClickListener;
  private View mView;
  List<MallOrderDetailObject.HelpCenter> nDR;
  String nGZ;
  View.OnClickListener nHa;
  
  public j(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6644448624640L, 49505);
    this.mView = null;
    this.mOnClickListener = null;
    this.nHa = null;
    this.nDR = new LinkedList();
    setLayoutResource(a.g.sNA);
    GMTrace.o(6644448624640L, 49505);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6644582842368L, 49506);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6644582842368L, 49506);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6644717060096L, 49507);
    super.onBindView(paramView);
    paramView = (LinearLayout)paramView.findViewById(a.f.sBq);
    paramView.removeAllViews();
    if (this.nDR == null)
    {
      GMTrace.o(6644717060096L, 49507);
      return;
    }
    int i;
    if ((!bg.nm(this.nGZ)) && (this.nHa != null))
    {
      i = this.nDR.size();
      if (i != 0) {
        break label473;
      }
      i = -1;
    }
    label473:
    for (;;)
    {
      int j = 0;
      int k = 0;
      Object localObject;
      for (;;)
      {
        if (j < this.nDR.size())
        {
          localObject = (MallOrderDetailObject.HelpCenter)this.nDR.get(j);
          TextView localTextView = new TextView(this.mContext);
          localTextView.setTextColor(this.mContext.getResources().getColor(a.c.black));
          localTextView.setTextSize(0, a.V(this.mContext, a.d.aQF));
          localTextView.setIncludeFontPadding(false);
          localTextView.setText(((MallOrderDetailObject.HelpCenter)localObject).name);
          localTextView.setTag(localObject);
          localTextView.setGravity(17);
          localTextView.setOnClickListener(this.mOnClickListener);
          if (k == i) {
            localTextView.setTextColor(this.mContext.getResources().getColor(a.c.aNQ));
          }
          paramView.addView(localTextView, new LinearLayout.LayoutParams(0, -2, 1.0F));
          if (k < i)
          {
            localObject = new View(this.mContext);
            ((View)localObject).setBackgroundColor(this.mContext.getResources().getColor(a.c.aOZ));
            paramView.addView((View)localObject, new LinearLayout.LayoutParams(a.V(this.mContext, a.d.smZ), -1));
          }
          k += 1;
          j += 1;
          continue;
          i = this.nDR.size() - 1;
          break;
        }
      }
      if ((!bg.nm(this.nGZ)) && (this.nHa != null))
      {
        localObject = new TextView(this.mContext);
        ((TextView)localObject).setTextColor(this.mContext.getResources().getColor(a.c.black));
        ((TextView)localObject).setTextSize(0, a.V(this.mContext, a.d.aQF));
        ((TextView)localObject).setIncludeFontPadding(false);
        ((TextView)localObject).setText(this.nGZ);
        ((TextView)localObject).setGravity(17);
        ((TextView)localObject).setOnClickListener(this.nHa);
        if (k == i) {
          ((TextView)localObject).setTextColor(this.mContext.getResources().getColor(a.c.aNQ));
        }
        paramView.addView((View)localObject, new LinearLayout.LayoutParams(0, -2, 1.0F));
      }
      GMTrace.o(6644717060096L, 49507);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */