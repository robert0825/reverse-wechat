package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.preference.Preference;

public final class HeadImgNewPreference
  extends Preference
{
  private int height;
  public ImageView iCr;
  public View.OnClickListener slu;
  private TextView tCK;
  public String tCL;
  public boolean tCM;
  private boolean tCN;
  private View typ;
  
  public HeadImgNewPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1038174126080L, 7735);
    GMTrace.o(1038174126080L, 7735);
  }
  
  public HeadImgNewPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1038308343808L, 7736);
    this.height = -1;
    this.tCM = false;
    this.tCN = false;
    setLayoutResource(R.i.cBA);
    GMTrace.o(1038308343808L, 7736);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(1038576779264L, 7738);
    super.onBindView(paramView);
    if (this.iCr == null) {
      this.iCr = ((ImageView)paramView.findViewById(R.h.bGK));
    }
    if (this.tCK == null) {
      this.tCK = ((TextView)paramView.findViewById(R.h.bRe));
    }
    if (this.typ == null) {
      this.typ = paramView.findViewById(R.h.bMb);
    }
    if (this.slu != null) {
      this.typ.setOnClickListener(this.slu);
    }
    if (this.tCL != null)
    {
      a.b.a(this.iCr, this.tCL);
      this.tCL = null;
    }
    if (!this.tCM)
    {
      this.typ.setVisibility(8);
      this.tCK.setVisibility(0);
    }
    for (;;)
    {
      paramView = (RelativeLayout)paramView.findViewById(R.h.bNt);
      if (this.height != -1) {
        paramView.setMinimumHeight(this.height);
      }
      GMTrace.o(1038576779264L, 7738);
      return;
      this.tCK.setVisibility(8);
      this.typ.setVisibility(0);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(1038442561536L, 7737);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    if (this.tCN) {
      View.inflate(this.mContext, R.i.cCA, localViewGroup);
    }
    for (;;)
    {
      this.iCr = ((ImageView)paramViewGroup.findViewById(R.h.bGK));
      this.tCK = ((TextView)paramViewGroup.findViewById(R.h.bRe));
      this.typ = paramViewGroup.findViewById(R.h.bMb);
      GMTrace.o(1038442561536L, 7737);
      return paramViewGroup;
      View.inflate(this.mContext, R.i.cBI, localViewGroup);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\HeadImgNewPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */