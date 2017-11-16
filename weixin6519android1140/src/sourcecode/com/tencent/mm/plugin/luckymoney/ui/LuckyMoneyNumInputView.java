package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tenpay.android.wechat.TenpaySecureEditText;

public class LuckyMoneyNumInputView
  extends LinearLayout
  implements b
{
  private TextWatcher WD;
  private TextView izE;
  public f mOA;
  TenpaySecureEditText mPI;
  private TextView mPJ;
  private int mPK;
  private int mPL;
  public int mPM;
  
  public LuckyMoneyNumInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9835609325568L, 73281);
    this.mPK = 1;
    this.mPL = Integer.MAX_VALUE;
    this.mPM = 1;
    this.WD = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(9841649123328L, 73326);
        if (LuckyMoneyNumInputView.a(LuckyMoneyNumInputView.this) != null)
        {
          paramAnonymousEditable = LuckyMoneyNumInputView.a(LuckyMoneyNumInputView.this);
          LuckyMoneyNumInputView.this.getId();
          paramAnonymousEditable.aMq();
        }
        GMTrace.o(9841649123328L, 73326);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9841514905600L, 73325);
        GMTrace.o(9841514905600L, 73325);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9841380687872L, 73324);
        GMTrace.o(9841380687872L, 73324);
      }
    };
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.sNa, this, true);
    this.izE = ((TextView)paramContext.findViewById(a.f.szQ));
    this.mPI = ((TenpaySecureEditText)paramContext.findViewById(a.f.syw));
    this.mPJ = ((TextView)paramContext.findViewById(a.f.szR));
    this.mPI.setText(this.mPK);
    this.mPI.addTextChangedListener(this.WD);
    GMTrace.o(9835609325568L, 73281);
  }
  
  public final void BH(String paramString)
  {
    GMTrace.i(9836011978752L, 73284);
    this.mPI.setText(paramString);
    this.mPI.setSelection(this.mPI.getText().length());
    this.mPK = bg.getInt(paramString, 0);
    GMTrace.o(9836011978752L, 73284);
  }
  
  public final int aMI()
  {
    GMTrace.i(9836146196480L, 73285);
    if (bg.nm(this.mPI.getText().toString()))
    {
      GMTrace.o(9836146196480L, 73285);
      return 0;
    }
    int i = bg.getInt(this.mPI.getText().toString(), -1);
    if (i < 0)
    {
      GMTrace.o(9836146196480L, 73285);
      return 3;
    }
    if ((i > this.mPL) && (this.mPL > 0))
    {
      GMTrace.o(9836146196480L, 73285);
      return 1;
    }
    if ((i < this.mPM) && (this.mPM > 0))
    {
      GMTrace.o(9836146196480L, 73285);
      return 2;
    }
    GMTrace.o(9836146196480L, 73285);
    return 0;
  }
  
  public final int aMQ()
  {
    GMTrace.i(9835877761024L, 73283);
    int i = bg.getInt(this.mPI.getText().toString(), 0);
    GMTrace.o(9835877761024L, 73283);
    return i;
  }
  
  public final void onError()
  {
    GMTrace.i(9836414631936L, 73287);
    this.izE.setTextColor(n.cL(getContext()));
    this.mPI.setTextColor(n.cL(getContext()));
    this.mPJ.setTextColor(n.cL(getContext()));
    GMTrace.o(9836414631936L, 73287);
  }
  
  public final String qd(int paramInt)
  {
    GMTrace.i(9836548849664L, 73288);
    String str;
    if (paramInt == 1)
    {
      str = getContext().getString(a.i.sUP, new Object[] { Integer.valueOf(this.mPL) });
      GMTrace.o(9836548849664L, 73288);
      return str;
    }
    if (paramInt == 2)
    {
      str = getContext().getString(a.i.sUO, new Object[] { Integer.valueOf(this.mPM) });
      GMTrace.o(9836548849664L, 73288);
      return str;
    }
    GMTrace.o(9836548849664L, 73288);
    return null;
  }
  
  public final void qf(int paramInt)
  {
    int j = 3;
    GMTrace.i(9835743543296L, 73282);
    this.mPL = paramInt;
    int k = 0;
    int i = paramInt;
    paramInt = k;
    while (i > 0)
    {
      paramInt += 1;
      i /= 10;
    }
    if (paramInt <= 3) {
      paramInt = j;
    }
    for (;;)
    {
      this.mPI.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
      GMTrace.o(9835743543296L, 73282);
      return;
    }
  }
  
  public final void restore()
  {
    GMTrace.i(9836280414208L, 73286);
    this.izE.setTextColor(-16777216);
    this.mPI.setTextColor(-16777216);
    this.mPJ.setTextColor(-16777216);
    GMTrace.o(9836280414208L, 73286);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyNumInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */