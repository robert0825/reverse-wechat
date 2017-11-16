package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.f;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class p
{
  private static p xVD = null;
  static final Lock xVI = new ReentrantLock();
  static final Lock xVJ = new ReentrantLock();
  public static ThreadLocal<Integer> xVL = new ThreadLocal() {};
  private static Handler xVM = null;
  private static final Long[][] xVN;
  static boolean xVO = false;
  private static boolean xVP = false;
  private int xVE = 0;
  private FileLock xVF;
  private FileOutputStream xVG;
  private boolean xVH = false;
  boolean xVK = false;
  
  static
  {
    Long[] arrayOfLong1 = { Long.valueOf(25436L), Long.valueOf(12009376L) };
    Long[] arrayOfLong2 = { Long.valueOf(25437L), Long.valueOf(11489180L) };
    Long[] arrayOfLong3 = { Long.valueOf(25438L), Long.valueOf(11489180L) };
    Long[] arrayOfLong4 = { Long.valueOf(25442L), Long.valueOf(11489180L) };
    xVN = new Long[][] { { Long.valueOf(25413L), Long.valueOf(11460320L) }, arrayOfLong1, arrayOfLong2, arrayOfLong3, { Long.valueOf(25439L), Long.valueOf(12013472L) }, { Long.valueOf(25440L), Long.valueOf(11489180L) }, arrayOfLong4 };
  }
  
  private p()
  {
    if (xVM == null) {
      xVM = new Handler(n.cou().getLooper())
      {
        /* Error */
        public final void handleMessage(Message paramAnonymousMessage)
        {
          // Byte code:
          //   0: iconst_1
          //   1: invokestatic 32	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
          //   4: aload_1
          //   5: getfield 38	android/os/Message:what	I
          //   8: tableswitch	default:+28->36, 1:+38->46, 2:+91->99, 3:+2203->2211
          //   36: iconst_0
          //   37: invokestatic 32	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
          //   40: aload_0
          //   41: aload_1
          //   42: invokespecial 40	android/os/Handler:handleMessage	(Landroid/os/Message;)V
          //   45: return
          //   46: ldc 42
          //   48: ldc 44
          //   50: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   53: aload_1
          //   54: getfield 54	android/os/Message:obj	Ljava/lang/Object;
          //   57: checkcast 56	[Ljava/lang/Object;
          //   60: checkcast 56	[Ljava/lang/Object;
          //   63: astore 13
          //   65: aload_0
          //   66: getfield 14	com/tencent/smtt/sdk/p$2:xVQ	Lcom/tencent/smtt/sdk/p;
          //   69: aload 13
          //   71: iconst_0
          //   72: aaload
          //   73: checkcast 58	android/content/Context
          //   76: aload 13
          //   78: iconst_1
          //   79: aaload
          //   80: checkcast 60	java/lang/String
          //   83: aload 13
          //   85: iconst_2
          //   86: aaload
          //   87: checkcast 62	java/lang/Integer
          //   90: invokevirtual 66	java/lang/Integer:intValue	()I
          //   93: invokevirtual 70	com/tencent/smtt/sdk/p:r	(Landroid/content/Context;Ljava/lang/String;I)V
          //   96: goto -60 -> 36
          //   99: ldc 42
          //   101: ldc 72
          //   103: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   106: aload_1
          //   107: getfield 54	android/os/Message:obj	Ljava/lang/Object;
          //   110: checkcast 56	[Ljava/lang/Object;
          //   113: checkcast 56	[Ljava/lang/Object;
          //   116: astore 13
          //   118: aload_0
          //   119: getfield 14	com/tencent/smtt/sdk/p$2:xVQ	Lcom/tencent/smtt/sdk/p;
          //   122: astore 17
          //   124: aload 13
          //   126: iconst_0
          //   127: aaload
          //   128: checkcast 58	android/content/Context
          //   131: astore 18
          //   133: aload 13
          //   135: iconst_1
          //   136: aaload
          //   137: checkcast 58	android/content/Context
          //   140: astore 19
          //   142: aload 13
          //   144: iconst_2
          //   145: aaload
          //   146: checkcast 62	java/lang/Integer
          //   149: invokevirtual 66	java/lang/Integer:intValue	()I
          //   152: istore 4
          //   154: aload 18
          //   156: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   159: sipush 65012
          //   162: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   165: aload 17
          //   167: aload 19
          //   169: invokevirtual 86	com/tencent/smtt/sdk/p:gt	(Landroid/content/Context;)Z
          //   172: ifne -136 -> 36
          //   175: ldc 42
          //   177: new 88	java/lang/StringBuilder
          //   180: dup
          //   181: ldc 90
          //   183: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   186: iload 4
          //   188: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
          //   191: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   194: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   197: getstatic 106	android/os/Build$VERSION:SDK_INT	I
          //   200: bipush 11
          //   202: if_icmplt +69 -> 271
          //   205: aload 19
          //   207: ldc 108
          //   209: iconst_4
          //   210: invokevirtual 112	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
          //   213: astore 13
          //   215: aload 13
          //   217: ldc 114
          //   219: iconst_m1
          //   220: invokeinterface 120 3 0
          //   225: iload 4
          //   227: if_icmpne +57 -> 284
          //   230: ldc 42
          //   232: new 88	java/lang/StringBuilder
          //   235: dup
          //   236: ldc 122
          //   238: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   241: iload 4
          //   243: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
          //   246: ldc 124
          //   248: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   251: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   254: invokestatic 130	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
          //   257: aload 18
          //   259: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   262: sipush 65011
          //   265: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   268: goto -232 -> 36
          //   271: aload 19
          //   273: ldc 108
          //   275: iconst_0
          //   276: invokevirtual 112	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
          //   279: astore 13
          //   281: goto -66 -> 215
          //   284: aload 17
          //   286: aload 19
          //   288: invokevirtual 133	com/tencent/smtt/sdk/p:gQ	(Landroid/content/Context;)Z
          //   291: ifne +17 -> 308
          //   294: aload 18
          //   296: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   299: sipush 65010
          //   302: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   305: goto -269 -> 36
          //   308: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   311: invokeinterface 143 1 0
          //   316: istore 7
          //   318: ldc 42
          //   320: new 88	java/lang/StringBuilder
          //   323: dup
          //   324: ldc -111
          //   326: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   329: iload 7
          //   331: invokevirtual 148	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
          //   334: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   337: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   340: iload 7
          //   342: ifeq +1819 -> 2161
          //   345: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   348: invokeinterface 154 1 0
          //   353: aload 19
          //   355: invokestatic 160	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
          //   358: ldc -94
          //   360: invokevirtual 166	com/tencent/smtt/sdk/j:Yf	(Ljava/lang/String;)I
          //   363: istore_2
          //   364: aload 19
          //   366: invokestatic 160	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
          //   369: ldc -88
          //   371: invokevirtual 171	com/tencent/smtt/sdk/j:Ye	(Ljava/lang/String;)I
          //   374: istore_3
          //   375: iload_2
          //   376: iload 4
          //   378: if_icmpne +49 -> 427
          //   381: getstatic 175	com/tencent/smtt/sdk/QbSdk:xUb	Lcom/tencent/smtt/sdk/q;
          //   384: sipush 220
          //   387: invokeinterface 180 2 0
          //   392: aload 18
          //   394: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   397: sipush 65008
          //   400: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   403: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   406: invokeinterface 183 1 0
          //   411: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   414: invokeinterface 183 1 0
          //   419: aload 17
          //   421: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   424: goto -388 -> 36
          //   427: aload 17
          //   429: aload 19
          //   431: invokevirtual 190	com/tencent/smtt/sdk/p:gC	(Landroid/content/Context;)I
          //   434: istore 5
          //   436: ldc 42
          //   438: new 88	java/lang/StringBuilder
          //   441: dup
          //   442: ldc -64
          //   444: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   447: iload 5
          //   449: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
          //   452: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   455: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   458: iload 5
          //   460: iload 4
          //   462: if_icmpne +71 -> 533
          //   465: getstatic 175	com/tencent/smtt/sdk/QbSdk:xUb	Lcom/tencent/smtt/sdk/q;
          //   468: sipush 220
          //   471: invokeinterface 180 2 0
          //   476: aload 18
          //   478: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   481: sipush 65008
          //   484: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   487: ldc 42
          //   489: new 88	java/lang/StringBuilder
          //   492: dup
          //   493: ldc -62
          //   495: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   498: iload 5
          //   500: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
          //   503: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   506: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   509: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   512: invokeinterface 183 1 0
          //   517: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   520: invokeinterface 183 1 0
          //   525: aload 17
          //   527: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   530: goto -494 -> 36
          //   533: aload 19
          //   535: invokestatic 160	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
          //   538: ldc -60
          //   540: invokevirtual 166	com/tencent/smtt/sdk/j:Yf	(Ljava/lang/String;)I
          //   543: istore 6
          //   545: iload 6
          //   547: ifle +1741 -> 2288
          //   550: iload 4
          //   552: iload 6
          //   554: if_icmpgt +6 -> 560
          //   557: goto +1731 -> 2288
          //   560: aload 19
          //   562: invokestatic 200	com/tencent/smtt/sdk/p:gI	(Landroid/content/Context;)V
          //   565: goto +1736 -> 2301
          //   568: iconst_m1
          //   569: istore_2
          //   570: aload 19
          //   572: invokestatic 200	com/tencent/smtt/sdk/p:gI	(Landroid/content/Context;)V
          //   575: ldc 42
          //   577: ldc -54
          //   579: iconst_1
          //   580: invokestatic 205	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
          //   583: aload 19
          //   585: invokestatic 210	com/tencent/smtt/utils/f:hv	(Landroid/content/Context;)Z
          //   588: ifne +91 -> 679
          //   591: invokestatic 216	com/tencent/smtt/utils/u:cpv	()J
          //   594: lstore 9
          //   596: aload 19
          //   598: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   601: invokevirtual 219	com/tencent/smtt/sdk/k:cof	()J
          //   604: lstore 11
          //   606: aload 18
          //   608: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   611: sipush 65007
          //   614: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   617: aload 19
          //   619: invokestatic 225	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
          //   622: sipush 210
          //   625: new 88	java/lang/StringBuilder
          //   628: dup
          //   629: ldc -29
          //   631: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   634: lload 9
          //   636: invokevirtual 230	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
          //   639: ldc -24
          //   641: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   644: lload 11
          //   646: invokevirtual 230	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
          //   649: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   652: invokevirtual 236	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
          //   655: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   658: invokeinterface 183 1 0
          //   663: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   666: invokeinterface 183 1 0
          //   671: aload 17
          //   673: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   676: goto -640 -> 36
          //   679: iload_2
          //   680: ifle +90 -> 770
          //   683: aload 19
          //   685: invokestatic 241	com/tencent/smtt/sdk/t:gU	(Landroid/content/Context;)Z
          //   688: ifne +33 -> 721
          //   691: aload 19
          //   693: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   696: getfield 245	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
          //   699: ldc -9
          //   701: iconst_0
          //   702: invokeinterface 120 3 0
          //   707: iconst_1
          //   708: if_icmpne +13 -> 721
          //   711: iload 4
          //   713: aload 19
          //   715: invokestatic 250	com/tencent/smtt/sdk/p:gB	(Landroid/content/Context;)I
          //   718: if_icmpne +52 -> 770
          //   721: ldc 42
          //   723: new 88	java/lang/StringBuilder
          //   726: dup
          //   727: ldc -4
          //   729: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   732: aload 19
          //   734: invokestatic 250	com/tencent/smtt/sdk/p:gB	(Landroid/content/Context;)I
          //   737: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
          //   740: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   743: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   746: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   749: invokeinterface 183 1 0
          //   754: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   757: invokeinterface 183 1 0
          //   762: aload 17
          //   764: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   767: goto -731 -> 36
          //   770: iload_2
          //   771: ifne +82 -> 853
          //   774: aload 19
          //   776: invokestatic 160	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
          //   779: ldc -2
          //   781: invokevirtual 166	com/tencent/smtt/sdk/j:Yf	(Ljava/lang/String;)I
          //   784: istore_2
          //   785: iload_2
          //   786: bipush 10
          //   788: if_icmple +52 -> 840
          //   791: aload 19
          //   793: invokestatic 225	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
          //   796: sipush 211
          //   799: ldc_w 256
          //   802: invokevirtual 236	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
          //   805: aload 18
          //   807: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   810: sipush 65006
          //   813: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   816: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   819: invokeinterface 183 1 0
          //   824: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   827: invokeinterface 183 1 0
          //   832: aload 17
          //   834: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   837: goto -801 -> 36
          //   840: aload 19
          //   842: invokestatic 160	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
          //   845: ldc -2
          //   847: iload_2
          //   848: iconst_1
          //   849: iadd
          //   850: invokevirtual 260	com/tencent/smtt/sdk/j:dq	(Ljava/lang/String;I)V
          //   853: aload 18
          //   855: invokestatic 264	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
          //   858: astore 13
          //   860: aload 19
          //   862: invokestatic 241	com/tencent/smtt/sdk/t:gU	(Landroid/content/Context;)Z
          //   865: ifne +270 -> 1135
          //   868: aload 19
          //   870: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   873: getfield 245	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
          //   876: ldc -9
          //   878: iconst_0
          //   879: invokeinterface 120 3 0
          //   884: iconst_1
          //   885: if_icmpne +240 -> 1125
          //   888: aload 19
          //   890: invokestatic 267	com/tencent/smtt/sdk/p:gJ	(Landroid/content/Context;)Ljava/io/File;
          //   893: astore 14
          //   895: aload 13
          //   897: ifnull +1201 -> 2098
          //   900: aload 14
          //   902: ifnull +1196 -> 2098
          //   905: aload 19
          //   907: invokestatic 160	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
          //   910: iload 4
          //   912: iconst_0
          //   913: invokevirtual 271	com/tencent/smtt/sdk/j:eW	(II)V
          //   916: new 273	com/tencent/smtt/utils/s
          //   919: dup
          //   920: invokespecial 274	com/tencent/smtt/utils/s:<init>	()V
          //   923: astore 15
          //   925: aload 15
          //   927: new 276	com/tencent/smtt/utils/s$b
          //   930: dup
          //   931: aload 15
          //   933: aload 13
          //   935: invokespecial 279	com/tencent/smtt/utils/s$b:<init>	(Lcom/tencent/smtt/utils/s;Ljava/io/File;)V
          //   938: putfield 283	com/tencent/smtt/utils/s:xZj	Lcom/tencent/smtt/utils/s$b;
          //   941: invokestatic 288	java/lang/System:currentTimeMillis	()J
          //   944: lstore 9
          //   946: aload 18
          //   948: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   951: sipush 64985
          //   954: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   957: aload 13
          //   959: aload 14
          //   961: invokestatic 291	com/tencent/smtt/utils/f:i	(Ljava/io/File;Ljava/io/File;)Z
          //   964: istore 7
          //   966: aload 19
          //   968: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   971: getfield 245	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
          //   974: ldc -9
          //   976: iconst_0
          //   977: invokeinterface 120 3 0
          //   982: iconst_1
          //   983: if_icmpne +8 -> 991
          //   986: aload 19
          //   988: invokestatic 294	com/tencent/smtt/sdk/t:gT	(Landroid/content/Context;)V
          //   991: ldc 42
          //   993: new 88	java/lang/StringBuilder
          //   996: dup
          //   997: ldc_w 296
          //   1000: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   1003: invokestatic 288	java/lang/System:currentTimeMillis	()J
          //   1006: lload 9
          //   1008: lsub
          //   1009: invokevirtual 230	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
          //   1012: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   1015: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   1018: iload 7
          //   1020: ifeq +1025 -> 2045
          //   1023: aload 15
          //   1025: new 276	com/tencent/smtt/utils/s$b
          //   1028: dup
          //   1029: aload 15
          //   1031: aload 13
          //   1033: invokespecial 279	com/tencent/smtt/utils/s$b:<init>	(Lcom/tencent/smtt/utils/s;Ljava/io/File;)V
          //   1036: putfield 299	com/tencent/smtt/utils/s:xZk	Lcom/tencent/smtt/utils/s$b;
          //   1039: aload 15
          //   1041: getfield 299	com/tencent/smtt/utils/s:xZk	Lcom/tencent/smtt/utils/s$b;
          //   1044: ifnull +1291 -> 2335
          //   1047: aload 15
          //   1049: getfield 283	com/tencent/smtt/utils/s:xZj	Lcom/tencent/smtt/utils/s$b;
          //   1052: ifnonnull +93 -> 1145
          //   1055: goto +1280 -> 2335
          //   1058: iload_2
          //   1059: ifne +145 -> 1204
          //   1062: ldc 42
          //   1064: ldc_w 301
          //   1067: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   1070: aload 14
          //   1072: iconst_1
          //   1073: invokestatic 305	com/tencent/smtt/utils/f:c	(Ljava/io/File;Z)V
          //   1076: aload 19
          //   1078: invokestatic 225	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
          //   1081: sipush 213
          //   1084: ldc_w 307
          //   1087: invokevirtual 236	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
          //   1090: aload 18
          //   1092: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   1095: sipush 65005
          //   1098: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   1101: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   1104: invokeinterface 183 1 0
          //   1109: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   1112: invokeinterface 183 1 0
          //   1117: aload 17
          //   1119: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   1122: goto -1086 -> 36
          //   1125: aload 19
          //   1127: invokestatic 310	com/tencent/smtt/sdk/p:gP	(Landroid/content/Context;)Ljava/io/File;
          //   1130: astore 14
          //   1132: goto -237 -> 895
          //   1135: aload 19
          //   1137: invokestatic 310	com/tencent/smtt/sdk/p:gP	(Landroid/content/Context;)Ljava/io/File;
          //   1140: astore 14
          //   1142: goto -247 -> 895
          //   1145: aload 15
          //   1147: getfield 299	com/tencent/smtt/utils/s:xZk	Lcom/tencent/smtt/utils/s$b;
          //   1150: getfield 314	com/tencent/smtt/utils/s$b:hJr	Ljava/util/Map;
          //   1153: invokeinterface 319 1 0
          //   1158: aload 15
          //   1160: getfield 283	com/tencent/smtt/utils/s:xZj	Lcom/tencent/smtt/utils/s$b;
          //   1163: getfield 314	com/tencent/smtt/utils/s$b:hJr	Ljava/util/Map;
          //   1166: invokeinterface 319 1 0
          //   1171: if_icmpne +28 -> 1199
          //   1174: aload 15
          //   1176: getfield 283	com/tencent/smtt/utils/s:xZj	Lcom/tencent/smtt/utils/s$b;
          //   1179: aload 15
          //   1181: getfield 299	com/tencent/smtt/utils/s:xZk	Lcom/tencent/smtt/utils/s$b;
          //   1184: invokestatic 323	com/tencent/smtt/utils/s:a	(Lcom/tencent/smtt/utils/s$b;Lcom/tencent/smtt/utils/s$b;)Z
          //   1187: istore 7
          //   1189: iload 7
          //   1191: ifeq +8 -> 1199
          //   1194: iconst_1
          //   1195: istore_2
          //   1196: goto -138 -> 1058
          //   1199: iconst_0
          //   1200: istore_2
          //   1201: goto -143 -> 1058
          //   1204: iconst_1
          //   1205: istore_2
          //   1206: aconst_null
          //   1207: astore 16
          //   1209: aconst_null
          //   1210: astore 15
          //   1212: new 325	java/io/File
          //   1215: dup
          //   1216: aload 14
          //   1218: ldc_w 327
          //   1221: invokespecial 330	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
          //   1224: astore 20
          //   1226: new 332	java/util/Properties
          //   1229: dup
          //   1230: invokespecial 333	java/util/Properties:<init>	()V
          //   1233: astore 13
          //   1235: aload 20
          //   1237: invokevirtual 336	java/io/File:exists	()Z
          //   1240: ifeq +257 -> 1497
          //   1243: new 338	java/io/BufferedInputStream
          //   1246: dup
          //   1247: new 340	java/io/FileInputStream
          //   1250: dup
          //   1251: aload 20
          //   1253: invokespecial 343	java/io/FileInputStream:<init>	(Ljava/io/File;)V
          //   1256: invokespecial 346	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
          //   1259: astore 15
          //   1261: aload 13
          //   1263: aload 15
          //   1265: invokevirtual 349	java/util/Properties:load	(Ljava/io/InputStream;)V
          //   1268: iconst_1
          //   1269: istore_2
          //   1270: aload 15
          //   1272: ifnull +910 -> 2182
          //   1275: aload 15
          //   1277: invokevirtual 352	java/io/BufferedInputStream:close	()V
          //   1280: iload_2
          //   1281: ifeq +1001 -> 2282
          //   1284: aload 14
          //   1286: invokevirtual 356	java/io/File:listFiles	()[Ljava/io/File;
          //   1289: astore 15
          //   1291: aload 18
          //   1293: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   1296: sipush 64984
          //   1299: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   1302: iconst_0
          //   1303: istore_3
          //   1304: iconst_1
          //   1305: istore 7
          //   1307: iload 7
          //   1309: istore 8
          //   1311: iload_3
          //   1312: aload 15
          //   1314: arraylength
          //   1315: if_icmpge +310 -> 1625
          //   1318: aload 15
          //   1320: iload_3
          //   1321: aaload
          //   1322: astore 16
          //   1324: iload 7
          //   1326: istore 8
          //   1328: ldc_w 327
          //   1331: aload 16
          //   1333: invokevirtual 359	java/io/File:getName	()Ljava/lang/String;
          //   1336: invokevirtual 363	java/lang/String:equals	(Ljava/lang/Object;)Z
          //   1339: ifne +147 -> 1486
          //   1342: iload 7
          //   1344: istore 8
          //   1346: aload 16
          //   1348: invokevirtual 359	java/io/File:getName	()Ljava/lang/String;
          //   1351: ldc_w 365
          //   1354: invokevirtual 369	java/lang/String:endsWith	(Ljava/lang/String;)Z
          //   1357: ifne +129 -> 1486
          //   1360: iload 7
          //   1362: istore 8
          //   1364: ldc_w 371
          //   1367: aload 16
          //   1369: invokevirtual 359	java/io/File:getName	()Ljava/lang/String;
          //   1372: invokevirtual 363	java/lang/String:equals	(Ljava/lang/Object;)Z
          //   1375: ifne +111 -> 1486
          //   1378: iload 7
          //   1380: istore 8
          //   1382: aload 16
          //   1384: invokevirtual 374	java/io/File:isDirectory	()Z
          //   1387: ifne +99 -> 1486
          //   1390: iload 7
          //   1392: istore 8
          //   1394: aload 16
          //   1396: invokevirtual 359	java/io/File:getName	()Ljava/lang/String;
          //   1399: ldc_w 376
          //   1402: invokevirtual 369	java/lang/String:endsWith	(Ljava/lang/String;)Z
          //   1405: ifne +81 -> 1486
          //   1408: aload 16
          //   1410: invokestatic 382	com/tencent/smtt/utils/a:L	(Ljava/io/File;)Ljava/lang/String;
          //   1413: astore 20
          //   1415: aload 13
          //   1417: aload 16
          //   1419: invokevirtual 359	java/io/File:getName	()Ljava/lang/String;
          //   1422: ldc_w 384
          //   1425: invokevirtual 388	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
          //   1428: astore 21
          //   1430: aload 21
          //   1432: ldc_w 384
          //   1435: invokevirtual 363	java/lang/String:equals	(Ljava/lang/Object;)Z
          //   1438: ifne +136 -> 1574
          //   1441: aload 20
          //   1443: aload 21
          //   1445: invokevirtual 363	java/lang/String:equals	(Ljava/lang/Object;)Z
          //   1448: ifeq +126 -> 1574
          //   1451: ldc 42
          //   1453: new 88	java/lang/StringBuilder
          //   1456: dup
          //   1457: ldc_w 390
          //   1460: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   1463: aload 16
          //   1465: invokevirtual 359	java/io/File:getName	()Ljava/lang/String;
          //   1468: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   1471: ldc_w 392
          //   1474: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   1477: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   1480: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   1483: iconst_1
          //   1484: istore 8
          //   1486: iload_3
          //   1487: iconst_1
          //   1488: iadd
          //   1489: istore_3
          //   1490: iload 8
          //   1492: istore 7
          //   1494: goto -187 -> 1307
          //   1497: iconst_0
          //   1498: istore_2
          //   1499: goto -229 -> 1270
          //   1502: astore 13
          //   1504: aload 16
          //   1506: astore 14
          //   1508: aload 14
          //   1510: ifnull +8 -> 1518
          //   1513: aload 14
          //   1515: invokevirtual 352	java/io/BufferedInputStream:close	()V
          //   1518: aload 13
          //   1520: athrow
          //   1521: astore 13
          //   1523: aload 19
          //   1525: invokestatic 225	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
          //   1528: sipush 215
          //   1531: aload 13
          //   1533: invokevirtual 393	java/lang/Exception:toString	()Ljava/lang/String;
          //   1536: invokevirtual 236	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
          //   1539: aload 18
          //   1541: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   1544: sipush 64999
          //   1547: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   1550: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   1553: invokeinterface 183 1 0
          //   1558: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   1561: invokeinterface 183 1 0
          //   1566: aload 17
          //   1568: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   1571: goto -1535 -> 36
          //   1574: iconst_0
          //   1575: istore 8
          //   1577: ldc 42
          //   1579: new 88	java/lang/StringBuilder
          //   1582: dup
          //   1583: ldc_w 395
          //   1586: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   1589: aload 16
          //   1591: invokevirtual 359	java/io/File:getName	()Ljava/lang/String;
          //   1594: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   1597: ldc_w 397
          //   1600: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   1603: aload 21
          //   1605: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   1608: ldc_w 399
          //   1611: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   1614: aload 20
          //   1616: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   1619: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   1622: invokestatic 130	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
          //   1625: ldc 42
          //   1627: new 88	java/lang/StringBuilder
          //   1630: dup
          //   1631: ldc_w 401
          //   1634: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   1637: iload 8
          //   1639: invokevirtual 148	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
          //   1642: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   1645: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   1648: iload_2
          //   1649: ifeq +71 -> 1720
          //   1652: iload 8
          //   1654: ifne +66 -> 1720
          //   1657: ldc 42
          //   1659: ldc_w 403
          //   1662: invokestatic 130	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
          //   1665: aload 14
          //   1667: iconst_1
          //   1668: invokestatic 305	com/tencent/smtt/utils/f:c	(Ljava/io/File;Z)V
          //   1671: aload 19
          //   1673: invokestatic 225	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
          //   1676: sipush 213
          //   1679: ldc_w 405
          //   1682: invokevirtual 236	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
          //   1685: aload 18
          //   1687: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   1690: sipush 65004
          //   1693: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   1696: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   1699: invokeinterface 183 1 0
          //   1704: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   1707: invokeinterface 183 1 0
          //   1712: aload 17
          //   1714: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   1717: goto -1681 -> 36
          //   1720: ldc 42
          //   1722: ldc_w 407
          //   1725: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   1728: aload 19
          //   1730: iconst_1
          //   1731: invokestatic 411	com/tencent/smtt/sdk/p:w	(Landroid/content/Context;Z)V
          //   1734: aload 18
          //   1736: invokestatic 416	com/tencent/smtt/sdk/h:gi	(Landroid/content/Context;)Ljava/io/File;
          //   1739: astore 14
          //   1741: aload 14
          //   1743: ifnull +40 -> 1783
          //   1746: aload 14
          //   1748: invokevirtual 336	java/io/File:exists	()Z
          //   1751: ifeq +32 -> 1783
          //   1754: aload 19
          //   1756: invokestatic 421	com/tencent/smtt/sdk/l:gp	(Landroid/content/Context;)Z
          //   1759: ifeq +193 -> 1952
          //   1762: ldc_w 423
          //   1765: astore 13
          //   1767: new 325	java/io/File
          //   1770: dup
          //   1771: aload 14
          //   1773: aload 13
          //   1775: invokespecial 330	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
          //   1778: aload 19
          //   1780: invokestatic 426	com/tencent/smtt/sdk/h:a	(Ljava/io/File;Landroid/content/Context;)V
          //   1783: aload 19
          //   1785: invokestatic 160	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
          //   1788: iload 4
          //   1790: iconst_1
          //   1791: invokevirtual 271	com/tencent/smtt/sdk/j:eW	(II)V
          //   1794: aload 17
          //   1796: getfield 430	com/tencent/smtt/sdk/p:xVK	Z
          //   1799: ifeq +161 -> 1960
          //   1802: aload 19
          //   1804: invokestatic 225	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
          //   1807: sipush 220
          //   1810: ldc_w 432
          //   1813: invokevirtual 236	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
          //   1816: aload 18
          //   1818: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   1821: sipush 65003
          //   1824: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   1827: ldc 42
          //   1829: new 88	java/lang/StringBuilder
          //   1832: dup
          //   1833: ldc_w 434
          //   1836: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   1839: iload 4
          //   1841: invokevirtual 97	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
          //   1844: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   1847: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   1850: getstatic 106	android/os/Build$VERSION:SDK_INT	I
          //   1853: bipush 11
          //   1855: if_icmplt +146 -> 2001
          //   1858: aload 19
          //   1860: ldc 108
          //   1862: iconst_4
          //   1863: invokevirtual 112	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
          //   1866: astore 13
          //   1868: aload 13
          //   1870: invokeinterface 438 1 0
          //   1875: astore 13
          //   1877: aload 13
          //   1879: ldc_w 440
          //   1882: iconst_0
          //   1883: invokeinterface 446 3 0
          //   1888: pop
          //   1889: aload 13
          //   1891: ldc_w 448
          //   1894: iconst_0
          //   1895: invokeinterface 446 3 0
          //   1900: pop
          //   1901: aload 13
          //   1903: ldc_w 450
          //   1906: iload 4
          //   1908: invokeinterface 446 3 0
          //   1913: pop
          //   1914: aload 13
          //   1916: invokeinterface 453 1 0
          //   1921: pop
          //   1922: aload 19
          //   1924: invokestatic 456	com/tencent/smtt/utils/u:hC	(Landroid/content/Context;)Z
          //   1927: pop
          //   1928: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   1931: invokeinterface 183 1 0
          //   1936: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   1939: invokeinterface 183 1 0
          //   1944: aload 17
          //   1946: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   1949: goto -1913 -> 36
          //   1952: ldc_w 458
          //   1955: astore 13
          //   1957: goto -190 -> 1767
          //   1960: aload 19
          //   1962: invokestatic 225	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
          //   1965: sipush 220
          //   1968: ldc_w 460
          //   1971: invokevirtual 236	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
          //   1974: goto -158 -> 1816
          //   1977: astore_1
          //   1978: getstatic 151	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
          //   1981: invokeinterface 183 1 0
          //   1986: getstatic 137	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
          //   1989: invokeinterface 183 1 0
          //   1994: aload 17
          //   1996: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   1999: aload_1
          //   2000: athrow
          //   2001: aload 19
          //   2003: ldc 108
          //   2005: iconst_0
          //   2006: invokevirtual 112	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
          //   2009: astore 13
          //   2011: goto -143 -> 1868
          //   2014: astore 13
          //   2016: ldc 42
          //   2018: new 88	java/lang/StringBuilder
          //   2021: dup
          //   2022: ldc_w 462
          //   2025: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   2028: aload 13
          //   2030: invokestatic 468	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
          //   2033: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   2036: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   2039: invokestatic 130	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
          //   2042: goto -120 -> 1922
          //   2045: ldc 42
          //   2047: ldc_w 470
          //   2050: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   2053: aload 19
          //   2055: invokestatic 160	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
          //   2058: iload 4
          //   2060: iconst_2
          //   2061: invokevirtual 271	com/tencent/smtt/sdk/j:eW	(II)V
          //   2064: aload 14
          //   2066: iconst_0
          //   2067: invokestatic 305	com/tencent/smtt/utils/f:c	(Ljava/io/File;Z)V
          //   2070: aload 18
          //   2072: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   2075: sipush 65002
          //   2078: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   2081: aload 19
          //   2083: invokestatic 225	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
          //   2086: sipush 212
          //   2089: ldc_w 472
          //   2092: invokevirtual 236	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
          //   2095: goto -167 -> 1928
          //   2098: aload 13
          //   2100: ifnonnull +28 -> 2128
          //   2103: aload 19
          //   2105: invokestatic 225	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
          //   2108: sipush 213
          //   2111: ldc_w 474
          //   2114: invokevirtual 236	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
          //   2117: aload 18
          //   2119: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   2122: sipush 65001
          //   2125: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   2128: aload 14
          //   2130: ifnonnull -202 -> 1928
          //   2133: aload 19
          //   2135: invokestatic 225	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
          //   2138: sipush 214
          //   2141: ldc_w 476
          //   2144: invokevirtual 236	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
          //   2147: aload 18
          //   2149: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   2152: sipush 65000
          //   2155: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   2158: goto -230 -> 1928
          //   2161: aload 17
          //   2163: invokevirtual 186	com/tencent/smtt/sdk/p:cox	()V
          //   2166: aload 18
          //   2168: invokestatic 78	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
          //   2171: sipush 64998
          //   2174: invokevirtual 82	com/tencent/smtt/sdk/k:Fg	(I)V
          //   2177: goto -2141 -> 36
          //   2180: astore 15
          //   2182: goto -902 -> 1280
          //   2185: astore 13
          //   2187: aconst_null
          //   2188: astore 13
          //   2190: aconst_null
          //   2191: astore 15
          //   2193: aload 15
          //   2195: ifnull +13 -> 2208
          //   2198: aload 15
          //   2200: invokevirtual 352	java/io/BufferedInputStream:close	()V
          //   2203: goto -923 -> 1280
          //   2206: astore 15
          //   2208: goto -928 -> 1280
          //   2211: ldc 42
          //   2213: ldc_w 478
          //   2216: invokestatic 50	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   2219: aload_1
          //   2220: getfield 54	android/os/Message:obj	Ljava/lang/Object;
          //   2223: checkcast 56	[Ljava/lang/Object;
          //   2226: checkcast 56	[Ljava/lang/Object;
          //   2229: astore 13
          //   2231: aload_0
          //   2232: getfield 14	com/tencent/smtt/sdk/p$2:xVQ	Lcom/tencent/smtt/sdk/p;
          //   2235: aload 13
          //   2237: iconst_0
          //   2238: aaload
          //   2239: checkcast 58	android/content/Context
          //   2242: aload 13
          //   2244: iconst_1
          //   2245: aaload
          //   2246: checkcast 480	android/os/Bundle
          //   2249: invokevirtual 484	com/tencent/smtt/sdk/p:f	(Landroid/content/Context;Landroid/os/Bundle;)V
          //   2252: goto -2216 -> 36
          //   2255: astore 14
          //   2257: goto -739 -> 1518
          //   2260: astore 13
          //   2262: aload 15
          //   2264: astore 14
          //   2266: goto -758 -> 1508
          //   2269: astore 15
          //   2271: aconst_null
          //   2272: astore 15
          //   2274: goto -81 -> 2193
          //   2277: astore 16
          //   2279: goto -86 -> 2193
          //   2282: iconst_1
          //   2283: istore 8
          //   2285: goto -660 -> 1625
          //   2288: iload_2
          //   2289: ifle +12 -> 2301
          //   2292: iload 4
          //   2294: iload_2
          //   2295: if_icmple +6 -> 2301
          //   2298: goto -1738 -> 560
          //   2301: iload_3
          //   2302: istore_2
          //   2303: iload_3
          //   2304: iconst_3
          //   2305: if_icmpne -1722 -> 583
          //   2308: iload_3
          //   2309: istore_2
          //   2310: iload 5
          //   2312: ifle -1729 -> 583
          //   2315: iload 4
          //   2317: iload 5
          //   2319: if_icmpgt -1751 -> 568
          //   2322: iload_3
          //   2323: istore_2
          //   2324: iload 4
          //   2326: ldc_w 485
          //   2329: if_icmpne -1746 -> 583
          //   2332: goto -1764 -> 568
          //   2335: iconst_0
          //   2336: istore_2
          //   2337: goto -1279 -> 1058
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	2340	0	this	2
          //   0	2340	1	paramAnonymousMessage	Message
          //   363	1974	2	i	int
          //   374	1949	3	j	int
          //   152	2178	4	k	int
          //   434	1886	5	m	int
          //   543	12	6	n	int
          //   316	1177	7	bool1	boolean
          //   1309	975	8	bool2	boolean
          //   594	413	9	l1	long
          //   604	41	11	l2	long
          //   63	1353	13	localObject1	Object
          //   1502	17	13	localObject2	Object
          //   1521	11	13	localException1	Exception
          //   1765	245	13	localObject3	Object
          //   2014	85	13	localThrowable	Throwable
          //   2185	1	13	localException2	Exception
          //   2188	55	13	arrayOfObject	Object[]
          //   2260	1	13	localObject4	Object
          //   893	1236	14	localObject5	Object
          //   2255	1	14	localIOException1	java.io.IOException
          //   2264	1	14	localObject6	Object
          //   923	396	15	localObject7	Object
          //   2180	1	15	localIOException2	java.io.IOException
          //   2191	8	15	localObject8	Object
          //   2206	57	15	localIOException3	java.io.IOException
          //   2269	1	15	localException3	Exception
          //   2272	1	15	localObject9	Object
          //   1207	383	16	localFile	File
          //   2277	1	16	localException4	Exception
          //   122	2040	17	localp	p
          //   131	2036	18	localContext1	Context
          //   140	1994	19	localContext2	Context
          //   1224	391	20	localObject10	Object
          //   1428	176	21	str	String
          // Exception table:
          //   from	to	target	type
          //   1212	1235	1502	finally
          //   1235	1261	1502	finally
          //   353	375	1521	java/lang/Exception
          //   381	403	1521	java/lang/Exception
          //   427	458	1521	java/lang/Exception
          //   465	509	1521	java/lang/Exception
          //   533	545	1521	java/lang/Exception
          //   560	565	1521	java/lang/Exception
          //   570	583	1521	java/lang/Exception
          //   583	655	1521	java/lang/Exception
          //   683	721	1521	java/lang/Exception
          //   721	746	1521	java/lang/Exception
          //   774	785	1521	java/lang/Exception
          //   791	816	1521	java/lang/Exception
          //   840	853	1521	java/lang/Exception
          //   853	895	1521	java/lang/Exception
          //   905	991	1521	java/lang/Exception
          //   991	1018	1521	java/lang/Exception
          //   1023	1055	1521	java/lang/Exception
          //   1062	1101	1521	java/lang/Exception
          //   1125	1132	1521	java/lang/Exception
          //   1135	1142	1521	java/lang/Exception
          //   1145	1189	1521	java/lang/Exception
          //   1275	1280	1521	java/lang/Exception
          //   1284	1302	1521	java/lang/Exception
          //   1311	1318	1521	java/lang/Exception
          //   1328	1342	1521	java/lang/Exception
          //   1346	1360	1521	java/lang/Exception
          //   1364	1378	1521	java/lang/Exception
          //   1382	1390	1521	java/lang/Exception
          //   1394	1483	1521	java/lang/Exception
          //   1513	1518	1521	java/lang/Exception
          //   1518	1521	1521	java/lang/Exception
          //   1577	1625	1521	java/lang/Exception
          //   1625	1648	1521	java/lang/Exception
          //   1657	1696	1521	java/lang/Exception
          //   1720	1741	1521	java/lang/Exception
          //   1746	1762	1521	java/lang/Exception
          //   1767	1783	1521	java/lang/Exception
          //   1783	1816	1521	java/lang/Exception
          //   1816	1868	1521	java/lang/Exception
          //   1868	1922	1521	java/lang/Exception
          //   1922	1928	1521	java/lang/Exception
          //   1960	1974	1521	java/lang/Exception
          //   2001	2011	1521	java/lang/Exception
          //   2016	2042	1521	java/lang/Exception
          //   2045	2095	1521	java/lang/Exception
          //   2103	2128	1521	java/lang/Exception
          //   2133	2158	1521	java/lang/Exception
          //   2198	2203	1521	java/lang/Exception
          //   353	375	1977	finally
          //   381	403	1977	finally
          //   427	458	1977	finally
          //   465	509	1977	finally
          //   533	545	1977	finally
          //   560	565	1977	finally
          //   570	583	1977	finally
          //   583	655	1977	finally
          //   683	721	1977	finally
          //   721	746	1977	finally
          //   774	785	1977	finally
          //   791	816	1977	finally
          //   840	853	1977	finally
          //   853	895	1977	finally
          //   905	991	1977	finally
          //   991	1018	1977	finally
          //   1023	1055	1977	finally
          //   1062	1101	1977	finally
          //   1125	1132	1977	finally
          //   1135	1142	1977	finally
          //   1145	1189	1977	finally
          //   1275	1280	1977	finally
          //   1284	1302	1977	finally
          //   1311	1318	1977	finally
          //   1328	1342	1977	finally
          //   1346	1360	1977	finally
          //   1364	1378	1977	finally
          //   1382	1390	1977	finally
          //   1394	1483	1977	finally
          //   1513	1518	1977	finally
          //   1518	1521	1977	finally
          //   1523	1550	1977	finally
          //   1577	1625	1977	finally
          //   1625	1648	1977	finally
          //   1657	1696	1977	finally
          //   1720	1741	1977	finally
          //   1746	1762	1977	finally
          //   1767	1783	1977	finally
          //   1783	1816	1977	finally
          //   1816	1868	1977	finally
          //   1868	1922	1977	finally
          //   1922	1928	1977	finally
          //   1960	1974	1977	finally
          //   2001	2011	1977	finally
          //   2016	2042	1977	finally
          //   2045	2095	1977	finally
          //   2103	2128	1977	finally
          //   2133	2158	1977	finally
          //   2198	2203	1977	finally
          //   1868	1922	2014	java/lang/Throwable
          //   1275	1280	2180	java/io/IOException
          //   1212	1235	2185	java/lang/Exception
          //   2198	2203	2206	java/io/IOException
          //   1513	1518	2255	java/io/IOException
          //   1261	1268	2260	finally
          //   1235	1261	2269	java/lang/Exception
          //   1261	1268	2277	java/lang/Exception
        }
      };
    }
  }
  
  /* Error */
  static int Yh(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: aconst_null
    //   7: astore_2
    //   8: new 126	java/io/File
    //   11: dup
    //   12: new 126	java/io/File
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: ldc -125
    //   22: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   25: astore_0
    //   26: aload_0
    //   27: invokevirtual 138	java/io/File:exists	()Z
    //   30: ifeq -26 -> 4
    //   33: new 140	java/util/Properties
    //   36: dup
    //   37: invokespecial 141	java/util/Properties:<init>	()V
    //   40: astore_3
    //   41: new 143	java/io/BufferedInputStream
    //   44: dup
    //   45: new 145	java/io/FileInputStream
    //   48: dup
    //   49: aload_0
    //   50: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   53: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   56: astore_0
    //   57: aload_3
    //   58: aload_0
    //   59: invokevirtual 154	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   62: aload_0
    //   63: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   66: aload_3
    //   67: ldc -97
    //   69: invokevirtual 163	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   72: astore_2
    //   73: aload_2
    //   74: ifnonnull +12 -> 86
    //   77: aload_0
    //   78: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   81: iconst_0
    //   82: ireturn
    //   83: astore_0
    //   84: iconst_0
    //   85: ireturn
    //   86: aload_2
    //   87: invokestatic 168	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   90: istore_1
    //   91: aload_0
    //   92: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   95: iload_1
    //   96: ireturn
    //   97: astore_0
    //   98: iload_1
    //   99: ireturn
    //   100: astore_0
    //   101: aload_2
    //   102: ifnull +7 -> 109
    //   105: aload_2
    //   106: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   109: aload_0
    //   110: athrow
    //   111: astore_0
    //   112: aconst_null
    //   113: astore_0
    //   114: aload_0
    //   115: ifnull -111 -> 4
    //   118: aload_0
    //   119: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   122: iconst_0
    //   123: ireturn
    //   124: astore_0
    //   125: iconst_0
    //   126: ireturn
    //   127: astore_2
    //   128: goto -19 -> 109
    //   131: astore_3
    //   132: aload_0
    //   133: astore_2
    //   134: aload_3
    //   135: astore_0
    //   136: goto -35 -> 101
    //   139: astore_2
    //   140: goto -26 -> 114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	paramString	String
    //   90	9	1	i	int
    //   7	99	2	str1	String
    //   127	1	2	localIOException	java.io.IOException
    //   133	1	2	str2	String
    //   139	1	2	localException	Exception
    //   40	27	3	localProperties	java.util.Properties
    //   131	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   77	81	83	java/io/IOException
    //   91	95	97	java/io/IOException
    //   8	57	100	finally
    //   8	57	111	java/lang/Exception
    //   118	122	124	java/io/IOException
    //   105	109	127	java/io/IOException
    //   57	73	131	finally
    //   86	91	131	finally
    //   57	73	139	java/lang/Exception
    //   86	91	139	java/lang/Exception
  }
  
  /* Error */
  private boolean a(final Context paramContext1, Context paramContext2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc -84
    //   4: ldc -82
    //   6: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: getstatic 97	com/tencent/smtt/sdk/p:xVP	Z
    //   12: istore_3
    //   13: iload_3
    //   14: iconst_1
    //   15: if_icmpne +7 -> 22
    //   18: aload_0
    //   19: monitorexit
    //   20: iconst_1
    //   21: ireturn
    //   22: iconst_1
    //   23: putstatic 97	com/tencent/smtt/sdk/p:xVP	Z
    //   26: new 10	com/tencent/smtt/sdk/p$3
    //   29: dup
    //   30: aload_0
    //   31: aconst_null
    //   32: aload_1
    //   33: invokespecial 183	com/tencent/smtt/sdk/p$3:<init>	(Lcom/tencent/smtt/sdk/p;Landroid/content/Context;Landroid/content/Context;)V
    //   36: invokevirtual 186	com/tencent/smtt/sdk/p$3:start	()V
    //   39: goto -21 -> 18
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	p
    //   0	47	1	paramContext1	Context
    //   0	47	2	paramContext2	Context
    //   12	4	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	13	42	finally
    //   22	39	42	finally
  }
  
  /* Error */
  private boolean a(Context paramContext, File paramFile)
  {
    // Byte code:
    //   0: aload_2
    //   1: new 18	com/tencent/smtt/sdk/p$5
    //   4: dup
    //   5: aload_0
    //   6: invokespecial 190	com/tencent/smtt/sdk/p$5:<init>	(Lcom/tencent/smtt/sdk/p;)V
    //   9: invokevirtual 194	java/io/File:listFiles	(Ljava/io/FileFilter;)[Ljava/io/File;
    //   12: astore 6
    //   14: aload 6
    //   16: arraylength
    //   17: istore 4
    //   19: getstatic 199	android/os/Build$VERSION:SDK_INT	I
    //   22: bipush 16
    //   24: if_icmpge +32 -> 56
    //   27: aload_1
    //   28: invokevirtual 205	android/content/Context:getPackageName	()Ljava/lang/String;
    //   31: ifnull +25 -> 56
    //   34: aload_1
    //   35: invokevirtual 205	android/content/Context:getPackageName	()Ljava/lang/String;
    //   38: ldc -49
    //   40: invokevirtual 213	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   43: istore 5
    //   45: iload 5
    //   47: ifeq +9 -> 56
    //   50: ldc2_w 214
    //   53: invokestatic 221	java/lang/Thread:sleep	(J)V
    //   56: aload_1
    //   57: invokevirtual 225	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   60: astore 7
    //   62: iconst_0
    //   63: istore_3
    //   64: iload_3
    //   65: iload 4
    //   67: if_icmpge +59 -> 126
    //   70: ldc -84
    //   72: new 227	java/lang/StringBuilder
    //   75: dup
    //   76: ldc -27
    //   78: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   81: aload 6
    //   83: iload_3
    //   84: aaload
    //   85: invokevirtual 233	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   88: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   97: new 242	dalvik/system/DexClassLoader
    //   100: dup
    //   101: aload 6
    //   103: iload_3
    //   104: aaload
    //   105: invokevirtual 233	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   108: aload_2
    //   109: invokevirtual 233	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   112: aconst_null
    //   113: aload 7
    //   115: invokespecial 245	dalvik/system/DexClassLoader:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   118: pop
    //   119: iload_3
    //   120: iconst_1
    //   121: iadd
    //   122: istore_3
    //   123: goto -59 -> 64
    //   126: iconst_1
    //   127: ireturn
    //   128: astore_2
    //   129: aload_1
    //   130: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   133: sipush 209
    //   136: aload_2
    //   137: invokevirtual 252	java/lang/Exception:toString	()Ljava/lang/String;
    //   140: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   143: ldc -84
    //   145: ldc_w 258
    //   148: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   151: iconst_0
    //   152: ireturn
    //   153: astore 7
    //   155: goto -99 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	p
    //   0	158	1	paramContext	Context
    //   0	158	2	paramFile	File
    //   63	60	3	i	int
    //   17	51	4	j	int
    //   43	3	5	bool	boolean
    //   12	90	6	arrayOfFile	File[]
    //   60	54	7	localClassLoader	ClassLoader
    //   153	1	7	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	45	128	java/lang/Exception
    //   56	62	128	java/lang/Exception
    //   70	119	128	java/lang/Exception
    //   50	56	153	java/lang/Exception
  }
  
  /* Error */
  private static boolean a(Context paramContext, File paramFile, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: iconst_1
    //   4: istore 4
    //   6: ldc -84
    //   8: ldc_w 263
    //   11: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   14: aload_1
    //   15: invokestatic 269	com/tencent/smtt/utils/f:P	(Ljava/io/File;)Z
    //   18: ifne +28 -> 46
    //   21: aload_0
    //   22: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   25: sipush 204
    //   28: ldc_w 271
    //   31: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   34: aload_0
    //   35: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   38: sipush 65016
    //   41: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   44: iconst_0
    //   45: ireturn
    //   46: aload_0
    //   47: ldc_w 283
    //   50: iconst_0
    //   51: invokevirtual 287	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   54: astore 7
    //   56: iload_2
    //   57: ifeq +90 -> 147
    //   60: new 126	java/io/File
    //   63: dup
    //   64: aload 7
    //   66: ldc_w 289
    //   69: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   72: astore 7
    //   74: aload 7
    //   76: invokevirtual 138	java/io/File:exists	()Z
    //   79: ifeq +28 -> 107
    //   82: aload_0
    //   83: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   86: getfield 293	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   89: ldc_w 295
    //   92: iconst_0
    //   93: invokeinterface 301 3 0
    //   98: iconst_1
    //   99: if_icmpeq +8 -> 107
    //   102: aload 7
    //   104: invokestatic 304	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   107: iload_2
    //   108: ifeq +87 -> 195
    //   111: aload_0
    //   112: invokestatic 308	com/tencent/smtt/sdk/p:gO	(Landroid/content/Context;)Ljava/io/File;
    //   115: astore 7
    //   117: aload 7
    //   119: ifnonnull +85 -> 204
    //   122: aload_0
    //   123: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   126: sipush 205
    //   129: ldc_w 310
    //   132: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   135: aload_0
    //   136: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   139: sipush 65015
    //   142: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   145: iconst_0
    //   146: ireturn
    //   147: new 126	java/io/File
    //   150: dup
    //   151: aload 7
    //   153: ldc_w 312
    //   156: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   159: astore 7
    //   161: goto -87 -> 74
    //   164: astore 7
    //   166: ldc -84
    //   168: new 227	java/lang/StringBuilder
    //   171: dup
    //   172: ldc_w 314
    //   175: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   178: aload 7
    //   180: invokestatic 320	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   183: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: invokestatic 323	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   192: goto -85 -> 107
    //   195: aload_0
    //   196: invokestatic 326	com/tencent/smtt/sdk/p:gN	(Landroid/content/Context;)Ljava/io/File;
    //   199: astore 7
    //   201: goto -84 -> 117
    //   204: aload 7
    //   206: invokestatic 329	com/tencent/smtt/utils/f:N	(Ljava/io/File;)Z
    //   209: pop
    //   210: iload_2
    //   211: ifeq +9 -> 220
    //   214: aload 7
    //   216: iconst_1
    //   217: invokestatic 333	com/tencent/smtt/utils/f:c	(Ljava/io/File;Z)V
    //   220: aload_1
    //   221: aload 7
    //   223: invokestatic 337	com/tencent/smtt/utils/f:h	(Ljava/io/File;Ljava/io/File;)Z
    //   226: istore 6
    //   228: iload_2
    //   229: ifeq +76 -> 305
    //   232: aload 7
    //   234: invokevirtual 341	java/io/File:list	()[Ljava/lang/String;
    //   237: astore_1
    //   238: iconst_0
    //   239: istore_3
    //   240: iload_3
    //   241: aload_1
    //   242: arraylength
    //   243: if_icmpge +44 -> 287
    //   246: new 126	java/io/File
    //   249: dup
    //   250: aload 7
    //   252: aload_1
    //   253: iload_3
    //   254: aaload
    //   255: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   258: astore 8
    //   260: aload 8
    //   262: invokevirtual 344	java/io/File:getName	()Ljava/lang/String;
    //   265: ldc_w 346
    //   268: invokevirtual 349	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   271: ifeq +9 -> 280
    //   274: aload 8
    //   276: invokevirtual 352	java/io/File:delete	()Z
    //   279: pop
    //   280: iload_3
    //   281: iconst_1
    //   282: iadd
    //   283: istore_3
    //   284: goto -44 -> 240
    //   287: new 126	java/io/File
    //   290: dup
    //   291: aload_0
    //   292: invokestatic 355	com/tencent/smtt/sdk/p:gM	(Landroid/content/Context;)Ljava/io/File;
    //   295: ldc_w 357
    //   298: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   301: invokevirtual 352	java/io/File:delete	()Z
    //   304: pop
    //   305: iload 6
    //   307: ifne +55 -> 362
    //   310: aload 7
    //   312: invokestatic 304	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   315: aload_0
    //   316: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   319: sipush 65014
    //   322: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   325: ldc -84
    //   327: new 227	java/lang/StringBuilder
    //   330: dup
    //   331: ldc_w 359
    //   334: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   337: aload 7
    //   339: invokevirtual 138	java/io/File:exists	()Z
    //   342: invokevirtual 362	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   345: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   348: invokestatic 323	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   351: ldc -84
    //   353: ldc_w 364
    //   356: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   359: iload 6
    //   361: ireturn
    //   362: aload_0
    //   363: iconst_1
    //   364: invokestatic 368	com/tencent/smtt/sdk/p:w	(Landroid/content/Context;Z)V
    //   367: iload_2
    //   368: ifeq -17 -> 351
    //   371: aload_0
    //   372: invokestatic 371	com/tencent/smtt/sdk/p:gJ	(Landroid/content/Context;)Ljava/io/File;
    //   375: astore_1
    //   376: aload_1
    //   377: iconst_1
    //   378: invokestatic 333	com/tencent/smtt/utils/f:c	(Ljava/io/File;Z)V
    //   381: aload 7
    //   383: aload_1
    //   384: invokevirtual 374	java/io/File:renameTo	(Ljava/io/File;)Z
    //   387: pop
    //   388: aload_0
    //   389: invokestatic 380	com/tencent/smtt/sdk/t:gT	(Landroid/content/Context;)V
    //   392: goto -41 -> 351
    //   395: astore_1
    //   396: aload_0
    //   397: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   400: sipush 65013
    //   403: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   406: aload_0
    //   407: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   410: sipush 206
    //   413: aload_1
    //   414: invokevirtual 383	com/tencent/smtt/sdk/r:c	(ILjava/lang/Throwable;)V
    //   417: aload 7
    //   419: ifnull +234 -> 653
    //   422: aload 7
    //   424: invokevirtual 138	java/io/File:exists	()Z
    //   427: istore_2
    //   428: iload_2
    //   429: ifeq +224 -> 653
    //   432: iload 4
    //   434: istore_3
    //   435: iload_3
    //   436: ifeq +39 -> 475
    //   439: aload 7
    //   441: ifnull +34 -> 475
    //   444: aload 7
    //   446: invokestatic 304	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   449: ldc -84
    //   451: new 227	java/lang/StringBuilder
    //   454: dup
    //   455: ldc_w 385
    //   458: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   461: aload 7
    //   463: invokevirtual 138	java/io/File:exists	()Z
    //   466: invokevirtual 362	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   469: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   472: invokestatic 323	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   475: ldc -84
    //   477: ldc_w 364
    //   480: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   483: iconst_0
    //   484: ireturn
    //   485: astore_1
    //   486: aload_0
    //   487: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   490: sipush 65013
    //   493: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   496: aload_0
    //   497: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   500: sipush 207
    //   503: aload_1
    //   504: invokevirtual 383	com/tencent/smtt/sdk/r:c	(ILjava/lang/Throwable;)V
    //   507: aload 7
    //   509: ifnull +139 -> 648
    //   512: aload 7
    //   514: invokevirtual 138	java/io/File:exists	()Z
    //   517: istore_2
    //   518: iload_2
    //   519: ifeq +129 -> 648
    //   522: iload 5
    //   524: istore_3
    //   525: iload_3
    //   526: ifeq +39 -> 565
    //   529: aload 7
    //   531: ifnull +34 -> 565
    //   534: aload 7
    //   536: invokestatic 304	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   539: ldc -84
    //   541: new 227	java/lang/StringBuilder
    //   544: dup
    //   545: ldc_w 385
    //   548: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   551: aload 7
    //   553: invokevirtual 138	java/io/File:exists	()Z
    //   556: invokevirtual 362	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   559: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   562: invokestatic 323	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   565: ldc -84
    //   567: ldc_w 364
    //   570: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   573: iconst_0
    //   574: ireturn
    //   575: astore_0
    //   576: ldc -84
    //   578: ldc_w 364
    //   581: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   584: aload_0
    //   585: athrow
    //   586: astore_0
    //   587: ldc -84
    //   589: new 227	java/lang/StringBuilder
    //   592: dup
    //   593: ldc_w 387
    //   596: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   599: aload_0
    //   600: invokestatic 320	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   603: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   609: invokestatic 323	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   612: goto -137 -> 475
    //   615: astore_0
    //   616: ldc -84
    //   618: new 227	java/lang/StringBuilder
    //   621: dup
    //   622: ldc_w 387
    //   625: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   628: aload_0
    //   629: invokestatic 320	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   632: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   638: invokestatic 323	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   641: goto -76 -> 565
    //   644: astore_1
    //   645: goto -340 -> 305
    //   648: iconst_0
    //   649: istore_3
    //   650: goto -125 -> 525
    //   653: iconst_0
    //   654: istore_3
    //   655: goto -220 -> 435
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	658	0	paramContext	Context
    //   0	658	1	paramFile	File
    //   0	658	2	paramBoolean	boolean
    //   239	416	3	i	int
    //   4	429	4	j	int
    //   1	522	5	k	int
    //   226	134	6	bool	boolean
    //   54	106	7	localFile1	File
    //   164	15	7	localThrowable	Throwable
    //   199	353	7	localFile2	File
    //   258	17	8	localFile3	File
    // Exception table:
    //   from	to	target	type
    //   46	56	164	java/lang/Throwable
    //   60	74	164	java/lang/Throwable
    //   74	107	164	java/lang/Throwable
    //   147	161	164	java/lang/Throwable
    //   204	210	395	java/io/IOException
    //   214	220	395	java/io/IOException
    //   220	228	395	java/io/IOException
    //   232	238	395	java/io/IOException
    //   240	280	395	java/io/IOException
    //   287	305	395	java/io/IOException
    //   310	351	395	java/io/IOException
    //   362	367	395	java/io/IOException
    //   371	392	395	java/io/IOException
    //   204	210	485	java/lang/Exception
    //   214	220	485	java/lang/Exception
    //   220	228	485	java/lang/Exception
    //   232	238	485	java/lang/Exception
    //   240	280	485	java/lang/Exception
    //   310	351	485	java/lang/Exception
    //   362	367	485	java/lang/Exception
    //   371	392	485	java/lang/Exception
    //   204	210	575	finally
    //   214	220	575	finally
    //   220	228	575	finally
    //   232	238	575	finally
    //   240	280	575	finally
    //   287	305	575	finally
    //   310	351	575	finally
    //   362	367	575	finally
    //   371	392	575	finally
    //   396	417	575	finally
    //   422	428	575	finally
    //   486	507	575	finally
    //   512	518	575	finally
    //   444	475	586	java/lang/Throwable
    //   534	565	615	java/lang/Throwable
    //   287	305	644	java/lang/Exception
  }
  
  private Context am(Context paramContext, int paramInt)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreHostContext tbsCoreTargetVer=" + paramInt);
    if (paramInt <= 0) {
      return null;
    }
    String[] arrayOfString = t.coG();
    int i = 0;
    label35:
    Context localContext;
    if (i < 4) {
      if ((!paramContext.getPackageName().equalsIgnoreCase(arrayOfString[i])) && (bB(paramContext, arrayOfString[i])))
      {
        localContext = bC(paramContext, arrayOfString[i]);
        if (localContext != null)
        {
          if (gx(localContext)) {
            break label126;
          }
          TbsLog.e("TbsInstaller", "TbsInstaller--getTbsCoreHostContext " + arrayOfString[i] + " illegal signature go on next");
        }
      }
    }
    label126:
    int j;
    do
    {
      i += 1;
      break label35;
      break;
      j = gC(localContext);
      TbsLog.i("TbsInstaller", "TbsInstaller-getTbsCoreHostContext hostTbsCoreVer=" + j);
    } while ((j == 0) || (j != paramInt));
    TbsLog.i("TbsInstaller", "TbsInstaller-getTbsCoreHostContext targetApp=" + arrayOfString[i]);
    return localContext;
  }
  
  private boolean b(Context paramContext, File paramFile)
  {
    try
    {
      Object localObject1 = new File(paramFile, "tbs_sdk_extension_dex.jar");
      Object localObject2 = new File(paramFile, "tbs_sdk_extension_dex.dex");
      Object localObject3 = paramContext.getClassLoader();
      new DexClassLoader(((File)localObject1).getAbsolutePath(), paramFile.getAbsolutePath(), null, (ClassLoader)localObject3);
      localObject1 = c.Yb(((File)localObject2).getAbsolutePath());
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        r.gR(paramContext).aS(226, "can not find oat command");
        return false;
      }
      paramFile = paramFile.listFiles(new FileFilter()
      {
        public final boolean accept(File paramAnonymousFile)
        {
          return paramAnonymousFile.getName().endsWith(".jar");
        }
      });
      int j = paramFile.length;
      int i = 0;
      while (i < j)
      {
        localObject2 = paramFile[i];
        localObject2 = ((File)localObject2).getName().substring(0, ((File)localObject2).getName().length() - 4);
        localObject3 = ((String)localObject1).replaceAll("tbs_sdk_extension_dex", (String)localObject2);
        localObject3 = new StringBuilder("/system/bin/dex2oat ").append((String)localObject3).append(" --dex-location=");
        cov();
        localObject2 = gK(paramContext) + File.separator + (String)localObject2 + ".jar";
        Runtime.getRuntime().exec((String)localObject2).waitFor();
        i += 1;
      }
      return true;
    }
    catch (Exception paramFile)
    {
      r.gR(paramContext).c(226, paramFile);
    }
    return false;
  }
  
  private static boolean bA(Context paramContext, String paramString)
  {
    paramContext = new File(paramContext.getDir("tbs", 0), paramString);
    if (!paramContext.exists()) {}
    while (!new File(paramContext, "tbs.conf").exists()) {
      return false;
    }
    return true;
  }
  
  private static boolean bB(Context paramContext, String paramString)
  {
    boolean bool = false;
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      if (paramContext != null) {
        bool = true;
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = null;
      }
    }
  }
  
  private static Context bC(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.createPackageContext(paramString, 2);
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  /* Error */
  static p cov()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 47	com/tencent/smtt/sdk/p:xVD	Lcom/tencent/smtt/sdk/p;
    //   6: ifnonnull +25 -> 31
    //   9: ldc 2
    //   11: monitorenter
    //   12: getstatic 47	com/tencent/smtt/sdk/p:xVD	Lcom/tencent/smtt/sdk/p;
    //   15: ifnonnull +13 -> 28
    //   18: new 2	com/tencent/smtt/sdk/p
    //   21: dup
    //   22: invokespecial 507	com/tencent/smtt/sdk/p:<init>	()V
    //   25: putstatic 47	com/tencent/smtt/sdk/p:xVD	Lcom/tencent/smtt/sdk/p;
    //   28: ldc 2
    //   30: monitorexit
    //   31: getstatic 47	com/tencent/smtt/sdk/p:xVD	Lcom/tencent/smtt/sdk/p;
    //   34: astore_0
    //   35: ldc 2
    //   37: monitorexit
    //   38: aload_0
    //   39: areturn
    //   40: astore_0
    //   41: ldc 2
    //   43: monitorexit
    //   44: aload_0
    //   45: athrow
    //   46: astore_0
    //   47: ldc 2
    //   49: monitorexit
    //   50: aload_0
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   34	5	0	localp	p
    //   40	5	0	localObject1	Object
    //   46	5	0	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   12	28	40	finally
    //   28	31	40	finally
    //   41	44	40	finally
    //   3	12	46	finally
    //   31	35	46	finally
    //   44	46	46	finally
  }
  
  private boolean cow()
  {
    return false;
  }
  
  /* Error */
  static int gA(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokestatic 326	com/tencent/smtt/sdk/p:gN	(Landroid/content/Context;)Ljava/io/File;
    //   6: astore_0
    //   7: ldc -84
    //   9: new 227	java/lang/StringBuilder
    //   12: dup
    //   13: ldc_w 511
    //   16: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: invokevirtual 468	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   23: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: new 126	java/io/File
    //   32: dup
    //   33: aload_0
    //   34: ldc -125
    //   36: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   39: astore_0
    //   40: aload_0
    //   41: invokevirtual 138	java/io/File:exists	()Z
    //   44: ifne +5 -> 49
    //   47: iconst_0
    //   48: ireturn
    //   49: new 140	java/util/Properties
    //   52: dup
    //   53: invokespecial 141	java/util/Properties:<init>	()V
    //   56: astore_3
    //   57: new 143	java/io/BufferedInputStream
    //   60: dup
    //   61: new 145	java/io/FileInputStream
    //   64: dup
    //   65: aload_0
    //   66: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   69: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   72: astore_0
    //   73: aload_3
    //   74: aload_0
    //   75: invokevirtual 154	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   78: aload_0
    //   79: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   82: aload_3
    //   83: ldc -97
    //   85: invokevirtual 163	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   88: astore_2
    //   89: aload_2
    //   90: ifnonnull +12 -> 102
    //   93: aload_0
    //   94: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   97: iconst_0
    //   98: ireturn
    //   99: astore_0
    //   100: iconst_0
    //   101: ireturn
    //   102: aload_2
    //   103: invokestatic 168	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   106: istore_1
    //   107: aload_0
    //   108: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   111: iload_1
    //   112: ireturn
    //   113: astore_0
    //   114: iload_1
    //   115: ireturn
    //   116: astore_0
    //   117: aload_2
    //   118: ifnull +7 -> 125
    //   121: aload_2
    //   122: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   125: aload_0
    //   126: athrow
    //   127: astore_0
    //   128: aconst_null
    //   129: astore_0
    //   130: aload_0
    //   131: ifnull +28 -> 159
    //   134: aload_0
    //   135: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   138: iconst_0
    //   139: ireturn
    //   140: astore_0
    //   141: iconst_0
    //   142: ireturn
    //   143: astore_2
    //   144: goto -19 -> 125
    //   147: astore_3
    //   148: aload_0
    //   149: astore_2
    //   150: aload_3
    //   151: astore_0
    //   152: goto -35 -> 117
    //   155: astore_2
    //   156: goto -26 -> 130
    //   159: iconst_0
    //   160: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	paramContext	Context
    //   106	9	1	i	int
    //   1	121	2	str	String
    //   143	1	2	localIOException	java.io.IOException
    //   149	1	2	localContext	Context
    //   155	1	2	localException	Exception
    //   56	27	3	localProperties	java.util.Properties
    //   147	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   93	97	99	java/io/IOException
    //   107	111	113	java/io/IOException
    //   2	47	116	finally
    //   49	73	116	finally
    //   2	47	127	java/lang/Exception
    //   49	73	127	java/lang/Exception
    //   134	138	140	java/io/IOException
    //   121	125	143	java/io/IOException
    //   73	89	147	finally
    //   102	107	147	finally
    //   73	89	155	java/lang/Exception
    //   102	107	155	java/lang/Exception
  }
  
  /* Error */
  static int gB(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 126	java/io/File
    //   5: dup
    //   6: aload_0
    //   7: invokestatic 371	com/tencent/smtt/sdk/p:gJ	(Landroid/content/Context;)Ljava/io/File;
    //   10: ldc -125
    //   12: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   15: astore_0
    //   16: aload_0
    //   17: invokevirtual 138	java/io/File:exists	()Z
    //   20: ifne +5 -> 25
    //   23: iconst_0
    //   24: ireturn
    //   25: new 140	java/util/Properties
    //   28: dup
    //   29: invokespecial 141	java/util/Properties:<init>	()V
    //   32: astore_3
    //   33: new 143	java/io/BufferedInputStream
    //   36: dup
    //   37: new 145	java/io/FileInputStream
    //   40: dup
    //   41: aload_0
    //   42: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   45: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   48: astore_0
    //   49: aload_3
    //   50: aload_0
    //   51: invokevirtual 154	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   54: aload_0
    //   55: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   58: aload_3
    //   59: ldc -97
    //   61: invokevirtual 163	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   64: astore_2
    //   65: aload_2
    //   66: ifnonnull +12 -> 78
    //   69: aload_0
    //   70: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   73: iconst_0
    //   74: ireturn
    //   75: astore_0
    //   76: iconst_0
    //   77: ireturn
    //   78: aload_2
    //   79: invokestatic 168	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   82: istore_1
    //   83: aload_0
    //   84: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   87: iload_1
    //   88: ireturn
    //   89: astore_0
    //   90: iload_1
    //   91: ireturn
    //   92: astore_0
    //   93: aload_2
    //   94: ifnull +7 -> 101
    //   97: aload_2
    //   98: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   101: aload_0
    //   102: athrow
    //   103: astore_0
    //   104: aconst_null
    //   105: astore_0
    //   106: aload_0
    //   107: ifnull +28 -> 135
    //   110: aload_0
    //   111: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   114: iconst_0
    //   115: ireturn
    //   116: astore_0
    //   117: iconst_0
    //   118: ireturn
    //   119: astore_2
    //   120: goto -19 -> 101
    //   123: astore_3
    //   124: aload_0
    //   125: astore_2
    //   126: aload_3
    //   127: astore_0
    //   128: goto -35 -> 93
    //   131: astore_2
    //   132: goto -26 -> 106
    //   135: iconst_0
    //   136: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	paramContext	Context
    //   82	9	1	i	int
    //   1	97	2	str	String
    //   119	1	2	localIOException	java.io.IOException
    //   125	1	2	localContext	Context
    //   131	1	2	localException	Exception
    //   32	27	3	localProperties	java.util.Properties
    //   123	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   69	73	75	java/io/IOException
    //   83	87	89	java/io/IOException
    //   2	23	92	finally
    //   25	49	92	finally
    //   2	23	103	java/lang/Exception
    //   25	49	103	java/lang/Exception
    //   110	114	116	java/io/IOException
    //   97	101	119	java/io/IOException
    //   49	65	123	finally
    //   78	83	123	finally
    //   49	65	131	java/lang/Exception
    //   78	83	131	java/lang/Exception
  }
  
  private void gF(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--deleteOldCore");
    f.c(gK(paramContext), false);
  }
  
  private static void gH(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--clearNewTbsCore");
    File localFile = gN(paramContext);
    if (localFile != null) {
      f.c(localFile, false);
    }
    j.gk(paramContext).eX(0, 5);
    j.gk(paramContext).dq("incrupdate_status", -1);
    QbSdk.by(paramContext, "TbsInstaller::clearNewTbsCore forceSysWebViewInner!");
  }
  
  static void gI(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--cleanStatusAndTmpDir");
    j.gk(paramContext).dq("dexopt_retry_num", 0);
    j.gk(paramContext).dq("unzip_retry_num", 0);
    j.gk(paramContext).dq("unlzma_status", 0);
    j.gk(paramContext).dq("incrupdate_retry_num", 0);
    if (k.gl(paramContext).xVi.getInt("tbs_downloaddecouplecore", 0) != 1)
    {
      j.gk(paramContext).eX(0, -1);
      j.gk(paramContext).fy("install_apk_path", "");
      j.gk(paramContext).dq("copy_retry_num", 0);
      j.gk(paramContext).dq("incrupdate_status", -1);
      j.gk(paramContext).eW(0, -1);
      f.c(gN(paramContext), true);
      f.c(gP(paramContext), true);
    }
  }
  
  static File gJ(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_share_decouple");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  static File gK(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_share");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  static File gL(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "share");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  static File gM(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_private");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  static File gN(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_unzip_tmp");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  private static File gO(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_unzip_tmp_decouple");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  static File gP(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_copy_tmp");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  public static void gs(Context paramContext)
  {
    if (!gu(paramContext))
    {
      if (!bA(paramContext, "core_unzip_tmp")) {
        break label46;
      }
      i.cnZ().a(paramContext, 417, new Throwable("TMP_TBS_UNZIP_FOLDER_NAME"));
      TbsLog.e("TbsInstaller", "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_UNZIP_FOLDER_NAME");
    }
    label46:
    do
    {
      return;
      if (bA(paramContext, "core_share_backup_tmp"))
      {
        i.cnZ().a(paramContext, 417, new Throwable("TMP_BACKUP_TBSCORE_FOLDER_NAME"));
        TbsLog.e("TbsInstaller", "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_BACKUP_TBSCORE_FOLDER_NAME");
        return;
      }
    } while (!bA(paramContext, "core_copy_tmp"));
    i.cnZ().a(paramContext, 417, new Throwable("TMP_TBS_COPY_FOLDER_NAME"));
    TbsLog.e("TbsInstaller", "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_COPY_FOLDER_NAME");
  }
  
  private static boolean gu(Context paramContext)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return true;
      try
      {
        boolean bool = new File(paramContext.getDir("tbs", 0), "tmp_folder_core_to_read.conf").exists();
        if (!bool) {
          return false;
        }
      }
      catch (Exception paramContext) {}
    }
    return true;
  }
  
  public static boolean gv(Context paramContext)
  {
    for (;;)
    {
      int i;
      try
      {
        Object localObject = new File(f.an(paramContext, 4), "x5.tbs.decouple");
        cov();
        File localFile1 = gO(paramContext);
        f.N(localFile1);
        f.c(localFile1, true);
        f.h((File)localObject, localFile1);
        localObject = localFile1.list();
        i = 0;
        if (i < localObject.length)
        {
          File localFile2 = new File(localFile1, localObject[i]);
          if (localFile2.getName().endsWith(".dex")) {
            localFile2.delete();
          }
        }
        else
        {
          cov();
          w(paramContext, true);
          localObject = gJ(paramContext);
          f.c((File)localObject, true);
          localFile1.renameTo((File)localObject);
          t.gT(paramContext);
          return true;
        }
      }
      catch (Exception paramContext)
      {
        return false;
      }
      i += 1;
    }
  }
  
  private boolean gw(Context paramContext)
  {
    int m = 0;
    TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt start - dirMode: 0");
    for (;;)
    {
      try
      {
        if (k.gl(paramContext).xVi.getInt("tbs_downloaddecouplecore", 0) == 1) {
          return true;
        }
        File localFile = gN(paramContext);
        try
        {
          String str = System.getProperty("java.vm.version");
          if (str == null) {
            break label209;
          }
          bool = str.startsWith("2");
          if (!bool) {
            break label209;
          }
          i = 1;
        }
        catch (Throwable localThrowable)
        {
          boolean bool;
          int k;
          r.gR(paramContext).c(226, localThrowable);
          i = 0;
          continue;
          int j = 0;
          continue;
        }
        if (Build.VERSION.SDK_INT == 23)
        {
          j = 1;
          bool = k.gl(paramContext).xVi.getBoolean("tbs_stop_preoat", false);
          k = m;
          if (i != 0)
          {
            k = m;
            if (j != 0)
            {
              k = m;
              if (!bool) {
                k = 1;
              }
            }
          }
          if ((k != 0) && (b(paramContext, localFile))) {
            break label207;
          }
          return a(paramContext, localFile);
        }
        return true;
      }
      catch (Exception localException)
      {
        r.gR(paramContext).aS(209, localException.toString());
        TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
      }
      label207:
      label209:
      int i = 0;
    }
  }
  
  static boolean gx(Context paramContext)
  {
    if (t.coF() != null) {}
    for (;;)
    {
      return true;
      try
      {
        Signature localSignature = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures[0];
        if (paramContext.getPackageName().equals("com.tencent.mtt"))
        {
          if (!localSignature.toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a")) {
            return false;
          }
        }
        else if (paramContext.getPackageName().equals("com.tencent.mm"))
        {
          if (!localSignature.toCharsString().equals("308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499")) {
            return false;
          }
        }
        else if (paramContext.getPackageName().equals("com.tencent.mobileqq"))
        {
          if (!localSignature.toCharsString().equals("30820253308201bca00302010202044bbb0361300d06092a864886f70d0101050500306d310e300c060355040613054368696e61310f300d06035504080c06e58c97e4baac310f300d06035504070c06e58c97e4baac310f300d060355040a0c06e885bee8aeaf311b3019060355040b0c12e697a0e7babfe4b89ae58aa1e7b3bbe7bb9f310b30090603550403130251513020170d3130303430363039343831375a180f32323834303132303039343831375a306d310e300c060355040613054368696e61310f300d06035504080c06e58c97e4baac310f300d06035504070c06e58c97e4baac310f300d060355040a0c06e885bee8aeaf311b3019060355040b0c12e697a0e7babfe4b89ae58aa1e7b3bbe7bb9f310b300906035504031302515130819f300d06092a864886f70d010101050003818d0030818902818100a15e9756216f694c5915e0b529095254367c4e64faeff07ae13488d946615a58ddc31a415f717d019edc6d30b9603d3e2a7b3de0ab7e0cf52dfee39373bc472fa997027d798d59f81d525a69ecf156e885fd1e2790924386b2230cc90e3b7adc95603ddcf4c40bdc72f22db0f216a99c371d3bf89cba6578c60699e8a0d536950203010001300d06092a864886f70d01010505000381810094a9b80e80691645dd42d6611775a855f71bcd4d77cb60a8e29404035a5e00b21bcc5d4a562482126bd91b6b0e50709377ceb9ef8c2efd12cc8b16afd9a159f350bb270b14204ff065d843832720702e28b41491fbc3a205f5f2f42526d67f17614d8a974de6487b2c866efede3b4e49a0f916baa3c1336fd2ee1b1629652049")) {
            return false;
          }
        }
        else if (paramContext.getPackageName().equals("com.tencent.tbs"))
        {
          if (!localSignature.toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a")) {
            return false;
          }
        }
        else if (paramContext.getPackageName().equals("com.qzone"))
        {
          if (!localSignature.toCharsString().equals("308202ad30820216a00302010202044c26cea2300d06092a864886f70d010105050030819a310b3009060355040613023836311530130603550408130c4265696a696e672043697479311530130603550407130c4265696a696e67204369747931263024060355040a131d515a6f6e65205465616d206f662054656e63656e7420436f6d70616e7931183016060355040b130f54656e63656e7420436f6d70616e79311b301906035504031312416e64726f696420515a6f6e65205465616d301e170d3130303632373034303830325a170d3335303632313034303830325a30819a310b3009060355040613023836311530130603550408130c4265696a696e672043697479311530130603550407130c4265696a696e67204369747931263024060355040a131d515a6f6e65205465616d206f662054656e63656e7420436f6d70616e7931183016060355040b130f54656e63656e7420436f6d70616e79311b301906035504031312416e64726f696420515a6f6e65205465616d30819f300d06092a864886f70d010101050003818d003081890281810082d6aca037a9843fbbe88b6dd19f36e9c24ce174c1b398f3a529e2a7fe02de99c27539602c026edf96ad8d43df32a85458bca1e6fbf11958658a7d6751a1d9b782bf43a8c19bd1c06bdbfd94c0516326ae3cf638ac42bb470580e340c46e6f306a772c1ef98f10a559edf867f3f31fe492808776b7bd953b2cba2d2b2d66a44f0203010001300d06092a864886f70d0101050500038181006003b04a8a8c5be9650f350cda6896e57dd13e6e83e7f891fc70f6a3c2eaf75cfa4fc998365deabbd1b9092159edf4b90df5702a0d101f8840b5d4586eb92a1c3cd19d95fbc1c2ac956309eda8eef3944baf08c4a49d3b9b3ffb06bc13dab94ecb5b8eb74e8789aa0ba21cb567f538bbc59c2a11e6919924a24272eb79251677")) {
            return false;
          }
        }
        else if (paramContext.getPackageName().equals("com.tencent.qqpimsecure"))
        {
          boolean bool = localSignature.toCharsString().equals("30820239308201a2a00302010202044c96f48f300d06092a864886f70d01010505003060310b300906035504061302434e310b300906035504081302474431123010060355040713094775616e677a686f753110300e060355040a130754656e63656e74310b3009060355040b130233473111300f0603550403130857696c736f6e57753020170d3130303932303035343334335a180f32303635303632333035343334335a3060310b300906035504061302434e310b300906035504081302474431123010060355040713094775616e677a686f753110300e060355040a130754656e63656e74310b3009060355040b130233473111300f0603550403130857696c736f6e577530819f300d06092a864886f70d010101050003818d0030818902818100b56e79dbb1185a79e52d792bb3d0bb3da8010d9b87da92ec69f7dc5ad66ab6bfdff2a6a1ed285dd2358f28b72a468be7c10a2ce30c4c27323ed4edcc936080e5bedc2cbbca0b7e879c08a631182793f44bb3ea284179b263410c298e5f6831032c9702ba4a74e2ccfc9ef857f12201451602fc8e774ac59d6398511586c83d1d0203010001300d06092a864886f70d0101050500038181002475615bb65b8d8786b890535802948840387d06b1692ff3ea47ef4c435719ba1865b81e6bfa6293ce31747c3cd6b34595b485cc1563fd90107ba5845c28b95c79138f0dec288940395bc10f92f2b69d8dc410999deb38900974ce9984b678030edfba8816582f56160d87e38641288d8588d2a31e20b89f223d788dd35cc9c8");
          if (!bool) {
            return false;
          }
        }
      }
      catch (Exception paramContext)
      {
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore getPackageInfo fail");
      }
    }
    return false;
  }
  
  private void gy(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip");
    ab.coW();
    if ((ab.coV() == null) && (ab.coW().hg(paramContext) == null))
    {
      TbsLog.e("TbsInstaller", "generateNewTbsCoreFromUnzip -- failed to get rename fileLock#2!");
      return;
    }
    for (;;)
    {
      File localFile2;
      int i;
      try
      {
        gF(paramContext);
        TbsLog.i("TbsInstaller", "TbsInstaller--renameShareDir");
        File localFile1 = gN(paramContext);
        localFile2 = gK(paramContext);
        if ((localFile1 == null) || (localFile2 == null))
        {
          if (!t.gU(paramContext)) {
            t.gS(paramContext);
          }
          j.gk(paramContext).dq("dexopt_retry_num", 0);
          j.gk(paramContext).dq("unzip_retry_num", 0);
          j.gk(paramContext).dq("unlzma_status", 0);
          j.gk(paramContext).dq("incrupdate_retry_num", 0);
          j.gk(paramContext).eX(0, 3);
          j.gk(paramContext).fy("install_apk_path", "");
          j.gk(paramContext).dq("incrupdate_status", -1);
          if (!t.gU(paramContext))
          {
            i = k.gl(paramContext).xVi.getInt("tbs_decouplecoreversion", 0);
            if (i <= 0) {
              break label299;
            }
            cov();
            if ((i == gB(paramContext)) || (i != cov().gC(paramContext))) {
              break label299;
            }
            gG(paramContext);
          }
          if (t.gU(paramContext)) {
            t.c(paramContext, gE(paramContext), true);
          }
          xVL.set(Integer.valueOf(0));
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        r.gR(paramContext).aS(219, "exception when renameing from unzip:" + localThrowable.toString());
        TbsLog.e("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip Exception", true);
        return;
      }
      localThrowable.renameTo(localFile2);
      w(paramContext, false);
      continue;
      label299:
      StringBuilder localStringBuilder = new StringBuilder("TbsInstaller--generateNewTbsCoreFromUnzip #1 deCoupleCoreVersion is ").append(i).append(" getTbsCoreShareDecoupleCoreVersion is ");
      cov();
      TbsLog.i("TbsInstaller", gB(paramContext) + " getTbsCoreInstalledVerInNolock is " + cov().gC(paramContext));
    }
  }
  
  private void gz(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromCopy");
    ab.coW();
    if ((ab.coV() == null) && (ab.coW().hg(paramContext) == null))
    {
      TbsLog.e("TbsInstaller", "generateNewTbsCoreFromCopy -- failed to get rename fileLock#2!");
      return;
    }
    for (;;)
    {
      File localFile2;
      int i;
      try
      {
        gF(paramContext);
        TbsLog.i("TbsInstaller", "TbsInstaller--renameTbsCoreCopyDir");
        File localFile1 = gP(paramContext);
        localFile2 = gK(paramContext);
        if ((localFile1 == null) || (localFile2 == null))
        {
          t.gS(paramContext);
          j.gk(paramContext).eW(0, 3);
          if (!t.gU(paramContext))
          {
            i = k.gl(paramContext).xVi.getInt("tbs_decouplecoreversion", 0);
            if (i <= 0) {
              break label198;
            }
            cov();
            if ((i == gB(paramContext)) || (i != cov().gC(paramContext))) {
              break label198;
            }
            gG(paramContext);
          }
          xVL.set(Integer.valueOf(0));
          return;
        }
      }
      catch (Exception localException)
      {
        r.gR(paramContext).aS(219, "exception when renameing from copy:" + localException.toString());
        return;
      }
      localException.renameTo(localFile2);
      w(paramContext, false);
      continue;
      label198:
      StringBuilder localStringBuilder = new StringBuilder("TbsInstaller--generateNewTbsCoreFromCopy #1 deCoupleCoreVersion is ").append(i).append(" getTbsCoreShareDecoupleCoreVersion is ");
      cov();
      TbsLog.i("TbsInstaller", gB(paramContext) + " getTbsCoreInstalledVerInNolock is " + cov().gC(paramContext));
    }
  }
  
  static void q(Context paramContext, String paramString, int paramInt)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore tbsApkPath=" + paramString);
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore tbsCoreTargetVer=" + paramInt);
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore currentProcessId=" + android.os.Process.myPid());
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore currentThreadName=" + Thread.currentThread().getName());
    Message localMessage = new Message();
    localMessage.what = 1;
    localMessage.obj = new Object[] { paramContext, paramString, Integer.valueOf(paramInt) };
    xVM.sendMessage(localMessage);
  }
  
  /* Error */
  private boolean s(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: iconst_0
    //   4: istore 8
    //   6: iconst_0
    //   7: istore 9
    //   9: iconst_1
    //   10: istore 7
    //   12: aload_0
    //   13: monitorenter
    //   14: ldc -84
    //   16: ldc_w 816
    //   19: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: iload 8
    //   24: istore 6
    //   26: aload_0
    //   27: aload_1
    //   28: invokevirtual 819	com/tencent/smtt/sdk/p:gQ	(Landroid/content/Context;)Z
    //   31: istore 10
    //   33: iload 10
    //   35: ifne +12 -> 47
    //   38: iload 9
    //   40: istore 5
    //   42: aload_0
    //   43: monitorexit
    //   44: iload 5
    //   46: ireturn
    //   47: iload 8
    //   49: istore 6
    //   51: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   54: invokeinterface 824 1 0
    //   59: istore 9
    //   61: iload 8
    //   63: istore 6
    //   65: ldc -84
    //   67: new 227	java/lang/StringBuilder
    //   70: dup
    //   71: ldc_w 826
    //   74: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   77: iload 9
    //   79: invokevirtual 362	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   82: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   88: iload 9
    //   90: ifeq +105 -> 195
    //   93: aload_1
    //   94: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   97: ldc_w 828
    //   100: invokevirtual 831	com/tencent/smtt/sdk/j:Ye	(Ljava/lang/String;)I
    //   103: istore_3
    //   104: aload_0
    //   105: iconst_0
    //   106: aload_1
    //   107: invokevirtual 834	com/tencent/smtt/sdk/p:a	(ZLandroid/content/Context;)I
    //   110: istore 4
    //   112: ldc -84
    //   114: new 227	java/lang/StringBuilder
    //   117: dup
    //   118: ldc_w 836
    //   121: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   124: iload_3
    //   125: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   128: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: ldc -84
    //   136: new 227	java/lang/StringBuilder
    //   139: dup
    //   140: ldc_w 838
    //   143: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   146: iload 4
    //   148: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   151: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   157: iload_3
    //   158: iconst_1
    //   159: if_icmpne +157 -> 316
    //   162: iload 4
    //   164: ifne +99 -> 263
    //   167: ldc -84
    //   169: ldc_w 840
    //   172: iconst_1
    //   173: invokestatic 842	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   176: aload_0
    //   177: aload_1
    //   178: invokespecial 844	com/tencent/smtt/sdk/p:gz	(Landroid/content/Context;)V
    //   181: iload 7
    //   183: istore_2
    //   184: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   187: invokeinterface 847 1 0
    //   192: iload_2
    //   193: istore 5
    //   195: iload 5
    //   197: istore 6
    //   199: aload_0
    //   200: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   203: goto -161 -> 42
    //   206: astore 11
    //   208: iload 6
    //   210: istore 5
    //   212: aload_1
    //   213: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   216: sipush 215
    //   219: aload 11
    //   221: invokevirtual 743	java/lang/Throwable:toString	()Ljava/lang/String;
    //   224: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   227: aload_1
    //   228: new 227	java/lang/StringBuilder
    //   231: dup
    //   232: ldc_w 852
    //   235: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   238: aload 11
    //   240: invokestatic 320	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   243: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: invokestatic 542	com/tencent/smtt/sdk/QbSdk:by	(Landroid/content/Context;Ljava/lang/String;)V
    //   252: goto -210 -> 42
    //   255: astore_1
    //   256: aload_1
    //   257: athrow
    //   258: astore_1
    //   259: aload_0
    //   260: monitorexit
    //   261: aload_1
    //   262: athrow
    //   263: iload_2
    //   264: ifeq +52 -> 316
    //   267: ldc -84
    //   269: ldc_w 854
    //   272: iconst_1
    //   273: invokestatic 842	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   276: aload_0
    //   277: aload_1
    //   278: invokespecial 844	com/tencent/smtt/sdk/p:gz	(Landroid/content/Context;)V
    //   281: iload 7
    //   283: istore_2
    //   284: goto -100 -> 184
    //   287: astore 11
    //   289: iload 8
    //   291: istore 6
    //   293: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   296: invokeinterface 847 1 0
    //   301: iload 8
    //   303: istore 6
    //   305: aload 11
    //   307: athrow
    //   308: astore 11
    //   310: iload_2
    //   311: istore 5
    //   313: goto -101 -> 212
    //   316: iconst_0
    //   317: istore_2
    //   318: goto -134 -> 184
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	321	0	this	p
    //   0	321	1	paramContext	Context
    //   0	321	2	paramBoolean	boolean
    //   103	57	3	i	int
    //   110	53	4	j	int
    //   1	311	5	bool1	boolean
    //   24	280	6	bool2	boolean
    //   10	272	7	bool3	boolean
    //   4	298	8	bool4	boolean
    //   7	82	9	bool5	boolean
    //   31	3	10	bool6	boolean
    //   206	33	11	localThrowable1	Throwable
    //   287	19	11	localObject	Object
    //   308	1	11	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   26	33	206	java/lang/Throwable
    //   51	61	206	java/lang/Throwable
    //   65	88	206	java/lang/Throwable
    //   199	203	206	java/lang/Throwable
    //   293	301	206	java/lang/Throwable
    //   305	308	206	java/lang/Throwable
    //   26	33	255	finally
    //   51	61	255	finally
    //   65	88	255	finally
    //   184	192	255	finally
    //   199	203	255	finally
    //   212	252	255	finally
    //   293	301	255	finally
    //   305	308	255	finally
    //   14	22	258	finally
    //   256	258	258	finally
    //   93	157	287	finally
    //   167	181	287	finally
    //   267	281	287	finally
    //   184	192	308	java/lang/Throwable
  }
  
  private boolean t(Context paramContext, boolean paramBoolean)
  {
    boolean bool3 = true;
    boolean bool1 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    label61:
    try
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip canRenameTmpDir =" + paramBoolean);
      bool2 = bool4;
      try
      {
        boolean bool6 = gQ(paramContext);
        if (bool6) {
          break label61;
        }
        bool1 = bool5;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          try
          {
            i = j.gk(paramContext).Ye("install_status");
            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip installStatus=" + i);
            j = a(false, paramContext);
            if (i != 2) {
              break label286;
            }
            if (j == 0)
            {
              TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip tbsCoreInstalledVer = 0", false);
              gy(paramContext);
              paramBoolean = bool3;
            }
          }
          finally
          {
            bool2 = bool4;
            xVI.unlock();
            bool2 = bool4;
          }
          try
          {
            xVI.unlock();
            bool1 = paramBoolean;
            bool2 = bool1;
            cox();
          }
          catch (Exception localException2)
          {
            bool1 = paramBoolean;
            continue;
          }
          localException1 = localException1;
          bool1 = bool2;
          QbSdk.by(paramContext, "TbsInstaller::enableTbsCoreFromUnzip Exception: " + localException1);
        }
      }
      return bool1;
    }
    finally {}
    boolean bool2 = bool4;
    bool5 = xVI.tryLock();
    bool2 = bool4;
    TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip locked=" + bool5);
    if (bool5) {}
    for (;;)
    {
      int i;
      int j;
      if (paramBoolean)
      {
        TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip tbsCoreInstalledVer != 0", false);
        gy(paramContext);
        paramBoolean = bool3;
      }
      else
      {
        label286:
        paramBoolean = false;
      }
    }
  }
  
  static void w(Context paramContext, boolean paramBoolean)
  {
    if (paramContext == null) {
      r.gR(paramContext).aS(225, "setTmpFolderCoreToRead context is null");
    }
    for (;;)
    {
      return;
      try
      {
        File localFile = new File(paramContext.getDir("tbs", 0), "tmp_folder_core_to_read.conf");
        if (paramBoolean)
        {
          if (localFile.exists()) {
            continue;
          }
          localFile.createNewFile();
        }
      }
      catch (Exception localException)
      {
        r.gR(paramContext).aS(225, "setTmpFolderCoreToRead Exception message is " + localException.getMessage() + " Exception cause is " + localException.getCause());
        return;
      }
    }
    f.O(localException);
  }
  
  public final int a(boolean paramBoolean, Context paramContext)
  {
    if ((paramBoolean) || (((Integer)xVL.get()).intValue() <= 0)) {
      xVL.set(Integer.valueOf(gC(paramContext)));
    }
    return ((Integer)xVL.get()).intValue();
  }
  
  final boolean al(Context paramContext, int paramInt)
  {
    if (l.gp(paramContext)) {
      return false;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore targetTbsCoreVer=" + paramInt);
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
    TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentProcessId=" + android.os.Process.myPid());
    TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentThreadName=" + Thread.currentThread().getName());
    Context localContext = am(paramContext, paramInt);
    if (localContext != null)
    {
      Message localMessage = new Message();
      localMessage.what = 2;
      localMessage.obj = new Object[] { localContext, paramContext, Integer.valueOf(paramInt) };
      xVM.sendMessage(localMessage);
      return true;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller--installLocalTbsCore copy from null");
    return false;
  }
  
  /* Error */
  public final String bD(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 437	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 126	java/io/File
    //   12: dup
    //   13: aload_1
    //   14: invokestatic 465	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   17: ldc -125
    //   19: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: astore_1
    //   23: aload_1
    //   24: invokevirtual 138	java/io/File:exists	()Z
    //   27: ifeq -20 -> 7
    //   30: new 140	java/util/Properties
    //   33: dup
    //   34: invokespecial 141	java/util/Properties:<init>	()V
    //   37: astore_3
    //   38: new 143	java/io/BufferedInputStream
    //   41: dup
    //   42: new 145	java/io/FileInputStream
    //   45: dup
    //   46: aload_1
    //   47: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   50: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   53: astore_1
    //   54: aload_3
    //   55: aload_1
    //   56: invokevirtual 154	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   59: aload_1
    //   60: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   63: aload_3
    //   64: aload_2
    //   65: invokevirtual 163	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   68: astore_2
    //   69: aload_1
    //   70: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   73: aload_2
    //   74: areturn
    //   75: astore_1
    //   76: aload_2
    //   77: areturn
    //   78: astore_2
    //   79: aconst_null
    //   80: astore_1
    //   81: aload_1
    //   82: ifnull +7 -> 89
    //   85: aload_1
    //   86: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   89: aload_2
    //   90: athrow
    //   91: astore_1
    //   92: aconst_null
    //   93: astore_1
    //   94: aload_1
    //   95: ifnull -88 -> 7
    //   98: aload_1
    //   99: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   102: aconst_null
    //   103: areturn
    //   104: astore_1
    //   105: aconst_null
    //   106: areturn
    //   107: astore_1
    //   108: goto -19 -> 89
    //   111: astore_2
    //   112: goto -31 -> 81
    //   115: astore_2
    //   116: goto -22 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	p
    //   0	119	1	paramContext	Context
    //   0	119	2	paramString	String
    //   37	27	3	localProperties	java.util.Properties
    // Exception table:
    //   from	to	target	type
    //   69	73	75	java/io/IOException
    //   9	54	78	finally
    //   9	54	91	java/lang/Exception
    //   98	102	104	java/io/IOException
    //   85	89	107	java/io/IOException
    //   54	69	111	finally
    //   54	69	115	java/lang/Exception
  }
  
  /* Error */
  final void cox()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 101	com/tencent/smtt/sdk/p:xVE	I
    //   6: istore_1
    //   7: aload_0
    //   8: iload_1
    //   9: iconst_1
    //   10: isub
    //   11: putfield 101	com/tencent/smtt/sdk/p:xVE	I
    //   14: iload_1
    //   15: iconst_1
    //   16: if_icmpgt +10 -> 26
    //   19: aload_0
    //   20: getfield 103	com/tencent/smtt/sdk/p:xVH	Z
    //   23: ifne +14 -> 37
    //   26: ldc -84
    //   28: ldc_w 915
    //   31: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: ldc -84
    //   39: ldc_w 917
    //   42: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   45: aload_0
    //   46: getfield 919	com/tencent/smtt/sdk/p:xVF	Ljava/nio/channels/FileLock;
    //   49: aload_0
    //   50: getfield 921	com/tencent/smtt/sdk/p:xVG	Ljava/io/FileOutputStream;
    //   53: invokestatic 924	com/tencent/smtt/utils/f:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   56: aload_0
    //   57: iconst_0
    //   58: putfield 103	com/tencent/smtt/sdk/p:xVH	Z
    //   61: goto -27 -> 34
    //   64: astore_2
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_2
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	this	p
    //   6	11	1	i	int
    //   64	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	64	finally
    //   19	26	64	finally
    //   26	34	64	finally
    //   37	61	64	finally
  }
  
  /* Error */
  final void f(Context paramContext, Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 929	com/tencent/smtt/sdk/p:gt	(Landroid/content/Context;)Z
    //   5: ifeq +14 -> 19
    //   8: aload_1
    //   9: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   12: sipush 64997
    //   15: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   18: return
    //   19: ldc -84
    //   21: ldc_w 931
    //   24: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   27: aload_2
    //   28: ifnull -10 -> 18
    //   31: aload_1
    //   32: ifnull -14 -> 18
    //   35: aload_1
    //   36: invokestatic 934	com/tencent/smtt/utils/f:hv	(Landroid/content/Context;)Z
    //   39: ifne +67 -> 106
    //   42: invokestatic 940	com/tencent/smtt/utils/u:cpv	()J
    //   45: lstore 5
    //   47: aload_1
    //   48: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   51: invokevirtual 943	com/tencent/smtt/sdk/k:cof	()J
    //   54: lstore 7
    //   56: aload_1
    //   57: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   60: sipush 210
    //   63: new 227	java/lang/StringBuilder
    //   66: dup
    //   67: ldc_w 945
    //   70: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   73: lload 5
    //   75: invokevirtual 948	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   78: ldc_w 950
    //   81: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: lload 7
    //   86: invokevirtual 948	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   89: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   95: aload_1
    //   96: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   99: sipush 64996
    //   102: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   105: return
    //   106: aload_0
    //   107: aload_1
    //   108: invokevirtual 819	com/tencent/smtt/sdk/p:gQ	(Landroid/content/Context;)Z
    //   111: ifne +14 -> 125
    //   114: aload_1
    //   115: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   118: sipush 64995
    //   121: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   124: return
    //   125: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   128: invokeinterface 824 1 0
    //   133: istore 9
    //   135: ldc -84
    //   137: new 227	java/lang/StringBuilder
    //   140: dup
    //   141: ldc_w 952
    //   144: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   147: iload 9
    //   149: invokevirtual 362	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   152: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: iload 9
    //   160: ifeq +726 -> 886
    //   163: iconst_1
    //   164: invokestatic 956	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   167: aload_0
    //   168: aload_1
    //   169: invokevirtual 417	com/tencent/smtt/sdk/p:gC	(Landroid/content/Context;)I
    //   172: ifle +17 -> 189
    //   175: aload_1
    //   176: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   179: ldc_w 530
    //   182: invokevirtual 831	com/tencent/smtt/sdk/j:Ye	(Ljava/lang/String;)I
    //   185: iconst_1
    //   186: if_icmpne +32 -> 218
    //   189: iconst_0
    //   190: invokestatic 956	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   193: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   196: invokeinterface 847 1 0
    //   201: aload_0
    //   202: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   205: ldc -84
    //   207: ldc_w 958
    //   210: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   213: iconst_0
    //   214: invokestatic 956	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   217: return
    //   218: aload_1
    //   219: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   222: getfield 293	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   225: ldc_w 960
    //   228: iconst_0
    //   229: invokeinterface 301 3 0
    //   234: istore 4
    //   236: iload 4
    //   238: iconst_1
    //   239: if_icmpeq +875 -> 1114
    //   242: iload 4
    //   244: iconst_2
    //   245: if_icmpeq +869 -> 1114
    //   248: iload 4
    //   250: iconst_4
    //   251: if_icmpne +188 -> 439
    //   254: goto +860 -> 1114
    //   257: iload_3
    //   258: ifne +849 -> 1107
    //   261: iload 4
    //   263: ifeq +844 -> 1107
    //   266: aload_1
    //   267: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   270: ldc_w 553
    //   273: invokevirtual 963	com/tencent/smtt/sdk/j:Yf	(Ljava/lang/String;)I
    //   276: istore_3
    //   277: iload_3
    //   278: iconst_5
    //   279: if_icmple +165 -> 444
    //   282: ldc -84
    //   284: ldc_w 965
    //   287: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   290: aload_2
    //   291: ldc_w 967
    //   294: invokevirtual 972	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   297: astore 10
    //   299: aload_2
    //   300: ldc_w 974
    //   303: invokevirtual 972	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   306: astore 11
    //   308: aload_2
    //   309: ldc_w 976
    //   312: invokevirtual 972	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   315: astore_2
    //   316: aload 10
    //   318: invokestatic 437	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   321: ifne +15 -> 336
    //   324: new 126	java/io/File
    //   327: dup
    //   328: aload 10
    //   330: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;)V
    //   333: invokestatic 304	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   336: aload 11
    //   338: invokestatic 437	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   341: ifne +15 -> 356
    //   344: new 126	java/io/File
    //   347: dup
    //   348: aload 11
    //   350: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;)V
    //   353: invokestatic 304	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   356: aload_2
    //   357: invokestatic 437	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   360: ifne +14 -> 374
    //   363: new 126	java/io/File
    //   366: dup
    //   367: aload_2
    //   368: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;)V
    //   371: invokestatic 304	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   374: aload_1
    //   375: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   378: getfield 980	com/tencent/smtt/sdk/k:xVh	Ljava/util/Map;
    //   381: ldc_w 982
    //   384: iconst_1
    //   385: invokestatic 987	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   388: invokeinterface 993 3 0
    //   393: pop
    //   394: aload_1
    //   395: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   398: invokevirtual 996	com/tencent/smtt/sdk/k:commit	()V
    //   401: aload_1
    //   402: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   405: sipush 224
    //   408: ldc_w 998
    //   411: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   414: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   417: invokeinterface 847 1 0
    //   422: aload_0
    //   423: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   426: ldc -84
    //   428: ldc_w 958
    //   431: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   434: iconst_0
    //   435: invokestatic 956	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   438: return
    //   439: iconst_0
    //   440: istore_3
    //   441: goto -184 -> 257
    //   444: aload_1
    //   445: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   448: ldc_w 553
    //   451: iload_3
    //   452: iconst_1
    //   453: iadd
    //   454: invokevirtual 534	com/tencent/smtt/sdk/j:dq	(Ljava/lang/String;I)V
    //   457: aload_1
    //   458: invokestatic 355	com/tencent/smtt/sdk/p:gM	(Landroid/content/Context;)Ljava/io/File;
    //   461: astore 10
    //   463: aload 10
    //   465: ifnull +642 -> 1107
    //   468: new 126	java/io/File
    //   471: dup
    //   472: aload 10
    //   474: ldc_w 357
    //   477: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   480: invokevirtual 138	java/io/File:exists	()Z
    //   483: ifeq +624 -> 1107
    //   486: aload_1
    //   487: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   490: sipush 64986
    //   493: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   496: aload_1
    //   497: aload_2
    //   498: invokestatic 1001	com/tencent/smtt/sdk/QbSdk:e	(Landroid/content/Context;Landroid/os/Bundle;)Landroid/os/Bundle;
    //   501: astore_2
    //   502: aload_2
    //   503: ifnonnull +111 -> 614
    //   506: iconst_1
    //   507: istore_3
    //   508: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   511: invokeinterface 847 1 0
    //   516: aload_0
    //   517: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   520: iload_3
    //   521: ifne +380 -> 901
    //   524: ldc -84
    //   526: ldc_w 1003
    //   529: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   532: aload_1
    //   533: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   536: ldc_w 553
    //   539: iconst_0
    //   540: invokevirtual 534	com/tencent/smtt/sdk/j:dq	(Ljava/lang/String;I)V
    //   543: aload_1
    //   544: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   547: sipush 64992
    //   550: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   553: aload_1
    //   554: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   557: iconst_0
    //   558: iconst_m1
    //   559: invokevirtual 528	com/tencent/smtt/sdk/j:eX	(II)V
    //   562: aload_1
    //   563: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   566: ldc_w 530
    //   569: iconst_1
    //   570: invokevirtual 534	com/tencent/smtt/sdk/j:dq	(Ljava/lang/String;I)V
    //   573: aload_2
    //   574: ldc_w 1005
    //   577: invokevirtual 972	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   580: astore 10
    //   582: new 126	java/io/File
    //   585: dup
    //   586: aload 10
    //   588: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;)V
    //   591: aload_1
    //   592: invokestatic 1010	com/tencent/smtt/sdk/h:a	(Ljava/io/File;Landroid/content/Context;)V
    //   595: aload_0
    //   596: aload_1
    //   597: aload 10
    //   599: aload_2
    //   600: ldc_w 1012
    //   603: invokevirtual 1014	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   606: invokevirtual 1017	com/tencent/smtt/sdk/p:r	(Landroid/content/Context;Ljava/lang/String;I)V
    //   609: iconst_0
    //   610: invokestatic 956	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   613: return
    //   614: aload_2
    //   615: astore 10
    //   617: aload_2
    //   618: ldc_w 1019
    //   621: invokevirtual 1014	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   624: istore_3
    //   625: goto -117 -> 508
    //   628: astore 11
    //   630: aconst_null
    //   631: astore_2
    //   632: aload_2
    //   633: astore 10
    //   635: ldc -84
    //   637: new 227	java/lang/StringBuilder
    //   640: dup
    //   641: ldc_w 1021
    //   644: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   647: aload 11
    //   649: invokestatic 320	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   652: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   655: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   658: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   661: aload_1
    //   662: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   665: sipush 64993
    //   668: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   671: aload_1
    //   672: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   675: sipush 218
    //   678: aload 11
    //   680: invokevirtual 252	java/lang/Exception:toString	()Ljava/lang/String;
    //   683: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   686: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   689: invokeinterface 847 1 0
    //   694: aload_0
    //   695: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   698: aload_1
    //   699: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   702: sipush 64990
    //   705: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   708: ldc -84
    //   710: ldc_w 1023
    //   713: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   716: aload_1
    //   717: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   720: getfield 980	com/tencent/smtt/sdk/k:xVh	Ljava/util/Map;
    //   723: ldc_w 982
    //   726: iconst_1
    //   727: invokestatic 987	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   730: invokeinterface 993 3 0
    //   735: pop
    //   736: aload_1
    //   737: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   740: invokevirtual 996	com/tencent/smtt/sdk/k:commit	()V
    //   743: aload_1
    //   744: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   747: sipush 217
    //   750: new 227	java/lang/StringBuilder
    //   753: dup
    //   754: ldc_w 1025
    //   757: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   760: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   763: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   766: iconst_0
    //   767: invokestatic 956	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   770: return
    //   771: astore_2
    //   772: aconst_null
    //   773: astore 10
    //   775: iconst_2
    //   776: istore_3
    //   777: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   780: invokeinterface 847 1 0
    //   785: aload_0
    //   786: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   789: iload_3
    //   790: ifne +202 -> 992
    //   793: ldc -84
    //   795: ldc_w 1003
    //   798: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   801: aload_1
    //   802: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   805: ldc_w 553
    //   808: iconst_0
    //   809: invokevirtual 534	com/tencent/smtt/sdk/j:dq	(Ljava/lang/String;I)V
    //   812: aload_1
    //   813: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   816: sipush 64992
    //   819: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   822: aload_1
    //   823: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   826: iconst_0
    //   827: iconst_m1
    //   828: invokevirtual 528	com/tencent/smtt/sdk/j:eX	(II)V
    //   831: aload_1
    //   832: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   835: ldc_w 530
    //   838: iconst_1
    //   839: invokevirtual 534	com/tencent/smtt/sdk/j:dq	(Ljava/lang/String;I)V
    //   842: aload 10
    //   844: ldc_w 1005
    //   847: invokevirtual 972	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   850: astore 11
    //   852: new 126	java/io/File
    //   855: dup
    //   856: aload 11
    //   858: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;)V
    //   861: aload_1
    //   862: invokestatic 1010	com/tencent/smtt/sdk/h:a	(Ljava/io/File;Landroid/content/Context;)V
    //   865: aload_0
    //   866: aload_1
    //   867: aload 11
    //   869: aload 10
    //   871: ldc_w 1012
    //   874: invokevirtual 1014	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   877: invokevirtual 1017	com/tencent/smtt/sdk/p:r	(Landroid/content/Context;Ljava/lang/String;I)V
    //   880: iconst_0
    //   881: invokestatic 956	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   884: aload_2
    //   885: athrow
    //   886: aload_1
    //   887: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   890: sipush 64989
    //   893: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   896: aload_0
    //   897: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   900: return
    //   901: iload_3
    //   902: iconst_2
    //   903: if_icmpne +14 -> 917
    //   906: ldc -84
    //   908: ldc_w 958
    //   911: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   914: goto -305 -> 609
    //   917: aload_1
    //   918: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   921: sipush 64990
    //   924: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   927: ldc -84
    //   929: ldc_w 1023
    //   932: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   935: aload_1
    //   936: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   939: getfield 980	com/tencent/smtt/sdk/k:xVh	Ljava/util/Map;
    //   942: ldc_w 982
    //   945: iconst_1
    //   946: invokestatic 987	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   949: invokeinterface 993 3 0
    //   954: pop
    //   955: aload_1
    //   956: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   959: invokevirtual 996	com/tencent/smtt/sdk/k:commit	()V
    //   962: aload_1
    //   963: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   966: sipush 217
    //   969: new 227	java/lang/StringBuilder
    //   972: dup
    //   973: ldc_w 1027
    //   976: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   979: iload_3
    //   980: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   983: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   986: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   989: goto -380 -> 609
    //   992: iload_3
    //   993: iconst_2
    //   994: if_icmpne +14 -> 1008
    //   997: ldc -84
    //   999: ldc_w 958
    //   1002: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1005: goto -125 -> 880
    //   1008: aload_1
    //   1009: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1012: sipush 64990
    //   1015: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   1018: ldc -84
    //   1020: ldc_w 1023
    //   1023: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1026: aload_1
    //   1027: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1030: getfield 980	com/tencent/smtt/sdk/k:xVh	Ljava/util/Map;
    //   1033: ldc_w 982
    //   1036: iconst_1
    //   1037: invokestatic 987	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1040: invokeinterface 993 3 0
    //   1045: pop
    //   1046: aload_1
    //   1047: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1050: invokevirtual 996	com/tencent/smtt/sdk/k:commit	()V
    //   1053: aload_1
    //   1054: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   1057: sipush 217
    //   1060: new 227	java/lang/StringBuilder
    //   1063: dup
    //   1064: ldc_w 1027
    //   1067: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1070: iload_3
    //   1071: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1074: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1077: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   1080: goto -200 -> 880
    //   1083: astore_2
    //   1084: iconst_2
    //   1085: istore_3
    //   1086: goto -309 -> 777
    //   1089: astore 11
    //   1091: aload_2
    //   1092: astore 10
    //   1094: iconst_1
    //   1095: istore_3
    //   1096: aload 11
    //   1098: astore_2
    //   1099: goto -322 -> 777
    //   1102: astore 11
    //   1104: goto -472 -> 632
    //   1107: aconst_null
    //   1108: astore_2
    //   1109: iconst_2
    //   1110: istore_3
    //   1111: goto -603 -> 508
    //   1114: iconst_1
    //   1115: istore_3
    //   1116: goto -859 -> 257
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1119	0	this	p
    //   0	1119	1	paramContext	Context
    //   0	1119	2	paramBundle	Bundle
    //   257	859	3	i	int
    //   234	28	4	j	int
    //   45	29	5	l1	long
    //   54	31	7	l2	long
    //   133	26	9	bool	boolean
    //   297	796	10	localObject1	Object
    //   306	43	11	str1	String
    //   628	51	11	localException1	Exception
    //   850	18	11	str2	String
    //   1089	8	11	localObject2	Object
    //   1102	1	11	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   163	189	628	java/lang/Exception
    //   189	193	628	java/lang/Exception
    //   218	236	628	java/lang/Exception
    //   266	277	628	java/lang/Exception
    //   282	336	628	java/lang/Exception
    //   336	356	628	java/lang/Exception
    //   356	374	628	java/lang/Exception
    //   374	414	628	java/lang/Exception
    //   444	463	628	java/lang/Exception
    //   468	502	628	java/lang/Exception
    //   163	189	771	finally
    //   189	193	771	finally
    //   218	236	771	finally
    //   266	277	771	finally
    //   282	336	771	finally
    //   336	356	771	finally
    //   356	374	771	finally
    //   374	414	771	finally
    //   444	463	771	finally
    //   468	502	771	finally
    //   617	625	1083	finally
    //   635	661	1083	finally
    //   661	686	1089	finally
    //   617	625	1102	java/lang/Exception
  }
  
  /* Error */
  final int gC(Context paramContext)
  {
    // Byte code:
    //   0: new 126	java/io/File
    //   3: dup
    //   4: aload_1
    //   5: invokestatic 465	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   8: ldc -125
    //   10: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual 138	java/io/File:exists	()Z
    //   18: ifne +5 -> 23
    //   21: iconst_0
    //   22: ireturn
    //   23: new 140	java/util/Properties
    //   26: dup
    //   27: invokespecial 141	java/util/Properties:<init>	()V
    //   30: astore 4
    //   32: new 143	java/io/BufferedInputStream
    //   35: dup
    //   36: new 145	java/io/FileInputStream
    //   39: dup
    //   40: aload_1
    //   41: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   44: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   47: astore_3
    //   48: aload_3
    //   49: astore_1
    //   50: aload 4
    //   52: aload_3
    //   53: invokevirtual 154	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   56: aload_3
    //   57: astore_1
    //   58: aload_3
    //   59: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   62: aload_3
    //   63: astore_1
    //   64: aload 4
    //   66: ldc -97
    //   68: invokevirtual 163	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   71: astore 4
    //   73: aload 4
    //   75: ifnonnull +37 -> 112
    //   78: aload_3
    //   79: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   82: iconst_0
    //   83: ireturn
    //   84: astore_1
    //   85: ldc -84
    //   87: new 227	java/lang/StringBuilder
    //   90: dup
    //   91: ldc_w 1029
    //   94: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   97: aload_1
    //   98: invokevirtual 1030	java/io/IOException:toString	()Ljava/lang/String;
    //   101: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   110: iconst_0
    //   111: ireturn
    //   112: aload_3
    //   113: astore_1
    //   114: aload 4
    //   116: invokestatic 168	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   119: istore_2
    //   120: aload_3
    //   121: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   124: iload_2
    //   125: ireturn
    //   126: astore_1
    //   127: ldc -84
    //   129: new 227	java/lang/StringBuilder
    //   132: dup
    //   133: ldc_w 1029
    //   136: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   139: aload_1
    //   140: invokevirtual 1030	java/io/IOException:toString	()Ljava/lang/String;
    //   143: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   152: iload_2
    //   153: ireturn
    //   154: astore 4
    //   156: aconst_null
    //   157: astore_3
    //   158: aload_3
    //   159: astore_1
    //   160: ldc -84
    //   162: new 227	java/lang/StringBuilder
    //   165: dup
    //   166: ldc_w 1032
    //   169: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   172: aload 4
    //   174: invokevirtual 252	java/lang/Exception:toString	()Ljava/lang/String;
    //   177: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   186: aload_3
    //   187: ifnull +88 -> 275
    //   190: aload_3
    //   191: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   194: iconst_0
    //   195: ireturn
    //   196: astore_1
    //   197: ldc -84
    //   199: new 227	java/lang/StringBuilder
    //   202: dup
    //   203: ldc_w 1029
    //   206: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   209: aload_1
    //   210: invokevirtual 1030	java/io/IOException:toString	()Ljava/lang/String;
    //   213: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   222: iconst_0
    //   223: ireturn
    //   224: astore_3
    //   225: aconst_null
    //   226: astore_1
    //   227: aload_1
    //   228: ifnull +7 -> 235
    //   231: aload_1
    //   232: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   235: aload_3
    //   236: athrow
    //   237: astore_1
    //   238: ldc -84
    //   240: new 227	java/lang/StringBuilder
    //   243: dup
    //   244: ldc_w 1029
    //   247: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   250: aload_1
    //   251: invokevirtual 1030	java/io/IOException:toString	()Ljava/lang/String;
    //   254: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   260: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   263: goto -28 -> 235
    //   266: astore_3
    //   267: goto -40 -> 227
    //   270: astore 4
    //   272: goto -114 -> 158
    //   275: iconst_0
    //   276: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	277	0	this	p
    //   0	277	1	paramContext	Context
    //   119	34	2	i	int
    //   47	144	3	localBufferedInputStream	java.io.BufferedInputStream
    //   224	12	3	localObject1	Object
    //   266	1	3	localObject2	Object
    //   30	85	4	localObject3	Object
    //   154	19	4	localException1	Exception
    //   270	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   78	82	84	java/io/IOException
    //   120	124	126	java/io/IOException
    //   0	21	154	java/lang/Exception
    //   23	48	154	java/lang/Exception
    //   190	194	196	java/io/IOException
    //   0	21	224	finally
    //   23	48	224	finally
    //   231	235	237	java/io/IOException
    //   50	56	266	finally
    //   58	62	266	finally
    //   64	73	266	finally
    //   114	120	266	finally
    //   160	186	266	finally
    //   50	56	270	java/lang/Exception
    //   58	62	270	java/lang/Exception
    //   64	73	270	java/lang/Exception
    //   114	120	270	java/lang/Exception
  }
  
  final boolean gD(Context paramContext)
  {
    return new File(gK(paramContext), "tbs.conf").exists();
  }
  
  /* Error */
  final int gE(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 819	com/tencent/smtt/sdk/p:gQ	(Landroid/content/Context;)Z
    //   5: ifne +5 -> 10
    //   8: iconst_m1
    //   9: ireturn
    //   10: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   13: invokeinterface 824 1 0
    //   18: istore_3
    //   19: ldc -84
    //   21: new 227	java/lang/StringBuilder
    //   24: dup
    //   25: ldc_w 1035
    //   28: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   31: iload_3
    //   32: invokevirtual 362	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   35: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: iload_3
    //   42: ifeq +257 -> 299
    //   45: new 126	java/io/File
    //   48: dup
    //   49: aload_1
    //   50: invokestatic 465	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   53: ldc -125
    //   55: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   58: astore_1
    //   59: aload_1
    //   60: invokevirtual 138	java/io/File:exists	()Z
    //   63: istore_3
    //   64: iload_3
    //   65: ifne +17 -> 82
    //   68: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   71: invokeinterface 847 1 0
    //   76: aload_0
    //   77: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   80: iconst_0
    //   81: ireturn
    //   82: new 140	java/util/Properties
    //   85: dup
    //   86: invokespecial 141	java/util/Properties:<init>	()V
    //   89: astore 5
    //   91: new 143	java/io/BufferedInputStream
    //   94: dup
    //   95: new 145	java/io/FileInputStream
    //   98: dup
    //   99: aload_1
    //   100: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   103: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   106: astore 4
    //   108: aload 4
    //   110: astore_1
    //   111: aload 5
    //   113: aload 4
    //   115: invokevirtual 154	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   118: aload 4
    //   120: astore_1
    //   121: aload 4
    //   123: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   126: aload 4
    //   128: astore_1
    //   129: aload 5
    //   131: ldc -97
    //   133: invokevirtual 163	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   136: astore 5
    //   138: aload 5
    //   140: ifnonnull +22 -> 162
    //   143: aload 4
    //   145: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   148: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   151: invokeinterface 847 1 0
    //   156: aload_0
    //   157: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   160: iconst_0
    //   161: ireturn
    //   162: aload 4
    //   164: astore_1
    //   165: getstatic 59	com/tencent/smtt/sdk/p:xVL	Ljava/lang/ThreadLocal;
    //   168: aload 5
    //   170: invokestatic 168	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   173: invokestatic 734	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   176: invokevirtual 740	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   179: aload 4
    //   181: astore_1
    //   182: getstatic 59	com/tencent/smtt/sdk/p:xVL	Ljava/lang/ThreadLocal;
    //   185: invokevirtual 891	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   188: checkcast 165	java/lang/Integer
    //   191: invokevirtual 894	java/lang/Integer:intValue	()I
    //   194: istore_2
    //   195: aload 4
    //   197: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   200: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   203: invokeinterface 847 1 0
    //   208: aload_0
    //   209: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   212: iload_2
    //   213: ireturn
    //   214: astore 5
    //   216: aconst_null
    //   217: astore 4
    //   219: aload 4
    //   221: astore_1
    //   222: ldc -84
    //   224: new 227	java/lang/StringBuilder
    //   227: dup
    //   228: ldc_w 1037
    //   231: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   234: aload 5
    //   236: invokevirtual 252	java/lang/Exception:toString	()Ljava/lang/String;
    //   239: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   245: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   248: aload 4
    //   250: ifnull +8 -> 258
    //   253: aload 4
    //   255: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   258: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   261: invokeinterface 847 1 0
    //   266: aload_0
    //   267: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   270: iconst_0
    //   271: ireturn
    //   272: astore 4
    //   274: aconst_null
    //   275: astore_1
    //   276: aload_1
    //   277: ifnull +7 -> 284
    //   280: aload_1
    //   281: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   284: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   287: invokeinterface 847 1 0
    //   292: aload_0
    //   293: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   296: aload 4
    //   298: athrow
    //   299: aload_0
    //   300: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   303: iconst_0
    //   304: ireturn
    //   305: astore_1
    //   306: ldc -84
    //   308: new 227	java/lang/StringBuilder
    //   311: dup
    //   312: ldc_w 1039
    //   315: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   318: aload_1
    //   319: invokevirtual 1030	java/io/IOException:toString	()Ljava/lang/String;
    //   322: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   328: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   331: goto -183 -> 148
    //   334: astore_1
    //   335: ldc -84
    //   337: new 227	java/lang/StringBuilder
    //   340: dup
    //   341: ldc_w 1039
    //   344: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   347: aload_1
    //   348: invokevirtual 1030	java/io/IOException:toString	()Ljava/lang/String;
    //   351: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   357: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   360: goto -160 -> 200
    //   363: astore_1
    //   364: ldc -84
    //   366: new 227	java/lang/StringBuilder
    //   369: dup
    //   370: ldc_w 1039
    //   373: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   376: aload_1
    //   377: invokevirtual 1030	java/io/IOException:toString	()Ljava/lang/String;
    //   380: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   386: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   389: goto -131 -> 258
    //   392: astore_1
    //   393: ldc -84
    //   395: new 227	java/lang/StringBuilder
    //   398: dup
    //   399: ldc_w 1039
    //   402: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   405: aload_1
    //   406: invokevirtual 1030	java/io/IOException:toString	()Ljava/lang/String;
    //   409: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   415: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   418: goto -134 -> 284
    //   421: astore 4
    //   423: goto -147 -> 276
    //   426: astore 5
    //   428: goto -209 -> 219
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	431	0	this	p
    //   0	431	1	paramContext	Context
    //   194	19	2	i	int
    //   18	47	3	bool	boolean
    //   106	148	4	localBufferedInputStream	java.io.BufferedInputStream
    //   272	25	4	localObject1	Object
    //   421	1	4	localObject2	Object
    //   89	80	5	localObject3	Object
    //   214	21	5	localException1	Exception
    //   426	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   45	64	214	java/lang/Exception
    //   82	108	214	java/lang/Exception
    //   45	64	272	finally
    //   82	108	272	finally
    //   143	148	305	java/io/IOException
    //   195	200	334	java/io/IOException
    //   253	258	363	java/io/IOException
    //   280	284	392	java/io/IOException
    //   111	118	421	finally
    //   121	126	421	finally
    //   129	138	421	finally
    //   165	179	421	finally
    //   182	195	421	finally
    //   222	248	421	finally
    //   111	118	426	java/lang/Exception
    //   121	126	426	java/lang/Exception
    //   129	138	426	java/lang/Exception
    //   165	179	426	java/lang/Exception
    //   182	195	426	java/lang/Exception
  }
  
  public final boolean gG(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--coreShareCopyToDecouple #0");
    File localFile1 = gK(paramContext);
    File localFile2 = gJ(paramContext);
    try
    {
      f.c(localFile2, true);
      f.a(localFile1, localFile2, new FileFilter()
      {
        public final boolean accept(File paramAnonymousFile)
        {
          return !paramAnonymousFile.getName().endsWith(".dex");
        }
      });
      t.gT(paramContext);
      TbsLog.i("TbsInstaller", "TbsInstaller--coreShareCopyToDecouple success!!!");
      return true;
    }
    catch (Exception paramContext) {}
    return false;
  }
  
  final boolean gQ(Context paramContext)
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        this.xVE += 1;
        if (this.xVH)
        {
          TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= true");
          return bool;
        }
        this.xVG = f.c(paramContext, true, "tbslock.txt");
        if (this.xVG != null)
        {
          this.xVF = f.a(this.xVG);
          if (this.xVF == null)
          {
            bool = false;
          }
          else
          {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= false");
            this.xVH = true;
          }
        }
        else
        {
          bool = false;
        }
      }
      finally {}
    }
  }
  
  /* Error */
  final boolean gt(Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: new 126	java/io/File
    //   5: dup
    //   6: aload_1
    //   7: invokestatic 465	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   10: ldc -125
    //   12: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   15: astore 5
    //   17: aload 5
    //   19: invokevirtual 138	java/io/File:exists	()Z
    //   22: ifne +5 -> 27
    //   25: iconst_0
    //   26: ireturn
    //   27: new 140	java/util/Properties
    //   30: dup
    //   31: invokespecial 141	java/util/Properties:<init>	()V
    //   34: astore 6
    //   36: new 143	java/io/BufferedInputStream
    //   39: dup
    //   40: new 145	java/io/FileInputStream
    //   43: dup
    //   44: aload 5
    //   46: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   49: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   52: astore_1
    //   53: aload 6
    //   55: aload_1
    //   56: invokevirtual 154	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   59: aload 6
    //   61: ldc_w 1061
    //   64: ldc_w 1063
    //   67: invokevirtual 1065	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   70: invokestatic 1068	java/lang/Boolean:valueOf	(Ljava/lang/String;)Ljava/lang/Boolean;
    //   73: invokevirtual 1071	java/lang/Boolean:booleanValue	()Z
    //   76: istore 4
    //   78: iload 4
    //   80: ifeq +153 -> 233
    //   83: invokestatic 1074	java/lang/System:currentTimeMillis	()J
    //   86: aload 5
    //   88: invokevirtual 1077	java/io/File:lastModified	()J
    //   91: lsub
    //   92: ldc2_w 1078
    //   95: lcmp
    //   96: ifle +55 -> 151
    //   99: iconst_1
    //   100: istore_3
    //   101: ldc -84
    //   103: new 227	java/lang/StringBuilder
    //   106: dup
    //   107: ldc_w 1081
    //   110: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   113: iload 4
    //   115: invokevirtual 362	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   118: ldc_w 1083
    //   121: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: iload_3
    //   125: invokevirtual 362	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   128: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: iload_3
    //   135: ifne +21 -> 156
    //   138: iload 4
    //   140: iload_2
    //   141: iand
    //   142: istore 4
    //   144: aload_1
    //   145: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   148: iload 4
    //   150: ireturn
    //   151: iconst_0
    //   152: istore_3
    //   153: goto -52 -> 101
    //   156: iconst_0
    //   157: istore_2
    //   158: goto -20 -> 138
    //   161: astore_1
    //   162: aconst_null
    //   163: astore_1
    //   164: iconst_0
    //   165: istore_3
    //   166: iload_3
    //   167: istore 4
    //   169: aload_1
    //   170: ifnull -22 -> 148
    //   173: aload_1
    //   174: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   177: iload_3
    //   178: istore 4
    //   180: goto -32 -> 148
    //   183: astore_1
    //   184: iload_3
    //   185: istore 4
    //   187: goto -39 -> 148
    //   190: astore 5
    //   192: aconst_null
    //   193: astore_1
    //   194: aload_1
    //   195: ifnull +7 -> 202
    //   198: aload_1
    //   199: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   202: aload 5
    //   204: athrow
    //   205: astore_1
    //   206: goto -58 -> 148
    //   209: astore_1
    //   210: goto -8 -> 202
    //   213: astore 5
    //   215: goto -21 -> 194
    //   218: astore 5
    //   220: iconst_0
    //   221: istore_3
    //   222: goto -56 -> 166
    //   225: astore 5
    //   227: iload 4
    //   229: istore_3
    //   230: goto -64 -> 166
    //   233: iconst_0
    //   234: istore_3
    //   235: goto -134 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	238	0	this	p
    //   0	238	1	paramContext	Context
    //   1	157	2	bool1	boolean
    //   100	135	3	bool2	boolean
    //   76	152	4	bool3	boolean
    //   15	72	5	localFile	File
    //   190	13	5	localObject1	Object
    //   213	1	5	localObject2	Object
    //   218	1	5	localThrowable1	Throwable
    //   225	1	5	localThrowable2	Throwable
    //   34	26	6	localProperties	java.util.Properties
    // Exception table:
    //   from	to	target	type
    //   36	53	161	java/lang/Throwable
    //   173	177	183	java/io/IOException
    //   36	53	190	finally
    //   144	148	205	java/io/IOException
    //   198	202	209	java/io/IOException
    //   53	78	213	finally
    //   83	99	213	finally
    //   101	134	213	finally
    //   53	78	218	java/lang/Throwable
    //   83	99	225	java/lang/Throwable
    //   101	134	225	java/lang/Throwable
  }
  
  /* Error */
  @android.annotation.TargetApi(11)
  public final void r(Context paramContext, String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   4: sipush 65035
    //   7: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 929	com/tencent/smtt/sdk/p:gt	(Landroid/content/Context;)Z
    //   15: ifeq +23 -> 38
    //   18: ldc -84
    //   20: ldc_w 1088
    //   23: iconst_1
    //   24: invokestatic 842	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   27: aload_1
    //   28: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   31: sipush 65034
    //   34: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   37: return
    //   38: ldc -84
    //   40: new 227	java/lang/StringBuilder
    //   43: dup
    //   44: ldc_w 1090
    //   47: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   50: aload_2
    //   51: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: ldc -84
    //   62: new 227	java/lang/StringBuilder
    //   65: dup
    //   66: ldc_w 1092
    //   69: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: iload_3
    //   73: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   76: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   82: ldc -84
    //   84: new 227	java/lang/StringBuilder
    //   87: dup
    //   88: ldc_w 773
    //   91: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   94: aload_1
    //   95: invokevirtual 777	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   98: getfield 782	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   101: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   110: ldc -84
    //   112: new 227	java/lang/StringBuilder
    //   115: dup
    //   116: ldc_w 1094
    //   119: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: invokestatic 789	android/os/Process:myPid	()I
    //   125: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   128: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: ldc -84
    //   136: new 227	java/lang/StringBuilder
    //   139: dup
    //   140: ldc_w 1096
    //   143: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   146: invokestatic 795	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   149: invokevirtual 796	java/lang/Thread:getName	()Ljava/lang/String;
    //   152: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   161: getstatic 199	android/os/Build$VERSION:SDK_INT	I
    //   164: bipush 11
    //   166: if_icmplt +67 -> 233
    //   169: aload_1
    //   170: ldc_w 1098
    //   173: iconst_4
    //   174: invokevirtual 1102	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   177: astore 13
    //   179: aload 13
    //   181: ldc_w 1104
    //   184: iconst_m1
    //   185: invokeinterface 301 3 0
    //   190: iload_3
    //   191: if_icmpne +55 -> 246
    //   194: ldc -84
    //   196: new 227	java/lang/StringBuilder
    //   199: dup
    //   200: ldc_w 1106
    //   203: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   206: iload_3
    //   207: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   210: ldc_w 1108
    //   213: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: invokestatic 323	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   222: aload_1
    //   223: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   226: sipush 65033
    //   229: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   232: return
    //   233: aload_1
    //   234: ldc_w 1098
    //   237: iconst_0
    //   238: invokevirtual 1102	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   241: astore 13
    //   243: goto -64 -> 179
    //   246: aload_1
    //   247: invokestatic 934	com/tencent/smtt/utils/f:hv	(Landroid/content/Context;)Z
    //   250: ifne +67 -> 317
    //   253: invokestatic 940	com/tencent/smtt/utils/u:cpv	()J
    //   256: lstore 8
    //   258: aload_1
    //   259: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   262: invokevirtual 943	com/tencent/smtt/sdk/k:cof	()J
    //   265: lstore 10
    //   267: aload_1
    //   268: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   271: sipush 65032
    //   274: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   277: aload_1
    //   278: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   281: sipush 210
    //   284: new 227	java/lang/StringBuilder
    //   287: dup
    //   288: ldc_w 1110
    //   291: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   294: lload 8
    //   296: invokevirtual 948	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   299: ldc_w 950
    //   302: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: lload 10
    //   307: invokevirtual 948	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   310: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   313: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   316: return
    //   317: aload_0
    //   318: aload_1
    //   319: invokevirtual 819	com/tencent/smtt/sdk/p:gQ	(Landroid/content/Context;)Z
    //   322: ifne +14 -> 336
    //   325: aload_1
    //   326: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   329: sipush 65031
    //   332: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   335: return
    //   336: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   339: invokeinterface 824 1 0
    //   344: istore 12
    //   346: ldc -84
    //   348: new 227	java/lang/StringBuilder
    //   351: dup
    //   352: ldc_w 1112
    //   355: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   358: iload 12
    //   360: invokevirtual 362	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   363: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   366: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   369: iload 12
    //   371: ifeq +2067 -> 2438
    //   374: aload_1
    //   375: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   378: sipush 65029
    //   381: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   384: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   387: invokeinterface 1115 1 0
    //   392: aload_1
    //   393: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   396: ldc_w 1117
    //   399: invokevirtual 963	com/tencent/smtt/sdk/j:Yf	(Ljava/lang/String;)I
    //   402: istore 4
    //   404: aload_1
    //   405: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   408: ldc_w 1119
    //   411: invokevirtual 963	com/tencent/smtt/sdk/j:Yf	(Ljava/lang/String;)I
    //   414: istore 5
    //   416: ldc -84
    //   418: new 227	java/lang/StringBuilder
    //   421: dup
    //   422: ldc_w 1121
    //   425: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   428: iload 4
    //   430: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   433: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   436: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   439: ldc -84
    //   441: new 227	java/lang/StringBuilder
    //   444: dup
    //   445: ldc_w 1123
    //   448: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   451: iload 5
    //   453: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   456: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   459: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   462: ldc -84
    //   464: new 227	java/lang/StringBuilder
    //   467: dup
    //   468: ldc_w 1125
    //   471: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   474: iload_3
    //   475: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   478: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   481: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   484: iload 5
    //   486: ifle +2036 -> 2522
    //   489: iload_3
    //   490: iload 5
    //   492: if_icmpgt +6 -> 498
    //   495: goto +2027 -> 2522
    //   498: aload_1
    //   499: invokestatic 1127	com/tencent/smtt/sdk/p:gI	(Landroid/content/Context;)V
    //   502: aload_1
    //   503: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   506: ldc_w 861
    //   509: invokevirtual 831	com/tencent/smtt/sdk/j:Ye	(Ljava/lang/String;)I
    //   512: istore 5
    //   514: aload_0
    //   515: aload_1
    //   516: invokevirtual 417	com/tencent/smtt/sdk/p:gC	(Landroid/content/Context;)I
    //   519: istore 6
    //   521: ldc -84
    //   523: new 227	java/lang/StringBuilder
    //   526: dup
    //   527: ldc_w 1129
    //   530: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   533: iload 5
    //   535: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   538: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   541: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   544: ldc -84
    //   546: new 227	java/lang/StringBuilder
    //   549: dup
    //   550: ldc_w 1131
    //   553: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   556: iload 6
    //   558: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   561: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   564: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   567: iload 5
    //   569: iflt +157 -> 726
    //   572: iload 5
    //   574: iconst_2
    //   575: if_icmpge +151 -> 726
    //   578: ldc -84
    //   580: ldc_w 1133
    //   583: iconst_1
    //   584: invokestatic 842	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   587: iconst_1
    //   588: istore 7
    //   590: iload 5
    //   592: istore 6
    //   594: aload_1
    //   595: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   598: sipush 65028
    //   601: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   604: ldc -84
    //   606: new 227	java/lang/StringBuilder
    //   609: dup
    //   610: ldc_w 1135
    //   613: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   616: iload 6
    //   618: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   621: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   624: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   627: iconst_0
    //   628: istore 5
    //   630: iload 6
    //   632: ifgt +1091 -> 1723
    //   635: ldc -84
    //   637: ldc_w 1137
    //   640: iconst_1
    //   641: invokestatic 842	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   644: aload_1
    //   645: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   648: sipush 65027
    //   651: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   654: iload 7
    //   656: ifeq +139 -> 795
    //   659: aload_1
    //   660: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   663: ldc_w 549
    //   666: invokevirtual 963	com/tencent/smtt/sdk/j:Yf	(Ljava/lang/String;)I
    //   669: istore 4
    //   671: iload 4
    //   673: bipush 10
    //   675: if_icmple +106 -> 781
    //   678: aload_1
    //   679: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   682: sipush 201
    //   685: ldc_w 1139
    //   688: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   691: aload_1
    //   692: invokestatic 1141	com/tencent/smtt/sdk/p:gH	(Landroid/content/Context;)V
    //   695: aload_1
    //   696: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   699: sipush 65026
    //   702: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   705: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   708: invokeinterface 847 1 0
    //   713: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   716: invokeinterface 847 1 0
    //   721: aload_0
    //   722: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   725: return
    //   726: iload 5
    //   728: istore 4
    //   730: iload 5
    //   732: iconst_3
    //   733: if_icmpne +1803 -> 2536
    //   736: iload 5
    //   738: istore 4
    //   740: iload 6
    //   742: ifle +1794 -> 2536
    //   745: iload_3
    //   746: iload 6
    //   748: if_icmpgt +14 -> 762
    //   751: iload 5
    //   753: istore 4
    //   755: iload_3
    //   756: ldc_w 1142
    //   759: if_icmpne +1777 -> 2536
    //   762: iconst_m1
    //   763: istore 4
    //   765: aload_1
    //   766: invokestatic 1127	com/tencent/smtt/sdk/p:gI	(Landroid/content/Context;)V
    //   769: ldc -84
    //   771: ldc_w 1144
    //   774: iconst_1
    //   775: invokestatic 842	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   778: goto +1758 -> 2536
    //   781: aload_1
    //   782: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   785: ldc_w 549
    //   788: iload 4
    //   790: iconst_1
    //   791: iadd
    //   792: invokevirtual 534	com/tencent/smtt/sdk/j:dq	(Ljava/lang/String;I)V
    //   795: aload_2
    //   796: ifnonnull +68 -> 864
    //   799: aload_1
    //   800: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   803: ldc_w 555
    //   806: invokevirtual 1147	com/tencent/smtt/sdk/j:getStringValue	(Ljava/lang/String;)Ljava/lang/String;
    //   809: astore 14
    //   811: aload 14
    //   813: astore 13
    //   815: aload 14
    //   817: ifnonnull +50 -> 867
    //   820: aload_1
    //   821: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   824: sipush 202
    //   827: ldc_w 1149
    //   830: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   833: aload_1
    //   834: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   837: sipush 65025
    //   840: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   843: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   846: invokeinterface 847 1 0
    //   851: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   854: invokeinterface 847 1 0
    //   859: aload_0
    //   860: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   863: return
    //   864: aload_2
    //   865: astore 13
    //   867: ldc -84
    //   869: new 227	java/lang/StringBuilder
    //   872: dup
    //   873: ldc_w 1151
    //   876: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   879: aload 13
    //   881: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   884: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   887: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   890: aload_1
    //   891: invokevirtual 496	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   894: aload 13
    //   896: iconst_0
    //   897: invokevirtual 1154	android/content/pm/PackageManager:getPackageArchiveInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   900: astore 14
    //   902: aload 14
    //   904: ifnull +59 -> 963
    //   907: aload 14
    //   909: getfield 1157	android/content/pm/PackageInfo:versionCode	I
    //   912: istore 5
    //   914: iload 5
    //   916: ifne +53 -> 969
    //   919: aload_1
    //   920: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   923: sipush 65024
    //   926: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   929: aload_1
    //   930: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   933: sipush 203
    //   936: ldc_w 1159
    //   939: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   942: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   945: invokeinterface 847 1 0
    //   950: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   953: invokeinterface 847 1 0
    //   958: aload_0
    //   959: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   962: return
    //   963: iconst_0
    //   964: istore 5
    //   966: goto -52 -> 914
    //   969: aload_1
    //   970: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   973: ldc_w 555
    //   976: aload 13
    //   978: invokevirtual 560	com/tencent/smtt/sdk/j:fy	(Ljava/lang/String;Ljava/lang/String;)V
    //   981: aload_1
    //   982: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   985: iload 5
    //   987: iconst_0
    //   988: invokevirtual 528	com/tencent/smtt/sdk/j:eX	(II)V
    //   991: aload_1
    //   992: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   995: sipush 64988
    //   998: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   1001: aload_1
    //   1002: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1005: getfield 293	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   1008: ldc_w 295
    //   1011: iconst_0
    //   1012: invokeinterface 301 3 0
    //   1017: iconst_1
    //   1018: if_icmpne +57 -> 1075
    //   1021: aload_1
    //   1022: new 126	java/io/File
    //   1025: dup
    //   1026: aload 13
    //   1028: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;)V
    //   1031: iconst_1
    //   1032: invokestatic 1161	com/tencent/smtt/sdk/p:a	(Landroid/content/Context;Ljava/io/File;Z)Z
    //   1035: ifne +91 -> 1126
    //   1038: aload_1
    //   1039: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   1042: sipush 207
    //   1045: ldc_w 1163
    //   1048: getstatic 1169	com/tencent/smtt/sdk/r$a:xWe	Lcom/tencent/smtt/sdk/r$a;
    //   1051: invokevirtual 1172	com/tencent/smtt/sdk/r:a	(ILjava/lang/String;Lcom/tencent/smtt/sdk/r$a;)V
    //   1054: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   1057: invokeinterface 847 1 0
    //   1062: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   1065: invokeinterface 847 1 0
    //   1070: aload_0
    //   1071: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   1074: return
    //   1075: aload_1
    //   1076: new 126	java/io/File
    //   1079: dup
    //   1080: aload 13
    //   1082: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;)V
    //   1085: iconst_0
    //   1086: invokestatic 1161	com/tencent/smtt/sdk/p:a	(Landroid/content/Context;Ljava/io/File;Z)Z
    //   1089: ifne +37 -> 1126
    //   1092: aload_1
    //   1093: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   1096: sipush 207
    //   1099: ldc_w 1163
    //   1102: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   1105: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   1108: invokeinterface 847 1 0
    //   1113: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   1116: invokeinterface 847 1 0
    //   1121: aload_0
    //   1122: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   1125: return
    //   1126: iload 7
    //   1128: ifeq +134 -> 1262
    //   1131: aload_1
    //   1132: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   1135: ldc_w 551
    //   1138: invokevirtual 831	com/tencent/smtt/sdk/j:Ye	(Ljava/lang/String;)I
    //   1141: istore 4
    //   1143: iload 4
    //   1145: iconst_5
    //   1146: if_icmple +102 -> 1248
    //   1149: aload_1
    //   1150: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   1153: sipush 223
    //   1156: ldc_w 1174
    //   1159: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   1162: aload_1
    //   1163: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1166: sipush 64983
    //   1169: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   1172: aload_1
    //   1173: invokestatic 1141	com/tencent/smtt/sdk/p:gH	(Landroid/content/Context;)V
    //   1176: aload_1
    //   1177: invokestatic 1177	com/tencent/smtt/sdk/h:gj	(Landroid/content/Context;)V
    //   1180: aload_1
    //   1181: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1184: getfield 980	com/tencent/smtt/sdk/k:xVh	Ljava/util/Map;
    //   1187: ldc_w 982
    //   1190: iconst_1
    //   1191: invokestatic 987	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1194: invokeinterface 993 3 0
    //   1199: pop
    //   1200: aload_1
    //   1201: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1204: getfield 980	com/tencent/smtt/sdk/k:xVh	Ljava/util/Map;
    //   1207: ldc_w 1179
    //   1210: iconst_1
    //   1211: invokestatic 987	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1214: invokeinterface 993 3 0
    //   1219: pop
    //   1220: aload_1
    //   1221: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1224: invokevirtual 996	com/tencent/smtt/sdk/k:commit	()V
    //   1227: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   1230: invokeinterface 847 1 0
    //   1235: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   1238: invokeinterface 847 1 0
    //   1243: aload_0
    //   1244: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   1247: return
    //   1248: aload_1
    //   1249: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   1252: ldc_w 551
    //   1255: iload 4
    //   1257: iconst_1
    //   1258: iadd
    //   1259: invokevirtual 534	com/tencent/smtt/sdk/j:dq	(Ljava/lang/String;I)V
    //   1262: ldc -84
    //   1264: ldc_w 1181
    //   1267: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1270: invokestatic 1185	com/tencent/smtt/sdk/k:coc	()Lcom/tencent/smtt/sdk/k;
    //   1273: getfield 293	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   1276: ldc_w 960
    //   1279: iconst_0
    //   1280: invokeinterface 301 3 0
    //   1285: istore 4
    //   1287: aload_0
    //   1288: aload_1
    //   1289: invokevirtual 417	com/tencent/smtt/sdk/p:gC	(Landroid/content/Context;)I
    //   1292: ifeq +331 -> 1623
    //   1295: aload_1
    //   1296: ldc_w 1187
    //   1299: aconst_null
    //   1300: invokestatic 1190	com/tencent/smtt/sdk/QbSdk:c	(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Object;
    //   1303: astore 13
    //   1305: aload 13
    //   1307: ifnull +1209 -> 2516
    //   1310: aload 13
    //   1312: instanceof 984
    //   1315: ifeq +1201 -> 2516
    //   1318: aload 13
    //   1320: checkcast 984	java/lang/Boolean
    //   1323: invokevirtual 1071	java/lang/Boolean:booleanValue	()Z
    //   1326: istore 12
    //   1328: iload 12
    //   1330: ifeq +293 -> 1623
    //   1333: new 969	android/os/Bundle
    //   1336: dup
    //   1337: invokespecial 1191	android/os/Bundle:<init>	()V
    //   1340: astore 13
    //   1342: aload 13
    //   1344: ldc_w 1193
    //   1347: iload 4
    //   1349: invokevirtual 1196	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1352: aload_1
    //   1353: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1356: getfield 293	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   1359: ldc_w 295
    //   1362: iconst_0
    //   1363: invokeinterface 301 3 0
    //   1368: iconst_1
    //   1369: if_icmpne +84 -> 1453
    //   1372: aload 13
    //   1374: ldc_w 1198
    //   1377: aload_1
    //   1378: invokestatic 371	com/tencent/smtt/sdk/p:gJ	(Landroid/content/Context;)Ljava/io/File;
    //   1381: invokevirtual 233	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1384: invokevirtual 1201	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   1387: aload_1
    //   1388: ldc_w 1203
    //   1391: aload 13
    //   1393: invokestatic 1190	com/tencent/smtt/sdk/QbSdk:c	(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Object;
    //   1396: astore 13
    //   1398: aload 13
    //   1400: ifnonnull +94 -> 1494
    //   1403: ldc -84
    //   1405: ldc_w 1205
    //   1408: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1411: aload_1
    //   1412: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   1415: sipush 222
    //   1418: ldc_w 1207
    //   1421: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   1424: iconst_0
    //   1425: istore 4
    //   1427: iload 4
    //   1429: ifne +194 -> 1623
    //   1432: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   1435: invokeinterface 847 1 0
    //   1440: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   1443: invokeinterface 847 1 0
    //   1448: aload_0
    //   1449: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   1452: return
    //   1453: aload 13
    //   1455: ldc_w 1198
    //   1458: aload_1
    //   1459: invokestatic 326	com/tencent/smtt/sdk/p:gN	(Landroid/content/Context;)Ljava/io/File;
    //   1462: invokevirtual 233	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1465: invokevirtual 1201	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   1468: goto -81 -> 1387
    //   1471: astore_1
    //   1472: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   1475: invokeinterface 847 1 0
    //   1480: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   1483: invokeinterface 847 1 0
    //   1488: aload_0
    //   1489: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   1492: aload_1
    //   1493: athrow
    //   1494: aload 13
    //   1496: instanceof 984
    //   1499: ifeq +55 -> 1554
    //   1502: aload 13
    //   1504: checkcast 984	java/lang/Boolean
    //   1507: invokevirtual 1071	java/lang/Boolean:booleanValue	()Z
    //   1510: ifeq +17 -> 1527
    //   1513: iconst_1
    //   1514: istore 4
    //   1516: ldc -84
    //   1518: ldc_w 1209
    //   1521: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1524: goto -97 -> 1427
    //   1527: ldc -84
    //   1529: ldc_w 1211
    //   1532: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1535: aload_1
    //   1536: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   1539: sipush 222
    //   1542: ldc_w 1211
    //   1545: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   1548: iconst_0
    //   1549: istore 4
    //   1551: goto -124 -> 1427
    //   1554: aload 13
    //   1556: instanceof 969
    //   1559: ifeq +9 -> 1568
    //   1562: iconst_1
    //   1563: istore 4
    //   1565: goto -138 -> 1427
    //   1568: aload 13
    //   1570: instanceof 261
    //   1573: ifeq +973 -> 2546
    //   1576: ldc -84
    //   1578: new 227	java/lang/StringBuilder
    //   1581: dup
    //   1582: ldc_w 1213
    //   1585: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1588: aload 13
    //   1590: checkcast 261	java/lang/Throwable
    //   1593: invokestatic 320	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1596: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1599: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1602: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1605: aload_1
    //   1606: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   1609: sipush 222
    //   1612: aload 13
    //   1614: checkcast 261	java/lang/Throwable
    //   1617: invokevirtual 383	com/tencent/smtt/sdk/r:c	(ILjava/lang/Throwable;)V
    //   1620: goto +926 -> 2546
    //   1623: ldc -84
    //   1625: ldc_w 1215
    //   1628: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1631: aload_1
    //   1632: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   1635: iload 5
    //   1637: iconst_1
    //   1638: invokevirtual 528	com/tencent/smtt/sdk/j:eX	(II)V
    //   1641: iload 5
    //   1643: istore 4
    //   1645: iload 6
    //   1647: iconst_2
    //   1648: if_icmpge +770 -> 2418
    //   1651: iload 7
    //   1653: ifeq +202 -> 1855
    //   1656: aload_1
    //   1657: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   1660: ldc_w 547
    //   1663: invokevirtual 963	com/tencent/smtt/sdk/j:Yf	(Ljava/lang/String;)I
    //   1666: istore 5
    //   1668: iload 5
    //   1670: bipush 10
    //   1672: if_icmple +169 -> 1841
    //   1675: aload_1
    //   1676: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   1679: sipush 208
    //   1682: ldc_w 1217
    //   1685: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   1688: aload_1
    //   1689: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1692: sipush 65022
    //   1695: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   1698: aload_1
    //   1699: invokestatic 1141	com/tencent/smtt/sdk/p:gH	(Landroid/content/Context;)V
    //   1702: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   1705: invokeinterface 847 1 0
    //   1710: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   1713: invokeinterface 847 1 0
    //   1718: aload_0
    //   1719: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   1722: return
    //   1723: iload 5
    //   1725: istore 4
    //   1727: aload_1
    //   1728: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1731: getfield 293	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   1734: ldc_w 295
    //   1737: iconst_0
    //   1738: invokeinterface 301 3 0
    //   1743: iconst_1
    //   1744: if_icmpne -99 -> 1645
    //   1747: aload_2
    //   1748: ifnonnull +68 -> 1816
    //   1751: aload_1
    //   1752: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   1755: ldc_w 555
    //   1758: invokevirtual 1147	com/tencent/smtt/sdk/j:getStringValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1761: astore 14
    //   1763: aload 14
    //   1765: astore 13
    //   1767: aload 14
    //   1769: ifnonnull +50 -> 1819
    //   1772: aload_1
    //   1773: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   1776: sipush 202
    //   1779: ldc_w 1149
    //   1782: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   1785: aload_1
    //   1786: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1789: sipush 65025
    //   1792: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   1795: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   1798: invokeinterface 847 1 0
    //   1803: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   1806: invokeinterface 847 1 0
    //   1811: aload_0
    //   1812: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   1815: return
    //   1816: aload_2
    //   1817: astore 13
    //   1819: aload_1
    //   1820: new 126	java/io/File
    //   1823: dup
    //   1824: aload 13
    //   1826: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;)V
    //   1829: iconst_1
    //   1830: invokestatic 1161	com/tencent/smtt/sdk/p:a	(Landroid/content/Context;Ljava/io/File;Z)Z
    //   1833: pop
    //   1834: iload 5
    //   1836: istore 4
    //   1838: goto -193 -> 1645
    //   1841: aload_1
    //   1842: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   1845: ldc_w 547
    //   1848: iload 5
    //   1850: iconst_1
    //   1851: iadd
    //   1852: invokevirtual 534	com/tencent/smtt/sdk/j:dq	(Ljava/lang/String;I)V
    //   1855: aload_1
    //   1856: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1859: sipush 64987
    //   1862: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   1865: aload_0
    //   1866: aload_1
    //   1867: invokespecial 1219	com/tencent/smtt/sdk/p:gw	(Landroid/content/Context;)Z
    //   1870: ifne +34 -> 1904
    //   1873: aload_1
    //   1874: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1877: sipush 65021
    //   1880: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   1883: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   1886: invokeinterface 847 1 0
    //   1891: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   1894: invokeinterface 847 1 0
    //   1899: aload_0
    //   1900: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   1903: return
    //   1904: aload_1
    //   1905: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   1908: iload 4
    //   1910: iconst_2
    //   1911: invokevirtual 528	com/tencent/smtt/sdk/j:eX	(II)V
    //   1914: ldc -84
    //   1916: ldc_w 1221
    //   1919: iconst_1
    //   1920: invokestatic 842	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   1923: ldc -84
    //   1925: new 227	java/lang/StringBuilder
    //   1928: dup
    //   1929: ldc_w 1223
    //   1932: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1935: iload_3
    //   1936: invokevirtual 394	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1939: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1942: invokestatic 180	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1945: aload_1
    //   1946: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   1949: sipush 65020
    //   1952: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   1955: getstatic 199	android/os/Build$VERSION:SDK_INT	I
    //   1958: bipush 11
    //   1960: if_icmplt +312 -> 2272
    //   1963: aload_1
    //   1964: ldc_w 1098
    //   1967: iconst_4
    //   1968: invokevirtual 1102	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1971: astore 13
    //   1973: aload 13
    //   1975: invokeinterface 1227 1 0
    //   1980: astore 13
    //   1982: aload 13
    //   1984: ldc_w 1229
    //   1987: iconst_0
    //   1988: invokeinterface 1234 3 0
    //   1993: pop
    //   1994: aload 13
    //   1996: ldc_w 1236
    //   1999: iconst_0
    //   2000: invokeinterface 1234 3 0
    //   2005: pop
    //   2006: aload 13
    //   2008: ldc_w 1238
    //   2011: iload_3
    //   2012: invokeinterface 1234 3 0
    //   2017: pop
    //   2018: aload 13
    //   2020: invokeinterface 1240 1 0
    //   2025: pop
    //   2026: aload_1
    //   2027: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   2030: sipush 65019
    //   2033: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   2036: iload_3
    //   2037: ldc_w 1142
    //   2040: if_icmpne +173 -> 2213
    //   2043: new 126	java/io/File
    //   2046: dup
    //   2047: aload_2
    //   2048: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;)V
    //   2051: invokevirtual 352	java/io/File:delete	()Z
    //   2054: pop
    //   2055: ldc -84
    //   2057: new 227	java/lang/StringBuilder
    //   2060: dup
    //   2061: ldc_w 1242
    //   2064: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2067: aload_2
    //   2068: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2071: ldc_w 1244
    //   2074: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2077: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2080: iconst_1
    //   2081: invokestatic 842	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   2084: new 126	java/io/File
    //   2087: dup
    //   2088: aload_1
    //   2089: ldc_w 283
    //   2092: iconst_0
    //   2093: invokevirtual 287	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   2096: ldc_w 312
    //   2099: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   2102: astore_2
    //   2103: aload_2
    //   2104: invokevirtual 1247	java/io/File:canRead	()Z
    //   2107: ifeq +106 -> 2213
    //   2110: new 126	java/io/File
    //   2113: dup
    //   2114: aload_2
    //   2115: ldc -125
    //   2117: invokespecial 134	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   2120: astore 13
    //   2122: new 140	java/util/Properties
    //   2125: dup
    //   2126: invokespecial 141	java/util/Properties:<init>	()V
    //   2129: astore 15
    //   2131: aconst_null
    //   2132: astore 14
    //   2134: new 143	java/io/BufferedInputStream
    //   2137: dup
    //   2138: new 145	java/io/FileInputStream
    //   2141: dup
    //   2142: aload 13
    //   2144: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   2147: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   2150: astore_2
    //   2151: aload 15
    //   2153: aload_2
    //   2154: invokevirtual 154	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   2157: new 1249	java/io/BufferedOutputStream
    //   2160: dup
    //   2161: new 1251	java/io/FileOutputStream
    //   2164: dup
    //   2165: aload 13
    //   2167: invokespecial 1252	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   2170: invokespecial 1255	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   2173: astore 13
    //   2175: aload 15
    //   2177: ldc_w 1061
    //   2180: ldc_w 1257
    //   2183: invokevirtual 1261	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   2186: pop
    //   2187: aload 15
    //   2189: aload 13
    //   2191: aconst_null
    //   2192: invokevirtual 1265	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   2195: ldc -84
    //   2197: ldc_w 1267
    //   2200: iconst_1
    //   2201: invokestatic 842	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   2204: aload 13
    //   2206: invokevirtual 1268	java/io/BufferedOutputStream:close	()V
    //   2209: aload_2
    //   2210: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   2213: aload_0
    //   2214: getfield 105	com/tencent/smtt/sdk/p:xVK	Z
    //   2217: ifeq +167 -> 2384
    //   2220: aload_1
    //   2221: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   2224: astore_2
    //   2225: aload_1
    //   2226: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   2229: ldc_w 530
    //   2232: invokevirtual 831	com/tencent/smtt/sdk/j:Ye	(Ljava/lang/String;)I
    //   2235: iconst_1
    //   2236: if_icmpne +316 -> 2552
    //   2239: sipush 221
    //   2242: istore_3
    //   2243: aload_2
    //   2244: iload_3
    //   2245: ldc_w 1270
    //   2248: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   2251: getstatic 54	com/tencent/smtt/sdk/p:xVI	Ljava/util/concurrent/locks/Lock;
    //   2254: invokeinterface 847 1 0
    //   2259: getstatic 56	com/tencent/smtt/sdk/p:xVJ	Ljava/util/concurrent/locks/Lock;
    //   2262: invokeinterface 847 1 0
    //   2267: aload_0
    //   2268: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   2271: return
    //   2272: aload_1
    //   2273: ldc_w 1098
    //   2276: iconst_0
    //   2277: invokevirtual 1102	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   2280: astore 13
    //   2282: goto -309 -> 1973
    //   2285: astore 13
    //   2287: ldc -84
    //   2289: new 227	java/lang/StringBuilder
    //   2292: dup
    //   2293: ldc_w 1272
    //   2296: invokespecial 230	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2299: aload 13
    //   2301: invokestatic 320	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   2304: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2307: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2310: invokestatic 323	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   2313: aload_1
    //   2314: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   2317: sipush 65018
    //   2320: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   2323: goto -287 -> 2036
    //   2326: astore_2
    //   2327: aconst_null
    //   2328: astore 13
    //   2330: aconst_null
    //   2331: astore_2
    //   2332: aload_2
    //   2333: ifnull +7 -> 2340
    //   2336: aload_2
    //   2337: invokevirtual 1268	java/io/BufferedOutputStream:close	()V
    //   2340: aload 13
    //   2342: ifnull -129 -> 2213
    //   2345: aload 13
    //   2347: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   2350: goto -137 -> 2213
    //   2353: astore_2
    //   2354: goto -141 -> 2213
    //   2357: astore_1
    //   2358: aconst_null
    //   2359: astore_2
    //   2360: aload 14
    //   2362: astore 13
    //   2364: aload 13
    //   2366: ifnull +8 -> 2374
    //   2369: aload 13
    //   2371: invokevirtual 1268	java/io/BufferedOutputStream:close	()V
    //   2374: aload_2
    //   2375: ifnull +7 -> 2382
    //   2378: aload_2
    //   2379: invokevirtual 157	java/io/BufferedInputStream:close	()V
    //   2382: aload_1
    //   2383: athrow
    //   2384: aload_1
    //   2385: invokestatic 251	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   2388: astore_2
    //   2389: aload_1
    //   2390: invokestatic 524	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   2393: ldc_w 530
    //   2396: invokevirtual 831	com/tencent/smtt/sdk/j:Ye	(Ljava/lang/String;)I
    //   2399: iconst_1
    //   2400: if_icmpne +159 -> 2559
    //   2403: sipush 221
    //   2406: istore_3
    //   2407: aload_2
    //   2408: iload_3
    //   2409: ldc_w 1274
    //   2412: invokevirtual 256	com/tencent/smtt/sdk/r:aS	(ILjava/lang/String;)V
    //   2415: goto -164 -> 2251
    //   2418: iload 6
    //   2420: iconst_2
    //   2421: if_icmpne -170 -> 2251
    //   2424: getstatic 1278	com/tencent/smtt/sdk/QbSdk:xUb	Lcom/tencent/smtt/sdk/q;
    //   2427: sipush 200
    //   2430: invokeinterface 1283 2 0
    //   2435: goto -184 -> 2251
    //   2438: aload_1
    //   2439: invokestatic 277	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   2442: sipush 65017
    //   2445: invokevirtual 281	com/tencent/smtt/sdk/k:Fg	(I)V
    //   2448: aload_0
    //   2449: invokevirtual 850	com/tencent/smtt/sdk/p:cox	()V
    //   2452: return
    //   2453: astore 13
    //   2455: goto -246 -> 2209
    //   2458: astore_2
    //   2459: goto -246 -> 2213
    //   2462: astore_2
    //   2463: goto -123 -> 2340
    //   2466: astore 13
    //   2468: goto -94 -> 2374
    //   2471: astore_2
    //   2472: goto -90 -> 2382
    //   2475: astore_1
    //   2476: aload 14
    //   2478: astore 13
    //   2480: goto -116 -> 2364
    //   2483: astore_1
    //   2484: goto -120 -> 2364
    //   2487: astore 13
    //   2489: aconst_null
    //   2490: astore 14
    //   2492: aload_2
    //   2493: astore 13
    //   2495: aload 14
    //   2497: astore_2
    //   2498: goto -166 -> 2332
    //   2501: astore 14
    //   2503: aload_2
    //   2504: astore 14
    //   2506: aload 13
    //   2508: astore_2
    //   2509: aload 14
    //   2511: astore 13
    //   2513: goto -181 -> 2332
    //   2516: iconst_0
    //   2517: istore 12
    //   2519: goto -1191 -> 1328
    //   2522: iload 4
    //   2524: ifle -2022 -> 502
    //   2527: iload_3
    //   2528: iload 4
    //   2530: if_icmple -2028 -> 502
    //   2533: goto -2035 -> 498
    //   2536: iconst_0
    //   2537: istore 7
    //   2539: iload 4
    //   2541: istore 6
    //   2543: goto -1949 -> 594
    //   2546: iconst_0
    //   2547: istore 4
    //   2549: goto -1122 -> 1427
    //   2552: sipush 200
    //   2555: istore_3
    //   2556: goto -313 -> 2243
    //   2559: sipush 200
    //   2562: istore_3
    //   2563: goto -156 -> 2407
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2566	0	this	p
    //   0	2566	1	paramContext	Context
    //   0	2566	2	paramString	String
    //   0	2566	3	paramInt	int
    //   402	2146	4	i	int
    //   414	1438	5	j	int
    //   519	2023	6	k	int
    //   588	1950	7	m	int
    //   256	39	8	l1	long
    //   265	41	10	l2	long
    //   344	2174	12	bool	boolean
    //   177	2104	13	localObject1	Object
    //   2285	15	13	localThrowable1	Throwable
    //   2328	42	13	localObject2	Object
    //   2453	1	13	localIOException1	java.io.IOException
    //   2466	1	13	localIOException2	java.io.IOException
    //   2478	1	13	localObject3	Object
    //   2487	1	13	localThrowable2	Throwable
    //   2493	19	13	localObject4	Object
    //   809	1687	14	localObject5	Object
    //   2501	1	14	localThrowable3	Throwable
    //   2504	6	14	str	String
    //   2129	59	15	localProperties	java.util.Properties
    // Exception table:
    //   from	to	target	type
    //   392	484	1471	finally
    //   498	502	1471	finally
    //   502	567	1471	finally
    //   578	587	1471	finally
    //   594	627	1471	finally
    //   635	654	1471	finally
    //   659	671	1471	finally
    //   678	705	1471	finally
    //   765	778	1471	finally
    //   781	795	1471	finally
    //   799	811	1471	finally
    //   820	843	1471	finally
    //   867	902	1471	finally
    //   907	914	1471	finally
    //   919	942	1471	finally
    //   969	1054	1471	finally
    //   1075	1105	1471	finally
    //   1131	1143	1471	finally
    //   1149	1227	1471	finally
    //   1248	1262	1471	finally
    //   1262	1305	1471	finally
    //   1310	1328	1471	finally
    //   1333	1387	1471	finally
    //   1387	1398	1471	finally
    //   1403	1424	1471	finally
    //   1453	1468	1471	finally
    //   1494	1513	1471	finally
    //   1516	1524	1471	finally
    //   1527	1548	1471	finally
    //   1554	1562	1471	finally
    //   1568	1620	1471	finally
    //   1623	1641	1471	finally
    //   1656	1668	1471	finally
    //   1675	1702	1471	finally
    //   1727	1747	1471	finally
    //   1751	1763	1471	finally
    //   1772	1795	1471	finally
    //   1819	1834	1471	finally
    //   1841	1855	1471	finally
    //   1855	1883	1471	finally
    //   1904	1973	1471	finally
    //   1973	2036	1471	finally
    //   2043	2131	1471	finally
    //   2204	2209	1471	finally
    //   2209	2213	1471	finally
    //   2213	2239	1471	finally
    //   2243	2251	1471	finally
    //   2272	2282	1471	finally
    //   2287	2323	1471	finally
    //   2336	2340	1471	finally
    //   2345	2350	1471	finally
    //   2369	2374	1471	finally
    //   2378	2382	1471	finally
    //   2382	2384	1471	finally
    //   2384	2403	1471	finally
    //   2407	2415	1471	finally
    //   2424	2435	1471	finally
    //   1973	2036	2285	java/lang/Throwable
    //   2134	2151	2326	java/lang/Throwable
    //   2345	2350	2353	java/io/IOException
    //   2134	2151	2357	finally
    //   2204	2209	2453	java/io/IOException
    //   2209	2213	2458	java/io/IOException
    //   2336	2340	2462	java/io/IOException
    //   2369	2374	2466	java/io/IOException
    //   2378	2382	2471	java/io/IOException
    //   2151	2175	2475	finally
    //   2175	2204	2483	finally
    //   2151	2175	2487	java/lang/Throwable
    //   2175	2204	2501	java/lang/Throwable
  }
  
  final void u(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.xVK = true;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessId=" + android.os.Process.myPid());
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentThreadName=" + Thread.currentThread().getName());
    if (!gQ(paramContext)) {
      return;
    }
    if (xVI.tryLock()) {}
    for (;;)
    {
      try
      {
        m = j.gk(paramContext).Ye("install_status");
        k = j.gk(paramContext).Yf("install_core_ver");
        str = j.gk(paramContext).getStringValue("install_apk_path");
        i = j.gk(paramContext).Yf("copy_core_ver");
        j = j.gk(paramContext).Ye("copy_status");
        xVI.unlock();
        cox();
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore installStatus=" + m);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreInstallVer=" + k);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsApkPath=" + str);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreCopyVer=" + i);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore copyStatus=" + j);
        if (!t.gU(paramContext)) {
          break label383;
        }
        i = t.coL();
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreForThirdPartyApp");
        if (i <= 0) {
          break;
        }
        j = gC(paramContext);
        if (j == i) {
          break;
        }
        if (t.coF() != null)
        {
          TbsLog.i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp hostContext != null");
          a(paramContext, null);
          return;
        }
      }
      finally
      {
        xVI.unlock();
      }
      if (j > 0) {
        break;
      }
      TbsLog.i("TbsInstaller", "TbsInstaller--installTbsCoreForThirdPartyApp hostContext == null");
      QbSdk.by(paramContext, "TbsInstaller::installTbsCoreForThirdPartyApp forceSysWebViewInner #2");
      return;
      label383:
      int i1 = k.gl(paramContext).xVi.getInt("tbs_responsecode", 0);
      if ((i1 == 1) || (i1 == 2) || (i1 == 4)) {}
      for (int n = 1;; n = 0)
      {
        if ((n == 0) && (i1 != 0))
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("operation", 10001);
          if (paramContext != null)
          {
            Message localMessage = new Message();
            localMessage.what = 3;
            localMessage.obj = new Object[] { paramContext, localBundle };
            xVM.sendMessage(localMessage);
          }
        }
        if ((m >= 0) && (m < 2)) {
          q(paramContext, str, k);
        }
        if (j != 0) {
          break;
        }
        al(paramContext, i);
        return;
      }
      int j = -1;
      String str = null;
      int k = 0;
      int m = -1;
      int i = 0;
    }
  }
  
  final void v(Context paramContext, boolean paramBoolean)
  {
    if (QbSdk.xTI) {}
    do
    {
      return;
      if (Build.VERSION.SDK_INT < 8)
      {
        TbsLog.e("TbsInstaller", "android version < 2.1 no need install X5 core", true);
        return;
      }
      try
      {
        if (!t.gU(paramContext))
        {
          File localFile = gO(paramContext);
          if ((localFile != null) && (localFile.exists()))
          {
            f.c(localFile, false);
            new File(gM(paramContext), "x5.tbs").delete();
          }
        }
      }
      catch (Throwable localThrowable)
      {
        for (;;) {}
      }
    } while (!gu(paramContext));
    if ((bA(paramContext, "core_unzip_tmp")) && (t(paramContext, paramBoolean)))
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromUnzip!!", true);
      return;
    }
    if (bA(paramContext, "core_share_backup_tmp")) {
      cow();
    }
    if ((bA(paramContext, "core_copy_tmp")) && (s(paramContext, paramBoolean)))
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromCopy!!", true);
      return;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, error !!", true);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */