package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 278;
  private static final String NAME = "getFileInfo";
  
  public a()
  {
    GMTrace.i(17380793122816L, 129497);
    GMTrace.o(17380793122816L, 129497);
  }
  
  /* Error */
  public static String r(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 39
    //   3: ldc 41
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 43
    //   10: invokestatic 49	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   13: astore_2
    //   14: new 51	java/io/FileInputStream
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 54	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   22: astore_0
    //   23: sipush 8192
    //   26: newarray <illegal type>
    //   28: astore_3
    //   29: aload_0
    //   30: aload_3
    //   31: invokevirtual 60	java/io/InputStream:read	([B)I
    //   34: istore_1
    //   35: iload_1
    //   36: ifle +83 -> 119
    //   39: aload_2
    //   40: aload_3
    //   41: iconst_0
    //   42: iload_1
    //   43: invokevirtual 64	java/security/MessageDigest:update	([BII)V
    //   46: goto -17 -> 29
    //   49: astore_2
    //   50: aload_0
    //   51: invokevirtual 67	java/io/InputStream:close	()V
    //   54: ldc2_w 39
    //   57: ldc 41
    //   59: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   62: ldc 69
    //   64: areturn
    //   65: astore_0
    //   66: ldc 71
    //   68: ldc 73
    //   70: iconst_1
    //   71: anewarray 75	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: aload_0
    //   77: aastore
    //   78: invokestatic 81	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: ldc2_w 39
    //   84: ldc 41
    //   86: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   89: ldc 69
    //   91: areturn
    //   92: astore_0
    //   93: ldc 71
    //   95: ldc 83
    //   97: iconst_1
    //   98: anewarray 75	java/lang/Object
    //   101: dup
    //   102: iconst_0
    //   103: aload_0
    //   104: aastore
    //   105: invokestatic 81	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: ldc2_w 39
    //   111: ldc 41
    //   113: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   116: ldc 69
    //   118: areturn
    //   119: new 85	java/math/BigInteger
    //   122: dup
    //   123: iconst_1
    //   124: aload_2
    //   125: invokevirtual 89	java/security/MessageDigest:digest	()[B
    //   128: invokespecial 92	java/math/BigInteger:<init>	(I[B)V
    //   131: bipush 16
    //   133: invokevirtual 96	java/math/BigInteger:toString	(I)Ljava/lang/String;
    //   136: astore_2
    //   137: aload_0
    //   138: invokevirtual 67	java/io/InputStream:close	()V
    //   141: ldc2_w 39
    //   144: ldc 41
    //   146: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   149: aload_2
    //   150: areturn
    //   151: astore_0
    //   152: ldc 71
    //   154: ldc 98
    //   156: iconst_1
    //   157: anewarray 75	java/lang/Object
    //   160: dup
    //   161: iconst_0
    //   162: aload_0
    //   163: aastore
    //   164: invokestatic 81	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   167: goto -26 -> 141
    //   170: astore_0
    //   171: ldc 71
    //   173: ldc 98
    //   175: iconst_1
    //   176: anewarray 75	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_0
    //   182: aastore
    //   183: invokestatic 81	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: goto -132 -> 54
    //   189: astore_2
    //   190: aload_0
    //   191: invokevirtual 67	java/io/InputStream:close	()V
    //   194: aload_2
    //   195: athrow
    //   196: astore_0
    //   197: ldc 71
    //   199: ldc 98
    //   201: iconst_1
    //   202: anewarray 75	java/lang/Object
    //   205: dup
    //   206: iconst_0
    //   207: aload_0
    //   208: aastore
    //   209: invokestatic 81	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: goto -18 -> 194
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	paramFile	File
    //   34	9	1	i	int
    //   13	27	2	localMessageDigest	java.security.MessageDigest
    //   49	76	2	localIOException	java.io.IOException
    //   136	14	2	str	String
    //   189	6	2	localObject	Object
    //   28	13	3	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   29	35	49	java/io/IOException
    //   39	46	49	java/io/IOException
    //   119	137	49	java/io/IOException
    //   8	14	65	java/security/NoSuchAlgorithmException
    //   14	23	92	java/io/FileNotFoundException
    //   137	141	151	java/io/IOException
    //   50	54	170	java/io/IOException
    //   29	35	189	finally
    //   39	46	189	finally
    //   119	137	189	finally
    //   190	194	196	java/io/IOException
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17380927340544L, 129498);
    final String str1 = paramj.hyD;
    final String str2 = paramJSONObject.optString("filePath", "");
    if (!"sha1".equalsIgnoreCase(paramJSONObject.optString("digestAlgorithm", "md5"))) {}
    for (paramJSONObject = "md5"; bg.nm(str2); paramJSONObject = "sha1")
    {
      paramj.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(17380927340544L, 129498);
      return;
    }
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17380658905088L, 129496);
        Object localObject = c.aJ(str1, str2);
        if (localObject == null)
        {
          paramj.v(paramInt, a.this.d("fail:file doesn't exist", null));
          GMTrace.o(17380658905088L, 129496);
          return;
        }
        File localFile = new File(((AppBrandLocalMediaObject)localObject).gpy);
        localObject = paramJSONObject;
        int i = -1;
        switch (((String)localObject).hashCode())
        {
        default: 
          switch (i)
          {
          default: 
            localObject = "";
          }
          break;
        }
        for (;;)
        {
          HashMap localHashMap = new HashMap(2);
          localHashMap.put("size", Long.valueOf(localFile.length()));
          localHashMap.put("digest", localObject);
          paramj.v(paramInt, a.this.d("ok", localHashMap));
          GMTrace.o(17380658905088L, 129496);
          return;
          if (!((String)localObject).equals("md5")) {
            break;
          }
          i = 0;
          break;
          if (!((String)localObject).equals("sha1")) {
            break;
          }
          i = 1;
          break;
          localObject = g.h(localFile);
          continue;
          localObject = a.r(localFile);
        }
      }
    }, "AppBrandJsApiGetFileInfo");
    GMTrace.o(17380927340544L, 129498);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\file\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */