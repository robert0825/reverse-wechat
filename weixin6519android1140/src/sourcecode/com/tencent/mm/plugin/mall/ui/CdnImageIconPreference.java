package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.Preference;

public class CdnImageIconPreference
  extends IconPreference
{
  String iconUrl;
  private CdnImageView mRv;
  
  public CdnImageIconPreference(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20960111493120L, 156165);
    GMTrace.o(20960111493120L, 156165);
  }
  
  public CdnImageIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20960245710848L, 156166);
    GMTrace.o(20960245710848L, 156166);
  }
  
  public CdnImageIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20960379928576L, 156167);
    GMTrace.o(20960379928576L, 156167);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(20960648364032L, 156169);
    super.onBindView(paramView);
    this.mRv = ((CdnImageView)paramView.findViewById(a.f.bGN));
    if (!bg.nm(this.iconUrl))
    {
      this.mRv.twG = true;
      this.mRv.setUrl(this.iconUrl);
      this.mRv.setVisibility(0);
    }
    GMTrace.o(20960648364032L, 156169);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(20960514146304L, 156168);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(com.tencent.mm.v.a.g.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, com.tencent.mm.plugin.wxpay.a.g.sLQ, localViewGroup);
    GMTrace.o(20960514146304L, 156168);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\ui\CdnImageIconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */