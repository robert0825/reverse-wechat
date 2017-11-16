package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.f;

public class MMAutoCompleteTextView
  extends AutoCompleteTextView
{
  final Drawable ttM;
  public a waS;
  
  public MMAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3181631242240L, 23705);
    this.ttM = getResources().getDrawable(a.f.aXB);
    this.ttM.setBounds(0, 0, this.ttM.getIntrinsicWidth(), this.ttM.getIntrinsicHeight());
    bKR();
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(3331284008960L, 24820);
        paramAnonymousView = MMAutoCompleteTextView.this;
        if (paramAnonymousView.getCompoundDrawables()[2] == null)
        {
          GMTrace.o(3331284008960L, 24820);
          return false;
        }
        if (paramAnonymousMotionEvent.getAction() != 1)
        {
          GMTrace.o(3331284008960L, 24820);
          return false;
        }
        if (paramAnonymousMotionEvent.getX() > paramAnonymousView.getWidth() - paramAnonymousView.getPaddingRight() - MMAutoCompleteTextView.this.ttM.getIntrinsicWidth())
        {
          paramAnonymousView.setText("");
          MMAutoCompleteTextView.a(MMAutoCompleteTextView.this);
        }
        GMTrace.o(3331284008960L, 24820);
        return false;
      }
    });
    addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(3266188410880L, 24335);
        GMTrace.o(3266188410880L, 24335);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(3266322628608L, 24336);
        GMTrace.o(3266322628608L, 24336);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(3266054193152L, 24334);
        MMAutoCompleteTextView.b(MMAutoCompleteTextView.this);
        GMTrace.o(3266054193152L, 24334);
      }
    });
    setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(3321888768000L, 24750);
        MMAutoCompleteTextView.b(MMAutoCompleteTextView.this);
        GMTrace.o(3321888768000L, 24750);
      }
    });
    GMTrace.o(3181631242240L, 23705);
  }
  
  private void bKR()
  {
    GMTrace.i(3181765459968L, 23706);
    if ((getText().toString().equals("")) || (!isFocused()))
    {
      bKT();
      GMTrace.o(3181765459968L, 23706);
      return;
    }
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.ttM, getCompoundDrawables()[3]);
    GMTrace.o(3181765459968L, 23706);
  }
  
  private void bKT()
  {
    GMTrace.i(3181899677696L, 23707);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
    GMTrace.o(3181899677696L, 23707);
  }
  
  private final class a
    implements TextWatcher
  {
    private String waU;
    
    public a(String paramString)
    {
      GMTrace.i(3319472848896L, 24732);
      this.waU = paramString;
      GMTrace.o(3319472848896L, 24732);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(3319875502080L, 24735);
      if (paramEditable.toString().endsWith(this.waU)) {
        MMAutoCompleteTextView.this.showDropDown();
      }
      GMTrace.o(3319875502080L, 24735);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(3319607066624L, 24733);
      GMTrace.o(3319607066624L, 24733);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(3319741284352L, 24734);
      GMTrace.o(3319741284352L, 24734);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMAutoCompleteTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */