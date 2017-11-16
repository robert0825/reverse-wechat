package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.c;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.luckymoney.b.m;
import com.tencent.mm.plugin.luckymoney.b.u;
import com.tencent.mm.plugin.luckymoney.f2f.a.1;
import com.tencent.mm.plugin.luckymoney.f2f.a.2;
import com.tencent.mm.plugin.luckymoney.f2f.a.d;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.au.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.HorizontalListViewV2;
import com.tencent.mm.ui.base.HorizontalListViewV2.d;
import com.tencent.mm.ui.base.HorizontalListViewV2.d.a;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.s;
import com.tencent.qbar.QbarNative;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

@com.tencent.mm.ui.base.a(1)
public class LuckyMoneyF2FQRCodeUI
  extends LuckyMoneyBaseUI
  implements au.a
{
  private View Ks;
  private SensorManager aDS;
  private DisplayMetrics hjd;
  private TextView hqH;
  private f iBz;
  private aj ikv;
  private p.d jZA;
  private String kBQ;
  private Bitmap mBitmap;
  private String mFG;
  private int mFH;
  private View mFL;
  private View mFM;
  private ImageView mFN;
  private TextView mFO;
  private TextView mFP;
  private ImageView mFQ;
  private TextView mFR;
  private TextView mFS;
  private HorizontalListViewV2 mFT;
  private List<String> mFU;
  private Map<String, String> mFV;
  private Queue<Pair<String, Integer>> mFW;
  private a mFX;
  private TextView mFY;
  private Button mFZ;
  private String mFr;
  private Bitmap mGA;
  private Bitmap mGB;
  private Bitmap mGC;
  private Bitmap mGD;
  private com.tencent.mm.plugin.luckymoney.particles.b mGE;
  private com.tencent.mm.plugin.luckymoney.particles.b mGF;
  final SensorEventListener mGG;
  private View mGa;
  private View mGb;
  private ShuffleView mGc;
  private ShuffleView.c mGd;
  private List<View> mGe;
  private ViewGroup mGf;
  private ViewGroup mGg;
  private View mGh;
  private com.tencent.mm.plugin.luckymoney.f2f.a mGi;
  private long mGj;
  private String mGk;
  private ValueAnimator mGl;
  private float mGm;
  private float mGn;
  private float mGo;
  private int[] mGp;
  private bt.a mGq;
  private p.c mGr;
  private Bitmap mGs;
  private Bitmap mGt;
  private Bitmap mGu;
  private Bitmap mGv;
  private Bitmap mGw;
  private Bitmap mGx;
  private Bitmap mGy;
  private Bitmap mGz;
  
  public LuckyMoneyF2FQRCodeUI()
  {
    GMTrace.i(9753065422848L, 72666);
    this.mGq = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(9763668623360L, 72745);
        paramAnonymousa = bh.q(com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY), "sysmsg");
        if (paramAnonymousa != null)
        {
          String str1 = (String)paramAnonymousa.get(".sysmsg.sendId");
          final String str2 = (String)paramAnonymousa.get(".sysmsg.username");
          final String str3 = (String)paramAnonymousa.get(".sysmsg.amount");
          final String str4 = (String)paramAnonymousa.get(".sysmsg.receiveId");
          if (bg.getInt((String)paramAnonymousa.get(".sysmsg.islucky"), 0) > 0) {
            LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, str2);
          }
          if (!bg.E(new String[] { str1, str2, str3 })) {
            LuckyMoneyF2FQRCodeUI.this.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(9750381068288L, 72646);
                Object localObject;
                if (!LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this).contains(str4))
                {
                  LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this).add(0, str4);
                  if (!s.fC(str2))
                  {
                    localObject = new com.tencent.mm.ac.h();
                    ((com.tencent.mm.ac.h)localObject).username = str2;
                    com.tencent.mm.ac.n.Di().a((com.tencent.mm.ac.h)localObject);
                  }
                  LuckyMoneyF2FQRCodeUI.b(LuckyMoneyF2FQRCodeUI.this).put(str4, str2);
                  localObject = LuckyMoneyF2FQRCodeUI.c(LuckyMoneyF2FQRCodeUI.this);
                  if (((ShuffleView)localObject).mHb.size() > 0)
                  {
                    if (((ShuffleView)localObject).mHg.isStarted()) {
                      ((ShuffleView)localObject).mHg.end();
                    }
                    if (((ShuffleView)localObject).mHf.isStarted()) {
                      ((ShuffleView)localObject).mHf.end();
                    }
                    if (((ShuffleView)localObject).mHl == null) {
                      break label357;
                    }
                    ((ShuffleView)localObject).mHj = ((ShuffleView)localObject).mHl;
                    ((ShuffleView)localObject).mHb.remove(((ShuffleView)localObject).mHj);
                    if (((ShuffleView)localObject).mHd != null) {
                      ((ShuffleView)localObject).mHd.start();
                    }
                    ((ShuffleView)localObject).pV(((ShuffleView)localObject).mHm);
                    if (((ShuffleView)localObject).mHp <= 0) {
                      break label344;
                    }
                    ((ShuffleView)localObject).mHm = ((ShuffleView)localObject).aLY();
                    ((ShuffleView)localObject).mHl = ((View)((ShuffleView)localObject).mHb.get(((ShuffleView)localObject).mHm));
                  }
                }
                for (;;)
                {
                  LuckyMoneyF2FQRCodeUI.d(LuckyMoneyF2FQRCodeUI.this).remove(LuckyMoneyF2FQRCodeUI.c(LuckyMoneyF2FQRCodeUI.this).mHj);
                  LuckyMoneyF2FQRCodeUI.e(LuckyMoneyF2FQRCodeUI.this).z(0L, 60000L);
                  LuckyMoneyF2FQRCodeUI.f(LuckyMoneyF2FQRCodeUI.this).add(new Pair(str2, Integer.valueOf(bg.getInt(str3, 0))));
                  GMTrace.o(9750381068288L, 72646);
                  return;
                  label344:
                  ((ShuffleView)localObject).mHl = null;
                  ((ShuffleView)localObject).mHm = 0;
                  continue;
                  label357:
                  ((ShuffleView)localObject).pT(((ShuffleView)localObject).aLY());
                  ((ShuffleView)localObject).mHj = ((ShuffleView)localObject).mHl;
                  ((ShuffleView)localObject).mHg.addListener(new ShuffleView.5((ShuffleView)localObject));
                }
              }
            });
          }
        }
        GMTrace.o(9763668623360L, 72745);
      }
    };
    this.mGr = new p.c()
    {
      public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
      {
        GMTrace.i(9778835226624L, 72858);
        paramAnonymousn.em(1, a.i.sUi);
        GMTrace.o(9778835226624L, 72858);
      }
    };
    this.jZA = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(9776687742976L, 72842);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(9776687742976L, 72842);
          return;
          if (LuckyMoneyF2FQRCodeUI.g(LuckyMoneyF2FQRCodeUI.this) > 0)
          {
            LuckyMoneyF2FQRCodeUI.h(LuckyMoneyF2FQRCodeUI.this);
            GMTrace.o(9776687742976L, 72842);
            return;
          }
          com.tencent.mm.ui.base.h.bm(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.this.getString(a.i.sUj));
        }
      }
    };
    this.mGE = new com.tencent.mm.plugin.luckymoney.particles.b()
    {
      public final com.tencent.mm.plugin.luckymoney.particles.a.b b(Random paramAnonymousRandom)
      {
        GMTrace.i(9765145018368L, 72756);
        int i = paramAnonymousRandom.nextInt(100);
        if (i < 16)
        {
          if (LuckyMoneyF2FQRCodeUI.i(LuckyMoneyF2FQRCodeUI.this) == null) {
            LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.soi, 36));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.i(LuckyMoneyF2FQRCodeUI.this));
          GMTrace.o(9765145018368L, 72756);
          return paramAnonymousRandom;
        }
        if (i < 33)
        {
          if (LuckyMoneyF2FQRCodeUI.j(LuckyMoneyF2FQRCodeUI.this) == null) {
            LuckyMoneyF2FQRCodeUI.b(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.soj, 36));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.j(LuckyMoneyF2FQRCodeUI.this));
          GMTrace.o(9765145018368L, 72756);
          return paramAnonymousRandom;
        }
        if (i < 50)
        {
          if (LuckyMoneyF2FQRCodeUI.k(LuckyMoneyF2FQRCodeUI.this) == null) {
            LuckyMoneyF2FQRCodeUI.c(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.sok, 36));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.k(LuckyMoneyF2FQRCodeUI.this));
          GMTrace.o(9765145018368L, 72756);
          return paramAnonymousRandom;
        }
        if (i < 70)
        {
          if (LuckyMoneyF2FQRCodeUI.l(LuckyMoneyF2FQRCodeUI.this) == null) {
            LuckyMoneyF2FQRCodeUI.d(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.sod, 36));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.l(LuckyMoneyF2FQRCodeUI.this));
          GMTrace.o(9765145018368L, 72756);
          return paramAnonymousRandom;
        }
        if (i < 90)
        {
          if (LuckyMoneyF2FQRCodeUI.m(LuckyMoneyF2FQRCodeUI.this) == null) {
            LuckyMoneyF2FQRCodeUI.e(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.soe, 36));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.m(LuckyMoneyF2FQRCodeUI.this));
          GMTrace.o(9765145018368L, 72756);
          return paramAnonymousRandom;
        }
        if (LuckyMoneyF2FQRCodeUI.n(LuckyMoneyF2FQRCodeUI.this) == null) {
          LuckyMoneyF2FQRCodeUI.f(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.sof, 36));
        }
        paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.n(LuckyMoneyF2FQRCodeUI.this));
        GMTrace.o(9765145018368L, 72756);
        return paramAnonymousRandom;
      }
    };
    this.mGF = new com.tencent.mm.plugin.luckymoney.particles.b()
    {
      public final com.tencent.mm.plugin.luckymoney.particles.a.b b(Random paramAnonymousRandom)
      {
        GMTrace.i(9778298355712L, 72854);
        int i = paramAnonymousRandom.nextInt(100);
        if (i < 10)
        {
          if (LuckyMoneyF2FQRCodeUI.o(LuckyMoneyF2FQRCodeUI.this) == null) {
            LuckyMoneyF2FQRCodeUI.g(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.soi, 32));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.o(LuckyMoneyF2FQRCodeUI.this));
          GMTrace.o(9778298355712L, 72854);
          return paramAnonymousRandom;
        }
        if (i < 20)
        {
          if (LuckyMoneyF2FQRCodeUI.p(LuckyMoneyF2FQRCodeUI.this) == null) {
            LuckyMoneyF2FQRCodeUI.h(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.soj, 32));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.p(LuckyMoneyF2FQRCodeUI.this));
          GMTrace.o(9778298355712L, 72854);
          return paramAnonymousRandom;
        }
        if (i < 30)
        {
          if (LuckyMoneyF2FQRCodeUI.q(LuckyMoneyF2FQRCodeUI.this) == null) {
            LuckyMoneyF2FQRCodeUI.i(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.sok, 32));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.q(LuckyMoneyF2FQRCodeUI.this));
          GMTrace.o(9778298355712L, 72854);
          return paramAnonymousRandom;
        }
        if (i < 50)
        {
          if (LuckyMoneyF2FQRCodeUI.r(LuckyMoneyF2FQRCodeUI.this) == null) {
            LuckyMoneyF2FQRCodeUI.j(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.sod, 32));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.r(LuckyMoneyF2FQRCodeUI.this));
          GMTrace.o(9778298355712L, 72854);
          return paramAnonymousRandom;
        }
        if (i < 75)
        {
          if (LuckyMoneyF2FQRCodeUI.s(LuckyMoneyF2FQRCodeUI.this) == null) {
            LuckyMoneyF2FQRCodeUI.k(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.soe, 32));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.s(LuckyMoneyF2FQRCodeUI.this));
          GMTrace.o(9778298355712L, 72854);
          return paramAnonymousRandom;
        }
        if (LuckyMoneyF2FQRCodeUI.t(LuckyMoneyF2FQRCodeUI.this) == null) {
          LuckyMoneyF2FQRCodeUI.l(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, a.e.sof, 32));
        }
        paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.t(LuckyMoneyF2FQRCodeUI.this));
        GMTrace.o(9778298355712L, 72854);
        return paramAnonymousRandom;
      }
    };
    this.mGG = new SensorEventListener()
    {
      float jqu;
      final int mGM;
      float mGN;
      int mGO;
      ValueAnimator mGP;
      
      public final void onAccuracyChanged(Sensor paramAnonymousSensor, int paramAnonymousInt)
      {
        GMTrace.i(9778029920256L, 72852);
        w.i("LuckyMoneyF2FQRCodeUI", "onAccuracyChanged");
        GMTrace.o(9778029920256L, 72852);
      }
      
      public final void onSensorChanged(SensorEvent paramAnonymousSensorEvent)
      {
        float f1 = -3.0F;
        GMTrace.i(9777895702528L, 72851);
        float f2;
        if (paramAnonymousSensorEvent.sensor.getType() == 1)
        {
          if (LuckyMoneyF2FQRCodeUI.g(LuckyMoneyF2FQRCodeUI.this) <= 0)
          {
            GMTrace.o(9777895702528L, 72851);
            return;
          }
          if (this.mGO == 0) {
            this.mGO = (com.tencent.mm.pluginsdk.e.bX(LuckyMoneyF2FQRCodeUI.this) + (int)this.mGN);
          }
          f2 = paramAnonymousSensorEvent.values[1];
          if (Math.abs(f2 - this.jqu) < 0.05D)
          {
            GMTrace.o(9777895702528L, 72851);
            return;
          }
          this.jqu = f2;
          w.d("LuckyMoneyF2FQRCodeUI", "[onSensorChanged] y:%s ", new Object[] { Float.valueOf(f2) });
          if (f2 >= -3.0F) {
            break label258;
          }
        }
        for (;;)
        {
          f1 = f1 / 3.0F * this.mGO + this.mGO;
          w.d("LuckyMoneyF2FQRCodeUI", "paddingTop:%s nowPaddingTop:%s", new Object[] { Float.valueOf(f1), Integer.valueOf(LuckyMoneyF2FQRCodeUI.N(LuckyMoneyF2FQRCodeUI.this).getPaddingTop()) });
          if (this.mGP != null) {
            this.mGP.cancel();
          }
          this.mGP = ValueAnimator.ofFloat(new float[] { LuckyMoneyF2FQRCodeUI.N(LuckyMoneyF2FQRCodeUI.this).getPaddingTop(), f1 }).setDuration(200L);
          this.mGP.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
          {
            public final void onAnimationUpdate(ValueAnimator paramAnonymous2ValueAnimator)
            {
              GMTrace.i(9752662769664L, 72663);
              float f = ((Float)paramAnonymous2ValueAnimator.getAnimatedValue()).floatValue();
              LuckyMoneyF2FQRCodeUI.N(LuckyMoneyF2FQRCodeUI.this).setPadding(LuckyMoneyF2FQRCodeUI.N(LuckyMoneyF2FQRCodeUI.this).getPaddingLeft(), (int)f, LuckyMoneyF2FQRCodeUI.N(LuckyMoneyF2FQRCodeUI.this).getPaddingRight(), LuckyMoneyF2FQRCodeUI.N(LuckyMoneyF2FQRCodeUI.this).getPaddingBottom());
              f /= LuckyMoneyF2FQRCodeUI.8.this.mGO;
              if (f <= 1.0F)
              {
                LuckyMoneyF2FQRCodeUI.P(LuckyMoneyF2FQRCodeUI.this).setAlpha(1.0F - f + LuckyMoneyF2FQRCodeUI.O(LuckyMoneyF2FQRCodeUI.this));
                LuckyMoneyF2FQRCodeUI.Q(LuckyMoneyF2FQRCodeUI.this).setAlpha(f * LuckyMoneyF2FQRCodeUI.O(LuckyMoneyF2FQRCodeUI.this));
                GMTrace.o(9752662769664L, 72663);
                return;
              }
              LuckyMoneyF2FQRCodeUI.P(LuckyMoneyF2FQRCodeUI.this).setAlpha(LuckyMoneyF2FQRCodeUI.O(LuckyMoneyF2FQRCodeUI.this));
              LuckyMoneyF2FQRCodeUI.Q(LuckyMoneyF2FQRCodeUI.this).setAlpha(LuckyMoneyF2FQRCodeUI.O(LuckyMoneyF2FQRCodeUI.this));
              GMTrace.o(9752662769664L, 72663);
            }
          });
          this.mGP.start();
          GMTrace.o(9777895702528L, 72851);
          return;
          label258:
          if (f2 > 0.0F) {
            f1 = 0.0F;
          } else {
            f1 = f2;
          }
        }
      }
    };
    GMTrace.o(9753065422848L, 72666);
  }
  
  private void aLT()
  {
    GMTrace.i(9753333858304L, 72668);
    Object localObject1;
    Object localObject2;
    int[] arrayOfInt1;
    int i1;
    int i;
    int j;
    int i2;
    if (!bg.nm(this.kBQ))
    {
      localObject1 = this.kBQ;
      localObject2 = new byte[40000];
      arrayOfInt1 = new int[2];
      i1 = QbarNative.a((byte[])localObject2, arrayOfInt1, (String)localObject1, 0, 1, "UTF-8");
      QbarNative.nativeRelease();
      if (i1 <= 0) {
        break label1914;
      }
      localObject1 = getResources().getDisplayMetrics();
      i = ((DisplayMetrics)localObject1).widthPixels;
      j = ((DisplayMetrics)localObject1).heightPixels;
      if (i < j)
      {
        i = (int)(i * 0.8D);
        i2 = (int)(arrayOfInt1[0] * 0.1D);
        i /= (arrayOfInt1[0] + i2 * 2);
        if (i != 0) {
          break label2076;
        }
        i = 1;
      }
    }
    label653:
    label660:
    label1914:
    label1974:
    label2076:
    for (;;)
    {
      int i5 = i2 * i;
      int i6 = i * (arrayOfInt1[0] + i2 * 2);
      int i7 = arrayOfInt1[1] * i + i * 2 * i2;
      localObject1 = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
      int[] arrayOfInt3 = new int[i6 * i7];
      int i3 = i / 2;
      int i4 = i / 2;
      Canvas localCanvas = new Canvas((Bitmap)localObject1);
      Paint localPaint = new Paint();
      localPaint.setAntiAlias(true);
      Arrays.fill(arrayOfInt3, -1);
      int[] arrayOfInt2 = new int[6];
      arrayOfInt2[0] = (i * 3 + i / 2);
      arrayOfInt2[1] = (i * 3 + i / 2);
      arrayOfInt2[2] = ((arrayOfInt1[0] - 1 - 3) * i + i / 2);
      arrayOfInt2[3] = (i * 3 + i / 2);
      arrayOfInt2[4] = (i * 3 + i / 2);
      arrayOfInt2[5] = ((arrayOfInt1[1] - 1 - 3) * i + i / 2);
      j = 0;
      int k;
      int m;
      int n;
      for (;;)
      {
        if (j >= arrayOfInt1[1]) {
          break label660;
        }
        k = 0;
        for (;;)
        {
          if (k >= arrayOfInt1[0]) {
            break label653;
          }
          if (localObject2[(arrayOfInt1[0] * j + k)] == 1)
          {
            if (((j >= 0) && (j <= 6) && (k >= 0) && (k <= 6)) || ((j >= 0) && (j <= 6) && (k >= arrayOfInt1[0] - 7) && (k <= arrayOfInt1[0] - 1)) || ((j >= arrayOfInt1[1] - 7) && (j <= arrayOfInt1[1] - 1) && (k >= 0) && (k <= 6))) {
              m = 0;
            }
            for (;;)
            {
              if (m < i)
              {
                n = 0;
                for (;;)
                {
                  if (n < i)
                  {
                    arrayOfInt3[((j * i + i5 + m) * i6 + k * i + i5 + n)] = -1;
                    n += 1;
                    continue;
                    i = j;
                    break;
                  }
                }
                m += 1;
                continue;
                boolean[] arrayOfBoolean = new boolean[10];
                arrayOfBoolean[5] = true;
                if (arrayOfBoolean[((int)(Math.random() * 10.0D))] != 0)
                {
                  m = 0;
                  while (m < i)
                  {
                    n = 0;
                    while (n < i)
                    {
                      arrayOfInt3[((j * i + i5 + m) * i6 + k * i + i5 + n)] = -3041484;
                      n += 1;
                    }
                    m += 1;
                  }
                }
                m = 0;
                while (m < i)
                {
                  n = 0;
                  while (n < i)
                  {
                    arrayOfInt3[((j * i + i5 + m) * i6 + k * i + i5 + n)] = -2598591;
                    n += 1;
                  }
                  m += 1;
                }
              }
            }
          }
          k += 1;
        }
        j += 1;
      }
      ((Bitmap)localObject1).setPixels(arrayOfInt3, 0, i6, 0, 0, i6, i7);
      j = 0;
      while (j < 3)
      {
        localPaint.setColor(-2598591);
        localPaint.setStyle(Paint.Style.FILL);
        localCanvas.drawCircle(i * i2 + arrayOfInt2[(j * 2)], i * i2 + arrayOfInt2[(j * 2 + 1)], i * 3 + i4, localPaint);
        localPaint.setColor(-1);
        localCanvas.drawCircle(i * i2 + arrayOfInt2[(j * 2)], i * i2 + arrayOfInt2[(j * 2 + 1)], i * 2 + i3, localPaint);
        j += 1;
      }
      j = 0;
      while (j < 3)
      {
        localPaint.setColor(-3041484);
        localPaint.setStyle(Paint.Style.FILL);
        k = arrayOfInt2[(j * 2)];
        m = i * 1 / 4;
        n = arrayOfInt2[(j * 2 + 1)];
        i3 = i * 1 / 4;
        i4 = arrayOfInt2[(j * 2)];
        i5 = i * 1 / 4;
        i6 = arrayOfInt2[(j * 2 + 1)];
        i7 = i * 1 / 4;
        localCanvas.drawRect(i * i2 + k - i - m, i * i2 + n - i - i3, i5 + (i * i2 + i4 + i), i7 + (i * i2 + i6 + i), localPaint);
        j += 1;
      }
      j = 0;
      while (j < 3)
      {
        localPaint.setColor(-1);
        localPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        localObject2 = new Path();
        ((Path)localObject2).moveTo(i * i2 + arrayOfInt2[(j * 2)] - i - i * 1 / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        ((Path)localObject2).quadTo(i * i2 + arrayOfInt2[(j * 2)], i * i2 + arrayOfInt2[(j * 2 + 1)] - i, i * i2 + arrayOfInt2[(j * 2)] + i + i / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        ((Path)localObject2).lineTo(i * i2 + arrayOfInt2[(j * 2)] - i - i * 1 / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        ((Path)localObject2).close();
        localCanvas.drawPath((Path)localObject2, localPaint);
        ((Path)localObject2).moveTo(i * i2 + arrayOfInt2[(j * 2)] - i - i * 1 / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        ((Path)localObject2).quadTo(i * i2 + arrayOfInt2[(j * 2)] - i, i * i2 + arrayOfInt2[(j * 2 + 1)], i * i2 + arrayOfInt2[(j * 2)] - i - i / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        ((Path)localObject2).lineTo(i * i2 + arrayOfInt2[(j * 2)] - i - i * 1 / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        ((Path)localObject2).close();
        localCanvas.drawPath((Path)localObject2, localPaint);
        ((Path)localObject2).moveTo(i * i2 + arrayOfInt2[(j * 2)] + i + i * 1 / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        ((Path)localObject2).quadTo(i * i2 + arrayOfInt2[(j * 2)], i * i2 + arrayOfInt2[(j * 2 + 1)] + i, i * i2 + arrayOfInt2[(j * 2)] - i - i / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        ((Path)localObject2).lineTo(i * i2 + arrayOfInt2[(j * 2)] + i + i * 1 / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        ((Path)localObject2).close();
        localCanvas.drawPath((Path)localObject2, localPaint);
        ((Path)localObject2).moveTo(i * i2 + arrayOfInt2[(j * 2)] + i + i * 1 / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        ((Path)localObject2).quadTo(i * i2 + arrayOfInt2[(j * 2)] + i, i * i2 + arrayOfInt2[(j * 2 + 1)], i * i2 + arrayOfInt2[(j * 2)] + i + i / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        ((Path)localObject2).lineTo(i * i2 + arrayOfInt2[(j * 2)] + i + i * 1 / 4, i * i2 + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        ((Path)localObject2).close();
        localCanvas.drawPath((Path)localObject2, localPaint);
        j += 1;
      }
      if (localObject1 == null) {
        w.i("MicroMsg.QRCodeBitmapFactory", "createBitmap bm is error result %d %s", new Object[] { Integer.valueOf(i1), bg.bQW().toString() });
      }
      for (;;)
      {
        this.mBitmap = ((Bitmap)localObject1);
        this.mFQ.setImageBitmap(this.mBitmap);
        if (this.mFH > 0) {
          break label1974;
        }
        this.mFQ.setPadding(com.tencent.mm.br.a.fromDPToPix(this, 5), com.tencent.mm.br.a.fromDPToPix(this, 5), com.tencent.mm.br.a.fromDPToPix(this, 5), com.tencent.mm.br.a.fromDPToPix(this, 5));
        this.mFQ.setImageResource(a.e.soc);
        this.mFY.setVisibility(8);
        this.mFZ.setVisibility(0);
        this.mFR.setVisibility(4);
        this.mFL.setPadding(this.mFL.getPaddingLeft(), com.tencent.mm.pluginsdk.e.bX(this), this.mFL.getPaddingRight(), this.mFL.getPaddingBottom());
        if (this.mFU.size() <= 0) {
          break;
        }
        this.mFS.setText(getString(a.i.sUm));
        GMTrace.o(9753333858304L, 72668);
        return;
        w.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", new Object[] { localObject1 });
        continue;
        w.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", new Object[] { Integer.valueOf(i1), bg.bQW().toString() });
        localObject1 = null;
      }
      this.mFS.setText(getString(a.i.sUn));
      GMTrace.o(9753333858304L, 72668);
      return;
      this.mFQ.setPadding(0, 0, 0, 0);
      this.mFR.setText(getString(a.i.sUr));
      this.mFR.setVisibility(0);
      this.mFS.setText(getString(a.i.sUr));
      this.mFY.setText(getString(a.i.sUq, new Object[] { Integer.valueOf(this.mFH) }));
      this.mFY.setVisibility(0);
      this.mFZ.setVisibility(8);
      GMTrace.o(9753333858304L, 72668);
      return;
    }
  }
  
  private void aLU()
  {
    GMTrace.i(9753468076032L, 72669);
    HashSet localHashSet = new HashSet();
    localHashSet.add("touch_card.m4a");
    localHashSet.add("select_card.m4a");
    int i = 1;
    while (i <= 8)
    {
      localHashSet.add("music" + i + ".m4a");
      i += 1;
    }
    localHashSet.add("packet_received.m4a");
    localHashSet.add("most_lucky.m4a");
    localHashSet.add("whistle.m4a");
    com.tencent.mm.plugin.luckymoney.f2f.a locala = this.mGi;
    WeakReference localWeakReference = new WeakReference(this);
    com.tencent.mm.kernel.h.xB().A(new a.1(locala, localHashSet, localWeakReference));
    locala.mFg.setOnLoadCompleteListener(new a.2(locala));
    GMTrace.o(9753468076032L, 72669);
  }
  
  private void aLV()
  {
    GMTrace.i(9753602293760L, 72670);
    int i = this.mFT.getWidth() - this.mFU.size() * getResources().getDimensionPixelSize(a.d.aPw);
    if (i > 0)
    {
      this.mFT.setPadding(i / 2, 0, i / 2, 0);
      GMTrace.o(9753602293760L, 72670);
      return;
    }
    this.mFT.setPadding(0, 0, 0, 0);
    GMTrace.o(9753602293760L, 72670);
  }
  
  private void aLW()
  {
    GMTrace.i(9753736511488L, 72671);
    if (this.mGe.size() != this.mFH)
    {
      w.i("LuckyMoneyF2FQRCodeUI", "shuffle cards: %d", new Object[] { Integer.valueOf(this.mGe.size()), Integer.valueOf(this.mFH) });
      this.mGe.clear();
      int i = 0;
      while (i < this.mFH)
      {
        localObject = LayoutInflater.from(this).inflate(a.g.sMO, this.mGc, false);
        ((FrameLayout.LayoutParams)((View)localObject).getLayoutParams()).gravity = 81;
        this.mGe.add(localObject);
        i += 1;
      }
      Object localObject = this.mGc;
      List localList = this.mGe;
      ((ShuffleView)localObject).mHb.clear();
      ((ShuffleView)localObject).mHb.addAll(localList);
      ((ShuffleView)localObject).mHm = 0;
      ((ShuffleView)localObject).mHl = null;
      ((ShuffleView)localObject).mHo = -1;
      ((ShuffleView)localObject).mHn = null;
      ((ShuffleView)localObject).removeAllViews();
      localList = ((ShuffleView)localObject).mHb;
      if (localList.size() > 100) {
        ((ShuffleView)localObject).mHp = 100;
      }
      for (;;)
      {
        i = ((ShuffleView)localObject).mHp - 1;
        while (i >= 0)
        {
          ((ShuffleView)localObject).addView((View)localList.get(i));
          i -= 1;
        }
        ((ShuffleView)localObject).mHp = localList.size();
        if (((ShuffleView)localObject).mHp == 1) {
          ((View)localList.get(0)).findViewById(a.f.syM).setVisibility(0);
        }
      }
      ((ShuffleView)localObject).addOnLayoutChangeListener(new ShuffleView.1((ShuffleView)localObject));
    }
    GMTrace.o(9753736511488L, 72671);
  }
  
  protected final int Qf()
  {
    GMTrace.i(9754407600128L, 72676);
    GMTrace.o(9754407600128L, 72676);
    return 1;
  }
  
  public final void abx()
  {
    GMTrace.i(9754810253312L, 72679);
    w.i("LuckyMoneyF2FQRCodeUI", "screenShot");
    if (this.mFH > 0)
    {
      aLT();
      int[] arrayOfInt = this.mGp;
      arrayOfInt[1] += 1;
      com.tencent.mm.ui.base.h.b(this, getString(a.i.sUs), null, true);
    }
    GMTrace.o(9754810253312L, 72679);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 0;
    GMTrace.i(9754676035584L, 72678);
    w.i("LuckyMoneyF2FQRCodeUI", "errType: %d,errCode: %d,errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof d))
      {
        w.d("LuckyMoneyF2FQRCodeUI", "sendId:" + this.mFr);
        if ((!bg.E(new String[] { this.mFr, ((d)paramk).mFr })) && (!this.mFr.equals(((d)paramk).mFr)))
        {
          this.mFU.clear();
          this.mFV.clear();
          this.mFW.clear();
          this.mFX.notifyDataSetChanged();
          this.mGk = "";
        }
        if (!bg.nm(((d)paramk).mFr)) {
          this.mFr = ((d)paramk).mFr;
        }
        this.kBQ = ((d)paramk).kBQ;
        this.mFH = ((d)paramk).mFH;
        this.mFG = ((d)paramk).mFG;
        aLT();
        aLW();
        if (this.mFH == 0) {
          this.ikv.stopTimer();
        }
        if ((this.mFU.size() == 0) && (!bg.nm(this.mFr))) {
          b(new u(this.mFr, 5, 0, null, "v1.0"), false);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(9754676035584L, 72678);
      return true;
      if ((paramk instanceof com.tencent.mm.plugin.luckymoney.f2f.a.a))
      {
        this.mFr = "";
        this.kBQ = "";
        this.mFH = 0;
        this.mFU.clear();
        this.mGk = "";
        this.mFX.notifyDataSetChanged();
        aLT();
        aLW();
        this.ikv.stopTimer();
        if (!bg.nm(this.mFG)) {
          com.tencent.mm.ui.base.h.bm(this, this.mFG);
        }
      }
      else if ((paramk instanceof u))
      {
        this.mGj = ((u)paramk).mJj.mIk;
        paramString = ((u)paramk).mJj.mIz;
        if ((paramString != null) && (paramString.size() > 0))
        {
          paramInt1 = i;
          while (paramInt1 < paramString.size())
          {
            paramk = (m)paramString.get(paramInt1);
            if ((!bg.nm(paramk.mIn)) && (!this.mFU.contains(paramk.mIn)))
            {
              this.mFU.add(paramk.mIn);
              String str = com.tencent.mm.ac.n.Dv().hV(paramk.mIX);
              if (!bg.nm(paramk.mIZ)) {
                this.mGk = str;
              }
              this.mFV.put(paramk.mIn, str);
            }
            paramInt1 += 1;
          }
          aLV();
          this.mFX.notifyDataSetChanged();
          continue;
          if (!bg.nm(paramString)) {
            com.tencent.mm.ui.base.h.b(this, paramString, getString(a.i.cUG), true);
          }
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9754541817856L, 72677);
    int i = a.g.sMP;
    GMTrace.o(9754541817856L, 72677);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9753199640576L, 72667);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    this.hjd = getResources().getDisplayMetrics();
    this.mFU = new ArrayList();
    this.mFV = new HashMap();
    this.mFW = new LinkedList();
    this.mGe = new ArrayList();
    this.mGp = new int[6];
    paramBundle = this.mGp;
    paramBundle[0] += 1;
    this.ikv = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(9778566791168L, 72856);
        d locald = new d();
        LuckyMoneyF2FQRCodeUI.this.b(locald, false);
        GMTrace.o(9778566791168L, 72856);
        return true;
      }
    }, true);
    this.hqH = ((TextView)findViewById(a.f.chT));
    this.Ks = findViewById(a.f.syI);
    this.mFL = findViewById(a.f.sLo);
    this.mFS = ((TextView)findViewById(a.f.syE));
    this.mFR = ((TextView)findViewById(a.f.syF));
    this.mGo = this.mFS.getAlpha();
    this.mFQ = ((ImageView)this.Ks.findViewById(a.f.syD));
    this.mFT = ((HorizontalListViewV2)findViewById(a.f.syG));
    this.mFX = new a((byte)0);
    this.mFT.setAdapter(this.mFX);
    this.mFT.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9766487195648L, 72766);
        paramAnonymousAdapterView = new Intent(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyDetailUI.class);
        paramAnonymousAdapterView.putExtra("key_sendid", LuckyMoneyF2FQRCodeUI.u(LuckyMoneyF2FQRCodeUI.this));
        LuckyMoneyF2FQRCodeUI.this.startActivity(paramAnonymousAdapterView);
        GMTrace.o(9766487195648L, 72766);
      }
    });
    this.mFT.vZR = new HorizontalListViewV2.d()
    {
      public final void pQ(int paramAnonymousInt)
      {
        GMTrace.i(9752394334208L, 72661);
        if ((paramAnonymousInt == HorizontalListViewV2.d.a.wab) && (LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this).size() >= 5) && (LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this).size() < LuckyMoneyF2FQRCodeUI.v(LuckyMoneyF2FQRCodeUI.this)) && (LuckyMoneyF2FQRCodeUI.w(LuckyMoneyF2FQRCodeUI.this).getLastVisiblePosition() == LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this).size() - 1) && (!bg.nm(LuckyMoneyF2FQRCodeUI.u(LuckyMoneyF2FQRCodeUI.this))))
        {
          u localu = new u(LuckyMoneyF2FQRCodeUI.u(LuckyMoneyF2FQRCodeUI.this), 5, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this).size(), null, "v1.0");
          LuckyMoneyF2FQRCodeUI.this.l(localu);
        }
        GMTrace.o(9752394334208L, 72661);
      }
    };
    this.mFZ = ((Button)findViewById(a.f.syC));
    this.mFZ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9783130193920L, 72890);
        paramAnonymousView = new Intent(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyPrepareUI.class);
        paramAnonymousView.putExtra("key_from", 2);
        LuckyMoneyF2FQRCodeUI.this.startActivity(paramAnonymousView);
        GMTrace.o(9783130193920L, 72890);
      }
    });
    this.mFY = ((TextView)findViewById(a.f.syK));
    this.mFM = findViewById(a.f.syJ);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9776150872064L, 72838);
        LuckyMoneyF2FQRCodeUI.this.finish();
        GMTrace.o(9776150872064L, 72838);
        return true;
      }
    });
    sq(getString(a.i.sUt));
    this.mGa = findViewById(a.f.bfv);
    this.mGa.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9750917939200L, 72650);
        LuckyMoneyF2FQRCodeUI.this.finish();
        GMTrace.o(9750917939200L, 72650);
      }
    });
    this.mGb = findViewById(a.f.sCA);
    this.mGb.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9775882436608L, 72836);
        LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, new f(LuckyMoneyF2FQRCodeUI.this, f.xpQ, false));
        LuckyMoneyF2FQRCodeUI.y(LuckyMoneyF2FQRCodeUI.this).qik = LuckyMoneyF2FQRCodeUI.x(LuckyMoneyF2FQRCodeUI.this);
        LuckyMoneyF2FQRCodeUI.y(LuckyMoneyF2FQRCodeUI.this).qil = LuckyMoneyF2FQRCodeUI.z(LuckyMoneyF2FQRCodeUI.this);
        LuckyMoneyF2FQRCodeUI.y(LuckyMoneyF2FQRCodeUI.this).bFk();
        GMTrace.o(9775882436608L, 72836);
      }
    });
    this.hqH.setText(a.i.sUt);
    this.mGf = ((ViewGroup)findViewById(a.f.syy));
    this.mGg = ((ViewGroup)findViewById(a.f.syx));
    this.mGh = findViewById(a.f.syA);
    this.mGh.setAlpha(0.0F);
    this.aDS = ((SensorManager)getSystemService("sensor"));
    this.aDS.registerListener(this.mGG, this.aDS.getDefaultSensor(1), 3);
    this.mGi = new com.tencent.mm.plugin.luckymoney.f2f.a();
    this.mGc = ((ShuffleView)findViewById(a.f.syL));
    this.mGd = new ShuffleView.c();
    this.mGd.mHH = 4;
    this.mGd.mHF = 2;
    this.mGd.mHG = 4;
    this.mGd.mHK = 300;
    this.mGd.mHJ = 0.0F;
    paramBundle = this.mGc;
    Object localObject = this.mGd;
    paramBundle.mHc = ((ShuffleView.c)localObject);
    paramBundle.mHf = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(((ShuffleView.c)localObject).mHK);
    paramBundle.mHg = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(((ShuffleView.c)localObject).mHL);
    ShuffleView.hjd = this.hjd;
    paramBundle = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(300L);
    localObject = this.mGc;
    if (((ShuffleView)localObject).mHd != null)
    {
      ((ShuffleView)localObject).mHd.removeAllListeners();
      ((ShuffleView)localObject).mHd.cancel();
    }
    ((ShuffleView)localObject).mHd = paramBundle;
    if (((ShuffleView)localObject).mHd != null) {
      ((ShuffleView)localObject).mHd.addUpdateListener(new ShuffleView.6((ShuffleView)localObject));
    }
    this.mGc.mHh = new ShuffleView.a()
    {
      public final void a(ValueAnimator paramAnonymousValueAnimator, View paramAnonymousView)
      {
        GMTrace.i(9782593323008L, 72886);
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        if (f == 0.0F)
        {
          LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, paramAnonymousView.getTranslationX());
          LuckyMoneyF2FQRCodeUI.b(LuckyMoneyF2FQRCodeUI.this, paramAnonymousView.getTranslationY());
          paramAnonymousView.findViewById(a.f.syM).setVisibility(0);
        }
        paramAnonymousView.setTranslationX((1.0F - f) * LuckyMoneyF2FQRCodeUI.A(LuckyMoneyF2FQRCodeUI.this));
        paramAnonymousView.setTranslationY((1.0F - f) * LuckyMoneyF2FQRCodeUI.B(LuckyMoneyF2FQRCodeUI.this) - (LuckyMoneyF2FQRCodeUI.c(LuckyMoneyF2FQRCodeUI.this).getHeight() + LuckyMoneyF2FQRCodeUI.B(LuckyMoneyF2FQRCodeUI.this) * 8.0F) * f);
        paramAnonymousView.setScaleX(0.5F * f + 1.0F);
        paramAnonymousView.setScaleY(0.5F * f + 1.0F);
        paramAnonymousValueAnimator = (Pair)LuckyMoneyF2FQRCodeUI.f(LuckyMoneyF2FQRCodeUI.this).peek();
        if ((paramAnonymousValueAnimator != null) && (!bg.nm(LuckyMoneyF2FQRCodeUI.C(LuckyMoneyF2FQRCodeUI.this))) && (LuckyMoneyF2FQRCodeUI.C(LuckyMoneyF2FQRCodeUI.this).equals(paramAnonymousValueAnimator.first))) {
          LuckyMoneyF2FQRCodeUI.D(LuckyMoneyF2FQRCodeUI.this).setAlpha(f);
        }
        w.i("LuckyMoneyF2FQRCodeUI", "fireworkBottomLayer %f", new Object[] { Float.valueOf(f) });
        if (f >= 0.9F)
        {
          paramAnonymousView.setAlpha((1.0F - f) * 10.0F);
          LuckyMoneyF2FQRCodeUI.E(LuckyMoneyF2FQRCodeUI.this).setAlpha(1.0F - (1.0F - f) * 10.0F);
          LuckyMoneyF2FQRCodeUI.E(LuckyMoneyF2FQRCodeUI.this).setScaleX(f);
          LuckyMoneyF2FQRCodeUI.E(LuckyMoneyF2FQRCodeUI.this).setScaleY(f);
          LuckyMoneyF2FQRCodeUI.E(LuckyMoneyF2FQRCodeUI.this).setVisibility(0);
        }
        if (f == 1.0F)
        {
          LuckyMoneyF2FQRCodeUI.F(LuckyMoneyF2FQRCodeUI.this).dD("packet_received.m4a");
          LuckyMoneyF2FQRCodeUI.c(LuckyMoneyF2FQRCodeUI.this).removeView(LuckyMoneyF2FQRCodeUI.c(LuckyMoneyF2FQRCodeUI.this).mHj);
          LuckyMoneyF2FQRCodeUI.G(LuckyMoneyF2FQRCodeUI.this);
          LuckyMoneyF2FQRCodeUI.H(LuckyMoneyF2FQRCodeUI.this).start();
        }
        GMTrace.o(9782593323008L, 72886);
      }
    };
    this.mGc.mHi = new ShuffleView.b()
    {
      public final void cp(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(9767292502016L, 72772);
        if (paramAnonymousInt2 == 8)
        {
          LuckyMoneyF2FQRCodeUI.F(LuckyMoneyF2FQRCodeUI.this).dD("music" + (paramAnonymousInt1 + 1) + ".m4a");
          arrayOfInt = LuckyMoneyF2FQRCodeUI.I(LuckyMoneyF2FQRCodeUI.this);
          arrayOfInt[4] += 1;
          GMTrace.o(9767292502016L, 72772);
          return;
        }
        LuckyMoneyF2FQRCodeUI.F(LuckyMoneyF2FQRCodeUI.this).dD("touch_card.m4a");
        int[] arrayOfInt = LuckyMoneyF2FQRCodeUI.I(LuckyMoneyF2FQRCodeUI.this);
        arrayOfInt[2] += 1;
        GMTrace.o(9767292502016L, 72772);
      }
      
      public final void cq(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(9767560937472L, 72774);
        if (paramAnonymousInt2 == 8)
        {
          LuckyMoneyF2FQRCodeUI.F(LuckyMoneyF2FQRCodeUI.this).dD("music" + (paramAnonymousInt1 + 1) + ".m4a");
          GMTrace.o(9767560937472L, 72774);
          return;
        }
        LuckyMoneyF2FQRCodeUI.F(LuckyMoneyF2FQRCodeUI.this).dD("select_card.m4a");
        GMTrace.o(9767560937472L, 72774);
      }
      
      public final void pP(int paramAnonymousInt)
      {
        GMTrace.i(9767426719744L, 72773);
        LuckyMoneyF2FQRCodeUI.J(LuckyMoneyF2FQRCodeUI.this);
        if (paramAnonymousInt != 8)
        {
          LuckyMoneyF2FQRCodeUI.F(LuckyMoneyF2FQRCodeUI.this).dD("select_card.m4a");
          arrayOfInt = LuckyMoneyF2FQRCodeUI.I(LuckyMoneyF2FQRCodeUI.this);
          arrayOfInt[3] += 1;
          GMTrace.o(9767426719744L, 72773);
          return;
        }
        int[] arrayOfInt = LuckyMoneyF2FQRCodeUI.I(LuckyMoneyF2FQRCodeUI.this);
        arrayOfInt[5] += 1;
        GMTrace.o(9767426719744L, 72773);
      }
    };
    aLU();
    this.mGl = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.mGl.setDuration(300L);
    this.mGl.setStartDelay(3000L);
    this.mGl.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(9783398629376L, 72892);
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        LuckyMoneyF2FQRCodeUI.E(LuckyMoneyF2FQRCodeUI.this).setTranslationY(-0.5F * f * LuckyMoneyF2FQRCodeUI.K(LuckyMoneyF2FQRCodeUI.this).heightPixels);
        LuckyMoneyF2FQRCodeUI.D(LuckyMoneyF2FQRCodeUI.this).setAlpha(1.0F - f);
        if (f == 1.0F)
        {
          LuckyMoneyF2FQRCodeUI.E(LuckyMoneyF2FQRCodeUI.this).setVisibility(8);
          LuckyMoneyF2FQRCodeUI.E(LuckyMoneyF2FQRCodeUI.this).setTranslationY(0.0F);
          LuckyMoneyF2FQRCodeUI.L(LuckyMoneyF2FQRCodeUI.this);
          LuckyMoneyF2FQRCodeUI.M(LuckyMoneyF2FQRCodeUI.this).notifyDataSetChanged();
          LuckyMoneyF2FQRCodeUI.w(LuckyMoneyF2FQRCodeUI.this).BG(0);
        }
        GMTrace.o(9783398629376L, 72892);
      }
    });
    aLT();
    getWindow().addFlags(128);
    GMTrace.o(9753199640576L, 72667);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9754273382400L, 72675);
    g.ork.i(14007, new Object[] { Integer.valueOf(this.mGp[0]), Integer.valueOf(this.mGp[1]), Integer.valueOf(this.mGp[2]), Integer.valueOf(this.mGp[3]), Integer.valueOf(this.mGp[4]), Integer.valueOf(this.mGp[5]) });
    com.tencent.mm.plugin.luckymoney.f2f.a locala = this.mGi;
    locala.mFj = true;
    locala.mFg.release();
    getWindow().clearFlags(128);
    super.onDestroy();
    GMTrace.o(9754273382400L, 72675);
  }
  
  protected void onPause()
  {
    GMTrace.i(9754139164672L, 72674);
    super.onPause();
    if (this.aDS != null) {
      this.aDS.unregisterListener(this.mGG);
    }
    GMTrace.o(9754139164672L, 72674);
  }
  
  protected void onResume()
  {
    GMTrace.i(9753870729216L, 72672);
    super.onResume();
    b(new d(), true);
    this.ikv.z(60000L, 60000L);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("ffopenwxhb", this.mGq, true);
    hN(1642);
    hN(1990);
    hN(1987);
    WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
    if (localLayoutParams.screenBrightness < 0.85F)
    {
      localLayoutParams.screenBrightness = 0.85F;
      getWindow().setAttributes(localLayoutParams);
    }
    au.a(this);
    if (this.aDS != null) {
      this.aDS.registerListener(this.mGG, this.aDS.getDefaultSensor(1), 3);
    }
    GMTrace.o(9753870729216L, 72672);
  }
  
  protected void onStop()
  {
    GMTrace.i(9754004946944L, 72673);
    super.onStop();
    this.ikv.stopTimer();
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("ffopenwxhb", this.mGq, true);
    hO(1990);
    hO(1642);
    hO(1987);
    au.a(null);
    GMTrace.o(9754004946944L, 72673);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(9763802841088L, 72746);
      GMTrace.o(9763802841088L, 72746);
    }
    
    private String iH(int paramInt)
    {
      GMTrace.i(9764071276544L, 72748);
      String str = (String)LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this).get(paramInt);
      GMTrace.o(9764071276544L, 72748);
      return str;
    }
    
    public final int getCount()
    {
      GMTrace.i(9763937058816L, 72747);
      int i = LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this).size();
      GMTrace.o(9763937058816L, 72747);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9764205494272L, 72749);
      long l = paramInt;
      GMTrace.o(9764205494272L, 72749);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9764339712000L, 72750);
      if (paramView == null)
      {
        paramView = LayoutInflater.from(LuckyMoneyF2FQRCodeUI.this).inflate(a.g.sMR, null);
        Object localObject = (ImageView)paramView.findViewById(a.f.syH);
        ImageView localImageView = (ImageView)paramView.findViewById(a.f.syB);
        paramViewGroup = new a();
        paramViewGroup.hrI = ((ImageView)localObject);
        paramViewGroup.mGR = localImageView;
        paramView.setTag(paramViewGroup);
        localObject = (String)LuckyMoneyF2FQRCodeUI.b(LuckyMoneyF2FQRCodeUI.this).get(iH(paramInt));
        com.tencent.mm.plugin.luckymoney.b.n.a(paramViewGroup.hrI, null, (String)localObject);
        if ((bg.nm(LuckyMoneyF2FQRCodeUI.C(LuckyMoneyF2FQRCodeUI.this))) || (!LuckyMoneyF2FQRCodeUI.C(LuckyMoneyF2FQRCodeUI.this).equals(localObject))) {
          break label166;
        }
        paramViewGroup.mGR.setVisibility(0);
      }
      for (;;)
      {
        GMTrace.o(9764339712000L, 72750);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label166:
        paramViewGroup.mGR.setVisibility(4);
      }
    }
    
    final class a
    {
      ImageView hrI;
      ImageView mGR;
      
      a()
      {
        GMTrace.i(9778969444352L, 72859);
        GMTrace.o(9778969444352L, 72859);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\f2f\ui\LuckyMoneyF2FQRCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */