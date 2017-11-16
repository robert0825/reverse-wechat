package com.tencent.mm.ui.widget.celltextview.f;

import android.graphics.Paint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.celltextview.c.e;
import java.util.Stack;

public final class b
  implements a
{
  private static float[] xui;
  private Paint mPaint;
  private float xuj;
  
  static
  {
    GMTrace.i(18761893543936L, 139787);
    xui = new float[26];
    GMTrace.o(18761893543936L, 139787);
  }
  
  public b()
  {
    GMTrace.i(18761356673024L, 139783);
    GMTrace.o(18761356673024L, 139783);
  }
  
  private static int dg(String paramString, int paramInt)
  {
    GMTrace.i(21010711576576L, 156542);
    int i = paramInt - 1;
    char[] arrayOfChar = com.tencent.mm.ui.widget.celltextview.g.a.ab(paramString, i, i + 1 + 1);
    if ((com.tencent.mm.ui.widget.celltextview.g.a.m(arrayOfChar[0])) && (com.tencent.mm.ui.widget.celltextview.g.a.m(arrayOfChar[1])))
    {
      paramInt = com.tencent.mm.ui.widget.celltextview.g.a.dh(paramString, i);
      GMTrace.o(21010711576576L, 156542);
      return paramInt;
    }
    GMTrace.o(21010711576576L, 156542);
    return paramInt;
  }
  
  public final com.tencent.mm.ui.widget.celltextview.c.a a(e parame, Paint paramPaint, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(18761490890752L, 139784);
    if (!parame.cjB())
    {
      parame = new com.tencent.mm.ui.widget.celltextview.c.a(parame.getLength(), parame.getWidth());
      GMTrace.o(18761490890752L, 139784);
      return parame;
    }
    this.mPaint = paramPaint;
    int n = parame.getText().indexOf('\n');
    int j;
    String str;
    label76:
    int k;
    int i;
    label91:
    int i1;
    float f1;
    Stack localStack;
    label142:
    float f2;
    char c;
    label208:
    int m;
    if (n >= 0)
    {
      j = 1;
      if (j != 0) {
        break label606;
      }
      str = parame.getText();
      k = str.length();
      if (j == 0) {
        break label623;
      }
      i = 1;
      i1 = k - i;
      f1 = -2.14748365E9F;
      localStack = new Stack();
      k = 0;
      if (k >= i1) {
        break label926;
      }
      i = 25;
      if (k + 25 < i1) {
        break label629;
      }
      i = i1 - k;
      int i2 = parame.a(k, i, xui);
      f2 = f1;
      if (f1 == -2.14748365E9F)
      {
        if (!com.tencent.mm.ui.widget.celltextview.g.a.o(str.charAt(0))) {
          break label654;
        }
        c = str.charAt(0);
        b(this.mPaint);
        f2 = -com.tencent.mm.ui.widget.celltextview.g.a.b(c, this.mPaint);
      }
      m = 0;
      f1 = f2;
      label215:
      if (m >= i2) {
        break label916;
      }
      f1 = xui[m] + f1;
      localStack.push(Float.valueOf(f1));
      f2 = f1 - paramInt1;
      if (f2 <= 0.0F) {
        break label907;
      }
      i = m + k;
      c = com.tencent.mm.ui.widget.celltextview.g.a.df(str, i);
      if (!com.tencent.mm.ui.widget.celltextview.g.a.n(c)) {
        break label660;
      }
      b(this.mPaint);
      f2 -= com.tencent.mm.ui.widget.celltextview.g.a.a(c, this.mPaint);
      label305:
      if (localStack.size() > 0) {
        localStack.pop();
      }
      if ((f2 <= b(paramPaint)) || (!com.tencent.mm.ui.widget.celltextview.g.a.n(com.tencent.mm.ui.widget.celltextview.g.a.df(str, i - 1)))) {
        break label663;
      }
      f2 = ((Float)localStack.pop()).floatValue();
      c = com.tencent.mm.ui.widget.celltextview.g.a.df(str, i - 1);
      b(this.mPaint);
      localStack.push(Float.valueOf(f2 - com.tencent.mm.ui.widget.celltextview.g.a.a(c, this.mPaint)));
      paramInt1 = i;
    }
    for (;;)
    {
      label402:
      f2 = paramInt2;
      i = paramInt1 - 1;
      parame = com.tencent.mm.ui.widget.celltextview.g.a.ab(str, i + 1, i + 2 + 1);
      paramBoolean = com.tencent.mm.ui.widget.celltextview.g.a.p(parame[1]);
      boolean bool = com.tencent.mm.ui.widget.celltextview.g.a.p(parame[0]);
      w.i("MicroMsg.NewBreakText", "[isBreakPunc] [%s:%s]", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
      if ((bool) && (!paramBoolean))
      {
        paramInt2 = com.tencent.mm.ui.widget.celltextview.g.a.di(str, i);
        if (paramInt2 > 1)
        {
          paramInt2 = dg(str, paramInt2 - 1);
          label507:
          paramInt2 = dg(str, paramInt2);
          if (paramInt2 != 0) {
            break label799;
          }
          paramInt2 = paramInt1;
        }
      }
      label546:
      label567:
      label576:
      label606:
      label623:
      label629:
      label654:
      label660:
      label663:
      label793:
      label799:
      for (;;)
      {
        i = paramInt1 - paramInt2;
        if (i >= 0) {
          break label1062;
        }
        localStack.push(Float.valueOf(f1));
        if (localStack.size() <= 0) {
          break label1056;
        }
        f1 = ((Float)localStack.peek()).floatValue();
        if (n != paramInt2) {
          break label902;
        }
        paramInt1 = 1;
        parame = new com.tencent.mm.ui.widget.celltextview.c.a(paramInt2 + paramInt1, f1);
        GMTrace.o(18761490890752L, 139784);
        return parame;
        j = 0;
        break;
        str = parame.getText().substring(0, n + 1);
        break label76;
        i = 0;
        break label91;
        if (!Character.isHighSurrogate(str.charAt(k + 25 - 1))) {
          break label142;
        }
        i = 26;
        break label142;
        f2 = 0.0F;
        break label208;
        break label305;
        if (f2 > b(paramPaint)) {
          break label1065;
        }
        i += 1;
        f1 = f2 + paramInt1;
        localStack.push(Float.valueOf(f1));
        paramInt1 = i;
        break label402;
        paramInt2 = paramInt1;
        break label507;
        if ((bool) && (paramBoolean))
        {
          paramInt2 = com.tencent.mm.ui.widget.celltextview.g.a.di(str, i);
          if (paramInt2 > 0)
          {
            i = com.tencent.mm.ui.widget.celltextview.g.a.dj(str, i + 2);
            parame = str.substring(dg(str, paramInt2 - 1), i + 1);
            if (this.mPaint.measureText(parame) > f2) {
              break label793;
            }
            paramInt2 -= 1;
            break label507;
          }
          paramInt2 = paramInt1;
          break label507;
        }
        paramInt2 = paramInt1;
        break label507;
      }
      label902:
      label907:
      label916:
      label926:
      label1056:
      label1062:
      for (;;)
      {
        if ((localStack.size() > 0) && (i > 0))
        {
          localStack.pop();
          i -= 1;
        }
        else
        {
          c = com.tencent.mm.ui.widget.celltextview.g.a.df(str, paramInt2 - 1);
          if ((paramInt1 - paramInt2 <= 0) || (!com.tencent.mm.ui.widget.celltextview.g.a.n(c))) {
            break label546;
          }
          f1 = ((Float)localStack.pop()).floatValue();
          b(this.mPaint);
          localStack.push(Float.valueOf(f1 - com.tencent.mm.ui.widget.celltextview.g.a.a(c, this.mPaint)));
          break label546;
          paramInt1 = 0;
          break label576;
          m += 1;
          break label215;
          k = i + k;
          break;
          if ((!paramBoolean) && (com.tencent.mm.ui.widget.celltextview.g.a.n(com.tencent.mm.ui.widget.celltextview.g.a.df(str, i1 - 1))))
          {
            c = com.tencent.mm.ui.widget.celltextview.g.a.df(str, i1 - 1);
            b(this.mPaint);
            f1 -= com.tencent.mm.ui.widget.celltextview.g.a.a(c, this.mPaint);
          }
          for (;;)
          {
            if (j != 0) {}
            for (paramInt2 = 1;; paramInt2 = 0)
            {
              i = paramInt2 + i1;
              paramInt2 = i;
              if (i == 0)
              {
                paramInt2 = 0;
                f1 = paramInt1;
              }
              f2 = f1;
              if (f1 < 0.0F) {
                f2 = 0.0F;
              }
              parame = new com.tencent.mm.ui.widget.celltextview.c.a(paramInt2, f2);
              GMTrace.o(18761490890752L, 139784);
              return parame;
            }
          }
          f1 = 0.0F;
          break label567;
        }
      }
      label1065:
      paramInt1 = i;
    }
  }
  
  public final float b(Paint paramPaint)
  {
    GMTrace.i(18761625108480L, 139785);
    if (0.0F == this.xuj) {
      this.xuj = paramPaint.measureText("A");
    }
    float f = this.xuj;
    GMTrace.o(18761625108480L, 139785);
    return f;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */