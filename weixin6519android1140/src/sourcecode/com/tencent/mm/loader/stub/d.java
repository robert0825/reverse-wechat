package com.tencent.mm.loader.stub;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class d
{
  public static String convertStreamToString(InputStream paramInputStream)
  {
    GMTrace.i(14008438489088L, 104371);
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      for (;;)
      {
        String str = localBufferedReader.readLine();
        if (str == null) {
          break;
        }
        localStringBuilder.append(str + "\n");
      }
      try
      {
        paramInputStream.close();
        throw ((Throwable)localObject);
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Util", paramInputStream, "", new Object[0]);
        }
      }
    }
    catch (IOException localIOException)
    {
      localIOException = localIOException;
      w.printErrStackTrace("MicroMsg.Util", localIOException, "", new Object[0]);
      try
      {
        paramInputStream.close();
        for (;;)
        {
          paramInputStream = localStringBuilder.toString();
          GMTrace.o(14008438489088L, 104371);
          return paramInputStream;
          try
          {
            paramInputStream.close();
          }
          catch (IOException paramInputStream)
          {
            w.printErrStackTrace("MicroMsg.Util", paramInputStream, "", new Object[0]);
          }
        }
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Util", paramInputStream, "", new Object[0]);
        }
      }
    }
    finally {}
  }
  
  /* Error */
  public static String r(android.content.Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 70
    //   3: ldc 72
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnull +7 -> 16
    //   12: iload_1
    //   13: ifgt +14 -> 27
    //   16: ldc2_w 70
    //   19: ldc 72
    //   21: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   24: ldc 50
    //   26: areturn
    //   27: aload_0
    //   28: ldc 74
    //   30: invokevirtual 80	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   33: checkcast 82	android/app/ActivityManager
    //   36: invokevirtual 86	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   39: invokeinterface 92 1 0
    //   44: astore_0
    //   45: aload_0
    //   46: invokeinterface 98 1 0
    //   51: ifeq +73 -> 124
    //   54: aload_0
    //   55: invokeinterface 102 1 0
    //   60: checkcast 104	android/app/ActivityManager$RunningAppProcessInfo
    //   63: astore 4
    //   65: aload 4
    //   67: getfield 108	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   70: iload_1
    //   71: if_icmpne -26 -> 45
    //   74: aload 4
    //   76: getfield 112	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   79: ifnull -34 -> 45
    //   82: aload 4
    //   84: getfield 112	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   87: ldc 50
    //   89: invokevirtual 118	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   92: ifne -47 -> 45
    //   95: aload 4
    //   97: getfield 112	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   100: astore_0
    //   101: ldc2_w 70
    //   104: ldc 72
    //   106: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   109: aload_0
    //   110: areturn
    //   111: astore_0
    //   112: ldc 48
    //   114: aload_0
    //   115: ldc 50
    //   117: iconst_0
    //   118: anewarray 4	java/lang/Object
    //   121: invokestatic 56	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: sipush 128
    //   127: newarray <illegal type>
    //   129: astore 5
    //   131: new 120	java/io/FileInputStream
    //   134: dup
    //   135: new 30	java/lang/StringBuilder
    //   138: dup
    //   139: ldc 122
    //   141: invokespecial 125	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   144: iload_1
    //   145: invokevirtual 128	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   148: ldc -126
    //   150: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: invokespecial 131	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   159: astore 4
    //   161: aload 4
    //   163: astore_0
    //   164: aload 4
    //   166: aload 5
    //   168: invokevirtual 135	java/io/FileInputStream:read	([B)I
    //   171: istore_3
    //   172: iload_3
    //   173: ifle +47 -> 220
    //   176: iconst_0
    //   177: istore_1
    //   178: goto +133 -> 311
    //   181: aload 4
    //   183: astore_0
    //   184: new 114	java/lang/String
    //   187: dup
    //   188: aload 5
    //   190: iconst_0
    //   191: iload_2
    //   192: invokespecial 138	java/lang/String:<init>	([BII)V
    //   195: astore 5
    //   197: aload 4
    //   199: invokevirtual 139	java/io/FileInputStream:close	()V
    //   202: ldc2_w 70
    //   205: ldc 72
    //   207: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   210: aload 5
    //   212: areturn
    //   213: iload_1
    //   214: iconst_1
    //   215: iadd
    //   216: istore_1
    //   217: goto +94 -> 311
    //   220: aload 4
    //   222: invokevirtual 139	java/io/FileInputStream:close	()V
    //   225: ldc2_w 70
    //   228: ldc 72
    //   230: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   233: ldc 50
    //   235: areturn
    //   236: astore 5
    //   238: aconst_null
    //   239: astore 4
    //   241: aload 4
    //   243: astore_0
    //   244: ldc 48
    //   246: aload 5
    //   248: ldc 50
    //   250: iconst_0
    //   251: anewarray 4	java/lang/Object
    //   254: invokestatic 56	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   257: aload 4
    //   259: ifnull -34 -> 225
    //   262: aload 4
    //   264: invokevirtual 139	java/io/FileInputStream:close	()V
    //   267: goto -42 -> 225
    //   270: astore_0
    //   271: goto -46 -> 225
    //   274: astore 4
    //   276: aconst_null
    //   277: astore_0
    //   278: aload_0
    //   279: ifnull +7 -> 286
    //   282: aload_0
    //   283: invokevirtual 139	java/io/FileInputStream:close	()V
    //   286: aload 4
    //   288: athrow
    //   289: astore_0
    //   290: goto -88 -> 202
    //   293: astore_0
    //   294: goto -69 -> 225
    //   297: astore_0
    //   298: goto -12 -> 286
    //   301: astore 4
    //   303: goto -25 -> 278
    //   306: astore 5
    //   308: goto -67 -> 241
    //   311: iload_3
    //   312: istore_2
    //   313: iload_1
    //   314: iload_3
    //   315: if_icmpge -134 -> 181
    //   318: aload 5
    //   320: iload_1
    //   321: baload
    //   322: sipush 128
    //   325: if_icmpgt +10 -> 335
    //   328: aload 5
    //   330: iload_1
    //   331: baload
    //   332: ifgt -119 -> 213
    //   335: iload_1
    //   336: istore_2
    //   337: goto -156 -> 181
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	340	0	paramContext	android.content.Context
    //   0	340	1	paramInt	int
    //   191	146	2	i	int
    //   171	145	3	j	int
    //   63	200	4	localObject1	Object
    //   274	13	4	localObject2	Object
    //   301	1	4	localObject3	Object
    //   129	82	5	localObject4	Object
    //   236	11	5	localException1	Exception
    //   306	23	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   27	45	111	java/lang/Exception
    //   45	101	111	java/lang/Exception
    //   131	161	236	java/lang/Exception
    //   262	267	270	java/lang/Exception
    //   131	161	274	finally
    //   197	202	289	java/lang/Exception
    //   220	225	293	java/lang/Exception
    //   282	286	297	java/lang/Exception
    //   164	172	301	finally
    //   184	197	301	finally
    //   244	257	301	finally
    //   164	172	306	java/lang/Exception
    //   184	197	306	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\loader\stub\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */