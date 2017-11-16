package com.tencent.mm.sdk.platformtools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;

public final class s
{
  public static int a(Intent paramIntent, String paramString, int paramInt)
  {
    GMTrace.i(13881871171584L, 103428);
    if (paramIntent == null)
    {
      GMTrace.o(13881871171584L, 103428);
      return paramInt;
    }
    try
    {
      int i = paramIntent.getIntExtra(paramString, paramInt);
      paramInt = i;
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        w.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", new Object[] { paramIntent.getMessage() });
      }
    }
    GMTrace.o(13881871171584L, 103428);
    return paramInt;
  }
  
  public static boolean a(Intent paramIntent, String paramString, boolean paramBoolean)
  {
    GMTrace.i(13882408042496L, 103432);
    if (paramIntent == null)
    {
      GMTrace.o(13882408042496L, 103432);
      return paramBoolean;
    }
    try
    {
      boolean bool = paramIntent.getBooleanExtra(paramString, paramBoolean);
      paramBoolean = bool;
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        w.e("MicroMsg.IntentUtil", "getBooleanExtra exception:%s", new Object[] { paramIntent.getMessage() });
      }
    }
    GMTrace.o(13882408042496L, 103432);
    return paramBoolean;
  }
  
  public static Bundle ah(Intent paramIntent)
  {
    Object localObject = null;
    GMTrace.i(13882273824768L, 103431);
    if (paramIntent == null)
    {
      GMTrace.o(13882273824768L, 103431);
      return null;
    }
    try
    {
      paramIntent = paramIntent.getExtras();
      GMTrace.o(13882273824768L, 103431);
      return paramIntent;
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        w.e("MicroMsg.IntentUtil", "getExtras exception:%s", new Object[] { paramIntent.getMessage() });
        paramIntent = (Intent)localObject;
      }
    }
  }
  
  public static void b(Intent paramIntent, String paramString, boolean paramBoolean)
  {
    GMTrace.i(13882944913408L, 103436);
    try
    {
      paramIntent.putExtra(paramString, paramBoolean);
      GMTrace.o(13882944913408L, 103436);
      return;
    }
    catch (Exception paramIntent)
    {
      w.printErrStackTrace("MicroMsg.IntentUtil", paramIntent, "", new Object[0]);
      GMTrace.o(13882944913408L, 103436);
    }
  }
  
  public static int h(Bundle paramBundle, String paramString)
  {
    int i = 0;
    GMTrace.i(13882005389312L, 103429);
    if (paramBundle == null)
    {
      GMTrace.o(13882005389312L, 103429);
      return 0;
    }
    try
    {
      int j = paramBundle.getInt(paramString, 0);
      i = j;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        w.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", new Object[] { paramBundle.getMessage() });
      }
    }
    GMTrace.o(13882005389312L, 103429);
    return i;
  }
  
  public static long h(Intent paramIntent, String paramString)
  {
    long l1 = 0L;
    GMTrace.i(13882139607040L, 103430);
    if (paramIntent == null)
    {
      GMTrace.o(13882139607040L, 103430);
      return 0L;
    }
    try
    {
      long l2 = paramIntent.getLongExtra(paramString, 0L);
      l1 = l2;
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        w.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", new Object[] { paramIntent.getMessage() });
      }
    }
    GMTrace.o(13882139607040L, 103430);
    return l1;
  }
  
  public static String i(Intent paramIntent, String paramString)
  {
    Object localObject = null;
    GMTrace.i(13882542260224L, 103433);
    if (paramIntent == null)
    {
      GMTrace.o(13882542260224L, 103433);
      return null;
    }
    try
    {
      paramIntent = paramIntent.getStringExtra(paramString);
      GMTrace.o(13882542260224L, 103433);
      return paramIntent;
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        w.e("MicroMsg.IntentUtil", "getStringExtra exception:%s", new Object[] { paramIntent.getMessage() });
        paramIntent = (Intent)localObject;
      }
    }
  }
  
  public static String i(Bundle paramBundle, String paramString)
  {
    Object localObject = null;
    GMTrace.i(13882676477952L, 103434);
    if (paramBundle == null)
    {
      GMTrace.o(13882676477952L, 103434);
      return null;
    }
    try
    {
      paramBundle = paramBundle.getString(paramString);
      GMTrace.o(13882676477952L, 103434);
      return paramBundle;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        w.e("MicroMsg.IntentUtil", "getStringExtra exception:%s", new Object[] { paramBundle.getMessage() });
        paramBundle = (Bundle)localObject;
      }
    }
  }
  
  public static byte[] j(Intent paramIntent, String paramString)
  {
    Object localObject = null;
    GMTrace.i(13882810695680L, 103435);
    if (paramIntent == null)
    {
      GMTrace.o(13882810695680L, 103435);
      return null;
    }
    try
    {
      paramIntent = paramIntent.getByteArrayExtra(paramString);
      GMTrace.o(13882810695680L, 103435);
      return paramIntent;
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        w.e("MicroMsg.IntentUtil", "getByteArrayExtra exception:%s", new Object[] { paramIntent.getMessage() });
        paramIntent = (Intent)localObject;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */