package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.a.o;
import com.tencent.mm.ac.e.b;
import com.tencent.mm.ac.n;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.b;
import com.tencent.mm.plugin.profile.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ContactSocialInfoUI
  extends MMPreference
{
  private String eQu;
  private f iAA;
  private x kse;
  private long nMi;
  private String nMj;
  private b nMr;
  private String nMs;
  private String nMt;
  private String nMu;
  private String nMv;
  private String nMw;
  private String nMx;
  private String nMy;
  private JSONObject nMz;
  
  public ContactSocialInfoUI()
  {
    GMTrace.i(6797188399104L, 50643);
    GMTrace.o(6797188399104L, 50643);
  }
  
  private void EJ(String paramString)
  {
    GMTrace.i(6798127923200L, 50650);
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setFlags(268435456);
    localIntent.setData(Uri.parse("tel:" + paramString));
    startActivity(localIntent);
    GMTrace.o(6798127923200L, 50650);
  }
  
  private void aXD()
  {
    GMTrace.i(6798262140928L, 50651);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.nMz.optString("ShopUrl"));
    localIntent.putExtra("geta8key_username", q.zE());
    com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    GMTrace.o(6798262140928L, 50651);
  }
  
  private void m(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(6797725270016L, 50647);
    if ((!bg.nm(paramString2)) && (!bg.nm(paramString1)))
    {
      paramString1 = (KeyValuePreference)this.iAA.VG(paramString1);
      if (paramString1 != null)
      {
        paramString1.wkr = true;
        paramString1.wkt = 5;
        if (paramBoolean) {
          paramString1.jLG = getResources().getColor(R.e.aOm);
        }
        paramString1.setSummary(paramString2);
        paramString1.lP(false);
      }
      GMTrace.o(6797725270016L, 50647);
      return;
    }
    this.iAA.VH(paramString1);
    GMTrace.o(6797725270016L, 50647);
  }
  
  private boolean p(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(6797993705472L, 50649);
    if (paramBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      boolean bool = com.tencent.mm.modelfriend.m.a(paramString, this.vKB.vKW, localByteArrayOutputStream.toByteArray());
      GMTrace.o(6797993705472L, 50649);
      return bool;
    }
    GMTrace.o(6797993705472L, 50649);
    return false;
  }
  
  protected final void MP()
  {
    GMTrace.i(6797591052288L, 50646);
    oM(R.l.dkQ);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6782558666752L, 50534);
        ContactSocialInfoUI.this.finish();
        GMTrace.o(6782558666752L, 50534);
        return true;
      }
    });
    this.iAA = this.wky;
    Object localObject1 = getIntent().getStringExtra("Contact_Mobile_MD5");
    Object localObject2 = getIntent().getStringExtra("Contact_full_Mobile_MD5");
    if ((bg.nm((String)localObject1)) && (bg.nm((String)localObject2))) {
      if (bg.nm(this.kse.field_username)) {
        this.nMr = com.tencent.mm.modelfriend.af.If().jJ(this.eQu);
      }
    }
    for (;;)
    {
      label159:
      int i;
      if ((this.nMr == null) || (this.nMr.GS() == null) || (this.nMr.GS().length() <= 0))
      {
        w.e("MicroMsg.ContactSocialInfoUI", "error : this is not the mobile contact, MD5 = " + this.nMs);
        m("contact_info_social_mobile", this.nMt, true);
        at.AR();
        i = bg.e((Integer)com.tencent.mm.y.c.xh().get(9, null));
        this.nMi = getIntent().getLongExtra("Contact_Uin", 0L);
        this.nMj = getIntent().getStringExtra("Contact_QQNick");
        if ((this.nMi != 0L) && (i != 0))
        {
          if ((this.nMj == null) || (this.nMj.length() == 0))
          {
            long l = this.nMi;
            localObject2 = com.tencent.mm.modelfriend.af.Ik().am(l);
            localObject1 = localObject2;
            if (localObject2 == null) {
              localObject1 = null;
            }
            if (localObject1 != null) {
              this.nMj = ((ad)localObject1).getDisplayName();
            }
          }
          this.nMu = bg.nl(this.nMj);
          this.nMu = (this.nMu + " " + new o(this.nMi).longValue());
        }
        m("contact_info_social_qq", this.nMu, true);
        localObject1 = com.tencent.mm.k.g.ut().getValue("LinkedinPluginClose");
        if ((!bg.nm((String)localObject1)) && (Integer.valueOf((String)localObject1).intValue() != 0)) {
          break label840;
        }
        i = 1;
        label389:
        if ((i == 0) || (bg.nm(this.kse.fjv))) {
          break label845;
        }
        this.nMv = this.kse.fjw;
        label417:
        m("contact_info_social_linkedin", this.nMv, true);
        m("contact_info_social_facebook", this.nMw, false);
        this.nMy = bg.aq(getIntent().getStringExtra("verify_gmail"), "");
        this.nMx = bg.aq(getIntent().getStringExtra("profileName"), bg.SI(this.nMy));
        if ((bg.nm(this.nMy)) || (bg.nm(this.nMx))) {
          break label855;
        }
        m("contact_info_social_googlecontacts", this.nMx + '\n' + this.nMy, false);
        label542:
        if (!q.zE().equals(this.kse.field_username)) {
          break label869;
        }
        at.AR();
        localObject1 = (String)com.tencent.mm.y.c.xh().get(w.a.vsB, null);
        w.i("MicroMsg.ContactSocialInfoUI", "in self social info page, weishop info:%s", new Object[] { localObject1 });
        if (bg.nm((String)localObject1)) {}
      }
      try
      {
        this.nMz = new JSONObject((String)localObject1);
        if (this.nMz != null)
        {
          m("contact_info_social_weishop", this.nMz.optString("ShopName"), true);
          GMTrace.o(6797591052288L, 50646);
          return;
          this.nMr = com.tencent.mm.modelfriend.af.If().jJ(this.kse.field_username);
          continue;
          if (((localObject1 == null) || (((String)localObject1).length() <= 0)) && ((localObject2 == null) || (((String)localObject2).length() <= 0))) {
            continue;
          }
          this.nMr = com.tencent.mm.modelfriend.af.If().jK((String)localObject1);
          if ((this.nMr != null) && (this.nMr.GS() != null) && (this.nMr.GS().length() > 0)) {
            continue;
          }
          this.nMr = com.tencent.mm.modelfriend.af.If().jK((String)localObject2);
          if ((this.nMr == null) || (this.nMr.GS() == null)) {
            continue;
          }
          this.nMr.GS().length();
          continue;
          this.nMt = (bg.nl(this.nMr.GU()) + " " + bg.nl(this.nMr.Ha()).replace(" ", ""));
          break label159;
          label840:
          i = 0;
          break label389;
          label845:
          this.nMv = "";
          break label417;
          label855:
          m("contact_info_social_googlecontacts", "", false);
          break label542;
          label869:
          localObject1 = this.kse.fjy;
          w.i("MicroMsg.ContactSocialInfoUI", "weiShopInfo:%s", new Object[] { localObject1 });
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.ContactSocialInfoUI", localJSONException, "", new Object[0]);
          this.nMz = null;
        }
        m("contact_info_social_weishop", "", false);
        GMTrace.o(6797591052288L, 50646);
      }
    }
  }
  
  public final int QI()
  {
    GMTrace.i(6797322616832L, 50644);
    int i = R.o.eoN;
    GMTrace.o(6797322616832L, 50644);
    return i;
  }
  
  public final boolean a(f paramf, final Preference paramPreference)
  {
    GMTrace.i(6797859487744L, 50648);
    paramf = paramPreference.hiu;
    w.i("MicroMsg.ContactSocialInfoUI", paramf + " item has been clicked!");
    if (paramf.equals("contact_info_social_mobile")) {
      if ((this.nMr != null) && (this.kse != null)) {}
    }
    for (;;)
    {
      GMTrace.o(6797859487744L, 50648);
      return false;
      at.AR();
      if (com.tencent.mm.y.c.yK().TA(this.nMr.getUsername()))
      {
        if ((this.nMr != null) && (!bg.nm(this.nMr.gsO))) {}
        for (paramf = getResources().getStringArray(R.c.aMu);; paramf = getResources().getStringArray(R.c.aMv))
        {
          paramPreference = paramf;
          if (a.hnI.pw())
          {
            paramf = bg.g(paramf);
            paramf.add(getResources().getString(R.l.dgN));
            paramPreference = (String[])paramf.toArray(new String[paramf.size()]);
            com.tencent.mm.plugin.report.service.g.ork.i(11621, new Object[] { Integer.valueOf(2), Integer.valueOf(3) });
          }
          h.a(this, null, paramPreference, null, new h.c()
          {
            public final void hQ(int paramAnonymousInt)
            {
              GMTrace.i(6740145864704L, 50218);
              switch (paramAnonymousInt)
              {
              }
              for (;;)
              {
                GMTrace.o(6740145864704L, 50218);
                return;
                if ((ContactSocialInfoUI.a(ContactSocialInfoUI.this) == null) || (ContactSocialInfoUI.a(ContactSocialInfoUI.this).length() == 0))
                {
                  GMTrace.o(6740145864704L, 50218);
                  return;
                }
                paramAnonymousInt = ContactSocialInfoUI.a(ContactSocialInfoUI.this).lastIndexOf(' ') + 1;
                if (paramAnonymousInt > 0)
                {
                  ContactSocialInfoUI.a(ContactSocialInfoUI.this, ContactSocialInfoUI.a(ContactSocialInfoUI.this).substring(paramAnonymousInt));
                  GMTrace.o(6740145864704L, 50218);
                  return;
                  if ((ContactSocialInfoUI.a(ContactSocialInfoUI.this) == null) || (ContactSocialInfoUI.a(ContactSocialInfoUI.this).length() == 0))
                  {
                    GMTrace.o(6740145864704L, 50218);
                    return;
                  }
                  paramAnonymousInt = ContactSocialInfoUI.a(ContactSocialInfoUI.this).lastIndexOf(' ');
                  Object localObject = ContactSocialInfoUI.a(ContactSocialInfoUI.this).substring(0, paramAnonymousInt);
                  if ((localObject == null) || (((String)localObject).length() == 0))
                  {
                    GMTrace.o(6740145864704L, 50218);
                    return;
                  }
                  s.b(ContactSocialInfoUI.b(ContactSocialInfoUI.this), ((String)localObject).trim());
                  GMTrace.o(6740145864704L, 50218);
                  return;
                  if ((paramPreference == null) || (paramPreference.length <= 2) || (ContactSocialInfoUI.c(ContactSocialInfoUI.this) == null) || (ContactSocialInfoUI.b(ContactSocialInfoUI.this) == null))
                  {
                    GMTrace.o(6740145864704L, 50218);
                    return;
                  }
                  if ((ContactSocialInfoUI.c(ContactSocialInfoUI.this) != null) && (!bg.nm(ContactSocialInfoUI.c(ContactSocialInfoUI.this).gsO)))
                  {
                    ContactSocialInfoUI.a(ContactSocialInfoUI.this, ContactSocialInfoUI.b(ContactSocialInfoUI.this).field_username, ContactSocialInfoUI.c(ContactSocialInfoUI.this).gsO);
                    GMTrace.o(6740145864704L, 50218);
                    return;
                  }
                  localObject = new Intent();
                  Bundle localBundle = new Bundle();
                  localBundle.putInt("fromScene", 2);
                  ((Intent)localObject).putExtra("reportArgs", localBundle);
                  a.hnH.k((Intent)localObject, ContactSocialInfoUI.this);
                }
              }
            }
          });
          break;
        }
      }
      if ((this.nMt != null) && (this.nMt.length() != 0))
      {
        int i = this.nMt.lastIndexOf(' ') + 1;
        if (i > 0)
        {
          EJ(this.nMt.substring(i));
          continue;
          if (!paramf.equals("contact_info_social_qq")) {
            if (paramf.equals("contact_info_social_linkedin"))
            {
              paramf = this.kse.fjx;
              if (bg.nm(paramf))
              {
                w.e("MicroMsg.ContactSocialInfoUI", "this liurl is null!");
              }
              else
              {
                paramPreference = new Intent();
                paramPreference.putExtra("rawUrl", paramf);
                paramPreference.putExtra("geta8key_username", q.zE());
                com.tencent.mm.bj.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramPreference);
              }
            }
            else if ((!paramf.equals("contact_info_social_facebook")) && (!paramf.equals("contact_info_social_googlecontacts")) && (paramf.equals("contact_info_social_weishop")) && (this.nMz != null))
            {
              at.AR();
              if (com.tencent.mm.y.c.xh().get(w.a.vtc, null) == null) {
                h.a(this, R.l.dkR, R.l.cUG, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                  {
                    GMTrace.i(18473459646464L, 137638);
                    ContactSocialInfoUI.d(ContactSocialInfoUI.this);
                    at.AR();
                    com.tencent.mm.y.c.xh().a(w.a.vtc, Integer.valueOf(1));
                    GMTrace.o(18473459646464L, 137638);
                  }
                }, null);
              } else {
                aXD();
              }
            }
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6797456834560L, 50645);
    super.onCreate(paramBundle);
    this.eQu = bg.nl(getIntent().getStringExtra("Contact_User"));
    at.AR();
    this.kse = com.tencent.mm.y.c.yK().TE(this.eQu);
    MP();
    GMTrace.o(6797456834560L, 50645);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\ContactSocialInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */