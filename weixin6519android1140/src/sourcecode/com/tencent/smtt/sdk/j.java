package com.tencent.smtt.sdk;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

class j
{
  private static Context mContext = null;
  private static j xVf = null;
  
  static File coa()
  {
    p.cov();
    File localFile = new File(p.gM(mContext), "tbscoreinstall.txt");
    if (!localFile.exists()) {}
    try
    {
      localFile.createNewFile();
      return localFile;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  /* Error */
  private static Properties cob()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: invokestatic 52	com/tencent/smtt/sdk/j:coa	()Ljava/io/File;
    //   7: astore_1
    //   8: new 54	java/util/Properties
    //   11: dup
    //   12: invokespecial 55	java/util/Properties:<init>	()V
    //   15: astore_0
    //   16: aload_1
    //   17: ifnull +91 -> 108
    //   20: new 57	java/io/BufferedInputStream
    //   23: dup
    //   24: new 59	java/io/FileInputStream
    //   27: dup
    //   28: aload_1
    //   29: invokespecial 62	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   32: invokespecial 65	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   35: astore_1
    //   36: aload_0
    //   37: aload_1
    //   38: invokevirtual 68	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   41: aload_1
    //   42: ifnull +7 -> 49
    //   45: aload_1
    //   46: invokevirtual 71	java/io/BufferedInputStream:close	()V
    //   49: aload_0
    //   50: astore_2
    //   51: aload_2
    //   52: areturn
    //   53: astore_0
    //   54: aconst_null
    //   55: astore_0
    //   56: aload_2
    //   57: astore_1
    //   58: aload_0
    //   59: astore_2
    //   60: aload_1
    //   61: ifnull -10 -> 51
    //   64: aload_1
    //   65: invokevirtual 71	java/io/BufferedInputStream:close	()V
    //   68: aload_0
    //   69: areturn
    //   70: astore_1
    //   71: aload_0
    //   72: areturn
    //   73: astore_0
    //   74: aload_3
    //   75: astore_1
    //   76: aload_1
    //   77: ifnull +7 -> 84
    //   80: aload_1
    //   81: invokevirtual 71	java/io/BufferedInputStream:close	()V
    //   84: aload_0
    //   85: athrow
    //   86: astore_1
    //   87: goto -38 -> 49
    //   90: astore_1
    //   91: goto -7 -> 84
    //   94: astore_0
    //   95: goto -19 -> 76
    //   98: astore_1
    //   99: aload_2
    //   100: astore_1
    //   101: goto -43 -> 58
    //   104: astore_2
    //   105: goto -47 -> 58
    //   108: aconst_null
    //   109: astore_1
    //   110: goto -69 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   15	35	0	localProperties1	Properties
    //   53	1	0	localException1	Exception
    //   55	17	0	localProperties2	Properties
    //   73	12	0	localObject1	Object
    //   94	1	0	localObject2	Object
    //   7	58	1	localObject3	Object
    //   70	1	1	localIOException1	IOException
    //   75	6	1	localObject4	Object
    //   86	1	1	localIOException2	IOException
    //   90	1	1	localIOException3	IOException
    //   98	1	1	localException2	Exception
    //   100	10	1	localObject5	Object
    //   3	97	2	localObject6	Object
    //   104	1	2	localException3	Exception
    //   1	74	3	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   4	16	53	java/lang/Exception
    //   64	68	70	java/io/IOException
    //   4	16	73	finally
    //   20	36	73	finally
    //   45	49	86	java/io/IOException
    //   80	84	90	java/io/IOException
    //   36	41	94	finally
    //   20	36	98	java/lang/Exception
    //   36	41	104	java/lang/Exception
  }
  
  static j gk(Context paramContext)
  {
    if (xVf == null) {}
    try
    {
      if (xVf == null) {
        xVf = new j();
      }
      mContext = paramContext.getApplicationContext();
      return xVf;
    }
    finally {}
  }
  
  final int Ye(String paramString)
  {
    Properties localProperties = cob();
    if ((localProperties != null) && (localProperties.getProperty(paramString) != null)) {
      return Integer.parseInt(localProperties.getProperty(paramString));
    }
    return -1;
  }
  
  final int Yf(String paramString)
  {
    Properties localProperties = cob();
    if ((localProperties != null) && (localProperties.getProperty(paramString) != null)) {
      return Integer.parseInt(localProperties.getProperty(paramString));
    }
    return 0;
  }
  
  final void dq(String paramString, int paramInt)
  {
    fy(paramString, String.valueOf(paramInt));
  }
  
  final void eW(int paramInt1, int paramInt2)
  {
    dq("copy_core_ver", paramInt1);
    dq("copy_status", paramInt2);
  }
  
  final void eX(int paramInt1, int paramInt2)
  {
    dq("install_core_ver", paramInt1);
    dq("install_status", paramInt2);
  }
  
  /* Error */
  final void fy(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: invokestatic 84	com/tencent/smtt/sdk/j:cob	()Ljava/util/Properties;
    //   9: astore 6
    //   11: aload 5
    //   13: astore_3
    //   14: aload 6
    //   16: ifnull +60 -> 76
    //   19: aload 6
    //   21: aload_1
    //   22: aload_2
    //   23: invokevirtual 123	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   26: pop
    //   27: invokestatic 52	com/tencent/smtt/sdk/j:coa	()Ljava/io/File;
    //   30: astore_2
    //   31: aload 5
    //   33: astore_3
    //   34: aload_2
    //   35: ifnull +41 -> 76
    //   38: new 125	java/io/FileOutputStream
    //   41: dup
    //   42: aload_2
    //   43: invokespecial 126	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   46: astore_2
    //   47: aload 6
    //   49: aload_2
    //   50: new 128	java/lang/StringBuilder
    //   53: dup
    //   54: ldc -126
    //   56: invokespecial 133	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   59: aload_1
    //   60: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: ldc -117
    //   65: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: invokevirtual 147	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   74: aload_2
    //   75: astore_3
    //   76: aload_3
    //   77: ifnull +7 -> 84
    //   80: aload_3
    //   81: invokevirtual 148	java/io/FileOutputStream:close	()V
    //   84: return
    //   85: astore_1
    //   86: aconst_null
    //   87: astore_2
    //   88: aload_2
    //   89: ifnull -5 -> 84
    //   92: aload_2
    //   93: invokevirtual 148	java/io/FileOutputStream:close	()V
    //   96: return
    //   97: astore_1
    //   98: return
    //   99: astore_1
    //   100: aload 4
    //   102: astore_2
    //   103: aload_2
    //   104: ifnull +7 -> 111
    //   107: aload_2
    //   108: invokevirtual 148	java/io/FileOutputStream:close	()V
    //   111: aload_1
    //   112: athrow
    //   113: astore_1
    //   114: return
    //   115: astore_2
    //   116: goto -5 -> 111
    //   119: astore_1
    //   120: goto -17 -> 103
    //   123: astore_1
    //   124: goto -36 -> 88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	j
    //   0	127	1	paramString1	String
    //   0	127	2	paramString2	String
    //   13	68	3	localObject1	Object
    //   1	100	4	localObject2	Object
    //   4	28	5	localObject3	Object
    //   9	39	6	localProperties	Properties
    // Exception table:
    //   from	to	target	type
    //   6	11	85	java/lang/Exception
    //   19	31	85	java/lang/Exception
    //   38	47	85	java/lang/Exception
    //   92	96	97	java/io/IOException
    //   6	11	99	finally
    //   19	31	99	finally
    //   38	47	99	finally
    //   80	84	113	java/io/IOException
    //   107	111	115	java/io/IOException
    //   47	74	119	finally
    //   47	74	123	java/lang/Exception
  }
  
  final String getStringValue(String paramString)
  {
    Properties localProperties = cob();
    if ((localProperties != null) && (localProperties.getProperty(paramString) != null)) {
      return localProperties.getProperty(paramString);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */