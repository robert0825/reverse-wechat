package com.tencent.mm.pluginsdk.ui.tools;

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
import com.tencent.mm.plugin.ag.a.h;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.3;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.io.File;

public class VideoSightView
  extends SightPlayImageView
  implements f
{
  protected int duration;
  private boolean jGN;
  protected String oRS;
  private boolean pJR;
  public boolean pJS;
  
  public VideoSightView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1121925988352L, 8359);
    this.duration = 0;
    this.pJS = true;
    this.jGN = false;
    init();
    GMTrace.o(1121925988352L, 8359);
  }
  
  public VideoSightView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1121791770624L, 8358);
    this.duration = 0;
    this.pJS = true;
    this.jGN = false;
    init();
    GMTrace.o(1121791770624L, 8358);
  }
  
  public VideoSightView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1121657552896L, 8357);
    this.duration = 0;
    this.pJS = true;
    this.jGN = false;
    init();
    GMTrace.o(1121657552896L, 8357);
  }
  
  public final void a(f.a parama)
  {
    GMTrace.i(1123268165632L, 8369);
    this.oTm = parama;
    GMTrace.o(1123268165632L, 8369);
  }
  
  public final void a(f.b paramb)
  {
    GMTrace.i(16381810573312L, 122054);
    GMTrace.o(16381810573312L, 122054);
  }
  
  public final void a(f.c paramc)
  {
    GMTrace.i(16381676355584L, 122053);
    GMTrace.o(16381676355584L, 122053);
  }
  
  public final void a(f.d paramd)
  {
    GMTrace.i(17440385794048L, 129941);
    GMTrace.o(17440385794048L, 129941);
  }
  
  public final void a(f.e parame)
  {
    GMTrace.i(1124878778368L, 8381);
    GMTrace.o(1124878778368L, 8381);
  }
  
  public double bgO()
  {
    GMTrace.i(1124073472000L, 8375);
    if (this.oTg != null)
    {
      b localb = this.oTg;
      if (localb.oSu != -1.0D)
      {
        d = localb.oSu;
        GMTrace.o(1124073472000L, 8375);
        return d;
      }
      double d = localb.oSr;
      GMTrace.o(1124073472000L, 8375);
      return d;
    }
    GMTrace.o(1124073472000L, 8375);
    return 0.0D;
  }
  
  public final long bgP()
  {
    GMTrace.i(1124476125184L, 8378);
    GMTrace.o(1124476125184L, 8378);
    return 0L;
  }
  
  public final void c(double paramDouble, boolean paramBoolean)
  {
    GMTrace.i(1124744560640L, 8380);
    o(paramDouble);
    GMTrace.o(1124744560640L, 8380);
  }
  
  public final void ci(boolean paramBoolean)
  {
    GMTrace.i(1123133947904L, 8368);
    if (this.oTg != null) {
      this.oTg.isLoop = paramBoolean;
    }
    GMTrace.o(1123133947904L, 8368);
  }
  
  public int getCurrentPosition()
  {
    GMTrace.i(1123402383360L, 8370);
    w.v("MicroMsg.VideoSightView", "get current position");
    GMTrace.o(1123402383360L, 8370);
    return 0;
  }
  
  public int getDuration()
  {
    GMTrace.i(1123536601088L, 8371);
    int i = super.getDuration();
    w.v("MicroMsg.VideoSightView", "get duration " + i);
    GMTrace.o(1123536601088L, 8371);
    return i;
  }
  
  public void hw(boolean paramBoolean)
  {
    GMTrace.i(1124341907456L, 8377);
    if (paramBoolean)
    {
      a(new b.f()
      {
        public final void a(b paramAnonymousb, long paramAnonymousLong)
        {
          GMTrace.i(1105551425536L, 8237);
          if (VideoSightView.this.duration == 0) {
            VideoSightView.this.duration = VideoSightView.this.getDuration();
          }
          if (VideoSightView.this.oTm != null)
          {
            w.v("MicroMsg.VideoSightView", "onPlayTime, currentTime: %s, duration: %s", new Object[] { Long.valueOf(paramAnonymousLong), Integer.valueOf(VideoSightView.this.duration) });
            VideoSightView.this.oTm.bM((int)paramAnonymousLong, VideoSightView.this.duration);
          }
          GMTrace.o(1105551425536L, 8237);
        }
      });
      GMTrace.o(1124341907456L, 8377);
      return;
    }
    a(null);
    GMTrace.o(1124341907456L, 8377);
  }
  
  protected void init()
  {
    GMTrace.i(1122060206080L, 8360);
    if (bg.aq(p.fQL.fQd, "").equals("other")) {
      w.i("MicroMsg.VideoSightView", "init::use other player");
    }
    for (;;)
    {
      a(new b.e()
      {
        public final void a(b paramAnonymousb, int paramAnonymousInt)
        {
          GMTrace.i(1141924429824L, 8508);
          if (-1 == paramAnonymousInt)
          {
            if (VideoSightView.this.oTm != null)
            {
              VideoSightView.this.oTm.onError(0, 0);
              GMTrace.o(1141924429824L, 8508);
            }
          }
          else if ((paramAnonymousInt == 0) && (VideoSightView.this.oTm != null)) {
            VideoSightView.this.oTm.onCompletion();
          }
          GMTrace.o(1141924429824L, 8508);
        }
      });
      GMTrace.o(1122060206080L, 8360);
      return;
      ht(true);
    }
  }
  
  public boolean isPlaying()
  {
    GMTrace.i(1122597076992L, 8364);
    boolean bool = this.oTg.bgr();
    GMTrace.o(1122597076992L, 8364);
    return bool;
  }
  
  public final boolean j(Context paramContext, boolean paramBoolean)
  {
    boolean bool = false;
    GMTrace.i(1123939254272L, 8374);
    if (this.oRS == null)
    {
      w.e("MicroMsg.VideoSightView", "start::use path is null!");
      GMTrace.o(1123939254272L, 8374);
      return false;
    }
    if ((bg.aq(p.fQL.fQd, "").equals("other")) || (!b.GC(this.oRS)))
    {
      w.i("MicroMsg.VideoSightView", "start::use other player, path %s, has called %B", new Object[] { this.oRS, Boolean.valueOf(this.pJR) });
      if ((this.pJR) && (!paramBoolean))
      {
        GMTrace.o(1123939254272L, 8374);
        return false;
      }
      Intent localIntent = new Intent();
      localIntent.setAction("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.fromFile(new File(this.oRS)), "video/*");
      try
      {
        paramContext.startActivity(Intent.createChooser(localIntent, paramContext.getString(a.h.qzy)));
        this.pJR = true;
        GMTrace.o(1123939254272L, 8374);
        return false;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.VideoSightView", "startActivity fail, activity not found");
          h.bm(paramContext, paramContext.getResources().getString(a.h.egs));
        }
      }
    }
    ar(this.oRS, false);
    paramBoolean = bool;
    if (!this.jGN) {
      paramBoolean = true;
    }
    ht(paramBoolean);
    GMTrace.o(1123939254272L, 8374);
    return true;
  }
  
  public void o(double paramDouble)
  {
    GMTrace.i(1124207689728L, 8376);
    if (this.oTg != null)
    {
      b localb = this.oTg;
      w.v("MicroMsg.SightPlayController", "seekToFrame now %f %s", new Object[] { Double.valueOf(paramDouble), bg.bQW().toString() });
      o.d(new b.3(localb, paramDouble), 0L);
    }
    GMTrace.o(1124207689728L, 8376);
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(1122462859264L, 8363);
    super.onConfigurationChanged(paramConfiguration);
    if (this.pJS) {
      tW(getResources().getDisplayMetrics().widthPixels);
    }
    GMTrace.o(1122462859264L, 8363);
  }
  
  public final void onDetach()
  {
    GMTrace.i(1123670818816L, 8372);
    a.vgX.c(this.oTg.bgv());
    GMTrace.o(1123670818816L, 8372);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1122328641536L, 8362);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    w.v("MicroMsg.VideoSightView", "ashutest::on layout changed %B, %d %d %d %d %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Boolean.valueOf(this.oTn) });
    if ((this.oTn) && (paramInt3 - paramInt1 > 0)) {
      tW(paramInt3 - paramInt1);
    }
    GMTrace.o(1122328641536L, 8362);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1122194423808L, 8361);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(1122194423808L, 8361);
  }
  
  public void pause()
  {
    GMTrace.i(1122999730176L, 8367);
    ar(this.oRS, true);
    GMTrace.o(1122999730176L, 8367);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(1124610342912L, 8379);
    this.jGN = paramBoolean;
    if (!this.jGN) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      ht(paramBoolean);
      GMTrace.o(1124610342912L, 8379);
      return;
    }
  }
  
  public final void setVideoPath(String paramString)
  {
    GMTrace.i(1122731294720L, 8365);
    if (this.oTm == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.VideoSightView", "set sight path %s, callback null ? %B", new Object[] { paramString, Boolean.valueOf(bool) });
      this.duration = 0;
      this.oRS = paramString;
      if (this.oTm != null) {
        this.oTm.Xq();
      }
      GMTrace.o(1122731294720L, 8365);
      return;
    }
  }
  
  public boolean start()
  {
    GMTrace.i(1123805036544L, 8373);
    boolean bool = j(getContext(), false);
    GMTrace.o(1123805036544L, 8373);
    return bool;
  }
  
  public void stop()
  {
    GMTrace.i(1122865512448L, 8366);
    this.oTg.clear();
    GMTrace.o(1122865512448L, 8366);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\VideoSightView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */