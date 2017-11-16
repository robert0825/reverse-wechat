package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.bt.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.lang.ref.WeakReference;

public final class h
{
  private static WeakReference<TextPaint> fLJ;
  private static int fLK;
  private static int fLL;
  public String fLH;
  public String fLI;
  public String mTitle;
  
  static
  {
    GMTrace.i(527744106496L, 3932);
    fLK = 0;
    fLL = 0;
    GMTrace.o(527744106496L, 3932);
  }
  
  public h()
  {
    GMTrace.i(525193969664L, 3913);
    this.fLH = "";
    this.mTitle = "";
    this.fLI = "";
    GMTrace.o(525193969664L, 3913);
  }
  
  public static String a(int paramInt1, String paramString1, String paramString2, int paramInt2, Context paramContext)
  {
    GMTrace.i(525865058304L, 3918);
    paramString1 = bg.nl(a(null, paramInt1, paramString1, paramString2, paramInt2, paramContext, new PString(), new PString(), new PInt(), false, false));
    GMTrace.o(525865058304L, 3918);
    return paramString1;
  }
  
  private static String a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, PString paramPString1, PString paramPString2)
  {
    GMTrace.i(526133493760L, 3920);
    String str3 = "";
    String str2;
    String str1;
    int i;
    if ((s.fI(paramString1)) || (s.fK(paramString1)))
    {
      str2 = str3;
      str1 = paramString2;
      if (paramString2 != null)
      {
        i = paramString2.indexOf(":");
        str2 = str3;
        str1 = paramString2;
        if (i >= 0)
        {
          str2 = str3;
          str1 = paramString2;
          if (i < paramString2.length())
          {
            paramString1 = paramString2.substring(0, i);
            if (!x.To(paramString1))
            {
              str2 = str3;
              str1 = paramString2;
              if (!x.Tq(paramString1)) {}
            }
            else
            {
              str2 = r.fs(paramString1);
              paramPString2.value = paramString1;
              str1 = paramString2.substring(i + 1);
            }
          }
        }
      }
      if (bg.nl(str2).length() > 0) {
        break label325;
      }
      if (paramString3 != null) {
        break label318;
      }
    }
    for (;;)
    {
      paramPString1.value = str1;
      paramContext = paramPString1.value;
      GMTrace.o(526133493760L, 3920);
      return paramContext;
      if (!x.To(paramString1))
      {
        str2 = str3;
        str1 = paramString2;
        if (!x.Tq(paramString1)) {
          break;
        }
      }
      r.fs(paramString1);
      paramPString2.value = paramString1;
      if (paramInt == 1)
      {
        paramContext = new StringBuilder().append(paramContext.getString(R.l.dwZ, new Object[] { "" }));
        if (paramString3 == null) {}
        for (;;)
        {
          paramPString1.value = paramString2;
          paramPString2.value = "";
          paramContext = paramPString1.value;
          GMTrace.o(526133493760L, 3920);
          return paramContext;
          paramString2 = paramString3;
        }
      }
      if (paramString3 == null) {}
      for (;;)
      {
        paramPString1.value = paramString2;
        paramPString2.value = "";
        paramContext = paramPString1.value;
        GMTrace.o(526133493760L, 3920);
        return paramContext;
        paramString2 = paramString3;
      }
      label318:
      str1 = paramString3;
    }
    label325:
    paramString1 = new StringBuilder();
    if (paramInt == 1)
    {
      i = R.l.dwZ;
      paramString2 = paramString1.append(paramContext.getString(i));
      if (paramString3 != null) {
        break label445;
      }
      paramString1 = str1;
      label362:
      paramPString1.value = paramString1;
      paramString1 = new StringBuilder();
      if (paramInt != 1) {
        break label451;
      }
      paramInt = R.l.dwZ;
      label392:
      paramContext = paramString1.append(paramContext.getString(paramInt, new Object[] { str2 }));
      if (paramString3 != null) {
        break label458;
      }
    }
    for (;;)
    {
      paramContext = str1;
      GMTrace.o(526133493760L, 3920);
      return paramContext;
      i = R.l.dxj;
      break;
      label445:
      paramString1 = paramString3;
      break label362;
      label451:
      paramInt = R.l.dxj;
      break label392;
      label458:
      str1 = paramString3;
    }
  }
  
  public static String a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    GMTrace.i(527475671040L, 3930);
    if (paramBoolean)
    {
      String str = b.bRv().SZ(paramString);
      paramString = str;
      if (paramInt3 > 1) {
        paramString = paramContext.getResources().getQuantityString(R.j.cIx, paramInt3, new Object[] { Integer.valueOf(paramInt3) }) + str;
      }
      GMTrace.o(527475671040L, 3930);
      return paramString;
    }
    paramContext = paramContext.getResources().getQuantityString(R.j.cIy, paramInt1, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(527475671040L, 3930);
    return paramContext;
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(16432410656768L, 122431);
    paramContext = a(0, paramString2, paramString1, paramInt, paramContext);
    paramContext = com.tencent.mm.pluginsdk.ui.d.h.Pz(b.bRv().SZ(paramContext));
    GMTrace.o(16432410656768L, 122431);
    return paramContext;
  }
  
  /* Error */
  private static String a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, Context paramContext, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: ldc2_w 188
    //   3: sipush 3919
    //   6: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload 5
    //   11: ifnull +80 -> 91
    //   14: iconst_1
    //   15: istore 14
    //   17: ldc -65
    //   19: iload 14
    //   21: invokestatic 197	junit/framework/Assert:assertTrue	(Ljava/lang/String;Z)V
    //   24: aload_2
    //   25: ifnull +72 -> 97
    //   28: aload_2
    //   29: invokevirtual 88	java/lang/String:length	()I
    //   32: ifle +65 -> 97
    //   35: iconst_1
    //   36: istore 14
    //   38: ldc -57
    //   40: iload 14
    //   42: invokestatic 197	junit/framework/Assert:assertTrue	(Ljava/lang/String;Z)V
    //   45: iload 9
    //   47: ifne +117 -> 164
    //   50: aload_2
    //   51: invokestatic 73	com/tencent/mm/y/s:fI	(Ljava/lang/String;)Z
    //   54: ifeq +49 -> 103
    //   57: invokestatic 205	com/tencent/mm/y/q:zW	()Z
    //   60: ifne +43 -> 103
    //   63: iconst_1
    //   64: istore 11
    //   66: iload 11
    //   68: ifeq +96 -> 164
    //   71: aload 5
    //   73: getstatic 208	com/tencent/mm/R$l:dZT	I
    //   76: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   79: astore_0
    //   80: ldc2_w 188
    //   83: sipush 3919
    //   86: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   89: aload_0
    //   90: areturn
    //   91: iconst_0
    //   92: istore 14
    //   94: goto -77 -> 17
    //   97: iconst_0
    //   98: istore 14
    //   100: goto -62 -> 38
    //   103: aload_2
    //   104: invokestatic 76	com/tencent/mm/y/s:fK	(Ljava/lang/String;)Z
    //   107: ifeq +32 -> 139
    //   110: invokestatic 211	com/tencent/mm/y/q:zI	()I
    //   113: bipush 64
    //   115: iand
    //   116: ifeq +17 -> 133
    //   119: iconst_1
    //   120: istore 11
    //   122: iload 11
    //   124: ifne +15 -> 139
    //   127: iconst_1
    //   128: istore 11
    //   130: goto -64 -> 66
    //   133: iconst_0
    //   134: istore 11
    //   136: goto -14 -> 122
    //   139: aload_2
    //   140: invokestatic 214	com/tencent/mm/y/s:fO	(Ljava/lang/String;)Z
    //   143: ifeq +15 -> 158
    //   146: invokestatic 217	com/tencent/mm/y/q:zZ	()Z
    //   149: ifne +9 -> 158
    //   152: iconst_1
    //   153: istore 11
    //   155: goto -89 -> 66
    //   158: iconst_0
    //   159: istore 11
    //   161: goto -95 -> 66
    //   164: aload_2
    //   165: invokestatic 214	com/tencent/mm/y/s:fO	(Ljava/lang/String;)Z
    //   168: ifeq +170 -> 338
    //   171: iload 9
    //   173: ifeq +15 -> 188
    //   176: ldc2_w 188
    //   179: sipush 3919
    //   182: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   185: ldc 39
    //   187: areturn
    //   188: invokestatic 217	com/tencent/mm/y/q:zZ	()Z
    //   191: istore 9
    //   193: invokestatic 223	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   196: pop
    //   197: invokestatic 229	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   200: ldc -26
    //   202: aconst_null
    //   203: invokevirtual 236	com/tencent/mm/storage/t:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   206: checkcast 238	java/lang/Long
    //   209: lconst_0
    //   210: invokestatic 241	com/tencent/mm/sdk/platformtools/bg:a	(Ljava/lang/Long;J)J
    //   213: lstore 15
    //   215: iload 9
    //   217: ifne +23 -> 240
    //   220: aload 5
    //   222: getstatic 208	com/tencent/mm/R$l:dZT	I
    //   225: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   228: astore_0
    //   229: ldc2_w 188
    //   232: sipush 3919
    //   235: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   238: aload_0
    //   239: areturn
    //   240: lload 15
    //   242: lconst_0
    //   243: lcmp
    //   244: ifne +23 -> 267
    //   247: aload 5
    //   249: getstatic 244	com/tencent/mm/R$l:dwX	I
    //   252: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   255: astore_0
    //   256: ldc2_w 188
    //   259: sipush 3919
    //   262: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   265: aload_0
    //   266: areturn
    //   267: lload 15
    //   269: invokestatic 248	com/tencent/mm/sdk/platformtools/bg:aG	(J)J
    //   272: ldc2_w 249
    //   275: lmul
    //   276: ldc2_w 251
    //   279: lcmp
    //   280: ifle +46 -> 326
    //   283: aload 5
    //   285: getstatic 255	com/tencent/mm/R$l:dwW	I
    //   288: iconst_1
    //   289: anewarray 4	java/lang/Object
    //   292: dup
    //   293: iconst_0
    //   294: lload 15
    //   296: invokestatic 248	com/tencent/mm/sdk/platformtools/bg:aG	(J)J
    //   299: ldc2_w 249
    //   302: lmul
    //   303: ldc2_w 256
    //   306: ldiv
    //   307: invokestatic 260	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   310: aastore
    //   311: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   314: astore_0
    //   315: ldc2_w 188
    //   318: sipush 3919
    //   321: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   324: aload_0
    //   325: areturn
    //   326: ldc2_w 188
    //   329: sipush 3919
    //   332: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   335: ldc 39
    //   337: areturn
    //   338: aload_3
    //   339: ifnull +7029 -> 7368
    //   342: iload 9
    //   344: ifeq +7024 -> 7368
    //   347: aload_3
    //   348: invokestatic 263	com/tencent/mm/booter/notification/a/h:dE	(Ljava/lang/String;)Ljava/lang/String;
    //   351: astore_3
    //   352: iconst_1
    //   353: istore 13
    //   355: aload 6
    //   357: aload_3
    //   358: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   361: iload_1
    //   362: ifne +6992 -> 7354
    //   365: aload_2
    //   366: invokestatic 266	com/tencent/mm/y/s:eb	(Ljava/lang/String;)Z
    //   369: ifeq +6985 -> 7354
    //   372: aload_3
    //   373: invokestatic 271	com/tencent/mm/y/bc:gO	(Ljava/lang/String;)I
    //   376: istore 11
    //   378: iload 11
    //   380: ifle +6974 -> 7354
    //   383: aload_3
    //   384: iconst_0
    //   385: iload 11
    //   387: invokevirtual 92	java/lang/String:substring	(II)Ljava/lang/String;
    //   390: invokevirtual 274	java/lang/String:trim	()Ljava/lang/String;
    //   393: astore 18
    //   395: aload 18
    //   397: aload_2
    //   398: invokestatic 278	com/tencent/mm/y/r:F	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   401: astore 19
    //   403: new 113	java/lang/StringBuilder
    //   406: dup
    //   407: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   410: aload_3
    //   411: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   414: ldc_w 280
    //   417: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   423: iload 11
    //   425: iconst_1
    //   426: iadd
    //   427: invokevirtual 111	java/lang/String:substring	(I)Ljava/lang/String;
    //   430: astore 20
    //   432: iconst_0
    //   433: istore 11
    //   435: aload_2
    //   436: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   439: ifne +10 -> 449
    //   442: aload_2
    //   443: invokestatic 286	com/tencent/mm/y/s:gl	(Ljava/lang/String;)Z
    //   446: ifeq +485 -> 931
    //   449: aload_3
    //   450: ldc 78
    //   452: invokevirtual 84	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   455: istore 11
    //   457: aload_3
    //   458: astore 17
    //   460: iload 11
    //   462: iconst_m1
    //   463: if_icmpeq +25 -> 488
    //   466: aload 7
    //   468: aload_3
    //   469: iconst_0
    //   470: iload 11
    //   472: invokevirtual 92	java/lang/String:substring	(II)Ljava/lang/String;
    //   475: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   478: aload_3
    //   479: iload 11
    //   481: iconst_1
    //   482: iadd
    //   483: invokevirtual 111	java/lang/String:substring	(I)Ljava/lang/String;
    //   486: astore 17
    //   488: iconst_0
    //   489: istore 12
    //   491: aload 17
    //   493: astore_3
    //   494: iload 4
    //   496: lookupswitch	default:+388->884, -1879048191:+1097->1593, -1879048190:+1097->1593, -1879048189:+1097->1593, -1879048188:+1203->1699, -1879048186:+3229->3725, -1879048185:+3386->3882, -1879048183:+3386->3882, -1879048176:+3386->3882, 3:+515->1011, 11:+718->1214, 13:+685->1181, 23:+515->1011, 33:+515->1011, 34:+744->1240, 35:+1563->2059, 36:+718->1214, 37:+1224->1720, 39:+685->1181, 40:+1480->1976, 42:+1634->2130, 43:+910->1406, 47:+597->1093, 48:+1890->2386, 49:+3487->3983, 50:+1118->1614, 52:+1182->1678, 53:+1118->1614, 55:+5788->6284, 57:+5788->6284, 62:+910->1406, 1048625:+597->1093, 12299999:+1076->1572, 16777265:+3487->3983, 268435505:+3487->3983, 285212721:+5698->6194, 318767153:+5747->6243, 335544369:+2013->2509, 369098801:+2659->3155, 402653233:+2130->2626, 419430449:+2214->2710, 436207665:+2436->2932, 452984881:+2808->3304, 469762097:+2436->2932, 486539313:+5698->6194, 503316529:+5814->6310, 520093745:+3021->3517, 553648177:+3487->3983
    //   884: aload_3
    //   885: astore_0
    //   886: aconst_null
    //   887: astore 17
    //   889: iconst_0
    //   890: istore 11
    //   892: ldc 39
    //   894: astore_3
    //   895: aload_2
    //   896: invokestatic 289	com/tencent/mm/y/s:fJ	(Ljava/lang/String;)Z
    //   899: ifeq +5844 -> 6743
    //   902: iconst_1
    //   903: iload_1
    //   904: if_icmpne +5545 -> 6449
    //   907: aload_3
    //   908: invokestatic 292	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   911: ifne +5483 -> 6394
    //   914: aload 6
    //   916: aload_3
    //   917: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   920: ldc2_w 188
    //   923: sipush 3919
    //   926: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   929: aload_3
    //   930: areturn
    //   931: invokestatic 223	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   934: pop
    //   935: invokestatic 296	com/tencent/mm/y/c:yP	()Lcom/tencent/mm/storage/as;
    //   938: aload_2
    //   939: invokeinterface 302 2 0
    //   944: astore 17
    //   946: aload 17
    //   948: ifnull +14 -> 962
    //   951: aload 17
    //   953: ldc_w 303
    //   956: invokevirtual 309	com/tencent/mm/storage/ae:eH	(I)Z
    //   959: ifne +8 -> 967
    //   962: iload 10
    //   964: ifeq +6383 -> 7347
    //   967: iconst_1
    //   968: istore 11
    //   970: aload_3
    //   971: ldc 78
    //   973: invokevirtual 84	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   976: istore 12
    //   978: iload 12
    //   980: iconst_m1
    //   981: if_icmpeq +6366 -> 7347
    //   984: aload 7
    //   986: aload_3
    //   987: iconst_0
    //   988: iload 12
    //   990: invokevirtual 92	java/lang/String:substring	(II)Ljava/lang/String;
    //   993: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   996: aload_3
    //   997: iload 12
    //   999: iconst_1
    //   1000: iadd
    //   1001: invokevirtual 111	java/lang/String:substring	(I)Ljava/lang/String;
    //   1004: astore_3
    //   1005: iconst_1
    //   1006: istore 12
    //   1008: goto -514 -> 494
    //   1011: aload 5
    //   1013: getstatic 312	com/tencent/mm/R$l:cUb	I
    //   1016: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1019: astore 20
    //   1021: aload 18
    //   1023: invokevirtual 88	java/lang/String:length	()I
    //   1026: ifle +55 -> 1081
    //   1029: new 113	java/lang/StringBuilder
    //   1032: dup
    //   1033: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   1036: aload 18
    //   1038: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1041: ldc_w 314
    //   1044: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1047: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1050: astore_0
    //   1051: aload 18
    //   1053: invokevirtual 88	java/lang/String:length	()I
    //   1056: ifle +31 -> 1087
    //   1059: ldc_w 316
    //   1062: astore_3
    //   1063: aload 6
    //   1065: aload_3
    //   1066: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   1069: iconst_0
    //   1070: istore 11
    //   1072: aconst_null
    //   1073: astore 17
    //   1075: aload 20
    //   1077: astore_3
    //   1078: goto -183 -> 895
    //   1081: ldc 39
    //   1083: astore_0
    //   1084: goto -33 -> 1051
    //   1087: ldc 39
    //   1089: astore_3
    //   1090: goto -27 -> 1063
    //   1093: aload_3
    //   1094: invokestatic 322	com/tencent/mm/storage/aj:Uf	(Ljava/lang/String;)Lcom/tencent/mm/storage/aj;
    //   1097: astore 20
    //   1099: new 113	java/lang/StringBuilder
    //   1102: dup
    //   1103: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   1106: aload 20
    //   1108: getfield 325	com/tencent/mm/storage/aj:hcn	Ljava/lang/String;
    //   1111: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1114: ldc_w 314
    //   1117: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1120: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1123: astore 17
    //   1125: aload_0
    //   1126: ifnull +43 -> 1169
    //   1129: aload_0
    //   1130: invokevirtual 88	java/lang/String:length	()I
    //   1133: bipush 32
    //   1135: if_icmpne +34 -> 1169
    //   1138: aload_0
    //   1139: astore_3
    //   1140: aload 6
    //   1142: ldc 39
    //   1144: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   1147: aload 7
    //   1149: aload 20
    //   1151: getfield 325	com/tencent/mm/storage/aj:hcn	Ljava/lang/String;
    //   1154: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   1157: iconst_0
    //   1158: istore 11
    //   1160: aload 17
    //   1162: astore_0
    //   1163: aconst_null
    //   1164: astore 17
    //   1166: goto -271 -> 895
    //   1169: aload 5
    //   1171: getstatic 328	com/tencent/mm/R$l:cSD	I
    //   1174: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1177: astore_3
    //   1178: goto -38 -> 1140
    //   1181: aload 5
    //   1183: iload_1
    //   1184: aload_2
    //   1185: aload_3
    //   1186: aload 5
    //   1188: getstatic 312	com/tencent/mm/R$l:cUb	I
    //   1191: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1194: aload 6
    //   1196: aload 7
    //   1198: invokestatic 330	com/tencent/mm/booter/notification/a/h:a	(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pointers/PString;Lcom/tencent/mm/pointers/PString;)Ljava/lang/String;
    //   1201: astore_0
    //   1202: iconst_0
    //   1203: istore 11
    //   1205: ldc 39
    //   1207: astore_3
    //   1208: aconst_null
    //   1209: astore 17
    //   1211: goto -316 -> 895
    //   1214: aload 5
    //   1216: iload_1
    //   1217: aload_2
    //   1218: aload_3
    //   1219: aconst_null
    //   1220: aload 6
    //   1222: aload 7
    //   1224: invokestatic 330	com/tencent/mm/booter/notification/a/h:a	(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pointers/PString;Lcom/tencent/mm/pointers/PString;)Ljava/lang/String;
    //   1227: astore_0
    //   1228: iconst_0
    //   1229: istore 11
    //   1231: ldc 39
    //   1233: astore_3
    //   1234: aconst_null
    //   1235: astore 17
    //   1237: goto -342 -> 895
    //   1240: aload_2
    //   1241: invokestatic 97	com/tencent/mm/storage/x:To	(Ljava/lang/String;)Z
    //   1244: ifne +24 -> 1268
    //   1247: aload_2
    //   1248: invokestatic 100	com/tencent/mm/storage/x:Tq	(Ljava/lang/String;)Z
    //   1251: ifne +17 -> 1268
    //   1254: aload_2
    //   1255: invokestatic 73	com/tencent/mm/y/s:fI	(Ljava/lang/String;)Z
    //   1258: ifne +10 -> 1268
    //   1261: aload_2
    //   1262: invokestatic 76	com/tencent/mm/y/s:fK	(Ljava/lang/String;)Z
    //   1265: ifeq +36 -> 1301
    //   1268: aload 5
    //   1270: iload_1
    //   1271: aload_2
    //   1272: aload_3
    //   1273: aload 5
    //   1275: getstatic 333	com/tencent/mm/R$l:cUQ	I
    //   1278: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1281: aload 6
    //   1283: aload 7
    //   1285: invokestatic 330	com/tencent/mm/booter/notification/a/h:a	(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pointers/PString;Lcom/tencent/mm/pointers/PString;)Ljava/lang/String;
    //   1288: astore_0
    //   1289: iconst_0
    //   1290: istore 11
    //   1292: ldc 39
    //   1294: astore_3
    //   1295: aconst_null
    //   1296: astore 17
    //   1298: goto -403 -> 895
    //   1301: aload_3
    //   1302: astore_0
    //   1303: aload_3
    //   1304: ifnull +78 -> 1382
    //   1307: aload_3
    //   1308: astore_0
    //   1309: aload_3
    //   1310: invokevirtual 88	java/lang/String:length	()I
    //   1313: ifle +69 -> 1382
    //   1316: aload_3
    //   1317: astore_0
    //   1318: aload_2
    //   1319: invokestatic 289	com/tencent/mm/y/s:fJ	(Ljava/lang/String;)Z
    //   1322: ifne +60 -> 1382
    //   1325: aload_2
    //   1326: invokestatic 266	com/tencent/mm/y/s:eb	(Ljava/lang/String;)Z
    //   1329: ifeq +71 -> 1400
    //   1332: new 335	com/tencent/mm/modelvoice/n
    //   1335: dup
    //   1336: aload_3
    //   1337: invokespecial 338	com/tencent/mm/modelvoice/n:<init>	(Ljava/lang/String;)V
    //   1340: astore_3
    //   1341: new 113	java/lang/StringBuilder
    //   1344: dup
    //   1345: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   1348: aload_3
    //   1349: getfield 339	com/tencent/mm/modelvoice/n:hcn	Ljava/lang/String;
    //   1352: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1355: ldc_w 314
    //   1358: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1361: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1364: astore_0
    //   1365: aload 6
    //   1367: ldc_w 341
    //   1370: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   1373: aload 7
    //   1375: aload_3
    //   1376: getfield 339	com/tencent/mm/modelvoice/n:hcn	Ljava/lang/String;
    //   1379: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   1382: aload 5
    //   1384: getstatic 333	com/tencent/mm/R$l:cUQ	I
    //   1387: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1390: astore_3
    //   1391: iconst_0
    //   1392: istore 11
    //   1394: aconst_null
    //   1395: astore 17
    //   1397: goto -502 -> 895
    //   1400: ldc 39
    //   1402: astore_0
    //   1403: goto -21 -> 1382
    //   1406: aload_2
    //   1407: invokestatic 97	com/tencent/mm/storage/x:To	(Ljava/lang/String;)Z
    //   1410: ifne +24 -> 1434
    //   1413: aload_2
    //   1414: invokestatic 100	com/tencent/mm/storage/x:Tq	(Ljava/lang/String;)Z
    //   1417: ifne +17 -> 1434
    //   1420: aload_2
    //   1421: invokestatic 73	com/tencent/mm/y/s:fI	(Ljava/lang/String;)Z
    //   1424: ifne +10 -> 1434
    //   1427: aload_2
    //   1428: invokestatic 76	com/tencent/mm/y/s:fK	(Ljava/lang/String;)Z
    //   1431: ifeq +36 -> 1467
    //   1434: aload 5
    //   1436: iload_1
    //   1437: aload_2
    //   1438: aload_3
    //   1439: aload 5
    //   1441: getstatic 344	com/tencent/mm/R$l:cUP	I
    //   1444: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1447: aload 6
    //   1449: aload 7
    //   1451: invokestatic 330	com/tencent/mm/booter/notification/a/h:a	(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pointers/PString;Lcom/tencent/mm/pointers/PString;)Ljava/lang/String;
    //   1454: astore_0
    //   1455: iconst_0
    //   1456: istore 11
    //   1458: ldc 39
    //   1460: astore_3
    //   1461: aconst_null
    //   1462: astore 17
    //   1464: goto -569 -> 895
    //   1467: aload_3
    //   1468: astore_0
    //   1469: aload_3
    //   1470: ifnull +78 -> 1548
    //   1473: aload_3
    //   1474: astore_0
    //   1475: aload_3
    //   1476: invokevirtual 88	java/lang/String:length	()I
    //   1479: ifle +69 -> 1548
    //   1482: aload_3
    //   1483: astore_0
    //   1484: aload_2
    //   1485: invokestatic 289	com/tencent/mm/y/s:fJ	(Ljava/lang/String;)Z
    //   1488: ifne +60 -> 1548
    //   1491: aload_2
    //   1492: invokestatic 266	com/tencent/mm/y/s:eb	(Ljava/lang/String;)Z
    //   1495: ifeq +71 -> 1566
    //   1498: new 346	com/tencent/mm/modelvideo/p
    //   1501: dup
    //   1502: aload_3
    //   1503: invokespecial 347	com/tencent/mm/modelvideo/p:<init>	(Ljava/lang/String;)V
    //   1506: astore_3
    //   1507: new 113	java/lang/StringBuilder
    //   1510: dup
    //   1511: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   1514: aload_3
    //   1515: getfield 348	com/tencent/mm/modelvideo/p:hcn	Ljava/lang/String;
    //   1518: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1521: ldc_w 314
    //   1524: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1527: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1530: astore_0
    //   1531: aload 6
    //   1533: ldc_w 341
    //   1536: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   1539: aload 7
    //   1541: aload_3
    //   1542: getfield 348	com/tencent/mm/modelvideo/p:hcn	Ljava/lang/String;
    //   1545: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   1548: aload 5
    //   1550: getstatic 344	com/tencent/mm/R$l:cUP	I
    //   1553: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1556: astore_3
    //   1557: iconst_0
    //   1558: istore 11
    //   1560: aconst_null
    //   1561: astore 17
    //   1563: goto -668 -> 895
    //   1566: ldc 39
    //   1568: astore_0
    //   1569: goto -21 -> 1548
    //   1572: ldc 39
    //   1574: astore_0
    //   1575: aload 5
    //   1577: getstatic 351	com/tencent/mm/R$l:cUT	I
    //   1580: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1583: astore_3
    //   1584: iconst_0
    //   1585: istore 11
    //   1587: aconst_null
    //   1588: astore 17
    //   1590: goto -695 -> 895
    //   1593: ldc 39
    //   1595: astore_0
    //   1596: aload 5
    //   1598: getstatic 354	com/tencent/mm/R$l:cUS	I
    //   1601: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1604: astore_3
    //   1605: iconst_0
    //   1606: istore 11
    //   1608: aconst_null
    //   1609: astore 17
    //   1611: goto -716 -> 895
    //   1614: aload_3
    //   1615: getstatic 359	com/tencent/mm/storage/au:vBm	Ljava/lang/String;
    //   1618: invokevirtual 363	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1621: ifeq +24 -> 1645
    //   1624: ldc 39
    //   1626: astore_0
    //   1627: aload 5
    //   1629: getstatic 351	com/tencent/mm/R$l:cUT	I
    //   1632: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1635: astore_3
    //   1636: iconst_0
    //   1637: istore 11
    //   1639: aconst_null
    //   1640: astore 17
    //   1642: goto -747 -> 895
    //   1645: aload_3
    //   1646: astore_0
    //   1647: aload_3
    //   1648: getstatic 366	com/tencent/mm/storage/au:vBl	Ljava/lang/String;
    //   1651: invokevirtual 363	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1654: ifeq -768 -> 886
    //   1657: ldc 39
    //   1659: astore_0
    //   1660: aload 5
    //   1662: getstatic 369	com/tencent/mm/R$l:cUU	I
    //   1665: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1668: astore_3
    //   1669: iconst_0
    //   1670: istore 11
    //   1672: aconst_null
    //   1673: astore 17
    //   1675: goto -780 -> 895
    //   1678: ldc 39
    //   1680: astore_0
    //   1681: aload 5
    //   1683: getstatic 351	com/tencent/mm/R$l:cUT	I
    //   1686: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1689: astore_3
    //   1690: iconst_0
    //   1691: istore 11
    //   1693: aconst_null
    //   1694: astore 17
    //   1696: goto -801 -> 895
    //   1699: ldc 39
    //   1701: astore_0
    //   1702: aload 5
    //   1704: getstatic 369	com/tencent/mm/R$l:cUU	I
    //   1707: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   1710: astore_3
    //   1711: iconst_0
    //   1712: istore 11
    //   1714: aconst_null
    //   1715: astore 17
    //   1717: goto -822 -> 895
    //   1720: aload_3
    //   1721: astore_0
    //   1722: aload_3
    //   1723: ifnull -837 -> 886
    //   1726: aload_3
    //   1727: astore_0
    //   1728: aload_3
    //   1729: invokevirtual 88	java/lang/String:length	()I
    //   1732: ifle -846 -> 886
    //   1735: aload_3
    //   1736: invokestatic 375	com/tencent/mm/storage/au$d:Uk	(Ljava/lang/String;)Lcom/tencent/mm/storage/au$d;
    //   1739: astore 17
    //   1741: aload_3
    //   1742: astore_0
    //   1743: aload 17
    //   1745: getfield 378	com/tencent/mm/storage/au$d:rAP	Ljava/lang/String;
    //   1748: ifnull +111 -> 1859
    //   1751: aload_3
    //   1752: astore_0
    //   1753: aload 17
    //   1755: getfield 378	com/tencent/mm/storage/au$d:rAP	Ljava/lang/String;
    //   1758: invokevirtual 88	java/lang/String:length	()I
    //   1761: ifle +98 -> 1859
    //   1764: aload 17
    //   1766: getfield 381	com/tencent/mm/storage/au$d:scene	I
    //   1769: tableswitch	default:+63->1832, 18:+102->1871, 19:+63->1832, 20:+63->1832, 21:+63->1832, 22:+135->1904, 23:+135->1904, 24:+135->1904, 25:+168->1937, 26:+135->1904, 27:+135->1904, 28:+135->1904, 29:+135->1904
    //   1832: aload 5
    //   1834: getstatic 384	com/tencent/mm/R$l:dxs	I
    //   1837: iconst_1
    //   1838: anewarray 4	java/lang/Object
    //   1841: dup
    //   1842: iconst_0
    //   1843: aload 17
    //   1845: invokevirtual 387	com/tencent/mm/storage/au$d:getDisplayName	()Ljava/lang/String;
    //   1848: aastore
    //   1849: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   1852: astore_0
    //   1853: aload 6
    //   1855: aload_0
    //   1856: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   1859: aconst_null
    //   1860: astore 17
    //   1862: iconst_0
    //   1863: istore 11
    //   1865: ldc 39
    //   1867: astore_3
    //   1868: goto -973 -> 895
    //   1871: aload 5
    //   1873: getstatic 390	com/tencent/mm/R$l:dxc	I
    //   1876: iconst_1
    //   1877: anewarray 4	java/lang/Object
    //   1880: dup
    //   1881: iconst_0
    //   1882: aload 17
    //   1884: invokevirtual 387	com/tencent/mm/storage/au$d:getDisplayName	()Ljava/lang/String;
    //   1887: aastore
    //   1888: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   1891: astore_0
    //   1892: iconst_0
    //   1893: istore 11
    //   1895: ldc 39
    //   1897: astore_3
    //   1898: aconst_null
    //   1899: astore 17
    //   1901: goto -1006 -> 895
    //   1904: aload 5
    //   1906: getstatic 393	com/tencent/mm/R$l:dxm	I
    //   1909: iconst_1
    //   1910: anewarray 4	java/lang/Object
    //   1913: dup
    //   1914: iconst_0
    //   1915: aload 17
    //   1917: invokevirtual 387	com/tencent/mm/storage/au$d:getDisplayName	()Ljava/lang/String;
    //   1920: aastore
    //   1921: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   1924: astore_0
    //   1925: iconst_0
    //   1926: istore 11
    //   1928: ldc 39
    //   1930: astore_3
    //   1931: aconst_null
    //   1932: astore 17
    //   1934: goto -1039 -> 895
    //   1937: aload 5
    //   1939: getstatic 396	com/tencent/mm/R$l:dwt	I
    //   1942: iconst_1
    //   1943: anewarray 4	java/lang/Object
    //   1946: dup
    //   1947: iconst_0
    //   1948: aload 17
    //   1950: invokevirtual 387	com/tencent/mm/storage/au$d:getDisplayName	()Ljava/lang/String;
    //   1953: aastore
    //   1954: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   1957: astore_0
    //   1958: aload 6
    //   1960: aload_0
    //   1961: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   1964: iconst_0
    //   1965: istore 11
    //   1967: ldc 39
    //   1969: astore_3
    //   1970: aconst_null
    //   1971: astore 17
    //   1973: goto -1078 -> 895
    //   1976: aload_3
    //   1977: astore_0
    //   1978: aload_3
    //   1979: ifnull -1093 -> 886
    //   1982: aload_3
    //   1983: astore_0
    //   1984: aload_3
    //   1985: invokevirtual 88	java/lang/String:length	()I
    //   1988: ifle -1102 -> 886
    //   1991: aload_3
    //   1992: invokestatic 402	com/tencent/mm/storage/au$a:Uh	(Ljava/lang/String;)Lcom/tencent/mm/storage/au$a;
    //   1995: astore 17
    //   1997: aload_3
    //   1998: astore_0
    //   1999: aload 17
    //   2001: getfield 403	com/tencent/mm/storage/au$a:rAP	Ljava/lang/String;
    //   2004: ifnull +43 -> 2047
    //   2007: aload_3
    //   2008: astore_0
    //   2009: aload 17
    //   2011: getfield 403	com/tencent/mm/storage/au$a:rAP	Ljava/lang/String;
    //   2014: invokevirtual 88	java/lang/String:length	()I
    //   2017: ifle +30 -> 2047
    //   2020: aload 5
    //   2022: getstatic 406	com/tencent/mm/R$l:dwL	I
    //   2025: iconst_1
    //   2026: anewarray 4	java/lang/Object
    //   2029: dup
    //   2030: iconst_0
    //   2031: aload 17
    //   2033: invokevirtual 407	com/tencent/mm/storage/au$a:getDisplayName	()Ljava/lang/String;
    //   2036: aastore
    //   2037: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   2040: astore_0
    //   2041: aload 6
    //   2043: aload_0
    //   2044: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2047: aconst_null
    //   2048: astore 17
    //   2050: iconst_0
    //   2051: istore 11
    //   2053: ldc 39
    //   2055: astore_3
    //   2056: goto -1161 -> 895
    //   2059: aload_3
    //   2060: astore_0
    //   2061: aload_3
    //   2062: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   2065: invokevirtual 88	java/lang/String:length	()I
    //   2068: ifle -1182 -> 886
    //   2071: invokestatic 223	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   2074: pop
    //   2075: invokestatic 411	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
    //   2078: aload_3
    //   2079: invokeinterface 417 2 0
    //   2084: astore_0
    //   2085: aload 5
    //   2087: getstatic 420	com/tencent/mm/R$l:dwV	I
    //   2090: iconst_2
    //   2091: anewarray 4	java/lang/Object
    //   2094: dup
    //   2095: iconst_0
    //   2096: aload_0
    //   2097: getfield 425	com/tencent/mm/storage/au$c:gTN	Ljava/lang/String;
    //   2100: aastore
    //   2101: dup
    //   2102: iconst_1
    //   2103: aload_0
    //   2104: getfield 428	com/tencent/mm/storage/au$c:title	Ljava/lang/String;
    //   2107: aastore
    //   2108: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   2111: astore_0
    //   2112: aload 6
    //   2114: aload_0
    //   2115: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2118: iconst_0
    //   2119: istore 11
    //   2121: ldc 39
    //   2123: astore_3
    //   2124: aconst_null
    //   2125: astore 17
    //   2127: goto -1232 -> 895
    //   2130: aload_3
    //   2131: astore_0
    //   2132: aload_3
    //   2133: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   2136: invokevirtual 88	java/lang/String:length	()I
    //   2139: ifle -1253 -> 886
    //   2142: aload_2
    //   2143: invokestatic 266	com/tencent/mm/y/s:eb	(Ljava/lang/String;)Z
    //   2146: ifeq +20 -> 2166
    //   2149: aload_3
    //   2150: invokestatic 431	com/tencent/mm/y/bc:gP	(Ljava/lang/String;)Ljava/lang/String;
    //   2153: astore 17
    //   2155: aload 17
    //   2157: astore_0
    //   2158: aload 17
    //   2160: invokestatic 437	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2163: ifeq +5 -> 2168
    //   2166: aload_2
    //   2167: astore_0
    //   2168: invokestatic 223	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   2171: pop
    //   2172: invokestatic 411	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
    //   2175: aload_3
    //   2176: invokeinterface 440 2 0
    //   2181: astore 20
    //   2183: invokestatic 223	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   2186: pop
    //   2187: invokestatic 444	com/tencent/mm/y/c:yK	()Lcom/tencent/mm/storage/ar;
    //   2190: aload_0
    //   2191: invokeinterface 450 2 0
    //   2196: invokevirtual 453	com/tencent/mm/storage/x:vk	()Ljava/lang/String;
    //   2199: astore 17
    //   2201: aload 17
    //   2203: astore_3
    //   2204: aload 17
    //   2206: invokestatic 266	com/tencent/mm/y/s:eb	(Ljava/lang/String;)Z
    //   2209: ifeq +12 -> 2221
    //   2212: aload 17
    //   2214: invokestatic 459	com/tencent/mm/y/m:fl	(Ljava/lang/String;)Ljava/util/List;
    //   2217: invokestatic 463	com/tencent/mm/y/m:t	(Ljava/util/List;)Ljava/lang/String;
    //   2220: astore_3
    //   2221: iload_1
    //   2222: iconst_1
    //   2223: if_icmpne +83 -> 2306
    //   2226: aload 5
    //   2228: getstatic 466	com/tencent/mm/R$l:dwu	I
    //   2231: iconst_2
    //   2232: anewarray 4	java/lang/Object
    //   2235: dup
    //   2236: iconst_0
    //   2237: aload_3
    //   2238: aastore
    //   2239: dup
    //   2240: iconst_1
    //   2241: aload 20
    //   2243: invokevirtual 407	com/tencent/mm/storage/au$a:getDisplayName	()Ljava/lang/String;
    //   2246: aastore
    //   2247: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   2250: astore_3
    //   2251: aload 6
    //   2253: aload 5
    //   2255: getstatic 466	com/tencent/mm/R$l:dwu	I
    //   2258: iconst_2
    //   2259: anewarray 4	java/lang/Object
    //   2262: dup
    //   2263: iconst_0
    //   2264: ldc_w 468
    //   2267: aastore
    //   2268: dup
    //   2269: iconst_1
    //   2270: aload 20
    //   2272: invokevirtual 407	com/tencent/mm/storage/au$a:getDisplayName	()Ljava/lang/String;
    //   2275: aastore
    //   2276: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   2279: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2282: aload 7
    //   2284: aload_0
    //   2285: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2288: aconst_null
    //   2289: astore 17
    //   2291: iconst_0
    //   2292: istore 11
    //   2294: ldc 39
    //   2296: astore 20
    //   2298: aload_3
    //   2299: astore_0
    //   2300: aload 20
    //   2302: astore_3
    //   2303: goto -1408 -> 895
    //   2306: aload 5
    //   2308: getstatic 471	com/tencent/mm/R$l:dwv	I
    //   2311: iconst_2
    //   2312: anewarray 4	java/lang/Object
    //   2315: dup
    //   2316: iconst_0
    //   2317: aload_3
    //   2318: aastore
    //   2319: dup
    //   2320: iconst_1
    //   2321: aload 20
    //   2323: invokevirtual 407	com/tencent/mm/storage/au$a:getDisplayName	()Ljava/lang/String;
    //   2326: aastore
    //   2327: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   2330: astore_3
    //   2331: aload 6
    //   2333: aload 5
    //   2335: getstatic 471	com/tencent/mm/R$l:dwv	I
    //   2338: iconst_2
    //   2339: anewarray 4	java/lang/Object
    //   2342: dup
    //   2343: iconst_0
    //   2344: ldc_w 468
    //   2347: aastore
    //   2348: dup
    //   2349: iconst_1
    //   2350: aload 20
    //   2352: invokevirtual 407	com/tencent/mm/storage/au$a:getDisplayName	()Ljava/lang/String;
    //   2355: aastore
    //   2356: invokevirtual 125	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   2359: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2362: aload 7
    //   2364: aload_0
    //   2365: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2368: aconst_null
    //   2369: astore 17
    //   2371: iconst_0
    //   2372: istore 11
    //   2374: ldc 39
    //   2376: astore 20
    //   2378: aload_3
    //   2379: astore_0
    //   2380: aload 20
    //   2382: astore_3
    //   2383: goto -1488 -> 895
    //   2386: aload_3
    //   2387: astore_0
    //   2388: aload_3
    //   2389: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   2392: invokevirtual 88	java/lang/String:length	()I
    //   2395: ifle -1509 -> 886
    //   2398: aload_2
    //   2399: invokestatic 266	com/tencent/mm/y/s:eb	(Ljava/lang/String;)Z
    //   2402: ifeq +4940 -> 7342
    //   2405: aload_3
    //   2406: invokestatic 271	com/tencent/mm/y/bc:gO	(Ljava/lang/String;)I
    //   2409: istore 11
    //   2411: iload 11
    //   2413: iconst_m1
    //   2414: if_icmpeq +4923 -> 7337
    //   2417: aload_3
    //   2418: iconst_0
    //   2419: iload 11
    //   2421: invokevirtual 92	java/lang/String:substring	(II)Ljava/lang/String;
    //   2424: invokevirtual 274	java/lang/String:trim	()Ljava/lang/String;
    //   2427: astore_0
    //   2428: aload_3
    //   2429: invokestatic 474	com/tencent/mm/y/bc:gQ	(Ljava/lang/String;)Ljava/lang/String;
    //   2432: pop
    //   2433: iload_1
    //   2434: iconst_1
    //   2435: if_icmpne +30 -> 2465
    //   2438: aload 5
    //   2440: getstatic 477	com/tencent/mm/R$l:dGC	I
    //   2443: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2446: astore_0
    //   2447: aload 6
    //   2449: aload_0
    //   2450: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2453: iconst_0
    //   2454: istore 11
    //   2456: ldc 39
    //   2458: astore_3
    //   2459: aconst_null
    //   2460: astore 17
    //   2462: goto -1567 -> 895
    //   2465: aload 5
    //   2467: getstatic 477	com/tencent/mm/R$l:dGC	I
    //   2470: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2473: astore 17
    //   2475: aload 6
    //   2477: aload 5
    //   2479: getstatic 477	com/tencent/mm/R$l:dGC	I
    //   2482: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2485: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2488: aload 7
    //   2490: aload_0
    //   2491: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2494: iconst_0
    //   2495: istore 11
    //   2497: ldc 39
    //   2499: astore_3
    //   2500: aload 17
    //   2502: astore_0
    //   2503: aconst_null
    //   2504: astore 17
    //   2506: goto -1611 -> 895
    //   2509: aload 20
    //   2511: invokestatic 480	com/tencent/mm/sdk/platformtools/bg:Sx	(Ljava/lang/String;)Ljava/lang/String;
    //   2514: invokestatic 486	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   2517: astore_0
    //   2518: aload_0
    //   2519: getfield 489	com/tencent/mm/x/f$a:giQ	I
    //   2522: ifeq +92 -> 2614
    //   2525: aload_0
    //   2526: getfield 489	com/tencent/mm/x/f$a:giQ	I
    //   2529: iconst_1
    //   2530: if_icmpne +44 -> 2574
    //   2533: aload 5
    //   2535: getstatic 492	com/tencent/mm/R$l:dVI	I
    //   2538: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2541: astore_0
    //   2542: ldc 39
    //   2544: astore 20
    //   2546: aload 7
    //   2548: aload 18
    //   2550: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2553: aload 6
    //   2555: ldc 39
    //   2557: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2560: iconst_0
    //   2561: istore 11
    //   2563: aload_0
    //   2564: astore_3
    //   2565: aconst_null
    //   2566: astore 17
    //   2568: aload 20
    //   2570: astore_0
    //   2571: goto -1676 -> 895
    //   2574: aload_0
    //   2575: getfield 489	com/tencent/mm/x/f$a:giQ	I
    //   2578: iconst_2
    //   2579: if_icmpne +15 -> 2594
    //   2582: aload 5
    //   2584: getstatic 495	com/tencent/mm/R$l:dVK	I
    //   2587: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2590: astore_0
    //   2591: goto -49 -> 2542
    //   2594: aload_0
    //   2595: getfield 489	com/tencent/mm/x/f$a:giQ	I
    //   2598: iconst_3
    //   2599: if_icmpne +15 -> 2614
    //   2602: aload 5
    //   2604: getstatic 498	com/tencent/mm/R$l:dVJ	I
    //   2607: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2610: astore_0
    //   2611: goto -69 -> 2542
    //   2614: aload 5
    //   2616: getstatic 501	com/tencent/mm/R$l:dVL	I
    //   2619: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2622: astore_0
    //   2623: goto -81 -> 2542
    //   2626: aload 20
    //   2628: invokestatic 480	com/tencent/mm/sdk/platformtools/bg:Sx	(Ljava/lang/String;)Ljava/lang/String;
    //   2631: astore 17
    //   2633: ldc 39
    //   2635: astore_3
    //   2636: ldc 39
    //   2638: astore_0
    //   2639: aload 17
    //   2641: invokestatic 486	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   2644: astore 17
    //   2646: aload 17
    //   2648: ifnull +46 -> 2694
    //   2651: aload 6
    //   2653: new 113	java/lang/StringBuilder
    //   2656: dup
    //   2657: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   2660: aload 5
    //   2662: getstatic 504	com/tencent/mm/R$l:dVT	I
    //   2665: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2668: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2671: aload 17
    //   2673: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   2676: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   2679: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2682: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2685: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2688: aload 6
    //   2690: getfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2693: astore_0
    //   2694: aload 7
    //   2696: aload 18
    //   2698: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2701: iconst_0
    //   2702: istore 11
    //   2704: aconst_null
    //   2705: astore 17
    //   2707: goto -1812 -> 895
    //   2710: aload 20
    //   2712: invokestatic 480	com/tencent/mm/sdk/platformtools/bg:Sx	(Ljava/lang/String;)Ljava/lang/String;
    //   2715: astore 17
    //   2717: ldc 39
    //   2719: astore_3
    //   2720: ldc 39
    //   2722: astore_0
    //   2723: aload 17
    //   2725: invokestatic 486	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   2728: astore 17
    //   2730: aload 17
    //   2732: ifnull +67 -> 2799
    //   2735: iload_1
    //   2736: iconst_1
    //   2737: if_icmpne +78 -> 2815
    //   2740: iconst_1
    //   2741: istore 11
    //   2743: aload 17
    //   2745: getfield 508	com/tencent/mm/x/f$a:gjx	I
    //   2748: tableswitch	default:+32->2780, 1:+73->2821, 2:+32->2780, 3:+110->2858, 4:+147->2895
    //   2780: aload 6
    //   2782: aload 17
    //   2784: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   2787: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   2790: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2793: aload 6
    //   2795: getfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2798: astore_0
    //   2799: aload 7
    //   2801: aload 18
    //   2803: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2806: iconst_0
    //   2807: istore 11
    //   2809: aconst_null
    //   2810: astore 17
    //   2812: goto -1917 -> 895
    //   2815: iconst_0
    //   2816: istore 11
    //   2818: goto -75 -> 2743
    //   2821: iload 11
    //   2823: ifeq +19 -> 2842
    //   2826: aload 6
    //   2828: aload 5
    //   2830: getstatic 511	com/tencent/mm/R$l:cUZ	I
    //   2833: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2836: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2839: goto -46 -> 2793
    //   2842: aload 6
    //   2844: aload 5
    //   2846: getstatic 514	com/tencent/mm/R$l:cVc	I
    //   2849: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2852: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2855: goto -62 -> 2793
    //   2858: iload 11
    //   2860: ifeq +19 -> 2879
    //   2863: aload 6
    //   2865: aload 5
    //   2867: getstatic 517	com/tencent/mm/R$l:cVa	I
    //   2870: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2873: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2876: goto -83 -> 2793
    //   2879: aload 6
    //   2881: aload 5
    //   2883: getstatic 520	com/tencent/mm/R$l:cUX	I
    //   2886: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2889: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2892: goto -99 -> 2793
    //   2895: iload 11
    //   2897: ifeq +19 -> 2916
    //   2900: aload 6
    //   2902: aload 5
    //   2904: getstatic 523	com/tencent/mm/R$l:cVb	I
    //   2907: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2910: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2913: goto -120 -> 2793
    //   2916: aload 6
    //   2918: aload 5
    //   2920: getstatic 526	com/tencent/mm/R$l:cUY	I
    //   2923: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   2926: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   2929: goto -136 -> 2793
    //   2932: aload 20
    //   2934: invokestatic 480	com/tencent/mm/sdk/platformtools/bg:Sx	(Ljava/lang/String;)Ljava/lang/String;
    //   2937: astore 17
    //   2939: ldc 39
    //   2941: astore_3
    //   2942: ldc 39
    //   2944: astore_0
    //   2945: aload 17
    //   2947: invokestatic 486	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   2950: astore 17
    //   2952: aload 17
    //   2954: ifnull +62 -> 3016
    //   2957: iload_1
    //   2958: iconst_1
    //   2959: if_icmpne +85 -> 3044
    //   2962: iconst_1
    //   2963: istore 11
    //   2965: iload 11
    //   2967: ifeq +83 -> 3050
    //   2970: aload 6
    //   2972: new 113	java/lang/StringBuilder
    //   2975: dup
    //   2976: ldc_w 528
    //   2979: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2982: aload 17
    //   2984: getfield 532	com/tencent/mm/x/f$a:gjY	Ljava/lang/String;
    //   2987: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2990: ldc_w 534
    //   2993: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2996: aload 17
    //   2998: getfield 537	com/tencent/mm/x/f$a:gjV	Ljava/lang/String;
    //   3001: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3004: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3007: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3010: aload 6
    //   3012: getfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3015: astore_0
    //   3016: aload_2
    //   3017: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   3020: ifne +4308 -> 7328
    //   3023: iload 12
    //   3025: ifne +4303 -> 7328
    //   3028: aload 7
    //   3030: aload 18
    //   3032: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3035: iconst_0
    //   3036: istore 11
    //   3038: aconst_null
    //   3039: astore 17
    //   3041: goto -2146 -> 895
    //   3044: iconst_0
    //   3045: istore 11
    //   3047: goto -82 -> 2965
    //   3050: aload 19
    //   3052: invokestatic 292	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   3055: ifne +57 -> 3112
    //   3058: aload 6
    //   3060: new 113	java/lang/StringBuilder
    //   3063: dup
    //   3064: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   3067: aload 19
    //   3069: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   3072: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3075: ldc_w 539
    //   3078: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3081: aload 17
    //   3083: getfield 532	com/tencent/mm/x/f$a:gjY	Ljava/lang/String;
    //   3086: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3089: ldc_w 534
    //   3092: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3095: aload 17
    //   3097: getfield 542	com/tencent/mm/x/f$a:gjU	Ljava/lang/String;
    //   3100: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3103: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3106: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3109: goto -99 -> 3010
    //   3112: aload 6
    //   3114: new 113	java/lang/StringBuilder
    //   3117: dup
    //   3118: ldc_w 528
    //   3121: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3124: aload 17
    //   3126: getfield 532	com/tencent/mm/x/f$a:gjY	Ljava/lang/String;
    //   3129: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3132: ldc_w 534
    //   3135: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3138: aload 17
    //   3140: getfield 542	com/tencent/mm/x/f$a:gjU	Ljava/lang/String;
    //   3143: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3146: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3149: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3152: goto -142 -> 3010
    //   3155: aload 20
    //   3157: invokestatic 480	com/tencent/mm/sdk/platformtools/bg:Sx	(Ljava/lang/String;)Ljava/lang/String;
    //   3160: invokestatic 486	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   3163: getfield 489	com/tencent/mm/x/f$a:giQ	I
    //   3166: lookupswitch	default:+26->3192, 10000:+108->3274, 20000:+120->3286
    //   3192: aload 5
    //   3194: getstatic 545	com/tencent/mm/R$l:cUd	I
    //   3197: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   3200: astore_0
    //   3201: aload 18
    //   3203: invokevirtual 88	java/lang/String:length	()I
    //   3206: ifle +92 -> 3298
    //   3209: new 113	java/lang/StringBuilder
    //   3212: dup
    //   3213: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   3216: aload 18
    //   3218: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3221: ldc_w 314
    //   3224: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3227: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3230: astore_3
    //   3231: aload_2
    //   3232: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   3235: ifne +15 -> 3250
    //   3238: iload 12
    //   3240: ifne +10 -> 3250
    //   3243: aload 7
    //   3245: aload 18
    //   3247: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3250: aload 6
    //   3252: ldc 39
    //   3254: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3257: aload_0
    //   3258: astore 20
    //   3260: aload_3
    //   3261: astore_0
    //   3262: aconst_null
    //   3263: astore 17
    //   3265: iconst_0
    //   3266: istore 11
    //   3268: aload 20
    //   3270: astore_3
    //   3271: goto -2376 -> 895
    //   3274: aload 5
    //   3276: getstatic 548	com/tencent/mm/R$l:cUe	I
    //   3279: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   3282: astore_0
    //   3283: goto -82 -> 3201
    //   3286: aload 5
    //   3288: getstatic 551	com/tencent/mm/R$l:cUg	I
    //   3291: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   3294: astore_0
    //   3295: goto -94 -> 3201
    //   3298: ldc 39
    //   3300: astore_3
    //   3301: goto -70 -> 3231
    //   3304: aload 20
    //   3306: invokestatic 480	com/tencent/mm/sdk/platformtools/bg:Sx	(Ljava/lang/String;)Ljava/lang/String;
    //   3309: invokestatic 486	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   3312: astore_3
    //   3313: aload_3
    //   3314: ifnonnull +24 -> 3338
    //   3317: ldc_w 553
    //   3320: ldc_w 555
    //   3323: invokestatic 561	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   3326: ldc2_w 188
    //   3329: sipush 3919
    //   3332: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3335: ldc 39
    //   3337: areturn
    //   3338: ldc 39
    //   3340: astore 20
    //   3342: aload 5
    //   3344: getstatic 564	com/tencent/mm/R$l:ddm	I
    //   3347: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   3350: astore 17
    //   3352: aload 18
    //   3354: invokevirtual 88	java/lang/String:length	()I
    //   3357: ifle +108 -> 3465
    //   3360: new 113	java/lang/StringBuilder
    //   3363: dup
    //   3364: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   3367: aload 18
    //   3369: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3372: ldc_w 314
    //   3375: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3378: aload 17
    //   3380: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3383: aload_3
    //   3384: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   3387: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3390: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3393: astore_0
    //   3394: aload_2
    //   3395: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   3398: ifne +15 -> 3413
    //   3401: iload 12
    //   3403: ifne +10 -> 3413
    //   3406: aload 7
    //   3408: aload 18
    //   3410: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3413: aload 18
    //   3415: invokevirtual 88	java/lang/String:length	()I
    //   3418: ifle +73 -> 3491
    //   3421: new 113	java/lang/StringBuilder
    //   3424: dup
    //   3425: ldc_w 316
    //   3428: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3431: aload 17
    //   3433: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3436: aload_3
    //   3437: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   3440: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3443: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3446: astore_3
    //   3447: aload 6
    //   3449: aload_3
    //   3450: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3453: iconst_0
    //   3454: istore 11
    //   3456: aconst_null
    //   3457: astore 17
    //   3459: aload 20
    //   3461: astore_3
    //   3462: goto -2567 -> 895
    //   3465: new 113	java/lang/StringBuilder
    //   3468: dup
    //   3469: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   3472: aload 17
    //   3474: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3477: aload_3
    //   3478: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   3481: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3484: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3487: astore_0
    //   3488: goto -94 -> 3394
    //   3491: new 113	java/lang/StringBuilder
    //   3494: dup
    //   3495: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   3498: aload 17
    //   3500: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3503: aload_3
    //   3504: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   3507: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3510: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3513: astore_3
    //   3514: goto -67 -> 3447
    //   3517: aload 20
    //   3519: invokestatic 480	com/tencent/mm/sdk/platformtools/bg:Sx	(Ljava/lang/String;)Ljava/lang/String;
    //   3522: invokestatic 486	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   3525: astore_0
    //   3526: aload_0
    //   3527: ifnonnull +24 -> 3551
    //   3530: ldc_w 553
    //   3533: ldc_w 555
    //   3536: invokestatic 561	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   3539: ldc2_w 188
    //   3542: sipush 3919
    //   3545: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3548: ldc 39
    //   3550: areturn
    //   3551: ldc 39
    //   3553: astore 20
    //   3555: aload 5
    //   3557: getstatic 564	com/tencent/mm/R$l:ddm	I
    //   3560: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   3563: astore_3
    //   3564: iload_1
    //   3565: iconst_1
    //   3566: if_icmpne +97 -> 3663
    //   3569: new 113	java/lang/StringBuilder
    //   3572: dup
    //   3573: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   3576: aload_3
    //   3577: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3580: aload_0
    //   3581: getfield 567	com/tencent/mm/x/f$a:gjL	Ljava/lang/String;
    //   3584: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3587: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3590: astore_0
    //   3591: aload 18
    //   3593: invokevirtual 88	java/lang/String:length	()I
    //   3596: ifle +62 -> 3658
    //   3599: new 113	java/lang/StringBuilder
    //   3602: dup
    //   3603: ldc_w 316
    //   3606: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3609: aload_0
    //   3610: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3613: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3616: astore_3
    //   3617: aload 6
    //   3619: aload_3
    //   3620: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3623: aload_0
    //   3624: astore_3
    //   3625: aload_2
    //   3626: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   3629: ifne +3681 -> 7310
    //   3632: aload_0
    //   3633: astore_3
    //   3634: iload 12
    //   3636: ifne +3674 -> 7310
    //   3639: aload 7
    //   3641: aload 18
    //   3643: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3646: aconst_null
    //   3647: astore 17
    //   3649: iconst_0
    //   3650: istore 11
    //   3652: aload 20
    //   3654: astore_3
    //   3655: goto -2760 -> 895
    //   3658: aload_0
    //   3659: astore_3
    //   3660: goto -43 -> 3617
    //   3663: new 113	java/lang/StringBuilder
    //   3666: dup
    //   3667: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   3670: aload_3
    //   3671: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3674: aload_0
    //   3675: getfield 570	com/tencent/mm/x/f$a:gjK	Ljava/lang/String;
    //   3678: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3681: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3684: astore_0
    //   3685: aload 18
    //   3687: invokevirtual 88	java/lang/String:length	()I
    //   3690: ifle +30 -> 3720
    //   3693: new 113	java/lang/StringBuilder
    //   3696: dup
    //   3697: ldc_w 316
    //   3700: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3703: aload_0
    //   3704: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3707: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3710: astore_3
    //   3711: aload 6
    //   3713: aload_3
    //   3714: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3717: goto -94 -> 3623
    //   3720: aload_0
    //   3721: astore_3
    //   3722: goto -11 -> 3711
    //   3725: aload 20
    //   3727: invokestatic 480	com/tencent/mm/sdk/platformtools/bg:Sx	(Ljava/lang/String;)Ljava/lang/String;
    //   3730: invokestatic 486	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   3733: astore_3
    //   3734: aload_3
    //   3735: ifnonnull +24 -> 3759
    //   3738: ldc_w 553
    //   3741: ldc_w 555
    //   3744: invokestatic 561	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   3747: ldc2_w 188
    //   3750: sipush 3919
    //   3753: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3756: ldc 39
    //   3758: areturn
    //   3759: ldc 39
    //   3761: astore 20
    //   3763: aload 18
    //   3765: invokevirtual 88	java/lang/String:length	()I
    //   3768: ifle +98 -> 3866
    //   3771: new 113	java/lang/StringBuilder
    //   3774: dup
    //   3775: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   3778: aload 18
    //   3780: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3783: ldc_w 314
    //   3786: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3789: aload_3
    //   3790: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   3793: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3796: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3799: astore_0
    //   3800: aload_2
    //   3801: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   3804: ifne +15 -> 3819
    //   3807: iload 12
    //   3809: ifne +10 -> 3819
    //   3812: aload 7
    //   3814: aload 18
    //   3816: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3819: aload 18
    //   3821: invokevirtual 88	java/lang/String:length	()I
    //   3824: ifle +50 -> 3874
    //   3827: new 113	java/lang/StringBuilder
    //   3830: dup
    //   3831: ldc_w 316
    //   3834: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3837: aload_3
    //   3838: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   3841: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3844: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3847: astore_3
    //   3848: aload 6
    //   3850: aload_3
    //   3851: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3854: iconst_0
    //   3855: istore 11
    //   3857: aconst_null
    //   3858: astore 17
    //   3860: aload 20
    //   3862: astore_3
    //   3863: goto -2968 -> 895
    //   3866: aload_3
    //   3867: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   3870: astore_0
    //   3871: goto -71 -> 3800
    //   3874: aload_3
    //   3875: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   3878: astore_3
    //   3879: goto -31 -> 3848
    //   3882: aload 5
    //   3884: getstatic 573	com/tencent/mm/R$l:cRN	I
    //   3887: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   3890: astore 20
    //   3892: aload 18
    //   3894: invokevirtual 88	java/lang/String:length	()I
    //   3897: ifle +74 -> 3971
    //   3900: new 113	java/lang/StringBuilder
    //   3903: dup
    //   3904: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   3907: aload 18
    //   3909: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3912: ldc_w 314
    //   3915: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3918: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3921: astore_0
    //   3922: aload_2
    //   3923: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   3926: ifne +15 -> 3941
    //   3929: iload 12
    //   3931: ifne +10 -> 3941
    //   3934: aload 7
    //   3936: aload 18
    //   3938: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3941: aload 18
    //   3943: invokevirtual 88	java/lang/String:length	()I
    //   3946: ifle +31 -> 3977
    //   3949: ldc_w 316
    //   3952: astore_3
    //   3953: aload 6
    //   3955: aload_3
    //   3956: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   3959: iconst_0
    //   3960: istore 11
    //   3962: aconst_null
    //   3963: astore 17
    //   3965: aload 20
    //   3967: astore_3
    //   3968: goto -3073 -> 895
    //   3971: ldc 39
    //   3973: astore_0
    //   3974: goto -52 -> 3922
    //   3977: ldc 39
    //   3979: astore_3
    //   3980: goto -27 -> 3953
    //   3983: aload 20
    //   3985: invokestatic 480	com/tencent/mm/sdk/platformtools/bg:Sx	(Ljava/lang/String;)Ljava/lang/String;
    //   3988: astore_0
    //   3989: aload_0
    //   3990: invokestatic 486	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   3993: astore 21
    //   3995: aload 21
    //   3997: ifnonnull +24 -> 4021
    //   4000: ldc_w 553
    //   4003: ldc_w 555
    //   4006: invokestatic 561	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   4009: ldc2_w 188
    //   4012: sipush 3919
    //   4015: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4018: ldc 39
    //   4020: areturn
    //   4021: aload 21
    //   4023: getfield 576	com/tencent/mm/x/f$a:type	I
    //   4026: tableswitch	default:+174->4200, 1:+195->4221, 2:+322->4348, 3:+423->4449, 4:+528->4554, 5:+839->4865, 6:+633->4659, 7:+738->4764, 8:+1136->5162, 9:+174->4200, 10:+174->4200, 11:+174->4200, 12:+174->4200, 13:+174->4200, 14:+174->4200, 15:+1216->5242, 16:+1781->5807, 17:+1376->5402, 18:+174->4200, 19:+1503->5529, 20:+174->4200, 21:+174->4200, 22:+174->4200, 23:+174->4200, 24:+1604->5630, 25:+1296->5322, 26:+1216->5242, 27:+1216->5242, 28:+174->4200, 29:+174->4200, 30:+174->4200, 31:+174->4200, 32:+174->4200, 33:+951->4977, 34:+1932->5958, 35:+174->4200, 36:+951->4977, 37:+174->4200, 38:+174->4200, 39:+174->4200, 40:+2108->6134
    //   4200: aload 5
    //   4202: getstatic 573	com/tencent/mm/R$l:cRN	I
    //   4205: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   4208: astore_3
    //   4209: ldc 39
    //   4211: astore_0
    //   4212: iconst_0
    //   4213: istore 11
    //   4215: aconst_null
    //   4216: astore 17
    //   4218: goto -3323 -> 895
    //   4221: ldc 39
    //   4223: astore 20
    //   4225: aload 18
    //   4227: invokevirtual 88	java/lang/String:length	()I
    //   4230: ifle +100 -> 4330
    //   4233: new 113	java/lang/StringBuilder
    //   4236: dup
    //   4237: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   4240: aload 18
    //   4242: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4245: ldc_w 314
    //   4248: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4251: aload 21
    //   4253: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   4256: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4259: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4262: astore_0
    //   4263: aload_2
    //   4264: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   4267: ifne +15 -> 4282
    //   4270: iload 12
    //   4272: ifne +10 -> 4282
    //   4275: aload 7
    //   4277: aload 18
    //   4279: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4282: aload 18
    //   4284: invokevirtual 88	java/lang/String:length	()I
    //   4287: ifle +52 -> 4339
    //   4290: new 113	java/lang/StringBuilder
    //   4293: dup
    //   4294: ldc_w 316
    //   4297: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4300: aload 21
    //   4302: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   4305: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4308: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4311: astore_3
    //   4312: aload 6
    //   4314: aload_3
    //   4315: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4318: iconst_0
    //   4319: istore 11
    //   4321: aconst_null
    //   4322: astore 17
    //   4324: aload 20
    //   4326: astore_3
    //   4327: goto -3432 -> 895
    //   4330: aload 21
    //   4332: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   4335: astore_0
    //   4336: goto -73 -> 4263
    //   4339: aload 21
    //   4341: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   4344: astore_3
    //   4345: goto -33 -> 4312
    //   4348: aload 5
    //   4350: getstatic 312	com/tencent/mm/R$l:cUb	I
    //   4353: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   4356: astore 20
    //   4358: aload 18
    //   4360: invokevirtual 88	java/lang/String:length	()I
    //   4363: ifle +74 -> 4437
    //   4366: new 113	java/lang/StringBuilder
    //   4369: dup
    //   4370: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   4373: aload 18
    //   4375: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4378: ldc_w 314
    //   4381: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4384: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4387: astore_0
    //   4388: aload_2
    //   4389: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   4392: ifne +15 -> 4407
    //   4395: iload 12
    //   4397: ifne +10 -> 4407
    //   4400: aload 7
    //   4402: aload 18
    //   4404: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4407: aload 18
    //   4409: invokevirtual 88	java/lang/String:length	()I
    //   4412: ifle +31 -> 4443
    //   4415: ldc_w 316
    //   4418: astore_3
    //   4419: aload 6
    //   4421: aload_3
    //   4422: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4425: iconst_0
    //   4426: istore 11
    //   4428: aconst_null
    //   4429: astore 17
    //   4431: aload 20
    //   4433: astore_3
    //   4434: goto -3539 -> 895
    //   4437: ldc 39
    //   4439: astore_0
    //   4440: goto -52 -> 4388
    //   4443: ldc 39
    //   4445: astore_3
    //   4446: goto -27 -> 4419
    //   4449: aload 5
    //   4451: getstatic 579	com/tencent/mm/R$l:cTB	I
    //   4454: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   4457: astore 20
    //   4459: aload 18
    //   4461: invokevirtual 88	java/lang/String:length	()I
    //   4464: ifle +78 -> 4542
    //   4467: new 113	java/lang/StringBuilder
    //   4470: dup
    //   4471: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   4474: aload 18
    //   4476: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4479: ldc_w 314
    //   4482: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4485: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4488: astore_0
    //   4489: aload_2
    //   4490: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   4493: ifne +15 -> 4508
    //   4496: iload 12
    //   4498: ifne +10 -> 4508
    //   4501: aload 7
    //   4503: aload 18
    //   4505: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4508: aload 18
    //   4510: invokevirtual 88	java/lang/String:length	()I
    //   4513: ifle +35 -> 4548
    //   4516: ldc_w 316
    //   4519: astore_3
    //   4520: aload 6
    //   4522: aload_3
    //   4523: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4526: aload 21
    //   4528: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   4531: astore 17
    //   4533: iconst_1
    //   4534: istore 11
    //   4536: aload 20
    //   4538: astore_3
    //   4539: goto -3644 -> 895
    //   4542: ldc 39
    //   4544: astore_0
    //   4545: goto -56 -> 4489
    //   4548: ldc 39
    //   4550: astore_3
    //   4551: goto -31 -> 4520
    //   4554: aload 5
    //   4556: getstatic 344	com/tencent/mm/R$l:cUP	I
    //   4559: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   4562: astore 20
    //   4564: aload 18
    //   4566: invokevirtual 88	java/lang/String:length	()I
    //   4569: ifle +78 -> 4647
    //   4572: new 113	java/lang/StringBuilder
    //   4575: dup
    //   4576: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   4579: aload 18
    //   4581: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4584: ldc_w 314
    //   4587: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4590: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4593: astore_0
    //   4594: aload_2
    //   4595: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   4598: ifne +15 -> 4613
    //   4601: iload 12
    //   4603: ifne +10 -> 4613
    //   4606: aload 7
    //   4608: aload 18
    //   4610: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4613: aload 18
    //   4615: invokevirtual 88	java/lang/String:length	()I
    //   4618: ifle +35 -> 4653
    //   4621: ldc_w 316
    //   4624: astore_3
    //   4625: aload 6
    //   4627: aload_3
    //   4628: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4631: aload 21
    //   4633: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   4636: astore 17
    //   4638: iconst_1
    //   4639: istore 11
    //   4641: aload 20
    //   4643: astore_3
    //   4644: goto -3749 -> 895
    //   4647: ldc 39
    //   4649: astore_0
    //   4650: goto -56 -> 4594
    //   4653: ldc 39
    //   4655: astore_3
    //   4656: goto -31 -> 4625
    //   4659: aload 5
    //   4661: getstatic 582	com/tencent/mm/R$l:cTf	I
    //   4664: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   4667: astore 20
    //   4669: aload 18
    //   4671: invokevirtual 88	java/lang/String:length	()I
    //   4674: ifle +78 -> 4752
    //   4677: new 113	java/lang/StringBuilder
    //   4680: dup
    //   4681: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   4684: aload 18
    //   4686: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4689: ldc_w 314
    //   4692: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4695: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4698: astore_0
    //   4699: aload_2
    //   4700: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   4703: ifne +15 -> 4718
    //   4706: iload 12
    //   4708: ifne +10 -> 4718
    //   4711: aload 7
    //   4713: aload 18
    //   4715: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4718: aload 18
    //   4720: invokevirtual 88	java/lang/String:length	()I
    //   4723: ifle +35 -> 4758
    //   4726: ldc_w 316
    //   4729: astore_3
    //   4730: aload 6
    //   4732: aload_3
    //   4733: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4736: aload 21
    //   4738: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   4741: astore 17
    //   4743: iconst_1
    //   4744: istore 11
    //   4746: aload 20
    //   4748: astore_3
    //   4749: goto -3854 -> 895
    //   4752: ldc 39
    //   4754: astore_0
    //   4755: goto -56 -> 4699
    //   4758: ldc 39
    //   4760: astore_3
    //   4761: goto -31 -> 4730
    //   4764: aload 5
    //   4766: getstatic 573	com/tencent/mm/R$l:cRN	I
    //   4769: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   4772: astore 20
    //   4774: aload 18
    //   4776: invokevirtual 88	java/lang/String:length	()I
    //   4779: ifle +74 -> 4853
    //   4782: new 113	java/lang/StringBuilder
    //   4785: dup
    //   4786: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   4789: aload 18
    //   4791: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4794: ldc_w 314
    //   4797: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4800: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4803: astore_0
    //   4804: aload_2
    //   4805: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   4808: ifne +15 -> 4823
    //   4811: iload 12
    //   4813: ifne +10 -> 4823
    //   4816: aload 7
    //   4818: aload 18
    //   4820: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4823: aload 18
    //   4825: invokevirtual 88	java/lang/String:length	()I
    //   4828: ifle +31 -> 4859
    //   4831: ldc_w 316
    //   4834: astore_3
    //   4835: aload 6
    //   4837: aload_3
    //   4838: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4841: iconst_0
    //   4842: istore 11
    //   4844: aconst_null
    //   4845: astore 17
    //   4847: aload 20
    //   4849: astore_3
    //   4850: goto -3955 -> 895
    //   4853: ldc 39
    //   4855: astore_0
    //   4856: goto -52 -> 4804
    //   4859: ldc 39
    //   4861: astore_3
    //   4862: goto -27 -> 4835
    //   4865: aload 5
    //   4867: getstatic 585	com/tencent/mm/R$l:cUM	I
    //   4870: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   4873: astore 20
    //   4875: aload 18
    //   4877: invokevirtual 88	java/lang/String:length	()I
    //   4880: ifle +85 -> 4965
    //   4883: new 113	java/lang/StringBuilder
    //   4886: dup
    //   4887: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   4890: aload 18
    //   4892: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4895: ldc_w 314
    //   4898: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4901: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4904: astore_0
    //   4905: aload_2
    //   4906: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   4909: ifne +22 -> 4931
    //   4912: iload 12
    //   4914: ifne +17 -> 4931
    //   4917: aload_2
    //   4918: invokestatic 286	com/tencent/mm/y/s:gl	(Ljava/lang/String;)Z
    //   4921: ifne +10 -> 4931
    //   4924: aload 7
    //   4926: aload 18
    //   4928: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4931: aload 18
    //   4933: invokevirtual 88	java/lang/String:length	()I
    //   4936: ifle +35 -> 4971
    //   4939: ldc_w 316
    //   4942: astore_3
    //   4943: aload 6
    //   4945: aload_3
    //   4946: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   4949: aload 21
    //   4951: invokevirtual 588	com/tencent/mm/x/f$a:getTitle	()Ljava/lang/String;
    //   4954: astore 17
    //   4956: iconst_1
    //   4957: istore 11
    //   4959: aload 20
    //   4961: astore_3
    //   4962: goto -4067 -> 895
    //   4965: ldc 39
    //   4967: astore_0
    //   4968: goto -63 -> 4905
    //   4971: ldc 39
    //   4973: astore_3
    //   4974: goto -31 -> 4943
    //   4977: ldc 39
    //   4979: astore 20
    //   4981: aload 5
    //   4983: getstatic 591	com/tencent/mm/R$l:cRR	I
    //   4986: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   4989: astore_3
    //   4990: aload 18
    //   4992: invokevirtual 88	java/lang/String:length	()I
    //   4995: ifle +115 -> 5110
    //   4998: new 113	java/lang/StringBuilder
    //   5001: dup
    //   5002: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5005: aload 18
    //   5007: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5010: ldc_w 314
    //   5013: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5016: aload_3
    //   5017: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5020: aload 21
    //   5022: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   5025: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5028: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5031: astore_0
    //   5032: aload_2
    //   5033: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   5036: ifne +22 -> 5058
    //   5039: iload 12
    //   5041: ifne +17 -> 5058
    //   5044: aload_2
    //   5045: invokestatic 286	com/tencent/mm/y/s:gl	(Ljava/lang/String;)Z
    //   5048: ifne +10 -> 5058
    //   5051: aload 7
    //   5053: aload 18
    //   5055: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5058: aload 18
    //   5060: invokevirtual 88	java/lang/String:length	()I
    //   5063: ifle +73 -> 5136
    //   5066: new 113	java/lang/StringBuilder
    //   5069: dup
    //   5070: ldc_w 316
    //   5073: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5076: aload_3
    //   5077: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5080: aload 21
    //   5082: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   5085: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5088: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5091: astore_3
    //   5092: aload 6
    //   5094: aload_3
    //   5095: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5098: iconst_0
    //   5099: istore 11
    //   5101: aconst_null
    //   5102: astore 17
    //   5104: aload 20
    //   5106: astore_3
    //   5107: goto -4212 -> 895
    //   5110: new 113	java/lang/StringBuilder
    //   5113: dup
    //   5114: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5117: aload_3
    //   5118: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5121: aload 21
    //   5123: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   5126: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5129: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5132: astore_0
    //   5133: goto -101 -> 5032
    //   5136: new 113	java/lang/StringBuilder
    //   5139: dup
    //   5140: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5143: aload_3
    //   5144: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5147: aload 21
    //   5149: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   5152: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5155: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5158: astore_3
    //   5159: goto -67 -> 5092
    //   5162: aload 5
    //   5164: getstatic 594	com/tencent/mm/R$l:cSE	I
    //   5167: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   5170: astore_3
    //   5171: aload 18
    //   5173: invokevirtual 88	java/lang/String:length	()I
    //   5176: ifle +60 -> 5236
    //   5179: new 113	java/lang/StringBuilder
    //   5182: dup
    //   5183: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5186: aload 18
    //   5188: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5191: ldc_w 314
    //   5194: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5197: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5200: astore_0
    //   5201: aload_2
    //   5202: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   5205: ifne +15 -> 5220
    //   5208: iload 12
    //   5210: ifne +10 -> 5220
    //   5213: aload 7
    //   5215: aload 18
    //   5217: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5220: aload 6
    //   5222: ldc 39
    //   5224: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5227: iconst_0
    //   5228: istore 11
    //   5230: aconst_null
    //   5231: astore 17
    //   5233: goto -4338 -> 895
    //   5236: ldc 39
    //   5238: astore_0
    //   5239: goto -38 -> 5201
    //   5242: aload 5
    //   5244: getstatic 597	com/tencent/mm/R$l:cSF	I
    //   5247: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   5250: astore_3
    //   5251: aload 18
    //   5253: invokevirtual 88	java/lang/String:length	()I
    //   5256: ifle +60 -> 5316
    //   5259: new 113	java/lang/StringBuilder
    //   5262: dup
    //   5263: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5266: aload 18
    //   5268: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5271: ldc_w 314
    //   5274: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5277: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5280: astore_0
    //   5281: aload_2
    //   5282: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   5285: ifne +15 -> 5300
    //   5288: iload 12
    //   5290: ifne +10 -> 5300
    //   5293: aload 7
    //   5295: aload 18
    //   5297: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5300: aload 6
    //   5302: ldc 39
    //   5304: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5307: iconst_0
    //   5308: istore 11
    //   5310: aconst_null
    //   5311: astore 17
    //   5313: goto -4418 -> 895
    //   5316: ldc 39
    //   5318: astore_0
    //   5319: goto -38 -> 5281
    //   5322: aload 5
    //   5324: getstatic 600	com/tencent/mm/R$l:cSv	I
    //   5327: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   5330: astore_3
    //   5331: aload 18
    //   5333: invokevirtual 88	java/lang/String:length	()I
    //   5336: ifle +60 -> 5396
    //   5339: new 113	java/lang/StringBuilder
    //   5342: dup
    //   5343: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5346: aload 18
    //   5348: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5351: ldc_w 314
    //   5354: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5357: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5360: astore_0
    //   5361: aload_2
    //   5362: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   5365: ifne +15 -> 5380
    //   5368: iload 12
    //   5370: ifne +10 -> 5380
    //   5373: aload 7
    //   5375: aload 18
    //   5377: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5380: aload 6
    //   5382: ldc 39
    //   5384: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5387: iconst_0
    //   5388: istore 11
    //   5390: aconst_null
    //   5391: astore 17
    //   5393: goto -4498 -> 895
    //   5396: ldc 39
    //   5398: astore_0
    //   5399: goto -38 -> 5361
    //   5402: ldc 39
    //   5404: astore 20
    //   5406: aload 18
    //   5408: invokevirtual 88	java/lang/String:length	()I
    //   5411: ifle +100 -> 5511
    //   5414: new 113	java/lang/StringBuilder
    //   5417: dup
    //   5418: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5421: aload 18
    //   5423: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5426: ldc_w 314
    //   5429: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5432: aload 21
    //   5434: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   5437: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5440: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5443: astore_0
    //   5444: aload_2
    //   5445: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   5448: ifne +15 -> 5463
    //   5451: iload 12
    //   5453: ifne +10 -> 5463
    //   5456: aload 7
    //   5458: aload 18
    //   5460: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5463: aload 18
    //   5465: invokevirtual 88	java/lang/String:length	()I
    //   5468: ifle +52 -> 5520
    //   5471: new 113	java/lang/StringBuilder
    //   5474: dup
    //   5475: ldc_w 316
    //   5478: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5481: aload 21
    //   5483: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   5486: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5489: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5492: astore_3
    //   5493: aload 6
    //   5495: aload_3
    //   5496: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5499: iconst_0
    //   5500: istore 11
    //   5502: aconst_null
    //   5503: astore 17
    //   5505: aload 20
    //   5507: astore_3
    //   5508: goto -4613 -> 895
    //   5511: aload 21
    //   5513: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   5516: astore_0
    //   5517: goto -73 -> 5444
    //   5520: aload 21
    //   5522: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   5525: astore_3
    //   5526: goto -33 -> 5493
    //   5529: aload 5
    //   5531: getstatic 603	com/tencent/mm/R$l:cUk	I
    //   5534: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   5537: astore 20
    //   5539: aload 18
    //   5541: invokevirtual 88	java/lang/String:length	()I
    //   5544: ifle +74 -> 5618
    //   5547: new 113	java/lang/StringBuilder
    //   5550: dup
    //   5551: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5554: aload 18
    //   5556: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5559: ldc_w 314
    //   5562: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5565: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5568: astore_0
    //   5569: aload_2
    //   5570: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   5573: ifne +15 -> 5588
    //   5576: iload 12
    //   5578: ifne +10 -> 5588
    //   5581: aload 7
    //   5583: aload 18
    //   5585: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5588: aload 18
    //   5590: invokevirtual 88	java/lang/String:length	()I
    //   5593: ifle +31 -> 5624
    //   5596: ldc_w 316
    //   5599: astore_3
    //   5600: aload 6
    //   5602: aload_3
    //   5603: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5606: iconst_0
    //   5607: istore 11
    //   5609: aconst_null
    //   5610: astore 17
    //   5612: aload 20
    //   5614: astore_3
    //   5615: goto -4720 -> 895
    //   5618: ldc 39
    //   5620: astore_0
    //   5621: goto -52 -> 5569
    //   5624: ldc 39
    //   5626: astore_3
    //   5627: goto -27 -> 5600
    //   5630: ldc 39
    //   5632: astore_0
    //   5633: aload 21
    //   5635: getfield 606	com/tencent/mm/x/f$a:description	Ljava/lang/String;
    //   5638: invokestatic 292	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   5641: ifne +35 -> 5676
    //   5644: aload 21
    //   5646: getfield 606	com/tencent/mm/x/f$a:description	Ljava/lang/String;
    //   5649: ldc_w 608
    //   5652: invokevirtual 84	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   5655: istore 11
    //   5657: aload 21
    //   5659: getfield 606	com/tencent/mm/x/f$a:description	Ljava/lang/String;
    //   5662: astore_0
    //   5663: iload 11
    //   5665: ifle +117 -> 5782
    //   5668: aload_0
    //   5669: iconst_0
    //   5670: iload 11
    //   5672: invokevirtual 92	java/lang/String:substring	(II)Ljava/lang/String;
    //   5675: astore_0
    //   5676: new 113	java/lang/StringBuilder
    //   5679: dup
    //   5680: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5683: aload 5
    //   5685: getstatic 611	com/tencent/mm/R$l:dvk	I
    //   5688: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   5691: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5694: aload_0
    //   5695: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5698: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5701: astore 20
    //   5703: aload 18
    //   5705: invokevirtual 88	java/lang/String:length	()I
    //   5708: ifle +87 -> 5795
    //   5711: new 113	java/lang/StringBuilder
    //   5714: dup
    //   5715: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5718: aload 18
    //   5720: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5723: ldc_w 314
    //   5726: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5729: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5732: astore_0
    //   5733: aload_2
    //   5734: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   5737: ifne +15 -> 5752
    //   5740: iload 12
    //   5742: ifne +10 -> 5752
    //   5745: aload 7
    //   5747: aload 18
    //   5749: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5752: aload 18
    //   5754: invokevirtual 88	java/lang/String:length	()I
    //   5757: ifle +44 -> 5801
    //   5760: ldc_w 316
    //   5763: astore_3
    //   5764: aload 6
    //   5766: aload_3
    //   5767: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5770: iconst_0
    //   5771: istore 11
    //   5773: aconst_null
    //   5774: astore 17
    //   5776: aload 20
    //   5778: astore_3
    //   5779: goto -4884 -> 895
    //   5782: aload 21
    //   5784: getfield 606	com/tencent/mm/x/f$a:description	Ljava/lang/String;
    //   5787: invokevirtual 88	java/lang/String:length	()I
    //   5790: istore 11
    //   5792: goto -124 -> 5668
    //   5795: ldc 39
    //   5797: astore_0
    //   5798: goto -65 -> 5733
    //   5801: ldc 39
    //   5803: astore_3
    //   5804: goto -40 -> 5764
    //   5807: ldc 39
    //   5809: astore 20
    //   5811: aload 5
    //   5813: getstatic 564	com/tencent/mm/R$l:ddm	I
    //   5816: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   5819: astore 17
    //   5821: aload 18
    //   5823: invokevirtual 88	java/lang/String:length	()I
    //   5826: ifle +105 -> 5931
    //   5829: new 113	java/lang/StringBuilder
    //   5832: dup
    //   5833: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5836: aload 18
    //   5838: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5841: ldc_w 314
    //   5844: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5847: aload 17
    //   5849: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5852: aload 21
    //   5854: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   5857: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5860: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5863: astore_0
    //   5864: aload_2
    //   5865: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   5868: ifne +15 -> 5883
    //   5871: iload 12
    //   5873: ifne +10 -> 5883
    //   5876: aload 7
    //   5878: aload 18
    //   5880: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5883: aload 17
    //   5885: astore_3
    //   5886: aload 18
    //   5888: invokevirtual 88	java/lang/String:length	()I
    //   5891: ifle +22 -> 5913
    //   5894: new 113	java/lang/StringBuilder
    //   5897: dup
    //   5898: ldc_w 316
    //   5901: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5904: aload 17
    //   5906: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5909: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5912: astore_3
    //   5913: aload 6
    //   5915: aload_3
    //   5916: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   5919: iconst_0
    //   5920: istore 11
    //   5922: aconst_null
    //   5923: astore 17
    //   5925: aload 20
    //   5927: astore_3
    //   5928: goto -5033 -> 895
    //   5931: new 113	java/lang/StringBuilder
    //   5934: dup
    //   5935: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5938: aload 17
    //   5940: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5943: aload 21
    //   5945: getfield 505	com/tencent/mm/x/f$a:title	Ljava/lang/String;
    //   5948: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5951: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5954: astore_0
    //   5955: goto -91 -> 5864
    //   5958: ldc 39
    //   5960: astore 20
    //   5962: aload 5
    //   5964: getstatic 564	com/tencent/mm/R$l:ddm	I
    //   5967: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   5970: astore_0
    //   5971: iload_1
    //   5972: iconst_1
    //   5973: if_icmpne +98 -> 6071
    //   5976: new 113	java/lang/StringBuilder
    //   5979: dup
    //   5980: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   5983: aload_0
    //   5984: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5987: aload 21
    //   5989: getfield 567	com/tencent/mm/x/f$a:gjL	Ljava/lang/String;
    //   5992: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5995: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5998: astore_0
    //   5999: aload 18
    //   6001: invokevirtual 88	java/lang/String:length	()I
    //   6004: ifle +62 -> 6066
    //   6007: new 113	java/lang/StringBuilder
    //   6010: dup
    //   6011: ldc_w 316
    //   6014: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   6017: aload_0
    //   6018: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6021: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   6024: astore_3
    //   6025: aload 6
    //   6027: aload_3
    //   6028: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6031: aload_0
    //   6032: astore_3
    //   6033: aload_2
    //   6034: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   6037: ifne +1273 -> 7310
    //   6040: aload_0
    //   6041: astore_3
    //   6042: iload 12
    //   6044: ifne +1266 -> 7310
    //   6047: aload 7
    //   6049: aload 18
    //   6051: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6054: aconst_null
    //   6055: astore 17
    //   6057: iconst_0
    //   6058: istore 11
    //   6060: aload 20
    //   6062: astore_3
    //   6063: goto -5168 -> 895
    //   6066: aload_0
    //   6067: astore_3
    //   6068: goto -43 -> 6025
    //   6071: new 113	java/lang/StringBuilder
    //   6074: dup
    //   6075: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   6078: aload_0
    //   6079: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6082: aload 21
    //   6084: getfield 570	com/tencent/mm/x/f$a:gjK	Ljava/lang/String;
    //   6087: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6090: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   6093: astore_0
    //   6094: aload 18
    //   6096: invokevirtual 88	java/lang/String:length	()I
    //   6099: ifle +30 -> 6129
    //   6102: new 113	java/lang/StringBuilder
    //   6105: dup
    //   6106: ldc_w 316
    //   6109: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   6112: aload_0
    //   6113: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6116: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   6119: astore_3
    //   6120: aload 6
    //   6122: aload_3
    //   6123: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6126: goto -95 -> 6031
    //   6129: aload_0
    //   6130: astore_3
    //   6131: goto -11 -> 6120
    //   6134: aload_0
    //   6135: invokestatic 617	com/tencent/mm/x/j:eW	(Ljava/lang/String;)Lcom/tencent/mm/x/j;
    //   6138: getfield 620	com/tencent/mm/x/j:glu	I
    //   6141: bipush 19
    //   6143: if_icmpne +27 -> 6170
    //   6146: aload 5
    //   6148: getstatic 603	com/tencent/mm/R$l:cUk	I
    //   6151: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   6154: astore 20
    //   6156: iconst_0
    //   6157: istore 11
    //   6159: aconst_null
    //   6160: astore 17
    //   6162: aload_3
    //   6163: astore_0
    //   6164: aload 20
    //   6166: astore_3
    //   6167: goto -5272 -> 895
    //   6170: aload 5
    //   6172: getstatic 573	com/tencent/mm/R$l:cRN	I
    //   6175: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   6178: astore 20
    //   6180: iconst_0
    //   6181: istore 11
    //   6183: aconst_null
    //   6184: astore 17
    //   6186: aload_3
    //   6187: astore_0
    //   6188: aload 20
    //   6190: astore_3
    //   6191: goto -5296 -> 895
    //   6194: aload_3
    //   6195: astore_0
    //   6196: iload 13
    //   6198: ifeq +8 -> 6206
    //   6201: aload_3
    //   6202: invokestatic 623	com/tencent/mm/booter/notification/a/h:dF	(Ljava/lang/String;)Ljava/lang/String;
    //   6205: astore_0
    //   6206: ldc_w 625
    //   6209: invokestatic 631	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   6212: checkcast 625	com/tencent/mm/plugin/biz/a/a
    //   6215: aload_0
    //   6216: invokeinterface 634 2 0
    //   6221: invokestatic 263	com/tencent/mm/booter/notification/a/h:dE	(Ljava/lang/String;)Ljava/lang/String;
    //   6224: astore_0
    //   6225: aload 6
    //   6227: aload_0
    //   6228: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6231: iconst_0
    //   6232: istore 11
    //   6234: ldc 39
    //   6236: astore_3
    //   6237: aconst_null
    //   6238: astore 17
    //   6240: goto -5345 -> 895
    //   6243: aload 6
    //   6245: ldc_w 625
    //   6248: invokestatic 631	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   6251: checkcast 625	com/tencent/mm/plugin/biz/a/a
    //   6254: aload_3
    //   6255: invokeinterface 637 2 0
    //   6260: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6263: aload 6
    //   6265: getfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6268: astore 20
    //   6270: iconst_0
    //   6271: istore 11
    //   6273: aconst_null
    //   6274: astore 17
    //   6276: aload_3
    //   6277: astore_0
    //   6278: aload 20
    //   6280: astore_3
    //   6281: goto -5386 -> 895
    //   6284: aload_3
    //   6285: invokestatic 643	com/tencent/mm/ag/a$a:jq	(Ljava/lang/String;)Lcom/tencent/mm/ag/a$a;
    //   6288: invokestatic 649	com/tencent/mm/ag/a:b	(Lcom/tencent/mm/ag/a$a;)Ljava/lang/String;
    //   6291: astore_0
    //   6292: aload 6
    //   6294: aload_0
    //   6295: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6298: iconst_0
    //   6299: istore 11
    //   6301: ldc 39
    //   6303: astore_3
    //   6304: aconst_null
    //   6305: astore 17
    //   6307: goto -5412 -> 895
    //   6310: ldc 39
    //   6312: astore_3
    //   6313: aload 20
    //   6315: invokestatic 486	com/tencent/mm/x/f$a:eS	(Ljava/lang/String;)Lcom/tencent/mm/x/f$a;
    //   6318: astore 17
    //   6320: aload_3
    //   6321: astore_0
    //   6322: aload 17
    //   6324: ifnull -5438 -> 886
    //   6327: aload_3
    //   6328: astore_0
    //   6329: aload 17
    //   6331: getfield 652	com/tencent/mm/x/f$a:content	Ljava/lang/String;
    //   6334: ldc_w 654
    //   6337: invokestatic 659	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6340: astore_3
    //   6341: aload_3
    //   6342: astore_0
    //   6343: aload_3
    //   6344: invokestatic 185	com/tencent/mm/pluginsdk/ui/d/h:Pz	(Ljava/lang/String;)Ljava/lang/String;
    //   6347: astore_3
    //   6348: aload_3
    //   6349: astore_0
    //   6350: aload 6
    //   6352: aload_0
    //   6353: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6356: iconst_0
    //   6357: istore 11
    //   6359: ldc 39
    //   6361: astore_3
    //   6362: aconst_null
    //   6363: astore 17
    //   6365: goto -5470 -> 895
    //   6368: astore_3
    //   6369: ldc_w 553
    //   6372: aload_3
    //   6373: ldc 39
    //   6375: iconst_0
    //   6376: anewarray 4	java/lang/Object
    //   6379: invokestatic 663	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6382: iconst_0
    //   6383: istore 11
    //   6385: ldc 39
    //   6387: astore_3
    //   6388: aconst_null
    //   6389: astore 17
    //   6391: goto -5496 -> 895
    //   6394: aload_0
    //   6395: ldc_w 665
    //   6398: invokevirtual 669	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   6401: astore_0
    //   6402: aload_0
    //   6403: arraylength
    //   6404: iconst_1
    //   6405: if_icmple +26 -> 6431
    //   6408: aload 6
    //   6410: aload_0
    //   6411: iconst_1
    //   6412: aaload
    //   6413: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6416: aload_0
    //   6417: iconst_1
    //   6418: aaload
    //   6419: astore_0
    //   6420: ldc2_w 188
    //   6423: sipush 3919
    //   6426: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   6429: aload_0
    //   6430: areturn
    //   6431: aload 6
    //   6433: ldc 39
    //   6435: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6438: ldc2_w 188
    //   6441: sipush 3919
    //   6444: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   6447: aconst_null
    //   6448: areturn
    //   6449: aconst_null
    //   6450: astore_2
    //   6451: aconst_null
    //   6452: astore 7
    //   6454: aload_0
    //   6455: ldc 78
    //   6457: invokevirtual 669	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   6460: astore 5
    //   6462: aload 5
    //   6464: ifnull +9 -> 6473
    //   6467: aload 5
    //   6469: arraylength
    //   6470: ifgt +21 -> 6491
    //   6473: aload 6
    //   6475: ldc 39
    //   6477: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6480: ldc2_w 188
    //   6483: sipush 3919
    //   6486: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   6489: aconst_null
    //   6490: areturn
    //   6491: aload 5
    //   6493: iconst_0
    //   6494: aaload
    //   6495: astore 5
    //   6497: aload 5
    //   6499: invokestatic 292	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   6502: ifne +69 -> 6571
    //   6505: invokestatic 223	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   6508: pop
    //   6509: invokestatic 444	com/tencent/mm/y/c:yK	()Lcom/tencent/mm/storage/ar;
    //   6512: aload 5
    //   6514: invokeinterface 450 2 0
    //   6519: astore 8
    //   6521: aload 7
    //   6523: astore 5
    //   6525: aload 8
    //   6527: ifnull +22 -> 6549
    //   6530: aload 7
    //   6532: astore 5
    //   6534: aload 8
    //   6536: invokevirtual 672	com/tencent/mm/storage/x:getCity	()Ljava/lang/String;
    //   6539: ifnull +10 -> 6549
    //   6542: aload 8
    //   6544: invokevirtual 672	com/tencent/mm/storage/x:getCity	()Ljava/lang/String;
    //   6547: astore 5
    //   6549: aload 5
    //   6551: ifnull +14 -> 6565
    //   6554: aload 5
    //   6556: astore_2
    //   6557: aload 5
    //   6559: invokevirtual 88	java/lang/String:length	()I
    //   6562: ifgt +9 -> 6571
    //   6565: aload 8
    //   6567: invokevirtual 675	com/tencent/mm/storage/x:getProvince	()Ljava/lang/String;
    //   6570: astore_2
    //   6571: aload_3
    //   6572: invokestatic 292	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   6575: ifne +68 -> 6643
    //   6578: aload 6
    //   6580: new 113	java/lang/StringBuilder
    //   6583: dup
    //   6584: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   6587: aload_2
    //   6588: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6591: ldc_w 314
    //   6594: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6597: aload_3
    //   6598: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6601: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   6604: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6607: new 113	java/lang/StringBuilder
    //   6610: dup
    //   6611: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   6614: aload_2
    //   6615: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6618: ldc_w 314
    //   6621: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6624: aload_3
    //   6625: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6628: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   6631: astore_0
    //   6632: ldc2_w 188
    //   6635: sipush 3919
    //   6638: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   6641: aload_0
    //   6642: areturn
    //   6643: aload_0
    //   6644: ldc_w 665
    //   6647: invokevirtual 669	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   6650: astore_0
    //   6651: aload_0
    //   6652: arraylength
    //   6653: iconst_1
    //   6654: if_icmple +72 -> 6726
    //   6657: aload 6
    //   6659: new 113	java/lang/StringBuilder
    //   6662: dup
    //   6663: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   6666: aload_2
    //   6667: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6670: ldc_w 314
    //   6673: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6676: aload_0
    //   6677: iconst_1
    //   6678: aaload
    //   6679: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6682: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   6685: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6688: new 113	java/lang/StringBuilder
    //   6691: dup
    //   6692: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   6695: aload_2
    //   6696: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6699: ldc_w 314
    //   6702: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6705: aload_0
    //   6706: iconst_1
    //   6707: aaload
    //   6708: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6711: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   6714: astore_0
    //   6715: ldc2_w 188
    //   6718: sipush 3919
    //   6721: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   6724: aload_0
    //   6725: areturn
    //   6726: aload 6
    //   6728: aload_2
    //   6729: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6732: ldc2_w 188
    //   6735: sipush 3919
    //   6738: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   6741: aload_2
    //   6742: areturn
    //   6743: aload_0
    //   6744: invokestatic 292	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   6747: ifeq +10 -> 6757
    //   6750: aload 6
    //   6752: ldc 39
    //   6754: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6757: aload 18
    //   6759: invokestatic 292	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   6762: ifne +237 -> 6999
    //   6765: aload_0
    //   6766: astore_2
    //   6767: aload 19
    //   6769: ifnull +22 -> 6791
    //   6772: aload_0
    //   6773: astore_2
    //   6774: aload 19
    //   6776: invokevirtual 88	java/lang/String:length	()I
    //   6779: ifle +12 -> 6791
    //   6782: aload_0
    //   6783: aload 18
    //   6785: aload 19
    //   6787: invokestatic 678	com/tencent/mm/booter/notification/a/h:h	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6790: astore_2
    //   6791: aload 7
    //   6793: getfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6796: invokestatic 292	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   6799: ifeq +28 -> 6827
    //   6802: aload 6
    //   6804: aload 6
    //   6806: getfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6809: aload 18
    //   6811: ldc_w 468
    //   6814: invokestatic 678	com/tencent/mm/booter/notification/a/h:h	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6817: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6820: aload 7
    //   6822: aload 18
    //   6824: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6827: aload_2
    //   6828: invokestatic 683	com/tencent/mm/compatible/util/n:dT	(Ljava/lang/String;)Ljava/lang/String;
    //   6831: astore_0
    //   6832: aload 6
    //   6834: aload 6
    //   6836: getfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6839: invokestatic 683	com/tencent/mm/compatible/util/n:dT	(Ljava/lang/String;)Ljava/lang/String;
    //   6842: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6845: new 113	java/lang/StringBuilder
    //   6848: dup
    //   6849: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   6852: aload_0
    //   6853: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6856: aload_3
    //   6857: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6860: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   6863: astore_0
    //   6864: aload 6
    //   6866: new 113	java/lang/StringBuilder
    //   6869: dup
    //   6870: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   6873: aload 6
    //   6875: getfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6878: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6881: aload_3
    //   6882: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6885: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   6888: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6891: iload 9
    //   6893: ifeq +54 -> 6947
    //   6896: aload 6
    //   6898: getfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6901: invokevirtual 88	java/lang/String:length	()I
    //   6904: bipush 32
    //   6906: if_icmpne +88 -> 6994
    //   6909: iload 4
    //   6911: bipush 47
    //   6913: if_icmpeq +11 -> 6924
    //   6916: iload 4
    //   6918: ldc_w 684
    //   6921: if_icmpne +73 -> 6994
    //   6924: aload 6
    //   6926: aload_0
    //   6927: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   6930: iconst_1
    //   6931: istore_1
    //   6932: iload_1
    //   6933: ifne +14 -> 6947
    //   6936: iload 4
    //   6938: aload 6
    //   6940: aload 7
    //   6942: aload 8
    //   6944: invokestatic 687	com/tencent/mm/booter/notification/a/h:a	(ILcom/tencent/mm/pointers/PString;Lcom/tencent/mm/pointers/PString;Lcom/tencent/mm/pointers/PInt;)V
    //   6947: iload 11
    //   6949: ifeq +358 -> 7307
    //   6952: aload_0
    //   6953: new 113	java/lang/StringBuilder
    //   6956: dup
    //   6957: ldc_w 280
    //   6960: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   6963: aload 17
    //   6965: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   6968: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6971: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   6974: invokevirtual 690	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   6977: astore_0
    //   6978: aload_0
    //   6979: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   6982: astore_0
    //   6983: ldc2_w 188
    //   6986: sipush 3919
    //   6989: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   6992: aload_0
    //   6993: areturn
    //   6994: iconst_0
    //   6995: istore_1
    //   6996: goto -64 -> 6932
    //   6999: aload_2
    //   7000: invokestatic 283	com/tencent/mm/y/s:gc	(Ljava/lang/String;)Z
    //   7003: ifne +15 -> 7018
    //   7006: iload 12
    //   7008: ifne +10 -> 7018
    //   7011: aload_2
    //   7012: invokestatic 286	com/tencent/mm/y/s:gl	(Ljava/lang/String;)Z
    //   7015: ifeq +238 -> 7253
    //   7018: aload_0
    //   7019: astore_2
    //   7020: aload_3
    //   7021: ifnull +14 -> 7035
    //   7024: aload_0
    //   7025: astore_2
    //   7026: aload_3
    //   7027: invokevirtual 88	java/lang/String:length	()I
    //   7030: ifle +5 -> 7035
    //   7033: aload_3
    //   7034: astore_2
    //   7035: aload_2
    //   7036: invokestatic 292	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   7039: ifeq +29 -> 7068
    //   7042: aload 6
    //   7044: ldc 39
    //   7046: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   7049: aload 7
    //   7051: ldc 39
    //   7053: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   7056: ldc2_w 188
    //   7059: sipush 3919
    //   7062: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   7065: ldc 39
    //   7067: areturn
    //   7068: iload_1
    //   7069: ifne +104 -> 7173
    //   7072: aload 6
    //   7074: new 113	java/lang/StringBuilder
    //   7077: dup
    //   7078: ldc_w 341
    //   7081: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   7084: aload_2
    //   7085: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7088: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   7091: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   7094: iload 9
    //   7096: ifeq +115 -> 7211
    //   7099: iload 4
    //   7101: aload 6
    //   7103: aload 7
    //   7105: aload 8
    //   7107: invokestatic 687	com/tencent/mm/booter/notification/a/h:a	(ILcom/tencent/mm/pointers/PString;Lcom/tencent/mm/pointers/PString;Lcom/tencent/mm/pointers/PInt;)V
    //   7110: aload_2
    //   7111: astore_0
    //   7112: iload 11
    //   7114: ifeq +185 -> 7299
    //   7117: aload 17
    //   7119: ifnull +180 -> 7299
    //   7122: aload_0
    //   7123: new 113	java/lang/StringBuilder
    //   7126: dup
    //   7127: ldc_w 280
    //   7130: invokespecial 529	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   7133: aload 17
    //   7135: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7138: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   7141: invokevirtual 690	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   7144: astore_0
    //   7145: aload_0
    //   7146: astore_2
    //   7147: iload 13
    //   7149: ifeq +8 -> 7157
    //   7152: aload_0
    //   7153: invokestatic 623	com/tencent/mm/booter/notification/a/h:dF	(Ljava/lang/String;)Ljava/lang/String;
    //   7156: astore_2
    //   7157: aload_2
    //   7158: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   7161: astore_0
    //   7162: ldc2_w 188
    //   7165: sipush 3919
    //   7168: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   7171: aload_0
    //   7172: areturn
    //   7173: aload 6
    //   7175: new 113	java/lang/StringBuilder
    //   7178: dup
    //   7179: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   7182: aload 5
    //   7184: getstatic 693	com/tencent/mm/R$l:cTv	I
    //   7187: invokevirtual 135	android/content/Context:getString	(I)Ljava/lang/String;
    //   7190: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7193: ldc 78
    //   7195: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7198: aload_2
    //   7199: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7202: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   7205: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   7208: goto -114 -> 7094
    //   7211: new 113	java/lang/StringBuilder
    //   7214: dup
    //   7215: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   7218: aload 7
    //   7220: getfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   7223: invokestatic 105	com/tencent/mm/y/r:fs	(Ljava/lang/String;)Ljava/lang/String;
    //   7226: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7229: ldc 78
    //   7231: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7234: aload_2
    //   7235: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7238: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   7241: astore_0
    //   7242: ldc2_w 188
    //   7245: sipush 3919
    //   7248: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   7251: aload_0
    //   7252: areturn
    //   7253: aload_3
    //   7254: ifnull +48 -> 7302
    //   7257: aload_3
    //   7258: invokevirtual 88	java/lang/String:length	()I
    //   7261: ifle +41 -> 7302
    //   7264: aload 6
    //   7266: aload_3
    //   7267: putfield 108	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   7270: aload_3
    //   7271: astore_2
    //   7272: aload_2
    //   7273: astore_0
    //   7274: iload 9
    //   7276: ifeq -164 -> 7112
    //   7279: iload 4
    //   7281: aload 6
    //   7283: aload 7
    //   7285: aload 8
    //   7287: invokestatic 687	com/tencent/mm/booter/notification/a/h:a	(ILcom/tencent/mm/pointers/PString;Lcom/tencent/mm/pointers/PString;Lcom/tencent/mm/pointers/PInt;)V
    //   7290: aload_2
    //   7291: astore_0
    //   7292: goto -180 -> 7112
    //   7295: astore_3
    //   7296: goto -927 -> 6369
    //   7299: goto -154 -> 7145
    //   7302: aload_0
    //   7303: astore_2
    //   7304: goto -32 -> 7272
    //   7307: goto -329 -> 6978
    //   7310: ldc 39
    //   7312: astore 20
    //   7314: aconst_null
    //   7315: astore 17
    //   7317: aload_3
    //   7318: astore_0
    //   7319: iconst_0
    //   7320: istore 11
    //   7322: aload 20
    //   7324: astore_3
    //   7325: goto -6430 -> 895
    //   7328: iconst_0
    //   7329: istore 11
    //   7331: aconst_null
    //   7332: astore 17
    //   7334: goto -6439 -> 895
    //   7337: aload_2
    //   7338: astore_0
    //   7339: goto -4911 -> 2428
    //   7342: aload_2
    //   7343: astore_0
    //   7344: goto -4911 -> 2433
    //   7347: iload 11
    //   7349: istore 12
    //   7351: goto -6857 -> 494
    //   7354: aload_3
    //   7355: astore 20
    //   7357: ldc 39
    //   7359: astore 19
    //   7361: ldc 39
    //   7363: astore 18
    //   7365: goto -6933 -> 432
    //   7368: iconst_0
    //   7369: istore 13
    //   7371: goto -7016 -> 355
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	7374	0	paramString1	String
    //   0	7374	1	paramInt1	int
    //   0	7374	2	paramString2	String
    //   0	7374	3	paramString3	String
    //   0	7374	4	paramInt2	int
    //   0	7374	5	paramContext	Context
    //   0	7374	6	paramPString1	PString
    //   0	7374	7	paramPString2	PString
    //   0	7374	8	paramPInt	PInt
    //   0	7374	9	paramBoolean1	boolean
    //   0	7374	10	paramBoolean2	boolean
    //   64	7284	11	i	int
    //   489	6861	12	j	int
    //   353	7017	13	k	int
    //   15	84	14	bool	boolean
    //   213	82	15	l	long
    //   458	6875	17	localObject1	Object
    //   393	6971	18	str1	String
    //   401	6959	19	str2	String
    //   430	6926	20	localObject2	Object
    //   3993	2090	21	locala	com.tencent.mm.x.f.a
    // Exception table:
    //   from	to	target	type
    //   6329	6341	6368	java/lang/Exception
    //   6343	6348	6368	java/lang/Exception
    //   6350	6356	7295	java/lang/Exception
  }
  
  private static void a(int paramInt, PString paramPString1, PString paramPString2, PInt paramPInt)
  {
    int i = 150;
    GMTrace.i(526804582400L, 3925);
    if ((paramPString1.value.length() == 32) && ((paramInt == 47) || (paramInt == 1048625)))
    {
      GMTrace.o(526804582400L, 3925);
      return;
    }
    String str;
    if (paramPString1.value.length() >= 150)
    {
      localObject = paramPString1.value;
      str = paramPString1.value;
      paramInt = i;
      if (paramInt >= str.length()) {
        break label165;
      }
      if (str.charAt(paramInt) != '%') {
        label97:
        paramPString1.value = ((String)localObject).substring(0, paramInt);
      }
    }
    else
    {
      if (fLJ != null) {
        break label174;
      }
    }
    label165:
    label174:
    for (Object localObject = null;; localObject = (TextPaint)fLJ.get())
    {
      if ((!paramPString1.value.replace("%%", "").contains("%s")) && (localObject != null)) {
        break label188;
      }
      paramPInt.value = 0;
      GMTrace.o(526804582400L, 3925);
      return;
      paramInt += 1;
      break;
      paramInt = str.length();
      break label97;
    }
    try
    {
      label188:
      paramPString2 = String.format(paramPString1.value, new Object[] { paramPString2.value });
      if (fLK > 0)
      {
        paramInt = fLK;
        paramPString1.value = TextUtils.ellipsize(paramPString2, (TextPaint)localObject, paramInt, TextUtils.TruncateAt.END).toString();
        paramPInt.value = 1;
        GMTrace.o(526804582400L, 3925);
        return;
      }
    }
    catch (Exception paramPString2)
    {
      for (;;)
      {
        paramPString2 = paramPString1.value;
        continue;
        paramInt = BackwardSupportUtil.b.a(ab.getContext(), 200.0F);
      }
    }
  }
  
  public static void a(TextPaint paramTextPaint)
  {
    GMTrace.i(527207235584L, 3928);
    if ((fLJ == null) || (fLJ.get() == null)) {
      fLJ = new WeakReference(paramTextPaint);
    }
    GMTrace.o(527207235584L, 3928);
  }
  
  public static String b(au paramau, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean)
  {
    GMTrace.i(525730840576L, 3917);
    if (paramau.bTB()) {}
    for (String str = paramau.bTY();; str = paramau.field_content)
    {
      str = com.tencent.mm.pluginsdk.ui.d.h.Pz(str);
      paramau = bg.nl(a(paramau.field_imgPath, paramau.field_isSend, paramau.field_talker, str, paramau.field_type, ab.getContext(), paramPString1, paramPString2, paramPInt, true, paramBoolean));
      GMTrace.o(525730840576L, 3917);
      return paramau;
    }
  }
  
  public static String b(x paramx)
  {
    GMTrace.i(525596622848L, 3916);
    Object localObject = ab.getContext();
    if (paramx == null)
    {
      paramx = ((Context)localObject).getString(R.l.dbw);
      GMTrace.o(525596622848L, 3916);
      return paramx;
    }
    if (RegionCodeDecoder.Uu(paramx.getCountryCode()))
    {
      localObject = paramx.getCity();
      if (!bg.nm((String)localObject))
      {
        GMTrace.o(525596622848L, 3916);
        return (String)localObject;
      }
      localObject = r.fu(paramx.getProvince());
      if (!bg.nm((String)localObject))
      {
        GMTrace.o(525596622848L, 3916);
        return (String)localObject;
      }
      RegionCodeDecoder.bUl();
      paramx = RegionCodeDecoder.getLocName(paramx.getCountryCode());
      GMTrace.o(525596622848L, 3916);
      return paramx;
    }
    paramx = r.fu(paramx.getProvince());
    if (!bg.nm(paramx))
    {
      GMTrace.o(525596622848L, 3916);
      return paramx;
    }
    paramx = ((Context)localObject).getString(R.l.dbw);
    GMTrace.o(525596622848L, 3916);
    return paramx;
  }
  
  public static String c(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(527341453312L, 3929);
    paramString = b.bRv().SZ(paramString);
    if (paramBoolean)
    {
      GMTrace.o(527341453312L, 3929);
      return paramString;
    }
    paramContext = paramContext.getString(R.l.dDi);
    GMTrace.o(527341453312L, 3929);
    return paramContext;
  }
  
  public static String d(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(527609888768L, 3931);
    if (paramBoolean)
    {
      paramContext = b.bRv().SZ(paramString);
      GMTrace.o(527609888768L, 3931);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.dMH);
    GMTrace.o(527609888768L, 3931);
    return paramContext;
  }
  
  private static String dE(String paramString)
  {
    GMTrace.i(526267711488L, 3921);
    if (paramString != null)
    {
      paramString = paramString.replaceAll("%", "%%");
      GMTrace.o(526267711488L, 3921);
      return paramString;
    }
    GMTrace.o(526267711488L, 3921);
    return paramString;
  }
  
  private static String dF(String paramString)
  {
    GMTrace.i(526536146944L, 3923);
    if (paramString != null)
    {
      paramString = paramString.replaceAll("%%", "%");
      GMTrace.o(526536146944L, 3923);
      return paramString;
    }
    GMTrace.o(526536146944L, 3923);
    return paramString;
  }
  
  public static String dG(String paramString)
  {
    GMTrace.i(526670364672L, 3924);
    if (paramString == null)
    {
      GMTrace.o(526670364672L, 3924);
      return "";
    }
    if (paramString.length() < 150)
    {
      GMTrace.o(526670364672L, 3924);
      return paramString;
    }
    paramString = paramString.substring(0, 150) + "...";
    GMTrace.o(526670364672L, 3924);
    return paramString;
  }
  
  public static void ed(int paramInt)
  {
    GMTrace.i(526938800128L, 3926);
    fLK = paramInt;
    GMTrace.o(526938800128L, 3926);
  }
  
  public static void ee(int paramInt)
  {
    GMTrace.i(527073017856L, 3927);
    fLL = paramInt;
    GMTrace.o(527073017856L, 3927);
  }
  
  public static String g(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(525462405120L, 3915);
    if (s.eb(paramString1))
    {
      paramString2 = bc.gP(paramString2);
      if (paramString2 != null) {
        paramString2 = r.fs(paramString2.trim());
      }
    }
    while (paramString1.contains("@bottle"))
    {
      paramContext = paramContext.getResources().getQuantityString(R.j.cIw, 1, new Object[] { Integer.valueOf(1) });
      GMTrace.o(525462405120L, 3915);
      return paramContext;
      paramString2 = r.fs(paramString1);
      continue;
      paramString2 = r.fs(paramString1);
    }
    String str = paramString2;
    if (bg.nm(paramString2))
    {
      str = paramString2;
      if (s.eb(paramString1)) {
        str = paramContext.getString(R.l.dhh);
      }
    }
    paramContext = b.bRv().SZ(str);
    GMTrace.o(525462405120L, 3915);
    return paramContext;
  }
  
  private static String h(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(526401929216L, 3922);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (bg.nm(paramString3)))
    {
      GMTrace.o(526401929216L, 3922);
      return paramString1;
    }
    int i = paramString1.indexOf(paramString2);
    if (i < 0)
    {
      GMTrace.o(526401929216L, 3922);
      return paramString1;
    }
    paramString1 = paramString1.substring(0, i) + paramString3 + paramString1.substring(i + paramString2.length());
    GMTrace.o(526401929216L, 3922);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */