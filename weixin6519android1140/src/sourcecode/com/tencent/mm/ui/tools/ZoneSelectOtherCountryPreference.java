package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.Preference;

public class ZoneSelectOtherCountryPreference
  extends Preference
{
  String text;
  public a xkf;
  
  public ZoneSelectOtherCountryPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(16858015072256L, 125602);
    GMTrace.o(16858015072256L, 125602);
  }
  
  public ZoneSelectOtherCountryPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(16858149289984L, 125603);
    GMTrace.o(16858149289984L, 125603);
  }
  
  public ZoneSelectOtherCountryPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16858283507712L, 125604);
    setLayoutResource(R.i.cBA);
    GMTrace.o(16858283507712L, 125604);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(16858551943168L, 125606);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(R.h.coO);
    if (!bg.nm(this.text)) {
      localTextView.setText(this.text);
    }
    paramView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16859357249536L, 125612);
        if (ZoneSelectOtherCountryPreference.this.xkf != null) {
          ZoneSelectOtherCountryPreference.this.xkf.onClick();
        }
        GMTrace.o(16859357249536L, 125612);
      }
    });
    GMTrace.o(16858551943168L, 125606);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(16858417725440L, 125605);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBW, localViewGroup);
    GMTrace.o(16858417725440L, 125605);
    return paramViewGroup;
  }
  
  public static abstract interface a
  {
    public abstract void onClick();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\ZoneSelectOtherCountryPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */