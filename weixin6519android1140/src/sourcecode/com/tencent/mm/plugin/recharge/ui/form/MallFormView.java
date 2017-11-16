package com.tencent.mm.plugin.recharge.ui.form;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.k;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class MallFormView
  extends LinearLayout
  implements View.OnFocusChangeListener
{
  private TextView izE;
  private int ogA;
  private int ogB;
  private boolean ogC;
  private boolean ogD;
  private boolean ogE;
  private int ogF;
  private int ogG;
  private int ogH;
  public boolean ogI;
  private TextView ogd;
  public EditText oge;
  public WalletIconImageView ogf;
  public TextView ogg;
  public a ogh;
  private View.OnFocusChangeListener ogi;
  private View.OnClickListener ogj;
  private a ogk;
  b ogl;
  private int ogm;
  private String ogn;
  private int ogo;
  private String ogp;
  private int ogq;
  private int ogr;
  private int ogs;
  private String ogt;
  private int ogu;
  private String ogv;
  private int ogw;
  private int ogx;
  private String ogy;
  private int ogz;
  
  public MallFormView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(7870259134464L, 58638);
    GMTrace.o(7870259134464L, 58638);
  }
  
  public MallFormView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7870124916736L, 58637);
    this.izE = null;
    this.ogd = null;
    this.oge = null;
    this.ogf = null;
    this.ogg = null;
    this.ogh = null;
    this.ogi = null;
    this.ogj = null;
    this.ogk = null;
    this.ogl = null;
    this.ogm = -1;
    this.ogn = "";
    this.ogo = 0;
    this.ogp = "";
    this.ogq = 8;
    this.ogr = -1;
    this.ogs = 4;
    this.ogt = "";
    this.ogu = 8;
    this.ogv = "";
    this.ogw = 19;
    this.ogx = a.c.aOE;
    this.ogy = "";
    this.ogz = Integer.MAX_VALUE;
    this.ogA = 1;
    this.ogB = a.e.aXW;
    this.ogC = true;
    this.ogD = false;
    this.ogE = true;
    this.ogF = 1;
    this.ogG = 5;
    this.ogH = a.c.smf;
    this.ogI = true;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.tiO, paramInt, 0);
    this.ogm = paramAttributeSet.getResourceId(a.k.tjd, this.ogm);
    paramInt = paramAttributeSet.getResourceId(a.k.tji, 0);
    if (paramInt != 0) {
      this.ogn = paramContext.getString(paramInt);
    }
    this.ogr = paramAttributeSet.getResourceId(a.k.tjb, this.ogr);
    paramInt = paramAttributeSet.getResourceId(a.k.tjg, 0);
    if (paramInt != 0) {
      this.ogt = paramContext.getString(paramInt);
    }
    this.ogs = paramAttributeSet.getInteger(a.k.tjc, this.ogs);
    this.ogo = paramAttributeSet.getInteger(a.k.tjj, this.ogo);
    this.ogu = paramAttributeSet.getInteger(a.k.tjh, this.ogu);
    this.ogq = paramAttributeSet.getInteger(a.k.tjf, this.ogq);
    paramInt = paramAttributeSet.getResourceId(a.k.tje, 0);
    if (paramInt != 0) {
      this.ogp = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(a.k.tiV, 0);
    if (paramInt != 0) {
      this.ogv = paramContext.getString(paramInt);
    }
    this.ogw = paramAttributeSet.getInteger(a.k.tiU, this.ogw);
    this.ogx = paramAttributeSet.getColor(a.k.tja, this.ogx);
    paramInt = paramAttributeSet.getResourceId(a.k.tiZ, 0);
    if (paramInt != 0) {
      this.ogy = paramContext.getString(paramInt);
    }
    this.ogz = paramAttributeSet.getInteger(a.k.tiX, this.ogz);
    this.ogA = paramAttributeSet.getInteger(a.k.tiY, this.ogA);
    this.ogB = paramAttributeSet.getResourceId(a.k.tiR, this.ogB);
    this.ogC = paramAttributeSet.getBoolean(a.k.tiT, this.ogC);
    this.ogD = paramAttributeSet.getBoolean(a.k.tiS, this.ogD);
    this.ogE = paramAttributeSet.getBoolean(a.k.tiT, this.ogE);
    this.ogF = paramAttributeSet.getInteger(a.k.tiQ, this.ogF);
    this.ogG = paramAttributeSet.getInteger(a.k.tiP, this.ogG);
    this.ogH = paramAttributeSet.getInteger(a.k.tiW, this.ogH);
    paramAttributeSet.recycle();
    if (this.ogm > 0) {
      bool = true;
    }
    Assert.assertTrue(bool);
    setOrientation(1);
    inflate(paramContext, this.ogm, this);
    this.izE = ((TextView)findViewById(a.f.sCv));
    this.ogd = ((TextView)findViewById(a.f.sBr));
    this.oge = ((EditText)findViewById(a.f.sAM));
    this.ogf = ((WalletIconImageView)findViewById(a.f.sAV));
    this.ogg = ((TextView)findViewById(a.f.sCu));
    GMTrace.o(7870124916736L, 58637);
  }
  
  private boolean b(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(7871198658560L, 58645);
    if ((paramView != null) && (paramView.getVisibility() == 0))
    {
      Rect localRect2;
      if (paramView != null)
      {
        localRect2 = new Rect();
        paramView.getHitRect(localRect2);
        localRect1 = localRect2;
        if (paramView == this.ogf)
        {
          localRect2.left -= 50;
          localRect2.right += 50;
          localRect2.top -= 25;
          localRect2.bottom += 25;
        }
      }
      for (Rect localRect1 = localRect2; localRect1.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()); localRect1 = null)
      {
        GMTrace.o(7871198658560L, 58645);
        return true;
      }
      GMTrace.o(7871198658560L, 58645);
      return false;
    }
    GMTrace.o(7871198658560L, 58645);
    return false;
  }
  
  public final boolean QW()
  {
    GMTrace.i(7871735529472L, 58649);
    if (this.oge != null)
    {
      if (this.oge.getText() == null) {}
      for (int i = 0; (i > this.ogz) || (i < this.ogA); i = this.oge.getText().length())
      {
        GMTrace.o(7871735529472L, 58649);
        return false;
      }
      if (this.ogl != null)
      {
        boolean bool = this.ogl.a(this);
        GMTrace.o(7871735529472L, 58649);
        return bool;
      }
      GMTrace.o(7871735529472L, 58649);
      return true;
    }
    w.e("MicroMsg.WalletFormView", "hy: no content edit text. true as default");
    GMTrace.o(7871735529472L, 58649);
    return true;
  }
  
  public final void baA()
  {
    GMTrace.i(7870393352192L, 58639);
    if ((this.ogf != null) && (!bg.nm(getText())) && (this.oge != null) && (this.oge.isEnabled()) && (this.oge.isClickable()) && (this.oge.isFocusable()) && (this.oge.isFocused()))
    {
      this.ogf.g(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7874688319488L, 58671);
          MallFormView.this.baC();
          GMTrace.o(7874688319488L, 58671);
        }
      });
      GMTrace.o(7870393352192L, 58639);
      return;
    }
    if (this.ogf != null)
    {
      this.ogf.bNz();
      GMTrace.o(7870393352192L, 58639);
      return;
    }
    w.v("MicroMsg.WalletFormView", "hy: no info iv");
    GMTrace.o(7870393352192L, 58639);
  }
  
  public final void baB()
  {
    GMTrace.i(16551327563776L, 123317);
    w.d("MicroMsg.WalletFormView", "shouldClearFocus: %s", new Object[] { Boolean.valueOf(this.ogI) });
    if (this.ogI)
    {
      this.oge.clearFocus();
      GMTrace.o(16551327563776L, 123317);
      return;
    }
    this.ogI = true;
    GMTrace.o(16551327563776L, 123317);
  }
  
  public final void baC()
  {
    GMTrace.i(7871869747200L, 58650);
    if (this.oge != null) {
      this.oge.setText("");
    }
    GMTrace.o(7871869747200L, 58650);
  }
  
  public final String getText()
  {
    GMTrace.i(7871332876288L, 58646);
    if (this.oge != null)
    {
      String str = this.oge.getText().toString();
      if ((this.ogl != null) && (this.ogl.baz()))
      {
        str = this.ogl.Fu(str);
        GMTrace.o(7871332876288L, 58646);
        return str;
      }
      GMTrace.o(7871332876288L, 58646);
      return str;
    }
    w.e("MicroMsg.WalletFormView", "hy: no content et. return nil");
    GMTrace.o(7871332876288L, 58646);
    return "";
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(7870527569920L, 58640);
    super.onAttachedToWindow();
    GMTrace.o(7870527569920L, 58640);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(7870661787648L, 58641);
    super.onDetachedFromWindow();
    GMTrace.o(7870661787648L, 58641);
  }
  
  protected final void onFinishInflate()
  {
    GMTrace.i(7870796005376L, 58642);
    super.onFinishInflate();
    if (this.izE != null)
    {
      this.izE.setText(this.ogn);
      this.izE.setVisibility(this.ogo);
    }
    if (this.ogd != null)
    {
      this.ogd.setText(this.ogp);
      this.ogd.setVisibility(this.ogq);
    }
    if (this.ogf != null)
    {
      this.ogf.setImageResource(this.ogr);
      this.ogf.setVisibility(this.ogs);
    }
    if (this.ogg != null)
    {
      this.ogg.setText(this.ogt);
      this.ogg.setVisibility(this.ogu);
    }
    getContext();
    int i;
    if (this.oge != null)
    {
      this.oge.setHint(this.ogv);
      this.oge.setGravity(this.ogw);
      this.oge.setTextColor(this.ogx);
      Object localObject = this.ogy;
      if (this.oge != null)
      {
        this.oge.setText((CharSequence)localObject);
        localObject = this.oge;
        if (this.oge != null)
        {
          i = this.oge.getText().length();
          ((EditText)localObject).setSelection(i);
        }
      }
      else
      {
        this.oge.setBackgroundResource(this.ogB);
        this.oge.setEnabled(this.ogC);
        this.oge.setFocusable(this.ogE);
        this.oge.setClickable(this.ogD);
        this.oge.setHintTextColor(this.ogH);
        i = this.ogG;
        if (this.oge != null) {
          this.oge.setImeOptions(i);
        }
        i = this.ogF;
        if (this.oge != null) {
          this.oge.setInputType(i);
        }
        this.oge.addTextChangedListener(new TextWatcher()
        {
          private boolean ogJ;
          
          public final void afterTextChanged(Editable paramAnonymousEditable)
          {
            GMTrace.i(7874419884032L, 58669);
            GMTrace.o(7874419884032L, 58669);
          }
          
          public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(7874285666304L, 58668);
            GMTrace.o(7874285666304L, 58668);
          }
          
          public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(7874151448576L, 58667);
            if (MallFormView.this.QW() != this.ogJ)
            {
              if (MallFormView.c(MallFormView.this) != null) {
                MallFormView.c(MallFormView.this).gR(MallFormView.this.QW());
              }
              this.ogJ = MallFormView.this.QW();
            }
            MallFormView.this.baA();
            GMTrace.o(7874151448576L, 58667);
          }
        });
        this.oge.setOnFocusChangeListener(this);
      }
    }
    else
    {
      baA();
      if (this.oge != null)
      {
        if (this.ogF != 2) {
          break label424;
        }
        this.oge.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(7862206070784L, 58578);
            GMTrace.o(7862206070784L, 58578);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(7862071853056L, 58577);
            GMTrace.o(7862071853056L, 58577);
            return 3;
          }
        });
      }
    }
    for (;;)
    {
      if (this.ogz != -1) {
        this.oge.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.ogz) });
      }
      GMTrace.o(7870796005376L, 58642);
      return;
      i = 0;
      break;
      label424:
      if (this.ogF == 4)
      {
        this.oge.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(7872540835840L, 58655);
            GMTrace.o(7872540835840L, 58655);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 120, 88 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(7872406618112L, 58654);
            GMTrace.o(7872406618112L, 58654);
            return 1;
          }
        });
      }
      else if (this.ogF == 128)
      {
        this.oge.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.oge.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(7868111650816L, 58622);
            GMTrace.o(7868111650816L, 58622);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(7867977433088L, 58621);
            GMTrace.o(7867977433088L, 58621);
            return 18;
          }
        });
        this.oge.setRawInputType(18);
      }
      else if (this.ogF == 3)
      {
        this.oge.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(7869990699008L, 58636);
            GMTrace.o(7869990699008L, 58636);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 45 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(7869856481280L, 58635);
            GMTrace.o(7869856481280L, 58635);
            return 3;
          }
        });
      }
      else
      {
        this.oge.setInputType(this.ogF);
      }
    }
  }
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(7872003964928L, 58651);
    if (this.ogi != null) {
      this.ogi.onFocusChange(this, paramBoolean);
    }
    if (!QW()) {
      if (this.izE != null) {
        this.izE.setEnabled(false);
      }
    }
    for (;;)
    {
      baA();
      GMTrace.o(7872003964928L, 58651);
      return;
      if (this.izE != null) {
        this.izE.setEnabled(true);
      }
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(7871064440832L, 58644);
    if ((this.ogk == null) || (!this.ogk.bay()))
    {
      if ((this.oge != null) && (b(this.oge, paramMotionEvent)) && (!this.oge.isClickable()))
      {
        w.d("MicroMsg.WalletFormView", "hy: click on content but content is not clickable. whole view perform click");
        GMTrace.o(7871064440832L, 58644);
        return true;
      }
      if ((b(this.ogf, paramMotionEvent)) && (paramMotionEvent.getAction() == 1))
      {
        w.d("MicroMsg.WalletFormView", "hy: click on info iv");
        this.ogf.performClick();
        GMTrace.o(7871064440832L, 58644);
        return true;
      }
      GMTrace.o(7871064440832L, 58644);
      return false;
    }
    GMTrace.o(7871064440832L, 58644);
    return true;
  }
  
  @SuppressLint({"WrongCall"})
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(7870930223104L, 58643);
    if ((this.ogk == null) || (!this.ogk.bax())) {
      super.onMeasure(paramInt1, paramInt2);
    }
    GMTrace.o(7870930223104L, 58643);
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(7871467094016L, 58647);
    super.setOnClickListener(paramOnClickListener);
    GMTrace.o(7871467094016L, 58647);
  }
  
  public final void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(7871601311744L, 58648);
    this.ogi = paramOnFocusChangeListener;
    GMTrace.o(7871601311744L, 58648);
  }
  
  public static abstract interface a
  {
    public abstract void gR(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\ui\form\MallFormView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */