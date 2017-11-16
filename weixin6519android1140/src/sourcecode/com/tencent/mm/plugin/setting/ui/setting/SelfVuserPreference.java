package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;

public class SelfVuserPreference
  extends Preference
{
  Drawable drawable;
  private String oHj;
  String text;
  
  public SelfVuserPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(4632122228736L, 34512);
    GMTrace.o(4632122228736L, 34512);
  }
  
  public SelfVuserPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4632256446464L, 34513);
    setLayoutResource(R.i.cBA);
    GMTrace.o(4632256446464L, 34513);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(4632524881920L, 34515);
    super.onBindView(paramView);
    ImageView localImageView = (ImageView)paramView.findViewById(R.h.bGN);
    if (localImageView != null)
    {
      localImageView.setImageDrawable(this.drawable);
      w.d("MicroMsg.SelfVuserPreference", "onBindView set icon=" + this.drawable);
      if (!bg.nm(this.oHj)) {
        localImageView.setContentDescription(this.oHj);
      }
    }
    paramView = (TextView)paramView.findViewById(R.h.cgP);
    if (paramView != null)
    {
      paramView.setVisibility(0);
      paramView.setText(this.text);
    }
    GMTrace.o(4632524881920L, 34515);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(4632390664192L, 34514);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.cCi, localViewGroup);
    GMTrace.o(4632390664192L, 34514);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SelfVuserPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */