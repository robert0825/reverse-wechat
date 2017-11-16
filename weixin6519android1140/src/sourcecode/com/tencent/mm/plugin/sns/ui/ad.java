package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pb;
import com.tencent.mm.g.a.pb.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amb;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.bgp;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.widget.QImageView.a;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ad
  implements z
{
  private String appId;
  private String appName;
  String desc;
  public String eDW;
  private boolean eEu;
  public String eIy;
  public MMActivity ezR;
  String giD;
  private String hNz;
  public ProgressDialog htG;
  private View jcL;
  String mhI;
  private int pPL;
  private com.tencent.mm.modelsns.b pPR;
  private boolean pRD;
  private boolean pTk;
  private boolean pTl;
  private WXMediaMessage pTm;
  SightPlayImageView pUb;
  public boolean pUc;
  private Bitmap pUd;
  private anf pUe;
  private c pUf;
  aw pUg;
  private int pUh;
  public Runnable pUi;
  public Runnable pUj;
  public String videoPath;
  
  public ad(MMActivity paramMMActivity)
  {
    GMTrace.i(8578391867392L, 63914);
    this.jcL = null;
    this.eIy = "";
    this.videoPath = "";
    this.eDW = "";
    this.eEu = false;
    this.pUc = false;
    this.pUd = null;
    this.pPR = null;
    this.pUe = new anf();
    this.pTk = false;
    this.pTl = false;
    this.pTm = null;
    this.pRD = false;
    this.pUf = new c() {};
    this.pUg = null;
    this.pUh = 0;
    this.desc = "";
    this.htG = null;
    this.pUi = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8356664180736L, 62262);
        ad.this.bnJ();
        GMTrace.o(8356664180736L, 62262);
      }
    };
    this.pUj = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8387400040448L, 62491);
        w.i("MicroMsg.SightWidget", "showProgress");
        ad localad = ad.this;
        MMActivity localMMActivity = ad.this.ezR;
        ad.this.ezR.getString(i.j.cUG);
        localad.htG = h.a(localMMActivity, ad.this.ezR.getString(i.j.pkC), false, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(8368072687616L, 62347);
            ad.this.pUg = null;
            ad.this.pUc = false;
            af.F(ad.this.pUi);
            GMTrace.o(8368072687616L, 62347);
          }
        });
        GMTrace.o(8387400040448L, 62491);
      }
    };
    this.ezR = paramMMActivity;
    GMTrace.o(8578391867392L, 63914);
  }
  
  public final void G(Bundle paramBundle)
  {
    GMTrace.i(8578526085120L, 63915);
    this.pPR = com.tencent.mm.modelsns.b.q(this.ezR.getIntent());
    this.mhI = bg.aq(this.ezR.getIntent().getStringExtra("KSightCdnUrl"), "");
    this.giD = bg.aq(this.ezR.getIntent().getStringExtra("KSightCdnThumbUrl"), "");
    this.appId = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.pTk = this.ezR.getIntent().getBooleanExtra("KThrid_app", false);
    this.pTl = this.ezR.getIntent().getBooleanExtra("KSnsAction", false);
    this.pRD = this.ezR.getIntent().getBooleanExtra("Kis_take_photo", false);
    this.pPL = this.ezR.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.hNz = bg.aq(this.ezR.getIntent().getStringExtra("reportSessionId"), "");
    paramBundle = this.ezR.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null) {
      this.pTm = new SendMessageToWX.Req(paramBundle).message;
    }
    this.eIy = this.ezR.getIntent().getStringExtra("KSightThumbPath");
    this.videoPath = this.ezR.getIntent().getStringExtra("KSightPath");
    this.eDW = this.ezR.getIntent().getStringExtra("sight_md5");
    paramBundle = this.ezR.getIntent().getByteArrayExtra("KMMSightExtInfo");
    if (paramBundle != null) {}
    try
    {
      this.pUe.aD(paramBundle);
      if (this.pUe == null)
      {
        this.pUe = new anf();
        this.pUe.uBZ = this.pRD;
      }
      paramBundle = new pb();
      paramBundle.eTW.type = 2;
      com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
      if (bg.nm(this.videoPath))
      {
        this.videoPath = bg.aq(paramBundle.eTX.eUb, "");
        w.e("MicroMsg.SightWidget", "videoPath is null %s", new Object[] { this.videoPath });
      }
      if (bg.nm(this.eDW))
      {
        paramBundle = bg.aq(paramBundle.eTX.eTZ, "");
        this.eDW = paramBundle;
        w.i("MicroMsg.SightWidget", "oncreate thumb path %s videopath %s md5 %s", new Object[] { this.eIy, this.videoPath, this.eDW });
        com.tencent.mm.sdk.b.a.vgX.b(this.pUf);
        GMTrace.o(8578526085120L, 63915);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        w.i("MicroMsg.SightWidget", "error %s", new Object[] { paramBundle.getMessage() });
        continue;
        paramBundle = this.eDW;
      }
    }
  }
  
  public final void H(Bundle paramBundle)
  {
    GMTrace.i(8578660302848L, 63916);
    GMTrace.o(8578660302848L, 63916);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, amc paramamc, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8579062956032L, 63919);
    if (this.pUg != null)
    {
      GMTrace.o(8579062956032L, 63919);
      return false;
    }
    if (this.pUc)
    {
      GMTrace.o(8579062956032L, 63919);
      return true;
    }
    this.pUc = true;
    this.desc = paramString1;
    parami = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      paramString2 = s.At();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        String str = (String)paramList1.next();
        if (!paramString2.contains(str))
        {
          bgp localbgp = new bgp();
          localbgp.jhi = str;
          parami.add(localbgp);
        }
      }
    }
    this.pUg = new aw(15);
    paramPInt.value = this.pUg.iZe;
    if (paramInt3 > com.tencent.mm.plugin.sns.c.a.poV) {
      this.pUg.uA(3);
    }
    paramString1 = this.pUg.HI(paramString1);
    new LinkedList();
    paramString1.a(paramamc).ak(parami).uC(paramInt1).uD(paramInt2).bv(paramList2);
    if (paramBoolean) {
      this.pUg.uF(1);
    }
    for (;;)
    {
      this.pUg.bv(paramList2);
      this.pUg.uE(this.pPL);
      this.pUg.eUF = this.pUe;
      this.pUg.d(null, null, null, paramInt4, paramInt5);
      if (!bg.nm(this.appId)) {
        this.pUg.HO(this.appId);
      }
      if (!bg.nm(this.appName)) {
        this.pUg.HP(bg.aq(this.appName, ""));
      }
      if (this.pTk) {
        this.pUg.uE(5);
      }
      if ((this.pTl) && (this.pTm != null))
      {
        this.pUg.HJ(this.pTm.mediaTagName);
        this.pUg.U(this.appId, this.pTm.messageExt, this.pTm.messageAction);
      }
      af.i(this.pUj, 700L);
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8586042277888L, 63971);
          ad localad = ad.this;
          long l = System.currentTimeMillis();
          aw localaw;
          Object localObject2;
          Object localObject1;
          int i;
          if ((!TextUtils.isEmpty(localad.mhI)) && (!TextUtils.isEmpty(localad.giD)))
          {
            localaw = localad.pUg;
            String str5 = localad.videoPath;
            localObject2 = localad.eIy;
            localObject1 = localad.desc;
            String str1 = localad.eDW;
            String str2 = localad.mhI;
            String str3 = localad.giD;
            String str4 = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(str5.getBytes());
            aw.HS(str4);
            FileOp.o(str5, str4);
            str5 = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(((String)localObject2).getBytes());
            FileOp.o((String)localObject2, str5);
            localObject2 = aw.a("", 6, str4, str5, str1, str2, str3);
            if (localObject2 == null)
            {
              w.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
              i = 0;
              if (i != 0) {
                break label493;
              }
              w.i("MicroMsg.SightWidget", "commitInThread videopath " + FileOp.kX(localad.videoPath) + " thumb: " + FileOp.kX(localad.eIy) + ",cdnUrl " + localad.mhI + "cdnThubmUrl " + localad.giD);
              af.t(new ad.6(localad));
            }
          }
          for (;;)
          {
            w.i("MicroMsg.SightWidget", "removeRunnable showProgress");
            af.F(ad.this.pUj);
            if (ad.this.pUg != null) {
              break label518;
            }
            GMTrace.o(8586042277888L, 63971);
            return;
            ((anu)localObject2).lPj = ((String)localObject1);
            if (bg.nm(((anu)localObject2).eBt)) {
              ((anu)localObject2).eBt = ((String)localObject1);
            }
            localaw.pwJ.uUc.ueW.add(localObject2);
            localObject1 = new amb();
            ((amb)localObject1).uAW = ((anu)localObject2).ppo;
            localaw.pwK.uDm.add(localObject1);
            i = 1;
            break;
            if (!localad.pUg.j(localad.videoPath, localad.eIy, localad.desc, localad.eDW))
            {
              w.i("MicroMsg.SightWidget", "commitInThread videopath " + FileOp.kX(localad.videoPath) + " thumb: " + FileOp.kX(localad.eIy));
              af.t(new ad.7(localad));
            }
            else
            {
              label493:
              w.i("MicroMsg.SightWidget", "commitInThread cost time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            }
          }
          label518:
          af.t(ad.this.pUi);
          GMTrace.o(8586042277888L, 63971);
        }
      }, "sight_send_ready");
      GMTrace.o(8579062956032L, 63919);
      return true;
      this.pUg.uF(0);
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8579197173760L, 63920);
    GMTrace.o(8579197173760L, 63920);
    return false;
  }
  
  public final boolean bmT()
  {
    GMTrace.i(8578794520576L, 63917);
    GMTrace.o(8578794520576L, 63917);
    return true;
  }
  
  public final View bmU()
  {
    GMTrace.i(8578928738304L, 63918);
    this.jcL = View.inflate(this.ezR, i.g.pgM, null);
    this.pUb = ((SightPlayImageView)this.jcL.findViewById(i.f.che));
    Object localObject = new DisplayMetrics();
    this.ezR.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.pUb.cV(com.tencent.mm.br.a.fromDPToPix(this.ezR, 64), com.tencent.mm.br.a.fromDPToPix(this.ezR, 64));
    this.pUb.a(QImageView.a.xsw);
    this.pUb.oTp = true;
    this.pUb.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8543092604928L, 63651);
        if (!FileOp.aZ(ad.this.videoPath))
        {
          w.i("MicroMsg.SightWidget", "click videopath is not exist " + ad.this.videoPath);
          GMTrace.o(8543092604928L, 63651);
          return;
        }
        int[] arrayOfInt = new int[2];
        if (paramAnonymousView != null) {
          paramAnonymousView.getLocationInWindow(arrayOfInt);
        }
        int i = paramAnonymousView.getWidth();
        int j = paramAnonymousView.getHeight();
        paramAnonymousView = new Intent(ad.this.ezR, SnsOnlineVideoActivity.class);
        paramAnonymousView.putExtra("intent_videopath", ad.this.videoPath);
        paramAnonymousView.putExtra("intent_thumbpath", ad.this.eIy);
        paramAnonymousView.putExtra("intent_isad", false);
        paramAnonymousView.putExtra("intent_ispreview", true);
        paramAnonymousView.putExtra("img_gallery_left", arrayOfInt[0]);
        paramAnonymousView.putExtra("img_gallery_top", arrayOfInt[1]);
        paramAnonymousView.putExtra("img_gallery_width", i);
        paramAnonymousView.putExtra("img_gallery_height", j);
        ad.this.ezR.startActivity(paramAnonymousView);
        ad.this.ezR.overridePendingTransition(0, 0);
        GMTrace.o(8543092604928L, 63651);
      }
    });
    w.i("MicroMsg.SightWidget", "videoPath " + this.videoPath + " thumbPath " + this.eIy + " " + FileOp.kX(this.videoPath) + " " + FileOp.kX(this.eIy));
    if (FileOp.aZ(this.videoPath)) {
      w.i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", new Object[] { this.videoPath, this.eDW });
    }
    this.pUb.ht(false);
    this.pUb.ar(this.videoPath, false);
    localObject = this.jcL;
    GMTrace.o(8578928738304L, 63918);
    return (View)localObject;
  }
  
  public final boolean bmV()
  {
    GMTrace.i(8579331391488L, 63921);
    if (this.htG != null) {
      this.htG.dismiss();
    }
    this.pUb.ar(this.videoPath, true);
    com.tencent.mm.sdk.b.a.vgX.c(this.pUf);
    if (com.tencent.mm.plugin.sns.data.i.m(this.pUd)) {
      this.pUd.recycle();
    }
    GMTrace.o(8579331391488L, 63921);
    return false;
  }
  
  public final void bnJ()
  {
    GMTrace.i(16046132035584L, 119553);
    if (this.pUg == null)
    {
      GMTrace.o(16046132035584L, 119553);
      return;
    }
    if (this.htG != null) {
      this.htG.dismiss();
    }
    w.i("MicroMsg.SightWidget", "commitDone");
    Object localObject = new pb();
    ((pb)localObject).eTW.type = 0;
    ((pb)localObject).eTW.eTY = true;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    this.pUc = true;
    int i = this.pUg.commit();
    if (this.pPR != null)
    {
      this.pPR.hc(i);
      com.tencent.mm.plugin.sns.h.e.pBV.b(this.pPR);
    }
    ae.bjk().pWd = 0L;
    if ((this.ezR.getIntent() != null) && (this.ezR.getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false)))
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("sns_resume_state", false);
      ((Intent)localObject).putExtra("sns_timeline_NeedFirstLoadint", true);
      ((Intent)localObject).setClass(this.ezR, En_424b8e16.class);
      ((Intent)localObject).addFlags(67108864);
      this.ezR.startActivity((Intent)localObject);
    }
    this.ezR.setResult(-1);
    this.ezR.finish();
    ae.biZ().bhR();
    GMTrace.o(16046132035584L, 119553);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */