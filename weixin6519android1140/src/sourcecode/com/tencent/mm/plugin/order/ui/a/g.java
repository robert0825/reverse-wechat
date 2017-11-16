package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class g
  extends Preference
{
  static int nGM;
  static float nGN;
  public f iAA;
  private View mView;
  String nGO;
  public String[] nGP;
  TextUtils.TruncateAt nGQ;
  boolean nGR;
  
  static
  {
    GMTrace.i(6644045971456L, 49502);
    nGN = 16.0F;
    GMTrace.o(6644045971456L, 49502);
  }
  
  public g(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6643106447360L, 49495);
    this.mView = null;
    this.nGR = false;
    setLayoutResource(a.g.sNu);
    nGM = paramContext.getResources().getColor(a.c.smz);
    GMTrace.o(6643106447360L, 49495);
  }
  
  public final void a(String[] paramArrayOfString, TextUtils.TruncateAt paramTruncateAt)
  {
    GMTrace.i(6643509100544L, 49498);
    this.nGP = paramArrayOfString;
    this.nGQ = paramTruncateAt;
    this.nGR = true;
    GMTrace.o(6643509100544L, 49498);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6643240665088L, 49496);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6643240665088L, 49496);
    return paramView;
  }
  
  protected final void onBindView(final View paramView)
  {
    GMTrace.i(6643374882816L, 49497);
    super.onBindView(paramView);
    TextView localTextView1 = (TextView)paramView.findViewById(a.f.sBl);
    final TextView localTextView2 = (TextView)paramView.findViewById(a.f.sBk);
    paramView = (LinearLayout)paramView.findViewById(a.f.sBj);
    localTextView1.setText(getTitle());
    if ((this.nGP == null) || (this.nGP.length <= 1)) {
      localTextView2.setTextColor(nGM);
    }
    for (;;)
    {
      localTextView2.setText(this.nGO);
      GMTrace.o(6643374882816L, 49497);
      return;
      localTextView2.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6642972229632L, 49494);
          localTextView2.setVisibility(8);
          int i = 0;
          if (i < g.this.nGP.length)
          {
            paramAnonymousView = g.this;
            String str = g.this.nGP[i];
            TextView localTextView = new TextView(paramAnonymousView.mContext);
            localTextView.setText(str);
            localTextView.setTextSize(g.nGN);
            localTextView.setTextColor(g.nGM);
            if (paramAnonymousView.nGR)
            {
              localTextView.setSingleLine(true);
              localTextView.setEllipsize(paramAnonymousView.nGQ);
            }
            for (;;)
            {
              paramView.addView(localTextView, new LinearLayout.LayoutParams(-2, -2));
              i += 1;
              break;
              localTextView.setSingleLine(false);
            }
          }
          localTextView2.setOnClickListener(null);
          if (g.this.iAA != null) {
            g.this.iAA.notifyDataSetChanged();
          }
          GMTrace.o(6642972229632L, 49494);
        }
      });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */