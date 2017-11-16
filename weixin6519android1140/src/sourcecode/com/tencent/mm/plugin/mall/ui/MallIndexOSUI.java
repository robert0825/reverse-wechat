package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.sn;
import com.tencent.mm.g.a.sn.b;
import com.tencent.mm.plugin.mall.a.c;
import com.tencent.mm.plugin.wallet_core.d.i;
import com.tencent.mm.plugin.wallet_core.model.ab;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.bqr;
import com.tencent.mm.protocal.c.bqs;
import com.tencent.mm.protocal.c.bqu;
import com.tencent.mm.protocal.c.bqv;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;
import java.util.LinkedList;

public class MallIndexOSUI
  extends MallIndexBaseUI
{
  private long lastUpdateTime;
  private ab mSA;
  private TextView mSB;
  private View mSC;
  private boolean mSD;
  private boolean mSE;
  private sn.b mSF;
  private a[] mSz;
  
  public MallIndexOSUI()
  {
    GMTrace.i(8003134685184L, 59628);
    this.mSz = new a[3];
    this.mSA = new ab();
    this.mSB = null;
    this.lastUpdateTime = 0L;
    this.mSC = null;
    this.mSD = false;
    this.mSE = false;
    GMTrace.o(8003134685184L, 59628);
  }
  
  public final void a(MallFunction paramMallFunction, int paramInt)
  {
    GMTrace.i(8003537338368L, 59631);
    super.a(paramMallFunction, paramInt);
    com.tencent.mm.plugin.report.service.g.ork.i(13720, new Object[] { paramMallFunction.mci, Long.valueOf(bg.Sz(paramMallFunction.odH)) });
    GMTrace.o(8003537338368L, 59631);
  }
  
  protected final void aNd()
  {
    GMTrace.i(8003671556096L, 59632);
    String str1 = this.mSA.rjk;
    String str2 = this.mSA.rjl;
    sq(str1);
    Ve(str2);
    GMTrace.o(8003671556096L, 59632);
  }
  
  protected final void aNe()
  {
    GMTrace.i(8003939991552L, 59634);
    GMTrace.o(8003939991552L, 59634);
  }
  
  protected final void aNf()
  {
    GMTrace.i(8004074209280L, 59635);
    GMTrace.o(8004074209280L, 59635);
  }
  
  protected final boolean aNh()
  {
    GMTrace.i(8004611080192L, 59639);
    bqr localbqr = this.mSA.rjh;
    int i = 0;
    while (i < this.mSz.length)
    {
      this.mSz[i].view.setVisibility(8);
      this.mSz[i].mRv.setImageBitmap(null);
      i += 1;
    }
    i = 0;
    while ((i < localbqr.uoL.size()) && (i < this.mSz.length))
    {
      final bqs localbqs = (bqs)localbqr.uoL.get(i);
      this.mSz[i].view.setVisibility(0);
      this.mSz[i].mRv.setUrl(com.tencent.mm.platformtools.n.a(localbqs.vaC));
      this.mSz[i].mRv.setVisibility(0);
      this.mSz[i].jPE.setText(com.tencent.mm.platformtools.n.a(localbqs.vaB));
      w.i("MicroMsg.MallIndexOSUI", "item %d url %s", new Object[] { Integer.valueOf(i), com.tencent.mm.platformtools.n.a(localbqs.vaC) });
      this.mSz[i].mSN.setVisibility(8);
      String str = com.tencent.mm.platformtools.n.a(localbqs.vaE);
      if (!bg.nm(str))
      {
        this.mSz[i].mSN.setText(str);
        this.mSz[i].mSN.setVisibility(0);
      }
      this.mSz[i].view.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8006221692928L, 59651);
          com.tencent.mm.plugin.report.service.g.ork.i(13867, new Object[] { com.tencent.mm.platformtools.n.a(localbqs.vaD), Integer.valueOf(MallIndexOSUI.this.mRi) });
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", com.tencent.mm.platformtools.n.a(localbqs.vaD));
          paramAnonymousView.putExtra("geta8key_username", q.zE());
          paramAnonymousView.putExtra("pay_channel", 1);
          d.b(MallIndexOSUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(8006221692928L, 59651);
        }
      });
      i += 1;
    }
    if ((this.mSh != null) && (this.mSC != null) && (!this.mSD))
    {
      this.mSh.addFooterView(this.mSC);
      this.mSD = true;
    }
    if (!bg.nm(this.mSA.rjn))
    {
      this.mSB.setText(this.mSA.rjn);
      this.mSB.setVisibility(0);
    }
    GMTrace.o(8004611080192L, 59639);
    return true;
  }
  
  protected final void aNm()
  {
    GMTrace.i(8003403120640L, 59630);
    com.tencent.mm.wallet_core.ui.e.a(this.mSm, "1", this.mSA.rjm, this.mSA.mJz);
    GMTrace.o(8003403120640L, 59630);
  }
  
  protected final void aNn()
  {
    GMTrace.i(8004745297920L, 59640);
    GMTrace.o(8004745297920L, 59640);
  }
  
  protected final void aNp()
  {
    GMTrace.i(8004879515648L, 59641);
    this.vKB.bXE();
    if ((this.mSF != null) && (this.mSF.eXR))
    {
      com.tencent.mm.kernel.h.xz();
      final boolean bool = ((Boolean)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzY, Boolean.valueOf(false))).booleanValue();
      w.i("MicroMsg.MallIndexOSUI", "addIconOptionMenuByMode, hasRedDot: %s", new Object[] { Boolean.valueOf(bool) });
      if (bool) {}
      for (int i = a.e.sov;; i = a.e.sou)
      {
        a(0, i, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            int i = 0;
            GMTrace.i(20959977275392L, 156164);
            paramAnonymousMenuItem = com.tencent.mm.plugin.report.service.g.ork;
            if (bool) {
              i = 1;
            }
            paramAnonymousMenuItem.i(14872, new Object[] { Integer.valueOf(0), Integer.valueOf(i), "", "" });
            MallIndexOSUI.this.fR(MallIndexOSUI.c(MallIndexOSUI.this).rjj);
            GMTrace.o(20959977275392L, 156164);
            return true;
          }
        });
        GMTrace.o(8004879515648L, 59641);
        return;
      }
    }
    a(0, a.e.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20959574622208L, 156161);
        final bqu localbqu = MallIndexOSUI.c(MallIndexOSUI.this).rji;
        final boolean bool = MallIndexOSUI.c(MallIndexOSUI.this).rjj;
        if (bool)
        {
          paramAnonymousMenuItem = new String[localbqu.uoL.size() + 1];
          paramAnonymousMenuItem[localbqu.uoL.size()] = MallIndexOSUI.this.getString(a.i.tcb);
        }
        for (;;)
        {
          int i = 0;
          while (i < localbqu.uoL.size())
          {
            paramAnonymousMenuItem[i] = com.tencent.mm.platformtools.n.a(((bqv)localbqu.uoL.get(i)).vaB);
            i += 1;
          }
          paramAnonymousMenuItem = new String[localbqu.uoL.size()];
        }
        com.tencent.mm.ui.base.h.a(MallIndexOSUI.this.vKB.vKW, null, paramAnonymousMenuItem, null, false, new h.c()
        {
          public final void hQ(int paramAnonymous2Int)
          {
            GMTrace.i(20963198500864L, 156188);
            if (paramAnonymous2Int < localbqu.uoL.size())
            {
              Intent localIntent = new Intent();
              localIntent.putExtra("rawUrl", com.tencent.mm.platformtools.n.a(((bqv)localbqu.uoL.get(paramAnonymous2Int)).vaG));
              d.b(MallIndexOSUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
              GMTrace.o(20963198500864L, 156188);
              return;
            }
            if (bool) {
              MallIndexOSUI.this.aNr();
            }
            GMTrace.o(20963198500864L, 156188);
          }
        });
        GMTrace.o(20959574622208L, 156161);
        return true;
      }
    });
    GMTrace.o(8004879515648L, 59641);
  }
  
  protected final void aNq()
  {
    GMTrace.i(8005013733376L, 59642);
    GMTrace.o(8005013733376L, 59642);
  }
  
  protected final void cm(View paramView)
  {
    GMTrace.i(8003805773824L, 59633);
    this.mSz[0] = new a();
    this.mSz[0].view = paramView.findViewById(a.f.sCR);
    this.mSz[0].mRv = ((CdnImageView)paramView.findViewById(a.f.sCS));
    this.mSz[0].jPE = ((TextView)paramView.findViewById(a.f.sCU));
    this.mSz[0].mSN = ((TextView)paramView.findViewById(a.f.svm));
    this.mSz[0].mRv.setVisibility(4);
    this.mSz[1] = new a();
    this.mSz[1].view = paramView.findViewById(a.f.spU);
    this.mSz[1].mRv = ((CdnImageView)paramView.findViewById(a.f.sqd));
    this.mSz[1].jPE = ((TextView)paramView.findViewById(a.f.sqg));
    this.mSz[1].mSN = ((TextView)paramView.findViewById(a.f.sqc));
    this.mSz[1].mRv.setVisibility(4);
    this.mSz[2] = new a();
    this.mSz[2].view = paramView.findViewById(a.f.sqn);
    this.mSz[2].mRv = ((CdnImageView)paramView.findViewById(a.f.sqE));
    this.mSz[2].jPE = ((TextView)paramView.findViewById(a.f.sqH));
    this.mSz[2].mSN = ((TextView)paramView.findViewById(a.f.svn));
    this.mSz[2].mRv.setVisibility(4);
    GMTrace.o(8003805773824L, 59633);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(8005147951104L, 59643);
    super.d(paramInt1, paramInt2, paramString, paramk);
    if (paramk.getType() == 1577)
    {
      this.mSA = com.tencent.mm.plugin.wallet_core.model.n.byD().wS(this.mRi);
      aNm();
      aNh();
      aNd();
      paramString = new sn();
      paramString.eXu.eXo = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20962930065408L, 156186);
          w.d("MicroMsg.MallIndexOSUI", "mUserInfo needBind : " + MallIndexOSUI.a(MallIndexOSUI.this).eXw + " hasNewTips : " + MallIndexOSUI.a(MallIndexOSUI.this).eXx + " swipeOn : " + MallIndexOSUI.a(MallIndexOSUI.this).eXy);
          if ((MallIndexOSUI.b(MallIndexOSUI.this)) || (MallIndexOSUI.this.vKB.vKW.isFinishing()))
          {
            w.e("MicroMsg.MallIndexOSUI", "error for callback ac finish");
            GMTrace.o(20962930065408L, 156186);
            return;
          }
          MallIndexOSUI.a(MallIndexOSUI.this, paramString.eXu);
          if (MallIndexOSUI.a(MallIndexOSUI.this).errCode == 0) {
            MallIndexOSUI.this.aNp();
          }
          GMTrace.o(20962930065408L, 156186);
        }
      };
      a.vgX.a(paramString, Looper.myLooper());
    }
    GMTrace.o(8005147951104L, 59643);
    return true;
  }
  
  public void finish()
  {
    GMTrace.i(20962124759040L, 156180);
    this.mSE = true;
    super.finish();
    GMTrace.o(20962124759040L, 156180);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8003268902912L, 59629);
    super.onCreate(paramBundle);
    this.mSF = new sn.b();
    this.mSC = View.inflate(this, a.g.sNj, null);
    this.mSC.setClickable(false);
    this.mSC.setEnabled(false);
    this.mSB = ((TextView)this.mSC.findViewById(a.f.sKL));
    this.mSA = com.tencent.mm.plugin.wallet_core.model.n.byD().wS(this.mRi);
    hN(1577);
    w.i("MicroMsg.MallIndexOSUI", "walletMallIndexOsUI ");
    paramBundle = new c();
    if (this.mSA != null)
    {
      ab localab = this.mSA;
      if ((localab.rjh != null) && (localab.rjh.uoL != null) && (localab.rjh.uoL.size() != 0)) {
        break label170;
      }
    }
    label170:
    for (int i = 1; i != 0; i = 0)
    {
      r(paramBundle);
      GMTrace.o(8003268902912L, 59629);
      return;
    }
    b(paramBundle, false);
    GMTrace.o(8003268902912L, 59629);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8004476862464L, 59638);
    super.onDestroy();
    hO(1577);
    GMTrace.o(8004476862464L, 59638);
  }
  
  public void onPause()
  {
    GMTrace.i(8004342644736L, 59637);
    super.onPause();
    GMTrace.o(8004342644736L, 59637);
  }
  
  public void onResume()
  {
    GMTrace.i(8004208427008L, 59636);
    super.onResume();
    int i = com.tencent.mm.k.g.ut().getInt("OverseaPayWalletInfoRefreshInternal", 15) * 1000;
    long l = System.currentTimeMillis();
    w.d("MicroMsg.MallIndexOSUI", "checkUpdate svrTime: %d lastUpdateTime : %d  curTime %d", new Object[] { Integer.valueOf(i), Long.valueOf(this.lastUpdateTime), Long.valueOf(l) });
    if (l - this.lastUpdateTime >= i)
    {
      this.lastUpdateTime = System.currentTimeMillis();
      b(new c(), false);
    }
    aNd();
    GMTrace.o(8004208427008L, 59636);
  }
  
  final class a
  {
    public TextView jPE;
    public CdnImageView mRv;
    public TextView mSN;
    public View view;
    
    a()
    {
      GMTrace.i(8002866249728L, 59626);
      GMTrace.o(8002866249728L, 59626);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\ui\MallIndexOSUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */