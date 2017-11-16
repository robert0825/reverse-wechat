package com.tencent.mm.wallet_core.ui.formview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.k;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.a.a;
import com.tenpay.android.wechat.TenpaySecureEditText;
import junit.framework.Assert;

public final class WalletFormView
  extends LinearLayout
  implements View.OnFocusChangeListener
{
  public TextView izE;
  private int ogA;
  private int ogB;
  private boolean ogC;
  private boolean ogD;
  private boolean ogE;
  private int ogF;
  private int ogG;
  private int ogH;
  public TextView ogd;
  public WalletIconImageView ogf;
  public TextView ogg;
  private View.OnFocusChangeListener ogi;
  private View.OnClickListener ogj;
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
  public int ogz;
  private int xFA;
  public TenpaySecureEditText xFt;
  public a xFu;
  public a xFv;
  public com.tencent.mm.wallet_core.ui.formview.a.b xFw;
  private int xFx;
  public int xFy;
  private int xFz;
  
  public WalletFormView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(1491293175808L, 11111);
    GMTrace.o(1491293175808L, 11111);
  }
  
  public WalletFormView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1491158958080L, 11110);
    this.izE = null;
    this.ogd = null;
    this.xFt = null;
    this.ogf = null;
    this.ogg = null;
    this.xFu = null;
    this.ogi = null;
    this.ogj = null;
    this.xFv = null;
    this.xFw = null;
    this.ogm = -1;
    this.xFx = this.ogm;
    this.xFy = 100;
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
    this.xFz = 0;
    this.ogz = Integer.MAX_VALUE;
    this.ogA = 1;
    this.ogB = a.e.aXW;
    this.ogC = true;
    this.ogD = false;
    this.ogE = true;
    this.ogF = 1;
    this.ogG = 5;
    this.ogH = a.c.smf;
    this.xFA = 0;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.tjt, paramInt, 0);
    this.ogm = paramAttributeSet.getResourceId(a.k.tjK, this.ogm);
    paramInt = paramAttributeSet.getResourceId(a.k.tjQ, 0);
    if (paramInt != 0) {
      this.ogn = paramContext.getString(paramInt);
    }
    this.ogr = paramAttributeSet.getResourceId(a.k.tjI, this.ogr);
    paramInt = paramAttributeSet.getResourceId(a.k.tjO, 0);
    if (paramInt != 0) {
      this.ogt = paramContext.getString(paramInt);
    }
    this.ogs = paramAttributeSet.getInteger(a.k.tjJ, this.ogs);
    this.ogo = paramAttributeSet.getInteger(a.k.tjR, this.ogo);
    this.ogu = paramAttributeSet.getInteger(a.k.tjP, this.ogu);
    this.ogq = paramAttributeSet.getInteger(a.k.tjN, this.ogq);
    paramInt = paramAttributeSet.getResourceId(a.k.tjM, 0);
    if (paramInt != 0) {
      this.ogp = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(a.k.tjB, 0);
    if (paramInt != 0) {
      this.ogv = paramContext.getString(paramInt);
    }
    this.ogw = paramAttributeSet.getInteger(a.k.tjA, this.ogw);
    this.ogx = paramAttributeSet.getColor(a.k.tjG, this.ogx);
    paramInt = paramAttributeSet.getResourceId(a.k.tjF, 0);
    if (paramInt != 0) {
      this.ogy = paramContext.getString(paramInt);
    }
    this.xFz = paramAttributeSet.getInt(a.k.tjz, this.xFz);
    this.ogz = paramAttributeSet.getInteger(a.k.tjD, this.ogz);
    this.ogA = paramAttributeSet.getInteger(a.k.tjE, this.ogA);
    this.ogB = paramAttributeSet.getResourceId(a.k.tjw, this.ogB);
    this.ogC = paramAttributeSet.getBoolean(a.k.tjy, this.ogC);
    this.ogD = paramAttributeSet.getBoolean(a.k.tjx, this.ogD);
    this.ogE = paramAttributeSet.getBoolean(a.k.tjy, this.ogE);
    this.ogF = paramAttributeSet.getInteger(a.k.tjv, this.ogF);
    this.ogG = paramAttributeSet.getInteger(a.k.tju, this.ogG);
    this.xFy = paramAttributeSet.getInteger(a.k.tjH, this.xFy);
    this.ogH = paramAttributeSet.getInteger(a.k.tjC, this.ogH);
    this.xFx = paramAttributeSet.getResourceId(a.k.tjL, this.xFx);
    this.xFA = paramAttributeSet.getInteger(a.k.tjS, 0);
    paramAttributeSet.recycle();
    if (this.ogm > 0) {
      bool = true;
    }
    Assert.assertTrue(bool);
    setOrientation(1);
    if ((!bg.nm(this.ogn)) && (this.ogn.length() > 6)) {
      inflate(paramContext, this.xFx, this);
    }
    for (;;)
    {
      this.izE = ((TextView)findViewById(a.f.sKS));
      this.ogd = ((TextView)findViewById(a.f.sKD));
      this.xFt = ((TenpaySecureEditText)findViewById(a.f.sJj));
      this.ogf = ((WalletIconImageView)findViewById(a.f.sJF));
      this.ogg = ((TextView)findViewById(a.f.sKR));
      GMTrace.o(1491158958080L, 11110);
      return;
      inflate(paramContext, this.ogm, this);
    }
  }
  
  private void baA()
  {
    GMTrace.i(1492098482176L, 11117);
    if ((this.ogf != null) && (!bg.nm(getText())) && (this.xFt != null) && (this.xFt.isEnabled()) && (this.xFt.isClickable()) && (this.xFt.isFocusable()) && (this.xFt.isFocused()))
    {
      this.ogf.g(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1483240112128L, 11051);
          WalletFormView.this.baC();
          GMTrace.o(1483240112128L, 11051);
        }
      });
      GMTrace.o(1492098482176L, 11117);
      return;
    }
    if (this.ogf != null)
    {
      this.ogf.bNz();
      GMTrace.o(1492098482176L, 11117);
      return;
    }
    w.v("MicroMsg.WalletFormView", "hy: no info iv");
    GMTrace.o(1492098482176L, 11117);
  }
  
  private void cmz()
  {
    GMTrace.i(1493440659456L, 11127);
    if (this.izE != null)
    {
      this.izE.setText(this.ogn);
      this.izE.setVisibility(this.ogo);
    }
    GMTrace.o(1493440659456L, 11127);
  }
  
  private int getInputLength()
  {
    GMTrace.i(1495185489920L, 11140);
    if (this.xFt != null)
    {
      int i = this.xFt.getInputLength();
      GMTrace.o(1495185489920L, 11140);
      return i;
    }
    GMTrace.o(1495185489920L, 11140);
    return 0;
  }
  
  @SuppressLint({"ResourceType"})
  public final void ES(int paramInt)
  {
    GMTrace.i(19127368417280L, 142510);
    this.ogx = paramInt;
    if (this.xFt != null) {
      this.xFt.setTextColor(getResources().getColor(this.ogx));
    }
    GMTrace.o(19127368417280L, 142510);
  }
  
  public final void ET(int paramInt)
  {
    GMTrace.i(20854482141184L, 155378);
    if (this.xFt != null) {
      this.xFt.setTextColor(paramInt);
    }
    GMTrace.o(20854482141184L, 155378);
  }
  
  public final boolean QW()
  {
    GMTrace.i(1494648619008L, 11136);
    if (this.xFt != null)
    {
      int i = this.xFt.getInputLength();
      if ((i > this.ogz) || (i < this.ogA))
      {
        GMTrace.o(1494648619008L, 11136);
        return false;
      }
      if (this.xFw != null)
      {
        boolean bool = this.xFw.h(this);
        GMTrace.o(1494648619008L, 11136);
        return bool;
      }
      GMTrace.o(1494648619008L, 11136);
      return true;
    }
    w.e("MicroMsg.WalletFormView", "hy: no content edit text. true as default");
    GMTrace.o(1494648619008L, 11136);
    return true;
  }
  
  public final void XF(String paramString)
  {
    GMTrace.i(1491561611264L, 11113);
    if ((this.xFt != null) && ((this.xFw == null) || (!this.xFw.d(this, paramString))))
    {
      this.xFt.set3DesEncrptData(paramString);
      setSelection(getInputLength());
    }
    GMTrace.o(1491561611264L, 11113);
  }
  
  public final void a(TextWatcher paramTextWatcher)
  {
    GMTrace.i(1494380183552L, 11134);
    if (this.xFt != null) {
      this.xFt.addTextChangedListener(paramTextWatcher);
    }
    GMTrace.o(1494380183552L, 11134);
  }
  
  final boolean b(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(1493306441728L, 11126);
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
        GMTrace.o(1493306441728L, 11126);
        return true;
      }
      GMTrace.o(1493306441728L, 11126);
      return false;
    }
    GMTrace.o(1493306441728L, 11126);
    return false;
  }
  
  public final void baB()
  {
    GMTrace.i(20854750576640L, 155380);
    if (this.xFt != null) {
      this.xFt.clearFocus();
    }
    GMTrace.o(20854750576640L, 155380);
  }
  
  public final void baC()
  {
    GMTrace.i(1494782836736L, 11137);
    if (this.xFt != null) {
      this.xFt.ClearInput();
    }
    GMTrace.o(1494782836736L, 11137);
  }
  
  public final void cmA()
  {
    GMTrace.i(1495319707648L, 11141);
    if (this.xFt != null)
    {
      this.xFt.setFocusable(true);
      this.xFt.requestFocus();
      ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this.xFt, 0);
    }
    GMTrace.o(1495319707648L, 11141);
  }
  
  public final String cmx()
  {
    GMTrace.i(20854347923456L, 155377);
    String str2 = bg.nl(this.xFt.getText().toString());
    String str1 = str2;
    if (this.xFw != null)
    {
      str1 = str2;
      if (this.xFw.baz()) {
        str1 = this.xFw.e(this, str2);
      }
    }
    str1 = aa.RP(str1);
    GMTrace.o(20854347923456L, 155377);
    return str1;
  }
  
  public final boolean cmy()
  {
    GMTrace.i(1492232699904L, 11118);
    if (this.xFt != null)
    {
      boolean bool = this.xFt.isFocusable();
      GMTrace.o(1492232699904L, 11118);
      return bool;
    }
    GMTrace.o(1492232699904L, 11118);
    return false;
  }
  
  public final boolean dJ(View paramView)
  {
    GMTrace.i(1494917054464L, 11138);
    if (getVisibility() == 0)
    {
      if (bg.nm(getText()))
      {
        if (paramView != null) {
          paramView.setVisibility(4);
        }
        if (this.izE != null) {
          this.izE.setEnabled(true);
        }
        GMTrace.o(1494917054464L, 11138);
        return false;
      }
      if (QW())
      {
        if (paramView != null) {
          paramView.setVisibility(4);
        }
        if (this.izE != null) {
          this.izE.setEnabled(true);
        }
        GMTrace.o(1494917054464L, 11138);
        return true;
      }
      if (paramView != null) {
        paramView.setVisibility(0);
      }
      if (this.izE != null) {
        this.izE.setEnabled(false);
      }
      GMTrace.o(1494917054464L, 11138);
      return false;
    }
    if (paramView != null) {
      paramView.setVisibility(8);
    }
    GMTrace.o(1494917054464L, 11138);
    return true;
  }
  
  public final KeyListener getKeyListener()
  {
    GMTrace.i(1493843312640L, 11130);
    if (this.xFt != null)
    {
      KeyListener localKeyListener = this.xFt.getKeyListener();
      GMTrace.o(1493843312640L, 11130);
      return localKeyListener;
    }
    w.w("MicroMsg.WalletFormView", "hy: no content et");
    GMTrace.o(1493843312640L, 11130);
    return null;
  }
  
  public final String getText()
  {
    GMTrace.i(1493709094912L, 11129);
    if (this.xFt != null)
    {
      String str = c.a.a(this.xFy, this.xFt);
      if ((this.xFw != null) && (this.xFw.baz()))
      {
        str = this.xFw.e(this, str);
        GMTrace.o(1493709094912L, 11129);
        return str;
      }
      GMTrace.o(1493709094912L, 11129);
      return str;
    }
    w.e("MicroMsg.WalletFormView", "hy: no content et. return nil");
    GMTrace.o(1493709094912L, 11129);
    return "";
  }
  
  public final void j(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(1494111748096L, 11132);
    this.ogj = paramOnClickListener;
    if (this.ogf != null) {
      this.ogf.setOnClickListener(this.ogj);
    }
    GMTrace.o(1494111748096L, 11132);
  }
  
  public final void mS(boolean paramBoolean)
  {
    GMTrace.i(20854616358912L, 155379);
    if (this.xFt != null) {
      this.xFt.setEnabled(paramBoolean);
    }
    GMTrace.o(20854616358912L, 155379);
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(1492366917632L, 11119);
    super.onAttachedToWindow();
    GMTrace.o(1492366917632L, 11119);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(1492501135360L, 11120);
    super.onDetachedFromWindow();
    GMTrace.o(1492501135360L, 11120);
  }
  
  protected final void onFinishInflate()
  {
    GMTrace.i(1492635353088L, 11121);
    super.onFinishInflate();
    cmz();
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
    Context localContext = getContext();
    if (this.xFt != null)
    {
      if (this.xFA == 1) {
        this.xFt.setTypeface(e.cQ(localContext));
      }
      this.xFt.setHint(this.ogv);
      this.xFt.setGravity(this.ogw);
      this.xFt.setTextColor(this.ogx);
      setText(this.ogy);
      b.a(this.xFt, this.xFz);
      this.xFt.setBackgroundResource(this.ogB);
      this.xFt.setEnabled(this.ogC);
      this.xFt.setFocusable(this.ogE);
      this.xFt.setClickable(this.ogD);
      this.xFt.setHintTextColor(this.ogH);
      setImeOptions(this.ogG);
      setInputType(this.ogF);
      this.xFt.addTextChangedListener(new TextWatcher()
      {
        private boolean ogJ;
        
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(1502299029504L, 11193);
          boolean bool = WalletFormView.this.QW();
          if ((WalletFormView.i(WalletFormView.this) != null) && (bool != this.ogJ))
          {
            WalletFormView.i(WalletFormView.this).gR(bool);
            this.ogJ = WalletFormView.this.QW();
          }
          WalletFormView.j(WalletFormView.this);
          GMTrace.o(1502299029504L, 11193);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1502164811776L, 11192);
          GMTrace.o(1502164811776L, 11192);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1502030594048L, 11191);
          GMTrace.o(1502030594048L, 11191);
        }
      });
      this.xFt.setOnFocusChangeListener(this);
    }
    baA();
    if (this.xFt != null)
    {
      if (this.ogF != 2) {
        break label374;
      }
      this.xFt.setKeyListener(new NumberKeyListener()
      {
        protected final char[] getAcceptedChars()
        {
          GMTrace.i(1498004062208L, 11161);
          GMTrace.o(1498004062208L, 11161);
          return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
        }
        
        public final int getInputType()
        {
          GMTrace.i(1497869844480L, 11160);
          GMTrace.o(1497869844480L, 11160);
          return 3;
        }
      });
    }
    for (;;)
    {
      if (this.ogz != -1) {
        this.xFt.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.ogz) });
      }
      if (this.xFv != null) {
        this.xFv.bwK();
      }
      GMTrace.o(1492635353088L, 11121);
      return;
      label374:
      if (this.ogF == 4)
      {
        this.xFt.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(1481495281664L, 11038);
            GMTrace.o(1481495281664L, 11038);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 120, 88 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(1481361063936L, 11037);
            GMTrace.o(1481361063936L, 11037);
            return 1;
          }
        });
      }
      else if (this.ogF == 128)
      {
        this.xFt.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.xFt.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(1496125014016L, 11147);
            GMTrace.o(1496125014016L, 11147);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(1495990796288L, 11146);
            GMTrace.o(1495990796288L, 11146);
            return 18;
          }
        });
        this.xFt.setRawInputType(18);
      }
      else if (this.ogF == 3)
      {
        this.xFt.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(1498406715392L, 11164);
            GMTrace.o(1498406715392L, 11164);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 45 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(1498272497664L, 11163);
            GMTrace.o(1498272497664L, 11163);
            return 3;
          }
        });
      }
      else
      {
        this.xFt.setInputType(this.ogF);
      }
    }
  }
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(1495453925376L, 11142);
    if (this.ogi != null) {
      this.ogi.onFocusChange(this, paramBoolean);
    }
    if (this.xFu != null) {
      this.xFu.gR(QW());
    }
    if (!QW()) {
      if (this.izE != null) {
        this.izE.setEnabled(false);
      }
    }
    for (;;)
    {
      baA();
      GMTrace.o(1495453925376L, 11142);
      return;
      if (this.izE != null) {
        this.izE.setEnabled(true);
      }
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1493172224000L, 11125);
    if ((this.xFv == null) || (!this.xFv.a(this, paramMotionEvent)))
    {
      if ((this.xFt != null) && (b(this.xFt, paramMotionEvent)) && (!this.xFt.isClickable()))
      {
        w.d("MicroMsg.WalletFormView", "hy: click on content but content is not clickable. whole view perform click");
        GMTrace.o(1493172224000L, 11125);
        return true;
      }
      if ((b(this.ogf, paramMotionEvent)) && (paramMotionEvent.getAction() == 1))
      {
        w.d("MicroMsg.WalletFormView", "hy: click on info iv");
        baA();
        this.ogf.performClick();
        GMTrace.o(1493172224000L, 11125);
        return true;
      }
      GMTrace.o(1493172224000L, 11125);
      return false;
    }
    GMTrace.o(1493172224000L, 11125);
    return true;
  }
  
  @SuppressLint({"WrongCall"})
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1493038006272L, 11124);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(1493038006272L, 11124);
  }
  
  public final void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    GMTrace.i(1495051272192L, 11139);
    if (this.xFt != null) {
      this.xFt.setFilters(paramArrayOfInputFilter);
    }
    GMTrace.o(1495051272192L, 11139);
  }
  
  public final void setHint(CharSequence paramCharSequence)
  {
    GMTrace.i(1492769570816L, 11122);
    if (this.xFt != null) {
      this.xFt.setHint(paramCharSequence);
    }
    GMTrace.o(1492769570816L, 11122);
  }
  
  public final void setImeOptions(int paramInt)
  {
    GMTrace.i(1491695828992L, 11114);
    if (this.xFt != null) {
      this.xFt.setImeOptions(paramInt);
    }
    GMTrace.o(1491695828992L, 11114);
  }
  
  public final void setInputType(int paramInt)
  {
    GMTrace.i(1491830046720L, 11115);
    if (this.xFt != null) {
      this.xFt.setInputType(paramInt);
    }
    GMTrace.o(1491830046720L, 11115);
  }
  
  public final void setKeyListener(KeyListener paramKeyListener)
  {
    GMTrace.i(1494514401280L, 11135);
    if (this.xFt != null) {
      this.xFt.setKeyListener(paramKeyListener);
    }
    GMTrace.o(1494514401280L, 11135);
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(1493977530368L, 11131);
    super.setOnClickListener(paramOnClickListener);
    GMTrace.o(1493977530368L, 11131);
  }
  
  public final void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    GMTrace.i(1492903788544L, 11123);
    this.xFt.setOnEditorActionListener(paramOnEditorActionListener);
    GMTrace.o(1492903788544L, 11123);
  }
  
  public final void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(1494245965824L, 11133);
    this.ogi = paramOnFocusChangeListener;
    GMTrace.o(1494245965824L, 11133);
  }
  
  public final void setSelection(int paramInt)
  {
    GMTrace.i(1493574877184L, 11128);
    if (this.xFt != null) {
      this.xFt.setSelection(paramInt);
    }
    GMTrace.o(1493574877184L, 11128);
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(1491964264448L, 11116);
    if ((this.xFt != null) && ((this.xFw == null) || (!this.xFw.c(this, paramString))))
    {
      this.xFt.setText(paramString);
      this.xFt.setSelection(getInputLength());
    }
    GMTrace.o(1491964264448L, 11116);
  }
  
  public final void vl(String paramString)
  {
    GMTrace.i(1491427393536L, 11112);
    this.ogn = paramString;
    cmz();
    GMTrace.o(1491427393536L, 11112);
  }
  
  public static abstract interface a
  {
    public abstract void gR(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\formview\WalletFormView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */