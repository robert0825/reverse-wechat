package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.ui.base.k;

public final class b
  extends k
{
  TextView huP;
  private Button jql;
  private View view;
  
  public b(Context paramContext)
  {
    super(paramContext, R.m.emi);
    GMTrace.i(7601555243008L, 56636);
    this.view = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(R.i.cqr, null);
    setContentView(this.view, new ViewGroup.LayoutParams(-2, -2));
    this.huP = ((TextView)this.view.findViewById(R.h.bhE));
    this.jql = ((Button)this.view.findViewById(R.h.bhD));
    this.jql.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7628264570880L, 56835);
        b.this.dismiss();
        GMTrace.o(7628264570880L, 56835);
      }
    });
    GMTrace.o(7601555243008L, 56636);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */