package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;

public class EasyTextView
  extends View
{
  private static final Paint gid;
  private static int textSize;
  private Context context;
  private String text;
  
  static
  {
    GMTrace.i(8371696566272L, 62374);
    gid = new Paint();
    textSize = -1;
    gid.setAntiAlias(true);
    gid.setFilterBitmap(true);
    gid.setColor(737373);
    GMTrace.o(8371696566272L, 62374);
  }
  
  public EasyTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8371428130816L, 62372);
    this.text = "";
    this.context = paramContext;
    if (textSize == -1)
    {
      textSize = BackwardSupportUtil.b.a(this.context, 12.0F);
      gid.setTextSize(textSize);
    }
    gid.setColor(this.context.getResources().getColor(i.c.black));
    GMTrace.o(8371428130816L, 62372);
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(8371562348544L, 62373);
    super.draw(paramCanvas);
    int i = getHeight();
    paramCanvas.drawText(this.text, 0.0F, i / 2, gid);
    GMTrace.o(8371562348544L, 62373);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\EasyTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */