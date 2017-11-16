package com.google.android.gms.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ac
{
  private static final Method auO = ;
  private static final Method auP = lv();
  private static final Method auQ = lw();
  private static final Method auR = lx();
  private static final Method auS = ly();
  
  public static boolean M(Context paramContext)
  {
    return paramContext.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", paramContext.getPackageName()) == 0;
  }
  
  private static int a(WorkSource paramWorkSource)
  {
    if (auQ != null) {
      try
      {
        int i = ((Integer)auQ.invoke(paramWorkSource, new Object[0])).intValue();
        return i;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
      }
    }
    return 0;
  }
  
  private static String a(WorkSource paramWorkSource, int paramInt)
  {
    if (auS != null) {
      try
      {
        paramWorkSource = (String)auS.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) });
        return paramWorkSource;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
      }
    }
    return null;
  }
  
  private static WorkSource b(int paramInt, String paramString)
  {
    WorkSource localWorkSource = new WorkSource();
    if (auP != null)
    {
      str = paramString;
      if (paramString == null) {
        str = "";
      }
    }
    while (auO == null) {
      try
      {
        String str;
        auP.invoke(localWorkSource, new Object[] { Integer.valueOf(paramInt), str });
        return localWorkSource;
      }
      catch (Exception paramString)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
        return localWorkSource;
      }
    }
    try
    {
      auO.invoke(localWorkSource, new Object[] { Integer.valueOf(paramInt) });
      return localWorkSource;
    }
    catch (Exception paramString)
    {
      Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
    }
    return localWorkSource;
  }
  
  public static List<String> b(WorkSource paramWorkSource)
  {
    int j = 0;
    if (paramWorkSource == null) {}
    Object localObject;
    for (int i = 0; i == 0; i = a(paramWorkSource))
    {
      localObject = Collections.EMPTY_LIST;
      return (List<String>)localObject;
    }
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      localObject = localArrayList;
      if (j >= i) {
        break;
      }
      localObject = a(paramWorkSource, j);
      if (!ab.as((String)localObject)) {
        localArrayList.add(localObject);
      }
      j += 1;
    }
  }
  
  public static WorkSource i(Context paramContext, String paramString)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return null;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramString, 0);
        if (paramContext != null) {
          return b(paramContext.uid, paramString);
        }
      }
      catch (PackageManager.NameNotFoundException paramContext) {}
    }
    return null;
  }
  
  private static Method lu()
  {
    try
    {
      Method localMethod = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE });
      return localMethod;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static Method lv()
  {
    Method localMethod = null;
    if (z.cf(18)) {}
    try
    {
      localMethod = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE, String.class });
      return localMethod;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static Method lw()
  {
    try
    {
      Method localMethod = WorkSource.class.getMethod("size", new Class[0]);
      return localMethod;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static Method lx()
  {
    try
    {
      Method localMethod = WorkSource.class.getMethod("get", new Class[] { Integer.TYPE });
      return localMethod;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static Method ly()
  {
    Method localMethod = null;
    if (z.cf(18)) {}
    try
    {
      localMethod = WorkSource.class.getMethod("getName", new Class[] { Integer.TYPE });
      return localMethod;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */