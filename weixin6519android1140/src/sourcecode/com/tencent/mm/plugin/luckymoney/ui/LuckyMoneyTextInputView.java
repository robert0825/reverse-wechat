package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.widget.MMEditText;

public class LuckyMoneyTextInputView
  extends LinearLayout
  implements b
{
  private TextView izE;
  public f mOA;
  private MMEditText mQD;
  
  public LuckyMoneyTextInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9829301092352L, 73234);
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.sNe, this, true);
    this.mQD = ((MMEditText)paramContext.findViewById(a.f.sAz));
    this.izE = ((TextView)paramContext.findViewById(a.f.sAA));
    this.mQD.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(9831448576000L, 73250);
        if (LuckyMoneyTextInputView.a(LuckyMoneyTextInputView.this) != null)
        {
          paramAnonymousView = LuckyMoneyTextInputView.a(LuckyMoneyTextInputView.this);
          LuckyMoneyTextInputView.this.getId();
          paramAnonymousView.aMq();
        }
        GMTrace.o(9831448576000L, 73250);
      }
    });
    GMTrace.o(9829301092352L, 73234);
  }
  
  public final void BI(String paramString)
  {
    GMTrace.i(9829569527808L, 73236);
    this.mQD.setHint(paramString);
    GMTrace.o(9829569527808L, 73236);
  }
  
  public final int aMI()
  {
    GMTrace.i(9829703745536L, 73237);
    GMTrace.o(9829703745536L, 73237);
    return 0;
  }
  
  public final String getInput()
  {
    GMTrace.i(9829435310080L, 73235);
    String str = this.mQD.getText().toString();
    GMTrace.o(9829435310080L, 73235);
    return str;
  }
  
  public final void onError()
  {
    GMTrace.i(9829972180992L, 73239);
    GMTrace.o(9829972180992L, 73239);
  }
  
  public final String qd(int paramInt)
  {
    GMTrace.i(9830106398720L, 73240);
    GMTrace.o(9830106398720L, 73240);
    return null;
  }
  
  public final void restore()
  {
    GMTrace.i(9829837963264L, 73238);
    GMTrace.o(9829837963264L, 73238);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyTextInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */