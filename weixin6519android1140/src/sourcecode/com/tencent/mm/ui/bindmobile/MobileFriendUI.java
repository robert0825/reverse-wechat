package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.a.b;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.modelfriend.v;
import com.tencent.mm.modelsimple.d;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.friend.InviteFriendUI;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.y.a.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.List;

public class MobileFriendUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private ListView htD;
  private View htF;
  private ProgressDialog htG;
  String htH;
  private TextView jqc;
  private TextView vPN;
  a woa;
  private aa wob;
  
  public MobileFriendUI()
  {
    GMTrace.i(3141902794752L, 23409);
    this.htG = null;
    this.jqc = null;
    this.vPN = null;
    GMTrace.o(3141902794752L, 23409);
  }
  
  private void aTK()
  {
    GMTrace.i(3142305447936L, 23412);
    if (!com.tencent.mm.modelfriend.m.Hn())
    {
      Object localObject = this.vKB.vKW;
      getString(R.l.cUG);
      this.htG = h.a((Context)localObject, getString(R.l.dIP), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(3138413133824L, 23383);
          if (MobileFriendUI.a(MobileFriendUI.this) != null) {
            at.wS().c(MobileFriendUI.a(MobileFriendUI.this));
          }
          GMTrace.o(3138413133824L, 23383);
        }
      });
      if (this.woa.getCount() == 0)
      {
        if ((!com.tencent.mm.modelfriend.a.a(new a.b()
        {
          public final void bu(boolean paramAnonymousBoolean)
          {
            GMTrace.i(3129823199232L, 23319);
            w.i("MicroMsg.MobileFriendUI", "syncAddrBookAndUpload onSyncEnd suc:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
            if (!paramAnonymousBoolean)
            {
              if (MobileFriendUI.b(MobileFriendUI.this) != null)
              {
                MobileFriendUI.b(MobileFriendUI.this).dismiss();
                MobileFriendUI.c(MobileFriendUI.this);
              }
              GMTrace.o(3129823199232L, 23319);
              return;
            }
            System.currentTimeMillis();
            aa localaa = new aa(com.tencent.mm.modelfriend.m.Hv(), com.tencent.mm.modelfriend.m.Hu());
            at.wS().a(localaa, 0);
            GMTrace.o(3129823199232L, 23319);
          }
        })) && (this.htG != null))
        {
          this.htG.dismiss();
          this.htG = null;
        }
        GMTrace.o(3142305447936L, 23412);
        return;
      }
      localObject = com.tencent.mm.modelfriend.m.Hv();
      List localList = com.tencent.mm.modelfriend.m.Hu();
      if ((((List)localObject).size() != 0) || (localList.size() != 0))
      {
        this.wob = new aa(com.tencent.mm.modelfriend.m.Hv(), com.tencent.mm.modelfriend.m.Hu());
        at.wS().a(this.wob, 0);
        GMTrace.o(3142305447936L, 23412);
        return;
      }
      localObject = new v();
      at.wS().a((k)localObject, 0);
    }
    GMTrace.o(3142305447936L, 23412);
  }
  
  protected final void MP()
  {
    GMTrace.i(3142976536576L, 23417);
    this.jqc = ((TextView)findViewById(R.h.bND));
    this.jqc.setText(R.l.dIN);
    this.vPN = ((TextView)findViewById(R.h.bwE));
    this.vPN.setText(R.l.dIS);
    this.htF = findViewById(R.h.bNG);
    this.htD = ((ListView)findViewById(R.h.bNF));
    Object localObject = new com.tencent.mm.ui.tools.p(true, true);
    ((com.tencent.mm.ui.tools.p)localObject).xiS = new p.b()
    {
      public final void QA()
      {
        GMTrace.i(3107677274112L, 23154);
        GMTrace.o(3107677274112L, 23154);
      }
      
      public final void QB()
      {
        GMTrace.i(16854256975872L, 125574);
        GMTrace.o(16854256975872L, 125574);
      }
      
      public final void Qy()
      {
        GMTrace.i(3107408838656L, 23152);
        GMTrace.o(3107408838656L, 23152);
      }
      
      public final void Qz()
      {
        GMTrace.i(3107543056384L, 23153);
        GMTrace.o(3107543056384L, 23153);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(3107140403200L, 23150);
        GMTrace.o(3107140403200L, 23150);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(3107274620928L, 23151);
        MobileFriendUI.a(MobileFriendUI.this, bg.nk(paramAnonymousString));
        paramAnonymousString = MobileFriendUI.this;
        if (paramAnonymousString.woa != null) {
          paramAnonymousString.woa.Au(paramAnonymousString.htH);
        }
        GMTrace.o(3107274620928L, 23151);
      }
    };
    a((com.tencent.mm.ui.tools.p)localObject);
    boolean bool;
    if (com.tencent.mm.y.a.g.BY().hb("2") != null)
    {
      localObject = com.tencent.mm.y.a.g.BY().hb("2").value;
      if (((String)localObject).equals("0"))
      {
        bool = false;
        f.hf("2");
      }
    }
    for (;;)
    {
      w.i("MicroMsg.MobileFriendUI", "ABTest Type, NEW(%B)", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {}
      for (this.woa = new b(this, new o.a()
          {
            public final void QC()
            {
              GMTrace.i(3114925031424L, 23208);
              MobileFriendUI localMobileFriendUI = MobileFriendUI.this;
              MobileFriendUI.d(MobileFriendUI.this).getCount();
              MobileFriendUI.e(localMobileFriendUI);
              GMTrace.o(3114925031424L, 23208);
            }
            
            public final void QD()
            {
              GMTrace.i(3114790813696L, 23207);
              GMTrace.o(3114790813696L, 23207);
            }
          });; this.woa = new c(this, new o.a()
          {
            public final void QC()
            {
              GMTrace.i(3109556322304L, 23168);
              MobileFriendUI localMobileFriendUI = MobileFriendUI.this;
              MobileFriendUI.d(MobileFriendUI.this).getCount();
              MobileFriendUI.e(localMobileFriendUI);
              GMTrace.o(3109556322304L, 23168);
            }
            
            public final void QD()
            {
              GMTrace.i(3109422104576L, 23167);
              GMTrace.o(3109422104576L, 23167);
            }
          }))
      {
        this.htD.setAdapter(this.woa);
        this.htD.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(3127138844672L, 23299);
            if (paramAnonymousInt < MobileFriendUI.f(MobileFriendUI.this).getHeaderViewsCount())
            {
              GMTrace.o(3127138844672L, 23299);
              return;
            }
            int i = MobileFriendUI.f(MobileFriendUI.this).getHeaderViewsCount();
            paramAnonymousAdapterView = (com.tencent.mm.modelfriend.b)MobileFriendUI.d(MobileFriendUI.this).getItem(paramAnonymousInt - i);
            if ((paramAnonymousAdapterView.status == 1) || (paramAnonymousAdapterView.status == 2)) {
              MobileFriendUI.this.b(paramAnonymousAdapterView);
            }
            if (paramAnonymousAdapterView.status == 0)
            {
              paramAnonymousView = new Intent(MobileFriendUI.this, InviteFriendUI.class);
              paramAnonymousView.putExtra("friend_type", 1);
              paramAnonymousView.putExtra("friend_user_name", paramAnonymousAdapterView.getUsername());
              paramAnonymousView.putExtra("friend_num", paramAnonymousAdapterView.Ha());
              paramAnonymousView.putExtra("friend_nick", paramAnonymousAdapterView.GU());
              paramAnonymousView.putExtra("friend_weixin_nick", paramAnonymousAdapterView.GX());
              paramAnonymousView.putExtra("friend_scene", 13);
              MobileFriendUI.this.startActivity(paramAnonymousView);
            }
            GMTrace.o(3127138844672L, 23299);
          }
        });
        this.woa.a(new a.a()
        {
          public final void Bs(int paramAnonymousInt)
          {
            GMTrace.i(3101637476352L, 23109);
            if (paramAnonymousInt > 0)
            {
              MobileFriendUI.g(MobileFriendUI.this).setVisibility(8);
              GMTrace.o(3101637476352L, 23109);
              return;
            }
            MobileFriendUI.g(MobileFriendUI.this).setVisibility(0);
            GMTrace.o(3101637476352L, 23109);
          }
        });
        if ((com.tencent.mm.modelfriend.m.Ho() != m.a.gDm) && (com.tencent.mm.modelfriend.m.Ho() != m.a.gDn))
        {
          this.htF = findViewById(R.h.bNG);
          this.htF.setVisibility(0);
          this.htF.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(3141500141568L, 23406);
              paramAnonymousView = new Intent(MobileFriendUI.this.vKB.vKW, BindMContactIntroUI.class);
              paramAnonymousView.putExtra("key_upload_scene", 6);
              MMWizardActivity.A(MobileFriendUI.this, paramAnonymousView);
              GMTrace.o(3141500141568L, 23406);
            }
          });
          this.htD.setVisibility(8);
        }
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(3094121283584L, 23053);
            MobileFriendUI.this.aLo();
            MobileFriendUI.this.finish();
            GMTrace.o(3094121283584L, 23053);
            return true;
          }
        });
        new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(3102174347264L, 23113);
            BackwardSupportUtil.c.a(MobileFriendUI.f(MobileFriendUI.this));
            GMTrace.o(3102174347264L, 23113);
          }
        };
        if ((!q.Ah()) || (com.tencent.mm.modelfriend.m.Hn())) {
          h.a(this, R.l.cZb, R.l.cUG, R.l.cTM, R.l.cSk, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(3148747898880L, 23460);
              com.tencent.mm.plugin.report.service.g.ork.i(11438, new Object[] { Integer.valueOf(6) });
              w.i("MicroMsg.MobileFriendUI", "[cpan] kv report logid:%d scene:%d", new Object[] { Integer.valueOf(11438), Integer.valueOf(6) });
              at.AR();
              com.tencent.mm.y.c.xh().set(12322, Boolean.valueOf(true));
              com.tencent.mm.platformtools.m.h(true, true);
              MobileFriendUI.h(MobileFriendUI.this);
              GMTrace.o(3148747898880L, 23460);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(3144721367040L, 23430);
              at.AR();
              com.tencent.mm.y.c.xh().set(12322, Boolean.valueOf(false));
              com.tencent.mm.platformtools.m.h(false, true);
              MobileFriendUI.this.finish();
              GMTrace.o(3144721367040L, 23430);
            }
          });
        }
        GMTrace.o(3142976536576L, 23417);
        return;
        if (!((String)localObject).equals("1")) {
          break label412;
        }
        bool = true;
        break;
      }
      label412:
      bool = true;
      break;
      bool = true;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(3143244972032L, 23419);
    w.i("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paramk.getType() == 32) && (this.htG != null))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      w.e("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
    }
    if (paramk.getType() == 133)
    {
      paramString = new v();
      at.wS().a(paramString, 0);
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramk.getType() == 32) {
        d.bm(getApplicationContext());
      }
      this.woa.a(null, null);
      GMTrace.o(3143244972032L, 23419);
      return;
    }
    if (paramk.getType() == 32) {
      Toast.makeText(this, R.l.dIO, 0).show();
    }
    GMTrace.o(3143244972032L, 23419);
  }
  
  public final void b(com.tencent.mm.modelfriend.b paramb)
  {
    GMTrace.i(3143110754304L, 23418);
    if (bg.nm(paramb.getUsername()))
    {
      w.e("MicroMsg.MobileFriendUI", "username is null");
      GMTrace.o(3143110754304L, 23418);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramb.getUsername());
    localIntent.putExtra("Contact_Nick", paramb.GX());
    localIntent.putExtra("Contact_Mobile_MD5", paramb.GS());
    localIntent.putExtra("Contact_Alias", paramb.gCC);
    localIntent.putExtra("Contact_Sex", paramb.gCx);
    localIntent.putExtra("Contact_Signature", paramb.gCA);
    localIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.ai(paramb.gCG, paramb.gCy, paramb.gCz));
    localIntent.putExtra("Contact_Scene", 13);
    localIntent.putExtra("Contact_ShowUserName", false);
    com.tencent.mm.plugin.c.a.hnH.d(localIntent, this);
    GMTrace.o(3143110754304L, 23418);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3142842318848L, 23416);
    int i = R.i.cCq;
    GMTrace.o(3142842318848L, 23416);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3142037012480L, 23410);
    super.onCreate(paramBundle);
    oM(R.l.dIQ);
    af.If().goN.eZ("qqlist", "update addr_upload2 set reserved4=0");
    at.wS().a(32, this);
    at.wS().a(133, this);
    MP();
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    w.i("MicroMsg.MobileFriendUI", "summerper checkPermission checkContacts[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      GMTrace.o(3142037012480L, 23410);
      return;
    }
    aTK();
    GMTrace.o(3142037012480L, 23410);
  }
  
  public void onDestroy()
  {
    GMTrace.i(3142708101120L, 23415);
    f.hg("2");
    at.wS().b(32, this);
    at.wS().b(133, this);
    this.woa.aJe();
    super.onDestroy();
    GMTrace.o(3142708101120L, 23415);
  }
  
  public void onPause()
  {
    GMTrace.i(3142573883392L, 23414);
    super.onPause();
    GMTrace.o(3142573883392L, 23414);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(3142171230208L, 23411);
    w.i("MicroMsg.MobileFriendUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(3142171230208L, 23411);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        aTK();
        GMTrace.o(3142171230208L, 23411);
        return;
      }
      h.a(this, getString(R.l.dNp), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3124320272384L, 23278);
          MobileFriendUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          MobileFriendUI.this.finish();
          GMTrace.o(3124320272384L, 23278);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3106066661376L, 23142);
          MobileFriendUI.this.finish();
          GMTrace.o(3106066661376L, 23142);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(3142439665664L, 23413);
    super.onResume();
    this.woa.notifyDataSetChanged();
    GMTrace.o(3142439665664L, 23413);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindmobile\MobileFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */