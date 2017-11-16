package com.tencent.mm.t;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bg.a.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
  implements Cloneable
{
  public static Rect fV;
  private static int fWc;
  private static int fWd;
  public static float fWe;
  public static float fWf;
  public static Path fWg;
  public static Path fWh;
  public static Paint fWi;
  public static Paint fWj;
  public static Paint fWk;
  public static Paint fWl;
  public static Paint fWm;
  public Rect eqa;
  public Rect fWn;
  public Rect fWo;
  public Matrix mMatrix;
  
  static
  {
    GMTrace.i(19627061018624L, 146233);
    fWc = (int)ab.getResources().getDimension(a.c.tkF);
    fWd = (int)ab.getResources().getDimension(a.c.tkE);
    fWe = ab.getResources().getDimension(a.c.tkJ);
    fWf = ab.getResources().getDimension(a.c.tkI);
    fWg = new Path();
    fWh = new Path();
    fWi = new Paint();
    fWj = new Paint();
    fWk = new Paint();
    fWl = new Paint();
    fWm = new Paint();
    fV = new Rect();
    fWk.setColor(-16777216);
    fWi.setColor(-1);
    fWi.setStrokeWidth(fWc);
    fWi.setStyle(Paint.Style.STROKE);
    fWi.setAntiAlias(true);
    fWl.set(fWi);
    fWl.setStrokeWidth(fWd);
    fWm.set(fWi);
    fWm.setStrokeWidth(fWe);
    fWj.set(fWi);
    fWj.setStrokeWidth(fWc * 7);
    fWj.setColor(549174203);
    GMTrace.o(19627061018624L, 146233);
  }
  
  public a()
  {
    GMTrace.i(19626524147712L, 146229);
    this.fWn = new Rect();
    this.fWo = new Rect();
    this.mMatrix = new Matrix();
    GMTrace.o(19626524147712L, 146229);
  }
  
  public a(Rect paramRect)
  {
    GMTrace.i(19626389929984L, 146228);
    this.fWn = new Rect();
    this.fWo = new Rect();
    this.mMatrix = new Matrix();
    this.eqa = paramRect;
    GMTrace.o(19626389929984L, 146228);
  }
  
  public static void eQ(int paramInt)
  {
    GMTrace.i(19626658365440L, 146230);
    fWm.setAlpha(paramInt);
    fWi.setAlpha(paramInt);
    fWl.setAlpha((int)(0.7058824F * paramInt));
    GMTrace.o(19626658365440L, 146230);
  }
  
  public static void eR(int paramInt)
  {
    GMTrace.i(19626792583168L, 146231);
    fWk.setAlpha((int)(0.9019608F * paramInt));
    GMTrace.o(19626792583168L, 146231);
  }
  
  public final Object clone()
  {
    GMTrace.i(19626926800896L, 146232);
    Object localObject = super.clone();
    GMTrace.o(19626926800896L, 146232);
    return localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\t\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */