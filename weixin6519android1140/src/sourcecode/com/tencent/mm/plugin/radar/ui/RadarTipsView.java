package com.tencent.mm.plugin.radar.ui;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public class RadarTipsView
  extends RelativeLayout
{
  private boolean obA;
  private int obB;
  int obC;
  private ae obg;
  Animation obh;
  Animation obi;
  TextView obk;
  View obl;
  LinearLayout obm;
  private final int obn;
  private final int obo;
  private final int obp;
  private final int obq;
  private final int obr;
  ae obs;
  boolean obt;
  private boolean obu;
  boolean obv;
  boolean obw;
  int obx;
  long oby;
  boolean obz;
  
  public RadarTipsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8907359518720L, 66365);
    this.obg = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8924405170176L, 66492);
        RadarTipsView.this.setVisibility(8);
        GMTrace.o(8924405170176L, 66492);
      }
    };
    this.obh = null;
    this.obi = null;
    this.obk = null;
    this.obl = null;
    this.obm = null;
    this.obn = 0;
    this.obo = 1;
    this.obp = 2;
    this.obq = 3;
    this.obr = 3;
    this.obs = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8905077817344L, 66348);
        if (paramAnonymousMessage.what == 0)
        {
          RadarTipsView.this.aZY();
          GMTrace.o(8905077817344L, 66348);
          return;
        }
        if (paramAnonymousMessage.what == 1)
        {
          if ((RadarTipsView.c(RadarTipsView.this)) && (RadarTipsView.d(RadarTipsView.this)))
          {
            paramAnonymousMessage = RadarTipsView.this;
            int i = R.l.dPw;
            paramAnonymousMessage.bG(paramAnonymousMessage.getContext().getString(i), -1);
            GMTrace.o(8905077817344L, 66348);
          }
        }
        else if (paramAnonymousMessage.what != 2)
        {
          if (paramAnonymousMessage.what == 3)
          {
            paramAnonymousMessage = RadarTipsView.this;
            paramAnonymousMessage.obt = true;
            paramAnonymousMessage.obC = 2;
            w.d("MicroMsg.RadarTipsView", "showNoviceEducation");
            paramAnonymousMessage.obv = true;
            paramAnonymousMessage.obl.setVisibility(8);
            paramAnonymousMessage.obl.clearAnimation();
            paramAnonymousMessage.setVisibility(0);
            paramAnonymousMessage.obm.setVisibility(0);
            paramAnonymousMessage.obm.startAnimation(paramAnonymousMessage.obh);
            paramAnonymousMessage.obm.requestFocus();
            GMTrace.o(8905077817344L, 66348);
            return;
          }
          if (paramAnonymousMessage.what == 3) {
            RadarTipsView.this.aZX();
          }
        }
        GMTrace.o(8905077817344L, 66348);
      }
    };
    this.obt = false;
    this.obu = true;
    this.obv = false;
    this.obw = false;
    this.obx = 0;
    this.oby = 0L;
    this.obz = false;
    this.obA = false;
    this.obB = 0;
    this.obC = 0;
    GMTrace.o(8907359518720L, 66365);
  }
  
  public RadarTipsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8907493736448L, 66366);
    this.obg = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8924405170176L, 66492);
        RadarTipsView.this.setVisibility(8);
        GMTrace.o(8924405170176L, 66492);
      }
    };
    this.obh = null;
    this.obi = null;
    this.obk = null;
    this.obl = null;
    this.obm = null;
    this.obn = 0;
    this.obo = 1;
    this.obp = 2;
    this.obq = 3;
    this.obr = 3;
    this.obs = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8905077817344L, 66348);
        if (paramAnonymousMessage.what == 0)
        {
          RadarTipsView.this.aZY();
          GMTrace.o(8905077817344L, 66348);
          return;
        }
        if (paramAnonymousMessage.what == 1)
        {
          if ((RadarTipsView.c(RadarTipsView.this)) && (RadarTipsView.d(RadarTipsView.this)))
          {
            paramAnonymousMessage = RadarTipsView.this;
            int i = R.l.dPw;
            paramAnonymousMessage.bG(paramAnonymousMessage.getContext().getString(i), -1);
            GMTrace.o(8905077817344L, 66348);
          }
        }
        else if (paramAnonymousMessage.what != 2)
        {
          if (paramAnonymousMessage.what == 3)
          {
            paramAnonymousMessage = RadarTipsView.this;
            paramAnonymousMessage.obt = true;
            paramAnonymousMessage.obC = 2;
            w.d("MicroMsg.RadarTipsView", "showNoviceEducation");
            paramAnonymousMessage.obv = true;
            paramAnonymousMessage.obl.setVisibility(8);
            paramAnonymousMessage.obl.clearAnimation();
            paramAnonymousMessage.setVisibility(0);
            paramAnonymousMessage.obm.setVisibility(0);
            paramAnonymousMessage.obm.startAnimation(paramAnonymousMessage.obh);
            paramAnonymousMessage.obm.requestFocus();
            GMTrace.o(8905077817344L, 66348);
            return;
          }
          if (paramAnonymousMessage.what == 3) {
            RadarTipsView.this.aZX();
          }
        }
        GMTrace.o(8905077817344L, 66348);
      }
    };
    this.obt = false;
    this.obu = true;
    this.obv = false;
    this.obw = false;
    this.obx = 0;
    this.oby = 0L;
    this.obz = false;
    this.obA = false;
    this.obB = 0;
    this.obC = 0;
    GMTrace.o(8907493736448L, 66366);
  }
  
  public final void Fn(String paramString)
  {
    GMTrace.i(8907762171904L, 66368);
    this.obC = 3;
    bG(paramString, 5000);
    GMTrace.o(8907762171904L, 66368);
  }
  
  public final void aZX()
  {
    GMTrace.i(8907896389632L, 66369);
    this.obt = false;
    this.obC = 0;
    w.d("MicroMsg.RadarTipsView", "hidNoviceEducation");
    this.obs.removeMessages(3);
    if ((getVisibility() == 0) && (this.obm.getVisibility() == 0))
    {
      this.obm.clearAnimation();
      if (this.obl.getAnimation() == this.obi) {
        this.obl.clearAnimation();
      }
      w.d("MicroMsg.RadarTipsView", "hideNoviceEducation real");
      this.obm.startAnimation(this.obi);
    }
    GMTrace.o(8907896389632L, 66369);
  }
  
  public final void aZY()
  {
    GMTrace.i(8908164825088L, 66371);
    w.d("MicroMsg.RadarTipsView", "hideRadarTips");
    if ((getVisibility() == 0) && (this.obl.getVisibility() == 0))
    {
      if (this.obm.getAnimation() == this.obi) {
        this.obm.clearAnimation();
      }
      this.obl.clearAnimation();
      w.d("MicroMsg.RadarTipsView", "hideRadarTips real");
      this.obC = 0;
      this.obt = false;
      this.obl.startAnimation(this.obi);
    }
    GMTrace.o(8908164825088L, 66371);
  }
  
  public final void aZZ()
  {
    GMTrace.i(8908299042816L, 66372);
    this.obt = false;
    this.obs.removeMessages(1);
    this.obs.removeMessages(2);
    this.obs.removeMessages(3);
    GMTrace.o(8908299042816L, 66372);
  }
  
  public final void bG(String paramString, int paramInt)
  {
    GMTrace.i(8907627954176L, 66367);
    this.obt = true;
    this.obm.setVisibility(8);
    this.obm.clearAnimation();
    this.obk.setText(paramString);
    setVisibility(0);
    this.obl.setVisibility(0);
    this.obl.startAnimation(this.obh);
    this.obs.removeMessages(0);
    this.obs.removeMessages(2);
    if (paramInt > 0) {
      this.obs.sendEmptyMessageDelayed(0, paramInt);
    }
    GMTrace.o(8907627954176L, 66367);
  }
  
  public final void gO(boolean paramBoolean)
  {
    GMTrace.i(8908030607360L, 66370);
    this.obu = paramBoolean;
    if (!this.obu)
    {
      aZY();
      aZZ();
      aZX();
    }
    GMTrace.o(8908030607360L, 66370);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\RadarTipsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */