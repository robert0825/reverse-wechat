package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.l;

@a(3)
public class ShowAgreementsUI
  extends MMActivity
{
  private String countryCode;
  private TextView iZs;
  private int type;
  private MMWebView vUk;
  private TextView vUl;
  private TextView vUm;
  private String vUn;
  
  public ShowAgreementsUI()
  {
    GMTrace.i(19233534640128L, 143301);
    GMTrace.o(19233534640128L, 143301);
  }
  
  protected final void MP()
  {
    GMTrace.i(19233803075584L, 143303);
    cN().cO().hide();
    overridePendingTransition(R.a.aLG, R.a.aLj);
    this.type = getIntent().getIntExtra("agreement_type", 0);
    this.countryCode = getIntent().getStringExtra("country_code");
    this.iZs = ((TextView)findViewById(R.h.bdy));
    Object localObject = this.vKB.hqF;
    int i = R.h.bdA;
    MMWebView.fI(this);
    localObject = (MMWebView)((View)localObject).findViewById(i);
    ((MMWebView)localObject).fRu = true;
    boolean bool;
    if (((MMWebView)localObject).getX5WebViewExtension() != null)
    {
      bool = true;
      MMWebView.c((MMWebView)localObject, bool);
      this.vUk = ((MMWebView)localObject);
      this.vUk.getSettings().setJavaScriptEnabled(true);
      this.vUl = ((TextView)findViewById(R.h.bdz));
      this.vUm = ((TextView)findViewById(R.h.bdw));
      this.vUn = getIntent().getStringExtra("disagree_tip");
      if (bg.nm(this.vUn)) {
        this.vUn = getString(R.l.dGr);
      }
      if (this.type != 0) {
        break label338;
      }
      this.iZs.setVisibility(0);
      this.iZs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19239440220160L, 143345);
          g.ork.a(712L, 1L, 1L, false);
          ShowAgreementsUI.this.finish();
          GMTrace.o(19239440220160L, 143345);
        }
      });
      this.vUm.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19239037566976L, 143342);
          g.ork.a(712L, 2L, 1L, false);
          ShowAgreementsUI.this.setResult(-1);
          ShowAgreementsUI.this.finish();
          GMTrace.o(19239037566976L, 143342);
        }
      });
      this.vUl.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19233266204672L, 143299);
          g.ork.a(712L, 1L, 1L, false);
          ShowAgreementsUI.this.finish();
          GMTrace.o(19233266204672L, 143299);
        }
      });
      g.ork.a(712L, 0L, 1L, false);
    }
    for (;;)
    {
      if (bg.nm(this.countryCode)) {
        this.countryCode = v.bPJ();
      }
      if (!this.countryCode.equals("CN")) {
        break label393;
      }
      this.vUk.loadUrl(getString(R.l.dGv, new Object[] { v.bPK(), this.countryCode }));
      GMTrace.o(19233803075584L, 143303);
      return;
      bool = false;
      break;
      label338:
      if (this.type == 1)
      {
        this.vUm.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(19235145252864L, 143313);
            g.ork.a(712L, 5L, 1L, false);
            ShowAgreementsUI.this.setResult(102001);
            ShowAgreementsUI.this.finish();
            GMTrace.o(19235145252864L, 143313);
          }
        });
        this.vUl.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(19229642326016L, 143272);
            h.a(ShowAgreementsUI.this, ShowAgreementsUI.a(ShowAgreementsUI.this), "", ShowAgreementsUI.this.getString(R.l.dGt), ShowAgreementsUI.this.getString(R.l.cRM), false, null, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(19239977091072L, 143349);
                g.ork.a(712L, 4L, 1L, true);
                ShowAgreementsUI.this.setResult(102002);
                ShowAgreementsUI.this.finish();
                GMTrace.o(19239977091072L, 143349);
              }
            });
            GMTrace.o(19229642326016L, 143272);
          }
        });
        g.ork.a(712L, 3L, 1L, false);
      }
    }
    label393:
    this.vUk.loadUrl(getString(R.l.dGu));
    GMTrace.o(19233803075584L, 143303);
  }
  
  public void finish()
  {
    GMTrace.i(19234071511040L, 143305);
    w.i("MicroMsg.ShowAgreementsUI", "onFinish");
    super.finish();
    overridePendingTransition(R.a.aLj, R.a.aLE);
    GMTrace.o(19234071511040L, 143305);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19233937293312L, 143304);
    int i = R.i.cGz;
    GMTrace.o(19233937293312L, 143304);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19233668857856L, 143302);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(19233668857856L, 143302);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(19234474164224L, 143308);
    if (paramInt == 4)
    {
      GMTrace.o(19234474164224L, 143308);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(19234474164224L, 143308);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(19234339946496L, 143307);
    super.onPause();
    GMTrace.o(19234339946496L, 143307);
  }
  
  protected void onResume()
  {
    GMTrace.i(19234205728768L, 143306);
    super.onResume();
    GMTrace.o(19234205728768L, 143306);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\ShowAgreementsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */