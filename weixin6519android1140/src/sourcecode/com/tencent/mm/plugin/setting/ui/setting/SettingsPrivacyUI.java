package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.e.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsPrivacyUI
  extends MMPreference
{
  private String fJS;
  private f htU;
  boolean jNK;
  private HashMap<Integer, Integer> jqC;
  private boolean oIb;
  private boolean oJK;
  private boolean oJL;
  private boolean oJM;
  private boolean oJN;
  private boolean oJO;
  private int oJP;
  private int status;
  
  public SettingsPrivacyUI()
  {
    GMTrace.i(4625008689152L, 34459);
    this.jqC = new HashMap();
    this.fJS = "";
    this.oJK = true;
    this.oIb = false;
    this.oJL = false;
    this.oJM = false;
    this.oJN = false;
    this.oJO = true;
    this.jNK = false;
    this.oJP = e.d.vGG;
    GMTrace.o(4625008689152L, 34459);
  }
  
  private void a(LinearLayout paramLinearLayout, int paramInt1, int paramInt2, boolean paramBoolean, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(4626216648704L, 34468);
    TextView localTextView = (TextView)View.inflate(this.vKB.vKW, R.i.cEd, null);
    localTextView.setText(paramInt1);
    localTextView.setTag(Integer.valueOf(paramInt2));
    paramLinearLayout.addView(localTextView);
    localTextView.setOnClickListener(paramOnClickListener);
    if (paramBoolean) {
      localTextView.setCompoundDrawablesWithIntrinsicBounds(R.k.cOv, 0, 0, 0);
    }
    GMTrace.o(4626216648704L, 34468);
  }
  
  private void beG()
  {
    GMTrace.i(4626082430976L, 34467);
    Object localObject = new bgm();
    if (com.tencent.mm.plugin.sns.b.n.poP != null) {
      localObject = com.tencent.mm.plugin.sns.b.n.poP.GI(this.fJS);
    }
    for (;;)
    {
      if (localObject == null)
      {
        w.e("MicroMsg.SettingPrivacy", "userinfo is null");
        GMTrace.o(4626082430976L, 34467);
        return;
      }
      at.AR();
      int i = ((Integer)c.xh().get(w.a.vxa, Integer.valueOf(0))).intValue();
      at.AR();
      if (i > ((Integer)c.xh().get(w.a.vxb, Integer.valueOf(0))).intValue())
      {
        at.AR();
        c.xh().a(w.a.vxb, Integer.valueOf(i));
        beH();
      }
      i.a locala = new i.a(this.vKB.vKW);
      locala.BR(R.l.cSk);
      locala.BN(R.l.djr);
      View localView = View.inflate(this.vKB.vKW, R.i.cBv, null);
      final LinearLayout localLinearLayout = (LinearLayout)localView.findViewById(R.h.cgk);
      View.OnClickListener local2 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4629706309632L, 34494);
          int i = 0;
          while (i < localLinearLayout.getChildCount())
          {
            localObject = (TextView)localLinearLayout.getChildAt(i);
            if (R.h.chF != ((TextView)localObject).getId()) {
              ((TextView)localObject).setCompoundDrawablesWithIntrinsicBounds(R.k.cOu, 0, 0, 0);
            }
            i += 1;
          }
          ((TextView)paramAnonymousView).setCompoundDrawablesWithIntrinsicBounds(R.k.cOv, 0, 0, 0);
          Object localObject = new bgm();
          if (com.tencent.mm.plugin.sns.b.n.poP != null) {
            localObject = com.tencent.mm.plugin.sns.b.n.poP.GI(SettingsPrivacyUI.b(SettingsPrivacyUI.this));
          }
          if (localObject == null)
          {
            w.e("MicroMsg.SettingPrivacy", "userinfo is null");
            GMTrace.o(4629706309632L, 34494);
            return;
          }
          i = ((Integer)paramAnonymousView.getTag()).intValue();
          w.d("MicroMsg.SettingPrivacy", "settings_silence_update_mode choice: %d", new Object[] { Integer.valueOf(i) });
          if (i == 0)
          {
            if (SettingsPrivacyUI.c(SettingsPrivacyUI.this) == e.d.vGH) {
              g.ork.i(14090, new Object[] { Integer.valueOf(4) });
            }
            SettingsPrivacyUI.a(SettingsPrivacyUI.this, false);
            SettingsPrivacyUI.b(SettingsPrivacyUI.this, true);
            SettingsPrivacyUI.d(SettingsPrivacyUI.this);
            if (com.tencent.mm.plugin.sns.b.n.poP != null) {
              com.tencent.mm.plugin.sns.b.n.poP.a(SettingsPrivacyUI.b(SettingsPrivacyUI.this), SettingsPrivacyUI.e(SettingsPrivacyUI.this), SettingsPrivacyUI.f(SettingsPrivacyUI.this), SettingsPrivacyUI.g(SettingsPrivacyUI.this));
            }
            if (com.tencent.mm.plugin.sns.b.n.poP != null)
            {
              localObject = com.tencent.mm.plugin.sns.b.n.poP.b(SettingsPrivacyUI.b(SettingsPrivacyUI.this), SettingsPrivacyUI.e(SettingsPrivacyUI.this), SettingsPrivacyUI.f(SettingsPrivacyUI.this), SettingsPrivacyUI.g(SettingsPrivacyUI.this));
              com.tencent.mm.plugin.sns.b.n.poP.a(SettingsPrivacyUI.b(SettingsPrivacyUI.this), (bgm)localObject);
              if (localObject == null)
              {
                w.e("MicroMsg.SettingPrivacy", "userinfo in null !");
                GMTrace.o(4629706309632L, 34494);
                return;
              }
              w.d("MicroMsg.SettingPrivacy", "dancy userinfo " + localObject.toString());
              at.AR();
              c.yJ().b(new e.a(51, (com.tencent.mm.bm.a)localObject));
            }
          }
          for (;;)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(4631719575552L, 34509);
                ((Dialog)SettingsPrivacyUI.2.this.oHR.getTag()).dismiss();
                SettingsPrivacyUI.h(SettingsPrivacyUI.this);
                GMTrace.o(4631719575552L, 34509);
              }
            });
            GMTrace.o(4629706309632L, 34494);
            return;
            if (i == 1)
            {
              if (SettingsPrivacyUI.c(SettingsPrivacyUI.this) == e.d.vGH) {
                g.ork.i(14090, new Object[] { Integer.valueOf(5) });
              }
              SettingsPrivacyUI.a(SettingsPrivacyUI.this, true);
              SettingsPrivacyUI.b(SettingsPrivacyUI.this, false);
              SettingsPrivacyUI.d(SettingsPrivacyUI.this);
              if (com.tencent.mm.plugin.sns.b.n.poP != null) {
                com.tencent.mm.plugin.sns.b.n.poP.a(SettingsPrivacyUI.b(SettingsPrivacyUI.this), SettingsPrivacyUI.e(SettingsPrivacyUI.this), SettingsPrivacyUI.f(SettingsPrivacyUI.this), SettingsPrivacyUI.g(SettingsPrivacyUI.this));
              }
              if (com.tencent.mm.plugin.sns.b.n.poP != null)
              {
                localObject = com.tencent.mm.plugin.sns.b.n.poP.b(SettingsPrivacyUI.b(SettingsPrivacyUI.this), SettingsPrivacyUI.e(SettingsPrivacyUI.this), SettingsPrivacyUI.f(SettingsPrivacyUI.this), SettingsPrivacyUI.g(SettingsPrivacyUI.this));
                com.tencent.mm.plugin.sns.b.n.poP.a(SettingsPrivacyUI.b(SettingsPrivacyUI.this), (bgm)localObject);
                if (localObject == null)
                {
                  w.e("MicroMsg.SettingPrivacy", "userinfo in null !");
                  GMTrace.o(4629706309632L, 34494);
                  return;
                }
                w.d("MicroMsg.SettingPrivacy", "dancy userinfo " + localObject.toString());
                at.AR();
                c.yJ().b(new e.a(51, (com.tencent.mm.bm.a)localObject));
              }
            }
            else
            {
              if (SettingsPrivacyUI.c(SettingsPrivacyUI.this) == e.d.vGH) {
                g.ork.i(14090, new Object[] { Integer.valueOf(6) });
              }
              SettingsPrivacyUI.a(SettingsPrivacyUI.this, false);
              SettingsPrivacyUI.b(SettingsPrivacyUI.this, false);
              SettingsPrivacyUI.d(SettingsPrivacyUI.this);
              if (com.tencent.mm.plugin.sns.b.n.poP != null) {
                com.tencent.mm.plugin.sns.b.n.poP.a(SettingsPrivacyUI.b(SettingsPrivacyUI.this), SettingsPrivacyUI.e(SettingsPrivacyUI.this), SettingsPrivacyUI.f(SettingsPrivacyUI.this), SettingsPrivacyUI.g(SettingsPrivacyUI.this));
              }
              if (com.tencent.mm.plugin.sns.b.n.poP != null)
              {
                localObject = com.tencent.mm.plugin.sns.b.n.poP.b(SettingsPrivacyUI.b(SettingsPrivacyUI.this), SettingsPrivacyUI.e(SettingsPrivacyUI.this), SettingsPrivacyUI.f(SettingsPrivacyUI.this), SettingsPrivacyUI.g(SettingsPrivacyUI.this));
                com.tencent.mm.plugin.sns.b.n.poP.a(SettingsPrivacyUI.b(SettingsPrivacyUI.this), (bgm)localObject);
                if (localObject == null)
                {
                  w.e("MicroMsg.SettingPrivacy", "userinfo in null !");
                  GMTrace.o(4629706309632L, 34494);
                  return;
                }
                w.d("MicroMsg.SettingPrivacy", "dancy userinfo " + localObject.toString());
                at.AR();
                c.yJ().b(new e.a(51, (com.tencent.mm.bm.a)localObject));
              }
            }
          }
        }
      };
      i = ((bgm)localObject).uSi;
      a(localLinearLayout, R.l.djt, 1, this.oJL, local2);
      a(localLinearLayout, R.l.dju, 0, this.oJM, local2);
      i = R.l.djs;
      if ((!this.oJL) && (!this.oJM)) {}
      for (boolean bool = true;; bool = false)
      {
        a(localLinearLayout, i, 2, bool, local2);
        locala.dg(localView);
        localObject = locala.aax();
        localLinearLayout.setTag(localObject);
        ((i)localObject).show();
        a((Dialog)localObject);
        GMTrace.o(4626082430976L, 34467);
        return;
      }
    }
  }
  
  private void beH()
  {
    GMTrace.i(4626753519616L, 34472);
    Object localObject = new bgm();
    if (com.tencent.mm.plugin.sns.b.n.poP != null) {
      localObject = com.tencent.mm.plugin.sns.b.n.poP.GI(this.fJS);
    }
    if (localObject == null)
    {
      w.e("MicroMsg.SettingPrivacy", "userinfo is null");
      GMTrace.o(4626753519616L, 34472);
      return;
    }
    int i = ((bgm)localObject).uSi;
    localObject = (CheckBoxPreference)this.htU.VG("timeline_stranger_show");
    boolean bool;
    if (localObject != null)
    {
      ((Preference)localObject).wlc = false;
      if ((i & 0x1) > 0)
      {
        bool = true;
        this.oIb = bool;
        if (this.oIb) {
          break label536;
        }
        ((CheckBoxPreference)localObject).sdM = true;
      }
    }
    else
    {
      label120:
      localObject = (IconPreference)this.htU.VG("timeline_recent_show_select");
      if (localObject != null)
      {
        ((Preference)localObject).wlc = false;
        if ((i & 0x200) <= 0) {
          break label545;
        }
        bool = true;
        label158:
        this.oJL = bool;
        if ((i & 0x400) <= 0) {
          break label550;
        }
        bool = true;
        label173:
        this.oJM = bool;
        if ((i & 0x800) <= 0) {
          break label555;
        }
        bool = true;
        label188:
        this.oJN = bool;
        if (!this.oJL) {
          break label560;
        }
        ((IconPreference)localObject).setSummary(R.l.djt);
        label208:
        at.AR();
        i = ((Integer)c.xh().get(w.a.vxa, Integer.valueOf(0))).intValue();
        at.AR();
        int j = ((Integer)c.xh().get(w.a.vxb, Integer.valueOf(0))).intValue();
        w.i("MicroMsg.SettingPrivacy", "willShowRecentRedCodeId  %d, currentRecentRedCodeId %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (i <= j) {
          break label589;
        }
        ((IconPreference)localObject).Cm(0);
      }
      label293:
      localObject = (CheckBoxPreference)this.htU.VG("timeline_open_entrance");
      if (localObject != null)
      {
        ((Preference)localObject).wlc = false;
        if ((!com.tencent.mm.bj.d.LL("sns")) || ((q.zP() & 0x8000) != 0)) {
          break label599;
        }
        bool = true;
        label342:
        this.oJK = bool;
        StringBuilder localStringBuilder = new StringBuilder("isSnsOpenEntrance ").append(this.oJK).append(", install ").append(com.tencent.mm.bj.d.LL("sns")).append(", flag ");
        if ((q.zP() & 0x8000) != 0) {
          break label604;
        }
        bool = true;
        label399:
        w.i("MicroMsg.SettingPrivacy", bool);
        if (!this.oJK) {
          break label609;
        }
        ((CheckBoxPreference)localObject).sdM = true;
        this.htU.bc("settings_sns_notify", false);
      }
      label439:
      if (this.oJK)
      {
        localObject = (CheckBoxPreference)this.htU.VG("settings_sns_notify");
        if (localObject != null)
        {
          ((Preference)localObject).wlc = false;
          at.AR();
          this.oJO = bg.a((Boolean)c.xh().get(68384, null), true);
          if (!this.oJO) {
            break label631;
          }
        }
      }
    }
    label536:
    label545:
    label550:
    label555:
    label560:
    label589:
    label599:
    label604:
    label609:
    label631:
    for (((CheckBoxPreference)localObject).sdM = true;; ((CheckBoxPreference)localObject).sdM = false)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(4626753519616L, 34472);
      return;
      bool = false;
      break;
      ((CheckBoxPreference)localObject).sdM = false;
      break label120;
      bool = false;
      break label158;
      bool = false;
      break label173;
      bool = false;
      break label188;
      if (this.oJM)
      {
        ((IconPreference)localObject).setSummary(R.l.dju);
        break label208;
      }
      ((IconPreference)localObject).setSummary(R.l.djs);
      break label208;
      ((IconPreference)localObject).Cm(8);
      break label293;
      bool = false;
      break label342;
      bool = false;
      break label399;
      ((CheckBoxPreference)localObject).sdM = false;
      this.htU.bc("settings_sns_notify", true);
      break label439;
    }
  }
  
  private boolean c(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(4626619301888L, 34471);
    w.d("MicroMsg.SettingPrivacy", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status |= paramInt1;
      if (!paramBoolean) {
        break label113;
      }
    }
    label113:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      this.jqC.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      GMTrace.o(4626619301888L, 34471);
      return true;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }
  
  private boolean sJ(int paramInt)
  {
    GMTrace.i(4626485084160L, 34470);
    if ((this.status & paramInt) != 0)
    {
      GMTrace.o(4626485084160L, 34470);
      return true;
    }
    GMTrace.o(4626485084160L, 34470);
    return false;
  }
  
  protected final void MP()
  {
    boolean bool2 = false;
    GMTrace.i(4626350866432L, 34469);
    oM(R.l.dYr);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4664871354368L, 34756);
        SettingsPrivacyUI.this.aLo();
        SettingsPrivacyUI.this.finish();
        GMTrace.o(4664871354368L, 34756);
        return true;
      }
    });
    w.v("MicroMsg.SettingPrivacy", "init function status: " + Integer.toBinaryString(this.status));
    Object localObject1 = (CheckBoxPreference)this.htU.VG("settings_need_verify");
    ((Preference)localObject1).wlc = false;
    ((CheckBoxPreference)localObject1).sdM = sJ(32);
    at.AR();
    localObject1 = (String)c.xh().get(6, null);
    Object localObject2 = (CheckBoxPreference)this.htU.VG("settings_recommend_mobilefriends_to_me");
    ((Preference)localObject2).wlc = false;
    boolean bool1;
    if ((localObject1 != null) && (((String)localObject1).length() > 0)) {
      if (!sJ(256))
      {
        bool1 = true;
        ((CheckBoxPreference)localObject2).sdM = bool1;
      }
    }
    for (;;)
    {
      localObject1 = (CheckBoxPreference)this.htU.VG("settings_find_google_contact");
      ((Preference)localObject1).wlc = false;
      bool1 = bool2;
      if (!sJ(1048576)) {
        bool1 = true;
      }
      ((CheckBoxPreference)localObject1).sdM = bool1;
      at.AR();
      localObject2 = (String)c.xh().get(208903, null);
      if ((!bg.Jw()) || (TextUtils.isEmpty((CharSequence)localObject2))) {
        this.htU.c((Preference)localObject1);
      }
      at.AR();
      if ((!((Boolean)c.xh().get(335873, Boolean.valueOf(true))).booleanValue()) || (!com.tencent.mm.plugin.sns.b.n.poR.bhQ())) {
        this.htU.bc("edit_timeline_group", true);
      }
      this.htU.bc("settings_unfamiliar_contact", true);
      localObject1 = this.htU.VG("settings_privacy_agreements");
      localObject2 = getString(R.l.dOA);
      Spannable localSpannable = Spannable.Factory.getInstance().newSpannable(getString(R.l.dOB) + (String)localObject2);
      localSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.e.aOm)), localSpannable.length() - ((String)localObject2).length(), localSpannable.length(), 33);
      ((Preference)localObject1).setTitle(localSpannable);
      this.htU.notifyDataSetChanged();
      GMTrace.o(4626350866432L, 34469);
      return;
      bool1 = false;
      break;
      this.htU.c((Preference)localObject2);
    }
  }
  
  public final int QI()
  {
    GMTrace.i(4625277124608L, 34461);
    int i = R.o.dYr;
    GMTrace.o(4625277124608L, 34461);
    return i;
  }
  
  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    GMTrace.i(4625142906880L, 34460);
    paramSharedPreferences = new com.tencent.mm.ui.base.preference.a(this, paramSharedPreferences);
    GMTrace.o(4625142906880L, 34460);
    return paramSharedPreferences;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4625948213248L, 34466);
    String str = paramPreference.hiu;
    w.i("MicroMsg.SettingPrivacy", str + " item has been clicked!");
    boolean bool;
    if (str.equals("settings_need_verify"))
    {
      bool = c(((CheckBoxPreference)paramf.VG("settings_need_verify")).isChecked(), 32, 4);
      GMTrace.o(4625948213248L, 34466);
      return bool;
    }
    if (str.equals("settings_recommend_mobilefriends_to_me"))
    {
      if (!((CheckBoxPreference)paramf.VG("settings_recommend_mobilefriends_to_me")).isChecked()) {}
      for (bool = true;; bool = false)
      {
        bool = c(bool, 256, 7);
        GMTrace.o(4625948213248L, 34466);
        return bool;
      }
    }
    if (str.equals("settings_about_blacklist"))
    {
      paramf = x.gA(getString(R.l.dBp));
      paramPreference = new Intent();
      paramPreference.putExtra("filter_type", paramf.getType());
      paramPreference.putExtra("titile", getString(R.l.eah));
      paramPreference.putExtra("list_attr", 32768);
      com.tencent.mm.plugin.setting.a.hnH.g(this, paramPreference);
      GMTrace.o(4625948213248L, 34466);
      return true;
    }
    if (str.equals("timline_outside_permiss"))
    {
      paramf = new Intent();
      paramf.putExtra("k_sns_tag_id", 4L);
      paramf.putExtra("k_sns_from_settings_about_sns", 1);
      com.tencent.mm.bj.d.b(this, "sns", ".ui.SnsBlackDetailUI", paramf);
    }
    for (;;)
    {
      GMTrace.o(4625948213248L, 34466);
      return false;
      if (str.equals("edit_timeline_group"))
      {
        com.tencent.mm.bj.d.x(this, "sns", ".ui.SnsTagPartlyUI");
      }
      else if (str.equals("timeline_black_permiss"))
      {
        paramf = new Intent();
        paramf.putExtra("k_sns_tag_id", 5L);
        paramf.putExtra("k_sns_from_settings_about_sns", 2);
        paramf.putExtra("k_tag_detail_sns_block_scene", 8);
        com.tencent.mm.bj.d.b(this, "sns", ".ui.SnsTagDetailUI", paramf);
      }
      else if (str.equals("timeline_stranger_show"))
      {
        if (!this.oIb) {}
        for (bool = true;; bool = false)
        {
          this.oIb = bool;
          if (com.tencent.mm.plugin.sns.b.n.poP != null) {
            com.tencent.mm.plugin.sns.b.n.poP.at(this.fJS, this.oIb);
          }
          if (com.tencent.mm.plugin.sns.b.n.poP == null) {
            break;
          }
          paramf = com.tencent.mm.plugin.sns.b.n.poP.au(this.fJS, this.oIb);
          com.tencent.mm.plugin.sns.b.n.poP.a(this.fJS, paramf);
          if (paramf != null) {
            break label504;
          }
          w.e("MicroMsg.SettingPrivacy", "userinfo in null !");
          GMTrace.o(4625948213248L, 34466);
          return false;
        }
        label504:
        w.d("MicroMsg.SettingPrivacy", "dancy userinfo " + paramf.toString());
        at.AR();
        c.yJ().b(new e.a(51, paramf));
      }
      else
      {
        if (str.equals("settings_find_google_contact"))
        {
          if (!((CheckBoxPreference)paramf.VG("settings_find_google_contact")).isChecked()) {}
          for (bool = true;; bool = false)
          {
            c(bool, 1048576, 29);
            GMTrace.o(4625948213248L, 34466);
            return true;
          }
        }
        if (str.equals("settings_add_me_way"))
        {
          startActivity(new Intent(this, SettingsAddMeUI.class));
          GMTrace.o(4625948213248L, 34466);
          return true;
        }
        if (str.equals("timeline_recent_show_select"))
        {
          beG();
        }
        else
        {
          if (str.equals("timeline_open_entrance"))
          {
            label691:
            int i;
            if (!this.oJK)
            {
              bool = true;
              this.oJK = bool;
              paramf = (CheckBoxPreference)paramPreference;
              w.i("MicroMsg.SettingPrivacy", "iSnsOpenEntrance  " + this.oJK + ", checkBox status " + paramf.isChecked());
              i = q.zP();
              if (!this.oJK) {
                break label875;
              }
              i &= 0xFFFF7FFF;
              label757:
              if (!this.oJK) {
                break label884;
              }
              g.ork.i(14098, new Object[] { Integer.valueOf(1) });
            }
            for (;;)
            {
              w.i("MicroMsg.SettingPrivacy", "update pluginFlag to " + i);
              at.AR();
              c.xh().set(34, Integer.valueOf(i));
              at.AR();
              c.yJ().b(new com.tencent.mm.av.n("", "", "", "", "", "", "", "", i, "", ""));
              beH();
              break;
              bool = false;
              break label691;
              label875:
              i |= 0x8000;
              break label757;
              label884:
              g.ork.i(14098, new Object[] { Integer.valueOf(2) });
            }
          }
          if (str.equals("settings_sns_notify"))
          {
            if (!this.oJO)
            {
              bool = true;
              this.oJO = bool;
              if (!this.oJO) {
                break label1002;
              }
              g.ork.i(14098, new Object[] { Integer.valueOf(3) });
            }
            for (;;)
            {
              at.AR();
              c.xh().set(68384, Boolean.valueOf(this.oJO));
              beH();
              GMTrace.o(4625948213248L, 34466);
              return true;
              bool = false;
              break;
              label1002:
              g.ork.i(14098, new Object[] { Integer.valueOf(4) });
            }
          }
          if (str.equals("settings_unfamiliar_contact"))
          {
            startActivity(new Intent(this, UnfamiliarContactUI.class));
          }
          else if (str.equals("settings_privacy_agreements"))
          {
            paramPreference = com.tencent.mm.kernel.h.xy().xh().get(274436, "").toString();
            paramf = paramPreference;
            if (bg.nm(paramPreference)) {
              paramf = v.bPJ();
            }
            paramf = getString(R.l.dGv, new Object[] { v.bPK(), paramf });
            paramPreference = new Intent();
            paramPreference.putExtra("rawUrl", paramf);
            paramPreference.putExtra("showShare", false);
            paramPreference.putExtra("show_bottom", false);
            paramPreference.putExtra("needRedirect", false);
            com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = true;
    GMTrace.i(4625411342336L, 34462);
    super.onCreate(paramBundle);
    this.htU = this.wky;
    this.status = q.zI();
    this.fJS = q.zE();
    at.AR();
    this.oJO = bg.a((Boolean)c.xh().get(68384, null), true);
    this.oJP = getIntent().getIntExtra("enter_scene", e.d.vGG);
    w.d("MicroMsg.SettingPrivacy", "sns Notify " + this.oJO);
    MP();
    g.ork.i(14098, new Object[] { Integer.valueOf(9) });
    if ((this.oJP == e.d.vGH) || (this.oJP == e.d.vGI))
    {
      paramBundle = new bgm();
      if (com.tencent.mm.plugin.sns.b.n.poP != null) {
        paramBundle = com.tencent.mm.plugin.sns.b.n.poP.GI(this.fJS);
      }
      if (paramBundle != null)
      {
        int i = paramBundle.uSi;
        if ((i & 0x200) <= 0) {
          break label247;
        }
        bool1 = true;
        this.oJL = bool1;
        if ((i & 0x400) <= 0) {
          break label252;
        }
        bool1 = true;
        label212:
        this.oJM = bool1;
        if ((i & 0x800) <= 0) {
          break label257;
        }
      }
    }
    label247:
    label252:
    label257:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.oJN = bool1;
      beG();
      GMTrace.o(4625411342336L, 34462);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label212;
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(4625813995520L, 34465);
    super.onDestroy();
    GMTrace.o(4625813995520L, 34465);
  }
  
  public void onPause()
  {
    GMTrace.i(4625679777792L, 34464);
    super.onPause();
    at.AR();
    c.xh().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.jqC.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new uu();
      ((uu)localObject).umY = i;
      ((uu)localObject).umZ = j;
      at.AR();
      c.yJ().b(new e.a(23, (com.tencent.mm.bm.a)localObject));
      w.d("MicroMsg.SettingPrivacy", "switch  " + i + " " + j);
    }
    this.jqC.clear();
    GMTrace.o(4625679777792L, 34464);
  }
  
  protected void onResume()
  {
    GMTrace.i(4625545560064L, 34463);
    super.onResume();
    this.status = q.zI();
    beH();
    if (!this.jNK)
    {
      String str = getIntent().getStringExtra("need_matte_high_light_item");
      if (!bg.nm(str))
      {
        final int i = this.htU.VI(str);
        setSelection(i - 3);
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4599104667648L, 34266);
            View localView = ((com.tencent.mm.ui.base.preference.a)SettingsPrivacyUI.a(SettingsPrivacyUI.this)).a(i, SettingsPrivacyUI.this.mqO);
            if (localView != null) {
              com.tencent.mm.ui.h.a.b(SettingsPrivacyUI.this.vKB.vKW, localView);
            }
            GMTrace.o(4599104667648L, 34266);
          }
        }, 10L);
      }
      this.jNK = true;
    }
    GMTrace.o(4625545560064L, 34463);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsPrivacyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */