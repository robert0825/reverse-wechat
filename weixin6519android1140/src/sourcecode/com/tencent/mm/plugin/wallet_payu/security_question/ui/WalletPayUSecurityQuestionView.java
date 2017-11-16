package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.k;
import com.tencent.mm.ui.tools.CustomFitTextView;
import com.tencent.mm.v.a.d;

public class WalletPayUSecurityQuestionView
  extends LinearLayout
{
  private Context mContext;
  private TextView rvD;
  private CustomFitTextView rvE;
  String rvF;
  
  public WalletPayUSecurityQuestionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(7928509628416L, 59072);
    GMTrace.o(7928509628416L, 59072);
  }
  
  public WalletPayUSecurityQuestionView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7928375410688L, 59071);
    this.mContext = paramContext;
    paramContext = "";
    Object localObject = "";
    boolean bool;
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = this.mContext.obtainStyledAttributes(paramAttributeSet, a.k.tip, -1, 0);
      paramInt = localTypedArray.getResourceId(a.k.tiD, 0);
      if (paramInt != 0) {
        paramContext = this.mContext.getString(paramInt);
      }
      paramInt = localTypedArray.getResourceId(a.k.tiy, 0);
      paramAttributeSet = (AttributeSet)localObject;
      if (paramInt != 0) {
        paramAttributeSet = this.mContext.getString(paramInt);
      }
      bool = localTypedArray.getBoolean(a.k.tir, false);
      localTypedArray.recycle();
    }
    for (;;)
    {
      localObject = LayoutInflater.from(this.mContext).inflate(a.g.sNR, this, true);
      this.rvD = ((TextView)((View)localObject).findViewById(a.f.chy));
      this.rvE = ((CustomFitTextView)((View)localObject).findViewById(a.f.sEw));
      this.rvD.setText(paramContext);
      paramContext = this.rvE;
      paramContext.a(paramAttributeSet, paramContext.maxLines, paramContext.xgM, paramContext.xgK, paramContext.getResources().getColor(a.d.aOa));
      if (!bool)
      {
        this.rvE.setEnabled(false);
        this.rvE.setFocusable(false);
        this.rvE.setClickable(false);
        this.rvE.setBackgroundResource(a.e.bbj);
        setBackgroundResource(a.e.aXC);
        GMTrace.o(7928375410688L, 59071);
        return;
      }
      this.rvE.setEnabled(false);
      this.rvE.setTextColor(getResources().getColor(a.c.smO));
      this.rvE.setFocusable(false);
      this.rvE.setClickable(false);
      this.rvE.setBackgroundResource(a.e.bbj);
      setBackgroundResource(a.e.aVO);
      GMTrace.o(7928375410688L, 59071);
      return;
      bool = false;
      paramContext = "";
      paramAttributeSet = (AttributeSet)localObject;
    }
  }
  
  public final void KM(String paramString)
  {
    GMTrace.i(7928643846144L, 59073);
    this.rvF = paramString;
    KeyListener localKeyListener = this.rvE.getKeyListener();
    this.rvE.setInputType(1);
    this.rvE.setKeyListener(null);
    this.rvE.b(paramString, 3, false, -1);
    this.rvE.setKeyListener(localKeyListener);
    GMTrace.o(7928643846144L, 59073);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\security_question\ui\WalletPayUSecurityQuestionView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */