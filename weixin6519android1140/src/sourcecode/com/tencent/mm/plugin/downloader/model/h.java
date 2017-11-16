package com.tencent.mm.plugin.downloader.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.downloader.e.a;

public final class h
{
  public static a b(g paramg)
  {
    GMTrace.i(18599892746240L, 138580);
    a locala = new a();
    locala.field_downloadUrl = paramg.hJF;
    locala.field_secondaryUrl = paramg.kfp;
    locala.field_fileSize = paramg.kfq;
    locala.field_downloadUrlHashCode = paramg.hJF.hashCode();
    locala.field_fileName = paramg.mFileName;
    locala.field_fileType = paramg.kfs;
    locala.field_md5 = paramg.kfr;
    locala.field_appId = paramg.hyD;
    locala.field_autoInstall = paramg.kft;
    locala.field_showNotification = paramg.kfu;
    locala.field_packageName = paramg.mPackageName;
    locala.field_autoDownload = paramg.kfw;
    locala.field_scene = paramg.gRb;
    GMTrace.o(18599892746240L, 138580);
    return locala;
  }
  
  /* Error */
  public static String vC(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 117
    //   3: ldc 119
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aconst_null
    //   9: astore_2
    //   10: aconst_null
    //   11: astore_3
    //   12: new 121	java/net/URL
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 124	java/net/URL:<init>	(Ljava/lang/String;)V
    //   20: invokevirtual 128	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   23: checkcast 130	java/net/HttpURLConnection
    //   26: astore_0
    //   27: aload_0
    //   28: ifnull +67 -> 95
    //   31: aload_0
    //   32: sipush 1000
    //   35: invokevirtual 134	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   38: aload_0
    //   39: iconst_0
    //   40: invokevirtual 138	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   43: aload_0
    //   44: invokevirtual 141	java/net/HttpURLConnection:getResponseCode	()I
    //   47: istore_1
    //   48: aload_0
    //   49: ldc -113
    //   51: invokevirtual 146	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   54: astore_2
    //   55: ldc -108
    //   57: ldc -106
    //   59: iconst_2
    //   60: anewarray 4	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: iload_1
    //   66: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: aload_2
    //   73: aastore
    //   74: invokestatic 161	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: aload_0
    //   78: ifnull +7 -> 85
    //   81: aload_0
    //   82: invokevirtual 164	java/net/HttpURLConnection:disconnect	()V
    //   85: ldc2_w 117
    //   88: ldc 119
    //   90: invokestatic 111	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   93: aload_2
    //   94: areturn
    //   95: aload_0
    //   96: ifnull +7 -> 103
    //   99: aload_0
    //   100: invokevirtual 164	java/net/HttpURLConnection:disconnect	()V
    //   103: ldc2_w 117
    //   106: ldc 119
    //   108: invokestatic 111	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   111: ldc -90
    //   113: areturn
    //   114: astore_2
    //   115: aload_3
    //   116: astore_0
    //   117: aload_2
    //   118: astore_3
    //   119: aload_0
    //   120: astore_2
    //   121: ldc -108
    //   123: ldc -88
    //   125: iconst_1
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload_3
    //   132: invokevirtual 172	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   135: aastore
    //   136: invokestatic 175	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: aload_0
    //   140: ifnull -37 -> 103
    //   143: aload_0
    //   144: invokevirtual 164	java/net/HttpURLConnection:disconnect	()V
    //   147: goto -44 -> 103
    //   150: astore_3
    //   151: aload_2
    //   152: astore_0
    //   153: aload_3
    //   154: astore_2
    //   155: aload_0
    //   156: ifnull +7 -> 163
    //   159: aload_0
    //   160: invokevirtual 164	java/net/HttpURLConnection:disconnect	()V
    //   163: aload_2
    //   164: athrow
    //   165: astore_2
    //   166: goto -11 -> 155
    //   169: astore_3
    //   170: goto -51 -> 119
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	paramString	String
    //   47	19	1	i	int
    //   9	85	2	str	String
    //   114	4	2	localException1	Exception
    //   120	44	2	localObject1	Object
    //   165	1	2	localObject2	Object
    //   11	121	3	localException2	Exception
    //   150	4	3	localObject3	Object
    //   169	1	3	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   12	27	114	java/lang/Exception
    //   12	27	150	finally
    //   121	139	150	finally
    //   31	77	165	finally
    //   31	77	169	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */