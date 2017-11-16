package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.product.b.k;
import com.tencent.mm.plugin.product.b.l;
import com.tencent.mm.plugin.product.b.m;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.beh;
import com.tencent.mm.protocal.c.bz;
import com.tencent.mm.protocal.c.rz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MallProductSubmitUI
  extends MallBaseUI
  implements j.a
{
  private TextView izE;
  private Button kES;
  private com.tencent.mm.plugin.product.b.e nHR;
  private com.tencent.mm.plugin.product.b.c nJB;
  private RelativeLayout nKA;
  private TextView nKB;
  private TextView nKC;
  private MallProductItemView nKD;
  private MallProductItemView nKE;
  private TextView nKF;
  private TextView nKG;
  private TextView nKH;
  private TextView nKI;
  private ListView nKJ;
  private a nKK;
  private ImageView nKd;
  private TextView nKe;
  private f nKk;
  
  public MallProductSubmitUI()
  {
    GMTrace.i(6014430609408L, 44811);
    GMTrace.o(6014430609408L, 44811);
  }
  
  private void ar()
  {
    GMTrace.i(6015235915776L, 44817);
    m localm = this.nJB.nHC;
    Object localObject1;
    label190:
    String str;
    if (this.nHR != null)
    {
      this.nKe.setText(com.tencent.mm.plugin.product.b.b.n(this.nHR.nHV, this.nHR.nHV, localm.nIg.nEr) + " x " + this.nJB.mCount);
      if (!bg.nm(this.nJB.aXa()))
      {
        localObject1 = j.a(new c(this.nJB.aXa()));
        this.nKd.setImageBitmap((Bitmap)localObject1);
        j.a(this);
      }
      this.izE.setText(localm.nIg.name);
      this.nKF.setText(this.nJB.aXb());
      localObject1 = this.nJB.aXe();
      if ((localObject1 == null) || (bg.nm(((axt)localObject1).lQf))) {
        break label601;
      }
      this.nKE.EI(((axt)localObject1).lQf);
      str = "";
      localObject1 = str;
      if (!this.nJB.aWZ().aXv())
      {
        localObject1 = this.nJB.nHH;
        if (localObject1 == null) {
          break label613;
        }
        this.nKD.setEnabled(true);
        this.nKD.setClickable(true);
        this.nKD.EI(com.tencent.mm.plugin.product.b.b.a(this, (rz)localObject1));
        localObject1 = getString(a.i.sVZ, new Object[] { com.tencent.mm.plugin.product.b.b.c(((rz)localObject1).tXI, ((rz)localObject1).uhq) });
        this.nKC.setVisibility(8);
      }
      label284:
      str = "";
      int i = this.nJB.aXd();
      if (i > 0)
      {
        bg.nm((String)localObject1);
        str = getString(a.i.sVY, new Object[] { com.tencent.mm.plugin.product.b.b.c(i, localm.nIg.nEr) });
      }
      Object localObject2 = this.nJB.F(this);
      if (((LinkedList)localObject2).size() <= 0) {
        break label656;
      }
      this.nKJ.setVisibility(0);
      this.nKK.bc((List)localObject2);
      this.nKK.notifyDataSetChanged();
      label374:
      localObject2 = this.nJB.nHI;
      if (localObject2 != null) {
        this.nKB.setText(Html.fromHtml(String.format("%s %s<br><br>%s %s %s", new Object[] { ((bz)localObject2).jhi, ((bz)localObject2).tQl, ((bz)localObject2).gCy, ((bz)localObject2).gCz, ((bz)localObject2).lQf })));
      }
      localObject1 = (String)localObject1 + str;
      if (bg.nm((String)localObject1)) {
        break label668;
      }
      localObject1 = getString(a.i.sVX, new Object[] { localObject1 });
      this.nKG.setText((CharSequence)localObject1);
      this.nKH.setVisibility(8);
      this.nKG.setVisibility(0);
    }
    for (;;)
    {
      this.nKI.setText(com.tencent.mm.plugin.product.b.b.c(this.nJB.aXc(), localm.nIg.nEr));
      this.kES.setEnabled(this.nJB.aXl());
      GMTrace.o(6015235915776L, 44817);
      return;
      this.nKe.setText(com.tencent.mm.plugin.product.b.b.n(localm.nIg.nIt, localm.nIg.nIu, localm.nIg.nEr));
      break;
      label601:
      this.nKE.EI("");
      break label190;
      label613:
      this.nKD.setEnabled(false);
      this.nKD.setClickable(false);
      this.nKD.EI(getString(a.i.sWa));
      this.nKC.setVisibility(0);
      localObject1 = str;
      break label284;
      label656:
      this.nKJ.setVisibility(8);
      break label374;
      label668:
      this.nKH.setVisibility(0);
      this.nKG.setVisibility(8);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(6015101698048L, 44816);
    oM(a.i.sWc);
    this.nKA = ((RelativeLayout)findViewById(a.f.sBW));
    this.nKB = ((TextView)findViewById(a.f.sBY));
    this.nKC = ((TextView)findViewById(a.f.sBX));
    this.nKD = ((MallProductItemView)findViewById(a.f.sBZ));
    this.nKE = ((MallProductItemView)findViewById(a.f.sCb));
    this.nKd = ((ImageView)findViewById(a.f.sCa));
    this.izE = ((TextView)findViewById(a.f.sCi));
    this.nKF = ((TextView)findViewById(a.f.sCc));
    this.nKe = ((TextView)findViewById(a.f.sCg));
    this.nKG = ((TextView)findViewById(a.f.sCf));
    this.nKH = ((TextView)findViewById(a.f.sCe));
    this.nKI = ((TextView)findViewById(a.f.sCj));
    this.nKJ = ((ListView)findViewById(a.f.sCd));
    this.nKK = new a(this);
    this.nKJ.setAdapter(this.nKK);
    this.nKJ.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6007585505280L, 44760);
        paramAnonymousAdapterView = (b)paramAnonymousView.getTag();
        switch (paramAnonymousAdapterView.type)
        {
        }
        for (;;)
        {
          MallProductSubmitUI.c(MallProductSubmitUI.this).a(MallProductSubmitUI.this, paramAnonymousView, paramAnonymousInt);
          GMTrace.o(6007585505280L, 44760);
          return;
          Object localObject = MallProductSubmitUI.b(MallProductSubmitUI.this).nHC;
          if ((((m)localObject).nIg.nIv != null) && (((m)localObject).nIg.nIv.size() > 0))
          {
            ArrayList localArrayList = new ArrayList();
            localObject = ((m)localObject).nIg.nIv.iterator();
            while (((Iterator)localObject).hasNext()) {
              localArrayList.add((String)((Iterator)localObject).next());
            }
            paramAnonymousAdapterView.nJh = localArrayList;
            continue;
            if ((paramAnonymousAdapterView.nJh instanceof String)) {
              MallProductSubmitUI.b(MallProductSubmitUI.this).nHL = ((String)paramAnonymousAdapterView.nJh);
            }
          }
        }
      }
    });
    this.kES = ((Button)findViewById(a.f.sCh));
    this.kES.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6010135642112L, 44779);
        paramAnonymousView = MallProductSubmitUI.d(MallProductSubmitUI.this);
        if (paramAnonymousView.nJB.aXl())
        {
          if (paramAnonymousView.nJB.aXc() == 0) {}
          for (int i = 1; i != 0; i = 0)
          {
            h.xz();
            n localn = h.xx().fYr;
            beh localbeh = paramAnonymousView.nJB.aXn();
            paramAnonymousView.nJB.getAppId();
            localn.a(new k(localbeh), 0);
            GMTrace.o(6010135642112L, 44779);
            return;
          }
          h.xz();
          h.xx().fYr.a(new l(paramAnonymousView.nJB.aXn(), paramAnonymousView.nJB.getAppId()), 0);
        }
        GMTrace.o(6010135642112L, 44779);
      }
    });
    this.nKA.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6023825850368L, 44881);
        paramAnonymousView = MallProductSubmitUI.d(MallProductSubmitUI.this);
        Intent localIntent = new Intent();
        localIntent.putExtra("launch_from_webview", true);
        d.a(paramAnonymousView.nJy, "address", ".ui.WalletSelectAddrUI", localIntent, 1, false);
        GMTrace.o(6023825850368L, 44881);
      }
    });
    this.nKD.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5997921828864L, 44688);
        MallProductSubmitUI.this.showDialog(1);
        GMTrace.o(5997921828864L, 44688);
      }
    });
    this.nKE.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6023423197184L, 44878);
        paramAnonymousView = MallProductSubmitUI.d(MallProductSubmitUI.this);
        Intent localIntent = new Intent(paramAnonymousView.nJy, MallProductReceiptUI.class);
        paramAnonymousView.nJy.startActivityForResult(localIntent, 4);
        GMTrace.o(6023423197184L, 44878);
      }
    });
    MallProductItemView localMallProductItemView = this.nKE;
    boolean bool;
    if ((this.nJB.aWZ().nJx & 0x2) > 0)
    {
      bool = true;
      w.d("MicroMsg.MallProductConfig", "hasReceipt, ret = " + bool);
      if (!bool) {
        break label424;
      }
    }
    label424:
    for (int i = 0;; i = 8)
    {
      localMallProductItemView.setVisibility(i);
      if (this.nJB.aWZ().aXv())
      {
        this.nKD.setEnabled(false);
        this.nKD.setClickable(false);
        this.nKD.EI(getString(a.i.sWb));
      }
      GMTrace.o(6015101698048L, 44816);
      return;
      bool = false;
      break;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6014564827136L, 44812);
    int i = a.g.sOe;
    GMTrace.o(6014564827136L, 44812);
    return i;
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6015504351232L, 44819);
    paramString = new StringBuilder().append(paramString).append(", bitmap = ");
    if (paramBitmap == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.MallProductSubmitUI", bool);
      if (!bg.nm(this.nJB.aXa())) {
        break;
      }
      GMTrace.o(6015504351232L, 44819);
      return;
    }
    this.nKd.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6034429050880L, 44960);
        MallProductSubmitUI.e(MallProductSubmitUI.this).setImageBitmap(paramBitmap);
        GMTrace.o(6034429050880L, 44960);
      }
    });
    GMTrace.o(6015504351232L, 44819);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6015370133504L, 44818);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.nKk.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6015370133504L, 44818);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6014699044864L, 44813);
    super.onCreate(paramBundle);
    this.nKk = new f(this.vKB.vKW, new f.a()
    {
      public final void o(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
      {
        GMTrace.i(6009867206656L, 44777);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          MallProductSubmitUI.a(MallProductSubmitUI.this);
          GMTrace.o(6009867206656L, 44777);
          return;
        }
        MallProductSubmitUI.this.EG(paramAnonymousString);
        GMTrace.o(6009867206656L, 44777);
      }
    });
    com.tencent.mm.plugin.product.a.a.aWW();
    this.nJB = com.tencent.mm.plugin.product.a.a.aWX();
    this.nHR = this.nJB.nHR;
    MP();
    ar();
    GMTrace.o(6014699044864L, 44813);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(6015638568960L, 44820);
    switch (paramInt)
    {
    }
    do
    {
      localObject1 = super.onCreateDialog(paramInt);
      GMTrace.o(6015638568960L, 44820);
      return (Dialog)localObject1;
      localObject2 = this.nJB.nHP;
    } while (localObject2 == null);
    Object localObject1 = new ArrayList();
    Object localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((List)localObject1).add(com.tencent.mm.plugin.product.b.b.a(this, (rz)((Iterator)localObject2).next()));
    }
    localObject2 = getString(a.i.sBZ);
    AdapterView.OnItemClickListener local8 = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6018859794432L, 44844);
        MallProductSubmitUI.this.dismissDialog(1);
        MallProductSubmitUI.b(MallProductSubmitUI.this).su(paramAnonymousInt);
        MallProductSubmitUI.a(MallProductSubmitUI.this);
        GMTrace.o(6018859794432L, 44844);
      }
    };
    d.a locala = new d.a(this);
    ListView localListView = (ListView)View.inflate(this, a.g.gfk, null);
    localListView.setOnItemClickListener(new d.1(local8, locala));
    locala.nJr = ((List)localObject1);
    locala.nJs = 0;
    localListView.setAdapter(locala);
    localObject1 = new i.a(this);
    ((i.a)localObject1).Vz((String)localObject2);
    ((i.a)localObject1).dg(localListView);
    ((i.a)localObject1).d(null);
    localObject1 = ((i.a)localObject1).aax();
    ((i)localObject1).show();
    GMTrace.o(6015638568960L, 44820);
    return (Dialog)localObject1;
  }
  
  public void onStart()
  {
    GMTrace.i(6014833262592L, 44814);
    this.nKk.onStart();
    super.onStart();
    GMTrace.o(6014833262592L, 44814);
  }
  
  protected void onStop()
  {
    GMTrace.i(6014967480320L, 44815);
    this.nKk.onStop();
    super.onStop();
    GMTrace.o(6014967480320L, 44815);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\MallProductSubmitUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */