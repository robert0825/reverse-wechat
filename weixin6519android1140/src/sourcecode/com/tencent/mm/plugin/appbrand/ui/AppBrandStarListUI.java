package com.tencent.mm.plugin.appbrand.ui;

import android.app.Dialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.HandlerThread;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.e.c;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.q;
import android.support.v7.widget.RecyclerView.t;
import android.support.v7.widget.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.f;
import com.tencent.mm.plugin.appbrand.c.f.b;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AppBrandStarListUI
  extends DrawStatusBarActivity
{
  private Dialog iBR;
  
  public AppBrandStarListUI()
  {
    GMTrace.i(10529112326144L, 78448);
    this.iBR = null;
    GMTrace.o(10529112326144L, 78448);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10529380761600L, 78450);
    GMTrace.o(10529380761600L, 78450);
    return -1;
  }
  
  protected final int getStatusBarColor()
  {
    GMTrace.i(10529514979328L, 78451);
    if ((Build.VERSION.SDK_INT >= 23) && (g.b(getWindow())))
    {
      GMTrace.o(10529514979328L, 78451);
      return -1052684;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      i = AppBrandLauncherUI.iAN;
      GMTrace.o(10529514979328L, 78451);
      return i;
    }
    int i = super.getStatusBarColor();
    GMTrace.o(10529514979328L, 78451);
    return i;
  }
  
  public final void onBackPressed()
  {
    GMTrace.i(10529917632512L, 78454);
    Object localObject = aR().E(16908290);
    if ((localObject != null) && ((localObject instanceof a)))
    {
      localObject = (a)localObject;
      if (((a)localObject).iBY)
      {
        ((a)localObject).iBY = false;
        ((a)localObject).a(AppBrandStarListUI.a.c.iCn);
      }
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(10529917632512L, 78454);
        return;
      }
    }
    super.onBackPressed();
    GMTrace.o(10529917632512L, 78454);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(10529783414784L, 78453);
    super.onConfigurationChanged(paramConfiguration);
    GMTrace.o(10529783414784L, 78453);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10529649197056L, 78452);
    super.onCreate(paramBundle);
    finish();
    GMTrace.o(10529649197056L, 78452);
  }
  
  public static final class a
    extends Fragment
  {
    View iBS;
    private RecyclerView iBT;
    public e iBU;
    public GridLayoutManager iBV;
    private View iBW;
    private TextView iBX;
    public boolean iBY;
    public final ArrayList<com.tencent.mm.plugin.appbrand.c.e> iBZ;
    private final j.a iCa;
    private c iCb;
    
    public a()
    {
      GMTrace.i(10531259809792L, 78464);
      this.iBY = false;
      this.iBZ = new ArrayList(10);
      this.iCa = new j.a()
      {
        public final void a(final String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
        {
          GMTrace.i(10536628518912L, 78504);
          if ((2 == paramAnonymousl.iqq) || (3 == paramAnonymousl.iqq))
          {
            paramAnonymousString = com.tencent.mm.plugin.appbrand.app.e.Sk().ig(f.b.hMU);
            if (AppBrandStarListUI.a.this.aG() != null) {
              AppBrandStarListUI.a.this.aG().runOnUiThread(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(10519180214272L, 78374);
                  if (AppBrandStarListUI.a.this.aG() == null)
                  {
                    GMTrace.o(10519180214272L, 78374);
                    return;
                  }
                  if (bg.cc(paramAnonymousString))
                  {
                    AppBrandStarListUI.a((AppBrandStarListUI)AppBrandStarListUI.a.this.aG());
                    GMTrace.o(10519180214272L, 78374);
                    return;
                  }
                  AppBrandStarListUI.a locala = AppBrandStarListUI.a.this;
                  List localList = paramAnonymousString;
                  locala.iBZ.clear();
                  locala.iBZ.addAll(localList);
                  locala.a(AppBrandStarListUI.a.c.iCo);
                  locala.aaQ();
                  GMTrace.o(10519180214272L, 78374);
                }
              });
            }
          }
          GMTrace.o(10536628518912L, 78504);
        }
      };
      this.iCb = c.iCo;
      GMTrace.o(10531259809792L, 78464);
    }
    
    public final void a(c paramc)
    {
      GMTrace.i(10531394027520L, 78465);
      this.iCb = paramc;
      if (this.iBU != null) {
        this.iBU.b(0, this.iBZ.size(), paramc.tag);
      }
      GMTrace.o(10531394027520L, 78465);
    }
    
    public final void aaP()
    {
      GMTrace.i(16056332582912L, 119629);
      if ((this.iBS != null) && (this.iBV != null))
      {
        int i = this.iBS.getWidth() / com.tencent.mm.br.a.V(aG(), o.d.hAg);
        if (i != this.iBV.Qx)
        {
          this.iBV.aS(i);
          this.iBV.requestLayout();
        }
      }
      GMTrace.o(16056332582912L, 119629);
    }
    
    public final void aaQ()
    {
      GMTrace.i(10531930898432L, 78469);
      if ((this.iBX != null) && (this.iBW != null))
      {
        if (this.iBZ.size() >= 10)
        {
          this.iBW.setVisibility(0);
          this.iBX.setText(getResources().getString(o.i.hGC, new Object[] { Integer.valueOf(10) }));
          GMTrace.o(10531930898432L, 78469);
          return;
        }
        this.iBW.setVisibility(8);
      }
      GMTrace.o(10531930898432L, 78469);
    }
    
    public final void onConfigurationChanged(final Configuration paramConfiguration)
    {
      GMTrace.i(10531796680704L, 78468);
      super.onConfigurationChanged(paramConfiguration);
      if (this.iBS == null)
      {
        GMTrace.o(10531796680704L, 78468);
        return;
      }
      paramConfiguration = this.iBS.getViewTreeObserver();
      if (paramConfiguration == null)
      {
        GMTrace.o(10531796680704L, 78468);
        return;
      }
      paramConfiguration.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        int iCk;
        
        public final void onGlobalLayout()
        {
          GMTrace.i(10552868864000L, 78625);
          int i = this.iCk + 1;
          this.iCk = i;
          if (i < 2)
          {
            GMTrace.o(10552868864000L, 78625);
            return;
          }
          paramConfiguration.removeOnGlobalLayoutListener(this);
          AppBrandStarListUI.a.this.aaP();
          GMTrace.o(10552868864000L, 78625);
        }
      });
      GMTrace.o(10531796680704L, 78468);
    }
    
    public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      GMTrace.i(10531528245248L, 78466);
      this.iBS = paramLayoutInflater.inflate(o.g.hDl, null);
      this.iBT = ((RecyclerView)this.iBS.findViewById(o.f.hCA));
      this.iBV = new GridLayoutManager();
      this.iBU = new e();
      this.iBT.a(new d());
      this.iBT.a(new v()
      {
        final Map<RecyclerView.t, ViewPropertyAnimator> iCf;
        final Map<RecyclerView.t, ViewPropertyAnimator> iCg;
        
        public final RecyclerView.e.c a(RecyclerView.q paramAnonymousq, RecyclerView.t paramAnonymoust, int paramAnonymousInt, List<Object> paramAnonymousList)
        {
          GMTrace.i(10497571160064L, 78213);
          if (2 == paramAnonymousInt)
          {
            Iterator localIterator = paramAnonymousList.iterator();
            while (localIterator.hasNext())
            {
              Object localObject = localIterator.next();
              if ("enter_delete_mode_tag".equals(localObject))
              {
                paramAnonymousq = new AppBrandStarListUI.a.a().b(paramAnonymoust, 0);
                GMTrace.o(10497571160064L, 78213);
                return paramAnonymousq;
              }
              if ("exit_delete_mode_tag".equals(localObject))
              {
                paramAnonymousq = new AppBrandStarListUI.a.b().b(paramAnonymoust, 0);
                GMTrace.o(10497571160064L, 78213);
                return paramAnonymousq;
              }
            }
          }
          paramAnonymousq = super.a(paramAnonymousq, paramAnonymoust, paramAnonymousInt, paramAnonymousList);
          GMTrace.o(10497571160064L, 78213);
          return paramAnonymousq;
        }
        
        public final boolean a(final RecyclerView.t paramAnonymoust1, final RecyclerView.t paramAnonymoust2, RecyclerView.e.c paramAnonymousc1, RecyclerView.e.c paramAnonymousc2)
        {
          GMTrace.i(10497436942336L, 78212);
          if (paramAnonymoust2 != null)
          {
            if (this.iCf.containsKey(paramAnonymoust2)) {
              ((ViewPropertyAnimator)this.iCf.remove(paramAnonymoust2)).cancel();
            }
            if (this.iCg.containsKey(paramAnonymoust2)) {
              ((ViewPropertyAnimator)this.iCg.remove(paramAnonymoust2)).cancel();
            }
          }
          if ((paramAnonymousc1 instanceof AppBrandStarListUI.a.a))
          {
            paramAnonymoust1 = (AppBrandStarListUI.a.f)paramAnonymoust2;
            paramAnonymoust1.iCu.setAlpha(0.0F);
            paramAnonymoust1.iCu.setVisibility(0);
            paramAnonymousc1 = paramAnonymoust1.iCu.animate().setDuration(200L).alpha(1.0F).withEndAction(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(10528978108416L, 78447);
                AppBrandStarListUI.a.3.this.iCf.remove(paramAnonymoust2);
                AppBrandStarListUI.a.3.this.z(paramAnonymoust2);
                GMTrace.o(10528978108416L, 78447);
              }
            });
            this.iCf.put(paramAnonymoust2, paramAnonymousc1);
            paramAnonymousc1.start();
            paramAnonymoust1 = paramAnonymoust1.iCr.animate().setDuration(200L).scaleX(1.0F).scaleY(1.0F).withEndAction(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(10501866127360L, 78245);
                AppBrandStarListUI.a.3.this.iCg.remove(paramAnonymoust2);
                AppBrandStarListUI.a.3.this.z(paramAnonymoust2);
                GMTrace.o(10501866127360L, 78245);
              }
            });
            this.iCg.put(paramAnonymoust2, paramAnonymoust1);
            paramAnonymoust1.start();
            GMTrace.o(10497436942336L, 78212);
            return false;
          }
          if ((paramAnonymousc1 instanceof AppBrandStarListUI.a.b))
          {
            paramAnonymoust1 = (AppBrandStarListUI.a.f)paramAnonymoust2;
            paramAnonymousc1 = paramAnonymoust1.iCu.animate().setDuration(200L).alpha(0.0F).withEndAction(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(10546560630784L, 78578);
                paramAnonymoust1.iCu.setVisibility(8);
                AppBrandStarListUI.a.3.this.iCf.remove(paramAnonymoust2);
                AppBrandStarListUI.a.3.this.z(paramAnonymoust2);
                GMTrace.o(10546560630784L, 78578);
              }
            });
            this.iCf.put(paramAnonymoust2, paramAnonymousc1);
            paramAnonymousc1.start();
            paramAnonymoust1 = paramAnonymoust1.iCr.animate().setDuration(200L).scaleX(0.9F).scaleY(0.9F).withEndAction(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(10546829066240L, 78580);
                AppBrandStarListUI.a.3.this.iCg.remove(paramAnonymoust2);
                AppBrandStarListUI.a.3.this.z(paramAnonymoust2);
                GMTrace.o(10546829066240L, 78580);
              }
            });
            this.iCg.put(paramAnonymoust2, paramAnonymoust1);
            paramAnonymoust1.start();
            GMTrace.o(10497436942336L, 78212);
            return false;
          }
          boolean bool = super.a(paramAnonymoust1, paramAnonymoust2, paramAnonymousc1, paramAnonymousc2);
          GMTrace.o(10497436942336L, 78212);
          return bool;
        }
        
        public final boolean a(RecyclerView.t paramAnonymoust, List<Object> paramAnonymousList)
        {
          GMTrace.i(10497705377792L, 78214);
          GMTrace.o(10497705377792L, 78214);
          return true;
        }
        
        public final void z(RecyclerView.t paramAnonymoust)
        {
          GMTrace.i(16056198365184L, 119628);
          if ((this.iCf.containsKey(paramAnonymoust)) || (this.iCg.containsKey(paramAnonymoust)))
          {
            GMTrace.o(16056198365184L, 119628);
            return;
          }
          k(paramAnonymoust);
          GMTrace.o(16056198365184L, 119628);
        }
      });
      this.iBT.a(this.iBV);
      this.iBT.a(this.iBU);
      this.iBW = this.iBS.findViewById(o.f.hCy);
      this.iBX = ((TextView)this.iBS.findViewById(o.f.hCz));
      this.iBS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10492068233216L, 78172);
          AppBrandStarListUI.a.this.aaQ();
          AppBrandStarListUI.a.this.aaP();
          GMTrace.o(10492068233216L, 78172);
        }
      });
      com.tencent.mm.plugin.appbrand.app.e.Sk().a(this.iCa, d.xB().ngv.getLooper());
      paramLayoutInflater = this.iBS;
      GMTrace.o(10531528245248L, 78466);
      return paramLayoutInflater;
    }
    
    public final void onDestroyView()
    {
      GMTrace.i(10531662462976L, 78467);
      super.onDestroyView();
      com.tencent.mm.plugin.appbrand.app.e.Sk().j(this.iCa);
      try
      {
        Field[] arrayOfField = getClass().getFields();
        int j = arrayOfField.length;
        int i = 0;
        while (i < j)
        {
          Field localField = arrayOfField[i];
          if (localField.isAccessible()) {
            localField.set(this, null);
          }
          i += 1;
        }
        GMTrace.o(10531662462976L, 78467);
        return;
      }
      catch (Exception localException)
      {
        GMTrace.o(10531662462976L, 78467);
      }
    }
    
    private static final class a
      extends RecyclerView.e.c
    {
      public a()
      {
        GMTrace.i(10502671433728L, 78251);
        GMTrace.o(10502671433728L, 78251);
      }
    }
    
    private static final class b
      extends RecyclerView.e.c
    {
      public b()
      {
        GMTrace.i(10537836478464L, 78513);
        GMTrace.o(10537836478464L, 78513);
      }
    }
    
    private static enum c
    {
      final Object tag;
      
      static
      {
        GMTrace.i(10494215716864L, 78188);
        iCm = new c("SWITCH_TO_DELETE", 0, "enter_delete_mode_tag");
        iCn = new c("SWITCH_TO_NORMAL", 1, "exit_delete_mode_tag");
        iCo = new c("NEW_DATA", 2, null);
        iCp = new c[] { iCm, iCn, iCo };
        GMTrace.o(10494215716864L, 78188);
      }
      
      private c(Object paramObject)
      {
        GMTrace.i(10494081499136L, 78187);
        this.tag = paramObject;
        GMTrace.o(10494081499136L, 78187);
      }
    }
    
    final class d
      extends RecyclerView.g
    {
      d()
      {
        GMTrace.i(10535957430272L, 78499);
        GMTrace.o(10535957430272L, 78499);
      }
      
      public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView)
      {
        GMTrace.i(10536091648000L, 78500);
        paramRect.top = 0;
        paramRect.right = 0;
        paramRect.left = 0;
        if (paramRecyclerView.aQ(paramView).gd() >= AppBrandStarListUI.a.this.iBU.getItemCount() / AppBrandStarListUI.a.this.iBV.Qx * AppBrandStarListUI.a.this.iBV.Qx)
        {
          paramRect.bottom = 0;
          GMTrace.o(10536091648000L, 78500);
          return;
        }
        paramRect.bottom = AppBrandStarListUI.a.this.getResources().getDimensionPixelSize(o.d.hAh);
        GMTrace.o(10536091648000L, 78500);
      }
    }
    
    final class e
      extends RecyclerView.a<AppBrandStarListUI.a.f>
    {
      e()
      {
        GMTrace.i(10487639048192L, 78139);
        GMTrace.o(10487639048192L, 78139);
      }
      
      public final int getItemCount()
      {
        GMTrace.i(10487773265920L, 78140);
        int i = AppBrandStarListUI.a.this.iBZ.size();
        GMTrace.o(10487773265920L, 78140);
        return i;
      }
    }
    
    final class f
      extends RecyclerView.t
      implements View.OnClickListener, View.OnLongClickListener
    {
      com.tencent.mm.plugin.appbrand.c.e iCq;
      ImageView iCr;
      TextView iCs;
      TextView iCt;
      View iCu;
      
      f(View paramView)
      {
        super();
        GMTrace.i(10540655050752L, 78534);
        this.iCr = ((ImageView)paramView.findViewById(o.f.icon));
        this.iCs = ((TextView)paramView.findViewById(o.f.name));
        this.iCt = ((TextView)paramView.findViewById(o.f.hCB));
        this.iCu = paramView.findViewById(o.f.hBr);
        this.iCu.setOnClickListener(this);
        this.UU.setOnClickListener(this);
        this.UU.setOnLongClickListener(this);
        GMTrace.o(10540655050752L, 78534);
      }
      
      public final void onClick(View paramView)
      {
        GMTrace.i(10540789268480L, 78535);
        if (this.iCq != null)
        {
          final Object localObject;
          if ((AppBrandStarListUI.a.this.iBY) && (paramView == this.iCu))
          {
            localObject = this.iCq.eAr;
            final int i = this.iCq.hKs;
            final int j = gd();
            d.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(10546292195328L, 78576);
                com.tencent.mm.plugin.appbrand.app.e.Sk().h(localObject, i, true);
                if (AppBrandStarListUI.a.this.aG() != null) {
                  AppBrandStarListUI.a.this.aG().runOnUiThread(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(10496631635968L, 78206);
                      AppBrandStarListUI.a.this.iBZ.remove(AppBrandStarListUI.a.f.1.this.jN);
                      if (AppBrandStarListUI.a.this.iBU != null)
                      {
                        AppBrandStarListUI.a.this.iBU.be(AppBrandStarListUI.a.f.1.this.jN);
                        AppBrandStarListUI.a.this.aaQ();
                        if (bg.cc(AppBrandStarListUI.a.this.iBZ)) {
                          AppBrandStarListUI.a((AppBrandStarListUI)AppBrandStarListUI.a.this.aG());
                        }
                      }
                      GMTrace.o(10496631635968L, 78206);
                    }
                  });
                }
                com.tencent.mm.plugin.appbrand.report.a.a(AppBrandStarListUI.a.f.this.iCq.appId, AppBrandStarListUI.a.f.this.iCq.hKs + 1, 4, 2, "");
                GMTrace.o(10546292195328L, 78576);
              }
            });
          }
          if ((!AppBrandStarListUI.a.this.iBY) && (paramView == this.UU))
          {
            paramView = this.iCq;
            localObject = new AppBrandStatObject();
            ((AppBrandStatObject)localObject).scene = 1003;
            AppBrandLaunchProxyUI.a(AppBrandStarListUI.a.this.aG(), paramView.eAr, null, paramView.hKs, -1, (AppBrandStatObject)localObject, null);
          }
        }
        GMTrace.o(10540789268480L, 78535);
      }
      
      public final boolean onLongClick(View paramView)
      {
        GMTrace.i(10540923486208L, 78536);
        if (AppBrandStarListUI.a.this.iBY)
        {
          GMTrace.o(10540923486208L, 78536);
          return false;
        }
        paramView = AppBrandStarListUI.a.this;
        paramView.iBY = true;
        paramView.iBS.post(new AppBrandStarListUI.a.2(paramView));
        GMTrace.o(10540923486208L, 78536);
        return true;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandStarListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */