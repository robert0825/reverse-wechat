package com.tencent.mm.ui.base;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;

public class MMAutoSwitchEditText
  extends EditText
{
  a waX;
  
  public MMAutoSwitchEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3169148993536L, 23612);
    this.waX = new a(this);
    addTextChangedListener(this.waX);
    setOnKeyListener(this.waX);
    GMTrace.o(3169148993536L, 23612);
  }
  
  public static final class a
    implements TextWatcher, View.OnKeyListener
  {
    private String iJz;
    private EditText jZ;
    int mIndex;
    MMAutoSwitchEditText.c waY;
    MMAutoSwitchEditText.b waZ;
    MMAutoSwitchEditText.d wba;
    int wbb;
    
    public a(EditText paramEditText)
    {
      GMTrace.i(3332089315328L, 24826);
      this.mIndex = 0;
      this.wbb = 4;
      this.jZ = paramEditText;
      GMTrace.o(3332089315328L, 24826);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      int j = 0;
      GMTrace.i(3332491968512L, 24829);
      this.iJz = paramEditable.toString();
      paramEditable = "";
      if (this.wba != null) {
        this.wba.bZE();
      }
      int i = 0;
      int k;
      for (;;)
      {
        k = i;
        if (j >= this.iJz.length()) {
          break;
        }
        i += 1;
        k = i;
        if (i > this.wbb) {
          break;
        }
        paramEditable = paramEditable + this.iJz.charAt(j);
        j += 1;
      }
      if (k > this.wbb)
      {
        this.jZ.setText(paramEditable);
        this.jZ.setSelection(paramEditable.length());
      }
      if ((k >= this.wbb) && (this.waY != null)) {
        this.waY.BT(this.mIndex);
      }
      GMTrace.o(3332491968512L, 24829);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(3332223533056L, 24827);
      GMTrace.o(3332223533056L, 24827);
    }
    
    public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
    {
      GMTrace.i(3332626186240L, 24830);
      if ((paramInt == 67) && (this.jZ.getText().toString().trim().length() == 0) && (this.waZ != null)) {
        this.waZ.BS(this.mIndex);
      }
      GMTrace.o(3332626186240L, 24830);
      return false;
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(3332357750784L, 24828);
      GMTrace.o(3332357750784L, 24828);
    }
  }
  
  public static abstract interface b
  {
    public abstract void BS(int paramInt);
  }
  
  public static abstract interface c
  {
    public abstract void BT(int paramInt);
  }
  
  public static abstract interface d
  {
    public abstract void bZE();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMAutoSwitchEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */