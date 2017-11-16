package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pb;
import com.tencent.mm.g.a.pb.b;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.bgp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class al
  implements z
{
  private String desc;
  public String eDW;
  private boolean eEu;
  public String eIy;
  public MMActivity ezR;
  public ProgressDialog htG;
  private View jcL;
  public ProgressBar jeL;
  private int pPL;
  private com.tencent.mm.modelsns.b pPR;
  private boolean pUc;
  private Bitmap pUd;
  private com.tencent.mm.sdk.b.c pUf;
  aw pUg;
  public com.tencent.mm.plugin.sight.decode.a.a pWG;
  public com.tencent.mm.plugin.sight.decode.ui.c pWH;
  public String videoPath;
  
  public al(MMActivity paramMMActivity)
  {
    GMTrace.i(8590337245184L, 64003);
    this.jcL = null;
    this.eIy = "";
    this.videoPath = "";
    this.eDW = "";
    this.eEu = false;
    this.pUc = false;
    this.pUd = null;
    this.pWH = null;
    this.pPR = null;
    this.pUf = new com.tencent.mm.sdk.b.c() {};
    this.pUg = null;
    this.desc = "";
    this.htG = null;
    this.ezR = paramMMActivity;
    GMTrace.o(8590337245184L, 64003);
  }
  
  public final void G(Bundle paramBundle)
  {
    GMTrace.i(8590471462912L, 64004);
    this.pPR = com.tencent.mm.modelsns.b.q(this.ezR.getIntent());
    this.eIy = this.ezR.getIntent().getStringExtra("KSightThumbPath");
    this.videoPath = this.ezR.getIntent().getStringExtra("KSightPath");
    this.eDW = this.ezR.getIntent().getStringExtra("sight_md5");
    this.pPL = this.ezR.getIntent().getIntExtra("Ksnsupload_source", 0);
    paramBundle = new pb();
    paramBundle.eTW.type = 2;
    com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
    if (bg.nm(this.videoPath))
    {
      this.videoPath = bg.aq(paramBundle.eTX.eUb, "");
      w.e("MicroMsg.SightWidget", "videoPath is null %s", new Object[] { this.videoPath });
    }
    if (bg.nm(this.eDW)) {}
    for (paramBundle = bg.aq(paramBundle.eTX.eTZ, "");; paramBundle = this.eDW)
    {
      this.eDW = paramBundle;
      w.i("MicroMsg.SightWidget", "oncreate thumb path %s videopath %s md5 %s", new Object[] { this.eIy, this.videoPath, this.eDW });
      com.tencent.mm.sdk.b.a.vgX.b(this.pUf);
      GMTrace.o(8590471462912L, 64004);
      return;
    }
  }
  
  public final void H(Bundle paramBundle)
  {
    GMTrace.i(8590605680640L, 64005);
    GMTrace.o(8590605680640L, 64005);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, amc paramamc, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8591008333824L, 64008);
    if (this.pUg != null)
    {
      GMTrace.o(8591008333824L, 64008);
      return false;
    }
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
      this.pUg.d(null, null, null, paramInt4, paramInt5);
      if (!FileOp.aZ(this.videoPath)) {
        break;
      }
      bnJ();
      GMTrace.o(8591008333824L, 64008);
      return true;
      this.pUg.uF(0);
    }
    w.i("MicroMsg.SightWidget", "commit file is not exist " + this.videoPath);
    parami = this.ezR;
    this.ezR.getString(i.j.cUG);
    this.htG = h.a(parami, this.ezR.getString(i.j.pkC), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(8570070368256L, 63852);
        al.this.pUg = null;
        GMTrace.o(8570070368256L, 63852);
      }
    });
    GMTrace.o(8591008333824L, 64008);
    return true;
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8591276769280L, 64010);
    GMTrace.o(8591276769280L, 64010);
    return false;
  }
  
  public final boolean bmT()
  {
    GMTrace.i(8590739898368L, 64006);
    GMTrace.o(8590739898368L, 64006);
    return true;
  }
  
  public final View bmU()
  {
    GMTrace.i(8590874116096L, 64007);
    this.jcL = View.inflate(this.ezR, i.g.pgN, null);
    this.pWG = ((com.tencent.mm.plugin.sight.decode.a.a)this.jcL.findViewById(i.f.image));
    this.pWG.tW(com.tencent.mm.br.a.fromDPToPix(this.ezR, 90));
    this.jeL = ((ProgressBar)this.jcL.findViewById(i.f.bKy));
    Object localObject = new DisplayMetrics();
    this.ezR.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.jcL.findViewById(i.f.bne).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8324586143744L, 62023);
        if (!FileOp.aZ(al.this.videoPath))
        {
          w.i("MicroMsg.SightWidget", "click videopath is not exist " + al.this.videoPath);
          GMTrace.o(8324586143744L, 62023);
          return;
        }
        if (al.this.pWH != null)
        {
          al.this.pWH.dismiss();
          al.this.pWH = null;
        }
        al.this.pWH = new com.tencent.mm.plugin.sight.decode.ui.c(al.this.ezR);
        paramAnonymousView = al.this.pWH;
        String str1 = al.this.videoPath;
        String str2 = al.this.eIy;
        paramAnonymousView.gKE = str1;
        paramAnonymousView.imagePath = str2;
        paramAnonymousView = al.this.pWH;
        paramAnonymousView.eWr = 0;
        paramAnonymousView.oSE = 0;
        paramAnonymousView.led = 1;
        al.this.pWH.show();
        GMTrace.o(8324586143744L, 62023);
      }
    });
    w.i("MicroMsg.SightWidget", "videoPath " + this.videoPath + " thumbPath " + this.eIy + " " + FileOp.kX(this.videoPath) + " " + FileOp.kX(this.eIy));
    if (FileOp.aZ(this.videoPath))
    {
      this.pWG.ar(this.videoPath, false);
      this.jeL.setVisibility(8);
      w.i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", new Object[] { this.videoPath, this.eDW });
    }
    for (;;)
    {
      localObject = this.jcL;
      GMTrace.o(8590874116096L, 64007);
      return (View)localObject;
      localObject = com.tencent.mm.plugin.sns.data.i.GV(this.eIy);
      if (localObject != null)
      {
        this.pUd = ((n)localObject).yp();
        if (com.tencent.mm.plugin.sns.data.i.m(this.pUd)) {
          this.pWG.D(this.pUd);
        }
      }
      this.jeL.setVisibility(0);
    }
  }
  
  public final boolean bmV()
  {
    GMTrace.i(8591410987008L, 64011);
    if (this.htG != null) {
      this.htG.dismiss();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.pUf);
    if (com.tencent.mm.plugin.sns.data.i.m(this.pUd)) {
      this.pUd.recycle();
    }
    GMTrace.o(8591410987008L, 64011);
    return false;
  }
  
  public final void bnJ()
  {
    GMTrace.i(8591142551552L, 64009);
    if (this.pUc)
    {
      GMTrace.o(8591142551552L, 64009);
      return;
    }
    if (!this.pUg.j(this.videoPath, this.eIy, this.desc, this.eDW))
    {
      w.i("MicroMsg.SightWidget", "videopath " + FileOp.kX(this.videoPath) + " thumb: " + FileOp.kX(this.eIy));
      u.makeText(this.ezR, i.j.dXF, 0).show();
      GMTrace.o(8591142551552L, 64009);
      return;
    }
    Object localObject = new pb();
    ((pb)localObject).eTW.type = 0;
    ((pb)localObject).eTW.eTY = true;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    this.pUc = true;
    int i = this.pUg.commit();
    if (this.pPR != null)
    {
      this.pPR.hc(i);
      e.pBV.b(this.pPR);
    }
    ae.bjk().pWd = 0L;
    localObject = new Intent();
    ((Intent)localObject).putExtra("sns_resume_state", false);
    ((Intent)localObject).putExtra("sns_timeline_NeedFirstLoadint", true);
    ((Intent)localObject).setClass(this.ezR, En_424b8e16.class);
    ((Intent)localObject).addFlags(67108864);
    this.ezR.startActivity((Intent)localObject);
    this.ezR.setResult(-1);
    this.ezR.finish();
    GMTrace.o(8591142551552L, 64009);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */