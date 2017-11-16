package com.tencent.mm.sdk.platformtools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Method;
import java.util.List;

public final class am
{
  public static int mkj;
  public static int nowStrength;
  private static PhoneStateListener vjF;
  private static int vjG;
  
  static
  {
    GMTrace.i(13939853230080L, 103860);
    vjF = null;
    vjG = 10000;
    nowStrength = 10000;
    mkj = -1;
    GMTrace.o(13939853230080L, 103860);
  }
  
  public static String et(Context paramContext)
  {
    GMTrace.i(13935558262784L, 103828);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      localStringBuilder.append("isAvailable " + localNetworkInfo.isAvailable() + "\r\n");
      localStringBuilder.append("isAvailable " + localNetworkInfo.isAvailable() + "\r\n");
      localStringBuilder.append("isConnected " + localNetworkInfo.isConnected() + "\r\n");
      localStringBuilder.append("isRoaming " + localNetworkInfo.isRoaming() + "\r\n");
      localStringBuilder.append("isFailover " + localNetworkInfo.isFailover() + "\r\n");
      localStringBuilder.append("getSubtypeName " + localNetworkInfo.getSubtypeName() + "\r\n");
      localStringBuilder.append("getSubtype " + localNetworkInfo.getSubtype() + "\r\n");
      localStringBuilder.append("getType " + localNetworkInfo.getType() + "\r\n");
      localStringBuilder.append("getExtraInfo " + localNetworkInfo.getExtraInfo() + "\r\n");
      localStringBuilder.append("activeNetInfo " + localNetworkInfo.toString() + "\r\n");
      localStringBuilder.append("is2G " + is2G(paramContext) + "\r\n");
      localStringBuilder.append("is3G " + is3G(paramContext) + "\r\n");
      localStringBuilder.append("is4G " + is4G(paramContext) + "\r\n");
      localStringBuilder.append("isWifi " + isWifi(paramContext) + "\r\n");
      w.i("MicroMsg.NetStatusUtil", "netstatus " + localStringBuilder.toString());
      paramContext = localStringBuilder.toString();
      GMTrace.o(13935558262784L, 103828);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.i("MicroMsg.NetStatusUtil", paramContext.getMessage());
        w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      }
    }
  }
  
  public static String eu(Context paramContext)
  {
    GMTrace.i(13935960915968L, 103831);
    if (is2G(paramContext))
    {
      GMTrace.o(13935960915968L, 103831);
      return "2G";
    }
    if (is3G(paramContext))
    {
      GMTrace.o(13935960915968L, 103831);
      return "3G";
    }
    if (is4G(paramContext))
    {
      GMTrace.o(13935960915968L, 103831);
      return "4G";
    }
    if (isWifi(paramContext))
    {
      GMTrace.o(13935960915968L, 103831);
      return "WIFI";
    }
    paramContext = getNetTypeString(paramContext);
    GMTrace.o(13935960915968L, 103831);
    return paramContext;
  }
  
  public static int ev(Context paramContext)
  {
    GMTrace.i(13936095133696L, 103832);
    if (isWifi(paramContext))
    {
      GMTrace.o(13936095133696L, 103832);
      return 1;
    }
    if (is4G(paramContext))
    {
      GMTrace.o(13936095133696L, 103832);
      return 4;
    }
    if (is3G(paramContext))
    {
      GMTrace.o(13936095133696L, 103832);
      return 3;
    }
    if (is2G(paramContext))
    {
      GMTrace.o(13936095133696L, 103832);
      return 2;
    }
    GMTrace.o(13936095133696L, 103832);
    return 0;
  }
  
  public static int ew(Context paramContext)
  {
    GMTrace.i(13936229351424L, 103833);
    if (isWifi(paramContext))
    {
      GMTrace.o(13936229351424L, 103833);
      return 1;
    }
    if (is4G(paramContext))
    {
      GMTrace.o(13936229351424L, 103833);
      return 5;
    }
    if (is3G(paramContext))
    {
      GMTrace.o(13936229351424L, 103833);
      return 4;
    }
    if (is2G(paramContext))
    {
      GMTrace.o(13936229351424L, 103833);
      return 3;
    }
    if (isWap(getNetType(paramContext)))
    {
      GMTrace.o(13936229351424L, 103833);
      return 2;
    }
    GMTrace.o(13936229351424L, 103833);
    return 0;
  }
  
  public static boolean ex(Context paramContext)
  {
    GMTrace.i(13938913705984L, 103853);
    int i = getNetType(paramContext);
    if ((i == 0) || (i == 10))
    {
      w.d("MicroMsg.NetStatusUtil", "[cpan] is wifi or 4g network");
      GMTrace.o(13938913705984L, 103853);
      return true;
    }
    w.d("MicroMsg.NetStatusUtil", "[cpan] is mobile network");
    GMTrace.o(13938913705984L, 103853);
    return false;
  }
  
  public static void ey(Context paramContext)
  {
    try
    {
      GMTrace.i(13939047923712L, 103854);
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      mkj = paramContext.getPhoneType();
      if (vjF == null)
      {
        vjF = new PhoneStateListener()
        {
          public final void onSignalStrengthsChanged(SignalStrength paramAnonymousSignalStrength)
          {
            GMTrace.i(13881065865216L, 103422);
            super.onSignalStrengthsChanged(paramAnonymousSignalStrength);
            if (am.mkj == 2) {
              am.nowStrength = paramAnonymousSignalStrength.getCdmaDbm();
            }
            if (am.mkj == 1) {
              am.nowStrength = paramAnonymousSignalStrength.getGsmSignalStrength() * 2 - 113;
            }
            w.i("MicroMsg.NetStatusUtil", "PhoneStateListener  type:%d  strength:%d", new Object[] { Integer.valueOf(am.mkj), Integer.valueOf(am.nowStrength) });
            GMTrace.o(13881065865216L, 103422);
          }
        };
        paramContext.listen(vjF, 256);
      }
      GMTrace.o(13939047923712L, 103854);
      return;
    }
    finally {}
  }
  
  /* Error */
  public static List<a> ez(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 231
    //   6: ldc -23
    //   8: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 28	com/tencent/mm/sdk/platformtools/am:vjF	Landroid/telephony/PhoneStateListener;
    //   14: ifnonnull +25 -> 39
    //   17: ldc -103
    //   19: ldc -21
    //   21: invokestatic 238	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: aconst_null
    //   25: astore_0
    //   26: ldc2_w 231
    //   29: ldc -23
    //   31: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: ldc 2
    //   36: monitorexit
    //   37: aload_0
    //   38: areturn
    //   39: aload_0
    //   40: ldc -38
    //   42: invokevirtual 58	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   45: checkcast 220	android/telephony/TelephonyManager
    //   48: astore 7
    //   50: new 240	java/util/LinkedList
    //   53: dup
    //   54: invokespecial 241	java/util/LinkedList:<init>	()V
    //   57: astore 4
    //   59: ldc -13
    //   61: astore 5
    //   63: ldc -91
    //   65: astore 6
    //   67: aload 7
    //   69: invokevirtual 246	android/telephony/TelephonyManager:getNetworkOperator	()Ljava/lang/String;
    //   72: astore_3
    //   73: aload_3
    //   74: ifnull +186 -> 260
    //   77: aload_3
    //   78: ldc -91
    //   80: invokevirtual 252	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   83: ifne +177 -> 260
    //   86: aload_3
    //   87: iconst_0
    //   88: iconst_3
    //   89: invokevirtual 256	java/lang/String:substring	(II)Ljava/lang/String;
    //   92: astore_0
    //   93: aload_3
    //   94: iconst_3
    //   95: iconst_5
    //   96: invokevirtual 256	java/lang/String:substring	(II)Ljava/lang/String;
    //   99: astore_3
    //   100: aload 7
    //   102: invokevirtual 223	android/telephony/TelephonyManager:getPhoneType	()I
    //   105: istore_1
    //   106: iload_1
    //   107: iconst_2
    //   108: if_icmpne +533 -> 641
    //   111: aload 7
    //   113: invokevirtual 260	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   116: checkcast 262	android/telephony/cdma/CdmaCellLocation
    //   119: astore 6
    //   121: aload 6
    //   123: ifnull +123 -> 246
    //   126: getstatic 32	com/tencent/mm/sdk/platformtools/am:nowStrength	I
    //   129: getstatic 30	com/tencent/mm/sdk/platformtools/am:vjG	I
    //   132: if_icmpne +208 -> 340
    //   135: ldc -91
    //   137: astore 5
    //   139: aload 6
    //   141: invokevirtual 265	android/telephony/cdma/CdmaCellLocation:getBaseStationId	()I
    //   144: iconst_m1
    //   145: if_icmpeq +101 -> 246
    //   148: aload 6
    //   150: invokevirtual 268	android/telephony/cdma/CdmaCellLocation:getNetworkId	()I
    //   153: iconst_m1
    //   154: if_icmpeq +92 -> 246
    //   157: aload 6
    //   159: invokevirtual 271	android/telephony/cdma/CdmaCellLocation:getSystemId	()I
    //   162: iconst_m1
    //   163: if_icmpeq +83 -> 246
    //   166: aload 4
    //   168: new 8	com/tencent/mm/sdk/platformtools/am$a
    //   171: dup
    //   172: aload_0
    //   173: aload_3
    //   174: ldc -91
    //   176: ldc -91
    //   178: aload 5
    //   180: ldc_w 273
    //   183: new 47	java/lang/StringBuilder
    //   186: dup
    //   187: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   190: aload 6
    //   192: invokevirtual 265	android/telephony/cdma/CdmaCellLocation:getBaseStationId	()I
    //   195: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   198: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: new 47	java/lang/StringBuilder
    //   204: dup
    //   205: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   208: aload 6
    //   210: invokevirtual 268	android/telephony/cdma/CdmaCellLocation:getNetworkId	()I
    //   213: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   216: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: new 47	java/lang/StringBuilder
    //   222: dup
    //   223: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   226: aload 6
    //   228: invokevirtual 271	android/telephony/cdma/CdmaCellLocation:getSystemId	()I
    //   231: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   234: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: invokespecial 276	com/tencent/mm/sdk/platformtools/am$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   240: invokeinterface 281 2 0
    //   245: pop
    //   246: ldc2_w 231
    //   249: ldc -23
    //   251: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   254: aload 4
    //   256: astore_0
    //   257: goto -223 -> 34
    //   260: aload 7
    //   262: invokevirtual 284	android/telephony/TelephonyManager:getSimOperator	()Ljava/lang/String;
    //   265: astore 8
    //   267: aload 6
    //   269: astore_3
    //   270: aload 5
    //   272: astore_0
    //   273: aload 8
    //   275: ifnull +35 -> 310
    //   278: aload 6
    //   280: astore_3
    //   281: aload 5
    //   283: astore_0
    //   284: aload 8
    //   286: ldc -91
    //   288: invokevirtual 252	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   291: ifne +19 -> 310
    //   294: aload 8
    //   296: iconst_0
    //   297: iconst_3
    //   298: invokevirtual 256	java/lang/String:substring	(II)Ljava/lang/String;
    //   301: astore_0
    //   302: aload 8
    //   304: iconst_3
    //   305: iconst_5
    //   306: invokevirtual 256	java/lang/String:substring	(II)Ljava/lang/String;
    //   309: astore_3
    //   310: goto -210 -> 100
    //   313: astore_0
    //   314: ldc -103
    //   316: aload_0
    //   317: ldc -91
    //   319: iconst_0
    //   320: anewarray 4	java/lang/Object
    //   323: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: ldc2_w 231
    //   329: ldc -23
    //   331: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   334: aload 4
    //   336: astore_0
    //   337: goto -303 -> 34
    //   340: new 47	java/lang/StringBuilder
    //   343: dup
    //   344: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   347: getstatic 32	com/tencent/mm/sdk/platformtools/am:nowStrength	I
    //   350: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   353: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   356: astore 5
    //   358: goto -219 -> 139
    //   361: astore 5
    //   363: aload 7
    //   365: invokevirtual 260	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   368: checkcast 286	android/telephony/gsm/GsmCellLocation
    //   371: astore 5
    //   373: aload 5
    //   375: ifnull +68 -> 443
    //   378: aload 5
    //   380: invokevirtual 289	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   383: istore_1
    //   384: aload 5
    //   386: invokevirtual 292	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   389: istore_2
    //   390: iload_2
    //   391: ldc_w 293
    //   394: if_icmpge +49 -> 443
    //   397: iload_2
    //   398: iconst_m1
    //   399: if_icmpeq +44 -> 443
    //   402: iload_1
    //   403: iconst_m1
    //   404: if_icmpeq +39 -> 443
    //   407: aload 4
    //   409: new 8	com/tencent/mm/sdk/platformtools/am$a
    //   412: dup
    //   413: aload_0
    //   414: aload_3
    //   415: iload_2
    //   416: invokestatic 297	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   419: iload_1
    //   420: invokestatic 297	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   423: ldc -91
    //   425: ldc_w 299
    //   428: ldc -91
    //   430: ldc -91
    //   432: ldc -91
    //   434: invokespecial 276	com/tencent/mm/sdk/platformtools/am$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   437: invokeinterface 281 2 0
    //   442: pop
    //   443: aload 7
    //   445: invokevirtual 303	android/telephony/TelephonyManager:getNeighboringCellInfo	()Ljava/util/List;
    //   448: astore 5
    //   450: aload 5
    //   452: ifnull -206 -> 246
    //   455: aload 5
    //   457: invokeinterface 306 1 0
    //   462: ifle -216 -> 246
    //   465: aload 5
    //   467: invokeinterface 310 1 0
    //   472: astore 5
    //   474: aload 5
    //   476: invokeinterface 315 1 0
    //   481: ifeq -235 -> 246
    //   484: aload 5
    //   486: invokeinterface 319 1 0
    //   491: checkcast 321	android/telephony/NeighboringCellInfo
    //   494: astore 6
    //   496: aload 6
    //   498: invokevirtual 322	android/telephony/NeighboringCellInfo:getCid	()I
    //   501: iconst_m1
    //   502: if_icmpeq -28 -> 474
    //   505: aload 6
    //   507: invokevirtual 323	android/telephony/NeighboringCellInfo:getLac	()I
    //   510: ldc_w 293
    //   513: if_icmpgt -39 -> 474
    //   516: aload 6
    //   518: invokevirtual 323	android/telephony/NeighboringCellInfo:getLac	()I
    //   521: iconst_m1
    //   522: if_icmpeq -48 -> 474
    //   525: new 47	java/lang/StringBuilder
    //   528: dup
    //   529: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   532: aload 6
    //   534: invokevirtual 326	android/telephony/NeighboringCellInfo:getRssi	()I
    //   537: iconst_2
    //   538: imul
    //   539: bipush 113
    //   541: isub
    //   542: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   545: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   548: astore 7
    //   550: aload 4
    //   552: new 8	com/tencent/mm/sdk/platformtools/am$a
    //   555: dup
    //   556: aload_0
    //   557: aload_3
    //   558: new 47	java/lang/StringBuilder
    //   561: dup
    //   562: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   565: aload 6
    //   567: invokevirtual 323	android/telephony/NeighboringCellInfo:getLac	()I
    //   570: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   573: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   576: new 47	java/lang/StringBuilder
    //   579: dup
    //   580: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   583: aload 6
    //   585: invokevirtual 322	android/telephony/NeighboringCellInfo:getCid	()I
    //   588: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   591: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   594: aload 7
    //   596: ldc_w 299
    //   599: ldc -91
    //   601: ldc -91
    //   603: ldc -91
    //   605: invokespecial 276	com/tencent/mm/sdk/platformtools/am$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   608: invokeinterface 281 2 0
    //   613: pop
    //   614: goto -140 -> 474
    //   617: astore_0
    //   618: ldc 2
    //   620: monitorexit
    //   621: aload_0
    //   622: athrow
    //   623: astore 5
    //   625: ldc -103
    //   627: aload 5
    //   629: ldc -91
    //   631: iconst_0
    //   632: anewarray 4	java/lang/Object
    //   635: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   638: goto -195 -> 443
    //   641: aload 7
    //   643: invokevirtual 260	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   646: checkcast 286	android/telephony/gsm/GsmCellLocation
    //   649: astore 5
    //   651: aload 5
    //   653: ifnull +81 -> 734
    //   656: aload 5
    //   658: invokevirtual 289	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   661: istore_1
    //   662: aload 5
    //   664: invokevirtual 292	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   667: istore_2
    //   668: iload_2
    //   669: ldc_w 293
    //   672: if_icmpge +62 -> 734
    //   675: iload_2
    //   676: iconst_m1
    //   677: if_icmpeq +57 -> 734
    //   680: iload_1
    //   681: iconst_m1
    //   682: if_icmpeq +52 -> 734
    //   685: getstatic 32	com/tencent/mm/sdk/platformtools/am:nowStrength	I
    //   688: getstatic 30	com/tencent/mm/sdk/platformtools/am:vjG	I
    //   691: if_icmpne +260 -> 951
    //   694: ldc -91
    //   696: astore 5
    //   698: aload 4
    //   700: new 8	com/tencent/mm/sdk/platformtools/am$a
    //   703: dup
    //   704: aload_0
    //   705: aload_3
    //   706: iload_2
    //   707: invokestatic 297	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   710: iload_1
    //   711: invokestatic 297	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   714: aload 5
    //   716: ldc_w 299
    //   719: ldc -91
    //   721: ldc -91
    //   723: ldc -91
    //   725: invokespecial 276	com/tencent/mm/sdk/platformtools/am$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   728: invokeinterface 281 2 0
    //   733: pop
    //   734: aload 7
    //   736: invokevirtual 303	android/telephony/TelephonyManager:getNeighboringCellInfo	()Ljava/util/List;
    //   739: astore 5
    //   741: aload 5
    //   743: ifnull -497 -> 246
    //   746: aload 5
    //   748: invokeinterface 306 1 0
    //   753: ifle -507 -> 246
    //   756: aload 5
    //   758: invokeinterface 310 1 0
    //   763: astore 5
    //   765: aload 5
    //   767: invokeinterface 315 1 0
    //   772: ifeq -526 -> 246
    //   775: aload 5
    //   777: invokeinterface 319 1 0
    //   782: checkcast 321	android/telephony/NeighboringCellInfo
    //   785: astore 6
    //   787: aload 6
    //   789: invokevirtual 322	android/telephony/NeighboringCellInfo:getCid	()I
    //   792: iconst_m1
    //   793: if_icmpeq -28 -> 765
    //   796: aload 6
    //   798: invokevirtual 323	android/telephony/NeighboringCellInfo:getLac	()I
    //   801: ldc_w 293
    //   804: if_icmpgt -39 -> 765
    //   807: new 47	java/lang/StringBuilder
    //   810: dup
    //   811: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   814: aload 6
    //   816: invokevirtual 326	android/telephony/NeighboringCellInfo:getRssi	()I
    //   819: iconst_2
    //   820: imul
    //   821: bipush 113
    //   823: isub
    //   824: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   827: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   830: astore 7
    //   832: ldc_w 328
    //   835: new 47	java/lang/StringBuilder
    //   838: dup
    //   839: ldc_w 330
    //   842: invokespecial 69	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   845: aload 6
    //   847: invokevirtual 323	android/telephony/NeighboringCellInfo:getLac	()I
    //   850: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   853: ldc_w 332
    //   856: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   859: aload 6
    //   861: invokevirtual 322	android/telephony/NeighboringCellInfo:getCid	()I
    //   864: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   867: ldc_w 334
    //   870: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   873: aload 7
    //   875: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   878: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   881: invokestatic 337	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   884: aload 4
    //   886: new 8	com/tencent/mm/sdk/platformtools/am$a
    //   889: dup
    //   890: aload_0
    //   891: aload_3
    //   892: new 47	java/lang/StringBuilder
    //   895: dup
    //   896: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   899: aload 6
    //   901: invokevirtual 323	android/telephony/NeighboringCellInfo:getLac	()I
    //   904: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   907: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   910: new 47	java/lang/StringBuilder
    //   913: dup
    //   914: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   917: aload 6
    //   919: invokevirtual 322	android/telephony/NeighboringCellInfo:getCid	()I
    //   922: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   925: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   928: aload 7
    //   930: ldc_w 299
    //   933: ldc -91
    //   935: ldc -91
    //   937: ldc -91
    //   939: invokespecial 276	com/tencent/mm/sdk/platformtools/am$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   942: invokeinterface 281 2 0
    //   947: pop
    //   948: goto -183 -> 765
    //   951: new 47	java/lang/StringBuilder
    //   954: dup
    //   955: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   958: getstatic 32	com/tencent/mm/sdk/platformtools/am:nowStrength	I
    //   961: invokevirtual 117	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   964: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   967: astore 5
    //   969: goto -271 -> 698
    //   972: astore 5
    //   974: ldc -103
    //   976: aload 5
    //   978: ldc -91
    //   980: iconst_0
    //   981: anewarray 4	java/lang/Object
    //   984: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   987: goto -253 -> 734
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	990	0	paramContext	Context
    //   105	606	1	i	int
    //   389	318	2	j	int
    //   72	820	3	localObject1	Object
    //   57	828	4	localLinkedList	java.util.LinkedList
    //   61	296	5	str1	String
    //   361	1	5	localException1	Exception
    //   371	114	5	localObject2	Object
    //   623	5	5	localException2	Exception
    //   649	319	5	localObject3	Object
    //   972	5	5	localException3	Exception
    //   65	853	6	localObject4	Object
    //   48	881	7	localObject5	Object
    //   265	38	8	str2	String
    // Exception table:
    //   from	to	target	type
    //   67	73	313	java/lang/Exception
    //   77	100	313	java/lang/Exception
    //   260	267	313	java/lang/Exception
    //   284	310	313	java/lang/Exception
    //   111	121	361	java/lang/Exception
    //   126	135	361	java/lang/Exception
    //   139	246	361	java/lang/Exception
    //   340	358	361	java/lang/Exception
    //   3	24	617	finally
    //   26	34	617	finally
    //   39	59	617	finally
    //   67	73	617	finally
    //   77	100	617	finally
    //   100	106	617	finally
    //   111	121	617	finally
    //   126	135	617	finally
    //   139	246	617	finally
    //   246	254	617	finally
    //   260	267	617	finally
    //   284	310	617	finally
    //   314	334	617	finally
    //   340	358	617	finally
    //   363	373	617	finally
    //   378	390	617	finally
    //   407	443	617	finally
    //   443	450	617	finally
    //   455	474	617	finally
    //   474	614	617	finally
    //   625	638	617	finally
    //   641	651	617	finally
    //   656	668	617	finally
    //   685	694	617	finally
    //   698	734	617	finally
    //   734	741	617	finally
    //   746	765	617	finally
    //   765	948	617	finally
    //   951	969	617	finally
    //   974	987	617	finally
    //   363	373	623	java/lang/Exception
    //   378	390	623	java/lang/Exception
    //   407	443	623	java/lang/Exception
    //   641	651	972	java/lang/Exception
    //   656	668	972	java/lang/Exception
    //   685	694	972	java/lang/Exception
    //   698	734	972	java/lang/Exception
    //   951	969	972	java/lang/Exception
  }
  
  public static int getBackgroundLimitType(Context paramContext)
  {
    GMTrace.i(13938511052800L, 103850);
    int i;
    if (Build.VERSION.SDK_INT >= 14) {
      try
      {
        Object localObject = Class.forName("android.app.ActivityManagerNative");
        localObject = ((Class)localObject).getMethod("getDefault", new Class[0]).invoke(localObject, new Object[0]);
        i = ((Integer)localObject.getClass().getMethod("getProcessLimit", new Class[0]).invoke(localObject, new Object[0])).intValue();
        if (i == 0)
        {
          GMTrace.o(13938511052800L, 103850);
          return 1;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.NetStatusUtil", localException, "", new Object[0]);
      }
    }
    try
    {
      i = Settings.System.getInt(paramContext.getContentResolver(), "wifi_sleep_policy", 2);
      if (i != 2)
      {
        int j = getNetType(paramContext);
        if (j == 0) {}
      }
      else
      {
        GMTrace.o(13938511052800L, 103850);
        return 0;
      }
      if ((i == 1) || (i == 0))
      {
        GMTrace.o(13938511052800L, 103850);
        return 3;
      }
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      GMTrace.o(13938511052800L, 103850);
    }
    return 0;
  }
  
  public static int getISPCode(Context paramContext)
  {
    GMTrace.i(13936632004608L, 103836);
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    if (paramContext == null)
    {
      GMTrace.o(13936632004608L, 103836);
      return 0;
    }
    paramContext = paramContext.getSimOperator();
    if ((paramContext == null) || (paramContext.length() < 5))
    {
      GMTrace.o(13936632004608L, 103836);
      return 0;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      try
      {
        j = paramContext.length();
        i = j;
        if (j <= 6) {
          break label174;
        }
        i = 6;
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        GMTrace.o(13936632004608L, 103836);
        return 0;
      }
      if (j < i) {
        if (!Character.isDigit(paramContext.charAt(j)))
        {
          if (localStringBuilder.length() <= 0) {
            break label179;
          }
        }
        else
        {
          localStringBuilder.append(paramContext.charAt(j));
          break label179;
        }
      }
      int i = Integer.valueOf(localStringBuilder.toString()).intValue();
      GMTrace.o(13936632004608L, 103836);
      return i;
      label174:
      int j = 0;
      continue;
      label179:
      j += 1;
    }
  }
  
  public static String getISPName(Context paramContext)
  {
    GMTrace.i(13936766222336L, 103837);
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null)
      {
        GMTrace.o(13936766222336L, 103837);
        return "";
      }
      w.d("MicroMsg.NetStatusUtil", "getISPName ISPName=%s", new Object[] { paramContext.getSimOperatorName() });
      if (paramContext.getSimOperatorName().length() <= 100)
      {
        paramContext = paramContext.getSimOperatorName();
        GMTrace.o(13936766222336L, 103837);
        return paramContext;
      }
      paramContext = paramContext.getSimOperatorName().substring(0, 100);
      GMTrace.o(13936766222336L, 103837);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      GMTrace.o(13936766222336L, 103837);
    }
    return "";
  }
  
  public static int getNetType(Context paramContext)
  {
    GMTrace.i(13936497786880L, 103835);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null)
    {
      GMTrace.o(13936497786880L, 103835);
      return -1;
    }
    paramContext = paramContext.getActiveNetworkInfo();
    if (paramContext == null)
    {
      GMTrace.o(13936497786880L, 103835);
      return -1;
    }
    if (paramContext.getType() == 1)
    {
      GMTrace.o(13936497786880L, 103835);
      return 0;
    }
    w.d("MicroMsg.NetStatusUtil", "activeNetInfo extra=%s, type=%d", new Object[] { paramContext.getExtraInfo(), Integer.valueOf(paramContext.getType()) });
    if (paramContext.getExtraInfo() != null)
    {
      if (paramContext.getExtraInfo().equalsIgnoreCase("uninet"))
      {
        GMTrace.o(13936497786880L, 103835);
        return 1;
      }
      if (paramContext.getExtraInfo().equalsIgnoreCase("uniwap"))
      {
        GMTrace.o(13936497786880L, 103835);
        return 2;
      }
      if (paramContext.getExtraInfo().equalsIgnoreCase("3gwap"))
      {
        GMTrace.o(13936497786880L, 103835);
        return 3;
      }
      if (paramContext.getExtraInfo().equalsIgnoreCase("3gnet"))
      {
        GMTrace.o(13936497786880L, 103835);
        return 4;
      }
      if (paramContext.getExtraInfo().equalsIgnoreCase("cmwap"))
      {
        GMTrace.o(13936497786880L, 103835);
        return 5;
      }
      if (paramContext.getExtraInfo().equalsIgnoreCase("cmnet"))
      {
        GMTrace.o(13936497786880L, 103835);
        return 6;
      }
      if (paramContext.getExtraInfo().equalsIgnoreCase("ctwap"))
      {
        GMTrace.o(13936497786880L, 103835);
        return 7;
      }
      if (paramContext.getExtraInfo().equalsIgnoreCase("ctnet"))
      {
        GMTrace.o(13936497786880L, 103835);
        return 8;
      }
      if (paramContext.getExtraInfo().equalsIgnoreCase("LTE"))
      {
        GMTrace.o(13936497786880L, 103835);
        return 10;
      }
    }
    GMTrace.o(13936497786880L, 103835);
    return 9;
  }
  
  public static int getNetTypeForStat(Context paramContext)
  {
    GMTrace.i(13938779488256L, 103852);
    if (paramContext == null)
    {
      GMTrace.o(13938779488256L, 103852);
      return 999;
    }
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null)
      {
        GMTrace.o(13938779488256L, 103852);
        return 999;
      }
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
      {
        GMTrace.o(13938779488256L, 103852);
        return 999;
      }
      int i = paramContext.getType();
      if (i == 1)
      {
        GMTrace.o(13938779488256L, 103852);
        return 1;
      }
      i = paramContext.getSubtype();
      if (i == 0)
      {
        GMTrace.o(13938779488256L, 103852);
        return 999;
      }
      GMTrace.o(13938779488256L, 103852);
      return i * 1000;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      GMTrace.o(13938779488256L, 103852);
    }
    return 999;
  }
  
  public static String getNetTypeString(Context paramContext)
  {
    GMTrace.i(13935826698240L, 103830);
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null)
      {
        GMTrace.o(13935826698240L, 103830);
        return "NON_NETWORK";
      }
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
      {
        GMTrace.o(13935826698240L, 103830);
        return "NON_NETWORK";
      }
      if (paramContext.getType() == 1)
      {
        GMTrace.o(13935826698240L, 103830);
        return "WIFI";
      }
      w.d("MicroMsg.NetStatusUtil", "activeNetInfo extra=%s, type=%d", new Object[] { paramContext.getExtraInfo(), Integer.valueOf(paramContext.getType()) });
      if (paramContext.getExtraInfo() != null)
      {
        paramContext = paramContext.getExtraInfo();
        GMTrace.o(13935826698240L, 103830);
        return paramContext;
      }
      GMTrace.o(13935826698240L, 103830);
      return "MOBILE";
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      GMTrace.o(13935826698240L, 103830);
    }
    return "NON_NETWORK";
  }
  
  public static int getNetWorkType(Context paramContext)
  {
    GMTrace.i(13936363569152L, 103834);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext != null)
      {
        int i = paramContext.getType();
        GMTrace.o(13936363569152L, 103834);
        return i;
      }
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      GMTrace.o(13936363569152L, 103834);
    }
    return -1;
  }
  
  /* Error */
  public static int getStrength(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 474
    //   6: ldc_w 476
    //   9: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: ifnonnull +19 -> 32
    //   16: ldc2_w 474
    //   19: ldc_w 476
    //   22: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: iconst_0
    //   26: istore_1
    //   27: ldc 2
    //   29: monitorexit
    //   30: iload_1
    //   31: ireturn
    //   32: aload_0
    //   33: invokestatic 478	com/tencent/mm/sdk/platformtools/am:getNetTypeForStat	(Landroid/content/Context;)I
    //   36: iconst_1
    //   37: if_icmpne +41 -> 78
    //   40: aload_0
    //   41: ldc_w 480
    //   44: invokevirtual 58	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   47: checkcast 482	android/net/wifi/WifiManager
    //   50: invokevirtual 486	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   53: invokevirtual 489	android/net/wifi/WifiInfo:getRssi	()I
    //   56: invokestatic 495	java/lang/Math:abs	(I)I
    //   59: istore_1
    //   60: ldc2_w 474
    //   63: ldc_w 476
    //   66: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   69: goto -42 -> 27
    //   72: astore_0
    //   73: ldc 2
    //   75: monitorexit
    //   76: aload_0
    //   77: athrow
    //   78: getstatic 28	com/tencent/mm/sdk/platformtools/am:vjF	Landroid/telephony/PhoneStateListener;
    //   81: ifnonnull +10 -> 91
    //   84: ldc -103
    //   86: ldc -21
    //   88: invokestatic 238	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: getstatic 32	com/tencent/mm/sdk/platformtools/am:nowStrength	I
    //   94: invokestatic 495	java/lang/Math:abs	(I)I
    //   97: istore_1
    //   98: ldc2_w 474
    //   101: ldc_w 476
    //   104: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   107: goto -80 -> 27
    //   110: astore_0
    //   111: ldc -103
    //   113: aload_0
    //   114: ldc -91
    //   116: iconst_0
    //   117: anewarray 4	java/lang/Object
    //   120: invokestatic 169	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: ldc2_w 474
    //   126: ldc_w 476
    //   129: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   132: iconst_0
    //   133: istore_1
    //   134: goto -107 -> 27
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	paramContext	Context
    //   26	108	1	i	int
    // Exception table:
    //   from	to	target	type
    //   3	12	72	finally
    //   16	25	72	finally
    //   32	60	72	finally
    //   60	69	72	finally
    //   78	91	72	finally
    //   91	98	72	finally
    //   98	107	72	finally
    //   111	132	72	finally
    //   32	60	110	java/lang/Exception
    //   78	91	110	java/lang/Exception
    //   91	98	110	java/lang/Exception
  }
  
  public static WifiInfo getWifiInfo(Context paramContext)
  {
    GMTrace.i(13937974181888L, 103846);
    try
    {
      Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localObject == null)
      {
        GMTrace.o(13937974181888L, 103846);
        return null;
      }
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject != null)
      {
        int i = ((NetworkInfo)localObject).getType();
        if (1 == i) {}
      }
      else
      {
        GMTrace.o(13937974181888L, 103846);
        return null;
      }
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      if (paramContext == null)
      {
        GMTrace.o(13937974181888L, 103846);
        return null;
      }
      paramContext = paramContext.getConnectionInfo();
      GMTrace.o(13937974181888L, 103846);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      GMTrace.o(13937974181888L, 103846);
    }
    return null;
  }
  
  public static boolean is2G(Context paramContext)
  {
    GMTrace.i(13937034657792L, 103839);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        GMTrace.o(13937034657792L, 103839);
        return false;
      }
      int i = paramContext.getType();
      if (i == 1)
      {
        GMTrace.o(13937034657792L, 103839);
        return false;
      }
      if ((paramContext.getSubtype() != 2) && (paramContext.getSubtype() != 1))
      {
        i = paramContext.getSubtype();
        if (i != 4) {}
      }
      else
      {
        GMTrace.o(13937034657792L, 103839);
        return true;
      }
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      GMTrace.o(13937034657792L, 103839);
    }
    return false;
  }
  
  public static boolean is3G(Context paramContext)
  {
    GMTrace.i(13937571528704L, 103843);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        GMTrace.o(13937571528704L, 103843);
        return false;
      }
      int i = paramContext.getType();
      if (i == 1)
      {
        GMTrace.o(13937571528704L, 103843);
        return false;
      }
      if (paramContext.getSubtype() >= 5)
      {
        i = paramContext.getSubtype();
        if (i < 13)
        {
          GMTrace.o(13937571528704L, 103843);
          return true;
        }
      }
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      GMTrace.o(13937571528704L, 103843);
    }
    return false;
  }
  
  public static boolean is4G(Context paramContext)
  {
    GMTrace.i(13937168875520L, 103840);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        GMTrace.o(13937168875520L, 103840);
        return false;
      }
      int i = paramContext.getType();
      if (i == 1)
      {
        GMTrace.o(13937168875520L, 103840);
        return false;
      }
      i = paramContext.getSubtype();
      if (i >= 13)
      {
        GMTrace.o(13937168875520L, 103840);
        return true;
      }
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      GMTrace.o(13937168875520L, 103840);
    }
    return false;
  }
  
  public static boolean isConnected(Context paramContext)
  {
    GMTrace.i(13935692480512L, 103829);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null)
    {
      GMTrace.o(13935692480512L, 103829);
      return false;
    }
    paramContext = paramContext.getActiveNetworkInfo();
    try
    {
      bool = paramContext.isConnected();
      GMTrace.o(13935692480512L, 103829);
      return bool;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
  }
  
  public static boolean isLimited(int paramInt)
  {
    GMTrace.i(13938376835072L, 103849);
    if ((paramInt == 2) || (paramInt == 1) || (paramInt == 3))
    {
      GMTrace.o(13938376835072L, 103849);
      return true;
    }
    GMTrace.o(13938376835072L, 103849);
    return false;
  }
  
  public static boolean isMobile(Context paramContext)
  {
    GMTrace.i(13936900440064L, 103838);
    try
    {
      int i = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo().getType();
      if (i == 1)
      {
        GMTrace.o(13936900440064L, 103838);
        return false;
      }
      GMTrace.o(13936900440064L, 103838);
      return true;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      GMTrace.o(13936900440064L, 103838);
    }
    return false;
  }
  
  public static boolean isNetworkConnected(Context paramContext)
  {
    GMTrace.i(13938645270528L, 103851);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null)
    {
      GMTrace.o(13938645270528L, 103851);
      return false;
    }
    paramContext = paramContext.getActiveNetworkInfo();
    if (paramContext == null)
    {
      GMTrace.o(13938645270528L, 103851);
      return false;
    }
    if (paramContext.getState() != NetworkInfo.State.CONNECTED)
    {
      GMTrace.o(13938645270528L, 103851);
      return false;
    }
    GMTrace.o(13938645270528L, 103851);
    return true;
  }
  
  public static boolean isWap(int paramInt)
  {
    GMTrace.i(13937437310976L, 103842);
    if ((paramInt == 2) || (paramInt == 5) || (paramInt == 7) || (paramInt == 3))
    {
      GMTrace.o(13937437310976L, 103842);
      return true;
    }
    GMTrace.o(13937437310976L, 103842);
    return false;
  }
  
  public static boolean isWap(Context paramContext)
  {
    GMTrace.i(15696629071872L, 116949);
    boolean bool = isWap(getNetType(paramContext));
    GMTrace.o(15696629071872L, 116949);
    return bool;
  }
  
  public static boolean isWifi(int paramInt)
  {
    GMTrace.i(13937839964160L, 103845);
    if (paramInt == 0)
    {
      GMTrace.o(13937839964160L, 103845);
      return true;
    }
    GMTrace.o(13937839964160L, 103845);
    return false;
  }
  
  public static boolean isWifi(Context paramContext)
  {
    GMTrace.i(13937705746432L, 103844);
    if (getNetType(paramContext) == 0)
    {
      GMTrace.o(13937705746432L, 103844);
      return true;
    }
    GMTrace.o(13937705746432L, 103844);
    return false;
  }
  
  private static Intent searchIntentByClass(Context paramContext, String paramString)
  {
    GMTrace.i(13938108399616L, 103847);
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      List localList = localPackageManager.getInstalledPackages(0);
      if ((localList != null) && (localList.size() > 0))
      {
        w.e("MicroMsg.NetStatusUtil", "package  size" + localList.size());
        int i = 0;
        for (;;)
        {
          int j = localList.size();
          if (i >= j) {
            break;
          }
          try
          {
            w.e("MicroMsg.NetStatusUtil", "package " + ((PackageInfo)localList.get(i)).packageName);
            Object localObject1 = new Intent();
            ((Intent)localObject1).setPackage(((PackageInfo)localList.get(i)).packageName);
            Object localObject2 = localPackageManager.queryIntentActivities((Intent)localObject1, 0);
            if (localObject2 != null) {
              j = ((List)localObject2).size();
            }
            for (;;)
            {
              if (j > 0) {
                try
                {
                  w.e("MicroMsg.NetStatusUtil", "activityName count " + j);
                  int k = 0;
                  for (;;)
                  {
                    if (k >= j) {
                      break label323;
                    }
                    localObject1 = ((ResolveInfo)((List)localObject2).get(k)).activityInfo;
                    if (((ActivityInfo)localObject1).name.contains(paramString))
                    {
                      localObject2 = new Intent("/");
                      ((Intent)localObject2).setComponent(new ComponentName(((ActivityInfo)localObject1).packageName, ((ActivityInfo)localObject1).name));
                      ((Intent)localObject2).setAction("android.intent.action.VIEW");
                      paramContext.startActivity((Intent)localObject2);
                      GMTrace.o(13938108399616L, 103847);
                      return (Intent)localObject2;
                      j = 0;
                      break;
                    }
                    k += 1;
                  }
                  i += 1;
                }
                catch (Exception localException1)
                {
                  w.printErrStackTrace("MicroMsg.NetStatusUtil", localException1, "", new Object[0]);
                }
              }
            }
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              label323:
              w.printErrStackTrace("MicroMsg.NetStatusUtil", localException2, "", new Object[0]);
            }
          }
        }
      }
      return null;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      GMTrace.o(13938108399616L, 103847);
    }
  }
  
  public static void startSettingItent(Context paramContext, int paramInt)
  {
    GMTrace.i(13938242617344L, 103848);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(13938242617344L, 103848);
      return;
      GMTrace.o(13938242617344L, 103848);
      return;
      try
      {
        Intent localIntent1 = new Intent("/");
        localIntent1.setComponent(new ComponentName("com.android.providers.subscribedfeeds", "com.android.settings.ManageAccountsSettings"));
        localIntent1.setAction("android.intent.action.VIEW");
        paramContext.startActivity(localIntent1);
        GMTrace.o(13938242617344L, 103848);
        return;
      }
      catch (Exception localException1)
      {
        try
        {
          Intent localIntent2 = new Intent("/");
          localIntent2.setComponent(new ComponentName("com.htc.settings.accountsync", "com.htc.settings.accountsync.ManageAccountsSettings"));
          localIntent2.setAction("android.intent.action.VIEW");
          paramContext.startActivity(localIntent2);
          GMTrace.o(13938242617344L, 103848);
          return;
        }
        catch (Exception localException2)
        {
          searchIntentByClass(paramContext, "ManageAccountsSettings");
          GMTrace.o(13938242617344L, 103848);
          return;
        }
      }
      try
      {
        Intent localIntent3 = new Intent("/");
        localIntent3.setComponent(new ComponentName("com.android.settings", "com.android.settings.DevelopmentSettings"));
        localIntent3.setAction("android.intent.action.VIEW");
        paramContext.startActivity(localIntent3);
        GMTrace.o(13938242617344L, 103848);
        return;
      }
      catch (Exception localException3)
      {
        searchIntentByClass(paramContext, "DevelopmentSettings");
        GMTrace.o(13938242617344L, 103848);
        return;
      }
      try
      {
        Intent localIntent4 = new Intent();
        localIntent4.setAction("android.settings.WIFI_IP_SETTINGS");
        paramContext.startActivity(localIntent4);
        GMTrace.o(13938242617344L, 103848);
        return;
      }
      catch (Exception localException4)
      {
        searchIntentByClass(paramContext, "AdvancedSettings");
      }
    }
  }
  
  public static final class a
  {
    public String systemId;
    public String type;
    public String vjH;
    public String vjI;
    public String vjJ;
    public String vjK;
    public String vjL;
    public String vjM;
    public String vjN;
    
    public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      GMTrace.i(13872610148352L, 103359);
      this.vjH = paramString1;
      this.vjI = paramString2;
      this.vjJ = paramString3;
      this.type = paramString6;
      this.vjK = paramString4;
      this.vjL = paramString7;
      this.vjM = paramString8;
      this.systemId = paramString9;
      this.vjN = paramString5;
      GMTrace.o(13872610148352L, 103359);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */