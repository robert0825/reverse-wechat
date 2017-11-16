package com.tencent.mm.plugin.offline.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.bv;
import com.tencent.mm.g.a.cg;
import com.tencent.mm.g.a.ko;
import com.tencent.mm.g.a.lb;
import com.tencent.mm.g.a.pa;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.g.a.sm.b;
import com.tencent.mm.g.a.sp;
import com.tencent.mm.g.a.ss;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.offline.a.m;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.plugin.offline.a.r.a;
import com.tencent.mm.plugin.offline.a.r.b;
import com.tencent.mm.plugin.offline.a.r.c;
import com.tencent.mm.plugin.offline.a.r.d;
import com.tencent.mm.plugin.offline.a.r.e;
import com.tencent.mm.plugin.offline.a.r.f;
import com.tencent.mm.plugin.offline.a.r.g;
import com.tencent.mm.plugin.offline.i;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a.a;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.au.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WalletOfflineCoinPurseUI
  extends WalletBaseUI
  implements j.a, r.a, com.tencent.mm.plugin.offline.b, a, au.a
{
  private static int iJv;
  private int gGg;
  private View.OnClickListener hwh;
  private boolean jER;
  private int kSi;
  private boolean kmw;
  private long mLastTime;
  private int mState;
  private m nAa;
  private int nAc;
  private aj nAd;
  private HashMap<String, View> nBR;
  private HashMap<String, Integer> nBS;
  Bitmap nBT;
  Bitmap nBU;
  private a nBV;
  private ArrayList<String> nBW;
  private ArrayList<String> nBX;
  private ArrayList<Boolean> nBY;
  View nBZ;
  private com.tencent.mm.sdk.b.c<lb> nCA;
  private com.tencent.mm.sdk.b.c<ko> nCB;
  private com.tencent.mm.sdk.b.c nCC;
  private com.tencent.mm.sdk.b.c nCD;
  private com.tencent.mm.sdk.b.c nCE;
  public boolean nCF;
  private aj nCG;
  private aj nCH;
  private ImageView nCa;
  private ImageView nCb;
  private TextView nCc;
  private String nCd;
  private View nCe;
  private TextView nCf;
  private ImageView nCg;
  RelativeLayout nCh;
  private LinearLayout nCi;
  private LinearLayout nCj;
  private LinearLayout nCk;
  private LinearLayout nCl;
  private LinearLayout nCm;
  private Dialog nCn;
  private String nCo;
  private boolean nCp;
  private com.tencent.mm.plugin.offline.g nCq;
  private boolean nCr;
  private ArrayList<Bitmap> nCs;
  private ArrayList<Bitmap> nCt;
  private com.tencent.mm.wallet_core.ui.c nCu;
  private c nCv;
  OfflineAlertView nCw;
  private boolean nCx;
  com.tencent.mm.sdk.b.c<ss> nCy;
  private com.tencent.mm.sdk.b.c<cg> nCz;
  private String nzY;
  private String nzv;
  
  static
  {
    GMTrace.i(6225555095552L, 46384);
    iJv = 0;
    GMTrace.o(6225555095552L, 46384);
  }
  
  public WalletOfflineCoinPurseUI()
  {
    GMTrace.i(6215622983680L, 46310);
    this.mLastTime = 0L;
    this.mState = 3;
    this.nBR = new HashMap();
    this.nBS = new HashMap();
    this.gGg = -1;
    this.nBT = null;
    this.nBU = null;
    this.nBW = new ArrayList();
    this.nBX = new ArrayList();
    this.nBY = new ArrayList();
    this.nzv = "";
    this.nCo = "";
    this.nzY = "";
    this.jER = true;
    this.nCp = false;
    this.nCr = false;
    this.nCs = new ArrayList();
    this.nCt = new ArrayList();
    this.nCx = false;
    this.nCy = new com.tencent.mm.sdk.b.c() {};
    this.nCz = new com.tencent.mm.sdk.b.c() {};
    this.nCA = new com.tencent.mm.sdk.b.c() {};
    this.nCB = new com.tencent.mm.sdk.b.c() {};
    this.nCC = new com.tencent.mm.sdk.b.c() {};
    this.nCD = new com.tencent.mm.sdk.b.c() {};
    this.nCE = new com.tencent.mm.sdk.b.c() {};
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20867903913984L, 155478);
        long l;
        if ((paramAnonymousView.getId() == a.f.sKJ) || (paramAnonymousView.getId() == a.f.sIP) || (paramAnonymousView.getId() == a.f.sIQ))
        {
          if ((paramAnonymousView.getId() == a.f.sKJ) && (WalletOfflineCoinPurseUI.u(WalletOfflineCoinPurseUI.this) != null) && (WalletOfflineCoinPurseUI.u(WalletOfflineCoinPurseUI.this).isShowing()))
          {
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "offlineAlertView is showing");
            GMTrace.o(20867903913984L, 155478);
            return;
          }
          l = System.currentTimeMillis();
          if (((WalletOfflineCoinPurseUI.u(WalletOfflineCoinPurseUI.this) == null) || (!WalletOfflineCoinPurseUI.u(WalletOfflineCoinPurseUI.this).isShowing())) && (l - WalletOfflineCoinPurseUI.v(WalletOfflineCoinPurseUI.this) >= 400L) && (com.tencent.mm.plugin.offline.c.a.aVS()) && (!WalletOfflineCoinPurseUI.w(WalletOfflineCoinPurseUI.this)))
          {
            if (paramAnonymousView.getId() != a.f.sKJ) {
              break label218;
            }
            WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, false);
          }
        }
        for (;;)
        {
          if (WalletOfflineCoinPurseUI.x(WalletOfflineCoinPurseUI.this) != null)
          {
            WalletOfflineCoinPurseUI.y(WalletOfflineCoinPurseUI.this);
            WalletOfflineCoinPurseUI.x(WalletOfflineCoinPurseUI.this).v(paramAnonymousView, WalletOfflineCoinPurseUI.z(WalletOfflineCoinPurseUI.this));
          }
          WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, l);
          GMTrace.o(20867903913984L, 155478);
          return;
          label218:
          if ((paramAnonymousView.getId() == a.f.sIP) || (paramAnonymousView.getId() == a.f.sIQ))
          {
            com.tencent.mm.plugin.report.service.g.ork.i(13958, new Object[] { Integer.valueOf(4) });
            WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, true);
          }
        }
      }
    };
    this.nCF = false;
    this.nAc = 60000;
    this.nAd = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(19258767572992L, 143489);
        if (!WalletOfflineCoinPurseUI.I(WalletOfflineCoinPurseUI.this))
        {
          WalletOfflineCoinPurseUI.E(WalletOfflineCoinPurseUI.this);
          WalletOfflineCoinPurseUI.F(WalletOfflineCoinPurseUI.this);
        }
        aj localaj = WalletOfflineCoinPurseUI.K(WalletOfflineCoinPurseUI.this);
        long l = WalletOfflineCoinPurseUI.J(WalletOfflineCoinPurseUI.this);
        localaj.z(l, l);
        GMTrace.o(19258767572992L, 143489);
        return false;
      }
    }, false);
    this.nCG = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(19256083218432L, 143469);
        WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this);
        if ((WalletOfflineCoinPurseUI.o(WalletOfflineCoinPurseUI.this) != null) && (WalletOfflineCoinPurseUI.o(WalletOfflineCoinPurseUI.this).isShowing())) {
          WalletOfflineCoinPurseUI.o(WalletOfflineCoinPurseUI.this).dismiss();
        }
        com.tencent.mm.plugin.offline.g.aVf();
        WalletOfflineCoinPurseUI.L(WalletOfflineCoinPurseUI.this);
        if (com.tencent.mm.plugin.offline.c.a.aWu()) {
          WalletOfflineCoinPurseUI.this.aVw();
        }
        GMTrace.o(19256083218432L, 143469);
        return false;
      }
    }, false);
    this.nCH = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(20868172349440L, 155480);
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "onTimerExpired, send ConsumedCardByOfflinePay event: %s", new Object[] { Boolean.valueOf(WalletOfflineCoinPurseUI.M(WalletOfflineCoinPurseUI.this)) });
        if (WalletOfflineCoinPurseUI.M(WalletOfflineCoinPurseUI.this))
        {
          bv localbv = new bv();
          localbv.eDc.aGY = 0;
          com.tencent.mm.sdk.b.a.vgX.m(localbv);
        }
        WalletOfflineCoinPurseUI.this.finish();
        GMTrace.o(20868172349440L, 155480);
        return false;
      }
    }, false);
    GMTrace.o(6215622983680L, 46310);
  }
  
  private void aVB()
  {
    GMTrace.i(6215891419136L, 46312);
    aVM();
    aVO();
    aVN();
    aVK();
    GMTrace.o(6215891419136L, 46312);
  }
  
  private void aVC()
  {
    GMTrace.i(6216159854592L, 46314);
    com.tencent.mm.wallet_core.ui.e.EQ(32);
    com.tencent.mm.pluginsdk.wallet.g.R(this, this.kSi);
    GMTrace.o(6216159854592L, 46314);
  }
  
  private void aVD()
  {
    GMTrace.i(6217233596416L, 46322);
    if ((!this.nCF) && (!com.tencent.mm.sdk.platformtools.am.isNetworkConnected(getBaseContext())))
    {
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.aVk();
      if (com.tencent.mm.plugin.offline.e.aVb() == 0)
      {
        this.nCF = true;
        w.e("MicroMsg.OfflineErrorHelper", "offline code size is 0, show check network error dialog");
        com.tencent.mm.ui.base.h.a(this, getString(a.i.thk), null, false, new b.4(this));
        w.e("MicroMsg.WalletOfflineCoinPurseUI", "network disconnect and code count == 0");
      }
    }
    GMTrace.o(6217233596416L, 46322);
  }
  
  private void aVE()
  {
    GMTrace.i(6217367814144L, 46323);
    int i = com.tencent.mm.plugin.offline.c.a.aVX();
    Bankcard localBankcard = com.tencent.mm.plugin.offline.c.a.aVV();
    if (c.aVy())
    {
      this.mState = 7;
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FREEZE");
      GMTrace.o(6217367814144L, 46323);
      return;
    }
    if (!com.tencent.mm.sdk.platformtools.am.isNetworkConnected(getBaseContext()))
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_DISCONNECT_NETWORK");
      this.mState = 6;
      GMTrace.o(6217367814144L, 46323);
      return;
    }
    if (com.tencent.mm.plugin.offline.c.a.aVS())
    {
      if (i == 0)
      {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is create bindCount == 0");
        this.mState = 1;
        GMTrace.o(6217367814144L, 46323);
        return;
      }
      if ((i != 0) && (localBankcard == null))
      {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is create bindCount != 0 && bankcard == null");
        this.mState = 2;
        GMTrace.o(6217367814144L, 46323);
        return;
      }
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FEE_CAN_USE");
      this.mState = 5;
      GMTrace.o(6217367814144L, 46323);
      return;
    }
    if (i == 0)
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is not create bindCount == 0");
      this.mState = 1;
      GMTrace.o(6217367814144L, 46323);
      return;
    }
    if ((i != 0) && (localBankcard == null))
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is not create bindCount != 0 && bankcard == null");
      this.mState = 2;
      GMTrace.o(6217367814144L, 46323);
      return;
    }
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FEE_CAN_USE");
    this.mState = 5;
    GMTrace.o(6217367814144L, 46323);
  }
  
  private boolean aVF()
  {
    GMTrace.i(6217770467328L, 46326);
    if ((this.mState == 2) || (this.mState == 1) || (this.mState == 7))
    {
      GMTrace.o(6217770467328L, 46326);
      return true;
    }
    GMTrace.o(6217770467328L, 46326);
    return false;
  }
  
  private void aVG()
  {
    GMTrace.i(6217904685056L, 46327);
    if (this.nCu != null)
    {
      this.nCu.ft(this.nCo, this.nzY);
      this.nCu.nBT = this.nBT;
      this.nCu.nBU = this.nBU;
      this.nCu.cmi();
    }
    GMTrace.o(6217904685056L, 46327);
  }
  
  private void aVH()
  {
    GMTrace.i(15379069927424L, 114583);
    if ((this.nCn != null) && (this.nCn.isShowing())) {
      this.nCn.dismiss();
    }
    GMTrace.o(15379069927424L, 114583);
  }
  
  private void aVI()
  {
    GMTrace.i(6218441555968L, 46331);
    b(new com.tencent.mm.plugin.offline.a.n(System.currentTimeMillis(), com.tencent.mm.plugin.offline.c.a.nDk), false);
    GMTrace.o(6218441555968L, 46331);
  }
  
  private void aVK()
  {
    GMTrace.i(6218978426880L, 46335);
    if (this.nCr)
    {
      GMTrace.o(6218978426880L, 46335);
      return;
    }
    if (!this.nCw.sg(4))
    {
      GMTrace.o(6218978426880L, 46335);
      return;
    }
    com.tencent.mm.kernel.h.xz();
    if ((!((Boolean)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvj, Boolean.valueOf(false))).booleanValue()) && (!this.nCw.isShowing())) {
      aVL();
    }
    GMTrace.o(6218978426880L, 46335);
  }
  
  private void aVL()
  {
    GMTrace.i(6219112644608L, 46336);
    if (!this.nCw.sg(4))
    {
      GMTrace.o(6219112644608L, 46336);
      return;
    }
    OfflineAlertView localOfflineAlertView = this.nCw;
    View localView1 = this.nBZ;
    localOfflineAlertView.setVisibility(0);
    localOfflineAlertView.nBA.removeAllViews();
    View localView2 = LayoutInflater.from(localOfflineAlertView.getContext()).inflate(a.g.sPI, null);
    localOfflineAlertView.nBA.addView(localView2);
    com.tencent.mm.plugin.report.service.g.ork.i(13750, new Object[] { Integer.valueOf(1) });
    localView1.post(new OfflineAlertView.2(localOfflineAlertView, localView1, 4));
    GMTrace.o(6219112644608L, 46336);
  }
  
  private void aVM()
  {
    GMTrace.i(6219246862336L, 46337);
    if (!this.nCw.sg(1))
    {
      GMTrace.o(6219246862336L, 46337);
      return;
    }
    if (this.nCw.nBz == 1) {
      this.nCw.dismiss();
    }
    boolean bool1 = com.tencent.mm.plugin.wallet_core.model.n.byx().byP();
    boolean bool2 = com.tencent.mm.plugin.wallet_core.model.n.byx().byT();
    if ((bool1) || (bool2))
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "unreg: %B, simplereg: %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      this.nCw.a(this.nBZ, new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17963969150976L, 133842);
          com.tencent.mm.plugin.offline.c.a.aWd();
          com.tencent.mm.plugin.offline.k.aVi();
          com.tencent.mm.plugin.offline.k.ai(196648, "0");
          WalletOfflineCoinPurseUI.G(WalletOfflineCoinPurseUI.this);
          GMTrace.o(17963969150976L, 133842);
        }
      }, 1);
    }
    GMTrace.o(6219246862336L, 46337);
  }
  
  private void aVN()
  {
    GMTrace.i(6219381080064L, 46338);
    if (!this.nCw.sg(3))
    {
      GMTrace.o(6219381080064L, 46338);
      return;
    }
    if (this.nCw.nBz == 3) {
      this.nCw.dismiss();
    }
    com.tencent.mm.plugin.offline.k.aVi();
    String str1 = com.tencent.mm.plugin.offline.k.sf(196617);
    com.tencent.mm.wallet_core.c.a.clF();
    boolean bool1 = com.tencent.mm.wallet_core.c.a.isCertExist(str1);
    boolean bool2 = com.tencent.mm.plugin.offline.c.a.aVS();
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "show unopened alert, %B, %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    if ((!bool1) || (!bool2)) {
      if (!bool1)
      {
        com.tencent.mm.kernel.h.xz();
        String str2 = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vpH, "");
        if ((str2 == null) || (!str2.equals(com.tencent.mm.compatible.d.p.sZ()))) {
          break label221;
        }
        w.i("MicroMsg.WalletOfflineCoinPurseUI", " WalletOfflineEntranceUI iemi is same between create and getToken");
      }
    }
    for (;;)
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineEntranceUI CertUtil.getInstance().isCertExist(cn) is false ,cn == " + str1 + " ,recreate offline");
      com.tencent.mm.plugin.offline.c.a.aWd();
      this.nCw.a(this.nBZ, new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19259170226176L, 143492);
          com.tencent.mm.plugin.offline.c.a.f(WalletOfflineCoinPurseUI.this, WalletOfflineCoinPurseUI.b(WalletOfflineCoinPurseUI.this));
          WalletOfflineCoinPurseUI.this.finish();
          GMTrace.o(19259170226176L, 143492);
        }
      }, 3);
      GMTrace.o(6219381080064L, 46338);
      return;
      label221:
      w.i("MicroMsg.WalletOfflineCoinPurseUI", " WalletOfflineEntranceUI iemi is diff between create and getToken");
    }
  }
  
  private boolean aVO()
  {
    GMTrace.i(6219515297792L, 46339);
    if (!this.nCw.sg(2))
    {
      GMTrace.o(6219515297792L, 46339);
      return false;
    }
    if (this.nCw.nBz == 2) {
      this.nCw.dismiss();
    }
    Object localObject1 = com.tencent.mm.plugin.offline.c.a.aVY();
    if (((List)localObject1).size() <= 0)
    {
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "getBindBankCardList == null or size < 1");
      GMTrace.o(6219515297792L, 46339);
      return false;
    }
    int i = 0;
    while (i < ((List)localObject1).size())
    {
      localObject2 = (Bankcard)((List)localObject1).get(i);
      if ((localObject2 != null) && (((Bankcard)localObject2).field_support_micropay) && (bg.nm(((Bankcard)localObject2).field_forbidWord)))
      {
        GMTrace.o(6219515297792L, 46339);
        return true;
      }
      i += 1;
    }
    this.nCw.dismiss();
    localObject1 = this.nCw;
    Object localObject2 = this.nBZ;
    Runnable local24 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19257559613440L, 143480);
        c localc = WalletOfflineCoinPurseUI.A(WalletOfflineCoinPurseUI.this);
        com.tencent.mm.plugin.offline.c.a.e(localc.mActivity, localc.nBL);
        GMTrace.o(19257559613440L, 143480);
      }
    };
    Runnable local25 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20868977655808L, 155486);
        WalletOfflineCoinPurseUI.t(WalletOfflineCoinPurseUI.this);
        GMTrace.o(20868977655808L, 155486);
      }
    };
    ((OfflineAlertView)localObject1).setVisibility(0);
    ((OfflineAlertView)localObject1).nBA.removeAllViews();
    View localView = LayoutInflater.from(((OfflineAlertView)localObject1).getContext()).inflate(a.g.sPK, null);
    ((OfflineAlertView)localObject1).nBA.addView(localView);
    ((View)localObject2).post(new OfflineAlertView.1((OfflineAlertView)localObject1, (View)localObject2, local24, local25, 2));
    GMTrace.o(6219515297792L, 46339);
    return false;
  }
  
  private void aVP()
  {
    GMTrace.i(6219649515520L, 46340);
    Object localObject3 = com.tencent.mm.plugin.offline.c.a.gy(false);
    if (((List)localObject3).size() <= 0)
    {
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "getBindBankCardList == null or size < 1");
      this.nCf.setVisibility(8);
      GMTrace.o(6219649515520L, 46340);
      return;
    }
    final ArrayList localArrayList = new ArrayList();
    int j = -1;
    int i = 0;
    int k = -1;
    final Object localObject1 = null;
    Object localObject2 = null;
    if (i < ((List)localObject3).size())
    {
      if (((Bankcard)((List)localObject3).get(i)).byd())
      {
        localObject2 = (Bankcard)((List)localObject3).get(i);
        k = i;
      }
      if (!((Bankcard)((List)localObject3).get(i)).bye()) {
        break label623;
      }
      localObject1 = (Bankcard)((List)localObject3).get(i);
      j = i;
    }
    label623:
    for (;;)
    {
      i += 1;
      break;
      if (localObject2 != null) {
        localArrayList.add(localObject2);
      }
      if (localObject1 != null) {
        localArrayList.add(localObject1);
      }
      i = 0;
      while (i < ((List)localObject3).size())
      {
        if ((i != j) && (i != k)) {
          localArrayList.add(((List)localObject3).get(i));
        }
        i += 1;
      }
      com.tencent.mm.plugin.offline.c.a.Ek(com.tencent.mm.plugin.offline.c.a.aWi());
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "showChangeBankcardDialog() bankcard size is " + localArrayList.size());
      localObject2 = com.tencent.mm.plugin.wallet_core.model.n.byx().bzd();
      if ((localObject2 != null) && (((List)localObject2).size() > 0))
      {
        localObject1 = new LinkedList();
        localObject3 = localArrayList.iterator();
        while (((Iterator)localObject3).hasNext()) {
          ((List)localObject1).add((Bankcard)((Iterator)localObject3).next());
        }
        localArrayList.clear();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = f((List)localObject1, ((com.tencent.mm.plugin.wallet_core.model.c)((Iterator)localObject2).next()).nDu);
          if (localObject3 != null) {
            localArrayList.add(localObject3);
          }
        }
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext()) {
          localArrayList.add((Bankcard)((Iterator)localObject1).next());
        }
      }
      localObject1 = new com.tencent.mm.ui.widget.f(this, com.tencent.mm.ui.widget.f.xpR, true);
      i = 0;
      for (j = 0; i < localArrayList.size(); j = k)
      {
        localObject2 = (Bankcard)localArrayList.get(i);
        k = j;
        if (!bg.nm(((Bankcard)localObject2).field_bindSerial))
        {
          k = j;
          if (this.nzv.equals(((Bankcard)localObject2).field_bindSerial)) {
            k = i;
          }
        }
        i += 1;
      }
      ((com.tencent.mm.ui.widget.f)localObject1).qik = new p.c()
      {
        public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
        {
          GMTrace.i(20869782962176L, 155492);
          int i = 0;
          Object localObject2;
          Object localObject1;
          Bitmap localBitmap;
          label157:
          Object localObject3;
          if (i < localArrayList.size())
          {
            localObject4 = (Bankcard)localArrayList.get(i);
            localObject2 = com.tencent.mm.plugin.offline.c.a.Eo(((Bankcard)localObject4).field_bankcardType);
            localObject1 = localObject2;
            if (((Bankcard)localObject4).bye())
            {
              localObject1 = localObject2;
              if (((Bankcard)localObject4).reS != null) {
                localObject1 = ((Bankcard)localObject4).reS.nvc;
              }
            }
            localBitmap = com.tencent.mm.platformtools.j.a(new com.tencent.mm.plugin.wallet_core.ui.view.c((String)localObject1));
            localObject2 = "";
            if (!bg.nm(((Bankcard)localObject4).field_forbidWord)) {
              localObject2 = ((Bankcard)localObject4).field_forbidWord;
            }
            localObject1 = localObject2;
            if (bg.nm((String)localObject2))
            {
              localObject1 = localObject2;
              if (!((Bankcard)localObject4).field_support_micropay)
              {
                if (!bg.nm(((Bankcard)localObject4).field_no_micro_word)) {
                  break label369;
                }
                localObject1 = "";
              }
            }
            if (bg.nm(((Bankcard)localObject4).field_forbid_title))
            {
              localObject3 = new SpannableString((CharSequence)localObject1);
              localObject2 = localObject1;
              localObject1 = localObject3;
              label187:
              if (((!((Bankcard)localObject4).byd()) && (!((Bankcard)localObject4).bye())) || (((Bankcard)localObject4).reK < 0.0D)) {
                break label516;
              }
              localObject3 = ((Bankcard)localObject4).field_desc + WalletOfflineCoinPurseUI.this.getString(a.i.sZr, new Object[] { com.tencent.mm.wallet_core.ui.e.s(((Bankcard)localObject4).reK) });
              label261:
              if (localBitmap == null) {
                break label555;
              }
            }
          }
          label337:
          label369:
          label516:
          label540:
          label555:
          for (final Object localObject4 = com.tencent.mm.sdk.platformtools.d.a(localBitmap, WalletOfflineCoinPurseUI.this.getResources().getDimensionPixelOffset(a.d.snJ), WalletOfflineCoinPurseUI.this.getResources().getDimensionPixelOffset(a.d.snJ), true, false);; localObject4 = null)
          {
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "i %d fee %s %s", new Object[] { Integer.valueOf(i), localObject3, localObject1 });
            if (localObject4 == null)
            {
              localObject4 = null;
              if (!bg.nm((String)localObject2)) {
                break label540;
              }
            }
            for (boolean bool = false;; bool = true)
            {
              paramAnonymousn.a(i, (CharSequence)localObject3, (CharSequence)localObject1, (Drawable)localObject4, bool);
              i += 1;
              break;
              localObject1 = ((Bankcard)localObject4).field_no_micro_word;
              break label157;
              localObject2 = (String)localObject1 + " ";
              localObject1 = new SpannableString((String)localObject2 + ((Bankcard)localObject4).field_forbid_title);
              localObject3 = new com.tencent.mm.plugin.wallet_core.ui.f(WalletOfflineCoinPurseUI.this)
              {
                public final void onClick(View paramAnonymous2View)
                {
                  GMTrace.i(16587432132608L, 123586);
                  paramAnonymous2View = new Intent();
                  String str = localObject4.field_forbid_url;
                  w.i("MicroMsg.WalletOfflineCoinPurseUI", "go to url %s", new Object[] { str });
                  paramAnonymous2View.putExtra("rawUrl", str);
                  paramAnonymous2View.putExtra("geta8key_username", com.tencent.mm.y.q.zE());
                  paramAnonymous2View.putExtra("pay_channel", 1);
                  com.tencent.mm.bj.d.b(WalletOfflineCoinPurseUI.this.vKB.vKW, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymous2View);
                  GMTrace.o(16587432132608L, 123586);
                }
              };
              int j = ((String)localObject2).length();
              int k = ((String)localObject2).length() + ((Bankcard)localObject4).field_forbid_title.length();
              ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(WalletOfflineCoinPurseUI.this.getResources().getColor(a.c.smW)), j, k, 33);
              ((SpannableString)localObject1).setSpan(localObject3, j, k, 33);
              break label187;
              localObject3 = ((Bankcard)localObject4).field_desc;
              break label261;
              localObject4 = new BitmapDrawable((Bitmap)localObject4);
              break label337;
            }
            GMTrace.o(20869782962176L, 155492);
            return;
          }
        }
      };
      ((com.tencent.mm.ui.widget.f)localObject1).qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(20868843438080L, 155485);
          if (localObject1 != null)
          {
            localObject1.bFl();
            paramAnonymousMenuItem = (Bankcard)localArrayList.get(paramAnonymousInt);
            com.tencent.mm.plugin.report.service.g.ork.i(14515, new Object[] { Integer.valueOf(3) });
            if ((!bg.nm(paramAnonymousMenuItem.field_forbid_title)) || (!bg.nm(paramAnonymousMenuItem.field_forbidWord)) || (!paramAnonymousMenuItem.field_support_micropay)) {
              com.tencent.mm.plugin.report.service.g.ork.i(14515, new Object[] { Integer.valueOf(4) });
            }
            paramAnonymousMenuItem = paramAnonymousMenuItem.field_bindSerial;
            if ((!TextUtils.isEmpty(paramAnonymousMenuItem)) && (!paramAnonymousMenuItem.equals(WalletOfflineCoinPurseUI.D(WalletOfflineCoinPurseUI.this))))
            {
              WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, paramAnonymousMenuItem);
              com.tencent.mm.plugin.offline.c.a.Ei(WalletOfflineCoinPurseUI.D(WalletOfflineCoinPurseUI.this));
              com.tencent.mm.plugin.offline.k.aVi();
              com.tencent.mm.plugin.offline.k.aVk().nzv = WalletOfflineCoinPurseUI.D(WalletOfflineCoinPurseUI.this);
              WalletOfflineCoinPurseUI.this.aVJ();
              WalletOfflineCoinPurseUI.E(WalletOfflineCoinPurseUI.this);
              WalletOfflineCoinPurseUI.F(WalletOfflineCoinPurseUI.this);
            }
          }
          GMTrace.o(20868843438080L, 155485);
        }
      };
      localObject2 = View.inflate(this, a.g.sPF, null);
      ((com.tencent.mm.ui.widget.f)localObject1).ofX = true;
      ((com.tencent.mm.ui.widget.f)localObject1).xqa = j;
      ((com.tencent.mm.ui.widget.f)localObject1).xpY = true;
      ((com.tencent.mm.ui.widget.f)localObject1).dH((View)localObject2);
      ((com.tencent.mm.ui.widget.f)localObject1).bFk();
      com.tencent.mm.plugin.report.service.g.ork.i(13955, new Object[] { Integer.valueOf(3) });
      GMTrace.o(6219649515520L, 46340);
      return;
    }
  }
  
  private static void aVQ()
  {
    GMTrace.i(6219917950976L, 46342);
    if (!com.tencent.mm.plugin.offline.c.a.aWm())
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineUtil.isSameMD5ForBindSerial() return false, token is invalid, do doNetSceneToken");
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.aVl().cG(3, 3);
    }
    GMTrace.o(6219917950976L, 46342);
  }
  
  private void alY()
  {
    GMTrace.i(6218038902784L, 46328);
    int i;
    if (this.nCs.size() >= 2)
    {
      i = this.nCs.size() - 1;
      while (i > 1)
      {
        com.tencent.mm.wallet_core.ui.e.u((Bitmap)this.nCs.remove(i));
        i -= 1;
      }
    }
    if (this.nCt.size() >= 2)
    {
      i = this.nCt.size() - 1;
      while (i > 1)
      {
        com.tencent.mm.wallet_core.ui.e.u((Bitmap)this.nCt.remove(i));
        i -= 1;
      }
    }
    GMTrace.o(6218038902784L, 46328);
  }
  
  private static Bankcard f(List<Bankcard> paramList, String paramString)
  {
    GMTrace.i(17965445545984L, 133853);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Bankcard localBankcard = (Bankcard)localIterator.next();
      if (paramString.equals(localBankcard.field_bindSerial))
      {
        paramList.remove(localBankcard);
        GMTrace.o(17965445545984L, 133853);
        return localBankcard;
      }
    }
    GMTrace.o(17965445545984L, 133853);
    return null;
  }
  
  private void gx(boolean paramBoolean)
  {
    GMTrace.i(6217636249600L, 46325);
    long l = System.currentTimeMillis();
    Object localObject1;
    label255:
    label288:
    label354:
    label387:
    int i;
    label455:
    int j;
    if ((paramBoolean) && ((bg.nm(this.nCo)) || (bg.nm(this.nzY))))
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "empty code!");
      if (this.nCw.sg(5))
      {
        if (this.nCw.nBz == 5) {
          this.nCw.dismiss();
        }
        localObject1 = this.nCw;
        localObject2 = this.nBZ;
        View.OnClickListener local21 = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(19255546347520L, 143465);
            com.tencent.mm.plugin.offline.k.aVi();
            com.tencent.mm.plugin.offline.k.aVl();
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "do get token, %s", new Object[] { Integer.valueOf(i.aVh()) });
            com.tencent.mm.plugin.offline.k.aVi();
            com.tencent.mm.plugin.offline.k.aVl();
            if (i.aVh() <= 0)
            {
              paramAnonymousView = new m((int)(System.currentTimeMillis() / 1000L), 10);
              WalletOfflineCoinPurseUI.this.r(paramAnonymousView);
              GMTrace.o(19255546347520L, 143465);
              return;
            }
            WalletOfflineCoinPurseUI.H(WalletOfflineCoinPurseUI.this);
            GMTrace.o(19255546347520L, 143465);
          }
        };
        ((OfflineAlertView)localObject1).nBz = 5;
        ((OfflineAlertView)localObject1).setVisibility(0);
        ((OfflineAlertView)localObject1).nBB = false;
        ((OfflineAlertView)localObject1).nBA.removeAllViews();
        Object localObject3 = LayoutInflater.from(((OfflineAlertView)localObject1).getContext()).inflate(a.g.sPN, null);
        ((OfflineAlertView)localObject1).nBA.addView((View)localObject3);
        ((TextView)((View)localObject3).findViewById(a.f.spL)).setText(a.i.sWt);
        localObject3 = (Button)((View)localObject3).findViewById(a.f.bGm);
        ((Button)localObject3).setText(a.i.sWs);
        ((Button)localObject3).setOnClickListener(local21);
        ((View)localObject2).post(new OfflineAlertView.8((OfflineAlertView)localObject1, (View)localObject2));
        com.tencent.mm.plugin.report.service.g.ork.a(135L, 73L, 1L, true);
      }
      Object localObject2 = this.nBT;
      if (!TextUtils.isEmpty(this.nCo)) {
        break label615;
      }
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "getBitmap mQRcode == null");
      localObject1 = null;
      this.nBT = ((Bitmap)localObject1);
      this.nCa.setImageBitmap(this.nBT);
      if (!aVF()) {
        break label630;
      }
      this.nCa.setAlpha(10);
      this.nCs.add(0, localObject2);
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "doRefresh cost time for fresh qrcode is " + (System.currentTimeMillis() - l));
      localObject2 = this.nBU;
      if (!TextUtils.isEmpty(this.nzY)) {
        break label643;
      }
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "getBarcodeBitmap mBarcode == null");
      localObject1 = null;
      this.nBU = ((Bitmap)localObject1);
      this.nCb.setImageBitmap(this.nBU);
      if (!aVF()) {
        break label658;
      }
      this.nCb.setAlpha(10);
      this.nCt.add(0, localObject2);
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "doRefresh cost time for fresh is " + (System.currentTimeMillis() - l));
      alY();
      aVG();
      com.tencent.mm.wallet_core.c.p.eP(10, 0);
      localObject1 = com.tencent.mm.plugin.report.service.g.ork;
      if (!com.tencent.mm.plugin.offline.c.a.cR(ab.getContext())) {
        break label671;
      }
      i = 0;
      if (!com.tencent.mm.sdk.platformtools.am.isNetworkConnected(ab.getContext())) {
        break label676;
      }
      j = 1;
      label466:
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.aVk();
      ((com.tencent.mm.plugin.report.service.g)localObject1).i(14163, new Object[] { Integer.valueOf(3), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(com.tencent.mm.plugin.offline.e.aVb()) });
      com.tencent.mm.plugin.report.service.g.ork.a(135L, 67L, 1L, true);
      if (!com.tencent.mm.sdk.platformtools.am.isNetworkConnected(ab.getContext())) {
        break label681;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(135L, 32L, 1L, true);
    }
    for (;;)
    {
      if (!com.tencent.mm.plugin.offline.c.a.cR(this)) {
        break label698;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(135L, 34L, 1L, true);
      GMTrace.o(6217636249600L, 46325);
      return;
      if ((!this.nCw.isShowing()) || (this.nCw.nBz != 5)) {
        break;
      }
      this.nCw.dismiss();
      break;
      label615:
      localObject1 = com.tencent.mm.bo.a.a.b(this, this.nCo, 0, 3);
      break label255;
      label630:
      this.nCa.setAlpha(255);
      break label288;
      label643:
      localObject1 = com.tencent.mm.bo.a.a.b(this, this.nzY, 5, 0);
      break label354;
      label658:
      this.nCb.setAlpha(255);
      break label387;
      label671:
      i = 1;
      break label455;
      label676:
      j = 0;
      break label466;
      label681:
      com.tencent.mm.plugin.report.service.g.ork.a(135L, 33L, 1L, true);
    }
    label698:
    com.tencent.mm.plugin.report.service.g.ork.a(135L, 35L, 1L, true);
    GMTrace.o(6217636249600L, 46325);
  }
  
  private void o(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(6217099378688L, 46321);
    if (com.tencent.mm.plugin.offline.c.a.gy(true).size() > 0)
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshUI tempList size > 0");
      aVJ();
      Bankcard localBankcard = com.tencent.mm.plugin.offline.c.a.aVU();
      if (localBankcard != null)
      {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "initBindSerial() have bankcard");
        com.tencent.mm.plugin.offline.c.a.Ei(localBankcard.field_bindSerial);
        this.nzv = localBankcard.field_bindSerial;
        com.tencent.mm.plugin.offline.k.aVi();
        com.tencent.mm.plugin.offline.k.aVk().nzv = this.nzv;
        this.nCe.setVisibility(0);
        label88:
        if (paramBoolean1) {
          sh(0);
        }
        gx(paramBoolean2);
        if (!com.tencent.mm.plugin.offline.c.a.aVS()) {
          break label163;
        }
        this.nCh.setVisibility(0);
      }
    }
    for (;;)
    {
      aVD();
      GMTrace.o(6217099378688L, 46321);
      return;
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "initBindSerial() fail,  bankcard == null");
      break;
      this.nCe.setVisibility(8);
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "refreshUI tempList== null or size is 0");
      break label88;
      label163:
      this.nCh.setVisibility(4);
    }
  }
  
  private void sh(int paramInt)
  {
    int i = 0;
    GMTrace.i(6218173120512L, 46329);
    if (!com.tencent.mm.plugin.offline.c.a.aVS())
    {
      w.w("MicroMsg.WalletOfflineCoinPurseUI", "offline is not create!");
      GMTrace.o(6218173120512L, 46329);
      return;
    }
    com.tencent.mm.plugin.offline.k.aVi();
    Object localObject1 = com.tencent.mm.plugin.offline.k.aVk();
    int j = this.gGg;
    Object localObject2 = this.nCd;
    w.i("MicroMsg.OfflineCodesMgr", "generatetKey scene %s isSnapshot %s stack: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt), bg.bQW().toString() });
    localObject1 = ((com.tencent.mm.plugin.offline.e)localObject1).m(j, paramInt, (String)localObject2);
    this.nzY = ((String)localObject1);
    this.nCo = ((String)localObject1);
    w.v("MicroMsg.WalletOfflineCoinPurseUI", "updateCode isSnapshot:%s mBarcode:%s mQRcode:%s stack: %s", new Object[] { Integer.valueOf(paramInt), this.nzY, this.nCo, bg.bQW().toString() });
    localObject2 = com.tencent.mm.plugin.wallet_core.model.h.byp();
    Object localObject3 = new StringBuilder().append(this.nCo);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw();
    localObject3 = aa.RP(com.tencent.mm.a.o.getString(com.tencent.mm.kernel.a.ww()));
    if (localObject2 != null) {
      com.tencent.mm.plugin.report.service.g.ork.i(13444, new Object[] { ((at)localObject2).tOR, ((at)localObject2).tOS, Long.valueOf(((at)localObject2).tOQ), localObject3, ((at)localObject2).tOT, ((at)localObject2).tOU });
    }
    if (bg.nm((String)localObject1))
    {
      localObject1 = com.tencent.mm.plugin.report.service.g.ork;
      if (com.tencent.mm.plugin.offline.c.a.cR(ab.getContext())) {}
      for (paramInt = 0;; paramInt = 1)
      {
        if (com.tencent.mm.sdk.platformtools.am.isNetworkConnected(getBaseContext())) {
          i = 1;
        }
        ((com.tencent.mm.plugin.report.service.g)localObject1).i(14163, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt), Integer.valueOf(i) });
        com.tencent.mm.plugin.report.service.g.ork.a(135L, 26L, 1L, true);
        if (!com.tencent.mm.sdk.platformtools.am.isNetworkConnected(getBaseContext())) {
          break;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(135L, 28L, 1L, true);
        GMTrace.o(6218173120512L, 46329);
        return;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(135L, 27L, 1L, true);
    }
    GMTrace.o(6218173120512L, 46329);
  }
  
  protected final void MP()
  {
    GMTrace.i(6216965160960L, 46320);
    this.nCw = ((OfflineAlertView)findViewById(a.f.sCQ));
    this.nCw.dismiss();
    this.nCw.nBC = new OfflineAlertView.a()
    {
      public final void onClose()
      {
        GMTrace.i(19255680565248L, 143466);
        WalletOfflineCoinPurseUI.f(WalletOfflineCoinPurseUI.this);
        GMTrace.o(19255680565248L, 143466);
      }
      
      public final void onShow()
      {
        GMTrace.i(19255814782976L, 143467);
        WalletOfflineCoinPurseUI.f(WalletOfflineCoinPurseUI.this);
        GMTrace.o(19255814782976L, 143467);
      }
    };
    com.tencent.mm.wallet_core.c.a.clF();
    com.tencent.mm.wallet_core.c.a.init(getApplicationContext());
    final Object localObject;
    int i;
    if (this.gGg == 3)
    {
      oM(a.i.thq);
      this.nCv = new c(this, this);
      localObject = this.nCv;
      ((c)localObject).jsv = ((Vibrator)((c)localObject).mActivity.getSystemService("vibrator"));
      this.nCu = new com.tencent.mm.wallet_core.ui.c(this, true);
      this.nCu.init();
      this.nBZ = findViewById(a.f.sKK);
      this.nCa = ((ImageView)findViewById(a.f.sKJ));
      this.nCb = ((ImageView)findViewById(a.f.sIP));
      this.nCc = ((TextView)findViewById(a.f.sIQ));
      this.nCe = findViewById(a.f.sKU);
      this.nCf = ((TextView)findViewById(a.f.sKW));
      this.nCg = ((ImageView)findViewById(a.f.sKT));
      this.nCh = ((RelativeLayout)findViewById(a.f.sJM));
      this.nCh.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19257022742528L, 143476);
          WalletOfflineCoinPurseUI.s(WalletOfflineCoinPurseUI.this);
          GMTrace.o(19257022742528L, 143476);
        }
      });
      this.nCa.setOnClickListener(this.hwh);
      this.nCb.setOnClickListener(this.hwh);
      this.nCc.setOnClickListener(this.hwh);
      this.nCe.setClickable(true);
      this.nCe.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19255143694336L, 143462);
          com.tencent.mm.plugin.report.service.g.ork.i(14515, new Object[] { Integer.valueOf(1) });
          WalletOfflineCoinPurseUI.t(WalletOfflineCoinPurseUI.this);
          GMTrace.o(19255143694336L, 143462);
        }
      });
      this.mLastTime = System.currentTimeMillis();
      this.nCi = ((LinearLayout)findViewById(a.f.sJK));
      this.nCj = ((LinearLayout)findViewById(a.f.sJI));
      this.nCk = ((LinearLayout)findViewById(a.f.sJL));
      this.nCl = ((LinearLayout)findViewById(a.f.sJN));
      this.nCm = ((LinearLayout)findViewById(a.f.sJJ));
      if (this.gGg != 3) {
        break label718;
      }
      this.nCi.setVisibility(8);
      this.nCj.setVisibility(8);
      this.nCk.setVisibility(8);
      this.nCl.setVisibility(8);
      if ((com.tencent.mm.plugin.offline.c.a.aVS()) && (c.aVy()))
      {
        localObject = this.nCv;
        com.tencent.mm.plugin.offline.k.aVi();
        ((c)localObject).a(com.tencent.mm.plugin.offline.k.aVj().nBg);
      }
      aVE();
      o(true, false);
      localObject = this.nAd;
      long l1 = this.nAc;
      ((aj)localObject).z(l1, l1);
      if ((com.tencent.mm.plugin.offline.c.a.nDk != 3) || (!com.tencent.mm.plugin.offline.c.a.nDn)) {
        break label1196;
      }
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from card detail ui, is marked!");
      i = com.tencent.mm.plugin.offline.c.a.nDl;
      l1 = com.tencent.mm.plugin.offline.c.a.nDm;
      long l2 = System.currentTimeMillis();
      long l3 = i * 1000 + l1 - l2;
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "expire_time:" + i + " beginTime:" + l1 + " now:" + l2 + " interval:" + l3);
      if ((com.tencent.mm.plugin.offline.c.a.nDl <= 0) || (com.tencent.mm.plugin.offline.c.a.nDm <= 0L) || (l3 <= 0L)) {
        break label1184;
      }
      if (!this.nCH.bQn()) {
        this.nCH.stopTimer();
      }
      this.nCH.z(l3, l3);
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "start card expire timer!");
    }
    for (;;)
    {
      aVD();
      localObject = new sm();
      ((sm)localObject).eXp.eXr = "5";
      ((sm)localObject).eDO = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17961284796416L, 133822);
          if (!bg.nm(localObject.eXq.eXs))
          {
            com.tencent.mm.wallet_core.ui.e.a((TextView)WalletOfflineCoinPurseUI.this.findViewById(a.f.sqJ), localObject.eXq.eXs, localObject.eXq.content, localObject.eXq.url);
            GMTrace.o(17961284796416L, 133822);
            return;
          }
          w.i("MicroMsg.WalletOfflineCoinPurseUI", "no bulletin data");
          GMTrace.o(17961284796416L, 133822);
        }
      };
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(6216965160960L, 46320);
      return;
      oM(a.i.thr);
      break;
      label718:
      this.nCl.setVisibility(0);
      i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzV, Integer.valueOf(0))).intValue();
      label768:
      final boolean bool1;
      final boolean bool2;
      final boolean bool3;
      final boolean bool4;
      final boolean bool5;
      final ImageView localImageView1;
      final ImageView localImageView2;
      final ImageView localImageView3;
      final TextView localTextView;
      final ImageView localImageView4;
      final ImageView localImageView5;
      if ((com.tencent.mm.sdk.a.b.bPq()) || (i == 1))
      {
        this.nCm.setVisibility(0);
        bool1 = com.tencent.mm.s.c.vK().b(w.a.vzN, w.a.vyQ);
        bool2 = com.tencent.mm.s.c.vK().b(w.a.vzO, w.a.vyQ);
        bool3 = com.tencent.mm.s.c.vK().b(w.a.vzP, w.a.vyQ);
        bool4 = com.tencent.mm.s.c.vK().b(w.a.vzQ, w.a.vyQ);
        bool5 = com.tencent.mm.s.c.vK().b(w.a.vzR, w.a.vyQ);
        localObject = (ImageView)this.nCj.findViewById(a.f.spn);
        localImageView1 = (ImageView)this.nCi.findViewById(a.f.svs);
        localImageView2 = (ImageView)this.nCk.findViewById(a.f.svp);
        localImageView3 = (ImageView)this.nCl.findViewById(a.f.sEB);
        localTextView = (TextView)this.nCi.findViewById(a.f.svu);
        localImageView4 = (ImageView)this.nCi.findViewById(a.f.svt);
        localImageView5 = (ImageView)this.nCm.findViewById(a.f.sqm);
        if (bool1) {
          ((ImageView)localObject).setVisibility(0);
        }
        if (bool2)
        {
          com.tencent.mm.kernel.h.xz();
          String str = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzg, "");
          if (bg.nm(str)) {
            break label1175;
          }
          localTextView.setText(str);
          localTextView.setVisibility(0);
          localImageView4.setVisibility(0);
        }
      }
      for (;;)
      {
        if (bool3) {
          localImageView2.setVisibility(0);
        }
        if (bool4) {
          localImageView3.setVisibility(0);
        }
        if (bool5) {
          localImageView5.setVisibility(0);
        }
        getWindow().getDecorView().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19263062540288L, 143521);
            ScrollView localScrollView = (ScrollView)WalletOfflineCoinPurseUI.this.findViewById(a.f.sCT);
            int[] arrayOfInt = new int[2];
            localScrollView.getLocationInWindow(arrayOfInt);
            int i = ad.ff(WalletOfflineCoinPurseUI.this.vKB.vKW).y;
            int j = i;
            if (ad.fe(WalletOfflineCoinPurseUI.this.vKB.vKW))
            {
              w.d("MicroMsg.WalletOfflineCoinPurseUI", "has navi");
              j = i - ad.fd(WalletOfflineCoinPurseUI.this.vKB.vKW);
            }
            if (bool2) {}
            for (i = arrayOfInt[1] + WalletOfflineCoinPurseUI.g(WalletOfflineCoinPurseUI.this).getBottom();; i = 0)
            {
              if (bool4) {
                i = arrayOfInt[1] + WalletOfflineCoinPurseUI.h(WalletOfflineCoinPurseUI.this).getBottom();
              }
              if (bool1) {
                i = arrayOfInt[1] + WalletOfflineCoinPurseUI.i(WalletOfflineCoinPurseUI.this).getBottom();
              }
              if (bool3) {
                i = arrayOfInt[1] + WalletOfflineCoinPurseUI.j(WalletOfflineCoinPurseUI.this).getBottom();
              }
              if (bool5) {
                i = arrayOfInt[1] + WalletOfflineCoinPurseUI.k(WalletOfflineCoinPurseUI.this).getBottom();
              }
              w.d("MicroMsg.WalletOfflineCoinPurseUI", "f2f: %s, screen: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
              i -= j;
              if (i > 0) {
                localScrollView.scrollBy(0, i);
              }
              GMTrace.o(19263062540288L, 143521);
              return;
            }
          }
        });
        this.nCi.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(15048223227904L, 112118);
            if (com.tencent.mm.s.c.vK().b(w.a.vzO, w.a.vyQ))
            {
              com.tencent.mm.s.c.vK().c(w.a.vzO, w.a.vyQ);
              localImageView1.setVisibility(8);
              localTextView.setVisibility(8);
              localImageView4.setVisibility(8);
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xy().xh().a(w.a.vzg, "");
              com.tencent.mm.plugin.report.service.g.ork.i(14396, new Object[] { Integer.valueOf(3) });
            }
            if (com.tencent.mm.plugin.wallet_core.model.n.byx().byS())
            {
              WalletOfflineCoinPurseUI.l(WalletOfflineCoinPurseUI.this);
              GMTrace.o(15048223227904L, 112118);
              return;
            }
            WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, com.tencent.mm.wallet_core.ui.g.a(WalletOfflineCoinPurseUI.this.vKB.vKW, false, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(19257291177984L, 143478);
                WalletOfflineCoinPurseUI.m(WalletOfflineCoinPurseUI.this);
                GMTrace.o(19257291177984L, 143478);
              }
            }));
            com.tencent.mm.plugin.wallet_core.model.n.bys();
            if (!com.tencent.mm.plugin.wallet_core.model.n.b(WalletOfflineCoinPurseUI.this, WalletOfflineCoinPurseUI.n(WalletOfflineCoinPurseUI.this), new a.a()
            {
              public final boolean a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, boolean paramAnonymous2Boolean)
              {
                GMTrace.i(19262794104832L, 143519);
                w.i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + paramAnonymous2Int1 + ";errCode=" + paramAnonymous2Int2 + ";errMsg=" + paramAnonymous2String + ";hadAgree = " + paramAnonymous2Boolean);
                if (paramAnonymous2Int1 == 2)
                {
                  paramAnonymous2String = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("collect");
                  WalletOfflineCoinPurseUI.this.b(paramAnonymous2String, false);
                }
                for (;;)
                {
                  GMTrace.o(19262794104832L, 143519);
                  return true;
                  if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Boolean))
                  {
                    paramAnonymous2String = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("collect");
                    WalletOfflineCoinPurseUI.this.b(paramAnonymous2String, false);
                  }
                  else if (WalletOfflineCoinPurseUI.o(WalletOfflineCoinPurseUI.this) != null)
                  {
                    WalletOfflineCoinPurseUI.o(WalletOfflineCoinPurseUI.this).dismiss();
                  }
                }
              }
            }))
            {
              paramAnonymousView = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("collect");
              WalletOfflineCoinPurseUI.this.r(paramAnonymousView);
            }
            GMTrace.o(15048223227904L, 112118);
          }
        });
        this.nCj.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(16586626826240L, 123580);
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "click aa");
            com.tencent.mm.plugin.report.service.g.ork.i(14021, new Object[] { Integer.valueOf(3), Integer.valueOf(WalletOfflineCoinPurseUI.p(WalletOfflineCoinPurseUI.this)) });
            com.tencent.mm.bj.d.x(WalletOfflineCoinPurseUI.this.vKB.vKW, "aa", ".ui.AAEntranceUI");
            if (com.tencent.mm.s.c.vK().b(w.a.vzN, w.a.vyQ))
            {
              com.tencent.mm.s.c.vK().c(w.a.vzN, w.a.vyQ);
              localObject.setVisibility(8);
              com.tencent.mm.plugin.report.service.g.ork.i(14396, new Object[] { Integer.valueOf(4) });
            }
            GMTrace.o(16586626826240L, 123580);
          }
        });
        this.nCk.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17084171943936L, 127287);
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "click f2f lucky");
            com.tencent.mm.plugin.report.service.g.ork.i(14021, new Object[] { Integer.valueOf(4), Integer.valueOf(WalletOfflineCoinPurseUI.p(WalletOfflineCoinPurseUI.this)) });
            com.tencent.mm.bj.d.x(WalletOfflineCoinPurseUI.this.vKB.vKW, "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
            if (com.tencent.mm.s.c.vK().b(w.a.vzP, w.a.vyQ))
            {
              com.tencent.mm.s.c.vK().c(w.a.vzP, w.a.vyQ);
              localImageView2.setVisibility(8);
              com.tencent.mm.plugin.report.service.g.ork.i(14396, new Object[] { Integer.valueOf(5) });
            }
            GMTrace.o(17084171943936L, 127287);
          }
        });
        this.nCl.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17965311328256L, 133852);
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "click qr reward");
            com.tencent.mm.plugin.report.service.g.ork.i(14021, new Object[] { Integer.valueOf(5), Integer.valueOf(WalletOfflineCoinPurseUI.p(WalletOfflineCoinPurseUI.this)) });
            if (com.tencent.mm.s.c.vK().b(w.a.vzQ, w.a.vyQ))
            {
              com.tencent.mm.s.c.vK().c(w.a.vzQ, w.a.vyQ);
              localImageView3.setVisibility(8);
            }
            if (com.tencent.mm.plugin.wallet_core.model.n.byx().byS())
            {
              com.tencent.mm.bj.d.x(WalletOfflineCoinPurseUI.this.vKB.vKW, "collect", ".reward.ui.QrRewardMainUI");
              GMTrace.o(17965311328256L, 133852);
              return;
            }
            WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, com.tencent.mm.wallet_core.ui.g.a(WalletOfflineCoinPurseUI.this.vKB.vKW, false, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(19256620089344L, 143473);
                WalletOfflineCoinPurseUI.q(WalletOfflineCoinPurseUI.this);
                GMTrace.o(19256620089344L, 143473);
              }
            }));
            com.tencent.mm.plugin.wallet_core.model.n.bys();
            if (!com.tencent.mm.plugin.wallet_core.model.n.b(WalletOfflineCoinPurseUI.this, WalletOfflineCoinPurseUI.r(WalletOfflineCoinPurseUI.this), new a.a()
            {
              public final boolean a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, boolean paramAnonymous2Boolean)
              {
                GMTrace.i(19258230702080L, 143485);
                w.i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + paramAnonymous2Int1 + ";errCode=" + paramAnonymous2Int2 + ";errMsg=" + paramAnonymous2String + ";hadAgree = " + paramAnonymous2Boolean);
                if (paramAnonymous2Int1 == 2)
                {
                  paramAnonymous2String = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("reward");
                  WalletOfflineCoinPurseUI.this.b(paramAnonymous2String, false);
                }
                for (;;)
                {
                  GMTrace.o(19258230702080L, 143485);
                  return true;
                  if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Boolean))
                  {
                    paramAnonymous2String = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("reward");
                    WalletOfflineCoinPurseUI.this.b(paramAnonymous2String, false);
                  }
                  else if (WalletOfflineCoinPurseUI.o(WalletOfflineCoinPurseUI.this) != null)
                  {
                    WalletOfflineCoinPurseUI.o(WalletOfflineCoinPurseUI.this).dismiss();
                  }
                }
              }
            }))
            {
              paramAnonymousView = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("reward");
              WalletOfflineCoinPurseUI.this.r(paramAnonymousView);
            }
            GMTrace.o(17965311328256L, 133852);
          }
        });
        this.nCm.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17964103368704L, 133843);
            com.tencent.mm.bj.d.x(WalletOfflineCoinPurseUI.this.vKB.vKW, "remittance", ".bankcard.ui.BankRemitBankcardInputUI");
            if (com.tencent.mm.s.c.vK().b(w.a.vzR, w.a.vyQ))
            {
              com.tencent.mm.s.c.vK().c(w.a.vzR, w.a.vyQ);
              localImageView5.setVisibility(8);
            }
            GMTrace.o(17964103368704L, 133843);
          }
        });
        break;
        this.nCm.setVisibility(8);
        break label768;
        label1175:
        localImageView1.setVisibility(0);
      }
      label1184:
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "not to start card expire timer!");
      continue;
      label1196:
      if (com.tencent.mm.plugin.offline.c.a.nDk == 3) {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from card detail ui, not need to mark!");
      } else {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from %d, not need to start timer!", new Object[] { Integer.valueOf(com.tencent.mm.plugin.offline.c.a.nDk) });
      }
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(6219783733248L, 46341);
    GMTrace.o(6219783733248L, 46341);
    return 1;
  }
  
  public final boolean a(r.c paramc)
  {
    GMTrace.i(6218307338240L, 46330);
    if (paramc == null)
    {
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "onNotify msg == null");
      GMTrace.o(6218307338240L, 46330);
      return false;
    }
    aVH();
    this.nCu.dismiss();
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "msgtype=" + paramc.nBn);
    int i;
    if (4 == paramc.nBn)
    {
      this.nCp = false;
      i = 0;
    }
    for (;;)
    {
      Object localObject1 = this.nCv;
      if (paramc == null) {
        w.e("MicroMsg.OfflineLogicMgr", "onNotify msg == null");
      }
      for (;;)
      {
        if (i != 0)
        {
          sh(0);
          gx(true);
        }
        GMTrace.o(6218307338240L, 46330);
        return true;
        if (5 == paramc.nBn)
        {
          this.nCp = false;
          if (this.nCG.bQn()) {
            break label1394;
          }
          this.nCG.stopTimer();
          i = 1;
          break;
        }
        if (6 == paramc.nBn)
        {
          this.nCp = false;
          if (!this.nCG.bQn()) {
            this.nCG.stopTimer();
          }
          if (!com.tencent.mm.plugin.offline.c.a.aVT()) {
            break label1394;
          }
          i = 0;
          break;
        }
        if (8 == paramc.nBn)
        {
          if (this.nCG.bQn()) {
            break label1394;
          }
          this.nCG.stopTimer();
          i = 1;
          break;
        }
        if (23 == paramc.nBn)
        {
          if (this.nCG.bQn()) {
            break label381;
          }
          this.nCG.stopTimer();
          i = 0;
          break;
        }
        if (20 == paramc.nBn)
        {
          this.nCp = false;
          if (this.nCG.bQn()) {
            break label381;
          }
          this.nCG.stopTimer();
          i = 0;
          break;
        }
        if (24 != paramc.nBn) {
          break label1394;
        }
        if (com.tencent.mm.plugin.offline.c.a.aWu())
        {
          this.nCp = true;
          if (com.tencent.mm.plugin.offline.c.a.aWu())
          {
            if (this.nCn != null) {
              break label386;
            }
            this.nCn = com.tencent.mm.wallet_core.ui.g.a(this.vKB.vKW, false, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(20869380308992L, 155489);
                WalletOfflineCoinPurseUI.B(WalletOfflineCoinPurseUI.this);
                GMTrace.o(20869380308992L, 155489);
              }
            });
          }
        }
        for (;;)
        {
          localObject1 = this.nCG;
          long l = com.tencent.mm.plugin.offline.g.aVd();
          ((aj)localObject1).z(l, l);
          label381:
          i = 0;
          break;
          label386:
          if (!this.nCn.isShowing()) {
            this.nCn.show();
          }
        }
        w.i("MicroMsg.OfflineLogicMgr", "onNotify OfflineMsg type :" + paramc.nBn);
        if (paramc.nBn == 24) {
          ((c)localObject1).jsv.vibrate(50L);
        }
        if (4 == paramc.nBn)
        {
          ((c)localObject1).a((r.b)paramc);
          com.tencent.mm.plugin.offline.g.aVf();
        }
        else
        {
          if (5 == paramc.nBn)
          {
            paramc = (r.e)paramc;
            if (paramc != null)
            {
              w.i("MicroMsg.OfflineLogicMgr", "showNotifyMsg msg.wxRetCode:" + paramc.nBq + " msg.wxRetMsg:" + paramc.nBr + " msg.cftRetCode:" + paramc.nBq + " msg.cftRetMsg:" + paramc.nBp);
              if ((!TextUtils.isEmpty(paramc.nBq)) || (!TextUtils.isEmpty(paramc.nBr)) || (!TextUtils.isEmpty(paramc.nBo)) || (!TextUtils.isEmpty(paramc.nBp)))
              {
                if ((!TextUtils.isEmpty(paramc.nBq)) || (!TextUtils.isEmpty(paramc.nBr)) || (TextUtils.isEmpty(paramc.nBo)) || (TextUtils.isEmpty(paramc.nBp))) {
                  break label667;
                }
                b.a(((c)localObject1).mActivity, paramc.nBp);
              }
            }
            for (;;)
            {
              com.tencent.mm.plugin.offline.g.aVf();
              com.tencent.mm.plugin.report.service.g.ork.a(135L, 0L, 1L, true);
              break;
              label667:
              if ((!TextUtils.isEmpty(paramc.nBq)) && (com.tencent.mm.plugin.offline.c.a.uE(paramc.nBq))) {
                ((c)localObject1).a(null, Integer.valueOf(paramc.nBq).intValue(), paramc.nBr, paramc.nBs);
              } else {
                b.a(((c)localObject1).mActivity, paramc.nBr);
              }
            }
          }
          Object localObject2;
          if (6 == paramc.nBn)
          {
            paramc = (r.f)paramc;
            int j;
            if (paramc != null)
            {
              w.i("MicroMsg.OfflineLogicMgr", "showOrderSuccessUI transid : " + paramc.nBt);
              com.tencent.mm.plugin.offline.k.aVi();
              localObject2 = com.tencent.mm.plugin.offline.k.aVm().Ef(paramc.nBu.eHG);
              if (localObject2 == null) {
                break label898;
              }
              if (((com.tencent.mm.plugin.offline.a.q)localObject2).field_status != com.tencent.mm.plugin.offline.g.nzJ) {
                break label893;
              }
              j = 1;
            }
            for (;;)
            {
              if (j == 0)
              {
                com.tencent.mm.plugin.offline.g.bB(paramc.nBu.eHG, com.tencent.mm.plugin.offline.g.nzJ);
                com.tencent.mm.plugin.offline.c.a.a(((c)localObject1).mActivity, paramc);
                ((c)localObject1).mActivity.finish();
              }
              com.tencent.mm.plugin.offline.g.aVf();
              com.tencent.mm.plugin.report.service.g.ork.a(135L, 7L, 1L, true);
              if (com.tencent.mm.plugin.offline.c.a.nDk != 4) {
                break;
              }
              w.i("MicroMsg.OfflineLogicMgr", "hy: is from ext");
              com.tencent.mm.plugin.report.service.g.ork.i(13412, new Object[0]);
              break;
              label893:
              j = 0;
              continue;
              label898:
              j = 0;
            }
          }
          Object localObject3;
          if (8 == paramc.nBn)
          {
            paramc = (r.g)paramc;
            w.i("MicroMsg.OfflineLogicMgr", "showPayConfirmMsg msg id:" + paramc.id);
            if (paramc.nBx == 0)
            {
              localObject2 = ((c)localObject1).mActivity.getLayoutInflater().inflate(a.g.sPL, null);
              localObject3 = (TextView)((View)localObject2).findViewById(a.f.sDF);
              TextView localTextView = (TextView)((View)localObject2).findViewById(a.f.sDH);
              ((TextView)localObject3).setText(paramc.nBw);
              localTextView.setText(paramc.nBv);
              com.tencent.mm.plugin.offline.g.bB(paramc.eJQ, com.tencent.mm.plugin.offline.g.nzL);
              com.tencent.mm.ui.base.h.a(((c)localObject1).mActivity, "", (View)localObject2, ((c)localObject1).getString(a.i.thy), ((c)localObject1).getString(a.i.cSk), new c.11((c)localObject1, paramc), new c.12((c)localObject1, paramc));
            }
            else if (paramc.nBx == 1)
            {
              if (((c)localObject1).nBJ != null) {
                ((c)localObject1).nBJ.show();
              }
              com.tencent.mm.plugin.report.service.g.ork.i(13955, new Object[] { Integer.valueOf(1) });
              w.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog msg id:" + paramc.id);
              com.tencent.mm.plugin.offline.g.bB(paramc.eJQ, com.tencent.mm.plugin.offline.g.nzL);
              ((c)localObject1).nBJ = l.a(((c)localObject1).mActivity, paramc.nBv, paramc.nBw, new c.13((c)localObject1, paramc), new c.14((c)localObject1), new c.15((c)localObject1, paramc));
              ((c)localObject1).nBJ.ovy.setVisibility(0);
              ((c)localObject1).nBJ.okD.setVisibility(8);
            }
          }
          else
          {
            if (23 == paramc.nBn)
            {
              paramc = (r.d)paramc;
              localObject2 = new PayInfo();
              ((PayInfo)localObject2).eHG = paramc.eJQ;
              ((PayInfo)localObject2).ePL = 8;
              ((PayInfo)localObject2).tIK = 1;
              ((PayInfo)localObject2).tIC = new Bundle();
              ((PayInfo)localObject2).tIC.putLong("extinfo_key_9", System.currentTimeMillis());
              paramc = new c.1((c)localObject1, (PayInfo)localObject2);
              com.tencent.mm.sdk.b.a.vgX.a(paramc);
              localObject3 = ((c)localObject1).mActivity;
              if (((c)localObject1).nBI == null) {}
              for (paramc = "";; paramc = ((c)localObject1).nBI.aVv())
              {
                com.tencent.mm.pluginsdk.wallet.g.a((Context)localObject3, false, "", paramc, (PayInfo)localObject2, "", new Intent(), 1);
                break;
              }
            }
            if (20 == paramc.nBn) {
              com.tencent.mm.plugin.offline.g.aVf();
            }
          }
        }
      }
      label1394:
      i = 1;
    }
  }
  
  public final boolean aNk()
  {
    GMTrace.i(6217502031872L, 46324);
    GMTrace.o(6217502031872L, 46324);
    return false;
  }
  
  public final void aVJ()
  {
    GMTrace.i(6218844209152L, 46334);
    Object localObject3 = com.tencent.mm.plugin.offline.c.a.aVU();
    findViewById(a.f.sKV).setVisibility(0);
    this.nCf.setTextSize(0, getResources().getDimensionPixelSize(a.d.aQF));
    Object localObject2;
    Object localObject1;
    if ((this.nCf != null) && (localObject3 != null))
    {
      localObject2 = getString(a.i.thg, new Object[] { ((Bankcard)localObject3).field_desc });
      localObject1 = com.tencent.mm.plugin.wallet_core.model.n.byx().bzd();
      if ((localObject1 == null) || (bg.nm(((Bankcard)localObject3).field_forbidWord))) {
        break label466;
      }
      Iterator localIterator = ((List)localObject1).iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject1 = (com.tencent.mm.plugin.wallet_core.model.c)localIterator.next();
      } while (!((com.tencent.mm.plugin.wallet_core.model.c)localObject1).nDu.equals(((Bankcard)localObject3).field_bindSerial));
    }
    for (;;)
    {
      if ((localObject1 != null) && (!bg.nm(((com.tencent.mm.plugin.wallet_core.model.c)localObject1).rex)))
      {
        localObject1 = ((Bankcard)localObject3).field_desc + ((com.tencent.mm.plugin.wallet_core.model.c)localObject1).rex;
        findViewById(a.f.sKV).setVisibility(8);
        com.tencent.mm.plugin.report.service.g.ork.i(14515, new Object[] { Integer.valueOf(2) });
        this.nCf.setTextSize(0, getResources().getDimensionPixelSize(a.d.aQo));
      }
      for (int i = 1;; i = 0)
      {
        this.nCf.setText((CharSequence)localObject1);
        if (localObject3 != null)
        {
          if (!TextUtils.isEmpty(this.nzv)) {
            break label311;
          }
          w.e("MicroMsg.WalletOfflineCoinPurseUI", "updateBankLogo() mBindSerial is null");
        }
        for (;;)
        {
          if (i != 0) {
            this.nCg.setImageResource(a.h.sQM);
          }
          GMTrace.o(6218844209152L, 46334);
          return;
          if (localObject3 == null) {
            w.e("MicroMsg.WalletOfflineCoinPurseUI", "setChangeBankcardText bankcard == null");
          }
          i = 0;
          break;
          label311:
          localObject2 = com.tencent.mm.plugin.offline.c.a.Ep(this.nzv);
          localObject1 = localObject2;
          if (((Bankcard)localObject3).bye())
          {
            localObject1 = localObject2;
            if (((Bankcard)localObject3).reS != null) {
              localObject1 = ((Bankcard)localObject3).reS.nvc;
            }
          }
          if (TextUtils.isEmpty((CharSequence)localObject1))
          {
            w.e("MicroMsg.WalletOfflineCoinPurseUI", "updateBankLogo() icon_url == null, can not find this icon_url");
          }
          else
          {
            localObject2 = this.nCg;
            int j = getResources().getDimensionPixelOffset(a.d.snJ);
            if ((localObject2 != null) && (!TextUtils.isEmpty((CharSequence)localObject1)))
            {
              localObject3 = com.tencent.mm.platformtools.j.a(new com.tencent.mm.plugin.wallet_core.ui.view.c((String)localObject1));
              if (localObject3 != null) {
                ((ImageView)localObject2).setImageBitmap(com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject3, j, j, true, false));
              }
              this.nBR.put(localObject1, localObject2);
              this.nBS.put(localObject1, Integer.valueOf(j));
            }
          }
        }
        localObject1 = localObject2;
      }
      label466:
      localObject1 = null;
    }
  }
  
  public final void aVt()
  {
    GMTrace.i(6220320604160L, 46345);
    aVP();
    GMTrace.o(6220320604160L, 46345);
  }
  
  public final void aVu()
  {
    GMTrace.i(6220454821888L, 46346);
    b(new com.tencent.mm.plugin.offline.a.j(""), false);
    GMTrace.o(6220454821888L, 46346);
  }
  
  public final String aVv()
  {
    GMTrace.i(6220589039616L, 46347);
    String str = this.nzv;
    GMTrace.o(6220589039616L, 46347);
    return str;
  }
  
  public final void aVw()
  {
    GMTrace.i(16588103221248L, 123591);
    if (!this.nAd.bQn()) {
      this.nAd.stopTimer();
    }
    sh(0);
    gx(true);
    aj localaj = this.nAd;
    long l = this.nAc;
    localaj.z(l, l);
    GMTrace.o(16588103221248L, 123591);
  }
  
  public final void abx()
  {
    GMTrace.i(6218709991424L, 46333);
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "setScreenShotCallback");
    sh(1);
    gx(true);
    com.tencent.mm.wallet_core.ui.e.EQ(40);
    com.tencent.mm.plugin.report.service.g.ork.a(135L, 21L, 1L, true);
    if (this.nCu.hwd.isShowing())
    {
      if (this.nCu.jER)
      {
        this.nCu.cmj();
        GMTrace.o(6218709991424L, 46333);
        return;
      }
      this.nCu.dismiss();
    }
    aVL();
    GMTrace.o(6218709991424L, 46333);
  }
  
  public final void ajN()
  {
    GMTrace.i(6220052168704L, 46343);
    sh(0);
    gx(true);
    GMTrace.o(6220052168704L, 46343);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6216696725504L, 46318);
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "errType:" + paramInt1 + "  errCode" + paramInt2 + " errMsg:" + paramString + " scene: " + paramk);
    if (((paramk instanceof com.tencent.mm.plugin.offline.a.f)) && (((paramInt1 == 0) && (paramInt2 == 0)) || (paramInt1 != 0)))
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "onSceneEnd NetSceneOfflineVerifyToken errType %d errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.nAa.aVp();
      this.nAa = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.o))
      {
        if (com.tencent.mm.plugin.offline.c.a.aVS())
        {
          if (com.tencent.mm.plugin.offline.c.a.aVV() != null) {
            aVI();
          }
          aVQ();
        }
        aVO();
        if ((!(paramk instanceof com.tencent.mm.plugin.wallet_core.c.o)) && (!(paramk instanceof com.tencent.mm.plugin.offline.a.n)) && (!(paramk instanceof com.tencent.mm.plugin.offline.a.a)) && (!(paramk instanceof com.tencent.mm.plugin.offline.a.e))) {
          break label762;
        }
        aVE();
        o(false, true);
      }
    }
    for (;;)
    {
      GMTrace.o(6216696725504L, 46318);
      return true;
      if ((paramk instanceof m))
      {
        this.nAa = ((m)paramk);
        paramString = this.nAa.nBa;
        com.tencent.mm.plugin.offline.k.aVi();
        paramString = new com.tencent.mm.plugin.offline.a.f(paramString, com.tencent.mm.plugin.offline.k.sf(196617));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(paramString, 0);
        break;
      }
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.j))
      {
        aVE();
        aVB();
        break;
      }
      Object localObject;
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.n))
      {
        paramString = (com.tencent.mm.plugin.offline.a.n)paramk;
        if ("1".equals(paramString.nBe))
        {
          w.w("MicroMsg.WalletOfflineCoinPurseUI", "hy: should pause. showFirstPostTip alert to finish");
          if (bg.nm(paramString.nBf)) {}
          for (paramString = getString(a.i.tbj);; paramString = paramString.nBf)
          {
            com.tencent.mm.ui.base.h.a(this, paramString, "", false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(19258364919808L, 143486);
                WalletOfflineCoinPurseUI.this.finish();
                GMTrace.o(19258364919808L, 143486);
              }
            });
            GMTrace.o(6216696725504L, 46318);
            return true;
          }
        }
        if (paramString.nAA == 0)
        {
          localObject = this.nCv;
          ((c)localObject).nBK = com.tencent.mm.plugin.offline.c.a.aVZ();
          ((c)localObject).nBK = ((c)localObject).nBK;
          if (!"1".equals(paramString.nBd)) {
            break;
          }
          w.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: should refresh codes. doscene");
          b(new m((int)(System.currentTimeMillis() / 1000L), 8), false);
          break;
        }
        if (paramString.nAA == 0) {
          break;
        }
        this.nCv.a(paramString, paramString.nAA, paramString.nAB);
        break;
      }
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.a)) {
        break;
      }
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.e))
      {
        this.nCv.d(paramInt1, paramInt2, paramString, paramk);
        break;
      }
      if (!(paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.f)) {
        break;
      }
      if ((this.nCn != null) && (this.nCn.isShowing())) {
        this.nCn.dismiss();
      }
      paramk = (com.tencent.mm.plugin.wallet_core.id_verify.model.f)paramk;
      if (("1".equals(paramk.rdJ)) || (("2".equals(paramk.rdJ)) && (!bg.nm(paramk.rdK))))
      {
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".ui.WalletOfflineCoinPurseUI");
        paramString.putString("realname_verify_process_jump_plugin", "offline");
        localObject = paramk.rdK;
        localObject = paramk.rdL;
        paramk = paramk.rdM;
        com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString, 1006);
      }
      for (;;)
      {
        GMTrace.o(6216696725504L, 46318);
        return true;
        if ("collect".equals(paramk.rdN)) {
          aVC();
        } else if ("reward".equals(paramk.rdN)) {
          com.tencent.mm.bj.d.x(this.vKB.vKW, "collect", ".reward.ui.QrRewardMainUI");
        } else {
          w.w("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %s", new Object[] { paramk.rdN });
        }
      }
      label762:
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.f))
      {
        aVE();
        o(true, true);
        continue;
        if ((paramk instanceof com.tencent.mm.plugin.offline.a.n))
        {
          aVE();
          o(false, true);
          if (411 == paramInt2) {
            this.nCv.a(paramk, paramInt2, paramString);
          }
        }
        else if ((paramk instanceof com.tencent.mm.plugin.offline.a.e))
        {
          this.nCv.d(paramInt1, paramInt2, paramString, paramk);
        }
        else if (!(paramk instanceof com.tencent.mm.plugin.offline.a.j))
        {
          if ((paramk instanceof com.tencent.mm.plugin.offline.a.f)) {
            this.nAa = null;
          } else if (((paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.f)) && (this.nCn != null) && (this.nCn.isShowing())) {
            this.nCn.dismiss();
          }
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6216830943232L, 46319);
    int i = a.g.sPG;
    GMTrace.o(6216830943232L, 46319);
    return i;
  }
  
  public final void k(final String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6218575773696L, 46332);
    if ((TextUtils.isEmpty(paramString)) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(6218575773696L, 46332);
      return;
    }
    final ImageView localImageView = (ImageView)this.nBR.get(paramString);
    paramString = (Integer)this.nBS.get(paramString);
    if ((localImageView == null) || (paramString == null))
    {
      GMTrace.o(6218575773696L, 46332);
      return;
    }
    new ae(getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20868440784896L, 155482);
        int i = paramString.intValue();
        Bitmap localBitmap = com.tencent.mm.sdk.platformtools.d.a(paramBitmap, i, i, true, false);
        localImageView.setImageBitmap(localBitmap);
        GMTrace.o(20868440784896L, 155482);
      }
    });
    GMTrace.o(6218575773696L, 46332);
  }
  
  public final void m(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(6220186386432L, 46344);
    b(new com.tencent.mm.plugin.offline.a.e(paramInt, paramString1, paramString2), com.tencent.mm.plugin.offline.c.a.aVT());
    GMTrace.o(6220186386432L, 46344);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6215757201408L, 46311);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.offline.k.nAn = true;
    com.tencent.mm.wallet_core.ui.e.EQ(41);
    paramBundle = getIntent();
    this.nCr = paramBundle.getBooleanExtra("is_offline_create", false);
    if ((paramBundle != null) && (paramBundle.hasExtra("key_entry_scene"))) {
      this.gGg = paramBundle.getIntExtra("key_entry_scene", this.gGg);
    }
    this.nCd = bg.aq(paramBundle.getStringExtra("key_business_attach"), "");
    this.kSi = 1;
    if (this.gGg == 2)
    {
      this.kSi = 1;
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
      sv(0);
      cN().cO().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.smU)));
      paramBundle = cN().cO().getCustomView();
      if (paramBundle != null)
      {
        View localView = paramBundle.findViewById(a.f.divider);
        if (localView != null) {
          localView.setBackgroundColor(getResources().getColor(a.c.aNX));
        }
        paramBundle = paramBundle.findViewById(16908309);
        if ((paramBundle != null) && ((paramBundle instanceof TextView))) {
          ((TextView)paramBundle).setTextColor(getResources().getColor(a.c.white));
        }
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(Integer.MIN_VALUE);
        paramBundle.setStatusBarColor(getResources().getColor(a.c.smV));
      }
      paramBundle = getWindow().getAttributes();
      if (paramBundle.screenBrightness < 0.85F)
      {
        paramBundle.screenBrightness = 0.85F;
        getWindow().setAttributes(paramBundle);
      }
      com.tencent.mm.wallet_core.ui.e.cmt();
      b(new com.tencent.mm.plugin.wallet_core.c.o(null, 8), false);
      if (!com.tencent.mm.plugin.wallet_core.model.n.byx().byR()) {
        break label544;
      }
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "coin purse onCreate data is invalid");
    }
    for (;;)
    {
      MP();
      com.tencent.mm.platformtools.j.a(this);
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.aVj().a(this);
      hN(606);
      hN(609);
      hN(1501);
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.aVk().bm(this);
      com.tencent.mm.sdk.b.a.vgX.b(this.nCE);
      com.tencent.mm.plugin.offline.c.a.aWe();
      com.tencent.mm.sdk.b.a.vgX.a(this.nCC);
      com.tencent.mm.sdk.b.a.vgX.a(this.nCB);
      com.tencent.mm.sdk.b.a.vgX.a(this.nCy);
      this.nCz.bPu();
      this.nCA.bPu();
      this.nCq = new com.tencent.mm.plugin.offline.g();
      GMTrace.o(6215757201408L, 46311);
      return;
      if (this.gGg == 1)
      {
        this.kSi = 2;
        break;
      }
      if (this.gGg == 8)
      {
        this.kSi = 4;
        break;
      }
      if (this.gGg == 4)
      {
        this.kSi = 6;
        break;
      }
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %d", new Object[] { Integer.valueOf(this.kSi) });
      break;
      label544:
      if (com.tencent.mm.plugin.wallet_core.model.n.byx().byP())
      {
        w.e("MicroMsg.WalletOfflineCoinPurseUI", "coin purse onCreate data is isUnreg");
        com.tencent.mm.plugin.offline.c.a.aWd();
        com.tencent.mm.plugin.offline.k.aVi();
        com.tencent.mm.plugin.offline.k.ai(196648, "0");
      }
      else if ((com.tencent.mm.plugin.wallet_core.model.n.byx().byS()) && (com.tencent.mm.plugin.offline.c.a.aVS()))
      {
        aVQ();
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(6216562507776L, 46317);
    com.tencent.mm.plugin.offline.k.nAn = false;
    com.tencent.mm.wallet_core.ui.e.u(this.nBT);
    com.tencent.mm.wallet_core.ui.e.u(this.nBU);
    com.tencent.mm.wallet_core.ui.e.an(this.nCs);
    com.tencent.mm.wallet_core.ui.e.an(this.nCt);
    this.nCs.clear();
    this.nCt.clear();
    this.nBW.clear();
    this.nBX.clear();
    this.nBY.clear();
    com.tencent.mm.platformtools.j.c(this);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.aVj().b(this);
    hO(606);
    hO(609);
    hO(1501);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.aVk().bn(this);
    com.tencent.mm.sdk.b.a.vgX.c(this.nCE);
    com.tencent.mm.sdk.b.a.vgX.c(this.nCC);
    com.tencent.mm.sdk.b.a.vgX.c(this.nCy);
    if (!this.nAd.bQn()) {
      this.nAd.stopTimer();
    }
    if (!this.nCH.bQn()) {
      this.nCH.stopTimer();
    }
    if (this.nCu != null) {
      this.nCu.release();
    }
    if (this.nCv != null)
    {
      localObject = this.nCv;
      ((c)localObject).jsv.cancel();
      ((c)localObject).mActivity = null;
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.nCB);
    this.nCz.dead();
    this.nCA.dead();
    Object localObject = this.nCq;
    ((com.tencent.mm.plugin.offline.g)localObject).stop();
    com.tencent.mm.plugin.offline.g.aVf();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(385, ((com.tencent.mm.plugin.offline.g)localObject).nzN);
    ((com.tencent.mm.plugin.offline.g)localObject).nzP = null;
    super.onDestroy();
    GMTrace.o(6216562507776L, 46317);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6220723257344L, 46348);
    if ((paramInt == 4) && (this.nCw != null) && (this.nCw.getVisibility() == 0) && (this.nCw.nBB))
    {
      this.nCw.dismiss();
      GMTrace.o(6220723257344L, 46348);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6220723257344L, 46348);
    return bool;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(6216294072320L, 46315);
    super.onNewIntent(paramIntent);
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: on new intent");
    GMTrace.o(6216294072320L, 46315);
  }
  
  public void onPause()
  {
    GMTrace.i(6216428290048L, 46316);
    com.tencent.mm.plugin.offline.k.aVi();
    i locali = com.tencent.mm.plugin.offline.k.aVl();
    locali.mHandler.removeCallbacks(locali.nAb);
    au.a(null);
    this.kmw = false;
    com.tencent.mm.sdk.b.a.vgX.c(this.nCD);
    this.nCq.stop();
    super.onPause();
    GMTrace.o(6216428290048L, 46316);
  }
  
  public void onResume()
  {
    GMTrace.i(6216025636864L, 46313);
    super.onResume();
    com.tencent.mm.sdk.b.a.vgX.b(this.nCD);
    au.a(this);
    if (!this.nCx)
    {
      aVB();
      this.nCx = true;
    }
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: on resume");
    this.kmw = true;
    Object localObject = (com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class);
    ((com.tencent.mm.plugin.walletlock.a.b)localObject).a(this, ((com.tencent.mm.plugin.walletlock.a.b)localObject).bAq(), null);
    if (com.tencent.mm.sdk.platformtools.am.isNetworkConnected(getBaseContext()))
    {
      if (com.tencent.mm.plugin.wallet_core.model.n.byx().byR()) {
        r(new com.tencent.mm.plugin.wallet_core.c.o(null, 8));
      }
      if (com.tencent.mm.plugin.offline.c.a.aVS())
      {
        com.tencent.mm.plugin.offline.k.aVi();
        com.tencent.mm.plugin.offline.k.aVl().gw(false);
        if (!c.aVy()) {
          aVI();
        }
      }
    }
    aVE();
    localObject = com.tencent.mm.plugin.offline.c.a.aVU();
    if ((localObject != null) && (((Bankcard)localObject).field_bindSerial != null) && (!((Bankcard)localObject).field_bindSerial.equals(this.nzv)))
    {
      this.nzv = ((Bankcard)localObject).field_bindSerial;
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.aVk().nzv = this.nzv;
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "onresume BindSerial isChange");
        aVJ();
        sh(0);
        gx(true);
      }
      localObject = this.nCq;
      if (!com.tencent.mm.plugin.offline.c.a.aWu()) {
        break label398;
      }
      w.i(com.tencent.mm.plugin.offline.g.TAG, "OFFLINEGETMSGLOGIN START; IS stopped=" + ((com.tencent.mm.plugin.offline.g)localObject).nzP.bQn());
      if ((((com.tencent.mm.plugin.offline.g)localObject).nzP != null) && (!((com.tencent.mm.plugin.offline.g)localObject).nzP.bQn())) {
        break label407;
      }
      ((com.tencent.mm.plugin.offline.g)localObject).status = 1;
      com.tencent.mm.plugin.report.service.g.ork.a(135L, 61L, 1L, true);
      if (!((com.tencent.mm.plugin.offline.g)localObject).nzO) {
        break;
      }
      com.tencent.mm.plugin.offline.g.aVf();
      localObject = ((com.tencent.mm.plugin.offline.g)localObject).nzP;
      l = com.tencent.mm.plugin.offline.g.nzy;
      ((aj)localObject).z(l, l);
      i = com.tencent.mm.plugin.offline.g.nzy;
      GMTrace.o(6216025636864L, 46313);
      return;
    }
    localObject = ((com.tencent.mm.plugin.offline.g)localObject).nzP;
    long l = com.tencent.mm.plugin.offline.g.nzM;
    ((aj)localObject).z(l, l);
    i = com.tencent.mm.plugin.offline.g.nzM;
    GMTrace.o(6216025636864L, 46313);
    return;
    label398:
    w.i(com.tencent.mm.plugin.offline.g.TAG, "OfflineGetMsg is not in abtest");
    label407:
    GMTrace.o(6216025636864L, 46313);
  }
  
  final class a
    extends BaseAdapter
  {
    ArrayList<String> iFZ;
    ArrayList<Boolean> nDc;
    
    public a()
    {
      GMTrace.i(6209448968192L, 46264);
      this.iFZ = new ArrayList();
      this.nDc = new ArrayList();
      GMTrace.o(6209448968192L, 46264);
    }
    
    public final int getCount()
    {
      GMTrace.i(6209583185920L, 46265);
      int i = this.iFZ.size();
      GMTrace.o(6209583185920L, 46265);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(6209717403648L, 46266);
      Object localObject = this.iFZ.get(paramInt);
      GMTrace.o(6209717403648L, 46266);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6209851621376L, 46267);
      long l = paramInt;
      GMTrace.o(6209851621376L, 46267);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6210120056832L, 46269);
      paramView = (CheckedTextView)View.inflate(WalletOfflineCoinPurseUI.this, a.g.sPy, null);
      paramView.setText((String)this.iFZ.get(paramInt));
      if (WalletOfflineCoinPurseUI.aVR() == paramInt)
      {
        paramView.setChecked(true);
        if (!isEnabled(paramInt)) {
          break label98;
        }
        paramView.setTextColor(WalletOfflineCoinPurseUI.this.getResources().getColor(a.c.aOE));
        paramView.setEnabled(true);
      }
      for (;;)
      {
        GMTrace.o(6210120056832L, 46269);
        return paramView;
        paramView.setChecked(false);
        break;
        label98:
        paramView.setTextColor(WalletOfflineCoinPurseUI.this.getResources().getColor(a.c.aOa));
        paramView.setEnabled(false);
      }
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(6209985839104L, 46268);
      boolean bool = ((Boolean)this.nDc.get(paramInt)).booleanValue();
      GMTrace.o(6209985839104L, 46268);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\ui\WalletOfflineCoinPurseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */