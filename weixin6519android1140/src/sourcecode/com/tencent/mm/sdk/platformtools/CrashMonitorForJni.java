package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.a.b;
import com.tencent.recovery.Recovery;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CrashMonitorForJni
{
  private static final String TAG = "MicroMsg.CrashMonitorForJni";
  
  public CrashMonitorForJni()
  {
    GMTrace.i(13716112277504L, 102193);
    GMTrace.o(13716112277504L, 102193);
  }
  
  private static void OnCrash(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(13716380712960L, 102195);
    Recovery.cnf();
    new StringBuilder("OnCrash sig:").append(paramInt1).append("  stack:").append(paramString);
    b.g(paramInt1, paramString);
    GMTrace.o(13716380712960L, 102195);
  }
  
  private static CharSequence getAllThreadJavaStack()
  {
    GMTrace.i(13716514930688L, 102196);
    StringBuilder localStringBuilder1 = new StringBuilder(8192);
    StringBuilder localStringBuilder2 = new StringBuilder(2048);
    Iterator localIterator = Thread.getAllStackTraces().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      Thread localThread = (Thread)((Map.Entry)localObject).getKey();
      localObject = (StackTraceElement[])((Map.Entry)localObject).getValue();
      localStringBuilder2.setLength(0);
      localStringBuilder2.append("\n (").append(localThread.getId()).append(") [").append(localThread.getName()).append("] ************\n");
      int j = 0;
      int i = 0;
      while (i < localObject.length)
      {
        if (localObject[i].toString().startsWith("com.tencent.mm.")) {
          j = 1;
        }
        localStringBuilder2.append("\tat ").append(localObject[i].toString()).append("\n");
        i += 1;
      }
      if (j != 0) {
        localStringBuilder1.append(localStringBuilder2);
      }
    }
    GMTrace.o(13716514930688L, 102196);
    return localStringBuilder1;
  }
  
  public static String getCrashThreadJavaStack()
  {
    GMTrace.i(13716649148416L, 102197);
    Object localObject = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter((Writer)localObject);
    Throwable localThrowable = new Throwable("\n******* Java stack for JNI crash *******");
    StackTraceElement[] arrayOfStackTraceElement1 = localThrowable.getStackTrace();
    if (arrayOfStackTraceElement1.length > 1)
    {
      StackTraceElement[] arrayOfStackTraceElement2 = new StackTraceElement[arrayOfStackTraceElement1.length - 1];
      int i = 0;
      while (i < arrayOfStackTraceElement2.length)
      {
        arrayOfStackTraceElement2[i] = arrayOfStackTraceElement1[(i + 1)];
        i += 1;
      }
      localThrowable.setStackTrace(arrayOfStackTraceElement2);
    }
    localThrowable.printStackTrace(localPrintWriter);
    localPrintWriter.append(getAllThreadJavaStack());
    localPrintWriter.append('\n');
    localObject = ((StringWriter)localObject).toString();
    GMTrace.o(13716649148416L, 102197);
    return (String)localObject;
  }
  
  public static native void setClientVersionMsg(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\CrashMonitorForJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */