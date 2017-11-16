package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import java.util.ArrayList;
import java.util.List;

public class TextViewMultilineEllipse
  extends View
{
  private Context context;
  private TextPaint fB;
  private String iJz;
  private int mek;
  private int pVG;
  private String pVH;
  private String pVI;
  private boolean pVJ;
  private int pVK;
  private boolean pVL;
  private boolean pVM;
  private a qjy;
  private a qjz;
  private int textSize;
  
  public TextViewMultilineEllipse(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8389279088640L, 62505);
    this.textSize = -1;
    this.context = paramContext;
    this.pVM = false;
    this.pVJ = true;
    this.pVL = false;
    this.mek = -1;
    this.pVH = "...";
    this.pVI = "";
    this.pVK = -16776961;
    this.qjy = new a();
    this.qjz = new a();
    this.fB = new TextPaint();
    this.fB.setAntiAlias(true);
    if (this.textSize == -1)
    {
      this.textSize = BackwardSupportUtil.b.a(this.context, 12.0F);
      this.fB.setTextSize(this.textSize);
    }
    for (;;)
    {
      this.fB.setColor(-16777216);
      this.fB.setTextAlign(Paint.Align.LEFT);
      GMTrace.o(8389279088640L, 62505);
      return;
      this.fB.setTextSize(13.0F);
    }
  }
  
  private int vl(int paramInt)
  {
    GMTrace.i(8389681741824L, 62508);
    if (this.pVM) {}
    for (paramInt = this.qjy.a(this.iJz, null, null, -1, paramInt - getPaddingLeft() - getPaddingRight(), this.fB);; paramInt = this.qjz.a(this.iJz, this.pVH, this.pVI, this.mek, paramInt - getPaddingLeft() - getPaddingRight(), this.fB))
    {
      int i = getPaddingLeft();
      int j = getPaddingRight();
      GMTrace.o(8389681741824L, 62508);
      return paramInt + i + j;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8389547524096L, 62507);
    super.onDraw(paramCanvas);
    a locala;
    ArrayList localArrayList;
    float f2;
    float f1;
    int i;
    label56:
    int j;
    if (this.pVM)
    {
      locala = this.qjy;
      localArrayList = this.qjy.pVS;
      f2 = getPaddingLeft();
      f1 = getPaddingTop() + -this.pVG;
      i = 0;
      if (i >= localArrayList.size()) {
        break label310;
      }
      int[] arrayOfInt = (int[])localArrayList.get(i);
      paramCanvas.drawText(this.iJz, arrayOfInt[0], arrayOfInt[1] + 1, f2, f1, this.fB);
      if ((i == localArrayList.size() - 1) && (locala.pVR))
      {
        paramCanvas.drawText(this.pVH, locala.pVT + f2, f1, this.fB);
        if (this.pVJ)
        {
          j = this.fB.getColor();
          this.fB.setColor(this.pVK);
          if (!this.pVL) {
            break label281;
          }
          paramCanvas.drawText(this.pVI, paramCanvas.getWidth() - (locala.pVV + getPaddingRight() + getPaddingLeft()), f1, this.fB);
        }
      }
    }
    for (;;)
    {
      this.fB.setColor(j);
      f1 += -this.pVG + this.fB.descent();
      if (f1 > paramCanvas.getHeight()) {
        break label310;
      }
      i += 1;
      break label56;
      locala = this.qjz;
      localArrayList = this.qjz.pVS;
      break;
      label281:
      paramCanvas.drawText(this.pVI, locala.pVT + locala.pVU + f2, f1, this.fB);
    }
    label310:
    GMTrace.o(8389547524096L, 62507);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8389413306368L, 62506);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (i == 1073741824) {
      vl(paramInt1);
    }
    int k;
    for (;;)
    {
      k = View.MeasureSpec.getMode(paramInt2);
      i = View.MeasureSpec.getSize(paramInt2);
      this.pVG = ((int)this.fB.ascent());
      if (k != 1073741824) {
        break;
      }
      paramInt2 = i;
      setMeasuredDimension(paramInt1, paramInt2);
      GMTrace.o(8389413306368L, 62506);
      return;
      if (i == Integer.MIN_VALUE)
      {
        paramInt1 = Math.min(vl(paramInt1), paramInt1);
      }
      else
      {
        vl(paramInt1);
        paramInt1 = 0;
      }
    }
    if (this.pVM) {}
    for (paramInt2 = this.qjy.pVS.size();; paramInt2 = this.qjz.pVS.size())
    {
      int j = paramInt2 * (int)(-this.pVG + this.fB.descent()) + getPaddingTop() + getPaddingBottom();
      paramInt2 = j;
      if (k != Integer.MIN_VALUE) {
        break;
      }
      paramInt2 = Math.min(j, i);
      break;
    }
  }
  
  private static final class a
  {
    boolean pVR;
    ArrayList<int[]> pVS;
    float pVT;
    float pVU;
    float pVV;
    
    public a()
    {
      GMTrace.i(8709522587648L, 64891);
      this.pVR = false;
      this.pVS = new ArrayList();
      GMTrace.o(8709522587648L, 64891);
    }
    
    public final int a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, TextPaint paramTextPaint)
    {
      GMTrace.i(8709656805376L, 64892);
      this.pVS.clear();
      this.pVR = false;
      this.pVT = 0.0F;
      this.pVU = 0.0F;
      this.pVV = 0.0F;
      if (paramInt2 == -1)
      {
        this.pVS.add(new int[] { 0, paramString1.length() });
        paramInt1 = (int)(paramTextPaint.measureText(paramString1) + 0.5F);
        GMTrace.o(8709656805376L, 64892);
        return paramInt1;
      }
      if (paramString2 != null) {
        this.pVU = paramTextPaint.measureText(paramString2);
      }
      if (paramString3 != null) {
        this.pVV = paramTextPaint.measureText(paramString3);
      }
      int j = -1;
      float f1 = 0.0F;
      int n = 1;
      int i = 0;
      int m = paramInt2;
      paramInt2 = i;
      if (paramInt2 < paramString1.length())
      {
        i = j;
        if (j == -1) {
          i = paramInt2;
        }
        if (this.pVS.size() == paramInt1) {
          this.pVR = true;
        }
      }
      else
      {
        if (this.pVR)
        {
          paramString2 = (int[])this.pVS.get(this.pVS.size() - 1);
          this.pVT = paramTextPaint.measureText(paramString1.substring(paramString2[0], paramString2[1] + 1));
        }
        if (this.pVS.size() != 0) {
          break label587;
        }
        GMTrace.o(8709656805376L, 64892);
        return 0;
      }
      float f2 = paramTextPaint.measureText(paramString1.charAt(paramInt2));
      j = 0;
      label308:
      int i1;
      int k;
      if (paramString1.charAt(paramInt2) == '\n')
      {
        this.pVS.add(new int[] { i, paramInt2 - 1 });
        j = 1;
        if (j == 0) {
          break label513;
        }
        i = -1;
        f2 = 0.0F;
        i1 = n;
        f1 = f2;
        j = i;
        k = m;
        if (this.pVS.size() == paramInt1 - 1)
        {
          k = (int)(m - (this.pVU + this.pVV));
          i1 = 0;
          j = i;
          f1 = f2;
        }
      }
      for (;;)
      {
        paramInt2 += 1;
        n = i1;
        m = k;
        break;
        k = paramInt2;
        if (f1 + f2 >= m)
        {
          j = 1;
          if (paramString1.charAt(paramInt2) != ' ')
          {
            k = paramInt2;
            if (n != 0) {}
          }
          else
          {
            paramInt2 -= 1;
            this.pVS.add(new int[] { i, paramInt2 });
            j = 1;
            break label308;
          }
          while (paramString1.charAt(k) != ' ') {
            k -= 1;
          }
          this.pVS.add(new int[] { i, k });
        }
        paramInt2 = k;
        break label308;
        label513:
        f2 = f1 + f2;
        i1 = n;
        f1 = f2;
        j = i;
        k = m;
        if (paramInt2 == paramString1.length() - 1)
        {
          this.pVS.add(new int[] { i, paramInt2 });
          i1 = n;
          f1 = f2;
          j = i;
          k = m;
        }
      }
      label587:
      if (this.pVS.size() == 1)
      {
        paramInt1 = (int)(paramTextPaint.measureText(paramString1) + 0.5F);
        GMTrace.o(8709656805376L, 64892);
        return paramInt1;
      }
      GMTrace.o(8709656805376L, 64892);
      return m;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\TextViewMultilineEllipse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */