package com.tencent.mm.plugin.normsg.utils;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

public final class c
{
  private static String[] nxP;
  private static String[] nxQ;
  private static String[] nxR;
  public static boolean nxS;
  public static boolean nxT;
  public static boolean nxU;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: ldc2_w 19
    //   3: ldc 21
    //   5: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: iconst_2
    //   9: anewarray 29	java/lang/String
    //   12: dup
    //   13: iconst_0
    //   14: new 31	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   21: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   24: invokevirtual 46	android/content/Context:getFilesDir	()Ljava/io/File;
    //   27: invokevirtual 52	java/io/File:getParent	()Ljava/lang/String;
    //   30: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: ldc 58
    //   35: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: invokestatic 65	com/tencent/mm/plugin/normsg/utils/c:Ea	(Ljava/lang/String;)Ljava/lang/String;
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: new 31	java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   54: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   57: invokevirtual 46	android/content/Context:getFilesDir	()Ljava/io/File;
    //   60: invokevirtual 52	java/io/File:getParent	()Ljava/lang/String;
    //   63: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: ldc 67
    //   68: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokestatic 65	com/tencent/mm/plugin/normsg/utils/c:Ea	(Ljava/lang/String;)Ljava/lang/String;
    //   77: aastore
    //   78: putstatic 69	com/tencent/mm/plugin/normsg/utils/c:nxP	[Ljava/lang/String;
    //   81: iconst_1
    //   82: anewarray 29	java/lang/String
    //   85: dup
    //   86: iconst_0
    //   87: new 31	java/lang/StringBuilder
    //   90: dup
    //   91: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   94: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   97: invokevirtual 46	android/content/Context:getFilesDir	()Ljava/io/File;
    //   100: invokevirtual 52	java/io/File:getParent	()Ljava/lang/String;
    //   103: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: ldc 71
    //   108: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 65	com/tencent/mm/plugin/normsg/utils/c:Ea	(Ljava/lang/String;)Ljava/lang/String;
    //   117: aastore
    //   118: putstatic 73	com/tencent/mm/plugin/normsg/utils/c:nxQ	[Ljava/lang/String;
    //   121: iconst_3
    //   122: anewarray 29	java/lang/String
    //   125: dup
    //   126: iconst_0
    //   127: new 31	java/lang/StringBuilder
    //   130: dup
    //   131: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   134: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   137: invokevirtual 46	android/content/Context:getFilesDir	()Ljava/io/File;
    //   140: invokevirtual 52	java/io/File:getParent	()Ljava/lang/String;
    //   143: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: ldc 75
    //   148: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: invokestatic 65	com/tencent/mm/plugin/normsg/utils/c:Ea	(Ljava/lang/String;)Ljava/lang/String;
    //   157: aastore
    //   158: dup
    //   159: iconst_1
    //   160: new 31	java/lang/StringBuilder
    //   163: dup
    //   164: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   167: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   170: invokevirtual 46	android/content/Context:getFilesDir	()Ljava/io/File;
    //   173: invokevirtual 52	java/io/File:getParent	()Ljava/lang/String;
    //   176: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: ldc 77
    //   181: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: invokestatic 65	com/tencent/mm/plugin/normsg/utils/c:Ea	(Ljava/lang/String;)Ljava/lang/String;
    //   190: aastore
    //   191: dup
    //   192: iconst_2
    //   193: new 31	java/lang/StringBuilder
    //   196: dup
    //   197: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   200: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   203: invokevirtual 46	android/content/Context:getFilesDir	()Ljava/io/File;
    //   206: invokevirtual 52	java/io/File:getParent	()Ljava/lang/String;
    //   209: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: ldc 79
    //   214: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   220: invokestatic 65	com/tencent/mm/plugin/normsg/utils/c:Ea	(Ljava/lang/String;)Ljava/lang/String;
    //   223: aastore
    //   224: putstatic 81	com/tencent/mm/plugin/normsg/utils/c:nxR	[Ljava/lang/String;
    //   227: iconst_0
    //   228: putstatic 83	com/tencent/mm/plugin/normsg/utils/c:nxS	Z
    //   231: iconst_0
    //   232: putstatic 85	com/tencent/mm/plugin/normsg/utils/c:nxT	Z
    //   235: iconst_0
    //   236: putstatic 87	com/tencent/mm/plugin/normsg/utils/c:nxU	Z
    //   239: getstatic 69	com/tencent/mm/plugin/normsg/utils/c:nxP	[Ljava/lang/String;
    //   242: astore_2
    //   243: aload_2
    //   244: arraylength
    //   245: istore_1
    //   246: iconst_0
    //   247: istore_0
    //   248: iload_0
    //   249: iload_1
    //   250: if_icmpge +23 -> 273
    //   253: new 48	java/io/File
    //   256: dup
    //   257: aload_2
    //   258: iload_0
    //   259: aaload
    //   260: invokespecial 90	java/io/File:<init>	(Ljava/lang/String;)V
    //   263: invokevirtual 94	java/io/File:exists	()Z
    //   266: ifeq +152 -> 418
    //   269: iconst_1
    //   270: putstatic 83	com/tencent/mm/plugin/normsg/utils/c:nxS	Z
    //   273: new 48	java/io/File
    //   276: dup
    //   277: ldc 96
    //   279: invokespecial 90	java/io/File:<init>	(Ljava/lang/String;)V
    //   282: astore_2
    //   283: aload_2
    //   284: invokevirtual 94	java/io/File:exists	()Z
    //   287: ifeq +88 -> 375
    //   290: aload_2
    //   291: invokevirtual 99	java/io/File:canRead	()Z
    //   294: ifeq +81 -> 375
    //   297: aload_2
    //   298: invokevirtual 103	java/io/File:length	()J
    //   301: lconst_0
    //   302: lcmp
    //   303: ifle +72 -> 375
    //   306: aload_2
    //   307: invokevirtual 103	java/io/File:length	()J
    //   310: l2i
    //   311: newarray <illegal type>
    //   313: astore 4
    //   315: aconst_null
    //   316: astore_3
    //   317: new 105	java/io/FileInputStream
    //   320: dup
    //   321: aload_2
    //   322: invokespecial 108	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   325: astore_2
    //   326: aload_2
    //   327: aload 4
    //   329: invokevirtual 114	java/io/InputStream:read	([B)I
    //   332: pop
    //   333: aload_2
    //   334: invokevirtual 117	java/io/InputStream:close	()V
    //   337: new 29	java/lang/String
    //   340: dup
    //   341: aload 4
    //   343: invokespecial 120	java/lang/String:<init>	([B)V
    //   346: astore_2
    //   347: getstatic 73	com/tencent/mm/plugin/normsg/utils/c:nxQ	[Ljava/lang/String;
    //   350: astore_3
    //   351: aload_3
    //   352: arraylength
    //   353: istore_1
    //   354: iconst_0
    //   355: istore_0
    //   356: iload_0
    //   357: iload_1
    //   358: if_icmpge +17 -> 375
    //   361: aload_2
    //   362: aload_3
    //   363: iload_0
    //   364: aaload
    //   365: invokevirtual 124	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   368: ifeq +86 -> 454
    //   371: iconst_1
    //   372: putstatic 85	com/tencent/mm/plugin/normsg/utils/c:nxT	Z
    //   375: getstatic 81	com/tencent/mm/plugin/normsg/utils/c:nxR	[Ljava/lang/String;
    //   378: astore_2
    //   379: aload_2
    //   380: arraylength
    //   381: istore_1
    //   382: iconst_0
    //   383: istore_0
    //   384: iload_0
    //   385: iload_1
    //   386: if_icmpge +82 -> 468
    //   389: new 48	java/io/File
    //   392: dup
    //   393: aload_2
    //   394: iload_0
    //   395: aaload
    //   396: invokespecial 90	java/io/File:<init>	(Ljava/lang/String;)V
    //   399: invokevirtual 94	java/io/File:exists	()Z
    //   402: ifeq +59 -> 461
    //   405: iconst_1
    //   406: putstatic 87	com/tencent/mm/plugin/normsg/utils/c:nxU	Z
    //   409: ldc2_w 19
    //   412: ldc 21
    //   414: invokestatic 127	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   417: return
    //   418: iload_0
    //   419: iconst_1
    //   420: iadd
    //   421: istore_0
    //   422: goto -174 -> 248
    //   425: astore_2
    //   426: aconst_null
    //   427: astore_2
    //   428: aload_2
    //   429: ifnull -92 -> 337
    //   432: aload_2
    //   433: invokevirtual 117	java/io/InputStream:close	()V
    //   436: goto -99 -> 337
    //   439: astore_2
    //   440: goto -103 -> 337
    //   443: astore_2
    //   444: aload_3
    //   445: ifnull +7 -> 452
    //   448: aload_3
    //   449: invokevirtual 117	java/io/InputStream:close	()V
    //   452: aload_2
    //   453: athrow
    //   454: iload_0
    //   455: iconst_1
    //   456: iadd
    //   457: istore_0
    //   458: goto -102 -> 356
    //   461: iload_0
    //   462: iconst_1
    //   463: iadd
    //   464: istore_0
    //   465: goto -81 -> 384
    //   468: ldc2_w 19
    //   471: ldc 21
    //   473: invokestatic 127	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   476: return
    //   477: astore_2
    //   478: goto -141 -> 337
    //   481: astore_3
    //   482: goto -30 -> 452
    //   485: astore 4
    //   487: aload_2
    //   488: astore_3
    //   489: aload 4
    //   491: astore_2
    //   492: goto -48 -> 444
    //   495: astore_3
    //   496: goto -68 -> 428
    // Local variable table:
    //   start	length	slot	name	signature
    //   247	218	0	i	int
    //   245	142	1	j	int
    //   242	152	2	localObject1	Object
    //   425	1	2	localThrowable1	Throwable
    //   427	6	2	localObject2	Object
    //   439	1	2	localIOException1	java.io.IOException
    //   443	10	2	localObject3	Object
    //   477	11	2	localIOException2	java.io.IOException
    //   491	1	2	localObject4	Object
    //   316	133	3	arrayOfString	String[]
    //   481	1	3	localIOException3	java.io.IOException
    //   488	1	3	localIOException4	java.io.IOException
    //   495	1	3	localThrowable2	Throwable
    //   313	29	4	arrayOfByte	byte[]
    //   485	5	4	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   317	326	425	java/lang/Throwable
    //   432	436	439	java/io/IOException
    //   317	326	443	finally
    //   333	337	477	java/io/IOException
    //   448	452	481	java/io/IOException
    //   326	333	485	finally
    //   326	333	495	java/lang/Throwable
  }
  
  public c()
  {
    GMTrace.i(17524271874048L, 130566);
    GMTrace.o(17524271874048L, 130566);
  }
  
  private static String Ea(String paramString)
  {
    GMTrace.i(17524406091776L, 130567);
    String[] arrayOfString = new String[3];
    arrayOfString[0] = ab.getContext().getFilesDir().getParent();
    arrayOfString[1] = paramString;
    arrayOfString[2] = c.class.toString();
    paramString = new StringBuilder(arrayOfString[1].substring(arrayOfString[0].length() + 1)).reverse().toString();
    GMTrace.o(17524406091776L, 130567);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\normsg\utils\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */