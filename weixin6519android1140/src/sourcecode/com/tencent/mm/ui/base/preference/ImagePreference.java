package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.m;

public final class ImagePreference
  extends Preference
{
  private ImageView nNH;
  private e wkh;
  
  public ImagePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3238002688000L, 24125);
    GMTrace.o(3238002688000L, 24125);
  }
  
  public ImagePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3238136905728L, 24126);
    this.nNH = null;
    this.wkh = new e();
    setLayoutResource(a.h.gfz);
    setWidgetLayoutResource(a.h.cCj);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.eny);
    paramInt = paramContext.getResourceId(a.m.ggO, 0);
    if (paramInt > 0)
    {
      paramAttributeSet = this.wkh;
      paramAttributeSet.qPV = paramInt;
      paramAttributeSet.bitmap = null;
      this.wkh.g(this.nNH);
    }
    paramContext.recycle();
    GMTrace.o(3238136905728L, 24126);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(3238405341184L, 24128);
    super.onBindView(paramView);
    this.nNH = ((ImageView)paramView.findViewById(a.g.bGN));
    this.wkh.g(this.nNH);
    GMTrace.o(3238405341184L, 24128);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3238271123456L, 24127);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.gdc);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.h.gfz, localViewGroup);
    GMTrace.o(3238271123456L, 24127);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\preference\ImagePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */