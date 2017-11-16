package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

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
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.b;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView.a;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class x
  extends w
{
  private Context context;
  public ae ghS;
  public String idK;
  int kKE;
  public View npf;
  public long nqP;
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
  public int pIv;
  private int pIw;
  public int pIx;
  public int pIy;
  
  public x(final Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w paramw, ViewGroup paramViewGroup)
  {
    super(paramContext, paramw, paramViewGroup);
    GMTrace.i(8248753127424L, 61458);
    this.pIm = null;
    this.pIs = true;
    this.nqP = 0L;
    this.pIv = 0;
    this.pIw = 0;
    this.pIx = 0;
    this.pIy = 0;
    this.pIA = false;
    this.pIC = 0;
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
        GMTrace.i(17128195358720L, 127615);
        Intent localIntent = new Intent("com.tencent.mm.adlanding.video_progressbar_change");
        if (paramAnonymousBoolean) {}
        for (int i = 1;; i = 0)
        {
          localIntent.putExtra("show", i);
          android.support.v4.content.d.l(paramContext).a(localIntent);
          GMTrace.o(17128195358720L, 127615);
          return;
        }
      }
    };
    GMTrace.o(8248753127424L, 61458);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8250363740160L, 61470);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8250363740160L, 61470);
      return false;
    }
    try
    {
      paramJSONObject.put("streamVideoDuraion", this.pIq * 1000);
      paramJSONObject.put("playTimeInterval", this.pIv);
      paramJSONObject.put("playCount", this.pIw);
      paramJSONObject.put("playCompletedCount", this.pIx);
      paramJSONObject.put("clickPlayControlCount", this.pIy);
      paramJSONObject.put("clickVoiceControlCount", this.pIC);
      if (this.pIK) {}
      for (String str = "1";; str = "0")
      {
        paramJSONObject.put("isAutoPlay", str);
        JSONObject localJSONObject;
        if (!this.pIL)
        {
          str = com.tencent.mm.sdk.platformtools.aa.RP(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEX);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("thumbUrlInfo", localJSONObject);
        }
        if (!this.pIM)
        {
          str = com.tencent.mm.sdk.platformtools.aa.RP(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEr);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("streamVideoUrlInfo", localJSONObject);
        }
        GMTrace.o(8250363740160L, 61470);
        return true;
      }
      return false;
    }
    catch (JSONException paramJSONObject)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", paramJSONObject, "", new Object[0]);
      GMTrace.o(8250363740160L, 61470);
    }
  }
  
  public final void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8250229522432L, 61469);
    super.O(paramInt1, paramInt2, paramInt3);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "height " + paramInt2);
    if ((paramInt1 == 0) || (paramInt2 == 0))
    {
      GMTrace.o(8250229522432L, 61469);
      return;
    }
    this.pIE = paramInt1;
    this.kKE = paramInt2;
    if (paramInt1 < 0)
    {
      GMTrace.o(8250229522432L, 61469);
      return;
    }
    if (paramInt1 >= 0.5F * paramInt2)
    {
      if ((this.pII) && (!this.pIJ))
      {
        GMTrace.o(8250229522432L, 61469);
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
          this.pIo.setVisibility(0);
          this.pIB.setVisibility(0);
          this.npf.setVisibility(0);
        }
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17124839915520L, 127590);
            if (x.this.pIH)
            {
              GMTrace.o(17124839915520L, 127590);
              return;
            }
            if (x.this.pIm != null) {
              x.this.pIm.hW(false);
            }
            x.this.pIo.setVisibility(4);
            x.this.pIB.setVisibility(8);
            x.this.npf.setVisibility(4);
            GMTrace.o(17124839915520L, 127590);
          }
        }, 3000L);
      }
      if (this.pIG)
      {
        if ((localNetworkInfo == null) || ((localNetworkInfo != null) && (localNetworkInfo.getType() != 1)))
        {
          this.pIr.setVisibility(0);
          this.pIs = false;
          this.pIK = false;
        }
      }
      else
      {
        if (this.pIF != 0) {
          break label355;
        }
        if ((localNetworkInfo != null) && (localNetworkInfo.getType() == 1))
        {
          if (!this.pID) {
            break label343;
          }
          bkk();
          label312:
          this.pIF = 1;
        }
      }
      for (;;)
      {
        aoy();
        label343:
        label355:
        do
        {
          GMTrace.o(8250229522432L, 61469);
          return;
          this.pIK = true;
          this.pIG = false;
          break;
          bko();
          this.pIQ = true;
          break label312;
          if (this.pIF == 2)
          {
            if (this.pID) {
              bkk();
            }
            for (;;)
            {
              aoy();
              this.pIF = 1;
              GMTrace.o(8250229522432L, 61469);
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
    GMTrace.o(8250229522432L, 61469);
  }
  
  protected final int aXW()
  {
    GMTrace.i(8248887345152L, 61459);
    int i = i.g.pfm;
    GMTrace.o(8248887345152L, 61459);
    return i;
  }
  
  public final void aoy()
  {
    GMTrace.i(8249155780608L, 61461);
    if (this.pIO)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "last download fail ,try again");
      this.pIn.bnK();
      GMTrace.o(8249155780608L, 61461);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "starting play");
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
        GMTrace.i(8243384418304L, 61418);
        OfflineVideoView localOfflineVideoView = x.this.pIn;
        VideoPlayerTextureView localVideoPlayerTextureView;
        int i;
        boolean bool;
        if ((localOfflineVideoView.jGP instanceof VideoPlayerTextureView))
        {
          localVideoPlayerTextureView = (VideoPlayerTextureView)localOfflineVideoView.jGP;
          if (localVideoPlayerTextureView.mSurface == null)
          {
            i = 0;
            if ((i == 0) || (!localOfflineVideoView.isPlaying())) {
              break label110;
            }
            bool = true;
          }
        }
        for (;;)
        {
          if (bool) {
            break label123;
          }
          x.this.pIo.cp(true);
          x.this.pIn.bnM();
          GMTrace.o(8243384418304L, 61418);
          return;
          if (localVideoPlayerTextureView.tHu)
          {
            i = 0;
            break;
          }
          i = 1;
          break;
          label110:
          bool = false;
          continue;
          bool = localOfflineVideoView.isPlaying();
        }
        label123:
        x.this.pIn.startTimer();
        GMTrace.o(8243384418304L, 61418);
      }
    });
    this.nqP = System.currentTimeMillis();
    this.pIw += 1;
    GMTrace.o(8249155780608L, 61461);
  }
  
  public final View bkC()
  {
    boolean bool2 = true;
    GMTrace.i(8249021562880L, 61460);
    if (!e.aZ(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dL("adId", ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEX))) {
      this.pIL = false;
    }
    if (!e.aZ(Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages/adId_stream_" + com.tencent.mm.sdk.platformtools.aa.RP(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEr))) {
      this.pIM = false;
    }
    View localView = this.hqF.findViewById(i.f.pcs);
    Object localObject1 = (ViewGroup)localView.findViewById(i.f.pcl);
    this.pIn = new OfflineVideoView(this.context);
    Object localObject2 = new LinearLayout.LayoutParams(-1, -1);
    ((ViewGroup)localObject1).addView(this.pIn, 0, (ViewGroup.LayoutParams)localObject2);
    int i;
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEY == 1) {
      if ((int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).width > 0)
      {
        i = this.jsh * (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).height / (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).width;
        localObject2 = new RelativeLayout.LayoutParams(this.jsh, i);
        localView.setPadding((int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pED, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEB, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEE, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEC);
        ((ViewGroup)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localView.setMinimumHeight(i);
        localObject1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dL("adId", ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEX);
        if (!FileOp.aZ((String)localObject1)) {
          break label1053;
        }
        this.pIn.IZ((String)localObject1);
        label328:
        this.pIu = ((TextView)localView.findViewById(i.f.paC));
        this.pIu.setText(this.context.getString(i.j.dnk));
        this.npf = localView.findViewById(i.f.pcw);
        if (this.npf != null)
        {
          localObject1 = new RelativeLayout.LayoutParams(this.jsh, this.jsi);
          localObject2 = this.npf.getParent();
          if ((localObject2 instanceof ViewGroup)) {
            ((ViewGroup)localObject2).removeView(this.npf);
          }
          ((ViewGroup)localView).addView(this.npf, (ViewGroup.LayoutParams)localObject1);
        }
        localObject1 = new RelativeLayout.LayoutParams(this.jsh - com.tencent.mm.br.a.fromDPToPix(this.context, 30), -2);
        ((RelativeLayout.LayoutParams)localObject1).addRule(12);
        ((RelativeLayout.LayoutParams)localObject1).bottomMargin = BackwardSupportUtil.b.a(this.context, this.context.getResources().getDimension(i.d.oXn));
        this.pIo = new VideoPlayerSeekBar(this.context);
        this.pIo.setVisibility(4);
        if (this.pIm != null)
        {
          localObject2 = this.pIm;
          if (this.pIo.getVisibility() != 0) {
            break label1085;
          }
          bool1 = true;
          label544:
          ((aa)localObject2).hW(bool1);
        }
        this.pIo.oSQ = new b()
        {
          public final void Xw()
          {
            GMTrace.i(17127658487808L, 127611);
            if (x.this.pIn != null) {
              x.this.pIn.bnL();
            }
            GMTrace.o(17127658487808L, 127611);
          }
          
          public final void iM(int paramAnonymousInt)
          {
            GMTrace.i(17127792705536L, 127612);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "onSeek time " + paramAnonymousInt);
            if (x.this.pID) {
              x.this.bkk();
            }
            for (;;)
            {
              x.this.pIn.I(paramAnonymousInt, x.this.pIo.eIC);
              GMTrace.o(17127792705536L, 127612);
              return;
              x.this.bko();
            }
          }
        };
        this.pIo.d(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8283381301248L, 61716);
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "btn onclick view [%b] bar[%b]", new Object[] { Boolean.valueOf(x.this.pIn.isPlaying()), Boolean.valueOf(x.this.pIo.eIC) });
            x.this.pIs = true;
            if (x.this.pIo.eIC)
            {
              x.this.blb();
              x.this.pIF = 4;
              if (x.this.pDL)
              {
                paramAnonymousView = x.this;
                paramAnonymousView.pIy += 1;
              }
              GMTrace.o(8283381301248L, 61716);
              return;
            }
            if (x.this.pID) {
              x.this.bkk();
            }
            for (;;)
            {
              x.this.aoy();
              x.this.pIF = 3;
              if (!x.this.pDJ) {
                break;
              }
              x.this.bkp();
              break;
              x.this.bko();
              x.this.pIQ = true;
            }
          }
        });
        this.pIo.cp(this.pIn.isPlaying());
        this.pIo.seek(0);
        ((ViewGroup)localView).addView(this.pIo, (ViewGroup.LayoutParams)localObject1);
        this.pIB = ((ImageView)localView.findViewById(i.f.pcx));
        this.pIB.setVisibility(0);
        this.pIB.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8263248642048L, 61566);
            paramAnonymousView = x.this;
            paramAnonymousView.pIC += 1;
            if (x.this.pID)
            {
              x.this.bkp();
              x.this.bko();
              x.this.pIQ = true;
            }
            for (;;)
            {
              x.this.pIA = true;
              GMTrace.o(8263248642048L, 61566);
              return;
              x.this.bkk();
            }
          }
        });
        this.pIB.setPadding(0, 0, com.tencent.mm.br.a.fromDPToPix(this.context, 8), com.tencent.mm.br.a.fromDPToPix(this.context, 13));
        localObject1 = this.pIB.getParent();
        if ((localObject1 instanceof ViewGroup)) {
          ((ViewGroup)localObject1).removeView(this.pIB);
        }
        ((ViewGroup)localView).addView(this.pIB);
        this.pIr = ((ImageView)localView.findViewById(i.f.cfI));
        this.pIr.setImageDrawable(com.tencent.mm.br.a.b(this.context, i.i.cOK));
        this.pIr.setVisibility(8);
        this.pIr.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17125376786432L, 127594);
            x.this.pIs = true;
            x.this.aoy();
            x.this.pIG = false;
            if (x.this.pIA) {
              if (x.this.pID) {
                x.this.bkk();
              }
            }
            for (;;)
            {
              x.this.pIF = 3;
              x.this.pIo.setVisibility(0);
              x.this.pIB.setVisibility(0);
              x.this.npf.setVisibility(0);
              if (x.this.pIm != null) {
                x.this.pIm.hW(true);
              }
              af.i(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(17131416584192L, 127639);
                  if (x.this.pIH)
                  {
                    GMTrace.o(17131416584192L, 127639);
                    return;
                  }
                  if (x.this.pIm != null) {
                    x.this.pIm.hW(false);
                  }
                  x.this.pIo.setVisibility(4);
                  x.this.pIB.setVisibility(8);
                  x.this.npf.setVisibility(4);
                  GMTrace.o(17131416584192L, 127639);
                }
              }, 10000L);
              GMTrace.o(17125376786432L, 127594);
              return;
              x.this.bko();
              x.this.pIQ = true;
              continue;
              x.this.bko();
              x.this.pIQ = true;
              x.this.pIA = true;
            }
          }
        });
        this.pIn.pUo = new OfflineVideoView.a()
        {
          public final boolean a(PString paramAnonymousPString)
          {
            GMTrace.i(17836864962560L, 132895);
            String str1 = x.this.bld().pEr;
            String str2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dM("adId", str1);
            if (FileOp.aZ(str2))
            {
              paramAnonymousPString.value = str2;
              x.this.pIN = true;
              GMTrace.o(17836864962560L, 132895);
              return true;
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", str1, false, 62, new d.b()
            {
              public final void Ij(String paramAnonymous2String)
              {
                GMTrace.i(17127390052352L, 127609);
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "video download fail %s", new Object[] { paramAnonymous2String });
                x.this.pIO = true;
                GMTrace.o(17127390052352L, 127609);
              }
              
              public final void Ik(String paramAnonymous2String)
              {
                GMTrace.i(17127524270080L, 127610);
                com.tencent.mm.sdk.platformtools.w.v("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "video view height " + x.this.hqF.getHeight() + ", player height " + x.this.pIn.getHeight());
                x.this.pIO = false;
                x.this.idK = paramAnonymous2String;
                if (x.this.pIo.eIC)
                {
                  x.this.pIn.yi(paramAnonymous2String);
                  x.this.pIN = true;
                }
                GMTrace.o(17127524270080L, 127610);
              }
            });
            GMTrace.o(17836864962560L, 132895);
            return false;
          }
          
          public final void onCompletion()
          {
            boolean bool = false;
            GMTrace.i(17128866447360L, 127620);
            Object localObject = x.this;
            ((x)localObject).pIx += 1;
            x.this.pIo.setVisibility(0);
            x.this.pIB.setVisibility(0);
            x.this.npf.setVisibility(0);
            if (x.this.pIm != null)
            {
              localObject = x.this.pIm;
              if (x.this.pIo.getVisibility() == 0) {
                bool = true;
              }
              ((aa)localObject).hW(bool);
            }
            x.this.ghS.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17126047875072L, 127599);
                x.this.pIn.B(0, false);
                x.this.pIo.cp(false);
                x.this.pIo.seek(0);
                GMTrace.o(17126047875072L, 127599);
              }
            });
            if (x.this.nqP != 0L)
            {
              x.this.pIv = ((int)(x.this.pIv + (System.currentTimeMillis() - x.this.nqP)));
              x.this.nqP = 0L;
            }
            x.this.pIF = 5;
            GMTrace.o(17128866447360L, 127620);
          }
          
          public final void onStart(int paramAnonymousInt)
          {
            boolean bool = false;
            GMTrace.i(17129000665088L, 127621);
            x.this.pIt = true;
            x.this.pIq = paramAnonymousInt;
            if (x.this.pIo.oSX != paramAnonymousInt) {
              x.this.pIo.tY(x.this.pIq);
            }
            x.this.pIo.setVisibility(0);
            x.this.pIB.setVisibility(0);
            if (x.this.pIm != null)
            {
              localObject = x.this.pIm;
              if (x.this.pIo.getVisibility() == 0) {
                bool = true;
              }
              ((aa)localObject).hW(bool);
            }
            Object localObject = x.this;
            if ((((x)localObject).pIn != null) && (((x)localObject).pIo != null) && (Math.abs(((x)localObject).pIn.getCurrentPosition() - ((x)localObject).pIo.jP) > 1)) {
              ((x)localObject).pIn.B(((x)localObject).pIo.jP, true);
            }
            GMTrace.o(17129000665088L, 127621);
          }
          
          public final void uM(final int paramAnonymousInt)
          {
            GMTrace.i(17129134882816L, 127622);
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17098399023104L, 127393);
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "play time " + paramAnonymousInt + " video time " + x.this.pIq);
                if (x.this.pIo.oSX != x.this.pIq) {
                  x.this.pIo.tY(x.this.pIq);
                }
                x.this.pIo.seek(paramAnonymousInt);
                x.this.pIo.cp(x.this.pIn.isPlaying());
                if (x.this.pIn.isPlaying()) {
                  x.this.pIt = true;
                }
                GMTrace.o(17098399023104L, 127393);
              }
            });
            GMTrace.o(17129134882816L, 127622);
          }
        };
        this.pIo.setVisibility(4);
        this.pIB.setVisibility(8);
        this.npf.setVisibility(4);
        if (this.pIm != null)
        {
          localObject1 = this.pIm;
          if (this.pIo.getVisibility() != 0) {
            break label1090;
          }
        }
      }
    }
    label1053:
    label1085:
    label1090:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ((aa)localObject1).hW(bool1);
      this.pIn.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          boolean bool = true;
          GMTrace.i(17127926923264L, 127613);
          if (x.this.pIt)
          {
            x.this.pIH = true;
            if (x.this.pIo.getVisibility() != 0) {
              break label122;
            }
            x.this.pIo.setVisibility(4);
            x.this.pIB.setVisibility(8);
            x.this.npf.setVisibility(4);
            if (x.this.pIm != null)
            {
              paramAnonymousView = x.this.pIm;
              if (x.this.pIo.getVisibility() != 0) {
                break label158;
              }
            }
          }
          for (;;)
          {
            paramAnonymousView.hW(bool);
            GMTrace.o(17127926923264L, 127613);
            return;
            label122:
            x.this.pIo.setVisibility(0);
            x.this.pIB.setVisibility(0);
            x.this.npf.setVisibility(0);
            break;
            label158:
            bool = false;
          }
        }
      });
      this.pIp = ((ProgressBar)localView.findViewById(i.f.bUy));
      this.pIp.setVisibility(8);
      localView = this.hqF;
      GMTrace.o(8249021562880L, 61460);
      return localView;
      ((ViewGroup)localObject1).setLayoutParams(new RelativeLayout.LayoutParams(this.jsh, this.jsi));
      localView.setLayoutParams(new RelativeLayout.LayoutParams(this.jsh, this.jsi));
      localView.setMinimumHeight(this.jsi);
      break;
      i = this.jsi;
      localObject2 = new RelativeLayout.LayoutParams(this.jsh, i);
      localView.setPadding((int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pED, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEB, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEE, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEC);
      ((ViewGroup)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localView.setMinimumHeight(i);
      break;
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS).pEX, false, 1000000001, 0, new d.a()
      {
        public final void Ih(String paramAnonymousString)
        {
          GMTrace.i(17131282366464L, 127638);
          x.this.pIn.IZ(paramAnonymousString);
          GMTrace.o(17131282366464L, 127638);
        }
        
        public final void bkK()
        {
          GMTrace.i(17131013931008L, 127636);
          GMTrace.o(17131013931008L, 127636);
        }
        
        public final void bkL()
        {
          GMTrace.i(17131148148736L, 127637);
          GMTrace.o(17131148148736L, 127637);
        }
      });
      break label328;
      bool1 = false;
      break label544;
    }
  }
  
  protected final void bkI()
  {
    GMTrace.i(8250497957888L, 61471);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", getClass().getName() + "not support update now");
    GMTrace.o(8250497957888L, 61471);
  }
  
  public final void bkk()
  {
    GMTrace.i(8249424216064L, 61463);
    super.bkk();
    this.pIB.setImageDrawable(com.tencent.mm.br.a.b(this.context, i.e.oXK));
    this.pIn.setMute(true);
    this.pID = true;
    GMTrace.o(8249424216064L, 61463);
  }
  
  public final void bkl()
  {
    GMTrace.i(8250095304704L, 61468);
    super.bkl();
    this.pIn.onDestroy();
    GMTrace.o(8250095304704L, 61468);
  }
  
  public final void bkm()
  {
    GMTrace.i(8249826869248L, 61466);
    super.bkm();
    GMTrace.o(8249826869248L, 61466);
  }
  
  public final void bkn()
  {
    GMTrace.i(8249961086976L, 61467);
    super.bkn();
    blb();
    this.pIQ = false;
    if ((!this.pII) && (!this.pIJ))
    {
      GMTrace.o(8249961086976L, 61467);
      return;
    }
    this.pIJ = false;
    this.pII = false;
    if (this.pIF == 1) {
      this.pIF = 2;
    }
    GMTrace.o(8249961086976L, 61467);
  }
  
  public final void bko()
  {
    GMTrace.i(8249558433792L, 61464);
    super.bko();
    this.pIB.setImageDrawable(com.tencent.mm.br.a.b(this.context, i.e.oXL));
    this.pIn.setMute(false);
    this.pID = false;
    GMTrace.o(8249558433792L, 61464);
  }
  
  public final void blb()
  {
    GMTrace.i(8249289998336L, 61462);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "pause play");
    if (!this.pIs) {
      this.pIr.setVisibility(0);
    }
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8233183870976L, 61342);
        x.this.pIn.bnL();
        x.this.pIo.cp(false);
        GMTrace.o(8233183870976L, 61342);
      }
    });
    if (this.nqP != 0L)
    {
      this.pIv = ((int)(this.pIv + (System.currentTimeMillis() - this.nqP)));
      this.nqP = 0L;
    }
    GMTrace.o(8249289998336L, 61462);
  }
  
  public final int blc()
  {
    GMTrace.i(17125511004160L, 127595);
    if (this.pIo.getVisibility() == 0)
    {
      int[] arrayOfInt = new int[2];
      this.pIo.getLocationOnScreen(arrayOfInt);
      int i = this.jsi;
      int j = arrayOfInt[1];
      int k = this.pIo.getHeight();
      GMTrace.o(17125511004160L, 127595);
      return i - j - (k >>> 1);
    }
    GMTrace.o(17125511004160L, 127595);
    return -1;
  }
  
  public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w bld()
  {
    GMTrace.i(16043179245568L, 119531);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w localw = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)this.pGS;
    GMTrace.o(16043179245568L, 119531);
    return localw;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */