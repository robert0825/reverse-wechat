package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class p
{
  private static final Pattern vhA;
  private static final Pattern vhB;
  private static final Pattern vhC;
  
  static
  {
    GMTrace.i(13940658536448L, 103866);
    vhA = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    vhB = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    vhC = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    GMTrace.o(13940658536448L, 103866);
  }
  
  public static InetAddress RJ(String paramString)
  {
    GMTrace.i(13940524318720L, 103865);
    if (isIPv4Address(paramString))
    {
      paramString = InetAddress.getByName(paramString);
      GMTrace.o(13940524318720L, 103865);
      return paramString;
    }
    if (isIPv6Address(paramString))
    {
      paramString = InetAddress.getByName(paramString);
      GMTrace.o(13940524318720L, 103865);
      return paramString;
    }
    throw new UnknownHostException("invalid ipv4 or ipv6 dotted string");
  }
  
  public static boolean isIPv4Address(String paramString)
  {
    GMTrace.i(13940255883264L, 103863);
    boolean bool = vhA.matcher(paramString).matches();
    GMTrace.o(13940255883264L, 103863);
    return bool;
  }
  
  public static boolean isIPv6Address(String paramString)
  {
    GMTrace.i(13940390100992L, 103864);
    if ((vhB.matcher(paramString).matches()) || (vhC.matcher(paramString).matches()))
    {
      GMTrace.o(13940390100992L, 103864);
      return true;
    }
    GMTrace.o(13940390100992L, 103864);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */