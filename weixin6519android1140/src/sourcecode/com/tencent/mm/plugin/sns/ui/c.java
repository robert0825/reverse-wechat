package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.f.g;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  private Context mContext;
  private com.tencent.mm.plugin.sns.f.b pNI;
  TextView pNJ;
  ListView pNK;
  View pNL;
  private int pnx;
  private com.tencent.mm.plugin.sns.ui.b.b pxE;
  private FrameLayout pxF;
  AbsoluteLayout pxG;
  protected Animation pxH;
  protected Animation pxI;
  public boolean pxJ;
  
  public c(Context paramContext, com.tencent.mm.plugin.sns.ui.b.b paramb, FrameLayout paramFrameLayout, com.tencent.mm.plugin.sns.f.b paramb1)
  {
    GMTrace.i(8429410189312L, 62804);
    this.pxG = null;
    this.pxJ = false;
    this.pnx = -1;
    this.mContext = paramContext;
    this.pNI = paramb1;
    this.pxE = paramb;
    this.pxF = paramFrameLayout;
    this.pxH = new ScaleAnimation(1.0F, 1.0F, 0.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.pxH = AnimationUtils.loadAnimation(paramContext, i.a.oWU);
    this.pxI = new ScaleAnimation(1.0F, 1.0F, 1.0F, 0.0F, 1, 1.0F, 1, 0.0F);
    this.pxI = AnimationUtils.loadAnimation(paramContext, i.a.oWV);
    GMTrace.o(8429410189312L, 62804);
  }
  
  public final boolean bjU()
  {
    GMTrace.i(8429678624768L, 62806);
    if ((this.pNI != null) && (com.tencent.mm.plugin.sns.model.ae.biV().bjV())) {
      this.pNI.bjU();
    }
    if (this.pxG != null)
    {
      this.pxF.removeView(this.pxG);
      this.pxG = null;
      GMTrace.o(8429678624768L, 62806);
      return true;
    }
    this.pxJ = false;
    this.pNK = null;
    this.pNL = null;
    GMTrace.o(8429678624768L, 62806);
    return false;
  }
  
  public final boolean bmB()
  {
    GMTrace.i(20061523804160L, 149470);
    final int k = this.pNJ.getHeight();
    this.pNJ.setVisibility(8);
    int i = 0;
    Object localObject = null;
    final int j = 0;
    while (i < this.pNK.getAdapter().getCount())
    {
      localObject = this.pNK.getAdapter().getView(i, (View)localObject, null);
      ((View)localObject).measure(this.pNL.getWidth(), -2);
      j += ((View)localObject).getMeasuredHeight();
      i += 1;
    }
    ((RelativeLayout.LayoutParams)this.pNK.getLayoutParams()).bottomMargin = (k - j);
    this.pNK.setVisibility(0);
    localObject = new Animation()
    {
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(20061255368704L, 149468);
        paramAnonymousTransformation = (RelativeLayout.LayoutParams)c.this.pNK.getLayoutParams();
        if (paramAnonymousFloat == 1.0F) {}
        for (int i = 0;; i = (int)((k - j) * (1.0F - paramAnonymousFloat)))
        {
          paramAnonymousTransformation.bottomMargin = i;
          c.this.pNK.requestLayout();
          GMTrace.o(20061255368704L, 149468);
          return;
        }
      }
      
      public final boolean willChangeBounds()
      {
        GMTrace.i(20061389586432L, 149469);
        GMTrace.o(20061389586432L, 149469);
        return true;
      }
    };
    ((Animation)localObject).setDuration(250L);
    this.pNK.startAnimation((Animation)localObject);
    GMTrace.o(20061523804160L, 149470);
    return true;
  }
  
  public final void c(View paramView1, View paramView2)
  {
    GMTrace.i(16044252987392L, 119539);
    Object localObject = (com.tencent.mm.plugin.sns.data.b)paramView1.getTag();
    paramView2.setVisibility(0);
    this.pxJ = true;
    this.pxH.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8345121456128L, 62176);
        c.this.pxJ = false;
        GMTrace.o(8345121456128L, 62176);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8345255673856L, 62177);
        GMTrace.o(8345255673856L, 62177);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8344987238400L, 62175);
        c.this.pxJ = true;
        GMTrace.o(8344987238400L, 62175);
      }
    });
    paramView2.startAnimation(this.pxH);
    this.pNJ = ((TextView)paramView2.findViewById(i.f.oYX));
    this.pNJ.setOnClickListener(this.pxE.qmG);
    this.pNJ.setOnTouchListener(bg.bQV());
    this.pNJ.setTag(localObject);
    String str;
    if ((((com.tencent.mm.plugin.sns.data.b)localObject).poY != null) && (((com.tencent.mm.plugin.sns.data.b)localObject).poY.qjF != null))
    {
      localObject = ((com.tencent.mm.plugin.sns.data.b)localObject).poY.qjG;
      str = com.tencent.mm.sdk.platformtools.v.eq(ab.getContext());
      if (!"zh_CN".equals(str)) {
        break label226;
      }
      localObject = ((a)localObject).pCv;
    }
    for (;;)
    {
      if (!bg.nm((String)localObject)) {
        this.pNJ.setText((CharSequence)localObject);
      }
      this.pNK = ((ListView)paramView2.findViewById(i.f.oYT));
      this.pNK.setAdapter(new d(this.mContext, (com.tencent.mm.plugin.sns.data.b)paramView1.getTag()));
      this.pNK.setOnItemClickListener(this.pxE.qmX);
      this.pNL = paramView2;
      GMTrace.o(16044252987392L, 119539);
      return;
      label226:
      if (("zh_TW".equals(str)) || ("zh_HK".equals(str))) {
        localObject = ((a)localObject).pCx;
      } else {
        localObject = ((a)localObject).pCw;
      }
    }
  }
  
  public final boolean cw(final View paramView)
  {
    GMTrace.i(8429544407040L, 62805);
    if ((com.tencent.mm.plugin.sns.model.ae.biV().bjV()) && (this.pNI != null))
    {
      i = this.pNI.ct(paramView);
      if ((i == 0) || (i == 1))
      {
        GMTrace.o(8429544407040L, 62805);
        return true;
      }
      w.i("MicroMsg.AdNotLikeHelper", "abtest error return 2");
    }
    if (this.pxJ)
    {
      GMTrace.o(8429544407040L, 62805);
      return false;
    }
    if (this.pxG != null)
    {
      if ((this.pxG.getTag() instanceof a))
      {
        paramView = ((a)this.pxG.getTag()).pmD;
        this.pxJ = true;
        paramView.startAnimation(this.pxI);
        this.pxI.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8348342681600L, 62200);
            if (paramView != null)
            {
              paramView.clearAnimation();
              paramView.setVisibility(8);
              c.this.bjU();
            }
            c.this.pxJ = false;
            GMTrace.o(8348342681600L, 62200);
          }
          
          public final void onAnimationRepeat(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8348208463872L, 62199);
            GMTrace.o(8348208463872L, 62199);
          }
          
          public final void onAnimationStart(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8348074246144L, 62198);
            c.this.pxJ = true;
            GMTrace.o(8348074246144L, 62198);
          }
        });
      }
      for (;;)
      {
        GMTrace.o(8429544407040L, 62805);
        return false;
        bjU();
      }
    }
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
    {
      GMTrace.o(8429544407040L, 62805);
      return false;
    }
    com.tencent.mm.plugin.sns.data.b localb = (com.tencent.mm.plugin.sns.data.b)paramView.getTag();
    Object localObject2 = localb.eEM;
    this.pxG = new AbsoluteLayout(this.mContext);
    this.pxG.setId(i.f.coT);
    new FrameLayout.LayoutParams(-1, -1);
    this.pxF.addView(this.pxG);
    int i = BackwardSupportUtil.b.a(this.mContext, 150.0F);
    int j = BackwardSupportUtil.b.a(this.mContext, 17.0F);
    BackwardSupportUtil.b.a(this.mContext, 40.0F);
    final View localView = com.tencent.mm.ui.v.fb(this.mContext).inflate(i.g.peK, null);
    TextView localTextView = (TextView)localView.findViewById(i.f.oYW);
    Object localObject1 = com.tencent.mm.sdk.platformtools.v.eq(ab.getContext());
    com.tencent.mm.plugin.sns.storage.b localb1 = localb.poY.qjF;
    if (localb1 != null)
    {
      if (!"zh_CN".equals(localObject1)) {
        break label571;
      }
      localObject1 = localb1.pCX;
    }
    for (;;)
    {
      if (!bg.nm((String)localObject1)) {
        localTextView.setText((CharSequence)localObject1);
      }
      new Rect();
      int k = e.dG(this.mContext);
      localObject1 = localb.poY.bpT();
      w.d("MicroMsg.AdNotLikeHelper", "addCommentView getLocationInWindow " + localObject1[0] + "  " + localObject1[1] + " height: " + k);
      this.pnx = e.dH(this.mContext);
      localObject1 = new AbsoluteLayout.LayoutParams(-2, -2, localObject1[0] - i, localObject1[1] - this.pnx - k + j);
      localObject2 = new a((String)localObject2, localView);
      this.pxG.setTag(localObject2);
      this.pxG.addView(localView, (ViewGroup.LayoutParams)localObject1);
      localView.setVisibility(8);
      this.pxJ = true;
      new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8548998184960L, 63695);
          c.this.c(paramView, localView);
          GMTrace.o(8548998184960L, 63695);
        }
      });
      GMTrace.o(8429544407040L, 62805);
      return true;
      label571:
      if (("zh_TW".equals(localObject1)) || ("zh_HK".equals(localObject1))) {
        localObject1 = localb1.pCZ;
      } else {
        localObject1 = localb1.pCY;
      }
    }
  }
  
  final class a
  {
    View pmD;
    String pxZ;
    
    public a(String paramString, View paramView)
    {
      GMTrace.i(8543763693568L, 63656);
      this.pmD = null;
      this.pxZ = paramString;
      this.pmD = paramView;
      GMTrace.o(8543763693568L, 63656);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */