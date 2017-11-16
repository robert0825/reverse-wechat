package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.bgp;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ac
  implements z
{
  private String appName;
  public String eSd;
  MMActivity ezR;
  private TextView hqi;
  private c ian;
  public boolean jWb;
  private View jcL;
  public String mediaId;
  private int pPL;
  private CdnImageView pPM;
  private TextView pPN;
  private com.tencent.mm.modelsns.b pPR;
  public ImageView pTY;
  private Bitmap pTZ;
  private boolean pTk;
  private boolean pTl;
  public WXMediaMessage pTm;
  
  public ac(MMActivity paramMMActivity)
  {
    GMTrace.i(8336665739264L, 62113);
    this.pTm = null;
    this.pPM = null;
    this.hqi = null;
    this.pPN = null;
    this.eSd = "";
    this.appName = "";
    this.pTk = false;
    this.pTl = false;
    this.jWb = false;
    this.pPR = null;
    this.ian = new c() {};
    this.ezR = paramMMActivity;
    com.tencent.mm.sdk.b.a.vgX.b(this.ian);
    GMTrace.o(8336665739264L, 62113);
  }
  
  public final void G(Bundle paramBundle)
  {
    GMTrace.i(8336799956992L, 62114);
    this.pTm = new SendMessageToWX.Req(this.ezR.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
    this.mediaId = this.ezR.getIntent().getStringExtra("Ksnsupload_musicid");
    this.pPR = com.tencent.mm.modelsns.b.q(this.ezR.getIntent());
    this.eSd = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.aq(this.ezR.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.pTk = this.ezR.getIntent().getBooleanExtra("KThrid_app", false);
    this.pTl = this.ezR.getIntent().getBooleanExtra("KSnsAction", false);
    this.pPL = this.ezR.getIntent().getIntExtra("Ksnsupload_source", 0);
    GMTrace.o(8336799956992L, 62114);
  }
  
  public final void H(Bundle paramBundle)
  {
    GMTrace.i(8336934174720L, 62115);
    GMTrace.o(8336934174720L, 62115);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, amc paramamc, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8337471045632L, 62119);
    com.tencent.mm.plugin.sns.model.ae.biZ();
    paramString1 = av.a(this.pTm, paramString1, this.eSd, this.appName);
    if (paramString1 == null)
    {
      w.e("MicroMsg.MusicWidget", "packHelper == null, %s, %s", new Object[] { this.eSd, this.appName });
      GMTrace.o(8337471045632L, 62119);
      return false;
    }
    paramPInt.value = paramString1.iZe;
    if (paramInt3 > com.tencent.mm.plugin.sns.c.a.poV) {
      paramString1.uA(4);
    }
    paramString1.uE(this.pPL);
    if (this.pTk) {
      paramString1.uE(5);
    }
    paramPInt = new LinkedList();
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
          paramPInt.add(localbgp);
        }
      }
    }
    paramString1.ak(paramPInt);
    if (parami != null) {
      paramString1.dH(parami.token, parami.uDu);
    }
    paramString1.a(paramamc);
    if (paramBoolean) {
      paramString1.uF(1);
    }
    for (;;)
    {
      paramString1.bv(paramList2);
      paramString1.d(null, null, null, paramInt4, paramInt5);
      if ((this.pTl) && (this.pTm != null))
      {
        paramString1.HJ(this.pTm.mediaTagName);
        paramString1.U(this.eSd, this.pTm.messageExt, this.pTm.messageAction);
      }
      paramInt1 = paramString1.commit();
      if (this.pPR != null)
      {
        this.pPR.hc(paramInt1);
        e.pBV.b(this.pPR);
      }
      com.tencent.mm.plugin.sns.model.ae.biZ().bhR();
      this.ezR.finish();
      GMTrace.o(8337471045632L, 62119);
      return false;
      paramString1.uF(0);
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8337605263360L, 62120);
    GMTrace.o(8337605263360L, 62120);
    return false;
  }
  
  public final boolean bmT()
  {
    GMTrace.i(8337068392448L, 62116);
    GMTrace.o(8337068392448L, 62116);
    return true;
  }
  
  public final View bmU()
  {
    GMTrace.i(8337336827904L, 62118);
    this.jcL = v.fb(this.ezR).inflate(i.g.pgL, null);
    this.pPM = ((CdnImageView)this.jcL.findViewById(i.f.paQ));
    this.hqi = ((TextView)this.jcL.findViewById(i.f.pep));
    this.pPN = ((TextView)this.jcL.findViewById(i.f.pbK));
    this.jcL.findViewById(i.f.state).setVisibility(8);
    this.hqi.setText(this.pTm.title);
    if (this.pTm.thumbData != null) {
      this.pTZ = d.bg(this.pTm.thumbData);
    }
    this.pPM.setImageBitmap(this.pTZ);
    if (!bg.nm(this.pTm.description))
    {
      this.pPN.setText(this.pTm.description);
      this.pPN.setVisibility(0);
      this.pTY = ((ImageView)this.jcL.findViewById(i.f.state));
      this.pTY.setVisibility(0);
      if ((!com.tencent.mm.at.b.JQ()) || (!this.jWb)) {
        break label279;
      }
      this.pTY.setImageResource(i.e.aYe);
    }
    for (;;)
    {
      this.pTY.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8710998982656L, 64902);
          if (com.tencent.mm.at.b.JQ())
          {
            ac.this.bnI();
            GMTrace.o(8710998982656L, 64902);
            return;
          }
          paramAnonymousView = ac.this;
          if (paramAnonymousView.pTm == null)
          {
            w.w("MicroMsg.MusicWidget", "doBeingPlayMusic: but item is null");
            GMTrace.o(8710998982656L, 64902);
            return;
          }
          new com.tencent.mm.sdk.platformtools.ae(paramAnonymousView.ezR.getMainLooper()).post(new ac.3(paramAnonymousView));
          GMTrace.o(8710998982656L, 64902);
        }
      });
      com.tencent.mm.plugin.sns.data.i.b(this.pPM, this.ezR);
      View localView = this.jcL;
      GMTrace.o(8337336827904L, 62118);
      return localView;
      this.pPN.setVisibility(8);
      break;
      label279:
      this.pTY.setImageResource(i.e.aYf);
    }
  }
  
  public final boolean bmV()
  {
    GMTrace.i(8337739481088L, 62121);
    if ((this.pTZ != null) && (!this.pTZ.isRecycled())) {
      this.pTZ.recycle();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.ian);
    if ((com.tencent.mm.at.b.JQ()) && (this.jWb)) {
      bnI();
    }
    boolean bool = com.tencent.mm.at.b.JQ();
    GMTrace.o(8337739481088L, 62121);
    return bool;
  }
  
  public final void bnI()
  {
    GMTrace.i(8337202610176L, 62117);
    new com.tencent.mm.sdk.platformtools.ae(this.ezR.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8736903004160L, 65095);
        com.tencent.mm.at.b.JO();
        ac.this.jWb = false;
        GMTrace.o(8736903004160L, 65095);
      }
    });
    GMTrace.o(8337202610176L, 62117);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */