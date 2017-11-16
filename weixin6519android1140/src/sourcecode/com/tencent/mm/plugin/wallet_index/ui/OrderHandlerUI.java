package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.ss;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.modelpay.PayReq.Options;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.asf;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.p;

@com.tencent.mm.ui.base.a(3)
public class OrderHandlerUI
  extends MMActivity
  implements e
{
  private String eHG;
  private int gRb;
  private String jjG;
  private long jjH;
  private c nJD;
  private PayReq.Options options;
  private PayReq rso;
  private PayResp rsp;
  private boolean rsq;
  private String rsr;
  private boolean rss;
  
  public OrderHandlerUI()
  {
    GMTrace.i(7579409317888L, 56471);
    this.rsq = false;
    this.gRb = 0;
    this.rsr = "";
    this.rss = false;
    this.jjH = 0L;
    this.nJD = new c() {};
    GMTrace.o(7579409317888L, 56471);
  }
  
  private void aD(String paramString, boolean paramBoolean)
  {
    GMTrace.i(7580348841984L, 56478);
    if (this.gRb == 1)
    {
      if ((TextUtils.isEmpty(this.rsr)) && (paramBoolean))
      {
        sv(0);
        String str = paramString;
        if (TextUtils.isEmpty(paramString)) {
          str = getString(a.i.tgK);
        }
        com.tencent.mm.ui.base.h.a(this, str, null, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7585583333376L, 56517);
            paramAnonymousDialogInterface.dismiss();
            OrderHandlerUI.this.finish();
            GMTrace.o(7585583333376L, 56517);
          }
        });
        GMTrace.o(7580348841984L, 56478);
        return;
      }
      aG(this, this.rsr);
      finish();
      GMTrace.o(7580348841984L, 56478);
      return;
    }
    a.a(this, this.jjG, this.rsp, this.options);
    finish();
    GMTrace.o(7580348841984L, 56478);
  }
  
  private static void aG(Context paramContext, String paramString)
  {
    GMTrace.i(7580617277440L, 56480);
    if (paramContext == null)
    {
      w.e("MicroMsg.OrderHandlerUI", "startOuterApp context == null");
      GMTrace.o(7580617277440L, 56480);
      return;
    }
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.OrderHandlerUI", "startOuterApp callbackUrl is empty");
      GMTrace.o(7580617277440L, 56480);
      return;
    }
    w.i("MicroMsg.OrderHandlerUI", "startOuterApp callbackUrl is " + paramString);
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    paramString.addFlags(268435456);
    if (bg.j(paramContext, paramString)) {
      paramContext.startActivity(paramString);
    }
    GMTrace.o(7580617277440L, 56480);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7580080406528L, 56476);
    if (paramk.getType() != 397)
    {
      GMTrace.o(7580080406528L, 56476);
      return;
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(397, this);
    w.i("MicroMsg.OrderHandlerUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    Object localObject2 = (com.tencent.mm.plugin.wallet_index.c.b)paramk;
    paramk = (asf)((com.tencent.mm.plugin.wallet_index.c.b)localObject2).fUa.gtD.gtK;
    if (paramk == null) {}
    for (paramk = null;; paramk = paramk.uIl)
    {
      this.rsr = paramk;
      if ((paramInt1 != 4) || (paramInt2 != -5)) {
        break;
      }
      w.e("MicroMsg.OrderHandlerUI", "onSceneEnd, auth access denied");
      this.rsp.errCode = -1;
      aD(paramString, true);
      GMTrace.o(7580080406528L, 56476);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.OrderHandlerUI", "onSceneEnd,  PayAuthApp is failed!");
      this.rsp.errCode = -1;
      aD(paramString, true);
      GMTrace.o(7580080406528L, 56476);
      return;
    }
    paramk = (asf)((com.tencent.mm.plugin.wallet_index.c.b)localObject2).fUa.gtD.gtK;
    label252:
    Object localObject1;
    if (paramk == null)
    {
      paramInt1 = -1;
      paramk = (asf)((com.tencent.mm.plugin.wallet_index.c.b)localObject2).fUa.gtD.gtK;
      if (paramk != null) {
        break label382;
      }
      paramk = null;
      localObject1 = (asf)((com.tencent.mm.plugin.wallet_index.c.b)localObject2).fUa.gtD.gtK;
      if (localObject1 != null) {
        break label392;
      }
      localObject1 = null;
      label276:
      localObject2 = (asf)((com.tencent.mm.plugin.wallet_index.c.b)localObject2).fUa.gtD.gtK;
      if (localObject2 != null) {
        break label402;
      }
    }
    label382:
    label392:
    label402:
    for (localObject2 = null;; localObject2 = ((asf)localObject2).unF)
    {
      w.d("MicroMsg.OrderHandlerUI", "onSceneEnd, respErrCode = %d, respErrMsg = %s, respPrepayId = %s, respAppSource = %s", new Object[] { Integer.valueOf(paramInt1), paramk, localObject1, localObject2 });
      if (!bg.nm((String)localObject1)) {
        break label412;
      }
      w.e("MicroMsg.OrderHandlerUI", "onSceneEnd, respPrepayId is null");
      this.rsp.errCode = -1;
      aD(paramString, true);
      GMTrace.o(7580080406528L, 56476);
      return;
      paramInt1 = paramk.kBk;
      break;
      paramk = paramk.kBl;
      break label252;
      localObject1 = ((asf)localObject1).unE;
      break label276;
    }
    label412:
    paramString = new PayInfo();
    paramString.appId = this.rso.appId;
    paramString.eHG = ((String)localObject1);
    paramString.partnerId = this.rso.partnerId;
    if (this.gRb == 1) {}
    for (paramString.ePL = 36;; paramString.ePL = 2)
    {
      paramString.rse = ((String)localObject2);
      paramString.tIB = String.valueOf(paramInt1);
      paramString.eAR = paramk;
      if (this.jjH > 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(641L, 1L, 1L, true);
        com.tencent.mm.plugin.report.service.g.ork.a(641L, 2L, bg.aH(this.jjH), true);
        if (paramString.tIC == null) {
          paramString.tIC = new Bundle();
        }
        paramString.tIC.putLong("wallet_pay_key_check_time", this.jjH);
      }
      this.eHG = paramString.eHG;
      com.tencent.mm.pluginsdk.wallet.g.a(this, paramString, 123);
      this.rsq = false;
      GMTrace.o(7580080406528L, 56476);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7579946188800L, 56475);
    int i = a.g.sNF;
    GMTrace.o(7579946188800L, 56475);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7580214624256L, 56477);
    if ((this.rsp != null) && (!this.rsq))
    {
      w.e("MicroMsg.OrderHandlerUI", "onActivityResult, onPayEnd not called");
      this.rsp.errCode = -2;
      aD("", false);
    }
    GMTrace.o(7580214624256L, 56477);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(7580483059712L, 56479);
    super.onConfigurationChanged(paramConfiguration);
    w.i("MicroMsg.OrderHandlerUI", "onConfigurationChanged");
    GMTrace.o(7580483059712L, 56479);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7579543535616L, 56472);
    super.onCreate(paramBundle);
    this.jjH = getIntent().getLongExtra("wallet_pay_key_check_time", -1L);
    sv(8);
    p.clQ();
    com.tencent.mm.sdk.b.a.vgX.b(this.nJD);
    GMTrace.o(7579543535616L, 56472);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7579811971072L, 56474);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(397, this);
    com.tencent.mm.sdk.b.a.vgX.c(this.nJD);
    super.onDestroy();
    GMTrace.o(7579811971072L, 56474);
  }
  
  /* Error */
  protected void onResume()
  {
    // Byte code:
    //   0: ldc2_w 461
    //   3: ldc_w 463
    //   6: invokestatic 45	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokespecial 465	com/tencent/mm/ui/MMActivity:onResume	()V
    //   13: new 335	com/tencent/mm/opensdk/modelpay/PayReq
    //   16: dup
    //   17: invokespecial 466	com/tencent/mm/opensdk/modelpay/PayReq:<init>	()V
    //   20: astore 6
    //   22: aload 6
    //   24: aload_0
    //   25: invokevirtual 429	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   28: invokevirtual 470	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   31: invokevirtual 473	com/tencent/mm/opensdk/modelpay/PayReq:fromBundle	(Landroid/os/Bundle;)V
    //   34: aload_0
    //   35: getfield 333	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rso	Lcom/tencent/mm/opensdk/modelpay/PayReq;
    //   38: ifnull +29 -> 67
    //   41: aload 6
    //   43: getfield 476	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   46: ifnull +500 -> 546
    //   49: aload 6
    //   51: getfield 476	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   54: aload_0
    //   55: getfield 333	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rso	Lcom/tencent/mm/opensdk/modelpay/PayReq;
    //   58: getfield 476	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   61: invokevirtual 480	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   64: ifne +482 -> 546
    //   67: aload_0
    //   68: aload 6
    //   70: putfield 333	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rso	Lcom/tencent/mm/opensdk/modelpay/PayReq;
    //   73: aload_0
    //   74: aload_0
    //   75: invokevirtual 429	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   78: ldc_w 482
    //   81: iconst_0
    //   82: invokevirtual 486	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   85: putfield 49	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:gRb	I
    //   88: ldc -128
    //   90: new 140	java/lang/StringBuilder
    //   93: dup
    //   94: ldc_w 488
    //   97: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   100: aload_0
    //   101: getfield 49	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:gRb	I
    //   104: invokevirtual 261	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   107: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokestatic 155	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload_0
    //   114: getfield 49	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:gRb	I
    //   117: ifne +56 -> 173
    //   120: aload_0
    //   121: aload_0
    //   122: invokevirtual 429	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   125: ldc_w 490
    //   128: invokevirtual 494	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   131: putfield 114	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:jjG	Ljava/lang/String;
    //   134: aload_0
    //   135: getfield 114	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:jjG	Ljava/lang/String;
    //   138: ifnull +13 -> 151
    //   141: aload_0
    //   142: getfield 114	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:jjG	Ljava/lang/String;
    //   145: invokevirtual 497	java/lang/String:length	()I
    //   148: ifne +25 -> 173
    //   151: ldc -128
    //   153: ldc_w 499
    //   156: invokestatic 136	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   159: aload_0
    //   160: invokevirtual 112	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:finish	()V
    //   163: ldc2_w 461
    //   166: ldc_w 463
    //   169: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   172: return
    //   173: aload_0
    //   174: new 501	com/tencent/mm/opensdk/modelpay/PayReq$Options
    //   177: dup
    //   178: invokespecial 502	com/tencent/mm/opensdk/modelpay/PayReq$Options:<init>	()V
    //   181: putfield 118	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   184: aload_0
    //   185: getfield 118	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   188: aload_0
    //   189: invokevirtual 429	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   192: invokevirtual 470	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   195: invokevirtual 503	com/tencent/mm/opensdk/modelpay/PayReq$Options:fromBundle	(Landroid/os/Bundle;)V
    //   198: aload_0
    //   199: new 287	com/tencent/mm/opensdk/modelpay/PayResp
    //   202: dup
    //   203: invokespecial 504	com/tencent/mm/opensdk/modelpay/PayResp:<init>	()V
    //   206: putfield 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rsp	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   209: aload_0
    //   210: getfield 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rsp	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   213: aload 6
    //   215: getfield 476	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   218: putfield 505	com/tencent/mm/opensdk/modelpay/PayResp:prepayId	Ljava/lang/String;
    //   221: aload_0
    //   222: getfield 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rsp	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   225: aload 6
    //   227: getfield 508	com/tencent/mm/opensdk/modelpay/PayReq:extData	Ljava/lang/String;
    //   230: putfield 509	com/tencent/mm/opensdk/modelpay/PayResp:extData	Ljava/lang/String;
    //   233: ldc 51
    //   235: astore_2
    //   236: aload_0
    //   237: getfield 49	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:gRb	I
    //   240: ifne +133 -> 373
    //   243: aload 6
    //   245: invokevirtual 513	com/tencent/mm/opensdk/modelpay/PayReq:checkArgs	()Z
    //   248: ifne +64 -> 312
    //   251: ldc -128
    //   253: ldc_w 515
    //   256: invokestatic 136	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   259: aload_0
    //   260: getfield 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rsp	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   263: iconst_m1
    //   264: putfield 290	com/tencent/mm/opensdk/modelpay/PayResp:errCode	I
    //   267: aload_0
    //   268: getfield 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rsp	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   271: aload_0
    //   272: getstatic 518	com/tencent/mm/plugin/wxpay/a$i:sWw	I
    //   275: invokevirtual 99	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getString	(I)Ljava/lang/String;
    //   278: putfield 521	com/tencent/mm/opensdk/modelpay/PayResp:errStr	Ljava/lang/String;
    //   281: aload_0
    //   282: aload_0
    //   283: getfield 114	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:jjG	Ljava/lang/String;
    //   286: aload_0
    //   287: getfield 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rsp	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   290: aload_0
    //   291: getfield 118	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   294: invokestatic 123	com/tencent/mm/plugin/wallet_index/ui/a:a	(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/opensdk/modelpay/PayResp;Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;)Z
    //   297: pop
    //   298: aload_0
    //   299: invokevirtual 112	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:finish	()V
    //   302: ldc2_w 461
    //   305: ldc_w 463
    //   308: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   311: return
    //   312: aload_0
    //   313: invokevirtual 429	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   316: ldc_w 523
    //   319: iconst_0
    //   320: invokevirtual 527	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   323: ifne +62 -> 385
    //   326: ldc -128
    //   328: ldc_w 529
    //   331: invokestatic 136	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   334: aload_0
    //   335: getfield 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rsp	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   338: iconst_m1
    //   339: putfield 290	com/tencent/mm/opensdk/modelpay/PayResp:errCode	I
    //   342: aload_0
    //   343: aload_0
    //   344: getfield 114	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:jjG	Ljava/lang/String;
    //   347: aload_0
    //   348: getfield 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:rsp	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   351: aload_0
    //   352: getfield 118	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   355: invokestatic 123	com/tencent/mm/plugin/wallet_index/ui/a:a	(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/opensdk/modelpay/PayResp;Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;)Z
    //   358: pop
    //   359: aload_0
    //   360: invokevirtual 112	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:finish	()V
    //   363: ldc2_w 461
    //   366: ldc_w 463
    //   369: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   372: return
    //   373: aload_0
    //   374: getfield 49	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:gRb	I
    //   377: iconst_1
    //   378: if_icmpne +7 -> 385
    //   381: ldc_w 531
    //   384: astore_2
    //   385: aload_0
    //   386: invokevirtual 429	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   389: ldc_w 490
    //   392: invokevirtual 494	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   395: astore 7
    //   397: ldc 51
    //   399: astore_1
    //   400: ldc 51
    //   402: astore 4
    //   404: aload_0
    //   405: invokevirtual 535	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getPackageManager	()Landroid/content/pm/PackageManager;
    //   408: aload 7
    //   410: iconst_0
    //   411: invokevirtual 541	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   414: pop
    //   415: aload_0
    //   416: invokevirtual 535	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getPackageManager	()Landroid/content/pm/PackageManager;
    //   419: aload 7
    //   421: iconst_0
    //   422: invokevirtual 541	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   425: getfield 547	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   428: aload_0
    //   429: invokevirtual 535	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getPackageManager	()Landroid/content/pm/PackageManager;
    //   432: invokevirtual 553	android/content/pm/ApplicationInfo:loadLabel	(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
    //   435: checkcast 352	java/lang/String
    //   438: astore_3
    //   439: aload_0
    //   440: aload 7
    //   442: invokestatic 559	com/tencent/mm/pluginsdk/model/app/p:aQ	(Landroid/content/Context;Ljava/lang/String;)[Landroid/content/pm/Signature;
    //   445: astore_1
    //   446: aload_1
    //   447: ifnull +8 -> 455
    //   450: aload_1
    //   451: arraylength
    //   452: ifne +104 -> 556
    //   455: ldc_w 561
    //   458: ldc_w 563
    //   461: invokestatic 136	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   464: aconst_null
    //   465: astore_1
    //   466: aload_1
    //   467: astore 4
    //   469: aload_3
    //   470: astore_1
    //   471: ldc -128
    //   473: ldc_w 565
    //   476: iconst_3
    //   477: anewarray 301	java/lang/Object
    //   480: dup
    //   481: iconst_0
    //   482: aload 7
    //   484: aastore
    //   485: dup
    //   486: iconst_1
    //   487: aload_1
    //   488: aastore
    //   489: dup
    //   490: iconst_2
    //   491: aload 4
    //   493: aastore
    //   494: invokestatic 567	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   497: invokestatic 241	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   500: pop
    //   501: invokestatic 245	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   504: getfield 251	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   507: sipush 397
    //   510: aload_0
    //   511: invokevirtual 569	com/tencent/mm/ad/n:a	(ILcom/tencent/mm/ad/e;)V
    //   514: new 265	com/tencent/mm/plugin/wallet_index/c/b
    //   517: dup
    //   518: aload 6
    //   520: aload_2
    //   521: aload 7
    //   523: aload_1
    //   524: aload 4
    //   526: invokespecial 572	com/tencent/mm/plugin/wallet_index/c/b:<init>	(Lcom/tencent/mm/opensdk/modelpay/PayReq;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   529: astore_1
    //   530: invokestatic 241	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   533: pop
    //   534: invokestatic 245	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   537: getfield 251	com/tencent/mm/kernel/b:fYr	Lcom/tencent/mm/ad/n;
    //   540: aload_1
    //   541: iconst_0
    //   542: invokevirtual 575	com/tencent/mm/ad/n:a	(Lcom/tencent/mm/ad/k;I)Z
    //   545: pop
    //   546: ldc2_w 461
    //   549: ldc_w 463
    //   552: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   555: return
    //   556: aload_1
    //   557: iconst_0
    //   558: aaload
    //   559: invokevirtual 581	android/content/pm/Signature:toByteArray	()[B
    //   562: invokestatic 587	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   565: astore_1
    //   566: goto -100 -> 466
    //   569: astore_3
    //   570: ldc -128
    //   572: aload_3
    //   573: ldc 51
    //   575: iconst_0
    //   576: anewarray 301	java/lang/Object
    //   579: invokestatic 591	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   582: goto -111 -> 471
    //   585: astore 5
    //   587: aload_3
    //   588: astore_1
    //   589: aload 5
    //   591: astore_3
    //   592: goto -22 -> 570
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	595	0	this	OrderHandlerUI
    //   399	190	1	localObject1	Object
    //   235	286	2	str1	String
    //   438	32	3	str2	String
    //   569	19	3	localNameNotFoundException1	android.content.pm.PackageManager.NameNotFoundException
    //   591	1	3	localObject2	Object
    //   402	123	4	localObject3	Object
    //   585	5	5	localNameNotFoundException2	android.content.pm.PackageManager.NameNotFoundException
    //   20	499	6	localPayReq	PayReq
    //   395	127	7	str3	String
    // Exception table:
    //   from	to	target	type
    //   404	439	569	android/content/pm/PackageManager$NameNotFoundException
    //   439	446	585	android/content/pm/PackageManager$NameNotFoundException
    //   450	455	585	android/content/pm/PackageManager$NameNotFoundException
    //   455	464	585	android/content/pm/PackageManager$NameNotFoundException
    //   556	566	585	android/content/pm/PackageManager$NameNotFoundException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\ui\OrderHandlerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */