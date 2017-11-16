package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pb;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.MMEditText.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SightUploadUI
  extends MMActivity
{
  private String desc;
  DisplayMetrics odv;
  private boolean pRF;
  private long pRG;
  private z pRH;
  private String pRI;
  private String pRJ;
  private ArrayList<String> pRK;
  private int pRL;
  private int pRM;
  private boolean pRN;
  private SnsEditText pRw;
  private LinearLayout pRx;
  private SnsSightUploadSayFooter pWu;
  private int pWv;
  
  public SightUploadUI()
  {
    GMTrace.i(8506853818368L, 63381);
    this.pRH = null;
    this.desc = "";
    this.pRI = "";
    this.pRJ = "";
    this.pRL = 0;
    this.pRM = 0;
    this.pRN = false;
    this.pWv = 0;
    this.pRF = false;
    this.pRG = 0L;
    GMTrace.o(8506853818368L, 63381);
  }
  
  protected final void MP()
  {
    GMTrace.i(8507256471552L, 63384);
    this.pRw = ((SnsEditText)findViewById(i.f.pcS));
    this.pRw.setTextSize(1, ab.dZ(this.vKB.vKW) * this.pRw.getTextSize() / com.tencent.mm.br.a.getDensity(this.vKB.vKW));
    int i = this.pRw.getPaddingLeft();
    int j = this.pRx.getPaddingRight();
    int k = this.odv.widthPixels;
    this.pRw.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8484842110976L, 63217);
        SightUploadUI.a(SightUploadUI.this).setWidth((int)(this.pWw * 0.7D));
        SightUploadUI.b(SightUploadUI.this).setLayoutParams(new LinearLayout.LayoutParams((int)(this.pWw * 0.3D), SightUploadUI.b(SightUploadUI.this).getHeight()));
        GMTrace.o(8484842110976L, 63217);
      }
    }, 100L);
    if (!bg.nm(getIntent().getStringExtra("Kdescription"))) {
      this.pRw.setText(getIntent().getStringExtra("Kdescription"));
    }
    this.pRw.xqq = new MMEditText.a()
    {
      public final void aME()
      {
        GMTrace.i(8534771105792L, 63589);
        SightUploadUI.this.aLo();
        pb localpb = new pb();
        localpb.eTW.type = 0;
        localpb.eTW.eTY = false;
        com.tencent.mm.sdk.b.a.vgX.m(localpb);
        SightUploadUI.this.finish();
        GMTrace.o(8534771105792L, 63589);
      }
    };
    this.pWu = ((SnsSightUploadSayFooter)findViewById(i.f.bZp));
    SnsSightUploadSayFooter localSnsSightUploadSayFooter = this.pWu;
    SnsEditText localSnsEditText = this.pRw;
    localSnsSightUploadSayFooter.qfz = localSnsEditText;
    localSnsEditText.setOnClickListener(new SnsSightUploadSayFooter.1(localSnsSightUploadSayFooter));
    localSnsEditText.setOnEditorActionListener(new SnsSightUploadSayFooter.2(localSnsSightUploadSayFooter));
    af.i(new SnsSightUploadSayFooter.3(localSnsSightUploadSayFooter), 200L);
    this.pWu.setVisibility(0);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8588055543808L, 63986);
        paramAnonymousMenuItem = new pb();
        paramAnonymousMenuItem.eTW.type = 0;
        paramAnonymousMenuItem.eTW.eTY = false;
        com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
        SightUploadUI.this.aLo();
        SightUploadUI.this.finish();
        GMTrace.o(8588055543808L, 63986);
        return true;
      }
    });
    if (getIntent().getBooleanExtra("KSightDraftEntrance", true)) {
      a(1, i.i.phm, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8620267798528L, 64226);
          paramAnonymousMenuItem = SightUploadUI.this.vKB.vKW;
          String str = SightUploadUI.this.getString(i.j.pil);
          h.c local1 = new h.c()
          {
            public final void hQ(int paramAnonymous2Int)
            {
              GMTrace.i(8363509284864L, 62313);
              switch (paramAnonymous2Int)
              {
              }
              for (;;)
              {
                GMTrace.o(8363509284864L, 62313);
                return;
                pb localpb = new pb();
                localpb.eTW.type = 0;
                localpb.eTW.eUa = true;
                localpb.eTW.eTY = true;
                com.tencent.mm.sdk.b.a.vgX.m(localpb);
                SightUploadUI.this.aLo();
                SightUploadUI.this.finish();
              }
            }
          };
          h.a(paramAnonymousMenuItem, null, new String[] { str }, null, local1);
          GMTrace.o(8620267798528L, 64226);
          return false;
        }
      });
    }
    a(0, getString(i.j.cUs), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8428068012032L, 62794);
        if (SightUploadUI.this.isFinishing())
        {
          GMTrace.o(8428068012032L, 62794);
          return false;
        }
        SightUploadUI.a(SightUploadUI.this, SightUploadUI.a(SightUploadUI.this).getText().toString());
        final int i = SightUploadUI.a(SightUploadUI.this).qax;
        paramAnonymousMenuItem = c.d(SightUploadUI.a(SightUploadUI.this)).Ea(com.tencent.mm.k.b.tW());
        paramAnonymousMenuItem.xkl = true;
        paramAnonymousMenuItem.a(new c.a()
        {
          public final void acJ()
          {
            GMTrace.i(8325391450112L, 62029);
            GMTrace.o(8325391450112L, 62029);
          }
          
          public final void ack()
          {
            GMTrace.i(8325525667840L, 62030);
            h.h(SightUploadUI.this, i.j.plg, i.j.plh);
            GMTrace.o(8325525667840L, 62030);
          }
          
          public final void sT(String paramAnonymous2String)
          {
            GMTrace.i(8325257232384L, 62028);
            paramAnonymous2String = new PInt();
            SightUploadUI.j(SightUploadUI.this).a(SightUploadUI.c(SightUploadUI.this), 0, null, SightUploadUI.d(SightUploadUI.this), null, SightUploadUI.e(SightUploadUI.this).qfB.bnF(), i, SightUploadUI.f(SightUploadUI.this), SightUploadUI.g(SightUploadUI.this), paramAnonymous2String, "", SightUploadUI.h(SightUploadUI.this), SightUploadUI.i(SightUploadUI.this));
            g localg = g.ork;
            long l1 = SightUploadUI.k(SightUploadUI.this);
            long l2 = bg.Pu();
            if (SightUploadUI.l(SightUploadUI.this))
            {
              i = 0;
              localg.i(13303, new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(paramAnonymous2String.value) });
              l1 = SightUploadUI.k(SightUploadUI.this);
              l2 = bg.Pu();
              if (!SightUploadUI.l(SightUploadUI.this)) {
                break label286;
              }
            }
            label286:
            for (int i = 0;; i = 1)
            {
              w.d("MicroMsg.SightUploadUI", "reprot timelinePostAction(13303), %d, %d, %d, %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(paramAnonymous2String.value) });
              GMTrace.o(8325257232384L, 62028);
              return;
              i = 1;
              break;
            }
          }
        });
        GMTrace.o(8428068012032L, 62794);
        return false;
      }
    }, p.b.vLI);
    lf(true);
    GMTrace.o(8507256471552L, 63384);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8507122253824L, 63383);
    int i = i.g.pgj;
    GMTrace.o(8507122253824L, 63383);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8507793342464L, 63388);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(8507793342464L, 63388);
      return;
    }
    Object localObject1;
    if ((paramInt1 == 6) || (paramInt1 == 5) || (paramInt1 == 10))
    {
      localObject1 = this.pWu;
      if (paramIntent != null)
      {
        if (paramInt1 != 10) {
          break label93;
        }
        ((SnsSightUploadSayFooter)localObject1).qfB.U(paramIntent);
      }
    }
    for (;;)
    {
      if (paramInt1 == 5) {
        if (paramIntent == null)
        {
          GMTrace.o(8507793342464L, 63388);
          return;
          label93:
          if (paramInt1 == 5) {
            ((SnsSightUploadSayFooter)localObject1).qfA.a(paramInt1, paramInt2, paramIntent, null);
          }
        }
        else
        {
          paramInt2 = paramIntent.getIntExtra("Ktag_range_index", 0);
          if (paramInt2 >= 2)
          {
            this.pRI = paramIntent.getStringExtra("Klabel_name_list");
            this.pRJ = paramIntent.getStringExtra("Kother_user_name_list");
            localObject1 = Arrays.asList(this.pRI.split(","));
            if (bg.nm(this.pRJ)) {
              break label554;
            }
          }
        }
      }
    }
    label306:
    label339:
    label551:
    label554:
    for (paramIntent = Arrays.asList(this.pRJ.split(","));; paramIntent = null)
    {
      this.pRK = new ArrayList();
      Object localObject2;
      if ((localObject1 != null) && (((List)localObject1).size() > 0))
      {
        Iterator localIterator = ((List)localObject1).iterator();
        if (localIterator.hasNext())
        {
          localObject2 = (String)localIterator.next();
          localObject2 = com.tencent.mm.plugin.label.a.a.aJP().AY(com.tencent.mm.plugin.label.a.a.aJP().AV((String)localObject2));
          if ((localObject2 != null) && (((List)localObject2).size() != 0)) {
            break label339;
          }
          w.e("MicroMsg.SightUploadUI", "dz: getContactNamesFromLabels,namelist get bu label is null");
        }
      }
      if (localObject1 != null)
      {
        localObject1 = ((List)localObject1).iterator();
        paramInt1 = 0;
        if (((Iterator)localObject1).hasNext())
        {
          if (bg.nm((String)((Iterator)localObject1).next())) {
            break label551;
          }
          paramInt1 += 1;
        }
      }
      for (;;)
      {
        break label306;
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          if (!this.pRK.contains(str))
          {
            this.pRK.add(str);
            w.d("MicroMsg.SightUploadUI", "dz:name : %s", new Object[] { str });
          }
        }
        break;
        this.pRL = paramInt1;
        this.pRM = 0;
        if ((paramIntent != null) && (paramIntent.size() > 0))
        {
          paramIntent = paramIntent.iterator();
          while (paramIntent.hasNext())
          {
            localObject1 = (String)paramIntent.next();
            if (!this.pRK.contains(localObject1))
            {
              this.pRK.add(localObject1);
              this.pRM += 1;
            }
          }
        }
        if (paramInt2 == 2) {}
        for (this.pRN = false; 1 == paramInt2; this.pRN = true)
        {
          this.pWv = 1;
          GMTrace.o(8507793342464L, 63388);
          return;
        }
        this.pWv = 0;
        GMTrace.o(8507793342464L, 63388);
        return;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8506988036096L, 63382);
    e.g(this);
    super.onCreate(paramBundle);
    this.odv = getResources().getDisplayMetrics();
    this.pRH = new al(this);
    this.pRH.G(paramBundle);
    this.pRx = ((LinearLayout)findViewById(i.f.peD));
    this.pRx.addView(this.pRH.bmU());
    oM(i.j.pkU);
    cN().cO().setBackgroundDrawable(getResources().getDrawable(i.c.black));
    this.pRF = getIntent().getBooleanExtra("KSnsPostManu", false);
    this.pRG = getIntent().getLongExtra("KTouchCameraTime", 0L);
    MP();
    e.h(this);
    GMTrace.o(8506988036096L, 63382);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8507524907008L, 63386);
    super.onDestroy();
    this.pRH.bmV();
    this.pWu.qfB.stop();
    SnsSightUploadSayFooter localSnsSightUploadSayFooter = this.pWu;
    if (localSnsSightUploadSayFooter.mQP != null)
    {
      localSnsSightUploadSayFooter.mQP.oI();
      localSnsSightUploadSayFooter.mQP.destroy();
    }
    GMTrace.o(8507524907008L, 63386);
  }
  
  protected void onPause()
  {
    GMTrace.i(8507659124736L, 63387);
    super.onPause();
    aLo();
    GMTrace.o(8507659124736L, 63387);
  }
  
  public void onResume()
  {
    GMTrace.i(8507390689280L, 63385);
    super.onResume();
    w.d("MicroMsg.SightUploadUI", "onResume");
    SnsSightUploadSayFooter localSnsSightUploadSayFooter = this.pWu;
    if (localSnsSightUploadSayFooter.mQP.getVisibility() == 8) {
      localSnsSightUploadSayFooter.ezR.aLs();
    }
    GMTrace.o(8507390689280L, 63385);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SightUploadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */