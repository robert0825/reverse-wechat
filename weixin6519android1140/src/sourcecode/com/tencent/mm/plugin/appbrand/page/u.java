package com.tencent.mm.plugin.appbrand.page;

import android.graphics.PointF;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView;
import com.tencent.mm.plugin.appbrand.widget.b.a;
import com.tencent.mm.plugin.appbrand.widget.b.b;
import com.tencent.mm.plugin.appbrand.widget.b.f.a;
import com.tencent.mm.plugin.appbrand.widget.input.ab;
import com.tencent.mm.plugin.appbrand.widget.input.ab.a;
import com.tencent.mm.plugin.appbrand.widget.input.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class u
{
  c ivt;
  private ViewGroup iwt;
  List<a> iwu;
  int iwv;
  float[] iww;
  View iwx;
  public y iwy;
  int iwz;
  public ae mHandler;
  
  public u(final ViewGroup paramViewGroup)
  {
    GMTrace.i(20758248030208L, 154661);
    this.iwv = -1;
    this.iwz = -1;
    this.iwt = paramViewGroup;
    this.mHandler = new ae(Looper.getMainLooper());
    this.iwu = new LinkedList();
    this.iwx = new View(paramViewGroup.getContext());
    paramViewGroup = new ab(this.iwt);
    this.iwt.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(15456379338752L, 115159);
        if (paramAnonymousMotionEvent.getAction() != 0) {
          com.tencent.mm.plugin.appbrand.jsapi.j.c.a((ViewGroup)paramAnonymousView, paramAnonymousMotionEvent);
        }
        ab localab = paramViewGroup;
        com.tencent.mm.plugin.appbrand.widget.b.f localf;
        Object localObject;
        label116:
        boolean bool1;
        label127:
        View localView;
        int j;
        int i;
        if (paramAnonymousMotionEvent != null)
        {
          paramAnonymousView = (e)localab.iOd.ca(localab.iNZ);
          if (paramAnonymousView != null)
          {
            localf = paramAnonymousView.iLk;
            if (localf.iKx.onFilterTouchEventForSecurity(paramAnonymousMotionEvent)) {
              if (paramAnonymousMotionEvent.getActionMasked() == 0)
              {
                localObject = new com.tencent.mm.plugin.appbrand.widget.b.c(localf.iKx);
                if (paramAnonymousMotionEvent.getActionMasked() != 0) {
                  break label383;
                }
                paramAnonymousView = new f.a(paramAnonymousMotionEvent.getDownTime(), paramAnonymousMotionEvent.getEventTime());
                localf.iKz = paramAnonymousView;
                paramAnonymousView = null;
                bool1 = false;
                if (!((Iterator)localObject).hasNext()) {
                  break label430;
                }
                localView = (View)((Iterator)localObject).next();
                j = paramAnonymousMotionEvent.getActionIndex();
                if (!localf.iKx.isMotionEventSplittingEnabled()) {
                  break label388;
                }
                i = 1 << paramAnonymousMotionEvent.getPointerId(j);
                label176:
                float f1 = paramAnonymousMotionEvent.getX(j);
                float f2 = paramAnonymousMotionEvent.getY(j);
                if (paramAnonymousMotionEvent.getActionMasked() != 0) {
                  break label409;
                }
                if ((localView.getVisibility() != 0) && (localView.getAnimation() == null)) {
                  break label394;
                }
                j = 1;
                label217:
                if (j == 0) {
                  break label398;
                }
                Boolean localBoolean = (Boolean)com.tencent.mm.plugin.appbrand.n.f.a("isTransformedTouchPointInView", localf.iKx, new Class[] { Float.TYPE, Float.TYPE, View.class, PointF.class }, new Object[] { Float.valueOf(f1), Float.valueOf(f2), localView, null }, Boolean.valueOf(false));
                if ((localBoolean == null) || (!localBoolean.booleanValue())) {
                  break label400;
                }
                j = 1;
                label311:
                if ((j == 0) || ((paramAnonymousView != null) && (!a.bM(localView)))) {
                  break label404;
                }
                if (!a.a(localf.iKx, paramAnonymousMotionEvent, localView, i)) {
                  break label745;
                }
                if (paramAnonymousView != null) {
                  break label406;
                }
                paramAnonymousView = localView;
                label351:
                localf.iKy.addLast(localView);
                bool1 |= true;
              }
            }
          }
        }
        label383:
        label388:
        label394:
        label398:
        label400:
        label404:
        label406:
        label409:
        label430:
        label543:
        label577:
        label662:
        label735:
        label745:
        for (;;)
        {
          break label127;
          localObject = localf.iKy.iterator();
          break;
          paramAnonymousView = null;
          break label116;
          i = -1;
          break label176;
          j = 0;
          break label217;
          break label127;
          j = 0;
          break label311;
          break label127;
          break label351;
          bool1 |= a.a(localf.iKx, paramAnonymousMotionEvent, localView, i);
          break label127;
          boolean bool2 = bool1;
          switch (paramAnonymousMotionEvent.getActionMasked())
          {
          default: 
            bool2 = bool1;
          case 2: 
            b.a("MicroMsg.AppBrand.InputTouchDuplicateDispatcher", "[textscroll] handled | " + bool2, paramAnonymousMotionEvent);
            if (2 == paramAnonymousMotionEvent.getActionMasked())
            {
              if ((bool2) && (!localab.iOa))
              {
                paramAnonymousView = (r)localab.iOe.ca(localab.iNZ);
                if (paramAnonymousView != null)
                {
                  if (paramAnonymousView.ivH) {
                    break;
                  }
                  bool1 = true;
                  localab.iOb = bool1;
                  paramAnonymousView.ct(false);
                  paramAnonymousView.requestDisallowInterceptTouchEvent(true);
                  localab.iOa = true;
                }
              }
              if (!bool2) {
                break label662;
              }
              localab.iOc = true;
            }
            else
            {
              bool1 = bool2;
              switch (paramAnonymousMotionEvent.getActionMasked())
              {
              default: 
                bool1 = bool2;
              }
            }
            break;
          }
          for (;;)
          {
            if (!bool1) {
              break label735;
            }
            GMTrace.o(15456379338752L, 115159);
            return true;
            localf.iKy.clear();
            bool2 = bool1;
            break;
            bool2 = false;
            break;
            bool1 = false;
            break label543;
            if (!localab.iOc) {
              break label577;
            }
            localab.iOc = false;
            break label577;
            if (localab.iOa)
            {
              paramAnonymousView = (r)localab.iOe.ca(localab.iNZ);
              if (paramAnonymousView != null) {
                paramAnonymousView.ct(localab.iOb);
              }
              localab.iOa = false;
            }
            bool1 = false;
            continue;
            bool1 = false;
          }
          GMTrace.o(15456379338752L, 115159);
          return false;
        }
      }
    });
    GMTrace.o(20758248030208L, 154661);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(19893483208704L, 148218);
    paramView = new a(paramView, paramInt1, paramInt2, paramInt3);
    this.iwu.add(paramView);
    GMTrace.o(19893483208704L, 148218);
  }
  
  private void a(a parama)
  {
    GMTrace.i(15461211176960L, 115195);
    this.iwu.removeAll(b(parama));
    GMTrace.o(15461211176960L, 115195);
  }
  
  private List<a> b(a parama)
  {
    GMTrace.i(15461345394688L, 115196);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.iwu.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.iwH == parama.id) {
        localLinkedList.addAll(b(locala));
      }
    }
    localLinkedList.add(parama);
    GMTrace.o(15461345394688L, 115196);
    return localLinkedList;
  }
  
  private int bu(int paramInt1, int paramInt2)
  {
    GMTrace.i(19893348990976L, 148217);
    Iterator localIterator = this.iwu.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if ((paramInt1 != locala.iwH) || (paramInt2 < locala.z)) {
        break label78;
      }
      i += 1;
    }
    label78:
    for (;;)
    {
      break;
      GMTrace.o(19893348990976L, 148217);
      return i;
    }
  }
  
  public final boolean a(final int paramInt1, final y paramy, final int paramInt2)
  {
    GMTrace.i(20758382247936L, 154662);
    paramy = new bb(Boolean.valueOf(false), paramInt1) {};
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      bool = ((Boolean)paramy.b(null)).booleanValue();
      GMTrace.o(20758382247936L, 154662);
      return bool;
    }
    boolean bool = ((Boolean)paramy.b(this.mHandler)).booleanValue();
    GMTrace.o(20758382247936L, 154662);
    return bool;
  }
  
  public final boolean a(int paramInt1, float[] paramArrayOfFloat, int paramInt2)
  {
    GMTrace.i(20370627231744L, 151773);
    if (jt(paramInt1))
    {
      GMTrace.o(20370627231744L, 151773);
      return true;
    }
    a locala = jp(paramInt1);
    if (locala == null)
    {
      GMTrace.o(20370627231744L, 151773);
      return false;
    }
    View localView = (View)locala.iwG.get();
    ViewGroup localViewGroup = jm(locala.iwH);
    if (localViewGroup == null)
    {
      GMTrace.o(20370627231744L, 151773);
      return false;
    }
    if (paramInt2 >= 0) {
      if (paramInt2 != 0) {
        break label125;
      }
    }
    label125:
    for (int i = 0;; i = 4)
    {
      localView.setVisibility(i);
      if ((paramArrayOfFloat != null) && (paramArrayOfFloat.length >= 5)) {
        break;
      }
      GMTrace.o(20370627231744L, 151773);
      return true;
    }
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = paramArrayOfFloat[3];
    i = (int)paramArrayOfFloat[4];
    this.iwu.remove(locala);
    if (locala.z != i)
    {
      localViewGroup.removeView(localView);
      if (a(localView, paramInt1, locala.iwH, paramArrayOfFloat, paramInt2))
      {
        GMTrace.o(20370627231744L, 151773);
        return true;
      }
      a(locala);
      GMTrace.o(20370627231744L, 151773);
      return false;
    }
    paramArrayOfFloat = localView.getLayoutParams();
    paramArrayOfFloat.width = ((int)f3);
    paramArrayOfFloat.height = ((int)f4);
    localView.setX(f1);
    localView.setY(f2);
    localView.requestLayout();
    a(localView, paramInt1, locala.iwH, i);
    paramInt1 = localViewGroup.indexOfChild(this.iwx);
    if ((localViewGroup.indexOfChild(localView) == -1) && (paramInt1 != -1))
    {
      localViewGroup.addView(localView, paramInt1);
      localViewGroup.removeView(this.iwx);
    }
    GMTrace.o(20370627231744L, 151773);
    return true;
  }
  
  public final boolean a(View paramView, int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3)
  {
    GMTrace.i(20370493014016L, 151772);
    if ((paramView == null) || (paramArrayOfFloat == null) || (paramArrayOfFloat.length < 5))
    {
      GMTrace.o(20370493014016L, 151772);
      return false;
    }
    ViewGroup localViewGroup = jm(paramInt2);
    if (localViewGroup == null)
    {
      GMTrace.o(20370493014016L, 151772);
      return false;
    }
    if (jr(paramInt1) != null)
    {
      GMTrace.o(20370493014016L, 151772);
      return false;
    }
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = paramArrayOfFloat[3];
    int k = (int)paramArrayOfFloat[4];
    paramArrayOfFloat = new ViewGroup.LayoutParams((int)f3, (int)f4);
    int j = bu(paramInt2, k);
    int i = j;
    if (j < 0) {
      i = 0;
    }
    if (i > localViewGroup.getChildCount()) {
      i = localViewGroup.getChildCount();
    }
    for (;;)
    {
      if (paramInt3 >= 0) {
        if (paramInt3 != 0) {
          break label223;
        }
      }
      label223:
      for (paramInt3 = 0;; paramInt3 = 4)
      {
        paramView.setVisibility(paramInt3);
        localViewGroup.addView(paramView, i, paramArrayOfFloat);
        paramView.setX(f1);
        paramView.setY(f2);
        a(paramView, paramInt1, paramInt2, k);
        GMTrace.o(20370493014016L, 151772);
        return true;
      }
    }
  }
  
  final ViewGroup jm(int paramInt)
  {
    GMTrace.i(15460808523776L, 115192);
    if (paramInt == 0)
    {
      localObject = this.iwt;
      GMTrace.o(15460808523776L, 115192);
      return (ViewGroup)localObject;
    }
    Object localObject = jp(paramInt);
    if (localObject == null)
    {
      GMTrace.o(15460808523776L, 115192);
      return null;
    }
    localObject = (View)((a)localObject).iwG.get();
    if ((localObject instanceof AppBrandNativeContainerView))
    {
      localObject = (ViewGroup)localObject;
      GMTrace.o(15460808523776L, 115192);
      return (ViewGroup)localObject;
    }
    GMTrace.o(15460808523776L, 115192);
    return null;
  }
  
  public final boolean jn(final int paramInt)
  {
    GMTrace.i(15460942741504L, 115193);
    bb local4 = new bb(Boolean.valueOf(false), paramInt) {};
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      bool = ((Boolean)local4.b(null)).booleanValue();
      GMTrace.o(15460942741504L, 115193);
      return bool;
    }
    boolean bool = ((Boolean)local4.b(this.mHandler)).booleanValue();
    GMTrace.o(15460942741504L, 115193);
    return bool;
  }
  
  public final boolean jo(int paramInt)
  {
    GMTrace.i(19893214773248L, 148216);
    a locala = jp(paramInt);
    if (locala == null)
    {
      GMTrace.o(19893214773248L, 148216);
      return false;
    }
    jv(paramInt);
    a(locala);
    ViewGroup localViewGroup = jm(locala.iwH);
    if (localViewGroup != null)
    {
      this.iwu.remove(locala);
      localViewGroup.removeView((View)locala.iwG.get());
      GMTrace.o(19893214773248L, 148216);
      return true;
    }
    GMTrace.o(19893214773248L, 148216);
    return false;
  }
  
  public final a jp(int paramInt)
  {
    GMTrace.i(15461479612416L, 115197);
    Iterator localIterator = this.iwu.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.id == paramInt)
      {
        GMTrace.o(15461479612416L, 115197);
        return locala;
      }
    }
    GMTrace.o(15461479612416L, 115197);
    return null;
  }
  
  public final boolean jq(int paramInt)
  {
    GMTrace.i(15461613830144L, 115198);
    if (jp(paramInt) != null)
    {
      GMTrace.o(15461613830144L, 115198);
      return true;
    }
    GMTrace.o(15461613830144L, 115198);
    return false;
  }
  
  public final View jr(int paramInt)
  {
    GMTrace.i(15461748047872L, 115199);
    Object localObject = jp(paramInt);
    if (localObject == null)
    {
      GMTrace.o(15461748047872L, 115199);
      return null;
    }
    localObject = (View)((a)localObject).iwG.get();
    GMTrace.o(15461748047872L, 115199);
    return (View)localObject;
  }
  
  public final u.b js(int paramInt)
  {
    GMTrace.i(15461882265600L, 115200);
    u.b localb = com.tencent.mm.y.u.Av().gx(hashCode() + "#" + paramInt);
    GMTrace.o(15461882265600L, 115200);
    return localb;
  }
  
  public final boolean jt(int paramInt)
  {
    GMTrace.i(17297309696000L, 128875);
    if ((this.iwz == paramInt) || (this.iwv == paramInt))
    {
      GMTrace.o(17297309696000L, 128875);
      return true;
    }
    GMTrace.o(17297309696000L, 128875);
    return false;
  }
  
  public final boolean ju(final int paramInt)
  {
    GMTrace.i(20758516465664L, 154663);
    bb local8 = new bb(Boolean.valueOf(false), paramInt) {};
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      bool = ((Boolean)local8.b(null)).booleanValue();
      GMTrace.o(20758516465664L, 154663);
      return bool;
    }
    boolean bool = ((Boolean)local8.b(this.mHandler)).booleanValue();
    GMTrace.o(20758516465664L, 154663);
    return bool;
  }
  
  public final boolean jv(int paramInt)
  {
    GMTrace.i(17297443913728L, 128876);
    if (paramInt != this.iwv)
    {
      GMTrace.o(17297443913728L, 128876);
      return false;
    }
    if (jp(paramInt) == null)
    {
      GMTrace.o(17297443913728L, 128876);
      return false;
    }
    this.ivt.YZ();
    GMTrace.o(17297443913728L, 128876);
    return true;
  }
  
  public final u.b t(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(15462016483328L, 115201);
    u.b localb = com.tencent.mm.y.u.Av().p(hashCode() + "#" + paramInt, paramBoolean);
    GMTrace.o(15462016483328L, 115201);
    return localb;
  }
  
  private static final class a
  {
    int id;
    WeakReference<View> iwG;
    public int iwH;
    int z;
    
    public a(View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(19900462530560L, 148270);
      this.iwG = new WeakReference(paramView);
      this.id = paramInt1;
      this.iwH = paramInt2;
      this.z = paramInt3;
      GMTrace.o(19900462530560L, 148270);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */