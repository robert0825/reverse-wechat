package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.n;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;

public final class c
  extends Preference
{
  public String fKP;
  private TextView izE;
  public ImageView jXQ;
  private Context mContext;
  String mTitle;
  private View mView;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5403471511552L, 40259);
    this.mView = null;
    this.izE = null;
    this.jXQ = null;
    this.fKP = null;
    this.mTitle = null;
    this.mContext = null;
    this.mContext = paramContext;
    setLayoutResource(a.g.sMf);
    GMTrace.o(5403471511552L, 40259);
  }
  
  public c(Context paramContext, int paramInt)
  {
    super(paramContext);
    GMTrace.i(5403605729280L, 40260);
    this.mView = null;
    this.izE = null;
    this.jXQ = null;
    this.fKP = null;
    this.mTitle = null;
    this.mContext = null;
    this.mContext = paramContext;
    setLayoutResource(paramInt);
    GMTrace.o(5403605729280L, 40260);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5403739947008L, 40261);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(5403739947008L, 40261);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(5403874164736L, 40262);
    super.onBindView(paramView);
    this.izE = ((TextView)paramView.findViewById(16908310));
    this.jXQ = ((ImageView)paramView.findViewById(a.f.suh));
    this.izE.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, this.mTitle, this.izE.getTextSize()));
    if (!bg.nm(this.fKP))
    {
      this.jXQ.setVisibility(0);
      com.tencent.mm.kernel.h.xz();
      paramView = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(this.fKP);
      if ((paramView == null) || ((int)paramView.fTq <= 0))
      {
        w.d("MicroMsg.CollectPayInfoPreference", "Receiver in contactStg and try to get contact");
        final long l = bg.Pv();
        ak.a.gmX.a(this.fKP, "", new ak.b.a()
        {
          public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(5415416889344L, 40348);
            if (paramAnonymousBoolean)
            {
              w.v("MicroMsg.CollectPayInfoPreference", "getContact suc; cost=" + (bg.Pv() - l) + " ms");
              b.y(paramAnonymousString, 3);
              n.Dv().hS(paramAnonymousString);
            }
            for (;;)
            {
              a.b.a(c.this.jXQ, c.this.fKP);
              GMTrace.o(5415416889344L, 40348);
              return;
              w.w("MicroMsg.CollectPayInfoPreference", "getContact failed");
            }
          }
        });
        GMTrace.o(5403874164736L, 40262);
        return;
      }
      a.b.a(this.jXQ, this.fKP);
      GMTrace.o(5403874164736L, 40262);
      return;
    }
    this.jXQ.setVisibility(8);
    GMTrace.o(5403874164736L, 40262);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */