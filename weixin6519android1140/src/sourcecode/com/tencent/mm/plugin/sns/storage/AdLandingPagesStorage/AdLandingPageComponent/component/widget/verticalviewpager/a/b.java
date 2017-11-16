package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.k;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.ui.am;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;

public final class b
  extends Fragment
{
  private static int pKp;
  public int bgColor;
  private boolean gOF;
  private boolean hqt;
  public int jsh;
  public int jsi;
  private LinearLayoutManager pGp;
  private int pHH;
  public int pHI;
  public final Map<String, Bitmap> pHx;
  private boolean pKA;
  public int pKB;
  public String pKC;
  public c pKl;
  public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b pKq;
  z pKr;
  public boolean pKs;
  private boolean pKt;
  public boolean pKu;
  public int pKv;
  public int pKw;
  private a pKx;
  public b pKy;
  private a pKz;
  
  public b()
  {
    GMTrace.i(17104573038592L, 127439);
    this.pHx = new WeakHashMap();
    this.pHH = 1000;
    this.pHI = 700;
    GMTrace.o(17104573038592L, 127439);
  }
  
  public static Fragment a(c paramc, DummyViewPager paramDummyViewPager, z paramz, boolean paramBoolean1, a parama, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(20836496965632L, 155244);
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("pageInfo", paramc);
    localBundle.putSerializable("viewpager", paramDummyViewPager);
    localBundle.putSerializable("lifecycle", parama);
    localBundle.putSerializable("pageDownIconInfo", paramz);
    localBundle.putBoolean("isLastPage", paramBoolean1);
    localBundle.putBoolean("needEnterAnimation", paramBoolean2);
    localBundle.putBoolean("needDirectionAnimation", paramBoolean3);
    paramc = new b();
    paramc.setArguments(localBundle);
    GMTrace.o(20836496965632L, 155244);
    return paramc;
  }
  
  public final void a(final b paramb)
  {
    GMTrace.i(17106720522240L, 127455);
    if (!paramb.pKL)
    {
      GMTrace.o(17106720522240L, 127455);
      return;
    }
    if (paramb.pKK.getVisibility() != 0)
    {
      w.d("ContentFragment", "nextBtn not visible");
      GMTrace.o(17106720522240L, 127455);
      return;
    }
    AnimationSet localAnimationSet = new AnimationSet(true);
    Object localObject = new TranslateAnimation(0.0F, 0.0F, 0.0F, -10.0F);
    ((TranslateAnimation)localObject).setDuration(this.pHI);
    ((TranslateAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(0.8F, 0.3F);
    ((AlphaAnimation)localObject).setDuration(this.pHI);
    ((AlphaAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
    localAnimationSet.addAnimation((Animation)localObject);
    localAnimationSet.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17103096643584L, 127428);
        if (paramb.pKK.getVisibility() != 0)
        {
          w.d("ContentFragment", "nextBtn not visible");
          GMTrace.o(17103096643584L, 127428);
          return;
        }
        paramAnonymousAnimation = new AnimationSet(true);
        Object localObject = new TranslateAnimation(0.0F, 0.0F, -10.0F, 0.0F);
        ((TranslateAnimation)localObject).setDuration(b.this.pHI);
        ((TranslateAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
        ((TranslateAnimation)localObject).setStartTime(b.this.pHI);
        paramAnonymousAnimation.addAnimation((Animation)localObject);
        localObject = new AlphaAnimation(0.3F, 0.8F);
        ((AlphaAnimation)localObject).setDuration(b.this.pHI);
        ((AlphaAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
        ((AlphaAnimation)localObject).setStartTime(b.this.pHI);
        paramAnonymousAnimation.addAnimation((Animation)localObject);
        paramAnonymousAnimation.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymous2Animation)
          {
            GMTrace.i(17109270659072L, 127474);
            b.this.a(b.7.this.pKG);
            GMTrace.o(17109270659072L, 127474);
          }
          
          public final void onAnimationRepeat(Animation paramAnonymous2Animation)
          {
            GMTrace.i(17109404876800L, 127475);
            GMTrace.o(17109404876800L, 127475);
          }
          
          public final void onAnimationStart(Animation paramAnonymous2Animation)
          {
            GMTrace.i(17109136441344L, 127473);
            GMTrace.o(17109136441344L, 127473);
          }
        });
        paramb.pKK.startAnimation(paramAnonymousAnimation);
        GMTrace.o(17103096643584L, 127428);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17103230861312L, 127429);
        GMTrace.o(17103230861312L, 127429);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17102962425856L, 127427);
        GMTrace.o(17102962425856L, 127427);
      }
    });
    paramb.pKK.startAnimation(localAnimationSet);
    GMTrace.o(17106720522240L, 127455);
  }
  
  public final void ayZ()
  {
    GMTrace.i(17105915215872L, 127449);
    if (this.pKy == null)
    {
      GMTrace.o(17105915215872L, 127449);
      return;
    }
    final Object localObject1;
    final Object localObject2;
    if ((this.pKl.pLg != null) && (this.pKl.pLg.length() > 0))
    {
      localObject1 = this.pKl.pLg;
      localObject2 = this.pKy.pKJ;
      if ((this.pKl.pLh) || (!TextUtils.isEmpty(this.pKl.pLg)))
      {
        if ((this.pKs) && (!this.pKu)) {
          w.i("ContentFragment", "waiting for main page loaded to set blur bg");
        }
      }
      else
      {
        if (!this.pHx.containsKey(localObject1)) {
          break label210;
        }
        ((ImageView)localObject2).setImageBitmap((Bitmap)this.pHx.get(localObject1));
      }
    }
    for (;;)
    {
      if (this.pKz != null)
      {
        this.pKz.bgColor = this.bgColor;
        localObject1 = this.pKz;
        localObject2 = this.pKl;
        if (((a)localObject1).pKl != localObject2)
        {
          ((a)localObject1).pKl = ((c)localObject2);
          ((RecyclerView.a)localObject1).TS.notifyChanged();
        }
      }
      GMTrace.o(17105915215872L, 127449);
      return;
      ((ImageView)localObject2).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17104438820864L, 127438);
          b.this.bll();
          GMTrace.o(17104438820864L, 127438);
        }
      });
      break;
      label210:
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", (String)localObject1, false, 1000000001, 0, new d.a()
      {
        public final void Ih(String paramAnonymousString)
        {
          Object localObject2 = null;
          float f = 1.0F;
          GMTrace.i(17107391610880L, 127460);
          Object localObject1 = localObject2;
          try
          {
            String str;
            if (b.this.pKl.pLh)
            {
              str = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dL("adId", localObject1 + "_blurimg");
              if (FileOp.aZ(str)) {
                break label274;
              }
              Bitmap localBitmap = com.tencent.mm.sdk.platformtools.d.decodeFile(paramAnonymousString, null);
              localObject1 = localObject2;
              if (localBitmap != null)
              {
                if ((localBitmap.getHeight() < b.this.jsi) || (localBitmap.getWidth() < b.this.jsh)) {
                  f = Math.max(b.this.jsh * 1.0F / localBitmap.getWidth(), 1.0F * b.this.jsi / localBitmap.getHeight());
                }
                localObject1 = com.tencent.mm.sdk.platformtools.d.a(localBitmap, f, f);
                localObject1 = com.tencent.mm.plugin.sns.lucky.a.a.a(Bitmap.createBitmap((Bitmap)localObject1, ((Bitmap)localObject1).getWidth() - b.this.jsh >>> 1, ((Bitmap)localObject1).getHeight() - b.this.jsi >>> 1, b.this.jsh, b.this.jsi), str, Color.argb(140, 0, 0, 0), 180);
                if (localObject1 != null) {
                  break label266;
                }
                localObject1 = localObject2;
              }
            }
            while (localObject1 == null)
            {
              b.this.pKC = paramAnonymousString;
              if (b.this.pKB > 0)
              {
                b.this.blm();
                GMTrace.o(17107391610880L, 127460);
                return;
                label266:
                localObject1 = ((n)localObject1).yq();
                continue;
                label274:
                localObject1 = BitmapFactory.decodeFile(str);
              }
              else
              {
                w.i("ContentFragment", "wait for bgHeight");
                GMTrace.o(17107391610880L, 127460);
                return;
              }
            }
          }
          catch (Exception paramAnonymousString)
          {
            w.e("ContentFragment", "the backgroundCoverUrl is set error ,because " + paramAnonymousString.toString());
            GMTrace.o(17107391610880L, 127460);
            return;
          }
          b.this.pHx.put(localObject1, localObject1);
          localObject2.setImageBitmap((Bitmap)localObject1);
          GMTrace.o(17107391610880L, 127460);
        }
        
        public final void bkK()
        {
          GMTrace.i(17107123175424L, 127458);
          GMTrace.o(17107123175424L, 127458);
        }
        
        public final void bkL()
        {
          GMTrace.i(17107257393152L, 127459);
          if ((b.this.pKl.hPK != null) && (b.this.pKl.hPK.length() > 0)) {}
          try
          {
            b.this.bgColor = Color.parseColor(b.this.pKl.hPK);
            b.this.pKy.pKJ.setVisibility(8);
            b.this.pKy.pKI.setBackgroundColor(b.this.bgColor);
            b.this.pKy.pKJ.setBackgroundColor(b.this.bgColor);
            b.this.pKy.iIY.setBackgroundColor(b.this.bgColor);
            b.this.bln();
            GMTrace.o(17107257393152L, 127459);
            return;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.e("ContentFragment", "the color is error : " + b.this.pKl.hPK);
            }
          }
        }
      });
      continue;
      if ((this.pKl.hPK == null) || (this.pKl.hPK.length() <= 0)) {
        continue;
      }
      try
      {
        this.bgColor = Color.parseColor(this.pKl.hPK);
        this.pKy.pKJ.setVisibility(8);
        this.pKy.pKI.setBackgroundColor(this.bgColor);
        this.pKy.pKJ.setBackgroundColor(this.bgColor);
        this.pKy.iIY.setBackgroundColor(this.bgColor);
        bln();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("ContentFragment", "the color is error : " + this.pKl.hPK);
        }
      }
    }
  }
  
  public final void blk()
  {
    GMTrace.i(17105646780416L, 127447);
    if (this.pKq != null) {
      this.pKq.bkD();
    }
    GMTrace.o(17105646780416L, 127447);
  }
  
  public final void bll()
  {
    GMTrace.i(17105780998144L, 127448);
    if (this.pKy == null)
    {
      GMTrace.o(17105780998144L, 127448);
      return;
    }
    if (((this.pKl.pLh) || (!TextUtils.isEmpty(this.pKl.pLg))) && (!this.pKA))
    {
      this.pKA = true;
      this.pKy.pKM.setVisibility(0);
      this.pKy.pKJ.setScaleType(ImageView.ScaleType.CENTER_CROP);
      this.pKy.pKM.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public final boolean onPreDraw()
        {
          GMTrace.i(17103901949952L, 127434);
          if (b.this.pKy.pKM.getHeight() > 0)
          {
            b.this.pKy.pKM.getViewTreeObserver().removeOnPreDrawListener(this);
            b.this.pKB = b.this.pKy.pKM.getHeight();
            if (b.this.pKB < b.this.jsi) {
              b.this.pKB = b.this.jsi;
            }
            Object localObject = (FrameLayout.LayoutParams)b.this.pKy.pKJ.getLayoutParams();
            ((FrameLayout.LayoutParams)localObject).height = b.this.pKB;
            b.this.pKy.pKJ.setLayoutParams((ViewGroup.LayoutParams)localObject);
            w.v("ContentFragment", "set bgIV height " + b.this.pKy.pKM.getHeight() + ", count " + b.this.pKy.pKM.getChildCount());
            int i = 0;
            while (i < b.this.pKy.pKM.getChildCount())
            {
              localObject = b.this.pKy.pKM.getChildAt(i).getTag();
              if ((localObject instanceof i)) {
                ((i)localObject).bkl();
              }
              i += 1;
            }
            b.this.pKy.pKM.removeAllViews();
            b.this.pKy.pKM.setVisibility(8);
            b.this.blm();
          }
          GMTrace.o(17103901949952L, 127434);
          return true;
        }
      });
      a locala = this.pKz;
      LinearLayout localLinearLayout = this.pKy.pKM;
      int i = 0;
      while (i < locala.pKl.pLi.size())
      {
        Object localObject = (s)locala.pKl.pLi.get(i);
        localObject = am.a(localLinearLayout.getContext(), (s)localObject, localLinearLayout, locala.bgColor);
        if (localObject != null)
        {
          if ((((i)localObject).getView().getParent() != null) && ((((i)localObject).getView().getParent() instanceof ViewGroup))) {
            ((ViewGroup)((i)localObject).getView().getParent()).removeView(((i)localObject).getView());
          }
          ((i)localObject).getView().setTag(localObject);
          localLinearLayout.addView(((i)localObject).getView());
        }
        i += 1;
      }
    }
    GMTrace.o(17105780998144L, 127448);
  }
  
  public final void blm()
  {
    GMTrace.i(18579760087040L, 138430);
    if ((this.pKB > 0) && (!TextUtils.isEmpty(this.pKC))) {
      try
      {
        if (this.pKy.iIY.getHeight() > this.pKB)
        {
          this.pKB = this.pKy.iIY.getHeight();
          localObject = (FrameLayout.LayoutParams)this.pKy.pKJ.getLayoutParams();
          ((FrameLayout.LayoutParams)localObject).height = this.pKB;
          this.pKy.pKJ.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
        Bitmap localBitmap = BitmapFactory.decodeFile(this.pKC);
        Object localObject = localBitmap;
        if (localBitmap.getWidth() < this.jsh)
        {
          float f = 1.0F * this.jsh / localBitmap.getWidth();
          localBitmap = com.tencent.mm.sdk.platformtools.d.a(localBitmap, f, f);
          localObject = localBitmap;
          if (localBitmap.getHeight() > this.pKB) {
            localObject = Bitmap.createBitmap(localBitmap, 0, 0, localBitmap.getWidth(), this.pKB);
          }
        }
        this.pHx.put(this.pKl.pLg, localObject);
        this.pKy.pKJ.setImageBitmap((Bitmap)localObject);
        GMTrace.o(18579760087040L, 138430);
        return;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        w.e("ContentFragment", bg.f(localOutOfMemoryError));
      }
    }
    GMTrace.o(18579760087040L, 138430);
  }
  
  public final void bln()
  {
    GMTrace.i(17106049433600L, 127450);
    if (this.bgColor + 16777216 <= -1 - this.bgColor)
    {
      this.pKy.pKK.setImageDrawable(com.tencent.mm.br.a.b(aG(), i.e.oXY));
      GMTrace.o(17106049433600L, 127450);
      return;
    }
    this.pKy.pKK.setImageDrawable(com.tencent.mm.br.a.b(aG(), i.e.oXX));
    GMTrace.o(17106049433600L, 127450);
  }
  
  public final RecyclerView blo()
  {
    GMTrace.i(17106183651328L, 127451);
    if (this.pKy != null)
    {
      RecyclerView localRecyclerView = this.pKy.neA;
      GMTrace.o(17106183651328L, 127451);
      return localRecyclerView;
    }
    GMTrace.o(17106183651328L, 127451);
    return null;
  }
  
  public final Collection<i> blp()
  {
    GMTrace.i(17106317869056L, 127452);
    if (this.pKz == null)
    {
      localObject = Collections.EMPTY_LIST;
      GMTrace.o(17106317869056L, 127452);
      return (Collection<i>)localObject;
    }
    Object localObject = this.pKz;
    if (((a)localObject).pKm == null)
    {
      localObject = Collections.EMPTY_LIST;
      GMTrace.o(17106317869056L, 127452);
      return (Collection<i>)localObject;
    }
    localObject = ((a)localObject).pKm.values();
    GMTrace.o(17106317869056L, 127452);
    return (Collection<i>)localObject;
  }
  
  public final void blq()
  {
    GMTrace.i(17106452086784L, 127453);
    if (this.pKy.pKK.getVisibility() == 0)
    {
      this.pKy.pKK.clearAnimation();
      this.pKy.pKK.setVisibility(4);
    }
    GMTrace.o(17106452086784L, 127453);
  }
  
  public final void blr()
  {
    GMTrace.i(17106586304512L, 127454);
    if (!bls())
    {
      GMTrace.o(17106586304512L, 127454);
      return;
    }
    this.pKy.pKK.clearAnimation();
    this.pKy.pKK.setVisibility(0);
    final AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 0.8F);
    localAlphaAnimation.setDuration(this.pHH);
    localAlphaAnimation.setInterpolator(new DecelerateInterpolator(1.2F));
    localAlphaAnimation.setStartOffset(this.pHH);
    localAlphaAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17102559772672L, 127424);
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17104170385408L, 127436);
            w.d("ContentFragment", "onAnimationEnd show nextBtn");
            b.this.pKy.pKK.setAlpha(1.0F);
            b.this.a(b.this.pKy);
            GMTrace.o(17104170385408L, 127436);
          }
        }, 200L);
        GMTrace.o(17102559772672L, 127424);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17102693990400L, 127425);
        GMTrace.o(17102693990400L, 127425);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(17102425554944L, 127423);
        w.d("ContentFragment", "onAnimationStart show nextBtn");
        b.this.pKy.pKL = true;
        GMTrace.o(17102425554944L, 127423);
      }
    });
    if ((this.pKr != null) && (!this.pKr.equals(this.pKy.pKK.getTag())))
    {
      this.pKy.pKK.setTag(this.pKr);
      this.pKy.pKK.setVisibility(8);
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a(this.pKr.iconUrl, 1000000001, new d.a()
      {
        public final void Ih(String paramAnonymousString)
        {
          GMTrace.i(17110612836352L, 127484);
          w.d("ContentFragment", "onDownloaded show nextBtn");
          b localb = b.this;
          ImageView localImageView = b.this.pKy.pKK;
          paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
          ViewGroup.LayoutParams localLayoutParams = localImageView.getLayoutParams();
          if (Float.compare(localb.pKr.width, 0.0F) > 0)
          {
            localLayoutParams.width = ((int)localb.pKr.width);
            if (Float.compare(localb.pKr.height, 0.0F) <= 0) {
              break label174;
            }
          }
          label174:
          for (localLayoutParams.height = ((int)localb.pKr.height);; localLayoutParams.height = -2)
          {
            if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
              ((ViewGroup.MarginLayoutParams)localLayoutParams).bottomMargin = ((int)localb.pKr.pEC);
            }
            localImageView.setImageBitmap(paramAnonymousString);
            b.this.pKy.pKK.setVisibility(0);
            b.this.pKy.pKK.startAnimation(localAlphaAnimation);
            GMTrace.o(17110612836352L, 127484);
            return;
            localLayoutParams.width = -1;
            break;
          }
        }
        
        public final void bkK()
        {
          GMTrace.i(17110344400896L, 127482);
          GMTrace.o(17110344400896L, 127482);
        }
        
        public final void bkL()
        {
          GMTrace.i(17110478618624L, 127483);
          w.d("ContentFragment", "onDownloadError show nextBtn");
          b.this.pKy.pKK.setVisibility(0);
          b.this.pKy.pKK.startAnimation(localAlphaAnimation);
          GMTrace.o(17110478618624L, 127483);
        }
      });
      GMTrace.o(17106586304512L, 127454);
      return;
    }
    this.pKy.pKK.startAnimation(localAlphaAnimation);
    GMTrace.o(17106586304512L, 127454);
  }
  
  public final boolean bls()
  {
    GMTrace.i(17106854739968L, 127456);
    if (!this.pKt)
    {
      GMTrace.o(17106854739968L, 127456);
      return false;
    }
    if (this.pKv != 0)
    {
      GMTrace.o(17106854739968L, 127456);
      return false;
    }
    if (this.pKw != 0)
    {
      GMTrace.o(17106854739968L, 127456);
      return false;
    }
    int j = this.pGp.eZ();
    int i = this.pGp.fa();
    if ((j == i) && (j == -1))
    {
      GMTrace.o(17106854739968L, 127456);
      return false;
      i -= 1;
    }
    for (;;)
    {
      if (i >= j)
      {
        Object localObject = this.pKz;
        s locals = (s)((a)localObject).pKl.pLi.get(i);
        localObject = (i)((a)localObject).pKm.get(locals.pEz);
        if (!(localObject instanceof x)) {
          break;
        }
        int k = ((x)localObject).blc();
        if ((k < 0) || (k >= pKp)) {
          break;
        }
      }
      for (boolean bool1 = false;; bool1 = true)
      {
        boolean bool2 = bool1;
        if (bool1)
        {
          bool2 = bool1;
          if (this.hqt) {
            if (this.pGp.fa() == this.pKz.getItemCount() - 1) {
              break label235;
            }
          }
        }
        label235:
        for (bool2 = true;; bool2 = false)
        {
          GMTrace.o(17106854739968L, 127456);
          return bool2;
        }
      }
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(17104841474048L, 127441);
    super.onCreate(paramBundle);
    pKp = com.tencent.mm.br.a.fromDPToPix(getContext(), 60);
    paramBundle = ab.df(getContext());
    this.jsh = paramBundle[0];
    this.jsi = paramBundle[1];
    if (this.pKl == null) {
      this.pKl = ((c)this.ol.getSerializable("pageInfo"));
    }
    this.pKx = ((a)this.ol.getSerializable("lifecycle"));
    this.pKr = ((z)this.ol.getSerializable("pageDownIconInfo"));
    this.hqt = this.ol.getBoolean("isLastPage");
    this.pKs = this.ol.getBoolean("needEnterAnimation");
    this.pKt = this.ol.getBoolean("needDirectionAnimation");
    GMTrace.o(17104841474048L, 127441);
  }
  
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    GMTrace.i(17104975691776L, 127442);
    paramLayoutInflater = paramLayoutInflater.inflate(i.g.peJ, paramViewGroup, false);
    this.pKy = new b();
    this.pKy.pKI = paramLayoutInflater;
    this.pKy.pKJ = ((ImageView)paramLayoutInflater.findViewById(i.f.pcf));
    this.pKy.iIY = ((LinearLayout)paramLayoutInflater.findViewById(i.f.pcy));
    this.pKy.pKK = ((ImageView)paramLayoutInflater.findViewById(i.f.pdy));
    this.pKy.neA = ((RecyclerView)paramLayoutInflater.findViewById(i.f.pam));
    this.pKy.pKM = ((LinearLayout)paramLayoutInflater.findViewById(i.f.paF));
    paramViewGroup = this.pKy.neA;
    paramViewGroup.setOverScrollMode(2);
    paramViewGroup.setOnTouchListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a((DummyViewPager)this.ol.getSerializable("viewpager")));
    this.pGp = new LinearLayoutManager();
    paramViewGroup.a(this.pGp);
    this.pKz = new a(this.pKl, this.bgColor, aG(), this.pGp);
    paramViewGroup.a(this.pKz);
    this.pKq = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b(paramViewGroup, this);
    paramViewGroup.a(new RecyclerView.k()
    {
      public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(17103499296768L, 127431);
        super.c(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
        if ((b.this.pKy.pKJ != null) && (b.this.pKy.pKJ.getVisibility() == 0)) {
          b.this.pKy.pKJ.scrollBy(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(17103499296768L, 127431);
      }
      
      public final void e(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
      {
        GMTrace.i(17103633514496L, 127432);
        super.e(paramAnonymousRecyclerView, paramAnonymousInt);
        b.this.pKv = paramAnonymousInt;
        if (paramAnonymousInt == 0)
        {
          if (b.this.bls())
          {
            b.this.blr();
            GMTrace.o(17103633514496L, 127432);
          }
        }
        else if (paramAnonymousInt == 1)
        {
          b.this.blq();
          ab.dg(b.this.getContext());
        }
        GMTrace.o(17103633514496L, 127432);
      }
    });
    paramLayoutInflater.setTag(this.pKy);
    ayZ();
    if (this.pKx != null) {
      this.pKx.a(this);
    }
    GMTrace.o(17104975691776L, 127442);
    return paramLayoutInflater;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(17105378344960L, 127445);
    super.onDestroy();
    if (this.pKq != null) {
      this.pKq.pJU.onDestroy();
    }
    GMTrace.o(17105378344960L, 127445);
  }
  
  public final void onPause()
  {
    GMTrace.i(17105244127232L, 127444);
    super.onPause();
    new StringBuilder().append(this).append(" onPause ").append(getUserVisibleHint());
    this.gOF = false;
    if ((this.pKq != null) && (getUserVisibleHint())) {
      this.pKq.blg();
    }
    GMTrace.o(17105244127232L, 127444);
  }
  
  public final void onResume()
  {
    GMTrace.i(17105109909504L, 127443);
    super.onResume();
    w.i("ContentFragment", this + " onResume " + getUserVisibleHint());
    this.gOF = true;
    if ((this.pKq != null) && (getUserVisibleHint())) {
      this.pKq.bkE();
    }
    GMTrace.o(17105109909504L, 127443);
  }
  
  public final void setUserVisibleHint(boolean paramBoolean)
  {
    GMTrace.i(17105512562688L, 127446);
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean)
    {
      if (this.pKq != null)
      {
        this.pKq.bkE();
        GMTrace.o(17105512562688L, 127446);
      }
    }
    else if (this.pKq != null) {
      this.pKq.blg();
    }
    GMTrace.o(17105512562688L, 127446);
  }
  
  public static abstract interface a
    extends Serializable
  {
    public abstract void a(b paramb);
  }
  
  private static final class b
  {
    public LinearLayout iIY;
    public RecyclerView neA;
    public View pKI;
    public ImageView pKJ;
    public ImageView pKK;
    public boolean pKL;
    public LinearLayout pKM;
    
    public b()
    {
      GMTrace.i(17110075965440L, 127480);
      this.pKJ = null;
      this.iIY = null;
      this.pKK = null;
      this.pKL = false;
      GMTrace.o(17110075965440L, 127480);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\verticalviewpager\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */