package com.tencent.mm.app;

import android.app.ActivityManager;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.IPackageStatsObserver.Stub;
import android.os.ConditionVariable;
import android.os.FileObserver;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.x;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.p.u;
import com.tencent.mm.pluginsdk.p.x;
import com.tencent.mm.sdk.a.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.a.c;
import com.tencent.mm.sdk.platformtools.CrashMonitorForJni;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.ai.b;
import com.tencent.mm.sdk.platformtools.ai.c;
import com.tencent.mm.sdk.platformtools.ai.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.as;
import com.tencent.mm.y.bz;
import com.tencent.recovery.Recovery;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.AssertionFailedError;

public class j
  implements c, ai.d
{
  private static final String esG;
  private static final String esH;
  private static String esI;
  private static final String esJ;
  public static long[] esK;
  public static final long esy;
  private a esA;
  public volatile long esB;
  HashSet<String> esC;
  String esD;
  String esE;
  ConditionVariable esF;
  volatile b esL;
  private ai esz;
  
  static
  {
    GMTrace.i(12977109467136L, 96687);
    esy = bg.Pv();
    String str = p.ta();
    esG = str;
    esH = o.getString(str.hashCode());
    esI = "";
    esJ = "version:" + com.tencent.mm.protocal.d.tJC;
    esK = new long[] { 0L, 0L, 0L };
    GMTrace.o(12977109467136L, 96687);
  }
  
  public j()
  {
    GMTrace.i(12974827765760L, 96670);
    this.esz = null;
    this.esB = 0L;
    GMTrace.o(12974827765760L, 96670);
  }
  
  /* Error */
  static String a(String paramString, int paramInt, long paramLong, ActivityManager.ProcessErrorStateInfo paramProcessErrorStateInfo)
  {
    // Byte code:
    //   0: ldc2_w 132
    //   3: ldc -122
    //   5: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 90	java/lang/StringBuilder
    //   11: dup
    //   12: sipush 4096
    //   15: invokespecial 137	java/lang/StringBuilder:<init>	(I)V
    //   18: astore 9
    //   20: new 139	java/text/SimpleDateFormat
    //   23: dup
    //   24: ldc -115
    //   26: invokespecial 142	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   29: astore 10
    //   31: new 90	java/lang/StringBuilder
    //   34: dup
    //   35: ldc -112
    //   37: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: iload_1
    //   41: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   44: ldc -110
    //   46: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: astore 11
    //   54: aload 4
    //   56: ifnull +19 -> 75
    //   59: aload 9
    //   61: aload 4
    //   63: getfield 154	android/app/ActivityManager$ProcessErrorStateInfo:longMsg	Ljava/lang/String;
    //   66: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: bipush 10
    //   71: invokevirtual 157	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: new 159	java/io/BufferedReader
    //   78: dup
    //   79: new 161	java/io/FileReader
    //   82: dup
    //   83: aload_0
    //   84: invokespecial 162	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   87: invokespecial 165	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   90: astore 4
    //   92: iconst_0
    //   93: istore_1
    //   94: aload 4
    //   96: astore_0
    //   97: aload 4
    //   99: invokevirtual 168	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   102: astore 12
    //   104: aload 12
    //   106: ifnull +265 -> 371
    //   109: iload_1
    //   110: tableswitch	default:+317->427, 0:+26->136, 1:+99->209, 2:+165->275
    //   136: aload 4
    //   138: astore_0
    //   139: aload 12
    //   141: aload 11
    //   143: invokevirtual 172	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   146: ifeq -52 -> 94
    //   149: aload 4
    //   151: astore_0
    //   152: aload 11
    //   154: invokevirtual 175	java/lang/String:length	()I
    //   157: istore 5
    //   159: aload 4
    //   161: astore_0
    //   162: aload 10
    //   164: aload 12
    //   166: iload 5
    //   168: iload 5
    //   170: bipush 19
    //   172: iadd
    //   173: invokevirtual 179	java/lang/String:substring	(II)Ljava/lang/String;
    //   176: invokevirtual 183	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   179: invokevirtual 188	java/util/Date:getTime	()J
    //   182: lload_2
    //   183: lsub
    //   184: lstore 6
    //   186: lload 6
    //   188: ldc2_w 189
    //   191: lcmp
    //   192: iflt -98 -> 94
    //   195: lload 6
    //   197: ldc2_w 191
    //   200: lcmp
    //   201: ifgt -107 -> 94
    //   204: iconst_1
    //   205: istore_1
    //   206: goto -112 -> 94
    //   209: aload 4
    //   211: astore_0
    //   212: aload 9
    //   214: aload 12
    //   216: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: bipush 10
    //   221: invokevirtual 157	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   224: pop
    //   225: aload 4
    //   227: astore_0
    //   228: aload 12
    //   230: ldc -62
    //   232: invokevirtual 172	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   235: ifeq +8 -> 243
    //   238: iconst_2
    //   239: istore_1
    //   240: goto -146 -> 94
    //   243: aload 4
    //   245: astore_0
    //   246: aload 12
    //   248: ldc -60
    //   250: invokevirtual 172	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   253: istore 8
    //   255: iload 8
    //   257: ifeq -163 -> 94
    //   260: aload 4
    //   262: invokevirtual 199	java/io/BufferedReader:close	()V
    //   265: ldc2_w 132
    //   268: ldc -122
    //   270: invokestatic 116	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   273: aconst_null
    //   274: areturn
    //   275: aload 4
    //   277: astore_0
    //   278: aload 12
    //   280: ldc -55
    //   282: invokevirtual 172	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   285: ifeq +29 -> 314
    //   288: aload 4
    //   290: astore_0
    //   291: aload 9
    //   293: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   296: astore 9
    //   298: aload 4
    //   300: invokevirtual 199	java/io/BufferedReader:close	()V
    //   303: ldc2_w 132
    //   306: ldc -122
    //   308: invokestatic 116	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   311: aload 9
    //   313: areturn
    //   314: aload 4
    //   316: astore_0
    //   317: aload 9
    //   319: aload 12
    //   321: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: bipush 10
    //   326: invokevirtual 157	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   329: pop
    //   330: goto -236 -> 94
    //   333: astore 9
    //   335: aload 4
    //   337: astore_0
    //   338: ldc -53
    //   340: aload 9
    //   342: ldc -51
    //   344: iconst_0
    //   345: anewarray 4	java/lang/Object
    //   348: invokestatic 211	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   351: aload 4
    //   353: ifnull +8 -> 361
    //   356: aload 4
    //   358: invokevirtual 199	java/io/BufferedReader:close	()V
    //   361: ldc2_w 132
    //   364: ldc -122
    //   366: invokestatic 116	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   369: aconst_null
    //   370: areturn
    //   371: aload 4
    //   373: invokevirtual 199	java/io/BufferedReader:close	()V
    //   376: goto -15 -> 361
    //   379: astore_0
    //   380: goto -19 -> 361
    //   383: astore 4
    //   385: aconst_null
    //   386: astore_0
    //   387: aload_0
    //   388: ifnull +7 -> 395
    //   391: aload_0
    //   392: invokevirtual 199	java/io/BufferedReader:close	()V
    //   395: aload 4
    //   397: athrow
    //   398: astore_0
    //   399: goto -134 -> 265
    //   402: astore_0
    //   403: goto -100 -> 303
    //   406: astore_0
    //   407: goto -46 -> 361
    //   410: astore_0
    //   411: goto -16 -> 395
    //   414: astore 4
    //   416: goto -29 -> 387
    //   419: astore 9
    //   421: aconst_null
    //   422: astore 4
    //   424: goto -89 -> 335
    //   427: goto -333 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	430	0	paramString	String
    //   0	430	1	paramInt	int
    //   0	430	2	paramLong	long
    //   0	430	4	paramProcessErrorStateInfo	ActivityManager.ProcessErrorStateInfo
    //   157	16	5	i	int
    //   184	12	6	l	long
    //   253	3	8	bool	boolean
    //   18	300	9	localObject	Object
    //   333	8	9	localException1	Exception
    //   419	1	9	localException2	Exception
    //   29	134	10	localSimpleDateFormat	java.text.SimpleDateFormat
    //   52	101	11	str1	String
    //   102	218	12	str2	String
    // Exception table:
    //   from	to	target	type
    //   97	104	333	java/lang/Exception
    //   139	149	333	java/lang/Exception
    //   152	159	333	java/lang/Exception
    //   162	186	333	java/lang/Exception
    //   212	225	333	java/lang/Exception
    //   228	238	333	java/lang/Exception
    //   246	255	333	java/lang/Exception
    //   278	288	333	java/lang/Exception
    //   291	298	333	java/lang/Exception
    //   317	330	333	java/lang/Exception
    //   371	376	379	java/io/IOException
    //   75	92	383	finally
    //   260	265	398	java/io/IOException
    //   298	303	402	java/io/IOException
    //   356	361	406	java/io/IOException
    //   391	395	410	java/io/IOException
    //   97	104	414	finally
    //   139	149	414	finally
    //   152	159	414	finally
    //   162	186	414	finally
    //   212	225	414	finally
    //   228	238	414	finally
    //   246	255	414	finally
    //   278	288	414	finally
    //   291	298	414	finally
    //   317	330	414	finally
    //   338	351	414	finally
    //   75	92	419	java/lang/Exception
  }
  
  private static void a(int paramInt, String paramString, boolean paramBoolean)
  {
    GMTrace.i(12976304160768L, 96681);
    StringBuilder localStringBuilder = null;
    Object localObject = localStringBuilder;
    if (paramInt == 6) {}
    try
    {
      String str = ph();
      localObject = localStringBuilder;
      if (str != null) {
        localObject = a(str, Process.myPid(), System.currentTimeMillis(), null);
      }
      localStringBuilder = new StringBuilder(1024);
      localStringBuilder.append("#[jin_crash]sig=").append(paramInt).append('\n');
      localStringBuilder.append("#crash.previous=").append(paramBoolean).append('\n');
      localStringBuilder.append(bC(""));
      localStringBuilder.append(paramString).append('\n');
      if (localObject != null)
      {
        localStringBuilder.append("******* ANR Trace *******\n");
        localStringBuilder.append((String)localObject);
      }
      paramString = localStringBuilder.toString();
      if (paramInt == 6) {}
      for (paramInt = 0;; paramInt = 8192)
      {
        b(paramString, paramInt, true);
        w.e("MicroMsg.MMCrashReporter", "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        if (!paramBoolean) {
          w.appenderClose();
        }
        GMTrace.o(12976304160768L, 96681);
        return;
      }
      return;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.MMCrashReporter", paramString, "Failed reporting JNI crash.", new Object[0]);
      GMTrace.o(12976304160768L, 96681);
    }
  }
  
  public static void a(ai.c paramc)
  {
    GMTrace.i(12975230418944L, 96673);
    ai.a(paramc);
    GMTrace.o(12975230418944L, 96673);
  }
  
  private static void b(String paramString, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(12976035725312L, 96679);
    bB(paramString);
    g.ork.a(11338, true, true, new Object[] { Integer.valueOf(2) });
    g.ork.a(25L, 0L, 1L, true);
    Object localObject;
    Context localContext;
    String str;
    if (ab.vM().endsWith(":push"))
    {
      g.ork.a(25L, 2L, 1L, true);
      localObject = g.ork;
      g.bca();
      localObject = paramString;
      if (f.ai(ab.getContext()) == 1)
      {
        int i = f.aj(ab.getContext());
        w.i("MicroMsg.MMCrashReporter", "google play crash size limit %s", new Object[] { Integer.valueOf(i) });
        localObject = paramString;
        if (paramString.length() > i) {
          localObject = paramString.substring(0, i);
        }
      }
      localContext = ab.getContext();
      str = ab.vM();
      if (!paramBoolean) {
        break label371;
      }
    }
    label371:
    for (paramString = "jni";; paramString = "java")
    {
      f.e(localContext, str, paramString);
      paramString = (String)localObject;
      if (paramInt > 0)
      {
        paramString = (String)localObject;
        if (((String)localObject).length() > paramInt) {
          paramString = ((String)localObject).substring(0, paramInt);
        }
      }
      if (p.x.bIV() != null)
      {
        localObject = new Intent();
        ((Intent)localObject).setAction("uncatch_exception");
        ((Intent)localObject).putExtra("exceptionPid", Process.myPid());
        ((Intent)localObject).putExtra("exceptionTime", SystemClock.elapsedRealtime());
        ((Intent)localObject).putExtra("userName", pg());
        ((Intent)localObject).putExtra("exceptionMsg", Base64.encodeToString(paramString.getBytes(), 2));
        p.x.bIV().r(ab.getContext(), (Intent)localObject);
      }
      GMTrace.o(12976035725312L, 96679);
      return;
      if (ab.vM().endsWith(":tools"))
      {
        g.ork.a(25L, 3L, 1L, true);
        break;
      }
      if (ab.vM().endsWith(":exdevice"))
      {
        g.ork.a(25L, 4L, 1L, true);
        break;
      }
      if (!ab.bPY()) {
        break;
      }
      g.ork.a(25L, 1L, 1L, true);
      break;
    }
  }
  
  public static boolean bA(String paramString)
  {
    Object localObject = null;
    GMTrace.i(12975096201216L, 96672);
    esI = paramString;
    if (p.x.bIV() == null) {}
    try
    {
      paramString = Class.forName("com.tencent.mm.plugin.sandbox.SubCoreSandBox");
    }
    catch (Exception localException)
    {
      try
      {
        Class localClass = Class.forName("com.tencent.mm.plugin.sandbox.SubCoreSandBox", true, ab.getContext().getClassLoader());
        localObject = localClass;
        w.i("MicroMsg.MMCrashReporter", "setup sanbox loadClass test1: " + paramString + " thisProcName: " + esI);
        w.i("MicroMsg.MMCrashReporter", "setup sanbox loadClass test2: " + localObject + " thisProcName: " + esI);
        paramString = com.tencent.mm.bj.d.eM("sandbox", ".SubCoreSandBox");
        w.i("MicroMsg.MMCrashReporter", "setup sanbox loadClass clz: " + paramString + " thisProcName: " + esI);
        if (paramString == null) {}
      }
      catch (Exception localException)
      {
        try
        {
          for (;;)
          {
            paramString = (p.u)paramString.newInstance();
            p.x.a(paramString);
            w.i("MicroMsg.MMCrashReporter", "setup sanbox mgr:" + paramString + " thisProcName: " + esI);
            try
            {
              paramString = (c)Class.forName("com.tencent.mm.crash.RDMCrashReporter").newInstance();
              paramString.ak(ab.getContext());
              as.gnb.B("last_login_uin", esH);
              b.a(paramString);
              new Object() {};
              GMTrace.o(12975096201216L, 96672);
              return true;
            }
            catch (Exception paramString)
            {
              w.w("MicroMsg.MMCrashReporter", "rdm crash reporter load failed");
              paramString = new j();
              paramString.ak(ab.getContext());
              b.a(paramString);
              paramString = x.get("ro.product.cpu.abi");
              if ((paramString != null) && (paramString.length() != 0) && ((paramString.equals("x86")) || (paramString.equals("x86-64")))) {
                break;
              }
              k.b("wechatCrashForJni", j.class.getClassLoader());
              CrashMonitorForJni.setClientVersionMsg(esJ);
              bz.ha(e.ghv);
              GMTrace.o(12975096201216L, 96672);
            }
            paramString = paramString;
            w.printErrStackTrace("MicroMsg.MMCrashReporter", paramString, "setup sanbox Failed printing stack trace1.", new Object[0]);
            paramString = null;
          }
          localException = localException;
          w.printErrStackTrace("MicroMsg.MMCrashReporter", localException, "setup sanbox Failed printing stack trace2.", new Object[0]);
        }
        catch (Exception paramString)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.MMCrashReporter", paramString, "", new Object[0]);
            w.w("MicroMsg.MMCrashReporter", "setup sanbox e type:%s, e msg:%s", new Object[] { paramString.getClass().getSimpleName(), paramString.getMessage() });
          }
        }
      }
    }
    return false;
  }
  
  private static void bB(String paramString)
  {
    GMTrace.i(12975364636672L, 96674);
    try
    {
      while (paramString.length() > 896)
      {
        int i = paramString.substring(0, 896).lastIndexOf("\n");
        if (-1 == i) {
          break;
        }
        w.e("MicroMsg.MMCrashReporter", paramString.substring(0, i));
        paramString = paramString.substring(i + 1);
      }
      w.e("MicroMsg.MMCrashReporter", paramString);
      GMTrace.o(12975364636672L, 96674);
      return;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.MMCrashReporter", paramString, "Failed printing stack trace.", new Object[0]);
      GMTrace.o(12975364636672L, 96674);
    }
  }
  
  /* Error */
  private static String bC(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 554
    //   3: ldc_w 556
    //   6: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 90	java/lang/StringBuilder
    //   12: dup
    //   13: sipush 256
    //   16: invokespecial 137	java/lang/StringBuilder:<init>	(I)V
    //   19: astore 12
    //   21: new 558	android/util/StringBuilderPrinter
    //   24: dup
    //   25: aload 12
    //   27: invokespecial 561	android/util/StringBuilderPrinter:<init>	(Ljava/lang/StringBuilder;)V
    //   30: astore 13
    //   32: invokestatic 310	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   35: astore 11
    //   37: aload 13
    //   39: new 90	java/lang/StringBuilder
    //   42: dup
    //   43: ldc_w 563
    //   46: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   49: getstatic 102	com/tencent/mm/protocal/d:tJC	I
    //   52: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   55: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   61: aload 13
    //   63: new 90	java/lang/StringBuilder
    //   66: dup
    //   67: ldc_w 568
    //   70: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   73: invokestatic 571	com/tencent/mm/y/bz:BV	()Ljava/lang/String;
    //   76: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   85: aload 13
    //   87: new 90	java/lang/StringBuilder
    //   90: dup
    //   91: ldc_w 573
    //   94: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   97: invokestatic 576	com/tencent/mm/compatible/d/p:sZ	()Ljava/lang/String;
    //   100: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   109: aload 13
    //   111: new 90	java/lang/StringBuilder
    //   114: dup
    //   115: ldc_w 578
    //   118: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   121: getstatic 583	com/tencent/mm/sdk/platformtools/e:REV	Ljava/lang/String;
    //   124: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   133: aload 13
    //   135: new 90	java/lang/StringBuilder
    //   138: dup
    //   139: ldc_w 585
    //   142: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   145: getstatic 465	com/tencent/mm/y/as:gnb	Lcom/tencent/mm/y/as;
    //   148: ldc_w 467
    //   151: getstatic 84	com/tencent/mm/app/j:esH	Ljava/lang/String;
    //   154: invokevirtual 471	com/tencent/mm/y/as:B	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   157: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   166: aload 13
    //   168: new 90	java/lang/StringBuilder
    //   171: dup
    //   172: ldc_w 587
    //   175: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   178: getstatic 70	com/tencent/mm/app/j:esG	Ljava/lang/String;
    //   181: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   190: aload 13
    //   192: new 90	java/lang/StringBuilder
    //   195: dup
    //   196: ldc_w 589
    //   199: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   202: invokestatic 60	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   205: getstatic 62	com/tencent/mm/app/j:esy	J
    //   208: lsub
    //   209: invokevirtual 592	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   212: ldc_w 594
    //   215: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: getstatic 88	com/tencent/mm/app/j:esI	Ljava/lang/String;
    //   221: invokestatic 597	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   224: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: ldc_w 599
    //   230: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   239: aload 13
    //   241: new 90	java/lang/StringBuilder
    //   244: dup
    //   245: ldc_w 601
    //   248: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   251: getstatic 604	com/tencent/mm/sdk/platformtools/e:TIME	Ljava/lang/String;
    //   254: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: ldc_w 606
    //   260: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: getstatic 609	com/tencent/mm/sdk/platformtools/e:HOSTNAME	Ljava/lang/String;
    //   266: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: ldc_w 606
    //   272: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: getstatic 614	com/tencent/mm/sdk/platformtools/f:eqV	I
    //   278: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   281: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   284: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   287: aload 13
    //   289: new 90	java/lang/StringBuilder
    //   292: dup
    //   293: ldc_w 616
    //   296: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   299: aload 11
    //   301: invokestatic 621	com/tencent/xweb/WebView:getTbsCoreVersion	(Landroid/content/Context;)I
    //   304: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   307: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   313: aload 13
    //   315: new 90	java/lang/StringBuilder
    //   318: dup
    //   319: ldc_w 623
    //   322: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   325: aload 11
    //   327: invokestatic 626	com/tencent/xweb/WebView:getTbsSDKVersion	(Landroid/content/Context;)I
    //   330: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   333: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   336: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   339: aload 13
    //   341: new 90	java/lang/StringBuilder
    //   344: dup
    //   345: ldc_w 628
    //   348: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   351: aload 11
    //   353: invokestatic 634	com/tencent/xweb/x5/sdk/d:getMiniQBVersion	(Landroid/content/Context;)Ljava/lang/String;
    //   356: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   362: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   365: getstatic 88	com/tencent/mm/app/j:esI	Ljava/lang/String;
    //   368: ldc_w 388
    //   371: invokevirtual 638	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   374: ifne +15 -> 389
    //   377: getstatic 88	com/tencent/mm/app/j:esI	Ljava/lang/String;
    //   380: ldc_w 640
    //   383: invokevirtual 638	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   386: ifeq +101 -> 487
    //   389: aload 11
    //   391: invokestatic 643	com/tencent/xweb/WebView:getCrashExtraMessage	(Landroid/content/Context;)Ljava/lang/String;
    //   394: astore 10
    //   396: aload 10
    //   398: ifnull +89 -> 487
    //   401: aload 10
    //   403: invokevirtual 175	java/lang/String:length	()I
    //   406: ifle +81 -> 487
    //   409: aload 10
    //   411: astore 9
    //   413: aload 10
    //   415: invokevirtual 175	java/lang/String:length	()I
    //   418: sipush 8192
    //   421: if_icmple +19 -> 440
    //   424: aload 10
    //   426: aload 10
    //   428: invokevirtual 175	java/lang/String:length	()I
    //   431: sipush 8192
    //   434: isub
    //   435: invokevirtual 551	java/lang/String:substring	(I)Ljava/lang/String;
    //   438: astore 9
    //   440: aload 13
    //   442: new 90	java/lang/StringBuilder
    //   445: dup
    //   446: ldc_w 645
    //   449: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   452: aload 9
    //   454: invokevirtual 374	java/lang/String:getBytes	()[B
    //   457: iconst_2
    //   458: invokestatic 380	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   461: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   467: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   470: ldc -53
    //   472: ldc_w 647
    //   475: iconst_1
    //   476: anewarray 4	java/lang/Object
    //   479: dup
    //   480: iconst_0
    //   481: aload 9
    //   483: aastore
    //   484: invokestatic 650	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   487: new 90	java/lang/StringBuilder
    //   490: dup
    //   491: ldc_w 652
    //   494: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   497: astore 10
    //   499: getstatic 656	com/tencent/mm/sdk/a/b:foreground	Z
    //   502: ifeq +808 -> 1310
    //   505: ldc_w 658
    //   508: astore 9
    //   510: aload 13
    //   512: aload 10
    //   514: aload 9
    //   516: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   519: ldc_w 606
    //   522: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: invokestatic 664	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   528: invokevirtual 667	java/lang/Thread:getName	()Ljava/lang/String;
    //   531: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   534: ldc_w 606
    //   537: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   540: getstatic 670	com/tencent/mm/sdk/a/b:vgQ	Ljava/lang/String;
    //   543: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   546: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   549: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   552: invokestatic 676	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   555: astore 10
    //   557: new 678	android/os/StatFs
    //   560: dup
    //   561: aload 10
    //   563: invokevirtual 683	java/io/File:getPath	()Ljava/lang/String;
    //   566: invokespecial 684	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   569: astore 14
    //   571: new 678	android/os/StatFs
    //   574: dup
    //   575: getstatic 687	com/tencent/mm/compatible/util/e:ghx	Ljava/lang/String;
    //   578: invokespecial 684	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   581: astore 15
    //   583: aload 11
    //   585: ldc_w 689
    //   588: invokevirtual 693	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   591: checkcast 695	android/app/ActivityManager
    //   594: invokevirtual 698	android/app/ActivityManager:getMemoryClass	()I
    //   597: istore_1
    //   598: aload 11
    //   600: ldc_w 689
    //   603: invokevirtual 693	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   606: checkcast 695	android/app/ActivityManager
    //   609: invokevirtual 701	android/app/ActivityManager:getLargeMemoryClass	()I
    //   612: istore_2
    //   613: invokestatic 310	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   616: astore 11
    //   618: invokestatic 310	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   621: invokevirtual 704	android/content/Context:getPackageName	()Ljava/lang/String;
    //   624: astore 16
    //   626: getstatic 113	com/tencent/mm/app/j:esK	[J
    //   629: astore 9
    //   631: aload 9
    //   633: monitorenter
    //   634: ldc_w 706
    //   637: ldc_w 708
    //   640: iconst_2
    //   641: anewarray 408	java/lang/Class
    //   644: dup
    //   645: iconst_0
    //   646: ldc 72
    //   648: aastore
    //   649: dup
    //   650: iconst_1
    //   651: ldc_w 710
    //   654: aastore
    //   655: invokevirtual 714	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   658: aload 11
    //   660: invokevirtual 718	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   663: iconst_2
    //   664: anewarray 4	java/lang/Object
    //   667: dup
    //   668: iconst_0
    //   669: aload 16
    //   671: aastore
    //   672: dup
    //   673: iconst_1
    //   674: new 14	com/tencent/mm/app/j$3
    //   677: dup
    //   678: invokespecial 719	com/tencent/mm/app/j$3:<init>	()V
    //   681: aastore
    //   682: invokevirtual 725	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   685: pop
    //   686: getstatic 113	com/tencent/mm/app/j:esK	[J
    //   689: ldc2_w 726
    //   692: invokevirtual 731	java/lang/Object:wait	(J)V
    //   695: aload 9
    //   697: monitorexit
    //   698: ldc_w 733
    //   701: bipush 13
    //   703: anewarray 4	java/lang/Object
    //   706: dup
    //   707: iconst_0
    //   708: iload_1
    //   709: invokestatic 283	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   712: aastore
    //   713: dup
    //   714: iconst_1
    //   715: iload_2
    //   716: invokestatic 283	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   719: aastore
    //   720: dup
    //   721: iconst_2
    //   722: aload 10
    //   724: invokevirtual 736	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   727: aastore
    //   728: dup
    //   729: iconst_3
    //   730: aload 14
    //   732: invokevirtual 739	android/os/StatFs:getBlockSize	()I
    //   735: invokestatic 283	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   738: aastore
    //   739: dup
    //   740: iconst_4
    //   741: aload 14
    //   743: invokevirtual 742	android/os/StatFs:getBlockCount	()I
    //   746: invokestatic 283	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   749: aastore
    //   750: dup
    //   751: iconst_5
    //   752: aload 14
    //   754: invokevirtual 745	android/os/StatFs:getAvailableBlocks	()I
    //   757: invokestatic 283	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   760: aastore
    //   761: dup
    //   762: bipush 6
    //   764: getstatic 113	com/tencent/mm/app/j:esK	[J
    //   767: iconst_0
    //   768: laload
    //   769: invokestatic 750	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   772: aastore
    //   773: dup
    //   774: bipush 7
    //   776: getstatic 113	com/tencent/mm/app/j:esK	[J
    //   779: iconst_1
    //   780: laload
    //   781: invokestatic 750	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   784: aastore
    //   785: dup
    //   786: bipush 8
    //   788: getstatic 113	com/tencent/mm/app/j:esK	[J
    //   791: iconst_2
    //   792: laload
    //   793: invokestatic 750	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   796: aastore
    //   797: dup
    //   798: bipush 9
    //   800: getstatic 687	com/tencent/mm/compatible/util/e:ghx	Ljava/lang/String;
    //   803: aastore
    //   804: dup
    //   805: bipush 10
    //   807: aload 15
    //   809: invokevirtual 739	android/os/StatFs:getBlockSize	()I
    //   812: invokestatic 283	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   815: aastore
    //   816: dup
    //   817: bipush 11
    //   819: aload 15
    //   821: invokevirtual 742	android/os/StatFs:getBlockCount	()I
    //   824: invokestatic 283	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   827: aastore
    //   828: dup
    //   829: bipush 12
    //   831: aload 15
    //   833: invokevirtual 745	android/os/StatFs:getAvailableBlocks	()I
    //   836: invokestatic 283	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   839: aastore
    //   840: invokestatic 754	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   843: astore 9
    //   845: aload 13
    //   847: new 90	java/lang/StringBuilder
    //   850: dup
    //   851: ldc_w 756
    //   854: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   857: aload 9
    //   859: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   862: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   865: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   868: new 185	java/util/Date
    //   871: dup
    //   872: invokespecial 757	java/util/Date:<init>	()V
    //   875: astore 9
    //   877: new 139	java/text/SimpleDateFormat
    //   880: dup
    //   881: ldc_w 759
    //   884: invokestatic 765	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   887: invokespecial 768	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   890: astore 10
    //   892: aload 13
    //   894: new 90	java/lang/StringBuilder
    //   897: dup
    //   898: ldc_w 770
    //   901: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   904: aload 10
    //   906: aload 9
    //   908: invokevirtual 773	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   911: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   914: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   917: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   920: invokestatic 310	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   923: ldc_w 689
    //   926: invokevirtual 693	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   929: checkcast 695	android/app/ActivityManager
    //   932: astore 14
    //   934: new 775	android/app/ActivityManager$MemoryInfo
    //   937: dup
    //   938: invokespecial 776	android/app/ActivityManager$MemoryInfo:<init>	()V
    //   941: astore 15
    //   943: aload 14
    //   945: aload 15
    //   947: invokevirtual 780	android/app/ActivityManager:getMemoryInfo	(Landroid/app/ActivityManager$MemoryInfo;)V
    //   950: lconst_0
    //   951: lstore 5
    //   953: bipush 16
    //   955: invokestatic 786	com/tencent/mm/compatible/util/d:et	(I)Z
    //   958: ifeq +465 -> 1423
    //   961: aload 15
    //   963: getfield 789	android/app/ActivityManager$MemoryInfo:totalMem	J
    //   966: lstore_3
    //   967: new 90	java/lang/StringBuilder
    //   970: dup
    //   971: invokespecial 790	java/lang/StringBuilder:<init>	()V
    //   974: ldc 86
    //   976: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   979: ldc_w 792
    //   982: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   985: lload_3
    //   986: invokevirtual 592	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   989: ldc_w 794
    //   992: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   995: aload 15
    //   997: getfield 797	android/app/ActivityManager$MemoryInfo:availMem	J
    //   1000: invokevirtual 592	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1003: ldc_w 794
    //   1006: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1009: aload 15
    //   1011: getfield 800	android/app/ActivityManager$MemoryInfo:threshold	J
    //   1014: invokevirtual 592	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1017: ldc_w 794
    //   1020: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1023: aload 15
    //   1025: getfield 803	android/app/ActivityManager$MemoryInfo:lowMemory	Z
    //   1028: invokevirtual 237	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   1031: ldc_w 805
    //   1034: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1037: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1040: astore 9
    //   1042: new 90	java/lang/StringBuilder
    //   1045: dup
    //   1046: invokespecial 790	java/lang/StringBuilder:<init>	()V
    //   1049: aload 9
    //   1051: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1054: ldc_w 807
    //   1057: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1060: invokestatic 812	android/os/Debug:getNativeHeapSize	()J
    //   1063: invokevirtual 592	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1066: ldc_w 794
    //   1069: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1072: invokestatic 815	android/os/Debug:getNativeHeapAllocatedSize	()J
    //   1075: invokevirtual 592	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1078: ldc_w 794
    //   1081: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1084: invokestatic 818	android/os/Debug:getNativeHeapFreeSize	()J
    //   1087: invokevirtual 592	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1090: ldc_w 805
    //   1093: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1096: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1099: astore 9
    //   1101: iconst_1
    //   1102: newarray <illegal type>
    //   1104: astore 10
    //   1106: aload 10
    //   1108: iconst_0
    //   1109: invokestatic 223	android/os/Process:myPid	()I
    //   1112: iastore
    //   1113: aload 14
    //   1115: aload 10
    //   1117: invokevirtual 822	android/app/ActivityManager:getProcessMemoryInfo	([I)[Landroid/os/Debug$MemoryInfo;
    //   1120: astore 11
    //   1122: aload 11
    //   1124: ifnull +516 -> 1640
    //   1127: aload 11
    //   1129: arraylength
    //   1130: ifle +510 -> 1640
    //   1133: aload 11
    //   1135: iconst_0
    //   1136: aaload
    //   1137: ifnull +503 -> 1640
    //   1140: aload 11
    //   1142: iconst_0
    //   1143: aaload
    //   1144: astore 11
    //   1146: new 90	java/lang/StringBuilder
    //   1149: dup
    //   1150: invokespecial 790	java/lang/StringBuilder:<init>	()V
    //   1153: aload 9
    //   1155: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1158: ldc_w 824
    //   1161: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1164: aload 10
    //   1166: iconst_0
    //   1167: iaload
    //   1168: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1171: ldc_w 826
    //   1174: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1177: aload 11
    //   1179: invokevirtual 831	android/os/Debug$MemoryInfo:getTotalPss	()I
    //   1182: bipush 10
    //   1184: ishl
    //   1185: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1188: ldc_w 794
    //   1191: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1194: aload 11
    //   1196: invokevirtual 834	android/os/Debug$MemoryInfo:getTotalPrivateDirty	()I
    //   1199: bipush 10
    //   1201: ishl
    //   1202: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1205: ldc_w 794
    //   1208: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1211: aload 11
    //   1213: invokevirtual 837	android/os/Debug$MemoryInfo:getTotalSharedDirty	()I
    //   1216: bipush 10
    //   1218: ishl
    //   1219: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1222: ldc_w 805
    //   1225: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1228: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1231: astore 9
    //   1233: aload 13
    //   1235: new 90	java/lang/StringBuilder
    //   1238: dup
    //   1239: ldc_w 839
    //   1242: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1245: aload 9
    //   1247: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1250: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1253: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   1256: aload_0
    //   1257: invokestatic 842	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   1260: ifne +25 -> 1285
    //   1263: aload 13
    //   1265: new 90	java/lang/StringBuilder
    //   1268: dup
    //   1269: ldc_w 844
    //   1272: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1275: aload_0
    //   1276: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1279: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1282: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   1285: aload 13
    //   1287: ldc_w 846
    //   1290: invokevirtual 566	android/util/StringBuilderPrinter:println	(Ljava/lang/String;)V
    //   1293: aload 12
    //   1295: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1298: astore_0
    //   1299: ldc2_w 554
    //   1302: ldc_w 556
    //   1305: invokestatic 116	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1308: aload_0
    //   1309: areturn
    //   1310: ldc_w 847
    //   1313: astore 9
    //   1315: goto -805 -> 510
    //   1318: astore 11
    //   1320: getstatic 113	com/tencent/mm/app/j:esK	[J
    //   1323: iconst_0
    //   1324: ldc2_w 848
    //   1327: lastore
    //   1328: getstatic 113	com/tencent/mm/app/j:esK	[J
    //   1331: iconst_1
    //   1332: ldc2_w 848
    //   1335: lastore
    //   1336: getstatic 113	com/tencent/mm/app/j:esK	[J
    //   1339: iconst_2
    //   1340: ldc2_w 848
    //   1343: lastore
    //   1344: ldc -53
    //   1346: aload 11
    //   1348: ldc_w 851
    //   1351: iconst_0
    //   1352: anewarray 4	java/lang/Object
    //   1355: invokestatic 211	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1358: getstatic 113	com/tencent/mm/app/j:esK	[J
    //   1361: astore 11
    //   1363: aload 11
    //   1365: monitorenter
    //   1366: getstatic 113	com/tencent/mm/app/j:esK	[J
    //   1369: invokevirtual 854	java/lang/Object:notify	()V
    //   1372: aload 11
    //   1374: monitorexit
    //   1375: goto -680 -> 695
    //   1378: astore 10
    //   1380: aload 11
    //   1382: monitorexit
    //   1383: aload 10
    //   1385: athrow
    //   1386: astore 10
    //   1388: aload 9
    //   1390: monitorexit
    //   1391: aload 10
    //   1393: athrow
    //   1394: astore 9
    //   1396: ldc -53
    //   1398: ldc_w 856
    //   1401: iconst_1
    //   1402: anewarray 4	java/lang/Object
    //   1405: dup
    //   1406: iconst_0
    //   1407: aload 9
    //   1409: invokevirtual 493	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1412: aastore
    //   1413: invokestatic 858	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1416: ldc 86
    //   1418: astore 9
    //   1420: goto -575 -> 845
    //   1423: new 860	java/io/RandomAccessFile
    //   1426: dup
    //   1427: ldc_w 862
    //   1430: ldc_w 863
    //   1433: invokespecial 865	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1436: astore 10
    //   1438: aload 10
    //   1440: astore 9
    //   1442: new 867	java/lang/StringBuffer
    //   1445: dup
    //   1446: invokespecial 868	java/lang/StringBuffer:<init>	()V
    //   1449: astore 11
    //   1451: aload 10
    //   1453: astore 9
    //   1455: aload 10
    //   1457: invokevirtual 869	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   1460: invokevirtual 873	java/lang/String:toCharArray	()[C
    //   1463: astore 16
    //   1465: aload 10
    //   1467: astore 9
    //   1469: aload 16
    //   1471: arraylength
    //   1472: istore_2
    //   1473: iconst_0
    //   1474: istore_1
    //   1475: iload_1
    //   1476: iload_2
    //   1477: if_icmpge +38 -> 1515
    //   1480: aload 16
    //   1482: iload_1
    //   1483: caload
    //   1484: bipush 57
    //   1486: if_icmpgt +157 -> 1643
    //   1489: aload 16
    //   1491: iload_1
    //   1492: caload
    //   1493: bipush 48
    //   1495: if_icmplt +148 -> 1643
    //   1498: aload 10
    //   1500: astore 9
    //   1502: aload 11
    //   1504: aload 16
    //   1506: iload_1
    //   1507: caload
    //   1508: invokevirtual 876	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   1511: pop
    //   1512: goto +131 -> 1643
    //   1515: aload 10
    //   1517: astore 9
    //   1519: aload 11
    //   1521: invokevirtual 877	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1524: ldc2_w 848
    //   1527: invokestatic 881	com/tencent/mm/sdk/platformtools/bg:getLong	(Ljava/lang/String;J)J
    //   1530: lstore 7
    //   1532: lload 5
    //   1534: lstore_3
    //   1535: lload 7
    //   1537: lconst_0
    //   1538: lcmp
    //   1539: ifle +9 -> 1548
    //   1542: lload 7
    //   1544: bipush 10
    //   1546: lshl
    //   1547: lstore_3
    //   1548: aload 10
    //   1550: invokevirtual 882	java/io/RandomAccessFile:close	()V
    //   1553: goto -586 -> 967
    //   1556: astore 9
    //   1558: goto -591 -> 967
    //   1561: astore 11
    //   1563: aconst_null
    //   1564: astore 10
    //   1566: aload 10
    //   1568: astore 9
    //   1570: ldc -53
    //   1572: aload 11
    //   1574: ldc 86
    //   1576: iconst_0
    //   1577: anewarray 4	java/lang/Object
    //   1580: invokestatic 211	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1583: lload 5
    //   1585: lstore_3
    //   1586: aload 10
    //   1588: ifnull -621 -> 967
    //   1591: aload 10
    //   1593: invokevirtual 882	java/io/RandomAccessFile:close	()V
    //   1596: lload 5
    //   1598: lstore_3
    //   1599: goto -632 -> 967
    //   1602: astore 9
    //   1604: lload 5
    //   1606: lstore_3
    //   1607: goto -640 -> 967
    //   1610: astore_0
    //   1611: aconst_null
    //   1612: astore 9
    //   1614: aload 9
    //   1616: ifnull +8 -> 1624
    //   1619: aload 9
    //   1621: invokevirtual 882	java/io/RandomAccessFile:close	()V
    //   1624: aload_0
    //   1625: athrow
    //   1626: astore 9
    //   1628: goto -4 -> 1624
    //   1631: astore_0
    //   1632: goto -18 -> 1614
    //   1635: astore 11
    //   1637: goto -71 -> 1566
    //   1640: goto -407 -> 1233
    //   1643: iload_1
    //   1644: iconst_1
    //   1645: iadd
    //   1646: istore_1
    //   1647: goto -172 -> 1475
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1650	0	paramString	String
    //   597	1050	1	i	int
    //   612	866	2	j	int
    //   966	641	3	l1	long
    //   951	654	5	l2	long
    //   1530	13	7	l3	long
    //   411	978	9	localObject1	Object
    //   1394	14	9	localException1	Exception
    //   1418	100	9	localObject2	Object
    //   1556	1	9	localException2	Exception
    //   1568	1	9	localRandomAccessFile1	java.io.RandomAccessFile
    //   1602	1	9	localException3	Exception
    //   1612	8	9	localObject3	Object
    //   1626	1	9	localException4	Exception
    //   394	771	10	localObject4	Object
    //   1378	6	10	localObject5	Object
    //   1386	6	10	localObject6	Object
    //   1436	156	10	localRandomAccessFile2	java.io.RandomAccessFile
    //   35	1177	11	localObject7	Object
    //   1318	29	11	localException5	Exception
    //   1361	159	11	localObject8	Object
    //   1561	12	11	localException6	Exception
    //   1635	1	11	localException7	Exception
    //   19	1275	12	localStringBuilder	StringBuilder
    //   30	1256	13	localStringBuilderPrinter	android.util.StringBuilderPrinter
    //   569	545	14	localObject9	Object
    //   581	443	15	localObject10	Object
    //   624	881	16	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   634	695	1318	java/lang/Exception
    //   1366	1375	1378	finally
    //   1380	1383	1378	finally
    //   634	695	1386	finally
    //   695	698	1386	finally
    //   1320	1366	1386	finally
    //   1383	1386	1386	finally
    //   1388	1391	1386	finally
    //   552	634	1394	java/lang/Exception
    //   698	845	1394	java/lang/Exception
    //   1391	1394	1394	java/lang/Exception
    //   1548	1553	1556	java/lang/Exception
    //   1423	1438	1561	java/lang/Exception
    //   1591	1596	1602	java/lang/Exception
    //   1423	1438	1610	finally
    //   1619	1624	1626	java/lang/Exception
    //   1442	1451	1631	finally
    //   1455	1465	1631	finally
    //   1469	1473	1631	finally
    //   1502	1512	1631	finally
    //   1519	1532	1631	finally
    //   1570	1583	1631	finally
    //   1442	1451	1635	java/lang/Exception
    //   1455	1465	1635	java/lang/Exception
    //   1469	1473	1635	java/lang/Exception
    //   1502	1512	1635	java/lang/Exception
    //   1519	1532	1635	java/lang/Exception
  }
  
  private static String pg()
  {
    GMTrace.i(12974961983488L, 96671);
    String str2 = as.gnb.B("login_weixin_username", "");
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = as.gnb.B("login_user_name", "never_login_crash");
    }
    GMTrace.o(12974961983488L, 96671);
    return str1;
  }
  
  private static String ph()
  {
    GMTrace.i(12976438378496L, 96682);
    try
    {
      localObject2 = x.get("dalvik.vm.stack-trace-file");
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 0) {}
      }
      else
      {
        localObject1 = "/data/anr/traces.txt";
      }
    }
    catch (Exception localException)
    {
      String str1;
      for (;;)
      {
        Object localObject2;
        Object localObject1;
        int i;
        String str2;
        w.printErrStackTrace("MicroMsg.MMCrashReporter", localException, "Failed finding out ANR trace file path, using default.", new Object[0]);
        str1 = "/data/anr/traces.txt";
      }
      if (!new File(str1).isFile()) {
        break label174;
      }
      GMTrace.o(12976438378496L, 96682);
      return str1;
      GMTrace.o(12976438378496L, 96682);
    }
    i = ((String)localObject1).lastIndexOf('.');
    if (i != -1)
    {
      str2 = ab.vM();
      if (str2 != null)
      {
        localObject2 = str2;
        if (str2.length() != 0) {}
      }
      else
      {
        localObject2 = "com.tencent.mm";
      }
      localObject2 = ((String)localObject1).substring(0, i) + '_' + (String)localObject2 + ((String)localObject1).substring(i);
      if (new File((String)localObject2).isFile())
      {
        GMTrace.o(12976438378496L, 96682);
        return (String)localObject2;
      }
    }
    label174:
    return null;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(12975767289856L, 96677);
    ai.a(parama);
    GMTrace.o(12975767289856L, 96677);
  }
  
  public final void a(ai paramai, String paramString, Throwable paramThrowable)
  {
    GMTrace.i(12975901507584L, 96678);
    if ((paramThrowable instanceof AssertionFailedError))
    {
      String str1 = paramThrowable.getMessage();
      if (!bg.nm(str1))
      {
        paramai = paramai.viG.entrySet().iterator();
        while ((paramai != null) && (paramai.hasNext()))
        {
          Map.Entry localEntry = (Map.Entry)paramai.next();
          String str2 = (String)localEntry.getKey();
          if ((!TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty(str1)) && (str1.startsWith(str2)))
          {
            paramai = ((ai.b)localEntry.getValue()).Cz();
            if (bg.nm(paramai)) {
              break label176;
            }
          }
        }
      }
    }
    for (;;)
    {
      n.b(paramThrowable);
      b(bC(paramai) + paramString, 0, false);
      GMTrace.o(12975901507584L, 96678);
      return;
      paramai = "";
      break;
      label176:
      paramai = "";
    }
  }
  
  /* Error */
  public final void ak(final Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 972
    //   3: ldc_w 974
    //   6: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokestatic 977	com/tencent/mm/sdk/platformtools/ai:a	(Lcom/tencent/mm/sdk/platformtools/ai$d;)V
    //   13: getstatic 88	com/tencent/mm/app/j:esI	Ljava/lang/String;
    //   16: ldc_w 298
    //   19: invokevirtual 301	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   22: ifeq +548 -> 570
    //   25: ldc_w 896
    //   28: invokestatic 509	com/tencent/mm/compatible/d/x:get	(Ljava/lang/String;)Ljava/lang/String;
    //   31: astore 7
    //   33: aload 7
    //   35: ifnull +15 -> 50
    //   38: aload 7
    //   40: astore 6
    //   42: aload 7
    //   44: invokevirtual 175	java/lang/String:length	()I
    //   47: ifne +8 -> 55
    //   50: ldc_w 898
    //   53: astore 6
    //   55: new 680	java/io/File
    //   58: dup
    //   59: aload 6
    //   61: invokespecial 904	java/io/File:<init>	(Ljava/lang/String;)V
    //   64: astore 7
    //   66: aload_0
    //   67: aload 7
    //   69: invokevirtual 980	java/io/File:getParent	()Ljava/lang/String;
    //   72: putfield 982	com/tencent/mm/app/j:esD	Ljava/lang/String;
    //   75: aload_0
    //   76: getfield 982	com/tencent/mm/app/j:esD	Ljava/lang/String;
    //   79: ifnull +13 -> 92
    //   82: aload_0
    //   83: getfield 982	com/tencent/mm/app/j:esD	Ljava/lang/String;
    //   86: invokevirtual 175	java/lang/String:length	()I
    //   89: ifne +10 -> 99
    //   92: aload_0
    //   93: ldc_w 984
    //   96: putfield 982	com/tencent/mm/app/j:esD	Ljava/lang/String;
    //   99: aload_0
    //   100: aload 7
    //   102: invokevirtual 985	java/io/File:getName	()Ljava/lang/String;
    //   105: putfield 987	com/tencent/mm/app/j:esE	Ljava/lang/String;
    //   108: aload_0
    //   109: new 989	android/os/ConditionVariable
    //   112: dup
    //   113: invokespecial 990	android/os/ConditionVariable:<init>	()V
    //   116: putfield 992	com/tencent/mm/app/j:esF	Landroid/os/ConditionVariable;
    //   119: ldc -53
    //   121: new 90	java/lang/StringBuilder
    //   124: dup
    //   125: ldc_w 994
    //   128: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   131: aload 6
    //   133: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokestatic 430	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: aload_0
    //   143: new 996	java/util/HashSet
    //   146: dup
    //   147: invokespecial 997	java/util/HashSet:<init>	()V
    //   150: putfield 999	com/tencent/mm/app/j:esC	Ljava/util/HashSet;
    //   153: aload_0
    //   154: new 16	com/tencent/mm/app/j$a
    //   157: dup
    //   158: aload_0
    //   159: aload_0
    //   160: getfield 982	com/tencent/mm/app/j:esD	Ljava/lang/String;
    //   163: invokespecial 1002	com/tencent/mm/app/j$a:<init>	(Lcom/tencent/mm/app/j;Ljava/lang/String;)V
    //   166: putfield 1004	com/tencent/mm/app/j:esA	Lcom/tencent/mm/app/j$a;
    //   169: aload_0
    //   170: getfield 1004	com/tencent/mm/app/j:esA	Lcom/tencent/mm/app/j$a;
    //   173: invokevirtual 1007	com/tencent/mm/app/j$a:startWatching	()V
    //   176: new 680	java/io/File
    //   179: dup
    //   180: aload_1
    //   181: invokevirtual 1010	android/content/Context:getFilesDir	()Ljava/io/File;
    //   184: ldc_w 1012
    //   187: invokespecial 1015	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   190: new 12	com/tencent/mm/app/j$2
    //   193: dup
    //   194: aload_0
    //   195: aload_1
    //   196: invokespecial 1018	com/tencent/mm/app/j$2:<init>	(Lcom/tencent/mm/app/j;Landroid/content/Context;)V
    //   199: invokevirtual 1022	java/io/File:listFiles	(Ljava/io/FilenameFilter;)[Ljava/io/File;
    //   202: astore 8
    //   204: aload 8
    //   206: ifnull +364 -> 570
    //   209: new 90	java/lang/StringBuilder
    //   212: dup
    //   213: sipush 16384
    //   216: invokespecial 137	java/lang/StringBuilder:<init>	(I)V
    //   219: astore 9
    //   221: ldc_w 1024
    //   224: invokestatic 1030	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   227: astore 10
    //   229: aload 8
    //   231: arraylength
    //   232: istore 5
    //   234: iconst_0
    //   235: istore_2
    //   236: iload_2
    //   237: iload 5
    //   239: if_icmpge +331 -> 570
    //   242: aload 8
    //   244: iload_2
    //   245: aaload
    //   246: astore 11
    //   248: iconst_m1
    //   249: istore_3
    //   250: ldc -53
    //   252: new 90	java/lang/StringBuilder
    //   255: dup
    //   256: ldc_w 1032
    //   259: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   262: aload 11
    //   264: invokevirtual 426	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   267: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   270: invokestatic 430	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   273: new 159	java/io/BufferedReader
    //   276: dup
    //   277: new 161	java/io/FileReader
    //   280: dup
    //   281: aload 11
    //   283: invokespecial 1035	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   286: invokespecial 165	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   289: astore 6
    //   291: aload 6
    //   293: astore_1
    //   294: aload 9
    //   296: iconst_0
    //   297: invokevirtual 1038	java/lang/StringBuilder:setLength	(I)V
    //   300: aload 6
    //   302: astore_1
    //   303: aload 6
    //   305: invokevirtual 168	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   308: astore 7
    //   310: aload 7
    //   312: ifnull +154 -> 466
    //   315: iload_3
    //   316: istore 4
    //   318: iload_3
    //   319: ifge +44 -> 363
    //   322: aload 6
    //   324: astore_1
    //   325: aload 10
    //   327: aload 7
    //   329: invokevirtual 1042	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   332: astore 12
    //   334: iload_3
    //   335: istore 4
    //   337: aload 6
    //   339: astore_1
    //   340: aload 12
    //   342: invokevirtual 1047	java/util/regex/Matcher:matches	()Z
    //   345: ifeq +18 -> 363
    //   348: aload 6
    //   350: astore_1
    //   351: aload 12
    //   353: iconst_1
    //   354: invokevirtual 1050	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   357: iconst_0
    //   358: invokestatic 1054	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   361: istore 4
    //   363: aload 6
    //   365: astore_1
    //   366: aload 9
    //   368: aload 7
    //   370: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: bipush 10
    //   375: invokevirtual 157	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: iload 4
    //   381: istore_3
    //   382: goto -82 -> 300
    //   385: astore 7
    //   387: aload 6
    //   389: astore_1
    //   390: ldc -53
    //   392: aload 7
    //   394: new 90	java/lang/StringBuilder
    //   397: dup
    //   398: ldc_w 1056
    //   401: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   404: aload 11
    //   406: invokevirtual 426	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   409: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   412: iconst_0
    //   413: anewarray 4	java/lang/Object
    //   416: invokestatic 211	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   419: aload 6
    //   421: ifnull +8 -> 429
    //   424: aload 6
    //   426: invokevirtual 199	java/io/BufferedReader:close	()V
    //   429: aload 11
    //   431: invokevirtual 1059	java/io/File:delete	()Z
    //   434: pop
    //   435: iload_2
    //   436: iconst_1
    //   437: iadd
    //   438: istore_2
    //   439: goto -203 -> 236
    //   442: astore 6
    //   444: ldc -53
    //   446: aload 6
    //   448: ldc_w 909
    //   451: iconst_0
    //   452: anewarray 4	java/lang/Object
    //   455: invokestatic 211	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   458: ldc_w 898
    //   461: astore 6
    //   463: goto -408 -> 55
    //   466: aload 6
    //   468: astore_1
    //   469: aload 9
    //   471: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   474: getstatic 111	com/tencent/mm/app/j:esJ	Ljava/lang/String;
    //   477: invokevirtual 172	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   480: ifeq +63 -> 543
    //   483: aload 6
    //   485: astore_1
    //   486: aload 9
    //   488: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   491: aload 9
    //   493: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   496: getstatic 111	com/tencent/mm/app/j:esJ	Ljava/lang/String;
    //   499: invokevirtual 1062	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   502: getstatic 111	com/tencent/mm/app/j:esJ	Ljava/lang/String;
    //   505: invokevirtual 175	java/lang/String:length	()I
    //   508: iadd
    //   509: invokevirtual 551	java/lang/String:substring	(I)Ljava/lang/String;
    //   512: astore 7
    //   514: aload 7
    //   516: ifnull +27 -> 543
    //   519: aload 6
    //   521: astore_1
    //   522: aload 7
    //   524: invokevirtual 1065	java/lang/String:trim	()Ljava/lang/String;
    //   527: invokevirtual 175	java/lang/String:length	()I
    //   530: ifle +13 -> 543
    //   533: aload 6
    //   535: astore_1
    //   536: iload_3
    //   537: aload 7
    //   539: iconst_1
    //   540: invokestatic 1067	com/tencent/mm/app/j:a	(ILjava/lang/String;Z)V
    //   543: aload 6
    //   545: invokevirtual 199	java/io/BufferedReader:close	()V
    //   548: goto -119 -> 429
    //   551: astore_1
    //   552: goto -123 -> 429
    //   555: astore 6
    //   557: aconst_null
    //   558: astore_1
    //   559: aload_1
    //   560: ifnull +7 -> 567
    //   563: aload_1
    //   564: invokevirtual 199	java/io/BufferedReader:close	()V
    //   567: aload 6
    //   569: athrow
    //   570: ldc2_w 972
    //   573: ldc_w 974
    //   576: invokestatic 116	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   579: return
    //   580: astore_1
    //   581: goto -152 -> 429
    //   584: astore_1
    //   585: goto -18 -> 567
    //   588: astore 6
    //   590: goto -31 -> 559
    //   593: astore 7
    //   595: aconst_null
    //   596: astore 6
    //   598: goto -211 -> 387
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	601	0	this	j
    //   0	601	1	paramContext	Context
    //   235	204	2	i	int
    //   249	288	3	j	int
    //   316	64	4	k	int
    //   232	8	5	m	int
    //   40	385	6	localObject1	Object
    //   442	5	6	localException	Exception
    //   461	83	6	str1	String
    //   555	13	6	localObject2	Object
    //   588	1	6	localObject3	Object
    //   596	1	6	localObject4	Object
    //   31	338	7	localObject5	Object
    //   385	8	7	localIOException1	java.io.IOException
    //   512	26	7	str2	String
    //   593	1	7	localIOException2	java.io.IOException
    //   202	41	8	arrayOfFile	File[]
    //   219	273	9	localStringBuilder	StringBuilder
    //   227	99	10	localPattern	java.util.regex.Pattern
    //   246	184	11	localFile	File
    //   332	20	12	localMatcher	java.util.regex.Matcher
    // Exception table:
    //   from	to	target	type
    //   294	300	385	java/io/IOException
    //   303	310	385	java/io/IOException
    //   325	334	385	java/io/IOException
    //   340	348	385	java/io/IOException
    //   351	363	385	java/io/IOException
    //   366	379	385	java/io/IOException
    //   469	483	385	java/io/IOException
    //   486	514	385	java/io/IOException
    //   522	533	385	java/io/IOException
    //   536	543	385	java/io/IOException
    //   25	33	442	java/lang/Exception
    //   42	50	442	java/lang/Exception
    //   543	548	551	java/io/IOException
    //   273	291	555	finally
    //   424	429	580	java/io/IOException
    //   563	567	584	java/io/IOException
    //   294	300	588	finally
    //   303	310	588	finally
    //   325	334	588	finally
    //   340	348	588	finally
    //   351	363	588	finally
    //   366	379	588	finally
    //   390	419	588	finally
    //   469	483	588	finally
    //   486	514	588	finally
    //   522	533	588	finally
    //   536	543	588	finally
    //   273	291	593	java/io/IOException
  }
  
  public final void g(int paramInt, String paramString)
  {
    GMTrace.i(12976169943040L, 96680);
    a(paramInt, paramString, false);
    GMTrace.o(12976169943040L, 96680);
  }
  
  final void i(String paramString, int paramInt)
  {
    GMTrace.i(12976706813952L, 96684);
    Recovery.cng();
    g.ork.a(11339, true, true, new Object[] { Integer.valueOf(5000), Integer.valueOf(0) });
    g.ork.a(26L, 0L, 1L, true);
    bB(paramString);
    Object localObject = g.ork;
    g.bca();
    long l = System.currentTimeMillis();
    if (l - this.esB < 120000L)
    {
      GMTrace.o(12976706813952L, 96684);
      return;
    }
    this.esB = l;
    f.e(ab.getContext(), ab.vM(), "anr");
    localObject = new StringBuilder(4096);
    ((StringBuilder)localObject).append(bC(""));
    ((StringBuilder)localObject).append("******* ANR Trace *******\n");
    ((StringBuilder)localObject).append(paramString);
    if (p.x.bIV() != null)
    {
      paramString = new Intent();
      paramString.setAction("uncatch_exception");
      paramString.putExtra("tag", "anr");
      paramString.putExtra("exceptionPid", paramInt);
      paramString.putExtra("exceptionTime", SystemClock.elapsedRealtime());
      paramString.putExtra("userName", as.gnb.B("login_user_name", "never_login_crash"));
      paramString.putExtra("exceptionMsg", Base64.encodeToString(((StringBuilder)localObject).toString().getBytes(), 2));
      p.x.bIV().r(ab.getContext(), paramString);
    }
    GMTrace.o(12976706813952L, 96684);
  }
  
  public final void r(String paramString1, String paramString2)
  {
    GMTrace.i(12975633072128L, 96676);
    if (p.x.bIV() != null)
    {
      Intent localIntent = new Intent();
      localIntent.setAction("custom_exception");
      localIntent.putExtra("userName", pg());
      localIntent.putExtra("tag", paramString2);
      localIntent.putExtra("exceptionMsg", paramString1);
      p.x.bIV().r(ab.getContext(), localIntent);
    }
    GMTrace.o(12975633072128L, 96676);
  }
  
  private final class a
    extends FileObserver
  {
    a(String paramString)
    {
      super(712);
      GMTrace.i(12961674428416L, 96572);
      GMTrace.o(12961674428416L, 96572);
    }
    
    /* Error */
    public final void onEvent(int paramInt, String paramString)
    {
      // Byte code:
      //   0: ldc2_w 32
      //   3: ldc 34
      //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: invokestatic 40	java/lang/System:currentTimeMillis	()J
      //   11: aload_0
      //   12: getfield 13	com/tencent/mm/app/j$a:esN	Lcom/tencent/mm/app/j;
      //   15: getfield 44	com/tencent/mm/app/j:esB	J
      //   18: lsub
      //   19: ldc2_w 45
      //   22: lcmp
      //   23: ifge +18 -> 41
      //   26: iconst_1
      //   27: istore_3
      //   28: iload_3
      //   29: ifeq +17 -> 46
      //   32: ldc2_w 32
      //   35: ldc 34
      //   37: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   40: return
      //   41: iconst_0
      //   42: istore_3
      //   43: goto -15 -> 28
      //   46: aload_0
      //   47: getfield 13	com/tencent/mm/app/j$a:esN	Lcom/tencent/mm/app/j;
      //   50: getfield 50	com/tencent/mm/app/j:esC	Ljava/util/HashSet;
      //   53: astore 4
      //   55: aload 4
      //   57: monitorenter
      //   58: iload_1
      //   59: lookupswitch	default:+41->100, 8:+53->112, 64:+145->204, 128:+124->183, 512:+145->204
      //   100: aload 4
      //   102: monitorexit
      //   103: ldc2_w 32
      //   106: ldc 34
      //   108: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   111: return
      //   112: ldc 52
      //   114: new 54	java/lang/StringBuilder
      //   117: dup
      //   118: ldc 56
      //   120: invokespecial 59	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   123: aload_2
      //   124: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   127: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   130: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   133: aload_0
      //   134: getfield 13	com/tencent/mm/app/j$a:esN	Lcom/tencent/mm/app/j;
      //   137: getfield 76	com/tencent/mm/app/j:esF	Landroid/os/ConditionVariable;
      //   140: invokevirtual 82	android/os/ConditionVariable:open	()V
      //   143: aload_0
      //   144: getfield 13	com/tencent/mm/app/j$a:esN	Lcom/tencent/mm/app/j;
      //   147: getfield 86	com/tencent/mm/app/j:esL	Lcom/tencent/mm/app/j$b;
      //   150: ifnonnull +33 -> 183
      //   153: aload_0
      //   154: getfield 13	com/tencent/mm/app/j$a:esN	Lcom/tencent/mm/app/j;
      //   157: new 88	com/tencent/mm/app/j$b
      //   160: dup
      //   161: aload_0
      //   162: getfield 13	com/tencent/mm/app/j$a:esN	Lcom/tencent/mm/app/j;
      //   165: invokespecial 91	com/tencent/mm/app/j$b:<init>	(Lcom/tencent/mm/app/j;)V
      //   168: putfield 86	com/tencent/mm/app/j:esL	Lcom/tencent/mm/app/j$b;
      //   171: aload_0
      //   172: getfield 13	com/tencent/mm/app/j$a:esN	Lcom/tencent/mm/app/j;
      //   175: getfield 86	com/tencent/mm/app/j:esL	Lcom/tencent/mm/app/j$b;
      //   178: ldc 93
      //   180: invokestatic 99	com/tencent/mm/sdk/f/e:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
      //   183: aload_0
      //   184: getfield 13	com/tencent/mm/app/j$a:esN	Lcom/tencent/mm/app/j;
      //   187: getfield 50	com/tencent/mm/app/j:esC	Ljava/util/HashSet;
      //   190: aload_2
      //   191: invokevirtual 105	java/util/HashSet:add	(Ljava/lang/Object;)Z
      //   194: pop
      //   195: goto -95 -> 100
      //   198: astore_2
      //   199: aload 4
      //   201: monitorexit
      //   202: aload_2
      //   203: athrow
      //   204: aload_0
      //   205: getfield 13	com/tencent/mm/app/j$a:esN	Lcom/tencent/mm/app/j;
      //   208: getfield 50	com/tencent/mm/app/j:esC	Ljava/util/HashSet;
      //   211: aload_2
      //   212: invokevirtual 108	java/util/HashSet:remove	(Ljava/lang/Object;)Z
      //   215: pop
      //   216: goto -116 -> 100
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	219	0	this	a
      //   0	219	1	paramInt	int
      //   0	219	2	paramString	String
      //   27	16	3	i	int
      //   53	147	4	localHashSet	HashSet
      // Exception table:
      //   from	to	target	type
      //   100	103	198	finally
      //   112	183	198	finally
      //   183	195	198	finally
      //   199	202	198	finally
      //   204	216	198	finally
    }
  }
  
  private final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(12997644779520L, 96840);
      GMTrace.o(12997644779520L, 96840);
    }
    
    private static ActivityManager.ProcessErrorStateInfo pi()
    {
      GMTrace.i(12997778997248L, 96841);
      Object localObject = ((ActivityManager)ab.getContext().getSystemService("activity")).getProcessesInErrorState();
      if (localObject == null)
      {
        GMTrace.o(12997778997248L, 96841);
        return null;
      }
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        ActivityManager.ProcessErrorStateInfo localProcessErrorStateInfo = (ActivityManager.ProcessErrorStateInfo)((Iterator)localObject).next();
        if ((localProcessErrorStateInfo.uid == Process.myUid()) && (localProcessErrorStateInfo.condition == 2))
        {
          GMTrace.o(12997778997248L, 96841);
          return localProcessErrorStateInfo;
        }
      }
      GMTrace.o(12997778997248L, 96841);
      return null;
    }
    
    public final void run()
    {
      GMTrace.i(12997913214976L, 96842);
      long l = System.currentTimeMillis();
      ??? = null;
      w.i("MicroMsg.MMCrashReporter", "ANR Parser started.");
      for (;;)
      {
        if (j.this.esF.block(10000L)) {
          j.this.esF.close();
        }
        try
        {
          Thread.sleep(500L);
          Object localObject2 = pi();
          ??? = localObject2;
          if (localObject2 == null) {
            continue;
          }
          ??? = localObject2;
          localObject2 = ???;
          if (??? == null)
          {
            ??? = pi();
            localObject2 = ???;
            if (??? == null)
            {
              w.w("MicroMsg.MMCrashReporter", "ANR process not found, exit thread.");
              j.this.esL = null;
              GMTrace.o(12997913214976L, 96842);
              return;
            }
          }
          w.i("MicroMsg.MMCrashReporter", "Got ANR process: " + ((ActivityManager.ProcessErrorStateInfo)localObject2).processName + " @ " + ((ActivityManager.ProcessErrorStateInfo)localObject2).pid);
          for (;;)
          {
            Object localObject4;
            synchronized (j.this.esC)
            {
              localObject4 = new ArrayList(j.this.esC.size());
              int i = j.this.esE.lastIndexOf('.');
              String str;
              if (i != -1)
              {
                str = ((ActivityManager.ProcessErrorStateInfo)localObject2).processName;
                str = j.this.esE.substring(0, i) + '_' + str + j.this.esE.substring(i);
                if (j.this.esC.remove(str)) {
                  ((ArrayList)localObject4).add(str);
                }
              }
              if (j.this.esC.remove(j.this.esE)) {
                ((ArrayList)localObject4).add(j.this.esE);
              }
              ((ArrayList)localObject4).addAll(j.this.esC);
              ??? = ((ArrayList)localObject4).iterator();
              if (((Iterator)???).hasNext())
              {
                localObject4 = (String)((Iterator)???).next();
                localObject4 = j.this.esD + '/' + (String)localObject4;
                str = j.a((String)localObject4, ((ActivityManager.ProcessErrorStateInfo)localObject2).pid, l, (ActivityManager.ProcessErrorStateInfo)localObject2);
                if (str != null)
                {
                  w.i("MicroMsg.MMCrashReporter", "Parse ANR trace '%s': OK.", new Object[] { localObject4 });
                  j.this.i(str, ((ActivityManager.ProcessErrorStateInfo)localObject2).pid);
                }
              }
              else
              {
                w.i("MicroMsg.MMCrashReporter", "ANR Parser ended.");
                j.this.esL = null;
                GMTrace.o(12997913214976L, 96842);
                return;
              }
            }
            w.i("MicroMsg.MMCrashReporter", "Parse ANR trace '%s': Not found.", new Object[] { localObject4 });
          }
        }
        catch (Exception localException)
        {
          for (;;) {}
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\app\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */