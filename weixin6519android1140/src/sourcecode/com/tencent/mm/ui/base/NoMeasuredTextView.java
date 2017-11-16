package com.tencent.mm.ui.base;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.BoringLayout.Metrics;
import android.text.Editable.Factory;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Selection;
import android.text.Spannable.Factory;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

@SuppressLint({"ResourceAsColor"})
public class NoMeasuredTextView
  extends View
{
  private static final BoringLayout.Metrics whG;
  private int JE;
  private ColorStateList dr;
  public TextPaint fB;
  private int ia;
  private CharSequence mText;
  private int tl;
  private boolean weH;
  private int wgZ;
  private boolean whA;
  private boolean whB;
  private int whC;
  private int whD;
  private int whE;
  private int whF;
  private Editable.Factory wha;
  private Spannable.Factory whb;
  private TextUtils.TruncateAt whc;
  private CharSequence whd;
  private int whe;
  private KeyListener whf;
  private Layout whg;
  private float whh;
  private float whi;
  private int whj;
  private int whk;
  private int whl;
  private int whm;
  private boolean whn;
  private boolean who;
  private int whp;
  private boolean whq;
  private BoringLayout whr;
  private boolean whs;
  private int wht;
  private Paint.FontMetricsInt whu;
  private boolean whv;
  public boolean whw;
  private b whx;
  private boolean why;
  private boolean whz;
  
  static
  {
    GMTrace.i(3264309362688L, 24321);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.measureText("H");
    whG = new BoringLayout.Metrics();
    GMTrace.o(3264309362688L, 24321);
  }
  
  public NoMeasuredTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3259477524480L, 24285);
    this.wha = Editable.Factory.getInstance();
    this.whb = Spannable.Factory.getInstance();
    this.whc = null;
    this.whe = a.whH;
    this.tl = 51;
    this.whh = 1.0F;
    this.whi = 0.0F;
    this.whj = Integer.MAX_VALUE;
    this.whk = 1;
    this.whl = 0;
    this.whm = 1;
    this.ia = Integer.MAX_VALUE;
    this.whn = false;
    this.JE = 0;
    this.who = false;
    this.whp = -1;
    this.whq = true;
    this.whs = false;
    this.whv = false;
    this.whw = false;
    this.why = false;
    this.whz = false;
    this.whA = false;
    this.whB = false;
    this.whC = -1;
    this.whD = -1;
    this.whE = -1;
    this.whF = -1;
    this.mText = "";
    this.whd = "";
    this.fB = new TextPaint(1);
    this.fB.density = getResources().getDisplayMetrics().density;
    setDrawingCacheEnabled(false);
    this.whu = this.fB.getFontMetricsInt();
    caL();
    cag();
    setEllipsize(null);
    GMTrace.o(3259477524480L, 24285);
  }
  
  private void a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    GMTrace.i(3259611742208L, 24286);
    Object localObject2 = this.whx;
    int i;
    if ((paramDrawable1 != null) || (paramDrawable2 != null))
    {
      i = 1;
      if (i != 0) {
        break label206;
      }
      if (localObject2 != null)
      {
        if (((b)localObject2).whY != 0) {
          break label66;
        }
        this.whx = null;
      }
    }
    for (;;)
    {
      invalidate();
      GMTrace.o(3259611742208L, 24286);
      return;
      i = 0;
      break;
      label66:
      if (((b)localObject2).whO != null) {
        ((b)localObject2).whO.setCallback(null);
      }
      ((b)localObject2).whO = null;
      if (((b)localObject2).whM != null) {
        ((b)localObject2).whM.setCallback(null);
      }
      ((b)localObject2).whM = null;
      if (((b)localObject2).whP != null) {
        ((b)localObject2).whP.setCallback(null);
      }
      ((b)localObject2).whP = null;
      if (((b)localObject2).whN != null) {
        ((b)localObject2).whN.setCallback(null);
      }
      ((b)localObject2).whN = null;
      ((b)localObject2).whW = 0;
      ((b)localObject2).whS = 0;
      paramDrawable1 = (Drawable)localObject2;
      paramDrawable1.whX = 0;
      paramDrawable1.whT = 0;
      label183:
      paramDrawable1.whU = 0;
      paramDrawable1.whQ = 0;
      paramDrawable1.whV = 0;
      paramDrawable1.whR = 0;
    }
    label206:
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new b();
      this.whx = ((b)localObject1);
    }
    if ((((b)localObject1).whO != paramDrawable1) && (((b)localObject1).whO != null)) {
      ((b)localObject1).whO.setCallback(null);
    }
    ((b)localObject1).whO = paramDrawable1;
    if ((((b)localObject1).whM != null) && (((b)localObject1).whM != null)) {
      ((b)localObject1).whM.setCallback(null);
    }
    ((b)localObject1).whM = null;
    if ((((b)localObject1).whP != paramDrawable2) && (((b)localObject1).whP != null)) {
      ((b)localObject1).whP.setCallback(null);
    }
    ((b)localObject1).whP = paramDrawable2;
    if ((((b)localObject1).whN != null) && (((b)localObject1).whN != null)) {
      ((b)localObject1).whN.setCallback(null);
    }
    ((b)localObject1).whN = null;
    localObject2 = ((b)localObject1).whL;
    int[] arrayOfInt = getDrawableState();
    if (paramDrawable1 != null)
    {
      paramDrawable1.setState(arrayOfInt);
      paramDrawable1.copyBounds((Rect)localObject2);
      paramDrawable1.setCallback(this);
      ((b)localObject1).whS = ((Rect)localObject2).width();
      ((b)localObject1).whW = ((Rect)localObject2).height();
    }
    for (;;)
    {
      paramDrawable1 = (Drawable)localObject1;
      if (paramDrawable2 == null) {
        break;
      }
      paramDrawable2.setState(arrayOfInt);
      paramDrawable2.copyBounds((Rect)localObject2);
      paramDrawable2.setCallback(this);
      ((b)localObject1).whT = ((Rect)localObject2).width();
      ((b)localObject1).whX = ((Rect)localObject2).height();
      paramDrawable1 = (Drawable)localObject1;
      break label183;
      ((b)localObject1).whW = 0;
      ((b)localObject1).whS = 0;
    }
  }
  
  private int caI()
  {
    GMTrace.i(3262296096768L, 24306);
    int j = 0;
    int k = this.tl & 0x70;
    Layout localLayout = this.whg;
    int i = j;
    int m;
    int n;
    if (k != 48)
    {
      m = getMeasuredHeight() - getExtendedPaddingTop() - getExtendedPaddingBottom();
      n = localLayout.getHeight();
      i = j;
      if (n < m) {
        if (k != 80) {
          break label88;
        }
      }
    }
    label88:
    for (i = m - n;; i = m - n >> 1)
    {
      GMTrace.o(3262296096768L, 24306);
      return i;
    }
  }
  
  private void caJ()
  {
    GMTrace.i(3262832967680L, 24310);
    if (((this.whg instanceof BoringLayout)) && (this.whr == null)) {
      this.whr = ((BoringLayout)this.whg);
    }
    this.whg = null;
    GMTrace.o(3262832967680L, 24310);
  }
  
  private void caK()
  {
    GMTrace.i(3262967185408L, 24311);
    if (this.whn) {}
    for (int i = this.ia - getCompoundPaddingLeft() - getCompoundPaddingRight();; i = getRight() - getLeft() - getCompoundPaddingLeft() - getCompoundPaddingRight())
    {
      int j = i;
      if (i <= 0) {
        j = 0;
      }
      ep(j, j);
      GMTrace.o(3262967185408L, 24311);
      return;
    }
  }
  
  private void caL()
  {
    GMTrace.i(3263369838592L, 24314);
    if (this.wht == 0) {
      this.wht = ((int)(Math.ceil(this.whu.descent - this.whu.ascent) + 2.0D));
    }
    GMTrace.o(3263369838592L, 24314);
  }
  
  private void ep(int paramInt1, int paramInt2)
  {
    GMTrace.i(3263101403136L, 24312);
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    for (;;)
    {
      Layout.Alignment localAlignment;
      switch (this.tl & 0x7)
      {
      default: 
        localAlignment = Layout.Alignment.ALIGN_NORMAL;
        if ((this.whc == null) || (this.whf != null)) {
          break;
        }
      }
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label153;
        }
        this.whg = new StaticLayout(this.whd, 0, this.whd.length(), this.fB, paramInt1, localAlignment, this.whh, this.whi, this.whq, this.whc, paramInt2);
        GMTrace.o(3263101403136L, 24312);
        return;
        localAlignment = Layout.Alignment.ALIGN_CENTER;
        break;
        localAlignment = Layout.Alignment.ALIGN_OPPOSITE;
        break;
      }
      label153:
      this.whg = new StaticLayout(this.whd, this.fB, paramInt1, localAlignment, this.whh, this.whi, this.whq);
      GMTrace.o(3263101403136L, 24312);
      return;
    }
  }
  
  private int getCompoundPaddingBottom()
  {
    GMTrace.i(3260551266304L, 24293);
    b localb = this.whx;
    if ((localb == null) || (localb.whN == null) || (!this.whB))
    {
      i = getPaddingBottom();
      GMTrace.o(3260551266304L, 24293);
      return i;
    }
    int i = getPaddingBottom();
    int j = localb.whY;
    int k = localb.whR;
    GMTrace.o(3260551266304L, 24293);
    return k + (i + j);
  }
  
  private int getCompoundPaddingLeft()
  {
    GMTrace.i(3260685484032L, 24294);
    b localb = this.whx;
    if ((localb == null) || (localb.whO == null) || (!this.why))
    {
      i = getPaddingLeft();
      GMTrace.o(3260685484032L, 24294);
      return i;
    }
    int i = getPaddingLeft();
    int j = localb.whY;
    int k = localb.whS;
    GMTrace.o(3260685484032L, 24294);
    return k + (i + j);
  }
  
  private int getCompoundPaddingRight()
  {
    GMTrace.i(3260819701760L, 24295);
    b localb = this.whx;
    if ((localb == null) || (localb.whP == null) || (!this.whz))
    {
      i = getPaddingRight();
      GMTrace.o(3260819701760L, 24295);
      return i;
    }
    int i = getPaddingRight();
    int j = localb.whY;
    int k = localb.whT;
    GMTrace.o(3260819701760L, 24295);
    return k + (i + j);
  }
  
  private int getCompoundPaddingTop()
  {
    GMTrace.i(3260417048576L, 24292);
    b localb = this.whx;
    if ((localb == null) || (localb.whM == null) || (!this.whA))
    {
      i = getPaddingTop();
      GMTrace.o(3260417048576L, 24292);
      return i;
    }
    int i = getPaddingTop();
    int j = localb.whY;
    int k = localb.whQ;
    GMTrace.o(3260417048576L, 24292);
    return k + (i + j);
  }
  
  private int getExtendedPaddingBottom()
  {
    GMTrace.i(3261088137216L, 24297);
    if ((this.whg == null) || (this.whk != 1))
    {
      i = getCompoundPaddingBottom();
      GMTrace.o(3261088137216L, 24297);
      return i;
    }
    if (this.whg.getLineCount() <= this.whj)
    {
      i = getCompoundPaddingBottom();
      GMTrace.o(3261088137216L, 24297);
      return i;
    }
    int j = getCompoundPaddingTop();
    int i = getCompoundPaddingBottom();
    j = getHeight() - j - i;
    int k = this.whg.getLineTop(this.whj);
    if (k >= j)
    {
      GMTrace.o(3261088137216L, 24297);
      return i;
    }
    int m = this.tl & 0x70;
    if (m == 48)
    {
      GMTrace.o(3261088137216L, 24297);
      return i + j - k;
    }
    if (m == 80)
    {
      GMTrace.o(3261088137216L, 24297);
      return i;
    }
    j = (j - k) / 2;
    GMTrace.o(3261088137216L, 24297);
    return i + j;
  }
  
  private int getExtendedPaddingTop()
  {
    GMTrace.i(3260953919488L, 24296);
    if ((this.whg == null) || (this.whk != 1))
    {
      i = getCompoundPaddingTop();
      GMTrace.o(3260953919488L, 24296);
      return i;
    }
    if (this.whg.getLineCount() <= this.whj)
    {
      i = getCompoundPaddingTop();
      GMTrace.o(3260953919488L, 24296);
      return i;
    }
    int i = getCompoundPaddingTop();
    int j = getCompoundPaddingBottom();
    j = getHeight() - i - j;
    int k = this.whg.getLineTop(this.whj);
    if (k >= j)
    {
      GMTrace.o(3260953919488L, 24296);
      return i;
    }
    int m = this.tl & 0x70;
    if (m == 48)
    {
      GMTrace.o(3260953919488L, 24296);
      return i;
    }
    if (m == 80)
    {
      GMTrace.o(3260953919488L, 24296);
      return i + j - k;
    }
    j = (j - k) / 2;
    GMTrace.o(3260953919488L, 24296);
    return i + j;
  }
  
  private void updateTextColors()
  {
    int i = 0;
    GMTrace.i(3261893443584L, 24303);
    int j = this.dr.getColorForState(getDrawableState(), 0);
    if (j != this.wgZ)
    {
      this.wgZ = j;
      i = 1;
    }
    if (i != 0) {
      invalidate();
    }
    GMTrace.o(3261893443584L, 24303);
  }
  
  public final void Cf(int paramInt)
  {
    GMTrace.i(3259745959936L, 24287);
    if (paramInt != this.whC)
    {
      this.whC = paramInt;
      Drawable localDrawable = getResources().getDrawable(paramInt);
      if ((localDrawable != null) && ((this.whx == null) || (this.whx.whO != localDrawable)))
      {
        localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
        a(localDrawable, null);
      }
    }
    GMTrace.o(3259745959936L, 24287);
  }
  
  public final void Cg(int paramInt)
  {
    GMTrace.i(3259880177664L, 24288);
    if (paramInt != this.whD)
    {
      this.whD = paramInt;
      Drawable localDrawable = getResources().getDrawable(paramInt);
      if ((localDrawable != null) && ((this.whx == null) || (this.whx.whP != localDrawable)))
      {
        localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
        a(null, localDrawable);
      }
    }
    GMTrace.o(3259880177664L, 24288);
  }
  
  public final void J(float paramFloat)
  {
    GMTrace.i(3261356572672L, 24299);
    Object localObject = getContext();
    if (localObject == null) {}
    for (localObject = Resources.getSystem();; localObject = ((Context)localObject).getResources())
    {
      paramFloat = TypedValue.applyDimension(0, paramFloat, ((Resources)localObject).getDisplayMetrics());
      if (paramFloat != this.fB.getTextSize())
      {
        this.fB.setTextSize(paramFloat);
        this.whu = this.fB.getFontMetricsInt();
        this.wht = ((int)(Math.ceil(this.whu.descent - this.whu.ascent) + 2.0D));
        if (this.whg != null)
        {
          caJ();
          requestLayout();
          invalidate();
        }
      }
      GMTrace.o(3261356572672L, 24299);
      return;
    }
  }
  
  public final void cag()
  {
    GMTrace.i(3263504056320L, 24315);
    this.weH = true;
    this.whl = 1;
    this.whj = 1;
    this.whm = 1;
    this.whk = 1;
    requestLayout();
    invalidate();
    GMTrace.o(3263504056320L, 24315);
  }
  
  protected int computeHorizontalScrollRange()
  {
    GMTrace.i(3263772491776L, 24317);
    if (this.whg != null)
    {
      i = this.whg.getWidth();
      GMTrace.o(3263772491776L, 24317);
      return i;
    }
    int i = super.computeHorizontalScrollRange();
    GMTrace.o(3263772491776L, 24317);
    return i;
  }
  
  protected int computeVerticalScrollExtent()
  {
    GMTrace.i(3264040927232L, 24319);
    int i = getHeight();
    int j = getCompoundPaddingTop();
    int k = getCompoundPaddingBottom();
    GMTrace.o(3264040927232L, 24319);
    return i - j - k;
  }
  
  protected int computeVerticalScrollRange()
  {
    GMTrace.i(3263906709504L, 24318);
    if (this.whg != null)
    {
      i = this.whg.getHeight();
      GMTrace.o(3263906709504L, 24318);
      return i;
    }
    int i = super.computeVerticalScrollRange();
    GMTrace.o(3263906709504L, 24318);
    return i;
  }
  
  protected void drawableStateChanged()
  {
    GMTrace.i(3260014395392L, 24289);
    super.drawableStateChanged();
    if ((this.dr != null) && (this.dr.isStateful())) {
      updateTextColors();
    }
    b localb = this.whx;
    if (localb != null)
    {
      int[] arrayOfInt = getDrawableState();
      if ((localb.whM != null) && (localb.whM.isStateful())) {
        localb.whM.setState(arrayOfInt);
      }
      if ((localb.whN != null) && (localb.whN.isStateful())) {
        localb.whN.setState(arrayOfInt);
      }
      if ((localb.whO != null) && (localb.whO.isStateful())) {
        localb.whO.setState(arrayOfInt);
      }
      if ((localb.whP != null) && (localb.whP.isStateful())) {
        localb.whP.setState(arrayOfInt);
      }
    }
    GMTrace.o(3260014395392L, 24289);
  }
  
  public int getBaseline()
  {
    GMTrace.i(3262698749952L, 24309);
    if (this.whg == null)
    {
      i = super.getBaseline();
      GMTrace.o(3262698749952L, 24309);
      return i;
    }
    if ((this.tl & 0x70) != 48) {}
    for (int i = caI();; i = 0)
    {
      int j = getExtendedPaddingTop();
      int k = this.whg.getLineBaseline(0);
      GMTrace.o(3262698749952L, 24309);
      return i + j + k;
    }
  }
  
  public void getFocusedRect(Rect paramRect)
  {
    GMTrace.i(3262564532224L, 24308);
    if (this.whg == null)
    {
      super.getFocusedRect(paramRect);
      GMTrace.o(3262564532224L, 24308);
      return;
    }
    int i = Selection.getSelectionEnd(this.mText);
    if (i < 0)
    {
      super.getFocusedRect(paramRect);
      GMTrace.o(3262564532224L, 24308);
      return;
    }
    int j = this.whg.getLineForOffset(i);
    paramRect.top = this.whg.getLineTop(j);
    paramRect.bottom = this.whg.getLineBottom(j);
    paramRect.left = ((int)this.whg.getPrimaryHorizontal(i));
    paramRect.right = (paramRect.left + 1);
    int k = getCompoundPaddingLeft();
    j = getExtendedPaddingTop();
    i = j;
    if ((this.tl & 0x70) != 48) {
      i = j + caI();
    }
    paramRect.offset(k, i);
    GMTrace.o(3262564532224L, 24308);
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    GMTrace.i(3260282830848L, 24291);
    Rect localRect;
    int m;
    int k;
    b localb;
    int i;
    int j;
    int n;
    int i1;
    int i2;
    if (verifyDrawable(paramDrawable))
    {
      localRect = paramDrawable.getBounds();
      m = getScrollX();
      k = getScrollY();
      localb = this.whx;
      i = k;
      j = m;
      if (localb != null)
      {
        if (paramDrawable != localb.whO) {
          break label158;
        }
        i = getCompoundPaddingTop();
        n = getCompoundPaddingBottom();
        i1 = getBottom();
        i2 = getTop();
        j = m + getPaddingLeft();
        i = k + ((i1 - i2 - n - i - localb.whW) / 2 + i);
      }
    }
    for (;;)
    {
      invalidate(localRect.left + j, localRect.top + i, j + localRect.right, i + localRect.bottom);
      GMTrace.o(3260282830848L, 24291);
      return;
      label158:
      if (paramDrawable == localb.whP)
      {
        i = getCompoundPaddingTop();
        n = getCompoundPaddingBottom();
        i1 = getBottom();
        i2 = getTop();
        j = m + (getRight() - getLeft() - getPaddingRight() - localb.whT);
        i = k + ((i1 - i2 - n - i - localb.whX) / 2 + i);
      }
      else if (paramDrawable == localb.whM)
      {
        i = getCompoundPaddingLeft();
        j = getCompoundPaddingRight();
        j = m + ((getRight() - getLeft() - j - i - localb.whU) / 2 + i);
        i = k + getPaddingTop();
      }
      else
      {
        i = k;
        j = m;
        if (paramDrawable == localb.whN)
        {
          i = getCompoundPaddingLeft();
          j = getCompoundPaddingRight();
          j = m + (i + (getRight() - getLeft() - j - i - localb.whV) / 2);
          i = k + (getBottom() - getTop() - getPaddingBottom() - localb.whR);
        }
      }
    }
  }
  
  public final void lK(boolean paramBoolean)
  {
    GMTrace.i(3259209089024L, 24283);
    if (this.why != paramBoolean) {
      invalidate();
    }
    this.why = paramBoolean;
    GMTrace.o(3259209089024L, 24283);
  }
  
  public final void lL(boolean paramBoolean)
  {
    GMTrace.i(3259343306752L, 24284);
    if (this.whz != paramBoolean) {
      invalidate();
    }
    this.whz = paramBoolean;
    GMTrace.o(3259343306752L, 24284);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(3262430314496L, 24307);
    super.onDraw(paramCanvas);
    int m = getCompoundPaddingLeft();
    int i1 = getCompoundPaddingTop();
    int i = getCompoundPaddingRight();
    int i7 = getCompoundPaddingBottom();
    int j = getScrollX();
    int i2 = getScrollY();
    int i3 = getRight();
    int i4 = getLeft();
    int i5 = getBottom();
    int i6 = getTop();
    int k = getWidth();
    int n = getHeight();
    b localb = this.whx;
    float f2 = -1.0F;
    float f1 = f2;
    float f3;
    if (localb != null)
    {
      i7 = i5 - i6 - i7 - i1;
      int i8 = i3 - i4 - i - m;
      if ((this.why) && (localb.whO != null))
      {
        paramCanvas.save();
        paramCanvas.translate(getPaddingLeft() + j, i2 + i1 + (i7 - localb.whW) / 2);
        localb.whO.draw(paramCanvas);
        paramCanvas.restore();
      }
      f3 = f2;
      if (this.whz)
      {
        f3 = f2;
        if (localb.whP != null)
        {
          paramCanvas.save();
          if (!this.whs) {
            break label701;
          }
          f1 = this.fB.measureText(this.mText, 0, this.mText.length());
          f2 = f1;
          paramCanvas.translate(f1 + j - getPaddingRight(), i1 + i2 + (i7 - localb.whX) / 2);
          localb.whP.draw(paramCanvas);
          paramCanvas.restore();
          f3 = f2;
        }
      }
      if ((this.whA) && (localb.whM != null))
      {
        paramCanvas.save();
        paramCanvas.translate(j + m + (i8 - localb.whU) / 2, getPaddingTop() + i2);
        localb.whM.draw(paramCanvas);
        paramCanvas.restore();
      }
      f1 = f3;
      if (this.whB)
      {
        f1 = f3;
        if (localb.whN != null)
        {
          paramCanvas.save();
          paramCanvas.translate(j + m + (i8 - localb.whV) / 2, i2 + i5 - i6 - getPaddingBottom() - localb.whR);
          localb.whN.draw(paramCanvas);
          paramCanvas.restore();
          f1 = f3;
        }
      }
    }
    i1 = this.wgZ;
    this.fB.setColor(i1);
    this.fB.drawableState = getDrawableState();
    paramCanvas.save();
    i1 = getExtendedPaddingTop();
    i7 = getExtendedPaddingBottom();
    paramCanvas.clipRect(m + j, i1 + i2, i3 - i4 - i + j, i5 - i6 - i7 + i2);
    j = 0;
    i = 0;
    if ((this.tl & 0x70) != 48)
    {
      j = caI();
      i = caI();
    }
    paramCanvas.translate(m, i1 + j);
    if (this.whs)
    {
      f3 = (n - (this.whu.bottom - this.whu.top)) / 2 - this.whu.top;
      j = 0;
      i = j;
      if ((this.tl & 0x7) != 3) {}
      switch (this.tl & 0x7)
      {
      default: 
        i = j;
        label660:
        paramCanvas.drawText(this.mText, 0, this.mText.length(), i, f3, this.fB);
      }
    }
    for (;;)
    {
      paramCanvas.restore();
      GMTrace.o(3262430314496L, 24307);
      return;
      label701:
      f1 = (float)Math.ceil(Layout.getDesiredWidth(this.whd, this.fB));
      break;
      f2 = f1;
      if (f1 == -1.0F) {
        f2 = this.fB.measureText(this.mText, 0, this.mText.length());
      }
      i = (int)(k - getPaddingRight() - f2);
      break label660;
      f2 = f1;
      if (f1 == -1.0F) {
        f2 = this.fB.measureText(this.mText, 0, this.mText.length());
      }
      i = (int)(k - getPaddingRight() - f2) / 2;
      break label660;
      if (this.whg == null) {
        caK();
      }
      this.whg.draw(paramCanvas, null, null, i - j);
    }
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    GMTrace.i(3264175144960L, 24320);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    CharSequence localCharSequence2 = getContentDescription();
    CharSequence localCharSequence1 = localCharSequence2;
    if (bg.nm((String)localCharSequence2)) {
      localCharSequence1 = this.mText;
    }
    paramAccessibilityNodeInfo.setText(localCharSequence1);
    GMTrace.o(3264175144960L, 24320);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3262161879040L, 24305);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.whv) && (getMeasuredWidth() > 0))
    {
      setText(TextUtils.ellipsize(this.mText, this.fB, getMeasuredWidth() - getCompoundPaddingRight() - getCompoundPaddingLeft(), TextUtils.TruncateAt.END));
      this.whv = false;
    }
    GMTrace.o(3262161879040L, 24305);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3263235620864L, 24313);
    View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    if (k == 0)
    {
      setMeasuredDimension(k, this.wht);
      GMTrace.o(3263235620864L, 24313);
      return;
    }
    if (this.whs)
    {
      if (this.wht == 0) {
        caL();
      }
      setMeasuredDimension(k, this.wht);
      GMTrace.o(3263235620864L, 24313);
      return;
    }
    paramInt1 = getCompoundPaddingLeft() + getCompoundPaddingRight();
    if (this.whn)
    {
      paramInt1 = this.ia - paramInt1;
      if (this.whg != null) {
        break label179;
      }
      ep(paramInt1, paramInt1);
      label132:
      if (m != 1073741824) {
        break label210;
      }
      this.whp = -1;
      paramInt1 = j;
    }
    label179:
    label208:
    label210:
    Layout localLayout;
    for (;;)
    {
      scrollTo(0, 0);
      setMeasuredDimension(k, paramInt1);
      GMTrace.o(3263235620864L, 24313);
      return;
      paramInt1 = k - paramInt1;
      break;
      if (this.whg.getWidth() != paramInt1) {}
      for (paramInt2 = 1;; paramInt2 = 0)
      {
        if (paramInt2 == 0) {
          break label208;
        }
        ep(paramInt1, paramInt1);
        break;
      }
      break label132;
      localLayout = this.whg;
      if (localLayout != null) {
        break label248;
      }
      paramInt2 = 0;
      this.whp = paramInt2;
      paramInt1 = paramInt2;
      if (m == Integer.MIN_VALUE) {
        paramInt1 = Math.min(paramInt2, j);
      }
    }
    label248:
    paramInt2 = localLayout.getLineCount();
    paramInt1 = getCompoundPaddingTop();
    int n = getCompoundPaddingBottom() + paramInt1;
    paramInt1 = localLayout.getLineTop(paramInt2) + n;
    int i;
    if (this.whk == 1)
    {
      i = paramInt2;
      if (paramInt2 > this.whj)
      {
        paramInt1 = localLayout.getLineTop(this.whj) + localLayout.getBottomPadding() + n;
        i = this.whj;
      }
      label319:
      if (this.whm != 1) {
        break label397;
      }
      paramInt2 = paramInt1;
      if (i < this.whl) {
        paramInt2 = Math.round(this.fB.getFontMetricsInt(null) * this.whh + this.whi);
      }
    }
    label397:
    for (paramInt2 = paramInt1 + (this.whl - i) * paramInt2;; paramInt2 = Math.max(paramInt1, this.whl))
    {
      paramInt2 = Math.max(paramInt2, getSuggestedMinimumHeight());
      break;
      paramInt1 = Math.min(paramInt1, this.whj);
      i = paramInt2;
      break label319;
    }
  }
  
  public final void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    GMTrace.i(3263638274048L, 24316);
    this.whc = paramTruncateAt;
    if (this.whg != null)
    {
      caJ();
      requestLayout();
      invalidate();
    }
    GMTrace.o(3263638274048L, 24316);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3261222354944L, 24298);
    if ((paramInt1 != getPaddingLeft()) || (paramInt3 != getPaddingRight()) || (paramInt2 != getPaddingTop()) || (paramInt4 != getPaddingBottom())) {
      caJ();
    }
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    invalidate();
    GMTrace.o(3261222354944L, 24298);
  }
  
  public final void setText(CharSequence paramCharSequence)
  {
    GMTrace.i(3262027661312L, 24304);
    int k = this.whe;
    Object localObject = paramCharSequence;
    if (paramCharSequence == null) {
      localObject = "";
    }
    if (!localObject.equals(this.mText))
    {
      label76:
      int i;
      int j;
      if ((localObject instanceof Spanned))
      {
        this.whs = false;
        if ((k != a.whJ) && (this.whf == null)) {
          break label197;
        }
        paramCharSequence = this.wha.newEditable((CharSequence)localObject);
        i = getCompoundPaddingRight();
        j = getCompoundPaddingLeft() + i;
        localObject = paramCharSequence;
        if (this.whw)
        {
          if (!this.whn) {
            break label221;
          }
          i = this.ia;
          if (getMeasuredWidth() > 0) {
            i = Math.min(this.ia, getMeasuredWidth());
          }
          localObject = TextUtils.ellipsize(paramCharSequence, this.fB, i - j, TextUtils.TruncateAt.END);
        }
      }
      for (;;)
      {
        this.whe = k;
        this.mText = ((CharSequence)localObject);
        this.whd = ((CharSequence)localObject);
        if (!this.whs) {
          break label262;
        }
        caL();
        invalidate();
        GMTrace.o(3262027661312L, 24304);
        return;
        this.whs = true;
        break;
        label197:
        paramCharSequence = (CharSequence)localObject;
        if (k != a.whI) {
          break label76;
        }
        paramCharSequence = this.whb.newSpannable((CharSequence)localObject);
        break label76;
        label221:
        if (getMeasuredWidth() > 0)
        {
          localObject = TextUtils.ellipsize(paramCharSequence, this.fB, getMeasuredWidth() - j, TextUtils.TruncateAt.END);
        }
        else
        {
          this.whv = true;
          localObject = paramCharSequence;
        }
      }
      label262:
      if (getWidth() != 0)
      {
        if (this.whg == null)
        {
          caK();
          if (this.whg.getHeight() != getHeight()) {
            requestLayout();
          }
          invalidate();
          GMTrace.o(3262027661312L, 24304);
          return;
        }
        i = this.whg.getHeight();
        k = this.whg.getWidth();
        ep(k, k - j);
        if (this.whc != TextUtils.TruncateAt.MARQUEE)
        {
          if ((getLayoutParams().height != -2) && (getLayoutParams().height != -1))
          {
            invalidate();
            GMTrace.o(3262027661312L, 24304);
            return;
          }
          j = this.whg.getHeight();
          if ((j == i) && (j == getHeight()))
          {
            invalidate();
            GMTrace.o(3262027661312L, 24304);
            return;
          }
        }
      }
      requestLayout();
      invalidate();
    }
    GMTrace.o(3262027661312L, 24304);
  }
  
  public final void setTextColor(int paramInt)
  {
    GMTrace.i(3261490790400L, 24300);
    this.dr = ColorStateList.valueOf(paramInt);
    updateTextColors();
    GMTrace.o(3261490790400L, 24300);
  }
  
  public final void setTextColor(ColorStateList paramColorStateList)
  {
    GMTrace.i(3261625008128L, 24301);
    if (paramColorStateList == null) {
      throw new NullPointerException();
    }
    if (this.dr == paramColorStateList)
    {
      GMTrace.o(3261625008128L, 24301);
      return;
    }
    this.dr = paramColorStateList;
    updateTextColors();
    GMTrace.o(3261625008128L, 24301);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    GMTrace.i(3260148613120L, 24290);
    boolean bool = super.verifyDrawable(paramDrawable);
    if ((!bool) && (this.whx != null))
    {
      if ((paramDrawable == this.whx.whO) || (paramDrawable == this.whx.whM) || (paramDrawable == this.whx.whP) || (paramDrawable == this.whx.whN))
      {
        GMTrace.o(3260148613120L, 24290);
        return true;
      }
      GMTrace.o(3260148613120L, 24290);
      return false;
    }
    GMTrace.o(3260148613120L, 24290);
    return bool;
  }
  
  public final void xS()
  {
    GMTrace.i(3261759225856L, 24302);
    int i = 0;
    if (5 != (this.tl & 0x7)) {
      i = 1;
    }
    if (53 != this.tl) {
      invalidate();
    }
    this.tl = 53;
    if ((this.whg != null) && (i != 0)) {
      ep(this.whg.getWidth(), getWidth() - getCompoundPaddingLeft() - getCompoundPaddingRight());
    }
    GMTrace.o(3261759225856L, 24302);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(3294374133760L, 24545);
      whH = 1;
      whI = 2;
      whJ = 3;
      whK = new int[] { whH, whI, whJ };
      GMTrace.o(3294374133760L, 24545);
    }
  }
  
  final class b
  {
    final Rect whL;
    Drawable whM;
    Drawable whN;
    Drawable whO;
    Drawable whP;
    int whQ;
    int whR;
    int whS;
    int whT;
    int whU;
    int whV;
    int whW;
    int whX;
    int whY;
    
    b()
    {
      GMTrace.i(3335981629440L, 24855);
      this.whL = new Rect();
      GMTrace.o(3335981629440L, 24855);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\NoMeasuredTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */