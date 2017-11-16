package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.g.a;
import com.tencent.mm.ad.g.b;
import com.tencent.mm.av.f;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import java.util.ArrayList;
import junit.framework.Assert;

public class OpenBottleUI
  extends FrameLayout
  implements View.OnClickListener, g.a, g.b, m.b, SensorController.a
{
  static SensorController jrf;
  au eAH;
  private com.tencent.mm.e.a.a euQ;
  BottleBeachUI jqX;
  TextView jqY;
  LinearLayout jqZ;
  private boolean jqh;
  FrameLayout jra;
  ImageView jrb;
  TextView jrc;
  TextView jrd;
  TextView jre;
  ThrowBottleAnimUI jrg;
  String jrh;
  private boolean jri;
  private ax jrj;
  private long jrk;
  private boolean jrl;
  TextView jrm;
  MMActivity jrn;
  long jro;
  private boolean jrp;
  
  public OpenBottleUI(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7614842798080L, 56735);
    this.jri = true;
    this.jrk = -1L;
    this.jro = 0L;
    this.jqh = false;
    this.jrp = false;
    this.jqX = ((BottleBeachUI)paramContext);
    at.AR();
    com.tencent.mm.y.c.yK().a(this);
    if (jrf == null) {
      jrf = new SensorController(paramContext.getApplicationContext());
    }
    if (this.jrj == null) {
      this.jrj = new ax(paramContext.getApplicationContext());
    }
    at.AR();
    paramContext = (Boolean)com.tencent.mm.y.c.xh().get(26, Boolean.valueOf(false));
    this.jrl = paramContext.booleanValue();
    if (!paramContext.booleanValue()) {}
    for (boolean bool = true;; bool = false)
    {
      this.jri = bool;
      if (this.euQ != null) {
        this.euQ.ay(this.jri);
      }
      GMTrace.o(7614842798080L, 56735);
      return;
    }
  }
  
  private void F(au paramau)
  {
    GMTrace.i(7615648104448L, 56741);
    if ((com.tencent.mm.p.a.aR(getContext())) || (com.tencent.mm.p.a.aP(this.jqX)))
    {
      w.d("MM.Bottle_OpenBottleUI", "voip is running, can't use the feature");
      GMTrace.o(7615648104448L, 56741);
      return;
    }
    boolean bool;
    if ((paramau != null) && (paramau.bTu()))
    {
      bool = true;
      Assert.assertTrue(bool);
      if ((paramau != null) && (paramau.bTu()) && (!jrf.vkU))
      {
        jrf.a(this);
        Runnable local5 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7649470971904L, 56993);
            OpenBottleUI.a(OpenBottleUI.this, bg.Pw());
            GMTrace.o(7649470971904L, 56993);
          }
        };
        if (!this.jrj.J(local5)) {
          break label154;
        }
      }
    }
    label154:
    for (this.jrk = 0L;; this.jrk = -1L)
    {
      at.AR();
      if ((com.tencent.mm.y.c.isSDCardAvailable()) || (bg.nm(paramau.field_imgPath))) {
        break label164;
      }
      u.fo(this.jqX);
      GMTrace.o(7615648104448L, 56741);
      return;
      bool = false;
      break;
    }
    label164:
    if (this.euQ == null) {
      this.euQ = new com.tencent.mm.e.a.a(this.jqX);
    }
    ad.RS("keep_app_silent");
    q.D(paramau);
    this.euQ.ax(false);
    if ((paramau != null) && (this.euQ.h(paramau.field_imgPath, this.jri)))
    {
      at.AS().e(this.jri, false);
      this.euQ.ewO = this;
      this.euQ.ewN = this;
      this.jrb.setBackgroundResource(R.a.aLm);
      ((AnimationDrawable)this.jrb.getBackground()).start();
      GMTrace.o(7615648104448L, 56741);
      return;
    }
    Toast.makeText(this.jqX, this.jqX.getString(R.l.dgV), 0).show();
    GMTrace.o(7615648104448L, 56741);
  }
  
  private void ahO()
  {
    GMTrace.i(7615782322176L, 56742);
    ad.RT("keep_app_silent");
    ahM();
    if ((this.jrb.getBackground() instanceof AnimationDrawable))
    {
      ((AnimationDrawable)this.jrb.getBackground()).stop();
      this.jrb.setBackgroundResource(R.g.aUy);
    }
    if (this.euQ != null) {
      this.euQ.ax(false);
    }
    dp(true);
    GMTrace.o(7615782322176L, 56742);
  }
  
  static int ln(int paramInt)
  {
    GMTrace.i(7615513886720L, 56740);
    if (paramInt <= 2)
    {
      GMTrace.o(7615513886720L, 56740);
      return 100;
    }
    if (paramInt < 10)
    {
      GMTrace.o(7615513886720L, 56740);
      return (paramInt - 2) * 8 + 100;
    }
    if (paramInt < 60)
    {
      paramInt /= 10;
      GMTrace.o(7615513886720L, 56740);
      return (paramInt + 7) * 8 + 100;
    }
    GMTrace.o(7615513886720L, 56740);
    return 204;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(7616184975360L, 56745);
    w.d("MM.Bottle_OpenBottleUI", "onNotifyChange event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.e("MM.Bottle_OpenBottleUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(7616184975360L, 56745);
      return;
    }
    paramm = (String)paramObject;
    if ((!bg.nm(this.jrh)) && (x.Tt(this.jrh).equals(x.Tt(paramm)))) {
      ahN();
    }
    GMTrace.o(7616184975360L, 56745);
  }
  
  public final void ahM()
  {
    GMTrace.i(7615111233536L, 56737);
    if (jrf != null) {
      jrf.bQD();
    }
    this.jrj.bQE();
    GMTrace.o(7615111233536L, 56737);
  }
  
  final void ahN()
  {
    GMTrace.i(7615379668992L, 56739);
    at.AR();
    Object localObject = com.tencent.mm.y.c.yK().TE(this.jrh);
    int i;
    if ((localObject != null) && (this.jqX != null))
    {
      this.jrd.setText(this.jqX.getString(R.l.dbj, new Object[] { com.tencent.mm.plugin.bottle.a.c.b(this.jqX, (x)localObject) }));
      TextView localTextView = this.jrd;
      if (((af)localObject).fja == 1)
      {
        i = R.k.cMN;
        localTextView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.jrd.setCompoundDrawablePadding(8);
        this.jre.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.jqX, ((af)localObject).signature, this.jre.getTextSize()));
      }
    }
    else
    {
      localObject = x.Tt(this.jrh);
      if (!bg.nm((String)localObject)) {
        break label179;
      }
      localObject = this.jrh;
    }
    label179:
    for (;;)
    {
      a.b.a((ImageView)findViewById(R.h.bhJ), (String)localObject);
      GMTrace.o(7615379668992L, 56739);
      return;
      i = R.k.cMM;
      break;
    }
  }
  
  public final boolean ahP()
  {
    GMTrace.i(7616319193088L, 56746);
    if ((this.euQ != null) && (this.euQ.isPlaying()) && (!this.jri))
    {
      GMTrace.o(7616319193088L, 56746);
      return true;
    }
    GMTrace.o(7616319193088L, 56746);
    return false;
  }
  
  public final void jdMethod_do(boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(7616453410816L, 56747);
    if ((!this.eAH.bTu()) || (this.euQ == null))
    {
      GMTrace.o(7616453410816L, 56747);
      return;
    }
    if (this.jrp)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.jrp = paramBoolean;
        GMTrace.o(7616453410816L, 56747);
        return;
      }
    }
    if ((!paramBoolean) && (this.jrk != -1L) && (bg.aI(this.jrk) > 400L))
    {
      this.jrp = true;
      GMTrace.o(7616453410816L, 56747);
      return;
    }
    this.jrp = false;
    if ((bg.Pw() - this.jro > 500L) && ((paramBoolean) || ((!paramBoolean) && (this.euQ.isPlaying())))) {
      dp(paramBoolean);
    }
    if (this.jrl)
    {
      this.euQ.ay(false);
      at.AS().e(false, false);
      this.jri = false;
      GMTrace.o(7616453410816L, 56747);
      return;
    }
    if (!this.euQ.isPlaying())
    {
      this.euQ.ay(true);
      at.AS().e(true, false);
      this.jri = true;
      GMTrace.o(7616453410816L, 56747);
      return;
    }
    this.euQ.ay(paramBoolean);
    at.AS().e(paramBoolean, false);
    this.jri = paramBoolean;
    if (!paramBoolean) {
      F(this.eAH);
    }
    GMTrace.o(7616453410816L, 56747);
  }
  
  final void dp(boolean paramBoolean)
  {
    GMTrace.i(7616587628544L, 56748);
    this.jrn.dp(paramBoolean);
    GMTrace.o(7616587628544L, 56748);
  }
  
  public void onClick(final View paramView)
  {
    GMTrace.i(7615245451264L, 56738);
    if (R.h.bhO == paramView.getId())
    {
      paramView = this.jrg;
      paramView.jsl = this.eAH.bTu();
      paramView.setVisibility(0);
      paramView.jqX.jpG = false;
      paramView.jqX.li(-1);
      paramView.ahV();
      paramView.ahT();
      paramView.ahU();
      at.AR();
      com.tencent.mm.y.c.yJ().b(new f(this.jrh, 1));
      this.jqh = false;
      paramView = this.jqX;
      this.jqX.getString(R.l.cUG);
      paramView = com.tencent.mm.ui.base.h.a(paramView, this.jqX.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7627727699968L, 56831);
          OpenBottleUI.c(OpenBottleUI.this);
          GMTrace.o(7627727699968L, 56831);
        }
      });
      bc.a(this.jrh, new bc.a()
      {
        public final void Bk()
        {
          GMTrace.i(7603836944384L, 56653);
          if (paramView != null) {
            paramView.dismiss();
          }
          GMTrace.o(7603836944384L, 56653);
        }
        
        public final boolean Bl()
        {
          GMTrace.i(7603702726656L, 56652);
          boolean bool = OpenBottleUI.d(OpenBottleUI.this);
          GMTrace.o(7603702726656L, 56652);
          return bool;
        }
      });
      at.AR();
      com.tencent.mm.y.c.yP().TN(this.jrh);
      ahM();
    }
    do
    {
      ahO();
      do
      {
        GMTrace.o(7615245451264L, 56738);
        return;
        if (R.h.bhM == paramView.getId())
        {
          this.jqX.li(0);
          paramView = new Intent();
          paramView.putExtra("Chat_User", this.jrh);
          com.tencent.mm.plugin.bottle.a.hnH.e(paramView, this.jqX);
          ahM();
          break;
        }
      } while (R.h.bhS != paramView.getId());
    } while ((this.euQ != null) && (this.euQ.isPlaying()));
    F(this.eAH);
    GMTrace.o(7615245451264L, 56738);
  }
  
  public final void onCompletion()
  {
    GMTrace.i(7615916539904L, 56743);
    w.v("MM.Bottle_OpenBottleUI", "voice play completion");
    ahO();
    GMTrace.o(7615916539904L, 56743);
  }
  
  public final void onError()
  {
    GMTrace.i(7616050757632L, 56744);
    w.v("MM.Bottle_OpenBottleUI", "voice play error");
    ahO();
    GMTrace.o(7616050757632L, 56744);
  }
  
  public final void onPause()
  {
    GMTrace.i(7614977015808L, 56736);
    at.AS().sr();
    if ((this.eAH != null) && (this.eAH.bTu())) {
      ahM();
    }
    if (this.euQ != null)
    {
      if (this.euQ.isPlaying()) {
        ahO();
      }
      this.euQ.ay(true);
    }
    GMTrace.o(7614977015808L, 56736);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\OpenBottleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */