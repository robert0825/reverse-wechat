package c.t.m.g;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

public final class a
{
  private static volatile boolean a = false;
  
  public static d a(b.a parama)
  {
    if (!a) {
      b(parama);
    }
    return g.a();
  }
  
  private static void b(b.a parama)
  {
    boolean bool1 = true;
    try
    {
      boolean bool2 = a;
      if (bool2) {
        return;
      }
      System.currentTimeMillis();
      SystemClock.elapsedRealtime();
      if (parama == null) {
        throw new c("initParam null");
      }
    }
    finally {}
    Object localObject = parama.a.getPackageName();
    String str = bz.a(parama.a);
    if (parama.c) {}
    for (int i = parama.b; i <= 0; i = bz.a(parama.a, (String)localObject)) {
      throw new c("appid illegal:" + i);
    }
    bz.a locala;
    if (!parama.c)
    {
      locala = bz.a(i, parama.a, (String)localObject, "com.tencent.halley.common.platform.service.PlatformService");
      if (locala == null) {
        throw new c("need set PlatformService in manifest for halley");
      }
      if ((locala.d != null) && (locala.a != null)) {
        if (locala.d.equals(locala.a)) {
          break label356;
        }
      }
    }
    for (;;)
    {
      l.e = bool1;
      if (locala.c) {
        throw new c("need set PlatformService exported to false");
      }
      if (!locala.b) {
        throw new c("need set PlatformService enabled to true");
      }
      localObject = bz.a(i, parama.a, (String)localObject, "com.tencent.halley.common.platform.service.ActivateService");
      if (localObject != null)
      {
        if (!((bz.a)localObject).c) {
          throw new c("need set ActivateService exported to true");
        }
        if (((bz.a)localObject).e == null) {
          throw new c("need set security_version for ActivateService");
        }
        if (((bz.a)localObject).e.getInt("security_version") <= 0) {
          throw new c("need set valid security_version for ActivateService");
        }
      }
      l.a(i, parama.c, parama.a, parama.d, parama.e, str);
      l.f = false;
      ac.a = parama.f;
      bv.c().f();
      l.h();
      a = true;
      SystemClock.elapsedRealtime();
      break;
      label356:
      bool1 = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */