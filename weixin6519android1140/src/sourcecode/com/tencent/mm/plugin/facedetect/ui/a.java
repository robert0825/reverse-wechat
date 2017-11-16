package com.tencent.mm.plugin.facedetect.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.CountDownTimer;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.a.d;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public final class a
{
  static c kVC;
  public Animation kVA;
  WeakReference<FaceDetectPrepareUI> kVB;
  public RelativeLayout kVs;
  Button kVt;
  ImageView kVu;
  TextView kVv;
  TextView kVw;
  Button kVx;
  Button kVy;
  Animation kVz;
  
  static
  {
    GMTrace.i(5883165671424L, 43833);
    kVC = new c();
    GMTrace.o(5883165671424L, 43833);
  }
  
  a(FaceDetectPrepareUI paramFaceDetectPrepareUI)
  {
    GMTrace.i(5881689276416L, 43822);
    this.kVs = null;
    this.kVt = null;
    this.kVu = null;
    this.kVv = null;
    this.kVw = null;
    this.kVx = null;
    this.kVy = null;
    this.kVz = null;
    this.kVA = null;
    this.kVB = null;
    this.kVB = new WeakReference(paramFaceDetectPrepareUI);
    GMTrace.o(5881689276416L, 43822);
  }
  
  public static b a(int paramInt, String paramString1, String paramString2, String paramString3, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(16691585089536L, 124362);
    paramString1 = a(paramInt, paramString1, paramString2, null, paramString3, paramOnClickListener1, paramOnClickListener2);
    GMTrace.o(16691585089536L, 124362);
    return paramString1;
  }
  
  public static b a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    boolean bool2 = true;
    GMTrace.i(5882628800512L, 43829);
    paramString3 = new b();
    paramString3.kVS = paramInt;
    paramString3.kVO = paramString1;
    if (paramString2 != null)
    {
      bool1 = true;
      paramString3.kVG = bool1;
      paramString3.kVP = paramString2;
      paramString3.kVK = false;
      paramString3.kVQ = null;
      if (paramString4 == null) {
        break label111;
      }
    }
    label111:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      paramString3.kVJ = bool1;
      paramString3.kVR = paramString4;
      paramString3.kVU = paramOnClickListener1;
      paramString3.kVV = null;
      paramString3.kVW = paramOnClickListener2;
      GMTrace.o(5882628800512L, 43829);
      return paramString3;
      bool1 = false;
      break;
    }
  }
  
  public static b a(Context paramContext, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(5882763018240L, 43830);
    paramOnClickListener = a(a.d.kPm, paramContext.getString(a.h.kQH), null, paramContext.getString(a.h.cSk), null, paramOnClickListener);
    paramOnClickListener.kVL = true;
    paramOnClickListener.kVM = (paramContext.getString(a.h.kQH).length() - 3);
    GMTrace.o(5882763018240L, 43830);
    return paramOnClickListener;
  }
  
  public static b nv(int paramInt)
  {
    GMTrace.i(5882360365056L, 43827);
    b localb = a(paramInt, null, null, null, null, null, null);
    GMTrace.o(5882360365056L, 43827);
    return localb;
  }
  
  public final void a(final b paramb)
  {
    GMTrace.i(5882091929600L, 43825);
    if (kVC != null) {
      kVC.cancel();
    }
    if (paramb == null)
    {
      GMTrace.o(5882091929600L, 43825);
      return;
    }
    w.i("MicroMsg.FaceDetectJumper", "hy: request show conf: %s", new Object[] { paramb.toString() });
    label125:
    label162:
    int i;
    String str;
    if (paramb.kVJ)
    {
      this.kVx.setVisibility(0);
      this.kVx.setText(paramb.kVR);
      this.kVx.setOnClickListener(paramb.kVW);
      if (!paramb.kVG) {
        break label361;
      }
      this.kVt.setVisibility(0);
      this.kVt.setText(paramb.kVP);
      this.kVt.setOnClickListener(paramb.kVU);
      if (!paramb.kVK) {
        break label372;
      }
      this.kVy.setVisibility(0);
      this.kVy.setText(paramb.kVQ);
      this.kVy.setOnClickListener(paramb.kVV);
      if (!paramb.kVH) {
        break label478;
      }
      this.kVv.setVisibility(0);
      if (!paramb.kVL) {
        break label456;
      }
      this.kVw.setVisibility(0);
      i = paramb.kVM;
      str = paramb.kVO;
      if ((!bg.nm(str)) && (i < str.length()) && (i >= 0)) {
        break label383;
      }
      w.e("MicroMsg.FaceDetectJumper", "hy: invalid showing one by one");
      this.kVv.setText(str);
      this.kVw.setText("");
      label245:
      if (!paramb.kVI) {
        break label497;
      }
      this.kVu.setVisibility(0);
      this.kVu.setImageResource(paramb.kVS);
    }
    for (;;)
    {
      if (paramb.kVN != null) {
        this.kVs.setBackgroundDrawable(new BitmapDrawable(paramb.kVN));
      }
      if (this.kVs.getVisibility() != 0)
      {
        this.kVs.setVisibility(0);
        this.kVs.startAnimation(this.kVz);
        this.kVz.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            GMTrace.i(5901016629248L, 43966);
            w.i("MicroMsg.FaceDetectJumper", "showJumperEnd: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
            GMTrace.o(5901016629248L, 43966);
          }
          
          public final void onAnimationRepeat(Animation paramAnonymousAnimation)
          {
            GMTrace.i(5901150846976L, 43967);
            GMTrace.o(5901150846976L, 43967);
          }
          
          public final void onAnimationStart(Animation paramAnonymousAnimation)
          {
            GMTrace.i(5900882411520L, 43965);
            GMTrace.o(5900882411520L, 43965);
          }
        });
      }
      GMTrace.o(5882091929600L, 43825);
      return;
      this.kVx.setVisibility(4);
      break;
      label361:
      this.kVt.setVisibility(4);
      break label125;
      label372:
      this.kVy.setVisibility(4);
      break label162;
      label383:
      kVC.cancel();
      c localc = kVC;
      WeakReference localWeakReference1 = new WeakReference(this.kVv);
      WeakReference localWeakReference2 = new WeakReference(this.kVw);
      localc.kVZ = str;
      localc.kWa = i;
      localc.kVX = localWeakReference1;
      localc.kVY = localWeakReference2;
      kVC.start();
      break label245;
      label456:
      this.kVw.setVisibility(4);
      this.kVv.setText(paramb.kVO);
      break label245;
      label478:
      this.kVv.setVisibility(4);
      this.kVw.setVisibility(4);
      break label245;
      label497:
      this.kVu.setVisibility(4);
    }
  }
  
  public final boolean awP()
  {
    GMTrace.i(5882226147328L, 43826);
    if (this.kVs.getVisibility() != 8)
    {
      GMTrace.o(5882226147328L, 43826);
      return true;
    }
    GMTrace.o(5882226147328L, 43826);
    return false;
  }
  
  public final void dismiss()
  {
    GMTrace.i(5881823494144L, 43823);
    kVC.cancel();
    if (this.kVs.getVisibility() == 0) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5910680305664L, 44038);
          a.this.kVA.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymous2Animation)
            {
              GMTrace.i(5911351394304L, 44043);
              a.this.kVs.setVisibility(8);
              GMTrace.o(5911351394304L, 44043);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymous2Animation)
            {
              GMTrace.i(5911485612032L, 44044);
              GMTrace.o(5911485612032L, 44044);
            }
            
            public final void onAnimationStart(Animation paramAnonymous2Animation)
            {
              GMTrace.i(5911217176576L, 44042);
              GMTrace.o(5911217176576L, 44042);
            }
          });
          a.this.kVs.startAnimation(a.this.kVA);
          GMTrace.o(5910680305664L, 44038);
        }
      });
    }
    GMTrace.o(5881823494144L, 43823);
  }
  
  public final void w(Bitmap paramBitmap)
  {
    GMTrace.i(5881957711872L, 43824);
    this.kVs.setBackgroundDrawable(new BitmapDrawable(paramBitmap));
    GMTrace.o(5881957711872L, 43824);
  }
  
  static abstract interface a {}
  
  public static final class b
  {
    boolean kVG;
    public boolean kVH;
    boolean kVI;
    boolean kVJ;
    boolean kVK;
    boolean kVL;
    int kVM;
    Bitmap kVN;
    public String kVO;
    String kVP;
    String kVQ;
    String kVR;
    int kVS;
    a.a kVT;
    View.OnClickListener kVU;
    View.OnClickListener kVV;
    View.OnClickListener kVW;
    
    public b()
    {
      GMTrace.i(5881152405504L, 43818);
      this.kVG = false;
      this.kVH = true;
      this.kVI = true;
      this.kVJ = false;
      this.kVK = false;
      this.kVL = false;
      this.kVM = 0;
      this.kVN = null;
      this.kVO = null;
      this.kVP = null;
      this.kVQ = null;
      this.kVR = null;
      this.kVS = -1;
      this.kVT = null;
      GMTrace.o(5881152405504L, 43818);
    }
    
    public final String toString()
    {
      GMTrace.i(5881286623232L, 43819);
      String str = "JumperConfig{isShowMainButton=" + this.kVG + ", isShowStatusWordingTv=" + this.kVH + ", isShowUploadStatusIv=" + this.kVI + ", isShowCancelBtn=" + this.kVJ + ", isShowSubButton=" + this.kVK + ", isShowOneByOne=" + this.kVL + ", oneByOneIndexStart=" + this.kVM + ", statusWording='" + this.kVO + '\'' + ", mainBtnText='" + this.kVP + '\'' + ", subBtnText='" + this.kVQ + '\'' + ", cancelBtnText='" + this.kVR + '\'' + ", statusIvRes=" + this.kVS + '}';
      GMTrace.o(5881286623232L, 43819);
      return str;
    }
  }
  
  public static final class c
    extends CountDownTimer
  {
    WeakReference<TextView> kVX;
    WeakReference<TextView> kVY;
    String kVZ;
    int kWa;
    int kWb;
    
    public c()
    {
      super(500L);
      GMTrace.i(5883299889152L, 43834);
      this.kVX = null;
      this.kVY = null;
      this.kVZ = null;
      this.kWa = 0;
      this.kWb = 0;
      GMTrace.o(5883299889152L, 43834);
    }
    
    public final void onFinish()
    {
      GMTrace.i(5883568324608L, 43836);
      GMTrace.o(5883568324608L, 43836);
    }
    
    public final void onTick(long paramLong)
    {
      GMTrace.i(5883434106880L, 43835);
      if ((this.kVX != null) && (this.kVX.get() != null) && (this.kVY != null) && (this.kVY.get() != null))
      {
        TextView localTextView1 = (TextView)this.kVX.get();
        TextView localTextView2 = (TextView)this.kVY.get();
        localTextView1.setText(this.kVZ.substring(0, this.kWa));
        localTextView2.setText(this.kVZ.substring(this.kWa, this.kWa + this.kWb % (this.kVZ.length() - this.kWa + 1)));
      }
      for (;;)
      {
        this.kWb += 1;
        GMTrace.o(5883434106880L, 43835);
        return;
        w.w("MicroMsg.FaceDetectJumper", "hy: tv ref released");
        cancel();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */