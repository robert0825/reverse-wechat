package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.ag.a.c;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.5;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.6;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.a;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.b.a;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.m.a;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(19)
public class VideoAdPlayerUI
  extends MMActivity
  implements b.a, b.b
{
  private String bssid;
  private String eIy;
  private String eTv;
  private String gKE;
  private String gkL;
  private String gkM;
  private String hTy;
  private com.tencent.mm.y.d imE;
  private boolean jWb;
  private String mediaId;
  private String pEz;
  private com.tencent.mm.plugin.sns.storage.m pXt;
  private boolean poX;
  private com.tencent.mm.plugin.sns.a.b.h qfm;
  private int qkA;
  private int qkB;
  private String qkC;
  private String qkD;
  private String qkE;
  private long qkF;
  private int qkG;
  private int qkH;
  private boolean qkI;
  private boolean qkJ;
  private anu qkK;
  private String qkL;
  private int qkM;
  private String[] qkN;
  private String[] qkO;
  private VideoPlayView qku;
  private com.tencent.mm.modelsns.b qkv;
  private int qkw;
  private String qkx;
  public String qky;
  public String qkz;
  private String ssid;
  private String streamUrl;
  private String thumbUrl;
  private String url;
  
  public VideoAdPlayerUI()
  {
    GMTrace.i(8605101195264L, 64113);
    this.qkv = null;
    this.qfm = new com.tencent.mm.plugin.sns.a.b.h("VideoAdPlayerUI");
    this.gKE = "";
    this.eIy = "";
    this.streamUrl = "";
    this.url = "";
    this.thumbUrl = "";
    this.mediaId = "";
    this.poX = false;
    this.qkw = 0;
    this.qkx = "";
    this.gkL = "";
    this.gkM = "";
    this.qky = "";
    this.qkz = "";
    this.qkA = 0;
    this.qkB = 0;
    this.qkC = "";
    this.qkE = "";
    this.qkF = 0L;
    this.qkG = 0;
    this.qkH = 0;
    this.pEz = "";
    this.hTy = "";
    this.qkI = false;
    this.qkJ = false;
    this.qkK = null;
    this.jWb = false;
    this.qkN = null;
    this.qkO = null;
    GMTrace.o(8605101195264L, 64113);
  }
  
  private void vw(int paramInt)
  {
    GMTrace.i(8606980243456L, 64127);
    if (!this.poX)
    {
      GMTrace.o(8606980243456L, 64127);
      return;
    }
    this.qfm.ud(this.qku.getDuration());
    this.qfm.pnK.poM = bg.Pw();
    com.tencent.mm.plugin.sns.a.b.a.a locala = this.qfm.pnK;
    if (paramInt == 2) {}
    for (paramInt = 2;; paramInt = 1)
    {
      locala.poL = paramInt;
      this.qfm.pnK.poK = 2;
      w.i("MicroMsg.VideoPlayerUI", "duration  orient " + this.qfm.pnK.poL);
      GMTrace.o(8606980243456L, 64127);
      return;
    }
  }
  
  public final void Hd(String paramString)
  {
    GMTrace.i(8606174937088L, 64121);
    GMTrace.o(8606174937088L, 64121);
  }
  
  protected final int Qf()
  {
    GMTrace.i(8606711808000L, 64125);
    if (this.qkJ)
    {
      GMTrace.o(8606711808000L, 64125);
      return 0;
    }
    GMTrace.o(8606711808000L, 64125);
    return 4;
  }
  
  public final void av(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8606309154816L, 64122);
    GMTrace.o(8606309154816L, 64122);
  }
  
  public final void aw(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8606577590272L, 64124);
    w.i("MicroMsg.VideoPlayerUI", "onSightFinish " + paramString);
    this.qku.hu(false);
    this.qku.setVideoPath(this.gKE);
    this.qku.o(this.qku.bgO());
    this.qku.ci(false);
    if ((this.poX) && (!bg.nm(paramString)) && (this.qkK != null) && (paramString.equals(this.qkK.mmR)) && (FileOp.aZ(this.gKE))) {
      this.qfm.pnD = 1;
    }
    GMTrace.o(8606577590272L, 64124);
  }
  
  public final void bhV()
  {
    GMTrace.i(8606443372544L, 64123);
    GMTrace.o(8606443372544L, 64123);
  }
  
  public final void dB(String paramString1, String paramString2)
  {
    GMTrace.i(8606040719360L, 64120);
    w.i("MicroMsg.VideoPlayerUI", "isPlaying " + this.qku.isPlaying());
    if (this.qku.isPlaying())
    {
      GMTrace.o(8606040719360L, 64120);
      return;
    }
    this.qku.ci(false);
    if (paramString2.equals(this.qku.gKE))
    {
      this.qku.o(this.qku.bgO());
      this.qku.start();
      w.i("MicroMsg.VideoPlayerUI", "onSightProgressstart " + paramString1 + " path: " + paramString2);
      GMTrace.o(8606040719360L, 64120);
      return;
    }
    this.qku.setVideoPath(paramString2);
    this.qku.o(this.qku.bgO());
    w.i("MicroMsg.VideoPlayerUI", "onSightProgresssetVideoPath " + paramString1 + " path: " + paramString2);
    GMTrace.o(8606040719360L, 64120);
  }
  
  public void finish()
  {
    GMTrace.i(18572378112000L, 138375);
    if (this.jWb) {
      this.qku.pause();
    }
    if ((this.qfm != null) && (this.pEz != null) && (this.pEz.length() > 0))
    {
      Object localObject = this.qfm;
      ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnH = 0;
      ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnI = 0;
      ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnJ = 0;
      Iterator localIterator = ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnL.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.sns.a.b.a.a locala = (com.tencent.mm.plugin.sns.a.b.a.a)localIterator.next();
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnH += locala.poG;
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnI += locala.poH;
        int i = ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnJ;
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnJ = (locala.poI + i);
      }
      if ((((com.tencent.mm.plugin.sns.a.b.h)localObject).pnK != null) && (!((com.tencent.mm.plugin.sns.a.b.h)localObject).pnL.contains(((com.tencent.mm.plugin.sns.a.b.h)localObject).pnK)))
      {
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnH += ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnK.poG;
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnI += ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnK.poH;
        ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnJ += ((com.tencent.mm.plugin.sns.a.b.h)localObject).pnK.poI;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("KComponentCid", this.pEz);
      ((Intent)localObject).putExtra("KStreamVideoPlayCount", this.qfm.pnH);
      ((Intent)localObject).putExtra("KStreamVideoPlayCompleteCount", this.qfm.pnI);
      ((Intent)localObject).putExtra("KStreamVideoTotalPlayTimeInMs", this.qfm.pnJ);
      setResult(-1, (Intent)localObject);
    }
    super.finish();
    GMTrace.o(18572378112000L, 138375);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8605906501632L, 64119);
    int i = i.g.pgO;
    GMTrace.o(8605906501632L, 64119);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8605369630720L, 64115);
    w.i("MicroMsg.VideoPlayerUI", "onActivityResult %d", new Object[] { Integer.valueOf(paramInt1) });
    Object localObject1;
    if (4097 == paramInt1)
    {
      if (-1 == paramInt2)
      {
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        String str1 = paramIntent.getStringExtra("custom_send_text");
        Iterator localIterator = bg.g(((String)localObject1).split(",")).iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          w.i("MicroMsg.VideoPlayerUI", "send sight to %s", new Object[] { str2 });
          Object localObject2 = new f.a();
          ((f.a)localObject2).title = this.qkx;
          ((f.a)localObject2).type = 4;
          label166:
          label188:
          label301:
          int j;
          label623:
          String str3;
          int k;
          String str4;
          String str5;
          String str6;
          long l;
          int m;
          int n;
          if (!bg.nm(this.qkK.lPM))
          {
            ((f.a)localObject2).url = this.qkK.lPM;
            if (!bg.nm(this.qkK.uCY)) {
              break label740;
            }
            localObject1 = this.qkK.uCO;
            ((f.a)localObject2).thumburl = ((String)localObject1);
            ((f.a)localObject2).gkI = this.qkK.uCV;
            ((f.a)localObject2).gkJ = this.qkK.qkw;
            ((f.a)localObject2).gkK = this.qkx;
            ((f.a)localObject2).gkM = this.gkM;
            ((f.a)localObject2).gkL = this.gkL;
            ((f.a)localObject2).gkN = this.thumbUrl;
            ((f.a)localObject2).gkO = this.qky;
            ((f.a)localObject2).gkP = this.qkz;
            ((f.a)localObject2).eTv = this.eTv;
            localObject1 = FileOp.c(this.eIy, 0, -1);
            if (localObject1 != null) {
              break label752;
            }
            i = 0;
            w.i("MicroMsg.VideoPlayerUI", "read buf size %d", new Object[] { Integer.valueOf(i) });
            if (m.a.yz() != null) {
              m.a.yz().a((f.a)localObject2, "", "", str2, "", (byte[])localObject1);
            }
            if (this.qkM != 0)
            {
              j = this.qfm.pnK.poI;
              i = j;
              if (this.jWb)
              {
                i = j;
                if (this.qfm.pnK.poM != 0L) {
                  i = j + (int)(bg.aI(this.qfm.pnK.poM) / 1000L);
                }
              }
              localObject1 = new com.tencent.mm.modelstat.h(13228, "1,3," + i + "," + this.ssid + "," + this.bssid + "," + bg.Pu() + "," + this.qkL + "," + this.qkw, (int)bg.Pu());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a((k)localObject1, 0);
            }
            com.tencent.mm.plugin.messenger.a.d.aOe().cR(str1, str2);
            if (this.poX)
            {
              localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.hTy, 12, 6, "", 2, this.pXt.blE());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a((k)localObject1, 0);
            }
            if (this.qkB == 0) {
              continue;
            }
            boolean bool = s.eb(str2);
            if (!bool) {
              break label760;
            }
            localObject1 = j.c.pot;
            localObject2 = this.qkz;
            str3 = this.qky;
            j = this.qkA;
            k = this.qkB;
            str4 = this.qkC;
            str5 = this.qkD;
            str6 = this.qkE;
            l = this.qkF;
            m = this.qkG;
            n = this.qkH;
            if (!bool) {
              break label768;
            }
          }
          label740:
          label752:
          label760:
          label768:
          for (int i = com.tencent.mm.y.m.fk(str2);; i = 0)
          {
            j.a((j.c)localObject1, (String)localObject2, str3, j, k, str4, str5, str6, l, m, n, i);
            break;
            ((f.a)localObject2).url = this.qkK.uCV;
            break label166;
            localObject1 = this.qkK.uCY;
            break label188;
            i = localObject1.length;
            break label301;
            localObject1 = j.c.por;
            break label623;
          }
        }
        com.tencent.mm.ui.snackbar.a.e(this, getString(i.j.dCJ));
      }
    }
    else if (4098 == paramInt1)
    {
      if (this.qkB != 0) {
        j.a(j.c.pou, this.qkz, this.qky, this.qkA, this.qkB, this.qkC, this.qkD, this.qkE, this.qkF, this.qkG, this.qkH, 0);
      }
      if (-1 != paramInt2) {
        break label973;
      }
      if (this.poX)
      {
        localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.hTy, 15, 6, "", 2, this.pXt.blE());
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a((k)localObject1, 0);
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(8605369630720L, 64115);
      return;
      if (!this.poX) {
        break;
      }
      localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.hTy, 13, 6, "", 2, this.pXt.blE());
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a((k)localObject1, 0);
      break;
      label973:
      if (this.poX)
      {
        localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.hTy, 16, 6, "", 2, this.pXt.blE());
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a((k)localObject1, 0);
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(8606846025728L, 64126);
    super.onConfigurationChanged(paramConfiguration);
    VideoPlayView localVideoPlayView = this.qku;
    w.i("MicroMsg.VideoPlayView", "onConfigurationChanged " + paramConfiguration.orientation + " " + localVideoPlayView.oTY);
    if (localVideoPlayView.oTY != paramConfiguration.orientation)
    {
      if (paramConfiguration.orientation != 1) {
        break label125;
      }
      localVideoPlayView.update(1);
    }
    for (;;)
    {
      localVideoPlayView.oTY = paramConfiguration.orientation;
      if (localVideoPlayView.oTY == 2) {
        localVideoPlayView.npf.setVisibility(8);
      }
      vw(paramConfiguration.orientation);
      GMTrace.o(8606846025728L, 64126);
      return;
      label125:
      localVideoPlayView.update(2);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8605235412992L, 64114);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    getWindow().setFlags(1024, 1024);
    this.qkN = new String[] { getString(i.j.piy), getString(i.j.piz), getString(i.j.pix) };
    this.qkO = new String[] { getString(i.j.piy), getString(i.j.piz) };
    paramBundle = getIntent().getStringExtra("KSta_SnSId");
    this.pXt = com.tencent.mm.plugin.sns.model.ae.bjd().Ir(i.Hb(paramBundle));
    this.imE = new com.tencent.mm.y.d();
    this.qkv = com.tencent.mm.modelsns.b.q(getIntent());
    this.gKE = getIntent().getStringExtra("KFullVideoPath");
    this.streamUrl = getIntent().getStringExtra("KStremVideoUrl");
    this.thumbUrl = getIntent().getStringExtra("KThumUrl");
    this.mediaId = getIntent().getStringExtra("KMediaId");
    this.poX = getIntent().getBooleanExtra("IsAd", false);
    this.url = getIntent().getStringExtra("KUrl");
    this.qkx = bg.aq(getIntent().getStringExtra("KMediaTitle"), "");
    this.qkw = getIntent().getIntExtra("KMediaVideoTime", 0);
    this.qkI = getIntent().getBooleanExtra("KBlockFav", false);
    this.qkJ = getIntent().getBooleanExtra("ForceLandscape", false);
    this.gkL = getIntent().getStringExtra("StreamWording");
    this.gkM = getIntent().getStringExtra("StremWebUrl");
    this.pEz = getIntent().getStringExtra("KComponentCid");
    this.qky = getIntent().getStringExtra("KSta_StremVideoAduxInfo");
    this.qkz = getIntent().getStringExtra("KSta_StremVideoPublishId");
    this.qkA = getIntent().getIntExtra("KSta_SourceType", 0);
    this.qkB = getIntent().getIntExtra("KSta_Scene", 0);
    this.qkC = getIntent().getStringExtra("KSta_FromUserName");
    this.qkD = getIntent().getStringExtra("KSta_ChatName");
    this.qkE = getIntent().getStringExtra("KSta_SnSId");
    this.qkF = getIntent().getLongExtra("KSta_MsgId", 0L);
    this.qkG = getIntent().getIntExtra("KSta_FavID", 0);
    this.qkH = getIntent().getIntExtra("KSta_ChatroomMembercount", 0);
    this.eTv = getIntent().getStringExtra("KSta_SnsStatExtStr");
    this.hTy = bg.aq(getIntent().getStringExtra("KViewId"), "");
    this.qkL = bg.aq(getIntent().getStringExtra("ReportArgs"), "");
    this.qkM = getIntent().getIntExtra("NeedReportData", 0);
    if (this.qkM != 0)
    {
      paramBundle = ((WifiManager)getSystemService("wifi")).getConnectionInfo();
      this.ssid = paramBundle.getSSID();
      this.bssid = paramBundle.getBSSID();
    }
    this.qkK = new anu();
    this.qkK.uCO = this.thumbUrl;
    this.qkK.uCV = this.streamUrl;
    this.qkK.mmR = this.mediaId;
    this.qkK.lPM = this.url;
    this.qkK.uCN = 1;
    this.qkK.qkw = this.qkw;
    this.qfm.pnF = bg.Pw();
    w.i("MicroMsg.VideoPlayerUI", "init streamvideo " + this.qkK.mmR + " attachurl:" + this.qkK.uCV + " videoattachTotalTime:" + this.qkK.qkw + " streamvideowording: " + this.gkL + " streamvideoweburl: " + this.gkM + " mediaTitle: " + this.qkx + " thumburl " + this.thumbUrl + " streamvideoaduxinfo " + this.qky + " streamvideopublishid " + this.qkz);
    Object localObject1;
    if (bg.nm(this.gKE))
    {
      paramBundle = am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), this.qkK.mmR);
      localObject1 = i.k(this.qkK);
      this.gKE = (paramBundle + (String)localObject1);
    }
    if ((bg.nm(this.eIy)) || (!com.tencent.mm.a.e.aZ(this.eIy)))
    {
      paramBundle = "attach" + this.qkK.mmR;
      localObject1 = am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramBundle);
      this.eIy = ((String)localObject1 + i.GM(paramBundle));
    }
    if (!com.tencent.mm.a.e.aZ(this.eIy)) {}
    try
    {
      paramBundle = new anu();
      paramBundle.aD(this.qkK.toByteArray());
      paramBundle.mmR = ("attach" + paramBundle.mmR);
      localObject1 = new com.tencent.mm.plugin.sns.data.e(this.qkK);
      ((com.tencent.mm.plugin.sns.data.e)localObject1).pph = 1;
      ((com.tencent.mm.plugin.sns.data.e)localObject1).mDZ = this.qkK.mmR;
      com.tencent.mm.plugin.sns.model.ae.biY().a(paramBundle, 7, (com.tencent.mm.plugin.sns.data.e)localObject1, an.vBh);
      getWindow().addFlags(128);
      this.qku = ((VideoPlayView)findViewById(i.f.pex));
      paramBundle = this.qku;
      localObject1 = new AdVideoPlayerLoadingBar(this.vKB.vKW);
      Object localObject2 = new RelativeLayout.LayoutParams(-1, -2);
      ((RelativeLayout.LayoutParams)localObject2).addRule(12);
      ((RelativeLayout.LayoutParams)localObject2).bottomMargin = BackwardSupportUtil.b.a(paramBundle.getContext(), paramBundle.getContext().getResources().getDimension(a.c.oXn));
      paramBundle.oTJ = ((com.tencent.mm.plugin.sight.decode.ui.a)localObject1);
      paramBundle.jGP.hw(true);
      paramBundle.addView((View)paramBundle.oTJ, (ViewGroup.LayoutParams)localObject2);
      paramBundle.oTJ.a(new VideoPlayView.5(paramBundle));
      paramBundle.oTJ.d(new VideoPlayView.6(paramBundle));
      paramBundle.oTJ.cp(paramBundle.jGP.isPlaying());
      if (paramBundle.oTJ != null) {
        ((View)paramBundle.oTJ).setVisibility(8);
      }
      ((com.tencent.mm.plugin.sight.decode.ui.a)localObject1).seek(0);
      this.qku.oTH = new VideoPlayView.a()
      {
        public final void bgQ()
        {
          GMTrace.i(8532489404416L, 63572);
          VideoAdPlayerUI.d(VideoAdPlayerUI.this).bf(false);
          com.tencent.mm.plugin.sns.a.b.a.a locala = VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK;
          locala.poI += (int)bg.aI(VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK.poM);
          VideoAdPlayerUI.a(VideoAdPlayerUI.this, false);
          GMTrace.o(8532489404416L, 63572);
        }
        
        public final void bgR()
        {
          GMTrace.i(8532623622144L, 63573);
          w.i("MicroMsg.VideoPlayerUI", "onPlayCompletion");
          Object localObject = VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK;
          ((com.tencent.mm.plugin.sns.a.b.a.a)localObject).poH += 1;
          VideoAdPlayerUI.a(VideoAdPlayerUI.this, false);
          if (VideoAdPlayerUI.e(VideoAdPlayerUI.this) != 0)
          {
            localObject = new com.tencent.mm.modelstat.h(13227, "1,2," + VideoAdPlayerUI.i(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.f(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.g(VideoAdPlayerUI.this) + "," + bg.Pu() + "," + VideoAdPlayerUI.h(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.i(VideoAdPlayerUI.this), (int)bg.Pu());
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
          }
          GMTrace.o(8532623622144L, 63573);
        }
        
        public final void bgS()
        {
          GMTrace.i(18911948963840L, 140905);
          w.i("MicroMsg.VideoPlayerUI", "onPlayDownloadedPartComplete");
          VideoAdPlayerUI.a(VideoAdPlayerUI.this, false);
          VideoAdPlayerUI.c(VideoAdPlayerUI.this).bgL();
          GMTrace.o(18911948963840L, 140905);
        }
        
        public final void hx(boolean paramAnonymousBoolean)
        {
          GMTrace.i(8532355186688L, 63571);
          Object localObject;
          if (paramAnonymousBoolean)
          {
            localObject = VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK;
            if (VideoAdPlayerUI.this.getResources().getConfiguration().orientation != 2) {
              break label307;
            }
          }
          label307:
          for (int i = 2;; i = 1)
          {
            ((com.tencent.mm.plugin.sns.a.b.a.a)localObject).poL = i;
            VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK.poM = bg.Pw();
            VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK.poK = 2;
            VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK.poI = 0;
            if ((!VideoAdPlayerUI.b(VideoAdPlayerUI.this)) && ((int)VideoAdPlayerUI.c(VideoAdPlayerUI.this).bgO() == 0))
            {
              localObject = VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK;
              ((com.tencent.mm.plugin.sns.a.b.a.a)localObject).poG += 1;
            }
            VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK.poM = bg.Pw();
            VideoAdPlayerUI.d(VideoAdPlayerUI.this).a(VideoAdPlayerUI.c(VideoAdPlayerUI.this));
            if (VideoAdPlayerUI.e(VideoAdPlayerUI.this) != 0)
            {
              localObject = new com.tencent.mm.modelstat.h(13227, "1,1,0," + VideoAdPlayerUI.f(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.g(VideoAdPlayerUI.this) + "," + bg.Pu() + "," + VideoAdPlayerUI.h(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.i(VideoAdPlayerUI.this), (int)bg.Pu());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
            }
            VideoAdPlayerUI.a(VideoAdPlayerUI.this, true);
            GMTrace.o(8532355186688L, 63571);
            return;
          }
        }
        
        public final void ua(int paramAnonymousInt)
        {
          GMTrace.i(8532757839872L, 63574);
          if (VideoAdPlayerUI.i(VideoAdPlayerUI.this) == 0)
          {
            VideoAdPlayerUI.a(VideoAdPlayerUI.this, paramAnonymousInt);
            VideoAdPlayerUI.j(VideoAdPlayerUI.this).qkw = paramAnonymousInt;
          }
          GMTrace.o(8532757839872L, 63574);
        }
      };
      paramBundle = this.qku;
      int i = this.qkK.qkw;
      if (paramBundle.oTJ.bgE() != i) {
        paramBundle.oTJ.tY(i);
      }
      if (com.tencent.mm.a.e.aZ(this.gKE))
      {
        this.qfm.pnD = 1;
        this.qku.setVideoPath(this.gKE);
        paramBundle = this.qku;
        localObject1 = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8484573675520L, 63215);
            VideoAdPlayerUI.this.finish();
            GMTrace.o(8484573675520L, 63215);
          }
        };
        paramBundle.oTN.setOnClickListener((View.OnClickListener)localObject1);
        paramBundle = this.qku;
        localObject1 = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8391560790016L, 62522);
            VideoAdPlayerUI localVideoAdPlayerUI = VideoAdPlayerUI.this;
            if (VideoAdPlayerUI.k(VideoAdPlayerUI.this)) {}
            for (paramAnonymousView = VideoAdPlayerUI.l(VideoAdPlayerUI.this);; paramAnonymousView = VideoAdPlayerUI.m(VideoAdPlayerUI.this))
            {
              com.tencent.mm.ui.base.h.a(localVideoAdPlayerUI, null, paramAnonymousView, null, new h.c()
              {
                public final void hQ(int paramAnonymous2Int)
                {
                  GMTrace.i(8503095721984L, 63353);
                  switch (paramAnonymous2Int)
                  {
                  }
                  for (;;)
                  {
                    GMTrace.o(8503095721984L, 63353);
                    return;
                    Intent localIntent = new Intent();
                    localIntent.putExtra("Select_Conv_Type", 3);
                    localIntent.putExtra("select_is_ret", true);
                    localIntent.putExtra("mutil_select_is_ret", true);
                    localIntent.putExtra("ad_video_title", VideoAdPlayerUI.n(VideoAdPlayerUI.this));
                    localIntent.putExtra("Retr_Msg_Type", 2);
                    com.tencent.mm.bj.d.a(VideoAdPlayerUI.this, ".ui.transmit.SelectConversationUI", localIntent, 4097);
                    GMTrace.o(8503095721984L, 63353);
                    return;
                    VideoAdPlayerUI.o(VideoAdPlayerUI.this);
                    GMTrace.o(8503095721984L, 63353);
                    return;
                    VideoAdPlayerUI.p(VideoAdPlayerUI.this);
                  }
                }
              });
              GMTrace.o(8391560790016L, 62522);
              return;
            }
          }
        };
        paramBundle.oTO.setOnClickListener((View.OnClickListener)localObject1);
        paramBundle = this.qku;
        localObject1 = this.gkL;
        localObject2 = new View.OnClickListener()
        {
          public final void onClick(final View paramAnonymousView)
          {
            GMTrace.i(8536650153984L, 63603);
            if (VideoAdPlayerUI.q(VideoAdPlayerUI.this) != 0) {
              j.a(j.a.poe, VideoAdPlayerUI.this.qkz, VideoAdPlayerUI.this.qky, VideoAdPlayerUI.r(VideoAdPlayerUI.this), VideoAdPlayerUI.q(VideoAdPlayerUI.this), VideoAdPlayerUI.s(VideoAdPlayerUI.this), VideoAdPlayerUI.t(VideoAdPlayerUI.this), VideoAdPlayerUI.u(VideoAdPlayerUI.this), VideoAdPlayerUI.v(VideoAdPlayerUI.this), VideoAdPlayerUI.w(VideoAdPlayerUI.this), VideoAdPlayerUI.x(VideoAdPlayerUI.this));
            }
            if (VideoAdPlayerUI.e(VideoAdPlayerUI.this) != 0)
            {
              int j = VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK.poI;
              int i = j;
              if (VideoAdPlayerUI.b(VideoAdPlayerUI.this))
              {
                i = j;
                if (VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK.poM != 0L) {
                  i = j + (int)(bg.aI(VideoAdPlayerUI.a(VideoAdPlayerUI.this).pnK.poM) / 1000L);
                }
              }
              paramAnonymousView = new com.tencent.mm.modelstat.h(13228, "1,1," + i + "," + VideoAdPlayerUI.f(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.g(VideoAdPlayerUI.this) + "," + bg.Pu() + "," + VideoAdPlayerUI.h(VideoAdPlayerUI.this) + "," + VideoAdPlayerUI.i(VideoAdPlayerUI.this), (int)bg.Pu());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
            }
            VideoAdPlayerUI.this.finish();
            paramAnonymousView = new Intent();
            Object localObject = new Bundle();
            ((Bundle)localObject).putString("key_snsad_statextstr", VideoAdPlayerUI.y(VideoAdPlayerUI.this));
            paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject);
            paramAnonymousView.putExtra("rawUrl", VideoAdPlayerUI.z(VideoAdPlayerUI.this));
            paramAnonymousView.putExtra("useJs", true);
            if (VideoAdPlayerUI.A(VideoAdPlayerUI.this))
            {
              localObject = new com.tencent.mm.plugin.sns.a.b.c(VideoAdPlayerUI.B(VideoAdPlayerUI.this), 18, 6, "", 2, VideoAdPlayerUI.C(VideoAdPlayerUI.this).blE());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
            }
            new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8573425811456L, 63877);
                com.tencent.mm.plugin.sns.c.a.hnH.j(paramAnonymousView, VideoAdPlayerUI.this);
                GMTrace.o(8573425811456L, 63877);
              }
            });
            GMTrace.o(8536650153984L, 63603);
          }
        };
        paramBundle.oTM = ((String)localObject1);
        paramBundle.oTL.setText((CharSequence)localObject1);
        paramBundle.oTL.setOnClickListener((View.OnClickListener)localObject2);
        this.qku.bgN();
        if (getIntent().getIntExtra("ShareBtnHidden", 0) != 0)
        {
          paramBundle = this.qku;
          if (paramBundle.oTO != null)
          {
            paramBundle.oTP = false;
            paramBundle.oTO.setVisibility(8);
          }
        }
        GMTrace.o(8605235412992L, 64114);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        w.e("MicroMsg.VideoPlayerUI", "error for download thumb");
        continue;
        this.qku.bgL();
        this.qku.hu(true);
        com.tencent.mm.plugin.sns.model.ae.biY().a(this.qkK, 6, null, an.vBh);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8605503848448L, 64116);
    super.onDestroy();
    getWindow().clearFlags(128);
    if (this.qkB != 0) {
      j.a(j.a.pog, this.qkz, this.qky, this.qkA, this.qkB, this.qkC, this.qkD, this.qkE, this.qkF, this.qkG, this.qkH);
    }
    if (this.poX) {
      if (this.pXt != null) {
        break label329;
      }
    }
    label329:
    for (int i = 0;; i = this.pXt.bml())
    {
      Object localObject = this.qfm.bhH();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.plugin.sns.a.b.d(this.hTy, 6, 2, this.qfm.pnE, null, null, 2, (String)localObject, -1, i), 0);
      if (this.qkM != 0)
      {
        int j = this.qfm.pnK.poI;
        i = j;
        if (this.jWb)
        {
          i = j;
          if (this.qfm.pnK.poM != 0L) {
            i = j + (int)(bg.aI(this.qfm.pnK.poM) / 1000L);
          }
        }
        localObject = new com.tencent.mm.modelstat.h(13228, "1,2," + i + "," + this.ssid + "," + this.bssid + "," + bg.Pu() + "," + this.qkL + "," + this.qkw, (int)bg.Pu());
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
      }
      GMTrace.o(8605503848448L, 64116);
      return;
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(8605638066176L, 64117);
    super.onPause();
    int i = getResources().getConfiguration().orientation;
    w.i("MicroMsg.VideoPlayerUI", "onpause  " + i);
    vw(i);
    if ((this.qku != null) && (this.qku.isPlaying())) {
      this.qku.pause();
    }
    if (this.qku != null)
    {
      w.i("MicroMsg.VideoPlayerUI", "onDetach");
      this.qku.onDetach();
    }
    com.tencent.mm.plugin.sns.model.ae.biY().pqT.remove(this);
    com.tencent.mm.plugin.sns.model.ae.biY().b(this);
    GMTrace.o(8605638066176L, 64117);
  }
  
  protected void onResume()
  {
    GMTrace.i(8605772283904L, 64118);
    super.onResume();
    com.tencent.mm.plugin.sns.model.ae.biY().pqT.add(this);
    com.tencent.mm.plugin.sns.model.ae.biY().a(this);
    GMTrace.o(8605772283904L, 64118);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\VideoAdPlayerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */