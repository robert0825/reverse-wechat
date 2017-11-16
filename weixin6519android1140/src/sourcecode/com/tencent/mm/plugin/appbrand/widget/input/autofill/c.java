package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.i.a;
import com.tencent.mm.plugin.appbrand.widget.input.y;
import com.tencent.mm.ui.base.q;

public final class c
{
  final y iOD;
  public final e iOE;
  public final i.a iOQ;
  public AppBrandPageView iOR;
  public int iOS;
  boolean iOT;
  
  c(y paramy, e parame)
  {
    GMTrace.i(18260724547584L, 136053);
    this.iOQ = new i.a()
    {
      public final void acF()
      {
        GMTrace.i(18263945773056L, 136077);
        c.this.iOS = Integer.MIN_VALUE;
        c.this.kj(3);
        GMTrace.o(18263945773056L, 136077);
      }
      
      public final void acG()
      {
        GMTrace.i(18264079990784L, 136078);
        c.this.iOS = Integer.MIN_VALUE;
        c.this.kj(3);
        GMTrace.o(18264079990784L, 136078);
      }
    };
    this.iOS = Integer.MIN_VALUE;
    this.iOT = false;
    this.iOD = paramy;
    this.iOE = parame;
    GMTrace.o(18260724547584L, 136053);
  }
  
  public final void kj(final int paramInt)
  {
    GMTrace.i(18260858765312L, 136054);
    final AutoFillListPopupWindowBase.a locala = this.iOE.iOX;
    if (locala == null)
    {
      GMTrace.o(18260858765312L, 136054);
      return;
    }
    if (!this.iOE.hwd.isShowing())
    {
      GMTrace.o(18260858765312L, 136054);
      return;
    }
    if ((1 == paramInt) && (this.iOT))
    {
      this.iOS = Integer.MIN_VALUE;
      this.iOT = false;
    }
    locala.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(18260321894400L, 136050);
        locala.getViewTreeObserver().removeOnPreDrawListener(this);
        c localc = c.this;
        if ((!localc.iOE.hwd.isShowing()) || (localc.iOE.iOX == null) || (localc.iOE.iOX.getAdapter() == null) || (localc.iOE.iOX.getAdapter().getCount() <= 0)) {}
        Object localObject;
        do
        {
          GMTrace.o(18260321894400L, 136050);
          return true;
          localObject = localc.iOD.acl();
        } while (localObject == null);
        int m = a.fromDPToPix(localc.iOD.getContext(), 8);
        int n = localc.iOE.iOX.getChildAt(0).getHeight();
        int i = localc.iOE.iOX.getAdapter().getCount() * n;
        int k = i + m * 2;
        int j = n * 3 + m * 2;
        if (k > j) {
          i = j - m * 2;
        }
        for (;;)
        {
          localc.iOE.RN = j;
          int[] arrayOfInt = new int[2];
          localc.iOD.getView().getLocationInWindow(arrayOfInt);
          j = arrayOfInt[1] + localc.iOD.getView().getHeight();
          ((View)localObject).getLocationInWindow(arrayOfInt);
          k = arrayOfInt[1];
          label253:
          if (((localc.iOS == Integer.MIN_VALUE) || (localc.iOS >= 0 - m)) && (k - j >= i + m))
          {
            localc.iOE.RX = localc.iOD.getView();
            localc.iOE.RN = (i + m * 2);
            localc.iOE.setVerticalOffset(0 - m);
            label329:
            localc.iOE.show();
            localObject = localc.iOE;
            if (((AutoFillListPopupWindowBase)localObject).RR) {
              break label543;
            }
          }
          label543:
          for (i = 0;; i = ((AutoFillListPopupWindowBase)localObject).RP)
          {
            localc.iOS = i;
            break;
            if (j - localc.iOD.getView().getHeight() >= i)
            {
              localc.iOE.RX = localc.iOD.getView();
              localc.iOE.RN = (m * 2 + i);
              localc.iOE.setVerticalOffset(-(i + m) - localc.iOD.getView().getHeight());
              break label329;
            }
            if (i <= n)
            {
              localc.iOE.RN = n;
              localc.iOE.RX = localc.iOD.getView();
              if (localc.iOS < 0 - m)
              {
                localc.iOE.setVerticalOffset(-(i + m) - localc.iOD.getView().getHeight());
                break label329;
              }
              localc.iOE.setVerticalOffset(0 - m);
              break label329;
            }
            i -= n;
            break label253;
          }
          j = k;
        }
      }
    });
    GMTrace.o(18260858765312L, 136054);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\autofill\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */