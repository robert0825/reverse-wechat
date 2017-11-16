package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.text.Layout;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.Reference;
import java.util.Map;
import java.util.Set;

public class i
  implements AppBrandPageView.c
{
  private static final i iLV;
  private static final android.support.v4.e.a<AppBrandPageView, i> iMa;
  public final Map<a, i> iLU;
  public final int iLW;
  private final int iLX;
  public int iLY;
  private boolean iLZ;
  private final Runnable iMb;
  private final Runnable iMc;
  public final AppBrandPageView ibO;
  
  static
  {
    GMTrace.i(17637014765568L, 131406);
    iLV = new i()
    {
      public final void acC()
      {
        GMTrace.i(17637417418752L, 131409);
        GMTrace.o(17637417418752L, 131409);
      }
      
      public final void acD()
      {
        GMTrace.i(17637551636480L, 131410);
        GMTrace.o(17637551636480L, 131410);
      }
      
      public final void onDestroy()
      {
        GMTrace.i(17637685854208L, 131411);
        GMTrace.o(17637685854208L, 131411);
      }
      
      public final String toString()
      {
        GMTrace.i(17637820071936L, 131412);
        String str = super.toString() + "|DUMMY";
        GMTrace.o(17637820071936L, 131412);
        return str;
      }
    };
    iMa = new android.support.v4.e.a();
    GMTrace.o(17637014765568L, 131406);
  }
  
  public i()
  {
    GMTrace.i(17636075241472L, 131399);
    this.iLU = new android.support.v4.e.a();
    this.iLX = 5;
    this.iLY = 0;
    this.iLZ = false;
    this.iMb = new Runnable()
    {
      public final void run()
      {
        int i = 0;
        GMTrace.i(17633927757824L, 131383);
        if (!i.this.ibO.mRunning)
        {
          GMTrace.o(17633927757824L, 131383);
          return;
        }
        Object localObject = i.this.acB();
        if (localObject != null)
        {
          ((View)localObject).scrollTo(0, 0);
          localObject = i.this;
          if (((i)localObject).iLU.size() > 0)
          {
            i.a[] arrayOfa = new i.a[((i)localObject).iLU.size()];
            localObject = (i.a[])((i)localObject).iLU.keySet().toArray(arrayOfa);
            int j = localObject.length;
            while (i < j)
            {
              localObject[i].acG();
              i += 1;
            }
          }
        }
        GMTrace.o(17633927757824L, 131383);
      }
    };
    this.iMc = new Runnable()
    {
      private int acE()
      {
        GMTrace.i(17635269935104L, 131393);
        View localView = i.this.acB();
        if (localView != null)
        {
          int i = localView.getScrollY();
          GMTrace.o(17635269935104L, 131393);
          return i;
        }
        GMTrace.o(17635269935104L, 131393);
        return 0;
      }
      
      private void jZ(int paramAnonymousInt)
      {
        int i = 0;
        GMTrace.i(17635404152832L, 131394);
        w.d("MicroMsg.AppBrandInputPageOffsetHelper", "[TextAreaHeight] offsetRoot %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        Object localObject = i.this.acB();
        if (localObject != null)
        {
          ((View)localObject).scrollTo(0, paramAnonymousInt);
          localObject = i.this;
          if (((i)localObject).iLU.size() > 0)
          {
            i.a[] arrayOfa = new i.a[((i)localObject).iLU.size()];
            localObject = (i.a[])((i)localObject).iLU.keySet().toArray(arrayOfa);
            int j = localObject.length;
            paramAnonymousInt = i;
            while (paramAnonymousInt < j)
            {
              localObject[paramAnonymousInt].acF();
              paramAnonymousInt += 1;
            }
          }
        }
        GMTrace.o(17635404152832L, 131394);
      }
      
      public final void run()
      {
        GMTrace.i(17635135717376L, 131392);
        w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] offsetRunner enter");
        Object localObject2 = m.m(i.this.ibO);
        if (localObject2 == null)
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        if (!i.this.ibO.mRunning)
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        if ((((x)localObject2).acl() == null) || (((x)localObject2).ach() == null))
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        Object localObject1 = ((x)localObject2).ach();
        View localView = ((x)localObject2).acl();
        int i;
        int k;
        int j;
        int n;
        int m;
        if (!g.bI((View)localObject1)) {
          if (localView.getHeight() <= localView.getMinimumHeight())
          {
            w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panel height %d, tryCount %d", new Object[] { Integer.valueOf(localView.getHeight()), Integer.valueOf(i.this.iLY) });
            localObject1 = i.this;
            i = ((i)localObject1).iLY + 1;
            ((i)localObject1).iLY = i;
            if (i < 5)
            {
              i.this.cO(false);
              GMTrace.o(17635135717376L, 131392);
            }
          }
          else
          {
            i.this.iLY = 0;
            w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panelHeight %d", new Object[] { Integer.valueOf(localView.getHeight()) });
            int[] arrayOfInt = new int[2];
            ((EditText)localObject1).getLocationOnScreen(arrayOfInt);
            k = arrayOfInt[1];
            w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] inputHeight %d, inputTop %d, inputAttached %B", new Object[] { Integer.valueOf(((EditText)localObject1).getHeight()), Integer.valueOf(k), Boolean.valueOf(z.al((View)localObject1)) });
            Display localDisplay = ((WindowManager)i.this.ibO.iuf.getContext().getSystemService("window")).getDefaultDisplay();
            Point localPoint = new Point();
            localDisplay.getSize(localPoint);
            if (k <= localPoint.y)
            {
              j = k + ((EditText)localObject1).getHeight();
              localView.getLocationOnScreen(arrayOfInt);
              n = arrayOfInt[1];
              if ((!((y)localObject1).acL()) || (((EditText)localObject1).getLayout() == null)) {
                break label699;
              }
              i = k + ((y)localObject1).kf(((EditText)localObject1).getLayout().getLineForOffset(((EditText)localObject1).getSelectionStart()));
              m = k + ((y)localObject1).kf(((EditText)localObject1).getLayout().getLineForOffset(((EditText)localObject1).getSelectionStart()) + 1);
              if (i - k < ((EditText)localObject1).getHeight()) {
                break label696;
              }
              i = j - ((EditText)localObject1).getLineHeight();
              if (m - k < ((EditText)localObject1).getHeight()) {
                break label688;
              }
              k = j;
              j = i;
              i = k;
            }
          }
        }
        for (;;)
        {
          i += ((x)localObject2).acm();
          if (n < i)
          {
            i = Math.max(0, Math.min(i - n, j - i.this.iLW));
            localObject2 = i.this.ibO.ivj;
            if (localObject2 != null)
            {
              localView = ((t)localObject2).getView();
              if ((localView != null) && (localObject1 != null)) {}
            }
            else
            {
              GMTrace.o(17635135717376L, 131392);
              return;
            }
            if ((((y)localObject1).adi()) || (!((y)localObject1).acL()))
            {
              jZ(acE() + i);
              GMTrace.o(17635135717376L, 131392);
              return;
            }
            j = ((t)localObject2).getHeight();
            k = localView.getScrollY();
            m = c.jM(((t)localObject2).getContentHeight());
            ((EditText)localObject1).getHeight();
            ((EditText)localObject1).getTop();
            j = Math.max(0, Math.min(m - k - j, i));
            localView.scrollBy(localView.getScrollX(), j);
            jZ(i - j + acE());
          }
          GMTrace.o(17635135717376L, 131392);
          return;
          label688:
          j = i;
          i = m;
          continue;
          label696:
          break;
          label699:
          i = j;
          j = k;
        }
      }
    };
    this.ibO = null;
    this.iLW = 0;
    GMTrace.o(17636075241472L, 131399);
  }
  
  private i(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(17636209459200L, 131400);
    this.iLU = new android.support.v4.e.a();
    this.iLX = 5;
    this.iLY = 0;
    this.iLZ = false;
    this.iMb = new Runnable()
    {
      public final void run()
      {
        int i = 0;
        GMTrace.i(17633927757824L, 131383);
        if (!i.this.ibO.mRunning)
        {
          GMTrace.o(17633927757824L, 131383);
          return;
        }
        Object localObject = i.this.acB();
        if (localObject != null)
        {
          ((View)localObject).scrollTo(0, 0);
          localObject = i.this;
          if (((i)localObject).iLU.size() > 0)
          {
            i.a[] arrayOfa = new i.a[((i)localObject).iLU.size()];
            localObject = (i.a[])((i)localObject).iLU.keySet().toArray(arrayOfa);
            int j = localObject.length;
            while (i < j)
            {
              localObject[i].acG();
              i += 1;
            }
          }
        }
        GMTrace.o(17633927757824L, 131383);
      }
    };
    this.iMc = new Runnable()
    {
      private int acE()
      {
        GMTrace.i(17635269935104L, 131393);
        View localView = i.this.acB();
        if (localView != null)
        {
          int i = localView.getScrollY();
          GMTrace.o(17635269935104L, 131393);
          return i;
        }
        GMTrace.o(17635269935104L, 131393);
        return 0;
      }
      
      private void jZ(int paramAnonymousInt)
      {
        int i = 0;
        GMTrace.i(17635404152832L, 131394);
        w.d("MicroMsg.AppBrandInputPageOffsetHelper", "[TextAreaHeight] offsetRoot %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        Object localObject = i.this.acB();
        if (localObject != null)
        {
          ((View)localObject).scrollTo(0, paramAnonymousInt);
          localObject = i.this;
          if (((i)localObject).iLU.size() > 0)
          {
            i.a[] arrayOfa = new i.a[((i)localObject).iLU.size()];
            localObject = (i.a[])((i)localObject).iLU.keySet().toArray(arrayOfa);
            int j = localObject.length;
            paramAnonymousInt = i;
            while (paramAnonymousInt < j)
            {
              localObject[paramAnonymousInt].acF();
              paramAnonymousInt += 1;
            }
          }
        }
        GMTrace.o(17635404152832L, 131394);
      }
      
      public final void run()
      {
        GMTrace.i(17635135717376L, 131392);
        w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] offsetRunner enter");
        Object localObject2 = m.m(i.this.ibO);
        if (localObject2 == null)
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        if (!i.this.ibO.mRunning)
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        if ((((x)localObject2).acl() == null) || (((x)localObject2).ach() == null))
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        Object localObject1 = ((x)localObject2).ach();
        View localView = ((x)localObject2).acl();
        int i;
        int k;
        int j;
        int n;
        int m;
        if (!g.bI((View)localObject1)) {
          if (localView.getHeight() <= localView.getMinimumHeight())
          {
            w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panel height %d, tryCount %d", new Object[] { Integer.valueOf(localView.getHeight()), Integer.valueOf(i.this.iLY) });
            localObject1 = i.this;
            i = ((i)localObject1).iLY + 1;
            ((i)localObject1).iLY = i;
            if (i < 5)
            {
              i.this.cO(false);
              GMTrace.o(17635135717376L, 131392);
            }
          }
          else
          {
            i.this.iLY = 0;
            w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panelHeight %d", new Object[] { Integer.valueOf(localView.getHeight()) });
            int[] arrayOfInt = new int[2];
            ((EditText)localObject1).getLocationOnScreen(arrayOfInt);
            k = arrayOfInt[1];
            w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] inputHeight %d, inputTop %d, inputAttached %B", new Object[] { Integer.valueOf(((EditText)localObject1).getHeight()), Integer.valueOf(k), Boolean.valueOf(z.al((View)localObject1)) });
            Display localDisplay = ((WindowManager)i.this.ibO.iuf.getContext().getSystemService("window")).getDefaultDisplay();
            Point localPoint = new Point();
            localDisplay.getSize(localPoint);
            if (k <= localPoint.y)
            {
              j = k + ((EditText)localObject1).getHeight();
              localView.getLocationOnScreen(arrayOfInt);
              n = arrayOfInt[1];
              if ((!((y)localObject1).acL()) || (((EditText)localObject1).getLayout() == null)) {
                break label699;
              }
              i = k + ((y)localObject1).kf(((EditText)localObject1).getLayout().getLineForOffset(((EditText)localObject1).getSelectionStart()));
              m = k + ((y)localObject1).kf(((EditText)localObject1).getLayout().getLineForOffset(((EditText)localObject1).getSelectionStart()) + 1);
              if (i - k < ((EditText)localObject1).getHeight()) {
                break label696;
              }
              i = j - ((EditText)localObject1).getLineHeight();
              if (m - k < ((EditText)localObject1).getHeight()) {
                break label688;
              }
              k = j;
              j = i;
              i = k;
            }
          }
        }
        for (;;)
        {
          i += ((x)localObject2).acm();
          if (n < i)
          {
            i = Math.max(0, Math.min(i - n, j - i.this.iLW));
            localObject2 = i.this.ibO.ivj;
            if (localObject2 != null)
            {
              localView = ((t)localObject2).getView();
              if ((localView != null) && (localObject1 != null)) {}
            }
            else
            {
              GMTrace.o(17635135717376L, 131392);
              return;
            }
            if ((((y)localObject1).adi()) || (!((y)localObject1).acL()))
            {
              jZ(acE() + i);
              GMTrace.o(17635135717376L, 131392);
              return;
            }
            j = ((t)localObject2).getHeight();
            k = localView.getScrollY();
            m = c.jM(((t)localObject2).getContentHeight());
            ((EditText)localObject1).getHeight();
            ((EditText)localObject1).getTop();
            j = Math.max(0, Math.min(m - k - j, i));
            localView.scrollBy(localView.getScrollX(), j);
            jZ(i - j + acE());
          }
          GMTrace.o(17635135717376L, 131392);
          return;
          label688:
          j = i;
          i = m;
          continue;
          label696:
          break;
          label699:
          i = j;
          j = k;
        }
      }
    };
    this.ibO = paramAppBrandPageView;
    this.ibO.a(this);
    int j = com.tencent.mm.br.a.fromDPToPix(paramAppBrandPageView.mContext, 10);
    if (Build.VERSION.SDK_INT >= 21) {
      i = g.aaN();
    }
    this.iLW = (i + j);
    GMTrace.o(17636209459200L, 131400);
  }
  
  public static i a(Reference<AppBrandPageView> paramReference)
  {
    GMTrace.i(17636343676928L, 131401);
    if (paramReference == null) {}
    for (paramReference = null;; paramReference = (AppBrandPageView)paramReference.get())
    {
      paramReference = h(paramReference);
      GMTrace.o(17636343676928L, 131401);
      return paramReference;
    }
  }
  
  public static i h(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(18281259859968L, 136206);
    if ((paramAppBrandPageView == null) || (!paramAppBrandPageView.mRunning))
    {
      w.j("MicroMsg.AppBrandInputPageOffsetHelper", " obtain with invalid page " + paramAppBrandPageView, new Object[0]);
      paramAppBrandPageView = iLV;
      GMTrace.o(18281259859968L, 136206);
      return paramAppBrandPageView;
    }
    i locali2 = (i)iMa.get(paramAppBrandPageView);
    i locali1 = locali2;
    if (locali2 == null)
    {
      locali1 = new i(paramAppBrandPageView);
      iMa.put(paramAppBrandPageView, locali1);
    }
    GMTrace.o(18281259859968L, 136206);
    return locali1;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(18281125642240L, 136205);
    if (parama == null)
    {
      GMTrace.o(18281125642240L, 136205);
      return;
    }
    this.iLU.remove(parama);
    GMTrace.o(18281125642240L, 136205);
  }
  
  public final View acB()
  {
    GMTrace.i(17636477894656L, 131402);
    if (!this.ibO.mRunning)
    {
      GMTrace.o(17636477894656L, 131402);
      return null;
    }
    FrameLayout localFrameLayout = this.ibO.iui;
    GMTrace.o(17636477894656L, 131402);
    return localFrameLayout;
  }
  
  public void acC()
  {
    GMTrace.i(17636612112384L, 131403);
    cO(true);
    GMTrace.o(17636612112384L, 131403);
  }
  
  public void acD()
  {
    GMTrace.i(17636746330112L, 131404);
    if (!this.ibO.mRunning)
    {
      GMTrace.o(17636746330112L, 131404);
      return;
    }
    this.iLZ = true;
    this.ibO.iuf.post(this.iMb);
    GMTrace.o(17636746330112L, 131404);
  }
  
  public final void cO(boolean paramBoolean)
  {
    GMTrace.i(18281394077696L, 136207);
    if (paramBoolean)
    {
      this.iLY = 0;
      this.iLZ = false;
    }
    if (!this.ibO.mRunning)
    {
      GMTrace.o(18281394077696L, 136207);
      return;
    }
    if (this.iLZ)
    {
      GMTrace.o(18281394077696L, 136207);
      return;
    }
    if (this.iLY == 0)
    {
      w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] post, attached %B", new Object[] { Boolean.valueOf(z.al(this.ibO.iuf)) });
      this.ibO.iuf.post(this.iMc);
      GMTrace.o(18281394077696L, 136207);
      return;
    }
    w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] postOnAnimation, attached %B", new Object[] { Boolean.valueOf(z.al(this.ibO.iuf)) });
    this.ibO.iuf.postOnAnimation(this.iMc);
    GMTrace.o(18281394077696L, 136207);
  }
  
  public void onDestroy()
  {
    GMTrace.i(17636880547840L, 131405);
    this.ibO.b(this);
    iMa.remove(this.ibO);
    GMTrace.o(17636880547840L, 131405);
  }
  
  public static abstract interface a
  {
    public abstract void acF();
    
    public abstract void acG();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */