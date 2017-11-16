package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.base.q;

public class IPCallCountryCodeScrollbar
  extends View
{
  public static final String[] mpm;
  private float gbV;
  private Paint jrC;
  protected float mpn;
  protected int mpo;
  protected String[] mpp;
  private int mpq;
  private float mpr;
  private float mps;
  private q mpt;
  private TextView mpu;
  private int mpv;
  a mpw;
  
  static
  {
    GMTrace.i(11720965750784L, 87328);
    mpm = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
    GMTrace.o(11720965750784L, 87328);
  }
  
  public IPCallCountryCodeScrollbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11720428879872L, 87324);
    this.mpr = 0.0F;
    this.mpp = new String[] { "↑" };
    this.mpn = 1.3F;
    this.mpo = 79;
    setFocusable(true);
    setFocusableInTouchMode(true);
    this.mpv = BackwardSupportUtil.b.a(paramContext, 3.0F);
    paramAttributeSet = inflate(paramContext, R.i.cGA, null);
    int i = BackwardSupportUtil.b.a(paramContext, this.mpo);
    this.mpt = new q(paramAttributeSet, i, i);
    this.mpu = ((TextView)paramAttributeSet.findViewById(R.h.ceL));
    this.jrC = new Paint();
    this.jrC.setAntiAlias(true);
    this.jrC.setColor(-11119018);
    this.jrC.setTextAlign(Paint.Align.CENTER);
    GMTrace.o(11720428879872L, 87324);
  }
  
  public final void Ay(String paramString)
  {
    int k = 0;
    GMTrace.i(11720294662144L, 87323);
    String[] arrayOfString1 = mpm;
    int m = arrayOfString1.length;
    int i = 0;
    int j = 0;
    while (i < m)
    {
      if (arrayOfString1[i].equals(paramString)) {
        j = 1;
      }
      i += 1;
    }
    if (j == 0) {
      paramString = "#";
    }
    m = this.mpp.length + 1;
    arrayOfString1 = new String[m];
    String[] arrayOfString2 = this.mpp;
    int n = arrayOfString2.length;
    i = 0;
    j = k;
    while (i < n)
    {
      String str = arrayOfString2[i];
      if (str.equals(paramString))
      {
        GMTrace.o(11720294662144L, 87323);
        return;
      }
      arrayOfString1[j] = str;
      j += 1;
      i += 1;
    }
    arrayOfString1[(m - 1)] = paramString;
    this.mpp = arrayOfString1;
    GMTrace.o(11720294662144L, 87323);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i = 0;
    int j = 0;
    GMTrace.i(11720563097600L, 87325);
    super.onDraw(paramCanvas);
    final int m = getMeasuredHeight();
    final int k = getMeasuredWidth();
    this.gbV = (m / (this.mpp.length * this.mpn));
    int n = getResources().getDimensionPixelSize(R.f.aQF);
    if (this.gbV > n) {
      this.gbV = n;
    }
    this.jrC.setTextSize(this.gbV);
    if (this.mpr != this.gbV)
    {
      this.mpr = this.gbV;
      post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11692511592448L, 87116);
          if (IPCallCountryCodeScrollbar.this.mpp.length <= 0)
          {
            GMTrace.o(11692511592448L, 87116);
            return;
          }
          int i = (int)IPCallCountryCodeScrollbar.a(IPCallCountryCodeScrollbar.this).measureText(IPCallCountryCodeScrollbar.this.mpp[(IPCallCountryCodeScrollbar.this.mpp.length - 1)]) + a.fromDPToPix(IPCallCountryCodeScrollbar.this.getContext(), 8);
          if (i > k)
          {
            ViewGroup.LayoutParams localLayoutParams = IPCallCountryCodeScrollbar.this.getLayoutParams();
            localLayoutParams.width = i;
            localLayoutParams.height = m;
            IPCallCountryCodeScrollbar.this.setLayoutParams(localLayoutParams);
          }
          GMTrace.o(11692511592448L, 87116);
        }
      });
    }
    if (this.gbV == n)
    {
      float f = (m - this.mpp.length * this.gbV * this.mpn) / 2.0F;
      i = j;
      while (i < this.mpp.length)
      {
        paramCanvas.drawText(this.mpp[i], k / 2.0F, this.gbV + f + i * this.gbV * this.mpn, this.jrC);
        i += 1;
      }
      GMTrace.o(11720563097600L, 87325);
      return;
    }
    while (i < this.mpp.length)
    {
      paramCanvas.drawText(this.mpp[i], k / 2.0F, this.gbV + i * this.gbV * this.mpn, this.jrC);
      i += 1;
    }
    GMTrace.o(11720563097600L, 87325);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(11720697315328L, 87326);
    if ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2))
    {
      this.mps = paramMotionEvent.getY();
      if (this.mps < 0.0F) {
        this.mps = 0.0F;
      }
      if (this.mps > getMeasuredHeight()) {
        this.mps = getMeasuredHeight();
      }
      setBackgroundDrawable(a.b(getContext(), R.g.aZN));
      float f1 = this.mps;
      float f2 = this.gbV * this.mpn;
      int j = (int)((f1 - (getMeasuredHeight() - this.mpp.length * f2) / 2.0F) / f2);
      int i = j;
      if (j < 0) {
        i = 0;
      }
      j = i;
      if (i >= this.mpp.length) {
        j = this.mpp.length - 1;
      }
      this.mpq = j;
      if (this.mpq != -1) {
        break label266;
      }
      this.mpu.setText(R.l.dVW);
      this.mpt.showAtLocation(this, 17, 0, 0);
      if (this.mpw != null)
      {
        if (this.mpq != -1) {
          break label285;
        }
        this.mpw.uW(a.X(getContext(), R.l.dVW));
      }
    }
    for (;;)
    {
      invalidate();
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
      {
        setBackgroundResource(0);
        this.mpt.dismiss();
      }
      GMTrace.o(11720697315328L, 87326);
      return true;
      label266:
      this.mpu.setText(this.mpp[this.mpq]);
      break;
      label285:
      this.mpw.uW(this.mpp[this.mpq]);
    }
  }
  
  public static abstract interface a
  {
    public abstract void uW(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallCountryCodeScrollbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */