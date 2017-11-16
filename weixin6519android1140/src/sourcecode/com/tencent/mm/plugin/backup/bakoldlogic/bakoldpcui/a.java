package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jb;
import com.tencent.mm.g.a.lh;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.d;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import java.lang.ref.WeakReference;

public final class a
  extends b
  implements e.d
{
  public static String TAG;
  private static boolean jgp;
  private ae handler;
  private View jcL;
  public int jfR;
  public int jgq;
  private com.tencent.mm.sdk.b.c jgr;
  
  static
  {
    GMTrace.i(14765023821824L, 110008);
    TAG = "MicroMsg.BakChatBanner";
    jgp = false;
    GMTrace.o(14765023821824L, 110008);
  }
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14762473684992L, 109989);
    this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdg;
    this.jgq = 0;
    this.jcL = null;
    this.handler = new ae(Looper.getMainLooper());
    if (this.view != null)
    {
      this.jcL = this.view.findViewById(R.h.bge);
      this.jcL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14775090151424L, 110083);
          a.this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR;
          Intent localIntent;
          if ((com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdj == a.this.jfR) || (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdk == a.this.jfR) || (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdm == a.this.jfR) || (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdn == a.this.jfR))
          {
            w.d(a.TAG, "OnClickListener goToBakOperatingUI PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR), Integer.valueOf(a.this.jgq) });
            paramAnonymousView = a.this;
            localIntent = new Intent((Context)paramAnonymousView.tyb.get(), BakOperatingUI.class);
            localIntent.putExtra("from_bak_banner", true);
            MMWizardActivity.A((Context)paramAnonymousView.tyb.get(), localIntent);
            GMTrace.o(14775090151424L, 110083);
            return;
          }
          if (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdl == a.this.jfR)
          {
            w.d(a.TAG, "OnClickListener goToBakFinishUI PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR), Integer.valueOf(a.this.jgq) });
            paramAnonymousView = a.this;
            localIntent = new Intent((Context)paramAnonymousView.tyb.get(), BakFinishUI.class);
            localIntent.putExtra("cmd", 1);
            MMWizardActivity.A((Context)paramAnonymousView.tyb.get(), localIntent);
            GMTrace.o(14775090151424L, 110083);
            return;
          }
          GMTrace.o(14775090151424L, 110083);
        }
      });
    }
    abd();
    this.jgr = new com.tencent.mm.sdk.b.c() {};
    com.tencent.mm.sdk.b.a.vgX.b(this.jgr);
    GMTrace.o(14762473684992L, 109989);
  }
  
  public final boolean abd()
  {
    GMTrace.i(14762876338176L, 109992);
    this.jgq = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().agu();
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().a(this);
    boolean bool = dj(true);
    GMTrace.o(14762876338176L, 109992);
    return bool;
  }
  
  public final void aeg()
  {
    GMTrace.i(14763547426816L, 109997);
    GMTrace.o(14763547426816L, 109997);
  }
  
  public final void aga()
  {
    GMTrace.i(14763413209088L, 109996);
    w.d(TAG, "onNetFinish PCBannerStatus:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR) });
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl();
    e.kL(17);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14766634434560L, 110020);
        a.this.abd();
        GMTrace.o(14766634434560L, 110020);
      }
    });
    GMTrace.o(14763413209088L, 109996);
  }
  
  public final void agx()
  {
    GMTrace.i(14763681644544L, 109998);
    GMTrace.o(14763681644544L, 109998);
  }
  
  public final void destroy()
  {
    GMTrace.i(14763815862272L, 109999);
    com.tencent.mm.sdk.b.a.vgX.c(this.jgr);
    GMTrace.o(14763815862272L, 109999);
  }
  
  boolean dj(boolean paramBoolean)
  {
    GMTrace.i(14762742120448L, 109991);
    this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR;
    w.d(TAG, "dealwithPCBakBanner PCBannerStatus:%d, setCallBack:%b", new Object[] { Integer.valueOf(this.jfR), Boolean.valueOf(paramBoolean) });
    if ((this.jfR >= com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdj) && (this.jfR <= com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdn))
    {
      this.jcL.setVisibility(0);
      if ((paramBoolean) && (!com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().agr())) {
        com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().a(this);
      }
      if (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdj == this.jfR)
      {
        ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cLm);
        ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cXI, new Object[] { Integer.valueOf(this.jgq) }));
      }
      for (;;)
      {
        GMTrace.o(14762742120448L, 109991);
        return true;
        if (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdk == this.jfR)
        {
          ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cLm);
          ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cXL, new Object[] { Integer.valueOf(this.jgq) }));
        }
        else if (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdl == this.jfR)
        {
          ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cXK));
          ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cLl);
        }
        else if (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdm == this.jfR)
        {
          ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cLm);
          ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cXH, new Object[] { Integer.valueOf(this.jgq) }));
        }
        else if (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdn == this.jfR)
        {
          ((TextView)this.view.findViewById(R.h.bgg)).setText(ab.getContext().getString(R.l.cXJ));
          ((ImageView)this.view.findViewById(R.h.bgf)).setImageResource(R.k.cLl);
        }
      }
    }
    this.jcL.setVisibility(8);
    GMTrace.o(14762742120448L, 109991);
    return false;
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14762607902720L, 109990);
    int i = R.i.bge;
    GMTrace.o(14762607902720L, 109990);
    return i;
  }
  
  public final int getOrder()
  {
    GMTrace.i(17264829005824L, 128633);
    GMTrace.o(17264829005824L, 128633);
    return 3;
  }
  
  public final void kP(int paramInt)
  {
    GMTrace.i(14763950080000L, 110000);
    w.d(TAG, "onPrepare PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR), Integer.valueOf(paramInt) });
    this.jgq = paramInt;
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14769453006848L, 110041);
        a.this.abd();
        GMTrace.o(14769453006848L, 110041);
      }
    });
    GMTrace.o(14763950080000L, 110000);
  }
  
  public final void kQ(int paramInt)
  {
    GMTrace.i(14763144773632L, 109994);
    w.d(TAG, "onNetProgress PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR), Integer.valueOf(paramInt) });
    this.jgq = paramInt;
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14769989877760L, 110045);
        a.this.abd();
        GMTrace.o(14769989877760L, 110045);
      }
    });
    GMTrace.o(14763144773632L, 109994);
  }
  
  public final void kR(int paramInt)
  {
    GMTrace.i(14763278991360L, 109995);
    w.d(TAG, "onMergeProgress PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR), Integer.valueOf(paramInt) });
    GMTrace.o(14763278991360L, 109995);
  }
  
  public final void onError(int paramInt)
  {
    GMTrace.i(14763010555904L, 109993);
    GMTrace.o(14763010555904L, 109993);
  }
  
  public final void release()
  {
    GMTrace.i(18453058551808L, 137486);
    this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdg;
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().ags();
    GMTrace.o(18453058551808L, 137486);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */