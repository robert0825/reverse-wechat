package com.tencent.mm.plugin.nearby.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.bc.i;
import com.tencent.mm.bc.l;
import com.tencent.mm.cache.MCacheItem;
import com.tencent.mm.g.a.io;
import com.tencent.mm.g.a.oq;
import com.tencent.mm.g.b.af;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.ali;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.b.a;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NearbyFriendsUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private com.tencent.mm.modelgeo.c fJm;
  private a.a fJt;
  private com.tencent.mm.sdk.b.c fJv;
  boolean guN;
  private r hsU;
  private List<ali> kNo;
  private boolean mCn;
  private List<ali> mDG;
  private com.tencent.mm.plugin.nearby.a.c ntK;
  private b ntW;
  private ListView ntX;
  private com.tencent.mm.plugin.nearby.a.c ntY;
  private com.tencent.mm.plugin.nearby.a.d ntZ;
  private boolean nua;
  private String[] nub;
  private int nuc;
  private BindMobileOrQQHeaderView nud;
  private ViewGroup nue;
  private View nuf;
  private View nug;
  private boolean nuh;
  private int nui;
  private boolean nuj;
  private int nuk;
  private View nul;
  private a num;
  
  public NearbyFriendsUI()
  {
    GMTrace.i(6695585579008L, 49886);
    this.hsU = null;
    this.kNo = new LinkedList();
    this.mDG = new LinkedList();
    this.nua = false;
    this.nuc = 1;
    this.nuh = false;
    this.nuj = false;
    this.mCn = false;
    this.nuk = 0;
    this.nul = null;
    this.fJv = new com.tencent.mm.sdk.b.c() {};
    this.guN = false;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15394370748416L, 114697);
        if (NearbyFriendsUI.d(NearbyFriendsUI.this))
        {
          GMTrace.o(15394370748416L, 114697);
          return false;
        }
        NearbyFriendsUI.e(NearbyFriendsUI.this);
        if (NearbyFriendsUI.this.guN)
        {
          if (NearbyFriendsUI.f(NearbyFriendsUI.this) != null)
          {
            NearbyFriendsUI.f(NearbyFriendsUI.this).dismiss();
            NearbyFriendsUI.a(NearbyFriendsUI.this, null);
          }
          com.tencent.mm.plugin.report.service.f.tr(11);
          GMTrace.o(15394370748416L, 114697);
          return false;
        }
        boolean bool;
        if (paramAnonymousBoolean)
        {
          if (NearbyFriendsUI.f(NearbyFriendsUI.this) != null) {
            NearbyFriendsUI.f(NearbyFriendsUI.this).setMessage(NearbyFriendsUI.this.getString(R.l.dKH));
          }
          NearbyFriendsUI.a(NearbyFriendsUI.this, new NearbyFriendsUI.a(NearbyFriendsUI.this, paramAnonymousFloat2, paramAnonymousFloat1, (int)paramAnonymousDouble2));
          com.tencent.mm.modelstat.e locale = com.tencent.mm.modelstat.e.Mk();
          if (paramAnonymousInt == 0)
          {
            paramAnonymousBoolean = false;
            if (NearbyFriendsUI.g(NearbyFriendsUI.this) != null) {
              break label277;
            }
            bool = false;
            label173:
            locale.a(2001, paramAnonymousBoolean, bool, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
            NearbyFriendsUI.a(NearbyFriendsUI.this, new com.tencent.mm.plugin.nearby.a.c(NearbyFriendsUI.h(NearbyFriendsUI.this), NearbyFriendsUI.i(NearbyFriendsUI.this).gEK, NearbyFriendsUI.i(NearbyFriendsUI.this).gEJ, NearbyFriendsUI.i(NearbyFriendsUI.this).accuracy, paramAnonymousInt, "", ""));
            at.wS().a(NearbyFriendsUI.b(NearbyFriendsUI.this), 0);
          }
        }
        for (;;)
        {
          GMTrace.o(15394370748416L, 114697);
          return false;
          paramAnonymousBoolean = true;
          break;
          label277:
          bool = NearbyFriendsUI.g(NearbyFriendsUI.this).gET;
          break label173;
          com.tencent.mm.plugin.report.service.f.tr(11);
          if (NearbyFriendsUI.f(NearbyFriendsUI.this) != null)
          {
            NearbyFriendsUI.f(NearbyFriendsUI.this).dismiss();
            NearbyFriendsUI.a(NearbyFriendsUI.this, null);
          }
          NearbyFriendsUI.j(NearbyFriendsUI.this);
          NearbyFriendsUI.this.findViewById(R.h.bPJ).setVisibility(0);
          NearbyFriendsUI.k(NearbyFriendsUI.this).setVisibility(8);
          NearbyFriendsUI.l(NearbyFriendsUI.this);
        }
      }
    };
    GMTrace.o(6695585579008L, 49886);
  }
  
  private void aTK()
  {
    GMTrace.i(6695854014464L, 49888);
    this.mCn = false;
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    getString(R.l.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(R.l.dKL), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(6715315585024L, 50033);
        NearbyFriendsUI.this.guN = true;
        com.tencent.mm.plugin.report.service.f.tr(11);
        if (NearbyFriendsUI.b(NearbyFriendsUI.this) != null) {
          at.wS().c(NearbyFriendsUI.b(NearbyFriendsUI.this));
        }
        w.i("MicroMsg.NearbyFriend", "[MonsterzDai]  [loading cancel] cancel in loading");
        if (!NearbyFriendsUI.c(NearbyFriendsUI.this))
        {
          NearbyFriendsUI.this.finish();
          w.i("MicroMsg.NearbyFriend", "[MonsterzDai]  [loading cancel] cancel in first loading");
        }
        GMTrace.o(6715315585024L, 50033);
      }
    });
    this.guN = false;
    if (this.fJm != null) {
      this.fJm.a(this.fJt, true);
    }
    GMTrace.o(6695854014464L, 49888);
  }
  
  private void aTL()
  {
    GMTrace.i(6696122449920L, 49890);
    View localView;
    Object localObject;
    int i;
    if (com.tencent.mm.bh.a.bIM())
    {
      if (this.nul != null)
      {
        this.ntX.removeHeaderView(this.nul);
        this.nul = null;
      }
      localView = View.inflate(this, R.i.cCT, null);
      localObject = (TextView)localView.findViewById(R.h.bZr);
      i = l.MM().ME();
      if (i != 0) {
        break label109;
      }
      localView.setVisibility(8);
      localView = null;
    }
    for (;;)
    {
      this.nul = localView;
      if (this.nul != null) {
        this.ntX.addHeaderView(this.nul);
      }
      GMTrace.o(6696122449920L, 49890);
      return;
      label109:
      localView.setVisibility(0);
      ((TextView)localObject).setText(getResources().getQuantityString(R.j.cIC, i, new Object[] { Integer.valueOf(i) }));
      localObject = (ImageView)localView.findViewById(R.h.bMx);
      com.tencent.mm.bc.h localh = l.MM().MF();
      if (localh != null) {
        a.b.a((ImageView)localObject, localh.field_sayhiuser);
      }
      localView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6715047149568L, 50031);
          NearbyFriendsUI.k(NearbyFriendsUI.this).removeHeaderView(NearbyFriendsUI.m(NearbyFriendsUI.this));
          NearbyFriendsUI.n(NearbyFriendsUI.this);
          paramAnonymousView = new Intent(NearbyFriendsUI.this, NearbySayHiListUI.class);
          paramAnonymousView.putExtra("k_say_hi_type", 2);
          paramAnonymousView.putExtra("show_clear_header", true);
          NearbyFriendsUI.this.startActivityForResult(paramAnonymousView, 2009);
          GMTrace.o(6715047149568L, 50031);
        }
      });
    }
  }
  
  private void aTM()
  {
    GMTrace.i(6696390885376L, 49892);
    com.tencent.mm.plugin.nearby.a.hnH.an(this);
    GMTrace.o(6696390885376L, 49892);
  }
  
  protected final void MP()
  {
    GMTrace.i(6696256667648L, 49891);
    this.ntX = ((ListView)findViewById(R.h.bPK));
    this.ntW = new b(this);
    Object localObject = this.ntX;
    if (this.nue == null)
    {
      this.nue = new LinearLayout(this);
      this.nue.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
      ((LinearLayout)this.nue).setGravity(17);
    }
    this.nuh = true;
    ((ListView)localObject).addHeaderView(this.nue);
    localObject = com.tencent.mm.k.g.ut().getValue("LBSShowBindPhone");
    if ((localObject != null) && (((String)localObject).length() > 0)) {}
    try
    {
      this.nui = Integer.valueOf((String)localObject).intValue();
      at.AR();
      localObject = (String)com.tencent.mm.y.c.xh().get(6, null);
      if ((localObject != null) && (((String)localObject).length() > 0)) {
        this.nui = 0;
      }
      this.nuk = 0;
      if (com.tencent.mm.y.a.g.BY().hb("3") != null)
      {
        localObject = com.tencent.mm.y.a.g.BY().hb("3").value;
        locala = com.tencent.mm.modelfriend.m.Ho();
        if (((String)localObject).equals("0")) {
          this.nuk = 0;
        }
      }
      else
      {
        if (((this.nui > 0) || (this.nuk > 0)) && (this.nuk != 1))
        {
          this.nud = new BindMobileOrQQHeaderView(this);
          this.ntX.addHeaderView(this.nud);
        }
        this.ntX.setAdapter(this.ntW);
        this.ntX.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(6686995644416L, 49822);
            if (NearbyFriendsUI.o(NearbyFriendsUI.this) <= 0)
            {
              i = paramAnonymousInt;
              if (NearbyFriendsUI.p(NearbyFriendsUI.this) <= 0) {}
            }
            else
            {
              i = paramAnonymousInt - 1;
            }
            paramAnonymousInt = i;
            if (com.tencent.mm.bh.a.bIM())
            {
              paramAnonymousInt = i;
              if (NearbyFriendsUI.m(NearbyFriendsUI.this) != null) {
                paramAnonymousInt = i - 1;
              }
            }
            int i = paramAnonymousInt;
            if (NearbyFriendsUI.q(NearbyFriendsUI.this)) {
              i = paramAnonymousInt - 1;
            }
            if ((i < 0) || (i >= NearbyFriendsUI.r(NearbyFriendsUI.this).size()))
            {
              GMTrace.o(6686995644416L, 49822);
              return;
            }
            paramAnonymousAdapterView = (ali)NearbyFriendsUI.r(NearbyFriendsUI.this).get(i);
            if (NearbyFriendsUI.c.rJ(paramAnonymousAdapterView.gCx))
            {
              paramAnonymousAdapterView = NearbyFriendsUI.c.b(paramAnonymousAdapterView);
              w.d("MicroMsg.NearbyFriend", "poi item click, go:" + bg.nl(paramAnonymousAdapterView));
              if (!bg.nm(paramAnonymousAdapterView))
              {
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("rawUrl", paramAnonymousAdapterView);
                paramAnonymousView.putExtra("geta8key_scene", 25);
                paramAnonymousView.putExtra("stastic_scene", 12);
                com.tencent.mm.bj.d.b(NearbyFriendsUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
              }
              GMTrace.o(6686995644416L, 49822);
              return;
            }
            paramAnonymousView = paramAnonymousAdapterView.jhi;
            at.AR();
            x localx = com.tencent.mm.y.c.yK().TE(paramAnonymousView);
            Object localObject;
            if (com.tencent.mm.l.a.eE(localx.field_type))
            {
              localObject = new Intent();
              ((Intent)localObject).putExtra("Contact_User", paramAnonymousView);
              ((Intent)localObject).putExtra("Contact_Scene", 18);
              ((Intent)localObject).putExtra("Sns_from_Scene", 18);
              ((Intent)localObject).putExtra("lbs_ticket", paramAnonymousAdapterView.uoe);
              ((Intent)localObject).putExtra("Contact_IsLbsGotoChatting", true);
              if ((paramAnonymousView != null) && (paramAnonymousView.length() > 0))
              {
                if (localx.bSA()) {
                  com.tencent.mm.plugin.report.service.g.ork.A(10298, paramAnonymousView + ",18");
                }
                paramAnonymousAdapterView = new oq();
                paramAnonymousAdapterView.eTD.intent = ((Intent)localObject);
                paramAnonymousAdapterView.eTD.username = paramAnonymousView;
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousAdapterView);
                com.tencent.mm.plugin.nearby.a.hnH.d((Intent)localObject, NearbyFriendsUI.this);
              }
              GMTrace.o(6686995644416L, 49822);
              return;
            }
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView.jhi);
            paramAnonymousView.putExtra("Contact_Alias", paramAnonymousAdapterView.gCC);
            paramAnonymousView.putExtra("Contact_Nick", paramAnonymousAdapterView.jio);
            paramAnonymousView.putExtra("Contact_Distance", paramAnonymousAdapterView.uAu);
            paramAnonymousView.putExtra("Contact_Signature", paramAnonymousAdapterView.gCA);
            paramAnonymousView.putExtra("Contact_RegionCode", RegionCodeDecoder.ai(paramAnonymousAdapterView.gCG, paramAnonymousAdapterView.gCy, paramAnonymousAdapterView.gCz));
            paramAnonymousView.putExtra("Contact_Sex", paramAnonymousAdapterView.gCx);
            paramAnonymousView.putExtra("Contact_IsLBSFriend", true);
            paramAnonymousView.putExtra("Contact_Scene", 18);
            paramAnonymousView.putExtra("Contact_VUser_Info", paramAnonymousAdapterView.uAw);
            paramAnonymousView.putExtra("Contact_VUser_Info_Flag", paramAnonymousAdapterView.uAv);
            paramAnonymousView.putExtra("Contact_KWeibo_flag", paramAnonymousAdapterView.uAz);
            paramAnonymousView.putExtra("Contact_KWeibo", paramAnonymousAdapterView.uAx);
            paramAnonymousView.putExtra("Contact_KWeiboNick", paramAnonymousAdapterView.uAy);
            paramAnonymousView.putExtra("Contact_KSnsIFlag", paramAnonymousAdapterView.uAB.gCI);
            paramAnonymousView.putExtra("Contact_KSnsBgId", paramAnonymousAdapterView.uAB.gCK);
            paramAnonymousView.putExtra("Contact_KSnsBgUrl", paramAnonymousAdapterView.uAB.gCJ);
            paramAnonymousView.putExtra("lbs_ticket", paramAnonymousAdapterView.uoe);
            paramAnonymousView.putExtra("Contact_IsLbsGotoChatting", true);
            if (paramAnonymousAdapterView.gCH != null)
            {
              localObject = new com.tencent.mm.af.d();
              ((com.tencent.mm.af.d)localObject).field_brandList = paramAnonymousAdapterView.gCH;
              ((com.tencent.mm.af.d)localObject).field_brandFlag = paramAnonymousAdapterView.uAC.gCL;
              ((com.tencent.mm.af.d)localObject).field_brandIconURL = paramAnonymousAdapterView.uAC.gCO;
              ((com.tencent.mm.af.d)localObject).field_extInfo = paramAnonymousAdapterView.uAC.gCM;
              ((com.tencent.mm.af.d)localObject).field_brandInfo = paramAnonymousAdapterView.uAC.gCN;
              paramAnonymousView.putExtra("KBrandInfo_item", new MCacheItem((com.tencent.mm.sdk.e.c)localObject));
            }
            paramAnonymousView.putExtra("Sns_from_Scene", 18);
            com.tencent.mm.plugin.nearby.a.hnH.d(paramAnonymousView, NearbyFriendsUI.this);
            GMTrace.o(6686995644416L, 49822);
          }
        });
        this.ntX.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(6683103330304L, 49793);
            if (NearbyFriendsUI.s(NearbyFriendsUI.this) != null)
            {
              paramAnonymousView = NearbyFriendsUI.s(NearbyFriendsUI.this);
              if (paramAnonymousView.gCY != null) {
                paramAnonymousView.gCY.onTouchEvent(paramAnonymousMotionEvent);
              }
            }
            GMTrace.o(6683103330304L, 49793);
            return false;
          }
        });
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(6702296465408L, 49936);
            NearbyFriendsUI.this.finish();
            GMTrace.o(6702296465408L, 49936);
            return true;
          }
        });
        new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6713168101376L, 50017);
            BackwardSupportUtil.c.a(NearbyFriendsUI.k(NearbyFriendsUI.this));
            GMTrace.o(6713168101376L, 50017);
          }
        };
        a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(6689679998976L, 49842);
            paramAnonymousMenuItem = new com.tencent.mm.ui.widget.f(NearbyFriendsUI.this, com.tencent.mm.ui.widget.f.xpQ, false);
            paramAnonymousMenuItem.qil = new p.d()
            {
              public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
              {
                GMTrace.i(6711423270912L, 50004);
                switch (paramAnonymous2Int)
                {
                }
                for (;;)
                {
                  GMTrace.o(6711423270912L, 50004);
                  return;
                  NearbyFriendsUI.a(NearbyFriendsUI.this, 4);
                  NearbyFriendsUI.t(NearbyFriendsUI.this);
                  at.AR();
                  com.tencent.mm.y.c.xh().set(16386, Integer.valueOf(NearbyFriendsUI.h(NearbyFriendsUI.this)));
                  NearbyFriendsUI.u(NearbyFriendsUI.this);
                  GMTrace.o(6711423270912L, 50004);
                  return;
                  NearbyFriendsUI.a(NearbyFriendsUI.this, 3);
                  NearbyFriendsUI.t(NearbyFriendsUI.this);
                  at.AR();
                  com.tencent.mm.y.c.xh().set(16386, Integer.valueOf(NearbyFriendsUI.h(NearbyFriendsUI.this)));
                  NearbyFriendsUI.u(NearbyFriendsUI.this);
                  GMTrace.o(6711423270912L, 50004);
                  return;
                  NearbyFriendsUI.a(NearbyFriendsUI.this, 1);
                  NearbyFriendsUI.t(NearbyFriendsUI.this);
                  at.AR();
                  com.tencent.mm.y.c.xh().set(16386, Integer.valueOf(NearbyFriendsUI.h(NearbyFriendsUI.this)));
                  NearbyFriendsUI.u(NearbyFriendsUI.this);
                  GMTrace.o(6711423270912L, 50004);
                  return;
                  paramAnonymous2MenuItem = new Intent(NearbyFriendsUI.this, NearbySayHiListUI.class);
                  paramAnonymous2MenuItem.putExtra("k_say_hi_type", 2);
                  NearbyFriendsUI.this.startActivityForResult(paramAnonymous2MenuItem, 2009);
                  GMTrace.o(6711423270912L, 50004);
                  return;
                  NearbyFriendsUI.b(NearbyFriendsUI.this, new com.tencent.mm.plugin.nearby.a.c(2, 0.0F, 0.0F, 0, 0, "", ""));
                  at.wS().a(NearbyFriendsUI.v(NearbyFriendsUI.this), 0);
                  paramAnonymous2MenuItem = NearbyFriendsUI.this;
                  ActionBarActivity localActionBarActivity = NearbyFriendsUI.this.vKB.vKW;
                  NearbyFriendsUI.this.getString(R.l.cUG);
                  NearbyFriendsUI.a(paramAnonymous2MenuItem, com.tencent.mm.ui.base.h.a(localActionBarActivity, NearbyFriendsUI.this.getString(R.l.dKF), true, new DialogInterface.OnCancelListener()
                  {
                    public final void onCancel(DialogInterface paramAnonymous3DialogInterface)
                    {
                      GMTrace.i(6709678440448L, 49991);
                      at.wS().c(NearbyFriendsUI.v(NearbyFriendsUI.this));
                      GMTrace.o(6709678440448L, 49991);
                    }
                  }));
                }
              }
            };
            paramAnonymousMenuItem.qik = new p.c()
            {
              public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
              {
                GMTrace.i(6687532515328L, 49826);
                paramAnonymous2n.em(-1, R.l.dKO);
                paramAnonymous2n.em(-1, R.l.dKN);
                paramAnonymous2n.em(-1, R.l.dKM);
                paramAnonymous2n.em(-1, R.l.dUQ);
                paramAnonymous2n.em(-1, R.l.dKB);
                GMTrace.o(6687532515328L, 49826);
              }
            };
            paramAnonymousMenuItem.bFk();
            GMTrace.o(6689679998976L, 49842);
            return true;
          }
        });
        GMTrace.o(6696256667648L, 49891);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        m.a locala;
        this.nui = 0;
        continue;
        if (localException.equals("2"))
        {
          if (locala == m.a.gDn)
          {
            this.nuk = 2;
            com.tencent.mm.y.a.f.hf("3");
          }
        }
        else if ((localException.equals("1")) && (locala == m.a.gDk))
        {
          this.nuk = 2;
          com.tencent.mm.y.a.f.hf("3");
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6697061974016L, 49897);
    if (paramk.getType() == 148)
    {
      int i = ((com.tencent.mm.plugin.nearby.a.c)paramk).CD();
      if ((this.ntY == null) && ((i == 1) || (i == 3) || (i == 4)))
      {
        GMTrace.o(6697061974016L, 49897);
        return;
      }
      if (((i == 1) || (i == 3) || (i == 4)) && (this.nua))
      {
        w.v("MicroMsg.NearbyFriend", "onSceneEnd data already requested, code=%d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(6697061974016L, 49897);
        return;
      }
      if ((this.ntK == null) && (i == 2))
      {
        GMTrace.o(6697061974016L, 49897);
        return;
      }
      w.i("MicroMsg.NearbyFriend", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if (paramk.getType() != 148)
      {
        GMTrace.o(6697061974016L, 49897);
        return;
      }
      if (this.hsU != null)
      {
        this.hsU.dismiss();
        this.hsU = null;
      }
      label316:
      label452:
      Object localObject;
      ali localali;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if ((i == 1) || (i == 3) || (i == 4))
        {
          this.kNo = ((com.tencent.mm.plugin.nearby.a.c)paramk).aTH();
          if ((this.kNo == null) || (this.kNo.size() == 0))
          {
            findViewById(R.h.bPM).setVisibility(0);
            this.ntX.setVisibility(8);
            aTM();
            com.tencent.mm.plugin.report.service.f.tr(11);
            if (this.nuc != 3) {
              break label757;
            }
            AY(R.k.cMN);
            this.nua = true;
            this.ntY = null;
          }
        }
        else
        {
          if (((com.tencent.mm.plugin.nearby.a.c)paramk).CD() == 2)
          {
            com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dKE), "", new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(6688069386240L, 49830);
                NearbyFriendsUI.this.finish();
                GMTrace.o(6688069386240L, 49830);
              }
            });
            this.ntK = null;
          }
          if (!((com.tencent.mm.plugin.nearby.a.c)paramk).aTF()) {
            break label799;
          }
          paramString = getString(R.l.dKX);
          paramInt1 = ((com.tencent.mm.plugin.nearby.a.c)paramk).aTG();
          if (this.nue != null)
          {
            if (this.nuf != null) {
              break label788;
            }
            this.nuf = View.inflate(this, R.i.cCU, null);
            this.nue.addView(this.nuf);
            this.nuf.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(6688337821696L, 49832);
                NearbyFriendsUI.w(NearbyFriendsUI.this);
                GMTrace.o(6688337821696L, 49832);
              }
            });
            ((TextView)this.nuf.findViewById(R.h.bPS)).setText(paramString);
            if (paramInt1 != 0) {
              ((TextView)this.nuf.findViewById(R.h.bPR)).setText(String.format(getResources().getQuantityString(R.j.cIv, paramInt1, new Object[] { Integer.valueOf(paramInt1) }), new Object[0]));
            }
          }
        }
        for (;;)
        {
          this.nuj = true;
          GMTrace.o(6697061974016L, 49897);
          return;
          findViewById(R.h.bPM).setVisibility(8);
          paramString = new LinkedList();
          localObject = this.kNo.iterator();
          paramInt1 = 0;
          while (((Iterator)localObject).hasNext())
          {
            localali = (ali)((Iterator)localObject).next();
            at.AR();
            if (com.tencent.mm.y.c.yK().TA(localali.jhi))
            {
              paramString.add(paramInt1, localali);
              paramInt1 += 1;
            }
            else
            {
              paramString.add(localali);
            }
          }
          this.kNo.clear();
          this.kNo = paramString;
          if (this.mDG != null)
          {
            paramInt1 = this.mDG.size() - 1;
            while (paramInt1 >= 0)
            {
              if (this.mDG.get(paramInt1) != null) {
                this.kNo.add(0, this.mDG.get(paramInt1));
              }
              paramInt1 -= 1;
            }
          }
          this.ntW.notifyDataSetChanged();
          if (this.ntW.getCount() > 0) {
            this.ntX.setSelection(0);
          }
          this.ntX.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6692901224448L, 49866);
              com.tencent.mm.plugin.report.service.f.tq(11);
              GMTrace.o(6692901224448L, 49866);
            }
          });
          break;
          label757:
          if (this.nuc == 4)
          {
            AY(R.k.cMM);
            break label316;
          }
          AY(0);
          this.nuc = 1;
          break label316;
          label788:
          this.nuf.setVisibility(0);
          break label452;
          label799:
          if ((this.nuf != null) && (this.nue != null)) {
            this.nuf.setVisibility(8);
          }
        }
      }
      TextView localTextView;
      if ((i == 1) || (i == 3) || (i == 4))
      {
        localTextView = (TextView)findViewById(R.h.bPM);
        localTextView.setVisibility(0);
        aTM();
        localali = null;
        localObject = localali;
        if (paramString != null)
        {
          localObject = localali;
          if (paramString.length() > 0) {
            localObject = com.tencent.mm.h.a.dH(paramString);
          }
        }
        if ((localObject == null) || (((com.tencent.mm.h.a)localObject).desc == null) || (((com.tencent.mm.h.a)localObject).desc.length() <= 0)) {
          break label979;
        }
        localTextView.setText(((com.tencent.mm.h.a)localObject).desc);
      }
      for (;;)
      {
        this.ntX.setVisibility(8);
        this.ntY = null;
        if (((com.tencent.mm.plugin.nearby.a.c)paramk).CD() == 2)
        {
          Toast.makeText(this, R.l.dKD, 1).show();
          this.ntK = null;
        }
        GMTrace.o(6697061974016L, 49897);
        return;
        label979:
        if (paramInt2 == 63535) {
          localTextView.setText(getString(R.l.dKG));
        } else {
          localTextView.setText(getString(R.l.dKJ));
        }
      }
    }
    if (paramk.getType() == 376)
    {
      if (((com.tencent.mm.plugin.nearby.a.d)paramk).CD() != 1)
      {
        GMTrace.o(6697061974016L, 49897);
        return;
      }
      if (this.hsU != null)
      {
        this.hsU.dismiss();
        this.hsU = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0) && (((com.tencent.mm.plugin.nearby.a.d)paramk).ntt != null))
      {
        paramString = ((com.tencent.mm.plugin.nearby.a.d)paramk).ntt;
        com.tencent.mm.plugin.nearby.a.b.de(paramString, ((com.tencent.mm.plugin.nearby.a.d)paramk).ntu);
        paramk = new Intent();
        paramk.putExtra("Chat_User", paramString);
        com.tencent.mm.plugin.nearby.a.hnH.f(paramk, this);
        GMTrace.o(6697061974016L, 49897);
        return;
      }
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, R.l.dKV, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6690619523072L, 49849);
          GMTrace.o(6690619523072L, 49849);
        }
      });
    }
    GMTrace.o(6697061974016L, 49897);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6695988232192L, 49889);
    int i = R.i.cCP;
    GMTrace.o(6695988232192L, 49889);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6696525103104L, 49893);
    w.d("MicroMsg.NearbyFriend", "onActivityResult, requestCode %s, resultCode %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(6696525103104L, 49893);
      return;
      if (paramInt2 == -1)
      {
        this.nua = false;
        aTK();
        GMTrace.o(6696525103104L, 49893);
        return;
        if (paramInt2 == -1) {
          finish();
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6695719796736L, 49887);
    com.tencent.mm.plugin.report.service.f.tp(11);
    super.onCreate(paramBundle);
    oM(R.l.dKU);
    at.wS().a(148, this);
    at.wS().a(376, this);
    at.wS().a(1087, this);
    this.fJm = com.tencent.mm.modelgeo.c.Ir();
    MP();
    this.nub = new String[] { getResources().getString(R.l.dKO), getResources().getString(R.l.dKN), getResources().getString(R.l.dKM), getResources().getString(R.l.dUQ) };
    at.AR();
    this.nuc = bg.a((Integer)com.tencent.mm.y.c.xh().get(16386, null), 1);
    if (this.nuc == 3) {
      AY(R.k.cMN);
    }
    for (;;)
    {
      aTK();
      GMTrace.o(6695719796736L, 49887);
      return;
      if (this.nuc == 4)
      {
        AY(R.k.cMM);
      }
      else
      {
        AY(0);
        this.nuc = 1;
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6696927756288L, 49896);
    if (this.nuk > 0) {
      com.tencent.mm.y.a.f.hg("3");
    }
    com.tencent.mm.plugin.report.service.f.tr(11);
    at.wS().b(148, this);
    at.wS().b(376, this);
    at.wS().b(1087, this);
    if ((this.hsU != null) && (this.hsU.isShowing())) {
      this.hsU.dismiss();
    }
    if (this.fJm != null) {
      this.fJm.c(this.fJt);
    }
    com.tencent.mm.ac.n.Dv().cancel();
    if (this.ntW != null)
    {
      b localb = this.ntW;
      if (localb.gCY != null)
      {
        localb.gCY.detach();
        localb.gCY = null;
      }
    }
    super.onDestroy();
    GMTrace.o(6696927756288L, 49896);
  }
  
  protected void onPause()
  {
    GMTrace.i(6696659320832L, 49894);
    super.onPause();
    if (this.fJm != null) {
      this.fJm.c(this.fJt);
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.fJv);
    GMTrace.o(6696659320832L, 49894);
  }
  
  protected void onResume()
  {
    GMTrace.i(6696793538560L, 49895);
    super.onResume();
    if (this.fJm != null) {
      this.fJm.a(this.fJt, true);
    }
    aTL();
    this.ntW.notifyDataSetChanged();
    if (l.MM().ME() == 0) {
      this.ntX.removeHeaderView(this.nug);
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.fJv);
    GMTrace.o(6696793538560L, 49895);
  }
  
  private final class a
  {
    public int accuracy;
    public float gEJ;
    public float gEK;
    
    public a(float paramFloat1, float paramFloat2, int paramInt)
    {
      GMTrace.i(6708738916352L, 49984);
      this.gEJ = paramFloat1;
      this.gEK = paramFloat2;
      this.accuracy = paramInt;
      GMTrace.o(6708738916352L, 49984);
    }
  }
  
  final class b
    extends BaseAdapter
  {
    private final Context context;
    com.tencent.mm.ui.applet.b gCY;
    private b.b gCZ;
    
    public b(Context paramContext)
    {
      GMTrace.i(6688740474880L, 49835);
      this.gCY = new com.tencent.mm.ui.applet.b(new b.a()
      {
        public final Bitmap jP(String paramAnonymousString)
        {
          GMTrace.i(6701759594496L, 49932);
          paramAnonymousString = com.tencent.mm.ac.b.a(paramAnonymousString, false, -1);
          GMTrace.o(6701759594496L, 49932);
          return paramAnonymousString;
        }
      });
      this.gCZ = null;
      this.context = paramContext;
      GMTrace.o(6688740474880L, 49835);
    }
    
    public final int getCount()
    {
      GMTrace.i(6688874692608L, 49836);
      int i = NearbyFriendsUI.r(NearbyFriendsUI.this).size();
      GMTrace.o(6688874692608L, 49836);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6689277345792L, 49839);
      GMTrace.o(6689277345792L, 49839);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6689008910336L, 49837);
      if (this.gCZ == null) {
        this.gCZ = new b.b()
        {
          public final int Hk()
          {
            GMTrace.i(6709141569536L, 49987);
            int i = NearbyFriendsUI.b.this.getCount();
            GMTrace.o(6709141569536L, 49987);
            return i;
          }
          
          public final String gc(int paramAnonymousInt)
          {
            GMTrace.i(6709007351808L, 49986);
            if ((paramAnonymousInt < 0) || (paramAnonymousInt >= NearbyFriendsUI.b.this.getCount()))
            {
              w.e("MicroMsg.NearbyFriend", "pos is invalid");
              GMTrace.o(6709007351808L, 49986);
              return null;
            }
            Object localObject = NearbyFriendsUI.b.this.rI(paramAnonymousInt);
            if (localObject == null)
            {
              GMTrace.o(6709007351808L, 49986);
              return null;
            }
            localObject = ((ali)localObject).jhi;
            GMTrace.o(6709007351808L, 49986);
            return (String)localObject;
          }
        };
      }
      if (this.gCY != null) {
        this.gCY.a(paramInt, this.gCZ);
      }
      Object localObject1;
      label369:
      Object localObject2;
      if (paramView == null)
      {
        paramViewGroup = new NearbyFriendsUI.d();
        paramView = View.inflate(this.context, R.i.cCR, null);
        paramViewGroup.gDd = ((TextView)paramView.findViewById(R.h.bPL));
        paramViewGroup.nuu = ((TextView)paramView.findViewById(R.h.bPO));
        paramViewGroup.nut = ((TextView)paramView.findViewById(R.h.bPG));
        paramViewGroup.gDc = ((ImageView)paramView.findViewById(R.h.bPF));
        paramViewGroup.gDe = ((TextView)paramView.findViewById(R.h.bPI));
        paramViewGroup.nuv = ((ImageView)paramView.findViewById(R.h.bPQ));
        paramViewGroup.nuw = ((ImageView)paramView.findViewById(R.h.bPP));
        paramViewGroup.nuy = ((ImageView)paramView.findViewById(R.h.bPC));
        paramViewGroup.nuz = ((ImageView)paramView.findViewById(R.h.bPD));
        paramViewGroup.nuA = ((ImageView)paramView.findViewById(R.h.bPE));
        localObject1 = paramViewGroup.nuw.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject1).height = com.tencent.mm.br.a.V(this.context, R.f.aQE);
        ((ViewGroup.LayoutParams)localObject1).width = com.tencent.mm.br.a.V(this.context, R.f.aQE);
        paramViewGroup.nuw.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        paramViewGroup.nux = ((ImageView)paramView.findViewById(R.h.bPN));
        paramView.setTag(paramViewGroup);
        localObject1 = (ali)NearbyFriendsUI.r(NearbyFriendsUI.this).get(paramInt);
        paramViewGroup.gDd.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, ((ali)localObject1).jio, paramViewGroup.gDd.getTextSize()));
        if (NearbyFriendsUI.h(NearbyFriendsUI.this) != 1) {
          break label784;
        }
        switch (((ali)localObject1).gCx)
        {
        default: 
          paramViewGroup.nux.setVisibility(8);
          if (((ali)localObject1).uAv != 0)
          {
            paramViewGroup.nuv.setVisibility(0);
            localObject2 = BackwardSupportUtil.b.c(ak.a.gmZ.fr(((ali)localObject1).uAv), 2.0F);
            paramViewGroup.nuv.setImageBitmap((Bitmap)localObject2);
            paramViewGroup.nux.setVisibility(8);
            label422:
            paramViewGroup.nut.setText(((ali)localObject1).uAu);
            paramViewGroup.nuy.setVisibility(8);
            paramViewGroup.nuz.setVisibility(8);
            paramViewGroup.nuA.setVisibility(8);
            if ((localObject1 instanceof com.tencent.mm.plugin.nearby.a.a))
            {
              localObject2 = ((com.tencent.mm.plugin.nearby.a.a)localObject1).ntq;
              if ((localObject2 == null) || (((LinkedList)localObject2).size() != 1)) {
                break label808;
              }
              paramViewGroup.nuy.setVisibility(0);
              NearbyFriendsUI.k(paramViewGroup.nuy, (String)((LinkedList)localObject2).get(0));
            }
            label517:
            if ((((ali)localObject1).gCA != null) && (!((ali)localObject1).gCA.trim().equals(""))) {
              break label962;
            }
            paramViewGroup.nuu.setVisibility(8);
            label551:
            if ((((ali)localObject1).uAB == null) || ((((ali)localObject1).uAB.gCI & 0x1) <= 0)) {
              break label999;
            }
            paramViewGroup.nuw.setVisibility(0);
            label580:
            if (!NearbyFriendsUI.c.rJ(((ali)localObject1).gCx)) {
              break label1011;
            }
            paramViewGroup.gDc.setImageBitmap(null);
            localObject2 = new c.a();
            at.AR();
            ((c.a)localObject2).gKF = com.tencent.mm.y.c.yU();
            ((c.a)localObject2).gKC = true;
            ((c.a)localObject2).gKY = true;
            localObject2 = ((c.a)localObject2).Jn();
            com.tencent.mm.ao.n.Jd().a(((ali)localObject1).jhi, paramViewGroup.gDc, (com.tencent.mm.ao.a.a.c)localObject2);
            if (bg.nm(((ali)localObject1).gCC)) {
              break label1185;
            }
            paramViewGroup.gDe.setText(((ali)localObject1).gCC);
            paramViewGroup.gDe.setVisibility(0);
          }
          break;
        }
      }
      for (;;)
      {
        GMTrace.o(6689008910336L, 49837);
        return paramView;
        paramViewGroup = (NearbyFriendsUI.d)paramView.getTag();
        break;
        paramViewGroup.nux.setVisibility(0);
        paramViewGroup.nux.setImageResource(R.k.cMN);
        paramViewGroup.nux.setContentDescription(this.context.getString(R.l.dIg));
        break label369;
        paramViewGroup.nux.setVisibility(0);
        paramViewGroup.nux.setImageResource(R.k.cMM);
        paramViewGroup.nux.setContentDescription(this.context.getString(R.l.dvo));
        break label369;
        label784:
        paramViewGroup.nux.setVisibility(8);
        break label369;
        paramViewGroup.nuv.setVisibility(8);
        break label422;
        label808:
        if ((localObject2 != null) && (((LinkedList)localObject2).size() == 2))
        {
          paramViewGroup.nuy.setVisibility(0);
          paramViewGroup.nuz.setVisibility(0);
          NearbyFriendsUI.k(paramViewGroup.nuy, (String)((LinkedList)localObject2).get(0));
          NearbyFriendsUI.k(paramViewGroup.nuz, (String)((LinkedList)localObject2).get(1));
          break label517;
        }
        if ((localObject2 == null) || (((LinkedList)localObject2).size() < 3)) {
          break label517;
        }
        paramViewGroup.nuy.setVisibility(0);
        paramViewGroup.nuz.setVisibility(0);
        paramViewGroup.nuA.setVisibility(0);
        NearbyFriendsUI.k(paramViewGroup.nuy, (String)((LinkedList)localObject2).get(0));
        NearbyFriendsUI.k(paramViewGroup.nuz, (String)((LinkedList)localObject2).get(1));
        NearbyFriendsUI.k(paramViewGroup.nuA, (String)((LinkedList)localObject2).get(2));
        break label517;
        label962:
        paramViewGroup.nuu.setVisibility(0);
        paramViewGroup.nuu.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, ((ali)localObject1).gCA, paramViewGroup.nuu.getTextSize()));
        break label551;
        label999:
        paramViewGroup.nuw.setVisibility(8);
        break label580;
        label1011:
        a.b.a(paramViewGroup.gDc, ((ali)localObject1).jhi);
        at.AR();
        if (com.tencent.mm.y.c.yK().TA(((ali)localObject1).jhi))
        {
          paramViewGroup.gDe.setVisibility(0);
          if (x.At(((ali)localObject1).uAv))
          {
            paramViewGroup.gDe.setText(NearbyFriendsUI.this.getString(R.l.dKI));
          }
          else
          {
            at.AR();
            x localx = com.tencent.mm.y.c.yK().TC(((ali)localObject1).jhi);
            Context localContext;
            if (localx != null)
            {
              localObject2 = paramViewGroup.gDd;
              localContext = this.context;
              if (!bg.nm(localx.vk())) {
                break label1175;
              }
            }
            label1175:
            for (localObject1 = ((ali)localObject1).jio;; localObject1 = localx.vk())
            {
              ((TextView)localObject2).setText(com.tencent.mm.pluginsdk.ui.d.h.b(localContext, (CharSequence)localObject1, paramViewGroup.gDd.getTextSize()));
              paramViewGroup.gDe.setText(NearbyFriendsUI.this.getString(R.l.dKK));
              break;
            }
          }
        }
        else
        {
          label1185:
          paramViewGroup.gDe.setVisibility(8);
        }
      }
    }
    
    public final ali rI(int paramInt)
    {
      GMTrace.i(6689143128064L, 49838);
      ali localali = (ali)NearbyFriendsUI.r(NearbyFriendsUI.this).get(paramInt);
      GMTrace.o(6689143128064L, 49838);
      return localali;
    }
  }
  
  static final class c
  {
    public static int nus;
    
    static
    {
      GMTrace.i(6710617964544L, 49998);
      nus = 10000;
      GMTrace.o(6710617964544L, 49998);
    }
    
    public static String b(ali paramali)
    {
      GMTrace.i(6710483746816L, 49997);
      if (paramali != null)
      {
        paramali = paramali.gCy;
        GMTrace.o(6710483746816L, 49997);
        return paramali;
      }
      GMTrace.o(6710483746816L, 49997);
      return null;
    }
    
    public static boolean rJ(int paramInt)
    {
      GMTrace.i(6710349529088L, 49996);
      if (paramInt == nus)
      {
        GMTrace.o(6710349529088L, 49996);
        return true;
      }
      GMTrace.o(6710349529088L, 49996);
      return false;
    }
  }
  
  static final class d
  {
    ImageView gDc;
    TextView gDd;
    TextView gDe;
    ImageView nuA;
    TextView nut;
    TextView nuu;
    ImageView nuv;
    ImageView nuw;
    ImageView nux;
    ImageView nuy;
    ImageView nuz;
    
    d()
    {
      GMTrace.i(6690082652160L, 49845);
      GMTrace.o(6690082652160L, 49845);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\ui\NearbyFriendsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */