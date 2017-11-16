package com.tencent.mm.ui.conversation;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public class ConversationOverscrollListView
  extends ListView
  implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, AdapterView.OnItemSelectedListener, aj.a
{
  private static final boolean wXg;
  private int Aj;
  private AdapterView.OnItemClickListener RZ;
  private AdapterView.OnItemSelectedListener Sa;
  private Rect eI;
  private aj htb;
  private c wXh;
  private a wXi;
  private boolean wXj;
  private int wXk;
  private int wXl;
  private float wXm;
  private long wXn;
  private final float wXo;
  private final float wXp;
  private float wXq;
  private b wXr;
  private final int wXs;
  private AdapterView.OnItemLongClickListener wXt;
  
  static
  {
    GMTrace.i(3403358928896L, 25357);
    wXg = d.ev(10);
    GMTrace.o(3403358928896L, 25357);
  }
  
  public ConversationOverscrollListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3401614098432L, 25344);
    this.eI = new Rect();
    this.Aj = 0;
    this.wXj = false;
    this.wXk = 0;
    this.wXl = 0;
    this.wXm = 0.0F;
    this.wXn = 1L;
    this.wXo = 3.5F;
    this.wXp = 13.5F;
    this.wXq = 0.0F;
    this.wXr = new b();
    this.wXs = 50;
    this.wXh = new c();
    super.setOnItemClickListener(this);
    super.setOnItemLongClickListener(this);
    super.setOnItemSelectedListener(this);
    this.htb = new aj(this, false);
    GMTrace.o(3401614098432L, 25344);
  }
  
  @TargetApi(11)
  protected void onFinishInflate()
  {
    GMTrace.i(3401748316160L, 25345);
    GMTrace.o(3401748316160L, 25345);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(3402553622528L, 25351);
    this.wXj = true;
    if (this.RZ != null) {
      this.RZ.onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    }
    GMTrace.o(3402553622528L, 25351);
  }
  
  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(3402956275712L, 25354);
    this.wXj = true;
    if (this.wXt != null)
    {
      boolean bool = this.wXt.onItemLongClick(paramAdapterView, paramView, paramInt, paramLong);
      GMTrace.o(3402956275712L, 25354);
      return bool;
    }
    GMTrace.o(3402956275712L, 25354);
    return false;
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(3402687840256L, 25352);
    this.wXj = true;
    if (this.Sa != null) {
      this.Sa.onItemSelected(paramAdapterView, paramView, paramInt, paramLong);
    }
    GMTrace.o(3402687840256L, 25352);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3402016751616L, 25347);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(3402016751616L, 25347);
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
    GMTrace.i(3402822057984L, 25353);
    if (this.Sa != null) {
      this.Sa.onNothingSelected(paramAdapterView);
    }
    GMTrace.o(3402822057984L, 25353);
  }
  
  @TargetApi(11)
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3401882533888L, 25346);
    boolean bool = super.onTouchEvent(paramMotionEvent);
    GMTrace.o(3401882533888L, 25346);
    return bool;
  }
  
  public final boolean pM()
  {
    GMTrace.i(3403090493440L, 25355);
    GMTrace.o(3403090493440L, 25355);
    return false;
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    GMTrace.i(3402150969344L, 25348);
    this.RZ = paramOnItemClickListener;
    GMTrace.o(3402150969344L, 25348);
  }
  
  public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    GMTrace.i(3402285187072L, 25349);
    this.wXt = paramOnItemLongClickListener;
    GMTrace.o(3402285187072L, 25349);
  }
  
  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    GMTrace.i(3402419404800L, 25350);
    this.Sa = paramOnItemSelectedListener;
    GMTrace.o(3402419404800L, 25350);
  }
  
  public static abstract interface a
  {
    public abstract boolean cgX();
  }
  
  public final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(3415304306688L, 25446);
      GMTrace.o(3415304306688L, 25446);
    }
    
    public final void run()
    {
      GMTrace.i(3415438524416L, 25447);
      if ((ConversationOverscrollListView.a(ConversationOverscrollListView.this) != null) && (!ConversationOverscrollListView.a(ConversationOverscrollListView.this).cgX()))
      {
        w.d("MicroMsg.ConversationOverscrollListView", "jacks cancel to Show Main");
        ConversationOverscrollListView.a(ConversationOverscrollListView.this);
      }
      GMTrace.o(3415438524416L, 25447);
    }
  }
  
  private static final class c
    implements Interpolator
  {
    private float oaT;
    
    public c()
    {
      GMTrace.i(3404432670720L, 25365);
      this.oaT = 1.3F;
      GMTrace.o(3404432670720L, 25365);
    }
    
    public final float getInterpolation(float paramFloat)
    {
      GMTrace.i(3404566888448L, 25366);
      paramFloat -= 1.0F;
      paramFloat = (paramFloat * (this.oaT + 1.0F) + this.oaT) * (paramFloat * paramFloat) + 1.0F;
      if (paramFloat > 1.0F)
      {
        GMTrace.o(3404566888448L, 25366);
        return 1.0F;
      }
      GMTrace.o(3404566888448L, 25366);
      return paramFloat;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\conversation\ConversationOverscrollListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */