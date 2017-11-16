package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public class IconWidgetPreference
  extends Preference
{
  private ImageView nNU;
  private int nNV;
  private Bitmap nNW;
  
  public IconWidgetPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6769539547136L, 50437);
    GMTrace.o(6769539547136L, 50437);
  }
  
  public IconWidgetPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6769673764864L, 50438);
    this.nNU = null;
    this.nNV = -1;
    this.nNW = null;
    setLayoutResource(R.i.cBA);
    setWidgetLayoutResource(0);
    GMTrace.o(6769673764864L, 50438);
  }
  
  public final void C(Bitmap paramBitmap)
  {
    GMTrace.i(6769942200320L, 50440);
    this.nNW = paramBitmap;
    if (this.nNU != null) {
      this.nNU.setImageBitmap(paramBitmap);
    }
    GMTrace.o(6769942200320L, 50440);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6770076418048L, 50441);
    super.onBindView(paramView);
    this.nNU = ((ImageView)paramView.findViewById(R.h.bTL));
    if (this.nNU != null)
    {
      this.nNU.setVisibility(8);
      if (this.nNV != -1)
      {
        this.nNU.setImageResource(this.nNV);
        this.nNU.setVisibility(0);
        GMTrace.o(6770076418048L, 50441);
        return;
      }
      if (this.nNW != null)
      {
        this.nNU.setImageBitmap(this.nNW);
        this.nNU.setVisibility(0);
      }
    }
    GMTrace.o(6770076418048L, 50441);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6769807982592L, 50439);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.cCl, localViewGroup);
    GMTrace.o(6769807982592L, 50439);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\IconWidgetPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */