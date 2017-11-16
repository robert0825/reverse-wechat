package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.af.d.b;
import com.tencent.mm.af.d.b.c;
import com.tencent.mm.af.d.b.d;
import com.tencent.mm.af.d.b.e;
import com.tencent.mm.af.d.b.f;
import com.tencent.mm.af.h.a;
import com.tencent.mm.af.m.a;
import com.tencent.mm.af.m.a.a;
import com.tencent.mm.af.t;
import com.tencent.mm.g.a.ct;
import com.tencent.mm.g.a.ct.b;
import com.tencent.mm.g.a.cx;
import com.tencent.mm.g.a.cx.b;
import com.tencent.mm.g.a.mx;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.protocal.c.awq;
import com.tencent.mm.protocal.c.bcp;
import com.tencent.mm.protocal.c.bcq;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bia;
import com.tencent.mm.protocal.c.btz;
import com.tencent.mm.protocal.c.hf;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.p;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import org.json.JSONObject;

public final class c
  implements com.tencent.mm.ad.e, h.a, com.tencent.mm.af.n, com.tencent.mm.pluginsdk.d.a
{
  public MMActivity ezR;
  private SharedPreferences ghC;
  private List<com.tencent.mm.af.d.a> gvK;
  private d.b gvL;
  private boolean gvS;
  private String gvU;
  public com.tencent.mm.ui.base.r hsU;
  public com.tencent.mm.ui.base.preference.f htU;
  public com.tencent.mm.storage.x iBi;
  private boolean jGN;
  private CheckBoxPreference jNv;
  public boolean jqh;
  public com.tencent.mm.af.d jsU;
  String nLA;
  private String nLE;
  private boolean nLx;
  private int nLz;
  private com.tencent.mm.af.a.j nMD;
  private List<WxaAttributes.WxaEntryInfo> nME;
  private oo nMF;
  private boolean nMG;
  private boolean nMH;
  public boolean nMI;
  private int nMJ;
  private String nMK;
  private boolean nML;
  com.tencent.mm.ui.base.i nMM;
  private Bundle nMN;
  public SnsAdClick nMO;
  private String nMP;
  
  private c(MMActivity paramMMActivity)
  {
    GMTrace.i(6779069005824L, 50508);
    this.nMF = null;
    this.nMG = false;
    this.nMH = false;
    this.gvS = false;
    this.nMI = false;
    this.nMJ = 0;
    this.nMM = null;
    this.ghC = null;
    this.nMO = null;
    this.nMP = null;
    this.hsU = null;
    this.jqh = false;
    this.ezR = paramMMActivity;
    GMTrace.o(6779069005824L, 50508);
  }
  
  public c(MMActivity paramMMActivity, String paramString, oo paramoo)
  {
    this(paramMMActivity);
    GMTrace.i(6779203223552L, 50509);
    this.nLE = paramString;
    this.nMF = paramoo;
    GMTrace.o(6779203223552L, 50509);
  }
  
  private static boolean EK(String paramString)
  {
    GMTrace.i(6780411183104L, 50518);
    try
    {
      long l = bg.getLong(paramString, 0L);
      if ((l > 0L) && (l - System.currentTimeMillis() / 1000L < 0L))
      {
        GMTrace.o(6780411183104L, 50518);
        return true;
      }
      GMTrace.o(6780411183104L, 50518);
      return false;
    }
    catch (Exception paramString)
    {
      GMTrace.o(6780411183104L, 50518);
    }
    return false;
  }
  
  private void EL(final String paramString)
  {
    GMTrace.i(6781082271744L, 50523);
    com.tencent.mm.sdk.platformtools.af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6770881724416L, 50447);
        if (c.this.htU == null)
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "LazyGetAvatar screen is null");
          GMTrace.o(6770881724416L, 50447);
          return;
        }
        IconWidgetPreference localIconWidgetPreference = (IconWidgetPreference)c.this.htU.VG("contact_info_kf_worker");
        if ((localIconWidgetPreference != null) && (c.this.htU != null))
        {
          Bitmap localBitmap = com.tencent.mm.ac.b.a(paramString, false, -1);
          if (localBitmap != null)
          {
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "LazyGetAvatar success %s, update screen", new Object[] { paramString });
            localIconWidgetPreference.C(localBitmap);
            c.this.htU.notifyDataSetChanged();
          }
        }
        GMTrace.o(6770881724416L, 50447);
      }
    }, 2000L);
    GMTrace.o(6781082271744L, 50523);
  }
  
  private void aXE()
  {
    GMTrace.i(6779874312192L, 50514);
    ahL();
    this.htU.removeAll();
    this.htU.addPreferencesFromResource(R.o.eot);
    if (this.nMI) {
      this.htU.bc("contact_info_time_expired", true);
    }
    com.tencent.mm.af.d locald = com.tencent.mm.af.f.iK(this.iBi.field_username);
    this.gvK = null;
    this.gvL = null;
    this.nME = null;
    if (((locald == null) || (locald.bq(false) == null)) && (this.nMF != null))
    {
      locald = new com.tencent.mm.af.d();
      locald.field_username = this.iBi.field_username;
      locald.field_brandFlag = this.nMF.gCL;
      locald.field_brandIconURL = this.nMF.gCO;
      locald.field_brandInfo = this.nMF.gCN;
      locald.field_extInfo = this.nMF.gCM;
    }
    for (;;)
    {
      if ((locald != null) && (locald.field_brandInfo == null) && (locald.field_extInfo == null) && (this.nMF != null))
      {
        locald.field_username = this.iBi.field_username;
        locald.field_brandFlag = this.nMF.gCL;
        locald.field_brandIconURL = this.nMF.gCO;
        locald.field_brandInfo = this.nMF.gCN;
        locald.field_extInfo = this.nMF.gCM;
      }
      Object localObject1 = (BizInfoHeaderPreference)this.htU.VG("contact_info_header_bizinfo");
      Object localObject2;
      boolean bool;
      if ((localObject1 != null) && (!bg.nm(this.iBi.field_username)))
      {
        localObject2 = this.iBi;
        ((BizInfoHeaderPreference)localObject1).nLm = this.nLE;
        ((BizInfoHeaderPreference)localObject1).jsU = locald;
        ((BizInfoHeaderPreference)localObject1).onDetach();
        at.AR();
        com.tencent.mm.y.c.yK().a((m.b)localObject1);
        com.tencent.mm.ac.n.Dh().d((com.tencent.mm.ac.d.a)localObject1);
        com.tencent.mm.af.x.FO().a((m.a.a)localObject1);
        ((BizInfoHeaderPreference)localObject1).iBi = ((com.tencent.mm.storage.x)localObject2);
        if (bg.nl(((com.tencent.mm.g.b.af)localObject2).field_username).length() > 0)
        {
          bool = true;
          Assert.assertTrue("initView: contact username is null", bool);
          ((BizInfoHeaderPreference)localObject1).MP();
          label387:
          this.htU.bc("biz_placed_to_the_top", true);
          this.htU.bc("contact_info_biz_enable", true);
          this.htU.bc("contact_info_biz_disable", true);
          this.htU.bc("contact_info_stick_biz", true);
          if (locald == null) {
            break label2402;
          }
          if (!locald.EG()) {
            break label2042;
          }
          this.htU.bc("contact_info_biz_add", true);
          this.htU.bc("contact_info_expose_btn", true);
          this.htU.bc("contact_is_mute", false);
          this.jGN = this.iBi.vc();
          if (!locald.EH()) {
            break label1795;
          }
          this.htU.bc("contact_info_biz_go_chatting", true);
          localObject1 = this.htU;
          if (com.tencent.mm.l.a.eE(this.iBi.field_type)) {
            break label1789;
          }
          bool = true;
          label545:
          ((com.tencent.mm.ui.base.preference.f)localObject1).bc("contact_info_stick_biz", bool);
          localObject1 = (CheckBoxPreference)this.htU.VG("contact_info_stick_biz");
          ((CheckBoxPreference)localObject1).sdM = this.iBi.vf();
          ((CheckBoxPreference)localObject1).setTitle(R.l.dpU);
          aXI();
          label598:
          gA(this.jGN);
          this.jsU = locald;
          this.gvK = locald.EO();
          this.gvL = locald.bq(false);
          this.nME = this.gvL.EP();
          if (!this.gvL.EQ()) {
            break label2340;
          }
          this.htU.VG("near_field_service").setSummary(R.l.ekO);
          label670:
          if (this.gvL.EV() == null) {
            break label2371;
          }
          this.nMH = true;
          if (!EK(this.gvL.EV())) {
            break label2356;
          }
          this.nMG = true;
          if (com.tencent.mm.l.a.eE(this.iBi.field_type)) {
            break label2356;
          }
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "expireTime not null, and %s is not my contact", new Object[] { this.iBi.field_username });
          aXF();
          label743:
          if ((s.gk(this.iBi.field_username)) || (EM(this.iBi.field_username))) {
            aXF();
          }
          label774:
          if ((this.gvL.ES() != null) && (this.gvL.ES().length() > 0)) {
            this.gvU = this.gvL.ES();
          }
          localObject1 = this.gvL;
          if (((d.b)localObject1).gvP != null) {
            ((d.b)localObject1).gvS = "1".equals(((d.b)localObject1).gvP.optString("IsShowMember"));
          }
          this.gvS = ((d.b)localObject1).gvS;
          if (bg.nm(this.gvL.Fg())) {
            break label2386;
          }
          this.htU.bc("contact_info_service_phone", false);
          localObject1 = this.htU.VG("contact_info_service_phone");
          if (localObject1 != null)
          {
            ((Preference)localObject1).setSummary(this.gvL.Fg());
            ((Preference)localObject1).jLG = this.ezR.getResources().getColor(R.e.aOm);
          }
        }
      }
      Object localObject4;
      Object localObject5;
      int i;
      for (;;)
      {
        label1151:
        label1158:
        label1185:
        label1208:
        label1216:
        Object localObject6;
        if (!bg.nm(this.iBi.signature))
        {
          localObject2 = (KeyValuePreference)this.htU.VG("contact_info_user_desc");
          if (localObject2 != null)
          {
            if (bg.nl(this.iBi.signature).trim().length() <= 0) {
              this.htU.bc("contact_info_user_desc", true);
            }
          }
          else
          {
            if ((this.gvL == null) || (this.gvL.Fa() == null) || (bg.nm(this.gvL.Fa().gwE))) {
              break label2762;
            }
            localObject4 = this.gvL.Fa();
            localObject5 = (KeyValuePreference)this.htU.VG("contact_info_verifyuser");
            if (localObject5 == null) {
              break label2746;
            }
            ((KeyValuePreference)localObject5).caY();
            ((KeyValuePreference)localObject5).wko = false;
            if (!bg.nm(((d.b.c)localObject4).gwF)) {
              break label2683;
            }
            i = ((d.b.c)localObject4).gwD;
            switch (i)
            {
            default: 
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "getVerifyStr, error type %d", new Object[] { Integer.valueOf(i) });
              localObject1 = this.ezR.getResources().getString(R.l.djB);
              ((KeyValuePreference)localObject5).vKN = ((String)localObject1);
              if (ak.a.gmZ != null)
              {
                localObject1 = BackwardSupportUtil.b.c(ak.a.gmZ.fr(this.iBi.field_verifyFlag), 2.0F);
                if (localObject1 == null) {
                  break label6093;
                }
                localObject2 = new BitmapDrawable(this.ezR.getResources(), (Bitmap)localObject1);
                if (localObject1 != null) {
                  break label2702;
                }
                bool = true;
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ContactWidgetBizInfo", "verify bmp is null ? %B", new Object[] { Boolean.valueOf(bool) });
                ((KeyValuePreference)localObject5).wkw = ((Drawable)localObject2);
                if (((d.b.c)localObject4).gwE == null) {
                  break label2734;
                }
                localObject6 = ((d.b.c)localObject4).gwH;
                localObject1 = com.tencent.mm.pluginsdk.ui.d.h.a(this.ezR, ((d.b.c)localObject4).gwE.trim());
                if (bg.nm((String)localObject6)) {
                  break label6090;
                }
              }
              break;
            }
          }
        }
        for (;;)
        {
          label1346:
          label1353:
          label1420:
          label1428:
          try
          {
            localObject2 = new SpannableString((String)localObject6 + " " + localObject1);
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException1) {}
          try
          {
            ((SpannableString)localObject2).setSpan(new ForegroundColorSpan(-36352), 0, ((String)localObject6).length(), 17);
            localObject1 = localObject2;
            ((KeyValuePreference)localObject5).setSummary((CharSequence)localObject1);
            if ((this.gvL == null) || (bg.nm(this.gvL.EU()))) {
              break label2872;
            }
            localObject2 = (KeyValuePreference)this.htU.VG("contact_info_trademark");
            if (localObject2 == null) {
              continue;
            }
            ((KeyValuePreference)localObject2).caY();
            ((KeyValuePreference)localObject2).wko = false;
            if (ak.a.gmZ == null) {
              break label2860;
            }
            localObject1 = com.tencent.mm.sdk.platformtools.d.Ag(R.k.cJX);
            if (localObject1 != null) {
              break label2866;
            }
            bool = true;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ContactWidgetBizInfo", "trademark bmp is null ? %B", new Object[] { Boolean.valueOf(bool) });
            if (localObject1 == null) {
              break label6084;
            }
            localObject1 = new BitmapDrawable(this.ezR.getResources(), (Bitmap)localObject1);
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
          {
            for (;;)
            {
              localObject1 = localObject3;
              localObject3 = localIndexOutOfBoundsException2;
              continue;
              continue;
              j = k;
            }
            localObject1 = null;
          }
        }
        ((KeyValuePreference)localObject2).wkw = ((Drawable)localObject1);
        ((KeyValuePreference)localObject2).setSummary(this.gvL.EU());
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "trademark name : %s, url : %s.", new Object[] { this.gvL.EU(), this.gvL.ET() });
        label1524:
        if ((this.gvL == null) || (this.gvL.EW() == null) || (this.gvL.EW().size() <= 0)) {
          break label2897;
        }
        localObject2 = (KeyValuePreference)this.htU.VG("contact_info_privilege");
        ((KeyValuePreference)localObject2).caY();
        ((KeyValuePreference)localObject2).lP(false);
        ((KeyValuePreference)localObject2).wkx.clear();
        localObject4 = this.gvL.EW().iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject6 = (d.b.e)((Iterator)localObject4).next();
          localObject5 = (LinearLayout)View.inflate(this.ezR, R.i.cAD, null);
          ((ImageView)((LinearLayout)localObject5).findViewById(R.h.bGN)).setImageDrawable(new a(this.ezR.getResources(), ((d.b.e)localObject6).iconUrl));
          localObject1 = ((d.b.e)localObject6).description;
          i = this.ezR.getResources().getIdentifier(((d.b.e)localObject6).gwM, "string", this.ezR.getPackageName());
          if (i > 0) {
            localObject1 = this.ezR.getString(i);
          }
          ((TextView)((LinearLayout)localObject5).findViewById(R.h.summary)).setText((CharSequence)localObject1);
          ((KeyValuePreference)localObject2).wkx.add(localObject5);
        }
        bool = false;
        break;
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "head pref is null");
        this.htU.bc("contact_info_header_bizinfo", true);
        break label387;
        label1789:
        bool = false;
        break label545;
        label1795:
        this.htU.bc("contact_info_subscribe_bizinfo", true);
        this.htU.bc("contact_info_biz_go_chatting", true);
        if (locald.Ex())
        {
          this.htU.bc("contact_info_biz_enable", true);
          this.htU.bc("contact_info_biz_disable", false);
          this.htU.VG("contact_info_biz_disable").setTitle(R.l.dpW);
          this.htU.bc("contact_is_mute", false);
          this.htU.bc("biz_placed_to_the_top", false);
          this.jNv = ((CheckBoxPreference)this.htU.VG("biz_placed_to_the_top"));
          this.jNv.setTitle(R.l.dql);
          aXI();
          if (!locald.EI()) {
            break label598;
          }
          this.htU.bc("contact_info_locate", true);
          break label598;
        }
        this.htU.bc("contact_info_biz_enable", false);
        this.htU.bc("contact_info_biz_disable", true);
        this.htU.VG("contact_info_biz_enable").setTitle(R.l.dpY);
        this.htU.bc("contact_is_mute", true);
        this.htU.bc("biz_placed_to_the_top", true);
        this.htU.bc("contact_info_locate", true);
        break label598;
        label2042:
        if (locald.EF())
        {
          this.htU.bc("contact_info_locate", true);
          this.htU.bc("contact_info_subscribe_bizinfo", false);
          this.htU.bc("enterprise_contact_info_enter", false);
          this.htU.VG("contact_info_biz_go_chatting").setTitle(R.l.dpZ);
          localObject1 = this.htU;
          if (!com.tencent.mm.l.a.eE(this.iBi.field_type)) {}
          for (bool = true;; bool = false)
          {
            ((com.tencent.mm.ui.base.preference.f)localObject1).bc("contact_info_stick_biz", bool);
            localObject1 = (CheckBoxPreference)this.htU.VG("contact_info_stick_biz");
            ((CheckBoxPreference)localObject1).sdM = this.iBi.vf();
            ((CheckBoxPreference)localObject1).setTitle(R.l.dqc);
            aXI();
            this.htU.bc("contact_is_mute", true);
            this.jGN = this.iBi.vc();
            gA(this.jGN);
            this.htU.VG("contact_is_mute").setSummary(R.l.dji);
            break;
          }
        }
        localObject1 = this.htU;
        if ((s.fP(this.iBi.field_username)) || (!com.tencent.mm.l.a.eE(this.iBi.field_type))) {}
        for (bool = true;; bool = false)
        {
          ((com.tencent.mm.ui.base.preference.f)localObject1).bc("contact_info_stick_biz", bool);
          ((CheckBoxPreference)this.htU.VG("contact_info_stick_biz")).sdM = this.iBi.vf();
          this.htU.bc("contact_is_mute", true);
          this.jGN = false;
          break;
        }
        label2340:
        this.htU.bc("near_field_service", true);
        break label670;
        label2356:
        this.htU.bc("contact_info_time_expired", true);
        break label743;
        label2371:
        this.htU.bc("contact_info_time_expired", true);
        break label774;
        label2386:
        this.htU.bc("contact_info_service_phone", true);
        continue;
        label2402:
        this.htU.bc("contact_info_time_expired", true);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "get biz info from storage, but return null");
        continue;
        ((KeyValuePreference)localObject2).caY();
        ((KeyValuePreference)localObject2).wko = false;
        ((KeyValuePreference)localObject2).vKN = this.ezR.getString(R.l.djB);
        ((KeyValuePreference)localObject2).setSummary(com.tencent.mm.pluginsdk.ui.d.h.a(this.ezR, this.iBi.signature));
        ((KeyValuePreference)localObject2).lP(false);
        if (ak.a.gmZ != null)
        {
          localObject1 = BackwardSupportUtil.b.c(ak.a.gmZ.fr(this.iBi.field_verifyFlag), 2.0F);
          label2504:
          if (localObject1 != null) {
            break label2579;
          }
          bool = true;
          label2512:
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ContactWidgetBizInfo", "verify bmp is null ? %B", new Object[] { Boolean.valueOf(bool) });
          if (localObject1 == null) {
            break label6099;
          }
        }
      }
      label2579:
      label2683:
      label2702:
      label2734:
      label2746:
      label2762:
      label2860:
      label2866:
      label2872:
      label2897:
      label3624:
      label3687:
      label3747:
      label3841:
      label3874:
      label3981:
      label4005:
      label4228:
      label4235:
      label4304:
      label4490:
      label4506:
      label4522:
      label4538:
      label4580:
      label4593:
      label4609:
      label4614:
      label5088:
      label5094:
      label5106:
      label5119:
      label5135:
      label5151:
      label5177:
      label5219:
      label5353:
      label5392:
      label5513:
      label5582:
      label5822:
      label5838:
      label5854:
      label6024:
      label6076:
      label6079:
      label6084:
      label6090:
      label6093:
      label6099:
      for (localObject1 = new BitmapDrawable(this.ezR.getResources(), (Bitmap)localObject1);; localObject1 = null)
      {
        ((KeyValuePreference)localObject2).wkw = ((Drawable)localObject1);
        ((KeyValuePreference)localObject2).wku = 8;
        break;
        localObject1 = null;
        break label2504;
        bool = false;
        break label2512;
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "has not desc info");
        this.htU.bc("contact_info_user_desc", true);
        if (this.nMG) {
          break;
        }
        this.htU.bc("contact_info_time_expired", true);
        break;
        localObject1 = this.ezR.getResources().getString(R.l.dly);
        break label1151;
        localObject1 = this.ezR.getResources().getString(R.l.dbC);
        break label1151;
        localObject1 = this.ezR.getResources().getString(R.l.dbD);
        break label1151;
        ((KeyValuePreference)localObject5).vKN = ((d.b.c)localObject4).gwF;
        break label1158;
        localObject1 = null;
        break label1185;
        bool = false;
        break label1216;
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "verifySummary setSpan error: %s", new Object[] { localIndexOutOfBoundsException1.getMessage() });
        break label1346;
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "[arthurdan.emojiSpan] Notice!!!! extInfo.verifyInfo.verifySourceDescription is null");
        break label1353;
        this.htU.bc("contact_info_verifyuser", true);
        break label1353;
        if ((this.gvL != null) && (this.gvL.Fb() != null) && (!bg.nm(this.gvL.Fb().gwN)))
        {
          localObject1 = (KeyValuePreference)this.htU.VG("contact_info_verifyuser");
          if (localObject1 == null) {
            break label1353;
          }
          ((KeyValuePreference)localObject1).setSummary(this.gvL.Fb().gwN);
          break label1353;
        }
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "has not verify info");
        this.htU.bc("contact_info_verifyuser", true);
        break label1353;
        localObject1 = null;
        break label1420;
        bool = false;
        break label1428;
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "has not trademark info");
        this.htU.bc("contact_info_trademark", true);
        break label1524;
        this.htU.bc("contact_info_privilege", true);
        int k = this.htU.indexOf("contact_info_category2");
        if ((k >= 0) && (this.gvK != null) && (this.gvK.size() > 0)) {
          i = this.gvK.size() - 1;
        }
        int j;
        while (i >= 0)
        {
          if ((this.gvK.get(i) != null) && ((!this.ezR.getString(R.l.diS).equals(((com.tencent.mm.af.d.a)this.gvK.get(i)).title)) || (this.gvS)) && ((!bg.nm(((com.tencent.mm.af.d.a)this.gvK.get(i)).title)) || (!bg.nm(((com.tencent.mm.af.d.a)this.gvK.get(i)).gvO))))
          {
            localObject4 = new Preference(this.ezR);
            ((Preference)localObject4).setKey("contact_info_bizinfo_external#" + i);
            localObject1 = ((com.tencent.mm.af.d.a)this.gvK.get(i)).title;
            j = this.ezR.getResources().getIdentifier(((com.tencent.mm.af.d.a)this.gvK.get(i)).gvO, "string", this.ezR.getPackageName());
            if (j > 0) {
              localObject1 = this.ezR.getString(j);
            }
            localObject3 = localObject1;
            if (this.jsU.EE()) {
              if (!"__mp_wording__brandinfo_history_massmsg".equals(((com.tencent.mm.af.d.a)this.gvK.get(i)).gvO))
              {
                localObject3 = localObject1;
                if (!((String)localObject1).equals(this.ezR.getString(R.l.cPQ))) {}
              }
              else
              {
                localObject3 = this.ezR.getString(R.l.dpR);
              }
            }
            ((Preference)localObject4).setTitle((CharSequence)localObject3);
            if (!bg.nm(((com.tencent.mm.af.d.a)this.gvK.get(i)).description)) {
              ((Preference)localObject4).setSummary(((com.tencent.mm.af.d.a)this.gvK.get(i)).description);
            }
            if (!bg.nl(((com.tencent.mm.af.d.a)this.gvK.get(i)).gvO).equals("__mp_wording__brandinfo_feedback")) {
              break label6079;
            }
            j = this.htU.indexOf("contact_info_scope_of_business");
            if (j <= 0) {
              break label6079;
            }
            j += 1;
            this.htU.a((Preference)localObject4, j);
            if (bg.nl(((com.tencent.mm.af.d.a)this.gvK.get(i)).gvO).equals("__mp_wording__brandinfo_biz_detail"))
            {
              localObject1 = new PreferenceSmallCategory(this.ezR);
              this.htU.a((Preference)localObject1, j);
            }
          }
          i -= 1;
          continue;
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "pos no more");
        }
        if ((!this.nMG) && (s.v(this.iBi)) && (this.iBi.fjo != null) && (!this.iBi.fjo.equals("")))
        {
          localObject1 = (KeyValuePreference)this.htU.VG("contact_info_verifyuser_weibo");
          if (localObject1 != null)
          {
            ((KeyValuePreference)localObject1).setSummary(bg.aq(this.iBi.field_weiboNickname, "") + this.ezR.getString(R.l.eax, new Object[] { s.gt(this.iBi.fjo) }));
            ((Preference)localObject1).jLG = com.tencent.mm.br.a.c(this.ezR, R.e.aOm);
            ((KeyValuePreference)localObject1).lP(false);
          }
          if ((this.gvL == null) || (this.gvL.EY() == null)) {
            break label4538;
          }
          localObject1 = (BizInfoPayInfoIconPreference)this.htU.VG("contact_info_reputation");
          if (this.gvL.EY().gwI <= 0) {
            break label4490;
          }
          ((BizInfoPayInfoIconPreference)localObject1).sB(this.gvL.EY().gwI);
          localObject1 = (BizInfoPayInfoIconPreference)this.htU.VG("contact_info_guarantee_info");
          if ((this.gvL.EY().gwK == null) || (this.gvL.EY().gwK.size() <= 0)) {
            break label4506;
          }
          ((BizInfoPayInfoIconPreference)localObject1).bd(this.gvL.EY().gwK);
          localObject1 = (KeyValuePreference)this.htU.VG("contact_info_scope_of_business");
          if (bg.nm(this.gvL.EY().gwJ)) {
            break label4522;
          }
          ((KeyValuePreference)localObject1).setSummary(this.gvL.EY().gwJ);
          ((KeyValuePreference)localObject1).wku = 4;
          ((KeyValuePreference)localObject1).lP(false);
          if ((this.nME == null) || (this.nME.size() <= 0)) {
            break label4593;
          }
          this.htU.bc("contact_info_bindwxainfo", false);
          localObject1 = (BizBindWxaInfoPreference)this.htU.VG("contact_info_bindwxainfo");
          localObject3 = this.jsU;
          localObject4 = this.nME;
          ((BizBindWxaInfoPreference)localObject1).nLa = true;
          ((BizBindWxaInfoPreference)localObject1).huq = ((com.tencent.mm.af.d)localObject3);
          if (((BizBindWxaInfoPreference)localObject1).iKn != null) {
            break label4580;
          }
          ((BizBindWxaInfoPreference)localObject1).iKn = new LinkedList();
          if ((localObject4 != null) && (!((List)localObject4).isEmpty())) {
            ((BizBindWxaInfoPreference)localObject1).iKn.addAll((Collection)localObject4);
          }
          ((BizBindWxaInfoPreference)localObject1).UN();
          localObject3 = this.ezR.getIntent().getStringExtra("Contact_BIZ_KF_WORKER_ID");
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "updateKF %s, %b", new Object[] { localObject3, Boolean.valueOf(this.nML) });
          if (!this.nML)
          {
            this.nMK = ((String)localObject3);
            if (this.gvL != null)
            {
              localObject1 = this.gvL;
              if (((d.b)localObject1).gvP != null) {
                ((d.b)localObject1).gwn = ((d.b)localObject1).gvP.optInt("FunctionFlag");
              }
              if ((((d.b)localObject1).gwn & com.tencent.mm.af.d.gvJ) <= 0) {
                break label4609;
              }
              i = 1;
              if ((i != 0) && (this.iBi != null)) {
                break label4614;
              }
            }
            this.htU.bc("contact_info_kf_worker", true);
          }
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "KIsardDevice(%b)", new Object[] { Boolean.valueOf(this.ezR.getIntent().getBooleanExtra("KIsHardDevice", false)) });
          if ((this.ezR.getIntent() == null) || (!this.ezR.getIntent().getBooleanExtra("KIsHardDevice", false))) {
            break label5392;
          }
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "Hard device biz...");
          bool = aXG();
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "contact.isContact()(%b), isHardDeviceBound(%b)", new Object[] { Boolean.valueOf(com.tencent.mm.l.a.eE(this.iBi.field_type)), Boolean.valueOf(bool) });
          if ((!com.tencent.mm.l.a.eE(this.iBi.field_type)) || (!bool)) {
            break label5219;
          }
          if (locald == null) {
            break label5177;
          }
          localObject1 = (CheckBoxPreference)this.htU.VG("contact_info_subscribe_bizinfo");
          localObject3 = (CheckBoxPreference)this.htU.VG("contact_info_locate");
          if (!locald.EH()) {
            break label5106;
          }
          localObject4 = com.tencent.mm.af.x.FK().bm(locald.field_username);
          this.nMD = com.tencent.mm.af.x.FK().bl((String)localObject4);
          if (this.nMD == null) {
            break label5094;
          }
          if (this.nMD.fN(4)) {
            break label5088;
          }
          bool = true;
          ((CheckBoxPreference)localObject1).sdM = bool;
          if (!locald.Ex()) {
            break label5135;
          }
          if ((this.gvL == null) && (locald != null)) {
            this.gvL = locald.bq(false);
          }
          if ((this.gvL == null) || (!this.gvL.ER()) || (!com.tencent.mm.bj.d.LL("brandservice"))) {
            break label5119;
          }
          this.htU.bc("contact_info_template_recv", false);
          if (!locald.bq(false).EB()) {
            break label5151;
          }
          ((CheckBoxPreference)localObject3).sdM = locald.Ey();
        }
        for (;;)
        {
          this.htU.bc("contact_info_biz_read_msg_online", true);
          this.htU.bc("contact_info_biz_add", true);
          localObject1 = this.iBi.vk();
          if (localObject1 != null) {
            this.ezR.sq((String)localObject1);
          }
          if (s.fP(this.iBi.field_username))
          {
            this.htU.VG("contact_info_biz_go_chatting").setTitle(R.l.dkF);
            this.ezR.oM(R.l.dlu);
          }
          if ((!s.gk(this.iBi.field_username)) && (this.jsU != null) && (!this.jsU.EG())) {
            this.ezR.a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
            {
              public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
              {
                GMTrace.i(6800812277760L, 50670);
                c.this.alF();
                GMTrace.o(6800812277760L, 50670);
                return true;
              }
            });
          }
          GMTrace.o(6779874312192L, 50514);
          return;
          this.htU.bc("contact_info_verifyuser_weibo", true);
          break;
          this.htU.bc("contact_info_reputation", true);
          break label3624;
          this.htU.bc("contact_info_guarantee_info", true);
          break label3687;
          this.htU.bc("contact_info_scope_of_business", true);
          break label3747;
          this.htU.bc("contact_info_reputation", true);
          this.htU.bc("contact_info_guarantee_info", true);
          this.htU.bc("contact_info_scope_of_business", true);
          break label3747;
          ((BizBindWxaInfoPreference)localObject1).iKn.clear();
          break label3841;
          this.htU.bc("contact_info_bindwxainfo", true);
          break label3874;
          i = 0;
          break label3981;
          if (bg.nm((String)localObject3))
          {
            localObject1 = com.tencent.mm.af.x.FF().iU(this.iBi.field_username);
            if (localObject1 == null)
            {
              this.htU.bc("contact_info_kf_worker", true);
              com.tencent.mm.af.x.FH().a(this);
              localObject1 = com.tencent.mm.af.x.FH();
              localObject3 = this.iBi.field_username;
              localObject4 = q.zE();
              if (bg.nm((String)localObject3)) {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BizKFService", "doKFGetBindList null brandname");
              }
              for (;;)
              {
                this.nML = true;
                break;
                localObject4 = new t((String)localObject3, (String)localObject4);
                com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)localObject4, 0);
                com.tencent.mm.sdk.platformtools.w.v("MicroMsg.BizKFService", "doKFGetBindList %s, %d", new Object[] { localObject3, Integer.valueOf(((com.tencent.mm.af.h)localObject1).gxa.size()) });
              }
            }
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "has default kf %s", new Object[] { ((com.tencent.mm.af.g)localObject1).field_openId });
            this.htU.bc("contact_info_kf_worker", false);
            localObject3 = (IconWidgetPreference)this.htU.VG("contact_info_kf_worker");
            ((IconWidgetPreference)localObject3).setSummary(((com.tencent.mm.af.g)localObject1).field_nickname);
            localObject4 = com.tencent.mm.ac.b.a(((com.tencent.mm.af.g)localObject1).field_openId, false, -1);
            if (localObject4 == null)
            {
              c((com.tencent.mm.af.g)localObject1);
              EL(((com.tencent.mm.af.g)localObject1).field_openId);
              break label4005;
            }
            ((IconWidgetPreference)localObject3).C((Bitmap)localObject4);
            break label4005;
          }
          localObject4 = com.tencent.mm.af.x.FF();
          localObject1 = ((com.tencent.mm.af.i)localObject4).iT((String)localObject3);
          if ((localObject1 == null) || (com.tencent.mm.af.i.a((com.tencent.mm.af.g)localObject1)))
          {
            com.tencent.mm.af.x.FH().a(this);
            com.tencent.mm.af.x.FH().W(this.iBi.field_username, (String)localObject3);
            this.nML = true;
          }
          if (localObject1 != null) {
            break label6076;
          }
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "no such kf, get default kf");
          localObject1 = ((com.tencent.mm.af.i)localObject4).iU(this.iBi.field_username);
          if (localObject1 == null)
          {
            this.htU.bc("contact_info_kf_worker", true);
            break label4005;
          }
          this.htU.bc("contact_info_kf_worker", false);
          localObject3 = (IconWidgetPreference)this.htU.VG("contact_info_kf_worker");
          ((IconWidgetPreference)localObject3).setSummary(((com.tencent.mm.af.g)localObject1).field_nickname);
          localObject4 = com.tencent.mm.ac.b.a(((com.tencent.mm.af.g)localObject1).field_openId, false, -1);
          if (localObject4 == null)
          {
            c((com.tencent.mm.af.g)localObject1);
            EL(((com.tencent.mm.af.g)localObject1).field_openId);
          }
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "kf worker %s, %s", new Object[] { ((com.tencent.mm.af.g)localObject1).field_openId, ((com.tencent.mm.af.g)localObject1).field_nickname });
            break;
            ((IconWidgetPreference)localObject3).C((Bitmap)localObject4);
          }
          bool = false;
          break label4228;
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "bizChatMyuser bizChatUserInfo is null");
          break label4235;
          ((CheckBoxPreference)localObject1).sdM = locald.Ex();
          break label4235;
          this.htU.bc("contact_info_template_recv", true);
          break label4304;
          this.htU.bc("contact_info_template_recv", true);
          break label4304;
          this.htU.bc("contact_info_locate", true);
          ((CheckBoxPreference)localObject3).sdM = locald.Ey();
          continue;
          this.htU.bc("contact_info_subscribe_bizinfo", true);
          this.htU.bc("contact_info_locate", true);
          this.htU.bc("contact_info_template_recv", true);
        }
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "%s is not my hard biz contact", new Object[] { this.iBi.field_username });
        aXF();
        localObject1 = this.htU.VG("contact_info_biz_add");
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "isBizConferenceAccount(%b)", new Object[] { Boolean.valueOf(this.nMH) });
        if (localObject1 != null)
        {
          if (bool) {
            ((Preference)localObject1).setTitle(R.l.diQ);
          }
        }
        else if (sI(this.nLz))
        {
          if (locald != null) {
            break label5353;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "bizinfo is null in temp session");
        }
        for (;;)
        {
          this.ezR.lg(false);
          GMTrace.o(6779874312192L, 50514);
          return;
          ((Preference)localObject1).setTitle(R.l.diN);
          break;
          ((CheckBoxPreference)this.htU.VG("contact_info_subscribe_bizinfo")).sdM = locald.Ex();
          this.htU.bc("contact_info_subscribe_bizinfo", false);
        }
        if (com.tencent.mm.l.a.eE(this.iBi.field_type))
        {
          if (locald != null)
          {
            localObject1 = (CheckBoxPreference)this.htU.VG("contact_info_subscribe_bizinfo");
            localObject3 = (CheckBoxPreference)this.htU.VG("contact_info_locate");
            if (locald.EH())
            {
              ((CheckBoxPreference)localObject1).setTitle(R.l.dpV);
              localObject4 = com.tencent.mm.af.x.FK().bm(locald.field_username);
              this.nMD = com.tencent.mm.af.x.FK().bl((String)localObject4);
              if (this.nMD != null) {
                if (!this.nMD.fN(4))
                {
                  bool = true;
                  ((CheckBoxPreference)localObject1).sdM = bool;
                  if (!locald.Ex()) {
                    break label5838;
                  }
                  if ((this.gvL == null) && (locald != null)) {
                    this.gvL = locald.bq(false);
                  }
                  if ((this.gvL == null) || (!this.gvL.ER()) || (!com.tencent.mm.bj.d.LL("brandservice"))) {
                    break label5822;
                  }
                  this.htU.bc("contact_info_template_recv", false);
                  if (!locald.bq(false).EB()) {
                    break label5854;
                  }
                  ((CheckBoxPreference)localObject3).sdM = locald.Ey();
                }
              }
            }
          }
          for (;;)
          {
            this.htU.bc("contact_info_biz_read_msg_online", true);
            this.htU.bc("contact_info_biz_add", true);
            localObject1 = this.iBi.vk();
            if (localObject1 != null) {
              this.ezR.sq((String)localObject1);
            }
            if (s.fP(this.iBi.field_username))
            {
              this.htU.VG("contact_info_biz_go_chatting").setTitle(R.l.dkF);
              this.ezR.oM(R.l.dlu);
            }
            if ((!s.gk(this.iBi.field_username)) && (this.jsU != null)) {
              this.ezR.a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
              {
                public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
                {
                  GMTrace.i(6759741652992L, 50364);
                  c.this.alF();
                  GMTrace.o(6759741652992L, 50364);
                  return true;
                }
              });
            }
            GMTrace.o(6779874312192L, 50514);
            return;
            bool = false;
            break;
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "bizChatMyuser bizChatUserInfo is null");
            break label5513;
            if (locald.EF())
            {
              ((CheckBoxPreference)localObject1).setTitle(R.l.dpS);
              if (!com.tencent.mm.af.x.FN().iu(locald.field_username)) {}
              for (bool = true;; bool = false)
              {
                ((CheckBoxPreference)localObject1).sdM = bool;
                break;
              }
            }
            ((CheckBoxPreference)localObject1).sdM = locald.Ex();
            break label5513;
            this.htU.bc("contact_info_template_recv", true);
            break label5582;
            this.htU.bc("contact_info_template_recv", true);
            break label5582;
            this.htU.bc("contact_info_locate", true);
            ((CheckBoxPreference)localObject3).sdM = locald.Ey();
            continue;
            this.htU.bc("contact_info_subscribe_bizinfo", true);
            this.htU.bc("contact_info_locate", true);
            this.htU.bc("contact_info_template_recv", true);
          }
        }
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "%s is not my contact", new Object[] { this.iBi.field_username });
        aXF();
        localObject1 = this.htU.VG("contact_info_biz_add");
        if ((localObject1 != null) && (this.nMH)) {
          ((Preference)localObject1).setTitle(R.l.diQ);
        }
        if (sI(this.nLz))
        {
          if (locald != null) {
            break label6024;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "bizinfo is null in temp session");
        }
        for (;;)
        {
          this.ezR.lg(false);
          GMTrace.o(6779874312192L, 50514);
          return;
          ((CheckBoxPreference)this.htU.VG("contact_info_subscribe_bizinfo")).sdM = locald.Ex();
          this.htU.bc("contact_info_subscribe_bizinfo", false);
        }
        break label1346;
        Object localObject3 = null;
        break label1208;
      }
    }
  }
  
  private void aXF()
  {
    GMTrace.i(6780008529920L, 50515);
    if ((this.iBi != null) && (com.tencent.mm.l.a.eE(this.iBi.field_type)) && (!s.fP(this.iBi.field_username)) && (!EM(this.iBi.field_username)))
    {
      this.htU.bc("contact_is_mute", false);
      this.htU.bc("contact_info_verifyuser_weibo", true);
      this.htU.bc("contact_info_subscribe_bizinfo", true);
      this.htU.bc("contact_info_template_recv", true);
      this.htU.bc("contact_info_locate", true);
      if (this.nMG) {
        break label312;
      }
      this.htU.bc("contact_info_time_expired", true);
      label140:
      if ((this.iBi == null) || ((!s.gk(this.iBi.field_username)) && (!EM(this.iBi.field_username))) || (!com.tencent.mm.l.a.eE(this.iBi.field_type))) {
        break label328;
      }
      this.htU.bc("contact_info_biz_go_chatting", false);
    }
    for (;;)
    {
      if (EM(this.iBi.field_username)) {
        this.htU.bc("contact_info_user_desc", true);
      }
      GMTrace.o(6780008529920L, 50515);
      return;
      this.htU.bc("contact_is_mute", true);
      if ((this.iBi != null) && (!com.tencent.mm.l.a.eE(this.iBi.field_type)) && (sI(this.nLz)))
      {
        this.htU.bc("contact_info_expose_btn", false);
        break;
      }
      this.htU.bc("contact_info_expose_btn", true);
      break;
      label312:
      this.htU.bc("contact_info_biz_add", true);
      break label140;
      label328:
      this.htU.bc("contact_info_biz_go_chatting", true);
    }
  }
  
  private boolean aXG()
  {
    GMTrace.i(6780679618560L, 50520);
    if (this.ezR.getIntent() == null)
    {
      GMTrace.o(6780679618560L, 50520);
      return false;
    }
    String str1 = this.ezR.getIntent().getStringExtra("device_id");
    String str2 = this.ezR.getIntent().getStringExtra("device_type");
    cx localcx = new cx();
    localcx.eEn.esG = str1;
    localcx.eEn.eEl = str2;
    com.tencent.mm.sdk.b.a.vgX.m(localcx);
    boolean bool = localcx.eEo.eEp;
    GMTrace.o(6780679618560L, 50520);
    return bool;
  }
  
  private void aXI()
  {
    GMTrace.i(6782021795840L, 50530);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "updatePlaceTop");
    if (this.ghC == null) {
      this.ghC = this.ezR.getSharedPreferences(this.ezR.getPackageName() + "_preferences", 0);
    }
    if (this.jNv != null)
    {
      if (this.iBi == null) {
        break label126;
      }
      this.ghC.edit().putBoolean("biz_placed_to_the_top", this.iBi.vf()).commit();
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(6782021795840L, 50530);
      return;
      label126:
      this.ghC.edit().putBoolean("biz_placed_to_the_top", false).commit();
    }
  }
  
  private static void c(com.tencent.mm.af.g paramg)
  {
    GMTrace.i(6781216489472L, 50524);
    long l = System.currentTimeMillis();
    com.tencent.mm.ac.i locali = com.tencent.mm.ac.n.Di();
    if (locali.ig(paramg.field_openId) == null)
    {
      com.tencent.mm.ac.h localh = new com.tencent.mm.ac.h();
      localh.username = paramg.field_openId;
      localh.gsT = paramg.field_headImgUrl;
      localh.bi(false);
      localh.fiZ = 3;
      locali.a(localh);
    }
    com.tencent.mm.ac.n.Dv().hT(paramg.field_openId);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "downloadKFAvatar, %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(6781216489472L, 50524);
  }
  
  private void gA(boolean paramBoolean)
  {
    GMTrace.i(6780948054016L, 50522);
    if (this.iBi != null) {
      if (this.ezR != null)
      {
        if ((!paramBoolean) || (com.tencent.mm.af.f.dL(this.iBi.field_username))) {
          break label83;
        }
        this.ezR.Ba(0);
      }
    }
    for (;;)
    {
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.htU.VG("contact_is_mute");
      if (localCheckBoxPreference != null) {
        localCheckBoxPreference.sdM = paramBoolean;
      }
      GMTrace.o(6780948054016L, 50522);
      return;
      label83:
      this.ezR.Ba(8);
    }
  }
  
  private static boolean sI(int paramInt)
  {
    GMTrace.i(6782156013568L, 50531);
    if ((paramInt == 81) || (paramInt == 92) || (paramInt == 93) || (paramInt == 94))
    {
      GMTrace.o(6782156013568L, 50531);
      return true;
    }
    GMTrace.o(6782156013568L, 50531);
    return false;
  }
  
  public final boolean EM(String paramString)
  {
    GMTrace.i(6781753360384L, 50528);
    if ((paramString.equals("weixinsrc")) || (this.iBi.field_username.equalsIgnoreCase("gh_6e99ff560306")))
    {
      GMTrace.o(6781753360384L, 50528);
      return true;
    }
    GMTrace.o(6781753360384L, 50528);
    return false;
  }
  
  public final String Fy()
  {
    GMTrace.i(6781887578112L, 50529);
    GMTrace.o(6781887578112L, 50529);
    return "MicroMsg.ContactWidgetBizInfo";
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6781350707200L, 50525);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    this.nML = false;
    if ((this.hsU != null) && (this.hsU.isShowing())) {
      this.hsU.dismiss();
    }
    if (paramk == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "scene == null");
      GMTrace.o(6781350707200L, 50525);
      return;
    }
    at.wS().b(paramk.getType(), this);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "scene.getType() = %s", new Object[] { Integer.valueOf(paramk.getType()) });
      GMTrace.o(6781350707200L, 50525);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "scene.getType() = %s", new Object[] { Integer.valueOf(paramk.getType()) });
    if (paramk.getType() == 536)
    {
      at.wS().b(536, this);
      aXE();
      GMTrace.o(6781350707200L, 50525);
      return;
    }
    label407:
    Object localObject;
    if (paramk.getType() == 1363)
    {
      paramString = (com.tencent.mm.plugin.profile.a.b)paramk;
      if ((paramString.fUa != null) && (paramString.fUa.gtD.gtK != null))
      {
        paramString = (bcq)paramString.fUa.gtD.gtK;
        paramk = (com.tencent.mm.plugin.profile.a.b)paramk;
        if ((paramk.fUa == null) || (paramk.fUa.gtC.gtK == null)) {
          break label407;
        }
        paramk = (bcp)paramk.fUa.gtC.gtK;
      }
      for (;;)
      {
        if ((paramString == null) || (paramString.tWa == null) || (paramString.tWa.ret != 0) || (paramString.tVX == null) || (bg.nm(paramString.tVX.tVV)))
        {
          if ((paramString != null) && (paramString.tWa != null))
          {
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(paramString.tWa.ret) });
            GMTrace.o(6781350707200L, 50525);
            return;
            paramString = null;
            break;
            paramk = null;
            continue;
          }
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd err:resp == null");
          GMTrace.o(6781350707200L, 50525);
          return;
        }
      }
      if (paramString.tVX == null)
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd resp.user == null");
        GMTrace.o(6781350707200L, 50525);
        return;
      }
      com.tencent.mm.af.a.j localj = com.tencent.mm.af.x.FK().bl(paramString.tVX.tVV);
      localObject = localj;
      if (localj == null)
      {
        localObject = new com.tencent.mm.af.a.j();
        ((com.tencent.mm.af.a.j)localObject).field_userId = paramString.tVX.tVV;
      }
      ((com.tencent.mm.af.a.j)localObject).field_userName = paramString.tVX.jBs;
      ((com.tencent.mm.af.a.j)localObject).field_brandUserName = paramk.tVU;
      ((com.tencent.mm.af.a.j)localObject).field_UserVersion = paramString.tVX.ver;
      ((com.tencent.mm.af.a.j)localObject).field_headImageUrl = paramString.tVX.tVP;
      ((com.tencent.mm.af.a.j)localObject).field_profileUrl = paramString.tVX.tWd;
      ((com.tencent.mm.af.a.j)localObject).field_bitFlag = paramString.tVX.tVQ;
      ((com.tencent.mm.af.a.j)localObject).field_addMemberUrl = paramString.tVX.tVT;
      ((com.tencent.mm.af.a.j)localObject).field_needToUpdate = false;
      if (!com.tencent.mm.af.x.FK().b((com.tencent.mm.af.a.j)localObject)) {
        com.tencent.mm.af.x.FK().a((com.tencent.mm.af.a.j)localObject);
      }
      GMTrace.o(6781350707200L, 50525);
      return;
    }
    if (paramk.getType() == 1394)
    {
      paramString = ((com.tencent.mm.plugin.profile.a.c)paramk).aXA();
      localObject = ((com.tencent.mm.plugin.profile.a.c)paramk).aXz();
      if ((localObject == null) || (((bia)localObject).tWa == null) || (((bia)localObject).tWa.ret != 0))
      {
        if ((localObject != null) && (((bia)localObject).tWa != null))
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "chuangchen onSceneEnd type:%s, err:code:%s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(((bia)localObject).tWa.ret) });
          GMTrace.o(6781350707200L, 50525);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "chuangchen onSceneEnd type:%s, err:resp == null", new Object[] { Integer.valueOf(paramk.getType()) });
        GMTrace.o(6781350707200L, 50525);
        return;
      }
      if (!paramString.uTG)
      {
        paramInt1 = 1;
        if (paramInt1 == 0) {
          break label1015;
        }
        paramString = this.jsU;
        paramString.field_brandFlag &= 0xFFFFFFFE;
        a(paramString, true);
        at.AR();
        if (com.tencent.mm.y.c.yP().TO(paramString.field_username) == null)
        {
          paramk = new ae(paramString.field_username);
          paramk.cQ(bg.nl(this.jsU.EN()));
          at.AR();
          localObject = com.tencent.mm.y.c.yM().Ca(paramString.field_username);
          if (localObject == null) {
            break label968;
          }
          at.AR();
          com.tencent.mm.y.c.yP().d(paramk);
          at.AR();
          com.tencent.mm.y.c.yP().ac((au)localObject);
        }
      }
      for (;;)
      {
        at.AR();
        if (com.tencent.mm.y.c.yP().TO(paramString.field_enterpriseFather) != null) {
          break label991;
        }
        paramString = new ae(paramString.field_enterpriseFather);
        paramString.bSW();
        at.AR();
        com.tencent.mm.y.c.yP().d(paramString);
        GMTrace.o(6781350707200L, 50525);
        return;
        paramInt1 = 0;
        break;
        label968:
        paramk.bSW();
        at.AR();
        com.tencent.mm.y.c.yP().d(paramk);
      }
      label991:
      at.AR();
      com.tencent.mm.y.c.yO().Tj(paramString.field_enterpriseFather);
      GMTrace.o(6781350707200L, 50525);
      return;
      label1015:
      paramString = this.jsU;
      paramString.field_brandFlag |= 0x1;
      a(paramString, true);
      at.AR();
      com.tencent.mm.y.c.yP().TN(paramString.field_username);
      at.AR();
      if (com.tencent.mm.y.c.yP().TY(paramString.field_enterpriseFather) <= 0)
      {
        at.AR();
        com.tencent.mm.y.c.yP().TN(paramString.field_enterpriseFather);
        GMTrace.o(6781350707200L, 50525);
        return;
      }
      at.AR();
      com.tencent.mm.y.c.yO().Tj(paramString.field_enterpriseFather);
      GMTrace.o(6781350707200L, 50525);
      return;
    }
    if (paramk.getType() == 1343)
    {
      aXE();
      GMTrace.o(6781350707200L, 50525);
      return;
    }
    if (paramk.getType() == 1228) {
      aXE();
    }
    GMTrace.o(6781350707200L, 50525);
  }
  
  public final void a(int paramInt, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6781619142656L, 50527);
    if ((this.jsU == null) || (!this.jsU.EH()))
    {
      GMTrace.o(6781619142656L, 50527);
      return;
    }
    if (paramk.getType() == 1354)
    {
      paramk = (CheckBoxPreference)this.htU.VG("contact_info_subscribe_bizinfo");
      String str = com.tencent.mm.af.x.FK().bm(this.jsU.field_username);
      this.nMD = com.tencent.mm.af.x.FK().bl(str);
      if (this.nMD != null)
      {
        if (!this.nMD.fN(4)) {}
        for (boolean bool = true;; bool = false)
        {
          paramk.sdM = bool;
          this.htU.notifyDataSetChanged();
          GMTrace.o(6781619142656L, 50527);
          return;
        }
      }
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "bizChatMyuser bizChatUserInfo is null after GetBizChatMyUserInfo");
    }
    GMTrace.o(6781619142656L, 50527);
  }
  
  public final void a(com.tencent.mm.af.d paramd, boolean paramBoolean)
  {
    GMTrace.i(6779605876736L, 50512);
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.htU.VG("contact_info_subscribe_bizinfo");
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.htU.VG("contact_info_locate");
    aol localaol = new aol();
    localaol.gCL = paramd.field_brandFlag;
    localaol.jhi = this.iBi.field_username;
    if (sI(this.nLz))
    {
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(58, localaol));
    }
    for (;;)
    {
      com.tencent.mm.af.x.FG().c(paramd, new String[0]);
      localCheckBoxPreference1.sdM = paramd.Ex();
      if (localCheckBoxPreference2 != null) {
        localCheckBoxPreference2.sdM = paramd.Ey();
      }
      if (paramBoolean) {
        aXE();
      }
      GMTrace.o(6779605876736L, 50512);
      return;
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(47, localaol));
    }
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, com.tencent.mm.storage.x paramx, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(6779740094464L, 50513);
    boolean bool;
    if (paramx != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bg.nl(paramx.field_username).length() <= 0) {
        break label234;
      }
      bool = true;
      label37:
      Assert.assertTrue(bool);
      if (paramf == null) {
        break label240;
      }
      bool = true;
      label49:
      Assert.assertTrue(bool);
      this.htU = paramf;
      this.iBi = paramx;
      this.nLx = paramBoolean;
      this.nLz = paramInt;
      this.nMJ = this.ezR.getIntent().getIntExtra("add_more_friend_search_scene", 0);
      this.nMO = ((SnsAdClick)this.ezR.getIntent().getParcelableExtra("KSnsAdTag"));
      this.nMN = this.ezR.getIntent().getBundleExtra("Contact_Ext_Args");
      this.nMP = this.ezR.getIntent().getStringExtra("key_add_contact_report_info");
      aXE();
      if (paramx != null)
      {
        com.tencent.mm.af.x.FQ().ip(paramx.field_username);
        if (com.tencent.mm.af.f.iN(paramx.field_username))
        {
          paramf = paramx.field_username;
          if (!com.tencent.mm.af.f.dL(paramf)) {
            break label246;
          }
          com.tencent.mm.af.x.FM();
          com.tencent.mm.af.a.h.a(paramf, this);
          paramf = com.tencent.mm.af.f.iK(paramf).EN();
          if (paramf != null) {
            com.tencent.mm.af.x.FQ().ip(paramf);
          }
        }
      }
    }
    for (;;)
    {
      GMTrace.o(6779740094464L, 50513);
      return true;
      bool = false;
      break;
      label234:
      bool = false;
      break label37;
      label240:
      bool = false;
      break label49;
      label246:
      if (com.tencent.mm.af.f.iP(paramf))
      {
        com.tencent.mm.af.x.FN();
        com.tencent.mm.af.c.a(paramf, this);
        com.tencent.mm.af.x.FG();
        paramf = com.tencent.mm.af.e.iG(paramf);
        if (paramf != null) {
          com.tencent.mm.af.x.FQ().ip(paramf);
        }
      }
    }
  }
  
  public final void aXH()
  {
    GMTrace.i(6780813836288L, 50521);
    if ((this.iBi == null) || (bg.nm(this.iBi.field_username)))
    {
      GMTrace.o(6780813836288L, 50521);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", String.format("https://mp.weixin.qq.com/mp/infringement?username=%s&from=1#wechat_redirect", new Object[] { this.iBi.field_username }));
    localIntent.putExtra("showShare", false);
    com.tencent.mm.bj.d.b(this.ezR, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(6780813836288L, 50521);
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6780142747648L, 50516);
    BizInfoHeaderPreference localBizInfoHeaderPreference = (BizInfoHeaderPreference)this.htU.VG("contact_info_header_bizinfo");
    if (localBizInfoHeaderPreference != null) {
      localBizInfoHeaderPreference.onDetach();
    }
    GMTrace.o(6780142747648L, 50516);
    return true;
  }
  
  public final void ak(int paramInt, String paramString)
  {
    GMTrace.i(6780545400832L, 50519);
    if ((this.nMN == null) || ((this.nLz != 39) && (this.nLz != 56) && (this.nLz != 35) && (this.nLz != 87) && (this.nLz != 88) && (this.nLz != 89) && (this.nLz != 85)))
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "mExtArgs is null or the add contact action is not from biz search.");
      GMTrace.o(6780545400832L, 50519);
      return;
    }
    if (this.iBi == null)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ContactWidgetBizInfo", "contact is null.");
      GMTrace.o(6780545400832L, 50519);
      return;
    }
    String str2 = this.nMN.getString("Contact_Ext_Args_Search_Id");
    String str3 = bg.nl(this.nMN.getString("Contact_Ext_Args_Query_String"));
    int j = this.nMN.getInt("Contact_Ext_Args_Index");
    int i = 0;
    String str1;
    switch (this.nLz)
    {
    default: 
      str1 = bg.nl(this.nMN.getString("Contact_Ext_Extra_Params"));
      str2 = str3 + "," + paramInt + "," + bg.nl(this.iBi.field_username) + "," + j + "," + System.currentTimeMillis() / 1000L + "," + str2 + "," + i;
      if (bg.nm(paramString)) {
        break;
      }
    }
    for (paramString = str2 + "," + paramString + "," + str1;; paramString = str2 + ",," + str1)
    {
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.ContactWidgetBizInfo", "report 10866: %s", new Object[] { paramString });
      com.tencent.mm.plugin.report.service.g.ork.A(10866, paramString);
      GMTrace.o(6780545400832L, 50519);
      return;
      i = 1;
      break;
      i = 2;
      break;
      i = 3;
      break;
      i = 4;
      break;
      i = 5;
      break;
    }
  }
  
  public final void alF()
  {
    GMTrace.i(16033649786880L, 119460);
    com.tencent.mm.ui.widget.f localf = new com.tencent.mm.ui.widget.f(this.ezR, com.tencent.mm.ui.widget.f.xpQ, false);
    localf.qik = new p.c()
    {
      public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
      {
        GMTrace.i(6751285936128L, 50301);
        if ((c.this.jsU != null) && (c.this.jsU.EF()))
        {
          paramAnonymousn.em(1, R.l.dkG);
          paramAnonymousn.em(3, R.l.daI);
          paramAnonymousn.em(4, R.l.diT);
          paramAnonymousn.em(5, R.l.diJ);
          GMTrace.o(6751285936128L, 50301);
          return;
        }
        if ((c.this.jsU != null) && (c.this.jsU.EG()))
        {
          paramAnonymousn.em(5, R.l.diJ);
          GMTrace.o(6751285936128L, 50301);
          return;
        }
        paramAnonymousn.em(1, R.l.dkG);
        paramAnonymousn.em(2, R.l.diO);
        if (!c.this.EM(c.this.iBi.field_username))
        {
          paramAnonymousn.em(3, R.l.daI);
          paramAnonymousn.em(4, R.l.diT);
        }
        paramAnonymousn.em(5, R.l.diJ);
        GMTrace.o(6751285936128L, 50301);
      }
    };
    localf.qil = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6814234050560L, 50770);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(6814234050560L, 50770);
          return;
          paramAnonymousMenuItem = c.this;
          Intent localIntent = new Intent();
          localIntent.putExtra("Select_Talker_Name", paramAnonymousMenuItem.iBi.field_username);
          localIntent.putExtra("Select_block_List", paramAnonymousMenuItem.iBi.field_username);
          localIntent.putExtra("Select_Send_Card", true);
          localIntent.putExtra("Select_Conv_Type", 3);
          localIntent.putExtra("mutil_select_is_ret", true);
          com.tencent.mm.plugin.profile.a.hnH.a(localIntent, paramAnonymousMenuItem.ezR);
          GMTrace.o(6814234050560L, 50770);
          return;
          c.this.ezR.getString(R.l.dwC, new Object[] { c.this.iBi.vk() });
          com.tencent.mm.ui.base.h.a(c.this.ezR, c.this.ezR.getString(R.l.diP), "", c.this.ezR.getString(R.l.diO), c.this.ezR.getString(R.l.cSk), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(6819065888768L, 50806);
              paramAnonymous2DialogInterface = c.this;
              String str = paramAnonymous2DialogInterface.iBi.field_username;
              at.AR();
              Object localObject = com.tencent.mm.y.c.yM().BZ(str);
              at.AR();
              com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.d(str, ((ce)localObject).field_msgSvrId));
              paramAnonymous2DialogInterface.jqh = false;
              localObject = paramAnonymous2DialogInterface.ezR;
              paramAnonymous2DialogInterface.ezR.getString(R.l.cUG);
              paramAnonymous2DialogInterface.hsU = com.tencent.mm.ui.base.h.a((Context)localObject, paramAnonymous2DialogInterface.ezR.getString(R.l.cUV), true, new c.8(paramAnonymous2DialogInterface));
              bc.a(str, new c.9(paramAnonymous2DialogInterface));
              GMTrace.o(6819065888768L, 50806);
            }
          }, null);
          GMTrace.o(6814234050560L, 50770);
          return;
          c.this.aXH();
          GMTrace.o(6814234050560L, 50770);
          return;
          paramAnonymousMenuItem = c.this;
          ((com.tencent.mm.pluginsdk.g)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.g.class)).a(paramAnonymousMenuItem.jsU, paramAnonymousMenuItem.ezR, paramAnonymousMenuItem.iBi, true, new c.3(paramAnonymousMenuItem));
          GMTrace.o(6814234050560L, 50770);
          return;
          paramAnonymousMenuItem = c.this;
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "dealAddShortcut, username = " + paramAnonymousMenuItem.iBi.field_username);
          com.tencent.mm.plugin.base.model.b.K(paramAnonymousMenuItem.ezR, paramAnonymousMenuItem.iBi.field_username);
          com.tencent.mm.sdk.platformtools.af.i(new c.7(paramAnonymousMenuItem), 1000L);
        }
      }
    };
    localf.bFk();
    GMTrace.o(16033649786880L, 119460);
  }
  
  public final void c(LinkedList<btz> paramLinkedList)
  {
    GMTrace.i(6781484924928L, 50526);
    com.tencent.mm.af.x.FH().b(this);
    if (this.htU == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, screen is null");
      GMTrace.o(6781484924928L, 50526);
      return;
    }
    if (this.iBi == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, contact is null");
      GMTrace.o(6781484924928L, 50526);
      return;
    }
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, worker is null");
      GMTrace.o(6781484924928L, 50526);
      return;
    }
    if (!bg.nm(this.nMK))
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        btz localbtz = (btz)localIterator.next();
        if ((localbtz.vcF != null) && (localbtz.vcF.equals(this.nMK)))
        {
          this.htU.bc("contact_info_kf_worker", false);
          this.htU.VG("contact_info_kf_worker").setSummary(localbtz.uBf);
          GMTrace.o(6781484924928L, 50526);
          return;
        }
      }
    }
    this.htU.bc("contact_info_kf_worker", false);
    this.htU.VG("contact_info_kf_worker").setSummary(((btz)paramLinkedList.get(0)).uBf);
    GMTrace.o(6781484924928L, 50526);
  }
  
  public final void gz(boolean paramBoolean)
  {
    GMTrace.i(6779471659008L, 50511);
    final Object localObject = this.jsU.field_username;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      localObject = new com.tencent.mm.plugin.profile.a.c((String)localObject, paramBoolean);
      at.wS().a(1394, this);
      at.wS().a((com.tencent.mm.ad.k)localObject, 0);
      MMActivity localMMActivity = this.ezR;
      this.ezR.getString(R.l.cUG);
      this.hsU = com.tencent.mm.ui.base.h.a(localMMActivity, this.ezR.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(6755849338880L, 50335);
          at.wS().c(localObject);
          at.wS().b(1394, c.this);
          GMTrace.o(6755849338880L, 50335);
        }
      });
      GMTrace.o(6779471659008L, 50511);
      return;
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6780276965376L, 50517);
    if (this.ezR == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "null == context");
      GMTrace.o(6780276965376L, 50517);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ContactWidgetBizInfo", "onActivityResult, requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default: 
      GMTrace.o(6780276965376L, 50517);
      return;
    }
    if ((paramInt2 == -1) && (paramIntent != null))
    {
      String str1 = paramIntent.getStringExtra("be_send_card_name");
      String str2 = paramIntent.getStringExtra("received_card_name");
      boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
      paramIntent = paramIntent.getStringExtra("custom_send_text");
      com.tencent.mm.plugin.messenger.a.d.aOe().l(str1, str2, bool);
      com.tencent.mm.plugin.messenger.a.d.aOe().cR(paramIntent, str2);
      com.tencent.mm.ui.snackbar.a.e(this.ezR, this.ezR.getString(R.l.dwg));
      GMTrace.o(6780276965376L, 50517);
      return;
    }
    GMTrace.o(6780276965376L, 50517);
  }
  
  public final boolean tF(final String paramString)
  {
    GMTrace.i(6779337441280L, 50510);
    if (paramString == null)
    {
      GMTrace.o(6779337441280L, 50510);
      return false;
    }
    final Object localObject1;
    Object localObject2;
    if (paramString.equals("contact_info_verifyuser_weibo"))
    {
      paramString = new com.tencent.mm.plugin.profile.ui.a.a(this.ezR);
      localObject1 = this.iBi.fjo;
      localObject2 = this.iBi.field_username;
      if (localObject1 == null) {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ViewTWeibo", "null weibo id");
      }
      for (;;)
      {
        GMTrace.o(6779337441280L, 50510);
        return true;
        at.wS().a(205, paramString);
        paramString.nPi = new com.tencent.mm.plugin.profile.a.a(bg.nl((String)localObject1).replace("http://t.qq.com/", "").trim(), (String)localObject2);
        at.wS().a(paramString.nPi, 0);
        paramString.nPj.z(3000L, 3000L);
      }
    }
    if ("contact_info_biz_go_chatting".endsWith(paramString))
    {
      if (this.nMO != null)
      {
        paramString = new mx();
        this.nMO.gVv = 5;
        paramString.eRU.eRV = this.nMO;
        com.tencent.mm.sdk.b.a.vgX.m(paramString);
      }
      if ((this.jsU != null) && ((this.jsU.EF()) || (this.jsU.EH())))
      {
        paramString = new Intent();
        if (this.jsU.EH())
        {
          localObject1 = this.jsU.EN();
          if (bg.nm((String)localObject1))
          {
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "contact_info_biz_go_chatting fatherUserName is empty");
            GMTrace.o(6779337441280L, 50510);
            return false;
          }
          paramString.putExtra("enterprise_biz_name", (String)localObject1);
          paramString.putExtra("enterprise_biz_display_name", com.tencent.mm.y.r.fs((String)localObject1));
          paramString.addFlags(67108864);
          com.tencent.mm.bj.d.a(this.ezR, ".ui.conversation.EnterpriseConversationUI", paramString);
          this.ezR.finish();
        }
      }
      for (;;)
      {
        ak(5, null);
        GMTrace.o(6779337441280L, 50510);
        return true;
        paramString.putExtra("enterprise_biz_name", this.iBi.field_username);
        paramString.putExtra("enterprise_biz_display_name", com.tencent.mm.y.r.fs(this.iBi.field_username));
        break;
        paramString = new Intent();
        if (this.ezR.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false)) {
          paramString.setFlags(268435456);
        }
        if (this.nLx)
        {
          paramString.putExtra("Chat_User", this.iBi.field_username);
          paramString.putExtra("Chat_Mode", 1);
          this.ezR.setResult(-1, paramString);
        }
        else
        {
          paramString.putExtra("Chat_User", this.iBi.field_username);
          paramString.putExtra("Chat_Mode", 1);
          paramString.putExtra("finish_direct", true);
          com.tencent.mm.plugin.profile.a.hnH.e(paramString, this.ezR);
        }
      }
    }
    if ("contact_info_biz_add".endsWith(paramString))
    {
      if ((this.ezR.getIntent() != null) && (this.ezR.getIntent().getBooleanExtra("KIsHardDevice", false)))
      {
        paramString = this.ezR.getIntent().getStringExtra("KHardDeviceBindTicket");
        if (bg.nm(paramString)) {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ContactWidgetBizInfo", "bindTicket is null, means it is not switch from QRcode scan, just add contact");
        }
      }
      else
      {
        paramString = new com.tencent.mm.pluginsdk.ui.applet.a(this.ezR, new a.a()
        {
          public final void a(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, String paramAnonymousString1, String paramAnonymousString2)
          {
            GMTrace.i(6817455276032L, 50794);
            com.tencent.mm.storage.x localx;
            if (paramAnonymousBoolean1)
            {
              com.tencent.mm.ui.base.h.bm(c.this.ezR, c.this.ezR.getString(R.l.diM));
              c.this.htU.bc("contact_info_time_expired", true);
              localx = c.this.iBi;
              if ((localx != null) && (!bg.nm(paramAnonymousString1))) {
                break label394;
              }
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "respUsername == " + paramAnonymousString1 + ", contact = " + localx);
              c.this.nMI = true;
              if (c.this.nMO != null)
              {
                paramAnonymousString1 = new mx();
                c.this.nMO.gVv = 4;
                paramAnonymousString1.eRU.eRV = c.this.nMO;
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousString1);
              }
              paramAnonymousString1 = com.tencent.mm.af.x.FG().iC(c.this.iBi.field_username);
              paramAnonymousString1.field_status = 1;
              if ((!bg.nm(paramAnonymousString1.field_extInfo)) || (bg.nm(paramAnonymousString1.field_username)) || (c.this.jsU == null) || (!paramAnonymousString1.field_username.equals(bg.nl(c.this.jsU.field_username)))) {
                break label682;
              }
              com.tencent.mm.af.x.FG().e(c.this.jsU);
              label251:
              paramAnonymousBoolean1 = c.this.ezR.getIntent().getBooleanExtra("key_biz_profile_stay_after_follow_op", false);
              paramAnonymousBoolean2 = c.this.ezR.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false);
              if (!paramAnonymousString1.EF()) {
                break label693;
              }
              paramAnonymousString1 = new Intent();
              paramAnonymousString1.putExtra("enterprise_biz_name", c.this.iBi.field_username);
              paramAnonymousString1.putExtra("enterprise_biz_display_name", com.tencent.mm.y.r.fs(c.this.iBi.field_username));
              paramAnonymousString1.putExtra("enterprise_from_scene", 7);
              paramAnonymousString1.addFlags(67108864);
              com.tencent.mm.bj.d.a(c.this.ezR, ".ui.conversation.EnterpriseConversationUI", paramAnonymousString1);
            }
            for (;;)
            {
              label366:
              c.this.ezR.finish();
              label394:
              label623:
              label682:
              label693:
              do
              {
                c.this.ak(3, null);
                GMTrace.o(6817455276032L, 50794);
                return;
                paramAnonymousString2 = null;
                if (s.fB(localx.field_username))
                {
                  String str = bg.nl(localx.field_username);
                  paramAnonymousString2 = com.tencent.mm.af.f.iK(str);
                  if (paramAnonymousString2 != null) {
                    paramAnonymousString2.field_username = paramAnonymousString1;
                  }
                  com.tencent.mm.af.x.FG().iD(str);
                  localx.cr(str);
                }
                localx.setUsername(paramAnonymousString1);
                if ((int)localx.fTq == 0)
                {
                  at.AR();
                  com.tencent.mm.y.c.yK().S(localx);
                }
                if ((int)localx.fTq <= 0)
                {
                  com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "addContact : insert contact failed");
                  break;
                }
                s.p(localx);
                at.AR();
                paramAnonymousString1 = com.tencent.mm.y.c.yK().TE(localx.field_username);
                if (paramAnonymousString2 != null)
                {
                  com.tencent.mm.af.x.FG().d(paramAnonymousString2);
                  break;
                }
                paramAnonymousString2 = com.tencent.mm.af.f.iK(paramAnonymousString1.field_username);
                if ((paramAnonymousString1.bSA()) && (com.tencent.mm.af.a.Ew())) {}
                for (int i = 1;; i = 0)
                {
                  if ((paramAnonymousString2 != null) && ((!paramAnonymousString2.Ez()) || (i != 0))) {
                    break label623;
                  }
                  com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "shouldUpdate");
                  ak.a.gmX.K(paramAnonymousString1.field_username, "");
                  com.tencent.mm.ac.b.hR(paramAnonymousString1.field_username);
                  break;
                }
                if ((!paramAnonymousString1.needUpdate()) || (i != 0)) {
                  break;
                }
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "update contact, last check time=%d", new Object[] { Integer.valueOf(paramAnonymousString1.fjr) });
                ak.a.gmX.K(paramAnonymousString1.field_username, "");
                com.tencent.mm.ac.b.hR(paramAnonymousString1.field_username);
                break;
                com.tencent.mm.af.x.FG().e(paramAnonymousString1);
                break label251;
                paramAnonymousString1 = new Intent();
                paramAnonymousString1.putExtra("Chat_User", c.this.iBi.field_username);
                paramAnonymousString1.putExtra("key_has_add_contact", true);
                paramAnonymousString1.putExtra("finish_direct", true);
                if (paramAnonymousBoolean2) {
                  paramAnonymousString1.addFlags(268435456);
                }
                com.tencent.mm.plugin.profile.a.hnH.e(paramAnonymousString1, c.this.ezR);
                if (paramAnonymousBoolean1) {
                  break label366;
                }
              } while (!paramAnonymousBoolean2);
            }
          }
        });
        localObject1 = new LinkedList();
        ((LinkedList)localObject1).add(Integer.valueOf(this.nLz));
        if (this.gvU != null) {
          paramString.twp = this.gvU;
        }
        if (!bg.nm(this.nLA)) {
          paramString.nLA = this.nLA;
        }
        paramString.tww = true;
        paramString.a(this.iBi.field_username, (LinkedList)localObject1, this.nMP);
      }
      for (;;)
      {
        if (this.nMJ != 0) {
          com.tencent.mm.plugin.report.service.g.ork.i(11263, new Object[] { Integer.valueOf(this.nMJ), this.iBi.field_username });
        }
        GMTrace.o(6779337441280L, 50510);
        return true;
        if (aXG()) {
          break;
        }
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "IsHardDevice, bindTicket = %s", new Object[] { paramString });
        at.wS().a(536, this);
        localObject1 = new ct();
        ((ct)localObject1).eEc.eEe = paramString;
        ((ct)localObject1).eEc.opType = 1;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        paramString = ((ct)localObject1).eEd.eEg;
        localObject1 = this.ezR;
        this.ezR.getString(R.l.cUG);
        this.hsU = com.tencent.mm.ui.base.h.a((Context)localObject1, this.ezR.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(6738401034240L, 50205);
            at.wS().b(536, c.this);
            paramAnonymousDialogInterface = new ct();
            paramAnonymousDialogInterface.eEc.opType = 2;
            paramAnonymousDialogInterface.eEc.eEg = paramString;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousDialogInterface);
            GMTrace.o(6738401034240L, 50205);
          }
        });
      }
    }
    if ("contact_info_biz_read_msg_online".endsWith(paramString))
    {
      GMTrace.o(6779337441280L, 50510);
      return true;
    }
    if ("contact_info_stick_biz".equals(paramString))
    {
      if (((CheckBoxPreference)this.htU.VG("contact_info_stick_biz")).isChecked())
      {
        com.tencent.mm.plugin.report.service.g.ork.i(13307, new Object[] { this.iBi.field_username, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0) });
        com.tencent.mm.y.i.eY(this.iBi.field_username);
      }
      for (;;)
      {
        GMTrace.o(6779337441280L, 50510);
        return true;
        s.o(this.iBi.field_username, true);
        com.tencent.mm.plugin.report.service.g.ork.i(13307, new Object[] { this.iBi.field_username, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(0) });
      }
    }
    if (("contact_info_guarantee_info".equals(paramString)) && (this.gvL.EY() != null) && (!bg.nm(this.gvL.EY().gwL)))
    {
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("rawUrl", this.gvL.EY().gwL);
      ((Intent)localObject1).putExtra("useJs", true);
      ((Intent)localObject1).putExtra("vertical_scroll", true);
      ((Intent)localObject1).putExtra("geta8key_scene", 3);
      com.tencent.mm.bj.d.b(this.ezR, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
    }
    int i;
    if (paramString.startsWith("contact_info_bizinfo_external#"))
    {
      i = bg.getInt(paramString.replace("contact_info_bizinfo_external#", ""), -1);
      if ((i >= 0) && (i < this.gvK.size()))
      {
        paramString = (com.tencent.mm.af.d.a)this.gvK.get(i);
        localObject2 = paramString.url;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", (String)localObject2);
        ((Intent)localObject1).putExtra("useJs", true);
        ((Intent)localObject1).putExtra("vertical_scroll", true);
        ((Intent)localObject1).putExtra("geta8key_scene", 3);
        ((Intent)localObject1).putExtra("KPublisherId", "brand_profile");
        ((Intent)localObject1).putExtra("prePublishId", "brand_profile");
        if (((this.nMN != null) && ((this.nLz == 39) || (this.nLz == 56) || (this.nLz == 35))) || (this.nLz == 87) || (this.nLz == 89) || (this.nLz == 85) || (this.nLz == 88))
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "from biz search.");
          localObject2 = new Bundle();
          ((Bundle)localObject2).putBoolean("KFromBizSearch", true);
          ((Bundle)localObject2).putBundle("KBizSearchExtArgs", this.nMN);
          ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
          if (!com.tencent.mm.l.a.eE(this.iBi.field_type)) {
            break label1492;
          }
        }
        label1492:
        for (i = 7;; i = 6)
        {
          int j = this.ezR.getResources().getIdentifier(paramString.gvO, "string", this.ezR.getPackageName());
          paramString = paramString.title;
          if (j > 0) {
            paramString = this.ezR.getString(j);
          }
          ak(i, paramString);
          com.tencent.mm.bj.d.b(this.ezR, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          GMTrace.o(6779337441280L, 50510);
          return true;
        }
      }
    }
    label1717:
    label1722:
    boolean bool;
    if (("contact_info_subscribe_bizinfo".endsWith(paramString)) || ("contact_info_show_brand".endsWith(paramString)) || ("contact_info_locate".endsWith(paramString)))
    {
      localObject1 = this.jsU;
      if (localObject1 == null)
      {
        GMTrace.o(6779337441280L, 50510);
        return true;
      }
      if ("contact_info_subscribe_bizinfo".endsWith(paramString)) {
        if (((com.tencent.mm.af.d)localObject1).EE()) {
          if (localObject1 != null)
          {
            if (!((com.tencent.mm.af.d)localObject1).EH()) {
              break label1722;
            }
            at.wS().a(1363, this);
            if (!((CheckBoxPreference)this.htU.VG("contact_info_subscribe_bizinfo")).isChecked()) {
              break label1717;
            }
            i = 0;
            paramString = new com.tencent.mm.plugin.profile.a.b(((com.tencent.mm.af.d)localObject1).field_username, i);
            at.wS().a(paramString, 0);
            localObject2 = this.ezR;
            this.ezR.getString(R.l.cUG);
            this.hsU = com.tencent.mm.ui.base.h.a((Context)localObject2, this.ezR.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(6745648791552L, 50259);
                at.wS().c(paramString);
                at.wS().b(1363, c.this);
                GMTrace.o(6745648791552L, 50259);
              }
            });
          }
        }
      }
      for (;;)
      {
        if ((!((com.tencent.mm.af.d)localObject1).EH()) && (!((com.tencent.mm.af.d)localObject1).EF())) {
          a((com.tencent.mm.af.d)localObject1, false);
        }
        GMTrace.o(6779337441280L, 50510);
        return true;
        i = 4;
        break;
        if (((com.tencent.mm.af.d)localObject1).EF())
        {
          paramString = (CheckBoxPreference)this.htU.VG("contact_info_subscribe_bizinfo");
          com.tencent.mm.af.x.FN();
          localObject2 = ((com.tencent.mm.af.d)localObject1).field_username;
          if (!paramString.isChecked()) {}
          for (bool = true;; bool = false)
          {
            paramString = com.tencent.mm.af.c.a((String)localObject2, bool, this);
            localObject2 = this.ezR;
            this.ezR.getString(R.l.cUG);
            this.hsU = com.tencent.mm.ui.base.h.a((Context)localObject2, this.ezR.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(6739608993792L, 50214);
                com.tencent.mm.af.x.FN();
                com.tencent.mm.af.c.a(paramString);
                GMTrace.o(6739608993792L, 50214);
              }
            });
            break;
          }
          if (((com.tencent.mm.af.d)localObject1).Ex())
          {
            ((com.tencent.mm.af.d)localObject1).field_brandFlag |= 0x1;
            if ((this.gvL == null) && (localObject1 != null)) {
              this.gvL = ((com.tencent.mm.af.d)localObject1).bq(false);
            }
            if ((this.gvL != null) && (this.gvL.ER()) && (com.tencent.mm.bj.d.LL("brandservice")))
            {
              this.htU.bc("contact_info_template_recv", false);
              label1912:
              paramString = com.tencent.mm.plugin.report.service.g.ork;
              localObject2 = ((com.tencent.mm.af.d)localObject1).field_username;
              if (!((com.tencent.mm.af.d)localObject1).Ex()) {
                break label2018;
              }
            }
          }
          label2018:
          for (i = 3;; i = 4)
          {
            paramString.i(13307, new Object[] { localObject2, Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(0) });
            break;
            this.htU.bc("contact_info_template_recv", true);
            break label1912;
            ((com.tencent.mm.af.d)localObject1).field_brandFlag &= 0xFFFFFFFE;
            this.htU.bc("contact_info_template_recv", true);
            break label1912;
          }
          if ("contact_info_show_brand".endsWith(paramString))
          {
            if ((((com.tencent.mm.af.d)localObject1).field_brandFlag & 0x2) == 0) {}
            for (i = 1;; i = 0)
            {
              if (i == 0) {
                break label2069;
              }
              ((com.tencent.mm.af.d)localObject1).field_brandFlag |= 0x2;
              break;
            }
            label2069:
            ((com.tencent.mm.af.d)localObject1).field_brandFlag &= 0xFFFFFFFD;
          }
          else if ("contact_info_locate".endsWith(paramString))
          {
            if (((com.tencent.mm.af.d)localObject1).Ey()) {
              ((com.tencent.mm.af.d)localObject1).field_brandFlag &= 0xFFFFFFFB;
            } else {
              this.nMM = com.tencent.mm.ui.base.h.a(this.ezR, this.ezR.getString(R.l.dfa, new Object[] { this.iBi.vk() }), this.ezR.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(6734106066944L, 50173);
                  localObject1.field_hadAlert = 1;
                  localObject1.field_brandFlag |= 0x4;
                  c.this.a(localObject1, true);
                  GMTrace.o(6734106066944L, 50173);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(6722294906880L, 50085);
                  localObject1.field_hadAlert = 1;
                  c.this.a(localObject1, false);
                  GMTrace.o(6722294906880L, 50085);
                }
              });
            }
          }
        }
      }
    }
    if ("contact_info_verifyuser".endsWith(paramString))
    {
      paramString = this.jsU;
      if (paramString == null)
      {
        GMTrace.o(6779337441280L, 50510);
        return true;
      }
      localObject2 = paramString.bq(false);
      if (localObject2 == null)
      {
        GMTrace.o(6779337441280L, 50510);
        return true;
      }
      localObject1 = null;
      if ((((d.b)localObject2).Fa() != null) && (!bg.nm(((d.b)localObject2).Fa().gwG))) {
        paramString = ((d.b)localObject2).Fa().gwG;
      }
      for (;;)
      {
        if (!bg.nm(paramString))
        {
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("rawUrl", paramString);
          ((Intent)localObject1).putExtra("useJs", true);
          ((Intent)localObject1).putExtra("vertical_scroll", true);
          ((Intent)localObject1).putExtra("geta8key_scene", 3);
          com.tencent.mm.bj.d.b(this.ezR, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        }
        GMTrace.o(6779337441280L, 50510);
        return true;
        paramString = (String)localObject1;
        if (((d.b)localObject2).Fb() != null)
        {
          paramString = (String)localObject1;
          if (!bg.nm(((d.b)localObject2).Fb().gwO)) {
            paramString = ((d.b)localObject2).Fb().gwO;
          }
        }
      }
    }
    if ("contact_info_trademark".endsWith(paramString))
    {
      paramString = this.jsU;
      if (paramString == null)
      {
        GMTrace.o(6779337441280L, 50510);
        return true;
      }
      if ((paramString.bq(false) != null) && (!bg.nm(paramString.bq(false).ET())))
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", paramString.bq(false).ET());
        ((Intent)localObject1).putExtra("useJs", true);
        ((Intent)localObject1).putExtra("vertical_scroll", true);
        ((Intent)localObject1).putExtra("geta8key_scene", 3);
        com.tencent.mm.bj.d.b(this.ezR, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
      }
      GMTrace.o(6779337441280L, 50510);
      return true;
    }
    if ("contact_is_mute".endsWith(paramString))
    {
      if (!this.jGN)
      {
        bool = true;
        this.jGN = bool;
        if (!this.jGN) {
          break label3017;
        }
        s.n(this.iBi);
        label2570:
        gA(this.jGN);
      }
    }
    else
    {
      if ("enterprise_contact_info_enter".equals(paramString))
      {
        if (this.ezR != null) {
          break label3027;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise context is null");
      }
      label2604:
      if ("contact_info_biz_disable".equals(paramString))
      {
        localObject1 = this.ezR.getString(R.l.dpX);
        localObject2 = this.ezR.getString(R.l.dpW);
        com.tencent.mm.ui.base.h.a(this.ezR, (String)localObject1, "", (String)localObject2, this.ezR.getString(R.l.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6737864163328L, 50201);
            c.this.gz(false);
            GMTrace.o(6737864163328L, 50201);
          }
        }, null);
      }
      if ("contact_info_biz_enable".equals(paramString)) {
        gz(true);
      }
      if ("contact_info_template_recv".equals(paramString))
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("enterprise_biz_name", this.jsU.field_username);
        com.tencent.mm.bj.d.b(this.ezR, "brandservice", ".ui.ReceiveTemplateMsgMgrUI", (Intent)localObject1);
      }
      if ("contact_info_service_phone".equals(paramString))
      {
        localObject1 = this.htU.VG("contact_info_service_phone");
        if ((localObject1 != null) && (((Preference)localObject1).getSummary() != null) && (!bg.nm(((Preference)localObject1).getSummary().toString())))
        {
          localObject1 = ((Preference)localObject1).getSummary().toString();
          com.tencent.mm.ui.base.h.a(this.ezR, true, (String)localObject1, "", this.ezR.getString(R.l.djg), this.ezR.getString(R.l.cSk), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6819602759680L, 50810);
              paramAnonymousDialogInterface = new Intent("android.intent.action.DIAL");
              paramAnonymousDialogInterface.setFlags(268435456);
              paramAnonymousDialogInterface.setData(Uri.parse("tel:" + localObject1));
              if (bg.j(c.this.ezR, paramAnonymousDialogInterface)) {
                c.this.ezR.startActivity(paramAnonymousDialogInterface);
              }
              GMTrace.o(6819602759680L, 50810);
            }
          }, null);
        }
      }
      if ("contact_info_expose_btn".equals(paramString)) {
        aXH();
      }
      if (paramString.equals("biz_placed_to_the_top"))
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "changePlacedTop");
        if (this.ghC == null) {
          this.ghC = this.ezR.getSharedPreferences(this.ezR.getPackageName() + "_preferences", 0);
        }
        if (this.iBi != null)
        {
          if (!this.iBi.vf()) {
            break label3098;
          }
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "unSetPlaceTop:%s", new Object[] { this.iBi.field_username });
          s.o(this.iBi.field_username, true);
          this.ghC.edit().putBoolean("biz_placed_to_the_top", false).commit();
        }
      }
    }
    for (;;)
    {
      GMTrace.o(6779337441280L, 50510);
      return true;
      bool = false;
      break;
      label3017:
      s.o(this.iBi);
      break label2570;
      label3027:
      if (this.jsU == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise bizInfo is null");
        break label2604;
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("enterprise_biz_name", this.jsU.field_username);
      ((Intent)localObject1).addFlags(67108864);
      com.tencent.mm.bj.d.b(this.ezR, "brandservice", ".ui.EnterpriseBizContactListUI", (Intent)localObject1);
      break label2604;
      label3098:
      com.tencent.mm.y.i.eY(this.iBi.field_username);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "setPlaceTop:%s", new Object[] { this.iBi.field_username });
      this.ghC.edit().putBoolean("biz_placed_to_the_top", true).commit();
    }
  }
  
  private static final class a
    extends BitmapDrawable
    implements j.a
  {
    private String url;
    
    public a(Resources paramResources, String paramString) {}
    
    public final void draw(Canvas paramCanvas)
    {
      GMTrace.i(6766184103936L, 50412);
      Object localObject2 = com.tencent.mm.platformtools.j.a(new com.tencent.mm.platformtools.i()
      {
        public final void I(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
          GMTrace.i(6764170838016L, 50397);
          GMTrace.o(6764170838016L, 50397);
        }
        
        public final i.b Pl()
        {
          GMTrace.i(6764439273472L, 50399);
          GMTrace.o(6764439273472L, 50399);
          return null;
        }
        
        public final String Pm()
        {
          GMTrace.i(6764573491200L, 50400);
          Object localObject = new StringBuilder();
          at.AR();
          localObject = com.tencent.mm.y.c.zh() + aa.RP(c.a.a(c.a.this));
          GMTrace.o(6764573491200L, 50400);
          return (String)localObject;
        }
        
        public final String Pn()
        {
          GMTrace.i(6764976144384L, 50403);
          String str = c.a.a(c.a.this);
          GMTrace.o(6764976144384L, 50403);
          return str;
        }
        
        public final String Po()
        {
          GMTrace.i(6764707708928L, 50401);
          String str = c.a.a(c.a.this);
          GMTrace.o(6764707708928L, 50401);
          return str;
        }
        
        public final String Pp()
        {
          GMTrace.i(6765110362112L, 50404);
          String str = c.a.a(c.a.this);
          GMTrace.o(6765110362112L, 50404);
          return str;
        }
        
        public final boolean Pq()
        {
          GMTrace.i(6763768184832L, 50394);
          GMTrace.o(6763768184832L, 50394);
          return false;
        }
        
        public final boolean Pr()
        {
          GMTrace.i(6763633967104L, 50393);
          GMTrace.o(6763633967104L, 50393);
          return false;
        }
        
        public final Bitmap Ps()
        {
          GMTrace.i(6764841926656L, 50402);
          GMTrace.o(6764841926656L, 50402);
          return null;
        }
        
        public final void Pt()
        {
          GMTrace.i(6764036620288L, 50396);
          GMTrace.o(6764036620288L, 50396);
        }
        
        public final Bitmap a(Bitmap paramAnonymousBitmap, i.a paramAnonymousa, String paramAnonymousString)
        {
          GMTrace.i(6763902402560L, 50395);
          if (i.a.hiU == paramAnonymousa) {}
          try
          {
            com.tencent.mm.sdk.platformtools.d.a(paramAnonymousBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetBizInfo", "get bitmap, from %s", new Object[] { paramAnonymousa.toString() });
            GMTrace.o(6763902402560L, 50395);
            return paramAnonymousBitmap;
          }
          catch (IOException paramAnonymousString)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.ContactWidgetBizInfo", paramAnonymousString, "", new Object[0]);
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetBizInfo", "save bitmap fail");
            }
          }
        }
        
        public final void a(i.a paramAnonymousa, String paramAnonymousString)
        {
          GMTrace.i(6764305055744L, 50398);
          GMTrace.o(6764305055744L, 50398);
        }
      });
      Object localObject1;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (!((Bitmap)localObject2).isRecycled()) {}
      }
      else
      {
        localObject1 = null;
      }
      localObject2 = getBounds();
      if (localObject1 != null) {
        paramCanvas.drawBitmap((Bitmap)localObject1, null, (Rect)localObject2, null);
      }
      GMTrace.o(6766184103936L, 50412);
    }
    
    public final void k(String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(6766318321664L, 50413);
      if (this.url.equals(paramString)) {
        invalidateSelf();
      }
      GMTrace.o(6766318321664L, 50413);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */