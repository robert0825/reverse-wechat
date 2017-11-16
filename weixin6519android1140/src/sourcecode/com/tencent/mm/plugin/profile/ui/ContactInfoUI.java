package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.g.a;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.io.IOException;

public class ContactInfoUI
  extends MMPreference
  implements g.a, j.a, m.b
{
  private com.tencent.mm.ui.base.preference.f htU;
  private com.tencent.mm.storage.x iBi;
  private String jNA;
  private String nLA;
  private byte[] nLB;
  private boolean nLC;
  String nLD;
  private String nLE;
  private boolean nLF;
  private com.tencent.mm.pluginsdk.d.a nLw;
  private boolean nLx;
  private boolean nLy;
  private int nLz;
  
  public ContactInfoUI()
  {
    GMTrace.i(6794504044544L, 50623);
    this.nLC = false;
    this.nLD = null;
    this.nLE = "";
    this.jNA = "";
    this.nLF = false;
    GMTrace.o(6794504044544L, 50623);
  }
  
  protected final void MP()
  {
    GMTrace.i(6795577786368L, 50631);
    this.htU = this.wky;
    this.htU.removeAll();
    this.nLz = getIntent().getIntExtra("Contact_Scene", 9);
    this.nLA = getIntent().getStringExtra("Verify_ticket");
    this.nLx = getIntent().getBooleanExtra("Chat_Readonly", false);
    this.nLy = getIntent().getBooleanExtra("User_Verify", false);
    this.jNA = getIntent().getStringExtra("Contact_ChatRoomId");
    String str1 = bg.nl(getIntent().getStringExtra("Contact_User"));
    Object localObject4 = bg.nl(getIntent().getStringExtra("Contact_Alias"));
    Object localObject1 = bg.nl(getIntent().getStringExtra("Contact_Encryptusername"));
    if (str1.endsWith("@stranger")) {
      localObject1 = str1;
    }
    at.AR();
    this.iBi = com.tencent.mm.y.c.yK().TE(str1);
    if (this.iBi != null) {
      this.iBi.vAa = str1;
    }
    com.tencent.mm.plugin.profile.a.hnI.a(this.iBi);
    String str4 = getIntent().getStringExtra("Contact_Nick");
    int j = getIntent().getIntExtra("Contact_Sex", 0);
    String str5 = getIntent().getStringExtra("Contact_Province");
    String str6 = getIntent().getStringExtra("Contact_City");
    String str7 = getIntent().getStringExtra("Contact_Signature");
    int k = getIntent().getIntExtra("Contact_VUser_Info_Flag", 0);
    String str8 = getIntent().getStringExtra("Contact_VUser_Info");
    String str2 = getIntent().getStringExtra("Contact_Distance");
    int n = getIntent().getIntExtra("Contact_KWeibo_flag", 0);
    String str9 = getIntent().getStringExtra("Contact_KWeibo");
    String str10 = getIntent().getStringExtra("Contact_KWeiboNick");
    String str3 = getIntent().getStringExtra("Contact_KFacebookName");
    long l = getIntent().getLongExtra("Contact_KFacebookId", 0L);
    this.nLE = getIntent().getStringExtra("Contact_BrandIconURL");
    String str11 = getIntent().getStringExtra("Contact_RegionCode");
    this.nLB = getIntent().getByteArrayExtra("Contact_customInfo");
    int i1 = getIntent().getIntExtra("Contact_Ext_Flag", 0);
    boolean bool2 = getIntent().getBooleanExtra("force_get_contact", false);
    w.i("MicroMsg.ContactInfoUI", "dkverify forceAddContact:%s  user:%s  roomid:%s ", new Object[] { Boolean.valueOf(bool2), str1, this.jNA });
    Object localObject3;
    int i;
    label583:
    ak.b localb;
    String str12;
    label650:
    label671:
    int m;
    label1029:
    label1061:
    boolean bool1;
    if (bool2)
    {
      w.d("MicroMsg.ContactInfoUI", "initView, forceAddContact, user = " + str1);
      if ((this.iBi != null) && (com.tencent.mm.l.a.eE(this.iBi.field_type))) {
        ak.a.gmX.K(str1, this.jNA);
      }
    }
    else
    {
      if ((this.iBi != null) && ((int)this.iBi.fTq > 0) && ((!s.gn(this.iBi.field_username)) || ((com.tencent.mm.storage.x.Tq(this.iBi.field_username)) && (!s.fB(this.iBi.field_username)))))
      {
        localObject3 = com.tencent.mm.af.f.iK(this.iBi.field_username);
        if ((!this.iBi.bSA()) || (!com.tencent.mm.af.a.Ew())) {
          break label1715;
        }
        i = 1;
        if ((localObject3 != null) && ((!((com.tencent.mm.af.d)localObject3).Ez()) || (i != 0))) {
          break label1729;
        }
        w.d("MicroMsg.ContactInfoUI", "update contact, verifyFlag %d.", new Object[] { Integer.valueOf(k) });
        localb = ak.a.gmX;
        str12 = this.iBi.field_username;
        if (!com.tencent.mm.l.a.eE(this.iBi.field_type)) {
          break label1720;
        }
        localObject3 = "";
        localb.K(str12, (String)localObject3);
        com.tencent.mm.ac.b.hR(this.iBi.field_username);
      }
      m = getIntent().getIntExtra("Contact_verify_Scene", 9);
      if ((this.iBi != null) && ((int)this.iBi.fTq != 0) && (bg.nl(this.iBi.field_username).length() > 0)) {
        break label1832;
      }
      this.iBi = new com.tencent.mm.storage.x();
      this.iBi.setUsername(str1);
      this.iBi.ci((String)localObject4);
      this.iBi.cl(str4);
      this.iBi.cm(getIntent().getStringExtra("Contact_PyInitial"));
      this.iBi.cn(getIntent().getStringExtra("Contact_QuanPin"));
      this.iBi.jdMethod_do(j);
      this.iBi.cz(str5);
      this.iBi.cA(str6);
      this.iBi.cy(str7);
      this.iBi.dk(k);
      this.iBi.cD(str8);
      this.iBi.cB(str2);
      this.iBi.du(m);
      this.iBi.cC(str9);
      this.iBi.dj(n);
      this.iBi.co(str10);
      this.iBi.w(l);
      this.iBi.ct(str3);
      this.iBi.cE(str11);
      this.iBi.dx(i1);
      if ((!bg.nm(this.nLD)) && (this.nLz == 15))
      {
        at.AR();
        localObject3 = com.tencent.mm.y.c.yL().CC(str1);
        localObject4 = new bb(str1);
        ((bb)localObject4).field_conRemark = ((bb)localObject3).field_conRemark;
        ((bb)localObject4).field_conDescription = ((bb)localObject3).field_conDescription;
        ((bb)localObject4).field_contactLabels = ((bb)localObject3).field_contactLabels;
        ((bb)localObject4).field_conPhone = this.nLD;
        at.AR();
        com.tencent.mm.y.c.yL().a((com.tencent.mm.sdk.e.c)localObject4);
        this.nLD = null;
      }
      if (!bg.nm((String)localObject1)) {
        this.iBi.cr((String)localObject1);
      }
      if (this.iBi != null) {
        break label2279;
      }
      w.e("MicroMsg.ContactInfoUI", "contact = null");
      getIntent().putExtra("Contact_User", this.iBi.field_username);
      if ((!bool2) && ((int)this.iBi.fTq <= 0) && (this.iBi.bSA()) && ((this.nLz == 17) || (this.nLz == 41)))
      {
        w.d("MicroMsg.ContactInfoUI", "come from card, getContact %s", new Object[] { this.iBi.field_username });
        ak.a.gmX.K(this.iBi.field_username, "");
        com.tencent.mm.ac.b.hR(this.iBi.field_username);
      }
      if (this.iBi.fjt != null) {
        break label2389;
      }
      bool1 = true;
      label1184:
      if (this.iBi.fjt != null) {
        break label2395;
      }
      i = 0;
      label1196:
      if (this.iBi.fjt != null) {
        break label2409;
      }
    }
    label1715:
    label1720:
    label1729:
    label1832:
    label2279:
    label2389:
    label2395:
    label2409:
    for (localObject1 = "";; localObject1 = bg.SJ(this.iBi.fjt))
    {
      w.i("MicroMsg.ContactInfoUI", "contact.getRemarkDesc() (%s, %s, %s)", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(i), localObject1 });
      if ((!bool2) && ((int)this.iBi.fTq <= 0) && (this.nLz == 34))
      {
        w.i("MicroMsg.ContactInfoUI", "come from chatroom accessverify, getContact %s", new Object[] { this.iBi.field_username });
        ak.a.gmX.L(this.iBi.field_username, getIntent().getStringExtra("key_add_contact_verify_ticket"));
        com.tencent.mm.ac.b.y(this.iBi.field_username, 3);
      }
      if (this.iBi.field_username.equals(q.zE()))
      {
        at.AR();
        l = bg.getLong((String)com.tencent.mm.y.c.xh().get(65825, null), 0L);
        if (l > 0L)
        {
          this.iBi.w(l);
          localObject1 = this.iBi;
          at.AR();
          ((com.tencent.mm.storage.x)localObject1).ct((String)com.tencent.mm.y.c.xh().get(65826, null));
        }
        localObject1 = this.iBi;
        at.AR();
        ((com.tencent.mm.storage.x)localObject1).cH((String)com.tencent.mm.y.c.xh().get(286721, null));
        localObject1 = this.iBi;
        at.AR();
        ((com.tencent.mm.storage.x)localObject1).cI((String)com.tencent.mm.y.c.xh().get(286722, null));
        localObject1 = this.iBi;
        at.AR();
        ((com.tencent.mm.storage.x)localObject1).cJ((String)com.tencent.mm.y.c.xh().get(286723, null));
      }
      if ((this.iBi.field_username != null) && (this.iBi.field_username.equals(com.tencent.mm.storage.x.Tt(q.zE()))))
      {
        localObject1 = bk.BE();
        localObject3 = bg.nl(((bk)localObject1).getProvince());
        localObject4 = bg.nl(((bk)localObject1).getCity());
        if (!bg.nm((String)localObject3)) {
          this.iBi.cz((String)localObject3);
        }
        if (!bg.nm((String)localObject4)) {
          this.iBi.cA((String)localObject4);
        }
        if (!bg.nm(((bk)localObject1).countryCode)) {
          this.iBi.cE(RegionCodeDecoder.ai(((bk)localObject1).countryCode, ((bk)localObject1).goV, ((bk)localObject1).goU));
        }
        i = bg.a(Integer.valueOf(((bk)localObject1).fja), 0);
        localObject1 = bg.nl(((bk)localObject1).signature);
        this.iBi.jdMethod_do(i);
        this.iBi.cy((String)localObject1);
      }
      if (!bg.nm(this.iBi.field_username)) {
        break label2424;
      }
      w.e("MicroMsg.ContactInfoUI", "username is null %s", new Object[] { str1 });
      finish();
      GMTrace.o(6795577786368L, 50631);
      return;
      ak.a.gmX.K(str1, "");
      break;
      i = 0;
      break label583;
      localObject3 = this.jNA;
      break label650;
      if ((!this.iBi.needUpdate()) || (i != 0)) {
        break label671;
      }
      w.d("MicroMsg.ContactInfoUI", "update contact, last check time=%d", new Object[] { Integer.valueOf(this.iBi.fjr) });
      localb = ak.a.gmX;
      str12 = this.iBi.field_username;
      if (com.tencent.mm.l.a.eE(this.iBi.field_type)) {}
      for (localObject3 = "";; localObject3 = this.jNA)
      {
        localb.K(str12, (String)localObject3);
        com.tencent.mm.ac.b.hR(this.iBi.field_username);
        break;
      }
      if (this.iBi.fja == 0) {
        this.iBi.jdMethod_do(j);
      }
      if ((str5 != null) && (!str5.equals(""))) {
        this.iBi.cz(str5);
      }
      if ((str6 != null) && (!str6.equals(""))) {
        this.iBi.cA(str6);
      }
      if ((str11 != null) && (!str11.equals(""))) {
        this.iBi.cE(str11);
      }
      if ((bg.nm(this.iBi.signature)) && (str7 != null) && (!str7.equals(""))) {
        this.iBi.cy(str7);
      }
      if (k != 0) {
        this.iBi.dk(k);
      }
      if ((bg.nm(this.iBi.fjp)) && (str8 != null) && (!str8.equals(""))) {
        this.iBi.cD(str8);
      }
      if ((bg.nm(this.iBi.field_nickname)) && (str4 != null) && (!str4.equals(""))) {
        this.iBi.cl(str4);
      }
      w.i("MicroMsg.ContactInfoUI", "searchMobilePhone:%s", new Object[] { bg.nl(this.nLD) });
      if ((!bg.nm(this.nLD)) && (this.nLz == 15))
      {
        i = 1;
        k = 1;
        localObject3 = this.iBi.fjz;
        if (localObject3 != null)
        {
          localObject4 = this.iBi.fjz.split(",");
          n = localObject4.length;
          j = 0;
          i = k;
          if (j < n)
          {
            if (localObject4[j].equals(this.nLD)) {}
            for (i = 0;; i = 1)
            {
              j += 1;
              break;
            }
          }
        }
        if (i != 0)
        {
          this.iBi.cL((String)localObject3 + this.nLD + ",");
          this.nLD = null;
        }
        w.i("MicroMsg.ContactInfoUI", "contact PhoneList:%s", new Object[] { bg.nl(this.iBi.fjz) });
        this.iBi.setSource(15);
      }
      this.iBi.cB(str2);
      this.iBi.du(m);
      this.iBi.w(l);
      this.iBi.ct(str3);
      break label1029;
      if (!bg.nm((String)localObject1))
      {
        at.AR();
        localObject1 = com.tencent.mm.y.c.yL().CC((String)localObject1);
        if ((localObject1 != null) && (!bg.nm(((bb)localObject1).field_encryptUsername)))
        {
          this.iBi.cj(((bb)localObject1).field_conRemark);
          break label1061;
        }
      }
      if (bg.nm(str1)) {
        break label1061;
      }
      at.AR();
      localObject1 = com.tencent.mm.y.c.yL().CC(str1);
      if ((localObject1 == null) || (bg.nm(((bb)localObject1).field_encryptUsername))) {
        break label1061;
      }
      this.iBi.cj(((bb)localObject1).field_conRemark);
      break label1061;
      bool1 = false;
      break label1184;
      i = this.iBi.fjt.length();
      break label1196;
    }
    label2424:
    if (s.gm(this.iBi.field_username))
    {
      i = R.l.eaa;
      oM(i);
      if (s.eb(this.iBi.field_username)) {
        oM(R.l.dkB);
      }
      localObject3 = this.nLE;
      if (!s.fz(this.iBi.field_username)) {
        break label2976;
      }
      this.nLw = com.tencent.mm.bj.d.N(this, "sport");
      label2496:
      if (this.nLw != null)
      {
        this.nLw.a(this.htU, this.iBi, this.nLx, this.nLz);
        localObject3 = com.tencent.mm.modelfriend.af.If().jJ(this.iBi.field_username);
        localObject1 = "";
        if (localObject3 != null) {
          localObject1 = bg.nl(((com.tencent.mm.modelfriend.b)localObject3).Ha()).replace(" ", "");
        }
        if ((!this.nLF) && (com.tencent.mm.l.a.eE(this.iBi.field_type)) && ((this.nLw instanceof k)))
        {
          if (!bg.nm(this.iBi.fjz)) {
            break label3595;
          }
          i = 0;
          label2616:
          if (!bg.nm((String)localObject1)) {
            break label3613;
          }
          j = 0;
          label2626:
          j = i + j;
          localObject3 = com.tencent.mm.plugin.report.service.g.ork;
          str1 = this.iBi.field_username;
          if (!bg.nm((String)localObject1)) {
            break label3618;
          }
          i = 0;
          label2654:
          if (j < 5) {
            break label3623;
          }
          j = 5;
        }
      }
    }
    label2976:
    label3595:
    label3613:
    label3618:
    label3623:
    for (;;)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject3).i(12040, new Object[] { str1, Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(j) });
      this.nLF = true;
      if ((!(this.nLw instanceof k)) && (!(this.nLw instanceof c)))
      {
        at.AR();
        localObject1 = (String)com.tencent.mm.y.c.xh().get(w.a.vxS, "");
        if (((String)localObject1).contains(this.iBi.field_username))
        {
          localObject1 = ((String)localObject1).replaceAll(this.iBi.field_username + ",*", "");
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vxS, localObject1);
          w.i("MicroMsg.ContactInfoUI", "mark plugin read, userName:%s, newVal:%s", new Object[] { this.iBi.field_username, localObject1 });
          if (bg.nm((String)localObject1)) {
            com.tencent.mm.s.c.vK().l(262158, false);
          }
        }
      }
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6772894990336L, 50462);
          if (((s.fS(ContactInfoUI.a(ContactInfoUI.this).field_username)) && (!q.zY())) || ((s.fK(ContactInfoUI.a(ContactInfoUI.this).field_username)) && (!q.zU())) || ((s.fM(ContactInfoUI.a(ContactInfoUI.this).field_username)) && (!q.Ae())) || ((s.fG(ContactInfoUI.a(ContactInfoUI.this).field_username)) && (!q.Ag())))
          {
            paramAnonymousMenuItem = new Intent();
            paramAnonymousMenuItem.addFlags(67108864);
            com.tencent.mm.plugin.profile.a.hnH.s(paramAnonymousMenuItem, ContactInfoUI.this);
          }
          ContactInfoUI.this.finish();
          GMTrace.o(6772894990336L, 50462);
          return true;
        }
      });
      com.tencent.mm.ac.n.Dv().hT(this.iBi.field_username);
      if (((!s.fS(this.iBi.field_username)) || (!q.zY())) && ((!s.fK(this.iBi.field_username)) || (!q.zU())) && ((!s.fM(this.iBi.field_username)) || (!q.Ae())) && ((!s.fG(this.iBi.field_username)) || (!q.Ag()))) {
        break label3626;
      }
      this.nLC = true;
      GMTrace.o(6795577786368L, 50631);
      return;
      i = R.l.dlu;
      break;
      if (s.fG(this.iBi.field_username))
      {
        this.nLw = com.tencent.mm.bj.d.N(this, "qqmail");
        break label2496;
      }
      if (s.fH(this.iBi.field_username))
      {
        this.nLw = new e(this);
        oM(R.l.eaa);
        break label2496;
      }
      if (s.fJ(this.iBi.field_username))
      {
        this.nLw = com.tencent.mm.bj.d.N(this, "bottle");
        oM(R.l.eaa);
        break label2496;
      }
      if (s.fI(this.iBi.field_username))
      {
        this.nLw = com.tencent.mm.bj.d.N(this, "tmessage");
        oM(R.l.eaa);
        break label2496;
      }
      if (s.fA(this.iBi.field_username))
      {
        this.nLw = new h(this);
        break label2496;
      }
      if (s.fO(this.iBi.field_username))
      {
        this.nLw = new m(this);
        break label2496;
      }
      if (com.tencent.mm.storage.x.fw(this.iBi.field_username))
      {
        this.nLw = new d(this);
        break label2496;
      }
      if (s.fQ(this.iBi.field_username))
      {
        this.nLw = com.tencent.mm.bj.d.N(this, "nearby");
        break label2496;
      }
      if (s.fR(this.iBi.field_username))
      {
        this.nLw = com.tencent.mm.bj.d.N(this, "shake");
        break label2496;
      }
      if (s.fS(this.iBi.field_username))
      {
        this.nLw = new j(this);
        break label2496;
      }
      if (s.fT(this.iBi.field_username))
      {
        this.nLw = com.tencent.mm.bj.d.y(this, "readerapp", "widget_type_news");
        break label2496;
      }
      if (s.gb(this.iBi.field_username))
      {
        this.nLw = com.tencent.mm.bj.d.y(this, "readerapp", "widget_type_weibo");
        break label2496;
      }
      if (s.fL(this.iBi.field_username))
      {
        this.nLw = new f(this);
        break label2496;
      }
      if (s.fM(this.iBi.field_username))
      {
        this.nLw = com.tencent.mm.bj.d.N(this, "masssend");
        break label2496;
      }
      if (s.fN(this.iBi.field_username))
      {
        this.nLw = new g(this);
        break label2496;
      }
      if (this.iBi.bSA()) {
        for (;;)
        {
          try
          {
            localObject1 = this.nLB;
            if (localObject1 != null) {
              continue;
            }
            localObject1 = null;
          }
          catch (IOException localIOException)
          {
            w.printErrStackTrace("MicroMsg.ContactInfoUI", localIOException, "", new Object[0]);
            Object localObject2 = null;
            continue;
          }
          localObject1 = new c(this, (String)localObject3, (oo)localObject1);
          if (!bg.nm(this.nLA)) {
            ((c)localObject1).nLA = this.nLA;
          }
          this.nLw = ((com.tencent.mm.pluginsdk.d.a)localObject1);
          break;
          localObject1 = (oo)new oo().aD(this.nLB);
        }
      }
      if (s.fW(this.iBi.field_username))
      {
        this.nLw = new n(this);
        break label2496;
      }
      if (s.fX(this.iBi.field_username))
      {
        this.nLw = new i(this);
        break label2496;
      }
      this.nLw = new k(this);
      break label2496;
      i = this.iBi.fjz.split(",").length;
      break label2616;
      j = 1;
      break label2626;
      i = 1;
      break label2654;
    }
    label3626:
    this.nLC = false;
    GMTrace.o(6795577786368L, 50631);
  }
  
  public final int QI()
  {
    GMTrace.i(6794638262272L, 50624);
    int i = R.o.eoM;
    GMTrace.o(6794638262272L, 50624);
    return i;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(6795980439552L, 50634);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.d("MicroMsg.ContactInfoUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(6795980439552L, 50634);
      return;
    }
    a((String)paramObject, null);
    GMTrace.o(6795980439552L, 50634);
  }
  
  public final void a(final bb parambb)
  {
    GMTrace.i(6796248875008L, 50636);
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6770344853504L, 50443);
        if ((ContactInfoUI.a(ContactInfoUI.this) != null) && (parambb != null) && (!bg.nm(ContactInfoUI.a(ContactInfoUI.this).field_username)) && (ContactInfoUI.a(ContactInfoUI.this).field_username.equals(parambb.field_encryptUsername)) && (!s.gn(ContactInfoUI.a(ContactInfoUI.this).field_username)))
        {
          ContactInfoUI.a(ContactInfoUI.this).cj(parambb.field_conRemark);
          ContactInfoUI.this.getIntent().putExtra("Contact_User", ContactInfoUI.a(ContactInfoUI.this).field_username);
          if (ContactInfoUI.c(ContactInfoUI.this) != null)
          {
            ContactInfoUI.c(ContactInfoUI.this).ahL();
            ContactInfoUI.d(ContactInfoUI.this).removeAll();
          }
          ContactInfoUI.this.MP();
        }
        GMTrace.o(6770344853504L, 50443);
      }
    });
    GMTrace.o(6796248875008L, 50636);
  }
  
  public final void a(final String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(6796114657280L, 50635);
    new ae().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6766989410304L, 50418);
        w.d("MicroMsg.ContactInfoUI", "onNotifyChange verify:%b, contact.user:%s, notify.user:%s", new Object[] { Boolean.valueOf(ContactInfoUI.b(ContactInfoUI.this)), ContactInfoUI.a(ContactInfoUI.this).field_username, paramString });
        if ((ContactInfoUI.a(ContactInfoUI.this) != null) && (!bg.nm(ContactInfoUI.a(ContactInfoUI.this).field_username)) && ((ContactInfoUI.a(ContactInfoUI.this).field_username.equals(paramString)) || (ContactInfoUI.a(ContactInfoUI.this).field_username.equals(com.tencent.mm.storage.x.Tt(paramString)))))
        {
          if (ContactInfoUI.c(ContactInfoUI.this) != null)
          {
            ContactInfoUI.c(ContactInfoUI.this).ahL();
            ContactInfoUI.d(ContactInfoUI.this).removeAll();
          }
          ContactInfoUI.this.MP();
        }
        GMTrace.o(6766989410304L, 50418);
      }
    });
    GMTrace.o(6796114657280L, 50635);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(6795846221824L, 50633);
    paramf = paramPreference.hiu;
    w.i("MicroMsg.ContactInfoUI", paramf + " item has been clicked!");
    if (this.nLw != null) {
      this.nLw.tF(paramf);
    }
    GMTrace.o(6795846221824L, 50633);
    return false;
  }
  
  protected final String aJX()
  {
    GMTrace.i(6795443568640L, 50630);
    if ((this.iBi == null) || ((int)this.iBi.fTq == 0) || (bg.nm(this.iBi.field_username)))
    {
      GMTrace.o(6795443568640L, 50630);
      return "";
    }
    w.i("MicroMsg.ContactInfoUI", "getIdentString %s", new Object[] { this.iBi.field_username });
    if (com.tencent.mm.af.f.dL(this.iBi.field_username))
    {
      GMTrace.o(6795443568640L, 50630);
      return "_EnterpriseChat";
    }
    if (com.tencent.mm.af.f.iP(this.iBi.field_username))
    {
      GMTrace.o(6795443568640L, 50630);
      return "_EnterpriseFatherBiz";
    }
    if (com.tencent.mm.af.f.iO(this.iBi.field_username))
    {
      GMTrace.o(6795443568640L, 50630);
      return "_EnterpriseChildBiz";
    }
    if (this.iBi.bSA())
    {
      GMTrace.o(6795443568640L, 50630);
      return "_bizContact";
    }
    if (s.eb(this.iBi.field_username))
    {
      GMTrace.o(6795443568640L, 50630);
      return "_chatroom";
    }
    if (s.fw(this.iBi.field_username))
    {
      GMTrace.o(6795443568640L, 50630);
      return "_bottle";
    }
    if (s.fx(this.iBi.field_username))
    {
      GMTrace.o(6795443568640L, 50630);
      return "_QQ";
    }
    if (s.gm(this.iBi.field_username))
    {
      String str = "_" + this.iBi.field_username;
      GMTrace.o(6795443568640L, 50630);
      return str;
    }
    GMTrace.o(6795443568640L, 50630);
    return "";
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6795712004096L, 50632);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.nLw != null) {
      this.nLw.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    GMTrace.o(6795712004096L, 50632);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6794772480000L, 50625);
    super.onCreate(paramBundle);
    w.i("MicroMsg.ContactInfoUI", "onCreate MMCore.accHasReady[%b]", new Object[] { Boolean.valueOf(at.AU()) });
    this.nLD = getIntent().getStringExtra("Contact_Search_Mobile");
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      finish();
      GMTrace.o(6794772480000L, 50625);
      return;
    }
    at.AR();
    com.tencent.mm.y.c.yK().a(this);
    at.AR();
    com.tencent.mm.y.c.yL().a(this);
    MP();
    GMTrace.o(6794772480000L, 50625);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6794906697728L, 50626);
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      at.AR();
      com.tencent.mm.y.c.yK().b(this);
      at.AR();
      com.tencent.mm.y.c.yL().b(this);
    }
    if (this.nLw != null) {
      this.nLw.ahL();
    }
    if (com.tencent.mm.plugin.sns.b.n.poO != null) {
      com.tencent.mm.plugin.sns.b.n.poO.K(this);
    }
    super.onDestroy();
    GMTrace.o(6794906697728L, 50626);
  }
  
  public void onPause()
  {
    GMTrace.i(6795309350912L, 50629);
    com.tencent.mm.modelstat.d.a(4, "ContactInfoUI" + aJX(), hashCode());
    com.tencent.mm.af.x.FG().j(this);
    super.onPause();
    at.xB().E(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6813294526464L, 50763);
        at.AR();
        com.tencent.mm.y.c.xh().kL(true);
        GMTrace.o(6813294526464L, 50763);
      }
    });
    GMTrace.o(6795309350912L, 50629);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(6796383092736L, 50637);
    w.i("MicroMsg.ContactInfoUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(6796383092736L, 50637);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        paramArrayOfString = (NormalUserFooterPreference)this.htU.VG("contact_info_footer_normal");
        if (paramArrayOfString != null) {
          paramArrayOfString.aXM();
        }
        GMTrace.o(6796383092736L, 50637);
        return;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
      for (paramInt = R.l.dNn;; paramInt = R.l.dNr)
      {
        if (paramArrayOfInt[0] != 0) {
          com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6735582461952L, 50184);
              paramAnonymousDialogInterface.dismiss();
              ContactInfoUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
              GMTrace.o(6735582461952L, 50184);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6801349148672L, 50674);
              paramAnonymousDialogInterface.dismiss();
              GMTrace.o(6801349148672L, 50674);
            }
          });
        }
        GMTrace.o(6796383092736L, 50637);
        return;
      }
      if (paramArrayOfInt[0] == 0)
      {
        paramArrayOfString = (NormalUserFooterPreference)this.htU.VG("contact_info_footer_normal");
        if (paramArrayOfString != null) {
          paramArrayOfString.aXL();
        }
        GMTrace.o(6796383092736L, 50637);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6725516132352L, 50109);
          ContactInfoUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(6725516132352L, 50109);
        }
      }, null);
    }
  }
  
  protected void onRestart()
  {
    GMTrace.i(6795175133184L, 50628);
    super.onRestart();
    this.nLF = false;
    GMTrace.o(6795175133184L, 50628);
  }
  
  public void onResume()
  {
    GMTrace.i(6795040915456L, 50627);
    com.tencent.mm.modelstat.d.a(3, "ContactInfoUI" + aJX(), hashCode());
    com.tencent.mm.af.x.FG().c(this);
    super.onResume();
    View localView = ((ViewGroup)this.vKB.hqF).getFocusedChild();
    if (localView != null)
    {
      localView.clearFocus();
      w.i("MicroMsg.ContactInfoUI", "try to clear focus. id:%s", new Object[] { Integer.valueOf(localView.getId()) });
    }
    GMTrace.o(6795040915456L, 50627);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\ContactInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */