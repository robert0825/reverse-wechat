package com.tencent.mm.plugin.nearby.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bc.i;
import com.tencent.mm.g.a.j;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;

public class NearbySayHiListUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private int aCN;
  private int fMw;
  private r hsU;
  private ListView htD;
  private p.d jqg;
  private View mOO;
  private com.tencent.mm.plugin.nearby.a.c ntK;
  private i nuC;
  private a nuD;
  private int nuE;
  private int nuF;
  private boolean nuG;
  private long nuH;
  
  public NearbySayHiListUI()
  {
    GMTrace.i(6704175513600L, 49950);
    this.nuC = null;
    this.aCN = 0;
    this.nuE = 0;
    this.nuF = 0;
    this.fMw = 0;
    this.hsU = null;
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6690887958528L, 49851);
        com.tencent.mm.bc.l.MM().lQ(String.valueOf(NearbySayHiListUI.h(NearbySayHiListUI.this)));
        NearbySayHiListUI.b(NearbySayHiListUI.this).a(null, null);
        if (NearbySayHiListUI.c(NearbySayHiListUI.this) > 0) {
          NearbySayHiListUI.i(NearbySayHiListUI.this);
        }
        NearbySayHiListUI.j(NearbySayHiListUI.this);
        GMTrace.o(6690887958528L, 49851);
      }
    };
    GMTrace.o(6704175513600L, 49950);
  }
  
  protected final void MP()
  {
    GMTrace.i(6705115037696L, 49957);
    this.htD = ((ListView)findViewById(R.h.bZs));
    if (!com.tencent.mm.bh.a.bIM())
    {
      localObject = getLayoutInflater().inflate(R.i.cEW, null);
      ((View)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6701491159040L, 49930);
          NearbySayHiListUI.a(NearbySayHiListUI.this, NearbySayHiListUI.a(NearbySayHiListUI.this) + 8);
          w.d("MicroMsg.SayHiListUI", "dkfooter more btn:" + NearbySayHiListUI.a(NearbySayHiListUI.this));
          paramAnonymousView = NearbySayHiListUI.b(NearbySayHiListUI.this);
          int i = NearbySayHiListUI.a(NearbySayHiListUI.this);
          paramAnonymousView.aJe();
          paramAnonymousView.aCN = i;
          paramAnonymousView.QF();
          if (NearbySayHiListUI.c(NearbySayHiListUI.this) <= NearbySayHiListUI.a(NearbySayHiListUI.this))
          {
            NearbySayHiListUI.d(NearbySayHiListUI.this).removeFooterView(localObject);
            w.d("MicroMsg.SayHiListUI", "dkfooter REMOVE more btn: " + NearbySayHiListUI.a(NearbySayHiListUI.this));
          }
          GMTrace.o(6701491159040L, 49930);
        }
      });
      if ((this.nuE > 0) && (this.aCN < this.nuE)) {
        this.htD.addFooterView((View)localObject);
      }
    }
    a(0, getString(R.l.cSl), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6714241843200L, 50025);
        com.tencent.mm.ui.base.h.a(NearbySayHiListUI.this.vKB.vKW, true, NearbySayHiListUI.this.getResources().getString(R.l.dUP), "", NearbySayHiListUI.this.getResources().getString(R.l.dUO), NearbySayHiListUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6702967554048L, 49941);
            NearbySayHiListUI.e(NearbySayHiListUI.this).MH();
            NearbySayHiListUI.b(NearbySayHiListUI.this).QF();
            paramAnonymous2DialogInterface = (TextView)NearbySayHiListUI.this.findViewById(R.h.bwF);
            paramAnonymous2DialogInterface.setText(R.l.dUS);
            paramAnonymous2DialogInterface.setVisibility(0);
            NearbySayHiListUI.this.lf(false);
            GMTrace.o(6702967554048L, 49941);
          }
        }, null);
        GMTrace.o(6714241843200L, 50025);
        return true;
      }
    });
    if (this.nuE == 0)
    {
      localObject = (TextView)findViewById(R.h.bwF);
      ((TextView)localObject).setText(R.l.dUS);
      ((TextView)localObject).setVisibility(0);
      lf(false);
    }
    if ((this.nuG) && (this.fMw != 0) && (this.nuF >= this.fMw) && (bg.Jw()))
    {
      this.mOO = new CleanLocationHeaderView(this);
      this.mOO.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6709410004992L, 49989);
          NearbySayHiListUI.a(NearbySayHiListUI.this, new com.tencent.mm.plugin.nearby.a.c(2, 0.0F, 0.0F, 0, 0, "", ""));
          at.wS().a(NearbySayHiListUI.f(NearbySayHiListUI.this), 0);
          paramAnonymousView = NearbySayHiListUI.this;
          ActionBarActivity localActionBarActivity = NearbySayHiListUI.this.vKB.vKW;
          NearbySayHiListUI.this.getString(R.l.cUG);
          NearbySayHiListUI.a(paramAnonymousView, com.tencent.mm.ui.base.h.a(localActionBarActivity, NearbySayHiListUI.this.getString(R.l.dKF), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(6693974966272L, 49874);
              at.wS().c(NearbySayHiListUI.f(NearbySayHiListUI.this));
              GMTrace.o(6693974966272L, 49874);
            }
          }));
          com.tencent.mm.plugin.report.service.g.ork.A(11429, "0");
          GMTrace.o(6709410004992L, 49989);
        }
      });
      this.htD.addHeaderView(this.mOO);
    }
    this.nuD = new a(this, this.nuC, this.aCN);
    this.nuD.a(new MMSlideDelView.c()
    {
      public final int cf(View paramAnonymousView)
      {
        GMTrace.i(6713973407744L, 50023);
        int i = NearbySayHiListUI.d(NearbySayHiListUI.this).getPositionForView(paramAnonymousView);
        GMTrace.o(6713973407744L, 50023);
        return i;
      }
    });
    this.nuD.a(new MMSlideDelView.f()
    {
      public final void t(View paramAnonymousView, int paramAnonymousInt)
      {
        GMTrace.i(6708336263168L, 49981);
        NearbySayHiListUI.d(NearbySayHiListUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
        GMTrace.o(6708336263168L, 49981);
      }
    });
    this.nuD.a(new MMSlideDelView.e()
    {
      public final void aV(Object paramAnonymousObject)
      {
        GMTrace.i(6695451361280L, 49885);
        if (paramAnonymousObject == null)
        {
          w.e("MicroMsg.SayHiListUI", "onItemDel object null");
          GMTrace.o(6695451361280L, 49885);
          return;
        }
        com.tencent.mm.bc.l.MM().lQ(paramAnonymousObject.toString());
        NearbySayHiListUI.b(NearbySayHiListUI.this).a(null, null);
        GMTrace.o(6695451361280L, 49885);
      }
    });
    this.htD.setAdapter(this.nuD);
    final Object localObject = new com.tencent.mm.ui.tools.l(this);
    this.htD.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6687264079872L, 49824);
        if (paramAnonymousInt < NearbySayHiListUI.d(NearbySayHiListUI.this).getHeaderViewsCount())
        {
          w.w("MicroMsg.SayHiListUI", "on header view long click, ignore");
          GMTrace.o(6687264079872L, 49824);
          return true;
        }
        localObject.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, NearbySayHiListUI.this, NearbySayHiListUI.g(NearbySayHiListUI.this));
        GMTrace.o(6687264079872L, 49824);
        return true;
      }
    });
    this.htD.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6688606257152L, 49834);
        int i = paramAnonymousInt;
        if (NearbySayHiListUI.d(NearbySayHiListUI.this).getHeaderViewsCount() > 0) {
          i = paramAnonymousInt - NearbySayHiListUI.d(NearbySayHiListUI.this).getHeaderViewsCount();
        }
        com.tencent.mm.bc.h localh = (com.tencent.mm.bc.h)NearbySayHiListUI.b(NearbySayHiListUI.this).getItem(i);
        if ((localh == null) || (localh.field_content == null))
        {
          GMTrace.o(6688606257152L, 49834);
          return;
        }
        paramAnonymousView = au.d.Uk(localh.field_content);
        paramAnonymousAdapterView = new Intent();
        if (com.tencent.mm.bh.a.bIM())
        {
          paramAnonymousAdapterView.putExtra("Chat_User", localh.field_sayhiencryptuser);
          paramAnonymousAdapterView.putExtra("lbs_mode", true);
          paramAnonymousAdapterView.putExtra("add_scene", 18);
          com.tencent.mm.plugin.nearby.a.hnH.e(paramAnonymousAdapterView, NearbySayHiListUI.this);
          paramAnonymousAdapterView = new j();
          paramAnonymousAdapterView.eAg.scene = paramAnonymousView.scene;
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousAdapterView);
          GMTrace.o(6688606257152L, 49834);
          return;
        }
        Intent localIntent = new Intent();
        if (bg.nm(paramAnonymousView.rAP))
        {
          paramAnonymousAdapterView = localh.field_sayhiuser;
          label203:
          localIntent.putExtra("Contact_User", paramAnonymousAdapterView);
          localIntent.putExtra("Contact_Alias", paramAnonymousView.fsF);
          localIntent.putExtra("Contact_Nick", paramAnonymousView.eCQ);
          localIntent.putExtra("Contact_QuanPin", paramAnonymousView.gDZ);
          localIntent.putExtra("Contact_PyInitial", paramAnonymousView.gDY);
          localIntent.putExtra("Contact_Sex", paramAnonymousView.fja);
          localIntent.putExtra("Contact_Signature", paramAnonymousView.signature);
          localIntent.putExtra("Contact_Scene", paramAnonymousView.scene);
          localIntent.putExtra("Contact_FMessageCard", true);
          localIntent.putExtra("Contact_City", paramAnonymousView.getCity());
          localIntent.putExtra("Contact_Province", paramAnonymousView.getProvince());
          if (!bg.nm(localh.field_sayhicontent)) {
            break label574;
          }
        }
        label574:
        for (paramAnonymousAdapterView = NearbySayHiListUI.this.getString(R.l.dfB);; paramAnonymousAdapterView = localh.field_sayhicontent)
        {
          localIntent.putExtra("Contact_Content", paramAnonymousAdapterView);
          localIntent.putExtra("Contact_verify_Scene", paramAnonymousView.scene);
          localIntent.putExtra("Contact_Uin", paramAnonymousView.nNL);
          localIntent.putExtra("Contact_QQNick", paramAnonymousView.gEa);
          localIntent.putExtra("Contact_Mobile_MD5", paramAnonymousView.vBs);
          localIntent.putExtra("User_From_Fmessage", true);
          localIntent.putExtra("Contact_from_msgType", 37);
          localIntent.putExtra("Verify_ticket", paramAnonymousView.nLA);
          localIntent.putExtra("Contact_Source_FMessage", paramAnonymousView.scene);
          localIntent.putExtra("Contact_ShowFMessageList", true);
          at.AR();
          paramAnonymousAdapterView = com.tencent.mm.y.c.yK().TE(paramAnonymousView.rAP);
          if ((paramAnonymousAdapterView != null) && ((int)paramAnonymousAdapterView.fTq >= 0) && (!com.tencent.mm.l.a.eE(paramAnonymousAdapterView.field_type)))
          {
            paramAnonymousInt = paramAnonymousView.eHJ;
            if ((paramAnonymousInt == 0) || (paramAnonymousInt == 2) || (paramAnonymousInt == 5)) {
              localIntent.putExtra("User_Verify", true);
            }
            localIntent.putExtra("Contact_IsLBSFriend", true);
            localIntent.putExtra("Sns_from_Scene", 18);
          }
          com.tencent.mm.plugin.nearby.a.hnH.d(localIntent, NearbySayHiListUI.this);
          break;
          paramAnonymousAdapterView = paramAnonymousView.rAP;
          break label203;
        }
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6713436536832L, 50019);
        NearbySayHiListUI.this.aLo();
        NearbySayHiListUI.this.setResult(0);
        NearbySayHiListUI.this.finish();
        GMTrace.o(6713436536832L, 50019);
        return true;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6711154835456L, 50002);
        BackwardSupportUtil.c.a(NearbySayHiListUI.d(NearbySayHiListUI.this));
        GMTrace.o(6711154835456L, 50002);
      }
    };
    GMTrace.o(6705115037696L, 49957);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6705517690880L, 49960);
    w.i("MicroMsg.SayHiListUI", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (((com.tencent.mm.plugin.nearby.a.c)paramk).CD() == 2)
      {
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dKE), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6714510278656L, 50027);
            NearbySayHiListUI.this.setResult(-1);
            NearbySayHiListUI.this.finish();
            GMTrace.o(6714510278656L, 50027);
          }
        });
        this.ntK = null;
        GMTrace.o(6705517690880L, 49960);
      }
    }
    else {
      w.w("MicroMsg.SayHiListUI", "[cpan] clear location failed.");
    }
    GMTrace.o(6705517690880L, 49960);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6704846602240L, 49955);
    int i = R.i.cAJ;
    GMTrace.o(6704846602240L, 49955);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(6705383473152L, 49959);
    setResult(0);
    super.onBackPressed();
    GMTrace.o(6705383473152L, 49959);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6704309731328L, 49951);
    super.onCreate(paramBundle);
    this.fMw = bg.Sy(com.tencent.mm.k.g.ut().getValue("ThresholdToCleanLocation"));
    this.nuG = getIntent().getBooleanExtra("show_clear_header", false);
    this.nuC = com.tencent.mm.bc.l.MM();
    oM(R.l.dUQ);
    this.nuF = this.nuC.ME();
    this.nuE = this.nuC.getCount();
    int i;
    if (com.tencent.mm.bh.a.bIM()) {
      i = this.nuE;
    }
    for (;;)
    {
      this.aCN = i;
      this.nuC.MG();
      MP();
      GMTrace.o(6704309731328L, 49951);
      return;
      if (this.nuF == 0) {
        i = 8;
      } else {
        i = this.nuF;
      }
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(6705249255424L, 49958);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenuInfo = (com.tencent.mm.bc.h)this.nuD.getItem(paramView.position);
    if (paramContextMenuInfo == null)
    {
      w.e("MicroMsg.SayHiListUI", "onItemLongClick, item is null, pos = " + paramView.position);
      GMTrace.o(6705249255424L, 49958);
      return;
    }
    paramContextMenu.add(0, 0, 0, R.l.cSt);
    this.nuH = paramContextMenuInfo.field_svrid;
    GMTrace.o(6705249255424L, 49958);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6704578166784L, 49953);
    this.nuD.aJe();
    super.onDestroy();
    GMTrace.o(6704578166784L, 49953);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6704980819968L, 49956);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(6704980819968L, 49956);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(6704712384512L, 49954);
    at.wS().b(148, this);
    super.onPause();
    GMTrace.o(6704712384512L, 49954);
  }
  
  protected void onResume()
  {
    GMTrace.i(6704443949056L, 49952);
    super.onResume();
    if (this.nuE != this.nuC.getCount())
    {
      this.nuE = this.nuC.getCount();
      if (this.nuE == 0)
      {
        TextView localTextView = (TextView)findViewById(R.h.bwF);
        localTextView.setText(R.l.dUS);
        localTextView.setVisibility(0);
        lf(false);
      }
      this.nuD.QF();
    }
    this.nuD.notifyDataSetChanged();
    at.wS().a(148, this);
    GMTrace.o(6704443949056L, 49952);
  }
  
  final class a
    extends o<com.tencent.mm.bc.h>
  {
    int aCN;
    private MMActivity ezR;
    protected MMSlideDelView.f jpQ;
    protected MMSlideDelView.c jpR;
    protected MMSlideDelView.d jpT;
    private i nuC;
    protected MMSlideDelView.e nuM;
    
    public a(Context paramContext, i parami, int paramInt)
    {
      super(new com.tencent.mm.bc.h());
      GMTrace.i(6703101771776L, 49942);
      this.aCN = -1;
      this.jpT = MMSlideDelView.cah();
      this.ezR = ((MMActivity)paramContext);
      this.aCN = paramInt;
      this.nuC = parami;
      GMTrace.o(6703101771776L, 49942);
    }
    
    public final void QF()
    {
      GMTrace.i(6703772860416L, 49947);
      i locali;
      int i;
      String str;
      if (com.tencent.mm.bh.a.bIM())
      {
        locali = this.nuC;
        i = this.aCN;
        str = "SELECT sayhiencryptuser,max(createtime) createtime FROM " + locali.getTableName() + " where isSend = 0 GROUP BY sayhiencryptuser LIMIT " + i;
        str = "SELECT a.* FROM (" + str + ") b left join " + locali.getTableName() + " a on b.sayhiencryptuser=a.sayhiencryptuser and b.createtime=a.createtime where a.isSend = 0 ORDER BY a.createtime desc LIMIT " + i;
        setCursor(locali.fTZ.rawQuery(str, null));
      }
      for (;;)
      {
        super.notifyDataSetChanged();
        GMTrace.o(6703772860416L, 49947);
        return;
        locali = this.nuC;
        i = this.aCN;
        str = "SELECT * FROM " + locali.getTableName() + " where isSend = 0 ORDER BY createtime desc LIMIT " + i;
        setCursor(locali.fTZ.rawQuery(str, null));
      }
    }
    
    protected final void QG()
    {
      GMTrace.i(6703638642688L, 49946);
      QF();
      GMTrace.o(6703638642688L, 49946);
    }
    
    public final void a(MMSlideDelView.c paramc)
    {
      GMTrace.i(6703504424960L, 49945);
      this.jpR = paramc;
      GMTrace.o(6703504424960L, 49945);
    }
    
    public final void a(MMSlideDelView.e parame)
    {
      GMTrace.i(6703370207232L, 49944);
      this.nuM = parame;
      GMTrace.o(6703370207232L, 49944);
    }
    
    public final void a(MMSlideDelView.f paramf)
    {
      GMTrace.i(6703235989504L, 49943);
      this.jpQ = paramf;
      GMTrace.o(6703235989504L, 49943);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6703907078144L, 49948);
      com.tencent.mm.bc.h localh = (com.tencent.mm.bc.h)getItem(paramInt);
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = (MMSlideDelView)View.inflate(this.ezR, R.i.cpV, null);
        localObject = View.inflate(this.ezR, R.i.cEV, null);
        paramViewGroup.hqg = ((ImageView)((View)localObject).findViewById(R.h.brE));
        paramViewGroup.gDd = ((TextView)((View)localObject).findViewById(R.h.bux));
        paramViewGroup.mTK = ((TextView)((View)localObject).findViewById(R.h.bZu));
        paramViewGroup.jqa = paramView.findViewById(R.h.cfd);
        paramViewGroup.jqb = ((TextView)paramView.findViewById(R.h.cfe));
        paramView.setView((View)localObject);
        paramView.jpQ = this.jpQ;
        paramView.jpR = this.jpR;
        paramView.jpT = this.jpT;
        paramView.lmH = false;
        paramView.setTag(paramViewGroup);
        if (localh.field_flag == 0) {
          break label302;
        }
      }
      label302:
      for (Object localObject = au.d.Uk(localh.field_content).eCQ;; localObject = localh.field_talker)
      {
        paramViewGroup.gDd.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.ezR, (CharSequence)localObject, paramViewGroup.gDd.getTextSize()));
        paramViewGroup.mTK.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.ezR, localh.field_sayhicontent, paramViewGroup.mTK.getTextSize()));
        paramViewGroup.jqa.setTag(Long.valueOf(localh.field_svrid));
        paramViewGroup.jqa.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6702564900864L, 49938);
            w.v("MicroMsg.SayHiAdapter", "on delView clicked");
            NearbySayHiListUI.a.this.jpT.aJq();
            if (NearbySayHiListUI.a.this.nuM != null) {
              NearbySayHiListUI.a.this.nuM.aV(paramAnonymousView.getTag());
            }
            GMTrace.o(6702564900864L, 49938);
          }
        });
        a.b.a(paramViewGroup.hqg, localh.field_sayhiuser);
        GMTrace.o(6703907078144L, 49948);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
      }
    }
    
    final class a
    {
      TextView gDd;
      ImageView hqg;
      View jqa;
      TextView jqb;
      TextView mTK;
      
      a()
      {
        GMTrace.i(6692632788992L, 49864);
        GMTrace.o(6692632788992L, 49864);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\ui\NearbySayHiListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */