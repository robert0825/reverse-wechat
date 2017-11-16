package com.tencent.mm.plugin.webwx.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.b;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.qp;
import com.tencent.mm.k.f;
import com.tencent.mm.modelsimple.ak;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.at;

@com.tencent.mm.ui.base.a(3)
public class WebWXLogoutUI
  extends MMActivity
  implements e, ap
{
  private ProgressDialog oHE;
  private com.tencent.mm.sdk.b.c puL;
  private boolean rZM;
  private boolean rZS;
  private boolean rZT;
  private ImageButton rZU;
  private ImageButton rZV;
  private ImageView rZW;
  private int rZX;
  private int rZY;
  private int rZZ;
  private Animator saa;
  private int sab;
  
  public WebWXLogoutUI()
  {
    GMTrace.i(7668127236096L, 57132);
    this.oHE = null;
    this.rZM = false;
    this.puL = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7668127236096L, 57132);
  }
  
  private void jI(boolean paramBoolean)
  {
    GMTrace.i(7669200977920L, 57140);
    if (this.rZU != null)
    {
      if (paramBoolean)
      {
        this.rZU.setImageResource(R.g.bcc);
        ((TextView)findViewById(R.h.cnV)).setText(R.l.ekB);
        GMTrace.o(7669200977920L, 57140);
        return;
      }
      this.rZU.setImageResource(R.g.bca);
      ((TextView)findViewById(R.h.cnV)).setText(R.l.cnU);
    }
    GMTrace.o(7669200977920L, 57140);
  }
  
  private void jJ(boolean paramBoolean)
  {
    GMTrace.i(7669335195648L, 57141);
    if (this.rZV != null)
    {
      if (paramBoolean)
      {
        this.rZV.setImageResource(R.g.bbZ);
        GMTrace.o(7669335195648L, 57141);
        return;
      }
      this.rZV.setImageResource(R.g.bcb);
    }
    GMTrace.o(7669335195648L, 57141);
  }
  
  private void updateStatus()
  {
    GMTrace.i(7669066760192L, 57139);
    if (!bg.nm(com.tencent.mm.modelsimple.q.gUk))
    {
      ((TextView)findViewById(R.h.cfL)).setText(com.tencent.mm.modelsimple.q.gUk);
      if (com.tencent.mm.modelsimple.q.Ln() == 1)
      {
        if (!this.rZS)
        {
          this.rZW.setImageResource(R.k.cLF);
          this.rZW.setPadding(this.rZY - this.rZX, this.rZZ, 0, 0);
          GMTrace.o(7669066760192L, 57139);
        }
      }
      else
      {
        if (com.tencent.mm.modelsimple.q.Ln() == 2)
        {
          if (this.rZS) {
            ((TextView)findViewById(R.h.bUz)).setText(R.l.ekA);
          }
          while (this.rZT)
          {
            ((TextView)findViewById(R.h.cfL)).setText(getString(R.l.ekq, new Object[] { "Mac" }));
            this.rZW.setImageResource(R.k.cLB);
            this.rZW.setPadding(0, this.rZZ, 0, 0);
            if ((!f.tK()) || (this.rZS)) {
              break label467;
            }
            ((TextView)findViewById(R.h.bUz)).setText(R.l.ekp);
            this.rZW.setImageResource(R.k.cLD);
            this.rZW.setPadding(this.rZY - this.rZX, this.rZZ, 0, 0);
            GMTrace.o(7669066760192L, 57139);
            return;
            if (!f.tK()) {
              ((TextView)findViewById(R.h.bUz)).setText("");
            }
          }
          ((TextView)findViewById(R.h.cfL)).setText(getString(R.l.eks, new Object[] { "Mac" }));
          this.rZW.setImageResource(R.k.cLA);
          this.rZW.setPadding(0, this.rZZ, 0, 0);
          if ((!f.tK()) || (this.rZS)) {
            break label467;
          }
          ((TextView)findViewById(R.h.bUz)).setText(R.l.ekp);
          this.rZW.setImageResource(R.k.cLC);
          this.rZW.setPadding(this.rZY - this.rZX, this.rZZ, 0, 0);
          GMTrace.o(7669066760192L, 57139);
          return;
        }
        if (com.tencent.mm.modelsimple.q.Ln() == 3)
        {
          this.rZW.setImageResource(R.k.cLz);
          this.rZW.setPadding(0, this.rZZ, 0, 0);
          GMTrace.o(7669066760192L, 57139);
          return;
        }
      }
      this.rZW.setImageResource(R.k.cLE);
      this.rZW.setPadding(0, this.rZZ, 0, 0);
    }
    label467:
    GMTrace.o(7669066760192L, 57139);
  }
  
  public final void AI()
  {
    GMTrace.i(7669603631104L, 57143);
    at.AR();
    if (!com.tencent.mm.y.c.yF())
    {
      finish();
      GMTrace.o(7669603631104L, 57143);
      return;
    }
    if ((com.tencent.mm.modelsimple.q.Lp()) && (!this.rZT))
    {
      w.d("MicroMsg.WebWXLogoutUI", "extDevice remote lock");
      this.rZT = true;
      jI(this.rZT);
      updateStatus();
    }
    GMTrace.o(7669603631104L, 57143);
  }
  
  protected final void MP()
  {
    GMTrace.i(7668932542464L, 57138);
    sq("");
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setStatusBarColor(getResources().getColor(R.e.aPb));
    }
    final Object localObject;
    label212:
    label265:
    Drawable localDrawable;
    if (!f.tK())
    {
      findViewById(R.h.bpp).setVisibility(8);
      this.rZS = false;
      this.rZW = ((ImageView)findViewById(R.h.cfN));
      w.d("MicroMsg.WebWXLogoutUI", "need hide lock bt ?: " + com.tencent.mm.modelsimple.q.Lr());
      if (com.tencent.mm.modelsimple.q.Lr()) {
        break label457;
      }
      localObject = AnimatorInflater.loadAnimator(this, R.b.aMj);
      ((Animator)localObject).setTarget(findViewById(R.h.cnW));
      this.saa = AnimatorInflater.loadAnimator(this, R.b.aMk);
      this.saa.setTarget(findViewById(R.h.cnW));
      this.saa.addListener(new AnimatorListenerAdapter()
      {
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(7665040228352L, 57109);
          super.onAnimationEnd(paramAnonymousAnimator);
          WebWXLogoutUI.c(WebWXLogoutUI.this, WebWXLogoutUI.c(WebWXLogoutUI.this));
          GMTrace.o(7665040228352L, 57109);
        }
      });
      this.rZT = com.tencent.mm.modelsimple.q.Lp();
      this.rZU = ((ImageButton)findViewById(R.h.cnU));
      jI(this.rZT);
      this.rZU.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7665845534720L, 57115);
          if (WebWXLogoutUI.c(WebWXLogoutUI.this)) {
            WebWXLogoutUI.d(WebWXLogoutUI.this).setImageResource(R.k.cLy);
          }
          for (;;)
          {
            WebWXLogoutUI.e(WebWXLogoutUI.this);
            WebWXLogoutUI.this.findViewById(R.h.cnW).setVisibility(0);
            localObject.start();
            GMTrace.o(7665845534720L, 57115);
            return;
            WebWXLogoutUI.d(WebWXLogoutUI.this).setImageResource(R.k.cLx);
          }
        }
      });
      localObject = (ImageButton)findViewById(R.h.cnS);
      w.d("MicroMsg.WebWXLogoutUI", "need hide file bt ?: " + com.tencent.mm.modelsimple.q.Ls());
      if (com.tencent.mm.modelsimple.q.Ls()) {
        break label472;
      }
      ((ImageButton)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7663966486528L, 57101);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Chat_User", "filehelper");
          paramAnonymousView.putExtra("key_show_bottom_app_panel", true);
          com.tencent.mm.plugin.webwx.a.hnH.e(paramAnonymousView, WebWXLogoutUI.this);
          w.d("MicroMsg.WebWXLogoutUI", "clicked file transfer bt, start filehelper");
          WebWXLogoutUI.this.finish();
          GMTrace.o(7663966486528L, 57101);
        }
      });
      localObject = (Button)findViewById(R.h.coc);
      ((Button)localObject).setText(com.tencent.mm.modelsimple.q.gUs);
      ((Button)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7665577099264L, 57113);
          w.d("MicroMsg.WebWXLogoutUI", "logout webwx");
          WebWXLogoutUI.f(WebWXLogoutUI.this);
          GMTrace.o(7665577099264L, 57113);
        }
      });
      ((TextView)findViewById(R.h.cod)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7664771792896L, 57107);
          WebWXLogoutUI.this.finish();
          GMTrace.o(7664771792896L, 57107);
        }
      });
      if (com.tencent.mm.modelsimple.q.Ln() != 1) {
        break label481;
      }
      localObject = getResources().getDrawable(R.k.cLE);
      localDrawable = getResources().getDrawable(R.k.cLF);
      if ((localObject != null) && (localDrawable != null))
      {
        this.rZX = ((Drawable)localObject).getIntrinsicWidth();
        this.rZY = localDrawable.getIntrinsicWidth();
      }
    }
    for (;;)
    {
      this.rZW.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7665308663808L, 57111);
          WebWXLogoutUI.a(WebWXLogoutUI.this, WebWXLogoutUI.g(WebWXLogoutUI.this));
          WebWXLogoutUI.h(WebWXLogoutUI.this);
          GMTrace.o(7665308663808L, 57111);
        }
      });
      GMTrace.o(7668932542464L, 57138);
      return;
      this.rZV = ((ImageButton)findViewById(R.h.cnR));
      if (com.tencent.mm.y.q.fo(com.tencent.mm.y.q.zK())) {}
      for (this.rZS = true;; this.rZS = false)
      {
        jJ(this.rZS);
        this.rZV.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7661819002880L, 57085);
            paramAnonymousView = WebWXLogoutUI.this;
            if (!WebWXLogoutUI.a(WebWXLogoutUI.this)) {}
            for (boolean bool = true;; bool = false)
            {
              WebWXLogoutUI.a(paramAnonymousView, bool);
              WebWXLogoutUI.b(WebWXLogoutUI.this, WebWXLogoutUI.a(WebWXLogoutUI.this));
              WebWXLogoutUI.b(WebWXLogoutUI.this);
              GMTrace.o(7661819002880L, 57085);
              return;
            }
          }
        });
        break;
      }
      label457:
      findViewById(R.h.bLn).setVisibility(8);
      break label212;
      label472:
      ((ImageButton)localObject).setVisibility(8);
      break label265;
      label481:
      if (com.tencent.mm.modelsimple.q.Ln() == 2)
      {
        localObject = getResources().getDrawable(R.k.cLA);
        localDrawable = getResources().getDrawable(R.k.cLC);
        if ((localObject != null) && (localDrawable != null))
        {
          this.rZX = ((Drawable)localObject).getIntrinsicWidth();
          this.rZY = localDrawable.getIntrinsicWidth();
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7669469413376L, 57142);
    if (this.oHE != null)
    {
      this.oHE.dismiss();
      this.oHE = null;
    }
    if (paramk.getType() == 281)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        Toast.makeText(this, R.l.eky, 1).show();
      }
      finish();
      GMTrace.o(7669469413376L, 57142);
      return;
    }
    boolean bool;
    if (paramk.getType() == 792)
    {
      int i = ((com.tencent.mm.plugin.webwx.a.a)paramk).eHz;
      if (this.saa != null) {
        this.saa.start();
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        if (i == 1)
        {
          Toast.makeText(this, R.l.ekr, 0).show();
          GMTrace.o(7669469413376L, 57142);
          return;
        }
        Toast.makeText(this, R.l.ekC, 0).show();
        GMTrace.o(7669469413376L, 57142);
        return;
      }
      if (i != 1) {
        break label226;
      }
      bool = true;
      this.rZT = bool;
      com.tencent.mm.modelsimple.q.bB(this.rZT);
      updateStatus();
      if (!this.rZT) {
        break label232;
      }
    }
    label226:
    label232:
    for (paramString = "lock";; paramString = "unlock")
    {
      w.d("MicroMsg.WebWXLogoutUI", "%s extDevice success", new Object[] { paramString });
      GMTrace.o(7669469413376L, 57142);
      return;
      bool = false;
      break;
    }
  }
  
  public void finish()
  {
    GMTrace.i(7668395671552L, 57134);
    super.finish();
    overridePendingTransition(R.a.aLj, R.a.aLE);
    GMTrace.o(7668395671552L, 57134);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7668261453824L, 57133);
    int i = R.i.cIa;
    GMTrace.o(7668261453824L, 57133);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7668529889280L, 57135);
    super.onCreate(paramBundle);
    cN().cO().hide();
    if (getIntent() != null) {
      this.sab = getIntent().getIntExtra("intent.key.online_version", 0);
    }
    MP();
    overridePendingTransition(R.a.aLG, R.a.aLj);
    at.wS().a(281, this);
    at.wS().a(792, this);
    at.AR();
    com.tencent.mm.y.c.a(this);
    com.tencent.mm.sdk.b.a.vgX.b(this.puL);
    GMTrace.o(7668529889280L, 57135);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7668798324736L, 57137);
    super.onDestroy();
    overridePendingTransition(R.a.aLj, R.a.aLE);
    at.wS().b(281, this);
    at.wS().b(792, this);
    at.AR();
    com.tencent.mm.y.c.b(this);
    com.tencent.mm.sdk.b.a.vgX.c(this.puL);
    GMTrace.o(7668798324736L, 57137);
  }
  
  protected void onPause()
  {
    GMTrace.i(7668664107008L, 57136);
    super.onPause();
    uu localuu;
    if ((this.rZM) && (at.AU()))
    {
      localuu = new uu();
      localuu.umY = 27;
      if (!com.tencent.mm.y.q.fo(com.tencent.mm.y.q.zK())) {
        break label93;
      }
    }
    label93:
    for (int i = 1;; i = 2)
    {
      localuu.umZ = i;
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(23, localuu));
      this.rZM = false;
      GMTrace.o(7668664107008L, 57136);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webwx\ui\WebWXLogoutUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */