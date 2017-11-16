package com.tencent.mm.console.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.protocal.MMProtocalJni;
import java.text.SimpleDateFormat;
import java.util.Date;
import junit.framework.Assert;

public final class g
  implements a
{
  static
  {
    GMTrace.i(417685569536L, 3112);
    b.a(new g(), new String[] { "//assert", "//netassert", "//jniassert", "//jnipushassert", "//pushassert" });
    GMTrace.o(417685569536L, 3112);
  }
  
  public g()
  {
    GMTrace.i(417282916352L, 3109);
    GMTrace.o(417282916352L, 3109);
  }
  
  public static void init()
  {
    GMTrace.i(417417134080L, 3110);
    GMTrace.o(417417134080L, 3110);
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    GMTrace.i(417551351808L, 3111);
    paramContext = paramArrayOfString[0];
    label68:
    int i;
    switch (paramContext.hashCode())
    {
    default: 
      i = -1;
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        GMTrace.o(417551351808L, 3111);
        return false;
        if (!paramContext.equals("//assert")) {
          break label68;
        }
        i = 0;
        continue;
        if (!paramContext.equals("//netassert")) {
          break label68;
        }
        i = 1;
        continue;
        if (!paramContext.equals("//jniassert")) {
          break label68;
        }
        i = 2;
        continue;
        if (!paramContext.equals("//jnipushassert")) {
          break label68;
        }
        i = 3;
        continue;
        if (!paramContext.equals("//pushassert")) {
          break label68;
        }
        i = 4;
      }
    }
    Assert.assertTrue("test errlog " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), false);
    GMTrace.o(417551351808L, 3111);
    return true;
    Assert.assertTrue("NetsceneQueue forbid in ", false);
    GMTrace.o(417551351808L, 3111);
    return true;
    MMProtocalJni.setClientPackVersion(-1);
    GMTrace.o(417551351808L, 3111);
    return true;
    WatchDogPushReceiver.hk(2);
    GMTrace.o(417551351808L, 3111);
    return true;
    WatchDogPushReceiver.hk(1);
    GMTrace.o(417551351808L, 3111);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */