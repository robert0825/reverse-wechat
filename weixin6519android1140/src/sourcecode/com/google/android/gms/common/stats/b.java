package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.c.aa;
import com.google.android.gms.c.j;
import com.google.android.gms.c.u;
import com.google.android.gms.common.internal.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static final Object alr = new Object();
  private static b amE;
  private static final ComponentName amJ = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
  private static Integer amL;
  private final List<String> amF;
  private final List<String> amG;
  private final List<String> amH;
  private final List<String> amI;
  private e amK;
  
  private b()
  {
    if (getLogLevel() == d.LOG_LEVEL_OFF)
    {
      this.amF = Collections.EMPTY_LIST;
      this.amG = Collections.EMPTY_LIST;
      this.amH = Collections.EMPTY_LIST;
      this.amI = Collections.EMPTY_LIST;
      return;
    }
    Object localObject = (String)c.a.amO.get();
    if (localObject == null)
    {
      localObject = Collections.EMPTY_LIST;
      this.amF = ((List)localObject);
      localObject = (String)c.a.amP.get();
      if (localObject != null) {
        break label171;
      }
      localObject = Collections.EMPTY_LIST;
      label83:
      this.amG = ((List)localObject);
      localObject = (String)c.a.amQ.get();
      if (localObject != null) {
        break label184;
      }
      localObject = Collections.EMPTY_LIST;
      label106:
      this.amH = ((List)localObject);
      localObject = (String)c.a.amR.get();
      if (localObject != null) {
        break label197;
      }
    }
    label171:
    label184:
    label197:
    for (localObject = Collections.EMPTY_LIST;; localObject = Arrays.asList(((String)localObject).split(",")))
    {
      this.amI = ((List)localObject);
      this.amK = new e(((Long)c.a.amS.get()).longValue());
      return;
      localObject = Arrays.asList(((String)localObject).split(","));
      break;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label83;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label106;
    }
  }
  
  private static ServiceInfo b(Context paramContext, Intent paramIntent)
  {
    paramContext = paramContext.getPackageManager().queryIntentServices(paramIntent, 128);
    if ((paramContext == null) || (paramContext.size() == 0))
    {
      String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] { paramIntent.toUri(0), aa.cg(20) });
      return null;
    }
    if (paramContext.size() > 1)
    {
      String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] { paramIntent.toUri(0), aa.cg(20) });
      paramIntent = paramContext.iterator();
      if (paramIntent.hasNext())
      {
        paramContext = ((ResolveInfo)paramIntent.next()).serviceInfo.name;
        return null;
      }
    }
    return ((ResolveInfo)paramContext.get(0)).serviceInfo;
  }
  
  private static int getLogLevel()
  {
    if (amL == null) {}
    for (;;)
    {
      try
      {
        if (!u.ls()) {
          continue;
        }
        i = ((Integer)c.a.amN.get()).intValue();
        amL = Integer.valueOf(i);
      }
      catch (SecurityException localSecurityException)
      {
        int i;
        amL = Integer.valueOf(d.LOG_LEVEL_OFF);
        continue;
      }
      return amL.intValue();
      i = d.LOG_LEVEL_OFF;
    }
  }
  
  public static b kU()
  {
    synchronized (alr)
    {
      if (amE == null) {
        amE = new b();
      }
      return amE;
    }
  }
  
  public final void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.unbindService(paramServiceConnection);
    a(paramContext, paramServiceConnection, null, null, 1);
  }
  
  public final void a(Context paramContext, ServiceConnection paramServiceConnection, String paramString, Intent paramIntent, int paramInt)
  {
    if (!f.akn) {
      return;
    }
    String str1 = String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramServiceConnection));
    int i = getLogLevel();
    label46:
    long l2;
    long l1;
    if ((i == d.LOG_LEVEL_OFF) || (this.amK == null))
    {
      i = 0;
      if (i == 0) {
        break label343;
      }
      l2 = System.currentTimeMillis();
      paramServiceConnection = null;
      if ((getLogLevel() & d.amW) != 0) {
        paramServiceConnection = aa.cg(5);
      }
      l1 = 0L;
      if ((getLogLevel() & d.amY) != 0) {
        l1 = Debug.getNativeHeapAllocatedSize();
      }
      if ((paramInt != 1) && (paramInt != 4)) {
        break label345;
      }
    }
    for (paramServiceConnection = new ConnectionEvent(l2, paramInt, null, null, null, null, paramServiceConnection, str1, SystemClock.elapsedRealtime(), l1);; paramServiceConnection = new ConnectionEvent(l2, paramInt, aa.L(paramContext), paramString, paramIntent.processName, paramIntent.name, paramServiceConnection, str1, SystemClock.elapsedRealtime(), l1))
    {
      paramContext.startService(new Intent().setComponent(amJ).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", paramServiceConnection));
      return;
      if ((paramInt == 4) || (paramInt == 1))
      {
        if (this.amK.ak(str1))
        {
          i = 1;
          break label46;
        }
        i = 0;
        break label46;
      }
      Object localObject = b(paramContext, paramIntent);
      if (localObject == null)
      {
        String.format("Client %s made an invalid request %s", new Object[] { paramString, paramIntent.toUri(0) });
        i = 0;
        break label46;
      }
      paramServiceConnection = aa.L(paramContext);
      String str2 = ((ServiceInfo)localObject).processName;
      localObject = ((ServiceInfo)localObject).name;
      if ((this.amF.contains(paramServiceConnection)) || (this.amG.contains(paramString)) || (this.amH.contains(str2)) || (this.amI.contains(localObject)) || ((str2.equals(paramServiceConnection)) && ((i & d.amX) != 0)))
      {
        i = 0;
        break label46;
      }
      this.amK.aj(str1);
      i = 1;
      break label46;
      label343:
      break;
      label345:
      paramIntent = b(paramContext, paramIntent);
    }
  }
  
  public final boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return a(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt);
  }
  
  public final boolean a(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    ComponentName localComponentName = paramIntent.getComponent();
    if ((localComponentName == null) || ((f.akn) && ("com.google.android.gms".equals(localComponentName.getPackageName())))) {}
    for (boolean bool = false; bool; bool = u.h(paramContext, localComponentName.getPackageName())) {
      return false;
    }
    bool = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
    if (bool) {
      a(paramContext, paramServiceConnection, paramString, paramIntent, 2);
    }
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\stats\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */