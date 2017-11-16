package com.tencent.mm.ui.account;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.plugin.accountsync.a.b;
import com.tencent.mm.plugin.accountsync.a.b.1;
import com.tencent.mm.plugin.accountsync.a.b.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.v;
import com.tencent.mm.pluginsdk.model.app.v.1;
import com.tencent.mm.pluginsdk.model.app.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.MMClearEditText;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.p;
import com.tencent.mm.xlog.app.XLogSetup;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import java.util.Iterator;
import java.util.LinkedList;

public class SimpleLoginUI
  extends MMWizardActivity
  implements com.tencent.mm.ad.e
{
  private TextWatcher WD;
  private String eVw;
  private ProgressDialog htG;
  private String osh;
  private SecurityImage vMf;
  private com.tencent.mm.sdk.b.c vPG;
  private f vQl;
  private String vQn;
  private String vQo;
  private ResizeLayout vQr;
  private MMClearEditText vRj;
  private MMClearEditText vRk;
  private MMFormInputView vRl;
  private MMFormInputView vRm;
  private Button vRn;
  private MMKeyboardUperView vRp;
  
  public SimpleLoginUI()
  {
    GMTrace.i(2714553548800L, 20225);
    this.htG = null;
    this.vMf = null;
    this.vQl = new f();
    this.eVw = "";
    this.WD = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(16833721663488L, 125421);
        SimpleLoginUI.a(SimpleLoginUI.this);
        GMTrace.o(16833721663488L, 125421);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16833855881216L, 125422);
        GMTrace.o(16833855881216L, 125422);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16833990098944L, 125423);
        GMTrace.o(16833990098944L, 125423);
      }
    };
    this.vPG = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(2714553548800L, 20225);
  }
  
  private void Wg()
  {
    GMTrace.i(2715627290624L, 20233);
    this.vQl.gUy = this.vRj.getText().toString().trim();
    this.vQl.vQY = this.vRk.getText().toString();
    if (this.vQl.gUy.equals(""))
    {
      com.tencent.mm.ui.base.h.h(this, R.l.ege, R.l.dHa);
      GMTrace.o(2715627290624L, 20233);
      return;
    }
    if (this.vQl.vQY.equals(""))
    {
      com.tencent.mm.ui.base.h.h(this, R.l.egb, R.l.dHa);
      GMTrace.o(2715627290624L, 20233);
      return;
    }
    aLo();
    final u localu = new u(this.vQl.gUy, this.vQl.vQY, this.osh, 0);
    at.wS().a(localu, 0);
    getString(R.l.cUG);
    this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(16818286624768L, 125306);
        at.wS().c(localu);
        GMTrace.o(16818286624768L, 125306);
      }
    });
    GMTrace.o(2715627290624L, 20233);
  }
  
  private void bci()
  {
    GMTrace.i(2715493072896L, 20232);
    boolean bool = getIntent().getBooleanExtra("key_auto_login_wizard_exit", false);
    if (!bool) {
      cancel();
    }
    Bh(1);
    if (bool) {
      exit(1);
    }
    GMTrace.o(2715493072896L, 20232);
  }
  
  protected final void MP()
  {
    GMTrace.i(2715358855168L, 20231);
    this.vRl = ((MMFormInputView)findViewById(R.h.bLp));
    this.vRm = ((MMFormInputView)findViewById(R.h.bLu));
    this.vRj = ((MMClearEditText)this.vRl.nUE);
    this.vRj.setFocusableInTouchMode(false);
    this.vRj.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16839895678976L, 125467);
        SimpleLoginUI.c(SimpleLoginUI.this).setFocusableInTouchMode(true);
        boolean bool = SimpleLoginUI.c(SimpleLoginUI.this).qLG.onTouch(paramAnonymousView, paramAnonymousMotionEvent);
        GMTrace.o(16839895678976L, 125467);
        return bool;
      }
    });
    this.vRk = ((MMClearEditText)this.vRm.nUE);
    this.vRk.setFocusableInTouchMode(false);
    this.vRk.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16829158260736L, 125387);
        SimpleLoginUI.d(SimpleLoginUI.this).setFocusableInTouchMode(true);
        SimpleLoginUI.c(SimpleLoginUI.this).setFocusableInTouchMode(false);
        boolean bool = SimpleLoginUI.d(SimpleLoginUI.this).qLG.onTouch(paramAnonymousView, paramAnonymousMotionEvent);
        GMTrace.o(16829158260736L, 125387);
        return bool;
      }
    });
    com.tencent.mm.ui.tools.a.c.d(this.vRk).Ea(16).a(null);
    this.vRn = ((Button)findViewById(R.h.bLq));
    this.vRn.setEnabled(false);
    this.vRj.addTextChangedListener(this.WD);
    this.vRk.addTextChangedListener(this.WD);
    this.vRk.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16829560913920L, 125390);
        if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
        {
          SimpleLoginUI.b(SimpleLoginUI.this);
          GMTrace.o(16829560913920L, 125390);
          return true;
        }
        GMTrace.o(16829560913920L, 125390);
        return false;
      }
    });
    this.vRk.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16805267505152L, 125209);
        if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
        {
          SimpleLoginUI.b(SimpleLoginUI.this);
          GMTrace.o(16805267505152L, 125209);
          return true;
        }
        GMTrace.o(16805267505152L, 125209);
        return false;
      }
    });
    this.vQr = ((ResizeLayout)findViewById(R.h.bYy));
    this.vRp = ((MMKeyboardUperView)findViewById(R.h.scrollView));
    this.vQr.vTZ = new ResizeLayout.a()
    {
      public final void bYy()
      {
        GMTrace.i(16845801259008L, 125511);
        SimpleLoginUI.e(SimpleLoginUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16825265946624L, 125358);
            SimpleLoginUI.e(SimpleLoginUI.this).fullScroll(130);
            GMTrace.o(16825265946624L, 125358);
          }
        });
        GMTrace.o(16845801259008L, 125511);
      }
    };
    this.vRp.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16834929623040L, 125430);
        SimpleLoginUI.this.aLo();
        GMTrace.o(16834929623040L, 125430);
        return false;
      }
    });
    findViewById(R.h.bLr).setVisibility(8);
    View localView = findViewById(R.h.bzF);
    if (localView != null) {
      localView.setVisibility(8);
    }
    oM(R.l.bLy);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16819494584320L, 125315);
        SimpleLoginUI.f(SimpleLoginUI.this);
        GMTrace.o(16819494584320L, 125315);
        return true;
      }
    });
    this.osh = getIntent().getStringExtra("auth_ticket");
    if (!bg.nm(this.osh))
    {
      this.vRj.setText(bg.nl(f.bYz()));
      this.vRk.setText(bg.nl(f.bYA()));
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16837882413056L, 125452);
          SimpleLoginUI.b(SimpleLoginUI.this);
          GMTrace.o(16837882413056L, 125452);
        }
      }, 500L);
    }
    if (com.tencent.mm.sdk.platformtools.f.vhu) {
      com.tencent.mm.plugin.c.a.hnI.e(this);
    }
    this.vRn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16849022484480L, 125535);
        SimpleLoginUI.b(SimpleLoginUI.this);
        GMTrace.o(16849022484480L, 125535);
      }
    });
    GMTrace.o(2715358855168L, 20231);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2716029943808L, 20236);
    w.i("MicroMsg.SimpleLoginUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    w.d("MicroMsg.SimpleLoginUI", "Scene Type " + paramk.getType());
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    this.eVw = ((u)paramk).Lu();
    int i;
    if (paramk.getType() == 701)
    {
      this.vQl.vRd = ((u)paramk).Lv();
      this.vQl.vRa = ((u)paramk).HQ();
      this.vQl.vRc = ((u)paramk).HP();
      this.vQl.vRb = ((u)paramk).Lw();
      if (paramInt2 == 65331)
      {
        this.osh = ((u)paramk).Hy();
        this.vQn = ((u)paramk).Lx();
        this.vQo = ((u)paramk).LA();
      }
      if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      {
        i = 1;
        at.wS().a(new bf(new bf.a()
        {
          public final void a(com.tencent.mm.network.e paramAnonymouse)
          {
            GMTrace.i(16830097784832L, 125394);
            if (paramAnonymouse == null)
            {
              GMTrace.o(16830097784832L, 125394);
              return;
            }
            paramAnonymouse = paramAnonymouse.DY();
            at.AR();
            int i = com.tencent.mm.y.c.ww();
            paramAnonymouse.i(new byte[0], i);
            GMTrace.o(16830097784832L, 125394);
          }
        }), 0);
      }
    }
    for (;;)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        at.unhold();
        com.tencent.mm.modelsimple.d.bk(this);
        com.tencent.mm.platformtools.m.nh(this.vQl.gUy);
        paramString = new b(this.vKB.vKW, new b.a()
        {
          public final void Qv()
          {
            String str = null;
            GMTrace.i(16840566767616L, 125472);
            v localv = new v(SimpleLoginUI.this, new v.a()
            {
              public final void bsT()
              {
                GMTrace.i(16845667041280L, 125510);
                SimpleLoginUI.this.finish();
                GMTrace.o(16845667041280L, 125510);
              }
            });
            Object localObject1 = ab.bPV();
            if (localObject1 != null)
            {
              localObject1 = ((SharedPreferences)localObject1).getString("key_app_ids_registion_while_not_login", "");
              if (bg.nm((String)localObject1)) {
                w.i("MicroMsg.AppUtil", "no saved appids while not login");
              }
            }
            else
            {
              localObject1 = null;
            }
            Object localObject2;
            for (;;)
            {
              localObject2 = str;
              if (localObject1 == null) {
                break label253;
              }
              localObject2 = str;
              if (((LinkedList)localObject1).isEmpty()) {
                break label253;
              }
              localObject2 = new LinkedList();
              localObject1 = ((LinkedList)localObject1).iterator();
              com.tencent.mm.pluginsdk.model.app.f localf;
              while (((Iterator)localObject1).hasNext())
              {
                str = (String)((Iterator)localObject1).next();
                localf = com.tencent.mm.pluginsdk.model.app.g.aP(str, false);
                if ((localf == null) || (localf.field_status == 0)) {
                  ((LinkedList)localObject2).add(str);
                }
              }
              localObject2 = ((String)localObject1).split("\\|");
              if ((localObject2 == null) || (localObject2.length <= 0)) {
                break;
              }
              localObject1 = new LinkedList();
              int m = localObject2.length;
              int i = 0;
              int k;
              for (int j = 1; i < m; j = k)
              {
                localf = localObject2[i];
                k = j;
                if (!bg.nm(localf))
                {
                  ((LinkedList)localObject1).add(localf);
                  k = j + 1;
                }
                if (k > 5) {
                  break;
                }
                i += 1;
              }
            }
            label253:
            if ((localObject2 == null) || (((LinkedList)localObject2).isEmpty()))
            {
              w.i("MicroMsg.LoadAppInfoAfterLogin", "no saved appids, just callback");
              com.tencent.mm.pluginsdk.model.app.g.bJw();
              if (localv.toe != null) {
                localv.toe.bsT();
              }
              GMTrace.o(16840566767616L, 125472);
              return;
            }
            w.i("MicroMsg.LoadAppInfoAfterLogin", "now do batch get appinfos, appid liSst size is :%d", new Object[] { Integer.valueOf(((LinkedList)localObject2).size()) });
            an.aGk().a(7, localv);
            an.aWx().at((LinkedList)localObject2);
            if ((localv.mContext != null) && (!((Activity)localv.mContext).isFinishing()))
            {
              localObject1 = localv.mContext;
              localv.mContext.getString(R.l.cUG);
              localv.hsU = com.tencent.mm.ui.base.h.a((Context)localObject1, localv.mContext.getString(R.l.cUV), true, new v.1(localv));
              GMTrace.o(16840566767616L, 125472);
              return;
            }
            if (localv.toe != null) {
              localv.toe.bsT();
            }
            w.e("MicroMsg.LoadAppInfoAfterLogin", "dz[loadAppInfo:catch the null window for progress bar");
            GMTrace.o(16840566767616L, 125472);
          }
        });
        paramString.eEg = com.tencent.mm.plugin.c.a.hnI.a(paramString);
        if (paramString.eEg == null)
        {
          if (paramString.hsV != null) {
            paramString.hsV.Qv();
          }
          GMTrace.o(2716029943808L, 20236);
          return;
        }
        if (paramString.eEg.getType() == 139) {
          at.wS().a(139, paramString);
        }
        for (;;)
        {
          at.wS().a(paramString.eEg, 0);
          paramk = paramString.context;
          paramString.context.getString(R.l.cUG);
          paramString.hsU = com.tencent.mm.ui.base.h.a(paramk, paramString.context.getString(R.l.cTt), true, new b.1(paramString));
          GMTrace.o(2716029943808L, 20236);
          return;
          if (paramString.eEg.getType() == 138) {
            at.wS().a(138, paramString);
          }
        }
      }
      if (paramInt2 == 65319)
      {
        com.tencent.mm.platformtools.m.a(this, com.tencent.mm.pluginsdk.a.a.a((u)paramk), paramInt2);
        GMTrace.o(2716029943808L, 20236);
        return;
      }
      if (com.tencent.mm.plugin.c.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString)) {
        i = 1;
      }
      while (i != 0)
      {
        GMTrace.o(2716029943808L, 20236);
        return;
        if (paramInt1 == 4) {}
        switch (paramInt2)
        {
        default: 
          i = 0;
          break;
        case -1: 
          if (at.wS().DN() == 5)
          {
            com.tencent.mm.ui.base.h.h(this, R.l.dLj, R.l.dLi);
            i = 1;
          }
          break;
        case -30: 
        case -4: 
        case -3: 
          com.tencent.mm.ui.base.h.h(this, R.l.dqu, R.l.dHa);
          i = 1;
          break;
        case -9: 
          com.tencent.mm.ui.base.h.h(this, R.l.dGZ, R.l.dHa);
          i = 1;
          break;
        case -72: 
          com.tencent.mm.ui.base.h.h(this.vKB.vKW, R.l.dRN, R.l.cUG);
          i = 1;
          break;
        case -75: 
          com.tencent.mm.platformtools.m.bw(this.vKB.vKW);
          i = 1;
          break;
        case -311: 
        case -310: 
        case -6: 
          if (this.vMf == null) {
            this.vMf = SecurityImage.a.a(this.vKB.vKW, R.l.dRU, this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb, new DialogInterface.OnClickListener()
            {
              public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(16841372073984L, 125478);
                w.d("MicroMsg.SimpleLoginUI", "imgSid:" + SimpleLoginUI.g(SimpleLoginUI.this).vRa + " img len" + SimpleLoginUI.g(SimpleLoginUI.this).vRc.length + " " + com.tencent.mm.compatible.util.g.tC());
                paramAnonymousDialogInterface = new u(SimpleLoginUI.g(SimpleLoginUI.this).gUy, SimpleLoginUI.g(SimpleLoginUI.this).vQY, SimpleLoginUI.g(SimpleLoginUI.this).vRd, SimpleLoginUI.h(SimpleLoginUI.this).bZo(), SimpleLoginUI.h(SimpleLoginUI.this).vRa, SimpleLoginUI.h(SimpleLoginUI.this).vRb, 0, "", false, false);
                at.wS().a(paramAnonymousDialogInterface, 0);
                SimpleLoginUI localSimpleLoginUI1 = SimpleLoginUI.this;
                SimpleLoginUI localSimpleLoginUI2 = SimpleLoginUI.this;
                SimpleLoginUI.this.getString(R.l.cUG);
                SimpleLoginUI.a(localSimpleLoginUI1, com.tencent.mm.ui.base.h.a(localSimpleLoginUI2, SimpleLoginUI.this.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
                {
                  public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                  {
                    GMTrace.i(16841908944896L, 125482);
                    at.wS().c(paramAnonymousDialogInterface);
                    GMTrace.o(16841908944896L, 125482);
                  }
                }));
                GMTrace.o(16841372073984L, 125478);
              }
            }, null, new DialogInterface.OnDismissListener()
            {
              public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(16838821937152L, 125459);
                SimpleLoginUI.i(SimpleLoginUI.this);
                GMTrace.o(16838821937152L, 125459);
              }
            }, this.vQl);
          }
          for (;;)
          {
            i = 1;
            break;
            w.d("MicroMsg.SimpleLoginUI", "imgSid:" + this.vQl.vRa + " img len" + this.vQl.vRc.length + " " + com.tencent.mm.compatible.util.g.tC());
            this.vMf.a(this.vQl.vRd, this.vQl.vRc, this.vQl.vRa, this.vQl.vRb);
          }
        case -100: 
          at.hold();
          com.tencent.mm.ui.base.h.a(this, at.wy(), getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(16837748195328L, 125451);
              GMTrace.o(16837748195328L, 125451);
            }
          }, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(16842982686720L, 125490);
              GMTrace.o(16842982686720L, 125490);
            }
          });
          i = 1;
          break;
        case -205: 
          w.i("MicroMsg.SimpleLoginUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bg.SJ(this.osh), this.vQo });
          f.a(this.vQl);
          paramk = new Intent();
          paramk.putExtra("auth_ticket", this.osh);
          paramk.putExtra("binded_mobile", this.vQn);
          paramk.putExtra("close_safe_device_style", this.vQo);
          paramk.putExtra("from_source", 3);
          com.tencent.mm.plugin.c.a.hnH.f(this, paramk);
          i = 1;
          break;
        case -140: 
          if (!bg.nm(this.eVw)) {
            com.tencent.mm.platformtools.m.j(this, paramString, this.eVw);
          }
          i = 1;
          break;
        case -106: 
          com.tencent.mm.platformtools.m.b(this, paramString, 0);
          i = 1;
        }
      }
      paramString = com.tencent.mm.h.a.dH(paramString);
      if ((paramString != null) && (paramString.a(this, null, null)))
      {
        GMTrace.o(2716029943808L, 20236);
        return;
      }
      Toast.makeText(this, getString(R.l.dws, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(2716029943808L, 20236);
      return;
      i = 0;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2714687766528L, 20226);
    int i = R.i.cAS;
    GMTrace.o(2714687766528L, 20226);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    GMTrace.i(2716164161536L, 20237);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      w.d("MicroMsg.SimpleLoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt2 != -1) || (paramInt1 != 1024) || (paramIntent == null)) {
        break label184;
      }
      str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
      bool = bg.nm(str);
      if (!bg.nm(str)) {
        break label175;
      }
    }
    label175:
    for (paramInt1 = i;; paramInt1 = str.length())
    {
      w.d("MicroMsg.SimpleLoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 != 65319) {
        break label184;
      }
      Wg();
      GMTrace.o(2716164161536L, 20237);
      return;
      bool = false;
      break;
    }
    label184:
    GMTrace.o(2716164161536L, 20237);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int j = 0;
    GMTrace.i(2714821984256L, 20227);
    super.onCreate(paramBundle);
    paramBundle = getSharedPreferences("system_config_prefs", 4);
    if (paramBundle.getBoolean("first_launch_weixin", true))
    {
      paramBundle.edit().putBoolean("first_launch_weixin", false).commit();
      XLogSetup.realSetupXlog();
    }
    oM(R.l.app_name);
    if (com.tencent.mm.plugin.c.a.hnI != null) {
      com.tencent.mm.plugin.c.a.hnI.pu();
    }
    MP();
    at.wS().a(701, this);
    boolean bool = com.tencent.mm.pluginsdk.h.a.f(this, "android.permission.WRITE_EXTERNAL_STORAGE");
    w.i("MicroMsg.MPermissionUtil", "summerper checkPermission checkStorage[%b]", new Object[] { Boolean.valueOf(bool) });
    int i;
    if (!bool) {
      i = j;
    }
    for (;;)
    {
      if (i == 0)
      {
        new Intent().addFlags(67108864);
        com.tencent.mm.plugin.c.a.hnH.s(new Intent(), this);
      }
      GMTrace.o(2714821984256L, 20227);
      return;
      bool = com.tencent.mm.pluginsdk.h.a.f(this, "android.permission.READ_PHONE_STATE");
      w.i("MicroMsg.MPermissionUtil", "summerper checkPermission checkPhone[%b]", new Object[] { Boolean.valueOf(bool) });
      i = j;
      if (bool)
      {
        bool = com.tencent.mm.pluginsdk.h.a.f(this, "android.permission.ACCESS_COARSE_LOCATION");
        w.i("MicroMsg.MPermissionUtil", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
        i = j;
        if (bool) {
          i = 1;
        }
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(2715090419712L, 20229);
    at.wS().b(701, this);
    super.onDestroy();
    GMTrace.o(2715090419712L, 20229);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2715761508352L, 20234);
    if (paramInt == 4)
    {
      bci();
      GMTrace.o(2715761508352L, 20234);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2715761508352L, 20234);
    return bool;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(2715224637440L, 20230);
    super.onNewIntent(paramIntent);
    this.osh = paramIntent.getStringExtra("auth_ticket");
    paramIntent = getIntent().getExtras();
    if (paramIntent != null) {
      this.osh = paramIntent.getString("auth_ticket");
    }
    if (!bg.nm(this.osh))
    {
      this.vRj.setText(bg.nl(f.bYz()));
      this.vRk.setText(bg.nl(f.bYA()));
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16833453228032L, 125419);
          SimpleLoginUI.b(SimpleLoginUI.this);
          GMTrace.o(16833453228032L, 125419);
        }
      }, 500L);
    }
    GMTrace.o(2715224637440L, 20230);
  }
  
  protected void onPause()
  {
    GMTrace.i(2715895726080L, 20235);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.vPG);
    GMTrace.o(2715895726080L, 20235);
  }
  
  public void onResume()
  {
    GMTrace.i(2714956201984L, 20228);
    com.tencent.mm.sdk.b.a.vgX.b(this.vPG);
    super.onResume();
    GMTrace.o(2714956201984L, 20228);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\SimpleLoginUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */