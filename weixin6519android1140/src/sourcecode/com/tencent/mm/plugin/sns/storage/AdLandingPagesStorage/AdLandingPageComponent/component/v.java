package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView.a;
import com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class v
  extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a
{
  public static int pIP;
  private Context context;
  private ae ghS;
  public String idK;
  int kKE;
  public View npf;
  private long nqP;
  public boolean pIA;
  ImageView pIB;
  int pIC;
  boolean pID;
  int pIE;
  public int pIF;
  public boolean pIG;
  public boolean pIH;
  private boolean pII;
  private boolean pIJ;
  private boolean pIK;
  boolean pIL;
  boolean pIM;
  public boolean pIN;
  public boolean pIO;
  public boolean pIQ;
  aa pIm;
  public OfflineVideoView pIn;
  VideoPlayerSeekBar pIo;
  private ProgressBar pIp;
  public int pIq;
  private ImageView pIr;
  public boolean pIs;
  public boolean pIt;
  private TextView pIu;
  private int pIv;
  private int pIw;
  public int pIx;
  public int pIy;
  private int pIz;
  public int pnH;
  public int pnI;
  public int pnJ;
  int yvn;
  
  static
  {
    GMTrace.i(18578552127488L, 138421);
    pIP = 999;
    GMTrace.o(18578552127488L, 138421);
  }
  
  public v(final Context paramContext, q paramq, ViewGroup paramViewGroup)
  {
    super(paramContext, paramq, paramViewGroup);
    GMTrace.i(8280294293504L, 61693);
    this.pIm = null;
    this.pIs = true;
    this.nqP = 0L;
    this.pIv = 0;
    this.pIw = 0;
    this.pIx = 0;
    this.pIy = 0;
    this.pIz = 0;
    this.pnH = 0;
    this.pnI = 0;
    this.pnJ = 0;
    this.pIA = false;
    this.pIC = 0;
    this.yvn = 0;
    this.pID = true;
    this.pIE = 0;
    this.kKE = 0;
    this.pIF = 0;
    this.pIG = true;
    this.pIH = false;
    this.pII = false;
    this.pIJ = true;
    this.pIK = false;
    this.pIL = true;
    this.pIM = true;
    this.pIO = false;
    this.pIQ = false;
    this.context = paramContext;
    this.ghS = new ae(Looper.getMainLooper());
    this.pIm = new aa()
    {
      public final void hW(boolean paramAnonymousBoolean)
      {
        GMTrace.i(17124571480064L, 127588);
        Intent localIntent = new Intent("com.tencent.mm.adlanding.video_progressbar_change");
        if (paramAnonymousBoolean) {}
        for (int i = 1;; i = 0)
        {
          localIntent.putExtra("show", i);
          android.support.v4.content.d.l(paramContext).a(localIntent);
          GMTrace.o(17124571480064L, 127588);
          return;
        }
      }
    };
    GMTrace.o(8280294293504L, 61693);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8282039123968L, 61706);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8282039123968L, 61706);
      return false;
    }
    try
    {
      paramJSONObject.put("sightDuration", this.pIq * 1000);
      paramJSONObject.put("playTimeInterval", this.pIv);
      paramJSONObject.put("playCount", this.pIw);
      paramJSONObject.put("playCompletedCount", this.pIx);
      paramJSONObject.put("clickVoiceControlCount", this.pIC);
      if (this.pIK) {}
      for (String str = "1";; str = "0")
      {
        paramJSONObject.put("isAutoPlay", str);
        if (((q)this.pGS).type == 61) {
          paramJSONObject.put("clickSightCount", this.yvn);
        }
        JSONObject localJSONObject;
        if (!this.pIM)
        {
          str = com.tencent.mm.sdk.platformtools.aa.RP(((q)this.pGS).pEp);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("sightUrlInfo", localJSONObject);
        }
        if (!this.pIL)
        {
          str = com.tencent.mm.sdk.platformtools.aa.RP(((q)this.pGS).pEq);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("thumbUrlInfo", localJSONObject);
        }
        paramJSONObject.put("streamVideoEnterCount", this.pIz);
        paramJSONObject.put("streamVideoPlayCount", this.pnH);
        paramJSONObject.put("streamVideoPlayCompleteCount", this.pnI);
        paramJSONObject.put("streamVideoTotalPlayTimeInMs", this.pnJ);
        GMTrace.o(8282039123968L, 61706);
        return true;
      }
      return false;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.Sns.AdLandingPageSightVideoComponent", paramJSONObject, "", new Object[0]);
      GMTrace.o(8282039123968L, 61706);
    }
  }
  
  public final void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8281904906240L, 61705);
    super.O(paramInt1, paramInt2, paramInt3);
    w.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "height " + paramInt2);
    if ((paramInt1 == 0) || (paramInt2 == 0))
    {
      GMTrace.o(8281904906240L, 61705);
      return;
    }
    this.pIE = paramInt1;
    this.kKE = paramInt2;
    if (paramInt1 < 0)
    {
      GMTrace.o(8281904906240L, 61705);
      return;
    }
    if (paramInt1 >= 0.5F * paramInt2)
    {
      if ((this.pII) && (!this.pIJ))
      {
        GMTrace.o(8281904906240L, 61705);
        return;
      }
      this.pIQ = false;
      this.pIJ = false;
      this.pII = true;
      NetworkInfo localNetworkInfo = ((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
      if ((!this.pIG) || ((this.pIG) && (localNetworkInfo != null) && (localNetworkInfo.getType() == 1)))
      {
        if (this.pIm != null) {
          this.pIm.hW(true);
        }
        if (this.pIo.oSX > 0)
        {
          this.pIo.setVisibility(4);
          this.pIB.setVisibility(0);
          this.npf.setVisibility(0);
        }
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18579357433856L, 138427);
            if (v.this.pIH)
            {
              GMTrace.o(18579357433856L, 138427);
              return;
            }
            if (v.this.pIm != null) {
              v.this.pIm.hW(false);
            }
            v.this.pIo.setVisibility(4);
            v.this.pIB.setVisibility(8);
            v.this.npf.setVisibility(4);
            GMTrace.o(18579357433856L, 138427);
          }
        }, 3000L);
      }
      if (this.pIG)
      {
        if (localNetworkInfo == null)
        {
          this.pIr.setVisibility(0);
          this.pIs = false;
          this.pIK = false;
        }
      }
      else
      {
        if (this.pIF != 0) {
          break label339;
        }
        if (localNetworkInfo != null)
        {
          if (!this.pID) {
            break label327;
          }
          bkk();
          label295:
          this.pIF = 1;
        }
      }
      for (;;)
      {
        aoy();
        label327:
        label339:
        do
        {
          GMTrace.o(8281904906240L, 61705);
          return;
          this.pIK = true;
          this.pIG = false;
          break;
          bko();
          this.pIQ = true;
          break label295;
          if (this.pIF == 2)
          {
            if (this.pID) {
              bkk();
            }
            for (;;)
            {
              aoy();
              this.pIF = 1;
              GMTrace.o(8281904906240L, 61705);
              return;
              bko();
              this.pIQ = true;
            }
          }
        } while (this.pIF != 3);
        if (this.pID)
        {
          bkk();
        }
        else
        {
          bko();
          this.pIQ = true;
        }
      }
    }
    this.pIQ = false;
    this.pIJ = false;
    this.pII = false;
    blb();
    if (this.pIF == 1) {
      this.pIF = 2;
    }
    GMTrace.o(8281904906240L, 61705);
  }
  
  protected final int aXW()
  {
    GMTrace.i(8280428511232L, 61694);
    int i = i.g.pfm;
    GMTrace.o(8280428511232L, 61694);
    return i;
  }
  
  public final void aoy()
  {
    GMTrace.i(8280965382144L, 61698);
    if (this.pIO)
    {
      w.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "last download fail ,try again");
      this.pIn.bnK();
      GMTrace.o(8280965382144L, 61698);
      return;
    }
    w.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "starting play");
    if ((!this.pIN) && (!TextUtils.isEmpty(this.idK)))
    {
      this.pIn.yi(this.idK);
      this.pIN = true;
    }
    this.pIr.setVisibility(8);
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8236941967360L, 61370);
        v.this.pIo.cp(true);
        v.this.pIn.bnM();
        GMTrace.o(8236941967360L, 61370);
      }
    });
    this.nqP = System.currentTimeMillis();
    this.pIw += 1;
    GMTrace.o(8280965382144L, 61698);
  }
  
  public final View bkC()
  {
    int i = 1;
    GMTrace.i(8280696946688L, 61696);
    if (!e.aZ(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dL("adId", ((q)this.pGS).pEq))) {
      this.pIL = false;
    }
    if (!e.aZ(Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages/adId_stream_" + com.tencent.mm.sdk.platformtools.aa.RP(((q)this.pGS).pEp))) {
      this.pIM = false;
    }
    Object localObject1 = this.hqF.findViewById(i.f.pcs);
    Object localObject2 = (ViewGroup)((View)localObject1).findViewById(i.f.pcl);
    this.pIn = new OfflineVideoView(this.context);
    Object localObject3 = new LinearLayout.LayoutParams(-1, -1);
    ((ViewGroup)localObject2).addView(this.pIn, 0, (ViewGroup.LayoutParams)localObject3);
    int j;
    label322:
    boolean bool;
    if (((q)this.pGS).pEv == 1) {
      if ((int)((q)this.pGS).width > 0)
      {
        j = this.jsh * (int)((q)this.pGS).height / (int)((q)this.pGS).width;
        localObject3 = new RelativeLayout.LayoutParams(this.jsh, j);
        ((View)localObject1).setPadding((int)((q)this.pGS).pED, (int)((q)this.pGS).pEB, (int)((q)this.pGS).pEE, (int)((q)this.pGS).pEC);
        ((ViewGroup)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
        ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject3);
        localObject2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dL("adId", ((q)this.pGS).pEq);
        if (!FileOp.aZ((String)localObject2)) {
          break label1222;
        }
        this.pIn.IZ((String)localObject2);
        this.pIu = ((TextView)((View)localObject1).findViewById(i.f.paC));
        this.pIu.setText(this.context.getString(i.j.dnk));
        this.npf = ((View)localObject1).findViewById(i.f.pcw);
        if (this.npf != null)
        {
          localObject2 = new RelativeLayout.LayoutParams(this.jsh, this.jsi);
          localObject3 = this.npf.getParent();
          if ((localObject3 instanceof ViewGroup)) {
            ((ViewGroup)localObject3).removeView(this.npf);
          }
          ((ViewGroup)localObject1).addView(this.npf, (ViewGroup.LayoutParams)localObject2);
        }
        localObject2 = new RelativeLayout.LayoutParams(this.jsh - com.tencent.mm.br.a.fromDPToPix(this.context, 30), -2);
        ((RelativeLayout.LayoutParams)localObject2).addRule(12);
        ((RelativeLayout.LayoutParams)localObject2).bottomMargin = BackwardSupportUtil.b.a(this.context, this.context.getResources().getDimension(i.d.oXn));
        this.pIo = new VideoPlayerSeekBar(this.context);
        this.pIo.setVisibility(4);
        if (this.pIm != null)
        {
          localObject3 = this.pIm;
          if (this.pIo.getVisibility() != 0) {
            break label1254;
          }
          bool = true;
          label539:
          ((aa)localObject3).hW(bool);
        }
        this.pIo.oSQ = new b()
        {
          public final void Xw()
          {
            GMTrace.i(8246605643776L, 61442);
            if (v.this.pIn != null) {
              v.this.pIn.bnL();
            }
            GMTrace.o(8246605643776L, 61442);
          }
          
          public final void iM(int paramAnonymousInt)
          {
            GMTrace.i(8246739861504L, 61443);
            w.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onSeek time " + paramAnonymousInt);
            if (v.this.pID) {
              v.this.bkk();
            }
            for (;;)
            {
              v.this.pIn.I(paramAnonymousInt, v.this.pIo.eIC);
              GMTrace.o(8246739861504L, 61443);
              return;
              v.this.bko();
            }
          }
        };
        this.pIo.d(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8222043799552L, 61259);
            w.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "btn onclick view [%b] bar[%b]", new Object[] { Boolean.valueOf(v.this.pIn.isPlaying()), Boolean.valueOf(v.this.pIo.eIC) });
            v.this.pIs = true;
            if (v.this.pIo.eIC)
            {
              v.this.blb();
              v.this.pIF = 4;
              paramAnonymousView = v.this;
              paramAnonymousView.pIy += 1;
              GMTrace.o(8222043799552L, 61259);
              return;
            }
            if (v.this.pID) {
              v.this.bkk();
            }
            for (;;)
            {
              v.this.aoy();
              v.this.pIF = 3;
              if (!v.this.pDJ) {
                break;
              }
              v.this.bkp();
              break;
              v.this.bko();
              v.this.pIQ = true;
            }
          }
        });
        this.pIo.cp(this.pIn.isPlaying());
        this.pIo.seek(0);
        ((ViewGroup)localObject1).addView(this.pIo, (ViewGroup.LayoutParams)localObject2);
        this.pIB = ((ImageView)((View)localObject1).findViewById(i.f.pcx));
        this.pIB.setVisibility(0);
        this.pIB.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17098533240832L, 127394);
            paramAnonymousView = v.this;
            paramAnonymousView.pIC += 1;
            if (v.this.pID)
            {
              v.this.bkp();
              v.this.bko();
              v.this.pIQ = true;
            }
            for (;;)
            {
              v.this.pIA = true;
              GMTrace.o(17098533240832L, 127394);
              return;
              v.this.bkk();
            }
          }
        });
        this.pIB.setPadding(0, 0, com.tencent.mm.br.a.fromDPToPix(this.context, 8), com.tencent.mm.br.a.fromDPToPix(this.context, 13));
        localObject2 = this.pIB.getParent();
        if ((localObject2 instanceof ViewGroup)) {
          ((ViewGroup)localObject2).removeView(this.pIB);
        }
        ((ViewGroup)localObject1).addView(this.pIB);
        this.pIr = ((ImageView)((View)localObject1).findViewById(i.f.cfI));
        this.pIr.setImageDrawable(com.tencent.mm.br.a.b(this.context, i.i.cOK));
        this.pIr.setVisibility(8);
        this.pIr.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17125242568704L, 127593);
            v.this.pIs = true;
            v.this.aoy();
            v.this.pIG = false;
            if (v.this.pIA) {
              if (v.this.pID) {
                v.this.bkk();
              }
            }
            for (;;)
            {
              v.this.pIF = 3;
              v.this.pIo.setVisibility(4);
              v.this.pIB.setVisibility(0);
              v.this.npf.setVisibility(0);
              if (v.this.pIm != null) {
                v.this.pIm.hW(true);
              }
              af.i(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(17125779439616L, 127597);
                  if (v.this.pIH)
                  {
                    GMTrace.o(17125779439616L, 127597);
                    return;
                  }
                  if (v.this.pIm != null) {
                    v.this.pIm.hW(false);
                  }
                  v.this.pIo.setVisibility(4);
                  v.this.pIB.setVisibility(8);
                  v.this.npf.setVisibility(4);
                  GMTrace.o(17125779439616L, 127597);
                }
              }, 10000L);
              GMTrace.o(17125242568704L, 127593);
              return;
              v.this.bko();
              v.this.pIQ = true;
              continue;
              v.this.bko();
              v.this.pIQ = true;
              v.this.pIA = true;
            }
          }
        });
        this.pIn.pUo = new OfflineVideoView.a()
        {
          public final boolean a(PString paramAnonymousPString)
          {
            GMTrace.i(17836999180288L, 132896);
            String str1 = v.this.bkX().pEp;
            String str2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dM("adId", str1);
            if (FileOp.aZ(str2))
            {
              paramAnonymousPString.value = str2;
              v.this.pIN = true;
              GMTrace.o(17836999180288L, 132896);
              return true;
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", str1, false, 62, new d.a()
            {
              public final void Ih(String paramAnonymous2String)
              {
                GMTrace.i(17836730744832L, 132894);
                w.v("MicroMsg.Sns.AdLandingPageSightVideoComponent", "video view height " + v.this.hqF.getHeight() + ", player height " + v.this.pIn.getHeight());
                v.this.pIO = false;
                v.this.idK = paramAnonymous2String;
                if (v.this.pIo.eIC)
                {
                  v.this.pIn.yi(paramAnonymous2String);
                  v.this.pIN = true;
                }
                GMTrace.o(17836730744832L, 132894);
              }
              
              public final void bkK()
              {
                GMTrace.i(17836462309376L, 132892);
                GMTrace.o(17836462309376L, 132892);
              }
              
              public final void bkL()
              {
                GMTrace.i(17836596527104L, 132893);
                w.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "video download fail");
                v.this.pIO = true;
                GMTrace.o(17836596527104L, 132893);
              }
            });
            GMTrace.o(17836999180288L, 132896);
            return false;
          }
          
          public final void onCompletion()
          {
            GMTrace.i(17130611277824L, 127633);
            v localv = v.this;
            localv.pIx += 1;
            localv = v.this;
            localv.pIo.seek(0);
            localv.bla();
            GMTrace.o(17130611277824L, 127633);
          }
          
          public final void onStart(int paramAnonymousInt)
          {
            boolean bool = true;
            GMTrace.i(17130745495552L, 127634);
            v.this.pIt = true;
            v.this.pIq = paramAnonymousInt;
            if (v.this.pIo.oSX != paramAnonymousInt) {
              v.this.pIo.tY(v.this.pIq);
            }
            v.this.pIo.setVisibility(4);
            v.this.pIB.setVisibility(0);
            aa localaa;
            if (v.this.pIm != null)
            {
              localaa = v.this.pIm;
              if (v.this.pIo.getVisibility() != 0) {
                break label133;
              }
            }
            for (;;)
            {
              localaa.hW(bool);
              v.this.bla();
              GMTrace.o(17130745495552L, 127634);
              return;
              label133:
              bool = false;
            }
          }
          
          public final void uM(final int paramAnonymousInt)
          {
            GMTrace.i(17130879713280L, 127635);
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17128598011904L, 127618);
                w.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "play time " + paramAnonymousInt + " video time " + v.this.pIq);
                if (v.this.pIo.oSX != v.this.pIq) {
                  v.this.pIo.tY(v.this.pIq);
                }
                v.this.pIo.seek(paramAnonymousInt);
                v.this.pIo.cp(v.this.pIn.isPlaying());
                if (v.this.pIn.isPlaying()) {
                  v.this.pIt = true;
                }
                GMTrace.o(17128598011904L, 127618);
              }
            });
            GMTrace.o(17130879713280L, 127635);
          }
        };
        this.pIo.setVisibility(4);
        this.pIB.setVisibility(8);
        this.npf.setVisibility(4);
        if (this.pIm != null)
        {
          localObject2 = this.pIm;
          if (this.pIo.getVisibility() != 0) {
            break label1260;
          }
          bool = true;
          label842:
          ((aa)localObject2).hW(bool);
        }
        this.pIn.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            boolean bool = true;
            GMTrace.i(15274514317312L, 113804);
            if (v.this.pIt)
            {
              paramAnonymousView = v.this;
              paramAnonymousView.yvn += 1;
              if (v.this.bkZ())
              {
                GMTrace.o(15274514317312L, 113804);
                return;
              }
              v.this.pIH = true;
              if (v.this.pIo.getVisibility() != 0) {
                break label156;
              }
              v.this.pIo.setVisibility(4);
              v.this.pIB.setVisibility(8);
              v.this.npf.setVisibility(4);
              if (v.this.pIm != null)
              {
                paramAnonymousView = v.this.pIm;
                if (v.this.pIo.getVisibility() != 0) {
                  break label192;
                }
              }
            }
            for (;;)
            {
              paramAnonymousView.hW(bool);
              GMTrace.o(15274514317312L, 113804);
              return;
              label156:
              v.this.pIo.setVisibility(4);
              v.this.pIB.setVisibility(0);
              v.this.npf.setVisibility(0);
              break;
              label192:
              bool = false;
            }
          }
        });
        this.pIp = ((ProgressBar)((View)localObject1).findViewById(i.f.bUy));
        this.pIp.setVisibility(8);
        localObject1 = (q)this.pGS;
        if ((((q)localObject1).eCt != 1) || (((q)localObject1).pEs.length() <= 0) || (((q)localObject1).pEr.length() <= 0)) {
          break label1266;
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject1 = this.hqF.findViewById(i.f.pcm);
        ((View)localObject1).setVisibility(0);
        localObject2 = (Button)((View)localObject1).findViewById(i.f.pcn);
        ((Button)localObject2).setTextColor(((q)this.pGS).pEt);
        ((Button)localObject2).setText(((q)this.pGS).pEs);
        ((Button)localObject2).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18578686345216L, 138422);
            v.this.bkY();
            GMTrace.o(18578686345216L, 138422);
          }
        });
        ((View)localObject1).findViewById(i.f.pco).setBackgroundColor(((q)this.pGS).pEu);
      }
      localObject1 = this.hqF;
      GMTrace.o(8280696946688L, 61696);
      return (View)localObject1;
      ((ViewGroup)localObject2).setLayoutParams(new RelativeLayout.LayoutParams(this.jsh, this.jsi));
      ((View)localObject1).setLayoutParams(new RelativeLayout.LayoutParams(this.jsh, this.jsi));
      ((View)localObject1).setMinimumHeight(this.jsi);
      break;
      j = (int)((q)this.pGS).width;
      int k = (int)((q)this.pGS).height;
      ((ViewGroup)localObject2).setLayoutParams(new RelativeLayout.LayoutParams(j, k));
      localObject2 = new RelativeLayout.LayoutParams(j, k);
      ((RelativeLayout.LayoutParams)localObject2).leftMargin = ((int)((q)this.pGS).pED);
      ((RelativeLayout.LayoutParams)localObject2).rightMargin = ((int)((q)this.pGS).pEE);
      ((RelativeLayout.LayoutParams)localObject2).topMargin = ((int)((q)this.pGS).pEB);
      ((RelativeLayout.LayoutParams)localObject2).bottomMargin = ((int)((q)this.pGS).pEC);
      ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      break;
      label1222:
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", ((q)this.pGS).pEq, false, 1000000001, 0, new d.a()
      {
        public final void Ih(String paramAnonymousString)
        {
          GMTrace.i(17129537536000L, 127625);
          v.this.pIn.IZ(paramAnonymousString);
          GMTrace.o(17129537536000L, 127625);
        }
        
        public final void bkK()
        {
          GMTrace.i(17129269100544L, 127623);
          GMTrace.o(17129269100544L, 127623);
        }
        
        public final void bkL()
        {
          GMTrace.i(17129403318272L, 127624);
          GMTrace.o(17129403318272L, 127624);
        }
      });
      break label322;
      label1254:
      bool = false;
      break label539;
      label1260:
      bool = false;
      break label842;
      label1266:
      i = 0;
    }
  }
  
  protected final void bkI()
  {
    GMTrace.i(8280562728960L, 61695);
    w.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", getClass().getName() + "not support update now");
    GMTrace.o(8280562728960L, 61695);
  }
  
  public final q bkX()
  {
    GMTrace.i(17124974133248L, 127591);
    q localq = (q)this.pGS;
    GMTrace.o(17124974133248L, 127591);
    return localq;
  }
  
  public final void bkY()
  {
    GMTrace.i(18578417909760L, 138420);
    q localq = (q)this.pGS;
    if (bg.nm(localq.pEr))
    {
      w.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click without streamVideoUrl!");
      GMTrace.o(18578417909760L, 138420);
      return;
    }
    if (!(this.context instanceof Activity))
    {
      w.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click but context not activity!");
      GMTrace.o(18578417909760L, 138420);
      return;
    }
    w.v("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click, jumpto [%s]", new Object[] { localq.pEr });
    Intent localIntent = new Intent();
    localIntent.setClass(this.context, VideoAdPlayerUI.class);
    localIntent.putExtra("IsAd", true);
    localIntent.putExtra("KMediaId", com.tencent.mm.sdk.platformtools.aa.RP(localq.pEr));
    localIntent.putExtra("KThumUrl", localq.pEq);
    localIntent.putExtra("KStremVideoUrl", localq.pEr);
    localIntent.putExtra("ForceLandscape", true);
    localIntent.putExtra("ShareBtnHidden", 1);
    localIntent.putExtra("KComponentCid", bkN());
    ((Activity)this.context).startActivityForResult(localIntent, pIP);
    this.pIz += 1;
    GMTrace.o(18578417909760L, 138420);
  }
  
  public final boolean bkZ()
  {
    GMTrace.i(20835691659264L, 155238);
    if (!bg.nm(((q)this.pGS).pEw))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("sns_landig_pages_from_source", 14);
      localIntent.putExtra("sns_landig_pages_origin_from_source", ((q)this.pGS).pEM);
      localIntent.putExtra("sns_landing_pages_ux_info", ((q)this.pGS).pyc);
      localIntent.putExtra("sns_landing_pages_xml", "");
      localIntent.putExtra("sns_landing_pages_canvasid", ((q)this.pGS).pEw);
      localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
      String str3;
      String str1;
      String str2;
      JSONObject localJSONObject;
      if ((this.context instanceof Activity))
      {
        str3 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_sessionId");
        str1 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
        if (!bg.nm(str3))
        {
          str2 = String.valueOf(System.currentTimeMillis() / 1000L);
          localJSONObject = new JSONObject();
        }
      }
      for (;;)
      {
        try
        {
          localJSONObject.put("sessionId", str2);
          localJSONObject.put("cid", ((q)this.pGS).pEz);
          if (bg.nm(str1)) {
            continue;
          }
          localObject = str1;
          localJSONObject.put("adBuffer", localObject);
          localJSONObject.put("preSessionId", str3);
        }
        catch (Exception localException)
        {
          Object localObject;
          continue;
        }
        localIntent.putExtra("sns_landing_pages_search_extra", localJSONObject.toString());
        localIntent.putExtra("sns_landing_pages_sessionId", str2);
        localIntent.putExtra("sns_landing_pages_ad_buffer", str1);
        localObject = new int[2];
        this.pIn.getLocationOnScreen((int[])localObject);
        localIntent.putExtra("img_gallery_top", localObject[1]);
        localIntent.putExtra("img_gallery_left", localObject[0]);
        localIntent.putExtra("img_gallery_width", this.pIn.getWidth());
        localIntent.putExtra("img_gallery_height", this.pIn.getHeight());
        com.tencent.mm.bj.d.b(this.context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
        GMTrace.o(20835691659264L, 155238);
        return true;
        localObject = "";
      }
    }
    GMTrace.o(20835691659264L, 155238);
    return false;
  }
  
  public final void bkk()
  {
    GMTrace.i(8281233817600L, 61700);
    super.bkk();
    this.pIB.setImageDrawable(com.tencent.mm.br.a.b(this.context, i.e.oXK));
    this.pIn.setMute(true);
    this.pID = true;
    GMTrace.o(8281233817600L, 61700);
  }
  
  public final void bkl()
  {
    GMTrace.i(8281770688512L, 61704);
    super.bkl();
    this.pIn.onDestroy();
    GMTrace.o(8281770688512L, 61704);
  }
  
  public final void bkm()
  {
    GMTrace.i(8281502253056L, 61702);
    super.bkm();
    GMTrace.o(8281502253056L, 61702);
  }
  
  public final void bkn()
  {
    GMTrace.i(8281636470784L, 61703);
    super.bkn();
    blb();
    this.pIQ = false;
    if ((!this.pII) && (!this.pIJ))
    {
      GMTrace.o(8281636470784L, 61703);
      return;
    }
    this.pIJ = false;
    this.pII = false;
    if (this.pIF == 1) {
      this.pIF = 2;
    }
    GMTrace.o(8281636470784L, 61703);
  }
  
  public final void bko()
  {
    GMTrace.i(8281368035328L, 61701);
    super.bko();
    this.pIB.setImageDrawable(com.tencent.mm.br.a.b(this.context, i.e.oXL));
    this.pIn.setMute(false);
    this.pID = false;
    GMTrace.o(8281368035328L, 61701);
  }
  
  public final void bla()
  {
    GMTrace.i(17125108350976L, 127592);
    if ((this.pIn != null) && (this.pIo != null) && (Math.abs(this.pIn.getCurrentPosition() - this.pIo.jP) > 1)) {
      this.pIn.B(this.pIo.jP, true);
    }
    GMTrace.o(17125108350976L, 127592);
  }
  
  public final void blb()
  {
    GMTrace.i(8281099599872L, 61699);
    w.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "pause play");
    if (!this.pIs) {
      this.pIr.setVisibility(0);
    }
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15275453841408L, 113811);
        v.this.pIn.bnL();
        v.this.pIo.cp(false);
        GMTrace.o(15275453841408L, 113811);
      }
    });
    if (this.nqP != 0L)
    {
      this.pIv = ((int)(this.pIv + (System.currentTimeMillis() - this.nqP)));
      this.nqP = 0L;
    }
    GMTrace.o(8281099599872L, 61699);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */