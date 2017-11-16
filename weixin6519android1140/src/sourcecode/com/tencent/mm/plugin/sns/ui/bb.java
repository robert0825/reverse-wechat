package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnDragListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bw.d;
import com.tencent.mm.g.a.li;
import com.tencent.mm.g.a.rm;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.av.a;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.base.MMPullDownView.g;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.tools.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class bb
  implements av.a, b.b
{
  protected String filePath;
  protected com.tencent.mm.ui.base.r hsU;
  public String iAx;
  private String lTY;
  public Activity mActivity;
  protected MMPullDownView mTU;
  protected ListView mqO;
  private String pQl;
  private boolean pQm;
  public boolean pQn;
  private int pQo;
  public int pmG;
  private boolean pps;
  protected SnsHeader pzn;
  protected LoadingMoreView qiM;
  public int qiN;
  private boolean qiO;
  protected boolean qiP;
  public int qiQ;
  public a qiR;
  private String qiS;
  com.tencent.mm.modelsns.b qiT;
  protected String title;
  
  public bb(Activity paramActivity)
  {
    GMTrace.i(8381494460416L, 62447);
    this.hsU = null;
    this.qiN = 0;
    this.qiO = false;
    this.qiP = false;
    this.pps = false;
    this.pmG = 0;
    this.qiQ = 0;
    this.qiT = null;
    this.mActivity = paramActivity;
    GMTrace.o(8381494460416L, 62447);
  }
  
  private void V(Intent paramIntent)
  {
    GMTrace.i(8382433984512L, 62454);
    new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8369146429440L, 62355);
        com.tencent.mm.plugin.sns.c.a.hnI.pt();
        GMTrace.o(8369146429440L, 62355);
      }
    });
    w.d("MicroMsg.SnsActivity", "onActivityResult CONTEXT_CHOSE_IMAGE_CONFIRM");
    w.d("MicroMsg.SnsActivity", "CONTEXT_CHOSE_IMAGE_CONFIRM filePath " + this.filePath);
    if (this.filePath == null)
    {
      GMTrace.o(8382433984512L, 62454);
      return;
    }
    String str = "pre_temp_sns_pic" + com.tencent.mm.a.g.n(new StringBuilder().append(this.filePath).append(System.currentTimeMillis()).toString().getBytes());
    com.tencent.mm.plugin.sns.storage.r.X(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath(), this.filePath, str);
    this.filePath = (com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str);
    w.d("MicroMsg.SnsActivity", "newPath " + this.filePath);
    if (paramIntent != null) {}
    for (int i = paramIntent.getIntExtra("CropImage_filterId", 0);; i = 0)
    {
      paramIntent = new Intent(this.mActivity, En_c4f742e5.class);
      paramIntent.putExtra("KSnsPostManu", true);
      paramIntent.putExtra("KTouchCameraTime", bg.Pu());
      if (this.qiT != null)
      {
        this.qiT.b(paramIntent, "intent_key_StatisticsOplog");
        this.qiT = null;
      }
      paramIntent.putExtra("sns_kemdia_path", this.filePath);
      paramIntent.putExtra("KFilterId", i);
      if (this.pps) {
        paramIntent.putExtra("Kis_take_photo", true);
      }
      if (this.pQn) {
        paramIntent.putExtra("Ksnsupload_source", 11);
      }
      this.mActivity.startActivityForResult(paramIntent, 6);
      this.pps = false;
      GMTrace.o(8382433984512L, 62454);
      return;
    }
  }
  
  public static void onPause()
  {
    GMTrace.i(8382165549056L, 62452);
    li localli = new li();
    localli.ePD.ePE = false;
    com.tencent.mm.sdk.b.a.vgX.a(localli, Looper.getMainLooper());
    w.d("MicroMsg.SnsActivity", "AppAttachDownloadUI cancel pause auto download logic");
    GMTrace.o(8382165549056L, 62452);
  }
  
  public static void onResume()
  {
    GMTrace.i(8382031331328L, 62451);
    com.tencent.mm.plugin.sns.model.ae.biY().E(2, false);
    com.tencent.mm.pluginsdk.wallet.h.zJ(7);
    li localli = new li();
    localli.ePD.ePE = true;
    com.tencent.mm.sdk.b.a.vgX.a(localli, Looper.getMainLooper());
    w.d("MicroMsg.SnsActivity", "SnsActivity req pause auto download logic");
    GMTrace.o(8382031331328L, 62451);
  }
  
  public final void H(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8383507726336L, 62462);
    this.qiR.H(paramInt, paramBoolean);
    GMTrace.o(8383507726336L, 62462);
  }
  
  public final void Hd(String paramString)
  {
    GMTrace.i(8382836637696L, 62457);
    GMTrace.o(8382836637696L, 62457);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    GMTrace.i(8381897113600L, 62450);
    this.pQl = paramString1;
    this.iAx = paramString2;
    this.lTY = paramString3;
    this.qiS = paramString4;
    this.pQm = paramBoolean1;
    this.pQn = paramBoolean2;
    this.pQo = paramInt;
    GMTrace.o(8381897113600L, 62450);
  }
  
  public final void aLu()
  {
    GMTrace.i(16044118769664L, 119538);
    this.qiR.bnc();
    GMTrace.o(16044118769664L, 119538);
  }
  
  public final void av(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8383776161792L, 62464);
    if ((this.qiR.getType() == 1) && (this.mqO != null) && (this.mqO.getAdapter() != null) && ((this.mqO.getAdapter() instanceof ax))) {
      ((ax)this.mqO.getAdapter()).notifyDataSetChanged();
    }
    GMTrace.o(8383776161792L, 62464);
  }
  
  public final void aw(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8382970855424L, 62458);
    GMTrace.o(8382970855424L, 62458);
  }
  
  public final void bhV()
  {
    GMTrace.i(8383105073152L, 62459);
    this.pzn.boR();
    GMTrace.o(8383105073152L, 62459);
  }
  
  public final void bjN()
  {
    GMTrace.i(8383641944064L, 62463);
    if (this.pzn != null) {
      this.pzn.boR();
    }
    GMTrace.o(8383641944064L, 62463);
  }
  
  public final ListView bnd()
  {
    GMTrace.i(8383910379520L, 62465);
    ListView localListView = this.qiR.bnd();
    GMTrace.o(8383910379520L, 62465);
    return localListView;
  }
  
  public final void hX(boolean paramBoolean)
  {
    GMTrace.i(8381762895872L, 62449);
    this.qiR.hX(paramBoolean);
    GMTrace.o(8381762895872L, 62449);
  }
  
  protected final void hY(boolean paramBoolean)
  {
    GMTrace.i(8383239290880L, 62460);
    w.d("MicroMsg.SnsActivity", "snsactivty onIsAll ");
    this.qiM.hY(paramBoolean);
    GMTrace.o(8383239290880L, 62460);
  }
  
  /* Error */
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: ldc2_w 411
    //   3: ldc_w 413
    //   6: invokestatic 87	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc -122
    //   11: new 144	java/lang/StringBuilder
    //   14: dup
    //   15: ldc_w 415
    //   18: invokespecial 149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: iload_1
    //   22: invokevirtual 418	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   25: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: invokestatic 420	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   31: iload_2
    //   32: iconst_m1
    //   33: if_icmpeq +50 -> 83
    //   36: iload_1
    //   37: iconst_5
    //   38: if_icmpeq +13 -> 51
    //   41: iload_1
    //   42: iconst_2
    //   43: if_icmpeq +8 -> 51
    //   46: iload_1
    //   47: iconst_4
    //   48: if_icmpne +25 -> 73
    //   51: new 116	com/tencent/mm/sdk/platformtools/ae
    //   54: dup
    //   55: invokestatic 122	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   58: invokespecial 125	com/tencent/mm/sdk/platformtools/ae:<init>	(Landroid/os/Looper;)V
    //   61: new 16	com/tencent/mm/plugin/sns/ui/bb$12
    //   64: dup
    //   65: aload_0
    //   66: invokespecial 421	com/tencent/mm/plugin/sns/ui/bb$12:<init>	(Lcom/tencent/mm/plugin/sns/ui/bb;)V
    //   69: invokevirtual 132	com/tencent/mm/sdk/platformtools/ae:post	(Ljava/lang/Runnable;)Z
    //   72: pop
    //   73: ldc2_w 411
    //   76: ldc_w 413
    //   79: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   82: return
    //   83: iload_1
    //   84: tableswitch	default:+80->164, 2:+504->588, 3:+80->164, 4:+1464->1548, 5:+377->461, 6:+1504->1588, 7:+1563->1647, 8:+1594->1678, 9:+1659->1743, 10:+1682->1766, 11:+80->164, 12:+1793->1877, 13:+1855->1939, 14:+641->725, 15:+1872->1956, 16:+80->164, 17:+98->182
    //   164: ldc -122
    //   166: ldc_w 423
    //   169: invokestatic 426	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: ldc2_w 411
    //   175: ldc_w 413
    //   178: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   181: return
    //   182: aload_3
    //   183: ldc_w 428
    //   186: invokevirtual 432	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   189: checkcast 434	com/tencent/mm/plugin/mmsight/SightCaptureResult
    //   192: astore 4
    //   194: aload 4
    //   196: ifnull +1770 -> 1966
    //   199: aload 4
    //   201: getfield 437	com/tencent/mm/plugin/mmsight/SightCaptureResult:mWF	Z
    //   204: ifeq +42 -> 246
    //   207: aload_0
    //   208: aload 4
    //   210: getfield 440	com/tencent/mm/plugin/mmsight/SightCaptureResult:mWN	Ljava/lang/String;
    //   213: putfield 151	com/tencent/mm/plugin/sns/ui/bb:filePath	Ljava/lang/String;
    //   216: aload_0
    //   217: getfield 151	com/tencent/mm/plugin/sns/ui/bb:filePath	Ljava/lang/String;
    //   220: invokestatic 444	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   223: ifne +1743 -> 1966
    //   226: aload_0
    //   227: iconst_1
    //   228: putfield 97	com/tencent/mm/plugin/sns/ui/bb:pps	Z
    //   231: aload_0
    //   232: aload_3
    //   233: invokespecial 446	com/tencent/mm/plugin/sns/ui/bb:V	(Landroid/content/Intent;)V
    //   236: ldc2_w 411
    //   239: ldc_w 413
    //   242: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   245: return
    //   246: ldc -122
    //   248: ldc_w 448
    //   251: iconst_2
    //   252: anewarray 4	java/lang/Object
    //   255: dup
    //   256: iconst_0
    //   257: aload 4
    //   259: getfield 451	com/tencent/mm/plugin/mmsight/SightCaptureResult:mWH	Ljava/lang/String;
    //   262: aastore
    //   263: dup
    //   264: iconst_1
    //   265: aload 4
    //   267: getfield 454	com/tencent/mm/plugin/mmsight/SightCaptureResult:mWI	Ljava/lang/String;
    //   270: aastore
    //   271: invokestatic 457	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   274: new 200	android/content/Intent
    //   277: dup
    //   278: invokespecial 458	android/content/Intent:<init>	()V
    //   281: astore_3
    //   282: aload_3
    //   283: ldc_w 460
    //   286: aload 4
    //   288: getfield 451	com/tencent/mm/plugin/mmsight/SightCaptureResult:mWH	Ljava/lang/String;
    //   291: invokevirtual 238	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   294: pop
    //   295: aload_3
    //   296: ldc_w 462
    //   299: aload 4
    //   301: getfield 454	com/tencent/mm/plugin/mmsight/SightCaptureResult:mWI	Ljava/lang/String;
    //   304: invokevirtual 238	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   307: pop
    //   308: aload 4
    //   310: getfield 465	com/tencent/mm/plugin/mmsight/SightCaptureResult:mWK	Ljava/lang/String;
    //   313: invokestatic 444	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   316: ifne +101 -> 417
    //   319: aload_3
    //   320: ldc_w 467
    //   323: aload 4
    //   325: getfield 465	com/tencent/mm/plugin/mmsight/SightCaptureResult:mWK	Ljava/lang/String;
    //   328: invokevirtual 238	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   331: pop
    //   332: aload_3
    //   333: ldc -45
    //   335: iconst_1
    //   336: invokevirtual 215	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   339: pop
    //   340: aload_3
    //   341: ldc -39
    //   343: invokestatic 222	com/tencent/mm/sdk/platformtools/bg:Pu	()J
    //   346: invokevirtual 225	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   349: pop
    //   350: aload_3
    //   351: ldc_w 469
    //   354: bipush 14
    //   356: invokevirtual 243	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   359: pop
    //   360: aload_3
    //   361: ldc -11
    //   363: iconst_0
    //   364: invokevirtual 215	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   367: pop
    //   368: aload 4
    //   370: getfield 473	com/tencent/mm/plugin/mmsight/SightCaptureResult:mWM	Lcom/tencent/mm/protocal/c/anf;
    //   373: invokevirtual 478	com/tencent/mm/protocal/c/anf:toByteArray	()[B
    //   376: astore 4
    //   378: aload 4
    //   380: ifnull +13 -> 393
    //   383: aload_3
    //   384: ldc_w 480
    //   387: aload 4
    //   389: invokevirtual 483	android/content/Intent:putExtra	(Ljava/lang/String;[B)Landroid/content/Intent;
    //   392: pop
    //   393: aload_0
    //   394: getfield 105	com/tencent/mm/plugin/sns/ui/bb:mActivity	Landroid/app/Activity;
    //   397: ldc_w 485
    //   400: ldc_w 487
    //   403: aload_3
    //   404: invokestatic 492	com/tencent/mm/bj/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   407: ldc2_w 411
    //   410: ldc_w 413
    //   413: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   416: return
    //   417: aload_3
    //   418: ldc_w 467
    //   421: aload 4
    //   423: getfield 451	com/tencent/mm/plugin/mmsight/SightCaptureResult:mWH	Ljava/lang/String;
    //   426: invokestatic 496	com/tencent/mm/a/g:bg	(Ljava/lang/String;)Ljava/lang/String;
    //   429: invokevirtual 238	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   432: pop
    //   433: goto -101 -> 332
    //   436: astore 4
    //   438: ldc -122
    //   440: ldc_w 498
    //   443: iconst_1
    //   444: anewarray 4	java/lang/Object
    //   447: dup
    //   448: iconst_0
    //   449: aload 4
    //   451: invokevirtual 501	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   454: aastore
    //   455: invokestatic 457	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   458: goto -65 -> 393
    //   461: aload_0
    //   462: aload_0
    //   463: getfield 105	com/tencent/mm/plugin/sns/ui/bb:mActivity	Landroid/app/Activity;
    //   466: invokevirtual 505	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   469: aload_3
    //   470: invokestatic 188	com/tencent/mm/plugin/sns/model/ae:getAccSnsTmpPath	()Ljava/lang/String;
    //   473: invokestatic 510	com/tencent/mm/pluginsdk/ui/tools/k:b	(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;
    //   476: putfield 151	com/tencent/mm/plugin/sns/ui/bb:filePath	Ljava/lang/String;
    //   479: ldc -122
    //   481: new 144	java/lang/StringBuilder
    //   484: dup
    //   485: ldc_w 512
    //   488: invokespecial 149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   491: aload_0
    //   492: getfield 151	com/tencent/mm/plugin/sns/ui/bb:filePath	Ljava/lang/String;
    //   495: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   501: invokestatic 142	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   504: aload_0
    //   505: getfield 151	com/tencent/mm/plugin/sns/ui/bb:filePath	Ljava/lang/String;
    //   508: ifnonnull +13 -> 521
    //   511: ldc2_w 411
    //   514: ldc_w 413
    //   517: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   520: return
    //   521: invokestatic 518	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   524: pop
    //   525: invokestatic 522	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   528: invokevirtual 528	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
    //   531: ldc_w 529
    //   534: aconst_null
    //   535: invokevirtual 535	com/tencent/mm/storage/t:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   538: checkcast 537	java/lang/Integer
    //   541: iconst_0
    //   542: invokestatic 540	com/tencent/mm/sdk/platformtools/bg:a	(Ljava/lang/Integer;I)I
    //   545: istore_1
    //   546: invokestatic 518	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   549: pop
    //   550: invokestatic 522	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   553: invokevirtual 528	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
    //   556: ldc_w 529
    //   559: iload_1
    //   560: iconst_1
    //   561: iadd
    //   562: invokestatic 544	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   565: invokevirtual 548	com/tencent/mm/storage/t:set	(ILjava/lang/Object;)V
    //   568: aload_0
    //   569: iconst_1
    //   570: putfield 97	com/tencent/mm/plugin/sns/ui/bb:pps	Z
    //   573: aload_0
    //   574: aload_3
    //   575: invokespecial 446	com/tencent/mm/plugin/sns/ui/bb:V	(Landroid/content/Intent;)V
    //   578: ldc2_w 411
    //   581: ldc_w 413
    //   584: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   587: return
    //   588: aload_3
    //   589: ifnonnull +13 -> 602
    //   592: ldc2_w 411
    //   595: ldc_w 413
    //   598: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   601: return
    //   602: invokestatic 518	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   605: pop
    //   606: invokestatic 522	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   609: invokevirtual 528	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
    //   612: ldc_w 549
    //   615: aconst_null
    //   616: invokevirtual 535	com/tencent/mm/storage/t:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   619: checkcast 537	java/lang/Integer
    //   622: iconst_0
    //   623: invokestatic 540	com/tencent/mm/sdk/platformtools/bg:a	(Ljava/lang/Integer;I)I
    //   626: istore_1
    //   627: invokestatic 518	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   630: pop
    //   631: invokestatic 522	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   634: invokevirtual 528	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
    //   637: ldc_w 549
    //   640: iload_1
    //   641: iconst_1
    //   642: iadd
    //   643: invokestatic 544	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   646: invokevirtual 548	com/tencent/mm/storage/t:set	(ILjava/lang/Object;)V
    //   649: new 200	android/content/Intent
    //   652: dup
    //   653: invokespecial 458	android/content/Intent:<init>	()V
    //   656: astore 4
    //   658: aload 4
    //   660: ldc_w 551
    //   663: iconst_4
    //   664: invokevirtual 243	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   667: pop
    //   668: aload 4
    //   670: ldc_w 553
    //   673: iconst_1
    //   674: invokevirtual 215	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   677: pop
    //   678: aload 4
    //   680: ldc_w 555
    //   683: iconst_1
    //   684: invokevirtual 215	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   687: pop
    //   688: getstatic 561	com/tencent/mm/plugin/sns/c/a:hnH	Lcom/tencent/mm/pluginsdk/m;
    //   691: aload_0
    //   692: getfield 105	com/tencent/mm/plugin/sns/ui/bb:mActivity	Landroid/app/Activity;
    //   695: aload_3
    //   696: aload 4
    //   698: invokestatic 188	com/tencent/mm/plugin/sns/model/ae:getAccSnsTmpPath	()Ljava/lang/String;
    //   701: iconst_4
    //   702: new 18	com/tencent/mm/plugin/sns/ui/bb$13
    //   705: dup
    //   706: aload_0
    //   707: invokespecial 562	com/tencent/mm/plugin/sns/ui/bb$13:<init>	(Lcom/tencent/mm/plugin/sns/ui/bb;)V
    //   710: invokeinterface 567 7 0
    //   715: ldc2_w 411
    //   718: ldc_w 413
    //   721: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   724: return
    //   725: new 116	com/tencent/mm/sdk/platformtools/ae
    //   728: dup
    //   729: invokestatic 122	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   732: invokespecial 125	com/tencent/mm/sdk/platformtools/ae:<init>	(Landroid/os/Looper;)V
    //   735: new 20	com/tencent/mm/plugin/sns/ui/bb$2
    //   738: dup
    //   739: aload_0
    //   740: invokespecial 568	com/tencent/mm/plugin/sns/ui/bb$2:<init>	(Lcom/tencent/mm/plugin/sns/ui/bb;)V
    //   743: invokevirtual 132	com/tencent/mm/sdk/platformtools/ae:post	(Ljava/lang/Runnable;)Z
    //   746: pop
    //   747: aload_3
    //   748: ldc_w 570
    //   751: invokevirtual 574	android/content/Intent:getStringArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   754: astore 4
    //   756: aload 4
    //   758: ifnull +11 -> 769
    //   761: aload 4
    //   763: invokevirtual 579	java/util/ArrayList:size	()I
    //   766: ifgt +16 -> 782
    //   769: aload_3
    //   770: ldc_w 581
    //   773: invokevirtual 584	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   776: invokestatic 444	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   779: ifne +440 -> 1219
    //   782: aload 4
    //   784: ifnull +127 -> 911
    //   787: aload 4
    //   789: invokevirtual 579	java/util/ArrayList:size	()I
    //   792: ifle +119 -> 911
    //   795: aload 4
    //   797: iconst_0
    //   798: invokevirtual 587	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   801: checkcast 173	java/lang/String
    //   804: astore 4
    //   806: aload_3
    //   807: ldc_w 589
    //   810: invokevirtual 584	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   813: astore 5
    //   815: aload 5
    //   817: invokestatic 444	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   820: ifne +14 -> 834
    //   823: aload 5
    //   825: astore_3
    //   826: aload 5
    //   828: invokestatic 594	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   831: ifne +194 -> 1025
    //   834: new 144	java/lang/StringBuilder
    //   837: dup
    //   838: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   841: invokestatic 188	com/tencent/mm/plugin/sns/model/ae:getAccSnsTmpPath	()Ljava/lang/String;
    //   844: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   847: aload 4
    //   849: invokestatic 496	com/tencent/mm/a/g:bg	(Ljava/lang/String;)Ljava/lang/String;
    //   852: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   855: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   858: astore_3
    //   859: new 596	android/media/MediaMetadataRetriever
    //   862: dup
    //   863: invokespecial 597	android/media/MediaMetadataRetriever:<init>	()V
    //   866: astore 5
    //   868: aload 5
    //   870: aload 4
    //   872: invokevirtual 600	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   875: aload 5
    //   877: lconst_0
    //   878: invokevirtual 604	android/media/MediaMetadataRetriever:getFrameAtTime	(J)Landroid/graphics/Bitmap;
    //   881: astore 6
    //   883: aload 6
    //   885: ifnonnull +49 -> 934
    //   888: ldc -122
    //   890: ldc_w 606
    //   893: invokestatic 426	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   896: aload 5
    //   898: invokevirtual 609	android/media/MediaMetadataRetriever:release	()V
    //   901: ldc2_w 411
    //   904: ldc_w 413
    //   907: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   910: return
    //   911: aload_3
    //   912: ldc_w 581
    //   915: invokevirtual 584	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   918: astore 4
    //   920: goto -114 -> 806
    //   923: astore_3
    //   924: ldc2_w 411
    //   927: ldc_w 413
    //   930: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   933: return
    //   934: ldc -122
    //   936: ldc_w 611
    //   939: iconst_2
    //   940: anewarray 4	java/lang/Object
    //   943: dup
    //   944: iconst_0
    //   945: aload 6
    //   947: invokevirtual 616	android/graphics/Bitmap:getWidth	()I
    //   950: invokestatic 544	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   953: aastore
    //   954: dup
    //   955: iconst_1
    //   956: aload 6
    //   958: invokevirtual 619	android/graphics/Bitmap:getHeight	()I
    //   961: invokestatic 544	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   964: aastore
    //   965: invokestatic 457	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   968: aload 6
    //   970: bipush 80
    //   972: getstatic 625	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   975: aload_3
    //   976: iconst_1
    //   977: invokestatic 630	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   980: aload_3
    //   981: invokestatic 634	com/tencent/mm/sdk/platformtools/d:RB	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   984: astore 6
    //   986: ldc -122
    //   988: ldc_w 636
    //   991: iconst_2
    //   992: anewarray 4	java/lang/Object
    //   995: dup
    //   996: iconst_0
    //   997: aload 6
    //   999: getfield 641	android/graphics/BitmapFactory$Options:outWidth	I
    //   1002: invokestatic 544	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1005: aastore
    //   1006: dup
    //   1007: iconst_1
    //   1008: aload 6
    //   1010: getfield 644	android/graphics/BitmapFactory$Options:outHeight	I
    //   1013: invokestatic 544	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1016: aastore
    //   1017: invokestatic 457	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1020: aload 5
    //   1022: invokevirtual 609	android/media/MediaMetadataRetriever:release	()V
    //   1025: ldc -122
    //   1027: ldc_w 646
    //   1030: iconst_4
    //   1031: anewarray 4	java/lang/Object
    //   1034: dup
    //   1035: iconst_0
    //   1036: aload 4
    //   1038: aastore
    //   1039: dup
    //   1040: iconst_1
    //   1041: aload_3
    //   1042: aastore
    //   1043: dup
    //   1044: iconst_2
    //   1045: aload 4
    //   1047: invokestatic 650	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   1050: invokestatic 655	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1053: aastore
    //   1054: dup
    //   1055: iconst_3
    //   1056: aload_3
    //   1057: invokestatic 650	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   1060: invokestatic 655	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1063: aastore
    //   1064: invokestatic 457	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1067: new 200	android/content/Intent
    //   1070: dup
    //   1071: invokespecial 458	android/content/Intent:<init>	()V
    //   1074: astore 5
    //   1076: aload 5
    //   1078: ldc_w 460
    //   1081: aload 4
    //   1083: invokevirtual 238	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1086: pop
    //   1087: aload 5
    //   1089: ldc_w 462
    //   1092: aload_3
    //   1093: invokevirtual 238	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1096: pop
    //   1097: aload 5
    //   1099: ldc_w 467
    //   1102: aload 4
    //   1104: invokestatic 496	com/tencent/mm/a/g:bg	(Ljava/lang/String;)Ljava/lang/String;
    //   1107: invokevirtual 238	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1110: pop
    //   1111: aload 5
    //   1113: ldc -45
    //   1115: iconst_1
    //   1116: invokevirtual 215	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1119: pop
    //   1120: aload 5
    //   1122: ldc -39
    //   1124: invokestatic 222	com/tencent/mm/sdk/platformtools/bg:Pu	()J
    //   1127: invokevirtual 225	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   1130: pop
    //   1131: aload 5
    //   1133: ldc_w 469
    //   1136: bipush 14
    //   1138: invokevirtual 243	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1141: pop
    //   1142: aload 5
    //   1144: ldc -11
    //   1146: iconst_0
    //   1147: invokevirtual 215	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1150: pop
    //   1151: aload_0
    //   1152: getfield 105	com/tencent/mm/plugin/sns/ui/bb:mActivity	Landroid/app/Activity;
    //   1155: ldc_w 485
    //   1158: ldc_w 487
    //   1161: aload 5
    //   1163: invokestatic 492	com/tencent/mm/bj/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   1166: ldc2_w 411
    //   1169: ldc_w 413
    //   1172: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1175: return
    //   1176: astore 6
    //   1178: ldc -122
    //   1180: ldc_w 657
    //   1183: iconst_1
    //   1184: anewarray 4	java/lang/Object
    //   1187: dup
    //   1188: iconst_0
    //   1189: aload 6
    //   1191: invokevirtual 501	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1194: aastore
    //   1195: invokestatic 659	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1198: aload 5
    //   1200: invokevirtual 609	android/media/MediaMetadataRetriever:release	()V
    //   1203: goto -178 -> 1025
    //   1206: astore 5
    //   1208: goto -183 -> 1025
    //   1211: astore_3
    //   1212: aload 5
    //   1214: invokevirtual 609	android/media/MediaMetadataRetriever:release	()V
    //   1217: aload_3
    //   1218: athrow
    //   1219: aload_3
    //   1220: ldc_w 661
    //   1223: invokevirtual 574	android/content/Intent:getStringArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   1226: astore 4
    //   1228: aload 4
    //   1230: ifnull +11 -> 1241
    //   1233: aload 4
    //   1235: invokevirtual 579	java/util/ArrayList:size	()I
    //   1238: ifne +21 -> 1259
    //   1241: ldc -122
    //   1243: ldc_w 663
    //   1246: invokestatic 420	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1249: ldc2_w 411
    //   1252: ldc_w 413
    //   1255: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1258: return
    //   1259: new 576	java/util/ArrayList
    //   1262: dup
    //   1263: invokespecial 664	java/util/ArrayList:<init>	()V
    //   1266: astore 5
    //   1268: aload 4
    //   1270: invokevirtual 668	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   1273: astore 6
    //   1275: aload 6
    //   1277: invokeinterface 674 1 0
    //   1282: ifeq +76 -> 1358
    //   1285: aload 6
    //   1287: invokeinterface 678 1 0
    //   1292: checkcast 173	java/lang/String
    //   1295: astore 7
    //   1297: aload 7
    //   1299: invokestatic 684	com/tencent/mm/compatible/util/Exif:fromFile	(Ljava/lang/String;)Lcom/tencent/mm/compatible/util/Exif;
    //   1302: invokevirtual 688	com/tencent/mm/compatible/util/Exif:getLocation	()Lcom/tencent/mm/compatible/util/Exif$a;
    //   1305: astore 8
    //   1307: aload 8
    //   1309: ifnull -34 -> 1275
    //   1312: aload 5
    //   1314: ldc_w 690
    //   1317: iconst_3
    //   1318: anewarray 4	java/lang/Object
    //   1321: dup
    //   1322: iconst_0
    //   1323: aload 7
    //   1325: aastore
    //   1326: dup
    //   1327: iconst_1
    //   1328: aload 8
    //   1330: getfield 696	com/tencent/mm/compatible/util/Exif$a:latitude	D
    //   1333: invokestatic 701	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   1336: aastore
    //   1337: dup
    //   1338: iconst_2
    //   1339: aload 8
    //   1341: getfield 704	com/tencent/mm/compatible/util/Exif$a:longitude	D
    //   1344: invokestatic 701	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   1347: aastore
    //   1348: invokestatic 708	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1351: invokevirtual 712	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1354: pop
    //   1355: goto -80 -> 1275
    //   1358: aload_0
    //   1359: aload_3
    //   1360: ldc_w 714
    //   1363: iconst_0
    //   1364: invokevirtual 718	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   1367: putfield 97	com/tencent/mm/plugin/sns/ui/bb:pps	Z
    //   1370: new 200	android/content/Intent
    //   1373: dup
    //   1374: aload_0
    //   1375: getfield 105	com/tencent/mm/plugin/sns/ui/bb:mActivity	Landroid/app/Activity;
    //   1378: ldc -50
    //   1380: invokespecial 209	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   1383: astore 6
    //   1385: aload 6
    //   1387: ldc -45
    //   1389: iconst_1
    //   1390: invokevirtual 215	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1393: pop
    //   1394: aload 6
    //   1396: ldc -39
    //   1398: invokestatic 222	com/tencent/mm/sdk/platformtools/bg:Pu	()J
    //   1401: invokevirtual 225	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   1404: pop
    //   1405: aload_0
    //   1406: getfield 103	com/tencent/mm/plugin/sns/ui/bb:qiT	Lcom/tencent/mm/modelsns/b;
    //   1409: ifnull +19 -> 1428
    //   1412: aload_0
    //   1413: getfield 103	com/tencent/mm/plugin/sns/ui/bb:qiT	Lcom/tencent/mm/modelsns/b;
    //   1416: aload 6
    //   1418: ldc -29
    //   1420: invokevirtual 233	com/tencent/mm/modelsns/b:b	(Landroid/content/Intent;Ljava/lang/String;)V
    //   1423: aload_0
    //   1424: aconst_null
    //   1425: putfield 103	com/tencent/mm/plugin/sns/ui/bb:qiT	Lcom/tencent/mm/modelsns/b;
    //   1428: aload_0
    //   1429: getfield 247	com/tencent/mm/plugin/sns/ui/bb:pQn	Z
    //   1432: ifeq +13 -> 1445
    //   1435: aload 6
    //   1437: ldc -7
    //   1439: bipush 11
    //   1441: invokevirtual 243	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1444: pop
    //   1445: aload_3
    //   1446: ldc -58
    //   1448: iconst_0
    //   1449: invokevirtual 204	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1452: istore_1
    //   1453: aload 6
    //   1455: ldc_w 720
    //   1458: aload 4
    //   1460: invokevirtual 723	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    //   1463: pop
    //   1464: aload 6
    //   1466: ldc -16
    //   1468: iload_1
    //   1469: invokevirtual 243	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1472: pop
    //   1473: aload_0
    //   1474: getfield 97	com/tencent/mm/plugin/sns/ui/bb:pps	Z
    //   1477: ifeq +12 -> 1489
    //   1480: aload 6
    //   1482: ldc -11
    //   1484: iconst_1
    //   1485: invokevirtual 215	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1488: pop
    //   1489: aload 6
    //   1491: ldc_w 725
    //   1494: aload 5
    //   1496: invokevirtual 729	android/content/Intent:putStringArrayListExtra	(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
    //   1499: pop
    //   1500: ldc -122
    //   1502: ldc_w 731
    //   1505: iconst_1
    //   1506: anewarray 4	java/lang/Object
    //   1509: dup
    //   1510: iconst_0
    //   1511: aload 6
    //   1513: ldc_w 469
    //   1516: iconst_m1
    //   1517: invokevirtual 204	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1520: invokestatic 544	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1523: aastore
    //   1524: invokestatic 733	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1527: aload_0
    //   1528: getfield 105	com/tencent/mm/plugin/sns/ui/bb:mActivity	Landroid/app/Activity;
    //   1531: aload 6
    //   1533: bipush 6
    //   1535: invokevirtual 255	android/app/Activity:startActivityForResult	(Landroid/content/Intent;I)V
    //   1538: ldc2_w 411
    //   1541: ldc_w 413
    //   1544: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1547: return
    //   1548: aload_3
    //   1549: ifnonnull +13 -> 1562
    //   1552: ldc2_w 411
    //   1555: ldc_w 413
    //   1558: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1561: return
    //   1562: aload_0
    //   1563: aload_3
    //   1564: ldc_w 735
    //   1567: invokevirtual 584	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   1570: putfield 151	com/tencent/mm/plugin/sns/ui/bb:filePath	Ljava/lang/String;
    //   1573: aload_0
    //   1574: aload_3
    //   1575: invokespecial 446	com/tencent/mm/plugin/sns/ui/bb:V	(Landroid/content/Intent;)V
    //   1578: ldc2_w 411
    //   1581: ldc_w 413
    //   1584: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1587: return
    //   1588: ldc -122
    //   1590: ldc_w 737
    //   1593: invokestatic 142	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1596: aload_3
    //   1597: ifnonnull +13 -> 1610
    //   1600: ldc2_w 411
    //   1603: ldc_w 413
    //   1606: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1609: return
    //   1610: aload_3
    //   1611: ldc_w 739
    //   1614: iconst_m1
    //   1615: invokevirtual 204	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1618: istore_1
    //   1619: aload_0
    //   1620: getfield 310	com/tencent/mm/plugin/sns/ui/bb:qiR	Lcom/tencent/mm/plugin/sns/ui/bb$a;
    //   1623: iload_1
    //   1624: aconst_null
    //   1625: aconst_null
    //   1626: invokeinterface 742 4 0
    //   1631: invokestatic 746	com/tencent/mm/plugin/sns/model/ae:biZ	()Lcom/tencent/mm/plugin/sns/model/av;
    //   1634: invokevirtual 751	com/tencent/mm/plugin/sns/model/av:bhR	()V
    //   1637: ldc2_w 411
    //   1640: ldc_w 413
    //   1643: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1646: return
    //   1647: ldc -122
    //   1649: ldc_w 753
    //   1652: invokestatic 142	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1655: aload_0
    //   1656: getfield 371	com/tencent/mm/plugin/sns/ui/bb:pzn	Lcom/tencent/mm/plugin/sns/ui/SnsHeader;
    //   1659: invokevirtual 376	com/tencent/mm/plugin/sns/ui/SnsHeader:boR	()V
    //   1662: invokestatic 746	com/tencent/mm/plugin/sns/model/ae:biZ	()Lcom/tencent/mm/plugin/sns/model/av;
    //   1665: invokevirtual 751	com/tencent/mm/plugin/sns/model/av:bhR	()V
    //   1668: ldc2_w 411
    //   1671: ldc_w 413
    //   1674: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1677: return
    //   1678: aload_3
    //   1679: ifnonnull +13 -> 1692
    //   1682: ldc2_w 411
    //   1685: ldc_w 413
    //   1688: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1691: return
    //   1692: ldc -122
    //   1694: ldc_w 755
    //   1697: invokestatic 142	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1700: aload_3
    //   1701: ldc_w 757
    //   1704: invokevirtual 432	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   1707: checkcast 759	com/tencent/mm/plugin/sns/data/SnsCmdList
    //   1710: astore_3
    //   1711: aload_3
    //   1712: ifnull +254 -> 1966
    //   1715: aload_0
    //   1716: getfield 310	com/tencent/mm/plugin/sns/ui/bb:qiR	Lcom/tencent/mm/plugin/sns/ui/bb$a;
    //   1719: iconst_m1
    //   1720: aload_3
    //   1721: getfield 763	com/tencent/mm/plugin/sns/data/SnsCmdList:ppe	Ljava/util/List;
    //   1724: aload_3
    //   1725: getfield 766	com/tencent/mm/plugin/sns/data/SnsCmdList:ppf	Ljava/util/List;
    //   1728: invokeinterface 742 4 0
    //   1733: ldc2_w 411
    //   1736: ldc_w 413
    //   1739: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1742: return
    //   1743: invokestatic 746	com/tencent/mm/plugin/sns/model/ae:biZ	()Lcom/tencent/mm/plugin/sns/model/av;
    //   1746: invokevirtual 751	com/tencent/mm/plugin/sns/model/av:bhR	()V
    //   1749: aload_0
    //   1750: getfield 350	com/tencent/mm/plugin/sns/ui/bb:mqO	Landroid/widget/ListView;
    //   1753: invokestatic 771	com/tencent/mm/sdk/platformtools/BackwardSupportUtil$c:a	(Landroid/widget/ListView;)V
    //   1756: ldc2_w 411
    //   1759: ldc_w 413
    //   1762: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1765: return
    //   1766: aload_3
    //   1767: ifnonnull +13 -> 1780
    //   1770: ldc2_w 411
    //   1773: ldc_w 413
    //   1776: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1779: return
    //   1780: iload_2
    //   1781: iconst_m1
    //   1782: if_icmpne +184 -> 1966
    //   1785: aload_3
    //   1786: invokevirtual 775	android/content/Intent:getData	()Landroid/net/Uri;
    //   1789: astore_3
    //   1790: aload_0
    //   1791: getfield 105	com/tencent/mm/plugin/sns/ui/bb:mActivity	Landroid/app/Activity;
    //   1794: aload_3
    //   1795: aconst_null
    //   1796: aconst_null
    //   1797: aconst_null
    //   1798: aconst_null
    //   1799: invokevirtual 779	android/app/Activity:managedQuery	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   1802: astore_3
    //   1803: aload_3
    //   1804: invokeinterface 784 1 0
    //   1809: ifeq +58 -> 1867
    //   1812: aload_3
    //   1813: aload_3
    //   1814: ldc_w 786
    //   1817: invokeinterface 790 2 0
    //   1822: invokeinterface 794 2 0
    //   1827: astore_3
    //   1828: new 200	android/content/Intent
    //   1831: dup
    //   1832: ldc_w 796
    //   1835: new 144	java/lang/StringBuilder
    //   1838: dup
    //   1839: ldc_w 798
    //   1842: invokespecial 149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1845: aload_3
    //   1846: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1849: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1852: invokestatic 804	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   1855: invokespecial 807	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   1858: astore_3
    //   1859: aload_0
    //   1860: getfield 105	com/tencent/mm/plugin/sns/ui/bb:mActivity	Landroid/app/Activity;
    //   1863: aload_3
    //   1864: invokevirtual 810	android/app/Activity:startActivity	(Landroid/content/Intent;)V
    //   1867: ldc2_w 411
    //   1870: ldc_w 413
    //   1873: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1876: return
    //   1877: aload_3
    //   1878: ldc_w 812
    //   1881: iconst_m1
    //   1882: invokevirtual 204	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1885: istore_1
    //   1886: iload_1
    //   1887: ifle +79 -> 1966
    //   1890: ldc -122
    //   1892: ldc_w 814
    //   1895: invokestatic 142	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1898: new 759	com/tencent/mm/plugin/sns/data/SnsCmdList
    //   1901: dup
    //   1902: invokespecial 815	com/tencent/mm/plugin/sns/data/SnsCmdList:<init>	()V
    //   1905: astore_3
    //   1906: aload_3
    //   1907: iload_1
    //   1908: invokevirtual 818	com/tencent/mm/plugin/sns/data/SnsCmdList:uf	(I)V
    //   1911: aload_0
    //   1912: getfield 310	com/tencent/mm/plugin/sns/ui/bb:qiR	Lcom/tencent/mm/plugin/sns/ui/bb$a;
    //   1915: iconst_m1
    //   1916: aload_3
    //   1917: getfield 763	com/tencent/mm/plugin/sns/data/SnsCmdList:ppe	Ljava/util/List;
    //   1920: aload_3
    //   1921: getfield 766	com/tencent/mm/plugin/sns/data/SnsCmdList:ppf	Ljava/util/List;
    //   1924: invokeinterface 742 4 0
    //   1929: ldc2_w 411
    //   1932: ldc_w 413
    //   1935: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1938: return
    //   1939: invokestatic 822	com/tencent/mm/plugin/sns/model/ae:bji	()Lcom/tencent/mm/plugin/sns/storage/j;
    //   1942: invokevirtual 827	com/tencent/mm/plugin/sns/storage/j:aki	()Z
    //   1945: pop
    //   1946: ldc2_w 411
    //   1949: ldc_w 413
    //   1952: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1955: return
    //   1956: ldc2_w 411
    //   1959: ldc_w 413
    //   1962: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1965: return
    //   1966: ldc2_w 411
    //   1969: ldc_w 413
    //   1972: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1975: return
    //   1976: astore 5
    //   1978: goto -953 -> 1025
    //   1981: astore 4
    //   1983: goto -766 -> 1217
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1986	0	this	bb
    //   0	1986	1	paramInt1	int
    //   0	1986	2	paramInt2	int
    //   0	1986	3	paramIntent	Intent
    //   192	230	4	localObject1	Object
    //   436	14	4	localException1	Exception
    //   656	803	4	localObject2	Object
    //   1981	1	4	localException2	Exception
    //   813	386	5	localObject3	Object
    //   1206	7	5	localException3	Exception
    //   1266	229	5	localArrayList	ArrayList
    //   1976	1	5	localException4	Exception
    //   881	128	6	localObject4	Object
    //   1176	14	6	localException5	Exception
    //   1273	259	6	localObject5	Object
    //   1295	29	7	str	String
    //   1305	35	8	locala	com.tencent.mm.compatible.util.Exif.a
    // Exception table:
    //   from	to	target	type
    //   368	378	436	java/lang/Exception
    //   383	393	436	java/lang/Exception
    //   896	901	923	java/lang/Exception
    //   868	883	1176	java/lang/Exception
    //   888	896	1176	java/lang/Exception
    //   934	1020	1176	java/lang/Exception
    //   1198	1203	1206	java/lang/Exception
    //   868	883	1211	finally
    //   888	896	1211	finally
    //   934	1020	1211	finally
    //   1178	1198	1211	finally
    //   1020	1025	1976	java/lang/Exception
    //   1212	1217	1981	java/lang/Exception
  }
  
  public final void onCreate()
  {
    GMTrace.i(8381628678144L, 62448);
    this.pmG = this.mActivity.getWindowManager().getDefaultDisplay().getHeight();
    com.tencent.mm.plugin.sns.model.ae.bja().start();
    this.mqO = this.qiR.bnd();
    this.mqO.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8400553377792L, 62589);
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        bb.this.mActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
        com.tencent.mm.plugin.sns.model.ae.biS();
        com.tencent.mm.plugin.sns.storage.r.dc(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
        GMTrace.o(8400553377792L, 62589);
      }
    });
    Object localObject = new StringBuilder("list is null ? ");
    boolean bool;
    label219:
    SnsHeader localSnsHeader;
    label385:
    String str2;
    String str3;
    String str1;
    if (this.mqO != null)
    {
      bool = true;
      w.i("MicroMsg.SnsActivity", bool);
      this.mqO.setScrollingCacheEnabled(false);
      this.pzn = new SnsHeader(this.mActivity);
      this.pzn.qaF = new SnsHeader.a()
      {
        public final boolean boT()
        {
          GMTrace.i(8592350511104L, 64018);
          bb.this.qiR.bnh();
          GMTrace.o(8592350511104L, 64018);
          return false;
        }
        
        public final boolean dY(long paramAnonymousLong)
        {
          GMTrace.i(8592216293376L, 64017);
          if ((bb.this.pQn) || (bb.this.qiR.getType() == 1))
          {
            bb.this.vB(2);
            GMTrace.o(8592216293376L, 64017);
            return false;
          }
          Object localObject1 = new m();
          ((m)localObject1).field_snsId = paramAnonymousLong;
          ((m)localObject1).field_userName = bb.this.iAx;
          Object localObject2 = com.tencent.mm.modelsns.e.LU();
          ((biz)localObject2).jhi = bb.this.iAx;
          ((m)localObject1).c((biz)localObject2);
          localObject2 = ai.Hu(bb.this.iAx);
          w.d("MicroMsg.SnsActivity", "friend like %s", new Object[] { bb.this.iAx });
          if (localObject2 == null) {
            al.a.a((m)localObject1, 1, "");
          }
          for (;;)
          {
            localObject1 = com.tencent.mm.plugin.sns.model.ae.bjh().Iw(bb.this.iAx);
            ((com.tencent.mm.plugin.sns.storage.k)localObject1).field_local_flag |= 0x2;
            com.tencent.mm.plugin.sns.model.ae.bjh().c((com.tencent.mm.plugin.sns.storage.k)localObject1);
            localObject1 = bb.this;
            localObject2 = LayoutInflater.from(((bb)localObject1).mActivity).inflate(i.g.pdF, (ViewGroup)((bb)localObject1).mActivity.findViewById(i.f.pdF));
            u localu = new u(((bb)localObject1).mActivity);
            localu.setGravity(48, 0, BackwardSupportUtil.b.a(((bb)localObject1).mActivity, 200.0F));
            localu.duration = 1000L;
            localu.setView((View)localObject2);
            localu.cancel();
            localu.euU.stopTimer();
            localu.jIt = ((int)(localu.duration / 70L) + 1);
            localu.euU.z(70L, 70L);
            break;
            if (((m)localObject2).blX()) {
              al.a.a((m)localObject1, 1, "");
            } else {
              al.a.a((m)localObject1, 5, "");
            }
          }
        }
      };
      this.qiM = new LoadingMoreView(this.mActivity);
      this.mqO.addHeaderView(this.pzn);
      this.mqO.addFooterView(this.qiM);
      this.mqO.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(8684692307968L, 64706);
          bb.this.qiQ = (paramAnonymousInt1 + paramAnonymousInt2 - 1);
          if ((bb.this.mqO.getLastVisiblePosition() == bb.this.mqO.getCount() - 1) && (bb.this.mqO.getCount() != bb.this.qiN))
          {
            w.d("MicroMsg.SnsActivity", "now refresh count: %s", new Object[] { Integer.valueOf(bb.this.mqO.getCount()) });
            bb.this.qiN = bb.this.mqO.getCount();
            bb.this.aLu();
          }
          GMTrace.o(8684692307968L, 64706);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(8684558090240L, 64705);
          bb.this.qiR.bni();
          if (paramAnonymousInt == 0)
          {
            paramAnonymousAbsListView = new rm();
            paramAnonymousAbsListView.eWo.type = 5;
            paramAnonymousAbsListView.eWo.eWp = bb.this.mqO.getFirstVisiblePosition();
            paramAnonymousAbsListView.eWo.eWq = bb.this.mqO.getLastVisiblePosition();
            paramAnonymousAbsListView.eWo.eWr = bb.this.mqO.getHeaderViewsCount();
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousAbsListView);
            if (((bb.this.mActivity instanceof En_424b8e16)) && (((En_424b8e16)bb.this.mActivity).pQi != null)) {
              ((En_424b8e16)bb.this.mActivity).pQi.bhG();
            }
          }
          if (paramAnonymousInt == 2)
          {
            d.bVG().cP(bb.class.getName() + bb.this.qiR.getType() + ".Listview", 4);
            bb.this.hX(true);
            GMTrace.o(8684558090240L, 64705);
            return;
          }
          bb.this.hX(false);
          GMTrace.o(8684558090240L, 64705);
        }
      });
      this.mTU = this.qiR.bne();
      localObject = new StringBuilder("pullDownView is null ? ");
      if (this.mTU == null) {
        break label534;
      }
      bool = true;
      w.i("MicroMsg.SnsActivity", bool);
      this.mTU.wdN = new MMPullDownView.g()
      {
        public final boolean apa()
        {
          GMTrace.i(8662949036032L, 64544);
          bb.this.qiR.bng();
          GMTrace.o(8662949036032L, 64544);
          return true;
        }
      };
      this.mTU.lG(false);
      this.mTU.lD(false);
      this.mTU.wdZ = new MMPullDownView.c()
      {
        public final boolean aoZ()
        {
          GMTrace.i(8497190141952L, 63309);
          View localView = bb.this.mqO.getChildAt(bb.this.mqO.getChildCount() - 1);
          if ((localView != null) && (localView.getBottom() <= bb.this.mqO.getHeight()) && (bb.this.mqO.getLastVisiblePosition() == bb.this.mqO.getAdapter().getCount() - 1))
          {
            GMTrace.o(8497190141952L, 63309);
            return true;
          }
          GMTrace.o(8497190141952L, 63309);
          return false;
        }
      };
      this.mTU.wea = new MMPullDownView.d()
      {
        public final boolean aoY()
        {
          GMTrace.i(8725628715008L, 65011);
          View localView = bb.this.mqO.getChildAt(bb.this.mqO.getFirstVisiblePosition());
          if ((localView != null) && (localView.getTop() == 0))
          {
            GMTrace.o(8725628715008L, 65011);
            return true;
          }
          GMTrace.o(8725628715008L, 65011);
          return false;
        }
      };
      this.mTU.lE(false);
      this.mTU.wdO = new MMPullDownView.e()
      {
        public final boolean aoX()
        {
          GMTrace.i(8401090248704L, 62593);
          w.e("MicroMsg.SnsActivity", "bottomLoad  isAll:" + bb.this.qiP);
          if (!bb.this.qiP) {
            bb.this.aLu();
          }
          GMTrace.o(8401090248704L, 62593);
          return true;
        }
      };
      this.mTU.weq = true;
      localObject = this.mTU;
      ((MMPullDownView)localObject).bgColor = Color.parseColor("#f4f4f4");
      ((MMPullDownView)localObject).wes = ((MMPullDownView)localObject).bgColor;
      this.title = this.mActivity.getIntent().getStringExtra("sns_title");
      localSnsHeader = this.pzn;
      if (!bg.nm(this.iAx)) {
        break label539;
      }
      localObject = this.pQl;
      str2 = this.pQl;
      str3 = this.lTY;
      str1 = this.qiS;
      if ((localObject != null) && (str2 != null)) {
        break label547;
      }
      w.e("MicroMsg.SnsHeader", "userName or selfName is null ");
      localObject = this.pzn;
      int i = this.qiR.getType();
      ((SnsHeader)localObject).type = i;
      if ((i == 1) && (((SnsHeader)localObject).qaE.pOz != null)) {
        ((SnsHeader)localObject).qaE.pOz.setVisibility(8);
      }
      this.pzn.boR();
      if (Build.VERSION.SDK_INT >= 11) {
        break label776;
      }
      w.d("MicroMsg.SnsActivity", "sdk not support dragdrop event");
    }
    for (;;)
    {
      com.tencent.mm.plugin.sns.model.ae.biZ().fMZ.add(this);
      av.pqL += 1;
      com.tencent.mm.plugin.sns.model.ae.biY().a(this);
      GMTrace.o(8381628678144L, 62448);
      return;
      bool = false;
      break;
      label534:
      bool = false;
      break label219;
      label539:
      localObject = this.iAx;
      break label385;
      label547:
      localSnsHeader.userName = ((String)localObject).trim();
      localSnsHeader.fJS = str2.trim();
      localSnsHeader.eHl = str2.equals(localObject);
      w.d("MicroMsg.SnsHeader", "userNamelen " + ((String)localObject).length() + "  " + (String)localObject);
      localSnsHeader.qaE.jgK.setText((CharSequence)localObject);
      if ((localSnsHeader.qaE == null) || (localSnsHeader.qaE.hqg == null)) {}
      for (;;)
      {
        if ((localObject != null) && (((String)localObject).length() > 0))
        {
          localObject = com.tencent.mm.plugin.sns.data.i.z(str3);
          localSnsHeader.qaE.jgK.setText(com.tencent.mm.pluginsdk.ui.d.h.a(localSnsHeader.context, (CharSequence)localObject));
          localSnsHeader.qaE.pOz.setText(com.tencent.mm.pluginsdk.ui.d.h.b(localSnsHeader.context, str1, localSnsHeader.qaE.pOz.getTextSize()));
        }
        localSnsHeader.qaE.hqg.setContentDescription(localSnsHeader.context.getString(i.j.piF, new Object[] { localSnsHeader.qaE.jgK.getText() }));
        break;
        a.b.b(localSnsHeader.qaE.hqg, localSnsHeader.userName, true);
      }
      label776:
      new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8338813222912L, 62129);
          View.OnDragListener local1 = new View.OnDragListener()
          {
            public final boolean onDrag(View paramAnonymous2View, DragEvent paramAnonymous2DragEvent)
            {
              int i = 0;
              boolean bool2 = true;
              GMTrace.i(8325794103296L, 62032);
              int j = paramAnonymous2DragEvent.getAction();
              boolean bool1;
              switch (j)
              {
              default: 
                w.e("MicroMsg.SnsActivity", "Unknown action type received by OnDragListener.");
                bool1 = false;
              }
              for (;;)
              {
                GMTrace.o(8325794103296L, 62032);
                return bool1;
                w.i("MicroMsg.SnsActivity", "ACTION: [%s]", new Object[] { Integer.valueOf(j) });
                bool1 = bool2;
                continue;
                w.i("MicroMsg.SnsActivity", "ACTION_DROP");
                paramAnonymous2DragEvent = paramAnonymous2DragEvent.getClipData();
                bool1 = bool2;
                if (paramAnonymous2DragEvent != null)
                {
                  j = paramAnonymous2DragEvent.getItemCount();
                  paramAnonymous2View = new ArrayList();
                  if (i < j)
                  {
                    Object localObject = paramAnonymous2DragEvent.getItemAt(i);
                    if (localObject == null) {
                      w.e("MicroMsg.SnsActivity", "item == null");
                    }
                    for (;;)
                    {
                      i += 1;
                      break;
                      if (((ClipData.Item)localObject).getIntent() != null)
                      {
                        bb.this.mActivity.startActivity(((ClipData.Item)localObject).getIntent());
                      }
                      else if (((ClipData.Item)localObject).getUri() != null)
                      {
                        localObject = new com.tencent.mm.pluginsdk.ui.tools.l(bb.this.mActivity, ((ClipData.Item)localObject).getUri());
                        if ((((com.tencent.mm.pluginsdk.ui.tools.l)localObject).fileType != 0) && (((com.tencent.mm.pluginsdk.ui.tools.l)localObject).filePath != null)) {}
                        switch (((com.tencent.mm.pluginsdk.ui.tools.l)localObject).fileType)
                        {
                        default: 
                          break;
                        case 3: 
                          paramAnonymous2View.add(((com.tencent.mm.pluginsdk.ui.tools.l)localObject).filePath);
                          continue;
                          w.e("MicroMsg.SnsActivity", "get file path failed");
                        }
                      }
                    }
                  }
                  if (paramAnonymous2View.size() < 0)
                  {
                    w.e("MicroMsg.SnsActivity", "no image file available");
                    GMTrace.o(8325794103296L, 62032);
                    return true;
                  }
                  paramAnonymous2DragEvent = new Intent(bb.this.mActivity, En_c4f742e5.class);
                  paramAnonymous2DragEvent.putExtra("KSnsPostManu", true);
                  paramAnonymous2DragEvent.putExtra("KTouchCameraTime", bg.Pu());
                  paramAnonymous2DragEvent.putStringArrayListExtra("sns_kemdia_path_list", paramAnonymous2View);
                  paramAnonymous2DragEvent.setAction("android.intent.action.SEND");
                  paramAnonymous2DragEvent.addCategory("android.intent.category.DEFAULT");
                  paramAnonymous2DragEvent.addFlags(268435456);
                  paramAnonymous2DragEvent.putExtra("android.intent.extra.TEXT", "");
                  paramAnonymous2DragEvent.putExtra("Ksnsupload_empty_img", true);
                  if (bb.this.pQn) {
                    paramAnonymous2DragEvent.putExtra("Ksnsupload_source", 11);
                  }
                  paramAnonymous2DragEvent.setType("image/*");
                  bb.this.mActivity.startActivity(paramAnonymous2DragEvent);
                  bool1 = bool2;
                }
              }
            }
          };
          if (bb.this.pzn != null) {
            bb.this.pzn.setOnDragListener(local1);
          }
          GMTrace.o(8338813222912L, 62129);
        }
      }.run();
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(8382702419968L, 62456);
    if (this.pzn != null)
    {
      SnsHeader localSnsHeader = this.pzn;
      if ((localSnsHeader.qaJ != null) && (!localSnsHeader.qaJ.isRecycled())) {
        localSnsHeader.qaJ.recycle();
      }
    }
    com.tencent.mm.kernel.h.xz();
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      com.tencent.mm.plugin.sns.model.ae.bja().K(this.mActivity);
      com.tencent.mm.plugin.sns.model.ae.biY().b(this);
    }
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    com.tencent.mm.kernel.h.xz();
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      com.tencent.mm.plugin.sns.model.ae.biZ().fMZ.remove(this);
      av.pqL -= 1;
    }
    this.qiM.setVisibility(8);
    ab.bnH();
    com.tencent.mm.kernel.h.xz();
    if (com.tencent.mm.kernel.h.xw().wL()) {
      com.tencent.mm.plugin.sns.model.ae.bja().start();
    }
    this.mqO.setAdapter(null);
    GMTrace.o(8382702419968L, 62456);
  }
  
  protected final boolean vB(final int paramInt)
  {
    GMTrace.i(8382568202240L, 62455);
    com.tencent.mm.kernel.h.xz();
    if (!com.tencent.mm.kernel.h.xy().isSDCardAvailable())
    {
      u.fo(this.mActivity);
      GMTrace.o(8382568202240L, 62455);
      return false;
    }
    w.d("MicroMsg.SnsActivity", "selectPhoto " + paramInt);
    Object localObject;
    if (paramInt == 2)
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("username", this.pQl);
      ((Intent)localObject).setClass(this.mActivity, SettingSnsBackgroundUI.class);
      this.mActivity.startActivityForResult((Intent)localObject, 7);
      GMTrace.o(8382568202240L, 62455);
      return true;
    }
    if (paramInt == 1)
    {
      com.tencent.mm.kernel.h.xz();
      i = bg.a((Integer)com.tencent.mm.kernel.h.xy().xh().get(68385, null), 0);
      com.tencent.mm.kernel.h.xz();
      int j = bg.a((Integer)com.tencent.mm.kernel.h.xy().xh().get(68386, null), 0);
      if ((!this.qiO) && (i < 3) && (j == 0))
      {
        this.qiO = true;
        localObject = this.mActivity;
        DialogInterface.OnClickListener local4 = new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8686168702976L, 64717);
            com.tencent.mm.kernel.h.xz();
            paramAnonymousInt = bg.a((Integer)com.tencent.mm.kernel.h.xy().xh().get(68386, null), 0);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().set(68386, Integer.valueOf(paramAnonymousInt + 1));
            bb.this.vB(paramInt);
            GMTrace.o(8686168702976L, 64717);
          }
        };
        i.a locala = new i.a((Context)localObject);
        locala.BN(i.j.plj);
        locala.VA(((Context)localObject).getString(i.j.plk) + "\n\n" + ((Context)localObject).getString(i.j.pll));
        locala.BQ(i.j.plp).a(local4);
        locala.a(new bc.1());
        locala.aax().show();
        GMTrace.o(8382568202240L, 62455);
        return true;
      }
      if (this.mActivity.getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).getString("gallery", "1").equalsIgnoreCase("0")) {
        com.tencent.mm.pluginsdk.ui.tools.k.a(this.mActivity, 2, null);
      }
    }
    else
    {
      GMTrace.o(8382568202240L, 62455);
      return true;
    }
    int i = com.tencent.mm.k.g.ut().getInt("SnsCanPickVideoFromAlbum", 1);
    w.i("MicroMsg.SnsActivity", "takeVideo %d", new Object[] { Integer.valueOf(i) });
    paramInt = 3;
    if (com.tencent.mm.platformtools.r.hlf) {
      i = 0;
    }
    if (i == 1) {
      paramInt = 3;
    }
    for (;;)
    {
      com.tencent.mm.pluginsdk.ui.tools.k.a(this.mActivity, 14, 9, 4, paramInt, false, null);
      break;
      if (i == 0) {
        paramInt = 1;
      }
    }
  }
  
  protected final void vh(int paramInt)
  {
    GMTrace.i(8383373508608L, 62461);
    w.d("MicroMsg.SnsActivity", "snsactivty onIsRecent ");
    this.qiM.vh(paramInt);
    GMTrace.o(8383373508608L, 62461);
  }
  
  public static abstract interface a
  {
    public abstract void H(int paramInt, boolean paramBoolean);
    
    public abstract void a(int paramInt, List<Integer> paramList1, List<Integer> paramList2);
    
    public abstract void bnc();
    
    public abstract ListView bnd();
    
    public abstract MMPullDownView bne();
    
    public abstract boolean bnf();
    
    public abstract void bng();
    
    public abstract void bnh();
    
    public abstract void bni();
    
    public abstract int getType();
    
    public abstract void hX(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */