package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public final class HeadImgPreference
  extends Preference
{
  private int height;
  private ImageView iCr;
  public View.OnClickListener slu;
  private Bitmap tCO;
  
  public HeadImgPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1054682906624L, 7858);
    GMTrace.o(1054682906624L, 7858);
  }
  
  public HeadImgPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1054817124352L, 7859);
    this.height = -1;
    setLayoutResource(R.i.cBA);
    GMTrace.o(1054817124352L, 7859);
  }
  
  public final void M(Bitmap paramBitmap)
  {
    GMTrace.i(1055085559808L, 7861);
    this.tCO = null;
    if (this.iCr != null)
    {
      this.iCr.setImageBitmap(paramBitmap);
      GMTrace.o(1055085559808L, 7861);
      return;
    }
    this.tCO = paramBitmap;
    GMTrace.o(1055085559808L, 7861);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(1055219777536L, 7862);
    super.onBindView(paramView);
    if (this.iCr == null) {
      this.iCr = ((ImageView)paramView.findViewById(R.h.bGK));
    }
    if (this.slu != null) {
      this.iCr.setOnClickListener(this.slu);
    }
    if (this.tCO != null)
    {
      this.iCr.setImageBitmap(this.tCO);
      this.tCO = null;
    }
    paramView = (LinearLayout)paramView.findViewById(R.h.bNt);
    if (this.height != -1) {
      paramView.setMinimumHeight(this.height);
    }
    GMTrace.o(1055219777536L, 7862);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(1054951342080L, 7860);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.cBH, localViewGroup);
    this.iCr = ((ImageView)paramViewGroup.findViewById(R.h.bGK));
    GMTrace.o(1054951342080L, 7860);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\HeadImgPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */