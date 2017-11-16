package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class m
{
  private static final Object alr = new Object();
  private static m als;
  
  public static m C(Context paramContext)
  {
    synchronized (alr)
    {
      if (als == null) {
        als = new n(paramContext.getApplicationContext());
      }
      return als;
    }
  }
  
  public abstract boolean a(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString);
  
  public abstract boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3);
  
  public abstract void b(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString);
  
  public abstract void b(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\internal\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */