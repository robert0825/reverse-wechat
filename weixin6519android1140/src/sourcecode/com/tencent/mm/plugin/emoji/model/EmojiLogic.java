package com.tencent.mm.plugin.emoji.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.a.c.i;
import com.tencent.mm.ao.n;
import com.tencent.mm.modelcontrol.b;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.zw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.File;
import java.util.Map;

public class EmojiLogic
{
  public static final String kkd;
  
  static
  {
    GMTrace.i(11313749164032L, 84294);
    kkd = File.separator;
    GMTrace.o(11313749164032L, 84294);
  }
  
  public EmojiLogic()
  {
    GMTrace.i(11309722632192L, 84264);
    GMTrace.o(11309722632192L, 84264);
  }
  
  public static String F(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = null;
    GMTrace.i(11312943857664L, 84288);
    if ((bg.nm(paramString2)) && (bg.nm(paramString3)))
    {
      w.w("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path failed. productid and url are null.");
      GMTrace.o(11312943857664L, 84288);
      return null;
    }
    String str = bV(paramString2, paramString3);
    paramString3 = (String)localObject;
    if (!bg.nm(str)) {
      if (!bg.nm(paramString2)) {
        break label95;
      }
    }
    label95:
    for (paramString3 = paramString1 + str;; paramString3 = paramString1 + paramString2 + kkd + str)
    {
      GMTrace.o(11312943857664L, 84288);
      return paramString3;
    }
  }
  
  public static String G(String paramString1, String paramString2, String paramString3)
  {
    String str = null;
    GMTrace.i(11313078075392L, 84289);
    if ((bg.nm(paramString2)) && (bg.nm(paramString3)))
    {
      w.w("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path failed. productid and md5 are null.");
      GMTrace.o(11313078075392L, 84289);
      return null;
    }
    if (!bg.nm(paramString3)) {
      if (!bg.nm(paramString2)) {
        break label107;
      }
    }
    label107:
    for (str = paramString1 + paramString3;; str = paramString1 + paramString2 + kkd + paramString3)
    {
      w.d("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path. productid:%s md5:%s path:%s", new Object[] { paramString2, paramString3, str });
      GMTrace.o(11313078075392L, 84289);
      return str;
    }
  }
  
  public static EmojiInfo a(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(11310662156288L, 84271);
    if (TextUtils.isEmpty(paramString1))
    {
      w.d("MicroMsg.emoji.EmojiLogic", "getIcon : productId is null.");
      GMTrace.o(11310662156288L, 84271);
      return null;
    }
    EmojiInfo localEmojiInfo = new EmojiInfo();
    if (paramBoolean)
    {
      at.AR();
      str = F(c.zb(), paramString1, paramString2);
      int j = 0;
      int i = j;
      if (e.aZ(str))
      {
        File localFile = new File(str);
        i = j;
        if (localFile.exists())
        {
          if (localFile.length() >= 1L) {
            break label163;
          }
          localFile.delete();
          i = j;
        }
      }
      while (i == 0)
      {
        w.d("MicroMsg.emoji.EmojiLogic", "banner icon does not exist. icon path :" + str + "...., icon type:" + paramInt);
        GMTrace.o(11310662156288L, 84271);
        return null;
        label163:
        i = 1;
        localEmojiInfo.field_type = af(e.c(str, 0, 10));
      }
    }
    at.AR();
    String str = F(c.zb(), paramString1, paramString2);
    if (!e.aZ(str))
    {
      w.d("MicroMsg.emoji.EmojiLogic", "icon file no exist. path:%s type:%d, url:%s", new Object[] { str, Integer.valueOf(paramInt), paramString2 });
      GMTrace.o(11310662156288L, 84271);
      return null;
    }
    localEmojiInfo.field_md5 = bV(paramString1, paramString2);
    switch (paramInt)
    {
    default: 
      paramInt = EmojiInfo.vCq;
    }
    for (;;)
    {
      localEmojiInfo.field_catalog = paramInt;
      localEmojiInfo.field_groupId = paramString1;
      localEmojiInfo.field_temp = 1;
      GMTrace.o(11310662156288L, 84271);
      return localEmojiInfo;
      paramInt = 82;
      continue;
      paramInt = 83;
      continue;
      paramInt = 84;
    }
  }
  
  public static EmojiInfo a(String paramString1, String paramString2, i parami)
  {
    GMTrace.i(11310527938560L, 84270);
    at.AR();
    if (!c.isSDCardAvailable())
    {
      if (ab.getContext() == null)
      {
        GMTrace.o(11310527938560L, 84270);
        return null;
      }
      if (ab.getContext().getResources() == null)
      {
        GMTrace.o(11310527938560L, 84270);
        return null;
      }
      new EmojiInfo().field_type = EmojiInfo.vCv;
      GMTrace.o(11310527938560L, 84270);
      return null;
    }
    EmojiInfo localEmojiInfo = a(paramString1, 4, paramString2, true);
    if (localEmojiInfo == null)
    {
      n.Jd().a(paramString2, null, f.b(paramString1, paramString2, new Object[0]), parami);
      w.i("MicroMsg.emoji.EmojiLogic", "[cpan] get emoji info, try to load image:%s", new Object[] { paramString2 });
    }
    GMTrace.o(11310527938560L, 84270);
    return localEmojiInfo;
  }
  
  public static String a(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2)
  {
    GMTrace.i(11312004333568L, 84281);
    if (paramInt1 > 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<xml>");
      localStringBuilder.append("<tid>" + paramInt1 + "</tid>");
      localStringBuilder.append("<title>" + paramString1 + "</title>");
      localStringBuilder.append("<desc>" + paramString2 + "</desc>");
      localStringBuilder.append("<iconUrl>" + paramString3 + "</iconUrl>");
      localStringBuilder.append("<secondUrl>" + paramString4 + "</secondUrl>");
      localStringBuilder.append("<pageType>" + paramInt2 + "</pageType>");
      localStringBuilder.append("</xml>");
      paramString1 = localStringBuilder.toString();
      w.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", new Object[] { paramString1 });
      GMTrace.o(11312004333568L, 84281);
      return paramString1;
    }
    GMTrace.o(11312004333568L, 84281);
    return null;
  }
  
  public static void a(Context paramContext, byte[] paramArrayOfByte, String paramString1, String paramString2, EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(11310393720832L, 84269);
    boolean bool;
    label53:
    int i;
    int j;
    float f;
    if (paramArrayOfByte == null) {
      if (paramEmojiInfo == null)
      {
        bool = true;
        w.d("MicroMsg.emoji.EmojiLogic", "insertEmoji: thumb is null, emojiInfo is null ? %B", new Object[] { Boolean.valueOf(bool) });
        if (paramEmojiInfo == null) {
          break label272;
        }
        paramContext = paramEmojiInfo.eT(paramContext);
        if ((paramContext == null) || ((paramContext.getWidth() <= 300) && (paramContext.getHeight() <= 300))) {
          break label406;
        }
        i = paramContext.getWidth();
        j = paramContext.getHeight();
        w.i("MicroMsg.emoji.EmojiLogic", "cpan app msg width:%d height:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (i <= j) {
          break label290;
        }
        f = j / i;
        j = 300;
        i = (int)(f * 300.0F);
        label147:
        w.i("MicroMsg.emoji.EmojiLogic", "cpan app msg new width:%d new height:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        paramContext = com.tencent.mm.sdk.platformtools.d.a(paramContext, i, j, false, true);
      }
    }
    label272:
    label290:
    label406:
    for (;;)
    {
      if (paramContext != null) {}
      try
      {
        if (paramContext.getByteCount() > 32768)
        {
          com.tencent.mm.sdk.platformtools.d.a(paramContext, 80, Bitmap.CompressFormat.JPEG, paramString2 + paramString1 + "_thumb", true);
          w.i("MicroMsg.emoji.EmojiLogic", "cpan app msg bitmap is over size. save as jpg. size :%d", new Object[] { Integer.valueOf(paramContext.getByteCount()) });
          GMTrace.o(11310393720832L, 84269);
          return;
          bool = false;
          break;
          GMTrace.o(11310393720832L, 84269);
          return;
          paramContext = com.tencent.mm.sdk.platformtools.d.bg(paramArrayOfByte);
          break label53;
          f = i / j;
          i = 300;
          j = (int)(f * 300.0F);
          break label147;
        }
        com.tencent.mm.sdk.platformtools.d.a(paramContext, 100, Bitmap.CompressFormat.PNG, paramString2 + paramString1 + "_thumb", true);
        w.i("MicroMsg.emoji.EmojiLogic", "cpan app msg bitmap is in normal size. sav as png. size :%d", new Object[] { Integer.valueOf(paramContext.getByteCount()) });
        GMTrace.o(11310393720832L, 84269);
        return;
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.emoji.EmojiLogic", paramContext, "insertEmoji Error", new Object[0]);
        GMTrace.o(11310393720832L, 84269);
        return;
      }
    }
  }
  
  private static void a(Context paramContext, byte[] paramArrayOfByte1, String paramString1, byte[] paramArrayOfByte2, String paramString2)
  {
    GMTrace.i(11310259503104L, 84268);
    if ((paramString1 == null) && (paramArrayOfByte2 == null))
    {
      GMTrace.o(11310259503104L, 84268);
      return;
    }
    at.AR();
    String str = c.zb();
    e.b(str + paramString1, paramArrayOfByte2, paramArrayOfByte2.length);
    if (com.tencent.mm.sdk.platformtools.o.bi(paramArrayOfByte2)) {}
    for (paramArrayOfByte2 = h.arl().kjy.a(paramString1, "", EmojiInfo.vCo, EmojiInfo.vCy, paramArrayOfByte2.length, paramString2, "");; paramArrayOfByte2 = h.arl().kjy.a(paramString1, "", EmojiInfo.vCo, EmojiInfo.vCz, paramArrayOfByte2.length, paramString2, ""))
    {
      a(paramContext, paramArrayOfByte1, paramString1, str, paramArrayOfByte2);
      GMTrace.o(11310259503104L, 84268);
      return;
    }
  }
  
  /* Error */
  public static boolean a(String paramString1, String paramString2, com.tencent.mm.storage.emotion.EmojiGroupInfo paramEmojiGroupInfo)
  {
    // Byte code:
    //   0: ldc2_w 367
    //   3: ldc_w 369
    //   6: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 61	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   16: getstatic 374	com/tencent/mm/compatible/util/e:fRX	Ljava/lang/String;
    //   19: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: aload_0
    //   23: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: astore 9
    //   31: new 61	java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   38: astore 7
    //   40: invokestatic 106	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   43: pop
    //   44: aload 7
    //   46: invokestatic 111	com/tencent/mm/y/c:zb	()Ljava/lang/String;
    //   49: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: aload_0
    //   53: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: astore 18
    //   61: aconst_null
    //   62: astore 7
    //   64: aconst_null
    //   65: astore 8
    //   67: new 376	java/util/HashMap
    //   70: dup
    //   71: invokespecial 377	java/util/HashMap:<init>	()V
    //   74: astore 19
    //   76: new 379	java/util/ArrayList
    //   79: dup
    //   80: invokespecial 380	java/util/ArrayList:<init>	()V
    //   83: astore 17
    //   85: new 382	java/util/zip/ZipFile
    //   88: dup
    //   89: aload 9
    //   91: invokespecial 383	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   94: astore 9
    //   96: aload 9
    //   98: invokevirtual 387	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   101: astore 20
    //   103: iconst_0
    //   104: istore_3
    //   105: aconst_null
    //   106: astore 8
    //   108: aconst_null
    //   109: astore 7
    //   111: aload 8
    //   113: astore 11
    //   115: aload 7
    //   117: astore 12
    //   119: aload 8
    //   121: astore 13
    //   123: aload 7
    //   125: astore 10
    //   127: aload 20
    //   129: invokeinterface 392 1 0
    //   134: ifeq +1318 -> 1452
    //   137: aload 8
    //   139: astore 11
    //   141: aload 7
    //   143: astore 12
    //   145: aload 8
    //   147: astore 13
    //   149: aload 7
    //   151: astore 10
    //   153: aload 20
    //   155: invokeinterface 396 1 0
    //   160: checkcast 398	java/util/zip/ZipEntry
    //   163: astore 14
    //   165: aload 8
    //   167: astore 11
    //   169: aload 7
    //   171: astore 12
    //   173: aload 8
    //   175: astore 13
    //   177: aload 7
    //   179: astore 10
    //   181: aload 14
    //   183: invokevirtual 401	java/util/zip/ZipEntry:isDirectory	()Z
    //   186: ifne +2784 -> 2970
    //   189: aload 8
    //   191: astore 11
    //   193: aload 7
    //   195: astore 12
    //   197: aload 8
    //   199: astore 13
    //   201: aload 7
    //   203: astore 10
    //   205: aload 9
    //   207: aload 14
    //   209: invokevirtual 405	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   212: astore 7
    //   214: aload 8
    //   216: astore 11
    //   218: aload 7
    //   220: astore 12
    //   222: aload 8
    //   224: astore 10
    //   226: aload 7
    //   228: astore 13
    //   230: aload 14
    //   232: invokevirtual 408	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   235: aload 14
    //   237: invokevirtual 408	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   240: ldc_w 410
    //   243: invokevirtual 416	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   246: iconst_1
    //   247: iadd
    //   248: invokevirtual 420	java/lang/String:substring	(I)Ljava/lang/String;
    //   251: invokevirtual 423	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   254: astore 21
    //   256: aload 8
    //   258: astore 11
    //   260: aload 7
    //   262: astore 12
    //   264: aload 8
    //   266: astore 10
    //   268: aload 7
    //   270: astore 13
    //   272: new 19	java/io/File
    //   275: dup
    //   276: new 61	java/lang/StringBuilder
    //   279: dup
    //   280: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   283: aload 18
    //   285: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: ldc_w 410
    //   291: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: aload 14
    //   296: invokevirtual 408	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   299: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   305: invokespecial 121	java/io/File:<init>	(Ljava/lang/String;)V
    //   308: astore 15
    //   310: aload 8
    //   312: astore 11
    //   314: aload 7
    //   316: astore 12
    //   318: aload 8
    //   320: astore 10
    //   322: aload 7
    //   324: astore 13
    //   326: aload 15
    //   328: invokevirtual 426	java/io/File:isFile	()Z
    //   331: ifeq +25 -> 356
    //   334: aload 8
    //   336: astore 11
    //   338: aload 7
    //   340: astore 12
    //   342: aload 8
    //   344: astore 10
    //   346: aload 7
    //   348: astore 13
    //   350: aload 15
    //   352: invokevirtual 132	java/io/File:delete	()Z
    //   355: pop
    //   356: aload 8
    //   358: astore 11
    //   360: aload 7
    //   362: astore 12
    //   364: aload 8
    //   366: astore 10
    //   368: aload 7
    //   370: astore 13
    //   372: aload 15
    //   374: invokevirtual 430	java/io/File:getParentFile	()Ljava/io/File;
    //   377: invokevirtual 433	java/io/File:mkdirs	()Z
    //   380: pop
    //   381: aload 8
    //   383: astore 11
    //   385: aload 7
    //   387: astore 12
    //   389: aload 8
    //   391: astore 10
    //   393: aload 7
    //   395: astore 13
    //   397: aload 21
    //   399: ldc_w 435
    //   402: invokevirtual 438	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   405: ifne +2568 -> 2973
    //   408: aload 8
    //   410: astore 11
    //   412: aload 7
    //   414: astore 12
    //   416: aload 8
    //   418: astore 10
    //   420: aload 7
    //   422: astore 13
    //   424: aload 21
    //   426: ldc_w 440
    //   429: invokevirtual 443	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   432: ifne +30 -> 462
    //   435: aload 8
    //   437: astore 11
    //   439: aload 7
    //   441: astore 12
    //   443: aload 8
    //   445: astore 10
    //   447: aload 7
    //   449: astore 13
    //   451: aload 21
    //   453: ldc_w 445
    //   456: invokevirtual 443	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   459: ifeq +2514 -> 2973
    //   462: aload 8
    //   464: astore 11
    //   466: aload 7
    //   468: astore 12
    //   470: aload 8
    //   472: astore 10
    //   474: aload 7
    //   476: astore 13
    //   478: aload 14
    //   480: invokevirtual 408	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   483: invokevirtual 423	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   486: ldc_w 447
    //   489: invokevirtual 450	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   492: ifeq +793 -> 1285
    //   495: aload 8
    //   497: astore 11
    //   499: aload 7
    //   501: astore 12
    //   503: aload 8
    //   505: astore 10
    //   507: aload 7
    //   509: astore 13
    //   511: new 452	java/io/FileOutputStream
    //   514: dup
    //   515: new 61	java/lang/StringBuilder
    //   518: dup
    //   519: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   522: aload 18
    //   524: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: getstatic 22	java/io/File:separator	Ljava/lang/String;
    //   530: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   533: aload 21
    //   535: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   538: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   541: invokespecial 453	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   544: astore 8
    //   546: ldc_w 454
    //   549: newarray <illegal type>
    //   551: astore 10
    //   553: aload 7
    //   555: aload 10
    //   557: invokevirtual 459	java/io/InputStream:read	([B)I
    //   560: istore 4
    //   562: iload 4
    //   564: ifle +92 -> 656
    //   567: aload 8
    //   569: aload 10
    //   571: iconst_0
    //   572: iload 4
    //   574: invokevirtual 465	java/io/OutputStream:write	([BII)V
    //   577: goto -24 -> 553
    //   580: astore 10
    //   582: aload 9
    //   584: astore_0
    //   585: aload 8
    //   587: astore_1
    //   588: aload 7
    //   590: astore_2
    //   591: aload 10
    //   593: astore 7
    //   595: ldc 47
    //   597: new 61	java/lang/StringBuilder
    //   600: dup
    //   601: ldc_w 467
    //   604: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   607: aload 7
    //   609: invokevirtual 470	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   612: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   615: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   618: invokestatic 473	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   621: aload_1
    //   622: ifnull +7 -> 629
    //   625: aload_1
    //   626: invokevirtual 476	java/io/OutputStream:close	()V
    //   629: aload_2
    //   630: ifnull +7 -> 637
    //   633: aload_2
    //   634: invokevirtual 477	java/io/InputStream:close	()V
    //   637: aload_0
    //   638: ifnull +7 -> 645
    //   641: aload_0
    //   642: invokevirtual 478	java/util/zip/ZipFile:close	()V
    //   645: ldc2_w 367
    //   648: ldc_w 369
    //   651: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   654: iconst_0
    //   655: ireturn
    //   656: aload 8
    //   658: invokevirtual 476	java/io/OutputStream:close	()V
    //   661: aconst_null
    //   662: astore 15
    //   664: aconst_null
    //   665: astore 14
    //   667: aload 14
    //   669: astore 11
    //   671: aload 7
    //   673: astore 12
    //   675: aload 15
    //   677: astore 10
    //   679: aload 7
    //   681: astore 13
    //   683: new 61	java/lang/StringBuilder
    //   686: dup
    //   687: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   690: aload 18
    //   692: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   695: getstatic 22	java/io/File:separator	Ljava/lang/String;
    //   698: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   701: aload 21
    //   703: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   706: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   709: invokestatic 483	com/tencent/mm/a/g:bg	(Ljava/lang/String;)Ljava/lang/String;
    //   712: astore 22
    //   714: aload 14
    //   716: astore 11
    //   718: aload 7
    //   720: astore 12
    //   722: aload 15
    //   724: astore 10
    //   726: aload 7
    //   728: astore 13
    //   730: ldc 47
    //   732: ldc_w 485
    //   735: iconst_2
    //   736: anewarray 4	java/lang/Object
    //   739: dup
    //   740: iconst_0
    //   741: aload 22
    //   743: aastore
    //   744: dup
    //   745: iconst_1
    //   746: iload_3
    //   747: invokestatic 160	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   750: aastore
    //   751: invokestatic 220	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   754: aload 14
    //   756: astore 11
    //   758: aload 7
    //   760: astore 12
    //   762: aload 15
    //   764: astore 10
    //   766: aload 7
    //   768: astore 13
    //   770: new 19	java/io/File
    //   773: dup
    //   774: new 61	java/lang/StringBuilder
    //   777: dup
    //   778: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   781: aload 18
    //   783: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   786: getstatic 22	java/io/File:separator	Ljava/lang/String;
    //   789: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   792: aload 21
    //   794: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   797: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   800: invokespecial 121	java/io/File:<init>	(Ljava/lang/String;)V
    //   803: astore 23
    //   805: aload 14
    //   807: astore 11
    //   809: aload 7
    //   811: astore 12
    //   813: aload 15
    //   815: astore 10
    //   817: aload 7
    //   819: astore 13
    //   821: new 19	java/io/File
    //   824: dup
    //   825: new 61	java/lang/StringBuilder
    //   828: dup
    //   829: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   832: aload 18
    //   834: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   837: getstatic 22	java/io/File:separator	Ljava/lang/String;
    //   840: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   843: aload 22
    //   845: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   848: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   851: invokespecial 121	java/io/File:<init>	(Ljava/lang/String;)V
    //   854: astore 24
    //   856: aload 14
    //   858: astore 11
    //   860: aload 7
    //   862: astore 12
    //   864: aload 15
    //   866: astore 10
    //   868: aload 7
    //   870: astore 13
    //   872: aload 23
    //   874: invokevirtual 488	java/io/File:getPath	()Ljava/lang/String;
    //   877: invokestatic 491	com/tencent/mm/sdk/platformtools/o:RH	(Ljava/lang/String;)Z
    //   880: ifeq +381 -> 1261
    //   883: aload 14
    //   885: astore 11
    //   887: aload 7
    //   889: astore 12
    //   891: aload 15
    //   893: astore 10
    //   895: aload 7
    //   897: astore 13
    //   899: getstatic 494	com/tencent/mm/storage/emotion/EmojiInfo:vCw	I
    //   902: istore 4
    //   904: aload 14
    //   906: astore 11
    //   908: aload 7
    //   910: astore 12
    //   912: aload 15
    //   914: astore 10
    //   916: aload 7
    //   918: astore 13
    //   920: invokestatic 341	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   923: getfield 347	com/tencent/mm/plugin/emoji/e/l:kjy	Lcom/tencent/mm/storage/emotion/d;
    //   926: aload 22
    //   928: invokevirtual 498	com/tencent/mm/storage/emotion/d:UK	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   931: astore 16
    //   933: aload 16
    //   935: astore 8
    //   937: aload 16
    //   939: ifnonnull +50 -> 989
    //   942: aload 14
    //   944: astore 11
    //   946: aload 7
    //   948: astore 12
    //   950: aload 15
    //   952: astore 10
    //   954: aload 7
    //   956: astore 13
    //   958: new 99	com/tencent/mm/storage/emotion/EmojiInfo
    //   961: dup
    //   962: invokespecial 100	com/tencent/mm/storage/emotion/EmojiInfo:<init>	()V
    //   965: astore 8
    //   967: aload 14
    //   969: astore 11
    //   971: aload 7
    //   973: astore 12
    //   975: aload 15
    //   977: astore 10
    //   979: aload 7
    //   981: astore 13
    //   983: aload 8
    //   985: iconst_0
    //   986: putfield 169	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   989: aload 14
    //   991: astore 11
    //   993: aload 7
    //   995: astore 12
    //   997: aload 15
    //   999: astore 10
    //   1001: aload 7
    //   1003: astore 13
    //   1005: aload 8
    //   1007: aload 21
    //   1009: putfield 501	com/tencent/mm/storage/emotion/EmojiInfo:field_name	Ljava/lang/String;
    //   1012: aload 14
    //   1014: astore 11
    //   1016: aload 7
    //   1018: astore 12
    //   1020: aload 15
    //   1022: astore 10
    //   1024: aload 7
    //   1026: astore 13
    //   1028: aload 8
    //   1030: aload 22
    //   1032: putfield 163	com/tencent/mm/storage/emotion/EmojiInfo:field_md5	Ljava/lang/String;
    //   1035: aload 14
    //   1037: astore 11
    //   1039: aload 7
    //   1041: astore 12
    //   1043: aload 15
    //   1045: astore 10
    //   1047: aload 7
    //   1049: astore 13
    //   1051: aload 8
    //   1053: aload 23
    //   1055: invokevirtual 129	java/io/File:length	()J
    //   1058: l2i
    //   1059: putfield 504	com/tencent/mm/storage/emotion/EmojiInfo:field_size	I
    //   1062: aload 14
    //   1064: astore 11
    //   1066: aload 7
    //   1068: astore 12
    //   1070: aload 15
    //   1072: astore 10
    //   1074: aload 7
    //   1076: astore 13
    //   1078: aload 8
    //   1080: iload 4
    //   1082: putfield 152	com/tencent/mm/storage/emotion/EmojiInfo:field_type	I
    //   1085: aload 14
    //   1087: astore 11
    //   1089: aload 7
    //   1091: astore 12
    //   1093: aload 15
    //   1095: astore 10
    //   1097: aload 7
    //   1099: astore 13
    //   1101: aload 8
    //   1103: aload_0
    //   1104: putfield 172	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   1107: aload 14
    //   1109: astore 11
    //   1111: aload 7
    //   1113: astore 12
    //   1115: aload 15
    //   1117: astore 10
    //   1119: aload 7
    //   1121: astore 13
    //   1123: aload 8
    //   1125: iload_3
    //   1126: putfield 507	com/tencent/mm/storage/emotion/EmojiInfo:field_idx	I
    //   1129: aload 14
    //   1131: astore 11
    //   1133: aload 7
    //   1135: astore 12
    //   1137: aload 15
    //   1139: astore 10
    //   1141: aload 7
    //   1143: astore 13
    //   1145: aload 17
    //   1147: aload 8
    //   1149: invokevirtual 511	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1152: pop
    //   1153: aload 14
    //   1155: astore 11
    //   1157: aload 7
    //   1159: astore 12
    //   1161: aload 15
    //   1163: astore 10
    //   1165: aload 7
    //   1167: astore 13
    //   1169: aload 23
    //   1171: aload 24
    //   1173: invokevirtual 515	java/io/File:renameTo	(Ljava/io/File;)Z
    //   1176: pop
    //   1177: aload 14
    //   1179: astore 11
    //   1181: aload 7
    //   1183: astore 12
    //   1185: aload 15
    //   1187: astore 10
    //   1189: aload 7
    //   1191: astore 13
    //   1193: aload 19
    //   1195: aload 21
    //   1197: iconst_0
    //   1198: aload 21
    //   1200: invokevirtual 517	java/lang/String:length	()I
    //   1203: iconst_4
    //   1204: isub
    //   1205: invokevirtual 520	java/lang/String:substring	(II)Ljava/lang/String;
    //   1208: aload 22
    //   1210: invokevirtual 524	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1213: pop
    //   1214: aconst_null
    //   1215: astore 8
    //   1217: aload 7
    //   1219: astore 10
    //   1221: aload 7
    //   1223: ifnull +27 -> 1250
    //   1226: aload 7
    //   1228: astore 13
    //   1230: aload 8
    //   1232: astore 10
    //   1234: aload 7
    //   1236: astore 11
    //   1238: aload 8
    //   1240: astore 12
    //   1242: aload 7
    //   1244: invokevirtual 477	java/io/InputStream:close	()V
    //   1247: aconst_null
    //   1248: astore 10
    //   1250: iload_3
    //   1251: iconst_1
    //   1252: iadd
    //   1253: istore_3
    //   1254: aload 10
    //   1256: astore 7
    //   1258: goto -1147 -> 111
    //   1261: aload 14
    //   1263: astore 11
    //   1265: aload 7
    //   1267: astore 12
    //   1269: aload 15
    //   1271: astore 10
    //   1273: aload 7
    //   1275: astore 13
    //   1277: getstatic 197	com/tencent/mm/storage/emotion/EmojiInfo:vCv	I
    //   1280: istore 4
    //   1282: goto -378 -> 904
    //   1285: aload 8
    //   1287: astore 11
    //   1289: aload 7
    //   1291: astore 12
    //   1293: aload 8
    //   1295: astore 10
    //   1297: aload 7
    //   1299: astore 13
    //   1301: aload 21
    //   1303: ldc_w 526
    //   1306: invokevirtual 438	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1309: ifeq +1664 -> 2973
    //   1312: aload 8
    //   1314: astore 11
    //   1316: aload 7
    //   1318: astore 12
    //   1320: aload 8
    //   1322: astore 10
    //   1324: aload 7
    //   1326: astore 13
    //   1328: new 61	java/lang/StringBuilder
    //   1331: dup
    //   1332: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   1335: aload_0
    //   1336: invokevirtual 530	java/lang/String:getBytes	()[B
    //   1339: invokestatic 534	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   1342: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1345: ldc_w 536
    //   1348: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1351: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1354: astore 14
    //   1356: aload 8
    //   1358: astore 11
    //   1360: aload 7
    //   1362: astore 12
    //   1364: aload 8
    //   1366: astore 10
    //   1368: aload 7
    //   1370: astore 13
    //   1372: new 452	java/io/FileOutputStream
    //   1375: dup
    //   1376: new 61	java/lang/StringBuilder
    //   1379: dup
    //   1380: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   1383: aload 18
    //   1385: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1388: getstatic 22	java/io/File:separator	Ljava/lang/String;
    //   1391: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1394: aload 14
    //   1396: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1399: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1402: invokespecial 453	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   1405: astore 8
    //   1407: ldc_w 454
    //   1410: newarray <illegal type>
    //   1412: astore 10
    //   1414: aload 7
    //   1416: aload 10
    //   1418: invokevirtual 459	java/io/InputStream:read	([B)I
    //   1421: istore 4
    //   1423: iload 4
    //   1425: ifle +16 -> 1441
    //   1428: aload 8
    //   1430: aload 10
    //   1432: iconst_0
    //   1433: iload 4
    //   1435: invokevirtual 465	java/io/OutputStream:write	([BII)V
    //   1438: goto -24 -> 1414
    //   1441: aload 8
    //   1443: invokevirtual 476	java/io/OutputStream:close	()V
    //   1446: aconst_null
    //   1447: astore 8
    //   1449: goto -232 -> 1217
    //   1452: aload 8
    //   1454: astore 11
    //   1456: aload 7
    //   1458: astore 12
    //   1460: aload 8
    //   1462: astore 13
    //   1464: aload 7
    //   1466: astore 10
    //   1468: aload 9
    //   1470: invokevirtual 387	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   1473: astore 15
    //   1475: aload 8
    //   1477: astore 11
    //   1479: aload 7
    //   1481: astore 12
    //   1483: aload 8
    //   1485: astore 13
    //   1487: aload 7
    //   1489: astore 10
    //   1491: aload 15
    //   1493: invokeinterface 392 1 0
    //   1498: ifeq +722 -> 2220
    //   1501: aload 8
    //   1503: astore 11
    //   1505: aload 7
    //   1507: astore 12
    //   1509: aload 8
    //   1511: astore 13
    //   1513: aload 7
    //   1515: astore 10
    //   1517: aload 15
    //   1519: invokeinterface 396 1 0
    //   1524: checkcast 398	java/util/zip/ZipEntry
    //   1527: astore 14
    //   1529: aload 8
    //   1531: astore 11
    //   1533: aload 7
    //   1535: astore 12
    //   1537: aload 8
    //   1539: astore 13
    //   1541: aload 7
    //   1543: astore 10
    //   1545: aload 14
    //   1547: invokevirtual 401	java/util/zip/ZipEntry:isDirectory	()Z
    //   1550: ifne +1417 -> 2967
    //   1553: aload 8
    //   1555: astore 11
    //   1557: aload 7
    //   1559: astore 12
    //   1561: aload 8
    //   1563: astore 13
    //   1565: aload 7
    //   1567: astore 10
    //   1569: aload 9
    //   1571: aload 14
    //   1573: invokevirtual 405	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   1576: astore 7
    //   1578: aload 8
    //   1580: astore 11
    //   1582: aload 7
    //   1584: astore 12
    //   1586: aload 8
    //   1588: astore 10
    //   1590: aload 7
    //   1592: astore 13
    //   1594: aload 14
    //   1596: invokevirtual 408	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   1599: aload 14
    //   1601: invokevirtual 408	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   1604: ldc_w 410
    //   1607: invokevirtual 416	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   1610: iconst_1
    //   1611: iadd
    //   1612: invokevirtual 420	java/lang/String:substring	(I)Ljava/lang/String;
    //   1615: invokevirtual 423	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1618: astore 16
    //   1620: aload 8
    //   1622: astore 11
    //   1624: aload 7
    //   1626: astore 12
    //   1628: aload 8
    //   1630: astore 10
    //   1632: aload 7
    //   1634: astore 13
    //   1636: new 19	java/io/File
    //   1639: dup
    //   1640: new 61	java/lang/StringBuilder
    //   1643: dup
    //   1644: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   1647: aload 18
    //   1649: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1652: ldc_w 410
    //   1655: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1658: aload 14
    //   1660: invokevirtual 408	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   1663: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1666: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1669: invokespecial 121	java/io/File:<init>	(Ljava/lang/String;)V
    //   1672: astore 20
    //   1674: aload 8
    //   1676: astore 11
    //   1678: aload 7
    //   1680: astore 12
    //   1682: aload 8
    //   1684: astore 10
    //   1686: aload 7
    //   1688: astore 13
    //   1690: aload 20
    //   1692: invokevirtual 426	java/io/File:isFile	()Z
    //   1695: ifeq +25 -> 1720
    //   1698: aload 8
    //   1700: astore 11
    //   1702: aload 7
    //   1704: astore 12
    //   1706: aload 8
    //   1708: astore 10
    //   1710: aload 7
    //   1712: astore 13
    //   1714: aload 20
    //   1716: invokevirtual 132	java/io/File:delete	()Z
    //   1719: pop
    //   1720: aload 8
    //   1722: astore 11
    //   1724: aload 7
    //   1726: astore 12
    //   1728: aload 8
    //   1730: astore 10
    //   1732: aload 7
    //   1734: astore 13
    //   1736: aload 20
    //   1738: invokevirtual 430	java/io/File:getParentFile	()Ljava/io/File;
    //   1741: invokevirtual 433	java/io/File:mkdirs	()Z
    //   1744: pop
    //   1745: aload 8
    //   1747: astore 11
    //   1749: aload 7
    //   1751: astore 12
    //   1753: aload 8
    //   1755: astore 10
    //   1757: aload 7
    //   1759: astore 13
    //   1761: aload 14
    //   1763: invokevirtual 408	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   1766: invokevirtual 423	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1769: ldc_w 538
    //   1772: invokevirtual 450	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1775: ifeq +1189 -> 2964
    //   1778: aload 8
    //   1780: astore 11
    //   1782: aload 7
    //   1784: astore 12
    //   1786: aload 8
    //   1788: astore 10
    //   1790: aload 7
    //   1792: astore 13
    //   1794: aload 16
    //   1796: ldc_w 435
    //   1799: invokevirtual 416	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   1802: iconst_1
    //   1803: iadd
    //   1804: istore_3
    //   1805: aload 8
    //   1807: astore 11
    //   1809: aload 7
    //   1811: astore 12
    //   1813: aload 8
    //   1815: astore 10
    //   1817: aload 7
    //   1819: astore 13
    //   1821: aload 16
    //   1823: iload_3
    //   1824: invokevirtual 420	java/lang/String:substring	(I)Ljava/lang/String;
    //   1827: astore 14
    //   1829: aload 8
    //   1831: astore 11
    //   1833: aload 7
    //   1835: astore 12
    //   1837: aload 8
    //   1839: astore 10
    //   1841: aload 7
    //   1843: astore 13
    //   1845: new 61	java/lang/StringBuilder
    //   1848: dup
    //   1849: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   1852: aload 16
    //   1854: iconst_0
    //   1855: iload_3
    //   1856: iconst_1
    //   1857: isub
    //   1858: invokevirtual 520	java/lang/String:substring	(II)Ljava/lang/String;
    //   1861: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1864: ldc_w 540
    //   1867: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1870: aload 14
    //   1872: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1875: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1878: astore 16
    //   1880: aload 8
    //   1882: astore 11
    //   1884: aload 7
    //   1886: astore 12
    //   1888: aload 8
    //   1890: astore 10
    //   1892: aload 7
    //   1894: astore 13
    //   1896: new 452	java/io/FileOutputStream
    //   1899: dup
    //   1900: new 61	java/lang/StringBuilder
    //   1903: dup
    //   1904: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   1907: aload 18
    //   1909: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1912: getstatic 22	java/io/File:separator	Ljava/lang/String;
    //   1915: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1918: aload 16
    //   1920: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1923: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1926: invokespecial 453	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   1929: astore 8
    //   1931: ldc_w 454
    //   1934: newarray <illegal type>
    //   1936: astore 10
    //   1938: aload 7
    //   1940: aload 10
    //   1942: invokevirtual 459	java/io/InputStream:read	([B)I
    //   1945: istore_3
    //   1946: iload_3
    //   1947: ifle +15 -> 1962
    //   1950: aload 8
    //   1952: aload 10
    //   1954: iconst_0
    //   1955: iload_3
    //   1956: invokevirtual 465	java/io/OutputStream:write	([BII)V
    //   1959: goto -21 -> 1938
    //   1962: aload 8
    //   1964: invokevirtual 476	java/io/OutputStream:close	()V
    //   1967: aconst_null
    //   1968: astore 14
    //   1970: aconst_null
    //   1971: astore 8
    //   1973: aload 8
    //   1975: astore 11
    //   1977: aload 7
    //   1979: astore 12
    //   1981: aload 14
    //   1983: astore 10
    //   1985: aload 7
    //   1987: astore 13
    //   1989: aload 16
    //   1991: iconst_0
    //   1992: aload 16
    //   1994: ldc_w 540
    //   1997: invokevirtual 416	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   2000: invokevirtual 520	java/lang/String:substring	(II)Ljava/lang/String;
    //   2003: astore 20
    //   2005: aload 8
    //   2007: astore 11
    //   2009: aload 7
    //   2011: astore 12
    //   2013: aload 14
    //   2015: astore 10
    //   2017: aload 7
    //   2019: astore 13
    //   2021: aload 19
    //   2023: aload 20
    //   2025: invokevirtual 543	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   2028: ifeq +149 -> 2177
    //   2031: aload 8
    //   2033: astore 11
    //   2035: aload 7
    //   2037: astore 12
    //   2039: aload 14
    //   2041: astore 10
    //   2043: aload 7
    //   2045: astore 13
    //   2047: aload 19
    //   2049: aload 20
    //   2051: invokevirtual 547	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   2054: checkcast 412	java/lang/String
    //   2057: astore 20
    //   2059: aload 8
    //   2061: astore 11
    //   2063: aload 7
    //   2065: astore 12
    //   2067: aload 14
    //   2069: astore 10
    //   2071: aload 7
    //   2073: astore 13
    //   2075: new 19	java/io/File
    //   2078: dup
    //   2079: new 61	java/lang/StringBuilder
    //   2082: dup
    //   2083: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   2086: aload 18
    //   2088: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2091: getstatic 22	java/io/File:separator	Ljava/lang/String;
    //   2094: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2097: aload 16
    //   2099: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2102: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2105: invokespecial 121	java/io/File:<init>	(Ljava/lang/String;)V
    //   2108: new 19	java/io/File
    //   2111: dup
    //   2112: new 61	java/lang/StringBuilder
    //   2115: dup
    //   2116: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   2119: aload 18
    //   2121: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2124: getstatic 22	java/io/File:separator	Ljava/lang/String;
    //   2127: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2130: aload 20
    //   2132: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2135: ldc_w 549
    //   2138: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2141: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2144: invokespecial 121	java/io/File:<init>	(Ljava/lang/String;)V
    //   2147: invokevirtual 515	java/io/File:renameTo	(Ljava/io/File;)Z
    //   2150: pop
    //   2151: aload 8
    //   2153: astore 11
    //   2155: aload 7
    //   2157: astore 12
    //   2159: aload 14
    //   2161: astore 10
    //   2163: aload 7
    //   2165: astore 13
    //   2167: aload 19
    //   2169: aload 16
    //   2171: aload 20
    //   2173: invokevirtual 524	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2176: pop
    //   2177: aconst_null
    //   2178: astore 8
    //   2180: aload 7
    //   2182: astore 10
    //   2184: aload 7
    //   2186: ifnull +27 -> 2213
    //   2189: aload 7
    //   2191: astore 13
    //   2193: aload 8
    //   2195: astore 10
    //   2197: aload 7
    //   2199: astore 11
    //   2201: aload 8
    //   2203: astore 12
    //   2205: aload 7
    //   2207: invokevirtual 477	java/io/InputStream:close	()V
    //   2210: aconst_null
    //   2211: astore 10
    //   2213: aload 10
    //   2215: astore 7
    //   2217: goto -742 -> 1475
    //   2220: aload 8
    //   2222: astore 11
    //   2224: aload 7
    //   2226: astore 12
    //   2228: aload 8
    //   2230: astore 13
    //   2232: aload 7
    //   2234: astore 10
    //   2236: aload 19
    //   2238: invokevirtual 552	java/util/HashMap:clear	()V
    //   2241: aload_2
    //   2242: astore 14
    //   2244: aload_2
    //   2245: ifnonnull +32 -> 2277
    //   2248: aload 8
    //   2250: astore 11
    //   2252: aload 7
    //   2254: astore 12
    //   2256: aload 8
    //   2258: astore 13
    //   2260: aload 7
    //   2262: astore 10
    //   2264: invokestatic 341	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   2267: getfield 556	com/tencent/mm/plugin/emoji/e/l:kjz	Lcom/tencent/mm/storage/emotion/a;
    //   2270: aload_0
    //   2271: iconst_0
    //   2272: invokevirtual 562	com/tencent/mm/storage/emotion/a:aW	(Ljava/lang/String;Z)Lcom/tencent/mm/storage/emotion/EmojiGroupInfo;
    //   2275: astore 14
    //   2277: aload 8
    //   2279: astore 11
    //   2281: aload 7
    //   2283: astore 12
    //   2285: aload 8
    //   2287: astore 13
    //   2289: aload 7
    //   2291: astore 10
    //   2293: aload 14
    //   2295: aload_0
    //   2296: putfield 567	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_productID	Ljava/lang/String;
    //   2299: aload 8
    //   2301: astore 11
    //   2303: aload 7
    //   2305: astore 12
    //   2307: aload 8
    //   2309: astore 13
    //   2311: aload 7
    //   2313: astore 10
    //   2315: aload_1
    //   2316: invokestatic 45	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   2319: ifne +25 -> 2344
    //   2322: aload 8
    //   2324: astore 11
    //   2326: aload 7
    //   2328: astore 12
    //   2330: aload 8
    //   2332: astore 13
    //   2334: aload 7
    //   2336: astore 10
    //   2338: aload 14
    //   2340: aload_1
    //   2341: putfield 570	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_packName	Ljava/lang/String;
    //   2344: aload 8
    //   2346: astore 11
    //   2348: aload 7
    //   2350: astore 12
    //   2352: aload 8
    //   2354: astore 13
    //   2356: aload 7
    //   2358: astore 10
    //   2360: aload 14
    //   2362: invokestatic 575	java/lang/System:currentTimeMillis	()J
    //   2365: putfield 579	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_lastUseTime	J
    //   2368: aload 8
    //   2370: astore 11
    //   2372: aload 7
    //   2374: astore 12
    //   2376: aload 8
    //   2378: astore 13
    //   2380: aload 7
    //   2382: astore 10
    //   2384: aload 14
    //   2386: bipush 7
    //   2388: putfield 582	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_status	I
    //   2391: aload 8
    //   2393: astore 11
    //   2395: aload 7
    //   2397: astore 12
    //   2399: aload 8
    //   2401: astore 13
    //   2403: aload 7
    //   2405: astore 10
    //   2407: aload 14
    //   2409: iconst_1
    //   2410: putfield 585	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_packStatus	I
    //   2413: aload 8
    //   2415: astore 11
    //   2417: aload 7
    //   2419: astore 12
    //   2421: aload 8
    //   2423: astore 13
    //   2425: aload 7
    //   2427: astore 10
    //   2429: aload 14
    //   2431: getstatic 588	com/tencent/mm/storage/emotion/EmojiGroupInfo:vCi	I
    //   2434: putfield 589	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_type	I
    //   2437: aload 8
    //   2439: astore 11
    //   2441: aload 7
    //   2443: astore 12
    //   2445: aload 8
    //   2447: astore 13
    //   2449: aload 7
    //   2451: astore 10
    //   2453: aload 14
    //   2455: iconst_0
    //   2456: putfield 592	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_recommand	I
    //   2459: aload 8
    //   2461: astore 11
    //   2463: aload 7
    //   2465: astore 12
    //   2467: aload 8
    //   2469: astore 13
    //   2471: aload 7
    //   2473: astore 10
    //   2475: aload 14
    //   2477: iconst_2
    //   2478: putfield 595	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_sync	I
    //   2481: aload 8
    //   2483: astore 11
    //   2485: aload 7
    //   2487: astore 12
    //   2489: aload 8
    //   2491: astore 13
    //   2493: aload 7
    //   2495: astore 10
    //   2497: aload 14
    //   2499: aload 17
    //   2501: invokevirtual 598	java/util/ArrayList:size	()I
    //   2504: putfield 601	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_count	I
    //   2507: aload 8
    //   2509: astore 11
    //   2511: aload 7
    //   2513: astore 12
    //   2515: aload 8
    //   2517: astore 13
    //   2519: aload 7
    //   2521: astore 10
    //   2523: invokestatic 341	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   2526: getfield 347	com/tencent/mm/plugin/emoji/e/l:kjy	Lcom/tencent/mm/storage/emotion/d;
    //   2529: aload 17
    //   2531: aload_0
    //   2532: invokevirtual 605	com/tencent/mm/storage/emotion/d:j	(Ljava/util/List;Ljava/lang/String;)Z
    //   2535: istore 5
    //   2537: iload 5
    //   2539: ifeq +224 -> 2763
    //   2542: aload 8
    //   2544: astore 11
    //   2546: aload 7
    //   2548: astore 12
    //   2550: aload 8
    //   2552: astore 13
    //   2554: aload 7
    //   2556: astore 10
    //   2558: invokestatic 341	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   2561: getfield 556	com/tencent/mm/plugin/emoji/e/l:kjz	Lcom/tencent/mm/storage/emotion/a;
    //   2564: aload 14
    //   2566: invokevirtual 608	com/tencent/mm/storage/emotion/a:c	(Lcom/tencent/mm/storage/emotion/EmojiGroupInfo;)Z
    //   2569: istore 6
    //   2571: aload 8
    //   2573: astore 11
    //   2575: aload 7
    //   2577: astore 12
    //   2579: aload 8
    //   2581: astore 13
    //   2583: aload 7
    //   2585: astore 10
    //   2587: aload 17
    //   2589: invokevirtual 612	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   2592: astore_0
    //   2593: aload 8
    //   2595: astore 11
    //   2597: aload 7
    //   2599: astore 12
    //   2601: aload 8
    //   2603: astore 13
    //   2605: aload 7
    //   2607: astore 10
    //   2609: aload_0
    //   2610: invokeinterface 617 1 0
    //   2615: ifeq +78 -> 2693
    //   2618: aload 8
    //   2620: astore 11
    //   2622: aload 7
    //   2624: astore 12
    //   2626: aload 8
    //   2628: astore 13
    //   2630: aload 7
    //   2632: astore 10
    //   2634: aload_0
    //   2635: invokeinterface 620 1 0
    //   2640: checkcast 99	com/tencent/mm/storage/emotion/EmojiInfo
    //   2643: astore_1
    //   2644: aload 8
    //   2646: astore 11
    //   2648: aload 7
    //   2650: astore 12
    //   2652: aload 8
    //   2654: astore 13
    //   2656: aload 7
    //   2658: astore 10
    //   2660: aload_1
    //   2661: iconst_0
    //   2662: putfield 623	com/tencent/mm/storage/emotion/EmojiInfo:field_reserved4	I
    //   2665: aload 8
    //   2667: astore 11
    //   2669: aload 7
    //   2671: astore 12
    //   2673: aload 8
    //   2675: astore 13
    //   2677: aload 7
    //   2679: astore 10
    //   2681: invokestatic 629	com/tencent/mm/plugin/emoji/e/e:aqw	()Lcom/tencent/mm/plugin/emoji/e/e;
    //   2684: aload_1
    //   2685: iconst_1
    //   2686: invokevirtual 632	com/tencent/mm/plugin/emoji/e/e:c	(Lcom/tencent/mm/storage/emotion/EmojiInfo;Z)Z
    //   2689: pop
    //   2690: goto -97 -> 2593
    //   2693: aload 8
    //   2695: astore 11
    //   2697: aload 7
    //   2699: astore 12
    //   2701: aload 8
    //   2703: astore 13
    //   2705: aload 7
    //   2707: astore 10
    //   2709: ldc 47
    //   2711: ldc_w 634
    //   2714: iconst_2
    //   2715: anewarray 4	java/lang/Object
    //   2718: dup
    //   2719: iconst_0
    //   2720: iload 6
    //   2722: invokestatic 267	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   2725: aastore
    //   2726: dup
    //   2727: iconst_1
    //   2728: iload 5
    //   2730: invokestatic 267	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   2733: aastore
    //   2734: invokestatic 220	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2737: aload 7
    //   2739: ifnull +8 -> 2747
    //   2742: aload 7
    //   2744: invokevirtual 477	java/io/InputStream:close	()V
    //   2747: aload 9
    //   2749: invokevirtual 478	java/util/zip/ZipFile:close	()V
    //   2752: ldc2_w 367
    //   2755: ldc_w 369
    //   2758: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2761: iconst_1
    //   2762: ireturn
    //   2763: aload 8
    //   2765: astore 11
    //   2767: aload 7
    //   2769: astore 12
    //   2771: aload 8
    //   2773: astore 13
    //   2775: aload 7
    //   2777: astore 10
    //   2779: ldc 47
    //   2781: ldc_w 636
    //   2784: iconst_1
    //   2785: anewarray 4	java/lang/Object
    //   2788: dup
    //   2789: iconst_0
    //   2790: iload 5
    //   2792: invokestatic 267	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   2795: aastore
    //   2796: invokestatic 220	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2799: goto -62 -> 2737
    //   2802: astore_0
    //   2803: aload 12
    //   2805: astore 7
    //   2807: aload 11
    //   2809: astore_1
    //   2810: aload_1
    //   2811: ifnull +7 -> 2818
    //   2814: aload_1
    //   2815: invokevirtual 476	java/io/OutputStream:close	()V
    //   2818: aload 7
    //   2820: ifnull +8 -> 2828
    //   2823: aload 7
    //   2825: invokevirtual 477	java/io/InputStream:close	()V
    //   2828: aload 9
    //   2830: ifnull +8 -> 2838
    //   2833: aload 9
    //   2835: invokevirtual 478	java/util/zip/ZipFile:close	()V
    //   2838: aload_0
    //   2839: athrow
    //   2840: astore_0
    //   2841: aconst_null
    //   2842: astore 9
    //   2844: aconst_null
    //   2845: astore_1
    //   2846: goto -36 -> 2810
    //   2849: astore_0
    //   2850: aconst_null
    //   2851: astore_1
    //   2852: goto -42 -> 2810
    //   2855: astore_0
    //   2856: aload 11
    //   2858: astore_1
    //   2859: aload 12
    //   2861: astore 7
    //   2863: goto -53 -> 2810
    //   2866: astore_0
    //   2867: aload 8
    //   2869: astore_1
    //   2870: goto -60 -> 2810
    //   2873: astore_0
    //   2874: aload 8
    //   2876: astore_1
    //   2877: goto -67 -> 2810
    //   2880: astore_0
    //   2881: aload 13
    //   2883: astore 7
    //   2885: aload 10
    //   2887: astore_1
    //   2888: goto -78 -> 2810
    //   2891: astore_0
    //   2892: aload 8
    //   2894: astore_1
    //   2895: goto -85 -> 2810
    //   2898: astore 7
    //   2900: aload_0
    //   2901: astore 9
    //   2903: aload 7
    //   2905: astore_0
    //   2906: aload_2
    //   2907: astore 7
    //   2909: goto -99 -> 2810
    //   2912: astore 7
    //   2914: aconst_null
    //   2915: astore_1
    //   2916: aconst_null
    //   2917: astore_2
    //   2918: aload 8
    //   2920: astore_0
    //   2921: goto -2326 -> 595
    //   2924: astore 7
    //   2926: aload 9
    //   2928: astore_0
    //   2929: aconst_null
    //   2930: astore_1
    //   2931: aconst_null
    //   2932: astore_2
    //   2933: goto -2338 -> 595
    //   2936: astore 7
    //   2938: aload 13
    //   2940: astore_2
    //   2941: aload 9
    //   2943: astore_0
    //   2944: aload 10
    //   2946: astore_1
    //   2947: goto -2352 -> 595
    //   2950: astore 7
    //   2952: aload 9
    //   2954: astore_0
    //   2955: aload 12
    //   2957: astore_1
    //   2958: aload 11
    //   2960: astore_2
    //   2961: goto -2366 -> 595
    //   2964: goto -784 -> 2180
    //   2967: goto -787 -> 2180
    //   2970: goto -1753 -> 1217
    //   2973: goto -1756 -> 1217
    //   2976: astore 10
    //   2978: aload 9
    //   2980: astore_0
    //   2981: aload 8
    //   2983: astore_1
    //   2984: aload 7
    //   2986: astore_2
    //   2987: aload 10
    //   2989: astore 7
    //   2991: goto -2396 -> 595
    //   2994: astore 10
    //   2996: aload 9
    //   2998: astore_0
    //   2999: aload 8
    //   3001: astore_1
    //   3002: aload 7
    //   3004: astore_2
    //   3005: aload 10
    //   3007: astore 7
    //   3009: goto -2414 -> 595
    //   3012: astore 7
    //   3014: aload 13
    //   3016: astore_1
    //   3017: aload 9
    //   3019: astore_0
    //   3020: aload 10
    //   3022: astore_2
    //   3023: goto -2428 -> 595
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	3026	0	paramString1	String
    //   0	3026	1	paramString2	String
    //   0	3026	2	paramEmojiGroupInfo	com.tencent.mm.storage.emotion.EmojiGroupInfo
    //   104	1852	3	i	int
    //   560	874	4	j	int
    //   2535	256	5	bool1	boolean
    //   2569	152	6	bool2	boolean
    //   38	2846	7	localObject1	Object
    //   2898	6	7	localObject2	Object
    //   2907	1	7	localEmojiGroupInfo	com.tencent.mm.storage.emotion.EmojiGroupInfo
    //   2912	1	7	localException1	Exception
    //   2924	1	7	localException2	Exception
    //   2936	1	7	localException3	Exception
    //   2950	35	7	localException4	Exception
    //   2989	19	7	localObject3	Object
    //   3012	1	7	localException5	Exception
    //   65	2935	8	localObject4	Object
    //   29	2989	9	localObject5	Object
    //   125	445	10	localObject6	Object
    //   580	12	10	localException6	Exception
    //   677	2268	10	localObject7	Object
    //   2976	12	10	localException7	Exception
    //   2994	27	10	localException8	Exception
    //   113	2846	11	localObject8	Object
    //   117	2839	12	localObject9	Object
    //   121	2894	13	localObject10	Object
    //   163	2402	14	localObject11	Object
    //   308	1210	15	localObject12	Object
    //   931	1239	16	localObject13	Object
    //   83	2505	17	localArrayList	java.util.ArrayList
    //   59	2061	18	str1	String
    //   74	2163	19	localHashMap	java.util.HashMap
    //   101	2071	20	localObject14	Object
    //   254	1048	21	str2	String
    //   712	497	22	str3	String
    //   803	367	23	localFile1	File
    //   854	318	24	localFile2	File
    // Exception table:
    //   from	to	target	type
    //   546	553	580	java/lang/Exception
    //   553	562	580	java/lang/Exception
    //   567	577	580	java/lang/Exception
    //   656	661	580	java/lang/Exception
    //   127	137	2802	finally
    //   153	165	2802	finally
    //   181	189	2802	finally
    //   205	214	2802	finally
    //   1468	1475	2802	finally
    //   1491	1501	2802	finally
    //   1517	1529	2802	finally
    //   1545	1553	2802	finally
    //   1569	1578	2802	finally
    //   2236	2241	2802	finally
    //   2264	2277	2802	finally
    //   2293	2299	2802	finally
    //   2315	2322	2802	finally
    //   2338	2344	2802	finally
    //   2360	2368	2802	finally
    //   2384	2391	2802	finally
    //   2407	2413	2802	finally
    //   2429	2437	2802	finally
    //   2453	2459	2802	finally
    //   2475	2481	2802	finally
    //   2497	2507	2802	finally
    //   2523	2537	2802	finally
    //   2558	2571	2802	finally
    //   2587	2593	2802	finally
    //   2609	2618	2802	finally
    //   2634	2644	2802	finally
    //   2660	2665	2802	finally
    //   2681	2690	2802	finally
    //   2709	2737	2802	finally
    //   2779	2799	2802	finally
    //   85	96	2840	finally
    //   96	103	2849	finally
    //   230	256	2855	finally
    //   272	310	2855	finally
    //   326	334	2855	finally
    //   350	356	2855	finally
    //   372	381	2855	finally
    //   397	408	2855	finally
    //   424	435	2855	finally
    //   451	462	2855	finally
    //   478	495	2855	finally
    //   511	546	2855	finally
    //   683	714	2855	finally
    //   730	754	2855	finally
    //   770	805	2855	finally
    //   821	856	2855	finally
    //   872	883	2855	finally
    //   899	904	2855	finally
    //   920	933	2855	finally
    //   958	967	2855	finally
    //   983	989	2855	finally
    //   1005	1012	2855	finally
    //   1028	1035	2855	finally
    //   1051	1062	2855	finally
    //   1078	1085	2855	finally
    //   1101	1107	2855	finally
    //   1123	1129	2855	finally
    //   1145	1153	2855	finally
    //   1169	1177	2855	finally
    //   1193	1214	2855	finally
    //   1277	1282	2855	finally
    //   1301	1312	2855	finally
    //   1328	1356	2855	finally
    //   1372	1407	2855	finally
    //   1594	1620	2855	finally
    //   1636	1674	2855	finally
    //   1690	1698	2855	finally
    //   1714	1720	2855	finally
    //   1736	1745	2855	finally
    //   1761	1778	2855	finally
    //   1794	1805	2855	finally
    //   1821	1829	2855	finally
    //   1845	1880	2855	finally
    //   1896	1931	2855	finally
    //   1989	2005	2855	finally
    //   2021	2031	2855	finally
    //   2047	2059	2855	finally
    //   2075	2151	2855	finally
    //   2167	2177	2855	finally
    //   546	553	2866	finally
    //   553	562	2866	finally
    //   567	577	2866	finally
    //   656	661	2866	finally
    //   1407	1414	2873	finally
    //   1414	1423	2873	finally
    //   1428	1438	2873	finally
    //   1441	1446	2873	finally
    //   1242	1247	2880	finally
    //   2205	2210	2880	finally
    //   1931	1938	2891	finally
    //   1938	1946	2891	finally
    //   1950	1959	2891	finally
    //   1962	1967	2891	finally
    //   595	621	2898	finally
    //   85	96	2912	java/lang/Exception
    //   96	103	2924	java/lang/Exception
    //   230	256	2936	java/lang/Exception
    //   272	310	2936	java/lang/Exception
    //   326	334	2936	java/lang/Exception
    //   350	356	2936	java/lang/Exception
    //   372	381	2936	java/lang/Exception
    //   397	408	2936	java/lang/Exception
    //   424	435	2936	java/lang/Exception
    //   451	462	2936	java/lang/Exception
    //   478	495	2936	java/lang/Exception
    //   511	546	2936	java/lang/Exception
    //   683	714	2936	java/lang/Exception
    //   730	754	2936	java/lang/Exception
    //   770	805	2936	java/lang/Exception
    //   821	856	2936	java/lang/Exception
    //   872	883	2936	java/lang/Exception
    //   899	904	2936	java/lang/Exception
    //   920	933	2936	java/lang/Exception
    //   958	967	2936	java/lang/Exception
    //   983	989	2936	java/lang/Exception
    //   1005	1012	2936	java/lang/Exception
    //   1028	1035	2936	java/lang/Exception
    //   1051	1062	2936	java/lang/Exception
    //   1078	1085	2936	java/lang/Exception
    //   1101	1107	2936	java/lang/Exception
    //   1123	1129	2936	java/lang/Exception
    //   1145	1153	2936	java/lang/Exception
    //   1169	1177	2936	java/lang/Exception
    //   1193	1214	2936	java/lang/Exception
    //   1277	1282	2936	java/lang/Exception
    //   1301	1312	2936	java/lang/Exception
    //   1328	1356	2936	java/lang/Exception
    //   1372	1407	2936	java/lang/Exception
    //   1594	1620	2936	java/lang/Exception
    //   1636	1674	2936	java/lang/Exception
    //   1690	1698	2936	java/lang/Exception
    //   1714	1720	2936	java/lang/Exception
    //   1736	1745	2936	java/lang/Exception
    //   1761	1778	2936	java/lang/Exception
    //   1794	1805	2936	java/lang/Exception
    //   1821	1829	2936	java/lang/Exception
    //   1845	1880	2936	java/lang/Exception
    //   1896	1931	2936	java/lang/Exception
    //   1989	2005	2936	java/lang/Exception
    //   2021	2031	2936	java/lang/Exception
    //   2047	2059	2936	java/lang/Exception
    //   2075	2151	2936	java/lang/Exception
    //   2167	2177	2936	java/lang/Exception
    //   1242	1247	2950	java/lang/Exception
    //   2205	2210	2950	java/lang/Exception
    //   1407	1414	2976	java/lang/Exception
    //   1414	1423	2976	java/lang/Exception
    //   1428	1438	2976	java/lang/Exception
    //   1441	1446	2976	java/lang/Exception
    //   1931	1938	2994	java/lang/Exception
    //   1938	1946	2994	java/lang/Exception
    //   1950	1959	2994	java/lang/Exception
    //   1962	1967	2994	java/lang/Exception
    //   127	137	3012	java/lang/Exception
    //   153	165	3012	java/lang/Exception
    //   181	189	3012	java/lang/Exception
    //   205	214	3012	java/lang/Exception
    //   1468	1475	3012	java/lang/Exception
    //   1491	1501	3012	java/lang/Exception
    //   1517	1529	3012	java/lang/Exception
    //   1545	1553	3012	java/lang/Exception
    //   1569	1578	3012	java/lang/Exception
    //   2236	2241	3012	java/lang/Exception
    //   2264	2277	3012	java/lang/Exception
    //   2293	2299	3012	java/lang/Exception
    //   2315	2322	3012	java/lang/Exception
    //   2338	2344	3012	java/lang/Exception
    //   2360	2368	3012	java/lang/Exception
    //   2384	2391	3012	java/lang/Exception
    //   2407	2413	3012	java/lang/Exception
    //   2429	2437	3012	java/lang/Exception
    //   2453	2459	3012	java/lang/Exception
    //   2475	2481	3012	java/lang/Exception
    //   2497	2507	3012	java/lang/Exception
    //   2523	2537	3012	java/lang/Exception
    //   2558	2571	3012	java/lang/Exception
    //   2587	2593	3012	java/lang/Exception
    //   2609	2618	3012	java/lang/Exception
    //   2634	2644	3012	java/lang/Exception
    //   2660	2665	3012	java/lang/Exception
    //   2681	2690	3012	java/lang/Exception
    //   2709	2737	3012	java/lang/Exception
    //   2779	2799	3012	java/lang/Exception
  }
  
  public static int af(byte[] paramArrayOfByte)
  {
    GMTrace.i(11309856849920L, 84265);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 4))
    {
      i = EmojiInfo.vCk;
      GMTrace.o(11309856849920L, 84265);
      return i;
    }
    if ((paramArrayOfByte[1] == 80) && (paramArrayOfByte[2] == 78) && (paramArrayOfByte[3] == 71))
    {
      i = EmojiInfo.vCv;
      GMTrace.o(11309856849920L, 84265);
      return i;
    }
    if ((paramArrayOfByte[0] == 71) && (paramArrayOfByte[1] == 73) && (paramArrayOfByte[2] == 70))
    {
      i = EmojiInfo.vCw;
      GMTrace.o(11309856849920L, 84265);
      return i;
    }
    if ((paramArrayOfByte[6] == 74) && (paramArrayOfByte[7] == 70) && (paramArrayOfByte[8] == 73) && (paramArrayOfByte[9] == 70))
    {
      i = EmojiInfo.vCx;
      GMTrace.o(11309856849920L, 84265);
      return i;
    }
    int i = EmojiInfo.vCk;
    GMTrace.o(11309856849920L, 84265);
    return i;
  }
  
  public static zw ara()
  {
    GMTrace.i(11310930591744L, 84273);
    zw localzw = new zw();
    localzw.uqA = 1;
    localzw.uqC = 1;
    GMTrace.o(11310930591744L, 84273);
    return localzw;
  }
  
  public static String b(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    GMTrace.i(11310125285376L, 84267);
    if (paramWXMediaMessage.getType() != 8)
    {
      GMTrace.o(11310125285376L, 84267);
      return null;
    }
    Object localObject = (WXEmojiObject)paramWXMediaMessage.mediaObject;
    String str;
    if (!bg.bq(((WXEmojiObject)localObject).emojiData))
    {
      w.d("MicroMsg.emoji.EmojiLogic", " fileData:" + ((WXEmojiObject)localObject).emojiData.length);
      str = g.n(((WXEmojiObject)localObject).emojiData);
      a(paramContext, paramWXMediaMessage.thumbData, str, ((WXEmojiObject)localObject).emojiData, paramString);
      GMTrace.o(11310125285376L, 84267);
      return str;
    }
    if (!bg.nm(((WXEmojiObject)localObject).emojiPath))
    {
      int i = e.aY(((WXEmojiObject)localObject).emojiPath);
      if (i > 0)
      {
        localObject = e.c(((WXEmojiObject)localObject).emojiPath, 0, i);
        str = g.n((byte[])localObject);
        a(paramContext, paramWXMediaMessage.thumbData, str, (byte[])localObject, paramString);
        GMTrace.o(11310125285376L, 84267);
        return str;
      }
      GMTrace.o(11310125285376L, 84267);
      return null;
    }
    GMTrace.o(11310125285376L, 84267);
    return null;
  }
  
  private static String bV(String paramString1, String paramString2)
  {
    GMTrace.i(11313212293120L, 84290);
    if ((bg.nm(paramString1)) && (bg.nm(paramString2)))
    {
      w.e("MicroMsg.emoji.EmojiLogic", "[cpan] product id and url are null.");
      GMTrace.o(11313212293120L, 84290);
      return null;
    }
    if (bg.nm(paramString2)) {}
    for (paramString1 = g.n(paramString1.getBytes());; paramString1 = g.n(paramString2.getBytes()))
    {
      GMTrace.o(11313212293120L, 84290);
      return paramString1;
    }
  }
  
  public static native boolean extractForeground(int[] paramArrayOfInt, int paramInt1, int paramInt2);
  
  public static native boolean gifToMMAni(byte[] paramArrayOfByte, PByteArray paramPByteArray, int paramInt);
  
  public static String h(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(11311199027200L, 84275);
    if (paramInt != 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<xml>");
      localStringBuilder.append("<designeruin>" + paramInt + "</designeruin>");
      localStringBuilder.append("<designername>" + paramString1 + "</designername>");
      localStringBuilder.append("<designerrediretcturl>" + paramString2 + "</designerrediretcturl>");
      localStringBuilder.append("</xml>");
      paramString1 = localStringBuilder.toString();
      w.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", new Object[] { paramString1 });
      GMTrace.o(11311199027200L, 84275);
      return paramString1;
    }
    GMTrace.o(11311199027200L, 84275);
    return null;
  }
  
  public static String vQ(String paramString)
  {
    GMTrace.i(11309991067648L, 84266);
    if (!bg.nm(paramString))
    {
      int i = e.aY(paramString);
      if (i > 0)
      {
        paramString = e.c(paramString, 0, i);
        String str1 = g.n(paramString);
        if ((str1 != null) || (paramString != null))
        {
          at.AR();
          String str2 = c.zb();
          e.b(str2 + str1, paramString, paramString.length);
          if (!com.tencent.mm.sdk.platformtools.o.bi(paramString)) {
            break label124;
          }
          h.arl().kjy.a(str1, "", EmojiInfo.vCo, EmojiInfo.vCw, paramString.length, "", "");
        }
        for (;;)
        {
          GMTrace.o(11309991067648L, 84266);
          return str1;
          label124:
          h.arl().kjy.a(str1, "", EmojiInfo.vCo, EmojiInfo.vCv, paramString.length, "", "");
        }
      }
      GMTrace.o(11309991067648L, 84266);
      return null;
    }
    GMTrace.o(11309991067648L, 84266);
    return null;
  }
  
  public static String vU(String paramString)
  {
    GMTrace.i(11311870115840L, 84280);
    w.d("MicroMsg.emoji.EmojiLogic", "url:%s", new Object[] { paramString });
    String str2 = "";
    String str1 = str2;
    if (!TextUtils.isEmpty(paramString))
    {
      str1 = str2;
      if (paramString.startsWith("http://weixin.qq.com/emoticonstore/")) {
        str1 = paramString.substring(paramString.lastIndexOf("/") + 1);
      }
    }
    GMTrace.o(11311870115840L, 84280);
    return str1;
  }
  
  public static String vV(String paramString)
  {
    GMTrace.i(11311735898112L, 84279);
    paramString = bh.q(paramString, "xml");
    for (;;)
    {
      try
      {
        paramString = (String)paramString.get(".xml.productid");
      }
      catch (Exception localException1)
      {
        try
        {
          w.d("MicroMsg.emoji.EmojiLogic", "productId:%s", new Object[] { paramString });
          GMTrace.o(11311735898112L, 84279);
          return paramString;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        paramString = "";
      }
      tmp71_68[0] = localException1.toString();
      w.e("MicroMsg.emoji.EmojiLogic", "getProductIdBySnsObjData exception. %s", tmp71_68);
    }
  }
  
  public static int vW(String paramString)
  {
    GMTrace.i(11311333244928L, 84276);
    paramString = bh.q(paramString, "xml");
    for (;;)
    {
      try
      {
        int i = com.tencent.mm.a.o.bj((String)paramString.get(".xml.designeruin"));
      }
      catch (Exception paramString)
      {
        try
        {
          w.d("MicroMsg.emoji.EmojiLogic", "designeruin:%s", new Object[] { Integer.valueOf(i) });
          GMTrace.o(11311333244928L, 84276);
          return i;
        }
        catch (Exception paramString)
        {
          for (;;) {}
        }
        paramString = paramString;
        i = 0;
      }
      tmp75_72[0] = paramString.toString();
      w.e("MicroMsg.emoji.EmojiLogic", "getDesignerUINBySnsObjData exception. %s", tmp75_72);
    }
  }
  
  public static String vX(String paramString)
  {
    GMTrace.i(11311467462656L, 84277);
    paramString = bh.q(paramString, "xml");
    for (;;)
    {
      try
      {
        paramString = (String)paramString.get(".xml.designername");
      }
      catch (Exception localException1)
      {
        try
        {
          w.d("MicroMsg.emoji.EmojiLogic", "designeruin:%s", new Object[] { paramString });
          GMTrace.o(11311467462656L, 84277);
          return paramString;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        paramString = "";
      }
      tmp71_68[0] = localException1.toString();
      w.e("MicroMsg.emoji.EmojiLogic", "getDesignerNameBySnsObjData exception. %s", tmp71_68);
    }
  }
  
  public static String wb(String paramString)
  {
    GMTrace.i(11311064809472L, 84274);
    if (!TextUtils.isEmpty(paramString))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<xml>");
      localStringBuilder.append("<productid>" + paramString + "</productid>");
      localStringBuilder.append("</xml>");
      paramString = localStringBuilder.toString();
      w.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", new Object[] { paramString });
      GMTrace.o(11311064809472L, 84274);
      return paramString;
    }
    GMTrace.o(11311064809472L, 84274);
    return null;
  }
  
  public static String wc(String paramString)
  {
    GMTrace.i(11311601680384L, 84278);
    paramString = bh.q(paramString, "xml");
    for (;;)
    {
      try
      {
        paramString = (String)paramString.get(".xml.designerrediretcturl");
      }
      catch (Exception localException1)
      {
        try
        {
          w.d("MicroMsg.emoji.EmojiLogic", "designerrediretcturl:%s", new Object[] { paramString });
          GMTrace.o(11311601680384L, 84278);
          return paramString;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        paramString = "";
      }
      tmp71_68[0] = localException1.toString();
      w.e("MicroMsg.emoji.EmojiLogic", "getDesignerRediretctUrlBySnsObjData exception. %s", tmp71_68);
    }
  }
  
  public static int wd(String paramString)
  {
    GMTrace.i(11312138551296L, 84282);
    paramString = bh.q(paramString, "xml");
    for (;;)
    {
      try
      {
        int i = bg.Sy((String)paramString.get(".xml.tid"));
      }
      catch (Exception paramString)
      {
        try
        {
          w.d("MicroMsg.emoji.EmojiLogic", "tid:%s", new Object[] { Integer.valueOf(i) });
          GMTrace.o(11312138551296L, 84282);
          return i;
        }
        catch (Exception paramString)
        {
          for (;;) {}
        }
        paramString = paramString;
        i = 0;
      }
      tmp75_72[0] = paramString.toString();
      w.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageTid exception. %s", tmp75_72);
    }
  }
  
  public static String we(String paramString)
  {
    GMTrace.i(11312272769024L, 84283);
    paramString = bh.q(paramString, "xml");
    for (;;)
    {
      try
      {
        paramString = (String)paramString.get(".xml.title");
      }
      catch (Exception localException1)
      {
        try
        {
          w.d("MicroMsg.emoji.EmojiLogic", "title:%s", new Object[] { paramString });
          GMTrace.o(11312272769024L, 84283);
          return paramString;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        paramString = "";
      }
      tmp71_68[0] = localException1.toString();
      w.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageTitle exception. %s", tmp71_68);
    }
  }
  
  public static String wf(String paramString)
  {
    GMTrace.i(11312406986752L, 84284);
    paramString = bh.q(paramString, "xml");
    for (;;)
    {
      try
      {
        paramString = (String)paramString.get(".xml.desc");
      }
      catch (Exception localException1)
      {
        try
        {
          w.d("MicroMsg.emoji.EmojiLogic", "desc:%s", new Object[] { paramString });
          GMTrace.o(11312406986752L, 84284);
          return paramString;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        paramString = "";
      }
      tmp71_68[0] = localException1.toString();
      w.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageDesc exception. %s", tmp71_68);
    }
  }
  
  public static String wg(String paramString)
  {
    GMTrace.i(11312541204480L, 84285);
    paramString = bh.q(paramString, "xml");
    for (;;)
    {
      try
      {
        paramString = (String)paramString.get(".xml.iconUrl");
      }
      catch (Exception localException1)
      {
        try
        {
          w.d("MicroMsg.emoji.EmojiLogic", "iconUrl:%s", new Object[] { paramString });
          GMTrace.o(11312541204480L, 84285);
          return paramString;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        paramString = "";
      }
      tmp71_68[0] = localException1.toString();
      w.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageIconUrl exception. %s", tmp71_68);
    }
  }
  
  public static String wh(String paramString)
  {
    GMTrace.i(11312675422208L, 84286);
    paramString = bh.q(paramString, "xml");
    for (;;)
    {
      try
      {
        paramString = bg.aq((String)paramString.get(".xml.secondUrl"), "");
      }
      catch (Exception localException1)
      {
        try
        {
          w.d("MicroMsg.emoji.EmojiLogic", "secondUrl:%s", new Object[] { paramString });
          GMTrace.o(11312675422208L, 84286);
          return paramString;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        paramString = "";
      }
      tmp77_74[0] = localException1.toString();
      w.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageSecondUrl exception. %s", tmp77_74);
    }
  }
  
  public static int wi(String paramString)
  {
    GMTrace.i(11312809639936L, 84287);
    paramString = bh.q(paramString, "xml");
    for (;;)
    {
      try
      {
        int i = bg.Sy((String)paramString.get(".xml.pageType"));
      }
      catch (Exception paramString)
      {
        try
        {
          w.d("MicroMsg.emoji.EmojiLogic", "pageType:%s", new Object[] { Integer.valueOf(i) });
          GMTrace.o(11312809639936L, 84287);
          return i;
        }
        catch (Exception paramString)
        {
          for (;;) {}
        }
        paramString = paramString;
        i = 0;
      }
      tmp75_72[0] = paramString.toString();
      w.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageType exception. %s", tmp75_72);
    }
  }
  
  public static boolean wj(String paramString)
  {
    GMTrace.i(11313346510848L, 84291);
    if (!bg.nm(paramString)) {
      try
      {
        if (b.jD(paramString))
        {
          w.d("MicroMsg.emoji.EmojiLogic", "In Not Auto Download Time Range. timeRange:%s", new Object[] { paramString });
          GMTrace.o(11313346510848L, 84291);
          return true;
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.emoji.EmojiLogic", "isInNotAutoDownloadTimeRange :%s", new Object[] { bg.f(paramString) });
      }
    }
    GMTrace.o(11313346510848L, 84291);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\model\EmojiLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */