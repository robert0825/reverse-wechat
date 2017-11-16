package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public class CheckPreference
  extends Preference
{
  private TextView rcd;
  private int rce;
  private String rcf;
  private int rcg;
  public boolean sdM;
  private CheckBox wjq;
  public int wjr;
  
  public CheckPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(18740284489728L, 139626);
    GMTrace.o(18740284489728L, 139626);
  }
  
  public CheckPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18740418707456L, 139627);
    this.sdM = false;
    this.rce = -1;
    this.rcf = "";
    this.rcg = 8;
    this.wjr = -1;
    setLayoutResource(a.h.gfE);
    GMTrace.o(18740418707456L, 139627);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(18740687142912L, 139629);
    super.onBindView(paramView);
    this.wjq = ((CheckBox)paramView.findViewById(a.g.checkbox));
    this.wjq.setChecked(this.sdM);
    this.rcd = ((TextView)paramView.findViewById(a.g.gen));
    paramView = this.rcf;
    int i = this.rce;
    this.rce = i;
    this.rcf = paramView;
    if (this.rcd != null)
    {
      if (i > 0) {
        this.rcd.setBackgroundResource(this.rce);
      }
      if (!TextUtils.isEmpty(this.rcf)) {
        this.rcd.setText(this.rcf);
      }
    }
    this.rcg = this.rcg;
    if (this.rcd != null) {
      this.rcd.setVisibility(this.rcg);
    }
    paramView = (LinearLayout.LayoutParams)this.wjq.getLayoutParams();
    if (-1 != this.wjr) {
      paramView.setMargins(paramView.leftMargin, paramView.topMargin, this.wjr, paramView.bottomMargin);
    }
    GMTrace.o(18740687142912L, 139629);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(18740552925184L, 139628);
    paramViewGroup = super.onCreateView(paramViewGroup);
    GMTrace.o(18740552925184L, 139628);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\preference\CheckPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */