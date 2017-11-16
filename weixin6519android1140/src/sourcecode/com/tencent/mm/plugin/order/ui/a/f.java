package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.order.c.a;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.ui.base.preference.Preference;

public final class f
  extends Preference
{
  public View.OnClickListener kKb;
  private String lNF;
  private boolean lNJ;
  private View mView;
  private int nGI;
  private int nGJ;
  private int nGK;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6647267196928L, 49526);
    this.mView = null;
    this.nGI = Integer.MAX_VALUE;
    this.nGJ = -1;
    this.nGK = -1;
    setLayoutResource(a.g.sNt);
    GMTrace.o(6647267196928L, 49526);
  }
  
  public final void EB(String paramString)
  {
    GMTrace.i(6647669850112L, 49529);
    try
    {
      this.nGI = Color.parseColor(paramString);
      GMTrace.o(6647669850112L, 49529);
      return;
    }
    catch (Exception paramString)
    {
      this.nGI = Integer.MAX_VALUE;
      GMTrace.o(6647669850112L, 49529);
    }
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(6647938285568L, 49531);
    this.lNF = paramString;
    this.lNJ = true;
    this.nGJ = paramInt1;
    this.nGK = paramInt2;
    this.kKb = paramOnClickListener;
    GMTrace.o(6647938285568L, 49531);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6647401414656L, 49527);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6647401414656L, 49527);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6647535632384L, 49528);
    super.onBindView(paramView);
    Object localObject = (TextView)paramView.findViewById(a.f.sBh);
    paramView = (TextView)paramView.findViewById(a.f.sBg);
    ((TextView)localObject).setText(getTitle());
    if (this.nGI != Integer.MAX_VALUE) {
      paramView.setTextColor(this.nGI);
    }
    if (this.lNJ)
    {
      if ((this.nGJ >= 0) && (this.nGK > 0))
      {
        localObject = new a(this.mContext);
        SpannableString localSpannableString = new SpannableString(this.lNF);
        ((a)localObject).nHb = new a.a()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6641630052352L, 49484);
            if (f.this.kKb != null) {
              f.this.kKb.onClick(paramAnonymousView);
            }
            GMTrace.o(6641630052352L, 49484);
          }
        };
        paramView.setMovementMethod(LinkMovementMethod.getInstance());
        localSpannableString.setSpan(localObject, this.nGJ, this.nGK, 33);
        paramView.setText(localSpannableString);
        GMTrace.o(6647535632384L, 49528);
        return;
      }
      paramView.setTextColor(this.mContext.getResources().getColor(a.c.smw));
      paramView.setOnClickListener(this.kKb);
      paramView.setText(h.b(this.mContext, this.lNF, paramView.getTextSize()));
      GMTrace.o(6647535632384L, 49528);
      return;
    }
    paramView.setOnClickListener(null);
    paramView.setText(h.b(this.mContext, this.lNF, paramView.getTextSize()));
    GMTrace.o(6647535632384L, 49528);
  }
  
  public final void setContent(String paramString)
  {
    GMTrace.i(6647804067840L, 49530);
    this.lNF = paramString;
    this.lNJ = false;
    GMTrace.o(6647804067840L, 49530);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */