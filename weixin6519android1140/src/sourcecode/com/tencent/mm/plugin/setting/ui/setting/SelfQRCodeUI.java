package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.FileObserver;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.af.f;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.io.File;

public class SelfQRCodeUI
  extends MMActivity
  implements e
{
  private static final String oHf;
  private Bitmap gsp;
  private ProgressDialog htG;
  private ImageView iub;
  private long jZy;
  private ImageView oGw;
  private byte[] oGx;
  private TextView oHb;
  private TextView oHc;
  private boolean oHd;
  private a oHe;
  private String userName;
  
  static
  {
    GMTrace.i(4696278302720L, 34990);
    oHf = com.tencent.mm.compatible.util.h.getExternalStorageDirectory().toString() + "/Pictures/Screenshots/";
    GMTrace.o(4696278302720L, 34990);
  }
  
  public SelfQRCodeUI()
  {
    GMTrace.i(4694130819072L, 34974);
    this.htG = null;
    this.oGw = null;
    this.iub = null;
    this.oHb = null;
    this.oHc = null;
    this.userName = "";
    this.oHd = false;
    this.oGx = null;
    this.gsp = null;
    GMTrace.o(4694130819072L, 34974);
  }
  
  public static void bei()
  {
    GMTrace.i(4695607214080L, 34985);
    g.ork.a(219L, 14L, 1L, true);
    GMTrace.o(4695607214080L, 34985);
  }
  
  private void tH(int paramInt)
  {
    GMTrace.i(16881905827840L, 125780);
    if (this.oHd) {
      at.AR();
    }
    for (int i = bg.e((Integer)c.xh().get(66561, null));; i = 0)
    {
      final com.tencent.mm.ax.a locala = new com.tencent.mm.ax.a(this.userName, i, paramInt);
      at.wS().a(locala, 0);
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(R.l.dXd), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(4710236946432L, 35094);
          at.wS().c(locala);
          if ((s.eb(SelfQRCodeUI.c(SelfQRCodeUI.this))) || (f.iP(SelfQRCodeUI.c(SelfQRCodeUI.this)))) {
            SelfQRCodeUI.this.finish();
          }
          GMTrace.o(4710236946432L, 35094);
        }
      });
      GMTrace.o(16881905827840L, 125780);
      return;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(4694801907712L, 34979);
    this.userName = getIntent().getStringExtra("from_userName");
    if (bg.nm(this.userName)) {
      this.userName = com.tencent.mm.y.q.zE();
    }
    if (com.tencent.mm.y.q.zE().equals(this.userName)) {
      this.oHd = true;
    }
    Object localObject1;
    Object localObject2;
    if (s.eb(this.userName))
    {
      oM(R.l.eap);
      ((TextView)findViewById(R.h.bVG)).setText("");
      lf(false);
      this.oGw = ((ImageView)findViewById(R.h.cbV));
      this.iub = ((ImageView)findViewById(R.h.bFV));
      this.oHb = ((TextView)findViewById(R.h.bQU));
      this.oHc = ((TextView)findViewById(R.h.buy));
      if ((!s.eb(this.userName)) && (!f.iP(this.userName))) {
        break label398;
      }
      tH(1);
      a.b.a(this.iub, this.userName);
      at.AR();
      localObject1 = c.yK().TE(this.userName);
      this.oHb.setSingleLine(false);
      this.oHb.setMaxLines(3);
      this.oHb.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      if (localObject1 == null) {
        break label386;
      }
      localObject2 = ((af)localObject1).field_nickname;
      localObject1 = localObject2;
      if (bg.nm((String)localObject2))
      {
        at.AR();
        localObject1 = c.yT().gD(this.userName).field_displayname;
      }
      this.oHb.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, (CharSequence)localObject1, this.oHb.getTextSize()));
      label288:
      this.oHc.setVisibility(8);
    }
    for (;;)
    {
      a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4708357898240L, 35080);
          SelfQRCodeUI.b(SelfQRCodeUI.this);
          GMTrace.o(4708357898240L, 35080);
          return true;
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4669971628032L, 34794);
          SelfQRCodeUI.this.aLo();
          SelfQRCodeUI.this.finish();
          GMTrace.o(4669971628032L, 34794);
          return true;
        }
      });
      GMTrace.o(4694801907712L, 34979);
      return;
      if (f.iP(this.userName))
      {
        oM(R.l.dqi);
        ((TextView)findViewById(R.h.bVG)).setText(R.l.dqj);
        lf(false);
        break;
      }
      oM(R.l.eai);
      break;
      label386:
      this.oHb.setVisibility(8);
      break label288;
      label398:
      at.AR();
      localObject2 = (String)c.xh().get(42, null);
      localObject1 = getString(R.l.cTa);
      if (!bg.nm((String)localObject2))
      {
        localObject1 = (String)localObject1 + (String)localObject2;
        label449:
        w.d("MicroMsg.SelfQRCodeNewUI", "display user name = %s", new Object[] { localObject1 });
        if (this.gsp != null) {
          break label746;
        }
        w.d("MicroMsg.SelfQRCodeNewUI", "%s", new Object[] { "bitmap == null" });
        tH(1);
      }
      for (;;)
      {
        a.b.a(this.iub, com.tencent.mm.y.q.zE());
        at.AR();
        localObject1 = (String)c.xh().get(4, null);
        w.d("MicroMsg.SelfQRCodeNewUI", "nick name = %s", new Object[] { localObject1 });
        this.oHb.setText(com.tencent.mm.pluginsdk.ui.d.h.c(this, (CharSequence)localObject1, com.tencent.mm.br.a.V(this.vKB.vKW, R.f.aQo)));
        localObject2 = bk.BE();
        localObject1 = bg.nl(((bk)localObject2).getProvince());
        localObject2 = bg.nl(((bk)localObject2).getCity());
        localObject1 = r.fu((String)localObject1) + " " + (String)localObject2;
        w.d("MicroMsg.SelfQRCodeNewUI", "display location = %s", new Object[] { localObject1 });
        this.oHc.setText((CharSequence)localObject1);
        at.AR();
        switch (bg.a((Integer)c.xh().get(12290, null), 0))
        {
        default: 
          break;
        case 1: 
          this.oHb.setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.br.a.b(this, R.k.cMN), null);
          break;
          at.AR();
          localObject2 = (String)c.xh().get(2, null);
          localObject1 = (String)localObject1 + (String)localObject2;
          x.Ts((String)localObject2);
          break label449;
          label746:
          this.oGw.setImageBitmap(this.gsp);
        }
      }
      this.oHb.setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.br.a.b(this, R.k.cMM), null);
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(16881771610112L, 125779);
    GMTrace.o(16881771610112L, 125779);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4695472996352L, 34984);
    w.i("MicroMsg.SelfQRCodeNewUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    Object localObject = (com.tencent.mm.ax.a)paramk;
    if (paramk.getType() == 168)
    {
      if (com.tencent.mm.plugin.setting.a.hnI.b(this.vKB.vKW, paramInt1, paramInt2, paramString))
      {
        GMTrace.o(4695472996352L, 34984);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Toast.makeText(this, getString(R.l.dxf, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        GMTrace.o(4695472996352L, 34984);
        return;
      }
      this.oGx = ((com.tencent.mm.ax.a)localObject).gQw;
      this.gsp = com.tencent.mm.sdk.platformtools.d.bg(this.oGx);
      if ((!s.eb(this.userName)) && (!f.iP(this.userName))) {
        break label264;
      }
      lf(true);
      paramString = ((com.tencent.mm.ax.a)localObject).gQu;
      if (!bg.nm(paramString)) {
        ((TextView)findViewById(R.h.bVG)).setText(paramString);
      }
    }
    for (;;)
    {
      this.oGw.setImageBitmap(this.gsp);
      GMTrace.o(4695472996352L, 34984);
      return;
      label264:
      if (this.oHd)
      {
        paramString = ((com.tencent.mm.ax.a)localObject).gQv;
        paramk = (TextView)findViewById(R.h.chE);
        localObject = (View)paramk.getParent();
        if (!bg.nm(paramString))
        {
          paramk.setText(paramString);
          ((View)localObject).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(16884187529216L, 125797);
              SelfQRCodeUI.f(SelfQRCodeUI.this);
              GMTrace.o(16884187529216L, 125797);
            }
          });
          ((View)localObject).setVisibility(0);
        }
        else
        {
          ((View)localObject).setVisibility(8);
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4694265036800L, 34975);
    int i = R.i.cFP;
    GMTrace.o(4694265036800L, 34975);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4694399254528L, 34976);
    super.onCreate(paramBundle);
    this.oHe = new a(this);
    this.oHe.start();
    at.wS().a(168, this);
    MP();
    this.oGw.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16884321746944L, 125798);
        int i = SelfQRCodeUI.a(SelfQRCodeUI.this).getWidth();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)SelfQRCodeUI.a(SelfQRCodeUI.this).getLayoutParams();
        localLayoutParams.width = i;
        localLayoutParams.height = i;
        SelfQRCodeUI.a(SelfQRCodeUI.this).setLayoutParams(localLayoutParams);
        GMTrace.o(16884321746944L, 125798);
      }
    });
    GMTrace.o(4694399254528L, 34976);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4694533472256L, 34977);
    at.wS().b(168, this);
    if (this.oHe != null) {
      this.oHe.stop();
    }
    if ((this.gsp != null) && (!this.gsp.isRecycled())) {
      this.gsp.recycle();
    }
    super.onDestroy();
    GMTrace.o(4694533472256L, 34977);
  }
  
  protected void onResume()
  {
    GMTrace.i(4694667689984L, 34978);
    super.onResume();
    if ((s.eb(this.userName)) || (f.iP(this.userName)))
    {
      GMTrace.o(4694667689984L, 34978);
      return;
    }
    View localView = findViewById(R.h.cbY);
    this.jZy = com.tencent.mm.y.q.zJ();
    w.d("MicroMsg.SelfQRCodeNewUI", (this.jZy & 0x2) + ",extstatus:" + this.jZy);
    if ((this.jZy & 0x2) != 0L)
    {
      localView.setVisibility(0);
      this.oGw.setAlpha(0.1F);
      findViewById(R.h.cbX).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4669703192576L, 34792);
          com.tencent.mm.bj.d.x(SelfQRCodeUI.this, "setting", ".ui.setting.SettingsAddMeUI");
          GMTrace.o(4669703192576L, 34792);
        }
      });
      GMTrace.o(4694667689984L, 34978);
      return;
    }
    localView.setVisibility(8);
    this.oGw.setAlpha(1.0F);
    GMTrace.o(4694667689984L, 34978);
  }
  
  public final class a
    extends FileObserver
  {
    private MMActivity oHh;
    private String oHi;
    
    public a(MMActivity paramMMActivity)
    {
      super(8);
      GMTrace.i(4619103109120L, 34415);
      this.oHh = paramMMActivity;
      GMTrace.o(4619103109120L, 34415);
    }
    
    public final void onEvent(int paramInt, String paramString)
    {
      GMTrace.i(4619237326848L, 34416);
      if ((paramString != null) && (paramInt == 8) && ((this.oHi == null) || (!paramString.equalsIgnoreCase(this.oHi))))
      {
        this.oHi = paramString;
        Uri.fromFile(new File(SelfQRCodeUI.bej() + paramString));
        SelfQRCodeUI.bei();
        w.i("MicroMsg.SelfQRCodeNewUI$ScreenshotObserver", "Send event to listener.");
      }
      GMTrace.o(4619237326848L, 34416);
    }
    
    public final void start()
    {
      GMTrace.i(4619371544576L, 34417);
      super.startWatching();
      GMTrace.o(4619371544576L, 34417);
    }
    
    public final void stop()
    {
      GMTrace.i(4619505762304L, 34418);
      super.stopWatching();
      GMTrace.o(4619505762304L, 34418);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SelfQRCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */