package com.tencent.mm.ui.conversation.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jx;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;

public final class n
  extends b
{
  private boolean gLX;
  public TextView hqH;
  private TextView hqI;
  private ProgressDialog htG;
  private ImageView iub;
  public View jcL;
  public int qAs;
  private TextView qud;
  private TextView xaj;
  private TextView xak;
  private ImageView xal;
  private ImageView xam;
  private ImageView xan;
  private ProgressBar xao;
  public String xap;
  private boolean xaq;
  public int xar;
  public boolean xas;
  public boolean xat;
  public boolean xau;
  public String xav;
  public aj xaw;
  public com.tencent.mm.sdk.b.c<jx> xax;
  public boolean xay;
  
  public n(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14503299252224L, 108058);
    this.htG = null;
    this.gLX = false;
    this.xaq = false;
    this.qAs = 0;
    this.jcL = null;
    this.xay = false;
    initialize();
    GMTrace.o(14503299252224L, 108058);
  }
  
  private void initialize()
  {
    GMTrace.i(14503567687680L, 108060);
    if ((!this.xaq) && (this.view != null))
    {
      this.jcL = this.view.findViewById(R.h.bSh);
      this.hqH = ((TextView)this.view.findViewById(R.h.bSc));
      this.hqI = ((TextView)this.view.findViewById(R.h.bSd));
      this.qud = ((TextView)this.view.findViewById(R.h.bSe));
      this.xaj = ((TextView)this.view.findViewById(R.h.bSb));
      this.xao = ((ProgressBar)this.view.findViewById(R.h.bSg));
      this.iub = ((ImageView)this.view.findViewById(R.h.bSf));
      this.xal = ((ImageView)this.view.findViewById(R.h.bps));
      this.xam = ((ImageView)this.view.findViewById(R.h.bBd));
      this.xan = ((ImageView)this.view.findViewById(R.h.cfc));
      this.xak = ((TextView)this.view.findViewById(R.h.bwI));
      this.xal.setVisibility(8);
      this.xaq = true;
    }
    GMTrace.o(14503567687680L, 108060);
  }
  
  public final void DJ(int paramInt)
  {
    GMTrace.i(20390491455488L, 151921);
    Intent localIntent = new Intent();
    localIntent.putExtra("diagnose_state", paramInt);
    localIntent.putExtra("diagnose_percent", this.xar);
    localIntent.putExtra("diagnose_kvInfo", this.xav);
    w.i("MicroMsg.NetWarnView", "put state: %d, process: %d, kv: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.xar), this.xav });
    com.tencent.mm.bj.d.b((Context)this.tyb.get(), "traceroute", ".ui.NetworkDiagnoseAllInOneUI", localIntent);
    GMTrace.o(20390491455488L, 151921);
  }
  
  public final boolean abd()
  {
    int j = 0;
    GMTrace.i(14503836123136L, 108062);
    final int i = at.wS().DN();
    final Object localObject = at.wS().getNetworkServerIp();
    this.xap = String.format("http://w.mail.qq.com/cgi-bin/report_mm?failuretype=1&devicetype=2&clientversion=%s&os=%s&username=%s&iport=%s&t=weixin_bulletin&f=xhtml&lang=%s", new Object[] { "0x" + Integer.toHexString(com.tencent.mm.protocal.d.tJC), com.tencent.mm.protocal.d.DEVICE_TYPE, com.tencent.mm.y.q.zE(), localObject, v.bPK() });
    initialize();
    w.i("MicroMsg.NetWarnView", "update st:%d", new Object[] { Integer.valueOf(i) });
    boolean bool1;
    boolean bool2;
    switch (i)
    {
    case 1: 
    case 4: 
    default: 
      bool1 = false;
      if (bool1)
      {
        this.qud.setVisibility(8);
        this.hqH.setVisibility(0);
        this.jcL.setBackgroundResource(R.g.bbb);
        localObject = new LinearLayout.LayoutParams(this.iub.getLayoutParams());
        ((LinearLayout.LayoutParams)localObject).setMargins(com.tencent.mm.br.a.fromDPToPix((Context)this.tyb.get(), 10), 0, com.tencent.mm.br.a.fromDPToPix((Context)this.tyb.get(), 4), 0);
        this.iub.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.iub.setImageResource(R.k.cPh);
        this.xam.setVisibility(8);
        this.xan.setVisibility(8);
        this.xak.setVisibility(8);
        bool2 = bool1;
        label286:
        bool1 = bool2;
        if (!bool2)
        {
          this.xal.setVisibility(8);
          bool1 = bool2;
          if (r.hjD)
          {
            i = am.getBackgroundLimitType((Context)this.tyb.get());
            if ((!am.isLimited(i)) || (this.xay)) {
              break label1313;
            }
            this.hqH.setText(((Context)this.tyb.get()).getString(R.l.dOH));
            this.hqI.setText(((Context)this.tyb.get()).getString(R.l.dOG));
            this.hqI.setVisibility(0);
            this.xaj.setVisibility(8);
            this.xao.setVisibility(8);
            this.iub.setVisibility(0);
            this.xal.setVisibility(0);
            this.jcL.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(20391162544128L, 151926);
                try
                {
                  am.startSettingItent((Context)n.this.tyb.get(), i);
                  GMTrace.o(20391162544128L, 151926);
                  return;
                }
                catch (Exception paramAnonymousView)
                {
                  w.printErrStackTrace("MicroMsg.NetWarnView", paramAnonymousView, "", new Object[0]);
                  GMTrace.o(20391162544128L, 151926);
                }
              }
            });
            this.xal.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(20392102068224L, 151933);
                MMAppMgr.a((Context)n.this.tyb.get(), i, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(20389954584576L, 151917);
                    try
                    {
                      n.this.jcL.setVisibility(8);
                      n.this.xay = true;
                      am.startSettingItent((Context)n.this.tyb.get(), n.8.this.val$type);
                      GMTrace.o(20389954584576L, 151917);
                      return;
                    }
                    catch (Exception paramAnonymous2DialogInterface)
                    {
                      w.printErrStackTrace("MicroMsg.NetWarnView", paramAnonymous2DialogInterface, "", new Object[0]);
                      GMTrace.o(20389954584576L, 151917);
                    }
                  }
                }, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(20390357237760L, 151920);
                    n.this.jcL.setVisibility(8);
                    n.this.xay = true;
                    GMTrace.o(20390357237760L, 151920);
                  }
                });
                GMTrace.o(20392102068224L, 151933);
              }
            });
            bool1 = true;
          }
        }
        label462:
        this.xan.setImageResource(R.k.cLb);
        this.xal.setImageResource(R.g.aUj);
        localObject = this.jcL;
        if (!bool1) {
          break label1328;
        }
      }
      break;
    }
    label1045:
    label1091:
    label1236:
    label1308:
    label1313:
    label1328:
    for (i = j;; i = 8)
    {
      ((View)localObject).setVisibility(i);
      GMTrace.o(14503836123136L, 108062);
      return bool1;
      this.hqH.setText(R.l.dLh);
      this.hqI.setVisibility(8);
      this.xaj.setVisibility(8);
      this.xao.setVisibility(8);
      this.iub.setVisibility(0);
      this.jcL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14505580953600L, 108075);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("title", ((Context)n.this.tyb.get()).getString(R.l.dLh));
          paramAnonymousView.putExtra("rawUrl", ((Context)n.this.tyb.get()).getString(R.l.dLe));
          paramAnonymousView.putExtra("showShare", false);
          com.tencent.mm.bj.d.b((Context)n.this.tyb.get(), "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(14505580953600L, 108075);
        }
      });
      bool1 = true;
      break;
      this.hqH.setText(R.l.dLd);
      this.hqI.setVisibility(8);
      this.xaj.setVisibility(8);
      this.xao.setVisibility(0);
      this.iub.setVisibility(0);
      bool1 = true;
      break;
      if (this.qAs == 1) {
        this.hqH.setText(((Context)this.tyb.get()).getResources().getString(R.l.dLg, new Object[] { Integer.valueOf(this.xar) }));
      }
      for (;;)
      {
        this.hqI.setVisibility(8);
        this.xaj.setVisibility(8);
        this.xao.setVisibility(8);
        this.iub.setVisibility(0);
        this.jcL.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(14501822857216L, 108047);
            n.this.DJ(n.this.qAs);
            n.this.qAs = 1;
            if (n.this.xax == null)
            {
              paramAnonymousView = n.this;
              paramAnonymousView.xax = new n.1(paramAnonymousView);
              com.tencent.mm.sdk.b.a.vgX.a(paramAnonymousView.xax);
            }
            if (n.this.xaw == null)
            {
              paramAnonymousView = n.this;
              paramAnonymousView.xaw = new aj(new n.2(paramAnonymousView), true);
              paramAnonymousView.xaw.z(1000L, 1000L);
            }
            GMTrace.o(14501822857216L, 108047);
          }
        });
        bool1 = true;
        break;
        this.hqH.setText(R.l.dLf);
      }
      this.hqH.setText(R.l.dLi);
      this.hqI.setText(((Context)this.tyb.get()).getString(R.l.dLj));
      this.hqI.setVisibility(0);
      this.xaj.setVisibility(8);
      this.xao.setVisibility(8);
      this.iub.setVisibility(0);
      this.jcL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14510144356352L, 108109);
          if (!t.E((Context)n.this.tyb.get(), n.this.xap))
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("title", ((Context)n.this.tyb.get()).getString(R.l.dLk));
            paramAnonymousView.putExtra("rawUrl", ((Context)n.this.tyb.get()).getString(R.l.dLe));
            paramAnonymousView.putExtra("showShare", false);
            com.tencent.mm.bj.d.b((Context)n.this.tyb.get(), "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          }
          GMTrace.o(14510144356352L, 108109);
        }
      });
      bool1 = true;
      break;
      at.AR();
      if (com.tencent.mm.y.c.yF())
      {
        at.AR();
        if (com.tencent.mm.modelsimple.q.gX(com.tencent.mm.y.c.yG()))
        {
          localObject = at.wS();
          at.AR();
          ((com.tencent.mm.ad.n)localObject).a(new com.tencent.mm.modelsimple.q(com.tencent.mm.y.c.yG()), 0);
          bool2 = bool1;
          break label286;
        }
      }
      at.AR();
      bool2 = bool1;
      if (!com.tencent.mm.y.c.yF()) {
        break label286;
      }
      bool2 = bool1;
      if (t.nm(com.tencent.mm.modelsimple.q.gUj)) {
        break label286;
      }
      bool2 = bool1;
      if (com.tencent.mm.modelsimple.q.Lo()) {
        break label286;
      }
      this.jcL.setBackgroundResource(R.g.bbc);
      localObject = new LinearLayout.LayoutParams(this.iub.getLayoutParams());
      ((LinearLayout.LayoutParams)localObject).setMargins(com.tencent.mm.br.a.fromDPToPix((Context)this.tyb.get(), 22), 0, com.tencent.mm.br.a.fromDPToPix((Context)this.tyb.get(), 20), 0);
      this.iub.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.hqH.setVisibility(8);
      this.hqI.setVisibility(8);
      this.qud.setVisibility(0);
      if (com.tencent.mm.y.q.fo(com.tencent.mm.y.q.zK())) {
        if ((!com.tencent.mm.modelsimple.q.Lr()) && (com.tencent.mm.modelsimple.q.Lp()))
        {
          this.qud.setText(com.tencent.mm.modelsimple.q.gUq);
          this.xaj.setVisibility(8);
          this.xao.setVisibility(8);
          this.iub.setPadding(0, 0, 0, 0);
          if (com.tencent.mm.modelsimple.q.Ln() != 1) {
            break label1236;
          }
          this.iub.setImageResource(R.k.cLN);
          this.iub.setVisibility(0);
          this.xam.setVisibility(8);
          this.xan.setVisibility(8);
          localObject = this.xak;
          if (!com.tencent.mm.y.q.fo(com.tencent.mm.y.q.zK())) {
            break label1308;
          }
        }
      }
      for (i = 8;; i = 0)
      {
        ((TextView)localObject).setVisibility(i);
        localObject = new Intent();
        ((Intent)localObject).putExtra("intent.key.online_version", com.tencent.mm.modelsimple.q.Lq());
        this.jcL.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(14512023404544L, 108123);
            com.tencent.mm.bj.d.b((Context)n.this.tyb.get(), "webwx", ".ui.WebWXLogoutUI", localObject);
            GMTrace.o(14512023404544L, 108123);
          }
        });
        bool2 = true;
        break;
        this.qud.setText(com.tencent.mm.modelsimple.q.gUj);
        break label1045;
        if ((!com.tencent.mm.modelsimple.q.Lr()) && (com.tencent.mm.modelsimple.q.Lp()))
        {
          this.qud.setText(com.tencent.mm.modelsimple.q.gUr);
          break label1045;
        }
        this.qud.setText(com.tencent.mm.modelsimple.q.gUm);
        break label1045;
        if (com.tencent.mm.modelsimple.q.Ln() == 2)
        {
          if (com.tencent.mm.modelsimple.q.Lp())
          {
            this.iub.setImageResource(R.k.cLM);
            break label1091;
          }
          this.iub.setImageResource(R.k.cLL);
          break label1091;
        }
        if (com.tencent.mm.modelsimple.q.Ln() == 3)
        {
          this.iub.setImageResource(R.k.cLK);
          break label1091;
        }
        this.iub.setImageResource(R.k.cPd);
        break label1091;
      }
      this.xal.setVisibility(8);
      bool1 = bool2;
      break label462;
    }
  }
  
  public final void chq()
  {
    GMTrace.i(20390625673216L, 151922);
    if (this.xaw != null)
    {
      this.xaw.stopTimer();
      this.xaw = null;
    }
    GMTrace.o(20390625673216L, 151922);
  }
  
  public final void destroy()
  {
    GMTrace.i(14503701905408L, 108061);
    chq();
    if (this.xax != null) {
      com.tencent.mm.sdk.b.a.vgX.c(this.xax);
    }
    GMTrace.o(14503701905408L, 108061);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14503433469952L, 108059);
    int i = R.i.cCV;
    GMTrace.o(14503433469952L, 108059);
    return i;
  }
  
  public final int getOrder()
  {
    GMTrace.i(16853585887232L, 125569);
    GMTrace.o(16853585887232L, 125569);
    return 2;
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(14504104558592L, 108064);
    if (this.jcL != null) {
      this.jcL.setVisibility(paramInt);
    }
    GMTrace.o(14504104558592L, 108064);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */