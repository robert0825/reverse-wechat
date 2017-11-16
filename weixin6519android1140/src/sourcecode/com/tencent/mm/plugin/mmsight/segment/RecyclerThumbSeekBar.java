package com.tencent.mm.plugin.mmsight.segment;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.k;
import android.support.v7.widget.RecyclerView.t;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.memory.o;
import com.tencent.mm.memory.o.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;

public class RecyclerThumbSeekBar
  extends RelativeLayout
  implements c
{
  public int gVq;
  private int giH;
  private int giI;
  private RecyclerView neA;
  private c neB;
  private n neC;
  private int neD;
  private d.a neE;
  private Runnable neF;
  private RecyclerView.k neG;
  private n.a neH;
  private int nex;
  public c.a ney;
  public c.b nez;
  private String path;
  
  public RecyclerThumbSeekBar(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20176816832512L, 150329);
    this.gVq = -1;
    this.neE = new d.a(new Callable() {});
    this.neF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7430830292992L, 55364);
        if ((RecyclerThumbSeekBar.this.getHeight() == 0) || (RecyclerThumbSeekBar.this.getWidth() == 0))
        {
          RecyclerThumbSeekBar.this.post(RecyclerThumbSeekBar.e(RecyclerThumbSeekBar.this));
          GMTrace.o(7430830292992L, 55364);
          return;
        }
        RecyclerThumbSeekBar.a(RecyclerThumbSeekBar.this, 1000);
        RecyclerThumbSeekBar.b(RecyclerThumbSeekBar.this, RecyclerThumbSeekBar.this.getHeight());
        RecyclerThumbSeekBar.c(RecyclerThumbSeekBar.this, (RecyclerThumbSeekBar.this.getWidth() - RecyclerThumbSeekBar.f(RecyclerThumbSeekBar.this) * 2) / 10);
        e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7453110435840L, 55530);
            try
            {
              d locald = RecyclerThumbSeekBar.g(RecyclerThumbSeekBar.this).aQa();
              RecyclerThumbSeekBar.d(RecyclerThumbSeekBar.this, locald.getDurationMs());
              RecyclerThumbSeekBar.g(RecyclerThumbSeekBar.this).a(locald);
              i = 1;
            }
            catch (Exception localException)
            {
              for (;;)
              {
                w.printErrStackTrace("RecyclerThumbSeekBar", localException, "Try to init fetcher error : %s", new Object[] { localException.getMessage() });
                int i = 0;
              }
              if (RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) < 10000) {
                break label195;
              }
              RecyclerThumbSeekBar.a(RecyclerThumbSeekBar.this, 1000);
              for (;;)
              {
                w.d("RecyclerThumbSeekBar", "duration %d interval %d", new Object[] { Integer.valueOf(RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this)), Integer.valueOf(RecyclerThumbSeekBar.b(RecyclerThumbSeekBar.this)) });
                RecyclerThumbSeekBar.j(RecyclerThumbSeekBar.this);
                GMTrace.o(7453110435840L, 55530);
                return;
                label195:
                if (RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) <= 0) {
                  break;
                }
                RecyclerThumbSeekBar.a(RecyclerThumbSeekBar.this, RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) / 10);
              }
              w.e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar duration invalid %d", new Object[] { Integer.valueOf(RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this)) });
              RecyclerThumbSeekBar.h(RecyclerThumbSeekBar.this);
              GMTrace.o(7453110435840L, 55530);
            }
            if (i == 0)
            {
              RecyclerThumbSeekBar.h(RecyclerThumbSeekBar.this);
              GMTrace.o(7453110435840L, 55530);
              return;
            }
          }
        }, "check duration of ");
        GMTrace.o(7430830292992L, 55364);
      }
    };
    this.neG = new RecyclerView.k()
    {
      public final void e(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
      {
        GMTrace.i(7476330102784L, 55703);
        if ((paramAnonymousInt == 0) && (RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null)) {
          RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this).y(RecyclerThumbSeekBar.this.aPX(), RecyclerThumbSeekBar.this.aPY());
        }
        GMTrace.o(7476330102784L, 55703);
      }
    };
    this.neH = new n.a()
    {
      public final void aQk()
      {
        GMTrace.i(7441165058048L, 55441);
        if ((RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null) && (RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this) != null))
        {
          c.b localb = RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this);
          RecyclerThumbSeekBar.this.aPX();
          RecyclerThumbSeekBar.this.aPY();
          localb.aPZ();
        }
        GMTrace.o(7441165058048L, 55441);
      }
      
      public final void aQl()
      {
        GMTrace.i(7441299275776L, 55442);
        if ((RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null) && (RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this) != null)) {
          RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this).z(RecyclerThumbSeekBar.this.aPX(), RecyclerThumbSeekBar.this.aPY());
        }
        GMTrace.o(7441299275776L, 55442);
      }
      
      public final void ga(boolean paramAnonymousBoolean)
      {
        GMTrace.i(7441433493504L, 55443);
        if ((RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null) && (RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this) != null)) {
          RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this).A(RecyclerThumbSeekBar.this.aPX(), RecyclerThumbSeekBar.this.aPY());
        }
        if (paramAnonymousBoolean)
        {
          RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this).o(true, RecyclerThumbSeekBar.k(RecyclerThumbSeekBar.this).aQm());
          GMTrace.o(7441433493504L, 55443);
          return;
        }
        RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this).o(false, RecyclerThumbSeekBar.k(RecyclerThumbSeekBar.this).getWidth() - RecyclerThumbSeekBar.k(RecyclerThumbSeekBar.this).aQn());
        GMTrace.o(7441433493504L, 55443);
      }
    };
    init();
    GMTrace.o(20176816832512L, 150329);
  }
  
  public RecyclerThumbSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7447875944448L, 55491);
    this.gVq = -1;
    this.neE = new d.a(new Callable() {});
    this.neF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7430830292992L, 55364);
        if ((RecyclerThumbSeekBar.this.getHeight() == 0) || (RecyclerThumbSeekBar.this.getWidth() == 0))
        {
          RecyclerThumbSeekBar.this.post(RecyclerThumbSeekBar.e(RecyclerThumbSeekBar.this));
          GMTrace.o(7430830292992L, 55364);
          return;
        }
        RecyclerThumbSeekBar.a(RecyclerThumbSeekBar.this, 1000);
        RecyclerThumbSeekBar.b(RecyclerThumbSeekBar.this, RecyclerThumbSeekBar.this.getHeight());
        RecyclerThumbSeekBar.c(RecyclerThumbSeekBar.this, (RecyclerThumbSeekBar.this.getWidth() - RecyclerThumbSeekBar.f(RecyclerThumbSeekBar.this) * 2) / 10);
        e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7453110435840L, 55530);
            try
            {
              d locald = RecyclerThumbSeekBar.g(RecyclerThumbSeekBar.this).aQa();
              RecyclerThumbSeekBar.d(RecyclerThumbSeekBar.this, locald.getDurationMs());
              RecyclerThumbSeekBar.g(RecyclerThumbSeekBar.this).a(locald);
              i = 1;
            }
            catch (Exception localException)
            {
              for (;;)
              {
                w.printErrStackTrace("RecyclerThumbSeekBar", localException, "Try to init fetcher error : %s", new Object[] { localException.getMessage() });
                int i = 0;
              }
              if (RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) < 10000) {
                break label195;
              }
              RecyclerThumbSeekBar.a(RecyclerThumbSeekBar.this, 1000);
              for (;;)
              {
                w.d("RecyclerThumbSeekBar", "duration %d interval %d", new Object[] { Integer.valueOf(RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this)), Integer.valueOf(RecyclerThumbSeekBar.b(RecyclerThumbSeekBar.this)) });
                RecyclerThumbSeekBar.j(RecyclerThumbSeekBar.this);
                GMTrace.o(7453110435840L, 55530);
                return;
                label195:
                if (RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) <= 0) {
                  break;
                }
                RecyclerThumbSeekBar.a(RecyclerThumbSeekBar.this, RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) / 10);
              }
              w.e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar duration invalid %d", new Object[] { Integer.valueOf(RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this)) });
              RecyclerThumbSeekBar.h(RecyclerThumbSeekBar.this);
              GMTrace.o(7453110435840L, 55530);
            }
            if (i == 0)
            {
              RecyclerThumbSeekBar.h(RecyclerThumbSeekBar.this);
              GMTrace.o(7453110435840L, 55530);
              return;
            }
          }
        }, "check duration of ");
        GMTrace.o(7430830292992L, 55364);
      }
    };
    this.neG = new RecyclerView.k()
    {
      public final void e(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
      {
        GMTrace.i(7476330102784L, 55703);
        if ((paramAnonymousInt == 0) && (RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null)) {
          RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this).y(RecyclerThumbSeekBar.this.aPX(), RecyclerThumbSeekBar.this.aPY());
        }
        GMTrace.o(7476330102784L, 55703);
      }
    };
    this.neH = new n.a()
    {
      public final void aQk()
      {
        GMTrace.i(7441165058048L, 55441);
        if ((RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null) && (RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this) != null))
        {
          c.b localb = RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this);
          RecyclerThumbSeekBar.this.aPX();
          RecyclerThumbSeekBar.this.aPY();
          localb.aPZ();
        }
        GMTrace.o(7441165058048L, 55441);
      }
      
      public final void aQl()
      {
        GMTrace.i(7441299275776L, 55442);
        if ((RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null) && (RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this) != null)) {
          RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this).z(RecyclerThumbSeekBar.this.aPX(), RecyclerThumbSeekBar.this.aPY());
        }
        GMTrace.o(7441299275776L, 55442);
      }
      
      public final void ga(boolean paramAnonymousBoolean)
      {
        GMTrace.i(7441433493504L, 55443);
        if ((RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null) && (RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this) != null)) {
          RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this).A(RecyclerThumbSeekBar.this.aPX(), RecyclerThumbSeekBar.this.aPY());
        }
        if (paramAnonymousBoolean)
        {
          RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this).o(true, RecyclerThumbSeekBar.k(RecyclerThumbSeekBar.this).aQm());
          GMTrace.o(7441433493504L, 55443);
          return;
        }
        RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this).o(false, RecyclerThumbSeekBar.k(RecyclerThumbSeekBar.this).getWidth() - RecyclerThumbSeekBar.k(RecyclerThumbSeekBar.this).aQn());
        GMTrace.o(7441433493504L, 55443);
      }
    };
    init();
    GMTrace.o(7447875944448L, 55491);
  }
  
  public RecyclerThumbSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7448010162176L, 55492);
    this.gVq = -1;
    this.neE = new d.a(new Callable() {});
    this.neF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7430830292992L, 55364);
        if ((RecyclerThumbSeekBar.this.getHeight() == 0) || (RecyclerThumbSeekBar.this.getWidth() == 0))
        {
          RecyclerThumbSeekBar.this.post(RecyclerThumbSeekBar.e(RecyclerThumbSeekBar.this));
          GMTrace.o(7430830292992L, 55364);
          return;
        }
        RecyclerThumbSeekBar.a(RecyclerThumbSeekBar.this, 1000);
        RecyclerThumbSeekBar.b(RecyclerThumbSeekBar.this, RecyclerThumbSeekBar.this.getHeight());
        RecyclerThumbSeekBar.c(RecyclerThumbSeekBar.this, (RecyclerThumbSeekBar.this.getWidth() - RecyclerThumbSeekBar.f(RecyclerThumbSeekBar.this) * 2) / 10);
        e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7453110435840L, 55530);
            try
            {
              d locald = RecyclerThumbSeekBar.g(RecyclerThumbSeekBar.this).aQa();
              RecyclerThumbSeekBar.d(RecyclerThumbSeekBar.this, locald.getDurationMs());
              RecyclerThumbSeekBar.g(RecyclerThumbSeekBar.this).a(locald);
              i = 1;
            }
            catch (Exception localException)
            {
              for (;;)
              {
                w.printErrStackTrace("RecyclerThumbSeekBar", localException, "Try to init fetcher error : %s", new Object[] { localException.getMessage() });
                int i = 0;
              }
              if (RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) < 10000) {
                break label195;
              }
              RecyclerThumbSeekBar.a(RecyclerThumbSeekBar.this, 1000);
              for (;;)
              {
                w.d("RecyclerThumbSeekBar", "duration %d interval %d", new Object[] { Integer.valueOf(RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this)), Integer.valueOf(RecyclerThumbSeekBar.b(RecyclerThumbSeekBar.this)) });
                RecyclerThumbSeekBar.j(RecyclerThumbSeekBar.this);
                GMTrace.o(7453110435840L, 55530);
                return;
                label195:
                if (RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) <= 0) {
                  break;
                }
                RecyclerThumbSeekBar.a(RecyclerThumbSeekBar.this, RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) / 10);
              }
              w.e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar duration invalid %d", new Object[] { Integer.valueOf(RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this)) });
              RecyclerThumbSeekBar.h(RecyclerThumbSeekBar.this);
              GMTrace.o(7453110435840L, 55530);
            }
            if (i == 0)
            {
              RecyclerThumbSeekBar.h(RecyclerThumbSeekBar.this);
              GMTrace.o(7453110435840L, 55530);
              return;
            }
          }
        }, "check duration of ");
        GMTrace.o(7430830292992L, 55364);
      }
    };
    this.neG = new RecyclerView.k()
    {
      public final void e(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
      {
        GMTrace.i(7476330102784L, 55703);
        if ((paramAnonymousInt == 0) && (RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null)) {
          RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this).y(RecyclerThumbSeekBar.this.aPX(), RecyclerThumbSeekBar.this.aPY());
        }
        GMTrace.o(7476330102784L, 55703);
      }
    };
    this.neH = new n.a()
    {
      public final void aQk()
      {
        GMTrace.i(7441165058048L, 55441);
        if ((RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null) && (RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this) != null))
        {
          c.b localb = RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this);
          RecyclerThumbSeekBar.this.aPX();
          RecyclerThumbSeekBar.this.aPY();
          localb.aPZ();
        }
        GMTrace.o(7441165058048L, 55441);
      }
      
      public final void aQl()
      {
        GMTrace.i(7441299275776L, 55442);
        if ((RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null) && (RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this) != null)) {
          RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this).z(RecyclerThumbSeekBar.this.aPX(), RecyclerThumbSeekBar.this.aPY());
        }
        GMTrace.o(7441299275776L, 55442);
      }
      
      public final void ga(boolean paramAnonymousBoolean)
      {
        GMTrace.i(7441433493504L, 55443);
        if ((RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this) != null) && (RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this) != null)) {
          RecyclerThumbSeekBar.o(RecyclerThumbSeekBar.this).A(RecyclerThumbSeekBar.this.aPX(), RecyclerThumbSeekBar.this.aPY());
        }
        if (paramAnonymousBoolean)
        {
          RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this).o(true, RecyclerThumbSeekBar.k(RecyclerThumbSeekBar.this).aQm());
          GMTrace.o(7441433493504L, 55443);
          return;
        }
        RecyclerThumbSeekBar.l(RecyclerThumbSeekBar.this).o(false, RecyclerThumbSeekBar.k(RecyclerThumbSeekBar.this).getWidth() - RecyclerThumbSeekBar.k(RecyclerThumbSeekBar.this).aQn());
        GMTrace.o(7441433493504L, 55443);
      }
    };
    init();
    GMTrace.o(7448010162176L, 55492);
  }
  
  private void aQj()
  {
    GMTrace.i(7448815468544L, 55498);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7429353897984L, 55353);
        if (RecyclerThumbSeekBar.n(RecyclerThumbSeekBar.this) != null) {
          RecyclerThumbSeekBar.n(RecyclerThumbSeekBar.this).fZ(true);
        }
        GMTrace.o(7429353897984L, 55353);
      }
    });
    GMTrace.o(7448815468544L, 55498);
  }
  
  private void init()
  {
    GMTrace.i(7448144379904L, 55493);
    this.neA = new RecyclerView(getContext());
    getContext();
    Object localObject = new LinearLayoutManager(0, false);
    this.neA.a((RecyclerView.h)localObject);
    this.neA.Tc = true;
    int i = a.V(getContext(), k.b.neo);
    this.neD = a.V(getContext(), k.b.nen);
    localObject = new RelativeLayout.LayoutParams(-1, i);
    addView(this.neA, (ViewGroup.LayoutParams)localObject);
    this.neC = new n(getContext());
    localObject = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.neC, (ViewGroup.LayoutParams)localObject);
    this.neC.neU = this.neH;
    this.neA.a(this.neG);
    GMTrace.o(7448144379904L, 55493);
  }
  
  private float qQ(int paramInt)
  {
    GMTrace.i(7449620774912L, 55504);
    if ((this.neB == null) || (this.neA == null))
    {
      GMTrace.o(7449620774912L, 55504);
      return 0.0F;
    }
    View localView = this.neA.j(paramInt, 0.0F);
    int i = RecyclerView.ba(localView);
    int j = this.neB.getItemCount();
    if (i <= 0)
    {
      GMTrace.o(7449620774912L, 55504);
      return 0.0F;
    }
    if (i >= j - 1)
    {
      GMTrace.o(7449620774912L, 55504);
      return 1.0F;
    }
    float f = (i - 1 + (paramInt - localView.getLeft()) / localView.getWidth()) / (j - 2);
    GMTrace.o(7449620774912L, 55504);
    return f;
  }
  
  public final void CM(String paramString)
  {
    GMTrace.i(7448412815360L, 55495);
    if ((bg.nm(paramString)) || (!FileOp.aZ(paramString)))
    {
      aQj();
      GMTrace.o(7448412815360L, 55495);
      return;
    }
    this.path = paramString;
    post(this.neF);
    GMTrace.o(7448412815360L, 55495);
  }
  
  public final void a(c.a parama)
  {
    GMTrace.i(7449083904000L, 55500);
    this.ney = parama;
    GMTrace.o(7449083904000L, 55500);
  }
  
  public final void a(c.b paramb)
  {
    GMTrace.i(7449218121728L, 55501);
    this.nez = paramb;
    GMTrace.o(7449218121728L, 55501);
  }
  
  public final float aPX()
  {
    GMTrace.i(7449352339456L, 55502);
    if (this.neC == null)
    {
      GMTrace.o(7449352339456L, 55502);
      return 0.0F;
    }
    float f = qQ(this.neC.aQm());
    GMTrace.o(7449352339456L, 55502);
    return f;
  }
  
  public final float aPY()
  {
    GMTrace.i(7449486557184L, 55503);
    if (this.neC == null)
    {
      GMTrace.o(7449486557184L, 55503);
      return 0.0F;
    }
    float f = qQ(this.neC.aQn());
    GMTrace.o(7449486557184L, 55503);
    return f;
  }
  
  public final void af(float paramFloat)
  {
    float f2 = 0.0F;
    GMTrace.i(7448278597632L, 55494);
    n localn = this.neC;
    float f1 = f2;
    if (this.neB != null)
    {
      if (this.neA != null) {
        break label51;
      }
      f1 = f2;
    }
    for (;;)
    {
      localn.ag(f1);
      GMTrace.o(7448278597632L, 55494);
      return;
      label51:
      paramFloat = (this.neB.getItemCount() - 2) * paramFloat;
      int i = (int)Math.floor(paramFloat);
      float f3 = i;
      Object localObject = this.neA.bb(i + 1);
      f1 = f2;
      if (localObject != null)
      {
        localObject = ((RecyclerView.t)localObject).UU;
        f1 = ((View)localObject).getLeft();
        f1 = (((View)localObject).getWidth() * (paramFloat - f3) + f1) / getWidth();
      }
    }
  }
  
  public final void fY(boolean paramBoolean)
  {
    GMTrace.i(7448681250816L, 55497);
    if (paramBoolean)
    {
      this.neC.neW = true;
      GMTrace.o(7448681250816L, 55497);
      return;
    }
    this.neC.neW = false;
    GMTrace.o(7448681250816L, 55497);
  }
  
  public final int getDurationMs()
  {
    GMTrace.i(7448547033088L, 55496);
    int i = this.gVq;
    GMTrace.o(7448547033088L, 55496);
    return i;
  }
  
  public final void release()
  {
    GMTrace.i(7448949686272L, 55499);
    this.gVq = -1;
    this.path = null;
    Object localObject1;
    if (this.neE != null)
    {
      localObject1 = this.neE;
      if (((d.a)localObject1).ndv != null)
      {
        ((d.a)localObject1).lnP.lock();
        if (((d.a)localObject1).ndv != null) {
          break label147;
        }
        ((d.a)localObject1).lnP.unlock();
      }
    }
    for (;;)
    {
      if ((this.neB == null) || (this.neB.neM == null)) {
        break label267;
      }
      localObject1 = this.neB.neM;
      if ((((d)localObject1).neR != null) && (((d)localObject1).neR.length != 0))
      {
        int i = 0;
        for (;;)
        {
          if (i < ((d)localObject1).neR.length)
          {
            if (localObject1.neR[i] != null)
            {
              localObject1.neR[i].quit();
              ((d)localObject1).neR[i] = null;
            }
            i += 1;
            continue;
            try
            {
              label147:
              Iterator localIterator = ((d.a)localObject1).ndv.iterator();
              while (localIterator.hasNext()) {
                ((d)localIterator.next()).release();
              }
            }
            catch (Exception localException)
            {
              w.printErrStackTrace("FetcherPool", localException, "destroy fetcher %s", new Object[] { localException.getMessage() });
              ((d.a)localObject1).ndv = null;
              ((d.a)localObject1).lnP.unlock();
              break;
              ((d.a)localObject1).ndv = null;
              ((d.a)localObject1).lnP.unlock();
              break;
            }
            finally
            {
              ((d.a)localObject1).ndv = null;
              ((d.a)localObject1).lnP.unlock();
            }
          }
        }
      }
    }
    this.neB.neM = null;
    this.neB = null;
    label267:
    if (this.neC != null)
    {
      localObject1 = this.neC;
      if ((((n)localObject1).nfr != null) && (((n)localObject1).nfs != null))
      {
        ((n)localObject1).neZ.setBounds(((n)localObject1).nfr);
        ((n)localObject1).nfa.setBounds(((n)localObject1).nfs);
        ((n)localObject1).nfe = -1.0F;
        ((n)localObject1).postInvalidate();
      }
    }
    GMTrace.o(7448949686272L, 55499);
  }
  
  private final class a
    implements Runnable
  {
    private Bitmap bitmap;
    private ImageView eId;
    private RecyclerThumbSeekBar.b neK;
    
    a(Bitmap paramBitmap, ImageView paramImageView, RecyclerThumbSeekBar.b paramb)
    {
      GMTrace.i(7476464320512L, 55704);
      this.bitmap = paramBitmap;
      this.eId = paramImageView;
      this.neK = paramb;
      GMTrace.o(7476464320512L, 55704);
    }
    
    public final void run()
    {
      boolean bool = true;
      GMTrace.i(7476598538240L, 55705);
      if ((this.bitmap == null) || (this.bitmap.isRecycled()))
      {
        if (this.bitmap == null) {}
        for (;;)
        {
          w.i("RecyclerThumbSeekBar", "bitmap is null %b in DrawBitmapOnViewTask", new Object[] { Boolean.valueOf(bool) });
          GMTrace.o(7476598538240L, 55705);
          return;
          bool = false;
        }
      }
      if ((this.neK == null) || (this.neK.gLX) || (this.eId == null))
      {
        w.i("RecyclerThumbSeekBar", "bitmap in DrawBitmapOnViewTask");
        GMTrace.o(7476598538240L, 55705);
        return;
      }
      ImageView localImageView = this.eId;
      localImageView.setTag(null);
      ObjectAnimator.ofInt(localImageView, "imageAlpha", new int[] { 50, 255 }).setDuration(200L).start();
      localImageView.setImageBitmap(this.bitmap);
      GMTrace.o(7476598538240L, 55705);
    }
  }
  
  private final class b
    implements Runnable
  {
    public boolean gLX;
    private WeakReference<ImageView> grA;
    private ae handler;
    private Bitmap neL;
    public int time;
    
    b(int paramInt, ImageView paramImageView, Bitmap paramBitmap, ae paramae)
    {
      GMTrace.i(7485322690560L, 55770);
      this.gLX = false;
      this.time = paramInt;
      this.grA = new WeakReference(paramImageView);
      this.handler = paramae;
      this.neL = paramBitmap;
      GMTrace.o(7485322690560L, 55770);
    }
    
    public final void run()
    {
      GMTrace.i(7485456908288L, 55771);
      if (this.gLX)
      {
        o.gib.g(this.neL);
        GMTrace.o(7485456908288L, 55771);
        return;
      }
      if ((ImageView)this.grA.get() == null)
      {
        o.gib.g(this.neL);
        GMTrace.o(7485456908288L, 55771);
        return;
      }
      try
      {
        d locald = RecyclerThumbSeekBar.g(RecyclerThumbSeekBar.this).aQa();
        if (this.neL == null) {
          this.neL = o.gib.a(new o.b(locald.getScaledWidth(), locald.getScaledHeight()));
        }
        locald.reuseBitmap(this.neL);
        if (!this.gLX) {
          this.neL = locald.getFrameAtTime(this.time);
        }
        RecyclerThumbSeekBar.g(RecyclerThumbSeekBar.this).a(locald);
        if ((this.neL != null) && (!this.gLX) && (this.grA.get() != null))
        {
          this.handler.post(new RecyclerThumbSeekBar.a(RecyclerThumbSeekBar.this, this.neL, (ImageView)this.grA.get(), this));
          GMTrace.o(7485456908288L, 55771);
          return;
        }
      }
      catch (Exception localException)
      {
        w.e("RecyclerThumbSeekBar", "get bitmap error " + localException.getMessage());
        o.gib.g(this.neL);
        GMTrace.o(7485456908288L, 55771);
        return;
      }
      o.gib.g(this.neL);
      GMTrace.o(7485456908288L, 55771);
    }
  }
  
  private final class c
    extends RecyclerView.a<RecyclerThumbSeekBar.e>
  {
    public RecyclerThumbSeekBar.d neM;
    public int neN;
    public int neO;
    private View neP;
    private View neQ;
    
    public c()
    {
      GMTrace.i(7438346485760L, 55420);
      this.neM = new RecyclerThumbSeekBar.d(RecyclerThumbSeekBar.this);
      this.neN = RecyclerThumbSeekBar.f(RecyclerThumbSeekBar.this);
      this.neO = RecyclerThumbSeekBar.f(RecyclerThumbSeekBar.this);
      GMTrace.o(7438346485760L, 55420);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(7438749138944L, 55423);
      if (RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) <= 0)
      {
        GMTrace.o(7438749138944L, 55423);
        return 0;
      }
      int i = Math.max(0, (int)Math.floor(RecyclerThumbSeekBar.i(RecyclerThumbSeekBar.this) / RecyclerThumbSeekBar.b(RecyclerThumbSeekBar.this)));
      GMTrace.o(7438749138944L, 55423);
      return i + 2;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(7438480703488L, 55421);
      if (paramInt == 0)
      {
        GMTrace.o(7438480703488L, 55421);
        return 1;
      }
      if (paramInt == getItemCount() - 1)
      {
        GMTrace.o(7438480703488L, 55421);
        return 2;
      }
      GMTrace.o(7438480703488L, 55421);
      return 0;
    }
    
    public final void o(boolean paramBoolean, int paramInt)
    {
      GMTrace.i(7438614921216L, 55422);
      if (paramBoolean)
      {
        if (this.neP != null) {
          this.neP.setMinimumWidth(paramInt);
        }
        if (((LinearLayoutManager)RecyclerThumbSeekBar.m(RecyclerThumbSeekBar.this).SW).eZ() == 0) {
          RecyclerThumbSeekBar.m(RecyclerThumbSeekBar.this).scrollBy(paramInt - this.neN, 0);
        }
        this.neN = paramInt;
        GMTrace.o(7438614921216L, 55422);
        return;
      }
      this.neO = paramInt;
      if (this.neQ != null) {
        this.neQ.setMinimumWidth(this.neO);
      }
      GMTrace.o(7438614921216L, 55422);
    }
  }
  
  private final class d
  {
    ae handler;
    int mZG;
    HandlerThread[] neR;
    int neS;
    private BlockingDeque<RecyclerThumbSeekBar.b> neT;
    
    public d()
    {
      GMTrace.i(7439554445312L, 55429);
      this.handler = new ae();
      this.mZG = 4;
      this.neS = 0;
      this.neT = new LinkedBlockingDeque();
      this.neR = new HandlerThread[this.mZG];
      int i = 0;
      while (i < this.neR.length)
      {
        this.neR[i] = e.cK("RecyclerThumbSeekBar_SimpleImageLoader_" + i, -1);
        this.neR[i].start();
        i += 1;
      }
      this.neS = 0;
      GMTrace.o(7439554445312L, 55429);
    }
  }
  
  private final class e
    extends RecyclerView.t
  {
    ImageView eId;
    
    e(View paramView, int paramInt)
    {
      super();
      GMTrace.i(7475793231872L, 55699);
      if (paramInt == 0) {
        this.eId = ((ImageView)((LinearLayout)paramView).getChildAt(0));
      }
      GMTrace.o(7475793231872L, 55699);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\RecyclerThumbSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */