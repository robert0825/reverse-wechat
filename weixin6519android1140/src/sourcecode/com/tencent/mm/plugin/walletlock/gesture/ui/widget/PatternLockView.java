package com.tencent.mm.plugin.walletlock.gesture.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.walletlock.a.c;
import com.tencent.mm.plugin.walletlock.a.h;
import com.tencent.mm.plugin.walletlock.gesture.a.f;
import com.tencent.mm.sdk.platformtools.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatternLockView
  extends View
{
  private static Bitmap ryA;
  private static Bitmap ryB;
  private static Bitmap ryy;
  private static Bitmap ryz;
  private int kKq;
  private float ryC;
  private float ryD;
  private boolean ryE;
  private long ryF;
  private float ryG;
  private float ryH;
  public a ryI;
  private Paint ryi;
  private Paint ryj;
  private Path ryk;
  private Matrix ryl;
  private Rect rym;
  private Rect ryn;
  private ArrayList<f> ryo;
  private boolean[][] ryp;
  private int ryq;
  private int ryr;
  private int rys;
  private float ryt;
  private boolean ryu;
  private boolean ryv;
  public boolean ryw;
  private b ryx;
  private int ts;
  private int tt;
  
  static
  {
    GMTrace.i(20226477391872L, 150699);
    ryy = null;
    ryz = null;
    ryA = null;
    ryB = null;
    GMTrace.o(20226477391872L, 150699);
  }
  
  public PatternLockView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20223658819584L, 150678);
    this.ryi = new Paint();
    this.ryj = new Paint();
    this.ryk = new Path();
    this.ryl = new Matrix();
    this.rym = new Rect();
    this.ryn = new Rect();
    this.ryo = new ArrayList(9);
    this.ryp = ((boolean[][])Array.newInstance(Boolean.TYPE, new int[] { 3, 3 }));
    this.ryq = c.ryQ;
    this.ryr = 6;
    this.rys = 200;
    this.ryt = 0.66F;
    this.ryu = false;
    this.ryv = true;
    this.ryw = false;
    int i;
    if (isInEditMode())
    {
      i = -1;
      this.kKq = i;
      this.ryx = b.ryK;
      this.ryC = -1.0F;
      this.ryD = -1.0F;
      this.ryE = false;
      this.ryF = 0L;
      this.ts = 0;
      this.tt = 0;
      this.ryG = 0.0F;
      this.ryH = 0.0F;
      this.ryI = null;
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.h.rwY);
      this.ryv = paramContext.getBoolean(a.h.rxd, this.ryv);
      this.rys = paramContext.getInt(a.h.rxa, this.rys);
      this.ryr = paramContext.getInt(a.h.rxb, this.ryr);
      this.ryu = paramContext.getBoolean(a.h.rwZ, this.ryu);
      switch (paramContext.getInt(a.h.rxc, this.ryq - 1))
      {
      default: 
        this.ryq = c.ryQ;
      }
    }
    for (;;)
    {
      paramContext.recycle();
      setClickable(true);
      this.ryj.setStyle(Paint.Style.STROKE);
      this.ryj.setStrokeJoin(Paint.Join.ROUND);
      this.ryj.setStrokeCap(Paint.Cap.ROUND);
      this.ryj.setAntiAlias(true);
      this.ryj.setDither(false);
      this.ryj.setAlpha(this.rys);
      this.ryi.setAntiAlias(true);
      this.ryi.setDither(true);
      if (isInEditMode()) {
        break label629;
      }
      if (ryy == null)
      {
        ryy = s(a.b(getContext(), a.c.rvO));
        paramContext = s(a.b(getContext(), a.c.rvP));
        ryz = paramContext;
        ryA = paramContext;
        ryB = s(a.b(getContext(), a.c.rvQ));
      }
      this.ryr = ((int)(this.ryr * d.bPv().density));
      paramContext = ryy;
      paramAttributeSet = ryz;
      Bitmap localBitmap1 = ryA;
      Bitmap localBitmap2 = ryB;
      i = 0;
      while (i < 4)
      {
        Bitmap localBitmap3 = new Bitmap[] { paramContext, paramAttributeSet, localBitmap1, localBitmap2 }[i];
        this.ts = Math.max(localBitmap3.getWidth(), this.ts);
        this.tt = Math.max(localBitmap3.getHeight(), this.tt);
        i += 1;
      }
      i = getResources().getColor(a.b.rvK);
      break;
      this.ryq = c.ryQ;
      continue;
      this.ryq = c.ryR;
    }
    label629:
    GMTrace.o(20223658819584L, 150678);
  }
  
  private f E(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(20225269432320L, 150690);
    Object localObject2 = null;
    float f1 = this.ryH;
    float f2 = f1 * this.ryt;
    float f3 = getPaddingTop();
    float f4 = (f1 - f2) / 2.0F;
    int i = 0;
    int j;
    label83:
    Object localObject1;
    if (i < 3)
    {
      float f5 = i * f1 + (f4 + f3);
      if ((paramFloat2 >= f5) && (paramFloat2 <= f5 + f2))
      {
        j = i;
        localObject1 = localObject2;
        if (j >= 0)
        {
          paramFloat2 = this.ryG;
          f1 = paramFloat2 * this.ryt;
          f2 = getPaddingLeft();
          f3 = (paramFloat2 - f1) / 2.0F;
          i = 0;
          label121:
          if (i >= 3) {
            break label292;
          }
          f4 = i * paramFloat2 + (f3 + f2);
          if ((paramFloat1 < f4) || (paramFloat1 > f4 + f1)) {
            break label283;
          }
        }
      }
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (i >= 0)
      {
        localObject1 = localObject2;
        if (this.ryp[j][i] == 0) {
          localObject1 = f.dz(j, i);
        }
      }
      if (localObject1 == null) {
        break label298;
      }
      this.ryp[localObject1.rxD][localObject1.rxE] = 1;
      this.ryo.add(localObject1);
      if (this.ryI != null) {
        new ArrayList(this.ryo);
      }
      if (this.ryu) {
        performHapticFeedback(1, 3);
      }
      GMTrace.o(20225269432320L, 150690);
      return (f)localObject1;
      i += 1;
      break;
      j = -1;
      break label83;
      label283:
      i += 1;
      break label121;
      label292:
      i = -1;
    }
    label298:
    GMTrace.o(20225269432320L, 150690);
    return null;
  }
  
  private void a(Canvas paramCanvas, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(20225135214592L, 150689);
    Bitmap localBitmap;
    if ((!paramBoolean) || ((!this.ryv) && (this.ryx != b.ryL))) {
      localBitmap = ryy;
    }
    for (;;)
    {
      int j = this.ts;
      int i = this.tt;
      float f1 = this.ryG;
      float f2 = this.ryH;
      j = (int)((f1 - j) * 0.5F);
      i = (int)((f2 - i) * 0.5F);
      f2 = getResources().getDisplayMetrics().density;
      f1 = Math.min((this.ryG - 33.0F * f2) / this.ts, 1.0F);
      f2 = Math.min((this.ryH - f2 * 33.0F) / this.tt, 1.0F);
      this.ryl.setTranslate(j + paramInt1, i + paramInt2);
      this.ryl.preTranslate(this.ts / 2, this.tt / 2);
      this.ryl.preScale(f1, f2);
      this.ryl.preTranslate(-this.ts / 2, -this.tt / 2);
      if (!isInEditMode()) {
        paramCanvas.drawBitmap(localBitmap, this.ryl, this.ryi);
      }
      GMTrace.o(20225135214592L, 150689);
      return;
      if (this.ryE)
      {
        localBitmap = ryz;
      }
      else if (this.ryx == b.ryL)
      {
        localBitmap = ryB;
      }
      else
      {
        if ((this.ryx != b.ryK) && (this.ryx != b.ryM)) {
          break;
        }
        localBitmap = ryA;
      }
    }
    throw new IllegalStateException("unknown display mode " + this.ryx);
  }
  
  private void a(b paramb, List<f> paramList)
  {
    GMTrace.i(20225940520960L, 150695);
    this.ryo.clear();
    bAV();
    this.ryo.addAll(paramList);
    paramList = this.ryo.iterator();
    while (paramList.hasNext())
    {
      f localf = (f)paramList.next();
      this.ryp[localf.rxD][localf.rxE] = 1;
    }
    a(paramb);
    GMTrace.o(20225940520960L, 150695);
  }
  
  private void bAV()
  {
    GMTrace.i(20225537867776L, 150692);
    int i = 0;
    while (i < 3)
    {
      int j = 0;
      while (j < 3)
      {
        this.ryp[i][j] = 0;
        j += 1;
      }
      i += 1;
    }
    GMTrace.o(20225537867776L, 150692);
  }
  
  private void bAW()
  {
    GMTrace.i(20226074738688L, 150696);
    this.ryo.clear();
    bAV();
    this.ryx = b.ryK;
    invalidate();
    GMTrace.o(20226074738688L, 150696);
  }
  
  private static String bQ(List<f> paramList)
  {
    GMTrace.i(20223927255040L, 150680);
    if (paramList == null) {
      throw new IllegalArgumentException("pattern is null");
    }
    int j = paramList.size();
    byte[] arrayOfByte = new byte[j];
    int i = 0;
    while (i < j)
    {
      f localf = (f)paramList.get(i);
      int k = localf.rxD;
      arrayOfByte[i] = ((byte)(localf.rxE + k * 3));
      i += 1;
    }
    paramList = new String(arrayOfByte);
    GMTrace.o(20223927255040L, 150680);
    return paramList;
  }
  
  private static int dA(int paramInt1, int paramInt2)
  {
    GMTrace.i(20224732561408L, 150686);
    int j = View.MeasureSpec.getSize(paramInt1);
    int i = paramInt2;
    switch (View.MeasureSpec.getMode(paramInt1))
    {
    }
    for (i = j;; i = Math.max(j, paramInt2))
    {
      GMTrace.o(20224732561408L, 150686);
      return i;
    }
  }
  
  private static Bitmap s(Drawable paramDrawable)
  {
    GMTrace.i(20223793037312L, 150679);
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if (paramDrawable.getOpacity() != -1) {}
    for (Object localObject = Bitmap.Config.ARGB_8888;; localObject = Bitmap.Config.RGB_565)
    {
      localObject = Bitmap.createBitmap(i, j, (Bitmap.Config)localObject);
      Canvas localCanvas = new Canvas((Bitmap)localObject);
      paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
      paramDrawable.draw(localCanvas);
      GMTrace.o(20223793037312L, 150679);
      return (Bitmap)localObject;
    }
  }
  
  private float xf(int paramInt)
  {
    GMTrace.i(20225672085504L, 150693);
    float f1 = getPaddingLeft();
    float f2 = paramInt;
    float f3 = this.ryG;
    float f4 = this.ryG;
    GMTrace.o(20225672085504L, 150693);
    return f1 + f2 * f3 + f4 * 0.5F;
  }
  
  private float xg(int paramInt)
  {
    GMTrace.i(20225806303232L, 150694);
    float f1 = getPaddingTop();
    float f2 = paramInt;
    float f3 = this.ryH;
    float f4 = this.ryH;
    GMTrace.o(20225806303232L, 150694);
    return f1 + f2 * f3 + f4 * 0.5F;
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(20226343174144L, 150698);
    switch (1.ryJ[paramb.ordinal()])
    {
    }
    for (;;)
    {
      this.ryx = paramb;
      invalidate();
      GMTrace.o(20226343174144L, 150698);
      return;
      this.kKq = getResources().getColor(a.b.rvK);
      continue;
      this.kKq = getResources().getColor(a.b.rvN);
      continue;
      if (this.ryo.size() == 0) {
        throw new IllegalStateException("You should set a pattern before animating.");
      }
      this.ryw = false;
      this.kKq = getResources().getColor(a.b.rvK);
      f localf = (f)this.ryo.get(0);
      this.ryC = xf(localf.rxE);
      this.ryD = xg(localf.rxD);
      bAV();
      this.ryF = SystemClock.elapsedRealtime();
    }
  }
  
  public final void bAX()
  {
    GMTrace.i(20226208956416L, 150697);
    bAW();
    if (this.ryI != null) {
      this.ryI.a(this);
    }
    GMTrace.o(20226208956416L, 150697);
  }
  
  protected int getSuggestedMinimumHeight()
  {
    GMTrace.i(20224464125952L, 150684);
    float f = getResources().getDisplayMetrics().density;
    int i = (int)(3.0D * this.tt / f);
    GMTrace.o(20224464125952L, 150684);
    return i;
  }
  
  protected int getSuggestedMinimumWidth()
  {
    GMTrace.i(20224329908224L, 150683);
    float f = getResources().getDisplayMetrics().density;
    int i = (int)(3.0D * this.ts / f);
    GMTrace.o(20224329908224L, 150683);
    return i;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(20225000996864L, 150688);
    ArrayList localArrayList = this.ryo;
    int m = localArrayList.size();
    boolean[][] arrayOfBoolean = this.ryp;
    int j;
    int k;
    Object localObject;
    float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    label301:
    int n;
    int i1;
    boolean bool;
    if (this.ryx == b.ryM)
    {
      j = (int)(SystemClock.elapsedRealtime() - this.ryF) % ((m + 1) * 700);
      k = j / 700;
      bAV();
      i = 0;
      while (i < k)
      {
        localObject = (f)localArrayList.get(i);
        arrayOfBoolean[localObject.rxD][localObject.rxE] = 1;
        i += 1;
      }
      if ((k > 0) && (k < m))
      {
        i = 1;
        if (i != 0)
        {
          f1 = j % 700 / 700.0F;
          localObject = (f)localArrayList.get(k - 1);
          f2 = xf(((f)localObject).rxE);
          f3 = xg(((f)localObject).rxD);
          localObject = (f)localArrayList.get(k);
          f4 = xf(((f)localObject).rxE);
          f5 = xg(((f)localObject).rxD);
          this.ryC = (f2 + (f4 - f2) * f1);
          this.ryD = ((f5 - f3) * f1 + f3);
        }
        invalidate();
      }
    }
    else
    {
      this.ryj.setColor(this.kKq);
      this.ryj.setStrokeWidth(this.ryr);
      localObject = this.ryk;
      ((Path)localObject).rewind();
      if ((!this.ryv) && (this.ryx != b.ryL)) {
        break label439;
      }
      i = 1;
      n = getPaddingTop();
      i1 = getPaddingLeft();
      f1 = this.ryG;
      f2 = this.ryH;
      if ((this.ryi.getFlags() & 0x2) == 0) {
        break label445;
      }
      bool = true;
      label338:
      this.ryi.setFilterBitmap(true);
      j = 0;
    }
    float f6;
    for (;;)
    {
      if (j >= 3) {
        break label460;
      }
      f3 = n;
      f4 = j;
      k = 0;
      for (;;)
      {
        if (k < 3)
        {
          f5 = i1;
          f6 = k;
          if (arrayOfBoolean[j][k] == 0) {
            a(paramCanvas, (int)(f5 + f6 * f1), (int)(f4 * f2 + f3), arrayOfBoolean[j][k]);
          }
          k += 1;
          continue;
          i = 0;
          break;
          label439:
          i = 0;
          break label301;
          label445:
          bool = false;
          break label338;
        }
      }
      j += 1;
    }
    label460:
    if (i != 0)
    {
      j = 0;
      i = 0;
      if (i < m)
      {
        f localf = (f)localArrayList.get(i);
        if (arrayOfBoolean[localf.rxD][localf.rxE] != 0)
        {
          j = 1;
          f3 = xf(localf.rxE);
          f4 = xg(localf.rxD);
          if (i == 0) {
            ((Path)localObject).moveTo(f3, f4);
          }
          for (;;)
          {
            i += 1;
            break;
            ((Path)localObject).lineTo(f3, f4);
          }
        }
      }
      if (((this.ryE) || (this.ryx == b.ryM)) && (j != 0)) {
        ((Path)localObject).lineTo(this.ryC, this.ryD);
      }
      paramCanvas.drawPath((Path)localObject, this.ryj);
    }
    int i = 0;
    while (i < 3)
    {
      f3 = n;
      f4 = i;
      j = 0;
      while (j < 3)
      {
        f5 = i1;
        f6 = j;
        if (arrayOfBoolean[i][j] != 0) {
          a(paramCanvas, (int)(f5 + f6 * f1), (int)(f4 * f2 + f3), arrayOfBoolean[i][j]);
        }
        j += 1;
      }
      i += 1;
    }
    this.ryi.setFilterBitmap(bool);
    GMTrace.o(20225000996864L, 150688);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(20224866779136L, 150687);
    int i = getSuggestedMinimumWidth();
    int j = getSuggestedMinimumHeight();
    i = dA(paramInt1, i);
    j = dA(paramInt2, j);
    paramInt2 = j;
    paramInt1 = i;
    if (this.ryq == c.ryQ)
    {
      paramInt2 = Math.min(i, j);
      paramInt1 = paramInt2;
    }
    setMeasuredDimension(paramInt1, paramInt2);
    GMTrace.o(20224866779136L, 150687);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(20224195690496L, 150682);
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    b localb = b.ryK;
    Object localObject = paramParcelable.ryO;
    if (localObject == null) {
      throw new IllegalArgumentException("Serialized pattern is null");
    }
    ArrayList localArrayList = new ArrayList();
    localObject = ((String)localObject).getBytes();
    int i = 0;
    while (i < localObject.length)
    {
      int j = localObject[i];
      localArrayList.add(f.dz(j / 3, j % 3));
      i += 1;
    }
    a(localb, localArrayList);
    this.ryx = b.values()[paramParcelable.ryP];
    this.ryv = paramParcelable.ryv;
    this.ryw = paramParcelable.ryw;
    this.ryu = paramParcelable.ryu;
    GMTrace.o(20224195690496L, 150682);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    GMTrace.i(20224061472768L, 150681);
    SavedState localSavedState = new SavedState(super.onSaveInstanceState(), bQ(this.ryo), this.ryx.ordinal(), this.ryv, this.ryw, this.ryu);
    GMTrace.o(20224061472768L, 150681);
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20224598343680L, 150685);
    this.ryG = ((paramInt1 - getPaddingLeft() - getPaddingRight()) / 3.0F);
    this.ryH = ((paramInt2 - getPaddingTop() - getPaddingBottom()) / 3.0F);
    GMTrace.o(20224598343680L, 150685);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(20225403650048L, 150691);
    if ((!this.ryw) || (!isEnabled()))
    {
      GMTrace.o(20225403650048L, 150691);
      return false;
    }
    float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    float f6;
    int j;
    int i;
    switch (paramMotionEvent.getAction())
    {
    default: 
      GMTrace.o(20225403650048L, 150691);
      return false;
    case 0: 
      bAW();
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      paramMotionEvent = E(f1, f2);
      if (paramMotionEvent != null)
      {
        this.ryE = true;
        this.ryx = b.ryK;
        if (this.ryI == null) {}
      }
      for (;;)
      {
        if (paramMotionEvent != null)
        {
          f3 = xf(paramMotionEvent.rxE);
          f4 = xg(paramMotionEvent.rxD);
          f5 = this.ryG * 0.5F;
          f6 = this.ryH * 0.5F;
          invalidate((int)(f3 - f5), (int)(f4 - f6), (int)(f3 + f5), (int)(f4 + f6));
        }
        this.ryC = f1;
        this.ryD = f2;
        GMTrace.o(20225403650048L, 150691);
        return true;
        this.ryE = false;
      }
    case 1: 
      if (!this.ryo.isEmpty())
      {
        this.ryE = false;
        if (this.ryI != null) {
          this.ryI.a(this, new ArrayList(this.ryo));
        }
        invalidate();
      }
      GMTrace.o(20225403650048L, 150691);
      return true;
    case 2: 
      float f7 = this.ryr;
      int k = paramMotionEvent.getHistorySize();
      this.rym.setEmpty();
      j = 0;
      i = 0;
      if (i < k + 1) {
        if (i < k)
        {
          f1 = paramMotionEvent.getHistoricalX(i);
          label331:
          if (i >= k) {
            break label643;
          }
          f2 = paramMotionEvent.getHistoricalY(i);
          label345:
          f localf1 = E(f1, f2);
          int m = this.ryo.size();
          if ((localf1 != null) && (m == 1)) {
            this.ryE = true;
          }
          f3 = Math.abs(f1 - this.ryC);
          f4 = Math.abs(f2 - this.ryD);
          if ((f3 > 0.0F) || (f4 > 0.0F)) {
            j = 1;
          }
          if ((this.ryE) && (m > 0))
          {
            f localf2 = (f)this.ryo.get(m - 1);
            f3 = xf(localf2.rxE);
            f6 = xg(localf2.rxD);
            f5 = Math.min(f3, f1) - f7;
            f4 = Math.max(f3, f1) + f7;
            f3 = Math.min(f6, f2) - f7;
            f6 = Math.max(f6, f2) + f7;
            if (localf1 == null) {
              break label931;
            }
            f2 = this.ryG * 0.5F;
            float f8 = this.ryH * 0.5F;
            float f10 = xf(localf1.rxE);
            float f9 = xg(localf1.rxD);
            f1 = Math.min(f10 - f2, f5);
            f4 = Math.max(f2 + f10, f4);
            f2 = Math.min(f9 - f8, f3);
            f3 = Math.max(f9 + f8, f6);
          }
        }
      }
      break;
    }
    for (;;)
    {
      this.rym.union(Math.round(f1), Math.round(f2), Math.round(f4), Math.round(f3));
      i += 1;
      break;
      f1 = paramMotionEvent.getX();
      break label331;
      label643:
      f2 = paramMotionEvent.getY();
      break label345;
      this.ryC = paramMotionEvent.getX();
      if (this.ryC < getPaddingLeft() + this.ryr)
      {
        this.ryC = (getPaddingLeft() + this.ryr);
        this.ryD = paramMotionEvent.getY();
        if (this.ryD >= getPaddingTop() + this.ryr) {
          break label832;
        }
        this.ryD = (getPaddingTop() + this.ryr);
      }
      for (;;)
      {
        if (j != 0)
        {
          this.ryn.union(this.rym);
          invalidate(this.ryn);
          this.ryn.set(this.rym);
        }
        GMTrace.o(20225403650048L, 150691);
        return true;
        if (this.ryC <= getPaddingLeft() + getWidth() - getPaddingRight() - this.ryr) {
          break;
        }
        this.ryC = (getPaddingLeft() + getWidth() - getPaddingRight() - this.ryr);
        break;
        label832:
        if (this.ryD > getPaddingTop() + getHeight() - getPaddingRight() - this.ryr) {
          this.ryD = (getPaddingTop() + getHeight() - getPaddingBottom() - this.ryr);
        }
      }
      if (this.ryE)
      {
        this.ryE = false;
        bAW();
        if (this.ryI != null) {
          this.ryI.a(this);
        }
      }
      GMTrace.o(20225403650048L, 150691);
      return true;
      label931:
      f2 = f3;
      f3 = f6;
      f1 = f5;
    }
  }
  
  private static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    String ryO;
    int ryP;
    boolean ryu;
    boolean ryv;
    boolean ryw;
    
    static
    {
      GMTrace.i(20227685351424L, 150708);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(20227685351424L, 150708);
    }
    
    public SavedState(Parcel paramParcel)
    {
      super();
      GMTrace.i(20227282698240L, 150705);
      this.ryO = paramParcel.readString();
      this.ryP = paramParcel.readInt();
      this.ryv = ((Boolean)paramParcel.readValue(null)).booleanValue();
      this.ryw = ((Boolean)paramParcel.readValue(null)).booleanValue();
      this.ryu = ((Boolean)paramParcel.readValue(null)).booleanValue();
      GMTrace.o(20227282698240L, 150705);
    }
    
    public SavedState(Parcelable paramParcelable, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      super();
      GMTrace.i(20227416915968L, 150706);
      this.ryO = paramString;
      this.ryP = paramInt;
      this.ryv = paramBoolean1;
      this.ryw = paramBoolean2;
      this.ryu = paramBoolean3;
      GMTrace.o(20227416915968L, 150706);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(20227551133696L, 150707);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.ryO);
      paramParcel.writeInt(this.ryP);
      paramParcel.writeValue(Boolean.valueOf(this.ryv));
      paramParcel.writeValue(Boolean.valueOf(this.ryw));
      paramParcel.writeValue(Boolean.valueOf(this.ryu));
      GMTrace.o(20227551133696L, 150707);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(PatternLockView paramPatternLockView);
    
    public abstract void a(PatternLockView paramPatternLockView, List<f> paramList);
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(20227148480512L, 150704);
      ryK = new b("Correct", 0);
      ryL = new b("Wrong", 1);
      ryM = new b("Animate", 2);
      ryN = new b[] { ryK, ryL, ryM };
      GMTrace.o(20227148480512L, 150704);
    }
    
    private b()
    {
      GMTrace.i(20227014262784L, 150703);
      GMTrace.o(20227014262784L, 150703);
    }
  }
  
  public static enum c
  {
    static
    {
      GMTrace.i(20226611609600L, 150700);
      ryQ = 1;
      ryR = 2;
      ryS = new int[] { ryQ, ryR };
      GMTrace.o(20226611609600L, 150700);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\gesture\ui\widget\PatternLockView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */