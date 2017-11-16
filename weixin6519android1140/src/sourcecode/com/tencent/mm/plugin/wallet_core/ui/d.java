package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.ui.base.preference.Preference;

public final class d
  extends Preference
{
  public View.OnClickListener kKb;
  public View kgo;
  public String lNF;
  public boolean lNJ;
  private View mView;
  private int nGI;
  private int nGJ;
  private int nGK;
  
  public d(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(6988180226048L, 52066);
    this.mView = null;
    this.nGI = Integer.MAX_VALUE;
    this.nGJ = -1;
    this.nGK = -1;
    setLayoutResource(a.g.sMz);
    GMTrace.o(6988180226048L, 52066);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6988314443776L, 52067);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6988314443776L, 52067);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6988448661504L, 52068);
    super.onBindView(paramView);
    Object localObject = (TextView)paramView.findViewById(a.f.sww);
    TextView localTextView = (TextView)paramView.findViewById(a.f.sIa);
    ((TextView)localObject).setText(getTitle());
    this.kgo = paramView;
    if (this.nGI != Integer.MAX_VALUE) {
      localTextView.setTextColor(this.nGI);
    }
    if (this.lNJ)
    {
      if ((this.nGJ >= 0) && (this.nGK > 0))
      {
        paramView = new f(this.mContext);
        localObject = new SpannableString(this.lNF);
        paramView.rmz = new f.a()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7021600440320L, 52315);
            if (d.this.kKb != null) {
              d.this.kKb.onClick(paramAnonymousView);
            }
            GMTrace.o(7021600440320L, 52315);
          }
        };
        localTextView.setMovementMethod(LinkMovementMethod.getInstance());
        ((SpannableString)localObject).setSpan(paramView, this.nGJ, this.nGK, 33);
        localTextView.setText((CharSequence)localObject);
        GMTrace.o(6988448661504L, 52068);
        return;
      }
      localTextView.setTextColor(this.mContext.getResources().getColor(a.c.smw));
      localTextView.setOnClickListener(this.kKb);
      localTextView.setText(h.b(this.mContext, this.lNF, localTextView.getTextSize()));
      GMTrace.o(6988448661504L, 52068);
      return;
    }
    localTextView.setOnClickListener(null);
    localTextView.setText(h.b(this.mContext, this.lNF, localTextView.getTextSize()));
    GMTrace.o(6988448661504L, 52068);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */