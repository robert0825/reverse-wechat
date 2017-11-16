package com.tencent.mm.plugin.appbrand.dynamic.c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.d;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.pluginsdk.b.a
{
  public a()
  {
    GMTrace.i(18310250889216L, 136422);
    GMTrace.o(18310250889216L, 136422);
  }
  
  public final boolean a(Context paramContext, final String[] paramArrayOfString)
  {
    GMTrace.i(18310385106944L, 136423);
    if (!((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).CH().CK())
    {
      GMTrace.o(18310385106944L, 136423);
      return true;
    }
    if (!"//widget".equals(paramArrayOfString[0]))
    {
      GMTrace.o(18310385106944L, 136423);
      return true;
    }
    if (paramArrayOfString.length < 2)
    {
      GMTrace.o(18310385106944L, 136423);
      return true;
    }
    paramContext = paramArrayOfString[1].toLowerCase();
    int i = -1;
    switch (paramContext.hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(18310385106944L, 136423);
      return true;
      if (!paramContext.equals("assert")) {
        break;
      }
      i = 0;
      break;
      if (!paramContext.equals("debugger")) {
        break;
      }
      i = 1;
      break;
      com.tencent.mm.bv.a.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18310921977856L, 136427);
          String str2 = "com.tencent.mm";
          String str1 = str2;
          if (paramArrayOfString.length > 2)
          {
            str1 = str2;
            if (!TextUtils.isEmpty(paramArrayOfString[2])) {
              str1 = "com.tencent.mm" + ":" + paramArrayOfString[2];
            }
          }
          com.tencent.mm.ipcinvoker.e.a(str1, null, a.a.class, null);
          GMTrace.o(18310921977856L, 136427);
        }
      });
      continue;
      if ((paramArrayOfString.length <= 2) || (TextUtils.isEmpty(paramArrayOfString[2])))
      {
        GMTrace.o(18310385106944L, 136423);
        return true;
      }
      paramContext = paramArrayOfString[2];
      i = -1;
      switch (paramContext.hashCode())
      {
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          break;
        case 0: 
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).CH().bh(true);
          break;
          if (paramContext.equals("-or"))
          {
            i = 0;
            continue;
            if (paramContext.equals("-cr")) {
              i = 1;
            }
          }
          break;
        }
      }
      ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).CH().bh(false);
    }
  }
  
  private static class a
    implements com.tencent.mm.ipcinvoker.a
  {
    private a()
    {
      GMTrace.i(18311056195584L, 136428);
      GMTrace.o(18311056195584L, 136428);
    }
    
    public final void a(Bundle paramBundle, c paramc)
    {
      GMTrace.i(18311190413312L, 136429);
      com.tencent.mm.bv.a.e(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18310653542400L, 136425);
          Assert.assertTrue(String.format("execute assert process(%s) command", new Object[] { d.vP() }), false);
          GMTrace.o(18310653542400L, 136425);
        }
      });
      GMTrace.o(18311190413312L, 136429);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */