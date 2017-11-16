package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.n;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.rm;
import com.tencent.mm.plugin.ag.a.a;
import com.tencent.mm.plugin.ag.a.b;
import com.tencent.mm.plugin.ag.a.e;
import com.tencent.mm.plugin.ag.a.f;
import com.tencent.mm.plugin.ag.a.h;
import com.tencent.mm.plugin.ag.a.i;
import com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.k;
import com.tencent.mm.y.d.a;
import java.io.File;

public final class c
  extends k
  implements d.a
{
  public int eWr;
  public String gKE;
  private com.tencent.mm.y.d imE;
  public String imagePath;
  private com.tencent.mm.pluginsdk.ui.tools.f jGP;
  public int led;
  public int oSE;
  private TextView oTy;
  private boolean oTz;
  
  public c(Context paramContext)
  {
    super(paramContext, a.i.qzF);
    GMTrace.i(9275652964352L, 69109);
    this.jGP = null;
    this.oTy = null;
    this.eWr = 0;
    this.oSE = 0;
    this.led = 0;
    this.oTz = false;
    this.imE = new com.tencent.mm.y.d();
    GMTrace.o(9275652964352L, 69109);
  }
  
  private void bgK()
  {
    GMTrace.i(9275921399808L, 69111);
    w.v("check", "onclick");
    if (this.jGP.isPlaying())
    {
      this.jGP.pause();
      this.imE.bf(false);
    }
    new ae().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9248675201024L, 68908);
        c.this.dismiss();
        GMTrace.o(9248675201024L, 68908);
      }
    });
    GMTrace.o(9275921399808L, 69111);
  }
  
  public final void dismiss()
  {
    GMTrace.i(9276189835264L, 69113);
    w.d("MicroMsg.VideoPopupHelper", "on dismiss");
    if (com.tencent.mm.booter.a.rg() != null) {
      com.tencent.mm.booter.a.rg().rh();
    }
    if (this.jGP != null)
    {
      this.jGP.a(null);
      this.jGP.stop();
      this.jGP.onDetach();
      findViewById(a.e.ckd).setOnClickListener(null);
    }
    if ((!this.oTz) && (isShowing()))
    {
      rm localrm = new rm();
      localrm.eWo.type = 0;
      localrm.eWo.eWp = this.oSE;
      localrm.eWo.eWq = this.led;
      localrm.eWo.eWr = this.eWr;
      com.tencent.mm.sdk.b.a.vgX.m(localrm);
    }
    super.dismiss();
    this.imE.bf(true);
    GMTrace.o(9276189835264L, 69113);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9275787182080L, 69110);
    long l = System.currentTimeMillis();
    w.d("MicroMsg.VideoPopupHelper", l + " initView beg");
    super.onCreate(paramBundle);
    getWindow().setFlags(16777216, 16777216);
    setContentView(a.f.qzw);
    if (com.tencent.mm.booter.a.rg() != null) {
      com.tencent.mm.booter.a.rg().ri();
    }
    w.d("MicroMsg.VideoPopupHelper", g.tB() + " initView: fullpath:" + this.gKE + ", imagepath:" + this.imagePath);
    this.oTy = ((TextView)findViewById(a.e.chF));
    findViewById(a.e.ceK).setVisibility(8);
    paramBundle = (ViewGroup)findViewById(a.e.ckd);
    paramBundle.setBackgroundResource(a.b.black);
    w.i("MicroMsg.VideoPopupHelper", "getVideoView, is normal video");
    if (com.tencent.mm.compatible.util.d.et(14)) {}
    for (this.jGP = new VideoTextureView(getContext());; this.jGP = new VideoSurfaceView(getContext()))
    {
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(13);
      paramBundle.addView((View)this.jGP, localLayoutParams);
      this.jGP.a(new f.a()
      {
        public final void Xq()
        {
          GMTrace.i(9277666230272L, 69124);
          w.d("MicroMsg.VideoPopupHelper", g.tB() + " onPrepared");
          c.a(c.this);
          GMTrace.o(9277666230272L, 69124);
        }
        
        public final int bM(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(9278068883456L, 69127);
          GMTrace.o(9278068883456L, 69127);
          return 0;
        }
        
        public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(9278203101184L, 69128);
          GMTrace.o(9278203101184L, 69128);
        }
        
        public final void onCompletion()
        {
          GMTrace.i(9277934665728L, 69126);
          w.d("MicroMsg.VideoPopupHelper", "on completion");
          c.d(c.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9254312345600L, 68950);
              c.d(c.this).setVisibility(0);
              c.d(c.this).startAnimation(AnimationUtils.loadAnimation(c.this.getContext(), a.a.aLs));
              GMTrace.o(9254312345600L, 68950);
            }
          });
          c.b(c.this).ci(true);
          c.a(c.this);
          GMTrace.o(9277934665728L, 69126);
        }
        
        public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(9277800448000L, 69125);
          w.e("MicroMsg.VideoPopupHelper", "on play video error, what %d extra %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          c.b(c.this).stop();
          b.r(Base64.encodeToString((com.tencent.mm.plugin.sight.base.d.bgi() + "[SightPopupHelper] on play video error, what " + paramAnonymousInt1 + " extra " + paramAnonymousInt2 + ", path=" + bg.aq(c.c(c.this), "")).getBytes(), 2), "FullScreenPlaySight");
          final String str = c.c(c.this);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9247601459200L, 68900);
              Object localObject = (ImageView)c.this.findViewById(a.e.ckO);
              ((ImageView)localObject).setImageBitmap(this.oip);
              ((ImageView)localObject).setVisibility(0);
              localObject = new Intent();
              ((Intent)localObject).setAction("android.intent.action.VIEW");
              ((Intent)localObject).setDataAndType(Uri.fromFile(new File(str)), "video/*");
              try
              {
                c.this.getContext().startActivity(Intent.createChooser((Intent)localObject, c.this.getContext().getString(a.h.qzy)));
                GMTrace.o(9247601459200L, 68900);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.VideoPopupHelper", "startActivity fail, activity not found");
                h.h(c.this.getContext(), a.h.qzA, a.h.qzB);
                GMTrace.o(9247601459200L, 68900);
              }
            }
          });
          GMTrace.o(9277800448000L, 69125);
        }
      });
      findViewById(a.e.ckd).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9250420031488L, 68921);
          c.e(c.this);
          GMTrace.o(9250420031488L, 68921);
        }
      });
      ((View)this.jGP).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9270821126144L, 69073);
          c.e(c.this);
          GMTrace.o(9270821126144L, 69073);
        }
      });
      if (this.gKE != null)
      {
        this.jGP.stop();
        this.jGP.setVideoPath(this.gKE);
      }
      w.d("MicroMsg.VideoPopupHelper", System.currentTimeMillis() - l + " initView end");
      paramBundle = new rm();
      paramBundle.eWo.type = 1;
      com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
      GMTrace.o(9275787182080L, 69110);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sight\decode\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */