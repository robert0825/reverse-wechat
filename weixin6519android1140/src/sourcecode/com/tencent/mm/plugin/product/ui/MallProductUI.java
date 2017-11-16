package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.mb;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.product.b.n.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.b;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MallProductUI
  extends MallBaseUI
  implements j.a
{
  private TextView jXT;
  private Button kES;
  protected com.tencent.mm.plugin.product.b.c nJB;
  private HtmlTextView nJg;
  private ListView nKJ;
  private a nKK;
  private LinearLayout nKM;
  private LinearLayout nKN;
  private ImageView nKO;
  private TextView nKP;
  private HtmlTextView nKQ;
  private RelativeLayout nKR;
  private ListView nKS;
  private k nKT;
  private Button nKU;
  private TextView nKe;
  private f nKk;
  
  public MallProductUI()
  {
    GMTrace.i(5998861352960L, 44695);
    this.nKT = null;
    GMTrace.o(5998861352960L, 44695);
  }
  
  protected final void MP()
  {
    GMTrace.i(5999532441600L, 44700);
    oM(a.i.sWd);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6013759520768L, 44806);
        paramAnonymousMenuItem = MallProductUI.e(MallProductUI.this);
        if (!bg.nm(paramAnonymousMenuItem.nJB.nHE))
        {
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.plugin.product.b.f(paramAnonymousMenuItem.nJB.aXm(), paramAnonymousMenuItem.nJB.nHE), 0);
        }
        paramAnonymousMenuItem.nJB.clear();
        MallProductUI.this.finish();
        GMTrace.o(6013759520768L, 44806);
        return true;
      }
    });
    this.nKM = ((LinearLayout)findViewById(a.f.sBz));
    this.nKN = ((LinearLayout)findViewById(a.f.sBU));
    this.nKO = ((ImageView)findViewById(a.f.sBx));
    this.jXT = ((TextView)findViewById(a.f.sBt));
    this.nKe = ((TextView)findViewById(a.f.sBC));
    this.nKP = ((TextView)findViewById(a.f.sBA));
    this.nKP.getPaint().setFlags(16);
    this.nKR = ((RelativeLayout)findViewById(a.f.sBv));
    this.nJg = ((HtmlTextView)findViewById(a.f.sBu));
    this.nKQ = ((HtmlTextView)findViewById(a.f.sBB));
    this.nKJ = ((ListView)findViewById(a.f.sBs));
    this.nKK = new a(this);
    this.nKJ.setAdapter(this.nKK);
    this.nKJ.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6028791906304L, 44918);
        paramAnonymousAdapterView = (b)paramAnonymousView.getTag();
        switch (paramAnonymousAdapterView.type)
        {
        }
        for (;;)
        {
          MallProductUI.f(MallProductUI.this).a(MallProductUI.this, paramAnonymousView, paramAnonymousInt);
          GMTrace.o(6028791906304L, 44918);
          return;
          Object localObject = MallProductUI.this.nJB.nHC;
          if ((((com.tencent.mm.plugin.product.b.m)localObject).nIg.nIv != null) && (((com.tencent.mm.plugin.product.b.m)localObject).nIg.nIv.size() > 0))
          {
            ArrayList localArrayList = new ArrayList();
            localObject = ((com.tencent.mm.plugin.product.b.m)localObject).nIg.nIv.iterator();
            while (((Iterator)localObject).hasNext()) {
              localArrayList.add((String)((Iterator)localObject).next());
            }
            paramAnonymousAdapterView.nJh = localArrayList;
          }
        }
      }
    });
    this.nKU = ((Button)findViewById(a.f.sBM));
    this.nKU.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6004364279808L, 44736);
        paramAnonymousView = MallProductUI.e(MallProductUI.this);
        com.tencent.mm.wallet_core.ui.e.Q(paramAnonymousView.nJy, paramAnonymousView.nJB.aXf());
        GMTrace.o(6004364279808L, 44736);
      }
    });
    this.nKS = ((ListView)findViewById(a.f.sBV));
    this.nKT = new k(this);
    this.nKT.nKn = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5998727135232L, 44694);
        paramAnonymousView = (m)paramAnonymousView.getTag();
        paramAnonymousAdapterView = MallProductUI.e(MallProductUI.this);
        if ((paramAnonymousView != null) && (paramAnonymousView.nKy != null))
        {
          paramAnonymousView = paramAnonymousView.nKy;
          w.i("MicroMsg.MallProductUI", "goProductUI type : " + paramAnonymousView.type);
          switch (paramAnonymousView.type)
          {
          }
        }
        for (;;)
        {
          GMTrace.o(5998727135232L, 44694);
          return;
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramAnonymousView.url);
          d.b(paramAnonymousAdapterView.nJy, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
          GMTrace.o(5998727135232L, 44694);
          return;
          paramAnonymousView = paramAnonymousView.data.replace("product_id=", "");
          localIntent = new Intent();
          localIntent.putExtra("key_product_id", paramAnonymousView);
          localIntent.putExtra("key_product_scene", 6);
          d.b(paramAnonymousAdapterView.nJy, "mall", ".product.ui.MallProductUI", localIntent);
          paramAnonymousAdapterView.nJy.finish();
        }
      }
    };
    this.nKS.setAdapter(this.nKT);
    this.kES = ((Button)findViewById(a.f.sBw));
    this.kES.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6024765374464L, 44888);
        paramAnonymousView = MallProductUI.e(MallProductUI.this);
        if (paramAnonymousView.nJB.aXj())
        {
          paramAnonymousView.nJy.startActivity(new Intent(paramAnonymousView.nJy, MallProductSelectSkuUI.class));
          g.ork.i(11008, new Object[] { paramAnonymousView.nJB.aXf(), paramAnonymousView.nJB.nHC.nIc, Integer.valueOf(f.gRb), Integer.valueOf(1) });
          GMTrace.o(6024765374464L, 44888);
          return;
        }
        com.tencent.mm.ui.base.u.makeText(paramAnonymousView.nJy, a.i.sVM, 1).show();
        GMTrace.o(6024765374464L, 44888);
      }
    });
    a(0, a.e.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6010538295296L, 44782);
        paramAnonymousMenuItem = MallProductUI.this.getResources().getStringArray(a.b.slN);
        ArrayList localArrayList = new ArrayList();
        int i = 0;
        while (i < paramAnonymousMenuItem.length)
        {
          localArrayList.add(paramAnonymousMenuItem[i]);
          i += 1;
        }
        if ((MallProductUI.this.nJB.aWZ().nJw & 0x1) > 0) {}
        for (boolean bool = true;; bool = false)
        {
          w.d("MicroMsg.MallProductConfig", "isShowSellerEntry, ret = " + bool);
          if (bool) {
            localArrayList.add(MallProductUI.this.getString(a.i.sVS));
          }
          com.tencent.mm.ui.base.h.a(MallProductUI.this.vKB.vKW, null, (String[])localArrayList.toArray(new String[localArrayList.size()]), null, false, new h.c()
          {
            public final void hQ(int paramAnonymous2Int)
            {
              GMTrace.i(6025302245376L, 44892);
              switch (paramAnonymous2Int)
              {
              }
              for (;;)
              {
                GMTrace.o(6025302245376L, 44892);
                return;
                f localf = MallProductUI.e(MallProductUI.this);
                Object localObject1 = localf.nJB.aXp();
                Object localObject2 = new Intent();
                ((Intent)localObject2).putExtra("Retr_Msg_content", (String)localObject1);
                ((Intent)localObject2).putExtra("Retr_Msg_Type", 2);
                if (!bg.nm(localf.nJB.nHC.aXs())) {
                  ((Intent)localObject2).putExtra("Retr_Msg_thumb_path", localf.nJB.aXg());
                }
                ((Intent)localObject2).putExtra("Retr_go_to_chattingUI", false);
                ((Intent)localObject2).putExtra("Retr_show_success_tips", true);
                ((Intent)localObject2).putExtra("Retr_Msg_Type", 2);
                d.a(localf.nJy, ".ui.transmit.MsgRetransmitUI", (Intent)localObject2);
                if (f.gRb == 4) {
                  g.ork.i(10651, new Object[] { Integer.valueOf(11), Integer.valueOf(1), Integer.valueOf(0) });
                }
                GMTrace.o(6025302245376L, 44892);
                return;
                localf = MallProductUI.e(MallProductUI.this);
                localObject2 = localf.nJB.nHC;
                localObject1 = new Intent();
                ((Intent)localObject1).putExtra("KContentObjDesc", localf.nJB.aXq());
                ((Intent)localObject1).putExtra("Ksnsupload_title", ((com.tencent.mm.plugin.product.b.m)localObject2).nIg.name);
                ((Intent)localObject1).putExtra("Ksnsupload_link", localf.nJB.aXh());
                ((Intent)localObject1).putExtra("Ksnsupload_imgurl", localf.nJB.nHC.aXs());
                if (!bg.nm(localf.nJB.nHC.aXs())) {
                  ((Intent)localObject1).putExtra("KsnsUpload_imgPath", localf.nJB.aXg());
                }
                ((Intent)localObject1).putExtra("Ksnsupload_type", 6);
                ((Intent)localObject1).putExtra("KUploadProduct_UserData", localf.nJB.a((com.tencent.mm.plugin.product.b.m)localObject2));
                ((Intent)localObject1).putExtra("KUploadProduct_subType", ((com.tencent.mm.plugin.product.b.m)localObject2).nId);
                localObject2 = com.tencent.mm.y.u.gy("scan_product");
                com.tencent.mm.y.u.Av().p((String)localObject2, true).o("prePublishId", "scan_product");
                ((Intent)localObject1).putExtra("reportSessionId", (String)localObject2);
                d.b(localf.nJy, "sns", ".ui.En_c4f742e5", (Intent)localObject1);
                if (f.gRb == 4) {
                  g.ork.i(10651, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Integer.valueOf(0) });
                }
                GMTrace.o(6025302245376L, 44892);
                return;
                MallProductUI.e(MallProductUI.this).aXw();
                GMTrace.o(6025302245376L, 44892);
                return;
                localf = MallProductUI.e(MallProductUI.this);
                com.tencent.mm.wallet_core.ui.e.P(localf.nJy, localf.nJB.aXf());
              }
            }
          });
          GMTrace.o(6010538295296L, 44782);
          return true;
        }
      }
    });
    lg(false);
    this.nKO.setFocusable(true);
    this.nKO.setFocusableInTouchMode(true);
    this.nKO.requestFocus();
    GMTrace.o(5999532441600L, 44700);
  }
  
  protected final void ar()
  {
    GMTrace.i(5999800877056L, 44702);
    Object localObject = this.nJB.nHC;
    if (localObject == null)
    {
      lg(false);
      GMTrace.o(5999800877056L, 44702);
      return;
    }
    lg(true);
    sv(0);
    this.nKM.setVisibility(0);
    this.nKN.setVisibility(8);
    if (((com.tencent.mm.plugin.product.b.m)localObject).nIg != null)
    {
      this.jXT.setText(((com.tencent.mm.plugin.product.b.m)localObject).nIg.name);
      this.nKe.setText(com.tencent.mm.plugin.product.b.b.n(((com.tencent.mm.plugin.product.b.m)localObject).nIg.nIt, ((com.tencent.mm.plugin.product.b.m)localObject).nIg.nIu, ((com.tencent.mm.plugin.product.b.m)localObject).nIg.nEr));
      this.nKP.setText(com.tencent.mm.plugin.product.b.b.c(((com.tencent.mm.plugin.product.b.m)localObject).nIg.nIs, ((com.tencent.mm.plugin.product.b.m)localObject).nIg.nEr));
    }
    if (this.nJB.aXi() <= 0)
    {
      this.kES.setEnabled(false);
      this.kES.setText(a.i.sVU);
      if ((((com.tencent.mm.plugin.product.b.m)localObject).nIg == null) || (((com.tencent.mm.plugin.product.b.m)localObject).nIg.nID == null) || (((com.tencent.mm.plugin.product.b.m)localObject).nIg.nID.size() <= 0)) {
        break label444;
      }
      this.nKJ.setVisibility(0);
      this.nKK.bc(((com.tencent.mm.plugin.product.b.m)localObject).nIg.nID);
      this.nKK.notifyDataSetChanged();
      label227:
      if ((((com.tencent.mm.plugin.product.b.m)localObject).nIg == null) || (bg.nm(((com.tencent.mm.plugin.product.b.m)localObject).nIg.nIw))) {
        break label456;
      }
      this.nKR.setVisibility(0);
      this.nJg.setVisibility(0);
      this.nJg.setText(((com.tencent.mm.plugin.product.b.m)localObject).nIg.nIw);
      label277:
      if (bg.nm(((com.tencent.mm.plugin.product.b.m)localObject).nIm)) {
        break label477;
      }
      this.nKQ.setVisibility(0);
      this.nKQ.setText(((com.tencent.mm.plugin.product.b.m)localObject).nIm);
    }
    for (;;)
    {
      lg(true);
      if (!bg.nm(this.nJB.nHK))
      {
        localObject = j.a(new c(this.nJB.nHK));
        this.nKO.setImageBitmap((Bitmap)localObject);
        j.a(this);
      }
      GMTrace.o(5999800877056L, 44702);
      return;
      if (this.nJB.nHC.nIf <= 0)
      {
        this.kES.setEnabled(false);
        this.kES.setText(a.i.sVT);
        break;
      }
      this.kES.setEnabled(true);
      if (!bg.nm(((com.tencent.mm.plugin.product.b.m)localObject).nIl))
      {
        this.kES.setText(((com.tencent.mm.plugin.product.b.m)localObject).nIl);
        break;
      }
      this.kES.setText(a.i.sBw);
      break;
      label444:
      this.nKJ.setVisibility(8);
      break label227;
      label456:
      this.nKR.setVisibility(8);
      this.nJg.setVisibility(8);
      break label277;
      label477:
      this.nKQ.setVisibility(8);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5998995570688L, 44696);
    int i = a.g.sOf;
    GMTrace.o(5998995570688L, 44696);
    return i;
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(5999935094784L, 44703);
    if ((paramString != null) && (paramString.equals(this.nJB.nHK))) {
      this.nKO.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6004632715264L, 44738);
          MallProductUI.g(MallProductUI.this).setImageBitmap(paramBitmap);
          GMTrace.o(6004632715264L, 44738);
        }
      });
    }
    GMTrace.o(5999935094784L, 44703);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5999129788416L, 44697);
    super.onCreate(paramBundle);
    sv(8);
    boolean bool = getIntent().getBooleanExtra("key_go_finish", false);
    setResult(-1);
    if (bool)
    {
      finish();
      GMTrace.o(5999129788416L, 44697);
      return;
    }
    MP();
    com.tencent.mm.plugin.product.a.a.aWW();
    this.nJB = com.tencent.mm.plugin.product.a.a.aWX();
    this.nKk = new f(this.vKB.vKW, new f.a()
    {
      public final void o(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
      {
        GMTrace.i(6013356867584L, 44803);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          MallProductUI.this.ar();
          if (MallProductUI.a(MallProductUI.this) != null)
          {
            MallProductUI.a(MallProductUI.this).postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6001679925248L, 44716);
                ScrollView localScrollView = (ScrollView)MallProductUI.this.findViewById(a.f.sCk);
                if (localScrollView != null) {
                  localScrollView.pageScroll(33);
                }
                GMTrace.o(6001679925248L, 44716);
              }
            }, 200L);
            GMTrace.o(6013356867584L, 44803);
          }
        }
        else
        {
          if (paramAnonymousInt2 == -10010003)
          {
            MallProductUI.this.sv(0);
            MallProductUI.b(MallProductUI.this).setVisibility(8);
            MallProductUI.c(MallProductUI.this).setVisibility(0);
            MallProductUI.d(MallProductUI.this);
            GMTrace.o(6013356867584L, 44803);
            return;
          }
          MallProductUI.this.EG(paramAnonymousString);
        }
        GMTrace.o(6013356867584L, 44803);
      }
    });
    paramBundle = this.nKk;
    Object localObject = getIntent();
    com.tencent.mm.plugin.product.b.m localm = new com.tencent.mm.plugin.product.b.m();
    com.tencent.mm.kernel.h.xB().a(new f.1(paramBundle, (Intent)localObject, localm));
    paramBundle.nJz = true;
    localObject = new mb();
    ((mb)localObject).eQM.errCode = -1;
    ((mb)localObject).eDO = new f.2(paramBundle, (mb)localObject);
    com.tencent.mm.sdk.b.a.vgX.a((com.tencent.mm.sdk.b.b)localObject, Looper.getMainLooper());
    GMTrace.o(5999129788416L, 44697);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(5999666659328L, 44701);
    super.onNewIntent(paramIntent);
    w.v("MicroMsg.MallProductUI", "onNewIntent");
    setIntent(paramIntent);
    GMTrace.o(5999666659328L, 44701);
  }
  
  protected void onPause()
  {
    GMTrace.i(5999398223872L, 44699);
    this.nKk.onStop();
    super.onPause();
    GMTrace.o(5999398223872L, 44699);
  }
  
  protected void onResume()
  {
    GMTrace.i(5999264006144L, 44698);
    super.onResume();
    this.nKk.onStart();
    GMTrace.o(5999264006144L, 44698);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\MallProductUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */