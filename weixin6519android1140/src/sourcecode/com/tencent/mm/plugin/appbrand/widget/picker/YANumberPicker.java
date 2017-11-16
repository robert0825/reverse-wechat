package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.z;
import android.support.v4.widget.q;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.k;

public class YANumberPicker
  extends View
{
  private int Rc;
  private VelocityTracker ez;
  private q hN;
  private int iSA;
  private int iSB;
  private int iSC;
  private int iSD;
  private String iSE;
  public String iSF;
  private String iSG;
  private String iSH;
  private float iSI;
  private float iSJ;
  private float iSK;
  private float iSL;
  private boolean iSM;
  private boolean iSN;
  private boolean iSO;
  private boolean iSP;
  private boolean iSQ;
  private boolean iSR;
  private boolean iSS;
  Paint iST;
  private TextPaint iSU;
  private Paint iSV;
  private String[] iSW;
  private CharSequence[] iSX;
  private CharSequence[] iSY;
  private Handler iSZ;
  int iSb;
  int iSc;
  private int iSd;
  private int iSe;
  private int iSf;
  private int iSg;
  private int iSh;
  private int iSi;
  private int iSj;
  private int iSk;
  int iSl;
  private int iSm;
  int iSn;
  private int iSo;
  private int iSp;
  private int iSq;
  private int iSr;
  private int iSs;
  private int iSt;
  private int iSu;
  int iSv;
  int iSw;
  private int iSx;
  private int iSy;
  private int iSz;
  private Handler iTa;
  public a iTb;
  private b iTc;
  private int iTd;
  private int iTe;
  private int iTf;
  private int iTg;
  private float iTh;
  private float iTi;
  private float iTj;
  private boolean iTk;
  private int iTl;
  private float iTm;
  private float iTn;
  private float iTo;
  private int iTp;
  private int iTq;
  private int iTr;
  private int iTs;
  private int iTt;
  private HandlerThread mHandlerThread;
  private boolean mHasInit;
  private int mViewHeight;
  private int mViewWidth;
  private int xl;
  
  public YANumberPicker(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17641578168320L, 131440);
    this.iSb = -13421773;
    this.iSc = -695533;
    this.iSd = -695533;
    this.iSe = 0;
    this.iSf = 0;
    this.iSg = 0;
    this.iSh = 0;
    this.iSi = 0;
    this.iSj = 0;
    this.iSk = 0;
    this.iSl = 0;
    this.iSm = 0;
    this.iSn = -695533;
    this.Rc = 2;
    this.iSo = 0;
    this.iSp = 0;
    this.iSq = 3;
    this.iSr = 0;
    this.iSs = 0;
    this.iSt = -1;
    this.iSu = -1;
    this.iSv = 0;
    this.iSw = 0;
    this.iSx = 0;
    this.iSy = 0;
    this.iSz = 0;
    this.iSA = 0;
    this.iSB = 0;
    this.iSC = 150;
    this.iSD = 8;
    this.iSI = 1.0F;
    this.iSJ = 0.0F;
    this.iSK = 0.0F;
    this.iSL = 0.0F;
    this.iSM = true;
    this.iSN = true;
    this.iSO = false;
    this.mHasInit = false;
    this.iSP = true;
    this.iSQ = false;
    this.iSR = false;
    this.iSS = true;
    this.iST = new Paint();
    this.iSU = new TextPaint();
    this.iSV = new Paint();
    this.xl = 0;
    this.iTh = 0.0F;
    this.iTi = 0.0F;
    this.iTj = 0.0F;
    this.iTk = false;
    this.iTp = 0;
    this.iTq = 0;
    this.iTr = 0;
    this.iTs = 0;
    this.iTt = 0;
    init(paramContext);
    GMTrace.o(17641578168320L, 131440);
  }
  
  public YANumberPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17641712386048L, 131441);
    this.iSb = -13421773;
    this.iSc = -695533;
    this.iSd = -695533;
    this.iSe = 0;
    this.iSf = 0;
    this.iSg = 0;
    this.iSh = 0;
    this.iSi = 0;
    this.iSj = 0;
    this.iSk = 0;
    this.iSl = 0;
    this.iSm = 0;
    this.iSn = -695533;
    this.Rc = 2;
    this.iSo = 0;
    this.iSp = 0;
    this.iSq = 3;
    this.iSr = 0;
    this.iSs = 0;
    this.iSt = -1;
    this.iSu = -1;
    this.iSv = 0;
    this.iSw = 0;
    this.iSx = 0;
    this.iSy = 0;
    this.iSz = 0;
    this.iSA = 0;
    this.iSB = 0;
    this.iSC = 150;
    this.iSD = 8;
    this.iSI = 1.0F;
    this.iSJ = 0.0F;
    this.iSK = 0.0F;
    this.iSL = 0.0F;
    this.iSM = true;
    this.iSN = true;
    this.iSO = false;
    this.mHasInit = false;
    this.iSP = true;
    this.iSQ = false;
    this.iSR = false;
    this.iSS = true;
    this.iST = new Paint();
    this.iSU = new TextPaint();
    this.iSV = new Paint();
    this.xl = 0;
    this.iTh = 0.0F;
    this.iTi = 0.0F;
    this.iTj = 0.0F;
    this.iTk = false;
    this.iTp = 0;
    this.iTq = 0;
    this.iTr = 0;
    this.iTs = 0;
    this.iTt = 0;
    b(paramContext, paramAttributeSet);
    init(paramContext);
    GMTrace.o(17641712386048L, 131441);
  }
  
  public YANumberPicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17641846603776L, 131442);
    this.iSb = -13421773;
    this.iSc = -695533;
    this.iSd = -695533;
    this.iSe = 0;
    this.iSf = 0;
    this.iSg = 0;
    this.iSh = 0;
    this.iSi = 0;
    this.iSj = 0;
    this.iSk = 0;
    this.iSl = 0;
    this.iSm = 0;
    this.iSn = -695533;
    this.Rc = 2;
    this.iSo = 0;
    this.iSp = 0;
    this.iSq = 3;
    this.iSr = 0;
    this.iSs = 0;
    this.iSt = -1;
    this.iSu = -1;
    this.iSv = 0;
    this.iSw = 0;
    this.iSx = 0;
    this.iSy = 0;
    this.iSz = 0;
    this.iSA = 0;
    this.iSB = 0;
    this.iSC = 150;
    this.iSD = 8;
    this.iSI = 1.0F;
    this.iSJ = 0.0F;
    this.iSK = 0.0F;
    this.iSL = 0.0F;
    this.iSM = true;
    this.iSN = true;
    this.iSO = false;
    this.mHasInit = false;
    this.iSP = true;
    this.iSQ = false;
    this.iSR = false;
    this.iSS = true;
    this.iST = new Paint();
    this.iSU = new TextPaint();
    this.iSV = new Paint();
    this.xl = 0;
    this.iTh = 0.0F;
    this.iTi = 0.0F;
    this.iTj = 0.0F;
    this.iTk = false;
    this.iTp = 0;
    this.iTq = 0;
    this.iTr = 0;
    this.iTs = 0;
    this.iTt = 0;
    b(paramContext, paramAttributeSet);
    init(paramContext);
    GMTrace.o(17641846603776L, 131442);
  }
  
  private static float a(Paint.FontMetrics paramFontMetrics)
  {
    GMTrace.i(17644933611520L, 131465);
    if (paramFontMetrics == null)
    {
      GMTrace.o(17644933611520L, 131465);
      return 0.0F;
    }
    float f = Math.abs(paramFontMetrics.top + paramFontMetrics.bottom) / 2.0F;
    GMTrace.o(17644933611520L, 131465);
    return f;
  }
  
  private static int a(float paramFloat, int paramInt1, int paramInt2)
  {
    GMTrace.i(17646812659712L, 131479);
    int j = (paramInt1 & 0xFF000000) >>> 24;
    int k = (paramInt1 & 0xFF0000) >>> 16;
    int i = (paramInt1 & 0xFF00) >>> 8;
    paramInt1 = (paramInt1 & 0xFF) >>> 0;
    float f = j;
    j = (int)((((0xFF000000 & paramInt2) >>> 24) - j) * paramFloat + f);
    f = k;
    k = (int)((((0xFF0000 & paramInt2) >>> 16) - k) * paramFloat + f);
    f = i;
    i = (int)((((0xFF00 & paramInt2) >>> 8) - i) * paramFloat + f);
    f = paramInt1;
    paramInt1 = (int)((((paramInt2 & 0xFF) >>> 0) - paramInt1) * paramFloat + f);
    GMTrace.o(17646812659712L, 131479);
    return j << 24 | k << 16 | i << 8 | paramInt1;
  }
  
  private static int a(CharSequence paramCharSequence, Paint paramPaint)
  {
    GMTrace.i(17645873135616L, 131472);
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      int i = (int)(paramPaint.measureText(paramCharSequence.toString()) + 0.5F);
      GMTrace.o(17645873135616L, 131472);
      return i;
    }
    GMTrace.o(17645873135616L, 131472);
    return 0;
  }
  
  private static int a(CharSequence[] paramArrayOfCharSequence, Paint paramPaint)
  {
    int j = 0;
    GMTrace.i(17645738917888L, 131471);
    if (paramArrayOfCharSequence == null)
    {
      GMTrace.o(17645738917888L, 131471);
      return 0;
    }
    int m = paramArrayOfCharSequence.length;
    int i = 0;
    while (i < m)
    {
      CharSequence localCharSequence = paramArrayOfCharSequence[i];
      int k = j;
      if (localCharSequence != null) {
        k = Math.max(a(localCharSequence, paramPaint), j);
      }
      i += 1;
      j = k;
    }
    GMTrace.o(17645738917888L, 131471);
    return j;
  }
  
  private int adO()
  {
    GMTrace.i(17643054563328L, 131451);
    int i = this.iSu;
    int j = this.iSt;
    GMTrace.o(17643054563328L, 131451);
    return i - j + 1;
  }
  
  private int adP()
  {
    GMTrace.i(17643859869696L, 131457);
    int i;
    if (this.iTq != 0) {
      if (this.iTq < -this.iTl / 2) {
        i = kr(this.iTr + this.iTl + this.iTq);
      }
    }
    for (;;)
    {
      GMTrace.o(17643859869696L, 131457);
      return i;
      i = kr(this.iTr + this.iTq);
      continue;
      i = kr(this.iTr);
    }
  }
  
  private void adQ()
  {
    GMTrace.i(17644530958336L, 131462);
    this.iTf = 0;
    this.iTg = (-this.iSq * this.iTl);
    if (this.iSW != null)
    {
      this.iTf = ((adO() - this.iSq / 2 - 1) * this.iTl);
      this.iTg = (-(this.iSq / 2) * this.iTl);
    }
    GMTrace.o(17644530958336L, 131462);
  }
  
  private void adR()
  {
    GMTrace.i(17645336264704L, 131468);
    this.iTp = ((int)Math.floor(this.iTr / this.iTl));
    this.iTq = (-(this.iTr - this.iTp * this.iTl));
    if (this.iTc != null) {
      if (-this.iTq <= this.iTl / 2) {
        break label137;
      }
    }
    label137:
    for (this.iTe = (this.iTp + 1 + this.iSq / 2);; this.iTe = (this.iTp + this.iSq / 2))
    {
      this.iTe %= adO();
      if (this.iTe < 0) {
        this.iTe += adO();
      }
      this.iTd = this.iTe;
      GMTrace.o(17645336264704L, 131468);
      return;
    }
  }
  
  private void adS()
  {
    GMTrace.i(17646007353344L, 131473);
    if (this.iSW.length <= this.iSq) {}
    for (boolean bool = false;; bool = true)
    {
      this.iSP = bool;
      GMTrace.o(17646007353344L, 131473);
      return;
    }
  }
  
  private void adT()
  {
    GMTrace.i(17646141571072L, 131474);
    if ((this.hN != null) && (!this.hN.isFinished()))
    {
      this.hN.startScroll(0, this.hN.getCurrY(), 0, 0, 1);
      this.hN.abortAnimation();
      postInvalidate();
    }
    GMTrace.o(17646141571072L, 131474);
  }
  
  private static int b(Context paramContext, float paramFloat)
  {
    GMTrace.i(17646544224256L, 131477);
    int i = (int)(paramContext.getResources().getDisplayMetrics().scaledDensity * paramFloat + 0.5F);
    GMTrace.o(17646544224256L, 131477);
    return i;
  }
  
  private static Message b(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    GMTrace.i(17646410006528L, 131476);
    Message localMessage = Message.obtain();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramObject;
    GMTrace.o(17646410006528L, 131476);
    return localMessage;
  }
  
  private void b(Context paramContext, AttributeSet paramAttributeSet)
  {
    GMTrace.i(17641980821504L, 131443);
    if (paramAttributeSet == null)
    {
      GMTrace.o(17641980821504L, 131443);
      return;
    }
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, o.k.hHb);
    int k = localTypedArray.getIndexCount();
    int i = 0;
    if (i < k)
    {
      int j = localTypedArray.getIndex(i);
      if (j == o.k.hHt) {
        this.iSq = localTypedArray.getInt(j, 3);
      }
      for (;;)
      {
        i += 1;
        break;
        if (j == o.k.hHf)
        {
          this.iSn = localTypedArray.getColor(j, -695533);
        }
        else if (j == o.k.hHg)
        {
          this.Rc = localTypedArray.getDimensionPixelSize(j, 2);
        }
        else if (j == o.k.hHh)
        {
          this.iSo = localTypedArray.getDimensionPixelSize(j, 0);
        }
        else if (j == o.k.hHi)
        {
          this.iSp = localTypedArray.getDimensionPixelSize(j, 0);
        }
        else
        {
          if (j == o.k.hHv)
          {
            CharSequence[] arrayOfCharSequence = localTypedArray.getTextArray(j);
            if (arrayOfCharSequence == null) {
              paramAttributeSet = null;
            }
            for (;;)
            {
              this.iSW = paramAttributeSet;
              break;
              paramAttributeSet = new String[arrayOfCharSequence.length];
              j = 0;
              while (j < arrayOfCharSequence.length)
              {
                paramAttributeSet[j] = arrayOfCharSequence[j].toString();
                j += 1;
              }
            }
          }
          if (j == o.k.hHx) {
            this.iSb = localTypedArray.getColor(j, -13421773);
          } else if (j == o.k.hHy) {
            this.iSc = localTypedArray.getColor(j, -695533);
          } else if (j == o.k.hHw) {
            this.iSd = localTypedArray.getColor(j, -695533);
          } else if (j == o.k.hHB) {
            this.iSe = localTypedArray.getDimensionPixelSize(j, b(paramContext, 13.0F));
          } else if (j == o.k.hHC) {
            this.iSf = localTypedArray.getDimensionPixelSize(j, b(paramContext, 15.0F));
          } else if (j == o.k.hHA) {
            this.iSg = localTypedArray.getDimensionPixelSize(j, b(paramContext, 14.0F));
          } else if (j == o.k.hHq) {
            this.iSt = localTypedArray.getInteger(j, 0);
          } else if (j == o.k.hHp) {
            this.iSu = localTypedArray.getInteger(j, 0);
          } else if (j == o.k.hHD) {
            this.iSN = localTypedArray.getBoolean(j, true);
          } else if (j == o.k.hHu) {
            this.iSM = localTypedArray.getBoolean(j, true);
          } else if (j == o.k.hHk) {
            this.iSE = localTypedArray.getString(j);
          } else if (j == o.k.hHc) {
            this.iSH = localTypedArray.getString(j);
          } else if (j == o.k.hHj) {
            this.iSG = localTypedArray.getString(j);
          } else if (j == o.k.hHo) {
            this.iSj = localTypedArray.getDimensionPixelSize(j, c(paramContext, 8.0F));
          } else if (j == o.k.hHn) {
            this.iSk = localTypedArray.getDimensionPixelSize(j, c(paramContext, 8.0F));
          } else if (j == o.k.hHm) {
            this.iSl = localTypedArray.getDimensionPixelSize(j, c(paramContext, 2.0F));
          } else if (j == o.k.hHl) {
            this.iSm = localTypedArray.getDimensionPixelSize(j, c(paramContext, 5.0F));
          } else if (j == o.k.hHd) {
            this.iSX = localTypedArray.getTextArray(j);
          } else if (j == o.k.hHe) {
            this.iSY = localTypedArray.getTextArray(j);
          } else if (j == o.k.hHs) {
            this.iSR = localTypedArray.getBoolean(j, false);
          } else if (j == o.k.hHr) {
            this.iSS = localTypedArray.getBoolean(j, true);
          } else if (j == o.k.hHz) {
            this.iSF = localTypedArray.getString(j);
          }
        }
      }
    }
    localTypedArray.recycle();
    GMTrace.o(17641980821504L, 131443);
  }
  
  private static int c(Context paramContext, float paramFloat)
  {
    GMTrace.i(17646678441984L, 131478);
    int i = (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
    GMTrace.o(17646678441984L, 131478);
    return i;
  }
  
  private void cV(boolean paramBoolean)
  {
    GMTrace.i(17645470482432L, 131469);
    float f = this.iSU.getTextSize();
    this.iSU.setTextSize(this.iSf);
    this.iSx = a(this.iSW, this.iSU);
    this.iSz = a(this.iSX, this.iSU);
    this.iSA = a(this.iSY, this.iSU);
    this.iSU.setTextSize(this.iSg);
    this.iSi = a(this.iSH, this.iSU);
    this.iSU.setTextSize(f);
    f = this.iSU.getTextSize();
    this.iSU.setTextSize(this.iSf);
    this.iSy = ((int)(this.iSU.getFontMetrics().bottom - this.iSU.getFontMetrics().top + 0.5D));
    this.iSU.setTextSize(f);
    if ((paramBoolean) && ((this.iTs == Integer.MIN_VALUE) || (this.iTt == Integer.MIN_VALUE))) {
      this.iTa.sendEmptyMessage(3);
    }
    GMTrace.o(17645470482432L, 131469);
  }
  
  private void g(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(17643994087424L, 131458);
    if (paramInt1 > paramInt2) {
      throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + paramInt1 + ", maxShowIndex is " + paramInt2 + ".");
    }
    if (this.iSW == null) {
      throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
    }
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + paramInt1);
    }
    if (paramInt1 > this.iSW.length - 1) {
      throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.iSW.length - 1) + " minShowIndex is " + paramInt1);
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + paramInt2);
    }
    if (paramInt2 > this.iSW.length - 1) {
      throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.iSW.length - 1) + " maxShowIndex is " + paramInt2);
    }
    this.iSt = paramInt1;
    this.iSu = paramInt2;
    if (paramBoolean)
    {
      this.iSB = (this.iSt + 0);
      if ((!this.iSN) || (!this.iSP)) {
        break label295;
      }
    }
    label295:
    for (paramBoolean = true;; paramBoolean = false)
    {
      v(0, paramBoolean);
      postInvalidate();
      GMTrace.o(17643994087424L, 131458);
      return;
    }
  }
  
  private static int h(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(17644396740608L, 131461);
    if (paramInt2 <= 0)
    {
      GMTrace.o(17644396740608L, 131461);
      return 0;
    }
    if (paramBoolean)
    {
      int i = paramInt1 % paramInt2;
      paramInt1 = i;
      if (i < 0) {
        paramInt1 = i + paramInt2;
      }
      GMTrace.o(17644396740608L, 131461);
      return paramInt1;
    }
    GMTrace.o(17644396740608L, 131461);
    return paramInt1;
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(17642115039232L, 131444);
    this.hN = q.a(paramContext, null);
    this.iSC = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
    this.iSD = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    if (this.iSe == 0) {
      this.iSe = b(paramContext, 13.0F);
    }
    if (this.iSf == 0) {
      this.iSf = b(paramContext, 15.0F);
    }
    if (this.iSg == 0) {
      this.iSg = b(paramContext, 14.0F);
    }
    if (this.iSj == 0) {
      this.iSj = c(paramContext, 8.0F);
    }
    if (this.iSk == 0) {
      this.iSk = c(paramContext, 8.0F);
    }
    this.iST.setColor(this.iSn);
    this.iST.setAntiAlias(true);
    this.iST.setStyle(Paint.Style.STROKE);
    this.iST.setStrokeWidth(this.Rc);
    this.iSU.setColor(this.iSb);
    this.iSU.setAntiAlias(true);
    this.iSU.setTextAlign(Paint.Align.CENTER);
    this.iSV.setColor(this.iSd);
    this.iSV.setAntiAlias(true);
    this.iSV.setTextAlign(Paint.Align.CENTER);
    this.iSV.setTextSize(this.iSg);
    if (this.iSq % 2 == 0) {
      this.iSq += 1;
    }
    if ((this.iSt == -1) || (this.iSu == -1))
    {
      if (this.iSW == null)
      {
        this.iSW = new String[1];
        this.iSW[0] = "0";
      }
      adS();
      if (this.iSt == -1) {
        this.iSt = 0;
      }
      if (this.iSu == -1) {
        this.iSu = (this.iSW.length - 1);
      }
      g(this.iSt, this.iSu, false);
    }
    initHandler();
    GMTrace.o(17642115039232L, 131444);
  }
  
  private void initHandler()
  {
    GMTrace.i(17642249256960L, 131445);
    this.mHandlerThread = new HandlerThread("HandlerThread-For-Refreshing");
    this.mHandlerThread.start();
    this.iSZ = new Handler(this.mHandlerThread.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        int j = 0;
        GMTrace.i(17648825925632L, 131494);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(17648825925632L, 131494);
          return;
          if (!YANumberPicker.a(YANumberPicker.this).isFinished())
          {
            if (YANumberPicker.b(YANumberPicker.this) == 0) {
              YANumberPicker.b(YANumberPicker.this, 1);
            }
            YANumberPicker.c(YANumberPicker.this).sendMessageDelayed(YANumberPicker.c(1, 0, 0, paramAnonymousMessage.obj), 32L);
            GMTrace.o(17648825925632L, 131494);
            return;
          }
          int i;
          if (YANumberPicker.d(YANumberPicker.this) != 0)
          {
            if (YANumberPicker.b(YANumberPicker.this) == 0) {
              YANumberPicker.b(YANumberPicker.this, 1);
            }
            if (YANumberPicker.d(YANumberPicker.this) < -YANumberPicker.e(YANumberPicker.this) / 2)
            {
              j = (int)((YANumberPicker.e(YANumberPicker.this) + YANumberPicker.d(YANumberPicker.this)) * 300.0F / YANumberPicker.e(YANumberPicker.this));
              q localq = YANumberPicker.a(YANumberPicker.this);
              i = YANumberPicker.f(YANumberPicker.this);
              int k = YANumberPicker.e(YANumberPicker.this);
              localq.startScroll(0, i, 0, YANumberPicker.d(YANumberPicker.this) + k, j * 3);
              i = YANumberPicker.c(YANumberPicker.this, YANumberPicker.f(YANumberPicker.this) + YANumberPicker.e(YANumberPicker.this) + YANumberPicker.d(YANumberPicker.this));
              YANumberPicker.this.postInvalidate();
            }
          }
          for (;;)
          {
            paramAnonymousMessage = YANumberPicker.c(2, YANumberPicker.g(YANumberPicker.this), i, paramAnonymousMessage.obj);
            if (!YANumberPicker.h(YANumberPicker.this)) {
              break label428;
            }
            YANumberPicker.i(YANumberPicker.this).sendMessageDelayed(paramAnonymousMessage, j * 2);
            GMTrace.o(17648825925632L, 131494);
            return;
            j = (int)(-YANumberPicker.d(YANumberPicker.this) * 300.0F / YANumberPicker.e(YANumberPicker.this));
            YANumberPicker.a(YANumberPicker.this).startScroll(0, YANumberPicker.f(YANumberPicker.this), 0, YANumberPicker.d(YANumberPicker.this), j * 3);
            i = YANumberPicker.c(YANumberPicker.this, YANumberPicker.f(YANumberPicker.this) + YANumberPicker.d(YANumberPicker.this));
            break;
            YANumberPicker.b(YANumberPicker.this, 0);
            i = YANumberPicker.c(YANumberPicker.this, YANumberPicker.f(YANumberPicker.this));
          }
          label428:
          YANumberPicker.c(YANumberPicker.this).sendMessageDelayed(paramAnonymousMessage, j * 2);
          GMTrace.o(17648825925632L, 131494);
          return;
          YANumberPicker.a(YANumberPicker.this, paramAnonymousMessage.arg1, paramAnonymousMessage.arg2, paramAnonymousMessage.obj);
        }
      }
    };
    this.iTa = new Handler()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(17650436538368L, 131506);
        super.handleMessage(paramAnonymousMessage);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(17650436538368L, 131506);
          return;
          YANumberPicker.this.requestLayout();
          GMTrace.o(17650436538368L, 131506);
          return;
          YANumberPicker.a(YANumberPicker.this, paramAnonymousMessage.arg1, paramAnonymousMessage.arg2, paramAnonymousMessage.obj);
        }
      }
    };
    GMTrace.o(17642249256960L, 131445);
  }
  
  private void kq(int paramInt)
  {
    GMTrace.i(17644128305152L, 131459);
    if (this.xl == paramInt)
    {
      GMTrace.o(17644128305152L, 131459);
      return;
    }
    this.xl = paramInt;
    GMTrace.o(17644128305152L, 131459);
  }
  
  private int kr(int paramInt)
  {
    boolean bool2 = false;
    GMTrace.i(17644262522880L, 131460);
    if (this.iTl == 0)
    {
      GMTrace.o(17644262522880L, 131460);
      return 0;
    }
    paramInt /= this.iTl;
    int i = this.iSq / 2;
    int j = adO();
    boolean bool1 = bool2;
    if (this.iSN)
    {
      bool1 = bool2;
      if (this.iSP) {
        bool1 = true;
      }
    }
    paramInt = h(paramInt + i, j, bool1);
    if ((paramInt >= 0) && (paramInt < adO()))
    {
      i = this.iSt;
      GMTrace.o(17644262522880L, 131460);
      return paramInt + i;
    }
    throw new IllegalArgumentException("getWillPickIndexByGlobalY illegal index : " + paramInt + " getOneRecycleSize() : " + adO() + " mWrapSelectorWheel : " + this.iSN);
  }
  
  private int ks(int paramInt)
  {
    GMTrace.i(17644665176064L, 131463);
    if ((this.iSN) && (this.iSP))
    {
      GMTrace.o(17644665176064L, 131463);
      return paramInt;
    }
    int i;
    if (paramInt < this.iTg) {
      i = this.iTg;
    }
    for (;;)
    {
      GMTrace.o(17644665176064L, 131463);
      return i;
      i = paramInt;
      if (paramInt > this.iTf) {
        i = this.iTf;
      }
    }
  }
  
  private void v(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17645067829248L, 131466);
    this.iTp = (paramInt - (this.iSq - 1) / 2);
    this.iTp = h(this.iTp, adO(), paramBoolean);
    if (this.iTl == 0)
    {
      this.iSO = true;
      GMTrace.o(17645067829248L, 131466);
      return;
    }
    this.iTr = (this.iTp * this.iTl);
    this.iTd = (this.iTp + this.iSq / 2);
    this.iTd %= adO();
    if (this.iTd < 0) {
      this.iTd += adO();
    }
    this.iTe = this.iTd;
    adR();
    GMTrace.o(17645067829248L, 131466);
  }
  
  public final void adU()
  {
    GMTrace.i(17646275788800L, 131475);
    adT();
    if (this.iSZ != null) {
      this.iSZ.sendMessageDelayed(b(1, 0, 0, null), 0L);
    }
    GMTrace.o(17646275788800L, 131475);
  }
  
  public void computeScroll()
  {
    GMTrace.i(17645202046976L, 131467);
    if (this.iTl == 0)
    {
      GMTrace.o(17645202046976L, 131467);
      return;
    }
    if (this.hN.computeScrollOffset())
    {
      this.iTr = this.hN.getCurrY();
      adR();
      postInvalidate();
    }
    GMTrace.o(17645202046976L, 131467);
  }
  
  public final int getValue()
  {
    GMTrace.i(17643591434240L, 131455);
    int i = adP();
    int j = this.iSv;
    GMTrace.o(17643591434240L, 131455);
    return i + j;
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(17642786127872L, 131449);
    super.onAttachedToWindow();
    if ((this.mHandlerThread == null) || (!this.mHandlerThread.isAlive())) {
      initHandler();
    }
    GMTrace.o(17642786127872L, 131449);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(17642920345600L, 131450);
    super.onDetachedFromWindow();
    this.mHandlerThread.quit();
    if (this.iTl == 0)
    {
      GMTrace.o(17642920345600L, 131450);
      return;
    }
    if (!this.hN.isFinished())
    {
      this.hN.abortAnimation();
      this.iTr = this.hN.getCurrY();
      adR();
      if (this.iTq != 0)
      {
        if (this.iTq >= -this.iTl / 2) {
          break label180;
        }
        this.iTr = (this.iTr + this.iTl + this.iTq);
      }
    }
    for (;;)
    {
      adR();
      kq(0);
      int i = kr(this.iTr);
      if ((i != this.iSB) && (this.iSR)) {}
      try
      {
        if (this.iTb != null) {
          this.iTb.a(this, this.iSv + i);
        }
        this.iSB = i;
        GMTrace.o(17642920345600L, 131450);
        return;
        label180:
        this.iTr += this.iTq;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(17645604700160L, 131470);
    super.onDraw(paramCanvas);
    float f3 = 0.0F;
    int j = 0;
    float f4;
    label75:
    float f1;
    float f2;
    label179:
    String str;
    TextPaint localTextPaint;
    if (j < this.iSq + 1)
    {
      f4 = this.iTq + this.iTl * j;
      int i = this.iTp;
      int k = adO();
      boolean bool;
      if ((this.iSN) && (this.iSP))
      {
        bool = true;
        k = h(i + j, k, bool);
        if (j != this.iSq / 2) {
          break label345;
        }
        f1 = (this.iTl + this.iTq) / this.iTl;
        i = a(f1, this.iSb, this.iSc);
        float f5 = this.iSe;
        float f6 = this.iSf;
        f2 = this.iSJ;
        float f7 = this.iSK;
        f3 = f1;
        f2 += (f7 - f2) * f1;
        f1 = f5 + (f6 - f5) * f1;
        this.iSU.setColor(i);
        this.iSU.setTextSize(f1);
        if ((k < 0) || (k >= adO())) {
          break label562;
        }
        str = this.iSW[(this.iSt + k)];
        if (this.iSF == null) {
          break label763;
        }
        localTextPaint = this.iSU;
        f1 = getWidth() - this.iSm * 2;
        localObject = this.iSF;
        i = -1;
        switch (((String)localObject).hashCode())
        {
        }
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          throw new IllegalArgumentException("Illegal text ellipsize type.");
          bool = false;
          break label75;
          label345:
          if (j == this.iSq / 2 + 1)
          {
            i = a(1.0F - f3, this.iSb, this.iSc);
            f1 = this.iSe;
            f1 = (1.0F - f3) * (this.iSf - f1) + f1;
            f2 = this.iSJ;
            f2 = (1.0F - f3) * (this.iSK - f2) + f2;
            break label179;
          }
          i = this.iSb;
          f1 = this.iSe;
          f2 = this.iSJ;
          break label179;
          if (((String)localObject).equals("start"))
          {
            i = 0;
            continue;
            if (((String)localObject).equals("middle"))
            {
              i = 1;
              continue;
              if (((String)localObject).equals("end")) {
                i = 2;
              }
            }
          }
          break;
        }
      }
      localObject = TextUtils.TruncateAt.START;
    }
    label494:
    label562:
    label763:
    for (Object localObject = TextUtils.ellipsize(str, localTextPaint, f1, (TextUtils.TruncateAt)localObject);; localObject = str)
    {
      paramCanvas.drawText(((CharSequence)localObject).toString(), this.iTo, f2 + (f4 + this.iTl / 2), this.iSU);
      for (;;)
      {
        j += 1;
        break;
        localObject = TextUtils.TruncateAt.MIDDLE;
        break label494;
        localObject = TextUtils.TruncateAt.END;
        break label494;
        if (!TextUtils.isEmpty(this.iSG)) {
          paramCanvas.drawText(this.iSG, this.iTo, f2 + (f4 + this.iTl / 2), this.iSU);
        }
      }
      if (this.iSM)
      {
        paramCanvas.drawLine(getPaddingLeft() + this.iSo, this.iTm, this.mViewWidth - getPaddingRight() - this.iSp, this.iTm, this.iST);
        paramCanvas.drawLine(getPaddingLeft() + this.iSo, this.iTn, this.mViewWidth - getPaddingRight() - this.iSp, this.iTn, this.iST);
      }
      if (!TextUtils.isEmpty(this.iSE)) {
        paramCanvas.drawText(this.iSE, this.iTo + (this.iSx + this.iSh) / 2 + this.iSj, (this.iTm + this.iTn) / 2.0F + this.iSL, this.iSV);
      }
      GMTrace.o(17645604700160L, 131470);
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(17642383474688L, 131446);
    super.onMeasure(paramInt1, paramInt2);
    cV(false);
    int k = View.MeasureSpec.getMode(paramInt1);
    this.iTs = k;
    int j = View.MeasureSpec.getSize(paramInt1);
    if (k == 1073741824)
    {
      paramInt1 = j;
      j = View.MeasureSpec.getMode(paramInt2);
      this.iTt = j;
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if (j != 1073741824) {
        break label220;
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      GMTrace.o(17642383474688L, 131446);
      return;
      if (Math.max(this.iSh, this.iSi) == 0)
      {
        paramInt1 = 0;
        label106:
        if (Math.max(this.iSh, this.iSi) != 0) {
          break label212;
        }
      }
      label212:
      for (int i = 0;; i = this.iSj)
      {
        int m = this.iSz;
        int n = Math.max(this.iSx, this.iSA);
        i = Math.max(m, (paramInt1 + (i + Math.max(this.iSh, this.iSi)) + this.iSm * 2) * 2 + n) + (getPaddingLeft() + getPaddingRight());
        paramInt1 = i;
        if (k != Integer.MIN_VALUE) {
          break;
        }
        paramInt1 = Math.min(i, j);
        break;
        paramInt1 = this.iSk;
        break label106;
      }
      label220:
      i = this.iSq * (this.iSy + this.iSl * 2) + (getPaddingTop() + getPaddingBottom());
      if (j == Integer.MIN_VALUE) {
        paramInt2 = Math.min(i, paramInt2);
      } else {
        paramInt2 = i;
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(17642517692416L, 131447);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.mViewWidth = paramInt1;
    this.mViewHeight = paramInt2;
    this.iTl = (this.mViewHeight / this.iSq);
    this.iTo = ((this.mViewWidth + getPaddingLeft() - getPaddingRight()) / 2.0F);
    if (adO() > 1) {
      if (this.mHasInit) {
        paramInt1 = getValue() - this.iSv;
      }
    }
    for (;;)
    {
      if ((this.iSN) && (this.iSP)) {}
      for (boolean bool = true;; bool = false)
      {
        v(paramInt1, bool);
        if (this.iSe > this.iTl) {
          this.iSe = this.iTl;
        }
        if (this.iSf > this.iTl) {
          this.iSf = this.iTl;
        }
        if (this.iSV != null) {
          break label202;
        }
        throw new IllegalArgumentException("mPaintHint should not be null.");
        if (this.iSO)
        {
          paramInt1 = this.iTp + (this.iSq - 1) / 2;
          break;
        }
        paramInt1 = 0;
        break;
      }
      label202:
      this.iSV.setTextSize(this.iSg);
      this.iSL = a(this.iSV.getFontMetrics());
      this.iSh = a(this.iSE, this.iSV);
      if (this.iSU == null) {
        throw new IllegalArgumentException("mPaintText should not be null.");
      }
      this.iSU.setTextSize(this.iSf);
      this.iSK = a(this.iSU.getFontMetrics());
      this.iSU.setTextSize(this.iSe);
      this.iSJ = a(this.iSU.getFontMetrics());
      adQ();
      this.iSr = (this.iSq / 2);
      this.iSs = (this.iSr + 1);
      this.iTm = (this.iSr * this.mViewHeight / this.iSq);
      this.iTn = (this.iSs * this.mViewHeight / this.iSq);
      if (this.iSo < 0) {
        this.iSo = 0;
      }
      if (this.iSp < 0) {
        this.iSp = 0;
      }
      if ((this.iSo + this.iSp != 0) && (getPaddingLeft() + this.iSo >= this.mViewWidth - getPaddingRight() - this.iSp))
      {
        paramInt1 = getPaddingLeft() + this.iSo + getPaddingRight() + this.iSp - this.mViewWidth;
        this.iSo = ((int)(this.iSo - paramInt1 * this.iSo / (this.iSo + this.iSp)));
        this.iSp = ((int)(this.iSp - paramInt1 * this.iSp / (this.iSo + this.iSp)));
      }
      this.mHasInit = true;
      GMTrace.o(17642517692416L, 131447);
      return;
      paramInt1 = 0;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17644799393792L, 131464);
    if (this.iTl == 0)
    {
      GMTrace.o(17644799393792L, 131464);
      return true;
    }
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    this.iTj = paramMotionEvent.getY();
    int i;
    label243:
    int j;
    int k;
    label341:
    label403:
    int n;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
    case 1: 
      do
      {
        float f;
        do
        {
          for (;;)
          {
            GMTrace.o(17644799393792L, 131464);
            return true;
            this.iTk = true;
            this.iSZ.removeMessages(1);
            adT();
            this.iTi = this.iTj;
            this.iTh = this.iTr;
            kq(0);
            getParent().requestDisallowInterceptTouchEvent(true);
            continue;
            f = this.iTi - this.iTj;
            if ((!this.iTk) || (-this.iSD >= f) || (f >= this.iSD))
            {
              this.iTk = false;
              this.iTr = ks((int)(f + this.iTh));
              adR();
              invalidate();
            }
            kq(1);
          }
          if (!this.iTk) {
            break;
          }
          f = paramMotionEvent.getY();
          i = 0;
        } while (i >= this.iSq);
        if ((this.iTl * i > f) || (f >= this.iTl * (i + 1))) {
          break;
        }
      } while ((i < 0) || (i >= this.iSq));
      i -= this.iSq / 2;
      if (this.iSN)
      {
        j = i;
        if (this.iSP) {}
      }
      else
      {
        k = adP();
        if (k + i <= this.iSu) {
          break;
        }
        j = this.iSu - k;
      }
      if (this.iTq < -this.iTl / 2)
      {
        k = this.iTl + this.iTq;
        i = (int)(300.0F * (this.iTl + this.iTq) / this.iTl);
        if (j < 0)
        {
          i = -i - j * 300;
          n = this.iTl;
          if (i >= 300) {
            break label737;
          }
          i = 300;
        }
      }
      break;
    }
    label737:
    for (;;)
    {
      int m = i;
      if (i > 600) {
        m = 600;
      }
      this.hN.startScroll(0, this.iTr, 0, k + j * n, m);
      this.iSZ.sendMessageDelayed(b(1, 0, 0, null), m / 4);
      postInvalidate();
      break;
      j = i;
      if (k + i >= this.iSt) {
        break label341;
      }
      j = this.iSt - k;
      break label341;
      i += j * 300;
      break label403;
      k = this.iTq;
      i = (int)(300.0F * -this.iTq / this.iTl);
      if (j < 0)
      {
        i -= j * 300;
        break label403;
      }
      i += j * 300;
      break label403;
      i += 1;
      break label243;
      paramMotionEvent = this.ez;
      paramMotionEvent.computeCurrentVelocity(1000);
      i = (int)(paramMotionEvent.getYVelocity() * this.iSI);
      if (Math.abs(i) > this.iSC)
      {
        this.hN.a(this.iTr, 0, -i, Integer.MIN_VALUE, Integer.MAX_VALUE, ks(Integer.MIN_VALUE), ks(Integer.MAX_VALUE));
        invalidate();
        kq(2);
      }
      this.iSZ.sendMessageDelayed(b(1, 0, 0, null), 0L);
      if (this.ez == null) {
        break;
      }
      this.ez.clear();
      this.ez.recycle();
      this.ez = null;
      break;
      this.iTh = this.iTr;
      adT();
      this.iSZ.sendMessageDelayed(b(1, 0, 0, null), 0L);
      break;
    }
  }
  
  public void postInvalidate()
  {
    GMTrace.i(17642651910144L, 131448);
    if (!z.al(this))
    {
      GMTrace.o(17642651910144L, 131448);
      return;
    }
    super.postInvalidate();
    GMTrace.o(17642651910144L, 131448);
  }
  
  public final void setDisplayedValues(String[] paramArrayOfString)
  {
    boolean bool = true;
    GMTrace.i(17643188781056L, 131452);
    if (this.iSZ != null) {
      this.iSZ.removeMessages(1);
    }
    adT();
    if (paramArrayOfString == null) {
      throw new IllegalArgumentException("newDisplayedValues should not be null.");
    }
    if (this.iSw - this.iSv + 1 > paramArrayOfString.length) {
      throw new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + (this.iSw - this.iSv + 1) + " newDisplayedValues.length is " + paramArrayOfString.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
    }
    this.iSW = paramArrayOfString;
    adS();
    cV(true);
    this.iSB = (this.iSt + 0);
    if ((this.iSN) && (this.iSP)) {}
    for (;;)
    {
      v(0, bool);
      postInvalidate();
      this.iTa.sendEmptyMessage(3);
      GMTrace.o(17643188781056L, 131452);
      return;
      bool = false;
    }
  }
  
  public final void setDividerHeight(int paramInt)
  {
    GMTrace.i(17643725651968L, 131456);
    if (paramInt == this.Rc)
    {
      GMTrace.o(17643725651968L, 131456);
      return;
    }
    this.Rc = paramInt;
    this.iST.setStrokeWidth(this.Rc);
    postInvalidate();
    GMTrace.o(17643725651968L, 131456);
  }
  
  public final void setMaxValue(int paramInt)
  {
    GMTrace.i(17643322998784L, 131453);
    if (this.iSW == null) {
      throw new NullPointerException("mDisplayedValues should not be null");
    }
    if (paramInt - this.iSv + 1 > this.iSW.length) {
      throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + (paramInt - this.iSv + 1) + " and mDisplayedValues.length is " + this.iSW.length);
    }
    this.iSw = paramInt;
    this.iSu = (this.iSw - this.iSv + this.iSt);
    g(this.iSt, this.iSu, true);
    adQ();
    GMTrace.o(17643322998784L, 131453);
  }
  
  public final void setValue(int paramInt)
  {
    GMTrace.i(17643457216512L, 131454);
    if (paramInt < this.iSv) {
      throw new IllegalArgumentException("should not set a value less than mMinValue, value is " + paramInt);
    }
    if (paramInt > this.iSw) {
      throw new IllegalArgumentException("should not set a value greater than mMaxValue, value is " + paramInt);
    }
    paramInt -= this.iSv;
    int i;
    if ((this.iSt >= 0) && (this.iSt <= paramInt) && (paramInt <= this.iSu))
    {
      this.iSB = paramInt;
      i = this.iSt;
      if ((!this.iSN) || (!this.iSP)) {
        break label153;
      }
    }
    label153:
    for (boolean bool = true;; bool = false)
    {
      v(paramInt - i, bool);
      postInvalidate();
      GMTrace.o(17643457216512L, 131454);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(YANumberPicker paramYANumberPicker, int paramInt);
  }
  
  public static abstract interface b {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\YANumberPicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */