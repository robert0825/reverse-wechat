package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.address.model.RcptItem;
import com.tencent.mm.ui.base.preference.Preference;

public class RcptPreference
  extends Preference
{
  RcptItem hwk;
  
  public RcptPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(12797928800256L, 95352);
    GMTrace.o(12797928800256L, 95352);
  }
  
  public RcptPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(12798063017984L, 95353);
    GMTrace.o(12798063017984L, 95353);
  }
  
  public RcptPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12798197235712L, 95354);
    setLayoutResource(R.i.cBA);
    GMTrace.o(12798197235712L, 95354);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(12798465671168L, 95356);
    super.onBindView(paramView);
    if (this.hwk == null)
    {
      GMTrace.o(12798465671168L, 95356);
      return;
    }
    ((TextView)paramView.findViewById(R.h.coO)).setText(this.hwk.name);
    paramView = paramView.findViewById(16908312);
    if (this.hwk.hus)
    {
      paramView.setVisibility(0);
      GMTrace.o(12798465671168L, 95356);
      return;
    }
    paramView.setVisibility(8);
    GMTrace.o(12798465671168L, 95356);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(12798331453440L, 95355);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBQ, localViewGroup);
    GMTrace.o(12798331453440L, 95355);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\RcptPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */