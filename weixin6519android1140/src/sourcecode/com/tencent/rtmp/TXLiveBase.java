package com.tencent.rtmp;

import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.log.TXCLog.ITXLogListener;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCSystemUtil;

public class TXLiveBase
{
  private static final String FILE_MD5_FFMPEG = "FD34436EF34B1CFE490DC126EE744242";
  private static final String FILE_MD5_LITEAV = "6fc1be9038158d301e44b30ca0d6ec73";
  private static final String FILE_MD5_SATURN = "f34563b0d9536744b370bc48cc056f2a";
  private static TXLiveBase instance = new TXLiveBase();
  public static ITXLiveBaseListener listener = null;
  
  /* Error */
  private static String getFileMD5(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: new 44	java/io/File
    //   11: dup
    //   12: aload_0
    //   13: aload_1
    //   14: invokespecial 47	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: astore 7
    //   19: aload 7
    //   21: invokevirtual 51	java/io/File:exists	()Z
    //   24: ifeq +11 -> 35
    //   27: aload 7
    //   29: invokevirtual 54	java/io/File:isFile	()Z
    //   32: ifne +5 -> 37
    //   35: aconst_null
    //   36: areturn
    //   37: sipush 1024
    //   40: newarray <illegal type>
    //   42: astore 6
    //   44: aload 5
    //   46: astore_1
    //   47: ldc 56
    //   49: invokestatic 62	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   52: astore_0
    //   53: aload_0
    //   54: astore_1
    //   55: aload_0
    //   56: astore_3
    //   57: aload_0
    //   58: astore 4
    //   60: new 64	java/io/FileInputStream
    //   63: dup
    //   64: aload 7
    //   66: invokespecial 67	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   69: astore 5
    //   71: aload_0
    //   72: astore_1
    //   73: aload_0
    //   74: astore_3
    //   75: aload_0
    //   76: astore 4
    //   78: aload 5
    //   80: aload 6
    //   82: iconst_0
    //   83: sipush 1024
    //   86: invokevirtual 71	java/io/FileInputStream:read	([BII)I
    //   89: istore_2
    //   90: iload_2
    //   91: iconst_m1
    //   92: if_icmpeq +42 -> 134
    //   95: aload_0
    //   96: astore_1
    //   97: aload_0
    //   98: astore_3
    //   99: aload_0
    //   100: astore 4
    //   102: aload_0
    //   103: aload 6
    //   105: iconst_0
    //   106: iload_2
    //   107: invokevirtual 75	java/security/MessageDigest:update	([BII)V
    //   110: goto -39 -> 71
    //   113: astore_0
    //   114: aload_1
    //   115: astore_0
    //   116: new 77	java/math/BigInteger
    //   119: dup
    //   120: iconst_1
    //   121: aload_0
    //   122: invokevirtual 81	java/security/MessageDigest:digest	()[B
    //   125: invokespecial 84	java/math/BigInteger:<init>	(I[B)V
    //   128: bipush 16
    //   130: invokevirtual 88	java/math/BigInteger:toString	(I)Ljava/lang/String;
    //   133: areturn
    //   134: aload_0
    //   135: astore_1
    //   136: aload_0
    //   137: astore_3
    //   138: aload_0
    //   139: astore 4
    //   141: aload 5
    //   143: invokevirtual 91	java/io/FileInputStream:close	()V
    //   146: goto -30 -> 116
    //   149: astore_0
    //   150: aload_3
    //   151: astore_0
    //   152: goto -36 -> 116
    //   155: astore_0
    //   156: aload 4
    //   158: astore_0
    //   159: goto -43 -> 116
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	paramString1	String
    //   0	162	1	paramString2	String
    //   89	18	2	i	int
    //   1	150	3	str1	String
    //   3	154	4	str2	String
    //   6	136	5	localFileInputStream	java.io.FileInputStream
    //   42	62	6	arrayOfByte	byte[]
    //   17	48	7	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   47	53	113	java/security/NoSuchAlgorithmException
    //   60	71	113	java/security/NoSuchAlgorithmException
    //   78	90	113	java/security/NoSuchAlgorithmException
    //   102	110	113	java/security/NoSuchAlgorithmException
    //   141	146	113	java/security/NoSuchAlgorithmException
    //   47	53	149	java/io/FileNotFoundException
    //   60	71	149	java/io/FileNotFoundException
    //   78	90	149	java/io/FileNotFoundException
    //   102	110	149	java/io/FileNotFoundException
    //   141	146	149	java/io/FileNotFoundException
    //   47	53	155	java/io/IOException
    //   60	71	155	java/io/IOException
    //   78	90	155	java/io/IOException
    //   102	110	155	java/io/IOException
    //   141	146	155	java/io/IOException
  }
  
  public static TXLiveBase getInstance()
  {
    return instance;
  }
  
  public static String getSDKVersionStr()
  {
    return TXCCommonUtil.getSDKVersionStr();
  }
  
  public static boolean isLibraryPathValid(String paramString)
  {
    String str1 = getFileMD5(paramString, "libliteavsdk.so");
    String str2 = getFileMD5(paramString, "libsaturn.so");
    paramString = getFileMD5(paramString, "libijkffmpeg.so");
    return (str1 != null) && (str1.equalsIgnoreCase("6fc1be9038158d301e44b30ca0d6ec73")) && (str2 != null) && (str2.equalsIgnoreCase("f34563b0d9536744b370bc48cc056f2a")) && (paramString != null) && (paramString.equalsIgnoreCase("FD34436EF34B1CFE490DC126EE744242"));
  }
  
  public static void setAppVersion(String paramString)
  {
    TXCDRApi.txSetAppVersion(paramString);
  }
  
  public static void setConsoleEnabled(boolean paramBoolean)
  {
    TXCLog.setConsoleEnabled(paramBoolean);
  }
  
  public static void setLibraryPath(String paramString)
  {
    TXCSystemUtil.setLibraryPath(paramString);
  }
  
  public static void setListener(ITXLiveBaseListener paramITXLiveBaseListener)
  {
    TXCLog.setListener(new TXLogListenerImpl());
    listener = paramITXLiveBaseListener;
  }
  
  public static void setLogLevel(int paramInt)
  {
    TXCLog.setLevel(paramInt);
  }
  
  private static class TXLogListenerImpl
    implements TXCLog.ITXLogListener
  {
    public void OnLog(int paramInt, String paramString1, String paramString2)
    {
      if (TXLiveBase.listener != null) {
        TXLiveBase.listener.OnLog(paramInt, paramString1, paramString2);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\rtmp\TXLiveBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */