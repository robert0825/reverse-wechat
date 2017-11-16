package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;

public class f
  extends ClickableSpan
{
  private int iCQ;
  private Context mContext;
  public a rmz;
  int rz;
  
  public f(Context paramContext)
  {
    GMTrace.i(6961336680448L, 51866);
    this.mContext = null;
    this.rmz = null;
    this.rz = -1;
    this.iCQ = -1;
    this.mContext = paramContext;
    this.rz = this.mContext.getResources().getColor(a.c.smS);
    this.iCQ = this.mContext.getResources().getColor(a.c.transparent);
    GMTrace.o(6961336680448L, 51866);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(6961470898176L, 51867);
    if (this.rmz != null) {
      this.rmz.onClick(paramView);
    }
    GMTrace.o(6961470898176L, 51867);
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    GMTrace.i(6961605115904L, 51868);
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setFakeBoldText(false);
    paramTextPaint.setColor(this.rz);
    paramTextPaint.setUnderlineText(false);
    paramTextPaint.bgColor = this.iCQ;
    GMTrace.o(6961605115904L, 51868);
  }
  
  public static abstract interface a
  {
    public abstract void onClick(View paramView);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */