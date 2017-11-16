package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.g.a.sh;
import com.tencent.mm.g.a.sh.a;
import com.tencent.mm.g.a.si;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.i;
import com.tencent.mm.network.ab;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.pluginsdk.ui.applet.a.b;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.e.a;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class NormalUserFooterPreference
  extends Preference
  implements j.a
{
  public MMActivity ezR;
  protected com.tencent.mm.sdk.e.k<e, String> gsv;
  public ProgressDialog htG;
  public x iBi;
  public String jjP;
  private boolean kEu;
  public Button mQO;
  public String nLA;
  public boolean nLx;
  public int nLz;
  public int nMJ;
  public long nNL;
  public boolean nNX;
  public boolean nNY;
  public boolean nNZ;
  public int nNb;
  public String nNj;
  public boolean nNp;
  public boolean nOa;
  public boolean nOb;
  public a nOc;
  public View nOd;
  public Button nOe;
  public Button nOf;
  public Button nOg;
  public View nOh;
  public Button nOi;
  public View nOj;
  public Button nOk;
  public Button nOl;
  public Button nOm;
  public Button nOn;
  public Button nOo;
  public Button nOp;
  public TextView nOq;
  public boolean nOr;
  public boolean nOs;
  
  public NormalUserFooterPreference(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6782961319936L, 50537);
    this.nNX = false;
    this.nNL = 0L;
    this.nNj = "";
    this.nLA = "";
    this.nNp = false;
    this.nOa = false;
    this.nOb = false;
    this.nOr = false;
    this.nMJ = 0;
    this.htG = null;
    this.nOs = false;
    this.jjP = null;
    this.gsv = new com.tencent.mm.sdk.e.k() {};
    this.ezR = ((MMActivity)paramContext);
    init();
    GMTrace.o(6782961319936L, 50537);
  }
  
  public NormalUserFooterPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6783095537664L, 50538);
    this.nNX = false;
    this.nNL = 0L;
    this.nNj = "";
    this.nLA = "";
    this.nNp = false;
    this.nOa = false;
    this.nOb = false;
    this.nOr = false;
    this.nMJ = 0;
    this.htG = null;
    this.nOs = false;
    this.jjP = null;
    this.gsv = new com.tencent.mm.sdk.e.k() {};
    this.ezR = ((MMActivity)paramContext);
    init();
    GMTrace.o(6783095537664L, 50538);
  }
  
  public NormalUserFooterPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6783229755392L, 50539);
    this.nNX = false;
    this.nNL = 0L;
    this.nNj = "";
    this.nLA = "";
    this.nNp = false;
    this.nOa = false;
    this.nOb = false;
    this.nOr = false;
    this.nMJ = 0;
    this.htG = null;
    this.nOs = false;
    this.jjP = null;
    this.gsv = new com.tencent.mm.sdk.e.k() {};
    this.ezR = ((MMActivity)paramContext);
    init();
    GMTrace.o(6783229755392L, 50539);
  }
  
  private void MP()
  {
    GMTrace.i(6783498190848L, 50541);
    if ((!this.kEu) || (this.iBi == null))
    {
      w.w("MicroMsg.NormalUserFooterPreference", "iniView : bindView = " + this.kEu + " contact = " + this.iBi);
      GMTrace.o(6783498190848L, 50541);
      return;
    }
    if (this.nOc != null) {
      this.nOc.yv();
    }
    aXK();
    GMTrace.o(6783498190848L, 50541);
  }
  
  private void init()
  {
    GMTrace.i(6783363973120L, 50540);
    this.kEu = false;
    this.nOc = null;
    GMTrace.o(6783363973120L, 50540);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(6784169279488L, 50546);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(6784169279488L, 50546);
      return;
    }
    if ((this.iBi != null) && ((paramString.equals(this.iBi.field_username)) || (paramString.equals(this.iBi.field_encryptUsername))))
    {
      at.AR();
      this.iBi = com.tencent.mm.y.c.yK().TE(this.iBi.field_username);
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6755312467968L, 50331);
          NormalUserFooterPreference.this.aXK();
          GMTrace.o(6755312467968L, 50331);
        }
      });
    }
    GMTrace.o(6784169279488L, 50546);
  }
  
  public final boolean a(x paramx, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt1, int paramInt2, boolean paramBoolean4, boolean paramBoolean5, long paramLong, String paramString2)
  {
    GMTrace.i(6783766626304L, 50543);
    ahL();
    if (paramx != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bg.nl(paramx.field_username).length() <= 0) {
        break label80;
      }
    }
    label80:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (!x.Tt(q.zE()).equals(paramx.field_username)) {
        break label86;
      }
      GMTrace.o(6783766626304L, 50543);
      return false;
      bool = false;
      break;
    }
    label86:
    this.iBi = paramx;
    this.nLA = paramString1;
    this.nLx = paramBoolean1;
    this.nLz = paramInt1;
    this.nNb = paramInt2;
    this.nNZ = bg.a(Boolean.valueOf(s.fA(paramx.field_username)), false);
    this.nNX = paramBoolean4;
    this.nNY = paramBoolean5;
    this.nNL = paramLong;
    this.nNj = paramString2;
    this.nOs = false;
    if (paramx.field_deleteFlag == 1)
    {
      paramBoolean1 = true;
      this.nNp = paramBoolean1;
      this.nOr = this.ezR.getIntent().getBooleanExtra("Contact_AlwaysShowSnsPreBtn", false);
      this.nMJ = this.ezR.getIntent().getIntExtra("add_more_friend_search_scene", 0);
      this.nOa = this.ezR.getIntent().getBooleanExtra("Contact_IsLbsChattingProfile", false);
      this.nOb = this.ezR.getIntent().getBooleanExtra("Contact_IsLbsGotoChatting", false);
      this.jjP = this.ezR.getIntent().getStringExtra("lbs_ticket");
      if (!q.fp(paramx.field_username))
      {
        at.AR();
        if (!com.tencent.mm.y.c.yS().has(paramx.field_username)) {
          break label330;
        }
      }
      this.nOc = new c();
      this.nOs = true;
    }
    for (;;)
    {
      MP();
      GMTrace.o(6783766626304L, 50543);
      return true;
      paramBoolean1 = false;
      break;
      label330:
      if (x.To(paramx.field_username))
      {
        this.nOc = new h();
      }
      else if (s.fP(paramx.field_username))
      {
        this.nOc = new d();
      }
      else if (s.fA(paramx.field_username))
      {
        this.nOc = new g();
      }
      else if (x.Tp(paramx.field_username))
      {
        this.nOc = new f();
      }
      else if ((com.tencent.mm.l.a.eE(paramx.field_type)) && (!x.fw(paramx.field_username)))
      {
        this.nOc = new c();
        this.nOs = true;
      }
      else if (paramBoolean2)
      {
        this.nOc = new j();
        this.nOs = true;
      }
      else if ((paramBoolean3) || (x.fw(paramx.field_username)))
      {
        this.nOc = new b();
      }
      else
      {
        this.nOc = new c();
        this.nOs = true;
      }
    }
  }
  
  public final boolean aXK()
  {
    GMTrace.i(6783900844032L, 50544);
    if ((this.nOr) && (com.tencent.mm.l.a.eE(this.iBi.field_type)))
    {
      this.nOp.setVisibility(0);
      GMTrace.o(6783900844032L, 50544);
      return true;
    }
    this.nOp.setVisibility(8);
    GMTrace.o(6783900844032L, 50544);
    return false;
  }
  
  public final void aXL()
  {
    GMTrace.i(6784303497216L, 50547);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.ezR, "android.permission.RECORD_AUDIO", 82, "", "");
    w.i("MicroMsg.NormalUserFooterPreference", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.ezR });
    if (!bool)
    {
      GMTrace.o(6784303497216L, 50547);
      return;
    }
    si localsi = new si();
    localsi.eXf.eHJ = 5;
    localsi.eXf.eDs = this.iBi.field_username;
    localsi.eXf.context = this.ezR;
    localsi.eXf.eXa = 4;
    com.tencent.mm.sdk.b.a.vgX.m(localsi);
    GMTrace.o(6784303497216L, 50547);
  }
  
  public final void aXM()
  {
    GMTrace.i(6784437714944L, 50548);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.ezR, "android.permission.CAMERA", 19, "", "");
    w.i("MicroMsg.NormalUserFooterPreference", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.ezR });
    if (!bool)
    {
      GMTrace.o(6784437714944L, 50548);
      return;
    }
    bool = com.tencent.mm.pluginsdk.h.a.a(this.ezR, "android.permission.RECORD_AUDIO", 19, "", "");
    w.i("MicroMsg.NormalUserFooterPreference", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.ezR });
    if (!bool)
    {
      GMTrace.o(6784437714944L, 50548);
      return;
    }
    si localsi = new si();
    localsi.eXf.eHJ = 5;
    localsi.eXf.eDs = this.iBi.field_username;
    localsi.eXf.context = this.ezR;
    localsi.eXf.eXa = 2;
    com.tencent.mm.sdk.b.a.vgX.m(localsi);
    GMTrace.o(6784437714944L, 50548);
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6784035061760L, 50545);
    if (this.nOc != null) {
      this.nOc.onDetach();
    }
    this.gsv.removeAll();
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    GMTrace.o(6784035061760L, 50545);
    return true;
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(6783632408576L, 50542);
    w.d("MicroMsg.NormalUserFooterPreference", "on bindView " + paramView.toString());
    this.nOd = paramView.findViewById(R.h.bqS);
    this.nOe = ((Button)paramView.findViewById(R.h.bri));
    this.nOf = ((Button)paramView.findViewById(R.h.bqx));
    this.nOi = ((Button)paramView.findViewById(R.h.brk));
    this.nOh = paramView.findViewById(R.h.brl);
    this.nOg = ((Button)paramView.findViewById(R.h.brj));
    this.nOm = ((Button)paramView.findViewById(R.h.bqs));
    this.nOj = paramView.findViewById(R.h.bqY);
    this.nOk = ((Button)paramView.findViewById(R.h.bqX));
    this.nOl = ((Button)paramView.findViewById(R.h.bqZ));
    this.mQO = ((Button)paramView.findViewById(R.h.bra));
    this.nOp = ((Button)paramView.findViewById(R.h.bqO));
    this.nOn = ((Button)paramView.findViewById(R.h.brm));
    this.nOo = ((Button)paramView.findViewById(R.h.bqv));
    this.nOq = ((TextView)paramView.findViewById(R.h.bqP));
    this.kEu = true;
    MP();
    super.onBindView(paramView);
    if ((this.ezR.getIntent().getBooleanExtra("Accept_NewFriend_FromOutside", false) == true) && (this.nOe != null)) {
      this.nOe.performClick();
    }
    GMTrace.o(6783632408576L, 50542);
  }
  
  abstract class a
    implements com.tencent.mm.ad.e
  {
    public boolean jqh;
    private com.tencent.mm.ui.tools.l nOu;
    
    public a()
    {
      GMTrace.i(6748735799296L, 50282);
      this.nOu = null;
      this.jqh = false;
      GMTrace.o(6748735799296L, 50282);
    }
    
    public final void EO(String paramString)
    {
      GMTrace.i(6749943758848L, 50291);
      if (bg.nm(paramString))
      {
        w.w("MicroMsg.NormalUserFooterPreference", "mod stranger remark, username is null");
        GMTrace.o(6749943758848L, 50291);
        return;
      }
      paramString = new Intent();
      paramString.putExtra("Contact_Scene", NormalUserFooterPreference.this.nLz);
      paramString.putExtra("Contact_mode_name_type", 0);
      paramString.putExtra("Contact_ModStrangerRemark", true);
      paramString.putExtra("Contact_User", NormalUserFooterPreference.this.iBi.field_username);
      paramString.putExtra("Contact_Nick", NormalUserFooterPreference.this.iBi.field_nickname);
      paramString.putExtra("Contact_RemarkName", NormalUserFooterPreference.this.iBi.field_conRemark);
      com.tencent.mm.plugin.profile.a.hnH.q(paramString, NormalUserFooterPreference.this.mContext);
      GMTrace.o(6749943758848L, 50291);
    }
    
    public void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
    {
      GMTrace.i(6749272670208L, 50286);
      w.i("MicroMsg.NormalUserFooterPreference", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " " + paramk.getType());
      GMTrace.o(6749272670208L, 50286);
    }
    
    public final void aEU()
    {
      int i = 7;
      GMTrace.i(16033247133696L, 119457);
      Intent localIntent = new Intent();
      switch (NormalUserFooterPreference.this.nLz)
      {
      default: 
        i = 999;
      }
      for (;;)
      {
        localIntent.putExtra("k_username", NormalUserFooterPreference.this.iBi.field_username);
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(i) }));
        com.tencent.mm.bj.d.b(NormalUserFooterPreference.this.ezR, "webview", ".ui.tools.WebViewUI", localIntent);
        GMTrace.o(16033247133696L, 119457);
        return;
        if (NormalUserFooterPreference.this.nNX) {}
        for (i = 2;; i = 1)
        {
          localIntent.putStringArrayListExtra("k_outside_expose_proof_item_list", com.tencent.mm.bc.a.lH(NormalUserFooterPreference.this.iBi.field_username));
          break;
        }
        if (NormalUserFooterPreference.this.nNX) {}
        for (i = 4;; i = 3)
        {
          localIntent.putStringArrayListExtra("k_outside_expose_proof_item_list", com.tencent.mm.bc.a.lI(NormalUserFooterPreference.this.iBi.field_username));
          break;
        }
        localIntent.putStringArrayListExtra("k_outside_expose_proof_item_list", com.tencent.mm.bc.a.s(7, NormalUserFooterPreference.this.iBi.field_username));
        continue;
        if (NormalUserFooterPreference.this.nNX) {}
        for (i = 6;; i = 5)
        {
          if (!NormalUserFooterPreference.this.nNX) {
            break label429;
          }
          localIntent.putExtra("k_outside_expose_proof_item_list", com.tencent.mm.bc.a.s(i, NormalUserFooterPreference.this.iBi.field_username));
          break;
        }
        label429:
        if (!bg.nm(NormalUserFooterPreference.this.iBi.vAa)) {}
        for (String str = NormalUserFooterPreference.this.iBi.vAa;; str = NormalUserFooterPreference.this.iBi.field_username)
        {
          localIntent.putExtra("k_outside_expose_proof_item_list", com.tencent.mm.bc.a.lJ(str));
          break;
        }
        i = 35;
        continue;
        localIntent.putExtra("k_outside_expose_proof_item_list", com.tencent.mm.bc.a.s(45, NormalUserFooterPreference.this.iBi.field_username));
        i = 45;
      }
    }
    
    protected abstract void aXN();
    
    protected final void aXO()
    {
      GMTrace.i(6749406887936L, 50287);
      NormalUserFooterPreference.this.ezR.a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6775981998080L, 50485);
          paramAnonymousMenuItem = new com.tencent.mm.ui.widget.f(NormalUserFooterPreference.this.ezR, com.tencent.mm.ui.widget.f.xpQ, false);
          paramAnonymousMenuItem.qil = new p.d()
          {
            public final void c(final MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(6743232872448L, 50241);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(6743232872448L, 50241);
                return;
                if (NormalUserFooterPreference.this.iBi.vb())
                {
                  s.m(NormalUserFooterPreference.this.iBi);
                  com.tencent.mm.ui.base.h.bm(NormalUserFooterPreference.this.ezR, NormalUserFooterPreference.this.ezR.getString(R.l.dlw));
                }
                for (;;)
                {
                  paramAnonymous2MenuItem = NormalUserFooterPreference.this;
                  at.AR();
                  paramAnonymous2MenuItem.iBi = com.tencent.mm.y.c.yK().TE(NormalUserFooterPreference.this.iBi.field_username);
                  GMTrace.o(6743232872448L, 50241);
                  return;
                  s.l(NormalUserFooterPreference.this.iBi);
                  com.tencent.mm.ui.base.h.bm(NormalUserFooterPreference.this.ezR, NormalUserFooterPreference.this.ezR.getString(R.l.djq));
                }
                paramAnonymous2MenuItem = new Intent();
                paramAnonymous2MenuItem.putExtra("sns_permission_userName", NormalUserFooterPreference.this.iBi.field_username);
                paramAnonymous2MenuItem.putExtra("sns_permission_anim", true);
                paramAnonymous2MenuItem.putExtra("sns_permission_block_scene", 1);
                com.tencent.mm.bj.d.b(NormalUserFooterPreference.this.ezR, "sns", ".ui.SnsPermissionUI", paramAnonymous2MenuItem);
                GMTrace.o(6743232872448L, 50241);
                return;
                paramAnonymous2MenuItem = NormalUserFooterPreference.a.this;
                final Object localObject1 = new Intent();
                ((Intent)localObject1).putExtra("Select_Talker_Name", paramAnonymous2MenuItem.nOt.iBi.field_username);
                ((Intent)localObject1).putExtra("Select_block_List", paramAnonymous2MenuItem.nOt.iBi.field_username);
                ((Intent)localObject1).putExtra("Select_Conv_Type", 3);
                ((Intent)localObject1).putExtra("Select_Send_Card", true);
                ((Intent)localObject1).putExtra("mutil_select_is_ret", true);
                com.tencent.mm.plugin.profile.a.hnH.a((Intent)localObject1, paramAnonymous2MenuItem.nOt.ezR);
                GMTrace.o(6743232872448L, 50241);
                return;
                NormalUserFooterPreference.this.gsv.bI("hide_btn");
                NormalUserFooterPreference.this.gsv.doNotify();
                NormalUserFooterPreference.a locala = NormalUserFooterPreference.a.this;
                paramAnonymous2MenuItem = locala.nOt;
                at.AR();
                paramAnonymous2MenuItem.iBi = com.tencent.mm.y.c.yK().TE(locala.nOt.iBi.field_username);
                if (!com.tencent.mm.l.a.eE(locala.nOt.iBi.field_type))
                {
                  locala.EO(locala.nOt.iBi.field_username);
                  GMTrace.o(6743232872448L, 50241);
                  return;
                }
                Intent localIntent = new Intent();
                localIntent.putExtra("Contact_Scene", locala.nOt.nLz);
                localIntent.putExtra("Contact_User", locala.nOt.iBi.field_username);
                localIntent.putExtra("Contact_RoomNickname", locala.nOt.ezR.getIntent().getStringExtra("Contact_RoomNickname"));
                localIntent.putExtra("contact_phone_number_list", locala.nOt.iBi.fjz);
                Object localObject2 = "";
                localObject1 = localObject2;
                String str;
                if (!locala.nOt.iBi.vg())
                {
                  paramAnonymous2MenuItem = null;
                  localObject1 = locala.nOt.ezR.getIntent().getStringExtra("Contact_Mobile_MD5");
                  str = locala.nOt.ezR.getIntent().getStringExtra("Contact_full_Mobile_MD5");
                  if ((!bg.nm((String)localObject1)) || (!bg.nm(str))) {
                    break label814;
                  }
                  if (!bg.nm(locala.nOt.iBi.field_username)) {
                    paramAnonymous2MenuItem = com.tencent.mm.modelfriend.af.If().jJ(locala.nOt.iBi.field_username);
                  }
                }
                for (;;)
                {
                  localObject1 = localObject2;
                  if (paramAnonymous2MenuItem != null)
                  {
                    localObject1 = localObject2;
                    if (!bg.nm(paramAnonymous2MenuItem.GS())) {
                      localObject1 = bg.nl(paramAnonymous2MenuItem.Ha()).replace(" ", "");
                    }
                  }
                  localIntent.putExtra("contact_phone_number_by_md5", (String)localObject1);
                  com.tencent.mm.plugin.profile.a.hnH.p(localIntent, locala.nOt.mContext);
                  GMTrace.o(6743232872448L, 50241);
                  return;
                  label814:
                  if ((!bg.nm((String)localObject1)) || (!bg.nm(str)))
                  {
                    localObject1 = com.tencent.mm.modelfriend.af.If().jK((String)localObject1);
                    if (localObject1 != null)
                    {
                      paramAnonymous2MenuItem = (MenuItem)localObject1;
                      if (!bg.nm(((com.tencent.mm.modelfriend.b)localObject1).GS())) {}
                    }
                    else
                    {
                      paramAnonymous2MenuItem = com.tencent.mm.modelfriend.af.If().jK(str);
                    }
                  }
                }
                if (NormalUserFooterPreference.this.iBi.uZ())
                {
                  NormalUserFooterPreference.a.this.aXT();
                  GMTrace.o(6743232872448L, 50241);
                  return;
                }
                paramAnonymous2MenuItem = View.inflate(NormalUserFooterPreference.this.mContext, R.i.cBt, null);
                paramAnonymous2MenuItem.setPadding(0, 0, 0, 0);
                localObject1 = (TextView)paramAnonymous2MenuItem.findViewById(R.h.bNj);
                ((TextView)localObject1).setPadding(0, 0, 0, 0);
                ((TextView)localObject1).setText(R.l.dka);
                localObject1 = (CheckBox)paramAnonymous2MenuItem.findViewById(R.h.bNh);
                ((CheckBox)localObject1).setChecked(false);
                localObject2 = (TextView)paramAnonymous2MenuItem.findViewById(R.h.bNi);
                ((TextView)localObject2).setText(R.l.dkb);
                if (NormalUserFooterPreference.this.iBi.getSource() == 18)
                {
                  ((CheckBox)localObject1).setVisibility(0);
                  ((TextView)localObject2).setVisibility(0);
                }
                for (;;)
                {
                  com.tencent.mm.ui.base.h.a(NormalUserFooterPreference.this.mContext, true, NormalUserFooterPreference.this.mContext.getString(R.l.djZ), paramAnonymous2MenuItem, NormalUserFooterPreference.this.mContext.getString(R.l.cTM), NormalUserFooterPreference.this.mContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
                  {
                    public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                    {
                      GMTrace.i(6819334324224L, 50808);
                      NormalUserFooterPreference.a.this.aXS();
                      if (NormalUserFooterPreference.this.iBi.getSource() == 18)
                      {
                        NormalUserFooterPreference.this.nLz = 9;
                        if (localObject1.isChecked()) {
                          NormalUserFooterPreference.a.this.aEU();
                        }
                      }
                      GMTrace.o(6819334324224L, 50808);
                    }
                  }, null);
                  GMTrace.o(6743232872448L, 50241);
                  return;
                  ((CheckBox)localObject1).setVisibility(8);
                  ((TextView)localObject2).setVisibility(8);
                }
                localObject1 = View.inflate(NormalUserFooterPreference.this.mContext, R.i.cBt, null);
                ((View)localObject1).setPadding(0, 0, 0, 0);
                localObject2 = (TextView)((View)localObject1).findViewById(R.h.bNj);
                ((TextView)localObject2).setPadding(0, 0, 0, 0);
                if (s.fA(NormalUserFooterPreference.this.iBi.field_username))
                {
                  paramAnonymous2MenuItem = NormalUserFooterPreference.this.mContext.getString(R.l.dmw, new Object[] { NormalUserFooterPreference.this.iBi.vk() });
                  ((TextView)localObject2).setText(paramAnonymous2MenuItem);
                  paramAnonymous2MenuItem = (CheckBox)((View)localObject1).findViewById(R.h.bNh);
                  paramAnonymous2MenuItem.setChecked(false);
                  localObject2 = (TextView)((View)localObject1).findViewById(R.h.bNi);
                  ((TextView)localObject2).setText(R.l.dkb);
                  if (NormalUserFooterPreference.this.iBi.getSource() != 18) {
                    break label1470;
                  }
                  paramAnonymous2MenuItem.setVisibility(0);
                  ((TextView)localObject2).setVisibility(0);
                }
                for (;;)
                {
                  com.tencent.mm.ui.base.h.a(NormalUserFooterPreference.this.mContext, true, NormalUserFooterPreference.this.mContext.getString(R.l.bqx), (View)localObject1, NormalUserFooterPreference.this.mContext.getString(R.l.cSt), NormalUserFooterPreference.this.mContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
                  {
                    public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                    {
                      GMTrace.i(6738132598784L, 50203);
                      NormalUserFooterPreference.a.this.aXR();
                      if (NormalUserFooterPreference.this.iBi.getSource() == 18)
                      {
                        NormalUserFooterPreference.this.nLz = 9;
                        if (paramAnonymous2MenuItem.isChecked()) {
                          NormalUserFooterPreference.a.this.aEU();
                        }
                      }
                      GMTrace.o(6738132598784L, 50203);
                    }
                  }, null, R.e.aMJ);
                  GMTrace.o(6743232872448L, 50241);
                  return;
                  paramAnonymous2MenuItem = NormalUserFooterPreference.this.mContext.getString(R.l.dmu, new Object[] { NormalUserFooterPreference.this.iBi.vk() });
                  break;
                  label1470:
                  paramAnonymous2MenuItem.setVisibility(8);
                  ((TextView)localObject2).setVisibility(8);
                }
                paramAnonymous2MenuItem = NormalUserFooterPreference.a.this;
                w.d("MicroMsg.NormalUserFooterPreference", "dealAddShortcut, username = " + paramAnonymous2MenuItem.nOt.iBi.field_username);
                com.tencent.mm.plugin.base.model.b.K(paramAnonymous2MenuItem.nOt.ezR, paramAnonymous2MenuItem.nOt.iBi.field_username);
                com.tencent.mm.sdk.platformtools.af.i(new NormalUserFooterPreference.a.10(paramAnonymous2MenuItem), 1000L);
                GMTrace.o(6743232872448L, 50241);
                return;
                NormalUserFooterPreference.a.this.aEU();
              }
            }
          };
          paramAnonymousMenuItem.qik = new p.c()
          {
            public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
            {
              GMTrace.i(6789537988608L, 50586);
              paramAnonymous2n.Z(1, R.l.djW, R.k.cKB);
              if (NormalUserFooterPreference.this.iBi.vb())
              {
                str = NormalUserFooterPreference.this.ezR.getResources().getString(R.l.dlv);
                paramAnonymous2n.a(2, str, R.k.cKD);
                paramAnonymous2n.Z(3, R.l.dkg, R.k.cKu);
                paramAnonymous2n.Z(4, R.l.dkH, R.k.cKE);
                paramAnonymous2n.Z(9, R.l.daI, R.k.cKg);
                if (!NormalUserFooterPreference.this.iBi.uZ()) {
                  break label235;
                }
              }
              label235:
              for (String str = NormalUserFooterPreference.this.ezR.getString(R.l.dkc);; str = NormalUserFooterPreference.this.ezR.getString(R.l.djZ))
              {
                paramAnonymous2n.a(5, str, R.k.cKd);
                if (!NormalUserFooterPreference.this.nOb) {
                  paramAnonymous2n.Z(6, R.l.cZl, R.k.cKi);
                }
                paramAnonymous2n.Z(7, R.l.diJ, R.k.cKj);
                GMTrace.o(6789537988608L, 50586);
                return;
                str = NormalUserFooterPreference.this.ezR.getResources().getString(R.l.djp);
                break;
              }
            }
          };
          paramAnonymousMenuItem.bFk();
          GMTrace.o(6775981998080L, 50485);
          return true;
        }
      });
      GMTrace.o(6749406887936L, 50287);
    }
    
    protected void aXP()
    {
      GMTrace.i(6749675323392L, 50289);
      if (NormalUserFooterPreference.this.nNp)
      {
        NormalUserFooterPreference.this.ezR.lg(false);
        GMTrace.o(6749675323392L, 50289);
        return;
      }
      if (!q.zE().equals(NormalUserFooterPreference.this.iBi.field_username)) {
        if (com.tencent.mm.l.a.eE(NormalUserFooterPreference.this.iBi.field_type))
        {
          if (!s.gf(NormalUserFooterPreference.this.iBi.field_username))
          {
            aXO();
            GMTrace.o(6749675323392L, 50289);
          }
        }
        else {
          p(false, false);
        }
      }
      GMTrace.o(6749675323392L, 50289);
    }
    
    public final void aXQ()
    {
      GMTrace.i(6749809541120L, 50290);
      if (this.nOu == null)
      {
        this.nOu = new com.tencent.mm.ui.tools.l(NormalUserFooterPreference.this.mContext);
        this.nOu.qik = new p.c()
        {
          public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
          {
            GMTrace.i(6813562961920L, 50765);
            paramAnonymousn.em(2, R.l.cTc);
            paramAnonymousn.em(1, R.l.cTd);
            GMTrace.o(6813562961920L, 50765);
          }
        };
        this.nOu.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
          {
            GMTrace.i(6742293348352L, 50234);
            switch (paramAnonymousMenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(6742293348352L, 50234);
              return;
              NormalUserFooterPreference.this.aXL();
              GMTrace.o(6742293348352L, 50234);
              return;
              NormalUserFooterPreference.this.aXM();
            }
          }
        };
      }
      this.nOu.bpI();
      GMTrace.o(6749809541120L, 50290);
    }
    
    protected final void aXR()
    {
      GMTrace.i(6750077976576L, 50292);
      com.tencent.mm.plugin.report.service.g.ork.i(14553, new Object[] { Integer.valueOf(2), Integer.valueOf(2), NormalUserFooterPreference.this.iBi.field_username });
      final String str = NormalUserFooterPreference.this.iBi.field_username;
      if (s.fA(str))
      {
        NormalUserFooterPreference.this.iBi.uB();
        at.AR();
        com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.c(str));
        at.AR();
        com.tencent.mm.y.c.yK().TK(str);
        at.AR();
        com.tencent.mm.y.c.yT().gI(str);
        GMTrace.o(6750077976576L, 50292);
        return;
      }
      this.jqh = false;
      Object localObject = NormalUserFooterPreference.this.mContext;
      NormalUserFooterPreference.this.mContext.getString(R.l.cUG);
      final r localr = com.tencent.mm.ui.base.h.a((Context)localObject, NormalUserFooterPreference.this.mContext.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(6792893431808L, 50611);
          NormalUserFooterPreference.a.this.jqh = true;
          GMTrace.o(6792893431808L, 50611);
        }
      });
      if (!this.jqh) {}
      for (localObject = com.tencent.mm.pluginsdk.wallet.e.PT(NormalUserFooterPreference.this.iBi.field_username);; localObject = null)
      {
        if (!bg.nm((String)localObject))
        {
          localr.dismiss();
          com.tencent.mm.ui.base.h.a(NormalUserFooterPreference.this.mContext, false, NormalUserFooterPreference.this.mContext.getString(R.l.ejx, new Object[] { localObject }), null, NormalUserFooterPreference.this.mContext.getString(R.l.dBn), NormalUserFooterPreference.this.mContext.getString(R.l.dmC), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(19594446110720L, 145990);
              com.tencent.mm.plugin.report.service.g.ork.i(14553, new Object[] { Integer.valueOf(2), Integer.valueOf(4), NormalUserFooterPreference.this.iBi.field_username });
              NormalUserFooterPreference.a.this.jqh = true;
              paramAnonymousDialogInterface = new Intent();
              paramAnonymousDialogInterface.putExtra("Chat_User", NormalUserFooterPreference.this.iBi.field_username);
              paramAnonymousDialogInterface.addFlags(67108864);
              com.tencent.mm.bj.d.a(NormalUserFooterPreference.this.mContext, ".ui.chatting.En_5b8fbb1e", paramAnonymousDialogInterface);
              GMTrace.o(19594446110720L, 145990);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(19594714546176L, 145992);
              com.tencent.mm.plugin.report.service.g.ork.i(14553, new Object[] { Integer.valueOf(2), Integer.valueOf(3), NormalUserFooterPreference.this.iBi.field_username });
              localr.show();
              NormalUserFooterPreference.a.this.jqh = false;
              NormalUserFooterPreference.a.this.py(str);
              GMTrace.o(19594714546176L, 145992);
            }
          }, -1, R.e.aMJ);
          GMTrace.o(6750077976576L, 50292);
          return;
        }
        py(str);
        GMTrace.o(6750077976576L, 50292);
        return;
      }
    }
    
    public final void aXS()
    {
      GMTrace.i(16033381351424L, 119458);
      NormalUserFooterPreference.this.nOq.setVisibility(0);
      s.h(NormalUserFooterPreference.this.iBi);
      NormalUserFooterPreference.this.iBi.uC();
      aXN();
      GMTrace.o(16033381351424L, 119458);
    }
    
    public final void aXT()
    {
      GMTrace.i(16033515569152L, 119459);
      NormalUserFooterPreference.this.nOq.setVisibility(8);
      s.i(NormalUserFooterPreference.this.iBi);
      NormalUserFooterPreference.this.iBi.uD();
      aXN();
      GMTrace.o(16033515569152L, 119459);
    }
    
    protected void onDetach()
    {
      GMTrace.i(6749138452480L, 50285);
      GMTrace.o(6749138452480L, 50285);
    }
    
    protected final void p(final boolean paramBoolean1, final boolean paramBoolean2)
    {
      GMTrace.i(6749541105664L, 50288);
      if ((paramBoolean1) && (paramBoolean2))
      {
        GMTrace.o(6749541105664L, 50288);
        return;
      }
      NormalUserFooterPreference.this.ezR.a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6757862604800L, 50350);
          paramAnonymousMenuItem = new com.tencent.mm.ui.widget.f(NormalUserFooterPreference.this.ezR, com.tencent.mm.ui.widget.f.xpQ, false);
          paramAnonymousMenuItem.qil = new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(6742561783808L, 50236);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(6742561783808L, 50236);
                return;
                NormalUserFooterPreference.a.this.EO(NormalUserFooterPreference.this.iBi.field_username);
                GMTrace.o(6742561783808L, 50236);
                return;
                NormalUserFooterPreference.a.this.aXT();
                GMTrace.o(6742561783808L, 50236);
                return;
                com.tencent.mm.ui.base.h.a(NormalUserFooterPreference.this.mContext, NormalUserFooterPreference.this.mContext.getString(R.l.dka), NormalUserFooterPreference.this.mContext.getString(R.l.djZ), new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                  {
                    GMTrace.i(6754238726144L, 50323);
                    NormalUserFooterPreference.a.this.aXS();
                    GMTrace.o(6754238726144L, 50323);
                  }
                }, null);
              }
            }
          };
          paramAnonymousMenuItem.qik = new p.c()
          {
            public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
            {
              GMTrace.i(6816918405120L, 50790);
              if (!NormalUserFooterPreference.a.11.this.nOA) {
                paramAnonymous2n.Z(1, R.l.djW, R.k.cKB);
              }
              if (!NormalUserFooterPreference.a.11.this.nOB)
              {
                if (NormalUserFooterPreference.this.iBi.uZ())
                {
                  paramAnonymous2n.Z(8, R.l.dkc, R.k.cKd);
                  GMTrace.o(6816918405120L, 50790);
                  return;
                }
                if (!s.fB(NormalUserFooterPreference.this.iBi.field_username)) {
                  paramAnonymous2n.Z(5, R.l.djZ, R.k.cKd);
                }
              }
              GMTrace.o(6816918405120L, 50790);
            }
          };
          paramAnonymousMenuItem.bFk();
          GMTrace.o(6757862604800L, 50350);
          return true;
        }
      });
      GMTrace.o(6749541105664L, 50288);
    }
    
    public final void py(String paramString)
    {
      Object localObject2 = null;
      Object localObject1 = null;
      GMTrace.i(19594177675264L, 145988);
      NormalUserFooterPreference.this.iBi.uB();
      at.AR();
      com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.c(paramString));
      bc.a(paramString, new bc.a()
      {
        public final void Bk()
        {
          GMTrace.i(19594043457536L, 145987);
          if (NormalUserFooterPreference.this.htG != null) {
            NormalUserFooterPreference.this.htG.dismiss();
          }
          GMTrace.o(19594043457536L, 145987);
        }
        
        public final boolean Bl()
        {
          GMTrace.i(19593909239808L, 145986);
          boolean bool = NormalUserFooterPreference.a.this.jqh;
          GMTrace.o(19593909239808L, 145986);
          return bool;
        }
      });
      at.AR();
      com.tencent.mm.y.c.yK().a(paramString, NormalUserFooterPreference.this.iBi);
      at.AR();
      com.tencent.mm.y.c.yP().TN(paramString);
      switch (NormalUserFooterPreference.this.nLz)
      {
      default: 
        if (NormalUserFooterPreference.this.nLz == 9)
        {
          w.i("MicroMsg.NormalUserFooterPreference", "add scene unkown, check the contact getsource: " + NormalUserFooterPreference.this.iBi.getSource());
          switch (NormalUserFooterPreference.this.iBi.getSource())
          {
          }
        }
        break;
      }
      for (;;)
      {
        if (NormalUserFooterPreference.this.nNb != 0) {
          break label539;
        }
        paramString = new Intent();
        paramString.addFlags(67108864);
        com.tencent.mm.plugin.profile.a.hnH.s(paramString, NormalUserFooterPreference.this.mContext);
        GMTrace.o(19594177675264L, 145988);
        return;
        localObject1 = com.tencent.mm.modelfriend.af.Ik().jV(paramString);
        if (localObject1 == null) {
          break;
        }
        ((ad)localObject1).gDW = 1;
        com.tencent.mm.modelfriend.af.Ik().a(((ad)localObject1).gDV, (ad)localObject1);
        break;
        localObject1 = com.tencent.mm.modelfriend.af.If().jJ(paramString);
        if ((localObject1 != null) && (!bg.nm(((com.tencent.mm.modelfriend.b)localObject1).gCw)))
        {
          ((com.tencent.mm.modelfriend.b)localObject1).status = 1;
          com.tencent.mm.modelfriend.af.If().a(((com.tencent.mm.modelfriend.b)localObject1).GS(), (com.tencent.mm.modelfriend.b)localObject1);
        }
        com.tencent.mm.modelsimple.d.B(NormalUserFooterPreference.this.mContext, paramString);
        break;
        com.tencent.mm.modelsimple.d.B(NormalUserFooterPreference.this.mContext, paramString);
        break;
        Object localObject3 = com.tencent.mm.modelfriend.af.Ig();
        String str = "select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend   where facebookfriend.username = \"" + paramString + "\"";
        localObject3 = ((i)localObject3).goN.a(str, null, 2);
        if (localObject3 == null) {}
        while (localObject1 != null)
        {
          ((com.tencent.mm.modelfriend.h)localObject1).status = 100;
          com.tencent.mm.modelfriend.af.Ig().a((com.tencent.mm.modelfriend.h)localObject1);
          break;
          localObject1 = localObject2;
          if (((Cursor)localObject3).moveToFirst())
          {
            localObject1 = new com.tencent.mm.modelfriend.h();
            ((com.tencent.mm.modelfriend.h)localObject1).b((Cursor)localObject3);
          }
          ((Cursor)localObject3).close();
        }
        com.tencent.mm.modelfriend.af.In().D(paramString, 2);
        break;
        w.i("MicroMsg.NormalUserFooterPreference", "delete the system contact info added by wechat");
        com.tencent.mm.modelsimple.d.B(NormalUserFooterPreference.this.mContext, paramString);
      }
      label539:
      NormalUserFooterPreference.this.ezR.setResult(-1, NormalUserFooterPreference.this.ezR.getIntent().putExtra("_delete_ok_", true));
      ((Activity)NormalUserFooterPreference.this.mContext).finish();
      GMTrace.o(19594177675264L, 145988);
    }
    
    protected void yv()
    {
      GMTrace.i(6749004234752L, 50284);
      aXN();
      aXP();
      NormalUserFooterPreference.this.mQO.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6737327292416L, 50197);
          if (NormalUserFooterPreference.this.nNZ)
          {
            paramAnonymousView = NormalUserFooterPreference.a.this;
            localObject = paramAnonymousView.nOt.iBi.field_username;
            Intent localIntent = new Intent();
            localIntent.addFlags(67108864);
            if (paramAnonymousView.nOt.nLx)
            {
              localIntent.putExtra("Chat_User", (String)localObject);
              localIntent.putExtra("Chat_Mode", 1);
              ((Activity)paramAnonymousView.nOt.mContext).setResult(-1, localIntent);
              GMTrace.o(6737327292416L, 50197);
              return;
            }
            localIntent.putExtra("Chat_User", (String)localObject);
            localIntent.putExtra("Chat_Mode", 1);
            com.tencent.mm.plugin.profile.a.hnH.e(localIntent, paramAnonymousView.nOt.mContext);
            GMTrace.o(6737327292416L, 50197);
            return;
          }
          paramAnonymousView = NormalUserFooterPreference.a.this;
          Object localObject = new Intent();
          ((Intent)localObject).addFlags(67108864);
          if (paramAnonymousView.nOt.nLx)
          {
            ((Intent)localObject).putExtra("Chat_User", paramAnonymousView.nOt.iBi.field_username);
            ((Intent)localObject).putExtra("Chat_Mode", 1);
            ((Activity)paramAnonymousView.nOt.mContext).setResult(-1, (Intent)localObject);
            GMTrace.o(6737327292416L, 50197);
            return;
          }
          ((Intent)localObject).putExtra("Chat_User", paramAnonymousView.nOt.iBi.field_username);
          ((Intent)localObject).putExtra("Chat_Mode", 1);
          com.tencent.mm.plugin.profile.a.hnH.e((Intent)localObject, paramAnonymousView.nOt.mContext);
          GMTrace.o(6737327292416L, 50197);
        }
      });
      NormalUserFooterPreference.this.nOp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6752896548864L, 50313);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("sns_permission_userName", NormalUserFooterPreference.this.iBi.field_username);
          paramAnonymousView.putExtra("sns_permission_anim", true);
          paramAnonymousView.putExtra("sns_permission_block_scene", 4);
          com.tencent.mm.bj.d.b(NormalUserFooterPreference.this.ezR, "sns", ".ui.SnsPermissionUI", paramAnonymousView);
          GMTrace.o(6752896548864L, 50313);
        }
      });
      NormalUserFooterPreference.this.nOn.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6753701855232L, 50319);
          paramAnonymousView = NormalUserFooterPreference.a.this;
          Object localObject = new sh();
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          if ((!paramAnonymousView.nOt.iBi.field_username.equals(((sh)localObject).eXb.eDs)) && ((((sh)localObject).eXb.eXd) || (((sh)localObject).eXb.eXe)))
          {
            if (((sh)localObject).eXb.eXc) {}
            for (int i = R.l.dbN;; i = R.l.dbO)
            {
              Toast.makeText(paramAnonymousView.nOt.ezR.vKB.vKW, i, 0).show();
              w.i("MicroMsg.NormalUserFooterPreference", "voip is running, can't do this");
              GMTrace.o(6753701855232L, 50319);
              return;
            }
          }
          if (!com.tencent.mm.p.a.aP(paramAnonymousView.nOt.ezR))
          {
            localObject = new rb();
            ((rb)localObject).eVS.eVU = true;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
            localObject = ((rb)localObject).eVT.eVW;
            if (!bg.nm((String)localObject))
            {
              w.v("MicroMsg.NormalUserFooterPreference", "Talkroom is on: " + (String)localObject);
              com.tencent.mm.ui.base.h.a(paramAnonymousView.nOt.ezR, paramAnonymousView.nOt.ezR.getString(R.l.edN), "", paramAnonymousView.nOt.ezR.getString(R.l.cTM), paramAnonymousView.nOt.ezR.getString(R.l.cSk), new NormalUserFooterPreference.a.2(paramAnonymousView), new NormalUserFooterPreference.a.3(paramAnonymousView));
              GMTrace.o(6753701855232L, 50319);
              return;
            }
            paramAnonymousView.aXQ();
          }
          GMTrace.o(6753701855232L, 50319);
        }
      });
      NormalUserFooterPreference.this.nOi.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6790477512704L, 50593);
          NormalUserFooterPreference.a.this.aEU();
          GMTrace.o(6790477512704L, 50593);
        }
      });
      NormalUserFooterPreference.this.nOk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6720415858688L, 50071);
          NormalUserFooterPreference.a.this.aEU();
          GMTrace.o(6720415858688L, 50071);
        }
      });
      NormalUserFooterPreference.this.nOo.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6773431861248L, 50466);
          NormalUserFooterPreference.a.this.aEU();
          GMTrace.o(6773431861248L, 50466);
        }
      });
      GMTrace.o(6749004234752L, 50284);
    }
  }
  
  final class b
    extends NormalUserFooterPreference.c
  {
    public b()
    {
      super();
      GMTrace.i(6727529398272L, 50124);
      GMTrace.o(6727529398272L, 50124);
    }
    
    protected final void aXN()
    {
      GMTrace.i(6727797833728L, 50126);
      NormalUserFooterPreference.this.nOd.setVisibility(8);
      if ((!com.tencent.mm.l.a.eE(NormalUserFooterPreference.this.iBi.field_type)) || ((com.tencent.mm.l.a.eE(NormalUserFooterPreference.this.iBi.field_type)) && (x.fw(NormalUserFooterPreference.this.iBi.field_username))))
      {
        NormalUserFooterPreference.this.nOj.setVisibility(0);
        NormalUserFooterPreference.this.mQO.setVisibility(8);
        NormalUserFooterPreference.this.nOp.setVisibility(8);
        NormalUserFooterPreference.this.nOn.setVisibility(8);
      }
      for (;;)
      {
        NormalUserFooterPreference.this.nOm.setVisibility(8);
        NormalUserFooterPreference.this.nOo.setVisibility(8);
        NormalUserFooterPreference.this.nOq.setVisibility(8);
        if (NormalUserFooterPreference.this.nOa)
        {
          NormalUserFooterPreference.this.nOj.setVisibility(8);
          NormalUserFooterPreference.this.nOm.setVisibility(0);
          NormalUserFooterPreference.this.nOm.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6803496632320L, 50690);
              NormalUserFooterPreference.b.this.aXU();
              GMTrace.o(6803496632320L, 50690);
            }
          });
        }
        NormalUserFooterPreference.this.nOl.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6729811099648L, 50141);
            if ((NormalUserFooterPreference.this.nOb) && (com.tencent.mm.bh.a.bIM()))
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("Chat_User", NormalUserFooterPreference.this.iBi.field_encryptUsername);
              paramAnonymousView.putExtra("lbs_mode", true);
              paramAnonymousView.putExtra("lbs_ticket", NormalUserFooterPreference.this.jjP);
              paramAnonymousView.putExtra("add_scene", NormalUserFooterPreference.this.nLz);
              com.tencent.mm.plugin.profile.a.hnH.e(paramAnonymousView, NormalUserFooterPreference.this.ezR);
              GMTrace.o(6729811099648L, 50141);
              return;
            }
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("Contact_User", NormalUserFooterPreference.this.iBi.field_username);
            paramAnonymousView.putExtra("Contact_Scene", NormalUserFooterPreference.this.nLz);
            com.tencent.mm.plugin.profile.a.hnH.a(paramAnonymousView, NormalUserFooterPreference.this.mContext);
            GMTrace.o(6729811099648L, 50141);
          }
        });
        GMTrace.o(6727797833728L, 50126);
        return;
        NormalUserFooterPreference.this.nOj.setVisibility(8);
        NormalUserFooterPreference.this.mQO.setVisibility(0);
        if ((NormalUserFooterPreference.this.aXK()) || (NormalUserFooterPreference.this.iBi.field_username.equals(q.zE()))) {
          break;
        }
        NormalUserFooterPreference.this.nOn.setVisibility(0);
      }
    }
    
    protected final void aXP()
    {
      GMTrace.i(6727663616000L, 50125);
      if (NormalUserFooterPreference.this.iBi == null)
      {
        w.e("MicroMsg.NormalUserFooterPreference", "contact is null in NearByFriendHandler");
        GMTrace.o(6727663616000L, 50125);
        return;
      }
      if ((!com.tencent.mm.l.a.eE(NormalUserFooterPreference.this.iBi.field_type)) || ((com.tencent.mm.l.a.eE(NormalUserFooterPreference.this.iBi.field_type)) && (x.fw(NormalUserFooterPreference.this.iBi.field_username))))
      {
        if (x.fw(NormalUserFooterPreference.this.iBi.field_username))
        {
          p(true, true);
          GMTrace.o(6727663616000L, 50125);
          return;
        }
        p(false, true);
        GMTrace.o(6727663616000L, 50125);
        return;
      }
      aXO();
      GMTrace.o(6727663616000L, 50125);
    }
  }
  
  class c
    extends NormalUserFooterPreference.a
  {
    public c()
    {
      super();
      GMTrace.i(6814368268288L, 50771);
      GMTrace.o(6814368268288L, 50771);
    }
    
    public final void aCa()
    {
      int i = 0;
      GMTrace.i(16033784004608L, 119461);
      if ((int)NormalUserFooterPreference.this.iBi.fTq == 0)
      {
        at.AR();
        com.tencent.mm.y.c.yK().S(NormalUserFooterPreference.this.iBi);
        at.AR();
        com.tencent.mm.y.c.yK().TE(NormalUserFooterPreference.this.iBi.field_username);
      }
      if ((int)NormalUserFooterPreference.this.iBi.fTq <= 0)
      {
        w.e("MicroMsg.NormalUserFooterPreference", "addContact : insert contact failed");
        GMTrace.o(16033784004608L, 119461);
        return;
      }
      Object localObject;
      com.tencent.mm.plugin.report.service.g localg;
      String str;
      if ((!com.tencent.mm.l.a.eE(NormalUserFooterPreference.this.iBi.field_type)) && (NormalUserFooterPreference.this.nLz == 15))
      {
        localObject = com.tencent.mm.modelfriend.af.If().jJ(NormalUserFooterPreference.this.iBi.field_username);
        if (localObject != null)
        {
          localg = com.tencent.mm.plugin.report.service.g.ork;
          str = NormalUserFooterPreference.this.iBi.field_username;
          if (!bg.nm(((com.tencent.mm.modelfriend.b)localObject).GS())) {
            break label290;
          }
          if (NormalUserFooterPreference.this.iBi.fjz.toString().split(",").length < 5) {
            break label295;
          }
        }
      }
      label290:
      label295:
      for (int j = 5;; j = NormalUserFooterPreference.this.iBi.fjz.toString().split(",").length)
      {
        localg.i(12040, new Object[] { str, Integer.valueOf(3), Integer.valueOf(i), Integer.valueOf(j) });
        s.p(NormalUserFooterPreference.this.iBi);
        localObject = NormalUserFooterPreference.this;
        at.AR();
        ((NormalUserFooterPreference)localObject).iBi = com.tencent.mm.y.c.yK().TE(NormalUserFooterPreference.this.iBi.field_username);
        aXN();
        GMTrace.o(16033784004608L, 119461);
        return;
        i = 1;
        break;
      }
    }
    
    protected void aXN()
    {
      GMTrace.i(6814770921472L, 50774);
      boolean bool;
      if (!s.gm(NormalUserFooterPreference.this.iBi.field_username))
      {
        bool = true;
        Assert.assertTrue(bool);
        NormalUserFooterPreference.this.nOd.setVisibility(8);
        NormalUserFooterPreference.this.nOj.setVisibility(8);
        if (!NormalUserFooterPreference.this.nNp) {
          break label198;
        }
        NormalUserFooterPreference.this.nOf.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6769405329408L, 50436);
            NormalUserFooterPreference.c.this.aXR();
            GMTrace.o(6769405329408L, 50436);
          }
        });
        if (!com.tencent.mm.l.a.eE(NormalUserFooterPreference.this.iBi.field_type)) {
          break label183;
        }
        NormalUserFooterPreference.this.nOf.setVisibility(0);
      }
      for (;;)
      {
        NormalUserFooterPreference.this.nOm.setVisibility(8);
        NormalUserFooterPreference.this.mQO.setVisibility(8);
        NormalUserFooterPreference.this.nOp.setVisibility(8);
        NormalUserFooterPreference.this.nOn.setVisibility(8);
        NormalUserFooterPreference.this.nOq.setVisibility(8);
        GMTrace.o(6814770921472L, 50774);
        return;
        bool = false;
        break;
        label183:
        NormalUserFooterPreference.this.nOf.setVisibility(8);
      }
      label198:
      NormalUserFooterPreference.this.nOm.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6743903961088L, 50246);
          NormalUserFooterPreference.c.this.aXU();
          if (NormalUserFooterPreference.this.nMJ != 0) {
            com.tencent.mm.plugin.report.service.g.ork.i(11263, new Object[] { Integer.valueOf(NormalUserFooterPreference.this.nMJ), NormalUserFooterPreference.this.iBi.field_username });
          }
          GMTrace.o(6743903961088L, 50246);
        }
      });
      if (!com.tencent.mm.l.a.eE(NormalUserFooterPreference.this.iBi.field_type))
      {
        NormalUserFooterPreference.this.nOm.setVisibility(0);
        NormalUserFooterPreference.this.mQO.setVisibility(8);
        NormalUserFooterPreference.this.nOp.setVisibility(8);
        NormalUserFooterPreference.this.nOn.setVisibility(8);
        if (NormalUserFooterPreference.this.iBi.uZ())
        {
          NormalUserFooterPreference.this.nOq.setVisibility(0);
          GMTrace.o(6814770921472L, 50774);
        }
      }
      else
      {
        NormalUserFooterPreference.this.nOm.setVisibility(8);
        NormalUserFooterPreference.this.mQO.setVisibility(0);
        if ((!NormalUserFooterPreference.this.aXK()) && (!NormalUserFooterPreference.this.iBi.field_username.equals(q.zE())) && (!s.gm(NormalUserFooterPreference.this.iBi.field_username)) && (!s.gf(NormalUserFooterPreference.this.iBi.field_username))) {
          NormalUserFooterPreference.this.nOn.setVisibility(0);
        }
        for (;;)
        {
          at.AR();
          if (!com.tencent.mm.y.c.yK().TH(NormalUserFooterPreference.this.iBi.field_username)) {
            break;
          }
          NormalUserFooterPreference.this.nOo.setVisibility(0);
          NormalUserFooterPreference.this.nLz = NormalUserFooterPreference.this.iBi.getSource();
          break;
          NormalUserFooterPreference.this.nOn.setVisibility(8);
        }
      }
      NormalUserFooterPreference.this.nOq.setVisibility(8);
      GMTrace.o(6814770921472L, 50774);
    }
    
    protected final void aXU()
    {
      GMTrace.i(6814905139200L, 50775);
      if ((int)NormalUserFooterPreference.this.iBi.fTq == 0)
      {
        at.AR();
        if (com.tencent.mm.y.c.yK().S(NormalUserFooterPreference.this.iBi) != -1)
        {
          localObject1 = NormalUserFooterPreference.this;
          at.AR();
          ((NormalUserFooterPreference)localObject1).iBi = com.tencent.mm.y.c.yK().TE(NormalUserFooterPreference.this.iBi.field_username);
        }
      }
      final Object localObject2;
      final Object localObject3;
      if ((NormalUserFooterPreference.this.nNY) || (NormalUserFooterPreference.this.nLz == 12))
      {
        w.d("MicroMsg.NormalUserFooterPreference", "qqNum " + NormalUserFooterPreference.this.nNL + " qqReamrk " + NormalUserFooterPreference.this.nNj);
        if ((NormalUserFooterPreference.this.nNL != 0L) && (NormalUserFooterPreference.this.nNj != null) && (!NormalUserFooterPreference.this.nNj.equals("")))
        {
          localObject1 = com.tencent.mm.modelfriend.af.Ik().am(NormalUserFooterPreference.this.nNL);
          if (localObject1 == null)
          {
            localObject1 = new ad();
            ((ad)localObject1).eCQ = "";
            ((ad)localObject1).gDV = NormalUserFooterPreference.this.nNL;
            ((ad)localObject1).gEd = NormalUserFooterPreference.this.nNj;
            ((ad)localObject1).username = NormalUserFooterPreference.this.iBi.field_username;
            ((ad)localObject1).Id();
            com.tencent.mm.modelfriend.af.Ik().a((ad)localObject1);
          }
        }
        else
        {
          localObject2 = NormalUserFooterPreference.this.ezR.getIntent().getStringExtra("Contact_Mobile_MD5");
          localObject1 = NormalUserFooterPreference.this.ezR.getIntent().getStringExtra("Contact_full_Mobile_MD5");
          localObject2 = bg.nl((String)localObject2);
          localObject1 = bg.nl((String)localObject1);
          if ((!((String)localObject2).equals("")) || (!((String)localObject1).equals("")))
          {
            localObject3 = com.tencent.mm.modelfriend.af.If().jK((String)localObject2);
            if (localObject3 != null) {
              break label890;
            }
            localObject3 = com.tencent.mm.modelfriend.af.If().jK((String)localObject1);
            localObject2 = localObject1;
          }
        }
      }
      label890:
      for (final Object localObject1 = localObject3;; localObject1 = localObject3)
      {
        if (localObject1 != null) {
          com.tencent.mm.modelfriend.af.If().a((String)localObject2, (com.tencent.mm.modelfriend.b)localObject1);
        }
        localObject2 = new com.tencent.mm.pluginsdk.ui.applet.a(NormalUserFooterPreference.this.mContext, new a.a()
        {
          public final void a(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, String paramAnonymousString1, String paramAnonymousString2)
          {
            GMTrace.i(6744440832000L, 50250);
            if (paramAnonymousBoolean1)
            {
              NormalUserFooterPreference.this.gsv.bI("hide_btn");
              NormalUserFooterPreference.this.gsv.doNotify();
              NormalUserFooterPreference.this.nOr = true;
              NormalUserFooterPreference.c.this.aCa();
            }
            for (;;)
            {
              if ((paramAnonymousBoolean1) || (paramAnonymousBoolean2))
              {
                paramAnonymousString1 = NormalUserFooterPreference.this.ezR.getIntent();
                int i = paramAnonymousString1.getIntExtra("search_kvstat_scene", 0);
                int j = paramAnonymousString1.getIntExtra("search_kvstat_position", 0);
                if ((i > 0) && (j > 0)) {
                  com.tencent.mm.plugin.report.service.g.ork.i(10991, new Object[] { Integer.valueOf(i), Integer.valueOf(6), Integer.valueOf(j) });
                }
              }
              GMTrace.o(6744440832000L, 50250);
              return;
              if (paramAnonymousBoolean2) {
                com.tencent.mm.bc.l.ML().J(paramAnonymousString1, 2);
              } else {
                w.e("MicroMsg.NormalUserFooterPreference", "canAddContact fail, maybe interrupt by IOnNeedSentVerify, username = " + paramAnonymousString1);
              }
            }
          }
        });
        localObject3 = new LinkedList();
        ((LinkedList)localObject3).add(Integer.valueOf(NormalUserFooterPreference.this.nLz));
        localObject1 = NormalUserFooterPreference.this.ezR.getIntent().getStringExtra("source_from_user_name");
        final String str = NormalUserFooterPreference.this.ezR.getIntent().getStringExtra("source_from_nick_name");
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).twr = ((String)localObject1);
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).tws = str;
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).twn = new a.b()
        {
          public final boolean aJw()
          {
            GMTrace.i(6727395180544L, 50123);
            String str = NormalUserFooterPreference.this.ezR.getIntent().getStringExtra("room_name");
            Intent localIntent = new Intent(NormalUserFooterPreference.this.ezR, SayHiWithSnsPermissionUI.class);
            localIntent.putExtra("Contact_User", NormalUserFooterPreference.this.iBi.field_username);
            localIntent.putExtra("Contact_Nick", NormalUserFooterPreference.this.iBi.field_nickname);
            localIntent.putExtra("Contact_RemarkName", NormalUserFooterPreference.this.iBi.field_conRemark);
            if ((NormalUserFooterPreference.this.nLz == 14) || (NormalUserFooterPreference.this.nLz == 8)) {
              localIntent.putExtra("Contact_RoomNickname", NormalUserFooterPreference.this.ezR.getIntent().getStringExtra("Contact_RoomNickname"));
            }
            localIntent.putExtra("Contact_Scene", NormalUserFooterPreference.this.nLz);
            localIntent.putExtra("room_name", str);
            localIntent.putExtra("source_from_user_name", localObject1);
            localIntent.putExtra("source_from_nick_name", str);
            localIntent.putExtra("sayhi_with_sns_perm_send_verify", true);
            localIntent.putExtra("sayhi_with_sns_perm_add_remark", true);
            localIntent.putExtra("sayhi_with_sns_perm_set_label", false);
            NormalUserFooterPreference.this.ezR.startActivity(localIntent);
            GMTrace.o(6727395180544L, 50123);
            return true;
          }
        };
        str = NormalUserFooterPreference.this.ezR.getIntent().getStringExtra("room_name");
        localObject1 = NormalUserFooterPreference.this.ezR.getIntent().getStringExtra(e.a.vGE);
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).Pd((String)localObject1);
          ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).b(NormalUserFooterPreference.this.iBi.field_username, "", (LinkedList)localObject3);
          GMTrace.o(6814905139200L, 50775);
          return;
          ((ad)localObject1).gDV = NormalUserFooterPreference.this.nNL;
          ((ad)localObject1).gEd = NormalUserFooterPreference.this.nNj;
          ((ad)localObject1).username = NormalUserFooterPreference.this.iBi.field_username;
          ((ad)localObject1).Id();
          com.tencent.mm.modelfriend.af.Ik().a(NormalUserFooterPreference.this.nNL, (ad)localObject1);
          break;
          if ((NormalUserFooterPreference.this.nLz != 58) && (NormalUserFooterPreference.this.nLz != 59) && (NormalUserFooterPreference.this.nLz != 60)) {
            break;
          }
          com.tencent.mm.modelfriend.af.In().D(NormalUserFooterPreference.this.iBi.field_username, 1);
          break;
        }
        if (TextUtils.isEmpty(str))
        {
          ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).c(NormalUserFooterPreference.this.iBi.field_username, (LinkedList)localObject3);
          GMTrace.o(6814905139200L, 50775);
          return;
        }
        if (!TextUtils.isEmpty(((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).nLA))
        {
          ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).b(NormalUserFooterPreference.this.iBi.field_username, str, (LinkedList)localObject3);
          GMTrace.o(6814905139200L, 50775);
          return;
        }
        at.AR();
        localObject1 = com.tencent.mm.y.c.yK().TE(NormalUserFooterPreference.this.iBi.field_username);
        if (localObject1 != null) {}
        for (localObject1 = bg.aq(((com.tencent.mm.g.b.af)localObject1).fjA, "");; localObject1 = "")
        {
          w.i("MicroMsg.NormalUserFooterPreference", "dkverify footer add:%s chat:%s ticket:%s", new Object[] { NormalUserFooterPreference.this.iBi.field_username, str, localObject1 });
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            break;
          }
          ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).Pd((String)localObject1);
          ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).b(NormalUserFooterPreference.this.iBi.field_username, str, (LinkedList)localObject3);
          GMTrace.o(6814905139200L, 50775);
          return;
        }
        ak.a.gmX.a(NormalUserFooterPreference.this.iBi.field_username, str, new ak.b.a()
        {
          public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(6794369826816L, 50622);
            at.AR();
            paramAnonymousString = com.tencent.mm.y.c.yK().TE(NormalUserFooterPreference.this.iBi.field_username);
            if (paramAnonymousString != null) {}
            for (paramAnonymousString = bg.aq(paramAnonymousString.fjA, "");; paramAnonymousString = "")
            {
              localObject2.Pd(paramAnonymousString);
              localObject2.b(NormalUserFooterPreference.this.iBi.field_username, str, localObject3);
              GMTrace.o(6794369826816L, 50622);
              return;
            }
          }
        });
        GMTrace.o(6814905139200L, 50775);
        return;
      }
    }
    
    protected void onDetach()
    {
      GMTrace.i(6814636703744L, 50773);
      super.onDetach();
      GMTrace.o(6814636703744L, 50773);
    }
    
    protected final void yv()
    {
      GMTrace.i(6814502486016L, 50772);
      super.yv();
      GMTrace.o(6814502486016L, 50772);
    }
  }
  
  final class d
    extends NormalUserFooterPreference.a
  {
    public d()
    {
      super();
      GMTrace.i(6743367090176L, 50242);
      GMTrace.o(6743367090176L, 50242);
    }
    
    protected final void aXN()
    {
      GMTrace.i(6743635525632L, 50244);
      Assert.assertTrue(s.fP(NormalUserFooterPreference.this.iBi.field_username));
      NormalUserFooterPreference.this.nOd.setVisibility(8);
      NormalUserFooterPreference.this.nOj.setVisibility(8);
      NormalUserFooterPreference.this.nOm.setVisibility(8);
      NormalUserFooterPreference.this.mQO.setVisibility(0);
      NormalUserFooterPreference.this.nOp.setVisibility(8);
      NormalUserFooterPreference.this.nOn.setVisibility(8);
      NormalUserFooterPreference.this.nOo.setVisibility(8);
      NormalUserFooterPreference.this.nOq.setVisibility(8);
      GMTrace.o(6743635525632L, 50244);
    }
    
    protected final void aXP()
    {
      GMTrace.i(6743501307904L, 50243);
      GMTrace.o(6743501307904L, 50243);
    }
  }
  
  public static abstract interface e
  {
    public abstract void al(String paramString, boolean paramBoolean);
  }
  
  final class f
    extends NormalUserFooterPreference.a
  {
    public f()
    {
      super();
      GMTrace.i(6775445127168L, 50481);
      GMTrace.o(6775445127168L, 50481);
    }
    
    protected final void aXN()
    {
      GMTrace.i(6775713562624L, 50483);
      NormalUserFooterPreference.this.nOd.setVisibility(8);
      NormalUserFooterPreference.this.nOj.setVisibility(0);
      NormalUserFooterPreference.this.nOm.setVisibility(8);
      NormalUserFooterPreference.this.mQO.setVisibility(8);
      NormalUserFooterPreference.this.nOp.setVisibility(8);
      NormalUserFooterPreference.this.nOn.setVisibility(8);
      NormalUserFooterPreference.this.nOo.setVisibility(8);
      NormalUserFooterPreference.this.nOq.setVisibility(8);
      NormalUserFooterPreference.this.nOl.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6746185662464L, 50263);
          com.tencent.mm.plugin.normsg.a.d.nxJ.K(1, 1, 3);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Contact_User", NormalUserFooterPreference.this.iBi.field_username);
          paramAnonymousView.putExtra("Contact_Scene", NormalUserFooterPreference.this.nLz);
          com.tencent.mm.plugin.profile.a.hnH.a(paramAnonymousView, NormalUserFooterPreference.this.mContext);
          GMTrace.o(6746185662464L, 50263);
        }
      });
      GMTrace.o(6775713562624L, 50483);
    }
    
    protected final void aXP()
    {
      GMTrace.i(6775579344896L, 50482);
      if ((NormalUserFooterPreference.this.iBi != null) && (com.tencent.mm.l.a.eE(NormalUserFooterPreference.this.iBi.field_type)))
      {
        aXO();
        GMTrace.o(6775579344896L, 50482);
        return;
      }
      p(false, true);
      GMTrace.o(6775579344896L, 50482);
    }
  }
  
  final class g
    extends NormalUserFooterPreference.a
  {
    public g()
    {
      super();
      GMTrace.i(6758265257984L, 50353);
      GMTrace.o(6758265257984L, 50353);
    }
    
    protected final void aXN()
    {
      boolean bool2 = true;
      GMTrace.i(6758533693440L, 50355);
      if (!q.fp(NormalUserFooterPreference.this.iBi.field_username))
      {
        bool1 = true;
        Assert.assertTrue(bool1);
        if (s.gm(NormalUserFooterPreference.this.iBi.field_username)) {
          break label152;
        }
      }
      label152:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        Assert.assertTrue(bool1);
        NormalUserFooterPreference.this.nOd.setVisibility(8);
        NormalUserFooterPreference.this.nOj.setVisibility(8);
        NormalUserFooterPreference.this.mQO.setText(R.l.dkJ);
        NormalUserFooterPreference.this.mQO.setVisibility(0);
        NormalUserFooterPreference.this.nOn.setVisibility(8);
        NormalUserFooterPreference.this.nOm.setVisibility(8);
        NormalUserFooterPreference.this.nOq.setVisibility(8);
        GMTrace.o(6758533693440L, 50355);
        return;
        bool1 = false;
        break;
      }
    }
    
    public final void aXP()
    {
      GMTrace.i(6758399475712L, 50354);
      GMTrace.o(6758399475712L, 50354);
    }
  }
  
  final class h
    extends NormalUserFooterPreference.a
  {
    public h()
    {
      super();
      GMTrace.i(6765647233024L, 50408);
      GMTrace.o(6765647233024L, 50408);
    }
    
    protected final void aXN()
    {
      GMTrace.i(6765915668480L, 50410);
      NormalUserFooterPreference.this.nOd.setVisibility(8);
      NormalUserFooterPreference.this.mQO.setVisibility(0);
      if ((!NormalUserFooterPreference.this.aXK()) && (!NormalUserFooterPreference.this.iBi.field_username.equals(q.zE())) && (!s.gm(NormalUserFooterPreference.this.iBi.field_username)) && (!s.gf(NormalUserFooterPreference.this.iBi.field_username))) {
        NormalUserFooterPreference.this.nOn.setVisibility(0);
      }
      for (;;)
      {
        NormalUserFooterPreference.this.mQO.setText(R.l.dkI);
        NormalUserFooterPreference.this.nOm.setVisibility(8);
        NormalUserFooterPreference.this.nOj.setVisibility(8);
        NormalUserFooterPreference.this.nOq.setVisibility(8);
        GMTrace.o(6765915668480L, 50410);
        return;
        NormalUserFooterPreference.this.nOn.setVisibility(8);
      }
    }
    
    protected final void aXP()
    {
      GMTrace.i(6765781450752L, 50409);
      GMTrace.o(6765781450752L, 50409);
    }
  }
  
  class i
    extends NormalUserFooterPreference.c
    implements com.tencent.mm.ad.e
  {
    private ProgressDialog htG;
    
    public i()
    {
      super();
      GMTrace.i(6751957024768L, 50306);
      GMTrace.o(6751957024768L, 50306);
    }
    
    public void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
    {
      GMTrace.i(6752628113408L, 50311);
      w.d("MicroMsg.NormalUserFooterPreference", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
      if (paramk.getType() != 30)
      {
        GMTrace.o(6752628113408L, 50311);
        return;
      }
      onStop();
      if (this.htG != null)
      {
        this.htG.dismiss();
        this.htG = null;
      }
      if (!bg.bx(NormalUserFooterPreference.this.mContext))
      {
        GMTrace.o(6752628113408L, 50311);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramInt1 = ((com.tencent.mm.pluginsdk.model.n)paramk).eHJ;
        w.d("MicroMsg.NormalUserFooterPreference", "VerifyBaseHandler onSceneEnd, opCode = " + paramInt1);
        if ((paramInt1 == 1) || (paramInt1 == 3))
        {
          List localList = ((com.tencent.mm.pluginsdk.model.n)paramk).tmZ;
          if ((localList != null) && (localList.contains(NormalUserFooterPreference.this.iBi.field_username)))
          {
            NormalUserFooterPreference.this.nOr = true;
            NormalUserFooterPreference localNormalUserFooterPreference = NormalUserFooterPreference.this;
            at.AR();
            paramk = com.tencent.mm.y.c.yK().TE(NormalUserFooterPreference.this.iBi.field_username);
            if (paramk != null)
            {
              paramString = paramk;
              if ((int)paramk.fTq != 0) {}
            }
            else
            {
              paramString = NormalUserFooterPreference.this.iBi;
              at.AR();
              if (com.tencent.mm.y.c.yK().Q(paramString)) {
                break label359;
              }
              w.e("MicroMsg.NormalUserFooterPreference", "insert contact failed, username = " + paramString.field_username);
            }
            for (paramString = null;; paramString = com.tencent.mm.y.c.yK().TE(NormalUserFooterPreference.this.iBi.field_username))
            {
              localNormalUserFooterPreference.iBi = paramString;
              if (NormalUserFooterPreference.this.iBi != null) {
                s.p(NormalUserFooterPreference.this.iBi);
              }
              aXV();
              paramString = localList.iterator();
              while (paramString.hasNext()) {
                com.tencent.mm.pluginsdk.ui.preference.b.aE((String)paramString.next(), NormalUserFooterPreference.this.nLz);
              }
              label359:
              at.AR();
            }
            at.getNotification().ry();
          }
        }
        GMTrace.o(6752628113408L, 50311);
        return;
      }
      if ((paramInt1 == 4) && (paramInt2 == 65234))
      {
        paramInt1 = ((com.tencent.mm.pluginsdk.model.n)paramk).eHJ;
        w.w("MicroMsg.NormalUserFooterPreference", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", new Object[] { Integer.valueOf(paramInt1) });
        if (paramInt1 == 3) {
          com.tencent.mm.ui.base.h.a(NormalUserFooterPreference.this.ezR, NormalUserFooterPreference.this.ezR.getString(R.l.dlx), NormalUserFooterPreference.this.ezR.getString(R.l.cUG), NormalUserFooterPreference.this.ezR.getString(R.l.cRK), NormalUserFooterPreference.this.ezR.getString(R.l.cSk), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6771150159872L, 50449);
              NormalUserFooterPreference.i.this.aXU();
              GMTrace.o(6771150159872L, 50449);
            }
          }, null);
        }
        GMTrace.o(6752628113408L, 50311);
        return;
      }
      if ((paramInt1 == 4) && (paramInt2 == -24) && (!bg.nm(paramString)))
      {
        Toast.makeText(NormalUserFooterPreference.this.ezR, paramString, 1).show();
        GMTrace.o(6752628113408L, 50311);
        return;
      }
      switch (paramInt1)
      {
      case 3: 
      default: 
        paramInt1 = 0;
      }
      while (paramInt1 != 0)
      {
        GMTrace.o(6752628113408L, 50311);
        return;
        if (at.wS().DO())
        {
          at.wS().getNetworkServerIp();
          new StringBuilder().append(paramInt2);
          paramInt1 = 1;
        }
        else if (ab.bv(NormalUserFooterPreference.this.mContext))
        {
          com.tencent.mm.pluginsdk.ui.k.dU(NormalUserFooterPreference.this.mContext);
          paramInt1 = 1;
        }
        else
        {
          paramInt1 = 0;
          continue;
          Toast.makeText(NormalUserFooterPreference.this.mContext, NormalUserFooterPreference.this.mContext.getString(R.l.dwI, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 3000).show();
          paramInt1 = 1;
          continue;
          if (paramInt2 == -100)
          {
            com.tencent.mm.ui.base.h.a(NormalUserFooterPreference.this.mContext, at.wy(), com.tencent.mm.br.a.X(NormalUserFooterPreference.this.mContext, R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(6744172396544L, 50248);
                NormalUserFooterPreference.i.this.onStop();
                paramAnonymousDialogInterface = new Intent();
                paramAnonymousDialogInterface.putExtra("Intro_Switch", true).addFlags(67108864);
                com.tencent.mm.plugin.profile.a.hnH.s(paramAnonymousDialogInterface, NormalUserFooterPreference.this.mContext);
                GMTrace.o(6744172396544L, 50248);
              }
            }, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(6738669469696L, 50207);
                NormalUserFooterPreference.i.this.onStop();
                paramAnonymousDialogInterface = new Intent();
                paramAnonymousDialogInterface.putExtra("Intro_Switch", true).addFlags(67108864);
                com.tencent.mm.plugin.profile.a.hnH.s(paramAnonymousDialogInterface, NormalUserFooterPreference.this.mContext);
                GMTrace.o(6738669469696L, 50207);
              }
            });
            paramInt1 = 1;
          }
          else
          {
            if ((paramInt1 == 4) && (paramInt2 == -34)) {
              paramString = NormalUserFooterPreference.this.ezR.getString(R.l.dwo);
            }
            for (;;)
            {
              Toast.makeText(NormalUserFooterPreference.this.ezR, paramString, 1).show();
              break;
              if ((paramInt1 == 4) && (paramInt2 == -94)) {
                paramString = NormalUserFooterPreference.this.ezR.getString(R.l.dwp);
              } else {
                paramString = NormalUserFooterPreference.this.ezR.getString(R.l.dXF);
              }
            }
          }
        }
      }
      GMTrace.o(6752628113408L, 50311);
    }
    
    protected void aXN()
    {
      GMTrace.i(6752091242496L, 50307);
      onDetach();
      onStop();
      at.wS().a(30, this);
      super.aXN();
      GMTrace.o(6752091242496L, 50307);
    }
    
    protected void aXV()
    {
      GMTrace.i(6752493895680L, 50310);
      if (NormalUserFooterPreference.this.nOc != null) {
        NormalUserFooterPreference.this.nOc.onDetach();
      }
      NormalUserFooterPreference.this.nOc = new NormalUserFooterPreference.c(NormalUserFooterPreference.this);
      NormalUserFooterPreference.this.nOc.yv();
      GMTrace.o(6752493895680L, 50310);
    }
    
    protected void onDetach()
    {
      GMTrace.i(6752359677952L, 50309);
      if (this.htG != null)
      {
        this.htG.dismiss();
        this.htG = null;
      }
      if (NormalUserFooterPreference.this.nOd != null) {
        NormalUserFooterPreference.this.nOd.setVisibility(8);
      }
      if (NormalUserFooterPreference.this.nOj != null) {
        NormalUserFooterPreference.this.nOj.setVisibility(0);
      }
      if (NormalUserFooterPreference.this.mQO != null) {
        NormalUserFooterPreference.this.mQO.setVisibility(8);
      }
      if (NormalUserFooterPreference.this.nOp != null) {
        NormalUserFooterPreference.this.nOp.setVisibility(8);
      }
      if (NormalUserFooterPreference.this.nOn != null) {
        NormalUserFooterPreference.this.nOn.setVisibility(8);
      }
      if (NormalUserFooterPreference.this.nOm != null) {
        NormalUserFooterPreference.this.nOm.setVisibility(8);
      }
      if (NormalUserFooterPreference.this.nOq != null) {
        NormalUserFooterPreference.this.nOq.setVisibility(8);
      }
      onStop();
      GMTrace.o(6752359677952L, 50309);
    }
    
    public final void onStop()
    {
      GMTrace.i(6752225460224L, 50308);
      at.wS().b(30, this);
      GMTrace.o(6752225460224L, 50308);
    }
  }
  
  final class j
    extends NormalUserFooterPreference.i
    implements com.tencent.mm.ad.e
  {
    public j()
    {
      super();
      GMTrace.i(6806852075520L, 50715);
      GMTrace.o(6806852075520L, 50715);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
    {
      GMTrace.i(6807523164160L, 50720);
      super.a(paramInt1, paramInt2, paramString, paramk);
      GMTrace.o(6807523164160L, 50720);
    }
    
    protected final void aXN()
    {
      GMTrace.i(6807120510976L, 50717);
      super.aXN();
      NormalUserFooterPreference.this.nOd.setVisibility(0);
      NormalUserFooterPreference.this.nOm.setVisibility(8);
      NormalUserFooterPreference.this.mQO.setVisibility(8);
      NormalUserFooterPreference.this.nOp.setVisibility(8);
      NormalUserFooterPreference.this.nOn.setVisibility(8);
      NormalUserFooterPreference.this.nOo.setVisibility(8);
      NormalUserFooterPreference.this.nOj.setVisibility(8);
      NormalUserFooterPreference.this.nOq.setVisibility(8);
      switch (NormalUserFooterPreference.this.nLz)
      {
      default: 
        NormalUserFooterPreference.this.nOi.setVisibility(8);
        NormalUserFooterPreference.this.nOh.setVisibility(8);
        if (NormalUserFooterPreference.this.iBi.uZ())
        {
          NormalUserFooterPreference.this.nOg.setText(NormalUserFooterPreference.this.ezR.getString(R.l.dkc));
          NormalUserFooterPreference.this.nOq.setVisibility(0);
        }
        break;
      }
      for (;;)
      {
        NormalUserFooterPreference.this.nOe.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6763097096192L, 50389);
            NormalUserFooterPreference.this.ezR.getIntent().removeExtra("Accept_NewFriend_FromOutside");
            paramAnonymousView = new Intent(NormalUserFooterPreference.this.ezR, SayHiWithSnsPermissionUI.class);
            paramAnonymousView.putExtra("Contact_User", NormalUserFooterPreference.this.iBi.field_username);
            paramAnonymousView.putExtra("Contact_Nick", NormalUserFooterPreference.this.iBi.field_nickname);
            paramAnonymousView.putExtra("Contact_RemarkName", NormalUserFooterPreference.this.iBi.field_conRemark);
            if ((NormalUserFooterPreference.this.nLz == 14) || (NormalUserFooterPreference.this.nLz == 8)) {
              paramAnonymousView.putExtra("Contact_RoomNickname", NormalUserFooterPreference.this.ezR.getIntent().getStringExtra("Contact_RoomNickname"));
            }
            paramAnonymousView.putExtra("Contact_Scene", NormalUserFooterPreference.this.nLz);
            paramAnonymousView.putExtra("Verify_ticket", NormalUserFooterPreference.this.nLA);
            paramAnonymousView.putExtra("sayhi_with_sns_perm_send_verify", false);
            paramAnonymousView.putExtra("sayhi_with_sns_perm_add_remark", true);
            paramAnonymousView.putExtra("sayhi_with_sns_perm_set_label", true);
            NormalUserFooterPreference.this.ezR.startActivity(paramAnonymousView);
            GMTrace.o(6763097096192L, 50389);
          }
        });
        NormalUserFooterPreference.this.nOg.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6790745948160L, 50595);
            if (NormalUserFooterPreference.this.iBi.uZ())
            {
              s.i(NormalUserFooterPreference.this.iBi);
              NormalUserFooterPreference.this.iBi.uD();
              NormalUserFooterPreference.j.this.aXN();
              GMTrace.o(6790745948160L, 50595);
              return;
            }
            com.tencent.mm.ui.base.h.a(NormalUserFooterPreference.this.mContext, NormalUserFooterPreference.this.mContext.getString(R.l.dka), NormalUserFooterPreference.this.mContext.getString(R.l.djZ), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(6726053003264L, 50113);
                s.h(NormalUserFooterPreference.this.iBi);
                NormalUserFooterPreference.this.iBi.uC();
                NormalUserFooterPreference.j.this.aXN();
                GMTrace.o(6726053003264L, 50113);
              }
            }, null);
            GMTrace.o(6790745948160L, 50595);
          }
        });
        GMTrace.o(6807120510976L, 50717);
        return;
        NormalUserFooterPreference.this.nOi.setVisibility(0);
        NormalUserFooterPreference.this.nOh.setVisibility(0);
        break;
        NormalUserFooterPreference.this.nOg.setText(NormalUserFooterPreference.this.ezR.getString(R.l.djZ));
      }
    }
    
    protected final void aXP()
    {
      GMTrace.i(6806986293248L, 50716);
      if ((NormalUserFooterPreference.this.iBi != null) && (com.tencent.mm.l.a.eE(NormalUserFooterPreference.this.iBi.field_type)))
      {
        aXO();
        GMTrace.o(6806986293248L, 50716);
        return;
      }
      p(false, true);
      GMTrace.o(6806986293248L, 50716);
    }
    
    protected final void aXV()
    {
      GMTrace.i(6807388946432L, 50719);
      super.aXV();
      GMTrace.o(6807388946432L, 50719);
    }
    
    protected final void onDetach()
    {
      GMTrace.i(6807254728704L, 50718);
      super.onDetach();
      GMTrace.o(6807254728704L, 50718);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\NormalUserFooterPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */