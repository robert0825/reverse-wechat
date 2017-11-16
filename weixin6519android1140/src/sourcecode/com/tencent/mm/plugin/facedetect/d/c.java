package com.tencent.mm.plugin.facedetect.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.a.a;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Timer;
import java.util.TimerTask;

public final class c
  implements b
{
  public static String TAG;
  private static long kUc;
  private boolean kUd;
  public boolean kUe;
  private View kUf;
  private View kUg;
  private String kUh;
  private long kUi;
  public final Object kUj;
  private Timer kUk;
  public volatile boolean kUl;
  public Animation kUm;
  private volatile boolean kUn;
  private volatile boolean kUo;
  
  static
  {
    GMTrace.i(5963562090496L, 44432);
    TAG = "MicroMsg.NormalFaceMotion";
    kUc = 500L;
    GMTrace.o(5963562090496L, 44432);
  }
  
  public c(String paramString, long paramLong)
  {
    GMTrace.i(5961683042304L, 44418);
    this.kUd = false;
    this.kUe = false;
    this.kUf = null;
    this.kUg = null;
    this.kUj = new Object();
    this.kUk = null;
    this.kUl = false;
    this.kUn = false;
    this.kUo = false;
    this.kUh = paramString;
    this.kUi = paramLong;
    this.kUm = AnimationUtils.loadAnimation(ab.getContext(), a.a.aMb);
    GMTrace.o(5961683042304L, 44418);
  }
  
  public final void a(Context paramContext, ViewGroup paramViewGroup1, ViewGroup paramViewGroup2)
  {
    GMTrace.i(14545577836544L, 108373);
    this.kUf = LayoutInflater.from(paramContext).inflate(a.g.kQm, paramViewGroup1);
    this.kUg = LayoutInflater.from(paramContext).inflate(a.g.kQn, paramViewGroup2);
    this.kUg.setVisibility(4);
    if (awF() != null) {
      awF().setText(this.kUh);
    }
    long l = this.kUi;
    w.i(TAG, "hy: starting tween timer: tween: %d", new Object[] { Long.valueOf(l) });
    if (this.kUk != null) {
      this.kUk.cancel();
    }
    this.kUk = new Timer("FaceDetect_hint", true);
    this.kUl = true;
    this.kUk.scheduleAtFixedRate(new TimerTask()
    {
      public final void run()
      {
        GMTrace.i(14545443618816L, 108372);
        synchronized (c.this.kUj)
        {
          if (!c.this.kUl)
          {
            w.w(c.TAG, "hy: already stopped");
            cancel();
          }
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(14545040965632L, 108369);
              if (c.this.awF() != null) {
                c.this.awF().startAnimation(c.this.kUm);
              }
              GMTrace.o(14545040965632L, 108369);
            }
          });
          GMTrace.o(14545443618816L, 108372);
          return;
        }
      }
    }, 0L, l);
    GMTrace.o(14545577836544L, 108373);
  }
  
  public final boolean a(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    GMTrace.i(14545712054272L, 108374);
    if ((this.kUd) && (paramFaceCharacteristicsResult != null) && (paramFaceCharacteristicsResult.errCode == 18))
    {
      w.d(TAG, "hy: ignore too active");
      GMTrace.o(14545712054272L, 108374);
      return true;
    }
    GMTrace.o(14545712054272L, 108374);
    return false;
  }
  
  public final boolean awA()
  {
    GMTrace.i(5961817260032L, 44419);
    if ((this.kUd) && (this.kUe))
    {
      GMTrace.o(5961817260032L, 44419);
      return true;
    }
    GMTrace.o(5961817260032L, 44419);
    return false;
  }
  
  public final boolean awB()
  {
    GMTrace.i(5962354130944L, 44423);
    GMTrace.o(5962354130944L, 44423);
    return false;
  }
  
  public final void awC()
  {
    GMTrace.i(5962756784128L, 44426);
    this.kUl = false;
    if (this.kUk != null) {
      this.kUk.cancel();
    }
    this.kUd = false;
    this.kUn = false;
    this.kUo = false;
    this.kUe = false;
    GMTrace.o(5962756784128L, 44426);
  }
  
  public final b.b awD()
  {
    GMTrace.i(15041512341504L, 112068);
    if (this.kUd)
    {
      localb = new b.b(90025, "user cancelled in intermediate page");
      GMTrace.o(15041512341504L, 112068);
      return localb;
    }
    b.b localb = new b.b(90004, "user cancelled in processing");
    GMTrace.o(15041512341504L, 112068);
    return localb;
  }
  
  public final b.a awE()
  {
    GMTrace.i(5962891001856L, 44427);
    if ((this.kUd) && (!this.kUo))
    {
      this.kUo = true;
      b.a locala = new b.a();
      GMTrace.o(5962891001856L, 44427);
      return locala;
    }
    GMTrace.o(5962891001856L, 44427);
    return null;
  }
  
  public final TextView awF()
  {
    GMTrace.i(5962085695488L, 44421);
    TextView localTextView;
    if ((!this.kUd) && (this.kUf != null))
    {
      localTextView = (TextView)this.kUf.findViewById(a.e.kQd);
      GMTrace.o(5962085695488L, 44421);
      return localTextView;
    }
    if ((this.kUd) && (this.kUg != null))
    {
      localTextView = (TextView)this.kUg.findViewById(a.e.kQd);
      GMTrace.o(5962085695488L, 44421);
      return localTextView;
    }
    GMTrace.o(5962085695488L, 44421);
    return null;
  }
  
  public final boolean b(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    GMTrace.i(5962622566400L, 44425);
    if (paramFaceCharacteristicsResult.errCode == -1)
    {
      this.kUd = true;
      if (!this.kUn)
      {
        aq.C(ab.getContext(), a.h.dOV);
        paramFaceCharacteristicsResult = (TextView)this.kUf.findViewById(a.e.kQd);
        Animation localAnimation1 = AnimationUtils.loadAnimation(ab.getContext(), a.a.aLr);
        Animation localAnimation2 = AnimationUtils.loadAnimation(ab.getContext(), a.a.aLs);
        localAnimation1.setDuration(kUc);
        localAnimation2.setDuration(kUc);
        paramFaceCharacteristicsResult.startAnimation(localAnimation1);
        paramFaceCharacteristicsResult.setVisibility(4);
        this.kUg.setVisibility(0);
        this.kUg.startAnimation(localAnimation2);
        this.kUg.findViewById(a.e.kPK).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(14542893481984L, 108353);
            c.this.kUe = true;
            GMTrace.o(14542893481984L, 108353);
          }
        });
        this.kUn = true;
        GMTrace.o(5962622566400L, 44425);
        return true;
      }
    }
    GMTrace.o(5962622566400L, 44425);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */