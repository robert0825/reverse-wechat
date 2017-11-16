package com.tencent.mm.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.v;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public class MMDatePickerView
  extends LinearLayout
  implements View.OnClickListener
{
  private MMSpinnerDatePicker kbd;
  private Button xqm;
  private Button xqn;
  private Button xqo;
  
  public MMDatePickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1617323622400L, 12050);
    init(paramContext);
    GMTrace.o(1617323622400L, 12050);
  }
  
  public MMDatePickerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1617457840128L, 12051);
    init(paramContext);
    GMTrace.o(1617457840128L, 12051);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(1617592057856L, 12052);
    paramContext = v.fb(paramContext).inflate(a.h.gfg, this);
    this.xqm = ((Button)paramContext.findViewById(a.g.geE));
    this.xqn = ((Button)paramContext.findViewById(a.g.gdG));
    this.xqo = ((Button)paramContext.findViewById(a.g.gde));
    this.kbd = ((MMSpinnerDatePicker)paramContext.findViewById(a.g.gdA));
    this.xqm.setOnClickListener(this);
    this.xqn.setOnClickListener(this);
    this.xqo.setOnClickListener(this);
    GMTrace.o(1617592057856L, 12052);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(1617726275584L, 12053);
    int i = paramView.getId();
    if (i == a.g.geE)
    {
      this.kbd.Ek(0);
      GMTrace.o(1617726275584L, 12053);
      return;
    }
    if (i == a.g.gdG)
    {
      this.kbd.Ek(1);
      GMTrace.o(1617726275584L, 12053);
      return;
    }
    this.kbd.Ek(2);
    GMTrace.o(1617726275584L, 12053);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\widget\MMDatePickerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */