package com.tencent.mm.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.d;
import com.tencent.mm.sdk.platformtools.w;
import dalvik.system.PathClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public final class a
{
  private static boolean ezG;
  private static String ezH;
  private static String ezI;
  private static String ezJ;
  private static Set<a> ezK;
  public static final boolean mH;
  
  static
  {
    GMTrace.i(14010854408192L, 104389);
    ezG = false;
    mH = i(System.getProperty("java.vm.version"));
    GMTrace.o(14010854408192L, 104389);
  }
  
  private a()
  {
    GMTrace.i(20321369325568L, 151406);
    GMTrace.o(20321369325568L, 151406);
  }
  
  private static Field a(Object paramObject, String paramString)
  {
    GMTrace.i(15701058256896L, 116982);
    Class localClass = paramObject.getClass();
    while (localClass != null) {
      try
      {
        Field localField = localClass.getDeclaredField(paramString);
        if (!localField.isAccessible()) {
          localField.setAccessible(true);
        }
        GMTrace.o(15701058256896L, 116982);
        return localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        localClass = localClass.getSuperclass();
      }
    }
    throw new NoSuchFieldException("Field " + paramString + " not found in " + paramObject.getClass());
  }
  
  public static Method a(Object paramObject, String paramString, Class<?>... paramVarArgs)
  {
    GMTrace.i(15701192474624L, 116983);
    Class localClass = paramObject.getClass();
    while (localClass != null) {
      try
      {
        Method localMethod = localClass.getDeclaredMethod(paramString, paramVarArgs);
        if (!localMethod.isAccessible()) {
          localMethod.setAccessible(true);
        }
        GMTrace.o(15701192474624L, 116983);
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localClass = localClass.getSuperclass();
      }
    }
    throw new NoSuchMethodException("Method " + paramString + " with parameters " + Arrays.asList(paramVarArgs) + " not found in " + paramObject.getClass());
  }
  
  private static void a(Context paramContext, String paramString, List<File> paramList)
  {
    GMTrace.i(14009914884096L, 104382);
    paramContext = (PathClassLoader)paramContext.getClassLoader();
    w.i("MicroMsg.MultiDex", "before reflectPathClassLoader for debug: ClassLoader " + paramContext);
    Collections.sort(paramList, new Comparator() {});
    Object localObject1 = paramList.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (File)((Iterator)localObject1).next();
      w.i("MicroMsg.MultiDex", "real reflectPathClassLoader dexname: " + ((File)localObject2).getName());
    }
    paramString = new File(paramString);
    if (!paramList.isEmpty()) {
      if (Build.VERSION.SDK_INT >= 19)
      {
        localObject1 = a(paramContext, "pathList").get(paramContext);
        localObject2 = new ArrayList();
        a(localObject1, "dexElements", b.a(localObject1, new ArrayList(paramList), paramString, (ArrayList)localObject2));
        if (((ArrayList)localObject2).size() > 0)
        {
          paramString = ((ArrayList)localObject2).iterator();
          if (paramString.hasNext())
          {
            paramContext = (IOException)paramString.next();
            w.w("MicroMsg.MultiDex", "Exception in makeDexElement", new Object[] { paramContext });
            throw paramContext;
          }
        }
      }
      else
      {
        localObject1 = a(paramContext, "pathList").get(paramContext);
        paramList = new ArrayList(paramList);
        a(localObject1, "dexElements", (Object[])a(localObject1, "makeDexElements", new Class[] { ArrayList.class, File.class }).invoke(localObject1, new Object[] { paramList, paramString }));
      }
    }
    w.i("MicroMsg.MultiDex", "after reflectPathClassloader for debug: ClassLoader " + paramContext);
    GMTrace.o(14009914884096L, 104382);
  }
  
  private static void a(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    GMTrace.i(16090423885824L, 119883);
    paramString = a(paramObject, paramString);
    Object[] arrayOfObject1 = (Object[])paramString.get(paramObject);
    Object[] arrayOfObject2 = (Object[])Array.newInstance(arrayOfObject1.getClass().getComponentType(), arrayOfObject1.length + paramArrayOfObject.length);
    System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, arrayOfObject1.length);
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject2, arrayOfObject1.length, paramArrayOfObject.length);
    paramString.set(paramObject, arrayOfObject2);
    GMTrace.o(16090423885824L, 119883);
  }
  
  /* Error */
  private static boolean a(a parama)
  {
    // Byte code:
    //   0: ldc2_w 267
    //   3: ldc_w 269
    //   6: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 89	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 270	java/lang/StringBuilder:<init>	()V
    //   16: getstatic 272	com/tencent/mm/f/a:ezI	Ljava/lang/String;
    //   19: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: ldc_w 274
    //   25: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_0
    //   29: getfield 277	com/tencent/mm/f/a$a:ezL	Ljava/lang/String;
    //   32: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: astore 5
    //   40: new 180	java/io/File
    //   43: dup
    //   44: aload 5
    //   46: invokespecial 186	java/io/File:<init>	(Ljava/lang/String;)V
    //   49: astore 4
    //   51: aload 4
    //   53: invokevirtual 280	java/io/File:isFile	()Z
    //   56: ifeq +11 -> 67
    //   59: aload 4
    //   61: invokevirtual 283	java/io/File:exists	()Z
    //   64: ifne +31 -> 95
    //   67: ldc -107
    //   69: ldc_w 285
    //   72: iconst_1
    //   73: anewarray 4	java/lang/Object
    //   76: dup
    //   77: iconst_0
    //   78: aload 5
    //   80: aastore
    //   81: invokestatic 287	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: ldc2_w 267
    //   87: ldc_w 269
    //   90: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   93: iconst_0
    //   94: ireturn
    //   95: new 180	java/io/File
    //   98: dup
    //   99: getstatic 289	com/tencent/mm/f/a:ezJ	Ljava/lang/String;
    //   102: invokespecial 186	java/io/File:<init>	(Ljava/lang/String;)V
    //   105: astore 7
    //   107: invokestatic 293	java/lang/System:currentTimeMillis	()J
    //   110: lstore_1
    //   111: aload 7
    //   113: invokestatic 299	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:Y	(Ljava/io/File;)Lcom/tencent/tinker/loader/shareutil/ShareFileLockHelper;
    //   116: astore 4
    //   118: ldc -107
    //   120: ldc_w 301
    //   123: iconst_2
    //   124: anewarray 4	java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: invokestatic 293	java/lang/System:currentTimeMillis	()J
    //   132: lload_1
    //   133: lsub
    //   134: invokestatic 307	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   137: aastore
    //   138: dup
    //   139: iconst_1
    //   140: getstatic 289	com/tencent/mm/f/a:ezJ	Ljava/lang/String;
    //   143: aastore
    //   144: invokestatic 287	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: new 309	java/io/FileInputStream
    //   150: dup
    //   151: aload 5
    //   153: invokespecial 310	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   156: astore 6
    //   158: aload 6
    //   160: ldc_w 311
    //   163: invokestatic 316	com/tencent/mm/a/g:a	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   166: astore 5
    //   168: aload 5
    //   170: ifnull +62 -> 232
    //   173: aload 5
    //   175: aload_0
    //   176: getfield 319	com/tencent/mm/f/a$a:ezM	Ljava/lang/String;
    //   179: invokevirtual 324	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   182: istore_3
    //   183: iload_3
    //   184: ifeq +48 -> 232
    //   187: aload 4
    //   189: invokevirtual 327	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   192: aload 6
    //   194: invokestatic 330	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   197: ldc2_w 267
    //   200: ldc_w 269
    //   203: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   206: iconst_1
    //   207: ireturn
    //   208: astore_0
    //   209: ldc -107
    //   211: ldc_w 332
    //   214: iconst_1
    //   215: anewarray 4	java/lang/Object
    //   218: dup
    //   219: iconst_0
    //   220: aload 7
    //   222: invokevirtual 335	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   225: aastore
    //   226: invokestatic 338	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: goto -37 -> 192
    //   232: aload 4
    //   234: invokevirtual 327	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   237: aload 6
    //   239: invokestatic 330	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   242: ldc2_w 267
    //   245: ldc_w 269
    //   248: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   251: iconst_0
    //   252: ireturn
    //   253: astore_0
    //   254: ldc -107
    //   256: ldc_w 332
    //   259: iconst_1
    //   260: anewarray 4	java/lang/Object
    //   263: dup
    //   264: iconst_0
    //   265: aload 7
    //   267: invokevirtual 335	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   270: aastore
    //   271: invokestatic 338	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   274: goto -37 -> 237
    //   277: astore 5
    //   279: aconst_null
    //   280: astore 4
    //   282: aconst_null
    //   283: astore_0
    //   284: ldc -107
    //   286: aload 5
    //   288: ldc_w 340
    //   291: iconst_0
    //   292: anewarray 4	java/lang/Object
    //   295: invokestatic 344	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   298: ldc -107
    //   300: ldc_w 346
    //   303: iconst_1
    //   304: anewarray 4	java/lang/Object
    //   307: dup
    //   308: iconst_0
    //   309: aload 7
    //   311: invokevirtual 335	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   314: aastore
    //   315: invokestatic 338	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   318: aload 4
    //   320: ifnull +8 -> 328
    //   323: aload 4
    //   325: invokevirtual 327	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   328: aload_0
    //   329: invokestatic 330	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   332: goto -90 -> 242
    //   335: astore 4
    //   337: ldc -107
    //   339: ldc_w 332
    //   342: iconst_1
    //   343: anewarray 4	java/lang/Object
    //   346: dup
    //   347: iconst_0
    //   348: aload 7
    //   350: invokevirtual 335	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   353: aastore
    //   354: invokestatic 338	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   357: goto -29 -> 328
    //   360: astore 5
    //   362: aconst_null
    //   363: astore 4
    //   365: aconst_null
    //   366: astore_0
    //   367: aload 4
    //   369: ifnull +8 -> 377
    //   372: aload 4
    //   374: invokevirtual 327	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   377: aload_0
    //   378: invokestatic 330	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   381: aload 5
    //   383: athrow
    //   384: astore 4
    //   386: ldc -107
    //   388: ldc_w 332
    //   391: iconst_1
    //   392: anewarray 4	java/lang/Object
    //   395: dup
    //   396: iconst_0
    //   397: aload 7
    //   399: invokevirtual 335	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   402: aastore
    //   403: invokestatic 338	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   406: goto -29 -> 377
    //   409: astore 5
    //   411: aconst_null
    //   412: astore_0
    //   413: goto -46 -> 367
    //   416: astore 5
    //   418: aload 6
    //   420: astore_0
    //   421: goto -54 -> 367
    //   424: astore 5
    //   426: goto -59 -> 367
    //   429: astore 5
    //   431: aconst_null
    //   432: astore_0
    //   433: goto -149 -> 284
    //   436: astore 5
    //   438: aload 6
    //   440: astore_0
    //   441: goto -157 -> 284
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	444	0	parama	a
    //   110	23	1	l	long
    //   182	2	3	bool	boolean
    //   49	275	4	localObject1	Object
    //   335	1	4	localException1	Exception
    //   363	10	4	localObject2	Object
    //   384	1	4	localException2	Exception
    //   38	136	5	str	String
    //   277	10	5	localIOException1	IOException
    //   360	22	5	localObject3	Object
    //   409	1	5	localObject4	Object
    //   416	1	5	localObject5	Object
    //   424	1	5	localObject6	Object
    //   429	1	5	localIOException2	IOException
    //   436	1	5	localIOException3	IOException
    //   156	283	6	localFileInputStream	java.io.FileInputStream
    //   105	293	7	localFile	File
    // Exception table:
    //   from	to	target	type
    //   187	192	208	java/lang/Exception
    //   232	237	253	java/lang/Exception
    //   107	118	277	java/io/IOException
    //   323	328	335	java/lang/Exception
    //   107	118	360	finally
    //   372	377	384	java/lang/Exception
    //   118	158	409	finally
    //   158	168	416	finally
    //   173	183	416	finally
    //   284	318	424	finally
    //   118	158	429	java/io/IOException
    //   158	168	436	java/io/IOException
    //   173	183	436	java/io/IOException
  }
  
  /* Error */
  private static boolean a(ZipFile paramZipFile, a parama)
  {
    // Byte code:
    //   0: ldc2_w 348
    //   3: ldc_w 350
    //   6: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc -107
    //   11: ldc_w 352
    //   14: invokestatic 156	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: new 180	java/io/File
    //   20: dup
    //   21: getstatic 289	com/tencent/mm/f/a:ezJ	Ljava/lang/String;
    //   24: invokespecial 186	java/io/File:<init>	(Ljava/lang/String;)V
    //   27: astore 9
    //   29: new 89	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 270	java/lang/StringBuilder:<init>	()V
    //   36: getstatic 272	com/tencent/mm/f/a:ezI	Ljava/lang/String;
    //   39: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc_w 274
    //   45: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: aload_1
    //   49: getfield 277	com/tencent/mm/f/a$a:ezL	Ljava/lang/String;
    //   52: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 10
    //   60: aconst_null
    //   61: astore 8
    //   63: aconst_null
    //   64: astore 7
    //   66: aload 7
    //   68: astore 6
    //   70: aload 8
    //   72: astore 5
    //   74: invokestatic 293	java/lang/System:currentTimeMillis	()J
    //   77: lstore_3
    //   78: aload 7
    //   80: astore 6
    //   82: aload 8
    //   84: astore 5
    //   86: aload 9
    //   88: invokestatic 299	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:Y	(Ljava/io/File;)Lcom/tencent/tinker/loader/shareutil/ShareFileLockHelper;
    //   91: astore 7
    //   93: aload 7
    //   95: astore 6
    //   97: aload 7
    //   99: astore 5
    //   101: ldc -107
    //   103: ldc_w 354
    //   106: iconst_2
    //   107: anewarray 4	java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: invokestatic 293	java/lang/System:currentTimeMillis	()J
    //   115: lload_3
    //   116: lsub
    //   117: invokestatic 307	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   120: aastore
    //   121: dup
    //   122: iconst_1
    //   123: getstatic 289	com/tencent/mm/f/a:ezJ	Ljava/lang/String;
    //   126: aastore
    //   127: invokestatic 287	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload 7
    //   132: astore 6
    //   134: aload 7
    //   136: astore 5
    //   138: aload_0
    //   139: aload_0
    //   140: aload_1
    //   141: getfield 277	com/tencent/mm/f/a$a:ezL	Ljava/lang/String;
    //   144: invokevirtual 360	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   147: invokevirtual 364	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   150: astore_0
    //   151: aload 7
    //   153: astore 6
    //   155: aload 7
    //   157: astore 5
    //   159: new 366	java/io/FileOutputStream
    //   162: dup
    //   163: aload 10
    //   165: invokespecial 367	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   168: astore_1
    //   169: new 369	java/io/BufferedOutputStream
    //   172: dup
    //   173: aload_1
    //   174: invokespecial 372	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   177: astore_1
    //   178: sipush 16384
    //   181: newarray <illegal type>
    //   183: astore 5
    //   185: aload_0
    //   186: aload 5
    //   188: invokevirtual 378	java/io/InputStream:read	([B)I
    //   191: istore_2
    //   192: iload_2
    //   193: iconst_m1
    //   194: if_icmpeq +21 -> 215
    //   197: aload_1
    //   198: aload 5
    //   200: iconst_0
    //   201: iload_2
    //   202: invokevirtual 382	java/io/BufferedOutputStream:write	([BII)V
    //   205: aload_0
    //   206: aload 5
    //   208: invokevirtual 378	java/io/InputStream:read	([B)I
    //   211: istore_2
    //   212: goto -20 -> 192
    //   215: aload_1
    //   216: invokevirtual 383	java/io/BufferedOutputStream:close	()V
    //   219: aload 7
    //   221: astore 6
    //   223: aload 7
    //   225: astore 5
    //   227: aload_0
    //   228: invokestatic 330	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   231: aload 7
    //   233: astore 6
    //   235: aload 7
    //   237: astore 5
    //   239: ldc -107
    //   241: ldc_w 385
    //   244: iconst_1
    //   245: anewarray 4	java/lang/Object
    //   248: dup
    //   249: iconst_0
    //   250: getstatic 289	com/tencent/mm/f/a:ezJ	Ljava/lang/String;
    //   253: aastore
    //   254: invokestatic 287	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   257: aload 7
    //   259: invokevirtual 327	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   262: ldc2_w 348
    //   265: ldc_w 350
    //   268: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   271: iconst_1
    //   272: ireturn
    //   273: astore 5
    //   275: aload_1
    //   276: invokevirtual 383	java/io/BufferedOutputStream:close	()V
    //   279: aload 5
    //   281: athrow
    //   282: astore_1
    //   283: aload 7
    //   285: astore 6
    //   287: aload 7
    //   289: astore 5
    //   291: aload_0
    //   292: invokestatic 330	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   295: aload 7
    //   297: astore 6
    //   299: aload 7
    //   301: astore 5
    //   303: aload_1
    //   304: athrow
    //   305: astore_0
    //   306: aload 6
    //   308: astore 5
    //   310: ldc -107
    //   312: aload_0
    //   313: ldc_w 340
    //   316: iconst_0
    //   317: anewarray 4	java/lang/Object
    //   320: invokestatic 344	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   323: aload 6
    //   325: astore 5
    //   327: ldc -107
    //   329: ldc_w 387
    //   332: iconst_1
    //   333: anewarray 4	java/lang/Object
    //   336: dup
    //   337: iconst_0
    //   338: aload 9
    //   340: invokevirtual 335	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   343: aastore
    //   344: invokestatic 338	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   347: aload 6
    //   349: ifnull +8 -> 357
    //   352: aload 6
    //   354: invokevirtual 327	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   357: ldc2_w 348
    //   360: ldc_w 350
    //   363: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   366: iconst_0
    //   367: ireturn
    //   368: astore_0
    //   369: ldc -107
    //   371: aload_0
    //   372: ldc_w 340
    //   375: iconst_0
    //   376: anewarray 4	java/lang/Object
    //   379: invokestatic 344	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   382: goto -120 -> 262
    //   385: astore_0
    //   386: ldc -107
    //   388: aload_0
    //   389: ldc_w 340
    //   392: iconst_0
    //   393: anewarray 4	java/lang/Object
    //   396: invokestatic 344	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: goto -42 -> 357
    //   402: astore_0
    //   403: aload 5
    //   405: ifnull +8 -> 413
    //   408: aload 5
    //   410: invokevirtual 327	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   413: aload_0
    //   414: athrow
    //   415: astore_1
    //   416: ldc -107
    //   418: aload_1
    //   419: ldc_w 340
    //   422: iconst_0
    //   423: anewarray 4	java/lang/Object
    //   426: invokestatic 344	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   429: goto -16 -> 413
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	432	0	paramZipFile	ZipFile
    //   0	432	1	parama	a
    //   191	21	2	i	int
    //   77	39	3	l	long
    //   72	166	5	localObject1	Object
    //   273	7	5	localObject2	Object
    //   289	120	5	localShareFileLockHelper1	com.tencent.tinker.loader.shareutil.ShareFileLockHelper
    //   68	285	6	localShareFileLockHelper2	com.tencent.tinker.loader.shareutil.ShareFileLockHelper
    //   64	236	7	localShareFileLockHelper3	com.tencent.tinker.loader.shareutil.ShareFileLockHelper
    //   61	22	8	localObject3	Object
    //   27	312	9	localFile	File
    //   58	106	10	str	String
    // Exception table:
    //   from	to	target	type
    //   178	192	273	finally
    //   197	212	273	finally
    //   169	178	282	finally
    //   215	219	282	finally
    //   275	282	282	finally
    //   74	78	305	java/io/IOException
    //   86	93	305	java/io/IOException
    //   101	130	305	java/io/IOException
    //   138	151	305	java/io/IOException
    //   159	169	305	java/io/IOException
    //   227	231	305	java/io/IOException
    //   239	257	305	java/io/IOException
    //   291	295	305	java/io/IOException
    //   303	305	305	java/io/IOException
    //   257	262	368	java/lang/Exception
    //   352	357	385	java/lang/Exception
    //   74	78	402	finally
    //   86	93	402	finally
    //   101	130	402	finally
    //   138	151	402	finally
    //   159	169	402	finally
    //   227	231	402	finally
    //   239	257	402	finally
    //   291	295	402	finally
    //   303	305	402	finally
    //   310	323	402	finally
    //   327	347	402	finally
    //   408	413	415	java/lang/Exception
  }
  
  /* Error */
  public static void ar(Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 390
    //   3: ldc_w 392
    //   6: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 394	android/os/StatFs
    //   12: dup
    //   13: invokestatic 400	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   16: invokevirtual 403	java/io/File:getPath	()Ljava/lang/String;
    //   19: invokespecial 404	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   22: astore 8
    //   24: aload 8
    //   26: invokevirtual 407	android/os/StatFs:getAvailableBlocks	()I
    //   29: i2l
    //   30: lstore_2
    //   31: aload 8
    //   33: invokevirtual 410	android/os/StatFs:getBlockSize	()I
    //   36: istore_1
    //   37: lload_2
    //   38: iload_1
    //   39: i2l
    //   40: lmul
    //   41: lstore_2
    //   42: aload 8
    //   44: invokevirtual 413	android/os/StatFs:getBlockCount	()I
    //   47: i2l
    //   48: lstore 4
    //   50: aload 8
    //   52: invokevirtual 410	android/os/StatFs:getBlockSize	()I
    //   55: istore_1
    //   56: iload_1
    //   57: i2l
    //   58: lload 4
    //   60: lmul
    //   61: lstore 6
    //   63: lload_2
    //   64: lstore 4
    //   66: lload 6
    //   68: lstore_2
    //   69: ldc -107
    //   71: ldc_w 415
    //   74: iconst_2
    //   75: anewarray 4	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: lload 4
    //   82: invokestatic 307	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   85: aastore
    //   86: dup
    //   87: iconst_1
    //   88: lload_2
    //   89: invokestatic 307	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   92: aastore
    //   93: invokestatic 287	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   96: lload_2
    //   97: lconst_0
    //   98: lcmp
    //   99: ifeq +117 -> 216
    //   102: lload 4
    //   104: ldc2_w 416
    //   107: lcmp
    //   108: ifge +108 -> 216
    //   111: aload_0
    //   112: invokestatic 422	android/os/Process:myPid	()I
    //   115: invokestatic 428	com/tencent/mm/loader/stub/d:r	(Landroid/content/Context;I)Ljava/lang/String;
    //   118: astore 8
    //   120: ldc -107
    //   122: ldc_w 430
    //   125: iconst_3
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload 8
    //   133: aastore
    //   134: dup
    //   135: iconst_1
    //   136: lload 4
    //   138: invokestatic 307	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   141: aastore
    //   142: dup
    //   143: iconst_2
    //   144: ldc2_w 416
    //   147: invokestatic 307	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   150: aastore
    //   151: invokestatic 287	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: aload 8
    //   156: ldc_w 340
    //   159: invokevirtual 434	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   162: ifne +54 -> 216
    //   165: aload 8
    //   167: ldc_w 436
    //   170: invokevirtual 439	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   173: ifne +43 -> 216
    //   176: new 441	android/content/Intent
    //   179: dup
    //   180: invokespecial 442	android/content/Intent:<init>	()V
    //   183: astore 8
    //   185: aload 8
    //   187: aload_0
    //   188: ldc_w 444
    //   191: invokevirtual 448	android/content/Intent:setClassName	(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    //   194: pop
    //   195: aload 8
    //   197: ldc_w 449
    //   200: invokevirtual 453	android/content/Intent:setFlags	(I)Landroid/content/Intent;
    //   203: pop
    //   204: aload_0
    //   205: aload 8
    //   207: invokevirtual 457	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   210: invokestatic 422	android/os/Process:myPid	()I
    //   213: invokestatic 461	android/os/Process:killProcess	(I)V
    //   216: ldc2_w 390
    //   219: ldc_w 392
    //   222: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   225: return
    //   226: astore 8
    //   228: lconst_0
    //   229: lstore_2
    //   230: ldc -107
    //   232: ldc_w 463
    //   235: invokestatic 465	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   238: lload_2
    //   239: lstore 4
    //   241: lconst_0
    //   242: lstore_2
    //   243: goto -174 -> 69
    //   246: astore 8
    //   248: goto -18 -> 230
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	paramContext	Context
    //   36	21	1	i	int
    //   30	213	2	l1	long
    //   48	192	4	l2	long
    //   61	6	6	l3	long
    //   22	184	8	localObject	Object
    //   226	1	8	localException1	Exception
    //   246	1	8	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   9	37	226	java/lang/Exception
    //   42	56	246	java/lang/Exception
  }
  
  public static boolean as(Context paramContext)
  {
    GMTrace.i(19118241611776L, 142442);
    if (mH)
    {
      w.i("MultiDex", "if need dexopt: VM has multidex support, MultiDex support library is disabled.");
      GMTrace.o(19118241611776L, 142442);
      return false;
    }
    if (ezG)
    {
      w.i("MultiDex", "if need dexopt: has inited.");
      GMTrace.o(19118241611776L, 142442);
      return false;
    }
    long l = System.currentTimeMillis();
    au(paramContext);
    if ((ezK == null) || (ezK.size() <= 0))
    {
      GMTrace.o(19118241611776L, 142442);
      return true;
    }
    ezH = paramContext.getDir("cache", 0).getAbsolutePath();
    ezI = paramContext.getDir("dex", 0).getAbsolutePath();
    ezJ = paramContext.getDir("cache", 0).getParentFile().getAbsolutePath() + "/dex.lock";
    Object localObject = new File(ezI);
    if (((!((File)localObject).exists()) || (!((File)localObject).isDirectory())) && (!((File)localObject).mkdirs()))
    {
      w.f("MicroMsg.MultiDex", "if need dexopt: extractZipEntryToFile: create target dex directory failed");
      GMTrace.o(19118241611776L, 142442);
      return true;
    }
    int k = ezK.size();
    File localFile = new File(ezH);
    if (((!localFile.exists()) || (!localFile.isDirectory())) && (!localFile.mkdirs()))
    {
      w.f("MicroMsg.MultiDex", "if need dexopt: extractZipEntryToFile: create target dexopt directory failed");
      GMTrace.o(19118241611776L, 142442);
      return true;
    }
    w.i("MicroMsg.MultiDex", "if need dexopt: install Build.VERSION: %d, tryLoadDexFileCount: %d, installDir: %d, optDir: %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(k), Integer.valueOf(((File)localObject).list().length), Integer.valueOf(localFile.list().length) });
    if ((((File)localObject).list() == null) || (((File)localObject).list().length < k) || (localFile.list() == null) || (localFile.list().length < k))
    {
      int i;
      if (((File)localObject).list() == null)
      {
        i = -1;
        if (localFile.list() != null) {
          break label451;
        }
      }
      label451:
      for (int j = -1;; j = localFile.list().length)
      {
        w.i("MicroMsg.MultiDex", "if need dexopt: dex file count not equal, install path: %s vs %s, opt path: %s vs %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(k) });
        GMTrace.o(19118241611776L, 142442);
        return true;
        i = ((File)localObject).list().length;
        break;
      }
    }
    if (paramContext.getApplicationInfo() == null)
    {
      GMTrace.o(19118241611776L, 142442);
      return false;
    }
    paramContext = ezK.iterator();
    for (;;)
    {
      if (!paramContext.hasNext()) {
        break label630;
      }
      localObject = (a)paramContext.next();
      try
      {
        w.i("MicroMsg.MultiDex", "if need dexopt: prepare dex to load, file: %s, md5: %s, loadClass: %s", new Object[] { ((a)localObject).ezL, ((a)localObject).ezM, ((a)localObject).ezN });
        if (a((a)localObject)) {
          w.i("MicroMsg.MultiDex", "if need dexopt: verify dex for check md5: targetFilePath: [%s] time: %d", new Object[] { ((a)localObject).ezL, Long.valueOf(System.currentTimeMillis() - l) });
        }
      }
      finally {}
    }
    w.e("MicroMsg.MultiDex", "if need dexopt: targetDexFile md5 mismatch or not exists: %s", new Object[] { ((a)localObject).ezL });
    GMTrace.o(19118241611776L, 142442);
    return true;
    label630:
    GMTrace.o(19118241611776L, 142442);
    return false;
  }
  
  public static boolean at(Context paramContext)
  {
    boolean bool;
    try
    {
      GMTrace.i(19118375829504L, 142443);
      w.i("MicroMsg.MultiDex", "install multidex hasinit: %b, force: %b", new Object[] { Boolean.valueOf(ezG), Boolean.valueOf(true) });
      if (mH)
      {
        w.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
        bool = true;
        GMTrace.o(19118375829504L, 142443);
      }
      for (;;)
      {
        return bool;
        if (!ezG) {
          break;
        }
        bool = true;
        GMTrace.o(19118375829504L, 142443);
      }
      if (paramContext.getClassLoader() == null) {
        break label177;
      }
    }
    finally {}
    w.i("MicroMsg.MultiDex", "classloader: " + paramContext.getClassLoader().toString());
    long l;
    for (;;)
    {
      l = System.currentTimeMillis();
      au(paramContext);
      if ((ezK != null) && (ezK.size() > 0)) {
        break label188;
      }
      bool = false;
      GMTrace.o(19118375829504L, 142443);
      break;
      label177:
      w.e("MicroMsg.MultiDex", "classloader is null");
    }
    for (;;)
    {
      label188:
      ApplicationInfo localApplicationInfo;
      File localFile;
      ArrayList localArrayList;
      int j;
      int k;
      Object localObject3;
      try
      {
        localApplicationInfo = paramContext.getApplicationInfo();
        if (localApplicationInfo == null)
        {
          bool = false;
          GMTrace.o(19118375829504L, 142443);
          break;
        }
        ezH = paramContext.getDir("cache", 0).getAbsolutePath();
        ezI = paramContext.getDir("dex", 0).getAbsolutePath();
        ezJ = paramContext.getDir("cache", 0).getParentFile().getAbsolutePath() + "/dex.lock";
        Object localObject1 = new File(ezI);
        if (((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory())) && (!((File)localObject1).mkdirs()))
        {
          w.f("MicroMsg.MultiDex", "extractZipEntryToFile: create target dex directory failed");
          bool = false;
          GMTrace.o(19118375829504L, 142443);
          break;
        }
        i = ezK.size();
        localFile = new File(ezH);
        if (((!localFile.exists()) || (!localFile.isDirectory())) && (!localFile.mkdirs()))
        {
          w.f("MicroMsg.MultiDex", "extractZipEntryToFile: create target dexopt directory failed");
          bool = false;
          GMTrace.o(19118375829504L, 142443);
          break;
        }
        w.i("MicroMsg.MultiDex", "install Build.VERSION: %d, tryLoadDexFileCount: %d, installDir: %d, optDir: %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(i), Integer.valueOf(((File)localObject1).list().length), Integer.valueOf(localFile.list().length) });
        localArrayList = new ArrayList(ezK.size());
        i = 0;
        j = 0;
        k = i;
        if (j >= 5) {
          break label888;
        }
        k = i;
        if (i != 0) {
          break label888;
        }
        localArrayList.clear();
        localObject1 = ezK.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label868;
        }
        localObject3 = (a)((Iterator)localObject1).next();
        w.i("MicroMsg.MultiDex", "prepare dex to load, file: %s, md5: %s, loadClass: %s", new Object[] { ((a)localObject3).ezL, ((a)localObject3).ezM, ((a)localObject3).ezN });
        if (!a((a)localObject3)) {
          break label784;
        }
        w.i("MicroMsg.MultiDex", "verify dex for check md5: targetFilePath: [%s] time: %d", new Object[] { ((a)localObject3).ezL, Long.valueOf(System.currentTimeMillis() - l) });
        if (b(paramContext, ((a)localObject3).ezN, false))
        {
          w.i("MicroMsg.MultiDex", "dex has been loaded, skip. targetFilePath: [%s]", new Object[] { ((a)localObject3).ezL });
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        w.e("MicroMsg.MultiDex", "Multidex installation failure", new Object[] { localThrowable });
        w.printErrStackTrace("MicroMsg.MultiDex", localThrowable, "Multidex installation failure", new Object[0]);
        ar(paramContext);
        throw new RuntimeException("Multi dex installation failed (" + localThrowable.getMessage() + ").", localThrowable);
      }
      tmp725_722[0] = ((a)localObject3).ezL;
      w.w("MicroMsg.MultiDex", "dex [%s] is not load, it should be reload in further steps.", tmp725_722);
      for (;;)
      {
        localArrayList.add(new File(ezI + "/" + ((a)localObject3).ezL));
        break;
        label784:
        w.e("MicroMsg.MultiDex", "targetDexFile md5 mismatch or not exists: %s, force: %b", new Object[] { ((a)localObject3).ezL, Boolean.valueOf(true) });
        ZipFile localZipFile = new ZipFile(localApplicationInfo.sourceDir);
        bool = a(localZipFile, (a)localObject3);
        try
        {
          localZipFile.close();
          if (!bool) {
            throw new Exception("overwriteLocalSecondaryDexFromApk fail");
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.w("MicroMsg.MultiDex", "base apk file close quietly failed");
          }
        }
      }
      label868:
      if (localArrayList.isEmpty())
      {
        w.i("MicroMsg.MultiDex", "Nothing needs to be installed.");
        k = 1;
        label888:
        if (k == 0) {
          throw new RuntimeException("Some dex is not installed successfully after 5 times retry !!");
        }
      }
      else
      {
        a(paramContext, ezH, localArrayList);
        Object localObject2 = ezK.iterator();
        do
        {
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          localObject3 = (a)((Iterator)localObject2).next();
        } while (b(paramContext, ((a)localObject3).ezN, true));
        w.w("MicroMsg.MultiDex", "Failed to load dex [%s] in %d round, retry.", new Object[] { ((a)localObject3).ezL, Integer.valueOf(j + 1) });
        localObject3 = new File(ezI + "/" + ((a)localObject3).ezL).getName();
        localObject2 = localObject3;
        if (!((String)localObject3).endsWith(".dex"))
        {
          i = ((String)localObject3).lastIndexOf(".");
          if (i >= 0) {
            break label1163;
          }
        }
        for (localObject2 = (String)localObject3 + ".dex";; localObject2 = ((StringBuilder)localObject2).toString())
        {
          localObject2 = new File(localFile, (String)localObject2);
          if (!((File)localObject2).exists()) {
            break;
          }
          w.w("MicroMsg.MultiDex", "Remove perhaps broken odex file: " + ((File)localObject2).getAbsolutePath());
          if (((File)localObject2).delete()) {
            break;
          }
          w.w("MicroMsg.MultiDex", "Failed to remove perhaps broken odex file: " + ((File)localObject2).getAbsolutePath());
          break;
          label1163:
          localObject2 = new StringBuilder(i + 4);
          ((StringBuilder)localObject2).append((CharSequence)localObject3, 0, i);
          ((StringBuilder)localObject2).append(".dex");
        }
      }
      ezG = true;
      w.i("MicroMsg.MultiDex", "install done");
      bool = true;
      GMTrace.o(19118375829504L, 142443);
      break;
      int i = 1;
      break label1238;
      i = 0;
      label1238:
      j += 1;
    }
  }
  
  private static int au(Context paramContext)
  {
    GMTrace.i(14010183319552L, 104384);
    if (ezK != null)
    {
      w.w("MicroMsg.MultiDex", "preloaded dex files not empty, skipped preloading");
      GMTrace.o(14010183319552L, 104384);
      return 1;
    }
    try
    {
      paramContext = d.convertStreamToString(paramContext.getAssets().open("secondary-program-dex-jars/metadata.txt"));
      if (paramContext == null) {
        break label259;
      }
      if (paramContext.length() > 0) {
        break label77;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        HashSet localHashSet;
        String[] arrayOfString;
        int j;
        int i;
        w.e("MicroMsg.MultiDex", "load preload libraries failed");
        w.printErrStackTrace("MicroMsg.MultiDex", paramContext, "", new Object[0]);
        continue;
        paramContext = null;
      }
    }
    ezK = paramContext;
    GMTrace.o(14010183319552L, 104384);
    return 0;
    label77:
    localHashSet = new HashSet();
    arrayOfString = paramContext.split("\n");
    j = arrayOfString.length;
    i = 0;
    for (;;)
    {
      paramContext = localHashSet;
      if (i >= j) {
        break;
      }
      paramContext = arrayOfString[i];
      if ((paramContext != null) && (paramContext.length() > 0))
      {
        Object localObject = paramContext.split(" ", 3);
        if ((localObject != null) && (localObject.length >= 3))
        {
          paramContext = localObject[0].trim();
          String str = localObject[1].trim();
          localObject = localObject[2].trim();
          w.i("MicroMsg.MultiDex", "try parse dexname: %s, dexmd5:%s, classname:%s", new Object[] { paramContext, str, localObject });
          if ((paramContext != null) && (paramContext.length() > 0)) {
            localHashSet.add(new a(paramContext, str, (String)localObject));
          }
        }
      }
      i += 1;
    }
  }
  
  private static void b(Closeable paramCloseable)
  {
    GMTrace.i(14010049101824L, 104383);
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      GMTrace.o(14010049101824L, 104383);
      return;
    }
    catch (IOException paramCloseable)
    {
      w.w("MicroMsg.MultiDex", "Failed to close resource", new Object[] { paramCloseable });
      GMTrace.o(14010049101824L, 104383);
    }
  }
  
  private static boolean b(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(16431739568128L, 122426);
    try
    {
      paramContext = Class.forName(paramString, false, paramContext.getClassLoader());
      if (paramContext != null)
      {
        GMTrace.o(16431739568128L, 122426);
        return true;
      }
    }
    catch (ClassNotFoundException paramContext)
    {
      if (paramBoolean) {
        w.printErrStackTrace("MicroMsg.MultiDex", paramContext, "Failed to load a dex.", new Object[0]);
      }
      if (paramBoolean) {
        w.w("MicroMsg.MultiDex", "checkDexLoaded fail.... " + paramString);
      }
      GMTrace.o(16431739568128L, 122426);
    }
    return false;
  }
  
  private static boolean i(String paramString)
  {
    bool2 = false;
    GMTrace.i(14009646448640L, 104380);
    bool1 = bool2;
    if (paramString != null)
    {
      localObject = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      bool1 = bool2;
      if (!((Matcher)localObject).matches()) {}
    }
    try
    {
      int i = Integer.parseInt(((Matcher)localObject).group(1));
      int j = Integer.parseInt(((Matcher)localObject).group(2));
      if (i <= 2)
      {
        bool1 = bool2;
        if (i == 2)
        {
          bool1 = bool2;
          if (j <= 0) {}
        }
      }
      else
      {
        bool1 = true;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        bool1 = bool2;
      }
    }
    Object localObject = new StringBuilder("VM with version ").append(paramString);
    if (bool1) {}
    for (paramString = " has multidex support";; paramString = " does not have multidex support")
    {
      w.i("MicroMsg.MultiDex", paramString);
      GMTrace.o(14009646448640L, 104380);
      return bool1;
    }
  }
  
  private static final class a
  {
    String ezL;
    String ezM;
    String ezN;
    
    public a(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(14009243795456L, 104377);
      this.ezL = paramString1;
      this.ezM = paramString2;
      this.ezN = paramString3;
      GMTrace.o(14009243795456L, 104377);
    }
  }
  
  private static final class b
  {
    static Object[] a(Object paramObject, ArrayList<File> paramArrayList, File paramFile, ArrayList<IOException> paramArrayList1)
    {
      GMTrace.i(14009109577728L, 104376);
      try
      {
        Method localMethod1 = a.a(paramObject, "makeDexElements", new Class[] { ArrayList.class, File.class, ArrayList.class });
        paramObject = (Object[])localMethod1.invoke(paramObject, new Object[] { paramArrayList, paramFile, paramArrayList1 });
        GMTrace.o(14009109577728L, 104376);
        return (Object[])paramObject;
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        for (;;)
        {
          w.e("MicroMsg.MultiDex", "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure");
          try
          {
            Method localMethod2 = a.a(paramObject, "makeDexElements", new Class[] { List.class, File.class, List.class });
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            w.e("MicroMsg.MultiDex", "NoSuchMethodException: makeDexElements(List,File,List) failure");
            try
            {
              Method localMethod3 = a.a(paramObject, "makePathElements", new Class[] { List.class, File.class, List.class });
            }
            catch (NoSuchMethodException paramObject)
            {
              w.e("MicroMsg.MultiDex", "NoSuchMethodException: makePathElements(List,File,List) failure");
              throw ((Throwable)paramObject);
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */