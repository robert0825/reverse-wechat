package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;

public final class a
{
  /* Error */
  public static String L(File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: bipush 16
    //   4: newarray <illegal type>
    //   6: astore 5
    //   8: aload 5
    //   10: dup
    //   11: iconst_0
    //   12: ldc 11
    //   14: castore
    //   15: dup
    //   16: iconst_1
    //   17: ldc 12
    //   19: castore
    //   20: dup
    //   21: iconst_2
    //   22: ldc 13
    //   24: castore
    //   25: dup
    //   26: iconst_3
    //   27: ldc 14
    //   29: castore
    //   30: dup
    //   31: iconst_4
    //   32: ldc 15
    //   34: castore
    //   35: dup
    //   36: iconst_5
    //   37: ldc 16
    //   39: castore
    //   40: dup
    //   41: bipush 6
    //   43: ldc 17
    //   45: castore
    //   46: dup
    //   47: bipush 7
    //   49: ldc 18
    //   51: castore
    //   52: dup
    //   53: bipush 8
    //   55: ldc 19
    //   57: castore
    //   58: dup
    //   59: bipush 9
    //   61: ldc 20
    //   63: castore
    //   64: dup
    //   65: bipush 10
    //   67: ldc 21
    //   69: castore
    //   70: dup
    //   71: bipush 11
    //   73: ldc 22
    //   75: castore
    //   76: dup
    //   77: bipush 12
    //   79: ldc 23
    //   81: castore
    //   82: dup
    //   83: bipush 13
    //   85: ldc 24
    //   87: castore
    //   88: dup
    //   89: bipush 14
    //   91: ldc 25
    //   93: castore
    //   94: dup
    //   95: bipush 15
    //   97: ldc 26
    //   99: castore
    //   100: pop
    //   101: bipush 32
    //   103: newarray <illegal type>
    //   105: astore 6
    //   107: ldc 28
    //   109: invokestatic 34	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   112: astore 7
    //   114: new 36	java/io/FileInputStream
    //   117: dup
    //   118: aload_0
    //   119: invokespecial 40	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   122: astore_0
    //   123: sipush 8192
    //   126: newarray <illegal type>
    //   128: astore 8
    //   130: aload_0
    //   131: aload 8
    //   133: invokevirtual 44	java/io/FileInputStream:read	([B)I
    //   136: istore_2
    //   137: iload_2
    //   138: iconst_m1
    //   139: if_icmpeq +27 -> 166
    //   142: aload 7
    //   144: aload 8
    //   146: iconst_0
    //   147: iload_2
    //   148: invokevirtual 48	java/security/MessageDigest:update	([BII)V
    //   151: goto -21 -> 130
    //   154: astore 5
    //   156: aload_0
    //   157: ifnull +7 -> 164
    //   160: aload_0
    //   161: invokevirtual 52	java/io/FileInputStream:close	()V
    //   164: aconst_null
    //   165: areturn
    //   166: aload 7
    //   168: invokevirtual 56	java/security/MessageDigest:digest	()[B
    //   171: astore 7
    //   173: iconst_0
    //   174: istore_2
    //   175: goto +59 -> 234
    //   178: new 58	java/lang/String
    //   181: dup
    //   182: aload 6
    //   184: invokespecial 61	java/lang/String:<init>	([C)V
    //   187: astore 5
    //   189: aload_0
    //   190: invokevirtual 52	java/io/FileInputStream:close	()V
    //   193: aload 5
    //   195: areturn
    //   196: astore_0
    //   197: aload 5
    //   199: areturn
    //   200: astore 5
    //   202: aconst_null
    //   203: astore_0
    //   204: aload_0
    //   205: ifnull +7 -> 212
    //   208: aload_0
    //   209: invokevirtual 52	java/io/FileInputStream:close	()V
    //   212: aload 5
    //   214: athrow
    //   215: astore_0
    //   216: goto -52 -> 164
    //   219: astore_0
    //   220: goto -8 -> 212
    //   223: astore 5
    //   225: goto -21 -> 204
    //   228: astore_0
    //   229: aconst_null
    //   230: astore_0
    //   231: goto -75 -> 156
    //   234: iload_1
    //   235: bipush 16
    //   237: if_icmpge -59 -> 178
    //   240: aload 7
    //   242: iload_1
    //   243: baload
    //   244: istore_3
    //   245: iload_2
    //   246: iconst_1
    //   247: iadd
    //   248: istore 4
    //   250: aload 6
    //   252: iload_2
    //   253: aload 5
    //   255: iload_3
    //   256: iconst_4
    //   257: iushr
    //   258: bipush 15
    //   260: iand
    //   261: caload
    //   262: castore
    //   263: iload 4
    //   265: iconst_1
    //   266: iadd
    //   267: istore_2
    //   268: aload 6
    //   270: iload 4
    //   272: aload 5
    //   274: iload_3
    //   275: bipush 15
    //   277: iand
    //   278: caload
    //   279: castore
    //   280: iload_1
    //   281: iconst_1
    //   282: iadd
    //   283: istore_1
    //   284: goto -50 -> 234
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	287	0	paramFile	File
    //   1	283	1	i	int
    //   136	132	2	j	int
    //   244	34	3	k	int
    //   248	23	4	m	int
    //   6	3	5	arrayOfChar1	char[]
    //   154	1	5	localException	Exception
    //   187	11	5	str	String
    //   200	13	5	localObject1	Object
    //   223	50	5	localObject2	Object
    //   105	164	6	arrayOfChar2	char[]
    //   112	129	7	localObject3	Object
    //   128	17	8	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   123	130	154	java/lang/Exception
    //   130	137	154	java/lang/Exception
    //   142	151	154	java/lang/Exception
    //   166	173	154	java/lang/Exception
    //   178	189	154	java/lang/Exception
    //   189	193	196	java/io/IOException
    //   107	123	200	finally
    //   160	164	215	java/io/IOException
    //   208	212	219	java/io/IOException
    //   123	130	223	finally
    //   130	137	223	finally
    //   142	151	223	finally
    //   166	173	223	finally
    //   178	189	223	finally
    //   107	123	228	java/lang/Exception
  }
  
  public static boolean a(Context paramContext, File paramFile, int paramInt)
  {
    if ((paramFile == null) || (!paramFile.exists())) {}
    for (;;)
    {
      return false;
      if ((0L <= 0L) || (0L == paramFile.length())) {
        try
        {
          if (paramInt == c(paramContext, paramFile))
          {
            boolean bool = "3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a".equals(c.d(paramContext, paramFile));
            if (bool) {
              return true;
            }
          }
        }
        catch (Exception paramContext) {}
      }
    }
    return false;
  }
  
  public static int c(Context paramContext, File paramFile)
  {
    int j = 0;
    int i = j;
    if (paramFile != null)
    {
      i = j;
      if (!paramFile.exists()) {}
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageArchiveInfo(paramFile.getAbsolutePath(), 1);
      i = j;
      if (paramContext != null) {
        i = paramContext.versionCode;
      }
      return i;
    }
    catch (Throwable paramContext) {}
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */