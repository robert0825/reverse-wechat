package com.tencent.mm.wallet_core.ui.formview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnFocusChangeListener;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.k;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import com.tenpay.android.wechat.TenpaySecureEditText;

public final class EditHintPasswdView
  extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private static final int xFk;
  private View.OnFocusChangeListener hvh;
  private int qOe;
  private TenpaySecureEditText xFl;
  private int xFm;
  private int xFn;
  public int xFo;
  public a xFp;
  
  static
  {
    GMTrace.i(1489950998528L, 11101);
    xFk = a.e.snR;
    GMTrace.o(1489950998528L, 11101);
  }
  
  public EditHintPasswdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(1488474603520L, 11090);
    GMTrace.o(1488474603520L, 11090);
  }
  
  public EditHintPasswdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1488340385792L, 11089);
    this.xFl = null;
    this.xFm = 6;
    this.qOe = 1;
    this.xFn = xFk;
    this.xFo = 1;
    this.xFp = null;
    this.hvh = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.tjp, paramInt, 0);
    this.qOe = paramAttributeSet.getInteger(a.k.tjs, 1);
    this.xFn = paramAttributeSet.getResourceId(a.k.tjq, xFk);
    this.xFo = paramAttributeSet.getInteger(a.k.tjr, 1);
    paramAttributeSet.recycle();
    this.xFl = ((TenpaySecureEditText)v.fb(paramContext).inflate(a.g.sMx, this, true).findViewById(a.f.sJj));
    b.a(this.xFl, this.qOe);
    switch (this.qOe)
    {
    case 2: 
    default: 
      w.i("MicroMsg.EditHintPasswdView", "hy: error or not set format. use default");
      paramInt = 6;
    }
    for (;;)
    {
      this.xFm = paramInt;
      if (this.xFl == null) {
        break;
      }
      this.xFl.setBackgroundResource(this.xFn);
      this.xFl.setImeOptions(6);
      this.xFl.setInputType(128);
      this.xFl.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(1486058684416L, 11072);
          if (EditHintPasswdView.b(EditHintPasswdView.this) != null) {
            EditHintPasswdView.b(EditHintPasswdView.this).gR(EditHintPasswdView.c(EditHintPasswdView.this));
          }
          GMTrace.o(1486058684416L, 11072);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1485924466688L, 11071);
          GMTrace.o(1485924466688L, 11071);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1485790248960L, 11070);
          GMTrace.o(1485790248960L, 11070);
        }
      });
      this.xFl.setOnFocusChangeListener(this);
      super.setEnabled(true);
      super.setClickable(true);
      GMTrace.o(1488340385792L, 11089);
      return;
      paramInt = 6;
      continue;
      paramInt = 3;
      continue;
      paramInt = 4;
    }
    w.e("MicroMsg.EditHintPasswdView", "hy: no edit text view");
    GMTrace.o(1488340385792L, 11089);
  }
  
  private boolean QW()
  {
    GMTrace.i(1488743038976L, 11092);
    if ((this.xFl != null) && (this.xFl.getInputLength() == this.xFm))
    {
      GMTrace.o(1488743038976L, 11092);
      return true;
    }
    GMTrace.o(1488743038976L, 11092);
    return false;
  }
  
  public final void baC()
  {
    GMTrace.i(1489279909888L, 11096);
    if (this.xFl != null) {
      this.xFl.ClearInput();
    }
    GMTrace.o(1489279909888L, 11096);
  }
  
  public final String cmw()
  {
    GMTrace.i(1488608821248L, 11091);
    if (this.xFl != null)
    {
      String str = aa.RP(this.xFl.getText().toString());
      GMTrace.o(1488608821248L, 11091);
      return str;
    }
    w.w("MicroMsg.EditHintPasswdView", "hy: edit view is null");
    GMTrace.o(1488608821248L, 11091);
    return "";
  }
  
  public final View.OnFocusChangeListener getOnFocusChangeListener()
  {
    GMTrace.i(1489011474432L, 11094);
    View.OnFocusChangeListener localOnFocusChangeListener = this.hvh;
    GMTrace.o(1489011474432L, 11094);
    return localOnFocusChangeListener;
  }
  
  public final String getText()
  {
    GMTrace.i(1489145692160L, 11095);
    if (this.xFl != null)
    {
      String str = c.a.a(this.xFo, this.xFl);
      GMTrace.o(1489145692160L, 11095);
      return str;
    }
    w.w("MicroMsg.EditHintPasswdView", "hy: no edit view");
    GMTrace.o(1489145692160L, 11095);
    return "";
  }
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(1489548345344L, 11098);
    if (this.hvh != null) {
      this.hvh.onFocusChange(this, paramBoolean);
    }
    if (this.xFp != null) {
      this.xFp.gR(QW());
    }
    GMTrace.o(1489548345344L, 11098);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1489414127616L, 11097);
    setMeasuredDimension(getDefaultSize(BackwardSupportUtil.b.a(getContext(), 960.0F), paramInt1), getDefaultSize(BackwardSupportUtil.b.a(getContext(), 720.0F), paramInt2));
    paramInt2 = getMeasuredWidth();
    if (this.xFm == 0) {}
    for (paramInt1 = paramInt2 / 6;; paramInt1 = paramInt2 / this.xFm)
    {
      int i = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
      int j = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      setMeasuredDimension(getDefaultSize(paramInt2, i), getDefaultSize(paramInt1, j));
      super.onMeasure(i, j);
      GMTrace.o(1489414127616L, 11097);
      return;
    }
  }
  
  public final void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(1488877256704L, 11093);
    this.hvh = paramOnFocusChangeListener;
    GMTrace.o(1488877256704L, 11093);
  }
  
  public static abstract interface a
  {
    public abstract void gR(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\formview\EditHintPasswdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */