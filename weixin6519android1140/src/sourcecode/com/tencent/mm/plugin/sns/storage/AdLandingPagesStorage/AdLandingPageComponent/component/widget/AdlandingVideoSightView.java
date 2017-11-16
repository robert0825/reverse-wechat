package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.b;
import com.tencent.mm.pluginsdk.ui.tools.f.c;
import com.tencent.mm.pluginsdk.ui.tools.f.d;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.io.File;

public class AdlandingVideoSightView
  extends AdlandingSightPlayImageView
  implements f
{
  protected int duration;
  private boolean jGN;
  protected String oRS;
  private boolean pJR;
  private boolean pJS;
  
  public AdlandingVideoSightView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(15269011390464L, 113763);
    this.duration = 0;
    this.pJS = true;
    this.jGN = false;
    init();
    GMTrace.o(15269011390464L, 113763);
  }
  
  public AdlandingVideoSightView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(15268877172736L, 113762);
    this.duration = 0;
    this.pJS = true;
    this.jGN = false;
    init();
    GMTrace.o(15268877172736L, 113762);
  }
  
  private void init()
  {
    GMTrace.i(15269279825920L, 113765);
    if (bg.aq(p.fQL.fQd, "").equals("other")) {
      w.i("MicroMsg.VideoSightView", "init::use other player");
    }
    for (;;)
    {
      a.e local1 = new a.e()
      {
        public final void uO(int paramAnonymousInt)
        {
          GMTrace.i(15259481931776L, 113692);
          if (-1 == paramAnonymousInt)
          {
            if (AdlandingVideoSightView.this.oTm != null)
            {
              AdlandingVideoSightView.this.oTm.onError(0, 0);
              GMTrace.o(15259481931776L, 113692);
            }
          }
          else if ((paramAnonymousInt == 0) && (AdlandingVideoSightView.this.oTm != null)) {
            AdlandingVideoSightView.this.oTm.onCompletion();
          }
          GMTrace.o(15259481931776L, 113692);
        }
      };
      this.pJO.pJF = local1;
      GMTrace.o(15269279825920L, 113765);
      return;
      ht(true);
    }
  }
  
  public final void a(f.a parama)
  {
    GMTrace.i(15270487785472L, 113774);
    this.oTm = parama;
    GMTrace.o(15270487785472L, 113774);
  }
  
  public final void a(f.b paramb)
  {
    GMTrace.i(16340203077632L, 121744);
    GMTrace.o(16340203077632L, 121744);
  }
  
  public final void a(f.c paramc)
  {
    GMTrace.i(16340068859904L, 121743);
    GMTrace.o(16340068859904L, 121743);
  }
  
  public final void a(f.d paramd)
  {
    GMTrace.i(17099338547200L, 127400);
    GMTrace.o(17099338547200L, 127400);
  }
  
  public final void a(f.e parame)
  {
    GMTrace.i(15272098398208L, 113786);
    GMTrace.o(15272098398208L, 113786);
  }
  
  public final double bgO()
  {
    GMTrace.i(15271293091840L, 113780);
    if (this.pJO != null)
    {
      a locala = this.pJO;
      if (locala.oSu != -1.0D)
      {
        d = locala.oSu;
        GMTrace.o(15271293091840L, 113780);
        return d;
      }
      double d = locala.oSr;
      GMTrace.o(15271293091840L, 113780);
      return d;
    }
    GMTrace.o(15271293091840L, 113780);
    return 0.0D;
  }
  
  public final long bgP()
  {
    GMTrace.i(15271695745024L, 113783);
    GMTrace.o(15271695745024L, 113783);
    return 0L;
  }
  
  public final void c(double paramDouble, boolean paramBoolean)
  {
    GMTrace.i(15271964180480L, 113785);
    o(paramDouble);
    GMTrace.o(15271964180480L, 113785);
  }
  
  public final void ci(boolean paramBoolean)
  {
    GMTrace.i(15270353567744L, 113773);
    if (this.pJO != null) {
      this.pJO.isLoop = paramBoolean;
    }
    GMTrace.o(15270353567744L, 113773);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(15270622003200L, 113775);
    w.v("MicroMsg.VideoSightView", "get current position");
    GMTrace.o(15270622003200L, 113775);
    return 0;
  }
  
  public final int getDuration()
  {
    GMTrace.i(15270756220928L, 113776);
    int i = super.getDuration();
    w.v("MicroMsg.VideoSightView", "get duration " + i);
    GMTrace.o(15270756220928L, 113776);
    return i;
  }
  
  public final void hw(boolean paramBoolean)
  {
    GMTrace.i(15271561527296L, 113782);
    if (paramBoolean)
    {
      a(new a.f()
      {
        public final void dM(long paramAnonymousLong)
        {
          GMTrace.i(15250623561728L, 113626);
          if (AdlandingVideoSightView.this.duration == 0) {
            AdlandingVideoSightView.this.duration = AdlandingVideoSightView.this.getDuration();
          }
          if (AdlandingVideoSightView.this.oTm != null)
          {
            w.v("MicroMsg.VideoSightView", "onPlayTime, currentTime: %s, duration: %s", new Object[] { Long.valueOf(paramAnonymousLong), Integer.valueOf(AdlandingVideoSightView.this.duration) });
            AdlandingVideoSightView.this.oTm.bM((int)paramAnonymousLong, AdlandingVideoSightView.this.duration);
          }
          GMTrace.o(15250623561728L, 113626);
        }
      });
      GMTrace.o(15271561527296L, 113782);
      return;
    }
    a(null);
    GMTrace.o(15271561527296L, 113782);
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(15269816696832L, 113769);
    boolean bool = this.pJO.bgr();
    GMTrace.o(15269816696832L, 113769);
    return bool;
  }
  
  public final boolean j(Context paramContext, boolean paramBoolean)
  {
    boolean bool = false;
    GMTrace.i(15271158874112L, 113779);
    if (this.oRS == null)
    {
      w.e("MicroMsg.VideoSightView", "start::use path is null!");
      GMTrace.o(15271158874112L, 113779);
      return false;
    }
    if ((bg.aq(p.fQL.fQd, "").equals("other")) || (!b.GC(this.oRS)))
    {
      w.i("MicroMsg.VideoSightView", "start::use other player, path %s, has called %B", new Object[] { this.oRS, Boolean.valueOf(this.pJR) });
      if ((this.pJR) && (!paramBoolean))
      {
        GMTrace.o(15271158874112L, 113779);
        return false;
      }
      Intent localIntent = new Intent();
      localIntent.setAction("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.fromFile(new File(this.oRS)), "video/*");
      try
      {
        paramContext.startActivity(Intent.createChooser(localIntent, paramContext.getString(i.j.dve)));
        this.pJR = true;
        GMTrace.o(15271158874112L, 113779);
        return false;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.VideoSightView", "startActivity fail, activity not found");
          h.bm(paramContext, paramContext.getResources().getString(i.j.egs));
        }
      }
    }
    ar(this.oRS, false);
    paramBoolean = bool;
    if (!this.jGN) {
      paramBoolean = true;
    }
    ht(paramBoolean);
    GMTrace.o(15271158874112L, 113779);
    return true;
  }
  
  public final void o(double paramDouble)
  {
    GMTrace.i(15271427309568L, 113781);
    if (this.pJO != null)
    {
      a locala = this.pJO;
      w.v("MicroMsg.SightPlayController", "seekToFrame now %f %s", new Object[] { Double.valueOf(paramDouble), bg.bQW().toString() });
      o.d(new a.2(locala, paramDouble), 0L);
    }
    GMTrace.o(15271427309568L, 113781);
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(15269682479104L, 113768);
    super.onConfigurationChanged(paramConfiguration);
    if (this.pJS) {
      tW(getResources().getDisplayMetrics().widthPixels);
    }
    GMTrace.o(15269682479104L, 113768);
  }
  
  public final void onDetach()
  {
    GMTrace.i(15270890438656L, 113777);
    com.tencent.mm.sdk.b.a.vgX.c(this.pJO.bgv());
    GMTrace.o(15270890438656L, 113777);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(15269548261376L, 113767);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    w.v("MicroMsg.VideoSightView", "ashutest::on layout changed %B, %d %d %d %d %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Boolean.valueOf(this.oTn) });
    if ((this.oTn) && (paramInt3 - paramInt1 > 0)) {
      tW(paramInt3 - paramInt1);
    }
    GMTrace.o(15269548261376L, 113767);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(15269414043648L, 113766);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(15269414043648L, 113766);
  }
  
  public final void pause()
  {
    GMTrace.i(15270219350016L, 113772);
    ar(this.oRS, true);
    GMTrace.o(15270219350016L, 113772);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(15271829962752L, 113784);
    this.jGN = paramBoolean;
    if (!this.jGN) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      ht(paramBoolean);
      GMTrace.o(15271829962752L, 113784);
      return;
    }
  }
  
  public final void setVideoPath(String paramString)
  {
    GMTrace.i(15269950914560L, 113770);
    if (this.oTm == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.VideoSightView", "set sight path %s, callback null ? %B", new Object[] { paramString, Boolean.valueOf(bool) });
      this.duration = 0;
      this.oRS = paramString;
      if (this.oTm != null) {
        this.oTm.Xq();
      }
      GMTrace.o(15269950914560L, 113770);
      return;
    }
  }
  
  public final boolean start()
  {
    GMTrace.i(15271024656384L, 113778);
    boolean bool = j(getContext(), false);
    GMTrace.o(15271024656384L, 113778);
    return bool;
  }
  
  public final void stop()
  {
    GMTrace.i(15270085132288L, 113771);
    this.pJO.clear();
    GMTrace.o(15270085132288L, 113771);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\AdlandingVideoSightView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */