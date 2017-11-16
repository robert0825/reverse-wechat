package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.a.o;
import com.tencent.mm.bc.l;
import com.tencent.mm.g.a.aq;
import com.tencent.mm.g.a.aq.a;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.TextPreference;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import java.util.List;
import junit.framework.Assert;
import org.json.JSONException;
import org.json.JSONObject;

@bj(cua={ContactInfoUI.class})
public final class k
  implements com.tencent.mm.ad.e, h.a, com.tencent.mm.pluginsdk.d.a
{
  public String eBO;
  private int eHm;
  public Activity eNu;
  private com.tencent.mm.ui.base.preference.f htU;
  public x iBi;
  com.tencent.mm.storage.q jNF;
  public String jOR;
  private String mfZ;
  private String nLA;
  private boolean nLx;
  private boolean nLy;
  int nLz;
  private int nNb;
  private bgm nNh;
  private boolean nNi;
  private String nNj;
  private int nNk;
  private boolean nNl;
  private boolean nNm;
  private String nNn;
  private boolean nNo;
  private boolean nNp;
  private String nNq;
  private String nNr;
  private int nNs;
  String nNt;
  com.tencent.mm.sdk.b.c<aq> nNu;
  
  public k(Activity paramActivity)
  {
    GMTrace.i(6740280082432L, 50219);
    this.nNh = new bgm();
    this.nNj = "";
    this.eHm = 0;
    this.nNk = -1;
    this.nNl = false;
    this.nNm = false;
    this.nNo = false;
    this.nNp = false;
    this.nNq = null;
    this.nNr = null;
    this.eBO = null;
    this.nNu = new com.tencent.mm.sdk.b.c() {};
    this.eNu = paramActivity;
    GMTrace.o(6740280082432L, 50219);
  }
  
  final void EN(String paramString)
  {
    GMTrace.i(6740548517888L, 50221);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.ContactWidgetNormal", "view stranger remark, username is null");
      GMTrace.o(6740548517888L, 50221);
      return;
    }
    paramString = new Intent();
    paramString.putExtra("Contact_Scene", this.nLz);
    paramString.putExtra("Contact_mode_name_type", 0);
    paramString.putExtra("Contact_ModStrangerRemark", true);
    paramString.putExtra("Contact_User", this.iBi.field_username);
    paramString.putExtra("Contact_Nick", this.iBi.field_nickname);
    paramString.putExtra("Contact_RemarkName", this.iBi.field_conRemark);
    com.tencent.mm.plugin.profile.a.hnH.q(paramString, this.eNu);
    GMTrace.o(6740548517888L, 50221);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6741219606528L, 50226);
    if ((paramk.getType() != 30) && (paramk.getType() != 458))
    {
      w.w("MicroMsg.ContactWidgetNormal", "not expected scene,  type = " + paramk.getType());
      GMTrace.o(6741219606528L, 50226);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramk.getType() == 30)
      {
        paramString = (com.tencent.mm.pluginsdk.model.n)paramk;
        if ((paramString.eHJ != 1) && (paramString.eHJ != 3))
        {
          GMTrace.o(6741219606528L, 50226);
          return;
        }
        if ((paramString.tmZ != null) && (!paramString.tmZ.contains(this.iBi.field_username)))
        {
          GMTrace.o(6741219606528L, 50226);
          return;
        }
        paramString = (NormalUserHeaderPreference)this.htU.VG("contact_info_header_normal");
        paramk = (NormalUserFooterPreference)this.htU.VG("contact_info_footer_normal");
        if ((paramString != null) && (paramk != null) && (paramk.nOs))
        {
          w.d("MicroMsg.ContactWidgetNormal", "happy update remark change");
          this.nNl = false;
          this.nNm = false;
          paramString.aS(this.iBi.field_username, false);
          paramString.aT(this.iBi.field_username, false);
          paramString.ib(this.iBi.field_username);
          this.eNu.getIntent().putExtra("Contact_NeedShowChangeRemarkButton", this.nNl);
          this.eNu.getIntent().putExtra("Contact_NeedShowChangeSnsPreButton", this.nNm);
        }
        GMTrace.o(6741219606528L, 50226);
      }
    }
    else if ((paramInt1 == 4) && (paramInt2 == -24) && (!bg.nm(paramString))) {
      Toast.makeText(this.eNu, paramString, 1).show();
    }
    GMTrace.o(6741219606528L, 50226);
  }
  
  public final void a(boolean paramBoolean1, String paramString, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong)
  {
    GMTrace.i(6741488041984L, 50228);
    GMTrace.o(6741488041984L, 50228);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong)
  {
    GMTrace.i(6741353824256L, 50227);
    paramString = (com.tencent.mm.ui.base.preference.g)this.htU.VG("contact_info_sns");
    if ((paramString != null) && (com.tencent.mm.plugin.sns.b.n.poP != null)) {
      paramString.Py(this.iBi.field_username);
    }
    this.nNh = com.tencent.mm.plugin.sns.b.n.poP.b(this.iBi.field_username, this.nNh);
    this.htU.notifyDataSetChanged();
    if (paramBoolean3)
    {
      w.d("MicroMsg.ContactWidgetNormal", "bg Change!");
      if (com.tencent.mm.plugin.sns.b.n.poT != null) {
        com.tencent.mm.plugin.sns.b.n.poT.GL(this.iBi.field_username);
      }
    }
    GMTrace.o(6741353824256L, 50227);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(6740682735616L, 50222);
    boolean bool;
    label37:
    label49:
    long l;
    label458:
    Object localObject1;
    Object localObject3;
    label666:
    label690:
    final NormalUserHeaderPreference localNormalUserHeaderPreference;
    Object localObject4;
    if (paramx != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bg.nl(paramx.field_username).length() <= 0) {
        break label2110;
      }
      bool = true;
      Assert.assertTrue(bool);
      if (paramf == null) {
        break label2116;
      }
      bool = true;
      Assert.assertTrue(bool);
      this.htU = paramf;
      this.iBi = paramx;
      this.nLx = paramBoolean;
      this.nLz = paramInt;
      this.nLy = this.eNu.getIntent().getBooleanExtra("User_Verify", false);
      this.nLA = bg.nl(this.eNu.getIntent().getStringExtra("Verify_ticket"));
      this.nNi = this.eNu.getIntent().getBooleanExtra("Contact_IsLBSFriend", false);
      this.nNb = this.eNu.getIntent().getIntExtra("Kdel_from", -1);
      this.nNj = this.eNu.getIntent().getStringExtra("Contact_RemarkName");
      this.eHm = this.eNu.getIntent().getIntExtra("Sns_from_Scene", 0);
      this.nNl = this.eNu.getIntent().getBooleanExtra("Contact_NeedShowChangeRemarkButton", false);
      this.nNm = this.eNu.getIntent().getBooleanExtra("Contact_NeedShowChangeSnsPreButton", false);
      this.nNk = this.eNu.getIntent().getIntExtra("Contact_KSnsIFlag", -1);
      l = this.eNu.getIntent().getLongExtra("Contact_KSnsBgId", -1L);
      paramf = bg.aq(this.eNu.getIntent().getStringExtra("Contact_KSnsBgUrl"), "");
      this.mfZ = bg.aq(this.eNu.getIntent().getStringExtra("verify_gmail"), "");
      this.nNn = bg.aq(this.eNu.getIntent().getStringExtra("profileName"), bg.SI(this.mfZ));
      this.nNh.gCI = this.nNk;
      this.nNh.gCK = l;
      this.nNh.gCJ = paramf;
      this.nNq = this.eNu.getIntent().getStringExtra("KLinkedInAddFriendNickName");
      this.nNr = this.eNu.getIntent().getStringExtra("KLinkedInAddFriendPubUrl");
      if (com.tencent.mm.plugin.sns.b.n.poP != null) {
        this.nNh = com.tencent.mm.plugin.sns.b.n.poP.b(paramx.field_username, this.nNh);
      }
      this.jOR = this.eNu.getIntent().getStringExtra("room_name");
      at.AR();
      this.jNF = com.tencent.mm.y.c.yT().gC(this.jOR);
      if (paramx.field_deleteFlag != 1) {
        break label2122;
      }
      paramBoolean = true;
      this.nNp = paramBoolean;
      ahL();
      this.htU.removeAll();
      this.htU.addPreferencesFromResource(R.o.eoD);
      if (com.tencent.mm.plugin.sns.b.n.poT != null) {
        com.tencent.mm.plugin.sns.b.n.poT.a(3, this.iBi.field_username, this);
      }
      at.wS().a(30, this);
      this.nNt = "";
      w.i("MicroMsg.ContactWidgetNormal", "isCancelMatchPhoneMD5 %s", new Object[] { this.iBi.vg() });
      if (!this.iBi.vg())
      {
        paramf = null;
        localObject1 = this.eNu.getIntent().getStringExtra("Contact_Mobile_MD5");
        localObject3 = this.eNu.getIntent().getStringExtra("Contact_full_Mobile_MD5");
        if ((!bg.nm((String)localObject1)) || (!bg.nm((String)localObject3))) {
          break label2134;
        }
        if (!bg.nm(this.iBi.field_username))
        {
          localObject1 = com.tencent.mm.modelfriend.af.If().jJ(this.iBi.field_username);
          localObject3 = this.iBi.field_username;
          if (localObject1 != null) {
            break label2127;
          }
          paramf = "true";
          w.i("MicroMsg.ContactWidgetNormal", "Contact name: %s AddrUpload IS NULL? %s", new Object[] { localObject3, paramf });
          paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
        }
        if ((paramf != null) && (!bg.nm(paramf.GS())))
        {
          this.nNt = bg.nl(paramf.Ha()).replace(" ", "");
          w.i("MicroMsg.ContactWidgetNormal", "Contact name: %s mMobileByMD5: %s", new Object[] { this.iBi.field_username, this.nNt });
        }
      }
      localNormalUserHeaderPreference = (NormalUserHeaderPreference)this.htU.VG("contact_info_header_normal");
      if (localNormalUserHeaderPreference == null) {
        break label2271;
      }
      paramf = this.iBi;
      paramInt = this.nLz;
      localObject1 = this.nLA;
      localObject3 = this.nNt;
      localObject4 = this.iBi.fjz;
      localNormalUserHeaderPreference.tuh = ((String)localObject3);
      localNormalUserHeaderPreference.tui = ((String)localObject4);
      localNormalUserHeaderPreference.a(paramf, paramInt, (String)localObject1);
      localNormalUserHeaderPreference.aS(this.iBi.field_username, this.nNl);
      localNormalUserHeaderPreference.tDt = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6746454097920L, 50265);
          paramAnonymousView = k.this;
          if (paramAnonymousView.iBi == null)
          {
            w.e("MicroMsg.ContactWidgetNormal", "contact is null");
            GMTrace.o(6746454097920L, 50265);
            return;
          }
          if (!com.tencent.mm.l.a.eE(paramAnonymousView.iBi.field_type))
          {
            if (!bg.nm(paramAnonymousView.iBi.field_encryptUsername))
            {
              paramAnonymousView.EN(paramAnonymousView.iBi.field_encryptUsername);
              GMTrace.o(6746454097920L, 50265);
              return;
            }
            paramAnonymousView.EN(paramAnonymousView.iBi.field_username);
            GMTrace.o(6746454097920L, 50265);
            return;
          }
          Intent localIntent = new Intent();
          localIntent.putExtra("Contact_Scene", paramAnonymousView.nLz);
          localIntent.putExtra("Contact_User", paramAnonymousView.iBi.field_username);
          localIntent.putExtra("Contact_RoomNickname", paramAnonymousView.eNu.getIntent().getStringExtra("Contact_RoomNickname"));
          localIntent.putExtra("view_mode", true);
          localIntent.putExtra("contact_phone_number_by_md5", paramAnonymousView.nNt);
          localIntent.putExtra("contact_phone_number_list", paramAnonymousView.iBi.fjz);
          com.tencent.mm.plugin.profile.a.hnH.p(localIntent, paramAnonymousView.eNu);
          GMTrace.o(6746454097920L, 50265);
        }
      };
      if (com.tencent.mm.l.a.eE(this.iBi.field_type)) {
        this.nNm = false;
      }
      localNormalUserHeaderPreference.aT(this.iBi.field_username, this.nNm);
      label892:
      if (bg.nm(this.iBi.getProvince())) {
        break label2313;
      }
      localObject1 = (KeyValuePreference)this.htU.VG("contact_info_district");
      if (localObject1 != null)
      {
        ((KeyValuePreference)localObject1).setTitle(this.eNu.getString(R.l.djh));
        localObject3 = new StringBuilder().append(r.fu(this.iBi.getProvince()));
        if (!bg.nm(this.iBi.getCity())) {
          break label2286;
        }
        paramf = "";
        label980:
        ((KeyValuePreference)localObject1).setSummary(paramf);
        ((KeyValuePreference)localObject1).lP(false);
        ((KeyValuePreference)localObject1).setEnabled(false);
      }
      label1006:
      if ((this.iBi.signature == null) || (this.iBi.signature.trim().equals("")) || (com.tencent.mm.l.a.eE(this.iBi.field_type))) {
        break label2329;
      }
      paramf = (KeyValuePreference)this.htU.VG("contact_info_signature");
      if (paramf != null)
      {
        paramf.wko = false;
        paramf.setTitle(this.eNu.getString(R.l.dkO));
        paramf.setSummary(com.tencent.mm.pluginsdk.ui.d.h.a(this.eNu, this.iBi.signature));
        paramf.lP(false);
      }
      label1109:
      this.htU.VG("contact_info_facebook");
      this.htU.VH("contact_info_facebook");
      if ((this.nNh.gCI & 0x1) <= 0) {
        break label2345;
      }
      paramInt = 1;
      label1150:
      if (((paramInt & com.tencent.mm.bj.d.LL("sns")) == 0) || (x.Tp(this.iBi.field_username)) || (this.iBi.uZ())) {
        break label2351;
      }
      paramf = (com.tencent.mm.ui.base.preference.g)this.htU.VG("contact_info_sns");
      if ((paramf != null) && (com.tencent.mm.plugin.sns.b.n.poP != null)) {
        paramf.Py(this.iBi.field_username);
      }
      label1224:
      this.htU.VH("contact_info_verifyuser");
      if (this.nLz == 34) {
        this.htU.VH("contact_info_footer_normal");
      }
      if (!com.tencent.mm.l.a.eE(this.iBi.field_type)) {
        break label2482;
      }
      localObject1 = new int[7];
      localObject3 = (ContactMoreInfoPreference)this.htU.VG("contact_info_more");
      if (localObject3 != null)
      {
        l = this.eNu.getIntent().getLongExtra("Contact_Uin", 0L);
        if ((l == -1L) || (new o(l).longValue() <= 0L)) {
          break label2367;
        }
        ((ContactMoreInfoPreference)localObject3).sD(0);
        localObject1[0] = 0;
        label1352:
        if ((bg.nm(this.mfZ)) || (bg.nm(this.nNn))) {
          break label2383;
        }
        ((ContactMoreInfoPreference)localObject3).sF(0);
        localObject1[1] = 0;
        label1383:
        paramf = com.tencent.mm.k.g.ut().getValue("LinkedinPluginClose");
        if ((!bg.nm(paramf)) && (Integer.valueOf(paramf).intValue() != 0)) {
          break label2399;
        }
        paramInt = 1;
        label1413:
        if ((paramInt == 0) || (bg.nm(this.iBi.fjv))) {
          break label2405;
        }
        ((ContactMoreInfoPreference)localObject3).sE(0);
        localObject1[2] = 0;
        label1442:
        if (!com.tencent.mm.y.q.zE().equals(this.iBi.field_username)) {
          break label2421;
        }
        at.AR();
        paramf = (String)com.tencent.mm.y.c.xh().get(w.a.vsB, null);
        label1476:
        if (bg.nm(paramf)) {
          break label2445;
        }
      }
    }
    label1695:
    label1743:
    label1911:
    label2047:
    label2110:
    label2116:
    label2122:
    label2127:
    label2134:
    label2271:
    label2286:
    label2313:
    label2329:
    label2345:
    label2351:
    label2367:
    label2383:
    label2399:
    label2405:
    label2421:
    label2445:
    label2450:
    label2466:
    label2474:
    label2482:
    label2525:
    label2665:
    label2696:
    label2726:
    label2755:
    label2895:
    label2905:
    label2915:
    label2925:
    label2931:
    label2941:
    label2984:
    do
    {
      do
      {
        for (;;)
        {
          try
          {
            paramf = new JSONObject(paramf).optString("ShopUrl");
            if (bg.nm(paramf)) {
              break label2450;
            }
            ((ContactMoreInfoPreference)localObject3).sG(0);
            localObject1[3] = 0;
            if (!bg.nm(this.iBi.signature)) {
              break label2466;
            }
            localObject1[4] = 8;
            if (this.iBi.getSource() > 0) {
              break label2474;
            }
            localObject1[5] = 8;
            localObject1[6] = 8;
            this.htU.bc("contact_info_more", false);
            this.htU.VH("contact_info_social");
            if (!com.tencent.mm.l.a.eE(this.iBi.field_type)) {
              break label2984;
            }
            this.htU.VH("contact_info_source");
            this.htU.bc("contact_info_invite_source", true);
            bool = this.eNu.getIntent().getBooleanExtra("Is_RoomOwner", false);
            if ((this.nLz == 14) && (bool) && (this.jNF != null) && (!this.iBi.field_username.equals(this.jNF.field_roomowner))) {
              break label4499;
            }
            paramInt = this.nLz;
            if (this.jNF != null) {
              break label4494;
            }
            paramBoolean = true;
            w.i("MicroMsg.ContactWidgetNormal", "[initInviteSource] addContactScene:%s isOwner:%s null == member:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
            this.htU.bc("contact_info_invite_source", true);
            paramf = (NormalUserFooterPreference)this.htU.VG("contact_info_footer_normal");
            paramBoolean = this.eNu.getIntent().getBooleanExtra("User_From_Fmessage", false);
            bool = this.eNu.getIntent().getBooleanExtra("Contact_FMessageCard", false);
            this.eNu.getIntent().getBooleanExtra("Contact_KHideExpose", false);
            l = this.eNu.getIntent().getLongExtra("Contact_Uin", -1L);
            if (this.nLz == 30) {
              this.nNi = false;
            }
            if ((paramf == null) || (!paramf.a(this.iBi, this.nLA, this.nLx, this.nLy, this.nNi, this.nLz, this.nNb, bool, paramBoolean, l, this.nNj))) {
              break label4745;
            }
            paramf.gsv.removeAll();
            paramf.gsv.a(new NormalUserFooterPreference.e()
            {
              public final void al(String paramAnonymousString, boolean paramAnonymousBoolean)
              {
                GMTrace.i(6730884841472L, 50149);
                localNormalUserHeaderPreference.aS(paramAnonymousString, paramAnonymousBoolean);
                localNormalUserHeaderPreference.ib(k.this.iBi.field_username);
                GMTrace.o(6730884841472L, 50149);
              }
            }, Looper.getMainLooper());
            paramInt = this.iBi.fjn;
            this.htU.VH("clear_lbs_info");
            if (this.nNp)
            {
              this.htU.removeAll();
              if (localNormalUserHeaderPreference != null) {
                this.htU.a(localNormalUserHeaderPreference);
              }
              if (paramf != null) {
                this.htU.a(paramf);
              }
            }
            at.AR();
            com.tencent.mm.y.c.yK().TA(paramx.field_username);
            paramBoolean = com.tencent.mm.y.q.zE().equals(paramx.field_username);
            w.v("MicroMsg.ContactWidgetNormal", "get from extinfo %s", new Object[] { Integer.valueOf(this.nNh.gCI) });
            if ((this.nNh.gCI & 0x1) <= 0) {
              break label4760;
            }
            paramInt = 1;
            if ((!paramx.uZ()) && (!x.Tp(paramx.field_username)) && (paramInt != 0) && (com.tencent.mm.plugin.sns.b.n.poT != null)) {
              com.tencent.mm.plugin.sns.b.n.poT.a(2, paramx.field_username, paramBoolean, this.eHm);
            }
            GMTrace.o(6740682735616L, 50222);
            return true;
          }
          catch (JSONException paramf)
          {
            w.printErrStackTrace("MicroMsg.ContactWidgetNormal", paramf, "", new Object[0]);
          }
          bool = false;
          break;
          bool = false;
          break label37;
          bool = false;
          break label49;
          paramBoolean = false;
          break label458;
          paramf = "false";
          break label666;
          if ((bg.nm((String)localObject1)) && (bg.nm((String)localObject3))) {
            break label690;
          }
          w.i("MicroMsg.ContactWidgetNormal", "Contact name: %s mMobileByMD5: %s mobileFullMD5:%s", new Object[] { this.iBi.field_username, localObject1, localObject3 });
          localObject1 = com.tencent.mm.modelfriend.af.If().jK((String)localObject1);
          if (localObject1 != null)
          {
            paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
            if (!bg.nm(((com.tencent.mm.modelfriend.b)localObject1).GS())) {}
          }
          else
          {
            paramf = com.tencent.mm.modelfriend.af.If().jK((String)localObject3);
          }
          localObject3 = this.iBi.field_username;
          if (paramf == null)
          {
            localObject1 = "true";
            w.i("MicroMsg.ContactWidgetNormal", "Contact name: %s AddrUpload IS NULL? %s", new Object[] { localObject3, localObject1 });
            break label690;
          }
          localObject1 = "false";
          continue;
          this.htU.c(localNormalUserHeaderPreference);
          break label892;
          paramf = "  " + this.iBi.getCity();
          break label980;
          this.htU.VH("contact_info_district");
          break label1006;
          this.htU.VH("contact_info_signature");
          break label1109;
          paramInt = 0;
          break label1150;
          this.htU.VH("contact_info_sns");
          break label1224;
          ((ContactMoreInfoPreference)localObject3).sD(8);
          localObject1[0] = 8;
          break label1352;
          ((ContactMoreInfoPreference)localObject3).sF(8);
          localObject1[1] = 8;
          break label1383;
          paramInt = 0;
          break label1413;
          ((ContactMoreInfoPreference)localObject3).sE(8);
          localObject1[2] = 8;
          break label1442;
          paramf = this.iBi.fjy;
          break label1476;
          paramf = null;
          continue;
          ((ContactMoreInfoPreference)localObject3).sG(8);
          localObject1[3] = 8;
          continue;
          localObject1[4] = 0;
          continue;
          localObject1[5] = 0;
          continue;
          localObject4 = (ContactSocialInfoPreference)this.htU.VG("contact_info_social");
          if (localObject4 != null)
          {
            if (bg.nm(this.nNt)) {
              break label2895;
            }
            ((ContactSocialInfoPreference)localObject4).sH(0);
            this.nNs = 1;
            at.AR();
            paramInt = bg.e((Integer)com.tencent.mm.y.c.xh().get(9, null));
            l = this.eNu.getIntent().getLongExtra("Contact_Uin", 0L);
            paramf = this.eNu.getIntent().getStringExtra("Contact_QQNick");
            if ((l != 0L) && (paramInt != 0))
            {
              if ((paramf == null) || (paramf.length() == 0))
              {
                localObject1 = com.tencent.mm.modelfriend.af.Ik().am(l);
                paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
                if (localObject1 == null) {
                  paramf = null;
                }
                if (paramf != null) {
                  paramf.getDisplayName();
                }
              }
              if ((l == -1L) || (new o(l).longValue() <= 0L)) {
                break label2905;
              }
              ((ContactSocialInfoPreference)localObject4).sD(0);
              this.nNs = 1;
            }
            if ((bg.nm(this.mfZ)) || (bg.nm(this.nNn))) {
              break label2915;
            }
            ((ContactSocialInfoPreference)localObject4).sF(0);
            this.nNs = 1;
            paramf = com.tencent.mm.k.g.ut().getValue("LinkedinPluginClose");
            if ((!bg.nm(paramf)) && (Integer.valueOf(paramf).intValue() != 0)) {
              break label2925;
            }
            paramInt = 1;
            if ((paramInt == 0) || (bg.nm(this.iBi.fjv))) {
              break label2931;
            }
            ((ContactSocialInfoPreference)localObject4).sE(0);
            this.nNs = 1;
            if (!com.tencent.mm.y.q.zE().equals(this.iBi.field_username)) {
              break label2941;
            }
            at.AR();
            paramf = (String)com.tencent.mm.y.c.xh().get(w.a.vsB, null);
            localObject3 = null;
            localObject1 = localObject3;
            if (bg.nm(paramf)) {}
          }
          try
          {
            localObject1 = new JSONObject(paramf).optString("ShopUrl");
            w.i("MicroMsg.ContactWidgetNormal", "weiShopInfo:%s, shopUrl:%s", new Object[] { paramf, localObject1 });
            if (!bg.nm((String)localObject1))
            {
              ((ContactSocialInfoPreference)localObject4).sG(0);
              this.nNs = 1;
              if (this.nNs == 0) {
                this.htU.VH("contact_info_social");
              }
              this.htU.VH("contact_info_more");
              continue;
              ((ContactSocialInfoPreference)localObject4).sH(8);
              break label2525;
              ((ContactSocialInfoPreference)localObject4).sD(8);
              break label2665;
              ((ContactSocialInfoPreference)localObject4).sF(8);
              break label2696;
              paramInt = 0;
              break label2726;
              ((ContactSocialInfoPreference)localObject4).sE(8);
              break label2755;
              paramf = this.iBi.fjy;
            }
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.ContactWidgetNormal", localJSONException, "", new Object[0]);
              localObject2 = localObject3;
              continue;
              ((ContactSocialInfoPreference)localObject4).sG(8);
            }
          }
          paramInt = this.eNu.getIntent().getIntExtra("Contact_Source_FMessage", 0);
          w.d("MicroMsg.ContactWidgetNormal", "initFriendSource, contact source = " + this.iBi.getSource() + ", sourceFMessage = " + paramInt);
          if (paramInt == 0) {
            break label4012;
          }
          localObject3 = (KeyValuePreference)this.htU.VG("contact_info_source");
          if (!this.nLy)
          {
            if (localObject3 != null) {
              if (paramInt == 10)
              {
                ((KeyValuePreference)localObject3).wko = false;
                ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
                ((KeyValuePreference)localObject3).setSummary(this.eNu.getString(R.l.dwh));
                ((KeyValuePreference)localObject3).lP(false);
              }
              else
              {
                this.htU.c((Preference)localObject3);
              }
            }
          }
          else {
            switch (paramInt)
            {
            default: 
              this.htU.c((Preference)localObject3);
              break;
            case 1: 
              if (localObject3 != null)
              {
                ((KeyValuePreference)localObject3).wko = false;
                ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
                ((KeyValuePreference)localObject3).setSummary(R.l.dlk);
                ((KeyValuePreference)localObject3).lP(false);
              }
              break;
            case 3: 
              if (localObject3 != null)
              {
                ((KeyValuePreference)localObject3).wko = false;
                ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
                ((KeyValuePreference)localObject3).setSummary(R.l.dlm);
                ((KeyValuePreference)localObject3).lP(false);
              }
              break;
            }
          }
        }
      } while (localObject3 == null);
      ((KeyValuePreference)localObject3).wko = false;
      ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
      localObject2 = r.fs(this.eNu.getIntent().getStringExtra("source_from_user_name"));
      paramf = (com.tencent.mm.ui.base.preference.f)localObject2;
      if (bg.nm((String)localObject2)) {
        paramf = this.eNu.getIntent().getStringExtra("source_from_nick_name");
      }
      if (bg.nm(paramf)) {
        ((KeyValuePreference)localObject3).setSummary(R.l.dkX);
      }
      for (;;)
      {
        ((KeyValuePreference)localObject3).lP(false);
        break;
        ((KeyValuePreference)localObject3).setSummary(com.tencent.mm.pluginsdk.ui.d.h.a(this.eNu, this.eNu.getString(R.l.dkW, new Object[] { paramf })));
      }
    } while (localObject3 == null);
    ((KeyValuePreference)localObject3).wko = false;
    ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
    paramf = l.MK().lO(this.iBi.field_username);
    at.AR();
    Object localObject2 = com.tencent.mm.y.c.yK();
    if (paramf == null)
    {
      paramf = "";
      label3571:
      paramf = ((ar)localObject2).TE(paramf);
      if (paramf == null) {
        break label4766;
      }
    }
    label4012:
    label4494:
    label4499:
    label4658:
    label4671:
    label4745:
    label4760:
    label4766:
    for (paramf = paramf.field_nickname;; paramf = null)
    {
      if (!bg.nm(paramf)) {
        ((KeyValuePreference)localObject3).setSummary(this.eNu.getString(R.l.dla, new Object[] { paramf }));
      }
      for (;;)
      {
        ((KeyValuePreference)localObject3).lP(false);
        break;
        paramf = paramf.field_chatroomName;
        break label3571;
        ((KeyValuePreference)localObject3).setSummary(R.l.dkZ);
      }
      if (localObject3 == null) {
        break;
      }
      ((KeyValuePreference)localObject3).wko = false;
      ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
      ((KeyValuePreference)localObject3).setSummary(this.eNu.getString(R.l.dwi));
      ((KeyValuePreference)localObject3).lP(false);
      break;
      if (localObject3 == null) {
        break;
      }
      ((KeyValuePreference)localObject3).wko = false;
      ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
      ((KeyValuePreference)localObject3).setSummary(R.l.dlq);
      ((KeyValuePreference)localObject3).lP(false);
      break;
      if (localObject3 == null) {
        break;
      }
      ((KeyValuePreference)localObject3).wko = false;
      ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
      ((KeyValuePreference)localObject3).setSummary(R.l.dkU);
      ((KeyValuePreference)localObject3).lP(false);
      break;
      if (localObject3 == null) {
        break;
      }
      ((KeyValuePreference)localObject3).wko = false;
      ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
      ((KeyValuePreference)localObject3).setSummary(R.l.dlf);
      ((KeyValuePreference)localObject3).lP(false);
      break;
      if (localObject3 == null) {
        break;
      }
      ((KeyValuePreference)localObject3).wko = false;
      ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
      ((KeyValuePreference)localObject3).setSummary(this.eNu.getString(R.l.dAZ));
      ((KeyValuePreference)localObject3).lP(false);
      break;
      if (localObject3 == null) {
        break;
      }
      ((KeyValuePreference)localObject3).wko = false;
      ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
      ((KeyValuePreference)localObject3).setSummary(this.eNu.getString(R.l.dlg));
      ((KeyValuePreference)localObject3).lP(false);
      break;
      if (localObject3 == null) {
        break;
      }
      ((KeyValuePreference)localObject3).wko = false;
      ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
      ((KeyValuePreference)localObject3).setSummary(R.l.dli);
      ((KeyValuePreference)localObject3).lP(false);
      break;
      if (localObject3 == null) {
        break;
      }
      ((KeyValuePreference)localObject3).wko = false;
      ((KeyValuePreference)localObject3).setTitle(this.eNu.getString(R.l.dlr));
      ((KeyValuePreference)localObject3).setSummary(R.l.dlc);
      ((KeyValuePreference)localObject3).lP(false);
      break;
      paramf = (KeyValuePreference)this.htU.VG("contact_info_source");
      if (this.nLy) {
        switch (this.iBi.getSource())
        {
        default: 
          this.htU.c(paramf);
          break;
        case 18: 
          if (paramf == null) {
            break;
          }
          paramf.wko = false;
          paramf.setTitle(this.eNu.getString(R.l.dlr));
          paramf.setSummary(R.l.dlc);
          paramf.lP(false);
          break;
        case 30: 
          if (paramf == null) {
            break;
          }
          paramf.wko = false;
          paramf.setTitle(this.eNu.getString(R.l.dlr));
          paramf.setSummary(R.l.dlf);
          paramf.lP(false);
          break;
        case 48: 
          if (paramf == null) {
            break;
          }
          paramf.wko = false;
          paramf.setTitle(this.eNu.getString(R.l.dlr));
          paramf.setSummary(this.eNu.getString(R.l.dlg));
          paramf.lP(false);
          break;
        case 22: 
        case 23: 
        case 24: 
        case 26: 
        case 27: 
        case 28: 
        case 29: 
          if (paramf == null) {
            break;
          }
          paramf.wko = false;
          paramf.setTitle(this.eNu.getString(R.l.dlr));
          paramf.setSummary(R.l.dlo);
          paramf.lP(false);
          break;
        case 34: 
          if (paramf == null) {
            break;
          }
          paramf.wko = false;
          paramf.setTitle(this.eNu.getString(R.l.dlr));
          paramf.setSummary(this.eNu.getString(R.l.dkS));
          paramf.lP(false);
          break;
        case 58: 
        case 59: 
        case 60: 
          if (paramf == null) {
            break;
          }
          paramf.wko = false;
          paramf.setTitle(this.eNu.getString(R.l.dlr));
          paramf.setSummary(this.eNu.getString(R.l.dAZ));
          paramf.lP(false);
          break;
        case 76: 
          if (paramf == null) {
            break;
          }
          paramf.wko = false;
          paramf.setTitle(this.eNu.getString(R.l.dlr));
          paramf.setSummary(this.eNu.getString(R.l.dld));
          paramf.lP(false);
          break;
        }
      }
      this.htU.c(paramf);
      break;
      paramBoolean = false;
      break label1695;
      this.eBO = this.eNu.getIntent().getStringExtra("inviteer");
      if (bg.nm(this.eBO))
      {
        paramf = this.jNF.Tk(this.iBi.field_username);
        if (paramf != null) {
          break label4658;
        }
      }
      for (paramf = "";; paramf = bg.aq(paramf.fMB, ""))
      {
        this.eBO = paramf;
        if (bg.nm(this.eBO)) {
          this.eBO = com.tencent.mm.y.m.D(this.iBi.field_username, this.jOR);
        }
        if (!bg.nm(this.eBO)) {
          break label4671;
        }
        w.w("MicroMsg.ContactWidgetNormal", "mRoomId:%s member:%s , inviteer is null!", new Object[] { this.jOR, this.iBi.field_username });
        this.nNu.bPu();
        ak.a.gmX.a(this.iBi.field_username, this.jOR, new ak.b.a()
        {
          public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(17437835657216L, 129922);
            w.i("MicroMsg.ContactWidgetNormal", "username:%s mRoomId:%s succ:%s", new Object[] { paramAnonymousString, k.this.jOR, Boolean.valueOf(paramAnonymousBoolean) });
            k.this.nNu.dead();
            GMTrace.o(17437835657216L, 129922);
          }
        });
        break;
      }
      this.eNu.getIntent().putExtra("inviteer", this.eBO);
      paramf = fs(this.eBO);
      if (bg.nm(paramf))
      {
        ak.a.gmX.a(this.iBi.field_username, "", new ak.b.a()
        {
          public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(17438372528128L, 129926);
            w.i("MicroMsg.ContactWidgetNormal", "username:%s mRoomId:%s succ:%s", new Object[] { paramAnonymousString, k.this.jOR, Boolean.valueOf(paramAnonymousBoolean) });
            if (paramAnonymousBoolean)
            {
              at.AR();
              paramAnonymousString = com.tencent.mm.y.c.yK().TE(paramAnonymousString).vj();
              k.this.dk(k.this.eBO, paramAnonymousString);
            }
            GMTrace.o(17438372528128L, 129926);
          }
        });
        break label1743;
      }
      dk(this.eBO, paramf);
      break label1743;
      this.htU.VH("contact_info_footer_normal");
      break label1911;
      paramInt = 0;
      break label2047;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6740951171072L, 50224);
    if (com.tencent.mm.plugin.sns.b.n.poT != null) {
      com.tencent.mm.plugin.sns.b.n.poT.a(this, 3);
    }
    at.wS().b(30, this);
    Object localObject = (NormalUserHeaderPreference)this.htU.VG("contact_info_header_normal");
    if (localObject != null) {
      ((NormalUserHeaderPreference)localObject).onDetach();
    }
    localObject = (NormalUserFooterPreference)this.htU.VG("contact_info_footer_normal");
    if (localObject != null) {
      ((NormalUserFooterPreference)localObject).ahL();
    }
    localObject = (FriendPreference)this.htU.VG("contact_info_friend_qq");
    if (localObject != null) {
      ((FriendPreference)localObject).ahL();
    }
    localObject = (FriendPreference)this.htU.VG("contact_info_friend_mobile");
    if (localObject != null) {
      ((FriendPreference)localObject).ahL();
    }
    localObject = (FriendPreference)this.htU.VG("contact_info_facebook");
    if (localObject != null) {
      ((FriendPreference)localObject).ahL();
    }
    this.htU.VG("contact_info_sns");
    GMTrace.o(6740951171072L, 50224);
    return true;
  }
  
  public final void dk(String paramString1, String paramString2)
  {
    GMTrace.i(17437164568576L, 129917);
    w.i("MicroMsg.ContactWidgetNormal", "[showInviteerView] inviteer:%s inviteerDisplayName:%s", new Object[] { paramString1, paramString2 });
    KeyValuePreference localKeyValuePreference = (KeyValuePreference)this.htU.VG("contact_info_invite_source");
    TextPreference localTextPreference = (TextPreference)this.htU.VG("contact_info_hint");
    this.htU.bc("contact_info_invite_source", false);
    SpannableString localSpannableString = new SpannableString(com.tencent.mm.pluginsdk.ui.d.h.a(this.eNu, this.eNu.getResources().getString(R.l.djA, new Object[] { paramString2 })));
    localSpannableString.setSpan(new ForegroundColorSpan(this.eNu.getResources().getColor(R.e.aNQ)), 0, paramString2.length(), 33);
    localKeyValuePreference.setSummary(localSpannableString);
    localKeyValuePreference.getExtras().putString("inviteer", paramString1);
    this.eNu.getIntent().putExtra("inviteer", paramString1);
    if ((this.jNF != null) && (!this.jNF.FT().contains(this.iBi.field_username)))
    {
      this.htU.bc("contact_info_footer_normal", true);
      localTextPreference.R(com.tencent.mm.pluginsdk.ui.d.h.a(this.eNu, this.eNu.getResources().getString(R.l.dkf, new Object[] { fs(this.iBi.field_username) })));
      GMTrace.o(17437164568576L, 129917);
      return;
    }
    this.htU.bc("contact_info_footer_normal", false);
    GMTrace.o(17437164568576L, 129917);
  }
  
  public final String fs(String paramString)
  {
    Object localObject2 = null;
    GMTrace.i(17437298786304L, 129918);
    if (this.jNF == null)
    {
      GMTrace.o(17437298786304L, 129918);
      return null;
    }
    at.AR();
    x localx = com.tencent.mm.y.c.yK().TE(paramString);
    Object localObject1 = localObject2;
    if (localx != null)
    {
      localObject1 = localObject2;
      if ((int)localx.fTq > 0) {
        localObject1 = localx.field_conRemark;
      }
    }
    localObject2 = localObject1;
    if (bg.nm((String)localObject1)) {
      localObject2 = this.jNF.fs(paramString);
    }
    paramString = (String)localObject2;
    if (bg.nm((String)localObject2))
    {
      paramString = (String)localObject2;
      if (localx != null) {
        paramString = localx.vj();
      }
    }
    GMTrace.o(17437298786304L, 129918);
    return paramString;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6741085388800L, 50225);
    switch (paramInt1)
    {
    default: 
      GMTrace.o(6741085388800L, 50225);
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
      com.tencent.mm.ui.snackbar.a.e(this.eNu, this.eNu.getString(R.l.dwg));
      GMTrace.o(6741085388800L, 50225);
      return;
    }
    GMTrace.o(6741085388800L, 50225);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6740414300160L, 50220);
    Object localObject2;
    Object localObject1;
    long l;
    if (paramString.equals("contact_info_sns"))
    {
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        u.fo(this.eNu);
        GMTrace.o(6740414300160L, 50220);
        return true;
      }
      localObject2 = this.eNu.getIntent();
      ((Intent)localObject2).putExtra("sns_source", this.eHm);
      ((Intent)localObject2).putExtra("sns_signature", this.iBi.signature);
      ((Intent)localObject2).putExtra("sns_nickName", this.iBi.vj());
      ((Intent)localObject2).putExtra("sns_title", this.iBi.vk());
      localObject1 = localObject2;
      if (com.tencent.mm.plugin.sns.b.n.poT != null) {
        localObject1 = com.tencent.mm.plugin.sns.b.n.poT.f((Intent)localObject2, this.iBi.field_username);
      }
      if (localObject1 == null) {
        ((MMActivity)this.eNu).finish();
      }
    }
    else
    {
      if (!paramString.equals("contact_info_more")) {
        break label439;
      }
      localObject2 = new Intent();
      ((Intent)localObject2).setClass(this.eNu, ContactMoreInfoUI.class);
      ((Intent)localObject2).putExtra("Is_RoomOwner", this.eNu.getIntent().getBooleanExtra("Is_RoomOwner", false));
      ((Intent)localObject2).putExtra("Contact_User", this.iBi.field_username);
      ((Intent)localObject2).putExtra("KLinkedInAddFriendNickName", this.nNq);
      ((Intent)localObject2).putExtra("KLinkedInAddFriendPubUrl", this.nNr);
      localObject1 = this.eNu.getIntent().getStringExtra("room_name");
      paramString = (String)localObject1;
      if (localObject1 == null) {
        paramString = this.eNu.getIntent().getStringExtra("Contact_ChatRoomId");
      }
      ((Intent)localObject2).putExtra("Contact_ChatRoomId", paramString);
      ((Intent)localObject2).putExtra("verify_gmail", this.mfZ);
      ((Intent)localObject2).putExtra("profileName", this.nNn);
      l = this.eNu.getIntent().getLongExtra("Contact_Uin", 0L);
      paramString = this.eNu.getIntent().getStringExtra("Contact_QQNick");
      ((Intent)localObject2).putExtra("Contact_Uin", l);
      ((Intent)localObject2).putExtra("Contact_QQNick", paramString);
      this.eNu.startActivity((Intent)localObject2);
    }
    for (;;)
    {
      GMTrace.o(6740414300160L, 50220);
      return true;
      com.tencent.mm.bj.d.b(this.eNu, "sns", ".ui.SnsUserUI", (Intent)localObject1);
      if ((((Intent)localObject1).getFlags() & 0x4000000) == 0) {
        break;
      }
      ((MMActivity)this.eNu).finish();
      break;
      label439:
      if (paramString.equals("contact_info_social"))
      {
        paramString = new Intent();
        paramString.setClass(this.eNu, ContactSocialInfoUI.class);
        paramString.putExtra("Contact_User", this.iBi.field_username);
        l = this.eNu.getIntent().getLongExtra("Contact_Uin", 0L);
        localObject1 = this.eNu.getIntent().getStringExtra("Contact_QQNick");
        paramString.putExtra("Contact_Uin", l);
        paramString.putExtra("Contact_QQNick", (String)localObject1);
        paramString.putExtra("profileName", this.nNn);
        paramString.putExtra("verify_gmail", this.mfZ);
        localObject1 = this.eNu.getIntent().getStringExtra("Contact_Mobile_MD5");
        localObject2 = this.eNu.getIntent().getStringExtra("Contact_full_Mobile_MD5");
        paramString.putExtra("Contact_Mobile_MD5", (String)localObject1);
        paramString.putExtra("Contact_full_Mobile_MD5", (String)localObject2);
        this.eNu.startActivity(paramString);
      }
      else if (paramString.equals("contact_info_invite_source"))
      {
        paramString = ((KeyValuePreference)this.htU.VG("contact_info_invite_source")).getExtras().getString("inviteer");
        if (!bg.nm(paramString))
        {
          localObject1 = fs(paramString);
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("Contact_User", paramString);
          ((Intent)localObject2).putExtra("Contact_RemarkName", (String)localObject1);
          ((Intent)localObject2).putExtra("Contact_RoomNickname", (String)localObject1);
          ((Intent)localObject2).putExtra("Contact_RoomMember", true);
          ((Intent)localObject2).putExtra("room_name", this.jOR);
          at.AR();
          ((Intent)localObject2).putExtra("Contact_Nick", com.tencent.mm.y.c.yK().TE(paramString).field_nickname);
          ((Intent)localObject2).putExtra("Contact_Scene", 14);
          ((Intent)localObject2).putExtra("Is_RoomOwner", true);
          ((Intent)localObject2).putExtra("Contact_ChatRoomId", this.jOR);
          com.tencent.mm.plugin.profile.a.hnH.d((Intent)localObject2, this.eNu);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */