package com.tencent.mm.pluginsdk.ui;

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
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.bt.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class MMPhoneNumberEditText
  extends EditText
{
  public String iQk;
  private View.OnFocusChangeListener ogi;
  int sfj;
  public boolean ttL;
  public Drawable ttM;
  a ttN;
  public boolean ttO;
  private boolean ttP;
  
  public MMPhoneNumberEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1185410973696L, 8832);
    this.iQk = "";
    this.ttL = false;
    this.ttP = false;
    this.sfj = 0;
    this.ogi = null;
    init();
    GMTrace.o(1185410973696L, 8832);
  }
  
  public MMPhoneNumberEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1185545191424L, 8833);
    this.iQk = "";
    this.ttL = false;
    this.ttP = false;
    this.sfj = 0;
    this.ogi = null;
    init();
    GMTrace.o(1185545191424L, 8833);
  }
  
  private void OX(String paramString)
  {
    GMTrace.i(1185947844608L, 8836);
    int i = getSelectionStart();
    setText(g.bRE().a(getContext(), paramString, getTextSize()));
    int j = getText().length() - paramString.length();
    if (j > 0)
    {
      i += j;
      if (i <= getText().length()) {
        setSelection(i);
      }
      GMTrace.o(1185947844608L, 8836);
      return;
    }
    setSelection(i);
    GMTrace.o(1185947844608L, 8836);
  }
  
  private void bKR()
  {
    GMTrace.i(1186216280064L, 8838);
    if (getText().toString().equals(""))
    {
      bKT();
      GMTrace.o(1186216280064L, 8838);
      return;
    }
    bKS();
    GMTrace.o(1186216280064L, 8838);
  }
  
  private void bKT()
  {
    GMTrace.i(1186484715520L, 8840);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
    GMTrace.o(1186484715520L, 8840);
  }
  
  private void init()
  {
    GMTrace.i(1185679409152L, 8834);
    this.ttM = getResources().getDrawable(R.g.aXB);
    this.ttM.setBounds(0, 0, this.ttM.getIntrinsicWidth(), this.ttM.getIntrinsicHeight());
    w.d("MicroMsg.MMClearEditText", "imgX width %d height %d", new Object[] { Integer.valueOf(this.ttM.getIntrinsicWidth()), Integer.valueOf(this.ttM.getIntrinsicHeight()) });
    bKR();
    setHeight(this.ttM.getIntrinsicHeight() + getResources().getDimensionPixelSize(R.f.aQG) * 5);
    clearFocus();
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1153064501248L, 8591);
        paramAnonymousView = MMPhoneNumberEditText.this;
        if (paramAnonymousView.getCompoundDrawables()[2] == null)
        {
          GMTrace.o(1153064501248L, 8591);
          return false;
        }
        if ((paramAnonymousMotionEvent.getAction() == 1) && (paramAnonymousMotionEvent.getX() > paramAnonymousView.getWidth() - paramAnonymousView.getPaddingRight() - MMPhoneNumberEditText.this.ttM.getIntrinsicWidth()))
        {
          if (!paramAnonymousView.isFocused()) {
            break label99;
          }
          paramAnonymousView.setText("");
          MMPhoneNumberEditText.a(paramAnonymousView);
        }
        for (;;)
        {
          GMTrace.o(1153064501248L, 8591);
          return false;
          label99:
          if (MMPhoneNumberEditText.b(MMPhoneNumberEditText.this) != null) {
            MMPhoneNumberEditText.b(MMPhoneNumberEditText.this).f(paramAnonymousView);
          }
        }
      }
    });
    addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(1161922871296L, 8657);
        GMTrace.o(1161922871296L, 8657);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1162057089024L, 8658);
        if (bg.nm(paramAnonymousCharSequence.toString()))
        {
          MMPhoneNumberEditText.a(MMPhoneNumberEditText.this, true);
          GMTrace.o(1162057089024L, 8658);
          return;
        }
        MMPhoneNumberEditText.a(MMPhoneNumberEditText.this, false);
        GMTrace.o(1162057089024L, 8658);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1161788653568L, 8656);
        MMPhoneNumberEditText.c(MMPhoneNumberEditText.this);
        if ((paramAnonymousCharSequence.toString().equals("")) && (!MMPhoneNumberEditText.d(MMPhoneNumberEditText.this)))
        {
          if ((MMPhoneNumberEditText.b(MMPhoneNumberEditText.this) != null) && (MMPhoneNumberEditText.this.isFocused()))
          {
            MMPhoneNumberEditText.b(MMPhoneNumberEditText.this).g(MMPhoneNumberEditText.this);
            GMTrace.o(1161788653568L, 8656);
          }
        }
        else if ((!paramAnonymousCharSequence.toString().equals("")) && (MMPhoneNumberEditText.d(MMPhoneNumberEditText.this)))
        {
          if ((MMPhoneNumberEditText.b(MMPhoneNumberEditText.this) != null) && (MMPhoneNumberEditText.this.isFocused()))
          {
            MMPhoneNumberEditText.b(MMPhoneNumberEditText.this).bKU();
            GMTrace.o(1161788653568L, 8656);
          }
        }
        else if ((MMPhoneNumberEditText.b(MMPhoneNumberEditText.this) != null) && (MMPhoneNumberEditText.this.isFocused())) {
          MMPhoneNumberEditText.b(MMPhoneNumberEditText.this).bKV();
        }
        GMTrace.o(1161788653568L, 8656);
      }
    });
    super.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(1165144096768L, 8681);
        if (MMPhoneNumberEditText.e(MMPhoneNumberEditText.this) != null) {
          MMPhoneNumberEditText.e(MMPhoneNumberEditText.this).onFocusChange(paramAnonymousView, paramAnonymousBoolean);
        }
        MMPhoneNumberEditText.c(MMPhoneNumberEditText.this);
        GMTrace.o(1165144096768L, 8681);
      }
    });
    GMTrace.o(1185679409152L, 8834);
  }
  
  final void bKS()
  {
    GMTrace.i(1186350497792L, 8839);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.ttM, getCompoundDrawables()[3]);
    GMTrace.o(1186350497792L, 8839);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(1186618933248L, 8841);
    if (!(paramParcelable instanceof TextView.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      GMTrace.o(1186618933248L, 8841);
      return;
    }
    if (!this.ttL) {
      paramParcelable = View.BaseSavedState.EMPTY_STATE;
    }
    super.onRestoreInstanceState(paramParcelable);
    GMTrace.o(1186618933248L, 8841);
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    GMTrace.i(1185813626880L, 8835);
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
      GMTrace.o(1185813626880L, 8835);
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
    GMTrace.i(1186082062336L, 8837);
    this.ogi = paramOnFocusChangeListener;
    GMTrace.o(1186082062336L, 8837);
  }
  
  public static abstract interface a
  {
    public abstract void bKU();
    
    public abstract void bKV();
    
    public abstract void f(MMPhoneNumberEditText paramMMPhoneNumberEditText);
    
    public abstract void g(MMPhoneNumberEditText paramMMPhoneNumberEditText);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\MMPhoneNumberEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */