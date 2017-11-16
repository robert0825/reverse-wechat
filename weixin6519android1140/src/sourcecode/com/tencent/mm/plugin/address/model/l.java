package com.tencent.mm.plugin.address.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.address.d.a;
import com.tencent.mm.protocal.c.axg;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class l
{
  private static final Pattern hux;
  public a hut;
  public final List<RcptItem> huu;
  public final HashMap<String, List<RcptItem>> huv;
  public final HashMap<String, List<RcptItem>> huw;
  public String path;
  
  static
  {
    GMTrace.i(12792023220224L, 95308);
    hux = Pattern.compile("(-|\\s)+");
    GMTrace.o(12792023220224L, 95308);
  }
  
  public l()
  {
    GMTrace.i(12790009954304L, 95293);
    this.hut = new a();
    this.huu = new ArrayList();
    this.huv = new HashMap();
    this.huw = new HashMap();
    GMTrace.o(12790009954304L, 95293);
  }
  
  private byte[] QR()
  {
    GMTrace.i(12790815260672L, 95299);
    byte[] arrayOfByte = g.n(("addrmgr" + this.path).toString().getBytes()).substring(8, 16).getBytes();
    GMTrace.o(12790815260672L, 95299);
    return arrayOfByte;
  }
  
  private static boolean ax(String paramString1, String paramString2)
  {
    GMTrace.i(12791486349312L, 95304);
    if (paramString1.substring(6).startsWith(paramString2))
    {
      GMTrace.o(12791486349312L, 95304);
      return true;
    }
    GMTrace.o(12791486349312L, 95304);
    return false;
  }
  
  private static byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(12791083696128L, 95301);
    try
    {
      paramArrayOfByte2 = new DESKeySpec(paramArrayOfByte2);
      paramArrayOfByte2 = SecretKeyFactory.getInstance("DES").generateSecret(paramArrayOfByte2);
      Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
      localCipher.init(2, paramArrayOfByte2, new IvParameterSpec("12345678".getBytes()));
      paramArrayOfByte1 = localCipher.doFinal(paramArrayOfByte1);
      GMTrace.o(12791083696128L, 95301);
      return paramArrayOfByte1;
    }
    catch (Exception paramArrayOfByte1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.WalletAddrMgr", paramArrayOfByte1, "", new Object[0]);
        paramArrayOfByte1 = null;
      }
    }
  }
  
  private static RcptItem e(List<RcptItem> paramList, String paramString)
  {
    GMTrace.i(12791754784768L, 95306);
    if ((paramList == null) || (paramList.isEmpty()) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(12791754784768L, 95306);
      return null;
    }
    int i = 0;
    RcptItem localRcptItem;
    if (i < paramList.size())
    {
      localRcptItem = (RcptItem)paramList.get(i);
      if ((localRcptItem == null) || (!paramString.equals(localRcptItem.name))) {}
    }
    for (paramList = localRcptItem;; paramList = null)
    {
      GMTrace.o(12791754784768L, 95306);
      return paramList;
      i += 1;
      break;
    }
  }
  
  private static byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(12790949478400L, 95300);
    try
    {
      paramArrayOfByte2 = new DESKeySpec(paramArrayOfByte2);
      paramArrayOfByte2 = SecretKeyFactory.getInstance("DES").generateSecret(paramArrayOfByte2);
      Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
      localCipher.init(1, paramArrayOfByte2, new IvParameterSpec("12345678".getBytes()));
      paramArrayOfByte1 = localCipher.doFinal(paramArrayOfByte1);
      GMTrace.o(12790949478400L, 95300);
      return paramArrayOfByte1;
    }
    catch (Exception paramArrayOfByte1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.WalletAddrMgr", paramArrayOfByte1, "", new Object[0]);
        paramArrayOfByte1 = null;
      }
    }
  }
  
  /* Error */
  public final void QP()
  {
    // Byte code:
    //   0: ldc2_w 212
    //   3: ldc -42
    //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc -95
    //   10: ldc -40
    //   12: invokestatic 219	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: invokestatic 225	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   18: pop
    //   19: invokestatic 230	com/tencent/mm/y/c:zo	()Ljava/lang/String;
    //   22: astore 10
    //   24: ldc -95
    //   26: ldc -24
    //   28: invokestatic 235	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   31: invokestatic 241	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   34: invokevirtual 247	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   37: astore 12
    //   39: aconst_null
    //   40: astore 7
    //   42: new 55	java/util/ArrayList
    //   45: dup
    //   46: invokespecial 56	java/util/ArrayList:<init>	()V
    //   49: astore 11
    //   51: iconst_0
    //   52: istore 4
    //   54: new 249	java/io/FileReader
    //   57: dup
    //   58: new 72	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 250	java/lang/StringBuilder:<init>	()V
    //   65: aload 10
    //   67: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc -4
    //   72: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokespecial 253	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   81: astore 6
    //   83: new 255	java/io/BufferedReader
    //   86: dup
    //   87: aload 6
    //   89: invokespecial 258	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   92: astore 5
    //   94: aload 6
    //   96: astore 7
    //   98: aload 5
    //   100: astore 9
    //   102: aload 11
    //   104: invokeinterface 261 1 0
    //   109: aload 6
    //   111: astore 7
    //   113: aload 5
    //   115: astore 9
    //   117: aload 5
    //   119: invokevirtual 264	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   122: astore 8
    //   124: aload 8
    //   126: ifnull +459 -> 585
    //   129: aload 6
    //   131: astore 7
    //   133: aload 5
    //   135: astore 9
    //   137: aload 11
    //   139: aload 8
    //   141: invokeinterface 267 2 0
    //   146: pop
    //   147: goto -38 -> 109
    //   150: astore 8
    //   152: aload 6
    //   154: astore 7
    //   156: aload 5
    //   158: astore 9
    //   160: ldc -95
    //   162: aload 8
    //   164: ldc -93
    //   166: iconst_0
    //   167: anewarray 4	java/lang/Object
    //   170: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: aload 6
    //   175: ifnull +8 -> 183
    //   178: aload 6
    //   180: invokevirtual 270	java/io/FileReader:close	()V
    //   183: aload 5
    //   185: astore 6
    //   187: iload 4
    //   189: istore_3
    //   190: aload 5
    //   192: ifnull +15 -> 207
    //   195: aload 5
    //   197: invokevirtual 271	java/io/BufferedReader:close	()V
    //   200: iload 4
    //   202: istore_3
    //   203: aload 5
    //   205: astore 6
    //   207: iload_3
    //   208: ifne +119 -> 327
    //   211: aload 11
    //   213: invokeinterface 261 1 0
    //   218: aload 12
    //   220: ldc -4
    //   222: invokevirtual 277	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   225: astore 5
    //   227: new 255	java/io/BufferedReader
    //   230: dup
    //   231: new 279	java/io/InputStreamReader
    //   234: dup
    //   235: aload 5
    //   237: ldc_w 281
    //   240: invokespecial 284	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   243: invokespecial 258	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   246: astore 7
    //   248: aload 7
    //   250: astore 6
    //   252: aload 7
    //   254: invokevirtual 264	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   257: astore 8
    //   259: aload 8
    //   261: ifnull +438 -> 699
    //   264: aload 7
    //   266: astore 6
    //   268: aload 11
    //   270: aload 8
    //   272: invokeinterface 267 2 0
    //   277: pop
    //   278: goto -30 -> 248
    //   281: astore 6
    //   283: aload 5
    //   285: astore 8
    //   287: aload 7
    //   289: astore 5
    //   291: aload 6
    //   293: astore 7
    //   295: aload 5
    //   297: astore 6
    //   299: ldc -95
    //   301: aload 7
    //   303: ldc -93
    //   305: iconst_0
    //   306: anewarray 4	java/lang/Object
    //   309: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   312: aload 5
    //   314: ifnull +8 -> 322
    //   317: aload 5
    //   319: invokevirtual 271	java/io/BufferedReader:close	()V
    //   322: aload 8
    //   324: ifnull +3 -> 327
    //   327: ldc -95
    //   329: new 72	java/lang/StringBuilder
    //   332: dup
    //   333: ldc_w 286
    //   336: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   339: iload_3
    //   340: invokevirtual 289	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   343: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   346: invokestatic 235	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   349: aload 11
    //   351: invokeinterface 189 1 0
    //   356: istore_2
    //   357: ldc -93
    //   359: astore 6
    //   361: ldc -93
    //   363: astore 5
    //   365: iconst_0
    //   366: istore_1
    //   367: iload_1
    //   368: iload_2
    //   369: if_icmpge +689 -> 1058
    //   372: aload 11
    //   374: iload_1
    //   375: invokeinterface 193 2 0
    //   380: checkcast 89	java/lang/String
    //   383: astore 8
    //   385: iload_1
    //   386: iconst_1
    //   387: iadd
    //   388: iload_2
    //   389: if_icmpge +410 -> 799
    //   392: aload 11
    //   394: iload_1
    //   395: iconst_1
    //   396: iadd
    //   397: invokeinterface 193 2 0
    //   402: checkcast 89	java/lang/String
    //   405: astore 7
    //   407: aload 8
    //   409: ldc_w 291
    //   412: ldc_w 293
    //   415: invokevirtual 297	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   418: ldc_w 299
    //   421: ldc_w 293
    //   424: invokevirtual 297	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   427: astore 8
    //   429: aload 7
    //   431: ldc_w 291
    //   434: ldc_w 293
    //   437: invokevirtual 297	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   440: ldc_w 299
    //   443: ldc_w 293
    //   446: invokevirtual 297	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   449: astore 9
    //   451: aload 8
    //   453: iconst_0
    //   454: bipush 6
    //   456: invokevirtual 103	java/lang/String:substring	(II)Ljava/lang/String;
    //   459: astore 7
    //   461: aload 8
    //   463: bipush 6
    //   465: invokevirtual 111	java/lang/String:substring	(I)Ljava/lang/String;
    //   468: astore 12
    //   470: new 72	java/lang/StringBuilder
    //   473: dup
    //   474: ldc_w 293
    //   477: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   480: aload 12
    //   482: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   488: astore 8
    //   490: getstatic 38	com/tencent/mm/plugin/address/model/l:hux	Ljava/util/regex/Pattern;
    //   493: aload 8
    //   495: invokevirtual 303	java/util/regex/Pattern:split	(Ljava/lang/CharSequence;)[Ljava/lang/String;
    //   498: astore 8
    //   500: aload 8
    //   502: arraylength
    //   503: iconst_3
    //   504: if_icmpne +302 -> 806
    //   507: new 195	com/tencent/mm/plugin/address/model/RcptItem
    //   510: dup
    //   511: aload 8
    //   513: iconst_1
    //   514: aaload
    //   515: aload 7
    //   517: aload 8
    //   519: iconst_2
    //   520: aaload
    //   521: invokespecial 306	com/tencent/mm/plugin/address/model/RcptItem:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   524: astore 8
    //   526: aload 8
    //   528: ifnonnull +284 -> 812
    //   531: ldc -95
    //   533: new 72	java/lang/StringBuilder
    //   536: dup
    //   537: ldc_w 308
    //   540: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   543: aload 12
    //   545: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   548: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   551: invokestatic 311	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   554: aload 6
    //   556: astore 7
    //   558: aload 5
    //   560: astore 6
    //   562: aload 7
    //   564: astore 5
    //   566: aload 6
    //   568: astore 7
    //   570: iload_1
    //   571: iconst_1
    //   572: iadd
    //   573: istore_1
    //   574: aload 5
    //   576: astore 6
    //   578: aload 7
    //   580: astore 5
    //   582: goto -215 -> 367
    //   585: aload 6
    //   587: invokevirtual 270	java/io/FileReader:close	()V
    //   590: aload 5
    //   592: invokevirtual 271	java/io/BufferedReader:close	()V
    //   595: iconst_1
    //   596: istore_3
    //   597: aload 5
    //   599: astore 6
    //   601: goto -394 -> 207
    //   604: astore 6
    //   606: ldc -95
    //   608: aload 6
    //   610: ldc -93
    //   612: iconst_0
    //   613: anewarray 4	java/lang/Object
    //   616: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   619: iconst_1
    //   620: istore_3
    //   621: aload 5
    //   623: astore 6
    //   625: goto -418 -> 207
    //   628: astore 6
    //   630: ldc -95
    //   632: aload 6
    //   634: ldc -93
    //   636: iconst_0
    //   637: anewarray 4	java/lang/Object
    //   640: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   643: aload 5
    //   645: astore 6
    //   647: iload 4
    //   649: istore_3
    //   650: goto -443 -> 207
    //   653: astore 5
    //   655: aconst_null
    //   656: astore 6
    //   658: aload 6
    //   660: ifnull +8 -> 668
    //   663: aload 6
    //   665: invokevirtual 270	java/io/FileReader:close	()V
    //   668: aload 7
    //   670: ifnull +8 -> 678
    //   673: aload 7
    //   675: invokevirtual 271	java/io/BufferedReader:close	()V
    //   678: aload 5
    //   680: athrow
    //   681: astore 6
    //   683: ldc -95
    //   685: aload 6
    //   687: ldc -93
    //   689: iconst_0
    //   690: anewarray 4	java/lang/Object
    //   693: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   696: goto -18 -> 678
    //   699: aload 7
    //   701: astore 6
    //   703: aload 7
    //   705: invokevirtual 271	java/io/BufferedReader:close	()V
    //   708: aload 7
    //   710: astore 6
    //   712: aload 5
    //   714: invokevirtual 314	java/io/InputStream:close	()V
    //   717: aload 7
    //   719: invokevirtual 271	java/io/BufferedReader:close	()V
    //   722: aload 5
    //   724: ifnull -397 -> 327
    //   727: goto -400 -> 327
    //   730: astore 6
    //   732: ldc -95
    //   734: aload 6
    //   736: ldc -93
    //   738: iconst_0
    //   739: anewarray 4	java/lang/Object
    //   742: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   745: goto -23 -> 722
    //   748: astore 5
    //   750: ldc -95
    //   752: aload 5
    //   754: ldc -93
    //   756: iconst_0
    //   757: anewarray 4	java/lang/Object
    //   760: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   763: goto -441 -> 322
    //   766: astore 5
    //   768: aload 6
    //   770: ifnull +8 -> 778
    //   773: aload 6
    //   775: invokevirtual 271	java/io/BufferedReader:close	()V
    //   778: aload 5
    //   780: athrow
    //   781: astore 6
    //   783: ldc -95
    //   785: aload 6
    //   787: ldc -93
    //   789: iconst_0
    //   790: anewarray 4	java/lang/Object
    //   793: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   796: goto -18 -> 778
    //   799: ldc -93
    //   801: astore 7
    //   803: goto -396 -> 407
    //   806: aconst_null
    //   807: astore 8
    //   809: goto -283 -> 526
    //   812: aload 12
    //   814: ldc_w 316
    //   817: invokevirtual 115	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   820: ifeq +83 -> 903
    //   823: aload_0
    //   824: getfield 65	com/tencent/mm/plugin/address/model/l:huw	Ljava/util/HashMap;
    //   827: aload 6
    //   829: invokevirtual 319	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   832: ifne +20 -> 852
    //   835: aload_0
    //   836: getfield 65	com/tencent/mm/plugin/address/model/l:huw	Ljava/util/HashMap;
    //   839: aload 6
    //   841: new 55	java/util/ArrayList
    //   844: dup
    //   845: invokespecial 56	java/util/ArrayList:<init>	()V
    //   848: invokevirtual 323	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   851: pop
    //   852: aload_0
    //   853: getfield 65	com/tencent/mm/plugin/address/model/l:huw	Ljava/util/HashMap;
    //   856: aload 6
    //   858: invokevirtual 326	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   861: checkcast 176	java/util/List
    //   864: astore 7
    //   866: aload 7
    //   868: aload 8
    //   870: invokeinterface 267 2 0
    //   875: pop
    //   876: aload_0
    //   877: getfield 65	com/tencent/mm/plugin/address/model/l:huw	Ljava/util/HashMap;
    //   880: aload 6
    //   882: aload 7
    //   884: invokevirtual 323	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   887: pop
    //   888: aload 5
    //   890: astore 7
    //   892: aload 6
    //   894: astore 5
    //   896: aload 7
    //   898: astore 6
    //   900: goto -334 -> 566
    //   903: aload 12
    //   905: ldc_w 328
    //   908: invokevirtual 115	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   911: ifeq +96 -> 1007
    //   914: aload_0
    //   915: getfield 63	com/tencent/mm/plugin/address/model/l:huv	Ljava/util/HashMap;
    //   918: aload 5
    //   920: invokevirtual 319	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   923: ifne +20 -> 943
    //   926: aload_0
    //   927: getfield 63	com/tencent/mm/plugin/address/model/l:huv	Ljava/util/HashMap;
    //   930: aload 5
    //   932: new 55	java/util/ArrayList
    //   935: dup
    //   936: invokespecial 56	java/util/ArrayList:<init>	()V
    //   939: invokevirtual 323	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   942: pop
    //   943: aload_0
    //   944: getfield 63	com/tencent/mm/plugin/address/model/l:huv	Ljava/util/HashMap;
    //   947: aload 5
    //   949: invokevirtual 326	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   952: checkcast 176	java/util/List
    //   955: astore 6
    //   957: aload 9
    //   959: ldc_w 316
    //   962: invokestatic 330	com/tencent/mm/plugin/address/model/l:ax	(Ljava/lang/String;Ljava/lang/String;)Z
    //   965: ifeq +9 -> 974
    //   968: aload 8
    //   970: iconst_1
    //   971: putfield 334	com/tencent/mm/plugin/address/model/RcptItem:hus	Z
    //   974: aload 6
    //   976: aload 8
    //   978: invokeinterface 267 2 0
    //   983: pop
    //   984: aload_0
    //   985: getfield 63	com/tencent/mm/plugin/address/model/l:huv	Ljava/util/HashMap;
    //   988: aload 5
    //   990: aload 6
    //   992: invokevirtual 323	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   995: pop
    //   996: aload 5
    //   998: astore 6
    //   1000: aload 7
    //   1002: astore 5
    //   1004: goto -438 -> 566
    //   1007: aload 12
    //   1009: ldc_w 293
    //   1012: invokevirtual 115	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1015: ifeq +231 -> 1246
    //   1018: aload 9
    //   1020: ldc_w 328
    //   1023: invokestatic 330	com/tencent/mm/plugin/address/model/l:ax	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1026: ifeq +9 -> 1035
    //   1029: aload 8
    //   1031: iconst_1
    //   1032: putfield 334	com/tencent/mm/plugin/address/model/RcptItem:hus	Z
    //   1035: aload_0
    //   1036: getfield 58	com/tencent/mm/plugin/address/model/l:huu	Ljava/util/List;
    //   1039: aload 8
    //   1041: invokeinterface 267 2 0
    //   1046: pop
    //   1047: aload 6
    //   1049: astore 5
    //   1051: aload 7
    //   1053: astore 6
    //   1055: goto -489 -> 566
    //   1058: aload_0
    //   1059: new 72	java/lang/StringBuilder
    //   1062: dup
    //   1063: invokespecial 250	java/lang/StringBuilder:<init>	()V
    //   1066: aload 10
    //   1068: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1071: ldc 74
    //   1073: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1076: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1079: putfield 79	com/tencent/mm/plugin/address/model/l:path	Ljava/lang/String;
    //   1082: new 336	java/io/File
    //   1085: dup
    //   1086: aload_0
    //   1087: getfield 79	com/tencent/mm/plugin/address/model/l:path	Ljava/lang/String;
    //   1090: invokespecial 337	java/io/File:<init>	(Ljava/lang/String;)V
    //   1093: astore 5
    //   1095: aload 5
    //   1097: invokevirtual 340	java/io/File:exists	()Z
    //   1100: ifne +9 -> 1109
    //   1103: aload 5
    //   1105: invokevirtual 343	java/io/File:mkdir	()Z
    //   1108: pop
    //   1109: aload_0
    //   1110: getfield 79	com/tencent/mm/plugin/address/model/l:path	Ljava/lang/String;
    //   1113: iconst_0
    //   1114: iconst_m1
    //   1115: invokestatic 349	com/tencent/mm/a/e:c	(Ljava/lang/String;II)[B
    //   1118: aload_0
    //   1119: invokespecial 351	com/tencent/mm/plugin/address/model/l:QR	()[B
    //   1122: invokestatic 353	com/tencent/mm/plugin/address/model/l:decrypt	([B[B)[B
    //   1125: astore 5
    //   1127: aload_0
    //   1128: new 50	com/tencent/mm/plugin/address/d/a
    //   1131: dup
    //   1132: invokespecial 51	com/tencent/mm/plugin/address/d/a:<init>	()V
    //   1135: aload 5
    //   1137: invokevirtual 357	com/tencent/mm/plugin/address/d/a:aD	([B)Lcom/tencent/mm/bm/a;
    //   1140: checkcast 50	com/tencent/mm/plugin/address/d/a
    //   1143: putfield 53	com/tencent/mm/plugin/address/model/l:hut	Lcom/tencent/mm/plugin/address/d/a;
    //   1146: ldc2_w 212
    //   1149: ldc -42
    //   1151: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1154: return
    //   1155: astore 5
    //   1157: ldc -95
    //   1159: aload 5
    //   1161: ldc -93
    //   1163: iconst_0
    //   1164: anewarray 4	java/lang/Object
    //   1167: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1170: ldc2_w 212
    //   1173: ldc -42
    //   1175: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1178: return
    //   1179: astore 5
    //   1181: goto -413 -> 768
    //   1184: astore 7
    //   1186: aload 6
    //   1188: astore 5
    //   1190: aconst_null
    //   1191: astore 8
    //   1193: goto -898 -> 295
    //   1196: astore 7
    //   1198: aload 5
    //   1200: astore 8
    //   1202: aload 6
    //   1204: astore 5
    //   1206: goto -911 -> 295
    //   1209: astore 5
    //   1211: goto -553 -> 658
    //   1214: astore 5
    //   1216: aload 7
    //   1218: astore 6
    //   1220: aload 9
    //   1222: astore 7
    //   1224: goto -566 -> 658
    //   1227: astore 8
    //   1229: aconst_null
    //   1230: astore 6
    //   1232: aconst_null
    //   1233: astore 5
    //   1235: goto -1083 -> 152
    //   1238: astore 8
    //   1240: aconst_null
    //   1241: astore 5
    //   1243: goto -1091 -> 152
    //   1246: aload 5
    //   1248: astore 7
    //   1250: aload 6
    //   1252: astore 5
    //   1254: aload 7
    //   1256: astore 6
    //   1258: goto -692 -> 566
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1261	0	this	l
    //   366	208	1	i	int
    //   356	34	2	j	int
    //   189	461	3	bool1	boolean
    //   52	596	4	bool2	boolean
    //   92	552	5	localObject1	Object
    //   653	70	5	localObject2	Object
    //   748	5	5	localIOException1	java.io.IOException
    //   766	123	5	localObject3	Object
    //   894	242	5	localObject4	Object
    //   1155	5	5	localException1	Exception
    //   1179	1	5	localObject5	Object
    //   1188	17	5	localObject6	Object
    //   1209	1	5	localObject7	Object
    //   1214	1	5	localObject8	Object
    //   1233	20	5	localObject9	Object
    //   81	186	6	localObject10	Object
    //   281	11	6	localIOException2	java.io.IOException
    //   297	303	6	localObject11	Object
    //   604	5	6	localException2	Exception
    //   623	1	6	localObject12	Object
    //   628	5	6	localException3	Exception
    //   645	19	6	localObject13	Object
    //   681	5	6	localException4	Exception
    //   701	10	6	localObject14	Object
    //   730	44	6	localIOException3	java.io.IOException
    //   781	112	6	localIOException4	java.io.IOException
    //   898	359	6	localObject15	Object
    //   40	1012	7	localObject16	Object
    //   1184	1	7	localIOException5	java.io.IOException
    //   1196	21	7	localIOException6	java.io.IOException
    //   1222	33	7	localObject17	Object
    //   122	18	8	str1	String
    //   150	13	8	localIOException7	java.io.IOException
    //   257	944	8	localObject18	Object
    //   1227	1	8	localIOException8	java.io.IOException
    //   1238	1	8	localIOException9	java.io.IOException
    //   100	1121	9	localObject19	Object
    //   22	1045	10	str2	String
    //   49	344	11	localArrayList	ArrayList
    //   37	971	12	localObject20	Object
    // Exception table:
    //   from	to	target	type
    //   102	109	150	java/io/IOException
    //   117	124	150	java/io/IOException
    //   137	147	150	java/io/IOException
    //   252	259	281	java/io/IOException
    //   268	278	281	java/io/IOException
    //   703	708	281	java/io/IOException
    //   712	717	281	java/io/IOException
    //   585	595	604	java/lang/Exception
    //   178	183	628	java/lang/Exception
    //   195	200	628	java/lang/Exception
    //   54	83	653	finally
    //   663	668	681	java/lang/Exception
    //   673	678	681	java/lang/Exception
    //   717	722	730	java/io/IOException
    //   317	322	748	java/io/IOException
    //   211	227	766	finally
    //   227	248	766	finally
    //   773	778	781	java/io/IOException
    //   1127	1146	1155	java/lang/Exception
    //   252	259	1179	finally
    //   268	278	1179	finally
    //   299	312	1179	finally
    //   703	708	1179	finally
    //   712	717	1179	finally
    //   211	227	1184	java/io/IOException
    //   227	248	1196	java/io/IOException
    //   83	94	1209	finally
    //   102	109	1214	finally
    //   117	124	1214	finally
    //   137	147	1214	finally
    //   160	173	1214	finally
    //   54	83	1227	java/io/IOException
    //   83	94	1238	java/io/IOException
  }
  
  public final void QQ()
  {
    GMTrace.i(12790681042944L, 95298);
    try
    {
      byte[] arrayOfByte = this.hut.toByteArray();
      long l = System.currentTimeMillis();
      arrayOfByte = encrypt(arrayOfByte, QR());
      com.tencent.mm.loader.stub.b.deleteFile(this.path);
      e.b(this.path, arrayOfByte, arrayOfByte.length);
      w.d("MicroMsg.WalletAddrMgr", "hakon saveAddr time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(12790681042944L, 95298);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.WalletAddrMgr", localException, "", new Object[0]);
      GMTrace.o(12790681042944L, 95298);
    }
  }
  
  public final boolean a(com.tencent.mm.plugin.address.d.b paramb)
  {
    GMTrace.i(12790412607488L, 95296);
    if (this.hut == null) {
      this.hut = new a();
    }
    int i = 0;
    while (i < this.hut.huB.size())
    {
      if (((com.tencent.mm.plugin.address.d.b)this.hut.huB.get(i)).id == paramb.id)
      {
        this.hut.huB.remove(i);
        GMTrace.o(12790412607488L, 95296);
        return true;
      }
      i += 1;
    }
    GMTrace.o(12790412607488L, 95296);
    return false;
  }
  
  public final com.tencent.mm.plugin.address.d.b hM(int paramInt)
  {
    GMTrace.i(12790278389760L, 95295);
    int i = 0;
    while (i < this.hut.huB.size())
    {
      com.tencent.mm.plugin.address.d.b localb = (com.tencent.mm.plugin.address.d.b)this.hut.huB.get(i);
      if (localb.id == paramInt)
      {
        GMTrace.o(12790278389760L, 95295);
        return localb;
      }
      i += 1;
    }
    GMTrace.o(12790278389760L, 95295);
    return null;
  }
  
  public final List<RcptItem> nE(String paramString)
  {
    GMTrace.i(12791217913856L, 95302);
    if (this.huv.containsKey(paramString))
    {
      paramString = (List)this.huv.get(paramString);
      GMTrace.o(12791217913856L, 95302);
      return paramString;
    }
    paramString = new ArrayList();
    GMTrace.o(12791217913856L, 95302);
    return paramString;
  }
  
  public final List<RcptItem> nF(String paramString)
  {
    GMTrace.i(12791352131584L, 95303);
    if (this.huw.containsKey(paramString))
    {
      paramString = (List)this.huw.get(paramString);
      GMTrace.o(12791352131584L, 95303);
      return paramString;
    }
    paramString = new ArrayList();
    GMTrace.o(12791352131584L, 95303);
    return paramString;
  }
  
  public final boolean q(LinkedList<axg> paramLinkedList)
  {
    GMTrace.i(12790546825216L, 95297);
    this.hut.huB.clear();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      axg localaxg = (axg)paramLinkedList.next();
      com.tencent.mm.plugin.address.d.b localb = new com.tencent.mm.plugin.address.d.b();
      localb.id = localaxg.id;
      localb.huK = localaxg.uMi.uNR;
      localb.huE = localaxg.uMc.uNR;
      localb.huH = localaxg.uMf.uNR;
      localb.huF = localaxg.uMd.uNR;
      localb.huI = localaxg.uMg.uNR;
      localb.huJ = localaxg.uMh.uNR;
      localb.huD = localaxg.uMb.uNR;
      localb.huG = localaxg.uMe.uNR;
      this.hut.huB.add(localb);
    }
    GMTrace.o(12790546825216L, 95297);
    return true;
  }
  
  public final RcptItem s(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12791620567040L, 95305);
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      GMTrace.o(12791620567040L, 95305);
      return null;
    }
    paramString1 = e(this.huu, paramString1);
    if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.code)))
    {
      GMTrace.o(12791620567040L, 95305);
      return null;
    }
    paramString1 = e(nE(paramString1.code), paramString2);
    if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.code)))
    {
      GMTrace.o(12791620567040L, 95305);
      return null;
    }
    if (TextUtils.isEmpty(paramString3))
    {
      GMTrace.o(12791620567040L, 95305);
      return paramString1;
    }
    paramString2 = e(nF(paramString1.code), paramString3);
    if (paramString2 == null)
    {
      GMTrace.o(12791620567040L, 95305);
      return paramString1;
    }
    GMTrace.o(12791620567040L, 95305);
    return paramString2;
  }
  
  public final boolean t(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12791889002496L, 95307);
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      GMTrace.o(12791889002496L, 95307);
      return false;
    }
    paramString1 = e(this.huu, paramString1);
    if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.code)))
    {
      GMTrace.o(12791889002496L, 95307);
      return false;
    }
    paramString1 = e(nE(paramString1.code), paramString2);
    if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.code)))
    {
      GMTrace.o(12791889002496L, 95307);
      return false;
    }
    if (TextUtils.isEmpty(paramString3))
    {
      GMTrace.o(12791889002496L, 95307);
      return true;
    }
    if (e(nF(paramString1.code), paramString3) == null)
    {
      GMTrace.o(12791889002496L, 95307);
      return false;
    }
    GMTrace.o(12791889002496L, 95307);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */