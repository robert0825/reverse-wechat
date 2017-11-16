package com.tencent.mm.plugin.label.ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.widget.MMEditText;

public class InputClearablePreference
  extends Preference
{
  public String hZP;
  public String iJz;
  public a mwA;
  public String mwr;
  public String mws;
  public int mwt;
  private int mwu;
  public boolean mwv;
  public MMEditText mww;
  private ImageView mwx;
  public TextView mwy;
  private int mwz;
  
  public InputClearablePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(7281311744000L, 54250);
    GMTrace.o(7281311744000L, 54250);
  }
  
  public InputClearablePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7281445961728L, 54251);
    GMTrace.o(7281445961728L, 54251);
  }
  
  public final void Be(String paramString)
  {
    boolean bool = true;
    GMTrace.i(7281848614912L, 54254);
    int i;
    if (!bg.nm(paramString))
    {
      int j = com.tencent.mm.ui.tools.h.WW(paramString);
      if (j <= this.mwt) {
        break label144;
      }
      i = 1;
      int k = com.tencent.mm.ui.tools.h.aO(this.mwt, "");
      int m = com.tencent.mm.ui.tools.h.aP(this.mwt, paramString);
      if (this.mwy != null)
      {
        if (i == 0) {
          break label149;
        }
        this.mwy.setText(String.format(this.hZP, new Object[] { Integer.valueOf(k), Integer.valueOf(m) }));
        this.mwy.setVisibility(0);
      }
      label107:
      if (this.mwA != null)
      {
        paramString = this.mwA;
        if (j > this.mwt) {
          break label161;
        }
      }
    }
    for (;;)
    {
      paramString.fz(bool);
      GMTrace.o(7281848614912L, 54254);
      return;
      label144:
      i = 0;
      break;
      label149:
      this.mwy.setVisibility(8);
      break label107;
      label161:
      bool = false;
    }
  }
  
  public final void fB(boolean paramBoolean)
  {
    GMTrace.i(7281982832640L, 54255);
    if (this.mwy != null)
    {
      if (paramBoolean)
      {
        this.mwy.setText(this.mws);
        this.mwy.setVisibility(0);
        GMTrace.o(7281982832640L, 54255);
        return;
      }
      this.mwy.setVisibility(8);
    }
    GMTrace.o(7281982832640L, 54255);
  }
  
  public final void fC(boolean paramBoolean)
  {
    GMTrace.i(16036065705984L, 119478);
    if (this.mwx != null)
    {
      if (paramBoolean)
      {
        this.mwx.setVisibility(0);
        GMTrace.o(16036065705984L, 119478);
        return;
      }
      this.mwx.setVisibility(8);
    }
    GMTrace.o(16036065705984L, 119478);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(7281714397184L, 54253);
    super.onBindView(paramView);
    this.mwz = a.V(this.mContext, R.f.aQo);
    this.mww = ((MMEditText)paramView.findViewById(R.h.bvB));
    this.mwx = ((ImageView)paramView.findViewById(R.h.btb));
    this.mwy = ((TextView)paramView.findViewById(R.h.bxa));
    if (this.mww != null)
    {
      if (this.mwu <= 0) {
        break label281;
      }
      this.mww.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.mwu), new b() });
    }
    for (;;)
    {
      this.mww.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          boolean bool = false;
          GMTrace.i(7284398751744L, 54273);
          if (paramAnonymousEditable != null)
          {
            paramAnonymousEditable = paramAnonymousEditable.toString();
            InputClearablePreference.this.Be(paramAnonymousEditable);
            InputClearablePreference localInputClearablePreference = InputClearablePreference.this;
            if (bg.nm(paramAnonymousEditable)) {}
            for (;;)
            {
              localInputClearablePreference.fC(bool);
              InputClearablePreference.this.iJz = paramAnonymousEditable;
              GMTrace.o(7284398751744L, 54273);
              return;
              bool = true;
            }
          }
          InputClearablePreference.this.fC(false);
          GMTrace.o(7284398751744L, 54273);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(7284264534016L, 54272);
          GMTrace.o(7284264534016L, 54272);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(7284130316288L, 54271);
          if (paramAnonymousCharSequence != null)
          {
            w.d("MicroMsg.Label.InputClearablePreference", "cpan[onTextChanged] :%s", new Object[] { paramAnonymousCharSequence.toString() });
            if (InputClearablePreference.this.mwA != null) {
              InputClearablePreference.this.mwA.Bc(paramAnonymousCharSequence.toString());
            }
          }
          GMTrace.o(7284130316288L, 54271);
        }
      });
      w.d("MicroMsg.Label.InputClearablePreference", "mText %s", new Object[] { this.iJz });
      setText(this.iJz);
      if (!bg.nm(this.iJz)) {
        this.mww.setSelection(this.iJz.length());
      }
      if (this.mwv) {
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7283593445376L, 54267);
            if (InputClearablePreference.this.mww != null)
            {
              InputMethodManager localInputMethodManager = (InputMethodManager)InputClearablePreference.this.mww.getContext().getSystemService("input_method");
              InputClearablePreference.this.mww.requestFocus();
              localInputMethodManager.showSoftInput(InputClearablePreference.this.mww, 0);
              InputClearablePreference.this.mww.setCursorVisible(false);
              InputClearablePreference.this.mww.setCursorVisible(true);
            }
            GMTrace.o(7283593445376L, 54267);
          }
        }, 0L);
      }
      this.mww.setHint(this.mwr);
      this.mwx.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7283861880832L, 54269);
          if (InputClearablePreference.this.mww != null)
          {
            InputClearablePreference.this.mww.setText("");
            InputClearablePreference.this.iJz = "";
          }
          GMTrace.o(7283861880832L, 54269);
        }
      });
      if (this.mwy != null) {
        this.mwy.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(7280909090816L, 54247);
            if (InputClearablePreference.this.mww != null) {
              InputClearablePreference.this.mww.clearFocus();
            }
            GMTrace.o(7280909090816L, 54247);
            return false;
          }
        });
      }
      GMTrace.o(7281714397184L, 54253);
      return;
      label281:
      this.mww.setFilters(new InputFilter[] { new b() });
    }
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(7281580179456L, 54252);
    this.iJz = paramString;
    if ((this.mww != null) && (!bg.nm(paramString)))
    {
      paramString = com.tencent.mm.pluginsdk.ui.d.h.c(this.mContext, this.iJz, this.mwz);
      this.mww.setText(paramString);
      Be(this.iJz);
    }
    GMTrace.o(7281580179456L, 54252);
  }
  
  public static abstract interface a
  {
    public abstract void Bc(String paramString);
    
    public abstract void fz(boolean paramBoolean);
  }
  
  final class b
    implements InputFilter
  {
    public final char[] mwC;
    
    b()
    {
      GMTrace.i(7281043308544L, 54248);
      this.mwC = new char[] { 10, 44, 59, 12289, -244, -229 };
      GMTrace.o(7281043308544L, 54248);
    }
    
    public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
    {
      GMTrace.i(7281177526272L, 54249);
      w.d("MicroMsg.Label.InputClearablePreference", "on create tag filter, %s [%d, %d) %s [%d, %d),", new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramSpanned, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      paramInt4 = paramInt1;
      while (paramInt4 < paramInt2)
      {
        paramSpanned = new char[paramInt2 - paramInt1];
        TextUtils.getChars(paramCharSequence, paramInt1, paramInt2, paramSpanned, 0);
        int j = this.mwC.length;
        int i = 0;
        while (i < j)
        {
          if ((paramSpanned[paramInt4] == ' ') && (paramInt3 == 0) && (paramInt4 == 0))
          {
            GMTrace.o(7281177526272L, 54249);
            return "";
          }
          if (paramSpanned[paramInt4] == this.mwC[i])
          {
            InputClearablePreference.this.fB(true);
            GMTrace.o(7281177526272L, 54249);
            return "";
          }
          i += 1;
        }
        paramInt4 += 1;
      }
      GMTrace.o(7281177526272L, 54249);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\ui\widget\InputClearablePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */