package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.k;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.CompoundButton;
import java.util.List;

public class SwitchCompat
  extends CompoundButton
{
  private static final int[] dd = { 16842912 };
  private final h Oc;
  private int Ty;
  private Drawable XH;
  private Drawable XI;
  private int XJ;
  private int XK;
  private int XL;
  private boolean XM;
  private CharSequence XN;
  private CharSequence XO;
  private boolean XP;
  private int XQ;
  private float XR;
  private float XS;
  private float XT;
  private int XU;
  private int XV;
  private int XW;
  private int XX;
  private int XY;
  private int XZ;
  private int Ya;
  private ColorStateList Yb;
  private Layout Yc;
  private Layout Yd;
  private TransformationMethod Ye;
  private a Yf;
  private final Rect dF = new Rect();
  private VelocityTracker ez = VelocityTracker.obtain();
  private TextPaint fB = new TextPaint(1);
  private int hQ;
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.switchStyle);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = getResources();
    this.fB.density = ((Resources)localObject).getDisplayMetrics().density;
    localObject = ap.a(paramContext, paramAttributeSet, a.k.SwitchCompat, paramInt);
    this.XH = ((ap)localObject).getDrawable(a.k.SwitchCompat_android_thumb);
    if (this.XH != null) {
      this.XH.setCallback(this);
    }
    this.XI = ((ap)localObject).getDrawable(a.k.SwitchCompat_track);
    if (this.XI != null) {
      this.XI.setCallback(this);
    }
    this.XN = ((ap)localObject).getText(a.k.SwitchCompat_android_textOn);
    this.XO = ((ap)localObject).getText(a.k.SwitchCompat_android_textOff);
    this.XP = ((ap)localObject).getBoolean(a.k.SwitchCompat_showText, true);
    this.XJ = ((ap)localObject).getDimensionPixelSize(a.k.SwitchCompat_thumbTextPadding, 0);
    this.XK = ((ap)localObject).getDimensionPixelSize(a.k.SwitchCompat_switchMinWidth, 0);
    this.XL = ((ap)localObject).getDimensionPixelSize(a.k.SwitchCompat_switchPadding, 0);
    this.XM = ((ap)localObject).getBoolean(a.k.SwitchCompat_splitTrack, false);
    paramInt = ((ap)localObject).getResourceId(a.k.SwitchCompat_switchTextAppearance, 0);
    TypedArray localTypedArray;
    int i;
    label346:
    label361:
    label375:
    boolean bool;
    label396:
    float f;
    if (paramInt != 0)
    {
      localTypedArray = paramContext.obtainStyledAttributes(paramInt, a.k.TextAppearance);
      paramAttributeSet = localTypedArray.getColorStateList(a.k.TextAppearance_android_textColor);
      if (paramAttributeSet == null) {
        break label504;
      }
      this.Yb = paramAttributeSet;
      paramInt = localTypedArray.getDimensionPixelSize(a.k.TextAppearance_android_textSize, 0);
      if ((paramInt != 0) && (paramInt != this.fB.getTextSize()))
      {
        this.fB.setTextSize(paramInt);
        requestLayout();
      }
      paramInt = localTypedArray.getInt(a.k.TextAppearance_android_typeface, -1);
      i = localTypedArray.getInt(a.k.TextAppearance_android_textStyle, -1);
      switch (paramInt)
      {
      default: 
        paramAttributeSet = null;
        if (i > 0) {
          if (paramAttributeSet == null)
          {
            paramAttributeSet = Typeface.defaultFromStyle(i);
            setSwitchTypeface(paramAttributeSet);
            if (paramAttributeSet == null) {
              break label546;
            }
            paramInt = paramAttributeSet.getStyle();
            paramInt = i & (paramInt ^ 0xFFFFFFFF);
            paramAttributeSet = this.fB;
            if ((paramInt & 0x1) == 0) {
              break label551;
            }
            bool = true;
            paramAttributeSet.setFakeBoldText(bool);
            paramAttributeSet = this.fB;
            if ((paramInt & 0x2) == 0) {
              break label557;
            }
            f = -0.25F;
            label417:
            paramAttributeSet.setTextSkewX(f);
            label423:
            if (!localTypedArray.getBoolean(a.k.TextAppearance_textAllCaps, false)) {
              break label587;
            }
          }
        }
        break;
      }
    }
    label504:
    label546:
    label551:
    label557:
    label587:
    for (this.Ye = new android.support.v7.e.a(getContext());; this.Ye = null)
    {
      localTypedArray.recycle();
      this.Oc = h.ex();
      ((ap)localObject).Yu.recycle();
      paramContext = ViewConfiguration.get(paramContext);
      this.hQ = paramContext.getScaledTouchSlop();
      this.Ty = paramContext.getScaledMinimumFlingVelocity();
      refreshDrawableState();
      setChecked(isChecked());
      return;
      this.Yb = getTextColors();
      break;
      paramAttributeSet = Typeface.SANS_SERIF;
      break label346;
      paramAttributeSet = Typeface.SERIF;
      break label346;
      paramAttributeSet = Typeface.MONOSPACE;
      break label346;
      paramAttributeSet = Typeface.create(paramAttributeSet, i);
      break label361;
      paramInt = 0;
      break label375;
      bool = false;
      break label396;
      f = 0.0F;
      break label417;
      this.fB.setFakeBoldText(false);
      this.fB.setTextSkewX(0.0F);
      setSwitchTypeface(paramAttributeSet);
      break label423;
    }
  }
  
  private void E(float paramFloat)
  {
    this.XT = paramFloat;
    invalidate();
  }
  
  private void gQ()
  {
    if (this.Yf != null)
    {
      clearAnimation();
      this.Yf = null;
    }
  }
  
  private boolean gR()
  {
    return this.XT > 0.5F;
  }
  
  private int gS()
  {
    if (this.XI != null)
    {
      Rect localRect2 = this.dF;
      this.XI.getPadding(localRect2);
      if (this.XH != null) {}
      for (Rect localRect1 = w.m(this.XH);; localRect1 = w.Qt) {
        return this.XU - this.XW - localRect2.left - localRect2.right - localRect1.left - localRect1.right;
      }
    }
    return 0;
  }
  
  private int getThumbOffset()
  {
    if (at.bw(this)) {}
    for (float f = 1.0F - this.XT;; f = this.XT) {
      return (int)(f * gS() + 0.5F);
    }
  }
  
  private Layout i(CharSequence paramCharSequence)
  {
    TextPaint localTextPaint;
    if (this.Ye != null)
    {
      paramCharSequence = this.Ye.getTransformation(paramCharSequence, this);
      localTextPaint = this.fB;
      if (paramCharSequence == null) {
        break label62;
      }
    }
    label62:
    for (int i = (int)Math.ceil(Layout.getDesiredWidth(paramCharSequence, this.fB));; i = 0)
    {
      return new StaticLayout(paramCharSequence, localTextPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
      break;
    }
  }
  
  private void setSwitchTypeface(Typeface paramTypeface)
  {
    if (this.fB.getTypeface() != paramTypeface)
    {
      this.fB.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = this.dF;
    int j = this.XX;
    int n = this.XY;
    int i2 = this.XZ;
    int i1 = this.Ya;
    int i3 = j + getThumbOffset();
    Object localObject;
    int i4;
    label139:
    int m;
    int k;
    if (this.XH != null)
    {
      localObject = w.m(this.XH);
      if (this.XI == null) {
        break label340;
      }
      this.XI.getPadding(localRect);
      i4 = localRect.left;
      if (localObject == null) {
        break label320;
      }
      i = j;
      if (((Rect)localObject).left > localRect.left) {
        i = j + (((Rect)localObject).left - localRect.left);
      }
      if (((Rect)localObject).top <= localRect.top) {
        break label314;
      }
      j = ((Rect)localObject).top - localRect.top + n;
      m = i2;
      if (((Rect)localObject).right > localRect.right) {
        m = i2 - (((Rect)localObject).right - localRect.right);
      }
      if (((Rect)localObject).bottom <= localRect.bottom) {
        break label307;
      }
      k = i1 - (((Rect)localObject).bottom - localRect.bottom);
      label201:
      this.XI.setBounds(i, j, m, k);
    }
    label307:
    label314:
    label320:
    label340:
    for (int i = i4 + i3;; i = i3)
    {
      if (this.XH != null)
      {
        this.XH.getPadding(localRect);
        j = i - localRect.left;
        i = i + this.XW + localRect.right;
        this.XH.setBounds(j, n, i, i1);
        localObject = getBackground();
        if (localObject != null) {
          android.support.v4.b.a.a.a((Drawable)localObject, j, n, i, i1);
        }
      }
      super.draw(paramCanvas);
      return;
      localObject = w.Qt;
      break;
      k = i1;
      break label201;
      j = n;
      break label139;
      k = i1;
      m = n;
      i = j;
      j = m;
      m = i2;
      break label201;
    }
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      super.drawableHotspotChanged(paramFloat1, paramFloat2);
    }
    if (this.XH != null) {
      android.support.v4.b.a.a.a(this.XH, paramFloat1, paramFloat2);
    }
    if (this.XI != null) {
      android.support.v4.b.a.a.a(this.XI, paramFloat1, paramFloat2);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if (this.XH != null) {
      this.XH.setState(arrayOfInt);
    }
    if (this.XI != null) {
      this.XI.setState(arrayOfInt);
    }
    invalidate();
  }
  
  public int getCompoundPaddingLeft()
  {
    int i;
    if (!at.bw(this)) {
      i = super.getCompoundPaddingLeft();
    }
    int j;
    do
    {
      return i;
      j = super.getCompoundPaddingLeft() + this.XU;
      i = j;
    } while (TextUtils.isEmpty(getText()));
    return j + this.XL;
  }
  
  public int getCompoundPaddingRight()
  {
    int i;
    if (at.bw(this)) {
      i = super.getCompoundPaddingRight();
    }
    int j;
    do
    {
      return i;
      j = super.getCompoundPaddingRight() + this.XU;
      i = j;
    } while (TextUtils.isEmpty(getText()));
    return j + this.XL;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.XH != null) {
        this.XH.jumpToCurrentState();
      }
      if (this.XI != null) {
        this.XI.jumpToCurrentState();
      }
      gQ();
      if (!isChecked()) {
        break label59;
      }
    }
    label59:
    for (float f = 1.0F;; f = 0.0F)
    {
      E(f);
      return;
    }
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked()) {
      mergeDrawableStates(arrayOfInt, dd);
    }
    return arrayOfInt;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Object localObject1 = this.dF;
    Object localObject3 = this.XI;
    int k;
    int m;
    int n;
    int i1;
    Object localObject2;
    label151:
    int j;
    if (localObject3 != null)
    {
      ((Drawable)localObject3).getPadding((Rect)localObject1);
      k = this.XY;
      m = this.Ya;
      n = ((Rect)localObject1).top;
      i1 = ((Rect)localObject1).bottom;
      localObject2 = this.XH;
      if (localObject3 != null)
      {
        if ((!this.XM) || (localObject2 == null)) {
          break label322;
        }
        Rect localRect = w.m((Drawable)localObject2);
        ((Drawable)localObject2).copyBounds((Rect)localObject1);
        ((Rect)localObject1).left += localRect.left;
        ((Rect)localObject1).right -= localRect.right;
        i = paramCanvas.save();
        paramCanvas.clipRect((Rect)localObject1, Region.Op.DIFFERENCE);
        ((Drawable)localObject3).draw(paramCanvas);
        paramCanvas.restoreToCount(i);
      }
      j = paramCanvas.save();
      if (localObject2 != null) {
        ((Drawable)localObject2).draw(paramCanvas);
      }
      if (!gR()) {
        break label331;
      }
      localObject1 = this.Yc;
      label180:
      if (localObject1 != null)
      {
        localObject3 = getDrawableState();
        if (this.Yb != null) {
          this.fB.setColor(this.Yb.getColorForState((int[])localObject3, 0));
        }
        this.fB.drawableState = ((int[])localObject3);
        if (localObject2 == null) {
          break label340;
        }
        localObject2 = ((Drawable)localObject2).getBounds();
        i = ((Rect)localObject2).left;
      }
    }
    label322:
    label331:
    label340:
    for (int i = ((Rect)localObject2).right + i;; i = getWidth())
    {
      i /= 2;
      int i2 = ((Layout)localObject1).getWidth() / 2;
      k = (k + n + (m - i1)) / 2;
      m = ((Layout)localObject1).getHeight() / 2;
      paramCanvas.translate(i - i2, k - m);
      ((Layout)localObject1).draw(paramCanvas);
      paramCanvas.restoreToCount(j);
      return;
      ((Rect)localObject1).setEmpty();
      break;
      ((Drawable)localObject3).draw(paramCanvas);
      break label151;
      localObject1 = this.Yd;
      break label180;
    }
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName("android.widget.Switch");
      if (!isChecked()) {
        break label57;
      }
    }
    CharSequence localCharSequence2;
    label57:
    for (CharSequence localCharSequence1 = this.XN;; localCharSequence1 = this.XO)
    {
      if (!TextUtils.isEmpty(localCharSequence1))
      {
        localCharSequence2 = paramAccessibilityNodeInfo.getText();
        if (!TextUtils.isEmpty(localCharSequence2)) {
          break;
        }
        paramAccessibilityNodeInfo.setText(localCharSequence1);
      }
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localCharSequence2).append(' ').append(localCharSequence1);
    paramAccessibilityNodeInfo.setText(localStringBuilder);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Rect localRect1;
    Rect localRect2;
    if (this.XH != null)
    {
      localRect1 = this.dF;
      if (this.XI != null)
      {
        this.XI.getPadding(localRect1);
        localRect2 = w.m(this.XH);
        paramInt2 = Math.max(0, localRect2.left - localRect1.left);
      }
    }
    for (paramInt1 = Math.max(0, localRect2.right - localRect1.right);; paramInt1 = i)
    {
      if (at.bw(this))
      {
        paramInt3 = getPaddingLeft() + paramInt2;
        paramInt4 = this.XU + paramInt3 - paramInt2 - paramInt1;
        label113:
        switch (getGravity() & 0x70)
        {
        default: 
          paramInt2 = getPaddingTop();
          paramInt1 = this.XV + paramInt2;
        }
      }
      for (;;)
      {
        this.XX = paramInt3;
        this.XY = paramInt2;
        this.Ya = paramInt1;
        this.XZ = paramInt4;
        return;
        localRect1.setEmpty();
        break;
        paramInt4 = getWidth() - getPaddingRight() - paramInt1;
        paramInt3 = paramInt1 + (paramInt2 + (paramInt4 - this.XU));
        break label113;
        paramInt2 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2 - this.XV / 2;
        paramInt1 = this.XV + paramInt2;
        continue;
        paramInt1 = getHeight() - getPaddingBottom();
        paramInt2 = paramInt1 - this.XV;
      }
      paramInt2 = 0;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int m = 0;
    if (this.XP)
    {
      if (this.Yc == null) {
        this.Yc = i(this.XN);
      }
      if (this.Yd == null) {
        this.Yd = i(this.XO);
      }
    }
    Rect localRect = this.dF;
    int i;
    int k;
    if (this.XH != null)
    {
      this.XH.getPadding(localRect);
      j = this.XH.getIntrinsicWidth() - localRect.left - localRect.right;
      i = this.XH.getIntrinsicHeight();
      if (!this.XP) {
        break label303;
      }
      k = Math.max(this.Yc.getWidth(), this.Yd.getWidth()) + this.XJ * 2;
      label133:
      this.XW = Math.max(k, j);
      if (this.XI == null) {
        break label309;
      }
      this.XI.getPadding(localRect);
    }
    for (int j = this.XI.getIntrinsicHeight();; j = m)
    {
      int i1 = localRect.left;
      int n = localRect.right;
      m = i1;
      k = n;
      if (this.XH != null)
      {
        localRect = w.m(this.XH);
        m = Math.max(i1, localRect.left);
        k = Math.max(n, localRect.right);
      }
      k = Math.max(this.XK, m + this.XW * 2 + k);
      i = Math.max(j, i);
      this.XU = k;
      this.XV = i;
      super.onMeasure(paramInt1, paramInt2);
      if (getMeasuredHeight() < i) {
        setMeasuredDimension(z.M(this), i);
      }
      return;
      i = 0;
      j = 0;
      break;
      label303:
      k = 0;
      break label133;
      label309:
      localRect.setEmpty();
    }
  }
  
  @TargetApi(14)
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (isChecked()) {}
    for (CharSequence localCharSequence = this.XN;; localCharSequence = this.XO)
    {
      if (localCharSequence != null) {
        paramAccessibilityEvent.getText().add(localCharSequence);
      }
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f3 = 1.0F;
    int j = 0;
    boolean bool1 = true;
    this.ez.addMovement(paramMotionEvent);
    switch (o.d(paramMotionEvent))
    {
    }
    for (;;)
    {
      bool1 = super.onTouchEvent(paramMotionEvent);
      float f1;
      int i;
      label474:
      label486:
      for (;;)
      {
        return bool1;
        f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        if (!isEnabled()) {
          break;
        }
        i = j;
        if (this.XH != null)
        {
          i = getThumbOffset();
          this.XH.getPadding(this.dF);
          int k = this.XY;
          int m = this.hQ;
          int n = i + this.XX - this.hQ;
          int i1 = this.XW;
          int i2 = this.dF.left;
          int i3 = this.dF.right;
          int i4 = this.hQ;
          int i5 = this.Ya;
          int i6 = this.hQ;
          i = j;
          if (f1 > n)
          {
            i = j;
            if (f1 < i1 + n + i2 + i3 + i4)
            {
              i = j;
              if (f2 > k - m)
              {
                i = j;
                if (f2 < i5 + i6) {
                  i = 1;
                }
              }
            }
          }
        }
        if (i == 0) {
          break;
        }
        this.XQ = 1;
        this.XR = f1;
        this.XS = f2;
        break;
        switch (this.XQ)
        {
        case 0: 
        default: 
          break;
        case 1: 
          f1 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          if ((Math.abs(f1 - this.XR) <= this.hQ) && (Math.abs(f2 - this.XS) <= this.hQ)) {
            break;
          }
          this.XQ = 2;
          getParent().requestDisallowInterceptTouchEvent(true);
          this.XR = f1;
          this.XS = f2;
          return true;
        case 2: 
          float f4 = paramMotionEvent.getX();
          i = gS();
          f1 = f4 - this.XR;
          if (i != 0)
          {
            f1 /= i;
            f2 = f1;
            if (at.bw(this)) {
              f2 = -f1;
            }
            f2 += this.XT;
            if (f2 >= 0.0F) {
              break label474;
            }
            f1 = 0.0F;
          }
          for (;;)
          {
            if (f1 == this.XT) {
              break label486;
            }
            this.XR = f4;
            E(f1);
            return true;
            if (f1 > 0.0F)
            {
              f1 = 1.0F;
              break;
            }
            f1 = -1.0F;
            break;
            f1 = f3;
            if (f2 <= 1.0F) {
              f1 = f2;
            }
          }
        }
      }
      if (this.XQ == 2)
      {
        this.XQ = 0;
        boolean bool2;
        if ((paramMotionEvent.getAction() == 1) && (isEnabled()))
        {
          i = 1;
          bool2 = isChecked();
          if (i == 0) {
            break label666;
          }
          this.ez.computeCurrentVelocity(1000);
          f1 = this.ez.getXVelocity();
          if (Math.abs(f1) <= this.Ty) {
            break label657;
          }
          if (!at.bw(this)) {
            break label639;
          }
          if (f1 >= 0.0F) {
            break label633;
          }
          bool1 = true;
        }
        for (;;)
        {
          if (bool1 != bool2) {
            playSoundEffect(0);
          }
          setChecked(bool1);
          MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
          localMotionEvent.setAction(3);
          super.onTouchEvent(localMotionEvent);
          localMotionEvent.recycle();
          super.onTouchEvent(paramMotionEvent);
          return true;
          i = 0;
          break;
          label633:
          bool1 = false;
          continue;
          label639:
          if (f1 > 0.0F)
          {
            bool1 = true;
          }
          else
          {
            bool1 = false;
            continue;
            label657:
            bool1 = gR();
            continue;
            label666:
            bool1 = bool2;
          }
        }
      }
      this.XQ = 0;
      this.ez.clear();
    }
  }
  
  public void setChecked(final boolean paramBoolean)
  {
    float f1 = 1.0F;
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if ((getWindowToken() != null) && (z.aj(this)) && (isShown()))
    {
      if (this.Yf != null) {
        gQ();
      }
      float f2 = this.XT;
      if (paramBoolean) {}
      for (;;)
      {
        this.Yf = new a(f2, f1, (byte)0);
        this.Yf.setDuration(250L);
        this.Yf.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            if (SwitchCompat.a(SwitchCompat.this) == paramAnonymousAnimation)
            {
              paramAnonymousAnimation = SwitchCompat.this;
              if (!paramBoolean) {
                break label39;
              }
            }
            label39:
            for (float f = 1.0F;; f = 0.0F)
            {
              SwitchCompat.a(paramAnonymousAnimation, f);
              SwitchCompat.b(SwitchCompat.this);
              return;
            }
          }
          
          public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
          
          public final void onAnimationStart(Animation paramAnonymousAnimation) {}
        });
        startAnimation(this.Yf);
        return;
        f1 = 0.0F;
      }
    }
    gQ();
    if (paramBoolean) {}
    for (;;)
    {
      E(f1);
      return;
      f1 = 0.0F;
    }
  }
  
  public void toggle()
  {
    if (!isChecked()) {}
    for (boolean bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.XH) || (paramDrawable == this.XI);
  }
  
  private final class a
    extends Animation
  {
    final float Yi;
    final float Yj;
    final float Yk;
    
    private a(float paramFloat1, float paramFloat2)
    {
      this.Yi = paramFloat1;
      this.Yj = paramFloat2;
      this.Yk = (paramFloat2 - paramFloat1);
    }
    
    protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      SwitchCompat.a(SwitchCompat.this, this.Yi + this.Yk * paramFloat);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\android\support\v7\widget\SwitchCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */