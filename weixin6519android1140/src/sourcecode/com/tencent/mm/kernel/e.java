package com.tencent.mm.kernel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.HandlerThread;
import android.os.StatFs;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.bu.g;
import com.tencent.mm.bu.g.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.bz.a.a;
import com.tencent.mm.compatible.d.k;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.loader.stub.BaseBuildInfo;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.ag;
import com.tencent.mm.y.bz;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class e
{
  private static HashMap<Integer, g.d> fIv;
  public String cachePath;
  public final s fYL;
  b fYM;
  c fYN;
  public a fYO;
  public e fYP;
  e fYQ;
  public List<com.tencent.mm.kernel.api.a> fYR;
  public List<ag> fYS;
  public String fYT;
  public String fYU;
  public g fYV;
  public g fYW;
  public t fYX;
  ba fYY;
  bz fYZ;
  ConcurrentHashMap<String, SharedPreferences> fZa;
  private long fZb;
  private ae fZc;
  private volatile Boolean fZd;
  private d fZe;
  private long fZf;
  
  static
  {
    GMTrace.i(13505793097728L, 100626);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("CONFIG_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(13502571872256L, 100602);
        String[] arrayOfString = t.fTX;
        GMTrace.o(13502571872256L, 100602);
        return arrayOfString;
      }
    });
    GMTrace.o(13505793097728L, 100626);
  }
  
  public e(List<com.tencent.mm.kernel.api.a> paramList, a parama, List<ag> paramList1, b paramb, c paramc)
  {
    GMTrace.i(18788468654080L, 139985);
    this.fYP = new e();
    this.fYQ = new e();
    this.fYV = null;
    this.fYW = null;
    this.fZa = new ConcurrentHashMap();
    this.fZb = 0L;
    this.fZc = null;
    this.fZd = null;
    this.fZe = new d();
    this.fZf = 0L;
    this.fYL = xa();
    a.fXX.a(this.fYL);
    String str1 = com.tencent.mm.storage.w.ghv + "alphahold.ini";
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "initialize dkalpha client:%x  isapha:%b %s", new Object[] { Integer.valueOf(d.tJC), Boolean.valueOf(d.tJF), str1 });
    String str2;
    int i;
    if ((d.tJF) || (d.tJG))
    {
      str2 = com.tencent.mm.sdk.e.a.getValue(str1, "noneedhold");
      i = d.tJC;
    }
    try
    {
      int j = Integer.decode(BaseBuildInfo.CLIENT_VERSION).intValue();
      i = j;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
    if (!String.valueOf(i).equals(str2))
    {
      com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreStorage", "dkalpha version need  reset to DefaultAccount , hold it! client:%x  isapha:%b", new Object[] { Integer.valueOf(i), Boolean.valueOf(d.tJF) });
      a.wA();
      com.tencent.mm.sdk.e.a.ah(str1, "noneedhold", String.valueOf(i));
    }
    for (;;)
    {
      this.fYT = xg();
      this.fYO = parama;
      this.fYR = paramList;
      this.fYS = paramList1;
      this.fYM = paramb;
      this.fYN = paramc;
      GMTrace.o(18788468654080L, 139985);
      return;
      com.tencent.mm.loader.stub.b.deleteFile(str1);
    }
  }
  
  private static final boolean bd(String paramString)
  {
    GMTrace.i(13504182484992L, 100614);
    if (bg.nm(paramString))
    {
      com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "forceMkdirs absolutePath isNullOrNil ret false");
      GMTrace.o(13504182484992L, 100614);
      return false;
    }
    Object localObject = new File(paramString);
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "forceMkdirs absolutePath[%s], f.exists[%b], f.isDirectory[%b]", new Object[] { paramString, Boolean.valueOf(((File)localObject).exists()), Boolean.valueOf(((File)localObject).isDirectory()) });
    if ((((File)localObject).exists()) && (((File)localObject).isDirectory()))
    {
      com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "forceMkdirs f is dir and exist ret true");
      GMTrace.o(13504182484992L, 100614);
      return true;
    }
    String[] arrayOfString = paramString.split("/");
    if ((arrayOfString == null) || (arrayOfString.length < 2))
    {
      com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "forceMkdirs absolutePath arr len illegal ret false");
      GMTrace.o(13504182484992L, 100614);
      return false;
    }
    localObject = "/";
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "forceMkdirs absolutePath arr len: " + arrayOfString.length);
    int i = 0;
    while (i < arrayOfString.length)
    {
      paramString = (String)localObject;
      if (!bg.nm(arrayOfString[i]))
      {
        localObject = (String)localObject + "/" + arrayOfString[i];
        File localFile = new File((String)localObject);
        if ((localFile.isFile()) && (!localFile.renameTo(new File((String)localObject + "_mmbak"))))
        {
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "forceMkdirs renameTo false ret false file[%s]", new Object[] { localFile.getName() });
          GMTrace.o(13504182484992L, 100614);
          return false;
        }
        paramString = (String)localObject;
        if (!localFile.exists())
        {
          paramString = (String)localObject;
          if (!localFile.mkdir())
          {
            com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "forceMkdirs mkdir false ret false file[%s]", new Object[] { localFile.getName() });
            GMTrace.o(13504182484992L, 100614);
            return false;
          }
        }
      }
      i += 1;
      localObject = paramString;
    }
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "forceMkdirs false ret true");
    GMTrace.o(13504182484992L, 100614);
    return true;
  }
  
  private static s xa()
  {
    GMTrace.i(13503242960896L, 100607);
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "initialize packageInfo:%s version:%x", new Object[] { com.tencent.mm.sdk.platformtools.e.aiJ(), Integer.valueOf(d.tJC) });
    Object localObject1 = new File(com.tencent.mm.storage.w.ghv);
    if (!((File)localObject1).exists()) {
      ((File)localObject1).mkdirs();
    }
    localObject1 = new s(com.tencent.mm.storage.w.ghv + "systemInfo.cfg");
    Object localObject2 = (String)((s)localObject1).get(258);
    if (localObject2 != null) {
      k.sI().set(258, localObject2);
    }
    try
    {
      localObject2 = com.tencent.mm.compatible.util.h.getDataDirectory();
      StatFs localStatFs = new StatFs(((File)localObject2).getPath());
      com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "CheckData path[%s] blocksize:%d blockcount:%d availcount:%d", new Object[] { ((File)localObject2).getAbsolutePath(), Integer.valueOf(localStatFs.getBlockSize()), Integer.valueOf(localStatFs.getBlockCount()), Integer.valueOf(localStatFs.getAvailableBlocks()) });
      GMTrace.o(13503242960896L, 100607);
      return (s)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MMKernel.CoreStorage", "check data size failed :%s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  private static String xg()
  {
    GMTrace.i(13504048267264L, 100613);
    localObject1 = com.tencent.mm.storage.w.ghv;
    File localFile = new File(com.tencent.mm.compatible.util.e.ghx);
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "summer buildSysPath sysPath[" + (String)localObject1 + "] SDCARD_ROOT[" + com.tencent.mm.compatible.util.e.ghx + "] file.exists:" + localFile.exists() + " CUtil.isSDCardAvail():" + com.tencent.mm.compatible.util.f.ty());
    Object localObject2 = localObject1;
    if (localFile.exists())
    {
      localObject2 = localObject1;
      if (com.tencent.mm.compatible.util.f.ty())
      {
        if (bd(com.tencent.mm.compatible.util.e.ghz)) {
          localObject1 = com.tencent.mm.compatible.util.e.ghz;
        }
        localObject2 = new File(com.tencent.mm.compatible.util.e.fRZ);
        if (!((File)localObject2).exists()) {
          ((File)localObject2).mkdirs();
        }
        localObject2 = new File(com.tencent.mm.compatible.util.e.fSa);
        if (!((File)localObject2).exists()) {
          ((File)localObject2).mkdirs();
        }
        localObject2 = new File(com.tencent.mm.compatible.util.e.fSb);
        if (!((File)localObject2).exists()) {
          ((File)localObject2).mkdirs();
        }
        localObject2 = new File(com.tencent.mm.compatible.util.e.fSc);
        if (!((File)localObject2).exists()) {
          ((File)localObject2).mkdirs();
        }
        localFile = new File(com.tencent.mm.compatible.util.e.fSa + ".nomedia");
        localObject2 = localObject1;
        if (localFile.exists()) {}
      }
    }
    try
    {
      localFile.createNewFile();
      localObject2 = localObject1;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MMKernel.CoreStorage", "exception:%s", new Object[] { bg.f(localIOException) });
        Object localObject3 = localObject1;
      }
    }
    localObject1 = new File((String)localObject2);
    if (!((File)localObject1).exists()) {
      ((File)localObject1).mkdirs();
    }
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "summer buildSysPath ret sysPath: " + (String)localObject2);
    GMTrace.o(13504048267264L, 100613);
    return (String)localObject2;
  }
  
  /* Error */
  private static boolean xm()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc2_w 480
    //   5: ldc_w 482
    //   8: invokestatic 103	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: invokestatic 487	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   14: invokevirtual 407	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   17: astore 8
    //   19: getstatic 433	com/tencent/mm/compatible/util/e:ghx	Ljava/lang/String;
    //   22: aload 8
    //   24: invokevirtual 490	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   27: istore_3
    //   28: invokestatic 493	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   31: ldc_w 495
    //   34: invokevirtual 256	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   37: istore 4
    //   39: new 307	java/io/File
    //   42: dup
    //   43: invokestatic 487	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   46: invokevirtual 407	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   49: invokespecial 310	java/io/File:<init>	(Ljava/lang/String;)V
    //   52: invokevirtual 498	java/io/File:canWrite	()Z
    //   55: istore_1
    //   56: new 307	java/io/File
    //   59: dup
    //   60: invokestatic 487	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   63: invokevirtual 407	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   66: ldc_w 500
    //   69: invokespecial 502	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: astore 7
    //   74: aload 7
    //   76: invokevirtual 471	java/io/File:createNewFile	()Z
    //   79: pop
    //   80: new 504	java/io/FileOutputStream
    //   83: dup
    //   84: aload 7
    //   86: invokespecial 507	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   89: astore 6
    //   91: aload 6
    //   93: astore 5
    //   95: aload 6
    //   97: ldc_w 509
    //   100: invokevirtual 513	java/lang/String:getBytes	()[B
    //   103: invokevirtual 517	java/io/FileOutputStream:write	([B)V
    //   106: aload 6
    //   108: astore 5
    //   110: aload 6
    //   112: invokevirtual 520	java/io/FileOutputStream:flush	()V
    //   115: aload 6
    //   117: astore 5
    //   119: aload 6
    //   121: invokevirtual 523	java/io/FileOutputStream:close	()V
    //   124: aload 6
    //   126: astore 5
    //   128: aload 7
    //   130: invokevirtual 526	java/io/File:delete	()Z
    //   133: istore_0
    //   134: aload 6
    //   136: invokevirtual 523	java/io/FileOutputStream:close	()V
    //   139: ldc -52
    //   141: new 186	java/lang/StringBuilder
    //   144: dup
    //   145: ldc_w 528
    //   148: invokespecial 332	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   151: aload 8
    //   153: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: ldc_w 530
    //   159: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: getstatic 433	com/tencent/mm/compatible/util/e:ghx	Ljava/lang/String;
    //   165: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: ldc_w 532
    //   171: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: iload_3
    //   175: invokevirtual 442	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   178: ldc_w 534
    //   181: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: iload 4
    //   186: invokevirtual 442	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   189: ldc_w 536
    //   192: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: iload_1
    //   196: invokevirtual 442	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   199: ldc_w 538
    //   202: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: iload_0
    //   206: invokevirtual 442	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   209: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokestatic 305	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   215: ldc2_w 480
    //   218: ldc_w 482
    //   221: invokestatic 132	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   224: iload_0
    //   225: ireturn
    //   226: astore 5
    //   228: ldc -52
    //   230: new 186	java/lang/StringBuilder
    //   233: dup
    //   234: ldc_w 540
    //   237: invokespecial 332	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   240: aload 5
    //   242: invokevirtual 421	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   245: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   251: invokestatic 542	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   254: iconst_0
    //   255: istore_1
    //   256: goto -200 -> 56
    //   259: astore 5
    //   261: ldc -52
    //   263: ldc_w 475
    //   266: iconst_1
    //   267: anewarray 4	java/lang/Object
    //   270: dup
    //   271: iconst_0
    //   272: aload 5
    //   274: invokestatic 478	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   277: aastore
    //   278: invokestatic 423	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   281: goto -142 -> 139
    //   284: astore 7
    //   286: aconst_null
    //   287: astore 6
    //   289: aload 6
    //   291: astore 5
    //   293: ldc -52
    //   295: new 186	java/lang/StringBuilder
    //   298: dup
    //   299: ldc_w 544
    //   302: invokespecial 332	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   305: aload 7
    //   307: invokevirtual 421	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   310: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   316: invokestatic 542	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   319: iload_2
    //   320: istore_0
    //   321: aload 6
    //   323: ifnull -184 -> 139
    //   326: aload 6
    //   328: invokevirtual 523	java/io/FileOutputStream:close	()V
    //   331: iload_2
    //   332: istore_0
    //   333: goto -194 -> 139
    //   336: astore 5
    //   338: ldc -52
    //   340: ldc_w 475
    //   343: iconst_1
    //   344: anewarray 4	java/lang/Object
    //   347: dup
    //   348: iconst_0
    //   349: aload 5
    //   351: invokestatic 478	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   354: aastore
    //   355: invokestatic 423	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   358: iload_2
    //   359: istore_0
    //   360: goto -221 -> 139
    //   363: astore 6
    //   365: aconst_null
    //   366: astore 5
    //   368: aload 5
    //   370: ifnull +8 -> 378
    //   373: aload 5
    //   375: invokevirtual 523	java/io/FileOutputStream:close	()V
    //   378: aload 6
    //   380: athrow
    //   381: astore 5
    //   383: ldc -52
    //   385: ldc_w 475
    //   388: iconst_1
    //   389: anewarray 4	java/lang/Object
    //   392: dup
    //   393: iconst_0
    //   394: aload 5
    //   396: invokestatic 478	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   399: aastore
    //   400: invokestatic 423	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: goto -25 -> 378
    //   406: astore 6
    //   408: goto -40 -> 368
    //   411: astore 7
    //   413: goto -124 -> 289
    // Local variable table:
    //   start	length	slot	name	signature
    //   133	227	0	bool1	boolean
    //   55	201	1	bool2	boolean
    //   1	358	2	bool3	boolean
    //   27	148	3	bool4	boolean
    //   37	148	4	bool5	boolean
    //   93	34	5	localFileOutputStream1	java.io.FileOutputStream
    //   226	15	5	localException1	Exception
    //   259	14	5	localIOException1	IOException
    //   291	1	5	localFileOutputStream2	java.io.FileOutputStream
    //   336	14	5	localIOException2	IOException
    //   366	8	5	localObject1	Object
    //   381	14	5	localIOException3	IOException
    //   89	238	6	localFileOutputStream3	java.io.FileOutputStream
    //   363	16	6	localObject2	Object
    //   406	1	6	localObject3	Object
    //   72	57	7	localFile	File
    //   284	22	7	localException2	Exception
    //   411	1	7	localException3	Exception
    //   17	135	8	str	String
    // Exception table:
    //   from	to	target	type
    //   39	56	226	java/lang/Exception
    //   134	139	259	java/io/IOException
    //   74	91	284	java/lang/Exception
    //   326	331	336	java/io/IOException
    //   74	91	363	finally
    //   373	378	381	java/io/IOException
    //   95	106	406	finally
    //   110	115	406	finally
    //   119	124	406	finally
    //   128	134	406	finally
    //   293	319	406	finally
    //   95	106	411	java/lang/Exception
    //   110	115	411	java/lang/Exception
    //   119	124	411	java/lang/Exception
    //   128	134	411	java/lang/Exception
  }
  
  private static boolean xn()
  {
    GMTrace.i(13505122009088L, 100621);
    String str = Environment.getExternalStorageDirectory().getAbsolutePath();
    boolean bool2 = com.tencent.mm.compatible.util.e.ghx.equalsIgnoreCase(str);
    boolean bool3 = Environment.getExternalStorageState().equals("mounted");
    try
    {
      bool1 = new File(Environment.getExternalStorageDirectory().getAbsolutePath()).canRead();
      File localFile = new File(com.tencent.mm.compatible.util.e.ghz);
      boolean bool4 = localFile.exists();
      if (bool4) {
        com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "testSdcardReadable testFile isDirectory:" + localFile.isDirectory() + " isFile:" + localFile.isFile());
      }
      com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "testSdcardWritable primaryExtStg: " + str + " CConstants.SDCARD_ROOT: " + com.tencent.mm.compatible.util.e.ghx + " CConstants.DATAROOT_SDCARD_PATH: " + com.tencent.mm.compatible.util.e.ghz + " isPrimaryExtStg: " + bool2 + " mounted: " + bool3 + " canRead: " + bool1 + " canTrueRead:" + bool4);
      GMTrace.o(13505122009088L, 100621);
      return bool4;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool1 = false;
        com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreStorage", "testSdcardReadable 1 e: " + localException.getMessage());
      }
    }
  }
  
  public final com.tencent.mm.vending.b.b a(com.tencent.mm.kernel.api.e parame)
  {
    GMTrace.i(13503108743168L, 100606);
    parame = this.fYM.bT(parame);
    GMTrace.o(13503108743168L, 100606);
    return parame;
  }
  
  public final void dk(String paramString)
  {
    GMTrace.i(13503779831808L, 100611);
    this.fYM.onDataBaseClosed(this.fYV, this.fYW);
    if (this.fYW != null) {
      this.fYW.yE();
    }
    if (this.fYV != null) {
      this.fYV.dk(paramString);
    }
    GMTrace.o(13503779831808L, 100611);
  }
  
  public final SharedPreferences eN(String paramString)
  {
    GMTrace.i(13503914049536L, 100612);
    h.xz();
    h.xw();
    int i = a.ww();
    if (i != 0) {
      if (this.fZa.containsKey(paramString))
      {
        paramString = (SharedPreferences)this.fZa.get(paramString);
        GMTrace.o(13503914049536L, 100612);
        return paramString;
      }
    }
    try
    {
      localObject1 = ab.getContext().getFilesDir().getParent() + "/shared_prefs/";
      Object localObject2 = ab.bPU() + paramString + i + ".xml";
      String str = ab.bPU() + paramString + i + ".xml.bak";
      localObject2 = new File((String)localObject1 + (String)localObject2);
      if (((File)localObject2).exists()) {
        ((File)localObject2).delete();
      }
      localObject1 = new File((String)localObject1 + str);
      if (((File)localObject1).exists()) {
        ((File)localObject1).delete();
      }
    }
    catch (Exception localException)
    {
      Object localObject1;
      for (;;) {}
    }
    localObject1 = aa.RP(String.valueOf(i / 2));
    localObject1 = ab.bPU() + paramString + aa.RP(new StringBuilder().append(i).append((String)localObject1).toString());
    localObject1 = ab.getContext().getSharedPreferences((String)localObject1, 0);
    this.fZa.put(paramString, localObject1);
    GMTrace.o(13503914049536L, 100612);
    return (SharedPreferences)localObject1;
    GMTrace.o(13503914049536L, 100612);
    return null;
  }
  
  public final boolean isSDCardAvailable()
  {
    GMTrace.i(13504719355904L, 100618);
    boolean bool1 = this.fYT.startsWith(com.tencent.mm.compatible.util.e.ghx);
    long l1 = bg.Pv();
    long l2 = l1 - this.fZb;
    if (bool1)
    {
      h.xz();
      if ((h.xw().wL()) && (l2 > 0L) && (l2 < 1000L) && (new File(this.fYT).exists()))
      {
        GMTrace.o(13504719355904L, 100618);
        return true;
      }
    }
    this.fZb = l1;
    boolean bool2 = com.tencent.mm.compatible.util.f.ty();
    h.xz();
    h.xw();
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "isSDCardAvail:%b uin:%s toNow:%d sysPath:[%s] sdRoot:[%s], acc init:[%b]", new Object[] { Boolean.valueOf(bool2), o.getString(a.ww()), Long.valueOf(l2), this.fYT, com.tencent.mm.compatible.util.e.ghx, Boolean.valueOf(h.xw().wL()) });
    if (!bool2)
    {
      GMTrace.o(13504719355904L, 100618);
      return false;
    }
    if (bool1)
    {
      GMTrace.o(13504719355904L, 100618);
      return true;
    }
    h.xz();
    if (h.xw().wL())
    {
      com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "summer isSDCardAvailable accHasReady and remount");
      xl();
    }
    GMTrace.o(13504719355904L, 100618);
    return true;
  }
  
  final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(13505256226816L, 100622);
    HashMap localHashMap1 = new HashMap();
    localHashMap1.putAll(fIv);
    Object localObject2;
    Object localObject3;
    synchronized (this.fYR)
    {
      com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "storage getBaseDBFactories");
      localObject2 = this.fYR.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (com.tencent.mm.kernel.api.a)((Iterator)localObject2).next();
        HashMap localHashMap2 = ((com.tencent.mm.kernel.api.a)localObject3).collectDatabaseFactory();
        if (localHashMap2 != null) {
          localHashMap1.putAll(localHashMap2);
        }
        if (localHashMap2 != null) {
          com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "storage add db provider %s %s %s", new Object[] { localObject3, Integer.valueOf(localHashMap2.size()), Integer.valueOf(localHashMap1.size()) });
        }
      }
    }
    ??? = localHashMap.keySet().iterator();
    while (((Iterator)???).hasNext())
    {
      localObject2 = (Integer)((Iterator)???).next();
      localObject3 = ((g.d)localHashMap.get(localObject2)).rf();
      int j = localObject3.length;
      int i = 0;
      while (i < j)
      {
        com.tencent.mm.sdk.platformtools.w.d("MMKernel.CoreStorage", "create table key %s table %s", new Object[] { localObject2, localObject3[i] });
        i += 1;
      }
    }
    GMTrace.o(13505256226816L, 100622);
    return localHashMap;
  }
  
  final boolean xb()
  {
    GMTrace.i(13503377178624L, 100608);
    int i = bg.e((Integer)this.fYX.get(14, null));
    int j = d.tJC;
    com.tencent.mm.sdk.platformtools.w.d("MMKernel.CoreStorage", "tryDataTransfer, sVer = " + i + ", cVer = " + j);
    Object localObject1 = new ag()
    {
      public final List<com.tencent.mm.y.af> getDataTransferList()
      {
        GMTrace.i(13511430242304L, 100668);
        ArrayList localArrayList = new ArrayList();
        synchronized (e.this.fYS)
        {
          Iterator localIterator = e.this.fYS.iterator();
          while (localIterator.hasNext())
          {
            List localList2 = ((ag)localIterator.next()).getDataTransferList();
            if (localList2 != null) {
              localArrayList.addAll(localList2);
            }
          }
        }
        GMTrace.o(13511430242304L, 100668);
        return localList;
      }
    }.getDataTransferList();
    if (localObject1 == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MMKernel.CoreStorage", "tryDataTransfer, dataTransferList is null");
      GMTrace.o(13503377178624L, 100608);
      return false;
    }
    if ((r.hkb > 0) && (r.hkc > 0)) {
      com.tencent.mm.sdk.platformtools.w.w("MMKernel.CoreStorage", "tryDataTransfer, force data transfer");
    }
    long l1;
    boolean bool1;
    do
    {
      com.tencent.mm.sdk.platformtools.w.d("MMKernel.CoreStorage", "tryDataTransfer dataTransferList size = " + ((List)localObject1).size());
      com.tencent.mm.sdk.platformtools.w.d("MMKernel.CoreStorage", "tryDataTransfer, threadId = " + Thread.currentThread().getId() + ", name = " + Thread.currentThread().getName());
      l1 = this.fYV.cE(Thread.currentThread().getId());
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (com.tencent.mm.y.af)((Iterator)localObject1).next();
        long l2 = System.currentTimeMillis();
        ((com.tencent.mm.y.af)localObject2).transfer(i);
        ((com.tencent.mm.y.af)localObject2).gmW = (System.currentTimeMillis() - l2);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.DataTransferBase", "doTransfer, timeConsumed = " + ((com.tencent.mm.y.af)localObject2).gmW + ", tag = " + ((com.tencent.mm.y.af)localObject2).getTag());
      }
      if (i == j)
      {
        com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "tryDataTransfer, no need to transfer, sVer = " + i + ", cVer = " + j);
        GMTrace.o(13503377178624L, 100608);
        return false;
      }
      bool1 = false;
      Object localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        boolean bool2 = ((com.tencent.mm.y.af)((Iterator)localObject2).next()).fq(i);
        bool1 = bool2;
        if (bool2) {
          bool1 = bool2;
        }
      }
      com.tencent.mm.sdk.platformtools.w.d("MMKernel.CoreStorage", "tryDataTransfer, needTransfer = " + bool1);
    } while (bool1);
    GMTrace.o(13503377178624L, 100608);
    return false;
    if ((r.hkb != 0) && (r.hkc != 0))
    {
      i = 0;
      for (;;)
      {
        if (i < r.hkb) {
          try
          {
            Thread.sleep(r.hkc);
            i += 1;
          }
          catch (InterruptedException localInterruptedException)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.e("MMKernel.CoreStorage", "exception:%s", new Object[] { bg.f(localInterruptedException) });
            }
          }
        }
      }
    }
    if (l1 > 0L) {
      this.fYV.aL(l1);
    }
    GMTrace.o(13503377178624L, 100608);
    return true;
  }
  
  final void xc()
  {
    GMTrace.i(13503511396352L, 100609);
    Object localObject = this.fYO.collectStoragePaths();
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreStorage", "all account storage folder %s", new Object[] { localObject.toString() });
    String[] arrayOfString = new String[((List)localObject).size() + 1];
    arrayOfString[0] = this.fYU;
    int i = 0;
    while (i < ((List)localObject).size())
    {
      arrayOfString[(i + 1)] = (this.fYU + (String)((List)localObject).get(i));
      i += 1;
    }
    com.tencent.mm.a.e.c(arrayOfString);
    this.fYN.eO(this.fYU);
    localObject = new File(this.fYU + ".nomedia");
    if (!((File)localObject).exists()) {
      try
      {
        ((File)localObject).createNewFile();
        GMTrace.o(13503511396352L, 100609);
        return;
      }
      catch (IOException localIOException)
      {
        com.tencent.mm.sdk.platformtools.w.e("MMKernel.CoreStorage", "exception:%s", new Object[] { bg.f(localIOException) });
      }
    }
    GMTrace.o(13503511396352L, 100609);
  }
  
  public final String xd()
  {
    GMTrace.i(13503645614080L, 100610);
    Object localObject1 = new File(this.cachePath + "/ctest", "EnMicroMsg.db");
    if (((File)localObject1).isFile())
    {
      localObject1 = ((File)localObject1).getAbsolutePath();
      GMTrace.o(13503645614080L, 100610);
      return (String)localObject1;
    }
    localObject1 = new File(this.cachePath + "/corrupted", "EnMicroMsg.db");
    if (((File)localObject1).isFile())
    {
      localObject1 = ((File)localObject1).getAbsolutePath();
      GMTrace.o(13503645614080L, 100610);
      return (String)localObject1;
    }
    String[] arrayOfString = new File(this.cachePath).list(new FilenameFilter()
    {
      public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        GMTrace.i(13498276904960L, 100570);
        boolean bool = paramAnonymousString.startsWith("EnMicroMsg.dberr");
        GMTrace.o(13498276904960L, 100570);
        return bool;
      }
    });
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      localObject1 = arrayOfString[0];
      int i = 1;
      while (i < arrayOfString.length)
      {
        String str = arrayOfString[i];
        Object localObject2 = localObject1;
        if (str.compareTo((String)localObject1) > 0) {
          localObject2 = str;
        }
        i += 1;
        localObject1 = localObject2;
      }
      localObject1 = this.cachePath + '/' + (String)localObject1;
      GMTrace.o(13503645614080L, 100610);
      return (String)localObject1;
    }
    GMTrace.o(13503645614080L, 100610);
    return null;
  }
  
  public final String xe()
  {
    GMTrace.i(14610136563712L, 108854);
    String str = this.cachePath + "MicroMsg.db";
    GMTrace.o(14610136563712L, 108854);
    return str;
  }
  
  public final String xf()
  {
    GMTrace.i(14610270781440L, 108855);
    String str = this.cachePath + "EnMicroMsg.db";
    GMTrace.o(14610270781440L, 108855);
    return str;
  }
  
  public final t xh()
  {
    GMTrace.i(13504316702720L, 100615);
    h.xz();
    h.xw().wG();
    t localt = this.fYX;
    GMTrace.o(13504316702720L, 100615);
    return localt;
  }
  
  public final ba xi()
  {
    GMTrace.i(13504450920448L, 100616);
    h.xz();
    h.xw().wG();
    ba localba = this.fYY;
    GMTrace.o(13504450920448L, 100616);
    return localba;
  }
  
  public final void xj()
  {
    GMTrace.i(13504585138176L, 100617);
    this.fZd = Boolean.valueOf(isSDCardAvailable());
    GMTrace.o(13504585138176L, 100617);
  }
  
  public final boolean xk()
  {
    GMTrace.i(14610404999168L, 108856);
    if (this.fZd == null) {
      this.fZd = Boolean.valueOf(isSDCardAvailable());
    }
    for (;;)
    {
      boolean bool = this.fZd.booleanValue();
      GMTrace.o(14610404999168L, 108856);
      return bool;
      long l = System.currentTimeMillis() - this.fZf;
      if ((l <= 0L) || (l >= 1000L))
      {
        if (this.fZc == null) {
          this.fZc = new ae(h.xB().ngv.getLooper());
        }
        this.fZc.removeCallbacksAndMessages(null);
        this.fZc.postDelayed(this.fZe, 1000L);
        this.fZf = System.currentTimeMillis();
      }
    }
  }
  
  /* Error */
  public final void xl()
  {
    // Byte code:
    //   0: ldc2_w 953
    //   3: ldc_w 955
    //   6: invokestatic 103	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: invokestatic 597	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   12: pop
    //   13: invokestatic 601	com/tencent/mm/kernel/h:xw	()Lcom/tencent/mm/kernel/a;
    //   16: getfield 959	com/tencent/mm/kernel/a:fXW	[B
    //   19: astore_2
    //   20: aload_2
    //   21: monitorenter
    //   22: invokestatic 271	com/tencent/mm/kernel/e:xg	()Ljava/lang/String;
    //   25: astore_3
    //   26: ldc -52
    //   28: ldc_w 961
    //   31: iconst_4
    //   32: anewarray 4	java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: invokestatic 604	com/tencent/mm/kernel/a:ww	()I
    //   40: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: aastore
    //   44: dup
    //   45: iconst_1
    //   46: aload_0
    //   47: getfield 273	com/tencent/mm/kernel/e:fYT	Ljava/lang/String;
    //   50: aastore
    //   51: dup
    //   52: iconst_2
    //   53: aload_3
    //   54: aastore
    //   55: dup
    //   56: iconst_3
    //   57: invokestatic 601	com/tencent/mm/kernel/h:xw	()Lcom/tencent/mm/kernel/a;
    //   60: invokevirtual 660	com/tencent/mm/kernel/a:wL	()Z
    //   63: invokestatic 221	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   66: aastore
    //   67: invokestatic 226	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: aload_3
    //   71: invokestatic 300	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   74: ifne +287 -> 361
    //   77: aload_3
    //   78: aload_0
    //   79: getfield 273	com/tencent/mm/kernel/e:fYT	Ljava/lang/String;
    //   82: invokevirtual 490	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   85: istore_1
    //   86: iload_1
    //   87: ifeq +126 -> 213
    //   90: ldc -52
    //   92: new 186	java/lang/StringBuilder
    //   95: dup
    //   96: ldc_w 963
    //   99: invokespecial 332	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   102: invokestatic 965	com/tencent/mm/kernel/e:xm	()Z
    //   105: invokevirtual 442	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   108: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: invokestatic 305	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   114: ldc -52
    //   116: new 186	java/lang/StringBuilder
    //   119: dup
    //   120: ldc_w 967
    //   123: invokespecial 332	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   126: invokestatic 969	com/tencent/mm/kernel/e:xn	()Z
    //   129: invokevirtual 442	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   132: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokestatic 305	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   138: aload_2
    //   139: monitorexit
    //   140: ldc2_w 953
    //   143: ldc_w 955
    //   146: invokestatic 132	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   149: return
    //   150: astore_3
    //   151: ldc -52
    //   153: new 186	java/lang/StringBuilder
    //   156: dup
    //   157: ldc_w 971
    //   160: invokespecial 332	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   163: aload_3
    //   164: invokevirtual 421	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   167: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: invokestatic 542	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   176: goto -62 -> 114
    //   179: astore_3
    //   180: aload_2
    //   181: monitorexit
    //   182: aload_3
    //   183: athrow
    //   184: astore_3
    //   185: ldc -52
    //   187: new 186	java/lang/StringBuilder
    //   190: dup
    //   191: ldc_w 973
    //   194: invokespecial 332	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   197: aload_3
    //   198: invokevirtual 421	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   201: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: invokestatic 542	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   210: goto -72 -> 138
    //   213: ldc -52
    //   215: ldc_w 975
    //   218: iconst_4
    //   219: anewarray 4	java/lang/Object
    //   222: dup
    //   223: iconst_0
    //   224: aload_0
    //   225: getfield 273	com/tencent/mm/kernel/e:fYT	Ljava/lang/String;
    //   228: aastore
    //   229: dup
    //   230: iconst_1
    //   231: aload_3
    //   232: aastore
    //   233: dup
    //   234: iconst_2
    //   235: aload_0
    //   236: getfield 852	com/tencent/mm/kernel/e:fYU	Ljava/lang/String;
    //   239: aastore
    //   240: dup
    //   241: iconst_3
    //   242: aload_0
    //   243: getfield 867	com/tencent/mm/kernel/e:cachePath	Ljava/lang/String;
    //   246: aastore
    //   247: invokestatic 226	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: aload_3
    //   251: invokestatic 300	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   254: ifne +79 -> 333
    //   257: aload_0
    //   258: aload_3
    //   259: putfield 273	com/tencent/mm/kernel/e:fYT	Ljava/lang/String;
    //   262: new 186	java/lang/StringBuilder
    //   265: dup
    //   266: ldc_w 977
    //   269: invokespecial 332	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   272: astore_3
    //   273: invokestatic 597	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   276: pop
    //   277: invokestatic 601	com/tencent/mm/kernel/h:xw	()Lcom/tencent/mm/kernel/a;
    //   280: pop
    //   281: aload_3
    //   282: invokestatic 604	com/tencent/mm/kernel/a:ww	()I
    //   285: invokevirtual 335	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   288: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   291: invokevirtual 513	java/lang/String:getBytes	()[B
    //   294: invokestatic 983	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   297: astore_3
    //   298: aload_0
    //   299: new 186	java/lang/StringBuilder
    //   302: dup
    //   303: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   306: aload_0
    //   307: getfield 273	com/tencent/mm/kernel/e:fYT	Ljava/lang/String;
    //   310: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: aload_3
    //   314: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: ldc_w 323
    //   320: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   326: putfield 852	com/tencent/mm/kernel/e:fYU	Ljava/lang/String;
    //   329: aload_0
    //   330: invokevirtual 985	com/tencent/mm/kernel/e:xc	()V
    //   333: aload_0
    //   334: getfield 283	com/tencent/mm/kernel/e:fYN	Lcom/tencent/mm/kernel/e$c;
    //   337: invokevirtual 988	com/tencent/mm/kernel/e$c:xr	()V
    //   340: ldc -52
    //   342: ldc_w 990
    //   345: iconst_1
    //   346: anewarray 4	java/lang/Object
    //   349: dup
    //   350: iconst_0
    //   351: invokestatic 449	com/tencent/mm/compatible/util/f:ty	()Z
    //   354: invokestatic 221	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   357: aastore
    //   358: invokestatic 226	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   361: aload_2
    //   362: monitorexit
    //   363: ldc2_w 953
    //   366: ldc_w 955
    //   369: invokestatic 132	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   372: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	373	0	this	e
    //   85	2	1	bool	boolean
    //   19	343	2	arrayOfByte	byte[]
    //   25	53	3	str	String
    //   150	14	3	localException1	Exception
    //   179	4	3	localObject1	Object
    //   184	75	3	localException2	Exception
    //   272	42	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   90	114	150	java/lang/Exception
    //   22	86	179	finally
    //   90	114	179	finally
    //   114	138	179	finally
    //   138	140	179	finally
    //   151	176	179	finally
    //   180	182	179	finally
    //   185	210	179	finally
    //   213	333	179	finally
    //   333	361	179	finally
    //   361	363	179	finally
    //   114	138	184	java/lang/Exception
  }
  
  public static final class a
    extends com.tencent.mm.bz.a<com.tencent.mm.kernel.api.b>
    implements com.tencent.mm.kernel.api.b
  {
    a()
    {
      GMTrace.i(13506598404096L, 100632);
      GMTrace.o(13506598404096L, 100632);
    }
    
    public final List<String> collectStoragePaths()
    {
      GMTrace.i(13506732621824L, 100633);
      Object localObject1 = ckd();
      LinkedList localLinkedList = new LinkedList();
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (com.tencent.mm.vending.b.b)((Iterator)localObject1).next();
        if (localObject2 != null)
        {
          localObject2 = ((com.tencent.mm.kernel.api.b)((com.tencent.mm.vending.b.b)localObject2).xxE).collectStoragePaths();
          if (localObject2 != null) {
            localLinkedList.addAll((Collection)localObject2);
          }
        }
      }
      GMTrace.o(13506732621824L, 100633);
      return localLinkedList;
    }
  }
  
  static final class b
    extends com.tencent.mm.bz.a<com.tencent.mm.kernel.api.e>
    implements com.tencent.mm.kernel.api.e
  {
    b()
    {
      GMTrace.i(13515993645056L, 100702);
      GMTrace.o(13515993645056L, 100702);
    }
    
    public final void onDataBaseClosed(final g paramg1, final g paramg2)
    {
      GMTrace.i(13516664733696L, 100707);
      a(new a.a() {});
      GMTrace.o(13516664733696L, 100707);
    }
    
    public final void onDataBaseOpened(final g paramg1, final g paramg2)
    {
      GMTrace.i(13516262080512L, 100704);
      a(new a.a() {});
      GMTrace.o(13516262080512L, 100704);
    }
  }
  
  static final class c
    extends com.tencent.mm.bz.a<com.tencent.mm.kernel.api.f>
    implements com.tencent.mm.kernel.api.f
  {
    c()
    {
      GMTrace.i(18786992259072L, 139974);
      GMTrace.o(18786992259072L, 139974);
    }
    
    public final void be(final boolean paramBoolean)
    {
      GMTrace.i(18787126476800L, 139975);
      a(new a.a() {});
      GMTrace.o(18787126476800L, 139975);
    }
    
    public final void eO(final String paramString)
    {
      GMTrace.i(18787394912256L, 139977);
      a(new a.a() {});
      GMTrace.o(18787394912256L, 139977);
    }
    
    public final void xr()
    {
      GMTrace.i(18787260694528L, 139976);
      a(new a.a() {});
      GMTrace.o(18787260694528L, 139976);
    }
  }
  
  private final class d
    implements Runnable
  {
    public d()
    {
      GMTrace.i(13496129421312L, 100554);
      GMTrace.o(13496129421312L, 100554);
    }
    
    public final void run()
    {
      GMTrace.i(13496263639040L, 100555);
      e.this.xj();
      GMTrace.o(13496263639040L, 100555);
    }
  }
  
  public static final class e
    extends com.tencent.mm.bz.a<g.a>
    implements g.a
  {
    e()
    {
      GMTrace.i(13501095477248L, 100591);
      GMTrace.o(13501095477248L, 100591);
    }
    
    public final void xo()
    {
      GMTrace.i(13501229694976L, 100592);
      a(new a.a() {});
      GMTrace.o(13501229694976L, 100592);
    }
    
    public final void xp()
    {
      GMTrace.i(13501363912704L, 100593);
      a(new a.a() {});
      GMTrace.o(13501363912704L, 100593);
    }
    
    public final void xq()
    {
      GMTrace.i(13501498130432L, 100594);
      a(new a.a() {});
      GMTrace.o(13501498130432L, 100594);
    }
  }
  
  public static final class f
  {
    public boolean fZo;
    public int fZp;
    
    public f()
    {
      GMTrace.i(13524449361920L, 100765);
      this.fZo = false;
      this.fZp = 0;
      GMTrace.o(13524449361920L, 100765);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */