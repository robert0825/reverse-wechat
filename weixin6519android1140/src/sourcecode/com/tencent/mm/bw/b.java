package com.tencent.mm.bw;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Environment;
import android.os.Process;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class b
{
  public static final String vFc;
  
  static
  {
    GMTrace.i(13152129384448L, 97991);
    vFc = Environment.getExternalStorageDirectory() + "/tencent/MicroMsg/memory/";
    GMTrace.o(13152129384448L, 97991);
  }
  
  private static boolean E(File paramFile)
  {
    GMTrace.i(13151592513536L, 97987);
    if (paramFile.exists())
    {
      GMTrace.o(13151592513536L, 97987);
      return true;
    }
    if (!paramFile.mkdirs())
    {
      boolean bool = paramFile.exists();
      GMTrace.o(13151592513536L, 97987);
      return bool;
    }
    GMTrace.o(13151592513536L, 97987);
    return true;
  }
  
  private static boolean J(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13151055642624L, 97983);
    if (!bVC())
    {
      GMTrace.o(13151055642624L, 97983);
      return false;
    }
    Object localObject = new File(vFc);
    File[] arrayOfFile = ((File)localObject).listFiles();
    if (arrayOfFile.length == 0)
    {
      GMTrace.o(13151055642624L, 97983);
      return true;
    }
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
    long l1 = new Date().getTime();
    int j = arrayOfFile.length;
    boolean bool1 = true;
    int i = 0;
    File localFile;
    String str;
    if (i < j)
    {
      localFile = arrayOfFile[i];
      str = localFile.getName();
      int k = str.indexOf(".hprof");
      if (k > 0) {
        str = str.substring(0, k);
      }
      for (;;)
      {
        try
        {
          Date localDate = localSimpleDateFormat.parse(str);
          if (localDate != null) {
            continue;
          }
          localFile.delete();
          bool2 = bool1;
        }
        catch (ParseException localParseException)
        {
          w.e("MicroMsg.MemoryDumpManager", "hprofFileCheck parse date fail %s", new Object[] { str });
          localFile.delete();
          boolean bool2 = bool1;
          continue;
          long l2 = localParseException.getTime();
          if (l2 < l1) {
            continue;
          }
          localFile.delete();
          bool2 = bool1;
          continue;
          l2 = (l1 - l2) / 86400000L;
          if (l2 < 3L) {
            continue;
          }
          localFile.delete();
          bool2 = bool1;
          continue;
          bool2 = bool1;
          if (!paramBoolean1) {
            continue;
          }
          bool2 = bool1;
          if (l2 >= 1L) {
            continue;
          }
          bool2 = false;
          continue;
        }
        i += 1;
        bool1 = bool2;
        break;
        localFile.delete();
        bool2 = bool1;
      }
    }
    localObject = ((File)localObject).listFiles();
    if (localObject.length > 5)
    {
      if (paramBoolean2) {
        Toast.makeText(ab.getContext(), "dump fail, hprof file size exceed", 0).show();
      }
      w.w("MicroMsg.MemoryDumpManager", "hprofFileCheck hprofFileDir.length() too large " + localObject.length);
      GMTrace.o(13151055642624L, 97983);
      return false;
    }
    GMTrace.o(13151055642624L, 97983);
    return bool1;
  }
  
  public static String K(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13151189860352L, 97984);
    if (!J(paramBoolean1, paramBoolean2))
    {
      GMTrace.o(13151189860352L, 97984);
      return null;
    }
    long l = System.currentTimeMillis();
    String str = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(vFc).append(str).append(".hprof");
    localObject = ((StringBuffer)localObject).toString();
    if (!E(new File((String)localObject).getParentFile()))
    {
      w.i("MicroMsg.MemoryDumpManager", "failed to create dir for hprof file: %s", new Object[] { localObject });
      GMTrace.o(13151189860352L, 97984);
      return null;
    }
    try
    {
      bVD();
      Debug.dumpHprofData((String)localObject);
      if (paramBoolean2) {
        Toast.makeText(ab.getContext(), (String)localObject + " hprof file has saved ", 0).show();
      }
      w.i("MicroMsg.MemoryDumpManager", "dump file %s, use time %d", new Object[] { str, Long.valueOf(bg.aH(l)) });
      GMTrace.o(13151189860352L, 97984);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MemoryDumpManager", " dumpHprofFile Exception");
      GMTrace.o(13151189860352L, 97984);
    }
    return null;
  }
  
  public static String UZ(String paramString)
  {
    GMTrace.i(13151458295808L, 97986);
    if (!bVC())
    {
      GMTrace.o(13151458295808L, 97986);
      return null;
    }
    long l = System.currentTimeMillis();
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(vFc).append(paramString).append(".hprof");
    localObject = ((StringBuffer)localObject).toString();
    if (!E(new File((String)localObject).getParentFile()))
    {
      w.i("MicroMsg.MemoryDumpManager", "failed to create dir for hprof file: %s", new Object[] { localObject });
      GMTrace.o(13151458295808L, 97986);
      return null;
    }
    try
    {
      bVD();
      Debug.dumpHprofData((String)localObject);
      Toast.makeText(ab.getContext(), (String)localObject + " hprof file has saved ", 0).show();
      w.i("MicroMsg.MemoryDumpManager", "dump file %s, use time %d", new Object[] { paramString, Long.valueOf(bg.aH(l)) });
      paramString = new File((String)localObject);
      if (!paramString.exists())
      {
        w.e("MicroMsg.MemoryDumpManager", "Hprof dump file is not exist");
        GMTrace.o(13151458295808L, 97986);
        return null;
      }
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.MemoryDumpManager", " dumpHprofFile Exception");
      GMTrace.o(13151458295808L, 97986);
      return null;
    }
    paramString = p.a(paramString, true, null);
    if (paramString == null)
    {
      w.e("MicroMsg.MemoryDumpManager", "zip hprof file fail");
      GMTrace.o(13151458295808L, 97986);
      return null;
    }
    GMTrace.o(13151458295808L, 97986);
    return paramString;
  }
  
  private static boolean bVC()
  {
    GMTrace.i(13150921424896L, 97982);
    if (!c.ty())
    {
      w.i("MicroMsg.MemoryDumpManager", "Hprof sdcard is invalid");
      GMTrace.o(13150921424896L, 97982);
      return false;
    }
    File localFile = new File(vFc);
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    GMTrace.o(13150921424896L, 97982);
    return true;
  }
  
  public static void bVD()
  {
    GMTrace.i(13151726731264L, 97988);
    Runtime.getRuntime().gc();
    System.runFinalization();
    GMTrace.o(13151726731264L, 97988);
  }
  
  /* Error */
  public static void bVE()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: aconst_null
    //   8: astore_2
    //   9: ldc2_w 263
    //   12: ldc_w 265
    //   15: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   18: getstatic 271	android/os/Build$VERSION:SDK_INT	I
    //   21: bipush 14
    //   23: if_icmplt +16 -> 39
    //   26: invokestatic 274	com/tencent/mm/bw/b:bVF	()V
    //   29: ldc2_w 263
    //   32: ldc_w 265
    //   35: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   38: return
    //   39: new 19	java/lang/StringBuilder
    //   42: dup
    //   43: ldc_w 276
    //   46: invokespecial 146	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   49: invokestatic 282	android/os/Process:myPid	()I
    //   52: invokevirtual 149	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   55: invokevirtual 41	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore_0
    //   59: invokestatic 251	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   62: aload_0
    //   63: invokevirtual 286	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   66: astore 5
    //   68: new 288	java/io/InputStreamReader
    //   71: dup
    //   72: aload 5
    //   74: invokevirtual 294	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   77: invokespecial 297	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   80: astore_0
    //   81: aload_0
    //   82: astore_3
    //   83: new 299	java/io/LineNumberReader
    //   86: dup
    //   87: aload_0
    //   88: invokespecial 302	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
    //   91: astore_2
    //   92: aload_2
    //   93: invokevirtual 305	java/io/LineNumberReader:readLine	()Ljava/lang/String;
    //   96: astore_1
    //   97: aload_1
    //   98: ifnull +51 -> 149
    //   101: ldc 114
    //   103: aload_1
    //   104: invokestatic 242	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   107: goto -15 -> 92
    //   110: astore_1
    //   111: aload_0
    //   112: astore_1
    //   113: aload_2
    //   114: astore_0
    //   115: ldc 114
    //   117: ldc_w 307
    //   120: invokestatic 215	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: aload_0
    //   124: ifnull +7 -> 131
    //   127: aload_0
    //   128: invokevirtual 310	java/io/LineNumberReader:close	()V
    //   131: aload_1
    //   132: ifnull +7 -> 139
    //   135: aload_1
    //   136: invokevirtual 311	java/io/InputStreamReader:close	()V
    //   139: ldc2_w 263
    //   142: ldc_w 265
    //   145: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   148: return
    //   149: aload 5
    //   151: invokevirtual 314	java/lang/Process:waitFor	()I
    //   154: pop
    //   155: aload 5
    //   157: invokevirtual 317	java/lang/Process:destroy	()V
    //   160: aload_2
    //   161: invokevirtual 310	java/io/LineNumberReader:close	()V
    //   164: aload_0
    //   165: invokevirtual 311	java/io/InputStreamReader:close	()V
    //   168: ldc2_w 263
    //   171: ldc_w 265
    //   174: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   177: return
    //   178: astore_0
    //   179: ldc2_w 263
    //   182: ldc_w 265
    //   185: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   188: return
    //   189: astore_0
    //   190: ldc2_w 263
    //   193: ldc_w 265
    //   196: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   199: return
    //   200: astore_0
    //   201: aconst_null
    //   202: astore_0
    //   203: aload_1
    //   204: astore 4
    //   206: aload_0
    //   207: astore_3
    //   208: ldc 114
    //   210: ldc_w 319
    //   213: invokestatic 215	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   216: aload_1
    //   217: ifnull +7 -> 224
    //   220: aload_1
    //   221: invokevirtual 310	java/io/LineNumberReader:close	()V
    //   224: aload_0
    //   225: ifnull +7 -> 232
    //   228: aload_0
    //   229: invokevirtual 311	java/io/InputStreamReader:close	()V
    //   232: ldc2_w 263
    //   235: ldc_w 265
    //   238: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   241: return
    //   242: astore_0
    //   243: ldc2_w 263
    //   246: ldc_w 265
    //   249: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   252: return
    //   253: astore_1
    //   254: aconst_null
    //   255: astore_0
    //   256: aload_3
    //   257: astore_2
    //   258: aload_2
    //   259: ifnull +7 -> 266
    //   262: aload_2
    //   263: invokevirtual 310	java/io/LineNumberReader:close	()V
    //   266: aload_0
    //   267: ifnull +7 -> 274
    //   270: aload_0
    //   271: invokevirtual 311	java/io/InputStreamReader:close	()V
    //   274: aload_1
    //   275: athrow
    //   276: astore_0
    //   277: goto -3 -> 274
    //   280: astore_1
    //   281: aload 4
    //   283: astore_2
    //   284: aload_3
    //   285: astore_0
    //   286: goto -28 -> 258
    //   289: astore_1
    //   290: goto -32 -> 258
    //   293: astore_2
    //   294: aload_1
    //   295: astore_3
    //   296: aload_2
    //   297: astore_1
    //   298: aload_0
    //   299: astore_2
    //   300: aload_3
    //   301: astore_0
    //   302: goto -44 -> 258
    //   305: astore_2
    //   306: goto -103 -> 203
    //   309: astore_1
    //   310: aload_2
    //   311: astore_1
    //   312: goto -109 -> 203
    //   315: astore_0
    //   316: aconst_null
    //   317: astore_0
    //   318: aload_2
    //   319: astore_1
    //   320: goto -205 -> 115
    //   323: astore_1
    //   324: aconst_null
    //   325: astore_2
    //   326: aload_0
    //   327: astore_1
    //   328: aload_2
    //   329: astore_0
    //   330: goto -215 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   58	107	0	localObject1	Object
    //   178	1	0	localIOException1	java.io.IOException
    //   189	1	0	localIOException2	java.io.IOException
    //   200	1	0	localInterruptedException1	InterruptedException
    //   202	27	0	localObject2	Object
    //   242	1	0	localIOException3	java.io.IOException
    //   255	16	0	localObject3	Object
    //   276	1	0	localIOException4	java.io.IOException
    //   285	17	0	localObject4	Object
    //   315	1	0	localIOException5	java.io.IOException
    //   317	13	0	localObject5	Object
    //   1	103	1	str	String
    //   110	1	1	localIOException6	java.io.IOException
    //   112	109	1	localObject6	Object
    //   253	22	1	localObject7	Object
    //   280	1	1	localObject8	Object
    //   289	6	1	localObject9	Object
    //   297	1	1	localObject10	Object
    //   309	1	1	localInterruptedException2	InterruptedException
    //   311	9	1	localObject11	Object
    //   323	1	1	localIOException7	java.io.IOException
    //   327	1	1	localObject12	Object
    //   8	276	2	localObject13	Object
    //   293	4	2	localObject14	Object
    //   299	1	2	localObject15	Object
    //   305	14	2	localInterruptedException3	InterruptedException
    //   325	4	2	localObject16	Object
    //   3	298	3	localObject17	Object
    //   5	277	4	localObject18	Object
    //   66	90	5	localProcess	Process
    // Exception table:
    //   from	to	target	type
    //   92	97	110	java/io/IOException
    //   101	107	110	java/io/IOException
    //   149	160	110	java/io/IOException
    //   160	168	178	java/io/IOException
    //   127	131	189	java/io/IOException
    //   135	139	189	java/io/IOException
    //   59	81	200	java/lang/InterruptedException
    //   220	224	242	java/io/IOException
    //   228	232	242	java/io/IOException
    //   59	81	253	finally
    //   262	266	276	java/io/IOException
    //   270	274	276	java/io/IOException
    //   83	92	280	finally
    //   208	216	280	finally
    //   92	97	289	finally
    //   101	107	289	finally
    //   149	160	289	finally
    //   115	123	293	finally
    //   83	92	305	java/lang/InterruptedException
    //   92	97	309	java/lang/InterruptedException
    //   101	107	309	java/lang/InterruptedException
    //   149	160	309	java/lang/InterruptedException
    //   59	81	315	java/io/IOException
    //   83	92	323	java/io/IOException
  }
  
  public static void bVF()
  {
    GMTrace.i(13151995166720L, 97990);
    Object localObject1 = (ActivityManager)ab.getContext().getSystemService("activity");
    w.i("MicroMsg.MemoryDumpManager", " wechat heap info ");
    w.i("MicroMsg.MemoryDumpManager", " Runtime.totalMemory " + Runtime.getRuntime().totalMemory());
    w.i("MicroMsg.MemoryDumpManager", " Runtime.freeMemory " + Runtime.getRuntime().freeMemory());
    w.i("MicroMsg.MemoryDumpManager", " Runtime.maxMemory " + Runtime.getRuntime().maxMemory());
    w.i("MicroMsg.MemoryDumpManager", " Debug.nativeHeapSize " + Debug.getNativeHeapSize());
    w.i("MicroMsg.MemoryDumpManager", " Debug.nativeHeapAllocatedSize " + Debug.getNativeHeapAllocatedSize());
    localObject1 = ((ActivityManager)localObject1).getProcessMemoryInfo(new int[] { Process.myPid() });
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      Object localObject2 = localObject1[i];
      w.i("MicroMsg.MemoryDumpManager", " wechat memory info");
      w.i("MicroMsg.MemoryDumpManager", " pidMemoryInfo.getTotalPrivateDirty(): " + ((Debug.MemoryInfo)localObject2).getTotalPrivateDirty() + "\n");
      w.i("MicroMsg.MemoryDumpManager", " pidMemoryInfo.getTotalPss(): " + ((Debug.MemoryInfo)localObject2).getTotalPss() + "\n");
      w.i("MicroMsg.MemoryDumpManager", " pidMemoryInfo.getTotalSharedDirty(): " + ((Debug.MemoryInfo)localObject2).getTotalSharedDirty() + "\n");
      i += 1;
    }
    GMTrace.o(13151995166720L, 97990);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bw\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */