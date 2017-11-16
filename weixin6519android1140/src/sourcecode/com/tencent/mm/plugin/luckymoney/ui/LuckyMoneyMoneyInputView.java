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
import com.tencent.mm.plugin.luckymoney.a.a;
import com.tencent.mm.plugin.luckymoney.b.c;
import com.tencent.mm.plugin.luckymoney.b.d;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.ui.e;
import com.tenpay.android.wechat.TenpaySecureEditText;

public class LuckyMoneyMoneyInputView
  extends LinearLayout
  implements b
{
  private TextWatcher WD;
  private TextView izE;
  private c mIa;
  public f mOA;
  public double mOB;
  public double mOC;
  TenpaySecureEditText mOx;
  private TextView mOy;
  private TextView mOz;
  public int mType;
  
  public LuckyMoneyMoneyInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9790243733504L, 72943);
    this.WD = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(9858694774784L, 73453);
        if (LuckyMoneyMoneyInputView.a(LuckyMoneyMoneyInputView.this) != null)
        {
          paramAnonymousEditable = LuckyMoneyMoneyInputView.a(LuckyMoneyMoneyInputView.this);
          LuckyMoneyMoneyInputView.this.getId();
          paramAnonymousEditable.aMq();
        }
        GMTrace.o(9858694774784L, 73453);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9858560557056L, 73452);
        GMTrace.o(9858560557056L, 73452);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9858426339328L, 73451);
        GMTrace.o(9858426339328L, 73451);
      }
    };
    a.aLP();
    this.mIa = a.aLQ().aMb();
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.sMT, this, true);
    this.mOx = ((TenpaySecureEditText)paramContext.findViewById(a.f.syw));
    this.mOx.addTextChangedListener(this.WD);
    this.izE = ((TextView)paramContext.findViewById(a.f.syT));
    this.mOz = ((TextView)paramContext.findViewById(a.f.syS));
    this.mOy = ((TextView)paramContext.findViewById(a.f.sxz));
    GMTrace.o(9790243733504L, 72943);
  }
  
  public final void BG(String paramString)
  {
    GMTrace.i(9790914822144L, 72948);
    this.mOx.setText(paramString);
    GMTrace.o(9790914822144L, 72948);
  }
  
  public final int aMI()
  {
    GMTrace.i(9791049039872L, 72949);
    if (bg.nm(this.mOx.getText().toString()))
    {
      GMTrace.o(9791049039872L, 72949);
      return 0;
    }
    double d = bg.getDouble(this.mOx.getText().toString(), -1.0D);
    if (d < 0.0D)
    {
      GMTrace.o(9791049039872L, 72949);
      return 3;
    }
    if ((d > this.mOB) && (this.mOB > 0.0D))
    {
      GMTrace.o(9791049039872L, 72949);
      return 1;
    }
    if ((d < this.mOC) && (d > 0.0D))
    {
      GMTrace.o(9791049039872L, 72949);
      return 2;
    }
    GMTrace.o(9791049039872L, 72949);
    return 0;
  }
  
  public final double aMJ()
  {
    GMTrace.i(9790377951232L, 72944);
    double d = bg.getDouble(this.mOx.getText().toString(), 0.0D);
    GMTrace.o(9790377951232L, 72944);
    return d;
  }
  
  public final void aMK()
  {
    GMTrace.i(9790780604416L, 72947);
    this.mOx.setFilters(new InputFilter[] { new InputFilter.LengthFilter(12) });
    GMTrace.o(9790780604416L, 72947);
  }
  
  public final void fO(boolean paramBoolean)
  {
    GMTrace.i(9790646386688L, 72946);
    if (paramBoolean)
    {
      this.mOz.setVisibility(0);
      GMTrace.o(9790646386688L, 72946);
      return;
    }
    this.mOz.setVisibility(8);
    GMTrace.o(9790646386688L, 72946);
  }
  
  public final void onError()
  {
    GMTrace.i(9791317475328L, 72951);
    this.izE.setTextColor(n.cL(getContext()));
    this.mOx.setTextColor(n.cL(getContext()));
    this.mOy.setTextColor(n.cL(getContext()));
    GMTrace.o(9791317475328L, 72951);
  }
  
  public final String qd(int paramInt)
  {
    GMTrace.i(9791451693056L, 72952);
    a.aLP();
    this.mIa = a.aLQ().aMb();
    String str;
    if (paramInt == 1)
    {
      if (this.mType == 1)
      {
        str = getContext().getString(a.i.sVo, new Object[] { Math.round(this.mOB), bg.aq(this.mIa.mHZ, "") });
        GMTrace.o(9791451693056L, 72952);
        return str;
      }
      str = getContext().getString(a.i.sTZ, new Object[] { Math.round(this.mOB), bg.aq(this.mIa.mHZ, "") });
      GMTrace.o(9791451693056L, 72952);
      return str;
    }
    if (paramInt == 2)
    {
      str = getContext().getString(a.i.sUa, new Object[] { e.r(this.mOC), bg.aq(this.mIa.mHZ, "") });
      GMTrace.o(9791451693056L, 72952);
      return str;
    }
    GMTrace.o(9791451693056L, 72952);
    return null;
  }
  
  public final void restore()
  {
    GMTrace.i(9791183257600L, 72950);
    this.izE.setTextColor(-16777216);
    this.mOx.setTextColor(-16777216);
    this.mOy.setTextColor(-16777216);
    GMTrace.o(9791183257600L, 72950);
  }
  
  public final void setTitle(String paramString)
  {
    GMTrace.i(9790512168960L, 72945);
    this.izE.setText(paramString);
    GMTrace.o(9790512168960L, 72945);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyMoneyInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */