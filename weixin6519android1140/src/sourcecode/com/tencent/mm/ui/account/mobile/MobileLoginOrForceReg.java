package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.modelsimple.x;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.j.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.RegByMobileRegAIOUI;
import com.tencent.mm.ui.account.RegByMobileSetPwdUI;
import com.tencent.mm.ui.account.RegSetInfoUI;
import com.tencent.mm.ui.account.f;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bj;
import java.io.File;

public class MobileLoginOrForceReg
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private String eCQ;
  private String eEU;
  private String eMW;
  private String eVw;
  private int gUV;
  private ae handler;
  private ImageView hqG;
  protected ProgressDialog htG;
  private String ied;
  private TextView jpV;
  private String llm;
  private String username;
  private String vLR;
  private SecurityImage vMf;
  private c vPG;
  private String vQG;
  private f vQl;
  private com.tencent.mm.pluginsdk.i.a vQt;
  private a vSw;
  private int vTA;
  private Button vVW;
  private Button vVX;
  private LinearLayout vVY;
  private LinearLayout vVZ;
  private TextView vWa;
  private int vWb;
  private boolean vWc;
  private boolean vWd;
  private String vWe;
  private String vWf;
  
  public MobileLoginOrForceReg()
  {
    GMTrace.i(2615903518720L, 19490);
    this.htG = null;
    this.vSw = null;
    this.vWc = true;
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2603958140928L, 19401);
        if (paramAnonymousMessage.obj != null)
        {
          paramAnonymousMessage = (Bitmap)paramAnonymousMessage.obj;
          MobileLoginOrForceReg.a(MobileLoginOrForceReg.this).setImageBitmap(paramAnonymousMessage);
        }
        GMTrace.o(2603958140928L, 19401);
      }
    };
    this.vMf = null;
    this.vPG = new c() {};
    this.vQl = null;
    GMTrace.o(2615903518720L, 19490);
  }
  
  private void goBack()
  {
    GMTrace.i(2616843042816L, 19497);
    com.tencent.mm.plugin.c.b.nz("R200_100");
    if (bj.BC().BD() > 0) {}
    for (Intent localIntent = new Intent(this, RegByMobileRegAIOUI.class);; localIntent = new Intent(this, MobileInputUI.class))
    {
      localIntent.putExtra("mobile_input_purpose", 2);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
      com.tencent.mm.plugin.c.b.ny(this.vLR);
      com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",R200_600," + at.eK("R200_600") + ",2");
      finish();
      GMTrace.o(2616843042816L, 19497);
      return;
    }
  }
  
  public final void MP()
  {
    GMTrace.i(2616171954176L, 19492);
    this.vVW = ((Button)findViewById(R.h.brY));
    this.vVX = ((Button)findViewById(R.h.bBc));
    this.vVY = ((LinearLayout)findViewById(R.h.bFM));
    this.vVZ = ((LinearLayout)findViewById(R.h.bQY));
    this.hqG = ((ImageView)findViewById(R.h.bfq));
    this.jpV = ((TextView)findViewById(R.h.bQX));
    this.vWa = ((TextView)findViewById(R.h.bha));
    new an();
    final Object localObject;
    if (this.eMW.startsWith("+"))
    {
      localObject = an.AL(this.eMW);
      if (!bg.nm((String)localObject))
      {
        String str = this.eMW.substring(((String)localObject).length() + 1);
        localObject = "+" + (String)localObject + " " + an.formatNumber((String)localObject, str);
      }
    }
    for (;;)
    {
      this.vWa.setText((CharSequence)localObject);
      if ((!bg.nm(this.eCQ)) || (!bg.nm(this.ied))) {
        break;
      }
      this.vVZ.setVisibility(0);
      this.vVY.setVisibility(8);
      this.vVW.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2620198486016L, 19522);
          MobileLoginOrForceReg.a(MobileLoginOrForceReg.this, new a(new a.a()
          {
            public final void b(ProgressDialog paramAnonymous2ProgressDialog)
            {
              GMTrace.i(2611742769152L, 19459);
              MobileLoginOrForceReg.this.htG = paramAnonymous2ProgressDialog;
              GMTrace.o(2611742769152L, 19459);
            }
          }, MobileLoginOrForceReg.c(MobileLoginOrForceReg.this), MobileLoginOrForceReg.d(MobileLoginOrForceReg.this), MobileLoginOrForceReg.e(MobileLoginOrForceReg.this)));
          MobileLoginOrForceReg.f(MobileLoginOrForceReg.this).i(MobileLoginOrForceReg.this);
          GMTrace.o(2620198486016L, 19522);
        }
      });
      this.vVX.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2607045148672L, 19424);
          if (bg.nm(MobileLoginOrForceReg.g(MobileLoginOrForceReg.this)))
          {
            paramAnonymousView = new Intent();
            com.tencent.mm.plugin.c.b.nz("R200_900_phone");
            paramAnonymousView.putExtra("regsetinfo_ticket", MobileLoginOrForceReg.h(MobileLoginOrForceReg.this));
            paramAnonymousView.putExtra("regsetinfo_user", MobileLoginOrForceReg.e(MobileLoginOrForceReg.this));
            paramAnonymousView.putExtra("regsetinfo_ismobile", 1);
            paramAnonymousView.putExtra("regsetinfo_isForce", true);
            paramAnonymousView.putExtra("regsession_id", MobileLoginOrForceReg.i(MobileLoginOrForceReg.this));
            paramAnonymousView.putExtra("regsetinfo_NextControl", MobileLoginOrForceReg.j(MobileLoginOrForceReg.this));
            paramAnonymousView.putExtra("mobile_check_type", MobileLoginOrForceReg.k(MobileLoginOrForceReg.this));
            paramAnonymousView.setClass(MobileLoginOrForceReg.this, RegSetInfoUI.class);
            MobileLoginOrForceReg.this.startActivity(paramAnonymousView);
            GMTrace.o(2607045148672L, 19424);
            return;
          }
          MobileLoginOrForceReg.l(MobileLoginOrForceReg.this);
          GMTrace.o(2607045148672L, 19424);
        }
      });
      oM(R.l.dIR);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2587583578112L, 19279);
          MobileLoginOrForceReg.m(MobileLoginOrForceReg.this);
          GMTrace.o(2587583578112L, 19279);
          return false;
        }
      });
      GMTrace.o(2616171954176L, 19492);
      return;
      localObject = this.eMW;
      continue;
      localObject = "+86 " + an.formatNumber("86", this.eMW);
    }
    this.vVZ.setVisibility(8);
    this.vVY.setVisibility(0);
    if (bg.nm(this.eCQ)) {
      this.jpV.setVisibility(8);
    }
    for (;;)
    {
      localObject = a.b.bKI().oT();
      if (localObject != null) {
        this.hqG.setImageBitmap((Bitmap)localObject);
      }
      if (bg.nm(this.ied)) {
        break;
      }
      localObject = this.ied;
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2592012763136L, 19312);
          Object localObject = null;
          try
          {
            Bitmap localBitmap = d.decodeStream(com.tencent.mm.network.b.k(localObject, 10000, 20000));
            localObject = localBitmap;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicorMsg.MobileLoginOrForceReg", "download avatar failed");
              com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicorMsg.MobileLoginOrForceReg", localException, "", new Object[0]);
            }
          }
          MobileLoginOrForceReg.b(MobileLoginOrForceReg.this).sendMessage(MobileLoginOrForceReg.b(MobileLoginOrForceReg.this).obtainMessage(0, localObject));
          GMTrace.o(2592012763136L, 19312);
        }
        
        public final String toString()
        {
          GMTrace.i(2592146980864L, 19313);
          String str = super.toString() + "|loadBitmap";
          GMTrace.o(2592146980864L, 19313);
          return str;
        }
      });
      break;
      this.jpV.setText(this.eCQ);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, final k paramk)
  {
    GMTrace.i(2617111478272L, 19499);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (this.vQl == null) {
      this.vQl = new f();
    }
    boolean bool;
    if (paramk.getType() == 255)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        bool = this.vWc;
        paramString = new Intent(this, RegByMobileSetPwdUI.class);
        paramString.putExtra("kintent_hint", getString(R.l.dZu));
        paramString.putExtra("kintent_cancelable", bool);
        startActivityForResult(paramString, 0);
      }
      GMTrace.o(2617111478272L, 19499);
      return;
    }
    if ((paramk.getType() == 701) && (this.vSw != null))
    {
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        this.vQl.gUy = this.username;
        this.vQl.vQZ = this.vWf;
        this.vQl.vRa = ((u)paramk).HQ();
        this.vQl.vRc = ((u)paramk).HP();
        this.vQl.vRb = ((u)paramk).Lw();
        this.vQl.vRd = ((u)paramk).Lv();
        if (this.vMf == null)
        {
          this.vMf = SecurityImage.a.a(this, R.l.dRU, this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb, new DialogInterface.OnClickListener()
          {
            public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2601408004096L, 19382);
              com.tencent.mm.sdk.platformtools.w.d("MicorMsg.MobileLoginOrForceReg", "imgSid:" + MobileLoginOrForceReg.n(MobileLoginOrForceReg.this).vRa + " img len" + MobileLoginOrForceReg.n(MobileLoginOrForceReg.this).vRc.length + " " + g.tC());
              paramAnonymousDialogInterface = new u(MobileLoginOrForceReg.n(MobileLoginOrForceReg.this).gUy, MobileLoginOrForceReg.n(MobileLoginOrForceReg.this).vQZ, MobileLoginOrForceReg.n(MobileLoginOrForceReg.this).vRd, MobileLoginOrForceReg.o(MobileLoginOrForceReg.this).bZo(), MobileLoginOrForceReg.o(MobileLoginOrForceReg.this).vRa, MobileLoginOrForceReg.o(MobileLoginOrForceReg.this).vRb, 1, "", false, true);
              at.wS().a(paramAnonymousDialogInterface, 0);
              MobileLoginOrForceReg localMobileLoginOrForceReg = MobileLoginOrForceReg.this;
              MobileLoginOrForceReg.this.getString(R.l.cUG);
              h.a(localMobileLoginOrForceReg, MobileLoginOrForceReg.this.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(2603152834560L, 19395);
                  at.wS().c(paramAnonymousDialogInterface);
                  GMTrace.o(2603152834560L, 19395);
                }
              });
              GMTrace.o(2601408004096L, 19382);
            }
          }, null, new DialogInterface.OnDismissListener()
          {
            public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(2613890252800L, 19475);
              MobileLoginOrForceReg.p(MobileLoginOrForceReg.this);
              GMTrace.o(2613890252800L, 19475);
            }
          }, this.vQl);
          GMTrace.o(2617111478272L, 19499);
          return;
        }
        this.vMf.a(this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb);
        GMTrace.o(2617111478272L, 19499);
        return;
      }
      this.eVw = ((u)paramk).Lu();
      this.vSw.a(this, paramInt1, paramInt2, paramString, paramk);
      if ((paramk instanceof u)) {
        this.vWc = ((u)paramk).LC();
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = new com.tencent.mm.modelsimple.w(1);
        at.wS().a(paramString, 0);
        getString(R.l.cUG);
        this.htG = h.a(this, getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(2610266374144L, 19448);
            at.wS().c(paramString);
            GMTrace.o(2610266374144L, 19448);
          }
        });
      }
      GMTrace.o(2617111478272L, 19499);
      return;
    }
    final Object localObject2;
    if (paramk.getType() == 126)
    {
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        paramString = Boolean.valueOf(this.vWd);
        localObject1 = this.vWf;
        localObject2 = this.vWe;
        if (this.vMf == null)
        {
          this.vMf = SecurityImage.a.a(this, R.l.dRU, 0, ((x)paramk).HP(), ((x)paramk).HQ(), "", new DialogInterface.OnClickListener()
          {
            public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2600602697728L, 19376);
              paramAnonymousDialogInterface = new x("", localObject1, localObject2, 0, "", MobileLoginOrForceReg.e(MobileLoginOrForceReg.this), "", "", MobileLoginOrForceReg.h(MobileLoginOrForceReg.this), MobileLoginOrForceReg.q(MobileLoginOrForceReg.this), "", ((x)paramk).HQ(), MobileLoginOrForceReg.o(MobileLoginOrForceReg.this).bZo(), true, paramString.booleanValue());
              paramAnonymousDialogInterface.lq(MobileLoginOrForceReg.i(MobileLoginOrForceReg.this));
              paramAnonymousDialogInterface.gY(MobileLoginOrForceReg.k(MobileLoginOrForceReg.this));
              at.wS().a(paramAnonymousDialogInterface, 0);
              MobileLoginOrForceReg localMobileLoginOrForceReg = MobileLoginOrForceReg.this;
              ActionBarActivity localActionBarActivity = MobileLoginOrForceReg.this.vKB.vKW;
              MobileLoginOrForceReg.this.getString(R.l.cUG);
              localMobileLoginOrForceReg.htG = h.a(localActionBarActivity, MobileLoginOrForceReg.this.getString(R.l.dRT), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(2600871133184L, 19378);
                  at.wS().c(paramAnonymousDialogInterface);
                  GMTrace.o(2600871133184L, 19378);
                }
              });
              GMTrace.o(2600602697728L, 19376);
            }
          }, null, new DialogInterface.OnDismissListener()new SecurityImage.b
          {
            public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(2598589431808L, 19361);
              MobileLoginOrForceReg.p(MobileLoginOrForceReg.this);
              GMTrace.o(2598589431808L, 19361);
            }
          }, new SecurityImage.b()
          {
            public final void bYp()
            {
              GMTrace.i(2591073239040L, 19305);
              MobileLoginOrForceReg.this.aLo();
              x localx = new x("", localObject1, localObject2, 0, "", MobileLoginOrForceReg.e(MobileLoginOrForceReg.this), "", "", MobileLoginOrForceReg.h(MobileLoginOrForceReg.this), MobileLoginOrForceReg.q(MobileLoginOrForceReg.this), "", ((x)paramk).HQ(), "", true, paramString.booleanValue());
              localx.lq(MobileLoginOrForceReg.i(MobileLoginOrForceReg.this));
              localx.gY(MobileLoginOrForceReg.k(MobileLoginOrForceReg.this));
              at.wS().a(localx, 0);
              GMTrace.o(2591073239040L, 19305);
            }
          });
          GMTrace.o(2617111478272L, 19499);
          return;
        }
        this.vMf.a(0, ((x)paramk).HP(), ((x)paramk).HQ(), "");
        GMTrace.o(2617111478272L, 19499);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        localObject1 = this.eMW;
        bool = this.vWd;
        at.unhold();
        at.bg(true);
        if (!Boolean.valueOf(bool).booleanValue()) {
          break label873;
        }
        localObject2 = com.tencent.mm.compatible.util.e.fSg + "temp.avatar";
        String str = com.tencent.mm.compatible.util.e.fSg + "temp.avatar.hd";
        new File((String)localObject2).renameTo(new File(str));
        com.tencent.mm.loader.stub.b.deleteFile((String)localObject2);
        d.b(str, 96, 96, Bitmap.CompressFormat.JPEG, 90, (String)localObject2);
        new com.tencent.mm.pluginsdk.model.o(this, com.tencent.mm.compatible.util.e.fSg + "temp.avatar").a(new Runnable()new Runnable
        {
          public final void run()
          {
            GMTrace.i(2596576165888L, 19346);
            MobileLoginOrForceReg.a(MobileLoginOrForceReg.this, ((x)paramk).LD());
            as.gnb.M("login_user_name", localObject1);
            com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.compatible.util.e.fSg + "temp.avatar");
            Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(MobileLoginOrForceReg.this);
            localIntent.addFlags(67108864);
            MobileLoginOrForceReg.this.startActivity(localIntent);
            com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",R200_600," + at.eK("R200_600") + ",4");
            MobileLoginOrForceReg.this.finish();
            GMTrace.o(2596576165888L, 19346);
          }
        }, new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2589194190848L, 19291);
            MobileLoginOrForceReg.a(MobileLoginOrForceReg.this, ((x)paramk).LD());
            as.gnb.M("login_user_name", localObject1);
            Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(MobileLoginOrForceReg.this);
            localIntent.addFlags(67108864);
            MobileLoginOrForceReg.this.startActivity(localIntent);
            com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",R200_600," + at.eK("R200_600") + ",4");
            MobileLoginOrForceReg.this.finish();
            GMTrace.o(2589194190848L, 19291);
          }
        });
      }
      for (;;)
      {
        localObject1 = com.tencent.mm.h.a.dH(paramString);
        if (localObject1 == null) {
          break;
        }
        ((com.tencent.mm.h.a)localObject1).a(this, null, null);
        GMTrace.o(2617111478272L, 19499);
        return;
        label873:
        this.eEU = ((x)paramk).LD();
        as.gnb.M("login_user_name", (String)localObject1);
        localObject1 = com.tencent.mm.plugin.c.a.hnH.ao(this);
        ((Intent)localObject1).addFlags(67108864);
        ((Intent)localObject1).putExtra("LauncherUI.enter_from_reg", true);
        startActivity((Intent)localObject1);
        finish();
        com.tencent.mm.plugin.c.b.nz("RE900_100");
        com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",R200_600," + at.eK("R200_600") + ",4");
      }
    }
    final Object localObject1 = new com.tencent.mm.pluginsdk.i.o(paramInt1, paramInt2, paramString);
    int i;
    if (this.vQt.a(this, (com.tencent.mm.pluginsdk.i.o)localObject1)) {
      i = 1;
    }
    while (i != 0)
    {
      GMTrace.o(2617111478272L, 19499);
      return;
      i = 0;
      switch (paramInt2)
      {
      default: 
        break;
      case -140: 
        if (!bg.nm(this.eVw)) {
          com.tencent.mm.platformtools.m.j(this.vKB.vKW, paramString, this.eVw);
        }
        i = 1;
        break;
      case -34: 
        Toast.makeText(this, R.l.cZq, 0).show();
        i = 1;
        break;
      case -43: 
        Toast.makeText(this, R.l.cZn, 0).show();
        i = 1;
        break;
      case -41: 
        Toast.makeText(this, R.l.cZp, 0).show();
        i = 1;
        break;
      case -36: 
        Toast.makeText(this, R.l.cZs, 0).show();
        i = 1;
        break;
      case -32: 
        h.a(this, getString(R.l.cZZ), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2608118890496L, 19432);
            GMTrace.o(2608118890496L, 19432);
          }
        });
        i = 1;
        break;
      case -33: 
        h.a(this, R.l.cZX, R.l.bhd, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2625835630592L, 19564);
            GMTrace.o(2625835630592L, 19564);
          }
        });
        i = 1;
        break;
      case -75: 
        h.h(this, R.l.cRG, R.l.dQH);
        i = 1;
        break;
      case -100: 
        at.hold();
        localObject2 = this.vKB.vKW;
        if (TextUtils.isEmpty(at.wy())) {}
        for (localObject1 = com.tencent.mm.br.a.X(this.vKB.vKW, R.l.dHY);; localObject1 = at.wy())
        {
          h.a((Context)localObject2, (String)localObject1, this.vKB.vKW.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2597247254528L, 19351);
              GMTrace.o(2597247254528L, 19351);
            }
          }, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(2585838747648L, 19266);
              GMTrace.o(2585838747648L, 19266);
            }
          });
          i = 1;
          break;
        }
      }
    }
    if (paramk.getType() == 701)
    {
      paramString = com.tencent.mm.h.a.dH(paramString);
      if ((paramString != null) && (paramString.a(this.vKB.vKW, null, null)))
      {
        GMTrace.o(2617111478272L, 19499);
        return;
      }
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      Toast.makeText(this.vKB.vKW, getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
    GMTrace.o(2617111478272L, 19499);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2616708825088L, 19496);
    int i = R.i.cCt;
    GMTrace.o(2616708825088L, 19496);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2616037736448L, 19491);
    super.onCreate(paramBundle);
    this.vLR = com.tencent.mm.plugin.c.b.Qu();
    at.wS().a(701, this);
    at.wS().a(126, this);
    at.wS().a(255, this);
    this.eEU = getIntent().getStringExtra("ticket");
    this.eMW = getIntent().getStringExtra("moble");
    this.vWb = getIntent().getIntExtra("next_controll", 0);
    this.username = getIntent().getStringExtra("username");
    this.llm = getIntent().getStringExtra("password");
    this.eCQ = getIntent().getStringExtra("nickname");
    this.ied = getIntent().getStringExtra("avatar_url");
    this.vQG = getIntent().getStringExtra("regsession_id");
    this.vTA = getIntent().getIntExtra("mobile_check_type", 0);
    this.vWd = getIntent().getBooleanExtra("kintent_hasavatar", false);
    this.vWe = getIntent().getStringExtra("kintent_nickname");
    this.vWf = getIntent().getStringExtra("kintent_password");
    if ((this.vWf != null) && (this.vWf.length() >= 8)) {}
    for (this.gUV = 1;; this.gUV = 4)
    {
      MP();
      this.vQt = new com.tencent.mm.pluginsdk.i.a();
      GMTrace.o(2616037736448L, 19491);
      return;
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(2616574607360L, 19495);
    at.wS().b(701, this);
    at.wS().b(126, this);
    at.wS().b(255, this);
    if (this.vQt != null) {
      this.vQt.close();
    }
    super.onDestroy();
    GMTrace.o(2616574607360L, 19495);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2616977260544L, 19498);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(2616977260544L, 19498);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2616977260544L, 19498);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2616440389632L, 19494);
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.vPG);
    GMTrace.o(2616440389632L, 19494);
  }
  
  public void onResume()
  {
    GMTrace.i(2616306171904L, 19493);
    com.tencent.mm.sdk.b.a.vgX.b(this.vPG);
    super.onResume();
    com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",R200_600," + at.eK("R200_600") + ",1");
    com.tencent.mm.plugin.c.b.ny("R200_600");
    GMTrace.o(2616306171904L, 19493);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\MobileLoginOrForceReg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */