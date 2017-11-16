package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.c.a;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.protocal.c.qp;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class EmojiStoreV2SingleProductDialogUI
  extends MMBaseActivity
{
  private String aBm;
  public String fKP;
  private int gRb;
  private com.tencent.mm.ui.base.i hiJ;
  private long kkB;
  private c.a kki;
  private qp ktJ;
  private EmojiInfo ktK;
  private View ktL;
  private ProgressBar ktM;
  private MMAnimateView ktN;
  private ImageView ktO;
  private Button ktP;
  private Button ktQ;
  private DialogInterface.OnClickListener ktR;
  private DialogInterface.OnClickListener ktS;
  private View.OnClickListener ktT;
  private com.tencent.mm.ao.a.c.i ktU;
  private com.tencent.mm.sdk.b.c ktV;
  private ae mHandler;
  
  public EmojiStoreV2SingleProductDialogUI()
  {
    GMTrace.i(11469441728512L, 85454);
    this.ktJ = new qp();
    this.mHandler = new ae();
    this.ktR = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11469039075328L, 85451);
        EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this, EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this));
        com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
        paramAnonymousInt = EmojiStoreV2SingleProductDialogUI.b(EmojiStoreV2SingleProductDialogUI.this);
        if (EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this) == null) {}
        for (paramAnonymousDialogInterface = "";; paramAnonymousDialogInterface = EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this).ugy)
        {
          localg.i(12787, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), paramAnonymousDialogInterface, Long.valueOf(EmojiStoreV2SingleProductDialogUI.c(EmojiStoreV2SingleProductDialogUI.this)) });
          GMTrace.o(11469039075328L, 85451);
          return;
        }
      }
    };
    this.ktS = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11531181883392L, 85914);
        EmojiStoreV2SingleProductDialogUI.b(EmojiStoreV2SingleProductDialogUI.this, EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this));
        com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
        paramAnonymousInt = EmojiStoreV2SingleProductDialogUI.b(EmojiStoreV2SingleProductDialogUI.this);
        if (EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this) == null) {}
        for (paramAnonymousDialogInterface = "";; paramAnonymousDialogInterface = EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this).ugy)
        {
          localg.i(12787, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), paramAnonymousDialogInterface, Long.valueOf(EmojiStoreV2SingleProductDialogUI.c(EmojiStoreV2SingleProductDialogUI.this)) });
          GMTrace.o(11531181883392L, 85914);
          return;
        }
      }
    };
    this.ktT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11496822145024L, 85658);
        EmojiStoreV2SingleProductDialogUI.this.setResult(0);
        EmojiStoreV2SingleProductDialogUI.this.finish();
        EmojiStoreV2SingleProductDialogUI.this.overridePendingTransition(R.a.aLC, R.a.aLD);
        GMTrace.o(11496822145024L, 85658);
      }
    };
    this.ktU = new com.tencent.mm.ao.a.c.i()
    {
      public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(11512525619200L, 85775);
        if ((paramAnonymousBitmap != null) && (paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.length > 0) && (EmojiStoreV2SingleProductDialogUI.d(EmojiStoreV2SingleProductDialogUI.this) != null) && (paramAnonymousVarArgs[0] != null) && ((paramAnonymousVarArgs[0] instanceof qp)))
        {
          paramAnonymousString = (qp)paramAnonymousVarArgs[0];
          if ((EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this) != null) && (paramAnonymousString != null) && (paramAnonymousString.ugy.equals(EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this).ugy))) {
            EmojiStoreV2SingleProductDialogUI.e(EmojiStoreV2SingleProductDialogUI.this);
          }
        }
        GMTrace.o(11512525619200L, 85775);
      }
    };
    this.ktV = new com.tencent.mm.sdk.b.c() {};
    this.kki = new c.a()
    {
      public final void h(EmojiInfo paramAnonymousEmojiInfo)
      {
        GMTrace.i(11508096434176L, 85742);
        if ((paramAnonymousEmojiInfo != null) && (EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this) != null) && (EmojiStoreV2SingleProductDialogUI.a(EmojiStoreV2SingleProductDialogUI.this).ugy.equals(paramAnonymousEmojiInfo.GS())))
        {
          EmojiStoreV2SingleProductDialogUI.e(EmojiStoreV2SingleProductDialogUI.this);
          GMTrace.o(11508096434176L, 85742);
          return;
        }
        w.i("MicroMsg.emoji.EmojiStoreV2SingleProductDialogUI", "somethings error.");
        GMTrace.o(11508096434176L, 85742);
      }
    };
    GMTrace.o(11469441728512L, 85454);
  }
  
  private void a(String paramString, qp paramqp)
  {
    GMTrace.i(11470112817152L, 85459);
    if ((bg.nm(paramString)) || (paramqp == null))
    {
      w.i("MicroMsg.emoji.EmojiStoreV2SingleProductDialogUI", "username or emoji is null.");
      GMTrace.o(11470112817152L, 85459);
      return;
    }
    Object localObject = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(paramqp.ugy);
    int i;
    if (localObject == null)
    {
      at.AR();
      String str = EmojiLogic.G(com.tencent.mm.y.c.zb(), paramqp.tRS, paramqp.ugy);
      if (e.aZ(str))
      {
        if (!o.RH(str)) {
          break label221;
        }
        i = EmojiInfo.vCw;
        localObject = com.tencent.mm.plugin.emoji.model.h.arl().kjy.b(paramqp.ugy, "", EmojiInfo.vCo, i, e.aY(str), "");
        ((EmojiInfo)localObject).field_designerID = paramqp.ugz;
        ((EmojiInfo)localObject).field_thumbUrl = paramqp.nFH;
      }
    }
    for (paramqp = (qp)localObject;; paramqp = (qp)localObject)
    {
      paramString = bg.g(bg.aq(paramString, "").split(",")).iterator();
      while (paramString.hasNext())
      {
        localObject = (String)paramString.next();
        if (paramqp != null)
        {
          com.tencent.mm.plugin.emoji.model.h.arh().a((String)localObject, paramqp, null);
          setResult(-1);
          finish();
          overridePendingTransition(R.a.aLC, R.a.aLD);
        }
      }
      label221:
      i = EmojiInfo.vCv;
      break;
      ((EmojiInfo)localObject).field_designerID = paramqp.ugz;
      ((EmojiInfo)localObject).field_thumbUrl = paramqp.nFH;
    }
    GMTrace.o(11470112817152L, 85459);
  }
  
  private void asS()
  {
    GMTrace.i(11469978599424L, 85458);
    this.ktK = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(this.ktJ.ugy);
    if ((this.ktK != null) && (this.ktK.field_catalog == EmojiGroupInfo.vCn) && (bg.nm(this.ktK.field_groupId)))
    {
      this.ktQ.setEnabled(false);
      this.ktQ.setText(R.l.cRL);
      this.ktQ.setTextColor(getResources().getColor(R.e.aNS));
      GMTrace.o(11469978599424L, 85458);
      return;
    }
    if (e.aZ(this.aBm))
    {
      this.ktQ.setEnabled(true);
      this.ktQ.setText(R.l.dov);
      this.ktQ.setTextColor(getResources().getColor(R.e.aNQ));
      GMTrace.o(11469978599424L, 85458);
      return;
    }
    this.ktQ.setEnabled(false);
    this.ktQ.setEnabled(false);
    this.ktQ.setText(R.l.dov);
    this.ktQ.setTextColor(getResources().getColor(R.e.aNS));
    GMTrace.o(11469978599424L, 85458);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11469844381696L, 85457);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 9001) && (paramInt2 == -1))
    {
      String str = paramIntent.getStringExtra("Select_Conv_User");
      if ((!bg.nm(str)) && (this.ktJ != null))
      {
        w.d("MicroMsg.emoji.EmojiStoreV2SingleProductDialogUI", "UserName:%s ,MD5:%s", new Object[] { str, this.ktJ.ugy });
        a(str, this.ktJ);
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        com.tencent.mm.plugin.messenger.a.d.aOe().cR(paramIntent, str);
      }
    }
    GMTrace.o(11469844381696L, 85457);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11469575946240L, 85455);
    super.onCreate(paramBundle);
    setContentView(R.i.bbj);
    this.gRb = getIntent().getIntExtra("scene", 0);
    this.kkB = getIntent().getLongExtra("searchID", 0L);
    this.fKP = getIntent().getStringExtra("Select_Conv_User");
    paramBundle = getIntent().getByteArrayExtra("extra_object");
    if (paramBundle != null) {}
    for (;;)
    {
      try
      {
        this.ktJ = ((qp)this.ktJ.aD(paramBundle));
        if (this.ktJ != null)
        {
          this.ktK = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(this.ktJ.ugy);
          if ((this.ktK != null) && (!bg.nm(this.ktK.field_groupId)) && (bg.nm(this.ktJ.tRS))) {
            this.ktJ.tRS = this.ktK.field_groupId;
          }
        }
        com.tencent.mm.sdk.b.a.vgX.b(this.ktV);
        com.tencent.mm.plugin.emoji.model.h.arf().kki = this.kki;
        this.ktL = v.fb(this).inflate(R.i.cuY, null);
        this.ktM = ((ProgressBar)this.ktL.findViewById(R.h.but));
        this.ktN = ((MMAnimateView)this.ktL.findViewById(R.h.bur));
        this.ktO = ((ImageView)this.ktL.findViewById(R.h.buo));
        this.ktO.setOnClickListener(this.ktT);
        paramBundle = this.ktL;
        if ((!(this instanceof Activity)) || (!((Activity)this).isFinishing())) {
          break label561;
        }
        paramBundle = null;
        this.hiJ = paramBundle;
        this.hiJ.a(getString(R.l.cUs), false, this.ktR);
        this.hiJ.b(getString(R.l.cRL), false, this.ktS);
        this.hiJ.setOnDismissListener(new DialogInterface.OnDismissListener()
        {
          public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(11509572829184L, 85753);
            EmojiStoreV2SingleProductDialogUI.this.setResult(0);
            EmojiStoreV2SingleProductDialogUI.this.finish();
            GMTrace.o(11509572829184L, 85753);
          }
        });
        this.ktP = this.hiJ.getButton(-1);
        this.ktP.setTextColor(getResources().getColor(R.e.aNQ));
        this.ktQ = this.hiJ.getButton(-2);
        at.AR();
        this.aBm = EmojiLogic.G(com.tencent.mm.y.c.zb(), this.ktJ.tRS, this.ktJ.ugy);
        if (e.aY(this.aBm) <= 0) {
          break;
        }
        this.ktN.setVisibility(0);
        this.ktM.setVisibility(8);
        this.ktK = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(this.ktJ.ugy);
        if ((this.ktK == null) || ((this.ktK.field_reserved4 & EmojiInfo.vCJ) != EmojiInfo.vCJ)) {
          break label606;
        }
        this.ktN.h(((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(this.ktK), "");
        asS();
        GMTrace.o(11469575946240L, 85455);
        return;
      }
      catch (IOException paramBundle)
      {
        w.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2SingleProductDialogUI", paramBundle, "", new Object[0]);
      }
      setResult(0);
      finish();
      continue;
      label561:
      localObject = new i.a(this);
      ((i.a)localObject).Vz("");
      ((i.a)localObject).dg(paramBundle);
      ((i.a)localObject).lz(true);
      paramBundle = ((i.a)localObject).aax();
      paramBundle.show();
      com.tencent.mm.ui.base.h.a(this, paramBundle);
      continue;
      label606:
      this.ktN.cz(this.aBm, null);
    }
    this.ktN.setVisibility(8);
    this.ktM.setVisibility(0);
    this.ktQ.setText(R.l.dov);
    this.ktP.setText(R.l.cUs);
    this.ktQ.setEnabled(false);
    this.ktQ.setTextColor(getResources().getColor(R.e.aNS));
    this.ktP.setEnabled(false);
    this.ktP.setTextColor(getResources().getColor(R.e.aNS));
    paramBundle = com.tencent.mm.plugin.emoji.model.h.aqJ();
    Object localObject = this.ktJ.lPM;
    String str = this.ktJ.lPM;
    paramBundle.a((String)localObject, null, f.g(this.aBm, new Object[] { this.ktJ }), this.ktU);
    GMTrace.o(11469575946240L, 85455);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11470247034880L, 85460);
    com.tencent.mm.sdk.b.a.vgX.c(this.ktV);
    com.tencent.mm.plugin.emoji.model.h.arf().kki = null;
    super.onDestroy();
    GMTrace.o(11470247034880L, 85460);
  }
  
  protected void onResume()
  {
    GMTrace.i(11469710163968L, 85456);
    super.onResume();
    asS();
    GMTrace.o(11469710163968L, 85456);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2SingleProductDialogUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */