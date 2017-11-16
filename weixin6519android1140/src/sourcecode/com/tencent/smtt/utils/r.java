package com.tencent.smtt.utils;

import android.content.Context;
import java.io.File;

public final class r
{
  private static r xZh = null;
  private Context mContext = null;
  private File xYV = null;
  public boolean xZf = false;
  private boolean xZg = false;
  private File xZi = null;
  
  private r(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
    cps();
  }
  
  /* Error */
  private void cps()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 33	com/tencent/smtt/utils/r:xZi	Ljava/io/File;
    //   8: ifnonnull +11 -> 19
    //   11: aload_0
    //   12: aload_0
    //   13: invokespecial 50	com/tencent/smtt/utils/r:cpt	()Ljava/io/File;
    //   16: putfield 33	com/tencent/smtt/utils/r:xZi	Ljava/io/File;
    //   19: aload_0
    //   20: getfield 33	com/tencent/smtt/utils/r:xZi	Ljava/io/File;
    //   23: astore_1
    //   24: aload_1
    //   25: ifnonnull +6 -> 31
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: new 52	java/io/BufferedInputStream
    //   34: dup
    //   35: new 54	java/io/FileInputStream
    //   38: dup
    //   39: aload_0
    //   40: getfield 33	com/tencent/smtt/utils/r:xZi	Ljava/io/File;
    //   43: invokespecial 57	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   46: invokespecial 60	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   49: astore_1
    //   50: new 62	java/util/Properties
    //   53: dup
    //   54: invokespecial 63	java/util/Properties:<init>	()V
    //   57: astore_2
    //   58: aload_2
    //   59: aload_1
    //   60: invokevirtual 66	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   63: aload_2
    //   64: ldc 68
    //   66: ldc 70
    //   68: invokevirtual 74	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   71: astore_2
    //   72: ldc 70
    //   74: aload_2
    //   75: invokevirtual 80	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   78: ifne +11 -> 89
    //   81: aload_0
    //   82: aload_2
    //   83: invokestatic 86	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   86: putfield 29	com/tencent/smtt/utils/r:xZf	Z
    //   89: aload_1
    //   90: invokevirtual 89	java/io/BufferedInputStream:close	()V
    //   93: goto -65 -> 28
    //   96: astore_1
    //   97: goto -69 -> 28
    //   100: astore_1
    //   101: aload_2
    //   102: astore_1
    //   103: aload_1
    //   104: ifnull -76 -> 28
    //   107: aload_1
    //   108: invokevirtual 89	java/io/BufferedInputStream:close	()V
    //   111: goto -83 -> 28
    //   114: astore_1
    //   115: goto -87 -> 28
    //   118: astore_2
    //   119: aconst_null
    //   120: astore_1
    //   121: aload_1
    //   122: ifnull +7 -> 129
    //   125: aload_1
    //   126: invokevirtual 89	java/io/BufferedInputStream:close	()V
    //   129: aload_2
    //   130: athrow
    //   131: astore_1
    //   132: aload_0
    //   133: monitorexit
    //   134: aload_1
    //   135: athrow
    //   136: astore_1
    //   137: goto -8 -> 129
    //   140: astore_2
    //   141: goto -20 -> 121
    //   144: astore_2
    //   145: goto -42 -> 103
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	r
    //   23	67	1	localObject1	Object
    //   96	1	1	localException1	Exception
    //   100	1	1	localThrowable1	Throwable
    //   102	6	1	localObject2	Object
    //   114	1	1	localException2	Exception
    //   120	6	1	localObject3	Object
    //   131	4	1	localObject4	Object
    //   136	1	1	localException3	Exception
    //   3	99	2	localObject5	Object
    //   118	12	2	localObject6	Object
    //   140	1	2	localObject7	Object
    //   144	1	2	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   89	93	96	java/lang/Exception
    //   4	19	100	java/lang/Throwable
    //   19	24	100	java/lang/Throwable
    //   31	50	100	java/lang/Throwable
    //   107	111	114	java/lang/Exception
    //   4	19	118	finally
    //   19	24	118	finally
    //   31	50	118	finally
    //   89	93	131	finally
    //   107	111	131	finally
    //   125	129	131	finally
    //   129	131	131	finally
    //   125	129	136	java/lang/Exception
    //   50	89	140	finally
    //   50	89	144	java/lang/Throwable
  }
  
  private File cpt()
  {
    try
    {
      if (this.xYV == null)
      {
        this.xYV = new File(this.mContext.getDir("tbs", 0), "core_private");
        if (this.xYV == null) {
          break label87;
        }
        if (!this.xYV.isDirectory()) {
          return null;
        }
      }
      File localFile2 = new File(this.xYV, "debug.conf");
      localFile1 = localFile2;
      if (!localFile2.exists())
      {
        localFile2.createNewFile();
        localFile1 = localFile2;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        File localFile1;
        Object localObject = null;
      }
    }
    return localFile1;
    label87:
    return null;
  }
  
  public static r cpu()
  {
    try
    {
      r localr = xZh;
      return localr;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static r hB(Context paramContext)
  {
    try
    {
      if (xZh == null) {
        xZh = new r(paramContext);
      }
      paramContext = xZh;
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  public final void na(boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_0
    //   6: iload_1
    //   7: putfield 31	com/tencent/smtt/utils/r:xZg	Z
    //   10: aload_0
    //   11: invokespecial 50	com/tencent/smtt/utils/r:cpt	()Ljava/io/File;
    //   14: astore 5
    //   16: aload 5
    //   18: ifnonnull +19 -> 37
    //   21: new 124	java/lang/NullPointerException
    //   24: dup
    //   25: invokespecial 125	java/lang/NullPointerException:<init>	()V
    //   28: athrow
    //   29: new 124	java/lang/NullPointerException
    //   32: dup
    //   33: invokespecial 125	java/lang/NullPointerException:<init>	()V
    //   36: athrow
    //   37: new 52	java/io/BufferedInputStream
    //   40: dup
    //   41: new 54	java/io/FileInputStream
    //   44: dup
    //   45: aload 5
    //   47: invokespecial 57	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   50: invokespecial 60	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   53: astore_2
    //   54: new 62	java/util/Properties
    //   57: dup
    //   58: invokespecial 63	java/util/Properties:<init>	()V
    //   61: astore 6
    //   63: aload 6
    //   65: aload_2
    //   66: invokevirtual 66	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   69: aload 6
    //   71: ldc 68
    //   73: aload_0
    //   74: getfield 29	com/tencent/smtt/utils/r:xZf	Z
    //   77: invokestatic 129	java/lang/Boolean:toString	(Z)Ljava/lang/String;
    //   80: invokevirtual 133	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   83: pop
    //   84: aload 6
    //   86: ldc -121
    //   88: aload_0
    //   89: getfield 31	com/tencent/smtt/utils/r:xZg	Z
    //   92: invokestatic 129	java/lang/Boolean:toString	(Z)Ljava/lang/String;
    //   95: invokevirtual 133	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   98: pop
    //   99: new 137	java/io/BufferedOutputStream
    //   102: dup
    //   103: new 139	java/io/FileOutputStream
    //   106: dup
    //   107: aload 5
    //   109: invokespecial 140	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   112: invokespecial 143	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   115: astore_3
    //   116: aload 6
    //   118: aload_3
    //   119: aconst_null
    //   120: invokevirtual 147	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   123: aload_2
    //   124: invokevirtual 89	java/io/BufferedInputStream:close	()V
    //   127: aload_3
    //   128: invokevirtual 148	java/io/BufferedOutputStream:close	()V
    //   131: return
    //   132: astore_2
    //   133: return
    //   134: astore_2
    //   135: aconst_null
    //   136: astore_2
    //   137: aload_3
    //   138: invokevirtual 89	java/io/BufferedInputStream:close	()V
    //   141: aload_2
    //   142: invokevirtual 148	java/io/BufferedOutputStream:close	()V
    //   145: return
    //   146: astore_2
    //   147: return
    //   148: astore_3
    //   149: aconst_null
    //   150: astore_2
    //   151: aload_2
    //   152: invokevirtual 89	java/io/BufferedInputStream:close	()V
    //   155: aload 4
    //   157: invokevirtual 148	java/io/BufferedOutputStream:close	()V
    //   160: aload_3
    //   161: athrow
    //   162: astore_2
    //   163: goto -134 -> 29
    //   166: astore_2
    //   167: return
    //   168: astore_2
    //   169: goto -42 -> 127
    //   172: astore_3
    //   173: goto -32 -> 141
    //   176: astore_2
    //   177: goto -22 -> 155
    //   180: astore_2
    //   181: goto -21 -> 160
    //   184: astore_3
    //   185: goto -34 -> 151
    //   188: astore 5
    //   190: aload_3
    //   191: astore 4
    //   193: aload 5
    //   195: astore_3
    //   196: goto -45 -> 151
    //   199: astore_3
    //   200: aconst_null
    //   201: astore 4
    //   203: aload_2
    //   204: astore_3
    //   205: aload 4
    //   207: astore_2
    //   208: goto -71 -> 137
    //   211: astore 4
    //   213: aload_2
    //   214: astore 4
    //   216: aload_3
    //   217: astore_2
    //   218: aload 4
    //   220: astore_3
    //   221: goto -84 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	this	r
    //   0	224	1	paramBoolean	boolean
    //   53	71	2	localBufferedInputStream	java.io.BufferedInputStream
    //   132	1	2	localException1	Exception
    //   134	1	2	localThrowable1	Throwable
    //   136	6	2	localObject1	Object
    //   146	1	2	localException2	Exception
    //   150	2	2	localObject2	Object
    //   162	1	2	localException3	Exception
    //   166	1	2	localException4	Exception
    //   168	1	2	localException5	Exception
    //   176	1	2	localException6	Exception
    //   180	24	2	localException7	Exception
    //   207	11	2	localObject3	Object
    //   4	134	3	localBufferedOutputStream	java.io.BufferedOutputStream
    //   148	13	3	localObject4	Object
    //   172	1	3	localException8	Exception
    //   184	7	3	localObject5	Object
    //   195	1	3	localObject6	Object
    //   199	1	3	localThrowable2	Throwable
    //   204	17	3	localObject7	Object
    //   1	205	4	localObject8	Object
    //   211	1	4	localThrowable3	Throwable
    //   214	5	4	localObject9	Object
    //   14	94	5	localFile	File
    //   188	6	5	localObject10	Object
    //   61	56	6	localProperties	java.util.Properties
    // Exception table:
    //   from	to	target	type
    //   127	131	132	java/lang/Exception
    //   10	16	134	java/lang/Throwable
    //   37	54	134	java/lang/Throwable
    //   141	145	146	java/lang/Exception
    //   10	16	148	finally
    //   37	54	148	finally
    //   21	29	162	java/lang/Exception
    //   29	37	166	java/lang/Exception
    //   123	127	168	java/lang/Exception
    //   137	141	172	java/lang/Exception
    //   151	155	176	java/lang/Exception
    //   155	160	180	java/lang/Exception
    //   54	116	184	finally
    //   116	123	188	finally
    //   54	116	199	java/lang/Throwable
    //   116	123	211	java/lang/Throwable
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */