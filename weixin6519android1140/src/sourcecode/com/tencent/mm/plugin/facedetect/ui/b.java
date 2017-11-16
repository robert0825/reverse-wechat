package com.tencent.mm.plugin.facedetect.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.a.a;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;

public final class b
{
  public Animation kVA;
  Button kVx;
  u kXg;
  public a kXh;
  public View kgo;
  public ViewPager wV;
  
  public b()
  {
    GMTrace.i(14528129531904L, 108243);
    this.kgo = null;
    this.kVA = null;
    this.kVA = AnimationUtils.loadAnimation(ab.getContext(), a.a.aLi);
    this.kVA.setDuration(500L);
    GMTrace.o(14528129531904L, 108243);
  }
  
  public final void dismiss()
  {
    GMTrace.i(5895379484672L, 43924);
    if (this.kgo.getVisibility() == 0) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5894574178304L, 43918);
          b.this.kVA.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymous2Animation)
            {
              GMTrace.i(5899003363328L, 43951);
              b.this.kgo.setVisibility(8);
              GMTrace.o(5899003363328L, 43951);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymous2Animation)
            {
              GMTrace.i(5899137581056L, 43952);
              GMTrace.o(5899137581056L, 43952);
            }
            
            public final void onAnimationStart(Animation paramAnonymous2Animation)
            {
              GMTrace.i(5898869145600L, 43950);
              GMTrace.o(5898869145600L, 43950);
            }
          });
          b.this.kgo.startAnimation(b.this.kVA);
          GMTrace.o(5894574178304L, 43918);
        }
      });
    }
    GMTrace.o(5895379484672L, 43924);
  }
  
  static abstract interface a
  {
    public abstract void awU();
    
    public abstract void onCancel();
  }
  
  private final class b
    extends o
  {
    public b(l paraml)
    {
      super();
      GMTrace.i(14527458443264L, 108238);
      GMTrace.o(14527458443264L, 108238);
    }
    
    public final Fragment I(int paramInt)
    {
      GMTrace.i(14527592660992L, 108239);
      switch (paramInt)
      {
      default: 
        throw new InvalidParameterException("hy: invalid page status");
      }
      b.c localc = new b.c(b.this);
      GMTrace.o(14527592660992L, 108239);
      return localc;
    }
    
    public final int getCount()
    {
      GMTrace.i(14527726878720L, 108240);
      GMTrace.o(14527726878720L, 108240);
      return 1;
    }
  }
  
  @SuppressLint({"ValidFragment"})
  public static final class c
    extends Fragment
  {
    private Button kXk;
    public WeakReference<b> kXl;
    private View kgo;
    
    public c(b paramb)
    {
      GMTrace.i(14528263749632L, 108244);
      this.kgo = null;
      this.kXk = null;
      w.d("MicroMsg.FaceTutorialUI.TutorialTwo", "hy: TutorialTwo constructed");
      this.kXl = new WeakReference(paramb);
      GMTrace.o(14528263749632L, 108244);
    }
    
    public final void onCreate(Bundle paramBundle)
    {
      GMTrace.i(14528532185088L, 108246);
      super.onCreate(paramBundle);
      GMTrace.o(14528532185088L, 108246);
    }
    
    public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      GMTrace.i(14528397967360L, 108245);
      this.kgo = paramLayoutInflater.inflate(a.g.kQv, paramViewGroup, false);
      this.kXk = ((Button)this.kgo.findViewById(a.e.kPZ));
      this.kXk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14534303547392L, 108289);
          if (b.c.this.kXl.get() != null)
          {
            paramAnonymousView = (b)b.c.this.kXl.get();
            if (paramAnonymousView.kXh != null) {
              paramAnonymousView.kXh.awU();
            }
            paramAnonymousView.dismiss();
            GMTrace.o(14534303547392L, 108289);
            return;
          }
          w.e("MicroMsg.FaceTutorialUI.TutorialTwo", "hy: lost tutorial instance");
          GMTrace.o(14534303547392L, 108289);
        }
      });
      paramLayoutInflater = this.kgo;
      GMTrace.o(14528397967360L, 108245);
      return paramLayoutInflater;
    }
    
    public final void onDestroy()
    {
      GMTrace.i(14528666402816L, 108247);
      super.onDestroy();
      w.i("MicroMsg.FaceTutorialUI.TutorialTwo", "hy: TutorialTwo onDestroy");
      GMTrace.o(14528666402816L, 108247);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */