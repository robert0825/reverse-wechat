package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.tencent.gmtrace.GMTrace;

public final class a
  implements d
{
  private static int inc;
  private static int ind;
  private int Lh;
  private int Lr;
  private StaticLayout gbB;
  private SpannableString ine;
  private int inf;
  private int ing;
  private int inh;
  private int ini;
  private int inj;
  private float ink;
  private Context mContext;
  private int xj;
  
  public a(Context paramContext, SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17354754883584L, 129303);
    this.inh = -1;
    this.xj = -1;
    this.mContext = paramContext;
    this.ine = paramSpannableString;
    this.ini = b.u(this.mContext, b.inl);
    this.xj = paramInt1;
    this.ink = 3.0F;
    this.inj = paramInt2;
    paramContext = new TextPaint();
    paramContext.setAntiAlias(true);
    paramContext.setColor(this.xj);
    paramContext.setTextSize(this.ini);
    paramSpannableString = paramContext.getFontMetrics();
    this.Lr = ((int)Math.ceil(paramSpannableString.descent - paramSpannableString.top) + 2);
    this.gbB = new StaticLayout(this.ine, paramContext, (int)Layout.getDesiredWidth(this.ine, 0, this.ine.length(), paramContext) + 1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    this.Lh = this.gbB.getWidth();
    GMTrace.o(17354754883584L, 129303);
  }
  
  public final float XM()
  {
    GMTrace.i(17355157536768L, 129306);
    float f = this.ink;
    GMTrace.o(17355157536768L, 129306);
    return f;
  }
  
  public final boolean XN()
  {
    GMTrace.i(17355291754496L, 129307);
    if ((this.inf < 0) && (Math.abs(this.inf) > this.Lh))
    {
      GMTrace.o(17355291754496L, 129307);
      return true;
    }
    GMTrace.o(17355291754496L, 129307);
    return false;
  }
  
  public final int XO()
  {
    GMTrace.i(17355694407680L, 129310);
    int i = this.inj;
    GMTrace.o(17355694407680L, 129310);
    return i;
  }
  
  public final boolean a(d paramd)
  {
    GMTrace.i(17356097060864L, 129313);
    if (paramd.getWidth() + paramd.getCurrX() > inc)
    {
      GMTrace.o(17356097060864L, 129313);
      return true;
    }
    if (this.inh < 0) {
      this.inh = b.u(this.mContext, 20);
    }
    if (paramd.XM() >= this.ink)
    {
      if ((paramd.XM() == this.ink) && (inc - (paramd.getCurrX() + paramd.getWidth()) < this.inh))
      {
        GMTrace.o(17356097060864L, 129313);
        return true;
      }
      GMTrace.o(17356097060864L, 129313);
      return false;
    }
    if ((paramd.getCurrX() + paramd.getWidth()) / (paramd.XM() * b.XP()) * this.ink * b.XP() > inc - this.inh * 1.5D)
    {
      GMTrace.o(17356097060864L, 129313);
      return true;
    }
    GMTrace.o(17356097060864L, 129313);
    return false;
  }
  
  public final void b(Canvas paramCanvas, boolean paramBoolean)
  {
    GMTrace.i(17354889101312L, 129304);
    int i = paramCanvas.getWidth();
    int j = paramCanvas.getHeight();
    if ((i != inc) || (j != ind))
    {
      inc = i;
      ind = j;
    }
    paramCanvas.save();
    paramCanvas.translate(this.inf, this.ing);
    this.gbB.draw(paramCanvas);
    paramCanvas.restore();
    if (!paramBoolean) {
      this.inf = ((int)(this.inf - b.XP() * this.ink));
    }
    GMTrace.o(17354889101312L, 129304);
  }
  
  public final void bt(int paramInt1, int paramInt2)
  {
    GMTrace.i(17355023319040L, 129305);
    this.inf = paramInt1;
    this.ing = paramInt2;
    GMTrace.o(17355023319040L, 129305);
  }
  
  public final int getCurrX()
  {
    GMTrace.i(17355560189952L, 129309);
    int i = this.inf;
    GMTrace.o(17355560189952L, 129309);
    return i;
  }
  
  public final int getWidth()
  {
    GMTrace.i(17355425972224L, 129308);
    int i = this.Lh;
    GMTrace.o(17355425972224L, 129308);
    return i;
  }
  
  public final boolean iO(int paramInt)
  {
    GMTrace.i(17355828625408L, 129311);
    if (paramInt < this.inj)
    {
      GMTrace.o(17355828625408L, 129311);
      return false;
    }
    if (paramInt - this.inj <= b.inm)
    {
      GMTrace.o(17355828625408L, 129311);
      return true;
    }
    GMTrace.o(17355828625408L, 129311);
    return false;
  }
  
  public final boolean iP(int paramInt)
  {
    GMTrace.i(17355962843136L, 129312);
    if (paramInt - this.inj > b.inm)
    {
      GMTrace.o(17355962843136L, 129312);
      return true;
    }
    GMTrace.o(17355962843136L, 129312);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\danmu\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */