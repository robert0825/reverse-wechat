package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.bgp;
import com.tencent.mm.protocal.c.bhq;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aa
  implements z
{
  private String appId;
  private String appName;
  private String eTo;
  private String eTt;
  private String eTu;
  public final MMActivity ezR;
  public String gVf;
  public String gkO;
  public String gkP;
  private Bitmap gsp;
  private int h;
  private String hNz;
  private TextView hqi;
  private View jcL;
  private boolean mWE;
  private String pPI;
  private byte[] pPJ;
  private String pPK;
  private int pPL;
  private CdnImageView pPM;
  private TextView pPN;
  private com.tencent.mm.modelsns.b pPR;
  private int pRE;
  private boolean pTf;
  private String pTg;
  private String pTh;
  private boolean pTi;
  private boolean pTj;
  private boolean pTk;
  private boolean pTl;
  private WXMediaMessage pTm;
  private String pTn;
  private String pTo;
  private String pTp;
  private String pTq;
  private int pTr;
  private com.tencent.mm.modelsns.b pTs;
  private String pTt;
  private String pTu;
  private int pTv;
  private String pTw;
  private String pTx;
  public String pTy;
  private String title;
  private String videoUrl;
  private int w;
  
  public aa(MMActivity paramMMActivity)
  {
    GMTrace.i(8601074663424L, 64083);
    this.w = -1;
    this.h = -1;
    this.gVf = "";
    this.title = "";
    this.pPI = "";
    this.pPJ = null;
    this.pTf = false;
    this.gsp = null;
    this.jcL = null;
    this.pPM = null;
    this.hqi = null;
    this.pPN = null;
    this.mWE = false;
    this.pTi = false;
    this.pTj = false;
    this.pTk = false;
    this.pTl = false;
    this.pTm = null;
    this.pTn = "";
    this.videoUrl = "";
    this.pTo = "";
    this.pTr = 0;
    this.pPR = null;
    this.pTs = null;
    this.pRE = 0;
    this.pTt = "";
    this.pTu = "";
    this.pTv = 0;
    this.pTw = "";
    this.pTx = "";
    this.gkO = "";
    this.gkP = "";
    this.pTy = "";
    this.ezR = paramMMActivity;
    GMTrace.o(8601074663424L, 64083);
  }
  
  public final void G(Bundle paramBundle)
  {
    GMTrace.i(8601208881152L, 64084);
    this.pPR = com.tencent.mm.modelsns.b.q(this.ezR.getIntent());
    this.pRE = this.ezR.getIntent().getIntExtra("Ksnsupload_type", 0);
    this.pTv = this.ezR.getIntent().getIntExtra("KSnsStreamVideoTotalTime", 0);
    this.pTw = bg.aq(this.ezR.getIntent().getStringExtra("KSnsStreamVideoWroding"), "");
    this.pTx = bg.aq(this.ezR.getIntent().getStringExtra("KSnsStreamVideoWebUrl"), "");
    this.gkO = bg.aq(this.ezR.getIntent().getStringExtra("KSnsStreamVideoAduxInfo"), "");
    this.gkP = bg.aq(this.ezR.getIntent().getStringExtra("KSnsStreamVideoPublishId"), "");
    this.w = this.ezR.getIntent().getIntExtra("Ksnsupload_width", -1);
    this.h = this.ezR.getIntent().getIntExtra("Ksnsupload_height", -1);
    this.pPL = this.ezR.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.pTh = bg.aq(this.ezR.getIntent().getStringExtra("key_snsad_statextstr"), "");
    this.gVf = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_link"), "");
    this.title = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_title"), "");
    this.pPI = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
    this.pPJ = this.ezR.getIntent().getByteArrayExtra("Ksnsupload_imgbuf");
    if ((this.pPJ == null) && (this.pTm != null) && (this.pTm.mediaObject != null) && ((this.pTm.mediaObject instanceof WXImageObject))) {
      this.pPJ = ((WXImageObject)this.pTm.mediaObject).imageData;
    }
    this.mWE = this.ezR.getIntent().getBooleanExtra("ksnsis_video", false);
    this.pTi = this.ezR.getIntent().getBooleanExtra("ksnsis_music", false);
    this.pTj = this.ezR.getIntent().getBooleanExtra("ksnsis_appbrand", false);
    this.eTo = bg.aq(this.ezR.getIntent().getStringExtra("src_username"), "");
    this.pPK = bg.aq(this.ezR.getIntent().getStringExtra("src_displayname"), "");
    this.appId = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.pTk = this.ezR.getIntent().getBooleanExtra("KThrid_app", false);
    this.pTl = this.ezR.getIntent().getBooleanExtra("KSnsAction", false);
    this.pTp = bg.aq(this.ezR.getIntent().getStringExtra("ShareUrlOriginal"), "");
    this.pTq = bg.aq(this.ezR.getIntent().getStringExtra("ShareUrlOpen"), "");
    this.eTt = bg.aq(this.ezR.getIntent().getStringExtra("JsAppId"), "");
    this.eTu = bg.aq(this.ezR.getIntent().getStringExtra("KPublisherId"), "");
    this.hNz = bg.aq(this.ezR.getIntent().getStringExtra("reportSessionId"), "");
    this.pTr = this.ezR.getIntent().getIntExtra("Ksnsupload_contentattribute", 0);
    this.pTy = this.ezR.getIntent().getStringExtra("fav_note_xml");
    this.pTt = bg.aq(this.ezR.getIntent().getStringExtra("KsnsUpload_BrandUsername"), "");
    this.pTu = bg.aq(this.ezR.getIntent().getStringExtra("KsnsUpload_BrandPath"), "");
    this.pTg = bg.aq(this.ezR.getIntent().getStringExtra("KlinkThumb_url"), "");
    if ((this.pTg.startsWith("http://mmsns.qpic.cn")) || (this.pTg.startsWith("https://mmsns.qpic.cn")))
    {
      this.pPI = this.pTg;
      this.pPJ = null;
      w.i("MicroMsg.LinkWidget", "get thumb url %s", new Object[] { this.pTg });
    }
    paramBundle = this.ezR.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null)
    {
      this.pTm = new SendMessageToWX.Req(paramBundle).message;
      if (bg.nm(this.title)) {
        this.title = this.pTm.title;
      }
      if (bg.nm(this.pTo)) {
        this.pTo = this.pTm.description;
      }
      if (bg.bq(this.pPJ)) {
        this.pPJ = this.pTm.thumbData;
      }
    }
    paramBundle = this.ezR.getIntent().getStringExtra("KSnsStrId");
    Object localObject = bg.aq(this.ezR.getIntent().getStringExtra("KSnsLocalId"), "");
    localObject = ae.bjd().Is((String)localObject);
    if (!bg.nm(paramBundle))
    {
      this.pTs = com.tencent.mm.modelsns.b.ha(706);
      this.pTs.he(this.pTs.gVA).lv(System.currentTimeMillis()).he(this.pTs.gVC).he(1).lv(paramBundle);
      if (localObject != null)
      {
        this.pTs.hd(((com.tencent.mm.plugin.sns.storage.m)localObject).field_type);
        this.pTs.bC(((com.tencent.mm.plugin.sns.storage.m)localObject).uX(32)).lu(((com.tencent.mm.plugin.sns.storage.m)localObject).bmi()).lu(this.gVf);
      }
      com.tencent.mm.plugin.sns.h.f.pBV.a(this.pTs);
    }
    GMTrace.o(8601208881152L, 64084);
  }
  
  public final void H(Bundle paramBundle)
  {
    GMTrace.i(8601343098880L, 64085);
    GMTrace.o(8601343098880L, 64085);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, amc paramamc, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8601745752064L, 64088);
    aw localaw;
    if (this.pTi) {
      localaw = new aw(4);
    }
    label320:
    Object localObject;
    for (;;)
    {
      paramPInt.value = localaw.iZe;
      if (paramInt3 > a.poV) {
        localaw.uA(4);
      }
      if (this.pPJ == null)
      {
        com.tencent.mm.ao.n.IY();
        paramPInt = com.tencent.mm.ao.b.hC(this.pPI);
        if ((paramPInt != null) && (!paramPInt.isRecycled()))
        {
          paramPInt = d.a(paramPInt, 150, 150, false, false);
          w.i("MicroMsg.LinkWidget", "create bitmap %d %d", new Object[] { Integer.valueOf(paramPInt.getHeight()), Integer.valueOf(paramPInt.getWidth()) });
          this.pPJ = d.O(paramPInt);
        }
      }
      localaw.HN(this.title).HL(this.gVf).HM(this.gVf).HI(paramString1);
      if (this.pRE == 15) {
        localaw.HL(bg.aq(this.ezR.getIntent().getStringExtra("fav_note_link_description"), ""));
      }
      if (!this.pTi) {
        break;
      }
      if (!localaw.a(this.pPJ, this.gVf, this.gVf, this.gVf, 3, "", "")) {}
      localaw.uE(this.pPL);
      localaw.HQ(this.eTo);
      localaw.HR(this.pPK);
      paramString1 = this.pTh;
      localaw.pwJ.pTh = bg.nl(paramString1);
      w.i("MicroMsg.UploadPackHelper", "setStatExtStr:%s", new Object[] { paramString1 });
      if (!paramBoolean) {
        break label1128;
      }
      localaw.uF(1);
      localaw.bv(paramList2);
      paramString1 = new LinkedList();
      if (paramList1 == null) {
        break label1138;
      }
      new LinkedList();
      paramList2 = s.At();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        paramPInt = (String)paramList1.next();
        if (!paramList2.contains(paramPInt))
        {
          localObject = new bgp();
          ((bgp)localObject).jhi = paramPInt;
          paramString1.add(localObject);
        }
      }
      if (this.mWE)
      {
        localaw = new aw(5);
      }
      else if (this.pTj)
      {
        localaw = new aw(25);
        localObject = this.pTt;
        localaw.pwJ.uUi.username = ((String)localObject);
        localObject = this.pTu;
        localaw.pwJ.uUi.path = ((String)localObject);
      }
      else if (this.pRE == 11)
      {
        localaw = new aw(18);
        localObject = new bhq();
        ((bhq)localObject).gkL = this.pTw;
        ((bhq)localObject).gkK = this.title;
        ((bhq)localObject).gkI = this.gVf;
        ((bhq)localObject).gkM = this.pTx;
        ((bhq)localObject).gkJ = this.pTv;
        ((bhq)localObject).gkN = this.pPI;
        ((bhq)localObject).gkO = this.gkO;
        ((bhq)localObject).gkP = this.gkP;
        localaw.pwO = ((bhq)localObject);
        localaw.pwJ.uUh = ((bhq)localObject);
      }
      else if (this.pRE == 15)
      {
        localaw = new aw(26);
        localObject = this.pTy;
        localaw.pwJ.uUc.ueY = ((String)localObject);
      }
      else
      {
        localaw = new aw(3);
      }
    }
    if (this.mWE) {
      if (this.pTm == null) {
        break label1440;
      }
    }
    label729:
    label793:
    label1054:
    label1066:
    label1128:
    label1138:
    label1440:
    for (paramPInt = (WXVideoObject)this.pTm.mediaObject;; paramPInt = null)
    {
      localObject = this.pPJ;
      String str = this.gVf;
      if (paramPInt == null)
      {
        paramString1 = this.gVf;
        if (paramPInt != null) {
          break label793;
        }
      }
      for (paramPInt = this.gVf;; paramPInt = bg.aq(paramPInt.videoUrl, this.gVf))
      {
        localaw.a((byte[])localObject, str, paramString1, paramPInt, 4, bg.aq(this.title, ""), bg.aq(this.pTo, ""));
        break;
        paramString1 = bg.aq(paramPInt.videoLowBandUrl, this.gVf);
        break label729;
      }
      if (!bg.nm(this.pTg))
      {
        paramString1 = this.pTg;
        paramInt1 = this.w;
        paramInt2 = this.h;
        paramString1 = aw.V("", paramString1, paramString1);
        if (paramString1 == null)
        {
          w.e("MicroMsg.UploadPackHelper", "share img o.url is null!");
          break;
        }
        paramString1.lPj = "";
        if ((paramInt1 > 0) && (paramInt2 > 0))
        {
          paramPInt = new anw();
          paramPInt.uDF = paramInt2;
          paramPInt.uDE = paramInt1;
          paramString1.uCR = paramPInt;
        }
        if (!bg.nm("")) {
          paramString1.eBt = "";
        }
        if (!bg.nm("")) {
          paramString1.lPj = "";
        }
        localaw.pwJ.uUc.ueW.add(paramString1);
        break;
      }
      if (this.pPJ == null) {
        break;
      }
      if (this.pTj)
      {
        paramString1 = this.pPJ;
        if (paramString1 != null) {
          break label1054;
        }
      }
      for (paramInt2 = 0;; paramInt2 = 0)
      {
        if (paramInt2 != 0)
        {
          w.i("MicroMsg.LinkWidget", "isPngThumbData");
          paramString1 = f.aF(this.pPJ);
          if ((paramString1 != null) && (paramString1.length > 0))
          {
            w.i("MicroMsg.LinkWidget", "use covert data");
            this.pPJ = f.aF(paramString1);
          }
        }
        localaw.a(this.pPJ, "", "");
        break;
        if (paramString1.length >= 4) {
          break label1066;
        }
      }
      paramInt1 = 1;
      paramInt3 = 0;
      for (;;)
      {
        paramInt2 = paramInt1;
        if (paramInt3 >= 4) {
          break;
        }
        if (paramString1[paramInt3] != new byte[] { -119, 80, 78, 71 }[paramInt3]) {
          paramInt1 = 0;
        }
        paramInt3 += 1;
      }
      localaw.uF(0);
      break label320;
      if (parami != null) {
        localaw.dH(parami.token, parami.uDu);
      }
      localaw.ak(paramString1);
      if (!bg.nm(this.appId)) {
        localaw.HO(this.appId);
      }
      if (!bg.nm(this.appName)) {
        localaw.HP(bg.aq(this.appName, ""));
      }
      if (this.pTk) {
        localaw.uE(5);
      }
      localaw.a(paramamc);
      if ((this.pTl) && (this.pTm != null))
      {
        localaw.HJ(this.pTm.mediaTagName);
        localaw.U(this.appId, this.pTm.messageExt, this.pTm.messageAction);
      }
      localaw.HK(paramString2);
      localaw.d(this.pTp, this.pTq, this.eTt, paramInt4, paramInt5);
      parami = this.eTu;
      localaw.pwK.eTu = parami;
      localaw.oJ(this.hNz);
      paramInt1 = this.pTr;
      localaw.pwJ.giA = paramInt1;
      paramInt1 = localaw.commit();
      if (this.pPR != null)
      {
        this.pPR.hc(paramInt1);
        e.pBV.b(this.pPR);
      }
      if (this.pTs != null)
      {
        this.pTs.hc(paramInt1);
        com.tencent.mm.plugin.sns.h.f.pBV.b(this.pTs);
        this.pTs.LR();
      }
      ae.biZ().bhR();
      this.ezR.finish();
      GMTrace.o(8601745752064L, 64088);
      return false;
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8601879969792L, 64089);
    GMTrace.o(8601879969792L, 64089);
    return false;
  }
  
  public final boolean bmT()
  {
    GMTrace.i(8601477316608L, 64086);
    GMTrace.o(8601477316608L, 64086);
    return true;
  }
  
  public final View bmU()
  {
    GMTrace.i(8601611534336L, 64087);
    this.jcL = v.fb(this.ezR).inflate(i.g.pgK, null);
    if (!bg.nm(this.gVf)) {
      this.jcL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8386326298624L, 62483);
          if (!bg.nm(aa.this.pTy))
          {
            GMTrace.o(8386326298624L, 62483);
            return;
          }
          w.i("MicroMsg.LinkWidget", "adlink url " + aa.this.gVf);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", aa.this.gVf);
          a.hnH.j(paramAnonymousView, aa.this.ezR);
          GMTrace.o(8386326298624L, 62483);
        }
      });
    }
    this.pPM = ((CdnImageView)this.jcL.findViewById(i.f.paQ));
    this.hqi = ((TextView)this.jcL.findViewById(i.f.pep));
    this.pPN = ((TextView)this.jcL.findViewById(i.f.pbK));
    if ((this.mWE) || (this.pTi))
    {
      this.jcL.findViewById(i.f.state).setVisibility(0);
      if (bg.nm(this.title)) {
        break label226;
      }
      this.hqi.setText(this.title);
      label152:
      if (bg.nm(this.pPI)) {
        break label243;
      }
      this.pPM.setVisibility(0);
      this.pPM.setUrl(this.pPI);
    }
    for (;;)
    {
      com.tencent.mm.plugin.sns.data.i.b(this.pPM, this.ezR);
      View localView = this.jcL;
      GMTrace.o(8601611534336L, 64087);
      return localView;
      this.jcL.findViewById(i.f.state).setVisibility(8);
      break;
      label226:
      this.hqi.setText(av.Jp(this.gVf));
      break label152;
      label243:
      if (!bg.bq(this.pPJ))
      {
        this.pPM.setVisibility(0);
        this.gsp = d.bg(this.pPJ);
        this.pPM.setImageBitmap(this.gsp);
        this.pTf = true;
      }
      else if (!bg.nm(this.pTy))
      {
        this.pPM.setImageResource(i.i.phj);
        this.pPM.setVisibility(0);
      }
      else
      {
        this.pPM.setImageResource(i.i.cJr);
        this.pPM.setVisibility(0);
      }
    }
  }
  
  public final boolean bmV()
  {
    GMTrace.i(8602014187520L, 64090);
    if ((this.gsp != null) && (!this.gsp.isRecycled()) && (this.pTf)) {
      this.gsp.recycle();
    }
    GMTrace.o(8602014187520L, 64090);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */