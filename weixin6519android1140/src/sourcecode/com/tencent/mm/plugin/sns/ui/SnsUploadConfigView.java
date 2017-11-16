package com.tencent.mm.plugin.sns.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ap.b;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.g.a.fo.b;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.j.a.a;
import com.tencent.mm.ui.j.a.b;
import com.tencent.mm.ui.j.a.c;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.q;

public class SnsUploadConfigView
  extends LinearLayout
  implements com.tencent.mm.ad.e, a.a, a.b
{
  private static String esM;
  private Context context;
  private ProgressDialog msk;
  boolean qeP;
  ImageView qja;
  ImageView qjb;
  ImageView qjc;
  private boolean qjd;
  boolean qje;
  boolean qjf;
  private boolean qjg;
  private boolean qjh;
  private boolean qji;
  amc qjj;
  com.tencent.mm.ui.j.a qjk;
  
  static
  {
    GMTrace.i(8701603741696L, 64832);
    esM = "com.tencent.mm";
    GMTrace.o(8701603741696L, 64832);
  }
  
  public SnsUploadConfigView(final Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8697979863040L, 64805);
    this.qeP = false;
    this.qjd = false;
    this.qje = false;
    this.qjf = false;
    this.qjg = false;
    this.qjh = true;
    this.qji = false;
    this.qjj = new amc();
    this.qjk = new com.tencent.mm.ui.j.a();
    this.msk = null;
    this.context = paramContext;
    this.context = paramContext;
    paramAttributeSet = v.fb(paramContext).inflate(i.g.pgC, this, true);
    this.qja = ((ImageView)paramAttributeSet.findViewById(i.f.pdR));
    this.qjb = ((ImageView)paramAttributeSet.findViewById(i.f.pdT));
    this.qjc = ((ImageView)paramAttributeSet.findViewById(i.f.pdS));
    if (!b.Ju()) {
      this.qjc.setVisibility(8);
    }
    if (!b.Jw()) {
      this.qjb.setVisibility(8);
    }
    if (!q.Ad()) {
      this.qja.setVisibility(8);
    }
    this.qjc.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8514638446592L, 63439);
        if ((!SnsUploadConfigView.a(SnsUploadConfigView.this)) && (SnsUploadConfigView.b(SnsUploadConfigView.this)))
        {
          com.tencent.mm.ui.base.h.h(paramContext, i.j.pkJ, i.j.cUG);
          GMTrace.o(8514638446592L, 63439);
          return;
        }
        paramAnonymousView = SnsUploadConfigView.this;
        if (SnsUploadConfigView.a(SnsUploadConfigView.this)) {}
        for (boolean bool = false;; bool = true)
        {
          SnsUploadConfigView.a(paramAnonymousView, bool);
          SnsUploadConfigView.c(SnsUploadConfigView.this);
          GMTrace.o(8514638446592L, 63439);
          return;
        }
      }
    });
    this.qja.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8481218232320L, 63190);
        paramAnonymousView = SnsUploadConfigView.this;
        if (SnsUploadConfigView.d(SnsUploadConfigView.this)) {}
        for (boolean bool = false;; bool = true)
        {
          SnsUploadConfigView.b(paramAnonymousView, bool);
          if (SnsUploadConfigView.d(SnsUploadConfigView.this)) {
            SnsUploadConfigView.e(SnsUploadConfigView.this);
          }
          SnsUploadConfigView.f(SnsUploadConfigView.this);
          GMTrace.o(8481218232320L, 63190);
          return;
        }
      }
    });
    this.qjb.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8587250237440L, 63980);
        paramAnonymousView = SnsUploadConfigView.this;
        if (SnsUploadConfigView.g(SnsUploadConfigView.this)) {}
        for (boolean bool = false;; bool = true)
        {
          SnsUploadConfigView.c(paramAnonymousView, bool);
          if (SnsUploadConfigView.g(SnsUploadConfigView.this)) {
            SnsUploadConfigView.e(SnsUploadConfigView.this);
          }
          SnsUploadConfigView.h(SnsUploadConfigView.this);
          GMTrace.o(8587250237440L, 63980);
          return;
        }
      }
    });
    GMTrace.o(8697979863040L, 64805);
  }
  
  private void pB(int paramInt)
  {
    GMTrace.i(8699053604864L, 64813);
    com.tencent.mm.ui.base.h.a(getContext(), paramInt, i.j.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(8626039160832L, 64269);
        GMTrace.o(8626039160832L, 64269);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(8326330974208L, 62036);
        GMTrace.o(8326330974208L, 62036);
      }
    });
    GMTrace.o(8699053604864L, 64813);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8699187822592L, 64814);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramk == null))
    {
      GMTrace.o(8699187822592L, 64814);
      return;
    }
    GMTrace.o(8699187822592L, 64814);
  }
  
  public final void a(a.c paramc)
  {
    GMTrace.i(8699322040320L, 64815);
    if (this.msk != null) {
      this.msk.cancel();
    }
    switch (6.msI[paramc.ordinal()])
    {
    }
    for (;;)
    {
      bpM();
      GMTrace.o(8699322040320L, 64815);
      return;
      this.qjf = true;
      pB(i.j.eeQ);
      continue;
      this.qjf = false;
      continue;
      this.qjf = false;
      pB(i.j.eeP);
    }
  }
  
  public final void b(a.c paramc)
  {
    GMTrace.i(8699456258048L, 64816);
    switch (6.msI[paramc.ordinal()])
    {
    }
    for (;;)
    {
      bpM();
      GMTrace.o(8699456258048L, 64816);
      return;
      this.qjf = false;
    }
  }
  
  public final void bpK()
  {
    GMTrace.i(8698114080768L, 64806);
    this.qjd = false;
    this.qje = false;
    this.qjf = false;
    this.qjg = false;
    this.qjc.setImageResource(i.i.phE);
    this.qja.setImageResource(i.i.phy);
    this.qjb.setImageResource(i.i.phI);
    GMTrace.o(8698114080768L, 64806);
  }
  
  final void bpL()
  {
    GMTrace.i(8698248298496L, 64807);
    if (this.qjg)
    {
      com.tencent.mm.kernel.h.xz();
      int i = bg.e((Integer)com.tencent.mm.kernel.h.xy().xh().get(9, null));
      if (i == 0) {
        com.tencent.mm.ui.base.h.a(getContext(), i.j.ebn, i.j.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8402566643712L, 62604);
            com.tencent.mm.plugin.sns.c.a.hnH.h(new Intent(), SnsUploadConfigView.i(SnsUploadConfigView.this));
            GMTrace.o(8402566643712L, 62604);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8345792544768L, 62181);
            GMTrace.o(8345792544768L, 62181);
          }
        });
      }
      for (i = 0;; i = 1)
      {
        if (i != 0) {
          break label103;
        }
        this.qjg = false;
        GMTrace.o(8698248298496L, 64807);
        return;
        if (i == 0) {
          break;
        }
      }
      label103:
      this.qjc.setImageResource(i.i.phF);
      GMTrace.o(8698248298496L, 64807);
      return;
    }
    this.qjc.setImageResource(i.i.phE);
    GMTrace.o(8698248298496L, 64807);
  }
  
  final void bpM()
  {
    GMTrace.i(8698516733952L, 64809);
    if (this.qjf)
    {
      if (!this.qjk.ciQ()) {
        com.tencent.mm.ui.base.h.a(getContext(), i.j.eaX, i.j.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8581613092864L, 63938);
            paramAnonymousDialogInterface = SnsUploadConfigView.this;
            Context localContext = SnsUploadConfigView.this.getContext();
            SnsUploadConfigView.this.getContext().getString(i.j.cUG);
            SnsUploadConfigView.a(paramAnonymousDialogInterface, com.tencent.mm.ui.base.h.a(localContext, SnsUploadConfigView.this.getContext().getString(i.j.eeO), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(8323378184192L, 62014);
                GMTrace.o(8323378184192L, 62014);
              }
            }));
            SnsUploadConfigView.j(SnsUploadConfigView.this).a(SnsUploadConfigView.this, SnsUploadConfigView.this.getContext());
            GMTrace.o(8581613092864L, 63938);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8718917828608L, 64961);
            GMTrace.o(8718917828608L, 64961);
          }
        });
      }
      for (int i = 0; i == 0; i = 1)
      {
        this.qjf = false;
        GMTrace.o(8698516733952L, 64809);
        return;
      }
      this.qjb.setImageResource(i.i.phJ);
      GMTrace.o(8698516733952L, 64809);
      return;
    }
    this.qjb.setImageResource(i.i.phI);
    GMTrace.o(8698516733952L, 64809);
  }
  
  public final int bpN()
  {
    GMTrace.i(8698650951680L, 64810);
    int i = 0;
    if (this.qeP) {
      i = 1;
    }
    GMTrace.o(8698650951680L, 64810);
    return i;
  }
  
  public final int bpO()
  {
    GMTrace.i(8698919387136L, 64812);
    int j = 0;
    if (this.qjd) {
      j = 1;
    }
    int i = j;
    if (this.qje) {
      i = j | 0x2;
    }
    j = i;
    if (this.qjf) {
      j = i | 0x8;
    }
    i = j;
    if (this.qjg) {
      i = j | 0x4;
    }
    GMTrace.o(8698919387136L, 64812);
    return i;
  }
  
  final void ie(boolean paramBoolean)
  {
    GMTrace.i(8698382516224L, 64808);
    if (this.qje)
    {
      if (!q.Af()) {
        com.tencent.mm.ui.base.h.a(getContext(), i.j.dYR, i.j.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8323780837376L, 62017);
            d.a(SnsUploadConfigView.this.getContext(), ".ui.account.FacebookAuthUI", new Intent().putExtra("shake_music", true));
            GMTrace.o(8323780837376L, 62017);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8549937709056L, 63702);
            GMTrace.o(8549937709056L, 63702);
          }
        });
      }
      for (int i = 0; i == 0; i = 1)
      {
        this.qje = false;
        GMTrace.o(8698382516224L, 64808);
        return;
      }
      if ((!paramBoolean) && (!this.qji) && (q.Af()))
      {
        final fo localfo = new fo();
        localfo.eDO = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8677041897472L, 64649);
            if (!localfo.eHY.eDb) {
              SnsUploadConfigView.k(SnsUploadConfigView.this);
            }
            GMTrace.o(8677041897472L, 64649);
          }
        };
        com.tencent.mm.sdk.b.a.vgX.a(localfo, Looper.myLooper());
      }
      this.qja.setImageResource(i.i.phz);
      GMTrace.o(8698382516224L, 64808);
      return;
    }
    this.qja.setImageResource(i.i.phy);
    GMTrace.o(8698382516224L, 64808);
  }
  
  public final void jdMethod_if(boolean paramBoolean)
  {
    GMTrace.i(8698785169408L, 64811);
    this.qeP = paramBoolean;
    if (paramBoolean) {
      bpK();
    }
    GMTrace.o(8698785169408L, 64811);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsUploadConfigView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */