package com.tencent.recovery.wx.service;

import android.os.PowerManager;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryData;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.service.RecoveryHandleService;
import com.tencent.recovery.wx.util.NetUtil;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;

public class WXRecoveryHandleService
  extends RecoveryHandleService
{
  private PowerManager rzN;
  
  private static boolean XN(String paramString)
  {
    boolean bool2 = false;
    try
    {
      paramString = InetAddress.getByName(paramString);
      boolean bool1 = bool2;
      if (paramString != null)
      {
        paramString = paramString.getHostAddress();
        bool1 = bool2;
        if (paramString != null) {
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  private RecoveryHandleItem a(RecoveryData paramRecoveryData, String paramString)
  {
    RecoveryHandleItem localRecoveryHandleItem = new RecoveryHandleItem();
    localRecoveryHandleItem.lOv = paramRecoveryData.lOv;
    localRecoveryHandleItem.clientVersion = paramRecoveryData.clientVersion;
    localRecoveryHandleItem.timestamp = System.currentTimeMillis();
    localRecoveryHandleItem.amf = paramString;
    localRecoveryHandleItem.processName = paramRecoveryData.processName;
    paramRecoveryData = NetUtil.fS(this);
    boolean bool1 = this.rzN.isScreenOn();
    boolean bool2 = XN("dldir1.qq.com");
    boolean bool3 = XN("www.qq.com");
    localRecoveryHandleItem.xPJ = (paramRecoveryData + "|" + bool1 + "|" + bool2 + "|" + bool3);
    return localRecoveryHandleItem;
  }
  
  /* Error */
  private static String a(String paramString, RecoveryHandleItem paramRecoveryHandleItem)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_0
    //   6: ldc 101
    //   8: invokevirtual 106	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   11: ifeq +141 -> 152
    //   14: new 108	java/io/File
    //   17: dup
    //   18: aload_0
    //   19: ldc 101
    //   21: ldc 110
    //   23: invokevirtual 114	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   26: invokespecial 117	java/io/File:<init>	(Ljava/lang/String;)V
    //   29: astore_0
    //   30: new 119	java/io/FileInputStream
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 122	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   38: astore_0
    //   39: aload_0
    //   40: invokestatic 128	com/tencent/recovery/wx/util/FileUtil:c	(Ljava/io/InputStream;)[B
    //   43: astore_3
    //   44: aload_0
    //   45: invokevirtual 133	java/io/InputStream:close	()V
    //   48: aload_3
    //   49: astore_0
    //   50: aload_0
    //   51: ifnull +450 -> 501
    //   54: aload_0
    //   55: invokestatic 139	com/tencent/recovery/wx/util/EncryptUtil:n	([B)Ljava/lang/String;
    //   58: astore_3
    //   59: ldc -115
    //   61: ldc -113
    //   63: iconst_1
    //   64: anewarray 145	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload_3
    //   70: aastore
    //   71: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   74: aload_0
    //   75: ldc -103
    //   77: invokestatic 156	com/tencent/recovery/wx/util/EncryptUtil:i	([BLjava/lang/String;)[B
    //   80: astore_0
    //   81: aload_0
    //   82: ifnonnull +349 -> 431
    //   85: aload_1
    //   86: new 80	java/lang/StringBuilder
    //   89: dup
    //   90: ldc -98
    //   92: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   95: aload_3
    //   96: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: ldc -95
    //   101: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   110: aconst_null
    //   111: areturn
    //   112: astore_0
    //   113: aconst_null
    //   114: astore_0
    //   115: aload_0
    //   116: ifnull +31 -> 147
    //   119: aload_0
    //   120: invokevirtual 133	java/io/InputStream:close	()V
    //   123: aconst_null
    //   124: astore_0
    //   125: goto -75 -> 50
    //   128: astore_0
    //   129: aconst_null
    //   130: astore_0
    //   131: goto -81 -> 50
    //   134: astore_0
    //   135: aload_3
    //   136: astore_1
    //   137: aload_1
    //   138: ifnull +7 -> 145
    //   141: aload_1
    //   142: invokevirtual 133	java/io/InputStream:close	()V
    //   145: aload_0
    //   146: athrow
    //   147: aconst_null
    //   148: astore_0
    //   149: goto -99 -> 50
    //   152: aload_0
    //   153: invokestatic 167	com/tencent/recovery/wx/util/WXUtil:XO	(Ljava/lang/String;)Ljava/lang/String;
    //   156: astore_0
    //   157: new 169	java/net/URL
    //   160: dup
    //   161: aload_0
    //   162: invokespecial 170	java/net/URL:<init>	(Ljava/lang/String;)V
    //   165: invokevirtual 174	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   168: checkcast 176	java/net/HttpURLConnection
    //   171: astore_3
    //   172: aload_3
    //   173: ldc -78
    //   175: invokevirtual 181	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   178: aload_3
    //   179: sipush 10000
    //   182: invokevirtual 185	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   185: aload_3
    //   186: sipush 20000
    //   189: invokevirtual 188	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   192: aload_3
    //   193: invokevirtual 191	java/net/HttpURLConnection:connect	()V
    //   196: aload_3
    //   197: invokevirtual 195	java/net/HttpURLConnection:getResponseCode	()I
    //   200: istore_2
    //   201: iload_2
    //   202: sipush 200
    //   205: if_icmpeq +44 -> 249
    //   208: aload_1
    //   209: iload_2
    //   210: invokestatic 199	com/tencent/recovery/wx/util/WXUtil:EX	(I)Ljava/lang/String;
    //   213: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   216: aconst_null
    //   217: astore 6
    //   219: aconst_null
    //   220: astore 4
    //   222: aload 6
    //   224: ifnull +8 -> 232
    //   227: aload 6
    //   229: invokevirtual 133	java/io/InputStream:close	()V
    //   232: aload 4
    //   234: astore_0
    //   235: aload_3
    //   236: ifnull -186 -> 50
    //   239: aload_3
    //   240: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   243: aload 4
    //   245: astore_0
    //   246: goto -196 -> 50
    //   249: aload_3
    //   250: invokevirtual 206	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   253: astore_0
    //   254: aload_0
    //   255: ifnonnull +18 -> 273
    //   258: aload_1
    //   259: ldc -48
    //   261: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   264: aconst_null
    //   265: astore 4
    //   267: aload_0
    //   268: astore 6
    //   270: goto -48 -> 222
    //   273: aload_0
    //   274: invokestatic 209	com/tencent/recovery/wx/service/WXRecoveryHandleService:c	(Ljava/io/InputStream;)[B
    //   277: astore 5
    //   279: aload 5
    //   281: ifnonnull +96 -> 377
    //   284: aload_1
    //   285: ldc -45
    //   287: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   290: aload_0
    //   291: astore 6
    //   293: aload 5
    //   295: astore 4
    //   297: goto -75 -> 222
    //   300: astore 6
    //   302: aload 5
    //   304: astore 4
    //   306: aload 6
    //   308: astore 5
    //   310: ldc -115
    //   312: aload 5
    //   314: ldc -43
    //   316: iconst_0
    //   317: anewarray 145	java/lang/Object
    //   320: invokestatic 217	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   323: aload_1
    //   324: new 80	java/lang/StringBuilder
    //   327: dup
    //   328: ldc -37
    //   330: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   333: aload 5
    //   335: invokevirtual 222	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   338: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: ldc -95
    //   343: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   349: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   352: aload_0
    //   353: ifnull +7 -> 360
    //   356: aload_0
    //   357: invokevirtual 133	java/io/InputStream:close	()V
    //   360: aload 4
    //   362: astore_0
    //   363: aload_3
    //   364: ifnull -314 -> 50
    //   367: aload_3
    //   368: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   371: aload 4
    //   373: astore_0
    //   374: goto -324 -> 50
    //   377: aload_0
    //   378: astore 6
    //   380: aload 5
    //   382: astore 4
    //   384: aload 5
    //   386: arraylength
    //   387: ifne -165 -> 222
    //   390: aload_1
    //   391: ldc -32
    //   393: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   396: aload_0
    //   397: astore 6
    //   399: aload 5
    //   401: astore 4
    //   403: goto -181 -> 222
    //   406: astore 4
    //   408: aload_0
    //   409: astore_1
    //   410: aload 4
    //   412: astore_0
    //   413: aload_1
    //   414: ifnull +7 -> 421
    //   417: aload_1
    //   418: invokevirtual 133	java/io/InputStream:close	()V
    //   421: aload_3
    //   422: ifnull +7 -> 429
    //   425: aload_3
    //   426: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   429: aload_0
    //   430: athrow
    //   431: ldc -115
    //   433: ldc -30
    //   435: iconst_1
    //   436: anewarray 145	java/lang/Object
    //   439: dup
    //   440: iconst_0
    //   441: aload_0
    //   442: invokestatic 139	com/tencent/recovery/wx/util/EncryptUtil:n	([B)Ljava/lang/String;
    //   445: aastore
    //   446: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   449: new 103	java/lang/String
    //   452: dup
    //   453: aload_0
    //   454: invokespecial 229	java/lang/String:<init>	([B)V
    //   457: astore_0
    //   458: aload_0
    //   459: areturn
    //   460: astore_0
    //   461: ldc -115
    //   463: aload_0
    //   464: ldc -43
    //   466: iconst_0
    //   467: anewarray 145	java/lang/Object
    //   470: invokestatic 217	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   473: aload_1
    //   474: new 80	java/lang/StringBuilder
    //   477: dup
    //   478: ldc -25
    //   480: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   483: aload_0
    //   484: invokevirtual 222	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   487: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   490: ldc -95
    //   492: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   498: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   501: aconst_null
    //   502: areturn
    //   503: astore_0
    //   504: aload_3
    //   505: astore_0
    //   506: goto -456 -> 50
    //   509: astore_1
    //   510: goto -365 -> 145
    //   513: astore_0
    //   514: goto -282 -> 232
    //   517: astore_0
    //   518: goto -158 -> 360
    //   521: astore_1
    //   522: goto -101 -> 421
    //   525: astore_0
    //   526: aconst_null
    //   527: astore_3
    //   528: aload 4
    //   530: astore_1
    //   531: goto -118 -> 413
    //   534: astore_0
    //   535: aload 4
    //   537: astore_1
    //   538: goto -125 -> 413
    //   541: astore 4
    //   543: aload_0
    //   544: astore_1
    //   545: aload 4
    //   547: astore_0
    //   548: goto -135 -> 413
    //   551: astore 5
    //   553: aconst_null
    //   554: astore_0
    //   555: aconst_null
    //   556: astore_3
    //   557: aconst_null
    //   558: astore 4
    //   560: goto -250 -> 310
    //   563: astore 5
    //   565: aconst_null
    //   566: astore 4
    //   568: aconst_null
    //   569: astore_0
    //   570: goto -260 -> 310
    //   573: astore 5
    //   575: aconst_null
    //   576: astore 4
    //   578: goto -268 -> 310
    //   581: astore_3
    //   582: aload_0
    //   583: astore_1
    //   584: aload_3
    //   585: astore_0
    //   586: goto -449 -> 137
    //   589: astore_3
    //   590: goto -475 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	593	0	paramString	String
    //   0	593	1	paramRecoveryHandleItem	RecoveryHandleItem
    //   200	10	2	i	int
    //   4	553	3	localObject1	Object
    //   581	4	3	localObject2	Object
    //   589	1	3	localException1	Exception
    //   1	401	4	localObject3	Object
    //   406	130	4	localObject4	Object
    //   541	5	4	localObject5	Object
    //   558	19	4	localObject6	Object
    //   277	123	5	localObject7	Object
    //   551	1	5	localException2	Exception
    //   563	1	5	localException3	Exception
    //   573	1	5	localException4	Exception
    //   217	75	6	str1	String
    //   300	7	6	localException5	Exception
    //   378	20	6	str2	String
    // Exception table:
    //   from	to	target	type
    //   30	39	112	java/lang/Exception
    //   119	123	128	java/io/IOException
    //   30	39	134	finally
    //   284	290	300	java/lang/Exception
    //   384	396	300	java/lang/Exception
    //   258	264	406	finally
    //   273	279	406	finally
    //   284	290	406	finally
    //   384	396	406	finally
    //   54	81	460	java/lang/Exception
    //   85	110	460	java/lang/Exception
    //   431	458	460	java/lang/Exception
    //   44	48	503	java/io/IOException
    //   141	145	509	java/io/IOException
    //   227	232	513	java/io/IOException
    //   356	360	517	java/io/IOException
    //   417	421	521	java/io/IOException
    //   157	172	525	finally
    //   172	201	534	finally
    //   208	216	534	finally
    //   249	254	534	finally
    //   310	352	541	finally
    //   157	172	551	java/lang/Exception
    //   172	201	563	java/lang/Exception
    //   208	216	563	java/lang/Exception
    //   249	254	563	java/lang/Exception
    //   258	264	573	java/lang/Exception
    //   273	279	573	java/lang/Exception
    //   39	44	581	finally
    //   39	44	589	java/lang/Exception
  }
  
  /* Error */
  private static byte[] a(String paramString1, String paramString2, RecoveryHandleItem paramRecoveryHandleItem)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 4
    //   6: aconst_null
    //   7: astore 5
    //   9: aload_0
    //   10: ldc 101
    //   12: invokevirtual 106	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   15: ifeq +73 -> 88
    //   18: new 108	java/io/File
    //   21: dup
    //   22: aload_0
    //   23: ldc 101
    //   25: ldc 110
    //   27: invokevirtual 114	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   30: invokespecial 117	java/io/File:<init>	(Ljava/lang/String;)V
    //   33: astore_0
    //   34: new 119	java/io/FileInputStream
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 122	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   42: astore_0
    //   43: aload_0
    //   44: invokestatic 209	com/tencent/recovery/wx/service/WXRecoveryHandleService:c	(Ljava/io/InputStream;)[B
    //   47: astore_1
    //   48: aload_0
    //   49: invokevirtual 133	java/io/InputStream:close	()V
    //   52: aload_1
    //   53: astore_2
    //   54: aload_2
    //   55: areturn
    //   56: astore_0
    //   57: aconst_null
    //   58: astore_0
    //   59: aload_0
    //   60: ifnull +26 -> 86
    //   63: aload_0
    //   64: invokevirtual 133	java/io/InputStream:close	()V
    //   67: aconst_null
    //   68: areturn
    //   69: astore_0
    //   70: aconst_null
    //   71: areturn
    //   72: astore_0
    //   73: aload 5
    //   75: astore_1
    //   76: aload_1
    //   77: ifnull +7 -> 84
    //   80: aload_1
    //   81: invokevirtual 133	java/io/InputStream:close	()V
    //   84: aload_0
    //   85: athrow
    //   86: aconst_null
    //   87: areturn
    //   88: aload_0
    //   89: invokestatic 167	com/tencent/recovery/wx/util/WXUtil:XO	(Ljava/lang/String;)Ljava/lang/String;
    //   92: astore_0
    //   93: new 169	java/net/URL
    //   96: dup
    //   97: aload_0
    //   98: invokespecial 170	java/net/URL:<init>	(Ljava/lang/String;)V
    //   101: invokevirtual 174	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   104: checkcast 176	java/net/HttpURLConnection
    //   107: astore_0
    //   108: aload_0
    //   109: ldc -78
    //   111: invokevirtual 181	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   114: aload_0
    //   115: sipush 10000
    //   118: invokevirtual 185	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   121: aload_0
    //   122: sipush 20000
    //   125: invokevirtual 188	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   128: aload_0
    //   129: invokevirtual 191	java/net/HttpURLConnection:connect	()V
    //   132: aload_0
    //   133: invokevirtual 195	java/net/HttpURLConnection:getResponseCode	()I
    //   136: istore_3
    //   137: iload_3
    //   138: sipush 200
    //   141: if_icmpeq +37 -> 178
    //   144: aload_2
    //   145: iload_3
    //   146: invokestatic 235	com/tencent/recovery/wx/util/WXUtil:EY	(I)Ljava/lang/String;
    //   149: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   152: aconst_null
    //   153: astore 4
    //   155: aload 6
    //   157: astore_1
    //   158: aload 4
    //   160: ifnull +8 -> 168
    //   163: aload 4
    //   165: invokevirtual 133	java/io/InputStream:close	()V
    //   168: aload_0
    //   169: ifnull +300 -> 469
    //   172: aload_0
    //   173: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   176: aload_1
    //   177: areturn
    //   178: aload_0
    //   179: invokevirtual 206	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   182: astore 5
    //   184: aload 5
    //   186: astore 4
    //   188: aload 4
    //   190: ifnonnull +89 -> 279
    //   193: aload_2
    //   194: ldc -19
    //   196: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   199: aload 6
    //   201: astore_1
    //   202: goto -44 -> 158
    //   205: astore 5
    //   207: aconst_null
    //   208: astore 6
    //   210: aload_0
    //   211: astore_1
    //   212: aload 6
    //   214: astore_0
    //   215: ldc -115
    //   217: aload 5
    //   219: ldc -17
    //   221: iconst_0
    //   222: anewarray 145	java/lang/Object
    //   225: invokestatic 217	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   228: aload_2
    //   229: new 80	java/lang/StringBuilder
    //   232: dup
    //   233: ldc -15
    //   235: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   238: aload 5
    //   240: invokevirtual 222	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   243: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: ldc -95
    //   248: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   254: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   257: aload 4
    //   259: ifnull +8 -> 267
    //   262: aload 4
    //   264: invokevirtual 133	java/io/InputStream:close	()V
    //   267: aload_0
    //   268: astore_2
    //   269: aload_1
    //   270: ifnull -216 -> 54
    //   273: aload_1
    //   274: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   277: aload_0
    //   278: areturn
    //   279: aload 4
    //   281: invokestatic 128	com/tencent/recovery/wx/util/FileUtil:c	(Ljava/io/InputStream;)[B
    //   284: astore 5
    //   286: aload 5
    //   288: ifnonnull +15 -> 303
    //   291: aload_2
    //   292: ldc -13
    //   294: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   297: aload 5
    //   299: astore_1
    //   300: goto -142 -> 158
    //   303: aload 5
    //   305: arraylength
    //   306: ifne +15 -> 321
    //   309: aload_2
    //   310: ldc -11
    //   312: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   315: aload 5
    //   317: astore_1
    //   318: goto -160 -> 158
    //   321: aload 5
    //   323: invokestatic 139	com/tencent/recovery/wx/util/EncryptUtil:n	([B)Ljava/lang/String;
    //   326: aload_1
    //   327: invokevirtual 249	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   330: ifne +141 -> 471
    //   333: aload_2
    //   334: ldc -5
    //   336: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   339: aload 6
    //   341: astore_1
    //   342: goto -184 -> 158
    //   345: astore 6
    //   347: aload_0
    //   348: astore_1
    //   349: aload 5
    //   351: astore_0
    //   352: aload 6
    //   354: astore 5
    //   356: goto -141 -> 215
    //   359: astore_0
    //   360: aconst_null
    //   361: astore_1
    //   362: aload 4
    //   364: astore_2
    //   365: aload_2
    //   366: ifnull +7 -> 373
    //   369: aload_2
    //   370: invokevirtual 133	java/io/InputStream:close	()V
    //   373: aload_1
    //   374: ifnull +7 -> 381
    //   377: aload_1
    //   378: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   381: aload_0
    //   382: athrow
    //   383: astore_0
    //   384: aload_1
    //   385: areturn
    //   386: astore_1
    //   387: goto -303 -> 84
    //   390: astore_2
    //   391: goto -223 -> 168
    //   394: astore_2
    //   395: goto -128 -> 267
    //   398: astore_2
    //   399: goto -26 -> 373
    //   402: astore_2
    //   403: aload_0
    //   404: astore_1
    //   405: aload_2
    //   406: astore_0
    //   407: aload 4
    //   409: astore_2
    //   410: goto -45 -> 365
    //   413: astore 5
    //   415: aload 4
    //   417: astore_2
    //   418: aload_0
    //   419: astore_1
    //   420: aload 5
    //   422: astore_0
    //   423: goto -58 -> 365
    //   426: astore_0
    //   427: aload 4
    //   429: astore_2
    //   430: goto -65 -> 365
    //   433: astore 5
    //   435: aconst_null
    //   436: astore 4
    //   438: aconst_null
    //   439: astore_1
    //   440: aconst_null
    //   441: astore_0
    //   442: goto -227 -> 215
    //   445: astore 5
    //   447: aload_0
    //   448: astore_1
    //   449: aconst_null
    //   450: astore_0
    //   451: aconst_null
    //   452: astore 4
    //   454: goto -239 -> 215
    //   457: astore_2
    //   458: aload_0
    //   459: astore_1
    //   460: aload_2
    //   461: astore_0
    //   462: goto -386 -> 76
    //   465: astore_1
    //   466: goto -407 -> 59
    //   469: aload_1
    //   470: areturn
    //   471: aload 5
    //   473: astore_1
    //   474: goto -316 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	477	0	paramString1	String
    //   0	477	1	paramString2	String
    //   0	477	2	paramRecoveryHandleItem	RecoveryHandleItem
    //   136	10	3	i	int
    //   4	449	4	localObject1	Object
    //   7	178	5	localInputStream	InputStream
    //   205	34	5	localException1	Exception
    //   284	71	5	localObject2	Object
    //   413	8	5	localObject3	Object
    //   433	1	5	localException2	Exception
    //   445	27	5	localException3	Exception
    //   1	339	6	localObject4	Object
    //   345	8	6	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   34	43	56	java/lang/Exception
    //   63	67	69	java/io/IOException
    //   34	43	72	finally
    //   193	199	205	java/lang/Exception
    //   279	286	205	java/lang/Exception
    //   291	297	345	java/lang/Exception
    //   303	315	345	java/lang/Exception
    //   321	339	345	java/lang/Exception
    //   93	108	359	finally
    //   48	52	383	java/io/IOException
    //   80	84	386	java/io/IOException
    //   163	168	390	java/io/IOException
    //   262	267	394	java/io/IOException
    //   369	373	398	java/io/IOException
    //   108	137	402	finally
    //   144	152	402	finally
    //   178	184	402	finally
    //   193	199	413	finally
    //   279	286	413	finally
    //   291	297	413	finally
    //   303	315	413	finally
    //   321	339	413	finally
    //   215	257	426	finally
    //   93	108	433	java/lang/Exception
    //   108	137	445	java/lang/Exception
    //   144	152	445	java/lang/Exception
    //   178	184	445	java/lang/Exception
    //   43	48	457	finally
    //   43	48	465	java/lang/Exception
  }
  
  private static byte[] c(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte, 0, 1024);
      if (i <= 0) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  /* Error */
  protected final com.tencent.recovery.model.RecoveryHandleResult a(android.content.Context paramContext, RecoveryData paramRecoveryData, ArrayList<RecoveryHandleItem> paramArrayList, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 269	com/tencent/recovery/model/RecoveryHandleResult
    //   3: dup
    //   4: invokespecial 270	com/tencent/recovery/model/RecoveryHandleResult:<init>	()V
    //   7: astore 8
    //   9: aload_3
    //   10: aload_0
    //   11: aload_2
    //   12: ldc_w 272
    //   15: iconst_2
    //   16: anewarray 145	java/lang/Object
    //   19: dup
    //   20: iconst_0
    //   21: ldc_w 274
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: iload 4
    //   29: invokestatic 280	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   32: aastore
    //   33: invokestatic 284	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   36: invokespecial 286	com/tencent/recovery/wx/service/WXRecoveryHandleService:a	(Lcom/tencent/recovery/model/RecoveryData;Ljava/lang/String;)Lcom/tencent/recovery/model/RecoveryHandleItem;
    //   39: invokevirtual 291	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   42: pop
    //   43: aload_0
    //   44: aload_2
    //   45: ldc 110
    //   47: invokespecial 286	com/tencent/recovery/wx/service/WXRecoveryHandleService:a	(Lcom/tencent/recovery/model/RecoveryData;Ljava/lang/String;)Lcom/tencent/recovery/model/RecoveryHandleItem;
    //   50: astore 9
    //   52: aload_0
    //   53: invokestatic 295	com/tencent/recovery/wx/util/NetUtil:isConnected	(Landroid/content/Context;)Z
    //   56: ifeq +500 -> 556
    //   59: aload_2
    //   60: getfield 298	com/tencent/recovery/model/RecoveryData:xPH	Ljava/lang/String;
    //   63: astore_2
    //   64: ldc -115
    //   66: ldc_w 300
    //   69: iconst_1
    //   70: anewarray 145	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_2
    //   76: aastore
    //   77: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: aload_2
    //   81: aload 9
    //   83: invokestatic 302	com/tencent/recovery/wx/service/WXRecoveryHandleService:a	(Ljava/lang/String;Lcom/tencent/recovery/model/RecoveryHandleItem;)Ljava/lang/String;
    //   86: astore_2
    //   87: aload_2
    //   88: ifnull +434 -> 522
    //   91: ldc -115
    //   93: ldc_w 304
    //   96: iconst_1
    //   97: anewarray 145	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload_2
    //   103: aastore
    //   104: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   107: new 306	org/json/JSONObject
    //   110: dup
    //   111: aload_2
    //   112: invokespecial 307	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   115: astore_2
    //   116: aload_2
    //   117: ifnull +382 -> 499
    //   120: aload_2
    //   121: ldc_w 309
    //   124: iconst_m1
    //   125: invokevirtual 313	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   128: istore 5
    //   130: aload_2
    //   131: ldc_w 315
    //   134: iconst_m1
    //   135: invokevirtual 313	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   138: istore 6
    //   140: aload_2
    //   141: ldc_w 317
    //   144: ldc 110
    //   146: invokevirtual 321	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   149: astore 7
    //   151: aload_2
    //   152: ldc_w 323
    //   155: ldc 110
    //   157: invokevirtual 321	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   160: astore_2
    //   161: aload_0
    //   162: invokestatic 329	com/tencent/recovery/util/Util:fP	(Landroid/content/Context;)I
    //   165: iload 5
    //   167: irem
    //   168: iload 6
    //   170: if_icmpne +207 -> 377
    //   173: iconst_1
    //   174: istore 5
    //   176: iload 5
    //   178: ifeq +298 -> 476
    //   181: ldc -115
    //   183: ldc_w 331
    //   186: iconst_1
    //   187: anewarray 145	java/lang/Object
    //   190: dup
    //   191: iconst_0
    //   192: aload 7
    //   194: aastore
    //   195: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   198: aload 7
    //   200: aload_2
    //   201: aload 9
    //   203: invokestatic 333	com/tencent/recovery/wx/service/WXRecoveryHandleService:a	(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/recovery/model/RecoveryHandleItem;)[B
    //   206: astore 12
    //   208: aload 12
    //   210: ifnull +251 -> 461
    //   213: new 80	java/lang/StringBuilder
    //   216: dup
    //   217: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   220: aload_1
    //   221: invokevirtual 339	android/content/Context:getCacheDir	()Ljava/io/File;
    //   224: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   227: ldc_w 344
    //   230: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: astore 10
    //   238: new 108	java/io/File
    //   241: dup
    //   242: aload 10
    //   244: invokespecial 117	java/io/File:<init>	(Ljava/lang/String;)V
    //   247: astore 11
    //   249: aload 11
    //   251: invokevirtual 347	java/io/File:exists	()Z
    //   254: ifeq +9 -> 263
    //   257: aload 11
    //   259: invokevirtual 350	java/io/File:delete	()Z
    //   262: pop
    //   263: aconst_null
    //   264: astore 7
    //   266: new 352	java/io/FileOutputStream
    //   269: dup
    //   270: aload 11
    //   272: invokespecial 353	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   275: astore_2
    //   276: aload_2
    //   277: aload 12
    //   279: invokevirtual 355	java/io/FileOutputStream:write	([B)V
    //   282: aload_2
    //   283: invokevirtual 356	java/io/FileOutputStream:close	()V
    //   286: aload 11
    //   288: invokevirtual 347	java/io/File:exists	()Z
    //   291: ifeq +147 -> 438
    //   294: aload_1
    //   295: aload 10
    //   297: invokestatic 362	com/tencent/recovery/wx/RecoveryTinkerManager:bu	(Landroid/content/Context;Ljava/lang/String;)I
    //   300: istore 5
    //   302: iload 5
    //   304: ifeq +111 -> 415
    //   307: aload 9
    //   309: new 80	java/lang/StringBuilder
    //   312: dup
    //   313: ldc_w 364
    //   316: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   319: iload 5
    //   321: invokevirtual 367	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   324: ldc -95
    //   326: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   332: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   335: ldc -115
    //   337: ldc_w 369
    //   340: iconst_1
    //   341: anewarray 145	java/lang/Object
    //   344: dup
    //   345: iconst_0
    //   346: iload 5
    //   348: invokestatic 374	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   351: aastore
    //   352: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   355: aload 8
    //   357: iconst_1
    //   358: putfield 378	com/tencent/recovery/model/RecoveryHandleResult:eAO	Z
    //   361: aload_3
    //   362: aload 9
    //   364: invokevirtual 291	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   367: pop
    //   368: aload 8
    //   370: areturn
    //   371: astore_2
    //   372: aconst_null
    //   373: astore_2
    //   374: goto -258 -> 116
    //   377: iconst_0
    //   378: istore 5
    //   380: goto -204 -> 176
    //   383: astore_2
    //   384: aconst_null
    //   385: astore_2
    //   386: aload_2
    //   387: ifnull -101 -> 286
    //   390: aload_2
    //   391: invokevirtual 356	java/io/FileOutputStream:close	()V
    //   394: goto -108 -> 286
    //   397: astore_2
    //   398: goto -112 -> 286
    //   401: astore_1
    //   402: aload 7
    //   404: astore_2
    //   405: aload_2
    //   406: ifnull +7 -> 413
    //   409: aload_2
    //   410: invokevirtual 356	java/io/FileOutputStream:close	()V
    //   413: aload_1
    //   414: athrow
    //   415: aload 9
    //   417: ldc_w 380
    //   420: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   423: ldc -115
    //   425: ldc_w 382
    //   428: iconst_0
    //   429: anewarray 145	java/lang/Object
    //   432: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   435: goto -80 -> 355
    //   438: aload 9
    //   440: ldc_w 384
    //   443: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   446: ldc -115
    //   448: ldc_w 386
    //   451: iconst_0
    //   452: anewarray 145	java/lang/Object
    //   455: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   458: goto -97 -> 361
    //   461: ldc -115
    //   463: ldc_w 388
    //   466: iconst_0
    //   467: anewarray 145	java/lang/Object
    //   470: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   473: goto -112 -> 361
    //   476: ldc -115
    //   478: ldc_w 390
    //   481: iconst_0
    //   482: anewarray 145	java/lang/Object
    //   485: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   488: aload 9
    //   490: ldc_w 392
    //   493: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   496: goto -135 -> 361
    //   499: ldc -115
    //   501: ldc_w 394
    //   504: iconst_0
    //   505: anewarray 145	java/lang/Object
    //   508: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   511: aload 9
    //   513: ldc_w 396
    //   516: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   519: goto -158 -> 361
    //   522: ldc -115
    //   524: ldc_w 398
    //   527: iconst_0
    //   528: anewarray 145	java/lang/Object
    //   531: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   534: aload 9
    //   536: getfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   539: invokestatic 401	com/tencent/recovery/util/Util:nm	(Ljava/lang/String;)Z
    //   542: ifeq -181 -> 361
    //   545: aload 9
    //   547: ldc_w 403
    //   550: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   553: goto -192 -> 361
    //   556: ldc -115
    //   558: ldc_w 405
    //   561: iconst_0
    //   562: anewarray 145	java/lang/Object
    //   565: invokestatic 151	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   568: iload 4
    //   570: ifne +9 -> 579
    //   573: aload 8
    //   575: iconst_1
    //   576: putfield 408	com/tencent/recovery/model/RecoveryHandleResult:xPK	Z
    //   579: aload 9
    //   581: ldc_w 272
    //   584: iconst_2
    //   585: anewarray 145	java/lang/Object
    //   588: dup
    //   589: iconst_0
    //   590: ldc_w 410
    //   593: aastore
    //   594: dup
    //   595: iconst_1
    //   596: iload 4
    //   598: invokestatic 280	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   601: aastore
    //   602: invokestatic 284	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   605: putfield 54	com/tencent/recovery/model/RecoveryHandleItem:amf	Ljava/lang/String;
    //   608: goto -247 -> 361
    //   611: astore_2
    //   612: goto -326 -> 286
    //   615: astore_2
    //   616: goto -203 -> 413
    //   619: astore_1
    //   620: goto -215 -> 405
    //   623: astore 7
    //   625: goto -239 -> 386
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	628	0	this	WXRecoveryHandleService
    //   0	628	1	paramContext	android.content.Context
    //   0	628	2	paramRecoveryData	RecoveryData
    //   0	628	3	paramArrayList	ArrayList<RecoveryHandleItem>
    //   0	628	4	paramBoolean	boolean
    //   128	251	5	i	int
    //   138	33	6	j	int
    //   149	254	7	str1	String
    //   623	1	7	localException	Exception
    //   7	567	8	localRecoveryHandleResult	com.tencent.recovery.model.RecoveryHandleResult
    //   50	530	9	localRecoveryHandleItem	RecoveryHandleItem
    //   236	60	10	str2	String
    //   247	40	11	localFile	java.io.File
    //   206	72	12	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   107	116	371	java/lang/Exception
    //   266	276	383	java/lang/Exception
    //   390	394	397	java/io/IOException
    //   266	276	401	finally
    //   282	286	611	java/io/IOException
    //   409	413	615	java/io/IOException
    //   276	282	619	finally
    //   276	282	623	java/lang/Exception
  }
  
  protected final void a(RecoveryData paramRecoveryData, ArrayList<RecoveryHandleItem> paramArrayList, boolean paramBoolean)
  {
    paramArrayList.add(a(paramRecoveryData, String.format("%s[%b]", new Object[] { "KeyTotalCount", Boolean.valueOf(paramBoolean) })));
    paramArrayList.add(a(paramRecoveryData, String.format("%s[%b]", new Object[] { "KeyAlreadyRunning", Boolean.valueOf(paramBoolean) })));
  }
  
  public void onCreate()
  {
    super.onCreate();
    RecoveryLog.i("Recovery.WXRecoveryHandleService", "onCreate", new Object[0]);
    this.rzN = ((PowerManager)getSystemService("power"));
  }
  
  public void onDestroy()
  {
    RecoveryLog.i("Recovery.WXRecoveryHandleService", "onDestroy", new Object[0]);
    super.onDestroy();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\wx\service\WXRecoveryHandleService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */