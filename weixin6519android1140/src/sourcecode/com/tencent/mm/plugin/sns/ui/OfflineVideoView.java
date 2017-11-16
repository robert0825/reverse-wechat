package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.io.File;

public class OfflineVideoView
  extends RelativeLayout
  implements f.a
{
  private int duration;
  private ae jFJ;
  private boolean jGN;
  public f jGP;
  private aj jGW;
  private ImageView lhi;
  private boolean lhk;
  private boolean lhl;
  private ProgressBar lho;
  private RelativeLayout ljd;
  private Context mContext;
  private int nqN;
  public a pUo;
  private boolean pUp;
  private boolean pUq;
  private int pUr;
  private f.e pUs;
  
  public OfflineVideoView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(15295452282880L, 113960);
    GMTrace.o(15295452282880L, 113960);
  }
  
  public OfflineVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(15295586500608L, 113961);
    GMTrace.o(15295586500608L, 113961);
  }
  
  public OfflineVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(15295720718336L, 113962);
    this.mContext = null;
    this.jGN = false;
    this.lhk = false;
    this.pUp = false;
    this.pUq = true;
    this.pUr = -1;
    this.nqN = 0;
    this.duration = 0;
    this.jFJ = new ae(Looper.getMainLooper());
    this.jGW = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(16273631084544L, 121248);
        if (OfflineVideoView.b(OfflineVideoView.this) == null)
        {
          GMTrace.o(16273631084544L, 121248);
          return false;
        }
        if (((View)OfflineVideoView.b(OfflineVideoView.this)).getAlpha() < 1.0F) {
          OfflineVideoView.e(OfflineVideoView.this);
        }
        if (OfflineVideoView.b(OfflineVideoView.this).isPlaying())
        {
          OfflineVideoView.f(OfflineVideoView.this);
          OfflineVideoView localOfflineVideoView = OfflineVideoView.this;
          int i = OfflineVideoView.b(OfflineVideoView.this).getCurrentPosition() / 1000;
          if (localOfflineVideoView.pUo != null) {
            localOfflineVideoView.pUo.uM(i);
          }
        }
        GMTrace.o(16273631084544L, 121248);
        return true;
      }
    }, true);
    this.pUs = new f.e()
    {
      public final void aQG()
      {
        GMTrace.i(16276315439104L, 121268);
        w.i("MicroMsg.OfflineVideoView", "%d on texture update.", new Object[] { Integer.valueOf(OfflineVideoView.this.hashCode()) });
        try
        {
          OfflineVideoView.e(OfflineVideoView.this);
          GMTrace.o(16276315439104L, 121268);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.OfflineVideoView", "texture view update. error " + localException.toString());
          GMTrace.o(16276315439104L, 121268);
        }
      }
    };
    this.mContext = paramContext;
    w.i("MicroMsg.OfflineVideoView", "%d ui init view.", new Object[] { Integer.valueOf(hashCode()) });
    LayoutInflater.from(this.mContext).inflate(i.g.pgG, this);
    this.lhi = ((ImageView)findViewById(i.f.ckG));
    this.ljd = ((RelativeLayout)findViewById(i.f.ckF));
    this.lho = ((ProgressBar)findViewById(i.f.ckq));
    if (d.eu(18))
    {
      paramInt = 0;
      if (paramInt == 0) {
        break label280;
      }
      this.lhl = true;
    }
    for (this.jGP = new VideoPlayerTextureView(this.mContext);; this.jGP = new VideoTextureView(this.mContext))
    {
      this.jGP.a(this);
      paramContext = new RelativeLayout.LayoutParams(-1, -2);
      paramContext.addRule(13);
      this.ljd.addView((View)this.jGP, paramContext);
      a(false, 0.0F);
      GMTrace.o(15295720718336L, 113962);
      return;
      paramInt = 1;
      break;
      label280:
      this.lhl = false;
    }
  }
  
  private void a(final boolean paramBoolean, final float paramFloat)
  {
    GMTrace.i(15296123371520L, 113965);
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15281762074624L, 113858);
        w.i("MicroMsg.OfflineVideoView", "%d switch video model isVideoPlay %b %f", new Object[] { Integer.valueOf(OfflineVideoView.this.hashCode()), Boolean.valueOf(paramBoolean), Float.valueOf(paramFloat) });
        View localView = (View)OfflineVideoView.b(OfflineVideoView.this);
        if (paramBoolean)
        {
          localView.setAlpha(paramFloat);
          localView.setVisibility(0);
          OfflineVideoView.c(OfflineVideoView.this).setVisibility(0);
          OfflineVideoView.c(OfflineVideoView.this).setAlpha(paramFloat);
          if (paramFloat >= 1.0D)
          {
            OfflineVideoView.a(OfflineVideoView.this).setVisibility(8);
            GMTrace.o(15281762074624L, 113858);
          }
        }
        else
        {
          localView.setVisibility(0);
          OfflineVideoView.c(OfflineVideoView.this).setVisibility(0);
          OfflineVideoView.c(OfflineVideoView.this).setAlpha(0.0F);
          OfflineVideoView.a(OfflineVideoView.this).setVisibility(0);
        }
        GMTrace.o(15281762074624L, 113858);
      }
    });
    GMTrace.o(15296123371520L, 113965);
  }
  
  private void aJR()
  {
    GMTrace.i(15296391806976L, 113967);
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16276986527744L, 121273);
        if ((OfflineVideoView.d(OfflineVideoView.this) != null) && (OfflineVideoView.d(OfflineVideoView.this).getVisibility() != 8))
        {
          w.i("MicroMsg.OfflineVideoView", "%d hide loading.", new Object[] { Integer.valueOf(OfflineVideoView.this.hashCode()) });
          OfflineVideoView.d(OfflineVideoView.this).setVisibility(8);
        }
        GMTrace.o(16276986527744L, 121273);
      }
    });
    GMTrace.o(15296391806976L, 113967);
  }
  
  private void onResume()
  {
    GMTrace.i(17148999106560L, 127770);
    w.d("MicroMsg.OfflineVideoView", "%d on resume %s", new Object[] { Integer.valueOf(hashCode()), bg.bQW() });
    if (!this.lhk) {
      bnK();
    }
    this.pUp = true;
    GMTrace.o(17148999106560L, 127770);
  }
  
  public final void B(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(15296928677888L, 113971);
    w.i("MicroMsg.OfflineVideoView", "%d seek second %d afterSeekPlay %b", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    aJR();
    this.jGP.c(paramInt * 1000, paramBoolean);
    startTimer();
    GMTrace.o(15296928677888L, 113971);
  }
  
  public final void I(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17149670195200L, 127775);
    w.i("MicroMsg.OfflineVideoView", "%d ui touch seek second %d afterSeekPlay %b", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    B(paramInt, paramBoolean);
    startTimer();
    GMTrace.o(17149670195200L, 127775);
  }
  
  public final void IZ(final String paramString)
  {
    GMTrace.i(17149401759744L, 127773);
    if (bg.nm(paramString))
    {
      GMTrace.o(17149401759744L, 127773);
      return;
    }
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15280151461888L, 113846);
        if (OfflineVideoView.a(OfflineVideoView.this) != null)
        {
          w.i("MicroMsg.OfflineVideoView", "%d fresh thumb image", new Object[] { Integer.valueOf(hashCode()) });
          OfflineVideoView.a(OfflineVideoView.this).setImageBitmap(BackwardSupportUtil.b.c(paramString, 1.0F));
        }
        GMTrace.o(15280151461888L, 113846);
      }
    });
    GMTrace.o(17149401759744L, 127773);
  }
  
  public final void Xq()
  {
    GMTrace.i(15296257589248L, 113966);
    a(true, 0.0F);
    this.lhk = false;
    aJR();
    this.duration = (this.jGP.getDuration() / 1000);
    w.i("MicroMsg.OfflineVideoView", "%d on prepared. shouldPlayWhenPrepared [%b] shouldSeekTimeWhenPrepared[%d]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.pUq), Integer.valueOf(this.pUr) });
    if (this.pUq)
    {
      if (this.pUr <= 0) {
        this.jGP.start();
      }
      for (;;)
      {
        startTimer();
        if (this.pUo != null) {
          this.pUo.onStart(this.duration);
        }
        this.pUr = -1;
        GMTrace.o(15296257589248L, 113966);
        return;
        B(this.pUr, true);
      }
    }
    if (this.pUr > 0) {}
    for (int i = this.pUr;; i = 0)
    {
      B(i, false);
      break;
    }
  }
  
  public final int bM(int paramInt1, int paramInt2)
  {
    GMTrace.i(15297331331072L, 113974);
    GMTrace.o(15297331331072L, 113974);
    return 0;
  }
  
  public final void bnK()
  {
    GMTrace.i(17149267542016L, 127772);
    if (this.pUo != null)
    {
      PString localPString1 = new PString();
      PString localPString2 = new PString();
      if (this.pUo.a(localPString1))
      {
        if (!bg.nm(localPString2.value)) {
          IZ(localPString2.value);
        }
        if (!bg.nm(localPString1.value))
        {
          yi(localPString1.value);
          GMTrace.o(17149267542016L, 127772);
        }
      }
      else
      {
        this.jFJ.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15291023097856L, 113927);
            w.i("MicroMsg.OfflineVideoView", "%d show loading. downloadMode %d", new Object[] { Integer.valueOf(OfflineVideoView.this.hashCode()), Integer.valueOf(OfflineVideoView.this.hashCode()) });
            if ((OfflineVideoView.d(OfflineVideoView.this) != null) && (OfflineVideoView.d(OfflineVideoView.this).getVisibility() != 0)) {
              OfflineVideoView.d(OfflineVideoView.this).setVisibility(0);
            }
            GMTrace.o(15291023097856L, 113927);
          }
        });
        a(false, 0.0F);
      }
      GMTrace.o(17149267542016L, 127772);
      return;
    }
    w.w("MicroMsg.OfflineVideoView", "%d toggle video but video callback is null", new Object[] { Integer.valueOf(hashCode()) });
    GMTrace.o(17149267542016L, 127772);
  }
  
  public final void bnL()
  {
    GMTrace.i(15297062895616L, 113972);
    w.i("MicroMsg.OfflineVideoView", "%d pause", new Object[] { Integer.valueOf(hashCode()) });
    w.d("MicroMsg.OfflineVideoView", "%d on pause %s ", new Object[] { Integer.valueOf(hashCode()), bg.bQW() });
    this.pUq = false;
    if (this.jGP.isPlaying()) {
      this.pUr = (this.jGP.getCurrentPosition() / 1000);
    }
    w.i("MicroMsg.OfflineVideoView", "%d pause play", new Object[] { Integer.valueOf(hashCode()) });
    this.jGP.pause();
    aJR();
    this.jGW.stopTimer();
    GMTrace.o(15297062895616L, 113972);
  }
  
  public final void bnM()
  {
    GMTrace.i(17149535977472L, 127774);
    w.i("MicroMsg.OfflineVideoView", "%d start hasResumed[%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.pUp) });
    this.pUq = true;
    if (this.pUp) {
      if (!bg.nm(this.jGP.NE())) {
        if ((this.jGP.start()) && (this.pUo != null)) {
          this.pUo.onStart(this.duration);
        }
      }
    }
    for (;;)
    {
      startTimer();
      GMTrace.o(17149535977472L, 127774);
      return;
      onResume();
      continue;
      onResume();
    }
  }
  
  public final void bs(int paramInt1, int paramInt2)
  {
    GMTrace.i(15297465548800L, 113975);
    GMTrace.o(15297465548800L, 113975);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(17149804412928L, 127776);
    if (this.jGP != null)
    {
      int i = this.jGP.getCurrentPosition() / 1000;
      GMTrace.o(17149804412928L, 127776);
      return i;
    }
    GMTrace.o(17149804412928L, 127776);
    return 0;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(15297197113344L, 113973);
    if (this.jGP != null)
    {
      boolean bool = this.jGP.isPlaying();
      GMTrace.o(15297197113344L, 113973);
      return bool;
    }
    GMTrace.o(15297197113344L, 113973);
    return false;
  }
  
  public final void onCompletion()
  {
    GMTrace.i(15296660242432L, 113969);
    w.i("MicroMsg.OfflineVideoView", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    if (this.pUo == null)
    {
      if ((d.ev(18)) || (!this.lhl))
      {
        B(0, true);
        GMTrace.o(15296660242432L, 113969);
        return;
      }
      if (this.jGP != null)
      {
        String str = this.jGP.NE();
        this.jGP.stop();
        yi(str);
        GMTrace.o(15296660242432L, 113969);
      }
    }
    else
    {
      this.pUo.onCompletion();
    }
    GMTrace.o(15296660242432L, 113969);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(17149133324288L, 127771);
    w.d("MicroMsg.OfflineVideoView", "%d on destroy %s", new Object[] { Integer.valueOf(hashCode()), bg.bQW() });
    w.i("MicroMsg.OfflineVideoView", "%d logic unInit", new Object[] { Integer.valueOf(hashCode()) });
    this.jFJ.removeCallbacksAndMessages(null);
    this.jGW.stopTimer();
    if (this.jGP != null) {
      this.jGP.stop();
    }
    GMTrace.o(17149133324288L, 127771);
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    GMTrace.i(15295989153792L, 113964);
    w.e("MicroMsg.OfflineVideoView", "%d on play video error what %d extra %d isMMVideoPlayer %b errorCount %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.lhl), Integer.valueOf(this.nqN) });
    this.nqN += 1;
    final String str = this.jGP.NE();
    this.jGP.stop();
    this.lhk = true;
    a(false, 0.0F);
    if (this.nqN <= 3)
    {
      this.jFJ.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15295318065152L, 113959);
          OfflineVideoView.this.yi(str);
          GMTrace.o(15295318065152L, 113959);
        }
      }, 200L);
      GMTrace.o(15295989153792L, 113964);
      return;
    }
    if (!bg.nm(str))
    {
      w.w("MicroMsg.OfflineVideoView", "%d start third player to play", new Object[] { Integer.valueOf(hashCode()) });
      this.jFJ.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15279480373248L, 113841);
          Intent localIntent = new Intent();
          localIntent.setAction("android.intent.action.VIEW");
          localIntent.setDataAndType(Uri.fromFile(new File(str)), "video/*");
          try
          {
            OfflineVideoView.this.getContext().startActivity(localIntent);
            GMTrace.o(15279480373248L, 113841);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.OfflineVideoView", "startActivity fail, activity not found");
            h.h(OfflineVideoView.this.getContext(), i.j.due, i.j.duf);
            GMTrace.o(15279480373248L, 113841);
          }
        }
      });
    }
    GMTrace.o(15295989153792L, 113964);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(15295854936064L, 113963);
    this.jGN = paramBoolean;
    this.jGP.setMute(this.jGN);
    GMTrace.o(15295854936064L, 113963);
  }
  
  public final void startTimer()
  {
    GMTrace.i(15296526024704L, 113968);
    this.jGW.z(500L, 500L);
    GMTrace.o(15296526024704L, 113968);
  }
  
  public final void yi(String paramString)
  {
    GMTrace.i(15296794460160L, 113970);
    w.i("MicroMsg.OfflineVideoView", "%d prepare video  filePath %s", new Object[] { Integer.valueOf(hashCode()), paramString });
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.OfflineVideoView", "%d prepare video but filepath is null.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(15296794460160L, 113970);
      return;
    }
    if (this.jGP != null)
    {
      this.jGP.a(this.pUs);
      this.jGP.setVideoPath(paramString);
    }
    GMTrace.o(15296794460160L, 113970);
  }
  
  public static abstract interface a
  {
    public abstract boolean a(PString paramPString);
    
    public abstract void onCompletion();
    
    public abstract void onStart(int paramInt);
    
    public abstract void uM(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\OfflineVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */