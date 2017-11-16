package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.widget.CardTextPreference;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CardDetailPreference
  extends MMPreference
{
  private final String TAG;
  f iAA;
  private TextView jEg;
  private com.tencent.mm.plugin.card.base.b jwZ;
  private List<com.tencent.mm.plugin.card.model.b> jxd;
  
  public CardDetailPreference()
  {
    GMTrace.i(4957600219136L, 36937);
    this.TAG = "MicroMsg.CardDetailPreference";
    this.jxd = new ArrayList();
    GMTrace.o(4957600219136L, 36937);
  }
  
  private void ale()
  {
    GMTrace.i(4958002872320L, 36940);
    int i = 0;
    while (i < this.jxd.size())
    {
      com.tencent.mm.plugin.card.model.b localb = (com.tencent.mm.plugin.card.model.b)this.jxd.get(i);
      Preference localPreference = new Preference(this);
      localPreference.setLayoutResource(R.i.cBA);
      localPreference.setKey(localb.title);
      localPreference.setTitle(localb.title);
      if (!TextUtils.isEmpty(localb.jxI)) {
        localPreference.setSummary(localb.jxI);
      }
      if (localb.jxU) {
        alg();
      }
      this.iAA.a(localPreference);
      i += 1;
    }
    GMTrace.o(4958002872320L, 36940);
  }
  
  private void alf()
  {
    GMTrace.i(4958137090048L, 36941);
    if ((this.jwZ.ajv().tZJ != null) && (this.jwZ.ajv().tZJ != null))
    {
      int i = 0;
      while (i < this.jwZ.ajv().tZJ.size())
      {
        np localnp = (np)this.jwZ.ajv().tZJ.get(i);
        if (!TextUtils.isEmpty(localnp.jxI))
        {
          CardTextPreference localCardTextPreference = new CardTextPreference(this);
          localCardTextPreference.setLayoutResource(R.i.cBA);
          localCardTextPreference.setTitle(localnp.jxI);
          localCardTextPreference.ana();
          uo(localnp.title);
          this.iAA.a(localCardTextPreference);
        }
        i += 1;
      }
      alg();
    }
    GMTrace.o(4958137090048L, 36941);
  }
  
  private void alg()
  {
    GMTrace.i(4958271307776L, 36942);
    PreferenceSmallCategory localPreferenceSmallCategory = new PreferenceSmallCategory(this);
    this.iAA.a(localPreferenceSmallCategory);
    GMTrace.o(4958271307776L, 36942);
  }
  
  private void uo(String paramString)
  {
    GMTrace.i(4958405525504L, 36943);
    PreferenceTitleCategory localPreferenceTitleCategory = new PreferenceTitleCategory(this);
    if (TextUtils.isEmpty(paramString)) {
      localPreferenceTitleCategory.setTitle(" ");
    }
    for (;;)
    {
      this.iAA.a(localPreferenceTitleCategory);
      GMTrace.o(4958405525504L, 36943);
      return;
      localPreferenceTitleCategory.setTitle(paramString);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(4957868654592L, 36939);
    this.jwZ = ((com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info_data"));
    if ((this.jwZ == null) || (this.jwZ.ajv() == null) || (this.jwZ.ajw() == null))
    {
      w.e("MicroMsg.CardDetailPreference", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
      finish();
      GMTrace.o(4957868654592L, 36939);
      return;
    }
    Object localObject = new StringBuilder();
    if (!TextUtils.isEmpty(this.jwZ.ajv().jyS)) {
      ((StringBuilder)localObject).append(this.jwZ.ajv().jyS);
    }
    ((StringBuilder)localObject).append(getString(R.l.dcw));
    sq(((StringBuilder)localObject).toString());
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5030480445440L, 37480);
        CardDetailPreference.this.finish();
        GMTrace.o(5030480445440L, 37480);
        return true;
      }
    });
    this.iAA = this.wky;
    this.jxd.clear();
    if ((this.jwZ.ajw().tZb != null) && (this.jwZ.ajw().tZb.size() > 0)) {
      this.jxd.addAll(l.ac(this.jwZ.ajw().tZb));
    }
    if ((this.jwZ.ajw().tZc != null) && (this.jwZ.ajw().tZc.size() > 0))
    {
      localObject = l.ac(this.jwZ.ajw().tZc);
      ((com.tencent.mm.plugin.card.model.b)((List)localObject).get(0)).jxU = true;
      this.jxd.addAll((Collection)localObject);
    }
    alg();
    alf();
    ale();
    if (!TextUtils.isEmpty(this.jwZ.ajv().tZK))
    {
      localObject = new CardTextPreference(this);
      ((CardTextPreference)localObject).setLayoutResource(R.i.cBA);
      ((CardTextPreference)localObject).setTitle(getString(R.l.ddp));
      ((CardTextPreference)localObject).setKey("key_pic_detail");
      ((CardTextPreference)localObject).ana();
      alg();
      this.iAA.a((Preference)localObject);
    }
    if (!TextUtils.isEmpty(this.jwZ.ajv().tZH))
    {
      alg();
      localObject = new CardTextPreference(this);
      ((CardTextPreference)localObject).setLayoutResource(R.i.cBA);
      ((CardTextPreference)localObject).setKey("card_phone");
      ((CardTextPreference)localObject).setTitle(R.l.dcY);
      ((CardTextPreference)localObject).setSummary(this.jwZ.ajv().tZH);
      ((CardTextPreference)localObject).jLG = getResources().getColor(R.e.aOm);
      ((CardTextPreference)localObject).amZ();
      this.iAA.a((Preference)localObject);
      uo("");
    }
    if ((this.jwZ.ajv() != null) && (!TextUtils.isEmpty(this.jwZ.ajv().aEe)) && (this.jEg != null))
    {
      this.jEg.setText(this.jwZ.ajv().aEe);
      this.jEg.setVisibility(0);
    }
    GMTrace.o(4957868654592L, 36939);
  }
  
  public final int QI()
  {
    GMTrace.i(4958539743232L, 36944);
    int i = R.o.eos;
    GMTrace.o(4958539743232L, 36944);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4958673960960L, 36945);
    if (paramPreference.hiu.equals("card_phone"))
    {
      paramf = this.jwZ.ajv().tZH;
      Intent localIntent = new Intent("android.intent.action.DIAL");
      localIntent.setFlags(268435456);
      localIntent.setData(Uri.parse("tel:" + paramf));
      startActivity(localIntent);
    }
    if (paramPreference.hiu.equals("key_pic_detail")) {
      com.tencent.mm.plugin.card.b.b.a(this, this.jwZ.ajv().tZK, 0);
    }
    for (;;)
    {
      GMTrace.o(4958673960960L, 36945);
      return false;
      int i = 0;
      while (i < this.jxd.size())
      {
        paramf = (com.tencent.mm.plugin.card.model.b)this.jxd.get(i);
        if ((paramf.title != null) && (paramf.title.equals(paramPreference.hiu)) && (!TextUtils.isEmpty(paramf.url)))
        {
          if (com.tencent.mm.plugin.card.b.b.c(this.jwZ.ajz(), paramf.tZx, paramf.tZy, 1028, 0))
          {
            GMTrace.o(4958673960960L, 36945);
            return false;
          }
          com.tencent.mm.plugin.card.b.b.a(this, paramf.url, 1);
        }
        i += 1;
      }
    }
  }
  
  public final View alh()
  {
    GMTrace.i(4958808178688L, 36946);
    View localView = getLayoutInflater().inflate(R.i.cGP, null);
    this.jEg = ((TextView)localView.findViewById(R.h.cfz));
    this.jEg.setVisibility(8);
    GMTrace.o(4958808178688L, 36946);
    return localView;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4957734436864L, 36938);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4957734436864L, 36938);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardDetailPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */