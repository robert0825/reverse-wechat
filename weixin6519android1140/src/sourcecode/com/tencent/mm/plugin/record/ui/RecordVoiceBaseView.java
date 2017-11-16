package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.p.a;
import com.tencent.mm.plugin.record.a.r;
import com.tencent.mm.plugin.record.a.r.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.u;

public class RecordVoiceBaseView
  extends TextView
  implements r.a
{
  private boolean aDI;
  private Context context;
  public int duration;
  public int eIv;
  private AlphaAnimation oiv;
  private AnimationDrawable oiw;
  public r oix;
  public String path;
  
  public RecordVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7540754612224L, 56183);
    this.aDI = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    bbc();
    GMTrace.o(7540754612224L, 56183);
  }
  
  public RecordVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7540888829952L, 56184);
    this.aDI = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    bbc();
    GMTrace.o(7540888829952L, 56184);
  }
  
  private void bbc()
  {
    GMTrace.i(7541023047680L, 56185);
    this.oiv = new AlphaAnimation(0.1F, 1.0F);
    this.oiv.setDuration(1000L);
    this.oiv.setRepeatCount(-1);
    this.oiv.setRepeatMode(2);
    this.oiw = new AnimationDrawable();
    Drawable localDrawable = getResources().getDrawable(R.k.cLg);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oiw.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.cLh);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oiw.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.cLi);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oiw.addFrame(localDrawable, 300);
    this.oiw.setOneShot(false);
    this.oiw.setVisible(true, true);
    GMTrace.o(7541023047680L, 56185);
  }
  
  private void bbd()
  {
    GMTrace.i(7541157265408L, 56186);
    if ((this.oiv != null) && (this.oiv.isInitialized())) {
      setAnimation(null);
    }
    this.aDI = false;
    setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.k.cLf), null, null, null);
    this.oiw.stop();
    GMTrace.o(7541157265408L, 56186);
  }
  
  public final void Fx(String paramString)
  {
    GMTrace.i(7541559918592L, 56189);
    w.d("MicroMsg.RecordVoiceBaseView", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    if (!bg.aq(paramString, "").equals(this.path)) {
      bbd();
    }
    GMTrace.o(7541559918592L, 56189);
  }
  
  public final void ahO()
  {
    GMTrace.i(7541425700864L, 56188);
    w.d("MicroMsg.RecordVoiceBaseView", "stop play");
    bbd();
    this.oix.ahO();
    GMTrace.o(7541425700864L, 56188);
  }
  
  public final void onFinish()
  {
    GMTrace.i(7541694136320L, 56190);
    ahO();
    GMTrace.o(7541694136320L, 56190);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(7541291483136L, 56187);
    super.onFinishInflate();
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7558739787776L, 56317);
        w.d("MicroMsg.RecordVoiceBaseView", "clicked path %s, isPlay %s", new Object[] { RecordVoiceBaseView.a(RecordVoiceBaseView.this), Boolean.valueOf(RecordVoiceBaseView.b(RecordVoiceBaseView.this).axU()) });
        if ((a.aR(RecordVoiceBaseView.c(RecordVoiceBaseView.this))) || (a.aP(RecordVoiceBaseView.c(RecordVoiceBaseView.this))))
        {
          GMTrace.o(7558739787776L, 56317);
          return;
        }
        if ((!f.ty()) && (!bg.nm(RecordVoiceBaseView.a(RecordVoiceBaseView.this))))
        {
          u.fo(paramAnonymousView.getContext());
          GMTrace.o(7558739787776L, 56317);
          return;
        }
        if (!bg.aq(RecordVoiceBaseView.a(RecordVoiceBaseView.this), "").equals(RecordVoiceBaseView.b(RecordVoiceBaseView.this).path))
        {
          RecordVoiceBaseView.d(RecordVoiceBaseView.this);
          GMTrace.o(7558739787776L, 56317);
          return;
        }
        if (RecordVoiceBaseView.b(RecordVoiceBaseView.this).axU())
        {
          RecordVoiceBaseView.this.ahO();
          GMTrace.o(7558739787776L, 56317);
          return;
        }
        if (!RecordVoiceBaseView.e(RecordVoiceBaseView.this)) {
          RecordVoiceBaseView.d(RecordVoiceBaseView.this);
        }
        GMTrace.o(7558739787776L, 56317);
      }
    });
    GMTrace.o(7541291483136L, 56187);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\RecordVoiceBaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */