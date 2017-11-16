package com.tencent.mm.ui.bindlinkedin;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.ar.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class BindLinkedInUI
  extends MMActivity
  implements e
{
  private String fjv;
  private String fjw;
  private ProgressDialog jIU;
  private boolean nNT;
  private String name;
  private int status;
  private boolean wmA;
  private boolean wmB;
  private Bundle wmC;
  private boolean wmD;
  private boolean wmE;
  private TextView wmF;
  private TextView wmG;
  private View wmH;
  private MMSwitchBtn wmI;
  private TextView wmJ;
  private TextView wmK;
  private TextView wmL;
  private String wmM;
  private String wmN;
  private String wmO;
  private String wmP;
  private String wmy;
  private boolean wmz;
  
  public BindLinkedInUI()
  {
    GMTrace.i(1651012272128L, 12301);
    this.nNT = false;
    this.wmz = false;
    this.wmA = false;
    this.wmB = false;
    this.wmD = false;
    this.wmE = false;
    GMTrace.o(1651012272128L, 12301);
  }
  
  private void O(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1652757102592L, 12314);
    if (paramBoolean1)
    {
      this.status |= 0x400000;
      if (!paramBoolean1) {
        break label130;
      }
    }
    label130:
    for (int i = 1;; i = 2)
    {
      at.AR();
      c.xh().set(7, Integer.valueOf(this.status));
      if (paramBoolean2)
      {
        uu localuu = new uu();
        localuu.umY = 33;
        localuu.umZ = i;
        at.AR();
        c.yJ().b(new e.a(23, localuu));
        com.tencent.mm.plugin.c.a.hnI.pr();
      }
      GMTrace.o(1652757102592L, 12314);
      return;
      this.status &= 0xFFBFFFFF;
      break;
    }
  }
  
  private void PY()
  {
    boolean bool2 = true;
    GMTrace.i(1651817578496L, 12307);
    at.AR();
    this.wmy = ((String)c.xh().get(286721, null));
    if (!bg.nm(this.wmy))
    {
      bool1 = true;
      this.nNT = bool1;
      at.AR();
      this.name = ((String)c.xh().get(286722, null));
      this.status = q.zI();
      if ((this.status & 0x400000) == 0) {
        break label107;
      }
    }
    label107:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.wmz = bool1;
      GMTrace.o(1651817578496L, 12307);
      return;
      bool1 = false;
      break;
    }
  }
  
  private void VN(String paramString)
  {
    GMTrace.i(1652354449408L, 12311);
    int i = getString(R.l.djD).indexOf("%s");
    Object localObject = getString(R.l.djD, new Object[] { paramString });
    localObject = Spannable.Factory.getInstance().newSpannable((CharSequence)localObject);
    ((Spannable)localObject).setSpan(new ClickableSpan()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1656515198976L, 12342);
        GMTrace.o(1656515198976L, 12342);
      }
      
      public final void updateDrawState(TextPaint paramAnonymousTextPaint)
      {
        GMTrace.i(1656649416704L, 12343);
        paramAnonymousTextPaint.setColor(BindLinkedInUI.this.getResources().getColor(R.e.aOm));
        paramAnonymousTextPaint.setUnderlineText(false);
        GMTrace.o(1656649416704L, 12343);
      }
    }, i, paramString.length() + i, 33);
    this.wmF.setText((CharSequence)localObject);
    GMTrace.o(1652354449408L, 12311);
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3)
  {
    GMTrace.i(1652488667136L, 12312);
    this.wmL.setVisibility(8);
    if (paramBoolean1)
    {
      this.wmG.setVisibility(8);
      this.wmF.setVisibility(0);
      VN(paramString);
      this.wmH.setVisibility(0);
      this.wmJ.setVisibility(8);
      if (paramBoolean2) {
        this.wmK.setVisibility(0);
      }
      this.wmI.mK(paramBoolean3);
      this.wmI.xrE = new MMSwitchBtn.a()
      {
        public final void cc(boolean paramAnonymousBoolean)
        {
          GMTrace.i(1650609618944L, 12298);
          BindLinkedInUI.a(BindLinkedInUI.this, paramAnonymousBoolean, true);
          GMTrace.o(1650609618944L, 12298);
        }
      };
      GMTrace.o(1652488667136L, 12312);
      return;
    }
    this.wmF.setVisibility(8);
    this.wmF.setText(getString(R.l.djE));
    this.wmG.setVisibility(0);
    this.wmH.setVisibility(8);
    this.wmJ.setVisibility(0);
    this.wmK.setVisibility(8);
    GMTrace.o(1652488667136L, 12312);
  }
  
  private void ar()
  {
    int i = 1;
    GMTrace.i(1652622884864L, 12313);
    if ((this.wmA) && (this.wmC == null))
    {
      w.e("MicroMsg.BindLinkedInUI", "bindBundle is null");
      GMTrace.o(1652622884864L, 12313);
      return;
    }
    if (this.wmB)
    {
      a(this.nNT, false, this.name, this.wmz);
      GMTrace.o(1652622884864L, 12313);
      return;
    }
    if (this.wmA)
    {
      if ((this.nNT) && (this.wmy.equals(this.fjv))) {}
      boolean bool;
      for (;;)
      {
        String str = this.fjw;
        bool = this.wmz;
        this.wmF.setVisibility(0);
        VN(str);
        this.wmH.setVisibility(0);
        this.wmK.setVisibility(8);
        if (i == 0) {
          break;
        }
        this.wmG.setVisibility(8);
        this.wmJ.setVisibility(8);
        this.wmL.setVisibility(8);
        this.wmI.mK(bool);
        this.wmI.xrE = new MMSwitchBtn.a()
        {
          public final void cc(boolean paramAnonymousBoolean)
          {
            GMTrace.i(1656246763520L, 12340);
            BindLinkedInUI.a(BindLinkedInUI.this, paramAnonymousBoolean, true);
            GMTrace.o(1656246763520L, 12340);
          }
        };
        GMTrace.o(1652622884864L, 12313);
        return;
        i = 0;
      }
      this.wmG.setVisibility(0);
      this.wmJ.setVisibility(0);
      this.wmL.setVisibility(0);
      this.wmI.mK(bool);
      this.wmI.xrE = new MMSwitchBtn.a()
      {
        public final void cc(boolean paramAnonymousBoolean)
        {
          GMTrace.i(1656917852160L, 12345);
          BindLinkedInUI.a(BindLinkedInUI.this, paramAnonymousBoolean, false);
          GMTrace.o(1656917852160L, 12345);
        }
      };
      GMTrace.o(1652622884864L, 12313);
      return;
    }
    a(this.nNT, true, this.name, this.wmz);
    GMTrace.o(1652622884864L, 12313);
  }
  
  private void goBack()
  {
    GMTrace.i(1652086013952L, 12309);
    if (this.wmA)
    {
      if (this.wmE)
      {
        Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(this);
        localIntent.addFlags(603979776);
        localIntent.putExtra("preferred_tab", 2);
        startActivity(localIntent);
        GMTrace.o(1652086013952L, 12309);
        return;
      }
      setResult(-1);
      finish();
      GMTrace.o(1652086013952L, 12309);
      return;
    }
    setResult(-1);
    finish();
    GMTrace.o(1652086013952L, 12309);
  }
  
  private void lS(boolean paramBoolean)
  {
    GMTrace.i(1652220231680L, 12310);
    if (this.wmC == null)
    {
      w.e("MicroMsg.BindLinkedInUI", "bindBundle is null !!");
      GMTrace.o(1652220231680L, 12310);
      return;
    }
    if (this.wmI.xrA) {}
    for (int i = 1;; i = 2)
    {
      final com.tencent.mm.ar.a locala = new com.tencent.mm.ar.a(i, this.fjv, this.fjw, "", this.wmM, this.wmN, this.wmO, this.wmP);
      if (!paramBoolean) {
        this.jIU = h.a(this, getString(R.l.bKJ), false, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(1654367715328L, 12326);
            at.wS().c(locala);
            GMTrace.o(1654367715328L, 12326);
          }
        });
      }
      at.wS().a(locala, 0);
      GMTrace.o(1652220231680L, 12310);
      return;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(1651951796224L, 12308);
    if (this.wmA) {
      oM(R.l.djO);
    }
    for (;;)
    {
      this.wmF = ((TextView)findViewById(R.h.ccC));
      this.wmG = ((TextView)findViewById(R.h.ccD));
      this.wmH = findViewById(R.h.ceN);
      this.wmI = ((MMSwitchBtn)findViewById(R.h.ceM));
      this.wmJ = ((TextView)findViewById(R.h.bgF));
      this.wmK = ((TextView)findViewById(R.h.cje));
      this.wmL = ((TextView)findViewById(R.h.biM));
      this.wmF.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1649804312576L, 12292);
          at.AR();
          paramAnonymousView = (String)c.xh().get(286723, null);
          if (!bg.nm(paramAnonymousView))
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", paramAnonymousView);
            localIntent.putExtra("geta8key_username", q.zE());
            com.tencent.mm.bj.d.b(BindLinkedInUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
          }
          GMTrace.o(1649804312576L, 12292);
        }
      });
      this.wmJ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1650072748032L, 12294);
          if (!BindLinkedInUI.b(BindLinkedInUI.this))
          {
            BindLinkedInUI.c(BindLinkedInUI.this);
            GMTrace.o(1650072748032L, 12294);
            return;
          }
          if (!BindLinkedInUI.d(BindLinkedInUI.this))
          {
            BindLinkedInUI.e(BindLinkedInUI.this);
            GMTrace.o(1650072748032L, 12294);
            return;
          }
          h.a(BindLinkedInUI.this, BindLinkedInUI.this.getString(R.l.djF), null, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(1650878054400L, 12300);
              BindLinkedInUI.e(BindLinkedInUI.this);
              GMTrace.o(1650878054400L, 12300);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(1649535877120L, 12290);
              GMTrace.o(1649535877120L, 12290);
            }
          });
          GMTrace.o(1650072748032L, 12294);
        }
      });
      this.wmK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1649267441664L, 12288);
          h.a(BindLinkedInUI.this, BindLinkedInUI.this.getString(R.l.djH), null, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(final DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(1650341183488L, 12296);
              paramAnonymous2DialogInterface = new b();
              BindLinkedInUI.a(BindLinkedInUI.this, h.a(BindLinkedInUI.this, BindLinkedInUI.this.getString(R.l.bKJ), false, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous3DialogInterface)
                {
                  GMTrace.i(1655709892608L, 12336);
                  at.wS().c(paramAnonymous2DialogInterface);
                  GMTrace.o(1655709892608L, 12336);
                }
              }));
              at.wS().a(paramAnonymous2DialogInterface, 0);
              GMTrace.o(1650341183488L, 12296);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(1655173021696L, 12332);
              GMTrace.o(1655173021696L, 12332);
            }
          });
          GMTrace.o(1649267441664L, 12288);
        }
      });
      this.wmL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1654636150784L, 12328);
          BindLinkedInUI.a(BindLinkedInUI.this);
          GMTrace.o(1654636150784L, 12328);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1655978328064L, 12338);
          BindLinkedInUI.a(BindLinkedInUI.this);
          GMTrace.o(1655978328064L, 12338);
          return true;
        }
      });
      ar();
      GMTrace.o(1651951796224L, 12308);
      return;
      if (this.wmB) {
        oM(R.l.djQ);
      } else {
        oM(R.l.djI);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1653025538048L, 12316);
    if (this.jIU != null)
    {
      this.jIU.dismiss();
      this.jIU = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (paramk.getType() == 549) {
        if (paramInt2 == 1) {
          paramInt1 = R.l.djM;
        }
      }
      for (;;)
      {
        h.b(this, getString(paramInt1), null, true);
        GMTrace.o(1653025538048L, 12316);
        return;
        paramInt1 = R.l.djL;
        continue;
        if (paramk.getType() != 550) {
          break;
        }
        paramInt1 = R.l.djN;
      }
      GMTrace.o(1653025538048L, 12316);
      return;
    }
    if (paramk.getType() == 549)
    {
      this.wmE = true;
      if (!this.wmD) {
        paramInt1 = R.l.djJ;
      }
    }
    for (;;)
    {
      paramString = getString(paramInt1);
      new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1654904586240L, 12330);
          GMTrace.o(1654904586240L, 12330);
        }
      };
      h.bm(this, paramString);
      PY();
      this.wmz = this.wmI.xrA;
      ar();
      GMTrace.o(1653025538048L, 12316);
      return;
      paramInt1 = R.l.djK;
      continue;
      if (paramk.getType() != 550) {
        break;
      }
      paramInt1 = R.l.djR;
    }
    GMTrace.o(1653025538048L, 12316);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1651683360768L, 12306);
    int i = R.i.cqb;
    GMTrace.o(1651683360768L, 12306);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(1652891320320L, 12315);
    w.d("MicroMsg.BindLinkedInUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    if (paramIntent == null)
    {
      GMTrace.o(1652891320320L, 12315);
      return;
    }
    switch (paramInt1)
    {
    default: 
      w.e("MicroMsg.BindLinkedInUI", "onActivityResult unknow request");
      GMTrace.o(1652891320320L, 12315);
      return;
    }
    Object localObject = paramIntent.getBundleExtra("result_data");
    paramIntent = ((Bundle)localObject).getString("ret");
    String str1 = ((Bundle)localObject).getString("limid");
    String str2 = ((Bundle)localObject).getString("liname");
    String str3 = ((Bundle)localObject).getString("liurl");
    localObject = ((Bundle)localObject).getString("liswitch");
    if (bg.nm(paramIntent))
    {
      w.e("MicroMsg.BindLinkedInUI", "linkedin oauth ret is null, maybe canceled");
      GMTrace.o(1652891320320L, 12315);
      return;
    }
    paramInt1 = bg.Sy(paramIntent);
    if (paramInt1 != 0)
    {
      w.e("MicroMsg.BindLinkedInUI", "linkedin oauth bind failed ret %s ", new Object[] { Integer.valueOf(paramInt1) });
      if (paramInt1 == 1) {}
      for (paramInt1 = R.l.djM;; paramInt1 = R.l.djL)
      {
        h.b(this, getString(paramInt1), null, true);
        GMTrace.o(1652891320320L, 12315);
        return;
      }
    }
    if (bg.nm(str1))
    {
      w.e("MicroMsg.BindLinkedInUI", "linkedin member id is null");
      GMTrace.o(1652891320320L, 12315);
      return;
    }
    w.d("MicroMsg.BindLinkedInUI", "%s, %s, %s, %s", new Object[] { str1, str2, str3, localObject });
    at.AR();
    c.xh().set(286722, str2);
    at.AR();
    c.xh().set(286721, str1);
    at.AR();
    c.xh().set(286723, str3);
    if (!bg.nm((String)localObject)) {
      if (bg.Sy((String)localObject) != 1) {
        break label417;
      }
    }
    label417:
    for (boolean bool = true;; bool = false)
    {
      O(bool, false);
      PY();
      ar();
      paramIntent = getString(R.l.djJ);
      new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1648999006208L, 12286);
          GMTrace.o(1648999006208L, 12286);
        }
      };
      h.bm(this, paramIntent);
      GMTrace.o(1652891320320L, 12315);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1651146489856L, 12302);
    super.onCreate(paramBundle);
    at.wS().a(549, this);
    at.wS().a(550, this);
    this.wmC = getIntent().getBundleExtra("qrcode_bundle");
    if (this.wmC != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.wmA = bool;
      if (this.wmC != null)
      {
        this.fjv = this.wmC.getString("i");
        this.fjw = this.wmC.getString("n");
        this.wmM = this.wmC.getString("t");
        this.wmN = this.wmC.getString("o");
        this.wmO = this.wmC.getString("s");
        this.wmP = this.wmC.getString("r");
        if ((this.fjv == null) || (this.fjw == null) || (this.wmM == null) || (this.wmO == null) || (this.wmP == null)) {
          h.a(this, getString(R.l.djG), null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(1655441457152L, 12334);
              BindLinkedInUI.a(BindLinkedInUI.this);
              GMTrace.o(1655441457152L, 12334);
            }
          });
        }
      }
      this.wmB = getIntent().getBooleanExtra("oversea_entry", false);
      PY();
      if (this.wmA) {
        this.wmz = true;
      }
      MP();
      if ((this.wmC != null) && (this.nNT) && (this.wmy.equals(this.fjv)))
      {
        this.wmD = true;
        lS(true);
      }
      GMTrace.o(1651146489856L, 12302);
      return;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1651280707584L, 12303);
    at.wS().b(550, this);
    at.wS().b(549, this);
    super.onDestroy();
    GMTrace.o(1651280707584L, 12303);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1653159755776L, 12317);
    if (paramInt == 4)
    {
      goBack();
      GMTrace.o(1653159755776L, 12317);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(1653159755776L, 12317);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(1651549143040L, 12305);
    super.onPause();
    GMTrace.o(1651549143040L, 12305);
  }
  
  protected void onResume()
  {
    GMTrace.i(1651414925312L, 12304);
    super.onResume();
    GMTrace.o(1651414925312L, 12304);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\bindlinkedin\BindLinkedInUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */