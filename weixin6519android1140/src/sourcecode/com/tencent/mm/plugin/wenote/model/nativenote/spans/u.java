package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;

public final class u
{
  public static final j shA;
  public static final c shB;
  public static final l shC;
  public static final h shD;
  public static final ArrayList<t> shE;
  public static final b shz;
  
  static
  {
    GMTrace.i(20624164519936L, 153662);
    shz = new b();
    shA = new j();
    shB = new c();
    shC = new l();
    shD = new h();
    ArrayList localArrayList = new ArrayList();
    shE = localArrayList;
    localArrayList.add(shz);
    shE.add(shB);
    shE.add(shC);
    shE.add(shA);
    GMTrace.o(20624164519936L, 153662);
  }
  
  private static void a(WXRTEditText paramWXRTEditText, o paramo, t... paramVarArgs)
  {
    GMTrace.i(20624030302208L, 153661);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      if (paramo == paramVarArgs[i])
      {
        GMTrace.o(20624030302208L, 153661);
        return;
      }
      i += 1;
    }
    paramo.a(paramWXRTEditText, null, null);
    GMTrace.o(20624030302208L, 153661);
  }
  
  public static void a(WXRTEditText paramWXRTEditText, t... paramVarArgs)
  {
    GMTrace.i(20623896084480L, 153660);
    a(paramWXRTEditText, shD, paramVarArgs);
    a(paramWXRTEditText, shB, paramVarArgs);
    a(paramWXRTEditText, shC, paramVarArgs);
    a(paramWXRTEditText, shA, paramVarArgs);
    GMTrace.o(20623896084480L, 153660);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */