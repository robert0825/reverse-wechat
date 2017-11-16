package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.k;
import java.lang.reflect.Field;

public final class u
  extends Toast
{
  private final Context context;
  public long duration;
  public final aj euU;
  private View iku;
  public int jIt;
  private int level;
  private final TextView mpu;
  
  public u(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(3242297655296L, 24157);
    this.euU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3154116608000L, 23500);
        if (u.a(u.this) == -1L)
        {
          u.this.show();
          GMTrace.o(3154116608000L, 23500);
          return true;
        }
        u.b(u.this);
        if (u.c(u.this) >= 0)
        {
          u.this.show();
          GMTrace.o(3154116608000L, 23500);
          return true;
        }
        u.this.cancel();
        GMTrace.o(3154116608000L, 23500);
        return false;
      }
    }, true);
    this.context = paramContext;
    reset();
    this.iku = View.inflate(paramContext, a.h.gfT, null);
    setView(this.iku);
    setGravity(55, 0, BackwardSupportUtil.b.a(paramContext, 40.0F));
    setDuration(0);
    this.mpu = ((TextView)this.iku.findViewById(a.g.geD));
    switch (this.level)
    {
    }
    for (;;)
    {
      GMTrace.o(3242297655296L, 24157);
      return;
      this.mpu.setTextColor(-1);
      GMTrace.o(3242297655296L, 24157);
      return;
      this.mpu.setTextColor(this.context.getResources().getColor(a.d.gcw));
    }
  }
  
  public static q a(final Activity paramActivity, int paramInt, String paramString)
  {
    GMTrace.i(3243102961664L, 24163);
    View localView = View.inflate(paramActivity, a.h.geX, null);
    Object localObject = (TextView)localView.findViewById(a.g.bKm);
    ((TextView)localObject).setText(paramString);
    ((TextView)localObject).setOnClickListener(null);
    paramString = (ImageView)localView.findViewById(a.g.bKl);
    if (paramInt == 0) {
      paramString.setVisibility(8);
    }
    for (;;)
    {
      paramString = new q(localView);
      paramString.setWidth(-1);
      paramString.setHeight(-2);
      localObject = new Rect();
      paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject);
      int i = ((Rect)localObject).top;
      int j = bX(paramActivity);
      paramInt = i;
      if (i == 0) {
        paramInt = ad(paramActivity, 25);
      }
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18742029320192L, 139639);
          this.wfJ.showAtLocation(paramActivity.getWindow().getDecorView(), 48, 0, this.wfK);
          GMTrace.o(18742029320192L, 139639);
        }
      });
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20356534370304L, 151668);
          this.wfJ.dismiss();
          GMTrace.o(20356534370304L, 151668);
        }
      }, 2000L);
      paramActivity = (ImageButton)localView.findViewById(a.g.bKk);
      paramActivity.setVisibility(8);
      paramActivity.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20355863281664L, 151663);
          this.wfJ.dismiss();
          GMTrace.o(20355863281664L, 151663);
        }
      });
      GMTrace.o(3243102961664L, 24163);
      return paramString;
      paramString.setImageResource(paramInt);
    }
  }
  
  public static q a(Activity paramActivity, String paramString, long paramLong)
  {
    GMTrace.i(3242834526208L, 24161);
    Object localObject = View.inflate(paramActivity, a.h.gfT, null);
    ((TextView)((View)localObject).findViewById(a.g.geD)).setText(paramString);
    paramString = new q((View)localObject);
    paramString.setWidth(-1);
    paramString.setHeight(-2);
    localObject = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject);
    int i = ((Rect)localObject).top;
    int j = bX(paramActivity);
    paramString.showAtLocation(paramActivity.getWindow().getDecorView(), 48, 0, i + j);
    new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(3287126376448L, 24491);
        this.wfJ.dismiss();
        super.handleMessage(paramAnonymousMessage);
        GMTrace.o(3287126376448L, 24491);
      }
    }.sendEmptyMessageDelayed(0, paramLong);
    GMTrace.o(3242834526208L, 24161);
    return paramString;
  }
  
  public static int ad(Context paramContext, int paramInt)
  {
    GMTrace.i(3243639832576L, 24167);
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int i = bg.getInt(localClass.getField("status_bar_height").get(localObject).toString(), 0);
      i = paramContext.getResources().getDimensionPixelSize(i);
      paramInt = i;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MMToast", paramContext, "", new Object[0]);
      }
    }
    GMTrace.o(3243639832576L, 24167);
    return paramInt;
  }
  
  private static int bX(Context paramContext)
  {
    GMTrace.i(3242968743936L, 24162);
    int i;
    if (((paramContext instanceof ActionBarActivity)) && (((ActionBarActivity)paramContext).cN().cO() != null)) {
      i = ((ActionBarActivity)paramContext).cN().cO().getHeight();
    }
    while (i == 0)
    {
      i = paramContext.getResources().getDimensionPixelSize(a.e.aPN);
      GMTrace.o(3242968743936L, 24162);
      return i;
      DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels) {
        i = paramContext.getResources().getDimensionPixelSize(a.e.aPM);
      } else {
        i = paramContext.getResources().getDimensionPixelSize(a.e.aPN);
      }
    }
    GMTrace.o(3242968743936L, 24162);
    return i;
  }
  
  public static void fo(Context paramContext)
  {
    GMTrace.i(3243237179392L, 24164);
    if (h.getExternalStorageState().equals("mounted_ro"))
    {
      a.ae(paramContext, 3);
      GMTrace.o(3243237179392L, 24164);
      return;
    }
    a.ae(paramContext, 1);
    GMTrace.o(3243237179392L, 24164);
  }
  
  public static void fp(Context paramContext)
  {
    GMTrace.i(3243371397120L, 24165);
    a.ae(paramContext, 2);
    GMTrace.o(3243371397120L, 24165);
  }
  
  public static int fq(Context paramContext)
  {
    GMTrace.i(15690186620928L, 116901);
    int i = ad(paramContext, 25);
    GMTrace.o(15690186620928L, 116901);
    return i;
  }
  
  public final void reset()
  {
    GMTrace.i(3242700308480L, 24160);
    this.level = 1;
    this.duration = 2000L;
    this.jIt = ((int)(this.duration / 70L) + 1);
    GMTrace.o(3242700308480L, 24160);
  }
  
  public final void setText(int paramInt)
  {
    GMTrace.i(3242566090752L, 24159);
    this.mpu.setText(paramInt);
    GMTrace.o(3242566090752L, 24159);
  }
  
  public final void setText(CharSequence paramCharSequence)
  {
    GMTrace.i(3242431873024L, 24158);
    this.mpu.setText(paramCharSequence);
    GMTrace.o(3242431873024L, 24158);
  }
  
  private static final class a
  {
    private static Toast tBO;
    public static int wfL;
    
    static
    {
      GMTrace.i(3369804496896L, 25107);
      tBO = null;
      wfL = 0;
      GMTrace.o(3369804496896L, 25107);
    }
    
    public static void ae(Context paramContext, int paramInt)
    {
      GMTrace.i(3369670279168L, 25106);
      paramContext = paramContext.getApplicationContext();
      if (wfL != paramInt)
      {
        tBO = null;
        wfL = paramInt;
      }
      if (tBO == null) {
        tBO = Toast.makeText(paramContext, "", 1);
      }
      paramContext = View.inflate(paramContext, a.h.gfN, null);
      if (paramInt == 1) {
        ((TextView)paramContext.findViewById(a.g.gdV)).setText(a.k.ggn);
      }
      for (;;)
      {
        tBO.setView(paramContext);
        tBO.show();
        GMTrace.o(3369670279168L, 25106);
        return;
        if (paramInt == 3) {
          ((TextView)paramContext.findViewById(a.g.gdV)).setText(a.k.ggo);
        } else {
          ((TextView)paramContext.findViewById(a.g.gdV)).setText(a.k.ggp);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */