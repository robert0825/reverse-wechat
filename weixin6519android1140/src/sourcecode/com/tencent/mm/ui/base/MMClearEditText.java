package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.TextView.SavedState;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.f.c.b;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.f;

public class MMClearEditText
  extends EditText
{
  public String iQk;
  private View.OnFocusChangeListener ogi;
  public View.OnTouchListener qLG;
  int sfj;
  public boolean ttL;
  final Drawable ttM;
  private boolean wbj;
  
  public MMClearEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3300279713792L, 24589);
    this.iQk = "";
    this.ttL = false;
    this.ttM = getResources().getDrawable(a.f.aXB);
    this.sfj = 0;
    this.ogi = null;
    this.qLG = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17514473979904L, 130493);
        paramAnonymousView = MMClearEditText.this;
        if (paramAnonymousView.getCompoundDrawables()[2] == null)
        {
          GMTrace.o(17514473979904L, 130493);
          return false;
        }
        if (paramAnonymousMotionEvent.getAction() != 1)
        {
          GMTrace.o(17514473979904L, 130493);
          return false;
        }
        if (paramAnonymousMotionEvent.getX() > paramAnonymousView.getWidth() - paramAnonymousView.getPaddingRight() - MMClearEditText.this.ttM.getIntrinsicWidth())
        {
          paramAnonymousView.setText("");
          MMClearEditText.c(MMClearEditText.this);
        }
        GMTrace.o(17514473979904L, 130493);
        return false;
      }
    };
    this.wbj = false;
    bZG();
    GMTrace.o(3300279713792L, 24589);
  }
  
  public MMClearEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3300413931520L, 24590);
    this.iQk = "";
    this.ttL = false;
    this.ttM = getResources().getDrawable(a.f.aXB);
    this.sfj = 0;
    this.ogi = null;
    this.qLG = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17514473979904L, 130493);
        paramAnonymousView = MMClearEditText.this;
        if (paramAnonymousView.getCompoundDrawables()[2] == null)
        {
          GMTrace.o(17514473979904L, 130493);
          return false;
        }
        if (paramAnonymousMotionEvent.getAction() != 1)
        {
          GMTrace.o(17514473979904L, 130493);
          return false;
        }
        if (paramAnonymousMotionEvent.getX() > paramAnonymousView.getWidth() - paramAnonymousView.getPaddingRight() - MMClearEditText.this.ttM.getIntrinsicWidth())
        {
          paramAnonymousView.setText("");
          MMClearEditText.c(MMClearEditText.this);
        }
        GMTrace.o(17514473979904L, 130493);
        return false;
      }
    };
    this.wbj = false;
    bZG();
    GMTrace.o(3300413931520L, 24590);
  }
  
  private void OX(String paramString)
  {
    GMTrace.i(3300816584704L, 24593);
    int i = getSelectionStart();
    setText(b.c(getContext(), paramString, getTextSize()));
    int j = getText().length() - paramString.length();
    if (j > 0)
    {
      i += j;
      if (i <= getText().length()) {
        setSelection(i);
      }
      GMTrace.o(3300816584704L, 24593);
      return;
    }
    setSelection(i);
    GMTrace.o(3300816584704L, 24593);
  }
  
  private void bKR()
  {
    GMTrace.i(3301085020160L, 24595);
    if ((getText().toString().equals("")) || (!isFocused()))
    {
      bKT();
      GMTrace.o(3301085020160L, 24595);
      return;
    }
    if (!this.wbj) {
      setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.ttM, getCompoundDrawables()[3]);
    }
    GMTrace.o(3301085020160L, 24595);
  }
  
  private void bKT()
  {
    GMTrace.i(3301219237888L, 24596);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
    GMTrace.o(3301219237888L, 24596);
  }
  
  private void bZG()
  {
    GMTrace.i(3300548149248L, 24591);
    this.ttM.setBounds(0, 0, this.ttM.getIntrinsicWidth(), this.ttM.getIntrinsicHeight());
    w.d("MicroMsg.MMClearEditText", "imgX width %d height %d", new Object[] { Integer.valueOf(this.ttM.getIntrinsicWidth()), Integer.valueOf(this.ttM.getIntrinsicHeight()) });
    bKR();
    setHeight(this.ttM.getIntrinsicHeight() + getResources().getDimensionPixelSize(a.e.aQG) * 5);
    setOnTouchListener(this.qLG);
    addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(17517560987648L, 130516);
        GMTrace.o(17517560987648L, 130516);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(17517695205376L, 130517);
        GMTrace.o(17517695205376L, 130517);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(17517426769920L, 130515);
        MMClearEditText.a(MMClearEditText.this);
        GMTrace.o(17517426769920L, 130515);
      }
    });
    super.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(17514339762176L, 130492);
        if (MMClearEditText.b(MMClearEditText.this) != null) {
          MMClearEditText.b(MMClearEditText.this).onFocusChange(paramAnonymousView, paramAnonymousBoolean);
        }
        MMClearEditText.a(MMClearEditText.this);
        GMTrace.o(17514339762176L, 130492);
      }
    });
    GMTrace.o(3300548149248L, 24591);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(3301353455616L, 24597);
    if (!(paramParcelable instanceof TextView.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      GMTrace.o(3301353455616L, 24597);
      return;
    }
    if (!this.ttL) {
      paramParcelable = View.BaseSavedState.EMPTY_STATE;
    }
    super.onRestoreInstanceState(paramParcelable);
    GMTrace.o(3301353455616L, 24597);
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    GMTrace.i(3300682366976L, 24592);
    boolean bool = super.onTextContextMenuItem(paramInt);
    String str;
    if (paramInt == 16908322)
    {
      this.sfj = 0;
      str = getText().toString();
    }
    try
    {
      OX(str);
      GMTrace.o(3300682366976L, 24592);
      return bool;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      for (;;)
      {
        w.e("MicroMsg.MMClearEditText", "!!MMClearEditText Exception %d", new Object[] { Integer.valueOf(this.sfj) });
        if (this.sfj < 3)
        {
          this.sfj += 1;
          OX(" " + str);
        }
        else
        {
          w.e("MicroMsg.MMClearEditText", "!!MMClearEditText, IndexOutOfBoundsException cannot fix");
        }
      }
    }
  }
  
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(3300950802432L, 24594);
    this.ogi = paramOnFocusChangeListener;
    GMTrace.o(3300950802432L, 24594);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMClearEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */