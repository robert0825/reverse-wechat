package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w;
import com.tencent.mm.plugin.sns.ui.am;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.base.MMPageControlView;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class n
  extends i
{
  private static final Map<String, Bitmap> pHx;
  AdLandingControlView pHA;
  private int pHB;
  public int pHC;
  boolean pHD;
  ViewPager pHy;
  a pHz;
  
  static
  {
    GMTrace.i(8226875637760L, 61295);
    pHx = new WeakHashMap();
    GMTrace.o(8226875637760L, 61295);
  }
  
  public n(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n paramn, ViewGroup paramViewGroup)
  {
    super(paramContext, paramn, paramViewGroup);
    GMTrace.i(8225667678208L, 61286);
    this.pHB = 0;
    this.pHC = 0;
    this.pHD = true;
    this.pHA = new AdLandingControlView(paramContext);
    GMTrace.o(8225667678208L, 61286);
  }
  
  public final void I(Map<String, Object> paramMap)
  {
    GMTrace.i(20066221424640L, 149505);
    super.I(paramMap);
    if (paramMap.containsKey("startIndex")) {
      try
      {
        this.pHB = ((Integer)paramMap.get("startIndex")).intValue();
        this.pHy.c(this.pHB, false);
        GMTrace.o(20066221424640L, 149505);
        return;
      }
      catch (Exception paramMap) {}
    }
    GMTrace.o(20066221424640L, 149505);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8226472984576L, 61292);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8226472984576L, 61292);
      return false;
    }
    GMTrace.o(8226472984576L, 61292);
    return true;
  }
  
  protected final int aXW()
  {
    GMTrace.i(8226338766848L, 61291);
    int i = i.g.pfp;
    GMTrace.o(8226338766848L, 61291);
    return i;
  }
  
  public final View bkC()
  {
    GMTrace.i(8226204549120L, 61290);
    View localView = this.hqF;
    this.pHy = ((ViewPager)localView.findViewById(i.f.pcu));
    this.pHA = ((AdLandingControlView)localView.findViewById(i.f.pce));
    GMTrace.o(8226204549120L, 61290);
    return localView;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8226070331392L, 61289);
    Object localObject1 = (WindowManager)this.context.getSystemService("window");
    int j = ((WindowManager)localObject1).getDefaultDisplay().getWidth();
    int k = ((WindowManager)localObject1).getDefaultDisplay().getHeight();
    localObject1 = (LayoutInflater)this.context.getSystemService("layout_inflater");
    final a locala = new a(this.context, (LayoutInflater)localObject1, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)this.pGS, this.backgroundColor);
    this.pHy.yr = new ViewPager.e()
    {
      public final void V(int paramAnonymousInt)
      {
        GMTrace.i(8277744156672L, 61674);
        n.this.pHA.uN(paramAnonymousInt);
        n.this.pHC = paramAnonymousInt;
        if (n.this.pGV)
        {
          locala.uK(paramAnonymousInt);
          locala.uL(paramAnonymousInt);
        }
        GMTrace.o(8277744156672L, 61674);
      }
      
      public final void W(int paramAnonymousInt)
      {
        GMTrace.i(8277878374400L, 61675);
        GMTrace.o(8277878374400L, 61675);
      }
      
      public final void a(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
      {
        GMTrace.i(8277609938944L, 61673);
        GMTrace.o(8277609938944L, 61673);
      }
    };
    this.pHy.a(locala);
    this.pHA.en(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)this.pGS).pEj.size(), 0);
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)this.pGS).pEm) {
      this.pHy.setLayoutParams(new RelativeLayout.LayoutParams(j, k));
    }
    while (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)this.pGS).pEj.size() <= 0)
    {
      this.pHz = locala;
      GMTrace.o(8226070331392L, 61289);
      return;
    }
    Object localObject2 = (m)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)this.pGS).pEj.get(0);
    new LinearLayout(this.context).setOrientation(1);
    int i = 0;
    localObject2 = ((m)localObject2).pEj.iterator();
    label242:
    s locals;
    Object localObject3;
    int m;
    int n;
    if (((Iterator)localObject2).hasNext())
    {
      locals = (s)((Iterator)localObject2).next();
      i = (int)(i + locals.pEB);
      if ((locals instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u))
      {
        localObject3 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u)locals;
        View localView = ((LayoutInflater)localObject1).inflate(i.g.pfn, null);
        localView.setBackgroundColor(this.backgroundColor);
        ((TextView)localView.findViewById(i.f.pcd)).setText(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u)localObject3).pES);
        m = View.MeasureSpec.makeMeasureSpec(0, 0);
        n = View.MeasureSpec.makeMeasureSpec(0, 0);
        ((TextView)localView.findViewById(i.f.pcd)).measure(m, n);
        m = ((TextView)localView.findViewById(i.f.pcd)).getPaddingTop();
        n = ((TextView)localView.findViewById(i.f.pcd)).getHeight();
        i = ((TextView)localView.findViewById(i.f.pcd)).getPaddingBottom() + (i + m + n);
      }
    }
    for (;;)
    {
      float f1 = i;
      i = (int)(locals.pEC + f1);
      break label242;
      if ((locals instanceof l))
      {
        localObject3 = (Button)((LayoutInflater)localObject1).inflate(i.g.pff, null).findViewById(i.f.pci);
        ((Button)localObject3).setText(((l)locals).title);
        ((Button)localObject3).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        m = ((Button)localObject3).getPaddingTop();
        n = ((Button)localObject3).getHeight();
        i = ((Button)localObject3).getPaddingBottom() + (m + i + n);
      }
      else
      {
        if ((locals instanceof p))
        {
          float f2 = 0.0F;
          f1 = 0.0F;
          float f3 = locals.pEB;
          float f4 = locals.pEC;
          if ((locals instanceof p))
          {
            localObject3 = (p)locals;
            f2 = ((p)localObject3).height;
            f1 = ((p)localObject3).width;
          }
          if (((int)f2 != 0) && ((int)f1 != 0))
          {
            float f5 = i;
            i = (int)(f2 * j / f1 + f5);
          }
          for (;;)
          {
            i = (int)((int)(i + f3) + f4);
            break;
            i += k;
          }
        }
        if ((locals instanceof o))
        {
          i += k;
        }
        else if ((locals instanceof q))
        {
          localObject3 = (q)locals;
          if (((q)localObject3).pEv == 1)
          {
            i += k;
          }
          else if ((int)((q)localObject3).width > 0)
          {
            i = (int)((q)localObject3).height * j / (int)((q)localObject3).width + i;
          }
          else
          {
            f1 = i;
            i = (int)(((q)localObject3).height + f1);
          }
        }
        else if ((locals instanceof w))
        {
          localObject3 = (w)locals;
          if (((w)localObject3).pEY == 1)
          {
            if ((int)((w)localObject3).width > 0)
            {
              i = (int)((w)localObject3).height * j / (int)((w)localObject3).width + i;
            }
            else
            {
              f1 = i;
              i = (int)(((w)localObject3).height + f1);
            }
          }
          else {
            i += k;
          }
        }
        else if ((locals instanceof v))
        {
          i += k;
          continue;
          this.pHy.setLayoutParams(new RelativeLayout.LayoutParams(j, i));
          break;
        }
      }
    }
  }
  
  public final void bkO()
  {
    GMTrace.i(20066355642368L, 149506);
    super.bkO();
    this.pHy.c(this.pHB, false);
    GMTrace.o(20066355642368L, 149506);
  }
  
  public final LinkedList<JSONObject> bkV()
  {
    GMTrace.i(8226607202304L, 61293);
    a locala = this.pHz;
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = locala.pHL.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (n.a.a)locala.pHL.get(localObject);
      if ((localObject != null) && (((n.a.a)localObject).pHR.size() != 0))
      {
        int i = 0;
        while (i < ((n.a.a)localObject).pHR.size())
        {
          i locali = (i)((n.a.a)localObject).pHR.get(i);
          JSONObject localJSONObject = new JSONObject();
          if (locali.L(localJSONObject)) {
            localLinkedList.add(localJSONObject);
          }
          i += 1;
        }
      }
    }
    GMTrace.o(8226607202304L, 61293);
    return localLinkedList;
  }
  
  public final void bkm()
  {
    GMTrace.i(8225801895936L, 61287);
    int i = this.pHy.xI;
    this.pHz.uK(i);
    if (this.pHD)
    {
      this.pHz.uL(0);
      this.pHD = false;
    }
    for (;;)
    {
      super.bkm();
      GMTrace.o(8225801895936L, 61287);
      return;
      this.pHz.uL(this.pHC);
    }
  }
  
  public final void bkn()
  {
    GMTrace.i(8225936113664L, 61288);
    this.pHz.uL(-1);
    super.bkn();
    GMTrace.o(8225936113664L, 61288);
  }
  
  static final class a
    extends android.support.v4.view.u
  {
    int backgroundColor;
    Context mContext;
    LayoutInflater mLayoutInflater;
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n pHG;
    private int pHH;
    public int pHI;
    public int pHJ;
    HashMap<String, View> pHK;
    HashMap<String, a> pHL;
    
    public a(Context paramContext, LayoutInflater paramLayoutInflater, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n paramn, int paramInt)
    {
      GMTrace.i(8278549463040L, 61680);
      this.pHH = 600;
      this.pHI = 700;
      this.pHJ = 250;
      this.pHK = new HashMap();
      this.pHL = new HashMap();
      this.mContext = paramContext;
      this.mLayoutInflater = paramLayoutInflater;
      this.pHG = paramn;
      this.backgroundColor = paramInt;
      GMTrace.o(8278549463040L, 61680);
    }
    
    public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      GMTrace.i(8279220551680L, 61685);
      paramViewGroup.removeView((View)paramObject);
      GMTrace.o(8279220551680L, 61685);
    }
    
    public final boolean a(View paramView, Object paramObject)
    {
      GMTrace.i(8278817898496L, 61682);
      if (paramView == (View)paramObject)
      {
        GMTrace.o(8278817898496L, 61682);
        return true;
      }
      GMTrace.o(8278817898496L, 61682);
      return false;
    }
    
    public final Object b(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(8279086333952L, 61684);
      View localView = this.mLayoutInflater.inflate(i.g.pfo, paramViewGroup, false);
      Object localObject1 = (WindowManager)this.mContext.getSystemService("window");
      int i = ((WindowManager)localObject1).getDefaultDisplay().getWidth();
      ((WindowManager)localObject1).getDefaultDisplay().getHeight();
      localObject1 = (LinearLayout)localView.findViewById(i.f.pcp);
      ((LinearLayout)localObject1).setBackgroundColor(this.backgroundColor);
      Object localObject2 = (a)this.pHL.get(String.valueOf(paramInt));
      Object localObject3;
      if ((localObject2 == null) || (((a)localObject2).pHR.size() == 0))
      {
        localObject2 = new a();
        localObject3 = ((m)this.pHG.pEj.get(paramInt)).pEj.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          Object localObject4 = (s)((Iterator)localObject3).next();
          localObject4 = am.a(this.mContext, (s)localObject4, (ViewGroup)localObject1, this.backgroundColor);
          ((a)localObject2).pHR.add(localObject4);
          ((LinearLayout)localObject1).addView(((i)localObject4).getView());
        }
        this.pHL.put(String.valueOf(paramInt), localObject2);
        localObject2 = (ImageView)localView.findViewById(i.f.pcr);
        localObject3 = (TextView)localView.findViewById(i.f.pcq);
        if (this.backgroundColor + 16777216 > -1 - this.backgroundColor) {
          break label458;
        }
        ((ImageView)localObject2).setImageDrawable(a.b(this.mContext, i.e.oXZ));
      }
      for (;;)
      {
        if (this.pHG.pEl != 1) {
          break label476;
        }
        ((ImageView)localObject2).setVisibility(8);
        ((TextView)localObject3).setVisibility(8);
        localView.setLayoutParams(new RelativeLayout.LayoutParams(i, ((LinearLayout)localObject1).getMeasuredHeight()));
        localView.setBackgroundColor(this.backgroundColor);
        paramViewGroup.addView(localView);
        paramViewGroup.setBackgroundColor(this.backgroundColor);
        this.pHK.put(String.valueOf(paramInt), localView);
        GMTrace.o(8279086333952L, 61684);
        return localView;
        localObject2 = ((a)localObject2).pHR.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (i)((Iterator)localObject2).next();
          if ((((i)localObject3).getView().getParent() != null) && ((((i)localObject3).getView().getParent() instanceof ViewGroup))) {
            ((ViewGroup)((i)localObject3).getView().getParent()).removeView(((i)localObject3).getView());
          }
          ((LinearLayout)localObject1).addView(((i)localObject3).getView());
        }
        break;
        label458:
        ((ImageView)localObject2).setImageDrawable(a.b(this.mContext, i.e.oYa));
      }
      label476:
      if (paramInt == this.pHG.pEj.size() - 1) {
        ((ImageView)localObject2).setVisibility(8);
      }
      for (;;)
      {
        ((TextView)localObject3).setText(paramInt + 1 + "/" + this.pHG.pEj.size());
        break;
        ((ImageView)localObject2).setVisibility(0);
      }
    }
    
    public final void d(Object paramObject)
    {
      GMTrace.i(8278952116224L, 61683);
      GMTrace.o(8278952116224L, 61683);
    }
    
    public final void e(final ImageView paramImageView)
    {
      GMTrace.i(16043850334208L, 119536);
      AnimationSet localAnimationSet = new AnimationSet(true);
      Object localObject = new TranslateAnimation(0.0F, -5.0F, 0.0F, 0.0F);
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
          GMTrace.i(8278281027584L, 61678);
          paramAnonymousAnimation = new AnimationSet(true);
          Object localObject = new TranslateAnimation(-5.0F, 0.0F, 0.0F, 0.0F);
          ((TranslateAnimation)localObject).setDuration(n.a.this.pHI);
          ((TranslateAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
          ((TranslateAnimation)localObject).setStartTime(n.a.this.pHI);
          paramAnonymousAnimation.addAnimation((Animation)localObject);
          localObject = new AlphaAnimation(0.3F, 0.8F);
          ((AlphaAnimation)localObject).setDuration(n.a.this.pHI);
          ((AlphaAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
          ((AlphaAnimation)localObject).setStartTime(n.a.this.pHI);
          paramAnonymousAnimation.addAnimation((Animation)localObject);
          paramAnonymousAnimation.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymous2Animation)
            {
              GMTrace.i(8235465572352L, 61359);
              long l = new BigInteger((String)n.a.1.this.pHM.getTag()).longValue();
              if (l >= 3L)
              {
                paramAnonymous2Animation = new AlphaAnimation(0.8F, 0.0F);
                paramAnonymous2Animation.setDuration(n.a.this.pHJ);
                paramAnonymous2Animation.setInterpolator(new DecelerateInterpolator(1.2F));
                paramAnonymous2Animation.setAnimationListener(new Animation.AnimationListener()
                {
                  public final void onAnimationEnd(Animation paramAnonymous3Animation)
                  {
                    GMTrace.i(8223788630016L, 61272);
                    n.a.1.this.pHM.setAlpha(0.0F);
                    GMTrace.o(8223788630016L, 61272);
                  }
                  
                  public final void onAnimationRepeat(Animation paramAnonymous3Animation)
                  {
                    GMTrace.i(8223922847744L, 61273);
                    GMTrace.o(8223922847744L, 61273);
                  }
                  
                  public final void onAnimationStart(Animation paramAnonymous3Animation)
                  {
                    GMTrace.i(8223654412288L, 61271);
                    GMTrace.o(8223654412288L, 61271);
                  }
                });
                n.a.1.this.pHM.startAnimation(paramAnonymous2Animation);
                GMTrace.o(8235465572352L, 61359);
                return;
              }
              n.a.1.this.pHM.setTag(String.valueOf(l + 1L));
              n.a.this.e(n.a.1.this.pHM);
              GMTrace.o(8235465572352L, 61359);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymous2Animation)
            {
              GMTrace.i(8235599790080L, 61360);
              GMTrace.o(8235599790080L, 61360);
            }
            
            public final void onAnimationStart(Animation paramAnonymous2Animation)
            {
              GMTrace.i(8235331354624L, 61358);
              GMTrace.o(8235331354624L, 61358);
            }
          });
          paramImageView.startAnimation(paramAnonymousAnimation);
          GMTrace.o(8278281027584L, 61678);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8278415245312L, 61679);
          GMTrace.o(8278415245312L, 61679);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8278146809856L, 61677);
          GMTrace.o(8278146809856L, 61677);
        }
      });
      paramImageView.startAnimation(localAnimationSet);
      GMTrace.o(16043850334208L, 119536);
    }
    
    public final int getCount()
    {
      GMTrace.i(8278683680768L, 61681);
      int i = this.pHG.pEj.size();
      GMTrace.o(8278683680768L, 61681);
      return i;
    }
    
    public final void uK(int paramInt)
    {
      GMTrace.i(8279354769408L, 61686);
      final Object localObject = (View)this.pHK.get(String.valueOf(paramInt));
      if (localObject == null)
      {
        GMTrace.o(8279354769408L, 61686);
        return;
      }
      localObject = (ImageView)((View)localObject).findViewById(i.f.pcr);
      if ((localObject != null) && (((ImageView)localObject).getVisibility() == 0) && ((((ImageView)localObject).getTag() == null) || (!(((ImageView)localObject).getTag() instanceof String)) || (new BigInteger((String)((ImageView)localObject).getTag()).longValue() < 1L)))
      {
        ((ImageView)localObject).setTag("1");
        AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 0.8F);
        localAlphaAnimation.setDuration(this.pHH);
        localAlphaAnimation.setInterpolator(new DecelerateInterpolator(1.2F));
        localAlphaAnimation.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8231975911424L, 61333);
            new ae().postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8236673531904L, 61368);
                n.a.this.e(n.a.2.this.pHM);
                GMTrace.o(8236673531904L, 61368);
              }
            }, 200L);
            GMTrace.o(8231975911424L, 61333);
          }
          
          public final void onAnimationRepeat(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8232110129152L, 61334);
            GMTrace.o(8232110129152L, 61334);
          }
          
          public final void onAnimationStart(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8231841693696L, 61332);
            GMTrace.o(8231841693696L, 61332);
          }
        });
        ((ImageView)localObject).startAnimation(localAlphaAnimation);
      }
      GMTrace.o(8279354769408L, 61686);
    }
    
    public final void uL(int paramInt)
    {
      GMTrace.i(8279488987136L, 61687);
      Iterator localIterator = this.pHL.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        a locala = (a)this.pHL.get(localObject);
        if ((locala != null) && (locala.pHR.size() != 0))
        {
          int i;
          if (((String)localObject).equals(String.valueOf(paramInt)))
          {
            i = 0;
            while (i < locala.pHR.size())
            {
              localObject = (i)locala.pHR.get(i);
              if (!((i)localObject).pGV) {
                ((i)localObject).bkm();
              }
              i += 1;
            }
          }
          else
          {
            i = 0;
            while (i < locala.pHR.size())
            {
              localObject = (i)locala.pHR.get(i);
              if (((i)localObject).pGV) {
                ((i)localObject).bkn();
              }
              i += 1;
            }
          }
        }
      }
      GMTrace.o(8279488987136L, 61687);
    }
    
    public final class a
    {
      public LinkedList<i> pHR;
      
      public a()
      {
        GMTrace.i(8229559992320L, 61315);
        this.pHR = new LinkedList();
        GMTrace.o(8229559992320L, 61315);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */