package com.tencent.mm.compatible.i;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Video.Media;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class a
{
  @TargetApi(5)
  public static String h(Context paramContext, Intent paramIntent)
  {
    Object localObject = null;
    GMTrace.i(17561584402432L, 130844);
    if ((paramIntent == null) || (paramIntent.getData() == null))
    {
      w.e("MicroMsg.GetVideoMetadata", "input invalid");
      GMTrace.o(17561584402432L, 130844);
      return null;
    }
    long l = bg.Pw();
    String str = paramIntent.getDataString();
    w.i("MicroMsg.GetVideoMetadata", "get video file name, dataString " + str);
    if (str == null)
    {
      w.e("MicroMsg.GetVideoMetadata", "dataString empty");
      GMTrace.o(17561584402432L, 130844);
      return null;
    }
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (str.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString()))
    {
      paramIntent = localContentResolver.query(paramIntent.getData(), null, null, null, null);
      paramContext = null;
      localObject = paramContext;
      if (paramIntent != null)
      {
        localObject = paramContext;
        if (paramIntent.getCount() > 0)
        {
          paramIntent.moveToFirst();
          localObject = paramContext;
          if (paramContext == null) {
            localObject = paramIntent.getString(paramIntent.getColumnIndexOrThrow("_data"));
          }
        }
        paramIntent.close();
      }
      w.i("MicroMsg.GetVideoMetadata", "get video filename:" + (String)localObject + ", cost time: " + bg.aI(l));
      GMTrace.o(17561584402432L, 130844);
      return (String)localObject;
    }
    if (str.startsWith("content://")) {
      paramContext = bg.f(paramContext, paramIntent.getData());
    }
    for (;;)
    {
      label248:
      if (paramContext != null) {
        if (paramContext.startsWith("/storage/emulated/legacy"))
        {
          paramContext = h.getExternalStorageDirectory().getAbsolutePath() + paramContext.substring(24);
          label290:
          paramIntent = "_data LIKE " + DatabaseUtils.sqlEscapeString(paramContext);
          paramIntent = localContentResolver.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, null, paramIntent, null, null);
          break;
          if (!str.startsWith("file://")) {
            break label447;
          }
          if (paramIntent.getExtras() == null) {
            break label442;
          }
          paramContext = (Uri)paramIntent.getExtras().getParcelable("android.intent.extra.STREAM");
          if ((paramContext == null) || (bg.nm(paramContext.getPath()))) {
            break label442;
          }
        }
      }
      label442:
      for (paramIntent = paramContext.getPath();; paramIntent = null)
      {
        paramContext = paramIntent;
        if (paramIntent != null) {
          break label248;
        }
        paramContext = str.substring(7);
        break label248;
        if (paramContext.startsWith("/sdcard"))
        {
          paramContext = h.getExternalStorageDirectory().getAbsolutePath() + paramContext.substring(7);
          break label290;
        }
        break label290;
        paramIntent = (Intent)localObject;
        break;
      }
      label447:
      paramContext = null;
    }
  }
  
  /* Error */
  @TargetApi(5)
  public static a i(Context paramContext, Intent paramIntent)
  {
    // Byte code:
    //   0: ldc2_w 191
    //   3: ldc -63
    //   5: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: ifnull +10 -> 19
    //   12: aload_1
    //   13: invokevirtual 27	android/content/Intent:getData	()Landroid/net/Uri;
    //   16: ifnonnull +20 -> 36
    //   19: ldc 29
    //   21: ldc 31
    //   23: invokestatic 37	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: ldc2_w 191
    //   29: ldc -63
    //   31: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: aconst_null
    //   35: areturn
    //   36: invokestatic 46	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   39: lstore 4
    //   41: aload_1
    //   42: invokevirtual 50	android/content/Intent:getDataString	()Ljava/lang/String;
    //   45: astore 8
    //   47: ldc 29
    //   49: new 52	java/lang/StringBuilder
    //   52: dup
    //   53: ldc -61
    //   55: invokespecial 58	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   58: aload 8
    //   60: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   66: invokestatic 67	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   69: aload 8
    //   71: ifnonnull +20 -> 91
    //   74: ldc 29
    //   76: ldc 69
    //   78: invokestatic 37	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: ldc2_w 191
    //   84: ldc -63
    //   86: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   89: aconst_null
    //   90: areturn
    //   91: aload_0
    //   92: invokevirtual 75	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   95: astore 13
    //   97: new 6	com/tencent/mm/compatible/i/a$a
    //   100: dup
    //   101: invokespecial 196	com/tencent/mm/compatible/i/a$a:<init>	()V
    //   104: astore 12
    //   106: aload 8
    //   108: getstatic 81	android/provider/MediaStore$Video$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
    //   111: invokevirtual 84	android/net/Uri:toString	()Ljava/lang/String;
    //   114: invokevirtual 90	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   117: ifeq +389 -> 506
    //   120: aload 13
    //   122: aload_1
    //   123: invokevirtual 27	android/content/Intent:getData	()Landroid/net/Uri;
    //   126: aconst_null
    //   127: aconst_null
    //   128: aconst_null
    //   129: aconst_null
    //   130: invokevirtual 96	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   133: astore 8
    //   135: ldc -59
    //   137: istore_2
    //   138: iload_2
    //   139: istore_3
    //   140: aload 8
    //   142: ifnull +195 -> 337
    //   145: aload 8
    //   147: invokeinterface 102 1 0
    //   152: ifle +176 -> 328
    //   155: aload 8
    //   157: invokeinterface 106 1 0
    //   162: pop
    //   163: aload 8
    //   165: aload 8
    //   167: ldc -57
    //   169: invokeinterface 112 2 0
    //   174: invokeinterface 203 2 0
    //   179: istore_3
    //   180: aload 12
    //   182: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   185: ifnonnull +24 -> 209
    //   188: aload 12
    //   190: aload 8
    //   192: aload 8
    //   194: ldc 108
    //   196: invokeinterface 112 2 0
    //   201: invokeinterface 116 2 0
    //   206: putfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   209: aload 12
    //   211: aload 8
    //   213: aload 8
    //   215: ldc -47
    //   217: invokeinterface 112 2 0
    //   222: invokeinterface 203 2 0
    //   227: putfield 212	com/tencent/mm/compatible/i/a$a:duration	I
    //   230: aload 12
    //   232: getfield 212	com/tencent/mm/compatible/i/a$a:duration	I
    //   235: ifne +85 -> 320
    //   238: aconst_null
    //   239: astore 11
    //   241: aconst_null
    //   242: astore 10
    //   244: aload 10
    //   246: astore 9
    //   248: aload 11
    //   250: astore_1
    //   251: ldc 29
    //   253: ldc -42
    //   255: invokestatic 67	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   258: aload 10
    //   260: astore 9
    //   262: aload 11
    //   264: astore_1
    //   265: aload_0
    //   266: aload 12
    //   268: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   271: invokestatic 218	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   274: invokestatic 223	com/tencent/mm/compatible/b/i:a	(Landroid/content/Context;Landroid/net/Uri;)Lcom/tencent/mm/compatible/b/i;
    //   277: astore 10
    //   279: aload 10
    //   281: ifnull +476 -> 757
    //   284: aload 10
    //   286: astore 9
    //   288: aload 10
    //   290: astore_1
    //   291: aload 10
    //   293: invokevirtual 228	android/media/MediaPlayer:getDuration	()I
    //   296: istore_2
    //   297: aload 10
    //   299: astore 9
    //   301: aload 10
    //   303: astore_1
    //   304: aload 12
    //   306: iload_2
    //   307: putfield 212	com/tencent/mm/compatible/i/a$a:duration	I
    //   310: aload 10
    //   312: ifnull +8 -> 320
    //   315: aload 10
    //   317: invokevirtual 231	android/media/MediaPlayer:release	()V
    //   320: aload 12
    //   322: aconst_null
    //   323: putfield 235	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
    //   326: iload_3
    //   327: istore_2
    //   328: aload 8
    //   330: invokeinterface 120 1 0
    //   335: iload_2
    //   336: istore_3
    //   337: iload_3
    //   338: ldc -59
    //   340: if_icmpeq +21 -> 361
    //   343: iload_3
    //   344: i2l
    //   345: lstore 6
    //   347: aload 12
    //   349: aload 13
    //   351: lload 6
    //   353: iconst_1
    //   354: aconst_null
    //   355: invokestatic 241	android/provider/MediaStore$Video$Thumbnails:getThumbnail	(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   358: putfield 235	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
    //   361: aload 12
    //   363: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   366: invokestatic 183	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   369: ifne +76 -> 445
    //   372: aload 12
    //   374: getfield 235	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
    //   377: ifnonnull +68 -> 445
    //   380: ldc 29
    //   382: ldc -13
    //   384: invokestatic 67	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   387: aload 12
    //   389: aload 12
    //   391: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   394: iconst_1
    //   395: invokestatic 249	android/media/ThumbnailUtils:createVideoThumbnail	(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    //   398: putfield 235	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
    //   401: aload 12
    //   403: getfield 235	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
    //   406: ifnonnull +39 -> 445
    //   409: aload_0
    //   410: new 23	android/content/Intent
    //   413: dup
    //   414: ldc -5
    //   416: new 52	java/lang/StringBuilder
    //   419: dup
    //   420: ldc -91
    //   422: invokespecial 58	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   425: aload 12
    //   427: getfield 235	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
    //   430: invokevirtual 254	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   433: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   436: invokestatic 218	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   439: invokespecial 257	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   442: invokevirtual 261	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   445: ldc 29
    //   447: ldc_w 263
    //   450: iconst_3
    //   451: anewarray 4	java/lang/Object
    //   454: dup
    //   455: iconst_0
    //   456: lload 4
    //   458: invokestatic 128	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   461: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   464: aastore
    //   465: dup
    //   466: iconst_1
    //   467: aload 12
    //   469: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   472: aastore
    //   473: dup
    //   474: iconst_2
    //   475: aload 12
    //   477: getfield 212	com/tencent/mm/compatible/i/a$a:duration	I
    //   480: invokestatic 274	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   483: aastore
    //   484: invokestatic 277	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   487: aload 12
    //   489: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   492: ifnull +344 -> 836
    //   495: ldc2_w 191
    //   498: ldc -63
    //   500: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   503: aload 12
    //   505: areturn
    //   506: aload 8
    //   508: ldc -123
    //   510: invokevirtual 90	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   513: ifeq +115 -> 628
    //   516: aload 12
    //   518: aload_0
    //   519: aload_1
    //   520: invokevirtual 27	android/content/Intent:getData	()Landroid/net/Uri;
    //   523: invokestatic 137	com/tencent/mm/sdk/platformtools/bg:f	(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //   526: putfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   529: aload 12
    //   531: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   534: ifnull +312 -> 846
    //   537: aload 12
    //   539: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   542: ldc -117
    //   544: invokevirtual 90	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   547: ifeq +157 -> 704
    //   550: aload 12
    //   552: new 52	java/lang/StringBuilder
    //   555: dup
    //   556: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   559: invokestatic 147	com/tencent/mm/compatible/util/h:getExternalStorageDirectory	()Ljava/io/File;
    //   562: invokevirtual 152	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   565: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   568: aload 12
    //   570: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   573: bipush 24
    //   575: invokevirtual 155	java/lang/String:substring	(I)Ljava/lang/String;
    //   578: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   581: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   584: putfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   587: new 52	java/lang/StringBuilder
    //   590: dup
    //   591: ldc -99
    //   593: invokespecial 58	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   596: aload 12
    //   598: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   601: invokestatic 163	android/database/DatabaseUtils:sqlEscapeString	(Ljava/lang/String;)Ljava/lang/String;
    //   604: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   607: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   610: astore_1
    //   611: aload 13
    //   613: getstatic 81	android/provider/MediaStore$Video$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
    //   616: aconst_null
    //   617: aload_1
    //   618: aconst_null
    //   619: aconst_null
    //   620: invokevirtual 96	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   623: astore 8
    //   625: goto -490 -> 135
    //   628: aload 8
    //   630: ldc -91
    //   632: invokevirtual 90	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   635: ifeq -106 -> 529
    //   638: aload_1
    //   639: invokevirtual 169	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   642: ifnull +39 -> 681
    //   645: aload_1
    //   646: invokevirtual 169	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   649: ldc -85
    //   651: invokevirtual 177	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   654: checkcast 83	android/net/Uri
    //   657: astore_1
    //   658: aload_1
    //   659: ifnull +22 -> 681
    //   662: aload_1
    //   663: invokevirtual 180	android/net/Uri:getPath	()Ljava/lang/String;
    //   666: invokestatic 183	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   669: ifne +12 -> 681
    //   672: aload 12
    //   674: aload_1
    //   675: invokevirtual 180	android/net/Uri:getPath	()Ljava/lang/String;
    //   678: putfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   681: aload 12
    //   683: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   686: ifnonnull -157 -> 529
    //   689: aload 12
    //   691: aload 8
    //   693: bipush 7
    //   695: invokevirtual 155	java/lang/String:substring	(I)Ljava/lang/String;
    //   698: putfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   701: goto -172 -> 529
    //   704: aload 12
    //   706: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   709: ldc -71
    //   711: invokevirtual 90	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   714: ifeq -127 -> 587
    //   717: aload 12
    //   719: new 52	java/lang/StringBuilder
    //   722: dup
    //   723: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   726: invokestatic 147	com/tencent/mm/compatible/util/h:getExternalStorageDirectory	()Ljava/io/File;
    //   729: invokevirtual 152	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   732: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   735: aload 12
    //   737: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   740: bipush 7
    //   742: invokevirtual 155	java/lang/String:substring	(I)Ljava/lang/String;
    //   745: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   748: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   751: putfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   754: goto -167 -> 587
    //   757: iconst_0
    //   758: istore_2
    //   759: goto -462 -> 297
    //   762: astore 10
    //   764: aload 9
    //   766: astore_1
    //   767: ldc 29
    //   769: aload 10
    //   771: ldc_w 279
    //   774: iconst_1
    //   775: anewarray 4	java/lang/Object
    //   778: dup
    //   779: iconst_0
    //   780: aload 12
    //   782: getfield 207	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
    //   785: aastore
    //   786: invokestatic 283	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   789: aload 9
    //   791: ifnull -471 -> 320
    //   794: aload 9
    //   796: invokevirtual 231	android/media/MediaPlayer:release	()V
    //   799: goto -479 -> 320
    //   802: astore_0
    //   803: aload_1
    //   804: ifnull +7 -> 811
    //   807: aload_1
    //   808: invokevirtual 231	android/media/MediaPlayer:release	()V
    //   811: aload_0
    //   812: athrow
    //   813: astore_1
    //   814: ldc 29
    //   816: aload_1
    //   817: ldc_w 285
    //   820: iconst_0
    //   821: anewarray 4	java/lang/Object
    //   824: invokestatic 283	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   827: aload 12
    //   829: aconst_null
    //   830: putfield 235	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
    //   833: goto -472 -> 361
    //   836: ldc2_w 191
    //   839: ldc -63
    //   841: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   844: aconst_null
    //   845: areturn
    //   846: aconst_null
    //   847: astore 8
    //   849: goto -714 -> 135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	852	0	paramContext	Context
    //   0	852	1	paramIntent	Intent
    //   137	622	2	i	int
    //   139	205	3	j	int
    //   39	418	4	l1	long
    //   345	7	6	l2	long
    //   45	803	8	localObject1	Object
    //   246	549	9	locali1	com.tencent.mm.compatible.b.i
    //   242	74	10	locali2	com.tencent.mm.compatible.b.i
    //   762	8	10	localException	Exception
    //   239	24	11	localObject2	Object
    //   104	724	12	locala	a
    //   95	517	13	localContentResolver	ContentResolver
    // Exception table:
    //   from	to	target	type
    //   251	258	762	java/lang/Exception
    //   265	279	762	java/lang/Exception
    //   291	297	762	java/lang/Exception
    //   304	310	762	java/lang/Exception
    //   251	258	802	finally
    //   265	279	802	finally
    //   291	297	802	finally
    //   304	310	802	finally
    //   767	789	802	finally
    //   347	361	813	java/lang/Exception
  }
  
  public static final class a
  {
    public Bitmap bitmap;
    public int duration;
    public String filename;
    
    public a()
    {
      GMTrace.i(13823889113088L, 102996);
      this.filename = null;
      this.bitmap = null;
      this.duration = 0;
      GMTrace.o(13823889113088L, 102996);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */