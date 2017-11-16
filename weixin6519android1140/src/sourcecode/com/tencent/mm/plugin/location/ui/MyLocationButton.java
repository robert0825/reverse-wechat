package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.p.b;
import com.tencent.mm.plugin.p.d;
import com.tencent.mm.sdk.platformtools.ae;

public class MyLocationButton
  extends FrameLayout
{
  private Context context;
  public a.a fJt;
  public ImageButton myT;
  public LinearLayout myU;
  public d myV;
  public boolean myW;
  
  public MyLocationButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9657502400512L, 71954);
    this.myW = true;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15405108166656L, 114777);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15405108166656L, 114777);
          return false;
        }
        MyLocationButton.a(MyLocationButton.this).setVisibility(8);
        MyLocationButton.b(MyLocationButton.this).setVisibility(0);
        if ((MyLocationButton.c(MyLocationButton.this) != null) && (MyLocationButton.d(MyLocationButton.this)))
        {
          MyLocationButton.c(MyLocationButton.this).getIController().setCenter(paramAnonymousFloat2, paramAnonymousFloat1);
          if (MyLocationButton.c(MyLocationButton.this).getZoomLevel() < 16) {
            MyLocationButton.c(MyLocationButton.this).getIController().setZoom(16);
          }
        }
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9717095071744L, 72398);
            c.Ir().c(MyLocationButton.e(MyLocationButton.this));
            GMTrace.o(9717095071744L, 72398);
          }
        });
        GMTrace.o(15405108166656L, 114777);
        return false;
      }
    };
    this.context = paramContext;
    init();
    GMTrace.o(9657502400512L, 71954);
  }
  
  public MyLocationButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9657368182784L, 71953);
    this.myW = true;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15405108166656L, 114777);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15405108166656L, 114777);
          return false;
        }
        MyLocationButton.a(MyLocationButton.this).setVisibility(8);
        MyLocationButton.b(MyLocationButton.this).setVisibility(0);
        if ((MyLocationButton.c(MyLocationButton.this) != null) && (MyLocationButton.d(MyLocationButton.this)))
        {
          MyLocationButton.c(MyLocationButton.this).getIController().setCenter(paramAnonymousFloat2, paramAnonymousFloat1);
          if (MyLocationButton.c(MyLocationButton.this).getZoomLevel() < 16) {
            MyLocationButton.c(MyLocationButton.this).getIController().setZoom(16);
          }
        }
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9717095071744L, 72398);
            c.Ir().c(MyLocationButton.e(MyLocationButton.this));
            GMTrace.o(9717095071744L, 72398);
          }
        });
        GMTrace.o(15405108166656L, 114777);
        return false;
      }
    };
    this.context = paramContext;
    init();
    GMTrace.o(9657368182784L, 71953);
  }
  
  private void init()
  {
    GMTrace.i(9657636618240L, 71955);
    View localView = View.inflate(this.context, R.i.cCI, this);
    this.myT = ((ImageButton)localView.findViewById(R.h.bKS));
    this.myU = ((LinearLayout)localView.findViewById(R.h.bUv));
    GMTrace.o(9657636618240L, 71955);
  }
  
  public final void aKG()
  {
    GMTrace.i(9657770835968L, 71956);
    this.myT.setImageResource(R.g.aYU);
    GMTrace.o(9657770835968L, 71956);
  }
  
  public final void aKH()
  {
    GMTrace.i(9657905053696L, 71957);
    this.myT.setImageResource(R.g.aYV);
    GMTrace.o(9657905053696L, 71957);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(9658039271424L, 71958);
    this.myT.setOnClickListener(paramOnClickListener);
    GMTrace.o(9658039271424L, 71958);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\MyLocationButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */