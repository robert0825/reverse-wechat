package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.a.c;
import android.support.design.a.g;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.e;
import android.support.v4.view.ai;
import android.support.v4.view.an;
import android.support.v4.view.z;
import android.support.v4.widget.Space;
import android.support.v7.widget.h;
import android.support.v7.widget.w;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.List;

public class TextInputLayout
  extends LinearLayout
{
  private u dY;
  private final f fW = new f(this);
  private EditText jZ;
  boolean ka;
  CharSequence kb;
  private Paint kc;
  private LinearLayout kd;
  private int ke;
  private boolean kf;
  private TextView kg;
  private int kh;
  private boolean ki;
  private CharSequence kj;
  private boolean kk;
  private TextView kl;
  private int km;
  private int kn;
  private int ko;
  private boolean kp;
  private ColorStateList kq;
  private ColorStateList kr;
  private boolean ks;
  private boolean kt;
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    t.d(paramContext);
    setOrientation(1);
    setWillNotDraw(false);
    setAddStatesFromChildren(true);
    this.fW.a(a.dI);
    f localf = this.fW;
    localf.fC = new AccelerateInterpolator();
    localf.N();
    this.fW.n(8388659);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.cL, paramInt, a.h.aU);
    this.ka = paramContext.getBoolean(a.i.cV, true);
    setHint(paramContext.getText(a.i.cM));
    this.ks = paramContext.getBoolean(a.i.cU, true);
    if (paramContext.hasValue(a.i.cN))
    {
      paramAttributeSet = paramContext.getColorStateList(a.i.cN);
      this.kr = paramAttributeSet;
      this.kq = paramAttributeSet;
    }
    if (paramContext.getResourceId(a.i.cW, -1) != -1)
    {
      paramInt = paramContext.getResourceId(a.i.cW, 0);
      this.fW.o(paramInt);
      this.kr = ColorStateList.valueOf(this.fW.fg);
      if (this.jZ != null)
      {
        k(false);
        paramAttributeSet = b(this.jZ.getLayoutParams());
        this.jZ.setLayoutParams(paramAttributeSet);
        this.jZ.requestLayout();
      }
    }
    this.kh = paramContext.getResourceId(a.i.cT, 0);
    boolean bool1 = paramContext.getBoolean(a.i.cS, false);
    boolean bool2 = paramContext.getBoolean(a.i.cO, false);
    paramInt = paramContext.getInt(a.i.cP, -1);
    if (this.km != paramInt)
    {
      if (paramInt <= 0) {
        break label454;
      }
      this.km = paramInt;
      if (this.kk)
      {
        if (this.jZ != null) {
          break label462;
        }
        paramInt = 0;
        B(paramInt);
      }
    }
    this.kn = paramContext.getResourceId(a.i.cR, 0);
    this.ko = paramContext.getResourceId(a.i.cQ, 0);
    paramContext.recycle();
    l(bool1);
    if (this.kk != bool2)
    {
      if (!bool2) {
        break label532;
      }
      this.kl = new TextView(getContext());
      this.kl.setMaxLines(1);
    }
    for (;;)
    {
      try
      {
        this.kl.setTextAppearance(getContext(), this.kn);
        a(this.kl, -1);
        if (this.jZ == null)
        {
          B(0);
          this.kk = bool2;
          if (z.G(this) == 0) {
            z.i(this, 1);
          }
          z.a(this, new a());
          return;
          label454:
          this.km = -1;
          break;
          label462:
          paramInt = this.jZ.getText().length();
        }
      }
      catch (Exception paramContext)
      {
        this.kl.setTextAppearance(getContext(), a.h.TextAppearance_AppCompat_Caption);
        this.kl.setTextColor(android.support.v4.content.a.c(getContext(), a.c.ah));
        continue;
        B(this.jZ.getText().length());
        continue;
      }
      label532:
      a(this.kl);
      this.kl = null;
    }
  }
  
  private void B(int paramInt)
  {
    boolean bool2 = this.kp;
    if (this.km == -1)
    {
      this.kl.setText(String.valueOf(paramInt));
      this.kp = false;
      if ((this.jZ != null) && (bool2 != this.kp))
      {
        k(false);
        at();
      }
      return;
    }
    boolean bool1;
    label66:
    TextView localTextView;
    Context localContext;
    if (paramInt > this.km)
    {
      bool1 = true;
      this.kp = bool1;
      if (bool2 != this.kp)
      {
        localTextView = this.kl;
        localContext = getContext();
        if (!this.kp) {
          break label158;
        }
      }
    }
    label158:
    for (int i = this.ko;; i = this.kn)
    {
      localTextView.setTextAppearance(localContext, i);
      this.kl.setText(getContext().getString(a.g.aJ, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.km) }));
      break;
      bool1 = false;
      break label66;
    }
  }
  
  private void a(TextView paramTextView)
  {
    if (this.kd != null)
    {
      this.kd.removeView(paramTextView);
      int i = this.ke - 1;
      this.ke = i;
      if (i == 0) {
        this.kd.setVisibility(8);
      }
    }
  }
  
  private void a(TextView paramTextView, int paramInt)
  {
    if (this.kd == null)
    {
      this.kd = new LinearLayout(getContext());
      this.kd.setOrientation(0);
      addView(this.kd, -1, -2);
      Space localSpace = new Space(getContext());
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, 0, 1.0F);
      this.kd.addView(localSpace, localLayoutParams);
      if (this.jZ != null) {
        as();
      }
    }
    this.kd.setVisibility(0);
    this.kd.addView(paramTextView, paramInt);
    this.ke += 1;
  }
  
  private void as()
  {
    z.c(this.kd, z.P(this.jZ), 0, z.Q(this.jZ), this.jZ.getPaddingBottom());
  }
  
  private void at()
  {
    int i = Build.VERSION.SDK_INT;
    if ((i != 21) || (i != 22)) {}
    Object localObject2;
    do
    {
      localObject2 = this.jZ.getBackground();
      if (localObject2 != null) {
        break;
      }
      return;
      localObject2 = this.jZ.getBackground();
    } while ((localObject2 == null) || (this.kt));
    Object localObject1 = ((Drawable)localObject2).getConstantState().newDrawable();
    Drawable.ConstantState localConstantState;
    if ((localObject2 instanceof DrawableContainer))
    {
      localObject2 = (DrawableContainer)localObject2;
      localConstantState = ((Drawable)localObject1).getConstantState();
      if (Build.VERSION.SDK_INT < 9) {
        break label126;
      }
    }
    label126:
    for (boolean bool = i.a((DrawableContainer)localObject2, localConstantState);; bool = i.b((DrawableContainer)localObject2, localConstantState))
    {
      this.kt = bool;
      if (this.kt) {
        break;
      }
      this.jZ.setBackgroundDrawable((Drawable)localObject1);
      this.kt = true;
      break;
    }
    localObject1 = localObject2;
    if (w.o((Drawable)localObject2)) {
      localObject1 = ((Drawable)localObject2).mutate();
    }
    if ((this.ki) && (this.kg != null))
    {
      ((Drawable)localObject1).setColorFilter(h.a(this.kg.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
      return;
    }
    if ((this.kp) && (this.kl != null))
    {
      ((Drawable)localObject1).setColorFilter(h.a(this.kl.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
      return;
    }
    ((Drawable)localObject1).clearColorFilter();
    this.jZ.refreshDrawableState();
  }
  
  private LinearLayout.LayoutParams b(ViewGroup.LayoutParams paramLayoutParams)
  {
    Paint localPaint;
    if ((paramLayoutParams instanceof LinearLayout.LayoutParams))
    {
      paramLayoutParams = (LinearLayout.LayoutParams)paramLayoutParams;
      if (!this.ka) {
        break label113;
      }
      if (this.kc == null) {
        this.kc = new Paint();
      }
      localPaint = this.kc;
      localObject = this.fW;
      if (((f)localObject).fo == null) {
        break label106;
      }
    }
    label106:
    for (Object localObject = ((f)localObject).fo;; localObject = Typeface.DEFAULT)
    {
      localPaint.setTypeface((Typeface)localObject);
      this.kc.setTextSize(this.fW.fe);
      paramLayoutParams.topMargin = ((int)-this.kc.ascent());
      return paramLayoutParams;
      paramLayoutParams = new LinearLayout.LayoutParams(paramLayoutParams);
      break;
    }
    label113:
    paramLayoutParams.topMargin = 0;
    return paramLayoutParams;
  }
  
  private CharSequence getError()
  {
    if (this.kf) {
      return this.kj;
    }
    return null;
  }
  
  private void k(boolean paramBoolean)
  {
    int k = 1;
    int i;
    int j;
    if ((this.jZ != null) && (!TextUtils.isEmpty(this.jZ.getText())))
    {
      i = 1;
      Object localObject = getDrawableState();
      int m = localObject.length;
      j = 0;
      label38:
      if (j >= m) {
        break label210;
      }
      if (localObject[j] != 16842908) {
        break label203;
      }
      j = 1;
      label56:
      if (TextUtils.isEmpty(getError())) {
        break label215;
      }
      label66:
      if (this.kq != null)
      {
        localObject = this.fW;
        m = this.kq.getDefaultColor();
        if (((f)localObject).ff != m)
        {
          ((f)localObject).ff = m;
          ((f)localObject).N();
        }
      }
      if ((!this.kp) || (this.kl == null)) {
        break label221;
      }
      this.fW.l(this.kl.getCurrentTextColor());
    }
    for (;;)
    {
      if ((i != 0) || (j != 0) || (k != 0))
      {
        if ((this.dY != null) && (this.dY.ky.isRunning())) {
          this.dY.ky.cancel();
        }
        if ((paramBoolean) && (this.ks))
        {
          m(1.0F);
          return;
          i = 0;
          break;
          label203:
          j += 1;
          break label38;
          label210:
          j = 0;
          break label56;
          label215:
          k = 0;
          break label66;
          label221:
          if ((j != 0) && (this.kr != null))
          {
            this.fW.l(this.kr.getDefaultColor());
            continue;
          }
          if (this.kq == null) {
            continue;
          }
          this.fW.l(this.kq.getDefaultColor());
          continue;
        }
        this.fW.e(1.0F);
        return;
      }
    }
    if ((this.dY != null) && (this.dY.ky.isRunning())) {
      this.dY.ky.cancel();
    }
    if ((paramBoolean) && (this.ks))
    {
      m(0.0F);
      return;
    }
    this.fW.e(0.0F);
  }
  
  private void l(boolean paramBoolean)
  {
    if (this.kf != paramBoolean)
    {
      if (this.kg != null) {
        z.V(this.kg).cancel();
      }
      if (!paramBoolean) {
        break label124;
      }
    }
    for (this.kg = new TextView(getContext());; this.kg = null)
    {
      try
      {
        this.kg.setTextAppearance(getContext(), this.kh);
        this.kg.setVisibility(4);
        z.O(this.kg);
        a(this.kg, 0);
        this.kf = paramBoolean;
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          this.kg.setTextAppearance(getContext(), a.h.TextAppearance_AppCompat_Caption);
          this.kg.setTextColor(android.support.v4.content.a.c(getContext(), a.c.ah));
        }
      }
      label124:
      this.ki = false;
      at();
      a(this.kg);
    }
  }
  
  private void m(float paramFloat)
  {
    if (this.fW.eW == paramFloat) {
      return;
    }
    if (this.dY == null)
    {
      this.dY = aa.av();
      this.dY.setInterpolator(a.dH);
      this.dY.setDuration(200);
      this.dY.a(new u.c()
      {
        public final void a(u paramAnonymousu)
        {
          TextInputLayout.d(TextInputLayout.this).e(paramAnonymousu.ky.ax());
        }
      });
    }
    this.dY.e(this.fW.eW, paramFloat);
    this.dY.ky.start();
  }
  
  private void setHint(CharSequence paramCharSequence)
  {
    if (this.ka)
    {
      this.kb = paramCharSequence;
      this.fW.setText(paramCharSequence);
      sendAccessibilityEvent(2048);
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramView instanceof EditText))
    {
      Object localObject = (EditText)paramView;
      if (this.jZ != null) {
        throw new IllegalArgumentException("We already have an EditText, can only have one");
      }
      this.jZ = ((EditText)localObject);
      localObject = this.fW;
      Typeface localTypeface = this.jZ.getTypeface();
      ((f)localObject).fp = localTypeface;
      ((f)localObject).fo = localTypeface;
      ((f)localObject).N();
      localObject = this.fW;
      float f = this.jZ.getTextSize();
      if (((f)localObject).fc != f)
      {
        ((f)localObject).fc = f;
        ((f)localObject).N();
      }
      paramInt = this.jZ.getGravity();
      this.fW.n(0x800007 & paramInt | 0x30);
      this.fW.m(paramInt);
      this.jZ.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          TextInputLayout.a(TextInputLayout.this);
          if (TextInputLayout.b(TextInputLayout.this)) {
            TextInputLayout.a(TextInputLayout.this, paramAnonymousEditable.length());
          }
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      });
      if (this.kq == null) {
        this.kq = this.jZ.getHintTextColors();
      }
      if ((this.ka) && (TextUtils.isEmpty(this.kb)))
      {
        setHint(this.jZ.getHint());
        this.jZ.setHint(null);
      }
      if (this.kl != null) {
        B(this.jZ.getText().length());
      }
      if (this.kd != null) {
        as();
      }
      k(false);
      super.addView(paramView, 0, b(paramLayoutParams));
      return;
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.ka) {
      this.fW.draw(paramCanvas);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.ka) && (this.jZ != null))
    {
      paramInt1 = this.jZ.getLeft() + this.jZ.getCompoundPaddingLeft();
      paramInt3 = this.jZ.getRight() - this.jZ.getCompoundPaddingRight();
      this.fW.b(paramInt1, this.jZ.getTop() + this.jZ.getCompoundPaddingTop(), paramInt3, this.jZ.getBottom() - this.jZ.getCompoundPaddingBottom());
      this.fW.c(paramInt1, getPaddingTop(), paramInt3, paramInt4 - paramInt2 - getPaddingBottom());
      this.fW.N();
    }
  }
  
  protected void onRestoreInstanceState(final Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    paramParcelable = paramParcelable.kw;
    boolean bool2;
    boolean bool1;
    if (!TextUtils.equals(this.kj, paramParcelable))
    {
      this.kj = paramParcelable;
      if (!this.kf)
      {
        if (!TextUtils.isEmpty(paramParcelable)) {
          l(true);
        }
      }
      else
      {
        bool2 = z.aj(this);
        if (TextUtils.isEmpty(paramParcelable)) {
          break label183;
        }
        bool1 = true;
        this.ki = bool1;
        if (!this.ki) {
          break label188;
        }
        this.kg.setText(paramParcelable);
        this.kg.setVisibility(0);
        if (bool2)
        {
          if (z.H(this.kg) == 1.0F) {
            z.d(this.kg, 0.0F);
          }
          z.V(this.kg).p(1.0F).d(200L).b(a.dK).a(new an()
          {
            public final void p(View paramAnonymousView)
            {
              paramAnonymousView.setVisibility(0);
            }
          }).start();
        }
      }
    }
    for (;;)
    {
      at();
      k(true);
      requestLayout();
      return;
      label183:
      bool1 = false;
      break;
      label188:
      if (this.kg.getVisibility() == 0) {
        if (bool2) {
          z.V(this.kg).p(0.0F).d(200L).b(a.dJ).a(new an()
          {
            public final void q(View paramAnonymousView)
            {
              TextInputLayout.c(TextInputLayout.this).setText(paramParcelable);
              paramAnonymousView.setVisibility(4);
            }
          }).start();
        } else {
          this.kg.setVisibility(4);
        }
      }
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    if (this.ki) {
      localSavedState.kw = getError();
    }
    return localSavedState;
  }
  
  public void refreshDrawableState()
  {
    super.refreshDrawableState();
    k(z.aj(this));
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    CharSequence kw;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      this.kw = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.kw + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      TextUtils.writeToParcel(this.kw, paramParcel, paramInt);
    }
  }
  
  private final class a
    extends android.support.v4.view.a
  {
    public a() {}
    
    public final void a(View paramView, b paramb)
    {
      super.a(paramView, paramb);
      paramb.setClassName(TextInputLayout.class.getSimpleName());
      paramView = TextInputLayout.d(TextInputLayout.this).mText;
      if (!TextUtils.isEmpty(paramView)) {
        paramb.setText(paramView);
      }
      if (TextInputLayout.e(TextInputLayout.this) != null)
      {
        paramView = TextInputLayout.e(TextInputLayout.this);
        b.yZ.f(paramb.za, paramView);
      }
      if (TextInputLayout.c(TextInputLayout.this) != null) {}
      for (paramView = TextInputLayout.c(TextInputLayout.this).getText();; paramView = null)
      {
        if (!TextUtils.isEmpty(paramView))
        {
          b.yZ.j(paramb.za, true);
          b.yZ.a(paramb.za, paramView);
        }
        return;
      }
    }
    
    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
    }
    
    public final void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramView = TextInputLayout.d(TextInputLayout.this).mText;
      if (!TextUtils.isEmpty(paramView)) {
        paramAccessibilityEvent.getText().add(paramView);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\TextInputLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */