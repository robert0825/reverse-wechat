package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.ColorStateList;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.v.a.d;
import junit.framework.Assert;

public final class r
{
  private static r xjM;
  private ColorStateList[] woO;
  private boolean xjN;
  
  static
  {
    GMTrace.i(1945620185088L, 14496);
    xjM = null;
    GMTrace.o(1945620185088L, 14496);
  }
  
  private r(Context paramContext)
  {
    GMTrace.i(1945083314176L, 14492);
    this.woO = new ColorStateList[2];
    this.xjN = false;
    this.woO[0] = a.U(paramContext, a.d.gco);
    this.woO[1] = a.U(paramContext, a.d.gcp);
    GMTrace.o(1945083314176L, 14492);
  }
  
  private static r fE(Context paramContext)
  {
    GMTrace.i(1945217531904L, 14493);
    if (paramContext != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if ((xjM == null) || (!xjM.xjN)) {
        xjM = new r(paramContext);
      }
      paramContext = xjM;
      GMTrace.o(1945217531904L, 14493);
      return paramContext;
    }
  }
  
  public static ColorStateList fF(Context paramContext)
  {
    GMTrace.i(1945351749632L, 14494);
    paramContext = fE(paramContext).woO[0];
    GMTrace.o(1945351749632L, 14494);
    return paramContext;
  }
  
  public static ColorStateList fG(Context paramContext)
  {
    GMTrace.i(1945485967360L, 14495);
    paramContext = fE(paramContext).woO[1];
    GMTrace.o(1945485967360L, 14495);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\tools\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */