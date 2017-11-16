package com.tencent.mm.plugin.favorite.ui.base;

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
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.kl;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.at;
import java.io.File;

public class FavVideoView
  extends RelativeLayout
  implements f.a
{
  public String gKE;
  public ae jFJ;
  public f jGP;
  private ImageView lhi;
  private TextView lhj;
  private boolean lhk;
  private boolean lhl;
  private int lhm;
  private boolean lhn;
  private ProgressBar lho;
  private MMPinProgressBtn lhp;
  public String lhq;
  private int lhr;
  public com.tencent.mm.sdk.b.c lhs;
  
  public FavVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6460436119552L, 48134);
    GMTrace.o(6460436119552L, 48134);
  }
  
  public FavVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6460570337280L, 48135);
    this.jFJ = new ae(Looper.getMainLooper());
    this.lhk = false;
    this.lhl = false;
    this.lhm = 0;
    this.lhn = false;
    this.lhq = "";
    this.lhr = 0;
    this.lhs = new com.tencent.mm.sdk.b.c() {};
    w.i("MicroMsg.FavVideoView", "%d ui init view.", new Object[] { Integer.valueOf(hashCode()) });
    LayoutInflater.from(paramContext).inflate(R.i.cwP, this);
    this.lhi = ((ImageView)findViewById(R.h.ckG));
    paramAttributeSet = (RelativeLayout)findViewById(R.h.ckF);
    ((TextView)findViewById(R.h.ckk)).setVisibility(8);
    this.lhp = ((MMPinProgressBtn)findViewById(R.h.ckv));
    this.lho = ((ProgressBar)findViewById(R.h.ckq));
    this.lhj = ((TextView)findViewById(R.h.ckI));
    if (com.tencent.mm.modelcontrol.d.GC()) {
      this.lhl = true;
    }
    for (this.jGP = new VideoPlayerTextureView(paramContext);; this.jGP = new VideoTextureView(paramContext))
    {
      this.jGP.a(this);
      paramContext = new RelativeLayout.LayoutParams(-1, -2);
      paramContext.addRule(13);
      paramAttributeSet.addView((View)this.jGP, paramContext);
      a.vgX.b(this.lhs);
      GMTrace.o(6460570337280L, 48135);
      return;
      this.lhl = false;
    }
  }
  
  private void ez(final boolean paramBoolean)
  {
    GMTrace.i(6460838772736L, 48137);
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6450101354496L, 48057);
        w.i("MicroMsg.FavVideoView", "VideoPlay: switch video model isVideoPlay %b ", new Object[] { Boolean.valueOf(paramBoolean) });
        View localView = (View)FavVideoView.a(FavVideoView.this);
        if (paramBoolean)
        {
          localView.setVisibility(0);
          FavVideoView.b(FavVideoView.this).setVisibility(8);
          GMTrace.o(6450101354496L, 48057);
          return;
        }
        localView.setVisibility(8);
        FavVideoView.b(FavVideoView.this).setVisibility(0);
        GMTrace.o(6450101354496L, 48057);
      }
    });
    GMTrace.o(6460838772736L, 48137);
  }
  
  public final void Xq()
  {
    GMTrace.i(6461241425920L, 48140);
    this.lhm = 0;
    ez(true);
    this.lhn = this.jGP.start();
    w.i("MicroMsg.FavVideoView", "VideoPlay: startPlay(),duration is %d", new Object[] { Integer.valueOf(this.jGP.getDuration() / 1000) });
    GMTrace.o(6461241425920L, 48140);
  }
  
  public final int bM(int paramInt1, int paramInt2)
  {
    GMTrace.i(6460972990464L, 48138);
    GMTrace.o(6460972990464L, 48138);
    return 0;
  }
  
  public final void bs(int paramInt1, int paramInt2)
  {
    GMTrace.i(6461107208192L, 48139);
    GMTrace.o(6461107208192L, 48139);
  }
  
  public final void onCompletion()
  {
    GMTrace.i(6461375643648L, 48141);
    w.i("MicroMsg.FavVideoView", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    if ((com.tencent.mm.compatible.util.d.ev(18)) || (!this.lhl))
    {
      w.i("MicroMsg.FavVideoView", "VideoPlay: seek second is %d", new Object[] { Integer.valueOf(0) });
      this.jGP.o(0.0D);
      GMTrace.o(6461375643648L, 48141);
      return;
    }
    if (this.jGP != null) {
      this.jGP.stop();
    }
    GMTrace.o(6461375643648L, 48141);
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    GMTrace.i(6461509861376L, 48142);
    w.e("MicroMsg.FavVideoView", "VideoPlay: %d on play video error what %d extra %d. isMMVideoPlayer[%b]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.lhl) });
    if (this.lhn)
    {
      onCompletion();
      GMTrace.o(6461509861376L, 48142);
      return;
    }
    this.lhm = paramInt2;
    final String str = this.jGP.NE();
    this.jGP.stop();
    this.lhk = true;
    ez(false);
    if (this.lhm == -1)
    {
      this.lhr += 1;
      if (this.lhr <= 3)
      {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6454396321792L, 48089);
            if (FavVideoView.a(FavVideoView.this) != null) {
              FavVideoView.this.yi(FavVideoView.c(FavVideoView.this));
            }
            GMTrace.o(6454396321792L, 48089);
          }
        });
        GMTrace.o(6461509861376L, 48142);
        return;
      }
    }
    if ((!bg.nm(str)) && (FileOp.aZ(str)))
    {
      w.e("MicroMsg.FavVideoView", "VideoPlay: start third player to play");
      this.jFJ.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16935727136768L, 126181);
          Intent localIntent = new Intent();
          localIntent.setAction("android.intent.action.VIEW");
          localIntent.setDataAndType(Uri.fromFile(new File(str)), "video/*");
          try
          {
            FavVideoView.this.getContext().startActivity(localIntent);
            GMTrace.o(16935727136768L, 126181);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.FavVideoView", "startActivity fail, activity not found");
            h.h(FavVideoView.this.getContext(), R.l.due, R.l.duf);
            GMTrace.o(16935727136768L, 126181);
          }
        }
      });
    }
    GMTrace.o(6461509861376L, 48142);
  }
  
  public final void onResume()
  {
    GMTrace.i(6460704555008L, 48136);
    w.i("MicroMsg.FavVideoView", "VideoPlay:   onResume()");
    if (!this.lhk)
    {
      if ((!bg.nm(this.gKE)) && (e.aZ(this.gKE)))
      {
        w.i("MicroMsg.FavVideoView", "VideoPlay: fullPath is not null,exist,  toggleVideo()");
        yi(this.gKE);
        GMTrace.o(6460704555008L, 48136);
        return;
      }
      w.i("MicroMsg.FavVideoView", "VideoPlay: fullPath is  null, show error, toggleVideo()");
      ez(false);
    }
    GMTrace.o(6460704555008L, 48136);
  }
  
  public final void yi(String paramString)
  {
    GMTrace.i(16934250741760L, 126170);
    w.i("MicroMsg.FavVideoView", "VideoPlay: prepareVideo");
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FavVideoView", "VideoPlay: %d prepare video but filepath is null.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(16934250741760L, 126170);
      return;
    }
    if (this.jGP != null)
    {
      if ((this.jGP instanceof VideoPlayerTextureView))
      {
        VideoPlayerTextureView localVideoPlayerTextureView = (VideoPlayerTextureView)this.jGP;
        at.AR();
        localVideoPlayerTextureView.fT(com.tencent.mm.y.c.xh().getBoolean(w.a.vww, false));
      }
      this.jGP.setVideoPath(paramString);
    }
    at.AR();
    if (((Integer)com.tencent.mm.y.c.xh().get(w.a.vvu, Integer.valueOf(0))).intValue() == 1)
    {
      this.lhj.setText(com.tencent.mm.plugin.sight.base.d.CG(paramString));
      this.lhj.setVisibility(0);
    }
    GMTrace.o(16934250741760L, 126170);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\FavVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */