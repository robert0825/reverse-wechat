package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
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
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.lv.b;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.l;
import com.tencent.mm.protocal.c.acu;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.y.at;

public class QQFriendUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private int IJ;
  private ListView htD;
  private ProgressDialog htG;
  String htH;
  private com.tencent.mm.ui.tools.p jQL;
  private boolean mDI;
  private TextView vPN;
  d xcm;
  
  public QQFriendUI()
  {
    GMTrace.i(2799647588352L, 20859);
    this.htG = null;
    this.vPN = null;
    this.mDI = false;
    GMTrace.o(2799647588352L, 20859);
  }
  
  protected final void MP()
  {
    GMTrace.i(2800587112448L, 20866);
    this.htD = ((ListView)findViewById(R.h.bUN));
    this.vPN = ((TextView)findViewById(R.h.bwG));
    this.vPN.setText(R.l.dOR);
    this.jQL = new com.tencent.mm.ui.tools.p(true, true);
    this.jQL.xiS = new p.b()
    {
      public final void QA()
      {
        GMTrace.i(2815753715712L, 20979);
        GMTrace.o(2815753715712L, 20979);
      }
      
      public final void QB()
      {
        GMTrace.i(16863115345920L, 125640);
        GMTrace.o(16863115345920L, 125640);
      }
      
      public final void Qy()
      {
        GMTrace.i(2815485280256L, 20977);
        GMTrace.o(2815485280256L, 20977);
      }
      
      public final void Qz()
      {
        GMTrace.i(2815619497984L, 20978);
        GMTrace.o(2815619497984L, 20978);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(2815216844800L, 20975);
        GMTrace.o(2815216844800L, 20975);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(2815351062528L, 20976);
        QQFriendUI.a(QQFriendUI.this, bg.nk(paramAnonymousString));
        QQFriendUI.a(QQFriendUI.this, true);
        paramAnonymousString = QQFriendUI.this;
        if (paramAnonymousString.xcm != null) {
          paramAnonymousString.xcm.Au(paramAnonymousString.htH);
        }
        GMTrace.o(2815351062528L, 20976);
      }
    };
    a(this.jQL);
    String str;
    int i;
    if (com.tencent.mm.y.a.g.BY().hb("2") != null)
    {
      str = com.tencent.mm.y.a.g.BY().hb("2").value;
      if (str.equals("0"))
      {
        i = 0;
        com.tencent.mm.y.a.f.hf("2");
      }
    }
    for (;;)
    {
      if (i == 0) {}
      for (this.xcm = new e(this, this.IJ);; this.xcm = new f(this, this.IJ))
      {
        this.xcm.a(new d.a()
        {
          public final void Bs(int paramAnonymousInt)
          {
            GMTrace.i(2824746303488L, 21046);
            if (QQFriendUI.a(QQFriendUI.this))
            {
              if (paramAnonymousInt <= 0) {
                break label54;
              }
              QQFriendUI.b(QQFriendUI.this).setVisibility(8);
            }
            for (;;)
            {
              QQFriendUI.a(QQFriendUI.this, false);
              GMTrace.o(2824746303488L, 21046);
              return;
              label54:
              QQFriendUI.b(QQFriendUI.this).setVisibility(0);
            }
          }
        });
        this.htD.setAdapter(this.xcm);
        this.htD.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(2802600378368L, 20881);
            if (paramAnonymousInt < QQFriendUI.c(QQFriendUI.this).getHeaderViewsCount())
            {
              GMTrace.o(2802600378368L, 20881);
              return;
            }
            paramAnonymousInt -= QQFriendUI.c(QQFriendUI.this).getHeaderViewsCount();
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.QQFriendUI", "realpostion is:%d headerViewscount:%d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(QQFriendUI.c(QQFriendUI.this).getHeaderViewsCount()) });
            paramAnonymousAdapterView = (ad)QQFriendUI.d(QQFriendUI.this).getItem(paramAnonymousInt);
            if (QQFriendUI.this.getIntent().getBooleanExtra("qqgroup_sendmessage", false))
            {
              paramAnonymousView = new lv();
              paramAnonymousView.eQq.opType = 0;
              paramAnonymousView.eQq.eQs = (paramAnonymousAdapterView.gDV + "@qqim");
              paramAnonymousView.eQq.eQt = paramAnonymousAdapterView.getDisplayName();
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
              if (paramAnonymousView.eQr.eDb)
              {
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("Chat_User", paramAnonymousAdapterView.gDV + "@qqim");
                paramAnonymousView.putExtra("key_need_send_video", false);
                com.tencent.mm.plugin.c.a.hnH.e(paramAnonymousView, QQFriendUI.this);
              }
              GMTrace.o(2802600378368L, 20881);
              return;
            }
            if ((paramAnonymousAdapterView.gDW == 1) || (paramAnonymousAdapterView.gDW == 2))
            {
              at.AR();
              paramAnonymousView = com.tencent.mm.y.c.yK().TE(paramAnonymousAdapterView.getUsername());
              if ((paramAnonymousView != null) && (paramAnonymousView.bSA())) {
                com.tencent.mm.plugin.report.service.g.ork.A(10298, paramAnonymousAdapterView.getUsername() + ",12");
              }
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView.getUsername());
              paramAnonymousView.putExtra("Contact_Nick", paramAnonymousAdapterView.HW());
              paramAnonymousView.putExtra("Contact_Uin", paramAnonymousAdapterView.gDV);
              paramAnonymousView.putExtra("Contact_QQNick", paramAnonymousAdapterView.getDisplayName());
              paramAnonymousView.putExtra("Contact_Scene", 12);
              paramAnonymousView.putExtra("Contact_RemarkName", paramAnonymousAdapterView.Ia());
              com.tencent.mm.modelfriend.k localk = af.Ih().jQ(paramAnonymousAdapterView.getUsername());
              if (localk != null) {
                paramAnonymousView.putExtra("Contact_Sex", localk.fja);
              }
              paramAnonymousView.putExtra("Contact_ShowUserName", false);
              if (bg.nm(paramAnonymousAdapterView.getUsername()))
              {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.QQFriendUI", "username is null. can't start contact ui. friend is:%s", new Object[] { paramAnonymousAdapterView.toString() });
                GMTrace.o(2802600378368L, 20881);
                return;
              }
              com.tencent.mm.plugin.c.a.hnH.d(paramAnonymousView, QQFriendUI.this);
              GMTrace.o(2802600378368L, 20881);
              return;
            }
            if (paramAnonymousAdapterView.gDW == 0)
            {
              paramAnonymousView = new Intent(QQFriendUI.this, InviteFriendUI.class);
              paramAnonymousView.putExtra("friend_type", 0);
              paramAnonymousView.putExtra("friend_user_name", paramAnonymousAdapterView.getUsername());
              paramAnonymousView.putExtra("friend_num", paramAnonymousAdapterView.gDV);
              paramAnonymousView.putExtra("friend_nick", paramAnonymousAdapterView.getDisplayName());
              paramAnonymousView.putExtra("friend_weixin_nick", paramAnonymousAdapterView.HW());
              paramAnonymousView.putExtra("friend_scene", 12);
              QQFriendUI.this.startActivity(paramAnonymousView);
            }
            GMTrace.o(2802600378368L, 20881);
          }
        });
        af.Ik().a(this.xcm);
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(2823538343936L, 21037);
            QQFriendUI.this.aLo();
            QQFriendUI.this.finish();
            GMTrace.o(2823538343936L, 21037);
            return true;
          }
        });
        new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(2821927731200L, 21025);
            BackwardSupportUtil.c.a(QQFriendUI.c(QQFriendUI.this));
            GMTrace.o(2821927731200L, 21025);
          }
        };
        GMTrace.o(2800587112448L, 20866);
        return;
        if (!str.equals("1")) {
          break label257;
        }
        i = 1;
        break;
      }
      label257:
      i = 1;
      break;
      i = 1;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(2800855547904L, 20868);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.QQFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (((acu)((com.tencent.mm.modelfriend.w)paramk).fUa.gtC.gtK).lQF != 1)
    {
      GMTrace.o(2800855547904L, 20868);
      return;
    }
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.xcm.QF();
      GMTrace.o(2800855547904L, 20868);
      return;
    }
    Toast.makeText(this, R.l.dOP, 0).show();
    GMTrace.o(2800855547904L, 20868);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2800318676992L, 20864);
    int i = R.i.cDT;
    GMTrace.o(2800318676992L, 20864);
    return i;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(2800721330176L, 20867);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.QQFriendUI", "onConfigurationChanged: orientation = " + paramConfiguration.orientation);
    super.onConfigurationChanged(paramConfiguration);
    GMTrace.o(2800721330176L, 20867);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2799781806080L, 20860);
    super.onCreate(paramBundle);
    at.wS().a(143, this);
    paramBundle = getIntent().getStringExtra("qqgroup_name");
    this.IJ = getIntent().getIntExtra("qqgroup_id", -1);
    final Object localObject1 = af.Ik();
    int i = this.IJ;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.QQListStorage", "delete: GroupID:" + i);
    Object localObject2 = "update qqlist set reserved4=0 where groupid=" + i;
    ((ae)localObject1).goN.eZ("qqlist", (String)localObject2);
    if (com.tencent.mm.modelfriend.m.gd(this.IJ))
    {
      localObject1 = new com.tencent.mm.modelfriend.w(this.IJ);
      at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      localObject2 = this.vKB.vKW;
      getString(R.l.cUG);
      this.htG = h.a((Context)localObject2, getString(R.l.dOQ), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2829443923968L, 21081);
          at.wS().c(localObject1);
          GMTrace.o(2829443923968L, 21081);
        }
      });
    }
    sq(paramBundle);
    MP();
    GMTrace.o(2799781806080L, 20860);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2800050241536L, 20862);
    com.tencent.mm.y.a.f.hg("2");
    af.Ik().b(this.xcm);
    at.wS().b(143, this);
    this.xcm.aJe();
    com.tencent.mm.ac.n.Dv().cancel();
    super.onDestroy();
    GMTrace.o(2800050241536L, 20862);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2800452894720L, 20865);
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.QQFriendUI", "qq friend onKeyDown");
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2800452894720L, 20865);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2800184459264L, 20863);
    com.tencent.mm.ac.n.Dh().e(this.xcm);
    super.onPause();
    GMTrace.o(2800184459264L, 20863);
  }
  
  protected void onResume()
  {
    GMTrace.i(2799916023808L, 20861);
    super.onResume();
    com.tencent.mm.ac.n.Dh().d(this.xcm);
    this.xcm.notifyDataSetChanged();
    GMTrace.o(2799916023808L, 20861);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\friend\QQFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */