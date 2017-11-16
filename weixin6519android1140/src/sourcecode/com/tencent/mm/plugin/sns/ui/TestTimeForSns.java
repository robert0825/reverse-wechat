package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.f;

public class TestTimeForSns
  extends FrameLayout
{
  public final boolean DEBUG;
  public final String TAG;
  public long beginTime;
  private boolean hasDrawed;
  private a listener;
  
  public TestTimeForSns(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8634629095424L, 64333);
    this.DEBUG = true;
    this.TAG = "MicroMsg.TestTimeForSns";
    GMTrace.o(8634629095424L, 64333);
  }
  
  public TestTimeForSns(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8634763313152L, 64334);
    this.DEBUG = true;
    this.TAG = "MicroMsg.TestTimeForSns";
    GMTrace.o(8634763313152L, 64334);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(8634897530880L, 64335);
    super.dispatchDraw(paramCanvas);
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if (this.listener != null) {
        this.listener.aDr();
      }
    }
    f.tq(10);
    f.tq(22);
    GMTrace.o(8634897530880L, 64335);
  }
  
  public boolean hasDrawed()
  {
    GMTrace.i(8635165966336L, 64337);
    boolean bool = this.hasDrawed;
    GMTrace.o(8635165966336L, 64337);
    return bool;
  }
  
  public void setListener(a parama)
  {
    GMTrace.i(8635031748608L, 64336);
    this.listener = parama;
    GMTrace.o(8635031748608L, 64336);
  }
  
  public static abstract interface a
  {
    public abstract void aDr();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\TestTimeForSns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */