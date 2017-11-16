package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.br.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.location.model.h;
import com.tencent.mm.plugin.location.ui.PoiHeaderView;
import com.tencent.mm.plugin.location.ui.SimpleImageView;
import com.tencent.mm.plugin.location.ui.SimpleImageView.a;
import com.tencent.mm.pluginsdk.location.LocationIntent;
import com.tencent.mm.protocal.c.abx;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.ui.tools.ActionBarSearchView;
import com.tencent.mm.ui.tools.ActionBarSearchView.a;
import com.tencent.mm.ui.tools.ActionBarSearchView.b;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
  extends b
  implements com.tencent.mm.ad.e
{
  private static int mDp;
  public static int mDq;
  private static int mDr;
  public static int mDs;
  private a.a fJt;
  public String gPW;
  public double lat;
  public double lng;
  protected PoiHeaderView mCE;
  public PickPoi mCF;
  public MMLoadMoreListView mCG;
  public MMLoadMoreListView mCH;
  public View mCI;
  public e mCJ;
  public e mCK;
  private View mCL;
  public ImageButton mCM;
  private h mCN;
  public f mCO;
  private View mCP;
  private ImageButton mCQ;
  ActionBarSearchView mCR;
  public TextView mCS;
  private com.tencent.mm.plugin.location.ui.e mCT;
  public com.tencent.mm.plugin.location.ui.g mCU;
  public double mCV;
  public double mCW;
  public boolean mCX;
  private int mCY;
  public RelativeLayout mCZ;
  FrameLayout mCt;
  private View mCv;
  public int mDa;
  public int mDc;
  private int mDd;
  public boolean mDe;
  public boolean mDf;
  public boolean mDg;
  public FrameLayout mDh;
  public float mDi;
  public float mDj;
  private int mDk;
  private long mDl;
  private long mDm;
  private long mDn;
  private int mDo;
  public boolean mDt;
  private String mwY;
  private int mwZ;
  private TextView titleView;
  
  static
  {
    GMTrace.i(9676695535616L, 72097);
    mDp = 11;
    mDq = 12;
    mDr = 13;
    mDs = 14;
    GMTrace.o(9676695535616L, 72097);
  }
  
  public c(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(9668910907392L, 72039);
    this.mCN = null;
    this.mCO = null;
    this.lat = -85.0D;
    this.lng = -1000.0D;
    this.mCV = -85.0D;
    this.mCW = -1000.0D;
    this.mwY = "";
    this.mCX = false;
    this.gPW = "";
    this.mCY = 0;
    this.mDe = true;
    this.mDf = false;
    this.mDg = false;
    this.mDk = 0;
    this.mDl = -1L;
    this.mDm = -1L;
    this.mDn = -1L;
    this.mDo = -1;
    this.mDt = false;
    this.mwZ = 1;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(18804172128256L, 140102);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(18804172128256L, 140102);
          return false;
        }
        if ((c.this.mCV == -85.0D) || (c.this.mCW == -1000.0D))
        {
          w.d("MicroMsg.MMPoiMapUI", "first get location");
          String str = (int)(1000000.0F * paramAnonymousFloat2) + "," + (int)(1000000.0F * paramAnonymousFloat1);
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vtd, str);
          c.this.mCV = paramAnonymousFloat2;
          c.this.mCW = paramAnonymousFloat1;
          c.this.mDi = paramAnonymousFloat2;
          c.this.mDj = paramAnonymousFloat1;
          c.this.lat = c.this.mCV;
          c.this.lng = c.this.mCW;
          c.this.mCF.k(c.this.lat, c.this.lng);
          c.this.mzz.getIController().animateTo(c.this.mCV, c.this.mCW, com.tencent.mm.plugin.location.ui.d.fE(false));
          if (!c.this.mCX) {
            c.this.fL(false);
          }
        }
        GMTrace.o(18804172128256L, 140102);
        return true;
      }
    };
    GMTrace.o(9668910907392L, 72039);
  }
  
  private void fM(boolean paramBoolean)
  {
    GMTrace.i(9670521520128L, 72051);
    w.d("MicroMsg.MMPoiMapUI", "enable send.. %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.mCP.setEnabled(paramBoolean);
    findViewById(R.h.bcH).setEnabled(paramBoolean);
    this.mCQ.setEnabled(paramBoolean);
    GMTrace.o(9670521520128L, 72051);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9670789955584L, 72053);
    if (paramk.getType() == 457)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        GMTrace.o(9670789955584L, 72053);
        return;
      }
      this.mCN = null;
      h localh = (h)paramk;
      if (!localh.mwY.equals(this.mwY))
      {
        w.i("MicroMsg.MMPoiMapUI", "pass this resp!" + this.mwY + " " + localh.mwY);
        GMTrace.o(9670789955584L, 72053);
        return;
      }
      w.i("MicroMsg.MMPoiMapUI", "isend " + localh.jAg + "searchId: " + localh.hSv);
      if (this.mDl == -1L)
      {
        long l = System.currentTimeMillis();
        this.mDm = l;
        this.mDl = l;
      }
      for (;;)
      {
        this.mwZ = localh.mwZ;
        if (!this.mCX) {
          break label388;
        }
        this.mCI.setVisibility(8);
        if ((this.mCK.getCount() != 0) || (localh.ePZ == null) || (localh.ePZ.size() != 0)) {
          break;
        }
        this.mCS.setVisibility(0);
        this.mCH.caa();
        GMTrace.o(9670789955584L, 72053);
        return;
        this.mDm = System.currentTimeMillis();
      }
      w.d("MicroMsg.MMPoiMapUI", "search is first: %s", new Object[] { Boolean.valueOf(localh.isFirst()) });
      if (localh.isFirst()) {
        this.mCK.mDG.clear();
      }
      this.mCK.a(localh.ePZ, localh.mwX, localh.jAg, localh.mwY);
      if (!this.mCK.jAg)
      {
        this.mCH.bZZ();
        this.mCH.cab();
        GMTrace.o(9670789955584L, 72053);
        return;
      }
      this.mCH.caa();
      GMTrace.o(9670789955584L, 72053);
      return;
      label388:
      Object localObject2;
      Object localObject1;
      if (this.mCE != null)
      {
        localObject2 = (abx)localh.fUa.gtD.gtK;
        paramk = this.mCE;
        localObject1 = ((abx)localObject2).ulE;
        paramString = ((abx)localObject2).urY;
        String str = ((abx)localObject2).lPM;
        at.AR();
        localObject2 = com.tencent.mm.y.c.yU();
        w.d("MicroMsg.PoiHeaderView", "setContent, url:%s, logUrl:%s", new Object[] { paramString, str });
        paramk.mzu = str;
        paramk.mzv = "";
        if ((!bg.nm((String)localObject1)) && (!bg.nm(paramString))) {
          break label745;
        }
        paramk.setVisibility(8);
        paramk.jPE.setVisibility(8);
        paramk.mzw.setVisibility(8);
      }
      for (;;)
      {
        this.mCL.setVisibility(8);
        fM(true);
        if (this.mCO != null)
        {
          paramString = localh.ePZ.iterator();
          while (paramString.hasNext())
          {
            paramk = (f)paramString.next();
            if ((paramk.mDN != null) && (paramk.mName != null) && (paramk.mDN.equals(this.mCO.mDN)) && (paramk.mName.equals(this.mCO.mName))) {
              localh.ePZ.remove(paramk);
            }
          }
          this.mCJ.b(this.mCO);
          this.mCO = null;
          this.mDt = true;
          this.mCJ.mDt = true;
        }
        this.mCJ.a(localh.ePZ, localh.mwX, localh.jAg, localh.mwY);
        this.mCJ.mDH = 0;
        this.mCJ.notifyDataSetChanged();
        if (this.mCJ.jAg) {
          break;
        }
        this.mCG.bZZ();
        this.mCG.cab();
        GMTrace.o(9670789955584L, 72053);
        return;
        label745:
        paramk.setVisibility(0);
        paramk.jPE.setVisibility(0);
        paramk.mzw.setVisibility(0);
        paramk.jPE.setText((CharSequence)localObject1);
        localObject1 = paramk.mzw;
        ((SimpleImageView)localObject1).imagePath = ((String)localObject2);
        ((SimpleImageView)localObject1).url = paramString;
        ((SimpleImageView)localObject1).mAB = 0;
        ((SimpleImageView)localObject1).lhd = 0;
        if ((paramString == null) || (paramString.length() == 0))
        {
          ((SimpleImageView)localObject1).setVisibility(8);
        }
        else if (paramString.startsWith("http"))
        {
          paramk = BitmapFactory.decodeFile(((SimpleImageView)localObject1).imagePath + com.tencent.mm.a.g.n(paramString.getBytes()));
          if (paramk != null)
          {
            paramString = paramk;
            if (((SimpleImageView)localObject1).mAB > 0)
            {
              paramString = paramk;
              if (((SimpleImageView)localObject1).lhd > 0) {
                paramString = com.tencent.mm.sdk.platformtools.d.a(paramk, ((SimpleImageView)localObject1).mAB, ((SimpleImageView)localObject1).lhd, true, false);
              }
            }
            ((SimpleImageView)localObject1).setImageBitmap(paramString);
          }
          else
          {
            com.tencent.mm.sdk.f.e.post(new SimpleImageView.a(paramString, ((SimpleImageView)localObject1).handler), "SimpleImageView_download");
          }
        }
        else if (!com.tencent.mm.a.e.aZ(paramString))
        {
          ((SimpleImageView)localObject1).setVisibility(8);
        }
        else
        {
          if ((((SimpleImageView)localObject1).mAB <= 0) || (((SimpleImageView)localObject1).lhd <= 0)) {}
          for (paramString = com.tencent.mm.sdk.platformtools.d.RD(paramString);; paramString = com.tencent.mm.sdk.platformtools.d.e(paramString, ((SimpleImageView)localObject1).mAB, ((SimpleImageView)localObject1).lhd, true))
          {
            if (paramString != null) {
              break label1022;
            }
            ((SimpleImageView)localObject1).setVisibility(8);
            break;
          }
          label1022:
          ((SimpleImageView)localObject1).setImageBitmap(paramString);
        }
      }
      this.mCG.caa();
    }
    GMTrace.o(9670789955584L, 72053);
  }
  
  public final void a(f paramf)
  {
    GMTrace.i(9669581996032L, 72044);
    this.gPW = "";
    this.mCX = false;
    this.mCI.setVisibility(8);
    this.mCH.setVisibility(8);
    this.mCR.setVisibility(8);
    this.mCR.WP("");
    this.mCS.setVisibility(8);
    this.mCG.setVisibility(0);
    this.mCG.setAdapter(this.mCJ);
    this.mCJ.notifyDataSetChanged();
    findViewById(R.h.bFT).setVisibility(0);
    aLo();
    if (paramf != null)
    {
      this.mzz.getIController().setCenter(paramf.aED, paramf.aEE);
      this.lat = paramf.aED;
      this.lng = paramf.aEE;
      paramf = this.mCF;
      paramf.k(this.lat, this.lng);
      paramf.mDD = false;
      fL(false);
    }
    GMTrace.o(9669581996032L, 72044);
  }
  
  public final com.tencent.mm.plugin.p.d aLq()
  {
    GMTrace.i(9669179342848L, 72041);
    com.tencent.mm.plugin.p.d locald = (com.tencent.mm.plugin.p.d)this.activity.findViewById(R.h.bCr);
    GMTrace.o(9669179342848L, 72041);
    return locald;
  }
  
  public final void aLr()
  {
    GMTrace.i(9669716213760L, 72045);
    PickPoi localPickPoi = this.mCF;
    localPickPoi.myJ.clearAnimation();
    localPickPoi.myJ.startAnimation(localPickPoi.myI);
    this.lat = (this.mzz.getMapCenterX() / 1000000.0D);
    this.lng = (this.mzz.getMapCenterY() / 1000000.0D);
    this.mCF.k(this.lat, this.lng);
    this.mCM.setBackgroundResource(R.g.aXH);
    if (this.mDg) {
      fK(false);
    }
    fL(false);
    this.mDt = false;
    this.mCJ.mDt = false;
    GMTrace.o(9669716213760L, 72045);
  }
  
  public final void aLt()
  {
    GMTrace.i(16050829656064L, 119588);
    int i = this.mCJ.mDH;
    Intent localIntent = new Intent();
    LocationIntent localLocationIntent = new LocationIntent();
    if (i < 0)
    {
      GMTrace.o(16050829656064L, 119588);
      return;
    }
    if (i >= this.mCJ.getCount())
    {
      GMTrace.o(16050829656064L, 119588);
      return;
    }
    f localf = this.mCJ.pO(i);
    localLocationIntent.lat = localf.aED;
    localLocationIntent.lng = localf.aEE;
    localLocationIntent.gER = localf.mDX;
    localLocationIntent.mzo = localf.mName;
    localLocationIntent.label = localf.mDN;
    localLocationIntent.mwL = localf.mDO;
    localLocationIntent.tmv = localf.type;
    localLocationIntent.eMn = this.mzz.getZoomLevel();
    switch (this.type)
    {
    }
    for (;;)
    {
      localIntent.putExtra("KLocationIntent", localLocationIntent);
      this.activity.setResult(-1, localIntent);
      this.activity.finish();
      GMTrace.o(16050829656064L, 119588);
      return;
      i = mDp;
      int j = this.mCJ.mDH;
      if (this.mDt) {
        i = mDr;
      }
      i(i, j, false);
    }
  }
  
  public final void aLu()
  {
    GMTrace.i(16050963873792L, 119589);
    w.i("MicroMsg.MMPoiMapUI", "loadingmore");
    if (this.mCN != null)
    {
      w.i("MicroMsg.MMPoiMapUI", "scene is doing");
      GMTrace.o(16050963873792L, 119589);
      return;
    }
    byte[] arrayOfByte;
    int i;
    label96:
    double d1;
    double d2;
    if (this.mCX)
    {
      if (this.mCK.buffer == null)
      {
        w.i("MicroMsg.MMPoiMapUI", "buffer is null");
        GMTrace.o(16050963873792L, 119589);
        return;
      }
      arrayOfByte = this.mCK.buffer;
      if (this.mCY != 0) {
        break label225;
      }
      i = 0;
      d1 = this.lat;
      d2 = this.lng;
      if (!this.mCX) {
        break label231;
      }
    }
    label225:
    label231:
    for (int j = 0;; j = 1)
    {
      this.mCN = new h(arrayOfByte, d1, d2, i, j, this.mDj, this.mDi, this.mwY, this.gPW);
      at.wS().a(this.mCN, 0);
      this.mDk += 1;
      GMTrace.o(16050963873792L, 119589);
      return;
      if (this.mCJ.buffer == null)
      {
        w.i("MicroMsg.MMPoiMapUI", "buffer is null");
        GMTrace.o(16050963873792L, 119589);
        return;
      }
      arrayOfByte = this.mCJ.buffer;
      break;
      i = 1;
      break label96;
    }
  }
  
  public final int aLv()
  {
    GMTrace.i(9671058391040L, 72055);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.mCZ.getLayoutParams();
    this.mDd = localMarginLayoutParams.topMargin;
    int i = localMarginLayoutParams.topMargin;
    GMTrace.o(9671058391040L, 72055);
    return i;
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(9669447778304L, 72043);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.MMPoiMapUI", "dispatchKeyEvent");
      if (this.mCX)
      {
        a(null);
        i(mDs, this.mCK.mDH, true);
        GMTrace.o(9669447778304L, 72043);
        return false;
      }
      i(mDq, this.mCJ.mDH, false);
      this.activity.finish();
      GMTrace.o(9669447778304L, 72043);
      return true;
    }
    GMTrace.o(9669447778304L, 72043);
    return false;
  }
  
  public final void fK(final boolean paramBoolean)
  {
    GMTrace.i(16050695438336L, 119587);
    this.mDe = false;
    a locala2;
    if (paramBoolean) {
      locala2 = new a(-(aLv() - this.mDc));
    }
    for (a locala1 = new a(-(aLv() - this.mDc) / 2);; locala1 = new a((this.mDa - aLv()) / 2))
    {
      Animation.AnimationListener local15 = new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(9683003768832L, 72144);
          c.this.mDe = true;
          if (paramBoolean) {
            c.this.pN(c.this.mDc);
          }
          for (c.this.mDg = true;; c.this.mDg = false)
          {
            c.this.mCZ.clearAnimation();
            c.this.mCM.clearAnimation();
            c.this.mDh.clearAnimation();
            c.this.mCG.clearFocus();
            GMTrace.o(9683003768832L, 72144);
            return;
            c.this.pN(c.this.mDa);
          }
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(9683137986560L, 72145);
          GMTrace.o(9683137986560L, 72145);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(9682869551104L, 72143);
          w.d("MicroMsg.MMPoiMapUI", "newpoi start animation %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
          c.this.mDe = false;
          c.this.mDf = true;
          GMTrace.o(9682869551104L, 72143);
        }
      };
      locala2.setDuration(200L);
      locala2 = locala2.aLz();
      locala2.setAnimationListener(local15);
      locala2.cl(this.mCZ).cl(this.mCM).adF();
      locala1.setDuration(200L);
      locala1.aLz().cl(this.mDh).adF();
      GMTrace.o(16050695438336L, 119587);
      return;
      locala2 = new a(this.mDa - aLv());
    }
  }
  
  public final void fL(boolean paramBoolean)
  {
    GMTrace.i(18046513053696L, 134457);
    if (this.mCU != null) {
      this.mCU.remove();
    }
    double d1 = this.lat;
    Object localObject = this.gPW;
    this.mwY = ((int)(d1 * 1000000.0D) + "_" + (int)(this.lng * 1000000.0D) + "_" + (String)localObject);
    if (this.mwY.equals(this.mCJ.amf))
    {
      w.i("MicroMsg.MMPoiMapUI", "same key passed it ", new Object[] { this.mwY });
      GMTrace.o(18046513053696L, 134457);
      return;
    }
    localObject = null;
    int j = 1;
    int i;
    label238:
    double d2;
    if (this.mCX) {
      if ((this.mwZ > 0) && (paramBoolean))
      {
        this.mCH.caa();
        localObject = this.mCK;
        ((e)localObject).buffer = null;
        ((e)localObject).jAg = false;
        ((e)localObject).amf = "";
        this.mCK.Bw(this.mwY);
        this.mCK.lgm = this.gPW;
        localObject = this.mCK.buffer;
        i = j;
        if (i == 0) {
          break label529;
        }
        if (this.mCY != 0) {
          break label517;
        }
        i = 0;
        d1 = this.lat;
        d2 = this.lng;
        if (!this.mCX) {
          break label523;
        }
      }
    }
    label517:
    label523:
    for (j = 0;; j = 1)
    {
      this.mCN = new h((byte[])localObject, d1, d2, i, j, this.mDj, this.mDi, this.mwY, this.gPW);
      at.wS().a(this.mCN, 0);
      this.mDk += 1;
      if (this.mDn == -1L) {
        this.mDn = System.currentTimeMillis();
      }
      GMTrace.o(18046513053696L, 134457);
      return;
      if (!paramBoolean)
      {
        this.mCH.caa();
        this.mCK.clean();
        this.mCK.Bw(this.mwY);
        this.mCK.lgm = this.gPW;
        localObject = this.mCK.buffer;
        this.mCK.notifyDataSetChanged();
        i = j;
        break;
      }
      i = 0;
      break;
      this.mCG.caa();
      this.mCJ.clean();
      this.mCJ.Bw(this.mwY);
      this.mCJ.notifyDataSetChanged();
      byte[] arrayOfByte = this.mCJ.buffer;
      this.mCL.setVisibility(0);
      fM(false);
      i = j;
      localObject = arrayOfByte;
      if (!this.mCF.mDD) {
        break;
      }
      localObject = this.mCF.mDC;
      this.mCJ.b((f)localObject);
      i = j;
      localObject = arrayOfByte;
      break;
      i = 1;
      break label238;
    }
    label529:
    w.i("MicroMsg.MMPoiMapUI", "pass this query because query interval: %d", new Object[] { Integer.valueOf(this.mwZ) });
    GMTrace.o(18046513053696L, 134457);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(9670253084672L, 72049);
    int i = R.i.cDq;
    GMTrace.o(9670253084672L, 72049);
    return i;
  }
  
  public final void i(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(14284927008768L, 106431);
    String str3;
    String str1;
    String str2;
    if ((this.mCV == -85.0D) || (this.mCW == -1000.0D))
    {
      str3 = "null/null";
      if (paramBoolean) {
        break label574;
      }
      if (this.mCJ.mDH >= this.mCJ.getCount()) {
        break label639;
      }
      str1 = this.mCJ.pO(this.mCJ.mDH).mDY;
      str2 = this.mCJ.pO(this.mCJ.mDH).mDO;
    }
    for (;;)
    {
      label95:
      String str4 = str1;
      if (paramInt2 == 0)
      {
        str4 = str1;
        if (bg.nm(str1))
        {
          str4 = str1;
          if (this.mCJ.getCount() > 1)
          {
            w.d("MicroMsg.MMPoiMapUI", "set searchid in first poi");
            str4 = this.mCJ.pO(1).mDY;
          }
        }
      }
      if ((this.mCJ.getCount() > 0) && (!paramBoolean)) {
        w.d("MicroMsg.MMPoiMapUI", "set request id at index: %s", new Object[] { Integer.valueOf(paramInt2) });
      }
      for (str1 = this.mCJ.pO(0).mDZ;; str1 = "")
      {
        int i = paramInt2;
        if (paramInt2 == 0)
        {
          i = paramInt2;
          if (!paramBoolean)
          {
            i = paramInt2;
            if (this.mCJ.getCount() > 0)
            {
              int j = this.mCJ.pO(0).mEa;
              i = paramInt2;
              if (j >= 0)
              {
                w.d("MicroMsg.MMPoiMapUI", "change to search index: %s", new Object[] { Integer.valueOf(j) });
                i = j;
              }
            }
          }
        }
        w.d("MicroMsg.MMPoiMapUI", "tofutest type:%d, index: %d, startTime: %s, lastTime: %s, firsSuccTime: %s, poiCount: %s, latlng: %s, entryTime: %s, searchId: %s, requestId: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i + 1), Long.valueOf(this.mDn), Long.valueOf(this.mDm), Long.valueOf(this.mDl), Integer.valueOf(this.mDk), str3, Integer.valueOf(this.mDo), str4, str1 });
        com.tencent.mm.plugin.report.service.g.ork.i(11135, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i + 1), Long.valueOf(this.mDn), Long.valueOf(this.mDm), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.mDl), Integer.valueOf(this.mDk), str3, str2, Integer.valueOf(this.mDo), str4, p.sZ(), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), str1 });
        GMTrace.o(14284927008768L, 106431);
        return;
        str3 = String.format("%f/%f", new Object[] { Double.valueOf(this.mCV), Double.valueOf(this.mCW) });
        break;
        label574:
        if (this.mCK.mDH >= this.mCK.getCount()) {
          break label639;
        }
        str1 = this.mCK.pO(this.mCK.mDH).mDY;
        str2 = this.mCK.pO(this.mCK.mDH).mDO;
        break label95;
      }
      label639:
      str2 = "";
      str1 = "";
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9669045125120L, 72040);
    super.onCreate(paramBundle);
    at.wS().a(457, this);
    this.mDo = ((int)(System.currentTimeMillis() / 1000L));
    this.titleView = ((TextView)findViewById(R.h.bNe));
    this.titleView.setText(getString(R.l.dGN));
    this.mCZ = ((RelativeLayout)findViewById(R.h.bLb));
    this.mCG = ((MMLoadMoreListView)this.activity.findViewById(R.h.bTA));
    this.mCH = ((MMLoadMoreListView)this.activity.findViewById(R.h.caz));
    this.mCI = this.activity.findViewById(R.h.caF);
    this.mCS = ((TextView)findViewById(R.h.cas));
    this.mCM = ((ImageButton)findViewById(R.h.bKT));
    this.mCM.setContentDescription(getString(R.l.dGB));
    this.mCE = ((PoiHeaderView)findViewById(R.h.bTz));
    this.mzz.setBuiltInZoomControls(false);
    this.mCt = ((FrameLayout)findViewById(R.h.brZ));
    this.mCT = new com.tencent.mm.plugin.location.ui.e(this.activity, R.g.aYW, this.mzz);
    this.mCU = new com.tencent.mm.plugin.location.ui.g(this.activity, this.mzz);
    this.mCF = new PickPoi(this.activity);
    paramBundle = this.mCF;
    int i = R.g.aXF;
    ((ImageView)paramBundle.myJ).setImageResource(i);
    this.mCt.addView(this.mCF);
    this.mCL = findViewById(R.h.bKt);
    this.mCv = this.activity.findViewById(R.h.chJ);
    this.mCP = ((LinearLayout)this.activity.findViewById(R.h.chL));
    this.mCP.setVisibility(0);
    int j;
    switch (this.type)
    {
    default: 
      this.mCQ = ((ImageButton)findViewById(R.h.chR));
      this.mCQ.setContentDescription(getString(R.l.dWE));
      this.mCR = ((ActionBarSearchView)findViewById(R.h.caQ));
      fM(false);
      this.mCJ = new e(this.activity);
      this.mCK = new e(this.activity);
      this.mCK.mDI = true;
      this.mCF.mDE = this.mCJ;
      this.mCG.setAdapter(this.mCJ);
      this.mCG.setOnTouchListener(new View.OnTouchListener()
      {
        private float mDu;
        private short mDv;
        
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(9707028742144L, 72323);
          if (!c.this.mDe)
          {
            GMTrace.o(9707028742144L, 72323);
            return true;
          }
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(9707028742144L, 72323);
            return false;
            w.d("MicroMsg.MMPoiMapUI", "newpoi action down %s", new Object[] { Float.valueOf(paramAnonymousMotionEvent.getRawY()) });
            this.mDu = paramAnonymousMotionEvent.getRawY();
            c.this.mDf = false;
            continue;
            w.d("MicroMsg.MMPoiMapUI", "newpoi action move %s", new Object[] { Float.valueOf(paramAnonymousMotionEvent.getRawY()) });
            if (c.this.mDf)
            {
              w.d("MicroMsg.MMPoiMapUI", "newpoi blocked");
              c.this.mCG.setSelection(0);
            }
            float f = this.mDu - paramAnonymousMotionEvent.getRawY();
            if (Math.abs(f) < BackwardSupportUtil.b.a(c.this.activity, 20.0F)) {
              this.mDv = 0;
            }
            while (((c.this.aLv() <= c.this.mDc) && (this.mDv == 1)) || ((!c.this.mCG.wdy) && (this.mDv == -1) && (c.this.aLv() < c.this.mDa)) || ((this.mDv == -1) && (c.this.aLv() >= c.this.mDa)))
            {
              GMTrace.o(9707028742144L, 72323);
              return false;
              if (f > 0.0F) {
                this.mDv = 1;
              } else {
                this.mDv = -1;
              }
            }
            if ((c.this.mDe) && (this.mDv != 0))
            {
              w.d("MicroMsg.MMPoiMapUI", "newpoi start play isUP %s", new Object[] { Short.valueOf(this.mDv) });
              if (this.mDv == 1)
              {
                c.this.fK(true);
                GMTrace.o(9707028742144L, 72323);
                return false;
              }
              c.this.fK(false);
              GMTrace.o(9707028742144L, 72323);
              return false;
            }
            GMTrace.o(9707028742144L, 72323);
            return true;
            w.d("MicroMsg.MMPoiMapUI", "newpoi action up ");
            c.this.mDf = false;
          }
        }
      });
      at.AR();
      paramBundle = (String)com.tencent.mm.y.c.xh().get(w.a.vtd, "");
      if ((!bg.nm(paramBundle)) && ((this.mCV == -85.0D) || (this.mCW == -1000.0D)))
      {
        String[] arrayOfString = paramBundle.split(",");
        w.i("MicroMsg.MMPoiMapUI", "lastlocationinfo " + paramBundle);
        if (arrayOfString.length == 2)
        {
          float f1 = (float)(bg.Sy(arrayOfString[0]) * 1.0D / 1000000.0D);
          float f2 = (float)(bg.Sy(arrayOfString[1]) * 1.0D / 1000000.0D);
          this.mzz.getIController().setCenter(f1, f2);
        }
      }
      this.mCG.wdv = new MMLoadMoreListView.a()
      {
        public final void anO()
        {
          GMTrace.i(9697230848000L, 72250);
          c.this.aLu();
          GMTrace.o(9697230848000L, 72250);
        }
      };
      this.mCM.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9686896082944L, 72173);
          w.d("MicroMsg.MMPoiMapUI", "click lat: %s, lng: %s", new Object[] { Double.valueOf(c.this.mCV), Double.valueOf(c.this.mCW) });
          if ((c.this.mCV == -85.0D) || (c.this.mCW == -1000.0D))
          {
            w.i("MicroMsg.MMPoiMapUI", "invalid lat lng");
            GMTrace.o(9686896082944L, 72173);
            return;
          }
          c.this.mzz.getIController().animateTo(c.this.mCV, c.this.mCW);
          c.this.lat = c.this.mCV;
          c.this.lng = c.this.mCW;
          c.this.mCF.k(c.this.lat, c.this.lng);
          c.this.mCM.setBackgroundResource(R.g.aXI);
          c.this.mCM.setEnabled(true);
          c.this.fL(false);
          c.this.mDt = false;
          c.this.mCJ.mDt = false;
          GMTrace.o(9686896082944L, 72173);
        }
      });
      this.mCv.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9705418129408L, 72311);
          c.this.i(c.mDq, c.this.mCJ.mDH, false);
          c.this.aLo();
          c.this.activity.finish();
          GMTrace.o(9705418129408L, 72311);
        }
      });
      this.mCP.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9701794250752L, 72284);
          c.this.aLt();
          GMTrace.o(9701794250752L, 72284);
        }
      });
      this.mCG.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(9668776689664L, 72038);
          w.d("MicroMsg.MMPoiMapUI", "newpoi listview itemClick position %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          double d1;
          double d2;
          if (!c.this.mCX)
          {
            if (paramAnonymousInt >= c.this.mCJ.getCount())
            {
              w.i("MicroMsg.MMPoiMapUI", "wrong position");
              GMTrace.o(9668776689664L, 72038);
              return;
            }
            paramAnonymousAdapterView = c.this.mCJ.pO(paramAnonymousInt);
            if (paramAnonymousAdapterView.type != 0) {
              break label224;
            }
            paramAnonymousView = c.this.mCU;
            d1 = paramAnonymousAdapterView.aED;
            d2 = paramAnonymousAdapterView.aEE;
            if (paramAnonymousView.mzg) {
              break label207;
            }
            paramAnonymousView.mzg = true;
            paramAnonymousView.mzz.addView(paramAnonymousView, d1, d2);
            c.this.mCM.setBackgroundResource(R.g.aXH);
          }
          for (;;)
          {
            c.this.mzz.getIController().animateTo(paramAnonymousAdapterView.aED, paramAnonymousAdapterView.aEE);
            c.this.mCJ.mDH = paramAnonymousInt;
            c.this.mCJ.notifyDataSetChanged();
            c.this.mDt = false;
            GMTrace.o(9668776689664L, 72038);
            return;
            label207:
            paramAnonymousView.mzz.updateViewLayout(paramAnonymousView, d1, d2);
            break;
            label224:
            c.this.mCU.remove();
            c.this.mCM.setEnabled(true);
          }
        }
      });
      this.mCQ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9677232406528L, 72101);
          if (!c.this.mCX)
          {
            paramAnonymousView = c.this;
            paramAnonymousView.mCX = true;
            paramAnonymousView.mCH.caa();
            paramAnonymousView.mCH.wdv = new c.4(paramAnonymousView);
            paramAnonymousView.mCH.setOnItemClickListener(new c.5(paramAnonymousView));
            paramAnonymousView.mCH.setOnTouchListener(new c.6(paramAnonymousView));
            paramAnonymousView.mCG.setVisibility(8);
            paramAnonymousView.mCH.setVisibility(0);
            paramAnonymousView.mCH.setAdapter(paramAnonymousView.mCK);
            paramAnonymousView.mCH.caa();
            paramAnonymousView.findViewById(R.h.bFT).setVisibility(8);
            paramAnonymousView.mCR.setVisibility(0);
            paramAnonymousView.mCR.xfg = new c.7(paramAnonymousView);
            new ae().post(new c.8(paramAnonymousView));
          }
          c.this.mCK.clean();
          c.this.mCH.setAdapter(c.this.mCK);
          c.this.mCK.notifyDataSetChanged();
          c.this.mCI.setVisibility(8);
          GMTrace.o(9677232406528L, 72101);
        }
      });
      this.mCR.setHint(getString(R.l.dGJ));
      this.mCR.mx(false);
      this.mCR.xfe = new ActionBarSearchView.a()
      {
        public final void aLy()
        {
          GMTrace.i(18048123666432L, 134469);
          w.d("MicroMsg.MMPoiMapUI", "back pressed");
          c.this.i(c.mDs, c.this.mCK.mDH, true);
          c.this.a(null);
          GMTrace.o(18048123666432L, 134469);
        }
      };
      this.mCR.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(18047989448704L, 134468);
          w.d("MicroMsg.MMPoiMapUI", "keyboard action");
          if (3 == paramAnonymousInt) {
            c.this.fL(false);
          }
          GMTrace.o(18047989448704L, 134468);
          return false;
        }
      });
      this.mCR.xfd = new ActionBarSearchView.b()
      {
        public final void Bv(String paramAnonymousString)
        {
          GMTrace.i(18047452577792L, 134464);
          w.d("MicroMsg.MMPoiMapUI", "searchText: %s", new Object[] { paramAnonymousString });
          c.this.gPW = paramAnonymousString;
          c.this.mCH.caa();
          c.this.mCS.setVisibility(8);
          if (bg.nm(paramAnonymousString))
          {
            c.this.mCK.clean();
            c.this.mCK.notifyDataSetChanged();
            GMTrace.o(18047452577792L, 134464);
            return;
          }
          c.this.fL(true);
          GMTrace.o(18047452577792L, 134464);
        }
        
        public final void QA()
        {
          GMTrace.i(18047586795520L, 134465);
          w.d("MicroMsg.MMPoiMapUI", "clear btn click");
          c.this.mCK.clean();
          c.this.mCK.notifyDataSetChanged();
          GMTrace.o(18047586795520L, 134465);
        }
        
        public final void aLw()
        {
          GMTrace.i(18047318360064L, 134463);
          GMTrace.o(18047318360064L, 134463);
        }
        
        public final void aLx()
        {
          GMTrace.i(18047721013248L, 134466);
          GMTrace.o(18047721013248L, 134466);
        }
      };
      this.mDh = ((FrameLayout)findViewById(R.h.bMa));
      this.mDa = BackwardSupportUtil.b.a(this.activity, 280.0F);
      this.mDc = BackwardSupportUtil.b.a(this.activity, 150.0F);
      j = a.eg(this.activity);
      i = ab.getResources().getIdentifier("status_bar_height", "dimen", "android");
      if (i <= 0) {
        break;
      }
    }
    for (i = ab.getResources().getDimensionPixelSize(i);; i = 0)
    {
      int k = a.V(this.activity, R.f.aPN);
      j = j - this.mDc - i - k;
      if (j > a.V(this.activity, R.f.aSL))
      {
        w.i("MicroMsg.MMPoiMapUI", "reset listview height: %s, statusBar: %s, actionBar: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k) });
        paramBundle = this.mCZ.getLayoutParams();
        paramBundle.height = j;
        this.mCZ.setLayoutParams(paramBundle);
      }
      GMTrace.o(9669045125120L, 72040);
      return;
      ((TextView)findViewById(R.h.bcH)).setText(R.l.dGM);
      break;
      ((TextView)findViewById(R.h.bcH)).setText(R.l.cTI);
      break;
      ((TextView)findViewById(R.h.bcH)).setText(R.l.cTh);
      break;
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(9670655737856L, 72052);
    super.onDestroy();
    at.wS().b(457, this);
    GMTrace.o(9670655737856L, 72052);
  }
  
  public final void onPause()
  {
    GMTrace.i(9670387302400L, 72050);
    super.onPause();
    com.tencent.mm.modelgeo.c.Ir().c(this.fJt);
    com.tencent.mm.plugin.location.ui.e locale = this.mCT;
    locale.mze.c(locale.fJt);
    GMTrace.o(9670387302400L, 72050);
  }
  
  public final void onResume()
  {
    GMTrace.i(9670118866944L, 72048);
    super.onResume();
    com.tencent.mm.modelgeo.c.Ir().b(this.fJt, true);
    com.tencent.mm.plugin.location.ui.e locale = this.mCT;
    locale.mze.b(locale.fJt, true);
    GMTrace.o(9670118866944L, 72048);
  }
  
  public final void pN(int paramInt)
  {
    GMTrace.i(9670924173312L, 72054);
    ((FrameLayout.LayoutParams)this.mCZ.getLayoutParams()).topMargin = paramInt;
    int i = BackwardSupportUtil.b.a(this.activity, 65.0F);
    ((FrameLayout.LayoutParams)this.mCM.getLayoutParams()).topMargin = (paramInt - i);
    i = (paramInt - this.mDd) / 2;
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.mDh.getLayoutParams();
    if (paramInt == this.mDc) {
      localLayoutParams.topMargin = BackwardSupportUtil.b.a(this.activity, -65.0F);
    }
    for (;;)
    {
      this.mDh.requestLayout();
      this.mDd = paramInt;
      this.mCZ.requestLayout();
      this.mCM.requestLayout();
      GMTrace.o(9670924173312L, 72054);
      return;
      if (paramInt == this.mDa) {
        localLayoutParams.topMargin = 0;
      } else {
        localLayoutParams.topMargin = (i + localLayoutParams.topMargin);
      }
    }
  }
  
  final class a
    extends TranslateAnimation
  {
    private List<View> mDy;
    
    public a(float paramFloat)
    {
      super(0.0F, 0.0F, paramFloat);
      GMTrace.i(9690251526144L, 72198);
      this.mDy = new ArrayList();
      GMTrace.o(9690251526144L, 72198);
    }
    
    public final a aLz()
    {
      GMTrace.i(9690385743872L, 72199);
      setFillEnabled(true);
      setFillAfter(true);
      GMTrace.o(9690385743872L, 72199);
      return this;
    }
    
    public final void adF()
    {
      GMTrace.i(9690654179328L, 72201);
      int i = 0;
      while (i < this.mDy.size())
      {
        ((View)this.mDy.get(i)).startAnimation(this);
        i += 1;
      }
      GMTrace.o(9690654179328L, 72201);
    }
    
    public final a cl(View paramView)
    {
      GMTrace.i(9690519961600L, 72200);
      this.mDy.add(paramView);
      GMTrace.o(9690519961600L, 72200);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */