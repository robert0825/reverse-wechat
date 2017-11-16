package com.tencent.mm.ui.applet;

import android.content.Context;
import android.content.res.Resources;
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
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bw.b;

public final class c
{
  public c()
  {
    GMTrace.i(1849386074112L, 13779);
    GMTrace.o(1849386074112L, 13779);
  }
  
  public static void fh(Context paramContext)
  {
    GMTrace.i(1849520291840L, 13780);
    paramContext = new a(paramContext, LayoutInflater.from(paramContext).inflate(R.i.cHa, null));
    paramContext.vXD.addView(paramContext.vXC, paramContext.vXE);
    GMTrace.o(1849520291840L, 13780);
  }
  
  public static final class a
  {
    private ImageView eKZ;
    private View mView;
    public FrameLayout vXC;
    public WindowManager vXD;
    public WindowManager.LayoutParams vXE;
    private ViewGroup.LayoutParams vXF;
    
    public a(final Context paramContext, View paramView)
    {
      GMTrace.i(1848178114560L, 13770);
      if ((this.vXC != null) && (this.vXD != null))
      {
        GMTrace.o(1848178114560L, 13770);
        return;
      }
      paramView.findViewById(R.h.bPi).setVisibility(8);
      this.eKZ = ((ImageView)paramView.findViewById(R.h.button));
      ((ImageView)paramView.findViewById(R.h.btf)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1848043896832L, 13769);
          c.a.this.bZn();
          GMTrace.o(1848043896832L, 13769);
        }
      });
      this.vXE = new WindowManager.LayoutParams();
      this.vXE.height = -2;
      this.vXE.width = -2;
      this.vXD = ((WindowManager)paramContext.getSystemService("window"));
      this.vXE.x = 0;
      this.vXE.y = 0;
      this.vXE.flags = 40;
      this.vXE.type = 2002;
      this.mView = paramView;
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
          GMTrace.i(1846164848640L, 13755);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(1846164848640L, 13755);
            return false;
            this.vXH = ((int)paramAnonymousMotionEvent.getRawX() - c.a.this.vXE.x);
            this.vXI = ((int)paramAnonymousMotionEvent.getRawY() - c.a.this.vXE.y);
            this.vXL = System.currentTimeMillis();
            continue;
            this.vXJ = (paramContext.widthPixels - c.a.this.vXE.width - 1);
            this.vXK = (paramContext.heightPixels - c.a.this.vXE.height - 1);
            c.a.this.vXE.x = ((int)paramAnonymousMotionEvent.getRawX() - this.vXH);
            c.a.this.vXE.y = ((int)paramAnonymousMotionEvent.getRawY() - this.vXI);
            paramAnonymousView = c.a.this.vXE;
            if (c.a.this.vXE.x < 0)
            {
              i = 0;
              label212:
              paramAnonymousView.x = i;
              paramAnonymousView = c.a.this.vXE;
              if (c.a.this.vXE.x <= this.vXJ) {
                break label358;
              }
              i = this.vXJ;
              label247:
              paramAnonymousView.x = i;
              paramAnonymousView = c.a.this.vXE;
              if (c.a.this.vXE.y >= 0) {
                break label372;
              }
              i = 0;
              label275:
              paramAnonymousView.y = i;
              paramAnonymousView = c.a.this.vXE;
              if (c.a.this.vXE.y <= this.vXK) {
                break label386;
              }
            }
            label358:
            label372:
            label386:
            for (int i = this.vXK;; i = c.a.this.vXE.y)
            {
              paramAnonymousView.y = i;
              c.a.this.vXD.updateViewLayout(c.a.this.vXC, c.a.this.vXE);
              break;
              i = c.a.this.vXE.x;
              break label212;
              i = c.a.this.vXE.x;
              break label247;
              i = c.a.this.vXE.y;
              break label275;
            }
            if (System.currentTimeMillis() - this.vXL < 300L)
            {
              b.bVE();
              b.K(false, true);
              c.a.this.bZn();
            }
          }
        }
      });
      GMTrace.o(1848178114560L, 13770);
    }
    
    public final void bZn()
    {
      GMTrace.i(1848312332288L, 13771);
      try
      {
        if (this.vXD != null)
        {
          if (this.vXC != null) {
            this.vXD.removeView(this.vXC);
          }
          this.vXD = null;
        }
        if (this.vXC != null)
        {
          this.vXC.removeAllViews();
          this.vXC = null;
        }
        this.mView = null;
        GMTrace.o(1848312332288L, 13771);
        return;
      }
      catch (Exception localException)
      {
        GMTrace.o(1848312332288L, 13771);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\applet\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */