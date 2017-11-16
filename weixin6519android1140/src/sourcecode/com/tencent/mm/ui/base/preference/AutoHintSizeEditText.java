package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.e;

public class AutoHintSizeEditText
  extends EditText
{
  private float wji;
  private Paint wjj;
  private String wjk;
  private int wjl;
  private float wjm;
  
  public AutoHintSizeEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3212635537408L, 23936);
    this.wjk = "";
    this.wjl = Integer.MIN_VALUE;
    init();
    GMTrace.o(3212635537408L, 23936);
  }
  
  public AutoHintSizeEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3212501319680L, 23935);
    this.wjk = "";
    this.wjl = Integer.MIN_VALUE;
    init();
    GMTrace.o(3212501319680L, 23935);
  }
  
  private void a(Editable paramEditable, CharSequence paramCharSequence, int paramInt)
  {
    GMTrace.i(3212903972864L, 23938);
    if ((paramEditable != null) && (!bg.nm(paramEditable.toString())))
    {
      if (getTextSize() != this.wji)
      {
        w.v("MicroMsg.AutoHintSizeEdittext", "content not null, reset text size %f", new Object[] { Float.valueOf(this.wji) });
        setTextSize(0, this.wji);
      }
      GMTrace.o(3212903972864L, 23938);
      return;
    }
    if ((paramCharSequence == null) || (bg.nm(paramCharSequence.toString())))
    {
      if (getTextSize() != this.wji)
      {
        w.v("MicroMsg.AutoHintSizeEdittext", "hint is null, reset text size %f", new Object[] { Float.valueOf(this.wji) });
        setTextSize(0, this.wji);
      }
      GMTrace.o(3212903972864L, 23938);
      return;
    }
    paramEditable = paramCharSequence.toString();
    if ((this.wjk.equals(paramEditable)) && (this.wjl == paramInt))
    {
      if (getTextSize() != this.wjm)
      {
        w.v("MicroMsg.AutoHintSizeEdittext", "use last hint text size %f", new Object[] { Float.valueOf(this.wjm) });
        setTextSize(0, this.wjm);
      }
      GMTrace.o(3212903972864L, 23938);
      return;
    }
    this.wjk = paramEditable;
    this.wjl = paramInt;
    if (getPaint().measureText(paramEditable) > paramInt)
    {
      int j = getResources().getDimensionPixelSize(a.e.aQR);
      int k = a.fromDPToPix(getContext(), 1);
      int i = (int)this.wji - k;
      while (i > j)
      {
        this.wjj.setTextSize(i);
        if (this.wjj.measureText(paramEditable) < paramInt)
        {
          w.v("MicroMsg.AutoHintSizeEdittext", "get new hint text size %d", new Object[] { Integer.valueOf(i) });
          this.wjm = i;
          setTextSize(0, i);
          GMTrace.o(3212903972864L, 23938);
          return;
        }
        i -= k;
      }
    }
    GMTrace.o(3212903972864L, 23938);
  }
  
  private void init()
  {
    GMTrace.i(3212769755136L, 23937);
    this.wji = getTextSize();
    this.wjm = this.wji;
    this.wjj = new Paint(getPaint());
    addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(3212367101952L, 23934);
        AutoHintSizeEditText.a(AutoHintSizeEditText.this, paramAnonymousEditable, AutoHintSizeEditText.this.getHint(), AutoHintSizeEditText.this.getWidth() - AutoHintSizeEditText.this.getPaddingLeft() - AutoHintSizeEditText.this.getPaddingRight());
        GMTrace.o(3212367101952L, 23934);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(3212232884224L, 23933);
        GMTrace.o(3212232884224L, 23933);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(3212098666496L, 23932);
        GMTrace.o(3212098666496L, 23932);
      }
    });
    GMTrace.o(3212769755136L, 23937);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3213038190592L, 23939);
    w.d("MicroMsg.AutoHintSizeEdittext", "on layout, changed %B", new Object[] { Boolean.valueOf(paramBoolean) });
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean) {
      a(getText(), getHint(), paramInt3 - paramInt1 - getPaddingLeft() - getPaddingRight());
    }
    GMTrace.o(3213038190592L, 23939);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\preference\AutoHintSizeEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */