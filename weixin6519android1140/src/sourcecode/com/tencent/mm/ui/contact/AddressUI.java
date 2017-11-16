package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.AbstractTabChildActivity.a;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.AlphabetScrollBar;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.f.a;
import com.tencent.mm.ui.t.a;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AddressUI
  extends FragmentActivity
{
  public u wrj;
  
  public AddressUI()
  {
    GMTrace.i(1737716924416L, 12947);
    GMTrace.o(1737716924416L, 12947);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1737851142144L, 12948);
    super.onCreate(paramBundle);
    paramBundle = aR();
    if (paramBundle.E(16908290) == null)
    {
      this.wrj = new a();
      this.wrj.setArguments(getIntent().getExtras());
      paramBundle.aV().a(16908290, this.wrj).commit();
    }
    GMTrace.o(1737851142144L, 12948);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(1737985359872L, 12949);
    GMTrace.o(1737985359872L, 12949);
  }
  
  public static class a
    extends AbstractTabChildActivity.a
    implements com.tencent.mm.ad.e
  {
    private final long gZT;
    private ProgressDialog htG;
    List<String> iVA;
    com.tencent.mm.pluginsdk.ui.d jNJ;
    public int juH;
    public int juI;
    public com.tencent.mm.ui.widget.h juL;
    public p.d kIF;
    private Animation kUH;
    public boolean mDI;
    public ListView mvH;
    public TextView vPN;
    TextView wPJ;
    private TextView wPK;
    public a wPL;
    public com.tencent.mm.ui.voicesearch.b wPM;
    private String wPN;
    public String wPO;
    private int wPP;
    private AlphabetScrollBar wPQ;
    private LinearLayout wPR;
    public boolean wPS;
    private boolean wPT;
    private k wPU;
    private BizContactEntranceView wPV;
    private b wPW;
    private b wPX;
    private b wPY;
    private ContactCountView wPZ;
    public String wPl;
    private String wPm;
    public i wQa;
    boolean wQb;
    private boolean wQc;
    private LinearLayout wQd;
    private Animation wQe;
    private VerticalScrollBar.a wQf;
    List<String> wQg;
    private Runnable wQh;
    
    public a()
    {
      GMTrace.i(1813952593920L, 13515);
      this.htG = null;
      this.wPO = "";
      this.wPR = null;
      this.wPS = false;
      this.mDI = false;
      this.wPT = false;
      this.wQc = true;
      this.gZT = 180000L;
      this.kIF = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(1844285800448L, 13741);
          switch (paramAnonymousMenuItem.getItemId())
          {
          default: 
            GMTrace.o(1844285800448L, 13741);
            return;
          case 1: 
          case 2: 
            AddressUI.a.this.Wu(AddressUI.a.this.wPO);
            GMTrace.o(1844285800448L, 13741);
            return;
          }
          paramAnonymousMenuItem = AddressUI.a.this;
          Object localObject = AddressUI.a.this.wPO;
          at.AR();
          localObject = com.tencent.mm.y.c.yK().TE((String)localObject);
          if (com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type))
          {
            Intent localIntent = new Intent();
            localIntent.setClass(paramAnonymousMenuItem.vKB.vKW, ContactRemarkInfoModUI.class);
            localIntent.putExtra("Contact_User", ((com.tencent.mm.g.b.af)localObject).field_username);
            localIntent.putExtra("view_mode", true);
            paramAnonymousMenuItem.vKB.vKW.startActivity(localIntent);
          }
          GMTrace.o(1844285800448L, 13741);
        }
      };
      this.wQf = new VerticalScrollBar.a()
      {
        public final void uW(String paramAnonymousString)
        {
          int i = 0;
          GMTrace.i(1781203468288L, 13271);
          if (AddressUI.a.this.getString(R.l.dVW).equals(paramAnonymousString))
          {
            AddressUI.a.this.mvH.setSelection(0);
            GMTrace.o(1781203468288L, 13271);
            return;
          }
          Object localObject = AddressUI.a.this.wPL;
          com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AddressAdapter", "getSections");
          localObject = ((a)localObject).wPr;
          if (localObject == null)
          {
            GMTrace.o(1781203468288L, 13271);
            return;
          }
          if ("↑".equals(paramAnonymousString))
          {
            AddressUI.a.this.mvH.setSelection(0);
            GMTrace.o(1781203468288L, 13271);
            return;
          }
          if ("☆".equals(paramAnonymousString))
          {
            AddressUI.a.this.mvH.setSelection(AddressUI.a.this.mvH.getHeaderViewsCount());
            GMTrace.o(1781203468288L, 13271);
            return;
          }
          do
          {
            i += 1;
            if ((i >= localObject.length) || (localObject[i] == null)) {
              break;
            }
          } while (!localObject[i].equals(paramAnonymousString));
          i = AddressUI.a.this.wPL.getPositionForSection(i);
          AddressUI.a.this.mvH.setSelection(i + AddressUI.a.this.mvH.getHeaderViewsCount());
          GMTrace.o(1781203468288L, 13271);
          return;
          GMTrace.o(1781203468288L, 13271);
        }
      };
      this.jNJ = new com.tencent.mm.pluginsdk.ui.d(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1832474640384L, 13653);
          if (paramAnonymousInt1 < 2)
          {
            GMTrace.o(1832474640384L, 13653);
            return;
          }
          if (!AddressUI.a.this.wPS) {
            AddressUI.a.this.wPS = true;
          }
          GMTrace.o(1832474640384L, 13653);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(1832608858112L, 13654);
          if (paramAnonymousInt == 2) {
            com.tencent.mm.bw.d.bVG().cP(AddressUI.class.getName() + ".Listview", 4);
          }
          GMTrace.o(1832608858112L, 13654);
        }
      });
      this.iVA = new LinkedList();
      this.wQg = new LinkedList();
      this.wQh = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1738924883968L, 12956);
          AddressUI.a locala = AddressUI.a.this;
          LauncherUI localLauncherUI = (LauncherUI)locala.vKB.vKW;
          if ((localLauncherUI == null) || (localLauncherUI.vJi.vIy.kZJ == 1))
          {
            BackwardSupportUtil.c.a(locala.mvH);
            new com.tencent.mm.sdk.platformtools.ae().postDelayed(new AddressUI.a.3(locala), 300L);
          }
          GMTrace.o(1738924883968L, 12956);
        }
      };
      GMTrace.o(1813952593920L, 13515);
    }
    
    private void cgh()
    {
      GMTrace.i(1814892118016L, 13522);
      this.iVA = new LinkedList();
      this.wQg = new LinkedList();
      com.tencent.mm.bj.d.bNA();
      this.iVA.add("tmessage");
      this.wQg.addAll(this.iVA);
      if (!this.iVA.contains("officialaccounts")) {
        this.iVA.add("officialaccounts");
      }
      this.iVA.add("helper_entry");
      if (this.wPL != null) {
        this.wPL.cS(this.iVA);
      }
      if (this.wPM != null) {
        this.wPM.cS(this.wQg);
      }
      GMTrace.o(1814892118016L, 13522);
    }
    
    public final void Wu(String paramString)
    {
      GMTrace.i(16014456651776L, 119317);
      at.AR();
      com.tencent.mm.y.c.yK().b(this.wPL);
      at.AR();
      com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(paramString);
      localx.uB();
      s.t(localx);
      if (s.eb(paramString))
      {
        at.AR();
        com.tencent.mm.y.c.yK().TK(paramString);
        at.AR();
        com.tencent.mm.y.c.yT().gI(paramString);
      }
      for (;;)
      {
        this.wPL.da(paramString, 5);
        at.AR();
        com.tencent.mm.y.c.yK().a(this.wPL);
        GMTrace.o(16014456651776L, 119317);
        return;
        at.AR();
        com.tencent.mm.y.c.yK().a(paramString, localx);
      }
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
    {
      GMTrace.i(1814757900288L, 13521);
      if (this.htG != null)
      {
        this.htG.dismiss();
        this.htG = null;
      }
      if (!com.tencent.mm.platformtools.t.bx(this.vKB.vKW))
      {
        GMTrace.o(1814757900288L, 13521);
        return;
      }
      if (t.a.a(this.vKB.vKW, paramInt1, paramInt2, paramString, 4))
      {
        GMTrace.o(1814757900288L, 13521);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        GMTrace.o(1814757900288L, 13521);
        return;
      }
      GMTrace.o(1814757900288L, 13521);
    }
    
    public final boolean aaS()
    {
      GMTrace.i(1814355247104L, 13518);
      GMTrace.o(1814355247104L, 13518);
      return true;
    }
    
    protected final void bVJ()
    {
      GMTrace.i(1815160553472L, 13524);
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AddressUI", "address ui on create");
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AddressUI", "on address ui create");
      this.wPS = false;
      this.mDI = false;
      this.wPT = false;
      this.wPl = null;
      this.wPm = null;
      this.wPN = null;
      at.wS().a(138, this);
      this.wPl = "@all.contact.without.chatroom";
      this.wPm = getStringExtra("Contact_GroupFilter_Str");
      this.wPN = getString(R.l.dBs);
      this.wPP = getIntExtra("List_Type", 2);
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AddressUI", "on address ui init view, %s", new Object[] { getResources().getDisplayMetrics() });
      if (this.mvH != null)
      {
        if (this.wPU != null) {
          this.mvH.removeHeaderView(this.wPU);
        }
        if (this.wPV != null) {
          this.mvH.removeHeaderView(this.wPV);
        }
        if (this.wPW != null) {
          this.mvH.removeHeaderView(this.wPW);
        }
        if (this.wPY != null) {
          this.mvH.removeHeaderView(this.wPY);
        }
      }
      this.mvH = ((ListView)findViewById(R.h.bcT));
      this.mvH.setScrollingCacheEnabled(false);
      this.wPJ = ((TextView)findViewById(R.h.bwx));
      this.wPJ.setText(R.l.cQT);
      this.vPN = ((TextView)findViewById(R.h.bwQ));
      this.vPN.setText(R.l.cQV);
      this.wPK = ((TextView)findViewById(R.h.bwS));
      this.wPK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1713020862464L, 12763);
          GMTrace.o(1713020862464L, 12763);
        }
      });
      this.wPL = new a(this.vKB.vKW, this.wPl, this.wPm, this.wPP);
      this.mvH.setAdapter(null);
      this.wPL.a(new f.a()
      {
        public final void QC()
        {
          GMTrace.i(1794759458816L, 13372);
          AddressUI.a locala = AddressUI.a.this;
          AddressUI.a.this.wPL.getCount();
          locala.wPJ.setVisibility(8);
          locala.mvH.setVisibility(0);
          AddressUI.a.this.wPL.cge();
          GMTrace.o(1794759458816L, 13372);
        }
        
        public final void QD()
        {
          GMTrace.i(1794893676544L, 13373);
          GMTrace.o(1794893676544L, 13373);
        }
      });
      this.wPL.wPy = true;
      this.wPL.l(this);
      this.wPL.a(new MMSlideDelView.c()
      {
        public final int cf(View paramAnonymousView)
        {
          GMTrace.i(1830327156736L, 13637);
          int i = AddressUI.a.this.mvH.getPositionForView(paramAnonymousView);
          GMTrace.o(1830327156736L, 13637);
          return i;
        }
      });
      this.wPL.a(new MMSlideDelView.f()
      {
        public final void t(View paramAnonymousView, int paramAnonymousInt)
        {
          GMTrace.i(1714228822016L, 12772);
          AddressUI.a.this.mvH.performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
          GMTrace.o(1714228822016L, 12772);
        }
      });
      this.wPL.a(new MMSlideDelView.e()
      {
        public final void aV(Object paramAnonymousObject)
        {
          GMTrace.i(1844017364992L, 13739);
          if (paramAnonymousObject == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AddressUI", "onItemDel object null");
            GMTrace.o(1844017364992L, 13739);
            return;
          }
          AddressUI.a.this.Wu(paramAnonymousObject.toString());
          GMTrace.o(1844017364992L, 13739);
        }
      });
      this.wPM = new com.tencent.mm.ui.voicesearch.b(this.vKB.vKW, 1);
      this.wPM.mI(true);
      this.wQd = new LinearLayout(this.vKB.vKW);
      this.wQd.setOrientation(1);
      this.mvH.addHeaderView(this.wQd);
      this.wPX = new b(this.vKB.vKW, b.a.wQo);
      this.wQd.addView(this.wPX);
      at.AR();
      ((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsi, Boolean.valueOf(false))).booleanValue();
      this.wPX.setVisible(false);
      this.wPU = new k(this.vKB.vKW);
      this.wQd.addView(this.wPU);
      this.wPW = new b(this.vKB.vKW, b.a.wQm);
      this.wQd.addView(this.wPW);
      this.wPW.setVisible(true);
      this.wPY = new b(this.vKB.vKW, b.a.wQn);
      this.wQd.addView(this.wPY);
      this.wPY.setVisible(true);
      ListView localListView = this.mvH;
      ContactCountView localContactCountView = new ContactCountView(this.vKB.vKW);
      this.wPZ = localContactCountView;
      localListView.addFooterView(localContactCountView, null, false);
      if (com.tencent.mm.bj.d.LL("brandservice"))
      {
        this.wPV = new BizContactEntranceView(this.vKB.vKW);
        this.wQd.addView(this.wPV);
        this.wPV.setVisible(true);
        this.wQa = new i(this.vKB.vKW, new i.a()
        {
          public final void DB(int paramAnonymousInt)
          {
            GMTrace.i(1786840612864L, 13313);
            if (AddressUI.a.this.wQa == null)
            {
              GMTrace.o(1786840612864L, 13313);
              return;
            }
            if (paramAnonymousInt <= 0)
            {
              AddressUI.a.this.wQa.setVisibility(8);
              GMTrace.o(1786840612864L, 13313);
              return;
            }
            AddressUI.a.this.wQa.setVisibility(0);
            GMTrace.o(1786840612864L, 13313);
          }
        });
        if (this.wQa.cgs() <= 0) {
          this.wQa.setVisibility(8);
        }
        this.wQd.addView(this.wQa);
      }
      this.juL = new com.tencent.mm.ui.widget.h(this.vKB.vKW);
      this.wPL.wPw = new a.a() {};
      this.mvH.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(1842138316800L, 13725);
          paramAnonymousView = new StringBuilder("onItemClick ").append(paramAnonymousInt);
          if (AddressUI.a.this.wPM == null) {}
          for (paramAnonymousAdapterView = AddressUI.a.this.wPM;; paramAnonymousAdapterView = Boolean.valueOf(AddressUI.a.this.wPM.xmZ))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AddressUI", paramAnonymousAdapterView);
            if ((paramAnonymousInt != 0) || ("@biz.contact".equals(AddressUI.a.this.wPl))) {
              break;
            }
            GMTrace.o(1842138316800L, 13725);
            return;
          }
          if (paramAnonymousInt < AddressUI.a.this.mvH.getHeaderViewsCount())
          {
            GMTrace.o(1842138316800L, 13725);
            return;
          }
          paramAnonymousInt -= AddressUI.a.this.mvH.getHeaderViewsCount();
          Object localObject;
          if ((AddressUI.a.this.wPM != null) && (AddressUI.a.this.wPM.xmZ))
          {
            boolean bool1 = AddressUI.a.this.wPM.oR(paramAnonymousInt);
            boolean bool2 = AddressUI.a.this.wPM.Ed(paramAnonymousInt);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AddressUI", "onItemClick " + bool2);
            if (bool2)
            {
              AddressUI.a.this.wPM.Xe("");
              GMTrace.o(1842138316800L, 13725);
              return;
            }
            if (bool1)
            {
              paramAnonymousView = AddressUI.a.this.wPM.Ec(paramAnonymousInt);
              paramAnonymousAdapterView = paramAnonymousView.ufy.uNR;
              at.AR();
              localObject = com.tencent.mm.y.c.yK().TE(paramAnonymousAdapterView);
              if (com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type))
              {
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView);
                paramAnonymousView.putExtra("Contact_Scene", 3);
                if ((paramAnonymousAdapterView != null) && (paramAnonymousAdapterView.length() > 0))
                {
                  if (((com.tencent.mm.storage.x)localObject).bSA()) {
                    g.ork.A(10298, paramAnonymousAdapterView + ",3");
                  }
                  e.a(paramAnonymousView, paramAnonymousAdapterView);
                  com.tencent.mm.bj.d.b(AddressUI.a.this.vKB.vKW, "profile", ".ui.ContactInfoUI", paramAnonymousView);
                }
                GMTrace.o(1842138316800L, 13725);
                return;
              }
              localObject = new Intent();
              ((Intent)localObject).putExtra("Contact_User", paramAnonymousView.ufy.uNR);
              ((Intent)localObject).putExtra("Contact_Alias", paramAnonymousView.gCC);
              ((Intent)localObject).putExtra("Contact_Nick", paramAnonymousView.uxT.uNR);
              ((Intent)localObject).putExtra("Contact_Signature", paramAnonymousView.gCA);
              ((Intent)localObject).putExtra("Contact_RegionCode", RegionCodeDecoder.ai(paramAnonymousView.gCG, paramAnonymousView.gCy, paramAnonymousView.gCz));
              ((Intent)localObject).putExtra("Contact_Sex", paramAnonymousView.gCx);
              ((Intent)localObject).putExtra("Contact_VUser_Info", paramAnonymousView.uAw);
              ((Intent)localObject).putExtra("Contact_VUser_Info_Flag", paramAnonymousView.uAv);
              ((Intent)localObject).putExtra("Contact_KWeibo_flag", paramAnonymousView.uAz);
              ((Intent)localObject).putExtra("Contact_KWeibo", paramAnonymousView.uAx);
              ((Intent)localObject).putExtra("Contact_KWeiboNick", paramAnonymousView.uAy);
              ((Intent)localObject).putExtra("Contact_KSnsIFlag", paramAnonymousView.uAB.gCI);
              ((Intent)localObject).putExtra("Contact_KSnsBgId", paramAnonymousView.uAB.gCK);
              ((Intent)localObject).putExtra("Contact_KSnsBgUrl", paramAnonymousView.uAB.gCJ);
              if (paramAnonymousView.uAC != null) {}
              try
              {
                ((Intent)localObject).putExtra("Contact_customInfo", paramAnonymousView.uAC.toByteArray());
                if ((paramAnonymousView.uAv & 0x8) > 0) {
                  g.ork.A(10298, paramAnonymousAdapterView + ",3");
                }
                com.tencent.mm.bj.d.b(AddressUI.a.this.vKB.vKW, "profile", ".ui.ContactInfoUI", (Intent)localObject);
                GMTrace.o(1842138316800L, 13725);
                return;
              }
              catch (IOException localIOException)
              {
                for (;;)
                {
                  com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.AddressUI", localIOException, "", new Object[0]);
                }
              }
            }
            paramAnonymousAdapterView = AddressUI.a.this.wPM.me(paramAnonymousInt);
            if (paramAnonymousAdapterView == null)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AddressUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", new Object[] { Integer.valueOf(AddressUI.a.this.wPM.getCount()), Integer.valueOf(paramAnonymousInt) });
              GMTrace.o(1842138316800L, 13725);
              return;
            }
            paramAnonymousAdapterView = paramAnonymousAdapterView.field_username;
            if (s.gc(paramAnonymousAdapterView))
            {
              paramAnonymousAdapterView = new Intent(AddressUI.a.this.vKB.vKW, AddressUI.class);
              paramAnonymousAdapterView.putExtra("Contact_GroupFilter_Type", "@biz.contact");
              AddressUI.a.this.startActivity(paramAnonymousAdapterView);
              GMTrace.o(1842138316800L, 13725);
              return;
            }
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView);
            paramAnonymousView.putExtra("Contact_Scene", 3);
            if ((paramAnonymousAdapterView != null) && (paramAnonymousAdapterView.length() > 0)) {
              com.tencent.mm.bj.d.b(AddressUI.a.this.vKB.vKW, "profile", ".ui.ContactInfoUI", paramAnonymousView);
            }
            GMTrace.o(1842138316800L, 13725);
            return;
          }
          paramAnonymousAdapterView = (com.tencent.mm.storage.f)AddressUI.a.this.wPL.AH(paramAnonymousInt);
          if (paramAnonymousAdapterView != null)
          {
            paramAnonymousAdapterView = paramAnonymousAdapterView.field_username;
            paramAnonymousView = AddressUI.a.this;
            if ((paramAnonymousAdapterView == null) || (paramAnonymousAdapterView.length() <= 0))
            {
              GMTrace.o(1842138316800L, 13725);
              return;
            }
            if (s.gc(paramAnonymousAdapterView))
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AddressUI", "error, 4.5 do not contain this contact %s", new Object[] { paramAnonymousAdapterView });
              GMTrace.o(1842138316800L, 13725);
              return;
            }
            localObject = new Intent();
            ((Intent)localObject).putExtra("Contact_User", paramAnonymousAdapterView);
            if (s.fA(paramAnonymousAdapterView)) {
              ((Intent)localObject).putExtra("Is_group_card", true);
            }
            if ((paramAnonymousAdapterView != null) && (paramAnonymousAdapterView.length() > 0))
            {
              e.a((Intent)localObject, paramAnonymousAdapterView);
              com.tencent.mm.bj.d.b(paramAnonymousView.vKB.vKW, "profile", ".ui.ContactInfoUI", (Intent)localObject);
            }
          }
          GMTrace.o(1842138316800L, 13725);
        }
      });
      this.mvH.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(1806704836608L, 13461);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AddressUI", "onItemLongClick, targetview is SearchBar::ListView, pos = " + paramAnonymousInt);
          if (paramAnonymousInt < AddressUI.a.this.mvH.getHeaderViewsCount())
          {
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.AddressUI", "on item long click, but match header view");
            GMTrace.o(1806704836608L, 13461);
            return true;
          }
          if ((AddressUI.a.this.wPM != null) && (AddressUI.a.this.wPM.xmZ))
          {
            GMTrace.o(1806704836608L, 13461);
            return true;
          }
          paramAnonymousAdapterView = (com.tencent.mm.storage.f)AddressUI.a.this.wPL.AH(paramAnonymousInt - AddressUI.a.this.mvH.getHeaderViewsCount());
          if (paramAnonymousAdapterView == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AddressUI", "cont is null. position:%d, header count:%d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(AddressUI.a.this.mvH.getHeaderViewsCount()) });
            GMTrace.o(1806704836608L, 13461);
            return true;
          }
          paramAnonymousAdapterView = paramAnonymousAdapterView.field_username;
          if ((s.gc(paramAnonymousAdapterView)) || (s.gd(paramAnonymousAdapterView)))
          {
            GMTrace.o(1806704836608L, 13461);
            return true;
          }
          AddressUI.a.this.wPO = paramAnonymousAdapterView;
          AddressUI.a.this.juL.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, AddressUI.a.this, AddressUI.a.this.kIF, AddressUI.a.this.juH, AddressUI.a.this.juI);
          GMTrace.o(1806704836608L, 13461);
          return true;
        }
      });
      this.mvH.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(1795162112000L, 13375);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(1795162112000L, 13375);
            return false;
            AddressUI.a.this.avJ();
            AddressUI.a.this.juH = ((int)paramAnonymousMotionEvent.getRawX());
            AddressUI.a.this.juI = ((int)paramAnonymousMotionEvent.getRawY());
          }
        }
      });
      this.mvH.setOnScrollListener(this.jNJ);
      this.mvH.setDrawingCacheEnabled(false);
      this.wPQ = ((AlphabetScrollBar)findViewById(R.h.bdc));
      this.wPQ.wiZ = this.wQf;
      at.AR();
      com.tencent.mm.y.c.yK().a(this.wPL);
      if (this.wQa != null) {
        com.tencent.mm.af.x.FG().a(this.wQa, null);
      }
      GMTrace.o(1815160553472L, 13524);
    }
    
    protected final void bVK()
    {
      GMTrace.i(1815294771200L, 13525);
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AddressUI", "address ui on resume");
      long l = System.currentTimeMillis();
      at.AR();
      if (l - com.tencent.mm.platformtools.t.d((Long)com.tencent.mm.y.c.xh().get(340226, null)) >= 180000L) {
        cgj();
      }
      Object localObject;
      if (this.wQc)
      {
        this.wQc = false;
        this.wQb = false;
        cgh();
        this.mvH.setAdapter(this.wPL);
        this.mvH.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1715973652480L, 12785);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AddressUI", "post to first init finish");
            View localView = AddressUI.a.this.findViewById(R.h.bKK);
            if (localView != null)
            {
              localView.setVisibility(8);
              localView.startAnimation(AnimationUtils.loadAnimation(AddressUI.a.this.vKB.vKW, R.a.aLt));
            }
            GMTrace.o(1715973652480L, 12785);
          }
        });
        this.wPM.mH(false);
        if (this.wPV != null)
        {
          localObject = this.wPV;
          ((BizContactEntranceView)localObject).cgk();
          ((BizContactEntranceView)localObject).setVisible(true);
        }
        if (this.wQa != null)
        {
          if (this.wQa.cgs() > 0) {
            break label416;
          }
          this.wQa.setVisibility(8);
        }
      }
      for (;;)
      {
        at.AR();
        this.wPS = ((Boolean)com.tencent.mm.y.c.xh().get(12296, Boolean.valueOf(false))).booleanValue();
        if (this.wPP == 2)
        {
          at.AR();
          localObject = com.tencent.mm.y.c.yK().TE(q.zE());
          if ((localObject != null) && ((!com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type)) || (!com.tencent.mm.platformtools.t.nm(((com.tencent.mm.g.b.af)localObject).field_conRemark)) || (!com.tencent.mm.platformtools.t.nm(((com.tencent.mm.g.b.af)localObject).field_conRemarkPYFull)) || (!com.tencent.mm.platformtools.t.nm(((com.tencent.mm.g.b.af)localObject).field_conRemarkPYShort))))
          {
            ((com.tencent.mm.storage.x)localObject).uA();
            ((com.tencent.mm.storage.x)localObject).cj("");
            ((com.tencent.mm.storage.x)localObject).cp("");
            ((com.tencent.mm.storage.x)localObject).cq("");
            at.AR();
            com.tencent.mm.y.c.yK().a(q.zE(), (com.tencent.mm.storage.x)localObject);
          }
        }
        if (this.wPM != null) {
          this.wPM.onResume();
        }
        this.wPL.vGS = false;
        com.tencent.mm.sdk.platformtools.af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1777982242816L, 13247);
            a locala = AddressUI.a.this.wPL;
            com.tencent.mm.sdk.platformtools.w.i(locala.TAG, "newcursor resume ");
            locala.vGM = true;
            locala.aY("resume", true);
            GMTrace.o(1777982242816L, 13247);
          }
        });
        if (this.wPU != null)
        {
          this.wPU.wSg = true;
          k.cgu();
        }
        localObject = (LauncherUI)this.vKB.vKW;
        if (localObject != null) {
          ((LauncherUI)localObject).vJi.W(this.wQh);
        }
        GMTrace.o(1815294771200L, 13525);
        return;
        if (!this.wQb) {
          break;
        }
        this.wQb = false;
        com.tencent.mm.sdk.f.e.b(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1730737602560L, 12895);
            Process.setThreadPriority(10);
            AddressUI.a.this.cgi();
            GMTrace.o(1730737602560L, 12895);
          }
        }, "AddressUI_updateUIData", 4);
        this.wPZ.cgl();
        break;
        label416:
        this.wQa.setVisibility(0);
      }
    }
    
    protected final void bVL()
    {
      GMTrace.i(1815563206656L, 13527);
      GMTrace.o(1815563206656L, 13527);
    }
    
    protected final void bVM()
    {
      GMTrace.i(1815697424384L, 13528);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AddressUI", "AddressUI on Pause");
      at.AR();
      com.tencent.mm.y.c.xh().set(340226, Long.valueOf(System.currentTimeMillis()));
      at.AR();
      com.tencent.mm.y.c.xh().set(12296, Boolean.valueOf(this.wPS));
      if (this.wPM != null) {
        this.wPM.onPause();
      }
      this.wPL.cgf();
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1793551499264L, 13363);
          AddressUI.a.this.wPL.pause();
          GMTrace.o(1793551499264L, 13363);
        }
      });
      if (this.wPU != null) {
        this.wPU.wSg = false;
      }
      LauncherUI localLauncherUI = (LauncherUI)this.vKB.vKW;
      if (localLauncherUI != null) {
        localLauncherUI.vJi.X(this.wQh);
      }
      GMTrace.o(1815697424384L, 13528);
    }
    
    protected final void bVN()
    {
      GMTrace.i(1815831642112L, 13529);
      GMTrace.o(1815831642112L, 13529);
    }
    
    protected final void bVO()
    {
      GMTrace.i(1815965859840L, 13530);
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AddressUI", "onDestory");
      if (this.wPQ != null) {
        this.wPQ.wiZ = null;
      }
      at.wS().b(138, this);
      Object localObject;
      if (this.wPL != null)
      {
        this.wPL.kV(true);
        localObject = this.wPL;
        if (((a)localObject).gCY != null)
        {
          ((a)localObject).gCY.detach();
          ((a)localObject).gCY = null;
        }
        this.wPL.bWr();
      }
      if (this.wPM != null)
      {
        this.wPM.detach();
        this.wPM.aJe();
      }
      if ((at.AU()) && (this.wPL != null))
      {
        at.AR();
        com.tencent.mm.y.c.yK().b(this.wPL);
      }
      if ((at.AU()) && (this.wQa != null)) {
        com.tencent.mm.af.x.FG().a(this.wQa);
      }
      if (this.wPU != null)
      {
        localObject = this.wPU;
        if (at.AU()) {
          com.tencent.mm.bc.l.ML().j(((k)localObject).wSf);
        }
        this.wPU = null;
      }
      if (this.wPV != null) {
        this.wPV = null;
      }
      if (this.wPW != null) {
        this.wPW = null;
      }
      if (this.wPY != null) {
        this.wPY = null;
      }
      GMTrace.o(1815965859840L, 13530);
    }
    
    public final void bVP()
    {
      GMTrace.i(1816368513024L, 13533);
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AddressUI", "request to top");
      if (this.mvH != null) {
        BackwardSupportUtil.c.a(this.mvH);
      }
      GMTrace.o(1816368513024L, 13533);
    }
    
    public final void bVQ()
    {
      GMTrace.i(1816100077568L, 13531);
      if (this.wPL != null)
      {
        a locala = this.wPL;
        locala.wPC.clear();
        locala.wPA.clear();
        locala.wPB = false;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.INIT", "KEVIN Address turnTobg");
      if (this.wPV != null) {
        this.wPV.destroyDrawingCache();
      }
      if (this.wPW != null) {
        this.wPW.destroyDrawingCache();
      }
      if (this.wPY != null) {
        this.wPY.destroyDrawingCache();
      }
      if (this.wPZ != null) {
        this.wPZ.destroyDrawingCache();
      }
      if (this.wPU != null) {
        this.wPU.destroyDrawingCache();
      }
      GMTrace.o(1816100077568L, 13531);
    }
    
    public final void bVR()
    {
      GMTrace.i(1816234295296L, 13532);
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.INIT", "KEVIN Address turnTofg");
      GMTrace.o(1816234295296L, 13532);
    }
    
    public final void bWN()
    {
      GMTrace.i(1816502730752L, 13534);
      if (this.wPU != null) {
        k.cgu();
      }
      GMTrace.o(1816502730752L, 13534);
    }
    
    public final boolean bmX()
    {
      GMTrace.i(1814221029376L, 13517);
      GMTrace.o(1814221029376L, 13517);
      return false;
    }
    
    public final void cgi()
    {
      try
      {
        GMTrace.i(1815428988928L, 13526);
        long l = System.currentTimeMillis();
        cgh();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AddressUI", "KEVIN updateBlockList() LAST" + (System.currentTimeMillis() - l));
        l = System.currentTimeMillis();
        if (this.wPL != null)
        {
          com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AddressUI", "post to do refresh");
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(1716242087936L, 12787);
              AddressUI.a.this.wPL.cgg();
              GMTrace.o(1716242087936L, 12787);
            }
          });
        }
        if (this.wPM != null) {
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(1746172641280L, 13010);
              com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AddressUI", "post search adapter to do refresh");
              AddressUI.a.this.wPM.a(null, null);
              GMTrace.o(1746172641280L, 13010);
            }
          });
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AddressUI", "KEVIN doRefresh() LAST" + (System.currentTimeMillis() - l));
        GMTrace.o(1815428988928L, 13526);
        return;
      }
      finally {}
    }
    
    public final void cgj()
    {
      GMTrace.i(1817710690304L, 13543);
      if (this.mvH != null) {
        this.mvH.setSelection(0);
      }
      GMTrace.o(1817710690304L, 13543);
    }
    
    protected final int getLayoutId()
    {
      GMTrace.i(1814086811648L, 13516);
      int i = R.i.coT;
      GMTrace.o(1814086811648L, 13516);
      return i;
    }
    
    public final void mo(boolean paramBoolean)
    {
      GMTrace.i(1814489464832L, 13519);
      if (this.wPQ != null)
      {
        if (this.kUH == null)
        {
          this.kUH = AnimationUtils.loadAnimation(this.vKB.vKW, R.a.aLq);
          this.kUH.setDuration(200L);
        }
        if (this.wQe == null)
        {
          this.wQe = AnimationUtils.loadAnimation(this.vKB.vKW, R.a.aLq);
          this.wQe.setDuration(200L);
        }
        if (paramBoolean)
        {
          if (this.wPQ.getVisibility() != 0)
          {
            this.wPQ.setVisibility(0);
            this.wPQ.startAnimation(this.kUH);
            GMTrace.o(1814489464832L, 13519);
          }
        }
        else if (4 != this.wPQ.getVisibility())
        {
          this.wPQ.setVisibility(8);
          this.wPQ.startAnimation(this.wQe);
        }
      }
      GMTrace.o(1814489464832L, 13519);
    }
    
    public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
      GMTrace.i(1815026335744L, 13523);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AddressUI", "onAcvityResult requestCode: %d", new Object[] { Integer.valueOf(paramInt1) });
      if ((paramInt1 == 6) && (paramInt2 == -1))
      {
        if (this.vHX) {
          bWQ().setResult(-1);
        }
        finish();
        GMTrace.o(1815026335744L, 13523);
        return;
      }
      if (paramInt2 != -1)
      {
        GMTrace.o(1815026335744L, 13523);
        return;
      }
      switch (paramInt1)
      {
      default: 
        GMTrace.o(1815026335744L, 13523);
        return;
      }
      if (this.vHX) {
        bWQ().setResult(-1);
      }
      for (;;)
      {
        finish();
        break;
        bWQ().setResult(-1, paramIntent);
      }
    }
    
    public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      GMTrace.i(1814623682560L, 13520);
      super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
      paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
      at.AR();
      com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(this.wPO);
      if (localx == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AddressUI", "onCreateContextMenu, contact is null, username = " + this.wPO);
        GMTrace.o(1814623682560L, 13520);
        return;
      }
      if (q.zE().equals(localx.field_username))
      {
        GMTrace.o(1814623682560L, 13520);
        return;
      }
      if (s.fA(this.wPO))
      {
        paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.d.h.a(paramView.getContext(), localx.vk()));
        paramContextMenu.add(paramContextMenuInfo.position, 2, 0, R.l.cQS);
        GMTrace.o(1814623682560L, 13520);
        return;
      }
      if ((s.fP(this.wPO)) || (s.gf(this.wPO)))
      {
        GMTrace.o(1814623682560L, 13520);
        return;
      }
      paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.d.h.a(paramView.getContext(), localx.vk()));
      if ((com.tencent.mm.l.a.eE(localx.field_type)) && (localx.field_deleteFlag != 1)) {
        paramContextMenu.add(paramContextMenuInfo.position, 7, 0, R.l.djW);
      }
      GMTrace.o(1814623682560L, 13520);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\AddressUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */