package com.tencent.mm.ui.tools;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.l.d;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.snackbar.b.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
@JgClassChecked(author=12, fComment="checked", lastDate="20141010", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class AddFavoriteUI
  extends MMActivity
{
  String filePath;
  private ae handler;
  private ProgressDialog htG;
  private Intent intent;
  Uri uri;
  ArrayList<String> xft;
  private ae xfu;
  private ae xfv;
  
  public AddFavoriteUI()
  {
    GMTrace.i(2005212856320L, 14940);
    this.htG = null;
    this.intent = null;
    this.filePath = null;
    this.uri = null;
    this.xft = null;
    this.xfu = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1967631892480L, 14660);
        AddFavoriteUI.d(AddFavoriteUI.this);
        w.i("MicroMsg.AddFavoriteUI", "dealWithText: %b", new Object[] { Boolean.valueOf(AddFavoriteUI.e(AddFavoriteUI.this)) });
        GMTrace.o(1967631892480L, 14660);
      }
    };
    this.xfv = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1931124670464L, 14388);
        AddFavoriteUI.d(AddFavoriteUI.this);
        AddFavoriteUI.f(AddFavoriteUI.this);
        GMTrace.o(1931124670464L, 14388);
      }
    };
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1950049370112L, 14529);
        AddFavoriteUI.d(AddFavoriteUI.this);
        if ((bg.nm(AddFavoriteUI.this.filePath)) || ((bg.SL(AddFavoriteUI.this.filePath)) && (!AddFavoriteUI.WT(AddFavoriteUI.this.filePath))))
        {
          w.e("MicroMsg.AddFavoriteUI", "launch : fail, filePath is null or file is not a valid img.");
          AddFavoriteUI.g(AddFavoriteUI.this);
          AddFavoriteUI.this.finish();
          GMTrace.o(1950049370112L, 14529);
          return;
        }
        AddFavoriteUI.h(AddFavoriteUI.this);
        GMTrace.o(1950049370112L, 14529);
      }
    };
    GMTrace.o(2005212856320L, 14940);
  }
  
  private void DX(int paramInt)
  {
    GMTrace.i(2007226122240L, 14955);
    switch (paramInt)
    {
    default: 
      Toast.makeText(this, R.l.ecI, 1).show();
      GMTrace.o(2007226122240L, 14955);
      return;
    }
    Toast.makeText(this, R.l.ecG, 1).show();
    GMTrace.o(2007226122240L, 14955);
  }
  
  private static boolean WR(String paramString)
  {
    GMTrace.i(2006555033600L, 14950);
    MMBitmapFactory.DecodeResultLogger localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
    boolean bool = o.a(paramString, localDecodeResultLogger);
    if ((!bool) && (localDecodeResultLogger.getDecodeResult() >= 2000))
    {
      paramString = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 5, localDecodeResultLogger);
      g.ork.A(12712, paramString);
    }
    GMTrace.o(2006555033600L, 14950);
    return bool;
  }
  
  private static int WS(String paramString)
  {
    GMTrace.i(2006957686784L, 14953);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AddFavoriteUI", "map : mimeType is null");
      GMTrace.o(2006957686784L, 14953);
      return -1;
    }
    paramString = paramString.toLowerCase();
    if ((paramString.contains("image")) || (paramString.equals("application/vnd.google.panorama360+jpg")))
    {
      GMTrace.o(2006957686784L, 14953);
      return 2;
    }
    if (paramString.contains("video"))
    {
      GMTrace.o(2006957686784L, 14953);
      return 4;
    }
    w.d("MicroMsg.AddFavoriteUI", "map : unknown mimetype, send as file");
    GMTrace.o(2006957686784L, 14953);
    return 8;
  }
  
  /* Error */
  private String a(Uri paramUri, android.database.Cursor paramCursor)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: ldc2_w 225
    //   6: sipush 14952
    //   9: invokestatic 82	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_1
    //   13: ifnull +458 -> 471
    //   16: ldc -28
    //   18: astore 8
    //   20: aload_2
    //   21: ldc -26
    //   23: invokeinterface 235 2 0
    //   28: istore_3
    //   29: iload_3
    //   30: iconst_m1
    //   31: if_icmpeq +58 -> 89
    //   34: aload_2
    //   35: iload_3
    //   36: invokeinterface 239 2 0
    //   41: astore 5
    //   43: aload 5
    //   45: astore 4
    //   47: aload 5
    //   49: ifnull +14 -> 63
    //   52: aload 5
    //   54: ldc -15
    //   56: ldc -13
    //   58: invokevirtual 247	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   61: astore 4
    //   63: ldc -84
    //   65: new 249	java/lang/StringBuilder
    //   68: dup
    //   69: ldc -5
    //   71: invokespecial 254	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   74: aload 4
    //   76: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 261	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokestatic 263	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: aload 4
    //   87: astore 8
    //   89: aload_2
    //   90: invokeinterface 266 1 0
    //   95: aload_0
    //   96: invokevirtual 270	com/tencent/mm/ui/tools/AddFavoriteUI:getContentResolver	()Landroid/content/ContentResolver;
    //   99: aload_1
    //   100: ldc_w 272
    //   103: invokevirtual 278	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   106: astore_1
    //   107: aload_1
    //   108: invokevirtual 284	android/content/res/AssetFileDescriptor:createInputStream	()Ljava/io/FileInputStream;
    //   111: astore_2
    //   112: aload_1
    //   113: invokevirtual 288	android/content/res/AssetFileDescriptor:getDeclaredLength	()J
    //   116: l2i
    //   117: newarray <illegal type>
    //   119: astore 9
    //   121: aload_2
    //   122: aload 9
    //   124: invokevirtual 294	java/io/FileInputStream:read	([B)I
    //   127: ifle +328 -> 455
    //   130: invokestatic 300	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   133: pop
    //   134: invokestatic 306	com/tencent/mm/y/c:isSDCardAvailable	()Z
    //   137: ifne +154 -> 291
    //   140: aload_0
    //   141: aload 8
    //   143: invokevirtual 309	com/tencent/mm/ui/tools/AddFavoriteUI:deleteFile	(Ljava/lang/String;)Z
    //   146: pop
    //   147: aload_0
    //   148: aload 8
    //   150: iconst_0
    //   151: invokevirtual 313	com/tencent/mm/ui/tools/AddFavoriteUI:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   154: astore 4
    //   156: aload 4
    //   158: astore 7
    //   160: aload 7
    //   162: astore 6
    //   164: aload_2
    //   165: astore 5
    //   167: aload_1
    //   168: astore 4
    //   170: aload 7
    //   172: aload 9
    //   174: invokevirtual 319	java/io/FileOutputStream:write	([B)V
    //   177: aload 7
    //   179: astore 6
    //   181: aload_2
    //   182: astore 5
    //   184: aload_1
    //   185: astore 4
    //   187: aload 7
    //   189: invokevirtual 322	java/io/FileOutputStream:flush	()V
    //   192: aload 7
    //   194: astore 6
    //   196: aload_2
    //   197: astore 5
    //   199: aload_1
    //   200: astore 4
    //   202: new 249	java/lang/StringBuilder
    //   205: dup
    //   206: invokespecial 323	java/lang/StringBuilder:<init>	()V
    //   209: aload_0
    //   210: invokevirtual 327	com/tencent/mm/ui/tools/AddFavoriteUI:getFilesDir	()Ljava/io/File;
    //   213: invokevirtual 332	java/io/File:getPath	()Ljava/lang/String;
    //   216: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: ldc_w 334
    //   222: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: aload 8
    //   227: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: invokevirtual 261	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: astore 8
    //   235: aload_2
    //   236: ifnull +7 -> 243
    //   239: aload_2
    //   240: invokevirtual 335	java/io/FileInputStream:close	()V
    //   243: aload_1
    //   244: ifnull +7 -> 251
    //   247: aload_1
    //   248: invokevirtual 336	android/content/res/AssetFileDescriptor:close	()V
    //   251: aload 7
    //   253: ifnull +8 -> 261
    //   256: aload 7
    //   258: invokevirtual 337	java/io/FileOutputStream:close	()V
    //   261: ldc2_w 225
    //   264: sipush 14952
    //   267: invokestatic 106	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   270: aload 8
    //   272: areturn
    //   273: astore_1
    //   274: ldc -84
    //   276: aload_1
    //   277: aload_1
    //   278: invokevirtual 340	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   281: iconst_0
    //   282: anewarray 342	java/lang/Object
    //   285: invokestatic 346	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: goto -27 -> 261
    //   291: new 249	java/lang/StringBuilder
    //   294: dup
    //   295: invokespecial 323	java/lang/StringBuilder:<init>	()V
    //   298: getstatic 351	com/tencent/mm/compatible/util/e:ghz	Ljava/lang/String;
    //   301: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: ldc_w 353
    //   307: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: invokevirtual 261	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   313: astore 5
    //   315: new 249	java/lang/StringBuilder
    //   318: dup
    //   319: invokespecial 323	java/lang/StringBuilder:<init>	()V
    //   322: getstatic 351	com/tencent/mm/compatible/util/e:ghz	Ljava/lang/String;
    //   325: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: ldc_w 355
    //   331: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: aload 8
    //   336: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: invokevirtual 261	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   342: astore 4
    //   344: new 329	java/io/File
    //   347: dup
    //   348: aload 5
    //   350: invokespecial 356	java/io/File:<init>	(Ljava/lang/String;)V
    //   353: astore 5
    //   355: aload 5
    //   357: invokevirtual 359	java/io/File:exists	()Z
    //   360: ifne +9 -> 369
    //   363: aload 5
    //   365: invokevirtual 362	java/io/File:mkdir	()Z
    //   368: pop
    //   369: new 329	java/io/File
    //   372: dup
    //   373: aload 4
    //   375: invokespecial 356	java/io/File:<init>	(Ljava/lang/String;)V
    //   378: astore 5
    //   380: aload 5
    //   382: invokevirtual 359	java/io/File:exists	()Z
    //   385: ifne +9 -> 394
    //   388: aload 5
    //   390: invokevirtual 365	java/io/File:createNewFile	()Z
    //   393: pop
    //   394: aload 4
    //   396: aload 9
    //   398: aload 9
    //   400: arraylength
    //   401: invokestatic 370	com/tencent/mm/a/e:b	(Ljava/lang/String;[BI)I
    //   404: istore_3
    //   405: iload_3
    //   406: ifne +49 -> 455
    //   409: aload_2
    //   410: ifnull +7 -> 417
    //   413: aload_2
    //   414: invokevirtual 335	java/io/FileInputStream:close	()V
    //   417: aload_1
    //   418: ifnull +7 -> 425
    //   421: aload_1
    //   422: invokevirtual 336	android/content/res/AssetFileDescriptor:close	()V
    //   425: ldc2_w 225
    //   428: sipush 14952
    //   431: invokestatic 106	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   434: aload 4
    //   436: areturn
    //   437: astore_1
    //   438: ldc -84
    //   440: aload_1
    //   441: aload_1
    //   442: invokevirtual 340	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   445: iconst_0
    //   446: anewarray 342	java/lang/Object
    //   449: invokestatic 346	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   452: goto -27 -> 425
    //   455: aload_2
    //   456: ifnull +7 -> 463
    //   459: aload_2
    //   460: invokevirtual 335	java/io/FileInputStream:close	()V
    //   463: aload_1
    //   464: ifnull +7 -> 471
    //   467: aload_1
    //   468: invokevirtual 336	android/content/res/AssetFileDescriptor:close	()V
    //   471: ldc2_w 225
    //   474: sipush 14952
    //   477: invokestatic 106	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   480: aconst_null
    //   481: areturn
    //   482: astore_1
    //   483: ldc -84
    //   485: aload_1
    //   486: aload_1
    //   487: invokevirtual 340	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   490: iconst_0
    //   491: anewarray 342	java/lang/Object
    //   494: invokestatic 346	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   497: goto -26 -> 471
    //   500: astore 8
    //   502: aconst_null
    //   503: astore 7
    //   505: aconst_null
    //   506: astore_2
    //   507: aconst_null
    //   508: astore_1
    //   509: aload 7
    //   511: astore 6
    //   513: aload_2
    //   514: astore 5
    //   516: aload_1
    //   517: astore 4
    //   519: ldc -84
    //   521: new 249	java/lang/StringBuilder
    //   524: dup
    //   525: ldc_w 372
    //   528: invokespecial 254	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   531: aload 8
    //   533: invokevirtual 373	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   536: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: invokevirtual 261	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   542: invokestatic 180	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   545: aload_2
    //   546: ifnull +7 -> 553
    //   549: aload_2
    //   550: invokevirtual 335	java/io/FileInputStream:close	()V
    //   553: aload_1
    //   554: ifnull +7 -> 561
    //   557: aload_1
    //   558: invokevirtual 336	android/content/res/AssetFileDescriptor:close	()V
    //   561: aload 7
    //   563: ifnull -92 -> 471
    //   566: aload 7
    //   568: invokevirtual 337	java/io/FileOutputStream:close	()V
    //   571: goto -100 -> 471
    //   574: astore_1
    //   575: ldc -84
    //   577: aload_1
    //   578: aload_1
    //   579: invokevirtual 340	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   582: iconst_0
    //   583: anewarray 342	java/lang/Object
    //   586: invokestatic 346	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   589: goto -118 -> 471
    //   592: astore 8
    //   594: aconst_null
    //   595: astore 7
    //   597: aconst_null
    //   598: astore_2
    //   599: aconst_null
    //   600: astore_1
    //   601: aload 7
    //   603: astore 6
    //   605: aload_2
    //   606: astore 5
    //   608: aload_1
    //   609: astore 4
    //   611: ldc -84
    //   613: new 249	java/lang/StringBuilder
    //   616: dup
    //   617: ldc_w 375
    //   620: invokespecial 254	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   623: aload 8
    //   625: invokevirtual 376	java/io/IOException:getMessage	()Ljava/lang/String;
    //   628: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   631: invokevirtual 261	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   634: invokestatic 180	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   637: aload_2
    //   638: ifnull +7 -> 645
    //   641: aload_2
    //   642: invokevirtual 335	java/io/FileInputStream:close	()V
    //   645: aload_1
    //   646: ifnull +7 -> 653
    //   649: aload_1
    //   650: invokevirtual 336	android/content/res/AssetFileDescriptor:close	()V
    //   653: aload 7
    //   655: ifnull -184 -> 471
    //   658: aload 7
    //   660: invokevirtual 337	java/io/FileOutputStream:close	()V
    //   663: goto -192 -> 471
    //   666: astore_1
    //   667: ldc -84
    //   669: aload_1
    //   670: aload_1
    //   671: invokevirtual 340	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   674: iconst_0
    //   675: anewarray 342	java/lang/Object
    //   678: invokestatic 346	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   681: goto -210 -> 471
    //   684: astore 8
    //   686: aconst_null
    //   687: astore 7
    //   689: aconst_null
    //   690: astore_2
    //   691: aconst_null
    //   692: astore_1
    //   693: aload 7
    //   695: astore 6
    //   697: aload_2
    //   698: astore 5
    //   700: aload_1
    //   701: astore 4
    //   703: ldc -84
    //   705: new 249	java/lang/StringBuilder
    //   708: dup
    //   709: ldc_w 378
    //   712: invokespecial 254	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   715: aload 8
    //   717: invokevirtual 340	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   720: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   723: invokevirtual 261	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   726: invokestatic 180	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   729: aload_2
    //   730: ifnull +7 -> 737
    //   733: aload_2
    //   734: invokevirtual 335	java/io/FileInputStream:close	()V
    //   737: aload_1
    //   738: ifnull +7 -> 745
    //   741: aload_1
    //   742: invokevirtual 336	android/content/res/AssetFileDescriptor:close	()V
    //   745: aload 7
    //   747: ifnull -276 -> 471
    //   750: aload 7
    //   752: invokevirtual 337	java/io/FileOutputStream:close	()V
    //   755: goto -284 -> 471
    //   758: astore_1
    //   759: ldc -84
    //   761: aload_1
    //   762: aload_1
    //   763: invokevirtual 340	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   766: iconst_0
    //   767: anewarray 342	java/lang/Object
    //   770: invokestatic 346	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   773: goto -302 -> 471
    //   776: astore 6
    //   778: aconst_null
    //   779: astore_2
    //   780: aconst_null
    //   781: astore_1
    //   782: aload_2
    //   783: ifnull +7 -> 790
    //   786: aload_2
    //   787: invokevirtual 335	java/io/FileInputStream:close	()V
    //   790: aload_1
    //   791: ifnull +7 -> 798
    //   794: aload_1
    //   795: invokevirtual 336	android/content/res/AssetFileDescriptor:close	()V
    //   798: aload 7
    //   800: ifnull +8 -> 808
    //   803: aload 7
    //   805: invokevirtual 337	java/io/FileOutputStream:close	()V
    //   808: aload 6
    //   810: athrow
    //   811: astore_1
    //   812: ldc -84
    //   814: aload_1
    //   815: aload_1
    //   816: invokevirtual 340	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   819: iconst_0
    //   820: anewarray 342	java/lang/Object
    //   823: invokestatic 346	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   826: goto -18 -> 808
    //   829: astore 6
    //   831: aconst_null
    //   832: astore_2
    //   833: goto -51 -> 782
    //   836: astore 6
    //   838: goto -56 -> 782
    //   841: astore_1
    //   842: aload 6
    //   844: astore 7
    //   846: aload_1
    //   847: astore 6
    //   849: aload 5
    //   851: astore_2
    //   852: aload 4
    //   854: astore_1
    //   855: goto -73 -> 782
    //   858: astore 8
    //   860: aconst_null
    //   861: astore 7
    //   863: aconst_null
    //   864: astore_2
    //   865: goto -172 -> 693
    //   868: astore 8
    //   870: aconst_null
    //   871: astore 7
    //   873: goto -180 -> 693
    //   876: astore 8
    //   878: goto -185 -> 693
    //   881: astore 8
    //   883: aconst_null
    //   884: astore 7
    //   886: aconst_null
    //   887: astore_2
    //   888: goto -287 -> 601
    //   891: astore 8
    //   893: aconst_null
    //   894: astore 7
    //   896: goto -295 -> 601
    //   899: astore 8
    //   901: goto -300 -> 601
    //   904: astore 8
    //   906: aconst_null
    //   907: astore 7
    //   909: aconst_null
    //   910: astore_2
    //   911: goto -402 -> 509
    //   914: astore 8
    //   916: aconst_null
    //   917: astore 7
    //   919: goto -410 -> 509
    //   922: astore 8
    //   924: goto -415 -> 509
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	927	0	this	AddFavoriteUI
    //   0	927	1	paramUri	Uri
    //   0	927	2	paramCursor	android.database.Cursor
    //   28	378	3	i	int
    //   45	808	4	localObject1	Object
    //   41	809	5	localObject2	Object
    //   162	534	6	localObject3	Object
    //   776	33	6	localObject4	Object
    //   829	1	6	localObject5	Object
    //   836	7	6	localObject6	Object
    //   847	1	6	localUri	Uri
    //   1	917	7	localObject7	Object
    //   18	317	8	localObject8	Object
    //   500	32	8	localFileNotFoundException1	java.io.FileNotFoundException
    //   592	32	8	localIOException1	java.io.IOException
    //   684	32	8	localException1	Exception
    //   858	1	8	localException2	Exception
    //   868	1	8	localException3	Exception
    //   876	1	8	localException4	Exception
    //   881	1	8	localIOException2	java.io.IOException
    //   891	1	8	localIOException3	java.io.IOException
    //   899	1	8	localIOException4	java.io.IOException
    //   904	1	8	localFileNotFoundException2	java.io.FileNotFoundException
    //   914	1	8	localFileNotFoundException3	java.io.FileNotFoundException
    //   922	1	8	localFileNotFoundException4	java.io.FileNotFoundException
    //   119	280	9	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   239	243	273	java/lang/Exception
    //   247	251	273	java/lang/Exception
    //   256	261	273	java/lang/Exception
    //   413	417	437	java/lang/Exception
    //   421	425	437	java/lang/Exception
    //   459	463	482	java/lang/Exception
    //   467	471	482	java/lang/Exception
    //   95	107	500	java/io/FileNotFoundException
    //   549	553	574	java/lang/Exception
    //   557	561	574	java/lang/Exception
    //   566	571	574	java/lang/Exception
    //   95	107	592	java/io/IOException
    //   641	645	666	java/lang/Exception
    //   649	653	666	java/lang/Exception
    //   658	663	666	java/lang/Exception
    //   95	107	684	java/lang/Exception
    //   733	737	758	java/lang/Exception
    //   741	745	758	java/lang/Exception
    //   750	755	758	java/lang/Exception
    //   95	107	776	finally
    //   786	790	811	java/lang/Exception
    //   794	798	811	java/lang/Exception
    //   803	808	811	java/lang/Exception
    //   107	112	829	finally
    //   112	156	836	finally
    //   291	369	836	finally
    //   369	394	836	finally
    //   394	405	836	finally
    //   170	177	841	finally
    //   187	192	841	finally
    //   202	235	841	finally
    //   519	545	841	finally
    //   611	637	841	finally
    //   703	729	841	finally
    //   107	112	858	java/lang/Exception
    //   112	156	868	java/lang/Exception
    //   291	369	868	java/lang/Exception
    //   369	394	868	java/lang/Exception
    //   394	405	868	java/lang/Exception
    //   170	177	876	java/lang/Exception
    //   187	192	876	java/lang/Exception
    //   202	235	876	java/lang/Exception
    //   107	112	881	java/io/IOException
    //   112	156	891	java/io/IOException
    //   291	369	891	java/io/IOException
    //   369	394	891	java/io/IOException
    //   394	405	891	java/io/IOException
    //   170	177	899	java/io/IOException
    //   187	192	899	java/io/IOException
    //   202	235	899	java/io/IOException
    //   107	112	904	java/io/FileNotFoundException
    //   112	156	914	java/io/FileNotFoundException
    //   291	369	914	java/io/FileNotFoundException
    //   369	394	914	java/io/FileNotFoundException
    //   394	405	914	java/io/FileNotFoundException
    //   170	177	922	java/io/FileNotFoundException
    //   187	192	922	java/io/FileNotFoundException
    //   202	235	922	java/io/FileNotFoundException
  }
  
  private void aN(int paramInt, String paramString)
  {
    GMTrace.i(2006689251328L, 14951);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AddFavoriteUI", "dealWithFile fail, filePath is empty");
      GMTrace.o(2006689251328L, 14951);
      return;
    }
    int i = com.tencent.mm.a.e.aY(paramString);
    w.i("MicroMsg.AddFavoriteUI", "filelength: [%d]", new Object[] { Integer.valueOf(i) });
    if (i == 0)
    {
      w.e("MicroMsg.AddFavoriteUI", "dealWithFile fail, fileLength is 0");
      Toast.makeText(this, R.l.dtL, 1).show();
      finish();
      GMTrace.o(2006689251328L, 14951);
      return;
    }
    if (i > 26214400)
    {
      w.e("MicroMsg.AddFavoriteUI", "dealWithFile fail, fileLength is too large");
      Toast.makeText(this, R.l.dva, 1).show();
      finish();
      GMTrace.o(2006689251328L, 14951);
      return;
    }
    if ((at.AT()) && (!at.wF()))
    {
      Object localObject2 = new WXMediaMessage(new WXFileObject(paramString));
      ((WXMediaMessage)localObject2).title = new File(paramString).getName();
      label219:
      Object localObject1;
      if (bg.nm(null))
      {
        ((WXMediaMessage)localObject2).description = bg.aF(i);
        if (i >= 30720) {
          break label432;
        }
        ((WXMediaMessage)localObject2).thumbData = com.tencent.mm.a.e.c(paramString, 0, -1);
        localObject1 = new SendMessageToWX.Req();
        ((SendMessageToWX.Req)localObject1).transaction = null;
        ((SendMessageToWX.Req)localObject1).message = ((WXMediaMessage)localObject2);
        localObject2 = new Bundle();
        ((SendMessageToWX.Req)localObject1).toBundle((Bundle)localObject2);
        ((Bundle)localObject2).putInt("_mmessage_sdkVersion", 620822528);
        ((Bundle)localObject2).putString("_mmessage_appPackage", "com.tencent.mm.openapi");
        ((Bundle)localObject2).putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        localObject1 = new cf();
        localObject2 = com.tencent.mm.a.e.bc(paramString) + "." + com.tencent.mm.a.e.bb(paramString);
        if (paramInt != 4) {
          break label696;
        }
        if (!bg.nm(paramString)) {
          break label443;
        }
        w.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
        ((cf)localObject1).eDv.eDB = R.l.dtu;
      }
      for (;;)
      {
        ((cf)localObject1).eDv.activity = this;
        ((cf)localObject1).eDv.eDD = new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1952062636032L, 14544);
            AddFavoriteUI.this.finish();
            GMTrace.o(1952062636032L, 14544);
          }
        };
        ((cf)localObject1).eDv.eDE = new b.c()
        {
          public final void aDT()
          {
            GMTrace.i(2030445789184L, 15128);
            GMTrace.o(2030445789184L, 15128);
          }
          
          public final void onHide()
          {
            GMTrace.i(2030311571456L, 15127);
            AddFavoriteUI.this.finish();
            GMTrace.o(2030311571456L, 15127);
          }
          
          public final void onShow()
          {
            GMTrace.i(2030177353728L, 15126);
            GMTrace.o(2030177353728L, 15126);
          }
        };
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        GMTrace.o(2006689251328L, 14951);
        return;
        ((WXMediaMessage)localObject2).description = null;
        break;
        label432:
        w.i("MicroMsg.AddFavoriteUI", "thumb data is exceed 30k, ignore");
        break label219;
        label443:
        w.d("MicroMsg.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", new Object[] { localObject2, "", paramString, Integer.valueOf(13) });
        if (new File(paramString).length() > com.tencent.mm.k.b.uc())
        {
          ((cf)localObject1).eDv.eDB = R.l.dva;
        }
        else
        {
          tt localtt = new tt();
          tw localtw = new tw();
          th localth = new th();
          localth.Qu(paramString);
          localth.zR(4);
          localth.Qq(com.tencent.mm.a.e.bb(paramString));
          localth.Qv(null);
          localth.zQ(0);
          localth.Qg((String)localObject2);
          localth.Qh("");
          localtw.QY(q.zE());
          localtw.QZ(q.zE());
          localtw.zZ(13);
          localtw.eE(bg.Pv());
          localtt.a(localtw);
          localtt.ulB.add(localth);
          ((cf)localObject1).eDv.title = localth.title;
          ((cf)localObject1).eDv.desc = localth.title;
          ((cf)localObject1).eDv.eDx = localtt;
          ((cf)localObject1).eDv.type = 4;
          continue;
          label696:
          com.tencent.mm.pluginsdk.model.e.a((cf)localObject1, 13, paramString, (String)localObject2, "");
        }
      }
    }
    w.w("MicroMsg.AddFavoriteUI", "not logged in, jump to simple login");
    finish();
    chY();
    GMTrace.o(2006689251328L, 14951);
  }
  
  private ArrayList<String> al(Bundle paramBundle)
  {
    GMTrace.i(2006420815872L, 14949);
    Object localObject1 = paramBundle.getParcelableArrayList("android.intent.extra.STREAM");
    if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
    {
      paramBundle = new ArrayList();
      localObject1 = ((ArrayList)localObject1).iterator();
      if (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Parcelable)((Iterator)localObject1).next();
        if ((localObject2 == null) || (!(localObject2 instanceof Uri))) {
          w.e("MicroMsg.AddFavoriteUI", "getMultiSendFilePath failed, error parcelable, %s", new Object[] { localObject2 });
        }
        for (;;)
        {
          for (int i = 0;; i = 1)
          {
            if (i != 0) {
              break label196;
            }
            GMTrace.o(2006420815872L, 14949);
            return null;
            localObject2 = (Uri)localObject2;
            if ((!bg.l((Uri)localObject2)) || (((Uri)localObject2).getScheme() == null)) {
              break label224;
            }
            localObject2 = bg.f(this, (Uri)localObject2);
            if (bg.nm((String)localObject2)) {
              break;
            }
            if ((!bg.SL((String)localObject2)) || (!WR((String)localObject2))) {
              break label198;
            }
            w.i("MicroMsg.AddFavoriteUI", "multisend file path: " + (String)localObject2);
            paramBundle.add(localObject2);
          }
          label196:
          break;
          label198:
          w.w("MicroMsg.AddFavoriteUI", "multisend tries to send illegal img: " + (String)localObject2);
          continue;
          label224:
          w.e("MicroMsg.AddFavoriteUI", "unaccepted uri: " + localObject2);
        }
      }
      if (paramBundle.size() > 0)
      {
        GMTrace.o(2006420815872L, 14949);
        return paramBundle;
      }
      GMTrace.o(2006420815872L, 14949);
      return null;
    }
    w.e("MicroMsg.AddFavoriteUI", "getParcelableArrayList failed");
    GMTrace.o(2006420815872L, 14949);
    return null;
  }
  
  private void chY()
  {
    GMTrace.i(2006286598144L, 14948);
    Intent localIntent = new Intent(this, AddFavoriteUI.class);
    localIntent.setAction("android.intent.action.SEND");
    if (bg.nm(this.filePath)) {}
    for (Object localObject = null;; localObject = Uri.fromFile(new File(this.filePath)))
    {
      localIntent.putExtra("android.intent.extra.STREAM", (Parcelable)localObject);
      localIntent.addFlags(268435456).addFlags(32768);
      localIntent.setType(getIntent().getType());
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), localIntent);
      GMTrace.o(2006286598144L, 14948);
      return;
    }
  }
  
  private void chZ()
  {
    GMTrace.i(2007091904512L, 14954);
    DX(0);
    Toast.makeText(this, R.l.ecI, 1).show();
    GMTrace.o(2007091904512L, 14954);
  }
  
  private void showDialog()
  {
    GMTrace.i(2007360339968L, 14956);
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(1992999043072L, 14849);
        GMTrace.o(1992999043072L, 14849);
      }
    });
    GMTrace.o(2007360339968L, 14956);
  }
  
  protected final void MP()
  {
    GMTrace.i(2006152380416L, 14947);
    this.intent = getIntent();
    if (this.intent == null)
    {
      w.e("MicroMsg.AddFavoriteUI", "launch : fail, intent is null");
      chZ();
      finish();
      GMTrace.o(2006152380416L, 14947);
      return;
    }
    String str = this.intent.getAction();
    Bundle localBundle = s.ah(this.intent);
    if (bg.nm(str))
    {
      w.e("MicroMsg.AddFavoriteUI", "launch : fail, action is null");
      chZ();
      finish();
      GMTrace.o(2006152380416L, 14947);
      return;
    }
    Object localObject;
    if (localBundle != null)
    {
      localObject = localBundle.getParcelable("android.intent.extra.STREAM");
      if ((localObject instanceof Uri))
      {
        this.uri = ((Uri)localObject);
        if (!bg.l(this.uri))
        {
          w.e("MicroMsg.AddFavoriteUI", "launch : fail, not accept, %s", new Object[] { this.uri });
          chZ();
          finish();
          GMTrace.o(2006152380416L, 14947);
        }
      }
      else if (localObject != null)
      {
        w.e("MicroMsg.AddFavoriteUI", "launch : fail, uri check fail, %s", new Object[] { localObject });
        chZ();
        finish();
        GMTrace.o(2006152380416L, 14947);
        return;
      }
    }
    if (str.equals("android.intent.action.SEND"))
    {
      w.i("MicroMsg.AddFavoriteUI", "send signal: " + str);
      if (this.uri == null)
      {
        showDialog();
        com.tencent.mm.sdk.f.e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2017695105024L, 15033);
            AddFavoriteUI.a(AddFavoriteUI.this).sendEmptyMessage(0);
            GMTrace.o(2017695105024L, 15033);
          }
        }, "AddFavoriteUI_dealWithTextHandler");
        GMTrace.o(2006152380416L, 14947);
        return;
      }
      showDialog();
      com.tencent.mm.sdk.f.e.post(new a(this.uri, new b()
      {
        public final void cia()
        {
          GMTrace.i(1958907740160L, 14595);
          AddFavoriteUI.b(AddFavoriteUI.this).sendEmptyMessage(0);
          GMTrace.o(1958907740160L, 14595);
        }
      }), "AddFavoriteUI_getFilePath");
      GMTrace.o(2006152380416L, 14947);
      return;
    }
    if ((str.equals("android.intent.action.SEND_MULTIPLE")) && (localBundle != null) && (localBundle.containsKey("android.intent.extra.STREAM")))
    {
      localObject = getIntent().resolveType(this);
      w.i("MicroMsg.AddFavoriteUI", "send multi: %s, mimeType %s", new Object[] { str, localObject });
      if (!bg.aq((String)localObject, "").contains("image"))
      {
        w.e("MicroMsg.AddFavoriteUI", "launch : fail, mimeType not contains image");
        DX(1);
        finish();
        GMTrace.o(2006152380416L, 14947);
        return;
      }
      this.xft = al(localBundle);
      if ((this.xft == null) || (this.xft.size() == 0))
      {
        w.e("MicroMsg.AddFavoriteUI", "launch : fail, filePathList is null");
        DX(1);
        finish();
        GMTrace.o(2006152380416L, 14947);
        return;
      }
      showDialog();
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1932332630016L, 14397);
          AddFavoriteUI.c(AddFavoriteUI.this).sendEmptyMessage(0);
          GMTrace.o(1932332630016L, 14397);
        }
      }, "AddFavoriteUI_dealWithMultiItemHandler");
      GMTrace.o(2006152380416L, 14947);
      return;
    }
    w.e("MicroMsg.AddFavoriteUI", "launch : fail, uri is null");
    chZ();
    finish();
    GMTrace.o(2006152380416L, 14947);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2006018162688L, 14946);
    GMTrace.o(2006018162688L, 14946);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2005347074048L, 14941);
    w.i("MicroMsg.AddFavoriteUI", "on create");
    super.onCreate(paramBundle);
    AU(8);
    int i = s.a(getIntent(), "wizard_activity_result_code", 0);
    switch (i)
    {
    default: 
      w.e("MicroMsg.AddFavoriteUI", "onCreate, should not reach here, resultCode = " + i);
      finish();
      GMTrace.o(2005347074048L, 14941);
      return;
    case 1: 
      finish();
      GMTrace.o(2005347074048L, 14941);
      return;
    }
    NotifyReceiver.rn();
    MP();
    GMTrace.o(2005347074048L, 14941);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2005883944960L, 14945);
    w.i("MicroMsg.AddFavoriteUI", "on Destroy");
    super.onDestroy();
    GMTrace.o(2005883944960L, 14945);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(2005615509504L, 14943);
    w.i("MicroMsg.AddFavoriteUI", "on NewIntent");
    super.onNewIntent(paramIntent);
    GMTrace.o(2005615509504L, 14943);
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    GMTrace.i(2005749727232L, 14944);
    w.i("MicroMsg.AddFavoriteUI", "on RestoreInstanceState");
    super.onRestoreInstanceState(paramBundle);
    GMTrace.o(2005749727232L, 14944);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(2005481291776L, 14942);
    w.i("MicroMsg.AddFavoriteUI", "on SaveInstanceState");
    super.onSaveInstanceState(paramBundle);
    GMTrace.o(2005481291776L, 14942);
  }
  
  private final class a
    implements Runnable
  {
    private Uri mUri;
    private AddFavoriteUI.b xfx;
    
    public a(Uri paramUri, AddFavoriteUI.b paramb)
    {
      GMTrace.i(1919313510400L, 14300);
      this.mUri = paramUri;
      this.xfx = paramb;
      GMTrace.o(1919313510400L, 14300);
    }
    
    public final void run()
    {
      GMTrace.i(1919447728128L, 14301);
      AddFavoriteUI.this.filePath = AddFavoriteUI.a(AddFavoriteUI.this, this.mUri);
      if ((bg.nm(AddFavoriteUI.this.filePath)) || (!new File(AddFavoriteUI.this.filePath).exists())) {
        if (AddFavoriteUI.WU(AddFavoriteUI.this.getContentResolver().getType(this.mUri)) != 8) {
          break label129;
        }
      }
      label129:
      for (AddFavoriteUI.this.filePath = d.a(AddFavoriteUI.this.getContentResolver(), this.mUri);; AddFavoriteUI.this.filePath = d.a(AddFavoriteUI.this.getContentResolver(), this.mUri, 1))
      {
        if (this.xfx != null) {
          this.xfx.cia();
        }
        GMTrace.o(1919447728128L, 14301);
        return;
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void cia();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\AddFavoriteUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */