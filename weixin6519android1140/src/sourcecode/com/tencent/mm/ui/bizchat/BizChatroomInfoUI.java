package com.tencent.mm.ui.bizchat;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.af.a.b;
import com.tencent.mm.af.a.c;
import com.tencent.mm.af.a.d.a;
import com.tencent.mm.af.a.d.a.a;
import com.tencent.mm.af.a.d.a.b;
import com.tencent.mm.af.a.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.pluginsdk.ui.applet.g;
import com.tencent.mm.pluginsdk.ui.preference.SignaturePreference;
import com.tencent.mm.protocal.c.gy;
import com.tencent.mm.protocal.c.ha;
import com.tencent.mm.protocal.c.hb;
import com.tencent.mm.protocal.c.oi;
import com.tencent.mm.protocal.c.oj;
import com.tencent.mm.protocal.c.us;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc.a;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BizChatroomInfoUI
  extends MMPreference
  implements com.tencent.mm.ad.e, com.tencent.mm.af.n
{
  private static boolean jNV;
  private int fromScene;
  private SharedPreferences ghC;
  private ProgressDialog htG;
  private f htU;
  private boolean jGN;
  private boolean jNC;
  private int jND;
  private com.tencent.mm.pluginsdk.ui.d jNJ;
  boolean jNK;
  private SignaturePreference jNo;
  private ContactListExpandPreference jNs;
  private CheckBoxPreference jNt;
  private CheckBoxPreference jNu;
  private CheckBoxPreference jNv;
  private boolean jqh;
  private long juT;
  private String juZ;
  private j nMD;
  private c woz;
  private d.a wpe;
  private String wqb;
  private boolean wqc;
  private boolean wqd;
  private boolean wqe;
  private int wqf;
  private j wqg;
  
  static
  {
    GMTrace.i(2981646827520L, 22215);
    jNV = false;
    GMTrace.o(2981646827520L, 22215);
  }
  
  public BizChatroomInfoUI()
  {
    GMTrace.i(2976949207040L, 22180);
    this.htG = null;
    this.ghC = null;
    this.jNC = false;
    this.wqc = false;
    this.woz = null;
    this.nMD = null;
    this.wqg = null;
    this.jNJ = new com.tencent.mm.pluginsdk.ui.d(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2971043627008L, 22136);
        GMTrace.o(2971043627008L, 22136);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(2970909409280L, 22135);
        com.tencent.mm.ao.n.Jd().bi(paramAnonymousInt);
        GMTrace.o(2970909409280L, 22135);
      }
    });
    this.jNK = false;
    this.jqh = false;
    this.wpe = new d.a()
    {
      public final void a(d.a.b paramAnonymousb)
      {
        GMTrace.i(3005403365376L, 22392);
        if ((paramAnonymousb != null) && (paramAnonymousb.gyj != null) && (paramAnonymousb.gxY == BizChatroomInfoUI.g(BizChatroomInfoUI.this)) && (paramAnonymousb.gyi != d.a.a.gyf))
        {
          w.i("MicroMsg.BizChatroomInfoUI", "bizChatExtension bizChat change");
          paramAnonymousb = com.tencent.mm.af.x.FI().t(BizChatroomInfoUI.g(BizChatroomInfoUI.this));
          BizChatroomInfoUI.a(BizChatroomInfoUI.this, paramAnonymousb);
          BizChatroomInfoUI.h(BizChatroomInfoUI.this);
        }
        GMTrace.o(3005403365376L, 22392);
      }
    };
    GMTrace.o(2976949207040L, 22180);
  }
  
  private boolean VR(String paramString)
  {
    GMTrace.i(2977754513408L, 22186);
    if (paramString != null) {}
    for (;;)
    {
      try
      {
        JSONArray localJSONArray = new JSONArray(paramString);
        hb localhb = new hb();
        int i = 0;
        if (i < localJSONArray.length())
        {
          localObject = localJSONArray.getJSONObject(i);
          String str = ((JSONObject)localObject).getString("id");
          paramString = com.tencent.mm.af.x.FK().bl(str);
          if (paramString != null) {
            break label264;
          }
          paramString = new j();
          paramString.field_userId = str;
          paramString.field_userName = ((JSONObject)localObject).getString("nick_name");
          paramString.field_brandUserName = this.juZ;
          paramString.field_headImageUrl = ((JSONObject)localObject).getString("head_img_url");
          paramString.field_profileUrl = ((JSONObject)localObject).getString("profile_url");
          paramString.field_UserVersion = ((JSONObject)localObject).getInt("ver");
          if (this.wqg == null) {
            break label267;
          }
          localObject = this.wqg.field_addMemberUrl;
          paramString.field_addMemberUrl = ((String)localObject);
          if (!com.tencent.mm.af.x.FK().b(paramString)) {
            com.tencent.mm.af.x.FK().a(paramString);
          }
          localObject = new ha();
          ((ha)localObject).tVV = paramString.field_userId;
          localhb.tVW.add(localObject);
          i += 1;
          continue;
        }
        a(localhb, null);
        GMTrace.o(2977754513408L, 22186);
        return true;
      }
      catch (JSONException paramString)
      {
        w.i("MicroMsg.BizChatroomInfoUI", "parse memberJson Exception:%s", new Object[] { paramString.getMessage() });
        w.printErrStackTrace("MicroMsg.BizChatroomInfoUI", paramString, "", new Object[0]);
      }
      GMTrace.o(2977754513408L, 22186);
      return false;
      label264:
      continue;
      label267:
      Object localObject = null;
    }
  }
  
  private void a(final hb paramhb1, hb paramhb2)
  {
    GMTrace.i(2977888731136L, 22187);
    w.i("MicroMsg.BizChatroomInfoUI", "updateBizChatMemberList()");
    if (paramhb1 == null) {}
    for (String str = getString(R.l.dSE);; str = getString(R.l.cQF))
    {
      com.tencent.mm.af.x.FM();
      paramhb1 = com.tencent.mm.af.a.h.a(this.woz.field_brandUserName, this.woz.field_bizChatServId, paramhb1, paramhb2, this);
      getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(this, str, true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2990639415296L, 22282);
          at.wS().c(paramhb1);
          GMTrace.o(2990639415296L, 22282);
        }
      });
      GMTrace.o(2977888731136L, 22187);
      return;
    }
  }
  
  private void aXI()
  {
    GMTrace.i(2978828255232L, 22194);
    w.d("MicroMsg.BizChatroomInfoUI", "updatePlaceTop()");
    if (this.ghC == null) {
      this.ghC = getSharedPreferences(getPackageName() + "_preferences", 0);
    }
    if (this.wqc) {
      this.wqe = this.woz.fN(16);
    }
    for (this.wqf = this.woz.field_bitFlag;; this.wqf = this.nMD.field_bitFlag)
    {
      if (this.jNv != null) {
        this.ghC.edit().putBoolean("room_placed_to_the_top", this.wqe).commit();
      }
      this.htU.notifyDataSetChanged();
      GMTrace.o(2978828255232L, 22194);
      return;
      this.wqe = this.nMD.fN(16);
    }
  }
  
  private void anA()
  {
    GMTrace.i(2979096690688L, 22196);
    if (this.jNo != null)
    {
      if (anB())
      {
        Object localObject2 = this.woz.field_chatName;
        Object localObject1 = localObject2;
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((String)localObject2).length() > 50) {
            localObject1 = ((String)localObject2).substring(0, 32);
          }
        }
        w.i("MicroMsg.BizChatroomInfoUI", "updateRoomName chatName:%s", new Object[] { localObject1 });
        SignaturePreference localSignaturePreference = this.jNo;
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          if (((String)localObject1).length() > 0) {}
        }
        else
        {
          localObject2 = getString(R.l.eaz);
        }
        localSignaturePreference.setSummary(com.tencent.mm.pluginsdk.ui.d.h.a(this, (CharSequence)localObject2));
        GMTrace.o(2979096690688L, 22196);
        return;
      }
      this.jNo.setSummary(getString(R.l.dTc));
    }
    GMTrace.o(2979096690688L, 22196);
  }
  
  private boolean anB()
  {
    GMTrace.i(2979365126144L, 22198);
    if (this.wqc) {}
    for (String str = this.woz.field_chatName; bg.nm(str); str = this.nMD.field_userName)
    {
      GMTrace.o(2979365126144L, 22198);
      return false;
    }
    GMTrace.o(2979365126144L, 22198);
    return true;
  }
  
  private void anv()
  {
    GMTrace.i(2979230908416L, 22197);
    if (this.wqc)
    {
      this.jND = com.tencent.mm.af.a.e.ah(this.juT);
      if (this.jND != 0)
      {
        sq(getString(R.l.dwy, new Object[] { getString(R.l.dUf), Integer.valueOf(this.jND) }));
        GMTrace.o(2979230908416L, 22197);
        return;
      }
    }
    sq(getString(R.l.dUf));
    GMTrace.o(2979230908416L, 22197);
  }
  
  private void anw()
  {
    GMTrace.i(2978559819776L, 22192);
    Object localObject;
    if (this.jNs != null)
    {
      if (!this.wqc) {
        break label88;
      }
      localObject = com.tencent.mm.af.a.e.ai(this.juT);
      if (localObject == null) {
        break label113;
      }
      this.jND = ((List)localObject).size();
      label45:
      if (this.jND > 1) {
        break label121;
      }
      this.jNs.kf(true).kg(false);
    }
    for (;;)
    {
      this.jNs.m(this.juZ, (List)localObject);
      GMTrace.o(2978559819776L, 22192);
      return;
      label88:
      localObject = new LinkedList();
      ((List)localObject).add(this.woz.field_bizChatServId);
      break;
      label113:
      this.jND = 0;
      break label45;
      label121:
      this.jNs.kf(true).kg(this.jNC);
    }
  }
  
  private void any()
  {
    GMTrace.i(2978962472960L, 22195);
    if (this.ghC == null) {
      this.ghC = getSharedPreferences(getPackageName() + "_preferences", 0);
    }
    if (this.wqc)
    {
      this.jGN = this.woz.fN(1);
      this.wqf = this.woz.field_bitFlag;
      if (!this.jGN) {
        break label166;
      }
      Ba(0);
      if (this.jNt != null) {
        this.ghC.edit().putBoolean("room_notify_new_msg", true).commit();
      }
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(2978962472960L, 22195);
      return;
      this.jGN = this.nMD.fN(1);
      this.wqf = this.nMD.field_bitFlag;
      break;
      label166:
      Ba(8);
      if (this.jNt != null) {
        this.ghC.edit().putBoolean("room_notify_new_msg", false).commit();
      }
    }
  }
  
  private void cbA()
  {
    GMTrace.i(2979767779328L, 22201);
    if (this.jNs != null)
    {
      anA();
      anv();
      any();
      anw();
      cbz();
      aXI();
      this.jNs.notifyChanged();
    }
    this.htU.notifyDataSetChanged();
    GMTrace.o(2979767779328L, 22201);
  }
  
  private void cbB()
  {
    GMTrace.i(2979901997056L, 22202);
    w.i("MicroMsg.BizChatroomInfoUI", "dealModChatNameFail reset bizChatName");
    this.woz.field_chatName = this.wqb;
    this.woz.field_bitFlag = this.wqf;
    this.jGN = this.woz.fN(1);
    this.wqd = this.woz.fN(8);
    this.wqe = this.woz.fN(16);
    com.tencent.mm.af.x.FI().b(this.woz);
    if (this.wqe) {
      com.tencent.mm.af.x.FJ().af(this.woz.field_bizChatLocalId);
    }
    for (;;)
    {
      this.ghC.edit().putBoolean("room_placed_to_the_top", com.tencent.mm.af.x.FJ().ae(this.woz.field_bizChatLocalId)).commit();
      anA();
      any();
      aXI();
      cbz();
      Toast.makeText(this, getString(R.l.dSz), 0).show();
      GMTrace.o(2979901997056L, 22202);
      return;
      if (!this.wqe) {
        com.tencent.mm.af.x.FJ().ag(this.woz.field_bizChatLocalId);
      }
    }
  }
  
  private void cbz()
  {
    GMTrace.i(2978694037504L, 22193);
    w.d("MicroMsg.BizChatroomInfoUI", "updateSaveToContact()");
    if (this.ghC == null) {
      this.ghC = getSharedPreferences(getPackageName() + "_preferences", 0);
    }
    if (this.wqc)
    {
      this.wqd = this.woz.fN(8);
      this.wqf = this.woz.field_bitFlag;
      if (!this.wqd) {
        break label171;
      }
      if (this.jNu != null) {
        this.ghC.edit().putBoolean("room_save_to_contact", true).commit();
      }
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(2978694037504L, 22193);
      return;
      this.wqd = this.nMD.fN(8);
      this.wqf = this.nMD.field_bitFlag;
      break;
      label171:
      if (this.jNu != null) {
        this.ghC.edit().putBoolean("room_save_to_contact", false).commit();
      }
    }
  }
  
  private void t(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(2978425602048L, 22191);
    this.wqf = this.woz.field_bitFlag;
    this.wqb = this.woz.field_chatName;
    Object localObject;
    if (this.wqc)
    {
      if (paramBoolean) {
        localObject = this.woz;
      }
      for (((c)localObject).field_bitFlag |= paramInt;; ((c)localObject).field_bitFlag &= (paramInt ^ 0xFFFFFFFF))
      {
        w.i("MicroMsg.BizChatroomInfoUI", "dealSetMute:bitFlag %s", new Object[] { Integer.valueOf(this.woz.field_bitFlag) });
        com.tencent.mm.af.x.FI().b(this.woz);
        localObject = new gy();
        ((gy)localObject).tVO = this.woz.field_bizChatServId;
        ((gy)localObject).tVQ = this.woz.field_bitFlag;
        com.tencent.mm.af.x.FM();
        com.tencent.mm.af.a.h.a(this.woz.field_brandUserName, (gy)localObject, this);
        GMTrace.o(2978425602048L, 22191);
        return;
        localObject = this.woz;
      }
    }
    if (paramBoolean) {
      localObject = this.nMD;
    }
    for (((j)localObject).field_bitFlag |= paramInt;; ((j)localObject).field_bitFlag &= (paramInt ^ 0xFFFFFFFF))
    {
      com.tencent.mm.af.x.FK().b(this.nMD);
      this.woz.field_bitFlag = this.nMD.field_bitFlag;
      com.tencent.mm.af.x.FI().b(this.woz);
      break;
      localObject = this.nMD;
    }
  }
  
  public final j CA(int paramInt)
  {
    GMTrace.i(17878606675968L, 133206);
    if ((this.jNs.getItem(paramInt) instanceof j))
    {
      j localj = (j)this.jNs.getItem(paramInt);
      GMTrace.o(17878606675968L, 133206);
      return localj;
    }
    GMTrace.o(17878606675968L, 133206);
    return null;
  }
  
  protected final void MP()
  {
    GMTrace.i(2978157166592L, 22189);
    this.htU = this.wky;
    Object localObject = this.woz.field_ownerUserId;
    this.jND = this.woz.FT().size();
    if (bg.nm((String)localObject))
    {
      this.jNC = false;
      w.d("MicroMsg.BizChatroomInfoUI", "initBaseChatRoomView()");
      this.jNs = ((ContactListExpandPreference)this.htU.VG("roominfo_contact_anchor"));
      this.jNs.a(this.htU, this.jNs.hiu);
      this.jNo = ((SignaturePreference)this.htU.VG("room_name"));
      this.jNt = ((CheckBoxPreference)this.htU.VG("room_notify_new_msg"));
      this.jNv = ((CheckBoxPreference)this.htU.VG("room_placed_to_the_top"));
      this.jNu = ((CheckBoxPreference)this.htU.VG("room_save_to_contact"));
      localObject = this.jNs;
      boolean bool = this.wqc;
      if (((ContactListExpandPreference)localObject).txK != null) {
        ((ContactListExpandPreference)localObject).txK.twX.txm = bool;
      }
      localObject = this.jNs;
      bool = this.jNC;
      if (((ContactListExpandPreference)localObject).txK != null) {
        ((ContactListExpandPreference)localObject).txK.twX.txl = bool;
      }
      if (!this.jNC) {
        break label423;
      }
      this.jNs.kf(true).kg(true);
    }
    for (;;)
    {
      this.jNs.Pm(this.woz.field_ownerUserId);
      this.jNs.bLK();
      this.jNs.bLN();
      if (!this.wqc)
      {
        this.htU.bc("room_save_to_contact", true);
        this.htU.bc("room_name", true);
        this.htU.bc("room_del_quit", true);
      }
      cbz();
      aXI();
      any();
      if (this.jNs != null)
      {
        this.mqO.setOnScrollListener(this.jNJ);
        this.jNs.a(this.jNJ);
        this.jNs.a(new ContactListExpandPreference.a()
        {
          public final void anE()
          {
            GMTrace.i(2989834108928L, 22276);
            if (BizChatroomInfoUI.b(BizChatroomInfoUI.this) != null) {
              BizChatroomInfoUI.b(BizChatroomInfoUI.this).bLL();
            }
            GMTrace.o(2989834108928L, 22276);
          }
          
          public final void ma(int paramAnonymousInt)
          {
            GMTrace.i(2989565673472L, 22274);
            BizChatroomInfoUI.a(BizChatroomInfoUI.this, paramAnonymousInt);
            GMTrace.o(2989565673472L, 22274);
          }
          
          public final void mb(int paramAnonymousInt)
          {
            boolean bool = true;
            GMTrace.i(2989699891200L, 22275);
            j localj = BizChatroomInfoUI.this.CA(paramAnonymousInt);
            if ((localj == null) || (bg.nm(localj.field_profileUrl)))
            {
              if (localj == null) {}
              for (;;)
              {
                w.w("MicroMsg.BizChatroomInfoUI", "onItemNormalClick userInfo == null:%s", new Object[] { Boolean.valueOf(bool) });
                GMTrace.o(2989699891200L, 22275);
                return;
                bool = false;
              }
            }
            w.i("MicroMsg.BizChatroomInfoUI", "onItemNormalClick Url:%s", new Object[] { localj.field_profileUrl });
            com.tencent.mm.af.x.FM();
            com.tencent.mm.af.a.h.a(localj.field_userId, localj.field_brandUserName, BizChatroomInfoUI.this);
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", localj.field_profileUrl);
            localIntent.putExtra("useJs", true);
            com.tencent.mm.bj.d.b(BizChatroomInfoUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", localIntent);
            GMTrace.o(2989699891200L, 22275);
          }
          
          public final void mc(int paramAnonymousInt)
          {
            GMTrace.i(2989968326656L, 22277);
            BizChatroomInfoUI.c(BizChatroomInfoUI.this);
            GMTrace.o(2989968326656L, 22277);
          }
        });
      }
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2985673359360L, 22245);
          BizChatroomInfoUI.this.finish();
          GMTrace.o(2985673359360L, 22245);
          return true;
        }
      });
      GMTrace.o(2978157166592L, 22189);
      return;
      this.jNC = ((String)localObject).equals(com.tencent.mm.af.x.FK().bm(this.juZ));
      break;
      label423:
      this.jNs.kf(true).kg(false);
    }
  }
  
  public final int QI()
  {
    GMTrace.i(2978022948864L, 22188);
    int i = R.o.eop;
    GMTrace.o(2978022948864L, 22188);
    return i;
  }
  
  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    GMTrace.i(2980036214784L, 22203);
    paramSharedPreferences = new com.tencent.mm.ui.base.preference.a(this, paramSharedPreferences);
    GMTrace.o(2980036214784L, 22203);
    return paramSharedPreferences;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(2979633561600L, 22200);
    if (paramk == null)
    {
      w.e("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], scene is null", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      GMTrace.o(2979633561600L, 22200);
      return;
    }
    w.i("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramk.getType()) });
    this.jND = com.tencent.mm.af.a.e.ah(this.juT);
    w.d("MicroMsg.BizChatroomInfoUI", "now is " + this.jND);
    if (this.htG != null) {
      this.htG.dismiss();
    }
    paramString = com.tencent.mm.h.a.dH(paramString);
    if (paramString != null)
    {
      paramString.a(this, null, null);
      GMTrace.o(2979633561600L, 22200);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.w("MicroMsg.BizChatroomInfoUI", "willen onSceneEnd err:Network not ok");
      cbB();
      GMTrace.o(2979633561600L, 22200);
      return;
    }
    paramk.getType();
    GMTrace.o(2979633561600L, 22200);
  }
  
  public final void a(int paramInt, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(2979499343872L, 22199);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (paramk.getType() == 1355)
    {
      Object localObject = ((com.tencent.mm.af.a.n)paramk).Ga();
      paramk = ((com.tencent.mm.af.a.n)paramk).Gb();
      localObject = com.tencent.mm.af.x.FI().jd(((oj)localObject).ufl.umW.tVO);
      if (localObject == null)
      {
        Toast.makeText(ab.getContext(), getString(R.l.dSy), 0).show();
        GMTrace.o(2979499343872L, 22199);
        return;
      }
      if (this.fromScene == 2)
      {
        localIntent = new Intent();
        localIntent.addFlags(67108864);
        localIntent.putExtra("biz_chat_need_to_jump_to_chatting_ui", true);
        localIntent.putExtra("Contact_User", paramk.tVU);
        localIntent.putExtra("biz_chat_chat_id", ((c)localObject).field_bizChatLocalId);
        com.tencent.mm.bj.d.a(this, ".ui.bizchat.BizChatConversationUI", localIntent);
        GMTrace.o(2979499343872L, 22199);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.addFlags(67108864);
      localIntent.putExtra("Chat_User", paramk.tVU);
      localIntent.putExtra("key_biz_chat_id", ((c)localObject).field_bizChatLocalId);
      localIntent.putExtra("finish_direct", true);
      localIntent.putExtra("key_need_send_video", false);
      localIntent.putExtra("key_is_biz_chat", true);
      com.tencent.mm.plugin.chatroom.a.hnH.e(localIntent, this);
      GMTrace.o(2979499343872L, 22199);
      return;
    }
    if (paramk.getType() == 1356)
    {
      if (paramInt != 0)
      {
        cbB();
        GMTrace.o(2979499343872L, 22199);
      }
    }
    else if ((paramk.getType() == 1353) && (paramInt >= 0) && (this.nMD != null))
    {
      this.nMD = com.tencent.mm.af.x.FK().bl(this.nMD.field_userId);
      cbA();
    }
    GMTrace.o(2979499343872L, 22199);
  }
  
  public final boolean a(final f paramf, Preference paramPreference)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    GMTrace.i(2978291384320L, 22190);
    paramf = paramPreference.hiu;
    if (paramf.equals("room_name"))
    {
      paramf = "";
      if (anB()) {
        paramf = this.woz.field_chatName;
      }
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dTs), paramf, "", 32, new h.b()
      {
        public final boolean v(CharSequence paramAnonymousCharSequence)
        {
          GMTrace.i(2989028802560L, 22270);
          boolean bool = BizChatroomInfoUI.a(BizChatroomInfoUI.this, paramf, paramAnonymousCharSequence);
          GMTrace.o(2989028802560L, 22270);
          return bool;
        }
      });
    }
    label196:
    do
    {
      for (;;)
      {
        GMTrace.o(2978291384320L, 22190);
        return false;
        if (paramf.equals("room_notify_new_msg"))
        {
          if (!this.jGN) {}
          for (bool1 = true;; bool1 = false)
          {
            this.jGN = bool1;
            t(this.jGN, 1);
            any();
            break;
          }
        }
        if (paramf.equals("room_placed_to_the_top"))
        {
          if (!this.wqe) {}
          for (;;)
          {
            this.wqe = bool1;
            t(this.wqe, 16);
            if (!this.wqe) {
              break label196;
            }
            com.tencent.mm.af.x.FJ().af(this.woz.field_bizChatLocalId);
            break;
            bool1 = false;
          }
          com.tencent.mm.af.x.FJ().ag(this.woz.field_bizChatLocalId);
        }
        else
        {
          if (!paramf.equals("room_del_quit")) {
            break;
          }
          w.d("MicroMsg.BizChatroomInfoUI", " quit " + this.juT);
          com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dmy), "", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2985941794816L, 22247);
              BizChatroomInfoUI.d(BizChatroomInfoUI.this);
              GMTrace.o(2985941794816L, 22247);
            }
          }, null);
        }
      }
    } while (!paramf.equals("room_save_to_contact"));
    if (!this.wqd) {}
    for (bool1 = bool2;; bool1 = false)
    {
      this.wqd = bool1;
      t(this.wqd, 8);
      cbz();
      break;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(2977620295680L, 22185);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(2977620295680L, 22185);
      return;
    }
    switch (paramInt1)
    {
    default: 
      GMTrace.o(2977620295680L, 22185);
      return;
    }
    paramIntent = paramIntent.getBundleExtra("result_data");
    String str;
    boolean bool;
    if (paramIntent != null)
    {
      w.i("MicroMsg.BizChatroomInfoUI", "bundle != null");
      str = paramIntent.getString("enterprise_members");
      w.i("MicroMsg.BizChatroomInfoUI", "enterprise_members:%s", new Object[] { str });
      if (this.wqc) {
        bool = VR(str);
      }
    }
    for (;;)
    {
      if (!bool)
      {
        Toast.makeText(this, getString(R.l.dSy), 0).show();
        GMTrace.o(2977620295680L, 22185);
        return;
        us localus = new us();
        c localc = new c();
        if (this.wqg != null) {}
        for (paramIntent = this.wqg.field_addMemberUrl;; paramIntent = null)
        {
          localc.field_addMemberUrl = paramIntent;
          localc.field_brandUserName = this.juZ;
          if (!com.tencent.mm.af.a.e.a(localc, str, this.nMD.field_userId, localus)) {
            break label279;
          }
          com.tencent.mm.af.x.FM();
          paramIntent = com.tencent.mm.af.a.h.a(this.juZ, localus, this);
          getString(R.l.cUG);
          this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.cQF), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(2999632003072L, 22349);
              at.wS().c(paramIntent);
              GMTrace.o(2999632003072L, 22349);
            }
          });
          bool = true;
          break;
        }
        label279:
        bool = false;
      }
      else
      {
        GMTrace.o(2977620295680L, 22185);
        return;
        bool = false;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2977083424768L, 22181);
    super.onCreate(paramBundle);
    com.tencent.mm.af.x.FI().a(this.wpe, Looper.getMainLooper());
    this.fromScene = getIntent().getIntExtra("key_biz_chat_info_from_scene", -1);
    this.juZ = getIntent().getStringExtra("Chat_User");
    this.juT = getIntent().getLongExtra("key_biz_chat_id", -1L);
    this.woz = com.tencent.mm.af.x.FI().t(this.juT);
    this.wqb = this.woz.field_chatName;
    this.wqc = com.tencent.mm.af.a.e.jf(this.woz.field_bizChatServId);
    if (!this.wqc) {
      this.nMD = com.tencent.mm.af.x.FK().bl(this.woz.field_bizChatServId);
    }
    this.wqg = com.tencent.mm.af.x.FK().jp(this.juZ);
    MP();
    if ((this.woz == null) || (this.woz.field_bizChatServId == null) || (this.juZ == null))
    {
      GMTrace.o(2977083424768L, 22181);
      return;
    }
    if (this.woz.FU())
    {
      com.tencent.mm.af.x.FM();
      com.tencent.mm.af.a.h.ab(this.woz.field_bizChatServId, this.juZ);
      GMTrace.o(2977083424768L, 22181);
      return;
    }
    com.tencent.mm.af.x.FM();
    com.tencent.mm.af.a.h.a(this.woz.field_bizChatServId, this.juZ, this);
    GMTrace.o(2977083424768L, 22181);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2977486077952L, 22184);
    com.tencent.mm.ui.h.a.dismiss();
    com.tencent.mm.ui.h.a.dismiss();
    com.tencent.mm.af.x.FI().a(this.wpe);
    super.onDestroy();
    GMTrace.o(2977486077952L, 22184);
  }
  
  public void onPause()
  {
    GMTrace.i(2977351860224L, 22183);
    super.onPause();
    GMTrace.o(2977351860224L, 22183);
  }
  
  public void onResume()
  {
    GMTrace.i(2977217642496L, 22182);
    anA();
    anv();
    any();
    aXI();
    cbz();
    anw();
    this.htU.notifyDataSetChanged();
    super.onResume();
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
            GMTrace.i(2997350301696L, 22332);
            View localView = ((com.tencent.mm.ui.base.preference.a)BizChatroomInfoUI.a(BizChatroomInfoUI.this)).a(i, BizChatroomInfoUI.this.mqO);
            if (localView != null) {
              com.tencent.mm.ui.h.a.b(BizChatroomInfoUI.this.vKB.vKW, localView);
            }
            GMTrace.o(2997350301696L, 22332);
          }
        }, 10L);
      }
      this.jNK = true;
    }
    GMTrace.o(2977217642496L, 22182);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\BizChatroomInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */