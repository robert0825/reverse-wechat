package com.tencent.mm.plugin.appbrand.jsapi.j;

import android.support.v4.view.z;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static final class a
    implements View.OnTouchListener
  {
    private static volatile View inJ;
    public u.b fXA;
    private String hyD;
    public Map<Integer, c.f> inK;
    public boolean inL;
    private boolean inM;
    public c.f inN;
    private Runnable inO;
    private int inP;
    public float inQ;
    public MotionEvent inR;
    public MotionEvent inS;
    public c.f inT;
    public c.f inU;
    public View mView;
    
    public a(AppBrandPageView paramAppBrandPageView, u.b paramb)
    {
      GMTrace.i(17674193076224L, 131683);
      this.inK = new HashMap();
      this.fXA = paramb;
      this.hyD = paramAppBrandPageView.hyD;
      this.inP = paramAppBrandPageView.hashCode();
      this.inQ = ViewConfiguration.get(paramAppBrandPageView.mContext).getScaledTouchSlop();
      this.inT = new c.f();
      this.inU = new c.f();
      this.inO = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17676072124416L, 131697);
          if (!b.a.this.inL)
          {
            w.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but pressed is false or pointer is null.");
            GMTrace.o(17676072124416L, 131697);
            return;
          }
          Object localObject = c.bG(b.a.this.mView);
          if ((Math.abs(b.a.this.inN.x - ((c.f)localObject).x) > 1.0F) || (Math.abs(b.a.this.inN.y - ((c.f)localObject).y) > 1.0F))
          {
            w.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but view has moved.");
            GMTrace.o(17676072124416L, 131697);
            return;
          }
          if (b.a.this.inK.size() != 1)
          {
            w.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but more then one point.");
            GMTrace.o(17676072124416L, 131697);
            return;
          }
          if ((Math.abs(b.a.this.inT.x - b.a.this.inU.x) > b.a.this.inQ) || (Math.abs(b.a.this.inT.y - b.a.this.inU.y) > b.a.this.inQ))
          {
            w.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but point has moved(%s, %s, %s, %s).", new Object[] { Float.valueOf(b.a.this.inT.x), Float.valueOf(b.a.this.inU.x), Float.valueOf(b.a.this.inT.y), Float.valueOf(b.a.this.inU.y) });
            GMTrace.o(17676072124416L, 131697);
            return;
          }
          w.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, publish event(%s, %s, %s, %s).", new Object[] { Float.valueOf(b.a.this.inT.x), Float.valueOf(b.a.this.inU.x), Float.valueOf(b.a.this.inT.y), Float.valueOf(b.a.this.inU.y) });
          localObject = new JSONObject();
          try
          {
            ((JSONObject)localObject).put("data", b.a.this.fXA.getString("data", ""));
            ((JSONObject)localObject).put("touch", b.a.this.inT.on());
            if (!b.a.this.fXA.getBoolean("disableScroll", false))
            {
              b.a.this.inR = MotionEvent.obtain(b.a.this.inS);
              b.a.this.inR.setAction(0);
              b.a.this.fXA.q("fakeDownEvent", true);
              b.a.this.mView.getParent().requestDisallowInterceptTouchEvent(true);
              b.a.this.mView.setDuplicateParentStateEnabled(false);
              b.a.this.a(b.a.this.mView, MotionEvent.obtain(b.a.this.inR));
            }
            b.a.this.a(new c.a(), ((JSONObject)localObject).toString());
            GMTrace.o(17676072124416L, 131697);
            return;
          }
          catch (JSONException localJSONException)
          {
            for (;;) {}
          }
        }
      };
      GMTrace.o(17674193076224L, 131683);
    }
    
    private void a(c.f paramf, e parame, String paramString)
    {
      GMTrace.i(17674729947136L, 131687);
      if (paramf == null)
      {
        GMTrace.o(17674729947136L, 131687);
        return;
      }
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("data", paramString);
        localJSONObject.put("touch", paramf.on());
        a(parame, localJSONObject.toString());
        GMTrace.o(17674729947136L, 131687);
        return;
      }
      catch (JSONException paramf)
      {
        for (;;) {}
      }
    }
    
    private void f(View paramView, boolean paramBoolean)
    {
      GMTrace.i(17674595729408L, 131686);
      this.mView = paramView;
      this.inL = paramBoolean;
      if (!paramBoolean)
      {
        this.fXA.q("fakeDownEvent", false);
        this.fXA.q("onLongClick", false);
        this.mView.removeCallbacks(this.inO);
        this.inT.b(-1, 0.0F, 0.0F);
        this.inR = null;
      }
      GMTrace.o(17674595729408L, 131686);
    }
    
    private c.f[] x(MotionEvent paramMotionEvent)
    {
      int j = 0;
      GMTrace.i(17674998382592L, 131689);
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < paramMotionEvent.getPointerCount())
      {
        int k = paramMotionEvent.getPointerId(i);
        c.f localf = (c.f)this.inK.get(Integer.valueOf(k));
        if (localf != null)
        {
          localf.x = paramMotionEvent.getX(i);
          localf.y = paramMotionEvent.getY(i);
          localArrayList.add(localf);
        }
        i += 1;
      }
      paramMotionEvent = new c.f[localArrayList.size()];
      i = j;
      while (i < localArrayList.size())
      {
        paramMotionEvent[i] = ((c.f)localArrayList.get(i));
        i += 1;
      }
      GMTrace.o(17674998382592L, 131689);
      return paramMotionEvent;
    }
    
    public final void a(View paramView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(17674327293952L, 131684);
      for (;;)
      {
        ViewParent localViewParent = paramView.getParent();
        if ((localViewParent == null) || (!(localViewParent instanceof ViewGroup)))
        {
          paramView.dispatchTouchEvent(paramMotionEvent);
          GMTrace.o(17674327293952L, 131684);
          return;
        }
        ViewGroup localViewGroup = (ViewGroup)localViewParent;
        float f1 = localViewGroup.getScrollX();
        float f2 = paramView.getX();
        float f3 = localViewGroup.getScrollY();
        float f4 = paramView.getY();
        paramMotionEvent.offsetLocation(-(f1 - f2), -(f3 - f4));
        paramView = (View)localViewParent;
      }
    }
    
    public final void a(e parame, String paramString)
    {
      GMTrace.i(17674864164864L, 131688);
      parame = parame.ai(this.hyD, this.inP);
      parame.mData = paramString;
      parame.VR();
      GMTrace.o(17674864164864L, 131688);
    }
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(17674461511680L, 131685);
      if ((inJ != null) && (!inJ.equals(paramView)))
      {
        GMTrace.o(17674461511680L, 131685);
        return false;
      }
      this.inS = paramMotionEvent;
      int k = paramMotionEvent.getActionMasked();
      int i = paramMotionEvent.getActionIndex();
      paramMotionEvent.getPointerCount();
      int j = paramMotionEvent.getPointerId(i);
      float f1 = paramMotionEvent.getX(i);
      float f2 = paramMotionEvent.getY(i);
      String str = "";
      boolean bool5 = false;
      boolean bool2 = false;
      boolean bool1 = false;
      if (this.fXA != null)
      {
        if ((k != 0) && (!this.fXA.gz("isTouching")) && (!z.al(paramView)) && (paramMotionEvent.getActionMasked() != 3))
        {
          GMTrace.o(17674461511680L, 131685);
          return false;
        }
        str = this.fXA.getString("data", "");
        bool5 = this.fXA.getBoolean("disableScroll", false);
        bool2 = this.fXA.getBoolean("fakeDownEvent", false);
        bool1 = this.fXA.getBoolean("onLongClick", false);
        this.inM = this.fXA.getBoolean("enableLongClick", false);
      }
      this.inU.b(j, f1, f2);
      boolean bool3 = bool5 | bool1;
      boolean bool4 = bool3;
      switch (k)
      {
      default: 
        bool4 = bool3;
      }
      for (;;)
      {
        GMTrace.o(17674461511680L, 131685);
        return bool4;
        i = 0;
        Object localObject;
        if (i < paramMotionEvent.getPointerCount())
        {
          f1 = paramMotionEvent.getX(i);
          f2 = paramMotionEvent.getY(i);
          j = paramMotionEvent.getPointerId(i);
          localObject = (c.f)this.inK.get(Integer.valueOf(j));
          if ((localObject != null) && ((f1 != ((c.f)localObject).x) || (f2 != ((c.f)localObject).y)))
          {
            i = 1;
            label379:
            bool4 = bool3;
            if (i == 0) {
              continue;
            }
            if ((this.inK.size() == 1) && (this.inL) && ((Math.abs(this.inT.x - this.inU.x) > this.inQ) || (Math.abs(this.inT.y - this.inU.y) > this.inQ))) {
              f(paramView, false);
            }
            paramView = new JSONObject();
            localObject = new JSONArray();
          }
        }
        try
        {
          paramView.put("data", str);
          paramView.put("touches", localObject);
          paramMotionEvent = x(paramMotionEvent);
          if (paramMotionEvent.length > 0)
          {
            i = 0;
            for (;;)
            {
              if (i < paramMotionEvent.length)
              {
                ((JSONArray)localObject).put(paramMotionEvent[i].on());
                i += 1;
                continue;
                i += 1;
                break;
                i = 0;
                break label379;
              }
            }
          }
          bool4 = bool3;
          if (this.inK.size() == 0) {
            continue;
          }
          a(new c.d(), paramView.toString());
          bool4 = bool3;
          continue;
          bool4 = bool2;
          if (this.inR != null)
          {
            bool4 = bool2;
            if (paramMotionEvent.getDownTime() != this.inR.getDownTime())
            {
              bool4 = false;
              if (this.fXA != null) {
                this.fXA.q("fakeDownEvent", false);
              }
              w.v("MicroMsg.OnTouchListenerImpl", "try to handle fake event failed");
            }
          }
          if ((bool5) || (bool4))
          {
            paramView.getParent().requestDisallowInterceptTouchEvent(true);
            paramView.setDuplicateParentStateEnabled(false);
            w.i("MicroMsg.OnTouchListenerImpl", "onLongClick fake down event.");
            label692:
            if (!bool4) {
              break label979;
            }
            bool3 = true;
            bool5 = true;
            bool2 = bool5;
            bool1 = bool3;
            if (this.fXA != null)
            {
              this.fXA.q("fakeDownEvent", false);
              this.fXA.q("onLongClick", true);
              bool1 = bool3;
              bool2 = bool5;
            }
            label748:
            if (this.fXA != null) {
              this.fXA.q("isTouching", true);
            }
            if ((this.inM) && (!bool1) && (!this.inK.containsKey(Integer.valueOf(j)))) {
              paramView.postDelayed(this.inO, ViewConfiguration.getLongPressTimeout());
            }
            bool3 = bool2;
            bool2 = bool4;
            if ((f1 < 0.0F) || (f2 < 0.0F) || (f1 > paramView.getWidth()) || (f2 > paramView.getHeight())) {
              break label1010;
            }
            i = 1;
            label854:
            bool4 = bool3;
            if (i == 0) {
              continue;
            }
            paramMotionEvent = new c.f(j, f1, f2);
            if ((k != 0) || (bool1)) {
              break label1016;
            }
          }
          label979:
          label1010:
          label1016:
          for (bool1 = true;; bool1 = false)
          {
            f(paramView, bool1);
            if (!this.inK.containsKey(Integer.valueOf(j))) {
              break label1377;
            }
            i = 1;
            this.inK.put(Integer.valueOf(j), paramMotionEvent);
            bool4 = bool3;
            if (bool2) {
              break;
            }
            bool4 = bool3;
            if (i != 0) {
              break;
            }
            a(paramMotionEvent, new c.c(), str);
            bool4 = bool3;
            break;
            paramView.setDuplicateParentStateEnabled(true);
            break label692;
            inJ = paramView;
            this.inN = c.bG(paramView);
            this.inT.b(j, f1, f2);
            bool2 = bool3;
            break label748;
            i = 0;
            break label854;
          }
          if ((bool5) || (bool1)) {
            paramView.getParent().requestDisallowInterceptTouchEvent(false);
          }
          for (;;)
          {
            inJ = null;
            if (this.fXA != null)
            {
              this.fXA.q("isTouching", false);
              if (this.fXA.containsKey("disableScroll-nextState")) {
                this.fXA.q("disableScroll", this.fXA.getBoolean("disableScroll-nextState", bool5));
              }
            }
            paramMotionEvent = (c.f)this.inK.remove(Integer.valueOf(j));
            bool4 = bool3;
            if (paramMotionEvent == null) {
              break;
            }
            f(paramView, false);
            a(paramMotionEvent, new c.e(), str);
            bool4 = bool3;
            break;
            paramView.setDuplicateParentStateEnabled(false);
          }
          inJ = null;
          f(paramView, false);
          if ((bool5) || (bool1))
          {
            paramView.getParent().requestDisallowInterceptTouchEvent(false);
            if (this.fXA != null)
            {
              this.fXA.q("isTouching", false);
              if (this.fXA.containsKey("disableScroll-nextState")) {
                this.fXA.q("disableScroll", this.fXA.getBoolean("disableScroll-nextState", bool5));
              }
            }
            if (!z.al(paramView)) {
              break label1351;
            }
            paramView = new JSONObject();
            localObject = new JSONArray();
          }
          try
          {
            paramView.put("data", str);
            paramView.put("touches", localObject);
            paramMotionEvent = x(paramMotionEvent);
            i = 0;
            for (;;)
            {
              if (i < paramMotionEvent.length)
              {
                ((JSONArray)localObject).put(paramMotionEvent[i].on());
                i += 1;
                continue;
                paramView.setDuplicateParentStateEnabled(false);
                break;
              }
            }
            a(new c.b(), paramView.toString());
            label1351:
            this.inK.clear();
            bool4 = bool3;
          }
          catch (JSONException localJSONException1)
          {
            for (;;) {}
          }
        }
        catch (JSONException localJSONException2)
        {
          for (;;)
          {
            continue;
            label1377:
            i = 0;
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\j\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */