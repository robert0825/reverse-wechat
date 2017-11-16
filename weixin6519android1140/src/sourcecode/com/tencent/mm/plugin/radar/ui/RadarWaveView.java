package com.tencent.mm.plugin.radar.ui;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class RadarWaveView
  extends RelativeLayout
{
  MediaPlayer ocs;
  View oct;
  Animation ocu;
  
  public RadarWaveView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8908970131456L, 66377);
    this.ocs = null;
    GMTrace.o(8908970131456L, 66377);
  }
  
  public final void bac()
  {
    GMTrace.i(8909104349184L, 66378);
    w.d("MicroMsg.RadarWaveView", "start wave animation");
    setVisibility(0);
    this.oct.startAnimation(this.ocu);
    GMTrace.o(8909104349184L, 66378);
  }
  
  public final void bad()
  {
    GMTrace.i(8909238566912L, 66379);
    w.d("MicroMsg.RadarWaveView", "stop wave animation. forces, %d, %d", new Object[] { Integer.valueOf(getMeasuredHeight()), Integer.valueOf(getMeasuredWidth()) });
    setVisibility(4);
    this.oct.clearAnimation();
    GMTrace.o(8909238566912L, 66379);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\RadarWaveView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */