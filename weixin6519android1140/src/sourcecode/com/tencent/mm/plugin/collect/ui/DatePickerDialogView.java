package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMSpinnerDatePicker;

public class DatePickerDialogView
  extends LinearLayout
  implements View.OnClickListener
{
  private CollectRadioBtnView kba;
  private CollectRadioBtnView kbb;
  private CollectRadioBtnView kbc;
  MMSpinnerDatePicker kbd;
  TextView kbe;
  TextView kbf;
  int kbg;
  
  public DatePickerDialogView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5417967026176L, 40367);
    this.kbg = 0;
    init(paramContext);
    GMTrace.o(5417967026176L, 40367);
  }
  
  public DatePickerDialogView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5418101243904L, 40368);
    this.kbg = 0;
    init(paramContext);
    GMTrace.o(5418101243904L, 40368);
  }
  
  public DatePickerDialogView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5418235461632L, 40369);
    this.kbg = 0;
    init(paramContext);
    GMTrace.o(5418235461632L, 40369);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(5418369679360L, 40370);
    paramContext = v.fb(paramContext).inflate(a.g.sLS, this);
    this.kba = ((CollectRadioBtnView)paramContext.findViewById(a.f.geE));
    this.kbb = ((CollectRadioBtnView)paramContext.findViewById(a.f.gdG));
    this.kbc = ((CollectRadioBtnView)paramContext.findViewById(a.f.gde));
    this.kbe = ((TextView)paramContext.findViewById(a.f.sur));
    this.kbf = ((TextView)paramContext.findViewById(a.f.biN));
    this.kba.setOnClickListener(this);
    this.kbb.setOnClickListener(this);
    this.kbc.setOnClickListener(this);
    this.kba.vl("年");
    this.kbb.vl("月");
    this.kbc.vl("日");
    this.kbd = ((MMSpinnerDatePicker)paramContext.findViewById(a.f.suv));
    this.kbd.El(a.c.transparent);
    paramContext = this.kbd;
    int i = a.d.aQF;
    paramContext.a(paramContext.xri, i);
    paramContext.a(paramContext.xrj, i);
    paramContext.a(paramContext.xrk, i);
    GMTrace.o(5418369679360L, 40370);
  }
  
  final void apq()
  {
    GMTrace.i(5418638114816L, 40372);
    if (this.kbg == 2)
    {
      this.kba.mq(a.h.cOv);
      this.kbb.mq(a.h.cOu);
      this.kbc.mq(a.h.cOu);
    }
    for (;;)
    {
      this.kbd.Ek(this.kbg);
      GMTrace.o(5418638114816L, 40372);
      return;
      if (this.kbg == 1)
      {
        this.kba.mq(a.h.cOu);
        this.kbb.mq(a.h.cOv);
        this.kbc.mq(a.h.cOu);
      }
      else
      {
        this.kba.mq(a.h.cOu);
        this.kbb.mq(a.h.cOu);
        this.kbc.mq(a.h.cOv);
      }
    }
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(5418503897088L, 40371);
    int i = paramView.getId();
    if (i == a.f.geE) {
      this.kbg = 2;
    }
    for (;;)
    {
      apq();
      GMTrace.o(5418503897088L, 40371);
      return;
      if (i == a.f.gdG) {
        this.kbg = 1;
      } else if (i == a.f.gde) {
        this.kbg = 0;
      } else {
        w.i("MicroMsg.DatePickerDialogView", "unhandled click view: %s", new Object[] { paramView.getClass().toString() });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\DatePickerDialogView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */