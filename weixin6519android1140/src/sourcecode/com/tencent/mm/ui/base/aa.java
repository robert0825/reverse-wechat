package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.bx.a.i;

public final class aa
{
  private static DisplayMetrics wiJ;
  
  static
  {
    GMTrace.i(14905684000768L, 111056);
    wiJ = null;
    GMTrace.o(14905684000768L, 111056);
  }
  
  public static a a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    GMTrace.i(16174175748096L, 120507);
    a locala = new a();
    if (wiJ == null) {
      wiJ = paramContext.getResources().getDisplayMetrics();
    }
    DisplayMetrics localDisplayMetrics = wiJ;
    int j = a.fromDPToPix(paramContext, 95);
    int i = paramInt1;
    if (paramInt1 < j) {
      i = j;
    }
    paramInt1 = 0;
    int m = 0;
    int k = 0;
    j = 0;
    if (paramInt2 < 0)
    {
      locala.iPR = 0;
      locala.iPS = (localDisplayMetrics.widthPixels - (paramInt5 * 2 + i));
      paramInt1 = 1;
      i = m;
      if (paramInt3 >= 0)
      {
        paramInt2 = paramInt3;
        if (paramInt3 <= localDisplayMetrics.heightPixels) {}
      }
      else
      {
        paramInt2 = (int)(localDisplayMetrics.heightPixels / 2.0F);
      }
      if (!paramBoolean) {
        break label296;
      }
      if (paramInt2 < paramInt4 + paramInt5) {
        break label333;
      }
      locala.qki = (paramInt2 - paramInt5 - paramInt4);
      paramInt2 = 1;
      paramInt3 = j;
      label160:
      if (paramInt2 == 0) {
        break label350;
      }
      locala.qki -= paramInt5 * 2;
      label179:
      if ((paramInt1 != 0) && (paramInt3 != 0)) {
        break label411;
      }
      if ((i == 0) || (paramInt3 == 0)) {
        break label372;
      }
      locala.wiK = a.i.emb;
    }
    for (;;)
    {
      GMTrace.o(16174175748096L, 120507);
      return locala;
      if (localDisplayMetrics.widthPixels - (paramInt2 + i + paramInt5 * 2) < 0)
      {
        locala.iPR = (paramInt2 - i - paramInt5);
        locala.iPS = (localDisplayMetrics.widthPixels - paramInt2 - paramInt5);
        i = 1;
        break;
      }
      locala.iPR = paramInt2;
      locala.iPS = (localDisplayMetrics.widthPixels - (paramInt2 + i));
      paramInt1 = 1;
      i = m;
      break;
      label296:
      if (localDisplayMetrics.heightPixels - paramInt2 < paramInt5 * 3 + paramInt4)
      {
        locala.qki = (paramInt2 - paramInt5 - paramInt4);
        paramInt2 = 1;
        paramInt3 = j;
        break label160;
      }
      label333:
      locala.qki = (paramInt2 - paramInt5);
      paramInt3 = 1;
      paramInt2 = k;
      break label160;
      label350:
      if (paramInt3 == 0) {
        break label179;
      }
      locala.qki += paramInt5 * 2;
      break label179;
      label372:
      if ((paramInt1 != 0) && (paramInt2 != 0)) {
        locala.wiK = a.i.elZ;
      } else if ((i != 0) && (paramInt2 != 0)) {
        locala.wiK = a.i.xvA;
      } else {
        label411:
        locala.wiK = a.i.ema;
      }
    }
  }
  
  public static final class a
  {
    public int iPR;
    public int iPS;
    public int qki;
    public int wiK;
    
    public a()
    {
      GMTrace.i(14905818218496L, 111057);
      GMTrace.o(14905818218496L, 111057);
    }
    
    public final String toString()
    {
      GMTrace.i(14905952436224L, 111058);
      String str = " marginLeft:" + this.iPR + " marginRight:" + this.iPS;
      GMTrace.o(14905952436224L, 111058);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */