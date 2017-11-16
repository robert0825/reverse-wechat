package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public final class ah
{
  public ah()
  {
    GMTrace.i(13994614063104L, 104268);
    GMTrace.o(13994614063104L, 104268);
  }
  
  public static String b(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    GMTrace.i(13995285151744L, 104273);
    if ((paramArrayOfStackTraceElement == null) || (paramArrayOfStackTraceElement.length < 4))
    {
      GMTrace.o(13995285151744L, 104273);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 3;
    while (i < paramArrayOfStackTraceElement.length)
    {
      if ((paramArrayOfStackTraceElement[i].getClassName().contains("com.tencent.mm")) && (!paramArrayOfStackTraceElement[i].getClassName().contains("sdk.platformtools.Log")))
      {
        localStringBuilder.append("[");
        localStringBuilder.append(paramArrayOfStackTraceElement[i].getClassName().substring(15));
        localStringBuilder.append(":");
        localStringBuilder.append(paramArrayOfStackTraceElement[i].getMethodName());
        localStringBuilder.append("(" + paramArrayOfStackTraceElement[i].getLineNumber() + ")]");
      }
      i += 1;
    }
    paramArrayOfStackTraceElement = localStringBuilder.toString();
    GMTrace.o(13995285151744L, 104273);
    return paramArrayOfStackTraceElement;
  }
  
  public static String bQk()
  {
    GMTrace.i(13994882498560L, 104270);
    try
    {
      Object localObject = new Throwable().getStackTrace();
      if ((localObject == null) || (localObject.length < 3))
      {
        GMTrace.o(13994882498560L, 104270);
        return "";
      }
      String str = localObject[2].getClassName().substring(15);
      str = str + ":" + localObject[2].getMethodName();
      localObject = str + "(" + localObject[2].getLineNumber() + ")";
      GMTrace.o(13994882498560L, 104270);
      return (String)localObject;
    }
    catch (Throwable localThrowable)
    {
      w.e("MicroMsg.Util.MMStack", "getCaller e:%s", new Object[] { f(localThrowable) });
      GMTrace.o(13994882498560L, 104270);
    }
    return "";
  }
  
  public static String bQl()
  {
    GMTrace.i(13995016716288L, 104271);
    Object localObject = new Throwable().getStackTrace();
    if ((localObject == null) || (localObject.length < 4))
    {
      GMTrace.o(13995016716288L, 104271);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 3;
    while (i < localObject.length)
    {
      if ((localObject[i].getClassName().contains("com.tencent.mm")) && (!localObject[i].getClassName().contains("sdk.platformtools.Log")))
      {
        localStringBuilder.append("[");
        localStringBuilder.append(localObject[i].getClassName().substring(15));
        localStringBuilder.append(":");
        localStringBuilder.append(localObject[i].getMethodName());
        localStringBuilder.append("(" + localObject[i].getLineNumber() + ")]");
      }
      i += 1;
    }
    localObject = localStringBuilder.toString();
    GMTrace.o(13995016716288L, 104271);
    return (String)localObject;
  }
  
  public static String f(Throwable paramThrowable)
  {
    GMTrace.i(13995150934016L, 104272);
    if (paramThrowable == null)
    {
      GMTrace.o(13995150934016L, 104272);
      return "";
    }
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
      paramThrowable.printStackTrace(localPrintStream);
      paramThrowable = localByteArrayOutputStream.toString();
      localPrintStream.close();
      localByteArrayOutputStream.close();
      GMTrace.o(13995150934016L, 104272);
      return paramThrowable;
    }
    catch (Exception paramThrowable)
    {
      GMTrace.o(13995150934016L, 104272);
    }
    return "";
  }
  
  public final String toString()
  {
    GMTrace.i(13994748280832L, 104269);
    String str = bQl();
    GMTrace.o(13994748280832L, 104269);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */