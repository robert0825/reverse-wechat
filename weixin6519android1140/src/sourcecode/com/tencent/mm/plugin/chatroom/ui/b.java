package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.R.n;
import java.security.InvalidParameterException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

public final class b
  extends View
{
  protected static int jRJ;
  protected static int jRK;
  protected static int jRL;
  protected static int jRM;
  protected static int jRN;
  protected static int jRO;
  protected static int jRP;
  protected static int jRQ;
  public Collection<com.tencent.mm.plugin.chatroom.d.a> jOw;
  protected int jRR;
  protected Paint jRS;
  protected Paint jRT;
  protected Paint jRU;
  protected Paint jRV;
  protected Paint jRW;
  protected int jRX;
  protected int jRY;
  protected int jRZ;
  private final Boolean jSA;
  public int jSB;
  private DateFormatSymbols jSC;
  public a jSD;
  protected int jSa;
  protected int jSb;
  protected int jSc;
  protected int jSd;
  protected int jSe;
  protected int jSf;
  private final StringBuilder jSg;
  protected boolean jSh;
  protected boolean jSi;
  protected int jSj;
  protected int jSk;
  protected int jSl;
  protected int jSm;
  protected int jSn;
  protected int jSo;
  protected int jSp;
  protected int jSq;
  protected int jSr;
  protected int jSs;
  private int jSt;
  protected Boolean jSu;
  protected int jSv;
  protected int jSw;
  final Time jSx;
  private final Calendar jSy;
  private final Calendar jSz;
  protected int jnc;
  protected int jnd;
  private Context mContext;
  protected int mWidth;
  
  static
  {
    GMTrace.i(9075131678720L, 67615);
    jRJ = 32;
    jRL = 1;
    jRN = 10;
    GMTrace.o(9075131678720L, 67615);
  }
  
  public b(Context paramContext, TypedArray paramTypedArray)
  {
    super(paramContext);
    GMTrace.i(9073789501440L, 67605);
    this.jRR = 80;
    this.jSh = false;
    this.jSi = false;
    this.jSj = -1;
    this.jSk = -1;
    this.jSl = -1;
    this.jSm = -1;
    this.jSn = -1;
    this.jSo = -1;
    this.jSp = -1;
    this.jSq = 1;
    this.jSr = 7;
    this.jSs = this.jSr;
    this.jSt = 0;
    this.jSv = jRJ;
    this.jSw = 0;
    this.jSB = 6;
    this.jSC = new DateFormatSymbols();
    this.jOw = new ArrayList();
    this.mContext = paramContext;
    paramContext = paramContext.getResources();
    this.jSz = Calendar.getInstance();
    this.jSy = Calendar.getInstance();
    this.jSx = new Time(Time.getCurrentTimezone());
    this.jSx.setToNow();
    this.jRX = paramTypedArray.getColor(R.n.emR, paramContext.getColor(R.e.aOC));
    this.jRY = paramTypedArray.getColor(R.n.emU, paramContext.getColor(R.e.aOC));
    this.jRZ = paramTypedArray.getColor(R.n.emS, paramContext.getColor(R.e.aOC));
    this.jSa = paramTypedArray.getColor(R.n.emS, paramContext.getColor(R.e.aOD));
    this.jSb = paramTypedArray.getColor(R.n.emV, paramContext.getColor(R.e.aOC));
    this.jSd = paramTypedArray.getColor(R.n.emW, paramContext.getColor(R.e.aOC));
    this.jSe = paramTypedArray.getColor(R.n.emT, paramContext.getColor(R.e.aOo));
    this.jSf = paramTypedArray.getColor(R.n.emX, paramContext.getColor(R.e.aOR));
    this.jSc = paramTypedArray.getColor(R.n.emY, paramContext.getColor(R.e.aOS));
    this.jSu = Boolean.valueOf(paramTypedArray.getBoolean(R.n.ena, false));
    this.jSg = new StringBuilder(50);
    jRM = paramTypedArray.getDimensionPixelSize(R.n.eni, paramContext.getDimensionPixelSize(R.f.aST));
    jRQ = paramTypedArray.getDimensionPixelSize(R.n.enk, paramContext.getDimensionPixelSize(R.f.aSV));
    jRO = paramTypedArray.getDimensionPixelSize(R.n.enj, paramContext.getDimensionPixelSize(R.f.aSU));
    jRP = paramTypedArray.getDimensionPixelOffset(R.n.ene, paramContext.getDimensionPixelOffset(R.f.aSr));
    jRK = paramTypedArray.getDimensionPixelSize(R.n.enh, paramContext.getDimensionPixelOffset(R.f.aSI));
    this.jSv = ((paramTypedArray.getDimensionPixelSize(R.n.emP, paramContext.getDimensionPixelOffset(R.f.aQX)) - jRP) / 6);
    this.jSw = paramTypedArray.getDimensionPixelSize(R.n.emQ, paramContext.getDimensionPixelOffset(R.f.aRA));
    this.jSA = Boolean.valueOf(paramTypedArray.getBoolean(R.n.enb, true));
    this.jRV = new Paint();
    this.jRV.setAntiAlias(true);
    this.jRV.setTextSize(jRQ);
    this.jRV.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
    this.jRV.setColor(this.jSa);
    this.jRV.setTextAlign(Paint.Align.LEFT);
    this.jRV.setStyle(Paint.Style.FILL);
    this.jRU = new Paint();
    this.jRU.setFakeBoldText(true);
    this.jRU.setAntiAlias(true);
    this.jRU.setColor(this.jSc);
    this.jRU.setTextAlign(Paint.Align.CENTER);
    this.jRU.setStyle(Paint.Style.FILL);
    this.jRW = new Paint();
    this.jRW.setFakeBoldText(true);
    this.jRW.setAntiAlias(true);
    this.jRW.setColor(this.jSf);
    this.jRW.setTextAlign(Paint.Align.CENTER);
    this.jRW.setStyle(Paint.Style.FILL);
    this.jRS = new Paint();
    this.jRS.setAntiAlias(true);
    this.jRS.setTextSize(jRO);
    this.jRS.setColor(this.jSa);
    this.jRS.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
    this.jRS.setStyle(Paint.Style.FILL);
    this.jRS.setTextAlign(Paint.Align.CENTER);
    this.jRS.setFakeBoldText(true);
    this.jRT = new Paint();
    this.jRT.setAntiAlias(true);
    this.jRT.setTextSize(jRM);
    this.jRT.setStyle(Paint.Style.FILL);
    this.jRT.setTextAlign(Paint.Align.CENTER);
    this.jRT.setFakeBoldText(false);
    GMTrace.o(9073789501440L, 67605);
  }
  
  private boolean a(int paramInt, Time paramTime)
  {
    GMTrace.i(9074192154624L, 67608);
    if ((this.jnc < paramTime.year) || ((this.jnc == paramTime.year) && (this.jnd < paramTime.month)) || ((this.jnd == paramTime.month) && (paramInt < paramTime.monthDay)))
    {
      GMTrace.o(9074192154624L, 67608);
      return true;
    }
    GMTrace.o(9074192154624L, 67608);
    return false;
  }
  
  private int anQ()
  {
    GMTrace.i(9074057936896L, 67607);
    if (this.jSt < this.jSq) {}
    for (int i = this.jSt + this.jSr;; i = this.jSt)
    {
      int j = this.jSq;
      GMTrace.o(9074057936896L, 67607);
      return i - j;
    }
  }
  
  private void e(Canvas paramCanvas)
  {
    GMTrace.i(9073923719168L, 67606);
    int j = jRP;
    int k = jRO / 2;
    int m = (this.mWidth - this.jRR * 2) / (this.jSr * 2);
    int i = 0;
    while (i < this.jSr)
    {
      int n = this.jSq;
      int i1 = this.jSr;
      int i2 = this.jRR;
      this.jSz.set(7, (n + i) % i1);
      paramCanvas.drawText(this.jSC.getShortWeekdays()[this.jSz.get(7)].toUpperCase(Locale.getDefault()), (i * 2 + 1) * m + i2, j - k, this.jRS);
      i += 1;
    }
    GMTrace.o(9073923719168L, 67606);
  }
  
  private void f(Canvas paramCanvas)
  {
    GMTrace.i(9074326372352L, 67609);
    int j = (this.jSv + jRM) / 2;
    int k = jRL;
    int m = jRP;
    int i1 = (this.mWidth - this.jRR * 2) / (this.jSr * 2);
    int i = anQ();
    j = j - k + m;
    k = 1;
    while ((k <= this.jSs) && ((k <= this.jSp) || (-1 == this.jSp)))
    {
      m = this.jRR + (i * 2 + 1) * i1;
      if (((this.jnd == this.jSl) && (this.jSj == k) && (this.jSn == this.jnc)) || ((this.jnd == this.jSm) && (this.jSk == k) && (this.jSo == this.jnc)) || ((this.jSh) && (this.jSp == k) && (this.jSj == -1)))
      {
        if (!this.jSu.booleanValue()) {
          break label1382;
        }
        paramCanvas.drawRoundRect(new RectF(m - jRK, j - jRM / 3 - jRK, jRK + m, j - jRM / 3 + jRK), 10.0F, 10.0F, this.jRW);
      }
      for (;;)
      {
        if ((this.jSh) && (this.jSp == k) && (this.jSj == -1))
        {
          this.jRT.setColor(this.jSf);
          this.jRT.setTypeface(Typeface.defaultFromStyle(0));
          this.jRT.setTextSize(30.0F);
          paramCanvas.drawText(this.mContext.getResources().getString(R.l.eew), m, j + 12 + jRK, this.jRT);
        }
        this.jRT.setTextSize(jRM);
        if ((!this.jSh) || (this.jSp != k))
        {
          this.jRT.setColor(this.jSb);
          this.jRT.setTypeface(Typeface.defaultFromStyle(0));
        }
        if ((this.jSj != -1) && (this.jSk != -1) && (this.jSn == this.jSo) && (this.jSl == this.jSm) && (this.jSj == this.jSk) && (k == this.jSj) && (this.jnd == this.jSl) && (this.jnc == this.jSn)) {
          this.jRT.setColor(this.jSf);
        }
        if ((this.jSj != -1) && (this.jSk != -1) && (this.jSn == this.jSo) && (this.jSn == this.jnc) && (((this.jnd == this.jSl) && (this.jSm == this.jSl) && (((this.jSj < this.jSk) && (k > this.jSj) && (k < this.jSk)) || ((this.jSj > this.jSk) && (k < this.jSj) && (k > this.jSk)))) || ((this.jSl < this.jSm) && (this.jnd == this.jSl) && (k > this.jSj)) || ((this.jSl < this.jSm) && (this.jnd == this.jSm) && (k < this.jSk)) || ((this.jSl > this.jSm) && (this.jnd == this.jSl) && (k < this.jSj)) || ((this.jSl > this.jSm) && (this.jnd == this.jSm) && (k > this.jSk)))) {
          this.jRT.setColor(this.jSf);
        }
        if ((this.jSj != -1) && (this.jSk != -1) && (this.jSn != this.jSo) && (((this.jSn == this.jnc) && (this.jnd == this.jSl)) || ((this.jSo == this.jnc) && (this.jnd == this.jSm) && (((this.jSl < this.jSm) && (this.jnd == this.jSl) && (k < this.jSj)) || ((this.jSl < this.jSm) && (this.jnd == this.jSm) && (k > this.jSk)) || ((this.jSl > this.jSm) && (this.jnd == this.jSl) && (k > this.jSj)) || ((this.jSl > this.jSm) && (this.jnd == this.jSm) && (k < this.jSk)))))) {
          this.jRT.setColor(this.jSf);
        }
        if ((this.jSj != -1) && (this.jSk != -1) && (this.jSn == this.jSo) && (this.jnc == this.jSn) && (((this.jnd > this.jSl) && (this.jnd < this.jSm) && (this.jSl < this.jSm)) || ((this.jnd < this.jSl) && (this.jnd > this.jSm) && (this.jSl > this.jSm)))) {
          this.jRT.setColor(this.jSf);
        }
        if ((this.jSj != -1) && (this.jSk != -1) && (this.jSn != this.jSo) && (((this.jSn < this.jSo) && (((this.jnd > this.jSl) && (this.jnc == this.jSn)) || ((this.jnd < this.jSm) && (this.jnc == this.jSo)))) || ((this.jSn > this.jSo) && (((this.jnd < this.jSl) && (this.jnc == this.jSn)) || ((this.jnd > this.jSm) && (this.jnc == this.jSo)))))) {
          this.jRT.setColor(this.jSf);
        }
        if ((!this.jSA.booleanValue()) && (a(k, this.jSx)) && (this.jSx.month == this.jnd) && (this.jSx.year == this.jnc))
        {
          this.jRT.setColor(this.jSd);
          this.jRT.setTypeface(Typeface.defaultFromStyle(2));
        }
        Iterator localIterator = this.jOw.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.plugin.chatroom.d.a locala = (com.tencent.mm.plugin.chatroom.d.a)localIterator.next();
          if ((locala.jqS == k) && (locala.month == this.jnd) && (locala.year == this.jnc))
          {
            this.jRT.setColor(this.jSe);
            this.jRT.setTypeface(Typeface.defaultFromStyle(0));
          }
        }
        label1382:
        paramCanvas.drawCircle(m, j - jRM / 3, jRK, this.jRW);
      }
      if (((this.jnd == this.jSl) && (this.jSj == k) && (this.jSn == this.jnc)) || ((this.jnd == this.jSm) && (this.jSk == k) && (this.jSo == this.jnc)) || ((this.jSh) && (this.jSp == k) && (this.jSj == -1)))
      {
        this.jRT.setTypeface(Typeface.defaultFromStyle(0));
        this.jRT.setColor(-1);
      }
      paramCanvas.drawText(String.format("%d", new Object[] { Integer.valueOf(k) }), m, j, this.jRT);
      int n = i + 1;
      i = n;
      m = j;
      if (n == this.jSr)
      {
        i = 0;
        m = j + this.jSv;
      }
      k += 1;
      j = m;
    }
    GMTrace.o(9074326372352L, 67609);
  }
  
  public final void e(HashMap<String, Integer> paramHashMap)
  {
    int k = 0;
    GMTrace.i(9074997460992L, 67614);
    if ((!paramHashMap.containsKey("month")) && (!paramHashMap.containsKey("year"))) {
      throw new InvalidParameterException("You must specify month and year for this view");
    }
    setTag(paramHashMap);
    if (paramHashMap.containsKey("height"))
    {
      this.jSv = ((Integer)paramHashMap.get("height")).intValue();
      if (this.jSv < jRN) {
        this.jSv = jRN;
      }
    }
    if (paramHashMap.containsKey("selected_begin_day")) {
      this.jSj = ((Integer)paramHashMap.get("selected_begin_day")).intValue();
    }
    if (paramHashMap.containsKey("selected_last_day")) {
      this.jSk = ((Integer)paramHashMap.get("selected_last_day")).intValue();
    }
    if (paramHashMap.containsKey("selected_begin_month")) {
      this.jSl = ((Integer)paramHashMap.get("selected_begin_month")).intValue();
    }
    if (paramHashMap.containsKey("selected_last_month")) {
      this.jSm = ((Integer)paramHashMap.get("selected_last_month")).intValue();
    }
    if (paramHashMap.containsKey("selected_begin_year")) {
      this.jSn = ((Integer)paramHashMap.get("selected_begin_year")).intValue();
    }
    if (paramHashMap.containsKey("selected_last_year")) {
      this.jSo = ((Integer)paramHashMap.get("selected_last_year")).intValue();
    }
    this.jnd = ((Integer)paramHashMap.get("month")).intValue();
    this.jnc = ((Integer)paramHashMap.get("year")).intValue();
    this.jSh = false;
    this.jSp = -1;
    this.jSy.set(2, this.jnd);
    this.jSy.set(1, this.jnc);
    this.jSy.set(5, 1);
    this.jSt = this.jSy.get(7);
    if (paramHashMap.containsKey("week_start"))
    {
      this.jSq = ((Integer)paramHashMap.get("week_start")).intValue();
      this.jSs = com.tencent.mm.plugin.chatroom.f.a.bO(this.jnd, this.jnc);
      i = 0;
      label388:
      if (i >= this.jSs) {
        break label494;
      }
      m = i + 1;
      paramHashMap = this.jSx;
      if ((this.jnc != paramHashMap.year) || (this.jnd != paramHashMap.month) || (m != paramHashMap.monthDay)) {
        break label489;
      }
    }
    label489:
    for (int j = 1;; j = 0)
    {
      if (j != 0)
      {
        this.jSh = true;
        this.jSp = m;
      }
      this.jSi = a(m, this.jSx);
      i += 1;
      break label388;
      this.jSq = this.jSy.getFirstDayOfWeek();
      break;
    }
    label494:
    int m = anQ();
    j = (this.jSs + m) / this.jSr;
    int i = k;
    if ((m + this.jSs) % this.jSr > 0) {
      i = 1;
    }
    this.jSB = (j + i);
    GMTrace.o(9074997460992L, 67614);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(9074460590080L, 67610);
    int i = (this.mWidth - this.jRR * 2) / (this.jSr * 2);
    int j = this.jRR;
    int k = jRQ / 2;
    int m = (jRP - jRQ) / 2;
    int n = jRQ;
    this.jSg.setLength(0);
    long l = this.jSy.getTimeInMillis();
    StringBuilder localStringBuilder = new StringBuilder(DateUtils.formatDateRange(getContext(), l, l, 52).toLowerCase());
    localStringBuilder.setCharAt(0, Character.toUpperCase(localStringBuilder.charAt(0)));
    paramCanvas.drawText(localStringBuilder.toString(), i + j - k, m + n, this.jRV);
    paramCanvas.drawLine(0.0F, jRP, this.mWidth, jRP + 1, this.jRV);
    e(paramCanvas);
    f(paramCanvas);
    GMTrace.o(9074460590080L, 67610);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(9074594807808L, 67611);
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), this.jSv * this.jSB + jRP + this.jSw);
    GMTrace.o(9074594807808L, 67611);
  }
  
  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(9074729025536L, 67612);
    this.mWidth = paramInt1;
    GMTrace.o(9074729025536L, 67612);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(9074863243264L, 67613);
    float f1;
    float f2;
    int i;
    if (paramMotionEvent.getAction() == 1)
    {
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      i = this.jRR;
      if ((f1 >= i) && (f1 <= this.mWidth - this.jRR)) {
        break label142;
      }
      paramMotionEvent = null;
    }
    for (;;)
    {
      if ((paramMotionEvent != null) && (this.jSD != null) && ((this.jSA.booleanValue()) || (paramMotionEvent.month != this.jSx.month) || (paramMotionEvent.year != this.jSx.year) || (paramMotionEvent.jqS >= this.jSx.monthDay))) {
        this.jSD.b(paramMotionEvent);
      }
      GMTrace.o(9074863243264L, 67613);
      return true;
      label142:
      int j = (int)(f2 - jRP) / this.jSv;
      i = (int)((f1 - i) * this.jSr / (this.mWidth - i - this.jRR)) - anQ() + 1 + j * this.jSr;
      if ((this.jnd > 11) || (this.jnd < 0) || (com.tencent.mm.plugin.chatroom.f.a.bO(this.jnd, this.jnc) < i) || (i <= 0))
      {
        paramMotionEvent = null;
      }
      else
      {
        com.tencent.mm.plugin.chatroom.d.a locala = new com.tencent.mm.plugin.chatroom.d.a(this.jnc, this.jnd, i);
        Iterator localIterator = this.jOw.iterator();
        for (;;)
        {
          if (localIterator.hasNext())
          {
            paramMotionEvent = (com.tencent.mm.plugin.chatroom.d.a)localIterator.next();
            if (paramMotionEvent.equals(locala)) {
              break;
            }
          }
        }
        paramMotionEvent = null;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void b(com.tencent.mm.plugin.chatroom.d.a parama);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */