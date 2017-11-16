package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bbc;
import com.tencent.mm.protocal.c.im;
import com.tencent.mm.protocal.c.in;
import com.tencent.mm.protocal.c.is;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.sortview.a;
import com.tencent.mm.ui.tools.p;
import com.tencent.mm.ui.tools.p.b;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BizSearchDetailPageUI
  extends MMActivity
  implements p.b
{
  private p jtA;
  private BizSearchResultItemContainer jtB;
  private long jtC;
  private String jtD;
  private int jtE;
  private int jtF;
  private Runnable jtG;
  private int vq;
  
  public BizSearchDetailPageUI()
  {
    GMTrace.i(10857811542016L, 80897);
    this.jtG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10850429566976L, 80842);
        BizSearchDetailPageUI.c(BizSearchDetailPageUI.this).aF(BizSearchDetailPageUI.a(BizSearchDetailPageUI.this), BizSearchDetailPageUI.b(BizSearchDetailPageUI.this));
        BizSearchDetailPageUI.d(BizSearchDetailPageUI.this);
        GMTrace.o(10850429566976L, 80842);
      }
    };
    GMTrace.o(10857811542016L, 80897);
  }
  
  public final void QA()
  {
    GMTrace.i(10858079977472L, 80899);
    GMTrace.o(10858079977472L, 80899);
  }
  
  public final void QB()
  {
    GMTrace.i(16937874620416L, 126197);
    GMTrace.o(16937874620416L, 126197);
  }
  
  public final void Qy()
  {
    GMTrace.i(10859019501568L, 80906);
    finish();
    GMTrace.o(10859019501568L, 80906);
  }
  
  public final void Qz()
  {
    GMTrace.i(10859153719296L, 80907);
    GMTrace.o(10859153719296L, 80907);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10857945759744L, 80898);
    int i = R.i.cqm;
    GMTrace.o(10857945759744L, 80898);
    return i;
  }
  
  public final boolean nC(String paramString)
  {
    GMTrace.i(10858751066112L, 80904);
    GMTrace.o(10858751066112L, 80904);
    return false;
  }
  
  public final void nD(String paramString)
  {
    GMTrace.i(10858885283840L, 80905);
    if (bg.nm(paramString))
    {
      GMTrace.o(10858885283840L, 80905);
      return;
    }
    paramString = paramString.trim();
    if (!paramString.equals(this.jtD))
    {
      af.F(this.jtG);
      this.jtD = paramString;
      af.i(this.jtG, 400L);
    }
    GMTrace.o(10858885283840L, 80905);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10858214195200L, 80900);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10850966437888L, 80846);
        BizSearchDetailPageUI.this.finish();
        GMTrace.o(10850966437888L, 80846);
        return true;
      }
    });
    paramBundle = getIntent();
    this.jtC = paramBundle.getLongExtra("businessType", 0L);
    boolean bool1 = paramBundle.getBooleanExtra("showEditText", false);
    this.jtE = paramBundle.getIntExtra("fromScene", 0);
    this.jtF = paramBundle.getIntExtra("addContactScene", 35);
    Object localObject1 = paramBundle.getStringExtra("title");
    String str = paramBundle.getStringExtra("keyword");
    boolean bool2 = paramBundle.getBooleanExtra("showCatalog", false);
    this.vq = paramBundle.getIntExtra("offset", 0);
    if ((this.jtC == 0L) || (bg.nm(str)))
    {
      w.e("MicroMsg.BrandService.BizSearchDetailPageUI", "businessType(%d) or queryStr is nil.", new Object[] { Long.valueOf(this.jtC) });
      finish();
      GMTrace.o(10858214195200L, 80900);
      return;
    }
    paramBundle = paramBundle.getByteArrayExtra("result");
    int j = 0;
    int i = 0;
    if (paramBundle != null) {}
    for (;;)
    {
      Object localObject2;
      try
      {
        paramBundle = (in)new in().aD(paramBundle);
        if (paramBundle != null) {
          i = 1;
        }
        this.jtB = ((BizSearchResultItemContainer)findViewById(R.h.bZV));
        this.jtB.a(new c(this));
        this.jtB.d(new long[] { this.jtC });
        this.jtB.juf = 1;
        this.jtB.ds(bool2);
        this.jtB.lq(this.jtE);
        localObject2 = this.jtB;
        j = this.jtF;
        ((BizSearchResultItemContainer)localObject2).jtF = j;
        ((BizSearchResultItemContainer)localObject2).jtW.lr(j);
        localObject2 = this.jtB;
        c.b local3 = new c.b()
        {
          public final void a(c paramAnonymousc, a paramAnonymousa, int paramAnonymousInt1, String paramAnonymousString, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(20418140307456L, 152127);
            in localin;
            StringBuilder localStringBuilder;
            if ((BizSearchDetailPageUI.e(BizSearchDetailPageUI.this) == 1) && (paramAnonymousa.type == 5))
            {
              paramAnonymousa = (is)paramAnonymousa.data;
              if ((paramAnonymousa.tXK == null) || (paramAnonymousa.tXK.tXs == null))
              {
                w.e("MicroMsg.BrandService.BizSearchDetailPageUI", "bcdItem.ContactItem == null || bcdItem.ContactItem.ContactItem == null");
                GMTrace.o(20418140307456L, 152127);
                return;
              }
              localin = paramAnonymousc.lp(paramAnonymousInt3);
              localStringBuilder = new StringBuilder().append(bg.nl(BizSearchDetailPageUI.a(BizSearchDetailPageUI.this))).append(",").append(paramAnonymousInt1).append(",").append(bg.nl(paramAnonymousString)).append(",").append(paramAnonymousInt2).append(",").append(paramAnonymousc.jtN).append(",");
              if (localin != null) {
                break label250;
              }
            }
            label250:
            for (paramAnonymousc = "";; paramAnonymousc = localin.tXx + ",1")
            {
              paramAnonymousc = paramAnonymousc;
              g.ork.A(10866, paramAnonymousc);
              w.d("MicroMsg.BrandService.BizSearchDetailPageUI", "report : " + paramAnonymousc);
              if ((paramAnonymousa.tXK.tXs.uAv & 0x8) > 0) {
                g.ork.A(10298, paramAnonymousString + ",35");
              }
              GMTrace.o(20418140307456L, 152127);
              return;
            }
          }
        };
        if (((BizSearchResultItemContainer)localObject2).jtW != null) {
          ((BizSearchResultItemContainer)localObject2).jtW.a(local3);
        }
        if (bool1)
        {
          this.jtA = new p();
          a(this.jtA);
          this.jtA.mD(false);
          this.jtA.clearFocus();
          this.jtA.WP(str);
          this.jtA.xiS = this;
          this.jtB.setOnTouchListener(new View.OnTouchListener()
          {
            public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
            {
              GMTrace.i(10887876313088L, 81121);
              if (BizSearchDetailPageUI.f(BizSearchDetailPageUI.this) != null) {
                BizSearchDetailPageUI.f(BizSearchDetailPageUI.this).clearFocus();
              }
              BizSearchDetailPageUI.this.aLo();
              GMTrace.o(10887876313088L, 81121);
              return false;
            }
          });
          if (i == 0) {
            break label615;
          }
          localObject1 = this.jtB;
          i = this.vq;
          ((BizSearchResultItemContainer)localObject1).reset();
          if (paramBundle != null) {
            break label487;
          }
          w.e("MicroMsg.BrandService.BizSearchResultItemContainer", "setFirst page content failed, content is null.");
          GMTrace.o(10858214195200L, 80900);
          return;
        }
      }
      catch (IOException paramBundle)
      {
        w.printErrStackTrace("MicroMsg.BrandService.BizSearchDetailPageUI", paramBundle, "", new Object[0]);
        finish();
        GMTrace.o(10858214195200L, 80900);
        return;
      }
      if (!bg.nm((String)localObject1))
      {
        sq((String)localObject1);
        continue;
        label487:
        ((BizSearchResultItemContainer)localObject1).jtY.eBj = str;
        ((BizSearchResultItemContainer)localObject1).d(new long[] { paramBundle.tXu });
        ((BizSearchResultItemContainer)localObject1).jtY.gLP = paramBundle.tXv;
        ((BizSearchResultItemContainer)localObject1).jud = i;
        localObject2 = new LinkedList();
        ((List)localObject2).add(paramBundle);
        ((BizSearchResultItemContainer)localObject1).jtW.c(str, (List)localObject2);
        ((BizSearchResultItemContainer)localObject1).jtY.offset = (i + paramBundle.tWu);
        paramBundle = ((BizSearchResultItemContainer)localObject1).jtY;
        if (!((BizSearchResultItemContainer)localObject1).jtW.isEmpty()) {}
        for (bool1 = true;; bool1 = false)
        {
          paramBundle.jum = bool1;
          GMTrace.o(10858214195200L, 80900);
          return;
        }
        label615:
        nD(str);
        GMTrace.o(10858214195200L, 80900);
        return;
        paramBundle = null;
        i = j;
      }
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(10858348412928L, 80901);
    if (this.jtA != null) {
      this.jtA.a(this, paramMenu);
    }
    GMTrace.o(10858348412928L, 80901);
    return true;
  }
  
  protected void onPause()
  {
    GMTrace.i(10858616848384L, 80903);
    super.onPause();
    if (this.jtA != null) {
      this.jtA.clearFocus();
    }
    GMTrace.o(10858616848384L, 80903);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(10858482630656L, 80902);
    if (this.jtA != null) {
      this.jtA.a(this, paramMenu);
    }
    GMTrace.o(10858482630656L, 80902);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\BizSearchDetailPageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */