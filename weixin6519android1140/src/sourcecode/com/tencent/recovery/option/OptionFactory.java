package com.tencent.recovery.option;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.tencent.recovery.ConstantsRecovery.DefaultProcessOptions;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.util.Util;

public class OptionFactory
{
  private static IOptionsCreator xPQ;
  
  private static IOptionsCreator cnn()
  {
    try
    {
      localClass = Class.forName(String.format("com.tencent.recovery.DefaultOptionsCreator", new Object[0]));
      if (localClass == null) {}
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      IOptionsCreator localIOptionsCreator2;
      for (;;)
      {
        try
        {
          Class localClass;
          IOptionsCreator localIOptionsCreator1 = (IOptionsCreator)localClass.newInstance();
          if (localIOptionsCreator1 == null) {
            break;
          }
          RecoveryLog.i("Recovery.OptionFactory", "getCreator %s success %s", new Object[] { localClass.getName(), localIOptionsCreator1.toString() });
          return localIOptionsCreator1;
        }
        catch (Exception localException) {}
        localClassNotFoundException = localClassNotFoundException;
        Object localObject = null;
        continue;
        localIOptionsCreator2 = null;
      }
      RecoveryLog.i("Recovery.OptionFactory", "getCreator fail", new Object[0]);
      return localIOptionsCreator2;
    }
  }
  
  public static ProcessOptions jdMethod_do(String paramString, int paramInt)
  {
    if (xPQ == null) {
      xPQ = cnn();
    }
    ProcessOptions localProcessOptions = null;
    if (xPQ != null) {
      localProcessOptions = xPQ.createProcessOptions(paramString, paramInt);
    }
    paramString = localProcessOptions;
    if (localProcessOptions == null)
    {
      RecoveryLog.i("Recovery.OptionFactory", "not found custom process options, use default %d", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt == 1) {
        paramString = ConstantsRecovery.DefaultProcessOptions.xPj;
      }
    }
    else
    {
      return paramString;
    }
    return ConstantsRecovery.DefaultProcessOptions.xPh;
  }
  
  public static CommonOptions fN(Context paramContext)
  {
    if (xPQ == null) {
      xPQ = cnn();
    }
    Object localObject1 = null;
    if (xPQ != null) {
      localObject1 = xPQ.createCommonOptions(paramContext);
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      RecoveryLog.i("Recovery.OptionFactory", "not found custom custom options, use default", new Object[0]);
      localObject1 = new CommonOptions.Builder();
      ((CommonOptions.Builder)localObject1).xPH = "";
      ((CommonOptions.Builder)localObject1).xPN = false;
      ((CommonOptions.Builder)localObject1).lOv = String.valueOf(Util.fP(paramContext));
    }
    try
    {
      ((CommonOptions.Builder)localObject1).clientVersion = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      ((CommonOptions.Builder)localObject1).xPO = 600000L;
      ((CommonOptions.Builder)localObject1).xPP = 600000L;
      localObject2 = ((CommonOptions.Builder)localObject1).cnm();
      return (CommonOptions)localObject2;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\option\OptionFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */