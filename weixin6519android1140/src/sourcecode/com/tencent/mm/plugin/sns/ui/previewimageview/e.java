package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.ui.w.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class e
  implements com.tencent.mm.plugin.sns.ui.w
{
  private Context context;
  TextView pSP;
  private ImageView qds;
  public View qnA;
  ImageView qnB;
  private View qnC;
  Rect qnD;
  private boolean qnv;
  public c qnw;
  DynamicGridView qnx;
  public w.a qny;
  public float qnz;
  
  public e(final View paramView1, View paramView2, View paramView3, final Context paramContext, List<String> paramList, final DynamicGridView paramDynamicGridView, w.a parama, c.a parama1, boolean paramBoolean)
  {
    GMTrace.i(15976741470208L, 119036);
    this.qnv = paramBoolean;
    this.context = paramContext;
    this.qny = parama;
    this.qnA = paramView2;
    this.qnC = paramView3;
    this.qnx = paramDynamicGridView;
    this.qnB = ((ImageView)paramView2.findViewById(i.f.pao));
    this.pSP = ((TextView)paramView2.findViewById(i.f.paq));
    paramDynamicGridView.qoa = false;
    paramDynamicGridView.setColumnWidth(paramContext.getResources().getDimensionPixelSize(i.d.oXt) + paramContext.getResources().getDimensionPixelSize(i.d.oXs) * 2);
    paramDynamicGridView.setNumColumns(4);
    paramDynamicGridView.setOverScrollMode(2);
    paramDynamicGridView.setStretchMode(0);
    paramDynamicGridView.setClipChildren(false);
    paramDynamicGridView.setClipToPadding(false);
    paramDynamicGridView.setSelector(new ColorDrawable(0));
    this.qnw = new c(paramContext, paramList, 9, paramBoolean, parama1);
    bqb();
    paramDynamicGridView.setAdapter(this.qnw);
    paramDynamicGridView.qoe = new DynamicGridView.e()
    {
      public final void bqe()
      {
        GMTrace.i(15969762148352L, 118984);
        e locale = e.this;
        ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(locale.qnA, "translationY", new float[] { 0.0F, locale.qnA.getHeight() });
        localObjectAnimator.setDuration(200L);
        localObjectAnimator.addListener(new e.7(locale));
        localObjectAnimator.start();
        e.this.qnw.bpZ();
        GMTrace.o(15969762148352L, 118984);
      }
      
      public final void k(Rect paramAnonymousRect)
      {
        GMTrace.i(15969627930624L, 118983);
        if (l(paramAnonymousRect))
        {
          paramAnonymousRect = e.this;
          paramAnonymousRect.qnA.setBackgroundColor(Color.parseColor("#ce3c39"));
          paramAnonymousRect.qnB.setImageResource(i.i.phv);
          paramAnonymousRect.pSP.setText("松手即可删除");
          GMTrace.o(15969627930624L, 118983);
          return;
        }
        e.this.bqd();
        GMTrace.o(15969627930624L, 118983);
      }
      
      public final boolean l(Rect paramAnonymousRect)
      {
        GMTrace.i(15969896366080L, 118985);
        e locale = e.this;
        if (paramAnonymousRect == null)
        {
          GMTrace.o(15969896366080L, 118985);
          return false;
        }
        if (locale.qnD == null) {
          locale.qnD = new Rect(locale.qnA.getLeft(), locale.qnA.getTop(), locale.qnA.getRight(), locale.qnA.getBottom());
        }
        com.tencent.mm.sdk.platformtools.w.d("DynamicGrid", "del area " + locale.qnD + ", test rect " + paramAnonymousRect);
        boolean bool = locale.qnD.intersects(paramAnonymousRect.left, paramAnonymousRect.top, paramAnonymousRect.right, paramAnonymousRect.bottom);
        GMTrace.o(15969896366080L, 118985);
        return bool;
      }
      
      public final void vE(int paramAnonymousInt)
      {
        GMTrace.i(15969359495168L, 118981);
        com.tencent.mm.sdk.platformtools.w.i("DynamicGrid", "drag started at position " + paramAnonymousInt);
        if (Build.VERSION.SDK_INT >= 21)
        {
          e.this.qnz = paramDynamicGridView.getElevation();
          paramDynamicGridView.setElevation(100.0F);
        }
        for (;;)
        {
          Object localObject = e.this;
          ((e)localObject).qnA.setVisibility(0);
          localObject = ObjectAnimator.ofFloat(((e)localObject).qnA, "translationY", new float[] { ((e)localObject).qnA.getHeight(), 0.0F });
          ((ObjectAnimator)localObject).setDuration(200L);
          ((ObjectAnimator)localObject).start();
          e.this.bqc();
          GMTrace.o(15969359495168L, 118981);
          return;
          paramDynamicGridView.bringToFront();
        }
      }
      
      public final void vF(int paramAnonymousInt)
      {
        GMTrace.i(15969493712896L, 118982);
        com.tencent.mm.sdk.platformtools.w.i("DynamicGrid", "drag to del " + paramAnonymousInt);
        c localc = e.this.qnw;
        Object localObject = localc.getItem(paramAnonymousInt);
        localc.dw.remove(localObject);
        localc.qno.remove(localObject);
        localc.notifyDataSetChanged();
        if (localc.qnt != null)
        {
          int i = localc.qnp;
          localc.qnt.removeItem(paramAnonymousInt - i);
        }
        GMTrace.o(15969493712896L, 118982);
      }
    };
    paramDynamicGridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(15990163243008L, 119136);
        GMTrace.o(15990163243008L, 119136);
        return true;
      }
    });
    paramDynamicGridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(15974593986560L, 119020);
        if (e.this.qny != null)
        {
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(15974593986560L, 119020);
            return;
          }
          paramAnonymousInt = ((Integer)paramAnonymousView.getTag()).intValue();
          com.tencent.mm.sdk.platformtools.w.i("DynamicGrid", "click " + paramAnonymousInt);
          if (paramAnonymousInt == Integer.MAX_VALUE)
          {
            GMTrace.o(15974593986560L, 119020);
            return;
          }
          e.this.qny.ve(paramAnonymousInt);
        }
        GMTrace.o(15974593986560L, 119020);
      }
    });
    paramDynamicGridView.qod = new DynamicGridView.f()
    {
      public final void bqf()
      {
        GMTrace.i(15969091059712L, 118979);
        DynamicGridView localDynamicGridView = paramDynamicGridView;
        localDynamicGridView.kHI = false;
        localDynamicGridView.requestDisallowInterceptTouchEvent(false);
        if ((DynamicGridView.bqk()) && (localDynamicGridView.qoa)) {
          localDynamicGridView.ih(true);
        }
        if (Build.VERSION.SDK_INT >= 21)
        {
          paramDynamicGridView.setElevation(e.this.qnz);
          GMTrace.o(15969091059712L, 118979);
          return;
        }
        paramView1.bringToFront();
        GMTrace.o(15969091059712L, 118979);
      }
    };
    paramDynamicGridView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(15981707526144L, 119073);
        paramDynamicGridView.getViewTreeObserver().removeOnPreDrawListener(this);
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramDynamicGridView.getLayoutParams();
        int i = paramContext.getResources().getDimensionPixelSize(i.d.oXr);
        int j = paramContext.getResources().getDimensionPixelSize(i.d.oXs);
        localMarginLayoutParams.setMargins(localMarginLayoutParams.leftMargin, paramView1.getHeight() - (i + j * 2), localMarginLayoutParams.rightMargin, localMarginLayoutParams.bottomMargin);
        paramDynamicGridView.setLayoutParams(localMarginLayoutParams);
        GMTrace.o(15981707526144L, 119073);
        return true;
      }
    });
    GMTrace.o(15976741470208L, 119036);
  }
  
  private void bqb()
  {
    GMTrace.i(15976875687936L, 119037);
    if ((ab.bPV().getBoolean("key_show_tips", true)) && (this.qnw.bqa() > 1))
    {
      this.qnC.setVisibility(0);
      this.qds = ((ImageView)this.qnC.findViewById(i.f.pcX));
      this.qds.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15976607252480L, 119035);
          e.this.bqc();
          GMTrace.o(15976607252480L, 119035);
        }
      });
      GMTrace.o(15976875687936L, 119037);
      return;
    }
    this.qnC.setVisibility(8);
    GMTrace.o(15976875687936L, 119037);
  }
  
  public final void a(w.a parama)
  {
    GMTrace.i(15977144123392L, 119039);
    this.qny = parama;
    GMTrace.o(15977144123392L, 119039);
  }
  
  public final void bD(List<String> paramList)
  {
    GMTrace.i(15977412558848L, 119041);
    if (this.qnw != null)
    {
      this.qnw.bI(paramList);
      bqb();
    }
    GMTrace.o(15977412558848L, 119041);
  }
  
  public final void bnx()
  {
    GMTrace.i(15977009905664L, 119038);
    this.qnv = false;
    GMTrace.o(15977009905664L, 119038);
  }
  
  public final void bqc()
  {
    GMTrace.i(16044387205120L, 119540);
    this.qnC.setVisibility(8);
    ab.bPV().edit().putBoolean("key_show_tips", false).commit();
    GMTrace.o(16044387205120L, 119540);
  }
  
  public final void bqd()
  {
    GMTrace.i(16044521422848L, 119541);
    this.qnA.setBackgroundColor(Color.parseColor("#e64340"));
    this.qnB.setImageResource(i.i.phu);
    this.pSP.setText("拖动到此处删除");
    GMTrace.o(16044521422848L, 119541);
  }
  
  public final void clean()
  {
    GMTrace.i(15977546776576L, 119042);
    if ((this.qnx != null) && (this.qnx.getAdapter() == null)) {
      ((c)this.qnx.getAdapter()).pVE = true;
    }
    GMTrace.o(15977546776576L, 119042);
  }
  
  public final View getView()
  {
    GMTrace.i(15977278341120L, 119040);
    DynamicGridView localDynamicGridView = this.qnx;
    GMTrace.o(15977278341120L, 119040);
    return localDynamicGridView;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\previewimageview\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */