package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.b.b.b;
import com.tencent.mm.y.b.d;
import com.tencent.mm.y.ba;
import com.tencent.mm.y.bb;
import com.tencent.mm.y.bb.a;

public final class e
{
  public static com.tencent.mm.pluginsdk.ui.b.a a(Context paramContext, int paramInt, Object[] paramArrayOfObject)
  {
    Object localObject2 = null;
    boolean bool2 = false;
    boolean bool1 = false;
    GMTrace.i(14509607485440L, 108105);
    Object localObject1;
    String str1;
    label127:
    label222:
    label259:
    String str2;
    switch (1.wZv[(paramInt - 1)])
    {
    default: 
      localObject1 = localObject2;
    case 1: 
    case 2: 
      do
      {
        do
        {
          do
          {
            do
            {
              GMTrace.o(14509607485440L, 108105);
              return (com.tencent.mm.pluginsdk.ui.b.a)localObject1;
              localObject1 = localObject2;
            } while (paramArrayOfObject == null);
            localObject1 = localObject2;
          } while (paramArrayOfObject.length != 2);
          if (paramArrayOfObject[0] != null)
          {
            str1 = paramArrayOfObject[0].toString();
            if (paramArrayOfObject[1] == null) {
              break label222;
            }
          }
          for (paramArrayOfObject = paramArrayOfObject[1].toString();; paramArrayOfObject = null)
          {
            if (at.AR().zr() == null) {
              w.w("MicroMsg.BannerFactory", "recommend banner stg is null. this may be caused by account async init.");
            }
            localObject1 = localObject2;
            if (at.AR().zr() == null) {
              break;
            }
            if (!at.AR().zr().hh(str1))
            {
              localObject1 = localObject2;
              if (!at.AR().zr().hh(paramArrayOfObject)) {
                break;
              }
            }
            localObject1 = new f(paramContext, str1, paramArrayOfObject);
            break;
            str1 = null;
            break label127;
          }
          localObject1 = localObject2;
        } while (paramArrayOfObject == null);
        localObject1 = localObject2;
      } while (paramArrayOfObject.length != 3);
      if (paramArrayOfObject[0] != null)
      {
        str1 = paramArrayOfObject[0].toString();
        if (paramArrayOfObject[1] == null) {
          break label369;
        }
        str2 = paramArrayOfObject[1].toString();
        label273:
        if ((paramArrayOfObject[2] == null) || (!(paramArrayOfObject[2] instanceof Boolean))) {
          break label812;
        }
      }
      break;
    }
    label369:
    label812:
    for (bool1 = ((Boolean)paramArrayOfObject[2]).booleanValue();; bool1 = false)
    {
      if ((!at.AU()) || (at.AR().zs() == null) || (!at.AR().zs().hh(str1)))
      {
        localObject1 = localObject2;
        if (!at.AR().zs().hh(str2)) {
          break;
        }
      }
      localObject1 = new g(paramContext, str1, str2, bool1);
      break;
      str1 = null;
      break label259;
      str2 = null;
      break label273;
      localObject1 = new n(paramContext);
      break;
      localObject1 = new h(paramContext);
      break;
      localObject1 = new a(paramContext);
      break;
      bb.Bc();
      paramArrayOfObject = bb.Bd();
      localObject1 = localObject2;
      if (paramArrayOfObject == null) {
        break;
      }
      localObject1 = new k(paramContext, paramArrayOfObject);
      break;
      paramArrayOfObject = com.tencent.mm.y.a.g.BY().hb("4");
      localObject1 = localObject2;
      if (paramArrayOfObject == null) {
        break;
      }
      paramArrayOfObject = paramArrayOfObject.value;
      localObject1 = localObject2;
      if (bg.nm(paramArrayOfObject)) {
        break;
      }
      localObject1 = localObject2;
      if (paramArrayOfObject.equals("0")) {
        break;
      }
      if (paramArrayOfObject.equals("1"))
      {
        at.AR();
        paramArrayOfObject = com.tencent.mm.y.c.xh().get(328195, Boolean.valueOf(false));
        if ((paramArrayOfObject instanceof Boolean)) {
          bool1 = ((Boolean)paramArrayOfObject).booleanValue();
        }
        if (!bool1)
        {
          bb.Bc();
          paramInt = bb.Be();
          if ((paramInt == bb.a.gnI) || (paramInt == bb.a.gnJ))
          {
            w.i("MicroMsg.BannerFactory", "already Bind the Mobile");
            localObject1 = localObject2;
            break;
          }
          localObject1 = new k(paramContext, new ba(1, 1, ""));
          com.tencent.mm.y.a.f.hf("4");
          break;
        }
        w.i("MicroMsg.BannerFactory", "[cpan] banner type bind mobile has clicked.");
        localObject1 = localObject2;
        break;
      }
      localObject1 = localObject2;
      if (!paramArrayOfObject.equals("2")) {
        break;
      }
      at.AR();
      paramArrayOfObject = com.tencent.mm.y.c.xh().get(328196, Boolean.valueOf(false));
      bool1 = bool2;
      if ((paramArrayOfObject instanceof Boolean)) {
        bool1 = ((Boolean)paramArrayOfObject).booleanValue();
      }
      if (!bool1)
      {
        bb.Bc();
        if (bb.Be() == bb.a.gnI)
        {
          w.i("MicroMsg.BannerFactory", "already upload the Mobile");
          localObject1 = localObject2;
          break;
        }
        localObject1 = new k(paramContext, new ba(2, 1, ""));
        com.tencent.mm.y.a.f.hf("4");
        break;
      }
      w.i("MicroMsg.BannerFactory", "[cpan] banner type upload contact has clicked.");
      localObject1 = localObject2;
      break;
      localObject1 = new l(paramContext);
      break;
      localObject1 = new o(paramContext);
      break;
      localObject1 = new j(paramContext);
      break;
      if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0)) {}
      for (paramArrayOfObject = (b.b)paramArrayOfObject[0];; paramArrayOfObject = b.b.gpQ)
      {
        localObject1 = new com.tencent.mm.ui.e.a(paramContext, paramArrayOfObject);
        break;
      }
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(14509473267712L, 108104);
      wZw = 1;
      wZx = 2;
      wZy = 3;
      wZz = 4;
      wZA = 5;
      wZB = 6;
      wZC = 7;
      wZD = 8;
      wZE = 9;
      wZF = 10;
      wZG = 11;
      wZH = new int[] { wZw, wZx, wZy, wZz, wZA, wZB, wZC, wZD, wZE, wZF, wZG };
      GMTrace.o(14509473267712L, 108104);
    }
    
    public static int[] cho()
    {
      GMTrace.i(14509339049984L, 108103);
      int[] arrayOfInt = (int[])wZH.clone();
      GMTrace.o(14509339049984L, 108103);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */