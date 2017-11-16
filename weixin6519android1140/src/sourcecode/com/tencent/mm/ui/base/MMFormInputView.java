package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.m;

public class MMFormInputView
  extends LinearLayout
{
  private TextView hqH;
  private int layout;
  private Context mContext;
  public EditText nUE;
  private int wbM;
  private int wbN;
  private int[] wbO;
  public View.OnFocusChangeListener wbP;
  
  public MMFormInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(3343363604480L, 24910);
    GMTrace.o(3343363604480L, 24910);
  }
  
  @TargetApi(11)
  public MMFormInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3343229386752L, 24909);
    this.mContext = null;
    this.wbM = -1;
    this.wbN = -1;
    this.layout = -1;
    this.wbP = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.enq, paramInt, 0);
    this.wbN = paramAttributeSet.getResourceId(a.m.ggL, -1);
    this.wbM = paramAttributeSet.getResourceId(a.m.ggN, -1);
    this.layout = paramAttributeSet.getResourceId(a.m.ggM, this.layout);
    paramAttributeSet.recycle();
    inflate(paramContext, this.layout, this);
    this.mContext = paramContext;
    GMTrace.o(3343229386752L, 24909);
  }
  
  public final void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    GMTrace.i(3343766257664L, 24913);
    if ((paramTextWatcher != null) && (this.nUE != null))
    {
      this.nUE.addTextChangedListener(paramTextWatcher);
      GMTrace.o(3343766257664L, 24913);
      return;
    }
    w.w("MicroMsg.MMFormInputView", "watcher : %s, contentET : %s", new Object[] { paramTextWatcher, this.nUE });
    GMTrace.o(3343766257664L, 24913);
  }
  
  public final Editable getText()
  {
    GMTrace.i(3343900475392L, 24914);
    if (this.nUE != null)
    {
      Editable localEditable = this.nUE.getText();
      GMTrace.o(3343900475392L, 24914);
      return localEditable;
    }
    w.e("MicroMsg.MMFormInputView", "contentET is null!");
    GMTrace.o(3343900475392L, 24914);
    return null;
  }
  
  public void onFinishInflate()
  {
    GMTrace.i(3343497822208L, 24911);
    this.hqH = ((TextView)findViewById(a.g.title));
    this.nUE = ((EditText)findViewById(a.g.bvB));
    if ((this.hqH == null) || (this.nUE == null)) {
      w.w("MicroMsg.MMFormInputView", "titleTV : %s, contentET : %s", new Object[] { this.hqH, this.nUE });
    }
    for (;;)
    {
      if (this.nUE != null)
      {
        View.OnFocusChangeListener local1 = new View.OnFocusChangeListener()
        {
          public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
          {
            GMTrace.i(3186463080448L, 23741);
            if (paramAnonymousView == MMFormInputView.a(MMFormInputView.this))
            {
              MMFormInputView.b(MMFormInputView.this);
              if (!paramAnonymousBoolean) {
                break label82;
              }
              MMFormInputView.this.setBackgroundResource(a.f.aXs);
            }
            for (;;)
            {
              MMFormInputView.c(MMFormInputView.this);
              if (MMFormInputView.d(MMFormInputView.this) != null) {
                MMFormInputView.d(MMFormInputView.this).onFocusChange(paramAnonymousView, paramAnonymousBoolean);
              }
              GMTrace.o(3186463080448L, 23741);
              return;
              label82:
              MMFormInputView.this.setBackgroundResource(a.f.aXt);
            }
          }
        };
        this.nUE.setOnFocusChangeListener(local1);
      }
      GMTrace.o(3343497822208L, 24911);
      return;
      if (this.wbM != -1) {
        this.hqH.setText(this.wbM);
      }
      if (this.wbN != -1) {
        this.nUE.setHint(this.wbN);
      }
    }
  }
  
  public final void setInputType(int paramInt)
  {
    GMTrace.i(3343632039936L, 24912);
    if (this.nUE != null)
    {
      this.nUE.setInputType(paramInt);
      GMTrace.o(3343632039936L, 24912);
      return;
    }
    w.e("MicroMsg.MMFormInputView", "contentET is null!");
    GMTrace.o(3343632039936L, 24912);
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(17512863367168L, 130481);
    if (this.nUE != null)
    {
      this.nUE.setText(paramString);
      GMTrace.o(17512863367168L, 130481);
      return;
    }
    w.e("MicroMsg.MMFormInputView", "contentET is null!");
    GMTrace.o(17512863367168L, 130481);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMFormInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */