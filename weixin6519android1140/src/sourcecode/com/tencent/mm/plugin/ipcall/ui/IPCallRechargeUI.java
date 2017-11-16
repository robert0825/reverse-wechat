package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.ipcall.a.d.f;
import com.tencent.mm.plugin.ipcall.a.e.j;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.protocal.c.afl;
import com.tencent.mm.protocal.c.bqf;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.y.at;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class IPCallRechargeUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  TextView jXT;
  private int kqi;
  private String[] kqk;
  private h.a kqy;
  private ae mHandler;
  ProgressDialog moR;
  private String[] mrC;
  private String[] mrD;
  private String mrE;
  private String mrF;
  private boolean mrG;
  private int mrH;
  private int mrI;
  private String mrJ;
  private String mrK;
  private com.tencent.mm.plugin.ipcall.a.e.h mrL;
  private com.tencent.mm.plugin.ipcall.a.e.g mrM;
  private j mrN;
  RelativeLayout mrO;
  GridView mrP;
  ListView mrQ;
  a mrR;
  Button mrS;
  f mrT;
  
  public IPCallRechargeUI()
  {
    GMTrace.i(11712644251648L, 87266);
    this.mrG = false;
    this.kqi = -1;
    this.mrI = -1;
    this.mrL = new com.tencent.mm.plugin.ipcall.a.e.h();
    this.mrM = new com.tencent.mm.plugin.ipcall.a.e.g();
    this.mrN = new j();
    this.kqy = new h.a()
    {
      public final void x(ArrayList<com.tencent.mm.pluginsdk.model.p> paramAnonymousArrayList)
      {
        GMTrace.i(11626073817088L, 86621);
        IPCallRechargeUI.a(IPCallRechargeUI.this).mmA = System.currentTimeMillis();
        if ((paramAnonymousArrayList != null) && (paramAnonymousArrayList.size() > 0))
        {
          IPCallRechargeUI.a(IPCallRechargeUI.this, new String[paramAnonymousArrayList.size()]);
          IPCallRechargeUI.b(IPCallRechargeUI.this, new String[paramAnonymousArrayList.size()]);
          com.tencent.mm.pluginsdk.model.p localp = (com.tencent.mm.pluginsdk.model.p)paramAnonymousArrayList.get(0);
          if (localp.tni == 10232)
          {
            w.i("MicroMsg.IPCallRechargeUI", "OnGoogleQueryFinish Product OK size=" + paramAnonymousArrayList.size());
            paramAnonymousArrayList = paramAnonymousArrayList.iterator();
            int i = 0;
            while (paramAnonymousArrayList.hasNext())
            {
              localp = (com.tencent.mm.pluginsdk.model.p)paramAnonymousArrayList.next();
              BigDecimal localBigDecimal = new BigDecimal(localp.tnh).divide(new BigDecimal(1000000));
              IPCallRechargeUI.b(IPCallRechargeUI.this)[i] = localBigDecimal.toString();
              IPCallRechargeUI.c(IPCallRechargeUI.this)[i] = localp.tng;
              i += 1;
            }
            if ((IPCallRechargeUI.d(IPCallRechargeUI.this) > 0) && (IPCallRechargeUI.c(IPCallRechargeUI.this).length > 0))
            {
              paramAnonymousArrayList = IPCallRechargeUI.c(IPCallRechargeUI.this)[0];
              if ((!bg.nm(paramAnonymousArrayList)) && (!paramAnonymousArrayList.equals(IPCallRechargeUI.e(IPCallRechargeUI.this))))
              {
                w.i("MicroMsg.IPCallRechargeUI", "remote currency:" + IPCallRechargeUI.e(IPCallRechargeUI.this) + ",google wallet currency:" + paramAnonymousArrayList);
                IPCallRechargeUI.a(IPCallRechargeUI.this, paramAnonymousArrayList);
                GMTrace.o(11626073817088L, 86621);
                return;
              }
            }
            if ((IPCallRechargeUI.f(IPCallRechargeUI.this) != null) && (IPCallRechargeUI.f(IPCallRechargeUI.this).isShowing())) {
              IPCallRechargeUI.f(IPCallRechargeUI.this).dismiss();
            }
            IPCallRechargeUI.this.aJs();
            GMTrace.o(11626073817088L, 86621);
            return;
          }
          if ((IPCallRechargeUI.f(IPCallRechargeUI.this) != null) && (IPCallRechargeUI.f(IPCallRechargeUI.this).isShowing())) {
            IPCallRechargeUI.f(IPCallRechargeUI.this).dismiss();
          }
          IPCallRechargeUI.a(IPCallRechargeUI.this, localp.tni);
          w.i("MicroMsg.IPCallRechargeUI", "OnGoogleQueryFinish Product Failed Status:" + IPCallRechargeUI.g(IPCallRechargeUI.this));
          IPCallRechargeUI.this.aJs();
          GMTrace.o(11626073817088L, 86621);
          return;
        }
        if ((IPCallRechargeUI.f(IPCallRechargeUI.this) != null) && (IPCallRechargeUI.f(IPCallRechargeUI.this).isShowing())) {
          IPCallRechargeUI.f(IPCallRechargeUI.this).dismiss();
        }
        w.i("MicroMsg.IPCallRechargeUI", "[onQueryFinish] result=null");
        IPCallRechargeUI.a(IPCallRechargeUI.this, 10236);
        IPCallRechargeUI.this.aJs();
        GMTrace.o(11626073817088L, 86621);
      }
    };
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11675331723264L, 86988);
        switch (paramAnonymousMessage.what)
        {
        default: 
          w.w("MicroMsg.IPCallRechargeUI", "unknow message, cannt handle.");
          GMTrace.o(11675331723264L, 86988);
          return;
        }
        IPCallRechargeUI.this.mrQ.setVisibility(0);
        IPCallRechargeUI.k(IPCallRechargeUI.this);
        GMTrace.o(11675331723264L, 86988);
      }
    };
    GMTrace.o(11712644251648L, 87266);
  }
  
  private void AA(String paramString)
  {
    GMTrace.i(11713315340288L, 87271);
    Object localObject = com.tencent.mm.plugin.ipcall.a.c.aIa().aId();
    if (((List)localObject).size() == 0) {}
    for (localObject = a.AK(com.tencent.mm.plugin.ipcall.b.c.aJG());; localObject = a.AK(((Integer)((List)localObject).get(0)).toString()))
    {
      this.mrT = new f((String)localObject, paramString);
      at.wS().a(this.mrT, 0);
      GMTrace.o(11713315340288L, 87271);
      return;
    }
  }
  
  private boolean AB(String paramString)
  {
    GMTrace.i(11713717993472L, 87274);
    if (com.tencent.mm.k.g.ut().getInt("WCOSecondPurchaseSwitch", 0) > 0)
    {
      i = 1;
      if (i == 0) {
        break label153;
      }
    }
    label153:
    for (int i = 1;; i = 0)
    {
      if ((i == 0) || (this.mrI < 0)) {
        break label158;
      }
      final Object localObject = this.mrR.getItem(this.mrI);
      if ((!(localObject instanceof bqf)) || (bg.nm(((bqf)localObject).vat))) {
        break label158;
      }
      localObject = ((bqf)localObject).vat;
      w.i("MicroMsg.IPCallRechargeUI", "tryHandleShowWebViewPayDialog:" + (String)localObject);
      com.tencent.mm.ui.base.h.a(this, paramString, getString(R.l.dFn), getString(R.l.dEY), getString(R.l.cSk), true, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11716939218944L, 87298);
          com.tencent.mm.plugin.report.service.g.ork.a(257L, 3L, 1L, true);
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("rawUrl", localObject);
          paramAnonymousDialogInterface.putExtra("showShare", false);
          d.b(IPCallRechargeUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousDialogInterface);
          GMTrace.o(11716939218944L, 87298);
        }
      }, null);
      GMTrace.o(11713717993472L, 87274);
      return true;
      i = 0;
      break;
    }
    label158:
    GMTrace.o(11713717993472L, 87274);
    return false;
  }
  
  private void wl(String paramString)
  {
    GMTrace.i(11713583775744L, 87273);
    if (!TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, getString(R.l.dFn), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11654930628608L, 86836);
          GMTrace.o(11654930628608L, 86836);
        }
      });
      GMTrace.o(11713583775744L, 87273);
      return;
      paramString = getString(R.l.dFn);
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(11712778469376L, 87267);
    GMTrace.o(11712778469376L, 87267);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 0;
    GMTrace.i(11713852211200L, 87275);
    w.i("MicroMsg.IPCallRechargeUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
    if ((paramk instanceof f))
    {
      paramString = this.mrL;
      paramString.mmy = System.currentTimeMillis();
      paramString.mmz = paramInt2;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((f)paramk).mlH;
        this.mrR.lWy = paramString.uqN;
        this.mrR.mrX = paramString;
        this.mrR.notifyDataSetChanged();
        this.kqk = new String[paramString.uqN.size()];
        Iterator localIterator = paramString.uqN.iterator();
        paramInt1 = 0;
        while (localIterator.hasNext())
        {
          bqf localbqf = (bqf)localIterator.next();
          this.kqk[paramInt1] = localbqf.tRS;
          paramInt1 += 1;
        }
        this.mrJ = paramString.uva;
        this.mrK = paramString.uvb;
        this.mrE = paramString.uuV;
        this.mrF = paramString.uuZ;
        this.mrH = paramString.uuY;
        if (this.mrG)
        {
          this.mrD = new String[paramString.uqN.size()];
          paramInt1 = 0;
          while (paramInt1 < this.mrD.length)
          {
            this.mrD[paramInt1] = paramString.uuZ;
            paramInt1 += 1;
          }
          this.mrC = new String[paramString.uqN.size()];
          paramInt1 = i;
          while (paramInt1 < this.mrC.length)
          {
            this.mrC[paramInt1] = IPCallDynamicTextView.Az(((bqf)paramString.uqN.get(paramInt1)).uJL);
            paramInt1 += 1;
          }
        }
        if (((f)paramk).mlI)
        {
          w.i("MicroMsg.IPCallRechargeUI", "onSceneEnd IsUnkownCurency=true");
          if ((this.kqk != null) && (this.kqk.length > 0))
          {
            w.i("MicroMsg.IPCallRechargeUI", "startQueryGooglePrice");
            com.tencent.mm.pluginsdk.model.h.a(this, this.kqk, this.kqy);
          }
          GMTrace.o(11713852211200L, 87275);
          return;
        }
        if ((this.moR != null) && (this.moR.isShowing())) {
          this.moR.dismiss();
        }
        aJs();
        GMTrace.o(11713852211200L, 87275);
        return;
      }
      if ((this.moR != null) && (this.moR.isShowing())) {
        this.moR.dismiss();
      }
      Toast.makeText(this.vKB.vKW, getString(R.l.dEp), 0).show();
      finish();
    }
    GMTrace.o(11713852211200L, 87275);
  }
  
  public final void aJs()
  {
    GMTrace.i(11713986428928L, 87276);
    if (this.mHandler != null) {
      this.mHandler.sendEmptyMessage(1002);
    }
    GMTrace.o(11713986428928L, 87276);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11713181122560L, 87270);
    int i = R.i.cAz;
    GMTrace.o(11713181122560L, 87270);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11713449558016L, 87272);
    w.i("MicroMsg.IPCallRechargeUI", "onActivityResult. requestCode:[%d] resultCode:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    boolean bool1;
    int j;
    Object localObject;
    int i;
    if (paramInt1 == 2001)
    {
      bool1 = false;
      if (paramIntent == null) {
        break label1207;
      }
      j = paramIntent.getIntExtra("key_err_code", 0);
      localObject = paramIntent.getStringExtra("key_err_msg");
      long l = paramIntent.getLongExtra("key_launch_ts", 0L);
      i = paramIntent.getIntExtra("key_gw_error_code", 0);
      paramInt1 = paramIntent.getIntExtra("key_response_position", 0);
      if (j == 100000009) {
        bool1 = true;
      }
      w.i("MicroMsg.IPCallRechargeUI", "onActivityResult pay.errCode:[%d] errMsg:[%s] errGWCode:[%s] errPosition:[%d] isFailedConsume:[%s]", new Object[] { Integer.valueOf(j), localObject, Integer.valueOf(i), Integer.valueOf(paramInt1), String.valueOf(bool1) });
      if ((j == -1) && (i != 0))
      {
        this.mrM.mmu = i;
        if (paramInt1 != 3) {
          break label352;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(257L, 9L, 1L, true);
        com.tencent.mm.plugin.report.service.g.ork.a(257L, 11L, 1L, true);
        this.mrM.mmu = 0L;
        this.mrM.mmv = 2L;
        localObject = getString(R.l.dFS);
        label237:
        this.mrM.mmt = l;
        this.mrM.mmc = System.currentTimeMillis();
        this.mrM.finish();
      }
    }
    for (;;)
    {
      if (paramInt2 == -1)
      {
        if ((paramIntent != null) && (j == 0))
        {
          localObject = paramIntent.getStringArrayListExtra("key_response_product_ids");
          paramIntent.getStringArrayListExtra("key_response_series_ids");
          paramIntent = ((ArrayList)localObject).iterator();
          for (;;)
          {
            if (paramIntent.hasNext())
            {
              w.i("MicroMsg.IPCallRechargeUI", "buy product ok productId:", new Object[] { bg.nl((String)paramIntent.next()) });
              continue;
              this.mrM.mmu = j;
              break;
              label352:
              if (paramInt1 != 1)
              {
                if ((paramInt2 == -1) && (j == 0))
                {
                  com.tencent.mm.plugin.report.service.g.ork.a(257L, 9L, 1L, true);
                  break label237;
                }
                if (bool1)
                {
                  com.tencent.mm.plugin.report.service.g.ork.a(257L, 9L, 1L, true);
                  com.tencent.mm.plugin.report.service.g.ork.a(257L, 12L, 1L, true);
                  this.mrM.mmu = 0L;
                  this.mrM.mmv = 1L;
                }
              }
              break label237;
            }
          }
          com.tencent.mm.plugin.report.service.g.ork.a(257L, 6L, 1L, true);
          com.tencent.mm.plugin.report.service.g.ork.a(257L, 10L, 1L, true);
          Toast.makeText(this, R.l.dFo, 0).show();
          finish();
          GMTrace.o(11713449558016L, 87272);
          return;
        }
        if ((paramIntent != null) && (j == 103))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(257L, 6L, 1L, true);
          wl((String)localObject);
          GMTrace.o(11713449558016L, 87272);
          return;
        }
        if ((paramIntent != null) && (j == 109))
        {
          wl((String)localObject);
          GMTrace.o(11713449558016L, 87272);
          return;
        }
        if ((paramIntent != null) && (j == 100000000))
        {
          paramIntent = getString(R.l.dFm);
          com.tencent.mm.plugin.report.service.g.ork.a(257L, 8L, 1L, true);
          Toast.makeText(this, paramIntent, 0).show();
          GMTrace.o(11713449558016L, 87272);
          return;
        }
        if ((paramIntent != null) && (j == 113))
        {
          com.tencent.mm.ui.base.h.a(this, getString(R.l.dFf), getString(R.l.dFn), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(11691974721536L, 87112);
              IPCallRechargeUI.j(IPCallRechargeUI.this);
              GMTrace.o(11691974721536L, 87112);
            }
          });
          GMTrace.o(11713449558016L, 87272);
          return;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(257L, 7L, 1L, true);
        if (paramInt1 == 3)
        {
          wl((String)localObject);
          GMTrace.o(11713449558016L, 87272);
          return;
        }
        if ((j == 100000009) || (j == -1))
        {
          if (i == 0)
          {
            Toast.makeText(this, getString(R.l.dEp), 0).show();
            GMTrace.o(11713449558016L, 87272);
            return;
          }
          paramIntent = getString(R.l.dEr);
          if (!AB(paramIntent)) {
            Toast.makeText(this, paramIntent, 0).show();
          }
        }
      }
      GMTrace.o(11713449558016L, 87272);
      return;
      if (paramInt1 == 2002)
      {
        if ((this.moR != null) && (this.moR.isShowing())) {
          this.moR.dismiss();
        }
        localObject = "";
        i = 0;
        paramInt1 = 0;
        bool1 = false;
        boolean bool2 = false;
        if (paramIntent != null)
        {
          i = paramIntent.getIntExtra("key_err_code", 0);
          localObject = paramIntent.getStringExtra("key_err_msg");
          paramInt1 = paramIntent.getIntExtra("key_response_position", 0);
          bool1 = bool2;
          if (i == 100000009) {
            bool1 = true;
          }
          w.i("MicroMsg.IPCallRechargeUI", "onActivityResult restore.errCode:[%d] errMsg:[%s] errPosition:[%d] isFailedConsume:[%s]", new Object[] { Integer.valueOf(i), localObject, Integer.valueOf(paramInt1), String.valueOf(bool1) });
        }
        this.mrN.mmD = i;
        this.mrN.mmB = 0L;
        if (paramInt2 != -1) {
          break label1175;
        }
        if ((paramIntent == null) || (i != 0)) {
          break label1073;
        }
        paramIntent = paramIntent.getStringArrayListExtra("key_response_product_ids");
        if ((paramIntent == null) || (paramIntent.size() <= 0)) {
          break label1041;
        }
        this.mrN.mmC = 0L;
        com.tencent.mm.plugin.report.service.g.ork.a(257L, 15L, 1L, true);
        w.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore ok");
        com.tencent.mm.ui.base.h.a(this, getString(R.l.dFC), getString(R.l.dFD), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11674257981440L, 86980);
            IPCallRechargeUI.this.finish();
            GMTrace.o(11674257981440L, 86980);
          }
        });
      }
      for (;;)
      {
        this.mrN.mmc = System.currentTimeMillis();
        this.mrN.finish();
        GMTrace.o(11713449558016L, 87272);
        return;
        label1041:
        this.mrN.mmC = 3L;
        w.i("MicroMsg.IPCallRechargeUI", "onActivityResult. no product can be restored");
        Toast.makeText(this, R.l.dFB, 0).show();
        continue;
        label1073:
        if (bool1)
        {
          this.mrN.mmC = 1L;
          com.tencent.mm.plugin.report.service.g.ork.a(257L, 17L, 1L, true);
          localObject = getString(R.l.dFB);
        }
        for (;;)
        {
          w.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore not ok");
          Toast.makeText(this, (CharSequence)localObject, 0).show();
          break;
          if (paramInt1 == 3)
          {
            this.mrN.mmC = 2L;
            com.tencent.mm.plugin.report.service.g.ork.a(257L, 16L, 1L, true);
          }
          else
          {
            this.mrN.mmC = 2L;
          }
        }
        label1175:
        this.mrN.mmC = 2L;
        w.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore failed");
        Toast.makeText(this, R.l.dFA, 0).show();
      }
      label1207:
      i = 0;
      paramInt1 = 0;
      j = 0;
      localObject = "";
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11712912687104L, 87268);
    super.onCreate(paramBundle);
    at.wS().a(929, this);
    oM(R.l.dEC);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11705530712064L, 87213);
        IPCallRechargeUI.this.finish();
        GMTrace.o(11705530712064L, 87213);
        return true;
      }
    });
    a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11630771437568L, 86656);
        IPCallRechargeUI.h(IPCallRechargeUI.this);
        GMTrace.o(11630771437568L, 86656);
        return true;
      }
    });
    this.mrO = ((RelativeLayout)findViewById(R.h.layout));
    this.mrP = ((GridView)findViewById(R.h.bXn));
    this.mrQ = ((ListView)findViewById(R.h.bXp));
    paramBundle = (ViewGroup)View.inflate(this.vKB.vKW, R.i.cAx, null);
    this.mrQ.addFooterView(paramBundle, null, false);
    this.mrR = new a(this);
    this.mrQ.setAdapter(this.mrR);
    this.jXT = ((TextView)paramBundle.findViewById(R.h.chy));
    this.mrS = ((Button)findViewById(R.h.biJ));
    paramBundle = getString(R.l.dEH);
    Spannable localSpannable = Spannable.Factory.getInstance().newSpannable(paramBundle);
    localSpannable.setSpan(new ClickableSpan()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11640032460800L, 86725);
        ((TextView)paramAnonymousView).setHighlightColor(IPCallRechargeUI.this.getResources().getColor(R.e.transparent));
        Intent localIntent = new Intent();
        paramAnonymousView = IPCallRechargeUI.this.getString(R.l.dEG) + "&usedcc=";
        Object localObject = com.tencent.mm.plugin.ipcall.a.c.aIa().aId();
        int j;
        if (((List)localObject).size() > 0)
        {
          j = ((List)localObject).size();
          int i = j;
          if (j > 5) {
            i = 5;
          }
          j = 0;
          if (j < i)
          {
            String str = a.AK(((Integer)((List)localObject).get(j)).toString());
            if (bg.nm(str)) {
              break label261;
            }
            paramAnonymousView = paramAnonymousView + str + "|";
          }
        }
        label261:
        for (;;)
        {
          j += 1;
          break;
          localObject = paramAnonymousView;
          if (paramAnonymousView.endsWith("|")) {}
          for (localObject = paramAnonymousView.substring(0, paramAnonymousView.length() - 1);; localObject = paramAnonymousView + a.AK(com.tencent.mm.plugin.ipcall.b.c.aJG()))
          {
            localIntent.putExtra("rawUrl", (String)localObject);
            localIntent.putExtra("showShare", false);
            d.b(IPCallRechargeUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
            GMTrace.o(11640032460800L, 86725);
            return;
          }
        }
      }
      
      public final void updateDrawState(TextPaint paramAnonymousTextPaint)
      {
        GMTrace.i(11640166678528L, 86726);
        paramAnonymousTextPaint.setColor(IPCallRechargeUI.this.getResources().getColor(R.e.aOm));
        paramAnonymousTextPaint.setUnderlineText(false);
        GMTrace.o(11640166678528L, 86726);
      }
    }, 0, paramBundle.length(), 33);
    this.jXT.setText(localSpannable);
    this.jXT.setMovementMethod(LinkMovementMethod.getInstance());
    paramBundle = this.vKB.vKW;
    getString(R.l.cUG);
    this.moR = com.tencent.mm.ui.base.h.a(paramBundle, getString(R.l.dEs), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11630100348928L, 86651);
        try
        {
          if (IPCallRechargeUI.this.mrT != null) {
            at.wS().c(IPCallRechargeUI.this.mrT);
          }
          IPCallRechargeUI.this.finish();
          GMTrace.o(11630100348928L, 86651);
          return;
        }
        catch (Exception paramAnonymousDialogInterface)
        {
          w.e("MicroMsg.IPCallRechargeUI", "cancel getProductListScene error: %s", new Object[] { paramAnonymousDialogInterface.getMessage() });
          GMTrace.o(11630100348928L, 86651);
        }
      }
    });
    AA("");
    this.mrL.start();
    com.tencent.mm.plugin.report.service.g.ork.a(257L, 4L, 1L, true);
    GMTrace.o(11712912687104L, 87268);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11713046904832L, 87269);
    super.onDestroy();
    this.mrL.mmc = System.currentTimeMillis();
    this.mrL.finish();
    at.wS().b(929, this);
    GMTrace.o(11713046904832L, 87269);
  }
  
  private static final class a
    extends BaseAdapter
  {
    List<bqf> lWy;
    private IPCallRechargeUI mrW;
    afl mrX;
    
    public a(IPCallRechargeUI paramIPCallRechargeUI)
    {
      GMTrace.i(11623926333440L, 86605);
      this.lWy = null;
      this.mrW = null;
      this.mrX = null;
      if (paramIPCallRechargeUI != null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        this.mrW = paramIPCallRechargeUI;
        GMTrace.o(11623926333440L, 86605);
        return;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(11624060551168L, 86606);
      if (this.lWy == null)
      {
        GMTrace.o(11624060551168L, 86606);
        return 0;
      }
      int i = this.lWy.size();
      GMTrace.o(11624060551168L, 86606);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(11624194768896L, 86607);
      if (this.lWy != null)
      {
        Object localObject = this.lWy.get(paramInt);
        GMTrace.o(11624194768896L, 86607);
        return localObject;
      }
      GMTrace.o(11624194768896L, 86607);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11624328986624L, 86608);
      long l = paramInt;
      GMTrace.o(11624328986624L, 86608);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11624597422080L, 86610);
      if (paramView == null)
      {
        paramView = ((LayoutInflater)this.mrW.getSystemService("layout_inflater")).inflate(R.i.cAy, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.mrb = ((TextView)paramView.findViewById(R.h.ciw));
        paramViewGroup.mrZ = ((TextView)paramView.findViewById(R.h.civ));
        paramViewGroup.msa = ((TextView)paramView.findViewById(R.h.ciu));
        paramViewGroup.msb = ((TextView)paramView.findViewById(R.h.cit));
        paramViewGroup.msc = ((Button)paramView.findViewById(R.h.bix));
        paramView.setTag(paramViewGroup);
      }
      bqf localbqf;
      for (;;)
      {
        localbqf = (bqf)getItem(paramInt);
        if (localbqf != null) {
          break;
        }
        GMTrace.o(11624597422080L, 86610);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      paramViewGroup.mrb.setText(localbqf.uJL);
      paramViewGroup.mrZ.setText(localbqf.vaq);
      paramViewGroup.msa.setText(localbqf.var);
      if (bg.nm(localbqf.var)) {
        paramViewGroup.msa.setVisibility(8);
      }
      for (;;)
      {
        if (this.mrX != null) {
          paramViewGroup.msb.setText(String.format(this.mrW.getString(R.l.dEF), new Object[] { a.AI(this.mrX.uuV), String.valueOf(localbqf.vao) }));
        }
        paramViewGroup.msc.setTag(Integer.valueOf(paramInt));
        paramViewGroup.msc.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(11637616541696L, 86707);
            IPCallRechargeUI.b(IPCallRechargeUI.this, ((Integer)paramAnonymousView.getTag()).intValue());
            GMTrace.o(11637616541696L, 86707);
          }
        });
        GMTrace.o(11624597422080L, 86610);
        return paramView;
        paramViewGroup.msa.setVisibility(0);
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(11624463204352L, 86609);
      GMTrace.o(11624463204352L, 86609);
      return 2;
    }
    
    private final class a
    {
      TextView mrZ;
      TextView mrb;
      TextView msa;
      TextView msb;
      Button msc;
      
      public a()
      {
        GMTrace.i(11655467499520L, 86840);
        GMTrace.o(11655467499520L, 86840);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallRechargeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */