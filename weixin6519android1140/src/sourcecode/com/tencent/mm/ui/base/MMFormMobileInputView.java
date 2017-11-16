package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMEditText.c;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.m;

public class MMFormMobileInputView
  extends LinearLayout
{
  private Context mContext;
  private int wbN;
  private int[] wbO;
  public EditText wbR;
  public EditText wbS;
  private String wbT;
  private String wbU;
  private final int wbV;
  private a wbW;
  
  public MMFormMobileInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(3254914121728L, 24251);
    GMTrace.o(3254914121728L, 24251);
  }
  
  @TargetApi(11)
  public MMFormMobileInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3254779904000L, 24250);
    this.mContext = null;
    this.wbN = -1;
    this.wbT = "";
    this.wbU = "";
    this.wbV = 13;
    this.wbW = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.enq, paramInt, 0);
    this.wbN = paramAttributeSet.getResourceId(a.m.ggL, -1);
    paramAttributeSet.recycle();
    v.fb(paramContext).inflate(a.h.gfi, this);
    this.mContext = paramContext;
    GMTrace.o(3254779904000L, 24250);
  }
  
  private void dh(View paramView)
  {
    GMTrace.i(3255316774912L, 24254);
    this.wbO = new int[] { paramView.getPaddingLeft(), paramView.getPaddingTop(), paramView.getPaddingRight(), paramView.getPaddingBottom() };
    GMTrace.o(3255316774912L, 24254);
  }
  
  private void di(View paramView)
  {
    GMTrace.i(3255450992640L, 24255);
    if (this.wbO != null) {
      paramView.setPadding(this.wbO[0], this.wbO[1], this.wbO[2], this.wbO[3]);
    }
    GMTrace.o(3255450992640L, 24255);
  }
  
  public final String getCountryCode()
  {
    GMTrace.i(3255719428096L, 24257);
    if (this.wbR != null)
    {
      String str = this.wbR.getText().toString().trim();
      GMTrace.o(3255719428096L, 24257);
      return str;
    }
    GMTrace.o(3255719428096L, 24257);
    return "";
  }
  
  public final void lB(boolean paramBoolean)
  {
    GMTrace.i(3255182557184L, 24253);
    dh(this.wbR);
    if (paramBoolean)
    {
      this.wbR.setBackgroundResource(a.f.aXs);
      di(this.wbR);
      dh(this.wbS);
      if (!paramBoolean) {
        break label92;
      }
      this.wbS.setBackgroundResource(a.f.aXs);
    }
    for (;;)
    {
      di(this.wbS);
      GMTrace.o(3255182557184L, 24253);
      return;
      this.wbR.setBackgroundResource(a.f.aXt);
      break;
      label92:
      this.wbS.setBackgroundResource(a.f.aXt);
    }
  }
  
  public void onFinishInflate()
  {
    GMTrace.i(3255048339456L, 24252);
    this.wbR = ((EditText)findViewById(a.g.bsf));
    this.wbS = ((EditText)findViewById(a.g.gdF));
    if ((this.wbR == null) || (this.wbS == null))
    {
      w.w("MicroMsg.MMFormMobileInputView", "countryCodeET : %s, mobileNumberET : %s", new Object[] { this.wbR, this.wbS });
      if ((this.wbR != null) && (this.wbS != null))
      {
        if ((!this.wbR.hasFocus()) && (!this.wbS.hasFocus())) {
          break label223;
        }
        lB(true);
      }
    }
    for (;;)
    {
      View.OnFocusChangeListener local1 = new View.OnFocusChangeListener()
      {
        public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
        {
          GMTrace.i(3254645686272L, 24249);
          if ((paramAnonymousView == MMFormMobileInputView.a(MMFormMobileInputView.this)) || (paramAnonymousView == MMFormMobileInputView.b(MMFormMobileInputView.this))) {
            MMFormMobileInputView.this.lB(paramAnonymousBoolean);
          }
          GMTrace.o(3254645686272L, 24249);
        }
      };
      this.wbR.setOnFocusChangeListener(local1);
      this.wbS.setOnFocusChangeListener(local1);
      this.wbS.addTextChangedListener(new MMEditText.c(this.wbS, null, 20));
      this.wbS.addTextChangedListener(new TextWatcher()
      {
        private an mnt;
        
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(3151969124352L, 23484);
          int i = MMFormMobileInputView.b(MMFormMobileInputView.this).getSelectionEnd();
          paramAnonymousEditable = MMFormMobileInputView.b(MMFormMobileInputView.this).getText().toString();
          String str1 = MMFormMobileInputView.b(MMFormMobileInputView.this).getText().toString().substring(0, i);
          if ((paramAnonymousEditable != null) && (!paramAnonymousEditable.equals(MMFormMobileInputView.c(MMFormMobileInputView.this))))
          {
            String str2 = MMFormMobileInputView.a(MMFormMobileInputView.this).getText().toString();
            MMFormMobileInputView.a(MMFormMobileInputView.this, an.formatNumber(str2.replace("+", ""), paramAnonymousEditable));
            MMFormMobileInputView.b(MMFormMobileInputView.this, an.formatNumber(str2.replace("+", ""), str1));
            if (paramAnonymousEditable.equals(MMFormMobileInputView.c(MMFormMobileInputView.this)))
            {
              GMTrace.o(3151969124352L, 23484);
              return;
            }
            MMFormMobileInputView.b(MMFormMobileInputView.this).setText(MMFormMobileInputView.c(MMFormMobileInputView.this));
            int j = MMFormMobileInputView.b(MMFormMobileInputView.this).getText().toString().length();
            if (str1 != null) {
              try
              {
                MMFormMobileInputView.b(MMFormMobileInputView.this, an.formatNumber(str2.replace("+", ""), str1));
                if ((paramAnonymousEditable.length() > 13) && (i <= j)) {
                  break label338;
                }
                if ((i <= j) && (MMFormMobileInputView.d(MMFormMobileInputView.this).toString().length() <= j)) {
                  break label305;
                }
                MMFormMobileInputView.b(MMFormMobileInputView.this).setSelection(j - Math.abs(paramAnonymousEditable.length() - i));
                GMTrace.o(3151969124352L, 23484);
                return;
              }
              catch (Exception paramAnonymousEditable)
              {
                w.printErrStackTrace("MicroMsg.MMFormMobileInputView", paramAnonymousEditable, "", new Object[0]);
              }
            }
          }
          else
          {
            GMTrace.o(3151969124352L, 23484);
            return;
            label305:
            MMFormMobileInputView.b(MMFormMobileInputView.this).setSelection(MMFormMobileInputView.d(MMFormMobileInputView.this).toString().length());
            GMTrace.o(3151969124352L, 23484);
            return;
            label338:
            MMFormMobileInputView.b(MMFormMobileInputView.this).setSelection(str1.toString().length());
            GMTrace.o(3151969124352L, 23484);
            return;
          }
          MMFormMobileInputView.b(MMFormMobileInputView.this).setSelection(0);
          GMTrace.o(3151969124352L, 23484);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(3152103342080L, 23485);
          GMTrace.o(3152103342080L, 23485);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(3152237559808L, 23486);
          GMTrace.o(3152237559808L, 23486);
        }
      });
      this.wbR.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(3282965626880L, 24460);
          paramAnonymousEditable = MMFormMobileInputView.a(MMFormMobileInputView.this).getText().toString();
          if (bg.nm(paramAnonymousEditable))
          {
            MMFormMobileInputView.a(MMFormMobileInputView.this).setText("+");
            MMFormMobileInputView.a(MMFormMobileInputView.this).setSelection(MMFormMobileInputView.a(MMFormMobileInputView.this).getText().toString().length());
            GMTrace.o(3282965626880L, 24460);
            return;
          }
          if (!paramAnonymousEditable.contains("+"))
          {
            paramAnonymousEditable = "+" + paramAnonymousEditable;
            MMFormMobileInputView.a(MMFormMobileInputView.this).setText(paramAnonymousEditable);
            MMFormMobileInputView.a(MMFormMobileInputView.this).setSelection(MMFormMobileInputView.a(MMFormMobileInputView.this).getText().toString().length());
            GMTrace.o(3282965626880L, 24460);
            return;
          }
          if (paramAnonymousEditable.length() > 1)
          {
            paramAnonymousEditable = paramAnonymousEditable.substring(1);
            if (paramAnonymousEditable.length() > 4)
            {
              MMFormMobileInputView.a(MMFormMobileInputView.this).setText(paramAnonymousEditable.substring(0, 4));
              GMTrace.o(3282965626880L, 24460);
              return;
            }
          }
          GMTrace.o(3282965626880L, 24460);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(3283099844608L, 24461);
          GMTrace.o(3283099844608L, 24461);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(3283234062336L, 24462);
          GMTrace.o(3283234062336L, 24462);
        }
      });
      GMTrace.o(3255048339456L, 24252);
      return;
      if (this.wbN == -1) {
        break;
      }
      this.wbS.setHint(this.wbN);
      break;
      label223:
      lB(false);
    }
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\MMFormMobileInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */