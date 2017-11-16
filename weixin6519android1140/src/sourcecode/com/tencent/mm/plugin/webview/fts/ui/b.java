package com.tencent.mm.plugin.webview.fts.ui;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.fts.c.a;
import com.tencent.mm.plugin.webview.fts.c.b.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.ui.widget.MMWebView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  private MMWebView inX;
  List<a> iwu;
  public int iwv;
  public float[] iww;
  View iwx;
  public int iwz;
  public ae mHandler;
  public a rDI;
  b.b rDJ;
  
  @SuppressLint({"ClickableViewAccessibility"})
  public b(MMWebView paramMMWebView, b.b paramb)
  {
    GMTrace.i(20464848076800L, 152475);
    this.iwv = -1;
    this.iwz = -1;
    this.inX = paramMMWebView;
    this.mHandler = new ae(Looper.getMainLooper());
    this.iwu = new LinkedList();
    this.iwx = new View(paramMMWebView.getContext());
    this.rDJ = paramb;
    GMTrace.o(20464848076800L, 152475);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20466056036352L, 152484);
    paramView = new a(paramView, paramInt1, paramInt2, paramInt3);
    this.iwu.add(paramView);
    GMTrace.o(20466056036352L, 152484);
  }
  
  private List<a> b(a parama)
  {
    GMTrace.i(20465519165440L, 152480);
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
    GMTrace.o(20465519165440L, 152480);
    return localLinkedList;
  }
  
  private int bu(int paramInt1, int paramInt2)
  {
    GMTrace.i(20465653383168L, 152481);
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
      GMTrace.o(20465653383168L, 152481);
      return i;
    }
  }
  
  final void a(a parama)
  {
    GMTrace.i(20465384947712L, 152479);
    this.iwu.removeAll(b(parama));
    GMTrace.o(20465384947712L, 152479);
  }
  
  public final boolean a(int paramInt1, float[] paramArrayOfFloat, int paramInt2)
  {
    GMTrace.i(20465250729984L, 152478);
    if (jt(paramInt1))
    {
      GMTrace.o(20465250729984L, 152478);
      return true;
    }
    a locala = xr(paramInt1);
    if (locala == null)
    {
      GMTrace.o(20465250729984L, 152478);
      return false;
    }
    View localView = (View)locala.iwG.get();
    ViewGroup localViewGroup = jm(locala.iwH);
    if (localViewGroup == null)
    {
      GMTrace.o(20465250729984L, 152478);
      return false;
    }
    if ((paramInt2 >= 0) && (paramInt2 != Integer.MAX_VALUE)) {
      if (paramInt2 != 0) {
        break label131;
      }
    }
    label131:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      if ((paramArrayOfFloat != null) && (paramArrayOfFloat.length >= 5)) {
        break;
      }
      GMTrace.o(20465250729984L, 152478);
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
        GMTrace.o(20465250729984L, 152478);
        return true;
      }
      a(locala);
      GMTrace.o(20465250729984L, 152478);
      return false;
    }
    paramArrayOfFloat = localView.getLayoutParams();
    if (f3 != Float.MAX_VALUE) {
      paramArrayOfFloat.width = ((int)f3);
    }
    if (f4 != Float.MAX_VALUE) {
      paramArrayOfFloat.height = ((int)f4);
    }
    if (f1 != Float.MAX_VALUE) {
      localView.setX(f1);
    }
    if (f2 != Float.MAX_VALUE) {
      localView.setY(f2);
    }
    localView.requestLayout();
    a(localView, paramInt1, locala.iwH, i);
    paramInt1 = localViewGroup.indexOfChild(this.iwx);
    if ((localViewGroup.indexOfChild(localView) == -1) && (paramInt1 != -1))
    {
      localViewGroup.addView(localView, paramInt1);
      localViewGroup.removeView(this.iwx);
    }
    GMTrace.o(20465250729984L, 152478);
    return true;
  }
  
  public final boolean a(View paramView, int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3)
  {
    GMTrace.i(20464982294528L, 152476);
    if ((paramView == null) || (paramArrayOfFloat == null) || (paramArrayOfFloat.length < 5))
    {
      GMTrace.o(20464982294528L, 152476);
      return false;
    }
    ViewGroup localViewGroup = jm(paramInt2);
    if (localViewGroup == null)
    {
      GMTrace.o(20464982294528L, 152476);
      return false;
    }
    if (jr(paramInt1) != null)
    {
      GMTrace.o(20464982294528L, 152476);
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
      if ((paramInt3 != Integer.MAX_VALUE) && (paramInt3 >= 0)) {
        if (paramInt3 != 0) {
          break label225;
        }
      }
      label225:
      for (paramInt3 = 0;; paramInt3 = 8)
      {
        paramView.setVisibility(paramInt3);
        localViewGroup.addView(paramView, i, paramArrayOfFloat);
        paramView.setX(f1);
        paramView.setY(f2);
        a(paramView, paramInt1, paramInt2, k);
        GMTrace.o(20464982294528L, 152476);
        return true;
      }
    }
  }
  
  final ViewGroup jm(int paramInt)
  {
    GMTrace.i(20465116512256L, 152477);
    if (paramInt == 0)
    {
      localObject = this.inX.getTopView();
      if ((localObject instanceof AbsoluteLayout))
      {
        GMTrace.o(20465116512256L, 152477);
        return (ViewGroup)localObject;
      }
      GMTrace.o(20465116512256L, 152477);
      return null;
    }
    Object localObject = xr(paramInt);
    if (localObject == null)
    {
      GMTrace.o(20465116512256L, 152477);
      return null;
    }
    localObject = (View)((a)localObject).iwG.get();
    if ((localObject instanceof ViewGroup))
    {
      localObject = (ViewGroup)localObject;
      GMTrace.o(20465116512256L, 152477);
      return (ViewGroup)localObject;
    }
    GMTrace.o(20465116512256L, 152477);
    return null;
  }
  
  public final View jr(int paramInt)
  {
    GMTrace.i(20465921818624L, 152483);
    Object localObject = xr(paramInt);
    if (localObject == null)
    {
      GMTrace.o(20465921818624L, 152483);
      return null;
    }
    localObject = (View)((a)localObject).iwG.get();
    GMTrace.o(20465921818624L, 152483);
    return (View)localObject;
  }
  
  public final boolean jt(int paramInt)
  {
    GMTrace.i(20466190254080L, 152485);
    if ((this.iwz == paramInt) || (this.iwv == paramInt))
    {
      GMTrace.o(20466190254080L, 152485);
      return true;
    }
    GMTrace.o(20466190254080L, 152485);
    return false;
  }
  
  public final boolean jv(int paramInt)
  {
    GMTrace.i(20466324471808L, 152486);
    if (paramInt != this.iwv)
    {
      GMTrace.o(20466324471808L, 152486);
      return false;
    }
    if (xr(paramInt) == null)
    {
      GMTrace.o(20466324471808L, 152486);
      return false;
    }
    this.rDJ.bCb();
    GMTrace.o(20466324471808L, 152486);
    return true;
  }
  
  public final a xr(int paramInt)
  {
    GMTrace.i(20465787600896L, 152482);
    Iterator localIterator = this.iwu.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.id == paramInt)
      {
        GMTrace.o(20465787600896L, 152482);
        return locala;
      }
    }
    GMTrace.o(20465787600896L, 152482);
    return null;
  }
  
  private static final class a
  {
    int id;
    public WeakReference<View> iwG;
    int iwH;
    int z;
    
    public a(View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(20460016238592L, 152439);
      this.iwG = new WeakReference(paramView);
      this.id = paramInt1;
      this.iwH = paramInt2;
      this.z = paramInt3;
      GMTrace.o(20460016238592L, 152439);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */