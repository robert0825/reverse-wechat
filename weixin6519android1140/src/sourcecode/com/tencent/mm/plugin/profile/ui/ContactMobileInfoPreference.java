package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactMobileInfoPreference
  extends Preference
{
  private TextView izE;
  private String mTitle;
  private TextView nLK;
  private String nLL;
  
  public ContactMobileInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(6759070564352L, 50359);
    GMTrace.o(6759070564352L, 50359);
  }
  
  public ContactMobileInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6759204782080L, 50360);
    setLayoutResource(R.i.cBA);
    GMTrace.o(6759204782080L, 50360);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6759473217536L, 50362);
    this.izE = ((TextView)paramView.findViewById(R.h.title));
    this.nLK = ((TextView)paramView.findViewById(R.h.bNy));
    if (this.izE != null) {
      this.izE.setText(this.mTitle);
    }
    if (this.nLK != null) {
      this.nLK.setText(this.nLL);
    }
    super.onBindView(paramView);
    GMTrace.o(6759473217536L, 50362);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6759338999808L, 50361);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBL, localViewGroup);
    GMTrace.o(6759338999808L, 50361);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\ContactMobileInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */