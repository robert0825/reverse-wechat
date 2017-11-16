package com.tencent.mm.ui.tools;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.ai;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.pluginsdk.l.d;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.transmit.SelectConversationUI;
import com.tencent.mm.ui.transmit.SendAppMessageWrapperUI;
import com.tencent.mm.y.at;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareImgUI
  extends AutoLoginActivity
  implements com.tencent.mm.ad.e
{
  String filePath;
  private ae handler;
  private ProgressDialog htG;
  private Intent intent;
  String text;
  Uri uri;
  ArrayList<String> xft;
  
  public ShareImgUI()
  {
    GMTrace.i(2023063814144L, 15073);
    this.htG = null;
    this.intent = null;
    this.filePath = null;
    this.text = null;
    this.uri = null;
    this.xft = null;
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(20358547636224L, 151683);
        ShareImgUI.d(ShareImgUI.this);
        if (bg.nm(ShareImgUI.this.filePath))
        {
          w.e("MicroMsg.ShareImgUI", "launch : fail, filePath is null");
          ShareImgUI.e(ShareImgUI.this);
          ShareImgUI.this.finish();
          GMTrace.o(20358547636224L, 151683);
          return;
        }
        ShareImgUI.c(ShareImgUI.this);
        GMTrace.o(20358547636224L, 151683);
      }
    };
    GMTrace.o(2023063814144L, 15073);
  }
  
  private void DX(int paramInt)
  {
    GMTrace.i(2024674426880L, 15085);
    switch (paramInt)
    {
    default: 
      Toast.makeText(this, R.l.ecI, 1).show();
      GMTrace.o(2024674426880L, 15085);
      return;
    }
    Toast.makeText(this, R.l.ecG, 1).show();
    GMTrace.o(2024674426880L, 15085);
  }
  
  private void RA()
  {
    GMTrace.i(2023734902784L, 15078);
    if (this.intent == null)
    {
      w.e("MicroMsg.ShareImgUI", "launch : fail, intent is null");
      DX(0);
      finish();
      GMTrace.o(2023734902784L, 15078);
      return;
    }
    Object localObject1 = this.intent.getAction();
    final Object localObject2 = this.intent.getExtras();
    if (bg.nm((String)localObject1))
    {
      w.e("MicroMsg.ShareImgUI", "launch : fail, action is null");
      DX(0);
      finish();
      GMTrace.o(2023734902784L, 15078);
      return;
    }
    this.text = s.i(this.intent, "android.intent.extra.TEXT");
    if (localObject2 != null)
    {
      Parcelable localParcelable = ((Bundle)localObject2).getParcelable("android.intent.extra.STREAM");
      if ((localParcelable != null) && ((localParcelable instanceof Uri)))
      {
        this.uri = ((Uri)localParcelable);
        if (!bg.l(this.uri))
        {
          w.e("MicroMsg.ShareImgUI", "launch : fail, not accepted: %s", new Object[] { this.uri });
          DX(0);
          finish();
          GMTrace.o(2023734902784L, 15078);
          return;
        }
      }
    }
    if (((String)localObject1).equals("android.intent.action.SEND"))
    {
      w.i("MicroMsg.ShareImgUI", "send signal: " + (String)localObject1);
      if (this.uri == null)
      {
        localObject1 = getIntent();
        if (localObject1 == null) {
          w.e("MicroMsg.ShareImgUI", "intent is null");
        }
        for (boolean bool = false;; bool = false)
        {
          w.i("MicroMsg.ShareImgUI", "dealWithText: %b", new Object[] { Boolean.valueOf(bool) });
          if (!bool) {
            DX(0);
          }
          finish();
          GMTrace.o(2023734902784L, 15078);
          return;
          localObject2 = s.i((Intent)localObject1, "android.intent.extra.TEXT");
          if ((localObject2 != null) && (((String)localObject2).length() != 0)) {
            break;
          }
          w.i("MicroMsg.ShareImgUI", "text is null");
        }
        localObject1 = new WXMediaMessage(new WXTextObject((String)localObject2));
        ((WXMediaMessage)localObject1).description = ((String)localObject2);
        localObject2 = new SendMessageToWX.Req();
        ((SendMessageToWX.Req)localObject2).transaction = null;
        ((SendMessageToWX.Req)localObject2).message = ((WXMediaMessage)localObject1);
        localObject1 = new Bundle();
        ((SendMessageToWX.Req)localObject2).toBundle((Bundle)localObject1);
        ((Bundle)localObject1).putInt("_mmessage_sdkVersion", 620822528);
        ((Bundle)localObject1).putString("_mmessage_appPackage", "com.tencent.mm.openapi");
        ((Bundle)localObject1).putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        localObject2 = new Intent();
        ((Intent)localObject2).setClass(this, SelectConversationUI.class);
        ((Intent)localObject2).putExtra("Select_Conv_NextStep", new Intent(this, SendAppMessageWrapperUI.class).putExtras((Bundle)localObject1).putExtra("animation_pop_in", true));
        if ((at.AT()) && (!at.wF())) {
          startActivity((Intent)localObject2);
        }
        for (;;)
        {
          bool = true;
          break;
          w.w("MicroMsg.ShareImgUI", "not logged in, jump to simple login");
          MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent().addFlags(67108864));
        }
      }
      showDialog();
      com.tencent.mm.sdk.f.e.post(new a(this.uri, new c()
      {
        public final void cia()
        {
          GMTrace.i(1910186704896L, 14232);
          ShareImgUI.a(ShareImgUI.this).sendEmptyMessage(0);
          GMTrace.o(1910186704896L, 14232);
        }
      }), "ShareImgUI_getFilePath");
      GMTrace.o(2023734902784L, 15078);
      return;
    }
    if ((((String)localObject1).equals("android.intent.action.SEND_MULTIPLE")) && (localObject2 != null) && (((Bundle)localObject2).containsKey("android.intent.extra.STREAM")))
    {
      w.i("MicroMsg.ShareImgUI", "send multi: " + (String)localObject1);
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void al(ArrayList<String> paramAnonymousArrayList)
        {
          GMTrace.i(20358144983040L, 151680);
          ShareImgUI.this.xft = paramAnonymousArrayList;
          if ((ShareImgUI.this.xft == null) || (ShareImgUI.this.xft.size() == 0))
          {
            w.e("MicroMsg.ShareImgUI", "launch : fail, filePathList is null");
            ShareImgUI.b(ShareImgUI.this);
            ShareImgUI.this.finish();
            GMTrace.o(20358144983040L, 151680);
            return;
          }
          paramAnonymousArrayList = ShareImgUI.this.xft.iterator();
          while (paramAnonymousArrayList.hasNext())
          {
            String str = (String)paramAnonymousArrayList.next();
            if (o.RH(str))
            {
              w.i("MicroMsg.ShareImgUI", "%s is not image", new Object[] { str });
              ShareImgUI.b(ShareImgUI.this);
              ShareImgUI.this.finish();
              GMTrace.o(20358144983040L, 151680);
              return;
            }
          }
          paramAnonymousArrayList = ShareImgUI.this.getIntent().resolveType(ShareImgUI.this);
          if ((paramAnonymousArrayList == null) || (!paramAnonymousArrayList.contains("image")))
          {
            w.i("MicroMsg.ShareImgUI", "mime type is no timage, try to set it");
            ShareImgUI.this.getIntent().setDataAndType(ShareImgUI.this.getIntent().getData(), "image/*");
          }
          ShareImgUI.c(ShareImgUI.this);
          GMTrace.o(20358144983040L, 151680);
        }
      }
      {
        public final void run()
        {
          GMTrace.i(20358413418496L, 151682);
          Object localObject4 = localObject2.getParcelableArrayList("android.intent.extra.STREAM");
          if ((localObject4 != null) && (((ArrayList)localObject4).size() > 0))
          {
            final ArrayList localArrayList = new ArrayList();
            final Object localObject2 = new CountDownLatch(((ArrayList)localObject4).size());
            final Object localObject1 = new boolean[1];
            localObject1[0] = 0;
            localObject4 = ((ArrayList)localObject4).iterator();
            final Object localObject5;
            while (((Iterator)localObject4).hasNext())
            {
              localObject5 = (Parcelable)((Iterator)localObject4).next();
              com.tencent.mm.sdk.f.e.post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(20359352942592L, 151689);
                  if (!ShareImgUI.a(ShareImgUI.this, localArrayList, localObject5)) {
                    localObject1[0] = true;
                  }
                  localObject2.countDown();
                  GMTrace.o(20359352942592L, 151689);
                }
              }, "getMultiSendFilePathListItem" + localObject5.toString());
            }
            try
            {
              ((CountDownLatch)localObject2).await();
              if (localObject1[0] != 0)
              {
                w.d("MicroMsg.ShareImgUI", "hy: has non path img");
                localObject2 = ShareImgUI.this;
                localObject1 = this.xjj;
                localObject4 = null;
                ShareImgUI.a((ShareImgUI)localObject2, (ShareImgUI.b)localObject1, (ArrayList)localObject4);
                GMTrace.o(20358413418496L, 151682);
                return;
              }
            }
            catch (InterruptedException localInterruptedException)
            {
              for (;;)
              {
                w.printErrStackTrace("MicroMsg.ShareImgUI", localInterruptedException, "hy: timeout when getmulti", new Object[0]);
                ShareImgUI.a(ShareImgUI.this, this.xjj, null);
                continue;
                w.i("MicroMsg.ShareImgUI", "hy: getMultiSendFilePathList done. using: %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - this.xjk) });
                localObject4 = ShareImgUI.this;
                localObject5 = this.xjj;
                localObject1 = localObject5;
                Object localObject3 = localObject4;
                if (localArrayList.size() > 0)
                {
                  localObject1 = localObject5;
                  localObject3 = localObject4;
                  localObject4 = localArrayList;
                }
              }
            }
          }
          w.e("MicroMsg.ShareImgUI", "getParcelableArrayList failed");
          ShareImgUI.a(ShareImgUI.this, this.xjj, null);
          GMTrace.o(20358413418496L, 151682);
        }
      }, "getMultiSendFilePathList");
      GMTrace.o(2023734902784L, 15078);
      return;
    }
    w.e("MicroMsg.ShareImgUI", "launch : fail, uri is null");
    DX(0);
    finish();
    GMTrace.o(2023734902784L, 15078);
  }
  
  private static boolean WR(String paramString)
  {
    GMTrace.i(2024271773696L, 15082);
    MMBitmapFactory.DecodeResultLogger localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
    boolean bool = o.a(paramString, localDecodeResultLogger);
    if ((!bool) && (localDecodeResultLogger.getDecodeResult() >= 2000))
    {
      paramString = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 3, localDecodeResultLogger);
      com.tencent.mm.plugin.report.service.g.ork.A(12712, paramString);
    }
    GMTrace.o(2024271773696L, 15082);
    return bool;
  }
  
  private static int WS(String paramString)
  {
    GMTrace.i(19000130011136L, 141562);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.ShareImgUI", "map : mimeType is null");
      GMTrace.o(19000130011136L, 141562);
      return -1;
    }
    paramString = paramString.toLowerCase();
    if (paramString.equalsIgnoreCase("image/gif"))
    {
      GMTrace.o(19000130011136L, 141562);
      return 5;
    }
    if (paramString.contains("image"))
    {
      GMTrace.o(19000130011136L, 141562);
      return 0;
    }
    if (paramString.contains("video"))
    {
      GMTrace.o(19000130011136L, 141562);
      return 1;
    }
    w.d("MicroMsg.ShareImgUI", "map : unknown mimetype, send as file");
    GMTrace.o(19000130011136L, 141562);
    return 3;
  }
  
  private void WY(String paramString)
  {
    GMTrace.i(2024405991424L, 15083);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.ShareImgUI", "dealWithFile fail, filePath is empty");
      GMTrace.o(2024405991424L, 15083);
      return;
    }
    if (!bg.SK(paramString))
    {
      w.e("MicroMsg.ShareImgUI", "dealWithFile fail, filePath is refer to private file.");
      GMTrace.o(2024405991424L, 15083);
      return;
    }
    int i = com.tencent.mm.a.e.aY(paramString);
    w.i("MicroMsg.ShareImgUI", "filelength: [%d]", new Object[] { Integer.valueOf(i) });
    if (i == 0)
    {
      w.e("MicroMsg.ShareImgUI", "dealWithFile fail, fileLength is 0");
      GMTrace.o(2024405991424L, 15083);
      return;
    }
    if (i > 10485760)
    {
      w.e("MicroMsg.ShareImgUI", "summerbig dealWithFile fail, fileLength is too large fileLength[%d],filePath[%s] ", new Object[] { Integer.valueOf(i), paramString });
      Toast.makeText(this, R.l.ecH, 1).show();
      GMTrace.o(2024405991424L, 15083);
      return;
    }
    Object localObject = new WXMediaMessage(new WXFileObject(paramString));
    ((WXMediaMessage)localObject).title = new File(paramString).getName();
    if ("".length() > 0)
    {
      ((WXMediaMessage)localObject).description = "";
      if (i >= 30720) {
        break label369;
      }
      ((WXMediaMessage)localObject).thumbData = com.tencent.mm.a.e.c(paramString, 0, -1);
    }
    for (;;)
    {
      paramString = new SendMessageToWX.Req();
      paramString.transaction = null;
      paramString.message = ((WXMediaMessage)localObject);
      localObject = new Bundle();
      paramString.toBundle((Bundle)localObject);
      ((Bundle)localObject).putInt("_mmessage_sdkVersion", 620822528);
      ((Bundle)localObject).putString("_mmessage_appPackage", "com.tencent.mm.openapi");
      ((Bundle)localObject).putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
      paramString = new Intent();
      paramString.setClass(this, SelectConversationUI.class);
      paramString.putExtra("Select_Conv_NextStep", new Intent(this, SendAppMessageWrapperUI.class).putExtras((Bundle)localObject).putExtra("animation_pop_in", true));
      if ((!at.AT()) || (at.wF())) {
        break label380;
      }
      startActivity(paramString);
      GMTrace.o(2024405991424L, 15083);
      return;
      ((WXMediaMessage)localObject).description = bg.aF(i);
      break;
      label369:
      w.i("MicroMsg.ShareImgUI", "thumb data is exceed 30k, ignore");
    }
    label380:
    w.w("MicroMsg.ShareImgUI", "not logged in, jump to simple login");
    MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent().addFlags(67108864));
    GMTrace.o(2024405991424L, 15083);
  }
  
  /* Error */
  private String a(Uri paramUri, android.database.Cursor paramCursor)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: ldc2_w 490
    //   6: sipush 15084
    //   9: invokestatic 68	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_1
    //   13: ifnull +371 -> 384
    //   16: ldc_w 493
    //   19: astore 4
    //   21: aload_2
    //   22: ldc_w 495
    //   25: invokeinterface 500 2 0
    //   30: istore_3
    //   31: aload 4
    //   33: astore 5
    //   35: iload_3
    //   36: iconst_m1
    //   37: if_icmpeq +70 -> 107
    //   40: aload_2
    //   41: iload_3
    //   42: invokeinterface 504 2 0
    //   47: astore 5
    //   49: aload 5
    //   51: astore 4
    //   53: aload 4
    //   55: astore 5
    //   57: aload 4
    //   59: ifnull +25 -> 84
    //   62: aload 4
    //   64: astore 5
    //   66: aload 4
    //   68: ifnull +16 -> 84
    //   71: aload 4
    //   73: ldc_w 506
    //   76: ldc_w 508
    //   79: invokevirtual 512	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   82: astore 5
    //   84: ldc 116
    //   86: new 185	java/lang/StringBuilder
    //   89: dup
    //   90: ldc_w 514
    //   93: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   96: aload 5
    //   98: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokestatic 199	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   107: aload_2
    //   108: invokeinterface 517 1 0
    //   113: aload_0
    //   114: invokevirtual 521	com/tencent/mm/ui/tools/ShareImgUI:getContentResolver	()Landroid/content/ContentResolver;
    //   117: aload_1
    //   118: ldc_w 523
    //   121: invokevirtual 529	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   124: astore_1
    //   125: aload_1
    //   126: invokevirtual 535	android/content/res/AssetFileDescriptor:createInputStream	()Ljava/io/FileInputStream;
    //   129: astore_2
    //   130: invokestatic 539	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   133: pop
    //   134: invokestatic 544	com/tencent/mm/y/c:isSDCardAvailable	()Z
    //   137: ifeq +283 -> 420
    //   140: new 185	java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial 545	java/lang/StringBuilder:<init>	()V
    //   147: getstatic 550	com/tencent/mm/compatible/util/e:ghz	Ljava/lang/String;
    //   150: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: ldc_w 552
    //   156: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: astore 4
    //   164: new 185	java/lang/StringBuilder
    //   167: dup
    //   168: invokespecial 545	java/lang/StringBuilder:<init>	()V
    //   171: getstatic 550	com/tencent/mm/compatible/util/e:ghz	Ljava/lang/String;
    //   174: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: ldc_w 554
    //   180: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload 5
    //   185: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: astore 8
    //   193: new 451	java/io/File
    //   196: dup
    //   197: aload 4
    //   199: invokespecial 452	java/io/File:<init>	(Ljava/lang/String;)V
    //   202: astore 4
    //   204: aload 4
    //   206: invokevirtual 557	java/io/File:exists	()Z
    //   209: ifne +9 -> 218
    //   212: aload 4
    //   214: invokevirtual 560	java/io/File:mkdir	()Z
    //   217: pop
    //   218: new 451	java/io/File
    //   221: dup
    //   222: aload 8
    //   224: invokespecial 452	java/io/File:<init>	(Ljava/lang/String;)V
    //   227: astore 4
    //   229: aload 4
    //   231: invokevirtual 557	java/io/File:exists	()Z
    //   234: ifne +9 -> 243
    //   237: aload 4
    //   239: invokevirtual 563	java/io/File:createNewFile	()Z
    //   242: pop
    //   243: new 565	java/io/FileOutputStream
    //   246: dup
    //   247: aload 8
    //   249: iconst_0
    //   250: invokespecial 568	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   253: astore 4
    //   255: aload 4
    //   257: astore 7
    //   259: aload_1
    //   260: astore 6
    //   262: aload_2
    //   263: astore 5
    //   265: sipush 5120
    //   268: newarray <illegal type>
    //   270: astore 9
    //   272: aload 4
    //   274: astore 7
    //   276: aload_1
    //   277: astore 6
    //   279: aload_2
    //   280: astore 5
    //   282: aload_2
    //   283: aload 9
    //   285: iconst_0
    //   286: sipush 5120
    //   289: invokevirtual 574	java/io/FileInputStream:read	([BII)I
    //   292: istore_3
    //   293: iload_3
    //   294: iconst_m1
    //   295: if_icmpeq +177 -> 472
    //   298: aload 4
    //   300: astore 7
    //   302: aload_1
    //   303: astore 6
    //   305: aload_2
    //   306: astore 5
    //   308: aload 4
    //   310: aload 9
    //   312: iconst_0
    //   313: iload_3
    //   314: invokevirtual 578	java/io/FileOutputStream:write	([BII)V
    //   317: goto -45 -> 272
    //   320: astore 8
    //   322: aload 4
    //   324: astore 7
    //   326: aload_1
    //   327: astore 6
    //   329: aload_2
    //   330: astore 5
    //   332: ldc 116
    //   334: new 185	java/lang/StringBuilder
    //   337: dup
    //   338: ldc_w 580
    //   341: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   344: aload 8
    //   346: invokevirtual 583	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   349: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   355: invokestatic 124	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   358: aload_2
    //   359: ifnull +7 -> 366
    //   362: aload_2
    //   363: invokevirtual 584	java/io/FileInputStream:close	()V
    //   366: aload_1
    //   367: ifnull +7 -> 374
    //   370: aload_1
    //   371: invokevirtual 585	android/content/res/AssetFileDescriptor:close	()V
    //   374: aload 4
    //   376: ifnull +8 -> 384
    //   379: aload 4
    //   381: invokevirtual 586	java/io/FileOutputStream:close	()V
    //   384: ldc2_w 490
    //   387: sipush 15084
    //   390: invokestatic 88	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   393: aconst_null
    //   394: areturn
    //   395: astore 5
    //   397: ldc 116
    //   399: ldc_w 588
    //   402: iconst_1
    //   403: anewarray 172	java/lang/Object
    //   406: dup
    //   407: iconst_0
    //   408: aload 5
    //   410: invokevirtual 589	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   413: aastore
    //   414: invokestatic 591	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   417: goto -364 -> 53
    //   420: aload_0
    //   421: aload 5
    //   423: invokevirtual 594	com/tencent/mm/ui/tools/ShareImgUI:deleteFile	(Ljava/lang/String;)Z
    //   426: pop
    //   427: new 185	java/lang/StringBuilder
    //   430: dup
    //   431: invokespecial 545	java/lang/StringBuilder:<init>	()V
    //   434: aload_0
    //   435: invokevirtual 598	com/tencent/mm/ui/tools/ShareImgUI:getFilesDir	()Ljava/io/File;
    //   438: invokevirtual 601	java/io/File:getPath	()Ljava/lang/String;
    //   441: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: ldc_w 603
    //   447: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: aload 5
    //   452: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   458: astore 8
    //   460: aload_0
    //   461: aload 5
    //   463: iconst_0
    //   464: invokevirtual 607	com/tencent/mm/ui/tools/ShareImgUI:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   467: astore 4
    //   469: goto -214 -> 255
    //   472: aload 4
    //   474: astore 7
    //   476: aload_1
    //   477: astore 6
    //   479: aload_2
    //   480: astore 5
    //   482: aload 4
    //   484: invokevirtual 610	java/io/FileOutputStream:flush	()V
    //   487: aload 4
    //   489: astore 7
    //   491: aload_1
    //   492: astore 6
    //   494: aload_2
    //   495: astore 5
    //   497: aload 4
    //   499: invokevirtual 586	java/io/FileOutputStream:close	()V
    //   502: aload_2
    //   503: ifnull +7 -> 510
    //   506: aload_2
    //   507: invokevirtual 584	java/io/FileInputStream:close	()V
    //   510: aload_1
    //   511: ifnull +7 -> 518
    //   514: aload_1
    //   515: invokevirtual 585	android/content/res/AssetFileDescriptor:close	()V
    //   518: aload 4
    //   520: ifnull +8 -> 528
    //   523: aload 4
    //   525: invokevirtual 586	java/io/FileOutputStream:close	()V
    //   528: ldc2_w 490
    //   531: sipush 15084
    //   534: invokestatic 88	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   537: aload 8
    //   539: areturn
    //   540: astore 8
    //   542: aconst_null
    //   543: astore 4
    //   545: aconst_null
    //   546: astore_1
    //   547: aconst_null
    //   548: astore_2
    //   549: aload 4
    //   551: astore 7
    //   553: aload_1
    //   554: astore 6
    //   556: aload_2
    //   557: astore 5
    //   559: ldc 116
    //   561: new 185	java/lang/StringBuilder
    //   564: dup
    //   565: ldc_w 612
    //   568: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   571: aload 8
    //   573: invokevirtual 613	java/io/IOException:getMessage	()Ljava/lang/String;
    //   576: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   582: invokestatic 124	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   585: aload_2
    //   586: ifnull +7 -> 593
    //   589: aload_2
    //   590: invokevirtual 584	java/io/FileInputStream:close	()V
    //   593: aload_1
    //   594: ifnull +7 -> 601
    //   597: aload_1
    //   598: invokevirtual 585	android/content/res/AssetFileDescriptor:close	()V
    //   601: aload 4
    //   603: ifnull -219 -> 384
    //   606: aload 4
    //   608: invokevirtual 586	java/io/FileOutputStream:close	()V
    //   611: goto -227 -> 384
    //   614: astore_1
    //   615: goto -231 -> 384
    //   618: astore 8
    //   620: aconst_null
    //   621: astore 4
    //   623: aconst_null
    //   624: astore_1
    //   625: aconst_null
    //   626: astore_2
    //   627: aload 4
    //   629: astore 7
    //   631: aload_1
    //   632: astore 6
    //   634: aload_2
    //   635: astore 5
    //   637: ldc 116
    //   639: new 185	java/lang/StringBuilder
    //   642: dup
    //   643: ldc_w 615
    //   646: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   649: aload 8
    //   651: invokevirtual 589	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   654: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   657: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   660: invokestatic 124	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   663: aload 4
    //   665: astore 7
    //   667: aload_1
    //   668: astore 6
    //   670: aload_2
    //   671: astore 5
    //   673: ldc 116
    //   675: aload 8
    //   677: invokevirtual 616	java/lang/Exception:toString	()Ljava/lang/String;
    //   680: invokestatic 124	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   683: aload_2
    //   684: ifnull +7 -> 691
    //   687: aload_2
    //   688: invokevirtual 584	java/io/FileInputStream:close	()V
    //   691: aload_1
    //   692: ifnull +7 -> 699
    //   695: aload_1
    //   696: invokevirtual 585	android/content/res/AssetFileDescriptor:close	()V
    //   699: aload 4
    //   701: ifnull -317 -> 384
    //   704: aload 4
    //   706: invokevirtual 586	java/io/FileOutputStream:close	()V
    //   709: goto -325 -> 384
    //   712: astore_1
    //   713: goto -329 -> 384
    //   716: astore 4
    //   718: aconst_null
    //   719: astore_1
    //   720: aconst_null
    //   721: astore_2
    //   722: aload_2
    //   723: ifnull +7 -> 730
    //   726: aload_2
    //   727: invokevirtual 584	java/io/FileInputStream:close	()V
    //   730: aload_1
    //   731: ifnull +7 -> 738
    //   734: aload_1
    //   735: invokevirtual 585	android/content/res/AssetFileDescriptor:close	()V
    //   738: aload 7
    //   740: ifnull +8 -> 748
    //   743: aload 7
    //   745: invokevirtual 586	java/io/FileOutputStream:close	()V
    //   748: aload 4
    //   750: athrow
    //   751: astore_1
    //   752: goto -4 -> 748
    //   755: astore 4
    //   757: aconst_null
    //   758: astore_2
    //   759: goto -37 -> 722
    //   762: astore 4
    //   764: goto -42 -> 722
    //   767: astore 4
    //   769: aload 6
    //   771: astore_1
    //   772: aload 5
    //   774: astore_2
    //   775: goto -53 -> 722
    //   778: astore 8
    //   780: aconst_null
    //   781: astore 4
    //   783: aconst_null
    //   784: astore_2
    //   785: goto -158 -> 627
    //   788: astore 8
    //   790: aconst_null
    //   791: astore 4
    //   793: goto -166 -> 627
    //   796: astore 8
    //   798: goto -171 -> 627
    //   801: astore 8
    //   803: aconst_null
    //   804: astore 4
    //   806: aconst_null
    //   807: astore_2
    //   808: goto -259 -> 549
    //   811: astore 8
    //   813: aconst_null
    //   814: astore 4
    //   816: goto -267 -> 549
    //   819: astore 8
    //   821: goto -272 -> 549
    //   824: astore_1
    //   825: goto -441 -> 384
    //   828: astore 8
    //   830: aconst_null
    //   831: astore 4
    //   833: aconst_null
    //   834: astore_1
    //   835: aconst_null
    //   836: astore_2
    //   837: goto -515 -> 322
    //   840: astore 8
    //   842: aconst_null
    //   843: astore 4
    //   845: aconst_null
    //   846: astore_2
    //   847: goto -525 -> 322
    //   850: astore 8
    //   852: aconst_null
    //   853: astore 4
    //   855: goto -533 -> 322
    //   858: astore_1
    //   859: goto -331 -> 528
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	862	0	this	ShareImgUI
    //   0	862	1	paramUri	Uri
    //   0	862	2	paramCursor	android.database.Cursor
    //   30	284	3	i	int
    //   19	686	4	localObject1	Object
    //   716	33	4	localObject2	Object
    //   755	1	4	localObject3	Object
    //   762	1	4	localObject4	Object
    //   767	1	4	localObject5	Object
    //   781	73	4	localObject6	Object
    //   33	298	5	localObject7	Object
    //   395	67	5	localException1	Exception
    //   480	293	5	localCursor	android.database.Cursor
    //   260	510	6	localUri	Uri
    //   1	743	7	localObject8	Object
    //   191	57	8	str1	String
    //   320	25	8	localFileNotFoundException1	java.io.FileNotFoundException
    //   458	80	8	str2	String
    //   540	32	8	localIOException1	java.io.IOException
    //   618	58	8	localException2	Exception
    //   778	1	8	localException3	Exception
    //   788	1	8	localException4	Exception
    //   796	1	8	localException5	Exception
    //   801	1	8	localIOException2	java.io.IOException
    //   811	1	8	localIOException3	java.io.IOException
    //   819	1	8	localIOException4	java.io.IOException
    //   828	1	8	localFileNotFoundException2	java.io.FileNotFoundException
    //   840	1	8	localFileNotFoundException3	java.io.FileNotFoundException
    //   850	1	8	localFileNotFoundException4	java.io.FileNotFoundException
    //   270	41	9	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   265	272	320	java/io/FileNotFoundException
    //   282	293	320	java/io/FileNotFoundException
    //   308	317	320	java/io/FileNotFoundException
    //   482	487	320	java/io/FileNotFoundException
    //   497	502	320	java/io/FileNotFoundException
    //   40	49	395	java/lang/Exception
    //   113	125	540	java/io/IOException
    //   589	593	614	java/lang/Exception
    //   597	601	614	java/lang/Exception
    //   606	611	614	java/lang/Exception
    //   113	125	618	java/lang/Exception
    //   687	691	712	java/lang/Exception
    //   695	699	712	java/lang/Exception
    //   704	709	712	java/lang/Exception
    //   113	125	716	finally
    //   726	730	751	java/lang/Exception
    //   734	738	751	java/lang/Exception
    //   743	748	751	java/lang/Exception
    //   125	130	755	finally
    //   130	218	762	finally
    //   218	243	762	finally
    //   243	255	762	finally
    //   420	469	762	finally
    //   265	272	767	finally
    //   282	293	767	finally
    //   308	317	767	finally
    //   332	358	767	finally
    //   482	487	767	finally
    //   497	502	767	finally
    //   559	585	767	finally
    //   637	663	767	finally
    //   673	683	767	finally
    //   125	130	778	java/lang/Exception
    //   130	218	788	java/lang/Exception
    //   218	243	788	java/lang/Exception
    //   243	255	788	java/lang/Exception
    //   420	469	788	java/lang/Exception
    //   265	272	796	java/lang/Exception
    //   282	293	796	java/lang/Exception
    //   308	317	796	java/lang/Exception
    //   482	487	796	java/lang/Exception
    //   497	502	796	java/lang/Exception
    //   125	130	801	java/io/IOException
    //   130	218	811	java/io/IOException
    //   218	243	811	java/io/IOException
    //   243	255	811	java/io/IOException
    //   420	469	811	java/io/IOException
    //   265	272	819	java/io/IOException
    //   282	293	819	java/io/IOException
    //   308	317	819	java/io/IOException
    //   482	487	819	java/io/IOException
    //   497	502	819	java/io/IOException
    //   362	366	824	java/lang/Exception
    //   370	374	824	java/lang/Exception
    //   379	384	824	java/lang/Exception
    //   113	125	828	java/io/FileNotFoundException
    //   125	130	840	java/io/FileNotFoundException
    //   130	218	850	java/io/FileNotFoundException
    //   218	243	850	java/io/FileNotFoundException
    //   243	255	850	java/io/FileNotFoundException
    //   420	469	850	java/io/FileNotFoundException
    //   506	510	858	java/lang/Exception
    //   514	518	858	java/lang/Exception
    //   523	528	858	java/lang/Exception
  }
  
  private boolean civ()
  {
    GMTrace.i(2024003338240L, 15080);
    Intent localIntent = new Intent(this, ShareImgUI.class);
    if ("android.intent.action.SEND".equals(getIntent().getAction())) {
      if (!bg.nm(this.filePath))
      {
        localIntent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(this.filePath)));
        localIntent.setAction("android.intent.action.SEND");
        localIntent.setType(getIntent().getType());
      }
    }
    for (;;)
    {
      localIntent.addFlags(67108864);
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), localIntent);
      GMTrace.o(2024003338240L, 15080);
      return true;
      GMTrace.o(2024003338240L, 15080);
      return false;
      if (!"android.intent.action.SEND_MULTIPLE".equals(getIntent().getAction())) {
        break label270;
      }
      if (bg.cc(this.xft)) {
        break;
      }
      ArrayList localArrayList = new ArrayList(this.xft.size());
      Iterator localIterator = this.xft.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(Uri.fromFile(new File((String)localIterator.next())));
      }
      localIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", localArrayList);
      localIntent.setAction("android.intent.action.SEND_MULTIPLE");
      localIntent.setType(getIntent().getType());
    }
    GMTrace.o(2024003338240L, 15080);
    return false;
    label270:
    GMTrace.o(2024003338240L, 15080);
    return false;
  }
  
  private void ciw()
  {
    GMTrace.i(2024808644608L, 15086);
    Toast.makeText(this, R.l.dnU, 1).show();
    finish();
    GMTrace.o(2024808644608L, 15086);
  }
  
  private void showDialog()
  {
    GMTrace.i(2024942862336L, 15087);
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(20359084507136L, 151687);
        ShareImgUI.this.finish();
        GMTrace.o(20359084507136L, 151687);
      }
    });
    GMTrace.o(2024942862336L, 15087);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2025077080064L, 15088);
    w.i("MicroMsg.ShareImgUI", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    at.wS().b(1200, this);
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      RA();
      GMTrace.o(2025077080064L, 15088);
      return;
    }
    finish();
    GMTrace.o(2025077080064L, 15088);
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    GMTrace.i(2023466467328L, 15076);
    switch (7.jjk[parama.ordinal()])
    {
    default: 
      finish();
      b.fm(this);
      GMTrace.o(2023466467328L, 15076);
      return;
    }
    this.intent = paramIntent;
    int i = bg.getInt(com.tencent.mm.k.g.ut().getValue("SystemShareControlBitset"), 0);
    w.i("MicroMsg.ShareImgUI", "now permission = %d", new Object[] { Integer.valueOf(i) });
    if ((i & 0x1) > 0)
    {
      w.e("MicroMsg.ShareImgUI", "now allowed to share to friend");
      finish();
      GMTrace.o(2023466467328L, 15076);
      return;
    }
    parama = s.i(paramIntent, "android.intent.extra.TEXT");
    w.i("MicroMsg.ShareImgUI", "postLogin, text = %s", new Object[] { parama });
    if (!bg.nm(parama))
    {
      parama = String.format("weixin://dl/business/systemshare/?txt=%s", new Object[] { URLEncoder.encode(parama) });
      showDialog();
      at.wS().a(1200, this);
      parama = new ai(parama, 15, null);
      at.wS().a(parama, 0);
      GMTrace.o(2023466467328L, 15076);
      return;
    }
    RA();
    GMTrace.o(2023466467328L, 15076);
  }
  
  protected final boolean aUi()
  {
    GMTrace.i(2023332249600L, 15075);
    if ((!at.AT()) || (at.wF()))
    {
      w.w("MicroMsg.ShareImgUI", "not login");
      this.intent = getIntent();
      RA();
      GMTrace.o(2023332249600L, 15075);
      return true;
    }
    GMTrace.o(2023332249600L, 15075);
    return false;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2023600685056L, 15077);
    super.onDestroy();
    at.wS().b(1200, this);
    GMTrace.o(2023600685056L, 15077);
  }
  
  protected final boolean y(Intent paramIntent)
  {
    GMTrace.i(2023198031872L, 15074);
    GMTrace.o(2023198031872L, 15074);
    return true;
  }
  
  private final class a
    implements Runnable
  {
    private Uri mUri;
    private ShareImgUI.c xjr;
    
    public a(Uri paramUri, ShareImgUI.c paramc)
    {
      GMTrace.i(1941191000064L, 14463);
      this.mUri = paramUri;
      this.xjr = paramc;
      GMTrace.o(1941191000064L, 14463);
    }
    
    public final void run()
    {
      GMTrace.i(1941325217792L, 14464);
      ShareImgUI.this.filePath = ShareImgUI.a(ShareImgUI.this, this.mUri);
      if ((bg.nm(ShareImgUI.this.filePath)) || (!new File(ShareImgUI.this.filePath).exists())) {
        if (ShareImgUI.WZ(ShareImgUI.this.getContentResolver().getType(this.mUri)) != 3) {
          break label128;
        }
      }
      label128:
      for (ShareImgUI.this.filePath = d.a(ShareImgUI.this.getContentResolver(), this.mUri);; ShareImgUI.this.filePath = d.a(ShareImgUI.this.getContentResolver(), this.mUri, 1))
      {
        if (this.xjr != null) {
          this.xjr.cia();
        }
        GMTrace.o(1941325217792L, 14464);
        return;
      }
    }
  }
  
  private static abstract interface b
  {
    public abstract void al(ArrayList<String> paramArrayList);
  }
  
  public static abstract interface c
  {
    public abstract void cia();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\ShareImgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */