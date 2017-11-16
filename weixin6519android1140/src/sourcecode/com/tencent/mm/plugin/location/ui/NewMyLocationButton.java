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
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.p.b;
import com.tencent.mm.plugin.p.d;
import com.tencent.mm.sdk.platformtools.ae;

public class NewMyLocationButton
  extends FrameLayout
{
  private Context context;
  private a.a fJt;
  private ImageButton myT;
  private LinearLayout myU;
  private d myV;
  private boolean myW;
  
  public NewMyLocationButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9663139545088L, 71996);
    this.myW = true;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15405510819840L, 114780);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15405510819840L, 114780);
          return false;
        }
        NewMyLocationButton.a(NewMyLocationButton.this).setVisibility(8);
        NewMyLocationButton.b(NewMyLocationButton.this).setVisibility(0);
        if ((NewMyLocationButton.c(NewMyLocationButton.this) != null) && (NewMyLocationButton.d(NewMyLocationButton.this)))
        {
          NewMyLocationButton.c(NewMyLocationButton.this).getIController().setCenter(paramAnonymousFloat2, paramAnonymousFloat1);
          if (NewMyLocationButton.c(NewMyLocationButton.this).getZoomLevel() < 16) {
            NewMyLocationButton.c(NewMyLocationButton.this).getIController().setZoom(16);
          }
        }
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9649315119104L, 71893);
            c.Ir().c(NewMyLocationButton.e(NewMyLocationButton.this));
            GMTrace.o(9649315119104L, 71893);
          }
        });
        GMTrace.o(15405510819840L, 114780);
        return false;
      }
    };
    this.context = paramContext;
    init();
    GMTrace.o(9663139545088L, 71996);
  }
  
  public NewMyLocationButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9663005327360L, 71995);
    this.myW = true;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15405510819840L, 114780);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15405510819840L, 114780);
          return false;
        }
        NewMyLocationButton.a(NewMyLocationButton.this).setVisibility(8);
        NewMyLocationButton.b(NewMyLocationButton.this).setVisibility(0);
        if ((NewMyLocationButton.c(NewMyLocationButton.this) != null) && (NewMyLocationButton.d(NewMyLocationButton.this)))
        {
          NewMyLocationButton.c(NewMyLocationButton.this).getIController().setCenter(paramAnonymousFloat2, paramAnonymousFloat1);
          if (NewMyLocationButton.c(NewMyLocationButton.this).getZoomLevel() < 16) {
            NewMyLocationButton.c(NewMyLocationButton.this).getIController().setZoom(16);
          }
        }
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9649315119104L, 71893);
            c.Ir().c(NewMyLocationButton.e(NewMyLocationButton.this));
            GMTrace.o(9649315119104L, 71893);
          }
        });
        GMTrace.o(15405510819840L, 114780);
        return false;
      }
    };
    this.context = paramContext;
    init();
    GMTrace.o(9663005327360L, 71995);
  }
  
  private void init()
  {
    GMTrace.i(9663273762816L, 71997);
    View localView = View.inflate(this.context, R.i.cDd, this);
    this.myT = ((ImageButton)localView.findViewById(R.h.bQK));
    this.myU = ((LinearLayout)localView.findViewById(R.h.bQM));
    GMTrace.o(9663273762816L, 71997);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(9663407980544L, 71998);
    this.myT.setOnClickListener(paramOnClickListener);
    GMTrace.o(9663407980544L, 71998);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\NewMyLocationButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */