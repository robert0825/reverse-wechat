package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.ApplicationInfo;
import android.os.Looper;
import android.util.LruCache;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class al
  implements SharedPreferences
{
  public static ae viY;
  private static final Object vjg;
  private static final LruCache<String, al> vji;
  private static Class<?> vjj;
  private static Method vjk;
  private static Method vjl;
  private static boolean vjm;
  boolean fYn;
  public File hJl;
  public Map<String, Object> hOK;
  public int mMode;
  public FLock viZ;
  public File vja;
  public boolean vjb;
  public int vjc;
  public long vjd;
  public long vje;
  public final Object vjf;
  public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> vjh;
  
  static
  {
    GMTrace.i(13740808339456L, 102377);
    viY = null;
    vjg = new Object();
    vji = new LruCache(5);
    vjj = null;
    vjk = null;
    vjl = null;
    vjm = false;
    GMTrace.o(13740808339456L, 102377);
  }
  
  private al()
  {
    GMTrace.i(13736513372160L, 102345);
    this.viZ = null;
    this.hJl = null;
    this.vja = null;
    this.mMode = 0;
    this.vjb = false;
    this.hOK = null;
    this.vjc = 0;
    this.fYn = false;
    this.vjd = 0L;
    this.vje = 0L;
    this.vjf = new Object();
    this.vjh = new WeakHashMap();
    throw new RuntimeException("Not supported.");
  }
  
  private al(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(13736647589888L, 102346);
    this.viZ = null;
    this.hJl = null;
    this.vja = null;
    this.mMode = 0;
    this.vjb = false;
    this.hOK = null;
    this.vjc = 0;
    this.fYn = false;
    this.vjd = 0L;
    this.vje = 0L;
    this.vjf = new Object();
    this.vjh = new WeakHashMap();
    Context localContext = paramContext.getApplicationContext();
    if (viY == null) {
      viY = new ae(Looper.getMainLooper());
    }
    String str = localContext.getApplicationInfo().dataDir;
    if (str != null)
    {
      paramContext = str;
      if (str.length() != 0) {}
    }
    else
    {
      w.w("MicroMsg.MultiProcSharedPreferences", "Failed to retrive data path by ApplicationInfo.dataDir, use prefix hardcoded version instead.");
      paramContext = "/data/data/" + localContext.getPackageName();
    }
    w.i("MicroMsg.MultiProcSharedPreferences", "Path to store sp data: " + paramContext);
    paramContext = new File(paramContext, "shared_prefs");
    if (!paramContext.exists()) {
      paramContext.mkdirs();
    }
    for (;;)
    {
      this.hJl = new File(paramContext, paramString + ".xml");
      paramContext = this.hJl;
      this.vja = new File(paramContext.getPath() + ".bak");
      this.mMode = 4;
      this.vjb = true;
      if (this.vjb) {
        this.viZ = new FLock(this.hJl.getPath() + ".lock");
      }
      bQo();
      GMTrace.o(13736647589888L, 102346);
      return;
      if ((!paramContext.canRead()) || (!paramContext.canWrite()))
      {
        paramContext.setReadable(true, true);
        paramContext.setWritable(true, true);
      }
    }
  }
  
  private void bQo()
  {
    GMTrace.i(13736781807616L, 102347);
    try
    {
      this.fYn = false;
      e.b(new Runnable()
      {
        /* Error */
        public final void run()
        {
          // Byte code:
          //   0: aconst_null
          //   1: astore_3
          //   2: aconst_null
          //   3: astore 5
          //   5: aconst_null
          //   6: astore 4
          //   8: aconst_null
          //   9: astore_2
          //   10: ldc2_w 42
          //   13: ldc 44
          //   15: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   18: aload_0
          //   19: getfield 17	com/tencent/mm/sdk/platformtools/al$1:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   22: astore 6
          //   24: aload 6
          //   26: monitorenter
          //   27: aload_0
          //   28: getfield 17	com/tencent/mm/sdk/platformtools/al$1:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   31: astore 7
          //   33: aload 7
          //   35: getfield 48	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   38: istore_1
          //   39: iload_1
          //   40: ifeq +11 -> 51
          //   43: aload 7
          //   45: getfield 52	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   48: invokevirtual 57	com/tencent/mm/sdk/platformtools/FLock:bPx	()V
          //   51: aload 7
          //   53: getfield 60	com/tencent/mm/sdk/platformtools/al:fYn	Z
          //   56: istore_1
          //   57: iload_1
          //   58: ifeq +57 -> 115
          //   61: aload 7
          //   63: getfield 48	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   66: istore_1
          //   67: iload_1
          //   68: ifeq +11 -> 79
          //   71: aload 7
          //   73: getfield 52	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   76: invokevirtual 63	com/tencent/mm/sdk/platformtools/FLock:unlock	()V
          //   79: aload 6
          //   81: monitorexit
          //   82: ldc2_w 42
          //   85: ldc 44
          //   87: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   90: return
          //   91: astore 8
          //   93: ldc 65
          //   95: aload 8
          //   97: ldc 67
          //   99: iconst_0
          //   100: anewarray 4	java/lang/Object
          //   103: invokestatic 73	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   106: goto -55 -> 51
          //   109: astore_2
          //   110: aload 6
          //   112: monitorexit
          //   113: aload_2
          //   114: athrow
          //   115: aload 7
          //   117: getfield 77	com/tencent/mm/sdk/platformtools/al:vja	Ljava/io/File;
          //   120: invokevirtual 83	java/io/File:exists	()Z
          //   123: ifeq +26 -> 149
          //   126: aload 7
          //   128: getfield 86	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   131: invokevirtual 89	java/io/File:delete	()Z
          //   134: pop
          //   135: aload 7
          //   137: getfield 77	com/tencent/mm/sdk/platformtools/al:vja	Ljava/io/File;
          //   140: aload 7
          //   142: getfield 86	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   145: invokevirtual 93	java/io/File:renameTo	(Ljava/io/File;)Z
          //   148: pop
          //   149: aload 7
          //   151: getfield 86	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   154: invokevirtual 83	java/io/File:exists	()Z
          //   157: ifeq +44 -> 201
          //   160: aload 7
          //   162: getfield 86	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   165: invokevirtual 96	java/io/File:canRead	()Z
          //   168: ifne +33 -> 201
          //   171: ldc 65
          //   173: new 98	java/lang/StringBuilder
          //   176: dup
          //   177: ldc 100
          //   179: invokespecial 103	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   182: aload 7
          //   184: getfield 86	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   187: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   190: ldc 109
          //   192: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   195: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   198: invokestatic 120	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
          //   201: aload 7
          //   203: getfield 86	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   206: invokevirtual 96	java/io/File:canRead	()Z
          //   209: istore_1
          //   210: iload_1
          //   211: ifeq +57 -> 268
          //   214: new 122	java/io/BufferedInputStream
          //   217: dup
          //   218: new 124	java/io/FileInputStream
          //   221: dup
          //   222: aload 7
          //   224: getfield 86	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   227: invokespecial 127	java/io/FileInputStream:<init>	(Ljava/io/File;)V
          //   230: sipush 16384
          //   233: invokespecial 130	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
          //   236: astore 8
          //   238: invokestatic 136	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
          //   241: astore_2
          //   242: aload_2
          //   243: aload 8
          //   245: aconst_null
          //   246: invokeinterface 142 3 0
          //   251: aload_2
          //   252: iconst_1
          //   253: anewarray 144	java/lang/String
          //   256: invokestatic 150	com/tencent/mm/sdk/platformtools/bi:a	(Lorg/xmlpull/v1/XmlPullParser;[Ljava/lang/String;)Ljava/lang/Object;
          //   259: checkcast 152	java/util/HashMap
          //   262: astore_2
          //   263: aload 8
          //   265: invokevirtual 155	java/io/BufferedInputStream:close	()V
          //   268: aload 7
          //   270: iconst_1
          //   271: putfield 60	com/tencent/mm/sdk/platformtools/al:fYn	Z
          //   274: aload_2
          //   275: ifnull +151 -> 426
          //   278: aload 7
          //   280: aload_2
          //   281: putfield 159	com/tencent/mm/sdk/platformtools/al:hOK	Ljava/util/Map;
          //   284: aload 7
          //   286: aload 7
          //   288: getfield 86	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   291: invokevirtual 163	java/io/File:lastModified	()J
          //   294: putfield 167	com/tencent/mm/sdk/platformtools/al:vjd	J
          //   297: aload 7
          //   299: aload 7
          //   301: getfield 86	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   304: invokevirtual 170	java/io/File:length	()J
          //   307: putfield 173	com/tencent/mm/sdk/platformtools/al:vje	J
          //   310: aload 7
          //   312: invokevirtual 176	java/lang/Object:notifyAll	()V
          //   315: aload 7
          //   317: getfield 48	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   320: istore_1
          //   321: iload_1
          //   322: ifeq -243 -> 79
          //   325: aload 7
          //   327: getfield 52	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   330: invokevirtual 63	com/tencent/mm/sdk/platformtools/FLock:unlock	()V
          //   333: goto -254 -> 79
          //   336: astore_2
          //   337: goto -258 -> 79
          //   340: astore 4
          //   342: aload_3
          //   343: astore_2
          //   344: aload 4
          //   346: astore_3
          //   347: ldc 65
          //   349: ldc -78
          //   351: iconst_1
          //   352: anewarray 4	java/lang/Object
          //   355: dup
          //   356: iconst_0
          //   357: aload_3
          //   358: aastore
          //   359: invokestatic 181	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   362: goto -94 -> 268
          //   365: astore_2
          //   366: aload 7
          //   368: getfield 48	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   371: istore_1
          //   372: iload_1
          //   373: ifeq +11 -> 384
          //   376: aload 7
          //   378: getfield 52	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   381: invokevirtual 63	com/tencent/mm/sdk/platformtools/FLock:unlock	()V
          //   384: aload_2
          //   385: athrow
          //   386: astore_3
          //   387: aload 5
          //   389: astore_2
          //   390: ldc 65
          //   392: ldc -78
          //   394: iconst_1
          //   395: anewarray 4	java/lang/Object
          //   398: dup
          //   399: iconst_0
          //   400: aload_3
          //   401: aastore
          //   402: invokestatic 181	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   405: goto -137 -> 268
          //   408: ldc 65
          //   410: ldc -78
          //   412: iconst_1
          //   413: anewarray 4	java/lang/Object
          //   416: dup
          //   417: iconst_0
          //   418: aload_3
          //   419: aastore
          //   420: invokestatic 181	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   423: goto -155 -> 268
          //   426: aload 7
          //   428: new 152	java/util/HashMap
          //   431: dup
          //   432: invokespecial 182	java/util/HashMap:<init>	()V
          //   435: putfield 159	com/tencent/mm/sdk/platformtools/al:hOK	Ljava/util/Map;
          //   438: goto -128 -> 310
          //   441: astore_3
          //   442: goto -58 -> 384
          //   445: astore_3
          //   446: goto -38 -> 408
          //   449: astore_3
          //   450: goto -60 -> 390
          //   453: astore_3
          //   454: goto -107 -> 347
          //   457: astore_2
          //   458: goto -379 -> 79
          //   461: astore_3
          //   462: aload 4
          //   464: astore_2
          //   465: goto -57 -> 408
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	468	0	this	1
          //   38	335	1	bool	boolean
          //   9	1	2	localObject1	Object
          //   109	5	2	localObject2	Object
          //   241	40	2	localObject3	Object
          //   336	1	2	localException1	Exception
          //   343	1	2	localObject4	Object
          //   365	20	2	localObject5	Object
          //   389	1	2	localObject6	Object
          //   457	1	2	localException2	Exception
          //   464	1	2	localXmlPullParserException1	org.xmlpull.v1.XmlPullParserException
          //   1	357	3	localObject7	Object
          //   386	33	3	localFileNotFoundException1	FileNotFoundException
          //   441	1	3	localException3	Exception
          //   445	1	3	localIOException1	java.io.IOException
          //   449	1	3	localFileNotFoundException2	FileNotFoundException
          //   453	1	3	localXmlPullParserException2	org.xmlpull.v1.XmlPullParserException
          //   461	1	3	localIOException2	java.io.IOException
          //   6	1	4	localObject8	Object
          //   340	123	4	localXmlPullParserException3	org.xmlpull.v1.XmlPullParserException
          //   3	385	5	localObject9	Object
          //   22	89	6	localal1	al
          //   31	396	7	localal2	al
          //   91	5	8	localException4	Exception
          //   236	28	8	localBufferedInputStream	java.io.BufferedInputStream
          // Exception table:
          //   from	to	target	type
          //   43	51	91	java/lang/Exception
          //   27	39	109	finally
          //   43	51	109	finally
          //   61	67	109	finally
          //   71	79	109	finally
          //   79	82	109	finally
          //   93	106	109	finally
          //   110	113	109	finally
          //   315	321	109	finally
          //   325	333	109	finally
          //   366	372	109	finally
          //   376	384	109	finally
          //   384	386	109	finally
          //   325	333	336	java/lang/Exception
          //   214	263	340	org/xmlpull/v1/XmlPullParserException
          //   51	57	365	finally
          //   115	149	365	finally
          //   149	201	365	finally
          //   201	210	365	finally
          //   214	263	365	finally
          //   263	268	365	finally
          //   268	274	365	finally
          //   278	310	365	finally
          //   310	315	365	finally
          //   347	362	365	finally
          //   390	405	365	finally
          //   408	423	365	finally
          //   426	438	365	finally
          //   214	263	386	java/io/FileNotFoundException
          //   376	384	441	java/lang/Exception
          //   263	268	445	java/io/IOException
          //   263	268	449	java/io/FileNotFoundException
          //   263	268	453	org/xmlpull/v1/XmlPullParserException
          //   71	79	457	java/lang/Exception
          //   214	263	461	java/io/IOException
        }
      }, "MultiProcessSP-LoadThread").start();
      GMTrace.o(13736781807616L, 102347);
      return;
    }
    finally {}
  }
  
  private void bQp()
  {
    GMTrace.i(13737184460800L, 102350);
    if ((this.fYn) || (vjm) || (vjj == null)) {}
    try
    {
      vjj = Class.forName("dalvik.system.BlockGuard");
      if (vjk != null) {}
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        Object localObject = vjj.getDeclaredMethod("getThreadPolicy", new Class[0]);
        vjk = (Method)localObject;
        ((Method)localObject).setAccessible(true);
        for (;;)
        {
          try
          {
            if (vjk != null)
            {
              localObject = vjk.invoke(null, new Object[0]);
              if (vjl == null)
              {
                Method localMethod = localObject.getClass().getDeclaredMethod("onReadFromDisk", new Class[0]);
                vjl = localMethod;
                localMethod.setAccessible(true);
              }
              vjl.invoke(localObject, new Object[0]);
            }
          }
          catch (Throwable localThrowable3)
          {
            vjm = true;
            continue;
            GMTrace.o(13737184460800L, 102350);
          }
          if (this.fYn) {
            continue;
          }
          try
          {
            wait();
          }
          catch (InterruptedException localInterruptedException) {}
        }
        localThrowable1 = localThrowable1;
        vjm = true;
      }
      catch (Throwable localThrowable2)
      {
        for (;;)
        {
          vjm = true;
        }
      }
    }
  }
  
  public static SharedPreferences ba(Context paramContext, String paramString)
  {
    int j = 1;
    GMTrace.i(13736379154432L, 102344);
    if (a.bQq())
    {
      w.i("MicroMsg.MultiProcSharedPreferences", "sp: %s, use Flock version MultiProcessSP.", new Object[] { paramString });
      al localal = (al)vji.get(paramString);
      if (localal == null)
      {
        paramContext = new al(paramContext, paramString, 4);
        vji.put(paramString, paramContext);
      }
      for (;;)
      {
        GMTrace.o(13736379154432L, 102344);
        return paramContext;
        for (;;)
        {
          try
          {
            if (localal.vjc <= 0)
            {
              i = j;
              if (localal.vjd == localal.hJl.lastModified())
              {
                if (localal.vje != localal.hJl.length()) {
                  i = j;
                }
              }
              else
              {
                if (i != 0) {
                  break label154;
                }
                paramContext = localal;
                break;
              }
            }
          }
          finally {}
          int i = 0;
        }
        label154:
        localal.bQo();
        paramContext = localal;
      }
    }
    w.i("MicroMsg.MultiProcSharedPreferences", "sp: %s, use system sp.", new Object[] { paramString });
    paramContext = paramContext.getSharedPreferences(paramString, 4);
    GMTrace.o(13736379154432L, 102344);
    return paramContext;
  }
  
  public static void g(File paramFile, int paramInt)
  {
    boolean bool2 = false;
    GMTrace.i(16090021232640L, 119880);
    if ((paramInt & 0x1) == 0) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      paramFile.setReadable(true, bool1);
      bool1 = bool2;
      if ((paramInt & 0x2) == 0) {
        bool1 = true;
      }
      paramFile.setWritable(true, bool1);
      GMTrace.o(16090021232640L, 119880);
      return;
    }
  }
  
  public final boolean contains(String paramString)
  {
    GMTrace.i(13738258202624L, 102358);
    try
    {
      bQp();
      boolean bool = this.hOK.containsKey(paramString);
      GMTrace.o(13738258202624L, 102358);
      return bool;
    }
    finally {}
  }
  
  public final SharedPreferences.Editor edit()
  {
    GMTrace.i(13738392420352L, 102359);
    try
    {
      bQp();
      b localb = new b();
      GMTrace.o(13738392420352L, 102359);
      return localb;
    }
    finally {}
  }
  
  public final Map<String, ?> getAll()
  {
    GMTrace.i(13737318678528L, 102351);
    try
    {
      bQp();
      HashMap localHashMap = new HashMap(this.hOK);
      GMTrace.o(13737318678528L, 102351);
      return localHashMap;
    }
    finally {}
  }
  
  public final boolean getBoolean(String paramString, boolean paramBoolean)
  {
    GMTrace.i(13738123984896L, 102357);
    try
    {
      bQp();
      paramString = (Boolean)this.hOK.get(paramString);
      if (paramString != null) {
        paramBoolean = paramString.booleanValue();
      }
      GMTrace.o(13738123984896L, 102357);
      return paramBoolean;
    }
    finally {}
  }
  
  public final float getFloat(String paramString, float paramFloat)
  {
    GMTrace.i(13737989767168L, 102356);
    try
    {
      bQp();
      paramString = (Float)this.hOK.get(paramString);
      if (paramString != null) {
        paramFloat = paramString.floatValue();
      }
      GMTrace.o(13737989767168L, 102356);
      return paramFloat;
    }
    finally {}
  }
  
  public final int getInt(String paramString, int paramInt)
  {
    GMTrace.i(13737721331712L, 102354);
    try
    {
      bQp();
      paramString = (Integer)this.hOK.get(paramString);
      if (paramString != null) {
        paramInt = paramString.intValue();
      }
      GMTrace.o(13737721331712L, 102354);
      return paramInt;
    }
    finally {}
  }
  
  public final long getLong(String paramString, long paramLong)
  {
    GMTrace.i(13737855549440L, 102355);
    try
    {
      bQp();
      paramString = (Long)this.hOK.get(paramString);
      if (paramString != null) {
        paramLong = paramString.longValue();
      }
      GMTrace.o(13737855549440L, 102355);
      return paramLong;
    }
    finally {}
  }
  
  /* Error */
  public final String getString(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 422
    //   3: ldc_w 424
    //   6: invokestatic 71	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: invokespecial 353	com/tencent/mm/sdk/platformtools/al:bQp	()V
    //   15: aload_0
    //   16: getfield 112	com/tencent/mm/sdk/platformtools/al:hOK	Ljava/util/Map;
    //   19: aload_1
    //   20: invokeinterface 383 2 0
    //   25: checkcast 167	java/lang/String
    //   28: astore_1
    //   29: aload_1
    //   30: ifnull +16 -> 46
    //   33: aload_0
    //   34: monitorexit
    //   35: ldc2_w 422
    //   38: ldc_w 424
    //   41: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   44: aload_1
    //   45: areturn
    //   46: aload_2
    //   47: astore_1
    //   48: goto -15 -> 33
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	al
    //   0	56	1	paramString1	String
    //   0	56	2	paramString2	String
    // Exception table:
    //   from	to	target	type
    //   11	29	51	finally
    //   33	35	51	finally
    //   52	54	51	finally
  }
  
  /* Error */
  public final Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    // Byte code:
    //   0: ldc2_w 427
    //   3: ldc_w 429
    //   6: invokestatic 71	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: invokespecial 353	com/tencent/mm/sdk/platformtools/al:bQp	()V
    //   15: aload_0
    //   16: getfield 112	com/tencent/mm/sdk/platformtools/al:hOK	Ljava/util/Map;
    //   19: aload_1
    //   20: invokeinterface 383 2 0
    //   25: checkcast 431	java/util/Set
    //   28: astore_1
    //   29: aload_1
    //   30: ifnull +16 -> 46
    //   33: aload_0
    //   34: monitorexit
    //   35: ldc2_w 427
    //   38: ldc_w 429
    //   41: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   44: aload_1
    //   45: areturn
    //   46: aload_2
    //   47: astore_1
    //   48: goto -15 -> 33
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	al
    //   0	56	1	paramString	String
    //   0	56	2	paramSet	Set<String>
    // Exception table:
    //   from	to	target	type
    //   11	29	51	finally
    //   33	35	51	finally
    //   52	54	51	finally
  }
  
  public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    GMTrace.i(13736916025344L, 102348);
    try
    {
      this.vjh.put(paramOnSharedPreferenceChangeListener, vjg);
      GMTrace.o(13736916025344L, 102348);
      return;
    }
    finally {}
  }
  
  public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    GMTrace.i(13737050243072L, 102349);
    try
    {
      this.vjh.remove(paramOnSharedPreferenceChangeListener);
      GMTrace.o(13737050243072L, 102349);
      return;
    }
    finally {}
  }
  
  public static final class a
  {
    private static SharedPreferences mPref;
    public static String vjo;
    public static String vjp;
    
    static
    {
      GMTrace.i(13746982354944L, 102423);
      mPref = ab.getContext().getSharedPreferences("pref_MultiProcSP_dyncfg", 4);
      vjo = "pref_key_is_enable_MultiProcSP";
      vjp = "pref_key_is_disabled_MultiProcSP_manually";
      GMTrace.o(13746982354944L, 102423);
    }
    
    private static boolean RX(String paramString)
    {
      GMTrace.i(13746713919488L, 102421);
      SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("pref_MultiProcSP_dyncfg", 4);
      mPref = localSharedPreferences;
      if (localSharedPreferences == null)
      {
        w.w("MicroMsg.MultiProcSharedPreferences", "SharedPreferences in DynamicConfigStorage initialize failed.");
        GMTrace.o(13746713919488L, 102421);
        return false;
      }
      boolean bool = mPref.getBoolean(paramString, false);
      w.d("MicroMsg.MultiProcSharedPreferences", "DynamicConfigStorage, getValue:%b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(13746713919488L, 102421);
      return bool;
    }
    
    public static boolean bQq()
    {
      GMTrace.i(13746579701760L, 102420);
      if ((!RX(vjp)) && (RX(vjo)))
      {
        GMTrace.o(13746579701760L, 102420);
        return true;
      }
      GMTrace.o(13746579701760L, 102420);
      return false;
    }
    
    public static void kF(boolean paramBoolean)
    {
      GMTrace.i(13746445484032L, 102419);
      setValue(vjp, paramBoolean);
      GMTrace.o(13746445484032L, 102419);
    }
    
    public static void setValue(String paramString, boolean paramBoolean)
    {
      GMTrace.i(13746848137216L, 102422);
      if (mPref == null)
      {
        w.w("MicroMsg.MultiProcSharedPreferences", "SharedPreferences in DynamicConfigStorage initialize failed.");
        GMTrace.o(13746848137216L, 102422);
        return;
      }
      SharedPreferences.Editor localEditor = mPref.edit();
      localEditor.putBoolean(paramString, paramBoolean);
      localEditor.commit();
      GMTrace.o(13746848137216L, 102422);
    }
  }
  
  private final class b
    implements SharedPreferences.Editor
  {
    private final Map<String, Object> vjq;
    private boolean vjr;
    
    public b()
    {
      GMTrace.i(13773691682816L, 102622);
      this.vjq = new HashMap();
      this.vjr = false;
      GMTrace.o(13773691682816L, 102622);
    }
    
    private void a(final al.c paramc, Runnable arg2)
    {
      int j = 1;
      GMTrace.i(13775302295552L, 102634);
      paramc = new Runnable()
      {
        /* Error */
        public final void run()
        {
          // Byte code:
          //   0: ldc2_w 52
          //   3: ldc 54
          //   5: invokestatic 40	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   8: aload_0
          //   9: getfield 24	com/tencent/mm/sdk/platformtools/al$b$3:vjt	Lcom/tencent/mm/sdk/platformtools/al$b;
          //   12: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   15: getfield 62	com/tencent/mm/sdk/platformtools/al:vjf	Ljava/lang/Object;
          //   18: astore_2
          //   19: aload_2
          //   20: monitorenter
          //   21: aload_0
          //   22: getfield 24	com/tencent/mm/sdk/platformtools/al$b$3:vjt	Lcom/tencent/mm/sdk/platformtools/al$b;
          //   25: astore_3
          //   26: aload_0
          //   27: getfield 26	com/tencent/mm/sdk/platformtools/al$b$3:vjs	Lcom/tencent/mm/sdk/platformtools/al$c;
          //   30: astore 4
          //   32: aload_3
          //   33: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   36: getfield 66	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   39: istore_1
          //   40: iload_1
          //   41: ifeq +13 -> 54
          //   44: aload_3
          //   45: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   48: getfield 70	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   51: invokevirtual 75	com/tencent/mm/sdk/platformtools/FLock:bPz	()V
          //   54: aload_3
          //   55: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   58: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   61: invokevirtual 85	java/io/File:exists	()Z
          //   64: ifeq +280 -> 344
          //   67: aload_3
          //   68: monitorenter
          //   69: aload 4
          //   71: getfield 90	com/tencent/mm/sdk/platformtools/al$c:vjw	Z
          //   74: ifne +113 -> 187
          //   77: aload 4
          //   79: iconst_1
          //   80: invokevirtual 94	com/tencent/mm/sdk/platformtools/al$c:kG	(Z)V
          //   83: aload_3
          //   84: monitorexit
          //   85: aload_3
          //   86: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   89: getfield 66	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   92: istore_1
          //   93: iload_1
          //   94: ifeq +13 -> 107
          //   97: aload_3
          //   98: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   101: getfield 70	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   104: invokevirtual 97	com/tencent/mm/sdk/platformtools/FLock:unlock	()V
          //   107: aload_2
          //   108: monitorexit
          //   109: aload_0
          //   110: getfield 24	com/tencent/mm/sdk/platformtools/al$b$3:vjt	Lcom/tencent/mm/sdk/platformtools/al$b;
          //   113: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   116: astore_2
          //   117: aload_2
          //   118: monitorenter
          //   119: aload_0
          //   120: getfield 24	com/tencent/mm/sdk/platformtools/al$b$3:vjt	Lcom/tencent/mm/sdk/platformtools/al$b;
          //   123: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   126: astore_3
          //   127: aload_3
          //   128: aload_3
          //   129: getfield 101	com/tencent/mm/sdk/platformtools/al:vjc	I
          //   132: iconst_1
          //   133: isub
          //   134: putfield 101	com/tencent/mm/sdk/platformtools/al:vjc	I
          //   137: aload_2
          //   138: monitorexit
          //   139: aload_0
          //   140: getfield 28	com/tencent/mm/sdk/platformtools/al$b$3:vjv	Ljava/lang/Runnable;
          //   143: ifnull +12 -> 155
          //   146: aload_0
          //   147: getfield 28	com/tencent/mm/sdk/platformtools/al$b$3:vjv	Ljava/lang/Runnable;
          //   150: invokeinterface 103 1 0
          //   155: ldc2_w 52
          //   158: ldc 54
          //   160: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   163: return
          //   164: astore 5
          //   166: ldc 105
          //   168: aload 5
          //   170: ldc 107
          //   172: iconst_0
          //   173: anewarray 4	java/lang/Object
          //   176: invokestatic 113	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   179: goto -125 -> 54
          //   182: astore_3
          //   183: aload_2
          //   184: monitorexit
          //   185: aload_3
          //   186: athrow
          //   187: aload_3
          //   188: monitorexit
          //   189: aload_3
          //   190: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   193: getfield 116	com/tencent/mm/sdk/platformtools/al:vja	Ljava/io/File;
          //   196: invokevirtual 85	java/io/File:exists	()Z
          //   199: ifne +134 -> 333
          //   202: aload_3
          //   203: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   206: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   209: aload_3
          //   210: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   213: getfield 116	com/tencent/mm/sdk/platformtools/al:vja	Ljava/io/File;
          //   216: invokevirtual 120	java/io/File:renameTo	(Ljava/io/File;)Z
          //   219: ifne +125 -> 344
          //   222: ldc 105
          //   224: new 122	java/lang/StringBuilder
          //   227: dup
          //   228: ldc 124
          //   230: invokespecial 127	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   233: aload_3
          //   234: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   237: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   240: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   243: ldc -123
          //   245: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   248: aload_3
          //   249: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   252: getfield 116	com/tencent/mm/sdk/platformtools/al:vja	Ljava/io/File;
          //   255: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   258: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   261: invokestatic 144	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
          //   264: aload 4
          //   266: iconst_0
          //   267: invokevirtual 94	com/tencent/mm/sdk/platformtools/al$c:kG	(Z)V
          //   270: aload_3
          //   271: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   274: getfield 66	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   277: istore_1
          //   278: iload_1
          //   279: ifeq -172 -> 107
          //   282: aload_3
          //   283: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   286: getfield 70	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   289: invokevirtual 97	com/tencent/mm/sdk/platformtools/FLock:unlock	()V
          //   292: goto -185 -> 107
          //   295: astore_3
          //   296: goto -189 -> 107
          //   299: astore 4
          //   301: aload_3
          //   302: monitorexit
          //   303: aload 4
          //   305: athrow
          //   306: astore 4
          //   308: aload_3
          //   309: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   312: getfield 66	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   315: istore_1
          //   316: iload_1
          //   317: ifeq +13 -> 330
          //   320: aload_3
          //   321: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   324: getfield 70	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   327: invokevirtual 97	com/tencent/mm/sdk/platformtools/FLock:unlock	()V
          //   330: aload 4
          //   332: athrow
          //   333: aload_3
          //   334: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   337: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   340: invokevirtual 147	java/io/File:delete	()Z
          //   343: pop
          //   344: aload_3
          //   345: aload_3
          //   346: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   349: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   352: invokevirtual 151	com/tencent/mm/sdk/platformtools/al$b:A	(Ljava/io/File;)Ljava/io/FileOutputStream;
          //   355: astore 5
          //   357: aload 5
          //   359: ifnonnull +38 -> 397
          //   362: aload 4
          //   364: iconst_0
          //   365: invokevirtual 94	com/tencent/mm/sdk/platformtools/al$c:kG	(Z)V
          //   368: aload_3
          //   369: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   372: getfield 66	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   375: istore_1
          //   376: iload_1
          //   377: ifeq -270 -> 107
          //   380: aload_3
          //   381: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   384: getfield 70	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   387: invokevirtual 97	com/tencent/mm/sdk/platformtools/FLock:unlock	()V
          //   390: goto -283 -> 107
          //   393: astore_3
          //   394: goto -287 -> 107
          //   397: aload 4
          //   399: getfield 155	com/tencent/mm/sdk/platformtools/al$c:vjy	Ljava/util/Map;
          //   402: astore 6
          //   404: invokestatic 161	android/util/Xml:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
          //   407: astore 7
          //   409: aload 7
          //   411: aload 5
          //   413: ldc -93
          //   415: invokeinterface 169 3 0
          //   420: aload 7
          //   422: aconst_null
          //   423: iconst_1
          //   424: invokestatic 175	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
          //   427: invokeinterface 179 3 0
          //   432: aload 7
          //   434: ldc -75
          //   436: iconst_1
          //   437: invokeinterface 185 3 0
          //   442: aload 6
          //   444: aconst_null
          //   445: aload 7
          //   447: invokestatic 190	com/tencent/mm/sdk/platformtools/bi:a	(Ljava/util/Map;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;)V
          //   450: aload 7
          //   452: invokeinterface 193 1 0
          //   457: aload 5
          //   459: invokevirtual 199	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
          //   462: invokevirtual 204	java/io/FileDescriptor:sync	()V
          //   465: aload 5
          //   467: invokevirtual 207	java/io/FileOutputStream:close	()V
          //   470: aload_3
          //   471: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   474: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   477: aload_3
          //   478: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   481: getfield 210	com/tencent/mm/sdk/platformtools/al:mMode	I
          //   484: invokestatic 214	com/tencent/mm/sdk/platformtools/al:g	(Ljava/io/File;I)V
          //   487: aload_3
          //   488: monitorenter
          //   489: aload_3
          //   490: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   493: aload_3
          //   494: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   497: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   500: invokevirtual 218	java/io/File:lastModified	()J
          //   503: putfield 222	com/tencent/mm/sdk/platformtools/al:vjd	J
          //   506: aload_3
          //   507: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   510: aload_3
          //   511: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   514: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   517: invokevirtual 225	java/io/File:length	()J
          //   520: putfield 228	com/tencent/mm/sdk/platformtools/al:vje	J
          //   523: aload_3
          //   524: monitorexit
          //   525: aload_3
          //   526: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   529: getfield 116	com/tencent/mm/sdk/platformtools/al:vja	Ljava/io/File;
          //   532: invokevirtual 147	java/io/File:delete	()Z
          //   535: pop
          //   536: aload 4
          //   538: iconst_1
          //   539: invokevirtual 94	com/tencent/mm/sdk/platformtools/al$c:kG	(Z)V
          //   542: aload_3
          //   543: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   546: getfield 66	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   549: istore_1
          //   550: iload_1
          //   551: ifeq -444 -> 107
          //   554: aload_3
          //   555: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   558: getfield 70	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   561: invokevirtual 97	com/tencent/mm/sdk/platformtools/FLock:unlock	()V
          //   564: goto -457 -> 107
          //   567: astore_3
          //   568: goto -461 -> 107
          //   571: astore 5
          //   573: aload_3
          //   574: monitorexit
          //   575: aload 5
          //   577: athrow
          //   578: astore 5
          //   580: ldc 105
          //   582: ldc -26
          //   584: iconst_1
          //   585: anewarray 4	java/lang/Object
          //   588: dup
          //   589: iconst_0
          //   590: aload 5
          //   592: aastore
          //   593: invokestatic 234	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   596: aload_3
          //   597: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   600: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   603: invokevirtual 85	java/io/File:exists	()Z
          //   606: ifeq +43 -> 649
          //   609: aload_3
          //   610: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   613: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   616: invokevirtual 147	java/io/File:delete	()Z
          //   619: ifne +30 -> 649
          //   622: ldc 105
          //   624: new 122	java/lang/StringBuilder
          //   627: dup
          //   628: ldc -20
          //   630: invokespecial 127	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   633: aload_3
          //   634: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   637: getfield 79	com/tencent/mm/sdk/platformtools/al:hJl	Ljava/io/File;
          //   640: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   643: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   646: invokestatic 144	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
          //   649: aload 4
          //   651: iconst_0
          //   652: invokevirtual 94	com/tencent/mm/sdk/platformtools/al$c:kG	(Z)V
          //   655: aload_3
          //   656: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   659: getfield 66	com/tencent/mm/sdk/platformtools/al:vjb	Z
          //   662: istore_1
          //   663: iload_1
          //   664: ifeq -557 -> 107
          //   667: aload_3
          //   668: getfield 58	com/tencent/mm/sdk/platformtools/al$b:vjn	Lcom/tencent/mm/sdk/platformtools/al;
          //   671: getfield 70	com/tencent/mm/sdk/platformtools/al:viZ	Lcom/tencent/mm/sdk/platformtools/FLock;
          //   674: invokevirtual 97	com/tencent/mm/sdk/platformtools/FLock:unlock	()V
          //   677: goto -570 -> 107
          //   680: astore_3
          //   681: goto -574 -> 107
          //   684: astore 5
          //   686: ldc 105
          //   688: ldc -26
          //   690: iconst_1
          //   691: anewarray 4	java/lang/Object
          //   694: dup
          //   695: iconst_0
          //   696: aload 5
          //   698: aastore
          //   699: invokestatic 234	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   702: goto -106 -> 596
          //   705: astore_3
          //   706: aload_2
          //   707: monitorexit
          //   708: aload_3
          //   709: athrow
          //   710: astore_3
          //   711: goto -381 -> 330
          //   714: astore_3
          //   715: goto -608 -> 107
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	718	0	this	3
          //   39	625	1	bool	boolean
          //   25	104	3	localObject2	Object
          //   182	101	3	localObject3	Object
          //   295	86	3	localException1	Exception
          //   393	162	3	localException2	Exception
          //   567	101	3	localException3	Exception
          //   680	1	3	localException4	Exception
          //   705	4	3	localObject4	Object
          //   710	1	3	localException5	Exception
          //   714	1	3	localException6	Exception
          //   30	235	4	localc	al.c
          //   299	5	4	localObject5	Object
          //   306	344	4	localObject6	Object
          //   164	5	5	localException7	Exception
          //   355	111	5	localFileOutputStream	FileOutputStream
          //   571	5	5	localObject7	Object
          //   578	13	5	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
          //   684	13	5	localIOException	java.io.IOException
          //   402	41	6	localMap	Map
          //   407	44	7	localXmlSerializer	org.xmlpull.v1.XmlSerializer
          // Exception table:
          //   from	to	target	type
          //   44	54	164	java/lang/Exception
          //   21	40	182	finally
          //   44	54	182	finally
          //   85	93	182	finally
          //   97	107	182	finally
          //   107	109	182	finally
          //   166	179	182	finally
          //   183	185	182	finally
          //   270	278	182	finally
          //   282	292	182	finally
          //   308	316	182	finally
          //   320	330	182	finally
          //   330	333	182	finally
          //   368	376	182	finally
          //   380	390	182	finally
          //   542	550	182	finally
          //   554	564	182	finally
          //   655	663	182	finally
          //   667	677	182	finally
          //   282	292	295	java/lang/Exception
          //   69	85	299	finally
          //   187	189	299	finally
          //   301	303	299	finally
          //   54	69	306	finally
          //   189	270	306	finally
          //   303	306	306	finally
          //   333	344	306	finally
          //   344	357	306	finally
          //   362	368	306	finally
          //   397	489	306	finally
          //   525	542	306	finally
          //   575	578	306	finally
          //   580	596	306	finally
          //   596	649	306	finally
          //   649	655	306	finally
          //   686	702	306	finally
          //   380	390	393	java/lang/Exception
          //   554	564	567	java/lang/Exception
          //   489	525	571	finally
          //   573	575	571	finally
          //   344	357	578	org/xmlpull/v1/XmlPullParserException
          //   362	368	578	org/xmlpull/v1/XmlPullParserException
          //   397	489	578	org/xmlpull/v1/XmlPullParserException
          //   525	542	578	org/xmlpull/v1/XmlPullParserException
          //   575	578	578	org/xmlpull/v1/XmlPullParserException
          //   667	677	680	java/lang/Exception
          //   344	357	684	java/io/IOException
          //   362	368	684	java/io/IOException
          //   397	489	684	java/io/IOException
          //   525	542	684	java/io/IOException
          //   575	578	684	java/io/IOException
          //   119	139	705	finally
          //   706	708	705	finally
          //   320	330	710	java/lang/Exception
          //   97	107	714	java/lang/Exception
        }
      };
      int i;
      if (??? == null) {
        i = 1;
      }
      while (i != 0) {
        synchronized (al.this)
        {
          if (al.this.vjc == 1)
          {
            i = j;
            if (i != 0)
            {
              paramc.run();
              GMTrace.o(13775302295552L, 102634);
              return;
              i = 0;
            }
          }
          else
          {
            i = 0;
          }
        }
      }
      as.bQv().execute(paramc);
      GMTrace.o(13775302295552L, 102634);
    }
    
    private al.c bQr()
    {
      GMTrace.i(13775168077824L, 102633);
      al.c localc1 = new al.c();
      for (;;)
      {
        Object localObject3;
        String str;
        synchronized (al.this)
        {
          if (al.this.vjc > 0) {
            al.this.hOK = new HashMap(al.this.hOK);
          }
          localc1.vjy = al.this.hOK;
          Object localObject2 = al.this;
          ((al)localObject2).vjc += 1;
          if (al.this.vjh.size() > 0)
          {
            i = 1;
            if (i != 0)
            {
              localc1.vjx = new ArrayList();
              localc1.fMZ = new HashSet(al.this.vjh.keySet());
            }
            try
            {
              if (this.vjr)
              {
                if (!al.this.hOK.isEmpty())
                {
                  localc1.vjw = true;
                  al.this.hOK.clear();
                }
                this.vjr = false;
              }
              localObject2 = this.vjq.entrySet().iterator();
              if (!((Iterator)localObject2).hasNext()) {
                break;
              }
              localObject3 = (Map.Entry)((Iterator)localObject2).next();
              str = (String)((Map.Entry)localObject3).getKey();
              localObject3 = ((Map.Entry)localObject3).getValue();
              if (localObject3 != this) {
                break label316;
              }
              if (!al.this.hOK.containsKey(str)) {
                continue;
              }
              al.this.hOK.remove(str);
              localc1.vjw = true;
              if (i == 0) {
                continue;
              }
              localc1.vjx.add(str);
              continue;
              localc2 = finally;
            }
            finally {}
          }
        }
        int i = 0;
        continue;
        label316:
        if (al.this.hOK.containsKey(str))
        {
          Object localObject4 = al.this.hOK.get(str);
          if ((localObject4 != null) && (localObject4.equals(localObject3))) {}
        }
        else
        {
          al.this.hOK.put(str, localObject3);
        }
      }
      this.vjq.clear();
      GMTrace.o(13775168077824L, 102633);
      return localc2;
    }
    
    final FileOutputStream A(File paramFile)
    {
      GMTrace.i(13775436513280L, 102635);
      try
      {
        FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
        paramFile = localFileOutputStream;
      }
      catch (FileNotFoundException localFileNotFoundException1)
      {
        for (;;)
        {
          Object localObject = paramFile.getParentFile();
          if (!((File)localObject).mkdir())
          {
            w.e("MicroMsg.MultiProcSharedPreferences", "Couldn't create directory for SharedPreferences file " + paramFile);
            GMTrace.o(13775436513280L, 102635);
            return null;
          }
          al.g((File)localObject, al.this.mMode);
          try
          {
            localObject = new FileOutputStream(paramFile);
            paramFile = (File)localObject;
          }
          catch (FileNotFoundException localFileNotFoundException2)
          {
            w.e("MicroMsg.MultiProcSharedPreferences", "Couldn't create SharedPreferences file " + paramFile, new Object[] { localFileNotFoundException2 });
            paramFile = null;
          }
        }
      }
      GMTrace.o(13775436513280L, 102635);
      return paramFile;
    }
    
    public final void a(final al.c paramc)
    {
      GMTrace.i(13775570731008L, 102636);
      if ((paramc.fMZ == null) || (paramc.vjx == null) || (paramc.vjx.size() == 0))
      {
        GMTrace.o(13775570731008L, 102636);
        return;
      }
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        int i = paramc.vjx.size() - 1;
        while (i >= 0)
        {
          String str = (String)paramc.vjx.get(i);
          Iterator localIterator = paramc.fMZ.iterator();
          while (localIterator.hasNext())
          {
            SharedPreferences.OnSharedPreferenceChangeListener localOnSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener)localIterator.next();
            if (localOnSharedPreferenceChangeListener != null) {
              localOnSharedPreferenceChangeListener.onSharedPreferenceChanged(al.this, str);
            }
          }
          i -= 1;
        }
        GMTrace.o(13775570731008L, 102636);
        return;
      }
      al.viY.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13746311266304L, 102418);
          al.b.this.a(paramc);
          GMTrace.o(13746311266304L, 102418);
        }
      });
      GMTrace.o(13775570731008L, 102636);
    }
    
    public final void apply()
    {
      GMTrace.i(13775033860096L, 102632);
      final al.c localc = bQr();
      final Runnable local1 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13741345210368L, 102381);
          try
          {
            localc.vjz.await();
            GMTrace.o(13741345210368L, 102381);
            return;
          }
          catch (InterruptedException localInterruptedException)
          {
            GMTrace.o(13741345210368L, 102381);
          }
        }
      };
      as.H(local1);
      a(localc, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13768322973696L, 102582);
          local1.run();
          as.I(local1);
          GMTrace.o(13768322973696L, 102582);
        }
      });
      a(localc);
      GMTrace.o(13775033860096L, 102632);
    }
    
    public final SharedPreferences.Editor clear()
    {
      GMTrace.i(13774765424640L, 102630);
      try
      {
        this.vjr = true;
        GMTrace.o(13774765424640L, 102630);
        return this;
      }
      finally {}
    }
    
    public final boolean commit()
    {
      GMTrace.i(13774899642368L, 102631);
      al.c localc = bQr();
      a(localc, null);
      try
      {
        localc.vjz.await();
        a(localc);
        boolean bool = localc.vjA;
        GMTrace.o(13774899642368L, 102631);
        return bool;
      }
      catch (InterruptedException localInterruptedException)
      {
        GMTrace.o(13774899642368L, 102631);
      }
      return false;
    }
    
    public final SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
    {
      GMTrace.i(13774496989184L, 102628);
      try
      {
        this.vjq.put(paramString, Boolean.valueOf(paramBoolean));
        GMTrace.o(13774496989184L, 102628);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putFloat(String paramString, float paramFloat)
    {
      GMTrace.i(13774362771456L, 102627);
      try
      {
        this.vjq.put(paramString, Float.valueOf(paramFloat));
        GMTrace.o(13774362771456L, 102627);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putInt(String paramString, int paramInt)
    {
      GMTrace.i(13774094336000L, 102625);
      try
      {
        this.vjq.put(paramString, Integer.valueOf(paramInt));
        GMTrace.o(13774094336000L, 102625);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putLong(String paramString, long paramLong)
    {
      GMTrace.i(13774228553728L, 102626);
      try
      {
        this.vjq.put(paramString, Long.valueOf(paramLong));
        GMTrace.o(13774228553728L, 102626);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putString(String paramString1, String paramString2)
    {
      GMTrace.i(13773825900544L, 102623);
      try
      {
        this.vjq.put(paramString1, paramString2);
        GMTrace.o(13773825900544L, 102623);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
    {
      GMTrace.i(13773960118272L, 102624);
      try
      {
        this.vjq.put(paramString, paramSet);
        GMTrace.o(13773960118272L, 102624);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor remove(String paramString)
    {
      GMTrace.i(13774631206912L, 102629);
      try
      {
        this.vjq.put(paramString, this);
        GMTrace.o(13774631206912L, 102629);
        return this;
      }
      finally {}
    }
  }
  
  private static final class c
  {
    public Set<SharedPreferences.OnSharedPreferenceChangeListener> fMZ;
    public volatile boolean vjA;
    public boolean vjw;
    public List<String> vjx;
    public Map<String, Object> vjy;
    public final CountDownLatch vjz;
    
    public c()
    {
      GMTrace.i(13745774395392L, 102414);
      this.vjw = false;
      this.vjx = null;
      this.fMZ = null;
      this.vjy = null;
      this.vjz = new CountDownLatch(1);
      this.vjA = false;
      GMTrace.o(13745774395392L, 102414);
    }
    
    public final void kG(boolean paramBoolean)
    {
      GMTrace.i(13745908613120L, 102415);
      this.vjA = paramBoolean;
      this.vjz.countDown();
      GMTrace.o(13745908613120L, 102415);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */