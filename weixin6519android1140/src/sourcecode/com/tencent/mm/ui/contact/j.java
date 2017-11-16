package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.af.m;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class j
  extends LinearLayout
{
  private Context context;
  private String gvB;
  
  public j(Context paramContext, String paramString)
  {
    super(paramContext);
    GMTrace.i(1841601445888L, 13721);
    this.context = paramContext;
    this.gvB = paramString;
    paramContext = View.inflate(getContext(), R.i.cvi, this);
    paramString = findViewById(R.h.bwT);
    paramContext.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1837574914048L, 13691);
        Intent localIntent = new Intent();
        localIntent.putExtra("enterprise_from_scene", 2);
        localIntent.putExtra("enterprise_biz_name", j.a(j.this));
        d.b(paramAnonymousView.getContext(), "brandservice", ".ui.EnterpriseBizContactListUI", localIntent);
        GMTrace.o(1837574914048L, 13691);
      }
    });
    paramString.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1810731368448L, 13491);
        if ((j.b(j.this) instanceof MMActivity)) {
          ((MMActivity)j.b(j.this)).aLo();
        }
        GMTrace.o(1810731368448L, 13491);
        return false;
      }
    });
    at.AR();
    paramContext = c.yK().TC(this.gvB);
    if ((paramContext == null) || ((int)paramContext.fTq <= 0))
    {
      w.e("MicroMsg.EnterpriseBizViewItem", "contact is null, %s", new Object[] { this.gvB });
      GMTrace.o(1841601445888L, 13721);
      return;
    }
    paramString = (MaskLayout)paramString.findViewById(R.h.bhq);
    a.b.a((ImageView)paramString.view, this.gvB);
    if (paramContext.field_verifyFlag != 0) {
      if (ak.a.gmZ != null)
      {
        String str = ak.a.gmZ.fs(paramContext.field_verifyFlag);
        if (str != null) {
          paramString.d(m.iX(str), MaskLayout.a.wgw);
        }
      }
    }
    for (;;)
    {
      ((TextView)findViewById(R.h.bwU)).setText(paramContext.vj());
      GMTrace.o(1841601445888L, 13721);
      return;
      paramString.caz();
      continue;
      paramString.caz();
      continue;
      paramString.caz();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */