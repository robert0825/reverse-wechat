package com.tencent.mm.plugin.sns.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public static final Pattern pyN;
  public static String[] pyO;
  public static HashMap<String, a> pyP;
  
  static
  {
    GMTrace.i(8772739137536L, 65362);
    pyN = Pattern.compile("\\{([\\s\\S]*?)\\}");
    pyO = new String[] { "{sex", "{username", "{richtext" };
    pyP = new HashMap();
    GMTrace.o(8772739137536L, 65362);
  }
  
  public static String a(d.a parama)
  {
    GMTrace.i(8772604919808L, 65361);
    if (pyP.containsKey(parama.pyK))
    {
      if ((a)pyP.get(parama.pyK) == a.pyQ)
      {
        parama = parama.pyK;
        GMTrace.o(8772604919808L, 65361);
        return parama;
      }
      parama = parama.pyJ;
      GMTrace.o(8772604919808L, 65361);
      return parama;
    }
    Object localObject2 = parama.pyK;
    Object localObject1 = localObject2;
    if (bg.nm((String)localObject2))
    {
      parama = parama.pyJ;
      GMTrace.o(8772604919808L, 65361);
      return parama;
    }
    label255:
    label258:
    for (;;)
    {
      localObject2 = pyN.matcher((CharSequence)localObject1);
      if (((Matcher)localObject2).find())
      {
        i = ((Matcher)localObject2).groupCount();
        localObject2 = ((Matcher)localObject2).group();
        w.i("MicroMsg.SnsAbTestUtil", "hello matcher group() " + i + " " + (String)localObject2);
        localObject1 = ((String)localObject1).replace((CharSequence)localObject2, "");
        i = 0;
        if (i >= pyO.length) {
          break label255;
        }
        if (((String)localObject2).indexOf(pyO[i]) < 0) {}
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label258;
        }
        pyP.put(parama.pyK, a.pyR);
        parama = parama.pyJ;
        GMTrace.o(8772604919808L, 65361);
        return parama;
        i += 1;
        break;
        pyP.put(parama.pyK, a.pyQ);
        parama = parama.pyK;
        GMTrace.o(8772604919808L, 65361);
        return parama;
      }
    }
  }
  
  static enum a
  {
    static
    {
      GMTrace.i(8771396960256L, 65352);
      pyQ = new a("OK", 0);
      pyR = new a("FAIL", 1);
      pyS = new a[] { pyQ, pyR };
      GMTrace.o(8771396960256L, 65352);
    }
    
    private a()
    {
      GMTrace.i(8771262742528L, 65351);
      GMTrace.o(8771262742528L, 65351);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */