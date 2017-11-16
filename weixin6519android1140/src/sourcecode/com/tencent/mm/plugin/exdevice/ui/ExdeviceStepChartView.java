package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Point;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.w;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ExdeviceStepChartView
  extends View
{
  Paint jrC;
  private final int kKA;
  private final int kKB;
  private int kKC;
  private int kKD;
  private int kKE;
  private final float kKF;
  private final float kKG;
  private final int kKH;
  private final float kKI;
  private final int kKJ;
  private final float kKK;
  private final int kKL;
  private final float kKM;
  private final int kKN;
  private final float kKO;
  private final int kKP;
  private final float kKQ;
  private final int kKR;
  private final float kKS;
  private final int kKT;
  private final float kKU;
  private final int kKV;
  private final float kKW;
  private final int kKX;
  private final float kKY;
  private final int kKZ;
  private final int kKq;
  private final int kKr;
  private final int kKs;
  private final float kKt;
  private final float kKu;
  private final float kKv;
  private final float kKw;
  private final float kKx;
  private final int kKy;
  private final int kKz;
  private final int kLA;
  private final int kLB;
  private final int kLC;
  private final int kLD;
  private int kLE;
  private final Typeface kLF;
  private final Typeface kLG;
  private int kLH;
  private int kLI;
  int[] kLJ;
  private final int kLK;
  private float[] kLL;
  private float[] kLM;
  private boolean[] kLN;
  Path kLO;
  Path kLP;
  List<String> kLQ;
  private boolean kLR;
  PathEffect kLS;
  private int kLT;
  private int kLU;
  private boolean kLV;
  private final float kLa;
  private final int kLb;
  private final float kLc;
  private final int kLd;
  private final float kLe;
  private final float kLf;
  private final float kLg;
  private final float kLh;
  private final int kLi;
  private final int kLj;
  private final int kLk;
  private final int kLl;
  private final float kLm;
  private final int kLn;
  private final float kLo;
  private final int kLp;
  private final float kLq;
  private final int kLr;
  private final float kLs;
  private final int kLt;
  private final float kLu;
  private final int kLv;
  private final int kLw;
  private final int kLx;
  private final int kLy;
  private final int kLz;
  List<Point> points;
  
  public ExdeviceStepChartView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11011490840576L, 82042);
    this.kKq = -1;
    this.kKr = -1;
    this.kKs = getResources().getColor(R.e.aNy);
    this.kKt = 12.0F;
    this.kKu = 28.0F;
    this.kKv = 33.0F;
    this.kKw = 12.0F;
    this.kKx = 12.0F;
    this.kKy = getResources().getColor(R.e.aNz);
    this.kKz = -1;
    this.kKA = getResources().getColor(R.e.aNz);
    this.kKB = -1;
    this.kKC = Integer.MAX_VALUE;
    this.kKD = 0;
    this.kKE = 0;
    this.kKF = 10.0F;
    this.kKG = 2.5F;
    this.kKH = ((int)i(1, 2.5F));
    this.kKI = 4.0F;
    this.kKJ = ((int)i(1, 4.0F));
    this.kKK = 1.8F;
    this.kKL = ((int)i(1, 1.8F));
    this.kKM = 1.0F;
    this.kKN = ((int)i(1, 1.0F));
    this.kKO = 8.0F;
    this.kKP = ((int)i(1, 8.0F));
    this.kKQ = 22.0F;
    this.kKR = ((int)i(1, 22.0F));
    this.kKS = 67.0F;
    this.kKT = ((int)i(1, 67.0F));
    this.kKU = 40.0F;
    this.kKV = ((int)i(1, 40.0F));
    this.kKW = 22.0F;
    this.kKX = ((int)i(1, 22.0F));
    this.kKY = 55.0F;
    this.kKZ = ((int)i(1, 55.0F));
    this.kLa = 35.0F;
    this.kLb = ((int)i(1, 35.0F));
    this.kLc = 45.0F;
    this.kLd = ((int)i(1, 45.0F));
    this.kLe = 8.0F;
    this.kLf = ((int)i(1, 8.0F));
    this.kLg = 8.0F;
    this.kLh = ((int)i(1, 8.0F));
    this.kLi = 2;
    this.kLj = ((int)i(1, 2.0F));
    this.kLk = 15;
    this.kLl = ((int)i(1, 15.0F));
    this.kLm = 33.0F;
    this.kLn = ((int)i(1, 33.0F));
    this.kLo = 8.0F;
    this.kLp = ((int)i(1, 8.0F));
    this.kLq = 35.0F;
    this.kLr = ((int)i(1, 35.0F));
    this.kLs = 10.0F;
    this.kLt = ((int)i(1, 10.0F));
    this.kLu = 58.0F;
    this.kLv = ((int)i(1, 58.0F));
    this.kLw = ((int)i(1, 1.0F));
    this.kLx = 102;
    this.kLy = 102;
    this.kLz = 153;
    this.kLA = 102;
    this.kLB = 102;
    this.kLC = 102;
    this.kLD = 204;
    this.kLE = 0;
    this.kLF = Typeface.create(Typeface.DEFAULT_BOLD, 0);
    this.kLG = Typeface.create(Typeface.DEFAULT_BOLD, 1);
    this.kLH = 0;
    this.kLI = 0;
    this.kLJ = new int[] { 0, 0, 0, 0, 0, 0, 0 };
    this.kLK = 7;
    this.kLL = new float[7];
    this.kLM = new float[7];
    this.kLN = new boolean[7];
    this.kLR = false;
    this.kLS = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
    avb();
    GMTrace.o(11011490840576L, 82042);
  }
  
  public ExdeviceStepChartView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11011625058304L, 82043);
    this.kKq = -1;
    this.kKr = -1;
    this.kKs = getResources().getColor(R.e.aNy);
    this.kKt = 12.0F;
    this.kKu = 28.0F;
    this.kKv = 33.0F;
    this.kKw = 12.0F;
    this.kKx = 12.0F;
    this.kKy = getResources().getColor(R.e.aNz);
    this.kKz = -1;
    this.kKA = getResources().getColor(R.e.aNz);
    this.kKB = -1;
    this.kKC = Integer.MAX_VALUE;
    this.kKD = 0;
    this.kKE = 0;
    this.kKF = 10.0F;
    this.kKG = 2.5F;
    this.kKH = ((int)i(1, 2.5F));
    this.kKI = 4.0F;
    this.kKJ = ((int)i(1, 4.0F));
    this.kKK = 1.8F;
    this.kKL = ((int)i(1, 1.8F));
    this.kKM = 1.0F;
    this.kKN = ((int)i(1, 1.0F));
    this.kKO = 8.0F;
    this.kKP = ((int)i(1, 8.0F));
    this.kKQ = 22.0F;
    this.kKR = ((int)i(1, 22.0F));
    this.kKS = 67.0F;
    this.kKT = ((int)i(1, 67.0F));
    this.kKU = 40.0F;
    this.kKV = ((int)i(1, 40.0F));
    this.kKW = 22.0F;
    this.kKX = ((int)i(1, 22.0F));
    this.kKY = 55.0F;
    this.kKZ = ((int)i(1, 55.0F));
    this.kLa = 35.0F;
    this.kLb = ((int)i(1, 35.0F));
    this.kLc = 45.0F;
    this.kLd = ((int)i(1, 45.0F));
    this.kLe = 8.0F;
    this.kLf = ((int)i(1, 8.0F));
    this.kLg = 8.0F;
    this.kLh = ((int)i(1, 8.0F));
    this.kLi = 2;
    this.kLj = ((int)i(1, 2.0F));
    this.kLk = 15;
    this.kLl = ((int)i(1, 15.0F));
    this.kLm = 33.0F;
    this.kLn = ((int)i(1, 33.0F));
    this.kLo = 8.0F;
    this.kLp = ((int)i(1, 8.0F));
    this.kLq = 35.0F;
    this.kLr = ((int)i(1, 35.0F));
    this.kLs = 10.0F;
    this.kLt = ((int)i(1, 10.0F));
    this.kLu = 58.0F;
    this.kLv = ((int)i(1, 58.0F));
    this.kLw = ((int)i(1, 1.0F));
    this.kLx = 102;
    this.kLy = 102;
    this.kLz = 153;
    this.kLA = 102;
    this.kLB = 102;
    this.kLC = 102;
    this.kLD = 204;
    this.kLE = 0;
    this.kLF = Typeface.create(Typeface.DEFAULT_BOLD, 0);
    this.kLG = Typeface.create(Typeface.DEFAULT_BOLD, 1);
    this.kLH = 0;
    this.kLI = 0;
    this.kLJ = new int[] { 0, 0, 0, 0, 0, 0, 0 };
    this.kLK = 7;
    this.kLL = new float[7];
    this.kLM = new float[7];
    this.kLN = new boolean[7];
    this.kLR = false;
    this.kLS = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
    avb();
    GMTrace.o(11011625058304L, 82043);
  }
  
  private int aa(float paramFloat)
  {
    GMTrace.i(11012967235584L, 82053);
    this.kKC = Integer.MAX_VALUE;
    int i;
    if (this.points.size() > 0) {
      i = 0;
    }
    for (;;)
    {
      if (i < this.points.size())
      {
        if (i != 0) {
          break label106;
        }
        if ((paramFloat >= ((Point)this.points.get(i)).x + this.kLH / 2) || (paramFloat <= 0.0F)) {
          break label270;
        }
        this.kKC = i;
        invalidate();
      }
      for (;;)
      {
        i = this.kKC;
        GMTrace.o(11012967235584L, 82053);
        return i;
        label106:
        if ((i > 0) && (i < this.points.size() - 1))
        {
          if ((paramFloat >= ((Point)this.points.get(i)).x + this.kLH / 2) || (paramFloat <= ((Point)this.points.get(i)).x - this.kLH / 2)) {
            break;
          }
          this.kKC = i;
          invalidate();
        }
        else if (i == this.points.size() - 1)
        {
          if ((paramFloat >= this.kKD) || (paramFloat <= ((Point)this.points.get(i)).x - this.kLH / 2)) {
            break;
          }
          this.kKC = i;
          invalidate();
        }
        else
        {
          this.kKC = Integer.MAX_VALUE;
        }
      }
      label270:
      i += 1;
    }
  }
  
  private void avb()
  {
    GMTrace.i(11012430364672L, 82049);
    this.jrC = new Paint();
    this.kLO = new Path();
    this.kLP = new Path();
    this.points = new LinkedList();
    this.kLQ = new LinkedList();
    avc();
    GMTrace.o(11012430364672L, 82049);
  }
  
  private void avc()
  {
    GMTrace.i(11012564582400L, 82050);
    int i = 0;
    if (i < 7)
    {
      if (i == 6) {
        this.kLN[i] = true;
      }
      for (;;)
      {
        i += 1;
        break;
        this.kLN[i] = false;
      }
    }
    GMTrace.o(11012564582400L, 82050);
  }
  
  private void avd()
  {
    GMTrace.i(11012698800128L, 82051);
    this.jrC.reset();
    this.jrC.setAntiAlias(true);
    this.jrC.setStrokeWidth(this.kKL);
    this.jrC.setStyle(Paint.Style.STROKE);
    this.jrC.setColor(-1);
    GMTrace.o(11012698800128L, 82051);
  }
  
  private void b(Canvas paramCanvas, List<String> paramList)
  {
    GMTrace.i(11012296146944L, 82048);
    if ((paramList != null) && (paramList.size() == 7))
    {
      this.jrC.reset();
      this.jrC.setAntiAlias(true);
      this.jrC.setStrokeWidth(0.0F);
      this.jrC.setTextSize(i(2, 12.0F));
      this.jrC.setAlpha(153);
      int i = 0;
      if (i < paramList.size())
      {
        if (i == 0)
        {
          this.jrC.setTextAlign(Paint.Align.LEFT);
          label97:
          if (this.kLN[i] == 0) {
            break label179;
          }
          this.jrC.setColor(-1);
        }
        for (;;)
        {
          paramCanvas.drawText((String)paramList.get(i), ((Point)this.points.get(i)).x, this.kKE - this.kLl, this.jrC);
          i += 1;
          break;
          this.jrC.setTextAlign(Paint.Align.CENTER);
          break label97;
          label179:
          this.jrC.setColor(this.kKy);
        }
      }
    }
    GMTrace.o(11012296146944L, 82048);
  }
  
  private void c(Canvas paramCanvas, boolean paramBoolean)
  {
    int i = 0;
    GMTrace.i(11011759276032L, 82044);
    if (paramBoolean)
    {
      this.kLP.reset();
      this.kLP.moveTo(((Point)this.points.get(0)).x, ((Point)this.points.get(0)).y);
      i = 0;
      while (i < this.points.size())
      {
        this.kLP.lineTo(((Point)this.points.get(i)).x, ((Point)this.points.get(i)).y);
        i += 1;
      }
      this.kLP.lineTo(this.kLL[(this.kLL.length - 1)], this.kKE - this.kLb - 1);
      this.kLP.lineTo(this.kKP, this.kKE - this.kLb - 1);
      this.kLP.lineTo(this.kKP, this.kLM[0]);
      paramCanvas.drawPath(this.kLP, this.jrC);
      GMTrace.o(11011759276032L, 82044);
      return;
    }
    this.kLP.reset();
    this.kLP.moveTo(((Point)this.points.get(0)).x, ((Point)this.points.get(0)).y);
    if (i < this.points.size())
    {
      if (i > 0) {
        if (((Point)this.points.get(i - 1)).y == this.kKE - this.kKV)
        {
          this.jrC.reset();
          DashPathEffect localDashPathEffect = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
          this.jrC.setPathEffect(localDashPathEffect);
          this.jrC.setAntiAlias(true);
          this.jrC.setStrokeWidth(this.kKL);
          this.jrC.setStyle(Paint.Style.STROKE);
          this.jrC.setColor(-1);
        }
      }
      for (;;)
      {
        this.kLP.lineTo(((Point)this.points.get(i)).x, ((Point)this.points.get(i)).y);
        paramCanvas.drawPath(this.kLP, this.jrC);
        this.kLP.reset();
        this.kLP.moveTo(((Point)this.points.get(i)).x, ((Point)this.points.get(i)).y);
        i += 1;
        break;
        avd();
        continue;
        avd();
      }
    }
    GMTrace.o(11011759276032L, 82044);
  }
  
  private void g(Canvas paramCanvas)
  {
    GMTrace.i(11011893493760L, 82045);
    this.jrC.reset();
    this.jrC.setAntiAlias(true);
    this.jrC.setColor(-1);
    this.jrC.setStrokeWidth(0.0F);
    this.jrC.setStyle(Paint.Style.FILL);
    int i = 0;
    if (i < this.points.size())
    {
      Point localPoint = (Point)this.points.get(i);
      if (i == this.points.size() - 1) {
        paramCanvas.drawCircle(localPoint.x, localPoint.y, this.kKJ, this.jrC);
      }
      for (;;)
      {
        i += 1;
        break;
        paramCanvas.drawCircle(localPoint.x, localPoint.y, this.kKH, this.jrC);
      }
    }
    GMTrace.o(11011893493760L, 82045);
  }
  
  private float i(int paramInt, float paramFloat)
  {
    GMTrace.i(11012161929216L, 82047);
    Object localObject = getContext();
    if (localObject == null) {}
    for (localObject = Resources.getSystem();; localObject = ((Context)localObject).getResources())
    {
      paramFloat = TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics());
      GMTrace.o(11012161929216L, 82047);
      return paramFloat;
    }
  }
  
  public final void ava()
  {
    GMTrace.i(11012027711488L, 82046);
    this.kLR = true;
    SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat(getResources().getString(R.l.drO));
    SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("d");
    this.kLQ.clear();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(new Date());
    localCalendar.add(5, -6);
    int i = 0;
    if (i < 7)
    {
      if (i == 0) {
        this.kLQ.add(localSimpleDateFormat1.format(localCalendar.getTime()));
      }
      for (;;)
      {
        localCalendar.add(5, 1);
        i += 1;
        break;
        this.kLQ.add(localSimpleDateFormat2.format(localCalendar.getTime()));
      }
    }
    invalidate();
    GMTrace.o(11012027711488L, 82046);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(11012833017856L, 82052);
    this.points.clear();
    Object localObject = findViewById(R.h.bxL);
    this.kKD = ((View)localObject).getWidth();
    this.kKE = ((View)localObject).getHeight();
    this.kLH = ((this.kKD - this.kKP - this.kKR) / 6);
    this.kLI = ((this.kKE - this.kKT - this.kKV) / 2);
    int i = 0;
    while (i < this.kLL.length)
    {
      this.kLL[i] = (this.kKP + this.kLH * i);
      i += 1;
    }
    i = this.kLJ.length;
    int k = i;
    if (i > 7) {
      k = 7;
    }
    int j = 0;
    i = 0;
    while (i < k)
    {
      if (this.kLJ[i] > 100000) {
        this.kLJ[i] = 100000;
      }
      if (this.kLJ[i] < 0) {
        this.kLJ[i] = 0;
      }
      int m = j;
      if (this.kLJ[i] > j) {
        m = this.kLJ[i];
      }
      i += 1;
      j = m;
    }
    if ((j <= 15000) && (j >= 0)) {
      i = 15000;
    }
    for (;;)
    {
      this.kLE = ((this.kKE - this.kKT - this.kKV) * 10000 / i);
      this.kLE = (this.kKE - this.kKV - this.kLE);
      j = 0;
      for (;;)
      {
        if (j < k)
        {
          this.kLM[j] = (this.kKE - this.kKV - this.kLJ[j] / i * (this.kKE - this.kKT - this.kKV));
          this.points.add(new Point((int)this.kLL[j], (int)this.kLM[j]));
          j += 1;
          continue;
          if ((j <= 15000) || (j > 100000)) {
            break label1546;
          }
          i = j;
          if (j / 5000.0D <= j / 5000.0F) {
            break;
          }
          i = (j / 5000 + 1) * 5000;
          break;
        }
      }
      super.onDraw(paramCanvas);
      float f;
      if (!this.kLR)
      {
        g(paramCanvas);
        if (this.kKC != Integer.MAX_VALUE)
        {
          i = this.kKC;
          this.jrC.reset();
          this.jrC.setColor(this.kKy);
          this.jrC.setAntiAlias(true);
          this.jrC.setStrokeWidth(0.0F);
          this.jrC.setTextSize(i(2, 12.0F));
          this.jrC.setTextAlign(Paint.Align.CENTER);
          if ((i >= 0) && (i <= 6))
          {
            if (i == 0) {
              this.jrC.setTextAlign(Paint.Align.LEFT);
            }
            if (i == 6) {
              this.jrC.setTextAlign(Paint.Align.RIGHT);
            }
            if (!this.kLV)
            {
              this.kLT = (((Point)this.points.get(i)).y - this.kLv);
              this.kLU = this.kLT;
              this.kLV = true;
            }
            if (this.kLV)
            {
              f = (float)(this.kLU / 8.0D);
              if (this.kLT > 0) {
                this.jrC.setAlpha((this.kLU - this.kLT) * 255 / this.kLU);
              }
              paramCanvas.drawText(this.kLJ[i], ((Point)this.points.get(i)).x, this.kLT + this.kLv, this.jrC);
              if (this.kLT <= 0) {
                break label1538;
              }
              if (this.kLT / this.kLU > 1.0F / f) {
                break label1511;
              }
              this.kLT -= 1;
              invalidate();
            }
          }
        }
      }
      for (;;)
      {
        i = this.kKC;
        if ((i >= 0) && (i <= 6)) {
          this.kLN[i] = true;
        }
        this.jrC.reset();
        this.kLO.reset();
        localObject = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
        this.jrC.setPathEffect((PathEffect)localObject);
        this.jrC.setColor(this.kKs);
        this.jrC.setStrokeWidth(this.kKN);
        this.jrC.setAlpha(102);
        this.jrC.setStyle(Paint.Style.STROKE);
        if ((this.kLE != 0) && (!this.kLR))
        {
          this.kLO.moveTo(this.kKP, this.kLE);
          this.kLO.lineTo(this.kKD - this.kKX, this.kLE);
          paramCanvas.drawPath(this.kLO, this.jrC);
        }
        this.jrC.reset();
        this.kLO.reset();
        this.jrC.setColor(this.kKs);
        this.jrC.setStrokeWidth(this.kKN);
        this.jrC.setStyle(Paint.Style.STROKE);
        this.jrC.setAlpha(102);
        this.kLO.reset();
        this.kLO.moveTo(this.kLf, this.kKE - this.kLb);
        this.kLO.lineTo(this.kKD - this.kLh, this.kKE - this.kLb);
        this.kLO.moveTo(this.kLf, this.kLd);
        this.kLO.lineTo(this.kKD - this.kLh, this.kLd);
        paramCanvas.drawPath(this.kLO, this.jrC);
        if (!this.kLR)
        {
          this.jrC.reset();
          this.jrC.setColor(this.kKA);
          this.jrC.setAntiAlias(true);
          this.jrC.setAlpha(102);
          this.jrC.setStrokeWidth(0.0F);
          this.jrC.setTextSize(i(2, 12.0F));
          this.jrC.setTextAlign(Paint.Align.RIGHT);
          paramCanvas.drawText(getResources().getString(R.l.drN), this.kKD - this.kLj, (float)(this.kLE + this.jrC.getTextSize() * 0.34D), this.jrC);
        }
        this.jrC.reset();
        this.jrC.setColor(-1);
        this.jrC.setAntiAlias(true);
        this.jrC.setStrokeWidth(0.0F);
        this.jrC.setTypeface(this.kLF);
        this.jrC.setTextSize(i(2, 28.0F));
        paramCanvas.drawText(getResources().getString(R.l.drP), this.kLp, this.kLn, this.jrC);
        this.jrC.setTextAlign(Paint.Align.RIGHT);
        this.jrC.setTextSize(i(2, 33.0F));
        paramCanvas.drawText(this.kLJ[(this.kLJ.length - 1)], this.kKD - this.kLt, this.kLr, this.jrC);
        if (this.points.size() > 2)
        {
          this.jrC.reset();
          this.jrC.setAntiAlias(true);
          this.jrC.setStrokeWidth(0.0F);
          this.jrC.setAlpha(102);
          this.jrC.setStyle(Paint.Style.FILL_AND_STROKE);
          localObject = new LinearGradient(0.0F, 0.0F, 0.0F, this.kKE - this.kLb, -1, 16777215, Shader.TileMode.REPEAT);
          this.jrC.setShader((Shader)localObject);
          this.jrC.setColor(-1);
          c(paramCanvas, true);
          avd();
          if (!this.kLR) {
            c(paramCanvas, false);
          }
        }
        b(paramCanvas, this.kLQ);
        GMTrace.o(11012833017856L, 82052);
        return;
        label1511:
        this.kLT = ((int)(this.kLT - this.kLT / this.kLU * f));
        break;
        label1538:
        this.kLV = false;
      }
      label1546:
      i = 0;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(11013101453312L, 82054);
    float f = paramMotionEvent.getX();
    paramMotionEvent.getY();
    w.i("MicroMsg.exdevice.ExdeviceStepChartView", "mOnTouchLinePsition:" + this.kKC);
    switch (paramMotionEvent.getAction())
    {
    default: 
      w.d("MicroMsg.exdevice.ExdeviceStepChartView", "default");
      GMTrace.o(11013101453312L, 82054);
      return false;
    case 0: 
      w.d("MicroMsg.exdevice.ExdeviceStepChartView", "ACTION_DOWN");
      GMTrace.o(11013101453312L, 82054);
      return true;
    }
    w.d("MicroMsg.exdevice.ExdeviceStepChartView", "ACTION_UP");
    this.kKC = aa(f);
    avc();
    this.kLV = false;
    invalidate();
    GMTrace.o(11013101453312L, 82054);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceStepChartView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */