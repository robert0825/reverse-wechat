package com.tencent.mm.plugin.safedevice;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.o;

public final class a
  implements o
{
  public static m hnH;
  private static l hnI;
  
  public a()
  {
    GMTrace.i(12858863648768L, 95806);
    GMTrace.o(12858863648768L, 95806);
  }
  
  public static void a(Context paramContext, Intent paramIntent1, Intent paramIntent2)
  {
    GMTrace.i(12859266301952L, 95809);
    hnH.a(paramContext, paramIntent1, paramIntent2);
    GMTrace.o(12859266301952L, 95809);
  }
  
  public final void a(l paraml)
  {
    GMTrace.i(12859132084224L, 95808);
    hnI = paraml;
    GMTrace.o(12859132084224L, 95808);
  }
  
  public final void a(m paramm)
  {
    GMTrace.i(12858997866496L, 95807);
    hnH = paramm;
    GMTrace.o(12858997866496L, 95807);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\safedevice\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */