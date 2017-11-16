package com.tencent.mm.plugin.recharge.ui;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.ss;
import com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView;
import com.tencent.mm.plugin.recharge.ui.form.MallFormView;
import com.tencent.mm.plugin.recharge.ui.form.MallFormView.a;
import com.tencent.mm.plugin.recharge.ui.form.c.b;
import com.tencent.mm.plugin.recharge.ui.form.c.b.1;
import com.tencent.mm.plugin.recharge.ui.form.c.b.2;
import com.tencent.mm.plugin.recharge.ui.form.c.b.3;
import com.tencent.mm.plugin.recharge.ui.form.c.b.4;
import com.tencent.mm.plugin.recharge.ui.form.c.b.5;
import com.tencent.mm.plugin.recharge.ui.form.d.a;
import com.tencent.mm.plugin.wallet.a.m;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.a;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneRechargeUI
  extends MMActivity
  implements com.tencent.mm.ad.e, d.a
{
  private String desc;
  private String eAR;
  private int errCode;
  protected Dialog hul;
  private String hyD;
  private boolean nJA;
  private com.tencent.mm.sdk.b.c nJD;
  private View oeK;
  private ImageView oeL;
  private TextView oeM;
  private MallFormView oeN;
  private TextView oeO;
  private TextView oeP;
  private GridView oeQ;
  private GridView oeR;
  private TextView oeS;
  private TextView oeT;
  private TextView oeU;
  private TextView oeV;
  private TextView oeW;
  private TextView oeX;
  private b oeY;
  private b oeZ;
  private ArrayList<com.tencent.mm.plugin.wallet.a.n> oea;
  private ArrayList<com.tencent.mm.plugin.wallet.a.n> oeb;
  private com.tencent.mm.plugin.wallet.a.d oec;
  private com.tencent.mm.plugin.wallet.a.d oed;
  private com.tencent.mm.plugin.wallet.a.d oee;
  private com.tencent.mm.plugin.wallet.a.d oef;
  private com.tencent.mm.plugin.wallet.a.d oeg;
  private MallFunction ofa;
  private String ofb;
  private int ofc;
  private String ofd;
  private String ofe;
  private c.b off;
  private m ofg;
  private boolean ofh;
  private List<String[]> ofi;
  
  public PhoneRechargeUI()
  {
    GMTrace.i(7895357849600L, 58825);
    this.oeK = null;
    this.oeL = null;
    this.oeM = null;
    this.oeN = null;
    this.oeO = null;
    this.oeP = null;
    this.oeQ = null;
    this.oeR = null;
    this.oeS = null;
    this.oeT = null;
    this.oeU = null;
    this.oeV = null;
    this.oeW = null;
    this.oeX = null;
    this.oeY = null;
    this.oeZ = null;
    this.hul = null;
    this.ofa = null;
    this.hyD = "";
    this.oea = null;
    this.oeb = null;
    this.oec = null;
    this.oed = null;
    this.oee = null;
    this.oef = null;
    this.oeg = null;
    this.errCode = 0;
    this.eAR = "";
    this.ofb = "";
    this.desc = "";
    this.ofd = "";
    this.ofe = "";
    this.nJA = false;
    this.off = null;
    this.ofg = null;
    this.ofh = false;
    this.nJD = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7895357849600L, 58825);
  }
  
  private String Fr(String paramString)
  {
    GMTrace.i(7895760502784L, 58828);
    Object localObject2 = "";
    Object localObject1 = localObject2;
    String str1 = paramString;
    try
    {
      if (this.off != null)
      {
        localObject1 = localObject2;
        str1 = paramString;
        if (this.off.oer != null)
        {
          localObject1 = localObject2;
          str1 = paramString;
          if (!bg.nm(this.off.oer.name))
          {
            str1 = paramString;
            localObject1 = this.off.oer.name;
          }
        }
      }
      localObject2 = localObject1;
      str1 = paramString;
      if (((String)localObject1).equals(getString(a.i.tfF))) {
        localObject2 = "WeChatAccountBindNumber";
      }
      str1 = paramString;
      String str2 = this.oeN.getText();
      str1 = paramString;
      localObject1 = URLEncoder.encode(URLEncoder.encode((String)localObject2, "utf-8"), "utf-8");
      str1 = paramString;
      if (!paramString.startsWith("http://"))
      {
        str1 = paramString;
        if (!paramString.startsWith("https://")) {}
      }
      else
      {
        str1 = paramString;
        w.i("MicroMsg.PhoneRechargeUI", "new url");
        str1 = paramString;
        if (paramString.indexOf("%7Bphone%7D") > 0)
        {
          str1 = paramString;
          paramString = paramString.replace("%7Bphone%7D", str2);
          str1 = paramString;
          if (paramString.indexOf("%7Bremark%7D") <= 0) {
            break label229;
          }
          str1 = paramString;
        }
        for (paramString = paramString.replace("%7Bremark%7D", (CharSequence)localObject1);; paramString = paramString.replace("{remark}", (CharSequence)localObject1))
        {
          GMTrace.o(7895760502784L, 58828);
          return paramString;
          str1 = paramString;
          paramString = paramString.replace("{phone}", str2);
          break;
          label229:
          str1 = paramString;
        }
      }
      str1 = paramString;
      w.i("MicroMsg.PhoneRechargeUI", "old url");
      str1 = paramString;
      localObject2 = URLDecoder.decode(paramString, "utf-8");
      str1 = paramString;
      paramString = (String)localObject2 + String.format("?phone=%s&remark=%s", new Object[] { str2, localObject1 });
      GMTrace.o(7895760502784L, 58828);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      w.printErrStackTrace("MicroMsg.PhoneRechargeUI", paramString, "", new Object[0]);
      GMTrace.o(7895760502784L, 58828);
    }
    return str1;
  }
  
  private void Fs(String paramString)
  {
    GMTrace.i(7896834244608L, 58836);
    com.tencent.mm.ui.base.h.a(this, paramString, "", false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(7859924369408L, 58561);
        paramAnonymousDialogInterface.dismiss();
        GMTrace.o(7859924369408L, 58561);
      }
    });
    GMTrace.o(7896834244608L, 58836);
  }
  
  private void baq()
  {
    GMTrace.i(7895492067328L, 58826);
    this.hyD = "";
    bar();
    this.errCode = 0;
    this.eAR = "";
    this.desc = "";
    GMTrace.o(7895492067328L, 58826);
  }
  
  private void bar()
  {
    GMTrace.i(7896565809152L, 58834);
    this.oea = new ArrayList();
    com.tencent.mm.plugin.wallet.a.n localn1 = new com.tencent.mm.plugin.wallet.a.n();
    localn1.name = getString(a.i.tfq);
    localn1.status = 0;
    com.tencent.mm.plugin.wallet.a.n localn2 = new com.tencent.mm.plugin.wallet.a.n();
    localn2.name = getString(a.i.tfr);
    localn2.status = 0;
    com.tencent.mm.plugin.wallet.a.n localn3 = new com.tencent.mm.plugin.wallet.a.n();
    localn3.name = getString(a.i.tfs);
    localn3.status = 0;
    com.tencent.mm.plugin.wallet.a.n localn4 = new com.tencent.mm.plugin.wallet.a.n();
    localn4.name = getString(a.i.tft);
    localn4.status = 0;
    com.tencent.mm.plugin.wallet.a.n localn5 = new com.tencent.mm.plugin.wallet.a.n();
    localn5.name = getString(a.i.tfu);
    localn5.status = 0;
    com.tencent.mm.plugin.wallet.a.n localn6 = new com.tencent.mm.plugin.wallet.a.n();
    localn6.name = getString(a.i.tfv);
    localn6.status = 0;
    this.oea.add(localn1);
    this.oea.add(localn2);
    this.oea.add(localn3);
    this.oea.add(localn4);
    this.oea.add(localn5);
    this.oea.add(localn6);
    this.oeb = new ArrayList();
    localn1 = new com.tencent.mm.plugin.wallet.a.n();
    localn1.name = getString(a.i.tfw);
    localn1.status = 0;
    localn2 = new com.tencent.mm.plugin.wallet.a.n();
    localn2.name = getString(a.i.tfx);
    localn2.status = 0;
    localn3 = new com.tencent.mm.plugin.wallet.a.n();
    localn3.name = getString(a.i.tfy);
    localn3.status = 0;
    this.oeb.add(localn1);
    this.oeb.add(localn2);
    this.oeb.add(localn3);
    GMTrace.o(7896565809152L, 58834);
  }
  
  private void bas()
  {
    GMTrace.i(7897236897792L, 58839);
    com.tencent.mm.kernel.h.wS().a(new com.tencent.mm.plugin.recharge.model.f(this.oeN.getText()), 0);
    GMTrace.o(7897236897792L, 58839);
  }
  
  private void m(k paramk)
  {
    GMTrace.i(7895894720512L, 58829);
    if ((this.hul != null) && (this.hul.isShowing()) && (paramk.getType() != 497))
    {
      this.hul.dismiss();
      this.hul = null;
    }
    GMTrace.o(7895894720512L, 58829);
  }
  
  private void n(final k paramk)
  {
    GMTrace.i(7896028938240L, 58830);
    if ((this.hul == null) || ((this.hul != null) && (!this.hul.isShowing()))) {
      this.hul = com.tencent.mm.wallet_core.ui.g.a(this.vKB.vKW, true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7886767915008L, 58761);
          com.tencent.mm.kernel.h.wS().c(paramk);
          GMTrace.o(7886767915008L, 58761);
        }
      });
    }
    com.tencent.mm.kernel.h.wS().a(paramk, 0);
    GMTrace.o(7896028938240L, 58830);
  }
  
  private void q(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(7896431591424L, 58833);
    final Object localObject1;
    int i;
    Object localObject2;
    if (this.ofg != null) {
      if (this.ofg != null)
      {
        localObject1 = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vqM, "");
        if (!bg.nm((String)localObject1))
        {
          localObject1 = ((String)localObject1).split(";");
          if (localObject1 != null)
          {
            int j = localObject1.length;
            i = 0;
            if (i < j)
            {
              localObject2 = localObject1[i];
              if ((localObject2 != null) && (((String)localObject2).equals(String.valueOf(this.ofg.id))))
              {
                w.i("MicroMsg.PhoneRechargeUI", "hy: found closed. ");
                i = 1;
                label118:
                if (i != 0) {
                  break label759;
                }
                this.oeK.setVisibility(0);
                this.oeM.setText(this.ofg.name);
                w.d("MicroMsg.PhoneRechargeUI", "hy: Show banner!");
                com.tencent.mm.protocal.f.dX(6, 0);
                label159:
                this.oeY.oeF = this.oea;
                this.oeY.notifyDataSetChanged();
                this.oeZ.oeF = this.oeb;
                this.oeZ.notifyDataSetChanged();
                if (paramBoolean1) {
                  break label780;
                }
                this.oeW.setVisibility(8);
                label208:
                this.oeX.setVisibility(8);
                if (paramBoolean2) {
                  a(0, this.oeg.name, new MenuItem.OnMenuItemClickListener()
                  {
                    public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
                    {
                      GMTrace.i(7878714851328L, 58701);
                      try
                      {
                        paramAnonymousMenuItem = URLDecoder.decode(PhoneRechargeUI.i(PhoneRechargeUI.this).url, "utf-8");
                        PhoneRechargeUI.d(PhoneRechargeUI.this, paramAnonymousMenuItem);
                        GMTrace.o(7878714851328L, 58701);
                        return false;
                      }
                      catch (UnsupportedEncodingException paramAnonymousMenuItem)
                      {
                        for (;;)
                        {
                          w.printErrStackTrace("MicroMsg.PhoneRechargeUI", paramAnonymousMenuItem, "", new Object[0]);
                        }
                      }
                    }
                  });
                }
                localObject2 = this.oeO;
                if ((this.oea == null) || (this.oea.size() <= 0) || (bg.nm(((com.tencent.mm.plugin.wallet.a.n)this.oea.get(0)).qXV))) {
                  break label903;
                }
                localObject1 = ((com.tencent.mm.plugin.wallet.a.n)this.oea.get(0)).qXV;
                label300:
                ((TextView)localObject2).setText((CharSequence)localObject1);
                localObject2 = this.oeP;
                if ((this.oeb == null) || (this.oeb.size() <= 0) || (bg.nm(((com.tencent.mm.plugin.wallet.a.n)this.oeb.get(0)).qXV))) {
                  break label915;
                }
                localObject1 = ((com.tencent.mm.plugin.wallet.a.n)this.oeb.get(0)).qXV;
                label366:
                ((TextView)localObject2).setText((CharSequence)localObject1);
                if ((this.oef != null) && (!bg.nm(this.oef.name)) && (!bg.nm(this.oef.url))) {
                  break label927;
                }
                this.oeT.setVisibility(8);
                label415:
                if ((this.oec != null) && (!bg.nm(this.oec.name)) && (!bg.nm(this.oec.url))) {
                  break label967;
                }
                this.oeS.setVisibility(8);
                label457:
                if ((this.oed != null) && (!bg.nm(this.oed.name)) && (!bg.nm(this.oed.url))) {
                  break label1007;
                }
                this.oeU.setVisibility(8);
                label499:
                if ((this.oee != null) && (!bg.nm(this.oee.name)) && (!bg.nm(this.oee.url))) {
                  break label1047;
                }
                this.oeV.setVisibility(8);
                label541:
                localObject1 = this.ofa;
                if ((((MallFunction)localObject1).rjL != null) && (((MallFunction)localObject1).rjL.rhZ == 1) && (!bg.nm(((MallFunction)localObject1).rjL.rkb))) {
                  break label1087;
                }
                i = 0;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vuu, Boolean.valueOf(true));
        w.d("MicroMsg.PhoneRechargeUI", this.ofa.rjL.toString());
        localObject1 = this.ofa.rjL.rkb;
        localObject2 = v.fb(this).inflate(a.g.sOu, null);
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(a.i.tfK), (View)localObject2, getString(a.i.tfL), getString(a.i.tfJ), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7900458123264L, 58863);
            paramAnonymousDialogInterface = PhoneRechargeUI.c(PhoneRechargeUI.this, localObject1);
            w.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousDialogInterface });
            PhoneRechargeUI.d(PhoneRechargeUI.this, paramAnonymousDialogInterface);
            GMTrace.o(7900458123264L, 58863);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7883815124992L, 58739);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(7883815124992L, 58739);
          }
        });
      }
      GMTrace.o(7896431591424L, 58833);
      return;
      i += 1;
      break;
      w.i("MicroMsg.PhoneRechargeUI", "hy: not found closed banner.");
      i = 0;
      break label118;
      w.i("MicroMsg.PhoneRechargeUI", "hy: no banner before, show");
      i = 0;
      break label118;
      w.e("MicroMsg.PhoneRechargeUI", "hy: no banner");
      i = 1;
      break label118;
      label759:
      this.oeK.setVisibility(8);
      w.d("MicroMsg.PhoneRechargeUI", "hy: dismiss banner!");
      break label159;
      label780:
      localObject1 = this.oea.iterator();
      while (((Iterator)localObject1).hasNext()) {
        if (((com.tencent.mm.plugin.wallet.a.n)((Iterator)localObject1).next()).status != 0)
        {
          i = 0;
          label817:
          if (i == 0) {
            break label886;
          }
          this.oeW.setVisibility(0);
          label829:
          localObject1 = this.oeb.iterator();
          do
          {
            if (!((Iterator)localObject1).hasNext()) {
              break;
            }
          } while (((com.tencent.mm.plugin.wallet.a.n)((Iterator)localObject1).next()).status == 0);
        }
      }
      for (i = 0;; i = 1)
      {
        if (i == 0) {
          break label901;
        }
        this.oeX.setVisibility(0);
        break;
        i = 1;
        break label817;
        label886:
        this.oeW.setVisibility(8);
        break label829;
      }
      label901:
      break label208;
      label903:
      localObject1 = getString(a.i.tfA);
      break label300;
      label915:
      localObject1 = getString(a.i.tfB);
      break label366;
      label927:
      this.oeT.setVisibility(0);
      this.oeT.setText(this.oef.name);
      this.oeT.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7892539277312L, 58804);
          paramAnonymousView = PhoneRechargeUI.c(PhoneRechargeUI.this, PhoneRechargeUI.j(PhoneRechargeUI.this).url);
          w.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousView });
          PhoneRechargeUI.d(PhoneRechargeUI.this, paramAnonymousView);
          GMTrace.o(7892539277312L, 58804);
        }
      });
      break label415;
      label967:
      this.oeS.setVisibility(0);
      this.oeS.setText(this.oec.name);
      this.oeS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7887036350464L, 58763);
          paramAnonymousView = PhoneRechargeUI.c(PhoneRechargeUI.this, PhoneRechargeUI.k(PhoneRechargeUI.this).url);
          w.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousView });
          PhoneRechargeUI.d(PhoneRechargeUI.this, paramAnonymousView);
          GMTrace.o(7887036350464L, 58763);
        }
      });
      break label457;
      label1007:
      this.oeU.setVisibility(0);
      this.oeU.setText(this.oed.name);
      this.oeU.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7887304785920L, 58765);
          paramAnonymousView = PhoneRechargeUI.c(PhoneRechargeUI.this, PhoneRechargeUI.l(PhoneRechargeUI.this).url);
          w.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousView });
          PhoneRechargeUI.d(PhoneRechargeUI.this, paramAnonymousView);
          GMTrace.o(7887304785920L, 58765);
        }
      });
      break label499;
      label1047:
      this.oeV.setVisibility(0);
      this.oeV.setText(this.oee.name);
      this.oeV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7860192804864L, 58563);
          paramAnonymousView = PhoneRechargeUI.c(PhoneRechargeUI.this, PhoneRechargeUI.m(PhoneRechargeUI.this).url);
          w.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousView });
          PhoneRechargeUI.d(PhoneRechargeUI.this, paramAnonymousView);
          GMTrace.o(7860192804864L, 58563);
        }
      });
      break label541;
      label1087:
      com.tencent.mm.kernel.h.xz();
      if (!((Boolean)com.tencent.mm.kernel.h.xy().xh().get(w.a.vuu, Boolean.valueOf(false))).booleanValue()) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7896968462336L, 58837);
    if ((paramk instanceof com.tencent.mm.plugin.recharge.model.f))
    {
      paramString = (com.tencent.mm.plugin.recharge.model.f)paramk;
      if (paramString.cmdId == 0)
      {
        if ((!bg.nm(paramString.nLL)) && (!paramString.nLL.equals(this.oeN.getText())))
        {
          w.i("MicroMsg.PhoneRechargeUI", "hy: mobiel num not match.abourt, %s, %s", new Object[] { paramString.nLL, this.oeN.getText() });
          GMTrace.o(7896968462336L, 58837);
          return;
        }
        m(paramk);
        if (paramString.odZ)
        {
          w.e("MicroMsg.PhoneRechargeUI", "hy: cgi failed.");
          Fs(paramString.eAR);
          baq();
          GMTrace.o(7896968462336L, 58837);
          return;
        }
        this.hyD = paramString.appId;
        this.oea = paramString.oea;
        this.oec = paramString.oec;
        this.oed = paramString.oed;
        this.oee = paramString.oee;
        this.oef = paramString.oef;
        this.errCode = paramString.errCode;
        this.eAR = paramString.eAR;
        this.ofb = paramString.desc;
        w.i("MicroMsg.PhoneRechargeUI", "desc: %s, mobile: %s", new Object[] { this.ofb, this.oeN.getText() });
        if (bg.nm(this.ofb))
        {
          this.desc = "";
          this.ofc = getResources().getColor(a.c.aOE);
        }
        for (;;)
        {
          this.ofg = paramString.oeh;
          this.oeb = paramString.oeb;
          paramInt1 = this.oeb.size() - 1;
          while (paramInt1 >= 0)
          {
            paramk = (com.tencent.mm.plugin.wallet.a.n)this.oeb.get(paramInt1);
            if (paramk.name.isEmpty()) {
              this.oeb.remove(paramk);
            }
            paramInt1 -= 1;
          }
          if ((this.off.oer != null) && (this.off.oer.odE.trim().equals(this.oeN.getText())))
          {
            this.off.oer.odF = this.ofb;
            this.off.b(this.off.oer);
          }
        }
        if ((paramString.oeg == null) || ((paramString.oeg.name.equals(this.oeg.name)) && (paramString.oeg.url.equals(this.oeg.url)))) {
          break label751;
        }
        w.i("MicroMsg.PhoneRechargeUI", "need to update head");
        this.oeg = paramString.oeg;
      }
    }
    label586:
    label751:
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2;
      if (this.ofb.equals(""))
      {
        bool2 = false;
        q(bool2, bool1);
        paramk = paramString.oei;
        if (paramk != null)
        {
          w.d("MicroMsg.PhoneRechargeUI", "update record history");
          com.tencent.mm.plugin.recharge.a.a.baj().bi(paramk);
          if (this.off != null)
          {
            if (!paramString.oej) {
              break label586;
            }
            this.off.gS(true);
          }
        }
      }
      for (;;)
      {
        this.oeN.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7859387498496L, 58557);
            PhoneRechargeUI.a(PhoneRechargeUI.this).baB();
            GMTrace.o(7859387498496L, 58557);
          }
        }, 300L);
        GMTrace.o(7896968462336L, 58837);
        return;
        bool2 = true;
        break;
        this.off.gS(false);
      }
      w.i("MicroMsg.PhoneRechargeUI", "do delete phone number");
      GMTrace.o(7896968462336L, 58837);
      return;
      if ((paramk instanceof com.tencent.mm.plugin.recharge.model.g))
      {
        m(paramk);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramk = ((com.tencent.mm.plugin.recharge.model.g)paramk).oek;
          paramk.ePL = 6;
          paramk.tIz = 100;
          paramk.jxX = this.oeN.getText();
          if (this.off.oer != null) {}
          for (paramString = this.off.oer.name;; paramString = "")
          {
            paramk.hLO = paramString;
            com.tencent.mm.pluginsdk.wallet.g.a(this, paramk, 2);
            com.tencent.mm.sdk.b.a.vgX.b(this.nJD);
            GMTrace.o(7896968462336L, 58837);
            return;
          }
        }
        Fs(paramString);
      }
      GMTrace.o(7896968462336L, 58837);
      return;
    }
  }
  
  public final void bat()
  {
    GMTrace.i(7897371115520L, 58840);
    com.tencent.mm.plugin.recharge.model.f localf = new com.tencent.mm.plugin.recharge.model.f("", 1);
    com.tencent.mm.kernel.h.wS().a(localf, 0);
    GMTrace.o(7897371115520L, 58840);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7896700026880L, 58835);
    int i = a.g.sNS;
    GMTrace.o(7896700026880L, 58835);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7897102680064L, 58838);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(7897102680064L, 58838);
      return;
      if (paramInt2 == -1)
      {
        this.ofh = true;
        Object localObject1 = null;
        Object localObject4 = null;
        final ArrayList localArrayList = new ArrayList();
        final Object localObject3 = paramIntent.getData();
        if (localObject3 == null)
        {
          w.e("MicroMsg.PhoneRechargeUI", "hy: uri == null");
          GMTrace.o(7897102680064L, 58838);
          return;
        }
        if (!com.tencent.mm.pluginsdk.h.a.aS(this, "android.permission.READ_CONTACTS"))
        {
          w.e("MicroMsg.PhoneRechargeUI", "no contact permission");
          GMTrace.o(7897102680064L, 58838);
          return;
        }
        Cursor localCursor1;
        Cursor localCursor2;
        try
        {
          localCursor1 = getContentResolver().query((Uri)localObject3, null, null, null, null);
          localObject3 = localObject1;
          if (localCursor1 == null) {
            break label554;
          }
          localObject3 = localObject1;
          if (localCursor1.getCount() <= 0) {
            break label554;
          }
          localCursor1.moveToFirst();
          int i = localCursor1.getColumnIndex("has_phone_number");
          if (i > 0)
          {
            localObject3 = localObject1;
            if (localCursor1.getInt(i) <= 0) {
              break label554;
            }
          }
          localObject1 = localCursor1.getString(localCursor1.getColumnIndex("_id"));
          localCursor2 = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + (String)localObject1, null, null);
          localObject1 = localObject4;
          if (localCursor2 != null)
          {
            localObject1 = localObject4;
            if (localCursor2.moveToFirst())
            {
              localObject1 = null;
              while (!localCursor2.isAfterLast())
              {
                i = localCursor2.getColumnIndex("data1");
                int j = localCursor2.getColumnIndex("display_name");
                localObject3 = localCursor2.getString(i);
                localObject1 = localCursor2.getString(j);
                w.d("MicroMsg.PhoneRechargeUI", "hy: username : " + (String)localObject1);
                if (localObject3 != null)
                {
                  w.d("MicroMsg.PhoneRechargeUI", "hy: phoneNumber : " + (String)localObject3);
                  localObject3 = com.tencent.mm.plugin.recharge.model.b.Fp((String)localObject3);
                  w.d("MicroMsg.PhoneRechargeUI", "hy: phoneNumber : " + (String)localObject3);
                  if ((PhoneNumberUtils.isGlobalPhoneNumber((String)localObject3)) && (((String)localObject3).length() == 11)) {
                    localArrayList.add(localObject3);
                  }
                  w.d("MicroMsg.PhoneRechargeUI", "hy: phoneResult : " + (String)localObject3);
                }
                localCursor2.moveToNext();
              }
            }
          }
        }
        catch (SecurityException localSecurityException)
        {
          w.e("MicroMsg.PhoneRechargeUI", "hy: permission denied: %s", new Object[] { localSecurityException.toString() });
          com.tencent.mm.ui.base.h.b(this, getString(a.i.sWn), "", true);
        }
        localObject3 = localSecurityException;
        if (localCursor2 != null)
        {
          localCursor2.close();
          localObject3 = localSecurityException;
        }
        label554:
        if ((localCursor1 != null) && (!localCursor1.isClosed())) {
          localCursor1.close();
        }
        Object localObject2;
        if (localArrayList.size() > 1)
        {
          localObject2 = com.tencent.mm.ui.base.h.a(this, getString(a.i.tfI), localArrayList, -1, new h.a()
          {
            public final void te(int paramAnonymousInt)
            {
              GMTrace.i(7900726558720L, 58865);
              w.d("MicroMsg.PhoneRechargeUI", "choose: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
              PhoneRechargeUI.b(PhoneRechargeUI.this).b(new com.tencent.mm.plugin.recharge.model.a((String)localArrayList.get(paramAnonymousInt), localObject3, 1));
              PhoneRechargeUI.n(PhoneRechargeUI.this);
              GMTrace.o(7900726558720L, 58865);
            }
          });
          if (localObject2 != null) {
            ((i)localObject2).setCanceledOnTouchOutside(true);
          }
        }
        else if (localArrayList.size() == 1)
        {
          this.off.b(new com.tencent.mm.plugin.recharge.model.a((String)localArrayList.get(0), (String)localObject3, 1));
          bas();
        }
        else
        {
          com.tencent.mm.ui.base.h.b(this, getString(a.i.sWl), "", true);
          continue;
          if (paramInt2 == -1)
          {
            if (!this.nJA)
            {
              w.i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : ok");
              localObject2 = new com.tencent.mm.plugin.recharge.model.a(this.oeN.getText(), this.oeN.ogg.getText().toString(), 0);
              com.tencent.mm.plugin.recharge.a.a.baj().a((com.tencent.mm.plugin.recharge.model.a)localObject2);
              finish();
              this.nJA = true;
            }
          }
          else {
            w.i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : cancel");
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7895626285056L, 58827);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.h.wS().a(1571, this);
    com.tencent.mm.kernel.h.wS().a(498, this);
    this.ofa = ((MallFunction)getIntent().getParcelableExtra("key_func_info"));
    if (this.ofa == null)
    {
      w.e("MicroMsg.PhoneRechargeUI", "hy: function info is null");
      u.makeText(this, "function info is null", 1).show();
      finish();
    }
    bar();
    sq(this.ofa.eVy);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7882472947712L, 58729);
        PhoneRechargeUI.this.aLo();
        PhoneRechargeUI.this.finish();
        GMTrace.o(7882472947712L, 58729);
        return true;
      }
    });
    this.oeg = new com.tencent.mm.plugin.wallet.a.d();
    this.oeg.name = getString(a.i.tfC);
    this.oeg.url = getString(a.i.tfD);
    this.oeK = findViewById(a.f.sEr);
    this.oeL = ((ImageView)findViewById(a.f.sCJ));
    this.oeM = ((TextView)findViewById(a.f.sCK));
    this.oeN = ((MallFormView)findViewById(a.f.sFG));
    com.tencent.mm.plugin.recharge.ui.form.c.b(this.oeN);
    this.off = new c.b(this.oeN);
    paramBundle = this.off;
    w.d(com.tencent.mm.plugin.recharge.ui.form.c.TAG, "hy: setMobileEditTv");
    Object localObject = paramBundle.ofY;
    c.b.1 local1 = new c.b.1(paramBundle);
    if (((MallFormView)localObject).oge != null) {
      ((MallFormView)localObject).oge.addTextChangedListener(local1);
    }
    localObject = (InstantAutoCompleteTextView)paramBundle.ofY.oge;
    paramBundle.oeq = com.tencent.mm.pluginsdk.a.dC(paramBundle.ofY.getContext());
    paramBundle.ofZ = new com.tencent.mm.plugin.recharge.ui.form.d(paramBundle.ofY, paramBundle.oeq);
    paramBundle.ofZ.ogM = new c.b.2(paramBundle);
    paramBundle.ofZ.ogN = this;
    paramBundle.gS(true);
    ((InstantAutoCompleteTextView)localObject).ofX = true;
    ((InstantAutoCompleteTextView)localObject).setAdapter(paramBundle.ofZ);
    ((InstantAutoCompleteTextView)localObject).setOnItemClickListener(new c.b.3(paramBundle, (InstantAutoCompleteTextView)localObject));
    paramBundle.ofY.setOnFocusChangeListener(new c.b.4(paramBundle, (InstantAutoCompleteTextView)localObject));
    ((InstantAutoCompleteTextView)localObject).setOnClickListener(new c.b.5(paramBundle, (InstantAutoCompleteTextView)localObject));
    this.oeQ = ((GridView)findViewById(a.f.sFT));
    this.oeS = ((TextView)findViewById(a.f.sFZ));
    this.oeT = ((TextView)findViewById(a.f.sGa));
    this.oeU = ((TextView)findViewById(a.f.sFF));
    this.oeV = ((TextView)findViewById(a.f.sFR));
    this.oeO = ((TextView)findViewById(a.f.sFV));
    this.oeP = ((TextView)findViewById(a.f.sFX));
    this.oeR = ((GridView)findViewById(a.f.sFH));
    this.oeW = ((TextView)findViewById(a.f.sFU));
    this.oeX = ((TextView)findViewById(a.f.sFW));
    this.oeN.ogh = new MallFormView.a()
    {
      public final void gR(boolean paramAnonymousBoolean)
      {
        GMTrace.i(7892807712768L, 58806);
        if (paramAnonymousBoolean)
        {
          PhoneRechargeUI.this.aLo();
          final String str = com.tencent.mm.plugin.recharge.model.b.Fp(PhoneRechargeUI.a(PhoneRechargeUI.this).getText());
          if (str == null)
          {
            w.e("MicroMsg.PhoneRechargeUI", "null phone, return");
            GMTrace.o(7892807712768L, 58806);
            return;
          }
          com.tencent.mm.sdk.f.e.a(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16551864434688L, 123321);
              long l = System.currentTimeMillis();
              final com.tencent.mm.plugin.recharge.model.a locala = PhoneRechargeUI.a(PhoneRechargeUI.this, str);
              w.d("MicroMsg.PhoneRechargeUI", "handle cost: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(16551595999232L, 123319);
                  PhoneRechargeUI.b(PhoneRechargeUI.this).b(locala);
                  PhoneRechargeUI.Ft(PhoneRechargeUI.12.1.this.ofm);
                  GMTrace.o(16551595999232L, 123319);
                }
              });
              GMTrace.o(16551864434688L, 123321);
            }
          }, "search_matched_mobile");
          if (!PhoneRechargeUI.c(PhoneRechargeUI.this))
          {
            w.d("MicroMsg.PhoneRechargeUI", "clear focus");
            PhoneRechargeUI.a(PhoneRechargeUI.this, true);
            GMTrace.o(7892807712768L, 58806);
            return;
          }
          PhoneRechargeUI.a(PhoneRechargeUI.this, false);
          GMTrace.o(7892807712768L, 58806);
          return;
        }
        PhoneRechargeUI.a(PhoneRechargeUI.this).ogg.setText("");
        PhoneRechargeUI.a(PhoneRechargeUI.this).ogg.setTextColor(PhoneRechargeUI.this.getResources().getColor(a.c.aOE));
        PhoneRechargeUI.d(PhoneRechargeUI.this);
        PhoneRechargeUI.e(PhoneRechargeUI.this);
        if (bg.nm(PhoneRechargeUI.a(PhoneRechargeUI.this).getText())) {
          ((AutoCompleteTextView)PhoneRechargeUI.a(PhoneRechargeUI.this).oge).showDropDown();
        }
        GMTrace.o(7892807712768L, 58806);
      }
    };
    this.oeN.ogf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7879788593152L, 58709);
        if (PhoneRechargeUI.this.getPackageManager().checkPermission("android.permission.READ_CONTACTS", ab.getPackageName()) == 0) {}
        for (int i = 1; i != 0; i = 0)
        {
          paramAnonymousView = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
          if (bg.j(PhoneRechargeUI.this, paramAnonymousView)) {
            PhoneRechargeUI.this.startActivityForResult(paramAnonymousView, 1);
          }
          GMTrace.o(7879788593152L, 58709);
          return;
        }
        com.tencent.mm.ui.base.h.b(PhoneRechargeUI.this, PhoneRechargeUI.this.getString(a.i.tfG), "", true);
        GMTrace.o(7879788593152L, 58709);
      }
    });
    this.oeY = new b();
    this.oeY.oeG = new b.a()
    {
      public final void a(com.tencent.mm.plugin.wallet.a.n paramAnonymousn)
      {
        GMTrace.i(7884083560448L, 58741);
        if (paramAnonymousn == null)
        {
          w.e("MicroMsg.PhoneRechargeUI", "hy: no product item");
          GMTrace.o(7884083560448L, 58741);
          return;
        }
        if (PhoneRechargeUI.a(PhoneRechargeUI.this, paramAnonymousn)) {
          PhoneRechargeUI.b(PhoneRechargeUI.this, paramAnonymousn.id);
        }
        GMTrace.o(7884083560448L, 58741);
      }
    };
    this.oeZ = new b();
    this.oeZ.oeG = new b.a()
    {
      public final void a(com.tencent.mm.plugin.wallet.a.n paramAnonymousn)
      {
        GMTrace.i(7885425737728L, 58751);
        if (!bg.nm(paramAnonymousn.url))
        {
          paramAnonymousn = PhoneRechargeUI.c(PhoneRechargeUI.this, paramAnonymousn.url);
          PhoneRechargeUI.d(PhoneRechargeUI.this, paramAnonymousn);
          GMTrace.o(7885425737728L, 58751);
          return;
        }
        if (PhoneRechargeUI.a(PhoneRechargeUI.this, paramAnonymousn))
        {
          PhoneRechargeUI.b(PhoneRechargeUI.this, paramAnonymousn.id);
          GMTrace.o(7885425737728L, 58751);
          return;
        }
        w.w("MicroMsg.PhoneRechargeUI", "error dataFlow click");
        GMTrace.o(7885425737728L, 58751);
      }
    };
    this.oeQ.setAdapter(this.oeY);
    this.oeR.setAdapter(this.oeZ);
    this.oeL.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7883546689536L, 58737);
        if (PhoneRechargeUI.f(PhoneRechargeUI.this) != null) {
          PhoneRechargeUI.g(PhoneRechargeUI.this);
        }
        for (;;)
        {
          PhoneRechargeUI.h(PhoneRechargeUI.this).setVisibility(8);
          GMTrace.o(7883546689536L, 58737);
          return;
          w.e("MicroMsg.PhoneRechargeUI", "hy: no banner but show ad. should not happen");
        }
      }
    });
    this.oeM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7881130770432L, 58719);
        if ((PhoneRechargeUI.f(PhoneRechargeUI.this) != null) && (!bg.nm(PhoneRechargeUI.f(PhoneRechargeUI.this).url)))
        {
          com.tencent.mm.protocal.f.dX(6, 1);
          try
          {
            paramAnonymousView = URLDecoder.decode(PhoneRechargeUI.f(PhoneRechargeUI.this).url, "utf-8");
            PhoneRechargeUI.d(PhoneRechargeUI.this, paramAnonymousView);
            GMTrace.o(7881130770432L, 58719);
            return;
          }
          catch (UnsupportedEncodingException paramAnonymousView)
          {
            w.printErrStackTrace("MicroMsg.PhoneRechargeUI", paramAnonymousView, "", new Object[0]);
          }
        }
        GMTrace.o(7881130770432L, 58719);
      }
    });
    this.oeN.baA();
    this.ofc = getResources().getColor(a.c.aOE);
    if ((this.off.oer != null) && (!bg.nm(this.off.oer.name))) {
      this.desc = this.off.oer.name;
    }
    this.oeN.oge.setHintTextColor(getResources().getColor(a.c.smE));
    if (bg.nm(this.oeN.getText()))
    {
      n(new com.tencent.mm.plugin.recharge.model.f(""));
      GMTrace.o(7895626285056L, 58827);
      return;
    }
    n(new com.tencent.mm.plugin.recharge.model.f(this.oeN.getText()));
    GMTrace.o(7895626285056L, 58827);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7896297373696L, 58832);
    super.onDestroy();
    com.tencent.mm.kernel.h.wS().b(1571, this);
    com.tencent.mm.kernel.h.wS().b(498, this);
    com.tencent.mm.sdk.b.a.vgX.c(this.nJD);
    GMTrace.o(7896297373696L, 58832);
  }
  
  protected void onResume()
  {
    GMTrace.i(7896163155968L, 58831);
    super.onResume();
    q(false, true);
    GMTrace.o(7896163155968L, 58831);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\ui\PhoneRechargeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */