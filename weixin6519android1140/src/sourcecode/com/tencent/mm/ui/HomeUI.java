package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.MessageQueue.IdleHandler;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.ui.account.ShowAgreementsUI;
import com.tencent.mm.ui.tools.TestTimeForChatting;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
@TargetApi(11)
public final class HomeUI
  implements LauncherUI.b, LauncherUI.c, LauncherUI.d
{
  public static Boolean vIr;
  public static Boolean vIs;
  public ActionBar FM;
  private String ePK;
  public View hqF;
  public long lFy;
  LayoutInflater lVD;
  private boolean oaK;
  public int pGG;
  private final long pPS;
  public long pPT;
  private View qnC;
  MMFragmentActivity vFP;
  public View vIA;
  ImageView vIB;
  View vIC;
  MenuItem vID;
  MenuItem vIE;
  public VoiceSearchLayout vIF;
  com.tencent.mm.sdk.b.c vIG;
  MessageQueue.IdleHandler vIH;
  Runnable vII;
  public LinkedList<Runnable> vIJ;
  m vIK;
  private final long vIm;
  public boolean vIn;
  boolean vIo;
  public boolean vIp;
  public aa vIq;
  private final long vIt;
  private final long vIu;
  int vIv;
  LauncherUI.a vIw;
  j vIx;
  public w vIy;
  private boolean vIz;
  private final HashMap<String, Object> values;
  
  static
  {
    GMTrace.i(14990509604864L, 111688);
    vIr = Boolean.valueOf(false);
    vIs = Boolean.valueOf(false);
    GMTrace.o(14990509604864L, 111688);
  }
  
  public HomeUI()
  {
    GMTrace.i(14975879872512L, 111579);
    this.vIm = 604800000L;
    this.oaK = true;
    this.vIn = false;
    this.ePK = null;
    this.vIp = false;
    this.vIt = 432000000L;
    this.vIu = 604800000L;
    this.vIv = a.vIS;
    this.vIy = new w();
    this.vIz = com.tencent.mm.sdk.platformtools.v.bPG();
    this.pGG = 0;
    this.lFy = 0L;
    this.values = new HashMap();
    this.vIG = new com.tencent.mm.sdk.b.c() {};
    this.vIH = new MessageQueue.IdleHandler()
    {
      /* Error */
      public final boolean queueIdle()
      {
        // Byte code:
        //   0: ldc2_w 35
        //   3: ldc 37
        //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 43	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
        //   11: pop
        //   12: invokestatic 49	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
        //   15: bipush 15
        //   17: aconst_null
        //   18: invokevirtual 55	com/tencent/mm/storage/t:get	(ILjava/lang/Object;)Ljava/lang/Object;
        //   21: checkcast 57	java/lang/Integer
        //   24: invokestatic 63	com/tencent/mm/platformtools/t:e	(Ljava/lang/Integer;)I
        //   27: ifne +26 -> 53
        //   30: iconst_1
        //   31: istore_1
        //   32: iload_1
        //   33: ifeq +25 -> 58
        //   36: ldc 65
        //   38: ldc 67
        //   40: invokestatic 72	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   43: ldc2_w 35
        //   46: ldc 37
        //   48: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   51: iconst_0
        //   52: ireturn
        //   53: iconst_0
        //   54: istore_1
        //   55: goto -23 -> 32
        //   58: getstatic 78	com/tencent/mm/y/as:gnb	Lcom/tencent/mm/y/as;
        //   61: ldc 80
        //   63: ldc 82
        //   65: invokevirtual 86	com/tencent/mm/y/as:B	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   68: astore_3
        //   69: invokestatic 89	com/tencent/mm/y/at:AT	()Z
        //   72: ifne +12 -> 84
        //   75: aload_3
        //   76: ldc 82
        //   78: invokevirtual 95	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   81: ifne +28 -> 109
        //   84: invokestatic 99	com/tencent/mm/y/at:wS	()Lcom/tencent/mm/ad/n;
        //   87: new 101	com/tencent/mm/y/bf
        //   90: dup
        //   91: new 10	com/tencent/mm/ui/HomeUI$2$1
        //   94: dup
        //   95: aload_0
        //   96: invokespecial 104	com/tencent/mm/ui/HomeUI$2$1:<init>	(Lcom/tencent/mm/ui/HomeUI$2;)V
        //   99: ldc 106
        //   101: invokespecial 109	com/tencent/mm/y/bf:<init>	(Lcom/tencent/mm/y/bf$a;Ljava/lang/String;)V
        //   104: iconst_0
        //   105: invokevirtual 115	com/tencent/mm/ad/n:a	(Lcom/tencent/mm/ad/k;I)Z
        //   108: pop
        //   109: new 117	com/tencent/mm/booter/y$1
        //   112: dup
        //   113: new 119	com/tencent/mm/booter/y
        //   116: dup
        //   117: aload_0
        //   118: getfield 16	com/tencent/mm/ui/HomeUI$2:vIL	Lcom/tencent/mm/ui/HomeUI;
        //   121: getfield 123	com/tencent/mm/ui/HomeUI:vFP	Lcom/tencent/mm/ui/MMFragmentActivity;
        //   124: invokespecial 126	com/tencent/mm/booter/y:<init>	(Landroid/content/Context;)V
        //   127: invokespecial 129	com/tencent/mm/booter/y$1:<init>	(Lcom/tencent/mm/booter/y;)V
        //   130: ldc -125
        //   132: invokestatic 137	com/tencent/mm/sdk/f/e:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
        //   135: iconst_1
        //   136: invokestatic 143	com/tencent/mm/booter/o:onCreate	(Z)V
        //   139: invokestatic 146	com/tencent/mm/ui/HomeUI:bWW	()V
        //   142: invokestatic 151	com/tencent/mm/plugin/report/service/e:bbX	()V
        //   145: invokestatic 157	com/tencent/mm/ao/m:IQ	()Lcom/tencent/mm/ao/m;
        //   148: getfield 161	com/tencent/mm/ao/m:gIZ	Lcom/tencent/mm/ao/m$c;
        //   151: astore_3
        //   152: aload_3
        //   153: getfield 167	com/tencent/mm/ao/m$c:gJo	Ljava/util/LinkedList;
        //   156: invokevirtual 173	java/util/LinkedList:size	()I
        //   159: ifgt +13 -> 172
        //   162: aload_3
        //   163: getfield 176	com/tencent/mm/ao/m$c:gJn	Ljava/util/LinkedList;
        //   166: invokevirtual 173	java/util/LinkedList:size	()I
        //   169: ifle +30 -> 199
        //   172: aload_3
        //   173: invokevirtual 179	com/tencent/mm/ao/m$c:IT	()V
        //   176: invokestatic 185	android/os/Looper:myQueue	()Landroid/os/MessageQueue;
        //   179: aload_0
        //   180: getfield 16	com/tencent/mm/ui/HomeUI$2:vIL	Lcom/tencent/mm/ui/HomeUI;
        //   183: getfield 189	com/tencent/mm/ui/HomeUI:vIH	Landroid/os/MessageQueue$IdleHandler;
        //   186: invokevirtual 195	android/os/MessageQueue:removeIdleHandler	(Landroid/os/MessageQueue$IdleHandler;)V
        //   189: ldc2_w 35
        //   192: ldc 37
        //   194: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   197: iconst_0
        //   198: ireturn
        //   199: invokestatic 201	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
        //   202: invokevirtual 204	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
        //   205: ldc -51
        //   207: ldc 82
        //   209: invokevirtual 55	com/tencent/mm/storage/t:get	(ILjava/lang/Object;)Ljava/lang/Object;
        //   212: checkcast 91	java/lang/String
        //   215: astore 5
        //   217: invokestatic 201	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
        //   220: invokevirtual 204	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
        //   223: ldc -50
        //   225: ldc 82
        //   227: invokevirtual 55	com/tencent/mm/storage/t:get	(ILjava/lang/Object;)Ljava/lang/Object;
        //   230: checkcast 91	java/lang/String
        //   233: astore 4
        //   235: aload 5
        //   237: invokestatic 212	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   240: ifne +54 -> 294
        //   243: aload 5
        //   245: ldc -42
        //   247: invokevirtual 218	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
        //   250: astore 5
        //   252: aload_3
        //   253: monitorenter
        //   254: aload 5
        //   256: arraylength
        //   257: istore_2
        //   258: iconst_0
        //   259: istore_1
        //   260: iload_1
        //   261: iload_2
        //   262: if_icmpge +30 -> 292
        //   265: aload 5
        //   267: iload_1
        //   268: aaload
        //   269: invokestatic 222	com/tencent/mm/ao/m$c:kk	(Ljava/lang/String;)Lcom/tencent/mm/ao/m$b;
        //   272: astore 6
        //   274: aload 6
        //   276: ifnull +135 -> 411
        //   279: aload_3
        //   280: getfield 167	com/tencent/mm/ao/m$c:gJo	Ljava/util/LinkedList;
        //   283: aload 6
        //   285: invokevirtual 225	java/util/LinkedList:add	(Ljava/lang/Object;)Z
        //   288: pop
        //   289: goto +122 -> 411
        //   292: aload_3
        //   293: monitorexit
        //   294: aload 4
        //   296: invokestatic 212	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   299: ifne +65 -> 364
        //   302: aload 4
        //   304: ldc -42
        //   306: invokevirtual 218	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
        //   309: astore 4
        //   311: aload_3
        //   312: monitorenter
        //   313: aload 4
        //   315: arraylength
        //   316: istore_2
        //   317: iconst_0
        //   318: istore_1
        //   319: iload_1
        //   320: iload_2
        //   321: if_icmpge +41 -> 362
        //   324: aload 4
        //   326: iload_1
        //   327: aaload
        //   328: invokestatic 228	com/tencent/mm/ao/m$c:kj	(Ljava/lang/String;)Lcom/tencent/mm/ao/m$b;
        //   331: astore 5
        //   333: aload 5
        //   335: ifnull +13 -> 348
        //   338: aload_3
        //   339: getfield 176	com/tencent/mm/ao/m$c:gJn	Ljava/util/LinkedList;
        //   342: aload 5
        //   344: invokevirtual 225	java/util/LinkedList:add	(Ljava/lang/Object;)Z
        //   347: pop
        //   348: iload_1
        //   349: iconst_1
        //   350: iadd
        //   351: istore_1
        //   352: goto -33 -> 319
        //   355: astore 4
        //   357: aload_3
        //   358: monitorexit
        //   359: aload 4
        //   361: athrow
        //   362: aload_3
        //   363: monitorexit
        //   364: ldc -26
        //   366: ldc -24
        //   368: iconst_2
        //   369: anewarray 4	java/lang/Object
        //   372: dup
        //   373: iconst_0
        //   374: aload_3
        //   375: getfield 176	com/tencent/mm/ao/m$c:gJn	Ljava/util/LinkedList;
        //   378: invokevirtual 173	java/util/LinkedList:size	()I
        //   381: invokestatic 236	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   384: aastore
        //   385: dup
        //   386: iconst_1
        //   387: aload_3
        //   388: getfield 167	com/tencent/mm/ao/m$c:gJo	Ljava/util/LinkedList;
        //   391: invokevirtual 173	java/util/LinkedList:size	()I
        //   394: invokestatic 236	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   397: aastore
        //   398: invokestatic 239	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   401: goto -229 -> 172
        //   404: astore 4
        //   406: aload_3
        //   407: monitorexit
        //   408: aload 4
        //   410: athrow
        //   411: iload_1
        //   412: iconst_1
        //   413: iadd
        //   414: istore_1
        //   415: goto -155 -> 260
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	418	0	this	2
        //   31	384	1	i	int
        //   257	65	2	j	int
        //   68	339	3	localObject1	Object
        //   233	92	4	localObject2	Object
        //   355	5	4	localObject3	Object
        //   404	5	4	localObject4	Object
        //   215	128	5	localObject5	Object
        //   272	12	6	localb	com.tencent.mm.ao.m.b
        // Exception table:
        //   from	to	target	type
        //   254	258	355	finally
        //   265	274	355	finally
        //   279	289	355	finally
        //   292	294	355	finally
        //   357	359	355	finally
        //   313	317	404	finally
        //   324	333	404	finally
        //   338	348	404	finally
        //   362	364	404	finally
        //   406	408	404	finally
      }
    };
    this.vII = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19161325502464L, 142763);
        if ((com.tencent.mm.p.a.aQ(HomeUI.this.vFP)) || (com.tencent.mm.p.a.aP(HomeUI.this.vFP)))
        {
          GMTrace.o(19161325502464L, 142763);
          return;
        }
        Intent localIntent = new Intent();
        localIntent.putExtra("BaseScanUI_select_scan_mode", 1);
        localIntent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
        localIntent.setFlags(65536);
        com.tencent.mm.plugin.report.service.g.ork.i(11409, new Object[0]);
        com.tencent.mm.bj.d.b(HomeUI.this.vFP, "scanner", ".ui.BaseScanUI", localIntent);
        GMTrace.o(19161325502464L, 142763);
      }
    };
    this.pPS = 300L;
    this.pPT = SystemClock.elapsedRealtime();
    this.vIJ = new LinkedList();
    this.vIK = new m()
    {
      public final void b(String paramAnonymousString, final Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(19223736745984L, 143228);
        if ((com.tencent.mm.platformtools.t.nl(paramAnonymousString).equals("showprivacypolicy")) && (paramAnonymousMap != null))
        {
          paramAnonymousString = (String)paramAnonymousMap.get(".sysmsg.showprivacypolicy.device_id");
          String str = (String)paramAnonymousMap.get(".sysmsg.showprivacypolicy.guidance_content");
          paramAnonymousMap = (String)paramAnonymousMap.get(".sysmsg.showprivacypolicy.doublecheck_content");
          Object localObject = com.tencent.mm.bm.b.aX(p.ta().getBytes());
          ((com.tencent.mm.bm.b)localObject).zL(16);
          localObject = Base64.encodeToString(((com.tencent.mm.bm.b)localObject).toByteArray(), 2);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.HomeUI", "deviceId:%s, localDeviceId:%s, guide:%s, doubleCheck:%s", new Object[] { paramAnonymousString, localObject, str, paramAnonymousMap });
          if ((com.tencent.mm.platformtools.t.nm(paramAnonymousString)) || (paramAnonymousString.equals(localObject)))
          {
            paramAnonymousString = str;
            if (com.tencent.mm.platformtools.t.nm(str)) {
              paramAnonymousString = ab.getResources().getString(R.l.dGx);
            }
            com.tencent.mm.ui.base.h.a(HomeUI.this.vFP, paramAnonymousString, "", ab.getResources().getString(R.l.cTs), false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(19223199875072L, 143224);
                paramAnonymous2DialogInterface = new Intent(HomeUI.this.vFP, ShowAgreementsUI.class);
                paramAnonymous2DialogInterface.putExtra("agreement_type", 1);
                if (!com.tencent.mm.platformtools.t.nm(paramAnonymousMap)) {
                  paramAnonymous2DialogInterface.putExtra("disagree_tip", paramAnonymousMap);
                }
                paramAnonymous2DialogInterface.putExtra("country_code", com.tencent.mm.kernel.h.xy().xh().get(274436, "").toString());
                HomeUI.this.vFP.startActivityForResult(paramAnonymous2DialogInterface, 22722);
                GMTrace.o(19223199875072L, 143224);
              }
            });
            GMTrace.o(19223736745984L, 143228);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.HomeUI", "device id not match");
        }
        GMTrace.o(19223736745984L, 143228);
      }
    };
    GMTrace.o(14975879872512L, 111579);
  }
  
  public static void bWW()
  {
    GMTrace.i(16019288489984L, 119353);
    if (Build.VERSION.SDK_INT < 18)
    {
      Intent localIntent = new Intent(ab.getContext(), NotifyReceiver.NotifyService.class);
      ab.getContext().startService(localIntent);
    }
    GMTrace.o(16019288489984L, 119353);
  }
  
  private void kX(final boolean paramBoolean)
  {
    GMTrace.i(14976685178880L, 111585);
    if (this.qnC != null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LauncherUI.HomeUI", "tipsView already shown");
      GMTrace.o(14976685178880L, 111585);
      return;
    }
    this.qnC = View.inflate(ab.getContext(), R.i.cDf, null);
    Object localObject = (TextView)this.qnC.findViewById(R.h.bQO);
    if (paramBoolean) {
      ((TextView)localObject).setText(ab.getContext().getString(R.l.cQo));
    }
    for (;;)
    {
      localObject = new FrameLayout.LayoutParams(-2, -2, 53);
      this.qnC.setBackgroundResource(R.g.aYK);
      if (this.hqF != null)
      {
        ((ViewGroup)this.hqF).addView(this.qnC, (ViewGroup.LayoutParams)localObject);
        localObject = AnimationUtils.loadAnimation(ab.getContext(), R.a.aLX);
        this.qnC.startAnimation((Animation)localObject);
        this.qnC.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(19109920112640L, 142380);
            HomeUI.this.vIq.dK();
            if (paramBoolean)
            {
              HomeUI.this.c(Boolean.valueOf(true), Boolean.valueOf(true));
              GMTrace.o(19109920112640L, 142380);
              return;
            }
            HomeUI.this.c(Boolean.valueOf(true), Boolean.valueOf(false));
            GMTrace.o(19109920112640L, 142380);
          }
        });
      }
      GMTrace.o(14976685178880L, 111585);
      return;
      ((TextView)localObject).setText(ab.getContext().getString(R.l.cQn));
    }
  }
  
  public final void W(Runnable paramRunnable)
  {
    GMTrace.i(14979369533440L, 111605);
    if (!this.vIJ.contains(paramRunnable)) {
      this.vIJ.add(paramRunnable);
    }
    GMTrace.o(14979369533440L, 111605);
  }
  
  public final void X(Runnable paramRunnable)
  {
    GMTrace.i(14979503751168L, 111606);
    this.vIJ.remove(paramRunnable);
    GMTrace.o(14979503751168L, 111606);
  }
  
  public final void a(FitSystemWindowLayoutView paramFitSystemWindowLayoutView, Rect paramRect, ViewGroup paramViewGroup)
  {
    GMTrace.i(19099719565312L, 142304);
    this.vFP.getWindow().getDecorView().getBottom();
    this.vFP.cN().cO().getCustomView().getBottom();
    paramFitSystemWindowLayoutView.vIX = paramViewGroup;
    paramFitSystemWindowLayoutView.fitSystemWindows(paramRect);
    GMTrace.o(19099719565312L, 142304);
  }
  
  public final void anv()
  {
    GMTrace.i(14976148307968L, 111581);
    Object localObject2 = getString(R.l.app_name);
    Object localObject1 = localObject2;
    if (com.tencent.mm.protocal.d.tJF)
    {
      if (this.vIz) {
        localObject1 = (String)localObject2 + getString(R.l.cRD);
      }
    }
    else
    {
      if (this.vIy.bXT() <= 0) {
        break label226;
      }
      localObject2 = localObject1;
      if (!this.vIz) {
        localObject2 = (String)localObject1 + " ";
      }
      localObject1 = (String)localObject2 + "(" + this.vIy.bXT() + ")";
    }
    label226:
    for (;;)
    {
      localObject2 = (TextView)this.FM.getCustomView().findViewById(16908308);
      if (localObject2 != null)
      {
        ((TextView)localObject2).setText((CharSequence)localObject1);
        ((TextView)localObject2).setTextSize(0, com.tencent.mm.br.a.W(ab.getContext(), R.f.aPt) * com.tencent.mm.br.a.eb(ab.getContext()));
      }
      GMTrace.o(14976148307968L, 111581);
      return;
      localObject1 = (String)localObject2 + " " + getString(R.l.cRD);
      break;
    }
  }
  
  public final void bVK()
  {
    GMTrace.i(19099853783040L, 142305);
    if (this.vIF != null) {
      this.vIF.reset();
    }
    GMTrace.o(19099853783040L, 142305);
  }
  
  public final void bVQ()
  {
    GMTrace.i(14980443275264L, 111613);
    this.vFP.moveTaskToBack(true);
    if (at.AU()) {
      at.xB().h(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19149245906944L, 142673);
          if (at.AU())
          {
            at.AR();
            com.tencent.mm.storage.t localt = com.tencent.mm.y.c.xh();
            if (localt != null) {
              localt.kL(true);
            }
          }
          GMTrace.o(19149245906944L, 142673);
        }
      }, 500L);
    }
    com.tencent.mm.app.k localk = com.tencent.mm.app.k.pj();
    localk.esP = false;
    localk.esQ.removeMessages(63537);
    localk.esQ.removeMessages(62537);
    localk.esQ.sendEmptyMessageDelayed(63537, 3000L);
    localk.esQ.sendEmptyMessageDelayed(62537, 30000L);
    GMTrace.o(14980443275264L, 111613);
  }
  
  final void bWT()
  {
    GMTrace.i(14976550961152L, 111584);
    if (!at.AU())
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LauncherUI.HomeUI", "mmcore has not ready");
      GMTrace.o(14976550961152L, 111584);
      return;
    }
    at.AR();
    Boolean localBoolean = Boolean.valueOf(com.tencent.mm.platformtools.t.b((Boolean)com.tencent.mm.y.c.xh().get(340227, null)));
    if ((!localBoolean.booleanValue()) && (!com.tencent.mm.ui.contact.k.wSc.booleanValue()))
    {
      vIr = Boolean.valueOf(true);
      kX(true);
    }
    long l1 = System.currentTimeMillis();
    at.AR();
    long l2 = com.tencent.mm.platformtools.t.d((Long)com.tencent.mm.y.c.xh().get(340240, null));
    at.AR();
    boolean bool1 = com.tencent.mm.platformtools.t.b((Boolean)com.tencent.mm.y.c.xh().get(340230, null));
    at.AR();
    boolean bool2 = com.tencent.mm.platformtools.t.b((Boolean)com.tencent.mm.y.c.xh().get(340228, null));
    at.AR();
    boolean bool3 = com.tencent.mm.platformtools.t.b((Boolean)com.tencent.mm.y.c.xh().get(340229, null));
    if ((localBoolean.booleanValue()) && (Boolean.valueOf(bool2).booleanValue()) && (Boolean.valueOf(bool3).booleanValue()) && (!Boolean.valueOf(bool1).booleanValue()) && (l1 - l2 >= 432000000L))
    {
      vIs = Boolean.valueOf(true);
      kX(false);
    }
    GMTrace.o(14976550961152L, 111584);
  }
  
  public final void bWU()
  {
    GMTrace.i(14976953614336L, 111587);
    if ((this.vIq == null) || (!at.AU()))
    {
      GMTrace.o(14976953614336L, 111587);
      return;
    }
    if (this.vIq.isShowing())
    {
      this.vIq.dismiss();
      GMTrace.o(14976953614336L, 111587);
      return;
    }
    this.vIq.dK();
    GMTrace.o(14976953614336L, 111587);
  }
  
  final void bWV()
  {
    GMTrace.i(14977356267520L, 111590);
    if (!((l)com.tencent.mm.kernel.h.j(l.class)).isFTSIndexReady())
    {
      Toast.makeText(ab.getContext(), R.l.dWB, 0).show();
      GMTrace.o(14977356267520L, 111590);
      return;
    }
    int i = this.vIy.kZJ;
    Intent localIntent = new Intent().putExtra("from_tab_index", i).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
    com.tencent.mm.bj.d.b(this.vFP, "search", ".ui.FTSMainUI", localIntent);
    GMTrace.o(14977356267520L, 111590);
  }
  
  public final void bWX()
  {
    GMTrace.i(19099451129856L, 142302);
    at.xB().bQe();
    this.vIy.bXU();
    af.t(this.vII);
    GMTrace.o(19099451129856L, 142302);
  }
  
  public final boolean bWY()
  {
    GMTrace.i(19099585347584L, 142303);
    if (this.vIv == a.vIT)
    {
      GMTrace.o(19099585347584L, 142303);
      return true;
    }
    GMTrace.o(19099585347584L, 142303);
    return false;
  }
  
  final void bWZ()
  {
    GMTrace.i(14979235315712L, 111604);
    if (this.vIw.bWe())
    {
      GMTrace.o(14979235315712L, 111604);
      return;
    }
    this.FM.setLogo(new ColorDrawable(this.vFP.getResources().getColor(17170445)));
    this.FM.cJ();
    this.FM.setDisplayHomeAsUpEnabled(false);
    this.FM.cI();
    this.FM.cK();
    this.FM.setCustomView(v.fb(this.vFP).inflate(R.i.coQ, new LinearLayout(this.vFP), false));
    anv();
    this.FM.getCustomView().findViewById(R.h.bcK).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19246151106560L, 143395);
        if (SystemClock.elapsedRealtime() - HomeUI.this.pPT < 300L)
        {
          paramAnonymousView = HomeUI.this.vIJ.iterator();
          while (paramAnonymousView.hasNext()) {
            ((Runnable)paramAnonymousView.next()).run();
          }
        }
        HomeUI.this.pPT = SystemClock.elapsedRealtime();
        GMTrace.o(19246151106560L, 143395);
      }
    });
    GMTrace.o(14979235315712L, 111604);
  }
  
  public final void bXa()
  {
    GMTrace.i(14980577492992L, 111614);
    this.vIp = false;
    this.vIF.reset();
    GMTrace.o(14980577492992L, 111614);
  }
  
  public final void bXb()
  {
    GMTrace.i(19099988000768L, 142306);
    anv();
    GMTrace.o(19099988000768L, 142306);
  }
  
  public final void bXc()
  {
    GMTrace.i(20329422389248L, 151466);
    this.vIy.bXc();
    GMTrace.o(20329422389248L, 151466);
  }
  
  public final void c(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    GMTrace.i(14976819396608L, 111586);
    if (this.qnC != null)
    {
      this.qnC.clearAnimation();
      this.qnC.setVisibility(8);
      if (paramBoolean1.booleanValue())
      {
        if (!paramBoolean2.booleanValue()) {
          break label97;
        }
        at.AR();
        com.tencent.mm.y.c.xh().set(340227, Boolean.valueOf(true));
        com.tencent.mm.plugin.report.service.g.ork.a(232L, 0L, 1L, false);
        vIr = Boolean.valueOf(false);
      }
    }
    for (;;)
    {
      this.qnC = null;
      GMTrace.o(14976819396608L, 111586);
      return;
      label97:
      at.AR();
      com.tencent.mm.y.c.xh().set(340230, Boolean.valueOf(true));
      com.tencent.mm.plugin.report.service.g.ork.a(232L, 5L, 1L, false);
      vIs = Boolean.valueOf(false);
    }
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(14977490485248L, 111591);
    String str = this.vFP.getString(paramInt);
    GMTrace.o(14977490485248L, 111591);
    return str;
  }
  
  public final void kY(boolean paramBoolean)
  {
    GMTrace.i(14977222049792L, 111589);
    if ((this.vIq == null) || (this.vIA == null))
    {
      GMTrace.o(14977222049792L, 111589);
      return;
    }
    if (!at.AU())
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.LauncherUI.HomeUI", "want update more menu new tips, but mmcore not ready");
      GMTrace.o(14977222049792L, 111589);
      return;
    }
    this.vIq.vNV.lo(paramBoolean);
    if (this.vIq.vNV.vNO > 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.vIC.setVisibility(0);
      GMTrace.o(14977222049792L, 111589);
      return;
    }
    this.vIC.setVisibility(8);
    GMTrace.o(14977222049792L, 111589);
  }
  
  public static class FitSystemWindowLayoutView
    extends FrameLayout
  {
    private Rect eI;
    public int vIW;
    public ViewGroup vIX;
    
    public FitSystemWindowLayoutView(Context paramContext)
    {
      super();
      GMTrace.i(14974671912960L, 111570);
      this.eI = new Rect();
      this.vIX = null;
      GMTrace.o(14974671912960L, 111570);
    }
    
    public FitSystemWindowLayoutView(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      GMTrace.i(14974537695232L, 111569);
      this.eI = new Rect();
      this.vIX = null;
      GMTrace.o(14974537695232L, 111569);
    }
    
    @TargetApi(14)
    public boolean fitSystemWindows(Rect paramRect)
    {
      GMTrace.i(14974806130688L, 111571);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "ashu::fitSystemWindows beg %s, cacheInsetsTop:%d, hashCode:%d", new Object[] { paramRect.toString(), Integer.valueOf(this.vIW), Integer.valueOf(hashCode()) });
      this.vIW = paramRect.top;
      Object localObject1;
      int j;
      int k;
      int i;
      Object localObject2;
      label207:
      label259:
      label326:
      boolean bool;
      if ((this.vIX != null) && ((this.vIX.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
      {
        localObject1 = (ViewGroup.MarginLayoutParams)this.vIX.getLayoutParams();
        j = ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin;
        k = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "try to setFitSystemWindowsBottomRightPadding: %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
        i = 0;
        if (i < getChildCount())
        {
          localObject2 = getChildAt(i);
          if (!(localObject2 instanceof TestTimeForChatting)) {
            break label459;
          }
          localObject2 = (TestTimeForChatting)localObject2;
          if ((Float.compare(j, com.tencent.mm.br.a.fromDPToPix(((TestTimeForChatting)localObject2).getContext(), 48) * 1.5F) > 0) || (j < 0))
          {
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.TestTimeForChatting", "ERROR bottom padding %d", new Object[] { Integer.valueOf(j) });
            ((TestTimeForChatting)localObject2).xjO = 0;
            if ((Float.compare(k, com.tencent.mm.br.a.fromDPToPix(((TestTimeForChatting)localObject2).getContext(), 48) * 1.5F) <= 0) && (k >= 0)) {
              break label449;
            }
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.TestTimeForChatting", "ERROR right padding %d", new Object[] { Integer.valueOf(j) });
            ((TestTimeForChatting)localObject2).xjP = 0;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "setFitSystemWindowsUseActionBarContainer: %d %d OK", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
          }
        }
        else
        {
          ad.u(((ViewGroup.MarginLayoutParams)localObject1).leftMargin, ((ViewGroup.MarginLayoutParams)localObject1).topMargin, ((ViewGroup.MarginLayoutParams)localObject1).rightMargin, ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin);
        }
      }
      else
      {
        this.eI.set(paramRect);
        if (!com.tencent.mm.compatible.util.d.et(14)) {
          break label473;
        }
        i = 0;
        if (i >= getChildCount()) {
          break label473;
        }
        localObject1 = getChildAt(i);
        if (!(localObject1 instanceof TestTimeForChatting)) {
          break label466;
        }
        ((View)localObject1).setFitsSystemWindows(true);
        bool = ((TestTimeForChatting)localObject1).fitSystemWindows(paramRect);
        ((View)localObject1).setFitsSystemWindows(false);
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI", "ashu::fitSystemWindows child ret %B, ApiLevel %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(Build.VERSION.SDK_INT) });
        bool = super.fitSystemWindows(this.eI);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI", "ashu::fitSystemWindows super ret %B", new Object[] { Boolean.valueOf(bool) });
        GMTrace.o(14974806130688L, 111571);
        return bool;
        ((TestTimeForChatting)localObject2).xjO = j;
        break label207;
        label449:
        ((TestTimeForChatting)localObject2).xjP = k;
        break label259;
        label459:
        i += 1;
        break;
        label466:
        i += 1;
        break label326;
        label473:
        bool = false;
      }
    }
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(14919105773568L, 111156);
      vIS = 1;
      vIT = 2;
      vIU = 3;
      vIV = new int[] { vIS, vIT, vIU };
      GMTrace.o(14919105773568L, 111156);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\HomeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */