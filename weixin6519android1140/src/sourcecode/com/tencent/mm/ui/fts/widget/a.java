package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public final class a
  extends LinearLayout
{
  private View mCv;
  public FTSEditTextView xdt;
  public a xdu;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(16797214441472L, 125149);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(a.h.geT, this, true);
    this.mCv = findViewById(a.g.bcj);
    this.mCv.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16797080223744L, 125148);
        if (a.a(a.this) != null) {
          a.a(a.this).bdM();
        }
        GMTrace.o(16797080223744L, 125148);
      }
    });
    this.xdt = ((FTSEditTextView)findViewById(a.g.bCi));
    GMTrace.o(16797214441472L, 125149);
  }
  
  public static abstract interface a
  {
    public abstract void bdM();
  }
  
  public static abstract interface b
    extends Comparable
  {
    public abstract String getTagName();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\fts\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */