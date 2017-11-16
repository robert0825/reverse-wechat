package com.tencent.mm.plugin.mall.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ne;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.plugin.wallet_core.model.z;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.y.q;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public abstract class MallIndexBaseUI
  extends WalletBaseUI
  implements j.a, i
{
  protected String lOv;
  private String mMp;
  private String mRd;
  private ArrayList<MallFunction> mRe;
  protected int mRi;
  private TextView mSg;
  protected ListView mSh;
  private b mSi;
  protected ImageView mSj;
  protected ImageView mSk;
  protected TextView mSl;
  protected TextView mSm;
  private int mSn;
  private boolean mSp;
  private boolean mSq;
  
  public MallIndexBaseUI()
  {
    GMTrace.i(7995081621504L, 59568);
    this.mSg = null;
    this.mSh = null;
    this.mSi = null;
    this.mSj = null;
    this.mSl = null;
    this.mRe = null;
    this.mSn = 0;
    this.mRd = null;
    this.mMp = null;
    this.mSp = true;
    this.mSq = false;
    GMTrace.o(7995081621504L, 59568);
  }
  
  private void aNi()
  {
    GMTrace.i(14313112731648L, 106641);
    boolean bool = getIntent().getBooleanExtra("key_wallet_has_red", false);
    if (this.mSh.getChildCount() == 0)
    {
      GMTrace.o(14313112731648L, 106641);
      return;
    }
    int i = this.mSh.getFirstVisiblePosition();
    int j = this.mSh.getChildAt(0).getTop();
    w.i("MicroMsg.MallIndexBaseUI", "initCheckNew %s fpos %s top %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
    if ((i == 0) && (j == 0))
    {
      if (!bool)
      {
        GMTrace.o(14313112731648L, 106641);
        return;
      }
      if (this.mSq)
      {
        GMTrace.o(14313112731648L, 106641);
        return;
      }
      if (this.mRe == null)
      {
        GMTrace.o(14313112731648L, 106641);
        return;
      }
      this.mSq = true;
      j = this.mSh.getHeaderViewsCount();
      int k = this.mSi.getCount();
      List localList = this.mSi.mRD;
      if (localList == null)
      {
        GMTrace.o(14313112731648L, 106641);
        return;
      }
      i = localList.size();
      k += j;
      i -= 1;
      while (i > 0)
      {
        Iterator localIterator = ((ArrayList)localList.get(i)).iterator();
        while (localIterator.hasNext())
        {
          b.c localc = (b.c)localIterator.next();
          if ((localc != null) && (localc.mSe != null) && (b.a(localc.mSe)))
          {
            i = this.mSh.getFirstVisiblePosition();
            j = this.mSh.getLastVisiblePosition();
            w.i("MicroMsg.MallIndexBaseUI", "get listview show top %s bottom %s redPos: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
            if ((k >= i) && (k <= j))
            {
              GMTrace.o(14313112731648L, 106641);
              return;
            }
            int m = a.aNb();
            j = a.aNa() + a.aMZ() * (k + 1) + m;
            i = j;
            if (k > 2) {
              i = j + m;
            }
            j = i;
            if (k > 3) {
              j = i + m;
            }
            m = a.aMZ() / 3;
            int n = this.mSh.getScrollY();
            k = com.tencent.mm.ui.ad.ff(this).y;
            i = k;
            if (com.tencent.mm.ui.ad.fe(this)) {
              i = k - com.tencent.mm.ui.ad.fd(this);
            }
            k = i;
            if (cN().cO() != null) {
              k = i - cN().cO().getHeight();
            }
            this.mSh.smoothScrollBy(j + m - n - k, 1000);
            GMTrace.o(14313112731648L, 106641);
            return;
          }
        }
        k -= 1;
        i -= 1;
      }
    }
    GMTrace.o(14313112731648L, 106641);
  }
  
  private void aNl()
  {
    GMTrace.i(7997363322880L, 59585);
    setResult(0);
    finish();
    GMTrace.o(7997363322880L, 59585);
  }
  
  private void aNo()
  {
    GMTrace.i(7998437064704L, 59593);
    if (q.zR())
    {
      com.tencent.mm.wallet_core.a.b(this.vKB.vKW, "PayURemittanceProcess", null);
      GMTrace.o(7998437064704L, 59593);
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putInt("pay_channel", 1);
    com.tencent.mm.wallet_core.a.b(this.vKB.vKW, "RemittanceProcess", localBundle);
    GMTrace.o(7998437064704L, 59593);
  }
  
  private MallFunction aT(List<MallFunction> paramList)
  {
    GMTrace.i(7996692234240L, 59580);
    if ((paramList == null) || (paramList.size() == 0) || (TextUtils.isEmpty(this.mRd)))
    {
      GMTrace.o(7996692234240L, 59580);
      return null;
    }
    int i = 0;
    while (i < paramList.size())
    {
      MallFunction localMallFunction = (MallFunction)paramList.get(i);
      if ((localMallFunction != null) && (this.mRd.equals(localMallFunction.odH)))
      {
        GMTrace.o(7996692234240L, 59580);
        return localMallFunction;
      }
      i += 1;
    }
    GMTrace.o(7996692234240L, 59580);
    return null;
  }
  
  private MallFunction aU(List<MallFunction> paramList)
  {
    GMTrace.i(7996826451968L, 59581);
    if ((paramList == null) || (paramList.size() == 0) || (TextUtils.isEmpty(this.mMp)))
    {
      GMTrace.o(7996826451968L, 59581);
      return null;
    }
    int i = 0;
    while (i < paramList.size())
    {
      MallFunction localMallFunction = (MallFunction)paramList.get(i);
      if ((localMallFunction != null) && (this.mMp.equals(localMallFunction.eYm)))
      {
        GMTrace.o(7996826451968L, 59581);
        return localMallFunction;
      }
      i += 1;
    }
    GMTrace.o(7996826451968L, 59581);
    return null;
  }
  
  private void ar()
  {
    GMTrace.i(7997497540608L, 59586);
    lg(true);
    b localb = this.mSi;
    Object localObject = this.mRe;
    localb.mRD.clear();
    if (localObject != null)
    {
      int i = 0;
      ArrayList localArrayList;
      while (i < ((ArrayList)localObject).size())
      {
        localArrayList = new ArrayList();
        int j = 0;
        while ((j < 3) && (i + j < ((ArrayList)localObject).size()))
        {
          if (j > 0)
          {
            int k = i + j - 1;
            if ((k >= 0) && (((MallFunction)((ArrayList)localObject).get(k)).type != ((MallFunction)((ArrayList)localObject).get(i + j)).type)) {
              break;
            }
          }
          b.c localc = new b.c(localb);
          localc.mSf = (i + j);
          localc.mSe = ((MallFunction)((ArrayList)localObject).get(i + j));
          localArrayList.add(localc);
          j += 1;
        }
        if (localArrayList.size() > 0) {
          localb.mRD.add(localArrayList);
        }
        i += j;
      }
      localb.mRG = 0;
      localb.mRH = 0;
      localObject = localb.mRD.iterator();
      i = -1;
      if (((Iterator)localObject).hasNext())
      {
        localArrayList = (ArrayList)((Iterator)localObject).next();
        if (localArrayList.size() <= 0) {
          break label411;
        }
        if ((i == -1) || (i == ((b.c)localArrayList.get(0)).mSe.type))
        {
          localb.mRG += localArrayList.size();
          localb.mRH += 1;
          i = ((b.c)localArrayList.get(0)).mSe.type;
        }
      }
    }
    label411:
    for (;;)
    {
      break;
      localb.mRH -= 1;
      localb.mRh = com.tencent.mm.plugin.mall.a.d.aMY().qj(localb.mRi).mRh;
      localb.mRI = localb.aNc();
      localb.notifyDataSetChanged();
      aNn();
      aNp();
      if (this.mSg != null) {
        this.mSg.setVisibility(8);
      }
      aNq();
      GMTrace.o(7997497540608L, 59586);
      return;
    }
  }
  
  protected static void w(Activity paramActivity)
  {
    GMTrace.i(8000047677440L, 59605);
    if (n.byx().byW().byO())
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", "https://wx.tenpay.com/userroll/readtemplate?t=userroll/index_tmpl");
      com.tencent.mm.bj.d.b(paramActivity, "webview", ".ui.tools.WebViewUI", localIntent);
    }
    for (;;)
    {
      com.tencent.mm.wallet_core.ui.e.EQ(20);
      GMTrace.o(8000047677440L, 59605);
      return;
      com.tencent.mm.wallet_core.a.b(paramActivity, "ShowOrdersInfoProcess", null);
    }
  }
  
  public final void MP()
  {
    GMTrace.i(7998034411520L, 59590);
    w.d("MicroMsg.MallIndexBaseUI", "index initView");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8001926725632L, 59619);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.addFlags(67108864);
        paramAnonymousMenuItem.putExtra("preferred_tab", 3);
        com.tencent.mm.bj.d.a(MallIndexBaseUI.this, "com.tencent.mm.ui.LauncherUI", paramAnonymousMenuItem);
        MallIndexBaseUI.this.finish();
        com.tencent.mm.plugin.report.service.g.ork.i(14419, new Object[] { MallIndexBaseUI.this.lOv, Integer.valueOf(6) });
        w.i("MicroMsg.MallIndexBaseUI", "set BackBtn");
        GMTrace.o(8001926725632L, 59619);
        return true;
      }
    });
    a.d(this);
    this.mSh = ((ListView)findViewById(a.f.sAT));
    View localView = v.fb(this).inflate(a.g.sNl, null);
    this.mSh.addHeaderView(localView);
    AbsListView.LayoutParams localLayoutParams2 = (AbsListView.LayoutParams)localView.getLayoutParams();
    AbsListView.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new AbsListView.LayoutParams(-1, -2);
    }
    localLayoutParams1.height = a.aNa();
    localView.setLayoutParams(localLayoutParams1);
    this.mSi = new b(this, this.mRi);
    this.mSh.setAdapter(this.mSi);
    this.mSi.mRE = new b.d()
    {
      public final void a(final int paramAnonymousInt, final MallFunction paramAnonymousMallFunction)
      {
        GMTrace.i(8007563870208L, 59661);
        String str;
        int i;
        if (paramAnonymousMallFunction != null)
        {
          str = paramAnonymousMallFunction.odH;
          if (bg.nm(str)) {
            i = 1;
          }
        }
        for (;;)
        {
          if ((i == 0) && (!bg.nm(paramAnonymousMallFunction.rjM)))
          {
            w.i("MicroMsg.MallIndexBaseUI", "onFunctionItemClick show disclaimer funcId=%s", new Object[] { paramAnonymousMallFunction.odH });
            com.tencent.mm.ui.base.h.a(MallIndexBaseUI.this.vKB.vKW, paramAnonymousMallFunction.rjM, MallIndexBaseUI.this.getString(a.i.sWp), MallIndexBaseUI.this.getString(a.i.sYi), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                int j = 0;
                GMTrace.i(8002732032000L, 59625);
                String str1 = paramAnonymousMallFunction.odH;
                String str2;
                if (!bg.nm(str1))
                {
                  com.tencent.mm.kernel.h.xz();
                  str2 = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vth, null);
                  if (!bg.nm(str2)) {
                    break label105;
                  }
                }
                for (paramAnonymous2DialogInterface = str1;; paramAnonymous2DialogInterface = str1)
                {
                  com.tencent.mm.kernel.h.xz();
                  com.tencent.mm.kernel.h.xy().xh().a(w.a.vth, paramAnonymous2DialogInterface);
                  MallIndexBaseUI.this.a(paramAnonymousMallFunction, paramAnonymousInt);
                  GMTrace.o(8002732032000L, 59625);
                  return;
                  label105:
                  paramAnonymous2DialogInterface = str2.split(",");
                  if ((paramAnonymous2DialogInterface != null) && (paramAnonymous2DialogInterface.length != 0)) {
                    break;
                  }
                }
                paramAnonymous2Int = 0;
                for (;;)
                {
                  int i = j;
                  if (paramAnonymous2Int < paramAnonymous2DialogInterface.length)
                  {
                    if (paramAnonymous2DialogInterface[paramAnonymous2Int].equals(str1)) {
                      i = 1;
                    }
                  }
                  else
                  {
                    paramAnonymous2DialogInterface = str2;
                    if (i != 0) {
                      break;
                    }
                    paramAnonymous2DialogInterface = str2 + "," + str1;
                    break;
                  }
                  paramAnonymous2Int += 1;
                }
              }
            });
          }
          for (;;)
          {
            w.d("MicroMsg.MallIndexBaseUI", "type: %s", new Object[] { Integer.valueOf(paramAnonymousMallFunction.type) });
            com.tencent.mm.plugin.report.service.g.ork.i(14419, new Object[] { MallIndexBaseUI.this.lOv, Integer.valueOf(4), Integer.valueOf(paramAnonymousMallFunction.type) });
            GMTrace.o(8007563870208L, 59661);
            return;
            com.tencent.mm.kernel.h.xz();
            Object localObject = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vth, null);
            if (bg.nm((String)localObject))
            {
              i = 0;
              break;
            }
            localObject = ((String)localObject).split(",");
            if ((localObject == null) || (localObject.length == 0))
            {
              i = 0;
              break;
            }
            i = 0;
            for (;;)
            {
              if (i >= localObject.length) {
                break label310;
              }
              if (localObject[i].equals(str))
              {
                i = 1;
                break;
              }
              i += 1;
            }
            MallIndexBaseUI.this.a(paramAnonymousMallFunction, paramAnonymousInt);
          }
          w.w("MicroMsg.MallIndexBaseUI", "onFunctionItemClick functionItem null; pos=%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          GMTrace.o(8007563870208L, 59661);
          return;
          label310:
          i = 0;
        }
      }
    };
    cm(localView);
    this.mSm = ((TextView)findViewById(a.f.sqJ));
    aNm();
    GMTrace.o(7998034411520L, 59590);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7999108153344L, 59598);
    GMTrace.o(7999108153344L, 59598);
    return 1;
  }
  
  public void a(MallFunction paramMallFunction, int paramInt)
  {
    GMTrace.i(7996289581056L, 59577);
    Object localObject2;
    Object localObject1;
    int i;
    String str;
    if ((paramMallFunction != null) && (paramInt >= 0))
    {
      localObject2 = "";
      localObject1 = localObject2;
      if (paramMallFunction.rjL != null)
      {
        localObject1 = localObject2;
        if (!bg.nm(paramMallFunction.rjL.qrG)) {
          localObject1 = paramMallFunction.rjL.qrG;
        }
      }
      if (this.mRe != null) {
        break label246;
      }
      i = 0;
      boolean bool = b.a(paramMallFunction);
      localObject2 = com.tencent.mm.plugin.report.service.g.ork;
      str = paramMallFunction.odH;
      if (!bool) {
        break label257;
      }
    }
    label246:
    label257:
    for (int j = 2;; j = 1)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject2).i(10881, new Object[] { str, Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(paramInt), localObject1, Integer.valueOf(j) });
      if ((paramMallFunction == null) || (bg.nm(paramMallFunction.eYm)) || (!((com.tencent.mm.plugin.appbrand.k.d)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.d.class)).rc(paramMallFunction.eYm))) {
        break label263;
      }
      w.i("MicroMsg.MallIndexBaseUI", "handleFunction, intercept by AppBrandNativeLink, nativeUrl = %s", new Object[] { paramMallFunction.eYm });
      c.bzi().Kn(paramMallFunction.odH);
      com.tencent.mm.plugin.wallet_core.model.mall.d.bzm().Kn(paramMallFunction.odH);
      if (paramMallFunction.rjL != null)
      {
        c.bzi();
        c.c(paramMallFunction);
      }
      GMTrace.o(7996289581056L, 59577);
      return;
      i = this.mRe.size();
      break;
    }
    label263:
    if (paramMallFunction != null)
    {
      c.bzi().Kn(paramMallFunction.odH);
      com.tencent.mm.plugin.wallet_core.model.mall.d.bzm().Kn(paramMallFunction.odH);
      if (paramMallFunction.rjL != null)
      {
        c.bzi();
        c.c(paramMallFunction);
      }
      if ("wxpay://bizmall/mobile_recharge".equals(paramMallFunction.eYm))
      {
        paramInt = 0;
        w.i("MicroMsg.MallIndexBaseUI", "functionType : " + paramInt);
        switch (paramInt)
        {
        }
      }
    }
    for (;;)
    {
      GMTrace.o(7996289581056L, 59577);
      return;
      if ("wxpay://bizmall/weixin_hongbao".equals(paramMallFunction.eYm))
      {
        paramInt = 4;
        break;
      }
      if ("wxpay://bizmall/weixin_scan_qrcode".equals(paramMallFunction.eYm))
      {
        paramInt = 8;
        break;
      }
      if ("wxpay://bizmall/weixin_transfer".equals(paramMallFunction.eYm))
      {
        paramInt = 5;
        break;
      }
      if ("wxpay://bizmall/weixin_offline_pay".equals(paramMallFunction.eYm))
      {
        paramInt = 6;
        break;
      }
      if ("wxpay://bizmall/old_mobile_recharge".equals(paramMallFunction.eYm))
      {
        paramInt = 7;
        break;
      }
      if (!bg.nm(paramMallFunction.mci))
      {
        paramInt = 1;
        break;
      }
      if ("wxpay://bizmall/f2f_hongbao".equals(paramMallFunction.eYm))
      {
        paramInt = 9;
        break;
      }
      w.w("MicroMsg.MallIndexUIHelper", "doSelectFunction no jump");
      paramInt = 2;
      break;
      paramInt = 3;
      break;
      com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
      paramMallFunction = new Intent();
      paramMallFunction.putExtra("pay_channel", 1);
      com.tencent.mm.bj.d.b(this, "luckymoney", ".ui.LuckyMoneyIndexUI", paramMallFunction);
      com.tencent.mm.wallet_core.c.p.eP(13, 0);
      com.tencent.mm.plugin.report.service.g.ork.i(11850, new Object[] { Integer.valueOf(4), Integer.valueOf(0) });
      GMTrace.o(7996289581056L, 59577);
      return;
      localObject1 = new Intent();
      if (aNg()) {
        ((Intent)localObject1).putExtra("key_is_hide_progress", true);
      }
      ((Intent)localObject1).putExtra("key_func_info", paramMallFunction);
      com.tencent.mm.bj.d.b(this, "recharge", ".ui.PhoneRechargeUI", (Intent)localObject1);
      com.tencent.mm.wallet_core.c.p.eP(15, 0);
      GMTrace.o(7996289581056L, 59577);
      return;
      localObject1 = new Intent();
      if (aNg()) {
        ((Intent)localObject1).putExtra("key_is_hide_progress", true);
      }
      ((Intent)localObject1).putExtra("key_func_info", paramMallFunction);
      com.tencent.mm.bj.d.b(this, "recharge", ".ui.RechargeUI", (Intent)localObject1);
      GMTrace.o(7996289581056L, 59577);
      return;
      com.tencent.mm.kernel.h.xz();
      this.mRi = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vut, Integer.valueOf(0))).intValue();
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("rawUrl", paramMallFunction.mci);
      ((Intent)localObject1).putExtra("geta8key_username", q.zE());
      ((Intent)localObject1).putExtra("pay_channel", 1);
      ((Intent)localObject1).putExtra("KPublisherId", "pay_wallet");
      ((Intent)localObject1).putExtra("key_download_restrict", paramMallFunction.rjN);
      ((Intent)localObject1).putExtra("key_wallet_region", this.mRi);
      ((Intent)localObject1).putExtra("key_function_id", paramMallFunction.odH);
      ((Intent)localObject1).putExtra("geta8key_scene", 46);
      com.tencent.mm.bj.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject1);
      GMTrace.o(7996289581056L, 59577);
      return;
      w.w("MicroMsg.MallIndexBaseUI", "doSelectFunction no jump");
      GMTrace.o(7996289581056L, 59577);
      return;
      w.w("MicroMsg.MallIndexBaseUI", "doSelectFunction do nothing");
      u.makeText(this, "fuction list error", 1).show();
      GMTrace.o(7996289581056L, 59577);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(11458, new Object[] { Integer.valueOf(1) });
      if (q.zR())
      {
        paramMallFunction = new LinkedList();
        localObject1 = new LinkedList();
        paramMallFunction.add(getString(a.i.sYy));
        ((List)localObject1).add(Integer.valueOf(0));
        paramMallFunction.add(getString(a.i.sTb));
        ((List)localObject1).add(Integer.valueOf(1));
        com.tencent.mm.ui.base.h.a(this, getString(a.i.sXr), paramMallFunction, (List)localObject1, null, true, new h.d()
        {
          public final void bT(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(7992531484672L, 59549);
            switch (paramAnonymousInt2)
            {
            }
            for (;;)
            {
              GMTrace.o(7992531484672L, 59549);
              return;
              com.tencent.mm.plugin.report.service.g.ork.i(11458, new Object[] { Integer.valueOf(2) });
              if (q.zR())
              {
                com.tencent.mm.wallet_core.a.b(MallIndexBaseUI.this.vKB.vKW, "PayURemittanceProcess", null);
                GMTrace.o(7992531484672L, 59549);
                return;
              }
              com.tencent.mm.wallet_core.a.b(MallIndexBaseUI.this.vKB.vKW, "RemittanceProcess", null);
              GMTrace.o(7992531484672L, 59549);
              return;
              com.tencent.mm.plugin.report.service.g.ork.i(11458, new Object[] { Integer.valueOf(3) });
              com.tencent.mm.pluginsdk.wallet.g.R(MallIndexBaseUI.this, 2);
            }
          }
        });
      }
      for (;;)
      {
        com.tencent.mm.wallet_core.c.p.eP(14, 0);
        com.tencent.mm.plugin.report.service.g.ork.i(11850, new Object[] { Integer.valueOf(3), Integer.valueOf(0) });
        GMTrace.o(7996289581056L, 59577);
        return;
        com.tencent.mm.kernel.h.xz();
        if (!((Boolean)com.tencent.mm.kernel.h.xy().xh().get(w.a.vqL, Boolean.valueOf(false))).booleanValue())
        {
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().a(w.a.vqL, Boolean.valueOf(true));
          com.tencent.mm.ui.base.h.a(this, getString(a.i.tbW), "", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(8007026999296L, 59657);
              MallIndexBaseUI.a(MallIndexBaseUI.this);
              GMTrace.o(8007026999296L, 59657);
            }
          });
        }
        else
        {
          aNo();
        }
      }
      paramMallFunction = new Intent();
      paramMallFunction.putExtra("key_from_scene", 1);
      com.tencent.mm.bj.d.b(this.vKB.vKW, "offline", ".ui.WalletOfflineEntranceUI", paramMallFunction);
      com.tencent.mm.wallet_core.c.p.eP(9, 0);
      com.tencent.mm.plugin.report.service.g.ork.i(11850, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
      GMTrace.o(7996289581056L, 59577);
      return;
      paramMallFunction = new Intent();
      paramMallFunction.putExtra("BaseScanUI_select_scan_mode", 1);
      com.tencent.mm.bj.d.b(this.vKB.vKW, "scanner", ".ui.BaseScanUI", paramMallFunction);
      GMTrace.o(7996289581056L, 59577);
      return;
      com.tencent.mm.bj.d.x(this.vKB.vKW, "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
    }
  }
  
  protected abstract void aNd();
  
  protected abstract void aNe();
  
  protected abstract void aNf();
  
  public final boolean aNg()
  {
    GMTrace.i(7995886927872L, 59574);
    if ((!bg.nm(this.mRd)) || (!bg.nm(this.mMp)))
    {
      GMTrace.o(7995886927872L, 59574);
      return true;
    }
    GMTrace.o(7995886927872L, 59574);
    return false;
  }
  
  protected abstract boolean aNh();
  
  protected final boolean aNj()
  {
    GMTrace.i(7996960669696L, 59582);
    if (!aNg()) {
      ar();
    }
    GMTrace.o(7996960669696L, 59582);
    return true;
  }
  
  public final boolean aNk()
  {
    GMTrace.i(7997094887424L, 59583);
    GMTrace.o(7997094887424L, 59583);
    return false;
  }
  
  protected abstract void aNm();
  
  protected abstract void aNn();
  
  protected abstract void aNp();
  
  protected abstract void aNq();
  
  protected final void aNr()
  {
    GMTrace.i(7999645024256L, 59602);
    com.tencent.mm.bj.d.b(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
    GMTrace.o(7999645024256L, 59602);
  }
  
  protected abstract void cm(View paramView);
  
  public boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(7996558016512L, 59579);
    w.d("MicroMsg.MallIndexBaseUI", "onOtherSceneEnd");
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.b.a))
    {
      w.d("MicroMsg.MallIndexBaseUI", "hy: query bound scene end");
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (this.mSp)
        {
          this.mSp = false;
          if (n.byt().bzr().byP())
          {
            com.tencent.mm.wallet_core.a.b(this, "PayUOpenProcess", null);
            GMTrace.o(7996558016512L, 59579);
            return true;
          }
        }
      }
      else
      {
        finish();
        GMTrace.o(7996558016512L, 59579);
        return true;
      }
    }
    switch (paramk.getType())
    {
    default: 
      GMTrace.o(7996558016512L, 59579);
      return false;
    }
    paramString = (com.tencent.mm.plugin.mall.a.a)paramk;
    if (paramString.mRi != this.mRi) {
      w.i("MicroMsg.MallIndexBaseUI", "pass wallet local: %d cgi: %d", new Object[] { Integer.valueOf(this.mRi), Integer.valueOf(paramString.mRi) });
    }
    if (aNg())
    {
      w.d("MicroMsg.MallIndexBaseUI", "errorType:%d | errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramString.mRe != null) && (paramString.mRe.size() > 0)) {
        if (getIntent().getIntExtra("key_scene", 0) == 1)
        {
          paramString = aT(paramString.mRe);
          if (paramString != null) {
            a(paramString, -1);
          }
          setResult(-1);
          finish();
        }
      }
    }
    for (;;)
    {
      GMTrace.o(7996558016512L, 59579);
      return true;
      if (!bg.nm(this.mMp))
      {
        w.d("MicroMsg.MallIndexBaseUI", "NativeUrl: %s", new Object[] { this.mMp });
        paramString = aU(paramString.mRe);
        if (paramString != null)
        {
          a(paramString, -1);
          break;
        }
        aNl();
        GMTrace.o(7996558016512L, 59579);
        return true;
      }
      if ((paramString.mRe != null) && (paramString.mRe.size() > 0))
      {
        w.i("MicroMsg.MallIndexBaseUI", "functionScene.mFunctionList != null");
        a(aT(paramString.mRe), -1);
        break;
      }
      if ((com.tencent.mm.plugin.mall.a.d.aMY().qk(this.mRi) != null) && (com.tencent.mm.plugin.mall.a.d.aMY().qk(this.mRi).size() > 0))
      {
        w.i("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() != null");
        a(aT(com.tencent.mm.plugin.mall.a.d.aMY().qk(this.mRi)), -1);
        break;
      }
      w.e("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() == null");
      break;
      aNl();
      continue;
      if ((paramInt1 == 0) && (paramInt2 == 0) && (com.tencent.mm.plugin.mall.a.d.aMY().qk(this.mRi) != null) && (paramString.mRe != null) && (paramString.mRe.size() > 0))
      {
        this.mRe = com.tencent.mm.plugin.mall.a.d.aMY().qk(this.mRi);
        w.i("MicroMsg.MallIndexBaseUI", "get from server now! " + this.mRi + " " + this.mRe.size());
        c.bzi().U(this.mRe);
      }
      ar();
      aNi();
    }
  }
  
  protected final void fR(boolean paramBoolean)
  {
    GMTrace.i(20959708839936L, 156162);
    Intent localIntent = new Intent(this, MallIndexMenuUI.class);
    localIntent.putExtra("key_default_show_currency", paramBoolean);
    startActivity(localIntent);
    GMTrace.o(20959708839936L, 156162);
  }
  
  public void finish()
  {
    GMTrace.i(7998705500160L, 59595);
    super.finish();
    GMTrace.o(7998705500160L, 59595);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7995215839232L, 59569);
    int i = a.g.sNm;
    GMTrace.o(7995215839232L, 59569);
    return i;
  }
  
  public final void k(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(7997229105152L, 59584);
    GMTrace.o(7997229105152L, 59584);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7999376588800L, 59600);
    if (paramInt1 == 1)
    {
      com.tencent.mm.kernel.h.xz();
      this.mRi = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vut, Integer.valueOf(0))).intValue();
      if (paramInt2 == -1)
      {
        if (q.zS())
        {
          finish();
          GMTrace.o(7999376588800L, 59600);
          return;
        }
        finish();
        paramIntent = new ne();
        paramIntent.eSl.context = this.vKB.vKW;
        com.tencent.mm.sdk.b.a.vgX.m(paramIntent);
      }
    }
    GMTrace.o(7999376588800L, 59600);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7995350056960L, 59570);
    w.i("MicroMsg.MallIndexBaseUI", "onCreate");
    super.onCreate(paramBundle);
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      w.v("MicroMsg.MallIndexBaseUI", "MMCore is not ready");
      finish();
    }
    com.tencent.mm.kernel.h.xz();
    int i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vut, Integer.valueOf(0))).intValue();
    this.mRi = getIntent().getIntExtra("key_wallet_region", i);
    this.lOv = getIntent().getStringExtra("key_uuid");
    if (!bg.nm(this.lOv)) {
      this.lOv = UUID.randomUUID().toString();
    }
    hN(495);
    n.byE();
    z.a(this);
    this.mRd = getIntent().getStringExtra("key_func_id");
    w.i("MicroMsg.MallIndexBaseUI", "mFuncId:" + this.mRd + " wallet_region: " + this.mRi + " walletType: " + q.zL() + " default_region: " + i);
    this.mMp = getIntent().getStringExtra("key_native_url");
    w.i("MicroMsg.MallIndexBaseUI", "mNativeUrl:" + this.mMp);
    if (aNg())
    {
      GMTrace.o(7995350056960L, 59570);
      return;
    }
    sv(0);
    w.i("MicroMsg.MallIndexBaseUI", "index Oncreate");
    aNd();
    MP();
    c.bzl();
    aNe();
    w.i("MicroMsg.MallIndexBaseUI", "hy: use default controller for MallIndexUI");
    aNf();
    if (q.zR()) {
      w.e("MicroMsg.MallIndexBaseUI", "it is payu account ,not initFingerPrint");
    }
    for (;;)
    {
      com.tencent.mm.wallet_core.c.p.eP(1, 0);
      com.tencent.mm.plugin.report.service.g.ork.i(11850, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
      GMTrace.o(7995350056960L, 59570);
      return;
      paramBundle = (com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class);
      if (paramBundle != null)
      {
        w.i("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null, do showFingerPrintEntrance()");
        paramBundle.cp(this);
      }
      else
      {
        w.e("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null");
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7996423798784L, 59578);
    hO(495);
    n.byE();
    z.b(this);
    super.onDestroy();
    GMTrace.o(7996423798784L, 59578);
  }
  
  public void onResume()
  {
    int i = 1;
    GMTrace.i(7996021145600L, 59575);
    super.onResume();
    com.tencent.mm.pluginsdk.wallet.h.zJ(1);
    w.i("MicroMsg.MallIndexBaseUI", "index onResume");
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      w.v("MicroMsg.MallIndexBaseUI", "MMCore is not ready");
      finish();
    }
    if (aNg())
    {
      this.mRe = com.tencent.mm.plugin.mall.a.d.aMY().qk(this.mRi);
      if ((this.mRe == null) || (this.mRe.size() <= 0))
      {
        w.i("MicroMsg.MallIndexBaseUI", "mFunctionList == null");
        try
        {
          if ((getIntent().getIntExtra("key_scene", 0) == 1) || (!bg.nm(this.mMp)))
          {
            r(new com.tencent.mm.plugin.mall.a.a(this.mRi, com.tencent.mm.plugin.wallet_core.model.mall.b.bzh()));
            GMTrace.o(7996021145600L, 59575);
            return;
          }
          localObject3 = getIntent().getStringExtra("key_url");
          Object localObject1 = localObject3;
          if (localObject3 == null) {
            localObject1 = "";
          }
          r(new com.tencent.mm.plugin.mall.a.a(this.mRi, com.tencent.mm.plugin.wallet_core.model.mall.b.bzh(), getIntent().getStringExtra("key_app_id"), this.mRd, (String)localObject1));
          GMTrace.o(7996021145600L, 59575);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          w.printErrStackTrace("MicroMsg.MallIndexBaseUI", localUnsupportedEncodingException, "", new Object[0]);
          aNl();
          GMTrace.o(7996021145600L, 59575);
          return;
        }
      }
      Object localObject3 = aT(this.mRe);
      Object localObject2 = localObject3;
      if (localObject3 == null) {
        localObject2 = aU(this.mRe);
      }
      a((MallFunction)localObject2, -1);
      finish();
      GMTrace.o(7996021145600L, 59575);
      return;
    }
    aNh();
    w.d("MicroMsg.MallIndexBaseUI", "initFunctionList");
    if (com.tencent.mm.plugin.mall.a.d.aMY().qk(this.mRi) == null)
    {
      b(new com.tencent.mm.plugin.mall.a.a(this.mRi, com.tencent.mm.plugin.wallet_core.model.mall.b.bzh()), true);
      w.e("MicroMsg.MallIndexBaseUI", "funcitonlist invalid");
      i = 0;
    }
    for (;;)
    {
      if (i != 0)
      {
        w.i("MicroMsg.MallIndexBaseUI", "has data");
        ar();
      }
      GMTrace.o(7996021145600L, 59575);
      return;
      b(new com.tencent.mm.plugin.mall.a.a(this.mRi, com.tencent.mm.plugin.wallet_core.model.mall.b.bzh()), false);
      this.mRe = com.tencent.mm.plugin.mall.a.d.aMY().qk(this.mRi);
    }
  }
  
  public void onStop()
  {
    GMTrace.i(7997631758336L, 59587);
    super.onStop();
    GMTrace.o(7997631758336L, 59587);
  }
  
  public final void ql(int paramInt)
  {
    GMTrace.i(7999242371072L, 59599);
    if ((paramInt == 12) && (this.mSl != null)) {
      aNn();
    }
    GMTrace.o(7999242371072L, 59599);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\ui\MallIndexBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */