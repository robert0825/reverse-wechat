package com.tencent.mm.plugin.scanner.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.plugin.scanner.a.o;
import com.tencent.mm.plugin.scanner.a.o.a;
import com.tencent.mm.plugin.scanner.a.o.b;
import com.tencent.mm.plugin.scanner.a.o.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VcardContactUI
  extends MMPreference
{
  private static ArrayList<String> ozJ;
  private static int ozL;
  private static int ozM;
  private f htU;
  private o ozI;
  private r ozK;
  
  static
  {
    GMTrace.i(6099121995776L, 45442);
    ozJ = new ArrayList();
    ozL = 1;
    ozM = 1;
    GMTrace.o(6099121995776L, 45442);
  }
  
  public VcardContactUI()
  {
    GMTrace.i(6097914036224L, 45433);
    GMTrace.o(6097914036224L, 45433);
  }
  
  private static void a(List<String> paramList, Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(6098853560320L, 45440);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (paramInt2 == 1)
      {
        paramIntent.putExtra("phone", str);
        paramIntent.putExtra("phone_type", paramInt1);
      }
      else if (paramInt2 == 2)
      {
        paramIntent.putExtra("secondary_phone", str);
        paramIntent.putExtra("phone_type", paramInt1);
      }
      else if (paramInt2 == 3)
      {
        paramIntent.putExtra("tertiary_phone", str);
        paramIntent.putExtra("phone_type", paramInt1);
      }
    }
    GMTrace.o(6098853560320L, 45440);
  }
  
  private void b(List<String> paramList, String paramString1, String paramString2)
  {
    GMTrace.i(6098585124864L, 45438);
    if ((paramList != null) && (paramList.size() > 0))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        VcardContactLinkPreference localVcardContactLinkPreference = new VcardContactLinkPreference(this);
        localVcardContactLinkPreference.setKey(paramString1 + String.valueOf(str));
        if (!ozJ.contains(paramString1 + String.valueOf(str))) {
          ozJ.add(paramString1 + String.valueOf(str));
        }
        localVcardContactLinkPreference.setTitle(paramString2);
        localVcardContactLinkPreference.setLayoutResource(R.i.cBA);
        localVcardContactLinkPreference.setSummary(str);
        localVcardContactLinkPreference.lP(false);
        localVcardContactLinkPreference.wko = true;
        localVcardContactLinkPreference.caY();
        this.htU.a(localVcardContactLinkPreference, ozL);
      }
    }
    GMTrace.o(6098585124864L, 45438);
  }
  
  private void dx(String paramString1, String paramString2)
  {
    GMTrace.i(6098719342592L, 45439);
    KeyValuePreference localKeyValuePreference = new KeyValuePreference(this);
    localKeyValuePreference.setTitle(paramString2);
    localKeyValuePreference.setLayoutResource(R.i.cBA);
    localKeyValuePreference.lP(false);
    localKeyValuePreference.setSummary(paramString1);
    localKeyValuePreference.wko = false;
    localKeyValuePreference.caY();
    this.htU.a(localKeyValuePreference, ozM);
    GMTrace.o(6098719342592L, 45439);
  }
  
  protected final void MP()
  {
    GMTrace.i(6098450907136L, 45437);
    this.ozK = new r(this);
    this.htU = this.wky;
    this.ozI = o.oub;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6102343221248L, 45466);
        VcardContactUI.this.finish();
        GMTrace.o(6102343221248L, 45466);
        return true;
      }
    });
    sq("");
    this.htU.removeAll();
    this.htU.addPreferencesFromResource(R.o.epG);
    Object localObject = (VcardContactUserHeaderPreference)this.htU.VG("v_contact_info_header");
    if (localObject != null)
    {
      o localo = this.ozI;
      if (localo != null)
      {
        if (!bg.nm(localo.otK.KI())) {
          ((VcardContactUserHeaderPreference)localObject).ozT = localo.otK.KI();
        }
        if (!bg.nm(localo.aDn)) {
          ((VcardContactUserHeaderPreference)localObject).aDn = localo.aDn;
        }
        if (!bg.nm(localo.otY)) {
          ((VcardContactUserHeaderPreference)localObject).otY = localo.otY;
        }
        if (!bg.nm(localo.title)) {
          ((VcardContactUserHeaderPreference)localObject).title = localo.title;
        }
      }
    }
    this.htU.VH("c_contact_info_wx_id");
    if (!bg.nm(this.ozI.hLG))
    {
      localObject = (VcardContactLinkPreference)this.htU.VG("v_contact_info_photo_uri");
      if (localObject != null)
      {
        ((VcardContactLinkPreference)localObject).setSummary(this.ozI.hLG);
        ((VcardContactLinkPreference)localObject).lP(false);
        ((KeyValuePreference)localObject).wko = false;
        ozL += 2;
        ozM += 2;
      }
      localObject = this.ozI.otR;
      if ((localObject != null) && (((o.a)localObject).KI().length() > 0)) {
        dx(((o.a)localObject).KI(), this.vKB.vKW.getString(R.l.efI));
      }
      localObject = this.ozI.otS;
      if ((localObject != null) && (((o.a)localObject).KI().length() > 0)) {
        dx(((o.a)localObject).KI(), this.vKB.vKW.getString(R.l.efP));
      }
      localObject = this.ozI.otP;
      if ((localObject != null) && (((o.a)localObject).KI().length() > 0)) {
        dx(((o.a)localObject).KI(), this.vKB.vKW.getString(R.l.efG));
      }
      localObject = this.ozI.otQ;
      if ((localObject != null) && (((o.a)localObject).KI().length() > 0)) {
        dx(((o.a)localObject).KI(), this.vKB.vKW.getString(R.l.efG));
      }
      localObject = this.ozI.otV;
      if ((localObject != null) && (((List)localObject).size() > 0)) {
        b((List)localObject, "WorkTel", this.vKB.vKW.getString(R.l.efQ));
      }
      localObject = this.ozI.otU;
      if ((localObject != null) && (((List)localObject).size() > 0)) {
        b((List)localObject, "HomeTel", this.vKB.vKW.getString(R.l.efJ));
      }
      localObject = this.ozI.otW;
      if ((localObject != null) && (((List)localObject).size() > 0)) {
        b((List)localObject, "VideoTEL", this.vKB.vKW.getString(R.l.efO));
      }
      localObject = this.ozI.otX;
      if ((localObject != null) && (((List)localObject).size() > 0)) {
        b((List)localObject, "NormalTel", this.vKB.vKW.getString(R.l.efL));
      }
      localObject = this.ozI.otT;
      if ((localObject != null) && (((List)localObject).size() > 0)) {
        b((List)localObject, "CellTel", this.vKB.vKW.getString(R.l.efH));
      }
      if (bg.nm(this.ozI.hLP)) {
        break label1080;
      }
      localObject = (KeyValuePreference)this.htU.VG("v_contact_info_org");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.ozI.hLP);
        ((KeyValuePreference)localObject).lP(false);
        ((KeyValuePreference)localObject).wko = true;
      }
      label702:
      if (bg.nm(this.ozI.otZ)) {
        break label1096;
      }
      localObject = (KeyValuePreference)this.htU.VG("v_contact_info_agent");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.ozI.otZ);
        ((KeyValuePreference)localObject).lP(false);
        ((KeyValuePreference)localObject).wko = true;
      }
      label756:
      if (bg.nm(this.ozI.url)) {
        break label1112;
      }
      localObject = (VcardContactLinkPreference)this.htU.VG("v_contact_info_home_page");
      if (localObject != null)
      {
        ((VcardContactLinkPreference)localObject).setSummary(this.ozI.url);
        ((VcardContactLinkPreference)localObject).lP(false);
        ((KeyValuePreference)localObject).wko = true;
      }
      label810:
      if (bg.nm(this.ozI.fjd)) {
        break label1141;
      }
      localObject = (VcardContactLinkPreference)this.htU.VG("v_contact_info_email");
      if (localObject != null)
      {
        ((VcardContactLinkPreference)localObject).setSummary(this.ozI.fjd);
        ((VcardContactLinkPreference)localObject).lP(false);
        ((KeyValuePreference)localObject).wko = true;
      }
      label864:
      if (bg.nm(this.ozI.otO)) {
        break label1157;
      }
      localObject = (KeyValuePreference)this.htU.VG("v_contact_info_birthday");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.ozI.otO);
        ((KeyValuePreference)localObject).lP(false);
        ((KeyValuePreference)localObject).wko = true;
      }
      label918:
      if (bg.nm(this.ozI.oua)) {
        break label1186;
      }
      localObject = (KeyValuePreference)this.htU.VG("v_contact_info_remark");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.ozI.oua);
        ((KeyValuePreference)localObject).lP(false);
        ((KeyValuePreference)localObject).wko = true;
      }
    }
    for (;;)
    {
      if ((this.ozI.otM == null) || (!this.ozI.otM.oue.contains("uri"))) {
        break label1215;
      }
      localObject = (VcardContactLinkPreference)this.htU.VG("v_contact_info_logo");
      ((VcardContactLinkPreference)localObject).setSummary(this.ozI.otM.ouf);
      ((KeyValuePreference)localObject).wko = false;
      ((VcardContactLinkPreference)localObject).lP(false);
      GMTrace.o(6098450907136L, 45437);
      return;
      this.htU.VH("v_contact_info_photo_uri");
      this.htU.VH("v_category_photo_uri");
      break;
      label1080:
      this.htU.VH("v_contact_info_org");
      break label702;
      label1096:
      this.htU.VH("v_contact_info_agent");
      break label756;
      label1112:
      this.htU.VH("v_contact_info_home_page");
      this.htU.VH("v_category_home_page");
      break label810;
      label1141:
      this.htU.VH("v_contact_info_email");
      break label864;
      label1157:
      this.htU.VH("v_contact_info_birthday");
      this.htU.VH("v_category_birthday");
      break label918;
      label1186:
      this.htU.VH("v_contact_info_remark");
      this.htU.VH("v_category_remark");
    }
    label1215:
    this.htU.VH("v_contact_info_logo");
    this.htU.VH("v_category_logo");
    GMTrace.o(6098450907136L, 45437);
  }
  
  public final int QI()
  {
    GMTrace.i(6098182471680L, 45435);
    GMTrace.o(6098182471680L, 45435);
    return -1;
  }
  
  public final boolean a(f paramf, final Preference paramPreference)
  {
    GMTrace.i(6098316689408L, 45436);
    final Object localObject;
    if (paramPreference.hiu.equals("add_vcard_contact"))
    {
      paramf = getString(R.l.efF);
      paramPreference = getString(R.l.efE);
      localObject = new h.c()
      {
        public final void hQ(int paramAnonymousInt)
        {
          GMTrace.i(6131200032768L, 45681);
          switch (paramAnonymousInt)
          {
          }
          for (;;)
          {
            GMTrace.o(6131200032768L, 45681);
            return;
            bq.BG().c(10238, new Object[] { Integer.valueOf(1) });
            Intent localIntent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
            VcardContactUI.a(VcardContactUI.this, localIntent);
            VcardContactUI.this.startActivity(localIntent);
            GMTrace.o(6131200032768L, 45681);
            return;
            bq.BG().c(10239, new Object[] { Integer.valueOf(1) });
            localIntent = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
            localIntent.setType("vnd.android.cursor.item/person");
            VcardContactUI.a(VcardContactUI.this, localIntent);
            VcardContactUI.this.startActivity(localIntent);
          }
        }
      };
      h.a(this, "", new String[] { paramf, paramPreference }, "", (h.c)localObject);
      GMTrace.o(6098316689408L, 45436);
      return true;
    }
    if ((paramPreference.hiu.equals("v_contact_info_photo_uri")) || (paramPreference.hiu.equals("v_contact_info_home_page")) || (paramPreference.hiu.equals("v_contact_info_logo")))
    {
      paramf = paramPreference.getSummary().toString();
      if ((paramf != null) && (paramf.length() > 0))
      {
        paramPreference = this.ozK;
        if (!paramPreference.nPj.bQn()) {
          w.e("MicroMsg.scanner.ViewMMURL", "already running, skipped");
        }
        for (;;)
        {
          GMTrace.o(6098316689408L, 45436);
          return true;
          if ((paramf == null) || (paramf.length() == 0))
          {
            w.e("MicroMsg.scanner.ViewMMURL", "go fail, qqNum is null");
          }
          else
          {
            paramPreference.url = paramf;
            at.AR();
            localObject = (String)c.xh().get(46, null);
            if ((localObject == null) || (((String)localObject).length() == 0))
            {
              paramPreference.b(paramf, (int)System.currentTimeMillis(), new byte[0]);
            }
            else
            {
              at.wS().a(233, paramPreference);
              paramPreference.ozU = new l(paramf, null, 4, (int)System.currentTimeMillis(), new byte[0]);
              at.wS().a(paramPreference.ozU, 0);
              paramPreference.nPj.z(3000L, 3000L);
            }
          }
        }
      }
    }
    else if ((ozJ.contains(paramPreference.hiu)) && (!paramPreference.hiu.toLowerCase().contains("fax")))
    {
      paramPreference = paramPreference.getSummary().toString().trim();
      if ((paramPreference != null) && (paramPreference.length() > 0))
      {
        paramf = getString(R.l.dgR);
        paramPreference = new h.c()
        {
          public final void hQ(int paramAnonymousInt)
          {
            GMTrace.i(6126099759104L, 45643);
            switch (paramAnonymousInt)
            {
            }
            for (;;)
            {
              GMTrace.o(6126099759104L, 45643);
              return;
              Intent localIntent = new Intent("android.intent.action.DIAL");
              localIntent.setFlags(268435456);
              localIntent.setData(Uri.parse("tel:" + paramPreference));
              VcardContactUI.this.startActivity(localIntent);
            }
          }
        };
        h.a(this, "", new String[] { paramf }, "", paramPreference);
        GMTrace.o(6098316689408L, 45436);
        return true;
      }
    }
    else if (paramPreference.hiu.equals("v_contact_info_email"))
    {
      localObject = paramPreference.getSummary().toString();
      paramf = this.vKB.vKW.getString(R.l.dXs);
      paramPreference = this.vKB.vKW.getString(R.l.dXr);
      localObject = new h.c()
      {
        public final void hQ(int paramAnonymousInt)
        {
          GMTrace.i(6083821174784L, 45328);
          switch (paramAnonymousInt)
          {
          }
          for (;;)
          {
            GMTrace.o(6083821174784L, 45328);
            return;
            Intent localIntent = new Intent();
            String str = localObject + " " + localObject;
            localIntent.putExtra("composeType", 4);
            localIntent.putExtra("toList", new String[] { str });
            d.b(VcardContactUI.this, "qqmail", ".ui.ComposeUI", localIntent);
            GMTrace.o(6083821174784L, 45328);
            return;
            localIntent = new Intent("android.intent.action.SEND");
            localIntent.setType("text/plain");
            localIntent.putExtra("android.intent.extra.EMAIL", new String[] { localObject });
            VcardContactUI.this.startActivity(localIntent);
          }
        }
      };
      h.a(this, "", new String[] { paramf, paramPreference }, "", (h.c)localObject);
    }
    GMTrace.o(6098316689408L, 45436);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6098048253952L, 45434);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(6098048253952L, 45434);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\VcardContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */