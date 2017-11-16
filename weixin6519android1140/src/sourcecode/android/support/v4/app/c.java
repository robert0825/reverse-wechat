package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;

public final class c
{
  private static final b nc = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      nc = new a();
      return;
    }
  }
  
  public static int b(Context paramContext, String paramString1, String paramString2)
  {
    return nc.b(paramContext, paramString1, paramString2);
  }
  
  public static String permissionToOp(String paramString)
  {
    return nc.permissionToOp(paramString);
  }
  
  private static final class a
    extends c.b
  {
    public final int b(Context paramContext, String paramString1, String paramString2)
    {
      return ((AppOpsManager)paramContext.getSystemService(AppOpsManager.class)).noteProxyOp(paramString1, paramString2);
    }
    
    public final String permissionToOp(String paramString)
    {
      return AppOpsManager.permissionToOp(paramString);
    }
  }
  
  private static class b
  {
    public int b(Context paramContext, String paramString1, String paramString2)
    {
      return 1;
    }
    
    public String permissionToOp(String paramString)
    {
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */