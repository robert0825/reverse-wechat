package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.v4.e.a;
import android.text.Editable;
import android.text.Editable.Factory;
import android.text.Layout.Alignment;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AlignmentSpan.Standard;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.autofill.e;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

@SuppressLint({"AppCompatCustomView"})
public abstract class w
  extends EditText
  implements com.tencent.mm.plugin.appbrand.widget.b.d, y
{
  private static final String iNt;
  private final ae iAX;
  private volatile String iLx;
  private final a iNA;
  private final PasswordTransformationMethod iNB;
  private boolean iNC;
  private int iND;
  boolean iNE;
  private final int[] iNF;
  InputConnection iNq;
  private Method iNr;
  boolean iNs;
  private final com.tencent.mm.plugin.appbrand.widget.input.autofill.b iNu;
  public com.tencent.mm.plugin.appbrand.widget.input.a.b iNv;
  private final Runnable iNw;
  private final Map<y.a, Object> iNx;
  private final Map<View.OnFocusChangeListener, Object> iNy;
  private final Map<y.b, Object> iNz;
  
  static
  {
    GMTrace.i(18272804143104L, 136143);
    iNt = "-1";
    GMTrace.o(18272804143104L, 136143);
  }
  
  public w(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10055189528576L, 74917);
    this.iNs = false;
    this.iLx = iNt;
    this.iNw = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19869726670848L, 148041);
        if (w.b(w.this) != null) {
          w.b(w.this).acA();
        }
        GMTrace.o(19869726670848L, 148041);
      }
    };
    this.iAX = new ae(Looper.getMainLooper());
    this.iNB = new k();
    this.iND = 0;
    this.iNE = false;
    this.iNF = new int[2];
    this.iNA = new a();
    this.iNx = new a();
    this.iNz = new a();
    this.iNy = new a();
    setBackgroundDrawable(null);
    setIncludeFontPadding(false);
    ke(3);
    setSingleLine(true);
    int i = o.e.hAt;
    try
    {
      new com.tencent.mm.compatible.loader.c(this, "mCursorDrawableRes", TextView.class.getName()).set(Integer.valueOf(i));
      setTextIsSelectable(true);
      setFocusable(true);
      setFocusableInTouchMode(true);
      if (Build.VERSION.SDK_INT >= 16) {
        setLineSpacing(0.0F, 1.0F);
      }
      setTypeface(Typeface.SANS_SERIF);
      super.addTextChangedListener(this.iNA);
      super.setPadding(0, 0, 0, 0);
      super.setEditableFactory(new Editable.Factory()
      {
        public final Editable newEditable(CharSequence paramAnonymousCharSequence)
        {
          GMTrace.i(19881537830912L, 148129);
          paramAnonymousCharSequence = super.newEditable(paramAnonymousCharSequence);
          paramAnonymousCharSequence = w.this.c(paramAnonymousCharSequence);
          GMTrace.o(19881537830912L, 148129);
          return paramAnonymousCharSequence;
        }
      });
    }
    catch (Exception paramContext)
    {
      try
      {
        this.iNr = TextView.class.getDeclaredMethod("nullLayouts", new Class[0]);
        if (acM()) {}
        for (this.iNu = new com.tencent.mm.plugin.appbrand.widget.input.autofill.b(this);; this.iNu = null)
        {
          this.iNC = true;
          GMTrace.o(10055189528576L, 74917);
          return;
          paramContext = paramContext;
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrand.WebEditText", "setTextCursorDrawable, exp = %s", new Object[] { bg.f(paramContext) });
          break;
        }
      }
      catch (Exception paramContext)
      {
        for (;;) {}
      }
    }
  }
  
  private void ke(int paramInt)
  {
    GMTrace.i(10055323746304L, 74918);
    setGravity(getGravity() & 0xFF7FFFFC & 0xFF7FFFFA | paramInt);
    paramInt = getGravity();
    Object localObject = getHint();
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      Spannable localSpannable = ad.s((CharSequence)localObject);
      switch (paramInt & 0x7)
      {
      default: 
        localObject = Layout.Alignment.ALIGN_NORMAL;
        localSpannable.setSpan(new AlignmentSpan.Standard((Layout.Alignment)localObject), 0, getHint().length(), 18);
        super.setHint(localSpannable);
        if (Build.VERSION.SDK_INT >= 17) {
          switch (4.iNH[localObject.ordinal()])
          {
          default: 
            paramInt = 5;
          }
        }
        break;
      }
    }
    for (;;)
    {
      super.setTextAlignment(paramInt);
      GMTrace.o(10055323746304L, 74918);
      return;
      localObject = Layout.Alignment.ALIGN_OPPOSITE;
      break;
      localObject = Layout.Alignment.ALIGN_CENTER;
      break;
      paramInt = 4;
      continue;
      paramInt = 6;
    }
  }
  
  public final void a(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(18269851353088L, 136121);
    if (paramOnFocusChangeListener != null) {
      this.iNy.put(paramOnFocusChangeListener, this);
    }
    GMTrace.o(18269851353088L, 136121);
  }
  
  public final void a(y.a parama)
  {
    GMTrace.i(18269717135360L, 136120);
    this.iNx.put(parama, this);
    GMTrace.o(18269717135360L, 136120);
  }
  
  public final void a(y.b paramb)
  {
    GMTrace.i(18270119788544L, 136123);
    this.iNz.put(paramb, this);
    GMTrace.o(18270119788544L, 136123);
  }
  
  public boolean acM()
  {
    GMTrace.i(18269448699904L, 136118);
    GMTrace.o(18269448699904L, 136118);
    return true;
  }
  
  protected abstract void acN();
  
  public boolean acc()
  {
    GMTrace.i(18845511188480L, 140410);
    GMTrace.o(18845511188480L, 140410);
    return false;
  }
  
  public final String acd()
  {
    GMTrace.i(18269046046720L, 136115);
    String str = this.iLx;
    GMTrace.o(18269046046720L, 136115);
    return str;
  }
  
  public final com.tencent.mm.plugin.appbrand.widget.input.autofill.b ada()
  {
    GMTrace.i(18269582917632L, 136119);
    com.tencent.mm.plugin.appbrand.widget.input.autofill.b localb = this.iNu;
    GMTrace.o(18269582917632L, 136119);
    return localb;
  }
  
  public final int adb()
  {
    GMTrace.i(15422556471296L, 114907);
    int i = kf(getLineCount());
    int j = getPaddingBottom();
    GMTrace.o(15422556471296L, 114907);
    return i + j;
  }
  
  public final void adc()
  {
    GMTrace.i(18270254006272L, 136124);
    ke(3);
    GMTrace.o(18270254006272L, 136124);
  }
  
  public void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    GMTrace.i(10057739665408L, 74936);
    a locala = this.iNA;
    if (paramTextWatcher != null) {
      locala.iNI.put(paramTextWatcher, locala);
    }
    GMTrace.o(10057739665408L, 74936);
  }
  
  public final void ade()
  {
    GMTrace.i(18270388224000L, 136125);
    ke(5);
    GMTrace.o(18270388224000L, 136125);
  }
  
  public final void adf()
  {
    GMTrace.i(18270522441728L, 136126);
    ke(1);
    GMTrace.o(18270522441728L, 136126);
  }
  
  final void adg()
  {
    GMTrace.i(18270790877184L, 136128);
    this.iND += 1;
    GMTrace.o(18270790877184L, 136128);
  }
  
  final void adh()
  {
    GMTrace.i(18270925094912L, 136129);
    this.iND = Math.max(0, this.iND - 1);
    GMTrace.o(18270925094912L, 136129);
  }
  
  public final boolean adi()
  {
    GMTrace.i(10056129052672L, 74924);
    boolean bool = this.iNE;
    GMTrace.o(10056129052672L, 74924);
    return bool;
  }
  
  public final void b(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(18269985570816L, 136122);
    if (paramOnFocusChangeListener != null) {
      this.iNy.remove(paramOnFocusChangeListener);
    }
    GMTrace.o(18269985570816L, 136122);
  }
  
  Editable c(Editable paramEditable)
  {
    GMTrace.i(19866102792192L, 148014);
    paramEditable.setSpan(new SpanWatcher()
    {
      public final void onSpanAdded(Spannable paramAnonymousSpannable, Object paramAnonymousObject, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19865565921280L, 148010);
        if (ad.aT(paramAnonymousObject)) {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrand.WebEditText", "[bindInput] onSpanAdded %s, %s", new Object[] { paramAnonymousSpannable, paramAnonymousObject.getClass().getSimpleName() });
        }
        GMTrace.o(19865565921280L, 148010);
      }
      
      public final void onSpanChanged(Spannable paramAnonymousSpannable, Object paramAnonymousObject, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(19865834356736L, 148012);
        if (ad.aT(paramAnonymousObject)) {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrand.WebEditText", "[bindInput] onSpanChanged %s, %s", new Object[] { paramAnonymousSpannable, paramAnonymousObject.getClass().getSimpleName() });
        }
        GMTrace.o(19865834356736L, 148012);
      }
      
      public final void onSpanRemoved(Spannable paramAnonymousSpannable, Object paramAnonymousObject, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19865700139008L, 148011);
        if (ad.aT(paramAnonymousObject))
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrand.WebEditText", "[bindInput] onSpanRemoved %s, %s", new Object[] { paramAnonymousSpannable, paramAnonymousObject.getClass().getSimpleName() });
          w.d(w.this).removeCallbacks(w.c(w.this));
          w.d(w.this).postDelayed(w.c(w.this), 100L);
        }
        GMTrace.o(19865700139008L, 148011);
      }
    }, 0, paramEditable.length(), 18);
    GMTrace.o(19866102792192L, 148014);
    return paramEditable;
  }
  
  public void cQ(boolean paramBoolean)
  {
    GMTrace.i(18271596183552L, 136134);
    adg();
    this.iNs = paramBoolean;
    if (paramBoolean) {}
    for (PasswordTransformationMethod localPasswordTransformationMethod = this.iNB;; localPasswordTransformationMethod = null)
    {
      setTransformationMethod(localPasswordTransformationMethod);
      adh();
      GMTrace.o(18271596183552L, 136134);
      return;
    }
  }
  
  public final void cT(boolean paramBoolean)
  {
    GMTrace.i(18271461965824L, 136133);
    this.iNE = true;
    GMTrace.o(18271461965824L, 136133);
  }
  
  public void clearFocus()
  {
    GMTrace.i(18271864619008L, 136136);
    if ((getParent() instanceof ViewGroup))
    {
      ((ViewGroup)getParent()).setFocusableInTouchMode(true);
      ((ViewGroup)getParent()).setDescendantFocusability(131072);
    }
    super.clearFocus();
    GMTrace.o(18271864619008L, 136136);
  }
  
  public final void destroy()
  {
    GMTrace.i(18272267272192L, 136139);
    this.iNx.clear();
    this.iNz.clear();
    this.iNy.clear();
    this.iNA.iNI.clear();
    if (this.iNu != null)
    {
      com.tencent.mm.plugin.appbrand.widget.input.autofill.b localb = this.iNu;
      com.tencent.mm.plugin.appbrand.widget.input.autofill.c localc = localb.iOG;
      i.h(localc.iOR).a(localc.iOQ);
      localb.iOJ = null;
      localb.iOE.dismiss();
    }
    setOnFocusChangeListener(null);
    GMTrace.o(18272267272192L, 136139);
  }
  
  public final View getView()
  {
    GMTrace.i(18269314482176L, 136117);
    GMTrace.o(18269314482176L, 136117);
    return this;
  }
  
  public final int kf(int paramInt)
  {
    GMTrace.i(15422422253568L, 114906);
    int i = getPaddingTop() + (int)(paramInt * (getLineHeight() + getLineSpacingExtra()));
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrand.WebEditText", "calculateLinePosition, lineNumber %d, returnHeight %d, layout %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), getLayout() });
    GMTrace.o(15422422253568L, 114906);
    return i;
  }
  
  public final void n(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(18271193530368L, 136131);
    if (this.iNu != null)
    {
      Object localObject = this.iNu.iOG;
      ((com.tencent.mm.plugin.appbrand.widget.input.autofill.c)localObject).iOR = paramAppBrandPageView;
      paramAppBrandPageView = i.h(paramAppBrandPageView);
      localObject = ((com.tencent.mm.plugin.appbrand.widget.input.autofill.c)localObject).iOQ;
      if (localObject == null)
      {
        GMTrace.o(18271193530368L, 136131);
        return;
      }
      if (!paramAppBrandPageView.iLU.containsKey(localObject)) {
        paramAppBrandPageView.iLU.put(localObject, paramAppBrandPageView);
      }
    }
    GMTrace.o(18271193530368L, 136131);
  }
  
  public final void o(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(18271327748096L, 136132);
    if (this.iNu != null)
    {
      com.tencent.mm.plugin.appbrand.widget.input.autofill.c localc = this.iNu.iOG;
      i.h(paramAppBrandPageView).a(localc.iOQ);
    }
    GMTrace.o(18271327748096L, 136132);
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(15422824906752L, 114909);
    super.onConfigurationChanged(paramConfiguration);
    if (!this.iNx.isEmpty())
    {
      paramConfiguration = (y.a[])this.iNx.keySet().toArray(new y.a[this.iNx.size()]);
      int j = paramConfiguration.length;
      int i = 0;
      while (i < j)
      {
        paramConfiguration[i].adj();
        i += 1;
      }
    }
    GMTrace.o(15422824906752L, 114909);
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    GMTrace.i(10055726399488L, 74921);
    this.iNq = super.onCreateInputConnection(paramEditorInfo);
    paramEditorInfo = this.iNq;
    GMTrace.o(10055726399488L, 74921);
    return paramEditorInfo;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(10057202794496L, 74932);
    super.onDraw(paramCanvas);
    GMTrace.o(10057202794496L, 74932);
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    GMTrace.i(15422959124480L, 114910);
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (!paramBoolean) {
      clearComposingText();
    }
    if (paramBoolean) {
      acN();
    }
    if (!this.iNy.isEmpty())
    {
      paramRect = (View.OnFocusChangeListener[])this.iNy.keySet().toArray(new View.OnFocusChangeListener[this.iNy.size()]);
      int i = paramRect.length;
      paramInt = 0;
      while (paramInt < i)
      {
        paramRect[paramInt].onFocusChange(this, paramBoolean);
        paramInt += 1;
      }
    }
    GMTrace.o(15422959124480L, 114910);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18270656659456L, 136127);
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrand.WebEditText", "[scrollUp] input onLayout");
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(18270656659456L, 136127);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(15422690689024L, 114908);
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrand.WebEditText", "[scrollUp] input onMeasure");
    super.onMeasure(paramInt1, paramInt2);
    if (!this.iNz.isEmpty())
    {
      Object[] arrayOfObject = this.iNz.keySet().toArray();
      paramInt2 = arrayOfObject.length;
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        y.b localb = (y.b)arrayOfObject[paramInt1];
        getMeasuredWidth();
        getMeasuredHeight();
        localb.acO();
        paramInt1 += 1;
      }
    }
    GMTrace.o(15422690689024L, 114908);
  }
  
  public void p(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(18845242753024L, 140408);
    throw new IllegalStateException("Should implement performClick(float, float) in this class!");
  }
  
  public final void r(CharSequence paramCharSequence)
  {
    GMTrace.i(18271059312640L, 136130);
    adg();
    Editable localEditable = getEditableText();
    if (localEditable == null) {
      setText(paramCharSequence, TextView.BufferType.EDITABLE);
    }
    for (;;)
    {
      adh();
      GMTrace.o(18271059312640L, 136130);
      return;
      clearComposingText();
      if (TextUtils.isEmpty(paramCharSequence)) {
        localEditable.clear();
      } else {
        localEditable.replace(0, localEditable.length(), paramCharSequence);
      }
    }
  }
  
  public void removeTextChangedListener(TextWatcher paramTextWatcher)
  {
    GMTrace.i(10057873883136L, 74937);
    a locala = this.iNA;
    if (paramTextWatcher != null) {
      locala.iNI.remove(paramTextWatcher);
    }
    GMTrace.o(10057873883136L, 74937);
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    GMTrace.i(18271998836736L, 136137);
    if ((130 == paramInt) && (paramRect == null) && ((getParent() instanceof ViewGroup)))
    {
      ((ViewGroup)getParent()).setDescendantFocusability(262144);
      ((ViewGroup)getParent()).setFocusableInTouchMode(false);
    }
    boolean bool = super.requestFocus(paramInt, paramRect);
    GMTrace.o(18271998836736L, 136137);
    return bool;
  }
  
  public final void sU(String paramString)
  {
    GMTrace.i(18269180264448L, 136116);
    iNt.equals(this.iLx);
    this.iLx = paramString;
    GMTrace.o(18269180264448L, 136116);
  }
  
  public void setInputType(int paramInt)
  {
    GMTrace.i(10056397488128L, 74926);
    if (getInputType() == paramInt)
    {
      GMTrace.o(10056397488128L, 74926);
      return;
    }
    super.setInputType(paramInt);
    GMTrace.o(10056397488128L, 74926);
  }
  
  public void setMaxHeight(int paramInt)
  {
    GMTrace.i(16001169096704L, 119218);
    if (getMaxHeight() == paramInt)
    {
      GMTrace.o(16001169096704L, 119218);
      return;
    }
    super.setMaxHeight(paramInt);
    GMTrace.o(16001169096704L, 119218);
  }
  
  public void setMinHeight(int paramInt)
  {
    GMTrace.i(16001034878976L, 119217);
    if (getMinHeight() == paramInt)
    {
      GMTrace.o(16001034878976L, 119217);
      return;
    }
    super.setMinHeight(paramInt);
    GMTrace.o(16001034878976L, 119217);
  }
  
  @Deprecated
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(18272133054464L, 136138);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    GMTrace.o(18272133054464L, 136138);
  }
  
  public void setSelection(int paramInt)
  {
    GMTrace.i(10055457964032L, 74919);
    if (getEditableText() == null)
    {
      GMTrace.o(10055457964032L, 74919);
      return;
    }
    super.setSelection(Math.min(paramInt, getEditableText().length()));
    GMTrace.o(10055457964032L, 74919);
  }
  
  public void setSelection(int paramInt1, int paramInt2)
  {
    GMTrace.i(10055592181760L, 74920);
    super.setSelection(paramInt1, paramInt2);
    GMTrace.o(10055592181760L, 74920);
  }
  
  public void setSingleLine(boolean paramBoolean)
  {
    GMTrace.i(10056531705856L, 74927);
    GMTrace.o(10056531705856L, 74927);
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    GMTrace.i(10055860617216L, 74922);
    super.setText(paramCharSequence, paramBufferType);
    GMTrace.o(10055860617216L, 74922);
  }
  
  public final void setTextSize(float paramFloat)
  {
    GMTrace.i(10056665923584L, 74928);
    super.setTextSize(0, paramFloat);
    GMTrace.o(10056665923584L, 74928);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    GMTrace.i(10056800141312L, 74929);
    super.setTextSize(paramInt, paramFloat);
    GMTrace.o(10056800141312L, 74929);
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    GMTrace.i(10056934359040L, 74930);
    super.setTypeface(paramTypeface);
    GMTrace.o(10056934359040L, 74930);
  }
  
  public void setTypeface(Typeface paramTypeface, int paramInt)
  {
    GMTrace.i(10057068576768L, 74931);
    super.setTypeface(paramTypeface, paramInt);
    GMTrace.o(10057068576768L, 74931);
  }
  
  public String toString()
  {
    GMTrace.i(18845108535296L, 140407);
    String str = String.format(Locale.US, "[%s|%s]", new Object[] { getClass().getSimpleName(), this.iLx });
    GMTrace.o(18845108535296L, 140407);
    return str;
  }
  
  private final class a
    implements TextWatcher
  {
    final Map<TextWatcher, Object> iNI;
    
    public a()
    {
      GMTrace.i(10092233621504L, 75193);
      this.iNI = new a();
      GMTrace.o(10092233621504L, 75193);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(10092636274688L, 75196);
      Object localObject;
      final int i;
      final int j;
      if (d.acp())
      {
        localObject = new PBool();
        PInt localPInt = new PInt();
        final String str = w.a(paramEditable, (PBool)localObject, localPInt);
        i = localPInt.value;
        if ((((PBool)localObject).value) && (!bg.nm(str)))
        {
          j = Selection.getSelectionEnd(paramEditable);
          final boolean bool = w.e(w.this);
          w.this.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(10053444698112L, 74904);
              if (bool) {
                w.this.r(str);
              }
              for (;;)
              {
                try
                {
                  w.this.setSelection(Math.min(j + i, str.length()));
                  GMTrace.o(10053444698112L, 74904);
                  return;
                }
                catch (Exception localException)
                {
                  com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.WebEditText", "replace softBank to unicode, setSelection ", new Object[] { localException });
                  GMTrace.o(10053444698112L, 74904);
                }
                w.this.setText(str);
              }
            }
          });
          GMTrace.o(10092636274688L, 75196);
          return;
        }
      }
      if (!w.e(w.this))
      {
        w.f(w.this);
        if (!this.iNI.isEmpty())
        {
          localObject = (TextWatcher[])this.iNI.keySet().toArray(new TextWatcher[this.iNI.size()]);
          j = localObject.length;
          i = 0;
          while (i < j)
          {
            localObject[i].afterTextChanged(paramEditable);
            i += 1;
          }
        }
      }
      GMTrace.o(10092636274688L, 75196);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      int i = 0;
      GMTrace.i(10092367839232L, 75194);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrand.WebEditText", "[bindInput] beforeTextChanged %s", new Object[] { paramCharSequence });
      w.d(w.this).removeCallbacks(w.c(w.this));
      if ((!w.e(w.this)) && (!this.iNI.isEmpty()))
      {
        TextWatcher[] arrayOfTextWatcher = (TextWatcher[])this.iNI.keySet().toArray(new TextWatcher[this.iNI.size()]);
        int j = arrayOfTextWatcher.length;
        while (i < j)
        {
          arrayOfTextWatcher[i].beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
          i += 1;
        }
      }
      GMTrace.o(10092367839232L, 75194);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      int i = 0;
      GMTrace.i(10092502056960L, 75195);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrand.WebEditText", "[bindInput] onTextChanged %s", new Object[] { paramCharSequence });
      if ((!w.e(w.this)) && (!this.iNI.isEmpty()))
      {
        TextWatcher[] arrayOfTextWatcher = (TextWatcher[])this.iNI.keySet().toArray(new TextWatcher[this.iNI.size()]);
        int j = arrayOfTextWatcher.length;
        while (i < j)
        {
          arrayOfTextWatcher[i].onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
          i += 1;
        }
      }
      GMTrace.o(10092502056960L, 75195);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */