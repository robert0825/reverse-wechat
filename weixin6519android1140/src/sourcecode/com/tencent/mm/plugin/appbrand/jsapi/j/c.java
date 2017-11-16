package com.tencent.mm.plugin.appbrand.jsapi.j;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.f;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  public static void a(ViewGroup paramViewGroup, MotionEvent paramMotionEvent)
  {
    GMTrace.i(17674058858496L, 131682);
    int j = paramViewGroup.getChildCount();
    int i = paramMotionEvent.getActionIndex();
    View localView;
    float f1;
    float f2;
    if (paramViewGroup.isMotionEventSplittingEnabled())
    {
      i = 1 << paramMotionEvent.getPointerId(i);
      j -= 1;
      if (j < 0) {
        break label543;
      }
      localView = paramViewGroup.getChildAt(j);
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      if (!((Boolean)f.a(ViewGroup.class, "canViewReceivePointerEvents", paramViewGroup, new Class[] { View.class }, new Object[] { localView }, Boolean.valueOf(false))).booleanValue()) {
        break label534;
      }
      if ((!((Boolean)f.a(ViewGroup.class, "isTransformedTouchPointInView", paramViewGroup, new Class[] { Float.TYPE, Float.TYPE, View.class, PointF.class }, new Object[] { Float.valueOf(f1), Float.valueOf(f2), localView, null }, Boolean.valueOf(false))).booleanValue()) || (!localView.isDuplicateParentStateEnabled())) {
        break label534;
      }
      if (localView != null) {
        break label235;
      }
      w.v("MicroMsg.ViewMotionHelper", "child is null.");
    }
    label199:
    label235:
    int m;
    boolean bool;
    MotionEvent localMotionEvent;
    for (;;)
    {
      if (((localView instanceof com.tencent.mm.plugin.appbrand.jsapi.base.e)) && (((com.tencent.mm.plugin.appbrand.jsapi.base.e)localView).Wo()))
      {
        GMTrace.o(17674058858496L, 131682);
        return;
        i = -1;
        break;
        int k = paramMotionEvent.getAction();
        if (k == 3)
        {
          paramMotionEvent.setAction(3);
          localView.dispatchTouchEvent(paramMotionEvent);
          paramMotionEvent.setAction(k);
        }
        else
        {
          k = ((Integer)f.a(MotionEvent.class, "getPointerIdBits", paramMotionEvent, new Class[0], new Object[0], Integer.valueOf(0))).intValue();
          m = k & i;
          if (m == 0)
          {
            w.v("MicroMsg.ViewMotionHelper", "newPointerIdBits is 0.");
          }
          else
          {
            bool = ((Boolean)f.a(View.class, "hasIdentityMatrix", localView, new Class[0], new Object[0], Boolean.valueOf(false))).booleanValue();
            if (m == k)
            {
              if (bool)
              {
                f1 = paramViewGroup.getScrollX() - localView.getLeft();
                f2 = paramViewGroup.getScrollY() - localView.getTop();
                paramMotionEvent.offsetLocation(f1, f2);
                localView.dispatchTouchEvent(paramMotionEvent);
                paramMotionEvent.offsetLocation(-f1, -f2);
                continue;
              }
              localMotionEvent = MotionEvent.obtain(paramMotionEvent);
            }
          }
        }
      }
    }
    for (;;)
    {
      localMotionEvent.offsetLocation(paramViewGroup.getScrollX() - localView.getLeft(), paramViewGroup.getScrollY() - localView.getTop());
      if (!bool) {
        localMotionEvent.transform((Matrix)f.a(View.class, "getInverseMatrix", localView, new Class[0], new Object[0], null));
      }
      localView.dispatchTouchEvent(localMotionEvent);
      localMotionEvent.recycle();
      break label199;
      localMotionEvent = (MotionEvent)f.a("split", paramMotionEvent, new Class[] { Integer.class }, new Object[] { Integer.valueOf(m) }, null);
      if (localMotionEvent == null)
      {
        localMotionEvent = MotionEvent.obtain(paramMotionEvent);
        continue;
        label534:
        j -= 1;
        break;
        label543:
        GMTrace.o(17674058858496L, 131682);
        return;
      }
    }
  }
  
  public static f bG(View paramView)
  {
    GMTrace.i(17673924640768L, 131681);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    paramView = new f(0, arrayOfInt[0], arrayOfInt[1]);
    GMTrace.o(17673924640768L, 131681);
    return paramView;
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 137;
    private static final String NAME = "onLongPress";
    
    public a()
    {
      GMTrace.i(17677011648512L, 131704);
      GMTrace.o(17677011648512L, 131704);
    }
  }
  
  public static final class b
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onTouchCancel";
    
    public b()
    {
      GMTrace.i(17677414301696L, 131707);
      GMTrace.o(17677414301696L, 131707);
    }
  }
  
  public static final class c
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onTouchStart";
    
    public c()
    {
      GMTrace.i(17673790423040L, 131680);
      GMTrace.o(17673790423040L, 131680);
    }
  }
  
  public static final class d
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onTouchMove";
    
    public d()
    {
      GMTrace.i(17673656205312L, 131679);
      GMTrace.o(17673656205312L, 131679);
    }
  }
  
  public static final class e
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onTouchEnd";
    
    public e()
    {
      GMTrace.i(17676206342144L, 131698);
      GMTrace.o(17676206342144L, 131698);
    }
  }
  
  public static final class f
  {
    public int id;
    public float x;
    public float y;
    
    public f()
    {
      GMTrace.i(17676340559872L, 131699);
      GMTrace.o(17676340559872L, 131699);
    }
    
    public f(int paramInt, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(17676474777600L, 131700);
      this.id = paramInt;
      this.x = paramFloat1;
      this.y = paramFloat2;
      GMTrace.o(17676474777600L, 131700);
    }
    
    public final void b(int paramInt, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(17676608995328L, 131701);
      this.id = paramInt;
      this.x = paramFloat1;
      this.y = paramFloat2;
      GMTrace.o(17676608995328L, 131701);
    }
    
    public final JSONObject on()
    {
      GMTrace.i(17676743213056L, 131702);
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("id", this.id);
        localJSONObject.put("x", com.tencent.mm.plugin.appbrand.n.c.V(this.x));
        localJSONObject.put("y", com.tencent.mm.plugin.appbrand.n.c.V(this.y));
        GMTrace.o(17676743213056L, 131702);
        return localJSONObject;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
    
    public final String toString()
    {
      GMTrace.i(17676877430784L, 131703);
      String str = on().toString();
      GMTrace.o(17676877430784L, 131703);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\j\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */