package com.tencent.mm.opensdk.utils;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  public static int a(Bundle paramBundle, String paramString)
  {
    int i = -1;
    GMTrace.i(14617518538752L, 108909);
    if (paramBundle == null)
    {
      GMTrace.o(14617518538752L, 108909);
      return -1;
    }
    try
    {
      int j = paramBundle.getInt(paramString, -1);
      i = j;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + paramBundle.getMessage());
      }
    }
    GMTrace.o(14617518538752L, 108909);
    return i;
  }
  
  public static String b(Bundle paramBundle, String paramString)
  {
    Object localObject = null;
    GMTrace.i(14617652756480L, 108910);
    if (paramBundle == null)
    {
      GMTrace.o(14617652756480L, 108910);
      return null;
    }
    try
    {
      paramBundle = paramBundle.getString(paramString);
      GMTrace.o(14617652756480L, 108910);
      return paramBundle;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + paramBundle.getMessage());
        paramBundle = (Bundle)localObject;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\utils\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */