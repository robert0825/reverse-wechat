package com.tencent.mm.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bw.d.b;
import com.tencent.mm.sdk.platformtools.ae;
import java.lang.ref.WeakReference;

public final class d
{
  public static int vXV;
  
  static
  {
    GMTrace.i(1846701719552L, 13759);
    vXV = 0;
    GMTrace.o(1846701719552L, 13759);
  }
  
  public d()
  {
    GMTrace.i(1846299066368L, 13756);
    GMTrace.o(1846299066368L, 13756);
  }
  
  public static void fi(Context paramContext)
  {
    GMTrace.i(1846433284096L, 13757);
    if (vXV > 0)
    {
      GMTrace.o(1846433284096L, 13757);
      return;
    }
    paramContext = new a(paramContext, LayoutInflater.from(paramContext).inflate(R.i.cHa, null));
    paramContext.vXD.addView(paramContext.vXC, paramContext.vXE);
    vXV += 1;
    GMTrace.o(1846433284096L, 13757);
  }
  
  public static final class a
  {
    public Context context;
    ImageView eKZ;
    public ProgressBar eLb;
    public TextView lWz;
    View mView;
    public FrameLayout vXC;
    public WindowManager vXD;
    public WindowManager.LayoutParams vXE;
    private ViewGroup.LayoutParams vXF;
    public boolean vXW;
    d.b vXX;
    com.tencent.mm.bw.d.a vXY;
    public int vXZ;
    ae vYa;
    
    public a(final Context paramContext, View paramView)
    {
      GMTrace.i(1852338864128L, 13801);
      this.vXW = false;
      this.vXX = new d.b()
      {
        public final void bVI()
        {
          GMTrace.i(1845896413184L, 13753);
          d.a.this.fj(d.a.this.context);
          Toast.makeText(d.a.this.context, "trace file has saved ", 0).show();
          GMTrace.o(1845896413184L, 13753);
        }
      };
      this.vXZ = 0;
      this.vYa = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(1852204646400L, 13800);
          if (d.a.this.lWz.getVisibility() != 0)
          {
            d.a.this.vXZ = 0;
            GMTrace.o(1852204646400L, 13800);
            return;
          }
          d.a locala = d.a.this;
          locala.vXZ += 1;
          d.a.this.bZp();
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(1852204646400L, 13800);
        }
      };
      if ((this.vXC != null) && (this.vXD != null))
      {
        GMTrace.o(1852338864128L, 13801);
        return;
      }
      com.tencent.mm.bw.d.bVG().vFp = new WeakReference(this.vXX);
      this.lWz = ((TextView)paramView.findViewById(R.h.time));
      this.eKZ = ((ImageView)paramView.findViewById(R.h.button));
      ((ImageView)paramView.findViewById(R.h.btf)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1853278388224L, 13808);
          if ((d.a.this.vXW) && (d.a.this.eLb.getVisibility() != 0)) {
            com.tencent.mm.bw.d.bVG().b(d.a.this.vXY);
          }
          paramAnonymousView = d.a.this;
          try
          {
            if (paramAnonymousView.vXD != null)
            {
              if (paramAnonymousView.vXC != null) {
                paramAnonymousView.vXD.removeView(paramAnonymousView.vXC);
              }
              paramAnonymousView.vXD = null;
            }
            if (paramAnonymousView.vXC != null)
            {
              paramAnonymousView.vXC.removeAllViews();
              paramAnonymousView.vXC = null;
            }
            paramAnonymousView.mView = null;
          }
          catch (Exception paramAnonymousView)
          {
            for (;;) {}
          }
          d.vXV -= 1;
          GMTrace.o(1853278388224L, 13808);
        }
      });
      this.eLb = ((ProgressBar)paramView.findViewById(R.h.bPi));
      this.eLb.setVisibility(8);
      this.context = paramContext;
      this.vXE = new WindowManager.LayoutParams();
      this.vXE.height = -2;
      this.vXE.width = -2;
      this.vXD = ((WindowManager)paramContext.getSystemService("window"));
      this.vXE.x = 0;
      this.vXE.y = 0;
      this.vXE.flags = 40;
      this.vXE.type = 2002;
      this.mView = paramView;
      this.lWz.setVisibility(8);
      this.vXE.gravity = 51;
      this.vXE.format = 1;
      this.vXC = new FrameLayout(paramContext);
      this.vXC.setPadding(4, 4, 4, 4);
      this.vXF = new ViewGroup.LayoutParams(-2, -2);
      this.vXC.addView(this.mView, this.vXF);
      paramContext = paramContext.getResources().getDisplayMetrics();
      this.vXC.setOnTouchListener(new View.OnTouchListener()
      {
        int vXH;
        int vXI;
        int vXJ;
        int vXK;
        long vXL;
        
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(1853546823680L, 13810);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(1853546823680L, 13810);
            return false;
            this.vXH = ((int)paramAnonymousMotionEvent.getRawX() - d.a.this.vXE.x);
            this.vXI = ((int)paramAnonymousMotionEvent.getRawY() - d.a.this.vXE.y);
            this.vXL = System.currentTimeMillis();
            continue;
            this.vXJ = (paramContext.widthPixels - d.a.this.vXE.width - 1);
            this.vXK = (paramContext.heightPixels - d.a.this.vXE.height - 1);
            d.a.this.vXE.x = ((int)paramAnonymousMotionEvent.getRawX() - this.vXH);
            d.a.this.vXE.y = ((int)paramAnonymousMotionEvent.getRawY() - this.vXI);
            paramAnonymousView = d.a.this.vXE;
            if (d.a.this.vXE.x < 0)
            {
              i = 0;
              label212:
              paramAnonymousView.x = i;
              paramAnonymousView = d.a.this.vXE;
              if (d.a.this.vXE.x <= this.vXJ) {
                break label358;
              }
              i = this.vXJ;
              label247:
              paramAnonymousView.x = i;
              paramAnonymousView = d.a.this.vXE;
              if (d.a.this.vXE.y >= 0) {
                break label372;
              }
              i = 0;
              label275:
              paramAnonymousView.y = i;
              paramAnonymousView = d.a.this.vXE;
              if (d.a.this.vXE.y <= this.vXK) {
                break label386;
              }
            }
            label358:
            label372:
            label386:
            for (int i = this.vXK;; i = d.a.this.vXE.y)
            {
              paramAnonymousView.y = i;
              d.a.this.vXD.updateViewLayout(d.a.this.vXC, d.a.this.vXE);
              break;
              i = d.a.this.vXE.x;
              break label212;
              i = d.a.this.vXE.x;
              break label247;
              i = d.a.this.vXE.y;
              break label275;
            }
            if (System.currentTimeMillis() - this.vXL < 300L)
            {
              paramAnonymousView = d.a.this;
              paramAnonymousView.vYa.removeMessages(0);
              paramAnonymousView.vXZ = 0;
              if (!paramAnonymousView.vXW) {
                break;
              }
              paramAnonymousView.eLb.setVisibility(0);
              paramAnonymousView.eKZ.setVisibility(4);
              if (!com.tencent.mm.bw.d.bVG().b(paramAnonymousView.vXY)) {
                paramAnonymousView.fj(paramAnonymousView.context);
              }
            }
          }
          paramAnonymousView.eKZ.setVisibility(0);
          paramAnonymousView.eKZ.setBackgroundDrawable(paramAnonymousView.context.getResources().getDrawable(R.g.bbg));
          if (!paramAnonymousView.vXW) {}
          for (boolean bool = true;; bool = false)
          {
            paramAnonymousView.vXW = bool;
            paramAnonymousView.vXY = new com.tencent.mm.bw.d.a(null, 6, 8, 0);
            com.tencent.mm.bw.d.bVG().c(paramAnonymousView.vXY);
            paramAnonymousView.bZp();
            break;
          }
        }
      });
      GMTrace.o(1852338864128L, 13801);
    }
    
    public final void bZp()
    {
      GMTrace.i(1852607299584L, 13803);
      this.lWz.setText(this.vXZ);
      this.vYa.sendEmptyMessageDelayed(0, 1000L);
      GMTrace.o(1852607299584L, 13803);
    }
    
    public final void fj(Context paramContext)
    {
      boolean bool = false;
      GMTrace.i(1852473081856L, 13802);
      this.eKZ.setVisibility(0);
      this.eLb.setVisibility(4);
      if (!this.vXW) {
        bool = true;
      }
      this.vXW = bool;
      this.eKZ.setBackgroundDrawable(paramContext.getResources().getDrawable(R.g.bbf));
      this.lWz.setVisibility(8);
      GMTrace.o(1852473081856L, 13802);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\applet\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */