package com.tencent.mm.plugin.sight.encode.ui;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.g.a.pb;
import com.tencent.mm.plugin.ag.a.h;
import com.tencent.mm.plugin.sight.encode.a.b.3;
import com.tencent.mm.plugin.sight.encode.a.b.4;
import com.tencent.mm.plugin.sight.encode.a.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMFragmentActivity;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainSightForwardContainerView
  extends RelativeLayout
  implements AdapterView.OnItemClickListener, a
{
  private int kE;
  private boolean mIsPause;
  private boolean mIsPlaying;
  public View mPu;
  public MainSightSelectContactView oVa;
  public SightCameraView oVb;
  public b oVc;
  public View oVd;
  public View oVe;
  public View oVf;
  private Dialog oVg;
  private boolean oVh;
  public String oVi;
  private boolean oVj;
  public String oVk;
  public float oVl;
  private com.tencent.mm.plugin.sight.encode.a.b oVm;
  private boolean oVn;
  public MMFragmentActivity oVo;
  private boolean oVp;
  private com.tencent.mm.sdk.b.c oVq;
  private boolean oVr;
  private MediaPlayer oVs;
  
  public MainSightForwardContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(9349070061568L, 69656);
    GMTrace.o(9349070061568L, 69656);
  }
  
  public MainSightForwardContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9348935843840L, 69655);
    this.oVg = null;
    this.mIsPlaying = false;
    this.oVh = true;
    this.oVi = "";
    this.oVj = false;
    this.oVk = "";
    this.kE = 1;
    this.oVl = 1.0F;
    this.mIsPause = false;
    this.oVm = new com.tencent.mm.plugin.sight.encode.a.b();
    this.oVn = false;
    this.oVp = false;
    this.oVq = new com.tencent.mm.sdk.b.c() {};
    this.oVr = false;
    GMTrace.o(9348935843840L, 69655);
  }
  
  private void hz(boolean paramBoolean)
  {
    GMTrace.i(9349606932480L, 69660);
    if (this.oVb == null)
    {
      GMTrace.o(9349606932480L, 69660);
      return;
    }
    this.oVb.hz(paramBoolean);
    GMTrace.o(9349606932480L, 69660);
  }
  
  public final void aEK()
  {
    GMTrace.i(9350143803392L, 69664);
    if (this.oVg == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.MainSightContainerView", "do send to friend, loadingDialog null %B", new Object[] { Boolean.valueOf(bool) });
      if ((!bg.nm(this.oVk)) && (!this.oVa.bhq())) {
        break;
      }
      GMTrace.o(9350143803392L, 69664);
      return;
    }
    final Object localObject1 = this.oVa.bhp();
    com.tencent.mm.plugin.report.service.g.ork.i(11443, new Object[] { Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(((List)localObject1).size()) });
    Object localObject2 = new b.a()
    {
      public final void onError(int paramAnonymousInt)
      {
        GMTrace.i(9319676379136L, 69437);
        if ((localObject1.size() <= 1) || (-1 == paramAnonymousInt)) {
          com.tencent.mm.ui.base.h.bm(MainSightForwardContainerView.this.getContext(), MainSightForwardContainerView.this.getContext().getString(R.l.dXF));
        }
        GMTrace.o(9319676379136L, 69437);
      }
    };
    com.tencent.mm.plugin.sight.encode.a.b localb;
    String str1;
    int i;
    String str2;
    String str3;
    if (((List)localObject1).size() == 1)
    {
      localb = this.oVm;
      str1 = this.oVk;
      i = this.kE;
      str2 = this.oVi;
      str3 = (String)((List)localObject1).get(0);
      if (bg.nm(str1))
      {
        w.w("MicroMsg.SightRecorderHelper", "remux and send sight error: in path is null");
        com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
        if ((this.oVa.bhp().size() > 1) || (this.oVc == null)) {
          break label872;
        }
        localObject2 = (String)this.oVa.bhp().get(0);
        this.oVc.GD((String)localObject2);
      }
    }
    label872:
    for (bool = false;; bool = true)
    {
      if (this.oVo != null) {
        localObject2 = this.oVo.getAssets();
      }
      try
      {
        localObject2 = ((AssetManager)localObject2).openFd("sight_send_song.wav");
        this.oVs = new i();
        this.oVs.setDataSource(((AssetFileDescriptor)localObject2).getFileDescriptor(), ((AssetFileDescriptor)localObject2).getStartOffset(), ((AssetFileDescriptor)localObject2).getLength());
        ((AssetFileDescriptor)localObject2).close();
        this.oVs.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
        {
          public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
          {
            GMTrace.i(9312160186368L, 69381);
            if (paramAnonymousMediaPlayer != null) {
              paramAnonymousMediaPlayer.release();
            }
            GMTrace.o(9312160186368L, 69381);
          }
        });
        this.oVs.setLooping(false);
        this.oVs.prepare();
        this.oVs.start();
        hA(bool);
        localObject1 = ((List)localObject1).iterator();
        for (;;)
        {
          if (((Iterator)localObject1).hasNext()) {
            if (((String)((Iterator)localObject1).next()).toLowerCase().endsWith("@chatroom"))
            {
              com.tencent.mm.plugin.report.service.g.ork.i(11442, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
              continue;
              if (bg.nm(str3))
              {
                w.w("MicroMsg.SightRecorderHelper", "remux and send sight error: toUser null");
                com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                break;
              }
              if ((!e.aZ(str1)) || (e.aY(str1) <= 0))
              {
                w.w("MicroMsg.SightRecorderHelper", "file not exist or file size error");
                com.tencent.mm.ui.base.h.bm(ab.getContext(), ab.getContext().getString(a.h.qzC));
                break;
              }
              String str4 = com.tencent.mm.a.g.bg(str1);
              w.i("MicroMsg.SightRecorderHelper", "do share to friends, check md5 target[%s] current[%s]", new Object[] { str2, str4 });
              if (!bg.aq(str2, "").equals(str4))
              {
                w.e("MicroMsg.SightRecorderHelper", "error md5, return");
                com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                break;
              }
              com.tencent.mm.kernel.h.xz();
              if (com.tencent.mm.kernel.h.xB().A(new b.3(localb, str3, (b.a)localObject2, str1, i)) >= 0) {
                break;
              }
              w.e("MicroMsg.SightRecorderHelper", "post short video encoder error");
              com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
              break;
              localb = this.oVm;
              str1 = this.oVk;
              i = this.kE;
              str2 = this.oVi;
              if (bg.nm(str1))
              {
                w.w("MicroMsg.SightRecorderHelper", "remux and send sight error: in path is null");
                com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                break;
              }
              if (((List)localObject1).isEmpty())
              {
                w.w("MicroMsg.SightRecorderHelper", "remux and send sight error: toUser list empty");
                com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                break;
              }
              if ((!e.aZ(str1)) || (e.aY(str1) <= 0))
              {
                w.w("MicroMsg.SightRecorderHelper", "file not exist or file size error");
                com.tencent.mm.ui.base.h.bm(ab.getContext(), ab.getContext().getString(a.h.qzC));
                break;
              }
              str3 = com.tencent.mm.a.g.bg(str1);
              w.i("MicroMsg.SightRecorderHelper", "do share to friends, check md5 target[%s] current[%s]", new Object[] { str2, str3 });
              if (!bg.aq(str2, "").equals(str3))
              {
                w.e("MicroMsg.SightRecorderHelper", "error md5, return");
                com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                break;
              }
              com.tencent.mm.kernel.h.xz();
              if (com.tencent.mm.kernel.h.xB().A(new b.4(localb, str1, (List)localObject1, str2, (b.a)localObject2, i)) >= 0) {
                break;
              }
              w.e("MicroMsg.SightRecorderHelper", "post short video encoder error");
              com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
            }
          }
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.MainSightContainerView", localIOException, "", new Object[0]);
          continue;
          com.tencent.mm.plugin.report.service.g.ork.i(11442, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
        }
        GMTrace.o(9350143803392L, 69664);
        return;
      }
    }
  }
  
  @TargetApi(11)
  public final void am(float paramFloat)
  {
    GMTrace.i(9350680674304L, 69668);
    paramFloat = Math.min(1.0F, Math.max(0.0F, paramFloat));
    if (com.tencent.mm.compatible.util.d.et(11)) {
      this.oVd.setAlpha(paramFloat);
    }
    for (;;)
    {
      w.d("MicroMsg.MainSightContainerView", "set alpha: %f", new Object[] { Float.valueOf(paramFloat) });
      if (paramFloat > 0.0F) {
        break;
      }
      this.oVd.setVisibility(8);
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
      localAlphaAnimation.setDuration(500L);
      this.oVd.startAnimation(localAlphaAnimation);
      GMTrace.o(9350680674304L, 69668);
      return;
      localAlphaAnimation = new AlphaAnimation(paramFloat, paramFloat);
      localAlphaAnimation.setDuration(0L);
      localAlphaAnimation.setFillAfter(true);
      this.oVd.startAnimation(localAlphaAnimation);
    }
    this.oVd.setVisibility(0);
    GMTrace.o(9350680674304L, 69668);
  }
  
  public final void art()
  {
    GMTrace.i(9349204279296L, 69657);
    com.tencent.mm.sdk.b.a.vgX.c(this.oVq);
    GMTrace.o(9349204279296L, 69657);
  }
  
  public final int bhb()
  {
    GMTrace.i(9351351762944L, 69673);
    int i = getHeight();
    if (i <= 0)
    {
      i = getResources().getDisplayMetrics().heightPixels;
      GMTrace.o(9351351762944L, 69673);
      return i;
    }
    GMTrace.o(9351351762944L, 69673);
    return i;
  }
  
  public final void bhc()
  {
    GMTrace.i(9351083327488L, 69671);
    this.oVb.setVisibility(0);
    hB(true);
    GMTrace.o(9351083327488L, 69671);
  }
  
  public final void bhd()
  {
    GMTrace.i(9351217545216L, 69672);
    this.oVb.setVisibility(4);
    hB(false);
    GMTrace.o(9351217545216L, 69672);
  }
  
  public final void bhe()
  {
    boolean bool1 = true;
    GMTrace.i(9349338497024L, 69658);
    w.i("MicroMsg.MainSightContainerView", "toggle play video, path %s, mute %B, playing %B", new Object[] { this.oVk, Boolean.valueOf(this.oVh), Boolean.valueOf(this.mIsPlaying) });
    if (!this.oVb.isPlaying()) {
      this.oVh = true;
    }
    boolean bool2 = this.oVh;
    this.oVb.as(this.oVk, bool2);
    if (!this.oVh)
    {
      hB(false);
      this.mIsPlaying = true;
      if (this.oVh) {
        break label129;
      }
    }
    for (;;)
    {
      this.oVh = bool1;
      GMTrace.o(9349338497024L, 69658);
      return;
      hB(true);
      break;
      label129:
      bool1 = false;
    }
  }
  
  public final void bhf()
  {
    GMTrace.i(9350814892032L, 69669);
    this.oVf.setVisibility(8);
    GMTrace.o(9350814892032L, 69669);
  }
  
  public final void hA(boolean paramBoolean)
  {
    GMTrace.i(9349741150208L, 69661);
    if (this.oVj)
    {
      GMTrace.o(9349741150208L, 69661);
      return;
    }
    this.oVj = true;
    bg.da(this);
    this.mIsPlaying = false;
    this.oVh = true;
    w.d("MicroMsg.MainSightContainerView", "dismiss sight view");
    this.oVp = false;
    this.oVb.bhr();
    if ((this.oVc != null) && (paramBoolean)) {
      this.oVc.bhg();
    }
    if (this.oVa != null)
    {
      MainSightSelectContactView localMainSightSelectContactView = this.oVa;
      localMainSightSelectContactView.oVj = true;
      bg.da(localMainSightSelectContactView);
      localMainSightSelectContactView.oVO.bhk();
      localMainSightSelectContactView.oVY.clear();
      localMainSightSelectContactView.oVX.clear();
      localMainSightSelectContactView.Ev.setAdapter(null);
      localMainSightSelectContactView.Ev.clearAnimation();
      localMainSightSelectContactView.setVisibility(8);
    }
    am(0.85F);
    bhf();
    hB(false);
    this.oVi = "";
    art();
    GMTrace.o(9349741150208L, 69661);
  }
  
  public final void hB(boolean paramBoolean)
  {
    GMTrace.i(9349875367936L, 69662);
    if (this.oVn == paramBoolean)
    {
      GMTrace.o(9349875367936L, 69662);
      return;
    }
    this.oVn = paramBoolean;
    if (paramBoolean)
    {
      if (this.oVe.getVisibility() == 0)
      {
        GMTrace.o(9349875367936L, 69662);
        return;
      }
      this.oVb.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9325984612352L, 69484);
          if ((!MainSightForwardContainerView.b(MainSightForwardContainerView.this)) || ((MainSightForwardContainerView.a(MainSightForwardContainerView.this) != null) && (MainSightForwardContainerView.a(MainSightForwardContainerView.this).oVO.bhi())))
          {
            MainSightForwardContainerView.c(MainSightForwardContainerView.this);
            GMTrace.o(9325984612352L, 69484);
            return;
          }
          MainSightForwardContainerView.d(MainSightForwardContainerView.this).setVisibility(0);
          if ((MainSightForwardContainerView.a(MainSightForwardContainerView.this) != null) && (!MainSightForwardContainerView.a(MainSightForwardContainerView.this).bhq()) && (MainSightForwardContainerView.e(MainSightForwardContainerView.this).getVisibility() != 0))
          {
            MainSightForwardContainerView.e(MainSightForwardContainerView.this).setVisibility(0);
            MainSightForwardContainerView.e(MainSightForwardContainerView.this).startAnimation(AnimationUtils.loadAnimation(MainSightForwardContainerView.f(MainSightForwardContainerView.this), R.a.aLs));
          }
          GMTrace.o(9325984612352L, 69484);
        }
      }, 100L);
      GMTrace.o(9349875367936L, 69662);
      return;
    }
    this.oVe.setVisibility(8);
    this.mPu.setVisibility(8);
    GMTrace.o(9349875367936L, 69662);
  }
  
  public final void hy(boolean paramBoolean)
  {
    GMTrace.i(9350949109760L, 69670);
    if (paramBoolean)
    {
      this.oVf.setVisibility(0);
      hz(true);
      GMTrace.o(9350949109760L, 69670);
      return;
    }
    bhf();
    hz(vc());
    GMTrace.o(9350949109760L, 69670);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(9350009585664L, 69663);
    paramInt -= 1;
    if ((MainSightSelectContactView.ub(paramInt)) && (this.mIsPlaying))
    {
      bhe();
      GMTrace.o(9350009585664L, 69663);
      return;
    }
    if (c.GF(this.oVa.gc(paramInt)))
    {
      this.oVa.oVO.bhj();
      GMTrace.o(9350009585664L, 69663);
      return;
    }
    if (c.GE(this.oVa.gc(paramInt)))
    {
      if (c.oVy)
      {
        this.oVp = true;
        this.oVb.bhr();
        paramAdapterView = this.oVo;
        paramView = com.tencent.mm.plugin.sight.base.d.Gy(this.oVk);
        String str1 = this.oVk;
        String str2 = this.oVi;
        w.i("MicroMsg.SightRecorderHelper", "share video path %s, thumb path %s", new Object[] { str1, paramView });
        Object localObject;
        if (!e.aZ(paramView)) {
          localObject = com.tencent.mm.plugin.sight.base.d.O(str1, 320, 240);
        }
        try
        {
          com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, 60, Bitmap.CompressFormat.JPEG, paramView, true);
          localObject = new Intent();
          ((Intent)localObject).putExtra("KSightPath", str1);
          ((Intent)localObject).putExtra("KSightThumbPath", paramView);
          ((Intent)localObject).putExtra("sight_md5", str2);
          ((Intent)localObject).putExtra("KSightDraftEntrance", false);
          ((Intent)localObject).putExtra("Ksnsupload_source", 0);
          ((Intent)localObject).putExtra("KSnsPostManu", true);
          ((Intent)localObject).putExtra("KTouchCameraTime", bg.Pu());
          com.tencent.mm.bj.d.b(paramAdapterView, "sns", ".ui.SightUploadUI", (Intent)localObject, 5985);
          if (this.oVr)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(11442, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
            GMTrace.o(9350009585664L, 69663);
            return;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.SightRecorderHelper", localException, "", new Object[0]);
            w.e("MicroMsg.SightRecorderHelper", "save bitmap to image error");
          }
          com.tencent.mm.plugin.report.service.g.ork.i(11442, new Object[] { Integer.valueOf(1), Integer.valueOf(3) });
        }
      }
      GMTrace.o(9350009585664L, 69663);
      return;
    }
    w.d("MicroMsg.MainSightContainerView", "on item click Item : %d", new Object[] { Integer.valueOf(paramInt) });
    paramAdapterView = this.oVa;
    label459:
    boolean bool;
    if ((paramInt < 0) || (paramInt > paramAdapterView.oVQ.getCount()))
    {
      paramAdapterView = this.oVa;
      if (paramAdapterView.oVQ != null) {
        paramAdapterView.oVQ.notifyDataSetChanged();
      }
      if (vc()) {
        break label616;
      }
      bhe();
      if (this.oVa.oVO.bhi())
      {
        paramAdapterView = this.oVa;
        if (paramAdapterView.oVQ.DC(paramInt) != null) {
          break label703;
        }
        bool = false;
      }
    }
    for (;;)
    {
      if (bool) {
        this.oVa.oVO.bhj();
      }
      GMTrace.o(9350009585664L, 69663);
      return;
      paramView = paramAdapterView.oVQ.DC(paramInt);
      if (paramView == null) {
        break;
      }
      if (paramAdapterView.oVY.contains(paramView.iBi.field_username))
      {
        paramAdapterView.oVY.remove(paramView.iBi.field_username);
        label561:
        c.oVy = paramAdapterView.oVY.isEmpty();
        if (paramAdapterView.oVY.isEmpty()) {
          break label610;
        }
      }
      label610:
      for (bool = true;; bool = false)
      {
        c.oVz = bool;
        break;
        paramAdapterView.oVY.add(paramView.iBi.field_username);
        break label561;
      }
      label616:
      if (this.oVa.bhq())
      {
        if (this.mPu.getVisibility() != 0) {
          break label459;
        }
        this.mPu.setVisibility(8);
        this.mPu.startAnimation(AnimationUtils.loadAnimation(this.oVo, R.a.aLt));
        break label459;
      }
      if (this.mPu.getVisibility() == 0) {
        break label459;
      }
      this.mPu.setVisibility(0);
      this.mPu.startAnimation(AnimationUtils.loadAnimation(this.oVo, R.a.aLs));
      break label459;
      label703:
      if (paramAdapterView.oVQ.DC(paramInt).iBi == null) {
        bool = false;
      } else {
        bool = paramAdapterView.oVY.contains(paramAdapterView.oVQ.DC(paramInt).iBi.field_username);
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(9350546456576L, 69667);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (!this.oVj) && (this.oVa != null))
    {
      w.d("MicroMsg.MainSightContainerView", "change size l: %d, t: %d, r: %d, b: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      this.oVa.bhn();
    }
    GMTrace.o(9350546456576L, 69667);
  }
  
  public final void onPause()
  {
    GMTrace.i(9350278021120L, 69665);
    if (this.oVp)
    {
      GMTrace.o(9350278021120L, 69665);
      return;
    }
    this.oVb.setVisibility(0);
    hB(false);
    this.oVb.bhr();
    this.mIsPause = true;
    GMTrace.o(9350278021120L, 69665);
  }
  
  public final void onResume()
  {
    GMTrace.i(9350412238848L, 69666);
    int i;
    if (!this.oVj)
    {
      i = 1;
      if (i == 0) {
        break label75;
      }
      com.tencent.mm.sdk.b.a.vgX.c(this.oVq);
      com.tencent.mm.sdk.b.a.vgX.b(this.oVq);
    }
    for (;;)
    {
      if (this.mIsPause)
      {
        bhe();
        this.mIsPause = false;
      }
      GMTrace.o(9350412238848L, 69666);
      return;
      i = 0;
      break;
      label75:
      art();
    }
  }
  
  public final boolean vc()
  {
    GMTrace.i(9349472714752L, 69659);
    if (!this.oVh)
    {
      GMTrace.o(9349472714752L, 69659);
      return true;
    }
    GMTrace.o(9349472714752L, 69659);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\encode\ui\MainSightForwardContainerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */