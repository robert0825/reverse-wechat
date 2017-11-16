package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public class CheckBoxPreference
  extends Preference
{
  private TextView rcd;
  private int rce;
  private String rcf;
  private int rcg;
  private MMSwitchBtn saZ;
  public boolean sdM;
  
  public CheckBoxPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(3217735811072L, 23974);
    GMTrace.o(3217735811072L, 23974);
  }
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3217870028800L, 23975);
    GMTrace.o(3217870028800L, 23975);
  }
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3218004246528L, 23976);
    this.sdM = false;
    this.rce = -1;
    this.rcf = "";
    this.rcg = 8;
    setLayoutResource(a.h.gfF);
    GMTrace.o(3218004246528L, 23976);
  }
  
  public void cc(String paramString, int paramInt)
  {
    GMTrace.i(3218541117440L, 23980);
    this.rce = paramInt;
    this.rcf = paramString;
    if (this.rcd != null)
    {
      if (paramInt > 0) {
        this.rcd.setBackgroundResource(this.rce);
      }
      if (!TextUtils.isEmpty(this.rcf)) {
        this.rcd.setText(this.rcf);
      }
    }
    GMTrace.o(3218541117440L, 23980);
  }
  
  public final boolean isChecked()
  {
    GMTrace.i(3218272681984L, 23978);
    if (this.saZ != null)
    {
      bool = this.saZ.xrA;
      GMTrace.o(3218272681984L, 23978);
      return bool;
    }
    boolean bool = this.sdM;
    GMTrace.o(3218272681984L, 23978);
    return bool;
  }
  
  public final void lN(boolean paramBoolean)
  {
    GMTrace.i(3218406899712L, 23979);
    if (this.saZ != null)
    {
      this.sdM = paramBoolean;
      this.saZ.mK(paramBoolean);
    }
    GMTrace.o(3218406899712L, 23979);
  }
  
  public void onBindView(View paramView)
  {
    GMTrace.i(3218138464256L, 23977);
    super.onBindView(paramView);
    this.saZ = ((MMSwitchBtn)paramView.findViewById(a.g.checkbox));
    this.saZ.xrE = new MMSwitchBtn.a()
    {
      public final void cc(boolean paramAnonymousBoolean)
      {
        GMTrace.i(3234513027072L, 24099);
        CheckBoxPreference.this.callChangeListener(Boolean.valueOf(paramAnonymousBoolean));
        GMTrace.o(3234513027072L, 24099);
      }
    };
    this.saZ.mK(this.sdM);
    if (!isEnabled())
    {
      this.saZ.setEnabled(false);
      ((TextView)paramView.findViewById(16908310)).setTextColor(paramView.getResources().getColor(a.d.aMU));
    }
    this.rcd = ((TextView)paramView.findViewById(a.g.gen));
    cc(this.rcf, this.rce);
    wO(this.rcg);
    GMTrace.o(3218138464256L, 23977);
  }
  
  public void wO(int paramInt)
  {
    GMTrace.i(3218675335168L, 23981);
    this.rcg = paramInt;
    if (this.rcd != null) {
      this.rcd.setVisibility(this.rcg);
    }
    GMTrace.o(3218675335168L, 23981);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\preference\CheckBoxPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */