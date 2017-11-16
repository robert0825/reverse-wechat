package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.bgp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class n
  implements z
{
  private String appId;
  private String appName;
  private String eMk;
  private String eTo;
  private MMActivity ezR;
  private String gVf;
  private Bitmap gsp;
  private int h;
  private TextView hqi;
  private View jcL;
  private boolean mWE;
  private String pPI;
  private byte[] pPJ;
  private String pPK;
  private int pPL;
  private CdnImageView pPM;
  private TextView pPN;
  private int pPO;
  private String pPP;
  private String pPQ;
  private com.tencent.mm.modelsns.b pPR;
  private String title;
  private int w;
  
  public n(MMActivity paramMMActivity)
  {
    GMTrace.i(8369549082624L, 62358);
    this.w = -1;
    this.h = -1;
    this.gVf = "";
    this.title = "";
    this.pPI = "";
    this.pPJ = null;
    this.gsp = null;
    this.jcL = null;
    this.pPM = null;
    this.hqi = null;
    this.pPN = null;
    this.mWE = false;
    this.pPP = "";
    this.pPQ = "";
    this.appName = "";
    this.appId = "";
    this.eMk = "";
    this.pPR = null;
    this.ezR = paramMMActivity;
    GMTrace.o(8369549082624L, 62358);
  }
  
  public final void G(Bundle paramBundle)
  {
    GMTrace.i(8369683300352L, 62359);
    this.pPR = com.tencent.mm.modelsns.b.q(this.ezR.getIntent());
    this.w = this.ezR.getIntent().getIntExtra("Ksnsupload_width", -1);
    this.h = this.ezR.getIntent().getIntExtra("Ksnsupload_height", -1);
    this.pPL = this.ezR.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.gVf = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_link"), "");
    this.title = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_title"), "");
    this.pPI = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
    this.eMk = this.ezR.getIntent().getStringExtra("KsnsUpload_imgPath");
    this.mWE = this.ezR.getIntent().getBooleanExtra("ksnsis_video", false);
    this.eTo = bg.aq(this.ezR.getIntent().getStringExtra("src_username"), "");
    this.pPK = bg.aq(this.ezR.getIntent().getStringExtra("src_displayname"), "");
    this.pPQ = bg.aq(this.ezR.getIntent().getStringExtra("KContentObjDesc"), "");
    this.pPP = bg.aq(this.ezR.getIntent().getStringExtra("KUploadProduct_UserData"), "");
    this.appName = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.appId = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.pPO = this.ezR.getIntent().getIntExtra("KUploadProduct_subType", 0);
    GMTrace.o(8369683300352L, 62359);
  }
  
  public final void H(Bundle paramBundle)
  {
    GMTrace.i(8369817518080L, 62360);
    GMTrace.o(8369817518080L, 62360);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, amc paramamc, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8370220171264L, 62363);
    paramString2 = new aw(17);
    paramPInt.value = paramString2.iZe;
    if (paramInt3 > a.poV) {
      paramString2.uA(2);
    }
    if (parami != null) {
      paramString2.dH(parami.token, parami.uDu);
    }
    paramString2.HN(this.title).HL(this.pPQ).HM(this.gVf).HI(paramString1);
    boolean bool2 = false;
    boolean bool1;
    if (!bg.nm(this.eMk))
    {
      bool1 = paramString2.a(FileOp.c(this.eMk, 0, -1), this.pPQ, this.title, this.pPO, this.pPP);
      bool2 = bool1;
      if (!bool1)
      {
        w.i("MicroMsg.EmojiDesignerShareWidget", "set userData user imgurl ");
        bool2 = paramString2.a(this.pPI, this.pPI, this.pPQ, this.pPO, this.pPP);
      }
      if (!bool2) {
        w.e("MicroMsg.EmojiDesignerShareWidget", "set userData faild");
      }
      paramString2.uE(this.pPL);
      paramString2.HQ(this.eTo);
      paramString2.HR(this.pPK);
      paramString2.d(null, null, null, paramInt4, paramInt5);
      if (!paramBoolean) {
        break label452;
      }
      paramString2.uF(1);
    }
    for (;;)
    {
      paramString2.bv(paramList2);
      if (!bg.nm(this.appId))
      {
        paramString2.HO(this.appId);
        paramString2.HP(this.appName);
      }
      parami = new LinkedList();
      if (paramList1 == null) {
        break label462;
      }
      new LinkedList();
      paramString1 = s.At();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        paramList2 = (String)paramList1.next();
        if (!paramString1.contains(paramList2))
        {
          paramPInt = new bgp();
          paramPInt.jhi = paramList2;
          parami.add(paramPInt);
        }
      }
      bool1 = bool2;
      if (bg.nm(this.pPI)) {
        break;
      }
      bool1 = bool2;
      if (com.tencent.mm.ao.n.IY() == null) {
        break;
      }
      com.tencent.mm.ao.n.IY();
      parami = com.tencent.mm.ao.b.hC(this.pPI);
      bool1 = bool2;
      if (parami == null) {
        break;
      }
      bool1 = paramString2.a(com.tencent.mm.sdk.platformtools.d.P(parami), this.pPQ, this.title, this.pPO, this.pPP);
      break;
      label452:
      paramString2.uF(0);
    }
    label462:
    paramString2.ak(parami);
    paramString2.a(paramamc);
    paramInt1 = paramString2.commit();
    if (this.pPR != null)
    {
      this.pPR.hc(paramInt1);
      e.pBV.b(this.pPR);
    }
    ae.biZ().bhR();
    this.ezR.finish();
    ((c)h.j(c.class)).getEmojiMgr().vW(this.pPP);
    ((c)h.j(c.class)).getEmojiMgr().vX(this.pPP);
    GMTrace.o(8370220171264L, 62363);
    return false;
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8370354388992L, 62364);
    GMTrace.o(8370354388992L, 62364);
    return false;
  }
  
  public final boolean bmT()
  {
    GMTrace.i(8369951735808L, 62361);
    GMTrace.o(8369951735808L, 62361);
    return true;
  }
  
  public final View bmU()
  {
    GMTrace.i(8370085953536L, 62362);
    this.jcL = v.fb(this.ezR).inflate(i.g.pgK, null);
    this.pPM = ((CdnImageView)this.jcL.findViewById(i.f.paQ));
    this.hqi = ((TextView)this.jcL.findViewById(i.f.pep));
    this.pPN = ((TextView)this.jcL.findViewById(i.f.pbK));
    if (this.mWE)
    {
      this.jcL.findViewById(i.f.state).setVisibility(0);
      this.hqi.setText(this.title);
      if (bg.nm(this.pPI)) {
        break label184;
      }
      this.pPM.setVisibility(0);
      this.pPM.setUrl(this.pPI);
    }
    for (;;)
    {
      com.tencent.mm.plugin.sns.data.i.b(this.pPM, this.ezR);
      View localView = this.jcL;
      GMTrace.o(8370085953536L, 62362);
      return localView;
      this.jcL.findViewById(i.f.state).setVisibility(8);
      break;
      label184:
      if (!bg.bq(this.pPJ))
      {
        this.pPM.setVisibility(0);
        this.gsp = com.tencent.mm.sdk.platformtools.d.bg(this.pPJ);
        this.pPM.setImageBitmap(this.gsp);
      }
      else
      {
        this.pPM.setVisibility(8);
      }
    }
  }
  
  public final boolean bmV()
  {
    GMTrace.i(8370488606720L, 62365);
    if ((this.gsp != null) && (!this.gsp.isRecycled())) {
      this.gsp.recycle();
    }
    GMTrace.o(8370488606720L, 62365);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */