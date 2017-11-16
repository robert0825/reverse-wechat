package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.DrawedCallBackLinearLayout;

public class TestTimeForChatting
  extends DrawedCallBackLinearLayout
{
  public final String TAG;
  public int gbf;
  public int xjO;
  public int xjP;
  public a yvL;
  
  public TestTimeForChatting(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1943204265984L, 14478);
    this.TAG = "MicroMsg.TestTimeForChatting";
    this.gbf = 0;
    this.xjO = 0;
    this.xjP = 0;
    GMTrace.o(1943204265984L, 14478);
  }
  
  public TestTimeForChatting(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1943338483712L, 14479);
    this.TAG = "MicroMsg.TestTimeForChatting";
    this.gbf = 0;
    this.xjO = 0;
    this.xjP = 0;
    GMTrace.o(1943338483712L, 14479);
  }
  
  public final void ciy()
  {
    GMTrace.i(1943606919168L, 14481);
    w.i("MicroMsg.TestTimeForChatting", "klem frameCount:%d", new Object[] { Integer.valueOf(this.gbf) });
    g.ork.i(11198, new Object[] { Integer.valueOf(this.gbf) });
    GMTrace.o(1943606919168L, 14481);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(1943741136896L, 14482);
    this.gbf += 1;
    try
    {
      super.dispatchDraw(paramCanvas);
      f.tq(9);
      f.tq(18);
      f.tq(25);
      f.tq(24);
      f.tq(20);
      f.tq(18);
      if (this.yvL != null) {
        this.yvL.cuc();
      }
      GMTrace.o(1943741136896L, 14482);
      return;
    }
    catch (Throwable paramCanvas)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TestTimeForChatting", paramCanvas, "dispatchDraw", new Object[0]);
      }
    }
  }
  
  public boolean fitSystemWindows(Rect paramRect)
  {
    GMTrace.i(1943875354624L, 14483);
    w.d("MicroMsg.TestTimeForChatting", "ashu::fitSystemWindows: %s, fixBottomPadding:%d fixRightPadding:%d", new Object[] { paramRect.toString(), Integer.valueOf(this.xjO), Integer.valueOf(this.xjP) });
    paramRect.bottom += this.xjO;
    paramRect.right += this.xjP;
    boolean bool = super.fitSystemWindows(paramRect);
    GMTrace.o(1943875354624L, 14483);
    return bool;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(21037420904448L, 156741);
    long l = System.currentTimeMillis();
    super.onDraw(paramCanvas);
    w.i("MicroMsg.TestTimeForChatting", System.currentTimeMillis() - l);
    GMTrace.o(21037420904448L, 156741);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1943472701440L, 14480);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(1943472701440L, 14480);
  }
  
  public static abstract interface a
  {
    public abstract void cuc();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\TestTimeForChatting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */