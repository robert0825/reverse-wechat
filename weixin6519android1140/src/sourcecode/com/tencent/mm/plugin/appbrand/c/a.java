package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.oy;
import com.tencent.mm.k.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public enum a
{
  public static final c<oy> hLY;
  
  static
  {
    GMTrace.i(10026869587968L, 74706);
    hLZ = new a[0];
    hLY = new c() {};
    GMTrace.o(10026869587968L, 74706);
  }
  
  public static boolean Tj()
  {
    GMTrace.i(10025661628416L, 74697);
    if (!h.xw().wL())
    {
      GMTrace.o(10025661628416L, 74697);
      return false;
    }
    if (g.ut().getInt("WeAppForbiddenSwitch", 0) == 1)
    {
      w.i("MicroMsg.AppBrandEntranceLogic", "showInFindMore, WeAppForbiddenSwitch == 1, not show");
      GMTrace.o(10025661628416L, 74697);
      return false;
    }
    if ((To()) || (d.TA()))
    {
      GMTrace.o(10025661628416L, 74697);
      return true;
    }
    GMTrace.o(10025661628416L, 74697);
    return false;
  }
  
  public static void Tk()
  {
    GMTrace.i(10025795846144L, 74698);
    if (!h.xw().wL())
    {
      GMTrace.o(10025795846144L, 74698);
      return;
    }
    if (Tl())
    {
      d.e locale = d.e.hMJ;
      d.e.a("", 0L, 2, 1);
    }
    h.xy().xh().a(w.a.vuM, Boolean.valueOf(false));
    GMTrace.o(10025795846144L, 74698);
  }
  
  static boolean Tl()
  {
    GMTrace.i(10025930063872L, 74699);
    if (!h.xw().wL())
    {
      GMTrace.o(10025930063872L, 74699);
      return false;
    }
    boolean bool = ((Boolean)h.xy().xh().get(w.a.vuM, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(10025930063872L, 74699);
    return bool;
  }
  
  public static boolean Tm()
  {
    GMTrace.i(10026466934784L, 74703);
    if (!h.xw().wL())
    {
      GMTrace.o(10026466934784L, 74703);
      return false;
    }
    boolean bool = ((Boolean)h.xy().xh().get(w.a.vuB, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(10026466934784L, 74703);
    return bool;
  }
  
  public static boolean Tn()
  {
    GMTrace.i(10026601152512L, 74704);
    if (!h.xw().wL())
    {
      GMTrace.o(10026601152512L, 74704);
      return false;
    }
    boolean bool = ((Boolean)h.xy().xh().get(w.a.vuA, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(10026601152512L, 74704);
    return bool;
  }
  
  public static boolean To()
  {
    GMTrace.i(10026735370240L, 74705);
    if ((Tn()) || (Tm()))
    {
      GMTrace.o(10026735370240L, 74705);
      return true;
    }
    GMTrace.o(10026735370240L, 74705);
    return false;
  }
  
  private static void c(boolean paramBoolean, String paramString)
  {
    GMTrace.i(20752745103360L, 154620);
    if (!h.xw().wL())
    {
      GMTrace.o(20752745103360L, 154620);
      return;
    }
    Object localObject = (Boolean)h.xy().xh().get(w.a.vuB, null);
    if ((localObject != null) && (!((Boolean)localObject).booleanValue()) && (paramBoolean))
    {
      h.xy().xh().a(w.a.vuM, Boolean.valueOf(true));
      localObject = d.e.hMJ;
      d.e.a("", 0L, 1, 1);
    }
    for (int i = 1;; i = 0)
    {
      h.xy().xh().a(w.a.vuB, Boolean.valueOf(paramBoolean));
      if (i != 0)
      {
        localObject = com.tencent.mm.plugin.appbrand.app.e.Sc();
        if (localObject != null)
        {
          ((AppBrandGuideUI.a)localObject).iAL = true;
          ((AppBrandGuideUI.a)localObject).iAM = paramString;
        }
      }
      GMTrace.o(20752745103360L, 154620);
      return;
    }
  }
  
  static void ie(int paramInt)
  {
    boolean bool2 = true;
    GMTrace.i(10026064281600L, 74700);
    if (!h.xw().wL())
    {
      GMTrace.o(10026064281600L, 74700);
      return;
    }
    t localt = h.xy().xh();
    w.a locala;
    if ((paramInt & 0x2) > 0)
    {
      bool1 = true;
      c(bool1, "");
      locala = w.a.vuA;
      if ((paramInt & 0x1) <= 0) {
        break label86;
      }
    }
    label86:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localt.a(locala, Boolean.valueOf(bool1));
      GMTrace.o(10026064281600L, 74700);
      return;
      bool1 = false;
      break;
    }
  }
  
  static void oE(String paramString)
  {
    GMTrace.i(20752879321088L, 154621);
    c(true, paramString);
    GMTrace.o(20752879321088L, 154621);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */