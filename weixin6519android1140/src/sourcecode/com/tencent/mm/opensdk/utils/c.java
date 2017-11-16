package com.tencent.mm.opensdk.utils;

import android.net.Uri;
import android.provider.BaseColumns;
import com.tencent.gmtrace.GMTrace;

public final class c
{
  public static final class a
  {
    public static Object a(int paramInt, String paramString)
    {
      GMTrace.i(14618860716032L, 108919);
      switch (paramInt)
      {
      }
      try
      {
        Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
        GMTrace.o(14618860716032L, 108919);
        return null;
        paramString = Integer.valueOf(paramString);
        GMTrace.o(14618860716032L, 108919);
        return paramString;
        paramString = Long.valueOf(paramString);
        GMTrace.o(14618860716032L, 108919);
        return paramString;
        GMTrace.o(14618860716032L, 108919);
        return paramString;
        paramString = Boolean.valueOf(paramString);
        GMTrace.o(14618860716032L, 108919);
        return paramString;
        paramString = Float.valueOf(paramString);
        GMTrace.o(14618860716032L, 108919);
        return paramString;
        paramString = Double.valueOf(paramString);
        GMTrace.o(14618860716032L, 108919);
        return paramString;
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          Log.e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + paramString.getMessage());
        }
      }
    }
  }
  
  public static final class b
    implements BaseColumns
  {
    public static final Uri CONTENT_URI;
    
    static
    {
      GMTrace.i(14618994933760L, 108920);
      CONTENT_URI = Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
      GMTrace.o(14618994933760L, 108920);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\utils\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */