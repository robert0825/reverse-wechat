package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.favorite.b.w.a;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;

public class FavVoiceBaseView
  extends LinearLayout
  implements w.a
{
  private int duration;
  private int eIv;
  public com.tencent.mm.plugin.favorite.b.w lcI;
  private a lhA;
  private ViewGroup lhw;
  private TextView lhx;
  private ImageButton lhy;
  private TextView lhz;
  private String path;
  
  public FavVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6451443531776L, 48067);
    this.path = "";
    GMTrace.o(6451443531776L, 48067);
  }
  
  public final void F(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(6451846184960L, 48070);
    this.path = bg.aq(paramString, "");
    this.eIv = paramInt1;
    this.duration = paramInt2;
    if (this.path.equals(this.lcI.path))
    {
      if (this.lcI.axU())
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceBaseView", "updateInfo .isPlay()");
        paramString = this.lhA;
        this.lcI.qm();
        paramString.eA(true);
        GMTrace.o(6451846184960L, 48070);
        return;
      }
      if (this.lcI.isPause())
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceBaseView", "updateInfo .isPause()");
        paramString = this.lhA;
        this.lcI.qm();
        paramString.eA(false);
        GMTrace.o(6451846184960L, 48070);
        return;
      }
      this.lhA.nK(paramInt2);
      GMTrace.o(6451846184960L, 48070);
      return;
    }
    this.lhA.nK(paramInt2);
    GMTrace.o(6451846184960L, 48070);
  }
  
  public final void aW(String paramString, int paramInt)
  {
    GMTrace.i(6452248838144L, 48073);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavVoiceBaseView", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    if (!bg.aq(paramString, "").equals(this.path))
    {
      this.lhA.stop();
      this.lhx.setKeepScreenOn(false);
      GMTrace.o(6452248838144L, 48073);
      return;
    }
    this.lhx.setKeepScreenOn(true);
    this.lhA.begin();
    GMTrace.o(6452248838144L, 48073);
  }
  
  public final void ahO()
  {
    GMTrace.i(6452114620416L, 48072);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavVoiceBaseView", "stop play");
    this.lcI.ahO();
    this.lhA.stop();
    this.lhx.setKeepScreenOn(false);
    GMTrace.o(6452114620416L, 48072);
  }
  
  public final boolean axW()
  {
    GMTrace.i(6451980402688L, 48071);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceBaseView", "pause play");
    boolean bool = this.lcI.axW();
    a locala = this.lhA;
    locala.isPaused = true;
    locala.removeMessages(4096);
    locala.lhB.lhy.setImageResource(R.k.cPx);
    locala.lhB.lhy.setContentDescription(locala.lhB.getContext().getResources().getString(R.l.cUc));
    this.lhx.setKeepScreenOn(false);
    GMTrace.o(6451980402688L, 48071);
    return bool;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(6451577749504L, 48068);
    super.onConfigurationChanged(paramConfiguration);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceBaseView", "on configuration changed, is paused ? %B", new Object[] { Boolean.valueOf(this.lhA.isPaused) });
    if (this.lhA.isPaused) {
      this.lhA.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6456006934528L, 48101);
          FavVoiceBaseView.f(FavVoiceBaseView.this).ayZ();
          GMTrace.o(6456006934528L, 48101);
        }
      }, 128L);
    }
    GMTrace.o(6451577749504L, 48068);
  }
  
  public final void onFinish()
  {
    GMTrace.i(6452383055872L, 48074);
    ahO();
    GMTrace.o(6452383055872L, 48074);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(6451711967232L, 48069);
    super.onFinishInflate();
    this.lhw = ((ViewGroup)findViewById(R.h.clA));
    this.lhz = ((TextView)findViewById(R.h.cly));
    this.lhx = ((TextView)findViewById(R.h.clz));
    this.lhy = ((ImageButton)findViewById(R.h.clx));
    this.lhA = new a();
    this.lhy.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6463657345024L, 48158);
        if ((com.tencent.mm.p.a.aR(paramAnonymousView.getContext())) || (com.tencent.mm.p.a.aP(paramAnonymousView.getContext())))
        {
          GMTrace.o(6463657345024L, 48158);
          return;
        }
        if ((!f.ty()) && (!bg.nm(FavVoiceBaseView.g(FavVoiceBaseView.this))))
        {
          com.tencent.mm.ui.base.u.fo(paramAnonymousView.getContext());
          GMTrace.o(6463657345024L, 48158);
          return;
        }
        if (!bg.aq(FavVoiceBaseView.g(FavVoiceBaseView.this), "").equals(FavVoiceBaseView.h(FavVoiceBaseView.this).path))
        {
          FavVoiceBaseView.i(FavVoiceBaseView.this);
          GMTrace.o(6463657345024L, 48158);
          return;
        }
        if (FavVoiceBaseView.h(FavVoiceBaseView.this).axU())
        {
          FavVoiceBaseView.this.axW();
          GMTrace.o(6463657345024L, 48158);
          return;
        }
        if (!FavVoiceBaseView.j(FavVoiceBaseView.this)) {
          FavVoiceBaseView.i(FavVoiceBaseView.this);
        }
        GMTrace.o(6463657345024L, 48158);
      }
    });
    GMTrace.o(6451711967232L, 48069);
  }
  
  public final void onPause()
  {
    GMTrace.i(6452517273600L, 48075);
    axW();
    GMTrace.o(6452517273600L, 48075);
  }
  
  private final class a
    extends ae
  {
    boolean isPaused;
    float lhC;
    float lhD;
    int lhE;
    int lhF;
    
    public a()
    {
      GMTrace.i(6458288635904L, 48118);
      GMTrace.o(6458288635904L, 48118);
    }
    
    public final void ayZ()
    {
      GMTrace.i(6458825506816L, 48122);
      this.lhE = ((int)((1.0F - this.lhD / this.lhC) * (FavVoiceBaseView.e(FavVoiceBaseView.this).getWidth() - this.lhF)) + this.lhF);
      FavVoiceBaseView.a(FavVoiceBaseView.this).setText(com.tencent.mm.plugin.favorite.b.u.t(FavVoiceBaseView.this.getContext(), Math.min((int)Math.ceil(this.lhD), (int)this.lhC)));
      FavVoiceBaseView.c(FavVoiceBaseView.this).setWidth(this.lhE);
      GMTrace.o(6458825506816L, 48122);
    }
    
    public final void begin()
    {
      GMTrace.i(6458557071360L, 48120);
      stop();
      this.isPaused = false;
      FavVoiceBaseView.b(FavVoiceBaseView.this).setImageResource(R.k.cPy);
      FavVoiceBaseView.b(FavVoiceBaseView.this).setContentDescription(FavVoiceBaseView.this.getContext().getResources().getString(R.l.cTN));
      sendEmptyMessage(4096);
      GMTrace.o(6458557071360L, 48120);
    }
    
    public final void eA(boolean paramBoolean)
    {
      GMTrace.i(14547993755648L, 108391);
      this.lhF = com.tencent.mm.br.a.fromDPToPix(FavVoiceBaseView.this.getContext(), 3);
      FavVoiceBaseView.b(FavVoiceBaseView.this).setImageResource(R.k.cPx);
      FavVoiceBaseView.b(FavVoiceBaseView.this).setContentDescription(FavVoiceBaseView.this.getContext().getResources().getString(R.l.cUc));
      ayZ();
      if (paramBoolean)
      {
        FavVoiceBaseView.b(FavVoiceBaseView.this).setImageResource(R.k.cPy);
        FavVoiceBaseView.b(FavVoiceBaseView.this).setContentDescription(FavVoiceBaseView.this.getContext().getResources().getString(R.l.cTN));
        sendEmptyMessage(4096);
      }
      GMTrace.o(14547993755648L, 108391);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(6459093942272L, 48124);
      this.lhD = Math.max(0.0F, this.lhD - 0.256F);
      ayZ();
      if (this.lhD <= 0.1F)
      {
        GMTrace.o(6459093942272L, 48124);
        return;
      }
      sendEmptyMessageDelayed(4096, 256L);
      GMTrace.o(6459093942272L, 48124);
    }
    
    public final void nK(int paramInt)
    {
      GMTrace.i(6458422853632L, 48119);
      this.isPaused = false;
      this.lhC = x.aD(paramInt);
      this.lhD = this.lhC;
      this.lhF = com.tencent.mm.br.a.fromDPToPix(FavVoiceBaseView.this.getContext(), 3);
      FavVoiceBaseView.a(FavVoiceBaseView.this).setText(com.tencent.mm.plugin.favorite.b.u.t(FavVoiceBaseView.this.getContext(), (int)this.lhC));
      FavVoiceBaseView.b(FavVoiceBaseView.this).setImageResource(R.k.cPx);
      FavVoiceBaseView.b(FavVoiceBaseView.this).setContentDescription(FavVoiceBaseView.this.getContext().getResources().getString(R.l.cUc));
      FavVoiceBaseView.c(FavVoiceBaseView.this).setWidth(this.lhF);
      GMTrace.o(6458422853632L, 48119);
    }
    
    public final void stop()
    {
      GMTrace.i(6458691289088L, 48121);
      this.isPaused = false;
      removeMessages(4096);
      nK(FavVoiceBaseView.d(FavVoiceBaseView.this));
      GMTrace.o(6458691289088L, 48121);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\FavVoiceBaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */