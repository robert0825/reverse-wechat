package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;

public class ChangeNumView
  extends TextView
{
  private int max;
  private int qva;
  private int rqp;
  private int rqq;
  private boolean rqr;
  private final int rqs;
  
  public ChangeNumView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6966973825024L, 51908);
    this.max = 0;
    this.rqp = 0;
    this.rqq = 0;
    this.rqr = false;
    this.rqs = 100;
    this.qva = -1;
    GMTrace.o(6966973825024L, 51908);
  }
  
  public ChangeNumView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6967108042752L, 51909);
    this.max = 0;
    this.rqp = 0;
    this.rqq = 0;
    this.rqr = false;
    this.rqs = 100;
    this.qva = -1;
    GMTrace.o(6967108042752L, 51909);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\view\ChangeNumView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */