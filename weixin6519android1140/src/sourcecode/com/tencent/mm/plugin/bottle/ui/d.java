package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public final class d
  extends Toast
{
  Context context;
  private TextView huP;
  private View view;
  
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(7644639133696L, 56957);
    this.context = paramContext;
    this.view = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(R.i.cqw, null);
    this.huP = ((TextView)this.view.findViewById(R.h.bio));
    setGravity(17, 0, 0);
    setDuration(0);
    setView(this.view);
    GMTrace.o(7644639133696L, 56957);
  }
  
  public final void setText(int paramInt)
  {
    GMTrace.i(7644907569152L, 56959);
    setText(this.context.getString(paramInt));
    GMTrace.o(7644907569152L, 56959);
  }
  
  public final void setText(CharSequence paramCharSequence)
  {
    GMTrace.i(7644773351424L, 56958);
    this.huP.setText(paramCharSequence);
    GMTrace.o(7644773351424L, 56958);
  }
  
  public final void show()
  {
    GMTrace.i(7645041786880L, 56960);
    super.show();
    GMTrace.o(7645041786880L, 56960);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */