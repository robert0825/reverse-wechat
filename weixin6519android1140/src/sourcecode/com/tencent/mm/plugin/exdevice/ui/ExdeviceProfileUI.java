package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.lg;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.plugin.exdevice.f.a.g;
import com.tencent.mm.plugin.exdevice.f.a.i;
import com.tencent.mm.plugin.exdevice.f.a.k;
import com.tencent.mm.plugin.exdevice.model.ac;
import com.tencent.mm.plugin.exdevice.model.ac.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.c.bhn;
import com.tencent.mm.protocal.c.bvr;
import com.tencent.mm.protocal.c.iv;
import com.tencent.mm.protocal.c.uk;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.b;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import junit.framework.Assert;

public class ExdeviceProfileUI
  extends MMActivity
  implements com.tencent.mm.plugin.exdevice.f.b.e, c
{
  private static int kII;
  private boolean FS;
  private TextPaint fB;
  private int gbS;
  private String iAx;
  private String imd;
  private String kBN;
  private boolean kCa;
  private List<String> kCq;
  private List<String> kCr;
  private com.tencent.mm.ui.base.r kGg;
  private boolean kHS;
  private boolean kHT;
  private int kHU;
  private List<iv> kHX;
  private List<bhn> kIA;
  private ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> kIB;
  private List<uk> kIC;
  private int kID;
  private com.tencent.mm.plugin.exdevice.a.b<i> kIE;
  private p.d kIF;
  private com.tencent.mm.plugin.exdevice.a.b<com.tencent.mm.plugin.exdevice.f.a.h> kIG;
  private com.tencent.mm.plugin.exdevice.a.b<g> kIH;
  private Runnable kIJ;
  private com.tencent.mm.plugin.exdevice.a.b<g> kIK;
  private List<String> kIL;
  private com.tencent.mm.plugin.exdevice.a.b<k> kIM;
  private com.tencent.mm.sdk.b.c<lg> kIN;
  private String kIn;
  private com.tencent.mm.plugin.exdevice.f.b.a.a kIo;
  private ArrayList<String> kIp;
  private bvr kIq;
  private ExdeviceProfileAffectedUserView kIr;
  private ImageView kIs;
  private ListView kIt;
  private ExdeviceProfileListHeader kIu;
  private a kIv;
  private View kIw;
  private volatile boolean kIx;
  private String kIy;
  private String kIz;
  private String mAppName;
  private Context mContext;
  
  static
  {
    GMTrace.i(11027462750208L, 82161);
    kII = 0;
    GMTrace.o(11027462750208L, 82161);
  }
  
  public ExdeviceProfileUI()
  {
    GMTrace.i(11019946557440L, 82105);
    this.FS = false;
    this.kGg = null;
    this.kIE = new com.tencent.mm.plugin.exdevice.a.b() {};
    this.fB = new TextPaint(1);
    this.gbS = 0;
    this.kIF = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(16662594060288L, 124146);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(16662594060288L, 124146);
          return;
          com.tencent.mm.plugin.sport.b.d.nU(27);
          ExdeviceProfileUI.r(ExdeviceProfileUI.this);
          GMTrace.o(16662594060288L, 124146);
          return;
          com.tencent.mm.plugin.sport.b.d.nU(26);
          ExdeviceProfileUI.s(ExdeviceProfileUI.this);
          GMTrace.o(16662594060288L, 124146);
          return;
          ExdeviceProfileUI.t(ExdeviceProfileUI.this);
          GMTrace.o(16662594060288L, 124146);
          return;
          com.tencent.mm.ui.base.h.a(ExdeviceProfileUI.this.vKB.vKW, ExdeviceProfileUI.this.getString(R.l.dsb), null, true, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(16659372834816L, 124122);
              at.AR();
              paramAnonymous2DialogInterface = com.tencent.mm.y.c.yK().TE(ExdeviceProfileUI.u(ExdeviceProfileUI.this));
              com.tencent.mm.plugin.sport.b.d.nU(37);
              s.f(paramAnonymous2DialogInterface);
              ExdeviceProfileUI.v(ExdeviceProfileUI.this).bPu();
              if (ExdeviceProfileUI.d(ExdeviceProfileUI.this) != null) {
                ExdeviceProfileUI.d(ExdeviceProfileUI.this).show();
              }
              GMTrace.o(16659372834816L, 124122);
            }
          }, null);
          GMTrace.o(16662594060288L, 124146);
          return;
          ExdeviceProfileUI.b(ExdeviceProfileUI.this, true);
          com.tencent.mm.plugin.sport.b.d.nU(10);
          ad.atZ();
          com.tencent.mm.plugin.exdevice.f.b.c.b("", ExdeviceProfileUI.w(ExdeviceProfileUI.this), ExdeviceProfileUI.u(ExdeviceProfileUI.this), 3);
          GMTrace.o(16662594060288L, 124146);
          return;
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("rawUrl", ExdeviceProfileUI.o(ExdeviceProfileUI.this));
          com.tencent.mm.bj.d.b(ExdeviceProfileUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousMenuItem);
        }
      }
    };
    this.kIG = new com.tencent.mm.plugin.exdevice.a.b() {};
    this.kIH = new com.tencent.mm.plugin.exdevice.a.b() {};
    this.kIJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16659238617088L, 124121);
        BackwardSupportUtil.c.a(ExdeviceProfileUI.z(ExdeviceProfileUI.this));
        if (ExdeviceProfileUI.z(ExdeviceProfileUI.this).getCount() > 0) {
          BackwardSupportUtil.c.b(ExdeviceProfileUI.z(ExdeviceProfileUI.this), ExdeviceProfileUI.z(ExdeviceProfileUI.this).getCount() - 1);
        }
        GMTrace.o(16659238617088L, 124121);
      }
    };
    this.kIK = new com.tencent.mm.plugin.exdevice.a.b() {};
    this.kIM = new com.tencent.mm.plugin.exdevice.a.b() {};
    this.kIN = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(11019946557440L, 82105);
  }
  
  private void auI()
  {
    GMTrace.i(16657091133440L, 124105);
    this.kIB = ad.atT().auf();
    if (this.kIB != null) {
      w.d("MicroMsg.Sport.ExdeviceProfileUI", "ap: follow size:%s, %s", new Object[] { Integer.valueOf(this.kIB.size()), this.kIB.toString() });
    }
    while (!bg.cc(this.kIB))
    {
      this.kHU = this.kIB.size();
      GMTrace.o(16657091133440L, 124105);
      return;
      w.d("MicroMsg.Sport.ExdeviceProfileUI", "ap: follow is null");
    }
    this.kHU = 0;
    GMTrace.o(16657091133440L, 124105);
  }
  
  private void auJ()
  {
    GMTrace.i(11020349210624L, 82108);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16663936237568L, 124156);
        a locala = ExdeviceProfileUI.l(ExdeviceProfileUI.this);
        ArrayList localArrayList = ExdeviceProfileUI.p(ExdeviceProfileUI.this);
        List localList = ExdeviceProfileUI.q(ExdeviceProfileUI.this);
        locala.kHT = ad.atT().wN(locala.iAx);
        locala.kHW = localArrayList;
        if (!bg.cc(localArrayList)) {}
        for (locala.kHU = localArrayList.size();; locala.kHU = 0)
        {
          locala.kHX = localList;
          if (!bg.cc(localList)) {
            locala.kHV = localList.size();
          }
          w.d("MicroMsg.ExdeviceProfileAdapter", "setData,mIsFollower:%s ,mFollowersNum:%s  ,mButtonNum:%s ,mUsername:%s", new Object[] { Boolean.valueOf(locala.kHT), Integer.valueOf(locala.kHU), Integer.valueOf(locala.kHV), locala.iAx });
          ExdeviceProfileUI.l(ExdeviceProfileUI.this).notifyDataSetChanged();
          GMTrace.o(16663936237568L, 124156);
          return;
        }
      }
    });
    GMTrace.o(11020349210624L, 82108);
  }
  
  private void auK()
  {
    GMTrace.i(16657225351168L, 124106);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16659507052544L, 124123);
        ExdeviceProfileUI.g(ExdeviceProfileUI.this);
        ExdeviceProfileUI.l(ExdeviceProfileUI.this).notifyDataSetChanged();
        GMTrace.o(16659507052544L, 124123);
      }
    });
    GMTrace.o(16657225351168L, 124106);
  }
  
  private void auL()
  {
    GMTrace.i(11021020299264L, 82113);
    String str = q.zE();
    if (this.kIw != null) {
      this.kIw.setVisibility(8);
    }
    if ((!bg.nm(str)) && (str.equals(this.iAx)))
    {
      if ((this.kIo != null) && (bg.nm(this.kIo.field_championUrl)) && (this.kIw != null)) {
        this.kIw.setVisibility(0);
      }
      if (this.kIu != null)
      {
        this.kIu.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(16661654536192L, 124139);
            com.tencent.mm.plugin.sport.b.d.nU(18);
            com.tencent.mm.plugin.exdevice.f.a.e.c(ExdeviceProfileUI.this);
            GMTrace.o(16661654536192L, 124139);
          }
        });
        GMTrace.o(11021020299264L, 82113);
      }
    }
    else if ((this.kIo != null) && (!bg.nm(this.kIo.field_championUrl)) && (this.kIu != null))
    {
      this.kIu.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14873069092864L, 110813);
          ExdeviceProfileUI.B(ExdeviceProfileUI.this);
          GMTrace.o(14873069092864L, 110813);
        }
      });
    }
    GMTrace.o(11021020299264L, 82113);
  }
  
  private void auM()
  {
    GMTrace.i(11021154516992L, 82114);
    if (this.kIo != null)
    {
      if ((this.imd != this.kIo.field_championUrl) && ((this.imd == null) || (!this.imd.equals(this.kIo.field_championUrl))))
      {
        com.tencent.mm.plugin.exdevice.f.a.e.a(this, this.kIs, this.kIo.field_championUrl, R.e.aNq);
        this.imd = this.kIo.field_championUrl;
        GMTrace.o(11021154516992L, 82114);
      }
    }
    else
    {
      this.kIs.setImageResource(R.e.aNq);
      this.imd = null;
    }
    GMTrace.o(11021154516992L, 82114);
  }
  
  public final void auN()
  {
    GMTrace.i(11021691387904L, 82118);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14874277052416L, 110822);
        if (ExdeviceProfileUI.d(ExdeviceProfileUI.this) != null) {
          ExdeviceProfileUI.d(ExdeviceProfileUI.this).show();
        }
        GMTrace.o(14874277052416L, 110822);
      }
    });
    at.wS().a(new k(this.kIM), 0);
    GMTrace.o(11021691387904L, 82118);
  }
  
  public final void auO()
  {
    GMTrace.i(11021825605632L, 82119);
    com.tencent.mm.plugin.sport.b.d.nU(17);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.iAx);
    at.wS().a(new g(localArrayList, this.kIH), 0);
    GMTrace.o(11021825605632L, 82119);
  }
  
  public final void b(String paramString, com.tencent.mm.plugin.exdevice.f.b.d paramd)
  {
    GMTrace.i(11021557170176L, 82117);
    if (("HardDeviceChampionInfo".equals(paramString)) && (this.iAx.equals(paramd.username)))
    {
      w.d("MicroMsg.Sport.ExdeviceProfileUI", "hy: url may changed. maybe reload background");
      this.kIo = ad.atV().wP(this.iAx);
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14876961406976L, 110842);
          ExdeviceProfileUI.C(ExdeviceProfileUI.this);
          ExdeviceProfileUI.l(ExdeviceProfileUI.this).notifyDataSetChanged();
          ExdeviceProfileUI.D(ExdeviceProfileUI.this);
          GMTrace.o(14876961406976L, 110842);
        }
      });
    }
    GMTrace.o(11021557170176L, 82117);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11021422952448L, 82116);
    int i = R.i.cvT;
    GMTrace.o(11021422952448L, 82116);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11021288734720L, 82115);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (com.tencent.mm.plugin.exdevice.f.a.e.a(this, paramInt1, paramInt2, paramIntent, this.mAppName))
    {
      GMTrace.o(11021288734720L, 82115);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11021288734720L, 82115);
      return;
      if (paramInt2 == -1)
      {
        Toast.makeText(this, R.l.ecB, 1).show();
        GMTrace.o(11021288734720L, 82115);
        return;
        if (paramInt2 == -1)
        {
          if (paramIntent == null) {}
          String str2;
          for (String str1 = null;; str1 = paramIntent.getStringExtra("Select_Conv_User"))
          {
            str2 = ac.cj(this);
            if ((str1 != null) && (str1.length() != 0)) {
              break;
            }
            w.e("MicroMsg.Sport.ExdeviceProfileUI", "select conversation failed, toUser is null.");
            GMTrace.o(11021288734720L, 82115);
            return;
          }
          ac.b(this, str1, str2, paramIntent.getStringExtra("custom_send_text"), this.kIz);
          com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getResources().getString(R.l.cUy));
          GMTrace.o(11021288734720L, 82115);
          return;
          if (paramInt2 == -1)
          {
            paramIntent = bg.g(paramIntent.getStringExtra("Select_Contact").split(","));
            if (paramIntent == null)
            {
              GMTrace.o(11021288734720L, 82115);
              return;
            }
            if (this.kGg != null) {
              this.kGg.show();
            }
            at.wS().a(new g(paramIntent, this.kIK), 0);
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11020080775168L, 82106);
    super.onCreate(paramBundle);
    this.mContext = this.vKB.vKW;
    paramBundle = getIntent();
    auI();
    this.iAx = paramBundle.getStringExtra("username");
    this.kIn = paramBundle.getStringExtra("usernickname");
    paramBundle = q.zE();
    if (paramBundle != null) {
      this.kHS = paramBundle.equals(this.iAx);
    }
    this.mAppName = getIntent().getStringExtra("app_username");
    this.kHT = ad.atT().wN(this.iAx);
    w.d("MicroMsg.Sport.ExdeviceProfileUI", "is follow %s", new Object[] { Boolean.valueOf(this.kHT) });
    boolean bool;
    int m;
    Object localObject2;
    if (!bg.nm(this.iAx))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.kIo = ad.atV().wP(this.iAx);
      this.kIp = getIntent().getStringArrayListExtra("key_affected_semi");
      getString(R.l.cUG);
      this.kGg = com.tencent.mm.ui.base.h.a(this, getString(R.l.bKJ), new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(16659641270272L, 124124);
          if (ExdeviceProfileUI.d(ExdeviceProfileUI.this) != null)
          {
            ExdeviceProfileUI.d(ExdeviceProfileUI.this).dismiss();
            ExdeviceProfileUI.y(ExdeviceProfileUI.this);
          }
          ExdeviceProfileUI.this.finish();
          GMTrace.o(16659641270272L, 124124);
        }
      });
      this.kIr = ((ExdeviceProfileAffectedUserView)findViewById(R.h.bxk));
      this.kIs = ((ImageView)findViewById(R.h.bxn));
      this.kIt = ((ListView)findViewById(R.h.bxI));
      paramBundle = (MMPullDownView)findViewById(R.h.bUC);
      this.kIr.y(this.kIp);
      auM();
      this.kIw = findViewById(R.h.cco);
      paramBundle.lE(false);
      paramBundle.lG(false);
      paramBundle.lF(false);
      paramBundle.lE(false);
      paramBundle.lD(false);
      paramBundle.wei = true;
      paramBundle.wdZ = new MMPullDownView.c()
      {
        public final boolean aoZ()
        {
          GMTrace.i(16659909705728L, 124126);
          View localView = ExdeviceProfileUI.z(ExdeviceProfileUI.this).getChildAt(ExdeviceProfileUI.z(ExdeviceProfileUI.this).getChildCount() - 1);
          int i = ExdeviceProfileUI.z(ExdeviceProfileUI.this).getAdapter().getCount();
          if ((i > 0) && (localView != null) && (localView.getBottom() <= ExdeviceProfileUI.z(ExdeviceProfileUI.this).getHeight()) && (ExdeviceProfileUI.z(ExdeviceProfileUI.this).getLastVisiblePosition() >= i - 1))
          {
            GMTrace.o(16659909705728L, 124126);
            return true;
          }
          GMTrace.o(16659909705728L, 124126);
          return false;
        }
      };
      paramBundle.wea = new MMPullDownView.d()
      {
        public final boolean aoY()
        {
          GMTrace.i(16656956915712L, 124104);
          if (ExdeviceProfileUI.z(ExdeviceProfileUI.this).getFirstVisiblePosition() == 0)
          {
            View localView = ExdeviceProfileUI.z(ExdeviceProfileUI.this).getChildAt(ExdeviceProfileUI.z(ExdeviceProfileUI.this).getFirstVisiblePosition());
            if ((localView != null) && (localView.getTop() >= 0))
            {
              GMTrace.o(16656956915712L, 124104);
              return true;
            }
          }
          GMTrace.o(16656956915712L, 124104);
          return false;
        }
      };
      paramBundle.wdO = new MMPullDownView.e()
      {
        public final boolean aoX()
        {
          GMTrace.i(16661117665280L, 124135);
          GMTrace.o(16661117665280L, 124135);
          return true;
        }
      };
      paramBundle.wet = new MMPullDownView.b()
      {
        public final void auP()
        {
          GMTrace.i(16662057189376L, 124142);
          ExdeviceProfileUI.A(ExdeviceProfileUI.this);
          GMTrace.o(16662057189376L, 124142);
        }
      };
      localObject1 = new ExdeviceProfileListHeader(this);
      m = com.tencent.mm.plugin.exdevice.j.b.w(this, getResources().getDimensionPixelSize(R.f.aPV));
      localObject2 = getResources().getDisplayMetrics();
      if (((DisplayMetrics)localObject2).widthPixels <= ((DisplayMetrics)localObject2).heightPixels) {
        break label889;
      }
    }
    label889:
    for (int i = getResources().getDimensionPixelSize(R.f.aPM);; i = getResources().getDimensionPixelSize(R.f.aPN))
    {
      j = getResources().getDimensionPixelSize(R.f.aPX);
      int k = getResources().getDimensionPixelSize(R.f.aPW);
      localObject2 = getWindowManager().getDefaultDisplay();
      k = ((Display)localObject2).getHeight() / 2 - m - i - j / 2 - k;
      if (((Display)localObject2).getHeight() > 0)
      {
        j = k;
        if (k > 0) {}
      }
      else
      {
        j = getResources().getDimensionPixelSize(R.f.aPU);
      }
      ((ExdeviceProfileListHeader)localObject1).setMinimumHeight(j);
      ((ExdeviceProfileListHeader)localObject1).setMinimumWidth(((Display)localObject2).getWidth());
      ((ExdeviceProfileListHeader)localObject1).setTag(Integer.valueOf(((Display)localObject2).getHeight() / 2 - m - i));
      this.kIu = ((ExdeviceProfileListHeader)localObject1);
      this.kIt.addHeaderView(this.kIu, null, false);
      this.kIv = new a(this.vKB.vKW, this.mAppName, this.kHS, this.iAx);
      this.kIv.kHR = this;
      this.kIt.setAdapter(this.kIv);
      this.kIt.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(16662862495744L, 124148);
          ExdeviceProfileUI.A(ExdeviceProfileUI.this);
          GMTrace.o(16662862495744L, 124148);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(16662728278016L, 124147);
          GMTrace.o(16662728278016L, 124147);
        }
      });
      this.kIr.iAx = this.iAx;
      this.kIw.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16660312358912L, 124129);
          com.tencent.mm.plugin.exdevice.f.a.e.c(ExdeviceProfileUI.this);
          GMTrace.o(16660312358912L, 124129);
        }
      });
      paramBundle.wei = false;
      paramBundle = new RelativeLayout.LayoutParams(com.tencent.mm.br.a.ef(this), ((Integer)this.kIu.getTag()).intValue());
      this.kIs.setLayoutParams(paramBundle);
      auL();
      ad.aua().a(this);
      at.wS().a(new i(this.iAx, bg.nl(this.mAppName), this.kIE), 0);
      try
      {
        this.gbS = getResources().getDimensionPixelSize(R.f.aQb);
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Sport.ExdeviceProfileUI", paramBundle, "", new Object[0]);
          if (this.gbS <= 0) {
            this.gbS = 60;
          }
        }
      }
      finally
      {
        if (this.gbS > 0) {
          break label948;
        }
        this.gbS = 60;
      }
      w.d("MicroMsg.Sport.ExdeviceProfileUI", "ap: ellipsizeWidth: %s", new Object[] { Integer.valueOf(this.gbS) });
      if (!this.kHS) {
        break label950;
      }
      paramBundle = getString(R.l.drM);
      N(paramBundle);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11056051126272L, 82374);
          ExdeviceProfileUI.this.finish();
          GMTrace.o(11056051126272L, 82374);
          return false;
        }
      });
      w.i("MicroMsg.Sport.ExdeviceProfileUI", "mUsername:" + this.iAx);
      if (q.zE().equals(this.iAx))
      {
        paramBundle = new qh();
        paramBundle.eUX.action = 3;
        com.tencent.mm.sdk.b.a.vgX.a(paramBundle, Looper.getMainLooper());
      }
      GMTrace.o(11020080775168L, 82106);
      return;
      bool = false;
      break;
    }
    label948:
    label950:
    i = R.l.drQ;
    paramBundle = this.iAx;
    int j = this.gbS;
    Object localObject1 = com.tencent.mm.y.r.fs(paramBundle);
    if ((paramBundle.equalsIgnoreCase((String)localObject1)) && (!bg.nm(this.kIn))) {}
    for (paramBundle = com.tencent.mm.pluginsdk.ui.d.h.a(this.vKB.vKW, this.kIn);; paramBundle = com.tencent.mm.pluginsdk.ui.d.h.a(this.vKB.vKW, (CharSequence)localObject1))
    {
      localObject1 = TextUtils.ellipsize(paramBundle, this.fB, j, TextUtils.TruncateAt.END);
      w.d("MicroMsg.Sport.ExdeviceProfileUI", " width: %d, ap: username %s, ellipseize username %s", new Object[] { Integer.valueOf(j), paramBundle, localObject1 });
      paramBundle = com.tencent.mm.pluginsdk.ui.d.h.a(this, getString(i, new Object[] { localObject1 }));
      break;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11020886081536L, 82112);
    this.kIN.dead();
    this.FS = true;
    super.onDestroy();
    ad.aua().b(this);
    GMTrace.o(11020886081536L, 82112);
  }
  
  public void onPause()
  {
    GMTrace.i(11020483428352L, 82109);
    super.onPause();
    GMTrace.o(11020483428352L, 82109);
  }
  
  public void onResume()
  {
    GMTrace.i(11020617646080L, 82110);
    super.onResume();
    w.v("MicroMsg.Sport.ExdeviceProfileUI", "ExdeviceProfileUI: onResume");
    auI();
    auJ();
    if (!this.kHS)
    {
      ad.atT().wN(this.iAx);
      auK();
    }
    GMTrace.o(11020617646080L, 82110);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */